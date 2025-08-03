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
        "Ret".enum("1"),
        "Br".enum,
        "Switch".enum,
        "IndirectBr".enum,
        "Invoke".enum,
        "Unreachable".enum("7"),
        "CallBr".enum("67"),
        "FNeg".enum("66"),
        "Add".enum("8"),
        "FAdd".enum,
        "Sub".enum,
        "FSub".enum,
        "Mul".enum,
        "FMul".enum,
        "UDiv".enum,
        "SDiv".enum,
        "FDiv".enum,
        "URem".enum,
        "SRem".enum,
        "FRem".enum,
        "Shl".enum,
        "LShr".enum,
        "AShr".enum,
        "And".enum,
        "Or".enum,
        "Xor".enum,
        "Alloca".enum,
        "Load".enum,
        "Store".enum,
        "GetElementPtr".enum,
        "Trunc".enum,
        "ZExt".enum,
        "SExt".enum,
        "FPToUI".enum,
        "FPToSI".enum,
        "UIToFP".enum,
        "SIToFP".enum,
        "FPTrunc".enum,
        "FPExt".enum,
        "PtrToInt".enum,
        "IntToPtr".enum,
        "BitCast".enum,
        "AddrSpaceCast".enum("60"),
        "ICmp".enum("42"),
        "FCmp".enum,
        "PHI".enum,
        "Call".enum,
        "Select".enum,
        "UserOp1".enum,
        "UserOp2".enum,
        "VAArg".enum,
        "ExtractElement".enum,
        "InsertElement".enum,
        "ShuffleVector".enum,
        "ExtractValue".enum,
        "InsertValue".enum,
        "Freeze".enum("68"),
        "Fence".enum("55"),
        "AtomicCmpXchg".enum,
        "AtomicRMW".enum,
        "Resume".enum,
        "LandingPad".enum,
        "CleanupRet".enum("61"),
        "CatchRet".enum,
        "CatchPad".enum,
        "CleanupPad".enum,
        "CatchSwitch".enum
    )

    EnumConstant(
        "VoidTypeKind".enum("0"),
        "HalfTypeKind".enum,
        "FloatTypeKind".enum,
        "DoubleTypeKind".enum,
        "X86_FP80TypeKind".enum,
        "FP128TypeKind".enum,
        "PPC_FP128TypeKind".enum,
        "LabelTypeKind".enum,
        "IntegerTypeKind".enum,
        "FunctionTypeKind".enum,
        "StructTypeKind".enum,
        "ArrayTypeKind".enum,
        "PointerTypeKind".enum,
        "VectorTypeKind".enum,
        "MetadataTypeKind".enum,
        //"X86_MMXTypeKind".enum,
        "TokenTypeKind".enum("16"),
        "ScalableVectorTypeKind".enum,
        "BFloatTypeKind".enum,
        "X86_AMXTypeKind".enum,
        "TargetExtTypeKind".enum
    )

    EnumConstant(
        "ExternalLinkage".enum("0"),
        "AvailableExternallyLinkage".enum,
        "LinkOnceAnyLinkage".enum,
        "LinkOnceODRLinkage".enum,
        "LinkOnceODRAutoHideLinkage".enum,
        "WeakAnyLinkage".enum,
        "WeakODRLinkage".enum,
        "AppendingLinkage".enum,
        "InternalLinkage".enum,
        "PrivateLinkage".enum,
        "DLLImportLinkage".enum,
        "DLLExportLinkage".enum,
        "ExternalWeakLinkage".enum,
        "GhostLinkage".enum,
        "CommonLinkage".enum,
        "LinkerPrivateLinkage".enum,
        "LinkerPrivateWeakLinkage".enum
    )

    EnumConstant(
        "DefaultVisibility".enum("0"),
        "HiddenVisibility".enum,
        "ProtectedVisibility".enum
    )

    EnumConstant(
        "NoUnnamedAddr".enum("0"),
        "LocalUnnamedAddr".enum,
        "GlobalUnnamedAddr".enum
    )

    EnumConstant(
        "DefaultStorageClass".enum("0"),
        "DLLImportStorageClass".enum,
        "DLLExportStorageClass".enum
    )

    EnumConstant(
        "CCallConv".enum("0"),
        "FastCallConv".enum("8"),
        "ColdCallConv".enum,
        "GHCCallConv".enum,
        "HiPECallConv".enum,
        "AnyRegCallConv".enum("13"),
        "PreserveMostCallConv".enum,
        "PreserveAllCallConv".enum,
        "SwiftCallConv".enum,
        "CXXFASTTLSCallConv".enum,
        "X86StdcallCallConv".enum("64"),
        "X86FastcallCallConv".enum,
        "ARMAPCSCallConv".enum,
        "ARMAAPCSCallConv".enum,
        "ARMAAPCSVFPCallConv".enum,
        "MSP430INTRCallConv".enum,
        "X86ThisCallCallConv".enum,
        "PTXKernelCallConv".enum,
        "PTXDeviceCallConv".enum,
        "SPIRFUNCCallConv".enum("75"),
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
        "ArgumentValueKind".enum("0"),
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
        "PoisonValueValueKind".enum,
        "ConstantTargetNoneValueKind".enum,
        "ConstantPtrAuthValueKind".enum
    )

    EnumConstant(
        "IntEQ".enum("32"),
        "IntNE".enum,
        "IntUGT".enum,
        "IntUGE".enum,
        "IntULT".enum,
        "IntULE".enum,
        "IntSGT".enum,
        "IntSGE".enum,
        "IntSLT".enum,
        "IntSLE".enum
    )

    EnumConstant(
        "RealPredicateFalse".enum("0"),
        "RealOEQ".enum,
        "RealOGT".enum,
        "RealOGE".enum,
        "RealOLT".enum,
        "RealOLE".enum,
        "RealONE".enum,
        "RealORD".enum,
        "RealUNO".enum,
        "RealUEQ".enum,
        "RealUGT".enum,
        "RealUGE".enum,
        "RealULT".enum,
        "RealULE".enum,
        "RealUNE".enum,
        "RealPredicateTrue".enum
    )

    EnumConstant(
        "LandingPadCatch".enum("0"),
        "LandingPadFilter".enum
    )

    EnumConstant(
        "NotThreadLocal".enum("0"),
        "GeneralDynamicTLSModel".enum,
        "LocalDynamicTLSModel".enum,
        "InitialExecTLSModel".enum,
        "LocalExecTLSModel".enum
    )

    EnumConstant(
        "AtomicOrderingNotAtomic".enum("0"),
        "AtomicOrderingUnordered".enum,
        "AtomicOrderingMonotonic".enum,
        "AtomicOrderingAcquire".enum("4"),
        "AtomicOrderingRelease".enum,
        "AtomicOrderingAcquireRelease".enum,
        "AtomicOrderingSequentiallyConsistent".enum
    )

    EnumConstant(
        "AtomicRMWBinOpXchg".enum("0"),
        "AtomicRMWBinOpAdd".enum,
        "AtomicRMWBinOpSub".enum,
        "AtomicRMWBinOpAnd".enum,
        "AtomicRMWBinOpNand".enum,
        "AtomicRMWBinOpOr".enum,
        "AtomicRMWBinOpXor".enum,
        "AtomicRMWBinOpMax".enum,
        "AtomicRMWBinOpMin".enum,
        "AtomicRMWBinOpUMax".enum,
        "AtomicRMWBinOpUMin".enum,
        "AtomicRMWBinOpFAdd".enum,
        "AtomicRMWBinOpFSub".enum,
        "AtomicRMWBinOpFMax".enum,
        "AtomicRMWBinOpFMin".enum,
        "AtomicRMWBinOpUIncWrap".enum,
        "AtomicRMWBinOpUDecWrap".enum,
        "AtomicRMWBinOpUSubCond".enum,
        "AtomicRMWBinOpUSubSat".enum
    )

    EnumConstant(
        "DSError".enum("0"),
        "DSWarning".enum,
        "DSRemark".enum,
        "DSNote".enum
    )

    EnumConstant(
        "InlineAsmDialectATT".enum("0"),
        "InlineAsmDialectIntel".enum
    )

    EnumConstant(
        "ModuleFlagBehaviorError".enum("0"),
        "ModuleFlagBehaviorWarning".enum,
        "ModuleFlagBehaviorRequire".enum,
        "ModuleFlagBehaviorOverride".enum,
        "ModuleFlagBehaviorAppend".enum,
        "ModuleFlagBehaviorAppendUnique".enum
    )

    EnumConstant(
        "AttributeReturnIndex".enum("0"),
        "AttributeFunctionIndex".enum("-1")
    )

    EnumConstant(
        "TailCallKindNone".enum("0"),
        "TailCallKindTail".enum,
        "TailCallKindMustTail".enum,
        "TailCallKindNoTail".enum
    )

    EnumConstant(
        "FastMathAllowReassoc".enum("1 << 0"),
        "FastMathNoNaNs".enum("1 << 1"),
        "FastMathNoInfs".enum("1 << 2"),
        "FastMathNoSignedZeros".enum("1 << 3"),
        "FastMathAllowReciprocal".enum("1 << 4"),
        "FastMathAllowContract".enum("1 << 5"),
        "FastMathApproxFunc".enum("1 << 6"),
        "FastMathNone".enum("0"),
        "FastMathAll".enum("""
            LLVMFastMathAllowReassoc | LLVMFastMathNoNaNs |
            LLVMFastMathNoInfs | LLVMFastMathNoSignedZeros |
            LLVMFastMathAllowReciprocal | LLVMFastMathAllowContract |
            LLVMFastMathApproxFunc""")
    )

    EnumConstant(
        "GEPFlagInBounds".enum("1 << 0"),
        "GEPFlagNUSW".enum("1 << 1"),
        "GEPFlagNUW".enum("1 << 2"),
    )

    split {
        IgnoreMissing..void(
            "InitializeCore",

            LLVMPassRegistryRef("R")
        )

        void(
            "Shutdown",

            void()
        )

        /*===-- Version query -----------------------------------------------------===*/

        IgnoreMissing..void(
            "GetVersion",

            Check(1)..nullable..unsigned.p("Major"),
            Check(1)..nullable..unsigned.p("Minor"),
            Check(1)..nullable..unsigned.p("Patch")
        )

        Nonnull..charUTF8.p(
            "CreateMessage",

            charUTF8.const.p("Message")
        )

        void(
            "DisposeMessage",

            charUTF8.p("Message")
        )

        LLVMContextRef(
            "ContextCreate",

            void()
        )

        LLVMContextRef(
            "GetGlobalContext",

            void()
        )

        void(
            "ContextSetDiagnosticHandler",

            LLVMContextRef("C"),
            nullable..LLVMDiagnosticHandler("Handler"),
            nullable..opaque_p("DiagnosticContext")
        )

        LLVMDiagnosticHandler(
            "ContextGetDiagnosticHandler",

            LLVMContextRef("C")
        )

        opaque_p(
            "ContextGetDiagnosticContext",

            LLVMContextRef("C")
        )

        void(
            "ContextSetYieldCallback",

            LLVMContextRef("C"),
            nullable..LLVMYieldCallback("Callback"),
            nullable..opaque_p("OpaqueHandle")
        )

        IgnoreMissing..LLVMBool(
            "ContextShouldDiscardValueNames",

            LLVMContextRef("C")
        )

        IgnoreMissing..void(
            "ContextSetDiscardValueNames",

            LLVMContextRef("C"),
            LLVMBool("Discard")
        )

        IgnoreMissing..void(
            "ContextSetOpaquePointers",

            LLVMContextRef("C"),
            LLVMBool("OpaquePointers")
        )

        void(
            "ContextDispose",

            LLVMContextRef("C")
        )

        Nonnull..charUTF8.p(
            "GetDiagInfoDescription",

            LLVMDiagnosticInfoRef("DI")
        )

        LLVMDiagnosticSeverity(
            "GetDiagInfoSeverity",

            LLVMDiagnosticInfoRef("DI")
        )

        unsigned_int(
            "GetMDKindIDInContext",

            LLVMContextRef("C"),
            charUTF8.const.p("Name"),
            AutoSize("Name")..unsigned_int("SLen")
        )

        IgnoreMissing..unsigned(
            "GetSyncScopeID",

            LLVMContextRef("C"),
            charUTF8.const.p("Name"),
            AutoSize("Name")..size_t("SLen")
        )

        unsigned_int(
            "GetMDKindID",

            charUTF8.const.p("Name"),
            AutoSize("Name")..unsigned_int("SLen")
        )

        unsigned_int(
            "GetEnumAttributeKindForName",

            charUTF8.const.p("Name"),
            AutoSize("Name")..size_t("SLen")
        )

        unsigned_int(
            "GetLastEnumAttributeKind",

            void()
        )

        LLVMAttributeRef(
            "CreateEnumAttribute",

            LLVMContextRef("C"),
            unsigned_int("KindID"),
            uint64_t("Val")
        )

        unsigned_int(
            "GetEnumAttributeKind",

            LLVMAttributeRef("A")
        )

        uint64_t(
            "GetEnumAttributeValue",

            LLVMAttributeRef("A")
        )

        IgnoreMissing..LLVMAttributeRef(
            "CreateTypeAttribute",

            LLVMContextRef("C"),
            unsigned("KindID"),
            LLVMTypeRef("type_ref")
        )

        IgnoreMissing..LLVMTypeRef(
            "GetTypeAttributeValue",

            LLVMAttributeRef("A")
        )

        IgnoreMissing..LLVMAttributeRef(
            "CreateConstantRangeAttribute",

            LLVMContextRef("C"),
            unsigned("KindID"),
            unsigned("NumBits"),
            Unsafe..uint64_t.const.p("LowerWords"),
            Unsafe..uint64_t.const.p("UpperWords")
        )

        LLVMAttributeRef(
            "CreateStringAttribute",

            LLVMContextRef("C"),
            charUTF8.const.p("K"),
            AutoSize("K")..unsigned_int("KLength"),
            charUTF8.const.p("V"),
            AutoSize("V")..unsigned_int("VLength")
        )

        Nonnull..charUTF8.const.p(
            "GetStringAttributeKind",

            LLVMAttributeRef("A"),
            AutoSizeResult..unsigned_int.p("Length")
        )

        Nonnull..charUTF8.const.p(
            "GetStringAttributeValue",

            LLVMAttributeRef("A"),
            AutoSizeResult..unsigned_int.p("Length")
        )

        LLVMBool(
            "IsEnumAttribute",

            LLVMAttributeRef("A")
        )

        LLVMBool(
            "IsStringAttribute",

            LLVMAttributeRef("A")
        )

        IgnoreMissing..LLVMBool(
            "IsTypeAttribute",

            LLVMAttributeRef("A")
        )

        IgnoreMissing..LLVMTypeRef(
            "GetTypeByName2",

            LLVMContextRef("C"),
            charUTF8.const.p("Name")
        )

        LLVMModuleRef(
            "ModuleCreateWithName",

            charUTF8.const.p("ModuleID")
        )

        LLVMModuleRef(
            "ModuleCreateWithNameInContext",

            charUTF8.const.p("ModuleID"),
            LLVMContextRef("C")
        )

        LLVMModuleRef(
            "CloneModule",

            LLVMModuleRef("M")
        )

        void(
            "DisposeModule",

            LLVMModuleRef("M")
        )

        Nonnull..charUTF8.const.p(
            "GetModuleIdentifier",

            LLVMModuleRef("M"),
            AutoSizeResult..size_t.p("Len")
        )

        void(
            "SetModuleIdentifier",

            LLVMModuleRef("M"),
            charUTF8.const.p("Ident"),
            AutoSize("Ident")..size_t("Len")
        )

        IgnoreMissing..Nonnull..charUTF8.const.p(
            "GetSourceFileName",

            LLVMModuleRef("M"),
            AutoSizeResult..size_t.p("Len")
        )

        IgnoreMissing..void(
            "SetSourceFileName",

            LLVMModuleRef("M"),
            charUTF8.const.p("Name"),
            AutoSize("Name")..size_t("Len")
        )

        Nonnull..charUTF8.const.p(
            "GetDataLayoutStr",

            LLVMModuleRef("M")
        )

        Nonnull..charUTF8.const.p(
            "GetDataLayout",

            LLVMModuleRef("M")
        )

        void(
            "SetDataLayout",

            LLVMModuleRef("M"),
            charUTF8.const.p("DataLayoutStr")
        )

        Nonnull..charUTF8.const.p(
            "GetTarget",

            LLVMModuleRef("M")
        )

        void(
            "SetTarget",

            LLVMModuleRef("M"),
            charUTF8.const.p("Triple")
        )

        IgnoreMissing..LLVMModuleFlagEntry.p(
            "CopyModuleFlagsMetadata",

            LLVMModuleRef("M"),
            Check(1)..size_t.p("Len")
        )

        IgnoreMissing..void(
            "DisposeModuleFlagsMetadata",

            LLVMModuleFlagEntry.p("Entries")
        )

        IgnoreMissing..LLVMModuleFlagBehavior(
            "ModuleFlagEntriesGetFlagBehavior",

            LLVMModuleFlagEntry.p("Entries"),
            unsigned_int("Index")
        )

        IgnoreMissing..Nonnull..charUTF8.const.p(
            "ModuleFlagEntriesGetKey",

            LLVMModuleFlagEntry.p("Entries"),
            unsigned_int("Index"),
            AutoSizeResult..size_t.p("Len")
        )

        IgnoreMissing..LLVMMetadataRef(
            "ModuleFlagEntriesGetMetadata",

            LLVMModuleFlagEntry.p("Entries"),
            unsigned_int("Index")
        )

        IgnoreMissing..LLVMMetadataRef(
            "GetModuleFlag",

            LLVMModuleRef("M"),
            charUTF8.const.p("Key"),
            AutoSize("Key")..size_t("KeyLen")
        )

        IgnoreMissing..void(
            "AddModuleFlag",

            LLVMModuleRef("M"),
            LLVMModuleFlagBehavior("Behavior"),
            charUTF8.const.p("Key"),
            AutoSize("Key")..size_t("KeyLen"),
            LLVMMetadataRef("Val")
        )

        void(
            "DumpModule",

            LLVMModuleRef("M")
        )

        LLVMBool(
            "PrintModuleToFile",

            LLVMModuleRef("M"),
            charUTF8.const.p("Filename"),
            Check(1)..charUTF8.p.p("ErrorMessage")
        )

        Nonnull..charUTF8.p(
            "PrintModuleToString",

            LLVMModuleRef("M")
        )

        IgnoreMissing..Nonnull..charUTF8.const.p(
            "GetModuleInlineAsm",

            LLVMModuleRef("M"),
            AutoSizeResult..size_t.p("Len")
        )

        IgnoreMissing..void(
            "SetModuleInlineAsm2",

            LLVMModuleRef("M"),
            charUTF8.const.p("Asm"),
            AutoSize("Asm")..size_t("Len")
        )

        IgnoreMissing..void(
            "AppendModuleInlineAsm",

            LLVMModuleRef("M"),
            charUTF8.const.p("Asm"),
            AutoSize("Asm")..size_t("Len")
        )

        IgnoreMissing..LLVMValueRef(
            "GetInlineAsm",

            LLVMTypeRef("Ty"),
            charUTF8.const.p("AsmString"),
            AutoSize("AsmString")..size_t("AsmStringSize"),
            charUTF8.const.p("Constraints"),
            AutoSize("Constraints")..size_t("ConstraintsSize"),
            LLVMBool("HasSideEffects"),
            LLVMBool("IsAlignStack"),
            LLVMInlineAsmDialect("Dialect"),
            LLVMBool("CanThrow")
        )

        IgnoreMissing..charUTF8.const.p(
            "GetInlineAsmAsmString",

            LLVMValueRef("InlineAsmVal"),
            AutoSizeResult..size_t.p("Len")
        )

        IgnoreMissing..charUTF8.const.p(
            "GetInlineAsmConstraintString",

            LLVMValueRef("InlineAsmVal"),
            AutoSizeResult..size_t.p("Len")
        )

        IgnoreMissing..LLVMInlineAsmDialect(
            "GetInlineAsmDialect",

            LLVMValueRef("InlineAsmVal")
        )

        IgnoreMissing..LLVMTypeRef(
            "GetInlineAsmFunctionType",

            LLVMValueRef("InlineAsmVal")
        )

        IgnoreMissing..LLVMBool(
            "GetInlineAsmHasSideEffects",

            LLVMValueRef("InlineAsmVal")
        )

        IgnoreMissing..LLVMBool(
            "GetInlineAsmNeedsAlignedStack",

            LLVMValueRef("InlineAsmVal")
        )

        IgnoreMissing..LLVMBool(
            "GetInlineAsmCanUnwind",

            LLVMValueRef("InlineAsmVal")
        )

        LLVMContextRef(
            "GetModuleContext",

            LLVMModuleRef("M")
        )

        LLVMTypeRef(
            "GetTypeByName",

            LLVMModuleRef("M"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMNamedMDNodeRef(
            "GetFirstNamedMetadata",

            LLVMModuleRef("M")
        )

        IgnoreMissing..LLVMNamedMDNodeRef(
            "GetLastNamedMetadata",

            LLVMModuleRef("M")
        )

        IgnoreMissing..LLVMNamedMDNodeRef(
            "GetNextNamedMetadata",

            LLVMNamedMDNodeRef("NamedMDNode")
        )

        IgnoreMissing..LLVMNamedMDNodeRef(
            "GetPreviousNamedMetadata",

            LLVMNamedMDNodeRef("NamedMDNode")
        )

        IgnoreMissing..LLVMNamedMDNodeRef(
            "GetNamedMetadata",

            LLVMModuleRef("M"),
            charUTF8.const.p("Name"),
            AutoSize("Name")..size_t("NameLen")
        )

        IgnoreMissing..LLVMNamedMDNodeRef(
            "GetOrInsertNamedMetadata",

            LLVMModuleRef("M"),
            charUTF8.const.p("Name"),
            AutoSize("Name")..size_t("NameLen")
        )

        IgnoreMissing..Nonnull..charUTF8.const.p(
            "GetNamedMetadataName",

            LLVMNamedMDNodeRef("NamedMD"),
            AutoSizeResult..size_t.p("NameLen")
        )

        unsigned_int(
            "GetNamedMetadataNumOperands",

            LLVMModuleRef("M"),
            charUTF8.const.p("Name")
        )

        void(
            "GetNamedMetadataOperands",

            LLVMModuleRef("M"),
            charUTF8.const.p("Name"),
            Check(
                "LLVMGetNamedMetadataNumOperands(M, Name)", debug = true
            )..LLVMValueRef.p("Dest")
        )

        void(
            "AddNamedMetadataOperand",

            LLVMModuleRef("M"),
            charUTF8.const.p("Name"),
            LLVMValueRef("Val")
        )

        IgnoreMissing..charUTF8.const.p(
            "GetDebugLocDirectory",

            LLVMValueRef("Val"),
            AutoSizeResult..unsigned_int.p("Length")
        )

        IgnoreMissing..charUTF8.const.p(
            "GetDebugLocFilename",

            LLVMValueRef("Val"),
            AutoSizeResult..unsigned_int.p("Length")
        )

        IgnoreMissing..unsigned_int(
            "GetDebugLocLine",

            LLVMValueRef("Val")
        )

        IgnoreMissing..unsigned_int(
            "GetDebugLocColumn",

            LLVMValueRef("Val")
        )

        LLVMValueRef(
            "AddFunction",

            LLVMModuleRef("M"),
            charUTF8.const.p("Name"),
            LLVMTypeRef("FunctionTy")
        )

        LLVMValueRef(
            "GetNamedFunction",

            LLVMModuleRef("M"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "GetNamedFunctionWithLength",

            LLVMModuleRef("M"),
            charUTF8.const.p("Name"),
            AutoSize("Name")..size_t("Length")
        )

        LLVMValueRef(
            "GetFirstFunction",

            LLVMModuleRef("M")
        )

        LLVMValueRef(
            "GetLastFunction",

            LLVMModuleRef("M")
        )

        LLVMValueRef(
            "GetNextFunction",

            LLVMValueRef("Fn")
        )

        LLVMValueRef(
            "GetPreviousFunction",

            LLVMValueRef("Fn")
        )

        IgnoreMissing..void(
            "SetModuleInlineAsm",

            LLVMModuleRef("M"),
            charUTF8.const.p("Asm")
        )

        LLVMTypeKind(
            "GetTypeKind",

            LLVMTypeRef("Ty")
        )

        LLVMBool(
            "TypeIsSized",

            LLVMTypeRef("Ty")
        )

        LLVMContextRef(
            "GetTypeContext",

            LLVMTypeRef("Ty")
        )

        IgnoreMissing..void(
            "DumpType",

            LLVMTypeRef("Val")
        )

        Nonnull..charUTF8.p(
            "PrintTypeToString",

            LLVMTypeRef("Val")
        )

        LLVMTypeRef(
            "Int1TypeInContext",

            LLVMContextRef("C")
        )

        LLVMTypeRef(
            "Int8TypeInContext",

            LLVMContextRef("C")
        )

        LLVMTypeRef(
            "Int16TypeInContext",

            LLVMContextRef("C")
        )

        LLVMTypeRef(
            "Int32TypeInContext",

            LLVMContextRef("C")
        )

        LLVMTypeRef(
            "Int64TypeInContext",

            LLVMContextRef("C")
        )

        LLVMTypeRef(
            "Int128TypeInContext",

            LLVMContextRef("C")
        )

        LLVMTypeRef(
            "IntTypeInContext",

            LLVMContextRef("C"),
            unsigned_int("NumBits")
        )

        LLVMTypeRef("Int1Type", void())
        LLVMTypeRef("Int8Type", void())
        LLVMTypeRef("Int16Type", void())
        LLVMTypeRef("Int32Type", void())
        LLVMTypeRef("Int64Type", void())
        LLVMTypeRef("Int128Type", void())

        LLVMTypeRef(
            "IntType",

            unsigned_int("NumBits")
        )

        unsigned_int(
            "GetIntTypeWidth",

            LLVMTypeRef("IntegerTy")
        )

        LLVMTypeRef(
            "HalfTypeInContext",

            LLVMContextRef("C")
        )

        IgnoreMissing..LLVMTypeRef(
            "BFloatTypeInContext",

            LLVMContextRef("C")
        )

        LLVMTypeRef(
            "FloatTypeInContext",

            LLVMContextRef("C")
        )

        LLVMTypeRef(
            "DoubleTypeInContext",

            LLVMContextRef("C")
        )

        LLVMTypeRef(
            "X86FP80TypeInContext",

            LLVMContextRef("C")
        )

        LLVMTypeRef(
            "FP128TypeInContext",

            LLVMContextRef("C")
        )

        LLVMTypeRef(
            "PPCFP128TypeInContext",

            LLVMContextRef("C")
        )

        LLVMTypeRef("HalfType", void())
        IgnoreMissing..LLVMTypeRef(
            "BFloatType",

            void()
        )
        LLVMTypeRef("FloatType", void())
        LLVMTypeRef("DoubleType", void())
        LLVMTypeRef("X86FP80Type", void())
        LLVMTypeRef("FP128Type", void())
        LLVMTypeRef("PPCFP128Type", void())

        LLVMTypeRef(
            "FunctionType",

            LLVMTypeRef("ReturnType"),
            LLVMTypeRef.p("ParamTypes"),
            AutoSize("ParamTypes")..unsigned_int("ParamCount"),
            LLVMBool("IsVarArg")
        )

        LLVMBool(
            "IsFunctionVarArg",

            LLVMTypeRef("FunctionTy")
        )

        LLVMTypeRef(
            "GetReturnType",

            LLVMTypeRef("FunctionTy")
        )

        unsigned_int(
            "CountParamTypes",

            LLVMTypeRef("FunctionTy")
        )

        void(
            "GetParamTypes",

            LLVMTypeRef("FunctionTy"),
            Check(
                "LLVMCountParamTypes(FunctionTy)", debug = true
            )..LLVMTypeRef.p("Dest")
        )

        LLVMTypeRef(
            "StructTypeInContext",

            LLVMContextRef("C"),
            LLVMTypeRef.p("ElementTypes"),
            AutoSize("ElementTypes")..unsigned_int("ElementCount"),
            LLVMBool("Packed")
        )

        LLVMTypeRef(
            "StructType",

            LLVMTypeRef.p("ElementTypes"),
            AutoSize("ElementTypes")..unsigned_int("ElementCount"),
            LLVMBool("Packed")
        )

        LLVMTypeRef(
            "StructCreateNamed",

            LLVMContextRef("C"),
            charUTF8.const.p("Name")
        )

        charUTF8.const.p(
            "GetStructName",

            LLVMTypeRef("Ty")
        )

        void(
            "StructSetBody",

            LLVMTypeRef("StructTy"),
            LLVMTypeRef.p("ElementTypes"),
            AutoSize("ElementTypes")..unsigned_int("ElementCount"),
            LLVMBool("Packed")
        )

        unsigned_int(
            "CountStructElementTypes",

            LLVMTypeRef("StructTy")
        )

        void(
            "GetStructElementTypes",

            LLVMTypeRef("StructTy"),
            Check(
                "LLVMCountStructElementTypes(StructTy)", debug = true
            )..LLVMTypeRef.p("Dest")
        )

        LLVMTypeRef(
            "StructGetTypeAtIndex",

            LLVMTypeRef("StructTy"),
            unsigned_int("i")
        )

        LLVMBool(
            "IsPackedStruct",

            LLVMTypeRef("StructTy")
        )

        LLVMBool(
            "IsOpaqueStruct",

            LLVMTypeRef("StructTy")
        )

        IgnoreMissing..LLVMBool(
            "IsLiteralStruct",

            LLVMTypeRef("StructTy")
        )

        LLVMTypeRef(
            "GetElementType",

            LLVMTypeRef("Ty")
        )

        void(
            "GetSubtypes",

            LLVMTypeRef("Tp"),
            Unsafe..LLVMTypeRef.p("Arr")
        )

        unsigned_int(
            "GetNumContainedTypes",

            LLVMTypeRef("Tp")
        )

        LLVMTypeRef(
            "ArrayType",

            LLVMTypeRef("ElementType"),
            unsigned_int("ElementCount")
        )

        LLVMTypeRef(
            "ArrayType2",

            LLVMTypeRef("ElementType"),
            uint64_t("ElementCount")
        )

        unsigned_int(
            "GetArrayLength",

            LLVMTypeRef("ArrayTy")
        )

        uint64_t(
            "GetArrayLength2",

            LLVMTypeRef("ArrayTy")
        )

        LLVMTypeRef(
            "PointerType",

            LLVMTypeRef("ElementType"),
            unsigned_int("AddressSpace")
        )

        IgnoreMissing..LLVMBool(
            "PointerTypeIsOpaque",

            LLVMTypeRef("Ty")
        )

        IgnoreMissing..LLVMTypeRef(
            "PointerTypeInContext",

            LLVMContextRef("C"),
            unsigned("AddressSpace")
        )

        unsigned_int(
            "GetPointerAddressSpace",

            LLVMTypeRef("PointerTy")
        )

        LLVMTypeRef(
            "VectorType",

            LLVMTypeRef("ElementType"),
            unsigned_int("ElementCount")
        )

        IgnoreMissing..LLVMTypeRef(
            "ScalableVectorType",

            LLVMTypeRef("ElementType"),
            unsigned("ElementCount")
        )

        unsigned_int(
            "GetVectorSize",

            LLVMTypeRef("VectorTy")
        )

        IgnoreMissing..LLVMValueRef(
            "GetConstantPtrAuthPointer",

            LLVMValueRef("PtrAuth")
        )

        IgnoreMissing..LLVMValueRef(
            "GetConstantPtrAuthKey",

            LLVMValueRef("PtrAuth")
        )

        IgnoreMissing..LLVMValueRef(
            "GetConstantPtrAuthDiscriminator",

            LLVMValueRef("PtrAuth")
        )

        IgnoreMissing..LLVMValueRef(
            "GetConstantPtrAuthAddrDiscriminator",

            LLVMValueRef("PtrAuth")
        )

        LLVMTypeRef(
            "VoidTypeInContext",

            LLVMContextRef("C")
        )

        LLVMTypeRef(
            "LabelTypeInContext",

            LLVMContextRef("C")
        )

        IgnoreMissing..LLVMTypeRef(
            "X86MMXTypeInContext",

            LLVMContextRef("C")
        )

        IgnoreMissing..LLVMTypeRef(
            "X86AMXTypeInContext",

            LLVMContextRef("C")
        )

        IgnoreMissing..LLVMTypeRef(
            "TokenTypeInContext",

            LLVMContextRef("C")
        )

        IgnoreMissing..LLVMTypeRef(
            "MetadataTypeInContext",

            LLVMContextRef("C")
        )

        LLVMTypeRef(
            "VoidType",

            void()
        )
        LLVMTypeRef("LabelType", void())
        IgnoreMissing..LLVMTypeRef("X86MMXType", void())
        IgnoreMissing..LLVMTypeRef(
            "X86AMXType",

            void()
        )

        IgnoreMissing..LLVMTypeRef(
            "TargetExtTypeInContext",

            LLVMContextRef("C"),
            charUTF8.const.p("Name"),
            nullable..LLVMTypeRef.p("TypeParams"),
            AutoSize("TypeParams")..unsigned("TypeParamCount"),
            nullable..unsigned.p("IntParams"),
            AutoSize("IntParams")..unsigned("IntParamCount")
        )

        IgnoreMissing..charUTF8.const.p(
            "GetTargetExtTypeName",

            LLVMTypeRef("TargetExtTy")
        )

        IgnoreMissing..unsigned(
            "GetTargetExtTypeNumTypeParams",

            LLVMTypeRef("TargetExtTy")
        )

        IgnoreMissing..LLVMTypeRef(
            "GetTargetExtTypeTypeParam",

            LLVMTypeRef("TargetExtTy"),
            unsigned("Idx")
        )

        IgnoreMissing..unsigned(
            "GetTargetExtTypeNumIntParams",

            LLVMTypeRef("TargetExtTy")
        )

        IgnoreMissing..unsigned(
            "GetTargetExtTypeIntParam",

            LLVMTypeRef("TargetExtTy"),
            unsigned("Idx")
        )

        LLVMTypeRef(
            "TypeOf",

            LLVMValueRef("Val")
        )

        LLVMValueKind(
            "GetValueKind",

            LLVMValueRef("Val")
        )

        IgnoreMissing..Nonnull..charUTF8.const.p(
            "GetValueName2",

            LLVMValueRef("Val"),
            AutoSizeResult..size_t.p("Length")
        )

        IgnoreMissing..void(
            "SetValueName2",

            LLVMValueRef("Val"),
            charUTF8.const.p("Name"),
            AutoSize("Name")..size_t("NameLen")
        )

        void(
            "DumpValue",

            LLVMValueRef("Val")
        )

        Nonnull..charUTF8.p(
            "PrintValueToString",

            LLVMValueRef("Val")
        )

        IgnoreMissing..LLVMContextRef(
            "GetValueContext",

            LLVMValueRef("Val")
        )

        IgnoreMissing..charUTF8.p(
            "PrintDbgRecordToString",

            LLVMDbgRecordRef("Record")
        )

        void(
            "ReplaceAllUsesWith",

            LLVMValueRef("OldVal"),
            LLVMValueRef("NewVal")
        )

        LLVMBool(
            "IsConstant",

            LLVMValueRef("Val")
        )

        LLVMBool(
            "IsUndef",

            LLVMValueRef("Val")
        )

        IgnoreMissing..LLVMBool(
            "IsPoison",

            LLVMValueRef("Val")
        )

        val postLLVM5 = setOf(
            "GlobalIFunc",
            "PoisonValue",
            "UnaryOperator",
            "DbgVariableIntrinsic",
            "DbgLabelInst",
            "CatchSwitchInst",
            "CallBrInst",
            "FreezeInst",
            "AtomicCmpXchgInst",
            "AtomicRMWInst",
            "FenceInst",
            "ValueAsMetadata",
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
            "GlobalObject",
            "Function",
            "GlobalVariable",
            "GlobalIFunc",
            "UndefValue",
            "PoisonValue",
            "Instruction",
            "UnaryOperator",
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
            "CatchSwitchInst",
            "CallBrInst",
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
            "FreezeInst",
            "AtomicCmpXchgInst",
            "AtomicRMWInst",
            "FenceInst",
            // ----------------
            "MDNode",
            "ValueAsMetadata",
            "MDString"
        ).forEach {
            LLVMValueRef(
                "IsA$it",

                LLVMValueRef("Val")
            ).let { func ->
                if (postLLVM5.contains(it)) {
                    IgnoreMissing..func
                }
            }
        }

        Nonnull..charUTF8.const.p(
            "GetValueName",

            LLVMValueRef("Val")
        )

        void(
            "SetValueName",

            LLVMValueRef("Val"),
            charUTF8.const.p("Name")
        )

        LLVMUseRef(
            "GetFirstUse",

            LLVMValueRef("Val")
        )

        LLVMUseRef(
            "GetNextUse",

            LLVMUseRef("U")
        )

        LLVMValueRef(
            "GetUser",

            LLVMUseRef("U")
        )

        LLVMValueRef(
            "GetUsedValue",

            LLVMUseRef("U")
        )

        LLVMValueRef(
            "GetOperand",

            LLVMValueRef("Val"),
            unsigned_int("Index")
        )

        LLVMUseRef(
            "GetOperandUse",

            LLVMValueRef("Val"),
            unsigned_int("Index")
        )

        void(
            "SetOperand",

            LLVMValueRef("User"),
            unsigned_int("Index"),
            LLVMValueRef("Val")
        )

        int(
            "GetNumOperands",

            LLVMValueRef("Val")
        )

        LLVMValueRef(
            "ConstNull",

            LLVMTypeRef("Ty")
        )

        LLVMValueRef(
            "ConstAllOnes",

            LLVMTypeRef("Ty")
        )

        LLVMValueRef(
            "GetUndef",

            LLVMTypeRef("Ty")
        )

        IgnoreMissing..LLVMValueRef(
            "GetPoison",

            LLVMTypeRef("Ty")
        )

        LLVMBool(
            "IsNull",

            LLVMValueRef("Val")
        )

        LLVMValueRef(
            "ConstPointerNull",

            LLVMTypeRef("Ty")
        )

        LLVMValueRef(
            "ConstInt",

            LLVMTypeRef("IntTy"),
            unsigned_long_long("N"),
            LLVMBool("SignExtend")
        )

        LLVMValueRef(
            "ConstIntOfArbitraryPrecision",

            LLVMTypeRef("IntTy"),
            AutoSize("Words")..unsigned_int("NumWords"),
            uint64_t.const.p("Words")
        )

        LLVMValueRef(
            "ConstIntOfString",

            LLVMTypeRef("IntTy"),
            charUTF8.const.p("Text"),
            uint8_t("Radix")
        )

        LLVMValueRef(
            "ConstIntOfStringAndSize",

            LLVMTypeRef("IntTy"),
            charUTF8.const.p("Text"),
            AutoSize("Text")..unsigned_int("SLen"),
            uint8_t("Radix")
        )

        LLVMValueRef(
            "ConstReal",

            LLVMTypeRef("RealTy"),
            double("N")
        )

        LLVMValueRef(
            "ConstRealOfString",

            LLVMTypeRef("RealTy"),
            charUTF8.const.p("Text")
        )

        LLVMValueRef(
            "ConstRealOfStringAndSize",

            LLVMTypeRef("RealTy"),
            charUTF8.const.p("Text"),
            AutoSize("Text")..unsigned_int("SLen")
        )

        unsigned_long_long(
            "ConstIntGetZExtValue",

            LLVMValueRef("ConstantVal")
        )

        long_long(
            "ConstIntGetSExtValue",

            LLVMValueRef("ConstantVal")
        )

        double(
            "ConstRealGetDouble",

            LLVMValueRef("ConstantVal"),
            Check(1)..LLVMBool.p("losesInfo")
        )

        LLVMValueRef(
            "ConstStringInContext",

            LLVMContextRef("C"),
            charUTF8.const.p("Str"),
            AutoSize("Str")..unsigned_int("Length"),
            LLVMBool("DontNullTerminate")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstStringInContext2",

            LLVMContextRef("C"),
            charUTF8.const.p("Str"),
            AutoSize("Str")..unsigned_int("Length"),
            LLVMBool("DontNullTerminate")
        )

        LLVMValueRef(
            "ConstString",

            charUTF8.const.p("Str"),
            AutoSize("Str")..unsigned_int("Length"),
            LLVMBool("DontNullTerminate")
        )

        LLVMBool(
            "IsConstantString",

            LLVMValueRef("c")
        )

        Nonnull..charUTF8.const.p(
            "GetAsString",

            LLVMValueRef("c"),
            AutoSizeResult..size_t.p("Length")
        )

        LLVMValueRef(
            "ConstStructInContext",

            LLVMContextRef("C"),
            LLVMValueRef.p("ConstantVals"),
            AutoSize("ConstantVals")..unsigned_int("Count"),
            LLVMBool("Packed")
        )

        LLVMValueRef(
            "ConstStruct",

            LLVMValueRef.p("ConstantVals"),
            AutoSize("ConstantVals")..unsigned_int("Count"),
            LLVMBool("Packed")
        )

        LLVMValueRef(
            "ConstArray",

            LLVMTypeRef("ElementTy"),
            LLVMValueRef.p("ConstantVals"),
            AutoSize("ConstantVals")..unsigned_int("Length")
        )

        LLVMValueRef(
            "ConstArray2",

            LLVMTypeRef("ElementTy"),
            LLVMValueRef.p("ConstantVals"),
            AutoSize("ConstantVals")..uint64_t("Length")
        )

        LLVMValueRef(
            "ConstNamedStruct",

            LLVMTypeRef("StructTy"),
            LLVMValueRef.p("ConstantVals"),
            AutoSize("ConstantVals")..unsigned_int("Count")
        )

        IgnoreMissing..LLVMValueRef(
            "GetAggregateElement",

            LLVMValueRef("C"),
            unsigned("Idx")
        )

        LLVMValueRef(
            "GetElementAsConstant",

            LLVMValueRef("C"),
            unsigned_int("idx")
        )

        LLVMValueRef(
            "ConstVector",

            LLVMValueRef.p("ScalarConstantVals"),
            AutoSize("ScalarConstantVals")..unsigned_int("Size")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstantPtrAuth",

            LLVMValueRef("Ptr"),
            LLVMValueRef("Key"),
            LLVMValueRef("Disc"),
            LLVMValueRef("AddrDisc")
        )

        LLVMOpcode(
            "GetConstOpcode",

            LLVMValueRef("ConstantVal")
        )

        LLVMValueRef(
            "AlignOf",

            LLVMTypeRef("Ty")
        )

        LLVMValueRef(
            "SizeOf",

            LLVMTypeRef("Ty")
        )

        LLVMValueRef(
            "ConstNeg",

            LLVMValueRef("ConstantVal")
        )

        LLVMValueRef(
            "ConstNSWNeg",

            LLVMValueRef("ConstantVal")
        )

        LLVMValueRef(
            "ConstNUWNeg",

            LLVMValueRef("ConstantVal")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstFNeg",

            LLVMValueRef("ConstantVal")
        )

        LLVMValueRef(
            "ConstNot",

            LLVMValueRef("ConstantVal")
        )

        LLVMValueRef(
            "ConstAdd",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        LLVMValueRef(
            "ConstNSWAdd",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        LLVMValueRef(
            "ConstNUWAdd",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstFAdd",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        LLVMValueRef(
            "ConstSub",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        LLVMValueRef(
            "ConstNSWSub",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        LLVMValueRef(
            "ConstNUWSub",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstFSub",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        LLVMValueRef(
            "ConstMul",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        LLVMValueRef(
            "ConstNSWMul",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        LLVMValueRef(
            "ConstNUWMul",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstFMul",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstUDiv",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstExactUDiv",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstSDiv",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstExactSDiv",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstFDiv",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstURem",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstSRem",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstFRem",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstAnd",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstOr",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        LLVMValueRef(
            "ConstXor",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstICmp",

            LLVMIntPredicate("Predicate"),
            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstFCmp",

            LLVMRealPredicate("Predicate"),
            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstShl",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstLShr",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstAShr",

            LLVMValueRef("LHSConstant"),
            LLVMValueRef("RHSConstant")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstGEP",

            LLVMValueRef("ConstantVal"),
            LLVMValueRef.p("ConstantIndices"),
            AutoSize("ConstantIndices")..unsigned_int("NumIndices")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstGEP2",

            LLVMTypeRef("Ty"),
            LLVMValueRef("ConstantVal"),
            LLVMValueRef.p("ConstantIndices"),
            AutoSize("ConstantIndices")..unsigned_int("NumIndices")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstInBoundsGEP",

            LLVMValueRef("ConstantVal"),
            LLVMValueRef.p("ConstantIndices"),
            AutoSize("ConstantIndices")..unsigned_int("NumIndices")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstInBoundsGEP2",

            LLVMTypeRef("Ty"),
            LLVMValueRef("ConstantVal"),
            LLVMValueRef.p("ConstantIndices"),
            AutoSize("ConstantIndices")..unsigned_int("NumIndices")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstInBoundsGEPWithNoWrapFlags",

            LLVMTypeRef("Ty"),
            LLVMValueRef("ConstantVal"),
            LLVMValueRef.p("ConstantIndices"),
            AutoSize("ConstantIndices")..unsigned("NumIndices"),
            LLVMGEPNoWrapFlags("NoWrapFlags")
        )

        LLVMValueRef(
            "ConstTrunc",

            LLVMValueRef("ConstantVal"),
            LLVMTypeRef("ToType")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstSExt",

            LLVMValueRef("ConstantVal"),
            LLVMTypeRef("ToType")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstZExt",

            LLVMValueRef("ConstantVal"),
            LLVMTypeRef("ToType")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstFPTrunc",

            LLVMValueRef("ConstantVal"),
            LLVMTypeRef("ToType")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstFPExt",

            LLVMValueRef("ConstantVal"),
            LLVMTypeRef("ToType")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstUIToFP",

            LLVMValueRef("ConstantVal"),
            LLVMTypeRef("ToType")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstSIToFP",

            LLVMValueRef("ConstantVal"),
            LLVMTypeRef("ToType")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstFPToUI",

            LLVMValueRef("ConstantVal"),
            LLVMTypeRef("ToType")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstFPToSI",

            LLVMValueRef("ConstantVal"),
            LLVMTypeRef("ToType")
        )

        LLVMValueRef(
            "ConstPtrToInt",

            LLVMValueRef("ConstantVal"),
            LLVMTypeRef("ToType")
        )

        LLVMValueRef(
            "ConstIntToPtr",

            LLVMValueRef("ConstantVal"),
            LLVMTypeRef("ToType")
        )

        LLVMValueRef(
            "ConstBitCast",

            LLVMValueRef("ConstantVal"),
            LLVMTypeRef("ToType")
        )

        LLVMValueRef(
            "ConstAddrSpaceCast",

            LLVMValueRef("ConstantVal"),
            LLVMTypeRef("ToType")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstZExtOrBitCast",

            LLVMValueRef("ConstantVal"),
            LLVMTypeRef("ToType")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstSExtOrBitCast",

            LLVMValueRef("ConstantVal"),
            LLVMTypeRef("ToType")
        )

        LLVMValueRef(
            "ConstTruncOrBitCast",

            LLVMValueRef("ConstantVal"),
            LLVMTypeRef("ToType")
        )

        LLVMValueRef(
            "ConstPointerCast",

            LLVMValueRef("ConstantVal"),
            LLVMTypeRef("ToType")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstIntCast",

            LLVMValueRef("ConstantVal"),
            LLVMTypeRef("ToType"),
            LLVMBool("isSigned")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstFPCast",

            LLVMValueRef("ConstantVal"),
            LLVMTypeRef("ToType")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstSelect",

            LLVMValueRef("ConstantCondition"),
            LLVMValueRef("ConstantIfTrue"),
            LLVMValueRef("ConstantIfFalse")
        )

        LLVMValueRef(
            "ConstExtractElement",

            LLVMValueRef("VectorConstant"),
            LLVMValueRef("IndexConstant")
        )

        LLVMValueRef(
            "ConstInsertElement",

            LLVMValueRef("VectorConstant"),
            LLVMValueRef("ElementValueConstant"),
            LLVMValueRef("IndexConstant")
        )

        LLVMValueRef(
            "ConstShuffleVector",

            LLVMValueRef("VectorAConstant"),
            LLVMValueRef("VectorBConstant"),
            LLVMValueRef("MaskConstant")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstExtractValue",

            LLVMValueRef("AggConstant"),
            unsigned_int.p("IdxList"),
            AutoSize("IdxList")..unsigned_int("NumIdx")
        )

        IgnoreMissing..LLVMValueRef(
            "ConstInsertValue",

            LLVMValueRef("AggConstant"),
            LLVMValueRef("ElementValueConstant"),
            unsigned_int.p("IdxList"),
            AutoSize("IdxList")..unsigned_int("NumIdx")
        )
    }

    split {
        IgnoreMissing..LLVMValueRef(
            "BlockAddress",

            LLVMValueRef("F"),
            LLVMBasicBlockRef("BB")
        )

        IgnoreMissing..LLVMValueRef(
            "GetBlockAddressFunction",

            LLVMValueRef("BlockAddr")
        )

        IgnoreMissing..LLVMBasicBlockRef(
            "GetBlockAddressBasicBlock",

            LLVMValueRef("BlockAddr")
        )

        LLVMValueRef(
            "ConstInlineAsm",

            LLVMTypeRef("Ty"),
            charUTF8.const.p("AsmString"),
            charUTF8.const.p("Constraints"),
            LLVMBool("HasSideEffects"),
            LLVMBool("IsAlignStack")
        )

        LLVMModuleRef(
            "GetGlobalParent",

            LLVMValueRef("Global")
        )

        LLVMBool(
            "IsDeclaration",

            LLVMValueRef("Global")
        )

        LLVMLinkage(
            "GetLinkage",

            LLVMValueRef("Global")
        )

        void(
            "SetLinkage",

            LLVMValueRef("Global"),
            LLVMLinkage("Linkage")
        )

        Nonnull..charUTF8.const.p(
            "GetSection",

            LLVMValueRef("Global")
        )

        void(
            "SetSection",

            LLVMValueRef("Global"),
            charUTF8.const.p("Section")
        )

        LLVMVisibility(
            "GetVisibility",

            LLVMValueRef("Global")
        )

        void(
            "SetVisibility",

            LLVMValueRef("Global"),
            LLVMVisibility("Viz")
        )

        LLVMDLLStorageClass(
            "GetDLLStorageClass",

            LLVMValueRef("Global")
        )

        void(
            "SetDLLStorageClass",

            LLVMValueRef("Global"),
            LLVMDLLStorageClass("Class")
        )

        IgnoreMissing..LLVMUnnamedAddr(
            "GetUnnamedAddress",

            LLVMValueRef("Global")
        )

        IgnoreMissing..void(
            "SetUnnamedAddress",

            LLVMValueRef("Global"),
            LLVMUnnamedAddr("UnnamedAddr")
        )

        IgnoreMissing..LLVMTypeRef(
            "GlobalGetValueType",

            LLVMValueRef("Global")
        )

        LLVMBool(
            "HasUnnamedAddr",

            LLVMValueRef("Global")
        )

        void(
            "SetUnnamedAddr",

            LLVMValueRef("Global"),
            LLVMBool("HasUnnamedAddr")
        )

        unsigned_int(
            "GetAlignment",

            LLVMValueRef("V")
        )

        void(
            "SetAlignment",

            LLVMValueRef("V"),
            unsigned_int("Bytes")
        )

        IgnoreMissing..void(
            "GlobalSetMetadata",

            LLVMValueRef("Global"),
            unsigned_int("Kind"),
            LLVMMetadataRef("MD")
        )

        IgnoreMissing..void(
            "GlobalEraseMetadata",

            LLVMValueRef("Global"),
            unsigned_int("Kind")
        )

        IgnoreMissing..void(
            "GlobalClearMetadata",

            LLVMValueRef("Global")
        )

        IgnoreMissing..LLVMValueMetadataEntry.p(
            "GlobalCopyAllMetadata",

            LLVMValueRef("Value"),
            Check(1)..size_t.p("NumEntries")
        )

        IgnoreMissing..void(
            "DisposeValueMetadataEntries",

            LLVMValueMetadataEntry.p("Entries")
        )

        IgnoreMissing..unsigned_int(
            "ValueMetadataEntriesGetKind",

            LLVMValueMetadataEntry.p("Entries"),
            unsigned_int("Index")
        )

        IgnoreMissing..LLVMMetadataRef(
            "ValueMetadataEntriesGetMetadata",

            LLVMValueMetadataEntry.p("Entries"),
            unsigned_int("Index")
        )

        LLVMValueRef(
            "AddGlobal",

            LLVMModuleRef("M"),
            LLVMTypeRef("Ty"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "AddGlobalInAddressSpace",

            LLVMModuleRef("M"),
            LLVMTypeRef("Ty"),
            charUTF8.const.p("Name"),
            unsigned_int("AddressSpace")
        )

        LLVMValueRef(
            "GetNamedGlobal",

            LLVMModuleRef("M"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "GetNamedGlobalWithLength",

            LLVMModuleRef("M"),
            charUTF8.const.p("Name"),
            AutoSize("Name")..size_t("Length")
        )

        LLVMValueRef(
            "GetFirstGlobal",

            LLVMModuleRef("M")
        )

        LLVMValueRef(
            "GetLastGlobal",

            LLVMModuleRef("M")
        )

        LLVMValueRef(
            "GetNextGlobal",

            LLVMValueRef("GlobalVar")
        )

        LLVMValueRef(
            "GetPreviousGlobal",

            LLVMValueRef("GlobalVar")
        )

        void(
            "DeleteGlobal",

            LLVMValueRef("GlobalVar")
        )

        LLVMValueRef(
            "GetInitializer",

            LLVMValueRef("GlobalVar")
        )

        void(
            "SetInitializer",

            LLVMValueRef("GlobalVar"),
            LLVMValueRef("ConstantVal")
        )

        LLVMBool(
            "IsThreadLocal",

            LLVMValueRef("GlobalVar")
        )

        void(
            "SetThreadLocal",

            LLVMValueRef("GlobalVar"),
            LLVMBool("IsThreadLocal")
        )

        LLVMBool(
            "IsGlobalConstant",

            LLVMValueRef("GlobalVar")
        )

        void(
            "SetGlobalConstant",

            LLVMValueRef("GlobalVar"),
            LLVMBool("IsConstant")
        )

        LLVMThreadLocalMode(
            "GetThreadLocalMode",

            LLVMValueRef("GlobalVar")
        )

        void(
            "SetThreadLocalMode",

            LLVMValueRef("GlobalVar"),
            LLVMThreadLocalMode("Mode")
        )

        LLVMBool(
            "IsExternallyInitialized",

            LLVMValueRef("GlobalVar")
        )

        void(
            "SetExternallyInitialized",

            LLVMValueRef("GlobalVar"),
            LLVMBool("IsExtInit")
        )

        IgnoreMissing..LLVMValueRef(
            "AddAlias",

            LLVMModuleRef("M"),
            LLVMTypeRef("Ty"),
            LLVMValueRef("Aliasee"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "AddAlias2",

            LLVMModuleRef("M"),
            LLVMTypeRef("ValueTy"),
            unsigned("AddrSpace"),
            LLVMValueRef("Aliasee"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "GetNamedGlobalAlias",

            LLVMModuleRef("M"),
            charUTF8.const.p("Name"),
            AutoSize("Name")..size_t("NameLen")
        )

        IgnoreMissing..LLVMValueRef(
            "GetFirstGlobalAlias",

            LLVMModuleRef("M")
        )

        IgnoreMissing..LLVMValueRef(
            "GetLastGlobalAlias",

            LLVMModuleRef("M")
        )

        IgnoreMissing..LLVMValueRef(
            "GetNextGlobalAlias",

            LLVMValueRef("GA")
        )

        IgnoreMissing..LLVMValueRef(
            "GetPreviousGlobalAlias",

            LLVMValueRef("GA")
        )

        IgnoreMissing..LLVMValueRef(
            "AliasGetAliasee",

            LLVMValueRef("Alias")
        )

        IgnoreMissing..void(
            "AliasSetAliasee",

            LLVMValueRef("Alias"),
            LLVMValueRef("Aliasee")
        )

        void(
            "DeleteFunction",

            LLVMValueRef("Fn")
        )

        LLVMBool(
            "HasPersonalityFn",

            LLVMValueRef("Fn")
        )

        LLVMValueRef(
            "GetPersonalityFn",

            LLVMValueRef("Fn")
        )

        void(
            "SetPersonalityFn",

            LLVMValueRef("Fn"),
            LLVMValueRef("PersonalityFn")
        )

        IgnoreMissing..unsigned_int(
            "LookupIntrinsicID",

            charUTF8.const.p("Name"),
            AutoSize("Name")..size_t("NameLen")
        )

        unsigned_int(
            "GetIntrinsicID",

            LLVMValueRef("Fn")
        )

        IgnoreMissing..LLVMValueRef(
            "GetIntrinsicDeclaration",

            LLVMModuleRef("Mod"),
            unsigned("ID"),
            LLVMTypeRef.p("ParamTypes"),
            AutoSize("ParamTypes")..size_t("ParamCount")
        )

        IgnoreMissing..LLVMValueRef(
            "IntrinsicGetType",

            LLVMContextRef("Ctx"),
            unsigned("ID"),
            LLVMTypeRef.p("ParamTypes"),
            AutoSize("ParamTypes")..size_t("ParamCount")
        )

        IgnoreMissing..charUTF8.const.p(
            "IntrinsicGetName",

            unsigned("ID"),
            AutoSizeResult..Check(1)..size_t.p("NameLength")
        )

        IgnoreMissing..charUTF8.p(
            "IntrinsicCopyOverloadedName",

            unsigned("ID"),
            LLVMTypeRef.p("ParamTypes"),
            AutoSize("ParamTypes")..size_t("ParamCount"),
            AutoSizeResult..Check(1)..size_t.p("NameLength")
        )

        IgnoreMissing..charUTF8.p(
            "IntrinsicCopyOverloadedName2",

            LLVMModuleRef("Mod"),
            unsigned("ID"),
            LLVMTypeRef.p("ParamTypes"),
            AutoSize("ParamTypes")..size_t("ParamCount"),
            AutoSizeResult..Check(1)..size_t.p("NameLength")
        )

        IgnoreMissing..LLVMBool(
            "IntrinsicIsOverloaded",

            unsigned("ID")
        )

        unsigned_int(
            "GetFunctionCallConv",

            LLVMValueRef("Fn")
        )

        void(
            "SetFunctionCallConv",

            LLVMValueRef("Fn"),
            unsigned_int("CC")
        )

        charUTF8.const.p(
            "GetGC",

            LLVMValueRef("Fn")
        )

        void(
            "SetGC",

            LLVMValueRef("Fn"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "GetPrefixData",

            LLVMValueRef("Fn")
        )

        IgnoreMissing..LLVMBool(
            "HasPrefixData",

            LLVMValueRef("Fn")
        )

        IgnoreMissing..void(
            "SetPrefixData",

            LLVMValueRef("Fn"),
            LLVMValueRef("prefixData")
        )

        IgnoreMissing..LLVMValueRef(
            "GetPrologueData",

            LLVMValueRef("Fn")
        )

        IgnoreMissing..LLVMBool(
            "HasPrologueData",

            LLVMValueRef("Fn")
        )

        IgnoreMissing..void(
            "SetPrologueData",

            LLVMValueRef("Fn"),
            LLVMValueRef("prologueData")
        )

        void(
            "AddAttributeAtIndex",

            LLVMValueRef("F"),
            LLVMAttributeIndex("Idx"),
            LLVMAttributeRef("A")
        )

        unsigned_int(
            "GetAttributeCountAtIndex",

            LLVMValueRef("F"),
            LLVMAttributeIndex("Idx")
        )

        void(
            "GetAttributesAtIndex",

            LLVMValueRef("F"),
            LLVMAttributeIndex("Idx"),
            Check(
                "LLVMGetAttributeCountAtIndex(F, Idx)", debug = true
            )..LLVMAttributeRef.p("Attrs")
        )

        LLVMAttributeRef(
            "GetEnumAttributeAtIndex",

            LLVMValueRef("F"),
            LLVMAttributeIndex("Idx"),
            unsigned_int("KindID")
        )

        LLVMAttributeRef(
            "GetStringAttributeAtIndex",

            LLVMValueRef("F"),
            LLVMAttributeIndex("Idx"),
            charUTF8.const.p("K"),
            AutoSize("K")..unsigned_int("KLen")
        )

        void(
            "RemoveEnumAttributeAtIndex",

            LLVMValueRef("F"),
            LLVMAttributeIndex("Idx"),
            unsigned_int("KindID")
        )

        void(
            "RemoveStringAttributeAtIndex",

            LLVMValueRef("F"),
            LLVMAttributeIndex("Idx"),
            charUTF8.const.p("K"),
            AutoSize("K")..unsigned_int("KLen")
        )

        void(
            "AddTargetDependentFunctionAttr",

            LLVMValueRef("Fn"),
            charUTF8.const.p("A"),
            charUTF8.const.p("V")
        )

        unsigned_int(
            "CountParams",

            LLVMValueRef("Fn")
        )

        void(
            "GetParams",

            LLVMValueRef("Fn"),
            Check(
                "LLVMCountParams(Fn)", debug = true
            )..LLVMValueRef.p("Params")
        )

        LLVMValueRef(
            "GetParam",

            LLVMValueRef("Fn"),
            unsigned_int("Index")
        )

        LLVMValueRef(
            "GetParamParent",

            LLVMValueRef("Inst")
        )

        LLVMValueRef(
            "GetFirstParam",

            LLVMValueRef("Fn")
        )

        LLVMValueRef(
            "GetLastParam",

            LLVMValueRef("Fn")
        )

        LLVMValueRef(
            "GetNextParam",

            LLVMValueRef("Arg")
        )

        LLVMValueRef(
            "GetPreviousParam",

            LLVMValueRef("Arg")
        )

        void(
            "SetParamAlignment",

            LLVMValueRef("Arg"),
            unsigned_int("Align")
        )

        IgnoreMissing..LLVMValueRef(
            "AddGlobalIFunc",

            LLVMModuleRef("M"),
            charUTF8.const.p("Name"),
            AutoSize("Name")..size_t("NameLen"),
            LLVMTypeRef("Ty"),
            unsigned("AddrSpace"),
            LLVMValueRef("Resolver")
        )

        IgnoreMissing..LLVMValueRef(
            "GetNamedGlobalIFunc",

            LLVMModuleRef("M"),
            charUTF8.const.p("Name"),
            AutoSize("Name")..size_t("NameLen")
        )

        IgnoreMissing..LLVMValueRef(
            "GetFirstGlobalIFunc",

            LLVMModuleRef("M")
        )

        IgnoreMissing..LLVMValueRef(
            "GetLastGlobalIFunc",

            LLVMModuleRef("M")
        )

        IgnoreMissing..LLVMValueRef(
            "GetNextGlobalIFunc",

            LLVMValueRef("IFunc")
        )

        IgnoreMissing..LLVMValueRef(
            "GetPreviousGlobalIFunc",

            LLVMValueRef("IFunc")
        )

        IgnoreMissing..LLVMValueRef(
            "GetGlobalIFuncResolver",

            LLVMValueRef("IFunc")
        )

        IgnoreMissing..void(
            "SetGlobalIFuncResolver",

            LLVMValueRef("IFunc"),
            LLVMValueRef("Resolver")
        )

        IgnoreMissing..void(
            "EraseGlobalIFunc",

            LLVMValueRef("IFunc")
        )

        IgnoreMissing..void(
            "RemoveGlobalIFunc",

            LLVMValueRef("IFunc")
        )

        IgnoreMissing..LLVMMetadataRef(
            "MDStringInContext2",

            LLVMContextRef("C"),
            charUTF8.const.p("Str"),
            AutoSize("Str")..size_t("SLen")
        )

        IgnoreMissing..LLVMMetadataRef(
            "MDNodeInContext2",

            LLVMContextRef("C"),
            LLVMMetadataRef.p("MDs"),
            AutoSize("MDs")..size_t("Count")
        )

        LLVMValueRef(
            "MDStringInContext",

            LLVMContextRef("C"),
            charUTF8.const.p("Str"),
            AutoSize("Str")..unsigned_int("SLen")
        )

        LLVMValueRef(
            "MDString",

            charUTF8.const.p("Str"),
            AutoSize("Str")..unsigned_int("SLen")
        )

        LLVMValueRef(
            "MDNodeInContext",

            LLVMContextRef("C"),
            LLVMValueRef.p("Vals"),
            AutoSize("Vals")..unsigned_int("Count")
        )

        LLVMValueRef(
            "MDNode",

            LLVMValueRef.p("Vals"),
            AutoSize("Vals")..unsigned_int("Count")
        )

        IgnoreMissing..LLVMOperandBundleRef(
            "CreateOperandBundle",

            charUTF8.const.p("Tag"),
            AutoSize("Tag")..size_t("TagLen"),
            LLVMValueRef.p("Args"),
            AutoSize("Args")..unsigned("NumArgs")
        )

        IgnoreMissing..void(
            "DisposeOperandBundle",

            LLVMOperandBundleRef("Bundle")
        )

        IgnoreMissing..charUTF8.const.p(
            "GetOperandBundleTag",

            LLVMOperandBundleRef("Bundle"),
            AutoSizeResult..size_t.p("Len")
        )

        IgnoreMissing..unsigned(
            "GetNumOperandBundleArgs",

            LLVMOperandBundleRef("Bundle")
        )

        IgnoreMissing..LLVMValueRef(
            "GetOperandBundleArgAtIndex",

            LLVMOperandBundleRef("Bundle"),
            unsigned("Index")
        )

        LLVMValueRef(
            "MetadataAsValue",

            LLVMContextRef("C"),
            LLVMMetadataRef("MD")
        )

        LLVMMetadataRef(
            "ValueAsMetadata",

            LLVMValueRef("Val")
        )

        charUTF8.const.p(
            "GetMDString",

            LLVMValueRef("V"),
            AutoSizeResult..unsigned_int.p("Length")
        )

        unsigned_int(
            "GetMDNodeNumOperands",

            LLVMValueRef("V")
        )

        void(
            "GetMDNodeOperands",

            LLVMValueRef("V"),
            Check(
                "LLVMGetMDNodeNumOperands(V)", debug = true
            )..LLVMValueRef.p("Dest")
        )

        void(
            "ReplaceMDNodeOperandWith",

            LLVMValueRef("V"),
            unsigned_int("Index"),
            nullable..LLVMMetadataRef("Replacement")
        )

        LLVMValueRef(
            "BasicBlockAsValue",

            LLVMBasicBlockRef("BB")
        )

        LLVMBool(
            "ValueIsBasicBlock",

            LLVMValueRef("Val")
        )

        LLVMBasicBlockRef(
            "ValueAsBasicBlock",

            LLVMValueRef("Val")
        )

        Nonnull..charUTF8.const.p(
            "GetBasicBlockName",

            LLVMBasicBlockRef("BB")
        )

        LLVMValueRef(
            "GetBasicBlockParent",

            LLVMBasicBlockRef("BB")
        )

        LLVMValueRef(
            "GetBasicBlockTerminator",

            LLVMBasicBlockRef("BB")
        )

        unsigned_int(
            "CountBasicBlocks",

            LLVMValueRef("Fn")
        )

        void(
            "GetBasicBlocks",

            LLVMValueRef("Fn"),
            Check(
                "LLVMCountBasicBlocks(Fn)", debug = true
            )..LLVMBasicBlockRef.p("BasicBlocks")
        )

        LLVMBasicBlockRef(
            "GetFirstBasicBlock",

            LLVMValueRef("Fn")
        )

        LLVMBasicBlockRef(
            "GetLastBasicBlock",

            LLVMValueRef("Fn")
        )

        LLVMBasicBlockRef(
            "GetNextBasicBlock",

            LLVMBasicBlockRef("BB")
        )

        LLVMBasicBlockRef(
            "GetPreviousBasicBlock",

            LLVMBasicBlockRef("BB")
        )

        LLVMBasicBlockRef(
            "GetEntryBasicBlock",

            LLVMValueRef("Fn")
        )

        IgnoreMissing..void(
            "InsertExistingBasicBlockAfterInsertBlock",

            LLVMBuilderRef("Builder"),
            LLVMBasicBlockRef("BB")
        )

        IgnoreMissing..void(
            "AppendExistingBasicBlock",

            LLVMValueRef("Fn"),
            LLVMBasicBlockRef("BB")
        )

        IgnoreMissing..LLVMBasicBlockRef(
            "CreateBasicBlockInContext",

            LLVMContextRef("C"),
            charUTF8.const.p("Name")
        )

        LLVMBasicBlockRef(
            "AppendBasicBlockInContext",

            LLVMContextRef("C"),
            LLVMValueRef("Fn"),
            charUTF8.const.p("Name")
        )

        LLVMBasicBlockRef(
            "AppendBasicBlock",

            LLVMValueRef("Fn"),
            charUTF8.const.p("Name")
        )

        LLVMBasicBlockRef(
            "InsertBasicBlockInContext",

            LLVMContextRef("C"),
            LLVMBasicBlockRef("BB"),
            charUTF8.const.p("Name")
        )

        LLVMBasicBlockRef(
            "InsertBasicBlock",

            LLVMBasicBlockRef("InsertBeforeBB"),
            charUTF8.const.p("Name")
        )

        void(
            "DeleteBasicBlock",

            LLVMBasicBlockRef("BB")
        )

        void(
            "RemoveBasicBlockFromParent",

            LLVMBasicBlockRef("BB")
        )

        void(
            "MoveBasicBlockBefore",

            LLVMBasicBlockRef("BB"),
            LLVMBasicBlockRef("MovePos")
        )

        void(
            "MoveBasicBlockAfter",

            LLVMBasicBlockRef("BB"),
            LLVMBasicBlockRef("MovePos")
        )

        LLVMValueRef(
            "GetFirstInstruction",

            LLVMBasicBlockRef("BB")
        )

        LLVMValueRef(
            "GetLastInstruction",

            LLVMBasicBlockRef("BB")
        )

        intb(
            "HasMetadata",

            LLVMValueRef("Val")
        )

        LLVMValueRef(
            "GetMetadata",

            LLVMValueRef("Val"),
            unsigned_int("KindID")
        )

        void(
            "SetMetadata",

            LLVMValueRef("Val"),
            unsigned_int("KindID"),
            LLVMValueRef("Node")
        )

        IgnoreMissing..LLVMValueMetadataEntry.p(
            "InstructionGetAllMetadataOtherThanDebugLoc",

            LLVMValueRef("Instr"),
            Check(1)..size_t.p("NumEntries")
        )

        LLVMBasicBlockRef(
            "GetInstructionParent",

            LLVMValueRef("Inst")
        )

        LLVMValueRef(
            "GetNextInstruction",

            LLVMValueRef("Inst")
        )

        LLVMValueRef(
            "GetPreviousInstruction",

            LLVMValueRef("Inst")
        )

        void(
            "InstructionRemoveFromParent",

            LLVMValueRef("Inst")
        )

        void(
            "InstructionEraseFromParent",

            LLVMValueRef("Inst")
        )

        IgnoreMissing..void(
            "DeleteInstruction",

            LLVMValueRef("Inst")
        )

        LLVMOpcode(
            "GetInstructionOpcode",

            LLVMValueRef("Inst")
        )

        LLVMIntPredicate(
            "GetICmpPredicate",

            LLVMValueRef("Inst")
        )

        LLVMRealPredicate(
            "GetFCmpPredicate",

            LLVMValueRef("Inst")
        )

        LLVMValueRef(
            "InstructionClone",

            LLVMValueRef("Inst")
        )

        LLVMValueRef(
            "IsATerminatorInst",

            LLVMValueRef("Inst")
        )

        IgnoreMissing..LLVMDbgRecordRef("GetFirstDbgRecord", LLVMValueRef("Inst"))
        IgnoreMissing..LLVMDbgRecordRef("GetLastDbgRecord",  LLVMValueRef("Inst"))

        IgnoreMissing..LLVMDbgRecordRef("GetNextDbgRecord",     LLVMDbgRecordRef("DbgRecord"))
        IgnoreMissing..LLVMDbgRecordRef("GetPreviousDbgRecord", LLVMDbgRecordRef("DbgRecord"))

        unsigned_int(
            "GetNumArgOperands",

            LLVMValueRef("Instr")
        )

        void(
            "SetInstructionCallConv",

            LLVMValueRef("Instr"),
            unsigned_int("CC")
        )

        unsigned_int(
            "GetInstructionCallConv",

            LLVMValueRef("Instr")
        )

        void(
            "SetInstrParamAlignment",

            LLVMValueRef("Instr"),
            LLVMAttributeIndex("index"),
            unsigned_int("Align")
        )

        void(
            "AddCallSiteAttribute",

            LLVMValueRef("C"),
            LLVMAttributeIndex("Idx"),
            LLVMAttributeRef("A")
        )

        unsigned_int(
            "GetCallSiteAttributeCount",

            LLVMValueRef("C"),
            LLVMAttributeIndex("Idx")
        )

        void(
            "GetCallSiteAttributes",

            LLVMValueRef("C"),
            LLVMAttributeIndex("Idx"),
            Check(
                "LLVMGetCallSiteAttributeCount(C, Idx)", debug = true
            )..LLVMAttributeRef.p("Attrs")
        )

        LLVMAttributeRef(
            "GetCallSiteEnumAttribute",

            LLVMValueRef("C"),
            LLVMAttributeIndex("Idx"),
            unsigned_int("KindID")
        )

        LLVMAttributeRef(
            "GetCallSiteStringAttribute",

            LLVMValueRef("C"),
            LLVMAttributeIndex("Idx"),
            charUTF8.const.p("K"),
            AutoSize("K")..unsigned_int("KLen")
        )

        void(
            "RemoveCallSiteEnumAttribute",

            LLVMValueRef("C"),
            LLVMAttributeIndex("Idx"),
            unsigned_int("KindID")
        )

        void(
            "RemoveCallSiteStringAttribute",

            LLVMValueRef("C"),
            LLVMAttributeIndex("Idx"),
            charUTF8.const.p("K"),
            AutoSize("K")..unsigned_int("KLen")
        )

        IgnoreMissing..LLVMTypeRef(
            "GetCalledFunctionType",

            LLVMValueRef("C")
        )

        LLVMValueRef(
            "GetCalledValue",

            LLVMValueRef("Instr")
        )

        IgnoreMissing..unsigned(
            "GetNumOperandBundles",

            LLVMValueRef("C")
        )

        IgnoreMissing..LLVMOperandBundleRef(
            "GetOperandBundleAtIndex",

            LLVMValueRef("C"),
            unsigned("Index")
        )

        LLVMBool(
            "IsTailCall",

            LLVMValueRef("CallInst")
        )

        void(
            "SetTailCall",

            LLVMValueRef("CallInst"),
            LLVMBool("IsTailCall")
        )

        IgnoreMissing..LLVMTailCallKind(
            "GetTailCallKind",

            LLVMValueRef("CallInst")
        )

        IgnoreMissing..void(
            "SetTailCallKind",

            LLVMValueRef("CallInst"),
            LLVMTailCallKind("kind")
        )

        LLVMBasicBlockRef(
            "GetNormalDest",

            LLVMValueRef("InvokeInst")
        )

        LLVMBasicBlockRef(
            "GetUnwindDest",

            LLVMValueRef("InvokeInst")
        )

        void(
            "SetNormalDest",

            LLVMValueRef("InvokeInst"),
            LLVMBasicBlockRef("B")
        )

        void(
            "SetUnwindDest",

            LLVMValueRef("InvokeInst"),
            LLVMBasicBlockRef("B")
        )

        IgnoreMissing..LLVMBasicBlockRef(
            "GetCallBrDefaultDest",

            LLVMValueRef("CallBr")
        )

        IgnoreMissing..unsigned(
            "GetCallBrNumIndirectDests",

            LLVMValueRef("CallBr")
        )

        IgnoreMissing..LLVMBasicBlockRef(
            "GetCallBrIndirectDest",

            LLVMValueRef("CallBr"),
            unsigned("Idx")
        )

        unsigned_int(
            "GetNumSuccessors",

            LLVMValueRef("Term")
        )

        LLVMBasicBlockRef(
            "GetSuccessor",

            LLVMValueRef("Term"),
            unsigned_int("i")
        )

        void(
            "SetSuccessor",

            LLVMValueRef("Term"),
            unsigned_int("i"),
            LLVMBasicBlockRef("block")
        )

        LLVMBool(
            "IsConditional",

            LLVMValueRef("Branch")
        )

        LLVMValueRef(
            "GetCondition",

            LLVMValueRef("Branch")
        )

        void(
            "SetCondition",

            LLVMValueRef("Branch"),
            LLVMValueRef("Cond")
        )

        LLVMBasicBlockRef(
            "GetSwitchDefaultDest",

            LLVMValueRef("SwitchInstr")
        )

        LLVMTypeRef(
            "GetAllocatedType",

            LLVMValueRef("Alloca")
        )

        LLVMBool(
            "IsInBounds",

            LLVMValueRef("GEP")
        )

        void(
            "SetIsInBounds",

            LLVMValueRef("GEP"),
            LLVMBool("InBounds")
        )

        IgnoreMissing..LLVMTypeRef(
            "GetGEPSourceElementType",

            LLVMValueRef("GEP")
        )

        IgnoreMissing..LLVMGEPNoWrapFlags(
            "GEPGetNoWrapFlags",

            LLVMValueRef("GEP")
        )

        IgnoreMissing..void(
            "GEPSetNoWrapFlags",

            LLVMValueRef("GEP"),
            LLVMGEPNoWrapFlags("NoWrapFlags")
        )

        void(
            "AddIncoming",

            LLVMValueRef("PhiNode"),
            LLVMValueRef.p("IncomingValues"),
            LLVMBasicBlockRef.p("IncomingBlocks"),
            AutoSize("IncomingValues", "IncomingBlocks")..unsigned_int("Count")
        )

        unsigned_int(
            "CountIncoming",

            LLVMValueRef("PhiNode")
        )

        LLVMValueRef(
            "GetIncomingValue",

            LLVMValueRef("PhiNode"),
            unsigned_int("Index")
        )

        LLVMBasicBlockRef(
            "GetIncomingBlock",

            LLVMValueRef("PhiNode"),
            unsigned_int("Index")
        )

        unsigned_int(
            "GetNumIndices",

            LLVMValueRef("Inst")
        )

        Nonnull..unsigned_int.const.p(
            "GetIndices",

            LLVMValueRef("Inst"),
            AutoSizeResult..Virtual..unsigned_int("Count")
        )

        LLVMBuilderRef(
            "CreateBuilderInContext",

            LLVMContextRef("C")
        )
        LLVMBuilderRef("CreateBuilder", void())

        void(
            "PositionBuilder",

            LLVMBuilderRef("Builder"),
            LLVMBasicBlockRef("Block"),
            nullable..LLVMValueRef("Instr")
        )

        IgnoreMissing..void(
            "PositionBuilderBeforeDbgRecords",

            LLVMBuilderRef("Builder"),
            LLVMBasicBlockRef("Block"),
            nullable..LLVMValueRef("Instr")
        )

        void(
            "PositionBuilderBefore",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Instr")
        )

        IgnoreMissing..void(
            "PositionBuilderBeforeInstrAndDbgRecords",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Instr")
        )

        void(
            "PositionBuilderAtEnd",

            LLVMBuilderRef("Builder"),
            LLVMBasicBlockRef("Block")
        )

        LLVMBasicBlockRef(
            "GetInsertBlock",

            LLVMBuilderRef("Builder")
        )

        void(
            "ClearInsertionPosition",

            LLVMBuilderRef("Builder")
        )

        void(
            "InsertIntoBuilder",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Instr")
        )

        void(
            "InsertIntoBuilderWithName",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Instr"),
            charUTF8.const.p("Name")
        )

        void(
            "DisposeBuilder",

            LLVMBuilderRef("Builder")
        )

        IgnoreMissing..LLVMMetadataRef(
            "GetCurrentDebugLocation2",

            LLVMBuilderRef("Builder")
        )

        IgnoreMissing..void(
            "SetCurrentDebugLocation2",

            LLVMBuilderRef("Builder"),
            nullable..LLVMMetadataRef("Loc")
        )

        IgnoreMissing..void(
            "SetInstDebugLocation",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Inst")
        )

        IgnoreMissing..void(
            "AddMetadataToInst",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Inst")
        )

        IgnoreMissing..LLVMMetadataRef(
            "BuilderGetDefaultFPMathTag",

            LLVMBuilderRef("Builder")
        )

        IgnoreMissing..void(
            "BuilderSetDefaultFPMathTag",

            LLVMBuilderRef("Builder"),
            nullable..LLVMMetadataRef("FPMathTag")
        )

        IgnoreMissing..LLVMContextRef(
            "GetBuilderContext",

            LLVMBuilderRef("Builder")
        )

        void(
            "SetCurrentDebugLocation",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("L")
        )

        LLVMValueRef(
            "GetCurrentDebugLocation",

            LLVMBuilderRef("Builder")
        )

        LLVMValueRef(
            "BuildRetVoid",

            LLVMBuilderRef("Builder")
        )

        LLVMValueRef(
            "BuildRet",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("V")
        )

        LLVMValueRef(
            "BuildAggregateRet",

            LLVMBuilderRef("Builder"),
            LLVMValueRef.p("RetVals"),
            AutoSize("RetVals")..unsigned_int("N")
        )

        LLVMValueRef(
            "BuildBr",

            LLVMBuilderRef("Builder"),
            LLVMBasicBlockRef("Dest")
        )

        LLVMValueRef(
            "BuildCondBr",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("If"),
            LLVMBasicBlockRef("Then"),
            LLVMBasicBlockRef("Else")
        )

        LLVMValueRef(
            "BuildSwitch",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("V"),
            LLVMBasicBlockRef("Else"),
            unsigned_int("NumCases")
        )

        LLVMValueRef(
            "BuildIndirectBr",

            LLVMBuilderRef("B"),
            LLVMValueRef("Addr"),
            unsigned_int("NumDests")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildCallBr",

            LLVMBuilderRef("B"),
            LLVMTypeRef("Ty"),
            LLVMValueRef("Fn"),
            LLVMBasicBlockRef("DefaultDest"),
            LLVMBasicBlockRef.p("IndirectDests"),
            AutoSize("IndirectDests")..unsigned("NumIndirectDests"),
            LLVMValueRef.p("Args"),
            AutoSize("Args")..unsigned("NumArgs"),
            LLVMOperandBundleRef.p("Bundles"),
            AutoSize("Bundles")..unsigned("NumBundles"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildInvoke",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Fn"),
            LLVMValueRef.p("Args"),
            AutoSize("Args")..unsigned_int("NumArgs"),
            LLVMBasicBlockRef("Then"),
            LLVMBasicBlockRef("Catch"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildInvoke2",

            LLVMBuilderRef("Builder"),
            LLVMTypeRef("Ty"),
            LLVMValueRef("Fn"),
            LLVMValueRef.p("Args"),
            AutoSize("Args")..unsigned_int("NumArgs"),
            LLVMBasicBlockRef("Then"),
            LLVMBasicBlockRef("Catch"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildInvokeWithOperandBundles",

            LLVMBuilderRef("Builder"),
            LLVMTypeRef("Ty"),
            LLVMValueRef("Fn"),
            LLVMValueRef.p("Args"),
            AutoSize("Args")..unsigned("NumArgs"),
            LLVMBasicBlockRef("Then"),
            LLVMBasicBlockRef("Catch"),
            LLVMOperandBundleRef.p("Bundles"),
            AutoSize("Bundles")..unsigned("NumBundles"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildUnreachable",

            LLVMBuilderRef("Builder")
        )

        LLVMValueRef(
            "BuildResume",

            LLVMBuilderRef("B"),
            LLVMValueRef("Exn")
        )

        LLVMValueRef(
            "BuildLandingPad",

            LLVMBuilderRef("B"),
            LLVMTypeRef("Ty"),
            LLVMValueRef("PersFn"),
            unsigned_int("NumClauses"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildCleanupRet",

            LLVMBuilderRef("B"),
            LLVMValueRef("CatchPad"),
            LLVMBasicBlockRef("BB")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildCatchRet",

            LLVMBuilderRef("B"),
            LLVMValueRef("CatchPad"),
            LLVMBasicBlockRef("BB")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildCatchPad",

            LLVMBuilderRef("B"),
            LLVMValueRef("ParentPad"),
            LLVMValueRef.p("Args"),
            AutoSize("Args")..unsigned_int("NumArgs"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildCleanupPad",

            LLVMBuilderRef("B"),
            LLVMValueRef("ParentPad"),
            LLVMValueRef.p("Args"),
            AutoSize("Args")..unsigned_int("NumArgs"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildCatchSwitch",

            LLVMBuilderRef("B"),
            LLVMValueRef("ParentPad"),
            LLVMBasicBlockRef("UnwindBB"),
            unsigned_int("NumHandlers"),
            charUTF8.const.p("Name")
        )

        void(
            "AddCase",

            LLVMValueRef("Switch"),
            LLVMValueRef("OnVal"),
            LLVMBasicBlockRef("Dest")
        )

        void(
            "AddDestination",

            LLVMValueRef("IndirectBr"),
            LLVMBasicBlockRef("Dest")
        )

        unsigned_int(
            "GetNumClauses",

            LLVMValueRef("LandingPad")
        )

        LLVMValueRef(
            "GetClause",

            LLVMValueRef("LandingPad"),
            unsigned_int("Idx")
        )

        void(
            "AddClause",

            LLVMValueRef("LandingPad"),
            LLVMValueRef("ClauseVal")
        )

        LLVMBool(
            "IsCleanup",

            LLVMValueRef("LandingPad")
        )

        void(
            "SetCleanup",

            LLVMValueRef("LandingPad"),
            LLVMBool("Val")
        )

        IgnoreMissing..void(
            "AddHandler",

            LLVMValueRef("CatchSwitch"),
            LLVMBasicBlockRef("Dest")
        )

        IgnoreMissing..unsigned_int(
            "GetNumHandlers",

            LLVMValueRef("CatchSwitch")
        )

        IgnoreMissing..void(
            "GetHandlers",

            LLVMValueRef("CatchSwitch"),
            Check(
                "LLVMGetNumHandlers(CatchSwitch)", debug = true
            )..LLVMBasicBlockRef.p("Handlers")
        )

        IgnoreMissing..LLVMValueRef(
            "GetArgOperand",

            LLVMValueRef("Funclet"),
            unsigned_int("i")
        )

        IgnoreMissing..void(
            "SetArgOperand",

            LLVMValueRef("Funclet"),
            unsigned_int("i"),
            LLVMValueRef("value")
        )

        IgnoreMissing..LLVMValueRef(
            "GetParentCatchSwitch",

            LLVMValueRef("CatchPad")
        )

        IgnoreMissing..void(
            "SetParentCatchSwitch",

            LLVMValueRef("CatchPad"),
            LLVMValueRef("CatchSwitch")
        )

        LLVMValueRef(
            "BuildAdd",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildNSWAdd",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildNUWAdd",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildFAdd",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildSub",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildNSWSub",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildNUWSub",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildFSub",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildMul",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildNSWMul",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildNUWMul",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildFMul",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildUDiv",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildExactUDiv",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildSDiv",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildExactSDiv",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildFDiv",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildURem",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildSRem",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildFRem",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildShl",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildLShr",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildAShr",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildAnd",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildOr",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildXor",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildBinOp",

            LLVMBuilderRef("B"),
            LLVMOpcode("Op"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildNeg",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("V"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildNSWNeg",

            LLVMBuilderRef("B"),
            LLVMValueRef("V"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildNUWNeg",

            LLVMBuilderRef("B"),
            LLVMValueRef("V"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildFNeg",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("V"),
            charUTF8.const.p("Name")
        )

        LLVMBool("GetNUW", LLVMValueRef("ArithInst"))
        void("SetNUW", LLVMValueRef("ArithInst"), LLVMBool("HasNUW"))
        LLVMBool("GetNSW", LLVMValueRef("ArithInst"))
        void("SetNSW", LLVMValueRef("ArithInst"), LLVMBool("HasNSW"))
        LLVMBool("GetExact", LLVMValueRef("DivOrShrInst"))
        void("SetExact", LLVMValueRef("DivOrShrInst"), LLVMBool("IsExact"))

        IgnoreMissing..LLVMBool(
            "GetNNeg",

            LLVMValueRef("NonNegInst")
        )
        IgnoreMissing..void(
            "SetNNeg",

            LLVMValueRef("NonNegInst"),
            LLVMBool("IsNonNeg")
        )

        IgnoreMissing..LLVMFastMathFlags(
            "GetFastMathFlags",

            LLVMValueRef("FPMathInst")
        )
        IgnoreMissing..void(
            "SetFastMathFlags",

            LLVMValueRef("FPMathInst"),
            LLVMFastMathFlags("FMF")
        )

        IgnoreMissing..LLVMBool(
            "CanValueUseFastMathFlags",

            LLVMValueRef("Inst")
        )

        IgnoreMissing..LLVMBool(
            "GetIsDisjoint",

            LLVMValueRef("Inst")
        )
        IgnoreMissing..void(
            "SetIsDisjoint",

            LLVMValueRef("Inst"),
            LLVMBool("IsDisjoint")
        )

        LLVMValueRef(
            "BuildNot",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("V"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildMalloc",

            LLVMBuilderRef("Builder"),
            LLVMTypeRef("Ty"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildArrayMalloc",

            LLVMBuilderRef("Builder"),
            LLVMTypeRef("Ty"),
            LLVMValueRef("Val"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildMemSet",

            LLVMBuilderRef("B"),
            LLVMValueRef("Ptr"),
            LLVMValueRef("Val"),
            LLVMValueRef("Len"),
            unsigned("Align")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildMemCpy",

            LLVMBuilderRef("B"),
            LLVMValueRef("Dst"),
            unsigned("DstAlign"),
            LLVMValueRef("Src"),
            unsigned("SrcAlign"),
            LLVMValueRef("Size")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildMemMove",

            LLVMBuilderRef("B"),
            LLVMValueRef("Dst"),
            unsigned("DstAlign"),
            LLVMValueRef("Src"),
            unsigned("SrcAlign"),
            LLVMValueRef("Size")
        )

        LLVMValueRef(
            "BuildAlloca",

            LLVMBuilderRef("Builder"),
            LLVMTypeRef("Ty"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildArrayAlloca",

            LLVMBuilderRef("Builder"),
            LLVMTypeRef("Ty"),
            LLVMValueRef("Val"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildFree",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("PointerVal")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildLoad",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("PointerVal"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildLoad2",

            LLVMBuilderRef("Builder"),
            LLVMTypeRef("Ty"),
            LLVMValueRef("PointerVal"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildStore",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMValueRef("Ptr")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildGEP",

            LLVMBuilderRef("B"),
            LLVMValueRef("Pointer"),
            LLVMValueRef.p("Indices"),
            AutoSize("Indices")..unsigned_int("NumIndices"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildInBoundsGEP",

            LLVMBuilderRef("B"),
            LLVMValueRef("Pointer"),
            LLVMValueRef.p("Indices"),
            AutoSize("Indices")..unsigned_int("NumIndices"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildStructGEP",

            LLVMBuilderRef("B"),
            LLVMValueRef("Pointer"),
            unsigned_int("Idx"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildGEP2",

            LLVMBuilderRef("B"),
            LLVMTypeRef("Ty"),
            LLVMValueRef("Pointer"),
            LLVMValueRef.p("Indices"),
            AutoSize("Indices")..unsigned_int("NumIndices"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildInBoundsGEP2",

            LLVMBuilderRef("B"),
            LLVMTypeRef("Ty"),
            LLVMValueRef("Pointer"),
            LLVMValueRef.p("Indices"),
            AutoSize("Indices")..unsigned_int("NumIndices"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildGEPWithNoWrapFlags",

            LLVMBuilderRef("B"),
            LLVMTypeRef("Ty"),
            LLVMValueRef("Pointer"),
            LLVMValueRef.p("Indices"),
            AutoSize("Indices")..unsigned("NumIndices"),
            charUTF8.const.p("Name"),
            LLVMGEPNoWrapFlags("NoWrapFlags")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildStructGEP2",

            LLVMBuilderRef("B"),
            LLVMTypeRef("Ty"),
            LLVMValueRef("Pointer"),
            unsigned_int("Idx"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildGlobalString",

            LLVMBuilderRef("B"),
            charUTF8.const.p("Str"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildGlobalStringPtr",

            LLVMBuilderRef("B"),
            charUTF8.const.p("Str"),
            charUTF8.const.p("Name")
        )

        LLVMBool(
            "GetVolatile",

            LLVMValueRef("MemoryAccessInst")
        )

        void(
            "SetVolatile",

            LLVMValueRef("MemoryAccessInst"),
            LLVMBool("IsVolatile")
        )

        IgnoreMissing..LLVMBool(
            "GetWeak",

            LLVMValueRef("CmpXchgInst")
        )

        IgnoreMissing..void(
            "SetWeak",

            LLVMValueRef("CmpXchgInst"),
            LLVMBool("IsWeak")
        )

        LLVMAtomicOrdering(
            "GetOrdering",

            LLVMValueRef("MemoryAccessInst")
        )

        IgnoreMissing..void(
            "SetOrdering",

            LLVMValueRef("MemoryAccessInst"),
            LLVMAtomicOrdering("Ordering")
        )

        IgnoreMissing..LLVMAtomicRMWBinOp(
            "GetAtomicRMWBinOp",

            LLVMValueRef("AtomicRMWInst")
        )

        IgnoreMissing..void(
            "SetAtomicRMWBinOp",

            LLVMValueRef("AtomicRMWInst"),
            LLVMAtomicRMWBinOp("BinOp")
        )

        LLVMValueRef(
            "BuildTrunc",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildZExt",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildSExt",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildFPToUI",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildFPToSI",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildUIToFP",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildSIToFP",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildFPTrunc",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildFPExt",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildPtrToInt",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildIntToPtr",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildBitCast",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildAddrSpaceCast",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildZExtOrBitCast",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildSExtOrBitCast",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildTruncOrBitCast",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildCast",

            LLVMBuilderRef("B"),
            LLVMOpcode("Op"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildPointerCast",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildIntCast2",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            LLVMBool("IsSigned"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildIntCast",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMOpcode(
            "GetCastOpcode",

            LLVMValueRef("Src"),
            LLVMBool("SrcIsSigned"),
            LLVMTypeRef("DestTy"),
            LLVMBool("DestIsSigned")
        )


        LLVMValueRef(
            "BuildFPCast",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            LLVMTypeRef("DestTy"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildICmp",

            LLVMBuilderRef("Builder"),
            LLVMIntPredicate("Op"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildFCmp",

            LLVMBuilderRef("Builder"),
            LLVMRealPredicate("Op"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildPhi",

            LLVMBuilderRef("Builder"),
            LLVMTypeRef("Ty"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildCall",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Fn"),
            LLVMValueRef.p("Args"),
            AutoSize("Args")..unsigned_int("NumArgs"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildCall2",

            LLVMBuilderRef("Builder"),
            LLVMTypeRef("Ty"),
            LLVMValueRef("Fn"),
            LLVMValueRef.p("Args"),
            AutoSize("Args")..unsigned_int("NumArgs"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildCallWithOperandBundles",

            LLVMBuilderRef("Builder"),
            LLVMTypeRef("Ty"),
            LLVMValueRef("Fn"),
            LLVMValueRef.p("Args"),
            AutoSize("Args")..unsigned_int("NumArgs"),
            LLVMOperandBundleRef.p("Bundles"),
            AutoSize("Bundles")..unsigned("NumBundles"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildSelect",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("If"),
            LLVMValueRef("Then"),
            LLVMValueRef("Else"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildVAArg",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("List"),
            LLVMTypeRef("Ty"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildExtractElement",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("VecVal"),
            LLVMValueRef("Index"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildInsertElement",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("VecVal"),
            LLVMValueRef("EltVal"),
            LLVMValueRef("Index"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildShuffleVector",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("V1"),
            LLVMValueRef("V2"),
            LLVMValueRef("Mask"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildExtractValue",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("AggVal"),
            unsigned_int("Index"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildInsertValue",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("AggVal"),
            LLVMValueRef("EltVal"),
            unsigned_int("Index"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildFreeze",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildIsNull",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildIsNotNull",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("Val"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildPtrDiff",

            LLVMBuilderRef("Builder"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildPtrDiff2",

            LLVMBuilderRef("Builder"),
            LLVMTypeRef("ElemTy"),
            LLVMValueRef("LHS"),
            LLVMValueRef("RHS"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildFence",

            LLVMBuilderRef("B"),
            LLVMAtomicOrdering("ordering"),
            LLVMBool("singleThread"),
            charUTF8.const.p("Name")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildFenceSyncScope",

            LLVMBuilderRef("B"),
            LLVMAtomicOrdering("ordering"),
            unsigned("SSID"),
            charUTF8.const.p("Name")
        )

        LLVMValueRef(
            "BuildAtomicRMW",

            LLVMBuilderRef("B"),
            LLVMAtomicRMWBinOp("op"),
            LLVMValueRef("PTR"),
            LLVMValueRef("Val"),
            LLVMAtomicOrdering("ordering"),
            LLVMBool("singleThread")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildAtomicRMWSyncScope",

            LLVMBuilderRef("B"),
            LLVMAtomicRMWBinOp("op"),
            LLVMValueRef("PTR"),
            LLVMValueRef("Val"),
            LLVMAtomicOrdering("ordering"),
            unsigned("SSID")
        )

        LLVMValueRef(
            "BuildAtomicCmpXchg",

            LLVMBuilderRef("B"),
            LLVMValueRef("Ptr"),
            LLVMValueRef("Cmp"),
            LLVMValueRef("New"),
            LLVMAtomicOrdering("SuccessOrdering"),
            LLVMAtomicOrdering("FailureOrdering"),
            LLVMBool("SingleThread")
        )

        IgnoreMissing..LLVMValueRef(
            "BuildAtomicCmpXchgSyncScope",

            LLVMBuilderRef("B"),
            LLVMValueRef("Ptr"),
            LLVMValueRef("Cmp"),
            LLVMValueRef("New"),
            LLVMAtomicOrdering("SuccessOrdering"),
            LLVMAtomicOrdering("FailureOrdering"),
            unsigned("SSID")
        )

        IgnoreMissing..unsigned(
            "GetNumMaskElements",

            LLVMValueRef("ShuffleVectorInst")
        )

        IgnoreMissing..int(
            "GetUndefMaskElem",

            void()
        )

        IgnoreMissing..int(
            "GetMaskValue",

            LLVMValueRef("ShuffleVectorInst"),
            unsigned("Elt")
        )

        LLVMBool(
            "IsAtomicSingleThread",

            LLVMValueRef("AtomicInst")
        )

        void(
            "SetAtomicSingleThread",

            LLVMValueRef("AtomicInst"),
            LLVMBool("SingleThread")
        )

        IgnoreMissing..LLVMBool(
            "IsAtomic",

            LLVMValueRef("Inst")
        )

        IgnoreMissing..unsigned(
            "GetAtomicSyncScopeID",

            LLVMValueRef("AtomicInst")
        )

        IgnoreMissing..void(
            "SetAtomicSyncScopeID",

            LLVMValueRef("AtomicInst"),
            unsigned("SSID")
        )

        LLVMAtomicOrdering(
            "GetCmpXchgSuccessOrdering",

            LLVMValueRef("CmpXchgInst")
        )

        void(
            "SetCmpXchgSuccessOrdering",

            LLVMValueRef("CmpXchgInst"),
            LLVMAtomicOrdering("Ordering")
        )

        LLVMAtomicOrdering(
            "GetCmpXchgFailureOrdering",

            LLVMValueRef("CmpXchgInst")
        )

        void(
            "SetCmpXchgFailureOrdering",

            LLVMValueRef("CmpXchgInst"),
            LLVMAtomicOrdering("Ordering")
        )

        LLVMModuleProviderRef(
            "CreateModuleProviderForExistingModule",

            LLVMModuleRef("M")
        )

        void(
            "DisposeModuleProvider",

            LLVMModuleProviderRef("M")
        )

        LLVMBool(
            "CreateMemoryBufferWithContentsOfFile",

            charUTF8.const.p("Path"),
            Check(1)..LLVMMemoryBufferRef.p("OutMemBuf"),
            Check(1)..charUTF8.p.p("OutMessage")
        )

        LLVMBool(
            "CreateMemoryBufferWithSTDIN",

            Check(1)..LLVMMemoryBufferRef.p("OutMemBuf"),
            Check(1)..charUTF8.p.p("OutMessage")
        )

        LLVMMemoryBufferRef(
            "CreateMemoryBufferWithMemoryRange",

            char.const.p("InputData"),
            AutoSize("InputData")..size_t("InputDataLength"),
            charUTF8.const.p("BufferName"),
            LLVMBool("RequiresNullTerminator")
        )

        LLVMMemoryBufferRef(
            "CreateMemoryBufferWithMemoryRangeCopy",

            char.const.p("InputData"),
            AutoSize("InputData")..size_t("InputDataLength"),
            charUTF8.const.p("BufferName")
        )

        MapPointer("LLVMGetBufferSize(MemBuf)")..char.const.p(
            "GetBufferStart",

            LLVMMemoryBufferRef("MemBuf")
        )

        size_t(
            "GetBufferSize",

            LLVMMemoryBufferRef("MemBuf")
        )

        void(
            "DisposeMemoryBuffer",

            LLVMMemoryBufferRef("MemBuf")
        )

        IgnoreMissing..LLVMPassRegistryRef(
            "GetGlobalPassRegistry",

            void()
        )

        LLVMPassManagerRef(
            "CreatePassManager",

            void()
        )

        LLVMPassManagerRef(
            "CreateFunctionPassManagerForModule",

            LLVMModuleRef("M")
        )

        LLVMPassManagerRef(
            "CreateFunctionPassManager",

            LLVMModuleProviderRef("MP")
        )

        LLVMBool(
            "RunPassManager",

            LLVMPassManagerRef("PM"),
            LLVMModuleRef("M")
        )

        LLVMBool(
            "InitializeFunctionPassManager",

            LLVMPassManagerRef("FPM")
        )

        LLVMBool(
            "RunFunctionPassManager",

            LLVMPassManagerRef("FPM"),
            LLVMValueRef("F")
        )

        LLVMBool(
            "FinalizeFunctionPassManager",

            LLVMPassManagerRef("FPM")
        )

        void(
            "DisposePassManager",

            LLVMPassManagerRef("PM")
        )

        LLVMBool(
            "StartMultithreaded",

            void()
        )

        void(
            "StopMultithreaded",

            void()
        )

        LLVMBool("IsMultithreaded", void())
    }
}