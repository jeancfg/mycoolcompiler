all: build

build:
	java -cp ./antlrworks-1.3.jar org.antlr.Tool -fo src ./src/COOLTreeBuilder.g
	java -cp ./antlrworks-1.3.jar org.antlr.Tool -fo src ./src/COOLTreeChecker.g
	rm -rf bin
	mkdir -p bin
	javac -cp ./antlrworks-1.3.jar:./java-cup-11a-runtime.jar:. ./src/*.java -d ./bin/

clean:
	rm -rf bin
