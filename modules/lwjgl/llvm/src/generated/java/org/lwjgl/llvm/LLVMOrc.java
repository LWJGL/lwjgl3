/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Requires LLVM 12 or higher. */
public class LLVMOrc {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            OrcExecutionSessionSetErrorReporter                   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcExecutionSessionSetErrorReporter"),
            OrcExecutionSessionGetSymbolStringPool                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcExecutionSessionGetSymbolStringPool"),
            OrcSymbolStringPoolClearDeadEntries                   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcSymbolStringPoolClearDeadEntries"),
            OrcExecutionSessionIntern                             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcExecutionSessionIntern"),
            OrcRetainSymbolStringPoolEntry                        = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcRetainSymbolStringPoolEntry"),
            OrcReleaseSymbolStringPoolEntry                       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcReleaseSymbolStringPoolEntry"),
            OrcSymbolStringPoolEntryStr                           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcSymbolStringPoolEntryStr"),
            OrcReleaseResourceTracker                             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcReleaseResourceTracker"),
            OrcResourceTrackerTransferTo                          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcResourceTrackerTransferTo"),
            OrcResourceTrackerRemove                              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcResourceTrackerRemove"),
            OrcDisposeDefinitionGenerator                         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcDisposeDefinitionGenerator"),
            OrcDisposeMaterializationUnit                         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcDisposeMaterializationUnit"),
            OrcCreateCustomMaterializationUnit                    = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcCreateCustomMaterializationUnit"),
            OrcAbsoluteSymbols                                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcAbsoluteSymbols"),
            OrcLazyReexports                                      = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcLazyReexports"),
            OrcDisposeMaterializationResponsibility               = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcDisposeMaterializationResponsibility"),
            OrcMaterializationResponsibilityGetTargetDylib        = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcMaterializationResponsibilityGetTargetDylib"),
            OrcMaterializationResponsibilityGetExecutionSession   = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcMaterializationResponsibilityGetExecutionSession"),
            OrcMaterializationResponsibilityGetSymbols            = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcMaterializationResponsibilityGetSymbols"),
            OrcDisposeCSymbolFlagsMap                             = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcDisposeCSymbolFlagsMap"),
            OrcMaterializationResponsibilityGetInitializerSymbol  = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcMaterializationResponsibilityGetInitializerSymbol"),
            OrcMaterializationResponsibilityGetRequestedSymbols   = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcMaterializationResponsibilityGetRequestedSymbols"),
            OrcDisposeSymbols                                     = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcDisposeSymbols"),
            OrcMaterializationResponsibilityNotifyResolved        = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcMaterializationResponsibilityNotifyResolved"),
            OrcMaterializationResponsibilityNotifyEmitted         = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcMaterializationResponsibilityNotifyEmitted"),
            OrcMaterializationResponsibilityDefineMaterializing   = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcMaterializationResponsibilityDefineMaterializing"),
            OrcMaterializationResponsibilityFailMaterialization   = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcMaterializationResponsibilityFailMaterialization"),
            OrcMaterializationResponsibilityReplace               = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcMaterializationResponsibilityReplace"),
            OrcMaterializationResponsibilityDelegate              = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcMaterializationResponsibilityDelegate"),
            OrcMaterializationResponsibilityAddDependencies       = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcMaterializationResponsibilityAddDependencies"),
            OrcMaterializationResponsibilityAddDependenciesForAll = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcMaterializationResponsibilityAddDependenciesForAll"),
            OrcExecutionSessionCreateBareJITDylib                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcExecutionSessionCreateBareJITDylib"),
            OrcExecutionSessionCreateJITDylib                     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcExecutionSessionCreateJITDylib"),
            OrcExecutionSessionGetJITDylibByName                  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcExecutionSessionGetJITDylibByName"),
            OrcJITDylibCreateResourceTracker                      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcJITDylibCreateResourceTracker"),
            OrcJITDylibGetDefaultResourceTracker                  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcJITDylibGetDefaultResourceTracker"),
            OrcJITDylibDefine                                     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcJITDylibDefine"),
            OrcJITDylibClear                                      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcJITDylibClear"),
            OrcJITDylibAddGenerator                               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcJITDylibAddGenerator"),
            OrcCreateCustomCAPIDefinitionGenerator                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcCreateCustomCAPIDefinitionGenerator"),
            OrcCreateDynamicLibrarySearchGeneratorForProcess      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcCreateDynamicLibrarySearchGeneratorForProcess"),
            OrcCreateNewThreadSafeContext                         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcCreateNewThreadSafeContext"),
            OrcThreadSafeContextGetContext                        = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcThreadSafeContextGetContext"),
            OrcDisposeThreadSafeContext                           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcDisposeThreadSafeContext"),
            OrcCreateNewThreadSafeModule                          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcCreateNewThreadSafeModule"),
            OrcDisposeThreadSafeModule                            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcDisposeThreadSafeModule"),
            OrcThreadSafeModuleWithModuleDo                       = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcThreadSafeModuleWithModuleDo"),
            OrcJITTargetMachineBuilderDetectHost                  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcJITTargetMachineBuilderDetectHost"),
            OrcJITTargetMachineBuilderCreateFromTargetMachine     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcJITTargetMachineBuilderCreateFromTargetMachine"),
            OrcDisposeJITTargetMachineBuilder                     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcDisposeJITTargetMachineBuilder"),
            OrcJITTargetMachineBuilderGetTargetTriple             = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcJITTargetMachineBuilderGetTargetTriple"),
            OrcJITTargetMachineBuilderSetTargetTriple             = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcJITTargetMachineBuilderSetTargetTriple"),
            OrcObjectLayerAddObjectFile                           = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcObjectLayerAddObjectFile"),
            OrcObjectLayerAddObjectFileWithRT                     = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcObjectLayerAddObjectFileWithRT"),
            OrcObjectLayerEmit                                    = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcObjectLayerEmit"),
            OrcDisposeObjectLayer                                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcDisposeObjectLayer"),
            OrcIRTransformLayerEmit                               = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcIRTransformLayerEmit"),
            OrcIRTransformLayerSetTransform                       = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcIRTransformLayerSetTransform"),
            OrcObjectTransformLayerSetTransform                   = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcObjectTransformLayerSetTransform"),
            OrcCreateLocalIndirectStubsManager                    = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcCreateLocalIndirectStubsManager"),
            OrcDisposeIndirectStubsManager                        = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcDisposeIndirectStubsManager"),
            OrcCreateLocalLazyCallThroughManager                  = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcCreateLocalLazyCallThroughManager"),
            OrcDisposeLazyCallThroughManager                      = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcDisposeLazyCallThroughManager"),
            OrcCreateDumpObjects                                  = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcCreateDumpObjects"),
            OrcDisposeDumpObjects                                 = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcDisposeDumpObjects"),
            OrcDumpObjects_CallOperator                           = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcDumpObjects_CallOperator");

    }

    /**
     * Represents generic linkage flags for a symbol definition.
     * 
     * <p>({@code LLVMJITSymbolGenericFlags})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMJITSymbolGenericFlagsExported JITSymbolGenericFlagsExported}</li>
     * <li>{@link #LLVMJITSymbolGenericFlagsWeak JITSymbolGenericFlagsWeak}</li>
     * <li>{@link #LLVMJITSymbolGenericFlagsCallable JITSymbolGenericFlagsCallable}</li>
     * <li>{@link #LLVMJITSymbolGenericFlagsMaterializationSideEffectsOnly JITSymbolGenericFlagsMaterializationSideEffectsOnly}</li>
     * </ul>
     */
    public static final int
        LLVMJITSymbolGenericFlagsExported                       = 1 << 0,
        LLVMJITSymbolGenericFlagsWeak                           = 1 << 1,
        LLVMJITSymbolGenericFlagsCallable                       = 1 << 2,
        LLVMJITSymbolGenericFlagsMaterializationSideEffectsOnly = 1 << 3;

    /**
     * Lookup kind. ({@code LLVMOrcLookupKind})
     * 
     * <p>This can be used by definition generators when deciding whether to produce a definition for a requested symbol.</p>
     * 
     * <p>This enum should be kept in sync with {@code llvm::orc::LookupKind}.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMOrcLookupKindStatic OrcLookupKindStatic}</li>
     * <li>{@link #LLVMOrcLookupKindDLSym OrcLookupKindDLSym}</li>
     * </ul>
     */
    public static final int
        LLVMOrcLookupKindStatic = 0,
        LLVMOrcLookupKindDLSym  = 1;

    /**
     * {@code JITDylib} lookup flags. ({@code LLVMOrcJITDylibLookupFlags})
     * 
     * <p>This can be used by definition generators when deciding whether to produce a definition for a requested symbol.</p>
     * 
     * <p>This enum should be kept in sync with {@code llvm::orc::JITDylibLookupFlags}.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMOrcJITDylibLookupFlagsMatchExportedSymbolsOnly OrcJITDylibLookupFlagsMatchExportedSymbolsOnly}</li>
     * <li>{@link #LLVMOrcJITDylibLookupFlagsMatchAllSymbols OrcJITDylibLookupFlagsMatchAllSymbols}</li>
     * </ul>
     */
    public static final int
        LLVMOrcJITDylibLookupFlagsMatchExportedSymbolsOnly = 0,
        LLVMOrcJITDylibLookupFlagsMatchAllSymbols          = 1;

    /**
     * Symbol lookup flags for lookup sets. ({@code LLVMOrcSymbolLookupFlags})
     * 
     * <p>This should be kept in sync with {@code llvm::orc::SymbolLookupFlags}.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMOrcSymbolLookupFlagsRequiredSymbol OrcSymbolLookupFlagsRequiredSymbol}</li>
     * <li>{@link #LLVMOrcSymbolLookupFlagsWeaklyReferencedSymbol OrcSymbolLookupFlagsWeaklyReferencedSymbol}</li>
     * </ul>
     */
    public static final int
        LLVMOrcSymbolLookupFlagsRequiredSymbol         = 0,
        LLVMOrcSymbolLookupFlagsWeaklyReferencedSymbol = 1;

    protected LLVMOrc() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMOrcExecutionSessionSetErrorReporter ] ---

    /** Unsafe version of: {@link #LLVMOrcExecutionSessionSetErrorReporter OrcExecutionSessionSetErrorReporter} */
    public static void nLLVMOrcExecutionSessionSetErrorReporter(long ES, long ReportError, long Ctx) {
        long __functionAddress = Functions.OrcExecutionSessionSetErrorReporter;
        if (CHECKS) {
            check(ES);
            check(Ctx);
        }
        invokePPPV(ES, ReportError, Ctx, __functionAddress);
    }

    /**
     * Attach a custom error reporter function to the {@code ExecutionSession}.
     * 
     * <p>The error reporter will be called to deliver failure notices that can not be directly reported to a caller. For example, failure to resolve symbols in
     * the JIT linker is typically reported via the error reporter (callers requesting definitions from the JIT will typically be delivered a
     * {@code FailureToMaterialize} error instead).</p>
     */
    public static void LLVMOrcExecutionSessionSetErrorReporter(@NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("LLVMOrcErrorReporterFunction") LLVMOrcErrorReporterFunctionI ReportError, @NativeType("void *") long Ctx) {
        nLLVMOrcExecutionSessionSetErrorReporter(ES, ReportError.address(), Ctx);
    }

    // --- [ LLVMOrcExecutionSessionGetSymbolStringPool ] ---

    /**
     * Return a reference to the {@code SymbolStringPool} for an {@code ExecutionSession}.
     * 
     * <p>Ownership of the pool remains with the {@code ExecutionSession}: The caller is not required to free the pool.</p>
     */
    @NativeType("LLVMOrcSymbolStringPoolRef")
    public static long LLVMOrcExecutionSessionGetSymbolStringPool(@NativeType("LLVMOrcExecutionSessionRef") long ES) {
        long __functionAddress = Functions.OrcExecutionSessionGetSymbolStringPool;
        if (CHECKS) {
            check(ES);
        }
        return invokePP(ES, __functionAddress);
    }

    // --- [ LLVMOrcSymbolStringPoolClearDeadEntries ] ---

    /**
     * Clear all unreferenced symbol string pool entries.
     * 
     * <p>This can be called at any time to release unused entries in the {@code ExecutionSession}'s string pool. Since it locks the pool (preventing interning
     * of any new strings) it is recommended that it only be called infrequently, ideally when the caller has reason to believe that some entries will have
     * become unreferenced, e.g. after removing a module or closing a {@code JITDylib}.</p>
     */
    public static void LLVMOrcSymbolStringPoolClearDeadEntries(@NativeType("LLVMOrcSymbolStringPoolRef") long SSP) {
        long __functionAddress = Functions.OrcSymbolStringPoolClearDeadEntries;
        if (CHECKS) {
            check(SSP);
        }
        invokePV(SSP, __functionAddress);
    }

    // --- [ LLVMOrcExecutionSessionIntern ] ---

    /** Unsafe version of: {@link #LLVMOrcExecutionSessionIntern OrcExecutionSessionIntern} */
    public static long nLLVMOrcExecutionSessionIntern(long ES, long Name) {
        long __functionAddress = Functions.OrcExecutionSessionIntern;
        if (CHECKS) {
            check(ES);
        }
        return invokePPP(ES, Name, __functionAddress);
    }

    /**
     * Intern a string in the {@code ExecutionSession}'s {@code SymbolStringPool} and return a reference to it. This increments the ref-count of the pool
     * entry, and the returned value should be released once the client is done with it by calling {@link #LLVMOrcReleaseSymbolStringPoolEntry OrcReleaseSymbolStringPoolEntry}.
     * 
     * <p>Since strings are uniqued within the {@code SymbolStringPool} {@code LLVMOrcSymbolStringPoolEntryRefs} can be compared by value to test string
     * equality.</p>
     * 
     * <p>Note that this function does not perform linker-mangling on the string.</p>
     */
    @NativeType("LLVMOrcSymbolStringPoolEntryRef")
    public static long LLVMOrcExecutionSessionIntern(@NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMOrcExecutionSessionIntern(ES, memAddress(Name));
    }

    /**
     * Intern a string in the {@code ExecutionSession}'s {@code SymbolStringPool} and return a reference to it. This increments the ref-count of the pool
     * entry, and the returned value should be released once the client is done with it by calling {@link #LLVMOrcReleaseSymbolStringPoolEntry OrcReleaseSymbolStringPoolEntry}.
     * 
     * <p>Since strings are uniqued within the {@code SymbolStringPool} {@code LLVMOrcSymbolStringPoolEntryRefs} can be compared by value to test string
     * equality.</p>
     * 
     * <p>Note that this function does not perform linker-mangling on the string.</p>
     */
    @NativeType("LLVMOrcSymbolStringPoolEntryRef")
    public static long LLVMOrcExecutionSessionIntern(@NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMOrcExecutionSessionIntern(ES, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMOrcRetainSymbolStringPoolEntry ] ---

    /** Increments the ref-count for a {@code SymbolStringPool} entry. */
    public static void LLVMOrcRetainSymbolStringPoolEntry(@NativeType("LLVMOrcSymbolStringPoolEntryRef") long S) {
        long __functionAddress = Functions.OrcRetainSymbolStringPoolEntry;
        if (CHECKS) {
            check(S);
        }
        invokePV(S, __functionAddress);
    }

    // --- [ LLVMOrcReleaseSymbolStringPoolEntry ] ---

    /** Reduces the ref-count for of a {@code SymbolStringPool} entry. */
    public static void LLVMOrcReleaseSymbolStringPoolEntry(@NativeType("LLVMOrcSymbolStringPoolEntryRef") long S) {
        long __functionAddress = Functions.OrcReleaseSymbolStringPoolEntry;
        if (CHECKS) {
            check(S);
        }
        invokePV(S, __functionAddress);
    }

    // --- [ LLVMOrcSymbolStringPoolEntryStr ] ---

    public static long nLLVMOrcSymbolStringPoolEntryStr(long S) {
        long __functionAddress = Functions.OrcSymbolStringPoolEntryStr;
        if (CHECKS) {
            check(S);
        }
        return invokePP(S, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String LLVMOrcSymbolStringPoolEntryStr(@NativeType("LLVMOrcSymbolStringPoolEntryRef") long S) {
        long __result = nLLVMOrcSymbolStringPoolEntryStr(S);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMOrcReleaseResourceTracker ] ---

    /** Reduces the ref-count of a {@code ResourceTracker}. */
    public static void LLVMOrcReleaseResourceTracker(@NativeType("LLVMOrcResourceTrackerRef") long RT) {
        long __functionAddress = Functions.OrcReleaseResourceTracker;
        if (CHECKS) {
            check(RT);
        }
        invokePV(RT, __functionAddress);
    }

    // --- [ LLVMOrcResourceTrackerTransferTo ] ---

    /** Transfers tracking of all resources associated with resource tracker {@code SrcRT} to resource tracker {@code DstRT}. */
    public static void LLVMOrcResourceTrackerTransferTo(@NativeType("LLVMOrcResourceTrackerRef") long SrcRT, @NativeType("LLVMOrcResourceTrackerRef") long DstRT) {
        long __functionAddress = Functions.OrcResourceTrackerTransferTo;
        if (CHECKS) {
            check(SrcRT);
            check(DstRT);
        }
        invokePPV(SrcRT, DstRT, __functionAddress);
    }

    // --- [ LLVMOrcResourceTrackerRemove ] ---

    /** Remove all resources associated with the given tracker. See ResourceTracker::remove(). */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcResourceTrackerRemove(@NativeType("LLVMOrcResourceTrackerRef") long RT) {
        long __functionAddress = Functions.OrcResourceTrackerRemove;
        if (CHECKS) {
            check(RT);
        }
        return invokePP(RT, __functionAddress);
    }

    // --- [ LLVMOrcDisposeDefinitionGenerator ] ---

    /**
     * Dispose of a {@code JITDylib::DefinitionGenerator}. This should only be called if ownership has not been passed to a {@code JITDylib} (e.g. because
     * some error prevented the client from calling {@link #LLVMOrcJITDylibAddGenerator OrcJITDylibAddGenerator}).
     */
    public static void LLVMOrcDisposeDefinitionGenerator(@NativeType("LLVMOrcDefinitionGeneratorRef") long DG) {
        long __functionAddress = Functions.OrcDisposeDefinitionGenerator;
        if (CHECKS) {
            check(DG);
        }
        invokePV(DG, __functionAddress);
    }

    // --- [ LLVMOrcDisposeMaterializationUnit ] ---

    /** Dispose of a {@code MaterializationUnit}. */
    public static void LLVMOrcDisposeMaterializationUnit(@NativeType("LLVMOrcMaterializationUnitRef") long MU) {
        long __functionAddress = Functions.OrcDisposeMaterializationUnit;
        if (CHECKS) {
            check(MU);
        }
        invokePV(MU, __functionAddress);
    }

    // --- [ LLVMOrcCreateCustomMaterializationUnit ] ---

    /** Unsafe version of: {@link #LLVMOrcCreateCustomMaterializationUnit OrcCreateCustomMaterializationUnit} */
    public static long nLLVMOrcCreateCustomMaterializationUnit(long Name, long Ctx, long Syms, long NumSyms, long InitSym, long Materialize, long Discard, long Destroy) {
        long __functionAddress = Functions.OrcCreateCustomMaterializationUnit;
        if (CHECKS) {
            check(__functionAddress);
            check(Ctx);
        }
        return invokePPPPPPPPP(Name, Ctx, Syms, NumSyms, InitSym, Materialize, Discard, Destroy, __functionAddress);
    }

    /**
     * Create a custom {@code MaterializationUnit}.
     * 
     * <p>Name is a name for this {@code MaterializationUnit} to be used for identification and logging purposes (e.g. if this {@code MaterializationUnit}
     * produces an object buffer then the name of that buffer will be derived from this name).</p>
     * 
     * <p>The {@code Syms} list contains the names and linkages of the symbols provided by this unit. This function takes ownership of the elements of the
     * {@code Syms} array. The {@code Name} fields of the array elements are taken to have been retained for this function. The client should <b>not</b>
     * release the elements of the array, but is still responsible for destroying the array itself.</p>
     * 
     * <p>The {@code InitSym} argument indicates whether or not this {@code MaterializationUnit} contains static initializers. If there are no static
     * initializers (the common case) then this argument should be null. If there are static initializers then {@code InitSym} should be set to a unique name
     * that also appears in the {@code Syms} list with the {@link #LLVMJITSymbolGenericFlagsMaterializationSideEffectsOnly JITSymbolGenericFlagsMaterializationSideEffectsOnly} flag set. This function takes ownership of the
     * {@code InitSym}, which should have been retained twice on behalf of this function: once for the {@code Syms} entry and once for {@code InitSym}. If
     * clients wish to use the {@code InitSym} value after this function returns they must retain it once more for themselves.</p>
     * 
     * <p>If any of the symbols in the {@code Syms} list is looked up then the {@code Materialize} function will be called.</p>
     * 
     * <p>If any of the symbols in the {@code Syms} list is overridden then the {@code Discard} function will be called.</p>
     * 
     * <p>The caller owns the underling {@code MaterializationUnit} and is responsible for either passing it to a {@code JITDylib} (via {@link #LLVMOrcJITDylibDefine OrcJITDylibDefine}) or
     * disposing of it by calling {@link #LLVMOrcDisposeMaterializationUnit OrcDisposeMaterializationUnit}.</p>
     *
     * @since 13
     */
    @NativeType("LLVMOrcMaterializationUnitRef")
    public static long LLVMOrcCreateCustomMaterializationUnit(@NativeType("char const *") ByteBuffer Name, @NativeType("void *") long Ctx, @NativeType("LLVMOrcCSymbolFlagsMapPairs") LLVMOrcCSymbolFlagsMapPair.Buffer Syms, @NativeType("LLVMOrcSymbolStringPoolEntryRef") long InitSym, @NativeType("LLVMOrcMaterializationUnitMaterializeFunction") LLVMOrcMaterializationUnitMaterializeFunctionI Materialize, @NativeType("LLVMOrcMaterializationUnitDiscardFunction") LLVMOrcMaterializationUnitDiscardFunctionI Discard, @NativeType("LLVMOrcMaterializationUnitDestroyFunction") LLVMOrcMaterializationUnitDestroyFunctionI Destroy) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMOrcCreateCustomMaterializationUnit(memAddress(Name), Ctx, Syms.address(), Syms.remaining(), InitSym, Materialize.address(), Discard.address(), Destroy.address());
    }

    /**
     * Create a custom {@code MaterializationUnit}.
     * 
     * <p>Name is a name for this {@code MaterializationUnit} to be used for identification and logging purposes (e.g. if this {@code MaterializationUnit}
     * produces an object buffer then the name of that buffer will be derived from this name).</p>
     * 
     * <p>The {@code Syms} list contains the names and linkages of the symbols provided by this unit. This function takes ownership of the elements of the
     * {@code Syms} array. The {@code Name} fields of the array elements are taken to have been retained for this function. The client should <b>not</b>
     * release the elements of the array, but is still responsible for destroying the array itself.</p>
     * 
     * <p>The {@code InitSym} argument indicates whether or not this {@code MaterializationUnit} contains static initializers. If there are no static
     * initializers (the common case) then this argument should be null. If there are static initializers then {@code InitSym} should be set to a unique name
     * that also appears in the {@code Syms} list with the {@link #LLVMJITSymbolGenericFlagsMaterializationSideEffectsOnly JITSymbolGenericFlagsMaterializationSideEffectsOnly} flag set. This function takes ownership of the
     * {@code InitSym}, which should have been retained twice on behalf of this function: once for the {@code Syms} entry and once for {@code InitSym}. If
     * clients wish to use the {@code InitSym} value after this function returns they must retain it once more for themselves.</p>
     * 
     * <p>If any of the symbols in the {@code Syms} list is looked up then the {@code Materialize} function will be called.</p>
     * 
     * <p>If any of the symbols in the {@code Syms} list is overridden then the {@code Discard} function will be called.</p>
     * 
     * <p>The caller owns the underling {@code MaterializationUnit} and is responsible for either passing it to a {@code JITDylib} (via {@link #LLVMOrcJITDylibDefine OrcJITDylibDefine}) or
     * disposing of it by calling {@link #LLVMOrcDisposeMaterializationUnit OrcDisposeMaterializationUnit}.</p>
     *
     * @since 13
     */
    @NativeType("LLVMOrcMaterializationUnitRef")
    public static long LLVMOrcCreateCustomMaterializationUnit(@NativeType("char const *") CharSequence Name, @NativeType("void *") long Ctx, @NativeType("LLVMOrcCSymbolFlagsMapPairs") LLVMOrcCSymbolFlagsMapPair.Buffer Syms, @NativeType("LLVMOrcSymbolStringPoolEntryRef") long InitSym, @NativeType("LLVMOrcMaterializationUnitMaterializeFunction") LLVMOrcMaterializationUnitMaterializeFunctionI Materialize, @NativeType("LLVMOrcMaterializationUnitDiscardFunction") LLVMOrcMaterializationUnitDiscardFunctionI Discard, @NativeType("LLVMOrcMaterializationUnitDestroyFunction") LLVMOrcMaterializationUnitDestroyFunctionI Destroy) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMOrcCreateCustomMaterializationUnit(NameEncoded, Ctx, Syms.address(), Syms.remaining(), InitSym, Materialize.address(), Discard.address(), Destroy.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMOrcAbsoluteSymbols ] ---

    /** Unsafe version of: {@link #LLVMOrcAbsoluteSymbols OrcAbsoluteSymbols} */
    public static long nLLVMOrcAbsoluteSymbols(long Syms, long NumPairs) {
        long __functionAddress = Functions.OrcAbsoluteSymbols;
        return invokePPP(Syms, NumPairs, __functionAddress);
    }

    /**
     * Create a {@code MaterializationUnit} to define the given symbols as pointing to the corresponding raw addresses.
     * 
     * <p>This function takes ownership of the elements of the Syms array. The {@code Name} fields of the array elements are taken to have been retained for this
     * function. This allows the following pattern...</p>
     * 
     * <pre><code>
     * size_t NumPairs;
     * LLVMOrcCSymbolMapPairs Sym;
     * -- Build Syms array --
     * LLVMOrcMaterializationUnitRef MU =
     *     LLVMOrcAbsoluteSymbols(Syms, NumPairs);</code></pre>
     * 
     * <p>... without requiring cleanup of the elements of the {@code Sym} array afterwards.</p>
     * 
     * <p>The client is still responsible for deleting the {@code Sym} array itself.</p>
     * 
     * <p>If a client wishes to reuse elements of the {@code Sym} array after this call they must explicitly retain each of the elements for themselves.</p>
     */
    @NativeType("LLVMOrcMaterializationUnitRef")
    public static long LLVMOrcAbsoluteSymbols(@NativeType("LLVMOrcCSymbolMapPairs") LLVMJITCSymbolMapPair.Buffer Syms) {
        return nLLVMOrcAbsoluteSymbols(Syms.address(), Syms.remaining());
    }

    // --- [ LLVMOrcLazyReexports ] ---

    /** Unsafe version of: {@link #LLVMOrcLazyReexports OrcLazyReexports} */
    public static long nLLVMOrcLazyReexports(long LCTM, long ISM, long SourceRef, long CallableAliases, long NumPairs) {
        long __functionAddress = Functions.OrcLazyReexports;
        if (CHECKS) {
            check(__functionAddress);
            check(LCTM);
            check(ISM);
            check(SourceRef);
        }
        return invokePPPPPP(LCTM, ISM, SourceRef, CallableAliases, NumPairs, __functionAddress);
    }

    /**
     * Create a {@code MaterializationUnit} to define lazy re-expots. These are callable entry points that call through to the given symbols.
     * 
     * <p>This function takes ownership of the {@code CallableAliases} array. The {@code Name} fields of the array elements are taken to have been retained for
     * this function. This allows the following pattern...</p>
     * 
     * <pre><code>
     * size_t NumPairs;
     * LLVMOrcCSymbolAliasMapPairs CallableAliases;
     * -- Build CallableAliases array --
     * LLVMOrcMaterializationUnitRef MU =
     *     LLVMOrcLazyReexports(LCTM, ISM, JD, CallableAliases, NumPairs);</code></pre>
     * 
     * <p>... without requiring cleanup of the elements of the {@code CallableAliases} array afterwards.</p>
     * 
     * <p>The client is still responsible for deleting the {@code CallableAliases} array itself.</p>
     * 
     * <p>If a client wishes to reuse elements of the {@code CallableAliases} array after this call they must explicitly retain each of the elements for themselves.</p>
     *
     * @since 13
     */
    @NativeType("LLVMOrcMaterializationUnitRef")
    public static long LLVMOrcLazyReexports(@NativeType("LLVMOrcLazyCallThroughManagerRef") long LCTM, @NativeType("LLVMOrcIndirectStubsManagerRef") long ISM, @NativeType("LLVMOrcJITDylibRef") long SourceRef, @NativeType("LLVMOrcCSymbolAliasMapPairs") LLVMOrcCSymbolAliasMapPair.Buffer CallableAliases) {
        return nLLVMOrcLazyReexports(LCTM, ISM, SourceRef, CallableAliases.address(), CallableAliases.remaining());
    }

    // --- [ LLVMOrcDisposeMaterializationResponsibility ] ---

    /**
     * Disposes of the passed {@code MaterializationResponsibility} object.
     * 
     * <p>This should only be done after the symbols covered by the object have either been resolved and emitted (via
     * {@link #LLVMOrcMaterializationResponsibilityNotifyResolved OrcMaterializationResponsibilityNotifyResolved} and {@link #LLVMOrcMaterializationResponsibilityNotifyEmitted OrcMaterializationResponsibilityNotifyEmitted}) or failed (via
     * {@link #LLVMOrcMaterializationResponsibilityFailMaterialization OrcMaterializationResponsibilityFailMaterialization}).</p>
     *
     * @since 13
     */
    public static void LLVMOrcDisposeMaterializationResponsibility(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR) {
        long __functionAddress = Functions.OrcDisposeMaterializationResponsibility;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        invokePV(MR, __functionAddress);
    }

    // --- [ LLVMOrcMaterializationResponsibilityGetTargetDylib ] ---

    /**
     * Returns the target {@code JITDylib} that these symbols are being materialized into.
     *
     * @since 13
     */
    @NativeType("LLVMOrcJITDylibRef")
    public static long LLVMOrcMaterializationResponsibilityGetTargetDylib(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityGetTargetDylib;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        return invokePP(MR, __functionAddress);
    }

    // --- [ LLVMOrcMaterializationResponsibilityGetExecutionSession ] ---

    /**
     * Returns the {@code ExecutionSession} for this {@code MaterializationResponsibility}.
     *
     * @since 13
     */
    @NativeType("LLVMOrcExecutionSessionRef")
    public static long LLVMOrcMaterializationResponsibilityGetExecutionSession(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityGetExecutionSession;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        return invokePP(MR, __functionAddress);
    }

    // --- [ LLVMOrcMaterializationResponsibilityGetSymbols ] ---

    /** Unsafe version of: {@link #LLVMOrcMaterializationResponsibilityGetSymbols OrcMaterializationResponsibilityGetSymbols} */
    public static long nLLVMOrcMaterializationResponsibilityGetSymbols(long MR, long NumPairs) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityGetSymbols;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        return invokePPP(MR, NumPairs, __functionAddress);
    }

    /**
     * Returns the symbol flags map for this responsibility instance.
     * 
     * <p>The length of the array is returned in {@code NumPairs} and the caller is responsible for the returned memory and needs to call
     * {@link #LLVMOrcDisposeCSymbolFlagsMap OrcDisposeCSymbolFlagsMap}.</p>
     * 
     * <p>To use the returned symbols beyond the livetime of the {@code MaterializationResponsibility} requires the caller to retain the symbols explicitly.</p>
     *
     * @since 13
     */
    @Nullable
    @NativeType("LLVMOrcCSymbolFlagsMapPairs")
    public static LLVMOrcCSymbolFlagsMapPair.Buffer LLVMOrcMaterializationResponsibilityGetSymbols(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        PointerBuffer NumPairs = stack.callocPointer(1);
        try {
            long __result = nLLVMOrcMaterializationResponsibilityGetSymbols(MR, memAddress(NumPairs));
            return LLVMOrcCSymbolFlagsMapPair.createSafe(__result, (int)NumPairs.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMOrcDisposeCSymbolFlagsMap ] ---

    /** Unsafe version of: {@link #LLVMOrcDisposeCSymbolFlagsMap OrcDisposeCSymbolFlagsMap} */
    public static void nLLVMOrcDisposeCSymbolFlagsMap(long Pairs) {
        long __functionAddress = Functions.OrcDisposeCSymbolFlagsMap;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(Pairs, __functionAddress);
    }

    /**
     * Disposes of the passed {@code LLVMOrcCSymbolFlagsMap}.
     * 
     * <p>Does not release the entries themselves.</p>
     *
     * @since 13
     */
    public static void LLVMOrcDisposeCSymbolFlagsMap(@NativeType("LLVMOrcCSymbolFlagsMapPairs") LLVMOrcCSymbolFlagsMapPair Pairs) {
        nLLVMOrcDisposeCSymbolFlagsMap(Pairs.address());
    }

    // --- [ LLVMOrcMaterializationResponsibilityGetInitializerSymbol ] ---

    /**
     * Returns the initialization pseudo-symbol, if any. This symbol will also be present in the {@code SymbolFlagsMap} for this
     * {@code MaterializationResponsibility} object.
     * 
     * <p>The returned symbol is not retained over any mutating operation of the {@code MaterializationResponsbility} or beyond the lifetime thereof.</p>
     *
     * @since 13
     */
    @NativeType("LLVMOrcSymbolStringPoolEntryRef")
    public static long LLVMOrcMaterializationResponsibilityGetInitializerSymbol(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityGetInitializerSymbol;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        return invokePP(MR, __functionAddress);
    }

    // --- [ LLVMOrcMaterializationResponsibilityGetRequestedSymbols ] ---

    /** Unsafe version of: {@link #LLVMOrcMaterializationResponsibilityGetRequestedSymbols OrcMaterializationResponsibilityGetRequestedSymbols} */
    public static long nLLVMOrcMaterializationResponsibilityGetRequestedSymbols(long MR, long NumSymbols) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityGetRequestedSymbols;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        return invokePPP(MR, NumSymbols, __functionAddress);
    }

    /**
     * Returns the names of any symbols covered by this {@code MaterializationResponsibility} object that have queries pending. This information can be used
     * to return responsibility for unrequested symbols back to the {@code JITDylib} via the delegate method.
     *
     * @since 13
     */
    @Nullable
    @NativeType("LLVMOrcSymbolStringPoolEntryRef *")
    public static PointerBuffer LLVMOrcMaterializationResponsibilityGetRequestedSymbols(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        PointerBuffer NumSymbols = stack.callocPointer(1);
        try {
            long __result = nLLVMOrcMaterializationResponsibilityGetRequestedSymbols(MR, memAddress(NumSymbols));
            return memPointerBufferSafe(__result, (int)NumSymbols.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMOrcDisposeSymbols ] ---

    /** Unsafe version of: {@link #LLVMOrcDisposeSymbols OrcDisposeSymbols} */
    public static void nLLVMOrcDisposeSymbols(long Symbols) {
        long __functionAddress = Functions.OrcDisposeSymbols;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(Symbols, __functionAddress);
    }

    /**
     * Disposes of the passed {@code LLVMOrcSymbolStringPoolEntryRef*}.
     * 
     * <p>Does not release the symbols themselves.</p>
     *
     * @since 13
     */
    public static void LLVMOrcDisposeSymbols(@NativeType("LLVMOrcSymbolStringPoolEntryRef *") PointerBuffer Symbols) {
        nLLVMOrcDisposeSymbols(memAddress(Symbols));
    }

    // --- [ LLVMOrcMaterializationResponsibilityNotifyResolved ] ---

    /** Unsafe version of: {@link #LLVMOrcMaterializationResponsibilityNotifyResolved OrcMaterializationResponsibilityNotifyResolved} */
    public static long nLLVMOrcMaterializationResponsibilityNotifyResolved(long MR, long Symbols, long NumPairs) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityNotifyResolved;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        return invokePPPP(MR, Symbols, NumPairs, __functionAddress);
    }

    /**
     * Notifies the target {@code JITDylib} that the given symbols have been resolved. This will update the given symbols' addresses in the {@code JITDylib},
     * and notify any pending queries on the given symbols of their resolution. The given symbols must be ones covered by this
     * {@code MaterializationResponsibility} instance. Individual calls to this method may resolve a subset of the symbols, but all symbols must have been
     * resolved prior to calling emit.
     * 
     * <p>This method will return an error if any symbols being resolved have been moved to the error state due to the failure of a dependency. If this method
     * returns an error then clients should log it and call {@link #LLVMOrcMaterializationResponsibilityFailMaterialization OrcMaterializationResponsibilityFailMaterialization}. If no dependencies have been registered
     * for the symbols covered by this {@code MaterializationResponsibility} then this method is guaranteed to return {@link LLVMError#LLVMErrorSuccess ErrorSuccess}.</p>
     *
     * @since 13
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcMaterializationResponsibilityNotifyResolved(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR, @NativeType("LLVMOrcCSymbolMapPairs") LLVMJITCSymbolMapPair.Buffer Symbols) {
        return nLLVMOrcMaterializationResponsibilityNotifyResolved(MR, Symbols.address(), Symbols.remaining());
    }

    // --- [ LLVMOrcMaterializationResponsibilityNotifyEmitted ] ---

    /**
     * Notifies the target {@code JITDylib} (and any pending queries on that {@code JITDylib}) that all symbols covered by this
     * {@code MaterializationResponsibility} instance have been emitted.
     * 
     * <p>This method will return an error if any symbols being resolved have been moved to the error state due to the failure of a dependency. If this method
     * returns an error then clients should log it and call {@link #LLVMOrcMaterializationResponsibilityFailMaterialization OrcMaterializationResponsibilityFailMaterialization}. If no dependencies have been registered
     * for the symbols covered by this {@code MaterializationResponsibiility} then this method is guaranteed to return {@link LLVMError#LLVMErrorSuccess ErrorSuccess}.</p>
     *
     * @since 13
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcMaterializationResponsibilityNotifyEmitted(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityNotifyEmitted;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        return invokePP(MR, __functionAddress);
    }

    // --- [ LLVMOrcMaterializationResponsibilityDefineMaterializing ] ---

    /** Unsafe version of: {@link #LLVMOrcMaterializationResponsibilityDefineMaterializing OrcMaterializationResponsibilityDefineMaterializing} */
    public static long nLLVMOrcMaterializationResponsibilityDefineMaterializing(long MR, long Pairs, long NumPairs) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityDefineMaterializing;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        return invokePPPP(MR, Pairs, NumPairs, __functionAddress);
    }

    /**
     * Attempt to claim responsibility for new definitions. This method can be used to claim responsibility for symbols that are added to a materialization
     * unit during the compilation process (e.g. literal pool symbols). Symbol linkage rules are the same as for symbols that are defined up front: duplicate
     * strong definitions will result in errors. Duplicate weak definitions will be discarded (in which case they will not be added to this responsibility
     * instance).
     * 
     * <p>This method can be used by materialization units that want to add additional symbols at materialization time (e.g. stubs, compile callbacks, metadata)</p>
     *
     * @since 13
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcMaterializationResponsibilityDefineMaterializing(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR, @NativeType("LLVMOrcCSymbolFlagsMapPairs") LLVMOrcCSymbolFlagsMapPair.Buffer Pairs) {
        return nLLVMOrcMaterializationResponsibilityDefineMaterializing(MR, Pairs.address(), Pairs.remaining());
    }

    // --- [ LLVMOrcMaterializationResponsibilityFailMaterialization ] ---

    /**
     * Notify all not-yet-emitted covered by this {@code MaterializationResponsibility} instance that an error has occurred. This will remove all symbols
     * covered by this {@code MaterializationResponsibilty} from the target {@code JITDylib}, and send an error to any queries waiting on these symbols.
     *
     * @since 13
     */
    public static void LLVMOrcMaterializationResponsibilityFailMaterialization(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityFailMaterialization;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        invokePV(MR, __functionAddress);
    }

    // --- [ LLVMOrcMaterializationResponsibilityReplace ] ---

    /**
     * Transfers responsibility to the given {@code MaterializationUnit} for all symbols defined by that {@code MaterializationUnit}. This allows
     * materializers to break up work based on run-time information (e.g. by introspecting which symbols have actually been looked up and materializing only
     * those).
     *
     * @since 13
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcMaterializationResponsibilityReplace(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR, @NativeType("LLVMOrcMaterializationUnitRef") long MU) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityReplace;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
            check(MU);
        }
        return invokePPP(MR, MU, __functionAddress);
    }

    // --- [ LLVMOrcMaterializationResponsibilityDelegate ] ---

    /** Unsafe version of: {@link #LLVMOrcMaterializationResponsibilityDelegate OrcMaterializationResponsibilityDelegate} */
    public static long nLLVMOrcMaterializationResponsibilityDelegate(long MR, long Symbols, long NumSymbols, long Result) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityDelegate;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        return invokePPPPP(MR, Symbols, NumSymbols, Result, __functionAddress);
    }

    /**
     * Delegates responsibility for the given symbols to the returned materialization responsibility. Useful for breaking up work between threads, or
     * different kinds of materialization processes.
     * 
     * <p>The caller retains responsibility of the the passed {@code MaterializationResponsibility}.</p>
     *
     * @since 13
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcMaterializationResponsibilityDelegate(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR, @NativeType("LLVMOrcSymbolStringPoolEntryRef *") PointerBuffer Symbols, @NativeType("LLVMOrcMaterializationResponsibilityRef *") PointerBuffer Result) {
        if (CHECKS) {
            check(Result, 1);
        }
        return nLLVMOrcMaterializationResponsibilityDelegate(MR, memAddress(Symbols), Symbols.remaining(), memAddress(Result));
    }

    // --- [ LLVMOrcMaterializationResponsibilityAddDependencies ] ---

    /** Unsafe version of: {@link #LLVMOrcMaterializationResponsibilityAddDependencies OrcMaterializationResponsibilityAddDependencies} */
    public static void nLLVMOrcMaterializationResponsibilityAddDependencies(long MR, long Name, long Dependencies, long NumPairs) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityAddDependencies;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
            check(Name);
        }
        invokePPPPV(MR, Name, Dependencies, NumPairs, __functionAddress);
    }

    /**
     * Adds dependencies to a symbol that the {@code MaterializationResponsibility} is responsible for.
     * 
     * <p>This function takes ownership of {@code Dependencies} struct. The {@code Names} array have been retained for this function. This allows the following
     * pattern...</p>
     * 
     * <pre><code>
     * LLVMOrcSymbolStringPoolEntryRef Names[] = {...};
     * LLVMOrcCDependenceMapPair Dependence = {JD, {Names, sizeof(Names)}}
     * LLVMOrcMaterializationResponsibilityAddDependencies(JD, Name, &amp;Dependence, 1);</code></pre>
     * 
     * <p>... without requiring cleanup of the elements of the {@code Names} array afterwards.</p>
     * 
     * <p>The client is still responsible for deleting the {@code Dependencies.Names} array itself.</p>
     *
     * @since 13
     */
    public static void LLVMOrcMaterializationResponsibilityAddDependencies(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR, @NativeType("LLVMOrcSymbolStringPoolEntryRef") long Name, @NativeType("LLVMOrcCDependenceMapPairs") LLVMOrcCDependenceMapPair.Buffer Dependencies) {
        nLLVMOrcMaterializationResponsibilityAddDependencies(MR, Name, Dependencies.address(), Dependencies.remaining());
    }

    // --- [ LLVMOrcMaterializationResponsibilityAddDependenciesForAll ] ---

    /** Unsafe version of: {@link #LLVMOrcMaterializationResponsibilityAddDependenciesForAll OrcMaterializationResponsibilityAddDependenciesForAll} */
    public static void nLLVMOrcMaterializationResponsibilityAddDependenciesForAll(long MR, long Dependencies, long NumPairs) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityAddDependenciesForAll;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        invokePPPV(MR, Dependencies, NumPairs, __functionAddress);
    }

    /**
     * Adds dependencies to all symbols that the {@code MaterializationResponsibility} is responsible for. See
     * {@link #LLVMOrcMaterializationResponsibilityAddDependencies OrcMaterializationResponsibilityAddDependencies} for notes about memory responsibility.
     *
     * @since 13
     */
    public static void LLVMOrcMaterializationResponsibilityAddDependenciesForAll(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR, @NativeType("LLVMOrcCDependenceMapPairs") LLVMOrcCDependenceMapPair.Buffer Dependencies) {
        nLLVMOrcMaterializationResponsibilityAddDependenciesForAll(MR, Dependencies.address(), Dependencies.remaining());
    }

    // --- [ LLVMOrcExecutionSessionCreateBareJITDylib ] ---

    /** Unsafe version of: {@link #LLVMOrcExecutionSessionCreateBareJITDylib OrcExecutionSessionCreateBareJITDylib} */
    public static long nLLVMOrcExecutionSessionCreateBareJITDylib(long ES, long Name) {
        long __functionAddress = Functions.OrcExecutionSessionCreateBareJITDylib;
        if (CHECKS) {
            check(ES);
        }
        return invokePPP(ES, Name, __functionAddress);
    }

    /**
     * Create a "bare" {@code JITDylib}.
     * 
     * <p>The client is responsible for ensuring that the {@code JITDylib}'s name is unique, e.g. by calling {@link #LLVMOrcExecutionSessionGetJITDylibByName OrcExecutionSessionGetJITDylibByName} first.</p>
     * 
     * <p>This call does not install any library code or symbols into the newly created {@code JITDylib}. The client is responsible for all configuration.</p>
     */
    @NativeType("LLVMOrcJITDylibRef")
    public static long LLVMOrcExecutionSessionCreateBareJITDylib(@NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMOrcExecutionSessionCreateBareJITDylib(ES, memAddress(Name));
    }

    /**
     * Create a "bare" {@code JITDylib}.
     * 
     * <p>The client is responsible for ensuring that the {@code JITDylib}'s name is unique, e.g. by calling {@link #LLVMOrcExecutionSessionGetJITDylibByName OrcExecutionSessionGetJITDylibByName} first.</p>
     * 
     * <p>This call does not install any library code or symbols into the newly created {@code JITDylib}. The client is responsible for all configuration.</p>
     */
    @NativeType("LLVMOrcJITDylibRef")
    public static long LLVMOrcExecutionSessionCreateBareJITDylib(@NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMOrcExecutionSessionCreateBareJITDylib(ES, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMOrcExecutionSessionCreateJITDylib ] ---

    /** Unsafe version of: {@link #LLVMOrcExecutionSessionCreateJITDylib OrcExecutionSessionCreateJITDylib} */
    public static long nLLVMOrcExecutionSessionCreateJITDylib(long ES, long Result, long Name) {
        long __functionAddress = Functions.OrcExecutionSessionCreateJITDylib;
        if (CHECKS) {
            check(ES);
        }
        return invokePPPP(ES, Result, Name, __functionAddress);
    }

    /**
     * Create a {@code JITDylib}.
     * 
     * <p>The client is responsible for ensuring that the {@code JITDylib}'s name is unique, e.g. by calling {@link #LLVMOrcExecutionSessionGetJITDylibByName OrcExecutionSessionGetJITDylibByName} first.</p>
     * 
     * <p>If a {@code Platform} is attached to the {@code ExecutionSession} then {@code Platform::setupJITDylib} will be called to install standard platform
     * symbols (e.g. standard library interposes). If no {@code Platform} is installed then this call is equivalent to
     * {@link #LLVMOrcExecutionSessionCreateBareJITDylib OrcExecutionSessionCreateBareJITDylib} and will always return success.</p>
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcExecutionSessionCreateJITDylib(@NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("LLVMOrcJITDylibRef *") PointerBuffer Result, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            check(Result, 1);
            checkNT1(Name);
        }
        return nLLVMOrcExecutionSessionCreateJITDylib(ES, memAddress(Result), memAddress(Name));
    }

    /**
     * Create a {@code JITDylib}.
     * 
     * <p>The client is responsible for ensuring that the {@code JITDylib}'s name is unique, e.g. by calling {@link #LLVMOrcExecutionSessionGetJITDylibByName OrcExecutionSessionGetJITDylibByName} first.</p>
     * 
     * <p>If a {@code Platform} is attached to the {@code ExecutionSession} then {@code Platform::setupJITDylib} will be called to install standard platform
     * symbols (e.g. standard library interposes). If no {@code Platform} is installed then this call is equivalent to
     * {@link #LLVMOrcExecutionSessionCreateBareJITDylib OrcExecutionSessionCreateBareJITDylib} and will always return success.</p>
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcExecutionSessionCreateJITDylib(@NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("LLVMOrcJITDylibRef *") PointerBuffer Result, @NativeType("char const *") CharSequence Name) {
        if (CHECKS) {
            check(Result, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMOrcExecutionSessionCreateJITDylib(ES, memAddress(Result), NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMOrcExecutionSessionGetJITDylibByName ] ---

    /** Unsafe version of: {@link #LLVMOrcExecutionSessionGetJITDylibByName OrcExecutionSessionGetJITDylibByName} */
    public static long nLLVMOrcExecutionSessionGetJITDylibByName(long ES, long Name) {
        long __functionAddress = Functions.OrcExecutionSessionGetJITDylibByName;
        if (CHECKS) {
            check(ES);
        }
        return invokePPP(ES, Name, __functionAddress);
    }

    /** Returns the {@code JITDylib} with the given name, or {@code NULL} if no such {@code JITDylib} exists. */
    @NativeType("LLVMOrcJITDylibRef")
    public static long LLVMOrcExecutionSessionGetJITDylibByName(@NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMOrcExecutionSessionGetJITDylibByName(ES, memAddress(Name));
    }

    /** Returns the {@code JITDylib} with the given name, or {@code NULL} if no such {@code JITDylib} exists. */
    @NativeType("LLVMOrcJITDylibRef")
    public static long LLVMOrcExecutionSessionGetJITDylibByName(@NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMOrcExecutionSessionGetJITDylibByName(ES, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMOrcJITDylibCreateResourceTracker ] ---

    /**
     * Return a reference to a newly created resource tracker associated with {@code JD}. The tracker is returned with an initial ref-count of 1, and must be
     * released with {@link #LLVMOrcReleaseResourceTracker OrcReleaseResourceTracker} when no longer needed.
     */
    @NativeType("LLVMOrcResourceTrackerRef")
    public static long LLVMOrcJITDylibCreateResourceTracker(@NativeType("LLVMOrcJITDylibRef") long JD) {
        long __functionAddress = Functions.OrcJITDylibCreateResourceTracker;
        if (CHECKS) {
            check(JD);
        }
        return invokePP(JD, __functionAddress);
    }

    // --- [ LLVMOrcJITDylibGetDefaultResourceTracker ] ---

    /**
     * Return a reference to the default resource tracker for the given {@code JITDylib}. This operation will increase the retain count of the tracker:
     * Clients should call {@link #LLVMOrcReleaseResourceTracker OrcReleaseResourceTracker} when the result is no longer needed.
     */
    @NativeType("LLVMOrcResourceTrackerRef")
    public static long LLVMOrcJITDylibGetDefaultResourceTracker(@NativeType("LLVMOrcJITDylibRef") long JD) {
        long __functionAddress = Functions.OrcJITDylibGetDefaultResourceTracker;
        if (CHECKS) {
            check(JD);
        }
        return invokePP(JD, __functionAddress);
    }

    // --- [ LLVMOrcJITDylibDefine ] ---

    /**
     * Add the given {@code MaterializationUnit} to the given {@code JITDylib}.
     * 
     * <p>If this operation succeeds then {@code JITDylib} {@code JD} will take ownership of {@code MU}. If the operation fails then ownership remains with the
     * caller who should call {@link #LLVMOrcDisposeMaterializationUnit OrcDisposeMaterializationUnit} to destroy it.</p>
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcJITDylibDefine(@NativeType("LLVMOrcJITDylibRef") long JD, @NativeType("LLVMOrcMaterializationUnitRef") long MU) {
        long __functionAddress = Functions.OrcJITDylibDefine;
        if (CHECKS) {
            check(JD);
            check(MU);
        }
        return invokePPP(JD, MU, __functionAddress);
    }

    // --- [ LLVMOrcJITDylibClear ] ---

    /** Calls remove on all trackers associated with this {@code JITDylib}, see {@code JITDylib::clear()}. */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcJITDylibClear(@NativeType("LLVMOrcJITDylibRef") long JD) {
        long __functionAddress = Functions.OrcJITDylibClear;
        if (CHECKS) {
            check(JD);
        }
        return invokePP(JD, __functionAddress);
    }

    // --- [ LLVMOrcJITDylibAddGenerator ] ---

    /**
     * Add a {@code DefinitionGenerator} to the given {@code JITDylib}.
     * 
     * <p>The {@code JITDylib} will take ownership of the given generator: The client is no longer responsible for managing its memory.</p>
     */
    public static void LLVMOrcJITDylibAddGenerator(@NativeType("LLVMOrcJITDylibRef") long JD, @NativeType("LLVMOrcDefinitionGeneratorRef") long DG) {
        long __functionAddress = Functions.OrcJITDylibAddGenerator;
        if (CHECKS) {
            check(JD);
            check(DG);
        }
        invokePPV(JD, DG, __functionAddress);
    }

    // --- [ LLVMOrcCreateCustomCAPIDefinitionGenerator ] ---

    /** Unsafe version of: {@link #LLVMOrcCreateCustomCAPIDefinitionGenerator OrcCreateCustomCAPIDefinitionGenerator} */
    public static long nLLVMOrcCreateCustomCAPIDefinitionGenerator(long F, long Ctx) {
        long __functionAddress = Functions.OrcCreateCustomCAPIDefinitionGenerator;
        if (CHECKS) {
            check(Ctx);
        }
        return invokePPP(F, Ctx, __functionAddress);
    }

    /** Create a custom generator. */
    @NativeType("LLVMOrcDefinitionGeneratorRef")
    public static long LLVMOrcCreateCustomCAPIDefinitionGenerator(@NativeType("LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction") LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunctionI F, @NativeType("void *") long Ctx) {
        return nLLVMOrcCreateCustomCAPIDefinitionGenerator(F.address(), Ctx);
    }

    // --- [ LLVMOrcCreateDynamicLibrarySearchGeneratorForProcess ] ---

    /** Unsafe version of: {@link #LLVMOrcCreateDynamicLibrarySearchGeneratorForProcess OrcCreateDynamicLibrarySearchGeneratorForProcess} */
    public static long nLLVMOrcCreateDynamicLibrarySearchGeneratorForProcess(long Result, byte GlobalPrefx, long Filter, long FilterCtx) {
        long __functionAddress = Functions.OrcCreateDynamicLibrarySearchGeneratorForProcess;
        return invokePPPP(Result, GlobalPrefx, Filter, FilterCtx, __functionAddress);
    }

    /**
     * Get a {@code DynamicLibrarySearchGenerator} that will reflect process symbols into the {@code JITDylib}. On success the resulting generator is owned by
     * the client. Ownership is typically transferred by adding the instance to a {@code JITDylib} using {@link #LLVMOrcJITDylibAddGenerator OrcJITDylibAddGenerator}.
     * 
     * <p>The {@code GlobalPrefix} argument specifies the character that appears on the front of linker-mangled symbols for the target platform (e.g. '_' on
     * MachO). If non-null, this character will be stripped from the start of all symbol strings before passing the remaining substring to {@code dlsym}.</p>
     * 
     * <p>The optional {@code Filter} and {@code Ctx} arguments can be used to supply a symbol name filter: Only symbols for which the filter returns true will
     * be visible to JIT'd code. If the {@code Filter} argument is null then all process symbols will be visible to JIT'd code. Note that the symbol name
     * passed to the {@code Filter} function is the full mangled symbol: The client is responsible for stripping the global prefix if present.</p>
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcCreateDynamicLibrarySearchGeneratorForProcess(@NativeType("LLVMOrcDefinitionGeneratorRef *") PointerBuffer Result, @NativeType("char") byte GlobalPrefx, @Nullable @NativeType("LLVMOrcSymbolPredicate") LLVMOrcSymbolPredicateI Filter, @NativeType("void *") long FilterCtx) {
        if (CHECKS) {
            check(Result, 1);
        }
        return nLLVMOrcCreateDynamicLibrarySearchGeneratorForProcess(memAddress(Result), GlobalPrefx, memAddressSafe(Filter), FilterCtx);
    }

    // --- [ LLVMOrcCreateNewThreadSafeContext ] ---

    /**
     * Create a {@code ThreadSafeContext} containing a new {@code LLVMContext}.
     * 
     * <p>Ownership of the underlying {@code ThreadSafeContext} data is shared: Clients can and should dispose of their {@code ThreadSafeContext} as soon as they
     * no longer need to refer to it directly. Other references (e.g. from {@code ThreadSafeModules}) will keep the data alive as long as it is needed.</p>
     */
    @NativeType("LLVMOrcThreadSafeContextRef")
    public static long LLVMOrcCreateNewThreadSafeContext() {
        long __functionAddress = Functions.OrcCreateNewThreadSafeContext;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMOrcThreadSafeContextGetContext ] ---

    /** Get a reference to the wrapped {@code LLVMContext}. */
    @NativeType("LLVMContextRef")
    public static long LLVMOrcThreadSafeContextGetContext(@NativeType("LLVMOrcThreadSafeContextRef") long TSCtx) {
        long __functionAddress = Functions.OrcThreadSafeContextGetContext;
        if (CHECKS) {
            check(TSCtx);
        }
        return invokePP(TSCtx, __functionAddress);
    }

    // --- [ LLVMOrcDisposeThreadSafeContext ] ---

    /** Dispose of a {@code ThreadSafeContext}. */
    public static void LLVMOrcDisposeThreadSafeContext(@NativeType("LLVMOrcThreadSafeContextRef") long TSCtx) {
        long __functionAddress = Functions.OrcDisposeThreadSafeContext;
        if (CHECKS) {
            check(TSCtx);
        }
        invokePV(TSCtx, __functionAddress);
    }

    // --- [ LLVMOrcCreateNewThreadSafeModule ] ---

    /**
     * Create a {@code ThreadSafeModule} wrapper around the given LLVM module. This takes ownership of the M argument which should not be disposed of or
     * referenced after this function returns.
     * 
     * <p>Ownership of the {@code ThreadSafeModule} is unique: If it is transferred to the JIT (e.g. by {@link LLVMLLJIT#LLVMOrcLLJITAddLLVMIRModule OrcLLJITAddLLVMIRModule}) then the client is no longer
     * responsible for it. If it is not transferred to the JIT then the client should call {@link #LLVMOrcDisposeThreadSafeModule OrcDisposeThreadSafeModule} to dispose of it.</p>
     */
    @NativeType("LLVMOrcThreadSafeModuleRef")
    public static long LLVMOrcCreateNewThreadSafeModule(@NativeType("LLVMModuleRef") long M, @NativeType("LLVMOrcThreadSafeContextRef") long TSCtx) {
        long __functionAddress = Functions.OrcCreateNewThreadSafeModule;
        if (CHECKS) {
            check(M);
            check(TSCtx);
        }
        return invokePPP(M, TSCtx, __functionAddress);
    }

    // --- [ LLVMOrcDisposeThreadSafeModule ] ---

    /**
     * Dispose of a {@code ThreadSafeModule}. This should only be called if ownership has not been passed to LLJIT (e.g. because some error prevented the
     * client from adding this to the JIT).
     */
    public static void LLVMOrcDisposeThreadSafeModule(@NativeType("LLVMOrcThreadSafeModuleRef") long TSM) {
        long __functionAddress = Functions.OrcDisposeThreadSafeModule;
        if (CHECKS) {
            check(TSM);
        }
        invokePV(TSM, __functionAddress);
    }

    // --- [ LLVMOrcThreadSafeModuleWithModuleDo ] ---

    /** Unsafe version of: {@link #LLVMOrcThreadSafeModuleWithModuleDo OrcThreadSafeModuleWithModuleDo} */
    public static long nLLVMOrcThreadSafeModuleWithModuleDo(long TSM, long F, long Ctx) {
        long __functionAddress = Functions.OrcThreadSafeModuleWithModuleDo;
        if (CHECKS) {
            check(__functionAddress);
            check(TSM);
            check(Ctx);
        }
        return invokePPPP(TSM, F, Ctx, __functionAddress);
    }

    /**
     * Apply the given function to the module contained in this {@code ThreadSafeModule}.
     *
     * @since 13
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcThreadSafeModuleWithModuleDo(@NativeType("LLVMOrcThreadSafeModuleRef") long TSM, @NativeType("LLVMOrcGenericIRModuleOperationFunction") LLVMOrcGenericIRModuleOperationFunctionI F, @NativeType("void *") long Ctx) {
        return nLLVMOrcThreadSafeModuleWithModuleDo(TSM, F.address(), Ctx);
    }

    // --- [ LLVMOrcJITTargetMachineBuilderDetectHost ] ---

    /** Unsafe version of: {@link #LLVMOrcJITTargetMachineBuilderDetectHost OrcJITTargetMachineBuilderDetectHost} */
    public static long nLLVMOrcJITTargetMachineBuilderDetectHost(long Result) {
        long __functionAddress = Functions.OrcJITTargetMachineBuilderDetectHost;
        return invokePP(Result, __functionAddress);
    }

    /**
     * Create a {@code JITTargetMachineBuilder} by detecting the host.
     * 
     * <p>On success the client owns the resulting {@code JITTargetMachineBuilder}. It must be passed to a consuming operation (e.g.
     * {@link LLVMLLJIT#LLVMOrcLLJITBuilderSetJITTargetMachineBuilder OrcLLJITBuilderSetJITTargetMachineBuilder}) or disposed of by calling {@link #LLVMOrcDisposeJITTargetMachineBuilder OrcDisposeJITTargetMachineBuilder}.</p>
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcJITTargetMachineBuilderDetectHost(@NativeType("LLVMOrcJITTargetMachineBuilderRef *") PointerBuffer Result) {
        if (CHECKS) {
            check(Result, 1);
        }
        return nLLVMOrcJITTargetMachineBuilderDetectHost(memAddress(Result));
    }

    // --- [ LLVMOrcJITTargetMachineBuilderCreateFromTargetMachine ] ---

    /**
     * Create a {@code JITTargetMachineBuilder} from the given {@code TargetMachine} template.
     * 
     * <p>This operation takes ownership of the given {@code TargetMachine} and destroys it before returing. The resulting {@code JITTargetMachineBuilder} is
     * owned by the client and must be passed to a consuming operation (e.g. {@link LLVMLLJIT#LLVMOrcLLJITBuilderSetJITTargetMachineBuilder OrcLLJITBuilderSetJITTargetMachineBuilder}) or disposed of by calling
     * {@link #LLVMOrcDisposeJITTargetMachineBuilder OrcDisposeJITTargetMachineBuilder}.</p>
     */
    @NativeType("LLVMOrcJITTargetMachineBuilderRef")
    public static long LLVMOrcJITTargetMachineBuilderCreateFromTargetMachine(@NativeType("LLVMTargetMachineRef") long TM) {
        long __functionAddress = Functions.OrcJITTargetMachineBuilderCreateFromTargetMachine;
        if (CHECKS) {
            check(TM);
        }
        return invokePP(TM, __functionAddress);
    }

    // --- [ LLVMOrcDisposeJITTargetMachineBuilder ] ---

    /** Dispose of a {@code JITTargetMachineBuilder}. */
    public static void LLVMOrcDisposeJITTargetMachineBuilder(@NativeType("LLVMOrcJITTargetMachineBuilderRef") long JTMB) {
        long __functionAddress = Functions.OrcDisposeJITTargetMachineBuilder;
        if (CHECKS) {
            check(JTMB);
        }
        invokePV(JTMB, __functionAddress);
    }

    // --- [ LLVMOrcJITTargetMachineBuilderGetTargetTriple ] ---

    /** Unsafe version of: {@link #LLVMOrcJITTargetMachineBuilderGetTargetTriple OrcJITTargetMachineBuilderGetTargetTriple} */
    public static long nLLVMOrcJITTargetMachineBuilderGetTargetTriple(long JTMB) {
        long __functionAddress = Functions.OrcJITTargetMachineBuilderGetTargetTriple;
        if (CHECKS) {
            check(__functionAddress);
            check(JTMB);
        }
        return invokePP(JTMB, __functionAddress);
    }

    /**
     * Returns the target triple for the given {@code JITTargetMachineBuilder} as a string.
     * 
     * <p>The caller owns the resulting string as must dispose of it by calling {@code LLVMDisposeMessage}.</p>
     *
     * @since 13
     */
    @Nullable
    @NativeType("char *")
    public static String LLVMOrcJITTargetMachineBuilderGetTargetTriple(@NativeType("LLVMOrcJITTargetMachineBuilderRef") long JTMB) {
        long __result = nLLVMOrcJITTargetMachineBuilderGetTargetTriple(JTMB);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMOrcJITTargetMachineBuilderSetTargetTriple ] ---

    /** Unsafe version of: {@link #LLVMOrcJITTargetMachineBuilderSetTargetTriple OrcJITTargetMachineBuilderSetTargetTriple} */
    public static void nLLVMOrcJITTargetMachineBuilderSetTargetTriple(long JTMB, long TargetTriple) {
        long __functionAddress = Functions.OrcJITTargetMachineBuilderSetTargetTriple;
        if (CHECKS) {
            check(__functionAddress);
            check(JTMB);
        }
        invokePPV(JTMB, TargetTriple, __functionAddress);
    }

    /**
     * Sets the target triple for the given {@code JITTargetMachineBuilder} to the given string.
     *
     * @since 13
     */
    public static void LLVMOrcJITTargetMachineBuilderSetTargetTriple(@NativeType("LLVMOrcJITTargetMachineBuilderRef") long JTMB, @NativeType("char const *") ByteBuffer TargetTriple) {
        if (CHECKS) {
            checkNT1(TargetTriple);
        }
        nLLVMOrcJITTargetMachineBuilderSetTargetTriple(JTMB, memAddress(TargetTriple));
    }

    /**
     * Sets the target triple for the given {@code JITTargetMachineBuilder} to the given string.
     *
     * @since 13
     */
    public static void LLVMOrcJITTargetMachineBuilderSetTargetTriple(@NativeType("LLVMOrcJITTargetMachineBuilderRef") long JTMB, @NativeType("char const *") CharSequence TargetTriple) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(TargetTriple, true);
            long TargetTripleEncoded = stack.getPointerAddress();
            nLLVMOrcJITTargetMachineBuilderSetTargetTriple(JTMB, TargetTripleEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMOrcObjectLayerAddObjectFile ] ---

    /**
     * Add an object to an {@code ObjectLayer} to the given {@code JITDylib}.
     * 
     * <p>Adds a buffer representing an object file to the given {@code JITDylib} using the given ObjectLayer instance. This operation transfers ownership of the
     * buffer to the {@code ObjectLayer} instance. The buffer should not be disposed of or referenced once this function returns.</p>
     * 
     * <p>Resources associated with the given object will be tracked by the given {@code JITDylib}'s default {@code ResourceTracker}.</p>
     *
     * @since 13
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcObjectLayerAddObjectFile(@NativeType("LLVMOrcObjectLayerRef") long ObjLayer, @NativeType("LLVMOrcJITDylibRef") long JD, @NativeType("LLVMMemoryBufferRef") long ObjBuffer) {
        long __functionAddress = Functions.OrcObjectLayerAddObjectFile;
        if (CHECKS) {
            check(__functionAddress);
            check(ObjLayer);
            check(JD);
            check(ObjBuffer);
        }
        return invokePPPP(ObjLayer, JD, ObjBuffer, __functionAddress);
    }

    // --- [ LLVMOrcObjectLayerAddObjectFileWithRT ] ---

    /**
     * Add an object to an {@code ObjectLayer} using the given {@code ResourceTracker}.
     * 
     * <p>Adds a buffer representing an object file to the given {@code ResourceTracker}'s {@code JITDylib} using the given {@code ObjectLayer} instance. This
     * operation transfers ownership of the buffer to the {@code ObjectLayer} instance. The buffer should not be disposed of or referenced once this function
     * returns.</p>
     * 
     * <p>Resources associated with the given object will be tracked by {@code ResourceTracker} {@code RT}.</p>
     *
     * @since 13
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcObjectLayerAddObjectFileWithRT(@NativeType("LLVMOrcObjectLayerRef") long ObjLayer, @NativeType("LLVMOrcResourceTrackerRef") long RT, @NativeType("LLVMMemoryBufferRef") long ObjBuffer) {
        long __functionAddress = Functions.OrcObjectLayerAddObjectFileWithRT;
        if (CHECKS) {
            check(__functionAddress);
            check(ObjLayer);
            check(RT);
            check(ObjBuffer);
        }
        return invokePPPP(ObjLayer, RT, ObjBuffer, __functionAddress);
    }

    // --- [ LLVMOrcObjectLayerEmit ] ---

    /**
     * Emit an object buffer to an {@code ObjectLayer}.
     * 
     * <p>Ownership of the responsibility object and object buffer pass to this function. The client is not responsible for cleanup.</p>
     *
     * @since 13
     */
    public static void LLVMOrcObjectLayerEmit(@NativeType("LLVMOrcObjectLayerRef") long ObjLayer, @NativeType("LLVMOrcMaterializationResponsibilityRef") long R, @NativeType("LLVMMemoryBufferRef") long ObjBuffer) {
        long __functionAddress = Functions.OrcObjectLayerEmit;
        if (CHECKS) {
            check(__functionAddress);
            check(ObjLayer);
            check(R);
            check(ObjBuffer);
        }
        invokePPPV(ObjLayer, R, ObjBuffer, __functionAddress);
    }

    // --- [ LLVMOrcDisposeObjectLayer ] ---

    /** Dispose of an {@code ObjectLayer}. */
    public static void LLVMOrcDisposeObjectLayer(@NativeType("LLVMOrcObjectLayerRef") long ObjLayer) {
        long __functionAddress = Functions.OrcDisposeObjectLayer;
        if (CHECKS) {
            check(ObjLayer);
        }
        invokePV(ObjLayer, __functionAddress);
    }

    // --- [ LLVMOrcIRTransformLayerEmit ] ---

    /** @since 13 */
    public static void LLVMOrcIRTransformLayerEmit(@NativeType("LLVMOrcIRTransformLayerRef") long IRTransformLayer, @NativeType("LLVMOrcMaterializationResponsibilityRef") long MR, @NativeType("LLVMOrcThreadSafeModuleRef") long TSM) {
        long __functionAddress = Functions.OrcIRTransformLayerEmit;
        if (CHECKS) {
            check(__functionAddress);
            check(IRTransformLayer);
            check(MR);
            check(TSM);
        }
        invokePPPV(IRTransformLayer, MR, TSM, __functionAddress);
    }

    // --- [ LLVMOrcIRTransformLayerSetTransform ] ---

    /** Unsafe version of: {@link #LLVMOrcIRTransformLayerSetTransform OrcIRTransformLayerSetTransform} */
    public static void nLLVMOrcIRTransformLayerSetTransform(long IRTransformLayer, long TransformFunction, long Ctx) {
        long __functionAddress = Functions.OrcIRTransformLayerSetTransform;
        if (CHECKS) {
            check(__functionAddress);
            check(IRTransformLayer);
            check(Ctx);
        }
        invokePPPV(IRTransformLayer, TransformFunction, Ctx, __functionAddress);
    }

    /**
     * Set the transform function of the provided transform layer, passing through a pointer to user provided context.
     *
     * @since 13
     */
    public static void LLVMOrcIRTransformLayerSetTransform(@NativeType("LLVMOrcIRTransformLayerRef") long IRTransformLayer, @NativeType("LLVMOrcIRTransformLayerTransformFunction") LLVMOrcIRTransformLayerTransformFunctionI TransformFunction, @NativeType("void *") long Ctx) {
        nLLVMOrcIRTransformLayerSetTransform(IRTransformLayer, TransformFunction.address(), Ctx);
    }

    // --- [ LLVMOrcObjectTransformLayerSetTransform ] ---

    /** Unsafe version of: {@link #LLVMOrcObjectTransformLayerSetTransform OrcObjectTransformLayerSetTransform} */
    public static void nLLVMOrcObjectTransformLayerSetTransform(long ObjTransformLayer, long TransformFunction, long Ctx) {
        long __functionAddress = Functions.OrcObjectTransformLayerSetTransform;
        if (CHECKS) {
            check(__functionAddress);
            check(ObjTransformLayer);
            check(Ctx);
        }
        invokePPPV(ObjTransformLayer, TransformFunction, Ctx, __functionAddress);
    }

    /**
     * Set the transform function on an {@code LLVMOrcObjectTransformLayer}.
     *
     * @since 13
     */
    public static void LLVMOrcObjectTransformLayerSetTransform(@NativeType("LLVMOrcObjectTransformLayerRef") long ObjTransformLayer, @NativeType("LLVMOrcObjectTransformLayerTransformFunction") LLVMOrcObjectTransformLayerTransformFunctionI TransformFunction, @NativeType("void *") long Ctx) {
        nLLVMOrcObjectTransformLayerSetTransform(ObjTransformLayer, TransformFunction.address(), Ctx);
    }

    // --- [ LLVMOrcCreateLocalIndirectStubsManager ] ---

    /** Unsafe version of: {@link #LLVMOrcCreateLocalIndirectStubsManager OrcCreateLocalIndirectStubsManager} */
    public static long nLLVMOrcCreateLocalIndirectStubsManager(long TargetTriple) {
        long __functionAddress = Functions.OrcCreateLocalIndirectStubsManager;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePP(TargetTriple, __functionAddress);
    }

    /**
     * Create a {@code LocalIndirectStubsManager} from the given target triple.
     * 
     * <p>The resulting {@code IndirectStubsManager} is owned by the client and must be disposed of by calling {@link #LLVMOrcDisposeIndirectStubsManager OrcDisposeIndirectStubsManager}.</p>
     *
     * @since 13
     */
    @NativeType("LLVMOrcIndirectStubsManagerRef")
    public static long LLVMOrcCreateLocalIndirectStubsManager(@NativeType("char const *") ByteBuffer TargetTriple) {
        if (CHECKS) {
            checkNT1(TargetTriple);
        }
        return nLLVMOrcCreateLocalIndirectStubsManager(memAddress(TargetTriple));
    }

    /**
     * Create a {@code LocalIndirectStubsManager} from the given target triple.
     * 
     * <p>The resulting {@code IndirectStubsManager} is owned by the client and must be disposed of by calling {@link #LLVMOrcDisposeIndirectStubsManager OrcDisposeIndirectStubsManager}.</p>
     *
     * @since 13
     */
    @NativeType("LLVMOrcIndirectStubsManagerRef")
    public static long LLVMOrcCreateLocalIndirectStubsManager(@NativeType("char const *") CharSequence TargetTriple) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(TargetTriple, true);
            long TargetTripleEncoded = stack.getPointerAddress();
            return nLLVMOrcCreateLocalIndirectStubsManager(TargetTripleEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMOrcDisposeIndirectStubsManager ] ---

    /**
     * Dispose of an {@code IndirectStubsManager}.
     *
     * @since 13
     */
    public static void LLVMOrcDisposeIndirectStubsManager(@NativeType("LLVMOrcIndirectStubsManagerRef") long ISM) {
        long __functionAddress = Functions.OrcDisposeIndirectStubsManager;
        if (CHECKS) {
            check(__functionAddress);
            check(ISM);
        }
        invokePV(ISM, __functionAddress);
    }

    // --- [ LLVMOrcCreateLocalLazyCallThroughManager ] ---

    /** Unsafe version of: {@link #LLVMOrcCreateLocalLazyCallThroughManager OrcCreateLocalLazyCallThroughManager} */
    public static long nLLVMOrcCreateLocalLazyCallThroughManager(long TargetTriple, long ES, long ErrorHandlerAddr, long LCTM) {
        long __functionAddress = Functions.OrcCreateLocalLazyCallThroughManager;
        if (CHECKS) {
            check(__functionAddress);
            check(ES);
        }
        return invokePPJPP(TargetTriple, ES, ErrorHandlerAddr, LCTM, __functionAddress);
    }

    /** @since 13 */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcCreateLocalLazyCallThroughManager(@NativeType("char const *") ByteBuffer TargetTriple, @NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("LLVMOrcJITTargetAddress") long ErrorHandlerAddr, @NativeType("LLVMOrcLazyCallThroughManagerRef *") PointerBuffer LCTM) {
        if (CHECKS) {
            checkNT1(TargetTriple);
            check(LCTM, 1);
        }
        return nLLVMOrcCreateLocalLazyCallThroughManager(memAddress(TargetTriple), ES, ErrorHandlerAddr, memAddress(LCTM));
    }

    /** @since 13 */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcCreateLocalLazyCallThroughManager(@NativeType("char const *") CharSequence TargetTriple, @NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("LLVMOrcJITTargetAddress") long ErrorHandlerAddr, @NativeType("LLVMOrcLazyCallThroughManagerRef *") PointerBuffer LCTM) {
        if (CHECKS) {
            check(LCTM, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(TargetTriple, true);
            long TargetTripleEncoded = stack.getPointerAddress();
            return nLLVMOrcCreateLocalLazyCallThroughManager(TargetTripleEncoded, ES, ErrorHandlerAddr, memAddress(LCTM));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMOrcDisposeLazyCallThroughManager ] ---

    /**
     * Dispose of an {@code LazyCallThroughManager}.
     *
     * @since 13
     */
    public static void LLVMOrcDisposeLazyCallThroughManager(@NativeType("LLVMOrcLazyCallThroughManagerRef") long LCTM) {
        long __functionAddress = Functions.OrcDisposeLazyCallThroughManager;
        if (CHECKS) {
            check(__functionAddress);
            check(LCTM);
        }
        invokePV(LCTM, __functionAddress);
    }

    // --- [ LLVMOrcCreateDumpObjects ] ---

    /** Unsafe version of: {@link #LLVMOrcCreateDumpObjects OrcCreateDumpObjects} */
    public static long nLLVMOrcCreateDumpObjects(long DumpDir, long IdentifierOverride) {
        long __functionAddress = Functions.OrcCreateDumpObjects;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePPP(DumpDir, IdentifierOverride, __functionAddress);
    }

    /**
     * Create a {@code DumpObjects} instance.
     * 
     * <p>{@code DumpDir} specifies the path to write dumped objects to. {@code DumpDir} may be empty in which case files will be dumped to the working
     * directory.</p>
     * 
     * <p>{@code IdentifierOverride} specifies a file name stem to use when dumping objects. If empty then each {@code MemoryBuffer}'s identifier will be used
     * (with a .o suffix added if not already present). If an identifier override is supplied it will be used instead, along with an incrementing counter
     * (since all buffers will use the same identifier, the resulting files will be named {@code <ident>.o}, {@code <ident>.2.o}, {@code <ident>.3.o}, and so
     * on). IdentifierOverride should not contain an extension, as a .o suffix will be added by {@code DumpObjects}.</p>
     *
     * @since 13
     */
    @NativeType("LLVMOrcDumpObjectsRef")
    public static long LLVMOrcCreateDumpObjects(@NativeType("char const *") ByteBuffer DumpDir, @NativeType("char const *") ByteBuffer IdentifierOverride) {
        if (CHECKS) {
            checkNT1(DumpDir);
            checkNT1(IdentifierOverride);
        }
        return nLLVMOrcCreateDumpObjects(memAddress(DumpDir), memAddress(IdentifierOverride));
    }

    /**
     * Create a {@code DumpObjects} instance.
     * 
     * <p>{@code DumpDir} specifies the path to write dumped objects to. {@code DumpDir} may be empty in which case files will be dumped to the working
     * directory.</p>
     * 
     * <p>{@code IdentifierOverride} specifies a file name stem to use when dumping objects. If empty then each {@code MemoryBuffer}'s identifier will be used
     * (with a .o suffix added if not already present). If an identifier override is supplied it will be used instead, along with an incrementing counter
     * (since all buffers will use the same identifier, the resulting files will be named {@code <ident>.o}, {@code <ident>.2.o}, {@code <ident>.3.o}, and so
     * on). IdentifierOverride should not contain an extension, as a .o suffix will be added by {@code DumpObjects}.</p>
     *
     * @since 13
     */
    @NativeType("LLVMOrcDumpObjectsRef")
    public static long LLVMOrcCreateDumpObjects(@NativeType("char const *") CharSequence DumpDir, @NativeType("char const *") CharSequence IdentifierOverride) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(DumpDir, true);
            long DumpDirEncoded = stack.getPointerAddress();
            stack.nUTF8(IdentifierOverride, true);
            long IdentifierOverrideEncoded = stack.getPointerAddress();
            return nLLVMOrcCreateDumpObjects(DumpDirEncoded, IdentifierOverrideEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMOrcDisposeDumpObjects ] ---

    /**
     * Dispose of a {@code DumpObjects} instance.
     *
     * @since 13
     */
    public static void LLVMOrcDisposeDumpObjects(@NativeType("LLVMOrcDumpObjectsRef") long DumpObjects) {
        long __functionAddress = Functions.OrcDisposeDumpObjects;
        if (CHECKS) {
            check(__functionAddress);
            check(DumpObjects);
        }
        invokePV(DumpObjects, __functionAddress);
    }

    // --- [ LLVMOrcDumpObjects_CallOperator ] ---

    /** Unsafe version of: {@link #LLVMOrcDumpObjects_CallOperator OrcDumpObjects_CallOperator} */
    public static long nLLVMOrcDumpObjects_CallOperator(long DumpObjects, long ObjBuffer) {
        long __functionAddress = Functions.OrcDumpObjects_CallOperator;
        if (CHECKS) {
            check(__functionAddress);
            check(DumpObjects);
        }
        return invokePPP(DumpObjects, ObjBuffer, __functionAddress);
    }

    /**
     * Dump the contents of the given {@code MemoryBuffer}.
     *
     * @since 13
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcDumpObjects_CallOperator(@NativeType("LLVMOrcDumpObjectsRef") long DumpObjects, @NativeType("LLVMMemoryBufferRef *") PointerBuffer ObjBuffer) {
        if (CHECKS) {
            check(ObjBuffer, 1);
        }
        return nLLVMOrcDumpObjects_CallOperator(DumpObjects, memAddress(ObjBuffer));
    }

}