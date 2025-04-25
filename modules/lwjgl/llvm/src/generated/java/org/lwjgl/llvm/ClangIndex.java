/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ClangIndex {

    static { LibLLVM.initialize(); }

    private static final SharedLibrary CLANG = Library.loadNative(ClangIndex.class, "org.lwjgl.llvm", Configuration.LLVM_CLANG_LIBRARY_NAME, "clang", "libclang");

    /** Contains the function pointers loaded from the CLANG {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            getCString                              = apiGetFunctionAddress(CLANG, "clang_getCString"),
            disposeString                           = apiGetFunctionAddress(CLANG, "clang_disposeString"),
            disposeStringSet                        = apiGetFunctionAddress(CLANG, "clang_disposeStringSet"),
            createIndex                             = apiGetFunctionAddress(CLANG, "clang_createIndex"),
            disposeIndex                            = apiGetFunctionAddress(CLANG, "clang_disposeIndex"),
            createIndexWithOptions                  = apiGetFunctionAddressOptional(CLANG, "clang_createIndexWithOptions"),
            CXIndex_setGlobalOptions                = apiGetFunctionAddress(CLANG, "clang_CXIndex_setGlobalOptions"),
            CXIndex_getGlobalOptions                = apiGetFunctionAddress(CLANG, "clang_CXIndex_getGlobalOptions"),
            CXIndex_setInvocationEmissionPathOption = apiGetFunctionAddressOptional(CLANG, "clang_CXIndex_setInvocationEmissionPathOption"),
            getFileName                             = apiGetFunctionAddress(CLANG, "clang_getFileName"),
            getFileTime                             = apiGetFunctionAddress(CLANG, "clang_getFileTime"),
            getFileUniqueID                         = apiGetFunctionAddress(CLANG, "clang_getFileUniqueID"),
            isFileMultipleIncludeGuarded            = apiGetFunctionAddress(CLANG, "clang_isFileMultipleIncludeGuarded"),
            getFile                                 = apiGetFunctionAddress(CLANG, "clang_getFile"),
            getFileContents                         = apiGetFunctionAddressOptional(CLANG, "clang_getFileContents"),
            File_isEqual                            = apiGetFunctionAddress(CLANG, "clang_File_isEqual"),
            File_tryGetRealPathName                 = apiGetFunctionAddressOptional(CLANG, "clang_File_tryGetRealPathName"),
            getNullLocation                         = apiGetFunctionAddress(CLANG, "clang_getNullLocation"),
            equalLocations                          = apiGetFunctionAddress(CLANG, "clang_equalLocations"),
            isBeforeInTranslationUnit               = apiGetFunctionAddressOptional(CLANG, "clang_isBeforeInTranslationUnit"),
            getLocation                             = apiGetFunctionAddress(CLANG, "clang_getLocation"),
            getLocationForOffset                    = apiGetFunctionAddress(CLANG, "clang_getLocationForOffset"),
            Location_isInSystemHeader               = apiGetFunctionAddress(CLANG, "clang_Location_isInSystemHeader"),
            Location_isFromMainFile                 = apiGetFunctionAddress(CLANG, "clang_Location_isFromMainFile"),
            getNullRange                            = apiGetFunctionAddress(CLANG, "clang_getNullRange"),
            getRange                                = apiGetFunctionAddress(CLANG, "clang_getRange"),
            equalRanges                             = apiGetFunctionAddress(CLANG, "clang_equalRanges"),
            Range_isNull                            = apiGetFunctionAddress(CLANG, "clang_Range_isNull"),
            getExpansionLocation                    = apiGetFunctionAddress(CLANG, "clang_getExpansionLocation"),
            getPresumedLocation                     = apiGetFunctionAddress(CLANG, "clang_getPresumedLocation"),
            getSpellingLocation                     = apiGetFunctionAddress(CLANG, "clang_getSpellingLocation"),
            getFileLocation                         = apiGetFunctionAddress(CLANG, "clang_getFileLocation"),
            getRangeStart                           = apiGetFunctionAddress(CLANG, "clang_getRangeStart"),
            getRangeEnd                             = apiGetFunctionAddress(CLANG, "clang_getRangeEnd"),
            getSkippedRanges                        = apiGetFunctionAddress(CLANG, "clang_getSkippedRanges"),
            getAllSkippedRanges                     = apiGetFunctionAddress(CLANG, "clang_getAllSkippedRanges"),
            disposeSourceRangeList                  = apiGetFunctionAddress(CLANG, "clang_disposeSourceRangeList"),
            getNumDiagnosticsInSet                  = apiGetFunctionAddress(CLANG, "clang_getNumDiagnosticsInSet"),
            getDiagnosticInSet                      = apiGetFunctionAddress(CLANG, "clang_getDiagnosticInSet"),
            loadDiagnostics                         = apiGetFunctionAddress(CLANG, "clang_loadDiagnostics"),
            disposeDiagnosticSet                    = apiGetFunctionAddress(CLANG, "clang_disposeDiagnosticSet"),
            getChildDiagnostics                     = apiGetFunctionAddress(CLANG, "clang_getChildDiagnostics"),
            getNumDiagnostics                       = apiGetFunctionAddress(CLANG, "clang_getNumDiagnostics"),
            getDiagnostic                           = apiGetFunctionAddress(CLANG, "clang_getDiagnostic"),
            getDiagnosticSetFromTU                  = apiGetFunctionAddress(CLANG, "clang_getDiagnosticSetFromTU"),
            disposeDiagnostic                       = apiGetFunctionAddress(CLANG, "clang_disposeDiagnostic"),
            formatDiagnostic                        = apiGetFunctionAddress(CLANG, "clang_formatDiagnostic"),
            defaultDiagnosticDisplayOptions         = apiGetFunctionAddress(CLANG, "clang_defaultDiagnosticDisplayOptions"),
            getDiagnosticSeverity                   = apiGetFunctionAddress(CLANG, "clang_getDiagnosticSeverity"),
            getDiagnosticLocation                   = apiGetFunctionAddress(CLANG, "clang_getDiagnosticLocation"),
            getDiagnosticSpelling                   = apiGetFunctionAddress(CLANG, "clang_getDiagnosticSpelling"),
            getDiagnosticOption                     = apiGetFunctionAddress(CLANG, "clang_getDiagnosticOption"),
            getDiagnosticCategory                   = apiGetFunctionAddress(CLANG, "clang_getDiagnosticCategory"),
            getDiagnosticCategoryText               = apiGetFunctionAddress(CLANG, "clang_getDiagnosticCategoryText"),
            getDiagnosticNumRanges                  = apiGetFunctionAddress(CLANG, "clang_getDiagnosticNumRanges"),
            getDiagnosticRange                      = apiGetFunctionAddress(CLANG, "clang_getDiagnosticRange"),
            getDiagnosticNumFixIts                  = apiGetFunctionAddress(CLANG, "clang_getDiagnosticNumFixIts"),
            getDiagnosticFixIt                      = apiGetFunctionAddress(CLANG, "clang_getDiagnosticFixIt"),
            getTranslationUnitSpelling              = apiGetFunctionAddress(CLANG, "clang_getTranslationUnitSpelling"),
            createTranslationUnitFromSourceFile     = apiGetFunctionAddress(CLANG, "clang_createTranslationUnitFromSourceFile"),
            createTranslationUnit                   = apiGetFunctionAddress(CLANG, "clang_createTranslationUnit"),
            createTranslationUnit2                  = apiGetFunctionAddress(CLANG, "clang_createTranslationUnit2"),
            defaultEditingTranslationUnitOptions    = apiGetFunctionAddress(CLANG, "clang_defaultEditingTranslationUnitOptions"),
            parseTranslationUnit                    = apiGetFunctionAddress(CLANG, "clang_parseTranslationUnit"),
            parseTranslationUnit2                   = apiGetFunctionAddress(CLANG, "clang_parseTranslationUnit2"),
            parseTranslationUnit2FullArgv           = apiGetFunctionAddress(CLANG, "clang_parseTranslationUnit2FullArgv"),
            defaultSaveOptions                      = apiGetFunctionAddress(CLANG, "clang_defaultSaveOptions"),
            saveTranslationUnit                     = apiGetFunctionAddress(CLANG, "clang_saveTranslationUnit"),
            suspendTranslationUnit                  = apiGetFunctionAddress(CLANG, "clang_suspendTranslationUnit"),
            disposeTranslationUnit                  = apiGetFunctionAddress(CLANG, "clang_disposeTranslationUnit"),
            defaultReparseOptions                   = apiGetFunctionAddress(CLANG, "clang_defaultReparseOptions"),
            reparseTranslationUnit                  = apiGetFunctionAddress(CLANG, "clang_reparseTranslationUnit"),
            getTUResourceUsageName                  = apiGetFunctionAddress(CLANG, "clang_getTUResourceUsageName"),
            getCXTUResourceUsage                    = apiGetFunctionAddress(CLANG, "clang_getCXTUResourceUsage"),
            disposeCXTUResourceUsage                = apiGetFunctionAddress(CLANG, "clang_disposeCXTUResourceUsage"),
            getTranslationUnitTargetInfo            = apiGetFunctionAddress(CLANG, "clang_getTranslationUnitTargetInfo"),
            TargetInfo_dispose                      = apiGetFunctionAddress(CLANG, "clang_TargetInfo_dispose"),
            TargetInfo_getTriple                    = apiGetFunctionAddress(CLANG, "clang_TargetInfo_getTriple"),
            TargetInfo_getPointerWidth              = apiGetFunctionAddress(CLANG, "clang_TargetInfo_getPointerWidth"),
            getNullCursor                           = apiGetFunctionAddress(CLANG, "clang_getNullCursor"),
            getTranslationUnitCursor                = apiGetFunctionAddress(CLANG, "clang_getTranslationUnitCursor"),
            equalCursors                            = apiGetFunctionAddress(CLANG, "clang_equalCursors"),
            Cursor_isNull                           = apiGetFunctionAddress(CLANG, "clang_Cursor_isNull"),
            hashCursor                              = apiGetFunctionAddress(CLANG, "clang_hashCursor"),
            getCursorKind                           = apiGetFunctionAddress(CLANG, "clang_getCursorKind"),
            isDeclaration                           = apiGetFunctionAddress(CLANG, "clang_isDeclaration"),
            isInvalidDeclaration                    = apiGetFunctionAddressOptional(CLANG, "clang_isInvalidDeclaration"),
            isReference                             = apiGetFunctionAddress(CLANG, "clang_isReference"),
            isExpression                            = apiGetFunctionAddress(CLANG, "clang_isExpression"),
            isStatement                             = apiGetFunctionAddress(CLANG, "clang_isStatement"),
            isAttribute                             = apiGetFunctionAddress(CLANG, "clang_isAttribute"),
            Cursor_hasAttrs                         = apiGetFunctionAddress(CLANG, "clang_Cursor_hasAttrs"),
            isInvalid                               = apiGetFunctionAddress(CLANG, "clang_isInvalid"),
            isTranslationUnit                       = apiGetFunctionAddress(CLANG, "clang_isTranslationUnit"),
            isPreprocessing                         = apiGetFunctionAddress(CLANG, "clang_isPreprocessing"),
            isUnexposed                             = apiGetFunctionAddress(CLANG, "clang_isUnexposed"),
            getCursorLinkage                        = apiGetFunctionAddress(CLANG, "clang_getCursorLinkage"),
            getCursorVisibility                     = apiGetFunctionAddress(CLANG, "clang_getCursorVisibility"),
            getCursorAvailability                   = apiGetFunctionAddress(CLANG, "clang_getCursorAvailability"),
            getCursorPlatformAvailability           = apiGetFunctionAddress(CLANG, "clang_getCursorPlatformAvailability"),
            disposeCXPlatformAvailability           = apiGetFunctionAddress(CLANG, "clang_disposeCXPlatformAvailability"),
            Cursor_getVarDeclInitializer            = apiGetFunctionAddressOptional(CLANG, "clang_Cursor_getVarDeclInitializer"),
            Cursor_hasVarDeclGlobalStorage          = apiGetFunctionAddressOptional(CLANG, "clang_Cursor_hasVarDeclGlobalStorage"),
            Cursor_hasVarDeclExternalStorage        = apiGetFunctionAddressOptional(CLANG, "clang_Cursor_hasVarDeclExternalStorage"),
            getCursorLanguage                       = apiGetFunctionAddress(CLANG, "clang_getCursorLanguage"),
            getCursorTLSKind                        = apiGetFunctionAddressOptional(CLANG, "clang_getCursorTLSKind"),
            Cursor_getTranslationUnit               = apiGetFunctionAddress(CLANG, "clang_Cursor_getTranslationUnit"),
            createCXCursorSet                       = apiGetFunctionAddress(CLANG, "clang_createCXCursorSet"),
            disposeCXCursorSet                      = apiGetFunctionAddress(CLANG, "clang_disposeCXCursorSet"),
            CXCursorSet_contains                    = apiGetFunctionAddress(CLANG, "clang_CXCursorSet_contains"),
            CXCursorSet_insert                      = apiGetFunctionAddress(CLANG, "clang_CXCursorSet_insert"),
            getCursorSemanticParent                 = apiGetFunctionAddress(CLANG, "clang_getCursorSemanticParent"),
            getCursorLexicalParent                  = apiGetFunctionAddress(CLANG, "clang_getCursorLexicalParent"),
            getOverriddenCursors                    = apiGetFunctionAddress(CLANG, "clang_getOverriddenCursors"),
            disposeOverriddenCursors                = apiGetFunctionAddress(CLANG, "clang_disposeOverriddenCursors"),
            getIncludedFile                         = apiGetFunctionAddress(CLANG, "clang_getIncludedFile"),
            getCursor                               = apiGetFunctionAddress(CLANG, "clang_getCursor"),
            getCursorLocation                       = apiGetFunctionAddress(CLANG, "clang_getCursorLocation"),
            getCursorExtent                         = apiGetFunctionAddress(CLANG, "clang_getCursorExtent"),
            getCursorType                           = apiGetFunctionAddress(CLANG, "clang_getCursorType"),
            getTypeSpelling                         = apiGetFunctionAddress(CLANG, "clang_getTypeSpelling"),
            getTypedefDeclUnderlyingType            = apiGetFunctionAddress(CLANG, "clang_getTypedefDeclUnderlyingType"),
            getEnumDeclIntegerType                  = apiGetFunctionAddress(CLANG, "clang_getEnumDeclIntegerType"),
            getEnumConstantDeclValue                = apiGetFunctionAddress(CLANG, "clang_getEnumConstantDeclValue"),
            getEnumConstantDeclUnsignedValue        = apiGetFunctionAddress(CLANG, "clang_getEnumConstantDeclUnsignedValue"),
            Cursor_isBitField                       = apiGetFunctionAddress(CLANG, "clang_Cursor_isBitField"),
            getFieldDeclBitWidth                    = apiGetFunctionAddress(CLANG, "clang_getFieldDeclBitWidth"),
            Cursor_getNumArguments                  = apiGetFunctionAddress(CLANG, "clang_Cursor_getNumArguments"),
            Cursor_getArgument                      = apiGetFunctionAddress(CLANG, "clang_Cursor_getArgument"),
            Cursor_getNumTemplateArguments          = apiGetFunctionAddress(CLANG, "clang_Cursor_getNumTemplateArguments"),
            Cursor_getTemplateArgumentKind          = apiGetFunctionAddress(CLANG, "clang_Cursor_getTemplateArgumentKind"),
            Cursor_getTemplateArgumentType          = apiGetFunctionAddress(CLANG, "clang_Cursor_getTemplateArgumentType"),
            Cursor_getTemplateArgumentValue         = apiGetFunctionAddress(CLANG, "clang_Cursor_getTemplateArgumentValue"),
            Cursor_getTemplateArgumentUnsignedValue = apiGetFunctionAddress(CLANG, "clang_Cursor_getTemplateArgumentUnsignedValue"),
            equalTypes                              = apiGetFunctionAddress(CLANG, "clang_equalTypes"),
            getCanonicalType                        = apiGetFunctionAddress(CLANG, "clang_getCanonicalType"),
            isConstQualifiedType                    = apiGetFunctionAddress(CLANG, "clang_isConstQualifiedType"),
            Cursor_isMacroFunctionLike              = apiGetFunctionAddress(CLANG, "clang_Cursor_isMacroFunctionLike"),
            Cursor_isMacroBuiltin                   = apiGetFunctionAddress(CLANG, "clang_Cursor_isMacroBuiltin"),
            Cursor_isFunctionInlined                = apiGetFunctionAddress(CLANG, "clang_Cursor_isFunctionInlined"),
            isVolatileQualifiedType                 = apiGetFunctionAddress(CLANG, "clang_isVolatileQualifiedType"),
            isRestrictQualifiedType                 = apiGetFunctionAddress(CLANG, "clang_isRestrictQualifiedType"),
            getAddressSpace                         = apiGetFunctionAddress(CLANG, "clang_getAddressSpace"),
            getTypedefName                          = apiGetFunctionAddress(CLANG, "clang_getTypedefName"),
            getPointeeType                          = apiGetFunctionAddress(CLANG, "clang_getPointeeType"),
            getUnqualifiedType                      = apiGetFunctionAddressOptional(CLANG, "clang_getUnqualifiedType"),
            getNonReferenceType                     = apiGetFunctionAddressOptional(CLANG, "clang_getNonReferenceType"),
            getTypeDeclaration                      = apiGetFunctionAddress(CLANG, "clang_getTypeDeclaration"),
            getDeclObjCTypeEncoding                 = apiGetFunctionAddress(CLANG, "clang_getDeclObjCTypeEncoding"),
            Type_getObjCEncoding                    = apiGetFunctionAddress(CLANG, "clang_Type_getObjCEncoding"),
            getTypeKindSpelling                     = apiGetFunctionAddress(CLANG, "clang_getTypeKindSpelling"),
            getFunctionTypeCallingConv              = apiGetFunctionAddress(CLANG, "clang_getFunctionTypeCallingConv"),
            getResultType                           = apiGetFunctionAddress(CLANG, "clang_getResultType"),
            getExceptionSpecificationType           = apiGetFunctionAddress(CLANG, "clang_getExceptionSpecificationType"),
            getNumArgTypes                          = apiGetFunctionAddress(CLANG, "clang_getNumArgTypes"),
            getArgType                              = apiGetFunctionAddress(CLANG, "clang_getArgType"),
            Type_getObjCObjectBaseType              = apiGetFunctionAddressOptional(CLANG, "clang_Type_getObjCObjectBaseType"),
            Type_getNumObjCProtocolRefs             = apiGetFunctionAddressOptional(CLANG, "clang_Type_getNumObjCProtocolRefs"),
            Type_getObjCProtocolDecl                = apiGetFunctionAddressOptional(CLANG, "clang_Type_getObjCProtocolDecl"),
            Type_getNumObjCTypeArgs                 = apiGetFunctionAddressOptional(CLANG, "clang_Type_getNumObjCTypeArgs"),
            Type_getObjCTypeArg                     = apiGetFunctionAddressOptional(CLANG, "clang_Type_getObjCTypeArg"),
            isFunctionTypeVariadic                  = apiGetFunctionAddress(CLANG, "clang_isFunctionTypeVariadic"),
            getCursorResultType                     = apiGetFunctionAddress(CLANG, "clang_getCursorResultType"),
            getCursorExceptionSpecificationType     = apiGetFunctionAddress(CLANG, "clang_getCursorExceptionSpecificationType"),
            isPODType                               = apiGetFunctionAddress(CLANG, "clang_isPODType"),
            getElementType                          = apiGetFunctionAddress(CLANG, "clang_getElementType"),
            getNumElements                          = apiGetFunctionAddress(CLANG, "clang_getNumElements"),
            getArrayElementType                     = apiGetFunctionAddress(CLANG, "clang_getArrayElementType"),
            getArraySize                            = apiGetFunctionAddress(CLANG, "clang_getArraySize"),
            Type_getNamedType                       = apiGetFunctionAddress(CLANG, "clang_Type_getNamedType"),
            Type_isTransparentTagTypedef            = apiGetFunctionAddress(CLANG, "clang_Type_isTransparentTagTypedef"),
            Type_getNullability                     = apiGetFunctionAddressOptional(CLANG, "clang_Type_getNullability"),
            Type_getAlignOf                         = apiGetFunctionAddress(CLANG, "clang_Type_getAlignOf"),
            Type_getClassType                       = apiGetFunctionAddress(CLANG, "clang_Type_getClassType"),
            Type_getSizeOf                          = apiGetFunctionAddress(CLANG, "clang_Type_getSizeOf"),
            Type_getOffsetOf                        = apiGetFunctionAddress(CLANG, "clang_Type_getOffsetOf"),
            Type_getModifiedType                    = apiGetFunctionAddressOptional(CLANG, "clang_Type_getModifiedType"),
            Type_getValueType                       = apiGetFunctionAddressOptional(CLANG, "clang_Type_getValueType"),
            Cursor_getOffsetOfField                 = apiGetFunctionAddress(CLANG, "clang_Cursor_getOffsetOfField"),
            Cursor_isAnonymous                      = apiGetFunctionAddress(CLANG, "clang_Cursor_isAnonymous"),
            Cursor_isAnonymousRecordDecl            = apiGetFunctionAddressOptional(CLANG, "clang_Cursor_isAnonymousRecordDecl"),
            Cursor_isInlineNamespace                = apiGetFunctionAddressOptional(CLANG, "clang_Cursor_isInlineNamespace"),
            Type_getNumTemplateArguments            = apiGetFunctionAddress(CLANG, "clang_Type_getNumTemplateArguments"),
            Type_getTemplateArgumentAsType          = apiGetFunctionAddress(CLANG, "clang_Type_getTemplateArgumentAsType"),
            Type_getCXXRefQualifier                 = apiGetFunctionAddress(CLANG, "clang_Type_getCXXRefQualifier"),
            isVirtualBase                           = apiGetFunctionAddress(CLANG, "clang_isVirtualBase"),
            getOffsetOfBase                         = apiGetFunctionAddressOptional(CLANG, "clang_getOffsetOfBase"),
            getCXXAccessSpecifier                   = apiGetFunctionAddress(CLANG, "clang_getCXXAccessSpecifier"),
            Cursor_getBinaryOpcode                  = apiGetFunctionAddressOptional(CLANG, "clang_Cursor_getBinaryOpcode"),
            Cursor_getBinaryOpcodeStr               = apiGetFunctionAddressOptional(CLANG, "clang_Cursor_getBinaryOpcodeStr"),
            Cursor_getStorageClass                  = apiGetFunctionAddress(CLANG, "clang_Cursor_getStorageClass"),
            getNumOverloadedDecls                   = apiGetFunctionAddress(CLANG, "clang_getNumOverloadedDecls"),
            getOverloadedDecl                       = apiGetFunctionAddress(CLANG, "clang_getOverloadedDecl"),
            getIBOutletCollectionType               = apiGetFunctionAddress(CLANG, "clang_getIBOutletCollectionType"),
            visitChildren                           = apiGetFunctionAddress(CLANG, "clang_visitChildren"),
            getCursorUSR                            = apiGetFunctionAddress(CLANG, "clang_getCursorUSR"),
            constructUSR_ObjCClass                  = apiGetFunctionAddress(CLANG, "clang_constructUSR_ObjCClass"),
            constructUSR_ObjCCategory               = apiGetFunctionAddress(CLANG, "clang_constructUSR_ObjCCategory"),
            constructUSR_ObjCProtocol               = apiGetFunctionAddress(CLANG, "clang_constructUSR_ObjCProtocol"),
            constructUSR_ObjCIvar                   = apiGetFunctionAddress(CLANG, "clang_constructUSR_ObjCIvar"),
            constructUSR_ObjCMethod                 = apiGetFunctionAddress(CLANG, "clang_constructUSR_ObjCMethod"),
            constructUSR_ObjCProperty               = apiGetFunctionAddress(CLANG, "clang_constructUSR_ObjCProperty"),
            getCursorSpelling                       = apiGetFunctionAddress(CLANG, "clang_getCursorSpelling"),
            Cursor_getSpellingNameRange             = apiGetFunctionAddress(CLANG, "clang_Cursor_getSpellingNameRange"),
            PrintingPolicy_getProperty              = apiGetFunctionAddressOptional(CLANG, "clang_PrintingPolicy_getProperty"),
            PrintingPolicy_setProperty              = apiGetFunctionAddressOptional(CLANG, "clang_PrintingPolicy_setProperty"),
            getCursorPrintingPolicy                 = apiGetFunctionAddressOptional(CLANG, "clang_getCursorPrintingPolicy"),
            PrintingPolicy_dispose                  = apiGetFunctionAddressOptional(CLANG, "clang_PrintingPolicy_dispose"),
            getCursorPrettyPrinted                  = apiGetFunctionAddressOptional(CLANG, "clang_getCursorPrettyPrinted"),
            getTypePrettyPrinted                    = apiGetFunctionAddressOptional(CLANG, "clang_getTypePrettyPrinted"),
            getCursorDisplayName                    = apiGetFunctionAddress(CLANG, "clang_getCursorDisplayName"),
            getCursorReferenced                     = apiGetFunctionAddress(CLANG, "clang_getCursorReferenced"),
            getCursorDefinition                     = apiGetFunctionAddress(CLANG, "clang_getCursorDefinition"),
            isCursorDefinition                      = apiGetFunctionAddress(CLANG, "clang_isCursorDefinition"),
            getCanonicalCursor                      = apiGetFunctionAddress(CLANG, "clang_getCanonicalCursor"),
            Cursor_getObjCSelectorIndex             = apiGetFunctionAddress(CLANG, "clang_Cursor_getObjCSelectorIndex"),
            Cursor_isDynamicCall                    = apiGetFunctionAddress(CLANG, "clang_Cursor_isDynamicCall"),
            Cursor_getReceiverType                  = apiGetFunctionAddress(CLANG, "clang_Cursor_getReceiverType"),
            Cursor_getObjCPropertyAttributes        = apiGetFunctionAddress(CLANG, "clang_Cursor_getObjCPropertyAttributes"),
            Cursor_getObjCPropertyGetterName        = apiGetFunctionAddressOptional(CLANG, "clang_Cursor_getObjCPropertyGetterName"),
            Cursor_getObjCPropertySetterName        = apiGetFunctionAddressOptional(CLANG, "clang_Cursor_getObjCPropertySetterName"),
            Cursor_getObjCDeclQualifiers            = apiGetFunctionAddress(CLANG, "clang_Cursor_getObjCDeclQualifiers"),
            Cursor_isObjCOptional                   = apiGetFunctionAddress(CLANG, "clang_Cursor_isObjCOptional"),
            Cursor_isVariadic                       = apiGetFunctionAddress(CLANG, "clang_Cursor_isVariadic"),
            Cursor_isExternalSymbol                 = apiGetFunctionAddress(CLANG, "clang_Cursor_isExternalSymbol"),
            Cursor_getCommentRange                  = apiGetFunctionAddress(CLANG, "clang_Cursor_getCommentRange"),
            Cursor_getRawCommentText                = apiGetFunctionAddress(CLANG, "clang_Cursor_getRawCommentText"),
            Cursor_getBriefCommentText              = apiGetFunctionAddress(CLANG, "clang_Cursor_getBriefCommentText"),
            Cursor_getMangling                      = apiGetFunctionAddress(CLANG, "clang_Cursor_getMangling"),
            Cursor_getCXXManglings                  = apiGetFunctionAddress(CLANG, "clang_Cursor_getCXXManglings"),
            Cursor_getObjCManglings                 = apiGetFunctionAddressOptional(CLANG, "clang_Cursor_getObjCManglings"),
            Cursor_getModule                        = apiGetFunctionAddress(CLANG, "clang_Cursor_getModule"),
            getModuleForFile                        = apiGetFunctionAddress(CLANG, "clang_getModuleForFile"),
            Module_getASTFile                       = apiGetFunctionAddress(CLANG, "clang_Module_getASTFile"),
            Module_getParent                        = apiGetFunctionAddress(CLANG, "clang_Module_getParent"),
            Module_getName                          = apiGetFunctionAddress(CLANG, "clang_Module_getName"),
            Module_getFullName                      = apiGetFunctionAddress(CLANG, "clang_Module_getFullName"),
            Module_isSystem                         = apiGetFunctionAddress(CLANG, "clang_Module_isSystem"),
            Module_getNumTopLevelHeaders            = apiGetFunctionAddress(CLANG, "clang_Module_getNumTopLevelHeaders"),
            Module_getTopLevelHeader                = apiGetFunctionAddress(CLANG, "clang_Module_getTopLevelHeader"),
            CXXConstructor_isConvertingConstructor  = apiGetFunctionAddress(CLANG, "clang_CXXConstructor_isConvertingConstructor"),
            CXXConstructor_isCopyConstructor        = apiGetFunctionAddress(CLANG, "clang_CXXConstructor_isCopyConstructor"),
            CXXConstructor_isDefaultConstructor     = apiGetFunctionAddress(CLANG, "clang_CXXConstructor_isDefaultConstructor"),
            CXXConstructor_isMoveConstructor        = apiGetFunctionAddress(CLANG, "clang_CXXConstructor_isMoveConstructor"),
            CXXField_isMutable                      = apiGetFunctionAddress(CLANG, "clang_CXXField_isMutable"),
            CXXMethod_isDefaulted                   = apiGetFunctionAddress(CLANG, "clang_CXXMethod_isDefaulted"),
            CXXMethod_isDeleted                     = apiGetFunctionAddressOptional(CLANG, "clang_CXXMethod_isDeleted"),
            CXXMethod_isPureVirtual                 = apiGetFunctionAddress(CLANG, "clang_CXXMethod_isPureVirtual"),
            CXXMethod_isStatic                      = apiGetFunctionAddress(CLANG, "clang_CXXMethod_isStatic"),
            CXXMethod_isVirtual                     = apiGetFunctionAddress(CLANG, "clang_CXXMethod_isVirtual"),
            CXXMethod_isCopyAssignmentOperator      = apiGetFunctionAddressOptional(CLANG, "clang_CXXMethod_isCopyAssignmentOperator"),
            CXXMethod_isMoveAssignmentOperator      = apiGetFunctionAddressOptional(CLANG, "clang_CXXMethod_isMoveAssignmentOperator"),
            CXXMethod_isExplicit                    = apiGetFunctionAddressOptional(CLANG, "clang_CXXMethod_isExplicit"),
            CXXRecord_isAbstract                    = apiGetFunctionAddressOptional(CLANG, "clang_CXXRecord_isAbstract"),
            EnumDecl_isScoped                       = apiGetFunctionAddress(CLANG, "clang_EnumDecl_isScoped"),
            CXXMethod_isConst                       = apiGetFunctionAddress(CLANG, "clang_CXXMethod_isConst"),
            getTemplateCursorKind                   = apiGetFunctionAddress(CLANG, "clang_getTemplateCursorKind"),
            getSpecializedCursorTemplate            = apiGetFunctionAddress(CLANG, "clang_getSpecializedCursorTemplate"),
            getCursorReferenceNameRange             = apiGetFunctionAddress(CLANG, "clang_getCursorReferenceNameRange"),
            getToken                                = apiGetFunctionAddressOptional(CLANG, "clang_getToken"),
            getTokenKind                            = apiGetFunctionAddress(CLANG, "clang_getTokenKind"),
            getTokenSpelling                        = apiGetFunctionAddress(CLANG, "clang_getTokenSpelling"),
            getTokenLocation                        = apiGetFunctionAddress(CLANG, "clang_getTokenLocation"),
            getTokenExtent                          = apiGetFunctionAddress(CLANG, "clang_getTokenExtent"),
            tokenize                                = apiGetFunctionAddress(CLANG, "clang_tokenize"),
            annotateTokens                          = apiGetFunctionAddress(CLANG, "clang_annotateTokens"),
            disposeTokens                           = apiGetFunctionAddress(CLANG, "clang_disposeTokens"),
            getCursorKindSpelling                   = apiGetFunctionAddress(CLANG, "clang_getCursorKindSpelling"),
            getDefinitionSpellingAndExtent          = apiGetFunctionAddress(CLANG, "clang_getDefinitionSpellingAndExtent"),
            enableStackTraces                       = apiGetFunctionAddress(CLANG, "clang_enableStackTraces"),
            executeOnThread                         = apiGetFunctionAddress(CLANG, "clang_executeOnThread"),
            getCompletionChunkKind                  = apiGetFunctionAddress(CLANG, "clang_getCompletionChunkKind"),
            getCompletionChunkText                  = apiGetFunctionAddress(CLANG, "clang_getCompletionChunkText"),
            getCompletionChunkCompletionString      = apiGetFunctionAddress(CLANG, "clang_getCompletionChunkCompletionString"),
            getNumCompletionChunks                  = apiGetFunctionAddress(CLANG, "clang_getNumCompletionChunks"),
            getCompletionPriority                   = apiGetFunctionAddress(CLANG, "clang_getCompletionPriority"),
            getCompletionAvailability               = apiGetFunctionAddress(CLANG, "clang_getCompletionAvailability"),
            getCompletionNumAnnotations             = apiGetFunctionAddress(CLANG, "clang_getCompletionNumAnnotations"),
            getCompletionAnnotation                 = apiGetFunctionAddress(CLANG, "clang_getCompletionAnnotation"),
            getCompletionParent                     = apiGetFunctionAddress(CLANG, "clang_getCompletionParent"),
            getCompletionBriefComment               = apiGetFunctionAddress(CLANG, "clang_getCompletionBriefComment"),
            getCursorCompletionString               = apiGetFunctionAddress(CLANG, "clang_getCursorCompletionString"),
            getCompletionNumFixIts                  = apiGetFunctionAddressOptional(CLANG, "clang_getCompletionNumFixIts"),
            getCompletionFixIt                      = apiGetFunctionAddressOptional(CLANG, "clang_getCompletionFixIt"),
            defaultCodeCompleteOptions              = apiGetFunctionAddress(CLANG, "clang_defaultCodeCompleteOptions"),
            codeCompleteAt                          = apiGetFunctionAddress(CLANG, "clang_codeCompleteAt"),
            sortCodeCompletionResults               = apiGetFunctionAddress(CLANG, "clang_sortCodeCompletionResults"),
            disposeCodeCompleteResults              = apiGetFunctionAddress(CLANG, "clang_disposeCodeCompleteResults"),
            codeCompleteGetNumDiagnostics           = apiGetFunctionAddress(CLANG, "clang_codeCompleteGetNumDiagnostics"),
            codeCompleteGetDiagnostic               = apiGetFunctionAddress(CLANG, "clang_codeCompleteGetDiagnostic"),
            codeCompleteGetContexts                 = apiGetFunctionAddress(CLANG, "clang_codeCompleteGetContexts"),
            codeCompleteGetContainerKind            = apiGetFunctionAddress(CLANG, "clang_codeCompleteGetContainerKind"),
            codeCompleteGetContainerUSR             = apiGetFunctionAddress(CLANG, "clang_codeCompleteGetContainerUSR"),
            codeCompleteGetObjCSelector             = apiGetFunctionAddress(CLANG, "clang_codeCompleteGetObjCSelector"),
            getClangVersion                         = apiGetFunctionAddress(CLANG, "clang_getClangVersion"),
            toggleCrashRecovery                     = apiGetFunctionAddress(CLANG, "clang_toggleCrashRecovery"),
            getInclusions                           = apiGetFunctionAddress(CLANG, "clang_getInclusions"),
            Cursor_Evaluate                         = apiGetFunctionAddress(CLANG, "clang_Cursor_Evaluate"),
            EvalResult_getKind                      = apiGetFunctionAddress(CLANG, "clang_EvalResult_getKind"),
            EvalResult_getAsInt                     = apiGetFunctionAddress(CLANG, "clang_EvalResult_getAsInt"),
            EvalResult_getAsLongLong                = apiGetFunctionAddress(CLANG, "clang_EvalResult_getAsLongLong"),
            EvalResult_isUnsignedInt                = apiGetFunctionAddress(CLANG, "clang_EvalResult_isUnsignedInt"),
            EvalResult_getAsUnsigned                = apiGetFunctionAddress(CLANG, "clang_EvalResult_getAsUnsigned"),
            EvalResult_getAsDouble                  = apiGetFunctionAddress(CLANG, "clang_EvalResult_getAsDouble"),
            EvalResult_getAsStr                     = apiGetFunctionAddress(CLANG, "clang_EvalResult_getAsStr"),
            EvalResult_dispose                      = apiGetFunctionAddress(CLANG, "clang_EvalResult_dispose"),
            getRemappings                           = apiGetFunctionAddress(CLANG, "clang_getRemappings"),
            getRemappingsFromFileList               = apiGetFunctionAddress(CLANG, "clang_getRemappingsFromFileList"),
            remap_getNumFiles                       = apiGetFunctionAddress(CLANG, "clang_remap_getNumFiles"),
            remap_getFilenames                      = apiGetFunctionAddress(CLANG, "clang_remap_getFilenames"),
            remap_dispose                           = apiGetFunctionAddress(CLANG, "clang_remap_dispose"),
            findReferencesInFile                    = apiGetFunctionAddress(CLANG, "clang_findReferencesInFile"),
            findIncludesInFile                      = apiGetFunctionAddress(CLANG, "clang_findIncludesInFile"),
            index_isEntityObjCContainerKind         = apiGetFunctionAddress(CLANG, "clang_index_isEntityObjCContainerKind"),
            index_getObjCContainerDeclInfo          = apiGetFunctionAddress(CLANG, "clang_index_getObjCContainerDeclInfo"),
            index_getObjCInterfaceDeclInfo          = apiGetFunctionAddress(CLANG, "clang_index_getObjCInterfaceDeclInfo"),
            index_getObjCCategoryDeclInfo           = apiGetFunctionAddress(CLANG, "clang_index_getObjCCategoryDeclInfo"),
            index_getObjCProtocolRefListInfo        = apiGetFunctionAddress(CLANG, "clang_index_getObjCProtocolRefListInfo"),
            index_getObjCPropertyDeclInfo           = apiGetFunctionAddress(CLANG, "clang_index_getObjCPropertyDeclInfo"),
            index_getIBOutletCollectionAttrInfo     = apiGetFunctionAddress(CLANG, "clang_index_getIBOutletCollectionAttrInfo"),
            index_getCXXClassDeclInfo               = apiGetFunctionAddress(CLANG, "clang_index_getCXXClassDeclInfo"),
            index_getClientContainer                = apiGetFunctionAddress(CLANG, "clang_index_getClientContainer"),
            index_setClientContainer                = apiGetFunctionAddress(CLANG, "clang_index_setClientContainer"),
            index_getClientEntity                   = apiGetFunctionAddress(CLANG, "clang_index_getClientEntity"),
            index_setClientEntity                   = apiGetFunctionAddress(CLANG, "clang_index_setClientEntity"),
            IndexAction_create                      = apiGetFunctionAddress(CLANG, "clang_IndexAction_create"),
            IndexAction_dispose                     = apiGetFunctionAddress(CLANG, "clang_IndexAction_dispose"),
            indexSourceFile                         = apiGetFunctionAddress(CLANG, "clang_indexSourceFile"),
            indexSourceFileFullArgv                 = apiGetFunctionAddress(CLANG, "clang_indexSourceFileFullArgv"),
            indexTranslationUnit                    = apiGetFunctionAddress(CLANG, "clang_indexTranslationUnit"),
            indexLoc_getFileLocation                = apiGetFunctionAddress(CLANG, "clang_indexLoc_getFileLocation"),
            indexLoc_getCXSourceLocation            = apiGetFunctionAddress(CLANG, "clang_indexLoc_getCXSourceLocation"),
            Type_visitFields                        = apiGetFunctionAddress(CLANG, "clang_Type_visitFields"),
            visitCXXBaseClasses                     = apiGetFunctionAddressOptional(CLANG, "clang_visitCXXBaseClasses"),
            getBinaryOperatorKindSpelling           = apiGetFunctionAddressOptional(CLANG, "clang_getBinaryOperatorKindSpelling"),
            getCursorBinaryOperatorKind             = apiGetFunctionAddressOptional(CLANG, "clang_getCursorBinaryOperatorKind"),
            getUnaryOperatorKindSpelling            = apiGetFunctionAddressOptional(CLANG, "clang_getUnaryOperatorKindSpelling"),
            getCursorUnaryOperatorKind              = apiGetFunctionAddressOptional(CLANG, "clang_getCursorUnaryOperatorKind");

    }

    /** Returns the CLANG {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return CLANG;
    }

    public static final int
        CINDEX_VERSION_MAJOR = 0,
        CINDEX_VERSION_MINOR = 64,
        CINDEX_VERSION       = CINDEX_VERSION_MAJOR*10000 + CINDEX_VERSION_MINOR;

    public static final String CINDEX_VERSION_STRING = "0.62";

    public static final int
        CXError_Success          = 0,
        CXError_Failure          = 1,
        CXError_Crashed          = 2,
        CXError_InvalidArguments = 3,
        CXError_ASTReadError     = 4;

    public static final int
        CXAvailability_Available     = 0,
        CXAvailability_Deprecated    = 1,
        CXAvailability_NotAvailable  = 2,
        CXAvailability_NotAccessible = 3;

    public static final int
        CXCursor_ExceptionSpecificationKind_None             = 0,
        CXCursor_ExceptionSpecificationKind_DynamicNone      = 1,
        CXCursor_ExceptionSpecificationKind_Dynamic          = 2,
        CXCursor_ExceptionSpecificationKind_MSAny            = 3,
        CXCursor_ExceptionSpecificationKind_BasicNoexcept    = 4,
        CXCursor_ExceptionSpecificationKind_ComputedNoexcept = 5,
        CXCursor_ExceptionSpecificationKind_Unevaluated      = 6,
        CXCursor_ExceptionSpecificationKind_Uninstantiated   = 7,
        CXCursor_ExceptionSpecificationKind_Unparsed         = 8,
        CXCursor_ExceptionSpecificationKind_NoThrow          = 9;

    public static final byte
        CXChoice_Default  = 0,
        CXChoice_Enabled  = 1,
        CXChoice_Disabled = 2;

    public static final int
        CXGlobalOpt_None                                = 0x0,
        CXGlobalOpt_ThreadBackgroundPriorityForIndexing = 0x1,
        CXGlobalOpt_ThreadBackgroundPriorityForEditing  = 0x2,
        CXGlobalOpt_ThreadBackgroundPriorityForAll      = CXGlobalOpt_ThreadBackgroundPriorityForIndexing | CXGlobalOpt_ThreadBackgroundPriorityForEditing;

    public static final int
        CXDiagnostic_Ignored = 0,
        CXDiagnostic_Note    = 1,
        CXDiagnostic_Warning = 2,
        CXDiagnostic_Error   = 3,
        CXDiagnostic_Fatal   = 4;

    public static final int
        CXLoadDiag_None        = 0,
        CXLoadDiag_Unknown     = 1,
        CXLoadDiag_CannotLoad  = 2,
        CXLoadDiag_InvalidFile = 3;

    public static final int
        CXDiagnostic_DisplaySourceLocation = 0x01,
        CXDiagnostic_DisplayColumn         = 0x02,
        CXDiagnostic_DisplaySourceRanges   = 0x04,
        CXDiagnostic_DisplayOption         = 0x08,
        CXDiagnostic_DisplayCategoryId     = 0x10,
        CXDiagnostic_DisplayCategoryName   = 0x20;

    public static final int
        CXTranslationUnit_None                                 = 0x0,
        CXTranslationUnit_DetailedPreprocessingRecord          = 0x01,
        CXTranslationUnit_Incomplete                           = 0x02,
        CXTranslationUnit_PrecompiledPreamble                  = 0x04,
        CXTranslationUnit_CacheCompletionResults               = 0x08,
        CXTranslationUnit_ForSerialization                     = 0x10,
        CXTranslationUnit_CXXChainedPCH                        = 0x20,
        CXTranslationUnit_SkipFunctionBodies                   = 0x40,
        CXTranslationUnit_IncludeBriefCommentsInCodeCompletion = 0x80,
        CXTranslationUnit_CreatePreambleOnFirstParse           = 0x100,
        CXTranslationUnit_KeepGoing                            = 0x200,
        CXTranslationUnit_SingleFileParse                      = 0x400,
        CXTranslationUnit_LimitSkipFunctionBodiesToPreamble    = 0x800,
        CXTranslationUnit_IncludeAttributedTypes               = 0x1000,
        CXTranslationUnit_VisitImplicitAttributes              = 0x2000,
        CXTranslationUnit_IgnoreNonErrorsFromIncludedFiles     = 0x4000,
        CXTranslationUnit_RetainExcludedConditionalBlocks      = 0x8000;

    public static final int CXSaveTranslationUnit_None = 0x0;

    public static final int
        CXSaveError_None              = 0,
        CXSaveError_Unknown           = 1,
        CXSaveError_TranslationErrors = 2,
        CXSaveError_InvalidTU         = 3;

    public static final int CXReparse_None = 0x0;

    public static final int
        CXTUResourceUsage_AST                                = 1,
        CXTUResourceUsage_Identifiers                        = 2,
        CXTUResourceUsage_Selectors                          = 3,
        CXTUResourceUsage_GlobalCompletionResults            = 4,
        CXTUResourceUsage_SourceManagerContentCache          = 5,
        CXTUResourceUsage_AST_SideTables                     = 6,
        CXTUResourceUsage_SourceManager_Membuffer_Malloc     = 7,
        CXTUResourceUsage_SourceManager_Membuffer_MMap       = 8,
        CXTUResourceUsage_ExternalASTSource_Membuffer_Malloc = 9,
        CXTUResourceUsage_ExternalASTSource_Membuffer_MMap   = 10,
        CXTUResourceUsage_Preprocessor                       = 11,
        CXTUResourceUsage_PreprocessingRecord                = 12,
        CXTUResourceUsage_SourceManager_DataStructures       = 13,
        CXTUResourceUsage_Preprocessor_HeaderSearch          = 14,
        CXTUResourceUsage_MEMORY_IN_BYTES_BEGIN              = CXTUResourceUsage_AST,
        CXTUResourceUsage_MEMORY_IN_BYTES_END                = CXTUResourceUsage_Preprocessor_HeaderSearch,
        CXTUResourceUsage_First                              = CXTUResourceUsage_AST,
        CXTUResourceUsage_Last                               = CXTUResourceUsage_Preprocessor_HeaderSearch;

    public static final int
        CXCursor_UnexposedDecl                                    = 1,
        CXCursor_StructDecl                                       = 2,
        CXCursor_UnionDecl                                        = 3,
        CXCursor_ClassDecl                                        = 4,
        CXCursor_EnumDecl                                         = 5,
        CXCursor_FieldDecl                                        = 6,
        CXCursor_EnumConstantDecl                                 = 7,
        CXCursor_FunctionDecl                                     = 8,
        CXCursor_VarDecl                                          = 9,
        CXCursor_ParmDecl                                         = 10,
        CXCursor_ObjCInterfaceDecl                                = 11,
        CXCursor_ObjCCategoryDecl                                 = 12,
        CXCursor_ObjCProtocolDecl                                 = 13,
        CXCursor_ObjCPropertyDecl                                 = 14,
        CXCursor_ObjCIvarDecl                                     = 15,
        CXCursor_ObjCInstanceMethodDecl                           = 16,
        CXCursor_ObjCClassMethodDecl                              = 17,
        CXCursor_ObjCImplementationDecl                           = 18,
        CXCursor_ObjCCategoryImplDecl                             = 19,
        CXCursor_TypedefDecl                                      = 20,
        CXCursor_CXXMethod                                        = 21,
        CXCursor_Namespace                                        = 22,
        CXCursor_LinkageSpec                                      = 23,
        CXCursor_Constructor                                      = 24,
        CXCursor_Destructor                                       = 25,
        CXCursor_ConversionFunction                               = 26,
        CXCursor_TemplateTypeParameter                            = 27,
        CXCursor_NonTypeTemplateParameter                         = 28,
        CXCursor_TemplateTemplateParameter                        = 29,
        CXCursor_FunctionTemplate                                 = 30,
        CXCursor_ClassTemplate                                    = 31,
        CXCursor_ClassTemplatePartialSpecialization               = 32,
        CXCursor_NamespaceAlias                                   = 33,
        CXCursor_UsingDirective                                   = 34,
        CXCursor_UsingDeclaration                                 = 35,
        CXCursor_TypeAliasDecl                                    = 36,
        CXCursor_ObjCSynthesizeDecl                               = 37,
        CXCursor_ObjCDynamicDecl                                  = 38,
        CXCursor_CXXAccessSpecifier                               = 39,
        CXCursor_FirstDecl                                        = CXCursor_UnexposedDecl,
        CXCursor_LastDecl                                         = CXCursor_CXXAccessSpecifier,
        CXCursor_FirstRef                                         = 40,
        CXCursor_ObjCSuperClassRef                                = 40,
        CXCursor_ObjCProtocolRef                                  = 41,
        CXCursor_ObjCClassRef                                     = 42,
        CXCursor_TypeRef                                          = 43,
        CXCursor_CXXBaseSpecifier                                 = 44,
        CXCursor_TemplateRef                                      = 45,
        CXCursor_NamespaceRef                                     = 46,
        CXCursor_MemberRef                                        = 47,
        CXCursor_LabelRef                                         = 48,
        CXCursor_OverloadedDeclRef                                = 49,
        CXCursor_VariableRef                                      = 50,
        CXCursor_LastRef                                          = CXCursor_VariableRef,
        CXCursor_FirstInvalid                                     = 70,
        CXCursor_InvalidFile                                      = 70,
        CXCursor_NoDeclFound                                      = 71,
        CXCursor_NotImplemented                                   = 72,
        CXCursor_InvalidCode                                      = 73,
        CXCursor_LastInvalid                                      = CXCursor_InvalidCode,
        CXCursor_FirstExpr                                        = 100,
        CXCursor_UnexposedExpr                                    = 100,
        CXCursor_DeclRefExpr                                      = 101,
        CXCursor_MemberRefExpr                                    = 102,
        CXCursor_CallExpr                                         = 103,
        CXCursor_ObjCMessageExpr                                  = 104,
        CXCursor_BlockExpr                                        = 105,
        CXCursor_IntegerLiteral                                   = 106,
        CXCursor_FloatingLiteral                                  = 107,
        CXCursor_ImaginaryLiteral                                 = 108,
        CXCursor_StringLiteral                                    = 109,
        CXCursor_CharacterLiteral                                 = 110,
        CXCursor_ParenExpr                                        = 111,
        CXCursor_UnaryOperator                                    = 112,
        CXCursor_ArraySubscriptExpr                               = 113,
        CXCursor_BinaryOperator                                   = 114,
        CXCursor_CompoundAssignOperator                           = 115,
        CXCursor_ConditionalOperator                              = 116,
        CXCursor_CStyleCastExpr                                   = 117,
        CXCursor_CompoundLiteralExpr                              = 118,
        CXCursor_InitListExpr                                     = 119,
        CXCursor_AddrLabelExpr                                    = 120,
        CXCursor_StmtExpr                                         = 121,
        CXCursor_GenericSelectionExpr                             = 122,
        CXCursor_GNUNullExpr                                      = 123,
        CXCursor_CXXStaticCastExpr                                = 124,
        CXCursor_CXXDynamicCastExpr                               = 125,
        CXCursor_CXXReinterpretCastExpr                           = 126,
        CXCursor_CXXConstCastExpr                                 = 127,
        CXCursor_CXXFunctionalCastExpr                            = 128,
        CXCursor_CXXTypeidExpr                                    = 129,
        CXCursor_CXXBoolLiteralExpr                               = 130,
        CXCursor_CXXNullPtrLiteralExpr                            = 131,
        CXCursor_CXXThisExpr                                      = 132,
        CXCursor_CXXThrowExpr                                     = 133,
        CXCursor_CXXNewExpr                                       = 134,
        CXCursor_CXXDeleteExpr                                    = 135,
        CXCursor_UnaryExpr                                        = 136,
        CXCursor_ObjCStringLiteral                                = 137,
        CXCursor_ObjCEncodeExpr                                   = 138,
        CXCursor_ObjCSelectorExpr                                 = 139,
        CXCursor_ObjCProtocolExpr                                 = 140,
        CXCursor_ObjCBridgedCastExpr                              = 141,
        CXCursor_PackExpansionExpr                                = 142,
        CXCursor_SizeOfPackExpr                                   = 143,
        CXCursor_LambdaExpr                                       = 144,
        CXCursor_ObjCBoolLiteralExpr                              = 145,
        CXCursor_ObjCSelfExpr                                     = 146,
        CXCursor_ArraySectionExpr                                 = 147,
        CXCursor_ObjCAvailabilityCheckExpr                        = 148,
        CXCursor_FixedPointLiteral                                = 149,
        CXCursor_OMPArrayShapingExpr                              = 150,
        CXCursor_OMPIteratorExpr                                  = 151,
        CXCursor_CXXAddrspaceCastExpr                             = 152,
        CXCursor_ConceptSpecializationExpr                        = 153,
        CXCursor_RequiresExpr                                     = 154,
        CXCursor_CXXParenListInitExpr                             = 155,
        CXCursor_PackIndexingExpr                                 = 156,
        CXCursor_LastExpr                                         = CXCursor_PackIndexingExpr,
        CXCursor_FirstStmt                                        = 200,
        CXCursor_UnexposedStmt                                    = 200,
        CXCursor_LabelStmt                                        = 201,
        CXCursor_CompoundStmt                                     = 202,
        CXCursor_CaseStmt                                         = 203,
        CXCursor_DefaultStmt                                      = 204,
        CXCursor_IfStmt                                           = 205,
        CXCursor_SwitchStmt                                       = 206,
        CXCursor_WhileStmt                                        = 207,
        CXCursor_DoStmt                                           = 208,
        CXCursor_ForStmt                                          = 209,
        CXCursor_GotoStmt                                         = 210,
        CXCursor_IndirectGotoStmt                                 = 211,
        CXCursor_ContinueStmt                                     = 212,
        CXCursor_BreakStmt                                        = 213,
        CXCursor_ReturnStmt                                       = 214,
        CXCursor_GCCAsmStmt                                       = 215,
        CXCursor_AsmStmt                                          = CXCursor_GCCAsmStmt,
        CXCursor_ObjCAtTryStmt                                    = 216,
        CXCursor_ObjCAtCatchStmt                                  = 217,
        CXCursor_ObjCAtFinallyStmt                                = 218,
        CXCursor_ObjCAtThrowStmt                                  = 219,
        CXCursor_ObjCAtSynchronizedStmt                           = 220,
        CXCursor_ObjCAutoreleasePoolStmt                          = 221,
        CXCursor_ObjCForCollectionStmt                            = 222,
        CXCursor_CXXCatchStmt                                     = 223,
        CXCursor_CXXTryStmt                                       = 224,
        CXCursor_CXXForRangeStmt                                  = 225,
        CXCursor_SEHTryStmt                                       = 226,
        CXCursor_SEHExceptStmt                                    = 227,
        CXCursor_SEHFinallyStmt                                   = 228,
        CXCursor_MSAsmStmt                                        = 229,
        CXCursor_NullStmt                                         = 230,
        CXCursor_DeclStmt                                         = 231,
        CXCursor_OMPParallelDirective                             = 232,
        CXCursor_OMPSimdDirective                                 = 233,
        CXCursor_OMPForDirective                                  = 234,
        CXCursor_OMPSectionsDirective                             = 235,
        CXCursor_OMPSectionDirective                              = 236,
        CXCursor_OMPSingleDirective                               = 237,
        CXCursor_OMPParallelForDirective                          = 238,
        CXCursor_OMPParallelSectionsDirective                     = 239,
        CXCursor_OMPTaskDirective                                 = 240,
        CXCursor_OMPMasterDirective                               = 241,
        CXCursor_OMPCriticalDirective                             = 242,
        CXCursor_OMPTaskyieldDirective                            = 243,
        CXCursor_OMPBarrierDirective                              = 244,
        CXCursor_OMPTaskwaitDirective                             = 245,
        CXCursor_OMPFlushDirective                                = 246,
        CXCursor_SEHLeaveStmt                                     = 247,
        CXCursor_OMPOrderedDirective                              = 248,
        CXCursor_OMPAtomicDirective                               = 249,
        CXCursor_OMPForSimdDirective                              = 250,
        CXCursor_OMPParallelForSimdDirective                      = 251,
        CXCursor_OMPTargetDirective                               = 252,
        CXCursor_OMPTeamsDirective                                = 253,
        CXCursor_OMPTaskgroupDirective                            = 254,
        CXCursor_OMPCancellationPointDirective                    = 255,
        CXCursor_OMPCancelDirective                               = 256,
        CXCursor_OMPTargetDataDirective                           = 257,
        CXCursor_OMPTaskLoopDirective                             = 258,
        CXCursor_OMPTaskLoopSimdDirective                         = 259,
        CXCursor_OMPDistributeDirective                           = 260,
        CXCursor_OMPTargetEnterDataDirective                      = 261,
        CXCursor_OMPTargetExitDataDirective                       = 262,
        CXCursor_OMPTargetParallelDirective                       = 263,
        CXCursor_OMPTargetParallelForDirective                    = 264,
        CXCursor_OMPTargetUpdateDirective                         = 265,
        CXCursor_OMPDistributeParallelForDirective                = 266,
        CXCursor_OMPDistributeParallelForSimdDirective            = 267,
        CXCursor_OMPDistributeSimdDirective                       = 268,
        CXCursor_OMPTargetParallelForSimdDirective                = 269,
        CXCursor_OMPTargetSimdDirective                           = 270,
        CXCursor_OMPTeamsDistributeDirective                      = 271,
        CXCursor_OMPTeamsDistributeSimdDirective                  = 272,
        CXCursor_OMPTeamsDistributeParallelForSimdDirective       = 273,
        CXCursor_OMPTeamsDistributeParallelForDirective           = 274,
        CXCursor_OMPTargetTeamsDirective                          = 275,
        CXCursor_OMPTargetTeamsDistributeDirective                = 276,
        CXCursor_OMPTargetTeamsDistributeParallelForDirective     = 277,
        CXCursor_OMPTargetTeamsDistributeParallelForSimdDirective = 278,
        CXCursor_OMPTargetTeamsDistributeSimdDirective            = 279,
        CXCursor_BuiltinBitCastExpr                               = 280,
        CXCursor_OMPMasterTaskLoopDirective                       = 281,
        CXCursor_OMPParallelMasterTaskLoopDirective               = 282,
        CXCursor_OMPMasterTaskLoopSimdDirective                   = 283,
        CXCursor_OMPParallelMasterTaskLoopSimdDirective           = 284,
        CXCursor_OMPParallelMasterDirective                       = 285,
        CXCursor_OMPDepobjDirective                               = 286,
        CXCursor_OMPScanDirective                                 = 287,
        CXCursor_OMPTileDirective                                 = 288,
        CXCursor_OMPCanonicalLoop                                 = 289,
        CXCursor_OMPInteropDirective                              = 290,
        CXCursor_OMPDispatchDirective                             = 291,
        CXCursor_OMPMaskedDirective                               = 292,
        CXCursor_OMPUnrollDirective                               = 293,
        CXCursor_OMPMetaDirective                                 = 294,
        CXCursor_OMPGenericLoopDirective                          = 295,
        CXCursor_OMPTeamsGenericLoopDirective                     = 296,
        CXCursor_OMPTargetTeamsGenericLoopDirective               = 297,
        CXCursor_OMPParallelGenericLoopDirective                  = 298,
        CXCursor_OMPTargetParallelGenericLoopDirective            = 299,
        CXCursor_OMPParallelMaskedDirective                       = 300,
        CXCursor_OMPMaskedTaskLoopDirective                       = 301,
        CXCursor_OMPMaskedTaskLoopSimdDirective                   = 302,
        CXCursor_OMPParallelMaskedTaskLoopDirective               = 303,
        CXCursor_OMPParallelMaskedTaskLoopSimdDirective           = 304,
        CXCursor_OMPErrorDirective                                = 305,
        CXCursor_OMPScopeDirective                                = 306,
        CXCursor_OMPReverseDirective                              = 307,
        CXCursor_OMPInterchangeDirective                          = 308,
        CXCursor_OMPAssumeDirective                               = 309,
        CXCursor_OpenACCComputeConstruct                          = 320,
        CXCursor_OpenACCLoopConstruct                             = 321,
        CXCursor_OpenACCCombinedConstruct                         = 322,
        CXCursor_OpenACCDataConstruct                             = 323,
        CXCursor_OpenACCEnterDataConstruct                        = 324,
        CXCursor_OpenACCExitDataConstruct                         = 325,
        CXCursor_OpenACCHostDataConstruct                         = 326,
        CXCursor_OpenACCWaitConstruct                             = 327,
        CXCursor_OpenACCInitConstruct                             = 328,
        CXCursor_OpenACCShutdownConstruct                         = 329,
        CXCursor_OpenACCSetConstruct                              = 330,
        CXCursor_OpenACCUpdateConstruct                           = 331,
        CXCursor_LastStmt                                         = CXCursor_OpenACCUpdateConstruct,
        CXCursor_TranslationUnit                                  = 350,
        CXCursor_FirstAttr                                        = 400,
        CXCursor_UnexposedAttr                                    = 400,
        CXCursor_IBActionAttr                                     = 401,
        CXCursor_IBOutletAttr                                     = 402,
        CXCursor_IBOutletCollectionAttr                           = 403,
        CXCursor_CXXFinalAttr                                     = 404,
        CXCursor_CXXOverrideAttr                                  = 405,
        CXCursor_AnnotateAttr                                     = 406,
        CXCursor_AsmLabelAttr                                     = 407,
        CXCursor_PackedAttr                                       = 408,
        CXCursor_PureAttr                                         = 409,
        CXCursor_ConstAttr                                        = 410,
        CXCursor_NoDuplicateAttr                                  = 411,
        CXCursor_CUDAConstantAttr                                 = 412,
        CXCursor_CUDADeviceAttr                                   = 413,
        CXCursor_CUDAGlobalAttr                                   = 414,
        CXCursor_CUDAHostAttr                                     = 415,
        CXCursor_CUDASharedAttr                                   = 416,
        CXCursor_VisibilityAttr                                   = 417,
        CXCursor_DLLExport                                        = 418,
        CXCursor_DLLImport                                        = 419,
        CXCursor_NSReturnsRetained                                = 420,
        CXCursor_NSReturnsNotRetained                             = 421,
        CXCursor_NSReturnsAutoreleased                            = 422,
        CXCursor_NSConsumesSelf                                   = 423,
        CXCursor_NSConsumed                                       = 424,
        CXCursor_ObjCException                                    = 425,
        CXCursor_ObjCNSObject                                     = 426,
        CXCursor_ObjCIndependentClass                             = 427,
        CXCursor_ObjCPreciseLifetime                              = 428,
        CXCursor_ObjCReturnsInnerPointer                          = 429,
        CXCursor_ObjCRequiresSuper                                = 430,
        CXCursor_ObjCRootClass                                    = 431,
        CXCursor_ObjCSubclassingRestricted                        = 432,
        CXCursor_ObjCExplicitProtocolImpl                         = 433,
        CXCursor_ObjCDesignatedInitializer                        = 434,
        CXCursor_ObjCRuntimeVisible                               = 435,
        CXCursor_ObjCBoxable                                      = 436,
        CXCursor_FlagEnum                                         = 437,
        CXCursor_ConvergentAttr                                   = 438,
        CXCursor_WarnUnusedAttr                                   = 439,
        CXCursor_WarnUnusedResultAttr                             = 440,
        CXCursor_AlignedAttr                                      = 441,
        CXCursor_LastAttr                                         = CXCursor_AlignedAttr,
        CXCursor_PreprocessingDirective                           = 500,
        CXCursor_MacroDefinition                                  = 501,
        CXCursor_MacroExpansion                                   = 502,
        CXCursor_MacroInstantiation                               = CXCursor_MacroExpansion,
        CXCursor_InclusionDirective                               = 503,
        CXCursor_FirstPreprocessing                               = CXCursor_PreprocessingDirective,
        CXCursor_LastPreprocessing                                = CXCursor_InclusionDirective,
        CXCursor_ModuleImportDecl                                 = 600,
        CXCursor_TypeAliasTemplateDecl                            = 601,
        CXCursor_StaticAssert                                     = 602,
        CXCursor_FriendDecl                                       = 603,
        CXCursor_ConceptDecl                                      = 604,
        CXCursor_FirstExtraDecl                                   = CXCursor_ModuleImportDecl,
        CXCursor_LastExtraDecl                                    = CXCursor_ConceptDecl,
        CXCursor_OverloadCandidate                                = 700;

    public static final int
        CXLinkage_Invalid        = 0,
        CXLinkage_NoLinkage      = 1,
        CXLinkage_Internal       = 2,
        CXLinkage_UniqueExternal = 3,
        CXLinkage_External       = 4;

    public static final int
        CXVisibility_Invalid   = 0,
        CXVisibility_Hidden    = 1,
        CXVisibility_Protected = 2,
        CXVisibility_Default   = 3;

    public static final int
        CXLanguage_Invalid   = 0,
        CXLanguage_C         = 1,
        CXLanguage_ObjC      = 2,
        CXLanguage_CPlusPlus = 3;

    public static final int
        CXTLS_None    = 0,
        CXTLS_Dynamic = 1,
        CXTLS_Static  = 2;

    public static final int
        CXType_Invalid                                              = 0,
        CXType_Unexposed                                            = 1,
        CXType_Void                                                 = 2,
        CXType_Bool                                                 = 3,
        CXType_Char_U                                               = 4,
        CXType_UChar                                                = 5,
        CXType_Char16                                               = 6,
        CXType_Char32                                               = 7,
        CXType_UShort                                               = 8,
        CXType_UInt                                                 = 9,
        CXType_ULong                                                = 10,
        CXType_ULongLong                                            = 11,
        CXType_UInt128                                              = 12,
        CXType_Char_S                                               = 13,
        CXType_SChar                                                = 14,
        CXType_WChar                                                = 15,
        CXType_Short                                                = 16,
        CXType_Int                                                  = 17,
        CXType_Long                                                 = 18,
        CXType_LongLong                                             = 19,
        CXType_Int128                                               = 20,
        CXType_Float                                                = 21,
        CXType_Double                                               = 22,
        CXType_LongDouble                                           = 23,
        CXType_NullPtr                                              = 24,
        CXType_Overload                                             = 25,
        CXType_Dependent                                            = 26,
        CXType_ObjCId                                               = 27,
        CXType_ObjCClass                                            = 28,
        CXType_ObjCSel                                              = 29,
        CXType_Float128                                             = 30,
        CXType_Half                                                 = 31,
        CXType_Float16                                              = 32,
        CXType_ShortAccum                                           = 33,
        CXType_Accum                                                = 34,
        CXType_LongAccum                                            = 35,
        CXType_UShortAccum                                          = 36,
        CXType_UAccum                                               = 37,
        CXType_ULongAccum                                           = 38,
        CXType_BFloat16                                             = 39,
        CXType_Ibm128                                               = 40,
        CXType_FirstBuiltin                                         = CXType_Void,
        CXType_LastBuiltin                                          = CXType_Ibm128,
        CXType_Complex                                              = 100,
        CXType_Pointer                                              = 101,
        CXType_BlockPointer                                         = 102,
        CXType_LValueReference                                      = 103,
        CXType_RValueReference                                      = 104,
        CXType_Record                                               = 105,
        CXType_Enum                                                 = 106,
        CXType_Typedef                                              = 107,
        CXType_ObjCInterface                                        = 108,
        CXType_ObjCObjectPointer                                    = 109,
        CXType_FunctionNoProto                                      = 110,
        CXType_FunctionProto                                        = 111,
        CXType_ConstantArray                                        = 112,
        CXType_Vector                                               = 113,
        CXType_IncompleteArray                                      = 114,
        CXType_VariableArray                                        = 115,
        CXType_DependentSizedArray                                  = 116,
        CXType_MemberPointer                                        = 117,
        CXType_Auto                                                 = 118,
        CXType_Elaborated                                           = 119,
        CXType_Pipe                                                 = 120,
        CXType_OCLImage1dRO                                         = 121,
        CXType_OCLImage1dArrayRO                                    = 122,
        CXType_OCLImage1dBufferRO                                   = 123,
        CXType_OCLImage2dRO                                         = 124,
        CXType_OCLImage2dArrayRO                                    = 125,
        CXType_OCLImage2dDepthRO                                    = 126,
        CXType_OCLImage2dArrayDepthRO                               = 127,
        CXType_OCLImage2dMSAARO                                     = 128,
        CXType_OCLImage2dArrayMSAARO                                = 129,
        CXType_OCLImage2dMSAADepthRO                                = 130,
        CXType_OCLImage2dArrayMSAADepthRO                           = 131,
        CXType_OCLImage3dRO                                         = 132,
        CXType_OCLImage1dWO                                         = 133,
        CXType_OCLImage1dArrayWO                                    = 134,
        CXType_OCLImage1dBufferWO                                   = 135,
        CXType_OCLImage2dWO                                         = 136,
        CXType_OCLImage2dArrayWO                                    = 137,
        CXType_OCLImage2dDepthWO                                    = 138,
        CXType_OCLImage2dArrayDepthWO                               = 139,
        CXType_OCLImage2dMSAAWO                                     = 140,
        CXType_OCLImage2dArrayMSAAWO                                = 141,
        CXType_OCLImage2dMSAADepthWO                                = 142,
        CXType_OCLImage2dArrayMSAADepthWO                           = 143,
        CXType_OCLImage3dWO                                         = 144,
        CXType_OCLImage1dRW                                         = 145,
        CXType_OCLImage1dArrayRW                                    = 146,
        CXType_OCLImage1dBufferRW                                   = 147,
        CXType_OCLImage2dRW                                         = 148,
        CXType_OCLImage2dArrayRW                                    = 149,
        CXType_OCLImage2dDepthRW                                    = 150,
        CXType_OCLImage2dArrayDepthRW                               = 151,
        CXType_OCLImage2dMSAARW                                     = 152,
        CXType_OCLImage2dArrayMSAARW                                = 153,
        CXType_OCLImage2dMSAADepthRW                                = 154,
        CXType_OCLImage2dArrayMSAADepthRW                           = 155,
        CXType_OCLImage3dRW                                         = 156,
        CXType_OCLSampler                                           = 157,
        CXType_OCLEvent                                             = 158,
        CXType_OCLQueue                                             = 159,
        CXType_OCLReserveID                                         = 160,
        CXType_ObjCObject                                           = 161,
        CXType_ObjCTypeParam                                        = 162,
        CXType_Attributed                                           = 163,
        CXType_OCLIntelSubgroupAVCMcePayload                        = 164,
        CXType_OCLIntelSubgroupAVCImePayload                        = 165,
        CXType_OCLIntelSubgroupAVCRefPayload                        = 166,
        CXType_OCLIntelSubgroupAVCSicPayload                        = 167,
        CXType_OCLIntelSubgroupAVCMceResult                         = 168,
        CXType_OCLIntelSubgroupAVCImeResult                         = 169,
        CXType_OCLIntelSubgroupAVCRefResult                         = 170,
        CXType_OCLIntelSubgroupAVCSicResult                         = 171,
        CXType_OCLIntelSubgroupAVCImeResultSingleReferenceStreamout = 172,
        CXType_OCLIntelSubgroupAVCImeResultDualReferenceStreamout   = 173,
        CXType_OCLIntelSubgroupAVCImeSingleReferenceStreamin        = 174,
        CXType_OCLIntelSubgroupAVCImeDualReferenceStreamin          = 175,
        CXType_OCLIntelSubgroupAVCImeResultSingleRefStreamout       = 172,
        CXType_OCLIntelSubgroupAVCImeResultDualRefStreamout         = 173,
        CXType_OCLIntelSubgroupAVCImeSingleRefStreamin              = 174,
        CXType_OCLIntelSubgroupAVCImeDualRefStreamin                = 175,
        CXType_ExtVector                                            = 176,
        CXType_Atomic                                               = 177,
        CXType_BTFTagAttributed                                     = 178,
        CXType_HLSLResource                                         = 179,
        CXType_HLSLAttributedResource                               = 180;

    public static final int
        CXCallingConv_Default           = 0,
        CXCallingConv_C                 = 1,
        CXCallingConv_X86StdCall        = 2,
        CXCallingConv_X86FastCall       = 3,
        CXCallingConv_X86ThisCall       = 4,
        CXCallingConv_X86Pascal         = 5,
        CXCallingConv_AAPCS             = 6,
        CXCallingConv_AAPCS_VFP         = 7,
        CXCallingConv_X86RegCall        = 8,
        CXCallingConv_IntelOclBicc      = 9,
        CXCallingConv_Win64             = 10,
        CXCallingConv_X86_64Win64       = CXCallingConv_Win64,
        CXCallingConv_X86_64SysV        = 11,
        CXCallingConv_X86VectorCall     = 12,
        CXCallingConv_Swift             = 13,
        CXCallingConv_PreserveMost      = 14,
        CXCallingConv_PreserveAll       = 15,
        CXCallingConv_AArch64VectorCall = 16,
        CXCallingConv_SwiftAsync        = 17,
        CXCallingConv_AArch64SVEPCS     = 18,
        CXCallingConv_M68kRTD           = 19,
        CXCallingConv_PreserveNone      = 20,
        CXCallingConv_RISCVVectorCall   = 21,
        CXCallingConv_Invalid           = 100,
        CXCallingConv_Unexposed         = 200;

    public static final int
        CXTemplateArgumentKind_Null              = 0,
        CXTemplateArgumentKind_Type              = 1,
        CXTemplateArgumentKind_Declaration       = 2,
        CXTemplateArgumentKind_NullPtr           = 3,
        CXTemplateArgumentKind_Integral          = 4,
        CXTemplateArgumentKind_Template          = 5,
        CXTemplateArgumentKind_TemplateExpansion = 6,
        CXTemplateArgumentKind_Expression        = 7,
        CXTemplateArgumentKind_Pack              = 8,
        CXTemplateArgumentKind_Invalid           = 9;

    public static final int
        CXTypeNullability_NonNull        = 0,
        CXTypeNullability_Nullable       = 1,
        CXTypeNullability_Unspecified    = 2,
        CXTypeNullability_Invalid        = 3,
        CXTypeNullability_NullableResult = 4;

    public static final int
        CXTypeLayoutError_Invalid          = -1,
        CXTypeLayoutError_Incomplete       = -2,
        CXTypeLayoutError_Dependent        = -3,
        CXTypeLayoutError_NotConstantSize  = -4,
        CXTypeLayoutError_InvalidFieldName = -5,
        CXTypeLayoutError_Undeduced        = -6;

    public static final int
        CXRefQualifier_None   = 0,
        CXRefQualifier_LValue = 1,
        CXRefQualifier_RValue = 2;

    public static final int
        CX_CXXInvalidAccessSpecifier = 0,
        CX_CXXPublic                 = 1,
        CX_CXXProtected              = 2,
        CX_CXXPrivate                = 3;

    public static final int
        CX_SC_Invalid              = 0,
        CX_SC_None                 = 1,
        CX_SC_Extern               = 2,
        CX_SC_Static               = 3,
        CX_SC_PrivateExtern        = 4,
        CX_SC_OpenCLWorkGroupLocal = 5,
        CX_SC_Auto                 = 6,
        CX_SC_Register             = 7;

    public static final int
        CX_BO_Invalid   = 0,
        CX_BO_PtrMemD   = 1,
        CX_BO_PtrMemI   = 2,
        CX_BO_Mul       = 3,
        CX_BO_Div       = 4,
        CX_BO_Rem       = 5,
        CX_BO_Add       = 6,
        CX_BO_Sub       = 7,
        CX_BO_Shl       = 8,
        CX_BO_Shr       = 9,
        CX_BO_Cmp       = 10,
        CX_BO_LT        = 11,
        CX_BO_GT        = 12,
        CX_BO_LE        = 13,
        CX_BO_GE        = 14,
        CX_BO_EQ        = 15,
        CX_BO_NE        = 16,
        CX_BO_And       = 17,
        CX_BO_Xor       = 18,
        CX_BO_Or        = 19,
        CX_BO_LAnd      = 20,
        CX_BO_LOr       = 21,
        CX_BO_Assign    = 22,
        CX_BO_MulAssign = 23,
        CX_BO_DivAssign = 24,
        CX_BO_RemAssign = 25,
        CX_BO_AddAssign = 26,
        CX_BO_SubAssign = 27,
        CX_BO_ShlAssign = 28,
        CX_BO_ShrAssign = 29,
        CX_BO_AndAssign = 30,
        CX_BO_XorAssign = 31,
        CX_BO_OrAssign  = 32,
        CX_BO_Comma     = 33,
        CX_BO_LAST      = CX_BO_Comma;

    public static final int
        CXChildVisit_Break    = 0,
        CXChildVisit_Continue = 1,
        CXChildVisit_Recurse  = 2;

    public static final int
        CXPrintingPolicy_Indentation                           = 0,
        CXPrintingPolicy_SuppressSpecifiers                    = 1,
        CXPrintingPolicy_SuppressTagKeyword                    = 2,
        CXPrintingPolicy_IncludeTagDefinition                  = 3,
        CXPrintingPolicy_SuppressScope                         = 4,
        CXPrintingPolicy_SuppressUnwrittenScope                = 5,
        CXPrintingPolicy_SuppressInitializers                  = 6,
        CXPrintingPolicy_ConstantArraySizeAsWritten            = 7,
        CXPrintingPolicy_AnonymousTagLocations                 = 8,
        CXPrintingPolicy_SuppressStrongLifetime                = 9,
        CXPrintingPolicy_SuppressLifetimeQualifiers            = 10,
        CXPrintingPolicy_SuppressTemplateArgsInCXXConstructors = 11,
        CXPrintingPolicy_Bool                                  = 12,
        CXPrintingPolicy_Restrict                              = 13,
        CXPrintingPolicy_Alignof                               = 14,
        CXPrintingPolicy_UnderscoreAlignof                     = 15,
        CXPrintingPolicy_UseVoidForZeroParams                  = 16,
        CXPrintingPolicy_TerseOutput                           = 17,
        CXPrintingPolicy_PolishForDeclaration                  = 18,
        CXPrintingPolicy_Half                                  = 19,
        CXPrintingPolicy_MSWChar                               = 20,
        CXPrintingPolicy_IncludeNewlines                       = 21,
        CXPrintingPolicy_MSVCFormatting                        = 22,
        CXPrintingPolicy_ConstantsAsWritten                    = 23,
        CXPrintingPolicy_SuppressImplicitBase                  = 24,
        CXPrintingPolicy_FullyQualifiedName                    = 25,
        CXPrintingPolicy_LastProperty                          = CXPrintingPolicy_FullyQualifiedName;

    public static final int
        CXObjCPropertyAttr_noattr            = 0x00,
        CXObjCPropertyAttr_readonly          = 0x01,
        CXObjCPropertyAttr_getter            = 0x02,
        CXObjCPropertyAttr_assign            = 0x04,
        CXObjCPropertyAttr_readwrite         = 0x08,
        CXObjCPropertyAttr_retain            = 0x10,
        CXObjCPropertyAttr_copy              = 0x20,
        CXObjCPropertyAttr_nonatomic         = 0x40,
        CXObjCPropertyAttr_setter            = 0x80,
        CXObjCPropertyAttr_atomic            = 0x100,
        CXObjCPropertyAttr_weak              = 0x200,
        CXObjCPropertyAttr_strong            = 0x400,
        CXObjCPropertyAttr_unsafe_unretained = 0x800,
        CXObjCPropertyAttr_class             = 0x1000;

    public static final int
        CXObjCDeclQualifier_None   = 0x0,
        CXObjCDeclQualifier_In     = 0x1,
        CXObjCDeclQualifier_Inout  = 0x2,
        CXObjCDeclQualifier_Out    = 0x4,
        CXObjCDeclQualifier_Bycopy = 0x8,
        CXObjCDeclQualifier_Byref  = 0x10,
        CXObjCDeclQualifier_Oneway = 0x20;

    public static final int
        CXNameRange_WantQualifier    = 0x1,
        CXNameRange_WantTemplateArgs = 0x2,
        CXNameRange_WantSinglePiece  = 0x4;

    public static final int
        CXToken_Punctuation = 0,
        CXToken_Keyword     = 1,
        CXToken_Identifier  = 2,
        CXToken_Literal     = 3,
        CXToken_Comment     = 4;

    public static final int
        CXCompletionChunk_Optional         = 0,
        CXCompletionChunk_TypedText        = 1,
        CXCompletionChunk_Text             = 2,
        CXCompletionChunk_Placeholder      = 3,
        CXCompletionChunk_Informative      = 4,
        CXCompletionChunk_CurrentParameter = 5,
        CXCompletionChunk_LeftParen        = 6,
        CXCompletionChunk_RightParen       = 7,
        CXCompletionChunk_LeftBracket      = 8,
        CXCompletionChunk_RightBracket     = 9,
        CXCompletionChunk_LeftBrace        = 10,
        CXCompletionChunk_RightBrace       = 11,
        CXCompletionChunk_LeftAngle        = 12,
        CXCompletionChunk_RightAngle       = 13,
        CXCompletionChunk_Comma            = 14,
        CXCompletionChunk_ResultType       = 15,
        CXCompletionChunk_Colon            = 16,
        CXCompletionChunk_SemiColon        = 17,
        CXCompletionChunk_Equal            = 18,
        CXCompletionChunk_HorizontalSpace  = 19,
        CXCompletionChunk_VerticalSpace    = 20;

    public static final int
        CXCodeComplete_IncludeMacros                = 0x01,
        CXCodeComplete_IncludeCodePatterns          = 0x02,
        CXCodeComplete_IncludeBriefComments         = 0x04,
        CXCodeComplete_SkipPreamble                 = 0x08,
        CXCodeComplete_IncludeCompletionsWithFixIts = 0x10;

    public static final int
        CXCompletionContext_Unexposed           = 0,
        CXCompletionContext_AnyType             = 1 << 0,
        CXCompletionContext_AnyValue            = 1 << 1,
        CXCompletionContext_ObjCObjectValue     = 1 << 2,
        CXCompletionContext_ObjCSelectorValue   = 1 << 3,
        CXCompletionContext_CXXClassTypeValue   = 1 << 4,
        CXCompletionContext_DotMemberAccess     = 1 << 5,
        CXCompletionContext_ArrowMemberAccess   = 1 << 6,
        CXCompletionContext_ObjCPropertyAccess  = 1 << 7,
        CXCompletionContext_EnumTag             = 1 << 8,
        CXCompletionContext_UnionTag            = 1 << 9,
        CXCompletionContext_StructTag           = 1 << 10,
        CXCompletionContext_ClassTag            = 1 << 11,
        CXCompletionContext_Namespace           = 1 << 12,
        CXCompletionContext_NestedNameSpecifier = 1 << 13,
        CXCompletionContext_ObjCInterface       = 1 << 14,
        CXCompletionContext_ObjCProtocol        = 1 << 15,
        CXCompletionContext_ObjCCategory        = 1 << 16,
        CXCompletionContext_ObjCInstanceMessage = 1 << 17,
        CXCompletionContext_ObjCClassMessage    = 1 << 18,
        CXCompletionContext_ObjCSelectorName    = 1 << 19,
        CXCompletionContext_MacroName           = 1 << 20,
        CXCompletionContext_NaturalLanguage     = 1 << 21,
        CXCompletionContext_IncludedFile        = 1 << 22,
        CXCompletionContext_Unknown             = ((1 << 23) - 1);

    public static final int
        CXEval_Int            = 1,
        CXEval_Float          = 2,
        CXEval_ObjCStrLiteral = 3,
        CXEval_StrLiteral     = 4,
        CXEval_CFStr          = 5,
        CXEval_Other          = 6,
        CXEval_UnExposed      = 0;

    public static final int
        CXVisit_Break    = 0,
        CXVisit_Continue = 1;

    public static final int
        CXResult_Success    = 0,
        CXResult_Invalid    = 1,
        CXResult_VisitBreak = 2;

    public static final int
        CXIdxEntity_Unexposed             = 0,
        CXIdxEntity_Typedef               = 1,
        CXIdxEntity_Function              = 2,
        CXIdxEntity_Variable              = 3,
        CXIdxEntity_Field                 = 4,
        CXIdxEntity_EnumConstant          = 5,
        CXIdxEntity_ObjCClass             = 6,
        CXIdxEntity_ObjCProtocol          = 7,
        CXIdxEntity_ObjCCategory          = 8,
        CXIdxEntity_ObjCInstanceMethod    = 9,
        CXIdxEntity_ObjCClassMethod       = 10,
        CXIdxEntity_ObjCProperty          = 11,
        CXIdxEntity_ObjCIvar              = 12,
        CXIdxEntity_Enum                  = 13,
        CXIdxEntity_Struct                = 14,
        CXIdxEntity_Union                 = 15,
        CXIdxEntity_CXXClass              = 16,
        CXIdxEntity_CXXNamespace          = 17,
        CXIdxEntity_CXXNamespaceAlias     = 18,
        CXIdxEntity_CXXStaticVariable     = 19,
        CXIdxEntity_CXXStaticMethod       = 20,
        CXIdxEntity_CXXInstanceMethod     = 21,
        CXIdxEntity_CXXConstructor        = 22,
        CXIdxEntity_CXXDestructor         = 23,
        CXIdxEntity_CXXConversionFunction = 24,
        CXIdxEntity_CXXTypeAlias          = 25,
        CXIdxEntity_CXXInterface          = 26,
        CXIdxEntity_CXXConcept            = 27;

    public static final int
        CXIdxEntityLang_None  = 0,
        CXIdxEntityLang_C     = 1,
        CXIdxEntityLang_ObjC  = 2,
        CXIdxEntityLang_CXX   = 3,
        CXIdxEntityLang_Swift = 4;

    public static final int
        CXIdxEntity_NonTemplate                   = 0,
        CXIdxEntity_Template                      = 1,
        CXIdxEntity_TemplatePartialSpecialization = 2,
        CXIdxEntity_TemplateSpecialization        = 3;

    public static final int
        CXIdxAttr_Unexposed          = 0,
        CXIdxAttr_IBAction           = 1,
        CXIdxAttr_IBOutlet           = 2,
        CXIdxAttr_IBOutletCollection = 3;

    public static final int CXIdxDeclFlag_Skipped = 0x1;

    public static final int
        CXIdxObjCContainer_ForwardRef     = 0,
        CXIdxObjCContainer_Interface      = 1,
        CXIdxObjCContainer_Implementation = 2;

    public static final int
        CXIdxEntityRef_Direct   = 1,
        CXIdxEntityRef_Implicit = 2;

    public static final int
        CXSymbolRole_None        = 0,
        CXSymbolRole_Declaration = 1 << 0,
        CXSymbolRole_Definition  = 1 << 1,
        CXSymbolRole_Reference   = 1 << 2,
        CXSymbolRole_Read        = 1 << 3,
        CXSymbolRole_Write       = 1 << 4,
        CXSymbolRole_Call        = 1 << 5,
        CXSymbolRole_Dynamic     = 1 << 6,
        CXSymbolRole_AddressOf   = 1 << 7,
        CXSymbolRole_Implicit    = 1 << 8;

    public static final int
        CXIndexOpt_None                                = 0x0,
        CXIndexOpt_SuppressRedundantRefs               = 0x1,
        CXIndexOpt_IndexFunctionLocalSymbols           = 0x2,
        CXIndexOpt_IndexImplicitTemplateInstantiations = 0x4,
        CXIndexOpt_SuppressWarnings                    = 0x8,
        CXIndexOpt_SkipParsedBodiesInSession           = 0x10;

    public static final int
        CXBinaryOperator_Invalid   = 0,
        CXBinaryOperator_PtrMemD   = 1,
        CXBinaryOperator_PtrMemI   = 2,
        CXBinaryOperator_Mul       = 3,
        CXBinaryOperator_Div       = 4,
        CXBinaryOperator_Rem       = 5,
        CXBinaryOperator_Add       = 6,
        CXBinaryOperator_Sub       = 7,
        CXBinaryOperator_Shl       = 8,
        CXBinaryOperator_Shr       = 9,
        CXBinaryOperator_Cmp       = 10,
        CXBinaryOperator_LT        = 11,
        CXBinaryOperator_GT        = 12,
        CXBinaryOperator_LE        = 13,
        CXBinaryOperator_GE        = 14,
        CXBinaryOperator_EQ        = 15,
        CXBinaryOperator_NE        = 16,
        CXBinaryOperator_And       = 17,
        CXBinaryOperator_Xor       = 18,
        CXBinaryOperator_Or        = 19,
        CXBinaryOperator_LAnd      = 20,
        CXBinaryOperator_LOr       = 21,
        CXBinaryOperator_Assign    = 22,
        CXBinaryOperator_MulAssign = 23,
        CXBinaryOperator_DivAssign = 24,
        CXBinaryOperator_RemAssign = 25,
        CXBinaryOperator_AddAssign = 26,
        CXBinaryOperator_SubAssign = 27,
        CXBinaryOperator_ShlAssign = 28,
        CXBinaryOperator_ShrAssign = 29,
        CXBinaryOperator_AndAssign = 30,
        CXBinaryOperator_XorAssign = 31,
        CXBinaryOperator_OrAssign  = 32,
        CXBinaryOperator_Comma     = 33;

    public static final int
        CXUnaryOperator_Invalid   = 0,
        CXUnaryOperator_PostInc   = 1,
        CXUnaryOperator_PostDec   = 2,
        CXUnaryOperator_PreInc    = 3,
        CXUnaryOperator_PreDec    = 4,
        CXUnaryOperator_AddrOf    = 5,
        CXUnaryOperator_Deref     = 6,
        CXUnaryOperator_Plus      = 7,
        CXUnaryOperator_Minus     = 8,
        CXUnaryOperator_Not       = 9,
        CXUnaryOperator_LNot      = 10,
        CXUnaryOperator_Real      = 11,
        CXUnaryOperator_Imag      = 12,
        CXUnaryOperator_Extension = 13,
        CXUnaryOperator_Coawait   = 14;

    protected ClangIndex() {
        throw new UnsupportedOperationException();
    }

    // --- [ clang_getCString ] ---

    /** {@code char const * clang_getCString(CXString string)} */
    public static native long nclang_getCString(long string, long __functionAddress);

    /** {@code char const * clang_getCString(CXString string)} */
    public static long nclang_getCString(long string) {
        long __functionAddress = Functions.getCString;
        return nclang_getCString(string, __functionAddress);
    }

    /** {@code char const * clang_getCString(CXString string)} */
    @NativeType("char const *")
    public static @Nullable String clang_getCString(CXString string) {
        long __result = nclang_getCString(string.address());
        return memUTF8Safe(__result);
    }

    // --- [ clang_disposeString ] ---

    /** {@code void clang_disposeString(CXString string)} */
    public static native void nclang_disposeString(long string, long __functionAddress);

    /** {@code void clang_disposeString(CXString string)} */
    public static void nclang_disposeString(long string) {
        long __functionAddress = Functions.disposeString;
        nclang_disposeString(string, __functionAddress);
    }

    /** {@code void clang_disposeString(CXString string)} */
    public static void clang_disposeString(CXString string) {
        nclang_disposeString(string.address());
    }

    // --- [ clang_disposeStringSet ] ---

    /** {@code void clang_disposeStringSet(CXStringSet * set)} */
    public static void nclang_disposeStringSet(long set) {
        long __functionAddress = Functions.disposeStringSet;
        invokePV(set, __functionAddress);
    }

    /** {@code void clang_disposeStringSet(CXStringSet * set)} */
    public static void clang_disposeStringSet(@NativeType("CXStringSet *") CXStringSet set) {
        nclang_disposeStringSet(set.address());
    }

    // --- [ clang_createIndex ] ---

    /** {@code CXIndex clang_createIndex(int excludeDeclarationsFromPCH, int displayDiagnostics)} */
    @NativeType("CXIndex")
    public static long clang_createIndex(@NativeType("int") boolean excludeDeclarationsFromPCH, @NativeType("int") boolean displayDiagnostics) {
        long __functionAddress = Functions.createIndex;
        return invokeP(excludeDeclarationsFromPCH ? 1 : 0, displayDiagnostics ? 1 : 0, __functionAddress);
    }

    // --- [ clang_disposeIndex ] ---

    /** {@code void clang_disposeIndex(CXIndex index)} */
    public static void clang_disposeIndex(@NativeType("CXIndex") long index) {
        long __functionAddress = Functions.disposeIndex;
        if (CHECKS) {
            check(index);
        }
        invokePV(index, __functionAddress);
    }

    // --- [ clang_createIndexWithOptions ] ---

    /** {@code CXIndex clang_createIndexWithOptions(CXIndexOptions const * options)} */
    public static long nclang_createIndexWithOptions(long options) {
        long __functionAddress = Functions.createIndexWithOptions;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePP(options, __functionAddress);
    }

    /** {@code CXIndex clang_createIndexWithOptions(CXIndexOptions const * options)} */
    @NativeType("CXIndex")
    public static long clang_createIndexWithOptions(@NativeType("CXIndexOptions const *") CXIndexOptions options) {
        return nclang_createIndexWithOptions(options.address());
    }

    // --- [ clang_CXIndex_setGlobalOptions ] ---

    /** {@code void clang_CXIndex_setGlobalOptions(CXIndex index, unsigned options)} */
    public static void clang_CXIndex_setGlobalOptions(@NativeType("CXIndex") long index, @NativeType("unsigned") int options) {
        long __functionAddress = Functions.CXIndex_setGlobalOptions;
        if (CHECKS) {
            check(index);
        }
        invokePV(index, options, __functionAddress);
    }

    // --- [ clang_CXIndex_getGlobalOptions ] ---

    /** {@code unsigned clang_CXIndex_getGlobalOptions(CXIndex index)} */
    @NativeType("unsigned")
    public static int clang_CXIndex_getGlobalOptions(@NativeType("CXIndex") long index) {
        long __functionAddress = Functions.CXIndex_getGlobalOptions;
        if (CHECKS) {
            check(index);
        }
        return invokePI(index, __functionAddress);
    }

    // --- [ clang_CXIndex_setInvocationEmissionPathOption ] ---

    /** {@code void clang_CXIndex_setInvocationEmissionPathOption(CXIndex index, char const * Path)} */
    public static void nclang_CXIndex_setInvocationEmissionPathOption(long index, long Path) {
        long __functionAddress = Functions.CXIndex_setInvocationEmissionPathOption;
        if (CHECKS) {
            check(__functionAddress);
            check(index);
        }
        invokePPV(index, Path, __functionAddress);
    }

    /** {@code void clang_CXIndex_setInvocationEmissionPathOption(CXIndex index, char const * Path)} */
    public static void clang_CXIndex_setInvocationEmissionPathOption(@NativeType("CXIndex") long index, @NativeType("char const *") @Nullable ByteBuffer Path) {
        if (CHECKS) {
            checkNT1Safe(Path);
        }
        nclang_CXIndex_setInvocationEmissionPathOption(index, memAddressSafe(Path));
    }

    /** {@code void clang_CXIndex_setInvocationEmissionPathOption(CXIndex index, char const * Path)} */
    public static void clang_CXIndex_setInvocationEmissionPathOption(@NativeType("CXIndex") long index, @NativeType("char const *") @Nullable CharSequence Path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(Path, true);
            long PathEncoded = Path == null ? NULL : stack.getPointerAddress();
            nclang_CXIndex_setInvocationEmissionPathOption(index, PathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_getFileName ] ---

    /** {@code CXString clang_getFileName(CXFile SFile)} */
    public static native void nclang_getFileName(long SFile, long __functionAddress, long __result);

    /** {@code CXString clang_getFileName(CXFile SFile)} */
    public static void nclang_getFileName(long SFile, long __result) {
        long __functionAddress = Functions.getFileName;
        if (CHECKS) {
            check(SFile);
        }
        nclang_getFileName(SFile, __functionAddress, __result);
    }

    /** {@code CXString clang_getFileName(CXFile SFile)} */
    public static CXString clang_getFileName(@NativeType("CXFile") long SFile, CXString __result) {
        nclang_getFileName(SFile, __result.address());
        return __result;
    }

    // --- [ clang_getFileTime ] ---

    /** {@code time_t clang_getFileTime(CXFile SFile)} */
    @NativeType("time_t")
    public static long clang_getFileTime(@NativeType("CXFile") long SFile) {
        long __functionAddress = Functions.getFileTime;
        if (CHECKS) {
            check(SFile);
        }
        return invokePJ(SFile, __functionAddress);
    }

    // --- [ clang_getFileUniqueID ] ---

    /** {@code int clang_getFileUniqueID(CXFile file, CXFileUniqueID * outID)} */
    public static int nclang_getFileUniqueID(long file, long outID) {
        long __functionAddress = Functions.getFileUniqueID;
        if (CHECKS) {
            check(file);
        }
        return invokePPI(file, outID, __functionAddress);
    }

    /** {@code int clang_getFileUniqueID(CXFile file, CXFileUniqueID * outID)} */
    public static int clang_getFileUniqueID(@NativeType("CXFile") long file, @NativeType("CXFileUniqueID *") CXFileUniqueID outID) {
        return nclang_getFileUniqueID(file, outID.address());
    }

    // --- [ clang_isFileMultipleIncludeGuarded ] ---

    /** {@code unsigned clang_isFileMultipleIncludeGuarded(CXTranslationUnit tu, CXFile file)} */
    @NativeType("unsigned")
    public static boolean clang_isFileMultipleIncludeGuarded(@NativeType("CXTranslationUnit") long tu, @NativeType("CXFile") long file) {
        long __functionAddress = Functions.isFileMultipleIncludeGuarded;
        if (CHECKS) {
            check(tu);
            check(file);
        }
        return invokePPI(tu, file, __functionAddress) != 0;
    }

    // --- [ clang_getFile ] ---

    /** {@code CXFile clang_getFile(CXTranslationUnit tu, char const * file_name)} */
    public static long nclang_getFile(long tu, long file_name) {
        long __functionAddress = Functions.getFile;
        if (CHECKS) {
            check(tu);
        }
        return invokePPP(tu, file_name, __functionAddress);
    }

    /** {@code CXFile clang_getFile(CXTranslationUnit tu, char const * file_name)} */
    @NativeType("CXFile")
    public static long clang_getFile(@NativeType("CXTranslationUnit") long tu, @NativeType("char const *") ByteBuffer file_name) {
        if (CHECKS) {
            checkNT1(file_name);
        }
        return nclang_getFile(tu, memAddress(file_name));
    }

    /** {@code CXFile clang_getFile(CXTranslationUnit tu, char const * file_name)} */
    @NativeType("CXFile")
    public static long clang_getFile(@NativeType("CXTranslationUnit") long tu, @NativeType("char const *") CharSequence file_name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file_name, true);
            long file_nameEncoded = stack.getPointerAddress();
            return nclang_getFile(tu, file_nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_getFileContents ] ---

    /** {@code char const * clang_getFileContents(CXTranslationUnit tu, CXFile file, size_t * size)} */
    public static long nclang_getFileContents(long tu, long file, long size) {
        long __functionAddress = Functions.getFileContents;
        if (CHECKS) {
            check(__functionAddress);
            check(tu);
            check(file);
        }
        return invokePPPP(tu, file, size, __functionAddress);
    }

    /** {@code char const * clang_getFileContents(CXTranslationUnit tu, CXFile file, size_t * size)} */
    @NativeType("char const *")
    public static @Nullable ByteBuffer clang_getFileContents(@NativeType("CXTranslationUnit") long tu, @NativeType("CXFile") long file) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        PointerBuffer size = stack.callocPointer(1);
        try {
            long __result = nclang_getFileContents(tu, file, memAddress(size));
            return memByteBufferSafe(__result, (int)size.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_File_isEqual ] ---

    /** {@code int clang_File_isEqual(CXFile file1, CXFile file2)} */
    @NativeType("int")
    public static boolean clang_File_isEqual(@NativeType("CXFile") long file1, @NativeType("CXFile") long file2) {
        long __functionAddress = Functions.File_isEqual;
        return invokePPI(file1, file2, __functionAddress) != 0;
    }

    // --- [ clang_File_tryGetRealPathName ] ---

    /** {@code CXString clang_File_tryGetRealPathName(CXFile file)} */
    public static native void nclang_File_tryGetRealPathName(long file, long __functionAddress, long __result);

    /** {@code CXString clang_File_tryGetRealPathName(CXFile file)} */
    public static void nclang_File_tryGetRealPathName(long file, long __result) {
        long __functionAddress = Functions.File_tryGetRealPathName;
        if (CHECKS) {
            check(__functionAddress);
            check(file);
        }
        nclang_File_tryGetRealPathName(file, __functionAddress, __result);
    }

    /** {@code CXString clang_File_tryGetRealPathName(CXFile file)} */
    public static CXString clang_File_tryGetRealPathName(@NativeType("CXFile") long file, CXString __result) {
        nclang_File_tryGetRealPathName(file, __result.address());
        return __result;
    }

    // --- [ clang_getNullLocation ] ---

    /** {@code CXSourceLocation clang_getNullLocation(void)} */
    public static native void nclang_getNullLocation(long __functionAddress, long __result);

    /** {@code CXSourceLocation clang_getNullLocation(void)} */
    public static void nclang_getNullLocation(long __result) {
        long __functionAddress = Functions.getNullLocation;
        nclang_getNullLocation(__functionAddress, __result);
    }

    /** {@code CXSourceLocation clang_getNullLocation(void)} */
    public static CXSourceLocation clang_getNullLocation(CXSourceLocation __result) {
        nclang_getNullLocation(__result.address());
        return __result;
    }

    // --- [ clang_equalLocations ] ---

    /** {@code unsigned clang_equalLocations(CXSourceLocation loc1, CXSourceLocation loc2)} */
    public static native int nclang_equalLocations(long loc1, long loc2, long __functionAddress);

    /** {@code unsigned clang_equalLocations(CXSourceLocation loc1, CXSourceLocation loc2)} */
    public static int nclang_equalLocations(long loc1, long loc2) {
        long __functionAddress = Functions.equalLocations;
        return nclang_equalLocations(loc1, loc2, __functionAddress);
    }

    /** {@code unsigned clang_equalLocations(CXSourceLocation loc1, CXSourceLocation loc2)} */
    @NativeType("unsigned")
    public static boolean clang_equalLocations(CXSourceLocation loc1, CXSourceLocation loc2) {
        return nclang_equalLocations(loc1.address(), loc2.address()) != 0;
    }

    // --- [ clang_isBeforeInTranslationUnit ] ---

    /** {@code unsigned clang_isBeforeInTranslationUnit(CXSourceLocation loc1, CXSourceLocation loc2)} */
    public static native int nclang_isBeforeInTranslationUnit(long loc1, long loc2, long __functionAddress);

    /** {@code unsigned clang_isBeforeInTranslationUnit(CXSourceLocation loc1, CXSourceLocation loc2)} */
    public static int nclang_isBeforeInTranslationUnit(long loc1, long loc2) {
        long __functionAddress = Functions.isBeforeInTranslationUnit;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_isBeforeInTranslationUnit(loc1, loc2, __functionAddress);
    }

    /** {@code unsigned clang_isBeforeInTranslationUnit(CXSourceLocation loc1, CXSourceLocation loc2)} */
    @NativeType("unsigned")
    public static boolean clang_isBeforeInTranslationUnit(CXSourceLocation loc1, CXSourceLocation loc2) {
        return nclang_isBeforeInTranslationUnit(loc1.address(), loc2.address()) != 0;
    }

    // --- [ clang_getLocation ] ---

    /** {@code CXSourceLocation clang_getLocation(CXTranslationUnit tu, CXFile file, unsigned line, unsigned column)} */
    public static native void nclang_getLocation(long tu, long file, int line, int column, long __functionAddress, long __result);

    /** {@code CXSourceLocation clang_getLocation(CXTranslationUnit tu, CXFile file, unsigned line, unsigned column)} */
    public static void nclang_getLocation(long tu, long file, int line, int column, long __result) {
        long __functionAddress = Functions.getLocation;
        if (CHECKS) {
            check(tu);
            check(file);
        }
        nclang_getLocation(tu, file, line, column, __functionAddress, __result);
    }

    /** {@code CXSourceLocation clang_getLocation(CXTranslationUnit tu, CXFile file, unsigned line, unsigned column)} */
    public static CXSourceLocation clang_getLocation(@NativeType("CXTranslationUnit") long tu, @NativeType("CXFile") long file, @NativeType("unsigned") int line, @NativeType("unsigned") int column, CXSourceLocation __result) {
        nclang_getLocation(tu, file, line, column, __result.address());
        return __result;
    }

    // --- [ clang_getLocationForOffset ] ---

    /** {@code CXSourceLocation clang_getLocationForOffset(CXTranslationUnit tu, CXFile file, unsigned offset)} */
    public static native void nclang_getLocationForOffset(long tu, long file, int offset, long __functionAddress, long __result);

    /** {@code CXSourceLocation clang_getLocationForOffset(CXTranslationUnit tu, CXFile file, unsigned offset)} */
    public static void nclang_getLocationForOffset(long tu, long file, int offset, long __result) {
        long __functionAddress = Functions.getLocationForOffset;
        if (CHECKS) {
            check(tu);
            check(file);
        }
        nclang_getLocationForOffset(tu, file, offset, __functionAddress, __result);
    }

    /** {@code CXSourceLocation clang_getLocationForOffset(CXTranslationUnit tu, CXFile file, unsigned offset)} */
    public static CXSourceLocation clang_getLocationForOffset(@NativeType("CXTranslationUnit") long tu, @NativeType("CXFile") long file, @NativeType("unsigned") int offset, CXSourceLocation __result) {
        nclang_getLocationForOffset(tu, file, offset, __result.address());
        return __result;
    }

    // --- [ clang_Location_isInSystemHeader ] ---

    /** {@code int clang_Location_isInSystemHeader(CXSourceLocation location)} */
    public static native int nclang_Location_isInSystemHeader(long location, long __functionAddress);

    /** {@code int clang_Location_isInSystemHeader(CXSourceLocation location)} */
    public static int nclang_Location_isInSystemHeader(long location) {
        long __functionAddress = Functions.Location_isInSystemHeader;
        return nclang_Location_isInSystemHeader(location, __functionAddress);
    }

    /** {@code int clang_Location_isInSystemHeader(CXSourceLocation location)} */
    @NativeType("int")
    public static boolean clang_Location_isInSystemHeader(CXSourceLocation location) {
        return nclang_Location_isInSystemHeader(location.address()) != 0;
    }

    // --- [ clang_Location_isFromMainFile ] ---

    /** {@code int clang_Location_isFromMainFile(CXSourceLocation location)} */
    public static native int nclang_Location_isFromMainFile(long location, long __functionAddress);

    /** {@code int clang_Location_isFromMainFile(CXSourceLocation location)} */
    public static int nclang_Location_isFromMainFile(long location) {
        long __functionAddress = Functions.Location_isFromMainFile;
        return nclang_Location_isFromMainFile(location, __functionAddress);
    }

    /** {@code int clang_Location_isFromMainFile(CXSourceLocation location)} */
    @NativeType("int")
    public static boolean clang_Location_isFromMainFile(CXSourceLocation location) {
        return nclang_Location_isFromMainFile(location.address()) != 0;
    }

    // --- [ clang_getNullRange ] ---

    /** {@code CXSourceRange clang_getNullRange(void)} */
    public static native void nclang_getNullRange(long __functionAddress, long __result);

    /** {@code CXSourceRange clang_getNullRange(void)} */
    public static void nclang_getNullRange(long __result) {
        long __functionAddress = Functions.getNullRange;
        nclang_getNullRange(__functionAddress, __result);
    }

    /** {@code CXSourceRange clang_getNullRange(void)} */
    public static CXSourceRange clang_getNullRange(CXSourceRange __result) {
        nclang_getNullRange(__result.address());
        return __result;
    }

    // --- [ clang_getRange ] ---

    /** {@code CXSourceRange clang_getRange(CXSourceLocation begin, CXSourceLocation end)} */
    public static native void nclang_getRange(long begin, long end, long __functionAddress, long __result);

    /** {@code CXSourceRange clang_getRange(CXSourceLocation begin, CXSourceLocation end)} */
    public static void nclang_getRange(long begin, long end, long __result) {
        long __functionAddress = Functions.getRange;
        nclang_getRange(begin, end, __functionAddress, __result);
    }

    /** {@code CXSourceRange clang_getRange(CXSourceLocation begin, CXSourceLocation end)} */
    public static CXSourceRange clang_getRange(CXSourceLocation begin, CXSourceLocation end, CXSourceRange __result) {
        nclang_getRange(begin.address(), end.address(), __result.address());
        return __result;
    }

    // --- [ clang_equalRanges ] ---

    /** {@code unsigned clang_equalRanges(CXSourceRange range1, CXSourceRange range2)} */
    public static native int nclang_equalRanges(long range1, long range2, long __functionAddress);

    /** {@code unsigned clang_equalRanges(CXSourceRange range1, CXSourceRange range2)} */
    public static int nclang_equalRanges(long range1, long range2) {
        long __functionAddress = Functions.equalRanges;
        return nclang_equalRanges(range1, range2, __functionAddress);
    }

    /** {@code unsigned clang_equalRanges(CXSourceRange range1, CXSourceRange range2)} */
    @NativeType("unsigned")
    public static boolean clang_equalRanges(CXSourceRange range1, CXSourceRange range2) {
        return nclang_equalRanges(range1.address(), range2.address()) != 0;
    }

    // --- [ clang_Range_isNull ] ---

    /** {@code int clang_Range_isNull(CXSourceRange range)} */
    public static native int nclang_Range_isNull(long range, long __functionAddress);

    /** {@code int clang_Range_isNull(CXSourceRange range)} */
    public static int nclang_Range_isNull(long range) {
        long __functionAddress = Functions.Range_isNull;
        return nclang_Range_isNull(range, __functionAddress);
    }

    /** {@code int clang_Range_isNull(CXSourceRange range)} */
    @NativeType("int")
    public static boolean clang_Range_isNull(CXSourceRange range) {
        return nclang_Range_isNull(range.address()) != 0;
    }

    // --- [ clang_getExpansionLocation ] ---

    /** {@code void clang_getExpansionLocation(CXSourceLocation location, CXFile * file, unsigned * line, unsigned * column, unsigned * offset)} */
    public static native void nclang_getExpansionLocation(long location, long file, long line, long column, long offset, long __functionAddress);

    /** {@code void clang_getExpansionLocation(CXSourceLocation location, CXFile * file, unsigned * line, unsigned * column, unsigned * offset)} */
    public static void nclang_getExpansionLocation(long location, long file, long line, long column, long offset) {
        long __functionAddress = Functions.getExpansionLocation;
        nclang_getExpansionLocation(location, file, line, column, offset, __functionAddress);
    }

    /** {@code void clang_getExpansionLocation(CXSourceLocation location, CXFile * file, unsigned * line, unsigned * column, unsigned * offset)} */
    public static void clang_getExpansionLocation(CXSourceLocation location, @NativeType("CXFile *") @Nullable PointerBuffer file, @NativeType("unsigned *") @Nullable IntBuffer line, @NativeType("unsigned *") @Nullable IntBuffer column, @NativeType("unsigned *") @Nullable IntBuffer offset) {
        if (CHECKS) {
            checkSafe(file, 1);
            checkSafe(line, 1);
            checkSafe(column, 1);
            checkSafe(offset, 1);
        }
        nclang_getExpansionLocation(location.address(), memAddressSafe(file), memAddressSafe(line), memAddressSafe(column), memAddressSafe(offset));
    }

    // --- [ clang_getPresumedLocation ] ---

    /** {@code void clang_getPresumedLocation(CXSourceLocation location, CXString * filename, unsigned * line, unsigned * column)} */
    public static native void nclang_getPresumedLocation(long location, long filename, long line, long column, long __functionAddress);

    /** {@code void clang_getPresumedLocation(CXSourceLocation location, CXString * filename, unsigned * line, unsigned * column)} */
    public static void nclang_getPresumedLocation(long location, long filename, long line, long column) {
        long __functionAddress = Functions.getPresumedLocation;
        nclang_getPresumedLocation(location, filename, line, column, __functionAddress);
    }

    /** {@code void clang_getPresumedLocation(CXSourceLocation location, CXString * filename, unsigned * line, unsigned * column)} */
    public static void clang_getPresumedLocation(CXSourceLocation location, @NativeType("CXString *") CXString.@Nullable Buffer filename, @NativeType("unsigned *") @Nullable IntBuffer line, @NativeType("unsigned *") @Nullable IntBuffer column) {
        if (CHECKS) {
            checkSafe(filename, 1);
            checkSafe(line, 1);
            checkSafe(column, 1);
        }
        nclang_getPresumedLocation(location.address(), memAddressSafe(filename), memAddressSafe(line), memAddressSafe(column));
    }

    // --- [ clang_getSpellingLocation ] ---

    /** {@code void clang_getSpellingLocation(CXSourceLocation location, CXFile * file, unsigned * line, unsigned * column, unsigned * offset)} */
    public static native void nclang_getSpellingLocation(long location, long file, long line, long column, long offset, long __functionAddress);

    /** {@code void clang_getSpellingLocation(CXSourceLocation location, CXFile * file, unsigned * line, unsigned * column, unsigned * offset)} */
    public static void nclang_getSpellingLocation(long location, long file, long line, long column, long offset) {
        long __functionAddress = Functions.getSpellingLocation;
        nclang_getSpellingLocation(location, file, line, column, offset, __functionAddress);
    }

    /** {@code void clang_getSpellingLocation(CXSourceLocation location, CXFile * file, unsigned * line, unsigned * column, unsigned * offset)} */
    public static void clang_getSpellingLocation(CXSourceLocation location, @NativeType("CXFile *") @Nullable PointerBuffer file, @NativeType("unsigned *") @Nullable IntBuffer line, @NativeType("unsigned *") @Nullable IntBuffer column, @NativeType("unsigned *") @Nullable IntBuffer offset) {
        if (CHECKS) {
            checkSafe(file, 1);
            checkSafe(line, 1);
            checkSafe(column, 1);
            checkSafe(offset, 1);
        }
        nclang_getSpellingLocation(location.address(), memAddressSafe(file), memAddressSafe(line), memAddressSafe(column), memAddressSafe(offset));
    }

    // --- [ clang_getFileLocation ] ---

    /** {@code void clang_getFileLocation(CXSourceLocation location, CXFile * file, unsigned * line, unsigned * column, unsigned * offset)} */
    public static native void nclang_getFileLocation(long location, long file, long line, long column, long offset, long __functionAddress);

    /** {@code void clang_getFileLocation(CXSourceLocation location, CXFile * file, unsigned * line, unsigned * column, unsigned * offset)} */
    public static void nclang_getFileLocation(long location, long file, long line, long column, long offset) {
        long __functionAddress = Functions.getFileLocation;
        nclang_getFileLocation(location, file, line, column, offset, __functionAddress);
    }

    /** {@code void clang_getFileLocation(CXSourceLocation location, CXFile * file, unsigned * line, unsigned * column, unsigned * offset)} */
    public static void clang_getFileLocation(CXSourceLocation location, @NativeType("CXFile *") @Nullable PointerBuffer file, @NativeType("unsigned *") @Nullable IntBuffer line, @NativeType("unsigned *") @Nullable IntBuffer column, @NativeType("unsigned *") @Nullable IntBuffer offset) {
        if (CHECKS) {
            checkSafe(file, 1);
            checkSafe(line, 1);
            checkSafe(column, 1);
            checkSafe(offset, 1);
        }
        nclang_getFileLocation(location.address(), memAddressSafe(file), memAddressSafe(line), memAddressSafe(column), memAddressSafe(offset));
    }

    // --- [ clang_getRangeStart ] ---

    /** {@code CXSourceLocation clang_getRangeStart(CXSourceRange range)} */
    public static native void nclang_getRangeStart(long range, long __functionAddress, long __result);

    /** {@code CXSourceLocation clang_getRangeStart(CXSourceRange range)} */
    public static void nclang_getRangeStart(long range, long __result) {
        long __functionAddress = Functions.getRangeStart;
        nclang_getRangeStart(range, __functionAddress, __result);
    }

    /** {@code CXSourceLocation clang_getRangeStart(CXSourceRange range)} */
    public static CXSourceLocation clang_getRangeStart(CXSourceRange range, CXSourceLocation __result) {
        nclang_getRangeStart(range.address(), __result.address());
        return __result;
    }

    // --- [ clang_getRangeEnd ] ---

    /** {@code CXSourceLocation clang_getRangeEnd(CXSourceRange range)} */
    public static native void nclang_getRangeEnd(long range, long __functionAddress, long __result);

    /** {@code CXSourceLocation clang_getRangeEnd(CXSourceRange range)} */
    public static void nclang_getRangeEnd(long range, long __result) {
        long __functionAddress = Functions.getRangeEnd;
        nclang_getRangeEnd(range, __functionAddress, __result);
    }

    /** {@code CXSourceLocation clang_getRangeEnd(CXSourceRange range)} */
    public static CXSourceLocation clang_getRangeEnd(CXSourceRange range, CXSourceLocation __result) {
        nclang_getRangeEnd(range.address(), __result.address());
        return __result;
    }

    // --- [ clang_getSkippedRanges ] ---

    /** {@code CXSourceRangeList * clang_getSkippedRanges(CXTranslationUnit tu, CXFile file)} */
    public static long nclang_getSkippedRanges(long tu, long file) {
        long __functionAddress = Functions.getSkippedRanges;
        if (CHECKS) {
            check(tu);
            check(file);
        }
        return invokePPP(tu, file, __functionAddress);
    }

    /** {@code CXSourceRangeList * clang_getSkippedRanges(CXTranslationUnit tu, CXFile file)} */
    @NativeType("CXSourceRangeList *")
    public static @Nullable CXSourceRangeList clang_getSkippedRanges(@NativeType("CXTranslationUnit") long tu, @NativeType("CXFile") long file) {
        long __result = nclang_getSkippedRanges(tu, file);
        return CXSourceRangeList.createSafe(__result);
    }

    // --- [ clang_getAllSkippedRanges ] ---

    /** {@code CXSourceRangeList * clang_getAllSkippedRanges(CXTranslationUnit tu)} */
    public static long nclang_getAllSkippedRanges(long tu) {
        long __functionAddress = Functions.getAllSkippedRanges;
        if (CHECKS) {
            check(tu);
        }
        return invokePP(tu, __functionAddress);
    }

    /** {@code CXSourceRangeList * clang_getAllSkippedRanges(CXTranslationUnit tu)} */
    @NativeType("CXSourceRangeList *")
    public static @Nullable CXSourceRangeList clang_getAllSkippedRanges(@NativeType("CXTranslationUnit") long tu) {
        long __result = nclang_getAllSkippedRanges(tu);
        return CXSourceRangeList.createSafe(__result);
    }

    // --- [ clang_disposeSourceRangeList ] ---

    /** {@code void clang_disposeSourceRangeList(CXSourceRangeList * ranges)} */
    public static void nclang_disposeSourceRangeList(long ranges) {
        long __functionAddress = Functions.disposeSourceRangeList;
        invokePV(ranges, __functionAddress);
    }

    /** {@code void clang_disposeSourceRangeList(CXSourceRangeList * ranges)} */
    public static void clang_disposeSourceRangeList(@NativeType("CXSourceRangeList *") CXSourceRangeList ranges) {
        nclang_disposeSourceRangeList(ranges.address());
    }

    // --- [ clang_getNumDiagnosticsInSet ] ---

    /** {@code unsigned clang_getNumDiagnosticsInSet(CXDiagnosticSet Diags)} */
    @NativeType("unsigned")
    public static int clang_getNumDiagnosticsInSet(@NativeType("CXDiagnosticSet") long Diags) {
        long __functionAddress = Functions.getNumDiagnosticsInSet;
        if (CHECKS) {
            check(Diags);
        }
        return invokePI(Diags, __functionAddress);
    }

    // --- [ clang_getDiagnosticInSet ] ---

    /** {@code CXDiagnostic clang_getDiagnosticInSet(CXDiagnosticSet Diags, unsigned Index)} */
    @NativeType("CXDiagnostic")
    public static long clang_getDiagnosticInSet(@NativeType("CXDiagnosticSet") long Diags, @NativeType("unsigned") int Index) {
        long __functionAddress = Functions.getDiagnosticInSet;
        if (CHECKS) {
            check(Diags);
        }
        return invokePP(Diags, Index, __functionAddress);
    }

    // --- [ clang_loadDiagnostics ] ---

    /** {@code CXDiagnosticSet clang_loadDiagnostics(char const * file, enum CXLoadDiag_Error * error, CXString * errorString)} */
    public static long nclang_loadDiagnostics(long file, long error, long errorString) {
        long __functionAddress = Functions.loadDiagnostics;
        return invokePPPP(file, error, errorString, __functionAddress);
    }

    /** {@code CXDiagnosticSet clang_loadDiagnostics(char const * file, enum CXLoadDiag_Error * error, CXString * errorString)} */
    @NativeType("CXDiagnosticSet")
    public static long clang_loadDiagnostics(@NativeType("char const *") ByteBuffer file, @NativeType("enum CXLoadDiag_Error *") IntBuffer error, @NativeType("CXString *") CXString errorString) {
        if (CHECKS) {
            checkNT1(file);
            check(error, 1);
        }
        return nclang_loadDiagnostics(memAddress(file), memAddress(error), errorString.address());
    }

    /** {@code CXDiagnosticSet clang_loadDiagnostics(char const * file, enum CXLoadDiag_Error * error, CXString * errorString)} */
    @NativeType("CXDiagnosticSet")
    public static long clang_loadDiagnostics(@NativeType("char const *") CharSequence file, @NativeType("enum CXLoadDiag_Error *") IntBuffer error, @NativeType("CXString *") CXString errorString) {
        if (CHECKS) {
            check(error, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            return nclang_loadDiagnostics(fileEncoded, memAddress(error), errorString.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_disposeDiagnosticSet ] ---

    /** {@code void clang_disposeDiagnosticSet(CXDiagnosticSet Diags)} */
    public static void clang_disposeDiagnosticSet(@NativeType("CXDiagnosticSet") long Diags) {
        long __functionAddress = Functions.disposeDiagnosticSet;
        if (CHECKS) {
            check(Diags);
        }
        invokePV(Diags, __functionAddress);
    }

    // --- [ clang_getChildDiagnostics ] ---

    /** {@code CXDiagnosticSet clang_getChildDiagnostics(CXDiagnostic D)} */
    @NativeType("CXDiagnosticSet")
    public static long clang_getChildDiagnostics(@NativeType("CXDiagnostic") long D) {
        long __functionAddress = Functions.getChildDiagnostics;
        if (CHECKS) {
            check(D);
        }
        return invokePP(D, __functionAddress);
    }

    // --- [ clang_getNumDiagnostics ] ---

    /** {@code unsigned clang_getNumDiagnostics(CXTranslationUnit Unit)} */
    @NativeType("unsigned")
    public static int clang_getNumDiagnostics(@NativeType("CXTranslationUnit") long Unit) {
        long __functionAddress = Functions.getNumDiagnostics;
        if (CHECKS) {
            check(Unit);
        }
        return invokePI(Unit, __functionAddress);
    }

    // --- [ clang_getDiagnostic ] ---

    /** {@code CXDiagnostic clang_getDiagnostic(CXTranslationUnit Unit, unsigned Index)} */
    @NativeType("CXDiagnostic")
    public static long clang_getDiagnostic(@NativeType("CXTranslationUnit") long Unit, @NativeType("unsigned") int Index) {
        long __functionAddress = Functions.getDiagnostic;
        if (CHECKS) {
            check(Unit);
        }
        return invokePP(Unit, Index, __functionAddress);
    }

    // --- [ clang_getDiagnosticSetFromTU ] ---

    /** {@code CXDiagnosticSet clang_getDiagnosticSetFromTU(CXTranslationUnit Unit)} */
    @NativeType("CXDiagnosticSet")
    public static long clang_getDiagnosticSetFromTU(@NativeType("CXTranslationUnit") long Unit) {
        long __functionAddress = Functions.getDiagnosticSetFromTU;
        if (CHECKS) {
            check(Unit);
        }
        return invokePP(Unit, __functionAddress);
    }

    // --- [ clang_disposeDiagnostic ] ---

    /** {@code void clang_disposeDiagnostic(CXDiagnostic Diagnostic)} */
    public static void clang_disposeDiagnostic(@NativeType("CXDiagnostic") long Diagnostic) {
        long __functionAddress = Functions.disposeDiagnostic;
        if (CHECKS) {
            check(Diagnostic);
        }
        invokePV(Diagnostic, __functionAddress);
    }

    // --- [ clang_formatDiagnostic ] ---

    /** {@code CXString clang_formatDiagnostic(CXDiagnostic Diagnostic, unsigned Options)} */
    public static native void nclang_formatDiagnostic(long Diagnostic, int Options, long __functionAddress, long __result);

    /** {@code CXString clang_formatDiagnostic(CXDiagnostic Diagnostic, unsigned Options)} */
    public static void nclang_formatDiagnostic(long Diagnostic, int Options, long __result) {
        long __functionAddress = Functions.formatDiagnostic;
        if (CHECKS) {
            check(Diagnostic);
        }
        nclang_formatDiagnostic(Diagnostic, Options, __functionAddress, __result);
    }

    /** {@code CXString clang_formatDiagnostic(CXDiagnostic Diagnostic, unsigned Options)} */
    public static CXString clang_formatDiagnostic(@NativeType("CXDiagnostic") long Diagnostic, @NativeType("unsigned") int Options, CXString __result) {
        nclang_formatDiagnostic(Diagnostic, Options, __result.address());
        return __result;
    }

    // --- [ clang_defaultDiagnosticDisplayOptions ] ---

    /** {@code unsigned clang_defaultDiagnosticDisplayOptions(void)} */
    @NativeType("unsigned")
    public static int clang_defaultDiagnosticDisplayOptions() {
        long __functionAddress = Functions.defaultDiagnosticDisplayOptions;
        return invokeI(__functionAddress);
    }

    // --- [ clang_getDiagnosticSeverity ] ---

    /** {@code enum CXDiagnosticSeverity clang_getDiagnosticSeverity(CXDiagnostic Diagnostic)} */
    @NativeType("enum CXDiagnosticSeverity")
    public static int clang_getDiagnosticSeverity(@NativeType("CXDiagnostic") long Diagnostic) {
        long __functionAddress = Functions.getDiagnosticSeverity;
        if (CHECKS) {
            check(Diagnostic);
        }
        return invokePI(Diagnostic, __functionAddress);
    }

    // --- [ clang_getDiagnosticLocation ] ---

    /** {@code CXSourceLocation clang_getDiagnosticLocation(CXDiagnostic Diagnostic)} */
    public static native void nclang_getDiagnosticLocation(long Diagnostic, long __functionAddress, long __result);

    /** {@code CXSourceLocation clang_getDiagnosticLocation(CXDiagnostic Diagnostic)} */
    public static void nclang_getDiagnosticLocation(long Diagnostic, long __result) {
        long __functionAddress = Functions.getDiagnosticLocation;
        if (CHECKS) {
            check(Diagnostic);
        }
        nclang_getDiagnosticLocation(Diagnostic, __functionAddress, __result);
    }

    /** {@code CXSourceLocation clang_getDiagnosticLocation(CXDiagnostic Diagnostic)} */
    public static CXSourceLocation clang_getDiagnosticLocation(@NativeType("CXDiagnostic") long Diagnostic, CXSourceLocation __result) {
        nclang_getDiagnosticLocation(Diagnostic, __result.address());
        return __result;
    }

    // --- [ clang_getDiagnosticSpelling ] ---

    /** {@code CXString clang_getDiagnosticSpelling(CXDiagnostic Diagnostic)} */
    public static native void nclang_getDiagnosticSpelling(long Diagnostic, long __functionAddress, long __result);

    /** {@code CXString clang_getDiagnosticSpelling(CXDiagnostic Diagnostic)} */
    public static void nclang_getDiagnosticSpelling(long Diagnostic, long __result) {
        long __functionAddress = Functions.getDiagnosticSpelling;
        if (CHECKS) {
            check(Diagnostic);
        }
        nclang_getDiagnosticSpelling(Diagnostic, __functionAddress, __result);
    }

    /** {@code CXString clang_getDiagnosticSpelling(CXDiagnostic Diagnostic)} */
    public static CXString clang_getDiagnosticSpelling(@NativeType("CXDiagnostic") long Diagnostic, CXString __result) {
        nclang_getDiagnosticSpelling(Diagnostic, __result.address());
        return __result;
    }

    // --- [ clang_getDiagnosticOption ] ---

    /** {@code CXString clang_getDiagnosticOption(CXDiagnostic Diag, CXString * Disable)} */
    public static native void nclang_getDiagnosticOption(long Diag, long Disable, long __functionAddress, long __result);

    /** {@code CXString clang_getDiagnosticOption(CXDiagnostic Diag, CXString * Disable)} */
    public static void nclang_getDiagnosticOption(long Diag, long Disable, long __result) {
        long __functionAddress = Functions.getDiagnosticOption;
        if (CHECKS) {
            check(Diag);
        }
        nclang_getDiagnosticOption(Diag, Disable, __functionAddress, __result);
    }

    /** {@code CXString clang_getDiagnosticOption(CXDiagnostic Diag, CXString * Disable)} */
    public static CXString clang_getDiagnosticOption(@NativeType("CXDiagnostic") long Diag, @NativeType("CXString *") @Nullable CXString Disable, CXString __result) {
        nclang_getDiagnosticOption(Diag, memAddressSafe(Disable), __result.address());
        return __result;
    }

    // --- [ clang_getDiagnosticCategory ] ---

    /** {@code unsigned clang_getDiagnosticCategory(CXDiagnostic Diagnostic)} */
    @NativeType("unsigned")
    public static int clang_getDiagnosticCategory(@NativeType("CXDiagnostic") long Diagnostic) {
        long __functionAddress = Functions.getDiagnosticCategory;
        if (CHECKS) {
            check(Diagnostic);
        }
        return invokePI(Diagnostic, __functionAddress);
    }

    // --- [ clang_getDiagnosticCategoryText ] ---

    /** {@code CXString clang_getDiagnosticCategoryText(CXDiagnostic Diagnostic)} */
    public static native void nclang_getDiagnosticCategoryText(long Diagnostic, long __functionAddress, long __result);

    /** {@code CXString clang_getDiagnosticCategoryText(CXDiagnostic Diagnostic)} */
    public static void nclang_getDiagnosticCategoryText(long Diagnostic, long __result) {
        long __functionAddress = Functions.getDiagnosticCategoryText;
        if (CHECKS) {
            check(Diagnostic);
        }
        nclang_getDiagnosticCategoryText(Diagnostic, __functionAddress, __result);
    }

    /** {@code CXString clang_getDiagnosticCategoryText(CXDiagnostic Diagnostic)} */
    public static CXString clang_getDiagnosticCategoryText(@NativeType("CXDiagnostic") long Diagnostic, CXString __result) {
        nclang_getDiagnosticCategoryText(Diagnostic, __result.address());
        return __result;
    }

    // --- [ clang_getDiagnosticNumRanges ] ---

    /** {@code unsigned clang_getDiagnosticNumRanges(CXDiagnostic Diagnostic)} */
    @NativeType("unsigned")
    public static int clang_getDiagnosticNumRanges(@NativeType("CXDiagnostic") long Diagnostic) {
        long __functionAddress = Functions.getDiagnosticNumRanges;
        if (CHECKS) {
            check(Diagnostic);
        }
        return invokePI(Diagnostic, __functionAddress);
    }

    // --- [ clang_getDiagnosticRange ] ---

    /** {@code CXSourceRange clang_getDiagnosticRange(CXDiagnostic Diagnostic, unsigned Range)} */
    public static native void nclang_getDiagnosticRange(long Diagnostic, int Range, long __functionAddress, long __result);

    /** {@code CXSourceRange clang_getDiagnosticRange(CXDiagnostic Diagnostic, unsigned Range)} */
    public static void nclang_getDiagnosticRange(long Diagnostic, int Range, long __result) {
        long __functionAddress = Functions.getDiagnosticRange;
        if (CHECKS) {
            check(Diagnostic);
        }
        nclang_getDiagnosticRange(Diagnostic, Range, __functionAddress, __result);
    }

    /** {@code CXSourceRange clang_getDiagnosticRange(CXDiagnostic Diagnostic, unsigned Range)} */
    public static CXSourceRange clang_getDiagnosticRange(@NativeType("CXDiagnostic") long Diagnostic, @NativeType("unsigned") int Range, CXSourceRange __result) {
        nclang_getDiagnosticRange(Diagnostic, Range, __result.address());
        return __result;
    }

    // --- [ clang_getDiagnosticNumFixIts ] ---

    /** {@code unsigned clang_getDiagnosticNumFixIts(CXDiagnostic Diagnostic)} */
    @NativeType("unsigned")
    public static int clang_getDiagnosticNumFixIts(@NativeType("CXDiagnostic") long Diagnostic) {
        long __functionAddress = Functions.getDiagnosticNumFixIts;
        if (CHECKS) {
            check(Diagnostic);
        }
        return invokePI(Diagnostic, __functionAddress);
    }

    // --- [ clang_getDiagnosticFixIt ] ---

    /** {@code CXString clang_getDiagnosticFixIt(CXDiagnostic Diagnostic, unsigned FixIt, CXSourceRange * ReplacementRange)} */
    public static native void nclang_getDiagnosticFixIt(long Diagnostic, int FixIt, long ReplacementRange, long __functionAddress, long __result);

    /** {@code CXString clang_getDiagnosticFixIt(CXDiagnostic Diagnostic, unsigned FixIt, CXSourceRange * ReplacementRange)} */
    public static void nclang_getDiagnosticFixIt(long Diagnostic, int FixIt, long ReplacementRange, long __result) {
        long __functionAddress = Functions.getDiagnosticFixIt;
        if (CHECKS) {
            check(Diagnostic);
        }
        nclang_getDiagnosticFixIt(Diagnostic, FixIt, ReplacementRange, __functionAddress, __result);
    }

    /** {@code CXString clang_getDiagnosticFixIt(CXDiagnostic Diagnostic, unsigned FixIt, CXSourceRange * ReplacementRange)} */
    public static CXString clang_getDiagnosticFixIt(@NativeType("CXDiagnostic") long Diagnostic, @NativeType("unsigned") int FixIt, @NativeType("CXSourceRange *") CXSourceRange ReplacementRange, CXString __result) {
        nclang_getDiagnosticFixIt(Diagnostic, FixIt, ReplacementRange.address(), __result.address());
        return __result;
    }

    // --- [ clang_getTranslationUnitSpelling ] ---

    /** {@code CXString clang_getTranslationUnitSpelling(CXTranslationUnit CTUnit)} */
    public static native void nclang_getTranslationUnitSpelling(long CTUnit, long __functionAddress, long __result);

    /** {@code CXString clang_getTranslationUnitSpelling(CXTranslationUnit CTUnit)} */
    public static void nclang_getTranslationUnitSpelling(long CTUnit, long __result) {
        long __functionAddress = Functions.getTranslationUnitSpelling;
        if (CHECKS) {
            check(CTUnit);
        }
        nclang_getTranslationUnitSpelling(CTUnit, __functionAddress, __result);
    }

    /** {@code CXString clang_getTranslationUnitSpelling(CXTranslationUnit CTUnit)} */
    public static CXString clang_getTranslationUnitSpelling(@NativeType("CXTranslationUnit") long CTUnit, CXString __result) {
        nclang_getTranslationUnitSpelling(CTUnit, __result.address());
        return __result;
    }

    // --- [ clang_createTranslationUnitFromSourceFile ] ---

    /** {@code CXTranslationUnit clang_createTranslationUnitFromSourceFile(CXIndex CIdx, char const * source_filename, int num_clang_command_line_args, char const * const * clang_command_line_args, unsigned num_unsaved_files, struct CXUnsavedFile * unsaved_files)} */
    public static long nclang_createTranslationUnitFromSourceFile(long CIdx, long source_filename, int num_clang_command_line_args, long clang_command_line_args, int num_unsaved_files, long unsaved_files) {
        long __functionAddress = Functions.createTranslationUnitFromSourceFile;
        if (CHECKS) {
            check(CIdx);
            if (unsaved_files != NULL) { Struct.validate(unsaved_files, num_unsaved_files, CXUnsavedFile.SIZEOF, CXUnsavedFile::validate); }
        }
        return invokePPPPP(CIdx, source_filename, num_clang_command_line_args, clang_command_line_args, num_unsaved_files, unsaved_files, __functionAddress);
    }

    /** {@code CXTranslationUnit clang_createTranslationUnitFromSourceFile(CXIndex CIdx, char const * source_filename, int num_clang_command_line_args, char const * const * clang_command_line_args, unsigned num_unsaved_files, struct CXUnsavedFile * unsaved_files)} */
    @NativeType("CXTranslationUnit")
    public static long clang_createTranslationUnitFromSourceFile(@NativeType("CXIndex") long CIdx, @NativeType("char const *") @Nullable ByteBuffer source_filename, @NativeType("char const * const *") @Nullable PointerBuffer clang_command_line_args, @NativeType("struct CXUnsavedFile *") CXUnsavedFile.@Nullable Buffer unsaved_files) {
        if (CHECKS) {
            checkNT1Safe(source_filename);
        }
        return nclang_createTranslationUnitFromSourceFile(CIdx, memAddressSafe(source_filename), remainingSafe(clang_command_line_args), memAddressSafe(clang_command_line_args), remainingSafe(unsaved_files), memAddressSafe(unsaved_files));
    }

    /** {@code CXTranslationUnit clang_createTranslationUnitFromSourceFile(CXIndex CIdx, char const * source_filename, int num_clang_command_line_args, char const * const * clang_command_line_args, unsigned num_unsaved_files, struct CXUnsavedFile * unsaved_files)} */
    @NativeType("CXTranslationUnit")
    public static long clang_createTranslationUnitFromSourceFile(@NativeType("CXIndex") long CIdx, @NativeType("char const *") @Nullable CharSequence source_filename, @NativeType("char const * const *") @Nullable PointerBuffer clang_command_line_args, @NativeType("struct CXUnsavedFile *") CXUnsavedFile.@Nullable Buffer unsaved_files) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(source_filename, true);
            long source_filenameEncoded = source_filename == null ? NULL : stack.getPointerAddress();
            return nclang_createTranslationUnitFromSourceFile(CIdx, source_filenameEncoded, remainingSafe(clang_command_line_args), memAddressSafe(clang_command_line_args), remainingSafe(unsaved_files), memAddressSafe(unsaved_files));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_createTranslationUnit ] ---

    /** {@code CXTranslationUnit clang_createTranslationUnit(CXIndex CIdx, char const * ast_filename)} */
    public static long nclang_createTranslationUnit(long CIdx, long ast_filename) {
        long __functionAddress = Functions.createTranslationUnit;
        if (CHECKS) {
            check(CIdx);
        }
        return invokePPP(CIdx, ast_filename, __functionAddress);
    }

    /** {@code CXTranslationUnit clang_createTranslationUnit(CXIndex CIdx, char const * ast_filename)} */
    @NativeType("CXTranslationUnit")
    public static long clang_createTranslationUnit(@NativeType("CXIndex") long CIdx, @NativeType("char const *") ByteBuffer ast_filename) {
        if (CHECKS) {
            checkNT1(ast_filename);
        }
        return nclang_createTranslationUnit(CIdx, memAddress(ast_filename));
    }

    /** {@code CXTranslationUnit clang_createTranslationUnit(CXIndex CIdx, char const * ast_filename)} */
    @NativeType("CXTranslationUnit")
    public static long clang_createTranslationUnit(@NativeType("CXIndex") long CIdx, @NativeType("char const *") CharSequence ast_filename) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(ast_filename, true);
            long ast_filenameEncoded = stack.getPointerAddress();
            return nclang_createTranslationUnit(CIdx, ast_filenameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_createTranslationUnit2 ] ---

    /** {@code enum CXErrorCode clang_createTranslationUnit2(CXIndex CIdx, char const * ast_filename, CXTranslationUnit * out_TU)} */
    public static int nclang_createTranslationUnit2(long CIdx, long ast_filename, long out_TU) {
        long __functionAddress = Functions.createTranslationUnit2;
        if (CHECKS) {
            check(CIdx);
        }
        return invokePPPI(CIdx, ast_filename, out_TU, __functionAddress);
    }

    /** {@code enum CXErrorCode clang_createTranslationUnit2(CXIndex CIdx, char const * ast_filename, CXTranslationUnit * out_TU)} */
    @NativeType("enum CXErrorCode")
    public static int clang_createTranslationUnit2(@NativeType("CXIndex") long CIdx, @NativeType("char const *") ByteBuffer ast_filename, @NativeType("CXTranslationUnit *") PointerBuffer out_TU) {
        if (CHECKS) {
            checkNT1(ast_filename);
            check(out_TU, 1);
        }
        return nclang_createTranslationUnit2(CIdx, memAddress(ast_filename), memAddress(out_TU));
    }

    /** {@code enum CXErrorCode clang_createTranslationUnit2(CXIndex CIdx, char const * ast_filename, CXTranslationUnit * out_TU)} */
    @NativeType("enum CXErrorCode")
    public static int clang_createTranslationUnit2(@NativeType("CXIndex") long CIdx, @NativeType("char const *") CharSequence ast_filename, @NativeType("CXTranslationUnit *") PointerBuffer out_TU) {
        if (CHECKS) {
            check(out_TU, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(ast_filename, true);
            long ast_filenameEncoded = stack.getPointerAddress();
            return nclang_createTranslationUnit2(CIdx, ast_filenameEncoded, memAddress(out_TU));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_defaultEditingTranslationUnitOptions ] ---

    /** {@code unsigned clang_defaultEditingTranslationUnitOptions(void)} */
    @NativeType("unsigned")
    public static int clang_defaultEditingTranslationUnitOptions() {
        long __functionAddress = Functions.defaultEditingTranslationUnitOptions;
        return invokeI(__functionAddress);
    }

    // --- [ clang_parseTranslationUnit ] ---

    /** {@code CXTranslationUnit clang_parseTranslationUnit(CXIndex CIdx, char const * source_filename, char const * const * command_line_args, int num_command_line_args, struct CXUnsavedFile * unsaved_files, unsigned num_unsaved_files, unsigned options)} */
    public static long nclang_parseTranslationUnit(long CIdx, long source_filename, long command_line_args, int num_command_line_args, long unsaved_files, int num_unsaved_files, int options) {
        long __functionAddress = Functions.parseTranslationUnit;
        if (CHECKS) {
            check(CIdx);
            if (unsaved_files != NULL) { Struct.validate(unsaved_files, num_unsaved_files, CXUnsavedFile.SIZEOF, CXUnsavedFile::validate); }
        }
        return invokePPPPP(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options, __functionAddress);
    }

    /** {@code CXTranslationUnit clang_parseTranslationUnit(CXIndex CIdx, char const * source_filename, char const * const * command_line_args, int num_command_line_args, struct CXUnsavedFile * unsaved_files, unsigned num_unsaved_files, unsigned options)} */
    @NativeType("CXTranslationUnit")
    public static long clang_parseTranslationUnit(@NativeType("CXIndex") long CIdx, @NativeType("char const *") @Nullable ByteBuffer source_filename, @NativeType("char const * const *") @Nullable PointerBuffer command_line_args, @NativeType("struct CXUnsavedFile *") CXUnsavedFile.@Nullable Buffer unsaved_files, @NativeType("unsigned") int options) {
        if (CHECKS) {
            checkNT1Safe(source_filename);
        }
        return nclang_parseTranslationUnit(CIdx, memAddressSafe(source_filename), memAddressSafe(command_line_args), remainingSafe(command_line_args), memAddressSafe(unsaved_files), remainingSafe(unsaved_files), options);
    }

    /** {@code CXTranslationUnit clang_parseTranslationUnit(CXIndex CIdx, char const * source_filename, char const * const * command_line_args, int num_command_line_args, struct CXUnsavedFile * unsaved_files, unsigned num_unsaved_files, unsigned options)} */
    @NativeType("CXTranslationUnit")
    public static long clang_parseTranslationUnit(@NativeType("CXIndex") long CIdx, @NativeType("char const *") @Nullable CharSequence source_filename, @NativeType("char const * const *") @Nullable PointerBuffer command_line_args, @NativeType("struct CXUnsavedFile *") CXUnsavedFile.@Nullable Buffer unsaved_files, @NativeType("unsigned") int options) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(source_filename, true);
            long source_filenameEncoded = source_filename == null ? NULL : stack.getPointerAddress();
            return nclang_parseTranslationUnit(CIdx, source_filenameEncoded, memAddressSafe(command_line_args), remainingSafe(command_line_args), memAddressSafe(unsaved_files), remainingSafe(unsaved_files), options);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_parseTranslationUnit2 ] ---

    /** {@code enum CXErrorCode clang_parseTranslationUnit2(CXIndex CIdx, char const * source_filename, char const * const * command_line_args, int num_command_line_args, struct CXUnsavedFile * unsaved_files, unsigned num_unsaved_files, unsigned options, CXTranslationUnit * out_TU)} */
    public static int nclang_parseTranslationUnit2(long CIdx, long source_filename, long command_line_args, int num_command_line_args, long unsaved_files, int num_unsaved_files, int options, long out_TU) {
        long __functionAddress = Functions.parseTranslationUnit2;
        if (CHECKS) {
            check(CIdx);
            if (unsaved_files != NULL) { Struct.validate(unsaved_files, num_unsaved_files, CXUnsavedFile.SIZEOF, CXUnsavedFile::validate); }
        }
        return invokePPPPPI(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options, out_TU, __functionAddress);
    }

    /** {@code enum CXErrorCode clang_parseTranslationUnit2(CXIndex CIdx, char const * source_filename, char const * const * command_line_args, int num_command_line_args, struct CXUnsavedFile * unsaved_files, unsigned num_unsaved_files, unsigned options, CXTranslationUnit * out_TU)} */
    @NativeType("enum CXErrorCode")
    public static int clang_parseTranslationUnit2(@NativeType("CXIndex") long CIdx, @NativeType("char const *") @Nullable ByteBuffer source_filename, @NativeType("char const * const *") @Nullable PointerBuffer command_line_args, @NativeType("struct CXUnsavedFile *") CXUnsavedFile.@Nullable Buffer unsaved_files, @NativeType("unsigned") int options, @NativeType("CXTranslationUnit *") PointerBuffer out_TU) {
        if (CHECKS) {
            checkNT1Safe(source_filename);
            check(out_TU, 1);
        }
        return nclang_parseTranslationUnit2(CIdx, memAddressSafe(source_filename), memAddressSafe(command_line_args), remainingSafe(command_line_args), memAddressSafe(unsaved_files), remainingSafe(unsaved_files), options, memAddress(out_TU));
    }

    /** {@code enum CXErrorCode clang_parseTranslationUnit2(CXIndex CIdx, char const * source_filename, char const * const * command_line_args, int num_command_line_args, struct CXUnsavedFile * unsaved_files, unsigned num_unsaved_files, unsigned options, CXTranslationUnit * out_TU)} */
    @NativeType("enum CXErrorCode")
    public static int clang_parseTranslationUnit2(@NativeType("CXIndex") long CIdx, @NativeType("char const *") @Nullable CharSequence source_filename, @NativeType("char const * const *") @Nullable PointerBuffer command_line_args, @NativeType("struct CXUnsavedFile *") CXUnsavedFile.@Nullable Buffer unsaved_files, @NativeType("unsigned") int options, @NativeType("CXTranslationUnit *") PointerBuffer out_TU) {
        if (CHECKS) {
            check(out_TU, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(source_filename, true);
            long source_filenameEncoded = source_filename == null ? NULL : stack.getPointerAddress();
            return nclang_parseTranslationUnit2(CIdx, source_filenameEncoded, memAddressSafe(command_line_args), remainingSafe(command_line_args), memAddressSafe(unsaved_files), remainingSafe(unsaved_files), options, memAddress(out_TU));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_parseTranslationUnit2FullArgv ] ---

    /** {@code enum CXErrorCode clang_parseTranslationUnit2FullArgv(CXIndex CIdx, char const * source_filename, char const * const * command_line_args, int num_command_line_args, struct CXUnsavedFile * unsaved_files, unsigned num_unsaved_files, unsigned options, CXTranslationUnit * out_TU)} */
    public static int nclang_parseTranslationUnit2FullArgv(long CIdx, long source_filename, long command_line_args, int num_command_line_args, long unsaved_files, int num_unsaved_files, int options, long out_TU) {
        long __functionAddress = Functions.parseTranslationUnit2FullArgv;
        if (CHECKS) {
            check(CIdx);
        }
        return invokePPPPPI(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options, out_TU, __functionAddress);
    }

    /** {@code enum CXErrorCode clang_parseTranslationUnit2FullArgv(CXIndex CIdx, char const * source_filename, char const * const * command_line_args, int num_command_line_args, struct CXUnsavedFile * unsaved_files, unsigned num_unsaved_files, unsigned options, CXTranslationUnit * out_TU)} */
    @NativeType("enum CXErrorCode")
    public static int clang_parseTranslationUnit2FullArgv(@NativeType("CXIndex") long CIdx, @NativeType("char const *") @Nullable ByteBuffer source_filename, @NativeType("char const * const *") PointerBuffer command_line_args, @NativeType("struct CXUnsavedFile *") CXUnsavedFile.@Nullable Buffer unsaved_files, @NativeType("unsigned") int options, @NativeType("CXTranslationUnit *") PointerBuffer out_TU) {
        if (CHECKS) {
            checkNT1Safe(source_filename);
            check(out_TU, 1);
        }
        return nclang_parseTranslationUnit2FullArgv(CIdx, memAddressSafe(source_filename), memAddress(command_line_args), command_line_args.remaining(), memAddressSafe(unsaved_files), remainingSafe(unsaved_files), options, memAddress(out_TU));
    }

    /** {@code enum CXErrorCode clang_parseTranslationUnit2FullArgv(CXIndex CIdx, char const * source_filename, char const * const * command_line_args, int num_command_line_args, struct CXUnsavedFile * unsaved_files, unsigned num_unsaved_files, unsigned options, CXTranslationUnit * out_TU)} */
    @NativeType("enum CXErrorCode")
    public static int clang_parseTranslationUnit2FullArgv(@NativeType("CXIndex") long CIdx, @NativeType("char const *") @Nullable CharSequence source_filename, @NativeType("char const * const *") PointerBuffer command_line_args, @NativeType("struct CXUnsavedFile *") CXUnsavedFile.@Nullable Buffer unsaved_files, @NativeType("unsigned") int options, @NativeType("CXTranslationUnit *") PointerBuffer out_TU) {
        if (CHECKS) {
            check(out_TU, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(source_filename, true);
            long source_filenameEncoded = source_filename == null ? NULL : stack.getPointerAddress();
            return nclang_parseTranslationUnit2FullArgv(CIdx, source_filenameEncoded, memAddress(command_line_args), command_line_args.remaining(), memAddressSafe(unsaved_files), remainingSafe(unsaved_files), options, memAddress(out_TU));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_defaultSaveOptions ] ---

    /** {@code unsigned clang_defaultSaveOptions(CXTranslationUnit TU)} */
    @NativeType("unsigned")
    public static int clang_defaultSaveOptions(@NativeType("CXTranslationUnit") long TU) {
        long __functionAddress = Functions.defaultSaveOptions;
        if (CHECKS) {
            check(TU);
        }
        return invokePI(TU, __functionAddress);
    }

    // --- [ clang_saveTranslationUnit ] ---

    /** {@code int clang_saveTranslationUnit(CXTranslationUnit TU, char const * FileName, unsigned options)} */
    public static int nclang_saveTranslationUnit(long TU, long FileName, int options) {
        long __functionAddress = Functions.saveTranslationUnit;
        if (CHECKS) {
            check(TU);
        }
        return invokePPI(TU, FileName, options, __functionAddress);
    }

    /** {@code int clang_saveTranslationUnit(CXTranslationUnit TU, char const * FileName, unsigned options)} */
    public static int clang_saveTranslationUnit(@NativeType("CXTranslationUnit") long TU, @NativeType("char const *") ByteBuffer FileName, @NativeType("unsigned") int options) {
        if (CHECKS) {
            checkNT1(FileName);
        }
        return nclang_saveTranslationUnit(TU, memAddress(FileName), options);
    }

    /** {@code int clang_saveTranslationUnit(CXTranslationUnit TU, char const * FileName, unsigned options)} */
    public static int clang_saveTranslationUnit(@NativeType("CXTranslationUnit") long TU, @NativeType("char const *") CharSequence FileName, @NativeType("unsigned") int options) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(FileName, true);
            long FileNameEncoded = stack.getPointerAddress();
            return nclang_saveTranslationUnit(TU, FileNameEncoded, options);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_suspendTranslationUnit ] ---

    /** {@code unsigned clang_suspendTranslationUnit(CXTranslationUnit TU)} */
    @NativeType("unsigned")
    public static boolean clang_suspendTranslationUnit(@NativeType("CXTranslationUnit") long TU) {
        long __functionAddress = Functions.suspendTranslationUnit;
        if (CHECKS) {
            check(TU);
        }
        return invokePI(TU, __functionAddress) != 0;
    }

    // --- [ clang_disposeTranslationUnit ] ---

    /** {@code void clang_disposeTranslationUnit(CXTranslationUnit TU)} */
    public static void clang_disposeTranslationUnit(@NativeType("CXTranslationUnit") long TU) {
        long __functionAddress = Functions.disposeTranslationUnit;
        if (CHECKS) {
            check(TU);
        }
        invokePV(TU, __functionAddress);
    }

    // --- [ clang_defaultReparseOptions ] ---

    /** {@code unsigned clang_defaultReparseOptions(CXTranslationUnit TU)} */
    @NativeType("unsigned")
    public static int clang_defaultReparseOptions(@NativeType("CXTranslationUnit") long TU) {
        long __functionAddress = Functions.defaultReparseOptions;
        if (CHECKS) {
            check(TU);
        }
        return invokePI(TU, __functionAddress);
    }

    // --- [ clang_reparseTranslationUnit ] ---

    /** {@code int clang_reparseTranslationUnit(CXTranslationUnit TU, unsigned num_unsaved_files, struct CXUnsavedFile * unsaved_files, unsigned options)} */
    public static int nclang_reparseTranslationUnit(long TU, int num_unsaved_files, long unsaved_files, int options) {
        long __functionAddress = Functions.reparseTranslationUnit;
        if (CHECKS) {
            check(TU);
            if (unsaved_files != NULL) { Struct.validate(unsaved_files, num_unsaved_files, CXUnsavedFile.SIZEOF, CXUnsavedFile::validate); }
        }
        return invokePPI(TU, num_unsaved_files, unsaved_files, options, __functionAddress);
    }

    /** {@code int clang_reparseTranslationUnit(CXTranslationUnit TU, unsigned num_unsaved_files, struct CXUnsavedFile * unsaved_files, unsigned options)} */
    public static int clang_reparseTranslationUnit(@NativeType("CXTranslationUnit") long TU, @NativeType("struct CXUnsavedFile *") CXUnsavedFile.@Nullable Buffer unsaved_files, @NativeType("unsigned") int options) {
        return nclang_reparseTranslationUnit(TU, remainingSafe(unsaved_files), memAddressSafe(unsaved_files), options);
    }

    // --- [ clang_getTUResourceUsageName ] ---

    /** {@code char const * clang_getTUResourceUsageName(enum CXTUResourceUsageKind kind)} */
    public static long nclang_getTUResourceUsageName(int kind) {
        long __functionAddress = Functions.getTUResourceUsageName;
        return invokeP(kind, __functionAddress);
    }

    /** {@code char const * clang_getTUResourceUsageName(enum CXTUResourceUsageKind kind)} */
    @NativeType("char const *")
    public static @Nullable String clang_getTUResourceUsageName(@NativeType("enum CXTUResourceUsageKind") int kind) {
        long __result = nclang_getTUResourceUsageName(kind);
        return memUTF8Safe(__result);
    }

    // --- [ clang_getCXTUResourceUsage ] ---

    /** {@code CXTUResourceUsage clang_getCXTUResourceUsage(CXTranslationUnit TU)} */
    public static native void nclang_getCXTUResourceUsage(long TU, long __functionAddress, long __result);

    /** {@code CXTUResourceUsage clang_getCXTUResourceUsage(CXTranslationUnit TU)} */
    public static void nclang_getCXTUResourceUsage(long TU, long __result) {
        long __functionAddress = Functions.getCXTUResourceUsage;
        if (CHECKS) {
            check(TU);
        }
        nclang_getCXTUResourceUsage(TU, __functionAddress, __result);
    }

    /** {@code CXTUResourceUsage clang_getCXTUResourceUsage(CXTranslationUnit TU)} */
    public static CXTUResourceUsage clang_getCXTUResourceUsage(@NativeType("CXTranslationUnit") long TU, CXTUResourceUsage __result) {
        nclang_getCXTUResourceUsage(TU, __result.address());
        return __result;
    }

    // --- [ clang_disposeCXTUResourceUsage ] ---

    /** {@code void clang_disposeCXTUResourceUsage(CXTUResourceUsage usage)} */
    public static native void nclang_disposeCXTUResourceUsage(long usage, long __functionAddress);

    /** {@code void clang_disposeCXTUResourceUsage(CXTUResourceUsage usage)} */
    public static void nclang_disposeCXTUResourceUsage(long usage) {
        long __functionAddress = Functions.disposeCXTUResourceUsage;
        nclang_disposeCXTUResourceUsage(usage, __functionAddress);
    }

    /** {@code void clang_disposeCXTUResourceUsage(CXTUResourceUsage usage)} */
    public static void clang_disposeCXTUResourceUsage(CXTUResourceUsage usage) {
        nclang_disposeCXTUResourceUsage(usage.address());
    }

    // --- [ clang_getTranslationUnitTargetInfo ] ---

    /** {@code CXTargetInfo clang_getTranslationUnitTargetInfo(CXTranslationUnit CTUnit)} */
    @NativeType("CXTargetInfo")
    public static long clang_getTranslationUnitTargetInfo(@NativeType("CXTranslationUnit") long CTUnit) {
        long __functionAddress = Functions.getTranslationUnitTargetInfo;
        if (CHECKS) {
            check(CTUnit);
        }
        return invokePP(CTUnit, __functionAddress);
    }

    // --- [ clang_TargetInfo_dispose ] ---

    /** {@code void clang_TargetInfo_dispose(CXTargetInfo Info)} */
    public static void clang_TargetInfo_dispose(@NativeType("CXTargetInfo") long Info) {
        long __functionAddress = Functions.TargetInfo_dispose;
        if (CHECKS) {
            check(Info);
        }
        invokePV(Info, __functionAddress);
    }

    // --- [ clang_TargetInfo_getTriple ] ---

    /** {@code CXString clang_TargetInfo_getTriple(CXTargetInfo Info)} */
    public static native void nclang_TargetInfo_getTriple(long Info, long __functionAddress, long __result);

    /** {@code CXString clang_TargetInfo_getTriple(CXTargetInfo Info)} */
    public static void nclang_TargetInfo_getTriple(long Info, long __result) {
        long __functionAddress = Functions.TargetInfo_getTriple;
        if (CHECKS) {
            check(Info);
        }
        nclang_TargetInfo_getTriple(Info, __functionAddress, __result);
    }

    /** {@code CXString clang_TargetInfo_getTriple(CXTargetInfo Info)} */
    public static CXString clang_TargetInfo_getTriple(@NativeType("CXTargetInfo") long Info, CXString __result) {
        nclang_TargetInfo_getTriple(Info, __result.address());
        return __result;
    }

    // --- [ clang_TargetInfo_getPointerWidth ] ---

    /** {@code int clang_TargetInfo_getPointerWidth(CXTargetInfo Info)} */
    public static int clang_TargetInfo_getPointerWidth(@NativeType("CXTargetInfo") long Info) {
        long __functionAddress = Functions.TargetInfo_getPointerWidth;
        if (CHECKS) {
            check(Info);
        }
        return invokePI(Info, __functionAddress);
    }

    // --- [ clang_getNullCursor ] ---

    /** {@code CXCursor clang_getNullCursor(void)} */
    public static native void nclang_getNullCursor(long __functionAddress, long __result);

    /** {@code CXCursor clang_getNullCursor(void)} */
    public static void nclang_getNullCursor(long __result) {
        long __functionAddress = Functions.getNullCursor;
        nclang_getNullCursor(__functionAddress, __result);
    }

    /** {@code CXCursor clang_getNullCursor(void)} */
    public static CXCursor clang_getNullCursor(CXCursor __result) {
        nclang_getNullCursor(__result.address());
        return __result;
    }

    // --- [ clang_getTranslationUnitCursor ] ---

    /** {@code CXCursor clang_getTranslationUnitCursor(CXTranslationUnit TU)} */
    public static native void nclang_getTranslationUnitCursor(long TU, long __functionAddress, long __result);

    /** {@code CXCursor clang_getTranslationUnitCursor(CXTranslationUnit TU)} */
    public static void nclang_getTranslationUnitCursor(long TU, long __result) {
        long __functionAddress = Functions.getTranslationUnitCursor;
        if (CHECKS) {
            check(TU);
        }
        nclang_getTranslationUnitCursor(TU, __functionAddress, __result);
    }

    /** {@code CXCursor clang_getTranslationUnitCursor(CXTranslationUnit TU)} */
    public static CXCursor clang_getTranslationUnitCursor(@NativeType("CXTranslationUnit") long TU, CXCursor __result) {
        nclang_getTranslationUnitCursor(TU, __result.address());
        return __result;
    }

    // --- [ clang_equalCursors ] ---

    /** {@code unsigned clang_equalCursors(CXCursor A, CXCursor B)} */
    public static native int nclang_equalCursors(long A, long B, long __functionAddress);

    /** {@code unsigned clang_equalCursors(CXCursor A, CXCursor B)} */
    public static int nclang_equalCursors(long A, long B) {
        long __functionAddress = Functions.equalCursors;
        return nclang_equalCursors(A, B, __functionAddress);
    }

    /** {@code unsigned clang_equalCursors(CXCursor A, CXCursor B)} */
    @NativeType("unsigned")
    public static boolean clang_equalCursors(CXCursor A, CXCursor B) {
        return nclang_equalCursors(A.address(), B.address()) != 0;
    }

    // --- [ clang_Cursor_isNull ] ---

    /** {@code int clang_Cursor_isNull(CXCursor cursor)} */
    public static native int nclang_Cursor_isNull(long cursor, long __functionAddress);

    /** {@code int clang_Cursor_isNull(CXCursor cursor)} */
    public static int nclang_Cursor_isNull(long cursor) {
        long __functionAddress = Functions.Cursor_isNull;
        return nclang_Cursor_isNull(cursor, __functionAddress);
    }

    /** {@code int clang_Cursor_isNull(CXCursor cursor)} */
    @NativeType("int")
    public static boolean clang_Cursor_isNull(CXCursor cursor) {
        return nclang_Cursor_isNull(cursor.address()) != 0;
    }

    // --- [ clang_hashCursor ] ---

    /** {@code unsigned clang_hashCursor(CXCursor cursor)} */
    public static native int nclang_hashCursor(long cursor, long __functionAddress);

    /** {@code unsigned clang_hashCursor(CXCursor cursor)} */
    public static int nclang_hashCursor(long cursor) {
        long __functionAddress = Functions.hashCursor;
        return nclang_hashCursor(cursor, __functionAddress);
    }

    /** {@code unsigned clang_hashCursor(CXCursor cursor)} */
    @NativeType("unsigned")
    public static int clang_hashCursor(CXCursor cursor) {
        return nclang_hashCursor(cursor.address());
    }

    // --- [ clang_getCursorKind ] ---

    /** {@code enum CXCursorKind clang_getCursorKind(CXCursor cursor)} */
    public static native int nclang_getCursorKind(long cursor, long __functionAddress);

    /** {@code enum CXCursorKind clang_getCursorKind(CXCursor cursor)} */
    public static int nclang_getCursorKind(long cursor) {
        long __functionAddress = Functions.getCursorKind;
        return nclang_getCursorKind(cursor, __functionAddress);
    }

    /** {@code enum CXCursorKind clang_getCursorKind(CXCursor cursor)} */
    @NativeType("enum CXCursorKind")
    public static int clang_getCursorKind(CXCursor cursor) {
        return nclang_getCursorKind(cursor.address());
    }

    // --- [ clang_isDeclaration ] ---

    /** {@code unsigned clang_isDeclaration(enum CXCursorKind kind)} */
    @NativeType("unsigned")
    public static boolean clang_isDeclaration(@NativeType("enum CXCursorKind") int kind) {
        long __functionAddress = Functions.isDeclaration;
        return invokeI(kind, __functionAddress) != 0;
    }

    // --- [ clang_isInvalidDeclaration ] ---

    /** {@code unsigned clang_isInvalidDeclaration(CXCursor cursor)} */
    public static native int nclang_isInvalidDeclaration(long cursor, long __functionAddress);

    /** {@code unsigned clang_isInvalidDeclaration(CXCursor cursor)} */
    public static int nclang_isInvalidDeclaration(long cursor) {
        long __functionAddress = Functions.isInvalidDeclaration;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_isInvalidDeclaration(cursor, __functionAddress);
    }

    /** {@code unsigned clang_isInvalidDeclaration(CXCursor cursor)} */
    @NativeType("unsigned")
    public static boolean clang_isInvalidDeclaration(CXCursor cursor) {
        return nclang_isInvalidDeclaration(cursor.address()) != 0;
    }

    // --- [ clang_isReference ] ---

    /** {@code unsigned clang_isReference(enum CXCursorKind kind)} */
    @NativeType("unsigned")
    public static boolean clang_isReference(@NativeType("enum CXCursorKind") int kind) {
        long __functionAddress = Functions.isReference;
        return invokeI(kind, __functionAddress) != 0;
    }

    // --- [ clang_isExpression ] ---

    /** {@code unsigned clang_isExpression(enum CXCursorKind kind)} */
    @NativeType("unsigned")
    public static boolean clang_isExpression(@NativeType("enum CXCursorKind") int kind) {
        long __functionAddress = Functions.isExpression;
        return invokeI(kind, __functionAddress) != 0;
    }

    // --- [ clang_isStatement ] ---

    /** {@code unsigned clang_isStatement(enum CXCursorKind kind)} */
    @NativeType("unsigned")
    public static boolean clang_isStatement(@NativeType("enum CXCursorKind") int kind) {
        long __functionAddress = Functions.isStatement;
        return invokeI(kind, __functionAddress) != 0;
    }

    // --- [ clang_isAttribute ] ---

    /** {@code unsigned clang_isAttribute(enum CXCursorKind kind)} */
    @NativeType("unsigned")
    public static boolean clang_isAttribute(@NativeType("enum CXCursorKind") int kind) {
        long __functionAddress = Functions.isAttribute;
        return invokeI(kind, __functionAddress) != 0;
    }

    // --- [ clang_Cursor_hasAttrs ] ---

    /** {@code unsigned clang_Cursor_hasAttrs(CXCursor C)} */
    public static native int nclang_Cursor_hasAttrs(long C, long __functionAddress);

    /** {@code unsigned clang_Cursor_hasAttrs(CXCursor C)} */
    public static int nclang_Cursor_hasAttrs(long C) {
        long __functionAddress = Functions.Cursor_hasAttrs;
        return nclang_Cursor_hasAttrs(C, __functionAddress);
    }

    /** {@code unsigned clang_Cursor_hasAttrs(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_Cursor_hasAttrs(CXCursor C) {
        return nclang_Cursor_hasAttrs(C.address()) != 0;
    }

    // --- [ clang_isInvalid ] ---

    /** {@code unsigned clang_isInvalid(enum CXCursorKind kind)} */
    @NativeType("unsigned")
    public static boolean clang_isInvalid(@NativeType("enum CXCursorKind") int kind) {
        long __functionAddress = Functions.isInvalid;
        return invokeI(kind, __functionAddress) != 0;
    }

    // --- [ clang_isTranslationUnit ] ---

    /** {@code unsigned clang_isTranslationUnit(enum CXCursorKind kind)} */
    @NativeType("unsigned")
    public static boolean clang_isTranslationUnit(@NativeType("enum CXCursorKind") int kind) {
        long __functionAddress = Functions.isTranslationUnit;
        return invokeI(kind, __functionAddress) != 0;
    }

    // --- [ clang_isPreprocessing ] ---

    /** {@code unsigned clang_isPreprocessing(enum CXCursorKind kind)} */
    @NativeType("unsigned")
    public static boolean clang_isPreprocessing(@NativeType("enum CXCursorKind") int kind) {
        long __functionAddress = Functions.isPreprocessing;
        return invokeI(kind, __functionAddress) != 0;
    }

    // --- [ clang_isUnexposed ] ---

    /** {@code unsigned clang_isUnexposed(enum CXCursorKind kind)} */
    @NativeType("unsigned")
    public static boolean clang_isUnexposed(@NativeType("enum CXCursorKind") int kind) {
        long __functionAddress = Functions.isUnexposed;
        return invokeI(kind, __functionAddress) != 0;
    }

    // --- [ clang_getCursorLinkage ] ---

    /** {@code enum CXLinkageKind clang_getCursorLinkage(CXCursor cursor)} */
    public static native int nclang_getCursorLinkage(long cursor, long __functionAddress);

    /** {@code enum CXLinkageKind clang_getCursorLinkage(CXCursor cursor)} */
    public static int nclang_getCursorLinkage(long cursor) {
        long __functionAddress = Functions.getCursorLinkage;
        return nclang_getCursorLinkage(cursor, __functionAddress);
    }

    /** {@code enum CXLinkageKind clang_getCursorLinkage(CXCursor cursor)} */
    @NativeType("enum CXLinkageKind")
    public static int clang_getCursorLinkage(CXCursor cursor) {
        return nclang_getCursorLinkage(cursor.address());
    }

    // --- [ clang_getCursorVisibility ] ---

    /** {@code enum CXVisibilityKind clang_getCursorVisibility(CXCursor cursor)} */
    public static native int nclang_getCursorVisibility(long cursor, long __functionAddress);

    /** {@code enum CXVisibilityKind clang_getCursorVisibility(CXCursor cursor)} */
    public static int nclang_getCursorVisibility(long cursor) {
        long __functionAddress = Functions.getCursorVisibility;
        return nclang_getCursorVisibility(cursor, __functionAddress);
    }

    /** {@code enum CXVisibilityKind clang_getCursorVisibility(CXCursor cursor)} */
    @NativeType("enum CXVisibilityKind")
    public static int clang_getCursorVisibility(CXCursor cursor) {
        return nclang_getCursorVisibility(cursor.address());
    }

    // --- [ clang_getCursorAvailability ] ---

    /** {@code enum CXAvailabilityKind clang_getCursorAvailability(CXCursor cursor)} */
    public static native int nclang_getCursorAvailability(long cursor, long __functionAddress);

    /** {@code enum CXAvailabilityKind clang_getCursorAvailability(CXCursor cursor)} */
    public static int nclang_getCursorAvailability(long cursor) {
        long __functionAddress = Functions.getCursorAvailability;
        return nclang_getCursorAvailability(cursor, __functionAddress);
    }

    /** {@code enum CXAvailabilityKind clang_getCursorAvailability(CXCursor cursor)} */
    @NativeType("enum CXAvailabilityKind")
    public static int clang_getCursorAvailability(CXCursor cursor) {
        return nclang_getCursorAvailability(cursor.address());
    }

    // --- [ clang_getCursorPlatformAvailability ] ---

    /** {@code int clang_getCursorPlatformAvailability(CXCursor cursor, int * always_deprecated, CXString * deprecated_message, int * always_unavailable, CXString * unavailable_message, CXPlatformAvailability * availability, int availability_size)} */
    public static native int nclang_getCursorPlatformAvailability(long cursor, long always_deprecated, long deprecated_message, long always_unavailable, long unavailable_message, long availability, int availability_size, long __functionAddress);

    /** {@code int clang_getCursorPlatformAvailability(CXCursor cursor, int * always_deprecated, CXString * deprecated_message, int * always_unavailable, CXString * unavailable_message, CXPlatformAvailability * availability, int availability_size)} */
    public static int nclang_getCursorPlatformAvailability(long cursor, long always_deprecated, long deprecated_message, long always_unavailable, long unavailable_message, long availability, int availability_size) {
        long __functionAddress = Functions.getCursorPlatformAvailability;
        return nclang_getCursorPlatformAvailability(cursor, always_deprecated, deprecated_message, always_unavailable, unavailable_message, availability, availability_size, __functionAddress);
    }

    /** {@code int clang_getCursorPlatformAvailability(CXCursor cursor, int * always_deprecated, CXString * deprecated_message, int * always_unavailable, CXString * unavailable_message, CXPlatformAvailability * availability, int availability_size)} */
    public static int clang_getCursorPlatformAvailability(CXCursor cursor, @NativeType("int *") @Nullable IntBuffer always_deprecated, @NativeType("CXString *") @Nullable CXString deprecated_message, @NativeType("int *") @Nullable IntBuffer always_unavailable, @NativeType("CXString *") @Nullable CXString unavailable_message, @NativeType("CXPlatformAvailability *") CXPlatformAvailability.@Nullable Buffer availability) {
        if (CHECKS) {
            checkSafe(always_deprecated, 1);
            checkSafe(always_unavailable, 1);
            checkSafe(availability, 1);
        }
        return nclang_getCursorPlatformAvailability(cursor.address(), memAddressSafe(always_deprecated), memAddressSafe(deprecated_message), memAddressSafe(always_unavailable), memAddressSafe(unavailable_message), memAddressSafe(availability), remainingSafe(availability));
    }

    // --- [ clang_disposeCXPlatformAvailability ] ---

    /** {@code void clang_disposeCXPlatformAvailability(CXPlatformAvailability * availability)} */
    public static void nclang_disposeCXPlatformAvailability(long availability) {
        long __functionAddress = Functions.disposeCXPlatformAvailability;
        invokePV(availability, __functionAddress);
    }

    /** {@code void clang_disposeCXPlatformAvailability(CXPlatformAvailability * availability)} */
    public static void clang_disposeCXPlatformAvailability(@NativeType("CXPlatformAvailability *") CXPlatformAvailability availability) {
        nclang_disposeCXPlatformAvailability(availability.address());
    }

    // --- [ clang_Cursor_getVarDeclInitializer ] ---

    /** {@code CXCursor clang_Cursor_getVarDeclInitializer(CXCursor cursor)} */
    public static native void nclang_Cursor_getVarDeclInitializer(long cursor, long __functionAddress, long __result);

    /** {@code CXCursor clang_Cursor_getVarDeclInitializer(CXCursor cursor)} */
    public static void nclang_Cursor_getVarDeclInitializer(long cursor, long __result) {
        long __functionAddress = Functions.Cursor_getVarDeclInitializer;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_Cursor_getVarDeclInitializer(cursor, __functionAddress, __result);
    }

    /** {@code CXCursor clang_Cursor_getVarDeclInitializer(CXCursor cursor)} */
    public static CXCursor clang_Cursor_getVarDeclInitializer(CXCursor cursor, CXCursor __result) {
        nclang_Cursor_getVarDeclInitializer(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_hasVarDeclGlobalStorage ] ---

    /** {@code int clang_Cursor_hasVarDeclGlobalStorage(CXCursor cursor)} */
    public static native int nclang_Cursor_hasVarDeclGlobalStorage(long cursor, long __functionAddress);

    /** {@code int clang_Cursor_hasVarDeclGlobalStorage(CXCursor cursor)} */
    public static int nclang_Cursor_hasVarDeclGlobalStorage(long cursor) {
        long __functionAddress = Functions.Cursor_hasVarDeclGlobalStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_Cursor_hasVarDeclGlobalStorage(cursor, __functionAddress);
    }

    /** {@code int clang_Cursor_hasVarDeclGlobalStorage(CXCursor cursor)} */
    public static int clang_Cursor_hasVarDeclGlobalStorage(CXCursor cursor) {
        return nclang_Cursor_hasVarDeclGlobalStorage(cursor.address());
    }

    // --- [ clang_Cursor_hasVarDeclExternalStorage ] ---

    /** {@code int clang_Cursor_hasVarDeclExternalStorage(CXCursor cursor)} */
    public static native int nclang_Cursor_hasVarDeclExternalStorage(long cursor, long __functionAddress);

    /** {@code int clang_Cursor_hasVarDeclExternalStorage(CXCursor cursor)} */
    public static int nclang_Cursor_hasVarDeclExternalStorage(long cursor) {
        long __functionAddress = Functions.Cursor_hasVarDeclExternalStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_Cursor_hasVarDeclExternalStorage(cursor, __functionAddress);
    }

    /** {@code int clang_Cursor_hasVarDeclExternalStorage(CXCursor cursor)} */
    public static int clang_Cursor_hasVarDeclExternalStorage(CXCursor cursor) {
        return nclang_Cursor_hasVarDeclExternalStorage(cursor.address());
    }

    // --- [ clang_getCursorLanguage ] ---

    /** {@code enum CXLanguageKind clang_getCursorLanguage(CXCursor cursor)} */
    public static native int nclang_getCursorLanguage(long cursor, long __functionAddress);

    /** {@code enum CXLanguageKind clang_getCursorLanguage(CXCursor cursor)} */
    public static int nclang_getCursorLanguage(long cursor) {
        long __functionAddress = Functions.getCursorLanguage;
        return nclang_getCursorLanguage(cursor, __functionAddress);
    }

    /** {@code enum CXLanguageKind clang_getCursorLanguage(CXCursor cursor)} */
    @NativeType("enum CXLanguageKind")
    public static int clang_getCursorLanguage(CXCursor cursor) {
        return nclang_getCursorLanguage(cursor.address());
    }

    // --- [ clang_getCursorTLSKind ] ---

    /** {@code enum CXTLSKind clang_getCursorTLSKind(CXCursor cursor)} */
    public static native int nclang_getCursorTLSKind(long cursor, long __functionAddress);

    /** {@code enum CXTLSKind clang_getCursorTLSKind(CXCursor cursor)} */
    public static int nclang_getCursorTLSKind(long cursor) {
        long __functionAddress = Functions.getCursorTLSKind;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_getCursorTLSKind(cursor, __functionAddress);
    }

    /** {@code enum CXTLSKind clang_getCursorTLSKind(CXCursor cursor)} */
    @NativeType("enum CXTLSKind")
    public static int clang_getCursorTLSKind(CXCursor cursor) {
        return nclang_getCursorTLSKind(cursor.address());
    }

    // --- [ clang_Cursor_getTranslationUnit ] ---

    /** {@code CXTranslationUnit clang_Cursor_getTranslationUnit(CXCursor cursor)} */
    public static native long nclang_Cursor_getTranslationUnit(long cursor, long __functionAddress);

    /** {@code CXTranslationUnit clang_Cursor_getTranslationUnit(CXCursor cursor)} */
    public static long nclang_Cursor_getTranslationUnit(long cursor) {
        long __functionAddress = Functions.Cursor_getTranslationUnit;
        return nclang_Cursor_getTranslationUnit(cursor, __functionAddress);
    }

    /** {@code CXTranslationUnit clang_Cursor_getTranslationUnit(CXCursor cursor)} */
    @NativeType("CXTranslationUnit")
    public static long clang_Cursor_getTranslationUnit(CXCursor cursor) {
        return nclang_Cursor_getTranslationUnit(cursor.address());
    }

    // --- [ clang_createCXCursorSet ] ---

    /** {@code CXCursorSet clang_createCXCursorSet(void)} */
    @NativeType("CXCursorSet")
    public static long clang_createCXCursorSet() {
        long __functionAddress = Functions.createCXCursorSet;
        return invokeP(__functionAddress);
    }

    // --- [ clang_disposeCXCursorSet ] ---

    /** {@code void clang_disposeCXCursorSet(CXCursorSet cset)} */
    public static void clang_disposeCXCursorSet(@NativeType("CXCursorSet") long cset) {
        long __functionAddress = Functions.disposeCXCursorSet;
        if (CHECKS) {
            check(cset);
        }
        invokePV(cset, __functionAddress);
    }

    // --- [ clang_CXCursorSet_contains ] ---

    /** {@code unsigned clang_CXCursorSet_contains(CXCursorSet cset, CXCursor cursor)} */
    public static native int nclang_CXCursorSet_contains(long cset, long cursor, long __functionAddress);

    /** {@code unsigned clang_CXCursorSet_contains(CXCursorSet cset, CXCursor cursor)} */
    public static int nclang_CXCursorSet_contains(long cset, long cursor) {
        long __functionAddress = Functions.CXCursorSet_contains;
        if (CHECKS) {
            check(cset);
        }
        return nclang_CXCursorSet_contains(cset, cursor, __functionAddress);
    }

    /** {@code unsigned clang_CXCursorSet_contains(CXCursorSet cset, CXCursor cursor)} */
    @NativeType("unsigned")
    public static boolean clang_CXCursorSet_contains(@NativeType("CXCursorSet") long cset, CXCursor cursor) {
        return nclang_CXCursorSet_contains(cset, cursor.address()) != 0;
    }

    // --- [ clang_CXCursorSet_insert ] ---

    /** {@code unsigned clang_CXCursorSet_insert(CXCursorSet cset, CXCursor cursor)} */
    public static native int nclang_CXCursorSet_insert(long cset, long cursor, long __functionAddress);

    /** {@code unsigned clang_CXCursorSet_insert(CXCursorSet cset, CXCursor cursor)} */
    public static int nclang_CXCursorSet_insert(long cset, long cursor) {
        long __functionAddress = Functions.CXCursorSet_insert;
        if (CHECKS) {
            check(cset);
        }
        return nclang_CXCursorSet_insert(cset, cursor, __functionAddress);
    }

    /** {@code unsigned clang_CXCursorSet_insert(CXCursorSet cset, CXCursor cursor)} */
    @NativeType("unsigned")
    public static boolean clang_CXCursorSet_insert(@NativeType("CXCursorSet") long cset, CXCursor cursor) {
        return nclang_CXCursorSet_insert(cset, cursor.address()) != 0;
    }

    // --- [ clang_getCursorSemanticParent ] ---

    /** {@code CXCursor clang_getCursorSemanticParent(CXCursor cursor)} */
    public static native void nclang_getCursorSemanticParent(long cursor, long __functionAddress, long __result);

    /** {@code CXCursor clang_getCursorSemanticParent(CXCursor cursor)} */
    public static void nclang_getCursorSemanticParent(long cursor, long __result) {
        long __functionAddress = Functions.getCursorSemanticParent;
        nclang_getCursorSemanticParent(cursor, __functionAddress, __result);
    }

    /** {@code CXCursor clang_getCursorSemanticParent(CXCursor cursor)} */
    public static CXCursor clang_getCursorSemanticParent(CXCursor cursor, CXCursor __result) {
        nclang_getCursorSemanticParent(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_getCursorLexicalParent ] ---

    /** {@code CXCursor clang_getCursorLexicalParent(CXCursor cursor)} */
    public static native void nclang_getCursorLexicalParent(long cursor, long __functionAddress, long __result);

    /** {@code CXCursor clang_getCursorLexicalParent(CXCursor cursor)} */
    public static void nclang_getCursorLexicalParent(long cursor, long __result) {
        long __functionAddress = Functions.getCursorLexicalParent;
        nclang_getCursorLexicalParent(cursor, __functionAddress, __result);
    }

    /** {@code CXCursor clang_getCursorLexicalParent(CXCursor cursor)} */
    public static CXCursor clang_getCursorLexicalParent(CXCursor cursor, CXCursor __result) {
        nclang_getCursorLexicalParent(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_getOverriddenCursors ] ---

    /** {@code void clang_getOverriddenCursors(CXCursor cursor, CXCursor ** overridden, unsigned * num_overridden)} */
    public static native void nclang_getOverriddenCursors(long cursor, long overridden, long num_overridden, long __functionAddress);

    /** {@code void clang_getOverriddenCursors(CXCursor cursor, CXCursor ** overridden, unsigned * num_overridden)} */
    public static void nclang_getOverriddenCursors(long cursor, long overridden, long num_overridden) {
        long __functionAddress = Functions.getOverriddenCursors;
        nclang_getOverriddenCursors(cursor, overridden, num_overridden, __functionAddress);
    }

    /** {@code void clang_getOverriddenCursors(CXCursor cursor, CXCursor ** overridden, unsigned * num_overridden)} */
    public static void clang_getOverriddenCursors(CXCursor cursor, @NativeType("CXCursor **") PointerBuffer overridden, @NativeType("unsigned *") IntBuffer num_overridden) {
        if (CHECKS) {
            check(overridden, 1);
            check(num_overridden, 1);
        }
        nclang_getOverriddenCursors(cursor.address(), memAddress(overridden), memAddress(num_overridden));
    }

    // --- [ clang_disposeOverriddenCursors ] ---

    /** {@code void clang_disposeOverriddenCursors(CXCursor * overridden)} */
    public static void nclang_disposeOverriddenCursors(long overridden) {
        long __functionAddress = Functions.disposeOverriddenCursors;
        invokePV(overridden, __functionAddress);
    }

    /** {@code void clang_disposeOverriddenCursors(CXCursor * overridden)} */
    public static void clang_disposeOverriddenCursors(@NativeType("CXCursor *") CXCursor.Buffer overridden) {
        nclang_disposeOverriddenCursors(overridden.address());
    }

    // --- [ clang_getIncludedFile ] ---

    /** {@code CXFile clang_getIncludedFile(CXCursor cursor)} */
    public static native long nclang_getIncludedFile(long cursor, long __functionAddress);

    /** {@code CXFile clang_getIncludedFile(CXCursor cursor)} */
    public static long nclang_getIncludedFile(long cursor) {
        long __functionAddress = Functions.getIncludedFile;
        return nclang_getIncludedFile(cursor, __functionAddress);
    }

    /** {@code CXFile clang_getIncludedFile(CXCursor cursor)} */
    @NativeType("CXFile")
    public static long clang_getIncludedFile(CXCursor cursor) {
        return nclang_getIncludedFile(cursor.address());
    }

    // --- [ clang_getCursor ] ---

    /** {@code CXCursor clang_getCursor(CXTranslationUnit TU, CXSourceLocation location)} */
    public static native void nclang_getCursor(long TU, long location, long __functionAddress, long __result);

    /** {@code CXCursor clang_getCursor(CXTranslationUnit TU, CXSourceLocation location)} */
    public static void nclang_getCursor(long TU, long location, long __result) {
        long __functionAddress = Functions.getCursor;
        if (CHECKS) {
            check(TU);
        }
        nclang_getCursor(TU, location, __functionAddress, __result);
    }

    /** {@code CXCursor clang_getCursor(CXTranslationUnit TU, CXSourceLocation location)} */
    public static CXCursor clang_getCursor(@NativeType("CXTranslationUnit") long TU, CXSourceLocation location, CXCursor __result) {
        nclang_getCursor(TU, location.address(), __result.address());
        return __result;
    }

    // --- [ clang_getCursorLocation ] ---

    /** {@code CXSourceLocation clang_getCursorLocation(CXCursor cursor)} */
    public static native void nclang_getCursorLocation(long cursor, long __functionAddress, long __result);

    /** {@code CXSourceLocation clang_getCursorLocation(CXCursor cursor)} */
    public static void nclang_getCursorLocation(long cursor, long __result) {
        long __functionAddress = Functions.getCursorLocation;
        nclang_getCursorLocation(cursor, __functionAddress, __result);
    }

    /** {@code CXSourceLocation clang_getCursorLocation(CXCursor cursor)} */
    public static CXSourceLocation clang_getCursorLocation(CXCursor cursor, CXSourceLocation __result) {
        nclang_getCursorLocation(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_getCursorExtent ] ---

    /** {@code CXSourceRange clang_getCursorExtent(CXCursor cursor)} */
    public static native void nclang_getCursorExtent(long cursor, long __functionAddress, long __result);

    /** {@code CXSourceRange clang_getCursorExtent(CXCursor cursor)} */
    public static void nclang_getCursorExtent(long cursor, long __result) {
        long __functionAddress = Functions.getCursorExtent;
        nclang_getCursorExtent(cursor, __functionAddress, __result);
    }

    /** {@code CXSourceRange clang_getCursorExtent(CXCursor cursor)} */
    public static CXSourceRange clang_getCursorExtent(CXCursor cursor, CXSourceRange __result) {
        nclang_getCursorExtent(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_getCursorType ] ---

    /** {@code CXType clang_getCursorType(CXCursor C)} */
    public static native void nclang_getCursorType(long C, long __functionAddress, long __result);

    /** {@code CXType clang_getCursorType(CXCursor C)} */
    public static void nclang_getCursorType(long C, long __result) {
        long __functionAddress = Functions.getCursorType;
        nclang_getCursorType(C, __functionAddress, __result);
    }

    /** {@code CXType clang_getCursorType(CXCursor C)} */
    public static CXType clang_getCursorType(CXCursor C, CXType __result) {
        nclang_getCursorType(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_getTypeSpelling ] ---

    /** {@code CXString clang_getTypeSpelling(CXType CT)} */
    public static native void nclang_getTypeSpelling(long CT, long __functionAddress, long __result);

    /** {@code CXString clang_getTypeSpelling(CXType CT)} */
    public static void nclang_getTypeSpelling(long CT, long __result) {
        long __functionAddress = Functions.getTypeSpelling;
        nclang_getTypeSpelling(CT, __functionAddress, __result);
    }

    /** {@code CXString clang_getTypeSpelling(CXType CT)} */
    public static CXString clang_getTypeSpelling(CXType CT, CXString __result) {
        nclang_getTypeSpelling(CT.address(), __result.address());
        return __result;
    }

    // --- [ clang_getTypedefDeclUnderlyingType ] ---

    /** {@code CXType clang_getTypedefDeclUnderlyingType(CXCursor C)} */
    public static native void nclang_getTypedefDeclUnderlyingType(long C, long __functionAddress, long __result);

    /** {@code CXType clang_getTypedefDeclUnderlyingType(CXCursor C)} */
    public static void nclang_getTypedefDeclUnderlyingType(long C, long __result) {
        long __functionAddress = Functions.getTypedefDeclUnderlyingType;
        nclang_getTypedefDeclUnderlyingType(C, __functionAddress, __result);
    }

    /** {@code CXType clang_getTypedefDeclUnderlyingType(CXCursor C)} */
    public static CXType clang_getTypedefDeclUnderlyingType(CXCursor C, CXType __result) {
        nclang_getTypedefDeclUnderlyingType(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_getEnumDeclIntegerType ] ---

    /** {@code CXType clang_getEnumDeclIntegerType(CXCursor C)} */
    public static native void nclang_getEnumDeclIntegerType(long C, long __functionAddress, long __result);

    /** {@code CXType clang_getEnumDeclIntegerType(CXCursor C)} */
    public static void nclang_getEnumDeclIntegerType(long C, long __result) {
        long __functionAddress = Functions.getEnumDeclIntegerType;
        nclang_getEnumDeclIntegerType(C, __functionAddress, __result);
    }

    /** {@code CXType clang_getEnumDeclIntegerType(CXCursor C)} */
    public static CXType clang_getEnumDeclIntegerType(CXCursor C, CXType __result) {
        nclang_getEnumDeclIntegerType(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_getEnumConstantDeclValue ] ---

    /** {@code long long clang_getEnumConstantDeclValue(CXCursor C)} */
    public static native long nclang_getEnumConstantDeclValue(long C, long __functionAddress);

    /** {@code long long clang_getEnumConstantDeclValue(CXCursor C)} */
    public static long nclang_getEnumConstantDeclValue(long C) {
        long __functionAddress = Functions.getEnumConstantDeclValue;
        return nclang_getEnumConstantDeclValue(C, __functionAddress);
    }

    /** {@code long long clang_getEnumConstantDeclValue(CXCursor C)} */
    @NativeType("long long")
    public static long clang_getEnumConstantDeclValue(CXCursor C) {
        return nclang_getEnumConstantDeclValue(C.address());
    }

    // --- [ clang_getEnumConstantDeclUnsignedValue ] ---

    /** {@code unsigned long long clang_getEnumConstantDeclUnsignedValue(CXCursor C)} */
    public static native long nclang_getEnumConstantDeclUnsignedValue(long C, long __functionAddress);

    /** {@code unsigned long long clang_getEnumConstantDeclUnsignedValue(CXCursor C)} */
    public static long nclang_getEnumConstantDeclUnsignedValue(long C) {
        long __functionAddress = Functions.getEnumConstantDeclUnsignedValue;
        return nclang_getEnumConstantDeclUnsignedValue(C, __functionAddress);
    }

    /** {@code unsigned long long clang_getEnumConstantDeclUnsignedValue(CXCursor C)} */
    @NativeType("unsigned long long")
    public static long clang_getEnumConstantDeclUnsignedValue(CXCursor C) {
        return nclang_getEnumConstantDeclUnsignedValue(C.address());
    }

    // --- [ clang_Cursor_isBitField ] ---

    /** {@code unsigned clang_Cursor_isBitField(CXCursor C)} */
    public static native int nclang_Cursor_isBitField(long C, long __functionAddress);

    /** {@code unsigned clang_Cursor_isBitField(CXCursor C)} */
    public static int nclang_Cursor_isBitField(long C) {
        long __functionAddress = Functions.Cursor_isBitField;
        return nclang_Cursor_isBitField(C, __functionAddress);
    }

    /** {@code unsigned clang_Cursor_isBitField(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_Cursor_isBitField(CXCursor C) {
        return nclang_Cursor_isBitField(C.address()) != 0;
    }

    // --- [ clang_getFieldDeclBitWidth ] ---

    /** {@code int clang_getFieldDeclBitWidth(CXCursor C)} */
    public static native int nclang_getFieldDeclBitWidth(long C, long __functionAddress);

    /** {@code int clang_getFieldDeclBitWidth(CXCursor C)} */
    public static int nclang_getFieldDeclBitWidth(long C) {
        long __functionAddress = Functions.getFieldDeclBitWidth;
        return nclang_getFieldDeclBitWidth(C, __functionAddress);
    }

    /** {@code int clang_getFieldDeclBitWidth(CXCursor C)} */
    public static int clang_getFieldDeclBitWidth(CXCursor C) {
        return nclang_getFieldDeclBitWidth(C.address());
    }

    // --- [ clang_Cursor_getNumArguments ] ---

    /** {@code int clang_Cursor_getNumArguments(CXCursor C)} */
    public static native int nclang_Cursor_getNumArguments(long C, long __functionAddress);

    /** {@code int clang_Cursor_getNumArguments(CXCursor C)} */
    public static int nclang_Cursor_getNumArguments(long C) {
        long __functionAddress = Functions.Cursor_getNumArguments;
        return nclang_Cursor_getNumArguments(C, __functionAddress);
    }

    /** {@code int clang_Cursor_getNumArguments(CXCursor C)} */
    public static int clang_Cursor_getNumArguments(CXCursor C) {
        return nclang_Cursor_getNumArguments(C.address());
    }

    // --- [ clang_Cursor_getArgument ] ---

    /** {@code CXCursor clang_Cursor_getArgument(CXCursor C, unsigned i)} */
    public static native void nclang_Cursor_getArgument(long C, int i, long __functionAddress, long __result);

    /** {@code CXCursor clang_Cursor_getArgument(CXCursor C, unsigned i)} */
    public static void nclang_Cursor_getArgument(long C, int i, long __result) {
        long __functionAddress = Functions.Cursor_getArgument;
        nclang_Cursor_getArgument(C, i, __functionAddress, __result);
    }

    /** {@code CXCursor clang_Cursor_getArgument(CXCursor C, unsigned i)} */
    public static CXCursor clang_Cursor_getArgument(CXCursor C, @NativeType("unsigned") int i, CXCursor __result) {
        nclang_Cursor_getArgument(C.address(), i, __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getNumTemplateArguments ] ---

    /** {@code int clang_Cursor_getNumTemplateArguments(CXCursor C)} */
    public static native int nclang_Cursor_getNumTemplateArguments(long C, long __functionAddress);

    /** {@code int clang_Cursor_getNumTemplateArguments(CXCursor C)} */
    public static int nclang_Cursor_getNumTemplateArguments(long C) {
        long __functionAddress = Functions.Cursor_getNumTemplateArguments;
        return nclang_Cursor_getNumTemplateArguments(C, __functionAddress);
    }

    /** {@code int clang_Cursor_getNumTemplateArguments(CXCursor C)} */
    public static int clang_Cursor_getNumTemplateArguments(CXCursor C) {
        return nclang_Cursor_getNumTemplateArguments(C.address());
    }

    // --- [ clang_Cursor_getTemplateArgumentKind ] ---

    /** {@code enum CXTemplateArgumentKind clang_Cursor_getTemplateArgumentKind(CXCursor C, unsigned I)} */
    public static native int nclang_Cursor_getTemplateArgumentKind(long C, int I, long __functionAddress);

    /** {@code enum CXTemplateArgumentKind clang_Cursor_getTemplateArgumentKind(CXCursor C, unsigned I)} */
    public static int nclang_Cursor_getTemplateArgumentKind(long C, int I) {
        long __functionAddress = Functions.Cursor_getTemplateArgumentKind;
        return nclang_Cursor_getTemplateArgumentKind(C, I, __functionAddress);
    }

    /** {@code enum CXTemplateArgumentKind clang_Cursor_getTemplateArgumentKind(CXCursor C, unsigned I)} */
    @NativeType("enum CXTemplateArgumentKind")
    public static int clang_Cursor_getTemplateArgumentKind(CXCursor C, @NativeType("unsigned") int I) {
        return nclang_Cursor_getTemplateArgumentKind(C.address(), I);
    }

    // --- [ clang_Cursor_getTemplateArgumentType ] ---

    /** {@code CXType clang_Cursor_getTemplateArgumentType(CXCursor C, unsigned I)} */
    public static native void nclang_Cursor_getTemplateArgumentType(long C, int I, long __functionAddress, long __result);

    /** {@code CXType clang_Cursor_getTemplateArgumentType(CXCursor C, unsigned I)} */
    public static void nclang_Cursor_getTemplateArgumentType(long C, int I, long __result) {
        long __functionAddress = Functions.Cursor_getTemplateArgumentType;
        nclang_Cursor_getTemplateArgumentType(C, I, __functionAddress, __result);
    }

    /** {@code CXType clang_Cursor_getTemplateArgumentType(CXCursor C, unsigned I)} */
    public static CXType clang_Cursor_getTemplateArgumentType(CXCursor C, @NativeType("unsigned") int I, CXType __result) {
        nclang_Cursor_getTemplateArgumentType(C.address(), I, __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getTemplateArgumentValue ] ---

    /** {@code long long clang_Cursor_getTemplateArgumentValue(CXCursor C, unsigned I)} */
    public static native long nclang_Cursor_getTemplateArgumentValue(long C, int I, long __functionAddress);

    /** {@code long long clang_Cursor_getTemplateArgumentValue(CXCursor C, unsigned I)} */
    public static long nclang_Cursor_getTemplateArgumentValue(long C, int I) {
        long __functionAddress = Functions.Cursor_getTemplateArgumentValue;
        return nclang_Cursor_getTemplateArgumentValue(C, I, __functionAddress);
    }

    /** {@code long long clang_Cursor_getTemplateArgumentValue(CXCursor C, unsigned I)} */
    @NativeType("long long")
    public static long clang_Cursor_getTemplateArgumentValue(CXCursor C, @NativeType("unsigned") int I) {
        return nclang_Cursor_getTemplateArgumentValue(C.address(), I);
    }

    // --- [ clang_Cursor_getTemplateArgumentUnsignedValue ] ---

    /** {@code unsigned long long clang_Cursor_getTemplateArgumentUnsignedValue(CXCursor C, unsigned I)} */
    public static native long nclang_Cursor_getTemplateArgumentUnsignedValue(long C, int I, long __functionAddress);

    /** {@code unsigned long long clang_Cursor_getTemplateArgumentUnsignedValue(CXCursor C, unsigned I)} */
    public static long nclang_Cursor_getTemplateArgumentUnsignedValue(long C, int I) {
        long __functionAddress = Functions.Cursor_getTemplateArgumentUnsignedValue;
        return nclang_Cursor_getTemplateArgumentUnsignedValue(C, I, __functionAddress);
    }

    /** {@code unsigned long long clang_Cursor_getTemplateArgumentUnsignedValue(CXCursor C, unsigned I)} */
    @NativeType("unsigned long long")
    public static long clang_Cursor_getTemplateArgumentUnsignedValue(CXCursor C, @NativeType("unsigned") int I) {
        return nclang_Cursor_getTemplateArgumentUnsignedValue(C.address(), I);
    }

    // --- [ clang_equalTypes ] ---

    /** {@code unsigned clang_equalTypes(CXType A, CXType B)} */
    public static native int nclang_equalTypes(long A, long B, long __functionAddress);

    /** {@code unsigned clang_equalTypes(CXType A, CXType B)} */
    public static int nclang_equalTypes(long A, long B) {
        long __functionAddress = Functions.equalTypes;
        return nclang_equalTypes(A, B, __functionAddress);
    }

    /** {@code unsigned clang_equalTypes(CXType A, CXType B)} */
    @NativeType("unsigned")
    public static boolean clang_equalTypes(CXType A, CXType B) {
        return nclang_equalTypes(A.address(), B.address()) != 0;
    }

    // --- [ clang_getCanonicalType ] ---

    /** {@code CXType clang_getCanonicalType(CXType T)} */
    public static native void nclang_getCanonicalType(long T, long __functionAddress, long __result);

    /** {@code CXType clang_getCanonicalType(CXType T)} */
    public static void nclang_getCanonicalType(long T, long __result) {
        long __functionAddress = Functions.getCanonicalType;
        nclang_getCanonicalType(T, __functionAddress, __result);
    }

    /** {@code CXType clang_getCanonicalType(CXType T)} */
    public static CXType clang_getCanonicalType(CXType T, CXType __result) {
        nclang_getCanonicalType(T.address(), __result.address());
        return __result;
    }

    // --- [ clang_isConstQualifiedType ] ---

    /** {@code unsigned clang_isConstQualifiedType(CXType T)} */
    public static native int nclang_isConstQualifiedType(long T, long __functionAddress);

    /** {@code unsigned clang_isConstQualifiedType(CXType T)} */
    public static int nclang_isConstQualifiedType(long T) {
        long __functionAddress = Functions.isConstQualifiedType;
        return nclang_isConstQualifiedType(T, __functionAddress);
    }

    /** {@code unsigned clang_isConstQualifiedType(CXType T)} */
    @NativeType("unsigned")
    public static boolean clang_isConstQualifiedType(CXType T) {
        return nclang_isConstQualifiedType(T.address()) != 0;
    }

    // --- [ clang_Cursor_isMacroFunctionLike ] ---

    /** {@code unsigned clang_Cursor_isMacroFunctionLike(CXCursor C)} */
    public static native int nclang_Cursor_isMacroFunctionLike(long C, long __functionAddress);

    /** {@code unsigned clang_Cursor_isMacroFunctionLike(CXCursor C)} */
    public static int nclang_Cursor_isMacroFunctionLike(long C) {
        long __functionAddress = Functions.Cursor_isMacroFunctionLike;
        return nclang_Cursor_isMacroFunctionLike(C, __functionAddress);
    }

    /** {@code unsigned clang_Cursor_isMacroFunctionLike(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_Cursor_isMacroFunctionLike(CXCursor C) {
        return nclang_Cursor_isMacroFunctionLike(C.address()) != 0;
    }

    // --- [ clang_Cursor_isMacroBuiltin ] ---

    /** {@code unsigned clang_Cursor_isMacroBuiltin(CXCursor C)} */
    public static native int nclang_Cursor_isMacroBuiltin(long C, long __functionAddress);

    /** {@code unsigned clang_Cursor_isMacroBuiltin(CXCursor C)} */
    public static int nclang_Cursor_isMacroBuiltin(long C) {
        long __functionAddress = Functions.Cursor_isMacroBuiltin;
        return nclang_Cursor_isMacroBuiltin(C, __functionAddress);
    }

    /** {@code unsigned clang_Cursor_isMacroBuiltin(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_Cursor_isMacroBuiltin(CXCursor C) {
        return nclang_Cursor_isMacroBuiltin(C.address()) != 0;
    }

    // --- [ clang_Cursor_isFunctionInlined ] ---

    /** {@code unsigned clang_Cursor_isFunctionInlined(CXCursor C)} */
    public static native int nclang_Cursor_isFunctionInlined(long C, long __functionAddress);

    /** {@code unsigned clang_Cursor_isFunctionInlined(CXCursor C)} */
    public static int nclang_Cursor_isFunctionInlined(long C) {
        long __functionAddress = Functions.Cursor_isFunctionInlined;
        return nclang_Cursor_isFunctionInlined(C, __functionAddress);
    }

    /** {@code unsigned clang_Cursor_isFunctionInlined(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_Cursor_isFunctionInlined(CXCursor C) {
        return nclang_Cursor_isFunctionInlined(C.address()) != 0;
    }

    // --- [ clang_isVolatileQualifiedType ] ---

    /** {@code unsigned clang_isVolatileQualifiedType(CXType T)} */
    public static native int nclang_isVolatileQualifiedType(long T, long __functionAddress);

    /** {@code unsigned clang_isVolatileQualifiedType(CXType T)} */
    public static int nclang_isVolatileQualifiedType(long T) {
        long __functionAddress = Functions.isVolatileQualifiedType;
        return nclang_isVolatileQualifiedType(T, __functionAddress);
    }

    /** {@code unsigned clang_isVolatileQualifiedType(CXType T)} */
    @NativeType("unsigned")
    public static boolean clang_isVolatileQualifiedType(CXType T) {
        return nclang_isVolatileQualifiedType(T.address()) != 0;
    }

    // --- [ clang_isRestrictQualifiedType ] ---

    /** {@code unsigned clang_isRestrictQualifiedType(CXType T)} */
    public static native int nclang_isRestrictQualifiedType(long T, long __functionAddress);

    /** {@code unsigned clang_isRestrictQualifiedType(CXType T)} */
    public static int nclang_isRestrictQualifiedType(long T) {
        long __functionAddress = Functions.isRestrictQualifiedType;
        return nclang_isRestrictQualifiedType(T, __functionAddress);
    }

    /** {@code unsigned clang_isRestrictQualifiedType(CXType T)} */
    @NativeType("unsigned")
    public static boolean clang_isRestrictQualifiedType(CXType T) {
        return nclang_isRestrictQualifiedType(T.address()) != 0;
    }

    // --- [ clang_getAddressSpace ] ---

    /** {@code unsigned clang_getAddressSpace(CXType T)} */
    public static native int nclang_getAddressSpace(long T, long __functionAddress);

    /** {@code unsigned clang_getAddressSpace(CXType T)} */
    public static int nclang_getAddressSpace(long T) {
        long __functionAddress = Functions.getAddressSpace;
        return nclang_getAddressSpace(T, __functionAddress);
    }

    /** {@code unsigned clang_getAddressSpace(CXType T)} */
    @NativeType("unsigned")
    public static int clang_getAddressSpace(CXType T) {
        return nclang_getAddressSpace(T.address());
    }

    // --- [ clang_getTypedefName ] ---

    /** {@code CXString clang_getTypedefName(CXType CT)} */
    public static native void nclang_getTypedefName(long CT, long __functionAddress, long __result);

    /** {@code CXString clang_getTypedefName(CXType CT)} */
    public static void nclang_getTypedefName(long CT, long __result) {
        long __functionAddress = Functions.getTypedefName;
        nclang_getTypedefName(CT, __functionAddress, __result);
    }

    /** {@code CXString clang_getTypedefName(CXType CT)} */
    public static CXString clang_getTypedefName(CXType CT, CXString __result) {
        nclang_getTypedefName(CT.address(), __result.address());
        return __result;
    }

    // --- [ clang_getPointeeType ] ---

    /** {@code CXType clang_getPointeeType(CXType T)} */
    public static native void nclang_getPointeeType(long T, long __functionAddress, long __result);

    /** {@code CXType clang_getPointeeType(CXType T)} */
    public static void nclang_getPointeeType(long T, long __result) {
        long __functionAddress = Functions.getPointeeType;
        nclang_getPointeeType(T, __functionAddress, __result);
    }

    /** {@code CXType clang_getPointeeType(CXType T)} */
    public static CXType clang_getPointeeType(CXType T, CXType __result) {
        nclang_getPointeeType(T.address(), __result.address());
        return __result;
    }

    // --- [ clang_getUnqualifiedType ] ---

    /** {@code CXType clang_getUnqualifiedType(CXType CT)} */
    public static native void nclang_getUnqualifiedType(long CT, long __functionAddress, long __result);

    /** {@code CXType clang_getUnqualifiedType(CXType CT)} */
    public static void nclang_getUnqualifiedType(long CT, long __result) {
        long __functionAddress = Functions.getUnqualifiedType;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_getUnqualifiedType(CT, __functionAddress, __result);
    }

    /** {@code CXType clang_getUnqualifiedType(CXType CT)} */
    public static CXType clang_getUnqualifiedType(CXType CT, CXType __result) {
        nclang_getUnqualifiedType(CT.address(), __result.address());
        return __result;
    }

    // --- [ clang_getNonReferenceType ] ---

    /** {@code CXType clang_getNonReferenceType(CXType CT)} */
    public static native void nclang_getNonReferenceType(long CT, long __functionAddress, long __result);

    /** {@code CXType clang_getNonReferenceType(CXType CT)} */
    public static void nclang_getNonReferenceType(long CT, long __result) {
        long __functionAddress = Functions.getNonReferenceType;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_getNonReferenceType(CT, __functionAddress, __result);
    }

    /** {@code CXType clang_getNonReferenceType(CXType CT)} */
    public static CXType clang_getNonReferenceType(CXType CT, CXType __result) {
        nclang_getNonReferenceType(CT.address(), __result.address());
        return __result;
    }

    // --- [ clang_getTypeDeclaration ] ---

    /** {@code CXCursor clang_getTypeDeclaration(CXType T)} */
    public static native void nclang_getTypeDeclaration(long T, long __functionAddress, long __result);

    /** {@code CXCursor clang_getTypeDeclaration(CXType T)} */
    public static void nclang_getTypeDeclaration(long T, long __result) {
        long __functionAddress = Functions.getTypeDeclaration;
        nclang_getTypeDeclaration(T, __functionAddress, __result);
    }

    /** {@code CXCursor clang_getTypeDeclaration(CXType T)} */
    public static CXCursor clang_getTypeDeclaration(CXType T, CXCursor __result) {
        nclang_getTypeDeclaration(T.address(), __result.address());
        return __result;
    }

    // --- [ clang_getDeclObjCTypeEncoding ] ---

    /** {@code CXString clang_getDeclObjCTypeEncoding(CXCursor C)} */
    public static native void nclang_getDeclObjCTypeEncoding(long C, long __functionAddress, long __result);

    /** {@code CXString clang_getDeclObjCTypeEncoding(CXCursor C)} */
    public static void nclang_getDeclObjCTypeEncoding(long C, long __result) {
        long __functionAddress = Functions.getDeclObjCTypeEncoding;
        nclang_getDeclObjCTypeEncoding(C, __functionAddress, __result);
    }

    /** {@code CXString clang_getDeclObjCTypeEncoding(CXCursor C)} */
    public static CXString clang_getDeclObjCTypeEncoding(CXCursor C, CXString __result) {
        nclang_getDeclObjCTypeEncoding(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_Type_getObjCEncoding ] ---

    /** {@code CXString clang_Type_getObjCEncoding(CXType type)} */
    public static native void nclang_Type_getObjCEncoding(long type, long __functionAddress, long __result);

    /** {@code CXString clang_Type_getObjCEncoding(CXType type)} */
    public static void nclang_Type_getObjCEncoding(long type, long __result) {
        long __functionAddress = Functions.Type_getObjCEncoding;
        nclang_Type_getObjCEncoding(type, __functionAddress, __result);
    }

    /** {@code CXString clang_Type_getObjCEncoding(CXType type)} */
    public static CXString clang_Type_getObjCEncoding(CXType type, CXString __result) {
        nclang_Type_getObjCEncoding(type.address(), __result.address());
        return __result;
    }

    // --- [ clang_getTypeKindSpelling ] ---

    /** {@code CXString clang_getTypeKindSpelling(enum CXTypeKind K)} */
    public static native void nclang_getTypeKindSpelling(int K, long __functionAddress, long __result);

    /** {@code CXString clang_getTypeKindSpelling(enum CXTypeKind K)} */
    public static void nclang_getTypeKindSpelling(int K, long __result) {
        long __functionAddress = Functions.getTypeKindSpelling;
        nclang_getTypeKindSpelling(K, __functionAddress, __result);
    }

    /** {@code CXString clang_getTypeKindSpelling(enum CXTypeKind K)} */
    public static CXString clang_getTypeKindSpelling(@NativeType("enum CXTypeKind") int K, CXString __result) {
        nclang_getTypeKindSpelling(K, __result.address());
        return __result;
    }

    // --- [ clang_getFunctionTypeCallingConv ] ---

    /** {@code enum CXCallingConv clang_getFunctionTypeCallingConv(CXType T)} */
    public static native int nclang_getFunctionTypeCallingConv(long T, long __functionAddress);

    /** {@code enum CXCallingConv clang_getFunctionTypeCallingConv(CXType T)} */
    public static int nclang_getFunctionTypeCallingConv(long T) {
        long __functionAddress = Functions.getFunctionTypeCallingConv;
        return nclang_getFunctionTypeCallingConv(T, __functionAddress);
    }

    /** {@code enum CXCallingConv clang_getFunctionTypeCallingConv(CXType T)} */
    @NativeType("enum CXCallingConv")
    public static int clang_getFunctionTypeCallingConv(CXType T) {
        return nclang_getFunctionTypeCallingConv(T.address());
    }

    // --- [ clang_getResultType ] ---

    /** {@code CXType clang_getResultType(CXType T)} */
    public static native void nclang_getResultType(long T, long __functionAddress, long __result);

    /** {@code CXType clang_getResultType(CXType T)} */
    public static void nclang_getResultType(long T, long __result) {
        long __functionAddress = Functions.getResultType;
        nclang_getResultType(T, __functionAddress, __result);
    }

    /** {@code CXType clang_getResultType(CXType T)} */
    public static CXType clang_getResultType(CXType T, CXType __result) {
        nclang_getResultType(T.address(), __result.address());
        return __result;
    }

    // --- [ clang_getExceptionSpecificationType ] ---

    /** {@code int clang_getExceptionSpecificationType(CXType T)} */
    public static native int nclang_getExceptionSpecificationType(long T, long __functionAddress);

    /** {@code int clang_getExceptionSpecificationType(CXType T)} */
    public static int nclang_getExceptionSpecificationType(long T) {
        long __functionAddress = Functions.getExceptionSpecificationType;
        return nclang_getExceptionSpecificationType(T, __functionAddress);
    }

    /** {@code int clang_getExceptionSpecificationType(CXType T)} */
    public static int clang_getExceptionSpecificationType(CXType T) {
        return nclang_getExceptionSpecificationType(T.address());
    }

    // --- [ clang_getNumArgTypes ] ---

    /** {@code int clang_getNumArgTypes(CXType T)} */
    public static native int nclang_getNumArgTypes(long T, long __functionAddress);

    /** {@code int clang_getNumArgTypes(CXType T)} */
    public static int nclang_getNumArgTypes(long T) {
        long __functionAddress = Functions.getNumArgTypes;
        return nclang_getNumArgTypes(T, __functionAddress);
    }

    /** {@code int clang_getNumArgTypes(CXType T)} */
    public static int clang_getNumArgTypes(CXType T) {
        return nclang_getNumArgTypes(T.address());
    }

    // --- [ clang_getArgType ] ---

    /** {@code CXType clang_getArgType(CXType T, unsigned i)} */
    public static native void nclang_getArgType(long T, int i, long __functionAddress, long __result);

    /** {@code CXType clang_getArgType(CXType T, unsigned i)} */
    public static void nclang_getArgType(long T, int i, long __result) {
        long __functionAddress = Functions.getArgType;
        nclang_getArgType(T, i, __functionAddress, __result);
    }

    /** {@code CXType clang_getArgType(CXType T, unsigned i)} */
    public static CXType clang_getArgType(CXType T, @NativeType("unsigned") int i, CXType __result) {
        nclang_getArgType(T.address(), i, __result.address());
        return __result;
    }

    // --- [ clang_Type_getObjCObjectBaseType ] ---

    /** {@code CXType clang_Type_getObjCObjectBaseType(CXType T)} */
    public static native void nclang_Type_getObjCObjectBaseType(long T, long __functionAddress, long __result);

    /** {@code CXType clang_Type_getObjCObjectBaseType(CXType T)} */
    public static void nclang_Type_getObjCObjectBaseType(long T, long __result) {
        long __functionAddress = Functions.Type_getObjCObjectBaseType;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_Type_getObjCObjectBaseType(T, __functionAddress, __result);
    }

    /** {@code CXType clang_Type_getObjCObjectBaseType(CXType T)} */
    public static CXType clang_Type_getObjCObjectBaseType(CXType T, CXType __result) {
        nclang_Type_getObjCObjectBaseType(T.address(), __result.address());
        return __result;
    }

    // --- [ clang_Type_getNumObjCProtocolRefs ] ---

    /** {@code unsigned clang_Type_getNumObjCProtocolRefs(CXType T)} */
    public static native int nclang_Type_getNumObjCProtocolRefs(long T, long __functionAddress);

    /** {@code unsigned clang_Type_getNumObjCProtocolRefs(CXType T)} */
    public static int nclang_Type_getNumObjCProtocolRefs(long T) {
        long __functionAddress = Functions.Type_getNumObjCProtocolRefs;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_Type_getNumObjCProtocolRefs(T, __functionAddress);
    }

    /** {@code unsigned clang_Type_getNumObjCProtocolRefs(CXType T)} */
    @NativeType("unsigned")
    public static int clang_Type_getNumObjCProtocolRefs(CXType T) {
        return nclang_Type_getNumObjCProtocolRefs(T.address());
    }

    // --- [ clang_Type_getObjCProtocolDecl ] ---

    /** {@code CXCursor clang_Type_getObjCProtocolDecl(CXType T, unsigned i)} */
    public static native void nclang_Type_getObjCProtocolDecl(long T, int i, long __functionAddress, long __result);

    /** {@code CXCursor clang_Type_getObjCProtocolDecl(CXType T, unsigned i)} */
    public static void nclang_Type_getObjCProtocolDecl(long T, int i, long __result) {
        long __functionAddress = Functions.Type_getObjCProtocolDecl;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_Type_getObjCProtocolDecl(T, i, __functionAddress, __result);
    }

    /** {@code CXCursor clang_Type_getObjCProtocolDecl(CXType T, unsigned i)} */
    public static CXCursor clang_Type_getObjCProtocolDecl(CXType T, @NativeType("unsigned") int i, CXCursor __result) {
        nclang_Type_getObjCProtocolDecl(T.address(), i, __result.address());
        return __result;
    }

    // --- [ clang_Type_getNumObjCTypeArgs ] ---

    /** {@code unsigned clang_Type_getNumObjCTypeArgs(CXType T)} */
    public static native int nclang_Type_getNumObjCTypeArgs(long T, long __functionAddress);

    /** {@code unsigned clang_Type_getNumObjCTypeArgs(CXType T)} */
    public static int nclang_Type_getNumObjCTypeArgs(long T) {
        long __functionAddress = Functions.Type_getNumObjCTypeArgs;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_Type_getNumObjCTypeArgs(T, __functionAddress);
    }

    /** {@code unsigned clang_Type_getNumObjCTypeArgs(CXType T)} */
    @NativeType("unsigned")
    public static int clang_Type_getNumObjCTypeArgs(CXType T) {
        return nclang_Type_getNumObjCTypeArgs(T.address());
    }

    // --- [ clang_Type_getObjCTypeArg ] ---

    /** {@code CXType clang_Type_getObjCTypeArg(CXType T, unsigned i)} */
    public static native void nclang_Type_getObjCTypeArg(long T, int i, long __functionAddress, long __result);

    /** {@code CXType clang_Type_getObjCTypeArg(CXType T, unsigned i)} */
    public static void nclang_Type_getObjCTypeArg(long T, int i, long __result) {
        long __functionAddress = Functions.Type_getObjCTypeArg;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_Type_getObjCTypeArg(T, i, __functionAddress, __result);
    }

    /** {@code CXType clang_Type_getObjCTypeArg(CXType T, unsigned i)} */
    public static CXType clang_Type_getObjCTypeArg(CXType T, @NativeType("unsigned") int i, CXType __result) {
        nclang_Type_getObjCTypeArg(T.address(), i, __result.address());
        return __result;
    }

    // --- [ clang_isFunctionTypeVariadic ] ---

    /** {@code unsigned clang_isFunctionTypeVariadic(CXType T)} */
    public static native int nclang_isFunctionTypeVariadic(long T, long __functionAddress);

    /** {@code unsigned clang_isFunctionTypeVariadic(CXType T)} */
    public static int nclang_isFunctionTypeVariadic(long T) {
        long __functionAddress = Functions.isFunctionTypeVariadic;
        return nclang_isFunctionTypeVariadic(T, __functionAddress);
    }

    /** {@code unsigned clang_isFunctionTypeVariadic(CXType T)} */
    @NativeType("unsigned")
    public static boolean clang_isFunctionTypeVariadic(CXType T) {
        return nclang_isFunctionTypeVariadic(T.address()) != 0;
    }

    // --- [ clang_getCursorResultType ] ---

    /** {@code CXType clang_getCursorResultType(CXCursor C)} */
    public static native void nclang_getCursorResultType(long C, long __functionAddress, long __result);

    /** {@code CXType clang_getCursorResultType(CXCursor C)} */
    public static void nclang_getCursorResultType(long C, long __result) {
        long __functionAddress = Functions.getCursorResultType;
        nclang_getCursorResultType(C, __functionAddress, __result);
    }

    /** {@code CXType clang_getCursorResultType(CXCursor C)} */
    public static CXType clang_getCursorResultType(CXCursor C, CXType __result) {
        nclang_getCursorResultType(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_getCursorExceptionSpecificationType ] ---

    /** {@code int clang_getCursorExceptionSpecificationType(CXCursor C)} */
    public static native int nclang_getCursorExceptionSpecificationType(long C, long __functionAddress);

    /** {@code int clang_getCursorExceptionSpecificationType(CXCursor C)} */
    public static int nclang_getCursorExceptionSpecificationType(long C) {
        long __functionAddress = Functions.getCursorExceptionSpecificationType;
        return nclang_getCursorExceptionSpecificationType(C, __functionAddress);
    }

    /** {@code int clang_getCursorExceptionSpecificationType(CXCursor C)} */
    public static int clang_getCursorExceptionSpecificationType(CXCursor C) {
        return nclang_getCursorExceptionSpecificationType(C.address());
    }

    // --- [ clang_isPODType ] ---

    /** {@code unsigned clang_isPODType(CXType T)} */
    public static native int nclang_isPODType(long T, long __functionAddress);

    /** {@code unsigned clang_isPODType(CXType T)} */
    public static int nclang_isPODType(long T) {
        long __functionAddress = Functions.isPODType;
        return nclang_isPODType(T, __functionAddress);
    }

    /** {@code unsigned clang_isPODType(CXType T)} */
    @NativeType("unsigned")
    public static boolean clang_isPODType(CXType T) {
        return nclang_isPODType(T.address()) != 0;
    }

    // --- [ clang_getElementType ] ---

    /** {@code CXType clang_getElementType(CXType T)} */
    public static native void nclang_getElementType(long T, long __functionAddress, long __result);

    /** {@code CXType clang_getElementType(CXType T)} */
    public static void nclang_getElementType(long T, long __result) {
        long __functionAddress = Functions.getElementType;
        nclang_getElementType(T, __functionAddress, __result);
    }

    /** {@code CXType clang_getElementType(CXType T)} */
    public static CXType clang_getElementType(CXType T, CXType __result) {
        nclang_getElementType(T.address(), __result.address());
        return __result;
    }

    // --- [ clang_getNumElements ] ---

    /** {@code long long clang_getNumElements(CXType T)} */
    public static native long nclang_getNumElements(long T, long __functionAddress);

    /** {@code long long clang_getNumElements(CXType T)} */
    public static long nclang_getNumElements(long T) {
        long __functionAddress = Functions.getNumElements;
        return nclang_getNumElements(T, __functionAddress);
    }

    /** {@code long long clang_getNumElements(CXType T)} */
    @NativeType("long long")
    public static long clang_getNumElements(CXType T) {
        return nclang_getNumElements(T.address());
    }

    // --- [ clang_getArrayElementType ] ---

    /** {@code CXType clang_getArrayElementType(CXType T)} */
    public static native void nclang_getArrayElementType(long T, long __functionAddress, long __result);

    /** {@code CXType clang_getArrayElementType(CXType T)} */
    public static void nclang_getArrayElementType(long T, long __result) {
        long __functionAddress = Functions.getArrayElementType;
        nclang_getArrayElementType(T, __functionAddress, __result);
    }

    /** {@code CXType clang_getArrayElementType(CXType T)} */
    public static CXType clang_getArrayElementType(CXType T, CXType __result) {
        nclang_getArrayElementType(T.address(), __result.address());
        return __result;
    }

    // --- [ clang_getArraySize ] ---

    /** {@code long long clang_getArraySize(CXType T)} */
    public static native long nclang_getArraySize(long T, long __functionAddress);

    /** {@code long long clang_getArraySize(CXType T)} */
    public static long nclang_getArraySize(long T) {
        long __functionAddress = Functions.getArraySize;
        return nclang_getArraySize(T, __functionAddress);
    }

    /** {@code long long clang_getArraySize(CXType T)} */
    @NativeType("long long")
    public static long clang_getArraySize(CXType T) {
        return nclang_getArraySize(T.address());
    }

    // --- [ clang_Type_getNamedType ] ---

    /** {@code CXType clang_Type_getNamedType(CXType T)} */
    public static native void nclang_Type_getNamedType(long T, long __functionAddress, long __result);

    /** {@code CXType clang_Type_getNamedType(CXType T)} */
    public static void nclang_Type_getNamedType(long T, long __result) {
        long __functionAddress = Functions.Type_getNamedType;
        nclang_Type_getNamedType(T, __functionAddress, __result);
    }

    /** {@code CXType clang_Type_getNamedType(CXType T)} */
    public static CXType clang_Type_getNamedType(CXType T, CXType __result) {
        nclang_Type_getNamedType(T.address(), __result.address());
        return __result;
    }

    // --- [ clang_Type_isTransparentTagTypedef ] ---

    /** {@code unsigned clang_Type_isTransparentTagTypedef(CXType T)} */
    public static native int nclang_Type_isTransparentTagTypedef(long T, long __functionAddress);

    /** {@code unsigned clang_Type_isTransparentTagTypedef(CXType T)} */
    public static int nclang_Type_isTransparentTagTypedef(long T) {
        long __functionAddress = Functions.Type_isTransparentTagTypedef;
        return nclang_Type_isTransparentTagTypedef(T, __functionAddress);
    }

    /** {@code unsigned clang_Type_isTransparentTagTypedef(CXType T)} */
    @NativeType("unsigned")
    public static boolean clang_Type_isTransparentTagTypedef(CXType T) {
        return nclang_Type_isTransparentTagTypedef(T.address()) != 0;
    }

    // --- [ clang_Type_getNullability ] ---

    /** {@code enum CXTypeNullabilityKind clang_Type_getNullability(CXType T)} */
    public static native int nclang_Type_getNullability(long T, long __functionAddress);

    /** {@code enum CXTypeNullabilityKind clang_Type_getNullability(CXType T)} */
    public static int nclang_Type_getNullability(long T) {
        long __functionAddress = Functions.Type_getNullability;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_Type_getNullability(T, __functionAddress);
    }

    /** {@code enum CXTypeNullabilityKind clang_Type_getNullability(CXType T)} */
    @NativeType("enum CXTypeNullabilityKind")
    public static int clang_Type_getNullability(CXType T) {
        return nclang_Type_getNullability(T.address());
    }

    // --- [ clang_Type_getAlignOf ] ---

    /** {@code long long clang_Type_getAlignOf(CXType T)} */
    public static native long nclang_Type_getAlignOf(long T, long __functionAddress);

    /** {@code long long clang_Type_getAlignOf(CXType T)} */
    public static long nclang_Type_getAlignOf(long T) {
        long __functionAddress = Functions.Type_getAlignOf;
        return nclang_Type_getAlignOf(T, __functionAddress);
    }

    /** {@code long long clang_Type_getAlignOf(CXType T)} */
    @NativeType("long long")
    public static long clang_Type_getAlignOf(CXType T) {
        return nclang_Type_getAlignOf(T.address());
    }

    // --- [ clang_Type_getClassType ] ---

    /** {@code CXType clang_Type_getClassType(CXType T)} */
    public static native void nclang_Type_getClassType(long T, long __functionAddress, long __result);

    /** {@code CXType clang_Type_getClassType(CXType T)} */
    public static void nclang_Type_getClassType(long T, long __result) {
        long __functionAddress = Functions.Type_getClassType;
        nclang_Type_getClassType(T, __functionAddress, __result);
    }

    /** {@code CXType clang_Type_getClassType(CXType T)} */
    public static CXType clang_Type_getClassType(CXType T, CXType __result) {
        nclang_Type_getClassType(T.address(), __result.address());
        return __result;
    }

    // --- [ clang_Type_getSizeOf ] ---

    /** {@code long long clang_Type_getSizeOf(CXType T)} */
    public static native long nclang_Type_getSizeOf(long T, long __functionAddress);

    /** {@code long long clang_Type_getSizeOf(CXType T)} */
    public static long nclang_Type_getSizeOf(long T) {
        long __functionAddress = Functions.Type_getSizeOf;
        return nclang_Type_getSizeOf(T, __functionAddress);
    }

    /** {@code long long clang_Type_getSizeOf(CXType T)} */
    @NativeType("long long")
    public static long clang_Type_getSizeOf(CXType T) {
        return nclang_Type_getSizeOf(T.address());
    }

    // --- [ clang_Type_getOffsetOf ] ---

    /** {@code long long clang_Type_getOffsetOf(CXType T, char const * S)} */
    public static native long nclang_Type_getOffsetOf(long T, long S, long __functionAddress);

    /** {@code long long clang_Type_getOffsetOf(CXType T, char const * S)} */
    public static long nclang_Type_getOffsetOf(long T, long S) {
        long __functionAddress = Functions.Type_getOffsetOf;
        return nclang_Type_getOffsetOf(T, S, __functionAddress);
    }

    /** {@code long long clang_Type_getOffsetOf(CXType T, char const * S)} */
    @NativeType("long long")
    public static long clang_Type_getOffsetOf(CXType T, @NativeType("char const *") ByteBuffer S) {
        if (CHECKS) {
            checkNT1(S);
        }
        return nclang_Type_getOffsetOf(T.address(), memAddress(S));
    }

    /** {@code long long clang_Type_getOffsetOf(CXType T, char const * S)} */
    @NativeType("long long")
    public static long clang_Type_getOffsetOf(CXType T, @NativeType("char const *") CharSequence S) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(S, true);
            long SEncoded = stack.getPointerAddress();
            return nclang_Type_getOffsetOf(T.address(), SEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_Type_getModifiedType ] ---

    /** {@code CXType clang_Type_getModifiedType(CXType T)} */
    public static native void nclang_Type_getModifiedType(long T, long __functionAddress, long __result);

    /** {@code CXType clang_Type_getModifiedType(CXType T)} */
    public static void nclang_Type_getModifiedType(long T, long __result) {
        long __functionAddress = Functions.Type_getModifiedType;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_Type_getModifiedType(T, __functionAddress, __result);
    }

    /** {@code CXType clang_Type_getModifiedType(CXType T)} */
    public static CXType clang_Type_getModifiedType(CXType T, CXType __result) {
        nclang_Type_getModifiedType(T.address(), __result.address());
        return __result;
    }

    // --- [ clang_Type_getValueType ] ---

    /** {@code CXType clang_Type_getValueType(CXType CT)} */
    public static native void nclang_Type_getValueType(long CT, long __functionAddress, long __result);

    /** {@code CXType clang_Type_getValueType(CXType CT)} */
    public static void nclang_Type_getValueType(long CT, long __result) {
        long __functionAddress = Functions.Type_getValueType;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_Type_getValueType(CT, __functionAddress, __result);
    }

    /** {@code CXType clang_Type_getValueType(CXType CT)} */
    public static CXType clang_Type_getValueType(CXType CT, CXType __result) {
        nclang_Type_getValueType(CT.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getOffsetOfField ] ---

    /** {@code long long clang_Cursor_getOffsetOfField(CXCursor C)} */
    public static native long nclang_Cursor_getOffsetOfField(long C, long __functionAddress);

    /** {@code long long clang_Cursor_getOffsetOfField(CXCursor C)} */
    public static long nclang_Cursor_getOffsetOfField(long C) {
        long __functionAddress = Functions.Cursor_getOffsetOfField;
        return nclang_Cursor_getOffsetOfField(C, __functionAddress);
    }

    /** {@code long long clang_Cursor_getOffsetOfField(CXCursor C)} */
    @NativeType("long long")
    public static long clang_Cursor_getOffsetOfField(CXCursor C) {
        return nclang_Cursor_getOffsetOfField(C.address());
    }

    // --- [ clang_Cursor_isAnonymous ] ---

    /** {@code unsigned clang_Cursor_isAnonymous(CXCursor C)} */
    public static native int nclang_Cursor_isAnonymous(long C, long __functionAddress);

    /** {@code unsigned clang_Cursor_isAnonymous(CXCursor C)} */
    public static int nclang_Cursor_isAnonymous(long C) {
        long __functionAddress = Functions.Cursor_isAnonymous;
        return nclang_Cursor_isAnonymous(C, __functionAddress);
    }

    /** {@code unsigned clang_Cursor_isAnonymous(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_Cursor_isAnonymous(CXCursor C) {
        return nclang_Cursor_isAnonymous(C.address()) != 0;
    }

    // --- [ clang_Cursor_isAnonymousRecordDecl ] ---

    /** {@code unsigned clang_Cursor_isAnonymousRecordDecl(CXCursor C)} */
    public static native int nclang_Cursor_isAnonymousRecordDecl(long C, long __functionAddress);

    /** {@code unsigned clang_Cursor_isAnonymousRecordDecl(CXCursor C)} */
    public static int nclang_Cursor_isAnonymousRecordDecl(long C) {
        long __functionAddress = Functions.Cursor_isAnonymousRecordDecl;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_Cursor_isAnonymousRecordDecl(C, __functionAddress);
    }

    /** {@code unsigned clang_Cursor_isAnonymousRecordDecl(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_Cursor_isAnonymousRecordDecl(CXCursor C) {
        return nclang_Cursor_isAnonymousRecordDecl(C.address()) != 0;
    }

    // --- [ clang_Cursor_isInlineNamespace ] ---

    /** {@code unsigned clang_Cursor_isInlineNamespace(CXCursor C)} */
    public static native int nclang_Cursor_isInlineNamespace(long C, long __functionAddress);

    /** {@code unsigned clang_Cursor_isInlineNamespace(CXCursor C)} */
    public static int nclang_Cursor_isInlineNamespace(long C) {
        long __functionAddress = Functions.Cursor_isInlineNamespace;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_Cursor_isInlineNamespace(C, __functionAddress);
    }

    /** {@code unsigned clang_Cursor_isInlineNamespace(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_Cursor_isInlineNamespace(CXCursor C) {
        return nclang_Cursor_isInlineNamespace(C.address()) != 0;
    }

    // --- [ clang_Type_getNumTemplateArguments ] ---

    /** {@code int clang_Type_getNumTemplateArguments(CXType T)} */
    public static native int nclang_Type_getNumTemplateArguments(long T, long __functionAddress);

    /** {@code int clang_Type_getNumTemplateArguments(CXType T)} */
    public static int nclang_Type_getNumTemplateArguments(long T) {
        long __functionAddress = Functions.Type_getNumTemplateArguments;
        return nclang_Type_getNumTemplateArguments(T, __functionAddress);
    }

    /** {@code int clang_Type_getNumTemplateArguments(CXType T)} */
    public static int clang_Type_getNumTemplateArguments(CXType T) {
        return nclang_Type_getNumTemplateArguments(T.address());
    }

    // --- [ clang_Type_getTemplateArgumentAsType ] ---

    /** {@code CXType clang_Type_getTemplateArgumentAsType(CXType T, unsigned i)} */
    public static native void nclang_Type_getTemplateArgumentAsType(long T, int i, long __functionAddress, long __result);

    /** {@code CXType clang_Type_getTemplateArgumentAsType(CXType T, unsigned i)} */
    public static void nclang_Type_getTemplateArgumentAsType(long T, int i, long __result) {
        long __functionAddress = Functions.Type_getTemplateArgumentAsType;
        nclang_Type_getTemplateArgumentAsType(T, i, __functionAddress, __result);
    }

    /** {@code CXType clang_Type_getTemplateArgumentAsType(CXType T, unsigned i)} */
    public static CXType clang_Type_getTemplateArgumentAsType(CXType T, @NativeType("unsigned") int i, CXType __result) {
        nclang_Type_getTemplateArgumentAsType(T.address(), i, __result.address());
        return __result;
    }

    // --- [ clang_Type_getCXXRefQualifier ] ---

    /** {@code enum CXRefQualifierKind clang_Type_getCXXRefQualifier(CXType T)} */
    public static native int nclang_Type_getCXXRefQualifier(long T, long __functionAddress);

    /** {@code enum CXRefQualifierKind clang_Type_getCXXRefQualifier(CXType T)} */
    public static int nclang_Type_getCXXRefQualifier(long T) {
        long __functionAddress = Functions.Type_getCXXRefQualifier;
        return nclang_Type_getCXXRefQualifier(T, __functionAddress);
    }

    /** {@code enum CXRefQualifierKind clang_Type_getCXXRefQualifier(CXType T)} */
    @NativeType("enum CXRefQualifierKind")
    public static int clang_Type_getCXXRefQualifier(CXType T) {
        return nclang_Type_getCXXRefQualifier(T.address());
    }

    // --- [ clang_isVirtualBase ] ---

    /** {@code unsigned clang_isVirtualBase(CXCursor cursor)} */
    public static native int nclang_isVirtualBase(long cursor, long __functionAddress);

    /** {@code unsigned clang_isVirtualBase(CXCursor cursor)} */
    public static int nclang_isVirtualBase(long cursor) {
        long __functionAddress = Functions.isVirtualBase;
        return nclang_isVirtualBase(cursor, __functionAddress);
    }

    /** {@code unsigned clang_isVirtualBase(CXCursor cursor)} */
    @NativeType("unsigned")
    public static boolean clang_isVirtualBase(CXCursor cursor) {
        return nclang_isVirtualBase(cursor.address()) != 0;
    }

    // --- [ clang_getOffsetOfBase ] ---

    /** {@code long long clang_getOffsetOfBase(CXCursor Parent, CXCursor Base)} */
    public static native long nclang_getOffsetOfBase(long Parent, long Base, long __functionAddress);

    /** {@code long long clang_getOffsetOfBase(CXCursor Parent, CXCursor Base)} */
    public static long nclang_getOffsetOfBase(long Parent, long Base) {
        long __functionAddress = Functions.getOffsetOfBase;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_getOffsetOfBase(Parent, Base, __functionAddress);
    }

    /** {@code long long clang_getOffsetOfBase(CXCursor Parent, CXCursor Base)} */
    @NativeType("long long")
    public static long clang_getOffsetOfBase(CXCursor Parent, CXCursor Base) {
        return nclang_getOffsetOfBase(Parent.address(), Base.address());
    }

    // --- [ clang_getCXXAccessSpecifier ] ---

    /** {@code enum CX_CXXAccessSpecifier clang_getCXXAccessSpecifier(CXCursor cursor)} */
    public static native int nclang_getCXXAccessSpecifier(long cursor, long __functionAddress);

    /** {@code enum CX_CXXAccessSpecifier clang_getCXXAccessSpecifier(CXCursor cursor)} */
    public static int nclang_getCXXAccessSpecifier(long cursor) {
        long __functionAddress = Functions.getCXXAccessSpecifier;
        return nclang_getCXXAccessSpecifier(cursor, __functionAddress);
    }

    /** {@code enum CX_CXXAccessSpecifier clang_getCXXAccessSpecifier(CXCursor cursor)} */
    @NativeType("enum CX_CXXAccessSpecifier")
    public static int clang_getCXXAccessSpecifier(CXCursor cursor) {
        return nclang_getCXXAccessSpecifier(cursor.address());
    }

    // --- [ clang_Cursor_getBinaryOpcode ] ---

    /** {@code enum CX_BinaryOperatorKind clang_Cursor_getBinaryOpcode(CXCursor cursor)} */
    public static native int nclang_Cursor_getBinaryOpcode(long cursor, long __functionAddress);

    /** {@code enum CX_BinaryOperatorKind clang_Cursor_getBinaryOpcode(CXCursor cursor)} */
    public static int nclang_Cursor_getBinaryOpcode(long cursor) {
        long __functionAddress = Functions.Cursor_getBinaryOpcode;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_Cursor_getBinaryOpcode(cursor, __functionAddress);
    }

    /** {@code enum CX_BinaryOperatorKind clang_Cursor_getBinaryOpcode(CXCursor cursor)} */
    @NativeType("enum CX_BinaryOperatorKind")
    public static int clang_Cursor_getBinaryOpcode(CXCursor cursor) {
        return nclang_Cursor_getBinaryOpcode(cursor.address());
    }

    // --- [ clang_Cursor_getBinaryOpcodeStr ] ---

    /** {@code CXString clang_Cursor_getBinaryOpcodeStr(enum CX_BinaryOperatorKind Op)} */
    public static native void nclang_Cursor_getBinaryOpcodeStr(int Op, long __functionAddress, long __result);

    /** {@code CXString clang_Cursor_getBinaryOpcodeStr(enum CX_BinaryOperatorKind Op)} */
    public static void nclang_Cursor_getBinaryOpcodeStr(int Op, long __result) {
        long __functionAddress = Functions.Cursor_getBinaryOpcodeStr;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_Cursor_getBinaryOpcodeStr(Op, __functionAddress, __result);
    }

    /** {@code CXString clang_Cursor_getBinaryOpcodeStr(enum CX_BinaryOperatorKind Op)} */
    public static CXString clang_Cursor_getBinaryOpcodeStr(@NativeType("enum CX_BinaryOperatorKind") int Op, CXString __result) {
        nclang_Cursor_getBinaryOpcodeStr(Op, __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getStorageClass ] ---

    /** {@code enum CX_StorageClass clang_Cursor_getStorageClass(CXCursor cursor)} */
    public static native int nclang_Cursor_getStorageClass(long cursor, long __functionAddress);

    /** {@code enum CX_StorageClass clang_Cursor_getStorageClass(CXCursor cursor)} */
    public static int nclang_Cursor_getStorageClass(long cursor) {
        long __functionAddress = Functions.Cursor_getStorageClass;
        return nclang_Cursor_getStorageClass(cursor, __functionAddress);
    }

    /** {@code enum CX_StorageClass clang_Cursor_getStorageClass(CXCursor cursor)} */
    @NativeType("enum CX_StorageClass")
    public static int clang_Cursor_getStorageClass(CXCursor cursor) {
        return nclang_Cursor_getStorageClass(cursor.address());
    }

    // --- [ clang_getNumOverloadedDecls ] ---

    /** {@code unsigned clang_getNumOverloadedDecls(CXCursor cursor)} */
    public static native int nclang_getNumOverloadedDecls(long cursor, long __functionAddress);

    /** {@code unsigned clang_getNumOverloadedDecls(CXCursor cursor)} */
    public static int nclang_getNumOverloadedDecls(long cursor) {
        long __functionAddress = Functions.getNumOverloadedDecls;
        return nclang_getNumOverloadedDecls(cursor, __functionAddress);
    }

    /** {@code unsigned clang_getNumOverloadedDecls(CXCursor cursor)} */
    @NativeType("unsigned")
    public static int clang_getNumOverloadedDecls(CXCursor cursor) {
        return nclang_getNumOverloadedDecls(cursor.address());
    }

    // --- [ clang_getOverloadedDecl ] ---

    /** {@code CXCursor clang_getOverloadedDecl(CXCursor cursor, unsigned index)} */
    public static native void nclang_getOverloadedDecl(long cursor, int index, long __functionAddress, long __result);

    /** {@code CXCursor clang_getOverloadedDecl(CXCursor cursor, unsigned index)} */
    public static void nclang_getOverloadedDecl(long cursor, int index, long __result) {
        long __functionAddress = Functions.getOverloadedDecl;
        nclang_getOverloadedDecl(cursor, index, __functionAddress, __result);
    }

    /** {@code CXCursor clang_getOverloadedDecl(CXCursor cursor, unsigned index)} */
    public static CXCursor clang_getOverloadedDecl(CXCursor cursor, @NativeType("unsigned") int index, CXCursor __result) {
        nclang_getOverloadedDecl(cursor.address(), index, __result.address());
        return __result;
    }

    // --- [ clang_getIBOutletCollectionType ] ---

    /** {@code CXType clang_getIBOutletCollectionType(CXCursor cursor)} */
    public static native void nclang_getIBOutletCollectionType(long cursor, long __functionAddress, long __result);

    /** {@code CXType clang_getIBOutletCollectionType(CXCursor cursor)} */
    public static void nclang_getIBOutletCollectionType(long cursor, long __result) {
        long __functionAddress = Functions.getIBOutletCollectionType;
        nclang_getIBOutletCollectionType(cursor, __functionAddress, __result);
    }

    /** {@code CXType clang_getIBOutletCollectionType(CXCursor cursor)} */
    public static CXType clang_getIBOutletCollectionType(CXCursor cursor, CXType __result) {
        nclang_getIBOutletCollectionType(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_visitChildren ] ---

    /** {@code unsigned clang_visitChildren(CXCursor parent, enum CXChildVisitResult (*) (CXCursor, CXCursor, CXClientData) visitor, CXClientData client_data)} */
    public static native int nclang_visitChildren(long parent, long visitor, long client_data, long __functionAddress);

    /** {@code unsigned clang_visitChildren(CXCursor parent, enum CXChildVisitResult (*) (CXCursor, CXCursor, CXClientData) visitor, CXClientData client_data)} */
    public static int nclang_visitChildren(long parent, long visitor, long client_data) {
        long __functionAddress = Functions.visitChildren;
        return nclang_visitChildren(parent, visitor, client_data, __functionAddress);
    }

    /** {@code unsigned clang_visitChildren(CXCursor parent, enum CXChildVisitResult (*) (CXCursor, CXCursor, CXClientData) visitor, CXClientData client_data)} */
    @NativeType("unsigned")
    public static boolean clang_visitChildren(CXCursor parent, @NativeType("enum CXChildVisitResult (*) (CXCursor, CXCursor, CXClientData)") CXCursorVisitorI visitor, @NativeType("CXClientData") long client_data) {
        return nclang_visitChildren(parent.address(), visitor.address(), client_data) != 0;
    }

    // --- [ clang_getCursorUSR ] ---

    /** {@code CXString clang_getCursorUSR(CXCursor cursor)} */
    public static native void nclang_getCursorUSR(long cursor, long __functionAddress, long __result);

    /** {@code CXString clang_getCursorUSR(CXCursor cursor)} */
    public static void nclang_getCursorUSR(long cursor, long __result) {
        long __functionAddress = Functions.getCursorUSR;
        nclang_getCursorUSR(cursor, __functionAddress, __result);
    }

    /** {@code CXString clang_getCursorUSR(CXCursor cursor)} */
    public static CXString clang_getCursorUSR(CXCursor cursor, CXString __result) {
        nclang_getCursorUSR(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_constructUSR_ObjCClass ] ---

    /** {@code CXString clang_constructUSR_ObjCClass(char const * class_name)} */
    public static native void nclang_constructUSR_ObjCClass(long class_name, long __functionAddress, long __result);

    /** {@code CXString clang_constructUSR_ObjCClass(char const * class_name)} */
    public static void nclang_constructUSR_ObjCClass(long class_name, long __result) {
        long __functionAddress = Functions.constructUSR_ObjCClass;
        nclang_constructUSR_ObjCClass(class_name, __functionAddress, __result);
    }

    /** {@code CXString clang_constructUSR_ObjCClass(char const * class_name)} */
    public static CXString clang_constructUSR_ObjCClass(@NativeType("char const *") ByteBuffer class_name, CXString __result) {
        if (CHECKS) {
            checkNT1(class_name);
        }
        nclang_constructUSR_ObjCClass(memAddress(class_name), __result.address());
        return __result;
    }

    /** {@code CXString clang_constructUSR_ObjCClass(char const * class_name)} */
    public static CXString clang_constructUSR_ObjCClass(@NativeType("char const *") CharSequence class_name, CXString __result) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(class_name, true);
            long class_nameEncoded = stack.getPointerAddress();
            nclang_constructUSR_ObjCClass(class_nameEncoded, __result.address());
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_constructUSR_ObjCCategory ] ---

    /** {@code CXString clang_constructUSR_ObjCCategory(char const * class_name, char const * category_name)} */
    public static native void nclang_constructUSR_ObjCCategory(long class_name, long category_name, long __functionAddress, long __result);

    /** {@code CXString clang_constructUSR_ObjCCategory(char const * class_name, char const * category_name)} */
    public static void nclang_constructUSR_ObjCCategory(long class_name, long category_name, long __result) {
        long __functionAddress = Functions.constructUSR_ObjCCategory;
        nclang_constructUSR_ObjCCategory(class_name, category_name, __functionAddress, __result);
    }

    /** {@code CXString clang_constructUSR_ObjCCategory(char const * class_name, char const * category_name)} */
    public static CXString clang_constructUSR_ObjCCategory(@NativeType("char const *") ByteBuffer class_name, @NativeType("char const *") ByteBuffer category_name, CXString __result) {
        if (CHECKS) {
            checkNT1(class_name);
            checkNT1(category_name);
        }
        nclang_constructUSR_ObjCCategory(memAddress(class_name), memAddress(category_name), __result.address());
        return __result;
    }

    /** {@code CXString clang_constructUSR_ObjCCategory(char const * class_name, char const * category_name)} */
    public static CXString clang_constructUSR_ObjCCategory(@NativeType("char const *") CharSequence class_name, @NativeType("char const *") CharSequence category_name, CXString __result) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(class_name, true);
            long class_nameEncoded = stack.getPointerAddress();
            stack.nUTF8(category_name, true);
            long category_nameEncoded = stack.getPointerAddress();
            nclang_constructUSR_ObjCCategory(class_nameEncoded, category_nameEncoded, __result.address());
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_constructUSR_ObjCProtocol ] ---

    /** {@code CXString clang_constructUSR_ObjCProtocol(char const * protocol_name)} */
    public static native void nclang_constructUSR_ObjCProtocol(long protocol_name, long __functionAddress, long __result);

    /** {@code CXString clang_constructUSR_ObjCProtocol(char const * protocol_name)} */
    public static void nclang_constructUSR_ObjCProtocol(long protocol_name, long __result) {
        long __functionAddress = Functions.constructUSR_ObjCProtocol;
        nclang_constructUSR_ObjCProtocol(protocol_name, __functionAddress, __result);
    }

    /** {@code CXString clang_constructUSR_ObjCProtocol(char const * protocol_name)} */
    public static CXString clang_constructUSR_ObjCProtocol(@NativeType("char const *") ByteBuffer protocol_name, CXString __result) {
        if (CHECKS) {
            checkNT1(protocol_name);
        }
        nclang_constructUSR_ObjCProtocol(memAddress(protocol_name), __result.address());
        return __result;
    }

    /** {@code CXString clang_constructUSR_ObjCProtocol(char const * protocol_name)} */
    public static CXString clang_constructUSR_ObjCProtocol(@NativeType("char const *") CharSequence protocol_name, CXString __result) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(protocol_name, true);
            long protocol_nameEncoded = stack.getPointerAddress();
            nclang_constructUSR_ObjCProtocol(protocol_nameEncoded, __result.address());
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_constructUSR_ObjCIvar ] ---

    /** {@code CXString clang_constructUSR_ObjCIvar(char const * name, CXString classUSR)} */
    public static native void nclang_constructUSR_ObjCIvar(long name, long classUSR, long __functionAddress, long __result);

    /** {@code CXString clang_constructUSR_ObjCIvar(char const * name, CXString classUSR)} */
    public static void nclang_constructUSR_ObjCIvar(long name, long classUSR, long __result) {
        long __functionAddress = Functions.constructUSR_ObjCIvar;
        nclang_constructUSR_ObjCIvar(name, classUSR, __functionAddress, __result);
    }

    /** {@code CXString clang_constructUSR_ObjCIvar(char const * name, CXString classUSR)} */
    public static CXString clang_constructUSR_ObjCIvar(@NativeType("char const *") ByteBuffer name, CXString classUSR, CXString __result) {
        if (CHECKS) {
            checkNT1(name);
        }
        nclang_constructUSR_ObjCIvar(memAddress(name), classUSR.address(), __result.address());
        return __result;
    }

    /** {@code CXString clang_constructUSR_ObjCIvar(char const * name, CXString classUSR)} */
    public static CXString clang_constructUSR_ObjCIvar(@NativeType("char const *") CharSequence name, CXString classUSR, CXString __result) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nclang_constructUSR_ObjCIvar(nameEncoded, classUSR.address(), __result.address());
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_constructUSR_ObjCMethod ] ---

    /** {@code CXString clang_constructUSR_ObjCMethod(char const * name, unsigned isInstanceMethod, CXString classUSR)} */
    public static native void nclang_constructUSR_ObjCMethod(long name, int isInstanceMethod, long classUSR, long __functionAddress, long __result);

    /** {@code CXString clang_constructUSR_ObjCMethod(char const * name, unsigned isInstanceMethod, CXString classUSR)} */
    public static void nclang_constructUSR_ObjCMethod(long name, int isInstanceMethod, long classUSR, long __result) {
        long __functionAddress = Functions.constructUSR_ObjCMethod;
        nclang_constructUSR_ObjCMethod(name, isInstanceMethod, classUSR, __functionAddress, __result);
    }

    /** {@code CXString clang_constructUSR_ObjCMethod(char const * name, unsigned isInstanceMethod, CXString classUSR)} */
    public static CXString clang_constructUSR_ObjCMethod(@NativeType("char const *") ByteBuffer name, @NativeType("unsigned") boolean isInstanceMethod, CXString classUSR, CXString __result) {
        if (CHECKS) {
            checkNT1(name);
        }
        nclang_constructUSR_ObjCMethod(memAddress(name), isInstanceMethod ? 1 : 0, classUSR.address(), __result.address());
        return __result;
    }

    /** {@code CXString clang_constructUSR_ObjCMethod(char const * name, unsigned isInstanceMethod, CXString classUSR)} */
    public static CXString clang_constructUSR_ObjCMethod(@NativeType("char const *") CharSequence name, @NativeType("unsigned") boolean isInstanceMethod, CXString classUSR, CXString __result) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nclang_constructUSR_ObjCMethod(nameEncoded, isInstanceMethod ? 1 : 0, classUSR.address(), __result.address());
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_constructUSR_ObjCProperty ] ---

    /** {@code CXString clang_constructUSR_ObjCProperty(char const * property, CXString classUSR)} */
    public static native void nclang_constructUSR_ObjCProperty(long property, long classUSR, long __functionAddress, long __result);

    /** {@code CXString clang_constructUSR_ObjCProperty(char const * property, CXString classUSR)} */
    public static void nclang_constructUSR_ObjCProperty(long property, long classUSR, long __result) {
        long __functionAddress = Functions.constructUSR_ObjCProperty;
        nclang_constructUSR_ObjCProperty(property, classUSR, __functionAddress, __result);
    }

    /** {@code CXString clang_constructUSR_ObjCProperty(char const * property, CXString classUSR)} */
    public static CXString clang_constructUSR_ObjCProperty(@NativeType("char const *") ByteBuffer property, CXString classUSR, CXString __result) {
        if (CHECKS) {
            checkNT1(property);
        }
        nclang_constructUSR_ObjCProperty(memAddress(property), classUSR.address(), __result.address());
        return __result;
    }

    /** {@code CXString clang_constructUSR_ObjCProperty(char const * property, CXString classUSR)} */
    public static CXString clang_constructUSR_ObjCProperty(@NativeType("char const *") CharSequence property, CXString classUSR, CXString __result) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(property, true);
            long propertyEncoded = stack.getPointerAddress();
            nclang_constructUSR_ObjCProperty(propertyEncoded, classUSR.address(), __result.address());
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_getCursorSpelling ] ---

    /** {@code CXString clang_getCursorSpelling(CXCursor cursor)} */
    public static native void nclang_getCursorSpelling(long cursor, long __functionAddress, long __result);

    /** {@code CXString clang_getCursorSpelling(CXCursor cursor)} */
    public static void nclang_getCursorSpelling(long cursor, long __result) {
        long __functionAddress = Functions.getCursorSpelling;
        nclang_getCursorSpelling(cursor, __functionAddress, __result);
    }

    /** {@code CXString clang_getCursorSpelling(CXCursor cursor)} */
    public static CXString clang_getCursorSpelling(CXCursor cursor, CXString __result) {
        nclang_getCursorSpelling(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getSpellingNameRange ] ---

    /** {@code CXSourceRange clang_Cursor_getSpellingNameRange(CXCursor cursor, unsigned pieceIndex, unsigned options)} */
    public static native void nclang_Cursor_getSpellingNameRange(long cursor, int pieceIndex, int options, long __functionAddress, long __result);

    /** {@code CXSourceRange clang_Cursor_getSpellingNameRange(CXCursor cursor, unsigned pieceIndex, unsigned options)} */
    public static void nclang_Cursor_getSpellingNameRange(long cursor, int pieceIndex, int options, long __result) {
        long __functionAddress = Functions.Cursor_getSpellingNameRange;
        nclang_Cursor_getSpellingNameRange(cursor, pieceIndex, options, __functionAddress, __result);
    }

    /** {@code CXSourceRange clang_Cursor_getSpellingNameRange(CXCursor cursor, unsigned pieceIndex, unsigned options)} */
    public static CXSourceRange clang_Cursor_getSpellingNameRange(CXCursor cursor, @NativeType("unsigned") int pieceIndex, @NativeType("unsigned") int options, CXSourceRange __result) {
        nclang_Cursor_getSpellingNameRange(cursor.address(), pieceIndex, options, __result.address());
        return __result;
    }

    // --- [ clang_PrintingPolicy_getProperty ] ---

    /** {@code unsigned clang_PrintingPolicy_getProperty(CXPrintingPolicy Policy, enum CXPrintingPolicyProperty Property)} */
    @NativeType("unsigned")
    public static int clang_PrintingPolicy_getProperty(@NativeType("CXPrintingPolicy") long Policy, @NativeType("enum CXPrintingPolicyProperty") int Property) {
        long __functionAddress = Functions.PrintingPolicy_getProperty;
        if (CHECKS) {
            check(__functionAddress);
            check(Policy);
        }
        return invokePI(Policy, Property, __functionAddress);
    }

    // --- [ clang_PrintingPolicy_setProperty ] ---

    /** {@code void clang_PrintingPolicy_setProperty(CXPrintingPolicy Policy, enum CXPrintingPolicyProperty Property, unsigned Value)} */
    public static void clang_PrintingPolicy_setProperty(@NativeType("CXPrintingPolicy") long Policy, @NativeType("enum CXPrintingPolicyProperty") int Property, @NativeType("unsigned") int Value) {
        long __functionAddress = Functions.PrintingPolicy_setProperty;
        if (CHECKS) {
            check(__functionAddress);
            check(Policy);
        }
        invokePV(Policy, Property, Value, __functionAddress);
    }

    // --- [ clang_getCursorPrintingPolicy ] ---

    /** {@code CXPrintingPolicy clang_getCursorPrintingPolicy(CXCursor cursor)} */
    public static native long nclang_getCursorPrintingPolicy(long cursor, long __functionAddress);

    /** {@code CXPrintingPolicy clang_getCursorPrintingPolicy(CXCursor cursor)} */
    public static long nclang_getCursorPrintingPolicy(long cursor) {
        long __functionAddress = Functions.getCursorPrintingPolicy;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_getCursorPrintingPolicy(cursor, __functionAddress);
    }

    /** {@code CXPrintingPolicy clang_getCursorPrintingPolicy(CXCursor cursor)} */
    @NativeType("CXPrintingPolicy")
    public static long clang_getCursorPrintingPolicy(CXCursor cursor) {
        return nclang_getCursorPrintingPolicy(cursor.address());
    }

    // --- [ clang_PrintingPolicy_dispose ] ---

    /** {@code void clang_PrintingPolicy_dispose(CXPrintingPolicy Policy)} */
    public static void clang_PrintingPolicy_dispose(@NativeType("CXPrintingPolicy") long Policy) {
        long __functionAddress = Functions.PrintingPolicy_dispose;
        if (CHECKS) {
            check(__functionAddress);
            check(Policy);
        }
        invokePV(Policy, __functionAddress);
    }

    // --- [ clang_getCursorPrettyPrinted ] ---

    /** {@code CXString clang_getCursorPrettyPrinted(CXCursor Cursor, CXPrintingPolicy Policy)} */
    public static native void nclang_getCursorPrettyPrinted(long Cursor, long Policy, long __functionAddress, long __result);

    /** {@code CXString clang_getCursorPrettyPrinted(CXCursor Cursor, CXPrintingPolicy Policy)} */
    public static void nclang_getCursorPrettyPrinted(long Cursor, long Policy, long __result) {
        long __functionAddress = Functions.getCursorPrettyPrinted;
        if (CHECKS) {
            check(__functionAddress);
            check(Policy);
        }
        nclang_getCursorPrettyPrinted(Cursor, Policy, __functionAddress, __result);
    }

    /** {@code CXString clang_getCursorPrettyPrinted(CXCursor Cursor, CXPrintingPolicy Policy)} */
    public static CXString clang_getCursorPrettyPrinted(CXCursor Cursor, @NativeType("CXPrintingPolicy") long Policy, CXString __result) {
        nclang_getCursorPrettyPrinted(Cursor.address(), Policy, __result.address());
        return __result;
    }

    // --- [ clang_getTypePrettyPrinted ] ---

    /** {@code CXString clang_getTypePrettyPrinted(CXType CT, CXPrintingPolicy cxPolicy)} */
    public static native void nclang_getTypePrettyPrinted(long CT, long cxPolicy, long __functionAddress, long __result);

    /** {@code CXString clang_getTypePrettyPrinted(CXType CT, CXPrintingPolicy cxPolicy)} */
    public static void nclang_getTypePrettyPrinted(long CT, long cxPolicy, long __result) {
        long __functionAddress = Functions.getTypePrettyPrinted;
        if (CHECKS) {
            check(__functionAddress);
            check(cxPolicy);
        }
        nclang_getTypePrettyPrinted(CT, cxPolicy, __functionAddress, __result);
    }

    /** {@code CXString clang_getTypePrettyPrinted(CXType CT, CXPrintingPolicy cxPolicy)} */
    public static CXString clang_getTypePrettyPrinted(CXType CT, @NativeType("CXPrintingPolicy") long cxPolicy, CXString __result) {
        nclang_getTypePrettyPrinted(CT.address(), cxPolicy, __result.address());
        return __result;
    }

    // --- [ clang_getCursorDisplayName ] ---

    /** {@code CXString clang_getCursorDisplayName(CXCursor cursor)} */
    public static native void nclang_getCursorDisplayName(long cursor, long __functionAddress, long __result);

    /** {@code CXString clang_getCursorDisplayName(CXCursor cursor)} */
    public static void nclang_getCursorDisplayName(long cursor, long __result) {
        long __functionAddress = Functions.getCursorDisplayName;
        nclang_getCursorDisplayName(cursor, __functionAddress, __result);
    }

    /** {@code CXString clang_getCursorDisplayName(CXCursor cursor)} */
    public static CXString clang_getCursorDisplayName(CXCursor cursor, CXString __result) {
        nclang_getCursorDisplayName(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_getCursorReferenced ] ---

    /** {@code CXCursor clang_getCursorReferenced(CXCursor cursor)} */
    public static native void nclang_getCursorReferenced(long cursor, long __functionAddress, long __result);

    /** {@code CXCursor clang_getCursorReferenced(CXCursor cursor)} */
    public static void nclang_getCursorReferenced(long cursor, long __result) {
        long __functionAddress = Functions.getCursorReferenced;
        nclang_getCursorReferenced(cursor, __functionAddress, __result);
    }

    /** {@code CXCursor clang_getCursorReferenced(CXCursor cursor)} */
    public static CXCursor clang_getCursorReferenced(CXCursor cursor, CXCursor __result) {
        nclang_getCursorReferenced(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_getCursorDefinition ] ---

    /** {@code CXCursor clang_getCursorDefinition(CXCursor cursor)} */
    public static native void nclang_getCursorDefinition(long cursor, long __functionAddress, long __result);

    /** {@code CXCursor clang_getCursorDefinition(CXCursor cursor)} */
    public static void nclang_getCursorDefinition(long cursor, long __result) {
        long __functionAddress = Functions.getCursorDefinition;
        nclang_getCursorDefinition(cursor, __functionAddress, __result);
    }

    /** {@code CXCursor clang_getCursorDefinition(CXCursor cursor)} */
    public static CXCursor clang_getCursorDefinition(CXCursor cursor, CXCursor __result) {
        nclang_getCursorDefinition(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_isCursorDefinition ] ---

    /** {@code unsigned clang_isCursorDefinition(CXCursor cursor)} */
    public static native int nclang_isCursorDefinition(long cursor, long __functionAddress);

    /** {@code unsigned clang_isCursorDefinition(CXCursor cursor)} */
    public static int nclang_isCursorDefinition(long cursor) {
        long __functionAddress = Functions.isCursorDefinition;
        return nclang_isCursorDefinition(cursor, __functionAddress);
    }

    /** {@code unsigned clang_isCursorDefinition(CXCursor cursor)} */
    @NativeType("unsigned")
    public static boolean clang_isCursorDefinition(CXCursor cursor) {
        return nclang_isCursorDefinition(cursor.address()) != 0;
    }

    // --- [ clang_getCanonicalCursor ] ---

    /** {@code CXCursor clang_getCanonicalCursor(CXCursor cursor)} */
    public static native void nclang_getCanonicalCursor(long cursor, long __functionAddress, long __result);

    /** {@code CXCursor clang_getCanonicalCursor(CXCursor cursor)} */
    public static void nclang_getCanonicalCursor(long cursor, long __result) {
        long __functionAddress = Functions.getCanonicalCursor;
        nclang_getCanonicalCursor(cursor, __functionAddress, __result);
    }

    /** {@code CXCursor clang_getCanonicalCursor(CXCursor cursor)} */
    public static CXCursor clang_getCanonicalCursor(CXCursor cursor, CXCursor __result) {
        nclang_getCanonicalCursor(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getObjCSelectorIndex ] ---

    /** {@code int clang_Cursor_getObjCSelectorIndex(CXCursor cursor)} */
    public static native int nclang_Cursor_getObjCSelectorIndex(long cursor, long __functionAddress);

    /** {@code int clang_Cursor_getObjCSelectorIndex(CXCursor cursor)} */
    public static int nclang_Cursor_getObjCSelectorIndex(long cursor) {
        long __functionAddress = Functions.Cursor_getObjCSelectorIndex;
        return nclang_Cursor_getObjCSelectorIndex(cursor, __functionAddress);
    }

    /** {@code int clang_Cursor_getObjCSelectorIndex(CXCursor cursor)} */
    public static int clang_Cursor_getObjCSelectorIndex(CXCursor cursor) {
        return nclang_Cursor_getObjCSelectorIndex(cursor.address());
    }

    // --- [ clang_Cursor_isDynamicCall ] ---

    /** {@code int clang_Cursor_isDynamicCall(CXCursor C)} */
    public static native int nclang_Cursor_isDynamicCall(long C, long __functionAddress);

    /** {@code int clang_Cursor_isDynamicCall(CXCursor C)} */
    public static int nclang_Cursor_isDynamicCall(long C) {
        long __functionAddress = Functions.Cursor_isDynamicCall;
        return nclang_Cursor_isDynamicCall(C, __functionAddress);
    }

    /** {@code int clang_Cursor_isDynamicCall(CXCursor C)} */
    @NativeType("int")
    public static boolean clang_Cursor_isDynamicCall(CXCursor C) {
        return nclang_Cursor_isDynamicCall(C.address()) != 0;
    }

    // --- [ clang_Cursor_getReceiverType ] ---

    /** {@code CXType clang_Cursor_getReceiverType(CXCursor C)} */
    public static native void nclang_Cursor_getReceiverType(long C, long __functionAddress, long __result);

    /** {@code CXType clang_Cursor_getReceiverType(CXCursor C)} */
    public static void nclang_Cursor_getReceiverType(long C, long __result) {
        long __functionAddress = Functions.Cursor_getReceiverType;
        nclang_Cursor_getReceiverType(C, __functionAddress, __result);
    }

    /** {@code CXType clang_Cursor_getReceiverType(CXCursor C)} */
    public static CXType clang_Cursor_getReceiverType(CXCursor C, CXType __result) {
        nclang_Cursor_getReceiverType(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getObjCPropertyAttributes ] ---

    /** {@code unsigned clang_Cursor_getObjCPropertyAttributes(CXCursor C, unsigned reserved)} */
    public static native int nclang_Cursor_getObjCPropertyAttributes(long C, int reserved, long __functionAddress);

    /** {@code unsigned clang_Cursor_getObjCPropertyAttributes(CXCursor C, unsigned reserved)} */
    public static int nclang_Cursor_getObjCPropertyAttributes(long C, int reserved) {
        long __functionAddress = Functions.Cursor_getObjCPropertyAttributes;
        return nclang_Cursor_getObjCPropertyAttributes(C, reserved, __functionAddress);
    }

    /** {@code unsigned clang_Cursor_getObjCPropertyAttributes(CXCursor C, unsigned reserved)} */
    @NativeType("unsigned")
    public static int clang_Cursor_getObjCPropertyAttributes(CXCursor C, @NativeType("unsigned") int reserved) {
        return nclang_Cursor_getObjCPropertyAttributes(C.address(), reserved);
    }

    // --- [ clang_Cursor_getObjCPropertyGetterName ] ---

    /** {@code CXString clang_Cursor_getObjCPropertyGetterName(CXCursor C)} */
    public static native void nclang_Cursor_getObjCPropertyGetterName(long C, long __functionAddress, long __result);

    /** {@code CXString clang_Cursor_getObjCPropertyGetterName(CXCursor C)} */
    public static void nclang_Cursor_getObjCPropertyGetterName(long C, long __result) {
        long __functionAddress = Functions.Cursor_getObjCPropertyGetterName;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_Cursor_getObjCPropertyGetterName(C, __functionAddress, __result);
    }

    /** {@code CXString clang_Cursor_getObjCPropertyGetterName(CXCursor C)} */
    public static CXString clang_Cursor_getObjCPropertyGetterName(CXCursor C, CXString __result) {
        nclang_Cursor_getObjCPropertyGetterName(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getObjCPropertySetterName ] ---

    /** {@code CXString clang_Cursor_getObjCPropertySetterName(CXCursor C)} */
    public static native void nclang_Cursor_getObjCPropertySetterName(long C, long __functionAddress, long __result);

    /** {@code CXString clang_Cursor_getObjCPropertySetterName(CXCursor C)} */
    public static void nclang_Cursor_getObjCPropertySetterName(long C, long __result) {
        long __functionAddress = Functions.Cursor_getObjCPropertySetterName;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_Cursor_getObjCPropertySetterName(C, __functionAddress, __result);
    }

    /** {@code CXString clang_Cursor_getObjCPropertySetterName(CXCursor C)} */
    public static CXString clang_Cursor_getObjCPropertySetterName(CXCursor C, CXString __result) {
        nclang_Cursor_getObjCPropertySetterName(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getObjCDeclQualifiers ] ---

    /** {@code unsigned clang_Cursor_getObjCDeclQualifiers(CXCursor C)} */
    public static native int nclang_Cursor_getObjCDeclQualifiers(long C, long __functionAddress);

    /** {@code unsigned clang_Cursor_getObjCDeclQualifiers(CXCursor C)} */
    public static int nclang_Cursor_getObjCDeclQualifiers(long C) {
        long __functionAddress = Functions.Cursor_getObjCDeclQualifiers;
        return nclang_Cursor_getObjCDeclQualifiers(C, __functionAddress);
    }

    /** {@code unsigned clang_Cursor_getObjCDeclQualifiers(CXCursor C)} */
    @NativeType("unsigned")
    public static int clang_Cursor_getObjCDeclQualifiers(CXCursor C) {
        return nclang_Cursor_getObjCDeclQualifiers(C.address());
    }

    // --- [ clang_Cursor_isObjCOptional ] ---

    /** {@code unsigned clang_Cursor_isObjCOptional(CXCursor C)} */
    public static native int nclang_Cursor_isObjCOptional(long C, long __functionAddress);

    /** {@code unsigned clang_Cursor_isObjCOptional(CXCursor C)} */
    public static int nclang_Cursor_isObjCOptional(long C) {
        long __functionAddress = Functions.Cursor_isObjCOptional;
        return nclang_Cursor_isObjCOptional(C, __functionAddress);
    }

    /** {@code unsigned clang_Cursor_isObjCOptional(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_Cursor_isObjCOptional(CXCursor C) {
        return nclang_Cursor_isObjCOptional(C.address()) != 0;
    }

    // --- [ clang_Cursor_isVariadic ] ---

    /** {@code unsigned clang_Cursor_isVariadic(CXCursor C)} */
    public static native int nclang_Cursor_isVariadic(long C, long __functionAddress);

    /** {@code unsigned clang_Cursor_isVariadic(CXCursor C)} */
    public static int nclang_Cursor_isVariadic(long C) {
        long __functionAddress = Functions.Cursor_isVariadic;
        return nclang_Cursor_isVariadic(C, __functionAddress);
    }

    /** {@code unsigned clang_Cursor_isVariadic(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_Cursor_isVariadic(CXCursor C) {
        return nclang_Cursor_isVariadic(C.address()) != 0;
    }

    // --- [ clang_Cursor_isExternalSymbol ] ---

    /** {@code unsigned clang_Cursor_isExternalSymbol(CXCursor C, CXString * language, CXString * definedIn, unsigned * isGenerated)} */
    public static native int nclang_Cursor_isExternalSymbol(long C, long language, long definedIn, long isGenerated, long __functionAddress);

    /** {@code unsigned clang_Cursor_isExternalSymbol(CXCursor C, CXString * language, CXString * definedIn, unsigned * isGenerated)} */
    public static int nclang_Cursor_isExternalSymbol(long C, long language, long definedIn, long isGenerated) {
        long __functionAddress = Functions.Cursor_isExternalSymbol;
        return nclang_Cursor_isExternalSymbol(C, language, definedIn, isGenerated, __functionAddress);
    }

    /** {@code unsigned clang_Cursor_isExternalSymbol(CXCursor C, CXString * language, CXString * definedIn, unsigned * isGenerated)} */
    @NativeType("unsigned")
    public static boolean clang_Cursor_isExternalSymbol(CXCursor C, @NativeType("CXString *") CXString.@Nullable Buffer language, @NativeType("CXString *") CXString.@Nullable Buffer definedIn, @NativeType("unsigned *") @Nullable IntBuffer isGenerated) {
        if (CHECKS) {
            checkSafe(language, 1);
            checkSafe(definedIn, 1);
            checkSafe(isGenerated, 1);
        }
        return nclang_Cursor_isExternalSymbol(C.address(), memAddressSafe(language), memAddressSafe(definedIn), memAddressSafe(isGenerated)) != 0;
    }

    // --- [ clang_Cursor_getCommentRange ] ---

    /** {@code CXSourceRange clang_Cursor_getCommentRange(CXCursor C)} */
    public static native void nclang_Cursor_getCommentRange(long C, long __functionAddress, long __result);

    /** {@code CXSourceRange clang_Cursor_getCommentRange(CXCursor C)} */
    public static void nclang_Cursor_getCommentRange(long C, long __result) {
        long __functionAddress = Functions.Cursor_getCommentRange;
        nclang_Cursor_getCommentRange(C, __functionAddress, __result);
    }

    /** {@code CXSourceRange clang_Cursor_getCommentRange(CXCursor C)} */
    public static CXSourceRange clang_Cursor_getCommentRange(CXCursor C, CXSourceRange __result) {
        nclang_Cursor_getCommentRange(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getRawCommentText ] ---

    /** {@code CXString clang_Cursor_getRawCommentText(CXCursor C)} */
    public static native void nclang_Cursor_getRawCommentText(long C, long __functionAddress, long __result);

    /** {@code CXString clang_Cursor_getRawCommentText(CXCursor C)} */
    public static void nclang_Cursor_getRawCommentText(long C, long __result) {
        long __functionAddress = Functions.Cursor_getRawCommentText;
        nclang_Cursor_getRawCommentText(C, __functionAddress, __result);
    }

    /** {@code CXString clang_Cursor_getRawCommentText(CXCursor C)} */
    public static CXString clang_Cursor_getRawCommentText(CXCursor C, CXString __result) {
        nclang_Cursor_getRawCommentText(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getBriefCommentText ] ---

    /** {@code CXString clang_Cursor_getBriefCommentText(CXCursor C)} */
    public static native void nclang_Cursor_getBriefCommentText(long C, long __functionAddress, long __result);

    /** {@code CXString clang_Cursor_getBriefCommentText(CXCursor C)} */
    public static void nclang_Cursor_getBriefCommentText(long C, long __result) {
        long __functionAddress = Functions.Cursor_getBriefCommentText;
        nclang_Cursor_getBriefCommentText(C, __functionAddress, __result);
    }

    /** {@code CXString clang_Cursor_getBriefCommentText(CXCursor C)} */
    public static CXString clang_Cursor_getBriefCommentText(CXCursor C, CXString __result) {
        nclang_Cursor_getBriefCommentText(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getMangling ] ---

    /** {@code CXString clang_Cursor_getMangling(CXCursor cursor)} */
    public static native void nclang_Cursor_getMangling(long cursor, long __functionAddress, long __result);

    /** {@code CXString clang_Cursor_getMangling(CXCursor cursor)} */
    public static void nclang_Cursor_getMangling(long cursor, long __result) {
        long __functionAddress = Functions.Cursor_getMangling;
        nclang_Cursor_getMangling(cursor, __functionAddress, __result);
    }

    /** {@code CXString clang_Cursor_getMangling(CXCursor cursor)} */
    public static CXString clang_Cursor_getMangling(CXCursor cursor, CXString __result) {
        nclang_Cursor_getMangling(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getCXXManglings ] ---

    /** {@code CXStringSet * clang_Cursor_getCXXManglings(CXCursor cursor)} */
    public static native long nclang_Cursor_getCXXManglings(long cursor, long __functionAddress);

    /** {@code CXStringSet * clang_Cursor_getCXXManglings(CXCursor cursor)} */
    public static long nclang_Cursor_getCXXManglings(long cursor) {
        long __functionAddress = Functions.Cursor_getCXXManglings;
        return nclang_Cursor_getCXXManglings(cursor, __functionAddress);
    }

    /** {@code CXStringSet * clang_Cursor_getCXXManglings(CXCursor cursor)} */
    @NativeType("CXStringSet *")
    public static @Nullable CXStringSet clang_Cursor_getCXXManglings(CXCursor cursor) {
        long __result = nclang_Cursor_getCXXManglings(cursor.address());
        return CXStringSet.createSafe(__result);
    }

    // --- [ clang_Cursor_getObjCManglings ] ---

    /** {@code CXStringSet * clang_Cursor_getObjCManglings(CXCursor cursor)} */
    public static native long nclang_Cursor_getObjCManglings(long cursor, long __functionAddress);

    /** {@code CXStringSet * clang_Cursor_getObjCManglings(CXCursor cursor)} */
    public static long nclang_Cursor_getObjCManglings(long cursor) {
        long __functionAddress = Functions.Cursor_getObjCManglings;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_Cursor_getObjCManglings(cursor, __functionAddress);
    }

    /** {@code CXStringSet * clang_Cursor_getObjCManglings(CXCursor cursor)} */
    @NativeType("CXStringSet *")
    public static @Nullable CXStringSet clang_Cursor_getObjCManglings(CXCursor cursor) {
        long __result = nclang_Cursor_getObjCManglings(cursor.address());
        return CXStringSet.createSafe(__result);
    }

    // --- [ clang_Cursor_getModule ] ---

    /** {@code CXModule clang_Cursor_getModule(CXCursor C)} */
    public static native long nclang_Cursor_getModule(long C, long __functionAddress);

    /** {@code CXModule clang_Cursor_getModule(CXCursor C)} */
    public static long nclang_Cursor_getModule(long C) {
        long __functionAddress = Functions.Cursor_getModule;
        return nclang_Cursor_getModule(C, __functionAddress);
    }

    /** {@code CXModule clang_Cursor_getModule(CXCursor C)} */
    @NativeType("CXModule")
    public static long clang_Cursor_getModule(CXCursor C) {
        return nclang_Cursor_getModule(C.address());
    }

    // --- [ clang_getModuleForFile ] ---

    /** {@code CXModule clang_getModuleForFile(CXTranslationUnit TU, CXFile file)} */
    @NativeType("CXModule")
    public static long clang_getModuleForFile(@NativeType("CXTranslationUnit") long TU, @NativeType("CXFile") long file) {
        long __functionAddress = Functions.getModuleForFile;
        if (CHECKS) {
            check(TU);
            check(file);
        }
        return invokePPP(TU, file, __functionAddress);
    }

    // --- [ clang_Module_getASTFile ] ---

    /** {@code CXFile clang_Module_getASTFile(CXModule Module)} */
    @NativeType("CXFile")
    public static long clang_Module_getASTFile(@NativeType("CXModule") long Module) {
        long __functionAddress = Functions.Module_getASTFile;
        if (CHECKS) {
            check(Module);
        }
        return invokePP(Module, __functionAddress);
    }

    // --- [ clang_Module_getParent ] ---

    /** {@code CXModule clang_Module_getParent(CXModule Module)} */
    @NativeType("CXModule")
    public static long clang_Module_getParent(@NativeType("CXModule") long Module) {
        long __functionAddress = Functions.Module_getParent;
        if (CHECKS) {
            check(Module);
        }
        return invokePP(Module, __functionAddress);
    }

    // --- [ clang_Module_getName ] ---

    /** {@code CXString clang_Module_getName(CXModule Module)} */
    public static native void nclang_Module_getName(long Module, long __functionAddress, long __result);

    /** {@code CXString clang_Module_getName(CXModule Module)} */
    public static void nclang_Module_getName(long Module, long __result) {
        long __functionAddress = Functions.Module_getName;
        if (CHECKS) {
            check(Module);
        }
        nclang_Module_getName(Module, __functionAddress, __result);
    }

    /** {@code CXString clang_Module_getName(CXModule Module)} */
    public static CXString clang_Module_getName(@NativeType("CXModule") long Module, CXString __result) {
        nclang_Module_getName(Module, __result.address());
        return __result;
    }

    // --- [ clang_Module_getFullName ] ---

    /** {@code CXString clang_Module_getFullName(CXModule Module)} */
    public static native void nclang_Module_getFullName(long Module, long __functionAddress, long __result);

    /** {@code CXString clang_Module_getFullName(CXModule Module)} */
    public static void nclang_Module_getFullName(long Module, long __result) {
        long __functionAddress = Functions.Module_getFullName;
        if (CHECKS) {
            check(Module);
        }
        nclang_Module_getFullName(Module, __functionAddress, __result);
    }

    /** {@code CXString clang_Module_getFullName(CXModule Module)} */
    public static CXString clang_Module_getFullName(@NativeType("CXModule") long Module, CXString __result) {
        nclang_Module_getFullName(Module, __result.address());
        return __result;
    }

    // --- [ clang_Module_isSystem ] ---

    /** {@code int clang_Module_isSystem(CXModule Module)} */
    @NativeType("int")
    public static boolean clang_Module_isSystem(@NativeType("CXModule") long Module) {
        long __functionAddress = Functions.Module_isSystem;
        if (CHECKS) {
            check(Module);
        }
        return invokePI(Module, __functionAddress) != 0;
    }

    // --- [ clang_Module_getNumTopLevelHeaders ] ---

    /** {@code unsigned clang_Module_getNumTopLevelHeaders(CXTranslationUnit TU, CXModule Module)} */
    @NativeType("unsigned")
    public static int clang_Module_getNumTopLevelHeaders(@NativeType("CXTranslationUnit") long TU, @NativeType("CXModule") long Module) {
        long __functionAddress = Functions.Module_getNumTopLevelHeaders;
        if (CHECKS) {
            check(TU);
            check(Module);
        }
        return invokePPI(TU, Module, __functionAddress);
    }

    // --- [ clang_Module_getTopLevelHeader ] ---

    /** {@code CXFile clang_Module_getTopLevelHeader(CXTranslationUnit TU, CXModule Module, unsigned Index)} */
    @NativeType("CXFile")
    public static long clang_Module_getTopLevelHeader(@NativeType("CXTranslationUnit") long TU, @NativeType("CXModule") long Module, @NativeType("unsigned") int Index) {
        long __functionAddress = Functions.Module_getTopLevelHeader;
        if (CHECKS) {
            check(TU);
            check(Module);
        }
        return invokePPP(TU, Module, Index, __functionAddress);
    }

    // --- [ clang_CXXConstructor_isConvertingConstructor ] ---

    /** {@code unsigned clang_CXXConstructor_isConvertingConstructor(CXCursor C)} */
    public static native int nclang_CXXConstructor_isConvertingConstructor(long C, long __functionAddress);

    /** {@code unsigned clang_CXXConstructor_isConvertingConstructor(CXCursor C)} */
    public static int nclang_CXXConstructor_isConvertingConstructor(long C) {
        long __functionAddress = Functions.CXXConstructor_isConvertingConstructor;
        return nclang_CXXConstructor_isConvertingConstructor(C, __functionAddress);
    }

    /** {@code unsigned clang_CXXConstructor_isConvertingConstructor(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_CXXConstructor_isConvertingConstructor(CXCursor C) {
        return nclang_CXXConstructor_isConvertingConstructor(C.address()) != 0;
    }

    // --- [ clang_CXXConstructor_isCopyConstructor ] ---

    /** {@code unsigned clang_CXXConstructor_isCopyConstructor(CXCursor C)} */
    public static native int nclang_CXXConstructor_isCopyConstructor(long C, long __functionAddress);

    /** {@code unsigned clang_CXXConstructor_isCopyConstructor(CXCursor C)} */
    public static int nclang_CXXConstructor_isCopyConstructor(long C) {
        long __functionAddress = Functions.CXXConstructor_isCopyConstructor;
        return nclang_CXXConstructor_isCopyConstructor(C, __functionAddress);
    }

    /** {@code unsigned clang_CXXConstructor_isCopyConstructor(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_CXXConstructor_isCopyConstructor(CXCursor C) {
        return nclang_CXXConstructor_isCopyConstructor(C.address()) != 0;
    }

    // --- [ clang_CXXConstructor_isDefaultConstructor ] ---

    /** {@code unsigned clang_CXXConstructor_isDefaultConstructor(CXCursor C)} */
    public static native int nclang_CXXConstructor_isDefaultConstructor(long C, long __functionAddress);

    /** {@code unsigned clang_CXXConstructor_isDefaultConstructor(CXCursor C)} */
    public static int nclang_CXXConstructor_isDefaultConstructor(long C) {
        long __functionAddress = Functions.CXXConstructor_isDefaultConstructor;
        return nclang_CXXConstructor_isDefaultConstructor(C, __functionAddress);
    }

    /** {@code unsigned clang_CXXConstructor_isDefaultConstructor(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_CXXConstructor_isDefaultConstructor(CXCursor C) {
        return nclang_CXXConstructor_isDefaultConstructor(C.address()) != 0;
    }

    // --- [ clang_CXXConstructor_isMoveConstructor ] ---

    /** {@code unsigned clang_CXXConstructor_isMoveConstructor(CXCursor C)} */
    public static native int nclang_CXXConstructor_isMoveConstructor(long C, long __functionAddress);

    /** {@code unsigned clang_CXXConstructor_isMoveConstructor(CXCursor C)} */
    public static int nclang_CXXConstructor_isMoveConstructor(long C) {
        long __functionAddress = Functions.CXXConstructor_isMoveConstructor;
        return nclang_CXXConstructor_isMoveConstructor(C, __functionAddress);
    }

    /** {@code unsigned clang_CXXConstructor_isMoveConstructor(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_CXXConstructor_isMoveConstructor(CXCursor C) {
        return nclang_CXXConstructor_isMoveConstructor(C.address()) != 0;
    }

    // --- [ clang_CXXField_isMutable ] ---

    /** {@code unsigned clang_CXXField_isMutable(CXCursor C)} */
    public static native int nclang_CXXField_isMutable(long C, long __functionAddress);

    /** {@code unsigned clang_CXXField_isMutable(CXCursor C)} */
    public static int nclang_CXXField_isMutable(long C) {
        long __functionAddress = Functions.CXXField_isMutable;
        return nclang_CXXField_isMutable(C, __functionAddress);
    }

    /** {@code unsigned clang_CXXField_isMutable(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_CXXField_isMutable(CXCursor C) {
        return nclang_CXXField_isMutable(C.address()) != 0;
    }

    // --- [ clang_CXXMethod_isDefaulted ] ---

    /** {@code unsigned clang_CXXMethod_isDefaulted(CXCursor C)} */
    public static native int nclang_CXXMethod_isDefaulted(long C, long __functionAddress);

    /** {@code unsigned clang_CXXMethod_isDefaulted(CXCursor C)} */
    public static int nclang_CXXMethod_isDefaulted(long C) {
        long __functionAddress = Functions.CXXMethod_isDefaulted;
        return nclang_CXXMethod_isDefaulted(C, __functionAddress);
    }

    /** {@code unsigned clang_CXXMethod_isDefaulted(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_CXXMethod_isDefaulted(CXCursor C) {
        return nclang_CXXMethod_isDefaulted(C.address()) != 0;
    }

    // --- [ clang_CXXMethod_isDeleted ] ---

    /** {@code unsigned clang_CXXMethod_isDeleted(CXCursor C)} */
    public static native int nclang_CXXMethod_isDeleted(long C, long __functionAddress);

    /** {@code unsigned clang_CXXMethod_isDeleted(CXCursor C)} */
    public static int nclang_CXXMethod_isDeleted(long C) {
        long __functionAddress = Functions.CXXMethod_isDeleted;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_CXXMethod_isDeleted(C, __functionAddress);
    }

    /** {@code unsigned clang_CXXMethod_isDeleted(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_CXXMethod_isDeleted(CXCursor C) {
        return nclang_CXXMethod_isDeleted(C.address()) != 0;
    }

    // --- [ clang_CXXMethod_isPureVirtual ] ---

    /** {@code unsigned clang_CXXMethod_isPureVirtual(CXCursor C)} */
    public static native int nclang_CXXMethod_isPureVirtual(long C, long __functionAddress);

    /** {@code unsigned clang_CXXMethod_isPureVirtual(CXCursor C)} */
    public static int nclang_CXXMethod_isPureVirtual(long C) {
        long __functionAddress = Functions.CXXMethod_isPureVirtual;
        return nclang_CXXMethod_isPureVirtual(C, __functionAddress);
    }

    /** {@code unsigned clang_CXXMethod_isPureVirtual(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_CXXMethod_isPureVirtual(CXCursor C) {
        return nclang_CXXMethod_isPureVirtual(C.address()) != 0;
    }

    // --- [ clang_CXXMethod_isStatic ] ---

    /** {@code unsigned clang_CXXMethod_isStatic(CXCursor C)} */
    public static native int nclang_CXXMethod_isStatic(long C, long __functionAddress);

    /** {@code unsigned clang_CXXMethod_isStatic(CXCursor C)} */
    public static int nclang_CXXMethod_isStatic(long C) {
        long __functionAddress = Functions.CXXMethod_isStatic;
        return nclang_CXXMethod_isStatic(C, __functionAddress);
    }

    /** {@code unsigned clang_CXXMethod_isStatic(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_CXXMethod_isStatic(CXCursor C) {
        return nclang_CXXMethod_isStatic(C.address()) != 0;
    }

    // --- [ clang_CXXMethod_isVirtual ] ---

    /** {@code unsigned clang_CXXMethod_isVirtual(CXCursor C)} */
    public static native int nclang_CXXMethod_isVirtual(long C, long __functionAddress);

    /** {@code unsigned clang_CXXMethod_isVirtual(CXCursor C)} */
    public static int nclang_CXXMethod_isVirtual(long C) {
        long __functionAddress = Functions.CXXMethod_isVirtual;
        return nclang_CXXMethod_isVirtual(C, __functionAddress);
    }

    /** {@code unsigned clang_CXXMethod_isVirtual(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_CXXMethod_isVirtual(CXCursor C) {
        return nclang_CXXMethod_isVirtual(C.address()) != 0;
    }

    // --- [ clang_CXXMethod_isCopyAssignmentOperator ] ---

    /** {@code unsigned clang_CXXMethod_isCopyAssignmentOperator(CXCursor C)} */
    public static native int nclang_CXXMethod_isCopyAssignmentOperator(long C, long __functionAddress);

    /** {@code unsigned clang_CXXMethod_isCopyAssignmentOperator(CXCursor C)} */
    public static int nclang_CXXMethod_isCopyAssignmentOperator(long C) {
        long __functionAddress = Functions.CXXMethod_isCopyAssignmentOperator;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_CXXMethod_isCopyAssignmentOperator(C, __functionAddress);
    }

    /** {@code unsigned clang_CXXMethod_isCopyAssignmentOperator(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_CXXMethod_isCopyAssignmentOperator(CXCursor C) {
        return nclang_CXXMethod_isCopyAssignmentOperator(C.address()) != 0;
    }

    // --- [ clang_CXXMethod_isMoveAssignmentOperator ] ---

    /** {@code unsigned clang_CXXMethod_isMoveAssignmentOperator(CXCursor C)} */
    public static native int nclang_CXXMethod_isMoveAssignmentOperator(long C, long __functionAddress);

    /** {@code unsigned clang_CXXMethod_isMoveAssignmentOperator(CXCursor C)} */
    public static int nclang_CXXMethod_isMoveAssignmentOperator(long C) {
        long __functionAddress = Functions.CXXMethod_isMoveAssignmentOperator;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_CXXMethod_isMoveAssignmentOperator(C, __functionAddress);
    }

    /** {@code unsigned clang_CXXMethod_isMoveAssignmentOperator(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_CXXMethod_isMoveAssignmentOperator(CXCursor C) {
        return nclang_CXXMethod_isMoveAssignmentOperator(C.address()) != 0;
    }

    // --- [ clang_CXXMethod_isExplicit ] ---

    /** {@code unsigned clang_CXXMethod_isExplicit(CXCursor C)} */
    public static native int nclang_CXXMethod_isExplicit(long C, long __functionAddress);

    /** {@code unsigned clang_CXXMethod_isExplicit(CXCursor C)} */
    public static int nclang_CXXMethod_isExplicit(long C) {
        long __functionAddress = Functions.CXXMethod_isExplicit;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_CXXMethod_isExplicit(C, __functionAddress);
    }

    /** {@code unsigned clang_CXXMethod_isExplicit(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_CXXMethod_isExplicit(CXCursor C) {
        return nclang_CXXMethod_isExplicit(C.address()) != 0;
    }

    // --- [ clang_CXXRecord_isAbstract ] ---

    /** {@code unsigned clang_CXXRecord_isAbstract(CXCursor C)} */
    public static native int nclang_CXXRecord_isAbstract(long C, long __functionAddress);

    /** {@code unsigned clang_CXXRecord_isAbstract(CXCursor C)} */
    public static int nclang_CXXRecord_isAbstract(long C) {
        long __functionAddress = Functions.CXXRecord_isAbstract;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_CXXRecord_isAbstract(C, __functionAddress);
    }

    /** {@code unsigned clang_CXXRecord_isAbstract(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_CXXRecord_isAbstract(CXCursor C) {
        return nclang_CXXRecord_isAbstract(C.address()) != 0;
    }

    // --- [ clang_EnumDecl_isScoped ] ---

    /** {@code unsigned clang_EnumDecl_isScoped(CXCursor C)} */
    public static native int nclang_EnumDecl_isScoped(long C, long __functionAddress);

    /** {@code unsigned clang_EnumDecl_isScoped(CXCursor C)} */
    public static int nclang_EnumDecl_isScoped(long C) {
        long __functionAddress = Functions.EnumDecl_isScoped;
        return nclang_EnumDecl_isScoped(C, __functionAddress);
    }

    /** {@code unsigned clang_EnumDecl_isScoped(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_EnumDecl_isScoped(CXCursor C) {
        return nclang_EnumDecl_isScoped(C.address()) != 0;
    }

    // --- [ clang_CXXMethod_isConst ] ---

    /** {@code unsigned clang_CXXMethod_isConst(CXCursor C)} */
    public static native int nclang_CXXMethod_isConst(long C, long __functionAddress);

    /** {@code unsigned clang_CXXMethod_isConst(CXCursor C)} */
    public static int nclang_CXXMethod_isConst(long C) {
        long __functionAddress = Functions.CXXMethod_isConst;
        return nclang_CXXMethod_isConst(C, __functionAddress);
    }

    /** {@code unsigned clang_CXXMethod_isConst(CXCursor C)} */
    @NativeType("unsigned")
    public static boolean clang_CXXMethod_isConst(CXCursor C) {
        return nclang_CXXMethod_isConst(C.address()) != 0;
    }

    // --- [ clang_getTemplateCursorKind ] ---

    /** {@code enum CXCursorKind clang_getTemplateCursorKind(CXCursor C)} */
    public static native int nclang_getTemplateCursorKind(long C, long __functionAddress);

    /** {@code enum CXCursorKind clang_getTemplateCursorKind(CXCursor C)} */
    public static int nclang_getTemplateCursorKind(long C) {
        long __functionAddress = Functions.getTemplateCursorKind;
        return nclang_getTemplateCursorKind(C, __functionAddress);
    }

    /** {@code enum CXCursorKind clang_getTemplateCursorKind(CXCursor C)} */
    @NativeType("enum CXCursorKind")
    public static int clang_getTemplateCursorKind(CXCursor C) {
        return nclang_getTemplateCursorKind(C.address());
    }

    // --- [ clang_getSpecializedCursorTemplate ] ---

    /** {@code CXCursor clang_getSpecializedCursorTemplate(CXCursor C)} */
    public static native void nclang_getSpecializedCursorTemplate(long C, long __functionAddress, long __result);

    /** {@code CXCursor clang_getSpecializedCursorTemplate(CXCursor C)} */
    public static void nclang_getSpecializedCursorTemplate(long C, long __result) {
        long __functionAddress = Functions.getSpecializedCursorTemplate;
        nclang_getSpecializedCursorTemplate(C, __functionAddress, __result);
    }

    /** {@code CXCursor clang_getSpecializedCursorTemplate(CXCursor C)} */
    public static CXCursor clang_getSpecializedCursorTemplate(CXCursor C, CXCursor __result) {
        nclang_getSpecializedCursorTemplate(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_getCursorReferenceNameRange ] ---

    /** {@code CXSourceRange clang_getCursorReferenceNameRange(CXCursor C, unsigned NameFlags, unsigned PieceIndex)} */
    public static native void nclang_getCursorReferenceNameRange(long C, int NameFlags, int PieceIndex, long __functionAddress, long __result);

    /** {@code CXSourceRange clang_getCursorReferenceNameRange(CXCursor C, unsigned NameFlags, unsigned PieceIndex)} */
    public static void nclang_getCursorReferenceNameRange(long C, int NameFlags, int PieceIndex, long __result) {
        long __functionAddress = Functions.getCursorReferenceNameRange;
        nclang_getCursorReferenceNameRange(C, NameFlags, PieceIndex, __functionAddress, __result);
    }

    /** {@code CXSourceRange clang_getCursorReferenceNameRange(CXCursor C, unsigned NameFlags, unsigned PieceIndex)} */
    public static CXSourceRange clang_getCursorReferenceNameRange(CXCursor C, @NativeType("unsigned") int NameFlags, @NativeType("unsigned") int PieceIndex, CXSourceRange __result) {
        nclang_getCursorReferenceNameRange(C.address(), NameFlags, PieceIndex, __result.address());
        return __result;
    }

    // --- [ clang_getToken ] ---

    /** {@code CXToken * clang_getToken(CXTranslationUnit TU, CXSourceLocation Location)} */
    public static native long nclang_getToken(long TU, long Location, long __functionAddress);

    /** {@code CXToken * clang_getToken(CXTranslationUnit TU, CXSourceLocation Location)} */
    public static long nclang_getToken(long TU, long Location) {
        long __functionAddress = Functions.getToken;
        if (CHECKS) {
            check(__functionAddress);
            check(TU);
        }
        return nclang_getToken(TU, Location, __functionAddress);
    }

    /** {@code CXToken * clang_getToken(CXTranslationUnit TU, CXSourceLocation Location)} */
    @NativeType("CXToken *")
    public static @Nullable CXToken clang_getToken(@NativeType("CXTranslationUnit") long TU, CXSourceLocation Location) {
        long __result = nclang_getToken(TU, Location.address());
        return CXToken.createSafe(__result);
    }

    // --- [ clang_getTokenKind ] ---

    /** {@code CXTokenKind clang_getTokenKind(CXToken token)} */
    public static native int nclang_getTokenKind(long token, long __functionAddress);

    /** {@code CXTokenKind clang_getTokenKind(CXToken token)} */
    public static int nclang_getTokenKind(long token) {
        long __functionAddress = Functions.getTokenKind;
        return nclang_getTokenKind(token, __functionAddress);
    }

    /** {@code CXTokenKind clang_getTokenKind(CXToken token)} */
    @NativeType("CXTokenKind")
    public static int clang_getTokenKind(CXToken token) {
        return nclang_getTokenKind(token.address());
    }

    // --- [ clang_getTokenSpelling ] ---

    /** {@code CXString clang_getTokenSpelling(CXTranslationUnit TU, CXToken token)} */
    public static native void nclang_getTokenSpelling(long TU, long token, long __functionAddress, long __result);

    /** {@code CXString clang_getTokenSpelling(CXTranslationUnit TU, CXToken token)} */
    public static void nclang_getTokenSpelling(long TU, long token, long __result) {
        long __functionAddress = Functions.getTokenSpelling;
        if (CHECKS) {
            check(TU);
        }
        nclang_getTokenSpelling(TU, token, __functionAddress, __result);
    }

    /** {@code CXString clang_getTokenSpelling(CXTranslationUnit TU, CXToken token)} */
    public static CXString clang_getTokenSpelling(@NativeType("CXTranslationUnit") long TU, CXToken token, CXString __result) {
        nclang_getTokenSpelling(TU, token.address(), __result.address());
        return __result;
    }

    // --- [ clang_getTokenLocation ] ---

    /** {@code CXSourceLocation clang_getTokenLocation(CXTranslationUnit TU, CXToken token)} */
    public static native void nclang_getTokenLocation(long TU, long token, long __functionAddress, long __result);

    /** {@code CXSourceLocation clang_getTokenLocation(CXTranslationUnit TU, CXToken token)} */
    public static void nclang_getTokenLocation(long TU, long token, long __result) {
        long __functionAddress = Functions.getTokenLocation;
        if (CHECKS) {
            check(TU);
        }
        nclang_getTokenLocation(TU, token, __functionAddress, __result);
    }

    /** {@code CXSourceLocation clang_getTokenLocation(CXTranslationUnit TU, CXToken token)} */
    public static CXSourceLocation clang_getTokenLocation(@NativeType("CXTranslationUnit") long TU, CXToken token, CXSourceLocation __result) {
        nclang_getTokenLocation(TU, token.address(), __result.address());
        return __result;
    }

    // --- [ clang_getTokenExtent ] ---

    /** {@code CXSourceRange clang_getTokenExtent(CXTranslationUnit TU, CXToken token)} */
    public static native void nclang_getTokenExtent(long TU, long token, long __functionAddress, long __result);

    /** {@code CXSourceRange clang_getTokenExtent(CXTranslationUnit TU, CXToken token)} */
    public static void nclang_getTokenExtent(long TU, long token, long __result) {
        long __functionAddress = Functions.getTokenExtent;
        if (CHECKS) {
            check(TU);
        }
        nclang_getTokenExtent(TU, token, __functionAddress, __result);
    }

    /** {@code CXSourceRange clang_getTokenExtent(CXTranslationUnit TU, CXToken token)} */
    public static CXSourceRange clang_getTokenExtent(@NativeType("CXTranslationUnit") long TU, CXToken token, CXSourceRange __result) {
        nclang_getTokenExtent(TU, token.address(), __result.address());
        return __result;
    }

    // --- [ clang_tokenize ] ---

    /** {@code void clang_tokenize(CXTranslationUnit TU, CXSourceRange Range, CXToken ** Tokens, unsigned * NumTokens)} */
    public static native void nclang_tokenize(long TU, long Range, long Tokens, long NumTokens, long __functionAddress);

    /** {@code void clang_tokenize(CXTranslationUnit TU, CXSourceRange Range, CXToken ** Tokens, unsigned * NumTokens)} */
    public static void nclang_tokenize(long TU, long Range, long Tokens, long NumTokens) {
        long __functionAddress = Functions.tokenize;
        if (CHECKS) {
            check(TU);
        }
        nclang_tokenize(TU, Range, Tokens, NumTokens, __functionAddress);
    }

    /** {@code void clang_tokenize(CXTranslationUnit TU, CXSourceRange Range, CXToken ** Tokens, unsigned * NumTokens)} */
    public static void clang_tokenize(@NativeType("CXTranslationUnit") long TU, CXSourceRange Range, @NativeType("CXToken **") PointerBuffer Tokens, @NativeType("unsigned *") IntBuffer NumTokens) {
        if (CHECKS) {
            check(Tokens, 1);
            check(NumTokens, 1);
        }
        nclang_tokenize(TU, Range.address(), memAddress(Tokens), memAddress(NumTokens));
    }

    // --- [ clang_annotateTokens ] ---

    /** {@code void clang_annotateTokens(CXTranslationUnit TU, CXToken * Tokens, unsigned NumTokens, CXCursor * Cursors)} */
    public static void nclang_annotateTokens(long TU, long Tokens, int NumTokens, long Cursors) {
        long __functionAddress = Functions.annotateTokens;
        if (CHECKS) {
            check(TU);
        }
        invokePPPV(TU, Tokens, NumTokens, Cursors, __functionAddress);
    }

    /** {@code void clang_annotateTokens(CXTranslationUnit TU, CXToken * Tokens, unsigned NumTokens, CXCursor * Cursors)} */
    public static void clang_annotateTokens(@NativeType("CXTranslationUnit") long TU, @NativeType("CXToken *") CXToken.Buffer Tokens, @NativeType("CXCursor *") CXCursor.Buffer Cursors) {
        if (CHECKS) {
            check(Cursors, Tokens.remaining());
        }
        nclang_annotateTokens(TU, Tokens.address(), Tokens.remaining(), Cursors.address());
    }

    // --- [ clang_disposeTokens ] ---

    /** {@code void clang_disposeTokens(CXTranslationUnit TU, CXToken * Tokens, unsigned NumTokens)} */
    public static void nclang_disposeTokens(long TU, long Tokens, int NumTokens) {
        long __functionAddress = Functions.disposeTokens;
        if (CHECKS) {
            check(TU);
        }
        invokePPV(TU, Tokens, NumTokens, __functionAddress);
    }

    /** {@code void clang_disposeTokens(CXTranslationUnit TU, CXToken * Tokens, unsigned NumTokens)} */
    public static void clang_disposeTokens(@NativeType("CXTranslationUnit") long TU, @NativeType("CXToken *") CXToken.Buffer Tokens) {
        nclang_disposeTokens(TU, Tokens.address(), Tokens.remaining());
    }

    // --- [ clang_getCursorKindSpelling ] ---

    /** {@code CXString clang_getCursorKindSpelling(enum CXCursorKind Kind)} */
    public static native void nclang_getCursorKindSpelling(int Kind, long __functionAddress, long __result);

    /** {@code CXString clang_getCursorKindSpelling(enum CXCursorKind Kind)} */
    public static void nclang_getCursorKindSpelling(int Kind, long __result) {
        long __functionAddress = Functions.getCursorKindSpelling;
        nclang_getCursorKindSpelling(Kind, __functionAddress, __result);
    }

    /** {@code CXString clang_getCursorKindSpelling(enum CXCursorKind Kind)} */
    public static CXString clang_getCursorKindSpelling(@NativeType("enum CXCursorKind") int Kind, CXString __result) {
        nclang_getCursorKindSpelling(Kind, __result.address());
        return __result;
    }

    // --- [ clang_getDefinitionSpellingAndExtent ] ---

    /** {@code void clang_getDefinitionSpellingAndExtent(CXCursor cursor, char const ** startBuf, char const ** endBuf, unsigned * startLine, unsigned * startColumn, unsigned * endLine, unsigned * endColumn)} */
    public static native void nclang_getDefinitionSpellingAndExtent(long cursor, long startBuf, long endBuf, long startLine, long startColumn, long endLine, long endColumn, long __functionAddress);

    /** {@code void clang_getDefinitionSpellingAndExtent(CXCursor cursor, char const ** startBuf, char const ** endBuf, unsigned * startLine, unsigned * startColumn, unsigned * endLine, unsigned * endColumn)} */
    public static void nclang_getDefinitionSpellingAndExtent(long cursor, long startBuf, long endBuf, long startLine, long startColumn, long endLine, long endColumn) {
        long __functionAddress = Functions.getDefinitionSpellingAndExtent;
        nclang_getDefinitionSpellingAndExtent(cursor, startBuf, endBuf, startLine, startColumn, endLine, endColumn, __functionAddress);
    }

    /** {@code void clang_getDefinitionSpellingAndExtent(CXCursor cursor, char const ** startBuf, char const ** endBuf, unsigned * startLine, unsigned * startColumn, unsigned * endLine, unsigned * endColumn)} */
    public static void clang_getDefinitionSpellingAndExtent(CXCursor cursor, @NativeType("char const **") @Nullable PointerBuffer startBuf, @NativeType("char const **") @Nullable PointerBuffer endBuf, @NativeType("unsigned *") @Nullable IntBuffer startLine, @NativeType("unsigned *") @Nullable IntBuffer startColumn, @NativeType("unsigned *") @Nullable IntBuffer endLine, @NativeType("unsigned *") @Nullable IntBuffer endColumn) {
        if (CHECKS) {
            checkSafe(startBuf, 1);
            checkSafe(endBuf, 1);
            checkSafe(startLine, 1);
            checkSafe(startColumn, 1);
            checkSafe(endLine, 1);
            checkSafe(endColumn, 1);
        }
        nclang_getDefinitionSpellingAndExtent(cursor.address(), memAddressSafe(startBuf), memAddressSafe(endBuf), memAddressSafe(startLine), memAddressSafe(startColumn), memAddressSafe(endLine), memAddressSafe(endColumn));
    }

    // --- [ clang_enableStackTraces ] ---

    /** {@code void clang_enableStackTraces(void)} */
    public static void clang_enableStackTraces() {
        long __functionAddress = Functions.enableStackTraces;
        invokeV(__functionAddress);
    }

    // --- [ clang_executeOnThread ] ---

    /** {@code void clang_executeOnThread(void (*) (void *) fn, void * user_data, unsigned stack_size)} */
    public static void nclang_executeOnThread(long fn, long user_data, int stack_size) {
        long __functionAddress = Functions.executeOnThread;
        invokePPV(fn, user_data, stack_size, __functionAddress);
    }

    /** {@code void clang_executeOnThread(void (*) (void *) fn, void * user_data, unsigned stack_size)} */
    public static void clang_executeOnThread(@NativeType("void (*) (void *)") CXExecuteOnThreadI fn, @NativeType("void *") long user_data, @NativeType("unsigned") int stack_size) {
        nclang_executeOnThread(fn.address(), user_data, stack_size);
    }

    // --- [ clang_getCompletionChunkKind ] ---

    /** {@code enum CXCompletionChunkKind clang_getCompletionChunkKind(CXCompletionString completion_string, unsigned chunk_number)} */
    @NativeType("enum CXCompletionChunkKind")
    public static int clang_getCompletionChunkKind(@NativeType("CXCompletionString") long completion_string, @NativeType("unsigned") int chunk_number) {
        long __functionAddress = Functions.getCompletionChunkKind;
        if (CHECKS) {
            check(completion_string);
        }
        return invokePI(completion_string, chunk_number, __functionAddress);
    }

    // --- [ clang_getCompletionChunkText ] ---

    /** {@code CXString clang_getCompletionChunkText(CXCompletionString completion_string, unsigned chunk_number)} */
    public static native void nclang_getCompletionChunkText(long completion_string, int chunk_number, long __functionAddress, long __result);

    /** {@code CXString clang_getCompletionChunkText(CXCompletionString completion_string, unsigned chunk_number)} */
    public static void nclang_getCompletionChunkText(long completion_string, int chunk_number, long __result) {
        long __functionAddress = Functions.getCompletionChunkText;
        if (CHECKS) {
            check(completion_string);
        }
        nclang_getCompletionChunkText(completion_string, chunk_number, __functionAddress, __result);
    }

    /** {@code CXString clang_getCompletionChunkText(CXCompletionString completion_string, unsigned chunk_number)} */
    public static CXString clang_getCompletionChunkText(@NativeType("CXCompletionString") long completion_string, @NativeType("unsigned") int chunk_number, CXString __result) {
        nclang_getCompletionChunkText(completion_string, chunk_number, __result.address());
        return __result;
    }

    // --- [ clang_getCompletionChunkCompletionString ] ---

    /** {@code CXCompletionString clang_getCompletionChunkCompletionString(CXCompletionString completion_string, unsigned chunk_number)} */
    @NativeType("CXCompletionString")
    public static long clang_getCompletionChunkCompletionString(@NativeType("CXCompletionString") long completion_string, @NativeType("unsigned") int chunk_number) {
        long __functionAddress = Functions.getCompletionChunkCompletionString;
        if (CHECKS) {
            check(completion_string);
        }
        return invokePP(completion_string, chunk_number, __functionAddress);
    }

    // --- [ clang_getNumCompletionChunks ] ---

    /** {@code unsigned clang_getNumCompletionChunks(CXCompletionString completion_string)} */
    @NativeType("unsigned")
    public static int clang_getNumCompletionChunks(@NativeType("CXCompletionString") long completion_string) {
        long __functionAddress = Functions.getNumCompletionChunks;
        if (CHECKS) {
            check(completion_string);
        }
        return invokePI(completion_string, __functionAddress);
    }

    // --- [ clang_getCompletionPriority ] ---

    /** {@code unsigned clang_getCompletionPriority(CXCompletionString completion_string)} */
    @NativeType("unsigned")
    public static int clang_getCompletionPriority(@NativeType("CXCompletionString") long completion_string) {
        long __functionAddress = Functions.getCompletionPriority;
        if (CHECKS) {
            check(completion_string);
        }
        return invokePI(completion_string, __functionAddress);
    }

    // --- [ clang_getCompletionAvailability ] ---

    /** {@code enum CXAvailabilityKind clang_getCompletionAvailability(CXCompletionString completion_string)} */
    @NativeType("enum CXAvailabilityKind")
    public static int clang_getCompletionAvailability(@NativeType("CXCompletionString") long completion_string) {
        long __functionAddress = Functions.getCompletionAvailability;
        if (CHECKS) {
            check(completion_string);
        }
        return invokePI(completion_string, __functionAddress);
    }

    // --- [ clang_getCompletionNumAnnotations ] ---

    /** {@code unsigned clang_getCompletionNumAnnotations(CXCompletionString completion_string)} */
    @NativeType("unsigned")
    public static int clang_getCompletionNumAnnotations(@NativeType("CXCompletionString") long completion_string) {
        long __functionAddress = Functions.getCompletionNumAnnotations;
        if (CHECKS) {
            check(completion_string);
        }
        return invokePI(completion_string, __functionAddress);
    }

    // --- [ clang_getCompletionAnnotation ] ---

    /** {@code CXString clang_getCompletionAnnotation(CXCompletionString completion_string, unsigned annotation_number)} */
    public static native void nclang_getCompletionAnnotation(long completion_string, int annotation_number, long __functionAddress, long __result);

    /** {@code CXString clang_getCompletionAnnotation(CXCompletionString completion_string, unsigned annotation_number)} */
    public static void nclang_getCompletionAnnotation(long completion_string, int annotation_number, long __result) {
        long __functionAddress = Functions.getCompletionAnnotation;
        if (CHECKS) {
            check(completion_string);
        }
        nclang_getCompletionAnnotation(completion_string, annotation_number, __functionAddress, __result);
    }

    /** {@code CXString clang_getCompletionAnnotation(CXCompletionString completion_string, unsigned annotation_number)} */
    public static CXString clang_getCompletionAnnotation(@NativeType("CXCompletionString") long completion_string, @NativeType("unsigned") int annotation_number, CXString __result) {
        nclang_getCompletionAnnotation(completion_string, annotation_number, __result.address());
        return __result;
    }

    // --- [ clang_getCompletionParent ] ---

    /** {@code CXString clang_getCompletionParent(CXCompletionString completion_string, enum CXCursorKind * kind)} */
    public static native void nclang_getCompletionParent(long completion_string, long kind, long __functionAddress, long __result);

    /** {@code CXString clang_getCompletionParent(CXCompletionString completion_string, enum CXCursorKind * kind)} */
    public static void nclang_getCompletionParent(long completion_string, long kind, long __result) {
        long __functionAddress = Functions.getCompletionParent;
        if (CHECKS) {
            check(completion_string);
        }
        nclang_getCompletionParent(completion_string, kind, __functionAddress, __result);
    }

    /** {@code CXString clang_getCompletionParent(CXCompletionString completion_string, enum CXCursorKind * kind)} */
    public static CXString clang_getCompletionParent(@NativeType("CXCompletionString") long completion_string, @NativeType("enum CXCursorKind *") @Nullable IntBuffer kind, CXString __result) {
        if (CHECKS) {
            checkSafe(kind, 1);
        }
        nclang_getCompletionParent(completion_string, memAddressSafe(kind), __result.address());
        return __result;
    }

    // --- [ clang_getCompletionBriefComment ] ---

    /** {@code CXString clang_getCompletionBriefComment(CXCompletionString completion_string)} */
    public static native void nclang_getCompletionBriefComment(long completion_string, long __functionAddress, long __result);

    /** {@code CXString clang_getCompletionBriefComment(CXCompletionString completion_string)} */
    public static void nclang_getCompletionBriefComment(long completion_string, long __result) {
        long __functionAddress = Functions.getCompletionBriefComment;
        if (CHECKS) {
            check(completion_string);
        }
        nclang_getCompletionBriefComment(completion_string, __functionAddress, __result);
    }

    /** {@code CXString clang_getCompletionBriefComment(CXCompletionString completion_string)} */
    public static CXString clang_getCompletionBriefComment(@NativeType("CXCompletionString") long completion_string, CXString __result) {
        nclang_getCompletionBriefComment(completion_string, __result.address());
        return __result;
    }

    // --- [ clang_getCursorCompletionString ] ---

    /** {@code CXCompletionString clang_getCursorCompletionString(CXCursor cursor)} */
    public static native long nclang_getCursorCompletionString(long cursor, long __functionAddress);

    /** {@code CXCompletionString clang_getCursorCompletionString(CXCursor cursor)} */
    public static long nclang_getCursorCompletionString(long cursor) {
        long __functionAddress = Functions.getCursorCompletionString;
        return nclang_getCursorCompletionString(cursor, __functionAddress);
    }

    /** {@code CXCompletionString clang_getCursorCompletionString(CXCursor cursor)} */
    @NativeType("CXCompletionString")
    public static long clang_getCursorCompletionString(CXCursor cursor) {
        return nclang_getCursorCompletionString(cursor.address());
    }

    // --- [ clang_getCompletionNumFixIts ] ---

    /** {@code unsigned clang_getCompletionNumFixIts(CXCodeCompleteResults * results, unsigned completion_index)} */
    public static int nclang_getCompletionNumFixIts(long results, int completion_index) {
        long __functionAddress = Functions.getCompletionNumFixIts;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePI(results, completion_index, __functionAddress);
    }

    /** {@code unsigned clang_getCompletionNumFixIts(CXCodeCompleteResults * results, unsigned completion_index)} */
    @NativeType("unsigned")
    public static int clang_getCompletionNumFixIts(@NativeType("CXCodeCompleteResults *") CXCodeCompleteResults results, @NativeType("unsigned") int completion_index) {
        return nclang_getCompletionNumFixIts(results.address(), completion_index);
    }

    // --- [ clang_getCompletionFixIt ] ---

    /** {@code CXString clang_getCompletionFixIt(CXCodeCompleteResults * results, unsigned completion_index, unsigned fixit_index, CXSourceRange * replacement_range)} */
    public static native void nclang_getCompletionFixIt(long results, int completion_index, int fixit_index, long replacement_range, long __functionAddress, long __result);

    /** {@code CXString clang_getCompletionFixIt(CXCodeCompleteResults * results, unsigned completion_index, unsigned fixit_index, CXSourceRange * replacement_range)} */
    public static void nclang_getCompletionFixIt(long results, int completion_index, int fixit_index, long replacement_range, long __result) {
        long __functionAddress = Functions.getCompletionFixIt;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_getCompletionFixIt(results, completion_index, fixit_index, replacement_range, __functionAddress, __result);
    }

    /** {@code CXString clang_getCompletionFixIt(CXCodeCompleteResults * results, unsigned completion_index, unsigned fixit_index, CXSourceRange * replacement_range)} */
    public static CXString clang_getCompletionFixIt(@NativeType("CXCodeCompleteResults *") CXCodeCompleteResults results, @NativeType("unsigned") int completion_index, @NativeType("unsigned") int fixit_index, @NativeType("CXSourceRange *") CXSourceRange replacement_range, CXString __result) {
        nclang_getCompletionFixIt(results.address(), completion_index, fixit_index, replacement_range.address(), __result.address());
        return __result;
    }

    // --- [ clang_defaultCodeCompleteOptions ] ---

    /** {@code unsigned clang_defaultCodeCompleteOptions(void)} */
    @NativeType("unsigned")
    public static int clang_defaultCodeCompleteOptions() {
        long __functionAddress = Functions.defaultCodeCompleteOptions;
        return invokeI(__functionAddress);
    }

    // --- [ clang_codeCompleteAt ] ---

    /** {@code CXCodeCompleteResults * clang_codeCompleteAt(CXTranslationUnit TU, char const * complete_filename, unsigned complete_line, unsigned complete_column, struct CXUnsavedFile * unsaved_files, unsigned num_unsaved_files, unsigned options)} */
    public static long nclang_codeCompleteAt(long TU, long complete_filename, int complete_line, int complete_column, long unsaved_files, int num_unsaved_files, int options) {
        long __functionAddress = Functions.codeCompleteAt;
        if (CHECKS) {
            check(TU);
        }
        return invokePPPP(TU, complete_filename, complete_line, complete_column, unsaved_files, num_unsaved_files, options, __functionAddress);
    }

    /** {@code CXCodeCompleteResults * clang_codeCompleteAt(CXTranslationUnit TU, char const * complete_filename, unsigned complete_line, unsigned complete_column, struct CXUnsavedFile * unsaved_files, unsigned num_unsaved_files, unsigned options)} */
    @NativeType("CXCodeCompleteResults *")
    public static @Nullable CXCodeCompleteResults clang_codeCompleteAt(@NativeType("CXTranslationUnit") long TU, @NativeType("char const *") ByteBuffer complete_filename, @NativeType("unsigned") int complete_line, @NativeType("unsigned") int complete_column, @NativeType("struct CXUnsavedFile *") CXUnsavedFile.@Nullable Buffer unsaved_files, @NativeType("unsigned") int options) {
        if (CHECKS) {
            checkNT1(complete_filename);
        }
        long __result = nclang_codeCompleteAt(TU, memAddress(complete_filename), complete_line, complete_column, memAddressSafe(unsaved_files), remainingSafe(unsaved_files), options);
        return CXCodeCompleteResults.createSafe(__result);
    }

    /** {@code CXCodeCompleteResults * clang_codeCompleteAt(CXTranslationUnit TU, char const * complete_filename, unsigned complete_line, unsigned complete_column, struct CXUnsavedFile * unsaved_files, unsigned num_unsaved_files, unsigned options)} */
    @NativeType("CXCodeCompleteResults *")
    public static @Nullable CXCodeCompleteResults clang_codeCompleteAt(@NativeType("CXTranslationUnit") long TU, @NativeType("char const *") CharSequence complete_filename, @NativeType("unsigned") int complete_line, @NativeType("unsigned") int complete_column, @NativeType("struct CXUnsavedFile *") CXUnsavedFile.@Nullable Buffer unsaved_files, @NativeType("unsigned") int options) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(complete_filename, true);
            long complete_filenameEncoded = stack.getPointerAddress();
            long __result = nclang_codeCompleteAt(TU, complete_filenameEncoded, complete_line, complete_column, memAddressSafe(unsaved_files), remainingSafe(unsaved_files), options);
            return CXCodeCompleteResults.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_sortCodeCompletionResults ] ---

    /** {@code void clang_sortCodeCompletionResults(CXCompletionResult * Results, unsigned NumResults)} */
    public static void nclang_sortCodeCompletionResults(long Results, int NumResults) {
        long __functionAddress = Functions.sortCodeCompletionResults;
        invokePV(Results, NumResults, __functionAddress);
    }

    /** {@code void clang_sortCodeCompletionResults(CXCompletionResult * Results, unsigned NumResults)} */
    public static void clang_sortCodeCompletionResults(@NativeType("CXCompletionResult *") CXCompletionResult.Buffer Results) {
        nclang_sortCodeCompletionResults(Results.address(), Results.remaining());
    }

    // --- [ clang_disposeCodeCompleteResults ] ---

    /** {@code void clang_disposeCodeCompleteResults(CXCodeCompleteResults * Results)} */
    public static void nclang_disposeCodeCompleteResults(long Results) {
        long __functionAddress = Functions.disposeCodeCompleteResults;
        invokePV(Results, __functionAddress);
    }

    /** {@code void clang_disposeCodeCompleteResults(CXCodeCompleteResults * Results)} */
    public static void clang_disposeCodeCompleteResults(@NativeType("CXCodeCompleteResults *") CXCodeCompleteResults Results) {
        nclang_disposeCodeCompleteResults(Results.address());
    }

    // --- [ clang_codeCompleteGetNumDiagnostics ] ---

    /** {@code unsigned clang_codeCompleteGetNumDiagnostics(CXCodeCompleteResults * Results)} */
    public static int nclang_codeCompleteGetNumDiagnostics(long Results) {
        long __functionAddress = Functions.codeCompleteGetNumDiagnostics;
        return invokePI(Results, __functionAddress);
    }

    /** {@code unsigned clang_codeCompleteGetNumDiagnostics(CXCodeCompleteResults * Results)} */
    @NativeType("unsigned")
    public static int clang_codeCompleteGetNumDiagnostics(@NativeType("CXCodeCompleteResults *") CXCodeCompleteResults Results) {
        return nclang_codeCompleteGetNumDiagnostics(Results.address());
    }

    // --- [ clang_codeCompleteGetDiagnostic ] ---

    /** {@code CXDiagnostic clang_codeCompleteGetDiagnostic(CXCodeCompleteResults * Results, unsigned Index)} */
    public static long nclang_codeCompleteGetDiagnostic(long Results, int Index) {
        long __functionAddress = Functions.codeCompleteGetDiagnostic;
        return invokePP(Results, Index, __functionAddress);
    }

    /** {@code CXDiagnostic clang_codeCompleteGetDiagnostic(CXCodeCompleteResults * Results, unsigned Index)} */
    @NativeType("CXDiagnostic")
    public static long clang_codeCompleteGetDiagnostic(@NativeType("CXCodeCompleteResults *") CXCodeCompleteResults Results, @NativeType("unsigned") int Index) {
        return nclang_codeCompleteGetDiagnostic(Results.address(), Index);
    }

    // --- [ clang_codeCompleteGetContexts ] ---

    /** {@code unsigned long long clang_codeCompleteGetContexts(CXCodeCompleteResults * Results)} */
    public static long nclang_codeCompleteGetContexts(long Results) {
        long __functionAddress = Functions.codeCompleteGetContexts;
        return invokePJ(Results, __functionAddress);
    }

    /** {@code unsigned long long clang_codeCompleteGetContexts(CXCodeCompleteResults * Results)} */
    @NativeType("unsigned long long")
    public static long clang_codeCompleteGetContexts(@NativeType("CXCodeCompleteResults *") CXCodeCompleteResults Results) {
        return nclang_codeCompleteGetContexts(Results.address());
    }

    // --- [ clang_codeCompleteGetContainerKind ] ---

    /** {@code enum CXCursorKind clang_codeCompleteGetContainerKind(CXCodeCompleteResults * Results, unsigned * IsIncomplete)} */
    public static int nclang_codeCompleteGetContainerKind(long Results, long IsIncomplete) {
        long __functionAddress = Functions.codeCompleteGetContainerKind;
        return invokePPI(Results, IsIncomplete, __functionAddress);
    }

    /** {@code enum CXCursorKind clang_codeCompleteGetContainerKind(CXCodeCompleteResults * Results, unsigned * IsIncomplete)} */
    @NativeType("enum CXCursorKind")
    public static int clang_codeCompleteGetContainerKind(@NativeType("CXCodeCompleteResults *") CXCodeCompleteResults Results, @NativeType("unsigned *") IntBuffer IsIncomplete) {
        if (CHECKS) {
            check(IsIncomplete, 1);
        }
        return nclang_codeCompleteGetContainerKind(Results.address(), memAddress(IsIncomplete));
    }

    // --- [ clang_codeCompleteGetContainerUSR ] ---

    /** {@code CXString clang_codeCompleteGetContainerUSR(CXCodeCompleteResults * Results)} */
    public static native void nclang_codeCompleteGetContainerUSR(long Results, long __functionAddress, long __result);

    /** {@code CXString clang_codeCompleteGetContainerUSR(CXCodeCompleteResults * Results)} */
    public static void nclang_codeCompleteGetContainerUSR(long Results, long __result) {
        long __functionAddress = Functions.codeCompleteGetContainerUSR;
        nclang_codeCompleteGetContainerUSR(Results, __functionAddress, __result);
    }

    /** {@code CXString clang_codeCompleteGetContainerUSR(CXCodeCompleteResults * Results)} */
    public static CXString clang_codeCompleteGetContainerUSR(@NativeType("CXCodeCompleteResults *") CXCodeCompleteResults Results, CXString __result) {
        nclang_codeCompleteGetContainerUSR(Results.address(), __result.address());
        return __result;
    }

    // --- [ clang_codeCompleteGetObjCSelector ] ---

    /** {@code CXString clang_codeCompleteGetObjCSelector(CXCodeCompleteResults * Results)} */
    public static native void nclang_codeCompleteGetObjCSelector(long Results, long __functionAddress, long __result);

    /** {@code CXString clang_codeCompleteGetObjCSelector(CXCodeCompleteResults * Results)} */
    public static void nclang_codeCompleteGetObjCSelector(long Results, long __result) {
        long __functionAddress = Functions.codeCompleteGetObjCSelector;
        nclang_codeCompleteGetObjCSelector(Results, __functionAddress, __result);
    }

    /** {@code CXString clang_codeCompleteGetObjCSelector(CXCodeCompleteResults * Results)} */
    public static CXString clang_codeCompleteGetObjCSelector(@NativeType("CXCodeCompleteResults *") CXCodeCompleteResults Results, CXString __result) {
        nclang_codeCompleteGetObjCSelector(Results.address(), __result.address());
        return __result;
    }

    // --- [ clang_getClangVersion ] ---

    /** {@code CXString clang_getClangVersion(void)} */
    public static native void nclang_getClangVersion(long __functionAddress, long __result);

    /** {@code CXString clang_getClangVersion(void)} */
    public static void nclang_getClangVersion(long __result) {
        long __functionAddress = Functions.getClangVersion;
        nclang_getClangVersion(__functionAddress, __result);
    }

    /** {@code CXString clang_getClangVersion(void)} */
    public static CXString clang_getClangVersion(CXString __result) {
        nclang_getClangVersion(__result.address());
        return __result;
    }

    // --- [ clang_toggleCrashRecovery ] ---

    /** {@code void clang_toggleCrashRecovery(unsigned isEnabled)} */
    public static void clang_toggleCrashRecovery(@NativeType("unsigned") boolean isEnabled) {
        long __functionAddress = Functions.toggleCrashRecovery;
        invokeV(isEnabled ? 1 : 0, __functionAddress);
    }

    // --- [ clang_getInclusions ] ---

    /** {@code void clang_getInclusions(CXTranslationUnit tu, void (*) (CXFile, CXSourceLocation *, unsigned, CXClientData) visitor, CXClientData client_data)} */
    public static void nclang_getInclusions(long tu, long visitor, long client_data) {
        long __functionAddress = Functions.getInclusions;
        if (CHECKS) {
            check(tu);
        }
        invokePPPV(tu, visitor, client_data, __functionAddress);
    }

    /** {@code void clang_getInclusions(CXTranslationUnit tu, void (*) (CXFile, CXSourceLocation *, unsigned, CXClientData) visitor, CXClientData client_data)} */
    public static void clang_getInclusions(@NativeType("CXTranslationUnit") long tu, @NativeType("void (*) (CXFile, CXSourceLocation *, unsigned, CXClientData)") CXInclusionVisitorI visitor, @NativeType("CXClientData") long client_data) {
        nclang_getInclusions(tu, visitor.address(), client_data);
    }

    // --- [ clang_Cursor_Evaluate ] ---

    /** {@code CXEvalResult clang_Cursor_Evaluate(CXCursor C)} */
    public static native long nclang_Cursor_Evaluate(long C, long __functionAddress);

    /** {@code CXEvalResult clang_Cursor_Evaluate(CXCursor C)} */
    public static long nclang_Cursor_Evaluate(long C) {
        long __functionAddress = Functions.Cursor_Evaluate;
        return nclang_Cursor_Evaluate(C, __functionAddress);
    }

    /** {@code CXEvalResult clang_Cursor_Evaluate(CXCursor C)} */
    @NativeType("CXEvalResult")
    public static long clang_Cursor_Evaluate(CXCursor C) {
        return nclang_Cursor_Evaluate(C.address());
    }

    // --- [ clang_EvalResult_getKind ] ---

    /** {@code CXEvalResultKind clang_EvalResult_getKind(CXEvalResult E)} */
    @NativeType("CXEvalResultKind")
    public static int clang_EvalResult_getKind(@NativeType("CXEvalResult") long E) {
        long __functionAddress = Functions.EvalResult_getKind;
        if (CHECKS) {
            check(E);
        }
        return invokePI(E, __functionAddress);
    }

    // --- [ clang_EvalResult_getAsInt ] ---

    /** {@code int clang_EvalResult_getAsInt(CXEvalResult E)} */
    public static int clang_EvalResult_getAsInt(@NativeType("CXEvalResult") long E) {
        long __functionAddress = Functions.EvalResult_getAsInt;
        if (CHECKS) {
            check(E);
        }
        return invokePI(E, __functionAddress);
    }

    // --- [ clang_EvalResult_getAsLongLong ] ---

    /** {@code long long clang_EvalResult_getAsLongLong(CXEvalResult E)} */
    @NativeType("long long")
    public static long clang_EvalResult_getAsLongLong(@NativeType("CXEvalResult") long E) {
        long __functionAddress = Functions.EvalResult_getAsLongLong;
        if (CHECKS) {
            check(E);
        }
        return invokePJ(E, __functionAddress);
    }

    // --- [ clang_EvalResult_isUnsignedInt ] ---

    /** {@code unsigned clang_EvalResult_isUnsignedInt(CXEvalResult E)} */
    @NativeType("unsigned")
    public static boolean clang_EvalResult_isUnsignedInt(@NativeType("CXEvalResult") long E) {
        long __functionAddress = Functions.EvalResult_isUnsignedInt;
        if (CHECKS) {
            check(E);
        }
        return invokePI(E, __functionAddress) != 0;
    }

    // --- [ clang_EvalResult_getAsUnsigned ] ---

    /** {@code unsigned long long clang_EvalResult_getAsUnsigned(CXEvalResult E)} */
    @NativeType("unsigned long long")
    public static long clang_EvalResult_getAsUnsigned(@NativeType("CXEvalResult") long E) {
        long __functionAddress = Functions.EvalResult_getAsUnsigned;
        if (CHECKS) {
            check(E);
        }
        return invokePJ(E, __functionAddress);
    }

    // --- [ clang_EvalResult_getAsDouble ] ---

    /** {@code double clang_EvalResult_getAsDouble(CXEvalResult E)} */
    public static double clang_EvalResult_getAsDouble(@NativeType("CXEvalResult") long E) {
        long __functionAddress = Functions.EvalResult_getAsDouble;
        if (CHECKS) {
            check(E);
        }
        return invokePD(E, __functionAddress);
    }

    // --- [ clang_EvalResult_getAsStr ] ---

    /** {@code char const * clang_EvalResult_getAsStr(CXEvalResult E)} */
    public static long nclang_EvalResult_getAsStr(long E) {
        long __functionAddress = Functions.EvalResult_getAsStr;
        if (CHECKS) {
            check(E);
        }
        return invokePP(E, __functionAddress);
    }

    /** {@code char const * clang_EvalResult_getAsStr(CXEvalResult E)} */
    @NativeType("char const *")
    public static @Nullable String clang_EvalResult_getAsStr(@NativeType("CXEvalResult") long E) {
        long __result = nclang_EvalResult_getAsStr(E);
        return memUTF8Safe(__result);
    }

    // --- [ clang_EvalResult_dispose ] ---

    /** {@code void clang_EvalResult_dispose(CXEvalResult E)} */
    public static void clang_EvalResult_dispose(@NativeType("CXEvalResult") long E) {
        long __functionAddress = Functions.EvalResult_dispose;
        if (CHECKS) {
            check(E);
        }
        invokePV(E, __functionAddress);
    }

    // --- [ clang_getRemappings ] ---

    /** {@code CXRemapping clang_getRemappings(char const * path)} */
    public static long nclang_getRemappings(long path) {
        long __functionAddress = Functions.getRemappings;
        return invokePP(path, __functionAddress);
    }

    /** {@code CXRemapping clang_getRemappings(char const * path)} */
    @NativeType("CXRemapping")
    public static long clang_getRemappings(@NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nclang_getRemappings(memAddress(path));
    }

    /** {@code CXRemapping clang_getRemappings(char const * path)} */
    @NativeType("CXRemapping")
    public static long clang_getRemappings(@NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nclang_getRemappings(pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_getRemappingsFromFileList ] ---

    /** {@code CXRemapping clang_getRemappingsFromFileList(char const ** filePaths, unsigned numFiles)} */
    public static long nclang_getRemappingsFromFileList(long filePaths, int numFiles) {
        long __functionAddress = Functions.getRemappingsFromFileList;
        return invokePP(filePaths, numFiles, __functionAddress);
    }

    /** {@code CXRemapping clang_getRemappingsFromFileList(char const ** filePaths, unsigned numFiles)} */
    @NativeType("CXRemapping")
    public static long clang_getRemappingsFromFileList(@NativeType("char const **") PointerBuffer filePaths) {
        return nclang_getRemappingsFromFileList(memAddress(filePaths), filePaths.remaining());
    }

    // --- [ clang_remap_getNumFiles ] ---

    /** {@code unsigned clang_remap_getNumFiles(CXRemapping Remapping)} */
    @NativeType("unsigned")
    public static int clang_remap_getNumFiles(@NativeType("CXRemapping") long Remapping) {
        long __functionAddress = Functions.remap_getNumFiles;
        if (CHECKS) {
            check(Remapping);
        }
        return invokePI(Remapping, __functionAddress);
    }

    // --- [ clang_remap_getFilenames ] ---

    /** {@code void clang_remap_getFilenames(CXRemapping Remapping, unsigned index, CXString * original, CXString * transformed)} */
    public static void nclang_remap_getFilenames(long Remapping, int index, long original, long transformed) {
        long __functionAddress = Functions.remap_getFilenames;
        if (CHECKS) {
            check(Remapping);
        }
        invokePPPV(Remapping, index, original, transformed, __functionAddress);
    }

    /** {@code void clang_remap_getFilenames(CXRemapping Remapping, unsigned index, CXString * original, CXString * transformed)} */
    public static void clang_remap_getFilenames(@NativeType("CXRemapping") long Remapping, @NativeType("unsigned") int index, @NativeType("CXString *") @Nullable CXString original, @NativeType("CXString *") @Nullable CXString transformed) {
        nclang_remap_getFilenames(Remapping, index, memAddressSafe(original), memAddressSafe(transformed));
    }

    // --- [ clang_remap_dispose ] ---

    /** {@code void clang_remap_dispose(CXRemapping Remapping)} */
    public static void clang_remap_dispose(@NativeType("CXRemapping") long Remapping) {
        long __functionAddress = Functions.remap_dispose;
        if (CHECKS) {
            check(Remapping);
        }
        invokePV(Remapping, __functionAddress);
    }

    // --- [ clang_findReferencesInFile ] ---

    /** {@code CXResult clang_findReferencesInFile(CXCursor cursor, CXFile file, CXCursorAndRangeVisitor visitor)} */
    public static native int nclang_findReferencesInFile(long cursor, long file, long visitor, long __functionAddress);

    /** {@code CXResult clang_findReferencesInFile(CXCursor cursor, CXFile file, CXCursorAndRangeVisitor visitor)} */
    public static int nclang_findReferencesInFile(long cursor, long file, long visitor) {
        long __functionAddress = Functions.findReferencesInFile;
        if (CHECKS) {
            check(file);
            CXCursorAndRangeVisitor.validate(visitor);
        }
        return nclang_findReferencesInFile(cursor, file, visitor, __functionAddress);
    }

    /** {@code CXResult clang_findReferencesInFile(CXCursor cursor, CXFile file, CXCursorAndRangeVisitor visitor)} */
    @NativeType("CXResult")
    public static int clang_findReferencesInFile(CXCursor cursor, @NativeType("CXFile") long file, CXCursorAndRangeVisitor visitor) {
        return nclang_findReferencesInFile(cursor.address(), file, visitor.address());
    }

    // --- [ clang_findIncludesInFile ] ---

    /** {@code CXResult clang_findIncludesInFile(CXTranslationUnit TU, CXFile file, CXCursorAndRangeVisitor visitor)} */
    public static native int nclang_findIncludesInFile(long TU, long file, long visitor, long __functionAddress);

    /** {@code CXResult clang_findIncludesInFile(CXTranslationUnit TU, CXFile file, CXCursorAndRangeVisitor visitor)} */
    public static int nclang_findIncludesInFile(long TU, long file, long visitor) {
        long __functionAddress = Functions.findIncludesInFile;
        if (CHECKS) {
            check(TU);
            check(file);
            CXCursorAndRangeVisitor.validate(visitor);
        }
        return nclang_findIncludesInFile(TU, file, visitor, __functionAddress);
    }

    /** {@code CXResult clang_findIncludesInFile(CXTranslationUnit TU, CXFile file, CXCursorAndRangeVisitor visitor)} */
    @NativeType("CXResult")
    public static int clang_findIncludesInFile(@NativeType("CXTranslationUnit") long TU, @NativeType("CXFile") long file, CXCursorAndRangeVisitor visitor) {
        return nclang_findIncludesInFile(TU, file, visitor.address());
    }

    // --- [ clang_index_isEntityObjCContainerKind ] ---

    /** {@code int clang_index_isEntityObjCContainerKind(CXIdxEntityKind kind)} */
    @NativeType("int")
    public static boolean clang_index_isEntityObjCContainerKind(@NativeType("CXIdxEntityKind") int kind) {
        long __functionAddress = Functions.index_isEntityObjCContainerKind;
        return invokeI(kind, __functionAddress) != 0;
    }

    // --- [ clang_index_getObjCContainerDeclInfo ] ---

    /** {@code CXIdxObjCContainerDeclInfo const * clang_index_getObjCContainerDeclInfo(CXIdxDeclInfo const * info)} */
    public static long nclang_index_getObjCContainerDeclInfo(long info) {
        long __functionAddress = Functions.index_getObjCContainerDeclInfo;
        return invokePP(info, __functionAddress);
    }

    /** {@code CXIdxObjCContainerDeclInfo const * clang_index_getObjCContainerDeclInfo(CXIdxDeclInfo const * info)} */
    @NativeType("CXIdxObjCContainerDeclInfo const *")
    public static @Nullable CXIdxObjCContainerDeclInfo clang_index_getObjCContainerDeclInfo(@NativeType("CXIdxDeclInfo const *") CXIdxDeclInfo info) {
        long __result = nclang_index_getObjCContainerDeclInfo(info.address());
        return CXIdxObjCContainerDeclInfo.createSafe(__result);
    }

    // --- [ clang_index_getObjCInterfaceDeclInfo ] ---

    /** {@code CXIdxObjCInterfaceDeclInfo const * clang_index_getObjCInterfaceDeclInfo(CXIdxDeclInfo const * info)} */
    public static long nclang_index_getObjCInterfaceDeclInfo(long info) {
        long __functionAddress = Functions.index_getObjCInterfaceDeclInfo;
        return invokePP(info, __functionAddress);
    }

    /** {@code CXIdxObjCInterfaceDeclInfo const * clang_index_getObjCInterfaceDeclInfo(CXIdxDeclInfo const * info)} */
    @NativeType("CXIdxObjCInterfaceDeclInfo const *")
    public static @Nullable CXIdxObjCInterfaceDeclInfo clang_index_getObjCInterfaceDeclInfo(@NativeType("CXIdxDeclInfo const *") CXIdxDeclInfo info) {
        long __result = nclang_index_getObjCInterfaceDeclInfo(info.address());
        return CXIdxObjCInterfaceDeclInfo.createSafe(__result);
    }

    // --- [ clang_index_getObjCCategoryDeclInfo ] ---

    /** {@code CXIdxObjCCategoryDeclInfo const * clang_index_getObjCCategoryDeclInfo(CXIdxDeclInfo const * info)} */
    public static long nclang_index_getObjCCategoryDeclInfo(long info) {
        long __functionAddress = Functions.index_getObjCCategoryDeclInfo;
        return invokePP(info, __functionAddress);
    }

    /** {@code CXIdxObjCCategoryDeclInfo const * clang_index_getObjCCategoryDeclInfo(CXIdxDeclInfo const * info)} */
    @NativeType("CXIdxObjCCategoryDeclInfo const *")
    public static @Nullable CXIdxObjCCategoryDeclInfo clang_index_getObjCCategoryDeclInfo(@NativeType("CXIdxDeclInfo const *") CXIdxDeclInfo info) {
        long __result = nclang_index_getObjCCategoryDeclInfo(info.address());
        return CXIdxObjCCategoryDeclInfo.createSafe(__result);
    }

    // --- [ clang_index_getObjCProtocolRefListInfo ] ---

    /** {@code CXIdxObjCProtocolRefListInfo const * clang_index_getObjCProtocolRefListInfo(CXIdxDeclInfo const * info)} */
    public static long nclang_index_getObjCProtocolRefListInfo(long info) {
        long __functionAddress = Functions.index_getObjCProtocolRefListInfo;
        return invokePP(info, __functionAddress);
    }

    /** {@code CXIdxObjCProtocolRefListInfo const * clang_index_getObjCProtocolRefListInfo(CXIdxDeclInfo const * info)} */
    @NativeType("CXIdxObjCProtocolRefListInfo const *")
    public static @Nullable CXIdxObjCProtocolRefListInfo clang_index_getObjCProtocolRefListInfo(@NativeType("CXIdxDeclInfo const *") CXIdxDeclInfo info) {
        long __result = nclang_index_getObjCProtocolRefListInfo(info.address());
        return CXIdxObjCProtocolRefListInfo.createSafe(__result);
    }

    // --- [ clang_index_getObjCPropertyDeclInfo ] ---

    /** {@code CXIdxObjCPropertyDeclInfo const * clang_index_getObjCPropertyDeclInfo(CXIdxDeclInfo const * info)} */
    public static long nclang_index_getObjCPropertyDeclInfo(long info) {
        long __functionAddress = Functions.index_getObjCPropertyDeclInfo;
        return invokePP(info, __functionAddress);
    }

    /** {@code CXIdxObjCPropertyDeclInfo const * clang_index_getObjCPropertyDeclInfo(CXIdxDeclInfo const * info)} */
    @NativeType("CXIdxObjCPropertyDeclInfo const *")
    public static @Nullable CXIdxObjCPropertyDeclInfo clang_index_getObjCPropertyDeclInfo(@NativeType("CXIdxDeclInfo const *") CXIdxDeclInfo info) {
        long __result = nclang_index_getObjCPropertyDeclInfo(info.address());
        return CXIdxObjCPropertyDeclInfo.createSafe(__result);
    }

    // --- [ clang_index_getIBOutletCollectionAttrInfo ] ---

    /** {@code CXIdxIBOutletCollectionAttrInfo const * clang_index_getIBOutletCollectionAttrInfo(CXIdxAttrInfo const * info)} */
    public static long nclang_index_getIBOutletCollectionAttrInfo(long info) {
        long __functionAddress = Functions.index_getIBOutletCollectionAttrInfo;
        return invokePP(info, __functionAddress);
    }

    /** {@code CXIdxIBOutletCollectionAttrInfo const * clang_index_getIBOutletCollectionAttrInfo(CXIdxAttrInfo const * info)} */
    @NativeType("CXIdxIBOutletCollectionAttrInfo const *")
    public static @Nullable CXIdxIBOutletCollectionAttrInfo clang_index_getIBOutletCollectionAttrInfo(@NativeType("CXIdxAttrInfo const *") CXIdxAttrInfo info) {
        long __result = nclang_index_getIBOutletCollectionAttrInfo(info.address());
        return CXIdxIBOutletCollectionAttrInfo.createSafe(__result);
    }

    // --- [ clang_index_getCXXClassDeclInfo ] ---

    /** {@code CXIdxCXXClassDeclInfo const * clang_index_getCXXClassDeclInfo(CXIdxDeclInfo const * info)} */
    public static long nclang_index_getCXXClassDeclInfo(long info) {
        long __functionAddress = Functions.index_getCXXClassDeclInfo;
        return invokePP(info, __functionAddress);
    }

    /** {@code CXIdxCXXClassDeclInfo const * clang_index_getCXXClassDeclInfo(CXIdxDeclInfo const * info)} */
    @NativeType("CXIdxCXXClassDeclInfo const *")
    public static @Nullable CXIdxCXXClassDeclInfo clang_index_getCXXClassDeclInfo(@NativeType("CXIdxDeclInfo const *") CXIdxDeclInfo info) {
        long __result = nclang_index_getCXXClassDeclInfo(info.address());
        return CXIdxCXXClassDeclInfo.createSafe(__result);
    }

    // --- [ clang_index_getClientContainer ] ---

    /** {@code CXIdxClientContainer clang_index_getClientContainer(CXIdxContainerInfo const * info)} */
    public static long nclang_index_getClientContainer(long info) {
        long __functionAddress = Functions.index_getClientContainer;
        return invokePP(info, __functionAddress);
    }

    /** {@code CXIdxClientContainer clang_index_getClientContainer(CXIdxContainerInfo const * info)} */
    @NativeType("CXIdxClientContainer")
    public static long clang_index_getClientContainer(@NativeType("CXIdxContainerInfo const *") CXIdxContainerInfo info) {
        return nclang_index_getClientContainer(info.address());
    }

    // --- [ clang_index_setClientContainer ] ---

    /** {@code void clang_index_setClientContainer(CXIdxContainerInfo const * info, CXIdxClientContainer container)} */
    public static void nclang_index_setClientContainer(long info, long container) {
        long __functionAddress = Functions.index_setClientContainer;
        if (CHECKS) {
            check(container);
        }
        invokePPV(info, container, __functionAddress);
    }

    /** {@code void clang_index_setClientContainer(CXIdxContainerInfo const * info, CXIdxClientContainer container)} */
    public static void clang_index_setClientContainer(@NativeType("CXIdxContainerInfo const *") CXIdxContainerInfo info, @NativeType("CXIdxClientContainer") long container) {
        nclang_index_setClientContainer(info.address(), container);
    }

    // --- [ clang_index_getClientEntity ] ---

    /** {@code CXIdxClientEntity clang_index_getClientEntity(CXIdxEntityInfo const * info)} */
    public static long nclang_index_getClientEntity(long info) {
        long __functionAddress = Functions.index_getClientEntity;
        return invokePP(info, __functionAddress);
    }

    /** {@code CXIdxClientEntity clang_index_getClientEntity(CXIdxEntityInfo const * info)} */
    @NativeType("CXIdxClientEntity")
    public static long clang_index_getClientEntity(@NativeType("CXIdxEntityInfo const *") CXIdxEntityInfo info) {
        return nclang_index_getClientEntity(info.address());
    }

    // --- [ clang_index_setClientEntity ] ---

    /** {@code void clang_index_setClientEntity(CXIdxEntityInfo const * info, CXIdxClientEntity entity)} */
    public static void nclang_index_setClientEntity(long info, long entity) {
        long __functionAddress = Functions.index_setClientEntity;
        if (CHECKS) {
            check(entity);
        }
        invokePPV(info, entity, __functionAddress);
    }

    /** {@code void clang_index_setClientEntity(CXIdxEntityInfo const * info, CXIdxClientEntity entity)} */
    public static void clang_index_setClientEntity(@NativeType("CXIdxEntityInfo const *") CXIdxEntityInfo info, @NativeType("CXIdxClientEntity") long entity) {
        nclang_index_setClientEntity(info.address(), entity);
    }

    // --- [ clang_IndexAction_create ] ---

    /** {@code CXIndexAction clang_IndexAction_create(CXIndex CIdx)} */
    @NativeType("CXIndexAction")
    public static long clang_IndexAction_create(@NativeType("CXIndex") long CIdx) {
        long __functionAddress = Functions.IndexAction_create;
        if (CHECKS) {
            check(CIdx);
        }
        return invokePP(CIdx, __functionAddress);
    }

    // --- [ clang_IndexAction_dispose ] ---

    /** {@code void clang_IndexAction_dispose(CXIndexAction action)} */
    public static void clang_IndexAction_dispose(@NativeType("CXIndexAction") long action) {
        long __functionAddress = Functions.IndexAction_dispose;
        if (CHECKS) {
            check(action);
        }
        invokePV(action, __functionAddress);
    }

    // --- [ clang_indexSourceFile ] ---

    /** {@code int clang_indexSourceFile(CXIndexAction action, CXClientData client_data, IndexerCallbacks * index_callbacks, unsigned index_callbacks_size, unsigned index_options, char const * source_filename, char const * const * command_line_args, int num_command_line_args, struct CXUnsavedFile * unsaved_files, unsigned num_unsaved_files, CXTranslationUnit * out_TU, unsigned TU_options)} */
    public static int nclang_indexSourceFile(long action, long client_data, long index_callbacks, int index_callbacks_size, int index_options, long source_filename, long command_line_args, int num_command_line_args, long unsaved_files, int num_unsaved_files, long out_TU, int TU_options) {
        long __functionAddress = Functions.indexSourceFile;
        if (CHECKS) {
            check(action);
        }
        return invokePPPPPPPI(action, client_data, index_callbacks, index_callbacks_size, index_options, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, out_TU, TU_options, __functionAddress);
    }

    /** {@code int clang_indexSourceFile(CXIndexAction action, CXClientData client_data, IndexerCallbacks * index_callbacks, unsigned index_callbacks_size, unsigned index_options, char const * source_filename, char const * const * command_line_args, int num_command_line_args, struct CXUnsavedFile * unsaved_files, unsigned num_unsaved_files, CXTranslationUnit * out_TU, unsigned TU_options)} */
    public static int clang_indexSourceFile(@NativeType("CXIndexAction") long action, @NativeType("CXClientData") long client_data, @NativeType("IndexerCallbacks *") IndexerCallbacks index_callbacks, @NativeType("unsigned") int index_callbacks_size, @NativeType("unsigned") int index_options, @NativeType("char const *") ByteBuffer source_filename, @NativeType("char const * const *") @Nullable PointerBuffer command_line_args, @NativeType("struct CXUnsavedFile *") CXUnsavedFile.@Nullable Buffer unsaved_files, @NativeType("CXTranslationUnit *") @Nullable PointerBuffer out_TU, @NativeType("unsigned") int TU_options) {
        if (CHECKS) {
            checkNT1(source_filename);
            checkSafe(out_TU, 1);
        }
        return nclang_indexSourceFile(action, client_data, index_callbacks.address(), index_callbacks_size, index_options, memAddress(source_filename), memAddressSafe(command_line_args), remainingSafe(command_line_args), memAddressSafe(unsaved_files), remainingSafe(unsaved_files), memAddressSafe(out_TU), TU_options);
    }

    /** {@code int clang_indexSourceFile(CXIndexAction action, CXClientData client_data, IndexerCallbacks * index_callbacks, unsigned index_callbacks_size, unsigned index_options, char const * source_filename, char const * const * command_line_args, int num_command_line_args, struct CXUnsavedFile * unsaved_files, unsigned num_unsaved_files, CXTranslationUnit * out_TU, unsigned TU_options)} */
    public static int clang_indexSourceFile(@NativeType("CXIndexAction") long action, @NativeType("CXClientData") long client_data, @NativeType("IndexerCallbacks *") IndexerCallbacks index_callbacks, @NativeType("unsigned") int index_callbacks_size, @NativeType("unsigned") int index_options, @NativeType("char const *") CharSequence source_filename, @NativeType("char const * const *") @Nullable PointerBuffer command_line_args, @NativeType("struct CXUnsavedFile *") CXUnsavedFile.@Nullable Buffer unsaved_files, @NativeType("CXTranslationUnit *") @Nullable PointerBuffer out_TU, @NativeType("unsigned") int TU_options) {
        if (CHECKS) {
            checkSafe(out_TU, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(source_filename, true);
            long source_filenameEncoded = stack.getPointerAddress();
            return nclang_indexSourceFile(action, client_data, index_callbacks.address(), index_callbacks_size, index_options, source_filenameEncoded, memAddressSafe(command_line_args), remainingSafe(command_line_args), memAddressSafe(unsaved_files), remainingSafe(unsaved_files), memAddressSafe(out_TU), TU_options);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_indexSourceFileFullArgv ] ---

    /** {@code int clang_indexSourceFileFullArgv(CXIndexAction action, CXClientData client_data, IndexerCallbacks * index_callbacks, unsigned index_callbacks_size, unsigned index_options, char const * source_filename, char const * const * command_line_args, int num_command_line_args, struct CXUnsavedFile * unsaved_files, unsigned num_unsaved_files, CXTranslationUnit * out_TU, unsigned TU_options)} */
    public static int nclang_indexSourceFileFullArgv(long action, long client_data, long index_callbacks, int index_callbacks_size, int index_options, long source_filename, long command_line_args, int num_command_line_args, long unsaved_files, int num_unsaved_files, long out_TU, int TU_options) {
        long __functionAddress = Functions.indexSourceFileFullArgv;
        if (CHECKS) {
            check(action);
        }
        return invokePPPPPPPI(action, client_data, index_callbacks, index_callbacks_size, index_options, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, out_TU, TU_options, __functionAddress);
    }

    /** {@code int clang_indexSourceFileFullArgv(CXIndexAction action, CXClientData client_data, IndexerCallbacks * index_callbacks, unsigned index_callbacks_size, unsigned index_options, char const * source_filename, char const * const * command_line_args, int num_command_line_args, struct CXUnsavedFile * unsaved_files, unsigned num_unsaved_files, CXTranslationUnit * out_TU, unsigned TU_options)} */
    public static int clang_indexSourceFileFullArgv(@NativeType("CXIndexAction") long action, @NativeType("CXClientData") long client_data, @NativeType("IndexerCallbacks *") IndexerCallbacks index_callbacks, @NativeType("unsigned") int index_callbacks_size, @NativeType("unsigned") int index_options, @NativeType("char const *") ByteBuffer source_filename, @NativeType("char const * const *") PointerBuffer command_line_args, @NativeType("struct CXUnsavedFile *") CXUnsavedFile.@Nullable Buffer unsaved_files, @NativeType("CXTranslationUnit *") @Nullable PointerBuffer out_TU, @NativeType("unsigned") int TU_options) {
        if (CHECKS) {
            checkNT1(source_filename);
            checkSafe(out_TU, 1);
        }
        return nclang_indexSourceFileFullArgv(action, client_data, index_callbacks.address(), index_callbacks_size, index_options, memAddress(source_filename), memAddress(command_line_args), command_line_args.remaining(), memAddressSafe(unsaved_files), remainingSafe(unsaved_files), memAddressSafe(out_TU), TU_options);
    }

    /** {@code int clang_indexSourceFileFullArgv(CXIndexAction action, CXClientData client_data, IndexerCallbacks * index_callbacks, unsigned index_callbacks_size, unsigned index_options, char const * source_filename, char const * const * command_line_args, int num_command_line_args, struct CXUnsavedFile * unsaved_files, unsigned num_unsaved_files, CXTranslationUnit * out_TU, unsigned TU_options)} */
    public static int clang_indexSourceFileFullArgv(@NativeType("CXIndexAction") long action, @NativeType("CXClientData") long client_data, @NativeType("IndexerCallbacks *") IndexerCallbacks index_callbacks, @NativeType("unsigned") int index_callbacks_size, @NativeType("unsigned") int index_options, @NativeType("char const *") CharSequence source_filename, @NativeType("char const * const *") PointerBuffer command_line_args, @NativeType("struct CXUnsavedFile *") CXUnsavedFile.@Nullable Buffer unsaved_files, @NativeType("CXTranslationUnit *") @Nullable PointerBuffer out_TU, @NativeType("unsigned") int TU_options) {
        if (CHECKS) {
            checkSafe(out_TU, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(source_filename, true);
            long source_filenameEncoded = stack.getPointerAddress();
            return nclang_indexSourceFileFullArgv(action, client_data, index_callbacks.address(), index_callbacks_size, index_options, source_filenameEncoded, memAddress(command_line_args), command_line_args.remaining(), memAddressSafe(unsaved_files), remainingSafe(unsaved_files), memAddressSafe(out_TU), TU_options);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_indexTranslationUnit ] ---

    /** {@code int clang_indexTranslationUnit(CXIndexAction action, CXClientData client_data, IndexerCallbacks * index_callbacks, unsigned index_callbacks_size, unsigned index_options, CXTranslationUnit TU)} */
    public static int nclang_indexTranslationUnit(long action, long client_data, long index_callbacks, int index_callbacks_size, int index_options, long TU) {
        long __functionAddress = Functions.indexTranslationUnit;
        if (CHECKS) {
            check(action);
            check(TU);
        }
        return invokePPPPI(action, client_data, index_callbacks, index_callbacks_size, index_options, TU, __functionAddress);
    }

    /** {@code int clang_indexTranslationUnit(CXIndexAction action, CXClientData client_data, IndexerCallbacks * index_callbacks, unsigned index_callbacks_size, unsigned index_options, CXTranslationUnit TU)} */
    @NativeType("int")
    public static boolean clang_indexTranslationUnit(@NativeType("CXIndexAction") long action, @NativeType("CXClientData") long client_data, @NativeType("IndexerCallbacks *") IndexerCallbacks index_callbacks, @NativeType("unsigned") int index_callbacks_size, @NativeType("unsigned") int index_options, @NativeType("CXTranslationUnit") long TU) {
        return nclang_indexTranslationUnit(action, client_data, index_callbacks.address(), index_callbacks_size, index_options, TU) != 0;
    }

    // --- [ clang_indexLoc_getFileLocation ] ---

    /** {@code void clang_indexLoc_getFileLocation(CXIdxLoc loc, CXIdxClientFile * indexFile, CXFile * file, unsigned * line, unsigned * column, unsigned * offset)} */
    public static native void nclang_indexLoc_getFileLocation(long loc, long indexFile, long file, long line, long column, long offset, long __functionAddress);

    /** {@code void clang_indexLoc_getFileLocation(CXIdxLoc loc, CXIdxClientFile * indexFile, CXFile * file, unsigned * line, unsigned * column, unsigned * offset)} */
    public static void nclang_indexLoc_getFileLocation(long loc, long indexFile, long file, long line, long column, long offset) {
        long __functionAddress = Functions.indexLoc_getFileLocation;
        nclang_indexLoc_getFileLocation(loc, indexFile, file, line, column, offset, __functionAddress);
    }

    /** {@code void clang_indexLoc_getFileLocation(CXIdxLoc loc, CXIdxClientFile * indexFile, CXFile * file, unsigned * line, unsigned * column, unsigned * offset)} */
    public static void clang_indexLoc_getFileLocation(CXIdxLoc loc, @NativeType("CXIdxClientFile *") @Nullable PointerBuffer indexFile, @NativeType("CXFile *") @Nullable PointerBuffer file, @NativeType("unsigned *") @Nullable IntBuffer line, @NativeType("unsigned *") @Nullable IntBuffer column, @NativeType("unsigned *") @Nullable IntBuffer offset) {
        if (CHECKS) {
            checkSafe(indexFile, 1);
            checkSafe(file, 1);
            checkSafe(line, 1);
            checkSafe(column, 1);
            checkSafe(offset, 1);
        }
        nclang_indexLoc_getFileLocation(loc.address(), memAddressSafe(indexFile), memAddressSafe(file), memAddressSafe(line), memAddressSafe(column), memAddressSafe(offset));
    }

    // --- [ clang_indexLoc_getCXSourceLocation ] ---

    /** {@code CXSourceLocation clang_indexLoc_getCXSourceLocation(CXIdxLoc loc)} */
    public static native void nclang_indexLoc_getCXSourceLocation(long loc, long __functionAddress, long __result);

    /** {@code CXSourceLocation clang_indexLoc_getCXSourceLocation(CXIdxLoc loc)} */
    public static void nclang_indexLoc_getCXSourceLocation(long loc, long __result) {
        long __functionAddress = Functions.indexLoc_getCXSourceLocation;
        nclang_indexLoc_getCXSourceLocation(loc, __functionAddress, __result);
    }

    /** {@code CXSourceLocation clang_indexLoc_getCXSourceLocation(CXIdxLoc loc)} */
    public static CXSourceLocation clang_indexLoc_getCXSourceLocation(CXIdxLoc loc, CXSourceLocation __result) {
        nclang_indexLoc_getCXSourceLocation(loc.address(), __result.address());
        return __result;
    }

    // --- [ clang_Type_visitFields ] ---

    /** {@code unsigned clang_Type_visitFields(CXType T, enum CXVisitorResult (*) (CXCursor, CXClientData) visitor, CXClientData client_data)} */
    public static native int nclang_Type_visitFields(long T, long visitor, long client_data, long __functionAddress);

    /** {@code unsigned clang_Type_visitFields(CXType T, enum CXVisitorResult (*) (CXCursor, CXClientData) visitor, CXClientData client_data)} */
    public static int nclang_Type_visitFields(long T, long visitor, long client_data) {
        long __functionAddress = Functions.Type_visitFields;
        return nclang_Type_visitFields(T, visitor, client_data, __functionAddress);
    }

    /** {@code unsigned clang_Type_visitFields(CXType T, enum CXVisitorResult (*) (CXCursor, CXClientData) visitor, CXClientData client_data)} */
    @NativeType("unsigned")
    public static boolean clang_Type_visitFields(CXType T, @NativeType("enum CXVisitorResult (*) (CXCursor, CXClientData)") CXFieldVisitorI visitor, @NativeType("CXClientData") long client_data) {
        return nclang_Type_visitFields(T.address(), visitor.address(), client_data) != 0;
    }

    // --- [ clang_visitCXXBaseClasses ] ---

    /** {@code unsigned clang_visitCXXBaseClasses(CXType T, enum CXVisitorResult (*) (CXCursor, CXClientData) visitor, CXClientData client_data)} */
    public static native int nclang_visitCXXBaseClasses(long T, long visitor, long client_data, long __functionAddress);

    /** {@code unsigned clang_visitCXXBaseClasses(CXType T, enum CXVisitorResult (*) (CXCursor, CXClientData) visitor, CXClientData client_data)} */
    public static int nclang_visitCXXBaseClasses(long T, long visitor, long client_data) {
        long __functionAddress = Functions.visitCXXBaseClasses;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_visitCXXBaseClasses(T, visitor, client_data, __functionAddress);
    }

    /** {@code unsigned clang_visitCXXBaseClasses(CXType T, enum CXVisitorResult (*) (CXCursor, CXClientData) visitor, CXClientData client_data)} */
    @NativeType("unsigned")
    public static boolean clang_visitCXXBaseClasses(CXType T, @NativeType("enum CXVisitorResult (*) (CXCursor, CXClientData)") CXFieldVisitorI visitor, @NativeType("CXClientData") long client_data) {
        return nclang_visitCXXBaseClasses(T.address(), visitor.address(), client_data) != 0;
    }

    // --- [ clang_getBinaryOperatorKindSpelling ] ---

    /** {@code CXString clang_getBinaryOperatorKindSpelling(enum CXBinaryOperatorKind kind)} */
    public static native void nclang_getBinaryOperatorKindSpelling(int kind, long __functionAddress, long __result);

    /** {@code CXString clang_getBinaryOperatorKindSpelling(enum CXBinaryOperatorKind kind)} */
    public static void nclang_getBinaryOperatorKindSpelling(int kind, long __result) {
        long __functionAddress = Functions.getBinaryOperatorKindSpelling;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_getBinaryOperatorKindSpelling(kind, __functionAddress, __result);
    }

    /** {@code CXString clang_getBinaryOperatorKindSpelling(enum CXBinaryOperatorKind kind)} */
    public static CXString clang_getBinaryOperatorKindSpelling(@NativeType("enum CXBinaryOperatorKind") int kind, CXString __result) {
        nclang_getBinaryOperatorKindSpelling(kind, __result.address());
        return __result;
    }

    // --- [ clang_getCursorBinaryOperatorKind ] ---

    /** {@code enum CXBinaryOperatorKind clang_getCursorBinaryOperatorKind(CXCursor cursor)} */
    public static native int nclang_getCursorBinaryOperatorKind(long cursor, long __functionAddress);

    /** {@code enum CXBinaryOperatorKind clang_getCursorBinaryOperatorKind(CXCursor cursor)} */
    public static int nclang_getCursorBinaryOperatorKind(long cursor) {
        long __functionAddress = Functions.getCursorBinaryOperatorKind;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_getCursorBinaryOperatorKind(cursor, __functionAddress);
    }

    /** {@code enum CXBinaryOperatorKind clang_getCursorBinaryOperatorKind(CXCursor cursor)} */
    @NativeType("enum CXBinaryOperatorKind")
    public static int clang_getCursorBinaryOperatorKind(CXCursor cursor) {
        return nclang_getCursorBinaryOperatorKind(cursor.address());
    }

    // --- [ clang_getUnaryOperatorKindSpelling ] ---

    /** {@code CXString clang_getUnaryOperatorKindSpelling(enum CXUnaryOperatorKind kind)} */
    public static native void nclang_getUnaryOperatorKindSpelling(int kind, long __functionAddress, long __result);

    /** {@code CXString clang_getUnaryOperatorKindSpelling(enum CXUnaryOperatorKind kind)} */
    public static void nclang_getUnaryOperatorKindSpelling(int kind, long __result) {
        long __functionAddress = Functions.getUnaryOperatorKindSpelling;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_getUnaryOperatorKindSpelling(kind, __functionAddress, __result);
    }

    /** {@code CXString clang_getUnaryOperatorKindSpelling(enum CXUnaryOperatorKind kind)} */
    public static CXString clang_getUnaryOperatorKindSpelling(@NativeType("enum CXUnaryOperatorKind") int kind, CXString __result) {
        nclang_getUnaryOperatorKindSpelling(kind, __result.address());
        return __result;
    }

    // --- [ clang_getCursorUnaryOperatorKind ] ---

    /** {@code enum CXUnaryOperatorKind clang_getCursorUnaryOperatorKind(CXCursor cursor)} */
    public static native int nclang_getCursorUnaryOperatorKind(long cursor, long __functionAddress);

    /** {@code enum CXUnaryOperatorKind clang_getCursorUnaryOperatorKind(CXCursor cursor)} */
    public static int nclang_getCursorUnaryOperatorKind(long cursor) {
        long __functionAddress = Functions.getCursorUnaryOperatorKind;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nclang_getCursorUnaryOperatorKind(cursor, __functionAddress);
    }

    /** {@code enum CXUnaryOperatorKind clang_getCursorUnaryOperatorKind(CXCursor cursor)} */
    @NativeType("enum CXUnaryOperatorKind")
    public static int clang_getCursorUnaryOperatorKind(CXCursor cursor) {
        return nclang_getCursorUnaryOperatorKind(cursor.address());
    }

}