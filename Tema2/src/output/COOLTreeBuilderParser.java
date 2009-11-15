// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g 2009-11-12 18:21:28

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class COOLTreeBuilderParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CLASS_T", "BLOCK_T", "CALL_T", "FEATURES_T", "ASSIGN_T", "METHOD_T", "BOOL_T", "EXPR_T", "RETURN_TYPE_T", "TYPE_ID", "FORMALS_T", "ATTR_T", "ID_T", "INTEGER_T", "OP_T", "CLASS_ST", "TYPE", "INHERITS_ST", "ID", "NOT_ST", "ISVOID_ST", "INTEGER", "TRUE_ST", "FALSE_ST", "STRING", "NEW_ST", "IF_ST", "THEN_ST", "ELSE_ST", "FI_ST", "WHILE_ST", "LOOP_ST", "POOL_ST", "CASE_ST", "OF_ST", "ESAC_ST", "LET_ST", "IN_ST", "MULTI_COMMENT", "SINGLE_COMMENT", "ESC_SEQ", "WS", "';'", "'{'", "'}'", "'('", "','", "')'", "':'", "'<-'", "'<='", "'<'", "'='", "'+'", "'-'", "'*'", "'/'", "'~'", "'@'", "'.'", "'=>'"
    };
    public static final int T__64=64;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int TRUE_ST=26;
    public static final int CLASS_T=4;
    public static final int LET_ST=40;
    public static final int CLASS_ST=19;
    public static final int MULTI_COMMENT=42;
    public static final int FI_ST=33;
    public static final int T__61=61;
    public static final int ID=22;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int IN_ST=41;
    public static final int LOOP_ST=35;
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
    public static final int METHOD_T=9;
    public static final int BOOL_T=10;
    public static final int POOL_ST=36;
    public static final int OP_T=18;
    public static final int RETURN_TYPE_T=12;
    public static final int IF_ST=30;
    public static final int ID_T=16;
    public static final int ISVOID_ST=24;
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

    public static final String[] ruleNames = new String[] {
        "invalidRule", "synpred3_COOLTreeBuilder", "synpred8_COOLTreeBuilder", 
        "synpred1_COOLTreeBuilder", "expr", "synpred9_COOLTreeBuilder", 
        "dispatchExprAux", "dispatchExpr", "multExpr", "isVoidExpr", "assignExpr", 
        "class_stat", "feature", "program", "notExpr", "synpred4_COOLTreeBuilder", 
        "relExpr", "tildaExpr", "synpred2_COOLTreeBuilder", "sumExpr", "synpred7_COOLTreeBuilder", 
        "synpred6_COOLTreeBuilder", "synpred5_COOLTreeBuilder", "atom", 
        "formal"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public COOLTreeBuilderParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public COOLTreeBuilderParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public COOLTreeBuilderParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return COOLTreeBuilderParser.tokenNames; }
    public String getGrammarFileName() { return "/home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g"; }




    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:31:1: program : ( class_stat ';' )+ -> ( ^( class_stat ) )+ ;
    public final COOLTreeBuilderParser.program_return program() throws RecognitionException {
        COOLTreeBuilderParser.program_return retval = new COOLTreeBuilderParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal2=null;
        COOLTreeBuilderParser.class_stat_return class_stat1 = null;


        CommonTree char_literal2_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleSubtreeStream stream_class_stat=new RewriteRuleSubtreeStream(adaptor,"rule class_stat");
        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 1);

        try {
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:32:2: ( ( class_stat ';' )+ -> ( ^( class_stat ) )+ )
            dbg.enterAlt(1);

            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:33:2: ( class_stat ';' )+
            {
            dbg.location(33,2);
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:33:2: ( class_stat ';' )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==CLASS_ST) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:33:3: class_stat ';'
            	    {
            	    dbg.location(33,3);
            	    pushFollow(FOLLOW_class_stat_in_program266);
            	    class_stat1=class_stat();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_class_stat.add(class_stat1.getTree());
            	    dbg.location(33,14);
            	    char_literal2=(Token)match(input,46,FOLLOW_46_in_program268); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_46.add(char_literal2);


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}



            // AST REWRITE
            // elements: class_stat
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 33:20: -> ( ^( class_stat ) )+
            {
                dbg.location(33,23);
                if ( !(stream_class_stat.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_class_stat.hasNext() ) {
                    dbg.location(33,23);
                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:33:23: ^( class_stat )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    dbg.location(33,25);
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_class_stat.nextNode(), root_1);

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_class_stat.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(34, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "program"

    public static class class_stat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_stat"
    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:36:1: class_stat : CLASS_ST name= TYPE ( INHERITS_ST baseClass= TYPE )? '{' ( feature ';' )* '}' -> ^( CLASS_T $name ( $baseClass)? ^( FEATURES_T ( feature )* ) ) ;
    public final COOLTreeBuilderParser.class_stat_return class_stat() throws RecognitionException {
        COOLTreeBuilderParser.class_stat_return retval = new COOLTreeBuilderParser.class_stat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token baseClass=null;
        Token CLASS_ST3=null;
        Token INHERITS_ST4=null;
        Token char_literal5=null;
        Token char_literal7=null;
        Token char_literal8=null;
        COOLTreeBuilderParser.feature_return feature6 = null;


        CommonTree name_tree=null;
        CommonTree baseClass_tree=null;
        CommonTree CLASS_ST3_tree=null;
        CommonTree INHERITS_ST4_tree=null;
        CommonTree char_literal5_tree=null;
        CommonTree char_literal7_tree=null;
        CommonTree char_literal8_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_INHERITS_ST=new RewriteRuleTokenStream(adaptor,"token INHERITS_ST");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_CLASS_ST=new RewriteRuleTokenStream(adaptor,"token CLASS_ST");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_feature=new RewriteRuleSubtreeStream(adaptor,"rule feature");
        try { dbg.enterRule(getGrammarFileName(), "class_stat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(36, 1);

        try {
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:37:2: ( CLASS_ST name= TYPE ( INHERITS_ST baseClass= TYPE )? '{' ( feature ';' )* '}' -> ^( CLASS_T $name ( $baseClass)? ^( FEATURES_T ( feature )* ) ) )
            dbg.enterAlt(1);

            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:38:2: CLASS_ST name= TYPE ( INHERITS_ST baseClass= TYPE )? '{' ( feature ';' )* '}'
            {
            dbg.location(38,2);
            CLASS_ST3=(Token)match(input,CLASS_ST,FOLLOW_CLASS_ST_in_class_stat290); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS_ST.add(CLASS_ST3);

            dbg.location(38,15);
            name=(Token)match(input,TYPE,FOLLOW_TYPE_in_class_stat294); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TYPE.add(name);

            dbg.location(38,21);
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:38:21: ( INHERITS_ST baseClass= TYPE )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==INHERITS_ST) ) {
                alt2=1;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:38:22: INHERITS_ST baseClass= TYPE
                    {
                    dbg.location(38,22);
                    INHERITS_ST4=(Token)match(input,INHERITS_ST,FOLLOW_INHERITS_ST_in_class_stat297); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INHERITS_ST.add(INHERITS_ST4);

                    dbg.location(38,43);
                    baseClass=(Token)match(input,TYPE,FOLLOW_TYPE_in_class_stat301); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPE.add(baseClass);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(38,51);
            char_literal5=(Token)match(input,47,FOLLOW_47_in_class_stat305); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(char_literal5);

            dbg.location(38,55);
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:38:55: ( feature ';' )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:38:56: feature ';'
            	    {
            	    dbg.location(38,56);
            	    pushFollow(FOLLOW_feature_in_class_stat308);
            	    feature6=feature();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_feature.add(feature6.getTree());
            	    dbg.location(38,64);
            	    char_literal7=(Token)match(input,46,FOLLOW_46_in_class_stat310); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_46.add(char_literal7);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(38,70);
            char_literal8=(Token)match(input,48,FOLLOW_48_in_class_stat314); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_48.add(char_literal8);



            // AST REWRITE
            // elements: feature, name, baseClass
            // token labels: baseClass, name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_baseClass=new RewriteRuleTokenStream(adaptor,"token baseClass",baseClass);
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 39:3: -> ^( CLASS_T $name ( $baseClass)? ^( FEATURES_T ( feature )* ) )
            {
                dbg.location(39,6);
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:39:6: ^( CLASS_T $name ( $baseClass)? ^( FEATURES_T ( feature )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(39,8);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLASS_T, "CLASS_T"), root_1);

                dbg.location(39,16);
                adaptor.addChild(root_1, stream_name.nextNode());
                dbg.location(39,22);
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:39:22: ( $baseClass)?
                if ( stream_baseClass.hasNext() ) {
                    dbg.location(39,22);
                    adaptor.addChild(root_1, stream_baseClass.nextNode());

                }
                stream_baseClass.reset();
                dbg.location(39,34);
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:39:34: ^( FEATURES_T ( feature )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(39,36);
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FEATURES_T, "FEATURES_T"), root_2);

                dbg.location(39,47);
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:39:47: ( feature )*
                while ( stream_feature.hasNext() ) {
                    dbg.location(39,47);
                    adaptor.addChild(root_2, stream_feature.nextTree());

                }
                stream_feature.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(40, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "class_stat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "class_stat"

    public static class feature_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "feature"
    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:42:1: feature : ( ID '(' ( formal ( ',' formal )* )? ')' ':' type= TYPE '{' expr '}' -> ^( METHOD_T ID TYPE ^( FORMALS_T ( formal )* ) ^( EXPR_T expr ) ) | ID ':' TYPE ( '<-' expr )? -> ^( ATTR_T ID TYPE ( ^( EXPR_T expr ) )? ) );
    public final COOLTreeBuilderParser.feature_return feature() throws RecognitionException {
        COOLTreeBuilderParser.feature_return retval = new COOLTreeBuilderParser.feature_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token type=null;
        Token ID9=null;
        Token char_literal10=null;
        Token char_literal12=null;
        Token char_literal14=null;
        Token char_literal15=null;
        Token char_literal16=null;
        Token char_literal18=null;
        Token ID19=null;
        Token char_literal20=null;
        Token TYPE21=null;
        Token string_literal22=null;
        COOLTreeBuilderParser.formal_return formal11 = null;

        COOLTreeBuilderParser.formal_return formal13 = null;

        COOLTreeBuilderParser.expr_return expr17 = null;

        COOLTreeBuilderParser.expr_return expr23 = null;


        CommonTree type_tree=null;
        CommonTree ID9_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree char_literal12_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree char_literal15_tree=null;
        CommonTree char_literal16_tree=null;
        CommonTree char_literal18_tree=null;
        CommonTree ID19_tree=null;
        CommonTree char_literal20_tree=null;
        CommonTree TYPE21_tree=null;
        CommonTree string_literal22_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_formal=new RewriteRuleSubtreeStream(adaptor,"rule formal");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "feature");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 1);

        try {
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:43:2: ( ID '(' ( formal ( ',' formal )* )? ')' ':' type= TYPE '{' expr '}' -> ^( METHOD_T ID TYPE ^( FORMALS_T ( formal )* ) ^( EXPR_T expr ) ) | ID ':' TYPE ( '<-' expr )? -> ^( ATTR_T ID TYPE ( ^( EXPR_T expr ) )? ) )
            int alt7=2;
            try { dbg.enterDecision(7);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==49) ) {
                    alt7=1;
                }
                else if ( (LA7_1==52) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:44:2: ID '(' ( formal ( ',' formal )* )? ')' ':' type= TYPE '{' expr '}'
                    {
                    dbg.location(44,2);
                    ID9=(Token)match(input,ID,FOLLOW_ID_in_feature350); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID9);

                    dbg.location(44,5);
                    char_literal10=(Token)match(input,49,FOLLOW_49_in_feature352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal10);

                    dbg.location(44,9);
                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:44:9: ( formal ( ',' formal )* )?
                    int alt5=2;
                    try { dbg.enterSubRule(5);
                    try { dbg.enterDecision(5);

                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==ID) ) {
                        alt5=1;
                    }
                    } finally {dbg.exitDecision(5);}

                    switch (alt5) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:44:10: formal ( ',' formal )*
                            {
                            dbg.location(44,10);
                            pushFollow(FOLLOW_formal_in_feature355);
                            formal11=formal();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formal.add(formal11.getTree());
                            dbg.location(44,17);
                            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:44:17: ( ',' formal )*
                            try { dbg.enterSubRule(4);

                            loop4:
                            do {
                                int alt4=2;
                                try { dbg.enterDecision(4);

                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==50) ) {
                                    alt4=1;
                                }


                                } finally {dbg.exitDecision(4);}

                                switch (alt4) {
                            	case 1 :
                            	    dbg.enterAlt(1);

                            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:44:18: ',' formal
                            	    {
                            	    dbg.location(44,18);
                            	    char_literal12=(Token)match(input,50,FOLLOW_50_in_feature358); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_50.add(char_literal12);

                            	    dbg.location(44,22);
                            	    pushFollow(FOLLOW_formal_in_feature360);
                            	    formal13=formal();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_formal.add(formal13.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
                            } while (true);
                            } finally {dbg.exitSubRule(4);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(5);}

                    dbg.location(44,33);
                    char_literal14=(Token)match(input,51,FOLLOW_51_in_feature366); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_51.add(char_literal14);

                    dbg.location(44,37);
                    char_literal15=(Token)match(input,52,FOLLOW_52_in_feature368); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(char_literal15);

                    dbg.location(44,45);
                    type=(Token)match(input,TYPE,FOLLOW_TYPE_in_feature372); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPE.add(type);

                    dbg.location(44,51);
                    char_literal16=(Token)match(input,47,FOLLOW_47_in_feature374); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_47.add(char_literal16);

                    dbg.location(44,55);
                    pushFollow(FOLLOW_expr_in_feature376);
                    expr17=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr17.getTree());
                    dbg.location(44,60);
                    char_literal18=(Token)match(input,48,FOLLOW_48_in_feature378); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_48.add(char_literal18);



                    // AST REWRITE
                    // elements: expr, ID, formal, TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 45:3: -> ^( METHOD_T ID TYPE ^( FORMALS_T ( formal )* ) ^( EXPR_T expr ) )
                    {
                        dbg.location(45,6);
                        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:45:6: ^( METHOD_T ID TYPE ^( FORMALS_T ( formal )* ) ^( EXPR_T expr ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(45,8);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHOD_T, "METHOD_T"), root_1);

                        dbg.location(45,17);
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        dbg.location(45,20);
                        adaptor.addChild(root_1, stream_TYPE.nextNode());
                        dbg.location(45,25);
                        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:45:25: ^( FORMALS_T ( formal )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(45,27);
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMALS_T, "FORMALS_T"), root_2);

                        dbg.location(45,37);
                        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:45:37: ( formal )*
                        while ( stream_formal.hasNext() ) {
                            dbg.location(45,37);
                            adaptor.addChild(root_2, stream_formal.nextTree());

                        }
                        stream_formal.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(45,46);
                        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:45:46: ^( EXPR_T expr )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(45,48);
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_T, "EXPR_T"), root_2);

                        dbg.location(45,55);
                        adaptor.addChild(root_2, stream_expr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:47:2: ID ':' TYPE ( '<-' expr )?
                    {
                    dbg.location(47,2);
                    ID19=(Token)match(input,ID,FOLLOW_ID_in_feature409); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID19);

                    dbg.location(47,5);
                    char_literal20=(Token)match(input,52,FOLLOW_52_in_feature411); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(char_literal20);

                    dbg.location(47,9);
                    TYPE21=(Token)match(input,TYPE,FOLLOW_TYPE_in_feature413); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPE.add(TYPE21);

                    dbg.location(47,14);
                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:47:14: ( '<-' expr )?
                    int alt6=2;
                    try { dbg.enterSubRule(6);
                    try { dbg.enterDecision(6);

                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==53) ) {
                        alt6=1;
                    }
                    } finally {dbg.exitDecision(6);}

                    switch (alt6) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:47:15: '<-' expr
                            {
                            dbg.location(47,15);
                            string_literal22=(Token)match(input,53,FOLLOW_53_in_feature416); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_53.add(string_literal22);

                            dbg.location(47,20);
                            pushFollow(FOLLOW_expr_in_feature418);
                            expr23=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr23.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(6);}



                    // AST REWRITE
                    // elements: expr, TYPE, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 48:3: -> ^( ATTR_T ID TYPE ( ^( EXPR_T expr ) )? )
                    {
                        dbg.location(48,6);
                        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:48:6: ^( ATTR_T ID TYPE ( ^( EXPR_T expr ) )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(48,8);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ATTR_T, "ATTR_T"), root_1);

                        dbg.location(48,15);
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        dbg.location(48,18);
                        adaptor.addChild(root_1, stream_TYPE.nextNode());
                        dbg.location(48,23);
                        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:48:23: ( ^( EXPR_T expr ) )?
                        if ( stream_expr.hasNext() ) {
                            dbg.location(48,23);
                            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:48:23: ^( EXPR_T expr )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            dbg.location(48,25);
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_T, "EXPR_T"), root_2);

                            dbg.location(48,32);
                            adaptor.addChild(root_2, stream_expr.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(49, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "feature");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "feature"

    public static class formal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal"
    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:51:1: formal : ID ':' TYPE -> ^( TYPE_ID ID TYPE ) ;
    public final COOLTreeBuilderParser.formal_return formal() throws RecognitionException {
        COOLTreeBuilderParser.formal_return retval = new COOLTreeBuilderParser.formal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID24=null;
        Token char_literal25=null;
        Token TYPE26=null;

        CommonTree ID24_tree=null;
        CommonTree char_literal25_tree=null;
        CommonTree TYPE26_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");

        try { dbg.enterRule(getGrammarFileName(), "formal");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 1);

        try {
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:52:2: ( ID ':' TYPE -> ^( TYPE_ID ID TYPE ) )
            dbg.enterAlt(1);

            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:53:2: ID ':' TYPE
            {
            dbg.location(53,2);
            ID24=(Token)match(input,ID,FOLLOW_ID_in_formal454); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID24);

            dbg.location(53,5);
            char_literal25=(Token)match(input,52,FOLLOW_52_in_formal456); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_52.add(char_literal25);

            dbg.location(53,9);
            TYPE26=(Token)match(input,TYPE,FOLLOW_TYPE_in_formal458); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TYPE.add(TYPE26);



            // AST REWRITE
            // elements: ID, TYPE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 53:14: -> ^( TYPE_ID ID TYPE )
            {
                dbg.location(53,17);
                // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:53:17: ^( TYPE_ID ID TYPE )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(53,19);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE_ID, "TYPE_ID"), root_1);

                dbg.location(53,27);
                adaptor.addChild(root_1, stream_ID.nextNode());
                dbg.location(53,30);
                adaptor.addChild(root_1, stream_TYPE.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(54, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "formal");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "formal"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:56:1: expr : assignExpr ;
    public final COOLTreeBuilderParser.expr_return expr() throws RecognitionException {
        COOLTreeBuilderParser.expr_return retval = new COOLTreeBuilderParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        COOLTreeBuilderParser.assignExpr_return assignExpr27 = null;



        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 1);

        try {
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:57:2: ( assignExpr )
            dbg.enterAlt(1);

            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:58:3: assignExpr
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(58,3);
            pushFollow(FOLLOW_assignExpr_in_expr483);
            assignExpr27=assignExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr27.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(59, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr"

    public static class assignExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpr"
    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:61:1: assignExpr : ( ID '<-' assignExpr | notExpr );
    public final COOLTreeBuilderParser.assignExpr_return assignExpr() throws RecognitionException {
        COOLTreeBuilderParser.assignExpr_return retval = new COOLTreeBuilderParser.assignExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID28=null;
        Token string_literal29=null;
        COOLTreeBuilderParser.assignExpr_return assignExpr30 = null;

        COOLTreeBuilderParser.notExpr_return notExpr31 = null;


        CommonTree ID28_tree=null;
        CommonTree string_literal29_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "assignExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(61, 1);

        try {
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:62:3: ( ID '<-' assignExpr | notExpr )
            int alt8=2;
            try { dbg.enterDecision(8);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==53) ) {
                    alt8=1;
                }
                else if ( ((LA8_1>=THEN_ST && LA8_1<=FI_ST)||(LA8_1>=LOOP_ST && LA8_1<=POOL_ST)||LA8_1==OF_ST||LA8_1==IN_ST||LA8_1==46||(LA8_1>=48 && LA8_1<=51)||(LA8_1>=54 && LA8_1<=60)||(LA8_1>=62 && LA8_1<=63)) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else if ( ((LA8_0>=NOT_ST && LA8_0<=IF_ST)||LA8_0==WHILE_ST||LA8_0==CASE_ST||LA8_0==LET_ST||LA8_0==47||LA8_0==49||LA8_0==61) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:63:3: ID '<-' assignExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(63,3);
                    ID28=(Token)match(input,ID,FOLLOW_ID_in_assignExpr498); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID28_tree = (CommonTree)adaptor.create(ID28);
                    adaptor.addChild(root_0, ID28_tree);
                    }
                    dbg.location(63,10);
                    string_literal29=(Token)match(input,53,FOLLOW_53_in_assignExpr500); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal29_tree = (CommonTree)adaptor.create(string_literal29);
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal29_tree, root_0);
                    }
                    dbg.location(63,12);
                    pushFollow(FOLLOW_assignExpr_in_assignExpr503);
                    assignExpr30=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr30.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:65:3: notExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(65,3);
                    pushFollow(FOLLOW_notExpr_in_assignExpr511);
                    notExpr31=notExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, notExpr31.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(66, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "assignExpr"

    public static class notExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notExpr"
    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:68:1: notExpr : ( ( NOT_ST notExpr ) | relExpr );
    public final COOLTreeBuilderParser.notExpr_return notExpr() throws RecognitionException {
        COOLTreeBuilderParser.notExpr_return retval = new COOLTreeBuilderParser.notExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NOT_ST32=null;
        COOLTreeBuilderParser.notExpr_return notExpr33 = null;

        COOLTreeBuilderParser.relExpr_return relExpr34 = null;


        CommonTree NOT_ST32_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "notExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(68, 1);

        try {
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:69:3: ( ( NOT_ST notExpr ) | relExpr )
            int alt9=2;
            try { dbg.enterDecision(9);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==NOT_ST) ) {
                alt9=1;
            }
            else if ( (LA9_0==ID||(LA9_0>=ISVOID_ST && LA9_0<=IF_ST)||LA9_0==WHILE_ST||LA9_0==CASE_ST||LA9_0==LET_ST||LA9_0==47||LA9_0==49||LA9_0==61) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:70:3: ( NOT_ST notExpr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(70,3);
                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:70:3: ( NOT_ST notExpr )
                    dbg.enterAlt(1);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:70:4: NOT_ST notExpr
                    {
                    dbg.location(70,10);
                    NOT_ST32=(Token)match(input,NOT_ST,FOLLOW_NOT_ST_in_notExpr527); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT_ST32_tree = (CommonTree)adaptor.create(NOT_ST32);
                    root_0 = (CommonTree)adaptor.becomeRoot(NOT_ST32_tree, root_0);
                    }
                    dbg.location(70,12);
                    pushFollow(FOLLOW_notExpr_in_notExpr530);
                    notExpr33=notExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, notExpr33.getTree());

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:72:3: relExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(72,3);
                    pushFollow(FOLLOW_relExpr_in_notExpr539);
                    relExpr34=relExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relExpr34.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(73, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "notExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "notExpr"

    public static class relExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relExpr"
    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:75:1: relExpr : sumExpr ( ( '<=' )=> '<=' sumExpr | ( '<' )=> '<' sumExpr | ( '=' )=> '=' sumExpr )* ;
    public final COOLTreeBuilderParser.relExpr_return relExpr() throws RecognitionException {
        COOLTreeBuilderParser.relExpr_return retval = new COOLTreeBuilderParser.relExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal36=null;
        Token char_literal38=null;
        Token char_literal40=null;
        COOLTreeBuilderParser.sumExpr_return sumExpr35 = null;

        COOLTreeBuilderParser.sumExpr_return sumExpr37 = null;

        COOLTreeBuilderParser.sumExpr_return sumExpr39 = null;

        COOLTreeBuilderParser.sumExpr_return sumExpr41 = null;


        CommonTree string_literal36_tree=null;
        CommonTree char_literal38_tree=null;
        CommonTree char_literal40_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "relExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 1);

        try {
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:76:3: ( sumExpr ( ( '<=' )=> '<=' sumExpr | ( '<' )=> '<' sumExpr | ( '=' )=> '=' sumExpr )* )
            dbg.enterAlt(1);

            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:77:3: sumExpr ( ( '<=' )=> '<=' sumExpr | ( '<' )=> '<' sumExpr | ( '=' )=> '=' sumExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(77,3);
            pushFollow(FOLLOW_sumExpr_in_relExpr554);
            sumExpr35=sumExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sumExpr35.getTree());
            dbg.location(78,3);
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:78:3: ( ( '<=' )=> '<=' sumExpr | ( '<' )=> '<' sumExpr | ( '=' )=> '=' sumExpr )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=4;
                try { dbg.enterDecision(10);

                switch ( input.LA(1) ) {
                case 54:
                    {
                    int LA10_2 = input.LA(2);

                    if ( (synpred1_COOLTreeBuilder()) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 55:
                    {
                    int LA10_3 = input.LA(2);

                    if ( (synpred2_COOLTreeBuilder()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 56:
                    {
                    int LA10_4 = input.LA(2);

                    if ( (synpred3_COOLTreeBuilder()) ) {
                        alt10=3;
                    }


                    }
                    break;

                }

                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:79:5: ( '<=' )=> '<=' sumExpr
            	    {
            	    dbg.location(79,19);
            	    string_literal36=(Token)match(input,54,FOLLOW_54_in_relExpr570); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal36_tree = (CommonTree)adaptor.create(string_literal36);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal36_tree, root_0);
            	    }
            	    dbg.location(79,21);
            	    pushFollow(FOLLOW_sumExpr_in_relExpr573);
            	    sumExpr37=sumExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, sumExpr37.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:81:5: ( '<' )=> '<' sumExpr
            	    {
            	    dbg.location(81,17);
            	    char_literal38=(Token)match(input,55,FOLLOW_55_in_relExpr591); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal38_tree = (CommonTree)adaptor.create(char_literal38);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal38_tree, root_0);
            	    }
            	    dbg.location(81,19);
            	    pushFollow(FOLLOW_sumExpr_in_relExpr594);
            	    sumExpr39=sumExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, sumExpr39.getTree());

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:83:5: ( '=' )=> '=' sumExpr
            	    {
            	    dbg.location(83,17);
            	    char_literal40=(Token)match(input,56,FOLLOW_56_in_relExpr612); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal40_tree = (CommonTree)adaptor.create(char_literal40);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal40_tree, root_0);
            	    }
            	    dbg.location(83,19);
            	    pushFollow(FOLLOW_sumExpr_in_relExpr615);
            	    sumExpr41=sumExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, sumExpr41.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(85, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relExpr"

    public static class sumExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sumExpr"
    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:87:1: sumExpr : multExpr ( ( '+' )=> '+' multExpr | ( '-' )=> '-' multExpr )* ;
    public final COOLTreeBuilderParser.sumExpr_return sumExpr() throws RecognitionException {
        COOLTreeBuilderParser.sumExpr_return retval = new COOLTreeBuilderParser.sumExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal43=null;
        Token char_literal45=null;
        COOLTreeBuilderParser.multExpr_return multExpr42 = null;

        COOLTreeBuilderParser.multExpr_return multExpr44 = null;

        COOLTreeBuilderParser.multExpr_return multExpr46 = null;


        CommonTree char_literal43_tree=null;
        CommonTree char_literal45_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "sumExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(87, 1);

        try {
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:88:3: ( multExpr ( ( '+' )=> '+' multExpr | ( '-' )=> '-' multExpr )* )
            dbg.enterAlt(1);

            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:89:3: multExpr ( ( '+' )=> '+' multExpr | ( '-' )=> '-' multExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(89,3);
            pushFollow(FOLLOW_multExpr_in_sumExpr635);
            multExpr42=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr42.getTree());
            dbg.location(90,3);
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:90:3: ( ( '+' )=> '+' multExpr | ( '-' )=> '-' multExpr )*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=3;
                try { dbg.enterDecision(11);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==57) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred4_COOLTreeBuilder()) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0==58) ) {
                    int LA11_3 = input.LA(2);

                    if ( (synpred5_COOLTreeBuilder()) ) {
                        alt11=2;
                    }


                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:91:5: ( '+' )=> '+' multExpr
            	    {
            	    dbg.location(91,17);
            	    char_literal43=(Token)match(input,57,FOLLOW_57_in_sumExpr651); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal43_tree = (CommonTree)adaptor.create(char_literal43);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal43_tree, root_0);
            	    }
            	    dbg.location(91,19);
            	    pushFollow(FOLLOW_multExpr_in_sumExpr654);
            	    multExpr44=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr44.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:93:5: ( '-' )=> '-' multExpr
            	    {
            	    dbg.location(93,17);
            	    char_literal45=(Token)match(input,58,FOLLOW_58_in_sumExpr672); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal45_tree = (CommonTree)adaptor.create(char_literal45);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal45_tree, root_0);
            	    }
            	    dbg.location(93,19);
            	    pushFollow(FOLLOW_multExpr_in_sumExpr675);
            	    multExpr46=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr46.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);
            } finally {dbg.exitSubRule(11);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(95, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "sumExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "sumExpr"

    public static class multExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpr"
    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:97:1: multExpr : isVoidExpr ( ( '*' )=> '*' isVoidExpr | ( '/' )=> ( '/' isVoidExpr ) )* ;
    public final COOLTreeBuilderParser.multExpr_return multExpr() throws RecognitionException {
        COOLTreeBuilderParser.multExpr_return retval = new COOLTreeBuilderParser.multExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal48=null;
        Token char_literal50=null;
        COOLTreeBuilderParser.isVoidExpr_return isVoidExpr47 = null;

        COOLTreeBuilderParser.isVoidExpr_return isVoidExpr49 = null;

        COOLTreeBuilderParser.isVoidExpr_return isVoidExpr51 = null;


        CommonTree char_literal48_tree=null;
        CommonTree char_literal50_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "multExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(97, 1);

        try {
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:98:3: ( isVoidExpr ( ( '*' )=> '*' isVoidExpr | ( '/' )=> ( '/' isVoidExpr ) )* )
            dbg.enterAlt(1);

            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:99:3: isVoidExpr ( ( '*' )=> '*' isVoidExpr | ( '/' )=> ( '/' isVoidExpr ) )*
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(99,3);
            pushFollow(FOLLOW_isVoidExpr_in_multExpr695);
            isVoidExpr47=isVoidExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, isVoidExpr47.getTree());
            dbg.location(100,3);
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:100:3: ( ( '*' )=> '*' isVoidExpr | ( '/' )=> ( '/' isVoidExpr ) )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=3;
                try { dbg.enterDecision(12);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==59) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred6_COOLTreeBuilder()) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==60) ) {
                    int LA12_3 = input.LA(2);

                    if ( (synpred7_COOLTreeBuilder()) ) {
                        alt12=2;
                    }


                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:101:5: ( '*' )=> '*' isVoidExpr
            	    {
            	    dbg.location(101,17);
            	    char_literal48=(Token)match(input,59,FOLLOW_59_in_multExpr711); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal48_tree = (CommonTree)adaptor.create(char_literal48);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal48_tree, root_0);
            	    }
            	    dbg.location(101,19);
            	    pushFollow(FOLLOW_isVoidExpr_in_multExpr714);
            	    isVoidExpr49=isVoidExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, isVoidExpr49.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:103:5: ( '/' )=> ( '/' isVoidExpr )
            	    {
            	    dbg.location(103,14);
            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:103:14: ( '/' isVoidExpr )
            	    dbg.enterAlt(1);

            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:103:15: '/' isVoidExpr
            	    {
            	    dbg.location(103,18);
            	    char_literal50=(Token)match(input,60,FOLLOW_60_in_multExpr733); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal50_tree = (CommonTree)adaptor.create(char_literal50);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal50_tree, root_0);
            	    }
            	    dbg.location(103,20);
            	    pushFollow(FOLLOW_isVoidExpr_in_multExpr736);
            	    isVoidExpr51=isVoidExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, isVoidExpr51.getTree());

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(105, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "multExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "multExpr"

    public static class isVoidExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "isVoidExpr"
    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:107:1: isVoidExpr : ( ( ISVOID_ST isVoidExpr ) | tildaExpr );
    public final COOLTreeBuilderParser.isVoidExpr_return isVoidExpr() throws RecognitionException {
        COOLTreeBuilderParser.isVoidExpr_return retval = new COOLTreeBuilderParser.isVoidExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ISVOID_ST52=null;
        COOLTreeBuilderParser.isVoidExpr_return isVoidExpr53 = null;

        COOLTreeBuilderParser.tildaExpr_return tildaExpr54 = null;


        CommonTree ISVOID_ST52_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "isVoidExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(107, 1);

        try {
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:108:3: ( ( ISVOID_ST isVoidExpr ) | tildaExpr )
            int alt13=2;
            try { dbg.enterDecision(13);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==ISVOID_ST) ) {
                alt13=1;
            }
            else if ( (LA13_0==ID||(LA13_0>=INTEGER && LA13_0<=IF_ST)||LA13_0==WHILE_ST||LA13_0==CASE_ST||LA13_0==LET_ST||LA13_0==47||LA13_0==49||LA13_0==61) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:109:3: ( ISVOID_ST isVoidExpr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(109,3);
                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:109:3: ( ISVOID_ST isVoidExpr )
                    dbg.enterAlt(1);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:109:4: ISVOID_ST isVoidExpr
                    {
                    dbg.location(109,13);
                    ISVOID_ST52=(Token)match(input,ISVOID_ST,FOLLOW_ISVOID_ST_in_isVoidExpr758); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ISVOID_ST52_tree = (CommonTree)adaptor.create(ISVOID_ST52);
                    root_0 = (CommonTree)adaptor.becomeRoot(ISVOID_ST52_tree, root_0);
                    }
                    dbg.location(109,15);
                    pushFollow(FOLLOW_isVoidExpr_in_isVoidExpr761);
                    isVoidExpr53=isVoidExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, isVoidExpr53.getTree());

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:111:3: tildaExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(111,3);
                    pushFollow(FOLLOW_tildaExpr_in_isVoidExpr770);
                    tildaExpr54=tildaExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tildaExpr54.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(112, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "isVoidExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "isVoidExpr"

    public static class tildaExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tildaExpr"
    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:114:1: tildaExpr : ( ( '~' tildaExpr ) | dispatchExpr );
    public final COOLTreeBuilderParser.tildaExpr_return tildaExpr() throws RecognitionException {
        COOLTreeBuilderParser.tildaExpr_return retval = new COOLTreeBuilderParser.tildaExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal55=null;
        COOLTreeBuilderParser.tildaExpr_return tildaExpr56 = null;

        COOLTreeBuilderParser.dispatchExpr_return dispatchExpr57 = null;


        CommonTree char_literal55_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "tildaExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(114, 1);

        try {
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:115:3: ( ( '~' tildaExpr ) | dispatchExpr )
            int alt14=2;
            try { dbg.enterDecision(14);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==61) ) {
                alt14=1;
            }
            else if ( (LA14_0==ID||(LA14_0>=INTEGER && LA14_0<=IF_ST)||LA14_0==WHILE_ST||LA14_0==CASE_ST||LA14_0==LET_ST||LA14_0==47||LA14_0==49) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:116:3: ( '~' tildaExpr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(116,3);
                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:116:3: ( '~' tildaExpr )
                    dbg.enterAlt(1);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:116:4: '~' tildaExpr
                    {
                    dbg.location(116,7);
                    char_literal55=(Token)match(input,61,FOLLOW_61_in_tildaExpr786); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal55_tree = (CommonTree)adaptor.create(char_literal55);
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal55_tree, root_0);
                    }
                    dbg.location(116,9);
                    pushFollow(FOLLOW_tildaExpr_in_tildaExpr789);
                    tildaExpr56=tildaExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tildaExpr56.getTree());

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:118:3: dispatchExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(118,3);
                    pushFollow(FOLLOW_dispatchExpr_in_tildaExpr798);
                    dispatchExpr57=dispatchExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatchExpr57.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(119, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "tildaExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "tildaExpr"

    public static class dispatchExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dispatchExpr"
    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:121:1: dispatchExpr : ( ( atom '@' TYPE )=> atom '@' TYPE | atom ) ( ( '.' dispatchExprAux )=> '.' dispatchExprAux )* ;
    public final COOLTreeBuilderParser.dispatchExpr_return dispatchExpr() throws RecognitionException {
        COOLTreeBuilderParser.dispatchExpr_return retval = new COOLTreeBuilderParser.dispatchExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal59=null;
        Token TYPE60=null;
        Token char_literal62=null;
        COOLTreeBuilderParser.atom_return atom58 = null;

        COOLTreeBuilderParser.atom_return atom61 = null;

        COOLTreeBuilderParser.dispatchExprAux_return dispatchExprAux63 = null;


        CommonTree char_literal59_tree=null;
        CommonTree TYPE60_tree=null;
        CommonTree char_literal62_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dispatchExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(121, 1);

        try {
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:122:3: ( ( ( atom '@' TYPE )=> atom '@' TYPE | atom ) ( ( '.' dispatchExprAux )=> '.' dispatchExprAux )* )
            dbg.enterAlt(1);

            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:123:3: ( ( atom '@' TYPE )=> atom '@' TYPE | atom ) ( ( '.' dispatchExprAux )=> '.' dispatchExprAux )*
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(123,3);
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:123:3: ( ( atom '@' TYPE )=> atom '@' TYPE | atom )
            int alt15=2;
            try { dbg.enterSubRule(15);
            try { dbg.enterDecision(15);

            try {
                isCyclicDecision = true;
                alt15 = dfa15.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:124:5: ( atom '@' TYPE )=> atom '@' TYPE
                    {
                    dbg.location(124,25);
                    pushFollow(FOLLOW_atom_in_dispatchExpr830);
                    atom58=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom58.getTree());
                    dbg.location(124,33);
                    char_literal59=(Token)match(input,62,FOLLOW_62_in_dispatchExpr832); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal59_tree = (CommonTree)adaptor.create(char_literal59);
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal59_tree, root_0);
                    }
                    dbg.location(124,35);
                    TYPE60=(Token)match(input,TYPE,FOLLOW_TYPE_in_dispatchExpr835); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TYPE60_tree = (CommonTree)adaptor.create(TYPE60);
                    adaptor.addChild(root_0, TYPE60_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:126:5: atom
                    {
                    dbg.location(126,5);
                    pushFollow(FOLLOW_atom_in_dispatchExpr847);
                    atom61=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom61.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(15);}

            dbg.location(128,3);
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:128:3: ( ( '.' dispatchExprAux )=> '.' dispatchExprAux )*
            try { dbg.enterSubRule(16);

            loop16:
            do {
                int alt16=2;
                try { dbg.enterDecision(16);

                int LA16_0 = input.LA(1);

                if ( (LA16_0==63) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred9_COOLTreeBuilder()) ) {
                        alt16=1;
                    }


                }


                } finally {dbg.exitDecision(16);}

                switch (alt16) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:128:4: ( '.' dispatchExprAux )=> '.' dispatchExprAux
            	    {
            	    dbg.location(128,32);
            	    char_literal62=(Token)match(input,63,FOLLOW_63_in_dispatchExpr864); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal62_tree = (CommonTree)adaptor.create(char_literal62);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal62_tree, root_0);
            	    }
            	    dbg.location(128,34);
            	    pushFollow(FOLLOW_dispatchExprAux_in_dispatchExpr867);
            	    dispatchExprAux63=dispatchExprAux();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatchExprAux63.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);
            } finally {dbg.exitSubRule(16);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(129, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dispatchExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dispatchExpr"

    public static class dispatchExprAux_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dispatchExprAux"
    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:131:1: dispatchExprAux : ID '(' ( expr ( ',' expr )* )? ')' ;
    public final COOLTreeBuilderParser.dispatchExprAux_return dispatchExprAux() throws RecognitionException {
        COOLTreeBuilderParser.dispatchExprAux_return retval = new COOLTreeBuilderParser.dispatchExprAux_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID64=null;
        Token char_literal65=null;
        Token char_literal67=null;
        Token char_literal69=null;
        COOLTreeBuilderParser.expr_return expr66 = null;

        COOLTreeBuilderParser.expr_return expr68 = null;


        CommonTree ID64_tree=null;
        CommonTree char_literal65_tree=null;
        CommonTree char_literal67_tree=null;
        CommonTree char_literal69_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dispatchExprAux");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(131, 1);

        try {
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:132:3: ( ID '(' ( expr ( ',' expr )* )? ')' )
            dbg.enterAlt(1);

            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:133:3: ID '(' ( expr ( ',' expr )* )? ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(133,3);
            ID64=(Token)match(input,ID,FOLLOW_ID_in_dispatchExprAux884); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID64_tree = (CommonTree)adaptor.create(ID64);
            adaptor.addChild(root_0, ID64_tree);
            }
            dbg.location(133,9);
            char_literal65=(Token)match(input,49,FOLLOW_49_in_dispatchExprAux886); if (state.failed) return retval;
            dbg.location(133,11);
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:133:11: ( expr ( ',' expr )* )?
            int alt18=2;
            try { dbg.enterSubRule(18);
            try { dbg.enterDecision(18);

            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=ID && LA18_0<=IF_ST)||LA18_0==WHILE_ST||LA18_0==CASE_ST||LA18_0==LET_ST||LA18_0==47||LA18_0==49||LA18_0==61) ) {
                alt18=1;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:133:12: expr ( ',' expr )*
                    {
                    dbg.location(133,12);
                    pushFollow(FOLLOW_expr_in_dispatchExprAux890);
                    expr66=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr66.getTree());
                    dbg.location(133,17);
                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:133:17: ( ',' expr )*
                    try { dbg.enterSubRule(17);

                    loop17:
                    do {
                        int alt17=2;
                        try { dbg.enterDecision(17);

                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==50) ) {
                            alt17=1;
                        }


                        } finally {dbg.exitDecision(17);}

                        switch (alt17) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:133:18: ',' expr
                    	    {
                    	    dbg.location(133,21);
                    	    char_literal67=(Token)match(input,50,FOLLOW_50_in_dispatchExprAux893); if (state.failed) return retval;
                    	    dbg.location(133,23);
                    	    pushFollow(FOLLOW_expr_in_dispatchExprAux896);
                    	    expr68=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr68.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(17);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(18);}

            dbg.location(133,35);
            char_literal69=(Token)match(input,51,FOLLOW_51_in_dispatchExprAux902); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(134, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dispatchExprAux");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dispatchExprAux"

    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:136:1: atom : ( INTEGER | ID | '(' expr ')' | TRUE_ST | FALSE_ST | STRING | ID '(' ( expr ( ',' expr )* )? ')' -> ^( CALL_T ID ( expr )* ) | '{' ( expr ';' )+ '}' -> ^( BLOCK_T ( expr )+ ) | NEW_ST TYPE | IF_ST expr THEN_ST expr ELSE_ST expr FI_ST | WHILE_ST expr LOOP_ST expr POOL_ST | CASE_ST expr OF_ST ( ID ':' TYPE '=>' expr ';' )+ ESAC_ST | LET_ST ID ':' TYPE ( '<-' expr )? ( ',' ID ':' TYPE ( '<-' expr )? )* IN_ST expr );
    public final COOLTreeBuilderParser.atom_return atom() throws RecognitionException {
        COOLTreeBuilderParser.atom_return retval = new COOLTreeBuilderParser.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTEGER70=null;
        Token ID71=null;
        Token char_literal72=null;
        Token char_literal74=null;
        Token TRUE_ST75=null;
        Token FALSE_ST76=null;
        Token STRING77=null;
        Token ID78=null;
        Token char_literal79=null;
        Token char_literal81=null;
        Token char_literal83=null;
        Token char_literal84=null;
        Token char_literal86=null;
        Token char_literal87=null;
        Token NEW_ST88=null;
        Token TYPE89=null;
        Token IF_ST90=null;
        Token THEN_ST92=null;
        Token ELSE_ST94=null;
        Token FI_ST96=null;
        Token WHILE_ST97=null;
        Token LOOP_ST99=null;
        Token POOL_ST101=null;
        Token CASE_ST102=null;
        Token OF_ST104=null;
        Token ID105=null;
        Token char_literal106=null;
        Token TYPE107=null;
        Token string_literal108=null;
        Token char_literal110=null;
        Token ESAC_ST111=null;
        Token LET_ST112=null;
        Token ID113=null;
        Token char_literal114=null;
        Token TYPE115=null;
        Token string_literal116=null;
        Token char_literal118=null;
        Token ID119=null;
        Token char_literal120=null;
        Token TYPE121=null;
        Token string_literal122=null;
        Token IN_ST124=null;
        COOLTreeBuilderParser.expr_return expr73 = null;

        COOLTreeBuilderParser.expr_return expr80 = null;

        COOLTreeBuilderParser.expr_return expr82 = null;

        COOLTreeBuilderParser.expr_return expr85 = null;

        COOLTreeBuilderParser.expr_return expr91 = null;

        COOLTreeBuilderParser.expr_return expr93 = null;

        COOLTreeBuilderParser.expr_return expr95 = null;

        COOLTreeBuilderParser.expr_return expr98 = null;

        COOLTreeBuilderParser.expr_return expr100 = null;

        COOLTreeBuilderParser.expr_return expr103 = null;

        COOLTreeBuilderParser.expr_return expr109 = null;

        COOLTreeBuilderParser.expr_return expr117 = null;

        COOLTreeBuilderParser.expr_return expr123 = null;

        COOLTreeBuilderParser.expr_return expr125 = null;


        CommonTree INTEGER70_tree=null;
        CommonTree ID71_tree=null;
        CommonTree char_literal72_tree=null;
        CommonTree char_literal74_tree=null;
        CommonTree TRUE_ST75_tree=null;
        CommonTree FALSE_ST76_tree=null;
        CommonTree STRING77_tree=null;
        CommonTree ID78_tree=null;
        CommonTree char_literal79_tree=null;
        CommonTree char_literal81_tree=null;
        CommonTree char_literal83_tree=null;
        CommonTree char_literal84_tree=null;
        CommonTree char_literal86_tree=null;
        CommonTree char_literal87_tree=null;
        CommonTree NEW_ST88_tree=null;
        CommonTree TYPE89_tree=null;
        CommonTree IF_ST90_tree=null;
        CommonTree THEN_ST92_tree=null;
        CommonTree ELSE_ST94_tree=null;
        CommonTree FI_ST96_tree=null;
        CommonTree WHILE_ST97_tree=null;
        CommonTree LOOP_ST99_tree=null;
        CommonTree POOL_ST101_tree=null;
        CommonTree CASE_ST102_tree=null;
        CommonTree OF_ST104_tree=null;
        CommonTree ID105_tree=null;
        CommonTree char_literal106_tree=null;
        CommonTree TYPE107_tree=null;
        CommonTree string_literal108_tree=null;
        CommonTree char_literal110_tree=null;
        CommonTree ESAC_ST111_tree=null;
        CommonTree LET_ST112_tree=null;
        CommonTree ID113_tree=null;
        CommonTree char_literal114_tree=null;
        CommonTree TYPE115_tree=null;
        CommonTree string_literal116_tree=null;
        CommonTree char_literal118_tree=null;
        CommonTree ID119_tree=null;
        CommonTree char_literal120_tree=null;
        CommonTree TYPE121_tree=null;
        CommonTree string_literal122_tree=null;
        CommonTree IN_ST124_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(136, 1);

        try {
            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:137:3: ( INTEGER | ID | '(' expr ')' | TRUE_ST | FALSE_ST | STRING | ID '(' ( expr ( ',' expr )* )? ')' -> ^( CALL_T ID ( expr )* ) | '{' ( expr ';' )+ '}' -> ^( BLOCK_T ( expr )+ ) | NEW_ST TYPE | IF_ST expr THEN_ST expr ELSE_ST expr FI_ST | WHILE_ST expr LOOP_ST expr POOL_ST | CASE_ST expr OF_ST ( ID ':' TYPE '=>' expr ';' )+ ESAC_ST | LET_ST ID ':' TYPE ( '<-' expr )? ( ',' ID ':' TYPE ( '<-' expr )? )* IN_ST expr )
            int alt26=13;
            try { dbg.enterDecision(26);

            try {
                isCyclicDecision = true;
                alt26 = dfa26.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:137:7: INTEGER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(137,7);
                    INTEGER70=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_atom918); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER70_tree = (CommonTree)adaptor.create(INTEGER70);
                    adaptor.addChild(root_0, INTEGER70_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:138:7: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(138,7);
                    ID71=(Token)match(input,ID,FOLLOW_ID_in_atom926); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID71_tree = (CommonTree)adaptor.create(ID71);
                    adaptor.addChild(root_0, ID71_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:139:7: '(' expr ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(139,10);
                    char_literal72=(Token)match(input,49,FOLLOW_49_in_atom934); if (state.failed) return retval;
                    dbg.location(139,12);
                    pushFollow(FOLLOW_expr_in_atom937);
                    expr73=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr73.getTree());
                    dbg.location(139,20);
                    char_literal74=(Token)match(input,51,FOLLOW_51_in_atom939); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:140:7: TRUE_ST
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(140,7);
                    TRUE_ST75=(Token)match(input,TRUE_ST,FOLLOW_TRUE_ST_in_atom948); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE_ST75_tree = (CommonTree)adaptor.create(TRUE_ST75);
                    adaptor.addChild(root_0, TRUE_ST75_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:141:7: FALSE_ST
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(141,7);
                    FALSE_ST76=(Token)match(input,FALSE_ST,FOLLOW_FALSE_ST_in_atom956); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE_ST76_tree = (CommonTree)adaptor.create(FALSE_ST76);
                    adaptor.addChild(root_0, FALSE_ST76_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:142:7: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(142,7);
                    STRING77=(Token)match(input,STRING,FOLLOW_STRING_in_atom964); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING77_tree = (CommonTree)adaptor.create(STRING77);
                    adaptor.addChild(root_0, STRING77_tree);
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:143:7: ID '(' ( expr ( ',' expr )* )? ')'
                    {
                    dbg.location(143,7);
                    ID78=(Token)match(input,ID,FOLLOW_ID_in_atom972); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID78);

                    dbg.location(143,10);
                    char_literal79=(Token)match(input,49,FOLLOW_49_in_atom974); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal79);

                    dbg.location(143,14);
                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:143:14: ( expr ( ',' expr )* )?
                    int alt20=2;
                    try { dbg.enterSubRule(20);
                    try { dbg.enterDecision(20);

                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=ID && LA20_0<=IF_ST)||LA20_0==WHILE_ST||LA20_0==CASE_ST||LA20_0==LET_ST||LA20_0==47||LA20_0==49||LA20_0==61) ) {
                        alt20=1;
                    }
                    } finally {dbg.exitDecision(20);}

                    switch (alt20) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:143:15: expr ( ',' expr )*
                            {
                            dbg.location(143,15);
                            pushFollow(FOLLOW_expr_in_atom977);
                            expr80=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr80.getTree());
                            dbg.location(143,20);
                            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:143:20: ( ',' expr )*
                            try { dbg.enterSubRule(19);

                            loop19:
                            do {
                                int alt19=2;
                                try { dbg.enterDecision(19);

                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==50) ) {
                                    alt19=1;
                                }


                                } finally {dbg.exitDecision(19);}

                                switch (alt19) {
                            	case 1 :
                            	    dbg.enterAlt(1);

                            	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:143:21: ',' expr
                            	    {
                            	    dbg.location(143,21);
                            	    char_literal81=(Token)match(input,50,FOLLOW_50_in_atom980); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_50.add(char_literal81);

                            	    dbg.location(143,25);
                            	    pushFollow(FOLLOW_expr_in_atom982);
                            	    expr82=expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_expr.add(expr82.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);
                            } finally {dbg.exitSubRule(19);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(20);}

                    dbg.location(143,34);
                    char_literal83=(Token)match(input,51,FOLLOW_51_in_atom988); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_51.add(char_literal83);



                    // AST REWRITE
                    // elements: expr, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 143:38: -> ^( CALL_T ID ( expr )* )
                    {
                        dbg.location(143,41);
                        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:143:41: ^( CALL_T ID ( expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(143,43);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL_T, "CALL_T"), root_1);

                        dbg.location(143,50);
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        dbg.location(143,53);
                        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:143:53: ( expr )*
                        while ( stream_expr.hasNext() ) {
                            dbg.location(143,53);
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:144:6: '{' ( expr ';' )+ '}'
                    {
                    dbg.location(144,6);
                    char_literal84=(Token)match(input,47,FOLLOW_47_in_atom1006); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_47.add(char_literal84);

                    dbg.location(144,10);
                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:144:10: ( expr ';' )+
                    int cnt21=0;
                    try { dbg.enterSubRule(21);

                    loop21:
                    do {
                        int alt21=2;
                        try { dbg.enterDecision(21);

                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>=ID && LA21_0<=IF_ST)||LA21_0==WHILE_ST||LA21_0==CASE_ST||LA21_0==LET_ST||LA21_0==47||LA21_0==49||LA21_0==61) ) {
                            alt21=1;
                        }


                        } finally {dbg.exitDecision(21);}

                        switch (alt21) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:144:11: expr ';'
                    	    {
                    	    dbg.location(144,11);
                    	    pushFollow(FOLLOW_expr_in_atom1009);
                    	    expr85=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr85.getTree());
                    	    dbg.location(144,16);
                    	    char_literal86=(Token)match(input,46,FOLLOW_46_in_atom1011); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_46.add(char_literal86);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt21++;
                    } while (true);
                    } finally {dbg.exitSubRule(21);}

                    dbg.location(144,22);
                    char_literal87=(Token)match(input,48,FOLLOW_48_in_atom1015); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_48.add(char_literal87);



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 144:26: -> ^( BLOCK_T ( expr )+ )
                    {
                        dbg.location(144,29);
                        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:144:29: ^( BLOCK_T ( expr )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(144,31);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_T, "BLOCK_T"), root_1);

                        dbg.location(144,39);
                        if ( !(stream_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expr.hasNext() ) {
                            dbg.location(144,39);
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:145:7: NEW_ST TYPE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(145,13);
                    NEW_ST88=(Token)match(input,NEW_ST,FOLLOW_NEW_ST_in_atom1032); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW_ST88_tree = (CommonTree)adaptor.create(NEW_ST88);
                    root_0 = (CommonTree)adaptor.becomeRoot(NEW_ST88_tree, root_0);
                    }
                    dbg.location(145,15);
                    TYPE89=(Token)match(input,TYPE,FOLLOW_TYPE_in_atom1035); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TYPE89_tree = (CommonTree)adaptor.create(TYPE89);
                    adaptor.addChild(root_0, TYPE89_tree);
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:146:7: IF_ST expr THEN_ST expr ELSE_ST expr FI_ST
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(146,12);
                    IF_ST90=(Token)match(input,IF_ST,FOLLOW_IF_ST_in_atom1043); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF_ST90_tree = (CommonTree)adaptor.create(IF_ST90);
                    root_0 = (CommonTree)adaptor.becomeRoot(IF_ST90_tree, root_0);
                    }
                    dbg.location(146,14);
                    pushFollow(FOLLOW_expr_in_atom1046);
                    expr91=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr91.getTree());
                    dbg.location(146,26);
                    THEN_ST92=(Token)match(input,THEN_ST,FOLLOW_THEN_ST_in_atom1048); if (state.failed) return retval;
                    dbg.location(146,28);
                    pushFollow(FOLLOW_expr_in_atom1051);
                    expr93=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr93.getTree());
                    dbg.location(146,40);
                    ELSE_ST94=(Token)match(input,ELSE_ST,FOLLOW_ELSE_ST_in_atom1053); if (state.failed) return retval;
                    dbg.location(146,42);
                    pushFollow(FOLLOW_expr_in_atom1056);
                    expr95=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr95.getTree());
                    dbg.location(146,52);
                    FI_ST96=(Token)match(input,FI_ST,FOLLOW_FI_ST_in_atom1058); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:147:7: WHILE_ST expr LOOP_ST expr POOL_ST
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(147,15);
                    WHILE_ST97=(Token)match(input,WHILE_ST,FOLLOW_WHILE_ST_in_atom1068); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE_ST97_tree = (CommonTree)adaptor.create(WHILE_ST97);
                    root_0 = (CommonTree)adaptor.becomeRoot(WHILE_ST97_tree, root_0);
                    }
                    dbg.location(147,17);
                    pushFollow(FOLLOW_expr_in_atom1071);
                    expr98=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr98.getTree());
                    dbg.location(147,29);
                    LOOP_ST99=(Token)match(input,LOOP_ST,FOLLOW_LOOP_ST_in_atom1073); if (state.failed) return retval;
                    dbg.location(147,31);
                    pushFollow(FOLLOW_expr_in_atom1076);
                    expr100=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr100.getTree());
                    dbg.location(147,43);
                    POOL_ST101=(Token)match(input,POOL_ST,FOLLOW_POOL_ST_in_atom1078); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:148:7: CASE_ST expr OF_ST ( ID ':' TYPE '=>' expr ';' )+ ESAC_ST
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(148,14);
                    CASE_ST102=(Token)match(input,CASE_ST,FOLLOW_CASE_ST_in_atom1088); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CASE_ST102_tree = (CommonTree)adaptor.create(CASE_ST102);
                    root_0 = (CommonTree)adaptor.becomeRoot(CASE_ST102_tree, root_0);
                    }
                    dbg.location(148,16);
                    pushFollow(FOLLOW_expr_in_atom1091);
                    expr103=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr103.getTree());
                    dbg.location(148,26);
                    OF_ST104=(Token)match(input,OF_ST,FOLLOW_OF_ST_in_atom1093); if (state.failed) return retval;
                    dbg.location(148,28);
                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:148:28: ( ID ':' TYPE '=>' expr ';' )+
                    int cnt22=0;
                    try { dbg.enterSubRule(22);

                    loop22:
                    do {
                        int alt22=2;
                        try { dbg.enterDecision(22);

                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==ID) ) {
                            alt22=1;
                        }


                        } finally {dbg.exitDecision(22);}

                        switch (alt22) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:148:29: ID ':' TYPE '=>' expr ';'
                    	    {
                    	    dbg.location(148,29);
                    	    ID105=(Token)match(input,ID,FOLLOW_ID_in_atom1097); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    ID105_tree = (CommonTree)adaptor.create(ID105);
                    	    adaptor.addChild(root_0, ID105_tree);
                    	    }
                    	    dbg.location(148,35);
                    	    char_literal106=(Token)match(input,52,FOLLOW_52_in_atom1099); if (state.failed) return retval;
                    	    dbg.location(148,37);
                    	    TYPE107=(Token)match(input,TYPE,FOLLOW_TYPE_in_atom1102); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    TYPE107_tree = (CommonTree)adaptor.create(TYPE107);
                    	    adaptor.addChild(root_0, TYPE107_tree);
                    	    }
                    	    dbg.location(148,46);
                    	    string_literal108=(Token)match(input,64,FOLLOW_64_in_atom1104); if (state.failed) return retval;
                    	    dbg.location(148,48);
                    	    pushFollow(FOLLOW_expr_in_atom1107);
                    	    expr109=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr109.getTree());
                    	    dbg.location(148,56);
                    	    char_literal110=(Token)match(input,46,FOLLOW_46_in_atom1109); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt22++;
                    } while (true);
                    } finally {dbg.exitSubRule(22);}

                    dbg.location(148,67);
                    ESAC_ST111=(Token)match(input,ESAC_ST,FOLLOW_ESAC_ST_in_atom1114); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:149:7: LET_ST ID ':' TYPE ( '<-' expr )? ( ',' ID ':' TYPE ( '<-' expr )? )* IN_ST expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(149,13);
                    LET_ST112=(Token)match(input,LET_ST,FOLLOW_LET_ST_in_atom1124); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LET_ST112_tree = (CommonTree)adaptor.create(LET_ST112);
                    root_0 = (CommonTree)adaptor.becomeRoot(LET_ST112_tree, root_0);
                    }
                    dbg.location(149,15);
                    ID113=(Token)match(input,ID,FOLLOW_ID_in_atom1127); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID113_tree = (CommonTree)adaptor.create(ID113);
                    adaptor.addChild(root_0, ID113_tree);
                    }
                    dbg.location(149,21);
                    char_literal114=(Token)match(input,52,FOLLOW_52_in_atom1129); if (state.failed) return retval;
                    dbg.location(149,23);
                    TYPE115=(Token)match(input,TYPE,FOLLOW_TYPE_in_atom1132); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TYPE115_tree = (CommonTree)adaptor.create(TYPE115);
                    adaptor.addChild(root_0, TYPE115_tree);
                    }
                    dbg.location(149,28);
                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:149:28: ( '<-' expr )?
                    int alt23=2;
                    try { dbg.enterSubRule(23);
                    try { dbg.enterDecision(23);

                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==53) ) {
                        alt23=1;
                    }
                    } finally {dbg.exitDecision(23);}

                    switch (alt23) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:149:29: '<-' expr
                            {
                            dbg.location(149,29);
                            string_literal116=(Token)match(input,53,FOLLOW_53_in_atom1135); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal116_tree = (CommonTree)adaptor.create(string_literal116);
                            adaptor.addChild(root_0, string_literal116_tree);
                            }
                            dbg.location(149,34);
                            pushFollow(FOLLOW_expr_in_atom1137);
                            expr117=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr117.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(23);}

                    dbg.location(149,41);
                    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:149:41: ( ',' ID ':' TYPE ( '<-' expr )? )*
                    try { dbg.enterSubRule(25);

                    loop25:
                    do {
                        int alt25=2;
                        try { dbg.enterDecision(25);

                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==50) ) {
                            alt25=1;
                        }


                        } finally {dbg.exitDecision(25);}

                        switch (alt25) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:149:42: ',' ID ':' TYPE ( '<-' expr )?
                    	    {
                    	    dbg.location(149,42);
                    	    char_literal118=(Token)match(input,50,FOLLOW_50_in_atom1142); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal118_tree = (CommonTree)adaptor.create(char_literal118);
                    	    adaptor.addChild(root_0, char_literal118_tree);
                    	    }
                    	    dbg.location(149,46);
                    	    ID119=(Token)match(input,ID,FOLLOW_ID_in_atom1144); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    ID119_tree = (CommonTree)adaptor.create(ID119);
                    	    adaptor.addChild(root_0, ID119_tree);
                    	    }
                    	    dbg.location(149,52);
                    	    char_literal120=(Token)match(input,52,FOLLOW_52_in_atom1146); if (state.failed) return retval;
                    	    dbg.location(149,54);
                    	    TYPE121=(Token)match(input,TYPE,FOLLOW_TYPE_in_atom1149); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    TYPE121_tree = (CommonTree)adaptor.create(TYPE121);
                    	    adaptor.addChild(root_0, TYPE121_tree);
                    	    }
                    	    dbg.location(149,59);
                    	    // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:149:59: ( '<-' expr )?
                    	    int alt24=2;
                    	    try { dbg.enterSubRule(24);
                    	    try { dbg.enterDecision(24);

                    	    int LA24_0 = input.LA(1);

                    	    if ( (LA24_0==53) ) {
                    	        alt24=1;
                    	    }
                    	    } finally {dbg.exitDecision(24);}

                    	    switch (alt24) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:149:60: '<-' expr
                    	            {
                    	            dbg.location(149,60);
                    	            string_literal122=(Token)match(input,53,FOLLOW_53_in_atom1152); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            string_literal122_tree = (CommonTree)adaptor.create(string_literal122);
                    	            adaptor.addChild(root_0, string_literal122_tree);
                    	            }
                    	            dbg.location(149,65);
                    	            pushFollow(FOLLOW_expr_in_atom1154);
                    	            expr123=expr();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr123.getTree());

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(24);}


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(25);}

                    dbg.location(149,79);
                    IN_ST124=(Token)match(input,IN_ST,FOLLOW_IN_ST_in_atom1160); if (state.failed) return retval;
                    dbg.location(149,81);
                    pushFollow(FOLLOW_expr_in_atom1163);
                    expr125=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr125.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(151, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "atom"

    // $ANTLR start synpred1_COOLTreeBuilder
    public final void synpred1_COOLTreeBuilder_fragment() throws RecognitionException {   
        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:79:5: ( '<=' )
        dbg.enterAlt(1);

        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:79:6: '<='
        {
        dbg.location(79,6);
        match(input,54,FOLLOW_54_in_synpred1_COOLTreeBuilder565); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_COOLTreeBuilder

    // $ANTLR start synpred2_COOLTreeBuilder
    public final void synpred2_COOLTreeBuilder_fragment() throws RecognitionException {   
        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:81:5: ( '<' )
        dbg.enterAlt(1);

        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:81:6: '<'
        {
        dbg.location(81,6);
        match(input,55,FOLLOW_55_in_synpred2_COOLTreeBuilder586); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_COOLTreeBuilder

    // $ANTLR start synpred3_COOLTreeBuilder
    public final void synpred3_COOLTreeBuilder_fragment() throws RecognitionException {   
        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:83:5: ( '=' )
        dbg.enterAlt(1);

        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:83:6: '='
        {
        dbg.location(83,6);
        match(input,56,FOLLOW_56_in_synpred3_COOLTreeBuilder607); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_COOLTreeBuilder

    // $ANTLR start synpred4_COOLTreeBuilder
    public final void synpred4_COOLTreeBuilder_fragment() throws RecognitionException {   
        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:91:5: ( '+' )
        dbg.enterAlt(1);

        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:91:6: '+'
        {
        dbg.location(91,6);
        match(input,57,FOLLOW_57_in_synpred4_COOLTreeBuilder646); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_COOLTreeBuilder

    // $ANTLR start synpred5_COOLTreeBuilder
    public final void synpred5_COOLTreeBuilder_fragment() throws RecognitionException {   
        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:93:5: ( '-' )
        dbg.enterAlt(1);

        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:93:6: '-'
        {
        dbg.location(93,6);
        match(input,58,FOLLOW_58_in_synpred5_COOLTreeBuilder667); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_COOLTreeBuilder

    // $ANTLR start synpred6_COOLTreeBuilder
    public final void synpred6_COOLTreeBuilder_fragment() throws RecognitionException {   
        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:101:5: ( '*' )
        dbg.enterAlt(1);

        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:101:6: '*'
        {
        dbg.location(101,6);
        match(input,59,FOLLOW_59_in_synpred6_COOLTreeBuilder706); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_COOLTreeBuilder

    // $ANTLR start synpred7_COOLTreeBuilder
    public final void synpred7_COOLTreeBuilder_fragment() throws RecognitionException {   
        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:103:5: ( '/' )
        dbg.enterAlt(1);

        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:103:6: '/'
        {
        dbg.location(103,6);
        match(input,60,FOLLOW_60_in_synpred7_COOLTreeBuilder727); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_COOLTreeBuilder

    // $ANTLR start synpred8_COOLTreeBuilder
    public final void synpred8_COOLTreeBuilder_fragment() throws RecognitionException {   
        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:124:5: ( atom '@' TYPE )
        dbg.enterAlt(1);

        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:124:6: atom '@' TYPE
        {
        dbg.location(124,6);
        pushFollow(FOLLOW_atom_in_synpred8_COOLTreeBuilder820);
        atom();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(124,14);
        match(input,62,FOLLOW_62_in_synpred8_COOLTreeBuilder822); if (state.failed) return ;
        dbg.location(124,16);
        match(input,TYPE,FOLLOW_TYPE_in_synpred8_COOLTreeBuilder825); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_COOLTreeBuilder

    // $ANTLR start synpred9_COOLTreeBuilder
    public final void synpred9_COOLTreeBuilder_fragment() throws RecognitionException {   
        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:128:4: ( '.' dispatchExprAux )
        dbg.enterAlt(1);

        // /home/sana/Desktop/Semestrul1/CPL/Teme/Tema2/src/COOLTreeBuilder.g:128:5: '.' dispatchExprAux
        {
        dbg.location(128,5);
        match(input,63,FOLLOW_63_in_synpred9_COOLTreeBuilder857); if (state.failed) return ;
        dbg.location(128,9);
        pushFollow(FOLLOW_dispatchExprAux_in_synpred9_COOLTreeBuilder859);
        dispatchExprAux();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_COOLTreeBuilder

    // Delegated rules

    public final boolean synpred8_COOLTreeBuilder() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred8_COOLTreeBuilder_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_COOLTreeBuilder() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred9_COOLTreeBuilder_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_COOLTreeBuilder() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred6_COOLTreeBuilder_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_COOLTreeBuilder() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred4_COOLTreeBuilder_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_COOLTreeBuilder() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred1_COOLTreeBuilder_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_COOLTreeBuilder() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred7_COOLTreeBuilder_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_COOLTreeBuilder() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred2_COOLTreeBuilder_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_COOLTreeBuilder() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred3_COOLTreeBuilder_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_COOLTreeBuilder() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred5_COOLTreeBuilder_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA15_eotS =
        "\17\uffff";
    static final String DFA15_eofS =
        "\17\uffff";
    static final String DFA15_minS =
        "\1\26\14\0\2\uffff";
    static final String DFA15_maxS =
        "\1\61\14\0\2\uffff";
    static final String DFA15_acceptS =
        "\15\uffff\1\1\1\2";
    static final String DFA15_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\2\uffff\1\1\1\4\1\5\1\6\1\10\1\11\3\uffff\1\12\2\uffff"+
            "\1\13\2\uffff\1\14\6\uffff\1\7\1\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "123:3: ( ( atom '@' TYPE )=> atom '@' TYPE | atom )";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_COOLTreeBuilder()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_COOLTreeBuilder()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_COOLTreeBuilder()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_4 = input.LA(1);

                         
                        int index15_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_COOLTreeBuilder()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_5 = input.LA(1);

                         
                        int index15_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_COOLTreeBuilder()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_COOLTreeBuilder()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_COOLTreeBuilder()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_8 = input.LA(1);

                         
                        int index15_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_COOLTreeBuilder()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_9 = input.LA(1);

                         
                        int index15_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_COOLTreeBuilder()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA15_10 = input.LA(1);

                         
                        int index15_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_COOLTreeBuilder()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA15_11 = input.LA(1);

                         
                        int index15_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_COOLTreeBuilder()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA15_12 = input.LA(1);

                         
                        int index15_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_COOLTreeBuilder()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\17\uffff";
    static final String DFA26_eofS =
        "\17\uffff";
    static final String DFA26_minS =
        "\1\26\1\uffff\1\37\14\uffff";
    static final String DFA26_maxS =
        "\1\61\1\uffff\1\77\14\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\7\1\2";
    static final String DFA26_specialS =
        "\17\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\2\2\uffff\1\1\1\4\1\5\1\6\1\10\1\11\3\uffff\1\12\2\uffff"+
            "\1\13\2\uffff\1\14\6\uffff\1\7\1\uffff\1\3",
            "",
            "\3\16\1\uffff\2\16\1\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1"+
            "\uffff\1\16\1\15\2\16\2\uffff\7\16\1\uffff\2\16",
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
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "136:1: atom : ( INTEGER | ID | '(' expr ')' | TRUE_ST | FALSE_ST | STRING | ID '(' ( expr ( ',' expr )* )? ')' -> ^( CALL_T ID ( expr )* ) | '{' ( expr ';' )+ '}' -> ^( BLOCK_T ( expr )+ ) | NEW_ST TYPE | IF_ST expr THEN_ST expr ELSE_ST expr FI_ST | WHILE_ST expr LOOP_ST expr POOL_ST | CASE_ST expr OF_ST ( ID ':' TYPE '=>' expr ';' )+ ESAC_ST | LET_ST ID ':' TYPE ( '<-' expr )? ( ',' ID ':' TYPE ( '<-' expr )? )* IN_ST expr );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_class_stat_in_program266 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_program268 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_CLASS_ST_in_class_stat290 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_TYPE_in_class_stat294 = new BitSet(new long[]{0x0000800000200000L});
    public static final BitSet FOLLOW_INHERITS_ST_in_class_stat297 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_TYPE_in_class_stat301 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_class_stat305 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_feature_in_class_stat308 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_class_stat310 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_48_in_class_stat314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_feature350 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_feature352 = new BitSet(new long[]{0x0008000000400000L});
    public static final BitSet FOLLOW_formal_in_feature355 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_50_in_feature358 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_formal_in_feature360 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_51_in_feature366 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_feature368 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_TYPE_in_feature372 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_feature374 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_expr_in_feature376 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_feature378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_feature409 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_feature411 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_TYPE_in_feature413 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_feature416 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_expr_in_feature418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_formal454 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_formal456 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_TYPE_in_formal458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignExpr498 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_assignExpr500 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_assignExpr_in_assignExpr503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpr_in_assignExpr511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_ST_in_notExpr527 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_notExpr_in_notExpr530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relExpr_in_notExpr539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sumExpr_in_relExpr554 = new BitSet(new long[]{0x01C0000000000002L});
    public static final BitSet FOLLOW_54_in_relExpr570 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_sumExpr_in_relExpr573 = new BitSet(new long[]{0x01C0000000000002L});
    public static final BitSet FOLLOW_55_in_relExpr591 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_sumExpr_in_relExpr594 = new BitSet(new long[]{0x01C0000000000002L});
    public static final BitSet FOLLOW_56_in_relExpr612 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_sumExpr_in_relExpr615 = new BitSet(new long[]{0x01C0000000000002L});
    public static final BitSet FOLLOW_multExpr_in_sumExpr635 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_57_in_sumExpr651 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_multExpr_in_sumExpr654 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_58_in_sumExpr672 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_multExpr_in_sumExpr675 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_isVoidExpr_in_multExpr695 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_59_in_multExpr711 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_isVoidExpr_in_multExpr714 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_60_in_multExpr733 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_isVoidExpr_in_multExpr736 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_ISVOID_ST_in_isVoidExpr758 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_isVoidExpr_in_isVoidExpr761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tildaExpr_in_isVoidExpr770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_tildaExpr786 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_tildaExpr_in_tildaExpr789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dispatchExpr_in_tildaExpr798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_dispatchExpr830 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_dispatchExpr832 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_TYPE_in_dispatchExpr835 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_atom_in_dispatchExpr847 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_dispatchExpr864 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dispatchExprAux_in_dispatchExpr867 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ID_in_dispatchExprAux884 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_dispatchExprAux886 = new BitSet(new long[]{0x200A81247FC00000L});
    public static final BitSet FOLLOW_expr_in_dispatchExprAux890 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_50_in_dispatchExprAux893 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_expr_in_dispatchExprAux896 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_51_in_dispatchExprAux902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_atom918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_atom934 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_expr_in_atom937 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_atom939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_ST_in_atom948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_ST_in_atom956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom972 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_atom974 = new BitSet(new long[]{0x200A81247FC00000L});
    public static final BitSet FOLLOW_expr_in_atom977 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_50_in_atom980 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_expr_in_atom982 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_51_in_atom988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_atom1006 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_expr_in_atom1009 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_atom1011 = new BitSet(new long[]{0x200381247FC00000L});
    public static final BitSet FOLLOW_48_in_atom1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_ST_in_atom1032 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_TYPE_in_atom1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_ST_in_atom1043 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_expr_in_atom1046 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_THEN_ST_in_atom1048 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_expr_in_atom1051 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ELSE_ST_in_atom1053 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_expr_in_atom1056 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_FI_ST_in_atom1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_ST_in_atom1068 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_expr_in_atom1071 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LOOP_ST_in_atom1073 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_expr_in_atom1076 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_POOL_ST_in_atom1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_ST_in_atom1088 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_expr_in_atom1091 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_OF_ST_in_atom1093 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_atom1097 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_atom1099 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_TYPE_in_atom1102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_atom1104 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_expr_in_atom1107 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_atom1109 = new BitSet(new long[]{0x0000008000400000L});
    public static final BitSet FOLLOW_ESAC_ST_in_atom1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_ST_in_atom1124 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_atom1127 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_atom1129 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_TYPE_in_atom1132 = new BitSet(new long[]{0x0024020000000000L});
    public static final BitSet FOLLOW_53_in_atom1135 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_expr_in_atom1137 = new BitSet(new long[]{0x0004020000000000L});
    public static final BitSet FOLLOW_50_in_atom1142 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_atom1144 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_atom1146 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_TYPE_in_atom1149 = new BitSet(new long[]{0x0024020000000000L});
    public static final BitSet FOLLOW_53_in_atom1152 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_expr_in_atom1154 = new BitSet(new long[]{0x0004020000000000L});
    public static final BitSet FOLLOW_IN_ST_in_atom1160 = new BitSet(new long[]{0x200281247FC00000L});
    public static final BitSet FOLLOW_expr_in_atom1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred1_COOLTreeBuilder565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred2_COOLTreeBuilder586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred3_COOLTreeBuilder607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_synpred4_COOLTreeBuilder646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_synpred5_COOLTreeBuilder667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_synpred6_COOLTreeBuilder706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_synpred7_COOLTreeBuilder727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_synpred8_COOLTreeBuilder820 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_synpred8_COOLTreeBuilder822 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_TYPE_in_synpred8_COOLTreeBuilder825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_synpred9_COOLTreeBuilder857 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_dispatchExprAux_in_synpred9_COOLTreeBuilder859 = new BitSet(new long[]{0x0000000000000002L});

}