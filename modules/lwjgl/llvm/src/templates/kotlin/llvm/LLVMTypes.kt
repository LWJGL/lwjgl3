/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm

import org.lwjgl.generator.*

val LLVM_BINDING = simpleBinding(Module.LLVM, libraryName = "LLVM", libraryExpression = "Configuration.LLVM_LIBRARY_NAME, \"LLVM\", \"LLVM-C\"")
val LLVM_BINDING_DELEGATE = LLVM_BINDING.delegate("LLVMCore.getLibrary()")

val LLVMAttributeRef = "LLVMAttributeRef".handle
val LLVMBasicBlockRef = "LLVMBasicBlockRef".handle
val LLVMBinaryRef = "LLVMBinaryRef".handle
val LLVMBuilderRef = "LLVMBuilderRef".handle
val LLVMComdatRef = "LLVMComdatRef".handle
val LLVMContextRef = "LLVMContextRef".handle
val LLVMDbgRecordRef = "LLVMDbgRecordRef".handle
val LLVMDIBuilderRef = "LLVMDIBuilderRef".handle
val LLVMDiagnosticInfoRef = "LLVMDiagnosticInfoRef".handle
val LLVMDisasmContextRef = "LLVMDisasmContextRef".handle
val LLVMErrorRef = "LLVMErrorRef".handle
val LLVMErrorTypeId = "LLVMErrorTypeId".handle
val LLVMExecutionEngineRef = "LLVMExecutionEngineRef".handle
val LLVMGenericValueRef = "LLVMGenericValueRef".handle
val LLVMJITEventListenerRef = "LLVMJITEventListenerRef".handle
val LLVMMCJITMemoryManagerRef = "LLVMMCJITMemoryManagerRef".handle
val LLVMMemoryBufferRef = "LLVMMemoryBufferRef".handle
val LLVMMetadataRef = "LLVMMetadataRef".handle
val LLVMModuleProviderRef = "LLVMModuleProviderRef".handle
val LLVMModuleRef = "LLVMModuleRef".handle
val LLVMNamedMDNodeRef = "LLVMNamedMDNodeRef".handle
val LLVMObjectFileRef = "LLVMObjectFileRef".handle
val LLVMOperandBundleRef = "LLVMOperandBundleRef".handle
val LLVMPassManagerRef = "LLVMPassManagerRef".handle
val LLVMPassBuilderOptionsRef = "LLVMPassBuilderOptionsRef".handle
val LLVMPassManagerBuilderRef = "LLVMPassManagerBuilderRef".handle
val LLVMPassRegistryRef = "LLVMPassRegistryRef".handle
val LLVMRelocationIteratorRef = "LLVMRelocationIteratorRef".handle
val LLVMRemarkArgRef = "LLVMRemarkArgRef".handle
val LLVMRemarkDebugLocRef = "LLVMRemarkDebugLocRef".handle
val LLVMRemarkEntryRef = "LLVMRemarkEntryRef".handle
val LLVMRemarkParserRef = "LLVMRemarkParserRef".handle
val LLVMRemarkStringRef = "LLVMRemarkStringRef".handle
val LLVMSectionIteratorRef = "LLVMSectionIteratorRef".handle
val LLVMSymbolIteratorRef = "LLVMSymbolIteratorRef".handle
val LLVMTargetDataRef = "LLVMTargetDataRef".handle
val LLVMTargetLibraryInfoRef = "LLVMTargetLibraryInfoRef".handle
val LLVMTargetMachineRef = "LLVMTargetMachineRef".handle
val LLVMTargetMachineOptionsRef = "LLVMTargetMachineOptionsRef".handle
val LLVMTargetRef = "LLVMTargetRef".handle
val LLVMTypeRef = "LLVMTypeRef".handle
val LLVMUseRef = "LLVMUseRef".handle
val LLVMValueRef = "LLVMValueRef".handle

val lto_input_t = "lto_input_t".handle

val LLVMAttributeIndex = typedef(unsigned_int, "LLVMAttributeIndex")
val LLVMBool = typedef(intb, "LLVMBool")
val LLVMDWARFTypeEncoding = typedef(unsigned_int, "LLVMDWARFTypeEncoding")
val LLVMFastMathFlags = typedef(unsigned, "LLVMFastMathFlags")
val LLVMMetadataKind = typedef(unsigned_int, "LLVMMetadataKind")
val LLVMModuleFlagEntry = "LLVMModuleFlagEntry".opaque
val LLVMValueMetadataEntry = "LLVMValueMetadataEntry".opaque

val LLVMAtomicOrdering = "LLVMAtomicOrdering".enumType
val LLVMAtomicRMWBinOp = "LLVMAtomicRMWBinOp".enumType
val LLVMBinaryType = "LLVMBinaryType".enumType
val LLVMByteOrdering = "enum LLVMByteOrdering".enumType
val LLVMCodeGenFileType = "LLVMCodeGenFileType".enumType
val LLVMCodeGenOptLevel = "LLVMCodeGenOptLevel".enumType
val LLVMCodeModel = "LLVMCodeModel".enumType
val LLVMComdatSelectionKind = "LLVMComdatSelectionKind".enumType
val LLVMDIFlags = "LLVMDIFlags".enumType
val LLVMDLLStorageClass = "LLVMDLLStorageClass".enumType
val LLVMDiagnosticSeverity = "LLVMDiagnosticSeverity".enumType
val LLVMDWARFEmissionKind = "LLVMDWARFEmissionKind".enumType
val LLVMDWARFMacinfoRecordType = "LLVMDWARFMacinfoRecordType".enumType
val LLVMDWARFSourceLanguage = "LLVMDWARFSourceLanguage".enumType
val LLVMGEPNoWrapFlags = "LLVMGEPNoWrapFlags".enumType
val LLVMGlobalISelAbortMode = "LLVMGlobalISelAbortMode".enumType
val LLVMInlineAsmDialect = "LLVMInlineAsmDialect".enumType
val LLVMIntPredicate = "LLVMIntPredicate".enumType
val LLVMLinkage = "LLVMLinkage".enumType
val LLVMModuleFlagBehavior = "LLVMModuleFlagBehavior".enumType
val LLVMOpcode = "LLVMOpcode".enumType
val LLVMRealPredicate = "LLVMRealPredicate".enumType
val LLVMRelocMode = "LLVMRelocMode".enumType
val LLVMRemarkType = "enum LLVMRemarkType".enumType
val LLVMTailCallKind = "LLVMTailCallKind".enumType
val LLVMThreadLocalMode = "LLVMThreadLocalMode".enumType
val LLVMTypeKind = "LLVMTypeKind".enumType
val LLVMUnnamedAddr = "LLVMUnnamedAddr".enumType
val LLVMValueKind = "LLVMValueKind".enumType
val LLVMVerifierFailureAction = "LLVMVerifierFailureAction".enumType
val LLVMVisibility = "LLVMVisibility".enumType

val LLVMFatalErrorHandler = Module.LLVM.callback {
    void(
        "LLVMFatalErrorHandler",
        "",

        charUTF8.const.p("Reason", "")
    ) {
        documentation = "Instances of this interface may be passed to the #InstallFatalErrorHandler() method."
    }
}

val LLVMDiagnosticHandler = Module.LLVM.callback {
    void(
        "LLVMDiagnosticHandler",
        "",

        LLVMDiagnosticInfoRef("DiagnosticInfo", ""),
        opaque_p("DiagnosticContext", "")
    ) {
        documentation = "Instances of this interface may be passed to the #ContextSetDiagnosticHandler() method."
    }
}

val LLVMYieldCallback = Module.LLVM.callback {
    void(
        "LLVMYieldCallback",
        "",

        LLVMContextRef("Context", ""),
        opaque_p("OpaqueHandle", "")
    ) {
        documentation = "Instances of this interface may be passed to the #ContextSetYieldCallback() method."
    }
}

val LLVMMemoryManagerAllocateCodeSectionCallback = Module.LLVM.callback {
    uint8_t.p(
        "LLVMMemoryManagerAllocateCodeSectionCallback",
        "",

        opaque_p("Opaque", ""),
        uintptr_t("Size", ""),
        unsigned_int("Alignment", ""),
        unsigned_int("SectionID", ""),
        charUTF8.const.p("SectionName", "")
    ) {
        documentation = "Instances of this interface may be passed to the #CreateSimpleMCJITMemoryManager() method."
    }
}

val LLVMMemoryManagerAllocateDataSectionCallback = Module.LLVM.callback {
    uint8_t.p(
        "LLVMMemoryManagerAllocateDataSectionCallback",
        "",

        opaque_p("Opaque", ""),
        uintptr_t("Size", ""),
        unsigned_int("Alignment", ""),
        unsigned_int("SectionID", ""),
        charUTF8.const.p("SectionName", ""),
        LLVMBool("IsReadOnly", "")
    ) {
        documentation = "Instances of this interface may be passed to the #CreateSimpleMCJITMemoryManager() method."
    }
}

val LLVMMemoryManagerFinalizeMemoryCallback = Module.LLVM.callback {
    LLVMBool(
        "LLVMMemoryManagerFinalizeMemoryCallback",
        "",

        opaque_p("Opaque", ""),
        Check(1)..charUTF8.p.p("ErrMsg", "")
    ) {
        documentation = "Instances of this interface may be passed to the #CreateSimpleMCJITMemoryManager() method."
    }
}

val LLVMMemoryManagerDestroyCallback = Module.LLVM.callback {
    void(
        "LLVMMemoryManagerDestroyCallback",
        "",

        opaque_p("Opaque", "")
    ) {
        documentation = "Instances of this interface may be passed to the #CreateSimpleMCJITMemoryManager() method."
    }
}

val LLVMOpInfoCallback = Module.LLVM.callback {
    int(
        "LLVMOpInfoCallback",
        """
        The type for the operand information call back function.

        This is called to get the symbolic information for an operand of an instruction. Typically this is from the relocation information, symbol table, etc.
        That block of information is saved when the disassembler context is created and passed to the call back in the {@code DisInfo} parameter. The
        instruction containing operand is at the {@code PC} parameter. For some instruction sets, there can be more than one operand with symbolic information.
        To determine the symbolic operand information for each operand, the bytes for the specific operand in the instruction are specified by the
        {@code Offset} parameter and its byte width is the {@code OpSize} parameter. For instructions sets with fixed widths and one symbolic operand per
        instruction, the {@code Offset} parameter will be zero and {@code InstSize} parameter will be the instruction width. The information is returned in
        {@code TagBuf} and is {@code Triple} specific with its specific information defined by the value of {@code TagType} for that {@code Triple}. If
        symbolic information is returned the function returns 1, otherwise it returns 0.
        """,

        opaque_p("DisInfo", ""),
        uint64_t("PC", ""),
        uint64_t("Offset", ""),
        uint64_t("OpSize", ""),
        uint64_t("InstSize", ""),
        int("TagType", ""),
        void.p("TagBuf", "")
    ) {
        documentation = "Instances of this interface may be passed to the #CreateDisasm(), #CreateDisasmCPU() and #CreateDisasmCPUFeatures() methods."
    }
}

val LLVMSymbolLookupCallback = Module.LLVM.callback {
    char.const.p(
        "LLVMSymbolLookupCallback",
        """
        The type for the symbol lookup function.

        This may be called by the disassembler for things like adding a comment for a PC plus a constant offset load instruction to use a symbol name instead
        of a load address value. It is passed the block information is saved when the disassembler context is created and the {@code ReferenceValue} to look up
        as a symbol. If no symbol is found for the {@code ReferenceValue} #NULL is returned. The {@code ReferenceType} of the instruction is passed indirectly
        as is the {@code PC} of the instruction in {@code ReferencePC}. If the output reference can be determined its type is returned indirectly in
        {@code ReferenceType} along with {@code ReferenceName} if any, or that is set to #NULL.
        """,

        opaque_p("DisInfo", ""),
        uint64_t("ReferenceValue", ""),
        Check(1)..uint64_t.p("ReferenceType", ""),
        uint64_t("ReferencePC", ""),
        Check(1)..charUTF8.const.p.p("ReferenceName", "")
    ) {
        documentation = "Instances of this interface may be passed to the #CreateDisasm(), #CreateDisasmCPU() and #CreateDisasmCPUFeatures() methods."
    }
}

val LLVMMCJITCompilerOptions = struct(Module.LLVM, "LLVMMCJITCompilerOptions", nativeName = "struct LLVMMCJITCompilerOptions") {
    documentation = ""

    unsigned_int("OptLevel", "")
    LLVMCodeModel("CodeModel", "")
    LLVMBool("NoFramePointerElim", "")
    LLVMBool("EnableFastISel", "")
    LLVMMCJITMemoryManagerRef("MCJMM", "")
}

val LLVMOpInfoSymbol1 = struct(Module.LLVM, "LLVMOpInfoSymbol1", nativeName = "struct LLVMOpInfoSymbol1") {
    documentation =
        """
        The initial support in LLVM MC for the most general form of a relocatable expression is "AddSymbol - SubtractSymbol + Offset". For some Darwin targets
        this full form is encoded in the relocation information so that {@code AddSymbol} and {@code SubtractSymbol} can be link edited independent of each
        other. Many other platforms only allow a relocatable expression of the form {@code AddSymbol + Offset} to be encoded.

        The {@code LLVMOpInfoCallback()} for the {@code TagType} value of 1 uses the struct {@code LLVMOpInfo1}. The value of the relocatable expression for
        the operand, including any {@code PC} adjustment, is passed in to the call back in the {@code Value} field. The symbolic information about the operand
        is returned using all the fields of the structure with the Offset of the relocatable expression returned in the {@code Value} field. It is possible
        that some symbols in the relocatable expression were assembly temporary symbols, for example "Ldata - LpicBase + constant", and only the Values of the
        symbols without symbol names are present in the relocation information. The {@code VariantKind} type is one of the {@code Target} specific
        {@code \#defines} below and is used to print operands like "_foo GOT ", ":lower16:_foo", etc.
        """

    uint64_t("Present", "1 if this symbol is present")
    nullable..charUTF8.const.p("Name", "symbol name if not #NULL")
    uint64_t("Value", "symbol value if name is #NULL")
}

val LLVMOpInfo1 = struct(Module.LLVM, "LLVMOpInfo1", nativeName = "struct LLVMOpInfo1") {
    documentation = ""

    LLVMOpInfoSymbol1("AddSymbol", "")
    LLVMOpInfoSymbol1("SubtractSymbol", "")
    uint64_t("Value", "")
    uint64_t("VariantKind", "")
}

val LLVMMustPreserve = Module.LLVM.callback {
    LLVMBool(
        "LLVMMustPreserve",
        "",

        LLVMValueRef("Val", ""),
        opaque_p("Context", "")
    ) {
        documentation = "Instances of this interface may be passed to the #AddInternalizePassWithMustPreservePredicate() method."
    }
}

val LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction = Module.LLVM.callback {
    LLVMOrcObjectLayerRef(
        "LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction",
        """
        A function for constructing an ObjectLinkingLayer instance to be used by an LLJIT instance.

        Clients can call #OrcLLJITBuilderSetObjectLinkingLayerCreator() to set the creator function to use when constructing an {@code LLJIT} instance. This
        can be used to override the default linking layer implementation that would otherwise be chosen by {@code LLJITBuilder}.

        Object linking layers returned by this function will become owned by the {@code LLJIT} instance. The client is not responsible for managing their
        lifetimes after the function returns.
        """,

        opaque_p("Ctx", ""),
        LLVMOrcExecutionSessionRef("ES", ""),
        charUTF8.const.p("Triple", "")
    ) {
        documentation = "Instances of this interface may be passed to the #OrcLLJITBuilderSetObjectLinkingLayerCreator() method."
    }
}