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
    documentation = "Requires LLVM 12 or higher."

    EnumConstant(
        """
        Represents generic linkage flags for a symbol definition.

        ({@code LLVMJITSymbolGenericFlags})
        """,

        "JITSymbolGenericFlagsExported".enum("", "1 << 0"),
        "JITSymbolGenericFlagsWeak".enum("", "1 << 1"),
        "JITSymbolGenericFlagsCallable".enum("", "1 << 2"),
        "JITSymbolGenericFlagsMaterializationSideEffectsOnly".enum("", "1 << 3")
    )

    EnumConstant(
        """
        Lookup kind. ({@code LLVMOrcLookupKind})

        This can be used by definition generators when deciding whether to produce a definition for a requested symbol.

        This enum should be kept in sync with {@code llvm::orc::LookupKind}.
        """,

        "OrcLookupKindStatic".enum("", "0"),
        "OrcLookupKindDLSym".enum
    )

    EnumConstant(
        """
        {@code JITDylib} lookup flags. ({@code LLVMOrcJITDylibLookupFlags})

        This can be used by definition generators when deciding whether to produce a definition for a requested symbol.

        This enum should be kept in sync with {@code llvm::orc::JITDylibLookupFlags}.
        """,

        "OrcJITDylibLookupFlagsMatchExportedSymbolsOnly".enum("", "0"),
        "OrcJITDylibLookupFlagsMatchAllSymbols".enum
    )

    EnumConstant(
        """
        Symbol lookup flags for lookup sets. ({@code LLVMOrcSymbolLookupFlags})

        This should be kept in sync with {@code llvm::orc::SymbolLookupFlags}.
        """,

        "OrcSymbolLookupFlagsRequiredSymbol".enum("", "0"),
        "OrcSymbolLookupFlagsWeaklyReferencedSymbol".enum
    )

    void(
        "OrcExecutionSessionSetErrorReporter",
        """
        Attach a custom error reporter function to the {@code ExecutionSession}.

        The error reporter will be called to deliver failure notices that can not be directly reported to a caller. For example, failure to resolve symbols in
        the JIT linker is typically reported via the error reporter (callers requesting definitions from the JIT will typically be delivered a
        {@code FailureToMaterialize} error instead).
        """,

        LLVMOrcExecutionSessionRef("ES", ""),
        LLVMOrcErrorReporterFunction("ReportError", ""),
        opaque_p("Ctx", "")
    )

    LLVMOrcSymbolStringPoolRef(
        "OrcExecutionSessionGetSymbolStringPool",
        """
        Return a reference to the {@code SymbolStringPool} for an {@code ExecutionSession}.

        Ownership of the pool remains with the {@code ExecutionSession}: The caller is not required to free the pool.
        """,

        LLVMOrcExecutionSessionRef("ES", "")
    )

    void(
        "OrcSymbolStringPoolClearDeadEntries",
        """
        Clear all unreferenced symbol string pool entries.

        This can be called at any time to release unused entries in the {@code ExecutionSession}'s string pool. Since it locks the pool (preventing interning
        of any new strings) it is recommended that it only be called infrequently, ideally when the caller has reason to believe that some entries will have
        become unreferenced, e.g. after removing a module or closing a {@code JITDylib}.
        """,

        LLVMOrcSymbolStringPoolRef("SSP", "")
    )

    LLVMOrcSymbolStringPoolEntryRef(
        "OrcExecutionSessionIntern",
        """
        Intern a string in the {@code ExecutionSession}'s {@code SymbolStringPool} and return a reference to it. This increments the ref-count of the pool
        entry, and the returned value should be released once the client is done with it by calling #OrcReleaseSymbolStringPoolEntry().

        Since strings are uniqued within the {@code SymbolStringPool} {@code LLVMOrcSymbolStringPoolEntryRefs} can be compared by value to test string
        equality.

        Note that this function does not perform linker-mangling on the string.
        """,

        LLVMOrcExecutionSessionRef("ES", ""),
        charUTF8.const.p("Name", "")
    )

    void(
        "OrcRetainSymbolStringPoolEntry",
        "Increments the ref-count for a {@code SymbolStringPool} entry.",

        LLVMOrcSymbolStringPoolEntryRef("S", "")
    )

    void(
        "OrcReleaseSymbolStringPoolEntry",
        "Reduces the ref-count for of a {@code SymbolStringPool} entry.",

        LLVMOrcSymbolStringPoolEntryRef("S", "")
    )

    charUTF8.const.p(
        "OrcSymbolStringPoolEntryStr",
        "",

        LLVMOrcSymbolStringPoolEntryRef("S", "")
    )

    void(
        "OrcReleaseResourceTracker",
        "Reduces the ref-count of a {@code ResourceTracker}.",

        LLVMOrcResourceTrackerRef("RT", "")
    )

    void(
        "OrcResourceTrackerTransferTo",
        "Transfers tracking of all resources associated with resource tracker {@code SrcRT} to resource tracker {@code DstRT}.",

        LLVMOrcResourceTrackerRef("SrcRT", ""),
        LLVMOrcResourceTrackerRef("DstRT", "")
    )

    LLVMErrorRef(
        "OrcResourceTrackerRemove",
        "Remove all resources associated with the given tracker. See ResourceTracker::remove().",

        LLVMOrcResourceTrackerRef("RT", "")
    )

    void(
        "OrcDisposeDefinitionGenerator",
        """
        Dispose of a {@code JITDylib::DefinitionGenerator}. This should only be called if ownership has not been passed to a {@code JITDylib} (e.g. because
        some error prevented the client from calling #OrcJITDylibAddGenerator()).
        """,

        LLVMOrcDefinitionGeneratorRef("DG", "")
    )

    void(
        "OrcDisposeMaterializationUnit",
        "Dispose of a {@code MaterializationUnit}.",

        LLVMOrcMaterializationUnitRef("MU", "")
    )

    IgnoreMissing..LLVMOrcMaterializationUnitRef(
        "OrcCreateCustomMaterializationUnit",
        """
        Create a custom {@code MaterializationUnit}.

        Name is a name for this {@code MaterializationUnit} to be used for identification and logging purposes (e.g. if this {@code MaterializationUnit}
        produces an object buffer then the name of that buffer will be derived from this name).

        The {@code Syms} list contains the names and linkages of the symbols provided by this unit. This function takes ownership of the elements of the
        {@code Syms} array. The {@code Name} fields of the array elements are taken to have been retained for this function. The client should <b>not</b>
        release the elements of the array, but is still responsible for destroying the array itself.

        The {@code InitSym} argument indicates whether or not this {@code MaterializationUnit} contains static initializers. If there are no static
        initializers (the common case) then this argument should be null. If there are static initializers then {@code InitSym} should be set to a unique name
        that also appears in the {@code Syms} list with the #JITSymbolGenericFlagsMaterializationSideEffectsOnly flag set. This function takes ownership of the
        {@code InitSym}, which should have been retained twice on behalf of this function: once for the {@code Syms} entry and once for {@code InitSym}. If
        clients wish to use the {@code InitSym} value after this function returns they must retain it once more for themselves.

        If any of the symbols in the {@code Syms} list is looked up then the {@code Materialize} function will be called.

        If any of the symbols in the {@code Syms} list is overridden then the {@code Discard} function will be called.

        The caller owns the underling {@code MaterializationUnit} and is responsible for either passing it to a {@code JITDylib} (via #OrcJITDylibDefine()) or
        disposing of it by calling #OrcDisposeMaterializationUnit().
        """,

        charUTF8.const.p("Name", ""),
        opaque_p("Ctx", ""),
        LLVMOrcCSymbolFlagsMapPairs("Syms", ""),
        AutoSize("Syms")..size_t("NumSyms", ""),
        nullable..LLVMOrcSymbolStringPoolEntryRef("InitSym", ""),
        LLVMOrcMaterializationUnitMaterializeFunction("Materialize", ""),
        LLVMOrcMaterializationUnitDiscardFunction("Discard", ""),
        LLVMOrcMaterializationUnitDestroyFunction("Destroy", ""),

        since = "13"
    )

    LLVMOrcMaterializationUnitRef(
        "OrcAbsoluteSymbols",
        """
        Create a {@code MaterializationUnit} to define the given symbols as pointing to the corresponding raw addresses.

        This function takes ownership of the elements of the Syms array. The {@code Name} fields of the array elements are taken to have been retained for this
        function. This allows the following pattern...
        ${codeBlock("""
size_t NumPairs;
LLVMOrcCSymbolMapPairs Sym;
-- Build Syms array --
LLVMOrcMaterializationUnitRef MU =
    LLVMOrcAbsoluteSymbols(Syms, NumPairs);""")}

        ... without requiring cleanup of the elements of the {@code Sym} array afterwards.

        The client is still responsible for deleting the {@code Sym} array itself.

        If a client wishes to reuse elements of the {@code Sym} array after this call they must explicitly retain each of the elements for themselves.
        """,

        LLVMOrcCSymbolMapPairs("Syms", ""),
        AutoSize("Syms")..size_t("NumPairs", "")
    )

    IgnoreMissing..LLVMOrcMaterializationUnitRef(
        "OrcLazyReexports",
        """
        Create a {@code MaterializationUnit} to define lazy re-expots. These are callable entry points that call through to the given symbols.

        This function takes ownership of the {@code CallableAliases} array. The {@code Name} fields of the array elements are taken to have been retained for
        this function. This allows the following pattern...
        ${codeBlock("""
size_t NumPairs;
LLVMOrcCSymbolAliasMapPairs CallableAliases;
-- Build CallableAliases array --
LLVMOrcMaterializationUnitRef MU =
    LLVMOrcLazyReexports(LCTM, ISM, JD, CallableAliases, NumPairs);""")}

        ... without requiring cleanup of the elements of the {@code CallableAliases} array afterwards.

        The client is still responsible for deleting the {@code CallableAliases} array itself.

        If a client wishes to reuse elements of the {@code CallableAliases} array after this call they must explicitly retain each of the elements for themselves.
        """,

        LLVMOrcLazyCallThroughManagerRef("LCTM", ""),
        LLVMOrcIndirectStubsManagerRef("ISM", ""),
        LLVMOrcJITDylibRef("SourceRef", ""),
        LLVMOrcCSymbolAliasMapPairs("CallableAliases", ""),
        AutoSize("CallableAliases")..size_t("NumPairs", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "OrcDisposeMaterializationResponsibility",
        """
        Disposes of the passed {@code MaterializationResponsibility} object.

        This should only be done after the symbols covered by the object have either been resolved and emitted (via
        #OrcMaterializationResponsibilityNotifyResolved() and #OrcMaterializationResponsibilityNotifyEmitted()) or failed (via
        #OrcMaterializationResponsibilityFailMaterialization()).
        """,

        LLVMOrcMaterializationResponsibilityRef("MR", ""),

        since = "13"
    )

    IgnoreMissing..LLVMOrcJITDylibRef(
        "OrcMaterializationResponsibilityGetTargetDylib",
        "Returns the target {@code JITDylib} that these symbols are being materialized into.",

        LLVMOrcMaterializationResponsibilityRef("MR", ""),

        since = "13"
    )

    IgnoreMissing..LLVMOrcExecutionSessionRef(
        "OrcMaterializationResponsibilityGetExecutionSession",
        "Returns the {@code ExecutionSession} for this {@code MaterializationResponsibility}.",

        LLVMOrcMaterializationResponsibilityRef("MR", ""),

        since = "13"
    )

    IgnoreMissing..LLVMOrcCSymbolFlagsMapPairs(
        "OrcMaterializationResponsibilityGetSymbols",
        """
        Returns the symbol flags map for this responsibility instance.

        The length of the array is returned in {@code NumPairs} and the caller is responsible for the returned memory and needs to call
        #OrcDisposeCSymbolFlagsMap().

        To use the returned symbols beyond the livetime of the {@code MaterializationResponsibility} requires the caller to retain the symbols explicitly.
        """,

        LLVMOrcMaterializationResponsibilityRef("MR", ""),
        AutoSizeResult..Check(1)..size_t.p("NumPairs", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "OrcDisposeCSymbolFlagsMap",
        """
        Disposes of the passed {@code LLVMOrcCSymbolFlagsMap}.

        Does not release the entries themselves.
        """,

        LLVMOrcCSymbolFlagsMapPairs("Pairs", ""),

        since = "13"
    )

    IgnoreMissing..LLVMOrcSymbolStringPoolEntryRef(
        "OrcMaterializationResponsibilityGetInitializerSymbol",
        """
        Returns the initialization pseudo-symbol, if any. This symbol will also be present in the {@code SymbolFlagsMap} for this
        {@code MaterializationResponsibility} object.

        The returned symbol is not retained over any mutating operation of the {@code MaterializationResponsbility} or beyond the lifetime thereof.
        """,

        LLVMOrcMaterializationResponsibilityRef("MR", ""),

        since = "13"
    )

    IgnoreMissing..LLVMOrcSymbolStringPoolEntryRef.p(
        "OrcMaterializationResponsibilityGetRequestedSymbols",
        """
        Returns the names of any symbols covered by this {@code MaterializationResponsibility} object that have queries pending. This information can be used
        to return responsibility for unrequested symbols back to the {@code JITDylib} via the delegate method.
        """,

        LLVMOrcMaterializationResponsibilityRef("MR", ""),
        AutoSizeResult..Check(1)..size_t.p("NumSymbols", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "OrcDisposeSymbols",
        """
        Disposes of the passed {@code LLVMOrcSymbolStringPoolEntryRef*}.

        Does not release the symbols themselves.
        """,

        Unsafe..LLVMOrcSymbolStringPoolEntryRef.p("Symbols", ""),

        since = "13"
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcMaterializationResponsibilityNotifyResolved",
        """
        Notifies the target {@code JITDylib} that the given symbols have been resolved. This will update the given symbols' addresses in the {@code JITDylib},
        and notify any pending queries on the given symbols of their resolution. The given symbols must be ones covered by this
        {@code MaterializationResponsibility} instance. Individual calls to this method may resolve a subset of the symbols, but all symbols must have been
        resolved prior to calling emit.

        This method will return an error if any symbols being resolved have been moved to the error state due to the failure of a dependency. If this method
        returns an error then clients should log it and call #OrcMaterializationResponsibilityFailMaterialization(). If no dependencies have been registered
        for the symbols covered by this {@code MaterializationResponsibility} then this method is guaranteed to return #ErrorSuccess.
        """,

        LLVMOrcMaterializationResponsibilityRef("MR", ""),
        LLVMOrcCSymbolMapPairs("Symbols", ""),
        AutoSize("Symbols")..size_t("NumPairs", ""),

        since = "13"
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcMaterializationResponsibilityNotifyEmitted",
        """
        Notifies the target {@code JITDylib} (and any pending queries on that {@code JITDylib}) that all symbols covered by this
        {@code MaterializationResponsibility} instance have been emitted.

        This method will return an error if any symbols being resolved have been moved to the error state due to the failure of a dependency. If this method
        returns an error then clients should log it and call #OrcMaterializationResponsibilityFailMaterialization(). If no dependencies have been registered
        for the symbols covered by this {@code MaterializationResponsibiility} then this method is guaranteed to return #ErrorSuccess.
        """,

        LLVMOrcMaterializationResponsibilityRef("MR", ""),

        since = "13"
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcMaterializationResponsibilityDefineMaterializing",
        """
        Attempt to claim responsibility for new definitions. This method can be used to claim responsibility for symbols that are added to a materialization
        unit during the compilation process (e.g. literal pool symbols). Symbol linkage rules are the same as for symbols that are defined up front: duplicate
        strong definitions will result in errors. Duplicate weak definitions will be discarded (in which case they will not be added to this responsibility
        instance).

        This method can be used by materialization units that want to add additional symbols at materialization time (e.g. stubs, compile callbacks, metadata)
        """,

        LLVMOrcMaterializationResponsibilityRef("MR", ""),
        LLVMOrcCSymbolFlagsMapPairs("Pairs", ""),
        AutoSize("Pairs")..size_t("NumPairs", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "OrcMaterializationResponsibilityFailMaterialization",
        """
        Notify all not-yet-emitted covered by this {@code MaterializationResponsibility} instance that an error has occurred. This will remove all symbols
        covered by this {@code MaterializationResponsibilty} from the target {@code JITDylib}, and send an error to any queries waiting on these symbols.
        """,

        LLVMOrcMaterializationResponsibilityRef("MR", ""),

        since = "13"
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcMaterializationResponsibilityReplace",
        """
        Transfers responsibility to the given {@code MaterializationUnit} for all symbols defined by that {@code MaterializationUnit}. This allows
        materializers to break up work based on run-time information (e.g. by introspecting which symbols have actually been looked up and materializing only
        those).
        """,

        LLVMOrcMaterializationResponsibilityRef("MR", ""),
        LLVMOrcMaterializationUnitRef("MU", ""),

        since = "13"
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcMaterializationResponsibilityDelegate",
        """
        Delegates responsibility for the given symbols to the returned materialization responsibility. Useful for breaking up work between threads, or
        different kinds of materialization processes.

        The caller retains responsibility of the the passed {@code MaterializationResponsibility}.
        """,

        LLVMOrcMaterializationResponsibilityRef("MR", ""),
        LLVMOrcSymbolStringPoolEntryRef.p("Symbols", ""),
        AutoSize("Symbols")..size_t("NumSymbols", ""),
        Check(1)..LLVMOrcMaterializationResponsibilityRef.p("Result", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "OrcMaterializationResponsibilityAddDependencies",
        """
        Adds dependencies to a symbol that the {@code MaterializationResponsibility} is responsible for.

        This function takes ownership of {@code Dependencies} struct. The {@code Names} array have been retained for this function. This allows the following
        pattern...
        ${codeBlock("""
LLVMOrcSymbolStringPoolEntryRef Names[] = {...};
LLVMOrcCDependenceMapPair Dependence = {JD, {Names, sizeof(Names)}}
LLVMOrcMaterializationResponsibilityAddDependencies(JD, Name, &Dependence, 1);""")}

        ... without requiring cleanup of the elements of the {@code Names} array afterwards.

        The client is still responsible for deleting the {@code Dependencies.Names} array itself.
        """,

        LLVMOrcMaterializationResponsibilityRef("MR", ""),
        LLVMOrcSymbolStringPoolEntryRef("Name", ""),
        LLVMOrcCDependenceMapPairs("Dependencies", ""),
        AutoSize("Dependencies")..size_t("NumPairs", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "OrcMaterializationResponsibilityAddDependenciesForAll",
        """
        Adds dependencies to all symbols that the {@code MaterializationResponsibility} is responsible for. See
        #OrcMaterializationResponsibilityAddDependencies() for notes about memory responsibility.
        """,

        LLVMOrcMaterializationResponsibilityRef("MR", ""),
        LLVMOrcCDependenceMapPairs("Dependencies", ""),
        AutoSize("Dependencies")..size_t("NumPairs", ""),

        since = "13"
    )

    LLVMOrcJITDylibRef(
        "OrcExecutionSessionCreateBareJITDylib",
        """
        Create a "bare" {@code JITDylib}.

        The client is responsible for ensuring that the {@code JITDylib}'s name is unique, e.g. by calling #OrcExecutionSessionGetJITDylibByName() first.

        This call does not install any library code or symbols into the newly created {@code JITDylib}. The client is responsible for all configuration.
        """,

        LLVMOrcExecutionSessionRef("ES", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMErrorRef(
        "OrcExecutionSessionCreateJITDylib",
        """
        Create a {@code JITDylib}.

        The client is responsible for ensuring that the {@code JITDylib}'s name is unique, e.g. by calling #OrcExecutionSessionGetJITDylibByName() first.

        If a {@code Platform} is attached to the {@code ExecutionSession} then {@code Platform::setupJITDylib} will be called to install standard platform
        symbols (e.g. standard library interposes). If no {@code Platform} is installed then this call is equivalent to
        #OrcExecutionSessionCreateBareJITDylib() and will always return success.
        """,

        LLVMOrcExecutionSessionRef("ES", ""),
        Check(1)..LLVMOrcJITDylibRef.p("Result", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMOrcJITDylibRef(
        "OrcExecutionSessionGetJITDylibByName",
        "Returns the {@code JITDylib} with the given name, or #NULL if no such {@code JITDylib} exists.",

        LLVMOrcExecutionSessionRef("ES", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMOrcResourceTrackerRef(
        "OrcJITDylibCreateResourceTracker",
        """
        Return a reference to a newly created resource tracker associated with {@code JD}. The tracker is returned with an initial ref-count of 1, and must be
        released with #OrcReleaseResourceTracker() when no longer needed.
        """,

        LLVMOrcJITDylibRef("JD", "")
    )

    LLVMOrcResourceTrackerRef(
        "OrcJITDylibGetDefaultResourceTracker",
        """
        Return a reference to the default resource tracker for the given {@code JITDylib}. This operation will increase the retain count of the tracker:
        Clients should call #OrcReleaseResourceTracker() when the result is no longer needed.
        """,

        LLVMOrcJITDylibRef("JD", "")
    )

    LLVMErrorRef(
        "OrcJITDylibDefine",
        """
        Add the given {@code MaterializationUnit} to the given {@code JITDylib}.

        If this operation succeeds then {@code JITDylib} {@code JD} will take ownership of {@code MU}. If the operation fails then ownership remains with the
        caller who should call #OrcDisposeMaterializationUnit() to destroy it.
        """,

        LLVMOrcJITDylibRef("JD", ""),
        LLVMOrcMaterializationUnitRef("MU", "")
    )

    LLVMErrorRef(
        "OrcJITDylibClear",
        "Calls remove on all trackers associated with this {@code JITDylib}, see {@code JITDylib::clear()}.",

        LLVMOrcJITDylibRef("JD", "")
    )

    void(
        "OrcJITDylibAddGenerator",
        """
        Add a {@code DefinitionGenerator} to the given {@code JITDylib}.

        The {@code JITDylib} will take ownership of the given generator: The client is no longer responsible for managing its memory.
        """,

        LLVMOrcJITDylibRef("JD", ""),
        LLVMOrcDefinitionGeneratorRef("DG", "")
    )

    LLVMOrcDefinitionGeneratorRef(
        "OrcCreateCustomCAPIDefinitionGenerator",
        "Create a custom generator.",

        LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction("F", ""),
        opaque_p("Ctx", "")
    )

    LLVMErrorRef(
        "OrcCreateDynamicLibrarySearchGeneratorForProcess",
        """
        Get a {@code DynamicLibrarySearchGenerator} that will reflect process symbols into the {@code JITDylib}. On success the resulting generator is owned by
        the client. Ownership is typically transferred by adding the instance to a {@code JITDylib} using #OrcJITDylibAddGenerator().

        The {@code GlobalPrefix} argument specifies the character that appears on the front of linker-mangled symbols for the target platform (e.g. '_' on
        MachO). If non-null, this character will be stripped from the start of all symbol strings before passing the remaining substring to {@code dlsym}.

        The optional {@code Filter} and {@code Ctx} arguments can be used to supply a symbol name filter: Only symbols for which the filter returns true will
        be visible to JIT'd code. If the {@code Filter} argument is null then all process symbols will be visible to JIT'd code. Note that the symbol name
        passed to the {@code Filter} function is the full mangled symbol: The client is responsible for stripping the global prefix if present.
        """,

        Check(1)..LLVMOrcDefinitionGeneratorRef.p("Result", ""),
        char("GlobalPrefx", ""),
        nullable..LLVMOrcSymbolPredicate("Filter", ""),
        nullable..opaque_p("FilterCtx", "")
    )

    LLVMOrcThreadSafeContextRef(
        "OrcCreateNewThreadSafeContext",
        """
        Create a {@code ThreadSafeContext} containing a new {@code LLVMContext}.

        Ownership of the underlying {@code ThreadSafeContext} data is shared: Clients can and should dispose of their {@code ThreadSafeContext} as soon as they
        no longer need to refer to it directly. Other references (e.g. from {@code ThreadSafeModules}) will keep the data alive as long as it is needed.
        """,

        void()
    )

    LLVMContextRef(
        "OrcThreadSafeContextGetContext",
        "Get a reference to the wrapped {@code LLVMContext}.",

        LLVMOrcThreadSafeContextRef("TSCtx", "")
    )

    void(
        "OrcDisposeThreadSafeContext",
        "Dispose of a {@code ThreadSafeContext}.",

        LLVMOrcThreadSafeContextRef("TSCtx", "")
    )

    LLVMOrcThreadSafeModuleRef(
        "OrcCreateNewThreadSafeModule",
        """
        Create a {@code ThreadSafeModule} wrapper around the given LLVM module. This takes ownership of the M argument which should not be disposed of or
        referenced after this function returns.

        Ownership of the {@code ThreadSafeModule} is unique: If it is transferred to the JIT (e.g. by #OrcLLJITAddLLVMIRModule()) then the client is no longer
        responsible for it. If it is not transferred to the JIT then the client should call #OrcDisposeThreadSafeModule() to dispose of it.
        """,

        LLVMModuleRef("M", ""),
        LLVMOrcThreadSafeContextRef("TSCtx", "")
    )

    void(
        "OrcDisposeThreadSafeModule",
        """
        Dispose of a {@code ThreadSafeModule}. This should only be called if ownership has not been passed to LLJIT (e.g. because some error prevented the
        client from adding this to the JIT).
        """,

        LLVMOrcThreadSafeModuleRef("TSM", "")
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcThreadSafeModuleWithModuleDo",
        "Apply the given function to the module contained in this {@code ThreadSafeModule}.",

        LLVMOrcThreadSafeModuleRef("TSM", ""),
        LLVMOrcGenericIRModuleOperationFunction("F", ""),
        opaque_p("Ctx", ""),

        since = "13"
    )

    LLVMErrorRef(
        "OrcJITTargetMachineBuilderDetectHost",
        """
        Create a {@code JITTargetMachineBuilder} by detecting the host.

        On success the client owns the resulting {@code JITTargetMachineBuilder}. It must be passed to a consuming operation (e.g.
        #OrcLLJITBuilderSetJITTargetMachineBuilder()) or disposed of by calling #OrcDisposeJITTargetMachineBuilder().
        """,

        Check(1)..LLVMOrcJITTargetMachineBuilderRef.p("Result", "")
    )

    LLVMOrcJITTargetMachineBuilderRef(
        "OrcJITTargetMachineBuilderCreateFromTargetMachine",
        """
        Create a {@code JITTargetMachineBuilder} from the given {@code TargetMachine} template.

        This operation takes ownership of the given {@code TargetMachine} and destroys it before returing. The resulting {@code JITTargetMachineBuilder} is
        owned by the client and must be passed to a consuming operation (e.g. #OrcLLJITBuilderSetJITTargetMachineBuilder()) or disposed of by calling
        #OrcDisposeJITTargetMachineBuilder().
        """,

        LLVMTargetMachineRef("TM", "")
    )

    void(
        "OrcDisposeJITTargetMachineBuilder",
        "Dispose of a {@code JITTargetMachineBuilder}.",

        LLVMOrcJITTargetMachineBuilderRef("JTMB", "")
    )

    IgnoreMissing..charUTF8.p(
        "OrcJITTargetMachineBuilderGetTargetTriple",
        """
        Returns the target triple for the given {@code JITTargetMachineBuilder} as a string.

        The caller owns the resulting string as must dispose of it by calling {@code LLVMDisposeMessage}.
        """,

        LLVMOrcJITTargetMachineBuilderRef("JTMB", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "OrcJITTargetMachineBuilderSetTargetTriple",
        "Sets the target triple for the given {@code JITTargetMachineBuilder} to the given string.",

        LLVMOrcJITTargetMachineBuilderRef("JTMB", ""),
        charUTF8.const.p("TargetTriple", ""),

        since = "13"
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcObjectLayerAddObjectFile",
        """
        Add an object to an {@code ObjectLayer} to the given {@code JITDylib}.

        Adds a buffer representing an object file to the given {@code JITDylib} using the given ObjectLayer instance. This operation transfers ownership of the
        buffer to the {@code ObjectLayer} instance. The buffer should not be disposed of or referenced once this function returns.

        Resources associated with the given object will be tracked by the given {@code JITDylib}'s default {@code ResourceTracker}.
        """,

        LLVMOrcObjectLayerRef("ObjLayer", ""),
        LLVMOrcJITDylibRef("JD", ""),
        LLVMMemoryBufferRef("ObjBuffer", ""),

        since = "13"
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcObjectLayerAddObjectFileWithRT",
        """
        Add an object to an {@code ObjectLayer} using the given {@code ResourceTracker}.

        Adds a buffer representing an object file to the given {@code ResourceTracker}'s {@code JITDylib} using the given {@code ObjectLayer} instance. This
        operation transfers ownership of the buffer to the {@code ObjectLayer} instance. The buffer should not be disposed of or referenced once this function
        returns.

        Resources associated with the given object will be tracked by {@code ResourceTracker} {@code RT}.
        """,

        LLVMOrcObjectLayerRef("ObjLayer", ""),
        LLVMOrcResourceTrackerRef("RT", ""),
        LLVMMemoryBufferRef("ObjBuffer", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "OrcObjectLayerEmit",
        """
        Emit an object buffer to an {@code ObjectLayer}.

        Ownership of the responsibility object and object buffer pass to this function. The client is not responsible for cleanup.
        """,

        LLVMOrcObjectLayerRef("ObjLayer", ""),
        LLVMOrcMaterializationResponsibilityRef("R", ""),
        LLVMMemoryBufferRef("ObjBuffer", ""),

        since = "13"
    )

    void(
        "OrcDisposeObjectLayer",
        "Dispose of an {@code ObjectLayer}.",

        LLVMOrcObjectLayerRef("ObjLayer", "")
    )

    IgnoreMissing..void(
        "OrcIRTransformLayerEmit",
        "",

        LLVMOrcIRTransformLayerRef("IRTransformLayer", ""),
        LLVMOrcMaterializationResponsibilityRef("MR", ""),
        LLVMOrcThreadSafeModuleRef("TSM", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "OrcIRTransformLayerSetTransform",
        "Set the transform function of the provided transform layer, passing through a pointer to user provided context.",

        LLVMOrcIRTransformLayerRef("IRTransformLayer", ""),
        LLVMOrcIRTransformLayerTransformFunction("TransformFunction", ""),
        opaque_p("Ctx", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "OrcObjectTransformLayerSetTransform",
        "Set the transform function on an {@code LLVMOrcObjectTransformLayer}.",

        LLVMOrcObjectTransformLayerRef("ObjTransformLayer", ""),
        LLVMOrcObjectTransformLayerTransformFunction("TransformFunction", ""),
        opaque_p("Ctx", ""),

        since = "13"
    )

    IgnoreMissing..LLVMOrcIndirectStubsManagerRef(
        "OrcCreateLocalIndirectStubsManager",
        """
        Create a {@code LocalIndirectStubsManager} from the given target triple.

        The resulting {@code IndirectStubsManager} is owned by the client and must be disposed of by calling #OrcDisposeIndirectStubsManager().
        """,

        charUTF8.const.p("TargetTriple", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "OrcDisposeIndirectStubsManager",
        "Dispose of an {@code IndirectStubsManager}.",

        LLVMOrcIndirectStubsManagerRef("ISM", ""),

        since = "13"
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcCreateLocalLazyCallThroughManager",
        "",

        charUTF8.const.p("TargetTriple", ""),
        LLVMOrcExecutionSessionRef("ES", ""),
        LLVMOrcJITTargetAddress("ErrorHandlerAddr", ""),
        Check(1)..LLVMOrcLazyCallThroughManagerRef.p("LCTM", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "OrcDisposeLazyCallThroughManager",
        "Dispose of an {@code LazyCallThroughManager}.",

        LLVMOrcLazyCallThroughManagerRef("LCTM", ""),

        since = "13"
    )

    IgnoreMissing..LLVMOrcDumpObjectsRef(
        "OrcCreateDumpObjects",
        """
        Create a {@code DumpObjects} instance.

        {@code DumpDir} specifies the path to write dumped objects to. {@code DumpDir} may be empty in which case files will be dumped to the working
        directory.

        {@code IdentifierOverride} specifies a file name stem to use when dumping objects. If empty then each {@code MemoryBuffer}'s identifier will be used
        (with a .o suffix added if not already present). If an identifier override is supplied it will be used instead, along with an incrementing counter
        (since all buffers will use the same identifier, the resulting files will be named {@code <ident>.o}, {@code <ident>.2.o}, {@code <ident>.3.o}, and so
        on). IdentifierOverride should not contain an extension, as a .o suffix will be added by {@code DumpObjects}.
        """,

        charUTF8.const.p("DumpDir", ""),
        charUTF8.const.p("IdentifierOverride", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "OrcDisposeDumpObjects",
        "Dispose of a {@code DumpObjects} instance.",

        LLVMOrcDumpObjectsRef("DumpObjects", ""),

        since = "13"
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcDumpObjects_CallOperator",
        "Dump the contents of the given {@code MemoryBuffer}.",

        LLVMOrcDumpObjectsRef("DumpObjects", ""),
        Check(1)..LLVMMemoryBufferRef.p("ObjBuffer", ""),

        since = "13"
    )
}
