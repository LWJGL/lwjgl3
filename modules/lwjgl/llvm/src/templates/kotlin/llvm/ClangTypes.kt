/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm

import org.lwjgl.generator.*

val CLANG_BINDING = simpleBinding(Module.LLVM, libraryName = "CLANG", libraryExpression = "Configuration.LLVM_CLANG_LIBRARY_NAME, \"clang\", \"libclang\"")
val CLANG_BINDING_DELEGATE = CLANG_BINDING.delegate("ClangIndex.getLibrary()")

val CXIndex = "CXIndex".handle
val CXFile = "CXFile".handle
val CXTranslationUnit = "CXTranslationUnit".handle
val CXDiagnostic = "CXDiagnostic".handle
val CXDiagnosticSet = "CXDiagnosticSet".handle
val CXTargetInfo = "CXTargetInfo".handle
val CXCursorSet = "CXCursorSet".handle
val CXClientData = "CXClientData".handle
val CXPrintingPolicy = "CXPrintingPolicy".handle
val CXModule = "CXModule".handle
val CXCompletionString = "CXCompletionString".handle
val CXEvalResult = "CXEvalResult".handle
val CXRemapping = "CXRemapping".handle
val CXIdxClientFile = "CXIdxClientFile".handle
val CXIdxClientEntity = "CXIdxClientEntity".handle
val CXIdxClientContainer = "CXIdxClientContainer".handle
val CXIdxClientASTFile = "CXIdxClientASTFile".handle
val CXIndexAction = "CXIndexAction".handle
val CXRewriter = "CXRewriter".handle

val time_t = IntegerType("time_t", PrimitiveMapping.LONG, unsigned = true) // TODO:

val CXLoadDiag_Error = "enum CXLoadDiag_Error".enumType
val CXDiagnosticSeverity = "enum CXDiagnosticSeverity".enumType
val CXErrorCode = "enum CXErrorCode".enumType
val CXTUResourceUsageKind = "enum CXTUResourceUsageKind".enumType
val CXCursorKind = "enum CXCursorKind".enumType
val CXLinkageKind = "enum CXLinkageKind".enumType
val CXVisibilityKind = "enum CXVisibilityKind".enumType
val CXAvailabilityKind = "enum CXAvailabilityKind".enumType
val CXLanguageKind = "enum CXLanguageKind".enumType
val CXTLSKind = "enum CXTLSKind".enumType
val CXTypeKind = "enum CXTypeKind".enumType
val CXTemplateArgumentKind = "enum CXTemplateArgumentKind".enumType
val CXCallingConv = "enum CXCallingConv".enumType
val CXTypeNullabilityKind = "enum CXTypeNullabilityKind".enumType
val CXTypeLayoutError = "enum CXTypeLayoutError".enumType
val CXRefQualifierKind = "enum CXRefQualifierKind".enumType
val CX_CXXAccessSpecifier = "enum CX_CXXAccessSpecifier".enumType
val CX_StorageClass = "enum CX_StorageClass".enumType
val CXChildVisitResult = "enum CXChildVisitResult".enumType
val CXPrintingPolicyProperty = "enum CXPrintingPolicyProperty".enumType
val CXNameRefFlags = "enum CXNameRefFlags".enumType
val CXTokenKind = "CXTokenKind".enumType
val CXCompletionChunkKind = "enum CXCompletionChunkKind".enumType
val CXEvalResultKind = "CXEvalResultKind".enumType
val CXVisitorResult = "enum CXVisitorResult".enumType
val CXResult = "CXResult".enumType
val CXIdxEntityKind = "CXIdxEntityKind".enumType
val CXIdxEntityLanguage = "CXIdxEntityLanguage".enumType
val CXIdxEntityCXXTemplateKind = "CXIdxEntityCXXTemplateKind".enumType
val CXIdxAttrKind = "CXIdxAttrKind".enumType
val CXIdxObjCContainerKind = "CXIdxObjCContainerKind".enumType
val CXIdxEntityRefKind = "CXIdxEntityRefKind".enumType
val CXSymbolRole = "CXSymbolRole".enumType
val CXIndexOptFlags = "CXIndexOptFlags".enumType
val CXBinaryOperatorKind = "enum CXBinaryOperatorKind".enumType
val CXUnaryOperatorKind = "enum CXUnaryOperatorKind".enumType
val CX_BinaryOperatorKind = "enum CX_BinaryOperatorKind".enumType

val CXString = struct(Module.LLVM, "CXString", mutable = false) {
    void.const.p("data")
    unsigned("private_flags")
}

val CXStringSet = struct(Module.LLVM, "CXStringSet", mutable = false) {
    CXString.p("Strings")
    AutoSize("Strings")..unsigned("Count")
}

val CXFileUniqueID = struct(Module.LLVM, "CXFileUniqueID", mutable = false) {
    unsigned_long_long("data")[3]
}

val CXSourceLocation = struct(Module.LLVM, "CXSourceLocation", mutable = false) {
    void.const.p("ptr_data")[2]
    unsigned("int_data")
}

val CXSourceRange = struct(Module.LLVM, "CXSourceRange", mutable = false) {
    void.const.p("ptr_data")[2]
    unsigned("begin_int_data")
    unsigned("end_int_data")
}

val CXSourceRangeList = struct(Module.LLVM, "CXSourceRangeList", mutable = false) {
    AutoSize("ranges")..unsigned("count")
    CXSourceRange.p("ranges")
}

val CXUnsavedFile = struct(Module.LLVM, "CXUnsavedFile", nativeName = "struct CXUnsavedFile") {
    charASCII.const.p("Filename")
    char.const.p("Contents")
    AutoSize("Contents")..unsigned_long("Length")
}

val CXVersion = struct(Module.LLVM, "CXVersion", mutable = false) {
    int("Major")
    int("Minor")
    int("Subminor")
}

val CXIndexOptions = struct(Module.LLVM, "CXIndexOptions") {
    Expression("SIZEOF")..unsigned("Size")
    unsigned_char("ThreadBackgroundPriorityForIndexing")
    unsigned_char("ThreadBackgroundPriorityForEditing")
    unsignedb("ExcludeDeclarationsFromPCH", bits = 1)
    unsignedb("DisplayDiagnostics", bits = 1)
    unsignedb("StorePreamblesInMemory", bits = 1)
    unsignedb("Reserved", bits = 13).private()
    nullable..charUTF8.const.p("PreambleStoragePath")
    nullable..charUTF8.const.p("InvocationEmissionPath")
}

val CXTUResourceUsageEntry = struct(Module.LLVM, "CXTUResourceUsageEntry", mutable = false) {
    CXTUResourceUsageKind("kind")
    unsigned_long("amount")
}

val CXTUResourceUsage = struct(Module.LLVM, "CXTUResourceUsage", mutable = false){
    opaque_p("data")
    AutoSize("entries")..unsigned("numEntries")
    CXTUResourceUsageEntry.p("entries")
}

val CXCursor = struct(Module.LLVM, "CXCursor", mutable = false) {
    CXCursorKind("kind")
    int("xdata")
    void.const.p("data")[3]
}

val CXPlatformAvailability = struct(Module.LLVM, "CXPlatformAvailability", mutable = false) {
    CXString("Platform")
    CXVersion("Introduced")
    CXVersion("Deprecated")
    CXVersion("Obsoleted")
    int("Unavailable")
    CXString("Message")
}

val CXType = struct(Module.LLVM, "CXType", mutable = false) {
    CXTypeKind("kind")
    void.p("data")[2]
}

val CXToken = struct(Module.LLVM, "CXToken", mutable = false) {
    unsigned("int_data")[4]
    opaque_p("ptr_data")
}

val CXCompletionResult = struct(Module.LLVM, "CXCompletionResult", mutable = false) {
    CXCursorKind("CursorKind")
    CXCompletionString("CompletionString")
}

val CXCodeCompleteResults = struct(Module.LLVM, "CXCodeCompleteResults", mutable = false) {
    CXCompletionResult.p("Results")
    AutoSize("Results")..unsigned("NumResults")
}

val CXCursorAndRangeVisitor = struct(Module.LLVM, "CXCursorAndRangeVisitor") {
    opaque_p("context")
    Module.LLVM.callback {
        CXVisitorResult(
            "CXCursorAndRangeVisit",

            opaque_p("context"),
            CXCursor("cursor"),
            CXSourceRange("range")
        ) {
        }
    }("visit")
}

val CXIdxLoc = struct(Module.LLVM, "CXIdxLoc", mutable = false) {
    void.p("ptr_data")[2]
    unsigned("int_data")
}

val CXIdxIncludedFileInfo = struct(Module.LLVM, "CXIdxIncludedFileInfo", mutable = false) {
    CXIdxLoc("hashLoc")
    charASCII.const.p("filename")
    CXFile("file")
    intb("isImport")
    intb("isAngled")
    intb("isModuleImport")
}

val CXIdxImportedASTFileInfo = struct(Module.LLVM, "CXIdxImportedASTFileInfo", mutable = false) {
    CXFile("file")
    nullable..CXModule("module")
    CXIdxLoc("loc")
    intb("isImplicit")
}

val CXIdxAttrInfo = struct(Module.LLVM, "CXIdxAttrInfo", mutable = false) {
    CXIdxAttrKind("kind")
    CXCursor("cursor")
    CXIdxLoc("loc")
}

val CXIdxEntityInfo = struct(Module.LLVM, "CXIdxEntityInfo", mutable = false) {
    CXIdxEntityKind("kind")
    CXIdxEntityCXXTemplateKind("templateKind")
    CXIdxEntityLanguage("lang")
    charUTF8.const.p("name")
    charUTF8.const.p("USR")
    CXCursor("cursor")
    CXIdxAttrInfo.const.p.const.p("attributes")
    AutoSize("attributes")..unsigned("numAttributes")
}

val CXIdxContainerInfo = struct(Module.LLVM, "CXIdxContainerInfo", mutable = false) {
    CXCursor("cursor")
}

val CXIdxIBOutletCollectionAttrInfo = struct(Module.LLVM, "CXIdxIBOutletCollectionAttrInfo", mutable = false) {
    CXIdxAttrInfo.const.p("attrInfo")
    CXIdxEntityInfo.const.p("objcClass")
    CXCursor("classCursor")
    CXIdxLoc("classLoc")
}

val CXIdxDeclInfo = struct(Module.LLVM, "CXIdxDeclInfo", mutable = false) {
    CXIdxEntityInfo.const.p("entityInfo")
    CXCursor("cursor")
    CXIdxLoc("loc")
    CXIdxContainerInfo.const.p("semanticContainer")
    CXIdxContainerInfo.const.p("lexicalContainer")
    intb("isRedeclaration")
    intb("isDefinition")
    intb("isContainer")
    CXIdxContainerInfo.const.p("declAsContainer")
    intb("isImplicit")
    CXIdxAttrInfo.const.p.const.p("attributes")
    AutoSize("attributes")..unsigned("numAttributes")
    unsigned("flags")
}

val CXIdxObjCContainerDeclInfo = struct(Module.LLVM, "CXIdxObjCContainerDeclInfo", mutable = false) {
    CXIdxDeclInfo.const.p("declInfo")
    CXIdxObjCContainerKind("kind")
}

val CXIdxBaseClassInfo = struct(Module.LLVM, "CXIdxBaseClassInfo", mutable = false) {
    CXIdxEntityInfo.const.p("base")
    CXCursor("cursor")
    CXIdxLoc("loc")
}

val CXIdxObjCProtocolRefInfo = struct(Module.LLVM, "CXIdxObjCProtocolRefInfo", mutable = false) {
    CXIdxEntityInfo.const.p("protocol")
    CXCursor("cursor")
    CXIdxLoc("loc")
}

val CXIdxObjCProtocolRefListInfo = struct(Module.LLVM, "CXIdxObjCProtocolRefListInfo", mutable = false) {
    CXIdxObjCProtocolRefInfo.const.p.const.p("protocols")
    AutoSize("protocols")..unsigned("numProtocols")
}

val CXIdxObjCInterfaceDeclInfo = struct(Module.LLVM, "CXIdxObjCInterfaceDeclInfo", mutable = false) {
    CXIdxObjCContainerDeclInfo.const.p("containerInfo")
    CXIdxBaseClassInfo.const.p("superInfo")
    CXIdxObjCProtocolRefListInfo.const.p("protocols")
}

val CXIdxObjCCategoryDeclInfo = struct(Module.LLVM, "CXIdxObjCCategoryDeclInfo", mutable = false) {
    CXIdxObjCContainerDeclInfo.const.p("containerInfo")
    CXIdxEntityInfo.const.p("objcClass")
    CXCursor("classCursor")
    CXIdxLoc("classLoc")
    CXIdxObjCProtocolRefListInfo.const.p("protocols")
}

val CXIdxObjCPropertyDeclInfo = struct(Module.LLVM, "CXIdxObjCPropertyDeclInfo", mutable = false) {
    CXIdxDeclInfo.const.p("declInfo")
    CXIdxEntityInfo.const.p("getter")
    CXIdxEntityInfo.const.p("setter")
}

val CXIdxCXXClassDeclInfo = struct(Module.LLVM, "CXIdxCXXClassDeclInfo", mutable = false) {
    CXIdxDeclInfo.const.p("declInfo")
    CXIdxBaseClassInfo.const.p.const.p("bases")
    AutoSize("bases")..unsigned("numBases")
}

val CXIdxEntityRefInfo = struct(Module.LLVM, "CXIdxEntityRefInfo", mutable = false) {
    CXIdxEntityRefKind("kind")
    CXCursor("cursor")
    CXIdxLoc("loc")
    CXIdxEntityInfo.const.p("referencedEntity")
    CXIdxEntityInfo.const.p("parentEntity")
    CXIdxContainerInfo.const.p("container")
    CXSymbolRole("role")
}

val IndexerCallbacks = struct(Module.LLVM, "IndexerCallbacks", mutable = false) {
    Module.LLVM.callback {
        intb(
            "IndexerAbortQuery",

            nullable..CXClientData("client_data"),
            nullable..void.p("reserved")
        ) {
        }
    }("abortQuery")
    Module.LLVM.callback {
        void(
            "IndexerDiagnostic",

            nullable..CXClientData("client_data"),
            CXDiagnosticSet("diagnosticSet"),
            nullable..void.p("reserved")
        ) {
        }
    }("diagnostic")
    Module.LLVM.callback {
        CXIdxClientFile(
            "IndexerEnteredMainFile",

            nullable..CXClientData("client_data"),
            CXFile("mainFile"),
            nullable..void.p("reserved")
        ) {
        }
    }("enteredMainFile")
    Module.LLVM.callback {
        CXIdxClientFile(
            "IndexerIncludedFile",

            nullable..CXClientData("client_data"),
            CXIdxIncludedFileInfo.const.p("info")
        ) {
        }
    }("ppIncludedFile")
    Module.LLVM.callback {
        CXIdxClientASTFile(
            "IndexerImportedASTFile",

            nullable..CXClientData("client_data"),
            CXIdxImportedASTFileInfo.const.p("info")
        ) {
        }
    }(
        "importedASTFile"
    )
    Module.LLVM.callback {
        CXIdxClientContainer(
            "IndexerStartedTranslationUnit",

            nullable..CXClientData("client_data"),
            nullable..void.p("reserved")
        ) {
        }
    }("startedTranslationUnit")
    Module.LLVM.callback {
        void(
            "IndexerIndexDeclaration",

            nullable..CXClientData("client_data"),
            CXIdxDeclInfo.const.p("info")
        ) {
        }
    }("indexDeclaration")
    Module.LLVM.callback {
        void(
            "IndexerIndexEntityReference",

            nullable..CXClientData("client_data"),
            CXIdxEntityRefInfo.const.p("info")
        ) {
        }
    }("indexEntityReference")
}

val CXCursorVisitor = Module.LLVM.callback {
    CXChildVisitResult(
        "CXCursorVisitor",

        CXCursor("cursor"),
        CXCursor("parent"),
        nullable..CXClientData("client_data")
    ) {
    }
}

val CXInclusionVisitor = Module.LLVM.callback {
    void(
        "CXInclusionVisitor",

        CXFile("included_file"),
        CXSourceLocation.p("inclusion_stack"),
        unsigned("include_len"),
        nullable..CXClientData("client_data")
    ) {
    }
}

val CXFieldVisitor = Module.LLVM.callback {
    CXVisitorResult(
        "CXFieldVisitor",

        CXCursor("C"),
        nullable..CXClientData("client_data")
    ) {
    }
}

val CXExecuteOnThread = Module.LLVM.callback {
    void(
        "CXExecuteOnThread",

        opaque_p("user_data")
    ) {
    }
}

// -------------
// Documentation
// -------------

val CXCommentKind = "enum CXCommentKind".enumType
val CXCommentInlineCommandRenderKind = "enum CXCommentInlineCommandRenderKind".enumType
val CXCommentParamPassDirection = "enum CXCommentParamPassDirection".enumType

val CXAPISet = "CXAPISet".handle

val CXComment = struct(Module.LLVM, "CXComment", mutable = false) {
    opaque_const_p("ASTNode")
    CXTranslationUnit("TranslationUnit")
}

// ------------
// Build System
// ------------

val CXCompilationDatabase = "CXCompilationDatabase".handle
val CXCompileCommands = "CXCompileCommands".handle
val CXCompileCommand = "CXCompileCommand".handle
val CXModuleMapDescriptor = "CXModuleMapDescriptor".handle
val CXVirtualFileOverlay = "CXVirtualFileOverlay".handle

val CXCompilationDatabase_Error = "CXCompilationDatabase_Error".enumType