/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMDebugInfo = "LLVMDebugInfo".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    documentation = ""

    EnumConstant(
        """
        Debug info flags.

        ({@code LLVMDIFlags})
        """,

        "DIFlagZero".enum("", "0"),
        "DIFlagPrivate".enum,
        "DIFlagProtected".enum,
        "DIFlagPublic".enum,
        "DIFlagFwdDecl".enum("", "1 << 2"),
        "DIFlagAppleBlock".enum("", "1 << 3"),
        "DIFlagReservedBit4".enum("", "1 << 4"),
        "DIFlagVirtual".enum("", "1 << 5"),
        "DIFlagArtificial".enum("", "1 << 6"),
        "DIFlagExplicit".enum("", "1 << 7"),
        "DIFlagPrototyped".enum("", "1 << 8"),
        "DIFlagObjcClassComplete".enum("", "1 << 9"),
        "DIFlagObjectPointer".enum("", "1 << 10"),
        "DIFlagVector".enum("", "1 << 11"),
        "DIFlagStaticMember".enum("", "1 << 12"),
        "DIFlagLValueReference".enum("", "1 << 13"),
        "DIFlagRValueReference".enum("", "1 << 14"),
        "DIFlagReserved".enum("", "1 << 15"),
        "DIFlagSingleInheritance".enum("", "1 << 16"),
        "DIFlagMultipleInheritance".enum("", "2 << 16"),
        "DIFlagVirtualInheritance".enum("", "3 << 16"),
        "DIFlagIntroducedVirtual".enum("", "1 << 18"),
        "DIFlagBitField".enum("", "1 << 19"),
        "DIFlagNoReturn".enum("", "1 << 20"),
        "DIFlagTypePassByValue".enum("", "1 << 22"),
        "DIFlagTypePassByReference".enum("", "1 << 23"),
        "DIFlagEnumClass".enum("", "1 << 24"),
        "DIFlagFixedEnum".enum("", "LLVMDIFlagEnumClass"),
        "DIFlagThunk".enum("", "1 << 25"),
        "DIFlagNonTrivial".enum("", "1 << 26"),
        "DIFlagBigEndian".enum("", "1 << 27"),
        "DIFlagLittleEndian".enum("", "1 << 28"),
        "DIFlagIndirectVirtualBase".enum("", "(1 << 2) | (1 << 5)"),
        "DIFlagAccessibility".enum("", "LLVMDIFlagPrivate | LLVMDIFlagProtected | LLVMDIFlagPublic"),
        "DIFlagPtrToMemberRep".enum("", "LLVMDIFlagSingleInheritance | LLVMDIFlagMultipleInheritance | LLVMDIFlagVirtualInheritance")
    )

    EnumConstant(
        """
        Source languages known by DWARF.

        ({@code LLVMDWARFSourceLanguage})
        """,

        "DWARFSourceLanguageC89".enum("", "0"),
        "DWARFSourceLanguageC".enum,
        "DWARFSourceLanguageAda83".enum,
        "DWARFSourceLanguageC_plus_plus".enum,
        "DWARFSourceLanguageCobol74".enum,
        "DWARFSourceLanguageCobol85".enum,
        "DWARFSourceLanguageFortran77".enum,
        "DWARFSourceLanguageFortran90".enum,
        "DWARFSourceLanguagePascal83".enum,
        "DWARFSourceLanguageModula2".enum,
        "DWARFSourceLanguageJava".enum("New in DWARF v3:"),
        "DWARFSourceLanguageC99".enum("New in DWARF v3:"),
        "DWARFSourceLanguageAda95".enum("New in DWARF v3:"),
        "DWARFSourceLanguageFortran95".enum("New in DWARF v3:"),
        "DWARFSourceLanguagePLI".enum("New in DWARF v3:"),
        "DWARFSourceLanguageObjC".enum("New in DWARF v3:"),
        "DWARFSourceLanguageObjC_plus_plus".enum("New in DWARF v3:"),
        "DWARFSourceLanguageUPC".enum("New in DWARF v3:"),
        "DWARFSourceLanguageD".enum("New in DWARF v3:"),
        "DWARFSourceLanguagePython".enum("New in DWARF v4:"),
        "DWARFSourceLanguageOpenCL".enum("New in DWARF v5:"),
        "DWARFSourceLanguageGo".enum("New in DWARF v5:"),
        "DWARFSourceLanguageModula3".enum("New in DWARF v5:"),
        "DWARFSourceLanguageHaskell".enum("New in DWARF v5:"),
        "DWARFSourceLanguageC_plus_plus_03".enum("New in DWARF v5:"),
        "DWARFSourceLanguageC_plus_plus_11".enum("New in DWARF v5:"),
        "DWARFSourceLanguageOCaml".enum("New in DWARF v5:"),
        "DWARFSourceLanguageRust".enum("New in DWARF v5:"),
        "DWARFSourceLanguageC11".enum("New in DWARF v5:"),
        "DWARFSourceLanguageSwift".enum("New in DWARF v5:"),
        "DWARFSourceLanguageJulia".enum("New in DWARF v5:"),
        "DWARFSourceLanguageDylan".enum("New in DWARF v5:"),
        "DWARFSourceLanguageC_plus_plus_14".enum("New in DWARF v5:"),
        "DWARFSourceLanguageFortran03".enum("New in DWARF v5:"),
        "DWARFSourceLanguageFortran08".enum("New in DWARF v5:"),
        "DWARFSourceLanguageRenderScript".enum("New in DWARF v5:"),
        "DWARFSourceLanguageBLISS".enum("New in DWARF v5:"),
        "DWARFSourceLanguageMips_Assembler".enum("Vendor extensions:"),
        "DWARFSourceLanguageGOOGLE_RenderScript".enum("Vendor extensions:"),
        "DWARFSourceLanguageBORLAND_Delphi".enum("Vendor extensions:")
    )

    EnumConstant(
        """
        The amount of debug information to emit.

        ({@code LLVMDWARFEmissionKind})
        """,

        "DWARFEmissionNone".enum("", "0"),
        "DWARFEmissionFull".enum,
        "DWARFEmissionLineTablesOnly".enum
    )

    EnumConstant(
        "The kind of metadata nodes.",

        "MDStringMetadataKind".enum("", "0"),
        "ConstantAsMetadataMetadataKind".enum,
        "LocalAsMetadataMetadataKind".enum,
        "DistinctMDOperandPlaceholderMetadataKind".enum,
        "MDTupleMetadataKind".enum,
        "DILocationMetadataKind".enum,
        "DIExpressionMetadataKind".enum,
        "DIGlobalVariableExpressionMetadataKind".enum,
        "GenericDINodeMetadataKind".enum,
        "DISubrangeMetadataKind".enum,
        "DIEnumeratorMetadataKind".enum,
        "DIBasicTypeMetadataKind".enum,
        "DIDerivedTypeMetadataKind".enum,
        "DICompositeTypeMetadataKind".enum,
        "DISubroutineTypeMetadataKind".enum,
        "DIFileMetadataKind".enum,
        "DICompileUnitMetadataKind".enum,
        "DISubprogramMetadataKind".enum,
        "DILexicalBlockMetadataKind".enum,
        "DILexicalBlockFileMetadataKind".enum,
        "DINamespaceMetadataKind".enum,
        "DIModuleMetadataKind".enum,
        "DITemplateTypeParameterMetadataKind".enum,
        "DITemplateValueParameterMetadataKind".enum,
        "DIGlobalVariableMetadataKind".enum,
        "DILocalVariableMetadataKind".enum,
        "DILabelMetadataKind".enum,
        "DIObjCPropertyMetadataKind".enum,
        "DIImportedEntityMetadataKind".enum,
        "DIMacroMetadataKind".enum,
        "DIMacroFileMetadataKind".enum,
        "DICommonBlockMetadataKind".enum,
        "DIStringTypeMetadataKind".enum,
        "DIGenericSubrangeMetadataKind".enum,
        "DIArgListMetadataKind".enum
    )

    EnumConstant(
        """
        Describes the kind of macro declaration used for {@code LLVMDIBuilderCreateMacro}. ({@code LLVMDWARFMacinfoRecordType})

        See {@code llvm::dwarf::MacinfoRecordType}.

        Note: Values are from {@code DW_MACINFO_*} constants in the DWARF specification.
        """,

        "DWARFMacinfoRecordTypeDefine".enum("", "0x01"),
        "DWARFMacinfoRecordTypeMacro".enum("", "0x02"),
        "DWARFMacinfoRecordTypeStartFile".enum("", "0x03"),
        "DWARFMacinfoRecordTypeEndFile".enum("", "0x04"),
        "DWARFMacinfoRecordTypeVendorExt".enum("", "0xff")
    )

    unsigned_int(
        "DebugMetadataVersion",
        "The current debug metadata version number.",

        void()
    )

    unsigned_int(
        "GetModuleDebugMetadataVersion",
        "The version of debug metadata that's present in the provided {@code Module}.",

        LLVMModuleRef("Module", "")
    )

    LLVMBool(
        "StripModuleDebugInfo",
        """
        Strip debug info in the module if it exists. To do this, we remove all calls to the debugger intrinsics and any named metadata for debugging. We also
        remove debug locations for instructions. Return true if module is modified.
        """,

        LLVMModuleRef("Module", "")
    )

    LLVMDIBuilderRef(
        "CreateDIBuilderDisallowUnresolved",
        "Construct a builder for a module, and do not allow for unresolved nodes attached to the module.",

        LLVMModuleRef("M", "")
    )

    LLVMDIBuilderRef(
        "CreateDIBuilder",
        """
        Construct a builder for a module and collect unresolved nodes attached to the module in order to resolve cycles during a call to {@code
        LLVMDIBuilderFinalize}.
        """,

        LLVMModuleRef("M", "")
    )

    void(
        "DisposeDIBuilder",
        """
        Deallocates the {@code DIBuilder} and everything it owns.

        ${note("""You must call {@code #DIBuilderFinalize()} before this""")}
        """,

        LLVMDIBuilderRef("Builder", "")
    )

    void(
        "DIBuilderFinalize",
        "Construct any deferred debug info descriptors.",

        LLVMDIBuilderRef("Builder", "")
    )

    LLVMMetadataRef(
        "DIBuilderCreateCompileUnit",
        "A {@code CompileUnit} provides an anchor for all debugging information generated during this instance of compilation.",

        LLVMDIBuilderRef("Builder", ""),
        LLVMDWARFSourceLanguage("Lang", "source programming language, eg. {@code LLVMDWARFSourceLanguageC99}"),
        LLVMMetadataRef("FileRef", "file info"),
        charUTF8.const.p("Producer", "identify the producer of debugging information and code.  Usually this is a compiler version string."),
        AutoSize("Producer")..size_t("ProducerLen", "the length of the C string passed to {@code Producer}"),
        LLVMBool("isOptimized", "a boolean flag which indicates whether optimization is enabled or not"),
        charUTF8.const.p(
            "Flags",
            """
            this string lists command line options. This string is directly embedded in debug info output which may be used by a tool analyzing generated
            debugging information.
            """
        ),
        AutoSize("Flags")..size_t("FlagsLen", "the length of the C string passed to {@code Flags}"),
        unsigned_int("RuntimeVer", "this indicates runtime version for languages like Objective-C"),
        charUTF8.const.p("SplitName", "the name of the file that we'll split debug info out into"),
        AutoSize("SplitName")..size_t("SplitNameLen", "the length of the C string passed to {@code SplitName}"),
        LLVMDWARFEmissionKind("Kind", "the kind of debug information to generate"),
        unsigned_int("DWOId", "the DWOId if this is a split skeleton compile unit"),
        LLVMBool("SplitDebugInlining", "whether to emit inline debug info"),
        LLVMBool("DebugInfoForProfiling", "whether to emit extra debug info for profile collection"),
        charUTF8.const.p("SysRoot", "the Clang system root (value of {@code -isysroot})"),
        AutoSize("SysRoot")..size_t("SysRootLen", "the length of the C string passed to {@code SysRoot}"),
        charUTF8.const.p("SDK", "the SDK. On Darwin, the last component of the {@code sysroot}."),
        AutoSize("SDK")..size_t("SDKLen", "the length of the C string passed to {@code SDK}")
    )

    LLVMMetadataRef(
        "DIBuilderCreateFile",
        "Create a file descriptor to hold debugging information for a file.",

        LLVMDIBuilderRef("Builder", "the {@code DIBuilder}"),
        charUTF8.const.p("Filename", "file name"),
        AutoSize("Filename")..size_t("FilenameLen", "the length of the C string passed to {@code Filename}"),
        charUTF8.const.p("Directory", "directory"),
        AutoSize("Directory")..size_t("DirectoryLen", "the length of the C string passed to {@code Directory}")
    )

    LLVMMetadataRef(
        "DIBuilderCreateModule",
        "Creates a new descriptor for a module with the specified parent scope.",

        LLVMDIBuilderRef("Builder", "the {@code DIBuilder}"),
        LLVMMetadataRef("ParentScope", "the parent scope containing this module declaration"),
        charUTF8.const.p("Name", "module name"),
        AutoSize("Name")..size_t("NameLen", "the length of the C string passed to {@code Name}"),
        charUTF8.const.p("ConfigMacros", "a space-separated shell-quoted list of {@code -D} macro definitions as they would appear on a command line"),
        AutoSize("ConfigMacros")..size_t("ConfigMacrosLen", "the length of the C string passed to {@code ConfigMacros}"),
        charUTF8.const.p("IncludePath", "the path to the module map file"),
        AutoSize("IncludePath")..size_t("IncludePathLen", "the length of the C string passed to {@code IncludePath}"),
        charUTF8.const.p("APINotesFile", "the path to an API notes file for the module"),
        AutoSize("APINotesFile")..size_t("APINotesFileLen", "he length of the C string passed to {@code APINotestFile}")
    )

    LLVMMetadataRef(
        "DIBuilderCreateNameSpace",
        "Creates a new descriptor for a namespace with the specified parent scope.",

        LLVMDIBuilderRef("Builder", "the {@code DIBuilder}"),
        LLVMMetadataRef("ParentScope", "the parent scope containing this module declaration"),
        charUTF8.const.p("Name", "nameSpace name"),
        AutoSize("Name")..size_t("NameLen", "the length of the C string passed to {@code Name}"),
        LLVMBool("ExportSymbols", "whether or not the namespace exports symbols, e.g. this is true of C++ inline namespaces.")
    )

    LLVMMetadataRef(
        "DIBuilderCreateFunction",
        "Create a new descriptor for the specified subprogram.",

        LLVMDIBuilderRef("Builder", "the {@code DIBuilder}"),
        LLVMMetadataRef("Scope", "function scope"),
        charUTF8.const.p("Name", "function name"),
        AutoSize("Name")..size_t("NameLen", "length of enumeration name"),
        charUTF8.const.p("LinkageName", "mangled function name"),
        AutoSize("LinkageName")..size_t("LinkageNameLen", "length of linkage name"),
        LLVMMetadataRef("File", "file where this variable is defined"),
        unsigned_int("LineNo", "line number"),
        LLVMMetadataRef("Ty", "function type"),
        LLVMBool("IsLocalToUnit", "true if this function is not externally visible"),
        LLVMBool("IsDefinition", "true if this is a function definition"),
        unsigned_int("ScopeLine", "set to the beginning of the scope this starts"),
        LLVMDIFlags("Flags", "e.g.: {@code LLVMDIFlagLValueReference}. These flags are used to emit dwarf attributes."),
        LLVMBool("IsOptimized", "true if optimization is ON")
    )

    LLVMMetadataRef(
        "DIBuilderCreateLexicalBlock",
        "Create a descriptor for a lexical block with the specified parent context.",

        LLVMDIBuilderRef("Builder", "the {@code DIBuilder}"),
        LLVMMetadataRef("Scope", "parent lexical block"),
        LLVMMetadataRef("File", "source file"),
        unsigned_int("Line", "the line in the source file"),
        unsigned_int("Column", "the column in the source file")
    )

    LLVMMetadataRef(
        "DIBuilderCreateLexicalBlockFile",
        "Create a descriptor for a lexical block with a new file attached.",

        LLVMDIBuilderRef("Builder", "the {@code DIBuilder}"),
        LLVMMetadataRef("Scope", "lexical block"),
        LLVMMetadataRef("File", "source file"),
        unsigned_int("Discriminator", "DWARF path discriminator value")
    )

    LLVMMetadataRef(
        "DIBuilderCreateImportedModuleFromNamespace",
        "Create a descriptor for an imported namespace. Suitable for e.g. C++ using declarations.",

        LLVMDIBuilderRef("Builder", "the {@code DIBuilder}"),
        LLVMMetadataRef("Scope", "the scope this module is imported into"),
        LLVMMetadataRef("NS", ""),
        LLVMMetadataRef("File", "file where the declaration is located"),
        unsigned_int("Line", "line number of the declaration")
    )

    LLVMMetadataRef(
        "DIBuilderCreateImportedModuleFromAlias",
        "Create a descriptor for an imported module that aliases another imported entity descriptor.",

        LLVMDIBuilderRef("Builder", "the {@code DIBuilder}"),
        LLVMMetadataRef("Scope", "the scope this module is imported into"),
        LLVMMetadataRef("ImportedEntity", "previous imported entity to alias"),
        LLVMMetadataRef("File", "file where the declaration is located"),
        unsigned_int("Line", "line number of the declaration")
    )

    LLVMMetadataRef(
        "DIBuilderCreateImportedModuleFromModule",
        "Create a descriptor for an imported module.",

        LLVMDIBuilderRef("Builder", "the {@code DIBuilder}"),
        LLVMMetadataRef("Scope", "the scope this module is imported into"),
        LLVMMetadataRef("M", "the module being imported here"),
        LLVMMetadataRef("File", "file where the declaration is located"),
        unsigned_int("Line", "line number of the declaration")
    )

    LLVMMetadataRef(
        "DIBuilderCreateImportedDeclaration",
        "Create a descriptor for an imported function, type, or variable.  Suitable for e.g. FORTRAN-style USE declarations.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        LLVMMetadataRef("Scope", "the scope this module is imported into"),
        LLVMMetadataRef("Decl", "the declaration (or definition) of a function, type, or variable"),
        LLVMMetadataRef("File", "file where the declaration is located"),
        unsigned_int("Line", "line number of the declaration"),
        charUTF8.const.p("Name", "a name that uniquely identifies this imported declaration"),
        AutoSize("Name")..size_t("NameLen", "the length of the C string passed to {@code Name}")
    )

    LLVMMetadataRef(
        "DIBuilderCreateDebugLocation",
        """
        Creates a new DebugLocation that describes a source location.

        ${note("""If the item to which this location is attached cannot be attributed to a source line, pass 0 for the line and column.""")}
        """,

        LLVMContextRef("Ctx", ""),
        unsigned_int("Line", "the line in the source file"),
        unsigned_int("Column", "the column in the source file"),
        LLVMMetadataRef("Scope", "the scope in which the location resides"),
        LLVMMetadataRef("InlinedAt", "the scope where this location was inlined, if at all. (optional).")
    )

    unsigned_int(
        "DILocationGetLine",
        "Get the line number of this debug location.",

        LLVMMetadataRef("Location", "the debug location")
    )

    unsigned_int(
        "DILocationGetColumn",
        "Get the column number of this debug location.",

        LLVMMetadataRef("Location", "the debug location")
    )

    LLVMMetadataRef(
        "DILocationGetScope",
        "Get the local scope associated with this debug location.",

        LLVMMetadataRef("Location", "the debug location")
    )

    IgnoreMissing..LLVMMetadataRef(
        "DILocationGetInlinedAt",
        """
        Get the "inline at" location associated with this debug location.

        See {@code DILocation::getInlinedAt()}.
        """,

        LLVMMetadataRef("Location", "the debug location"),

        since = "9"
    )

    IgnoreMissing..LLVMMetadataRef(
        "DIScopeGetFile",
        """
        Get the metadata of the file associated with a given scope.

        See {@code DIScope::getFile()}.
        """,

        LLVMMetadataRef("Scope", "the scope object"),

        since = "9"
    )

    IgnoreMissing..charUTF8.const.p(
        "DIFileGetDirectory",
        """
        Get the directory of a given file.

        See {@code DIFile::getDirectory()}
        """,

        LLVMMetadataRef("File", "the file object"),
        AutoSizeResult..Check(1)..unsigned.p("Len", "the length of the returned string"),

        since = "9"
    )

    IgnoreMissing..charUTF8.const.p(
        "DIFileGetFilename",
        """
        Get the name of a given file.

        See {@code DIFile::getFilename()}.
        """,

        LLVMMetadataRef("File", "the file object"),
        AutoSizeResult..Check(1)..unsigned.p("Len", "the length of the returned string"),

        since = "9"
    )

    IgnoreMissing..charUTF8.const.p(
        "DIFileGetSource",
        """
        Get the source of a given file.

        See {@code DIFile::getSource()}.
        """,

        LLVMMetadataRef("File", "the file object"),
        AutoSizeResult..Check(1)..unsigned.p("Len", "the length of the returned string"),

        since = "9"
    )

    LLVMMetadataRef(
        "DIBuilderGetOrCreateTypeArray",
        "Create a type array.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        LLVMMetadataRef.p("Data", "the type elements"),
        AutoSize("Data")..size_t("NumElements", "number of type elements")
    )

    LLVMMetadataRef(
        "DIBuilderCreateSubroutineType",
        "Create subroutine type.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        LLVMMetadataRef("File", "the file in which the subroutine resides"),
        LLVMMetadataRef.p("ParameterTypes", "an array of subroutine parameter types. This includes return type at 0th index."),
        AutoSize("ParameterTypes")..unsigned_int("NumParameterTypes", "the number of parameter types in {@code ParameterTypes}"),
        LLVMDIFlags("Flags", "e.g.: {@code LLVMDIFlagLValueReference}. These flags are used to emit dwarf attributes.")
    )

    IgnoreMissing..LLVMMetadataRef(
        "DIBuilderCreateMacro",
        "Create debugging information entry for a macro.",

        LLVMDIBuilderRef("Builder", "the {@code DIBuilder}"),
        nullable..LLVMMetadataRef("ParentMacroFile", "macro parent (could be #NULL)."),
        unsigned("Line", "source line number where the macro is defined"),
        LLVMDWARFMacinfoRecordType("RecordType", "{@code DW_MACINFO_define} or {@code DW_MACINFO_undef}"),
        charUTF8.const.p("Name", "macro name"),
        AutoSize("Name")..size_t("NameLen", "macro name length"),
        charUTF8.const.p("Value", "macro value"),
        AutoSize("Value")..size_t("ValueLen", "macro value length"),

        since = "10"
    )

    IgnoreMissing..LLVMMetadataRef(
        "DIBuilderCreateTempMacroFile",
        """
        Create debugging information temporary entry for a macro file.

        List of macro node direct children will be calculated by {@code DIBuilder}, using the {@code ParentMacroFile} relationship.
        """,

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        LLVMMetadataRef("ParentMacroFile", "macro parent (could be #NULL)"),
        unsigned("Line", "source line number where the macro file is included"),
        LLVMMetadataRef("File", "file descriptor containing the name of the macro file"),

        since = "10"
    )

    IgnoreMissing..LLVMMetadataRef(
        "DIBuilderCreateEnumerator",
        "Create debugging information entry for an enumerator.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        char.const.p("Name", "enumerator name"),
        AutoSize("Name")..size_t("NameLen", "length of enumerator name"),
        int64_t("Value", "enumerator value"),
        LLVMBool("IsUnsigned", "true if the value is unsigned"),

        since = "10"
    )

    LLVMMetadataRef(
        "DIBuilderCreateEnumerationType",
        "Create debugging information entry for an enumeration.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        LLVMMetadataRef("Scope", "scope in which this enumeration is defined"),
        charUTF8.const.p("Name", "enumeration name"),
        AutoSize("Name")..size_t("NameLen", "length of enumeration name"),
        LLVMMetadataRef("File", "file where this member is defined"),
        unsigned_int("LineNumber", "line number"),
        uint64_t("SizeInBits", "member size"),
        uint32_t("AlignInBits", "member alignment"),
        LLVMMetadataRef.p("Elements", "enumeration elements"),
        AutoSize("Elements")..unsigned_int("NumElements", "number of enumeration elements"),
        LLVMMetadataRef("ClassTy", "underlying type of a C++11/ObjC fixed enum")
    )

    LLVMMetadataRef(
        "DIBuilderCreateUnionType",
        "Create debugging information entry for a union.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        LLVMMetadataRef("Scope", "scope in which this union is defined"),
        charUTF8.const.p("Name", "union name"),
        AutoSize("Name")..size_t("NameLen", "length of union name"),
        LLVMMetadataRef("File", "file where this member is defined"),
        unsigned_int("LineNumber", "line number"),
        uint64_t("SizeInBits", "member size"),
        uint32_t("AlignInBits", "member alignment"),
        LLVMDIFlags("Flags", "flags to encode member attribute, e.g. private"),
        LLVMMetadataRef.p("Elements", "union elements"),
        AutoSize("Elements")..unsigned_int("NumElements", "number of union elements"),
        unsigned_int("RunTimeLang", "optional parameter, Objective-C runtime version"),
        charUTF8.const.p("UniqueId", "a unique identifier for the union"),
        AutoSize("UniqueId")..size_t("UniqueIdLen", "length of unique identifier")
    )

    LLVMMetadataRef(
        "DIBuilderCreateArrayType",
        "Create debugging information entry for an array.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        uint64_t("Size", "array size"),
        uint32_t("AlignInBits", "alignment"),
        LLVMMetadataRef("Ty", "element type"),
        LLVMMetadataRef.p("Subscripts", "subscripts"),
        AutoSize("Subscripts")..unsigned_int("NumSubscripts", "number of subscripts")
    )

    LLVMMetadataRef(
        "DIBuilderCreateVectorType",
        "Create debugging information entry for a vector type.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        uint64_t("Size", "vector size"),
        uint32_t("AlignInBits", "alignment"),
        LLVMMetadataRef("Ty", "element type"),
        LLVMMetadataRef.p("Subscripts", "subscripts"),
        AutoSize("Subscripts")..unsigned_int("NumSubscripts", "number of subscripts")
    )

    LLVMMetadataRef(
        "DIBuilderCreateUnspecifiedType",
        "Create a DWARF unspecified type.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        charUTF8.const.p("Name", "the unspecified type's name"),
        AutoSize("Name")..size_t("NameLen", "length of type name")
    )

    LLVMMetadataRef(
        "DIBuilderCreateBasicType",
        "Create debugging information entry for a basic type.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        charUTF8.const.p("Name", "type name"),
        AutoSize("Name")..size_t("NameLen", "length of type name"),
        uint64_t("SizeInBits", "size of the type"),
        LLVMDWARFTypeEncoding("Encoding", "DWARF encoding code, e.g. {@code LLVMDWARFTypeEncoding_float}."),
        LLVMDIFlags("Flags", "flags to encode optional attribute like endianity")
    )

    LLVMMetadataRef(
        "DIBuilderCreatePointerType",
        "Create debugging information entry for a pointer.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        LLVMMetadataRef("PointeeTy", "type pointed by this pointer"),
        uint64_t("SizeInBits", "size"),
        uint32_t("AlignInBits", "alignment. (optional, pass 0 to ignore)"),
        unsigned_int("AddressSpace", "DWARF address space. (optional, pass 0 to ignore)"),
        charUTF8.const.p("Name", "pointer type name. (optional)"),
        AutoSize("Name")..size_t("NameLen", "length of pointer type name. (optional)")
    )

    LLVMMetadataRef(
        "DIBuilderCreateStructType",
        "Create debugging information entry for a struct.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        LLVMMetadataRef("Scope", "scope in which this struct is defined"),
        charUTF8.const.p("Name", "struct name"),
        AutoSize("Name")..size_t("NameLen", "struct name length"),
        LLVMMetadataRef("File", "file where this member is defined"),
        unsigned_int("LineNumber", "line number"),
        uint64_t("SizeInBits", "member size"),
        uint32_t("AlignInBits", "member alignment"),
        LLVMDIFlags("Flags", "flags to encode member attribute, e.g. private"),
        LLVMMetadataRef("DerivedFrom", ""),
        LLVMMetadataRef.p("Elements", "struct elements"),
        AutoSize("Elements")..unsigned_int("NumElements", "number of struct elements"),
        unsigned_int("RunTimeLang", "optional parameter, Objective-C runtime version"),
        LLVMMetadataRef("VTableHolder", "the object containing the vtable for the struct"),
        charUTF8.const.p("UniqueId", "a unique identifier for the struct"),
        AutoSize("UniqueId")..size_t("UniqueIdLen", "length of the unique identifier for the struct")
    )

    LLVMMetadataRef(
        "DIBuilderCreateMemberType",
        "Create debugging information entry for a member.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        LLVMMetadataRef("Scope", "member scope"),
        charUTF8.const.p("Name", "member name"),
        AutoSize("Name")..size_t("NameLen", "length of member name"),
        LLVMMetadataRef("File", "file where this member is defined"),
        unsigned_int("LineNo", "line number"),
        uint64_t("SizeInBits", "member size"),
        uint32_t("AlignInBits", "member alignment"),
        uint64_t("OffsetInBits", "member offset"),
        LLVMDIFlags("Flags", "flags to encode member attribute, e.g. private"),
        LLVMMetadataRef("Ty", "parent type")
    )

    LLVMMetadataRef(
        "DIBuilderCreateStaticMemberType",
        "Create debugging information entry for a C++ static data member.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        LLVMMetadataRef("Scope", "member scope"),
        charUTF8.const.p("Name", "member name"),
        AutoSize("Name")..size_t("NameLen", "length of member name"),
        LLVMMetadataRef("File", "file where this member is declared"),
        unsigned_int("LineNumber", "line number"),
        LLVMMetadataRef("Type", "type of the static member"),
        LLVMDIFlags("Flags", "flags to encode member attribute, e.g. private."),
        LLVMValueRef("ConstantVal", "const initializer of the member"),
        uint32_t("AlignInBits", "member alignment")
    )

    LLVMMetadataRef(
        "DIBuilderCreateMemberPointerType",
        "Create debugging information entry for a pointer to member.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        LLVMMetadataRef("PointeeType", "type pointed to by this pointer"),
        LLVMMetadataRef("ClassType", "type for which this pointer points to members of"),
        uint64_t("SizeInBits", "size"),
        uint32_t("AlignInBits", "alignment"),
        LLVMDIFlags("Flags", "flags")
    )

    LLVMMetadataRef(
        "DIBuilderCreateObjCIVar",
        "Create debugging information entry for Objective-C instance variable.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        charUTF8.const.p("Name", "member name"),
        AutoSize("Name")..size_t("NameLen", "the length of the C string passed to {@code Name}"),
        LLVMMetadataRef("File", "file where this member is defined"),
        unsigned_int("LineNo", "line number"),
        uint64_t("SizeInBits", "member size"),
        uint32_t("AlignInBits", "member alignment"),
        uint64_t("OffsetInBits", "member offset"),
        LLVMDIFlags("Flags", "flags to encode member attribute, e.g. private"),
        LLVMMetadataRef("Ty", "parent type"),
        LLVMMetadataRef("PropertyNode", "property associated with this ivar")
    )

    LLVMMetadataRef(
        "DIBuilderCreateObjCProperty",
        "Create debugging information entry for Objective-C property.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        charUTF8.const.p("Name", "property name"),
        AutoSize("Name")..size_t("NameLen", "the length of the C string passed to {@code Name}"),
        LLVMMetadataRef("File", "file where this property is defined"),
        unsigned_int("LineNo", "line number"),
        charUTF8.const.p("GetterName", "name of the Objective C property getter selector"),
        AutoSize("GetterName")..size_t("GetterNameLen", "the length of the C string passed to {@code GetterName}"),
        charUTF8.const.p("SetterName", "name of the Objective C property setter selector"),
        AutoSize("SetterName")..size_t("SetterNameLen", "the length of the C string passed to {@code SetterName}"),
        unsigned_int("PropertyAttributes", "objective C property attributes"),
        LLVMMetadataRef("Ty", "type")
    )

    LLVMMetadataRef(
        "DIBuilderCreateObjectPointerType",
        "Create a uniqued DIType* clone with FlagObjectPointer and FlagArtificial set.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        LLVMMetadataRef("Type", "the underlying type to which this pointer points")
    )

    LLVMMetadataRef(
        "DIBuilderCreateQualifiedType",
        "Create debugging information entry for a qualified type, e.g. 'const int'.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        unsigned_int("Tag", "tag identifying type, e.g. {@code LLVMDWARFTypeQualifier_volatile_type}"),
        LLVMMetadataRef("Type", "base Type")
    )

    LLVMMetadataRef(
        "DIBuilderCreateReferenceType",
        "Create debugging information entry for a c++ style reference or {@code rvalue} reference type.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        unsigned_int("Tag", "tag identifying type,"),
        LLVMMetadataRef("Type", "base Type")
    )

    LLVMMetadataRef(
        "DIBuilderCreateNullPtrType",
        "Create C++11 {@code nullptr} type.",

        LLVMDIBuilderRef("Builder", "the DIBuilder")
    )

    LLVMMetadataRef(
        "DIBuilderCreateTypedef",
        "Create debugging information entry for a typedef.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        LLVMMetadataRef("Type", "original type"),
        charUTF8.const.p("Name", "typedef name"),
        AutoSize("Name")..size_t("NameLen", ""),
        LLVMMetadataRef("File", "file where this type is defined"),
        unsigned_int("LineNo", "line number"),
        LLVMMetadataRef("Scope", "the surrounding context for the typedef"),
        uint32_t("AlignInBits", "")
    )

    LLVMMetadataRef(
        "DIBuilderCreateInheritance",
        "Create debugging information entry to establish inheritance relationship between two types.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        LLVMMetadataRef("Ty", "original type"),
        LLVMMetadataRef("BaseTy", "base type. Ty is inherits from base."),
        uint64_t("BaseOffset", "base offset"),
        uint32_t("VBPtrOffset", "virtual base pointer offset"),
        LLVMDIFlags("Flags", "flags to describe inheritance attribute, e.g. private")
    )

    LLVMMetadataRef(
        "DIBuilderCreateForwardDecl",
        "Create a permanent forward-declared type.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        unsigned_int("Tag", "a unique tag for this type"),
        charUTF8.const.p("Name", "type name"),
        AutoSize("Name")..size_t("NameLen", "length of type name"),
        LLVMMetadataRef("Scope", "type scope"),
        LLVMMetadataRef("File", "file where this type is defined"),
        unsigned_int("Line", "line number where this type is defined"),
        unsigned_int("RuntimeLang", "indicates runtime version for languages like Objective-C"),
        uint64_t("SizeInBits", "member size"),
        uint32_t("AlignInBits", "member alignment"),
        charUTF8.const.p("UniqueIdentifier", "a unique identifier for the type"),
        AutoSize("UniqueIdentifier")..size_t("UniqueIdentifierLen", "length of the unique identifier")
    )

    LLVMMetadataRef(
        "DIBuilderCreateReplaceableCompositeType",
        "Create a temporary forward-declared type.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        unsigned_int("Tag", "a unique tag for this type"),
        charUTF8.const.p("Name", "type name"),
        AutoSize("Name")..size_t("NameLen", "length of type name"),
        LLVMMetadataRef("Scope", "type scope"),
        LLVMMetadataRef("File", "file where this type is defined"),
        unsigned_int("Line", "line number where this type is defined"),
        unsigned_int("RuntimeLang", "indicates runtime version for languages like Objective-C"),
        uint64_t("SizeInBits", "member size"),
        uint32_t("AlignInBits", "member alignment"),
        LLVMDIFlags("Flags", "flags"),
        charUTF8.const.p("UniqueIdentifier", "a unique identifier for the type"),
        AutoSize("UniqueIdentifier")..size_t("UniqueIdentifierLen", "length of the unique identifier")
    )

    LLVMMetadataRef(
        "DIBuilderCreateBitFieldMemberType",
        "Create debugging information entry for a bit field member.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        LLVMMetadataRef("Scope", "member scope"),
        charUTF8.const.p("Name", "member name"),
        AutoSize("Name")..size_t("NameLen", "length of member name"),
        LLVMMetadataRef("File", "file where this member is defined"),
        unsigned_int("LineNumber", "line number"),
        uint64_t("SizeInBits", "member size"),
        uint64_t("OffsetInBits", "member offset"),
        uint64_t("StorageOffsetInBits", "member storage offset"),
        LLVMDIFlags("Flags", "flags to encode member attribute"),
        LLVMMetadataRef("Type", "parent type")
    )

    LLVMMetadataRef(
        "DIBuilderCreateClassType",
        "Create debugging information entry for a class.",

        LLVMDIBuilderRef("Builder", ""),
        LLVMMetadataRef("Scope", "scope in which this class is defined"),
        charUTF8.const.p("Name", "class name"),
        AutoSize("Name")..size_t("NameLen", "the length of the C string passed to {@code Name}"),
        LLVMMetadataRef("File", "file where this member is defined"),
        unsigned_int("LineNumber", "line number"),
        uint64_t("SizeInBits", "member size"),
        uint32_t("AlignInBits", "member alignment"),
        uint64_t("OffsetInBits", "member offset"),
        LLVMDIFlags("Flags", "flags to encode member attribute, e.g. private."),
        LLVMMetadataRef("DerivedFrom", "debug info of the base class of this type"),
        LLVMMetadataRef.p("Elements", "class members"),
        AutoSize("Elements")..unsigned_int("NumElements", "number of class elements"),
        LLVMMetadataRef(
            "VTableHolder",
            "debug info of the base class that contains vtable for this type. This is used in DW_AT_containing_type. See DWARF documentation for more info."
        ),
        LLVMMetadataRef("TemplateParamsNode", "template type parameters"),
        charUTF8.const.p("UniqueIdentifier", "a unique identifier for the type"),
        AutoSize("UniqueIdentifier")..size_t("UniqueIdentifierLen", "length of the unique identifier")
    )

    LLVMMetadataRef(
        "DIBuilderCreateArtificialType",
        "Create a uniqued {@code DIType*} clone with {@code FlagArtificial} set.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        LLVMMetadataRef("Type", "the underlying type")
    )

    charUTF8.const.p(
        "DITypeGetName",
        "Get the name of this {@code DIType}.",

        LLVMMetadataRef("DType", "the DIType"),
        AutoSizeResult..size_t.p("Length", "the length of the returned string")
    )

    uint64_t(
        "DITypeGetSizeInBits",
        "Get the size of this {@code DIType} in bits.",

        LLVMMetadataRef("DType", "the DIType")
    )

    uint64_t(
        "DITypeGetOffsetInBits",
        "Get the offset of this {@code DIType} in bits.",

        LLVMMetadataRef("DType", "the DIType")
    )

    uint32_t(
        "DITypeGetAlignInBits",
        "Get the alignment of this {@code DIType} in bits.",

        LLVMMetadataRef("DType", "the DIType")
    )

    unsigned_int(
        "DITypeGetLine",
        "Get the source line where this {@code DIType} is declared.",

        LLVMMetadataRef("DType", "the DIType")
    )

    LLVMDIFlags(
        "DITypeGetFlags",
        "Get the flags associated with this {@code DIType}.",

        LLVMMetadataRef("DType", "the DIType")
    )

    LLVMMetadataRef(
        "DIBuilderGetOrCreateSubrange",
        "Create a descriptor for a value range.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        int64_t("LowerBound", "lower bound of the subrange, e.g. 0 for C, 1 for Fortran."),
        int64_t("Count", "count of elements in the subrange")
    )

    LLVMMetadataRef(
        "DIBuilderGetOrCreateArray",
        "Create an array of {@code DI} Nodes.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        LLVMMetadataRef.p("Data", "the DI Node elements"),
        AutoSize("Data")..size_t("NumElements", "number of DI Node elements")
    )

    LLVMMetadataRef(
        "DIBuilderCreateExpression",
        "Create a new descriptor for the specified variable which has a complex address expression for its address.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        int64_t.p("Addr", "an array of complex address operations"),
        AutoSize("Addr")..size_t("Length", "length of the address operation array")
    )

    LLVMMetadataRef(
        "DIBuilderCreateConstantValueExpression",
        "Create a new descriptor for the specified variable that does not have an address, but does have a constant value.",

        LLVMDIBuilderRef("Builder", "the DIBuilder"),
        int64_t("Value", "the constant value")
    )

    LLVMMetadataRef(
        "DIBuilderCreateGlobalVariableExpression",
        "Create a new descriptor for the specified variable.",

        LLVMDIBuilderRef("Builder", ""),
        LLVMMetadataRef("Scope", "variable scope"),
        charUTF8.const.p("Name", "name of the variable"),
        AutoSize("Name")..size_t("NameLen", "the length of the C string passed to {@code Name}"),
        charUTF8.const.p("Linkage", "mangled  name of the variable"),
        AutoSize("Linkage")..size_t("LinkLen", "the length of the C string passed to {@code Linkage}"),
        LLVMMetadataRef("File", "file where this variable is defined"),
        unsigned_int("LineNo", "line number"),
        LLVMMetadataRef("Ty", "variable Type"),
        LLVMBool("LocalToUnit", "boolean flag indicate whether this variable is externally visible or not"),
        LLVMMetadataRef("Expr", "the location of the global relative to the attached GlobalVariable"),
        LLVMMetadataRef("Decl", "reference to the corresponding declaration. variables."),
        uint32_t("AlignInBits", "variable alignment(or 0 if no alignment attr was specified)")
    )

    IgnoreMissing..LLVMMetadataRef(
        "DIGlobalVariableExpressionGetVariable",
        """
        Retrieves the {@code DIVariable} associated with this global variable expression.

        See {@code llvm::DIGlobalVariableExpression::getVariable()}.
        """,

        LLVMMetadataRef("GVE", "the global variable expression"),

        since = "9"
    )

    IgnoreMissing..LLVMMetadataRef(
        "DIGlobalVariableExpressionGetExpression",
        """
        Retrieves the {@code DIExpression} associated with this global variable expression.

        See {@code llvm::DIGlobalVariableExpression::getExpression()}.
        """,

        LLVMMetadataRef("GVE", "the global variable expression"),

        since = "9"
    )

    IgnoreMissing..LLVMMetadataRef(
        "DIVariableGetFile",
        """
        Get the metadata of the file associated with a given variable.

        See {@code DIVariable::getFile()},
        """,

        LLVMMetadataRef("Var", "the variable object"),

        since = "9"
    )

    IgnoreMissing..LLVMMetadataRef(
        "DIVariableGetScope",
        """
        Get the metadata of the scope associated with a given variable.

        See {@code DIVariable::getScope()},
        """,

        LLVMMetadataRef("Var", "the variable object"),

        since = "9"
    )

    IgnoreMissing..unsigned(
        "DIVariableGetLine",
        """
        Get the source line where this {@code DIVariable} is declared.

        See {@code DIVariable::getLine()}.
        """,

        LLVMMetadataRef("Var", "the {@code DIVariable}"),

        since = "9"
    )

    LLVMMetadataRef(
        "TemporaryMDNode",
        """
        Create a new temporary {@code MDNode}. Suitable for use in constructing cyclic {@code MDNode} structures. A temporary {@code MDNode} is not uniqued,
        may be RAUW'd, and must be manually deleted with {@code LLVMDisposeTemporaryMDNode}.
        """,

        LLVMContextRef("Ctx", "the context in which to construct the temporary node"),
        LLVMMetadataRef.p("Data", "the metadata elements"),
        AutoSize("Data")..size_t("NumElements", "number of metadata elements")
    )

    void(
        "DisposeTemporaryMDNode",
        """
        Deallocate a temporary node.

        Calls {@code replaceAllUsesWith(nullptr)} before deleting, so any remaining references will be reset.
        """,

        LLVMMetadataRef("TempNode", "the temporary metadata node")
    )

    void(
        "MetadataReplaceAllUsesWith",
        "Replace all uses of temporary metadata.",

        LLVMMetadataRef("TempTargetMetadata", "the temporary metadata node"),
        LLVMMetadataRef("Replacement", "the replacement metadata node")
    )

    LLVMMetadataRef(
        "DIBuilderCreateTempGlobalVariableFwdDecl",
        "Create a new descriptor for the specified global variable that is temporary and meant to be RAUWed.",

        LLVMDIBuilderRef("Builder", ""),
        LLVMMetadataRef("Scope", "variable scope"),
        charUTF8.const.p("Name", "name of the variable"),
        AutoSize("Name")..size_t("NameLen", "the length of the C string passed to {@code Name}"),
        charUTF8.const.p("Linkage", "mangled  name of the variable"),
        AutoSize("Linkage")..size_t("LnkLen", "the length of the C string passed to {@code Linkage}"),
        LLVMMetadataRef("File", "file where this variable is defined"),
        unsigned_int("LineNo", "line number"),
        LLVMMetadataRef("Ty", "variable Type"),
        LLVMBool("LocalToUnit", "boolean flag indicate whether this variable is externally visible or not"),
        LLVMMetadataRef("Decl", "reference to the corresponding declaration"),
        uint32_t("AlignInBits", "variable alignment(or 0 if no alignment attr was specified)")
    )

    LLVMValueRef(
        "DIBuilderInsertDeclareBefore",
        "Insert a new {@code llvm.dbg.declare} intrinsic call before the given instruction.",

        LLVMDIBuilderRef("Builder", "the {@code DIBuilder}"),
        LLVMValueRef("Storage", "the storage of the variable to declare"),
        LLVMMetadataRef("VarInfo", "the variable's debug info descriptor"),
        LLVMMetadataRef("Expr", "a complex location expression for the variable"),
        LLVMMetadataRef("DebugLoc", "debug info location"),
        LLVMValueRef("Instr", "instruction acting as a location for the new intrinsic")
    )

    LLVMValueRef(
        "DIBuilderInsertDeclareAtEnd",
        """
        Insert a new {@code llvm.dbg.declare} intrinsic call at the end of the given basic block. If the basic block has a terminator instruction, the
        intrinsic is inserted before that terminator instruction.
        """,

        LLVMDIBuilderRef("Builder", "the {@code DIBuilder}"),
        LLVMValueRef("Storage", "the storage of the variable to declare"),
        LLVMMetadataRef("VarInfo", "the variable's debug info descriptor"),
        LLVMMetadataRef("Expr", "a complex location expression for the variable"),
        LLVMMetadataRef("DebugLoc", "debug info location"),
        LLVMBasicBlockRef("Block", "basic block acting as a location for the new intrinsic")
    )

    LLVMValueRef(
        "DIBuilderInsertDbgValueBefore",
        "Insert a new {@code llvm.dbg.value} intrinsic call before the given instruction.",

        LLVMDIBuilderRef("Builder", "the {@code DIBuilder}"),
        LLVMValueRef("Val", "the value of the variable"),
        LLVMMetadataRef("VarInfo", "the variable's debug info descriptor"),
        LLVMMetadataRef("Expr", "a complex location expression for the variable"),
        LLVMMetadataRef("DebugLoc", "debug info location"),
        LLVMValueRef("Instr", "instruction acting as a location for the new intrinsic")
    )

    LLVMValueRef(
        "DIBuilderInsertDbgValueAtEnd",
        """
        Insert a new {@code llvm.dbg.value} intrinsic call at the end of the given basic block. If the basic block has a terminator instruction, the intrinsic
        is inserted before that terminator instruction.
        """,

        LLVMDIBuilderRef("Builder", "the {@code DIBuilder}"),
        LLVMValueRef("Val", "the value of the variable"),
        LLVMMetadataRef("VarInfo", "the variable's debug info descriptor"),
        LLVMMetadataRef("Expr", "a complex location expression for the variable"),
        LLVMMetadataRef("DebugLoc", "debug info location"),
        LLVMBasicBlockRef("Block", "basic block acting as a location for the new intrinsic")
    )

    LLVMMetadataRef(
        "DIBuilderCreateAutoVariable",
        "Create a new descriptor for a local auto variable.",

        LLVMDIBuilderRef("Builder", "the {@code DIBuilder}"),
        LLVMMetadataRef("Scope", "the local scope the variable is declared in"),
        charUTF8.const.p("Name", "variable name"),
        AutoSize("Name")..size_t("NameLen", "length of variable name"),
        LLVMMetadataRef("File", "file where this variable is defined"),
        unsigned_int("LineNo", "line number"),
        LLVMMetadataRef("Ty", "metadata describing the type of the variable"),
        LLVMBool("AlwaysPreserve", "if true, this descriptor will survive optimizations"),
        LLVMDIFlags("Flags", "flags"),
        uint32_t("AlignInBits", "variable alignment")
    )

    LLVMMetadataRef(
        "DIBuilderCreateParameterVariable",
        "Create a new descriptor for a function parameter variable.",

        LLVMDIBuilderRef("Builder", "the {@code DIBuilder}"),
        LLVMMetadataRef("Scope", "the local scope the variable is declared in"),
        charUTF8.const.p("Name", "variable name"),
        AutoSize("Name")..size_t("NameLen", "length of variable name"),
        unsigned_int("ArgNo", "unique argument number for this variable; starts at 1"),
        LLVMMetadataRef("File", "file where this variable is defined"),
        unsigned_int("LineNo", "line number"),
        LLVMMetadataRef("Ty", "metadata describing the type of the variable"),
        LLVMBool("AlwaysPreserve", "if true, this descriptor will survive optimizations"),
        LLVMDIFlags("Flags", "flags")
    )

    LLVMMetadataRef(
        "GetSubprogram",
        "Get the metadata of the subprogram attached to a function.",

        LLVMValueRef("Func", "")
    )

    void(
        "SetSubprogram",
        "Set the subprogram attached to a function.",

        LLVMValueRef("Func", ""),
        LLVMMetadataRef("SP", "")
    )

    IgnoreMissing..unsigned(
        "DISubprogramGetLine",
        """
        Get the line associated with a given subprogram.

        See {@code DISubprogram::getLine()}.
        """,

        LLVMMetadataRef("Subprogram", "the subprogram object"),

        since = "9"
    )

    IgnoreMissing..unsigned(
        "InstructionGetDebugLoc",
        """
        Get the debug location for the given instruction.

        See {@code llvm::Instruction::getDebugLoc()}
        """,

        LLVMValueRef("Inst", ""),

        since = "9"
    )

    IgnoreMissing..void(
        "InstructionSetDebugLoc",
        """
        Set the debug location for the given instruction.

        To clear the location metadata of the given instruction, pass #NULL to {@code Loc}.

        See {@code llvm::Instruction::setDebugLoc()}        
        """,

        LLVMValueRef("Inst", ""),
        nullable..LLVMMetadataRef("Loc", ""),

        since = "9"
    )

    IgnoreMissing..LLVMMetadataKind(
        "GetMetadataKind",
        "Obtain the enumerated type of a Metadata instance.",

        LLVMMetadataRef("Metadata", "")
    )
}