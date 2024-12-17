/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMOrc = "LLVMOrc".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    EnumConstant(
        "JITSymbolGenericFlagsNone".enum("0"),
        "JITSymbolGenericFlagsExported".enum("1 << 0"),
        "JITSymbolGenericFlagsWeak".enum("1 << 1"),
        "JITSymbolGenericFlagsCallable".enum("1 << 2"),
        "JITSymbolGenericFlagsMaterializationSideEffectsOnly".enum("1 << 3")
    )

    EnumConstant(
        "OrcLookupKindStatic".enum("0"),
        "OrcLookupKindDLSym".enum
    )

    EnumConstant(
        "OrcJITDylibLookupFlagsMatchExportedSymbolsOnly".enum("0"),
        "OrcJITDylibLookupFlagsMatchAllSymbols".enum
    )

    EnumConstant(
        "OrcSymbolLookupFlagsRequiredSymbol".enum("0"),
        "OrcSymbolLookupFlagsWeaklyReferencedSymbol".enum
    )

    void(
        "OrcExecutionSessionSetErrorReporter",

        LLVMOrcExecutionSessionRef("ES"),
        LLVMOrcErrorReporterFunction("ReportError"),
        opaque_p("Ctx")
    )

    LLVMOrcSymbolStringPoolRef(
        "OrcExecutionSessionGetSymbolStringPool",

        LLVMOrcExecutionSessionRef("ES")
    )

    void(
        "OrcSymbolStringPoolClearDeadEntries",

        LLVMOrcSymbolStringPoolRef("SSP")
    )

    LLVMOrcSymbolStringPoolEntryRef(
        "OrcExecutionSessionIntern",

        LLVMOrcExecutionSessionRef("ES"),
        charUTF8.const.p("Name")
    )

    void(
        "OrcRetainSymbolStringPoolEntry",

        LLVMOrcSymbolStringPoolEntryRef("S")
    )

    IgnoreMissing..void(
        "OrcExecutionSessionLookup",

        LLVMOrcExecutionSessionRef("ES"),
        LLVMOrcLookupKind("K"),
        nullable..LLVMOrcCJITDylibSearchOrder("SearchOrder"),
        AutoSize("SearchOrder")..size_t("SearchOrderSize"),
        nullable..LLVMOrcCLookupSet("Symbols"),
        AutoSize("Symbols")..size_t("SymbolsSize"),
        LLVMOrcExecutionSessionLookupHandleResultFunction("HandleResult"),
        nullable..opaque_p("Ctx")
    )

    void(
        "OrcReleaseSymbolStringPoolEntry",

        LLVMOrcSymbolStringPoolEntryRef("S")
    )

    charUTF8.const.p(
        "OrcSymbolStringPoolEntryStr",

        LLVMOrcSymbolStringPoolEntryRef("S")
    )

    void(
        "OrcReleaseResourceTracker",

        LLVMOrcResourceTrackerRef("RT")
    )

    void(
        "OrcResourceTrackerTransferTo",

        LLVMOrcResourceTrackerRef("SrcRT"),
        LLVMOrcResourceTrackerRef("DstRT")
    )

    LLVMErrorRef(
        "OrcResourceTrackerRemove",

        LLVMOrcResourceTrackerRef("RT")
    )

    void(
        "OrcDisposeDefinitionGenerator",

        LLVMOrcDefinitionGeneratorRef("DG")
    )

    void(
        "OrcDisposeMaterializationUnit",

        LLVMOrcMaterializationUnitRef("MU")
    )

    IgnoreMissing..LLVMOrcMaterializationUnitRef(
        "OrcCreateCustomMaterializationUnit",

        charUTF8.const.p("Name"),
        opaque_p("Ctx"),
        LLVMOrcCSymbolFlagsMapPairs("Syms"),
        AutoSize("Syms")..size_t("NumSyms"),
        nullable..LLVMOrcSymbolStringPoolEntryRef("InitSym"),
        LLVMOrcMaterializationUnitMaterializeFunction("Materialize"),
        LLVMOrcMaterializationUnitDiscardFunction("Discard"),
        LLVMOrcMaterializationUnitDestroyFunction("Destroy")
    )

    LLVMOrcMaterializationUnitRef(
        "OrcAbsoluteSymbols",

        LLVMOrcCSymbolMapPairs("Syms"),
        AutoSize("Syms")..size_t("NumPairs")
    )

    IgnoreMissing..LLVMOrcMaterializationUnitRef(
        "OrcLazyReexports",

        LLVMOrcLazyCallThroughManagerRef("LCTM"),
        LLVMOrcIndirectStubsManagerRef("ISM"),
        LLVMOrcJITDylibRef("SourceRef"),
        LLVMOrcCSymbolAliasMapPairs("CallableAliases"),
        AutoSize("CallableAliases")..size_t("NumPairs")
    )

    IgnoreMissing..void(
        "OrcDisposeMaterializationResponsibility",

        LLVMOrcMaterializationResponsibilityRef("MR")
    )

    IgnoreMissing..LLVMOrcJITDylibRef(
        "OrcMaterializationResponsibilityGetTargetDylib",

        LLVMOrcMaterializationResponsibilityRef("MR")
    )

    IgnoreMissing..LLVMOrcExecutionSessionRef(
        "OrcMaterializationResponsibilityGetExecutionSession",

        LLVMOrcMaterializationResponsibilityRef("MR")
    )

    IgnoreMissing..LLVMOrcCSymbolFlagsMapPairs(
        "OrcMaterializationResponsibilityGetSymbols",

        LLVMOrcMaterializationResponsibilityRef("MR"),
        AutoSizeResult..Check(1)..size_t.p("NumPairs")
    )

    IgnoreMissing..void(
        "OrcDisposeCSymbolFlagsMap",

        LLVMOrcCSymbolFlagsMapPairs("Pairs")
    )

    IgnoreMissing..LLVMOrcSymbolStringPoolEntryRef(
        "OrcMaterializationResponsibilityGetInitializerSymbol",

        LLVMOrcMaterializationResponsibilityRef("MR")
    )

    IgnoreMissing..LLVMOrcSymbolStringPoolEntryRef.p(
        "OrcMaterializationResponsibilityGetRequestedSymbols",

        LLVMOrcMaterializationResponsibilityRef("MR"),
        AutoSizeResult..Check(1)..size_t.p("NumSymbols")
    )

    IgnoreMissing..void(
        "OrcDisposeSymbols",

        Unsafe..LLVMOrcSymbolStringPoolEntryRef.p("Symbols")
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcMaterializationResponsibilityNotifyResolved",

        LLVMOrcMaterializationResponsibilityRef("MR"),
        LLVMOrcCSymbolMapPairs("Symbols"),
        AutoSize("Symbols")..size_t("NumPairs")
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcMaterializationResponsibilityNotifyEmitted",

        LLVMOrcMaterializationResponsibilityRef("MR"),
        LLVMOrcCSymbolDependenceGroup.p("SymbolDepGroups"),
        AutoSize("SymbolDepGroups")..size_t("NumSymbolDepGroups")
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcMaterializationResponsibilityDefineMaterializing",

        LLVMOrcMaterializationResponsibilityRef("MR"),
        LLVMOrcCSymbolFlagsMapPairs("Pairs"),
        AutoSize("Pairs")..size_t("NumPairs")
    )

    IgnoreMissing..void(
        "OrcMaterializationResponsibilityFailMaterialization",

        LLVMOrcMaterializationResponsibilityRef("MR")
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcMaterializationResponsibilityReplace",

        LLVMOrcMaterializationResponsibilityRef("MR"),
        LLVMOrcMaterializationUnitRef("MU")
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcMaterializationResponsibilityDelegate",

        LLVMOrcMaterializationResponsibilityRef("MR"),
        LLVMOrcSymbolStringPoolEntryRef.p("Symbols"),
        AutoSize("Symbols")..size_t("NumSymbols"),
        Check(1)..LLVMOrcMaterializationResponsibilityRef.p("Result")
    )

    IgnoreMissing..void(
        "OrcMaterializationResponsibilityAddDependencies",

        LLVMOrcMaterializationResponsibilityRef("MR"),
        LLVMOrcSymbolStringPoolEntryRef("Name"),
        LLVMOrcCDependenceMapPairs("Dependencies"),
        AutoSize("Dependencies")..size_t("NumPairs")
    )

    IgnoreMissing..void(
        "OrcMaterializationResponsibilityAddDependenciesForAll",

        LLVMOrcMaterializationResponsibilityRef("MR"),
        LLVMOrcCDependenceMapPairs("Dependencies"),
        AutoSize("Dependencies")..size_t("NumPairs")
    )

    LLVMOrcJITDylibRef(
        "OrcExecutionSessionCreateBareJITDylib",

        LLVMOrcExecutionSessionRef("ES"),
        charUTF8.const.p("Name")
    )

    LLVMErrorRef(
        "OrcExecutionSessionCreateJITDylib",

        LLVMOrcExecutionSessionRef("ES"),
        Check(1)..LLVMOrcJITDylibRef.p("Result"),
        charUTF8.const.p("Name")
    )

    LLVMOrcJITDylibRef(
        "OrcExecutionSessionGetJITDylibByName",

        LLVMOrcExecutionSessionRef("ES"),
        charUTF8.const.p("Name")
    )

    LLVMOrcResourceTrackerRef(
        "OrcJITDylibCreateResourceTracker",

        LLVMOrcJITDylibRef("JD")
    )

    LLVMOrcResourceTrackerRef(
        "OrcJITDylibGetDefaultResourceTracker",

        LLVMOrcJITDylibRef("JD")
    )

    LLVMErrorRef(
        "OrcJITDylibDefine",

        LLVMOrcJITDylibRef("JD"),
        LLVMOrcMaterializationUnitRef("MU")
    )

    LLVMErrorRef(
        "OrcJITDylibClear",

        LLVMOrcJITDylibRef("JD")
    )

    void(
        "OrcJITDylibAddGenerator",

        LLVMOrcJITDylibRef("JD"),
        LLVMOrcDefinitionGeneratorRef("DG")
    )

    LLVMOrcDefinitionGeneratorRef(
        "OrcCreateCustomCAPIDefinitionGenerator",

        LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction("F"),
        nullable..opaque_p("Ctx"),
        nullable..LLVMOrcDisposeCAPIDefinitionGeneratorFunction("Dispose")
    )

    IgnoreMissing..void(
        "OrcLookupStateContinueLookup",

        LLVMOrcLookupStateRef("S"),
        LLVMErrorRef("Err")
    )

    LLVMErrorRef(
        "OrcCreateDynamicLibrarySearchGeneratorForProcess",

        Check(1)..LLVMOrcDefinitionGeneratorRef.p("Result"),
        char("GlobalPrefx"),
        nullable..LLVMOrcSymbolPredicate("Filter"),
        nullable..opaque_p("FilterCtx")
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcCreateDynamicLibrarySearchGeneratorForPath",

        Check(1)..LLVMOrcDefinitionGeneratorRef.p("Result"),
        charUTF8.const.p("FileName"),
        char("GlobalPrefix"),
        nullable..LLVMOrcSymbolPredicate("Filter"),
        nullable..opaque_p("FilterCtx")
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcCreateStaticLibrarySearchGeneratorForPath",

        Check(1)..LLVMOrcDefinitionGeneratorRef.p("Result"),
        LLVMOrcObjectLayerRef("ObjLayer"),
        charUTF8.const.p("FileName"),
        nullable..charUTF8.const.p("TargetTriple")
    )

    LLVMOrcThreadSafeContextRef(
        "OrcCreateNewThreadSafeContext",

        void()
    )

    LLVMContextRef(
        "OrcThreadSafeContextGetContext",

        LLVMOrcThreadSafeContextRef("TSCtx")
    )

    void(
        "OrcDisposeThreadSafeContext",

        LLVMOrcThreadSafeContextRef("TSCtx")
    )

    LLVMOrcThreadSafeModuleRef(
        "OrcCreateNewThreadSafeModule",

        LLVMModuleRef("M"),
        LLVMOrcThreadSafeContextRef("TSCtx")
    )

    void(
        "OrcDisposeThreadSafeModule",

        LLVMOrcThreadSafeModuleRef("TSM")
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcThreadSafeModuleWithModuleDo",

        LLVMOrcThreadSafeModuleRef("TSM"),
        LLVMOrcGenericIRModuleOperationFunction("F"),
        opaque_p("Ctx")
    )

    LLVMErrorRef(
        "OrcJITTargetMachineBuilderDetectHost",

        Check(1)..LLVMOrcJITTargetMachineBuilderRef.p("Result")
    )

    LLVMOrcJITTargetMachineBuilderRef(
        "OrcJITTargetMachineBuilderCreateFromTargetMachine",

        LLVMTargetMachineRef("TM")
    )

    void(
        "OrcDisposeJITTargetMachineBuilder",

        LLVMOrcJITTargetMachineBuilderRef("JTMB")
    )

    IgnoreMissing..charUTF8.p(
        "OrcJITTargetMachineBuilderGetTargetTriple",

        LLVMOrcJITTargetMachineBuilderRef("JTMB")
    )

    IgnoreMissing..void(
        "OrcJITTargetMachineBuilderSetTargetTriple",

        LLVMOrcJITTargetMachineBuilderRef("JTMB"),
        charUTF8.const.p("TargetTriple")
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcObjectLayerAddObjectFile",

        LLVMOrcObjectLayerRef("ObjLayer"),
        LLVMOrcJITDylibRef("JD"),
        LLVMMemoryBufferRef("ObjBuffer")
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcObjectLayerAddObjectFileWithRT",

        LLVMOrcObjectLayerRef("ObjLayer"),
        LLVMOrcResourceTrackerRef("RT"),
        LLVMMemoryBufferRef("ObjBuffer")
    )

    IgnoreMissing..void(
        "OrcObjectLayerEmit",

        LLVMOrcObjectLayerRef("ObjLayer"),
        LLVMOrcMaterializationResponsibilityRef("R"),
        LLVMMemoryBufferRef("ObjBuffer")
    )

    void(
        "OrcDisposeObjectLayer",

        LLVMOrcObjectLayerRef("ObjLayer")
    )

    IgnoreMissing..void(
        "OrcIRTransformLayerEmit",

        LLVMOrcIRTransformLayerRef("IRTransformLayer"),
        LLVMOrcMaterializationResponsibilityRef("MR"),
        LLVMOrcThreadSafeModuleRef("TSM")
    )

    IgnoreMissing..void(
        "OrcIRTransformLayerSetTransform",

        LLVMOrcIRTransformLayerRef("IRTransformLayer"),
        LLVMOrcIRTransformLayerTransformFunction("TransformFunction"),
        opaque_p("Ctx")
    )

    IgnoreMissing..void(
        "OrcObjectTransformLayerSetTransform",

        LLVMOrcObjectTransformLayerRef("ObjTransformLayer"),
        LLVMOrcObjectTransformLayerTransformFunction("TransformFunction"),
        opaque_p("Ctx")
    )

    IgnoreMissing..LLVMOrcIndirectStubsManagerRef(
        "OrcCreateLocalIndirectStubsManager",

        charUTF8.const.p("TargetTriple")
    )

    IgnoreMissing..void(
        "OrcDisposeIndirectStubsManager",

        LLVMOrcIndirectStubsManagerRef("ISM")
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcCreateLocalLazyCallThroughManager",

        charUTF8.const.p("TargetTriple"),
        LLVMOrcExecutionSessionRef("ES"),
        LLVMOrcJITTargetAddress("ErrorHandlerAddr"),
        Check(1)..LLVMOrcLazyCallThroughManagerRef.p("LCTM")
    )

    IgnoreMissing..void(
        "OrcDisposeLazyCallThroughManager",

        LLVMOrcLazyCallThroughManagerRef("LCTM")
    )

    IgnoreMissing..LLVMOrcDumpObjectsRef(
        "OrcCreateDumpObjects",

        charUTF8.const.p("DumpDir"),
        charUTF8.const.p("IdentifierOverride")
    )

    IgnoreMissing..void(
        "OrcDisposeDumpObjects",

        LLVMOrcDumpObjectsRef("DumpObjects")
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcDumpObjects_CallOperator",

        LLVMOrcDumpObjectsRef("DumpObjects"),
        Check(1)..LLVMMemoryBufferRef.p("ObjBuffer")
    )
}
