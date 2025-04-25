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
    EnumConstant(
        "DIFlagZero".enum("0"),
        "DIFlagPrivate".enum,
        "DIFlagProtected".enum,
        "DIFlagPublic".enum,
        "DIFlagFwdDecl".enum("1 << 2"),
        "DIFlagAppleBlock".enum("1 << 3"),
        "DIFlagReservedBit4".enum("1 << 4"),
        "DIFlagVirtual".enum("1 << 5"),
        "DIFlagArtificial".enum("1 << 6"),
        "DIFlagExplicit".enum("1 << 7"),
        "DIFlagPrototyped".enum("1 << 8"),
        "DIFlagObjcClassComplete".enum("1 << 9"),
        "DIFlagObjectPointer".enum("1 << 10"),
        "DIFlagVector".enum("1 << 11"),
        "DIFlagStaticMember".enum("1 << 12"),
        "DIFlagLValueReference".enum("1 << 13"),
        "DIFlagRValueReference".enum("1 << 14"),
        "DIFlagReserved".enum("1 << 15"),
        "DIFlagSingleInheritance".enum("1 << 16"),
        "DIFlagMultipleInheritance".enum("2 << 16"),
        "DIFlagVirtualInheritance".enum("3 << 16"),
        "DIFlagIntroducedVirtual".enum("1 << 18"),
        "DIFlagBitField".enum("1 << 19"),
        "DIFlagNoReturn".enum("1 << 20"),
        "DIFlagTypePassByValue".enum("1 << 22"),
        "DIFlagTypePassByReference".enum("1 << 23"),
        "DIFlagEnumClass".enum("1 << 24"),
        "DIFlagFixedEnum".enum("LLVMDIFlagEnumClass"),
        "DIFlagThunk".enum("1 << 25"),
        "DIFlagNonTrivial".enum("1 << 26"),
        "DIFlagBigEndian".enum("1 << 27"),
        "DIFlagLittleEndian".enum("1 << 28"),
        "DIFlagIndirectVirtualBase".enum("(1 << 2) | (1 << 5)"),
        "DIFlagAccessibility".enum("LLVMDIFlagPrivate | LLVMDIFlagProtected | LLVMDIFlagPublic"),
        "DIFlagPtrToMemberRep".enum("LLVMDIFlagSingleInheritance | LLVMDIFlagMultipleInheritance | LLVMDIFlagVirtualInheritance")
    )

    EnumConstant(
        "DWARFSourceLanguageC89".enum("0"),
        "DWARFSourceLanguageC".enum,
        "DWARFSourceLanguageAda83".enum,
        "DWARFSourceLanguageC_plus_plus".enum,
        "DWARFSourceLanguageCobol74".enum,
        "DWARFSourceLanguageCobol85".enum,
        "DWARFSourceLanguageFortran77".enum,
        "DWARFSourceLanguageFortran90".enum,
        "DWARFSourceLanguagePascal83".enum,
        "DWARFSourceLanguageModula2".enum,
        "DWARFSourceLanguageJava".enum,
        "DWARFSourceLanguageC99".enum,
        "DWARFSourceLanguageAda95".enum,
        "DWARFSourceLanguageFortran95".enum,
        "DWARFSourceLanguagePLI".enum,
        "DWARFSourceLanguageObjC".enum,
        "DWARFSourceLanguageObjC_plus_plus".enum,
        "DWARFSourceLanguageUPC".enum,
        "DWARFSourceLanguageD".enum,
        "DWARFSourceLanguagePython".enum,
        "DWARFSourceLanguageOpenCL".enum,
        "DWARFSourceLanguageGo".enum,
        "DWARFSourceLanguageModula3".enum,
        "DWARFSourceLanguageHaskell".enum,
        "DWARFSourceLanguageC_plus_plus_03".enum,
        "DWARFSourceLanguageC_plus_plus_11".enum,
        "DWARFSourceLanguageOCaml".enum,
        "DWARFSourceLanguageRust".enum,
        "DWARFSourceLanguageC11".enum,
        "DWARFSourceLanguageSwift".enum,
        "DWARFSourceLanguageJulia".enum,
        "DWARFSourceLanguageDylan".enum,
        "DWARFSourceLanguageC_plus_plus_14".enum,
        "DWARFSourceLanguageFortran03".enum,
        "DWARFSourceLanguageFortran08".enum,
        "DWARFSourceLanguageRenderScript".enum,
        "DWARFSourceLanguageBLISS".enum,
        "DWARFSourceLanguageKotlin".enum,
        "DWARFSourceLanguageZig".enum,
        "DWARFSourceLanguageCrystal".enum,
        "DWARFSourceLanguageC_plus_plus_17".enum,
        "DWARFSourceLanguageC_plus_plus_20".enum,
        "DWARFSourceLanguageC17".enum,
        "DWARFSourceLanguageFortran18".enum,
        "DWARFSourceLanguageAda2005".enum,
        "DWARFSourceLanguageAda2012".enum,
        "DWARFSourceLanguageHIP".enum,
        "DWARFSourceLanguageAssembly".enum,
        "DWARFSourceLanguageC_sharp".enum,
        "DWARFSourceLanguageMojo".enum,
        "DWARFSourceLanguageGLSL".enum,
        "DWARFSourceLanguageGLSL_ES".enum,
        "DWARFSourceLanguageHLSL".enum,
        "DWARFSourceLanguageOpenCL_CPP".enum,
        "DWARFSourceLanguageCPP_for_OpenCL".enum,
        "DWARFSourceLanguageSYCL".enum,
        "DWARFSourceLanguageRuby".enum,
        "DWARFSourceLanguageMove".enum,
        "DWARFSourceLanguageHylo".enum,
        "DWARFSourceLanguageMetal".enum,
        "DWARFSourceLanguageMips_Assembler".enum,
        "DWARFSourceLanguageGOOGLE_RenderScript".enum,
        "DWARFSourceLanguageBORLAND_Delphi".enum
    )

    EnumConstant(
        "DWARFEmissionNone".enum("0"),
        "DWARFEmissionFull".enum,
        "DWARFEmissionLineTablesOnly".enum
    )

    EnumConstant(
        "MDStringMetadataKind".enum("0"),
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
        "DIArgListMetadataKind".enum,
        "DIAssignIDMetadataKind".enum
    )

    EnumConstant(
        "DWARFMacinfoRecordTypeDefine".enum("0x01"),
        "DWARFMacinfoRecordTypeMacro".enum("0x02"),
        "DWARFMacinfoRecordTypeStartFile".enum("0x03"),
        "DWARFMacinfoRecordTypeEndFile".enum("0x04"),
        "DWARFMacinfoRecordTypeVendorExt".enum("0xff")
    )

    unsigned_int(
        "DebugMetadataVersion",
        void()
    )

    unsigned_int(
        "GetModuleDebugMetadataVersion",

        LLVMModuleRef("Module")
    )

    LLVMBool(
        "StripModuleDebugInfo",

        LLVMModuleRef("Module")
    )

    LLVMDIBuilderRef(
        "CreateDIBuilderDisallowUnresolved",

        LLVMModuleRef("M")
    )

    LLVMDIBuilderRef(
        "CreateDIBuilder",

        LLVMModuleRef("M")
    )

    void(
        "DisposeDIBuilder",

        LLVMDIBuilderRef("Builder")
    )

    void(
        "DIBuilderFinalize",

        LLVMDIBuilderRef("Builder")
    )

    IgnoreMissing..void(
        "DIBuilderFinalizeSubprogram",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Subprogram")
    )

    LLVMMetadataRef(
        "DIBuilderCreateCompileUnit",

        LLVMDIBuilderRef("Builder"),
        LLVMDWARFSourceLanguage("Lang"),
        LLVMMetadataRef("FileRef"),
        charUTF8.const.p("Producer"),
        AutoSize("Producer")..size_t("ProducerLen"),
        LLVMBool("isOptimized"),
        charUTF8.const.p("Flags"),
        AutoSize("Flags")..size_t("FlagsLen"),
        unsigned_int("RuntimeVer"),
        charUTF8.const.p("SplitName"),
        AutoSize("SplitName")..size_t("SplitNameLen"),
        LLVMDWARFEmissionKind("Kind"),
        unsigned_int("DWOId"),
        LLVMBool("SplitDebugInlining"),
        LLVMBool("DebugInfoForProfiling"),
        charUTF8.const.p("SysRoot"),
        AutoSize("SysRoot")..size_t("SysRootLen"),
        charUTF8.const.p("SDK"),
        AutoSize("SDK")..size_t("SDKLen")
    )

    LLVMMetadataRef(
        "DIBuilderCreateFile",

        LLVMDIBuilderRef("Builder"),
        charUTF8.const.p("Filename"),
        AutoSize("Filename")..size_t("FilenameLen"),
        charUTF8.const.p("Directory"),
        AutoSize("Directory")..size_t("DirectoryLen")
    )

    LLVMMetadataRef(
        "DIBuilderCreateModule",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("ParentScope"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        charUTF8.const.p("ConfigMacros"),
        AutoSize("ConfigMacros")..size_t("ConfigMacrosLen"),
        charUTF8.const.p("IncludePath"),
        AutoSize("IncludePath")..size_t("IncludePathLen"),
        charUTF8.const.p("APINotesFile"),
        AutoSize("APINotesFile")..size_t("APINotesFileLen")
    )

    LLVMMetadataRef(
        "DIBuilderCreateNameSpace",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("ParentScope"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        LLVMBool("ExportSymbols")
    )

    LLVMMetadataRef(
        "DIBuilderCreateFunction",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Scope"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        charUTF8.const.p("LinkageName"),
        AutoSize("LinkageName")..size_t("LinkageNameLen"),
        LLVMMetadataRef("File"),
        unsigned_int("LineNo"),
        LLVMMetadataRef("Ty"),
        LLVMBool("IsLocalToUnit"),
        LLVMBool("IsDefinition"),
        unsigned_int("ScopeLine"),
        LLVMDIFlags("Flags"),
        LLVMBool("IsOptimized")
    )

    LLVMMetadataRef(
        "DIBuilderCreateLexicalBlock",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Scope"),
        LLVMMetadataRef("File"),
        unsigned_int("Line"),
        unsigned_int("Column")
    )

    LLVMMetadataRef(
        "DIBuilderCreateLexicalBlockFile",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Scope"),
        LLVMMetadataRef("File"),
        unsigned_int("Discriminator")
    )

    LLVMMetadataRef(
        "DIBuilderCreateImportedModuleFromNamespace",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Scope"),
        LLVMMetadataRef("NS"),
        LLVMMetadataRef("File"),
        unsigned_int("Line")
    )

    LLVMMetadataRef(
        "DIBuilderCreateImportedModuleFromAlias",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Scope"),
        LLVMMetadataRef("ImportedEntity"),
        LLVMMetadataRef("File"),
        unsigned_int("Line"),
        nullable..LLVMMetadataRef.p("Elements"),
        AutoSize("Elements")..unsigned("NumElements")
    )

    LLVMMetadataRef(
        "DIBuilderCreateImportedModuleFromModule",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Scope"),
        LLVMMetadataRef("M"),
        LLVMMetadataRef("File"),
        unsigned_int("Line"),
        nullable..LLVMMetadataRef.p("Elements"),
        AutoSize("Elements")..unsigned("NumElements")
    )

    LLVMMetadataRef(
        "DIBuilderCreateImportedDeclaration",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Scope"),
        LLVMMetadataRef("Decl"),
        LLVMMetadataRef("File"),
        unsigned_int("Line"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        nullable..LLVMMetadataRef.p("Elements"),
        AutoSize("Elements")..unsigned("NumElements")
    )

    LLVMMetadataRef(
        "DIBuilderCreateDebugLocation",

        LLVMContextRef("Ctx"),
        unsigned_int("Line"),
        unsigned_int("Column"),
        LLVMMetadataRef("Scope"),
        LLVMMetadataRef("InlinedAt")
    )

    unsigned_int(
        "DILocationGetLine",

        LLVMMetadataRef("Location")
    )

    unsigned_int(
        "DILocationGetColumn",

        LLVMMetadataRef("Location")
    )

    LLVMMetadataRef(
        "DILocationGetScope",

        LLVMMetadataRef("Location")
    )

    IgnoreMissing..LLVMMetadataRef(
        "DILocationGetInlinedAt",

        LLVMMetadataRef("Location")
    )

    IgnoreMissing..LLVMMetadataRef(
        "DIScopeGetFile",

        LLVMMetadataRef("Scope")
    )

    IgnoreMissing..charUTF8.const.p(
        "DIFileGetDirectory",

        LLVMMetadataRef("File"),
        AutoSizeResult..Check(1)..unsigned.p("Len")
    )

    IgnoreMissing..charUTF8.const.p(
        "DIFileGetFilename",

        LLVMMetadataRef("File"),
        AutoSizeResult..Check(1)..unsigned.p("Len")
    )

    IgnoreMissing..charUTF8.const.p(
        "DIFileGetSource",

        LLVMMetadataRef("File"),
        AutoSizeResult..Check(1)..unsigned.p("Len")
    )

    LLVMMetadataRef(
        "DIBuilderGetOrCreateTypeArray",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef.p("Data"),
        AutoSize("Data")..size_t("NumElements")
    )

    LLVMMetadataRef(
        "DIBuilderCreateSubroutineType",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("File"),
        LLVMMetadataRef.p("ParameterTypes"),
        AutoSize("ParameterTypes")..unsigned_int("NumParameterTypes"),
        LLVMDIFlags("Flags")
    )

    IgnoreMissing..LLVMMetadataRef(
        "DIBuilderCreateMacro",

        LLVMDIBuilderRef("Builder"),
        nullable..LLVMMetadataRef("ParentMacroFile"),
        unsigned("Line"),
        LLVMDWARFMacinfoRecordType("RecordType"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        charUTF8.const.p("Value"),
        AutoSize("Value")..size_t("ValueLen")
    )

    IgnoreMissing..LLVMMetadataRef(
        "DIBuilderCreateTempMacroFile",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("ParentMacroFile"),
        unsigned("Line"),
        LLVMMetadataRef("File")
    )

    IgnoreMissing..LLVMMetadataRef(
        "DIBuilderCreateEnumerator",

        LLVMDIBuilderRef("Builder"),
        char.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        int64_t("Value"),
        LLVMBool("IsUnsigned")
    )

    LLVMMetadataRef(
        "DIBuilderCreateEnumerationType",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Scope"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        LLVMMetadataRef("File"),
        unsigned_int("LineNumber"),
        uint64_t("SizeInBits"),
        uint32_t("AlignInBits"),
        LLVMMetadataRef.p("Elements"),
        AutoSize("Elements")..unsigned_int("NumElements"),
        LLVMMetadataRef("ClassTy")
    )

    LLVMMetadataRef(
        "DIBuilderCreateUnionType",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Scope"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        LLVMMetadataRef("File"),
        unsigned_int("LineNumber"),
        uint64_t("SizeInBits"),
        uint32_t("AlignInBits"),
        LLVMDIFlags("Flags"),
        LLVMMetadataRef.p("Elements"),
        AutoSize("Elements")..unsigned_int("NumElements"),
        unsigned_int("RunTimeLang"),
        charUTF8.const.p("UniqueId"),
        AutoSize("UniqueId")..size_t("UniqueIdLen")
    )

    LLVMMetadataRef(
        "DIBuilderCreateArrayType",

        LLVMDIBuilderRef("Builder"),
        uint64_t("Size"),
        uint32_t("AlignInBits"),
        LLVMMetadataRef("Ty"),
        LLVMMetadataRef.p("Subscripts"),
        AutoSize("Subscripts")..unsigned_int("NumSubscripts")
    )

    LLVMMetadataRef(
        "DIBuilderCreateVectorType",

        LLVMDIBuilderRef("Builder"),
        uint64_t("Size"),
        uint32_t("AlignInBits"),
        LLVMMetadataRef("Ty"),
        LLVMMetadataRef.p("Subscripts"),
        AutoSize("Subscripts")..unsigned_int("NumSubscripts")
    )

    LLVMMetadataRef(
        "DIBuilderCreateUnspecifiedType",

        LLVMDIBuilderRef("Builder"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen")
    )

    LLVMMetadataRef(
        "DIBuilderCreateBasicType",

        LLVMDIBuilderRef("Builder"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        uint64_t("SizeInBits"),
        LLVMDWARFTypeEncoding("Encoding"),
        LLVMDIFlags("Flags")
    )

    LLVMMetadataRef(
        "DIBuilderCreatePointerType",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("PointeeTy"),
        uint64_t("SizeInBits"),
        uint32_t("AlignInBits"),
        unsigned_int("AddressSpace"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen")
    )

    LLVMMetadataRef(
        "DIBuilderCreateStructType",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Scope"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        LLVMMetadataRef("File"),
        unsigned_int("LineNumber"),
        uint64_t("SizeInBits"),
        uint32_t("AlignInBits"),
        LLVMDIFlags("Flags"),
        LLVMMetadataRef("DerivedFrom"),
        LLVMMetadataRef.p("Elements"),
        AutoSize("Elements")..unsigned_int("NumElements"),
        unsigned_int("RunTimeLang"),
        LLVMMetadataRef("VTableHolder"),
        charUTF8.const.p("UniqueId"),
        AutoSize("UniqueId")..size_t("UniqueIdLen")
    )

    LLVMMetadataRef(
        "DIBuilderCreateMemberType",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Scope"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        LLVMMetadataRef("File"),
        unsigned_int("LineNo"),
        uint64_t("SizeInBits"),
        uint32_t("AlignInBits"),
        uint64_t("OffsetInBits"),
        LLVMDIFlags("Flags"),
        LLVMMetadataRef("Ty")
    )

    LLVMMetadataRef(
        "DIBuilderCreateStaticMemberType",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Scope"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        LLVMMetadataRef("File"),
        unsigned_int("LineNumber"),
        LLVMMetadataRef("Type"),
        LLVMDIFlags("Flags"),
        LLVMValueRef("ConstantVal"),
        uint32_t("AlignInBits")
    )

    LLVMMetadataRef(
        "DIBuilderCreateMemberPointerType",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("PointeeType"),
        LLVMMetadataRef("ClassType"),
        uint64_t("SizeInBits"),
        uint32_t("AlignInBits"),
        LLVMDIFlags("Flags")
    )

    LLVMMetadataRef(
        "DIBuilderCreateObjCIVar",

        LLVMDIBuilderRef("Builder"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        LLVMMetadataRef("File"),
        unsigned_int("LineNo"),
        uint64_t("SizeInBits"),
        uint32_t("AlignInBits"),
        uint64_t("OffsetInBits"),
        LLVMDIFlags("Flags"),
        LLVMMetadataRef("Ty"),
        LLVMMetadataRef("PropertyNode")
    )

    LLVMMetadataRef(
        "DIBuilderCreateObjCProperty",

        LLVMDIBuilderRef("Builder"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        LLVMMetadataRef("File"),
        unsigned_int("LineNo"),
        charUTF8.const.p("GetterName"),
        AutoSize("GetterName")..size_t("GetterNameLen"),
        charUTF8.const.p("SetterName"),
        AutoSize("SetterName")..size_t("SetterNameLen"),
        unsigned_int("PropertyAttributes"),
        LLVMMetadataRef("Ty")
    )

    LLVMMetadataRef(
        "DIBuilderCreateObjectPointerType",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Type"),
        LLVMBool("Implicit")
    )

    LLVMMetadataRef(
        "DIBuilderCreateQualifiedType",

        LLVMDIBuilderRef("Builder"),
        unsigned_int("Tag"),
        LLVMMetadataRef("Type")
    )

    LLVMMetadataRef(
        "DIBuilderCreateReferenceType",

        LLVMDIBuilderRef("Builder"),
        unsigned_int("Tag"),
        LLVMMetadataRef("Type")
    )

    LLVMMetadataRef(
        "DIBuilderCreateNullPtrType",

        LLVMDIBuilderRef("Builder")
    )

    LLVMMetadataRef(
        "DIBuilderCreateTypedef",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Type"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        LLVMMetadataRef("File"),
        unsigned_int("LineNo"),
        LLVMMetadataRef("Scope"),
        uint32_t("AlignInBits")
    )

    LLVMMetadataRef(
        "DIBuilderCreateInheritance",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Ty"),
        LLVMMetadataRef("BaseTy"),
        uint64_t("BaseOffset"),
        uint32_t("VBPtrOffset"),
        LLVMDIFlags("Flags")
    )

    LLVMMetadataRef(
        "DIBuilderCreateForwardDecl",

        LLVMDIBuilderRef("Builder"),
        unsigned_int("Tag"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        LLVMMetadataRef("Scope"),
        LLVMMetadataRef("File"),
        unsigned_int("Line"),
        unsigned_int("RuntimeLang"),
        uint64_t("SizeInBits"),
        uint32_t("AlignInBits"),
        charUTF8.const.p("UniqueIdentifier"),
        AutoSize("UniqueIdentifier")..size_t("UniqueIdentifierLen")
    )

    LLVMMetadataRef(
        "DIBuilderCreateReplaceableCompositeType",

        LLVMDIBuilderRef("Builder"),
        unsigned_int("Tag"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        LLVMMetadataRef("Scope"),
        LLVMMetadataRef("File"),
        unsigned_int("Line"),
        unsigned_int("RuntimeLang"),
        uint64_t("SizeInBits"),
        uint32_t("AlignInBits"),
        LLVMDIFlags("Flags"),
        charUTF8.const.p("UniqueIdentifier"),
        AutoSize("UniqueIdentifier")..size_t("UniqueIdentifierLen")
    )

    LLVMMetadataRef(
        "DIBuilderCreateBitFieldMemberType",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Scope"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        LLVMMetadataRef("File"),
        unsigned_int("LineNumber"),
        uint64_t("SizeInBits"),
        uint64_t("OffsetInBits"),
        uint64_t("StorageOffsetInBits"),
        LLVMDIFlags("Flags"),
        LLVMMetadataRef("Type")
    )

    LLVMMetadataRef(
        "DIBuilderCreateClassType",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Scope"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        LLVMMetadataRef("File"),
        unsigned_int("LineNumber"),
        uint64_t("SizeInBits"),
        uint32_t("AlignInBits"),
        uint64_t("OffsetInBits"),
        LLVMDIFlags("Flags"),
        LLVMMetadataRef("DerivedFrom"),
        LLVMMetadataRef.p("Elements"),
        AutoSize("Elements")..unsigned_int("NumElements"),
        LLVMMetadataRef("VTableHolder"),
        LLVMMetadataRef("TemplateParamsNode"),
        charUTF8.const.p("UniqueIdentifier"),
        AutoSize("UniqueIdentifier")..size_t("UniqueIdentifierLen")
    )

    LLVMMetadataRef(
        "DIBuilderCreateArtificialType",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Type")
    )

    charUTF8.const.p(
        "DITypeGetName",

        LLVMMetadataRef("DType"),
        AutoSizeResult..size_t.p("Length")
    )

    uint64_t(
        "DITypeGetSizeInBits",

        LLVMMetadataRef("DType")
    )

    uint64_t(
        "DITypeGetOffsetInBits",

        LLVMMetadataRef("DType")
    )

    uint32_t(
        "DITypeGetAlignInBits",

        LLVMMetadataRef("DType")
    )

    unsigned_int(
        "DITypeGetLine",

        LLVMMetadataRef("DType")
    )

    LLVMDIFlags(
        "DITypeGetFlags",

        LLVMMetadataRef("DType")
    )

    LLVMMetadataRef(
        "DIBuilderGetOrCreateSubrange",

        LLVMDIBuilderRef("Builder"),
        int64_t("LowerBound"),
        int64_t("Count")
    )

    LLVMMetadataRef(
        "DIBuilderGetOrCreateArray",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef.p("Data"),
        AutoSize("Data")..size_t("NumElements")
    )

    LLVMMetadataRef(
        "DIBuilderCreateExpression",

        LLVMDIBuilderRef("Builder"),
        uint64_t.p("Addr"),
        AutoSize("Addr")..size_t("Length")
    )

    LLVMMetadataRef(
        "DIBuilderCreateConstantValueExpression",

        LLVMDIBuilderRef("Builder"),
        uint64_t("Value")
    )

    LLVMMetadataRef(
        "DIBuilderCreateGlobalVariableExpression",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Scope"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        charUTF8.const.p("Linkage"),
        AutoSize("Linkage")..size_t("LinkLen"),
        LLVMMetadataRef("File"),
        unsigned_int("LineNo"),
        LLVMMetadataRef("Ty"),
        LLVMBool("LocalToUnit"),
        LLVMMetadataRef("Expr"),
        LLVMMetadataRef("Decl"),
        uint32_t("AlignInBits")
    )

    IgnoreMissing..uint16_t(
        "GetDINodeTag",

        LLVMMetadataRef("MD")
    )

    IgnoreMissing..LLVMMetadataRef(
        "DIGlobalVariableExpressionGetVariable",

        LLVMMetadataRef("GVE")
    )

    IgnoreMissing..LLVMMetadataRef(
        "DIGlobalVariableExpressionGetExpression",

        LLVMMetadataRef("GVE")
    )

    IgnoreMissing..LLVMMetadataRef(
        "DIVariableGetFile",

        LLVMMetadataRef("Var")
    )

    IgnoreMissing..LLVMMetadataRef(
        "DIVariableGetScope",

        LLVMMetadataRef("Var")
    )

    IgnoreMissing..unsigned(
        "DIVariableGetLine",

        LLVMMetadataRef("Var")
    )

    LLVMMetadataRef(
        "TemporaryMDNode",

        LLVMContextRef("Ctx"),
        LLVMMetadataRef.p("Data"),
        AutoSize("Data")..size_t("NumElements")
    )

    void(
        "DisposeTemporaryMDNode",

        LLVMMetadataRef("TempNode")
    )

    void(
        "MetadataReplaceAllUsesWith",

        LLVMMetadataRef("TempTargetMetadata"),
        LLVMMetadataRef("Replacement")
    )

    LLVMMetadataRef(
        "DIBuilderCreateTempGlobalVariableFwdDecl",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Scope"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        charUTF8.const.p("Linkage"),
        AutoSize("Linkage")..size_t("LnkLen"),
        LLVMMetadataRef("File"),
        unsigned_int("LineNo"),
        LLVMMetadataRef("Ty"),
        LLVMBool("LocalToUnit"),
        LLVMMetadataRef("Decl"),
        uint32_t("AlignInBits")
    )

    IgnoreMissing..LLVMValueRef(
        "DIBuilderInsertDeclareBefore",

        LLVMDIBuilderRef("Builder"),
        LLVMValueRef("Storage"),
        LLVMMetadataRef("VarInfo"),
        LLVMMetadataRef("Expr"),
        LLVMMetadataRef("DebugLoc"),
        LLVMValueRef("Instr")
    )

    IgnoreMissing..LLVMValueRef(
        "DIBuilderInsertDeclareAtEnd",

        LLVMDIBuilderRef("Builder"),
        LLVMValueRef("Storage"),
        LLVMMetadataRef("VarInfo"),
        LLVMMetadataRef("Expr"),
        LLVMMetadataRef("DebugLoc"),
        LLVMBasicBlockRef("Block")
    )

    IgnoreMissing..LLVMValueRef(
        "DIBuilderInsertDbgValueBefore",

        LLVMDIBuilderRef("Builder"),
        LLVMValueRef("Val"),
        LLVMMetadataRef("VarInfo"),
        LLVMMetadataRef("Expr"),
        LLVMMetadataRef("DebugLoc"),
        LLVMValueRef("Instr")
    )

    IgnoreMissing..LLVMValueRef(
        "DIBuilderInsertDbgValueAtEnd",

        LLVMDIBuilderRef("Builder"),
        LLVMValueRef("Val"),
        LLVMMetadataRef("VarInfo"),
        LLVMMetadataRef("Expr"),
        LLVMMetadataRef("DebugLoc"),
        LLVMBasicBlockRef("Block")
    )

    IgnoreMissing..LLVMDbgRecordRef(
        "DIBuilderInsertDeclareRecordBefore",

        LLVMDIBuilderRef("Builder"),
        LLVMValueRef("Storage"),
        LLVMMetadataRef("VarInfo"),
        LLVMMetadataRef("Expr"),
        LLVMMetadataRef("DebugLoc"),
        LLVMValueRef("Instr")
    )

    IgnoreMissing..LLVMDbgRecordRef(
        "DIBuilderInsertDeclareRecordAtEnd",

        LLVMDIBuilderRef("Builder"),
        LLVMValueRef("Storage"),
        LLVMMetadataRef("VarInfo"),
        LLVMMetadataRef("Expr"),
        LLVMMetadataRef("DebugLoc"),
        LLVMBasicBlockRef("Block")
    )

    IgnoreMissing..LLVMDbgRecordRef(
        "DIBuilderInsertDbgValueRecordBefore",

        LLVMDIBuilderRef("Builder"),
        LLVMValueRef("Val"),
        LLVMMetadataRef("VarInfo"),
        LLVMMetadataRef("Expr"),
        LLVMMetadataRef("DebugLoc"),
        LLVMValueRef("Instr")
    )

    IgnoreMissing..LLVMDbgRecordRef(
        "DIBuilderInsertDbgValueRecordAtEnd",

        LLVMDIBuilderRef("Builder"),
        LLVMValueRef("Val"),
        LLVMMetadataRef("VarInfo"),
        LLVMMetadataRef("Expr"),
        LLVMMetadataRef("DebugLoc"),
        LLVMBasicBlockRef("Block")
    )

    LLVMMetadataRef(
        "DIBuilderCreateAutoVariable",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Scope"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        LLVMMetadataRef("File"),
        unsigned_int("LineNo"),
        LLVMMetadataRef("Ty"),
        LLVMBool("AlwaysPreserve"),
        LLVMDIFlags("Flags"),
        uint32_t("AlignInBits")
    )

    LLVMMetadataRef(
        "DIBuilderCreateParameterVariable",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Scope"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        unsigned_int("ArgNo"),
        LLVMMetadataRef("File"),
        unsigned_int("LineNo"),
        LLVMMetadataRef("Ty"),
        LLVMBool("AlwaysPreserve"),
        LLVMDIFlags("Flags")
    )

    LLVMMetadataRef(
        "GetSubprogram",

        LLVMValueRef("Func")
    )

    void(
        "SetSubprogram",

        LLVMValueRef("Func"),
        LLVMMetadataRef("SP")
    )

    IgnoreMissing..unsigned(
        "DISubprogramGetLine",

        LLVMMetadataRef("Subprogram")
    )

    IgnoreMissing..unsigned(
        "InstructionGetDebugLoc",

        LLVMValueRef("Inst")
    )

    IgnoreMissing..void(
        "InstructionSetDebugLoc",

        LLVMValueRef("Inst"),
        nullable..LLVMMetadataRef("Loc")
    )

    IgnoreMissing..LLVMMetadataRef(
        "DIBuilderCreateLabel",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("Context"),
        charUTF8.const.p("Name"),
        AutoSize("Name")..size_t("NameLen"),
        LLVMMetadataRef("File"),
        unsigned("LineNo"),
        LLVMBool("AlwaysPreserve")
    )

    IgnoreMissing..LLVMDbgRecordRef(
        "DIBuilderInsertLabelBefore",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("LabelInfo"),
        LLVMMetadataRef("Location"),
        LLVMValueRef("InsertBefore")
    )

    IgnoreMissing..LLVMDbgRecordRef(
        "DIBuilderInsertLabelAtEnd",

        LLVMDIBuilderRef("Builder"),
        LLVMMetadataRef("LabelInfo"),
        LLVMMetadataRef("Location"),
        LLVMBasicBlockRef("InsertAtEnd")
    )

    IgnoreMissing..LLVMMetadataKind(
        "GetMetadataKind",

        LLVMMetadataRef("Metadata")
    )
}