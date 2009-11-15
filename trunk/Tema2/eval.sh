#!/bin/bash

JCUP_JAR="java-cup-11a.runtime.jar"
TESTS_DIR="_tests"

export CLASSPATH="$CLASSPATH:$JCUP_JAR:bin/"

PARSER="java COOLParser"
BONUS_PARSER="java COOLParserPreproc"

function fail {
	printf "FAIL (%s)\n" "$1"
}

function pass {
	printf "PASS\n"
}

function test_correct {
	printf "%-50s" "Testing file $1... "
	rm -f __stdout
	rm -f __stderr
	
	$PARSER $1 1>__stdout 2>__stderr
	
	STDERR=$(cat __stderr)
	
	if [ -n "$STDERR" ]; then
		fail "compilation errors"
		echo "-- First lines of stderr below --"
		cat __stderr | head -n 3
		echo "-----"
		echo
	else
		if [ -z "$(diff -q __stdout $2)" ]; then
			pass
		else
			fail "differences found"
			echo "-- First lines of the diff below --"
			diff -u __stdout "$2" | head -n 10
			echo "-----"
			echo
		fi
	fi
}

function test_error {
	printf "%-50s" "Testing file $1... "
	rm -f __stdout
	rm -f __stderr
	
	$PARSER $1 1>__stdout 2>__stderr
	
	STDOUT=$(cat __stdout)
	
	if [ -n "$STDOUT" ]; then
		fail "AST output detected"
		echo "-- First lines of stdout --"
		cat __stdout | head -n 5
		echo "-----"
		echo
	else
		pass
		echo "-- Error list --"
		cat __stderr
		echo "-----"
		echo
	fi
}

function test_bonus {
	printf "%-50s" "Testing file $1... "
	rm -f __stdout
	rm -f __stderr
	
	$BONUS_PARSER $1 1>__stdout 2>__stderr
	
	if [ -z "$(diff -q $2 $3)" ]; then
		pass
	else
		fail "differences found"
		echo "-- First lines of the diff below --"
		diff -u "$2" "$3" | head -n 10
		echo "-----"
		echo
	fi
}

echo "******************************"
echo "**** Running simple tests ****"
echo "******************************"
echo 

for CL_SRC in $TESTS_DIR/simple/*.cl; do
	test_correct $CL_SRC ${CL_SRC/%cl/ast}
done

echo
echo


echo "********************************"
echo "**** Running advanced tests ****"
echo "********************************"
echo

for CL_SRC in $TESTS_DIR/advanced/*.cl; do
	test_correct $CL_SRC ${CL_SRC/%cl/ast}
done

echo
echo

echo "*******************************"
echo "**** Running complex tests ****"
echo "*******************************"
echo

for CL_SRC in $TESTS_DIR/complex/{graph,hairyscary,lam,life}.cl; do
	test_correct $CL_SRC ${CL_SRC/%cl/ast}
done

test_correct "$TESTS_DIR/complex/multifile-1.cl $TESTS_DIR/complex/multifile-2.cl" \
	$TESTS_DIR/complex/multifile.ast

echo
echo

echo "*****************************"
echo "**** Running error tests ****"
echo "*****************************"
echo

for CL_SRC in $TESTS_DIR/errors/*.cl; do
	test_error $CL_SRC
done

echo
echo

if [ -f "bin/COOLParserPreproc.class" ]; then
	echo "*****************************"
	echo "**** Running bonus tests ****"
	echo "*****************************"
	
	for CL_SRC in $TESTS_DIR/bonus/*.cl; do
		test_bonus $CL_SRC ${CL_SRC/%cl/e} ${CL_SRC/%cl/e.ref}
	done
else
	echo "** Bonus implementation not available. **"
fi

echo
echo
	
