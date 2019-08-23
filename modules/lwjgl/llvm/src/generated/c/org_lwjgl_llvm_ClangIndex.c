/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "clang-c/Index.h"

typedef intptr_t (*clang_getCStringPROC) (CXString);
typedef void (*clang_disposeStringPROC) (CXString);
typedef CXString (*clang_getFileNamePROC) (intptr_t);
typedef CXString (*clang_File_tryGetRealPathNamePROC) (intptr_t);
typedef CXSourceLocation (*clang_getNullLocationPROC) (void);
typedef jint (*clang_equalLocationsPROC) (CXSourceLocation, CXSourceLocation);
typedef CXSourceLocation (*clang_getLocationPROC) (intptr_t, intptr_t, jint, jint);
typedef CXSourceLocation (*clang_getLocationForOffsetPROC) (intptr_t, intptr_t, jint);
typedef jint (*clang_Location_isInSystemHeaderPROC) (CXSourceLocation);
typedef jint (*clang_Location_isFromMainFilePROC) (CXSourceLocation);
typedef CXSourceRange (*clang_getNullRangePROC) (void);
typedef CXSourceRange (*clang_getRangePROC) (CXSourceLocation, CXSourceLocation);
typedef jint (*clang_equalRangesPROC) (CXSourceRange, CXSourceRange);
typedef jint (*clang_Range_isNullPROC) (CXSourceRange);
typedef void (*clang_getExpansionLocationPROC) (CXSourceLocation, intptr_t, intptr_t, intptr_t, intptr_t);
typedef void (*clang_getPresumedLocationPROC) (CXSourceLocation, intptr_t, intptr_t, intptr_t);
typedef void (*clang_getSpellingLocationPROC) (CXSourceLocation, intptr_t, intptr_t, intptr_t, intptr_t);
typedef void (*clang_getFileLocationPROC) (CXSourceLocation, intptr_t, intptr_t, intptr_t, intptr_t);
typedef CXSourceLocation (*clang_getRangeStartPROC) (CXSourceRange);
typedef CXSourceLocation (*clang_getRangeEndPROC) (CXSourceRange);
typedef CXString (*clang_formatDiagnosticPROC) (intptr_t, jint);
typedef CXSourceLocation (*clang_getDiagnosticLocationPROC) (intptr_t);
typedef CXString (*clang_getDiagnosticSpellingPROC) (intptr_t);
typedef CXString (*clang_getDiagnosticOptionPROC) (intptr_t, intptr_t);
typedef CXString (*clang_getDiagnosticCategoryTextPROC) (intptr_t);
typedef CXSourceRange (*clang_getDiagnosticRangePROC) (intptr_t, jint);
typedef CXString (*clang_getDiagnosticFixItPROC) (intptr_t, jint, intptr_t);
typedef CXString (*clang_getTranslationUnitSpellingPROC) (intptr_t);
typedef CXTUResourceUsage (*clang_getCXTUResourceUsagePROC) (intptr_t);
typedef void (*clang_disposeCXTUResourceUsagePROC) (CXTUResourceUsage);
typedef CXString (*clang_TargetInfo_getTriplePROC) (intptr_t);
typedef CXCursor (*clang_getNullCursorPROC) (void);
typedef CXCursor (*clang_getTranslationUnitCursorPROC) (intptr_t);
typedef jint (*clang_equalCursorsPROC) (CXCursor, CXCursor);
typedef jint (*clang_Cursor_isNullPROC) (CXCursor);
typedef jint (*clang_hashCursorPROC) (CXCursor);
typedef jint (*clang_getCursorKindPROC) (CXCursor);
typedef jint (*clang_isInvalidDeclarationPROC) (CXCursor);
typedef jint (*clang_Cursor_hasAttrsPROC) (CXCursor);
typedef jint (*clang_getCursorLinkagePROC) (CXCursor);
typedef jint (*clang_getCursorVisibilityPROC) (CXCursor);
typedef jint (*clang_getCursorAvailabilityPROC) (CXCursor);
typedef jint (*clang_getCursorPlatformAvailabilityPROC) (CXCursor, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, jint);
typedef jint (*clang_getCursorLanguagePROC) (CXCursor);
typedef jint (*clang_getCursorTLSKindPROC) (CXCursor);
typedef intptr_t (*clang_Cursor_getTranslationUnitPROC) (CXCursor);
typedef jint (*clang_CXCursorSet_containsPROC) (intptr_t, CXCursor);
typedef jint (*clang_CXCursorSet_insertPROC) (intptr_t, CXCursor);
typedef CXCursor (*clang_getCursorSemanticParentPROC) (CXCursor);
typedef CXCursor (*clang_getCursorLexicalParentPROC) (CXCursor);
typedef void (*clang_getOverriddenCursorsPROC) (CXCursor, intptr_t, intptr_t);
typedef intptr_t (*clang_getIncludedFilePROC) (CXCursor);
typedef CXCursor (*clang_getCursorPROC) (intptr_t, CXSourceLocation);
typedef CXSourceLocation (*clang_getCursorLocationPROC) (CXCursor);
typedef CXSourceRange (*clang_getCursorExtentPROC) (CXCursor);
typedef CXType (*clang_getCursorTypePROC) (CXCursor);
typedef CXString (*clang_getTypeSpellingPROC) (CXType);
typedef CXType (*clang_getTypedefDeclUnderlyingTypePROC) (CXCursor);
typedef CXType (*clang_getEnumDeclIntegerTypePROC) (CXCursor);
typedef jlong (*clang_getEnumConstantDeclValuePROC) (CXCursor);
typedef jlong (*clang_getEnumConstantDeclUnsignedValuePROC) (CXCursor);
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
typedef jlong (*clang_Type_getOffsetOfPROC) (CXType, intptr_t);
typedef CXType (*clang_Type_getModifiedTypePROC) (CXType);
typedef jlong (*clang_Cursor_getOffsetOfFieldPROC) (CXCursor);
typedef jint (*clang_Cursor_isAnonymousPROC) (CXCursor);
typedef jint (*clang_Type_getNumTemplateArgumentsPROC) (CXType);
typedef CXType (*clang_Type_getTemplateArgumentAsTypePROC) (CXType, jint);
typedef jint (*clang_Type_getCXXRefQualifierPROC) (CXType);
typedef jint (*clang_Cursor_isBitFieldPROC) (CXCursor);
typedef jint (*clang_isVirtualBasePROC) (CXCursor);
typedef jint (*clang_getCXXAccessSpecifierPROC) (CXCursor);
typedef jint (*clang_Cursor_getStorageClassPROC) (CXCursor);
typedef jint (*clang_getNumOverloadedDeclsPROC) (CXCursor);
typedef CXCursor (*clang_getOverloadedDeclPROC) (CXCursor, jint);
typedef CXType (*clang_getIBOutletCollectionTypePROC) (CXCursor);
typedef jint (*clang_visitChildrenPROC) (CXCursor, intptr_t, intptr_t);
typedef CXString (*clang_getCursorUSRPROC) (CXCursor);
typedef CXString (*clang_constructUSR_ObjCClassPROC) (intptr_t);
typedef CXString (*clang_constructUSR_ObjCCategoryPROC) (intptr_t, intptr_t);
typedef CXString (*clang_constructUSR_ObjCProtocolPROC) (intptr_t);
typedef CXString (*clang_constructUSR_ObjCIvarPROC) (intptr_t, CXString);
typedef CXString (*clang_constructUSR_ObjCMethodPROC) (intptr_t, jint, CXString);
typedef CXString (*clang_constructUSR_ObjCPropertyPROC) (intptr_t, CXString);
typedef CXString (*clang_getCursorSpellingPROC) (CXCursor);
typedef CXSourceRange (*clang_Cursor_getSpellingNameRangePROC) (CXCursor, jint, jint);
typedef intptr_t (*clang_getCursorPrintingPolicyPROC) (CXCursor);
typedef CXString (*clang_getCursorPrettyPrintedPROC) (CXCursor, intptr_t);
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
typedef jint (*clang_Cursor_isExternalSymbolPROC) (CXCursor, intptr_t, intptr_t, intptr_t);
typedef CXSourceRange (*clang_Cursor_getCommentRangePROC) (CXCursor);
typedef CXString (*clang_Cursor_getRawCommentTextPROC) (CXCursor);
typedef CXString (*clang_Cursor_getBriefCommentTextPROC) (CXCursor);
typedef CXString (*clang_Cursor_getManglingPROC) (CXCursor);
typedef intptr_t (*clang_Cursor_getCXXManglingsPROC) (CXCursor);
typedef intptr_t (*clang_Cursor_getObjCManglingsPROC) (CXCursor);
typedef intptr_t (*clang_Cursor_getModulePROC) (CXCursor);
typedef CXString (*clang_Module_getNamePROC) (intptr_t);
typedef CXString (*clang_Module_getFullNamePROC) (intptr_t);
typedef jint (*clang_CXXConstructor_isConvertingConstructorPROC) (CXCursor);
typedef jint (*clang_CXXConstructor_isCopyConstructorPROC) (CXCursor);
typedef jint (*clang_CXXConstructor_isDefaultConstructorPROC) (CXCursor);
typedef jint (*clang_CXXConstructor_isMoveConstructorPROC) (CXCursor);
typedef jint (*clang_CXXField_isMutablePROC) (CXCursor);
typedef jint (*clang_CXXMethod_isDefaultedPROC) (CXCursor);
typedef jint (*clang_CXXMethod_isPureVirtualPROC) (CXCursor);
typedef jint (*clang_CXXMethod_isStaticPROC) (CXCursor);
typedef jint (*clang_CXXMethod_isVirtualPROC) (CXCursor);
typedef jint (*clang_CXXRecord_isAbstractPROC) (CXCursor);
typedef jint (*clang_EnumDecl_isScopedPROC) (CXCursor);
typedef jint (*clang_CXXMethod_isConstPROC) (CXCursor);
typedef jint (*clang_getTemplateCursorKindPROC) (CXCursor);
typedef CXCursor (*clang_getSpecializedCursorTemplatePROC) (CXCursor);
typedef CXSourceRange (*clang_getCursorReferenceNameRangePROC) (CXCursor, jint, jint);
typedef intptr_t (*clang_getTokenPROC) (intptr_t, CXSourceLocation);
typedef jint (*clang_getTokenKindPROC) (CXToken);
typedef CXString (*clang_getTokenSpellingPROC) (intptr_t, CXToken);
typedef CXSourceLocation (*clang_getTokenLocationPROC) (intptr_t, CXToken);
typedef CXSourceRange (*clang_getTokenExtentPROC) (intptr_t, CXToken);
typedef void (*clang_tokenizePROC) (intptr_t, CXSourceRange, intptr_t, intptr_t);
typedef CXString (*clang_getCursorKindSpellingPROC) (jint);
typedef void (*clang_getDefinitionSpellingAndExtentPROC) (CXCursor, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t);
typedef CXString (*clang_getCompletionChunkTextPROC) (intptr_t, jint);
typedef CXString (*clang_getCompletionAnnotationPROC) (intptr_t, jint);
typedef CXString (*clang_getCompletionParentPROC) (intptr_t, intptr_t);
typedef CXString (*clang_getCompletionBriefCommentPROC) (intptr_t);
typedef intptr_t (*clang_getCursorCompletionStringPROC) (CXCursor);
typedef CXString (*clang_getCompletionFixItPROC) (intptr_t, jint, jint, intptr_t);
typedef CXString (*clang_codeCompleteGetContainerUSRPROC) (intptr_t);
typedef CXString (*clang_codeCompleteGetObjCSelectorPROC) (intptr_t);
typedef CXString (*clang_getClangVersionPROC) (void);
typedef intptr_t (*clang_Cursor_EvaluatePROC) (CXCursor);
typedef jint (*clang_findReferencesInFilePROC) (CXCursor, intptr_t, CXCursorAndRangeVisitor);
typedef jint (*clang_findIncludesInFilePROC) (intptr_t, intptr_t, CXCursorAndRangeVisitor);
typedef void (*clang_indexLoc_getFileLocationPROC) (CXIdxLoc, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t);
typedef CXSourceLocation (*clang_indexLoc_getCXSourceLocationPROC) (CXIdxLoc);
typedef jint (*clang_Type_visitFieldsPROC) (CXType, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCString(JNIEnv *__env, jclass clazz, jlong stringAddress, jlong __functionAddress) {
    clang_getCStringPROC clang_getCString = (clang_getCStringPROC)(intptr_t)__functionAddress;
    CXString *string = (CXString *)(intptr_t)stringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_getCString(*string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1disposeString(JNIEnv *__env, jclass clazz, jlong stringAddress, jlong __functionAddress) {
    clang_disposeStringPROC clang_disposeString = (clang_disposeStringPROC)(intptr_t)__functionAddress;
    CXString *string = (CXString *)(intptr_t)stringAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_disposeString(*string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getFileName(JNIEnv *__env, jclass clazz, jlong SFileAddress, jlong __functionAddress, jlong __result) {
    clang_getFileNamePROC clang_getFileName = (clang_getFileNamePROC)(intptr_t)__functionAddress;
    intptr_t SFile = (intptr_t)SFileAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getFileName(SFile);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1File_1tryGetRealPathName(JNIEnv *__env, jclass clazz, jlong fileAddress, jlong __functionAddress, jlong __result) {
    clang_File_tryGetRealPathNamePROC clang_File_tryGetRealPathName = (clang_File_tryGetRealPathNamePROC)(intptr_t)__functionAddress;
    intptr_t file = (intptr_t)fileAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_File_tryGetRealPathName(file);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getNullLocation(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong __result) {
    clang_getNullLocationPROC clang_getNullLocation = (clang_getNullLocationPROC)(intptr_t)__functionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceLocation*)(intptr_t)__result) = clang_getNullLocation();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1equalLocations(JNIEnv *__env, jclass clazz, jlong loc1Address, jlong loc2Address, jlong __functionAddress) {
    clang_equalLocationsPROC clang_equalLocations = (clang_equalLocationsPROC)(intptr_t)__functionAddress;
    CXSourceLocation *loc1 = (CXSourceLocation *)(intptr_t)loc1Address;
    CXSourceLocation *loc2 = (CXSourceLocation *)(intptr_t)loc2Address;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_equalLocations(*loc1, *loc2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getLocation(JNIEnv *__env, jclass clazz, jlong tuAddress, jlong fileAddress, jint line, jint column, jlong __functionAddress, jlong __result) {
    clang_getLocationPROC clang_getLocation = (clang_getLocationPROC)(intptr_t)__functionAddress;
    intptr_t tu = (intptr_t)tuAddress;
    intptr_t file = (intptr_t)fileAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceLocation*)(intptr_t)__result) = clang_getLocation(tu, file, line, column);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getLocationForOffset(JNIEnv *__env, jclass clazz, jlong tuAddress, jlong fileAddress, jint offset, jlong __functionAddress, jlong __result) {
    clang_getLocationForOffsetPROC clang_getLocationForOffset = (clang_getLocationForOffsetPROC)(intptr_t)__functionAddress;
    intptr_t tu = (intptr_t)tuAddress;
    intptr_t file = (intptr_t)fileAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceLocation*)(intptr_t)__result) = clang_getLocationForOffset(tu, file, offset);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Location_1isInSystemHeader(JNIEnv *__env, jclass clazz, jlong locationAddress, jlong __functionAddress) {
    clang_Location_isInSystemHeaderPROC clang_Location_isInSystemHeader = (clang_Location_isInSystemHeaderPROC)(intptr_t)__functionAddress;
    CXSourceLocation *location = (CXSourceLocation *)(intptr_t)locationAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Location_isInSystemHeader(*location);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Location_1isFromMainFile(JNIEnv *__env, jclass clazz, jlong locationAddress, jlong __functionAddress) {
    clang_Location_isFromMainFilePROC clang_Location_isFromMainFile = (clang_Location_isFromMainFilePROC)(intptr_t)__functionAddress;
    CXSourceLocation *location = (CXSourceLocation *)(intptr_t)locationAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Location_isFromMainFile(*location);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getNullRange(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong __result) {
    clang_getNullRangePROC clang_getNullRange = (clang_getNullRangePROC)(intptr_t)__functionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceRange*)(intptr_t)__result) = clang_getNullRange();
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getRange(JNIEnv *__env, jclass clazz, jlong beginAddress, jlong endAddress, jlong __functionAddress, jlong __result) {
    clang_getRangePROC clang_getRange = (clang_getRangePROC)(intptr_t)__functionAddress;
    CXSourceLocation *begin = (CXSourceLocation *)(intptr_t)beginAddress;
    CXSourceLocation *end = (CXSourceLocation *)(intptr_t)endAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceRange*)(intptr_t)__result) = clang_getRange(*begin, *end);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1equalRanges(JNIEnv *__env, jclass clazz, jlong range1Address, jlong range2Address, jlong __functionAddress) {
    clang_equalRangesPROC clang_equalRanges = (clang_equalRangesPROC)(intptr_t)__functionAddress;
    CXSourceRange *range1 = (CXSourceRange *)(intptr_t)range1Address;
    CXSourceRange *range2 = (CXSourceRange *)(intptr_t)range2Address;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_equalRanges(*range1, *range2);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Range_1isNull(JNIEnv *__env, jclass clazz, jlong rangeAddress, jlong __functionAddress) {
    clang_Range_isNullPROC clang_Range_isNull = (clang_Range_isNullPROC)(intptr_t)__functionAddress;
    CXSourceRange *range = (CXSourceRange *)(intptr_t)rangeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Range_isNull(*range);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getExpansionLocation(JNIEnv *__env, jclass clazz, jlong locationAddress, jlong fileAddress, jlong lineAddress, jlong columnAddress, jlong offsetAddress, jlong __functionAddress) {
    clang_getExpansionLocationPROC clang_getExpansionLocation = (clang_getExpansionLocationPROC)(intptr_t)__functionAddress;
    CXSourceLocation *location = (CXSourceLocation *)(intptr_t)locationAddress;
    intptr_t file = (intptr_t)fileAddress;
    intptr_t line = (intptr_t)lineAddress;
    intptr_t column = (intptr_t)columnAddress;
    intptr_t offset = (intptr_t)offsetAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_getExpansionLocation(*location, file, line, column, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getPresumedLocation(JNIEnv *__env, jclass clazz, jlong locationAddress, jlong filenameAddress, jlong lineAddress, jlong columnAddress, jlong __functionAddress) {
    clang_getPresumedLocationPROC clang_getPresumedLocation = (clang_getPresumedLocationPROC)(intptr_t)__functionAddress;
    CXSourceLocation *location = (CXSourceLocation *)(intptr_t)locationAddress;
    intptr_t filename = (intptr_t)filenameAddress;
    intptr_t line = (intptr_t)lineAddress;
    intptr_t column = (intptr_t)columnAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_getPresumedLocation(*location, filename, line, column);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getSpellingLocation(JNIEnv *__env, jclass clazz, jlong locationAddress, jlong fileAddress, jlong lineAddress, jlong columnAddress, jlong offsetAddress, jlong __functionAddress) {
    clang_getSpellingLocationPROC clang_getSpellingLocation = (clang_getSpellingLocationPROC)(intptr_t)__functionAddress;
    CXSourceLocation *location = (CXSourceLocation *)(intptr_t)locationAddress;
    intptr_t file = (intptr_t)fileAddress;
    intptr_t line = (intptr_t)lineAddress;
    intptr_t column = (intptr_t)columnAddress;
    intptr_t offset = (intptr_t)offsetAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_getSpellingLocation(*location, file, line, column, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getFileLocation(JNIEnv *__env, jclass clazz, jlong locationAddress, jlong fileAddress, jlong lineAddress, jlong columnAddress, jlong offsetAddress, jlong __functionAddress) {
    clang_getFileLocationPROC clang_getFileLocation = (clang_getFileLocationPROC)(intptr_t)__functionAddress;
    CXSourceLocation *location = (CXSourceLocation *)(intptr_t)locationAddress;
    intptr_t file = (intptr_t)fileAddress;
    intptr_t line = (intptr_t)lineAddress;
    intptr_t column = (intptr_t)columnAddress;
    intptr_t offset = (intptr_t)offsetAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_getFileLocation(*location, file, line, column, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getRangeStart(JNIEnv *__env, jclass clazz, jlong rangeAddress, jlong __functionAddress, jlong __result) {
    clang_getRangeStartPROC clang_getRangeStart = (clang_getRangeStartPROC)(intptr_t)__functionAddress;
    CXSourceRange *range = (CXSourceRange *)(intptr_t)rangeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceLocation*)(intptr_t)__result) = clang_getRangeStart(*range);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getRangeEnd(JNIEnv *__env, jclass clazz, jlong rangeAddress, jlong __functionAddress, jlong __result) {
    clang_getRangeEndPROC clang_getRangeEnd = (clang_getRangeEndPROC)(intptr_t)__functionAddress;
    CXSourceRange *range = (CXSourceRange *)(intptr_t)rangeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceLocation*)(intptr_t)__result) = clang_getRangeEnd(*range);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1formatDiagnostic(JNIEnv *__env, jclass clazz, jlong DiagnosticAddress, jint Options, jlong __functionAddress, jlong __result) {
    clang_formatDiagnosticPROC clang_formatDiagnostic = (clang_formatDiagnosticPROC)(intptr_t)__functionAddress;
    intptr_t Diagnostic = (intptr_t)DiagnosticAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_formatDiagnostic(Diagnostic, Options);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getDiagnosticLocation(JNIEnv *__env, jclass clazz, jlong DiagnosticAddress, jlong __functionAddress, jlong __result) {
    clang_getDiagnosticLocationPROC clang_getDiagnosticLocation = (clang_getDiagnosticLocationPROC)(intptr_t)__functionAddress;
    intptr_t Diagnostic = (intptr_t)DiagnosticAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceLocation*)(intptr_t)__result) = clang_getDiagnosticLocation(Diagnostic);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getDiagnosticSpelling(JNIEnv *__env, jclass clazz, jlong DiagnosticAddress, jlong __functionAddress, jlong __result) {
    clang_getDiagnosticSpellingPROC clang_getDiagnosticSpelling = (clang_getDiagnosticSpellingPROC)(intptr_t)__functionAddress;
    intptr_t Diagnostic = (intptr_t)DiagnosticAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getDiagnosticSpelling(Diagnostic);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getDiagnosticOption(JNIEnv *__env, jclass clazz, jlong DiagAddress, jlong DisableAddress, jlong __functionAddress, jlong __result) {
    clang_getDiagnosticOptionPROC clang_getDiagnosticOption = (clang_getDiagnosticOptionPROC)(intptr_t)__functionAddress;
    intptr_t Diag = (intptr_t)DiagAddress;
    intptr_t Disable = (intptr_t)DisableAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getDiagnosticOption(Diag, Disable);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getDiagnosticCategoryText(JNIEnv *__env, jclass clazz, jlong DiagnosticAddress, jlong __functionAddress, jlong __result) {
    clang_getDiagnosticCategoryTextPROC clang_getDiagnosticCategoryText = (clang_getDiagnosticCategoryTextPROC)(intptr_t)__functionAddress;
    intptr_t Diagnostic = (intptr_t)DiagnosticAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getDiagnosticCategoryText(Diagnostic);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getDiagnosticRange(JNIEnv *__env, jclass clazz, jlong DiagnosticAddress, jint Range, jlong __functionAddress, jlong __result) {
    clang_getDiagnosticRangePROC clang_getDiagnosticRange = (clang_getDiagnosticRangePROC)(intptr_t)__functionAddress;
    intptr_t Diagnostic = (intptr_t)DiagnosticAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceRange*)(intptr_t)__result) = clang_getDiagnosticRange(Diagnostic, Range);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getDiagnosticFixIt(JNIEnv *__env, jclass clazz, jlong DiagnosticAddress, jint FixIt, jlong ReplacementRangeAddress, jlong __functionAddress, jlong __result) {
    clang_getDiagnosticFixItPROC clang_getDiagnosticFixIt = (clang_getDiagnosticFixItPROC)(intptr_t)__functionAddress;
    intptr_t Diagnostic = (intptr_t)DiagnosticAddress;
    intptr_t ReplacementRange = (intptr_t)ReplacementRangeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getDiagnosticFixIt(Diagnostic, FixIt, ReplacementRange);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTranslationUnitSpelling(JNIEnv *__env, jclass clazz, jlong CTUnitAddress, jlong __functionAddress, jlong __result) {
    clang_getTranslationUnitSpellingPROC clang_getTranslationUnitSpelling = (clang_getTranslationUnitSpellingPROC)(intptr_t)__functionAddress;
    intptr_t CTUnit = (intptr_t)CTUnitAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getTranslationUnitSpelling(CTUnit);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCXTUResourceUsage(JNIEnv *__env, jclass clazz, jlong TUAddress, jlong __functionAddress, jlong __result) {
    clang_getCXTUResourceUsagePROC clang_getCXTUResourceUsage = (clang_getCXTUResourceUsagePROC)(intptr_t)__functionAddress;
    intptr_t TU = (intptr_t)TUAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXTUResourceUsage*)(intptr_t)__result) = clang_getCXTUResourceUsage(TU);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1disposeCXTUResourceUsage(JNIEnv *__env, jclass clazz, jlong usageAddress, jlong __functionAddress) {
    clang_disposeCXTUResourceUsagePROC clang_disposeCXTUResourceUsage = (clang_disposeCXTUResourceUsagePROC)(intptr_t)__functionAddress;
    CXTUResourceUsage *usage = (CXTUResourceUsage *)(intptr_t)usageAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_disposeCXTUResourceUsage(*usage);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1TargetInfo_1getTriple(JNIEnv *__env, jclass clazz, jlong InfoAddress, jlong __functionAddress, jlong __result) {
    clang_TargetInfo_getTriplePROC clang_TargetInfo_getTriple = (clang_TargetInfo_getTriplePROC)(intptr_t)__functionAddress;
    intptr_t Info = (intptr_t)InfoAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_TargetInfo_getTriple(Info);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getNullCursor(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong __result) {
    clang_getNullCursorPROC clang_getNullCursor = (clang_getNullCursorPROC)(intptr_t)__functionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(intptr_t)__result) = clang_getNullCursor();
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTranslationUnitCursor(JNIEnv *__env, jclass clazz, jlong TUAddress, jlong __functionAddress, jlong __result) {
    clang_getTranslationUnitCursorPROC clang_getTranslationUnitCursor = (clang_getTranslationUnitCursorPROC)(intptr_t)__functionAddress;
    intptr_t TU = (intptr_t)TUAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(intptr_t)__result) = clang_getTranslationUnitCursor(TU);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1equalCursors(JNIEnv *__env, jclass clazz, jlong AAddress, jlong BAddress, jlong __functionAddress) {
    clang_equalCursorsPROC clang_equalCursors = (clang_equalCursorsPROC)(intptr_t)__functionAddress;
    CXCursor *A = (CXCursor *)(intptr_t)AAddress;
    CXCursor *B = (CXCursor *)(intptr_t)BAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_equalCursors(*A, *B);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isNull(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_Cursor_isNullPROC clang_Cursor_isNull = (clang_Cursor_isNullPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Cursor_isNull(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1hashCursor(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_hashCursorPROC clang_hashCursor = (clang_hashCursorPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_hashCursor(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorKind(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getCursorKindPROC clang_getCursorKind = (clang_getCursorKindPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_getCursorKind(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1isInvalidDeclaration(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_isInvalidDeclarationPROC clang_isInvalidDeclaration = (clang_isInvalidDeclarationPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_isInvalidDeclaration(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1hasAttrs(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_hasAttrsPROC clang_Cursor_hasAttrs = (clang_Cursor_hasAttrsPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Cursor_hasAttrs(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorLinkage(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getCursorLinkagePROC clang_getCursorLinkage = (clang_getCursorLinkagePROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_getCursorLinkage(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorVisibility(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getCursorVisibilityPROC clang_getCursorVisibility = (clang_getCursorVisibilityPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_getCursorVisibility(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorAvailability(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getCursorAvailabilityPROC clang_getCursorAvailability = (clang_getCursorAvailabilityPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_getCursorAvailability(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorPlatformAvailability(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong always_deprecatedAddress, jlong deprecated_messageAddress, jlong always_unavailableAddress, jlong unavailable_messageAddress, jlong availabilityAddress, jint availability_size, jlong __functionAddress) {
    clang_getCursorPlatformAvailabilityPROC clang_getCursorPlatformAvailability = (clang_getCursorPlatformAvailabilityPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    intptr_t always_deprecated = (intptr_t)always_deprecatedAddress;
    intptr_t deprecated_message = (intptr_t)deprecated_messageAddress;
    intptr_t always_unavailable = (intptr_t)always_unavailableAddress;
    intptr_t unavailable_message = (intptr_t)unavailable_messageAddress;
    intptr_t availability = (intptr_t)availabilityAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_getCursorPlatformAvailability(*cursor, always_deprecated, deprecated_message, always_unavailable, unavailable_message, availability, availability_size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorLanguage(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getCursorLanguagePROC clang_getCursorLanguage = (clang_getCursorLanguagePROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_getCursorLanguage(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorTLSKind(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getCursorTLSKindPROC clang_getCursorTLSKind = (clang_getCursorTLSKindPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_getCursorTLSKind(*cursor);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getTranslationUnit(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_Cursor_getTranslationUnitPROC clang_Cursor_getTranslationUnit = (clang_Cursor_getTranslationUnitPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_Cursor_getTranslationUnit(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXCursorSet_1contains(JNIEnv *__env, jclass clazz, jlong csetAddress, jlong cursorAddress, jlong __functionAddress) {
    clang_CXCursorSet_containsPROC clang_CXCursorSet_contains = (clang_CXCursorSet_containsPROC)(intptr_t)__functionAddress;
    intptr_t cset = (intptr_t)csetAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_CXCursorSet_contains(cset, *cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXCursorSet_1insert(JNIEnv *__env, jclass clazz, jlong csetAddress, jlong cursorAddress, jlong __functionAddress) {
    clang_CXCursorSet_insertPROC clang_CXCursorSet_insert = (clang_CXCursorSet_insertPROC)(intptr_t)__functionAddress;
    intptr_t cset = (intptr_t)csetAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_CXCursorSet_insert(cset, *cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorSemanticParent(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorSemanticParentPROC clang_getCursorSemanticParent = (clang_getCursorSemanticParentPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(intptr_t)__result) = clang_getCursorSemanticParent(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorLexicalParent(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorLexicalParentPROC clang_getCursorLexicalParent = (clang_getCursorLexicalParentPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(intptr_t)__result) = clang_getCursorLexicalParent(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getOverriddenCursors(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong overriddenAddress, jlong num_overriddenAddress, jlong __functionAddress) {
    clang_getOverriddenCursorsPROC clang_getOverriddenCursors = (clang_getOverriddenCursorsPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    intptr_t overridden = (intptr_t)overriddenAddress;
    intptr_t num_overridden = (intptr_t)num_overriddenAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_getOverriddenCursors(*cursor, overridden, num_overridden);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getIncludedFile(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getIncludedFilePROC clang_getIncludedFile = (clang_getIncludedFilePROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_getIncludedFile(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursor(JNIEnv *__env, jclass clazz, jlong TUAddress, jlong locationAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorPROC clang_getCursor = (clang_getCursorPROC)(intptr_t)__functionAddress;
    intptr_t TU = (intptr_t)TUAddress;
    CXSourceLocation *location = (CXSourceLocation *)(intptr_t)locationAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(intptr_t)__result) = clang_getCursor(TU, *location);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorLocation(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorLocationPROC clang_getCursorLocation = (clang_getCursorLocationPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceLocation*)(intptr_t)__result) = clang_getCursorLocation(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorExtent(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorExtentPROC clang_getCursorExtent = (clang_getCursorExtentPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceRange*)(intptr_t)__result) = clang_getCursorExtent(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorType(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorTypePROC clang_getCursorType = (clang_getCursorTypePROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(intptr_t)__result) = clang_getCursorType(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTypeSpelling(JNIEnv *__env, jclass clazz, jlong CTAddress, jlong __functionAddress, jlong __result) {
    clang_getTypeSpellingPROC clang_getTypeSpelling = (clang_getTypeSpellingPROC)(intptr_t)__functionAddress;
    CXType *CT = (CXType *)(intptr_t)CTAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getTypeSpelling(*CT);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTypedefDeclUnderlyingType(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_getTypedefDeclUnderlyingTypePROC clang_getTypedefDeclUnderlyingType = (clang_getTypedefDeclUnderlyingTypePROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(intptr_t)__result) = clang_getTypedefDeclUnderlyingType(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getEnumDeclIntegerType(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_getEnumDeclIntegerTypePROC clang_getEnumDeclIntegerType = (clang_getEnumDeclIntegerTypePROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(intptr_t)__result) = clang_getEnumDeclIntegerType(*C);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getEnumConstantDeclValue(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_getEnumConstantDeclValuePROC clang_getEnumConstantDeclValue = (clang_getEnumConstantDeclValuePROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_getEnumConstantDeclValue(*C);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getEnumConstantDeclUnsignedValue(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_getEnumConstantDeclUnsignedValuePROC clang_getEnumConstantDeclUnsignedValue = (clang_getEnumConstantDeclUnsignedValuePROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_getEnumConstantDeclUnsignedValue(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getFieldDeclBitWidth(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_getFieldDeclBitWidthPROC clang_getFieldDeclBitWidth = (clang_getFieldDeclBitWidthPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_getFieldDeclBitWidth(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getNumArguments(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_getNumArgumentsPROC clang_Cursor_getNumArguments = (clang_Cursor_getNumArgumentsPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Cursor_getNumArguments(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getArgument(JNIEnv *__env, jclass clazz, jlong CAddress, jint i, jlong __functionAddress, jlong __result) {
    clang_Cursor_getArgumentPROC clang_Cursor_getArgument = (clang_Cursor_getArgumentPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(intptr_t)__result) = clang_Cursor_getArgument(*C, i);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getNumTemplateArguments(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_getNumTemplateArgumentsPROC clang_Cursor_getNumTemplateArguments = (clang_Cursor_getNumTemplateArgumentsPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Cursor_getNumTemplateArguments(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getTemplateArgumentKind(JNIEnv *__env, jclass clazz, jlong CAddress, jint I, jlong __functionAddress) {
    clang_Cursor_getTemplateArgumentKindPROC clang_Cursor_getTemplateArgumentKind = (clang_Cursor_getTemplateArgumentKindPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Cursor_getTemplateArgumentKind(*C, I);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getTemplateArgumentType(JNIEnv *__env, jclass clazz, jlong CAddress, jint I, jlong __functionAddress, jlong __result) {
    clang_Cursor_getTemplateArgumentTypePROC clang_Cursor_getTemplateArgumentType = (clang_Cursor_getTemplateArgumentTypePROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(intptr_t)__result) = clang_Cursor_getTemplateArgumentType(*C, I);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getTemplateArgumentValue(JNIEnv *__env, jclass clazz, jlong CAddress, jint I, jlong __functionAddress) {
    clang_Cursor_getTemplateArgumentValuePROC clang_Cursor_getTemplateArgumentValue = (clang_Cursor_getTemplateArgumentValuePROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_Cursor_getTemplateArgumentValue(*C, I);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getTemplateArgumentUnsignedValue(JNIEnv *__env, jclass clazz, jlong CAddress, jint I, jlong __functionAddress) {
    clang_Cursor_getTemplateArgumentUnsignedValuePROC clang_Cursor_getTemplateArgumentUnsignedValue = (clang_Cursor_getTemplateArgumentUnsignedValuePROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_Cursor_getTemplateArgumentUnsignedValue(*C, I);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1equalTypes(JNIEnv *__env, jclass clazz, jlong AAddress, jlong BAddress, jlong __functionAddress) {
    clang_equalTypesPROC clang_equalTypes = (clang_equalTypesPROC)(intptr_t)__functionAddress;
    CXType *A = (CXType *)(intptr_t)AAddress;
    CXType *B = (CXType *)(intptr_t)BAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_equalTypes(*A, *B);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCanonicalType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress, jlong __result) {
    clang_getCanonicalTypePROC clang_getCanonicalType = (clang_getCanonicalTypePROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(intptr_t)__result) = clang_getCanonicalType(*T);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1isConstQualifiedType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_isConstQualifiedTypePROC clang_isConstQualifiedType = (clang_isConstQualifiedTypePROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_isConstQualifiedType(*T);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isMacroFunctionLike(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_isMacroFunctionLikePROC clang_Cursor_isMacroFunctionLike = (clang_Cursor_isMacroFunctionLikePROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Cursor_isMacroFunctionLike(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isMacroBuiltin(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_isMacroBuiltinPROC clang_Cursor_isMacroBuiltin = (clang_Cursor_isMacroBuiltinPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Cursor_isMacroBuiltin(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isFunctionInlined(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_isFunctionInlinedPROC clang_Cursor_isFunctionInlined = (clang_Cursor_isFunctionInlinedPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Cursor_isFunctionInlined(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1isVolatileQualifiedType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_isVolatileQualifiedTypePROC clang_isVolatileQualifiedType = (clang_isVolatileQualifiedTypePROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_isVolatileQualifiedType(*T);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1isRestrictQualifiedType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_isRestrictQualifiedTypePROC clang_isRestrictQualifiedType = (clang_isRestrictQualifiedTypePROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_isRestrictQualifiedType(*T);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getAddressSpace(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_getAddressSpacePROC clang_getAddressSpace = (clang_getAddressSpacePROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_getAddressSpace(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTypedefName(JNIEnv *__env, jclass clazz, jlong CTAddress, jlong __functionAddress, jlong __result) {
    clang_getTypedefNamePROC clang_getTypedefName = (clang_getTypedefNamePROC)(intptr_t)__functionAddress;
    CXType *CT = (CXType *)(intptr_t)CTAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getTypedefName(*CT);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getPointeeType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress, jlong __result) {
    clang_getPointeeTypePROC clang_getPointeeType = (clang_getPointeeTypePROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(intptr_t)__result) = clang_getPointeeType(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTypeDeclaration(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress, jlong __result) {
    clang_getTypeDeclarationPROC clang_getTypeDeclaration = (clang_getTypeDeclarationPROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(intptr_t)__result) = clang_getTypeDeclaration(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getDeclObjCTypeEncoding(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_getDeclObjCTypeEncodingPROC clang_getDeclObjCTypeEncoding = (clang_getDeclObjCTypeEncodingPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getDeclObjCTypeEncoding(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getObjCEncoding(JNIEnv *__env, jclass clazz, jlong typeAddress, jlong __functionAddress, jlong __result) {
    clang_Type_getObjCEncodingPROC clang_Type_getObjCEncoding = (clang_Type_getObjCEncodingPROC)(intptr_t)__functionAddress;
    CXType *type = (CXType *)(intptr_t)typeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_Type_getObjCEncoding(*type);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTypeKindSpelling(JNIEnv *__env, jclass clazz, jint K, jlong __functionAddress, jlong __result) {
    clang_getTypeKindSpellingPROC clang_getTypeKindSpelling = (clang_getTypeKindSpellingPROC)(intptr_t)__functionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getTypeKindSpelling(K);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getFunctionTypeCallingConv(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_getFunctionTypeCallingConvPROC clang_getFunctionTypeCallingConv = (clang_getFunctionTypeCallingConvPROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_getFunctionTypeCallingConv(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getResultType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress, jlong __result) {
    clang_getResultTypePROC clang_getResultType = (clang_getResultTypePROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(intptr_t)__result) = clang_getResultType(*T);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getExceptionSpecificationType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_getExceptionSpecificationTypePROC clang_getExceptionSpecificationType = (clang_getExceptionSpecificationTypePROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_getExceptionSpecificationType(*T);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getNumArgTypes(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_getNumArgTypesPROC clang_getNumArgTypes = (clang_getNumArgTypesPROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_getNumArgTypes(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getArgType(JNIEnv *__env, jclass clazz, jlong TAddress, jint i, jlong __functionAddress, jlong __result) {
    clang_getArgTypePROC clang_getArgType = (clang_getArgTypePROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(intptr_t)__result) = clang_getArgType(*T, i);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getObjCObjectBaseType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress, jlong __result) {
    clang_Type_getObjCObjectBaseTypePROC clang_Type_getObjCObjectBaseType = (clang_Type_getObjCObjectBaseTypePROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(intptr_t)__result) = clang_Type_getObjCObjectBaseType(*T);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getNumObjCProtocolRefs(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_Type_getNumObjCProtocolRefsPROC clang_Type_getNumObjCProtocolRefs = (clang_Type_getNumObjCProtocolRefsPROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Type_getNumObjCProtocolRefs(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getObjCProtocolDecl(JNIEnv *__env, jclass clazz, jlong TAddress, jint i, jlong __functionAddress, jlong __result) {
    clang_Type_getObjCProtocolDeclPROC clang_Type_getObjCProtocolDecl = (clang_Type_getObjCProtocolDeclPROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(intptr_t)__result) = clang_Type_getObjCProtocolDecl(*T, i);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getNumObjCTypeArgs(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_Type_getNumObjCTypeArgsPROC clang_Type_getNumObjCTypeArgs = (clang_Type_getNumObjCTypeArgsPROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Type_getNumObjCTypeArgs(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getObjCTypeArg(JNIEnv *__env, jclass clazz, jlong TAddress, jint i, jlong __functionAddress, jlong __result) {
    clang_Type_getObjCTypeArgPROC clang_Type_getObjCTypeArg = (clang_Type_getObjCTypeArgPROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(intptr_t)__result) = clang_Type_getObjCTypeArg(*T, i);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1isFunctionTypeVariadic(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_isFunctionTypeVariadicPROC clang_isFunctionTypeVariadic = (clang_isFunctionTypeVariadicPROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_isFunctionTypeVariadic(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorResultType(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorResultTypePROC clang_getCursorResultType = (clang_getCursorResultTypePROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(intptr_t)__result) = clang_getCursorResultType(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorExceptionSpecificationType(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_getCursorExceptionSpecificationTypePROC clang_getCursorExceptionSpecificationType = (clang_getCursorExceptionSpecificationTypePROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_getCursorExceptionSpecificationType(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1isPODType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_isPODTypePROC clang_isPODType = (clang_isPODTypePROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_isPODType(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getElementType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress, jlong __result) {
    clang_getElementTypePROC clang_getElementType = (clang_getElementTypePROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(intptr_t)__result) = clang_getElementType(*T);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getNumElements(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_getNumElementsPROC clang_getNumElements = (clang_getNumElementsPROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_getNumElements(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getArrayElementType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress, jlong __result) {
    clang_getArrayElementTypePROC clang_getArrayElementType = (clang_getArrayElementTypePROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(intptr_t)__result) = clang_getArrayElementType(*T);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getArraySize(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_getArraySizePROC clang_getArraySize = (clang_getArraySizePROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_getArraySize(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getNamedType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress, jlong __result) {
    clang_Type_getNamedTypePROC clang_Type_getNamedType = (clang_Type_getNamedTypePROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(intptr_t)__result) = clang_Type_getNamedType(*T);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1isTransparentTagTypedef(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_Type_isTransparentTagTypedefPROC clang_Type_isTransparentTagTypedef = (clang_Type_isTransparentTagTypedefPROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Type_isTransparentTagTypedef(*T);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getNullability(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_Type_getNullabilityPROC clang_Type_getNullability = (clang_Type_getNullabilityPROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Type_getNullability(*T);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getAlignOf(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_Type_getAlignOfPROC clang_Type_getAlignOf = (clang_Type_getAlignOfPROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_Type_getAlignOf(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getClassType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress, jlong __result) {
    clang_Type_getClassTypePROC clang_Type_getClassType = (clang_Type_getClassTypePROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(intptr_t)__result) = clang_Type_getClassType(*T);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getSizeOf(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_Type_getSizeOfPROC clang_Type_getSizeOf = (clang_Type_getSizeOfPROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_Type_getSizeOf(*T);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getOffsetOf(JNIEnv *__env, jclass clazz, jlong TAddress, jlong SAddress, jlong __functionAddress) {
    clang_Type_getOffsetOfPROC clang_Type_getOffsetOf = (clang_Type_getOffsetOfPROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    intptr_t S = (intptr_t)SAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_Type_getOffsetOf(*T, S);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getModifiedType(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress, jlong __result) {
    clang_Type_getModifiedTypePROC clang_Type_getModifiedType = (clang_Type_getModifiedTypePROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(intptr_t)__result) = clang_Type_getModifiedType(*T);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getOffsetOfField(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_getOffsetOfFieldPROC clang_Cursor_getOffsetOfField = (clang_Cursor_getOffsetOfFieldPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_Cursor_getOffsetOfField(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isAnonymous(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_isAnonymousPROC clang_Cursor_isAnonymous = (clang_Cursor_isAnonymousPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Cursor_isAnonymous(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getNumTemplateArguments(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_Type_getNumTemplateArgumentsPROC clang_Type_getNumTemplateArguments = (clang_Type_getNumTemplateArgumentsPROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Type_getNumTemplateArguments(*T);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getTemplateArgumentAsType(JNIEnv *__env, jclass clazz, jlong TAddress, jint i, jlong __functionAddress, jlong __result) {
    clang_Type_getTemplateArgumentAsTypePROC clang_Type_getTemplateArgumentAsType = (clang_Type_getTemplateArgumentAsTypePROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(intptr_t)__result) = clang_Type_getTemplateArgumentAsType(*T, i);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1getCXXRefQualifier(JNIEnv *__env, jclass clazz, jlong TAddress, jlong __functionAddress) {
    clang_Type_getCXXRefQualifierPROC clang_Type_getCXXRefQualifier = (clang_Type_getCXXRefQualifierPROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Type_getCXXRefQualifier(*T);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isBitField(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_isBitFieldPROC clang_Cursor_isBitField = (clang_Cursor_isBitFieldPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Cursor_isBitField(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1isVirtualBase(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_isVirtualBasePROC clang_isVirtualBase = (clang_isVirtualBasePROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_isVirtualBase(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCXXAccessSpecifier(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getCXXAccessSpecifierPROC clang_getCXXAccessSpecifier = (clang_getCXXAccessSpecifierPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_getCXXAccessSpecifier(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getStorageClass(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_Cursor_getStorageClassPROC clang_Cursor_getStorageClass = (clang_Cursor_getStorageClassPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Cursor_getStorageClass(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getNumOverloadedDecls(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getNumOverloadedDeclsPROC clang_getNumOverloadedDecls = (clang_getNumOverloadedDeclsPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_getNumOverloadedDecls(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getOverloadedDecl(JNIEnv *__env, jclass clazz, jlong cursorAddress, jint index, jlong __functionAddress, jlong __result) {
    clang_getOverloadedDeclPROC clang_getOverloadedDecl = (clang_getOverloadedDeclPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(intptr_t)__result) = clang_getOverloadedDecl(*cursor, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getIBOutletCollectionType(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getIBOutletCollectionTypePROC clang_getIBOutletCollectionType = (clang_getIBOutletCollectionTypePROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(intptr_t)__result) = clang_getIBOutletCollectionType(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1visitChildren(JNIEnv *__env, jclass clazz, jlong parentAddress, jlong visitorAddress, jlong client_dataAddress, jlong __functionAddress) {
    clang_visitChildrenPROC clang_visitChildren = (clang_visitChildrenPROC)(intptr_t)__functionAddress;
    CXCursor *parent = (CXCursor *)(intptr_t)parentAddress;
    intptr_t visitor = (intptr_t)visitorAddress;
    intptr_t client_data = (intptr_t)client_dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_visitChildren(*parent, visitor, client_data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorUSR(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorUSRPROC clang_getCursorUSR = (clang_getCursorUSRPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getCursorUSR(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1constructUSR_1ObjCClass(JNIEnv *__env, jclass clazz, jlong class_nameAddress, jlong __functionAddress, jlong __result) {
    clang_constructUSR_ObjCClassPROC clang_constructUSR_ObjCClass = (clang_constructUSR_ObjCClassPROC)(intptr_t)__functionAddress;
    intptr_t class_name = (intptr_t)class_nameAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_constructUSR_ObjCClass(class_name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1constructUSR_1ObjCCategory(JNIEnv *__env, jclass clazz, jlong class_nameAddress, jlong category_nameAddress, jlong __functionAddress, jlong __result) {
    clang_constructUSR_ObjCCategoryPROC clang_constructUSR_ObjCCategory = (clang_constructUSR_ObjCCategoryPROC)(intptr_t)__functionAddress;
    intptr_t class_name = (intptr_t)class_nameAddress;
    intptr_t category_name = (intptr_t)category_nameAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_constructUSR_ObjCCategory(class_name, category_name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1constructUSR_1ObjCProtocol(JNIEnv *__env, jclass clazz, jlong protocol_nameAddress, jlong __functionAddress, jlong __result) {
    clang_constructUSR_ObjCProtocolPROC clang_constructUSR_ObjCProtocol = (clang_constructUSR_ObjCProtocolPROC)(intptr_t)__functionAddress;
    intptr_t protocol_name = (intptr_t)protocol_nameAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_constructUSR_ObjCProtocol(protocol_name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1constructUSR_1ObjCIvar(JNIEnv *__env, jclass clazz, jlong nameAddress, jlong classUSRAddress, jlong __functionAddress, jlong __result) {
    clang_constructUSR_ObjCIvarPROC clang_constructUSR_ObjCIvar = (clang_constructUSR_ObjCIvarPROC)(intptr_t)__functionAddress;
    intptr_t name = (intptr_t)nameAddress;
    CXString *classUSR = (CXString *)(intptr_t)classUSRAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_constructUSR_ObjCIvar(name, *classUSR);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1constructUSR_1ObjCMethod(JNIEnv *__env, jclass clazz, jlong nameAddress, jint isInstanceMethod, jlong classUSRAddress, jlong __functionAddress, jlong __result) {
    clang_constructUSR_ObjCMethodPROC clang_constructUSR_ObjCMethod = (clang_constructUSR_ObjCMethodPROC)(intptr_t)__functionAddress;
    intptr_t name = (intptr_t)nameAddress;
    CXString *classUSR = (CXString *)(intptr_t)classUSRAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_constructUSR_ObjCMethod(name, isInstanceMethod, *classUSR);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1constructUSR_1ObjCProperty(JNIEnv *__env, jclass clazz, jlong propertyAddress, jlong classUSRAddress, jlong __functionAddress, jlong __result) {
    clang_constructUSR_ObjCPropertyPROC clang_constructUSR_ObjCProperty = (clang_constructUSR_ObjCPropertyPROC)(intptr_t)__functionAddress;
    intptr_t property = (intptr_t)propertyAddress;
    CXString *classUSR = (CXString *)(intptr_t)classUSRAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_constructUSR_ObjCProperty(property, *classUSR);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorSpelling(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorSpellingPROC clang_getCursorSpelling = (clang_getCursorSpellingPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getCursorSpelling(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getSpellingNameRange(JNIEnv *__env, jclass clazz, jlong cursorAddress, jint pieceIndex, jint options, jlong __functionAddress, jlong __result) {
    clang_Cursor_getSpellingNameRangePROC clang_Cursor_getSpellingNameRange = (clang_Cursor_getSpellingNameRangePROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceRange*)(intptr_t)__result) = clang_Cursor_getSpellingNameRange(*cursor, pieceIndex, options);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorPrintingPolicy(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getCursorPrintingPolicyPROC clang_getCursorPrintingPolicy = (clang_getCursorPrintingPolicyPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_getCursorPrintingPolicy(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorPrettyPrinted(JNIEnv *__env, jclass clazz, jlong CursorAddress, jlong PolicyAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorPrettyPrintedPROC clang_getCursorPrettyPrinted = (clang_getCursorPrettyPrintedPROC)(intptr_t)__functionAddress;
    CXCursor *Cursor = (CXCursor *)(intptr_t)CursorAddress;
    intptr_t Policy = (intptr_t)PolicyAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getCursorPrettyPrinted(*Cursor, Policy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorDisplayName(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorDisplayNamePROC clang_getCursorDisplayName = (clang_getCursorDisplayNamePROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getCursorDisplayName(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorReferenced(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorReferencedPROC clang_getCursorReferenced = (clang_getCursorReferencedPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(intptr_t)__result) = clang_getCursorReferenced(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorDefinition(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getCursorDefinitionPROC clang_getCursorDefinition = (clang_getCursorDefinitionPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(intptr_t)__result) = clang_getCursorDefinition(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1isCursorDefinition(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_isCursorDefinitionPROC clang_isCursorDefinition = (clang_isCursorDefinitionPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_isCursorDefinition(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCanonicalCursor(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_getCanonicalCursorPROC clang_getCanonicalCursor = (clang_getCanonicalCursorPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(intptr_t)__result) = clang_getCanonicalCursor(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getObjCSelectorIndex(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_Cursor_getObjCSelectorIndexPROC clang_Cursor_getObjCSelectorIndex = (clang_Cursor_getObjCSelectorIndexPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Cursor_getObjCSelectorIndex(*cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isDynamicCall(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_isDynamicCallPROC clang_Cursor_isDynamicCall = (clang_Cursor_isDynamicCallPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Cursor_isDynamicCall(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getReceiverType(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_Cursor_getReceiverTypePROC clang_Cursor_getReceiverType = (clang_Cursor_getReceiverTypePROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXType*)(intptr_t)__result) = clang_Cursor_getReceiverType(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getObjCPropertyAttributes(JNIEnv *__env, jclass clazz, jlong CAddress, jint reserved, jlong __functionAddress) {
    clang_Cursor_getObjCPropertyAttributesPROC clang_Cursor_getObjCPropertyAttributes = (clang_Cursor_getObjCPropertyAttributesPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Cursor_getObjCPropertyAttributes(*C, reserved);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getObjCPropertyGetterName(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_Cursor_getObjCPropertyGetterNamePROC clang_Cursor_getObjCPropertyGetterName = (clang_Cursor_getObjCPropertyGetterNamePROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_Cursor_getObjCPropertyGetterName(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getObjCPropertySetterName(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_Cursor_getObjCPropertySetterNamePROC clang_Cursor_getObjCPropertySetterName = (clang_Cursor_getObjCPropertySetterNamePROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_Cursor_getObjCPropertySetterName(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getObjCDeclQualifiers(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_getObjCDeclQualifiersPROC clang_Cursor_getObjCDeclQualifiers = (clang_Cursor_getObjCDeclQualifiersPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Cursor_getObjCDeclQualifiers(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isObjCOptional(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_isObjCOptionalPROC clang_Cursor_isObjCOptional = (clang_Cursor_isObjCOptionalPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Cursor_isObjCOptional(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isVariadic(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_isVariadicPROC clang_Cursor_isVariadic = (clang_Cursor_isVariadicPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Cursor_isVariadic(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1isExternalSymbol(JNIEnv *__env, jclass clazz, jlong CAddress, jlong languageAddress, jlong definedInAddress, jlong isGeneratedAddress, jlong __functionAddress) {
    clang_Cursor_isExternalSymbolPROC clang_Cursor_isExternalSymbol = (clang_Cursor_isExternalSymbolPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    intptr_t language = (intptr_t)languageAddress;
    intptr_t definedIn = (intptr_t)definedInAddress;
    intptr_t isGenerated = (intptr_t)isGeneratedAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Cursor_isExternalSymbol(*C, language, definedIn, isGenerated);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getCommentRange(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_Cursor_getCommentRangePROC clang_Cursor_getCommentRange = (clang_Cursor_getCommentRangePROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceRange*)(intptr_t)__result) = clang_Cursor_getCommentRange(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getRawCommentText(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_Cursor_getRawCommentTextPROC clang_Cursor_getRawCommentText = (clang_Cursor_getRawCommentTextPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_Cursor_getRawCommentText(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getBriefCommentText(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_Cursor_getBriefCommentTextPROC clang_Cursor_getBriefCommentText = (clang_Cursor_getBriefCommentTextPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_Cursor_getBriefCommentText(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getMangling(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress, jlong __result) {
    clang_Cursor_getManglingPROC clang_Cursor_getMangling = (clang_Cursor_getManglingPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_Cursor_getMangling(*cursor);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getCXXManglings(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_Cursor_getCXXManglingsPROC clang_Cursor_getCXXManglings = (clang_Cursor_getCXXManglingsPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_Cursor_getCXXManglings(*cursor);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getObjCManglings(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_Cursor_getObjCManglingsPROC clang_Cursor_getObjCManglings = (clang_Cursor_getObjCManglingsPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_Cursor_getObjCManglings(*cursor);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1getModule(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_getModulePROC clang_Cursor_getModule = (clang_Cursor_getModulePROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_Cursor_getModule(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Module_1getName(JNIEnv *__env, jclass clazz, jlong ModuleAddress, jlong __functionAddress, jlong __result) {
    clang_Module_getNamePROC clang_Module_getName = (clang_Module_getNamePROC)(intptr_t)__functionAddress;
    intptr_t Module = (intptr_t)ModuleAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_Module_getName(Module);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Module_1getFullName(JNIEnv *__env, jclass clazz, jlong ModuleAddress, jlong __functionAddress, jlong __result) {
    clang_Module_getFullNamePROC clang_Module_getFullName = (clang_Module_getFullNamePROC)(intptr_t)__functionAddress;
    intptr_t Module = (intptr_t)ModuleAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_Module_getFullName(Module);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXConstructor_1isConvertingConstructor(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXConstructor_isConvertingConstructorPROC clang_CXXConstructor_isConvertingConstructor = (clang_CXXConstructor_isConvertingConstructorPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_CXXConstructor_isConvertingConstructor(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXConstructor_1isCopyConstructor(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXConstructor_isCopyConstructorPROC clang_CXXConstructor_isCopyConstructor = (clang_CXXConstructor_isCopyConstructorPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_CXXConstructor_isCopyConstructor(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXConstructor_1isDefaultConstructor(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXConstructor_isDefaultConstructorPROC clang_CXXConstructor_isDefaultConstructor = (clang_CXXConstructor_isDefaultConstructorPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_CXXConstructor_isDefaultConstructor(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXConstructor_1isMoveConstructor(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXConstructor_isMoveConstructorPROC clang_CXXConstructor_isMoveConstructor = (clang_CXXConstructor_isMoveConstructorPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_CXXConstructor_isMoveConstructor(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXField_1isMutable(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXField_isMutablePROC clang_CXXField_isMutable = (clang_CXXField_isMutablePROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_CXXField_isMutable(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXMethod_1isDefaulted(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXMethod_isDefaultedPROC clang_CXXMethod_isDefaulted = (clang_CXXMethod_isDefaultedPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_CXXMethod_isDefaulted(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXMethod_1isPureVirtual(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXMethod_isPureVirtualPROC clang_CXXMethod_isPureVirtual = (clang_CXXMethod_isPureVirtualPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_CXXMethod_isPureVirtual(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXMethod_1isStatic(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXMethod_isStaticPROC clang_CXXMethod_isStatic = (clang_CXXMethod_isStaticPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_CXXMethod_isStatic(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXMethod_1isVirtual(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXMethod_isVirtualPROC clang_CXXMethod_isVirtual = (clang_CXXMethod_isVirtualPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_CXXMethod_isVirtual(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXRecord_1isAbstract(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXRecord_isAbstractPROC clang_CXXRecord_isAbstract = (clang_CXXRecord_isAbstractPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_CXXRecord_isAbstract(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1EnumDecl_1isScoped(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_EnumDecl_isScopedPROC clang_EnumDecl_isScoped = (clang_EnumDecl_isScopedPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_EnumDecl_isScoped(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1CXXMethod_1isConst(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_CXXMethod_isConstPROC clang_CXXMethod_isConst = (clang_CXXMethod_isConstPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_CXXMethod_isConst(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTemplateCursorKind(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_getTemplateCursorKindPROC clang_getTemplateCursorKind = (clang_getTemplateCursorKindPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_getTemplateCursorKind(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getSpecializedCursorTemplate(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_getSpecializedCursorTemplatePROC clang_getSpecializedCursorTemplate = (clang_getSpecializedCursorTemplatePROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXCursor*)(intptr_t)__result) = clang_getSpecializedCursorTemplate(*C);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorReferenceNameRange(JNIEnv *__env, jclass clazz, jlong CAddress, jint NameFlags, jint PieceIndex, jlong __functionAddress, jlong __result) {
    clang_getCursorReferenceNameRangePROC clang_getCursorReferenceNameRange = (clang_getCursorReferenceNameRangePROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceRange*)(intptr_t)__result) = clang_getCursorReferenceNameRange(*C, NameFlags, PieceIndex);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getToken(JNIEnv *__env, jclass clazz, jlong TUAddress, jlong LocationAddress, jlong __functionAddress) {
    clang_getTokenPROC clang_getToken = (clang_getTokenPROC)(intptr_t)__functionAddress;
    intptr_t TU = (intptr_t)TUAddress;
    CXSourceLocation *Location = (CXSourceLocation *)(intptr_t)LocationAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_getToken(TU, *Location);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTokenKind(JNIEnv *__env, jclass clazz, jlong tokenAddress, jlong __functionAddress) {
    clang_getTokenKindPROC clang_getTokenKind = (clang_getTokenKindPROC)(intptr_t)__functionAddress;
    CXToken *token = (CXToken *)(intptr_t)tokenAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_getTokenKind(*token);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTokenSpelling(JNIEnv *__env, jclass clazz, jlong TUAddress, jlong tokenAddress, jlong __functionAddress, jlong __result) {
    clang_getTokenSpellingPROC clang_getTokenSpelling = (clang_getTokenSpellingPROC)(intptr_t)__functionAddress;
    intptr_t TU = (intptr_t)TUAddress;
    CXToken *token = (CXToken *)(intptr_t)tokenAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getTokenSpelling(TU, *token);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTokenLocation(JNIEnv *__env, jclass clazz, jlong TUAddress, jlong tokenAddress, jlong __functionAddress, jlong __result) {
    clang_getTokenLocationPROC clang_getTokenLocation = (clang_getTokenLocationPROC)(intptr_t)__functionAddress;
    intptr_t TU = (intptr_t)TUAddress;
    CXToken *token = (CXToken *)(intptr_t)tokenAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceLocation*)(intptr_t)__result) = clang_getTokenLocation(TU, *token);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getTokenExtent(JNIEnv *__env, jclass clazz, jlong TUAddress, jlong tokenAddress, jlong __functionAddress, jlong __result) {
    clang_getTokenExtentPROC clang_getTokenExtent = (clang_getTokenExtentPROC)(intptr_t)__functionAddress;
    intptr_t TU = (intptr_t)TUAddress;
    CXToken *token = (CXToken *)(intptr_t)tokenAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceRange*)(intptr_t)__result) = clang_getTokenExtent(TU, *token);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1tokenize(JNIEnv *__env, jclass clazz, jlong TUAddress, jlong RangeAddress, jlong TokensAddress, jlong NumTokensAddress, jlong __functionAddress) {
    clang_tokenizePROC clang_tokenize = (clang_tokenizePROC)(intptr_t)__functionAddress;
    intptr_t TU = (intptr_t)TUAddress;
    CXSourceRange *Range = (CXSourceRange *)(intptr_t)RangeAddress;
    intptr_t Tokens = (intptr_t)TokensAddress;
    intptr_t NumTokens = (intptr_t)NumTokensAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_tokenize(TU, *Range, Tokens, NumTokens);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorKindSpelling(JNIEnv *__env, jclass clazz, jint Kind, jlong __functionAddress, jlong __result) {
    clang_getCursorKindSpellingPROC clang_getCursorKindSpelling = (clang_getCursorKindSpellingPROC)(intptr_t)__functionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getCursorKindSpelling(Kind);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getDefinitionSpellingAndExtent(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong startBufAddress, jlong endBufAddress, jlong startLineAddress, jlong startColumnAddress, jlong endLineAddress, jlong endColumnAddress, jlong __functionAddress) {
    clang_getDefinitionSpellingAndExtentPROC clang_getDefinitionSpellingAndExtent = (clang_getDefinitionSpellingAndExtentPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    intptr_t startBuf = (intptr_t)startBufAddress;
    intptr_t endBuf = (intptr_t)endBufAddress;
    intptr_t startLine = (intptr_t)startLineAddress;
    intptr_t startColumn = (intptr_t)startColumnAddress;
    intptr_t endLine = (intptr_t)endLineAddress;
    intptr_t endColumn = (intptr_t)endColumnAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_getDefinitionSpellingAndExtent(*cursor, startBuf, endBuf, startLine, startColumn, endLine, endColumn);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCompletionChunkText(JNIEnv *__env, jclass clazz, jlong completion_stringAddress, jint chunk_number, jlong __functionAddress, jlong __result) {
    clang_getCompletionChunkTextPROC clang_getCompletionChunkText = (clang_getCompletionChunkTextPROC)(intptr_t)__functionAddress;
    intptr_t completion_string = (intptr_t)completion_stringAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getCompletionChunkText(completion_string, chunk_number);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCompletionAnnotation(JNIEnv *__env, jclass clazz, jlong completion_stringAddress, jint annotation_number, jlong __functionAddress, jlong __result) {
    clang_getCompletionAnnotationPROC clang_getCompletionAnnotation = (clang_getCompletionAnnotationPROC)(intptr_t)__functionAddress;
    intptr_t completion_string = (intptr_t)completion_stringAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getCompletionAnnotation(completion_string, annotation_number);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCompletionParent(JNIEnv *__env, jclass clazz, jlong completion_stringAddress, jlong kindAddress, jlong __functionAddress, jlong __result) {
    clang_getCompletionParentPROC clang_getCompletionParent = (clang_getCompletionParentPROC)(intptr_t)__functionAddress;
    intptr_t completion_string = (intptr_t)completion_stringAddress;
    intptr_t kind = (intptr_t)kindAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getCompletionParent(completion_string, kind);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCompletionBriefComment(JNIEnv *__env, jclass clazz, jlong completion_stringAddress, jlong __functionAddress, jlong __result) {
    clang_getCompletionBriefCommentPROC clang_getCompletionBriefComment = (clang_getCompletionBriefCommentPROC)(intptr_t)__functionAddress;
    intptr_t completion_string = (intptr_t)completion_stringAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getCompletionBriefComment(completion_string);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCursorCompletionString(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong __functionAddress) {
    clang_getCursorCompletionStringPROC clang_getCursorCompletionString = (clang_getCursorCompletionStringPROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_getCursorCompletionString(*cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getCompletionFixIt(JNIEnv *__env, jclass clazz, jlong resultsAddress, jint completion_index, jint fixit_index, jlong replacement_rangeAddress, jlong __functionAddress, jlong __result) {
    clang_getCompletionFixItPROC clang_getCompletionFixIt = (clang_getCompletionFixItPROC)(intptr_t)__functionAddress;
    intptr_t results = (intptr_t)resultsAddress;
    intptr_t replacement_range = (intptr_t)replacement_rangeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getCompletionFixIt(results, completion_index, fixit_index, replacement_range);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1codeCompleteGetContainerUSR(JNIEnv *__env, jclass clazz, jlong ResultsAddress, jlong __functionAddress, jlong __result) {
    clang_codeCompleteGetContainerUSRPROC clang_codeCompleteGetContainerUSR = (clang_codeCompleteGetContainerUSRPROC)(intptr_t)__functionAddress;
    intptr_t Results = (intptr_t)ResultsAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_codeCompleteGetContainerUSR(Results);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1codeCompleteGetObjCSelector(JNIEnv *__env, jclass clazz, jlong ResultsAddress, jlong __functionAddress, jlong __result) {
    clang_codeCompleteGetObjCSelectorPROC clang_codeCompleteGetObjCSelector = (clang_codeCompleteGetObjCSelectorPROC)(intptr_t)__functionAddress;
    intptr_t Results = (intptr_t)ResultsAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_codeCompleteGetObjCSelector(Results);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1getClangVersion(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong __result) {
    clang_getClangVersionPROC clang_getClangVersion = (clang_getClangVersionPROC)(intptr_t)__functionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_getClangVersion();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Cursor_1Evaluate(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress) {
    clang_Cursor_EvaluatePROC clang_Cursor_Evaluate = (clang_Cursor_EvaluatePROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)clang_Cursor_Evaluate(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1findReferencesInFile(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong fileAddress, jlong visitorAddress, jlong __functionAddress) {
    clang_findReferencesInFilePROC clang_findReferencesInFile = (clang_findReferencesInFilePROC)(intptr_t)__functionAddress;
    CXCursor *cursor = (CXCursor *)(intptr_t)cursorAddress;
    intptr_t file = (intptr_t)fileAddress;
    CXCursorAndRangeVisitor *visitor = (CXCursorAndRangeVisitor *)(intptr_t)visitorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_findReferencesInFile(*cursor, file, *visitor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1findIncludesInFile(JNIEnv *__env, jclass clazz, jlong TUAddress, jlong fileAddress, jlong visitorAddress, jlong __functionAddress) {
    clang_findIncludesInFilePROC clang_findIncludesInFile = (clang_findIncludesInFilePROC)(intptr_t)__functionAddress;
    intptr_t TU = (intptr_t)TUAddress;
    intptr_t file = (intptr_t)fileAddress;
    CXCursorAndRangeVisitor *visitor = (CXCursorAndRangeVisitor *)(intptr_t)visitorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_findIncludesInFile(TU, file, *visitor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1indexLoc_1getFileLocation(JNIEnv *__env, jclass clazz, jlong locAddress, jlong indexFileAddress, jlong fileAddress, jlong lineAddress, jlong columnAddress, jlong offsetAddress, jlong __functionAddress) {
    clang_indexLoc_getFileLocationPROC clang_indexLoc_getFileLocation = (clang_indexLoc_getFileLocationPROC)(intptr_t)__functionAddress;
    CXIdxLoc *loc = (CXIdxLoc *)(intptr_t)locAddress;
    intptr_t indexFile = (intptr_t)indexFileAddress;
    intptr_t file = (intptr_t)fileAddress;
    intptr_t line = (intptr_t)lineAddress;
    intptr_t column = (intptr_t)columnAddress;
    intptr_t offset = (intptr_t)offsetAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_indexLoc_getFileLocation(*loc, indexFile, file, line, column, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1indexLoc_1getCXSourceLocation(JNIEnv *__env, jclass clazz, jlong locAddress, jlong __functionAddress, jlong __result) {
    clang_indexLoc_getCXSourceLocationPROC clang_indexLoc_getCXSourceLocation = (clang_indexLoc_getCXSourceLocationPROC)(intptr_t)__functionAddress;
    CXIdxLoc *loc = (CXIdxLoc *)(intptr_t)locAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXSourceLocation*)(intptr_t)__result) = clang_indexLoc_getCXSourceLocation(*loc);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangIndex_nclang_1Type_1visitFields(JNIEnv *__env, jclass clazz, jlong TAddress, jlong visitorAddress, jlong client_dataAddress, jlong __functionAddress) {
    clang_Type_visitFieldsPROC clang_Type_visitFields = (clang_Type_visitFieldsPROC)(intptr_t)__functionAddress;
    CXType *T = (CXType *)(intptr_t)TAddress;
    intptr_t visitor = (intptr_t)visitorAddress;
    intptr_t client_data = (intptr_t)client_dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Type_visitFields(*T, visitor, client_data);
}

EXTERN_C_EXIT
