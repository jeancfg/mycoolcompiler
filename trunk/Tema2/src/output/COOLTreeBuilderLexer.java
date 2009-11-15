// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g 2009-11-12 18:21:29

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class COOLTreeBuilderLexer extends Lexer {
    public static final int T__64=64;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int CLASS_T=4;
    public static final int TRUE_ST=26;
    public static final int LET_ST=40;
    public static final int CLASS_ST=19;
    public static final int MULTI_COMMENT=42;
    public static final int FI_ST=33;
    public static final int ID=22;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int LOOP_ST=35;
    public static final int IN_ST=41;
    public static final int TYPE=20;
    public static final int EXPR_T=11;
    public static final int T__55=55;
    public static final int NOT_ST=23;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int INTEGER_T=17;
    public static final int T__58=58;
    public static final int ESC_SEQ=44;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int ASSIGN_T=8;
    public static final int INHERITS_ST=21;
    public static final int SINGLE_COMMENT=43;
    public static final int ATTR_T=15;
    public static final int BLOCK_T=5;
    public static final int T__50=50;
    public static final int INTEGER=25;
    public static final int T__46=46;
    public static final int WHILE_ST=34;
    public static final int T__47=47;
    public static final int FEATURES_T=7;
    public static final int OF_ST=38;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int ELSE_ST=32;
    public static final int BOOL_T=10;
    public static final int METHOD_T=9;
    public static final int OP_T=18;
    public static final int POOL_ST=36;
    public static final int RETURN_TYPE_T=12;
    public static final int IF_ST=30;
    public static final int ISVOID_ST=24;
    public static final int ID_T=16;
    public static final int CASE_ST=37;
    public static final int ESAC_ST=39;
    public static final int WS=45;
    public static final int NEW_ST=29;
    public static final int FALSE_ST=27;
    public static final int CALL_T=6;
    public static final int TYPE_ID=13;
    public static final int FORMALS_T=14;
    public static final int STRING=28;
    public static final int THEN_ST=31;

    // delegates
    // delegators

    public COOLTreeBuilderLexer() {;} 
    public COOLTreeBuilderLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public COOLTreeBuilderLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g"; }

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:3:7: ( ';' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:3:9: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:4:7: ( '{' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:4:9: '{'
            {
            match('{'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:5:7: ( '}' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:5:9: '}'
            {
            match('}'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:6:7: ( '(' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:6:9: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:7:7: ( ',' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:7:9: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:8:7: ( ')' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:8:9: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:9:7: ( ':' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:9:9: ':'
            {
            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:10:7: ( '<-' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:10:9: '<-'
            {
            match("<-"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:11:7: ( '<=' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:11:9: '<='
            {
            match("<="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:12:7: ( '<' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:12:9: '<'
            {
            match('<'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:13:7: ( '=' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:13:9: '='
            {
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:14:7: ( '+' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:14:9: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:15:7: ( '-' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:15:9: '-'
            {
            match('-'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:16:7: ( '*' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:16:9: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:17:7: ( '/' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:17:9: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:18:7: ( '~' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:18:9: '~'
            {
            match('~'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:19:7: ( '@' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:19:9: '@'
            {
            match('@'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:20:7: ( '.' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:20:9: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:21:7: ( '=>' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:21:9: '=>'
            {
            match("=>"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "MULTI_COMMENT"
    public final void mMULTI_COMMENT() throws RecognitionException {
        try {
            int _type = MULTI_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:155:2: ( '(*' (~ ( '(' | '*' ) | ( '(' ~ '*' )=> '(' | ( '*' ~ ')' )=> '*' | MULTI_COMMENT )* '*)' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:155:4: '(*' (~ ( '(' | '*' ) | ( '(' ~ '*' )=> '(' | ( '*' ~ ')' )=> '*' | MULTI_COMMENT )* '*)'
            {
            match("(*"); if (state.failed) return ;

            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:156:3: (~ ( '(' | '*' ) | ( '(' ~ '*' )=> '(' | ( '*' ~ ')' )=> '*' | MULTI_COMMENT )*
            loop1:
            do {
                int alt1=5;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:156:5: ~ ( '(' | '*' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\'')||input.LA(1)==')'||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:157:6: ( '(' ~ '*' )=> '('
            	    {
            	    match('('); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:158:6: ( '*' ~ ')' )=> '*'
            	    {
            	    match('*'); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:159:6: MULTI_COMMENT
            	    {
            	    mMULTI_COMMENT(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*)"); if (state.failed) return ;

            if ( state.backtracking==0 ) {

                    _channel=HIDDEN;
                  
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTI_COMMENT"

    // $ANTLR start "SINGLE_COMMENT"
    public final void mSINGLE_COMMENT() throws RecognitionException {
        try {
            int _type = SINGLE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:168:2: ( '--' (~ '\\n' )* )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:168:4: '--' (~ '\\n' )*
            {
            match("--"); if (state.failed) return ;

            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:168:9: (~ '\\n' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:168:10: ~ '\\n'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
              _channel=HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SINGLE_COMMENT"

    // $ANTLR start "CLASS_ST"
    public final void mCLASS_ST() throws RecognitionException {
        try {
            int _type = CLASS_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:173:2: ( ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:174:2: ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS_ST"

    // $ANTLR start "INHERITS_ST"
    public final void mINHERITS_ST() throws RecognitionException {
        try {
            int _type = INHERITS_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:178:2: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'S' | 's' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:179:2: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INHERITS_ST"

    // $ANTLR start "LET_ST"
    public final void mLET_ST() throws RecognitionException {
        try {
            int _type = LET_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:183:2: ( ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:184:2: ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LET_ST"

    // $ANTLR start "IN_ST"
    public final void mIN_ST() throws RecognitionException {
        try {
            int _type = IN_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:188:2: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:189:2: ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN_ST"

    // $ANTLR start "WHILE_ST"
    public final void mWHILE_ST() throws RecognitionException {
        try {
            int _type = WHILE_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:193:2: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:194:2: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE_ST"

    // $ANTLR start "LOOP_ST"
    public final void mLOOP_ST() throws RecognitionException {
        try {
            int _type = LOOP_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:198:2: ( ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'P' | 'p' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:199:2: ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOOP_ST"

    // $ANTLR start "POOL_ST"
    public final void mPOOL_ST() throws RecognitionException {
        try {
            int _type = POOL_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:203:2: ( ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'L' | 'l' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:204:2: ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POOL_ST"

    // $ANTLR start "CASE_ST"
    public final void mCASE_ST() throws RecognitionException {
        try {
            int _type = CASE_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:208:2: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:209:2: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASE_ST"

    // $ANTLR start "OF_ST"
    public final void mOF_ST() throws RecognitionException {
        try {
            int _type = OF_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:213:2: ( ( 'O' | 'o' ) ( 'F' | 'f' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:214:2: ( 'O' | 'o' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OF_ST"

    // $ANTLR start "ESAC_ST"
    public final void mESAC_ST() throws RecognitionException {
        try {
            int _type = ESAC_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:218:2: ( ( 'E' | 'e' ) ( 'S' | 's' ) ( 'A' | 'a' ) ( 'C' | 'c' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:219:2: ( 'E' | 'e' ) ( 'S' | 's' ) ( 'A' | 'a' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ESAC_ST"

    // $ANTLR start "TRUE_ST"
    public final void mTRUE_ST() throws RecognitionException {
        try {
            int _type = TRUE_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:223:2: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:224:2: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE_ST"

    // $ANTLR start "FALSE_ST"
    public final void mFALSE_ST() throws RecognitionException {
        try {
            int _type = FALSE_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:228:2: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:229:2: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE_ST"

    // $ANTLR start "ISVOID_ST"
    public final void mISVOID_ST() throws RecognitionException {
        try {
            int _type = ISVOID_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:233:2: ( ( 'I' | 'i' ) ( 'S' | 's' ) ( 'V' | 'v' ) ( 'O' | 'o' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:234:2: ( 'I' | 'i' ) ( 'S' | 's' ) ( 'V' | 'v' ) ( 'O' | 'o' ) ( 'I' | 'i' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISVOID_ST"

    // $ANTLR start "NEW_ST"
    public final void mNEW_ST() throws RecognitionException {
        try {
            int _type = NEW_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:238:2: ( ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'W' | 'w' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:239:2: ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'W' | 'w' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEW_ST"

    // $ANTLR start "IF_ST"
    public final void mIF_ST() throws RecognitionException {
        try {
            int _type = IF_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:243:2: ( ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:244:2: ( 'I' | 'i' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF_ST"

    // $ANTLR start "THEN_ST"
    public final void mTHEN_ST() throws RecognitionException {
        try {
            int _type = THEN_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:248:2: ( ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:249:2: ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN_ST"

    // $ANTLR start "ELSE_ST"
    public final void mELSE_ST() throws RecognitionException {
        try {
            int _type = ELSE_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:253:2: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:254:2: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE_ST"

    // $ANTLR start "FI_ST"
    public final void mFI_ST() throws RecognitionException {
        try {
            int _type = FI_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:258:2: ( ( 'F' | 'f' ) ( 'I' | 'i' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:259:2: ( 'F' | 'f' ) ( 'I' | 'i' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FI_ST"

    // $ANTLR start "NOT_ST"
    public final void mNOT_ST() throws RecognitionException {
        try {
            int _type = NOT_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:263:2: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:264:2: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_ST"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:268:2: ( ( ( 'A' .. 'Z' ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | '1' .. '9' )* ) | 'SELF_TYPE' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='S') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='E') ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3=='L') ) {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4=='F') ) {
                            int LA4_5 = input.LA(5);

                            if ( (LA4_5=='_') ) {
                                alt4=2;
                            }
                            else {
                                alt4=1;}
                        }
                        else {
                            alt4=1;}
                    }
                    else {
                        alt4=1;}
                }
                else {
                    alt4=1;}
            }
            else if ( ((LA4_0>='A' && LA4_0<='R')||(LA4_0>='T' && LA4_0<='Z')) ) {
                alt4=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:269:2: ( ( 'A' .. 'Z' ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | '1' .. '9' )* )
                    {
                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:269:2: ( ( 'A' .. 'Z' ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | '1' .. '9' )* )
                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:269:3: ( 'A' .. 'Z' ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | '1' .. '9' )*
                    {
                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:269:3: ( 'A' .. 'Z' )
                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:269:4: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); if (state.failed) return ;

                    }

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:270:2: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | '1' .. '9' )*
                    loop3:
                    do {
                        int alt3=4;
                        switch ( input.LA(1) ) {
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt3=1;
                            }
                            break;
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                            {
                            alt3=2;
                            }
                            break;
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt3=3;
                            }
                            break;

                        }

                        switch (alt3) {
                    	case 1 :
                    	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:270:3: ( 'a' .. 'z' )
                    	    {
                    	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:270:3: ( 'a' .. 'z' )
                    	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:270:4: 'a' .. 'z'
                    	    {
                    	    matchRange('a','z'); if (state.failed) return ;

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:270:16: ( 'A' .. 'Z' )
                    	    {
                    	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:270:16: ( 'A' .. 'Z' )
                    	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:270:17: 'A' .. 'Z'
                    	    {
                    	    matchRange('A','Z'); if (state.failed) return ;

                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:270:29: '1' .. '9'
                    	    {
                    	    matchRange('1','9'); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:272:2: 'SELF_TYPE'
                    {
                    match("SELF_TYPE"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:276:3: ( ( '0' .. '9' )+ )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:277:3: ( '0' .. '9' )+
            {
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:277:3: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:277:4: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:281:2: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | '_' | ( '1' .. '9' ) )+ )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:282:2: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | '_' | ( '1' .. '9' ) )+
            {
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:282:2: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | '_' | ( '1' .. '9' ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=5;
                switch ( input.LA(1) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt6=1;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt6=2;
                    }
                    break;
                case '_':
                    {
                    alt6=3;
                    }
                    break;
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt6=4;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:282:3: ( 'a' .. 'z' )
            	    {
            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:282:3: ( 'a' .. 'z' )
            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:282:4: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); if (state.failed) return ;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:283:4: ( 'A' .. 'Z' )
            	    {
            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:283:4: ( 'A' .. 'Z' )
            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:283:5: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); if (state.failed) return ;

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:284:4: '_'
            	    {
            	    match('_'); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:285:4: ( '1' .. '9' )
            	    {
            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:285:4: ( '1' .. '9' )
            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:285:5: '1' .. '9'
            	    {
            	    matchRange('1','9'); if (state.failed) return ;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:290:5: ( '\\\"' ( ( ESC_SEQ )=> ESC_SEQ | ~ ( '\\\\\\n' | '\\\"' ) )* '\\\"' )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:291:5: '\\\"' ( ( ESC_SEQ )=> ESC_SEQ | ~ ( '\\\\\\n' | '\\\"' ) )* '\\\"'
            {
            match('\"'); if (state.failed) return ;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:292:5: ( ( ESC_SEQ )=> ESC_SEQ | ~ ( '\\\\\\n' | '\\\"' ) )*
            loop7:
            do {
                int alt7=3;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:293:7: ( ESC_SEQ )=> ESC_SEQ
            	    {
            	    mESC_SEQ(); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:295:7: ~ ( '\\\\\\n' | '\\\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match('\"'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:301:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:301:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); if (state.failed) return ;
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:305:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:306:3: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( state.backtracking==0 ) {
              _channel=HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:8: ( T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | MULTI_COMMENT | SINGLE_COMMENT | CLASS_ST | INHERITS_ST | LET_ST | IN_ST | WHILE_ST | LOOP_ST | POOL_ST | CASE_ST | OF_ST | ESAC_ST | TRUE_ST | FALSE_ST | ISVOID_ST | NEW_ST | IF_ST | THEN_ST | ELSE_ST | FI_ST | NOT_ST | TYPE | INTEGER | ID | STRING | WS )
        int alt8=45;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:10: T__46
                {
                mT__46(); if (state.failed) return ;

                }
                break;
            case 2 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:16: T__47
                {
                mT__47(); if (state.failed) return ;

                }
                break;
            case 3 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:22: T__48
                {
                mT__48(); if (state.failed) return ;

                }
                break;
            case 4 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:28: T__49
                {
                mT__49(); if (state.failed) return ;

                }
                break;
            case 5 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:34: T__50
                {
                mT__50(); if (state.failed) return ;

                }
                break;
            case 6 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:40: T__51
                {
                mT__51(); if (state.failed) return ;

                }
                break;
            case 7 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:46: T__52
                {
                mT__52(); if (state.failed) return ;

                }
                break;
            case 8 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:52: T__53
                {
                mT__53(); if (state.failed) return ;

                }
                break;
            case 9 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:58: T__54
                {
                mT__54(); if (state.failed) return ;

                }
                break;
            case 10 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:64: T__55
                {
                mT__55(); if (state.failed) return ;

                }
                break;
            case 11 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:70: T__56
                {
                mT__56(); if (state.failed) return ;

                }
                break;
            case 12 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:76: T__57
                {
                mT__57(); if (state.failed) return ;

                }
                break;
            case 13 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:82: T__58
                {
                mT__58(); if (state.failed) return ;

                }
                break;
            case 14 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:88: T__59
                {
                mT__59(); if (state.failed) return ;

                }
                break;
            case 15 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:94: T__60
                {
                mT__60(); if (state.failed) return ;

                }
                break;
            case 16 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:100: T__61
                {
                mT__61(); if (state.failed) return ;

                }
                break;
            case 17 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:106: T__62
                {
                mT__62(); if (state.failed) return ;

                }
                break;
            case 18 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:112: T__63
                {
                mT__63(); if (state.failed) return ;

                }
                break;
            case 19 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:118: T__64
                {
                mT__64(); if (state.failed) return ;

                }
                break;
            case 20 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:124: MULTI_COMMENT
                {
                mMULTI_COMMENT(); if (state.failed) return ;

                }
                break;
            case 21 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:138: SINGLE_COMMENT
                {
                mSINGLE_COMMENT(); if (state.failed) return ;

                }
                break;
            case 22 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:153: CLASS_ST
                {
                mCLASS_ST(); if (state.failed) return ;

                }
                break;
            case 23 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:162: INHERITS_ST
                {
                mINHERITS_ST(); if (state.failed) return ;

                }
                break;
            case 24 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:174: LET_ST
                {
                mLET_ST(); if (state.failed) return ;

                }
                break;
            case 25 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:181: IN_ST
                {
                mIN_ST(); if (state.failed) return ;

                }
                break;
            case 26 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:187: WHILE_ST
                {
                mWHILE_ST(); if (state.failed) return ;

                }
                break;
            case 27 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:196: LOOP_ST
                {
                mLOOP_ST(); if (state.failed) return ;

                }
                break;
            case 28 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:204: POOL_ST
                {
                mPOOL_ST(); if (state.failed) return ;

                }
                break;
            case 29 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:212: CASE_ST
                {
                mCASE_ST(); if (state.failed) return ;

                }
                break;
            case 30 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:220: OF_ST
                {
                mOF_ST(); if (state.failed) return ;

                }
                break;
            case 31 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:226: ESAC_ST
                {
                mESAC_ST(); if (state.failed) return ;

                }
                break;
            case 32 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:234: TRUE_ST
                {
                mTRUE_ST(); if (state.failed) return ;

                }
                break;
            case 33 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:242: FALSE_ST
                {
                mFALSE_ST(); if (state.failed) return ;

                }
                break;
            case 34 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:251: ISVOID_ST
                {
                mISVOID_ST(); if (state.failed) return ;

                }
                break;
            case 35 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:261: NEW_ST
                {
                mNEW_ST(); if (state.failed) return ;

                }
                break;
            case 36 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:268: IF_ST
                {
                mIF_ST(); if (state.failed) return ;

                }
                break;
            case 37 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:274: THEN_ST
                {
                mTHEN_ST(); if (state.failed) return ;

                }
                break;
            case 38 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:282: ELSE_ST
                {
                mELSE_ST(); if (state.failed) return ;

                }
                break;
            case 39 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:290: FI_ST
                {
                mFI_ST(); if (state.failed) return ;

                }
                break;
            case 40 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:296: NOT_ST
                {
                mNOT_ST(); if (state.failed) return ;

                }
                break;
            case 41 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:303: TYPE
                {
                mTYPE(); if (state.failed) return ;

                }
                break;
            case 42 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:308: INTEGER
                {
                mINTEGER(); if (state.failed) return ;

                }
                break;
            case 43 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:316: ID
                {
                mID(); if (state.failed) return ;

                }
                break;
            case 44 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:319: STRING
                {
                mSTRING(); if (state.failed) return ;

                }
                break;
            case 45 :
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:1:326: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_COOLTreeBuilder
    public final void synpred1_COOLTreeBuilder_fragment() throws RecognitionException {   
        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:157:6: ( '(' ~ '*' )
        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:157:7: '(' ~ '*'
        {
        match('('); if (state.failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
            input.consume();
        state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            recover(mse);
            throw mse;}


        }
    }
    // $ANTLR end synpred1_COOLTreeBuilder

    // $ANTLR start synpred2_COOLTreeBuilder
    public final void synpred2_COOLTreeBuilder_fragment() throws RecognitionException {   
        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:158:6: ( '*' ~ ')' )
        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:158:7: '*' ~ ')'
        {
        match('*'); if (state.failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<='(')||(input.LA(1)>='*' && input.LA(1)<='\uFFFF') ) {
            input.consume();
        state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            recover(mse);
            throw mse;}


        }
    }
    // $ANTLR end synpred2_COOLTreeBuilder

    // $ANTLR start synpred3_COOLTreeBuilder
    public final void synpred3_COOLTreeBuilder_fragment() throws RecognitionException {   
        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:293:7: ( ESC_SEQ )
        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:293:8: ESC_SEQ
        {
        mESC_SEQ(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_COOLTreeBuilder

    public final boolean synpred1_COOLTreeBuilder() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_COOLTreeBuilder_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_COOLTreeBuilder() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_COOLTreeBuilder_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_COOLTreeBuilder() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_COOLTreeBuilder_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA1_eotS =
        "\4\uffff\1\13\10\uffff";
    static final String DFA1_eofS =
        "\15\uffff";
    static final String DFA1_minS =
        "\2\0\1\uffff\2\0\3\uffff\1\0\4\uffff";
    static final String DFA1_maxS =
        "\2\uffff\1\uffff\2\uffff\3\uffff\1\0\4\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\1\2\uffff\3\3\1\uffff\2\2\1\5\1\4";
    static final String DFA1_specialS =
        "\1\4\1\2\1\uffff\1\0\1\1\3\uffff\1\3\4\uffff}>";
    static final String[] DFA1_transitionS = {
            "\50\2\1\3\1\2\1\1\uffd5\2",
            "\50\6\1\7\1\4\1\5\uffd5\6",
            "",
            "\50\11\1\12\1\11\1\10\uffd5\11",
            "\50\6\1\7\1\6\1\5\uffd5\6",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 156:3: (~ ( '(' | '*' ) | ( '(' ~ '*' )=> '(' | ( '*' ~ ')' )=> '*' | MULTI_COMMENT )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_3=='*') ) {s = 8;}

                        else if ( ((LA1_3>='\u0000' && LA1_3<='\'')||LA1_3==')'||(LA1_3>='+' && LA1_3<='\uFFFF')) && (synpred1_COOLTreeBuilder())) {s = 9;}

                        else if ( (LA1_3=='(') && (synpred1_COOLTreeBuilder())) {s = 10;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_4=='*') && (synpred2_COOLTreeBuilder())) {s = 5;}

                        else if ( ((LA1_4>='\u0000' && LA1_4<='\'')||LA1_4==')'||(LA1_4>='+' && LA1_4<='\uFFFF')) && (synpred2_COOLTreeBuilder())) {s = 6;}

                        else if ( (LA1_4=='(') && (synpred2_COOLTreeBuilder())) {s = 7;}

                        else s = 11;

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_1==')') ) {s = 4;}

                        else if ( (LA1_1=='*') && (synpred2_COOLTreeBuilder())) {s = 5;}

                        else if ( ((LA1_1>='\u0000' && LA1_1<='\'')||(LA1_1>='+' && LA1_1<='\uFFFF')) && (synpred2_COOLTreeBuilder())) {s = 6;}

                        else if ( (LA1_1=='(') && (synpred2_COOLTreeBuilder())) {s = 7;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_COOLTreeBuilder()) ) {s = 10;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_0 = input.LA(1);

                        s = -1;
                        if ( (LA1_0=='*') ) {s = 1;}

                        else if ( ((LA1_0>='\u0000' && LA1_0<='\'')||LA1_0==')'||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {s = 2;}

                        else if ( (LA1_0=='(') ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA7_eotS =
        "\4\uffff\1\3\5\uffff";
    static final String DFA7_eofS =
        "\12\uffff";
    static final String DFA7_minS =
        "\1\0\1\uffff\1\0\1\uffff\3\0\3\uffff";
    static final String DFA7_maxS =
        "\1\uffff\1\uffff\1\uffff\1\uffff\1\uffff\2\0\3\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\3\1\uffff\1\2\3\uffff\3\1";
    static final String DFA7_specialS =
        "\1\1\1\uffff\1\4\1\uffff\1\0\1\2\1\3\3\uffff}>";
    static final String[] DFA7_transitionS = {
            "\42\3\1\1\71\3\1\2\uffa3\3",
            "",
            "\42\3\1\4\4\3\1\6\64\3\1\5\5\3\1\6\3\3\1\6\7\3\1\6\3\3\1\6"+
            "\1\3\1\6\uff8b\3",
            "",
            "\42\11\1\7\71\11\1\10\uffa3\11",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 292:5: ( ( ESC_SEQ )=> ESC_SEQ | ~ ( '\\\\\\n' | '\\\"' ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_4 = input.LA(1);

                         
                        int index7_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_4=='\"') && (synpred3_COOLTreeBuilder())) {s = 7;}

                        else if ( (LA7_4=='\\') && (synpred3_COOLTreeBuilder())) {s = 8;}

                        else if ( ((LA7_4>='\u0000' && LA7_4<='!')||(LA7_4>='#' && LA7_4<='[')||(LA7_4>=']' && LA7_4<='\uFFFF')) && (synpred3_COOLTreeBuilder())) {s = 9;}

                        else s = 3;

                         
                        input.seek(index7_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_0 = input.LA(1);

                        s = -1;
                        if ( (LA7_0=='\"') ) {s = 1;}

                        else if ( (LA7_0=='\\') ) {s = 2;}

                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_COOLTreeBuilder()) ) {s = 9;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_6 = input.LA(1);

                         
                        int index7_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_COOLTreeBuilder()) ) {s = 9;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index7_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_2 = input.LA(1);

                        s = -1;
                        if ( (LA7_2=='\"') ) {s = 4;}

                        else if ( (LA7_2=='\\') ) {s = 5;}

                        else if ( (LA7_2=='\''||LA7_2=='b'||LA7_2=='f'||LA7_2=='n'||LA7_2=='r'||LA7_2=='t') ) {s = 6;}

                        else if ( ((LA7_2>='\u0000' && LA7_2<='!')||(LA7_2>='#' && LA7_2<='&')||(LA7_2>='(' && LA7_2<='[')||(LA7_2>=']' && LA7_2<='a')||(LA7_2>='c' && LA7_2<='e')||(LA7_2>='g' && LA7_2<='m')||(LA7_2>='o' && LA7_2<='q')||LA7_2=='s'||(LA7_2>='u' && LA7_2<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA8_eotS =
        "\4\uffff\1\55\3\uffff\1\60\1\62\1\uffff\1\64\5\uffff\12\74\12\50"+
        "\2\74\1\51\15\uffff\7\74\1\uffff\1\u0087\1\74\1\u008b\1\u0087\1"+
        "\74\1\u008b\10\74\2\u0094\11\74\1\u009f\1\74\1\u009f\4\74\4\50\1"+
        "\u0087\1\50\1\u008b\1\u0087\1\50\1\u008b\10\50\2\u0094\11\50\1\u009f"+
        "\1\50\1\u009f\4\50\6\74\1\uffff\3\74\1\uffff\2\u00cb\6\74\1\uffff"+
        "\12\74\1\uffff\2\u00dc\2\u00dd\10\50\2\u00cb\20\50\2\u00dc\2\u00dd"+
        "\3\74\2\u00f9\4\74\1\uffff\2\u00fe\2\74\2\u0101\2\u0102\2\u0103"+
        "\2\u0104\2\u0105\2\74\2\uffff\2\50\2\u00f9\4\50\2\u00fe\2\50\2\u0101"+
        "\2\u0102\2\u0103\2\u0104\2\u0105\2\50\1\74\2\u0113\1\uffff\4\74"+
        "\1\uffff\2\u0118\5\uffff\2\u0119\2\u0113\4\50\2\u0118\2\u0119\1"+
        "\50\1\uffff\2\74\2\u0121\2\uffff\2\50\2\u0121\1\50\2\74\1\uffff"+
        "\3\50\4\u012a\1\50\1\uffff\1\74";
    static final String DFA8_eofS =
        "\u012c\uffff";
    static final String DFA8_minS =
        "\1\11\3\uffff\1\52\3\uffff\1\55\1\76\1\uffff\1\55\5\uffff\12\61"+
        "\1\101\1\106\1\105\1\110\1\117\1\106\1\114\1\110\1\101\1\105\3\61"+
        "\15\uffff\7\61\1\uffff\40\61\1\101\1\123\1\101\1\123\1\61\1\126"+
        "\2\61\1\126\1\61\1\124\1\117\1\124\1\117\2\111\2\117\2\61\1\101"+
        "\1\123\1\101\1\123\1\125\1\105\1\125\1\105\1\114\1\61\1\114\1\61"+
        "\1\127\1\124\1\127\1\124\6\61\1\uffff\3\61\1\uffff\10\61\1\uffff"+
        "\12\61\1\uffff\4\61\2\123\4\105\2\117\2\61\2\120\4\114\2\103\4\105"+
        "\2\116\2\123\15\61\1\uffff\20\61\2\uffff\2\123\2\61\2\122\2\111"+
        "\2\61\2\105\12\61\2\105\3\61\1\uffff\4\61\1\uffff\2\61\5\uffff\4"+
        "\61\2\111\2\104\4\61\1\124\1\uffff\4\61\2\uffff\2\124\2\61\1\131"+
        "\2\61\1\uffff\2\123\1\120\4\61\1\105\1\uffff\1\61";
    static final String DFA8_maxS =
        "\1\176\3\uffff\1\52\3\uffff\1\75\1\76\1\uffff\1\55\5\uffff\12\172"+
        "\1\154\1\163\1\157\1\150\1\157\1\146\1\163\1\162\1\151\1\157\3\172"+
        "\15\uffff\7\172\1\uffff\40\172\1\141\1\163\1\141\1\163\1\172\1\166"+
        "\2\172\1\166\1\172\1\164\1\157\1\164\1\157\2\151\2\157\2\172\1\141"+
        "\1\163\1\141\1\163\1\165\1\145\1\165\1\145\1\154\1\172\1\154\1\172"+
        "\1\167\1\164\1\167\1\164\6\172\1\uffff\3\172\1\uffff\10\172\1\uffff"+
        "\12\172\1\uffff\4\172\2\163\4\145\2\157\2\172\2\160\4\154\2\143"+
        "\4\145\2\156\2\163\15\172\1\uffff\20\172\2\uffff\2\163\2\172\2\162"+
        "\2\151\2\172\2\145\12\172\2\145\3\172\1\uffff\4\172\1\uffff\2\172"+
        "\5\uffff\4\172\2\151\2\144\4\172\1\124\1\uffff\4\172\2\uffff\2\164"+
        "\2\172\1\131\2\172\1\uffff\2\163\1\120\4\172\1\105\1\uffff\1\172";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\1\7\2\uffff\1\14\1\uffff\1"+
        "\16\1\17\1\20\1\21\1\22\27\uffff\1\53\1\52\1\54\1\55\1\24\1\4\1"+
        "\10\1\11\1\12\1\23\1\13\1\25\1\15\7\uffff\1\51\112\uffff\1\31\3"+
        "\uffff\1\44\10\uffff\1\36\12\uffff\1\47\53\uffff\1\30\20\uffff\1"+
        "\43\1\50\33\uffff\1\35\4\uffff\1\33\2\uffff\1\34\1\37\1\46\1\40"+
        "\1\45\15\uffff\1\26\4\uffff\1\32\1\41\7\uffff\1\42\10\uffff\1\27"+
        "\1\uffff";
    static final String DFA8_specialS =
        "\u012c\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\53\2\uffff\1\53\22\uffff\1\53\1\uffff\1\52\5\uffff\1\4\1"+
            "\6\1\14\1\12\1\5\1\13\1\20\1\15\1\51\11\47\1\7\1\1\1\10\1\11"+
            "\2\uffff\1\17\2\46\1\21\1\46\1\27\1\31\2\46\1\22\2\46\1\23\1"+
            "\46\1\32\1\26\1\25\2\46\1\45\1\30\2\46\1\24\3\46\4\uffff\1\50"+
            "\1\uffff\2\50\1\33\1\50\1\41\1\43\2\50\1\34\2\50\1\35\1\50\1"+
            "\44\1\40\1\37\3\50\1\42\2\50\1\36\3\50\1\2\1\uffff\1\3\1\16",
            "",
            "",
            "",
            "\1\54",
            "",
            "",
            "",
            "\1\56\17\uffff\1\57",
            "\1\61",
            "",
            "\1\63",
            "",
            "",
            "",
            "",
            "",
            "\11\73\7\uffff\1\70\12\72\1\67\16\72\4\uffff\1\50\1\uffff\1"+
            "\66\12\71\1\65\16\71",
            "\11\73\7\uffff\5\72\1\102\7\72\1\100\4\72\1\101\7\72\4\uffff"+
            "\1\50\1\uffff\5\71\1\77\7\71\1\75\4\71\1\76\7\71",
            "\11\73\7\uffff\4\72\1\105\11\72\1\106\13\72\4\uffff\1\50\1"+
            "\uffff\4\71\1\103\11\71\1\104\13\71",
            "\11\73\7\uffff\7\72\1\110\22\72\4\uffff\1\50\1\uffff\7\71\1"+
            "\107\22\71",
            "\11\73\7\uffff\16\72\1\112\13\72\4\uffff\1\50\1\uffff\16\71"+
            "\1\111\13\71",
            "\11\73\7\uffff\5\72\1\114\24\72\4\uffff\1\50\1\uffff\5\71\1"+
            "\113\24\71",
            "\11\73\7\uffff\13\72\1\120\6\72\1\117\7\72\4\uffff\1\50\1\uffff"+
            "\13\71\1\116\6\71\1\115\7\71",
            "\11\73\7\uffff\7\72\1\124\11\72\1\123\10\72\4\uffff\1\50\1"+
            "\uffff\7\71\1\122\11\71\1\121\10\71",
            "\11\73\7\uffff\1\127\7\72\1\130\21\72\4\uffff\1\50\1\uffff"+
            "\1\125\7\71\1\126\21\71",
            "\11\73\7\uffff\4\72\1\133\11\72\1\134\13\72\4\uffff\1\50\1"+
            "\uffff\4\71\1\131\11\71\1\132\13\71",
            "\1\140\12\uffff\1\137\24\uffff\1\136\12\uffff\1\135",
            "\1\146\7\uffff\1\144\4\uffff\1\145\22\uffff\1\143\7\uffff\1"+
            "\141\4\uffff\1\142",
            "\1\151\11\uffff\1\152\25\uffff\1\147\11\uffff\1\150",
            "\1\154\37\uffff\1\153",
            "\1\156\37\uffff\1\155",
            "\1\160\37\uffff\1\157",
            "\1\164\6\uffff\1\163\30\uffff\1\162\6\uffff\1\161",
            "\1\170\11\uffff\1\167\25\uffff\1\166\11\uffff\1\165",
            "\1\173\7\uffff\1\174\27\uffff\1\171\7\uffff\1\172",
            "\1\177\11\uffff\1\u0080\25\uffff\1\175\11\uffff\1\176",
            "\11\73\7\uffff\4\72\1\u0081\25\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\47\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\11\73\7\uffff\1\u0083\31\72\4\uffff\1\50\1\uffff\1\u0082\31"+
            "\71",
            "\11\73\7\uffff\22\72\1\u0085\7\72\4\uffff\1\50\1\uffff\22\71"+
            "\1\u0084\7\71",
            "\11\73\7\uffff\1\u0083\31\72\4\uffff\1\50\1\uffff\1\u0082\31"+
            "\71",
            "\11\73\7\uffff\22\72\1\u0085\7\72\4\uffff\1\50\1\uffff\22\71"+
            "\1\u0084\7\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "",
            "\11\73\7\uffff\7\72\1\u0088\22\72\4\uffff\1\50\1\uffff\7\71"+
            "\1\u0086\22\71",
            "\11\73\7\uffff\25\72\1\u008a\4\72\4\uffff\1\50\1\uffff\25\71"+
            "\1\u0089\4\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\7\72\1\u0088\22\72\4\uffff\1\50\1\uffff\7\71"+
            "\1\u0086\22\71",
            "\11\73\7\uffff\25\72\1\u008a\4\72\4\uffff\1\50\1\uffff\25\71"+
            "\1\u0089\4\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\23\72\1\u008d\6\72\4\uffff\1\50\1\uffff\23\71"+
            "\1\u008c\6\71",
            "\11\73\7\uffff\16\72\1\u008f\13\72\4\uffff\1\50\1\uffff\16"+
            "\71\1\u008e\13\71",
            "\11\73\7\uffff\23\72\1\u008d\6\72\4\uffff\1\50\1\uffff\23\71"+
            "\1\u008c\6\71",
            "\11\73\7\uffff\16\72\1\u008f\13\72\4\uffff\1\50\1\uffff\16"+
            "\71\1\u008e\13\71",
            "\11\73\7\uffff\10\72\1\u0091\21\72\4\uffff\1\50\1\uffff\10"+
            "\71\1\u0090\21\71",
            "\11\73\7\uffff\10\72\1\u0091\21\72\4\uffff\1\50\1\uffff\10"+
            "\71\1\u0090\21\71",
            "\11\73\7\uffff\16\72\1\u0093\13\72\4\uffff\1\50\1\uffff\16"+
            "\71\1\u0092\13\71",
            "\11\73\7\uffff\16\72\1\u0093\13\72\4\uffff\1\50\1\uffff\16"+
            "\71\1\u0092\13\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\1\u0096\31\72\4\uffff\1\50\1\uffff\1\u0095\31"+
            "\71",
            "\11\73\7\uffff\22\72\1\u0098\7\72\4\uffff\1\50\1\uffff\22\71"+
            "\1\u0097\7\71",
            "\11\73\7\uffff\1\u0096\31\72\4\uffff\1\50\1\uffff\1\u0095\31"+
            "\71",
            "\11\73\7\uffff\22\72\1\u0098\7\72\4\uffff\1\50\1\uffff\22\71"+
            "\1\u0097\7\71",
            "\11\73\7\uffff\24\72\1\u009a\5\72\4\uffff\1\50\1\uffff\24\71"+
            "\1\u0099\5\71",
            "\11\73\7\uffff\4\72\1\u009c\25\72\4\uffff\1\50\1\uffff\4\71"+
            "\1\u009b\25\71",
            "\11\73\7\uffff\24\72\1\u009a\5\72\4\uffff\1\50\1\uffff\24\71"+
            "\1\u0099\5\71",
            "\11\73\7\uffff\4\72\1\u009c\25\72\4\uffff\1\50\1\uffff\4\71"+
            "\1\u009b\25\71",
            "\11\73\7\uffff\13\72\1\u009e\16\72\4\uffff\1\50\1\uffff\13"+
            "\71\1\u009d\16\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\13\72\1\u009e\16\72\4\uffff\1\50\1\uffff\13"+
            "\71\1\u009d\16\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\26\72\1\u00a1\3\72\4\uffff\1\50\1\uffff\26\71"+
            "\1\u00a0\3\71",
            "\11\73\7\uffff\23\72\1\u00a3\6\72\4\uffff\1\50\1\uffff\23\71"+
            "\1\u00a2\6\71",
            "\11\73\7\uffff\26\72\1\u00a1\3\72\4\uffff\1\50\1\uffff\26\71"+
            "\1\u00a0\3\71",
            "\11\73\7\uffff\23\72\1\u00a3\6\72\4\uffff\1\50\1\uffff\23\71"+
            "\1\u00a2\6\71",
            "\1\u00a5\37\uffff\1\u00a4",
            "\1\u00a7\37\uffff\1\u00a6",
            "\1\u00a5\37\uffff\1\u00a4",
            "\1\u00a7\37\uffff\1\u00a6",
            "\11\50\7\uffff\7\50\1\u00a9\22\50\4\uffff\1\50\1\uffff\7\50"+
            "\1\u00a8\22\50",
            "\1\u00ab\37\uffff\1\u00aa",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\7\50\1\u00a9\22\50\4\uffff\1\50\1\uffff\7\50"+
            "\1\u00a8\22\50",
            "\1\u00ab\37\uffff\1\u00aa",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ad\37\uffff\1\u00ac",
            "\1\u00af\37\uffff\1\u00ae",
            "\1\u00ad\37\uffff\1\u00ac",
            "\1\u00af\37\uffff\1\u00ae",
            "\1\u00b1\37\uffff\1\u00b0",
            "\1\u00b1\37\uffff\1\u00b0",
            "\1\u00b3\37\uffff\1\u00b2",
            "\1\u00b3\37\uffff\1\u00b2",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b5\37\uffff\1\u00b4",
            "\1\u00b7\37\uffff\1\u00b6",
            "\1\u00b5\37\uffff\1\u00b4",
            "\1\u00b7\37\uffff\1\u00b6",
            "\1\u00b9\37\uffff\1\u00b8",
            "\1\u00bb\37\uffff\1\u00ba",
            "\1\u00b9\37\uffff\1\u00b8",
            "\1\u00bb\37\uffff\1\u00ba",
            "\1\u00bd\37\uffff\1\u00bc",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00bd\37\uffff\1\u00bc",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00bf\37\uffff\1\u00be",
            "\1\u00c1\37\uffff\1\u00c0",
            "\1\u00bf\37\uffff\1\u00be",
            "\1\u00c1\37\uffff\1\u00c0",
            "\11\73\7\uffff\13\72\1\u00c2\16\72\4\uffff\1\50\1\uffff\32"+
            "\71",
            "\11\73\7\uffff\22\72\1\u00c4\7\72\4\uffff\1\50\1\uffff\22\71"+
            "\1\u00c3\7\71",
            "\11\73\7\uffff\22\72\1\u00c4\7\72\4\uffff\1\50\1\uffff\22\71"+
            "\1\u00c3\7\71",
            "\11\73\7\uffff\4\72\1\u00c6\25\72\4\uffff\1\50\1\uffff\4\71"+
            "\1\u00c5\25\71",
            "\11\73\7\uffff\4\72\1\u00c6\25\72\4\uffff\1\50\1\uffff\4\71"+
            "\1\u00c5\25\71",
            "\11\73\7\uffff\4\72\1\u00c8\25\72\4\uffff\1\50\1\uffff\4\71"+
            "\1\u00c7\25\71",
            "",
            "\11\73\7\uffff\4\72\1\u00c8\25\72\4\uffff\1\50\1\uffff\4\71"+
            "\1\u00c7\25\71",
            "\11\73\7\uffff\16\72\1\u00ca\13\72\4\uffff\1\50\1\uffff\16"+
            "\71\1\u00c9\13\71",
            "\11\73\7\uffff\16\72\1\u00ca\13\72\4\uffff\1\50\1\uffff\16"+
            "\71\1\u00c9\13\71",
            "",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\17\72\1\u00cd\12\72\4\uffff\1\50\1\uffff\17"+
            "\71\1\u00cc\12\71",
            "\11\73\7\uffff\17\72\1\u00cd\12\72\4\uffff\1\50\1\uffff\17"+
            "\71\1\u00cc\12\71",
            "\11\73\7\uffff\13\72\1\u00cf\16\72\4\uffff\1\50\1\uffff\13"+
            "\71\1\u00ce\16\71",
            "\11\73\7\uffff\13\72\1\u00cf\16\72\4\uffff\1\50\1\uffff\13"+
            "\71\1\u00ce\16\71",
            "\11\73\7\uffff\13\72\1\u00d1\16\72\4\uffff\1\50\1\uffff\13"+
            "\71\1\u00d0\16\71",
            "\11\73\7\uffff\13\72\1\u00d1\16\72\4\uffff\1\50\1\uffff\13"+
            "\71\1\u00d0\16\71",
            "",
            "\11\73\7\uffff\2\72\1\u00d3\27\72\4\uffff\1\50\1\uffff\2\71"+
            "\1\u00d2\27\71",
            "\11\73\7\uffff\2\72\1\u00d3\27\72\4\uffff\1\50\1\uffff\2\71"+
            "\1\u00d2\27\71",
            "\11\73\7\uffff\4\72\1\u00d5\25\72\4\uffff\1\50\1\uffff\4\71"+
            "\1\u00d4\25\71",
            "\11\73\7\uffff\4\72\1\u00d5\25\72\4\uffff\1\50\1\uffff\4\71"+
            "\1\u00d4\25\71",
            "\11\73\7\uffff\4\72\1\u00d7\25\72\4\uffff\1\50\1\uffff\4\71"+
            "\1\u00d6\25\71",
            "\11\73\7\uffff\4\72\1\u00d7\25\72\4\uffff\1\50\1\uffff\4\71"+
            "\1\u00d6\25\71",
            "\11\73\7\uffff\15\72\1\u00d9\14\72\4\uffff\1\50\1\uffff\15"+
            "\71\1\u00d8\14\71",
            "\11\73\7\uffff\15\72\1\u00d9\14\72\4\uffff\1\50\1\uffff\15"+
            "\71\1\u00d8\14\71",
            "\11\73\7\uffff\22\72\1\u00db\7\72\4\uffff\1\50\1\uffff\22\71"+
            "\1\u00da\7\71",
            "\11\73\7\uffff\22\72\1\u00db\7\72\4\uffff\1\50\1\uffff\22\71"+
            "\1\u00da\7\71",
            "",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\1\u00df\37\uffff\1\u00de",
            "\1\u00df\37\uffff\1\u00de",
            "\1\u00e1\37\uffff\1\u00e0",
            "\1\u00e1\37\uffff\1\u00e0",
            "\1\u00e3\37\uffff\1\u00e2",
            "\1\u00e3\37\uffff\1\u00e2",
            "\1\u00e5\37\uffff\1\u00e4",
            "\1\u00e5\37\uffff\1\u00e4",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00e7\37\uffff\1\u00e6",
            "\1\u00e7\37\uffff\1\u00e6",
            "\1\u00e9\37\uffff\1\u00e8",
            "\1\u00e9\37\uffff\1\u00e8",
            "\1\u00eb\37\uffff\1\u00ea",
            "\1\u00eb\37\uffff\1\u00ea",
            "\1\u00ed\37\uffff\1\u00ec",
            "\1\u00ed\37\uffff\1\u00ec",
            "\1\u00ef\37\uffff\1\u00ee",
            "\1\u00ef\37\uffff\1\u00ee",
            "\1\u00f1\37\uffff\1\u00f0",
            "\1\u00f1\37\uffff\1\u00f0",
            "\1\u00f3\37\uffff\1\u00f2",
            "\1\u00f3\37\uffff\1\u00f2",
            "\1\u00f5\37\uffff\1\u00f4",
            "\1\u00f5\37\uffff\1\u00f4",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\73\7\uffff\5\72\1\u00f6\24\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\22\72\1\u00f8\7\72\4\uffff\1\50\1\uffff\22\71"+
            "\1\u00f7\7\71",
            "\11\73\7\uffff\22\72\1\u00f8\7\72\4\uffff\1\50\1\uffff\22\71"+
            "\1\u00f7\7\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\21\72\1\u00fb\10\72\4\uffff\1\50\1\uffff\21"+
            "\71\1\u00fa\10\71",
            "\11\73\7\uffff\21\72\1\u00fb\10\72\4\uffff\1\50\1\uffff\21"+
            "\71\1\u00fa\10\71",
            "\11\73\7\uffff\10\72\1\u00fd\21\72\4\uffff\1\50\1\uffff\10"+
            "\71\1\u00fc\21\71",
            "\11\73\7\uffff\10\72\1\u00fd\21\72\4\uffff\1\50\1\uffff\10"+
            "\71\1\u00fc\21\71",
            "",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\4\72\1\u0100\25\72\4\uffff\1\50\1\uffff\4\71"+
            "\1\u00ff\25\71",
            "\11\73\7\uffff\4\72\1\u0100\25\72\4\uffff\1\50\1\uffff\4\71"+
            "\1\u00ff\25\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\4\72\1\u0107\25\72\4\uffff\1\50\1\uffff\4\71"+
            "\1\u0106\25\71",
            "\11\73\7\uffff\4\72\1\u0107\25\72\4\uffff\1\50\1\uffff\4\71"+
            "\1\u0106\25\71",
            "",
            "",
            "\1\u0109\37\uffff\1\u0108",
            "\1\u0109\37\uffff\1\u0108",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u010b\37\uffff\1\u010a",
            "\1\u010b\37\uffff\1\u010a",
            "\1\u010d\37\uffff\1\u010c",
            "\1\u010d\37\uffff\1\u010c",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u010f\37\uffff\1\u010e",
            "\1\u010f\37\uffff\1\u010e",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0111\37\uffff\1\u0110",
            "\1\u0111\37\uffff\1\u0110",
            "\11\73\7\uffff\32\72\4\uffff\1\u0112\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "",
            "\11\73\7\uffff\10\72\1\u0115\21\72\4\uffff\1\50\1\uffff\10"+
            "\71\1\u0114\21\71",
            "\11\73\7\uffff\10\72\1\u0115\21\72\4\uffff\1\50\1\uffff\10"+
            "\71\1\u0114\21\71",
            "\11\73\7\uffff\3\72\1\u0117\26\72\4\uffff\1\50\1\uffff\3\71"+
            "\1\u0116\26\71",
            "\11\73\7\uffff\3\72\1\u0117\26\72\4\uffff\1\50\1\uffff\3\71"+
            "\1\u0116\26\71",
            "",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "",
            "",
            "",
            "",
            "",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u011b\37\uffff\1\u011a",
            "\1\u011b\37\uffff\1\u011a",
            "\1\u011d\37\uffff\1\u011c",
            "\1\u011d\37\uffff\1\u011c",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u011e",
            "",
            "\11\73\7\uffff\23\72\1\u0120\6\72\4\uffff\1\50\1\uffff\23\71"+
            "\1\u011f\6\71",
            "\11\73\7\uffff\23\72\1\u0120\6\72\4\uffff\1\50\1\uffff\23\71"+
            "\1\u011f\6\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "",
            "",
            "\1\u0123\37\uffff\1\u0122",
            "\1\u0123\37\uffff\1\u0122",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0124",
            "\11\73\7\uffff\22\72\1\u0126\7\72\4\uffff\1\50\1\uffff\22\71"+
            "\1\u0125\7\71",
            "\11\73\7\uffff\22\72\1\u0126\7\72\4\uffff\1\50\1\uffff\22\71"+
            "\1\u0125\7\71",
            "",
            "\1\u0128\37\uffff\1\u0127",
            "\1\u0128\37\uffff\1\u0127",
            "\1\u0129",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\73\7\uffff\32\72\4\uffff\1\50\1\uffff\32\71",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u012b",
            "",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | MULTI_COMMENT | SINGLE_COMMENT | CLASS_ST | INHERITS_ST | LET_ST | IN_ST | WHILE_ST | LOOP_ST | POOL_ST | CASE_ST | OF_ST | ESAC_ST | TRUE_ST | FALSE_ST | ISVOID_ST | NEW_ST | IF_ST | THEN_ST | ELSE_ST | FI_ST | NOT_ST | TYPE | INTEGER | ID | STRING | WS );";
        }
    }
 

}