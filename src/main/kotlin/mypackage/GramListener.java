// Generated from /Users/garanya/Desktop/Учеба/Компиляторы/compilers/src/main/kotlin/Gram.g4 by ANTLR 4.9.1
package mypackage;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramParser}.
 */
public interface GramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(GramParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(GramParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#topLevelDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelDeclaration(GramParser.TopLevelDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#topLevelDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelDeclaration(GramParser.TopLevelDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#protocolList}.
	 * @param ctx the parse tree
	 */
	void enterProtocolList(GramParser.ProtocolListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#protocolList}.
	 * @param ctx the parse tree
	 */
	void exitProtocolList(GramParser.ProtocolListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#protocolName}.
	 * @param ctx the parse tree
	 */
	void enterProtocolName(GramParser.ProtocolNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#protocolName}.
	 * @param ctx the parse tree
	 */
	void exitProtocolName(GramParser.ProtocolNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(GramParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(GramParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#blockType}.
	 * @param ctx the parse tree
	 */
	void enterBlockType(GramParser.BlockTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#blockType}.
	 * @param ctx the parse tree
	 */
	void exitBlockType(GramParser.BlockTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#dictionaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryExpression(GramParser.DictionaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#dictionaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryExpression(GramParser.DictionaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#dictionaryPair}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryPair(GramParser.DictionaryPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#dictionaryPair}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryPair(GramParser.DictionaryPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpression(GramParser.ArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpression(GramParser.ArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#blockParameters}.
	 * @param ctx the parse tree
	 */
	void enterBlockParameters(GramParser.BlockParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#blockParameters}.
	 * @param ctx the parse tree
	 */
	void exitBlockParameters(GramParser.BlockParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeVariableDeclaratorOrName}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariableDeclaratorOrName(GramParser.TypeVariableDeclaratorOrNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeVariableDeclaratorOrName}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariableDeclaratorOrName(GramParser.TypeVariableDeclaratorOrNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#blockExpression}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpression(GramParser.BlockExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#blockExpression}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpression(GramParser.BlockExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#messageExpression}.
	 * @param ctx the parse tree
	 */
	void enterMessageExpression(GramParser.MessageExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#messageExpression}.
	 * @param ctx the parse tree
	 */
	void exitMessageExpression(GramParser.MessageExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(GramParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(GramParser.ReceiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#messageSelector}.
	 * @param ctx the parse tree
	 */
	void enterMessageSelector(GramParser.MessageSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#messageSelector}.
	 * @param ctx the parse tree
	 */
	void exitMessageSelector(GramParser.MessageSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#keywordArgument}.
	 * @param ctx the parse tree
	 */
	void enterKeywordArgument(GramParser.KeywordArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#keywordArgument}.
	 * @param ctx the parse tree
	 */
	void exitKeywordArgument(GramParser.KeywordArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#keywordArgumentType}.
	 * @param ctx the parse tree
	 */
	void enterKeywordArgumentType(GramParser.KeywordArgumentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#keywordArgumentType}.
	 * @param ctx the parse tree
	 */
	void exitKeywordArgumentType(GramParser.KeywordArgumentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#selectorExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectorExpression(GramParser.SelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#selectorExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectorExpression(GramParser.SelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#selectorName}.
	 * @param ctx the parse tree
	 */
	void enterSelectorName(GramParser.SelectorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#selectorName}.
	 * @param ctx the parse tree
	 */
	void exitSelectorName(GramParser.SelectorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#protocolExpression}.
	 * @param ctx the parse tree
	 */
	void enterProtocolExpression(GramParser.ProtocolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#protocolExpression}.
	 * @param ctx the parse tree
	 */
	void exitProtocolExpression(GramParser.ProtocolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#encodeExpression}.
	 * @param ctx the parse tree
	 */
	void enterEncodeExpression(GramParser.EncodeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#encodeExpression}.
	 * @param ctx the parse tree
	 */
	void exitEncodeExpression(GramParser.EncodeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeVariableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariableDeclarator(GramParser.TypeVariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeVariableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariableDeclarator(GramParser.TypeVariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(GramParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(GramParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void enterTryBlock(GramParser.TryBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void exitTryBlock(GramParser.TryBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#catchStatement}.
	 * @param ctx the parse tree
	 */
	void enterCatchStatement(GramParser.CatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#catchStatement}.
	 * @param ctx the parse tree
	 */
	void exitCatchStatement(GramParser.CatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(GramParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(GramParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#autoreleaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterAutoreleaseStatement(GramParser.AutoreleaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#autoreleaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitAutoreleaseStatement(GramParser.AutoreleaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(GramParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(GramParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(GramParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(GramParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSignature(GramParser.FunctionSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSignature(GramParser.FunctionSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(GramParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(GramParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(GramParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(GramParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#attributeParameters}.
	 * @param ctx the parse tree
	 */
	void enterAttributeParameters(GramParser.AttributeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#attributeParameters}.
	 * @param ctx the parse tree
	 */
	void exitAttributeParameters(GramParser.AttributeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#attributeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterAttributeParameterList(GramParser.AttributeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#attributeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitAttributeParameterList(GramParser.AttributeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#attributeParameter}.
	 * @param ctx the parse tree
	 */
	void enterAttributeParameter(GramParser.AttributeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#attributeParameter}.
	 * @param ctx the parse tree
	 */
	void exitAttributeParameter(GramParser.AttributeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#attributeParameterAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAttributeParameterAssignment(GramParser.AttributeParameterAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#attributeParameterAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAttributeParameterAssignment(GramParser.AttributeParameterAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GramParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GramParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(GramParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(GramParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(GramParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(GramParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(GramParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(GramParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typedefDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypedefDeclaration(GramParser.TypedefDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typedefDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypedefDeclaration(GramParser.TypedefDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaratorList(GramParser.TypeDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaratorList(GramParser.TypeDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclarator(GramParser.TypeDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclarator(GramParser.TypeDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(GramParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(GramParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#attributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecifier(GramParser.AttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#attributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecifier(GramParser.AttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(GramParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(GramParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(GramParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(GramParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(GramParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(GramParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#ibOutletQualifier}.
	 * @param ctx the parse tree
	 */
	void enterIbOutletQualifier(GramParser.IbOutletQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#ibOutletQualifier}.
	 * @param ctx the parse tree
	 */
	void exitIbOutletQualifier(GramParser.IbOutletQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#arcBehaviourSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterArcBehaviourSpecifier(GramParser.ArcBehaviourSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#arcBehaviourSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitArcBehaviourSpecifier(GramParser.ArcBehaviourSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#nullabilitySpecifier}.
	 * @param ctx the parse tree
	 */
	void enterNullabilitySpecifier(GramParser.NullabilitySpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#nullabilitySpecifier}.
	 * @param ctx the parse tree
	 */
	void exitNullabilitySpecifier(GramParser.NullabilitySpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(GramParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(GramParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typePrefix}.
	 * @param ctx the parse tree
	 */
	void enterTypePrefix(GramParser.TypePrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typePrefix}.
	 * @param ctx the parse tree
	 */
	void exitTypePrefix(GramParser.TypePrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(GramParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(GramParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#protocolQualifier}.
	 * @param ctx the parse tree
	 */
	void enterProtocolQualifier(GramParser.ProtocolQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#protocolQualifier}.
	 * @param ctx the parse tree
	 */
	void exitProtocolQualifier(GramParser.ProtocolQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(GramParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(GramParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeofExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeofExpression(GramParser.TypeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeofExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeofExpression(GramParser.TypeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(GramParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(GramParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(GramParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(GramParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(GramParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(GramParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#enumeratorIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorIdentifier(GramParser.EnumeratorIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#enumeratorIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorIdentifier(GramParser.EnumeratorIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(GramParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(GramParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#declaratorSuffix}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratorSuffix(GramParser.DeclaratorSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#declaratorSuffix}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratorSuffix(GramParser.DeclaratorSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(GramParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(GramParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(GramParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(GramParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(GramParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(GramParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#structInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStructInitializer(GramParser.StructInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#structInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStructInitializer(GramParser.StructInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(GramParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(GramParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(GramParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(GramParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(GramParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(GramParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#abstractDeclaratorSuffix}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclaratorSuffix(GramParser.AbstractDeclaratorSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#abstractDeclaratorSuffix}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclaratorSuffix(GramParser.AbstractDeclaratorSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarationList(GramParser.ParameterDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarationList(GramParser.ParameterDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(GramParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(GramParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(GramParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(GramParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GramParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GramParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(GramParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(GramParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpression(GramParser.RangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpression(GramParser.RangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(GramParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(GramParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(GramParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(GramParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(GramParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(GramParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(GramParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(GramParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#switchSection}.
	 * @param ctx the parse tree
	 */
	void enterSwitchSection(GramParser.SwitchSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#switchSection}.
	 * @param ctx the parse tree
	 */
	void exitSwitchSection(GramParser.SwitchSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(GramParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(GramParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(GramParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(GramParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(GramParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(GramParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(GramParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(GramParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(GramParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(GramParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#forLoopInitializer}.
	 * @param ctx the parse tree
	 */
	void enterForLoopInitializer(GramParser.ForLoopInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#forLoopInitializer}.
	 * @param ctx the parse tree
	 */
	void exitForLoopInitializer(GramParser.ForLoopInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#forInStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(GramParser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#forInStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(GramParser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(GramParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(GramParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(GramParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(GramParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GramParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GramParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(GramParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(GramParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(GramParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(GramParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(GramParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(GramParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(GramParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(GramParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(GramParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(GramParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(GramParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(GramParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(GramParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(GramParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterPostfix(GramParser.PostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitPostfix(GramParser.PostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(GramParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(GramParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#argumentExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpression(GramParser.ArgumentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#argumentExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpression(GramParser.ArgumentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(GramParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(GramParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(GramParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(GramParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(GramParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(GramParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(GramParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(GramParser.IdentifierContext ctx);
}