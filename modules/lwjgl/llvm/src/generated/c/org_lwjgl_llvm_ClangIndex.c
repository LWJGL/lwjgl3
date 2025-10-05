/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "clang-c/Index.h"

typedef uintptr_t (*clang_getCStringPROC) (CXString);
typedef void (*clang_disposeStringPROC) (CXString);
typedef CXString (*clang_getFileNamePROC) (uintptr_t);
typedef CXString (*clang_File_tryGetRealPathNamePROC) (uintptr_t);
typedef CXSourceLocation (*clang_getNullLocationPROC) (void);
typedef jint (*clang_equalLocationsPROC) (CXSourceLocation, CXSourceLocation);
typedef jint (*clang_isBeforeInTranslationUnitPROC) (CXSourceLocation, CXSourceLocation);
typedef CXSourceLocation (*clang_getLocationPROC) (uintptr_t, uintptr_t, jint, jint);
typedef CXSourceLocation (*clang_getLocationForOffsetPROC) (uintptr_t, uintptr_t, jint);
typedef jint (*clang_Location_isInSystemHeaderPROC) (CXSourceLocation);
typedef jint (*clang_Location_isFromMainFilePROC) (CXSourceLocation);
typedef CXSourceRange (*clang_getNullRangePROC) (void);
typedef CXSourceRange (*clang_getRangePROC) (CXSourceLocation, CXSourceLocation);
typedef jint (*clang_equalRangesPROC) (CXSourceRange, CXSourceRange);
typedef jint (*clang_Range_isNullPROC) (CXSourceRange);
typedef void (*clang_getExpansionLocationPROC) (CXSourceLocation, uintptr_t, uintptr_t, uintptr_t, uintptr_t);
typedef void (*clang_getPresumedLocationPROC) (CXSourceLocation, uintptr_t, uintptr_t, uintptr_t);
typedef void (*clang_getSpellingLocationPROC) (CXSourceLocation, uintptr_t, uintptr_t, uintptr_t, uintptr_t);
typedef void (*clang_getFileLocationPROC) (CXSourceLocation, uintptr_t, uintptr_t, uintptr_t, uintptr_t);
typedef CXSourceLocation (*clang_getRangeStartPROC) (CXSourceRange);
typedef CXSourceLocation (*clang_getRangeEndPROC) (CXSourceRange);
typedef CXString (*clang_formatDiagnosticPROC) (uintptr_t, jint);
typedef CXSourceLocation (*clang_getDiagnosticLocationPROC) (uintptr_t);
typedef CXString (*clang_getDiagnosticSpellingPROC) (uintptr_t);
typedef CXString (*clang_getDiagnosticOptionPROC) (uintptr_t, uintptr_t);
typedef CXString (*clang_getDiagnosticCategoryTextPROC) (uintptr_t);
typedef CXSourceRange (*clang_getDiagnosticRangePROC) (uintptr_t, jint);
typedef CXString (*clang_getDiagnosticFixItPROC) (uintptr_t, jint, uintptr_t);
typedef CXString (*clang_getTranslationUnitSpellingPROC) (uintptr_t);
typedef CXTUResourceUsage (*clang_getCXTUResourceUsagePROC) (uintptr_t);
typedef void (*clang_disposeCXTUResourceUsagePROC) (CXTUResourceUsage);
typedef CXString (*clang_TargetInfo_getTriplePROC) (uintptr_t);
typedef CXCursor (*clang_getNullCursorPROC) (void);
typedef CXCursor (*clang_getTranslationUnitCursorPROC) (uintptr_t);
typedef jint (*clang_equalCursorsPROC) (CXCursor, CXCursor);
typedef jint (*clang_Cursor_isNullPROC) (CXCursor);
typedef jint (*clang_hashCursorPROC) (CXCursor);
typedef jint (*clang_getCursorKindPROC) (CXCursor);
typedef jint (*clang_isInvalidDeclarationPROC) (CXCursor);
typedef jint (*clang_Cursor_hasAttrsPROC) (CXCursor);
typedef jint (*clang_getCursorLinkagePROC) (CXCursor);
typedef jint (*clang_getCursorVisibilityPROC) (CXCursor);
typedef jint (*clang_getCursorAvailabilityPROC) (CXCursor);
typedef jint (*clang_getCursorPlatformAvailabilityPROC) (CXCursor, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint);
typedef CXCursor (*clang_Cursor_getVarDeclInitializerPROC) (CXCursor);
typedef jint (*clang_Cursor_hasVarDeclGlobalStoragePROC) (CXCursor);
typedef jint (*clang_Cursor_hasVarDeclExternalStoragePROC) (CXCursor);
typedef jint (*clang_getCursorLanguagePROC) (CXCursor);
typedef jint (*clang_getCursorTLSKindPROC) (CXCursor);
typedef uintptr_t (*clang_Cursor_getTranslationUnitPROC) (CXCursor);
typedef jint (*clang_CXCursorSet_containsPROC) (uintptr_t, CXCursor);
typedef jint (*clang_CXCursorSet_insertPROC) (uintptr_t, CXCursor);
typedef CXCursor (*clang_getCursorSemanticParentPROC) (CXCursor);
typedef CXCursor (*clang_getCursorLexicalParentPROC) (CXCursor);
typedef void (*clang_getOverriddenCursorsPROC) (CXCursor, uintptr_t, uintptr_t);
typedef uintptr_t (*clang_getIncludedFilePROC) (CXCursor);
typedef CXCursor (*clang_getCursorPROC) (uintptr_t, CXSourceLocation);
typedef CXSourceLocation (*clang_getCursorLocationPROC) (CXCursor);
typedef CXSourceRange (*clang_getCursorExtentPROC) (CXCursor);
typedef CXType (*clang_getCursorTypePROC) (CXCursor);
typedef CXString (*clang_getTypeSpellingPROC) (CXType);
typedef CXType (*clang_getTypedefDeclUnderlyingTypePROC) (CXCursor);
typedef CXType (*clang_getEnumDeclIntegerTypePROC) (CXCursor);
typedef jlong (*clang_getEnumConstantDeclValuePROC) (CXCursor);
typedef jlong (*clang_getEnumConstantDeclUnsignedValuePROC) (CXCursor);
typedef jint (*clang_Cursor_isBitFieldPROC) (CXCursor);
typedef jint (*clang_getFieldDeclBitWidthPROC) (CXCursor);
typedef jint (*clang_Cursor_getNumArgumentsPROC) (CXCursor);
typedef CXCursor (*clang_Cursor_getArgumentPROC) (CXCursor, jint);
typedef jint (*clang_Cursor_getNumTemplateArgumentsPROC) (CXCursor);
typedef jint (*clang_Cursor_getTemplateArgumentKindPROC) (CXCursor, jint);
typedef CXType (*clang_Cursor_getTemplateArgumentTypePROC) (CXCursor, jint);
typedef jlong (*clang_Cursor_getTemplateArgumentValuePROC) (CXCursor, jint);
typedef jlong (*clang_Cursor_getTemplateArgumentUnsignedValuePROC) (CXCursor, jint);
typedef jint (*clang_equalTypesPROC) (CXType, CXType);
typedef CXType (*clang_getCanonicalTypePROC) (CXType);
typedef jint (*clang_isConstQualifiedTypePROC) (CXType);
typedef jint (*clang_Cursor_isMacroFunctionLikePROC) (CXCursor);
typedef jint (*clang_Cursor_isMacroBuiltinPROC) (CXCursor);
typedef jint (*clang_Cursor_isFunctionInlinedPROC) (CXCursor);
typedef jint (*clang_isVolatileQualifiedTypePROC) (CXType);
typedef jint (*clang_isRestrictQualifiedTypePROC) (CXType);
typedef jint (*clang_getAddressSpacePROC) (CXType);
typedef CXString (*clang_getTypedefNamePROC) (CXType);
typedef CXType (*clang_getPointeeTypePROC) (CXType);
typedef CXType (*clang_getUnqualifiedTypePROC) (CXType);
typedef CXType (*clang_getNonReferenceTypePROC) (CXType);
typedef CXCursor (*clang_getTypeDeclarationPROC) (CXType);
typedef CXString (*clang_getDeclObjCTypeEncodingPROC) (CXCursor);
typedef CXString (*clang_Type_getObjCEncodingPROC) (CXType);
typedef CXString (*clang_getTypeKindSpellingPROC) (jint);
typedef jint (*clang_getFunctionTypeCallingConvPROC) (CXType);
typedef CXType (*clang_getResultTypePROC) (CXType);
typedef jint (*clang_getExceptionSpecificationTypePROC) (CXType);
typedef jint (*clang_getNumArgTypesPROC) (CXType);
typedef CXType (*clang_getArgTypePROC) (CXType, jint);
typedef CXType (*clang_Type_getObjCObjectBaseTypePROC) (CXType);
typedef jint (*clang_Type_getNumObjCProtocolRefsPROC) (CXType);
typedef CXCursor (*clang_Type_getObjCProtocolDeclPROC) (CXType, jint);
typedef jint (*clang_Type_getNumObjCTypeArgsPROC) (CXType);
typedef CXType (*clang_Type_getObjCTypeArgPROC) (CXType, jint);
typedef jint (*clang_isFunctionTypeVariadicPROC) (CXType);
typedef CXType (*clang_getCursorResultTypePROC) (CXCursor);
typedef jint (*clang_getCursorExceptionSpecificationTypePROC) (CXCursor);
typedef jint (*clang_isPODTypePROC) (CXType);
typedef CXType (*clang_getElementTypePROC) (CXType);
typedef jlong (*clang_getNumElementsPROC) (CXType);
typedef CXType (*clang_getArrayElementTypePROC) (CXType);
typedef jlong (*clang_getArraySizePROC) (CXType);
typedef CXType (*clang_Type_getNamedTypePROC) (CXType);
typedef jint (*clang_Type_isTransparentTagTypedefPROC) (CXType);
typedef jint (*clang_Type_getNullabilityPROC) (CXType);
typedef jlong (*clang_Type_getAlignOfPROC) (CXType);
typedef CXType (*clang_Type_getClassTypePROC) (CXType);
typedef jlong (*clang_Type_getSizeOfPROC) (CXType);
typedef jlong (*clang_Type_getOffsetOfPROC) (CXType, uintptr_t);
typedef CXType (*clang_Type_getModifiedTypePROC) (CXType);
typedef CXType (*clang_Type_getValueTypePROC) (CXType);
typedef jlong (*clang_Cursor_getOffsetOfFieldPROC) (CXCursor);
typedef jint (*clang_Cursor_isAnonymousPROC) (CXCursor);
typedef jint (*clang_Cursor_isAnonymousRecordDeclPROC) (CXCursor);
typedef jint (*clang_Cursor_isInlineNamespacePROC) (CXCursor);
typedef jint (*clang_Type_getNumTemplateArgumentsPROC) (CXType);
typedef CXType (*clang_Type_getTemplateArgumentAsTypePROC) (CXType, jint);
typedef jint (*clang_Type_getCXXRefQualifierPROC) (CXType);
typedef jint (*clang_isVirtualBasePROC) (CXCursor);
typedef jlong (*clang_getOffsetOfBasePROC) (CXCursor, CXCursor);
typedef jint (*clang_getCXXAccessSpecifierPROC) (CXCursor);
typedef jint (*clang_Cursor_getBinaryOpcodePROC) (CXCursor);
typedef CXString (*clang_Cursor_getBinaryOpcodeStrPROC) (jint);
typedef jint (*clang_Cursor_getStorageClassPROC) (CXCursor);
typedef jint (*clang_getNumOverloadedDeclsPROC) (CXCursor);
typedef CXCursor (*clang_getOverloadedDeclPROC) (CXCursor, jint);
typedef CXType (*clang_getIBOutletCollectionTypePROC) (CXCursor);
typedef jint (*clang_visitChildrenPROC) (CXCursor, uintptr_t, uintptr_t);
typedef CXString (*clang_getCursorUSRPROC) (CXCursor);
typedef CXString (*clang_constructUSR_ObjCClassPROC) (uintptr_t);
typedef CXString (*clang_constructUSR_ObjCCategoryPROC) (uintptr_t, uintptr_t);
typedef CXString (*clang_constructUSR_ObjCProtocolPROC) (uintptr_t);
typedef CXString (*clang_constructUSR_ObjCIvarPROC) (uintptr_t, CXString);
typedef CXString (*clang_constructUSR_ObjCMethodPROC) (uintptr_t, jint, CXString);
typedef CXString (*clang_constructUSR_ObjCPropertyPROC) (uintptr_t, CXString);
typedef CXString (*clang_getCursorSpellingPROC) (CXCursor);
typedef CXSourceRange (*clang_Cursor_getSpellingNameRangePROC) (CXCursor, jint, jint);
typedef uintptr_t (*clang_getCursorPrintingPolicyPROC) (CXCursor);
typedef CXString (*clang_getCursorPrettyPrintedPROC) (CXCursor, uintptr_t);
typedef CXString (*clang_getTypePrettyPrintedPROC) (CXType, uintptr_t);
typedef CXString (*clang_getFullyQualifiedNamePROC) (CXType, uintptr_t, jint);
typedef CXString (*clang_getCursorDisplayNamePROC) (CXCursor);
typedef CXCursor (*clang_getCursorReferencedPROC) (CXCursor);
typedef CXCursor (*clang_getCursorDefinitionPROC) (CXCursor);
typedef jint (*clang_isCursorDefinitionPROC) (CXCursor);
typedef CXCursor (*clang_getCanonicalCursorPROC) (CXCursor);
typedef jint (*clang_Cursor_getObjCSelectorIndexPROC) (CXCursor);
typedef jint (*clang_Cursor_isDynamicCallPROC) (CXCursor);
typedef CXType (*clang_Cursor_getReceiverTypePROC) (CXCursor);
typedef jint (*clang_Cursor_getObjCPropertyAttributesPROC) (CXCursor, jint);
typedef CXString (*clang_Cursor_getObjCPropertyGetterNamePROC) (CXCursor);
typedef CXString (*clang_Cursor_getObjCPropertySetterNamePROC) (CXCursor);
typedef jint (*clang_Cursor_getObjCDeclQualifiersPROC) (CXCursor);
typedef jint (*clang_Cursor_isObjCOptionalPROC) (CXCursor);
typedef jint (*clang_Cursor_isVariadicPROC) (CXCursor);
typedef jint (*clang_Cursor_isExternalSymbolPROC) (CXCursor, uintptr_t, uintptr_t, uintptr_t);
typedef CXSourceRange (*clang_Cursor_getCommentRangePROC) (CXCursor);
typedef CXString (*clang_Cursor_getRawCommentTextPROC) (CXCursor);
typedef CXString (*clang_Cursor_getBriefCommentTextPROC) (CXCursor);
typedef CXString (*clang_Cursor_getManglingPROC) (CXCursor);
typedef uintptr_t (*clang_Cursor_getCXXManglingsPROC) (CXCursor);
typedef uintptr_t (*clang_Cursor_getObjCManglingsPROC) (CXCursor);
typedef CXString (*clang_Cursor_getGCCAssemblyTemplatePROC) (CXCursor);
typedef jint (*clang_Cursor_isGCCAssemblyHasGotoPROC) (CXCursor);
typedef jint (*clang_Cursor_getGCCAssemblyNumOutputsPROC) (CXCursor);
typedef jint (*clang_Cursor_getGCCAssemblyNumInputsPROC) (CXCursor);
typedef jint (*clang_Cursor_getGCCAssemblyInputPROC) (CXCursor, jint, uintptr_t, uintptr_t);
typedef jint (*clang_Cursor_getGCCAssemblyOutputPROC) (CXCursor, jint, uintptr_t, uintptr_t);
typedef jint (*clang_Cursor_getGCCAssemblyNumClobbersPROC) (CXCursor);
typedef CXString (*clang_Cursor_getGCCAssemblyClobberPROC) (CXCursor, jint);
typedef jint (*clang_Cursor_isGCCAssemblyVolatilePROC) (CXCursor);
typedef uintptr_t (*clang_Cursor_getModulePROC) (CXCursor);
typedef CXString (*clang_Module_getNamePROC) (uintptr_t);
typedef CXString (*clang_Module_getFullNamePROC) (uintptr_t);
typedef jint (*clang_CXXConstructor_isConvertingConstructorPROC) (CXCursor);
typedef jint (*clang_CXXConstructor_isCopyConstructorPROC) (CXCursor);
typedef jint (*clang_CXXConstructor_isDefaultConstructorPROC) (CXCursor);
typedef jint (*clang_CXXConstructor_isMoveConstructorPROC) (CXCursor);
typedef jint (*clang_CXXField_isMutablePROC) (CXCursor);
typedef jint (*clang_CXXMethod_isDefaultedPROC) (CXCursor);
typedef jint (*clang_CXXMethod_isDeletedPROC) (CXCursor);
typedef jint (*clang_CXXMethod_isPureVirtualPROC) (CXCursor);
typedef jint (*clang_CXXMethod_isStaticPROC) (CXCursor);
typedef jint (*clang_CXXMethod_isVirtualPROC) (CXCursor);
typedef jint (*clang_CXXMethod_isCopyAssignmentOperatorPROC) (CXCursor);
typedef jint (*clang_CXXMethod_isMoveAssignmentOperatorPROC) (CXCursor);
typedef jint (*clang_CXXMethod_isExplicitPROC) (CXCursor);
typedef jint (*clang_CXXRecord_isAbstractPROC) (CXCursor);
typedef jint (*clang_EnumDecl_isScopedPROC) (CXCursor);
typedef jint (*clang_CXXMethod_isConstPROC) (CXCursor);
typedef jint (*clang_getTemplateCursorKindPROC) (CXCursor);
typedef CXCursor (*clang_getSpecializedCursorTemplatePROC) (CXCursor);
typedef CXSourceRange (*clang_getCursorReferenceNameRangePROC) (CXCursor, jint, jint);
typedef uintptr_t (*clang_getTokenPROC) (uintptr_t, CXSourceLocation);
typedef jint (*clang_getTokenKindPROC) (CXToken);
typedef CXString (*clang_getTokenSpellingPROC) (uintptr_t, CXToken);
typedef CXSourceLocation (*clang_getTokenLocationPROC) (uintptr_t, CXToken);
typedef CXSourceRange (*clang_getTokenExtentPROC) (uintptr_t, CXToken);
typedef void (*clang_tokenizePROC) (uintptr_t, CXSourceRange, uintptr_t, uintptr_t);
typedef CXString (*clang_getCursorKindSpellingPROC) (jint);
typedef void (*clang_getDefinitionSpellingAndExtentPROC) (CXCursor, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t);
typedef CXString (*clang_getCompletionChunkTextPROC) (uintptr_t, jint);
typedef CXString (*clang_getCompletionAnnotationPROC) (uintptr_t, jint);
typedef CXString (*clang_getCompletionParentPROC) (uintptr_t, uintptr_t);
typedef CXString (*clang_getCompletionBriefCommentPROC) (uintptr_t);
typedef uintptr_t (*clang_getCursorCompletionStringPROC) (CXCursor);
typedef CXString (*clang_getCompletionFixItPROC) (uintptr_t, jint, jint, uintptr_t);
typedef CXString (*clang_codeCompleteGetContainerUSRPROC) (uintptr_t);
typedef CXString (*clang_codeCompleteGetObjCSelectorPROC) (uintptr_t);
typedef CXString (*clang_getClangVersionPROC) (void);
typedef uintptr_t (*clang_Cursor_EvaluatePROC) (CXCursor);
typedef jint (*clang_findReferencesInFilePROC) (CXCursor, uintptr_t, CXCursorAndRangeVisitor);
typedef jint (*clang_findIncludesInFilePROC) (uintptr_t, uintptr_t, CXCursorAndRangeVisitor);
typedef void (*clang_indexLoc_getFileLocationPROC) (CXIdxLoc, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t);
typedef CXSourceLocation (*clang_indexLoc_getCXSourceLocationPROC) (CXIdxLoc);
typedef jint (*clang_Type_visitFieldsPROC) (CXType, uintptr_t, uintptr_t);
typedef jint (*clang_visitCXXBaseClassesPROC) (CXType, uintptr_t, uintptr_t);
typedef jint (*clang_visitCXXMethodsPROC) (CXType, uintptr_t, uintptr_t);
typedef CXString (*clang_getBinaryOperatorKindSpellingPROC) (jint);
typedef jint (*clang_getCursorBinaryOperatorKindPROC) (CXCursor);
typedef CXString (*clang_getUnaryOperatorKindSpellingPROC) (jint);
typedef jint (*clang_getCursorUnaryOperatorKindPROC) (CXCursor);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCString(JNIEnv *__env, jclass clazz, jlong stringAddress, jlong __functionAddress) {
    clang_getCStringPROC clang_getCString = (clang_getCStringPROC)(uintptr_t)__functionAddress;
    CXString *string = (CXString *)(uintptr_t)stringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_getCString(*string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1disposeString(JNIEnv *__env, jclass clazz, jlong stringAddress, jlong __functionAddress) {
    clang_disposeStringPROC clang_disposeString = (clang_disposeStringPROC)(uintptr_t)__functionAddress;
    CXString *string = (CXString *)(uintptr_t)stringAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_disposeString(*string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getFileName(JNIEnv *__env, jclass clazz, jlong SFileAddress, jlong __functionAddress, jlong __result) {
    clang_getFileNamePROC clang_getFileName = (clang_getFileNamePROC)(uintptr_t)__functionAddress;
    uintptr_t SFile = (uintptr_t)SFileAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getFileName(SFile);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1File_1tryGetRealPathName(JNIEnv *__env, jclass clazz, jlong fileAddress, jlong __functionAddress, jlong __result) {
    clang_File_tryGetRealPathNamePROC clang_File_tryGetRealPathName = (clang_File_tryGetRealPathNamePROC)(uintptr_t)__functionAddress;
    uintptr_t file = (uintptr_t)fileAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_File_tryGetRealPathName(file);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getNullLocation(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong __result) {
    clang_getNullLocationPROC clang_getNullLocation = (clang_getNullLocationPROC)(uintptr_t)__functionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceLocation*)(uintptr_t)__result) = clang_getNullLocation();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1equalLocations(JNIEnv *__env, jclass clazz, jlong loc1Address, jlong loc2Address, jlong __functionAddress) {
    clang_equalLocationsPROC clang_equalLocations = (clang_equalLocationsPROC)(uintptr_t)__functionAddress;
    CXSourceLocation *loc1 = (CXSourceLocation *)(uintptr_t)loc1Address;
    CXSourceLocation *loc2 = (CXSourceLocation *)(uintptr_t)loc2Address;
    UNUSED_PARAMS(__env, clazz)
    return clang_equalLocations(*loc1, *loc2);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1isBeforeInTranslationUnit(JNIEnv *__env, jclass clazz, jlong loc1Address, jlong loc2Address, jlong __functionAddress) {
    clang_isBeforeInTranslationUnitPROC clang_isBeforeInTranslationUnit = (clang_isBeforeInTranslationUnitPROC)(uintptr_t)__functionAddress;
    CXSourceLocation *loc1 = (CXSourceLocation *)(uintptr_t)loc1Address;
    CXSourceLocation *loc2 = (CXSourceLocation *)(uintptr_t)loc2Address;
    UNUSED_PARAMS(__env, clazz)
    return clang_isBeforeInTranslationUnit(*loc1, *loc2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getLocation(JNIEnv *__env, jclass clazz, jlong tuAddress, jlong fileAddress, jint line, jint column, jlong __functionAddress, jlong __result) {
    clang_getLocationPROC clang_getLocation = (clang_getLocationPROC)(uintptr_t)__functionAddress;
    uintptr_t tu = (uintptr_t)tuAddress;
    uintptr_t file = (uintptr_t)fileAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceLocation*)(uintptr_t)__result) = clang_getLocation(tu, file, line, column);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getLocationForOffset(JNIEnv *__env, jclass clazz, jlong tuAddress, jlong fileAddress, jint offset, jlong __functionAddress, jlong __result) {
    clang_getLocationForOffsetPROC clang_getLocationForOffset = (clang_getLocationForOffsetPROC)(uintptr_t)__functionAddress;
    uintptr_t tu = (uintptr_t)tuAddress;
    uintptr_t file = (uintptr_t)fileAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceLocation*)(uintptr_t)__result) = clang_getLocationForOffset(tu, file, offset);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Location_1isInSystemHeader(JNIEnv *__env, jclass clazz, jlong locationAddress, jlong __functionAddress) {
    clang_Location_isInSystemHeaderPROC clang_Location_isInSystemHeader = (clang_Location_isInSystemHeaderPROC)(uintptr_t)__functionAddress;
    CXSourceLocation *location = (CXSourceLocation *)(uintptr_t)locationAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Location_isInSystemHeader(*location);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Location_1isFromMainFile(JNIEnv *__env, jclass clazz, jlong locationAddress, jlong __functionAddress) {
    clang_Location_isFromMainFilePROC clang_Location_isFromMainFile = (clang_Location_isFromMainFilePROC)(uintptr_t)__functionAddress;
    CXSourceLocation *location = (CXSourceLocation *)(uintptr_t)locationAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Location_isFromMainFile(*location);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getNullRange(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong __result) {
    clang_getNullRangePROC clang_getNullRange = (clang_getNullRangePROC)(uintptr_t)__functionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceRange*)(uintptr_t)__result) = clang_getNullRange();
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getRange(JNIEnv *__env, jclass clazz, jlong beginAddress, jlong endAddress, jlong __functionAddress, jlong __result) {
    clang_getRangePROC clang_getRange = (clang_getRangePROC)(uintptr_t)__functionAddress;
    CXSourceLocation *begin = (CXSourceLocation *)(uintptr_t)beginAddress;
    CXSourceLocation *end = (CXSourceLocation *)(uintptr_t)endAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceRange*)(uintptr_t)__result) = clang_getRange(*begin, *end);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1equalRanges(JNIEnv *__env, jclass clazz, jlong range1Address, jlong range2Address, jlong __functionAddress) {
    clang_equalRangesPROC clang_equalRanges = (clang_equalRangesPROC)(uintptr_t)__functionAddress;
    CXSourceRange *range1 = (CXSourceRange *)(uintptr_t)range1Address;
    CXSourceRange *range2 = (CXSourceRange *)(uintptr_t)range2Address;
    UNUSED_PARAMS(__env, clazz)
    return clang_equalRanges(*range1, *range2);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Range_1isNull(JNIEnv *__env, jclass clazz, jlong rangeAddress, jlong __functionAddress) {
    clang_Range_isNullPROC clang_Range_isNull = (clang_Range_isNullPROC)(uintptr_t)__functionAddress;
    CXSourceRange *range = (CXSourceRange *)(uintptr_t)rangeAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Range_isNull(*range);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getExpansionLocation(JNIEnv *__env, jclass clazz, jlong locationAddress, jlong fileAddress, jlong lineAddress, jlong columnAddress, jlong offsetAddress, jlong __functionAddress) {
    clang_getExpansionLocationPROC clang_getExpansionLocation = (clang_getExpansionLocationPROC)(uintptr_t)__functionAddress;
    CXSourceLocation *location = (CXSourceLocation *)(uintptr_t)locationAddress;
    uintptr_t file = (uintptr_t)fileAddress;
    uintptr_t line = (uintptr_t)lineAddress;
    uintptr_t column = (uintptr_t)columnAddress;
    uintptr_t offset = (uintptr_t)offsetAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_getExpansionLocation(*location, file, line, column, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getPresumedLocation(JNIEnv *__env, jclass clazz, jlong locationAddress, jlong filenameAddress, jlong lineAddress, jlong columnAddress, jlong __functionAddress) {
    clang_getPresumedLocationPROC clang_getPresumedLocation = (clang_getPresumedLocationPROC)(uintptr_t)__functionAddress;
    CXSourceLocation *location = (CXSourceLocation *)(uintptr_t)locationAddress;
    uintptr_t filename = (uintptr_t)filenameAddress;
    uintptr_t line = (uintptr_t)lineAddress;
    uintptr_t column = (uintptr_t)columnAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_getPresumedLocation(*location, filename, line, column);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getSpellingLocation(JNIEnv *__env, jclass clazz, jlong locationAddress, jlong fileAddress, jlong lineAddress, jlong columnAddress, jlong offsetAddress, jlong __functionAddress) {
    clang_getSpellingLocationPROC clang_getSpellingLocation = (clang_getSpellingLocationPROC)(uintptr_t)__functionAddress;
    CXSourceLocation *location = (CXSourceLocation *)(uintptr_t)locationAddress;
    uintptr_t file = (uintptr_t)fileAddress;
    uintptr_t line = (uintptr_t)lineAddress;
    uintptr_t column = (uintptr_t)columnAddress;
    uintptr_t offset = (uintptr_t)offsetAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_getSpellingLocation(*location, file, line, column, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getFileLocation(JNIEnv *__env, jclass clazz, jlong locationAddress, jlong fileAddress, jlong lineAddress, jlong columnAddress, jlong offsetAddress, jlong __functionAddress) {
    clang_getFileLocationPROC clang_getFileLocation = (clang_getFileLocationPROC)(uintptr_t)__functionAddress;
    CXSourceLocation *location = (CXSourceLocation *)(uintptr_t)locationAddress;
    uintptr_t file = (uintptr_t)fileAddress;
    uintptr_t line = (uintptr_t)lineAddress;
    uintptr_t column = (uintptr_t)columnAddress;
    uintptr_t offset = (uintptr_t)offsetAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_getFileLocation(*location, file, line, column, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getRangeStart(JNIEnv *__env, jclass clazz, jlong rangeAddress, jlong __functionAddress, jlong __result) {
    clang_getRangeStartPROC clang_getRangeStart = (clang_getRangeStartPROC)(uintptr_t)__functionAddress;
    CXSourceRange *range = (CXSourceRange *)(uintptr_t)rangeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceLocation*)(uintptr_t)__result) = clang_getRangeStart(*range);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getRangeEnd(JNIEnv *__env, jclass clazz, jlong rangeAddress, jlong __functionAddress, jlong __result) {
    clang_getRangeEndPROC clang_getRangeEnd = (clang_getRangeEndPROC)(uintptr_t)__functionAddress;
    CXSourceRange *range = (CXSourceRange *)(uintptr_t)rangeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceLocation*)(uintptr_t)__result) = clang_getRangeEnd(*range);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1formatDiagnostic(JNIEnv *__env, jclass clazz, jlong DiagnosticAddress, jint Options, jlong __functionAddress, jlong __result) {
    clang_formatDiagnosticPROC clang_formatDiagnostic = (clang_formatDiagnosticPROC)(uintptr_t)__functionAddress;
    uintptr_t Diagnostic = (uintptr_t)DiagnosticAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_formatDiagnostic(Diagnostic, Options);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getDiagnosticLocation(JNIEnv *__env, jclass clazz, jlong DiagnosticAddress, jlong __functionAddress, jlong __result) {
    clang_getDiagnosticLocationPROC clang_getDiagnosticLocation = (clang_getDiagnosticLocationPROC)(uintptr_t)__functionAddress;
    uintptr_t Diagnostic = (uintptr_t)DiagnosticAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceLocation*)(uintptr_t)__result) = clang_getDiagnosticLocation(Diagnostic);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getDiagnosticSpelling(JNIEnv *__env, jclass clazz, jlong DiagnosticAddress, jlong __functionAddress, jlong __result) {
    clang_getDiagnosticSpellingPROC clang_getDiagnosticSpelling = (clang_getDiagnosticSpellingPROC)(uintptr_t)__functionAddress;
    uintptr_t Diagnostic = (uintptr_t)DiagnosticAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getDiagnosticSpelling(Diagnostic);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getDiagnosticOption(JNIEnv *__env, jclass clazz, jlong DiagAddress, jlong DisableAddress, jlong __functionAddress, jlong __result) {
    clang_getDiagnosticOptionPROC clang_getDiagnosticOption = (clang_getDiagnosticOptionPROC)(uintptr_t)__functionAddress;
    uintptr_t Diag = (uintptr_t)DiagAddress;
    uintptr_t Disable = (uintptr_t)DisableAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getDiagnosticOption(Diag, Disable);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getDiagnosticCategoryText(JNIEnv *__env, jclass clazz, jlong DiagnosticAddress, jlong __functionAddress, jlong __result) {
    clang_getDiagnosticCategoryTextPROC clang_getDiagnosticCategoryText = (clang_getDiagnosticCategoryTextPROC)(uintptr_t)__functionAddress;
    uintptr_t Diagnostic = (uintptr_t)DiagnosticAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getDiagnosticCategoryText(Diagnostic);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getDiagnosticRange(JNIEnv *__env, jclass clazz, jlong DiagnosticAddress, jint Range, jlong __functionAddress, jlong __result) {
    clang_getDiagnosticRangePROC clang_getDiagnosticRange = (clang_getDiagnosticRangePROC)(uintptr_t)__functionAddress;
    uintptr_t Diagnostic = (uintptr_t)DiagnosticAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceRange*)(uintptr_t)__result) = clang_getDiagnosticRange(Diagnostic, Range);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getDiagnosticFixIt(JNIEnv *__env, jclass clazz, jlong DiagnosticAddress, jint FixIt, jlong ReplacementRangeAddress, jlong __functionAddress, jlong __result) {
    clang_getDiagnosticFixItPROC clang_getDiagnosticFixIt = (clang_getDiagnosticFixItPROC)(uintptr_t)__functionAddress;
    uintptr_t Diagnostic = (uintptr_t)DiagnosticAddress;
    uintptr_t ReplacementRange = (uintptr_t)ReplacementRangeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getDiagnosticFixIt(Diagnostic, FixIt, ReplacementRange);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTranslationUnitSpelling(JNIEnv *__env, jclass clazz, jlong CTUnitAddress, jlong __functionAddress, jlong __result) {
    clang_getTranslationUnitSpellingPROC clang_getTranslationUnitSpelling = (clang_getTranslationUnitSpellingPROC)(uintptr_t)__functionAddress;
    uintptr_t CTUnit = (uintptr_t)CTUnitAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getTranslationUnitSpelling(CTUnit);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCXTUResourceUsage(JNIEnv *__env, jclass clazz, jlong TUAddress, jlong __functionAddress, jlong __result) {
    clang_getCXTUResourceUsagePROC clang_getCXTUResourceUsage = (clang_getCXTUResourceUsagePROC)(uintptr_t)__functionAddress;
    uintptr_t TU = (uintptr_t)TUAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXTUResourceUsage*)(uintptr_t)__result) = clang_getCXTUResourceUsage(TU);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1disposeCXTUResourceUsage(JNIEnv *__env, jclass clazz, jlong usageAddress, jlong __functionAddress) {
    clang_disposeCXTUResourceUsagePROC clang_disposeCXTUResourceUsage = (clang_disposeCXTUResourceUsagePROC)(uintptr_t)__functionAddress;
    CXTUResourceUsage *usage = (CXTUResourceUsage *)(uintptr_t)usageAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_disposeCXTUResourceUsage(*usage);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1TargetInfo_1getTriple(JNIEnv *__env, jclass clazz, jlong InfoAddress, jlong __functionAddress, jlong __result) {
    clang_TargetInfo_getTriplePROC clang_TargetInfo_getTriple = (clang_TargetInfo_getTriplePROC)(uintptr_t)__functionAddress;
    uintptr_t Info = (uintptr_t)InfoAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_TargetInfo_getTriple(Info);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getNullCursor(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong __result) {
    clang_getNullCursorPROC clang_getNullCursor = (clang_getNullCursorPROC)(uintptr_t)__functionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(uintptr_t)__result) = clang_getNullCursor();
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTranslationUnitCursor(JNIEnv *__env, jclass clazz, jlong TUAddress, jlong __functionAddress, jlong __result) {
    clang_getTranslationUnitCursorPROC clang_getTranslationUnitCursor = (clang_getTranslationUnitCursorPROC)(uintptr_t)__functionAddress;
    uintptr_t TU = (uintptr_t)TUAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(uintptr_t)__result) = clang_getTranslationUnitCursor(TU);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1equalCursors(JNIEnv *__env, jclass clazz, jlong AAddress, jlong BAddress, jlong __functionAddress) {
    clang_equalCursorsPROC clang_equalCursors = (clang_equalCursorsPROC)(uintptr_t)__functionAddress;
    CXCursor *A = (CXCursor *)(uintptr_t)AAddress;
    CXCursor *B = (CXCursor *)(uintptr_t)BAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_equalCursors(*A, *B);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isNull(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_Cursor_isNullPROC clang_Cursor_isNull = (clang_Cursor_isNullPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_isNull(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1hashCursor(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_hashCursorPROC clang_hashCursor = (clang_hashCursorPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_hashCursor(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorKind(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getCursorKindPROC clang_getCursorKind = (clang_getCursorKindPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getCursorKind(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1isInvalidDeclaration(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_isInvalidDeclarationPROC clang_isInvalidDeclaration = (clang_isInvalidDeclarationPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_isInvalidDeclaration(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1hasAttrs(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_hasAttrsPROC clang_Cursor_hasAttrs = (clang_Cursor_hasAttrsPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_hasAttrs(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorLinkage(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getCursorLinkagePROC clang_getCursorLinkage = (clang_getCursorLinkagePROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getCursorLinkage(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorVisibility(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getCursorVisibilityPROC clang_getCursorVisibility = (clang_getCursorVisibilityPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getCursorVisibility(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorAvailability(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getCursorAvailabilityPROC clang_getCursorAvailability = (clang_getCursorAvailabilityPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getCursorAvailability(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorPlatformAvailability(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong always_deprecatedAddress, jlong deprecated_messageAddress, jlong always_unavailableAddress, jlong unavailable_messageAddress, jlong availabilityAddress, jint availability_size, jlong __functionAddress) {
    clang_getCursorPlatformAvailabilityPROC clang_getCursorPlatformAvailability = (clang_getCursorPlatformAvailabilityPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    uintptr_t always_deprecated = (uintptr_t)always_deprecatedAddress;
    uintptr_t deprecated_message = (uintptr_t)deprecated_messageAddress;
    uintptr_t always_unavailable = (uintptr_t)always_unavailableAddress;
    uintptr_t unavailable_message = (uintptr_t)unavailable_messageAddress;
    uintptr_t availability = (uintptr_t)availabilityAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getCursorPlatformAvailability(*cursor, always_deprecated, deprecated_message, always_unavailable, unavailable_message, availability, availability_size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getVarDeclInitializer(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_Cursor_getVarDeclInitializerPROC clang_Cursor_getVarDeclInitializer = (clang_Cursor_getVarDeclInitializerPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(uintptr_t)__result) = clang_Cursor_getVarDeclInitializer(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1hasVarDeclGlobalStorage(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_Cursor_hasVarDeclGlobalStoragePROC clang_Cursor_hasVarDeclGlobalStorage = (clang_Cursor_hasVarDeclGlobalStoragePROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_hasVarDeclGlobalStorage(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1hasVarDeclExternalStorage(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_Cursor_hasVarDeclExternalStoragePROC clang_Cursor_hasVarDeclExternalStorage = (clang_Cursor_hasVarDeclExternalStoragePROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_hasVarDeclExternalStorage(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorLanguage(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getCursorLanguagePROC clang_getCursorLanguage = (clang_getCursorLanguagePROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getCursorLanguage(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorTLSKind(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getCursorTLSKindPROC clang_getCursorTLSKind = (clang_getCursorTLSKindPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getCursorTLSKind(*cursor);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getTranslationUnit(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_Cursor_getTranslationUnitPROC clang_Cursor_getTranslationUnit = (clang_Cursor_getTranslationUnitPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_Cursor_getTranslationUnit(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXCursorSet_1contains(JNIEnv *__env, jclass clazz, jlong csetAddress, jlong cursorAddress, jlong __functionAddress) {
    clang_CXCursorSet_containsPROC clang_CXCursorSet_contains = (clang_CXCursorSet_containsPROC)(uintptr_t)__functionAddress;
    uintptr_t cset = (uintptr_t)csetAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_CXCursorSet_contains(cset, *cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXCursorSet_1insert(JNIEnv *__env, jclass clazz, jlong csetAddress, jlong cursorAddress, jlong __functionAddress) {
    clang_CXCursorSet_insertPROC clang_CXCursorSet_insert = (clang_CXCursorSet_insertPROC)(uintptr_t)__functionAddress;
    uintptr_t cset = (uintptr_t)csetAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_CXCursorSet_insert(cset, *cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorSemanticParent(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorSemanticParentPROC clang_getCursorSemanticParent = (clang_getCursorSemanticParentPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(uintptr_t)__result) = clang_getCursorSemanticParent(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorLexicalParent(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorLexicalParentPROC clang_getCursorLexicalParent = (clang_getCursorLexicalParentPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(uintptr_t)__result) = clang_getCursorLexicalParent(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getOverriddenCursors(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong overriddenAddress, jlong num_overriddenAddress, jlong __functionAddress) {
    clang_getOverriddenCursorsPROC clang_getOverriddenCursors = (clang_getOverriddenCursorsPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    uintptr_t overridden = (uintptr_t)overriddenAddress;
    uintptr_t num_overridden = (uintptr_t)num_overriddenAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_getOverriddenCursors(*cursor, overridden, num_overridden);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getIncludedFile(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getIncludedFilePROC clang_getIncludedFile = (clang_getIncludedFilePROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_getIncludedFile(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursor(JNIEnv *__env, jclass clazz, jlong TUAddress, jlong locationAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorPROC clang_getCursor = (clang_getCursorPROC)(uintptr_t)__functionAddress;
    uintptr_t TU = (uintptr_t)TUAddress;
    CXSourceLocation *location = (CXSourceLocation *)(uintptr_t)locationAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(uintptr_t)__result) = clang_getCursor(TU, *location);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorLocation(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorLocationPROC clang_getCursorLocation = (clang_getCursorLocationPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceLocation*)(uintptr_t)__result) = clang_getCursorLocation(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorExtent(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorExtentPROC clang_getCursorExtent = (clang_getCursorExtentPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceRange*)(uintptr_t)__result) = clang_getCursorExtent(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorType(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorTypePROC clang_getCursorType = (clang_getCursorTypePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_getCursorType(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTypeSpelling(JNIEnv *__env, jclass clazz, jlong CTAddress, jlong __functionAddress, jlong __result) {
    clang_getTypeSpellingPROC clang_getTypeSpelling = (clang_getTypeSpellingPROC)(uintptr_t)__functionAddress;
    CXType *CT = (CXType *)(uintptr_t)CTAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getTypeSpelling(*CT);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTypedefDeclUnderlyingType(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_getTypedefDeclUnderlyingTypePROC clang_getTypedefDeclUnderlyingType = (clang_getTypedefDeclUnderlyingTypePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_getTypedefDeclUnderlyingType(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getEnumDeclIntegerType(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_getEnumDeclIntegerTypePROC clang_getEnumDeclIntegerType = (clang_getEnumDeclIntegerTypePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_getEnumDeclIntegerType(*C);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getEnumConstantDeclValue(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_getEnumConstantDeclValuePROC clang_getEnumConstantDeclValue = (clang_getEnumConstantDeclValuePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getEnumConstantDeclValue(*C);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getEnumConstantDeclUnsignedValue(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_getEnumConstantDeclUnsignedValuePROC clang_getEnumConstantDeclUnsignedValue = (clang_getEnumConstantDeclUnsignedValuePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getEnumConstantDeclUnsignedValue(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isBitField(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_isBitFieldPROC clang_Cursor_isBitField = (clang_Cursor_isBitFieldPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_isBitField(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getFieldDeclBitWidth(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_getFieldDeclBitWidthPROC clang_getFieldDeclBitWidth = (clang_getFieldDeclBitWidthPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getFieldDeclBitWidth(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getNumArguments(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_getNumArgumentsPROC clang_Cursor_getNumArguments = (clang_Cursor_getNumArgumentsPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_getNumArguments(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getArgument(JNIEnv *__env, jclass clazz, jlong CAddress, jint i, jlong __functionAddress, jlong __result) {
    clang_Cursor_getArgumentPROC clang_Cursor_getArgument = (clang_Cursor_getArgumentPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(uintptr_t)__result) = clang_Cursor_getArgument(*C, i);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getNumTemplateArguments(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_getNumTemplateArgumentsPROC clang_Cursor_getNumTemplateArguments = (clang_Cursor_getNumTemplateArgumentsPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_getNumTemplateArguments(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getTemplateArgumentKind(JNIEnv *__env, jclass clazz, jlong CAddress, jint I, jlong __functionAddress) {
    clang_Cursor_getTemplateArgumentKindPROC clang_Cursor_getTemplateArgumentKind = (clang_Cursor_getTemplateArgumentKindPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_getTemplateArgumentKind(*C, I);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getTemplateArgumentType(JNIEnv *__env, jclass clazz, jlong CAddress, jint I, jlong __functionAddress, jlong __result) {
    clang_Cursor_getTemplateArgumentTypePROC clang_Cursor_getTemplateArgumentType = (clang_Cursor_getTemplateArgumentTypePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_Cursor_getTemplateArgumentType(*C, I);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getTemplateArgumentValue(JNIEnv *__env, jclass clazz, jlong CAddress, jint I, jlong __functionAddress) {
    clang_Cursor_getTemplateArgumentValuePROC clang_Cursor_getTemplateArgumentValue = (clang_Cursor_getTemplateArgumentValuePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_getTemplateArgumentValue(*C, I);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getTemplateArgumentUnsignedValue(JNIEnv *__env, jclass clazz, jlong CAddress, jint I, jlong __functionAddress) {
    clang_Cursor_getTemplateArgumentUnsignedValuePROC clang_Cursor_getTemplateArgumentUnsignedValue = (clang_Cursor_getTemplateArgumentUnsignedValuePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_getTemplateArgumentUnsignedValue(*C, I);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1equalTypes(JNIEnv *__env, jclass clazz, jlong AAddress, jlong BAddress, jlong __functionAddress) {
    clang_equalTypesPROC clang_equalTypes = (clang_equalTypesPROC)(uintptr_t)__functionAddress;
    CXType *A = (CXType *)(uintptr_t)AAddress;
    CXType *B = (CXType *)(uintptr_t)BAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_equalTypes(*A, *B);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCanonicalType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress, jlong __result) {
    clang_getCanonicalTypePROC clang_getCanonicalType = (clang_getCanonicalTypePROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_getCanonicalType(*T);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1isConstQualifiedType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_isConstQualifiedTypePROC clang_isConstQualifiedType = (clang_isConstQualifiedTypePROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_isConstQualifiedType(*T);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isMacroFunctionLike(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_isMacroFunctionLikePROC clang_Cursor_isMacroFunctionLike = (clang_Cursor_isMacroFunctionLikePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_isMacroFunctionLike(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isMacroBuiltin(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_isMacroBuiltinPROC clang_Cursor_isMacroBuiltin = (clang_Cursor_isMacroBuiltinPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_isMacroBuiltin(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isFunctionInlined(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_isFunctionInlinedPROC clang_Cursor_isFunctionInlined = (clang_Cursor_isFunctionInlinedPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_isFunctionInlined(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1isVolatileQualifiedType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_isVolatileQualifiedTypePROC clang_isVolatileQualifiedType = (clang_isVolatileQualifiedTypePROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_isVolatileQualifiedType(*T);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1isRestrictQualifiedType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_isRestrictQualifiedTypePROC clang_isRestrictQualifiedType = (clang_isRestrictQualifiedTypePROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_isRestrictQualifiedType(*T);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getAddressSpace(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_getAddressSpacePROC clang_getAddressSpace = (clang_getAddressSpacePROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getAddressSpace(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTypedefName(JNIEnv *__env, jclass clazz, jlong CTAddress, jlong __functionAddress, jlong __result) {
    clang_getTypedefNamePROC clang_getTypedefName = (clang_getTypedefNamePROC)(uintptr_t)__functionAddress;
    CXType *CT = (CXType *)(uintptr_t)CTAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getTypedefName(*CT);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getPointeeType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress, jlong __result) {
    clang_getPointeeTypePROC clang_getPointeeType = (clang_getPointeeTypePROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_getPointeeType(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getUnqualifiedType(JNIEnv *__env, jclass clazz, jlong CTAddress, jlong __functionAddress, jlong __result) {
    clang_getUnqualifiedTypePROC clang_getUnqualifiedType = (clang_getUnqualifiedTypePROC)(uintptr_t)__functionAddress;
    CXType *CT = (CXType *)(uintptr_t)CTAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_getUnqualifiedType(*CT);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getNonReferenceType(JNIEnv *__env, jclass clazz, jlong CTAddress, jlong __functionAddress, jlong __result) {
    clang_getNonReferenceTypePROC clang_getNonReferenceType = (clang_getNonReferenceTypePROC)(uintptr_t)__functionAddress;
    CXType *CT = (CXType *)(uintptr_t)CTAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_getNonReferenceType(*CT);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTypeDeclaration(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress, jlong __result) {
    clang_getTypeDeclarationPROC clang_getTypeDeclaration = (clang_getTypeDeclarationPROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(uintptr_t)__result) = clang_getTypeDeclaration(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getDeclObjCTypeEncoding(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_getDeclObjCTypeEncodingPROC clang_getDeclObjCTypeEncoding = (clang_getDeclObjCTypeEncodingPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getDeclObjCTypeEncoding(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getObjCEncoding(JNIEnv *__env, jclass clazz, jlong typeAddress, jlong __functionAddress, jlong __result) {
    clang_Type_getObjCEncodingPROC clang_Type_getObjCEncoding = (clang_Type_getObjCEncodingPROC)(uintptr_t)__functionAddress;
    CXType *type = (CXType *)(uintptr_t)typeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_Type_getObjCEncoding(*type);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTypeKindSpelling(JNIEnv *__env, jclass clazz, jint K, jlong __functionAddress, jlong __result) {
    clang_getTypeKindSpellingPROC clang_getTypeKindSpelling = (clang_getTypeKindSpellingPROC)(uintptr_t)__functionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getTypeKindSpelling(K);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getFunctionTypeCallingConv(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_getFunctionTypeCallingConvPROC clang_getFunctionTypeCallingConv = (clang_getFunctionTypeCallingConvPROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getFunctionTypeCallingConv(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getResultType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress, jlong __result) {
    clang_getResultTypePROC clang_getResultType = (clang_getResultTypePROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_getResultType(*T);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getExceptionSpecificationType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_getExceptionSpecificationTypePROC clang_getExceptionSpecificationType = (clang_getExceptionSpecificationTypePROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getExceptionSpecificationType(*T);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getNumArgTypes(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_getNumArgTypesPROC clang_getNumArgTypes = (clang_getNumArgTypesPROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getNumArgTypes(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getArgType(JNIEnv *__env, jclass clazz, jlong TAddress, jint i, jlong __functionAddress, jlong __result) {
    clang_getArgTypePROC clang_getArgType = (clang_getArgTypePROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_getArgType(*T, i);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getObjCObjectBaseType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress, jlong __result) {
    clang_Type_getObjCObjectBaseTypePROC clang_Type_getObjCObjectBaseType = (clang_Type_getObjCObjectBaseTypePROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_Type_getObjCObjectBaseType(*T);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getNumObjCProtocolRefs(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_Type_getNumObjCProtocolRefsPROC clang_Type_getNumObjCProtocolRefs = (clang_Type_getNumObjCProtocolRefsPROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Type_getNumObjCProtocolRefs(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getObjCProtocolDecl(JNIEnv *__env, jclass clazz, jlong TAddress, jint i, jlong __functionAddress, jlong __result) {
    clang_Type_getObjCProtocolDeclPROC clang_Type_getObjCProtocolDecl = (clang_Type_getObjCProtocolDeclPROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(uintptr_t)__result) = clang_Type_getObjCProtocolDecl(*T, i);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getNumObjCTypeArgs(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_Type_getNumObjCTypeArgsPROC clang_Type_getNumObjCTypeArgs = (clang_Type_getNumObjCTypeArgsPROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Type_getNumObjCTypeArgs(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getObjCTypeArg(JNIEnv *__env, jclass clazz, jlong TAddress, jint i, jlong __functionAddress, jlong __result) {
    clang_Type_getObjCTypeArgPROC clang_Type_getObjCTypeArg = (clang_Type_getObjCTypeArgPROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_Type_getObjCTypeArg(*T, i);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1isFunctionTypeVariadic(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_isFunctionTypeVariadicPROC clang_isFunctionTypeVariadic = (clang_isFunctionTypeVariadicPROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_isFunctionTypeVariadic(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorResultType(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorResultTypePROC clang_getCursorResultType = (clang_getCursorResultTypePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_getCursorResultType(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorExceptionSpecificationType(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_getCursorExceptionSpecificationTypePROC clang_getCursorExceptionSpecificationType = (clang_getCursorExceptionSpecificationTypePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getCursorExceptionSpecificationType(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1isPODType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_isPODTypePROC clang_isPODType = (clang_isPODTypePROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_isPODType(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getElementType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress, jlong __result) {
    clang_getElementTypePROC clang_getElementType = (clang_getElementTypePROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_getElementType(*T);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getNumElements(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_getNumElementsPROC clang_getNumElements = (clang_getNumElementsPROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getNumElements(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getArrayElementType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress, jlong __result) {
    clang_getArrayElementTypePROC clang_getArrayElementType = (clang_getArrayElementTypePROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_getArrayElementType(*T);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getArraySize(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_getArraySizePROC clang_getArraySize = (clang_getArraySizePROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getArraySize(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getNamedType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress, jlong __result) {
    clang_Type_getNamedTypePROC clang_Type_getNamedType = (clang_Type_getNamedTypePROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_Type_getNamedType(*T);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1isTransparentTagTypedef(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_Type_isTransparentTagTypedefPROC clang_Type_isTransparentTagTypedef = (clang_Type_isTransparentTagTypedefPROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Type_isTransparentTagTypedef(*T);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getNullability(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_Type_getNullabilityPROC clang_Type_getNullability = (clang_Type_getNullabilityPROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Type_getNullability(*T);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getAlignOf(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_Type_getAlignOfPROC clang_Type_getAlignOf = (clang_Type_getAlignOfPROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Type_getAlignOf(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getClassType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress, jlong __result) {
    clang_Type_getClassTypePROC clang_Type_getClassType = (clang_Type_getClassTypePROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_Type_getClassType(*T);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getSizeOf(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_Type_getSizeOfPROC clang_Type_getSizeOf = (clang_Type_getSizeOfPROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Type_getSizeOf(*T);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getOffsetOf(JNIEnv *__env, jclass clazz, jlong TAddress, jlong SAddress, jlong __functionAddress) {
    clang_Type_getOffsetOfPROC clang_Type_getOffsetOf = (clang_Type_getOffsetOfPROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    uintptr_t S = (uintptr_t)SAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Type_getOffsetOf(*T, S);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getModifiedType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress, jlong __result) {
    clang_Type_getModifiedTypePROC clang_Type_getModifiedType = (clang_Type_getModifiedTypePROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_Type_getModifiedType(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getValueType(JNIEnv *__env, jclass clazz, jlong CTAddress, jlong __functionAddress, jlong __result) {
    clang_Type_getValueTypePROC clang_Type_getValueType = (clang_Type_getValueTypePROC)(uintptr_t)__functionAddress;
    CXType *CT = (CXType *)(uintptr_t)CTAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_Type_getValueType(*CT);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getOffsetOfField(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_getOffsetOfFieldPROC clang_Cursor_getOffsetOfField = (clang_Cursor_getOffsetOfFieldPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_getOffsetOfField(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isAnonymous(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_isAnonymousPROC clang_Cursor_isAnonymous = (clang_Cursor_isAnonymousPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_isAnonymous(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isAnonymousRecordDecl(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_isAnonymousRecordDeclPROC clang_Cursor_isAnonymousRecordDecl = (clang_Cursor_isAnonymousRecordDeclPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_isAnonymousRecordDecl(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isInlineNamespace(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_isInlineNamespacePROC clang_Cursor_isInlineNamespace = (clang_Cursor_isInlineNamespacePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_isInlineNamespace(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getNumTemplateArguments(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_Type_getNumTemplateArgumentsPROC clang_Type_getNumTemplateArguments = (clang_Type_getNumTemplateArgumentsPROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Type_getNumTemplateArguments(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getTemplateArgumentAsType(JNIEnv *__env, jclass clazz, jlong TAddress, jint i, jlong __functionAddress, jlong __result) {
    clang_Type_getTemplateArgumentAsTypePROC clang_Type_getTemplateArgumentAsType = (clang_Type_getTemplateArgumentAsTypePROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_Type_getTemplateArgumentAsType(*T, i);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getCXXRefQualifier(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_Type_getCXXRefQualifierPROC clang_Type_getCXXRefQualifier = (clang_Type_getCXXRefQualifierPROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Type_getCXXRefQualifier(*T);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1isVirtualBase(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_isVirtualBasePROC clang_isVirtualBase = (clang_isVirtualBasePROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_isVirtualBase(*cursor);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getOffsetOfBase(JNIEnv *__env, jclass clazz, jlong ParentAddress, jlong BaseAddress, jlong __functionAddress) {
    clang_getOffsetOfBasePROC clang_getOffsetOfBase = (clang_getOffsetOfBasePROC)(uintptr_t)__functionAddress;
    CXCursor *Parent = (CXCursor *)(uintptr_t)ParentAddress;
    CXCursor *Base = (CXCursor *)(uintptr_t)BaseAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getOffsetOfBase(*Parent, *Base);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCXXAccessSpecifier(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getCXXAccessSpecifierPROC clang_getCXXAccessSpecifier = (clang_getCXXAccessSpecifierPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getCXXAccessSpecifier(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getBinaryOpcode(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_Cursor_getBinaryOpcodePROC clang_Cursor_getBinaryOpcode = (clang_Cursor_getBinaryOpcodePROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_getBinaryOpcode(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getBinaryOpcodeStr(JNIEnv *__env, jclass clazz, jint Op, jlong __functionAddress, jlong __result) {
    clang_Cursor_getBinaryOpcodeStrPROC clang_Cursor_getBinaryOpcodeStr = (clang_Cursor_getBinaryOpcodeStrPROC)(uintptr_t)__functionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_Cursor_getBinaryOpcodeStr(Op);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getStorageClass(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_Cursor_getStorageClassPROC clang_Cursor_getStorageClass = (clang_Cursor_getStorageClassPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_getStorageClass(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getNumOverloadedDecls(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getNumOverloadedDeclsPROC clang_getNumOverloadedDecls = (clang_getNumOverloadedDeclsPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getNumOverloadedDecls(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getOverloadedDecl(JNIEnv *__env, jclass clazz, jlong cursorAddress, jint index, jlong __functionAddress, jlong __result) {
    clang_getOverloadedDeclPROC clang_getOverloadedDecl = (clang_getOverloadedDeclPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(uintptr_t)__result) = clang_getOverloadedDecl(*cursor, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getIBOutletCollectionType(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getIBOutletCollectionTypePROC clang_getIBOutletCollectionType = (clang_getIBOutletCollectionTypePROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_getIBOutletCollectionType(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1visitChildren(JNIEnv *__env, jclass clazz, jlong parentAddress, jlong visitorAddress, jlong client_dataAddress, jlong __functionAddress) {
    clang_visitChildrenPROC clang_visitChildren = (clang_visitChildrenPROC)(uintptr_t)__functionAddress;
    CXCursor *parent = (CXCursor *)(uintptr_t)parentAddress;
    uintptr_t visitor = (uintptr_t)visitorAddress;
    uintptr_t client_data = (uintptr_t)client_dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_visitChildren(*parent, visitor, client_data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorUSR(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorUSRPROC clang_getCursorUSR = (clang_getCursorUSRPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getCursorUSR(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1constructUSR_1ObjCClass(JNIEnv *__env, jclass clazz, jlong class_nameAddress, jlong __functionAddress, jlong __result) {
    clang_constructUSR_ObjCClassPROC clang_constructUSR_ObjCClass = (clang_constructUSR_ObjCClassPROC)(uintptr_t)__functionAddress;
    uintptr_t class_name = (uintptr_t)class_nameAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_constructUSR_ObjCClass(class_name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1constructUSR_1ObjCCategory(JNIEnv *__env, jclass clazz, jlong class_nameAddress, jlong category_nameAddress, jlong __functionAddress, jlong __result) {
    clang_constructUSR_ObjCCategoryPROC clang_constructUSR_ObjCCategory = (clang_constructUSR_ObjCCategoryPROC)(uintptr_t)__functionAddress;
    uintptr_t class_name = (uintptr_t)class_nameAddress;
    uintptr_t category_name = (uintptr_t)category_nameAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_constructUSR_ObjCCategory(class_name, category_name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1constructUSR_1ObjCProtocol(JNIEnv *__env, jclass clazz, jlong protocol_nameAddress, jlong __functionAddress, jlong __result) {
    clang_constructUSR_ObjCProtocolPROC clang_constructUSR_ObjCProtocol = (clang_constructUSR_ObjCProtocolPROC)(uintptr_t)__functionAddress;
    uintptr_t protocol_name = (uintptr_t)protocol_nameAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_constructUSR_ObjCProtocol(protocol_name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1constructUSR_1ObjCIvar(JNIEnv *__env, jclass clazz, jlong nameAddress, jlong classUSRAddress, jlong __functionAddress, jlong __result) {
    clang_constructUSR_ObjCIvarPROC clang_constructUSR_ObjCIvar = (clang_constructUSR_ObjCIvarPROC)(uintptr_t)__functionAddress;
    uintptr_t name = (uintptr_t)nameAddress;
    CXString *classUSR = (CXString *)(uintptr_t)classUSRAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_constructUSR_ObjCIvar(name, *classUSR);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1constructUSR_1ObjCMethod(JNIEnv *__env, jclass clazz, jlong nameAddress, jint isInstanceMethod, jlong classUSRAddress, jlong __functionAddress, jlong __result) {
    clang_constructUSR_ObjCMethodPROC clang_constructUSR_ObjCMethod = (clang_constructUSR_ObjCMethodPROC)(uintptr_t)__functionAddress;
    uintptr_t name = (uintptr_t)nameAddress;
    CXString *classUSR = (CXString *)(uintptr_t)classUSRAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_constructUSR_ObjCMethod(name, isInstanceMethod, *classUSR);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1constructUSR_1ObjCProperty(JNIEnv *__env, jclass clazz, jlong propertyAddress, jlong classUSRAddress, jlong __functionAddress, jlong __result) {
    clang_constructUSR_ObjCPropertyPROC clang_constructUSR_ObjCProperty = (clang_constructUSR_ObjCPropertyPROC)(uintptr_t)__functionAddress;
    uintptr_t property = (uintptr_t)propertyAddress;
    CXString *classUSR = (CXString *)(uintptr_t)classUSRAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_constructUSR_ObjCProperty(property, *classUSR);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorSpelling(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorSpellingPROC clang_getCursorSpelling = (clang_getCursorSpellingPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getCursorSpelling(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getSpellingNameRange(JNIEnv *__env, jclass clazz, jlong cursorAddress, jint pieceIndex, jint options, jlong __functionAddress, jlong __result) {
    clang_Cursor_getSpellingNameRangePROC clang_Cursor_getSpellingNameRange = (clang_Cursor_getSpellingNameRangePROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceRange*)(uintptr_t)__result) = clang_Cursor_getSpellingNameRange(*cursor, pieceIndex, options);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorPrintingPolicy(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getCursorPrintingPolicyPROC clang_getCursorPrintingPolicy = (clang_getCursorPrintingPolicyPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_getCursorPrintingPolicy(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorPrettyPrinted(JNIEnv *__env, jclass clazz, jlong CursorAddress, jlong PolicyAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorPrettyPrintedPROC clang_getCursorPrettyPrinted = (clang_getCursorPrettyPrintedPROC)(uintptr_t)__functionAddress;
    CXCursor *Cursor = (CXCursor *)(uintptr_t)CursorAddress;
    uintptr_t Policy = (uintptr_t)PolicyAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getCursorPrettyPrinted(*Cursor, Policy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTypePrettyPrinted(JNIEnv *__env, jclass clazz, jlong CTAddress, jlong cxPolicyAddress, jlong __functionAddress, jlong __result) {
    clang_getTypePrettyPrintedPROC clang_getTypePrettyPrinted = (clang_getTypePrettyPrintedPROC)(uintptr_t)__functionAddress;
    CXType *CT = (CXType *)(uintptr_t)CTAddress;
    uintptr_t cxPolicy = (uintptr_t)cxPolicyAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getTypePrettyPrinted(*CT, cxPolicy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getFullyQualifiedName(JNIEnv *__env, jclass clazz, jlong CTAddress, jlong PolicyAddress, jint WithGlobalNsPrefix, jlong __functionAddress, jlong __result) {
    clang_getFullyQualifiedNamePROC clang_getFullyQualifiedName = (clang_getFullyQualifiedNamePROC)(uintptr_t)__functionAddress;
    CXType *CT = (CXType *)(uintptr_t)CTAddress;
    uintptr_t Policy = (uintptr_t)PolicyAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getFullyQualifiedName(*CT, Policy, WithGlobalNsPrefix);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorDisplayName(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorDisplayNamePROC clang_getCursorDisplayName = (clang_getCursorDisplayNamePROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getCursorDisplayName(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorReferenced(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorReferencedPROC clang_getCursorReferenced = (clang_getCursorReferencedPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(uintptr_t)__result) = clang_getCursorReferenced(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorDefinition(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorDefinitionPROC clang_getCursorDefinition = (clang_getCursorDefinitionPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(uintptr_t)__result) = clang_getCursorDefinition(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1isCursorDefinition(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_isCursorDefinitionPROC clang_isCursorDefinition = (clang_isCursorDefinitionPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_isCursorDefinition(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCanonicalCursor(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getCanonicalCursorPROC clang_getCanonicalCursor = (clang_getCanonicalCursorPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(uintptr_t)__result) = clang_getCanonicalCursor(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getObjCSelectorIndex(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_Cursor_getObjCSelectorIndexPROC clang_Cursor_getObjCSelectorIndex = (clang_Cursor_getObjCSelectorIndexPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_getObjCSelectorIndex(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isDynamicCall(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_isDynamicCallPROC clang_Cursor_isDynamicCall = (clang_Cursor_isDynamicCallPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_isDynamicCall(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getReceiverType(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_Cursor_getReceiverTypePROC clang_Cursor_getReceiverType = (clang_Cursor_getReceiverTypePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(uintptr_t)__result) = clang_Cursor_getReceiverType(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getObjCPropertyAttributes(JNIEnv *__env, jclass clazz, jlong CAddress, jint reserved, jlong __functionAddress) {
    clang_Cursor_getObjCPropertyAttributesPROC clang_Cursor_getObjCPropertyAttributes = (clang_Cursor_getObjCPropertyAttributesPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_getObjCPropertyAttributes(*C, reserved);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getObjCPropertyGetterName(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_Cursor_getObjCPropertyGetterNamePROC clang_Cursor_getObjCPropertyGetterName = (clang_Cursor_getObjCPropertyGetterNamePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_Cursor_getObjCPropertyGetterName(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getObjCPropertySetterName(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_Cursor_getObjCPropertySetterNamePROC clang_Cursor_getObjCPropertySetterName = (clang_Cursor_getObjCPropertySetterNamePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_Cursor_getObjCPropertySetterName(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getObjCDeclQualifiers(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_getObjCDeclQualifiersPROC clang_Cursor_getObjCDeclQualifiers = (clang_Cursor_getObjCDeclQualifiersPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_getObjCDeclQualifiers(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isObjCOptional(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_isObjCOptionalPROC clang_Cursor_isObjCOptional = (clang_Cursor_isObjCOptionalPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_isObjCOptional(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isVariadic(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_isVariadicPROC clang_Cursor_isVariadic = (clang_Cursor_isVariadicPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_isVariadic(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isExternalSymbol(JNIEnv *__env, jclass clazz, jlong CAddress, jlong languageAddress, jlong definedInAddress, jlong isGeneratedAddress, jlong __functionAddress) {
    clang_Cursor_isExternalSymbolPROC clang_Cursor_isExternalSymbol = (clang_Cursor_isExternalSymbolPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    uintptr_t language = (uintptr_t)languageAddress;
    uintptr_t definedIn = (uintptr_t)definedInAddress;
    uintptr_t isGenerated = (uintptr_t)isGeneratedAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_isExternalSymbol(*C, language, definedIn, isGenerated);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getCommentRange(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_Cursor_getCommentRangePROC clang_Cursor_getCommentRange = (clang_Cursor_getCommentRangePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceRange*)(uintptr_t)__result) = clang_Cursor_getCommentRange(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getRawCommentText(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_Cursor_getRawCommentTextPROC clang_Cursor_getRawCommentText = (clang_Cursor_getRawCommentTextPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_Cursor_getRawCommentText(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getBriefCommentText(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_Cursor_getBriefCommentTextPROC clang_Cursor_getBriefCommentText = (clang_Cursor_getBriefCommentTextPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_Cursor_getBriefCommentText(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getMangling(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_Cursor_getManglingPROC clang_Cursor_getMangling = (clang_Cursor_getManglingPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_Cursor_getMangling(*cursor);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getCXXManglings(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_Cursor_getCXXManglingsPROC clang_Cursor_getCXXManglings = (clang_Cursor_getCXXManglingsPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_Cursor_getCXXManglings(*cursor);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getObjCManglings(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_Cursor_getObjCManglingsPROC clang_Cursor_getObjCManglings = (clang_Cursor_getObjCManglingsPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_Cursor_getObjCManglings(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getGCCAssemblyTemplate(JNIEnv *__env, jclass clazz, jlong CursorAddress, jlong __functionAddress, jlong __result) {
    clang_Cursor_getGCCAssemblyTemplatePROC clang_Cursor_getGCCAssemblyTemplate = (clang_Cursor_getGCCAssemblyTemplatePROC)(uintptr_t)__functionAddress;
    CXCursor *Cursor = (CXCursor *)(uintptr_t)CursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_Cursor_getGCCAssemblyTemplate(*Cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isGCCAssemblyHasGoto(JNIEnv *__env, jclass clazz, jlong CursorAddress, jlong __functionAddress) {
    clang_Cursor_isGCCAssemblyHasGotoPROC clang_Cursor_isGCCAssemblyHasGoto = (clang_Cursor_isGCCAssemblyHasGotoPROC)(uintptr_t)__functionAddress;
    CXCursor *Cursor = (CXCursor *)(uintptr_t)CursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_isGCCAssemblyHasGoto(*Cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getGCCAssemblyNumOutputs(JNIEnv *__env, jclass clazz, jlong CursorAddress, jlong __functionAddress) {
    clang_Cursor_getGCCAssemblyNumOutputsPROC clang_Cursor_getGCCAssemblyNumOutputs = (clang_Cursor_getGCCAssemblyNumOutputsPROC)(uintptr_t)__functionAddress;
    CXCursor *Cursor = (CXCursor *)(uintptr_t)CursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_getGCCAssemblyNumOutputs(*Cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getGCCAssemblyNumInputs(JNIEnv *__env, jclass clazz, jlong CursorAddress, jlong __functionAddress) {
    clang_Cursor_getGCCAssemblyNumInputsPROC clang_Cursor_getGCCAssemblyNumInputs = (clang_Cursor_getGCCAssemblyNumInputsPROC)(uintptr_t)__functionAddress;
    CXCursor *Cursor = (CXCursor *)(uintptr_t)CursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_getGCCAssemblyNumInputs(*Cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getGCCAssemblyInput(JNIEnv *__env, jclass clazz, jlong CursorAddress, jint Index, jlong ConstraintAddress, jlong ExprAddress, jlong __functionAddress) {
    clang_Cursor_getGCCAssemblyInputPROC clang_Cursor_getGCCAssemblyInput = (clang_Cursor_getGCCAssemblyInputPROC)(uintptr_t)__functionAddress;
    CXCursor *Cursor = (CXCursor *)(uintptr_t)CursorAddress;
    uintptr_t Constraint = (uintptr_t)ConstraintAddress;
    uintptr_t Expr = (uintptr_t)ExprAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_getGCCAssemblyInput(*Cursor, Index, Constraint, Expr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getGCCAssemblyOutput(JNIEnv *__env, jclass clazz, jlong CursorAddress, jint Index, jlong ConstraintAddress, jlong ExprAddress, jlong __functionAddress) {
    clang_Cursor_getGCCAssemblyOutputPROC clang_Cursor_getGCCAssemblyOutput = (clang_Cursor_getGCCAssemblyOutputPROC)(uintptr_t)__functionAddress;
    CXCursor *Cursor = (CXCursor *)(uintptr_t)CursorAddress;
    uintptr_t Constraint = (uintptr_t)ConstraintAddress;
    uintptr_t Expr = (uintptr_t)ExprAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_getGCCAssemblyOutput(*Cursor, Index, Constraint, Expr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getGCCAssemblyNumClobbers(JNIEnv *__env, jclass clazz, jlong CursorAddress, jlong __functionAddress) {
    clang_Cursor_getGCCAssemblyNumClobbersPROC clang_Cursor_getGCCAssemblyNumClobbers = (clang_Cursor_getGCCAssemblyNumClobbersPROC)(uintptr_t)__functionAddress;
    CXCursor *Cursor = (CXCursor *)(uintptr_t)CursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_getGCCAssemblyNumClobbers(*Cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getGCCAssemblyClobber(JNIEnv *__env, jclass clazz, jlong CursorAddress, jint Index, jlong __functionAddress, jlong __result) {
    clang_Cursor_getGCCAssemblyClobberPROC clang_Cursor_getGCCAssemblyClobber = (clang_Cursor_getGCCAssemblyClobberPROC)(uintptr_t)__functionAddress;
    CXCursor *Cursor = (CXCursor *)(uintptr_t)CursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_Cursor_getGCCAssemblyClobber(*Cursor, Index);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isGCCAssemblyVolatile(JNIEnv *__env, jclass clazz, jlong CursorAddress, jlong __functionAddress) {
    clang_Cursor_isGCCAssemblyVolatilePROC clang_Cursor_isGCCAssemblyVolatile = (clang_Cursor_isGCCAssemblyVolatilePROC)(uintptr_t)__functionAddress;
    CXCursor *Cursor = (CXCursor *)(uintptr_t)CursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Cursor_isGCCAssemblyVolatile(*Cursor);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getModule(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_getModulePROC clang_Cursor_getModule = (clang_Cursor_getModulePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_Cursor_getModule(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Module_1getName(JNIEnv *__env, jclass clazz, jlong ModuleAddress, jlong __functionAddress, jlong __result) {
    clang_Module_getNamePROC clang_Module_getName = (clang_Module_getNamePROC)(uintptr_t)__functionAddress;
    uintptr_t Module = (uintptr_t)ModuleAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_Module_getName(Module);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Module_1getFullName(JNIEnv *__env, jclass clazz, jlong ModuleAddress, jlong __functionAddress, jlong __result) {
    clang_Module_getFullNamePROC clang_Module_getFullName = (clang_Module_getFullNamePROC)(uintptr_t)__functionAddress;
    uintptr_t Module = (uintptr_t)ModuleAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_Module_getFullName(Module);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXConstructor_1isConvertingConstructor(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXConstructor_isConvertingConstructorPROC clang_CXXConstructor_isConvertingConstructor = (clang_CXXConstructor_isConvertingConstructorPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_CXXConstructor_isConvertingConstructor(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXConstructor_1isCopyConstructor(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXConstructor_isCopyConstructorPROC clang_CXXConstructor_isCopyConstructor = (clang_CXXConstructor_isCopyConstructorPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_CXXConstructor_isCopyConstructor(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXConstructor_1isDefaultConstructor(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXConstructor_isDefaultConstructorPROC clang_CXXConstructor_isDefaultConstructor = (clang_CXXConstructor_isDefaultConstructorPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_CXXConstructor_isDefaultConstructor(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXConstructor_1isMoveConstructor(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXConstructor_isMoveConstructorPROC clang_CXXConstructor_isMoveConstructor = (clang_CXXConstructor_isMoveConstructorPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_CXXConstructor_isMoveConstructor(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXField_1isMutable(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXField_isMutablePROC clang_CXXField_isMutable = (clang_CXXField_isMutablePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_CXXField_isMutable(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXMethod_1isDefaulted(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXMethod_isDefaultedPROC clang_CXXMethod_isDefaulted = (clang_CXXMethod_isDefaultedPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_CXXMethod_isDefaulted(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXMethod_1isDeleted(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXMethod_isDeletedPROC clang_CXXMethod_isDeleted = (clang_CXXMethod_isDeletedPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_CXXMethod_isDeleted(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXMethod_1isPureVirtual(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXMethod_isPureVirtualPROC clang_CXXMethod_isPureVirtual = (clang_CXXMethod_isPureVirtualPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_CXXMethod_isPureVirtual(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXMethod_1isStatic(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXMethod_isStaticPROC clang_CXXMethod_isStatic = (clang_CXXMethod_isStaticPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_CXXMethod_isStatic(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXMethod_1isVirtual(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXMethod_isVirtualPROC clang_CXXMethod_isVirtual = (clang_CXXMethod_isVirtualPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_CXXMethod_isVirtual(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXMethod_1isCopyAssignmentOperator(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXMethod_isCopyAssignmentOperatorPROC clang_CXXMethod_isCopyAssignmentOperator = (clang_CXXMethod_isCopyAssignmentOperatorPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_CXXMethod_isCopyAssignmentOperator(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXMethod_1isMoveAssignmentOperator(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXMethod_isMoveAssignmentOperatorPROC clang_CXXMethod_isMoveAssignmentOperator = (clang_CXXMethod_isMoveAssignmentOperatorPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_CXXMethod_isMoveAssignmentOperator(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXMethod_1isExplicit(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXMethod_isExplicitPROC clang_CXXMethod_isExplicit = (clang_CXXMethod_isExplicitPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_CXXMethod_isExplicit(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXRecord_1isAbstract(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXRecord_isAbstractPROC clang_CXXRecord_isAbstract = (clang_CXXRecord_isAbstractPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_CXXRecord_isAbstract(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1EnumDecl_1isScoped(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_EnumDecl_isScopedPROC clang_EnumDecl_isScoped = (clang_EnumDecl_isScopedPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_EnumDecl_isScoped(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXMethod_1isConst(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXMethod_isConstPROC clang_CXXMethod_isConst = (clang_CXXMethod_isConstPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_CXXMethod_isConst(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTemplateCursorKind(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_getTemplateCursorKindPROC clang_getTemplateCursorKind = (clang_getTemplateCursorKindPROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getTemplateCursorKind(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getSpecializedCursorTemplate(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_getSpecializedCursorTemplatePROC clang_getSpecializedCursorTemplate = (clang_getSpecializedCursorTemplatePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(uintptr_t)__result) = clang_getSpecializedCursorTemplate(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorReferenceNameRange(JNIEnv *__env, jclass clazz, jlong CAddress, jint NameFlags, jint PieceIndex, jlong __functionAddress, jlong __result) {
    clang_getCursorReferenceNameRangePROC clang_getCursorReferenceNameRange = (clang_getCursorReferenceNameRangePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceRange*)(uintptr_t)__result) = clang_getCursorReferenceNameRange(*C, NameFlags, PieceIndex);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getToken(JNIEnv *__env, jclass clazz, jlong TUAddress, jlong LocationAddress, jlong __functionAddress) {
    clang_getTokenPROC clang_getToken = (clang_getTokenPROC)(uintptr_t)__functionAddress;
    uintptr_t TU = (uintptr_t)TUAddress;
    CXSourceLocation *Location = (CXSourceLocation *)(uintptr_t)LocationAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_getToken(TU, *Location);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTokenKind(JNIEnv *__env, jclass clazz, jlong tokenAddress, jlong __functionAddress) {
    clang_getTokenKindPROC clang_getTokenKind = (clang_getTokenKindPROC)(uintptr_t)__functionAddress;
    CXToken *token = (CXToken *)(uintptr_t)tokenAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getTokenKind(*token);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTokenSpelling(JNIEnv *__env, jclass clazz, jlong TUAddress, jlong tokenAddress, jlong __functionAddress, jlong __result) {
    clang_getTokenSpellingPROC clang_getTokenSpelling = (clang_getTokenSpellingPROC)(uintptr_t)__functionAddress;
    uintptr_t TU = (uintptr_t)TUAddress;
    CXToken *token = (CXToken *)(uintptr_t)tokenAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getTokenSpelling(TU, *token);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTokenLocation(JNIEnv *__env, jclass clazz, jlong TUAddress, jlong tokenAddress, jlong __functionAddress, jlong __result) {
    clang_getTokenLocationPROC clang_getTokenLocation = (clang_getTokenLocationPROC)(uintptr_t)__functionAddress;
    uintptr_t TU = (uintptr_t)TUAddress;
    CXToken *token = (CXToken *)(uintptr_t)tokenAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceLocation*)(uintptr_t)__result) = clang_getTokenLocation(TU, *token);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTokenExtent(JNIEnv *__env, jclass clazz, jlong TUAddress, jlong tokenAddress, jlong __functionAddress, jlong __result) {
    clang_getTokenExtentPROC clang_getTokenExtent = (clang_getTokenExtentPROC)(uintptr_t)__functionAddress;
    uintptr_t TU = (uintptr_t)TUAddress;
    CXToken *token = (CXToken *)(uintptr_t)tokenAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceRange*)(uintptr_t)__result) = clang_getTokenExtent(TU, *token);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1tokenize(JNIEnv *__env, jclass clazz, jlong TUAddress, jlong RangeAddress, jlong TokensAddress, jlong NumTokensAddress, jlong __functionAddress) {
    clang_tokenizePROC clang_tokenize = (clang_tokenizePROC)(uintptr_t)__functionAddress;
    uintptr_t TU = (uintptr_t)TUAddress;
    CXSourceRange *Range = (CXSourceRange *)(uintptr_t)RangeAddress;
    uintptr_t Tokens = (uintptr_t)TokensAddress;
    uintptr_t NumTokens = (uintptr_t)NumTokensAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_tokenize(TU, *Range, Tokens, NumTokens);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorKindSpelling(JNIEnv *__env, jclass clazz, jint Kind, jlong __functionAddress, jlong __result) {
    clang_getCursorKindSpellingPROC clang_getCursorKindSpelling = (clang_getCursorKindSpellingPROC)(uintptr_t)__functionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getCursorKindSpelling(Kind);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getDefinitionSpellingAndExtent(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong startBufAddress, jlong endBufAddress, jlong startLineAddress, jlong startColumnAddress, jlong endLineAddress, jlong endColumnAddress, jlong __functionAddress) {
    clang_getDefinitionSpellingAndExtentPROC clang_getDefinitionSpellingAndExtent = (clang_getDefinitionSpellingAndExtentPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    uintptr_t startBuf = (uintptr_t)startBufAddress;
    uintptr_t endBuf = (uintptr_t)endBufAddress;
    uintptr_t startLine = (uintptr_t)startLineAddress;
    uintptr_t startColumn = (uintptr_t)startColumnAddress;
    uintptr_t endLine = (uintptr_t)endLineAddress;
    uintptr_t endColumn = (uintptr_t)endColumnAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_getDefinitionSpellingAndExtent(*cursor, startBuf, endBuf, startLine, startColumn, endLine, endColumn);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCompletionChunkText(JNIEnv *__env, jclass clazz, jlong completion_stringAddress, jint chunk_number, jlong __functionAddress, jlong __result) {
    clang_getCompletionChunkTextPROC clang_getCompletionChunkText = (clang_getCompletionChunkTextPROC)(uintptr_t)__functionAddress;
    uintptr_t completion_string = (uintptr_t)completion_stringAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getCompletionChunkText(completion_string, chunk_number);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCompletionAnnotation(JNIEnv *__env, jclass clazz, jlong completion_stringAddress, jint annotation_number, jlong __functionAddress, jlong __result) {
    clang_getCompletionAnnotationPROC clang_getCompletionAnnotation = (clang_getCompletionAnnotationPROC)(uintptr_t)__functionAddress;
    uintptr_t completion_string = (uintptr_t)completion_stringAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getCompletionAnnotation(completion_string, annotation_number);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCompletionParent(JNIEnv *__env, jclass clazz, jlong completion_stringAddress, jlong kindAddress, jlong __functionAddress, jlong __result) {
    clang_getCompletionParentPROC clang_getCompletionParent = (clang_getCompletionParentPROC)(uintptr_t)__functionAddress;
    uintptr_t completion_string = (uintptr_t)completion_stringAddress;
    uintptr_t kind = (uintptr_t)kindAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getCompletionParent(completion_string, kind);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCompletionBriefComment(JNIEnv *__env, jclass clazz, jlong completion_stringAddress, jlong __functionAddress, jlong __result) {
    clang_getCompletionBriefCommentPROC clang_getCompletionBriefComment = (clang_getCompletionBriefCommentPROC)(uintptr_t)__functionAddress;
    uintptr_t completion_string = (uintptr_t)completion_stringAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getCompletionBriefComment(completion_string);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorCompletionString(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getCursorCompletionStringPROC clang_getCursorCompletionString = (clang_getCursorCompletionStringPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_getCursorCompletionString(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCompletionFixIt(JNIEnv *__env, jclass clazz, jlong resultsAddress, jint completion_index, jint fixit_index, jlong replacement_rangeAddress, jlong __functionAddress, jlong __result) {
    clang_getCompletionFixItPROC clang_getCompletionFixIt = (clang_getCompletionFixItPROC)(uintptr_t)__functionAddress;
    uintptr_t results = (uintptr_t)resultsAddress;
    uintptr_t replacement_range = (uintptr_t)replacement_rangeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getCompletionFixIt(results, completion_index, fixit_index, replacement_range);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1codeCompleteGetContainerUSR(JNIEnv *__env, jclass clazz, jlong ResultsAddress, jlong __functionAddress, jlong __result) {
    clang_codeCompleteGetContainerUSRPROC clang_codeCompleteGetContainerUSR = (clang_codeCompleteGetContainerUSRPROC)(uintptr_t)__functionAddress;
    uintptr_t Results = (uintptr_t)ResultsAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_codeCompleteGetContainerUSR(Results);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1codeCompleteGetObjCSelector(JNIEnv *__env, jclass clazz, jlong ResultsAddress, jlong __functionAddress, jlong __result) {
    clang_codeCompleteGetObjCSelectorPROC clang_codeCompleteGetObjCSelector = (clang_codeCompleteGetObjCSelectorPROC)(uintptr_t)__functionAddress;
    uintptr_t Results = (uintptr_t)ResultsAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_codeCompleteGetObjCSelector(Results);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getClangVersion(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong __result) {
    clang_getClangVersionPROC clang_getClangVersion = (clang_getClangVersionPROC)(uintptr_t)__functionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getClangVersion();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1Evaluate(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_EvaluatePROC clang_Cursor_Evaluate = (clang_Cursor_EvaluatePROC)(uintptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(uintptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_Cursor_Evaluate(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1findReferencesInFile(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong fileAddress, jlong visitorAddress, jlong __functionAddress) {
    clang_findReferencesInFilePROC clang_findReferencesInFile = (clang_findReferencesInFilePROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    uintptr_t file = (uintptr_t)fileAddress;
    CXCursorAndRangeVisitor *visitor = (CXCursorAndRangeVisitor *)(uintptr_t)visitorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_findReferencesInFile(*cursor, file, *visitor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1findIncludesInFile(JNIEnv *__env, jclass clazz, jlong TUAddress, jlong fileAddress, jlong visitorAddress, jlong __functionAddress) {
    clang_findIncludesInFilePROC clang_findIncludesInFile = (clang_findIncludesInFilePROC)(uintptr_t)__functionAddress;
    uintptr_t TU = (uintptr_t)TUAddress;
    uintptr_t file = (uintptr_t)fileAddress;
    CXCursorAndRangeVisitor *visitor = (CXCursorAndRangeVisitor *)(uintptr_t)visitorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_findIncludesInFile(TU, file, *visitor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1indexLoc_1getFileLocation(JNIEnv *__env, jclass clazz, jlong locAddress, jlong indexFileAddress, jlong fileAddress, jlong lineAddress, jlong columnAddress, jlong offsetAddress, jlong __functionAddress) {
    clang_indexLoc_getFileLocationPROC clang_indexLoc_getFileLocation = (clang_indexLoc_getFileLocationPROC)(uintptr_t)__functionAddress;
    CXIdxLoc *loc = (CXIdxLoc *)(uintptr_t)locAddress;
    uintptr_t indexFile = (uintptr_t)indexFileAddress;
    uintptr_t file = (uintptr_t)fileAddress;
    uintptr_t line = (uintptr_t)lineAddress;
    uintptr_t column = (uintptr_t)columnAddress;
    uintptr_t offset = (uintptr_t)offsetAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_indexLoc_getFileLocation(*loc, indexFile, file, line, column, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1indexLoc_1getCXSourceLocation(JNIEnv *__env, jclass clazz, jlong locAddress, jlong __functionAddress, jlong __result) {
    clang_indexLoc_getCXSourceLocationPROC clang_indexLoc_getCXSourceLocation = (clang_indexLoc_getCXSourceLocationPROC)(uintptr_t)__functionAddress;
    CXIdxLoc *loc = (CXIdxLoc *)(uintptr_t)locAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceLocation*)(uintptr_t)__result) = clang_indexLoc_getCXSourceLocation(*loc);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1visitFields(JNIEnv *__env, jclass clazz, jlong TAddress, jlong visitorAddress, jlong client_dataAddress, jlong __functionAddress) {
    clang_Type_visitFieldsPROC clang_Type_visitFields = (clang_Type_visitFieldsPROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    uintptr_t visitor = (uintptr_t)visitorAddress;
    uintptr_t client_data = (uintptr_t)client_dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_Type_visitFields(*T, visitor, client_data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1visitCXXBaseClasses(JNIEnv *__env, jclass clazz, jlong TAddress, jlong visitorAddress, jlong client_dataAddress, jlong __functionAddress) {
    clang_visitCXXBaseClassesPROC clang_visitCXXBaseClasses = (clang_visitCXXBaseClassesPROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    uintptr_t visitor = (uintptr_t)visitorAddress;
    uintptr_t client_data = (uintptr_t)client_dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_visitCXXBaseClasses(*T, visitor, client_data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1visitCXXMethods(JNIEnv *__env, jclass clazz, jlong TAddress, jlong visitorAddress, jlong client_dataAddress, jlong __functionAddress) {
    clang_visitCXXMethodsPROC clang_visitCXXMethods = (clang_visitCXXMethodsPROC)(uintptr_t)__functionAddress;
    CXType *T = (CXType *)(uintptr_t)TAddress;
    uintptr_t visitor = (uintptr_t)visitorAddress;
    uintptr_t client_data = (uintptr_t)client_dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_visitCXXMethods(*T, visitor, client_data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getBinaryOperatorKindSpelling(JNIEnv *__env, jclass clazz, jint kind, jlong __functionAddress, jlong __result) {
    clang_getBinaryOperatorKindSpellingPROC clang_getBinaryOperatorKindSpelling = (clang_getBinaryOperatorKindSpellingPROC)(uintptr_t)__functionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getBinaryOperatorKindSpelling(kind);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorBinaryOperatorKind(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getCursorBinaryOperatorKindPROC clang_getCursorBinaryOperatorKind = (clang_getCursorBinaryOperatorKindPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getCursorBinaryOperatorKind(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getUnaryOperatorKindSpelling(JNIEnv *__env, jclass clazz, jint kind, jlong __functionAddress, jlong __result) {
    clang_getUnaryOperatorKindSpellingPROC clang_getUnaryOperatorKindSpelling = (clang_getUnaryOperatorKindSpellingPROC)(uintptr_t)__functionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(uintptr_t)__result) = clang_getUnaryOperatorKindSpelling(kind);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorUnaryOperatorKind(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getCursorUnaryOperatorKindPROC clang_getCursorUnaryOperatorKind = (clang_getCursorUnaryOperatorKindPROC)(uintptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return clang_getCursorUnaryOperatorKind(*cursor);
}

EXTERN_C_EXIT
