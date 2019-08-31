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

val CXString = struct(Module.LLVM, "CXString", mutable = false) {
    documentation =
        """
        A character string.

        The {@code CXString} type is used to return strings from the interface when the ownership of that string might differ from one call to the next. Use
        #getCString() to retrieve the string data and, once finished with the string data, call #disposeString() to free the string.
        """

    void.const.p("data", "")
    unsigned("private_flags", "")
}

val CXStringSet = struct(Module.LLVM, "CXStringSet", mutable = false) {
    CXString.p("Strings", "")
    AutoSize("Strings")..unsigned("Count", "")
}

val CXFileUniqueID = struct(Module.LLVM, "CXFileUniqueID", mutable = false) {
    documentation = "Uniquely identifies a CXFile, that refers to the same underlying file, across an indexing session."

    unsigned_long_long("data", "")[3]
}

val CXSourceLocation = struct(Module.LLVM, "CXSourceLocation", mutable = false) {
    documentation =
        """
        Identifies a specific source location within a translation unit.

        Use #getExpansionLocation() or #getSpellingLocation() to map a source location to a particular file, line, and column.
        """

    void.const.p("ptr_data", "")[2]
    unsigned("int_data", "")
}

val CXSourceRange = struct(Module.LLVM, "CXSourceRange", mutable = false) {
    documentation =
        """
        Identifies a half-open character range in the source code.

        Use #getRangeStart() and #getRangeEnd() to retrieve the starting and end locations from a source range, respectively.
        """

    void.const.p("ptr_data", "")[2]
    unsigned("begin_int_data", "")
    unsigned("end_int_data", "")
}

val CXSourceRangeList = struct(Module.LLVM, "CXSourceRangeList", mutable = false) {
    documentation = "Identifies an array of ranges."

    AutoSize("ranges")..unsigned("count", "the number of ranges in the {@code ranges} array")
    CXSourceRange.p("ranges", "an array of {@code CXSourceRange}s.")
}

val CXUnsavedFile = struct(Module.LLVM, "CXUnsavedFile", nativeName = "struct CXUnsavedFile") {
    documentation =
        """
        Provides the contents of a file that has not yet been saved to disk.

        Each {@code CXUnsavedFile} instance provides the name of a file on the system along with the current contents of that file that have not yet been saved
        to disk.
        """

    charASCII.const.p(
        "Filename",
        """
        the file whose contents have not yet been saved.

        This file must already exist in the file system.
        """
    )
    char.const.p("Contents", "a buffer containing the unsaved contents of this file")
    AutoSize("Contents")..unsigned_long("Length", "the length of the unsaved contents of this buffer")
}

val CXVersion = struct(Module.LLVM, "CXVersion", mutable = false) {
    documentation = "Describes a version number of the form {@code major.minor.subminor}."

    int("Major", "the major version number, e.g., the '10' in '10.7.3'. A negative value indicates that there is no version number at all.")
    int(
        "Minor",
        "the minor version number, e.g., the '7' in '10.7.3'. This value will be negative if no minor version number was provided, e.g., for version '10'."
    )
    int(
        "Subminor",
        """
        the subminor version number, e.g., the '3' in '10.7.3'. This value will be negative if no minor or subminor version number was provided, e.g., in
        version '10' or '10.7'.
        """
    )
}

val CXTUResourceUsageEntry = struct(Module.LLVM, "CXTUResourceUsageEntry", mutable = false) {
    CXTUResourceUsageKind("kind", "the memory usage category")
    unsigned_long("amount", "amount of resources used. The units will depend on the resource kind.")
}

val CXTUResourceUsage = struct(Module.LLVM, "CXTUResourceUsage", mutable = false){
    documentation = "The memory usage of a CXTranslationUnit, broken into categories."

    opaque_p("data", "private data member, used for queries")
    AutoSize("entries")..unsigned("numEntries", "the number of entries in the {@code entries} array.")
    CXTUResourceUsageEntry.p("entries", "an array of key-value pairs, representing the breakdown of memory usage")
}

val CXCursor = struct(Module.LLVM, "CXCursor", mutable = false) {
    documentation =
        """
        A cursor representing some element in the abstract syntax tree for a translation unit.

        The cursor abstraction unifies the different kinds of entities in a program --declaration, statements, expressions, references to declarations, etc.--
        under a single "cursor" abstraction with a common set of operations. Common operation for a cursor include: getting the physical location in a source
        file where the cursor points, getting the name associated with a cursor, and retrieving cursors for any child nodes of a particular cursor.

        Cursors can be produced in two specific ways. #getTranslationUnitCursor() produces a cursor for a translation unit, from which one can use
        #visitChildren() to explore the rest of the translation unit. #getCursor() maps from a physical source location to the entity that resides at that
        location, allowing one to map from the source code into the AST.
        """

    CXCursorKind("kind", "")
    int("xdata", "")
    void.const.p("data", "")[3]
}

val CXPlatformAvailability = struct(Module.LLVM, "CXPlatformAvailability", mutable = false) {
    documentation =
        "Describes the availability of a given entity on a particular platform, e.g., a particular class might only be available on Mac OS 10.7 or newer."

    CXString(
        "Platform",
        """
        a string that describes the platform for which this structure provides availability information.

        Possible values are "ios" or "macos".
        """
    )
    CXVersion("Introduced", "the version number in which this entity was introduced")
    CXVersion("Deprecated", "the version number in which this entity was deprecated (but is still available)")
    CXVersion("Obsoleted", "the version number in which this entity was obsoleted, and therefore is no longer available")
    int("Unavailable", "whether the entity is unconditionally unavailable on this platform")
    CXString("Message", "an optional message to provide to a user of this API, e.g., to suggest replacement APIs")
}

val CXType = struct(Module.LLVM, "CXType", mutable = false) {
    documentation = "The type of an element in the abstract syntax tree."

    CXTypeKind("kind", "")
    void.p("data", "")[2]
}

val CXToken = struct(Module.LLVM, "CXToken", mutable = false) {
    documentation = "Describes a single preprocessing token."

    unsigned("int_data", "")[4]
    opaque_p("ptr_data", "")
}

val CXCompletionResult = struct(Module.LLVM, "CXCompletionResult", mutable = false) {
    documentation = "A single result of code completion."

    CXCursorKind(
        "CursorKind",
        """
        the kind of entity that this completion refers to.

        The cursor kind will be a macro, keyword, or a declaration (one of the {@code *Decl} cursor kinds), describing the entity that the completion is
        referring to.
        """
    )
    CXCompletionString("CompletionString", "the code-completion string that describes how to insert this code-completion result into the editing buffer")
}

val CXCodeCompleteResults = struct(Module.LLVM, "CXCodeCompleteResults", mutable = false) {
    documentation =
        """
        Contains the results of code-completion.

        This data structure contains the results of code completion, as produced by #codeCompleteAt(). Its contents must be freed by
        #disposeCodeCompleteResults().
        """

    CXCompletionResult.p("Results", "the code-completion results")
    AutoSize("Results")..unsigned("NumResults", "the number of code-completion results stored in the {@code Results} array")
}

val CXCursorAndRangeVisitor = struct(Module.LLVM, "CXCursorAndRangeVisitor") {
    UserDataMember("visit")..opaque_p("context", "")
    Module.LLVM.callback {
        CXVisitorResult(
            "CXCursorAndRangeVisit",
            "",

            UserData()..opaque_p("context", ""),
            CXCursor("cursor", ""),
            CXSourceRange("range", "")
        ) {
            nativeImport("clang-c/Index.h")
            documentation = "Instances of this interface may be set to the {@code visit} field of the ##CXCursorAndRangeVisitor struct."
        }
    }("visit", "")
}

val CXIdxLoc = struct(Module.LLVM, "CXIdxLoc", mutable = false) {
    documentation = "Source location passed to index callbacks."

    void.p("ptr_data", "")[2]
    unsigned("int_data", "")
}

val CXIdxIncludedFileInfo = struct(Module.LLVM, "CXIdxIncludedFileInfo", mutable = false) {
    documentation = "Data for {@code ppIncludedFile} callback."

    CXIdxLoc("hashLoc", "location of '\\#' in the {@code \\#include/\\#import} directive")
    charASCII.const.p("filename", "filename as written in the {@code \\#include/\\#import} directive")
    CXFile("file", "the actual file that the {@code \\#include/\\#import} directive resolved to")
    intb("isImport", "")
    intb("isAngled", "")
    intb("isModuleImport", "non-zero if the directive was automatically turned into a module import")
}

val CXIdxImportedASTFileInfo = struct(Module.LLVM, "CXIdxImportedASTFileInfo", mutable = false) {
    documentation = "Data for IndexerCallbacks\\#importedASTFile."

    CXFile("file", "top level AST file containing the imported PCH, module or submodule")
    nullable..CXModule("module", "the imported module or #NULL if the AST file is a PCH")
    CXIdxLoc("loc", "location where the file is imported. Applicable only for modules")
    intb("isImplicit", "non-zero if an inclusion directive was automatically turned into a module import. Applicable only for modules")
}

val CXIdxAttrInfo = struct(Module.LLVM, "CXIdxAttrInfo", mutable = false) {
    CXIdxAttrKind("kind", "")
    CXCursor("cursor", "")
    CXIdxLoc("loc", "")
}

val CXIdxEntityInfo = struct(Module.LLVM, "CXIdxEntityInfo", mutable = false) {
    CXIdxEntityKind("kind", "")
    CXIdxEntityCXXTemplateKind("templateKind", "")
    CXIdxEntityLanguage("lang", "")
    charUTF8.const.p("name", "")
    charUTF8.const.p("USR", "")
    CXCursor("cursor", "")
    CXIdxAttrInfo.const.p.const.p("attributes", "")
    AutoSize("attributes")..unsigned("numAttributes", "")
}

val CXIdxContainerInfo = struct(Module.LLVM, "CXIdxContainerInfo", mutable = false) {
    CXCursor("cursor", "")
}

val CXIdxIBOutletCollectionAttrInfo = struct(Module.LLVM, "CXIdxIBOutletCollectionAttrInfo", mutable = false) {
    CXIdxAttrInfo.const.p("attrInfo", "")
    CXIdxEntityInfo.const.p("objcClass", "")
    CXCursor("classCursor", "")
    CXIdxLoc("classLoc", "")
}

val CXIdxDeclInfo = struct(Module.LLVM, "CXIdxDeclInfo", mutable = false) {
    CXIdxEntityInfo.const.p("entityInfo", "")
    CXCursor("cursor", "")
    CXIdxLoc("loc", "")
    CXIdxContainerInfo.const.p("semanticContainer", "")
    CXIdxContainerInfo.const.p(
        "lexicalContainer",
        "generally same as {@code semanticContainer} but can be different in cases like out-of-line C++ member functions"
    )
    intb("isRedeclaration", "")
    intb("isDefinition", "")
    intb("isContainer", "")
    CXIdxContainerInfo.const.p("declAsContainer", "")
    intb("isImplicit", "whether the declaration exists in code or was created implicitly by the compiler, e.g. implicit Objective-C methods for properties")
    CXIdxAttrInfo.const.p.const.p("attributes", "")
    AutoSize("attributes")..unsigned("numAttributes", "")
    unsigned("flags", "")
}

val CXIdxObjCContainerDeclInfo = struct(Module.LLVM, "CXIdxObjCContainerDeclInfo", mutable = false) {
    CXIdxDeclInfo.const.p("declInfo", "")
    CXIdxObjCContainerKind("kind", "")
}

val CXIdxBaseClassInfo = struct(Module.LLVM, "CXIdxBaseClassInfo", mutable = false) {
    CXIdxEntityInfo.const.p("base", "")
    CXCursor("cursor", "")
    CXIdxLoc("loc", "")
}

val CXIdxObjCProtocolRefInfo = struct(Module.LLVM, "CXIdxObjCProtocolRefInfo", mutable = false) {
    CXIdxEntityInfo.const.p("protocol", "")
    CXCursor("cursor", "")
    CXIdxLoc("loc", "")
}

val CXIdxObjCProtocolRefListInfo = struct(Module.LLVM, "CXIdxObjCProtocolRefListInfo", mutable = false) {
    CXIdxObjCProtocolRefInfo.const.p.const.p("protocols", "")
    AutoSize("protocols")..unsigned("numProtocols", "")
}

val CXIdxObjCInterfaceDeclInfo = struct(Module.LLVM, "CXIdxObjCInterfaceDeclInfo", mutable = false) {
    CXIdxObjCContainerDeclInfo.const.p("containerInfo", "")
    CXIdxBaseClassInfo.const.p("superInfo", "")
    CXIdxObjCProtocolRefListInfo.const.p("protocols", "")
}

val CXIdxObjCCategoryDeclInfo = struct(Module.LLVM, "CXIdxObjCCategoryDeclInfo", mutable = false) {
    CXIdxObjCContainerDeclInfo.const.p("containerInfo", "")
    CXIdxEntityInfo.const.p("objcClass", "")
    CXCursor("classCursor", "")
    CXIdxLoc("classLoc", "")
    CXIdxObjCProtocolRefListInfo.const.p("protocols", "")
}

val CXIdxObjCPropertyDeclInfo = struct(Module.LLVM, "CXIdxObjCPropertyDeclInfo", mutable = false) {
    CXIdxDeclInfo.const.p("declInfo", "")
    CXIdxEntityInfo.const.p("getter", "")
    CXIdxEntityInfo.const.p("setter", "")
}

val CXIdxCXXClassDeclInfo = struct(Module.LLVM, "CXIdxCXXClassDeclInfo", mutable = false) {
    CXIdxDeclInfo.const.p("declInfo", "")
    CXIdxBaseClassInfo.const.p.const.p("bases", "")
    AutoSize("bases")..unsigned("numBases", "")
}

val CXIdxEntityRefInfo = struct(Module.LLVM, "CXIdxEntityRefInfo", mutable = false) {
    documentation = "Data for IndexerCallbacks#indexEntityReference."

    CXIdxEntityRefKind("kind", "")
    CXCursor("cursor", "reference cursor")
    CXIdxLoc("loc", "")
    CXIdxEntityInfo.const.p("referencedEntity", "the entity that gets referenced")
    CXIdxEntityInfo.const.p(
        "parentEntity",
        """
        Immediate "parent" of the reference. For example:
        ${codeBlock("""
Foo *var;""")}

        The parent of reference of type {@code Foo} is the variable {@code var}. For references inside statement bodies of functions/methods, the
        {@code parentEntity} will be the function/method.
        """
    )
    CXIdxContainerInfo.const.p("container", "lexical container context of the reference")
    CXSymbolRole("role", "sets of symbol roles of the reference")
}

val IndexerCallbacks = struct(Module.LLVM, "IndexerCallbacks", mutable = false) {
    documentation = "A group of callbacks used by #indexSourceFile() and #indexTranslationUnit()."

    Module.LLVM.callback {
        intb(
            "IndexerAbortQuery",
            "The {@code IndexerCallbacks.abortQuery} callback.",

            nullable..CXClientData("client_data", ""),
            nullable..void.p("reserved", "")
        ) {
            documentation = "Instances of this interface may be set to the {@code abortQuery} field of the ##IndexerCallbacks struct."
        }
    }("abortQuery", "called periodically to check whether indexing should be aborted. Should return 0 to continue, and non-zero to abort.")
    Module.LLVM.callback {
        void(
            "IndexerDiagnostic",
            "The {@code IndexerCallbacks.diagnostic} callback.",

            nullable..CXClientData("client_data", ""),
            CXDiagnosticSet("diagnosticSet", ""),
            nullable..void.p("reserved", "")
        ) {
            documentation = "Instances of this interface may be set to the {@code diagnostic} field of the ##IndexerCallbacks struct."
        }
    }("diagnostic", "called at the end of indexing; passes the complete diagnostic set.")
    Module.LLVM.callback {
        CXIdxClientFile(
            "IndexerEnteredMainFile",
            "The {@code IndexerCallbacks.enteredMainFile} callback.",

            nullable..CXClientData("client_data", ""),
            CXFile("mainFile", ""),
            nullable..void.p("reserved", "")
        ) {
            documentation = "Instances of this interface may be set to the {@code enteredMainFile} field of the ##IndexerCallbacks struct."
        }
    }("enteredMainFile", "")
    Module.LLVM.callback {
        CXIdxClientFile(
            "IndexerIncludedFile",
            "The {@code IndexerCallbacks.ppIncludedFile} callback.",

            nullable..CXClientData("client_data", ""),
            CXIdxIncludedFileInfo.const.p("info", "")
        ) {
            documentation = "Instances of this interface may be set to the {@code ppIncludedFile} field of the ##IndexerCallbacks struct."
        }
    }("ppIncludedFile", "called when a file gets {@code \\#included/\\#imported}")
    Module.LLVM.callback {
        CXIdxClientASTFile(
            "IndexerImportedASTFile",
            "The {@code IndexerCallbacks.importedASTFile} callback.",

            nullable..CXClientData("client_data", ""),
            CXIdxImportedASTFileInfo.const.p("info", "")
        ) {
            documentation = "Instances of this interface may be set to the {@code importedASTFile} field of the ##IndexerCallbacks struct."
        }
    }(
        "importedASTFile",
        """
        Called when a AST file (PCH or module) gets imported.

        AST files will not get indexed (there will not be callbacks to index all the entities in an AST file). The recommended action is that, if the AST file
        is not already indexed, to initiate a new indexing job specific to the AST file.
        """
    )
    Module.LLVM.callback {
        CXIdxClientContainer(
            "IndexerStartedTranslationUnit",
            "The {@code IndexerCallbacks.startedTranslationUnit} callback.",

            nullable..CXClientData("client_data", ""),
            nullable..void.p("reserved", "")
        ) {
            documentation = "Instances of this interface may be set to the {@code startedTranslationUnit} field of the ##IndexerCallbacks struct."
        }
    }("startedTranslationUnit", "called at the beginning of indexing a translation unit")
    Module.LLVM.callback {
        void(
            "IndexerIndexDeclaration",
            "The {@code IndexerCallbacks.indexDeclaration} callback.",

            nullable..CXClientData("client_data", ""),
            CXIdxDeclInfo.const.p("info", "")
        ) {
            documentation = "Instances of this interface may be set to the {@code indexDeclaration} field of the ##IndexerCallbacks struct."
        }
    }("indexDeclaration", "")
    Module.LLVM.callback {
        void(
            "IndexerIndexEntityReference",
            "The {@code IndexerCallbacks.indexEntityReference} callback.",

            nullable..CXClientData("client_data", ""),
            CXIdxEntityRefInfo.const.p("info", "")
        ) {
            documentation = "Instances of this interface may be set to the {@code indexEntityReference} field of the ##IndexerCallbacks struct."
        }
    }("indexEntityReference", "called to index a reference of an entity")
}

val CXCursorVisitor = Module.LLVM.callback {
    CXChildVisitResult(
        "CXCursorVisitor",
        """
        Visitor invoked for each cursor found by a traversal.

        This visitor function will be invoked for each cursor found by #visitChildren(). Its first argument is the cursor being visited, its second
        argument is the parent visitor for that cursor, and its third argument is the client data provided to {@code clang_visitChildren()}.

        The visitor should return one of the {@code CXChildVisitResult} values to direct {@code clang_visitChildren()}.
        """,

        CXCursor("cursor", ""),
        CXCursor("parent", ""),
        UserData()..nullable..CXClientData("client_data", "")
    ) {
        nativeImport("clang-c/Index.h")
        documentation = "Instances of this interface may be passed to the #visitChildren() method."
    }
}

val CXInclusionVisitor = Module.LLVM.callback {
    void(
        "CXInclusionVisitor",
        """
        Visitor invoked for each file in a translation unit (used with #getInclusions()).

        This visitor function will be invoked by {@code clang_getInclusions()} for each file included (either at the top-level or by \#include directives)
        within a translation unit. The first argument is the file being included, and the second and third arguments provide the inclusion stack. The array is
        sorted in order of immediate inclusion. For example, the first element refers to the location that included {@code included_file}.
        """,

        CXFile("included_file", ""),
        CXSourceLocation.p("inclusion_stack", ""),
        unsigned("include_len", ""),
        nullable..CXClientData("client_data", "")
    ) {
        documentation = "Instances of this interface may be passed to the #getInclusions() method."
    }
}

val CXFieldVisitor = Module.LLVM.callback {
    CXVisitorResult(
        "CXFieldVisitor",
        """
        Visitor invoked for each field found by a traversal.

        This visitor function will be invoked for each field found by #Type_visitFields(). Its first argument is the cursor being visited, its second argument
        is the client data provided to {@code clang_Type_visitFields}.

        The visitor should return one of the {@code CXVisitorResult} values to direct {@code #Type_visitFields()}.
        """,

        CXCursor("C", ""),
        UserData()..nullable..CXClientData("client_data", "")
    ) {
        nativeImport("clang-c/Index.h")
        documentation = "Instances of this interface may be passed to the #Type_visitFields() method."
    }
}

val CXExecuteOnThread = Module.LLVM.callback {
    void(
        "CXExecuteOnThread",
        "",

        opaque_p("user_data", "")
    ) {
        documentation = "Instances of this interface may be passed to the #executeOnThread() method."
    }
}

// -------------
// Documentation
// -------------

val CXCommentKind = "enum CXCommentKind".enumType
val CXCommentInlineCommandRenderKind = "enum CXCommentInlineCommandRenderKind".enumType
val CXCommentParamPassDirection = "enum CXCommentParamPassDirection".enumType

val CXComment = struct(Module.LLVM, "CXComment", mutable = false) {
    documentation = "A parsed comment."

    opaque_const_p("ASTNode", "")
    CXTranslationUnit("TranslationUnit", "")
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