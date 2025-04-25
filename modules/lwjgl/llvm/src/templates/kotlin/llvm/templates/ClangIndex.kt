/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val ClangIndex = "ClangIndex".nativeClass(
    Module.LLVM,
    prefixConstant = "CX",
    prefixMethod = "clang_",
    binding = CLANG_BINDING
) {
    nativeImport("clang-c/Index.h")

    IntConstant(
        "CINDEX_VERSION_MAJOR".."0",
        "CINDEX_VERSION_MINOR".."64",
        "CINDEX_VERSION".."CINDEX_VERSION_MAJOR*10000 + CINDEX_VERSION_MINOR"
    ).noPrefix()

    StringConstant(
        "CINDEX_VERSION_STRING".."0.62"
    ).noPrefix()

    EnumConstant(
        "Error_Success".enum("0"),
        "Error_Failure".enum,
        "Error_Crashed".enum,
        "Error_InvalidArguments".enum,
        "Error_ASTReadError".enum
    )

    EnumConstant(
        "Availability_Available".enum("0"),
        "Availability_Deprecated".enum,
        "Availability_NotAvailable".enum,
        "Availability_NotAccessible".enum
    )

    EnumConstant(
        "Cursor_ExceptionSpecificationKind_None".enum("0"),
        "Cursor_ExceptionSpecificationKind_DynamicNone".enum,
        "Cursor_ExceptionSpecificationKind_Dynamic".enum,
        "Cursor_ExceptionSpecificationKind_MSAny".enum,
        "Cursor_ExceptionSpecificationKind_BasicNoexcept".enum,
        "Cursor_ExceptionSpecificationKind_ComputedNoexcept".enum,
        "Cursor_ExceptionSpecificationKind_Unevaluated".enum,
        "Cursor_ExceptionSpecificationKind_Uninstantiated".enum,
        "Cursor_ExceptionSpecificationKind_Unparsed".enum,
        "Cursor_ExceptionSpecificationKind_NoThrow".enum
    )

    EnumConstantByte(
        "Choice_Default".enumByte("0"),
        "Choice_Enabled".enumByte,
        "Choice_Disabled".enumByte
    )

    EnumConstant(
        "GlobalOpt_None".enum("0x0"),
        "GlobalOpt_ThreadBackgroundPriorityForIndexing".enum("0x1"),
        "GlobalOpt_ThreadBackgroundPriorityForEditing".enum("0x2"),
        "GlobalOpt_ThreadBackgroundPriorityForAll".enum("CXGlobalOpt_ThreadBackgroundPriorityForIndexing | CXGlobalOpt_ThreadBackgroundPriorityForEditing")
    )

    EnumConstant(
        "Diagnostic_Ignored".enum("0"),
        "Diagnostic_Note".enum,
        "Diagnostic_Warning".enum,
        "Diagnostic_Error".enum,
        "Diagnostic_Fatal".enum
    )

    EnumConstant(
        "LoadDiag_None".enum("0"),
        "LoadDiag_Unknown".enum,
        "LoadDiag_CannotLoad".enum,
        "LoadDiag_InvalidFile".enum
    )

    EnumConstant(
        "Diagnostic_DisplaySourceLocation".enum("0x01"),
        "Diagnostic_DisplayColumn".enum("0x02"),
        "Diagnostic_DisplaySourceRanges".enum("0x04"),
        "Diagnostic_DisplayOption".enum("0x08"),
        "Diagnostic_DisplayCategoryId".enum("0x10"),
        "Diagnostic_DisplayCategoryName".enum("0x20")
    )

    EnumConstant(
        "TranslationUnit_None".enum("0x0"),
        "TranslationUnit_DetailedPreprocessingRecord".enum("0x01"),
        "TranslationUnit_Incomplete".enum("0x02"),
        "TranslationUnit_PrecompiledPreamble".enum("0x04"),
        "TranslationUnit_CacheCompletionResults".enum("0x08"),
        "TranslationUnit_ForSerialization".enum("0x10"),
        "TranslationUnit_CXXChainedPCH".enum("0x20"),
        "TranslationUnit_SkipFunctionBodies".enum("0x40"),
        "TranslationUnit_IncludeBriefCommentsInCodeCompletion".enum("0x80"),
        "TranslationUnit_CreatePreambleOnFirstParse".enum("0x100"),
        "TranslationUnit_KeepGoing".enum("0x200"),
        "TranslationUnit_SingleFileParse".enum("0x400"),
        "TranslationUnit_LimitSkipFunctionBodiesToPreamble".enum("0x800"),
        "TranslationUnit_IncludeAttributedTypes".enum("0x1000"),
        "TranslationUnit_VisitImplicitAttributes".enum("0x2000"),
        "TranslationUnit_IgnoreNonErrorsFromIncludedFiles".enum("0x4000"),
        "TranslationUnit_RetainExcludedConditionalBlocks".enum("0x8000")
    )

    EnumConstant(
        "SaveTranslationUnit_None".enum("0x0")
    )

    EnumConstant(
        "SaveError_None".enum("0"),
        "SaveError_Unknown".enum,
        "SaveError_TranslationErrors".enum,
        "SaveError_InvalidTU".enum
    )

    EnumConstant(
        "Reparse_None".enum("0x0")
    )

    EnumConstant(
        "TUResourceUsage_AST".enum("1"),
        "TUResourceUsage_Identifiers".enum,
        "TUResourceUsage_Selectors".enum,
        "TUResourceUsage_GlobalCompletionResults".enum,
        "TUResourceUsage_SourceManagerContentCache".enum,
        "TUResourceUsage_AST_SideTables".enum,
        "TUResourceUsage_SourceManager_Membuffer_Malloc".enum,
        "TUResourceUsage_SourceManager_Membuffer_MMap".enum,
        "TUResourceUsage_ExternalASTSource_Membuffer_Malloc".enum,
        "TUResourceUsage_ExternalASTSource_Membuffer_MMap".enum,
        "TUResourceUsage_Preprocessor".enum,
        "TUResourceUsage_PreprocessingRecord".enum,
        "TUResourceUsage_SourceManager_DataStructures".enum,
        "TUResourceUsage_Preprocessor_HeaderSearch".enum,
        "TUResourceUsage_MEMORY_IN_BYTES_BEGIN".enum("CXTUResourceUsage_AST"),
        "TUResourceUsage_MEMORY_IN_BYTES_END".enum("CXTUResourceUsage_Preprocessor_HeaderSearch"),
        "TUResourceUsage_First".enum("CXTUResourceUsage_AST"),
        "TUResourceUsage_Last".enum("CXTUResourceUsage_Preprocessor_HeaderSearch")
    )

    EnumConstant(
        "Cursor_UnexposedDecl".enum("1"),
        "Cursor_StructDecl".enum,
        "Cursor_UnionDecl".enum,
        "Cursor_ClassDecl".enum,
        "Cursor_EnumDecl".enum,
        "Cursor_FieldDecl".enum,
        "Cursor_EnumConstantDecl".enum,
        "Cursor_FunctionDecl".enum,
        "Cursor_VarDecl".enum,
        "Cursor_ParmDecl".enum,
        "Cursor_ObjCInterfaceDecl".enum,
        "Cursor_ObjCCategoryDecl".enum,
        "Cursor_ObjCProtocolDecl".enum,
        "Cursor_ObjCPropertyDecl".enum,
        "Cursor_ObjCIvarDecl".enum,
        "Cursor_ObjCInstanceMethodDecl".enum,
        "Cursor_ObjCClassMethodDecl".enum,
        "Cursor_ObjCImplementationDecl".enum,
        "Cursor_ObjCCategoryImplDecl".enum,
        "Cursor_TypedefDecl".enum,
        "Cursor_CXXMethod".enum,
        "Cursor_Namespace".enum,
        "Cursor_LinkageSpec".enum,
        "Cursor_Constructor".enum,
        "Cursor_Destructor".enum,
        "Cursor_ConversionFunction".enum,
        "Cursor_TemplateTypeParameter".enum,
        "Cursor_NonTypeTemplateParameter".enum,
        "Cursor_TemplateTemplateParameter".enum,
        "Cursor_FunctionTemplate".enum,
        "Cursor_ClassTemplate".enum,
        "Cursor_ClassTemplatePartialSpecialization".enum,
        "Cursor_NamespaceAlias".enum,
        "Cursor_UsingDirective".enum,
        "Cursor_UsingDeclaration".enum,
        "Cursor_TypeAliasDecl".enum,
        "Cursor_ObjCSynthesizeDecl".enum,
        "Cursor_ObjCDynamicDecl".enum,
        "Cursor_CXXAccessSpecifier".enum,
        "Cursor_FirstDecl".enum("CXCursor_UnexposedDecl"),
        "Cursor_LastDecl".enum("CXCursor_CXXAccessSpecifier"),
        "Cursor_FirstRef".enum("40"),
        "Cursor_ObjCSuperClassRef".enum("40"),
        "Cursor_ObjCProtocolRef".enum,
        "Cursor_ObjCClassRef".enum,
        "Cursor_TypeRef".enum,
        "Cursor_CXXBaseSpecifier".enum,
        "Cursor_TemplateRef".enum,
        "Cursor_NamespaceRef".enum,
        "Cursor_MemberRef".enum,
        "Cursor_LabelRef".enum,
        "Cursor_OverloadedDeclRef".enum,
        "Cursor_VariableRef".enum,
        "Cursor_LastRef".enum("CXCursor_VariableRef"),
        "Cursor_FirstInvalid".enum("70"),
        "Cursor_InvalidFile".enum("70"),
        "Cursor_NoDeclFound".enum,
        "Cursor_NotImplemented".enum,
        "Cursor_InvalidCode".enum,
        "Cursor_LastInvalid".enum("CXCursor_InvalidCode"),
        "Cursor_FirstExpr".enum("100"),
        "Cursor_UnexposedExpr".enum("100"),
        "Cursor_DeclRefExpr".enum,
        "Cursor_MemberRefExpr".enum,
        "Cursor_CallExpr".enum,
        "Cursor_ObjCMessageExpr".enum,
        "Cursor_BlockExpr".enum,
        "Cursor_IntegerLiteral".enum,
        "Cursor_FloatingLiteral".enum,
        "Cursor_ImaginaryLiteral".enum,
        "Cursor_StringLiteral".enum,
        "Cursor_CharacterLiteral".enum,
        "Cursor_ParenExpr".enum,
        "Cursor_UnaryOperator".enum,
        "Cursor_ArraySubscriptExpr".enum,
        "Cursor_BinaryOperator".enum,
        "Cursor_CompoundAssignOperator".enum,
        "Cursor_ConditionalOperator".enum,
        "Cursor_CStyleCastExpr".enum,
        "Cursor_CompoundLiteralExpr".enum,
        "Cursor_InitListExpr".enum,
        "Cursor_AddrLabelExpr".enum,
        "Cursor_StmtExpr".enum,
        "Cursor_GenericSelectionExpr".enum,
        "Cursor_GNUNullExpr".enum,
        "Cursor_CXXStaticCastExpr".enum,
        "Cursor_CXXDynamicCastExpr".enum,
        "Cursor_CXXReinterpretCastExpr".enum,
        "Cursor_CXXConstCastExpr".enum,
        "Cursor_CXXFunctionalCastExpr".enum,
        "Cursor_CXXTypeidExpr".enum,
        "Cursor_CXXBoolLiteralExpr".enum,
        "Cursor_CXXNullPtrLiteralExpr".enum,
        "Cursor_CXXThisExpr".enum,
        "Cursor_CXXThrowExpr".enum,
        "Cursor_CXXNewExpr".enum,
        "Cursor_CXXDeleteExpr".enum,
        "Cursor_UnaryExpr".enum,
        "Cursor_ObjCStringLiteral".enum,
        "Cursor_ObjCEncodeExpr".enum,
        "Cursor_ObjCSelectorExpr".enum,
        "Cursor_ObjCProtocolExpr".enum,
        "Cursor_ObjCBridgedCastExpr".enum,
        "Cursor_PackExpansionExpr".enum,
        "Cursor_SizeOfPackExpr".enum,
        "Cursor_LambdaExpr".enum,
        "Cursor_ObjCBoolLiteralExpr".enum,
        "Cursor_ObjCSelfExpr".enum,
        "Cursor_ArraySectionExpr".enum,
        "Cursor_ObjCAvailabilityCheckExpr".enum,
        "Cursor_FixedPointLiteral".enum,
        "Cursor_OMPArrayShapingExpr".enum,
        "Cursor_OMPIteratorExpr".enum,
        "Cursor_CXXAddrspaceCastExpr".enum,
        "Cursor_ConceptSpecializationExpr".enum,
        "Cursor_RequiresExpr".enum,
        "Cursor_CXXParenListInitExpr".enum,
        "Cursor_PackIndexingExpr".enum,
        "Cursor_LastExpr".enum("CXCursor_PackIndexingExpr"),
        "Cursor_FirstStmt".enum("200"),
        "Cursor_UnexposedStmt".enum("200"),
        "Cursor_LabelStmt".enum,
        "Cursor_CompoundStmt".enum,
        "Cursor_CaseStmt".enum,
        "Cursor_DefaultStmt".enum,
        "Cursor_IfStmt".enum,
        "Cursor_SwitchStmt".enum,
        "Cursor_WhileStmt".enum,
        "Cursor_DoStmt".enum,
        "Cursor_ForStmt".enum,
        "Cursor_GotoStmt".enum,
        "Cursor_IndirectGotoStmt".enum,
        "Cursor_ContinueStmt".enum,
        "Cursor_BreakStmt".enum,
        "Cursor_ReturnStmt".enum,
        "Cursor_GCCAsmStmt".enum,
        "Cursor_AsmStmt".enum("CXCursor_GCCAsmStmt"),
        "Cursor_ObjCAtTryStmt".enum("216"),
        "Cursor_ObjCAtCatchStmt".enum,
        "Cursor_ObjCAtFinallyStmt".enum,
        "Cursor_ObjCAtThrowStmt".enum,
        "Cursor_ObjCAtSynchronizedStmt".enum,
        "Cursor_ObjCAutoreleasePoolStmt".enum,
        "Cursor_ObjCForCollectionStmt".enum,
        "Cursor_CXXCatchStmt".enum,
        "Cursor_CXXTryStmt".enum,
        "Cursor_CXXForRangeStmt".enum,
        "Cursor_SEHTryStmt".enum,
        "Cursor_SEHExceptStmt".enum,
        "Cursor_SEHFinallyStmt".enum,
        "Cursor_MSAsmStmt".enum,
        "Cursor_NullStmt".enum,
        "Cursor_DeclStmt".enum,
        "Cursor_OMPParallelDirective".enum,
        "Cursor_OMPSimdDirective".enum,
        "Cursor_OMPForDirective".enum,
        "Cursor_OMPSectionsDirective".enum,
        "Cursor_OMPSectionDirective".enum,
        "Cursor_OMPSingleDirective".enum,
        "Cursor_OMPParallelForDirective".enum,
        "Cursor_OMPParallelSectionsDirective".enum,
        "Cursor_OMPTaskDirective".enum,
        "Cursor_OMPMasterDirective".enum,
        "Cursor_OMPCriticalDirective".enum,
        "Cursor_OMPTaskyieldDirective".enum,
        "Cursor_OMPBarrierDirective".enum,
        "Cursor_OMPTaskwaitDirective".enum,
        "Cursor_OMPFlushDirective".enum,
        "Cursor_SEHLeaveStmt".enum,
        "Cursor_OMPOrderedDirective".enum,
        "Cursor_OMPAtomicDirective".enum,
        "Cursor_OMPForSimdDirective".enum,
        "Cursor_OMPParallelForSimdDirective".enum,
        "Cursor_OMPTargetDirective".enum,
        "Cursor_OMPTeamsDirective".enum,
        "Cursor_OMPTaskgroupDirective".enum,
        "Cursor_OMPCancellationPointDirective".enum,
        "Cursor_OMPCancelDirective".enum,
        "Cursor_OMPTargetDataDirective".enum,
        "Cursor_OMPTaskLoopDirective".enum,
        "Cursor_OMPTaskLoopSimdDirective".enum,
        "Cursor_OMPDistributeDirective".enum,
        "Cursor_OMPTargetEnterDataDirective".enum,
        "Cursor_OMPTargetExitDataDirective".enum,
        "Cursor_OMPTargetParallelDirective".enum,
        "Cursor_OMPTargetParallelForDirective".enum,
        "Cursor_OMPTargetUpdateDirective".enum,
        "Cursor_OMPDistributeParallelForDirective".enum,
        "Cursor_OMPDistributeParallelForSimdDirective".enum,
        "Cursor_OMPDistributeSimdDirective".enum,
        "Cursor_OMPTargetParallelForSimdDirective".enum,
        "Cursor_OMPTargetSimdDirective".enum,
        "Cursor_OMPTeamsDistributeDirective".enum,
        "Cursor_OMPTeamsDistributeSimdDirective".enum,
        "Cursor_OMPTeamsDistributeParallelForSimdDirective".enum,
        "Cursor_OMPTeamsDistributeParallelForDirective".enum,
        "Cursor_OMPTargetTeamsDirective".enum,
        "Cursor_OMPTargetTeamsDistributeDirective".enum,
        "Cursor_OMPTargetTeamsDistributeParallelForDirective".enum,
        "Cursor_OMPTargetTeamsDistributeParallelForSimdDirective".enum,
        "Cursor_OMPTargetTeamsDistributeSimdDirective".enum,
        "Cursor_BuiltinBitCastExpr".enum,
        "Cursor_OMPMasterTaskLoopDirective".enum,
        "Cursor_OMPParallelMasterTaskLoopDirective".enum,
        "Cursor_OMPMasterTaskLoopSimdDirective".enum,
        "Cursor_OMPParallelMasterTaskLoopSimdDirective".enum,
        "Cursor_OMPParallelMasterDirective".enum,
        "Cursor_OMPDepobjDirective".enum,
        "Cursor_OMPScanDirective".enum,
        "Cursor_OMPTileDirective".enum,
        "Cursor_OMPCanonicalLoop".enum,
        "Cursor_OMPInteropDirective".enum,
        "Cursor_OMPDispatchDirective".enum,
        "Cursor_OMPMaskedDirective".enum,
        "Cursor_OMPUnrollDirective".enum,
        "Cursor_OMPMetaDirective".enum,
        "Cursor_OMPGenericLoopDirective".enum,
        "Cursor_OMPTeamsGenericLoopDirective".enum,
        "Cursor_OMPTargetTeamsGenericLoopDirective".enum,
        "Cursor_OMPParallelGenericLoopDirective".enum,
        "Cursor_OMPTargetParallelGenericLoopDirective".enum,
        "Cursor_OMPParallelMaskedDirective".enum,
        "Cursor_OMPMaskedTaskLoopDirective".enum,
        "Cursor_OMPMaskedTaskLoopSimdDirective".enum,
        "Cursor_OMPParallelMaskedTaskLoopDirective".enum,
        "Cursor_OMPParallelMaskedTaskLoopSimdDirective".enum,
        "Cursor_OMPErrorDirective".enum,
        "Cursor_OMPScopeDirective".enum,
        "Cursor_OMPReverseDirective".enum,
        "Cursor_OMPInterchangeDirective".enum,
        "Cursor_OMPAssumeDirective".enum,
        "Cursor_OpenACCComputeConstruct".enum("320"),
        "Cursor_OpenACCLoopConstruct".enum,
        "Cursor_OpenACCCombinedConstruct".enum,
        "Cursor_OpenACCDataConstruct".enum,
        "Cursor_OpenACCEnterDataConstruct".enum,
        "Cursor_OpenACCExitDataConstruct".enum,
        "Cursor_OpenACCHostDataConstruct".enum,
        "Cursor_OpenACCWaitConstruct".enum,
        "Cursor_OpenACCInitConstruct".enum,
        "Cursor_OpenACCShutdownConstruct".enum,
        "Cursor_OpenACCSetConstruct".enum,
        "Cursor_OpenACCUpdateConstruct".enum,
        "Cursor_LastStmt".enum("CXCursor_OpenACCUpdateConstruct"),
        "Cursor_TranslationUnit".enum("350"),
        "Cursor_FirstAttr".enum("400"),
        "Cursor_UnexposedAttr".enum("400"),
        "Cursor_IBActionAttr".enum,
        "Cursor_IBOutletAttr".enum,
        "Cursor_IBOutletCollectionAttr".enum,
        "Cursor_CXXFinalAttr".enum,
        "Cursor_CXXOverrideAttr".enum,
        "Cursor_AnnotateAttr".enum,
        "Cursor_AsmLabelAttr".enum,
        "Cursor_PackedAttr".enum,
        "Cursor_PureAttr".enum,
        "Cursor_ConstAttr".enum,
        "Cursor_NoDuplicateAttr".enum,
        "Cursor_CUDAConstantAttr".enum,
        "Cursor_CUDADeviceAttr".enum,
        "Cursor_CUDAGlobalAttr".enum,
        "Cursor_CUDAHostAttr".enum,
        "Cursor_CUDASharedAttr".enum,
        "Cursor_VisibilityAttr".enum,
        "Cursor_DLLExport".enum,
        "Cursor_DLLImport".enum,
        "Cursor_NSReturnsRetained".enum,
        "Cursor_NSReturnsNotRetained".enum,
        "Cursor_NSReturnsAutoreleased".enum,
        "Cursor_NSConsumesSelf".enum,
        "Cursor_NSConsumed".enum,
        "Cursor_ObjCException".enum,
        "Cursor_ObjCNSObject".enum,
        "Cursor_ObjCIndependentClass".enum,
        "Cursor_ObjCPreciseLifetime".enum,
        "Cursor_ObjCReturnsInnerPointer".enum,
        "Cursor_ObjCRequiresSuper".enum,
        "Cursor_ObjCRootClass".enum,
        "Cursor_ObjCSubclassingRestricted".enum,
        "Cursor_ObjCExplicitProtocolImpl".enum,
        "Cursor_ObjCDesignatedInitializer".enum,
        "Cursor_ObjCRuntimeVisible".enum,
        "Cursor_ObjCBoxable".enum,
        "Cursor_FlagEnum".enum,
        "Cursor_ConvergentAttr".enum,
        "Cursor_WarnUnusedAttr".enum,
        "Cursor_WarnUnusedResultAttr".enum,
        "Cursor_AlignedAttr".enum,
        "Cursor_LastAttr".enum("CXCursor_AlignedAttr"),
        "Cursor_PreprocessingDirective".enum("500"),
        "Cursor_MacroDefinition".enum,
        "Cursor_MacroExpansion".enum,
        "Cursor_MacroInstantiation".enum("CXCursor_MacroExpansion"),
        "Cursor_InclusionDirective".enum("503"),
        "Cursor_FirstPreprocessing".enum("CXCursor_PreprocessingDirective"),
        "Cursor_LastPreprocessing".enum("CXCursor_InclusionDirective"),
        "Cursor_ModuleImportDecl".enum("600"),
        "Cursor_TypeAliasTemplateDecl".enum,
        "Cursor_StaticAssert".enum,
        "Cursor_FriendDecl".enum,
        "Cursor_ConceptDecl".enum,
        "Cursor_FirstExtraDecl".enum("CXCursor_ModuleImportDecl"),
        "Cursor_LastExtraDecl".enum("CXCursor_ConceptDecl"),
        "Cursor_OverloadCandidate".enum("700")
    )

    EnumConstant(
        "Linkage_Invalid".enum("0"),
        "Linkage_NoLinkage".enum,
        "Linkage_Internal".enum,
        "Linkage_UniqueExternal".enum,
        "Linkage_External".enum
    )

    EnumConstant(
        "Visibility_Invalid".enum("0"),
        "Visibility_Hidden".enum,
        "Visibility_Protected".enum,
        "Visibility_Default".enum
    )

    EnumConstant(
        "Language_Invalid".enum("0"),
        "Language_C".enum,
        "Language_ObjC".enum,
        "Language_CPlusPlus".enum
    )

    EnumConstant(
        "TLS_None".enum("0"),
        "TLS_Dynamic".enum,
        "TLS_Static".enum
    )

    EnumConstant(
        "Type_Invalid".enum("0"),
        "Type_Unexposed".enum,
        "Type_Void".enum,
        "Type_Bool".enum,
        "Type_Char_U".enum,
        "Type_UChar".enum,
        "Type_Char16".enum,
        "Type_Char32".enum,
        "Type_UShort".enum,
        "Type_UInt".enum,
        "Type_ULong".enum,
        "Type_ULongLong".enum,
        "Type_UInt128".enum,
        "Type_Char_S".enum,
        "Type_SChar".enum,
        "Type_WChar".enum,
        "Type_Short".enum,
        "Type_Int".enum,
        "Type_Long".enum,
        "Type_LongLong".enum,
        "Type_Int128".enum,
        "Type_Float".enum,
        "Type_Double".enum,
        "Type_LongDouble".enum,
        "Type_NullPtr".enum,
        "Type_Overload".enum,
        "Type_Dependent".enum,
        "Type_ObjCId".enum,
        "Type_ObjCClass".enum,
        "Type_ObjCSel".enum,
        "Type_Float128".enum,
        "Type_Half".enum,
        "Type_Float16".enum,
        "Type_ShortAccum".enum,
        "Type_Accum".enum,
        "Type_LongAccum".enum,
        "Type_UShortAccum".enum,
        "Type_UAccum".enum,
        "Type_ULongAccum".enum,
        "Type_BFloat16".enum,
        "Type_Ibm128".enum,
        "Type_FirstBuiltin".enum("CXType_Void"),
        "Type_LastBuiltin".enum("CXType_Ibm128"),
        "Type_Complex".enum("100"),
        "Type_Pointer".enum,
        "Type_BlockPointer".enum,
        "Type_LValueReference".enum,
        "Type_RValueReference".enum,
        "Type_Record".enum,
        "Type_Enum".enum,
        "Type_Typedef".enum,
        "Type_ObjCInterface".enum,
        "Type_ObjCObjectPointer".enum,
        "Type_FunctionNoProto".enum,
        "Type_FunctionProto".enum,
        "Type_ConstantArray".enum,
        "Type_Vector".enum,
        "Type_IncompleteArray".enum,
        "Type_VariableArray".enum,
        "Type_DependentSizedArray".enum,
        "Type_MemberPointer".enum,
        "Type_Auto".enum,
        "Type_Elaborated".enum,
        "Type_Pipe".enum,
        "Type_OCLImage1dRO".enum,
        "Type_OCLImage1dArrayRO".enum,
        "Type_OCLImage1dBufferRO".enum,
        "Type_OCLImage2dRO".enum,
        "Type_OCLImage2dArrayRO".enum,
        "Type_OCLImage2dDepthRO".enum,
        "Type_OCLImage2dArrayDepthRO".enum,
        "Type_OCLImage2dMSAARO".enum,
        "Type_OCLImage2dArrayMSAARO".enum,
        "Type_OCLImage2dMSAADepthRO".enum,
        "Type_OCLImage2dArrayMSAADepthRO".enum,
        "Type_OCLImage3dRO".enum,
        "Type_OCLImage1dWO".enum,
        "Type_OCLImage1dArrayWO".enum,
        "Type_OCLImage1dBufferWO".enum,
        "Type_OCLImage2dWO".enum,
        "Type_OCLImage2dArrayWO".enum,
        "Type_OCLImage2dDepthWO".enum,
        "Type_OCLImage2dArrayDepthWO".enum,
        "Type_OCLImage2dMSAAWO".enum,
        "Type_OCLImage2dArrayMSAAWO".enum,
        "Type_OCLImage2dMSAADepthWO".enum,
        "Type_OCLImage2dArrayMSAADepthWO".enum,
        "Type_OCLImage3dWO".enum,
        "Type_OCLImage1dRW".enum,
        "Type_OCLImage1dArrayRW".enum,
        "Type_OCLImage1dBufferRW".enum,
        "Type_OCLImage2dRW".enum,
        "Type_OCLImage2dArrayRW".enum,
        "Type_OCLImage2dDepthRW".enum,
        "Type_OCLImage2dArrayDepthRW".enum,
        "Type_OCLImage2dMSAARW".enum,
        "Type_OCLImage2dArrayMSAARW".enum,
        "Type_OCLImage2dMSAADepthRW".enum,
        "Type_OCLImage2dArrayMSAADepthRW".enum,
        "Type_OCLImage3dRW".enum,
        "Type_OCLSampler".enum,
        "Type_OCLEvent".enum,
        "Type_OCLQueue".enum,
        "Type_OCLReserveID".enum,
        "Type_ObjCObject".enum,
        "Type_ObjCTypeParam".enum,
        "Type_Attributed".enum,
        "Type_OCLIntelSubgroupAVCMcePayload".enum,
        "Type_OCLIntelSubgroupAVCImePayload".enum,
        "Type_OCLIntelSubgroupAVCRefPayload".enum,
        "Type_OCLIntelSubgroupAVCSicPayload".enum,
        "Type_OCLIntelSubgroupAVCMceResult".enum,
        "Type_OCLIntelSubgroupAVCImeResult".enum,
        "Type_OCLIntelSubgroupAVCRefResult".enum,
        "Type_OCLIntelSubgroupAVCSicResult".enum,

        "Type_OCLIntelSubgroupAVCImeResultSingleReferenceStreamout".enum("172"),
        "Type_OCLIntelSubgroupAVCImeResultDualReferenceStreamout".enum,
        "Type_OCLIntelSubgroupAVCImeSingleReferenceStreamin".enum,
        "Type_OCLIntelSubgroupAVCImeDualReferenceStreamin".enum,

        /* Old aliases for AVC OpenCL extension types. */
        "Type_OCLIntelSubgroupAVCImeResultSingleRefStreamout".enum("172"),
        "Type_OCLIntelSubgroupAVCImeResultDualRefStreamout".enum,
        "Type_OCLIntelSubgroupAVCImeSingleRefStreamin".enum,
        "Type_OCLIntelSubgroupAVCImeDualRefStreamin".enum,

        "Type_ExtVector".enum,
        "Type_Atomic".enum,
        "Type_BTFTagAttributed".enum,
        "Type_HLSLResource".enum,
        "Type_HLSLAttributedResource".enum
    )

    EnumConstant(
        "CallingConv_Default".enum("0"),
        "CallingConv_C".enum,
        "CallingConv_X86StdCall".enum,
        "CallingConv_X86FastCall".enum,
        "CallingConv_X86ThisCall".enum,
        "CallingConv_X86Pascal".enum,
        "CallingConv_AAPCS".enum,
        "CallingConv_AAPCS_VFP".enum,
        "CallingConv_X86RegCall".enum,
        "CallingConv_IntelOclBicc".enum,
        "CallingConv_Win64".enum,
        "CallingConv_X86_64Win64".enum("CXCallingConv_Win64"),
        "CallingConv_X86_64SysV".enum("11"),
        "CallingConv_X86VectorCall".enum,
        "CallingConv_Swift".enum,
        "CallingConv_PreserveMost".enum,
        "CallingConv_PreserveAll".enum,
        "CallingConv_AArch64VectorCall".enum,
        "CallingConv_SwiftAsync".enum,
        "CallingConv_AArch64SVEPCS".enum,
        "CallingConv_M68kRTD".enum,
        "CallingConv_PreserveNone".enum,
        "CallingConv_RISCVVectorCall".enum,
        "CallingConv_Invalid".enum("100"),
        "CallingConv_Unexposed".enum("200")
    )

    EnumConstant(
        "TemplateArgumentKind_Null".enum("0"),
        "TemplateArgumentKind_Type".enum,
        "TemplateArgumentKind_Declaration".enum,
        "TemplateArgumentKind_NullPtr".enum,
        "TemplateArgumentKind_Integral".enum,
        "TemplateArgumentKind_Template".enum,
        "TemplateArgumentKind_TemplateExpansion".enum,
        "TemplateArgumentKind_Expression".enum,
        "TemplateArgumentKind_Pack".enum,
        "TemplateArgumentKind_Invalid".enum
    )

    EnumConstant(
        "TypeNullability_NonNull".enum("0"),
        "TypeNullability_Nullable".enum,
        "TypeNullability_Unspecified".enum,
        "TypeNullability_Invalid".enum,
        "TypeNullability_NullableResult".enum
    )

    EnumConstant(
        "TypeLayoutError_Invalid".enum("-1"),
        "TypeLayoutError_Incomplete".enum("-2"),
        "TypeLayoutError_Dependent".enum("-3"),
        "TypeLayoutError_NotConstantSize".enum("-4"),
        "TypeLayoutError_InvalidFieldName".enum("-5"),
        "TypeLayoutError_Undeduced".enum("-6")
    )

    EnumConstant(
        "RefQualifier_None".enum("0"),
        "RefQualifier_LValue".enum,
        "RefQualifier_RValue".enum
    )

    EnumConstant(
        "_CXXInvalidAccessSpecifier".enum("0"),
        "_CXXPublic".enum,
        "_CXXProtected".enum,
        "_CXXPrivate".enum
    )

    EnumConstant(
        "_SC_Invalid".enum("0"),
        "_SC_None".enum,
        "_SC_Extern".enum,
        "_SC_Static".enum,
        "_SC_PrivateExtern".enum,
        "_SC_OpenCLWorkGroupLocal".enum,
        "_SC_Auto".enum,
        "_SC_Register".enum
    )

    EnumConstant(
        "_BO_Invalid".enum("0"),
        "_BO_PtrMemD".enum,
        "_BO_PtrMemI".enum,
        "_BO_Mul".enum,
        "_BO_Div".enum,
        "_BO_Rem".enum,
        "_BO_Add".enum,
        "_BO_Sub".enum,
        "_BO_Shl".enum,
        "_BO_Shr".enum,
        "_BO_Cmp".enum,
        "_BO_LT".enum,
        "_BO_GT".enum,
        "_BO_LE".enum,
        "_BO_GE".enum,
        "_BO_EQ".enum,
        "_BO_NE".enum,
        "_BO_And".enum,
        "_BO_Xor".enum,
        "_BO_Or".enum,
        "_BO_LAnd".enum,
        "_BO_LOr".enum,
        "_BO_Assign".enum,
        "_BO_MulAssign".enum,
        "_BO_DivAssign".enum,
        "_BO_RemAssign".enum,
        "_BO_AddAssign".enum,
        "_BO_SubAssign".enum,
        "_BO_ShlAssign".enum,
        "_BO_ShrAssign".enum,
        "_BO_AndAssign".enum,
        "_BO_XorAssign".enum,
        "_BO_OrAssign".enum,
        "_BO_Comma".enum,
        "_BO_LAST".enum("CX_BO_Comma")
    )

    EnumConstant(
        "ChildVisit_Break".enum("0"),
        "ChildVisit_Continue".enum,
        "ChildVisit_Recurse".enum
    )

    EnumConstant(
        "PrintingPolicy_Indentation".enum("0"),
        "PrintingPolicy_SuppressSpecifiers".enum,
        "PrintingPolicy_SuppressTagKeyword".enum,
        "PrintingPolicy_IncludeTagDefinition".enum,
        "PrintingPolicy_SuppressScope".enum,
        "PrintingPolicy_SuppressUnwrittenScope".enum,
        "PrintingPolicy_SuppressInitializers".enum,
        "PrintingPolicy_ConstantArraySizeAsWritten".enum,
        "PrintingPolicy_AnonymousTagLocations".enum,
        "PrintingPolicy_SuppressStrongLifetime".enum,
        "PrintingPolicy_SuppressLifetimeQualifiers".enum,
        "PrintingPolicy_SuppressTemplateArgsInCXXConstructors".enum,
        "PrintingPolicy_Bool".enum,
        "PrintingPolicy_Restrict".enum,
        "PrintingPolicy_Alignof".enum,
        "PrintingPolicy_UnderscoreAlignof".enum,
        "PrintingPolicy_UseVoidForZeroParams".enum,
        "PrintingPolicy_TerseOutput".enum,
        "PrintingPolicy_PolishForDeclaration".enum,
        "PrintingPolicy_Half".enum,
        "PrintingPolicy_MSWChar".enum,
        "PrintingPolicy_IncludeNewlines".enum,
        "PrintingPolicy_MSVCFormatting".enum,
        "PrintingPolicy_ConstantsAsWritten".enum,
        "PrintingPolicy_SuppressImplicitBase".enum,
        "PrintingPolicy_FullyQualifiedName".enum,
        "PrintingPolicy_LastProperty".enum("CXPrintingPolicy_FullyQualifiedName")
    )

    EnumConstant(
        "ObjCPropertyAttr_noattr".enum("0x00"),
        "ObjCPropertyAttr_readonly".enum("0x01"),
        "ObjCPropertyAttr_getter".enum("0x02"),
        "ObjCPropertyAttr_assign".enum("0x04"),
        "ObjCPropertyAttr_readwrite".enum("0x08"),
        "ObjCPropertyAttr_retain".enum("0x10"),
        "ObjCPropertyAttr_copy".enum("0x20"),
        "ObjCPropertyAttr_nonatomic".enum("0x40"),
        "ObjCPropertyAttr_setter".enum("0x80"),
        "ObjCPropertyAttr_atomic".enum("0x100"),
        "ObjCPropertyAttr_weak".enum("0x200"),
        "ObjCPropertyAttr_strong".enum("0x400"),
        "ObjCPropertyAttr_unsafe_unretained".enum("0x800"),
        "ObjCPropertyAttr_class".enum("0x1000")
    )

    EnumConstant(
        "ObjCDeclQualifier_None".enum("0x0"),
        "ObjCDeclQualifier_In".enum("0x1"),
        "ObjCDeclQualifier_Inout".enum("0x2"),
        "ObjCDeclQualifier_Out".enum("0x4"),
        "ObjCDeclQualifier_Bycopy".enum("0x8"),
        "ObjCDeclQualifier_Byref".enum("0x10"),
        "ObjCDeclQualifier_Oneway".enum("0x20")
    )

    EnumConstant(
        "NameRange_WantQualifier".enum("0x1"),
        "NameRange_WantTemplateArgs".enum("0x2"),
        "NameRange_WantSinglePiece".enum("0x4")
    )

    EnumConstant(
        "Token_Punctuation".enum("0"),
        "Token_Keyword".enum,
        "Token_Identifier".enum,
        "Token_Literal".enum,
        "Token_Comment".enum
    )

    EnumConstant(
        "CompletionChunk_Optional".enum("0"),
        "CompletionChunk_TypedText".enum,
        "CompletionChunk_Text".enum,
        "CompletionChunk_Placeholder".enum,
        "CompletionChunk_Informative".enum,
        "CompletionChunk_CurrentParameter".enum,
        "CompletionChunk_LeftParen".enum,
        "CompletionChunk_RightParen".enum,
        "CompletionChunk_LeftBracket".enum,
        "CompletionChunk_RightBracket".enum,
        "CompletionChunk_LeftBrace".enum,
        "CompletionChunk_RightBrace".enum,
        "CompletionChunk_LeftAngle".enum,
        "CompletionChunk_RightAngle".enum,
        "CompletionChunk_Comma".enum,
        "CompletionChunk_ResultType".enum,
        "CompletionChunk_Colon".enum,
        "CompletionChunk_SemiColon".enum,
        "CompletionChunk_Equal".enum,
        "CompletionChunk_HorizontalSpace".enum,
        "CompletionChunk_VerticalSpace".enum
    )

    EnumConstant(
        "CodeComplete_IncludeMacros".enum("0x01"),
        "CodeComplete_IncludeCodePatterns".enum("0x02"),
        "CodeComplete_IncludeBriefComments".enum("0x04"),
        "CodeComplete_SkipPreamble".enum("0x08"),
        "CodeComplete_IncludeCompletionsWithFixIts".enum("0x10")
    )

    EnumConstant(
        "CompletionContext_Unexposed".enum("0"),
        "CompletionContext_AnyType".enum("1 << 0"),
        "CompletionContext_AnyValue".enum("1 << 1"),
        "CompletionContext_ObjCObjectValue".enum("1 << 2"),
        "CompletionContext_ObjCSelectorValue".enum("1 << 3"),
        "CompletionContext_CXXClassTypeValue".enum("1 << 4"),
        "CompletionContext_DotMemberAccess".enum("1 << 5"),
        "CompletionContext_ArrowMemberAccess".enum("1 << 6"),
        "CompletionContext_ObjCPropertyAccess".enum("1 << 7"),
        "CompletionContext_EnumTag".enum("1 << 8"),
        "CompletionContext_UnionTag".enum("1 << 9"),
        "CompletionContext_StructTag".enum("1 << 10"),
        "CompletionContext_ClassTag".enum("1 << 11"),
        "CompletionContext_Namespace".enum("1 << 12"),
        "CompletionContext_NestedNameSpecifier".enum("1 << 13"),
        "CompletionContext_ObjCInterface".enum("1 << 14"),
        "CompletionContext_ObjCProtocol".enum("1 << 15"),
        "CompletionContext_ObjCCategory".enum("1 << 16"),
        "CompletionContext_ObjCInstanceMessage".enum("1 << 17"),
        "CompletionContext_ObjCClassMessage".enum("1 << 18"),
        "CompletionContext_ObjCSelectorName".enum("1 << 19"),
        "CompletionContext_MacroName".enum("1 << 20"),
        "CompletionContext_NaturalLanguage".enum("1 << 21"),
        "CompletionContext_IncludedFile".enum("1 << 22"),
        "CompletionContext_Unknown".enum("((1 << 23) - 1)")
    )

    EnumConstant(
        "Eval_Int".enum("1"),
        "Eval_Float".enum,
        "Eval_ObjCStrLiteral".enum,
        "Eval_StrLiteral".enum,
        "Eval_CFStr".enum,
        "Eval_Other".enum,
        "Eval_UnExposed".enum("0")
    )

    EnumConstant(
        "Visit_Break".enum("0"),
        "Visit_Continue".enum
    )

    EnumConstant(
        "Result_Success".enum("0"),
        "Result_Invalid".enum,
        "Result_VisitBreak".enum
    )

    EnumConstant(
        "IdxEntity_Unexposed".enum("0"),
        "IdxEntity_Typedef".enum,
        "IdxEntity_Function".enum,
        "IdxEntity_Variable".enum,
        "IdxEntity_Field".enum,
        "IdxEntity_EnumConstant".enum,
        "IdxEntity_ObjCClass".enum,
        "IdxEntity_ObjCProtocol".enum,
        "IdxEntity_ObjCCategory".enum,
        "IdxEntity_ObjCInstanceMethod".enum,
        "IdxEntity_ObjCClassMethod".enum,
        "IdxEntity_ObjCProperty".enum,
        "IdxEntity_ObjCIvar".enum,
        "IdxEntity_Enum".enum,
        "IdxEntity_Struct".enum,
        "IdxEntity_Union".enum,
        "IdxEntity_CXXClass".enum,
        "IdxEntity_CXXNamespace".enum,
        "IdxEntity_CXXNamespaceAlias".enum,
        "IdxEntity_CXXStaticVariable".enum,
        "IdxEntity_CXXStaticMethod".enum,
        "IdxEntity_CXXInstanceMethod".enum,
        "IdxEntity_CXXConstructor".enum,
        "IdxEntity_CXXDestructor".enum,
        "IdxEntity_CXXConversionFunction".enum,
        "IdxEntity_CXXTypeAlias".enum,
        "IdxEntity_CXXInterface".enum,
        "IdxEntity_CXXConcept".enum
    )

    EnumConstant(
        "IdxEntityLang_None".enum("0"),
        "IdxEntityLang_C".enum,
        "IdxEntityLang_ObjC".enum,
        "IdxEntityLang_CXX".enum,
        "IdxEntityLang_Swift".enum
    )

    EnumConstant(
        "IdxEntity_NonTemplate".enum("0"),
        "IdxEntity_Template".enum,
        "IdxEntity_TemplatePartialSpecialization".enum,
        "IdxEntity_TemplateSpecialization".enum
    )

    EnumConstant(
        "IdxAttr_Unexposed".enum("0"),
        "IdxAttr_IBAction".enum,
        "IdxAttr_IBOutlet".enum,
        "IdxAttr_IBOutletCollection".enum
    )

    EnumConstant(
        "IdxDeclFlag_Skipped".enum("0x1")
    )

    EnumConstant(
        "IdxObjCContainer_ForwardRef".enum("0"),
        "IdxObjCContainer_Interface".enum,
        "IdxObjCContainer_Implementation".enum
    )

    EnumConstant(
        "IdxEntityRef_Direct".enum("1"),
        "IdxEntityRef_Implicit".enum
    )

    EnumConstant(
        "SymbolRole_None".enum("0"),
        "SymbolRole_Declaration".enum("1 << 0"),
        "SymbolRole_Definition".enum("1 << 1"),
        "SymbolRole_Reference".enum("1 << 2"),
        "SymbolRole_Read".enum("1 << 3"),
        "SymbolRole_Write".enum("1 << 4"),
        "SymbolRole_Call".enum("1 << 5"),
        "SymbolRole_Dynamic".enum("1 << 6"),
        "SymbolRole_AddressOf".enum("1 << 7"),
        "SymbolRole_Implicit".enum("1 << 8")
    )

    EnumConstant(
        "IndexOpt_None".enum("0x0"),
        "IndexOpt_SuppressRedundantRefs".enum("0x1"),
        "IndexOpt_IndexFunctionLocalSymbols".enum("0x2"),
        "IndexOpt_IndexImplicitTemplateInstantiations".enum("0x4"),
        "IndexOpt_SuppressWarnings".enum("0x8"),
        "IndexOpt_SkipParsedBodiesInSession".enum("0x10")
    )

    EnumConstant(
        "BinaryOperator_Invalid".enum("0"),
        "BinaryOperator_PtrMemD".enum,
        "BinaryOperator_PtrMemI".enum,
        "BinaryOperator_Mul".enum,
        "BinaryOperator_Div".enum,
        "BinaryOperator_Rem".enum,
        "BinaryOperator_Add".enum,
        "BinaryOperator_Sub".enum,
        "BinaryOperator_Shl".enum,
        "BinaryOperator_Shr".enum,
        "BinaryOperator_Cmp".enum,
        "BinaryOperator_LT".enum,
        "BinaryOperator_GT".enum,
        "BinaryOperator_LE".enum,
        "BinaryOperator_GE".enum,
        "BinaryOperator_EQ".enum,
        "BinaryOperator_NE".enum,
        "BinaryOperator_And".enum,
        "BinaryOperator_Xor".enum,
        "BinaryOperator_Or".enum,
        "BinaryOperator_LAnd".enum,
        "BinaryOperator_LOr".enum,
        "BinaryOperator_Assign".enum,
        "BinaryOperator_MulAssign".enum,
        "BinaryOperator_DivAssign".enum,
        "BinaryOperator_RemAssign".enum,
        "BinaryOperator_AddAssign".enum,
        "BinaryOperator_SubAssign".enum,
        "BinaryOperator_ShlAssign".enum,
        "BinaryOperator_ShrAssign".enum,
        "BinaryOperator_AndAssign".enum,
        "BinaryOperator_XorAssign".enum,
        "BinaryOperator_OrAssign".enum,
        "BinaryOperator_Comma".enum
    )

    EnumConstant(
        "UnaryOperator_Invalid".enum("0"),
        "UnaryOperator_PostInc".enum,
        "UnaryOperator_PostDec".enum,
        "UnaryOperator_PreInc".enum,
        "UnaryOperator_PreDec".enum,
        "UnaryOperator_AddrOf".enum,
        "UnaryOperator_Deref".enum,
        "UnaryOperator_Plus".enum,
        "UnaryOperator_Minus".enum,
        "UnaryOperator_Not".enum,
        "UnaryOperator_LNot".enum,
        "UnaryOperator_Real".enum,
        "UnaryOperator_Imag".enum,
        "UnaryOperator_Extension".enum,
        "UnaryOperator_Coawait".enum
    )

    charUTF8.const.p(
        "getCString",

        CXString("string")
    )

    void(
        "disposeString",

        CXString("string")
    )

    void(
        "disposeStringSet",

        Input..CXStringSet.p("set")
    )

    CXIndex(
        "createIndex",

        intb("excludeDeclarationsFromPCH"),
        intb("displayDiagnostics")
    )

    void(
        "disposeIndex",

        CXIndex("index")
    )

    IgnoreMissing..CXIndex(
        "createIndexWithOptions",

        CXIndexOptions.const.p("options")
    )

    void(
        "CXIndex_setGlobalOptions",

        CXIndex("index"),
        unsigned("options")
    )

    unsigned(
        "CXIndex_getGlobalOptions",

        CXIndex("index")
    )

    IgnoreMissing..void(
        "CXIndex_setInvocationEmissionPathOption",

        CXIndex("index"),
        nullable..charUTF8.const.p("Path")
    )

    CXString(
        "getFileName",

        CXFile("SFile")
    )

    time_t(
        "getFileTime",

        CXFile("SFile")
    )

    int(
        "getFileUniqueID",

        CXFile("file"),
        CXFileUniqueID.p("outID")
    )

    unsignedb(
        "isFileMultipleIncludeGuarded",

        CXTranslationUnit("tu"),
        CXFile("file")
    )

    CXFile(
        "getFile",

        CXTranslationUnit("tu"),
        charUTF8.const.p("file_name")
    )

    IgnoreMissing..char.const.p(
        "getFileContents",

        CXTranslationUnit("tu"),
        CXFile("file"),
        AutoSizeResult..size_t.p("size")
    )

    intb(
        "File_isEqual",

        nullable..CXFile("file1"),
        nullable..CXFile("file2")
    )

    IgnoreMissing..CXString(
        "File_tryGetRealPathName",

        CXFile("file")
    )

    CXSourceLocation("getNullLocation", void())

    unsignedb(
        "equalLocations",

        CXSourceLocation("loc1"),
        CXSourceLocation("loc2")
    )

    IgnoreMissing..unsignedb(
        "isBeforeInTranslationUnit",

        CXSourceLocation("loc1"),
        CXSourceLocation("loc2")
    )

    CXSourceLocation(
        "getLocation",

        CXTranslationUnit("tu"),
        CXFile("file"),
        unsigned("line"),
        unsigned("column")
    )

    CXSourceLocation(
        "getLocationForOffset",

        CXTranslationUnit("tu"),
        CXFile("file"),
        unsigned("offset")
    )

    intb(
        "Location_isInSystemHeader",

        CXSourceLocation("location")
    )

    intb(
        "Location_isFromMainFile",

        CXSourceLocation("location")
    )

    CXSourceRange("getNullRange", void())

    CXSourceRange(
        "getRange",

        CXSourceLocation("begin"),
        CXSourceLocation("end")
    )

    unsignedb(
        "equalRanges",

        CXSourceRange("range1"),
        CXSourceRange("range2")
    )

    intb(
        "Range_isNull",

        CXSourceRange("range")
    )

    void(
        "getExpansionLocation",

        CXSourceLocation("location"),
        Check(1)..nullable..CXFile.p("file"),
        Check(1)..nullable..unsigned.p("line"),
        Check(1)..nullable..unsigned.p("column"),
        Check(1)..nullable..unsigned.p("offset")
    )

    void(
        "getPresumedLocation",

        CXSourceLocation("location"),
        Check(1)..nullable..CXString.p("filename"),
        Check(1)..nullable..unsigned.p("line"),
        Check(1)..nullable..unsigned.p("column")
    )

    /*void(
        "getInstantiationLocation",

        CXSourceLocation("location"),
        CXFile.p("file"),
        unsigned.p("line"),
        unsigned.p("column"),
        unsigned.p("offset")
    )*/

    void(
        "getSpellingLocation",

        CXSourceLocation("location"),
        Check(1)..nullable..CXFile.p("file"),
        Check(1)..nullable..unsigned.p("line"),
        Check(1)..nullable..unsigned.p("column"),
        Check(1)..nullable..unsigned.p("offset")
    )

    void(
        "getFileLocation",

        CXSourceLocation("location"),
        Check(1)..nullable..CXFile.p("file"),
        Check(1)..nullable..unsigned.p("line"),
        Check(1)..nullable..unsigned.p("column"),
        Check(1)..nullable..unsigned.p("offset")
    )

    CXSourceLocation(
        "getRangeStart",

        CXSourceRange("range")
    )

    CXSourceLocation(
        "getRangeEnd",

        CXSourceRange("range")
    )

    CXSourceRangeList.p(
        "getSkippedRanges",

        CXTranslationUnit("tu"),
        CXFile("file")
    )

    CXSourceRangeList.p(
        "getAllSkippedRanges",

        CXTranslationUnit("tu")
    )

    void(
        "disposeSourceRangeList",

        Input..CXSourceRangeList.p("ranges")
    )

    unsigned(
        "getNumDiagnosticsInSet",

        CXDiagnosticSet("Diags")
    )

    CXDiagnostic(
        "getDiagnosticInSet",

        CXDiagnosticSet("Diags"),
        unsigned("Index")
    )

    CXDiagnosticSet(
        "loadDiagnostics",

        charUTF8.const.p("file"),
        Check(1)..CXLoadDiag_Error.p("error"),
        CXString.p("errorString")
    )

    void(
        "disposeDiagnosticSet",

        CXDiagnosticSet("Diags")
    )

    CXDiagnosticSet(
        "getChildDiagnostics",

        CXDiagnostic("D")
    )

    unsigned(
        "getNumDiagnostics",

        CXTranslationUnit("Unit")
    )

    CXDiagnostic(
        "getDiagnostic",

        CXTranslationUnit("Unit"),
        unsigned("Index")
    )

    CXDiagnosticSet(
        "getDiagnosticSetFromTU",

        CXTranslationUnit("Unit")
    )

    void(
        "disposeDiagnostic",

        CXDiagnostic("Diagnostic")
    )

    CXString(
        "formatDiagnostic",

        CXDiagnostic("Diagnostic"),
        unsigned("Options")
    )

    unsigned(
        "defaultDiagnosticDisplayOptions",
        void()
    )

    CXDiagnosticSeverity(
        "getDiagnosticSeverity",

        CXDiagnostic("Diagnostic")
    )

    CXSourceLocation(
        "getDiagnosticLocation",

        CXDiagnostic("Diagnostic")
    )

    CXString(
        "getDiagnosticSpelling",

        CXDiagnostic("Diagnostic")
    )

    CXString(
        "getDiagnosticOption",

        CXDiagnostic("Diag"),
        nullable..CXString.p("Disable")
    )

    unsigned(
        "getDiagnosticCategory",

        CXDiagnostic("Diagnostic")
    )

    /*CXString(
        "getDiagnosticCategoryName",

        unsigned("Category")
    )*/

    CXString(
        "getDiagnosticCategoryText",

        CXDiagnostic("Diagnostic")
    )

    unsigned(
        "getDiagnosticNumRanges",

        CXDiagnostic("Diagnostic")
    )

    CXSourceRange(
        "getDiagnosticRange",

        CXDiagnostic("Diagnostic"),
        unsigned("Range")
    )

    unsigned(
        "getDiagnosticNumFixIts",

        CXDiagnostic("Diagnostic")
    )

    CXString(
        "getDiagnosticFixIt",

        CXDiagnostic("Diagnostic"),
        unsigned("FixIt"),
        CXSourceRange.p("ReplacementRange")
    )

    CXString(
        "getTranslationUnitSpelling",

        CXTranslationUnit("CTUnit")
    )

    CXTranslationUnit(
        "createTranslationUnitFromSourceFile",

        CXIndex("CIdx"),
        nullable..charUTF8.const.p("source_filename"),
        AutoSize("clang_command_line_args")..int("num_clang_command_line_args"),
        nullable..charUTF8.const.p.const.p("clang_command_line_args"),
        AutoSize("unsaved_files")..unsigned("num_unsaved_files"),
        Input..nullable..CXUnsavedFile.p("unsaved_files")
    )

    CXTranslationUnit(
        "createTranslationUnit",

        CXIndex("CIdx"),
        charUTF8.const.p("ast_filename")
    )

    CXErrorCode(
        "createTranslationUnit2",

        CXIndex("CIdx"),
        charUTF8.const.p("ast_filename"),
        Check(1)..CXTranslationUnit.p("out_TU")
    )

    unsigned(
        "defaultEditingTranslationUnitOptions",
        void()
    )

    CXTranslationUnit(
        "parseTranslationUnit",

        CXIndex("CIdx"),
        nullable..charUTF8.const.p("source_filename"),
        nullable..charUTF8.const.p.const.p("command_line_args"),
        AutoSize("command_line_args")..int("num_command_line_args"),
        Input..nullable..CXUnsavedFile.p("unsaved_files"),
        AutoSize("unsaved_files")..unsigned("num_unsaved_files"),
        unsigned("options")
    )

    CXErrorCode(
        "parseTranslationUnit2",

        CXIndex("CIdx"),
        nullable..charUTF8.const.p("source_filename"),
        nullable..charUTF8.const.p.const.p("command_line_args"),
        AutoSize("command_line_args")..int("num_command_line_args"),
        Input..nullable..CXUnsavedFile.p("unsaved_files"),
        AutoSize("unsaved_files")..unsigned("num_unsaved_files"),
        unsigned("options"),
        Check(1)..CXTranslationUnit.p("out_TU")
    )

    CXErrorCode(
        "parseTranslationUnit2FullArgv",

        CXIndex("CIdx"),
        nullable..charUTF8.const.p("source_filename"),
        charUTF8.const.p.const.p("command_line_args"),
        AutoSize("command_line_args")..int("num_command_line_args"),
        nullable..CXUnsavedFile.p("unsaved_files"),
        AutoSize("unsaved_files")..unsigned("num_unsaved_files"),
        unsigned("options"),
        Check(1)..CXTranslationUnit.p("out_TU")
    )

    unsigned(
        "defaultSaveOptions",

        CXTranslationUnit("TU")
    )

    int(
        "saveTranslationUnit",

        CXTranslationUnit("TU"),
        charUTF8.const.p("FileName"),
        unsigned("options")
    )

    unsignedb(
        "suspendTranslationUnit",

        CXTranslationUnit("TU")
    )

    void(
        "disposeTranslationUnit",

        CXTranslationUnit("TU")
    )

    unsigned(
        "defaultReparseOptions",

        CXTranslationUnit("TU")
    )

    int(
        "reparseTranslationUnit",

        CXTranslationUnit("TU"),
        AutoSize("unsaved_files")..unsigned("num_unsaved_files"),
        Input..nullable..CXUnsavedFile.p("unsaved_files"),
        unsigned("options")
    )

    charUTF8.const.p(
        "getTUResourceUsageName",

        CXTUResourceUsageKind("kind")
    )

    CXTUResourceUsage(
        "getCXTUResourceUsage",

        CXTranslationUnit("TU")
    )

    void(
        "disposeCXTUResourceUsage",

        CXTUResourceUsage("usage")
    )

    CXTargetInfo(
        "getTranslationUnitTargetInfo",

        CXTranslationUnit("CTUnit")
    )

    void(
        "TargetInfo_dispose",

        CXTargetInfo("Info")
    )

    CXString(
        "TargetInfo_getTriple",

        CXTargetInfo("Info")
    )

    int(
        "TargetInfo_getPointerWidth",

        CXTargetInfo("Info")
    )

    CXCursor("getNullCursor", void())

    CXCursor(
        "getTranslationUnitCursor",

        CXTranslationUnit("TU")
    )

    unsignedb(
        "equalCursors",

        CXCursor("A"),
        CXCursor("B")
    )

    intb(
        "Cursor_isNull",

        CXCursor("cursor")
    )

    unsigned(
        "hashCursor",

        CXCursor("cursor")
    )

    CXCursorKind(
        "getCursorKind",

        CXCursor("cursor")
    )

    unsignedb(
        "isDeclaration",

        CXCursorKind("kind")
    )

    IgnoreMissing..unsignedb(
        "isInvalidDeclaration",

        CXCursor("cursor")
    )

    unsignedb(
        "isReference",

        CXCursorKind("kind")
    )

    unsignedb(
        "isExpression",

        CXCursorKind("kind")
    )

    unsignedb(
        "isStatement",

        CXCursorKind("kind")
    )

    unsignedb(
        "isAttribute",

        CXCursorKind("kind")
    )

    unsignedb(
        "Cursor_hasAttrs",

        CXCursor("C")
    )

    unsignedb(
        "isInvalid",

        CXCursorKind("kind")
    )

    unsignedb(
        "isTranslationUnit",

        CXCursorKind("kind")
    )

    unsignedb(
        "isPreprocessing",

        CXCursorKind("kind")
    )

    unsignedb(
        "isUnexposed",

        CXCursorKind("kind")
    )

    CXLinkageKind(
        "getCursorLinkage",

        CXCursor("cursor")
    )

    CXVisibilityKind(
        "getCursorVisibility",

        CXCursor("cursor")
    )

    CXAvailabilityKind(
        "getCursorAvailability",

        CXCursor("cursor")
    )

    int(
        "getCursorPlatformAvailability",

        CXCursor("cursor"),
        Check(1)..nullable..int.p("always_deprecated"),
        nullable..CXString.p("deprecated_message"),
        Check(1)..nullable..int.p("always_unavailable"),
        nullable..CXString.p("unavailable_message"),
        Check(1)..nullable..CXPlatformAvailability.p("availability"),
        AutoSize("availability")..int("availability_size")
    )

    void(
        "disposeCXPlatformAvailability",

        CXPlatformAvailability.p("availability")
    )

    IgnoreMissing..CXCursor(
        "Cursor_getVarDeclInitializer",

        CXCursor("cursor")
    )

    IgnoreMissing..int(
        "Cursor_hasVarDeclGlobalStorage",

        CXCursor("cursor")
    )

    IgnoreMissing..int(
        "Cursor_hasVarDeclExternalStorage",

        CXCursor("cursor")
    )

    CXLanguageKind(
        "getCursorLanguage",

        CXCursor("cursor")
    )

    IgnoreMissing..CXTLSKind(
        "getCursorTLSKind",

        CXCursor("cursor")
    )

    CXTranslationUnit(
        "Cursor_getTranslationUnit",

        CXCursor("cursor")
    )

    CXCursorSet("createCXCursorSet", void())

    void(
        "disposeCXCursorSet",

        CXCursorSet("cset")
    )

    unsignedb(
        "CXCursorSet_contains",

        CXCursorSet("cset"),
        CXCursor("cursor")
    )

    unsignedb(
        "CXCursorSet_insert",

        CXCursorSet("cset"),
        CXCursor("cursor")
    )

    CXCursor(
        "getCursorSemanticParent",

        CXCursor("cursor")
    )

    CXCursor(
        "getCursorLexicalParent",

        CXCursor("cursor")
    )

    void(
        "getOverriddenCursors",

        CXCursor("cursor"),
        Check(1)..CXCursor.p.p("overridden"),
        Check(1)..unsigned.p("num_overridden")
    )

    void(
        "disposeOverriddenCursors",

        Unsafe..CXCursor.p("overridden")
    )

    CXFile(
        "getIncludedFile",

        CXCursor("cursor")
    )

    CXCursor(
        "getCursor",

        CXTranslationUnit("TU"),
        CXSourceLocation("location")
    )

    CXSourceLocation(
        "getCursorLocation",

        CXCursor("cursor")
    )

    CXSourceRange(
        "getCursorExtent",

        CXCursor("cursor")
    )

    CXType(
        "getCursorType",

        CXCursor("C")
    )

    CXString(
        "getTypeSpelling",

        CXType("CT")
    )

    CXType(
        "getTypedefDeclUnderlyingType",

        CXCursor("C")
    )

    CXType(
        "getEnumDeclIntegerType",

        CXCursor("C")
    )

    long_long(
        "getEnumConstantDeclValue",

        CXCursor("C")
    )

    unsigned_long_long(
        "getEnumConstantDeclUnsignedValue",

        CXCursor("C")
    )

    unsignedb(
        "Cursor_isBitField",

        CXCursor("C")
    )

    int(
        "getFieldDeclBitWidth",

        CXCursor("C")
    )

    int(
        "Cursor_getNumArguments",

        CXCursor("C")
    )

    CXCursor(
        "Cursor_getArgument",

        CXCursor("C"),
        unsigned("i")
    )

    int(
        "Cursor_getNumTemplateArguments",

        CXCursor("C")
    )

    CXTemplateArgumentKind(
        "Cursor_getTemplateArgumentKind",

        CXCursor("C"),
        unsigned("I")
    )

    CXType(
        "Cursor_getTemplateArgumentType",

        CXCursor("C"),
        unsigned("I")
    )

    long_long(
        "Cursor_getTemplateArgumentValue",

        CXCursor("C"),
        unsigned("I")
    )

    unsigned_long_long(
        "Cursor_getTemplateArgumentUnsignedValue",

        CXCursor("C"),
        unsigned("I")
    )

    unsignedb(
        "equalTypes",

        CXType("A"),
        CXType("B")
    )

    CXType(
        "getCanonicalType",

        CXType("T")
    )

    unsignedb(
        "isConstQualifiedType",

        CXType("T")
    )

    unsignedb(
        "Cursor_isMacroFunctionLike",

        CXCursor("C")
    )

    unsignedb(
        "Cursor_isMacroBuiltin",

        CXCursor("C")
    )

    unsignedb(
        "Cursor_isFunctionInlined",

        CXCursor("C")
    )

    unsignedb(
        "isVolatileQualifiedType",

        CXType("T")
    )

    unsignedb(
        "isRestrictQualifiedType",

        CXType("T")
    )

    unsigned(
        "getAddressSpace",

        CXType("T")
    )

    CXString(
        "getTypedefName",

        CXType("CT")
    )

    CXType(
        "getPointeeType",

        CXType("T")
    )

    IgnoreMissing..CXType(
        "getUnqualifiedType",

        CXType("CT")
    )

    IgnoreMissing..CXType(
        "getNonReferenceType",

        CXType("CT")
    )

    CXCursor(
        "getTypeDeclaration",

        CXType("T")
    )

    CXString(
        "getDeclObjCTypeEncoding",

        CXCursor("C")
    )

    CXString(
        "Type_getObjCEncoding",

        CXType("type")
    )

    CXString(
        "getTypeKindSpelling",

        CXTypeKind("K")
    )

    CXCallingConv(
        "getFunctionTypeCallingConv",

        CXType("T")
    )

    CXType(
        "getResultType",

        CXType("T")
    )

    int(
        "getExceptionSpecificationType",

        CXType("T")
    )

    int(
        "getNumArgTypes",

        CXType("T")
    )

    CXType(
        "getArgType",

        CXType("T"),
        unsigned("i")
    )

    IgnoreMissing..CXType(
        "Type_getObjCObjectBaseType",

        CXType("T")
    )

    IgnoreMissing..unsigned(
        "Type_getNumObjCProtocolRefs",

        CXType("T")
    )

    IgnoreMissing..CXCursor(
        "Type_getObjCProtocolDecl",

        CXType("T"),
        unsigned("i")
    )

    IgnoreMissing..unsigned(
        "Type_getNumObjCTypeArgs",

        CXType("T")
    )

    IgnoreMissing..CXType(
        "Type_getObjCTypeArg",

        CXType("T"),
        unsigned("i")
    )

    unsignedb(
        "isFunctionTypeVariadic",

        CXType("T")
    )

    CXType(
        "getCursorResultType",

        CXCursor("C")
    )

    int(
        "getCursorExceptionSpecificationType",

        CXCursor("C")
    )

    unsignedb(
        "isPODType",

        CXType("T")
    )

    CXType(
        "getElementType",

        CXType("T")
    )

    long_long(
        "getNumElements",

        CXType("T")
    )

    CXType(
        "getArrayElementType",

        CXType("T")
    )

    long_long(
        "getArraySize",

        CXType("T")
    )

    CXType(
        "Type_getNamedType",

        CXType("T")
    )

    unsignedb(
        "Type_isTransparentTagTypedef",

        CXType("T")
    )

    IgnoreMissing..CXTypeNullabilityKind(
        "Type_getNullability",

        CXType("T")
    )

    long_long(
        "Type_getAlignOf",

        CXType("T")
    )

    CXType(
        "Type_getClassType",

        CXType("T")
    )

    long_long(
        "Type_getSizeOf",

        CXType("T")
    )

    long_long(
        "Type_getOffsetOf",

        CXType("T"),
        charUTF8.const.p("S")
    )

    IgnoreMissing..CXType(
        "Type_getModifiedType",

        CXType("T")
    )

    IgnoreMissing..CXType(
        "Type_getValueType",

        CXType("CT")
    )

    long_long(
        "Cursor_getOffsetOfField",

        CXCursor("C")
    )

    unsignedb(
        "Cursor_isAnonymous",

        CXCursor("C")
    )

    IgnoreMissing..unsignedb(
        "Cursor_isAnonymousRecordDecl",

        CXCursor("C")
    )

    IgnoreMissing..unsignedb(
        "Cursor_isInlineNamespace",

        CXCursor("C")
    )

    int(
        "Type_getNumTemplateArguments",

        CXType("T")
    )

    CXType(
        "Type_getTemplateArgumentAsType",

        CXType("T"),
        unsigned("i")
    )

    CXRefQualifierKind(
        "Type_getCXXRefQualifier",

        CXType("T")
    )

    unsignedb(
        "isVirtualBase",

        CXCursor("cursor")
    )

    IgnoreMissing..long_long(
        "getOffsetOfBase",

        CXCursor("Parent"),
        CXCursor("Base")
    )

    CX_CXXAccessSpecifier(
        "getCXXAccessSpecifier",

        CXCursor("cursor")
    )

    IgnoreMissing..CX_BinaryOperatorKind(
        "Cursor_getBinaryOpcode",

        CXCursor("cursor")
    )

    IgnoreMissing..CXString(
        "Cursor_getBinaryOpcodeStr",

        CX_BinaryOperatorKind("Op")
    )

    CX_StorageClass(
        "Cursor_getStorageClass",

        CXCursor("cursor")
    )

    unsigned(
        "getNumOverloadedDecls",

        CXCursor("cursor")
    )

    CXCursor(
        "getOverloadedDecl",

        CXCursor("cursor"),
        unsigned("index")
    )

    CXType(
        "getIBOutletCollectionType",

        CXCursor("cursor")
    )

    unsignedb(
        "visitChildren",

        CXCursor("parent"),
        CXCursorVisitor("visitor"),
        nullable..CXClientData("client_data")
    )

    CXString(
        "getCursorUSR",

        CXCursor("cursor")
    )

    CXString(
        "constructUSR_ObjCClass",

        charUTF8.const.p("class_name")
    )

    CXString(
        "constructUSR_ObjCCategory",

        charUTF8.const.p("class_name"),
        charUTF8.const.p("category_name")
    )

    CXString(
        "constructUSR_ObjCProtocol",

        charUTF8.const.p("protocol_name")
    )

    CXString(
        "constructUSR_ObjCIvar",

        charUTF8.const.p("name"),
        CXString("classUSR")
    )

    CXString(
        "constructUSR_ObjCMethod",

        charUTF8.const.p("name"),
        unsignedb("isInstanceMethod"),
        CXString("classUSR")
    )

    CXString(
        "constructUSR_ObjCProperty",

        charUTF8.const.p("property"),
        CXString("classUSR")
    )

    CXString(
        "getCursorSpelling",

        CXCursor("cursor")
    )

    CXSourceRange(
        "Cursor_getSpellingNameRange",

        CXCursor("cursor"),
        unsigned("pieceIndex"),
        unsigned("options")
    )

    IgnoreMissing..unsigned(
        "PrintingPolicy_getProperty",

        CXPrintingPolicy("Policy"),
        CXPrintingPolicyProperty("Property")
    )

    IgnoreMissing..void(
        "PrintingPolicy_setProperty",

        CXPrintingPolicy("Policy"),
        CXPrintingPolicyProperty("Property"),
        unsigned("Value")
    )

    IgnoreMissing..CXPrintingPolicy(
        "getCursorPrintingPolicy",

        CXCursor("cursor")
    )

    IgnoreMissing..void(
        "PrintingPolicy_dispose",

        CXPrintingPolicy("Policy")
    )

    IgnoreMissing..CXString(
        "getCursorPrettyPrinted",

        CXCursor("Cursor"),
        CXPrintingPolicy("Policy")
    )

    IgnoreMissing..CXString(
        "getTypePrettyPrinted",

        CXType("CT"),
        CXPrintingPolicy("cxPolicy")
    )

    CXString(
        "getCursorDisplayName",

        CXCursor("cursor")
    )

    CXCursor(
        "getCursorReferenced",

        CXCursor("cursor")
    )

    CXCursor(
        "getCursorDefinition",

        CXCursor("cursor")
    )

    unsignedb(
        "isCursorDefinition",

        CXCursor("cursor")
    )

    CXCursor(
        "getCanonicalCursor",

        CXCursor("cursor")
    )

    int(
        "Cursor_getObjCSelectorIndex",

        CXCursor("cursor")
    )

    intb(
        "Cursor_isDynamicCall",

        CXCursor("C")
    )

    CXType(
        "Cursor_getReceiverType",

        CXCursor("C")
    )

    unsigned(
        "Cursor_getObjCPropertyAttributes",

        CXCursor("C"),
        unsigned("reserved")
    )

    IgnoreMissing..CXString(
        "Cursor_getObjCPropertyGetterName",

        CXCursor("C")
    )

    IgnoreMissing..CXString(
        "Cursor_getObjCPropertySetterName",

        CXCursor("C")
    )

    unsigned(
        "Cursor_getObjCDeclQualifiers",

        CXCursor("C")
    )

    unsignedb(
        "Cursor_isObjCOptional",

        CXCursor("C")
    )

    unsignedb(
        "Cursor_isVariadic",

        CXCursor("C")
    )

    unsignedb(
        "Cursor_isExternalSymbol",

        CXCursor("C"),
        Check(1)..nullable..CXString.p("language"),
        Check(1)..nullable..CXString.p("definedIn"),
        Check(1)..nullable..unsigned.p("isGenerated")
    )

    CXSourceRange(
        "Cursor_getCommentRange",

        CXCursor("C")
    )

    CXString(
        "Cursor_getRawCommentText",

        CXCursor("C")
    )

    CXString(
        "Cursor_getBriefCommentText",

        CXCursor("C")
    )

    CXString(
        "Cursor_getMangling",

        CXCursor("cursor")
    )

    CXStringSet.p(
        "Cursor_getCXXManglings",

        CXCursor("cursor")
    )

    IgnoreMissing..CXStringSet.p(
        "Cursor_getObjCManglings",

        CXCursor("cursor")
    )

    CXModule(
        "Cursor_getModule",

        CXCursor("C")
    )

    CXModule(
        "getModuleForFile",

        CXTranslationUnit("TU"),
        CXFile("file")
    )

    CXFile(
        "Module_getASTFile",

        CXModule("Module")
    )

    CXModule(
        "Module_getParent",

        CXModule("Module")
    )

    CXString(
        "Module_getName",

        CXModule("Module")
    )

    CXString(
        "Module_getFullName",

        CXModule("Module")
    )

    intb(
        "Module_isSystem",

        CXModule("Module")
    )

    unsigned(
        "Module_getNumTopLevelHeaders",

        CXTranslationUnit("TU"),
        CXModule("Module")
    )

    CXFile(
        "Module_getTopLevelHeader",

        CXTranslationUnit("TU"),
        CXModule("Module"),
        unsigned("Index")
    )

    unsignedb(
        "CXXConstructor_isConvertingConstructor",

        CXCursor("C")
    )

    unsignedb(
        "CXXConstructor_isCopyConstructor",

        CXCursor("C")
    )

    unsignedb(
        "CXXConstructor_isDefaultConstructor",

        CXCursor("C")
    )

    unsignedb(
        "CXXConstructor_isMoveConstructor",

        CXCursor("C")
    )

    unsignedb(
        "CXXField_isMutable",

        CXCursor("C")
    )

    unsignedb(
        "CXXMethod_isDefaulted",

        CXCursor("C")
    )

    IgnoreMissing..unsignedb(
        "CXXMethod_isDeleted",

        CXCursor("C")
    )

    unsignedb(
        "CXXMethod_isPureVirtual",

        CXCursor("C")
    )

    unsignedb(
        "CXXMethod_isStatic",

        CXCursor("C")
    )

    unsignedb(
        "CXXMethod_isVirtual",

        CXCursor("C")
    )

    IgnoreMissing..unsignedb(
        "CXXMethod_isCopyAssignmentOperator",

        CXCursor("C")
    )

    IgnoreMissing..unsignedb(
        "CXXMethod_isMoveAssignmentOperator",

        CXCursor("C")
    )

    IgnoreMissing..unsignedb(
        "CXXMethod_isExplicit",

        CXCursor("C")
    )

    IgnoreMissing..unsignedb(
        "CXXRecord_isAbstract",

        CXCursor("C")
    )

    unsignedb(
        "EnumDecl_isScoped",

        CXCursor("C")
    )

    unsignedb(
        "CXXMethod_isConst",

        CXCursor("C")
    )

    CXCursorKind(
        "getTemplateCursorKind",

        CXCursor("C")
    )

    CXCursor(
        "getSpecializedCursorTemplate",

        CXCursor("C")
    )

    CXSourceRange(
        "getCursorReferenceNameRange",

        CXCursor("C"),
        unsigned("NameFlags"),
        unsigned("PieceIndex")
    )

    IgnoreMissing..CXToken.p(
        "getToken",

        CXTranslationUnit("TU"),
        CXSourceLocation("Location")
    )

    CXTokenKind(
        "getTokenKind",

        CXToken("token")
    )

    CXString(
        "getTokenSpelling",

        CXTranslationUnit("TU"),
        CXToken("token")
    )

    CXSourceLocation(
        "getTokenLocation",

        CXTranslationUnit("TU"),
        CXToken("token")
    )

    CXSourceRange(
        "getTokenExtent",

        CXTranslationUnit("TU"),
        CXToken("token")
    )

    void(
        "tokenize",

        CXTranslationUnit("TU"),
        CXSourceRange("Range"),
        Check(1)..CXToken.p.p("Tokens"),
        Check(1)..unsigned.p("NumTokens")
    )

    void(
        "annotateTokens",

        CXTranslationUnit("TU"),
        Input..CXToken.p("Tokens"),
        AutoSize("Tokens", "Cursors")..unsigned("NumTokens"),
        CXCursor.p("Cursors")
    )

    void(
        "disposeTokens",

        CXTranslationUnit("TU"),
        Input..CXToken.p("Tokens"),
        AutoSize("Tokens")..unsigned("NumTokens")
    )

    CXString(
        "getCursorKindSpelling",

        CXCursorKind("Kind")
    )

    void(
        "getDefinitionSpellingAndExtent",

        CXCursor("cursor"),
        Check(1)..nullable..char.const.p.p("startBuf"),
        Check(1)..nullable..char.const.p.p("endBuf"),
        Check(1)..nullable..unsigned.p("startLine"),
        Check(1)..nullable..unsigned.p("startColumn"),
        Check(1)..nullable..unsigned.p("endLine"),
        Check(1)..nullable..unsigned.p("endColumn")
    )

    void("enableStackTraces", void())

    void(
        "executeOnThread",

        CXExecuteOnThread("fn"),
        nullable..opaque_p("user_data"),
        unsigned("stack_size")
    )

    CXCompletionChunkKind(
        "getCompletionChunkKind",

        CXCompletionString("completion_string"),
        unsigned("chunk_number")
    )

    CXString(
        "getCompletionChunkText",

        CXCompletionString("completion_string"),
        unsigned("chunk_number")
    )

    CXCompletionString(
        "getCompletionChunkCompletionString",

        CXCompletionString("completion_string"),
        unsigned("chunk_number")
    )

    unsigned(
        "getNumCompletionChunks",

        CXCompletionString("completion_string")
    )

    unsigned(
        "getCompletionPriority",

        CXCompletionString("completion_string")
    )

    CXAvailabilityKind(
        "getCompletionAvailability",

        CXCompletionString("completion_string")
    )

    unsigned(
        "getCompletionNumAnnotations",

        CXCompletionString("completion_string")
    )

    CXString(
        "getCompletionAnnotation",

        CXCompletionString("completion_string"),
        unsigned("annotation_number")
    )

    CXString(
        "getCompletionParent",

        CXCompletionString("completion_string"),
        Check(1)..nullable..CXCursorKind.p("kind")
    )

    CXString(
        "getCompletionBriefComment",

        CXCompletionString("completion_string")
    )

    CXCompletionString(
        "getCursorCompletionString",

        CXCursor("cursor")
    )

    IgnoreMissing..unsigned(
        "getCompletionNumFixIts",

        CXCodeCompleteResults.p("results"),
        unsigned("completion_index")
    )

    IgnoreMissing..CXString(
        "getCompletionFixIt",

        CXCodeCompleteResults.p("results"),
        unsigned("completion_index"),
        unsigned("fixit_index"),
        CXSourceRange.p("replacement_range")
    )

    unsigned("defaultCodeCompleteOptions", void())

    CXCodeCompleteResults.p(
        "codeCompleteAt",

        CXTranslationUnit("TU"),
        charUTF8.const.p("complete_filename"),
        unsigned("complete_line"),
        unsigned("complete_column"),
        nullable..CXUnsavedFile.p("unsaved_files"),
        AutoSize("unsaved_files")..unsigned("num_unsaved_files"),
        unsigned("options")
    )

    void(
        "sortCodeCompletionResults",

        CXCompletionResult.p("Results"),
        AutoSize("Results")..unsigned("NumResults")
    )

    void(
        "disposeCodeCompleteResults",

        CXCodeCompleteResults.p("Results")
    )

    unsigned(
        "codeCompleteGetNumDiagnostics",

        CXCodeCompleteResults.p("Results")
    )

    CXDiagnostic(
        "codeCompleteGetDiagnostic",

        CXCodeCompleteResults.p("Results"),
        unsigned("Index")
    )

    unsigned_long_long(
        "codeCompleteGetContexts",

        CXCodeCompleteResults.p("Results")
    )

    CXCursorKind(
        "codeCompleteGetContainerKind",

        CXCodeCompleteResults.p("Results"),
        Check(1)..unsigned.p("IsIncomplete")
    )

    CXString(
        "codeCompleteGetContainerUSR",

        CXCodeCompleteResults.p("Results")
    )

    CXString(
        "codeCompleteGetObjCSelector",

        CXCodeCompleteResults.p("Results")
    )

    CXString(
        "getClangVersion",
        void()
    )

    void(
        "toggleCrashRecovery",

        unsignedb("isEnabled")
    )

    void(
        "getInclusions",

        CXTranslationUnit("tu"),
        CXInclusionVisitor("visitor"),
        nullable..CXClientData("client_data")
    )

    CXEvalResult(
        "Cursor_Evaluate",

        CXCursor("C")
    )

    CXEvalResultKind(
        "EvalResult_getKind",

        CXEvalResult("E")
    )

    int(
        "EvalResult_getAsInt",

        CXEvalResult("E")
    )

    long_long(
        "EvalResult_getAsLongLong",

        CXEvalResult("E")
    )

    unsignedb(
        "EvalResult_isUnsignedInt",

        CXEvalResult("E")
    )

    unsigned_long_long(
        "EvalResult_getAsUnsigned",

        CXEvalResult("E")
    )

    double(
        "EvalResult_getAsDouble",

        CXEvalResult("E")
    )

    charUTF8.const.p(
        "EvalResult_getAsStr",

        CXEvalResult("E")
    )

    void(
        "EvalResult_dispose",

        CXEvalResult("E")
    )

    CXRemapping(
        "getRemappings",

        charUTF8.const.p("path")
    )

    CXRemapping(
        "getRemappingsFromFileList",

        charUTF8.const.p.p("filePaths"),
        AutoSize("filePaths")..unsigned("numFiles")
    )

    unsigned(
        "remap_getNumFiles",

        CXRemapping("Remapping")
    )

    void(
        "remap_getFilenames",

        CXRemapping("Remapping"),
        unsigned("index"),
        nullable..CXString.p("original"),
        nullable..CXString.p("transformed")
    )

    void(
        "remap_dispose",

        CXRemapping("Remapping")
    )

    CXResult(
        "findReferencesInFile",

        CXCursor("cursor"),
        CXFile("file"),
        CXCursorAndRangeVisitor("visitor")
    )

    CXResult(
        "findIncludesInFile",

        CXTranslationUnit("TU"),
        CXFile("file"),
        CXCursorAndRangeVisitor("visitor")
    )

    intb(
        "index_isEntityObjCContainerKind",

        CXIdxEntityKind("kind")
    )

    CXIdxObjCContainerDeclInfo.const.p(
        "index_getObjCContainerDeclInfo",

        CXIdxDeclInfo.const.p("info")
    )

    CXIdxObjCInterfaceDeclInfo.const.p(
        "index_getObjCInterfaceDeclInfo",

        CXIdxDeclInfo.const.p("info")
    )

    CXIdxObjCCategoryDeclInfo.const.p(
        "index_getObjCCategoryDeclInfo",

        CXIdxDeclInfo.const.p("info")
    )

    CXIdxObjCProtocolRefListInfo.const.p(
        "index_getObjCProtocolRefListInfo",

        CXIdxDeclInfo.const.p("info")
    )

    CXIdxObjCPropertyDeclInfo.const.p(
        "index_getObjCPropertyDeclInfo",

        CXIdxDeclInfo.const.p("info")
    )

    CXIdxIBOutletCollectionAttrInfo.const.p(
        "index_getIBOutletCollectionAttrInfo",

        CXIdxAttrInfo.const.p("info")
    )

    CXIdxCXXClassDeclInfo.const.p(
        "index_getCXXClassDeclInfo",

        CXIdxDeclInfo.const.p("info")
    )

    CXIdxClientContainer(
        "index_getClientContainer",

        CXIdxContainerInfo.const.p("info")
    )

    void(
        "index_setClientContainer",

        CXIdxContainerInfo.const.p("info"),
        CXIdxClientContainer("container")
    )

    CXIdxClientEntity(
        "index_getClientEntity",

        CXIdxEntityInfo.const.p("info")
    )

    void(
        "index_setClientEntity",

        CXIdxEntityInfo.const.p("info"),
        CXIdxClientEntity("entity")
    )

    CXIndexAction(
        "IndexAction_create",

        CXIndex("CIdx")
    )

    void(
        "IndexAction_dispose",

        CXIndexAction("action")
    )

    int(
        "indexSourceFile",

        CXIndexAction("action"),
        nullable..CXClientData("client_data"),
        IndexerCallbacks.p("index_callbacks"),
        unsigned("index_callbacks_size"),
        unsigned("index_options"),
        charUTF8.const.p("source_filename"),
        nullable..charUTF8.const.p.const.p("command_line_args"),
        AutoSize("command_line_args")..int("num_command_line_args"),
        nullable..CXUnsavedFile.p("unsaved_files"),
        AutoSize("unsaved_files")..unsigned("num_unsaved_files"),
        Check(1)..nullable..CXTranslationUnit.p("out_TU"),
        unsigned("TU_options")
    )

    int(
        "indexSourceFileFullArgv",

        CXIndexAction("action"),
        nullable..CXClientData("client_data"),
        IndexerCallbacks.p("index_callbacks"),
        unsigned("index_callbacks_size"),
        unsigned("index_options"),
        charUTF8.const.p("source_filename"),
        charUTF8.const.p.const.p("command_line_args"),
        AutoSize("command_line_args")..int("num_command_line_args"),
        nullable..CXUnsavedFile.p("unsaved_files"),
        AutoSize("unsaved_files")..unsigned("num_unsaved_files"),
        Check(1)..nullable..CXTranslationUnit.p("out_TU"),
        unsigned("TU_options")
    )

    intb(
        "indexTranslationUnit",

        CXIndexAction("action"),
        nullable..CXClientData("client_data"),
        IndexerCallbacks.p("index_callbacks"),
        unsigned("index_callbacks_size"),
        unsigned("index_options"),
        CXTranslationUnit("TU")
    )

    void(
        "indexLoc_getFileLocation",

        CXIdxLoc("loc"),
        Check(1)..nullable..CXIdxClientFile.p("indexFile"),
        Check(1)..nullable..CXFile.p("file"),
        Check(1)..nullable..unsigned.p("line"),
        Check(1)..nullable..unsigned.p("column"),
        Check(1)..nullable..unsigned.p("offset")
    )

    CXSourceLocation(
        "indexLoc_getCXSourceLocation",

        CXIdxLoc("loc")
    )

    unsignedb(
        "Type_visitFields",

        CXType("T"),
        CXFieldVisitor("visitor"),
        nullable..CXClientData("client_data")
    )

    IgnoreMissing..unsignedb(
        "visitCXXBaseClasses",

        CXType("T"),
        CXFieldVisitor("visitor"),
        nullable..CXClientData("client_data")
    )

    IgnoreMissing..CXString(
        "getBinaryOperatorKindSpelling",

        CXBinaryOperatorKind("kind")
    )

    IgnoreMissing..CXBinaryOperatorKind(
        "getCursorBinaryOperatorKind",

        CXCursor("cursor")
    )

    IgnoreMissing..CXString(
        "getUnaryOperatorKindSpelling",

        CXUnaryOperatorKind("kind")
    )

    IgnoreMissing..CXUnaryOperatorKind(
        "getCursorUnaryOperatorKind",

        CXCursor("cursor")
    )
}