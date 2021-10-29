/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMCore = "LLVMCore".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING
) {
    EnumConstant(
        "{@code LLVMOpcode}",

        "Ret".enum("", "1"),
        "Br".enum(""),
        "Switch".enum(""),
        "IndirectBr".enum(""),
        "Invoke".enum(""),
        "Unreachable".enum("", "7"),
        "CallBr".enum("", "67"),
        "FNeg".enum("", "66"),
        "Add".enum("", "8"),
        "FAdd".enum(""),
        "Sub".enum(""),
        "FSub".enum(""),
        "Mul".enum(""),
        "FMul".enum(""),
        "UDiv".enum(""),
        "SDiv".enum(""),
        "FDiv".enum(""),
        "URem".enum(""),
        "SRem".enum(""),
        "FRem".enum(""),
        "Shl".enum(""),
        "LShr".enum(""),
        "AShr".enum(""),
        "And".enum(""),
        "Or".enum(""),
        "Xor".enum(""),
        "Alloca".enum(""),
        "Load".enum(""),
        "Store".enum(""),
        "GetElementPtr".enum(""),
        "Trunc".enum(""),
        "ZExt".enum(""),
        "SExt".enum(""),
        "FPToUI".enum(""),
        "FPToSI".enum(""),
        "UIToFP".enum(""),
        "SIToFP".enum(""),
        "FPTrunc".enum(""),
        "FPExt".enum(""),
        "PtrToInt".enum(""),
        "IntToPtr".enum(""),
        "BitCast".enum(""),
        "AddrSpaceCast".enum("", "60"),
        "ICmp".enum("", "42"),
        "FCmp".enum(""),
        "PHI".enum(""),
        "Call".enum(""),
        "Select".enum(""),
        "UserOp1".enum(""),
        "UserOp2".enum(""),
        "VAArg".enum(""),
        "ExtractElement".enum(""),
        "InsertElement".enum(""),
        "ShuffleVector".enum(""),
        "ExtractValue".enum(""),
        "InsertValue".enum(""),
        "Freeze".enum("", "68"),
        "Fence".enum("", "55"),
        "AtomicCmpXchg".enum(""),
        "AtomicRMW".enum(""),
        "Resume".enum(""),
        "LandingPad".enum(""),
        "CleanupRet".enum("", "61"),
        "CatchRet".enum(""),
        "CatchPad".enum(""),
        "CleanupPad".enum(""),
        "CatchSwitch".enum("")
    )

    EnumConstant(
        "{@code LLVMTypeKind}",

        "VoidTypeKind".enum("type with no size", "0"),
        "HalfTypeKind".enum("16 bit floating point type"),
        "FloatTypeKind".enum("32 bit floating point type"),
        "DoubleTypeKind".enum("64 bit floating point type"),
        "X86_FP80TypeKind".enum("80 bit floating point type (X87)"),
        "FP128TypeKind".enum("128 bit floating point type (112-bit mantissa)"),
        "PPC_FP128TypeKind".enum("128 bit floating point type (two 64-bits)"),
        "LabelTypeKind".enum("Labels"),
        "IntegerTypeKind".enum("Arbitrary bit width integers"),
        "FunctionTypeKind".enum("Functions"),
        "StructTypeKind".enum("Structures"),
        "ArrayTypeKind".enum("Arrays"),
        "PointerTypeKind".enum("Pointers"),
        "VectorTypeKind".enum("Fixed width SIMD vector type"),
        "MetadataTypeKind".enum("Metadata"),
        "X86_MMXTypeKind".enum("X86 MMX"),
        "TokenTypeKind".enum("Tokens"),
        "ScalableVectorTypeKind".enum("Scalable SIMD vector type"),
        "BFloatTypeKind".enum("16 bit brain floating point type"),
        "X86_AMXTypeKind".enum("X86 AMX")
    )

    EnumConstant(
        "{@code LLVMLinkage}",

        "ExternalLinkage".enum("Externally visible function", "0"),
        "AvailableExternallyLinkage".enum,
        "LinkOnceAnyLinkage".enum("Keep one copy of function when linking (inline)"),
        "LinkOnceODRLinkage".enum("Same, but only replaced by something equivalent."),
        "LinkOnceODRAutoHideLinkage".enum("Obsolete"),
        "WeakAnyLinkage".enum("Keep one copy of function when linking (weak)"),
        "WeakODRLinkage".enum("Same, but only replaced by something equivalent."),
        "AppendingLinkage".enum("Special purpose, only applies to global arrays"),
        "InternalLinkage".enum("Rename collisions when linking (static functions)"),
        "PrivateLinkage".enum("Like Internal, but omit from symbol table"),
        "DLLImportLinkage".enum("Obsolete"),
        "DLLExportLinkage".enum("Obsolete"),
        "ExternalWeakLinkage".enum("ExternalWeak linkage description"),
        "GhostLinkage".enum("Obsolete"),
        "CommonLinkage".enum("Tentative definitions"),
        "LinkerPrivateLinkage".enum("Like Private, but linker removes."),
        "LinkerPrivateWeakLinkage".enum("Like LinkerPrivate, but is weak.")
    )

    EnumConstant(
        "{@code LLVMVisibility}",

        "DefaultVisibility".enum("The GV is visible", "0"),
        "HiddenVisibility".enum("The GV is hidden"),
        "ProtectedVisibility".enum("The GV is protected")
    )

    EnumConstant(
        "{@code LLVMUnnamedAddr}",

        "NoUnnamedAddr".enum("Address of the GV is significant.", "0"),
        "LocalUnnamedAddr".enum("Address of the GV is locally insignificant."),
        "GlobalUnnamedAddr".enum("Address of the GV is globally insignificant.")
    )

    EnumConstant(
        "{@code LLVMDLLStorageClass}",

        "DefaultStorageClass".enum("", "0"),
        "DLLImportStorageClass".enum("Function to be imported from DLL."),
        "DLLExportStorageClass".enum("Function to be accessible from DLL.")
    )

    EnumConstant(
        "{@code LLVMCallConv}",

        "CCallConv".enum("", "0"),
        "FastCallConv".enum("", "8"),
        "ColdCallConv".enum,
        "GHCCallConv".enum,
        "HiPECallConv".enum,
        "WebKitJSCallConv".enum,
        "AnyRegCallConv".enum,
        "PreserveMostCallConv".enum,
        "PreserveAllCallConv".enum,
        "SwiftCallConv".enum,
        "CXXFASTTLSCallConv".enum,
        "X86StdcallCallConv".enum("", "64"),
        "X86FastcallCallConv".enum,
        "ARMAPCSCallConv".enum,
        "ARMAAPCSCallConv".enum,
        "ARMAAPCSVFPCallConv".enum,
        "MSP430INTRCallConv".enum,
        "X86ThisCallCallConv".enum,
        "PTXKernelCallConv".enum,
        "PTXDeviceCallConv".enum,
        "SPIRFUNCCallConv".enum("", "75"),
        "SPIRKERNELCallConv".enum,
        "IntelOCLBICallConv".enum,
        "X8664SysVCallConv".enum,
        "Win64CallConv".enum,
        "X86VectorCallCallConv".enum,
        "HHVMCallConv".enum,
        "HHVMCCallConv".enum,
        "X86INTRCallConv".enum,
        "AVRINTRCallConv".enum,
        "AVRSIGNALCallConv".enum,
        "AVRBUILTINCallConv".enum,
        "AMDGPUVSCallConv".enum,
        "AMDGPUGSCallConv".enum,
        "AMDGPUPSCallConv".enum,
        "AMDGPUCSCallConv".enum,
        "AMDGPUKERNELCallConv".enum,
        "X86RegCallCallConv".enum,
        "AMDGPUHSCallConv".enum,
        "MSP430BUILTINCallConv".enum,
        "AMDGPULSCallConv".enum,
        "AMDGPUESCallConv".enum
    )

    EnumConstant(
        "{@code LLVMValueKind}",

        "ArgumentValueKind".enum("", "0"),
        "BasicBlockValueKind".enum,
        "MemoryUseValueKind".enum,
        "MemoryDefValueKind".enum,
        "MemoryPhiValueKind".enum,
        "FunctionValueKind".enum,
        "GlobalAliasValueKind".enum,
        "GlobalIFuncValueKind".enum,
        "GlobalVariableValueKind".enum,
        "BlockAddressValueKind".enum,
        "ConstantExprValueKind".enum,
        "ConstantArrayValueKind".enum,
        "ConstantStructValueKind".enum,
        "ConstantVectorValueKind".enum,
        "UndefValueValueKind".enum,
        "ConstantAggregateZeroValueKind".enum,
        "ConstantDataArrayValueKind".enum,
        "ConstantDataVectorValueKind".enum,
        "ConstantIntValueKind".enum,
        "ConstantFPValueKind".enum,
        "ConstantPointerNullValueKind".enum,
        "ConstantTokenNoneValueKind".enum,
        "MetadataAsValueValueKind".enum,
        "InlineAsmValueKind".enum,
        "InstructionValueKind".enum,
        "PoisonValueValueKind".enum
    )

    EnumConstant(
        "{@code LLVMIntPredicate}",

        "IntEQ".enum("equal", "32"),
        "IntNE".enum("not equal"),
        "IntUGT".enum("unsigned greater than"),
        "IntUGE".enum("unsigned greater or equal"),
        "IntULT".enum("unsigned less than"),
        "IntULE".enum("unsigned less or equal"),
        "IntSGT".enum("signed greater than"),
        "IntSGE".enum("signed greater or equal"),
        "IntSLT".enum("signed less than"),
        "IntSLE".enum("signed less or equal")
    )

    EnumConstant(
        "{@code LLVMRealPredicate}",

        "RealPredicateFalse".enum("Always false (always folded)", "0"),
        "RealOEQ".enum("True if ordered and equal"),
        "RealOGT".enum("True if ordered and greater than"),
        "RealOGE".enum("True if ordered and greater than or equal"),
        "RealOLT".enum("True if ordered and less than"),
        "RealOLE".enum("True if ordered and less than or equal"),
        "RealONE".enum("True if ordered and operands are unequal"),
        "RealORD".enum("True if ordered (no nans)"),
        "RealUNO".enum("True if unordered: isnan(X) | isnan(Y)"),
        "RealUEQ".enum("True if unordered or equal"),
        "RealUGT".enum("True if unordered or greater than"),
        "RealUGE".enum("True if unordered, greater than, or equal"),
        "RealULT".enum("True if unordered or less than"),
        "RealULE".enum("True if unordered, less than, or equal"),
        "RealUNE".enum("True if unordered or not equal"),
        "RealPredicateTrue".enum("Always true (always folded)")
    )

    EnumConstant(
        "{@code LLVMLandingPadClauseTy}",

        "LandingPadCatch".enum("A catch clause", "0"),
        "LandingPadFilter".enum("A filter clause")
    )

    EnumConstant(
        "{@code LLVMThreadLocalMode}",

        "NotThreadLocal".enum("", "0"),
        "GeneralDynamicTLSModel".enum,
        "LocalDynamicTLSModel".enum,
        "InitialExecTLSModel".enum,
        "LocalExecTLSModel".enum
    )

    EnumConstant(
        "{@code LLVMAtomicOrdering}",

        "AtomicOrderingNotAtomic".enum("A load or store which is not atomic", "0"),
        "AtomicOrderingUnordered".enum("Lowest level of atomicity, guarantees somewhat sane results, lock free."),
        "AtomicOrderingMonotonic".enum("guarantees that if you take all the operations affecting a specific address, a consistent ordering exists"),
        "AtomicOrderingAcquire".enum(
            "Acquire provides a barrier of the sort necessary to acquire a lock to access other memory with normal loads and stores.",
            "4"
        ),
        "AtomicOrderingRelease".enum("Release is similar to Acquire, but with a barrier of the sort necessary to release a lock."),
        "AtomicOrderingAcquireRelease".enum("provides both an Acquire and a Release barrier (for fences and operations which both read and write memory)."),
        "AtomicOrderingSequentiallyConsistent".enum(
            """
            provides Acquire semantics for loads and Release semantics for stores. Additionally, it guarantees that a total ordering exists between all
            SequentiallyConsistent operations.
            """
        )
    )

    EnumConstant(
        "{@code LLVMAtomicRMWBinOp}",

        "AtomicRMWBinOpXchg".enum("Set the new value and return the one old", "0"),
        "AtomicRMWBinOpAdd".enum("Add a value and return the old one"),
        "AtomicRMWBinOpSub".enum("Subtract a value and return the old one"),
        "AtomicRMWBinOpAnd".enum("And a value and return the old one"),
        "AtomicRMWBinOpNand".enum("Not-And a value and return the old one"),
        "AtomicRMWBinOpOr".enum("OR a value and return the old one"),
        "AtomicRMWBinOpXor".enum("Xor a value and return the old one"),
        "AtomicRMWBinOpMax".enum("Sets the value if it's greater than the original using a signed comparison and return the old one"),
        "AtomicRMWBinOpMin".enum("Sets the value if it's smaller than the original using a signed comparison and return the old one"),
        "AtomicRMWBinOpUMax".enum("Sets the value if it's greater than the original using an unsigned comparison and return the old one"),
        "AtomicRMWBinOpUMin".enum("Sets the value if it's greater than the original using an unsigned comparison and return the old one"),
        "AtomicRMWBinOpFAdd".enum("Add a floating point value and return the old one"),
        "AtomicRMWBinOpFSub".enum("Subtract a floating point value and return the old one")
    )

    EnumConstant(
        "{@code LLVMDiagnosticSeverity}",

        "DSError".enum("", "0"),
        "DSWarning".enum,
        "DSRemark".enum,
        "DSNote".enum
    )

    EnumConstant(
        "{@code LLVMInlineAsmDialect}",

        "InlineAsmDialectATT".enum("", "0"),
        "InlineAsmDialectIntel".enum
    )

    EnumConstant(
        "{@code LLVMModuleFlagBehavior}",

        "ModuleFlagBehaviorError".enum("Emits an error if two values disagree, otherwise the resulting value is that of the operands.", "0"),
        "ModuleFlagBehaviorWarning".enum(
            "Emits a warning if two values disagree. The result value will be the operand for the flag from the first module being linked."
        ),
        "ModuleFlagBehaviorRequire".enum(
            """
            Adds a requirement that another module flag be present and have a specified value after linking is performed. The value must be a metadata pair,
            where the first element of the pair is the ID of the module flag to be restricted, and the second element of the pair is the value the module flag
            should be restricted to. This behavior can be used to restrict the allowable results (via triggering of an error) of linking IDs with the
            **Override** behavior.
            """
        ),
        "ModuleFlagBehaviorOverride".enum(
            """
            Uses the specified value, regardless of the behavior or value of the other module. If both modules specify **Override**, but the values differ, an
            error will be emitted.
            """
        ),
        "ModuleFlagBehaviorAppend".enum("Appends the two values, which are required to be metadata nodes."),
        "ModuleFlagBehaviorAppendUnique".enum(
            """
            Appends the two values, which are required to be metadata nodes. However, duplicate entries in the second list are dropped during the append
            operation.
            """
        )
    )

    EnumConstant(
        "Attribute index are either {@code LLVMAttributeReturnIndex}, {@code LLVMAttributeFunctionIndex} or a parameter number from 1 to N.",

        "AttributeReturnIndex".enum("", "0"),
        "AttributeFunctionIndex".enum("ISO C restricts enumerator values to range of 'int' (4294967295 is too large)", "-1")
    )

    void(
        "InitializeCore",
        "",

        LLVMPassRegistryRef("R", "")
    )

    void(
        "Shutdown",
        "Deallocate and destroy all {@code ManagedStatic} variables.",

        void()
    )

    Nonnull..charUTF8.p(
        "CreateMessage",
        "",

        charUTF8.const.p("Message", "")
    )

    void(
        "DisposeMessage",
        "",

        charUTF8.p("Message", "")
    )

    LLVMContextRef(
        "ContextCreate",
        """
        Create a new context.

        Every call to this function should be paired with a call to #ContextDispose() or the context will leak memory.
        """,

        void()
    )

    LLVMContextRef(
        "GetGlobalContext",
        "Obtain the global context instance.",

        void()
    )

    void(
        "ContextSetDiagnosticHandler",
        "Set the diagnostic handler for this context.",

        LLVMContextRef("C", ""),
        nullable..LLVMDiagnosticHandler("Handler", ""),
        nullable..opaque_p("DiagnosticContext", "")
    )

    LLVMDiagnosticHandler(
        "ContextGetDiagnosticHandler",
        "Get the diagnostic handler of this context.",

        LLVMContextRef("C", "")
    )

    opaque_p(
        "ContextGetDiagnosticContext",
        "Get the diagnostic context of this context.",

        LLVMContextRef("C", "")
    )

    void(
        "ContextSetYieldCallback",
        "Set the yield callback function for this context.",

        LLVMContextRef("C", ""),
        nullable..LLVMYieldCallback("Callback", ""),
        nullable..opaque_p("OpaqueHandle", "")
    )

    IgnoreMissing..LLVMBool(
        "ContextShouldDiscardValueNames",
        "Retrieve whether the given context is set to discard all value names.",

        LLVMContextRef("C", ""),

        since = "8.0"
    )

    IgnoreMissing..void(
        "ContextSetDiscardValueNames",
        """
        Set whether the given context discards all value names.

        If true, only the names of {@code GlobalValue} objects will be available in the IR. This can be used to save memory and runtime, especially in release
        mode.
        """,

        LLVMContextRef("C", ""),
        LLVMBool("Discard", ""),

        since = "8.0"
    )

    void(
        "ContextDispose",
        """
        Destroy a context instance.

        This should be called for every call to #ContextCreate() or memory will be leaked.
        """,

        LLVMContextRef("C", "")
    )

    Nonnull..charUTF8.p(
        "GetDiagInfoDescription",
        "Return a string representation of the {@code DiagnosticInfo}. Use #DisposeMessage() to free the string.",

        LLVMDiagnosticInfoRef("DI", "")
    )

    LLVMDiagnosticSeverity(
        "GetDiagInfoSeverity",
        "Return an {@code enum LLVMDiagnosticSeverity}.",

        LLVMDiagnosticInfoRef("DI", "")
    )

    unsigned_int(
        "GetMDKindIDInContext",
        "",

        LLVMContextRef("C", ""),
        charUTF8.const.p("Name", ""),
        AutoSize("Name")..unsigned_int("SLen", "")
    )

    unsigned_int(
        "GetMDKindID",
        "",

        charUTF8.const.p("Name", ""),
        AutoSize("Name")..unsigned_int("SLen", "")
    )

    unsigned_int(
        "GetEnumAttributeKindForName",
        """
        Return an unique id given the name of a enum attribute, or 0 if no attribute by that name exists.

        See ${url("http://llvm.org/docs/LangRef.html\\#parameter-attributes")} and ${url("http://llvm.org/docs/LangRef.html\\#function-attributes")} for the
        list of available attributes.

        NB: Attribute names and/or id are subject to change without going through the C API deprecation cycle.
        """,

        charUTF8.const.p("Name", ""),
        AutoSize("Name")..size_t("SLen", "")
    )

    unsigned_int(
        "GetLastEnumAttributeKind",
        "",

        void()
    )

    LLVMAttributeRef(
        "CreateEnumAttribute",
        "Create an enum attribute.",

        LLVMContextRef("C", ""),
        unsigned_int("KindID", ""),
        uint64_t("Val", "")
    )

    unsigned_int(
        "GetEnumAttributeKind",
        "Get the unique id corresponding to the enum attribute passed as argument.",

        LLVMAttributeRef("A", "")
    )

    uint64_t(
        "GetEnumAttributeValue",
        "Get the enum attribute's value. 0 is returned if none exists.",

        LLVMAttributeRef("A", "")
    )

    IgnoreMissing..LLVMAttributeRef(
        "CreateTypeAttribute",
        "Create a type attribute.",

        LLVMContextRef("C", ""),
        unsigned("KindID", ""),
        LLVMTypeRef("type_ref", ""),

        since = "12"
    )

    IgnoreMissing..LLVMTypeRef(
        "GetTypeAttributeValue",
        "Get the type attribute's value.",

        LLVMAttributeRef("A", ""),

        since = "12"
    )

    LLVMAttributeRef(
        "CreateStringAttribute",
        "Create a string attribute.",

        LLVMContextRef("C", ""),
        charUTF8.const.p("K", ""),
        AutoSize("K")..unsigned_int("KLength", ""),
        charUTF8.const.p("V", ""),
        AutoSize("V")..unsigned_int("VLength", "")
    )

    Nonnull..charUTF8.const.p(
        "GetStringAttributeKind",
        "Get the string attribute's kind.",

        LLVMAttributeRef("A", ""),
        AutoSizeResult..unsigned_int.p("Length", "")
    )

    Nonnull..charUTF8.const.p(
        "GetStringAttributeValue",
        "Get the string attribute's value.",

        LLVMAttributeRef("A", ""),
        AutoSizeResult..unsigned_int.p("Length", "")
    )

    LLVMBool(
        "IsEnumAttribute",
        "",

        LLVMAttributeRef("A", "")
    )

    LLVMBool(
        "IsStringAttribute",
        "",

        LLVMAttributeRef("A", "")
    )

    IgnoreMissing..LLVMBool(
        "IsTypeAttribute",
        "",

        LLVMAttributeRef("A", ""),

        since = "12"
    )

    IgnoreMissing..LLVMTypeRef(
        "GetTypeByName2",
        "Obtain a Type from a context by its registered name.",

        LLVMContextRef("C", ""),
        charUTF8.const.p("Name", ""),

        since = "12"
    )

    LLVMModuleRef(
        "ModuleCreateWithName",
        """
        Create a new, empty module in the global context.

        This is equivalent to calling #ModuleCreateWithNameInContext() with #GetGlobalContext() as the context parameter.

        Every invocation should be paired with #DisposeModule() or memory will be leaked.
        """,

        charUTF8.const.p("ModuleID", "")
    )

    LLVMModuleRef(
        "ModuleCreateWithNameInContext",
        """
        Create a new, empty module in a specific context.

        Every invocation should be paired with #DisposeModule() or memory will be leaked.
        """,

        charUTF8.const.p("ModuleID", ""),
        LLVMContextRef("C", "")
    )

    LLVMModuleRef(
        "CloneModule",
        "Return an exact copy of the specified module.",

        LLVMModuleRef("M", "")
    )

    void(
        "DisposeModule",
        """
        Destroy a module instance.

        This must be called for every created module or memory will be leaked.
        """,

        LLVMModuleRef("M", "")
    )

    Nonnull..charUTF8.const.p(
        "GetModuleIdentifier",
        "Obtain the identifier of a module.",

        LLVMModuleRef("M", "module to obtain identifier of"),
        AutoSizeResult..size_t.p("Len", "out parameter which holds the length of the returned string"),

        returnDoc = "the identifier of {@code M}"
    )

    void(
        "SetModuleIdentifier",
        "Set the identifier of a module to a string {@code Ident} with length {@code Len}.",

        LLVMModuleRef("M", "the module to set identifier"),
        charUTF8.const.p("Ident", "the string to set {@code M}'s identifier to"),
        AutoSize("Ident")..size_t("Len", "length of {@code Ident}")
    )

    IgnoreMissing..Nonnull..charUTF8.const.p(
        "GetSourceFileName",
        "Obtain the module's original source file name.",

        LLVMModuleRef("M", "module to obtain the name of"),
        AutoSizeResult..size_t.p("Len", "out parameter which holds the length of the returned string"),

        returnDoc = "the original source file name of {@code M}"
    )

    IgnoreMissing..void(
        "SetSourceFileName",
        "Set the original source file name of a module to a string {@code Name} with length {@code Len}.",

        LLVMModuleRef("M", "the module to set the source file name of"),
        charUTF8.const.p("Name", "the string to set {@code M}'s source file name to"),
        AutoSize("Name")..size_t("Len", "length of {@code Name}")
    )

    Nonnull..charUTF8.const.p(
        "GetDataLayoutStr",
        """
        Obtain the data layout for a module.

        #GetDataLayout() is DEPRECATED, as the name is not only incorrect, but match the name of another method on the module. Prefer the use of
        {@code LLVMGetDataLayoutStr}, which is not ambiguous.
        """,

        LLVMModuleRef("M", "")
    )

    Nonnull..charUTF8.const.p(
        "GetDataLayout",
        "",

        LLVMModuleRef("M", "")
    )

    void(
        "SetDataLayout",
        "Set the data layout for a module.",

        LLVMModuleRef("M", ""),
        charUTF8.const.p("DataLayoutStr", "")
    )

    Nonnull..charUTF8.const.p(
        "GetTarget",
        "Obtain the target triple for a module.",

        LLVMModuleRef("M", "")
    )

    void(
        "SetTarget",
        "Set the target triple for a module.",

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Triple", "")
    )

    IgnoreMissing..LLVMModuleFlagEntry.p(
        "CopyModuleFlagsMetadata",
        """
        Returns the module flags as an array of flag-key-value triples. The caller is responsible for freeing this array by calling {@code
        #DisposeModuleFlagsMetadata()}.
        """,

        LLVMModuleRef("M", ""),
        Check(1)..size_t.p("Len", "")
    )

    IgnoreMissing..void(
        "DisposeModuleFlagsMetadata",
        "Destroys module flags metadata entries.",

        LLVMModuleFlagEntry.p("Entries", "")
    )

    IgnoreMissing..LLVMModuleFlagBehavior(
        "ModuleFlagEntriesGetFlagBehavior",
        "Returns the flag behavior for a module flag entry at a specific index.",

        LLVMModuleFlagEntry.p("Entries", ""),
        unsigned_int("Index", "")
    )

    IgnoreMissing..Nonnull..charUTF8.const.p(
        "ModuleFlagEntriesGetKey",
        "Returns the key for a module flag entry at a specific index.",

        LLVMModuleFlagEntry.p("Entries", ""),
        unsigned_int("Index", ""),
        AutoSizeResult..size_t.p("Len", "")
    )

    IgnoreMissing..LLVMMetadataRef(
        "ModuleFlagEntriesGetMetadata",
        "Returns the metadata for a module flag entry at a specific index.",

        LLVMModuleFlagEntry.p("Entries", ""),
        unsigned_int("Index", "")
    )

    IgnoreMissing..LLVMMetadataRef(
        "GetModuleFlag",
        "Add a module-level flag to the module-level flags metadata if it doesn't already exist.",

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Key", ""),
        AutoSize("Key")..size_t("KeyLen", "")
    )

    IgnoreMissing..void(
        "AddModuleFlag",
        "Add a module-level flag to the module-level flags metadata if it doesn't already exist.",

        LLVMModuleRef("M", ""),
        LLVMModuleFlagBehavior("Behavior", ""),
        charUTF8.const.p("Key", ""),
        AutoSize("Key")..size_t("KeyLen", ""),
        LLVMMetadataRef("Val", "")
    )

    void(
        "DumpModule",
        "Dump a representation of a module to {@code stderr}.",

        LLVMModuleRef("M", "")
    )

    LLVMBool(
        "PrintModuleToFile",
        "Print a representation of a module to a file. The {@code ErrorMessage} needs to be disposed with #DisposeMessage().",

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Filename", ""),
        Check(1)..charUTF8.p.p("ErrorMessage", ""),

        returnDoc = "0 on success, 1 otherwise"
    )

    Nonnull..charUTF8.p(
        "PrintModuleToString",
        "Return a string representation of the module. Use #DisposeMessage() to free the string.",

        LLVMModuleRef("M", "")
    )

    IgnoreMissing..Nonnull..charUTF8.const.p(
        "GetModuleInlineAsm",
        "Get inline assembly for a module.",

        LLVMModuleRef("M", ""),
        AutoSizeResult..size_t.p("Len", "")
    )

    IgnoreMissing..void(
        "SetModuleInlineAsm2",
        "Set inline assembly for a module.",

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Asm", ""),
        AutoSize("Asm")..size_t("Len", "")
    )

    IgnoreMissing..void(
        "AppendModuleInlineAsm",
        "Append inline assembly to a module.",

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Asm", ""),
        AutoSize("Asm")..size_t("Len", "")
    )

    IgnoreMissing..LLVMValueRef(
        "GetInlineAsm",
        "Create the specified uniqued inline asm string.",

        LLVMTypeRef("Ty", ""),
        charUTF8.p("AsmString", ""),
        AutoSize("AsmString")..size_t("AsmStringSize", ""),
        charUTF8.p("Constraints", ""),
        AutoSize("Constraints")..size_t("ConstraintsSize", ""),
        LLVMBool("HasSideEffects", ""),
        LLVMBool("IsAlignStack", ""),
        LLVMInlineAsmDialect("Dialect", ""),
        LLVMBool("CanThrow", "")
    )

    LLVMContextRef(
        "GetModuleContext",
        "Obtain the context to which this module is associated.",

        LLVMModuleRef("M", "")
    )

    LLVMTypeRef(
        "GetTypeByName",
        "Deprecated: Use #GetTypeByName2() instead.",

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Name", "")
    )

    IgnoreMissing..LLVMNamedMDNodeRef(
        "GetFirstNamedMetadata",
        "Obtain an iterator to the first {@code NamedMDNode} in a {@code Module}.",

        LLVMModuleRef("M", "")
    )

    IgnoreMissing..LLVMNamedMDNodeRef(
        "GetLastNamedMetadata",
        "Obtain an iterator to the last {@code NamedMDNode} in a {@code Module}.",

        LLVMModuleRef("M", "")
    )

    IgnoreMissing..LLVMNamedMDNodeRef(
        "GetNextNamedMetadata",
        """
        Advance a {@code NamedMDNode} iterator to the next {@code NamedMDNode}.

        Returns #NULL if the iterator was already at the end and there are no more named metadata nodes.
        """,

        LLVMNamedMDNodeRef("NamedMDNode", "")
    )

    IgnoreMissing..LLVMNamedMDNodeRef(
        "GetPreviousNamedMetadata",
        """
        Decrement a {@code NamedMDNode} iterator to the previous {@code NamedMDNode}.

        Returns #NULL if the iterator was already at the beginning and there are no previous named metadata nodes.
        """,

        LLVMNamedMDNodeRef("NamedMDNode", "")
    )

    IgnoreMissing..LLVMNamedMDNodeRef(
        "GetNamedMetadata",
        "Retrieve a {@code NamedMDNode} with the given name, returning #NULL if no such node exists.",

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Name", ""),
        AutoSize("Name")..size_t("NameLen", "")
    )

    IgnoreMissing..LLVMNamedMDNodeRef(
        "GetOrInsertNamedMetadata",
        "Retrieve a {@code NamedMDNode} with the given name, creating a new node if no such node exists.",

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Name", ""),
        AutoSize("Name")..size_t("NameLen", "")
    )

    IgnoreMissing..Nonnull..charUTF8.const.p(
        "GetNamedMetadataName",
        "Retrieve the name of a {@code NamedMDNode}.",

        LLVMNamedMDNodeRef("NamedMD", ""),
        AutoSizeResult..size_t.p("NameLen", "")
    )

    unsigned_int(
        "GetNamedMetadataNumOperands",
        "Obtain the number of operands for named metadata in a module.",

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Name", "")
    )

    void(
        "GetNamedMetadataOperands",
        """
        Obtain the named metadata operands for a module.

        The passed {@code LLVMValueRef} pointer should refer to an array of {@code LLVMValueRef} at least #GetNamedMetadataNumOperands() long. This array will
        be populated with the {@code LLVMValueRef} instances. Each instance corresponds to a {@code llvm::MDNode}.
        """,

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Name", ""),
        Check(
            "LLVMGetNamedMetadataNumOperands(M, Name)", debug = true
        )..LLVMValueRef.p("Dest", "")
    )

    void(
        "AddNamedMetadataOperand",
        "Add an operand to named metadata.",

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Name", ""),
        LLVMValueRef("Val", "")
    )

    IgnoreMissing..charUTF8.const.p(
        "GetDebugLocDirectory",
        """
        Return the directory of the debug location for this value, which must be an {@code llvm::Instruction}, {@code llvm::GlobalVariable}, or
        {@code llvm::Function}.
        """,

        LLVMValueRef("Val", ""),
        AutoSizeResult..unsigned_int.p("Length", "")
    )

    IgnoreMissing..charUTF8.const.p(
        "GetDebugLocFilename",
        """
        Return the filename of the debug location for this value, which must be an {@code llvm::Instruction}, {@code llvm::GlobalVariable}, or
        {@code llvm::Function}.
        """,

        LLVMValueRef("Val", ""),
        AutoSizeResult..unsigned_int.p("Length", "")
    )

    IgnoreMissing..unsigned_int(
        "GetDebugLocLine",
        """
        Return the line number of the debug location for this value, which must be an {@code llvm::Instruction}, {@code llvm::GlobalVariable}, or
        {@code llvm::Function}.
        """,

        LLVMValueRef("Val", "")
    )

    IgnoreMissing..unsigned_int(
        "GetDebugLocColumn",
        "Return the column number of the debug location for this value, which must be an {@code llvm::Instruction}.",

        LLVMValueRef("Val", "")
    )

    LLVMValueRef(
        "AddFunction",
        "Add a function to a module under a specified name.",

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Name", ""),
        LLVMTypeRef("FunctionTy", "")
    )

    LLVMValueRef(
        "GetNamedFunction",
        """
        Obtain a {@code Function} value from a {@code Module} by its name.

        The returned value corresponds to a {@code llvm::Function} value.
        """,

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "GetFirstFunction",
        "Obtain an iterator to the first {@code Function} in a {@code Module}.",

        LLVMModuleRef("M", "")
    )

    LLVMValueRef(
        "GetLastFunction",
        "Obtain an iterator to the last {@code Function} in a {@code Module}.",

        LLVMModuleRef("M", "")
    )

    LLVMValueRef(
        "GetNextFunction",
        """
        Advance a {@code Function} iterator to the next {@code Function}.

        Returns #NULL if the iterator was already at the end and there are no more functions.
        """,

        LLVMValueRef("Fn", "")
    )

    LLVMValueRef(
        "GetPreviousFunction",
        """
        Decrement a {@code Function} iterator to the previous {@code Function}.

        Returns #NULL if the iterator was already at the beginning and there are no previous functions.
        """,

        LLVMValueRef("Fn", "")
    )

    IgnoreMissing..void(
        "SetModuleInlineAsm",
        "Deprecated: Use #SetModuleInlineAsm2() instead.",

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Asm", "")
    )

    LLVMTypeKind(
        "GetTypeKind",
        "Obtain the enumerated type of a {@code Type} instance.",

        LLVMTypeRef("Ty", "")
    )

    LLVMBool(
        "TypeIsSized",
        """
        Whether the type has a known size.

        Things that don't have a size are abstract types, labels, and void.
        """,

        LLVMTypeRef("Ty", "")
    )

    LLVMContextRef(
        "GetTypeContext",
        "Obtain the context to which this type instance is associated.",

        LLVMTypeRef("Ty", "")
    )

    IgnoreMissing..void(
        "DumpType",
        "Dump a representation of a type to {@code stderr}.",

        LLVMTypeRef("Val", "")
    )

    Nonnull..charUTF8.p(
        "PrintTypeToString",
        "Return a string representation of the type. Use #DisposeMessage() to free the string.",

        LLVMTypeRef("Val", "")
    )

    LLVMTypeRef(
        "Int1TypeInContext",
        "Obtain an integer type from a context with specified bit width.",

        LLVMContextRef("C", "")
    )

    LLVMTypeRef(
        "Int8TypeInContext",
        "",

        LLVMContextRef("C", "")
    )

    LLVMTypeRef(
        "Int16TypeInContext",
        "",

        LLVMContextRef("C", "")
    )

    LLVMTypeRef(
        "Int32TypeInContext",
        "",

        LLVMContextRef("C", "")
    )

    LLVMTypeRef(
        "Int64TypeInContext",
        "",

        LLVMContextRef("C", "")
    )

    LLVMTypeRef(
        "Int128TypeInContext",
        "",

        LLVMContextRef("C", "")
    )

    LLVMTypeRef(
        "IntTypeInContext",
        "",

        LLVMContextRef("C", ""),
        unsigned_int("NumBits", "")
    )

    LLVMTypeRef("Int1Type", "Obtain an integer type from the global context with a specified bit width.", void())
    LLVMTypeRef("Int8Type", "", void())
    LLVMTypeRef("Int16Type", "", void())
    LLVMTypeRef("Int32Type", "", void())
    LLVMTypeRef("Int64Type", "", void())
    LLVMTypeRef("Int128Type", "", void())

    LLVMTypeRef(
        "IntType",
        "",

        unsigned_int("NumBits", "")
    )

    unsigned_int(
        "GetIntTypeWidth",
        "",

        LLVMTypeRef("IntegerTy", "")
    )

    LLVMTypeRef(
        "HalfTypeInContext",
        "Obtain a 16-bit floating point type from a context.",

        LLVMContextRef("C", "")
    )

    IgnoreMissing..LLVMTypeRef(
        "BFloatTypeInContext",
        "Obtain a 16-bit brain floating point type from a context.",

        LLVMContextRef("C", ""),

        since = "11"
    )

    LLVMTypeRef(
        "FloatTypeInContext",
        "Obtain a 32-bit floating point type from a context.",

        LLVMContextRef("C", "")
    )

    LLVMTypeRef(
        "DoubleTypeInContext",
        "Obtain a 64-bit floating point type from a context.",

        LLVMContextRef("C", "")
    )

    LLVMTypeRef(
        "X86FP80TypeInContext",
        "Obtain a 80-bit floating point type (X87) from a context.",

        LLVMContextRef("C", "")
    )

    LLVMTypeRef(
        "FP128TypeInContext",
        "Obtain a 128-bit floating point type (112-bit mantissa) from a context.",

        LLVMContextRef("C", "")
    )

    LLVMTypeRef(
        "PPCFP128TypeInContext",
        "Obtain a 128-bit floating point type (two 64-bits) from a context.",

        LLVMContextRef("C", "")
    )

    LLVMTypeRef("HalfType", "", void())
    IgnoreMissing..LLVMTypeRef(
        "BFloatType",
        "",

        void(),

        since = "11"
    )
    LLVMTypeRef("FloatType", "", void())
    LLVMTypeRef("DoubleType", "", void())
    LLVMTypeRef("X86FP80Type", "", void())
    LLVMTypeRef("FP128Type", "", void())
    LLVMTypeRef("PPCFP128Type", "", void())

    LLVMTypeRef(
        "FunctionType",
        """
        Obtain a function type consisting of a specified signature.

        The function is defined as a tuple of a return {@code Type}, a list of parameter types, and whether the function is variadic.
        """,

        LLVMTypeRef("ReturnType", ""),
        LLVMTypeRef.p("ParamTypes", ""),
        AutoSize("ParamTypes")..unsigned_int("ParamCount", ""),
        LLVMBool("IsVarArg", "")
    )

    LLVMBool(
        "IsFunctionVarArg",
        "Returns whether a function type is variadic.",

        LLVMTypeRef("FunctionTy", "")
    )

    LLVMTypeRef(
        "GetReturnType",
        "Obtain the Type this function Type returns.",

        LLVMTypeRef("FunctionTy", "")
    )

    unsigned_int(
        "CountParamTypes",
        "Obtain the number of parameters this function accepts.",

        LLVMTypeRef("FunctionTy", "")
    )

    void(
        "GetParamTypes",
        """
        Obtain the types of a function's parameters.

        The {@code Dest} parameter should point to a pre-allocated array of {@code LLVMTypeRef} at least #CountParamTypes() large. On return, the first
        {@code LLVMCountParamTypes()} entries in the array will be populated with {@code LLVMTypeRef} instances.
        """,

        LLVMTypeRef("FunctionTy", "the function type to operate on"),
        Check(
            "LLVMCountParamTypes(FunctionTy)", debug = true
        )..LLVMTypeRef.p("Dest", "memory address of an array to be filled with result")
    )

    LLVMTypeRef(
        "StructTypeInContext",
        """
        Create a new structure type in a context.

        A structure is specified by a list of inner elements/types and whether these can be packed together.
        """,

        LLVMContextRef("C", ""),
        LLVMTypeRef.p("ElementTypes", ""),
        AutoSize("ElementTypes")..unsigned_int("ElementCount", ""),
        LLVMBool("Packed", "")
    )

    LLVMTypeRef(
        "StructType",
        "Create a new structure type in the global context.",

        LLVMTypeRef.p("ElementTypes", ""),
        AutoSize("ElementTypes")..unsigned_int("ElementCount", ""),
        LLVMBool("Packed", "")
    )

    LLVMTypeRef(
        "StructCreateNamed",
        "Create an empty structure in a context having a specified name.",

        LLVMContextRef("C", ""),
        charUTF8.const.p("Name", "")
    )

    charUTF8.const.p(
        "GetStructName",
        "Obtain the name of a structure.",

        LLVMTypeRef("Ty", "")
    )

    void(
        "StructSetBody",
        "Set the contents of a structure type.",

        LLVMTypeRef("StructTy", ""),
        LLVMTypeRef.p("ElementTypes", ""),
        AutoSize("ElementTypes")..unsigned_int("ElementCount", ""),
        LLVMBool("Packed", "")
    )

    unsigned_int(
        "CountStructElementTypes",
        "Get the number of elements defined inside the structure.",

        LLVMTypeRef("StructTy", "")
    )

    void(
        "GetStructElementTypes",
        """
        Get the elements within a structure.

        The function is passed the address of a pre-allocated array of {@code LLVMTypeRef} at least #CountStructElementTypes() long. After invocation, this
        array will be populated with the structure's elements. The objects in the destination array will have a lifetime of the structure type itself, which is
        the lifetime of the context it is contained in.
        """,

        LLVMTypeRef("StructTy", ""),
        Check(
            "LLVMCountStructElementTypes(StructTy)", debug = true
        )..LLVMTypeRef.p("Dest", "")
    )

    LLVMTypeRef(
        "StructGetTypeAtIndex",
        "Get the type of the element at a given index in the structure.",

        LLVMTypeRef("StructTy", ""),
        unsigned_int("i", "")
    )

    LLVMBool(
        "IsPackedStruct",
        "Determine whether a structure is packed.",

        LLVMTypeRef("StructTy", "")
    )

    LLVMBool(
        "IsOpaqueStruct",
        "Determine whether a structure is opaque.",

        LLVMTypeRef("StructTy", "")
    )

    IgnoreMissing..LLVMBool(
        "IsLiteralStruct",
        "Determine whether a structure is literal.",

        LLVMTypeRef("StructTy", "")
    )

    LLVMTypeRef(
        "GetElementType",
        """
        Obtain the type of elements within a sequential type.

        This works on array, vector, and pointer types.
        """,

        LLVMTypeRef("Ty", "")
    )

    void(
        "GetSubtypes",
        "Returns type's subtypes",

        LLVMTypeRef("Tp", ""),
        Unsafe..LLVMTypeRef.p("Arr", "")
    )

    unsigned_int(
        "GetNumContainedTypes",
        "Return the number of types in the derived type.",

        LLVMTypeRef("Tp", "")
    )

    LLVMTypeRef(
        "ArrayType",
        """
        Create a fixed size array type that refers to a specific type.

        The created type will exist in the context that its element type exists in.
        """,

        LLVMTypeRef("ElementType", ""),
        unsigned_int("ElementCount", "")
    )

    unsigned_int(
        "GetArrayLength",
        """
        Obtain the length of an array type.

        This only works on types that represent arrays.
        """,

        LLVMTypeRef("ArrayTy", "")
    )

    LLVMTypeRef(
        "PointerType",
        """
        Create a pointer type that points to a defined type.

        The created type will exist in the context that its pointee type exists in.
        """,

        LLVMTypeRef("ElementType", ""),
        unsigned_int("AddressSpace", "")
    )

    unsigned_int(
        "GetPointerAddressSpace",
        """
        Obtain the address space of a pointer type.

        This only works on types that represent pointers.
        """,

        LLVMTypeRef("PointerTy", "")
    )

    LLVMTypeRef(
        "VectorType",
        """
        Create a vector type that contains a defined type and has a specific number of elements.

        The created type will exist in the context thats its element type exists in.
        """,

        LLVMTypeRef("ElementType", ""),
        unsigned_int("ElementCount", "")
    )

    IgnoreMissing..LLVMTypeRef(
        "ScalableVectorType",
        """
        Create a vector type that contains a defined type and has a scalable number of elements.

        The created type will exist in the context thats its element type exists in.

        See {@code llvm::ScalableVectorType::get()}.
        """,

        LLVMTypeRef("ElementType", ""),
        unsigned("ElementCount", ""),

        since = "12"
    )

    unsigned_int(
        "GetVectorSize",
        """
        Obtain the (possibly scalable) number of elements in a vector type.

        This only works on types that represent vectors (fixed or scalable).

        See {@code llvm::VectorType::getNumElements()}.
        """,

        LLVMTypeRef("VectorTy", "")
    )

    LLVMTypeRef(
        "VoidTypeInContext",
        "Create a void type in a context.",

        LLVMContextRef("C", "")
    )

    LLVMTypeRef(
        "LabelTypeInContext",
        "Create a label type in a context.",

        LLVMContextRef("C", "")
    )

    LLVMTypeRef(
        "X86MMXTypeInContext",
        "Create a X86 MMX type in a context.",

        LLVMContextRef("C", "")
    )

    IgnoreMissing..LLVMTypeRef(
        "X86AMXTypeInContext",
        "Create a X86 AMX type in a context.",

        LLVMContextRef("C", ""),

        since = "12"
    )

    IgnoreMissing..LLVMTypeRef(
        "TokenTypeInContext",
        "Create a token type in a context.",

        LLVMContextRef("C", "")
    )

    IgnoreMissing..LLVMTypeRef(
        "MetadataTypeInContext",
        "Create a metadata type in a context.",

        LLVMContextRef("C", "")
    )

    LLVMTypeRef(
        "VoidType",
        "These are similar to the above functions except they operate on the global context.",

        void()
    )
    LLVMTypeRef("LabelType", "", void())
    LLVMTypeRef("X86MMXType", "", void())
    IgnoreMissing..LLVMTypeRef(
        "X86AMXType",
        "",

        void(),

        since = "12"
    )

    LLVMTypeRef(
        "TypeOf",
        "Obtain the type of a value.",

        LLVMValueRef("Val", "")
    )

    LLVMValueKind(
        "GetValueKind",
        "Obtain the enumerated type of a Value instance.",

        LLVMValueRef("Val", "")
    )

    IgnoreMissing..Nonnull..charUTF8.const.p(
        "GetValueName2",
        "Obtain the string name of a value.",

        LLVMValueRef("Val", ""),
        AutoSizeResult..size_t.p("Length", "")
    )

    IgnoreMissing..void(
        "SetValueName2",
        "Set the string name of a value.",

        LLVMValueRef("Val", ""),
        charUTF8.const.p("Name", ""),
        AutoSize("Name")..size_t("NameLen", "")
    )

    void(
        "DumpValue",
        "Dump a representation of a value to stderr.",

        LLVMValueRef("Val", "")
    )

    Nonnull..charUTF8.p(
        "PrintValueToString",
        "Return a string representation of the value. Use #DisposeMessage() to free the string.",

        LLVMValueRef("Val", "")
    )

    void(
        "ReplaceAllUsesWith",
        "Replace all uses of a value with another one.",

        LLVMValueRef("OldVal", ""),
        LLVMValueRef("NewVal", "")
    )

    LLVMBool(
        "IsConstant",
        "Determine whether the specified value instance is constant.",

        LLVMValueRef("Val", "")
    )

    LLVMBool(
        "IsUndef",
        "Determine whether a value instance is undefined.",

        LLVMValueRef("Val", "")
    )

    IgnoreMissing..LLVMBool(
        "IsPoison",
        "Determine whether a value instance is poisonous.",

        LLVMValueRef("Val", ""),

        since = "12"
    )

    val postLLVM5 = setOf(
        "GlobalIFunc",
        "DbgVariableIntrinsic",
        "DbgLabelInst"
    )
    arrayOf(
        "Argument",
        "BasicBlock",
        "InlineAsm",
        "User",
        "Constant",
        "BlockAddress",
        "ConstantAggregateZero",
        "ConstantArray",
        "ConstantDataSequential",
        "ConstantDataArray",
        "ConstantDataVector",
        "ConstantExpr",
        "ConstantFP",
        "ConstantInt",
        "ConstantPointerNull",
        "ConstantStruct",
        "ConstantTokenNone",
        "ConstantVector",
        "GlobalValue",
        "GlobalAlias",
        "GlobalIFunc",
        "GlobalObject",
        "Function",
        "GlobalVariable",
        "UndefValue",
        "Instruction",
        "BinaryOperator",
        "CallInst",
        "IntrinsicInst",
        "DbgInfoIntrinsic",
        "DbgVariableIntrinsic",
        "DbgDeclareInst",
        "DbgLabelInst",
        "MemIntrinsic",
        "MemCpyInst",
        "MemMoveInst",
        "MemSetInst",
        "CmpInst",
        "FCmpInst",
        "ICmpInst",
        "ExtractElementInst",
        "GetElementPtrInst",
        "InsertElementInst",
        "InsertValueInst",
        "LandingPadInst",
        "PHINode",
        "SelectInst",
        "ShuffleVectorInst",
        "StoreInst",
        "BranchInst",
        "IndirectBrInst",
        "InvokeInst",
        "ReturnInst",
        "SwitchInst",
        "UnreachableInst",
        "ResumeInst",
        "CleanupReturnInst",
        "CatchReturnInst",
        "FuncletPadInst",
        "CatchPadInst",
        "CleanupPadInst",
        "UnaryInstruction",
        "AllocaInst",
        "CastInst",
        "AddrSpaceCastInst",
        "BitCastInst",
        "FPExtInst",
        "FPToSIInst",
        "FPToUIInst",
        "FPTruncInst",
        "IntToPtrInst",
        "PtrToIntInst",
        "SExtInst",
        "SIToFPInst",
        "TruncInst",
        "UIToFPInst",
        "ZExtInst",
        "ExtractValueInst",
        "LoadInst",
        "VAArgInst",
        "MDNode",
        "MDString"
    ).forEach {
        LLVMValueRef(
            "IsA$it",
            "",

            LLVMValueRef("Val", "")
        ).let { func ->
            if (postLLVM5.contains(it)) {
                IgnoreMissing..func
            }
        }
    }

    Nonnull..charUTF8.const.p(
        "GetValueName",
        "Deprecated: Use #GetValueName2() instead.",

        LLVMValueRef("Val", "")
    )

    void(
        "SetValueName",
        "Deprecated: Use #SetValueName2() instead.",

        LLVMValueRef("Val", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMUseRef(
        "GetFirstUse",
        """
        Obtain the first use of a value.

        Uses are obtained in an iterator fashion. First, call this function to obtain a reference to the first use. Then, call #GetNextUse() on that instance
        and all subsequently obtained instances until #GetNextUse() returns #NULL.
        """,

        LLVMValueRef("Val", "")
    )

    LLVMUseRef(
        "GetNextUse",
        """
        Obtain the next use of a value.

        This effectively advances the iterator. It returns #NULL if you are on the final use and no more are available.
        """,

        LLVMUseRef("U", "")
    )

    LLVMValueRef(
        "GetUser",
        """
        Obtain the user value for a user.

        The returned value corresponds to a {@code llvm::User} type.
        """,

        LLVMUseRef("U", "")
    )

    LLVMValueRef(
        "GetUsedValue",
        "Obtain the value this use corresponds to.",

        LLVMUseRef("U", "")
    )

    LLVMValueRef(
        "GetOperand",
        "Obtain an operand at a specific index in a {@code llvm::User} value.",

        LLVMValueRef("Val", ""),
        unsigned_int("Index", "")
    )

    LLVMUseRef(
        "GetOperandUse",
        "Obtain the use of an operand at a specific index in a {@code llvm::User} value.",

        LLVMValueRef("Val", ""),
        unsigned_int("Index", "")
    )

    void(
        "SetOperand",
        "Set an operand at a specific index in a {@code llvm::User} value.",

        LLVMValueRef("User", ""),
        unsigned_int("Index", ""),
        LLVMValueRef("Val", "")
    )

    int(
        "GetNumOperands",
        "Obtain the number of operands in a {@code llvm::User} value.",

        LLVMValueRef("Val", "")
    )

    LLVMValueRef(
        "ConstNull",
        "Obtain a constant value referring to the null instance of a type.",

        LLVMTypeRef("Ty", "")
    )

    LLVMValueRef(
        "ConstAllOnes",
        """
        Obtain a constant value referring to the instance of a type consisting of all ones.

        This is only valid for integer types.
        """,

        LLVMTypeRef("Ty", "")
    )

    LLVMValueRef(
        "GetUndef",
        "Obtain a constant value referring to an undefined value of a type.",

        LLVMTypeRef("Ty", "")
    )

    IgnoreMissing..LLVMValueRef(
        "GetPoison",
        "Obtain a constant value referring to a poison value of a type.",

        LLVMTypeRef("Ty", ""),

        since = "12"
    )

    LLVMBool(
        "IsNull",
        "Determine whether a value instance is null.",

        LLVMValueRef("Val", "")
    )

    LLVMValueRef(
        "ConstPointerNull",
        "Obtain a constant that is a constant pointer pointing to NULL for a specified type.",

        LLVMTypeRef("Ty", "")
    )

    LLVMValueRef(
        "ConstInt",
        """
        Obtain a constant value for an integer type.

        The returned value corresponds to a {@code llvm::ConstantInt}.
        """,

        LLVMTypeRef("IntTy", "integer type to obtain value of"),
        unsigned_long_long("N", "the value the returned instance should refer to"),
        LLVMBool("SignExtend", "whether to sign extend the produced value")
    )

    LLVMValueRef(
        "ConstIntOfArbitraryPrecision",
        "Obtain a constant value for an integer of arbitrary precision.",

        LLVMTypeRef("IntTy", ""),
        AutoSize("Words")..unsigned_int("NumWords", ""),
        uint64_t.const.p("Words", "")
    )

    LLVMValueRef(
        "ConstIntOfString",
        """
        Obtain a constant value for an integer parsed from a string.

        A similar API, #ConstIntOfStringAndSize() is also available. If the string's length is available, it is preferred to call that function instead.
        """,

        LLVMTypeRef("IntTy", ""),
        charUTF8.const.p("Text", ""),
        uint8_t("Radix", "")
    )

    LLVMValueRef(
        "ConstIntOfStringAndSize",
        "Obtain a constant value for an integer parsed from a string with specified length.",

        LLVMTypeRef("IntTy", ""),
        charUTF8.const.p("Text", ""),
        AutoSize("Text")..unsigned_int("SLen", ""),
        uint8_t("Radix", "")
    )

    LLVMValueRef(
        "ConstReal",
        "Obtain a constant value referring to a double floating point value.",

        LLVMTypeRef("RealTy", ""),
        double("N", "")
    )

    LLVMValueRef(
        "ConstRealOfString",
        """
        Obtain a constant for a floating point value parsed from a string.

        A similar API, #ConstRealOfStringAndSize() is also available. It should be used if the input string's length is known.
        """,

        LLVMTypeRef("RealTy", ""),
        charUTF8.const.p("Text", "")
    )

    LLVMValueRef(
        "ConstRealOfStringAndSize",
        "Obtain a constant for a floating point value parsed from a string.",

        LLVMTypeRef("RealTy", ""),
        charUTF8.const.p("Text", ""),
        AutoSize("Text")..unsigned_int("SLen", "")
    )

    unsigned_long_long(
        "ConstIntGetZExtValue",
        "Obtain the zero extended value for an integer constant value.",

        LLVMValueRef("ConstantVal", "")
    )

    long_long(
        "ConstIntGetSExtValue",
        "Obtain the sign extended value for an integer constant value.",

        LLVMValueRef("ConstantVal", "")
    )

    double(
        "ConstRealGetDouble",
        "Obtain the double value for an floating point constant value. {@code losesInfo} indicates if some precision was lost in the conversion.",

        LLVMValueRef("ConstantVal", ""),
        Check(1)..LLVMBool.p("losesInfo", "")
    )

    LLVMValueRef(
        "ConstStringInContext",
        "Create a {@code ConstantDataSequential} and initialize it with a string.",

        LLVMContextRef("C", ""),
        charUTF8.const.p("Str", ""),
        AutoSize("Str")..unsigned_int("Length", ""),
        LLVMBool("DontNullTerminate", "")
    )

    LLVMValueRef(
        "ConstString",
        """
        Create a {@code ConstantDataSequential} with string content in the global context.

        This is the same as #ConstStringInContext() except it operates on the global context.
        """,

        charUTF8.const.p("Str", ""),
        AutoSize("Str")..unsigned_int("Length", ""),
        LLVMBool("DontNullTerminate", "")
    )

    LLVMBool(
        "IsConstantString",
        "Returns true if the specified constant is an array of {@code i8}.",

        LLVMValueRef("c", "")
    )

    Nonnull..charUTF8.const.p(
        "GetAsString",
        "Get the given constant data sequential as a string.",

        LLVMValueRef("c", ""),
        AutoSizeResult..size_t.p("Length", "")
    )

    LLVMValueRef(
        "ConstStructInContext",
        "Create an anonymous {@code ConstantStruct} with the specified values.",

        LLVMContextRef("C", ""),
        LLVMValueRef.p("ConstantVals", ""),
        AutoSize("ConstantVals")..unsigned_int("Count", ""),
        LLVMBool("Packed", "")
    )

    LLVMValueRef(
        "ConstStruct",
        """
        Create a {@code ConstantStruct} in the global Context.

        This is the same as #ConstStructInContext() except it operates on the global Context.
        """,

        LLVMValueRef.p("ConstantVals", ""),
        AutoSize("ConstantVals")..unsigned_int("Count", ""),
        LLVMBool("Packed", "")
    )

    LLVMValueRef(
        "ConstArray",
        "Create a {@code ConstantArray} from values.",

        LLVMTypeRef("ElementTy", ""),
        LLVMValueRef.p("ConstantVals", ""),
        AutoSize("ConstantVals")..unsigned_int("Length", "")
    )

    LLVMValueRef(
        "ConstNamedStruct",
        "Create a non-anonymous {@code ConstantStruct} from values.",

        LLVMTypeRef("StructTy", ""),
        LLVMValueRef.p("ConstantVals", ""),
        AutoSize("ConstantVals")..unsigned_int("Count", "")
    )

    LLVMValueRef(
        "GetElementAsConstant",
        "Get an element at specified index as a constant.",

        LLVMValueRef("C", ""),
        unsigned_int("idx", "")
    )

    LLVMValueRef(
        "ConstVector",
        "Create a {@code ConstantVector} from values.",

        LLVMValueRef.p("ScalarConstantVals", ""),
        AutoSize("ScalarConstantVals")..unsigned_int("Size", "")
    )

    LLVMOpcode(
        "GetConstOpcode",
        "",

        LLVMValueRef("ConstantVal", "")
    )

    LLVMValueRef(
        "AlignOf",
        "",

        LLVMTypeRef("Ty", "")
    )

    LLVMValueRef(
        "SizeOf",
        "",

        LLVMTypeRef("Ty", "")
    )

    LLVMValueRef(
        "ConstNeg",
        "",

        LLVMValueRef("ConstantVal", "")
    )

    LLVMValueRef(
        "ConstNSWNeg",
        "",

        LLVMValueRef("ConstantVal", "")
    )

    LLVMValueRef(
        "ConstNUWNeg",
        "",

        LLVMValueRef("ConstantVal", "")
    )

    LLVMValueRef(
        "ConstFNeg",
        "",

        LLVMValueRef("ConstantVal", "")
    )

    LLVMValueRef(
        "ConstNot",
        "",

        LLVMValueRef("ConstantVal", "")
    )

    LLVMValueRef(
        "ConstAdd",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstNSWAdd",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstNUWAdd",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstFAdd",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstSub",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstNSWSub",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstNUWSub",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstFSub",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstMul",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstNSWMul",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstNUWMul",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstFMul",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstUDiv",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstExactUDiv",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstSDiv",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstExactSDiv",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstFDiv",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstURem",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstSRem",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstFRem",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstAnd",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstOr",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstXor",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstICmp",
        "",

        LLVMIntPredicate("Predicate", ""),
        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstFCmp",
        "",

        LLVMRealPredicate("Predicate", ""),
        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstShl",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstLShr",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstAShr",
        "",

        LLVMValueRef("LHSConstant", ""),
        LLVMValueRef("RHSConstant", "")
    )

    LLVMValueRef(
        "ConstGEP",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMValueRef.p("ConstantIndices", ""),
        AutoSize("ConstantIndices")..unsigned_int("NumIndices", "")
    )

    IgnoreMissing..LLVMValueRef(
        "ConstGEP2",
        "",

        LLVMTypeRef("Ty", ""),
        LLVMValueRef("ConstantVal", ""),
        LLVMValueRef.p("ConstantIndices", ""),
        AutoSize("ConstantIndices")..unsigned_int("NumIndices", ""),

        since = "8.0"
    )

    LLVMValueRef(
        "ConstInBoundsGEP",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMValueRef.p("ConstantIndices", ""),
        AutoSize("ConstantIndices")..unsigned_int("NumIndices", "")
    )

    IgnoreMissing..LLVMValueRef(
        "ConstInBoundsGEP2",
        "",

        LLVMTypeRef("Ty", ""),
        LLVMValueRef("ConstantVal", ""),
        LLVMValueRef.p("ConstantIndices", ""),
        AutoSize("ConstantIndices")..unsigned_int("NumIndices", ""),

        since = "8.0"
    )

    LLVMValueRef(
        "ConstTrunc",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMTypeRef("ToType", "")
    )

    LLVMValueRef(
        "ConstSExt",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMTypeRef("ToType", "")
    )

    LLVMValueRef(
        "ConstZExt",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMTypeRef("ToType", "")
    )

    LLVMValueRef(
        "ConstFPTrunc",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMTypeRef("ToType", "")
    )

    LLVMValueRef(
        "ConstFPExt",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMTypeRef("ToType", "")
    )

    LLVMValueRef(
        "ConstUIToFP",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMTypeRef("ToType", "")
    )

    LLVMValueRef(
        "ConstSIToFP",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMTypeRef("ToType", "")
    )

    LLVMValueRef(
        "ConstFPToUI",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMTypeRef("ToType", "")
    )

    LLVMValueRef(
        "ConstFPToSI",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMTypeRef("ToType", "")
    )

    LLVMValueRef(
        "ConstPtrToInt",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMTypeRef("ToType", "")
    )

    LLVMValueRef(
        "ConstIntToPtr",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMTypeRef("ToType", "")
    )

    LLVMValueRef(
        "ConstBitCast",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMTypeRef("ToType", "")
    )

    LLVMValueRef(
        "ConstAddrSpaceCast",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMTypeRef("ToType", "")
    )

    LLVMValueRef(
        "ConstZExtOrBitCast",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMTypeRef("ToType", "")
    )

    LLVMValueRef(
        "ConstSExtOrBitCast",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMTypeRef("ToType", "")
    )

    LLVMValueRef(
        "ConstTruncOrBitCast",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMTypeRef("ToType", "")
    )

    LLVMValueRef(
        "ConstPointerCast",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMTypeRef("ToType", "")
    )

    LLVMValueRef(
        "ConstIntCast",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMTypeRef("ToType", ""),
        LLVMBool("isSigned", "")
    )

    LLVMValueRef(
        "ConstFPCast",
        "",

        LLVMValueRef("ConstantVal", ""),
        LLVMTypeRef("ToType", "")
    )

    LLVMValueRef(
        "ConstSelect",
        "",

        LLVMValueRef("ConstantCondition", ""),
        LLVMValueRef("ConstantIfTrue", ""),
        LLVMValueRef("ConstantIfFalse", "")
    )

    LLVMValueRef(
        "ConstExtractElement",
        "",

        LLVMValueRef("VectorConstant", ""),
        LLVMValueRef("IndexConstant", "")
    )

    LLVMValueRef(
        "ConstInsertElement",
        "",

        LLVMValueRef("VectorConstant", ""),
        LLVMValueRef("ElementValueConstant", ""),
        LLVMValueRef("IndexConstant", "")
    )

    LLVMValueRef(
        "ConstShuffleVector",
        "",

        LLVMValueRef("VectorAConstant", ""),
        LLVMValueRef("VectorBConstant", ""),
        LLVMValueRef("MaskConstant", "")
    )

    LLVMValueRef(
        "ConstExtractValue",
        "",

        LLVMValueRef("AggConstant", ""),
        unsigned_int.p("IdxList", ""),
        AutoSize("IdxList")..unsigned_int("NumIdx", "")
    )

    LLVMValueRef(
        "ConstInsertValue",
        "",

        LLVMValueRef("AggConstant", ""),
        LLVMValueRef("ElementValueConstant", ""),
        unsigned_int.p("IdxList", ""),
        AutoSize("IdxList")..unsigned_int("NumIdx", "")
    )

    IgnoreMissing..LLVMValueRef(
        "BlockAddress",
        "",

        LLVMValueRef("F", ""),
        LLVMBasicBlockRef("BB", "")
    )

    LLVMValueRef(
        "ConstInlineAsm",
        "Deprecated: Use #GetInlineAsm() instead.",

        LLVMTypeRef("Ty", ""),
        charUTF8.const.p("AsmString", ""),
        charUTF8.const.p("Constraints", ""),
        LLVMBool("HasSideEffects", ""),
        LLVMBool("IsAlignStack", "")
    )

    LLVMModuleRef(
        "GetGlobalParent",
        "",

        LLVMValueRef("Global", "")
    )

    LLVMBool(
        "IsDeclaration",
        "",

        LLVMValueRef("Global", "")
    )

    LLVMLinkage(
        "GetLinkage",
        "",

        LLVMValueRef("Global", "")
    )

    void(
        "SetLinkage",
        "",

        LLVMValueRef("Global", ""),
        LLVMLinkage("Linkage", "")
    )

    Nonnull..charUTF8.const.p(
        "GetSection",
        "",

        LLVMValueRef("Global", "")
    )

    void(
        "SetSection",
        "",

        LLVMValueRef("Global", ""),
        charUTF8.const.p("Section", "")
    )

    LLVMVisibility(
        "GetVisibility",
        "",

        LLVMValueRef("Global", "")
    )

    void(
        "SetVisibility",
        "",

        LLVMValueRef("Global", ""),
        LLVMVisibility("Viz", "")
    )

    LLVMDLLStorageClass(
        "GetDLLStorageClass",
        "",

        LLVMValueRef("Global", "")
    )

    void(
        "SetDLLStorageClass",
        "",

        LLVMValueRef("Global", ""),
        LLVMDLLStorageClass("Class", "")
    )

    IgnoreMissing..LLVMUnnamedAddr(
        "GetUnnamedAddress",
        "",

        LLVMValueRef("Global", "")
    )

    IgnoreMissing..void(
        "SetUnnamedAddress",
        "",

        LLVMValueRef("Global", ""),
        LLVMUnnamedAddr("UnnamedAddr", "")
    )

    IgnoreMissing..LLVMTypeRef(
        "GlobalGetValueType",
        "Returns the \"value type\" of a global value.  This differs from the formal type of a global value which is always a pointer type.",

        LLVMValueRef("Global", "")
    )

    LLVMBool(
        "HasUnnamedAddr",
        "Deprecated: Use #GetUnnamedAddress() instead.",

        LLVMValueRef("Global", "")
    )

    void(
        "SetUnnamedAddr",
        "Deprecated: Use #SetUnnamedAddress() instead.",

        LLVMValueRef("Global", ""),
        LLVMBool("HasUnnamedAddr", "")
    )

    unsigned_int(
        "GetAlignment",
        "Obtain the preferred alignment of the value.",

        LLVMValueRef("V", "")
    )

    void(
        "SetAlignment",
        "Set the preferred alignment of the value.",

        LLVMValueRef("V", ""),
        unsigned_int("Bytes", "")
    )

    IgnoreMissing..void(
        "GlobalSetMetadata",
        "Sets a metadata attachment, erasing the existing metadata attachment if it already exists for the given kind.",

        LLVMValueRef("Global", ""),
        unsigned_int("Kind", ""),
        LLVMMetadataRef("MD", "")
    )

    IgnoreMissing..void(
        "GlobalEraseMetadata",
        "Erases a metadata attachment of the given kind if it exists.",

        LLVMValueRef("Global", ""),
        unsigned_int("Kind", "")
    )

    IgnoreMissing..void(
        "GlobalClearMetadata",
        "Removes all metadata attachments from this value.",

        LLVMValueRef("Global", "")
    )

    IgnoreMissing..LLVMValueMetadataEntry.p(
        "GlobalCopyAllMetadata",
        """
        Retrieves an array of metadata entries representing the metadata attached to this value. The caller is responsible for freeing this array by calling
        #DisposeValueMetadataEntries().
        """,

        LLVMValueRef("Value", ""),
        Check(1)..size_t.p("NumEntries", "")
    )

    IgnoreMissing..void(
        "DisposeValueMetadataEntries",
        "Destroys value metadata entries.",

        LLVMValueMetadataEntry.p("Entries", "")
    )

    IgnoreMissing..unsigned_int(
        "ValueMetadataEntriesGetKind",
        "Returns the kind of a value metadata entry at a specific index.",

        LLVMValueMetadataEntry.p("Entries", ""),
        unsigned_int("Index", "")
    )

    IgnoreMissing..LLVMMetadataRef(
        "ValueMetadataEntriesGetMetadata",
        "Returns the underlying metadata node of a value metadata entry at a specific index.",

        LLVMValueMetadataEntry.p("Entries", ""),
        unsigned_int("Index", "")
    )

    LLVMValueRef(
        "AddGlobal",
        "",

        LLVMModuleRef("M", ""),
        LLVMTypeRef("Ty", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "AddGlobalInAddressSpace",
        "",

        LLVMModuleRef("M", ""),
        LLVMTypeRef("Ty", ""),
        charUTF8.const.p("Name", ""),
        unsigned_int("AddressSpace", "")
    )

    LLVMValueRef(
        "GetNamedGlobal",
        "",

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "GetFirstGlobal",
        "",

        LLVMModuleRef("M", "")
    )

    LLVMValueRef(
        "GetLastGlobal",
        "",

        LLVMModuleRef("M", "")
    )

    LLVMValueRef(
        "GetNextGlobal",
        "",

        LLVMValueRef("GlobalVar", "")
    )

    LLVMValueRef(
        "GetPreviousGlobal",
        "",

        LLVMValueRef("GlobalVar", "")
    )

    void(
        "DeleteGlobal",
        "",

        LLVMValueRef("GlobalVar", "")
    )

    LLVMValueRef(
        "GetInitializer",
        "",

        LLVMValueRef("GlobalVar", "")
    )

    void(
        "SetInitializer",
        "",

        LLVMValueRef("GlobalVar", ""),
        LLVMValueRef("ConstantVal", "")
    )

    LLVMBool(
        "IsThreadLocal",
        "",

        LLVMValueRef("GlobalVar", "")
    )

    void(
        "SetThreadLocal",
        "",

        LLVMValueRef("GlobalVar", ""),
        LLVMBool("IsThreadLocal", "")
    )

    LLVMBool(
        "IsGlobalConstant",
        "",

        LLVMValueRef("GlobalVar", "")
    )

    void(
        "SetGlobalConstant",
        "",

        LLVMValueRef("GlobalVar", ""),
        LLVMBool("IsConstant", "")
    )

    LLVMThreadLocalMode(
        "GetThreadLocalMode",
        "",

        LLVMValueRef("GlobalVar", "")
    )

    void(
        "SetThreadLocalMode",
        "",

        LLVMValueRef("GlobalVar", ""),
        LLVMThreadLocalMode("Mode", "")
    )

    LLVMBool(
        "IsExternallyInitialized",
        "",

        LLVMValueRef("GlobalVar", "")
    )

    void(
        "SetExternallyInitialized",
        "",

        LLVMValueRef("GlobalVar", ""),
        LLVMBool("IsExtInit", "")
    )

    LLVMValueRef(
        "AddAlias",
        "",

        LLVMModuleRef("M", ""),
        LLVMTypeRef("Ty", ""),
        LLVMValueRef("Aliasee", ""),
        charUTF8.const.p("Name", "")
    )

    IgnoreMissing..LLVMValueRef(
        "GetNamedGlobalAlias",
        """
        Obtain a GlobalAlias value from a Module by its name.

        The returned value corresponds to a {@code llvm::GlobalAlias} value.
        """,

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Name", ""),
        AutoSize("Name")..size_t("NameLen", "")
    )

    IgnoreMissing..LLVMValueRef(
        "GetFirstGlobalAlias",
        "Obtain an iterator to the first GlobalAlias in a Module.",

        LLVMModuleRef("M", "")
    )

    IgnoreMissing..LLVMValueRef(
        "GetLastGlobalAlias",
        "Obtain an iterator to the last GlobalAlias in a Module.",

        LLVMModuleRef("M", "")
    )

    IgnoreMissing..LLVMValueRef(
        "GetNextGlobalAlias",
        """
        Advance a {@code GlobalAlias} iterator to the next {@code GlobalAlias}.

        Returns #NULL if the iterator was already at the end and there are no more global aliases.
        """,

        LLVMValueRef("GA", "")
    )

    IgnoreMissing..LLVMValueRef(
        "GetPreviousGlobalAlias",
        """
        Decrement a {@code GlobalAlias} iterator to the previous {@code GlobalAlias}.

        Returns #NULL if the iterator was already at the beginning and there are no previous global aliases.
        """,

        LLVMValueRef("GA", "")
    )

    IgnoreMissing..LLVMValueRef(
        "AliasGetAliasee",
        "Retrieve the target value of an alias.",

        LLVMValueRef("Alias", "")
    )

    IgnoreMissing..void(
        "AliasSetAliasee",
        "Set the target value of an alias.",

        LLVMValueRef("Alias", ""),
        LLVMValueRef("Aliasee", "")
    )

    void(
        "DeleteFunction",
        "Remove a function from its containing module and deletes it.",

        LLVMValueRef("Fn", "")
    )

    LLVMBool(
        "HasPersonalityFn",
        "Check whether the given function has a personality function.",

        LLVMValueRef("Fn", "")
    )

    LLVMValueRef(
        "GetPersonalityFn",
        "Obtain the personality function attached to the function.",

        LLVMValueRef("Fn", "")
    )

    void(
        "SetPersonalityFn",
        "Set the personality function attached to the function.",

        LLVMValueRef("Fn", ""),
        LLVMValueRef("PersonalityFn", "")
    )

    IgnoreMissing..void(
        "LookupIntrinsicID",
        "Obtain the intrinsic ID number which matches the given function name.",

        charUTF8.const.p("Name", ""),
        AutoSize("Name")..size_t("NameLen", ""),

        since = "9"
    )

    unsigned_int(
        "GetIntrinsicID",
        "Obtain the ID number from a function instance.",

        LLVMValueRef("Fn", "")
    )

    IgnoreMissing..LLVMValueRef(
        "GetIntrinsicDeclaration",
        """
        Create or insert the declaration of an intrinsic.

        For overloaded intrinsics, parameter types must be provided to uniquely identify an overload.
        """,

        LLVMModuleRef("Mod", ""),
        unsigned("ID", ""),
        LLVMTypeRef.p("ParamTypes", ""),
        AutoSize("ParamTypes")..size_t("ParamCount", ""),

        since = "8.0"
    )

    IgnoreMissing..LLVMValueRef(
        "IntrinsicGetType",
        """
        Retrieves the type of an intrinsic.

        For overloaded intrinsics, parameter types must be provided to uniquely identify an overload.
        """,

        LLVMContextRef("Ctx", ""),
        unsigned("ID", ""),
        LLVMTypeRef.p("ParamTypes", ""),
        AutoSize("ParamTypes")..size_t("ParamCount", ""),

        since = "8.0"
    )

    IgnoreMissing..charUTF8.const.p(
        "IntrinsicGetName",
        "Retrieves the name of an intrinsic.",

        unsigned("ID", ""),
        AutoSizeResult..Check(1)..size_t.p("NameLength", ""),

        since = "8.0"
    )

    IgnoreMissing..charUTF8.const.p(
        "IntrinsicCopyOverloadedName",
        "Deprecated: Use #IntrinsicCopyOverloadedName2() instead.",

        unsigned("ID", ""),
        LLVMTypeRef.p("ParamTypes", ""),
        AutoSize("ParamTypes")..size_t("ParamCount", ""),
        AutoSizeResult..Check(1)..size_t.p("NameLength", ""),

        since = "8.0"
    )

    IgnoreMissing..charUTF8.const.p(
        "IntrinsicCopyOverloadedName2",
        """
        Copies the name of an overloaded intrinsic identified by a given list of parameter types.

        Unlike #IntrinsicGetName(), the caller is responsible for freeing the returned string.

        This version also supports unnamed types.
        """,

        LLVMModuleRef("Mod", ""),
        unsigned("ID", ""),
        LLVMTypeRef.p("ParamTypes", ""),
        AutoSize("ParamTypes")..size_t("ParamCount", ""),
        AutoSizeResult..Check(1)..size_t.p("NameLength", ""),

        since = "13"
    )

    IgnoreMissing..LLVMBool(
        "IntrinsicIsOverloaded",
        "Obtain if the intrinsic identified by the given ID is overloaded.",

        unsigned("ID", ""),

        since = "8.0"
    )

    unsigned_int(
        "GetFunctionCallConv",
        """
        Obtain the calling function of a function.

        The returned value corresponds to the {@code LLVMCallConv} enumeration.
        """,

        LLVMValueRef("Fn", "")
    )

    void(
        "SetFunctionCallConv",
        "Set the calling convention of a function.",

        LLVMValueRef("Fn", "function to operate on"),
        unsigned_int("CC", "{@code LLVMCallConv} to set calling convention to")
    )

    charUTF8.const.p(
        "GetGC",
        "Obtain the name of the garbage collector to use during code generation.",

        LLVMValueRef("Fn", "")
    )

    void(
        "SetGC",
        "Define the garbage collector to use during code generation.",

        LLVMValueRef("Fn", ""),
        charUTF8.const.p("Name", "")
    )

    void(
        "AddAttributeAtIndex",
        "Add an attribute to a function.",

        LLVMValueRef("F", ""),
        LLVMAttributeIndex("Idx", ""),
        LLVMAttributeRef("A", "")
    )

    unsigned_int(
        "GetAttributeCountAtIndex",
        "",

        LLVMValueRef("F", ""),
        LLVMAttributeIndex("Idx", "")
    )

    void(
        "GetAttributesAtIndex",
        "",

        LLVMValueRef("F", ""),
        LLVMAttributeIndex("Idx", ""),
        Check(
            "LLVMGetAttributeCountAtIndex(F, Idx)", debug = true
        )..LLVMAttributeRef.p("Attrs", "")
    )

    LLVMAttributeRef(
        "GetEnumAttributeAtIndex",
        "",

        LLVMValueRef("F", ""),
        LLVMAttributeIndex("Idx", ""),
        unsigned_int("KindID", "")
    )

    LLVMAttributeRef(
        "GetStringAttributeAtIndex",
        "",

        LLVMValueRef("F", ""),
        LLVMAttributeIndex("Idx", ""),
        charUTF8.const.p("K", ""),
        AutoSize("K")..unsigned_int("KLen", "")
    )

    void(
        "RemoveEnumAttributeAtIndex",
        "",

        LLVMValueRef("F", ""),
        LLVMAttributeIndex("Idx", ""),
        unsigned_int("KindID", "")
    )

    void(
        "RemoveStringAttributeAtIndex",
        "",

        LLVMValueRef("F", ""),
        LLVMAttributeIndex("Idx", ""),
        charUTF8.const.p("K", ""),
        AutoSize("K")..unsigned_int("KLen", "")
    )

    void(
        "AddTargetDependentFunctionAttr",
        "Add a target-dependent attribute to a function",

        LLVMValueRef("Fn", ""),
        charUTF8.const.p("A", ""),
        charUTF8.const.p("V", "")
    )

    unsigned_int(
        "CountParams",
        "Obtain the number of parameters in a function.",

        LLVMValueRef("Fn", "")
    )

    void(
        "GetParams",
        """
        Obtain the parameters in a function.

        The takes a pointer to a pre-allocated array of {@code LLVMValueRef} that is at least #CountParams() long. This array will be filled with
        {@code LLVMValueRef} instances which correspond to the parameters the function receives. Each {@code LLVMValueRef} corresponds to a
        {@code llvm::Argument} instance.
        """,

        LLVMValueRef("Fn", ""),
        Check(
            "LLVMCountParams(Fn)", debug = true
        )..LLVMValueRef.p("Params", "")
    )

    LLVMValueRef(
        "GetParam",
        """
        Obtain the parameter at the specified index.

        Parameters are indexed from 0.
        """,

        LLVMValueRef("Fn", ""),
        unsigned_int("Index", "")
    )

    LLVMValueRef(
        "GetParamParent",
        """
        Obtain the function to which this argument belongs.

        Unlike other functions in this group, this one takes an {@code LLVMValueRef} that corresponds to a {@code llvm::Attribute}.

        The returned {@code LLVMValueRef} is the {@code llvm::Function} to which this argument belongs.
        """,

        LLVMValueRef("Inst", "")
    )

    LLVMValueRef(
        "GetFirstParam",
        "Obtain the first parameter to a function.",

        LLVMValueRef("Fn", "")
    )

    LLVMValueRef(
        "GetLastParam",
        "Obtain the last parameter to a function.",

        LLVMValueRef("Fn", "")
    )

    LLVMValueRef(
        "GetNextParam",
        """
        Obtain the next parameter to a function.

        This takes an {@code LLVMValueRef} obtained from #GetFirstParam() (which is actually a wrapped iterator) and obtains the next parameter from the
        underlying iterator.
        """,

        LLVMValueRef("Arg", "")
    )

    LLVMValueRef(
        "GetPreviousParam",
        """
        Obtain the previous parameter to a function.

        This is the opposite of #GetNextParam().
        """,

        LLVMValueRef("Arg", "")
    )

    void(
        "SetParamAlignment",
        "Set the alignment for a function parameter.",

        LLVMValueRef("Arg", ""),
        unsigned_int("Align", "")
    )

    IgnoreMissing..LLVMValueRef(
        "AddGlobalIFunc",
        """
        Add a global indirect function to a module under a specified name.

        See {@code llvm::GlobalIFunc::create()}
        """,

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Name", ""),
        AutoSize("Name")..size_t("NameLen", ""),
        LLVMTypeRef("Ty", ""),
        unsigned("AddrSpace", ""),
        LLVMValueRef("Resolver", ""),

        since = "9"
    )

    IgnoreMissing..LLVMValueRef(
        "GetNamedGlobalIFunc",
        """
        Obtain a {@code GlobalIFunc} value from a {@code Module} by its name.

        The returned value corresponds to a {@code llvm::GlobalIFunc} value.

        See {@code llvm::Module::getNamedIFunc()}
        """,

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Name", ""),
        AutoSize("Name")..size_t("NameLen", ""),

        since = "9"
    )

    IgnoreMissing..LLVMValueRef(
        "GetFirstGlobalIFunc",
        """
        Obtain an iterator to the first {@code GlobalIFunc} in a {@code Module}.

        See {@code llvm::Module::ifunc_begin()}
        """,

        LLVMModuleRef("M", ""),

        since = "9"
    )

    IgnoreMissing..LLVMValueRef(
        "GetLastGlobalIFunc",
        """
        Obtain an iterator to the last {@code GlobalIFunc} in a {@code Module}.

        See {@code llvm::Module::ifunc_end()}.
        """,

        LLVMModuleRef("M", ""),

        since = "9"
    )

    IgnoreMissing..LLVMValueRef(
        "GetNextGlobalIFunc",
        """
        Advance a {@code GlobalIFunc} iterator to the next {@code GlobalIFunc}.

        Returns #NULL if the iterator was already at the end and there are no more global aliases.
        """,

        LLVMValueRef("IFunc", ""),

        since = "9"
    )

    IgnoreMissing..LLVMValueRef(
        "GetPreviousGlobalIFunc",
        """
        Decrement a {@code GlobalIFunc} iterator to the previous {@code GlobalIFunc}.

        Returns #NULL if the iterator was already at the beginning and there are no previous global aliases.
        """,

        LLVMValueRef("IFunc", ""),

        since = "9"
    )

    IgnoreMissing..LLVMValueRef(
        "GetGlobalIFuncResolver",
        """
        Retrieves the resolver function associated with this indirect function, or #NULL if it doesn't not exist.

        See {@code llvm::GlobalIFunc::getResolver()}
        """,

        LLVMValueRef("IFunc", ""),

        since = "9"
    )

    IgnoreMissing..void(
        "SetGlobalIFuncResolver",
        """
        Sets the resolver function associated with this indirect function.

        See {@code llvm::GlobalIFunc::setResolver()}
        """,

        LLVMValueRef("IFunc", ""),
        LLVMValueRef("Resolver", ""),

        since = "9"
    )

    IgnoreMissing..void(
        "EraseGlobalIFunc",
        """
        Remove a global indirect function from its parent module and delete it.

        See {@code llvm::GlobalIFunc::eraseFromParent()}
        """,

        LLVMValueRef("IFunc", ""),

        since = "9"
    )

    IgnoreMissing..void(
        "RemoveGlobalIFunc",
        """
        Remove a global indirect function from its parent module.

        This unlinks the global indirect function from its containing module but keeps it alive.

        See {@code llvm::GlobalIFunc::removeFromParent()}
        """,

        LLVMValueRef("IFunc", ""),

        since = "9"
    )

    IgnoreMissing..LLVMMetadataRef(
        "MDStringInContext2",
        """
        Create an {@code MDString} value from a given string value.

        The {@code MDString} value does not take ownership of the given string, it remains the responsibility of the caller to free it.

        See {@code llvm::MDString::get()}
        """,

        LLVMContextRef("C", ""),
        charUTF8.const.p("Str", ""),
        AutoSize("Str")..size_t("SLen", ""),

        since = "9"
    )

    IgnoreMissing..LLVMMetadataRef(
        "MDNodeInContext2",
        """
        Create an {@code MDNode} value with the given array of operands.

        See {@code llvm::MDNode::get()}
        """,

        LLVMContextRef("C", ""),
        LLVMMetadataRef.p("MDs", ""),
        AutoSize("MDs")..size_t("Count", ""),

        since = "9"
    )

    LLVMValueRef(
        "MDStringInContext",
        "Deprecated: Use #MDStringInContext2() instead.",

        LLVMContextRef("C", ""),
        charUTF8.const.p("Str", ""),
        AutoSize("Str")..unsigned_int("SLen", "")
    )

    LLVMValueRef(
        "MDString",
        "Deprecated: Use #MDStringInContext2() instead.",

        charUTF8.const.p("Str", ""),
        AutoSize("Str")..unsigned_int("SLen", "")
    )

    LLVMValueRef(
        "MDNodeInContext",
        "Deprecated: Use #MDNodeInContext2() instead.",

        LLVMContextRef("C", ""),
        LLVMValueRef.p("Vals", ""),
        AutoSize("Vals")..unsigned_int("Count", "")
    )

    LLVMValueRef(
        "MDNode",
        "Deprecated: Use #MDNodeInContext2() instead.",

        LLVMValueRef.p("Vals", ""),
        AutoSize("Vals")..unsigned_int("Count", "")
    )

    LLVMValueRef(
        "MetadataAsValue",
        "Obtain a {@code Metadata} as a Value.",

        LLVMContextRef("C", ""),
        LLVMMetadataRef("MD", "")
    )

    LLVMMetadataRef(
        "ValueAsMetadata",
        "Obtain a {@code Value} as a {@code Metadata}.",

        LLVMValueRef("Val", "")
    )

    charUTF8.const.p(
        "GetMDString",
        "Obtain the underlying string from a {@code MDString} value.",

        LLVMValueRef("V", "instance to obtain string from"),
        AutoSizeResult..unsigned_int.p("Length", "memory address which will hold length of returned string"),

        returnDoc = "string data in {@code MDString}"
    )

    unsigned_int(
        "GetMDNodeNumOperands",
        "Obtain the number of operands from an {@code MDNode} value.",

        LLVMValueRef("V", "{@code MDNode} to get number of operands from"),

        returnDoc = "number of operands of the {@code MDNode}"
    )

    void(
        "GetMDNodeOperands",
        """
        Obtain the given {@code MDNode}'s operands.

        The passed {@code LLVMValueRef} pointer should point to enough memory to hold all of the operands of the given {@code MDNode} (see
        #GetMDNodeNumOperands()) as {@code LLVMValueRefs}. This memory will be populated with the {@code LLVMValueRefs} of the {@code MDNode}'s operands.
        """,

        LLVMValueRef("V", "MDNode to get the operands from"),
        Check(
            "LLVMGetMDNodeNumOperands(V)", debug = true
        )..LLVMValueRef.p("Dest", "destination array for operands")
    )

    LLVMValueRef(
        "BasicBlockAsValue",
        "Convert a basic block instance to a value type.",

        LLVMBasicBlockRef("BB", "")
    )

    LLVMBool(
        "ValueIsBasicBlock",
        "Determine whether an {@code LLVMValueRef} is itself a basic block.",

        LLVMValueRef("Val", "")
    )

    LLVMBasicBlockRef(
        "ValueAsBasicBlock",
        "Convert an {@code LLVMValueRef} to an {@code LLVMBasicBlockRef} instance.",

        LLVMValueRef("Val", "")
    )

    Nonnull..charUTF8.const.p(
        "GetBasicBlockName",
        "Obtain the string name of a basic block.",

        LLVMBasicBlockRef("BB", "")
    )

    LLVMValueRef(
        "GetBasicBlockParent",
        "Obtain the function to which a basic block belongs.",

        LLVMBasicBlockRef("BB", "")
    )

    LLVMValueRef(
        "GetBasicBlockTerminator",
        """
        Obtain the terminator instruction for a basic block.

        If the basic block does not have a terminator (it is not well-formed if it doesn't), then #NULL is returned.

        The returned {@code LLVMValueRef} corresponds to an {@code llvm::Instruction}.
        """,

        LLVMBasicBlockRef("BB", "")
    )

    unsigned_int(
        "CountBasicBlocks",
        "Obtain the number of basic blocks in a function.",

        LLVMValueRef("Fn", "function value to operate on")
    )

    void(
        "GetBasicBlocks",
        """
        Obtain all of the basic blocks in a function.

        This operates on a function value. The {@code BasicBlocks} parameter is a pointer to a pre-allocated array of {@code LLVMBasicBlockRef} of at least
        #CountBasicBlocks() in length. This array is populated with {@code LLVMBasicBlockRef} instances.
        """,

        LLVMValueRef("Fn", ""),
        Check(
            "LLVMCountBasicBlocks(Fn)", debug = true
        )..LLVMBasicBlockRef.p("BasicBlocks", "")
    )

    LLVMBasicBlockRef(
        "GetFirstBasicBlock",
        """
        Obtain the first basic block in a function.

        The returned basic block can be used as an iterator. You will likely eventually call into #GetNextBasicBlock() with it.
        """,

        LLVMValueRef("Fn", "")
    )

    LLVMBasicBlockRef(
        "GetLastBasicBlock",
        "Obtain the last basic block in a function.",

        LLVMValueRef("Fn", "")
    )

    LLVMBasicBlockRef(
        "GetNextBasicBlock",
        "Advance a basic block iterator.",

        LLVMBasicBlockRef("BB", "")
    )

    LLVMBasicBlockRef(
        "GetPreviousBasicBlock",
        "Go backwards in a basic block iterator.",

        LLVMBasicBlockRef("BB", "")
    )

    LLVMBasicBlockRef(
        "GetEntryBasicBlock",
        "Obtain the basic block that corresponds to the entry point of a function.",

        LLVMValueRef("Fn", "")
    )

    IgnoreMissing..void(
        "InsertExistingBasicBlockAfterInsertBlock",
        """
        Insert the given basic block after the insertion point of the given builder.

        The insertion point must be valid.

        See {@code llvm::Function::BasicBlockListType::insertAfter()}.        
        """,

        LLVMBuilderRef("Builder", ""),
        LLVMBasicBlockRef("BB", ""),

        since = "9"
    )

    IgnoreMissing..void(
        "AppendExistingBasicBlock",
        """
        Append the given basic block to the basic block list of the given function.

        See {@code llvm::Function::BasicBlockListType::push_back()}
        """,

        LLVMValueRef("Fn", ""),
        LLVMBasicBlockRef("BB", ""),

        since = "9"
    )

    IgnoreMissing..LLVMBasicBlockRef(
        "CreateBasicBlockInContext",
        "Create a new basic block without inserting it into a function.",

        LLVMContextRef("C", ""),
        charUTF8.const.p("Name", ""),

        since = "8.0"
    )

    LLVMBasicBlockRef(
        "AppendBasicBlockInContext",
        "Append a basic block to the end of a function.",

        LLVMContextRef("C", ""),
        LLVMValueRef("Fn", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMBasicBlockRef(
        "AppendBasicBlock",
        "Append a basic block to the end of a function using the global context.",

        LLVMValueRef("Fn", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMBasicBlockRef(
        "InsertBasicBlockInContext",
        """
        Insert a basic block in a function before another basic block.

        The function to add to is determined by the function of the passed basic block.
        """,

        LLVMContextRef("C", ""),
        LLVMBasicBlockRef("BB", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMBasicBlockRef(
        "InsertBasicBlock",
        "Insert a basic block in a function using the global context.",

        LLVMBasicBlockRef("InsertBeforeBB", ""),
        charUTF8.const.p("Name", "")
    )

    void(
        "DeleteBasicBlock",
        """
        Remove a basic block from a function and delete it.

        This deletes the basic block from its containing function and deletes the basic block itself.
        """,

        LLVMBasicBlockRef("BB", "")
    )

    void(
        "RemoveBasicBlockFromParent",
        """
        Remove a basic block from a function.

        This deletes the basic block from its containing function but keep the basic block alive.
        """,

        LLVMBasicBlockRef("BB", "")
    )

    void(
        "MoveBasicBlockBefore",
        "Move a basic block to before another one.",

        LLVMBasicBlockRef("BB", ""),
        LLVMBasicBlockRef("MovePos", "")
    )

    void(
        "MoveBasicBlockAfter",
        "Move a basic block to after another one.",

        LLVMBasicBlockRef("BB", ""),
        LLVMBasicBlockRef("MovePos", "")
    )

    LLVMValueRef(
        "GetFirstInstruction",
        """
        Obtain the first instruction in a basic block.

        The returned {@code LLVMValueRef} corresponds to a {@code llvm::Instruction} instance.
        """,

        LLVMBasicBlockRef("BB", "")
    )

    LLVMValueRef(
        "GetLastInstruction",
        """
        Obtain the last instruction in a basic block.

        The returned {@code LLVMValueRef} corresponds to an {@code LLVM::Instruction}.
        """,

        LLVMBasicBlockRef("BB", "")
    )

    intb(
        "HasMetadata",
        "Determine whether an instruction has any metadata attached.",

        LLVMValueRef("Val", "")
    )

    LLVMValueRef(
        "GetMetadata",
        "Return metadata associated with an instruction value.",

        LLVMValueRef("Val", ""),
        unsigned_int("KindID", "")
    )

    void(
        "SetMetadata",
        "Set metadata associated with an instruction value.",

        LLVMValueRef("Val", ""),
        unsigned_int("KindID", ""),
        LLVMValueRef("Node", "")
    )

    IgnoreMissing..LLVMValueMetadataEntry.p(
        "InstructionGetAllMetadataOtherThanDebugLoc",
        "Returns the metadata associated with an instruction value, but filters out all the debug locations.",

        LLVMValueRef("Instr", ""),
        Check(1)..size_t.p("NumEntries", "")
    )

    LLVMBasicBlockRef(
        "GetInstructionParent",
        "Obtain the basic block to which an instruction belongs.",

        LLVMValueRef("Inst", "")
    )

    LLVMValueRef(
        "GetNextInstruction",
        """
        Obtain the instruction that occurs after the one specified.

        The next instruction will be from the same basic block.

        If this is the last instruction in a basic block, #NULL will be returned.
        """,

        LLVMValueRef("Inst", "")
    )

    LLVMValueRef(
        "GetPreviousInstruction",
        """
        Obtain the instruction that occurred before this one.

        If the instruction is the first instruction in a basic block, #NULL will be returned.
        """,

        LLVMValueRef("Inst", "")
    )

    void(
        "InstructionRemoveFromParent",
        """
        Remove and delete an instruction.

        The instruction specified is removed from its containing building block but is kept alive.
        """,

        LLVMValueRef("Inst", "")
    )

    void(
        "InstructionEraseFromParent",
        """
        Remove and delete an instruction.

        The instruction specified is removed from its containing building block and then deleted.
        """,

        LLVMValueRef("Inst", "")
    )

    LLVMOpcode(
        "GetInstructionOpcode",
        "Obtain the code opcode for an individual instruction.",

        LLVMValueRef("Inst", "")
    )

    LLVMIntPredicate(
        "GetICmpPredicate",
        """
        Obtain the predicate of an instruction.

        This is only valid for instructions that correspond to {@code llvm::ICmpInst} or {@code llvm::ConstantExpr} whose opcode is
        {@code llvm::Instruction::ICmp}.
        """,

        LLVMValueRef("Inst", "")
    )

    LLVMRealPredicate(
        "GetFCmpPredicate",
        """
        Obtain the float predicate of an instruction.

        This is only valid for instructions that correspond to {@code llvm::FCmpInst} or {@code llvm::ConstantExpr} whose opcode is
        {@code llvm::Instruction::FCmp}.
        """,

        LLVMValueRef("Inst", "")
    )

    LLVMValueRef(
        "InstructionClone",
        """
        Create a copy of 'this' instruction that is identical in all ways except the following:

        ${ul(
            "The instruction has no parent",
            "The instruction has no name"
        )}
        """,

        LLVMValueRef("Inst", "")
    )

    LLVMValueRef(
        "IsATerminatorInst",
        """
        Determine whether an instruction is a terminator. This routine is named to be compatible with historical functions that did this by querying the
        underlying C++ type.
        """,

        LLVMValueRef("Inst", "")
    )

    unsigned_int(
        "GetNumArgOperands",
        """
        Obtain the argument count for a call instruction.

        This expects an {@code LLVMValueRef} that corresponds to a {@code llvm::CallInst}, {@code llvm::InvokeInst}, or {@code llvm::FuncletPadInst}.
        """,

        LLVMValueRef("Instr", "")
    )

    void(
        "SetInstructionCallConv",
        """
        Set the calling convention for a call instruction.

        This expects an {@code LLVMValueRef} that corresponds to a {@code llvm::CallInst} or {@code llvm::InvokeInst}.
        """,

        LLVMValueRef("Instr", ""),
        unsigned_int("CC", "")
    )

    unsigned_int(
        "GetInstructionCallConv",
        """
        Obtain the calling convention for a call instruction.

        This is the opposite of #SetInstructionCallConv(). Reads its usage.
        """,

        LLVMValueRef("Instr", "")
    )

    void(
        "SetInstrParamAlignment",
        "",

        LLVMValueRef("Instr", ""),
        unsigned_int("index", ""),
        unsigned_int("Align", "")
    )

    void(
        "AddCallSiteAttribute",
        "",

        LLVMValueRef("C", ""),
        LLVMAttributeIndex("Idx", ""),
        LLVMAttributeRef("A", "")
    )

    unsigned_int(
        "GetCallSiteAttributeCount",
        "",

        LLVMValueRef("C", ""),
        LLVMAttributeIndex("Idx", "")
    )

    void(
        "GetCallSiteAttributes",
        "",

        LLVMValueRef("C", ""),
        LLVMAttributeIndex("Idx", ""),
        Check(
            "LLVMGetCallSiteAttributeCount(C, Idx)", debug = true
        )..LLVMAttributeRef.p("Attrs", "")
    )

    LLVMAttributeRef(
        "GetCallSiteEnumAttribute",
        "",

        LLVMValueRef("C", ""),
        LLVMAttributeIndex("Idx", ""),
        unsigned_int("KindID", "")
    )

    LLVMAttributeRef(
        "GetCallSiteStringAttribute",
        "",

        LLVMValueRef("C", ""),
        LLVMAttributeIndex("Idx", ""),
        charUTF8.const.p("K", ""),
        AutoSize("K")..unsigned_int("KLen", "")
    )

    void(
        "RemoveCallSiteEnumAttribute",
        "",

        LLVMValueRef("C", ""),
        LLVMAttributeIndex("Idx", ""),
        unsigned_int("KindID", "")
    )

    void(
        "RemoveCallSiteStringAttribute",
        "",

        LLVMValueRef("C", ""),
        LLVMAttributeIndex("Idx", ""),
        charUTF8.const.p("K", ""),
        AutoSize("K")..unsigned_int("KLen", "")
    )

    IgnoreMissing..LLVMTypeRef(
        "GetCalledFunctionType",
        "Obtain the function type called by this instruction.",

        LLVMValueRef("C", ""),

        since = "8.0"
    )

    LLVMValueRef(
        "GetCalledValue",
        """
        Obtain the pointer to the function invoked by this instruction.

        This expects an {@code LLVMValueRef} that corresponds to a {@code llvm::CallInst} or {@code llvm::InvokeInst}.
        """,

        LLVMValueRef("Instr", "")
    )

    LLVMBool(
        "IsTailCall",
        """
        Obtain whether a call instruction is a tail call.

        This only works on {@code llvm::CallInst} instructions.
        """,

        LLVMValueRef("CallInst", "")
    )

    void(
        "SetTailCall",
        """
        Set whether a call instruction is a tail call.

        This only works on {@code llvm::CallInst} instructions.
        """,

        LLVMValueRef("CallInst", ""),
        LLVMBool("IsTailCall", "")
    )

    LLVMBasicBlockRef(
        "GetNormalDest",
        """
        Return the normal destination basic block.

        This only works on {@code llvm::InvokeInst} instructions.
        """,

        LLVMValueRef("InvokeInst", "")
    )

    LLVMBasicBlockRef(
        "GetUnwindDest",
        """
        Return the unwind destination basic block.

        Works on {@code llvm::InvokeInst}, {@code llvm::CleanupReturnInst}, and {@code llvm::CatchSwitchInst} instructions.
        """,

        LLVMValueRef("InvokeInst", "")
    )

    void(
        "SetNormalDest",
        """
        Set the normal destination basic block.

        This only works on {@code llvm::InvokeInst} instructions.
        """,

        LLVMValueRef("InvokeInst", ""),
        LLVMBasicBlockRef("B", "")
    )

    void(
        "SetUnwindDest",
        """
        Set the unwind destination basic block.

        Works on {@code llvm::InvokeInst}, {@code llvm::CleanupReturnInst}, and {@code llvm::CatchSwitchInst} instructions.
        """,

        LLVMValueRef("InvokeInst", ""),
        LLVMBasicBlockRef("B", "")
    )

    unsigned_int(
        "GetNumSuccessors",
        "Return the number of successors that this terminator has.",

        LLVMValueRef("Term", "")
    )

    LLVMBasicBlockRef(
        "GetSuccessor",
        "Return the specified successor.",

        LLVMValueRef("Term", ""),
        unsigned_int("i", "")
    )

    void(
        "SetSuccessor",
        "Update the specified successor to point at the provided block.",

        LLVMValueRef("Term", ""),
        unsigned_int("i", ""),
        LLVMBasicBlockRef("block", "")
    )

    LLVMBool(
        "IsConditional",
        """
        Return if a branch is conditional.

        This only works on {@code llvm::BranchInst} instructions.
        """,

        LLVMValueRef("Branch", "")
    )

    LLVMValueRef(
        "GetCondition",
        """
        Return the condition of a branch instruction.

        This only works on {@code llvm::BranchInst} instructions.
        """,

        LLVMValueRef("Branch", "")
    )

    void(
        "SetCondition",
        """
        Set the condition of a branch instruction.

        This only works on {@code llvm::BranchInst} instructions.
        """,

        LLVMValueRef("Branch", ""),
        LLVMValueRef("Cond", "")
    )

    LLVMBasicBlockRef(
        "GetSwitchDefaultDest",
        """
        Obtain the default destination basic block of a switch instruction.

        This only works on {@code llvm::SwitchInst} instructions.
        """,

        LLVMValueRef("SwitchInstr", "")
    )

    LLVMTypeRef(
        "GetAllocatedType",
        "Obtain the type that is being allocated by the {@code alloca} instruction.",

        LLVMValueRef("Alloca", "")
    )

    LLVMBool(
        "IsInBounds",
        "Check whether the given {@code GEP} instruction is inbounds.",

        LLVMValueRef("GEP", "")
    )

    void(
        "SetIsInBounds",
        "Set the given {@code GEP} instruction to be inbounds or not.",

        LLVMValueRef("GEP", ""),
        LLVMBool("InBounds", "")
    )

    void(
        "AddIncoming",
        "Add an incoming value to the end of a PHI list.",

        LLVMValueRef("PhiNode", ""),
        LLVMValueRef.p("IncomingValues", ""),
        LLVMBasicBlockRef.p("IncomingBlocks", ""),
        AutoSize("IncomingValues", "IncomingBlocks")..unsigned_int("Count", "")
    )

    unsigned_int(
        "CountIncoming",
        "Obtain the number of incoming basic blocks to a PHI node.",

        LLVMValueRef("PhiNode", "")
    )

    LLVMValueRef(
        "GetIncomingValue",
        "Obtain an incoming value to a PHI node as an {@code LLVMValueRef}.",

        LLVMValueRef("PhiNode", ""),
        unsigned_int("Index", "")
    )

    LLVMBasicBlockRef(
        "GetIncomingBlock",
        "Obtain an incoming value to a PHI node as an {@code LLVMBasicBlockRef}.",

        LLVMValueRef("PhiNode", ""),
        unsigned_int("Index", "")
    )

    unsigned_int(
        "GetNumIndices",
        "Obtain the number of indices. NB: This also works on {@code GEP}.",

        LLVMValueRef("Inst", "")
    )

    Nonnull..unsigned_int.const.p(
        "GetIndices",
        "Obtain the indices as an array.",

        LLVMValueRef("Inst", ""),
        AutoSizeResult..Virtual..unsigned_int("Count", "LWJGL: virtual parameter, should pass #GetNumIndices()")
    )

    LLVMBuilderRef(
        "CreateBuilderInContext",
        "",

        LLVMContextRef("C", "")
    )
    LLVMBuilderRef("CreateBuilder", "", void())

    void(
        "PositionBuilder",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMBasicBlockRef("Block", ""),
        LLVMValueRef("Instr", "")
    )

    void(
        "PositionBuilderBefore",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Instr", "")
    )

    void(
        "PositionBuilderAtEnd",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMBasicBlockRef("Block", "")
    )

    LLVMBasicBlockRef(
        "GetInsertBlock",
        "",

        LLVMBuilderRef("Builder", "")
    )

    void(
        "ClearInsertionPosition",
        "",

        LLVMBuilderRef("Builder", "")
    )

    void(
        "InsertIntoBuilder",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Instr", "")
    )

    void(
        "InsertIntoBuilderWithName",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Instr", ""),
        charUTF8.const.p("Name", "")
    )

    void(
        "DisposeBuilder",
        "",

        LLVMBuilderRef("Builder", "")
    )

    IgnoreMissing..LLVMMetadataRef(
        "GetCurrentDebugLocation2",
        """
        Get location information used by debugging information.

        See {@code llvm::IRBuilder::getCurrentDebugLocation()}.
        """,

        LLVMBuilderRef("Builder", ""),

        since = "9"
    )

    IgnoreMissing..void(
        "SetCurrentDebugLocation2",
        """
        Set location information used by debugging information.

        To clear the location metadata of the given instruction, pass #NULL to {@code Loc}.

        See {@code llvm::IRBuilder::SetCurrentDebugLocation()}.
        """,

        LLVMBuilderRef("Builder", ""),
        nullable..LLVMMetadataRef("Loc", ""),

        since = "9"
    )

    IgnoreMissing..void(
        "SetInstDebugLocation",
        """
        Attempts to set the debug location for the given instruction using the current debug location for the given builder. If the builder has no current
        debug location, this function is a no-op.

        See {@code llvm::IRBuilder::SetInstDebugLocation()}.
        """,

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Inst", ""),

        since = "9"
    )

    IgnoreMissing..LLVMMetadataRef(
        "BuilderGetDefaultFPMathTag",
        """
        Get the default floating-point math metadata for a given builder.

        See {@code llvm::IRBuilder::getDefaultFPMathTag()}
        """,

        LLVMBuilderRef("Builder", ""),

        since = "9"
    )

    IgnoreMissing..void(
        "BuilderSetDefaultFPMathTag",
        """
        Set the default floating-point math metadata for the given builder.

        To clear the metadata, pass #NULL to {@code FPMathTag}.

        See {@code llvm::IRBuilder::setDefaultFPMathTag()}.
        """,

        LLVMBuilderRef("Builder", ""),
        nullable..LLVMMetadataRef("FPMathTag", ""),

        since = "9"
    )

    void(
        "SetCurrentDebugLocation",
        "Deprecated: Passing the #NULL location will crash. Use #SetCurrentDebugLocation2() instead.",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("L", "")
    )

    LLVMValueRef(
        "GetCurrentDebugLocation",
        "Deprecated: Returning the #NULL location will crash. Use #GetCurrentDebugLocation2() instead.",

        LLVMBuilderRef("Builder", "")
    )

    LLVMValueRef(
        "BuildRetVoid",
        "Terminators",

        LLVMBuilderRef("Builder", "")
    )

    LLVMValueRef(
        "BuildRet",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("V", "")
    )

    LLVMValueRef(
        "BuildAggregateRet",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef.p("RetVals", ""),
        AutoSize("RetVals")..unsigned_int("N", "")
    )

    LLVMValueRef(
        "BuildBr",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMBasicBlockRef("Dest", "")
    )

    LLVMValueRef(
        "BuildCondBr",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("If", ""),
        LLVMBasicBlockRef("Then", ""),
        LLVMBasicBlockRef("Else", "")
    )

    LLVMValueRef(
        "BuildSwitch",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("V", ""),
        LLVMBasicBlockRef("Else", ""),
        unsigned_int("NumCases", "")
    )

    LLVMValueRef(
        "BuildIndirectBr",
        "",

        LLVMBuilderRef("B", ""),
        LLVMValueRef("Addr", ""),
        unsigned_int("NumDests", "")
    )

    LLVMValueRef(
        "BuildInvoke",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Fn", ""),
        LLVMValueRef.p("Args", ""),
        AutoSize("Args")..unsigned_int("NumArgs", ""),
        LLVMBasicBlockRef("Then", ""),
        LLVMBasicBlockRef("Catch", ""),
        charUTF8.const.p("Name", "")
    )

    IgnoreMissing..LLVMValueRef(
        "BuildInvoke2",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMTypeRef("Ty", ""),
        LLVMValueRef("Fn", ""),
        LLVMValueRef.p("Args", ""),
        AutoSize("Args")..unsigned_int("NumArgs", ""),
        LLVMBasicBlockRef("Then", ""),
        LLVMBasicBlockRef("Catch", ""),
        charUTF8.const.p("Name", ""),

        since = "8.0"
    )

    LLVMValueRef(
        "BuildUnreachable",
        "",

        LLVMBuilderRef("Builder", "")
    )

    LLVMValueRef(
        "BuildResume",
        "Exception Handling",

        LLVMBuilderRef("B", ""),
        LLVMValueRef("Exn", "")
    )

    LLVMValueRef(
        "BuildLandingPad",
        "",

        LLVMBuilderRef("B", ""),
        LLVMTypeRef("Ty", ""),
        LLVMValueRef("PersFn", ""),
        unsigned_int("NumClauses", ""),
        charUTF8.const.p("Name", "")
    )

    IgnoreMissing..LLVMValueRef(
        "BuildCleanupRet",
        "",

        LLVMBuilderRef("B", ""),
        LLVMValueRef("CatchPad", ""),
        LLVMBasicBlockRef("BB", "")
    )

    IgnoreMissing..LLVMValueRef(
        "BuildCatchRet",
        "",

        LLVMBuilderRef("B", ""),
        LLVMValueRef("CatchPad", ""),
        LLVMBasicBlockRef("BB", "")
    )

    IgnoreMissing..LLVMValueRef(
        "BuildCatchPad",
        "",

        LLVMBuilderRef("B", ""),
        LLVMValueRef("ParentPad", ""),
        LLVMValueRef.p("Args", ""),
        AutoSize("Args")..unsigned_int("NumArgs", ""),
        charUTF8.const.p("Name", "")
    )

    IgnoreMissing..LLVMValueRef(
        "BuildCleanupPad",
        "",

        LLVMBuilderRef("B", ""),
        LLVMValueRef("ParentPad", ""),
        LLVMValueRef.p("Args", ""),
        AutoSize("Args")..unsigned_int("NumArgs", ""),
        charUTF8.const.p("Name", "")
    )

    IgnoreMissing..LLVMValueRef(
        "BuildCatchSwitch",
        "",

        LLVMBuilderRef("B", ""),
        LLVMValueRef("ParentPad", ""),
        LLVMBasicBlockRef("UnwindBB", ""),
        unsigned_int("NumHandlers", ""),
        charUTF8.const.p("Name", "")
    )

    void(
        "AddCase",
        "Add a case to the {@code switch} instruction",

        LLVMValueRef("Switch", ""),
        LLVMValueRef("OnVal", ""),
        LLVMBasicBlockRef("Dest", "")
    )

    void(
        "AddDestination",
        "Add a destination to the {@code indirectbr} instruction",

        LLVMValueRef("IndirectBr", ""),
        LLVMBasicBlockRef("Dest", "")
    )

    unsigned_int(
        "GetNumClauses",
        "Get the number of clauses on the {@code landingpad} instruction",

        LLVMValueRef("LandingPad", "")
    )

    LLVMValueRef(
        "GetClause",
        "Get the value of the clause at index {@code Idx} on the {@code landingpad} instruction",

        LLVMValueRef("LandingPad", ""),
        unsigned_int("Idx", "")
    )

    void(
        "AddClause",
        "Add a {@code catch} or {@code filter} clause to the {@code landingpad} instruction",

        LLVMValueRef("LandingPad", ""),
        LLVMValueRef("ClauseVal", "")
    )

    LLVMBool(
        "IsCleanup",
        "Get the 'cleanup' flag in the {@code landingpad} instruction",

        LLVMValueRef("LandingPad", "")
    )

    void(
        "SetCleanup",
        "Set the 'cleanup' flag in the {@code landingpad} instruction",

        LLVMValueRef("LandingPad", ""),
        LLVMBool("Val", "")
    )

    IgnoreMissing..void(
        "AddHandler",
        "Add a destination to the {@code catchswitch} instruction",

        LLVMValueRef("CatchSwitch", ""),
        LLVMBasicBlockRef("Dest", "")
    )

    IgnoreMissing..unsigned_int(
        "GetNumHandlers",
        "Get the number of handlers on the {@code catchswitch} instruction",

        LLVMValueRef("CatchSwitch", "")
    )

    IgnoreMissing..void(
        "GetHandlers",
        """
        Obtain the basic blocks acting as handlers for a {@code catchswitch} instruction.

        The {@code Handlers} parameter should point to a pre-allocated array of {@code LLVMBasicBlockRefs} at least #GetNumHandlers() large. On return, the
        first {@code LLVMGetNumHandlers()} entries in the array will be populated with {@code LLVMBasicBlockRef} instances.
        """,

        LLVMValueRef("CatchSwitch", "the {@code catchswitch} instruction to operate on"),
        Check(
            "LLVMGetNumHandlers(CatchSwitch)", debug = true
        )..LLVMBasicBlockRef.p("Handlers", "memory address of an array to be filled with basic blocks")
    )

    IgnoreMissing..LLVMValueRef(
        "GetArgOperand",
        "Get the number of {@code funcletpad} arguments.",

        LLVMValueRef("Funclet", ""),
        unsigned_int("i", "")
    )

    IgnoreMissing..void(
        "SetArgOperand",
        "Set a {@code funcletpad} argument at the given index.",

        LLVMValueRef("Funclet", ""),
        unsigned_int("i", ""),
        LLVMValueRef("value", "")
    )

    IgnoreMissing..LLVMValueRef(
        "GetParentCatchSwitch",
        """
        Get the parent {@code catchswitch} instruction of a {@code catchpad} instruction.

        This only works on {@code llvm::CatchPadInst} instructions.
        """,

        LLVMValueRef("CatchPad", "")
    )

    IgnoreMissing..void(
        "SetParentCatchSwitch",
        """
        Set the parent {@code catchswitch} instruction of a {@code catchpad} instruction.

        This only works on {@code llvm::CatchPadInst} instructions.
        """,

        LLVMValueRef("CatchPad", ""),
        LLVMValueRef("CatchSwitch", "")
    )

    LLVMValueRef(
        "BuildAdd",
        "Arithmetic",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildNSWAdd",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildNUWAdd",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildFAdd",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildSub",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildNSWSub",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildNUWSub",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildFSub",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildMul",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildNSWMul",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildNUWMul",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildFMul",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildUDiv",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildExactUDiv",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildSDiv",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildExactSDiv",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildFDiv",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildURem",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildSRem",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildFRem",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildShl",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildLShr",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildAShr",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildAnd",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildOr",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildXor",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildBinOp",
        "",

        LLVMBuilderRef("B", ""),
        LLVMOpcode("Op", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildNeg",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("V", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildNSWNeg",
        "",

        LLVMBuilderRef("B", ""),
        LLVMValueRef("V", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildNUWNeg",
        "",

        LLVMBuilderRef("B", ""),
        LLVMValueRef("V", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildFNeg",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("V", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildNot",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("V", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildMalloc",
        "Memory",

        LLVMBuilderRef("Builder", ""),
        LLVMTypeRef("Ty", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildArrayMalloc",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMTypeRef("Ty", ""),
        LLVMValueRef("Val", ""),
        charUTF8.const.p("Name", "")
    )

    IgnoreMissing..LLVMValueRef(
        "BuildMemSet",
        "Creates and inserts a memset to the specified pointer and the specified value.",

        LLVMBuilderRef("B", ""),
        LLVMValueRef("Ptr", ""),
        LLVMValueRef("Val", ""),
        LLVMValueRef("Len", ""),
        unsigned("Align", ""),

        since = "8.0"
    )

    IgnoreMissing..LLVMValueRef(
        "BuildMemCpy",
        "Creates and inserts a memcpy between the specified pointers.",

        LLVMBuilderRef("B", ""),
        LLVMValueRef("Dst", ""),
        unsigned("DstAlign", ""),
        LLVMValueRef("Src", ""),
        unsigned("SrcAlign", ""),
        LLVMValueRef("Size", ""),

        since = "8.0"
    )

    IgnoreMissing..LLVMValueRef(
        "BuildMemMove",
        "Creates and inserts a memmove between the specified pointers.",

        LLVMBuilderRef("B", ""),
        LLVMValueRef("Dst", ""),
        unsigned("DstAlign", ""),
        LLVMValueRef("Src", ""),
        unsigned("SrcAlign", ""),
        LLVMValueRef("Size", ""),

        since = "8.0"
    )

    LLVMValueRef(
        "BuildAlloca",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMTypeRef("Ty", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildArrayAlloca",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMTypeRef("Ty", ""),
        LLVMValueRef("Val", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildFree",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("PointerVal", "")
    )

    LLVMValueRef(
        "BuildLoad",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("PointerVal", ""),
        charUTF8.const.p("Name", "")
    )

    IgnoreMissing..LLVMValueRef(
        "BuildLoad2",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMTypeRef("Ty", ""),
        LLVMValueRef("PointerVal", ""),
        charUTF8.const.p("Name", ""),

        since = "8.0"
    )

    LLVMValueRef(
        "BuildStore",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMValueRef("Ptr", "")
    )

    LLVMValueRef(
        "BuildGEP",
        "",

        LLVMBuilderRef("B", ""),
        LLVMValueRef("Pointer", ""),
        LLVMValueRef.p("Indices", ""),
        AutoSize("Indices")..unsigned_int("NumIndices", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildInBoundsGEP",
        "",

        LLVMBuilderRef("B", ""),
        LLVMValueRef("Pointer", ""),
        LLVMValueRef.p("Indices", ""),
        AutoSize("Indices")..unsigned_int("NumIndices", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildStructGEP",
        "",

        LLVMBuilderRef("B", ""),
        LLVMValueRef("Pointer", ""),
        unsigned_int("Idx", ""),
        charUTF8.const.p("Name", "")
    )

    IgnoreMissing..LLVMValueRef(
        "BuildGEP2",
        "",

        LLVMBuilderRef("B", ""),
        LLVMTypeRef("Ty", ""),
        LLVMValueRef("Pointer", ""),
        LLVMValueRef.p("Indices", ""),
        AutoSize("Indices")..unsigned_int("NumIndices", ""),
        charUTF8.const.p("Name", ""),

        since = "8.0"
    )

    IgnoreMissing..LLVMValueRef(
        "BuildInBoundsGEP2",
        "",

        LLVMBuilderRef("B", ""),
        LLVMTypeRef("Ty", ""),
        LLVMValueRef("Pointer", ""),
        LLVMValueRef.p("Indices", ""),
        AutoSize("Indices")..unsigned_int("NumIndices", ""),
        charUTF8.const.p("Name", ""),

        since = "8.0"
    )

    IgnoreMissing..LLVMValueRef(
        "BuildStructGEP2",
        "",

        LLVMBuilderRef("B", ""),
        LLVMTypeRef("Ty", ""),
        LLVMValueRef("Pointer", ""),
        unsigned_int("Idx", ""),
        charUTF8.const.p("Name", ""),

        since = "8.0"
    )

    LLVMValueRef(
        "BuildGlobalString",
        "",

        LLVMBuilderRef("B", ""),
        charUTF8.const.p("Str", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildGlobalStringPtr",
        "",

        LLVMBuilderRef("B", ""),
        charUTF8.const.p("Str", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMBool(
        "GetVolatile",
        "",

        LLVMValueRef("MemoryAccessInst", "")
    )

    void(
        "SetVolatile",
        "",

        LLVMValueRef("MemoryAccessInst", ""),
        LLVMBool("IsVolatile", "")
    )

    IgnoreMissing..LLVMBool(
        "GetWeak",
        "",

        LLVMValueRef("CmpXchgInst", ""),

        since = "10"
    )

    IgnoreMissing..void(
        "SetWeak",
        "",

        LLVMValueRef("CmpXchgInst", ""),
        LLVMBool("IsWeak", ""),

        since = "10"
    )

    LLVMAtomicOrdering(
        "GetOrdering",
        "",

        LLVMValueRef("MemoryAccessInst", "")
    )

    IgnoreMissing..void(
        "SetOrdering",
        "",

        LLVMValueRef("MemoryAccessInst", ""),
        LLVMAtomicOrdering("Ordering", "")
    )

    IgnoreMissing..LLVMAtomicRMWBinOp(
        "GetAtomicRMWBinOp",
        "",

        LLVMValueRef("AtomicRMWInst", ""),

        since = "10"
    )

    IgnoreMissing..void(
        "SetAtomicRMWBinOp",
        "",

        LLVMValueRef("AtomicRMWInst", ""),
        LLVMAtomicRMWBinOp("BinOp", ""),

        since = "10"
    )

    LLVMValueRef(
        "BuildTrunc",
        "Casts",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildZExt",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildSExt",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildFPToUI",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildFPToSI",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildUIToFP",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildSIToFP",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildFPTrunc",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildFPExt",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildPtrToInt",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildIntToPtr",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildBitCast",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildAddrSpaceCast",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildZExtOrBitCast",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildSExtOrBitCast",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildTruncOrBitCast",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildCast",
        "",

        LLVMBuilderRef("B", ""),
        LLVMOpcode("Op", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildPointerCast",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        charUTF8.const.p("Name", "")
    )

    IgnoreMissing..LLVMValueRef(
        "BuildPointerCast2",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        LLVMBool("IsSigned", ""),
        charUTF8.const.p("Name", ""),

        since = "8.0"
    )

    LLVMValueRef(
        "BuildIntCast",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildFPCast",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        LLVMTypeRef("DestTy", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildICmp",
        "Comparisons",

        LLVMBuilderRef("Builder", ""),
        LLVMIntPredicate("Op", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildFCmp",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMRealPredicate("Op", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildPhi",
        "Miscellaneous instructions",

        LLVMBuilderRef("Builder", ""),
        LLVMTypeRef("Ty", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildCall",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Fn", ""),
        LLVMValueRef.p("Args", ""),
        AutoSize("Args")..unsigned_int("NumArgs", ""),
        charUTF8.const.p("Name", "")
    )

    IgnoreMissing..LLVMValueRef(
        "BuildCall2",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMTypeRef("Ty", ""),
        LLVMValueRef("Fn", ""),
        LLVMValueRef.p("Args", ""),
        AutoSize("Args")..unsigned_int("NumArgs", ""),
        charUTF8.const.p("Name", ""),

        since = "8.0"
    )

    LLVMValueRef(
        "BuildSelect",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("If", ""),
        LLVMValueRef("Then", ""),
        LLVMValueRef("Else", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildVAArg",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("List", ""),
        LLVMTypeRef("Ty", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildExtractElement",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("VecVal", ""),
        LLVMValueRef("Index", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildInsertElement",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("VecVal", ""),
        LLVMValueRef("EltVal", ""),
        LLVMValueRef("Index", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildShuffleVector",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("V1", ""),
        LLVMValueRef("V2", ""),
        LLVMValueRef("Mask", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildExtractValue",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("AggVal", ""),
        unsigned_int("Index", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildInsertValue",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("AggVal", ""),
        LLVMValueRef("EltVal", ""),
        unsigned_int("Index", ""),
        charUTF8.const.p("Name", "")
    )

    IgnoreMissing..LLVMValueRef(
        "BuildFreeze",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        charUTF8.const.p("Name", ""),

        since = "10"
    )

    LLVMValueRef(
        "BuildIsNull",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildIsNotNull",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("Val", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildPtrDiff",
        "",

        LLVMBuilderRef("Builder", ""),
        LLVMValueRef("LHS", ""),
        LLVMValueRef("RHS", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildFence",
        "",

        LLVMBuilderRef("B", ""),
        LLVMAtomicOrdering("ordering", ""),
        LLVMBool("singleThread", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMValueRef(
        "BuildAtomicRMW",
        "",

        LLVMBuilderRef("B", ""),
        LLVMAtomicRMWBinOp("op", ""),
        LLVMValueRef("PTR", ""),
        LLVMValueRef("Val", ""),
        LLVMAtomicOrdering("ordering", ""),
        LLVMBool("singleThread", "")
    )

    LLVMValueRef(
        "BuildAtomicCmpXchg",
        "",

        LLVMBuilderRef("B", ""),
        LLVMValueRef("Ptr", ""),
        LLVMValueRef("Cmp", ""),
        LLVMValueRef("New", ""),
        LLVMAtomicOrdering("SuccessOrdering", ""),
        LLVMAtomicOrdering("FailureOrdering", ""),
        LLVMBool("SingleThread", "")
    )

    IgnoreMissing..unsigned(
        "GetNumMaskElements",
        "Get the number of elements in the mask of a {@code ShuffleVector} instruction.",

        LLVMValueRef("ShuffleVectorInst", ""),

        since = "11"
    )

    IgnoreMissing..int(
        "GetUndefMaskElem",
        "Returns a constant that specifies that the result of a {@code ShuffleVectorInst} is undefined.",

        void(),

        since = "11"
    )

    IgnoreMissing..int(
        "GetMaskValue",
        "Get the mask value at position {@code Elt} in the mask of a {@code ShuffleVector} instruction.",

        LLVMValueRef("ShuffleVectorInst", ""),
        unsigned("Elt", ""),

        returnDoc = "the result of #GetUndefMaskElem() if the mask value is {@code undef} at that position.",
        since = "11"
    )

    LLVMBool(
        "IsAtomicSingleThread",
        "",

        LLVMValueRef("AtomicInst", "")
    )

    void(
        "SetAtomicSingleThread",
        "",

        LLVMValueRef("AtomicInst", ""),
        LLVMBool("SingleThread", "")
    )

    LLVMAtomicOrdering(
        "GetCmpXchgSuccessOrdering",
        "",

        LLVMValueRef("CmpXchgInst", "")
    )

    void(
        "SetCmpXchgSuccessOrdering",
        "",

        LLVMValueRef("CmpXchgInst", ""),
        LLVMAtomicOrdering("Ordering", "")
    )

    LLVMAtomicOrdering(
        "GetCmpXchgFailureOrdering",
        "",

        LLVMValueRef("CmpXchgInst", "")
    )

    void(
        "SetCmpXchgFailureOrdering",
        "",

        LLVMValueRef("CmpXchgInst", ""),
        LLVMAtomicOrdering("Ordering", "")
    )

    LLVMModuleProviderRef(
        "CreateModuleProviderForExistingModule",
        """
        Changes the type of {@code M} so it can be passed to {@code FunctionPassManagers} and the JIT.  They take {@code ModuleProviders} for historical
        reasons.
        """,

        LLVMModuleRef("M", "")
    )

    void(
        "DisposeModuleProvider",
        "Destroys the module {@code M}.",

        LLVMModuleProviderRef("M", "")
    )

    LLVMBool(
        "CreateMemoryBufferWithContentsOfFile",
        "",

        charUTF8.const.p("Path", ""),
        Check(1)..LLVMMemoryBufferRef.p("OutMemBuf", ""),
        Check(1)..charUTF8.p.p("OutMessage", "")
    )

    LLVMBool(
        "CreateMemoryBufferWithSTDIN",
        "",

        Check(1)..LLVMMemoryBufferRef.p("OutMemBuf", ""),
        Check(1)..charUTF8.p.p("OutMessage", "")
    )

    LLVMMemoryBufferRef(
        "CreateMemoryBufferWithMemoryRange",
        "",

        char.const.p("InputData", ""),
        AutoSize("InputData")..size_t("InputDataLength", ""),
        charUTF8.const.p("BufferName", ""),
        LLVMBool("RequiresNullTerminator", "")
    )

    LLVMMemoryBufferRef(
        "CreateMemoryBufferWithMemoryRangeCopy",
        "",

        char.const.p("InputData", ""),
        AutoSize("InputData")..size_t("InputDataLength", ""),
        charUTF8.const.p("BufferName", "")
    )

    charUTF8.const.p(
        "GetBufferStart",
        "",

        LLVMMemoryBufferRef("MemBuf", "")
    )

    size_t(
        "GetBufferSize",
        "",

        LLVMMemoryBufferRef("MemBuf", "")
    )

    void(
        "DisposeMemoryBuffer",
        "",

        LLVMMemoryBufferRef("MemBuf", "")
    )

    LLVMPassRegistryRef(
        "GetGlobalPassRegistry",
        "Return the global pass registry, for use with initialization functions.",

        void()
    )

    LLVMPassManagerRef(
        "CreatePassManager",
        "Constructs a new whole-module pass pipeline. This type of pipeline is suitable for link-time optimization and whole-module transformations.",

        void()
    )

    LLVMPassManagerRef(
        "CreateFunctionPassManagerForModule",
        """
        Constructs a new function-by-function pass pipeline over the module provider. It does not take ownership of the module provider. This type of pipeline
        is suitable for code generation and JIT compilation tasks.
        """,

        LLVMModuleRef("M", "")
    )

    LLVMPassManagerRef(
        "CreateFunctionPassManager",
        "Deprecated: Use #CreateFunctionPassManagerForModule() instead.",

        LLVMModuleProviderRef("MP", "")
    )

    LLVMBool(
        "RunPassManager",
        """
        Initializes, executes on the provided module, and finalizes all of the passes scheduled in the pass manager. Returns 1 if any of the passes modified
        the module, 0 otherwise.
        """,

        LLVMPassManagerRef("PM", ""),
        LLVMModuleRef("M", "")
    )

    LLVMBool(
        "InitializeFunctionPassManager",
        "Initializes all of the function passes scheduled in the function pass manager. Returns 1 if any of the passes modified the module, 0 otherwise.",

        LLVMPassManagerRef("FPM", "")
    )

    LLVMBool(
        "RunFunctionPassManager",
        """
        Executes all of the function passes scheduled in the function pass manager on the provided function. Returns 1 if any of the passes modified the
        function, false otherwise.
        """,

        LLVMPassManagerRef("FPM", ""),
        LLVMValueRef("F", "")
    )

    LLVMBool(
        "FinalizeFunctionPassManager",
        "Finalizes all of the function passes scheduled in the function pass manager. Returns 1 if any of the passes modified the module, 0 otherwise.",

        LLVMPassManagerRef("FPM", "")
    )

    void(
        "DisposePassManager",
        "Frees the memory of a pass pipeline. For function pipelines, does not free the module provider.",

        LLVMPassManagerRef("PM", "")
    )

    LLVMBool(
        "StartMultithreaded",
        """
        Deprecated: Multi-threading can only be enabled/disabled with the compile time define {@code LLVM_ENABLE_THREADS}. This function always returns
        #IsMultithreaded().
        """,

        void()
    )

    void(
        "StopMultithreaded",
        "Deprecated: Multi-threading can only be enabled/disabled with the compile time define {@code LLVM_ENABLE_THREADS}.",

        void()
    )

    LLVMBool("IsMultithreaded", "Check whether LLVM is executing in thread-safe mode or not.", void())
}