/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm

import org.lwjgl.generator.*

val LLVMOrcDefinitionGeneratorRef = "LLVMOrcDefinitionGeneratorRef".handle
val LLVMOrcDumpObjectsRef = "LLVMOrcDumpObjectsRef".handle
val LLVMOrcExecutionSessionRef = "LLVMOrcExecutionSessionRef".handle
val LLVMOrcIRTransformLayerRef = "LLVMOrcIRTransformLayerRef".handle
val LLVMOrcIndirectStubsManagerRef = "LLVMOrcIndirectStubsManagerRef".handle
val LLVMOrcJITDylibRef = "LLVMOrcJITDylibRef".handle
val LLVMOrcJITTargetMachineBuilderRef = "LLVMOrcJITTargetMachineBuilderRef".handle
val LLVMOrcLazyCallThroughManagerRef = "LLVMOrcLazyCallThroughManagerRef".handle
val LLVMOrcLLJITBuilderRef = "LLVMOrcLLJITBuilderRef".handle
val LLVMOrcLLJITRef = "LLVMOrcLLJITRef".handle
val LLVMOrcLookupStateRef = "LLVMOrcLookupStateRef".handle
val LLVMOrcMaterializationResponsibilityRef = "LLVMOrcMaterializationResponsibilityRef".handle
val LLVMOrcMaterializationUnitRef = "LLVMOrcMaterializationUnitRef".handle
val LLVMOrcObjectLayerRef = "LLVMOrcObjectLayerRef".handle
val LLVMOrcObjectLinkingLayerRef = "LLVMOrcObjectLinkingLayerRef".handle
val LLVMOrcObjectTransformLayerRef = "LLVMOrcObjectTransformLayerRef".handle
val LLVMOrcResourceTrackerRef = "LLVMOrcResourceTrackerRef".handle
val LLVMOrcSymbolStringPoolEntryRef = "LLVMOrcSymbolStringPoolEntryRef".handle
val LLVMOrcSymbolStringPoolRef = "LLVMOrcSymbolStringPoolRef".handle
val LLVMOrcThreadSafeContextRef = "LLVMOrcThreadSafeContextRef".handle
val LLVMOrcThreadSafeModuleRef = "LLVMOrcThreadSafeModuleRef".handle

val LLVMJITSymbolTargetFlags = typedef(uint8_t, "LLVMJITSymbolTargetFlags")
val LLVMOrcExecutorAddress = typedef(uint64_t, "LLVMOrcExecutorAddress")
val LLVMOrcJITTargetAddress = typedef(uint64_t, "LLVMOrcJITTargetAddress")

val LLVMJITSymbolGenericFlags = "LLVMJITSymbolGenericFlags".enumType
val LLVMOrcJITDylibLookupFlags = "LLVMOrcJITDylibLookupFlags".enumType
val LLVMOrcLookupKind = "LLVMOrcLookupKind".enumType
val LLVMOrcSymbolLookupFlags = "LLVMOrcSymbolLookupFlags".enumType

val LLVMJITSymbolFlags = struct(Module.LLVM, "LLVMJITSymbolFlags") {
    uint8_t("GenericFlags")
    uint8_t("TargetFlags")
}

val LLVMJITEvaluatedSymbol = struct(Module.LLVM, "LLVMJITEvaluatedSymbol") {
    LLVMOrcExecutorAddress("Address")
    LLVMJITSymbolFlags("Flags")
}

val LLVMOrcErrorReporterFunction = Module.LLVM.callback {
    void(
        "LLVMOrcErrorReporterFunction",

        opaque_p("Ctx"),
        LLVMErrorRef("Err"),

        nativeType = "LLVMOrcErrorReporterFunction"
    ) {
    }
}

val LLVMOrcCSymbolFlagsMapPair = struct(Module.LLVM, "LLVMOrcCSymbolFlagsMapPair") {
    LLVMOrcSymbolStringPoolEntryRef("Name")
    LLVMJITSymbolFlags("Flags")
}
val LLVMOrcCSymbolFlagsMapPairs = typedef(LLVMOrcCSymbolFlagsMapPair.p, "LLVMOrcCSymbolFlagsMapPairs")

val LLVMOrcCSymbolMapPair = struct(Module.LLVM, "LLVMOrcCSymbolMapPair") {
    LLVMOrcSymbolStringPoolEntryRef("Name")
    LLVMJITEvaluatedSymbol("Sym")
}
val LLVMOrcCSymbolMapPairs = typedef(LLVMOrcCSymbolMapPair.p, "LLVMOrcCSymbolMapPairs")

val LLVMOrcCSymbolAliasMapEntry = struct(Module.LLVM, "LLVMOrcCSymbolAliasMapEntry") {
    LLVMOrcSymbolStringPoolEntryRef("Name")
    LLVMJITSymbolFlags("Flags")
}

val LLVMOrcCSymbolAliasMapPair = struct(Module.LLVM, "LLVMOrcCSymbolAliasMapPair") {
    LLVMOrcSymbolStringPoolEntryRef("Name")
    LLVMOrcCSymbolAliasMapEntry("Entry")
}
val LLVMOrcCSymbolAliasMapPairs = typedef(LLVMOrcCSymbolAliasMapPair.p, "LLVMOrcCSymbolAliasMapPairs")

val LLVMOrcCSymbolsList = struct(Module.LLVM, "LLVMOrcCSymbolsList") {
    LLVMOrcSymbolStringPoolEntryRef.p("Symbols")
    AutoSize("Symbols")..size_t("Length")
}

val LLVMOrcCDependenceMapPair = struct(Module.LLVM, "LLVMOrcCDependenceMapPair") {
    LLVMOrcJITDylibRef("JD")
    LLVMOrcCSymbolsList("Names")
}
val LLVMOrcCDependenceMapPairs = typedef(LLVMOrcCDependenceMapPair.p, "LLVMOrcCDependenceMapPairs")

val LLVMOrcCSymbolDependenceGroup = struct(Module.LLVM, "LLVMOrcCSymbolDependenceGroup") {
    LLVMOrcCSymbolsList("Symbols")
    LLVMOrcCDependenceMapPairs("Dependencies")
    AutoSize("Dependencies")..size_t("NumDependencies")
}

val LLVMOrcCJITDylibSearchOrderElement = struct(Module.LLVM, "LLVMOrcCJITDylibSearchOrderElement") {
    LLVMOrcJITDylibRef("JD")
    LLVMOrcJITDylibLookupFlags("JDLookupFlags")
}
val LLVMOrcCJITDylibSearchOrder = typedef(LLVMOrcCJITDylibSearchOrderElement.p, "LLVMOrcCJITDylibSearchOrder")

val LLVMOrcCLookupSetElement = struct(Module.LLVM, "LLVMOrcCLookupSetElement") {
    LLVMOrcSymbolStringPoolEntryRef("Name")
    LLVMOrcSymbolLookupFlags("LookupFlags")
}
val LLVMOrcCLookupSet = typedef(LLVMOrcCLookupSetElement.p, "LLVMOrcCLookupSet")

val LLVMOrcMaterializationUnitMaterializeFunction = Module.LLVM.callback {
    void(
        "LLVMOrcMaterializationUnitMaterializeFunction",

        opaque_p("Ctx"),
        LLVMOrcMaterializationResponsibilityRef("MR"),

        nativeType = "LLVMOrcMaterializationUnitMaterializeFunction"
    ) {
    }
}

val LLVMOrcMaterializationUnitDiscardFunction = Module.LLVM.callback {
    void(
        "LLVMOrcMaterializationUnitDiscardFunction",

        opaque_p("Ctx"),
        LLVMOrcJITDylibRef("JD"),
        LLVMOrcSymbolStringPoolEntryRef("Symbol"),

        nativeType = "LLVMOrcMaterializationUnitDiscardFunction"
    ) {
    }
}

val LLVMOrcMaterializationUnitDestroyFunction = Module.LLVM.callback {
    void(
        "LLVMOrcMaterializationUnitDestroyFunction",

        opaque_p("Ctx"),

        nativeType = "LLVMOrcMaterializationUnitDestroyFunction"
    ) {
    }
}

val LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction = Module.LLVM.callback {
    LLVMErrorRef(
        "LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction",

        LLVMOrcDefinitionGeneratorRef("GeneratorObj"),
        opaque_p("Ctx"),
        LLVMOrcLookupStateRef.p("LookupState"),
        LLVMOrcLookupKind("Kind"),
        LLVMOrcJITDylibRef("JD"),
        LLVMOrcJITDylibLookupFlags("JDLookupFlags"),
        LLVMOrcCLookupSet("LookupSet"),
        AutoSize("LookupSet")..size_t("LookupSetSize"),

        nativeType = "LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction"
    ) {
    }
}

val LLVMOrcDisposeCAPIDefinitionGeneratorFunction = Module.LLVM.callback {
    void(
        "LLVMOrcDisposeCAPIDefinitionGeneratorFunction",

        opaque_p("Ctx"),

        nativeType = "LLVMOrcDisposeCAPIDefinitionGeneratorFunction"
    )
}

val LLVMOrcSymbolPredicate = Module.LLVM.callback {
    int(
        "LLVMOrcSymbolPredicate",

        opaque_p("Ctx"),
        LLVMOrcSymbolStringPoolEntryRef("Sym"),

        nativeType = "LLVMOrcSymbolPredicate"
    ) {
    }
}

val LLVMOrcGenericIRModuleOperationFunction = Module.LLVM.callback {
    LLVMErrorRef(
        "LLVMOrcGenericIRModuleOperationFunction",

        opaque_p("Ctx"),
        LLVMModuleRef("M"),

        nativeType = "LLVMOrcGenericIRModuleOperationFunction"
    ) {
    }
}

val LLVMOrcIRTransformLayerTransformFunction = Module.LLVM.callback {
    LLVMErrorRef(
        "LLVMOrcIRTransformLayerTransformFunction",

        opaque_p("Ctx"),
        Check(1)..LLVMOrcThreadSafeModuleRef.p("ModInOut"),
        LLVMOrcMaterializationResponsibilityRef("MR"),

        nativeType = "LLVMOrcIRTransformLayerTransformFunction"
    ) {
    }
}

val LLVMOrcObjectTransformLayerTransformFunction = Module.LLVM.callback {
    LLVMErrorRef(
        "LLVMOrcObjectTransformLayerTransformFunction",

        opaque_p("Ctx"),
        Check(1)..LLVMMemoryBufferRef.p("ObjInOut"),

        nativeType = "LLVMOrcObjectTransformLayerTransformFunction"
    ) {
    }
}

val LLVMOrcExecutionSessionLookupHandleResultFunction = Module.LLVM.callback {
    void(
        "LLVMOrcExecutionSessionLookupHandleResultFunction",

        LLVMErrorRef("Err"),
        nullable..LLVMOrcCSymbolMapPairs("Result"),
        AutoSize("Result")..size_t("NumPairs"),
        nullable..opaque_p("Ctx"),

        nativeType = "LLVMOrcExecutionSessionLookupHandleResultFunction"
    ) {
    }
}

val LLVMMemoryManagerCreateContextCallback = Module.LLVM.callback {
    void(
        "LLVMMemoryManagerCreateContextCallback",

        nullable..opaque_p("CtxCtx"),

        nativeType = "LLVMMemoryManagerCreateContextCallback"
    ) {
    }
}

val LLVMMemoryManagerNotifyTerminatingCallback = Module.LLVM.callback {
    void(
        "LLVMMemoryManagerNotifyTerminatingCallback",

        nullable..opaque_p("CtxCtx"),

        nativeType = "LLVMMemoryManagerNotifyTerminatingCallback"
    ) {
    }
}