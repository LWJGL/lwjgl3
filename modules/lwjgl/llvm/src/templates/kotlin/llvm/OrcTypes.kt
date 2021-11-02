/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm

import org.lwjgl.generator.*

val LLVMOrcCLookupSet = "LLVMOrcCLookupSet".handle
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
    documentation = "Represents the linkage flags for a symbol definition."

    uint8_t("GenericFlags", "")
    uint8_t("TargetFlags", "")
}

val LLVMJITEvaluatedSymbol = struct(Module.LLVM, "LLVMJITEvaluatedSymbol") {
    documentation = "Represents an evaluated symbol address and flags."

    LLVMOrcExecutorAddress("Address", "")
    LLVMJITSymbolFlags("Flags", "")
}

val LLVMOrcErrorReporterFunction = Module.LLVM.callback {
    void(
        "LLVMOrcErrorReporterFunction",
        "Error reporter function.",

        opaque_p("Ctx", ""),
        LLVMErrorRef("Err", ""),

        nativeType = "LLVMOrcErrorReporterFunction"
    ) {
        documentation = "Instances of this interface may be passed to the #OrcExecutionSessionSetErrorReporter() method."
    }
}

val LLVMOrcCSymbolFlagsMapPair = struct(Module.LLVM, "LLVMOrcCSymbolFlagsMapPair") {
    documentation = "Represents a pair of a symbol name and {@code LLVMJITSymbolFlags}."

    LLVMOrcSymbolStringPoolEntryRef("Name", "")
    LLVMJITSymbolFlags("Flags", "")
}
val LLVMOrcCSymbolFlagsMapPairs = typedef(LLVMOrcCSymbolFlagsMapPair.p, "LLVMOrcCSymbolFlagsMapPairs")

val LLVMJITCSymbolMapPair = struct(Module.LLVM, "LLVMJITCSymbolMapPair") {
    documentation = "Represents a pair of a symbol name and an evaluated symbol."

    LLVMOrcSymbolStringPoolEntryRef("Name", "")
    LLVMJITEvaluatedSymbol("Sym", "")
}
val LLVMOrcCSymbolMapPairs = typedef(LLVMJITCSymbolMapPair.p, "LLVMOrcCSymbolMapPairs")

val LLVMOrcCSymbolAliasMapEntry = struct(Module.LLVM, "LLVMOrcCSymbolAliasMapEntry") {
    documentation = "Represents a {@code SymbolAliasMapEntry}"

    LLVMOrcSymbolStringPoolEntryRef("Name", "")
    LLVMJITSymbolFlags("Flags", "")
}

val LLVMOrcCSymbolAliasMapPair = struct(Module.LLVM, "LLVMOrcCSymbolAliasMapPair") {
    documentation = "Represents a pair of a symbol name and {@code SymbolAliasMapEntry}."

    LLVMOrcSymbolStringPoolEntryRef("Name", "")
    LLVMOrcCSymbolAliasMapEntry("Entry", "")
}
val LLVMOrcCSymbolAliasMapPairs = typedef(LLVMOrcCSymbolAliasMapPair.p, "LLVMOrcCSymbolAliasMapPairs")

val LLVMOrcCSymbolsList = struct(Module.LLVM, "LLVMOrcCSymbolsList") {
    documentation = "Represents a list of {@code LLVMOrcSymbolStringPoolEntryRef} and the associated length."

    LLVMOrcSymbolStringPoolEntryRef.p("Symbols", "")
    AutoSize("Symbols")..size_t("Length", "")
}

val LLVMOrcCDependenceMapPair = struct(Module.LLVM, "LLVMOrcCDependenceMapPair") {
    documentation = "Represents a pair of a {@code JITDylib} and {@code LLVMOrcCSymbolsList}."

    LLVMOrcJITDylibRef("JD", "")
    LLVMOrcCSymbolsList("Names", "")
}
val LLVMOrcCDependenceMapPairs = typedef(LLVMOrcCDependenceMapPair.p, "LLVMOrcCDependenceMapPairs")

val LLVMOrcCLookupSetElement = struct(Module.LLVM, "LLVMOrcCLookupSetElement") {
    documentation = "An element type for a symbol lookup set."

    LLVMOrcSymbolStringPoolEntryRef("Name", "")
    LLVMOrcSymbolLookupFlags("LookupFlags", "")
}

val LLVMOrcMaterializationUnitMaterializeFunction = Module.LLVM.callback {
    void(
        "LLVMOrcMaterializationUnitMaterializeFunction",
        """
        A {@code MaterializationUnit} materialize callback.

        Ownership of the {@code Ctx} and {@code MR} arguments passes to the callback which must adhere to the {@code LLVMOrcMaterializationResponsibilityRef}
        contract (see comment for that type).

        If this callback is called then the ##LLVMOrcMaterializationUnitDestroyFunction callback will NOT be called.
        """,

        opaque_p("Ctx", ""),
        LLVMOrcMaterializationResponsibilityRef("MR", ""),

        nativeType = "LLVMOrcMaterializationUnitMaterializeFunction"
    ) {
        documentation = "Instances of this interface may be passed to the #OrcCreateCustomMaterializationUnit() method."
    }
}

val LLVMOrcMaterializationUnitDiscardFunction = Module.LLVM.callback {
    void(
        "LLVMOrcMaterializationUnitDiscardFunction",
        """
        A {@code MaterializationUnit} discard callback.

        Ownership of {@code JD} and {@code Symbol} remain with the caller: These arguments should not be disposed of or released.
        """,

        opaque_p("Ctx", ""),
        LLVMOrcJITDylibRef("JD", ""),
        LLVMOrcSymbolStringPoolEntryRef("Symbol", ""),

        nativeType = "LLVMOrcMaterializationUnitDiscardFunction"
    ) {
        documentation = "Instances of this interface may be passed to the #OrcCreateCustomMaterializationUnit() method."
    }
}

val LLVMOrcMaterializationUnitDestroyFunction = Module.LLVM.callback {
    void(
        "LLVMOrcMaterializationUnitDestroyFunction",
        """
        A {@code MaterializationUnit} destruction callback.

        If a custom {@code MaterializationUnit} is destroyed before its {@code Materialize} function is called then this function will be called to provide an
        opportunity for the underlying program representation to be destroyed.
        """,

        opaque_p("Ctx", ""),

        nativeType = "LLVMOrcMaterializationUnitDestroyFunction"
    ) {
        documentation = "Instances of this interface may be passed to the #OrcCreateCustomMaterializationUnit() method."
    }
}

val LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction = Module.LLVM.callback {
    LLVMErrorRef(
        "LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction",
        """
        A custom generator function.
        
        This can be used to create a custom generator object using #OrcCreateCustomCAPIDefinitionGenerator(). The resulting object can be attached to a
        {@code JITDylib}, via #OrcJITDylibAddGenerator(), to receive callbacks when lookups fail to match existing definitions.
        """,

        LLVMOrcDefinitionGeneratorRef("GeneratorObj", "will contain the address of the custom generator object"),
        opaque_p("Ctx", "will contain the context object passed to {@code LLVMOrcCreateCustomCAPIDefinitionGenerator}."),
        LLVMOrcLookupStateRef.p(
            "LookupState",
            """
            will contain a pointer to an {@code LLVMOrcLookupStateRef} object.
            
            This can optionally be modified to make the definition generation process asynchronous: If the {@code LookupStateRef} value is copied, and the
            original {@code LLVMOrcLookupStateRef} set to null, the lookup will be suspended. Once the asynchronous definition process has been completed
            clients must call {@code LLVMOrcLookupStateContinueLookup} to continue the lookup (this should be done unconditionally, even if errors have
            occurred in the mean time, to free the lookup state memory and notify the query object of the failures). If {@code LookupState} is captured this
            function must return #ErrorSuccess.
            """
        ),
        LLVMOrcLookupKind("Kind", "can be inspected to determine the lookup kind (e.g. as-if-during-static-link, or as-if-during-dlsym)"),
        LLVMOrcJITDylibRef("JD", "specifies which {@code JITDylib} the definitions should be generated into"),
        LLVMOrcJITDylibLookupFlags("JDLookupFlags", "can be inspected to determine whether the original lookup included non-exported symbols"),
        LLVMOrcCLookupSet("LookupSet", "contains the set of symbols that could not be found in {@code JD} already (the set of generation candidates)"),
        AutoSize("LookupSet")..size_t("LookupSetSize", ""),

        nativeType = "LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction"
    ) {
        documentation = "Instances of this interface may be passed to the #OrcCreateCustomCAPIDefinitionGenerator() method."
    }
}

val LLVMOrcSymbolPredicate = Module.LLVM.callback {
    int(
        "LLVMOrcSymbolPredicate",
        "Predicate function for {@code SymbolStringPoolEntries}.",

        opaque_p("Ctx", ""),
        LLVMOrcSymbolStringPoolEntryRef("Sym", ""),

        nativeType = "LLVMOrcSymbolPredicate"
    ) {
        documentation = "Instances of this interface may be passed to the #OrcCreateDynamicLibrarySearchGeneratorForProcess() method."
    }
}

val LLVMOrcGenericIRModuleOperationFunction = Module.LLVM.callback {
    LLVMErrorRef(
        "LLVMOrcGenericIRModuleOperationFunction",
        "A function for inspecting/mutating IR modules, suitable for use with #OrcThreadSafeModuleWithModuleDo().",

        opaque_p("Ctx", ""),
        LLVMModuleRef("M", ""),

        nativeType = "LLVMOrcGenericIRModuleOperationFunction"
    ) {
        documentation = "Instances of this interface may be passed to the #OrcThreadSafeModuleWithModuleDo() method."
    }
}

val LLVMOrcIRTransformLayerTransformFunction = Module.LLVM.callback {
    LLVMErrorRef(
        "LLVMOrcIRTransformLayerTransformFunction",
        """
        A function for applying transformations as part of an transform layer.

        Implementations of this type are responsible for managing the lifetime of the {@code Module} pointed to by {@code ModInOut}: If the
        {@code LLVMModuleRef} value is overwritten then the function is responsible for disposing of the incoming module. If the module is simply
        accessed/mutated in-place then ownership returns to the caller and the function does not need to do any lifetime management.

        Clients can call #OrcLLJITGetIRTransformLayer() to obtain the transform layer of a {@code LLJIT} instance, and use #OrcIRTransformLayerSetTransform()
        to set the function. This can be used to override the default transform layer.
        """,

        opaque_p("Ctx", ""),
        Check(1)..LLVMOrcThreadSafeModuleRef.p("ModInOut", ""),
        LLVMOrcMaterializationResponsibilityRef("MR", ""),

        nativeType = "LLVMOrcIRTransformLayerTransformFunction"
    ) {
        documentation = "Instances of this interface may be passed to the #OrcIRTransformLayerSetTransform() method."
    }
}

val LLVMOrcObjectTransformLayerTransformFunction = Module.LLVM.callback {
    LLVMErrorRef(
        "LLVMOrcObjectTransformLayerTransformFunction",
        """
        A function for applying transformations to an object file buffer.

        Implementations of this type are responsible for managing the lifetime of the memory buffer pointed to by {@code ObjInOut}: If the
        {@code LLVMMemoryBufferRef} value is overwritten then the function is responsible for disposing of the incoming buffer. If the buffer is simply
        accessed/mutated in-place then ownership returns to the caller and the function does not need to do any lifetime management.

        The transform is allowed to return an error, in which case the {@code ObjInOut} buffer should be disposed of and set to null.
        """,

        opaque_p("Ctx", ""),
        Check(1)..LLVMMemoryBufferRef.p("ObjInOut", ""),

        nativeType = "LLVMOrcObjectTransformLayerTransformFunction"
    ) {
        documentation = "Instances of this interface may be passed to the #OrcObjectTransformLayerSetTransform() method."
    }
}
