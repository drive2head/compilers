// Generated from /Users/garanya/Desktop/Учеба/Компиляторы/compilers/grammar/ObjectiveCParser.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ObjectiveCParser}.
 */
public interface ObjectiveCParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(ObjectiveCParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(ObjectiveCParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#topLevelDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelDeclaration(ObjectiveCParser.TopLevelDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#topLevelDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelDeclaration(ObjectiveCParser.TopLevelDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#protocolList}.
	 * @param ctx the parse tree
	 */
	void enterProtocolList(ObjectiveCParser.ProtocolListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#protocolList}.
	 * @param ctx the parse tree
	 */
	void exitProtocolList(ObjectiveCParser.ProtocolListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#protocolName}.
	 * @param ctx the parse tree
	 */
	void enterProtocolName(ObjectiveCParser.ProtocolNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#protocolName}.
	 * @param ctx the parse tree
	 */
	void exitProtocolName(ObjectiveCParser.ProtocolNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(ObjectiveCParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(ObjectiveCParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#blockType}.
	 * @param ctx the parse tree
	 */
	void enterBlockType(ObjectiveCParser.BlockTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#blockType}.
	 * @param ctx the parse tree
	 */
	void exitBlockType(ObjectiveCParser.BlockTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#dictionaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryExpression(ObjectiveCParser.DictionaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#dictionaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryExpression(ObjectiveCParser.DictionaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#dictionaryPair}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryPair(ObjectiveCParser.DictionaryPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#dictionaryPair}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryPair(ObjectiveCParser.DictionaryPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpression(ObjectiveCParser.ArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpression(ObjectiveCParser.ArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#blockParameters}.
	 * @param ctx the parse tree
	 */
	void enterBlockParameters(ObjectiveCParser.BlockParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#blockParameters}.
	 * @param ctx the parse tree
	 */
	void exitBlockParameters(ObjectiveCParser.BlockParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#typeVariableDeclaratorOrName}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariableDeclaratorOrName(ObjectiveCParser.TypeVariableDeclaratorOrNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#typeVariableDeclaratorOrName}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariableDeclaratorOrName(ObjectiveCParser.TypeVariableDeclaratorOrNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#blockExpression}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpression(ObjectiveCParser.BlockExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#blockExpression}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpression(ObjectiveCParser.BlockExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#messageExpression}.
	 * @param ctx the parse tree
	 */
	void enterMessageExpression(ObjectiveCParser.MessageExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#messageExpression}.
	 * @param ctx the parse tree
	 */
	void exitMessageExpression(ObjectiveCParser.MessageExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(ObjectiveCParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(ObjectiveCParser.ReceiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#messageSelector}.
	 * @param ctx the parse tree
	 */
	void enterMessageSelector(ObjectiveCParser.MessageSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#messageSelector}.
	 * @param ctx the parse tree
	 */
	void exitMessageSelector(ObjectiveCParser.MessageSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#keywordArgument}.
	 * @param ctx the parse tree
	 */
	void enterKeywordArgument(ObjectiveCParser.KeywordArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#keywordArgument}.
	 * @param ctx the parse tree
	 */
	void exitKeywordArgument(ObjectiveCParser.KeywordArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#keywordArgumentType}.
	 * @param ctx the parse tree
	 */
	void enterKeywordArgumentType(ObjectiveCParser.KeywordArgumentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#keywordArgumentType}.
	 * @param ctx the parse tree
	 */
	void exitKeywordArgumentType(ObjectiveCParser.KeywordArgumentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#selectorExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectorExpression(ObjectiveCParser.SelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#selectorExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectorExpression(ObjectiveCParser.SelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#selectorName}.
	 * @param ctx the parse tree
	 */
	void enterSelectorName(ObjectiveCParser.SelectorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#selectorName}.
	 * @param ctx the parse tree
	 */
	void exitSelectorName(ObjectiveCParser.SelectorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#protocolExpression}.
	 * @param ctx the parse tree
	 */
	void enterProtocolExpression(ObjectiveCParser.ProtocolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#protocolExpression}.
	 * @param ctx the parse tree
	 */
	void exitProtocolExpression(ObjectiveCParser.ProtocolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#encodeExpression}.
	 * @param ctx the parse tree
	 */
	void enterEncodeExpression(ObjectiveCParser.EncodeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#encodeExpression}.
	 * @param ctx the parse tree
	 */
	void exitEncodeExpression(ObjectiveCParser.EncodeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#typeVariableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariableDeclarator(ObjectiveCParser.TypeVariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#typeVariableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariableDeclarator(ObjectiveCParser.TypeVariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(ObjectiveCParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(ObjectiveCParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void enterTryBlock(ObjectiveCParser.TryBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void exitTryBlock(ObjectiveCParser.TryBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#catchStatement}.
	 * @param ctx the parse tree
	 */
	void enterCatchStatement(ObjectiveCParser.CatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#catchStatement}.
	 * @param ctx the parse tree
	 */
	void exitCatchStatement(ObjectiveCParser.CatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(ObjectiveCParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(ObjectiveCParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#autoreleaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterAutoreleaseStatement(ObjectiveCParser.AutoreleaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#autoreleaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitAutoreleaseStatement(ObjectiveCParser.AutoreleaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(ObjectiveCParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(ObjectiveCParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(ObjectiveCParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(ObjectiveCParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSignature(ObjectiveCParser.FunctionSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSignature(ObjectiveCParser.FunctionSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(ObjectiveCParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(ObjectiveCParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(ObjectiveCParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(ObjectiveCParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#attributeParameters}.
	 * @param ctx the parse tree
	 */
	void enterAttributeParameters(ObjectiveCParser.AttributeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#attributeParameters}.
	 * @param ctx the parse tree
	 */
	void exitAttributeParameters(ObjectiveCParser.AttributeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#attributeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterAttributeParameterList(ObjectiveCParser.AttributeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#attributeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitAttributeParameterList(ObjectiveCParser.AttributeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#attributeParameter}.
	 * @param ctx the parse tree
	 */
	void enterAttributeParameter(ObjectiveCParser.AttributeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#attributeParameter}.
	 * @param ctx the parse tree
	 */
	void exitAttributeParameter(ObjectiveCParser.AttributeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#attributeParameterAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAttributeParameterAssignment(ObjectiveCParser.AttributeParameterAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#attributeParameterAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAttributeParameterAssignment(ObjectiveCParser.AttributeParameterAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ObjectiveCParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ObjectiveCParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(ObjectiveCParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(ObjectiveCParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(ObjectiveCParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(ObjectiveCParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(ObjectiveCParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(ObjectiveCParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#typedefDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypedefDeclaration(ObjectiveCParser.TypedefDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#typedefDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypedefDeclaration(ObjectiveCParser.TypedefDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#typeDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaratorList(ObjectiveCParser.TypeDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#typeDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaratorList(ObjectiveCParser.TypeDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#typeDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclarator(ObjectiveCParser.TypeDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#typeDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclarator(ObjectiveCParser.TypeDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(ObjectiveCParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(ObjectiveCParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#attributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecifier(ObjectiveCParser.AttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#attributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecifier(ObjectiveCParser.AttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(ObjectiveCParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(ObjectiveCParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(ObjectiveCParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(ObjectiveCParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(ObjectiveCParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(ObjectiveCParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#ibOutletQualifier}.
	 * @param ctx the parse tree
	 */
	void enterIbOutletQualifier(ObjectiveCParser.IbOutletQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#ibOutletQualifier}.
	 * @param ctx the parse tree
	 */
	void exitIbOutletQualifier(ObjectiveCParser.IbOutletQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#arcBehaviourSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterArcBehaviourSpecifier(ObjectiveCParser.ArcBehaviourSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#arcBehaviourSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitArcBehaviourSpecifier(ObjectiveCParser.ArcBehaviourSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#nullabilitySpecifier}.
	 * @param ctx the parse tree
	 */
	void enterNullabilitySpecifier(ObjectiveCParser.NullabilitySpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#nullabilitySpecifier}.
	 * @param ctx the parse tree
	 */
	void exitNullabilitySpecifier(ObjectiveCParser.NullabilitySpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(ObjectiveCParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(ObjectiveCParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#typePrefix}.
	 * @param ctx the parse tree
	 */
	void enterTypePrefix(ObjectiveCParser.TypePrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#typePrefix}.
	 * @param ctx the parse tree
	 */
	void exitTypePrefix(ObjectiveCParser.TypePrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(ObjectiveCParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(ObjectiveCParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#protocolQualifier}.
	 * @param ctx the parse tree
	 */
	void enterProtocolQualifier(ObjectiveCParser.ProtocolQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#protocolQualifier}.
	 * @param ctx the parse tree
	 */
	void exitProtocolQualifier(ObjectiveCParser.ProtocolQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(ObjectiveCParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(ObjectiveCParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#typeofExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeofExpression(ObjectiveCParser.TypeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#typeofExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeofExpression(ObjectiveCParser.TypeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(ObjectiveCParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(ObjectiveCParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(ObjectiveCParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(ObjectiveCParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(ObjectiveCParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(ObjectiveCParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#enumeratorIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorIdentifier(ObjectiveCParser.EnumeratorIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#enumeratorIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorIdentifier(ObjectiveCParser.EnumeratorIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(ObjectiveCParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(ObjectiveCParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#declaratorSuffix}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratorSuffix(ObjectiveCParser.DeclaratorSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#declaratorSuffix}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratorSuffix(ObjectiveCParser.DeclaratorSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(ObjectiveCParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(ObjectiveCParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(ObjectiveCParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(ObjectiveCParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(ObjectiveCParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(ObjectiveCParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#structInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStructInitializer(ObjectiveCParser.StructInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#structInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStructInitializer(ObjectiveCParser.StructInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(ObjectiveCParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(ObjectiveCParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(ObjectiveCParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(ObjectiveCParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(ObjectiveCParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(ObjectiveCParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#abstractDeclaratorSuffix}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclaratorSuffix(ObjectiveCParser.AbstractDeclaratorSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#abstractDeclaratorSuffix}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclaratorSuffix(ObjectiveCParser.AbstractDeclaratorSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarationList(ObjectiveCParser.ParameterDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarationList(ObjectiveCParser.ParameterDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(ObjectiveCParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(ObjectiveCParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(ObjectiveCParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(ObjectiveCParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ObjectiveCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ObjectiveCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(ObjectiveCParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(ObjectiveCParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpression(ObjectiveCParser.RangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpression(ObjectiveCParser.RangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(ObjectiveCParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(ObjectiveCParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionStatement(ObjectiveCParser.ConditionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionStatement(ObjectiveCParser.ConditionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(ObjectiveCParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(ObjectiveCParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(ObjectiveCParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(ObjectiveCParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#switchSection}.
	 * @param ctx the parse tree
	 */
	void enterSwitchSection(ObjectiveCParser.SwitchSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#switchSection}.
	 * @param ctx the parse tree
	 */
	void exitSwitchSection(ObjectiveCParser.SwitchSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(ObjectiveCParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(ObjectiveCParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(ObjectiveCParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(ObjectiveCParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ObjectiveCParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ObjectiveCParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(ObjectiveCParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(ObjectiveCParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ObjectiveCParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ObjectiveCParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#forLoopInitializer}.
	 * @param ctx the parse tree
	 */
	void enterForLoopInitializer(ObjectiveCParser.ForLoopInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#forLoopInitializer}.
	 * @param ctx the parse tree
	 */
	void exitForLoopInitializer(ObjectiveCParser.ForLoopInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#forInStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(ObjectiveCParser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#forInStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(ObjectiveCParser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(ObjectiveCParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(ObjectiveCParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(ObjectiveCParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(ObjectiveCParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ObjectiveCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ObjectiveCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(ObjectiveCParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(ObjectiveCParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(ObjectiveCParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(ObjectiveCParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(ObjectiveCParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(ObjectiveCParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(ObjectiveCParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(ObjectiveCParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ObjectiveCParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ObjectiveCParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(ObjectiveCParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(ObjectiveCParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ObjectiveCParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ObjectiveCParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(ObjectiveCParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(ObjectiveCParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterPostfix(ObjectiveCParser.PostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitPostfix(ObjectiveCParser.PostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(ObjectiveCParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(ObjectiveCParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#argumentExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpression(ObjectiveCParser.ArgumentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#argumentExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpression(ObjectiveCParser.ArgumentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(ObjectiveCParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(ObjectiveCParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(ObjectiveCParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(ObjectiveCParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(ObjectiveCParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(ObjectiveCParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ObjectiveCParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ObjectiveCParser.IdentifierContext ctx);
}