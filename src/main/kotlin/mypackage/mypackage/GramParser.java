// Generated from /Users/stroom/GitHub/compilers/src/main/kotlin/Gram.g4 by ANTLR 4.9.1
package mypackage;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, IDENTIFIER=66, 
		DECIMAL_LITERAL=67, LP=68, RP=69, LT=70, GT=71, TYPEDEF=72, IB_OUTLET_COLLECTION=73, 
		IB_OUTLET=74, WEAK_QUALIFIER=75, STRONG_QUALIFIER=76, AUTORELEASING_QUALIFIER=77, 
		UNSAFE_UNRETAINED_QUALIFIER=78, NULL_UNSPECIFIED=79, NULLABLE=80, NONNULL=81, 
		NULL_RESETTABLE=82, AUTO=83, REGISTER=84, STATIC=85, EXTERN=86, BRIDGE=87, 
		BRIDGE_TRANSFER=88, BRIDGE_RETAINED=89, BLOCK=90, INLINE=91, NS_INLINE=92, 
		KINDOF=93, CONST=94, VOLATILE=95, RESTRICT=96, TYPEOF=97, IF=98, ELSE=99, 
		GOTO=100, CONTINUE=101, BREAK=102, RETURN=103, MUL=104, DIV=105, MOD=106, 
		ADD=107, SUB=108, LE=109, GE=110, NOTEQUAL=111, EQUAL=112, BITAND=113, 
		BITXOR=114, BITOR=115, AND=116, OR=117, QUESTION=118, COLON=119, SIZEOF=120, 
		INC=121, DEC=122, BANG=123, DOT=124, STRUCTACCESS=125, LBRACK=126, RBRACK=127, 
		COMMA=128, HEX_LITERAL=129, OCTAL_LITERAL=130, BINARY_LITERAL=131, FLOATING_POINT_LITERAL=132, 
		CHARACTER_LITERAL=133, NIL=134, NULL_=135, YES=136, NO=137, TRUE=138, 
		FALSE=139, STRING_START=140, STRING_VALUE=141, STRING_NEWLINE=142, STRING_END=143;
	public static final int
		RULE_translationUnit = 0, RULE_topLevelDeclaration = 1, RULE_protocolList = 2, 
		RULE_protocolName = 3, RULE_selector = 4, RULE_blockType = 5, RULE_dictionaryExpression = 6, 
		RULE_dictionaryPair = 7, RULE_arrayExpression = 8, RULE_blockParameters = 9, 
		RULE_typeVariableDeclaratorOrName = 10, RULE_blockExpression = 11, RULE_messageExpression = 12, 
		RULE_receiver = 13, RULE_messageSelector = 14, RULE_keywordArgument = 15, 
		RULE_keywordArgumentType = 16, RULE_selectorExpression = 17, RULE_selectorName = 18, 
		RULE_protocolExpression = 19, RULE_encodeExpression = 20, RULE_typeVariableDeclarator = 21, 
		RULE_throwStatement = 22, RULE_tryBlock = 23, RULE_catchStatement = 24, 
		RULE_synchronizedStatement = 25, RULE_autoreleaseStatement = 26, RULE_functionDeclaration = 27, 
		RULE_functionDefinition = 28, RULE_functionSignature = 29, RULE_attribute = 30, 
		RULE_attributeName = 31, RULE_attributeParameters = 32, RULE_attributeParameterList = 33, 
		RULE_attributeParameter = 34, RULE_attributeParameterAssignment = 35, 
		RULE_declaration = 36, RULE_functionCallExpression = 37, RULE_enumDeclaration = 38, 
		RULE_varDeclaration = 39, RULE_typedefDeclaration = 40, RULE_typeDeclaratorList = 41, 
		RULE_typeDeclarator = 42, RULE_declarationSpecifiers = 43, RULE_attributeSpecifier = 44, 
		RULE_initDeclaratorList = 45, RULE_initDeclarator = 46, RULE_specifierQualifierList = 47, 
		RULE_ibOutletQualifier = 48, RULE_arcBehaviourSpecifier = 49, RULE_nullabilitySpecifier = 50, 
		RULE_storageClassSpecifier = 51, RULE_typePrefix = 52, RULE_typeQualifier = 53, 
		RULE_protocolQualifier = 54, RULE_typeSpecifier = 55, RULE_typeofExpression = 56, 
		RULE_enumSpecifier = 57, RULE_enumeratorList = 58, RULE_enumerator = 59, 
		RULE_enumeratorIdentifier = 60, RULE_directDeclarator = 61, RULE_declaratorSuffix = 62, 
		RULE_parameterList = 63, RULE_pointer = 64, RULE_arrayInitializer = 65, 
		RULE_structInitializer = 66, RULE_initializerList = 67, RULE_typeName = 68, 
		RULE_abstractDeclarator = 69, RULE_abstractDeclaratorSuffix = 70, RULE_parameterDeclarationList = 71, 
		RULE_parameterDeclaration = 72, RULE_declarator = 73, RULE_statement = 74, 
		RULE_labeledStatement = 75, RULE_rangeExpression = 76, RULE_compoundStatement = 77, 
		RULE_selectionStatement = 78, RULE_switchStatement = 79, RULE_switchBlock = 80, 
		RULE_switchSection = 81, RULE_switchLabel = 82, RULE_iterationStatement = 83, 
		RULE_whileStatement = 84, RULE_doStatement = 85, RULE_forStatement = 86, 
		RULE_forLoopInitializer = 87, RULE_forInStatement = 88, RULE_jumpStatement = 89, 
		RULE_expressions = 90, RULE_expression = 91, RULE_assignmentOperator = 92, 
		RULE_castExpression = 93, RULE_initializer = 94, RULE_constantExpression = 95, 
		RULE_unaryExpression = 96, RULE_unaryOperator = 97, RULE_postfixExpression = 98, 
		RULE_postfix = 99, RULE_argumentExpressionList = 100, RULE_argumentExpression = 101, 
		RULE_primaryExpression = 102, RULE_constant = 103, RULE_stringLiteral = 104, 
		RULE_identifier = 105;
	private static String[] makeRuleNames() {
		return new String[] {
			"translationUnit", "topLevelDeclaration", "protocolList", "protocolName", 
			"selector", "blockType", "dictionaryExpression", "dictionaryPair", "arrayExpression", 
			"blockParameters", "typeVariableDeclaratorOrName", "blockExpression", 
			"messageExpression", "receiver", "messageSelector", "keywordArgument", 
			"keywordArgumentType", "selectorExpression", "selectorName", "protocolExpression", 
			"encodeExpression", "typeVariableDeclarator", "throwStatement", "tryBlock", 
			"catchStatement", "synchronizedStatement", "autoreleaseStatement", "functionDeclaration", 
			"functionDefinition", "functionSignature", "attribute", "attributeName", 
			"attributeParameters", "attributeParameterList", "attributeParameter", 
			"attributeParameterAssignment", "declaration", "functionCallExpression", 
			"enumDeclaration", "varDeclaration", "typedefDeclaration", "typeDeclaratorList", 
			"typeDeclarator", "declarationSpecifiers", "attributeSpecifier", "initDeclaratorList", 
			"initDeclarator", "specifierQualifierList", "ibOutletQualifier", "arcBehaviourSpecifier", 
			"nullabilitySpecifier", "storageClassSpecifier", "typePrefix", "typeQualifier", 
			"protocolQualifier", "typeSpecifier", "typeofExpression", "enumSpecifier", 
			"enumeratorList", "enumerator", "enumeratorIdentifier", "directDeclarator", 
			"declaratorSuffix", "parameterList", "pointer", "arrayInitializer", "structInitializer", 
			"initializerList", "typeName", "abstractDeclarator", "abstractDeclaratorSuffix", 
			"parameterDeclarationList", "parameterDeclaration", "declarator", "statement", 
			"labeledStatement", "rangeExpression", "compoundStatement", "selectionStatement", 
			"switchStatement", "switchBlock", "switchSection", "switchLabel", "iterationStatement", 
			"whileStatement", "doStatement", "forStatement", "forLoopInitializer", 
			"forInStatement", "jumpStatement", "expressions", "expression", "assignmentOperator", 
			"castExpression", "initializer", "constantExpression", "unaryExpression", 
			"unaryOperator", "postfixExpression", "postfix", "argumentExpressionList", 
			"argumentExpression", "primaryExpression", "constant", "stringLiteral", 
			"identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'__covariant'", "'__contravariant'", "'return'", "'^'", 
			"'@'", "'{'", "'}'", "':'", "'['", "']'", "'void'", "'@selector'", "'@protocol'", 
			"'@encode'", "'@throw'", "'@try'", "'@finally'", "'@catch'", "'@synchronized'", 
			"'@autoreleasepool'", "';'", "'const'", "'='", "'__attribute__'", "'in'", 
			"'out'", "'inout'", "'bycopy'", "'byref'", "'oneway'", "'char'", "'short'", 
			"'int'", "'long'", "'float'", "'double'", "'signed'", "'unsigned'", "'enum'", 
			"'NS_OPTIONS'", "'NS_ENUM'", "'default'", "'...'", "'*'", "'.'", "'switch'", 
			"'case'", "'while'", "'do'", "'for'", "'*='", "'/='", "'%='", "'+='", 
			"'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'&'", "'+'", "'-'", 
			"'~'", null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "IDENTIFIER", "DECIMAL_LITERAL", 
			"LP", "RP", "LT", "GT", "TYPEDEF", "IB_OUTLET_COLLECTION", "IB_OUTLET", 
			"WEAK_QUALIFIER", "STRONG_QUALIFIER", "AUTORELEASING_QUALIFIER", "UNSAFE_UNRETAINED_QUALIFIER", 
			"NULL_UNSPECIFIED", "NULLABLE", "NONNULL", "NULL_RESETTABLE", "AUTO", 
			"REGISTER", "STATIC", "EXTERN", "BRIDGE", "BRIDGE_TRANSFER", "BRIDGE_RETAINED", 
			"BLOCK", "INLINE", "NS_INLINE", "KINDOF", "CONST", "VOLATILE", "RESTRICT", 
			"TYPEOF", "IF", "ELSE", "GOTO", "CONTINUE", "BREAK", "RETURN", "MUL", 
			"DIV", "MOD", "ADD", "SUB", "LE", "GE", "NOTEQUAL", "EQUAL", "BITAND", 
			"BITXOR", "BITOR", "AND", "OR", "QUESTION", "COLON", "SIZEOF", "INC", 
			"DEC", "BANG", "DOT", "STRUCTACCESS", "LBRACK", "RBRACK", "COMMA", "HEX_LITERAL", 
			"OCTAL_LITERAL", "BINARY_LITERAL", "FLOATING_POINT_LITERAL", "CHARACTER_LITERAL", 
			"NIL", "NULL_", "YES", "NO", "TRUE", "FALSE", "STRING_START", "STRING_VALUE", 
			"STRING_NEWLINE", "STRING_END"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Gram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TranslationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GramParser.EOF, 0); }
		public List<TopLevelDeclarationContext> topLevelDeclaration() {
			return getRuleContexts(TopLevelDeclarationContext.class);
		}
		public TopLevelDeclarationContext topLevelDeclaration(int i) {
			return getRuleContext(TopLevelDeclarationContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IDENTIFIER - 66)) | (1L << (TYPEDEF - 66)) | (1L << (IB_OUTLET_COLLECTION - 66)) | (1L << (IB_OUTLET - 66)) | (1L << (WEAK_QUALIFIER - 66)) | (1L << (STRONG_QUALIFIER - 66)) | (1L << (AUTORELEASING_QUALIFIER - 66)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 66)) | (1L << (AUTO - 66)) | (1L << (REGISTER - 66)) | (1L << (STATIC - 66)) | (1L << (EXTERN - 66)) | (1L << (BRIDGE - 66)) | (1L << (BRIDGE_TRANSFER - 66)) | (1L << (BRIDGE_RETAINED - 66)) | (1L << (BLOCK - 66)) | (1L << (INLINE - 66)) | (1L << (NS_INLINE - 66)) | (1L << (KINDOF - 66)) | (1L << (CONST - 66)) | (1L << (VOLATILE - 66)) | (1L << (RESTRICT - 66)) | (1L << (TYPEOF - 66)))) != 0)) {
				{
				{
				setState(212);
				topLevelDeclaration();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopLevelDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public TopLevelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterTopLevelDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitTopLevelDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitTopLevelDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelDeclarationContext topLevelDeclaration() throws RecognitionException {
		TopLevelDeclarationContext _localctx = new TopLevelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topLevelDeclaration);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				functionDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolListContext extends ParserRuleContext {
		public List<ProtocolNameContext> protocolName() {
			return getRuleContexts(ProtocolNameContext.class);
		}
		public ProtocolNameContext protocolName(int i) {
			return getRuleContext(ProtocolNameContext.class,i);
		}
		public ProtocolListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterProtocolList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitProtocolList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitProtocolList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolListContext protocolList() throws RecognitionException {
		ProtocolListContext _localctx = new ProtocolListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_protocolList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			protocolName();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(226);
				match(T__0);
				setState(227);
				protocolName();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolNameContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(GramParser.LT, 0); }
		public ProtocolListContext protocolList() {
			return getRuleContext(ProtocolListContext.class,0);
		}
		public TerminalNode GT() { return getToken(GramParser.GT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ProtocolNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterProtocolName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitProtocolName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitProtocolName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolNameContext protocolName() throws RecognitionException {
		ProtocolNameContext _localctx = new ProtocolNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_protocolName);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(LT);
				setState(234);
				protocolList();
				setState(235);
				match(GT);
				}
				break;
			case T__1:
			case T__2:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==T__2) {
					{
					setState(237);
					_la = _input.LA(1);
					if ( !(_la==T__1 || _la==T__2) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(240);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selector);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				identifier();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockTypeContext extends ParserRuleContext {
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public List<NullabilitySpecifierContext> nullabilitySpecifier() {
			return getRuleContexts(NullabilitySpecifierContext.class);
		}
		public NullabilitySpecifierContext nullabilitySpecifier(int i) {
			return getRuleContext(NullabilitySpecifierContext.class,i);
		}
		public BlockParametersContext blockParameters() {
			return getRuleContext(BlockParametersContext.class,0);
		}
		public BlockTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterBlockType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitBlockType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitBlockType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockTypeContext blockType() throws RecognitionException {
		BlockTypeContext _localctx = new BlockTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_blockType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (NULL_UNSPECIFIED - 79)) | (1L << (NULLABLE - 79)) | (1L << (NONNULL - 79)) | (1L << (NULL_RESETTABLE - 79)))) != 0)) {
				{
				setState(247);
				nullabilitySpecifier();
				}
			}

			setState(250);
			typeSpecifier();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (NULL_UNSPECIFIED - 79)) | (1L << (NULLABLE - 79)) | (1L << (NONNULL - 79)) | (1L << (NULL_RESETTABLE - 79)))) != 0)) {
				{
				setState(251);
				nullabilitySpecifier();
				}
			}

			setState(254);
			match(LP);
			setState(255);
			match(T__4);
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL_UNSPECIFIED:
			case NULLABLE:
			case NONNULL:
			case NULL_RESETTABLE:
				{
				setState(256);
				nullabilitySpecifier();
				}
				break;
			case T__11:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case IDENTIFIER:
			case TYPEOF:
				{
				setState(257);
				typeSpecifier();
				}
				break;
			case RP:
				break;
			default:
				break;
			}
			setState(260);
			match(RP);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(261);
				blockParameters();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryExpressionContext extends ParserRuleContext {
		public List<DictionaryPairContext> dictionaryPair() {
			return getRuleContexts(DictionaryPairContext.class);
		}
		public DictionaryPairContext dictionaryPair(int i) {
			return getRuleContext(DictionaryPairContext.class,i);
		}
		public DictionaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterDictionaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitDictionaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitDictionaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryExpressionContext dictionaryExpression() throws RecognitionException {
		DictionaryExpressionContext _localctx = new DictionaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dictionaryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__5);
			setState(265);
			match(T__6);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__5 - 5)) | (1L << (T__9 - 5)) | (1L << (T__12 - 5)) | (1L << (T__13 - 5)) | (1L << (T__14 - 5)) | (1L << (T__44 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (IDENTIFIER - 5)) | (1L << (DECIMAL_LITERAL - 5)) | (1L << (LP - 5)))) != 0) || ((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (SIZEOF - 120)) | (1L << (INC - 120)) | (1L << (DEC - 120)) | (1L << (BANG - 120)) | (1L << (HEX_LITERAL - 120)) | (1L << (OCTAL_LITERAL - 120)) | (1L << (BINARY_LITERAL - 120)) | (1L << (FLOATING_POINT_LITERAL - 120)) | (1L << (CHARACTER_LITERAL - 120)) | (1L << (NIL - 120)) | (1L << (NULL_ - 120)) | (1L << (YES - 120)) | (1L << (NO - 120)) | (1L << (TRUE - 120)) | (1L << (FALSE - 120)) | (1L << (STRING_START - 120)))) != 0)) {
				{
				setState(266);
				dictionaryPair();
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(267);
						match(T__0);
						setState(268);
						dictionaryPair();
						}
						} 
					}
					setState(273);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(274);
					match(T__0);
					}
				}

				}
			}

			setState(279);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryPairContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DictionaryPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterDictionaryPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitDictionaryPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitDictionaryPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryPairContext dictionaryPair() throws RecognitionException {
		DictionaryPairContext _localctx = new DictionaryPairContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dictionaryPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			castExpression();
			setState(282);
			match(T__8);
			setState(283);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayExpressionContext extends ParserRuleContext {
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExpressionContext arrayExpression() throws RecognitionException {
		ArrayExpressionContext _localctx = new ArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__5);
			setState(286);
			match(T__9);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__5 - 5)) | (1L << (T__9 - 5)) | (1L << (T__12 - 5)) | (1L << (T__13 - 5)) | (1L << (T__14 - 5)) | (1L << (T__44 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (IDENTIFIER - 5)) | (1L << (DECIMAL_LITERAL - 5)) | (1L << (LP - 5)))) != 0) || ((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (SIZEOF - 120)) | (1L << (INC - 120)) | (1L << (DEC - 120)) | (1L << (BANG - 120)) | (1L << (HEX_LITERAL - 120)) | (1L << (OCTAL_LITERAL - 120)) | (1L << (BINARY_LITERAL - 120)) | (1L << (FLOATING_POINT_LITERAL - 120)) | (1L << (CHARACTER_LITERAL - 120)) | (1L << (NIL - 120)) | (1L << (NULL_ - 120)) | (1L << (YES - 120)) | (1L << (NO - 120)) | (1L << (TRUE - 120)) | (1L << (FALSE - 120)) | (1L << (STRING_START - 120)))) != 0)) {
				{
				setState(287);
				expressions();
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(288);
					match(T__0);
					}
				}

				}
			}

			setState(293);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockParametersContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public List<TypeVariableDeclaratorOrNameContext> typeVariableDeclaratorOrName() {
			return getRuleContexts(TypeVariableDeclaratorOrNameContext.class);
		}
		public TypeVariableDeclaratorOrNameContext typeVariableDeclaratorOrName(int i) {
			return getRuleContext(TypeVariableDeclaratorOrNameContext.class,i);
		}
		public BlockParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterBlockParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitBlockParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitBlockParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockParametersContext blockParameters() throws RecognitionException {
		BlockParametersContext _localctx = new BlockParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blockParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(LP);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IDENTIFIER - 66)) | (1L << (IB_OUTLET_COLLECTION - 66)) | (1L << (IB_OUTLET - 66)) | (1L << (WEAK_QUALIFIER - 66)) | (1L << (STRONG_QUALIFIER - 66)) | (1L << (AUTORELEASING_QUALIFIER - 66)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 66)) | (1L << (NULL_UNSPECIFIED - 66)) | (1L << (NULLABLE - 66)) | (1L << (NONNULL - 66)) | (1L << (NULL_RESETTABLE - 66)) | (1L << (AUTO - 66)) | (1L << (REGISTER - 66)) | (1L << (STATIC - 66)) | (1L << (EXTERN - 66)) | (1L << (BRIDGE - 66)) | (1L << (BRIDGE_TRANSFER - 66)) | (1L << (BRIDGE_RETAINED - 66)) | (1L << (BLOCK - 66)) | (1L << (INLINE - 66)) | (1L << (NS_INLINE - 66)) | (1L << (KINDOF - 66)) | (1L << (CONST - 66)) | (1L << (VOLATILE - 66)) | (1L << (RESTRICT - 66)) | (1L << (TYPEOF - 66)))) != 0)) {
				{
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(296);
					typeVariableDeclaratorOrName();
					}
					break;
				case 2:
					{
					setState(297);
					match(T__11);
					}
					break;
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(300);
					match(T__0);
					setState(301);
					typeVariableDeclaratorOrName();
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(309);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableDeclaratorOrNameContext extends ParserRuleContext {
		public TypeVariableDeclaratorContext typeVariableDeclarator() {
			return getRuleContext(TypeVariableDeclaratorContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeVariableDeclaratorOrNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariableDeclaratorOrName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterTypeVariableDeclaratorOrName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitTypeVariableDeclaratorOrName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitTypeVariableDeclaratorOrName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableDeclaratorOrNameContext typeVariableDeclaratorOrName() throws RecognitionException {
		TypeVariableDeclaratorOrNameContext _localctx = new TypeVariableDeclaratorOrNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeVariableDeclaratorOrName);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				typeVariableDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				typeName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockExpressionContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public NullabilitySpecifierContext nullabilitySpecifier() {
			return getRuleContext(NullabilitySpecifierContext.class,0);
		}
		public BlockParametersContext blockParameters() {
			return getRuleContext(BlockParametersContext.class,0);
		}
		public BlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitBlockExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockExpressionContext blockExpression() throws RecognitionException {
		BlockExpressionContext _localctx = new BlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__4);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0) || _la==IDENTIFIER || _la==TYPEOF) {
				{
				setState(316);
				typeSpecifier();
				}
			}

			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (NULL_UNSPECIFIED - 79)) | (1L << (NULLABLE - 79)) | (1L << (NONNULL - 79)) | (1L << (NULL_RESETTABLE - 79)))) != 0)) {
				{
				setState(319);
				nullabilitySpecifier();
				}
			}

			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(322);
				blockParameters();
				}
			}

			setState(325);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageExpressionContext extends ParserRuleContext {
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public MessageSelectorContext messageSelector() {
			return getRuleContext(MessageSelectorContext.class,0);
		}
		public MessageExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterMessageExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitMessageExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitMessageExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageExpressionContext messageExpression() throws RecognitionException {
		MessageExpressionContext _localctx = new MessageExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_messageExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__9);
			setState(328);
			receiver();
			setState(329);
			messageSelector();
			setState(330);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_receiver);
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				typeSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageSelectorContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<KeywordArgumentContext> keywordArgument() {
			return getRuleContexts(KeywordArgumentContext.class);
		}
		public KeywordArgumentContext keywordArgument(int i) {
			return getRuleContext(KeywordArgumentContext.class,i);
		}
		public MessageSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterMessageSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitMessageSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitMessageSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageSelectorContext messageSelector() throws RecognitionException {
		MessageSelectorContext _localctx = new MessageSelectorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_messageSelector);
		int _la;
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(337);
					keywordArgument();
					}
					}
					setState(340); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__8 - 4)) | (1L << (IDENTIFIER - 4)))) != 0) );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordArgumentContext extends ParserRuleContext {
		public List<KeywordArgumentTypeContext> keywordArgumentType() {
			return getRuleContexts(KeywordArgumentTypeContext.class);
		}
		public KeywordArgumentTypeContext keywordArgumentType(int i) {
			return getRuleContext(KeywordArgumentTypeContext.class,i);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public KeywordArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterKeywordArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitKeywordArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitKeywordArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordArgumentContext keywordArgument() throws RecognitionException {
		KeywordArgumentContext _localctx = new KeywordArgumentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_keywordArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==IDENTIFIER) {
				{
				setState(344);
				selector();
				}
			}

			setState(347);
			match(T__8);
			setState(348);
			keywordArgumentType();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(349);
				match(T__0);
				setState(350);
				keywordArgumentType();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordArgumentTypeContext extends ParserRuleContext {
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public NullabilitySpecifierContext nullabilitySpecifier() {
			return getRuleContext(NullabilitySpecifierContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public KeywordArgumentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordArgumentType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterKeywordArgumentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitKeywordArgumentType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitKeywordArgumentType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordArgumentTypeContext keywordArgumentType() throws RecognitionException {
		KeywordArgumentTypeContext _localctx = new KeywordArgumentTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_keywordArgumentType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			expressions();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (NULL_UNSPECIFIED - 79)) | (1L << (NULLABLE - 79)) | (1L << (NONNULL - 79)) | (1L << (NULL_RESETTABLE - 79)))) != 0)) {
				{
				setState(357);
				nullabilitySpecifier();
				}
			}

			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(360);
				match(T__6);
				setState(361);
				initializerList();
				setState(362);
				match(T__7);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorExpressionContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public SelectorNameContext selectorName() {
			return getRuleContext(SelectorNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public SelectorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitSelectorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitSelectorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorExpressionContext selectorExpression() throws RecognitionException {
		SelectorExpressionContext _localctx = new SelectorExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_selectorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(T__12);
			setState(367);
			match(LP);
			setState(368);
			selectorName();
			setState(369);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorNameContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public SelectorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterSelectorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitSelectorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitSelectorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorNameContext selectorName() throws RecognitionException {
		SelectorNameContext _localctx = new SelectorNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_selectorName);
		int _la;
		try {
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__3 || _la==IDENTIFIER) {
						{
						setState(372);
						selector();
						}
					}

					setState(375);
					match(T__8);
					}
					}
					setState(378); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__8 - 4)) | (1L << (IDENTIFIER - 4)))) != 0) );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolExpressionContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public ProtocolNameContext protocolName() {
			return getRuleContext(ProtocolNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public ProtocolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterProtocolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitProtocolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitProtocolExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolExpressionContext protocolExpression() throws RecognitionException {
		ProtocolExpressionContext _localctx = new ProtocolExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_protocolExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(T__13);
			setState(383);
			match(LP);
			setState(384);
			protocolName();
			setState(385);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EncodeExpressionContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public EncodeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encodeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterEncodeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitEncodeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitEncodeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncodeExpressionContext encodeExpression() throws RecognitionException {
		EncodeExpressionContext _localctx = new EncodeExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_encodeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__14);
			setState(388);
			match(LP);
			setState(389);
			typeName();
			setState(390);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableDeclaratorContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TypeVariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterTypeVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitTypeVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitTypeVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableDeclaratorContext typeVariableDeclarator() throws RecognitionException {
		TypeVariableDeclaratorContext _localctx = new TypeVariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeVariableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			declarationSpecifiers();
			setState(393);
			declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_throwStatement);
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(T__15);
				setState(396);
				match(LP);
				setState(397);
				identifier();
				setState(398);
				match(RP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(T__15);
				setState(401);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryBlockContext extends ParserRuleContext {
		public CompoundStatementContext tryStatement;
		public CompoundStatementContext finallyStatement;
		public List<CompoundStatementContext> compoundStatement() {
			return getRuleContexts(CompoundStatementContext.class);
		}
		public CompoundStatementContext compoundStatement(int i) {
			return getRuleContext(CompoundStatementContext.class,i);
		}
		public List<CatchStatementContext> catchStatement() {
			return getRuleContexts(CatchStatementContext.class);
		}
		public CatchStatementContext catchStatement(int i) {
			return getRuleContext(CatchStatementContext.class,i);
		}
		public TryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterTryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitTryBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitTryBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryBlockContext tryBlock() throws RecognitionException {
		TryBlockContext _localctx = new TryBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tryBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(T__16);
			setState(405);
			((TryBlockContext)_localctx).tryStatement = compoundStatement();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(406);
				catchStatement();
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(412);
				match(T__17);
				setState(413);
				((TryBlockContext)_localctx).finallyStatement = compoundStatement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchStatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public TypeVariableDeclaratorContext typeVariableDeclarator() {
			return getRuleContext(TypeVariableDeclaratorContext.class,0);
		}
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public CatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitCatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchStatementContext catchStatement() throws RecognitionException {
		CatchStatementContext _localctx = new CatchStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_catchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T__18);
			setState(417);
			match(LP);
			setState(418);
			typeVariableDeclarator();
			setState(419);
			match(RP);
			setState(420);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitSynchronizedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitSynchronizedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(T__19);
			setState(423);
			match(LP);
			setState(424);
			expression(0);
			setState(425);
			match(RP);
			setState(426);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AutoreleaseStatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public AutoreleaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoreleaseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterAutoreleaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitAutoreleaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitAutoreleaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutoreleaseStatementContext autoreleaseStatement() throws RecognitionException {
		AutoreleaseStatementContext _localctx = new AutoreleaseStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_autoreleaseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(T__20);
			setState(429);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			functionSignature();
			setState(432);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			functionSignature();
			setState(435);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSignatureContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public AttributeSpecifierContext attributeSpecifier() {
			return getRuleContext(AttributeSpecifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterFunctionSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitFunctionSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitFunctionSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSignatureContext functionSignature() throws RecognitionException {
		FunctionSignatureContext _localctx = new FunctionSignatureContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functionSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(437);
				declarationSpecifiers();
				}
				break;
			}
			setState(440);
			identifier();
			{
			setState(441);
			match(LP);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IDENTIFIER - 66)) | (1L << (IB_OUTLET_COLLECTION - 66)) | (1L << (IB_OUTLET - 66)) | (1L << (WEAK_QUALIFIER - 66)) | (1L << (STRONG_QUALIFIER - 66)) | (1L << (AUTORELEASING_QUALIFIER - 66)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 66)) | (1L << (AUTO - 66)) | (1L << (REGISTER - 66)) | (1L << (STATIC - 66)) | (1L << (EXTERN - 66)) | (1L << (BRIDGE - 66)) | (1L << (BRIDGE_TRANSFER - 66)) | (1L << (BRIDGE_RETAINED - 66)) | (1L << (BLOCK - 66)) | (1L << (INLINE - 66)) | (1L << (NS_INLINE - 66)) | (1L << (KINDOF - 66)) | (1L << (CONST - 66)) | (1L << (VOLATILE - 66)) | (1L << (RESTRICT - 66)) | (1L << (TYPEOF - 66)))) != 0)) {
				{
				setState(442);
				parameterList();
				}
			}

			setState(445);
			match(RP);
			}
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(447);
				attributeSpecifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public AttributeParametersContext attributeParameters() {
			return getRuleContext(AttributeParametersContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			attributeName();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(451);
				attributeParameters();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_attributeName);
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(T__22);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeParametersContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public AttributeParameterListContext attributeParameterList() {
			return getRuleContext(AttributeParameterListContext.class,0);
		}
		public AttributeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterAttributeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitAttributeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitAttributeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeParametersContext attributeParameters() throws RecognitionException {
		AttributeParametersContext _localctx = new AttributeParametersContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_attributeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(LP);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (T__22 - 23)) | (1L << (T__62 - 23)) | (1L << (T__63 - 23)) | (1L << (IDENTIFIER - 23)) | (1L << (DECIMAL_LITERAL - 23)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (HEX_LITERAL - 129)) | (1L << (OCTAL_LITERAL - 129)) | (1L << (BINARY_LITERAL - 129)) | (1L << (FLOATING_POINT_LITERAL - 129)) | (1L << (CHARACTER_LITERAL - 129)) | (1L << (NIL - 129)) | (1L << (NULL_ - 129)) | (1L << (YES - 129)) | (1L << (NO - 129)) | (1L << (TRUE - 129)) | (1L << (FALSE - 129)) | (1L << (STRING_START - 129)))) != 0)) {
				{
				setState(459);
				attributeParameterList();
				}
			}

			setState(462);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeParameterListContext extends ParserRuleContext {
		public List<AttributeParameterContext> attributeParameter() {
			return getRuleContexts(AttributeParameterContext.class);
		}
		public AttributeParameterContext attributeParameter(int i) {
			return getRuleContext(AttributeParameterContext.class,i);
		}
		public AttributeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterAttributeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitAttributeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitAttributeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeParameterListContext attributeParameterList() throws RecognitionException {
		AttributeParameterListContext _localctx = new AttributeParameterListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_attributeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			attributeParameter();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(465);
				match(T__0);
				setState(466);
				attributeParameter();
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeParameterContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public AttributeParameterAssignmentContext attributeParameterAssignment() {
			return getRuleContext(AttributeParameterAssignmentContext.class,0);
		}
		public AttributeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterAttributeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitAttributeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitAttributeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeParameterContext attributeParameter() throws RecognitionException {
		AttributeParameterContext _localctx = new AttributeParameterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_attributeParameter);
		try {
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				stringLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				attributeParameterAssignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeParameterAssignmentContext extends ParserRuleContext {
		public List<AttributeNameContext> attributeName() {
			return getRuleContexts(AttributeNameContext.class);
		}
		public AttributeNameContext attributeName(int i) {
			return getRuleContext(AttributeNameContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public AttributeParameterAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeParameterAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterAttributeParameterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitAttributeParameterAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitAttributeParameterAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeParameterAssignmentContext attributeParameterAssignment() throws RecognitionException {
		AttributeParameterAssignmentContext _localctx = new AttributeParameterAssignmentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_attributeParameterAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			attributeName();
			setState(479);
			match(T__23);
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__62:
			case T__63:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHARACTER_LITERAL:
			case NIL:
			case NULL_:
			case YES:
			case NO:
			case TRUE:
			case FALSE:
				{
				setState(480);
				constant();
				}
				break;
			case T__22:
			case IDENTIFIER:
				{
				setState(481);
				attributeName();
				}
				break;
			case STRING_START:
				{
				setState(482);
				stringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public FunctionCallExpressionContext functionCallExpression() {
			return getRuleContext(FunctionCallExpressionContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public TypedefDeclarationContext typedefDeclaration() {
			return getRuleContext(TypedefDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_declaration);
		try {
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				functionCallExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				varDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(488);
				typedefDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public List<AttributeSpecifierContext> attributeSpecifier() {
			return getRuleContexts(AttributeSpecifierContext.class);
		}
		public AttributeSpecifierContext attributeSpecifier(int i) {
			return getRuleContext(AttributeSpecifierContext.class,i);
		}
		public FunctionCallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallExpressionContext functionCallExpression() throws RecognitionException {
		FunctionCallExpressionContext _localctx = new FunctionCallExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_functionCallExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(491);
				attributeSpecifier();
				}
			}

			setState(494);
			identifier();
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(495);
				attributeSpecifier();
				}
			}

			setState(498);
			match(LP);
			setState(499);
			directDeclarator();
			setState(500);
			match(RP);
			setState(501);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public AttributeSpecifierContext attributeSpecifier() {
			return getRuleContext(AttributeSpecifierContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(GramParser.TYPEDEF, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(503);
				attributeSpecifier();
				}
			}

			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPEDEF) {
				{
				setState(506);
				match(TYPEDEF);
				}
			}

			setState(509);
			enumSpecifier();
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(510);
				identifier();
				}
			}

			setState(513);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(515);
				declarationSpecifiers();
				setState(516);
				initDeclaratorList();
				}
				break;
			case 2:
				{
				setState(518);
				declarationSpecifiers();
				}
				break;
			}
			setState(521);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefDeclarationContext extends ParserRuleContext {
		public TerminalNode TYPEDEF() { return getToken(GramParser.TYPEDEF, 0); }
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public TypeDeclaratorListContext typeDeclaratorList() {
			return getRuleContext(TypeDeclaratorListContext.class,0);
		}
		public AttributeSpecifierContext attributeSpecifier() {
			return getRuleContext(AttributeSpecifierContext.class,0);
		}
		public TypedefDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterTypedefDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitTypedefDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitTypedefDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefDeclarationContext typedefDeclaration() throws RecognitionException {
		TypedefDeclarationContext _localctx = new TypedefDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typedefDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(523);
				attributeSpecifier();
				}
			}

			setState(526);
			match(TYPEDEF);
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(527);
				declarationSpecifiers();
				setState(528);
				typeDeclaratorList();
				}
				break;
			case 2:
				{
				setState(530);
				declarationSpecifiers();
				}
				break;
			}
			setState(533);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclaratorListContext extends ParserRuleContext {
		public List<TypeDeclaratorContext> typeDeclarator() {
			return getRuleContexts(TypeDeclaratorContext.class);
		}
		public TypeDeclaratorContext typeDeclarator(int i) {
			return getRuleContext(TypeDeclaratorContext.class,i);
		}
		public TypeDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterTypeDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitTypeDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitTypeDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclaratorListContext typeDeclaratorList() throws RecognitionException {
		TypeDeclaratorListContext _localctx = new TypeDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			typeDeclarator();
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(536);
				match(T__0);
				setState(537);
				typeDeclarator();
				}
				}
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TypeDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterTypeDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitTypeDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitTypeDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclaratorContext typeDeclarator() throws RecognitionException {
		TypeDeclaratorContext _localctx = new TypeDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(543);
				pointer();
				}
			}

			setState(546);
			directDeclarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public AttributeSpecifierContext attributeSpecifier() {
			return getRuleContext(AttributeSpecifierContext.class,0);
		}
		public ArcBehaviourSpecifierContext arcBehaviourSpecifier() {
			return getRuleContext(ArcBehaviourSpecifierContext.class,0);
		}
		public IbOutletQualifierContext ibOutletQualifier() {
			return getRuleContext(IbOutletQualifierContext.class,0);
		}
		public TypePrefixContext typePrefix() {
			return getRuleContext(TypePrefixContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterDeclarationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitDeclarationSpecifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitDeclarationSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_declarationSpecifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO:
			case REGISTER:
			case STATIC:
			case EXTERN:
				{
				setState(548);
				storageClassSpecifier();
				}
				break;
			case T__24:
				{
				setState(549);
				attributeSpecifier();
				}
				break;
			case WEAK_QUALIFIER:
			case STRONG_QUALIFIER:
			case AUTORELEASING_QUALIFIER:
			case UNSAFE_UNRETAINED_QUALIFIER:
				{
				setState(550);
				arcBehaviourSpecifier();
				}
				break;
			case IB_OUTLET_COLLECTION:
			case IB_OUTLET:
				{
				setState(551);
				ibOutletQualifier();
				}
				break;
			case BRIDGE:
			case BRIDGE_TRANSFER:
			case BRIDGE_RETAINED:
			case BLOCK:
			case INLINE:
			case NS_INLINE:
			case KINDOF:
				{
				setState(552);
				typePrefix();
				}
				break;
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case CONST:
			case VOLATILE:
			case RESTRICT:
				{
				setState(553);
				typeQualifier();
				}
				break;
			case T__11:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case IDENTIFIER:
			case TYPEOF:
				{
				setState(554);
				typeSpecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeSpecifierContext extends ParserRuleContext {
		public List<TerminalNode> LP() { return getTokens(GramParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(GramParser.LP, i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> RP() { return getTokens(GramParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(GramParser.RP, i);
		}
		public AttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterAttributeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitAttributeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitAttributeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSpecifierContext attributeSpecifier() throws RecognitionException {
		AttributeSpecifierContext _localctx = new AttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_attributeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(T__24);
			setState(558);
			match(LP);
			setState(559);
			match(LP);
			setState(560);
			attribute();
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(561);
				match(T__0);
				setState(562);
				attribute();
				}
				}
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(568);
			match(RP);
			setState(569);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			initDeclarator();
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(572);
				match(T__0);
				setState(573);
				initDeclarator();
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitInitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			declarator();
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(580);
				match(T__23);
				setState(581);
				initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public List<ArcBehaviourSpecifierContext> arcBehaviourSpecifier() {
			return getRuleContexts(ArcBehaviourSpecifierContext.class);
		}
		public ArcBehaviourSpecifierContext arcBehaviourSpecifier(int i) {
			return getRuleContext(ArcBehaviourSpecifierContext.class,i);
		}
		public List<NullabilitySpecifierContext> nullabilitySpecifier() {
			return getRuleContexts(NullabilitySpecifierContext.class);
		}
		public NullabilitySpecifierContext nullabilitySpecifier(int i) {
			return getRuleContext(NullabilitySpecifierContext.class,i);
		}
		public List<IbOutletQualifierContext> ibOutletQualifier() {
			return getRuleContexts(IbOutletQualifierContext.class);
		}
		public IbOutletQualifierContext ibOutletQualifier(int i) {
			return getRuleContext(IbOutletQualifierContext.class,i);
		}
		public List<TypePrefixContext> typePrefix() {
			return getRuleContexts(TypePrefixContext.class);
		}
		public TypePrefixContext typePrefix(int i) {
			return getRuleContext(TypePrefixContext.class,i);
		}
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class,i);
		}
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterSpecifierQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitSpecifierQualifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitSpecifierQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_specifierQualifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(590); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(590);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WEAK_QUALIFIER:
					case STRONG_QUALIFIER:
					case AUTORELEASING_QUALIFIER:
					case UNSAFE_UNRETAINED_QUALIFIER:
						{
						setState(584);
						arcBehaviourSpecifier();
						}
						break;
					case NULL_UNSPECIFIED:
					case NULLABLE:
					case NONNULL:
					case NULL_RESETTABLE:
						{
						setState(585);
						nullabilitySpecifier();
						}
						break;
					case IB_OUTLET_COLLECTION:
					case IB_OUTLET:
						{
						setState(586);
						ibOutletQualifier();
						}
						break;
					case BRIDGE:
					case BRIDGE_TRANSFER:
					case BRIDGE_RETAINED:
					case BLOCK:
					case INLINE:
					case NS_INLINE:
					case KINDOF:
						{
						setState(587);
						typePrefix();
						}
						break;
					case T__25:
					case T__26:
					case T__27:
					case T__28:
					case T__29:
					case T__30:
					case CONST:
					case VOLATILE:
					case RESTRICT:
						{
						setState(588);
						typeQualifier();
						}
						break;
					case T__11:
					case T__31:
					case T__32:
					case T__33:
					case T__34:
					case T__35:
					case T__36:
					case T__37:
					case T__38:
					case IDENTIFIER:
					case TYPEOF:
						{
						setState(589);
						typeSpecifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(592); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IbOutletQualifierContext extends ParserRuleContext {
		public TerminalNode IB_OUTLET_COLLECTION() { return getToken(GramParser.IB_OUTLET_COLLECTION, 0); }
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public TerminalNode IB_OUTLET() { return getToken(GramParser.IB_OUTLET, 0); }
		public IbOutletQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ibOutletQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterIbOutletQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitIbOutletQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitIbOutletQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IbOutletQualifierContext ibOutletQualifier() throws RecognitionException {
		IbOutletQualifierContext _localctx = new IbOutletQualifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_ibOutletQualifier);
		try {
			setState(600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IB_OUTLET_COLLECTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(594);
				match(IB_OUTLET_COLLECTION);
				setState(595);
				match(LP);
				setState(596);
				identifier();
				setState(597);
				match(RP);
				}
				break;
			case IB_OUTLET:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				match(IB_OUTLET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArcBehaviourSpecifierContext extends ParserRuleContext {
		public TerminalNode WEAK_QUALIFIER() { return getToken(GramParser.WEAK_QUALIFIER, 0); }
		public TerminalNode STRONG_QUALIFIER() { return getToken(GramParser.STRONG_QUALIFIER, 0); }
		public TerminalNode AUTORELEASING_QUALIFIER() { return getToken(GramParser.AUTORELEASING_QUALIFIER, 0); }
		public TerminalNode UNSAFE_UNRETAINED_QUALIFIER() { return getToken(GramParser.UNSAFE_UNRETAINED_QUALIFIER, 0); }
		public ArcBehaviourSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arcBehaviourSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterArcBehaviourSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitArcBehaviourSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitArcBehaviourSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArcBehaviourSpecifierContext arcBehaviourSpecifier() throws RecognitionException {
		ArcBehaviourSpecifierContext _localctx = new ArcBehaviourSpecifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_arcBehaviourSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (WEAK_QUALIFIER - 75)) | (1L << (STRONG_QUALIFIER - 75)) | (1L << (AUTORELEASING_QUALIFIER - 75)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 75)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullabilitySpecifierContext extends ParserRuleContext {
		public TerminalNode NULL_UNSPECIFIED() { return getToken(GramParser.NULL_UNSPECIFIED, 0); }
		public TerminalNode NULLABLE() { return getToken(GramParser.NULLABLE, 0); }
		public TerminalNode NONNULL() { return getToken(GramParser.NONNULL, 0); }
		public TerminalNode NULL_RESETTABLE() { return getToken(GramParser.NULL_RESETTABLE, 0); }
		public NullabilitySpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullabilitySpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterNullabilitySpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitNullabilitySpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitNullabilitySpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullabilitySpecifierContext nullabilitySpecifier() throws RecognitionException {
		NullabilitySpecifierContext _localctx = new NullabilitySpecifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_nullabilitySpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (NULL_UNSPECIFIED - 79)) | (1L << (NULLABLE - 79)) | (1L << (NONNULL - 79)) | (1L << (NULL_RESETTABLE - 79)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode AUTO() { return getToken(GramParser.AUTO, 0); }
		public TerminalNode REGISTER() { return getToken(GramParser.REGISTER, 0); }
		public TerminalNode STATIC() { return getToken(GramParser.STATIC, 0); }
		public TerminalNode EXTERN() { return getToken(GramParser.EXTERN, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitStorageClassSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitStorageClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (AUTO - 83)) | (1L << (REGISTER - 83)) | (1L << (STATIC - 83)) | (1L << (EXTERN - 83)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypePrefixContext extends ParserRuleContext {
		public TerminalNode BRIDGE() { return getToken(GramParser.BRIDGE, 0); }
		public TerminalNode BRIDGE_TRANSFER() { return getToken(GramParser.BRIDGE_TRANSFER, 0); }
		public TerminalNode BRIDGE_RETAINED() { return getToken(GramParser.BRIDGE_RETAINED, 0); }
		public TerminalNode BLOCK() { return getToken(GramParser.BLOCK, 0); }
		public TerminalNode INLINE() { return getToken(GramParser.INLINE, 0); }
		public TerminalNode NS_INLINE() { return getToken(GramParser.NS_INLINE, 0); }
		public TerminalNode KINDOF() { return getToken(GramParser.KINDOF, 0); }
		public TypePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterTypePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitTypePrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitTypePrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePrefixContext typePrefix() throws RecognitionException {
		TypePrefixContext _localctx = new TypePrefixContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_typePrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (BRIDGE - 87)) | (1L << (BRIDGE_TRANSFER - 87)) | (1L << (BRIDGE_RETAINED - 87)) | (1L << (BLOCK - 87)) | (1L << (INLINE - 87)) | (1L << (NS_INLINE - 87)) | (1L << (KINDOF - 87)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(GramParser.CONST, 0); }
		public TerminalNode VOLATILE() { return getToken(GramParser.VOLATILE, 0); }
		public TerminalNode RESTRICT() { return getToken(GramParser.RESTRICT, 0); }
		public ProtocolQualifierContext protocolQualifier() {
			return getRuleContext(ProtocolQualifierContext.class,0);
		}
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitTypeQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_typeQualifier);
		try {
			setState(614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				match(CONST);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				match(VOLATILE);
				}
				break;
			case RESTRICT:
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
				match(RESTRICT);
				}
				break;
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(613);
				protocolQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolQualifierContext extends ParserRuleContext {
		public ProtocolQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterProtocolQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitProtocolQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitProtocolQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolQualifierContext protocolQualifier() throws RecognitionException {
		ProtocolQualifierContext _localctx = new ProtocolQualifierContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_protocolQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TypeofExpressionContext typeofExpression() {
			return getRuleContext(TypeofExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_typeSpecifier);
		try {
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				match(T__11);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(620);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 4);
				{
				setState(621);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(622);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 6);
				{
				setState(623);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 7);
				{
				setState(624);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 8);
				{
				setState(625);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 9);
				{
				setState(626);
				match(T__38);
				}
				break;
			case TYPEOF:
				enterOuterAlt(_localctx, 10);
				{
				setState(627);
				typeofExpression();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 11);
				{
				setState(628);
				identifier();
				setState(630);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(629);
					pointer();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeofExpressionContext extends ParserRuleContext {
		public TerminalNode TYPEOF() { return getToken(GramParser.TYPEOF, 0); }
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public TypeofExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeofExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterTypeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitTypeofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitTypeofExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeofExpressionContext typeofExpression() throws RecognitionException {
		TypeofExpressionContext _localctx = new TypeofExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_typeofExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(TYPEOF);
			{
			setState(635);
			match(LP);
			setState(636);
			expression(0);
			setState(637);
			match(RP);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumSpecifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterEnumSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitEnumSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitEnumSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_enumSpecifier);
		int _la;
		try {
			setState(670);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				match(T__39);
				setState(645);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(641);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENTIFIER) {
						{
						setState(640);
						identifier();
						}
					}

					setState(643);
					match(T__8);
					setState(644);
					typeName();
					}
					break;
				}
				setState(658);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(647);
					identifier();
					setState(652);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(648);
						match(T__6);
						setState(649);
						enumeratorList();
						setState(650);
						match(T__7);
						}
					}

					}
					break;
				case T__6:
					{
					setState(654);
					match(T__6);
					setState(655);
					enumeratorList();
					setState(656);
					match(T__7);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__40:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				_la = _input.LA(1);
				if ( !(_la==T__40 || _la==T__41) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(661);
				match(LP);
				setState(662);
				typeName();
				setState(663);
				match(T__0);
				setState(664);
				identifier();
				setState(665);
				match(RP);
				setState(666);
				match(T__6);
				setState(667);
				enumeratorList();
				setState(668);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorListContext extends ParserRuleContext {
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterEnumeratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitEnumeratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitEnumeratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_enumeratorList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			enumerator();
			setState(677);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(673);
					match(T__0);
					setState(674);
					enumerator();
					}
					} 
				}
				setState(679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(680);
				match(T__0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public EnumeratorIdentifierContext enumeratorIdentifier() {
			return getRuleContext(EnumeratorIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitEnumerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			enumeratorIdentifier();
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(684);
				match(T__23);
				setState(685);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumeratorIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterEnumeratorIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitEnumeratorIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitEnumeratorIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorIdentifierContext enumeratorIdentifier() throws RecognitionException {
		EnumeratorIdentifierContext _localctx = new EnumeratorIdentifierContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_enumeratorIdentifier);
		try {
			setState(690);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				identifier();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				match(T__42);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public List<DeclaratorSuffixContext> declaratorSuffix() {
			return getRuleContexts(DeclaratorSuffixContext.class);
		}
		public DeclaratorSuffixContext declaratorSuffix(int i) {
			return getRuleContext(DeclaratorSuffixContext.class,i);
		}
		public BlockParametersContext blockParameters() {
			return getRuleContext(BlockParametersContext.class,0);
		}
		public NullabilitySpecifierContext nullabilitySpecifier() {
			return getRuleContext(NullabilitySpecifierContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterDirectDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitDirectDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitDirectDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_directDeclarator);
		int _la;
		try {
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(692);
					identifier();
					}
					break;
				case LP:
					{
					setState(693);
					match(LP);
					setState(694);
					declarator();
					setState(695);
					match(RP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(699);
					declaratorSuffix();
					}
					}
					setState(704);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				match(LP);
				setState(706);
				match(T__4);
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (NULL_UNSPECIFIED - 79)) | (1L << (NULLABLE - 79)) | (1L << (NONNULL - 79)) | (1L << (NULL_RESETTABLE - 79)))) != 0)) {
					{
					setState(707);
					nullabilitySpecifier();
					}
				}

				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(710);
					identifier();
					}
				}

				setState(713);
				match(RP);
				setState(714);
				blockParameters();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorSuffixContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public DeclaratorSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterDeclaratorSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitDeclaratorSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitDeclaratorSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorSuffixContext declaratorSuffix() throws RecognitionException {
		DeclaratorSuffixContext _localctx = new DeclaratorSuffixContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_declaratorSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(T__9);
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__63 - 63)) | (1L << (IDENTIFIER - 63)) | (1L << (DECIMAL_LITERAL - 63)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (HEX_LITERAL - 129)) | (1L << (OCTAL_LITERAL - 129)) | (1L << (BINARY_LITERAL - 129)) | (1L << (FLOATING_POINT_LITERAL - 129)) | (1L << (CHARACTER_LITERAL - 129)) | (1L << (NIL - 129)) | (1L << (NULL_ - 129)) | (1L << (YES - 129)) | (1L << (NO - 129)) | (1L << (TRUE - 129)) | (1L << (FALSE - 129)))) != 0)) {
				{
				setState(718);
				constantExpression();
				}
			}

			setState(721);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterDeclarationListContext parameterDeclarationList() {
			return getRuleContext(ParameterDeclarationListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			parameterDeclarationList();
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(724);
				match(T__0);
				setState(725);
				match(T__43);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(T__44);
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(729);
				declarationSpecifiers();
				}
				break;
			}
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(732);
				pointer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(T__6);
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__5 - 5)) | (1L << (T__9 - 5)) | (1L << (T__12 - 5)) | (1L << (T__13 - 5)) | (1L << (T__14 - 5)) | (1L << (T__44 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (IDENTIFIER - 5)) | (1L << (DECIMAL_LITERAL - 5)) | (1L << (LP - 5)))) != 0) || ((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (SIZEOF - 120)) | (1L << (INC - 120)) | (1L << (DEC - 120)) | (1L << (BANG - 120)) | (1L << (HEX_LITERAL - 120)) | (1L << (OCTAL_LITERAL - 120)) | (1L << (BINARY_LITERAL - 120)) | (1L << (FLOATING_POINT_LITERAL - 120)) | (1L << (CHARACTER_LITERAL - 120)) | (1L << (NIL - 120)) | (1L << (NULL_ - 120)) | (1L << (YES - 120)) | (1L << (NO - 120)) | (1L << (TRUE - 120)) | (1L << (FALSE - 120)) | (1L << (STRING_START - 120)))) != 0)) {
				{
				setState(736);
				expressions();
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(737);
					match(T__0);
					}
				}

				}
			}

			setState(742);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructInitializerContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StructInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterStructInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitStructInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitStructInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructInitializerContext structInitializer() throws RecognitionException {
		StructInitializerContext _localctx = new StructInitializerContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_structInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(T__6);
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(745);
				match(T__45);
				setState(746);
				expression(0);
				setState(752);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(747);
						match(T__0);
						setState(748);
						match(T__45);
						setState(749);
						expression(0);
						}
						} 
					}
					setState(754);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(755);
					match(T__0);
					}
				}

				}
			}

			setState(760);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			initializer();
			setState(767);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(763);
					match(T__0);
					setState(764);
					initializer();
					}
					} 
				}
				setState(769);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(770);
				match(T__0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public BlockTypeContext blockType() {
			return getRuleContext(BlockTypeContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_typeName);
		int _la;
		try {
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				specifierQualifierList();
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__44 - 10)) | (1L << (LP - 10)))) != 0)) {
					{
					setState(774);
					abstractDeclarator();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(777);
				blockType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public List<AbstractDeclaratorSuffixContext> abstractDeclaratorSuffix() {
			return getRuleContexts(AbstractDeclaratorSuffixContext.class);
		}
		public AbstractDeclaratorSuffixContext abstractDeclaratorSuffix(int i) {
			return getRuleContext(AbstractDeclaratorSuffixContext.class,i);
		}
		public List<ConstantExpressionContext> constantExpression() {
			return getRuleContexts(ConstantExpressionContext.class);
		}
		public ConstantExpressionContext constantExpression(int i) {
			return getRuleContext(ConstantExpressionContext.class,i);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_abstractDeclarator);
		int _la;
		try {
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				pointer();
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__44 - 10)) | (1L << (LP - 10)))) != 0)) {
					{
					setState(781);
					abstractDeclarator();
					}
				}

				}
				break;
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				match(LP);
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__44 - 10)) | (1L << (LP - 10)))) != 0)) {
					{
					setState(785);
					abstractDeclarator();
					}
				}

				setState(788);
				match(RP);
				setState(790); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(789);
					abstractDeclaratorSuffix();
					}
					}
					setState(792); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__9 || _la==LP );
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(799); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(794);
					match(T__9);
					setState(796);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__63 - 63)) | (1L << (IDENTIFIER - 63)) | (1L << (DECIMAL_LITERAL - 63)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (HEX_LITERAL - 129)) | (1L << (OCTAL_LITERAL - 129)) | (1L << (BINARY_LITERAL - 129)) | (1L << (FLOATING_POINT_LITERAL - 129)) | (1L << (CHARACTER_LITERAL - 129)) | (1L << (NIL - 129)) | (1L << (NULL_ - 129)) | (1L << (YES - 129)) | (1L << (NO - 129)) | (1L << (TRUE - 129)) | (1L << (FALSE - 129)))) != 0)) {
						{
						setState(795);
						constantExpression();
						}
					}

					setState(798);
					match(T__10);
					}
					}
					setState(801); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__9 );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractDeclaratorSuffixContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public ParameterDeclarationListContext parameterDeclarationList() {
			return getRuleContext(ParameterDeclarationListContext.class,0);
		}
		public AbstractDeclaratorSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclaratorSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterAbstractDeclaratorSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitAbstractDeclaratorSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitAbstractDeclaratorSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorSuffixContext abstractDeclaratorSuffix() throws RecognitionException {
		AbstractDeclaratorSuffixContext _localctx = new AbstractDeclaratorSuffixContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_abstractDeclaratorSuffix);
		int _la;
		try {
			setState(815);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				match(T__9);
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__63 - 63)) | (1L << (IDENTIFIER - 63)) | (1L << (DECIMAL_LITERAL - 63)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (HEX_LITERAL - 129)) | (1L << (OCTAL_LITERAL - 129)) | (1L << (BINARY_LITERAL - 129)) | (1L << (FLOATING_POINT_LITERAL - 129)) | (1L << (CHARACTER_LITERAL - 129)) | (1L << (NIL - 129)) | (1L << (NULL_ - 129)) | (1L << (YES - 129)) | (1L << (NO - 129)) | (1L << (TRUE - 129)) | (1L << (FALSE - 129)))) != 0)) {
					{
					setState(806);
					constantExpression();
					}
				}

				setState(809);
				match(T__10);
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				match(LP);
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IDENTIFIER - 66)) | (1L << (IB_OUTLET_COLLECTION - 66)) | (1L << (IB_OUTLET - 66)) | (1L << (WEAK_QUALIFIER - 66)) | (1L << (STRONG_QUALIFIER - 66)) | (1L << (AUTORELEASING_QUALIFIER - 66)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 66)) | (1L << (AUTO - 66)) | (1L << (REGISTER - 66)) | (1L << (STATIC - 66)) | (1L << (EXTERN - 66)) | (1L << (BRIDGE - 66)) | (1L << (BRIDGE_TRANSFER - 66)) | (1L << (BRIDGE_RETAINED - 66)) | (1L << (BLOCK - 66)) | (1L << (INLINE - 66)) | (1L << (NS_INLINE - 66)) | (1L << (KINDOF - 66)) | (1L << (CONST - 66)) | (1L << (VOLATILE - 66)) | (1L << (RESTRICT - 66)) | (1L << (TYPEOF - 66)))) != 0)) {
					{
					setState(811);
					parameterDeclarationList();
					}
				}

				setState(814);
				match(RP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public ParameterDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterParameterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitParameterDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitParameterDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationListContext parameterDeclarationList() throws RecognitionException {
		ParameterDeclarationListContext _localctx = new ParameterDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_parameterDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			parameterDeclaration();
			setState(822);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(818);
					match(T__0);
					setState(819);
					parameterDeclaration();
					}
					} 
				}
				setState(824);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_parameterDeclaration);
		try {
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(825);
				declarationSpecifiers();
				setState(826);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				match(T__11);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(831);
				pointer();
				}
			}

			setState(834);
			directDeclarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public AutoreleaseStatementContext autoreleaseStatement() {
			return getRuleContext(AutoreleaseStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryBlockContext tryBlock() {
			return getRuleContext(TryBlockContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_statement);
		try {
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(836);
				labeledStatement();
				setState(838);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(837);
					match(T__21);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				compoundStatement();
				setState(842);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(841);
					match(T__21);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(844);
				selectionStatement();
				setState(846);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(845);
					match(T__21);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(848);
				iterationStatement();
				setState(850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(849);
					match(T__21);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(852);
				jumpStatement();
				setState(854);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(853);
					match(T__21);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(856);
				synchronizedStatement();
				setState(858);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(857);
					match(T__21);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(860);
				autoreleaseStatement();
				setState(862);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(861);
					match(T__21);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(864);
				throwStatement();
				setState(866);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(865);
					match(T__21);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(868);
				tryBlock();
				setState(870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(869);
					match(T__21);
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(872);
				expressions();
				setState(874);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(873);
					match(T__21);
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(876);
				match(T__21);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			identifier();
			setState(880);
			match(T__8);
			setState(881);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeExpressionContext extends ParserRuleContext {
		public List<ConstantExpressionContext> constantExpression() {
			return getRuleContexts(ConstantExpressionContext.class);
		}
		public ConstantExpressionContext constantExpression(int i) {
			return getRuleContext(ConstantExpressionContext.class,i);
		}
		public RangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitRangeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitRangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeExpressionContext rangeExpression() throws RecognitionException {
		RangeExpressionContext _localctx = new RangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_rangeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			constantExpression();
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(884);
				match(T__43);
				setState(885);
				constantExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(T__6);
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__46) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (LP - 64)) | (1L << (TYPEDEF - 64)) | (1L << (IB_OUTLET_COLLECTION - 64)) | (1L << (IB_OUTLET - 64)) | (1L << (WEAK_QUALIFIER - 64)) | (1L << (STRONG_QUALIFIER - 64)) | (1L << (AUTORELEASING_QUALIFIER - 64)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (STATIC - 64)) | (1L << (EXTERN - 64)) | (1L << (BRIDGE - 64)) | (1L << (BRIDGE_TRANSFER - 64)) | (1L << (BRIDGE_RETAINED - 64)) | (1L << (BLOCK - 64)) | (1L << (INLINE - 64)) | (1L << (NS_INLINE - 64)) | (1L << (KINDOF - 64)) | (1L << (CONST - 64)) | (1L << (VOLATILE - 64)) | (1L << (RESTRICT - 64)) | (1L << (TYPEOF - 64)) | (1L << (IF - 64)) | (1L << (GOTO - 64)) | (1L << (CONTINUE - 64)) | (1L << (BREAK - 64)) | (1L << (RETURN - 64)) | (1L << (SIZEOF - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (BANG - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (HEX_LITERAL - 129)) | (1L << (OCTAL_LITERAL - 129)) | (1L << (BINARY_LITERAL - 129)) | (1L << (FLOATING_POINT_LITERAL - 129)) | (1L << (CHARACTER_LITERAL - 129)) | (1L << (NIL - 129)) | (1L << (NULL_ - 129)) | (1L << (YES - 129)) | (1L << (NO - 129)) | (1L << (TRUE - 129)) | (1L << (FALSE - 129)) | (1L << (STRING_START - 129)))) != 0)) {
				{
				setState(891);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(889);
					declaration();
					}
					break;
				case 2:
					{
					setState(890);
					statement();
					}
					break;
				}
				}
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(896);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public StatementContext ifBody;
		public StatementContext elseBody;
		public TerminalNode IF() { return getToken(GramParser.IF, 0); }
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GramParser.ELSE, 0); }
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_selectionStatement);
		try {
			setState(908);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(898);
				match(IF);
				setState(899);
				match(LP);
				setState(900);
				expression(0);
				setState(901);
				match(RP);
				setState(902);
				((SelectionStatementContext)_localctx).ifBody = statement();
				setState(905);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(903);
					match(ELSE);
					setState(904);
					((SelectionStatementContext)_localctx).elseBody = statement();
					}
					break;
				}
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
				setState(907);
				switchStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(T__46);
			setState(911);
			match(LP);
			setState(912);
			expression(0);
			setState(913);
			match(RP);
			setState(914);
			switchBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public List<SwitchSectionContext> switchSection() {
			return getRuleContexts(SwitchSectionContext.class);
		}
		public SwitchSectionContext switchSection(int i) {
			return getRuleContext(SwitchSectionContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(T__6);
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42 || _la==T__47) {
				{
				{
				setState(917);
				switchSection();
				}
				}
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(923);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchSectionContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SwitchSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterSwitchSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitSwitchSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitSwitchSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchSectionContext switchSection() throws RecognitionException {
		SwitchSectionContext _localctx = new SwitchSectionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_switchSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(925);
				switchLabel();
				}
				}
				setState(928); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__42 || _la==T__47 );
			setState(931); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(930);
				statement();
				}
				}
				setState(933); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__5 - 5)) | (1L << (T__6 - 5)) | (1L << (T__9 - 5)) | (1L << (T__12 - 5)) | (1L << (T__13 - 5)) | (1L << (T__14 - 5)) | (1L << (T__15 - 5)) | (1L << (T__16 - 5)) | (1L << (T__19 - 5)) | (1L << (T__20 - 5)) | (1L << (T__21 - 5)) | (1L << (T__44 - 5)) | (1L << (T__46 - 5)) | (1L << (T__48 - 5)) | (1L << (T__49 - 5)) | (1L << (T__50 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (IDENTIFIER - 5)) | (1L << (DECIMAL_LITERAL - 5)) | (1L << (LP - 5)))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (IF - 98)) | (1L << (GOTO - 98)) | (1L << (CONTINUE - 98)) | (1L << (BREAK - 98)) | (1L << (RETURN - 98)) | (1L << (SIZEOF - 98)) | (1L << (INC - 98)) | (1L << (DEC - 98)) | (1L << (BANG - 98)) | (1L << (HEX_LITERAL - 98)) | (1L << (OCTAL_LITERAL - 98)) | (1L << (BINARY_LITERAL - 98)) | (1L << (FLOATING_POINT_LITERAL - 98)) | (1L << (CHARACTER_LITERAL - 98)) | (1L << (NIL - 98)) | (1L << (NULL_ - 98)) | (1L << (YES - 98)) | (1L << (NO - 98)) | (1L << (TRUE - 98)) | (1L << (FALSE - 98)) | (1L << (STRING_START - 98)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public RangeExpressionContext rangeExpression() {
			return getRuleContext(RangeExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_switchLabel);
		try {
			setState(947);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
				enterOuterAlt(_localctx, 1);
				{
				setState(935);
				match(T__47);
				setState(941);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__62:
				case T__63:
				case IDENTIFIER:
				case DECIMAL_LITERAL:
				case HEX_LITERAL:
				case OCTAL_LITERAL:
				case BINARY_LITERAL:
				case FLOATING_POINT_LITERAL:
				case CHARACTER_LITERAL:
				case NIL:
				case NULL_:
				case YES:
				case NO:
				case TRUE:
				case FALSE:
					{
					setState(936);
					rangeExpression();
					}
					break;
				case LP:
					{
					setState(937);
					match(LP);
					setState(938);
					rangeExpression();
					setState(939);
					match(RP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(943);
				match(T__8);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(945);
				match(T__42);
				setState(946);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForInStatementContext forInStatement() {
			return getRuleContext(ForInStatementContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_iterationStatement);
		try {
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				whileStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				doStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(951);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(952);
				forInStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(T__48);
			setState(956);
			match(LP);
			setState(957);
			expression(0);
			setState(958);
			match(RP);
			setState(959);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(T__49);
			setState(962);
			statement();
			setState(963);
			match(T__48);
			setState(964);
			match(LP);
			setState(965);
			expression(0);
			setState(966);
			match(RP);
			setState(967);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForLoopInitializerContext forLoopInitializer() {
			return getRuleContext(ForLoopInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			match(T__50);
			setState(970);
			match(LP);
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__44) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (LP - 64)) | (1L << (IB_OUTLET_COLLECTION - 64)) | (1L << (IB_OUTLET - 64)) | (1L << (WEAK_QUALIFIER - 64)) | (1L << (STRONG_QUALIFIER - 64)) | (1L << (AUTORELEASING_QUALIFIER - 64)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (STATIC - 64)) | (1L << (EXTERN - 64)) | (1L << (BRIDGE - 64)) | (1L << (BRIDGE_TRANSFER - 64)) | (1L << (BRIDGE_RETAINED - 64)) | (1L << (BLOCK - 64)) | (1L << (INLINE - 64)) | (1L << (NS_INLINE - 64)) | (1L << (KINDOF - 64)) | (1L << (CONST - 64)) | (1L << (VOLATILE - 64)) | (1L << (RESTRICT - 64)) | (1L << (TYPEOF - 64)) | (1L << (SIZEOF - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (BANG - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (HEX_LITERAL - 129)) | (1L << (OCTAL_LITERAL - 129)) | (1L << (BINARY_LITERAL - 129)) | (1L << (FLOATING_POINT_LITERAL - 129)) | (1L << (CHARACTER_LITERAL - 129)) | (1L << (NIL - 129)) | (1L << (NULL_ - 129)) | (1L << (YES - 129)) | (1L << (NO - 129)) | (1L << (TRUE - 129)) | (1L << (FALSE - 129)) | (1L << (STRING_START - 129)))) != 0)) {
				{
				setState(971);
				forLoopInitializer();
				}
			}

			setState(974);
			match(T__21);
			setState(976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__5 - 5)) | (1L << (T__9 - 5)) | (1L << (T__12 - 5)) | (1L << (T__13 - 5)) | (1L << (T__14 - 5)) | (1L << (T__44 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (IDENTIFIER - 5)) | (1L << (DECIMAL_LITERAL - 5)) | (1L << (LP - 5)))) != 0) || ((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (SIZEOF - 120)) | (1L << (INC - 120)) | (1L << (DEC - 120)) | (1L << (BANG - 120)) | (1L << (HEX_LITERAL - 120)) | (1L << (OCTAL_LITERAL - 120)) | (1L << (BINARY_LITERAL - 120)) | (1L << (FLOATING_POINT_LITERAL - 120)) | (1L << (CHARACTER_LITERAL - 120)) | (1L << (NIL - 120)) | (1L << (NULL_ - 120)) | (1L << (YES - 120)) | (1L << (NO - 120)) | (1L << (TRUE - 120)) | (1L << (FALSE - 120)) | (1L << (STRING_START - 120)))) != 0)) {
				{
				setState(975);
				expression(0);
				}
			}

			setState(978);
			match(T__21);
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__5 - 5)) | (1L << (T__9 - 5)) | (1L << (T__12 - 5)) | (1L << (T__13 - 5)) | (1L << (T__14 - 5)) | (1L << (T__44 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (IDENTIFIER - 5)) | (1L << (DECIMAL_LITERAL - 5)) | (1L << (LP - 5)))) != 0) || ((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (SIZEOF - 120)) | (1L << (INC - 120)) | (1L << (DEC - 120)) | (1L << (BANG - 120)) | (1L << (HEX_LITERAL - 120)) | (1L << (OCTAL_LITERAL - 120)) | (1L << (BINARY_LITERAL - 120)) | (1L << (FLOATING_POINT_LITERAL - 120)) | (1L << (CHARACTER_LITERAL - 120)) | (1L << (NIL - 120)) | (1L << (NULL_ - 120)) | (1L << (YES - 120)) | (1L << (NO - 120)) | (1L << (TRUE - 120)) | (1L << (FALSE - 120)) | (1L << (STRING_START - 120)))) != 0)) {
				{
				setState(979);
				expressions();
				}
			}

			setState(982);
			match(RP);
			setState(983);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopInitializerContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ForLoopInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterForLoopInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitForLoopInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitForLoopInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopInitializerContext forLoopInitializer() throws RecognitionException {
		ForLoopInitializerContext _localctx = new ForLoopInitializerContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_forLoopInitializer);
		try {
			setState(989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(985);
				declarationSpecifiers();
				setState(986);
				initDeclaratorList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(988);
				expressions();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInStatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public TypeVariableDeclaratorContext typeVariableDeclarator() {
			return getRuleContext(TypeVariableDeclaratorContext.class,0);
		}
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitForInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitForInStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInStatementContext forInStatement() throws RecognitionException {
		ForInStatementContext _localctx = new ForInStatementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_forInStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			match(T__50);
			setState(992);
			match(LP);
			setState(993);
			typeVariableDeclarator();
			setState(994);
			match(T__25);
			setState(996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__5 - 5)) | (1L << (T__9 - 5)) | (1L << (T__12 - 5)) | (1L << (T__13 - 5)) | (1L << (T__14 - 5)) | (1L << (T__44 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (IDENTIFIER - 5)) | (1L << (DECIMAL_LITERAL - 5)) | (1L << (LP - 5)))) != 0) || ((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (SIZEOF - 120)) | (1L << (INC - 120)) | (1L << (DEC - 120)) | (1L << (BANG - 120)) | (1L << (HEX_LITERAL - 120)) | (1L << (OCTAL_LITERAL - 120)) | (1L << (BINARY_LITERAL - 120)) | (1L << (FLOATING_POINT_LITERAL - 120)) | (1L << (CHARACTER_LITERAL - 120)) | (1L << (NIL - 120)) | (1L << (NULL_ - 120)) | (1L << (YES - 120)) | (1L << (NO - 120)) | (1L << (TRUE - 120)) | (1L << (FALSE - 120)) | (1L << (STRING_START - 120)))) != 0)) {
				{
				setState(995);
				expression(0);
				}
			}

			setState(998);
			match(RP);
			setState(999);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(GramParser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(GramParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(GramParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(GramParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_jumpStatement);
		try {
			setState(1009);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				match(GOTO);
				setState(1002);
				identifier();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				match(CONTINUE);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1004);
				match(BREAK);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1005);
				match(RETURN);
				setState(1007);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1006);
					expression(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_expressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			expression(0);
			setState(1016);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1012);
					match(T__0);
					setState(1013);
					expression(0);
					}
					} 
				}
				setState(1018);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext assignmentExpression;
		public Token op;
		public ExpressionContext trueExpression;
		public ExpressionContext falseExpression;
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(GramParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(GramParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(GramParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(GramParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GramParser.SUB, 0); }
		public List<TerminalNode> LT() { return getTokens(GramParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(GramParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(GramParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(GramParser.GT, i);
		}
		public TerminalNode LE() { return getToken(GramParser.LE, 0); }
		public TerminalNode GE() { return getToken(GramParser.GE, 0); }
		public TerminalNode NOTEQUAL() { return getToken(GramParser.NOTEQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(GramParser.EQUAL, 0); }
		public TerminalNode BITAND() { return getToken(GramParser.BITAND, 0); }
		public TerminalNode BITXOR() { return getToken(GramParser.BITXOR, 0); }
		public TerminalNode BITOR() { return getToken(GramParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(GramParser.AND, 0); }
		public TerminalNode OR() { return getToken(GramParser.OR, 0); }
		public TerminalNode QUESTION() { return getToken(GramParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(GramParser.COLON, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 182;
		enterRecursionRule(_localctx, 182, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1020);
				castExpression();
				}
				break;
			case 2:
				{
				setState(1021);
				match(LP);
				setState(1022);
				compoundStatement();
				setState(1023);
				match(RP);
				}
				break;
			case 3:
				{
				setState(1025);
				unaryExpression();
				setState(1026);
				assignmentOperator();
				setState(1027);
				((ExpressionContext)_localctx).assignmentExpression = expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1075);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1073);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1031);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1032);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (MUL - 104)) | (1L << (DIV - 104)) | (1L << (MOD - 104)))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1033);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1034);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1035);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1036);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1037);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1042);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LT:
							{
							setState(1038);
							match(LT);
							setState(1039);
							match(LT);
							}
							break;
						case GT:
							{
							setState(1040);
							match(GT);
							setState(1041);
							match(GT);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1044);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1045);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1046);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LT - 70)) | (1L << (GT - 70)) | (1L << (LE - 70)) | (1L << (GE - 70)))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1047);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1048);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1049);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==NOTEQUAL || _la==EQUAL) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1050);
						expression(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1051);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1052);
						((ExpressionContext)_localctx).op = match(BITAND);
						setState(1053);
						expression(9);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1054);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1055);
						((ExpressionContext)_localctx).op = match(BITXOR);
						setState(1056);
						expression(8);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1057);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1058);
						((ExpressionContext)_localctx).op = match(BITOR);
						setState(1059);
						expression(7);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1060);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1061);
						((ExpressionContext)_localctx).op = match(AND);
						setState(1062);
						expression(6);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1063);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1064);
						((ExpressionContext)_localctx).op = match(OR);
						setState(1065);
						expression(5);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1066);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1067);
						match(QUESTION);
						setState(1069);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__5 - 5)) | (1L << (T__9 - 5)) | (1L << (T__12 - 5)) | (1L << (T__13 - 5)) | (1L << (T__14 - 5)) | (1L << (T__44 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (IDENTIFIER - 5)) | (1L << (DECIMAL_LITERAL - 5)) | (1L << (LP - 5)))) != 0) || ((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (SIZEOF - 120)) | (1L << (INC - 120)) | (1L << (DEC - 120)) | (1L << (BANG - 120)) | (1L << (HEX_LITERAL - 120)) | (1L << (OCTAL_LITERAL - 120)) | (1L << (BINARY_LITERAL - 120)) | (1L << (FLOATING_POINT_LITERAL - 120)) | (1L << (CHARACTER_LITERAL - 120)) | (1L << (NIL - 120)) | (1L << (NULL_ - 120)) | (1L << (YES - 120)) | (1L << (NO - 120)) | (1L << (TRUE - 120)) | (1L << (FALSE - 120)) | (1L << (STRING_START - 120)))) != 0)) {
							{
							setState(1068);
							((ExpressionContext)_localctx).trueExpression = expression(0);
							}
						}

						setState(1071);
						match(COLON);
						setState(1072);
						((ExpressionContext)_localctx).falseExpression = expression(4);
						}
						break;
					}
					} 
				}
				setState(1077);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_castExpression);
		try {
			setState(1089);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1080);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1081);
				match(LP);
				setState(1082);
				typeName();
				setState(1083);
				match(RP);
				}
				setState(1087);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1085);
					castExpression();
					}
					break;
				case 2:
					{
					setState(1086);
					initializer();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public StructInitializerContext structInitializer() {
			return getRuleContext(StructInitializerContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_initializer);
		try {
			setState(1094);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1091);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092);
				arrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1093);
				structInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_constantExpression);
		try {
			setState(1098);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1096);
				identifier();
				}
				break;
			case T__62:
			case T__63:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHARACTER_LITERAL:
			case NIL:
			case NULL_:
			case YES:
			case NO:
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1097);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public Token op;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode SIZEOF() { return getToken(GramParser.SIZEOF, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public TerminalNode INC() { return getToken(GramParser.INC, 0); }
		public TerminalNode DEC() { return getToken(GramParser.DEC, 0); }
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_unaryExpression);
		int _la;
		try {
			setState(1114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1100);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1101);
				match(SIZEOF);
				setState(1107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1102);
					unaryExpression();
					}
					break;
				case 2:
					{
					setState(1103);
					match(LP);
					setState(1104);
					typeSpecifier();
					setState(1105);
					match(RP);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1109);
				((UnaryExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
					((UnaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1110);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1111);
				unaryOperator();
				setState(1112);
				castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(GramParser.BANG, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (BANG - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GramParser.DOT, 0); }
		public TerminalNode STRUCTACCESS() { return getToken(GramParser.STRUCTACCESS, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 196;
		enterRecursionRule(_localctx, 196, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1119);
			primaryExpression();
			setState(1123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1120);
					postfix();
					}
					} 
				}
				setState(1125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PostfixExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
					setState(1126);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1127);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==STRUCTACCESS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1128);
					identifier();
					setState(1132);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1129);
							postfix();
							}
							} 
						}
						setState(1134);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
					}
					}
					} 
				}
				setState(1139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PostfixContext extends ParserRuleContext {
		public Token RP;
		public List<Token> macroArguments = new ArrayList<Token>();
		public Token _tset2252;
		public Token op;
		public TerminalNode LBRACK() { return getToken(GramParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(GramParser.RBRACK, 0); }
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public List<TerminalNode> RP() { return getTokens(GramParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(GramParser.RP, i);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GramParser.COMMA, i);
		}
		public TerminalNode INC() { return getToken(GramParser.INC, 0); }
		public TerminalNode DEC() { return getToken(GramParser.DEC, 0); }
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_postfix);
		int _la;
		try {
			setState(1158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1140);
				match(LBRACK);
				setState(1141);
				expression(0);
				setState(1142);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1144);
				match(LP);
				setState(1146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__5 - 5)) | (1L << (T__9 - 5)) | (1L << (T__11 - 5)) | (1L << (T__12 - 5)) | (1L << (T__13 - 5)) | (1L << (T__14 - 5)) | (1L << (T__31 - 5)) | (1L << (T__32 - 5)) | (1L << (T__33 - 5)) | (1L << (T__34 - 5)) | (1L << (T__35 - 5)) | (1L << (T__36 - 5)) | (1L << (T__37 - 5)) | (1L << (T__38 - 5)) | (1L << (T__44 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (IDENTIFIER - 5)) | (1L << (DECIMAL_LITERAL - 5)) | (1L << (LP - 5)))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (TYPEOF - 97)) | (1L << (SIZEOF - 97)) | (1L << (INC - 97)) | (1L << (DEC - 97)) | (1L << (BANG - 97)) | (1L << (HEX_LITERAL - 97)) | (1L << (OCTAL_LITERAL - 97)) | (1L << (BINARY_LITERAL - 97)) | (1L << (FLOATING_POINT_LITERAL - 97)) | (1L << (CHARACTER_LITERAL - 97)) | (1L << (NIL - 97)) | (1L << (NULL_ - 97)) | (1L << (YES - 97)) | (1L << (NO - 97)) | (1L << (TRUE - 97)) | (1L << (FALSE - 97)) | (1L << (STRING_START - 97)))) != 0)) {
					{
					setState(1145);
					argumentExpressionList();
					}
				}

				setState(1148);
				match(RP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1149);
				match(LP);
				setState(1152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
					case 1:
						{
						setState(1150);
						match(COMMA);
						}
						break;
					case 2:
						{
						setState(1151);
						((PostfixContext)_localctx)._tset2252 = _input.LT(1);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==RP) ) {
							((PostfixContext)_localctx)._tset2252 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						((PostfixContext)_localctx).macroArguments.add(((PostfixContext)_localctx)._tset2252);
						}
						break;
					}
					}
					setState(1154); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (LP - 64)) | (1L << (LT - 64)) | (1L << (GT - 64)) | (1L << (TYPEDEF - 64)) | (1L << (IB_OUTLET_COLLECTION - 64)) | (1L << (IB_OUTLET - 64)) | (1L << (WEAK_QUALIFIER - 64)) | (1L << (STRONG_QUALIFIER - 64)) | (1L << (AUTORELEASING_QUALIFIER - 64)) | (1L << (UNSAFE_UNRETAINED_QUALIFIER - 64)) | (1L << (NULL_UNSPECIFIED - 64)) | (1L << (NULLABLE - 64)) | (1L << (NONNULL - 64)) | (1L << (NULL_RESETTABLE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (STATIC - 64)) | (1L << (EXTERN - 64)) | (1L << (BRIDGE - 64)) | (1L << (BRIDGE_TRANSFER - 64)) | (1L << (BRIDGE_RETAINED - 64)) | (1L << (BLOCK - 64)) | (1L << (INLINE - 64)) | (1L << (NS_INLINE - 64)) | (1L << (KINDOF - 64)) | (1L << (CONST - 64)) | (1L << (VOLATILE - 64)) | (1L << (RESTRICT - 64)) | (1L << (TYPEOF - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (GOTO - 64)) | (1L << (CONTINUE - 64)) | (1L << (BREAK - 64)) | (1L << (RETURN - 64)) | (1L << (MUL - 64)) | (1L << (DIV - 64)) | (1L << (MOD - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (NOTEQUAL - 64)) | (1L << (EQUAL - 64)) | (1L << (BITAND - 64)) | (1L << (BITXOR - 64)) | (1L << (BITOR - 64)) | (1L << (AND - 64)) | (1L << (OR - 64)) | (1L << (QUESTION - 64)) | (1L << (COLON - 64)) | (1L << (SIZEOF - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (BANG - 64)) | (1L << (DOT - 64)) | (1L << (STRUCTACCESS - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (COMMA - 128)) | (1L << (HEX_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (BINARY_LITERAL - 128)) | (1L << (FLOATING_POINT_LITERAL - 128)) | (1L << (CHARACTER_LITERAL - 128)) | (1L << (NIL - 128)) | (1L << (NULL_ - 128)) | (1L << (YES - 128)) | (1L << (NO - 128)) | (1L << (TRUE - 128)) | (1L << (FALSE - 128)) | (1L << (STRING_START - 128)) | (1L << (STRING_VALUE - 128)) | (1L << (STRING_NEWLINE - 128)) | (1L << (STRING_END - 128)))) != 0) );
				setState(1156);
				match(RP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1157);
				((PostfixContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
					((PostfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public List<ArgumentExpressionContext> argumentExpression() {
			return getRuleContexts(ArgumentExpressionContext.class);
		}
		public ArgumentExpressionContext argumentExpression(int i) {
			return getRuleContext(ArgumentExpressionContext.class,i);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitArgumentExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitArgumentExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			argumentExpression();
			setState(1165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(1161);
				match(T__0);
				setState(1162);
				argumentExpression();
				}
				}
				setState(1167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ArgumentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterArgumentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitArgumentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitArgumentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionContext argumentExpression() throws RecognitionException {
		ArgumentExpressionContext _localctx = new ArgumentExpressionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_argumentExpression);
		try {
			setState(1170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1168);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1169);
				typeSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode LP() { return getToken(GramParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(GramParser.RP, 0); }
		public MessageExpressionContext messageExpression() {
			return getRuleContext(MessageExpressionContext.class,0);
		}
		public SelectorExpressionContext selectorExpression() {
			return getRuleContext(SelectorExpressionContext.class,0);
		}
		public ProtocolExpressionContext protocolExpression() {
			return getRuleContext(ProtocolExpressionContext.class,0);
		}
		public EncodeExpressionContext encodeExpression() {
			return getRuleContext(EncodeExpressionContext.class,0);
		}
		public DictionaryExpressionContext dictionaryExpression() {
			return getRuleContext(DictionaryExpressionContext.class,0);
		}
		public ArrayExpressionContext arrayExpression() {
			return getRuleContext(ArrayExpressionContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_primaryExpression);
		try {
			setState(1186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1172);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1173);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1174);
				stringLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1175);
				match(LP);
				setState(1176);
				expression(0);
				setState(1177);
				match(RP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1179);
				messageExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1180);
				selectorExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1181);
				protocolExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1182);
				encodeExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1183);
				dictionaryExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1184);
				arrayExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1185);
				blockExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode HEX_LITERAL() { return getToken(GramParser.HEX_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(GramParser.OCTAL_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(GramParser.BINARY_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(GramParser.DECIMAL_LITERAL, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(GramParser.FLOATING_POINT_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(GramParser.CHARACTER_LITERAL, 0); }
		public TerminalNode NIL() { return getToken(GramParser.NIL, 0); }
		public TerminalNode NULL_() { return getToken(GramParser.NULL_, 0); }
		public TerminalNode YES() { return getToken(GramParser.YES, 0); }
		public TerminalNode NO() { return getToken(GramParser.NO, 0); }
		public TerminalNode TRUE() { return getToken(GramParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GramParser.FALSE, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_constant);
		int _la;
		try {
			setState(1206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1188);
				match(HEX_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1189);
				match(OCTAL_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1190);
				match(BINARY_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__62 || _la==T__63) {
					{
					setState(1191);
					_la = _input.LA(1);
					if ( !(_la==T__62 || _la==T__63) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1194);
				match(DECIMAL_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__62 || _la==T__63) {
					{
					setState(1195);
					_la = _input.LA(1);
					if ( !(_la==T__62 || _la==T__63) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1198);
				match(FLOATING_POINT_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1199);
				match(CHARACTER_LITERAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1200);
				match(NIL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1201);
				match(NULL_);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1202);
				match(YES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1203);
				match(NO);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1204);
				match(TRUE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1205);
				match(FALSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> STRING_START() { return getTokens(GramParser.STRING_START); }
		public TerminalNode STRING_START(int i) {
			return getToken(GramParser.STRING_START, i);
		}
		public List<TerminalNode> STRING_END() { return getTokens(GramParser.STRING_END); }
		public TerminalNode STRING_END(int i) {
			return getToken(GramParser.STRING_END, i);
		}
		public List<TerminalNode> STRING_VALUE() { return getTokens(GramParser.STRING_VALUE); }
		public TerminalNode STRING_VALUE(int i) {
			return getToken(GramParser.STRING_VALUE, i);
		}
		public List<TerminalNode> STRING_NEWLINE() { return getTokens(GramParser.STRING_NEWLINE); }
		public TerminalNode STRING_NEWLINE(int i) {
			return getToken(GramParser.STRING_NEWLINE, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_stringLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1216); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1208);
					match(STRING_START);
					setState(1212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==STRING_VALUE || _la==STRING_NEWLINE) {
						{
						{
						setState(1209);
						_la = _input.LA(1);
						if ( !(_la==STRING_VALUE || _la==STRING_NEWLINE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(1214);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1215);
					match(STRING_END);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1218); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GramParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 91:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 98:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0091\u04c9\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\3\2\7\2\u00d8\n\2\f\2\16\2\u00db\13\2\3\2\3\2\3\3\3\3\3\3\5\3\u00e2"+
		"\n\3\3\4\3\4\3\4\7\4\u00e7\n\4\f\4\16\4\u00ea\13\4\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u00f1\n\5\3\5\5\5\u00f4\n\5\3\6\3\6\5\6\u00f8\n\6\3\7\5\7\u00fb\n"+
		"\7\3\7\3\7\5\7\u00ff\n\7\3\7\3\7\3\7\3\7\5\7\u0105\n\7\3\7\3\7\5\7\u0109"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\7\b\u0110\n\b\f\b\16\b\u0113\13\b\3\b\5\b\u0116"+
		"\n\b\5\b\u0118\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0124\n"+
		"\n\5\n\u0126\n\n\3\n\3\n\3\13\3\13\3\13\5\13\u012d\n\13\3\13\3\13\7\13"+
		"\u0131\n\13\f\13\16\13\u0134\13\13\5\13\u0136\n\13\3\13\3\13\3\f\3\f\5"+
		"\f\u013c\n\f\3\r\3\r\5\r\u0140\n\r\3\r\5\r\u0143\n\r\3\r\5\r\u0146\n\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u0151\n\17\3\20\3\20"+
		"\6\20\u0155\n\20\r\20\16\20\u0156\5\20\u0159\n\20\3\21\5\21\u015c\n\21"+
		"\3\21\3\21\3\21\3\21\7\21\u0162\n\21\f\21\16\21\u0165\13\21\3\22\3\22"+
		"\5\22\u0169\n\22\3\22\3\22\3\22\3\22\5\22\u016f\n\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\5\24\u0178\n\24\3\24\6\24\u017b\n\24\r\24\16\24\u017c"+
		"\5\24\u017f\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0195\n\30\3\31\3\31"+
		"\3\31\7\31\u019a\n\31\f\31\16\31\u019d\13\31\3\31\3\31\5\31\u01a1\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\5\37\u01b9\n\37\3\37\3\37\3\37"+
		"\5\37\u01be\n\37\3\37\3\37\3\37\5\37\u01c3\n\37\3 \3 \5 \u01c7\n \3!\3"+
		"!\5!\u01cb\n!\3\"\3\"\5\"\u01cf\n\"\3\"\3\"\3#\3#\3#\7#\u01d6\n#\f#\16"+
		"#\u01d9\13#\3$\3$\3$\3$\5$\u01df\n$\3%\3%\3%\3%\3%\5%\u01e6\n%\3&\3&\3"+
		"&\3&\5&\u01ec\n&\3\'\5\'\u01ef\n\'\3\'\3\'\5\'\u01f3\n\'\3\'\3\'\3\'\3"+
		"\'\3\'\3(\5(\u01fb\n(\3(\5(\u01fe\n(\3(\3(\5(\u0202\n(\3(\3(\3)\3)\3)"+
		"\3)\5)\u020a\n)\3)\3)\3*\5*\u020f\n*\3*\3*\3*\3*\3*\5*\u0216\n*\3*\3*"+
		"\3+\3+\3+\7+\u021d\n+\f+\16+\u0220\13+\3,\5,\u0223\n,\3,\3,\3-\3-\3-\3"+
		"-\3-\3-\3-\5-\u022e\n-\3.\3.\3.\3.\3.\3.\7.\u0236\n.\f.\16.\u0239\13."+
		"\3.\3.\3.\3/\3/\3/\7/\u0241\n/\f/\16/\u0244\13/\3\60\3\60\3\60\5\60\u0249"+
		"\n\60\3\61\3\61\3\61\3\61\3\61\3\61\6\61\u0251\n\61\r\61\16\61\u0252\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\5\62\u025b\n\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\3\67\3\67\5\67\u0269\n\67\38\38\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\59\u0279\n9\59\u027b\n9\3:\3:\3:\3:\3:\3;\3;"+
		"\5;\u0284\n;\3;\3;\5;\u0288\n;\3;\3;\3;\3;\3;\5;\u028f\n;\3;\3;\3;\3;"+
		"\5;\u0295\n;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u02a1\n;\3<\3<\3<\7<\u02a6"+
		"\n<\f<\16<\u02a9\13<\3<\5<\u02ac\n<\3=\3=\3=\5=\u02b1\n=\3>\3>\5>\u02b5"+
		"\n>\3?\3?\3?\3?\3?\5?\u02bc\n?\3?\7?\u02bf\n?\f?\16?\u02c2\13?\3?\3?\3"+
		"?\5?\u02c7\n?\3?\5?\u02ca\n?\3?\3?\5?\u02ce\n?\3@\3@\5@\u02d2\n@\3@\3"+
		"@\3A\3A\3A\5A\u02d9\nA\3B\3B\5B\u02dd\nB\3B\5B\u02e0\nB\3C\3C\3C\5C\u02e5"+
		"\nC\5C\u02e7\nC\3C\3C\3D\3D\3D\3D\3D\3D\7D\u02f1\nD\fD\16D\u02f4\13D\3"+
		"D\5D\u02f7\nD\5D\u02f9\nD\3D\3D\3E\3E\3E\7E\u0300\nE\fE\16E\u0303\13E"+
		"\3E\5E\u0306\nE\3F\3F\5F\u030a\nF\3F\5F\u030d\nF\3G\3G\5G\u0311\nG\3G"+
		"\3G\5G\u0315\nG\3G\3G\6G\u0319\nG\rG\16G\u031a\3G\3G\5G\u031f\nG\3G\6"+
		"G\u0322\nG\rG\16G\u0323\5G\u0326\nG\3H\3H\5H\u032a\nH\3H\3H\3H\5H\u032f"+
		"\nH\3H\5H\u0332\nH\3I\3I\3I\7I\u0337\nI\fI\16I\u033a\13I\3J\3J\3J\3J\5"+
		"J\u0340\nJ\3K\5K\u0343\nK\3K\3K\3L\3L\5L\u0349\nL\3L\3L\5L\u034d\nL\3"+
		"L\3L\5L\u0351\nL\3L\3L\5L\u0355\nL\3L\3L\5L\u0359\nL\3L\3L\5L\u035d\n"+
		"L\3L\3L\5L\u0361\nL\3L\3L\5L\u0365\nL\3L\3L\5L\u0369\nL\3L\3L\5L\u036d"+
		"\nL\3L\5L\u0370\nL\3M\3M\3M\3M\3N\3N\3N\5N\u0379\nN\3O\3O\3O\7O\u037e"+
		"\nO\fO\16O\u0381\13O\3O\3O\3P\3P\3P\3P\3P\3P\3P\5P\u038c\nP\3P\5P\u038f"+
		"\nP\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\7R\u0399\nR\fR\16R\u039c\13R\3R\3R\3S\6S\u03a1"+
		"\nS\rS\16S\u03a2\3S\6S\u03a6\nS\rS\16S\u03a7\3T\3T\3T\3T\3T\3T\5T\u03b0"+
		"\nT\3T\3T\3T\3T\5T\u03b6\nT\3U\3U\3U\3U\5U\u03bc\nU\3V\3V\3V\3V\3V\3V"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3X\3X\3X\5X\u03cf\nX\3X\3X\5X\u03d3\nX\3X\3X"+
		"\5X\u03d7\nX\3X\3X\3X\3Y\3Y\3Y\3Y\5Y\u03e0\nY\3Z\3Z\3Z\3Z\3Z\5Z\u03e7"+
		"\nZ\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\5[\u03f2\n[\5[\u03f4\n[\3\\\3\\\3\\\7\\"+
		"\u03f9\n\\\f\\\16\\\u03fc\13\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u0408"+
		"\n]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u0415\n]\3]\3]\3]\3]\3]\3]\3]"+
		"\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u0430\n]\3]"+
		"\3]\7]\u0434\n]\f]\16]\u0437\13]\3^\3^\3_\3_\3_\3_\3_\3_\3_\5_\u0442\n"+
		"_\5_\u0444\n_\3`\3`\3`\5`\u0449\n`\3a\3a\5a\u044d\na\3b\3b\3b\3b\3b\3"+
		"b\3b\5b\u0456\nb\3b\3b\3b\3b\3b\5b\u045d\nb\3c\3c\3d\3d\3d\7d\u0464\n"+
		"d\fd\16d\u0467\13d\3d\3d\3d\3d\7d\u046d\nd\fd\16d\u0470\13d\7d\u0472\n"+
		"d\fd\16d\u0475\13d\3e\3e\3e\3e\3e\3e\5e\u047d\ne\3e\3e\3e\3e\6e\u0483"+
		"\ne\re\16e\u0484\3e\3e\5e\u0489\ne\3f\3f\3f\7f\u048e\nf\ff\16f\u0491\13"+
		"f\3g\3g\5g\u0495\ng\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u04a5"+
		"\nh\3i\3i\3i\3i\5i\u04ab\ni\3i\3i\5i\u04af\ni\3i\3i\3i\3i\3i\3i\3i\3i"+
		"\5i\u04b9\ni\3j\3j\7j\u04bd\nj\fj\16j\u04c0\13j\3j\6j\u04c3\nj\rj\16j"+
		"\u04c4\3k\3k\3k\2\4\u00b8\u00c6l\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\2\24\3\2\4\5\3\2MP\3\2QT\3\2UX\3\2Y_\3"+
		"\2\34!\3\2+,\3\2jl\3\2mn\4\2HIop\3\2qr\4\2\32\32\66?\3\2{|\5\2//@C}}\3"+
		"\2~\177\3\2GG\3\2AB\3\2\u008f\u0090\2\u0549\2\u00d9\3\2\2\2\4\u00e1\3"+
		"\2\2\2\6\u00e3\3\2\2\2\b\u00f3\3\2\2\2\n\u00f7\3\2\2\2\f\u00fa\3\2\2\2"+
		"\16\u010a\3\2\2\2\20\u011b\3\2\2\2\22\u011f\3\2\2\2\24\u0129\3\2\2\2\26"+
		"\u013b\3\2\2\2\30\u013d\3\2\2\2\32\u0149\3\2\2\2\34\u0150\3\2\2\2\36\u0158"+
		"\3\2\2\2 \u015b\3\2\2\2\"\u0166\3\2\2\2$\u0170\3\2\2\2&\u017e\3\2\2\2"+
		"(\u0180\3\2\2\2*\u0185\3\2\2\2,\u018a\3\2\2\2.\u0194\3\2\2\2\60\u0196"+
		"\3\2\2\2\62\u01a2\3\2\2\2\64\u01a8\3\2\2\2\66\u01ae\3\2\2\28\u01b1\3\2"+
		"\2\2:\u01b4\3\2\2\2<\u01b8\3\2\2\2>\u01c4\3\2\2\2@\u01ca\3\2\2\2B\u01cc"+
		"\3\2\2\2D\u01d2\3\2\2\2F\u01de\3\2\2\2H\u01e0\3\2\2\2J\u01eb\3\2\2\2L"+
		"\u01ee\3\2\2\2N\u01fa\3\2\2\2P\u0209\3\2\2\2R\u020e\3\2\2\2T\u0219\3\2"+
		"\2\2V\u0222\3\2\2\2X\u022d\3\2\2\2Z\u022f\3\2\2\2\\\u023d\3\2\2\2^\u0245"+
		"\3\2\2\2`\u0250\3\2\2\2b\u025a\3\2\2\2d\u025c\3\2\2\2f\u025e\3\2\2\2h"+
		"\u0260\3\2\2\2j\u0262\3\2\2\2l\u0268\3\2\2\2n\u026a\3\2\2\2p\u027a\3\2"+
		"\2\2r\u027c\3\2\2\2t\u02a0\3\2\2\2v\u02a2\3\2\2\2x\u02ad\3\2\2\2z\u02b4"+
		"\3\2\2\2|\u02cd\3\2\2\2~\u02cf\3\2\2\2\u0080\u02d5\3\2\2\2\u0082\u02da"+
		"\3\2\2\2\u0084\u02e1\3\2\2\2\u0086\u02ea\3\2\2\2\u0088\u02fc\3\2\2\2\u008a"+
		"\u030c\3\2\2\2\u008c\u0325\3\2\2\2\u008e\u0331\3\2\2\2\u0090\u0333\3\2"+
		"\2\2\u0092\u033f\3\2\2\2\u0094\u0342\3\2\2\2\u0096\u036f\3\2\2\2\u0098"+
		"\u0371\3\2\2\2\u009a\u0375\3\2\2\2\u009c\u037a\3\2\2\2\u009e\u038e\3\2"+
		"\2\2\u00a0\u0390\3\2\2\2\u00a2\u0396\3\2\2\2\u00a4\u03a0\3\2\2\2\u00a6"+
		"\u03b5\3\2\2\2\u00a8\u03bb\3\2\2\2\u00aa\u03bd\3\2\2\2\u00ac\u03c3\3\2"+
		"\2\2\u00ae\u03cb\3\2\2\2\u00b0\u03df\3\2\2\2\u00b2\u03e1\3\2\2\2\u00b4"+
		"\u03f3\3\2\2\2\u00b6\u03f5\3\2\2\2\u00b8\u0407\3\2\2\2\u00ba\u0438\3\2"+
		"\2\2\u00bc\u0443\3\2\2\2\u00be\u0448\3\2\2\2\u00c0\u044c\3\2\2\2\u00c2"+
		"\u045c\3\2\2\2\u00c4\u045e\3\2\2\2\u00c6\u0460\3\2\2\2\u00c8\u0488\3\2"+
		"\2\2\u00ca\u048a\3\2\2\2\u00cc\u0494\3\2\2\2\u00ce\u04a4\3\2\2\2\u00d0"+
		"\u04b8\3\2\2\2\u00d2\u04c2\3\2\2\2\u00d4\u04c6\3\2\2\2\u00d6\u00d8\5\4"+
		"\3\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\2"+
		"\2\3\u00dd\3\3\2\2\2\u00de\u00e2\58\35\2\u00df\u00e2\5J&\2\u00e0\u00e2"+
		"\5:\36\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\5\3\2\2\2\u00e3\u00e8\5\b\5\2\u00e4\u00e5\7\3\2\2\u00e5\u00e7\5\b\5\2"+
		"\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\7\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7H\2\2\u00ec"+
		"\u00ed\5\6\4\2\u00ed\u00ee\7I\2\2\u00ee\u00f4\3\2\2\2\u00ef\u00f1\t\2"+
		"\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f4\5\u00d4k\2\u00f3\u00eb\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f4\t\3\2"+
		"\2\2\u00f5\u00f8\5\u00d4k\2\u00f6\u00f8\7\6\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\13\3\2\2\2\u00f9\u00fb\5f\64\2\u00fa\u00f9\3\2\2"+
		"\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\5p9\2\u00fd\u00ff"+
		"\5f\64\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\7F\2\2\u0101\u0104\7\7\2\2\u0102\u0105\5f\64\2\u0103\u0105\5p9"+
		"\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0108\7G\2\2\u0107\u0109\5\24\13\2\u0108\u0107\3\2\2\2"+
		"\u0108\u0109\3\2\2\2\u0109\r\3\2\2\2\u010a\u010b\7\b\2\2\u010b\u0117\7"+
		"\t\2\2\u010c\u0111\5\20\t\2\u010d\u010e\7\3\2\2\u010e\u0110\5\20\t\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0116\7\3\2\2\u0115"+
		"\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u010c\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7\n\2\2\u011a"+
		"\17\3\2\2\2\u011b\u011c\5\u00bc_\2\u011c\u011d\7\13\2\2\u011d\u011e\5"+
		"\u00b8]\2\u011e\21\3\2\2\2\u011f\u0120\7\b\2\2\u0120\u0125\7\f\2\2\u0121"+
		"\u0123\5\u00b6\\\2\u0122\u0124\7\3\2\2\u0123\u0122\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0121\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0128\7\r\2\2\u0128\23\3\2\2\2\u0129\u0135\7F\2\2"+
		"\u012a\u012d\5\26\f\2\u012b\u012d\7\16\2\2\u012c\u012a\3\2\2\2\u012c\u012b"+
		"\3\2\2\2\u012d\u0132\3\2\2\2\u012e\u012f\7\3\2\2\u012f\u0131\5\26\f\2"+
		"\u0130\u012e\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u012c\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7G\2\2\u0138\25\3\2\2\2"+
		"\u0139\u013c\5,\27\2\u013a\u013c\5\u008aF\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013a\3\2\2\2\u013c\27\3\2\2\2\u013d\u013f\7\7\2\2\u013e\u0140\5p9\2"+
		"\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u0143"+
		"\5f\64\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144"+
		"\u0146\5\24\13\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3"+
		"\2\2\2\u0147\u0148\5\u009cO\2\u0148\31\3\2\2\2\u0149\u014a\7\f\2\2\u014a"+
		"\u014b\5\34\17\2\u014b\u014c\5\36\20\2\u014c\u014d\7\r\2\2\u014d\33\3"+
		"\2\2\2\u014e\u0151\5\u00b8]\2\u014f\u0151\5p9\2\u0150\u014e\3\2\2\2\u0150"+
		"\u014f\3\2\2\2\u0151\35\3\2\2\2\u0152\u0159\5\n\6\2\u0153\u0155\5 \21"+
		"\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157"+
		"\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0152\3\2\2\2\u0158\u0154\3\2\2\2\u0159"+
		"\37\3\2\2\2\u015a\u015c\5\n\6\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2"+
		"\2\u015c\u015d\3\2\2\2\u015d\u015e\7\13\2\2\u015e\u0163\5\"\22\2\u015f"+
		"\u0160\7\3\2\2\u0160\u0162\5\"\22\2\u0161\u015f\3\2\2\2\u0162\u0165\3"+
		"\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164!\3\2\2\2\u0165\u0163"+
		"\3\2\2\2\u0166\u0168\5\u00b6\\\2\u0167\u0169\5f\64\2\u0168\u0167\3\2\2"+
		"\2\u0168\u0169\3\2\2\2\u0169\u016e\3\2\2\2\u016a\u016b\7\t\2\2\u016b\u016c"+
		"\5\u0088E\2\u016c\u016d\7\n\2\2\u016d\u016f\3\2\2\2\u016e\u016a\3\2\2"+
		"\2\u016e\u016f\3\2\2\2\u016f#\3\2\2\2\u0170\u0171\7\17\2\2\u0171\u0172"+
		"\7F\2\2\u0172\u0173\5&\24\2\u0173\u0174\7G\2\2\u0174%\3\2\2\2\u0175\u017f"+
		"\5\n\6\2\u0176\u0178\5\n\6\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017b\7\13\2\2\u017a\u0177\3\2\2\2\u017b\u017c\3"+
		"\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e"+
		"\u0175\3\2\2\2\u017e\u017a\3\2\2\2\u017f\'\3\2\2\2\u0180\u0181\7\20\2"+
		"\2\u0181\u0182\7F\2\2\u0182\u0183\5\b\5\2\u0183\u0184\7G\2\2\u0184)\3"+
		"\2\2\2\u0185\u0186\7\21\2\2\u0186\u0187\7F\2\2\u0187\u0188\5\u008aF\2"+
		"\u0188\u0189\7G\2\2\u0189+\3\2\2\2\u018a\u018b\5X-\2\u018b\u018c\5\u0094"+
		"K\2\u018c-\3\2\2\2\u018d\u018e\7\22\2\2\u018e\u018f\7F\2\2\u018f\u0190"+
		"\5\u00d4k\2\u0190\u0191\7G\2\2\u0191\u0195\3\2\2\2\u0192\u0193\7\22\2"+
		"\2\u0193\u0195\5\u00b8]\2\u0194\u018d\3\2\2\2\u0194\u0192\3\2\2\2\u0195"+
		"/\3\2\2\2\u0196\u0197\7\23\2\2\u0197\u019b\5\u009cO\2\u0198\u019a\5\62"+
		"\32\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u01a0\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u019f\7\24"+
		"\2\2\u019f\u01a1\5\u009cO\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\61\3\2\2\2\u01a2\u01a3\7\25\2\2\u01a3\u01a4\7F\2\2\u01a4\u01a5\5,\27"+
		"\2\u01a5\u01a6\7G\2\2\u01a6\u01a7\5\u009cO\2\u01a7\63\3\2\2\2\u01a8\u01a9"+
		"\7\26\2\2\u01a9\u01aa\7F\2\2\u01aa\u01ab\5\u00b8]\2\u01ab\u01ac\7G\2\2"+
		"\u01ac\u01ad\5\u009cO\2\u01ad\65\3\2\2\2\u01ae\u01af\7\27\2\2\u01af\u01b0"+
		"\5\u009cO\2\u01b0\67\3\2\2\2\u01b1\u01b2\5<\37\2\u01b2\u01b3\7\30\2\2"+
		"\u01b39\3\2\2\2\u01b4\u01b5\5<\37\2\u01b5\u01b6\5\u009cO\2\u01b6;\3\2"+
		"\2\2\u01b7\u01b9\5X-\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba"+
		"\3\2\2\2\u01ba\u01bb\5\u00d4k\2\u01bb\u01bd\7F\2\2\u01bc\u01be\5\u0080"+
		"A\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01c0\7G\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01c3\5Z.\2\u01c2\u01c1\3\2\2"+
		"\2\u01c2\u01c3\3\2\2\2\u01c3=\3\2\2\2\u01c4\u01c6\5@!\2\u01c5\u01c7\5"+
		"B\"\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7?\3\2\2\2\u01c8\u01cb"+
		"\7\31\2\2\u01c9\u01cb\5\u00d4k\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9\3\2\2"+
		"\2\u01cbA\3\2\2\2\u01cc\u01ce\7F\2\2\u01cd\u01cf\5D#\2\u01ce\u01cd\3\2"+
		"\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\7G\2\2\u01d1"+
		"C\3\2\2\2\u01d2\u01d7\5F$\2\u01d3\u01d4\7\3\2\2\u01d4\u01d6\5F$\2\u01d5"+
		"\u01d3\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2"+
		"\2\2\u01d8E\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01df\5> \2\u01db\u01df"+
		"\5\u00d0i\2\u01dc\u01df\5\u00d2j\2\u01dd\u01df\5H%\2\u01de\u01da\3\2\2"+
		"\2\u01de\u01db\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2\2\2\u01dfG"+
		"\3\2\2\2\u01e0\u01e1\5@!\2\u01e1\u01e5\7\32\2\2\u01e2\u01e6\5\u00d0i\2"+
		"\u01e3\u01e6\5@!\2\u01e4\u01e6\5\u00d2j\2\u01e5\u01e2\3\2\2\2\u01e5\u01e3"+
		"\3\2\2\2\u01e5\u01e4\3\2\2\2\u01e6I\3\2\2\2\u01e7\u01ec\5L\'\2\u01e8\u01ec"+
		"\5N(\2\u01e9\u01ec\5P)\2\u01ea\u01ec\5R*\2\u01eb\u01e7\3\2\2\2\u01eb\u01e8"+
		"\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ecK\3\2\2\2\u01ed"+
		"\u01ef\5Z.\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2"+
		"\2\u01f0\u01f2\5\u00d4k\2\u01f1\u01f3\5Z.\2\u01f2\u01f1\3\2\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\7F\2\2\u01f5\u01f6\5|?"+
		"\2\u01f6\u01f7\7G\2\2\u01f7\u01f8\7\30\2\2\u01f8M\3\2\2\2\u01f9\u01fb"+
		"\5Z.\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc"+
		"\u01fe\7J\2\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2"+
		"\2\2\u01ff\u0201\5t;\2\u0200\u0202\5\u00d4k\2\u0201\u0200\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\7\30\2\2\u0204O\3\2\2\2"+
		"\u0205\u0206\5X-\2\u0206\u0207\5\\/\2\u0207\u020a\3\2\2\2\u0208\u020a"+
		"\5X-\2\u0209\u0205\3\2\2\2\u0209\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u020c\7\30\2\2\u020cQ\3\2\2\2\u020d\u020f\5Z.\2\u020e\u020d\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0215\7J\2\2\u0211\u0212\5X-"+
		"\2\u0212\u0213\5T+\2\u0213\u0216\3\2\2\2\u0214\u0216\5X-\2\u0215\u0211"+
		"\3\2\2\2\u0215\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\7\30\2\2"+
		"\u0218S\3\2\2\2\u0219\u021e\5V,\2\u021a\u021b\7\3\2\2\u021b\u021d\5V,"+
		"\2\u021c\u021a\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f"+
		"\3\2\2\2\u021fU\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0223\5\u0082B\2\u0222"+
		"\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\5|"+
		"?\2\u0225W\3\2\2\2\u0226\u022e\5h\65\2\u0227\u022e\5Z.\2\u0228\u022e\5"+
		"d\63\2\u0229\u022e\5b\62\2\u022a\u022e\5j\66\2\u022b\u022e\5l\67\2\u022c"+
		"\u022e\5p9\2\u022d\u0226\3\2\2\2\u022d\u0227\3\2\2\2\u022d\u0228\3\2\2"+
		"\2\u022d\u0229\3\2\2\2\u022d\u022a\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022c"+
		"\3\2\2\2\u022eY\3\2\2\2\u022f\u0230\7\33\2\2\u0230\u0231\7F\2\2\u0231"+
		"\u0232\7F\2\2\u0232\u0237\5> \2\u0233\u0234\7\3\2\2\u0234\u0236\5> \2"+
		"\u0235\u0233\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238"+
		"\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023b\7G\2\2\u023b"+
		"\u023c\7G\2\2\u023c[\3\2\2\2\u023d\u0242\5^\60\2\u023e\u023f\7\3\2\2\u023f"+
		"\u0241\5^\60\2\u0240\u023e\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2"+
		"\2\2\u0242\u0243\3\2\2\2\u0243]\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0248"+
		"\5\u0094K\2\u0246\u0247\7\32\2\2\u0247\u0249\5\u00be`\2\u0248\u0246\3"+
		"\2\2\2\u0248\u0249\3\2\2\2\u0249_\3\2\2\2\u024a\u0251\5d\63\2\u024b\u0251"+
		"\5f\64\2\u024c\u0251\5b\62\2\u024d\u0251\5j\66\2\u024e\u0251\5l\67\2\u024f"+
		"\u0251\5p9\2\u0250\u024a\3\2\2\2\u0250\u024b\3\2\2\2\u0250\u024c\3\2\2"+
		"\2\u0250\u024d\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u024f\3\2\2\2\u0251\u0252"+
		"\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253a\3\2\2\2\u0254"+
		"\u0255\7K\2\2\u0255\u0256\7F\2\2\u0256\u0257\5\u00d4k\2\u0257\u0258\7"+
		"G\2\2\u0258\u025b\3\2\2\2\u0259\u025b\7L\2\2\u025a\u0254\3\2\2\2\u025a"+
		"\u0259\3\2\2\2\u025bc\3\2\2\2\u025c\u025d\t\3\2\2\u025de\3\2\2\2\u025e"+
		"\u025f\t\4\2\2\u025fg\3\2\2\2\u0260\u0261\t\5\2\2\u0261i\3\2\2\2\u0262"+
		"\u0263\t\6\2\2\u0263k\3\2\2\2\u0264\u0269\7`\2\2\u0265\u0269\7a\2\2\u0266"+
		"\u0269\7b\2\2\u0267\u0269\5n8\2\u0268\u0264\3\2\2\2\u0268\u0265\3\2\2"+
		"\2\u0268\u0266\3\2\2\2\u0268\u0267\3\2\2\2\u0269m\3\2\2\2\u026a\u026b"+
		"\t\7\2\2\u026bo\3\2\2\2\u026c\u027b\7\16\2\2\u026d\u027b\7\"\2\2\u026e"+
		"\u027b\7#\2\2\u026f\u027b\7$\2\2\u0270\u027b\7%\2\2\u0271\u027b\7&\2\2"+
		"\u0272\u027b\7\'\2\2\u0273\u027b\7(\2\2\u0274\u027b\7)\2\2\u0275\u027b"+
		"\5r:\2\u0276\u0278\5\u00d4k\2\u0277\u0279\5\u0082B\2\u0278\u0277\3\2\2"+
		"\2\u0278\u0279\3\2\2\2\u0279\u027b\3\2\2\2\u027a\u026c\3\2\2\2\u027a\u026d"+
		"\3\2\2\2\u027a\u026e\3\2\2\2\u027a\u026f\3\2\2\2\u027a\u0270\3\2\2\2\u027a"+
		"\u0271\3\2\2\2\u027a\u0272\3\2\2\2\u027a\u0273\3\2\2\2\u027a\u0274\3\2"+
		"\2\2\u027a\u0275\3\2\2\2\u027a\u0276\3\2\2\2\u027bq\3\2\2\2\u027c\u027d"+
		"\7c\2\2\u027d\u027e\7F\2\2\u027e\u027f\5\u00b8]\2\u027f\u0280\7G\2\2\u0280"+
		"s\3\2\2\2\u0281\u0287\7*\2\2\u0282\u0284\5\u00d4k\2\u0283\u0282\3\2\2"+
		"\2\u0283\u0284\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\7\13\2\2\u0286"+
		"\u0288\5\u008aF\2\u0287\u0283\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0294"+
		"\3\2\2\2\u0289\u028e\5\u00d4k\2\u028a\u028b\7\t\2\2\u028b\u028c\5v<\2"+
		"\u028c\u028d\7\n\2\2\u028d\u028f\3\2\2\2\u028e\u028a\3\2\2\2\u028e\u028f"+
		"\3\2\2\2\u028f\u0295\3\2\2\2\u0290\u0291\7\t\2\2\u0291\u0292\5v<\2\u0292"+
		"\u0293\7\n\2\2\u0293\u0295\3\2\2\2\u0294\u0289\3\2\2\2\u0294\u0290\3\2"+
		"\2\2\u0295\u02a1\3\2\2\2\u0296\u0297\t\b\2\2\u0297\u0298\7F\2\2\u0298"+
		"\u0299\5\u008aF\2\u0299\u029a\7\3\2\2\u029a\u029b\5\u00d4k\2\u029b\u029c"+
		"\7G\2\2\u029c\u029d\7\t\2\2\u029d\u029e\5v<\2\u029e\u029f\7\n\2\2\u029f"+
		"\u02a1\3\2\2\2\u02a0\u0281\3\2\2\2\u02a0\u0296\3\2\2\2\u02a1u\3\2\2\2"+
		"\u02a2\u02a7\5x=\2\u02a3\u02a4\7\3\2\2\u02a4\u02a6\5x=\2\u02a5\u02a3\3"+
		"\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8"+
		"\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02ac\7\3\2\2\u02ab\u02aa\3\2"+
		"\2\2\u02ab\u02ac\3\2\2\2\u02acw\3\2\2\2\u02ad\u02b0\5z>\2\u02ae\u02af"+
		"\7\32\2\2\u02af\u02b1\5\u00b8]\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2"+
		"\2\u02b1y\3\2\2\2\u02b2\u02b5\5\u00d4k\2\u02b3\u02b5\7-\2\2\u02b4\u02b2"+
		"\3\2\2\2\u02b4\u02b3\3\2\2\2\u02b5{\3\2\2\2\u02b6\u02bc\5\u00d4k\2\u02b7"+
		"\u02b8\7F\2\2\u02b8\u02b9\5\u0094K\2\u02b9\u02ba\7G\2\2\u02ba\u02bc\3"+
		"\2\2\2\u02bb\u02b6\3\2\2\2\u02bb\u02b7\3\2\2\2\u02bc\u02c0\3\2\2\2\u02bd"+
		"\u02bf\5~@\2\u02be\u02bd\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2"+
		"\2\u02c0\u02c1\3\2\2\2\u02c1\u02ce\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c4"+
		"\7F\2\2\u02c4\u02c6\7\7\2\2\u02c5\u02c7\5f\64\2\u02c6\u02c5\3\2\2\2\u02c6"+
		"\u02c7\3\2\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02ca\5\u00d4k\2\u02c9\u02c8"+
		"\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\7G\2\2\u02cc"+
		"\u02ce\5\24\13\2\u02cd\u02bb\3\2\2\2\u02cd\u02c3\3\2\2\2\u02ce}\3\2\2"+
		"\2\u02cf\u02d1\7\f\2\2\u02d0\u02d2\5\u00c0a\2\u02d1\u02d0\3\2\2\2\u02d1"+
		"\u02d2\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\7\r\2\2\u02d4\177\3\2\2"+
		"\2\u02d5\u02d8\5\u0090I\2\u02d6\u02d7\7\3\2\2\u02d7\u02d9\7.\2\2\u02d8"+
		"\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u0081\3\2\2\2\u02da\u02dc\7/"+
		"\2\2\u02db\u02dd\5X-\2\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02df"+
		"\3\2\2\2\u02de\u02e0\5\u0082B\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2"+
		"\2\u02e0\u0083\3\2\2\2\u02e1\u02e6\7\t\2\2\u02e2\u02e4\5\u00b6\\\2\u02e3"+
		"\u02e5\7\3\2\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e7\3\2"+
		"\2\2\u02e6\u02e2\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8"+
		"\u02e9\7\n\2\2\u02e9\u0085\3\2\2\2\u02ea\u02f8\7\t\2\2\u02eb\u02ec\7\60"+
		"\2\2\u02ec\u02f2\5\u00b8]\2\u02ed\u02ee\7\3\2\2\u02ee\u02ef\7\60\2\2\u02ef"+
		"\u02f1\5\u00b8]\2\u02f0\u02ed\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f0"+
		"\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5"+
		"\u02f7\7\3\2\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f9\3\2"+
		"\2\2\u02f8\u02eb\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa"+
		"\u02fb\7\n\2\2\u02fb\u0087\3\2\2\2\u02fc\u0301\5\u00be`\2\u02fd\u02fe"+
		"\7\3\2\2\u02fe\u0300\5\u00be`\2\u02ff\u02fd\3\2\2\2\u0300\u0303\3\2\2"+
		"\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301"+
		"\3\2\2\2\u0304\u0306\7\3\2\2\u0305\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306"+
		"\u0089\3\2\2\2\u0307\u0309\5`\61\2\u0308\u030a\5\u008cG\2\u0309\u0308"+
		"\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030d\3\2\2\2\u030b\u030d\5\f\7\2\u030c"+
		"\u0307\3\2\2\2\u030c\u030b\3\2\2\2\u030d\u008b\3\2\2\2\u030e\u0310\5\u0082"+
		"B\2\u030f\u0311\5\u008cG\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311"+
		"\u0326\3\2\2\2\u0312\u0314\7F\2\2\u0313\u0315\5\u008cG\2\u0314\u0313\3"+
		"\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0318\7G\2\2\u0317"+
		"\u0319\5\u008eH\2\u0318\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u0318"+
		"\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u0326\3\2\2\2\u031c\u031e\7\f\2\2\u031d"+
		"\u031f\5\u00c0a\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320"+
		"\3\2\2\2\u0320\u0322\7\r\2\2\u0321\u031c\3\2\2\2\u0322\u0323\3\2\2\2\u0323"+
		"\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0326\3\2\2\2\u0325\u030e\3\2"+
		"\2\2\u0325\u0312\3\2\2\2\u0325\u0321\3\2\2\2\u0326\u008d\3\2\2\2\u0327"+
		"\u0329\7\f\2\2\u0328\u032a\5\u00c0a\2\u0329\u0328\3\2\2\2\u0329\u032a"+
		"\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u0332\7\r\2\2\u032c\u032e\7F\2\2\u032d"+
		"\u032f\5\u0090I\2\u032e\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0330"+
		"\3\2\2\2\u0330\u0332\7G\2\2\u0331\u0327\3\2\2\2\u0331\u032c\3\2\2\2\u0332"+
		"\u008f\3\2\2\2\u0333\u0338\5\u0092J\2\u0334\u0335\7\3\2\2\u0335\u0337"+
		"\5\u0092J\2\u0336\u0334\3\2\2\2\u0337\u033a\3\2\2\2\u0338\u0336\3\2\2"+
		"\2\u0338\u0339\3\2\2\2\u0339\u0091\3\2\2\2\u033a\u0338\3\2\2\2\u033b\u033c"+
		"\5X-\2\u033c\u033d\5\u0094K\2\u033d\u0340\3\2\2\2\u033e\u0340\7\16\2\2"+
		"\u033f\u033b\3\2\2\2\u033f\u033e\3\2\2\2\u0340\u0093\3\2\2\2\u0341\u0343"+
		"\5\u0082B\2\u0342\u0341\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0344\3\2\2"+
		"\2\u0344\u0345\5|?\2\u0345\u0095\3\2\2\2\u0346\u0348\5\u0098M\2\u0347"+
		"\u0349\7\30\2\2\u0348\u0347\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u0370\3"+
		"\2\2\2\u034a\u034c\5\u009cO\2\u034b\u034d\7\30\2\2\u034c\u034b\3\2\2\2"+
		"\u034c\u034d\3\2\2\2\u034d\u0370\3\2\2\2\u034e\u0350\5\u009eP\2\u034f"+
		"\u0351\7\30\2\2\u0350\u034f\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0370\3"+
		"\2\2\2\u0352\u0354\5\u00a8U\2\u0353\u0355\7\30\2\2\u0354\u0353\3\2\2\2"+
		"\u0354\u0355\3\2\2\2\u0355\u0370\3\2\2\2\u0356\u0358\5\u00b4[\2\u0357"+
		"\u0359\7\30\2\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u0370\3"+
		"\2\2\2\u035a\u035c\5\64\33\2\u035b\u035d\7\30\2\2\u035c\u035b\3\2\2\2"+
		"\u035c\u035d\3\2\2\2\u035d\u0370\3\2\2\2\u035e\u0360\5\66\34\2\u035f\u0361"+
		"\7\30\2\2\u0360\u035f\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0370\3\2\2\2"+
		"\u0362\u0364\5.\30\2\u0363\u0365\7\30\2\2\u0364\u0363\3\2\2\2\u0364\u0365"+
		"\3\2\2\2\u0365\u0370\3\2\2\2\u0366\u0368\5\60\31\2\u0367\u0369\7\30\2"+
		"\2\u0368\u0367\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u0370\3\2\2\2\u036a\u036c"+
		"\5\u00b6\\\2\u036b\u036d\7\30\2\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2"+
		"\2\2\u036d\u0370\3\2\2\2\u036e\u0370\7\30\2\2\u036f\u0346\3\2\2\2\u036f"+
		"\u034a\3\2\2\2\u036f\u034e\3\2\2\2\u036f\u0352\3\2\2\2\u036f\u0356\3\2"+
		"\2\2\u036f\u035a\3\2\2\2\u036f\u035e\3\2\2\2\u036f\u0362\3\2\2\2\u036f"+
		"\u0366\3\2\2\2\u036f\u036a\3\2\2\2\u036f\u036e\3\2\2\2\u0370\u0097\3\2"+
		"\2\2\u0371\u0372\5\u00d4k\2\u0372\u0373\7\13\2\2\u0373\u0374\5\u0096L"+
		"\2\u0374\u0099\3\2\2\2\u0375\u0378\5\u00c0a\2\u0376\u0377\7.\2\2\u0377"+
		"\u0379\5\u00c0a\2\u0378\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u009b"+
		"\3\2\2\2\u037a\u037f\7\t\2\2\u037b\u037e\5J&\2\u037c\u037e\5\u0096L\2"+
		"\u037d\u037b\3\2\2\2\u037d\u037c\3\2\2\2\u037e\u0381\3\2\2\2\u037f\u037d"+
		"\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0382\3\2\2\2\u0381\u037f\3\2\2\2\u0382"+
		"\u0383\7\n\2\2\u0383\u009d\3\2\2\2\u0384\u0385\7d\2\2\u0385\u0386\7F\2"+
		"\2\u0386\u0387\5\u00b8]\2\u0387\u0388\7G\2\2\u0388\u038b\5\u0096L\2\u0389"+
		"\u038a\7e\2\2\u038a\u038c\5\u0096L\2\u038b\u0389\3\2\2\2\u038b\u038c\3"+
		"\2\2\2\u038c\u038f\3\2\2\2\u038d\u038f\5\u00a0Q\2\u038e\u0384\3\2\2\2"+
		"\u038e\u038d\3\2\2\2\u038f\u009f\3\2\2\2\u0390\u0391\7\61\2\2\u0391\u0392"+
		"\7F\2\2\u0392\u0393\5\u00b8]\2\u0393\u0394\7G\2\2\u0394\u0395\5\u00a2"+
		"R\2\u0395\u00a1\3\2\2\2\u0396\u039a\7\t\2\2\u0397\u0399\5\u00a4S\2\u0398"+
		"\u0397\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u039b\3\2"+
		"\2\2\u039b\u039d\3\2\2\2\u039c\u039a\3\2\2\2\u039d\u039e\7\n\2\2\u039e"+
		"\u00a3\3\2\2\2\u039f\u03a1\5\u00a6T\2\u03a0\u039f\3\2\2\2\u03a1\u03a2"+
		"\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4"+
		"\u03a6\5\u0096L\2\u03a5\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a5"+
		"\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u00a5\3\2\2\2\u03a9\u03af\7\62\2\2"+
		"\u03aa\u03b0\5\u009aN\2\u03ab\u03ac\7F\2\2\u03ac\u03ad\5\u009aN\2\u03ad"+
		"\u03ae\7G\2\2\u03ae\u03b0\3\2\2\2\u03af\u03aa\3\2\2\2\u03af\u03ab\3\2"+
		"\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b2\7\13\2\2\u03b2\u03b6\3\2\2\2\u03b3"+
		"\u03b4\7-\2\2\u03b4\u03b6\7\13\2\2\u03b5\u03a9\3\2\2\2\u03b5\u03b3\3\2"+
		"\2\2\u03b6\u00a7\3\2\2\2\u03b7\u03bc\5\u00aaV\2\u03b8\u03bc\5\u00acW\2"+
		"\u03b9\u03bc\5\u00aeX\2\u03ba\u03bc\5\u00b2Z\2\u03bb\u03b7\3\2\2\2\u03bb"+
		"\u03b8\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bb\u03ba\3\2\2\2\u03bc\u00a9\3\2"+
		"\2\2\u03bd\u03be\7\63\2\2\u03be\u03bf\7F\2\2\u03bf\u03c0\5\u00b8]\2\u03c0"+
		"\u03c1\7G\2\2\u03c1\u03c2\5\u0096L\2\u03c2\u00ab\3\2\2\2\u03c3\u03c4\7"+
		"\64\2\2\u03c4\u03c5\5\u0096L\2\u03c5\u03c6\7\63\2\2\u03c6\u03c7\7F\2\2"+
		"\u03c7\u03c8\5\u00b8]\2\u03c8\u03c9\7G\2\2\u03c9\u03ca\7\30\2\2\u03ca"+
		"\u00ad\3\2\2\2\u03cb\u03cc\7\65\2\2\u03cc\u03ce\7F\2\2\u03cd\u03cf\5\u00b0"+
		"Y\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0"+
		"\u03d2\7\30\2\2\u03d1\u03d3\5\u00b8]\2\u03d2\u03d1\3\2\2\2\u03d2\u03d3"+
		"\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d6\7\30\2\2\u03d5\u03d7\5\u00b6"+
		"\\\2\u03d6\u03d5\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8"+
		"\u03d9\7G\2\2\u03d9\u03da\5\u0096L\2\u03da\u00af\3\2\2\2\u03db\u03dc\5"+
		"X-\2\u03dc\u03dd\5\\/\2\u03dd\u03e0\3\2\2\2\u03de\u03e0\5\u00b6\\\2\u03df"+
		"\u03db\3\2\2\2\u03df\u03de\3\2\2\2\u03e0\u00b1\3\2\2\2\u03e1\u03e2\7\65"+
		"\2\2\u03e2\u03e3\7F\2\2\u03e3\u03e4\5,\27\2\u03e4\u03e6\7\34\2\2\u03e5"+
		"\u03e7\5\u00b8]\2\u03e6\u03e5\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e8"+
		"\3\2\2\2\u03e8\u03e9\7G\2\2\u03e9\u03ea\5\u0096L\2\u03ea\u00b3\3\2\2\2"+
		"\u03eb\u03ec\7f\2\2\u03ec\u03f4\5\u00d4k\2\u03ed\u03f4\7g\2\2\u03ee\u03f4"+
		"\7h\2\2\u03ef\u03f1\7i\2\2\u03f0\u03f2\5\u00b8]\2\u03f1\u03f0\3\2\2\2"+
		"\u03f1\u03f2\3\2\2\2\u03f2\u03f4\3\2\2\2\u03f3\u03eb\3\2\2\2\u03f3\u03ed"+
		"\3\2\2\2\u03f3\u03ee\3\2\2\2\u03f3\u03ef\3\2\2\2\u03f4\u00b5\3\2\2\2\u03f5"+
		"\u03fa\5\u00b8]\2\u03f6\u03f7\7\3\2\2\u03f7\u03f9\5\u00b8]\2\u03f8\u03f6"+
		"\3\2\2\2\u03f9\u03fc\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb"+
		"\u00b7\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fd\u03fe\b]\1\2\u03fe\u0408\5\u00bc"+
		"_\2\u03ff\u0400\7F\2\2\u0400\u0401\5\u009cO\2\u0401\u0402\7G\2\2\u0402"+
		"\u0408\3\2\2\2\u0403\u0404\5\u00c2b\2\u0404\u0405\5\u00ba^\2\u0405\u0406"+
		"\5\u00b8]\3\u0406\u0408\3\2\2\2\u0407\u03fd\3\2\2\2\u0407\u03ff\3\2\2"+
		"\2\u0407\u0403\3\2\2\2\u0408\u0435\3\2\2\2\u0409\u040a\f\17\2\2\u040a"+
		"\u040b\t\t\2\2\u040b\u0434\5\u00b8]\20\u040c\u040d\f\16\2\2\u040d\u040e"+
		"\t\n\2\2\u040e\u0434\5\u00b8]\17\u040f\u0414\f\r\2\2\u0410\u0411\7H\2"+
		"\2\u0411\u0415\7H\2\2\u0412\u0413\7I\2\2\u0413\u0415\7I\2\2\u0414\u0410"+
		"\3\2\2\2\u0414\u0412\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0434\5\u00b8]"+
		"\16\u0417\u0418\f\f\2\2\u0418\u0419\t\13\2\2\u0419\u0434\5\u00b8]\r\u041a"+
		"\u041b\f\13\2\2\u041b\u041c\t\f\2\2\u041c\u0434\5\u00b8]\f\u041d\u041e"+
		"\f\n\2\2\u041e\u041f\7s\2\2\u041f\u0434\5\u00b8]\13\u0420\u0421\f\t\2"+
		"\2\u0421\u0422\7t\2\2\u0422\u0434\5\u00b8]\n\u0423\u0424\f\b\2\2\u0424"+
		"\u0425\7u\2\2\u0425\u0434\5\u00b8]\t\u0426\u0427\f\7\2\2\u0427\u0428\7"+
		"v\2\2\u0428\u0434\5\u00b8]\b\u0429\u042a\f\6\2\2\u042a\u042b\7w\2\2\u042b"+
		"\u0434\5\u00b8]\7\u042c\u042d\f\5\2\2\u042d\u042f\7x\2\2\u042e\u0430\5"+
		"\u00b8]\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0431\3\2\2\2"+
		"\u0431\u0432\7y\2\2\u0432\u0434\5\u00b8]\6\u0433\u0409\3\2\2\2\u0433\u040c"+
		"\3\2\2\2\u0433\u040f\3\2\2\2\u0433\u0417\3\2\2\2\u0433\u041a\3\2\2\2\u0433"+
		"\u041d\3\2\2\2\u0433\u0420\3\2\2\2\u0433\u0423\3\2\2\2\u0433\u0426\3\2"+
		"\2\2\u0433\u0429\3\2\2\2\u0433\u042c\3\2\2\2\u0434\u0437\3\2\2\2\u0435"+
		"\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u00b9\3\2\2\2\u0437\u0435\3\2"+
		"\2\2\u0438\u0439\t\r\2\2\u0439\u00bb\3\2\2\2\u043a\u0444\5\u00c2b\2\u043b"+
		"\u043c\7F\2\2\u043c\u043d\5\u008aF\2\u043d\u043e\7G\2\2\u043e\u0441\3"+
		"\2\2\2\u043f\u0442\5\u00bc_\2\u0440\u0442\5\u00be`\2\u0441\u043f\3\2\2"+
		"\2\u0441\u0440\3\2\2\2\u0442\u0444\3\2\2\2\u0443\u043a\3\2\2\2\u0443\u043b"+
		"\3\2\2\2\u0444\u00bd\3\2\2\2\u0445\u0449\5\u00b8]\2\u0446\u0449\5\u0084"+
		"C\2\u0447\u0449\5\u0086D\2\u0448\u0445\3\2\2\2\u0448\u0446\3\2\2\2\u0448"+
		"\u0447\3\2\2\2\u0449\u00bf\3\2\2\2\u044a\u044d\5\u00d4k\2\u044b\u044d"+
		"\5\u00d0i\2\u044c\u044a\3\2\2\2\u044c\u044b\3\2\2\2\u044d\u00c1\3\2\2"+
		"\2\u044e\u045d\5\u00c6d\2\u044f\u0455\7z\2\2\u0450\u0456\5\u00c2b\2\u0451"+
		"\u0452\7F\2\2\u0452\u0453\5p9\2\u0453\u0454\7G\2\2\u0454\u0456\3\2\2\2"+
		"\u0455\u0450\3\2\2\2\u0455\u0451\3\2\2\2\u0456\u045d\3\2\2\2\u0457\u0458"+
		"\t\16\2\2\u0458\u045d\5\u00c2b\2\u0459\u045a\5\u00c4c\2\u045a\u045b\5"+
		"\u00bc_\2\u045b\u045d\3\2\2\2\u045c\u044e\3\2\2\2\u045c\u044f\3\2\2\2"+
		"\u045c\u0457\3\2\2\2\u045c\u0459\3\2\2\2\u045d\u00c3\3\2\2\2\u045e\u045f"+
		"\t\17\2\2\u045f\u00c5\3\2\2\2\u0460\u0461\bd\1\2\u0461\u0465\5\u00ceh"+
		"\2\u0462\u0464\5\u00c8e\2\u0463\u0462\3\2\2\2\u0464\u0467\3\2\2\2\u0465"+
		"\u0463\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0473\3\2\2\2\u0467\u0465\3\2"+
		"\2\2\u0468\u0469\f\3\2\2\u0469\u046a\t\20\2\2\u046a\u046e\5\u00d4k\2\u046b"+
		"\u046d\5\u00c8e\2\u046c\u046b\3\2\2\2\u046d\u0470\3\2\2\2\u046e\u046c"+
		"\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0472\3\2\2\2\u0470\u046e\3\2\2\2\u0471"+
		"\u0468\3\2\2\2\u0472\u0475\3\2\2\2\u0473\u0471\3\2\2\2\u0473\u0474\3\2"+
		"\2\2\u0474\u00c7\3\2\2\2\u0475\u0473\3\2\2\2\u0476\u0477\7\u0080\2\2\u0477"+
		"\u0478\5\u00b8]\2\u0478\u0479\7\u0081\2\2\u0479\u0489\3\2\2\2\u047a\u047c"+
		"\7F\2\2\u047b\u047d\5\u00caf\2\u047c\u047b\3\2\2\2\u047c\u047d\3\2\2\2"+
		"\u047d\u047e\3\2\2\2\u047e\u0489\7G\2\2\u047f\u0482\7F\2\2\u0480\u0483"+
		"\7\u0082\2\2\u0481\u0483\n\21\2\2\u0482\u0480\3\2\2\2\u0482\u0481\3\2"+
		"\2\2\u0483\u0484\3\2\2\2\u0484\u0482\3\2\2\2\u0484\u0485\3\2\2\2\u0485"+
		"\u0486\3\2\2\2\u0486\u0489\7G\2\2\u0487\u0489\t\16\2\2\u0488\u0476\3\2"+
		"\2\2\u0488\u047a\3\2\2\2\u0488\u047f\3\2\2\2\u0488\u0487\3\2\2\2\u0489"+
		"\u00c9\3\2\2\2\u048a\u048f\5\u00ccg\2\u048b\u048c\7\3\2\2\u048c\u048e"+
		"\5\u00ccg\2\u048d\u048b\3\2\2\2\u048e\u0491\3\2\2\2\u048f\u048d\3\2\2"+
		"\2\u048f\u0490\3\2\2\2\u0490\u00cb\3\2\2\2\u0491\u048f\3\2\2\2\u0492\u0495"+
		"\5\u00b8]\2\u0493\u0495\5p9\2\u0494\u0492\3\2\2\2\u0494\u0493\3\2\2\2"+
		"\u0495\u00cd\3\2\2\2\u0496\u04a5\5\u00d4k\2\u0497\u04a5\5\u00d0i\2\u0498"+
		"\u04a5\5\u00d2j\2\u0499\u049a\7F\2\2\u049a\u049b\5\u00b8]\2\u049b\u049c"+
		"\7G\2\2\u049c\u04a5\3\2\2\2\u049d\u04a5\5\32\16\2\u049e\u04a5\5$\23\2"+
		"\u049f\u04a5\5(\25\2\u04a0\u04a5\5*\26\2\u04a1\u04a5\5\16\b\2\u04a2\u04a5"+
		"\5\22\n\2\u04a3\u04a5\5\30\r\2\u04a4\u0496\3\2\2\2\u04a4\u0497\3\2\2\2"+
		"\u04a4\u0498\3\2\2\2\u04a4\u0499\3\2\2\2\u04a4\u049d\3\2\2\2\u04a4\u049e"+
		"\3\2\2\2\u04a4\u049f\3\2\2\2\u04a4\u04a0\3\2\2\2\u04a4\u04a1\3\2\2\2\u04a4"+
		"\u04a2\3\2\2\2\u04a4\u04a3\3\2\2\2\u04a5\u00cf\3\2\2\2\u04a6\u04b9\7\u0083"+
		"\2\2\u04a7\u04b9\7\u0084\2\2\u04a8\u04b9\7\u0085\2\2\u04a9\u04ab\t\22"+
		"\2\2\u04aa\u04a9\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac"+
		"\u04b9\7E\2\2\u04ad\u04af\t\22\2\2\u04ae\u04ad\3\2\2\2\u04ae\u04af\3\2"+
		"\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b9\7\u0086\2\2\u04b1\u04b9\7\u0087\2"+
		"\2\u04b2\u04b9\7\u0088\2\2\u04b3\u04b9\7\u0089\2\2\u04b4\u04b9\7\u008a"+
		"\2\2\u04b5\u04b9\7\u008b\2\2\u04b6\u04b9\7\u008c\2\2\u04b7\u04b9\7\u008d"+
		"\2\2\u04b8\u04a6\3\2\2\2\u04b8\u04a7\3\2\2\2\u04b8\u04a8\3\2\2\2\u04b8"+
		"\u04aa\3\2\2\2\u04b8\u04ae\3\2\2\2\u04b8\u04b1\3\2\2\2\u04b8\u04b2\3\2"+
		"\2\2\u04b8\u04b3\3\2\2\2\u04b8\u04b4\3\2\2\2\u04b8\u04b5\3\2\2\2\u04b8"+
		"\u04b6\3\2\2\2\u04b8\u04b7\3\2\2\2\u04b9\u00d1\3\2\2\2\u04ba\u04be\7\u008e"+
		"\2\2\u04bb\u04bd\t\23\2\2\u04bc\u04bb\3\2\2\2\u04bd\u04c0\3\2\2\2\u04be"+
		"\u04bc\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c1\3\2\2\2\u04c0\u04be\3\2"+
		"\2\2\u04c1\u04c3\7\u0091\2\2\u04c2\u04ba\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4"+
		"\u04c2\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u00d3\3\2\2\2\u04c6\u04c7\7D"+
		"\2\2\u04c7\u00d5\3\2\2\2\u00a2\u00d9\u00e1\u00e8\u00f0\u00f3\u00f7\u00fa"+
		"\u00fe\u0104\u0108\u0111\u0115\u0117\u0123\u0125\u012c\u0132\u0135\u013b"+
		"\u013f\u0142\u0145\u0150\u0156\u0158\u015b\u0163\u0168\u016e\u0177\u017c"+
		"\u017e\u0194\u019b\u01a0\u01b8\u01bd\u01c2\u01c6\u01ca\u01ce\u01d7\u01de"+
		"\u01e5\u01eb\u01ee\u01f2\u01fa\u01fd\u0201\u0209\u020e\u0215\u021e\u0222"+
		"\u022d\u0237\u0242\u0248\u0250\u0252\u025a\u0268\u0278\u027a\u0283\u0287"+
		"\u028e\u0294\u02a0\u02a7\u02ab\u02b0\u02b4\u02bb\u02c0\u02c6\u02c9\u02cd"+
		"\u02d1\u02d8\u02dc\u02df\u02e4\u02e6\u02f2\u02f6\u02f8\u0301\u0305\u0309"+
		"\u030c\u0310\u0314\u031a\u031e\u0323\u0325\u0329\u032e\u0331\u0338\u033f"+
		"\u0342\u0348\u034c\u0350\u0354\u0358\u035c\u0360\u0364\u0368\u036c\u036f"+
		"\u0378\u037d\u037f\u038b\u038e\u039a\u03a2\u03a7\u03af\u03b5\u03bb\u03ce"+
		"\u03d2\u03d6\u03df\u03e6\u03f1\u03f3\u03fa\u0407\u0414\u042f\u0433\u0435"+
		"\u0441\u0443\u0448\u044c\u0455\u045c\u0465\u046e\u0473\u047c\u0482\u0484"+
		"\u0488\u048f\u0494\u04a4\u04aa\u04ae\u04b8\u04be\u04c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}