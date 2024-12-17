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

        charUTF8.const.p("Reason")
    ) {
    }
}

val LLVMDiagnosticHandler = Module.LLVM.callback {
    void(
        "LLVMDiagnosticHandler",

        LLVMDiagnosticInfoRef("DiagnosticInfo"),
        opaque_p("DiagnosticContext")
    ) {
    }
}

val LLVMYieldCallback = Module.LLVM.callback {
    void(
        "LLVMYieldCallback",

        LLVMContextRef("Context"),
        opaque_p("OpaqueHandle")
    ) {
    }
}

val LLVMMemoryManagerAllocateCodeSectionCallback = Module.LLVM.callback {
    uint8_t.p(
        "LLVMMemoryManagerAllocateCodeSectionCallback",

        opaque_p("Opaque"),
        uintptr_t("Size"),
        unsigned_int("Alignment"),
        unsigned_int("SectionID"),
        charUTF8.const.p("SectionName")
    ) {
    }
}

val LLVMMemoryManagerAllocateDataSectionCallback = Module.LLVM.callback {
    uint8_t.p(
        "LLVMMemoryManagerAllocateDataSectionCallback",

        opaque_p("Opaque"),
        uintptr_t("Size"),
        unsigned_int("Alignment"),
        unsigned_int("SectionID"),
        charUTF8.const.p("SectionName"),
        LLVMBool("IsReadOnly")
    ) {
    }
}

val LLVMMemoryManagerFinalizeMemoryCallback = Module.LLVM.callback {
    LLVMBool(
        "LLVMMemoryManagerFinalizeMemoryCallback",

        opaque_p("Opaque"),
        Check(1)..charUTF8.p.p("ErrMsg")
    ) {
    }
}

val LLVMMemoryManagerDestroyCallback = Module.LLVM.callback {
    void(
        "LLVMMemoryManagerDestroyCallback",

        opaque_p("Opaque")
    ) {
    }
}

val LLVMOpInfoCallback = Module.LLVM.callback {
    int(
        "LLVMOpInfoCallback",

        opaque_p("DisInfo"),
        uint64_t("PC"),
        uint64_t("Offset"),
        uint64_t("OpSize"),
        uint64_t("InstSize"),
        int("TagType"),
        void.p("TagBuf")
    ) {
    }
}

val LLVMSymbolLookupCallback = Module.LLVM.callback {
    char.const.p(
        "LLVMSymbolLookupCallback",

        opaque_p("DisInfo"),
        uint64_t("ReferenceValue"),
        Check(1)..uint64_t.p("ReferenceType"),
        uint64_t("ReferencePC"),
        Check(1)..charUTF8.const.p.p("ReferenceName")
    ) {
    }
}

val LLVMMCJITCompilerOptions = struct(Module.LLVM, "LLVMMCJITCompilerOptions", nativeName = "struct LLVMMCJITCompilerOptions") {
    unsigned_int("OptLevel")
    LLVMCodeModel("CodeModel")
    LLVMBool("NoFramePointerElim")
    LLVMBool("EnableFastISel")
    LLVMMCJITMemoryManagerRef("MCJMM")
}

val LLVMOpInfoSymbol1 = struct(Module.LLVM, "LLVMOpInfoSymbol1", nativeName = "struct LLVMOpInfoSymbol1") {
    uint64_t("Present")
    nullable..charUTF8.const.p("Name")
    uint64_t("Value")
}

val LLVMOpInfo1 = struct(Module.LLVM, "LLVMOpInfo1", nativeName = "struct LLVMOpInfo1") {
    LLVMOpInfoSymbol1("AddSymbol")
    LLVMOpInfoSymbol1("SubtractSymbol")
    uint64_t("Value")
    uint64_t("VariantKind")
}

val LLVMMustPreserve = Module.LLVM.callback {
    LLVMBool(
        "LLVMMustPreserve",

        LLVMValueRef("Val"),
        opaque_p("Context")
    ) {
    }
}

val LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction = Module.LLVM.callback {
    LLVMOrcObjectLayerRef(
        "LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction",

        opaque_p("Ctx"),
        LLVMOrcExecutionSessionRef("ES"),
        charUTF8.const.p("Triple")
    ) {
    }
}