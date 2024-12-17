/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

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
            OrcExecutionSessionLookup                             = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcExecutionSessionLookup"),
            OrcReleaseSymbolStringPoolEntry                       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcReleaseSymbolStringPoolEntry"),
            OrcSymbolStringPoolEntryStr                           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcSymbolStringPoolEntryStr"),
            OrcReleaseResourceTracker                             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcReleaseResourceTracker"),
            OrcResourceTrackerTransferTo                          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcResourceTrackerTransferTo"),
            OrcResourceTrackerRemove                              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcResourceTrackerRemove"),
            OrcDisposeDefinitionGenerator                         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcDisposeDefinitionGenerator"),
            OrcDisposeMaterializationUnit                         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcDisposeMaterializationUnit"),
            OrcCreateCustomMaterializationUnit                    = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcCreateCustomMaterializationUnit"),
            OrcAbsoluteSymbols                                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcAbsoluteSymbols"),
            OrcLazyReexports                                      = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcLazyReexports"),
            OrcDisposeMaterializationResponsibility               = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcDisposeMaterializationResponsibility"),
            OrcMaterializationResponsibilityGetTargetDylib        = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcMaterializationResponsibilityGetTargetDylib"),
            OrcMaterializationResponsibilityGetExecutionSession   = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcMaterializationResponsibilityGetExecutionSession"),
            OrcMaterializationResponsibilityGetSymbols            = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcMaterializationResponsibilityGetSymbols"),
            OrcDisposeCSymbolFlagsMap                             = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcDisposeCSymbolFlagsMap"),
            OrcMaterializationResponsibilityGetInitializerSymbol  = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcMaterializationResponsibilityGetInitializerSymbol"),
            OrcMaterializationResponsibilityGetRequestedSymbols   = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcMaterializationResponsibilityGetRequestedSymbols"),
            OrcDisposeSymbols                                     = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcDisposeSymbols"),
            OrcMaterializationResponsibilityNotifyResolved        = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcMaterializationResponsibilityNotifyResolved"),
            OrcMaterializationResponsibilityNotifyEmitted         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcMaterializationResponsibilityNotifyEmitted"),
            OrcMaterializationResponsibilityDefineMaterializing   = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcMaterializationResponsibilityDefineMaterializing"),
            OrcMaterializationResponsibilityFailMaterialization   = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcMaterializationResponsibilityFailMaterialization"),
            OrcMaterializationResponsibilityReplace               = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcMaterializationResponsibilityReplace"),
            OrcMaterializationResponsibilityDelegate              = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcMaterializationResponsibilityDelegate"),
            OrcMaterializationResponsibilityAddDependencies       = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcMaterializationResponsibilityAddDependencies"),
            OrcMaterializationResponsibilityAddDependenciesForAll = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcMaterializationResponsibilityAddDependenciesForAll"),
            OrcExecutionSessionCreateBareJITDylib                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcExecutionSessionCreateBareJITDylib"),
            OrcExecutionSessionCreateJITDylib                     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcExecutionSessionCreateJITDylib"),
            OrcExecutionSessionGetJITDylibByName                  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcExecutionSessionGetJITDylibByName"),
            OrcJITDylibCreateResourceTracker                      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcJITDylibCreateResourceTracker"),
            OrcJITDylibGetDefaultResourceTracker                  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcJITDylibGetDefaultResourceTracker"),
            OrcJITDylibDefine                                     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcJITDylibDefine"),
            OrcJITDylibClear                                      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcJITDylibClear"),
            OrcJITDylibAddGenerator                               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcJITDylibAddGenerator"),
            OrcCreateCustomCAPIDefinitionGenerator                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcCreateCustomCAPIDefinitionGenerator"),
            OrcLookupStateContinueLookup                          = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcLookupStateContinueLookup"),
            OrcCreateDynamicLibrarySearchGeneratorForProcess      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcCreateDynamicLibrarySearchGeneratorForProcess"),
            OrcCreateDynamicLibrarySearchGeneratorForPath         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcCreateDynamicLibrarySearchGeneratorForPath"),
            OrcCreateStaticLibrarySearchGeneratorForPath          = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcCreateStaticLibrarySearchGeneratorForPath"),
            OrcCreateNewThreadSafeContext                         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcCreateNewThreadSafeContext"),
            OrcThreadSafeContextGetContext                        = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcThreadSafeContextGetContext"),
            OrcDisposeThreadSafeContext                           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcDisposeThreadSafeContext"),
            OrcCreateNewThreadSafeModule                          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcCreateNewThreadSafeModule"),
            OrcDisposeThreadSafeModule                            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcDisposeThreadSafeModule"),
            OrcThreadSafeModuleWithModuleDo                       = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcThreadSafeModuleWithModuleDo"),
            OrcJITTargetMachineBuilderDetectHost                  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcJITTargetMachineBuilderDetectHost"),
            OrcJITTargetMachineBuilderCreateFromTargetMachine     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcJITTargetMachineBuilderCreateFromTargetMachine"),
            OrcDisposeJITTargetMachineBuilder                     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcDisposeJITTargetMachineBuilder"),
            OrcJITTargetMachineBuilderGetTargetTriple             = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcJITTargetMachineBuilderGetTargetTriple"),
            OrcJITTargetMachineBuilderSetTargetTriple             = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcJITTargetMachineBuilderSetTargetTriple"),
            OrcObjectLayerAddObjectFile                           = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcObjectLayerAddObjectFile"),
            OrcObjectLayerAddObjectFileWithRT                     = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcObjectLayerAddObjectFileWithRT"),
            OrcObjectLayerEmit                                    = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcObjectLayerEmit"),
            OrcDisposeObjectLayer                                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcDisposeObjectLayer"),
            OrcIRTransformLayerEmit                               = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcIRTransformLayerEmit"),
            OrcIRTransformLayerSetTransform                       = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcIRTransformLayerSetTransform"),
            OrcObjectTransformLayerSetTransform                   = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcObjectTransformLayerSetTransform"),
            OrcCreateLocalIndirectStubsManager                    = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcCreateLocalIndirectStubsManager"),
            OrcDisposeIndirectStubsManager                        = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcDisposeIndirectStubsManager"),
            OrcCreateLocalLazyCallThroughManager                  = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcCreateLocalLazyCallThroughManager"),
            OrcDisposeLazyCallThroughManager                      = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcDisposeLazyCallThroughManager"),
            OrcCreateDumpObjects                                  = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcCreateDumpObjects"),
            OrcDisposeDumpObjects                                 = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcDisposeDumpObjects"),
            OrcDumpObjects_CallOperator                           = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcDumpObjects_CallOperator");

    }

    public static final int
        LLVMJITSymbolGenericFlagsNone                           = 0,
        LLVMJITSymbolGenericFlagsExported                       = 1 << 0,
        LLVMJITSymbolGenericFlagsWeak                           = 1 << 1,
        LLVMJITSymbolGenericFlagsCallable                       = 1 << 2,
        LLVMJITSymbolGenericFlagsMaterializationSideEffectsOnly = 1 << 3;

    public static final int
        LLVMOrcLookupKindStatic = 0,
        LLVMOrcLookupKindDLSym  = 1;

    public static final int
        LLVMOrcJITDylibLookupFlagsMatchExportedSymbolsOnly = 0,
        LLVMOrcJITDylibLookupFlagsMatchAllSymbols          = 1;

    public static final int
        LLVMOrcSymbolLookupFlagsRequiredSymbol         = 0,
        LLVMOrcSymbolLookupFlagsWeaklyReferencedSymbol = 1;

    protected LLVMOrc() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMOrcExecutionSessionSetErrorReporter ] ---

    /** {@code void LLVMOrcExecutionSessionSetErrorReporter(LLVMOrcExecutionSessionRef ES, LLVMOrcErrorReporterFunction ReportError, void * Ctx)} */
    public static void nLLVMOrcExecutionSessionSetErrorReporter(long ES, long ReportError, long Ctx) {
        long __functionAddress = Functions.OrcExecutionSessionSetErrorReporter;
        if (CHECKS) {
            check(ES);
            check(Ctx);
        }
        invokePPPV(ES, ReportError, Ctx, __functionAddress);
    }

    /** {@code void LLVMOrcExecutionSessionSetErrorReporter(LLVMOrcExecutionSessionRef ES, LLVMOrcErrorReporterFunction ReportError, void * Ctx)} */
    public static void LLVMOrcExecutionSessionSetErrorReporter(@NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("LLVMOrcErrorReporterFunction") LLVMOrcErrorReporterFunctionI ReportError, @NativeType("void *") long Ctx) {
        nLLVMOrcExecutionSessionSetErrorReporter(ES, ReportError.address(), Ctx);
    }

    // --- [ LLVMOrcExecutionSessionGetSymbolStringPool ] ---

    /** {@code LLVMOrcSymbolStringPoolRef LLVMOrcExecutionSessionGetSymbolStringPool(LLVMOrcExecutionSessionRef ES)} */
    @NativeType("LLVMOrcSymbolStringPoolRef")
    public static long LLVMOrcExecutionSessionGetSymbolStringPool(@NativeType("LLVMOrcExecutionSessionRef") long ES) {
        long __functionAddress = Functions.OrcExecutionSessionGetSymbolStringPool;
        if (CHECKS) {
            check(ES);
        }
        return invokePP(ES, __functionAddress);
    }

    // --- [ LLVMOrcSymbolStringPoolClearDeadEntries ] ---

    /** {@code void LLVMOrcSymbolStringPoolClearDeadEntries(LLVMOrcSymbolStringPoolRef SSP)} */
    public static void LLVMOrcSymbolStringPoolClearDeadEntries(@NativeType("LLVMOrcSymbolStringPoolRef") long SSP) {
        long __functionAddress = Functions.OrcSymbolStringPoolClearDeadEntries;
        if (CHECKS) {
            check(SSP);
        }
        invokePV(SSP, __functionAddress);
    }

    // --- [ LLVMOrcExecutionSessionIntern ] ---

    /** {@code LLVMOrcSymbolStringPoolEntryRef LLVMOrcExecutionSessionIntern(LLVMOrcExecutionSessionRef ES, char const * Name)} */
    public static long nLLVMOrcExecutionSessionIntern(long ES, long Name) {
        long __functionAddress = Functions.OrcExecutionSessionIntern;
        if (CHECKS) {
            check(ES);
        }
        return invokePPP(ES, Name, __functionAddress);
    }

    /** {@code LLVMOrcSymbolStringPoolEntryRef LLVMOrcExecutionSessionIntern(LLVMOrcExecutionSessionRef ES, char const * Name)} */
    @NativeType("LLVMOrcSymbolStringPoolEntryRef")
    public static long LLVMOrcExecutionSessionIntern(@NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMOrcExecutionSessionIntern(ES, memAddress(Name));
    }

    /** {@code LLVMOrcSymbolStringPoolEntryRef LLVMOrcExecutionSessionIntern(LLVMOrcExecutionSessionRef ES, char const * Name)} */
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

    /** {@code void LLVMOrcRetainSymbolStringPoolEntry(LLVMOrcSymbolStringPoolEntryRef S)} */
    public static void LLVMOrcRetainSymbolStringPoolEntry(@NativeType("LLVMOrcSymbolStringPoolEntryRef") long S) {
        long __functionAddress = Functions.OrcRetainSymbolStringPoolEntry;
        if (CHECKS) {
            check(S);
        }
        invokePV(S, __functionAddress);
    }

    // --- [ LLVMOrcExecutionSessionLookup ] ---

    /** {@code void LLVMOrcExecutionSessionLookup(LLVMOrcExecutionSessionRef ES, LLVMOrcLookupKind K, LLVMOrcCJITDylibSearchOrder SearchOrder, size_t SearchOrderSize, LLVMOrcCLookupSet Symbols, size_t SymbolsSize, LLVMOrcExecutionSessionLookupHandleResultFunction HandleResult, void * Ctx)} */
    public static void nLLVMOrcExecutionSessionLookup(long ES, int K, long SearchOrder, long SearchOrderSize, long Symbols, long SymbolsSize, long HandleResult, long Ctx) {
        long __functionAddress = Functions.OrcExecutionSessionLookup;
        if (CHECKS) {
            check(__functionAddress);
            check(ES);
        }
        invokePPPPPPPV(ES, K, SearchOrder, SearchOrderSize, Symbols, SymbolsSize, HandleResult, Ctx, __functionAddress);
    }

    /** {@code void LLVMOrcExecutionSessionLookup(LLVMOrcExecutionSessionRef ES, LLVMOrcLookupKind K, LLVMOrcCJITDylibSearchOrder SearchOrder, size_t SearchOrderSize, LLVMOrcCLookupSet Symbols, size_t SymbolsSize, LLVMOrcExecutionSessionLookupHandleResultFunction HandleResult, void * Ctx)} */
    public static void LLVMOrcExecutionSessionLookup(@NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("LLVMOrcLookupKind") int K, @NativeType("LLVMOrcCJITDylibSearchOrder") LLVMOrcCJITDylibSearchOrderElement.@Nullable Buffer SearchOrder, @NativeType("LLVMOrcCLookupSet") LLVMOrcCLookupSetElement.@Nullable Buffer Symbols, @NativeType("LLVMOrcExecutionSessionLookupHandleResultFunction") LLVMOrcExecutionSessionLookupHandleResultFunctionI HandleResult, @NativeType("void *") long Ctx) {
        nLLVMOrcExecutionSessionLookup(ES, K, memAddressSafe(SearchOrder), remainingSafe(SearchOrder), memAddressSafe(Symbols), remainingSafe(Symbols), HandleResult.address(), Ctx);
    }

    // --- [ LLVMOrcReleaseSymbolStringPoolEntry ] ---

    /** {@code void LLVMOrcReleaseSymbolStringPoolEntry(LLVMOrcSymbolStringPoolEntryRef S)} */
    public static void LLVMOrcReleaseSymbolStringPoolEntry(@NativeType("LLVMOrcSymbolStringPoolEntryRef") long S) {
        long __functionAddress = Functions.OrcReleaseSymbolStringPoolEntry;
        if (CHECKS) {
            check(S);
        }
        invokePV(S, __functionAddress);
    }

    // --- [ LLVMOrcSymbolStringPoolEntryStr ] ---

    /** {@code char const * LLVMOrcSymbolStringPoolEntryStr(LLVMOrcSymbolStringPoolEntryRef S)} */
    public static long nLLVMOrcSymbolStringPoolEntryStr(long S) {
        long __functionAddress = Functions.OrcSymbolStringPoolEntryStr;
        if (CHECKS) {
            check(S);
        }
        return invokePP(S, __functionAddress);
    }

    /** {@code char const * LLVMOrcSymbolStringPoolEntryStr(LLVMOrcSymbolStringPoolEntryRef S)} */
    @NativeType("char const *")
    public static @Nullable String LLVMOrcSymbolStringPoolEntryStr(@NativeType("LLVMOrcSymbolStringPoolEntryRef") long S) {
        long __result = nLLVMOrcSymbolStringPoolEntryStr(S);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMOrcReleaseResourceTracker ] ---

    /** {@code void LLVMOrcReleaseResourceTracker(LLVMOrcResourceTrackerRef RT)} */
    public static void LLVMOrcReleaseResourceTracker(@NativeType("LLVMOrcResourceTrackerRef") long RT) {
        long __functionAddress = Functions.OrcReleaseResourceTracker;
        if (CHECKS) {
            check(RT);
        }
        invokePV(RT, __functionAddress);
    }

    // --- [ LLVMOrcResourceTrackerTransferTo ] ---

    /** {@code void LLVMOrcResourceTrackerTransferTo(LLVMOrcResourceTrackerRef SrcRT, LLVMOrcResourceTrackerRef DstRT)} */
    public static void LLVMOrcResourceTrackerTransferTo(@NativeType("LLVMOrcResourceTrackerRef") long SrcRT, @NativeType("LLVMOrcResourceTrackerRef") long DstRT) {
        long __functionAddress = Functions.OrcResourceTrackerTransferTo;
        if (CHECKS) {
            check(SrcRT);
            check(DstRT);
        }
        invokePPV(SrcRT, DstRT, __functionAddress);
    }

    // --- [ LLVMOrcResourceTrackerRemove ] ---

    /** {@code LLVMErrorRef LLVMOrcResourceTrackerRemove(LLVMOrcResourceTrackerRef RT)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcResourceTrackerRemove(@NativeType("LLVMOrcResourceTrackerRef") long RT) {
        long __functionAddress = Functions.OrcResourceTrackerRemove;
        if (CHECKS) {
            check(RT);
        }
        return invokePP(RT, __functionAddress);
    }

    // --- [ LLVMOrcDisposeDefinitionGenerator ] ---

    /** {@code void LLVMOrcDisposeDefinitionGenerator(LLVMOrcDefinitionGeneratorRef DG)} */
    public static void LLVMOrcDisposeDefinitionGenerator(@NativeType("LLVMOrcDefinitionGeneratorRef") long DG) {
        long __functionAddress = Functions.OrcDisposeDefinitionGenerator;
        if (CHECKS) {
            check(DG);
        }
        invokePV(DG, __functionAddress);
    }

    // --- [ LLVMOrcDisposeMaterializationUnit ] ---

    /** {@code void LLVMOrcDisposeMaterializationUnit(LLVMOrcMaterializationUnitRef MU)} */
    public static void LLVMOrcDisposeMaterializationUnit(@NativeType("LLVMOrcMaterializationUnitRef") long MU) {
        long __functionAddress = Functions.OrcDisposeMaterializationUnit;
        if (CHECKS) {
            check(MU);
        }
        invokePV(MU, __functionAddress);
    }

    // --- [ LLVMOrcCreateCustomMaterializationUnit ] ---

    /** {@code LLVMOrcMaterializationUnitRef LLVMOrcCreateCustomMaterializationUnit(char const * Name, void * Ctx, LLVMOrcCSymbolFlagsMapPairs Syms, size_t NumSyms, LLVMOrcSymbolStringPoolEntryRef InitSym, LLVMOrcMaterializationUnitMaterializeFunction Materialize, LLVMOrcMaterializationUnitDiscardFunction Discard, LLVMOrcMaterializationUnitDestroyFunction Destroy)} */
    public static long nLLVMOrcCreateCustomMaterializationUnit(long Name, long Ctx, long Syms, long NumSyms, long InitSym, long Materialize, long Discard, long Destroy) {
        long __functionAddress = Functions.OrcCreateCustomMaterializationUnit;
        if (CHECKS) {
            check(__functionAddress);
            check(Ctx);
        }
        return invokePPPPPPPPP(Name, Ctx, Syms, NumSyms, InitSym, Materialize, Discard, Destroy, __functionAddress);
    }

    /** {@code LLVMOrcMaterializationUnitRef LLVMOrcCreateCustomMaterializationUnit(char const * Name, void * Ctx, LLVMOrcCSymbolFlagsMapPairs Syms, size_t NumSyms, LLVMOrcSymbolStringPoolEntryRef InitSym, LLVMOrcMaterializationUnitMaterializeFunction Materialize, LLVMOrcMaterializationUnitDiscardFunction Discard, LLVMOrcMaterializationUnitDestroyFunction Destroy)} */
    @NativeType("LLVMOrcMaterializationUnitRef")
    public static long LLVMOrcCreateCustomMaterializationUnit(@NativeType("char const *") ByteBuffer Name, @NativeType("void *") long Ctx, @NativeType("LLVMOrcCSymbolFlagsMapPairs") LLVMOrcCSymbolFlagsMapPair.Buffer Syms, @NativeType("LLVMOrcSymbolStringPoolEntryRef") long InitSym, @NativeType("LLVMOrcMaterializationUnitMaterializeFunction") LLVMOrcMaterializationUnitMaterializeFunctionI Materialize, @NativeType("LLVMOrcMaterializationUnitDiscardFunction") LLVMOrcMaterializationUnitDiscardFunctionI Discard, @NativeType("LLVMOrcMaterializationUnitDestroyFunction") LLVMOrcMaterializationUnitDestroyFunctionI Destroy) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMOrcCreateCustomMaterializationUnit(memAddress(Name), Ctx, Syms.address(), Syms.remaining(), InitSym, Materialize.address(), Discard.address(), Destroy.address());
    }

    /** {@code LLVMOrcMaterializationUnitRef LLVMOrcCreateCustomMaterializationUnit(char const * Name, void * Ctx, LLVMOrcCSymbolFlagsMapPairs Syms, size_t NumSyms, LLVMOrcSymbolStringPoolEntryRef InitSym, LLVMOrcMaterializationUnitMaterializeFunction Materialize, LLVMOrcMaterializationUnitDiscardFunction Discard, LLVMOrcMaterializationUnitDestroyFunction Destroy)} */
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

    /** {@code LLVMOrcMaterializationUnitRef LLVMOrcAbsoluteSymbols(LLVMOrcCSymbolMapPairs Syms, size_t NumPairs)} */
    public static long nLLVMOrcAbsoluteSymbols(long Syms, long NumPairs) {
        long __functionAddress = Functions.OrcAbsoluteSymbols;
        return invokePPP(Syms, NumPairs, __functionAddress);
    }

    /** {@code LLVMOrcMaterializationUnitRef LLVMOrcAbsoluteSymbols(LLVMOrcCSymbolMapPairs Syms, size_t NumPairs)} */
    @NativeType("LLVMOrcMaterializationUnitRef")
    public static long LLVMOrcAbsoluteSymbols(@NativeType("LLVMOrcCSymbolMapPairs") LLVMOrcCSymbolMapPair.Buffer Syms) {
        return nLLVMOrcAbsoluteSymbols(Syms.address(), Syms.remaining());
    }

    // --- [ LLVMOrcLazyReexports ] ---

    /** {@code LLVMOrcMaterializationUnitRef LLVMOrcLazyReexports(LLVMOrcLazyCallThroughManagerRef LCTM, LLVMOrcIndirectStubsManagerRef ISM, LLVMOrcJITDylibRef SourceRef, LLVMOrcCSymbolAliasMapPairs CallableAliases, size_t NumPairs)} */
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

    /** {@code LLVMOrcMaterializationUnitRef LLVMOrcLazyReexports(LLVMOrcLazyCallThroughManagerRef LCTM, LLVMOrcIndirectStubsManagerRef ISM, LLVMOrcJITDylibRef SourceRef, LLVMOrcCSymbolAliasMapPairs CallableAliases, size_t NumPairs)} */
    @NativeType("LLVMOrcMaterializationUnitRef")
    public static long LLVMOrcLazyReexports(@NativeType("LLVMOrcLazyCallThroughManagerRef") long LCTM, @NativeType("LLVMOrcIndirectStubsManagerRef") long ISM, @NativeType("LLVMOrcJITDylibRef") long SourceRef, @NativeType("LLVMOrcCSymbolAliasMapPairs") LLVMOrcCSymbolAliasMapPair.Buffer CallableAliases) {
        return nLLVMOrcLazyReexports(LCTM, ISM, SourceRef, CallableAliases.address(), CallableAliases.remaining());
    }

    // --- [ LLVMOrcDisposeMaterializationResponsibility ] ---

    /** {@code void LLVMOrcDisposeMaterializationResponsibility(LLVMOrcMaterializationResponsibilityRef MR)} */
    public static void LLVMOrcDisposeMaterializationResponsibility(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR) {
        long __functionAddress = Functions.OrcDisposeMaterializationResponsibility;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        invokePV(MR, __functionAddress);
    }

    // --- [ LLVMOrcMaterializationResponsibilityGetTargetDylib ] ---

    /** {@code LLVMOrcJITDylibRef LLVMOrcMaterializationResponsibilityGetTargetDylib(LLVMOrcMaterializationResponsibilityRef MR)} */
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

    /** {@code LLVMOrcExecutionSessionRef LLVMOrcMaterializationResponsibilityGetExecutionSession(LLVMOrcMaterializationResponsibilityRef MR)} */
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

    /** {@code LLVMOrcCSymbolFlagsMapPairs LLVMOrcMaterializationResponsibilityGetSymbols(LLVMOrcMaterializationResponsibilityRef MR, size_t * NumPairs)} */
    public static long nLLVMOrcMaterializationResponsibilityGetSymbols(long MR, long NumPairs) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityGetSymbols;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        return invokePPP(MR, NumPairs, __functionAddress);
    }

    /** {@code LLVMOrcCSymbolFlagsMapPairs LLVMOrcMaterializationResponsibilityGetSymbols(LLVMOrcMaterializationResponsibilityRef MR, size_t * NumPairs)} */
    @NativeType("LLVMOrcCSymbolFlagsMapPairs")
    public static LLVMOrcCSymbolFlagsMapPair.@Nullable Buffer LLVMOrcMaterializationResponsibilityGetSymbols(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR) {
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

    /** {@code void LLVMOrcDisposeCSymbolFlagsMap(LLVMOrcCSymbolFlagsMapPairs Pairs)} */
    public static void nLLVMOrcDisposeCSymbolFlagsMap(long Pairs) {
        long __functionAddress = Functions.OrcDisposeCSymbolFlagsMap;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(Pairs, __functionAddress);
    }

    /** {@code void LLVMOrcDisposeCSymbolFlagsMap(LLVMOrcCSymbolFlagsMapPairs Pairs)} */
    public static void LLVMOrcDisposeCSymbolFlagsMap(@NativeType("LLVMOrcCSymbolFlagsMapPairs") LLVMOrcCSymbolFlagsMapPair Pairs) {
        nLLVMOrcDisposeCSymbolFlagsMap(Pairs.address());
    }

    // --- [ LLVMOrcMaterializationResponsibilityGetInitializerSymbol ] ---

    /** {@code LLVMOrcSymbolStringPoolEntryRef LLVMOrcMaterializationResponsibilityGetInitializerSymbol(LLVMOrcMaterializationResponsibilityRef MR)} */
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

    /** {@code LLVMOrcSymbolStringPoolEntryRef * LLVMOrcMaterializationResponsibilityGetRequestedSymbols(LLVMOrcMaterializationResponsibilityRef MR, size_t * NumSymbols)} */
    public static long nLLVMOrcMaterializationResponsibilityGetRequestedSymbols(long MR, long NumSymbols) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityGetRequestedSymbols;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        return invokePPP(MR, NumSymbols, __functionAddress);
    }

    /** {@code LLVMOrcSymbolStringPoolEntryRef * LLVMOrcMaterializationResponsibilityGetRequestedSymbols(LLVMOrcMaterializationResponsibilityRef MR, size_t * NumSymbols)} */
    @NativeType("LLVMOrcSymbolStringPoolEntryRef *")
    public static @Nullable PointerBuffer LLVMOrcMaterializationResponsibilityGetRequestedSymbols(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR) {
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

    /** {@code void LLVMOrcDisposeSymbols(LLVMOrcSymbolStringPoolEntryRef * Symbols)} */
    public static void nLLVMOrcDisposeSymbols(long Symbols) {
        long __functionAddress = Functions.OrcDisposeSymbols;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(Symbols, __functionAddress);
    }

    /** {@code void LLVMOrcDisposeSymbols(LLVMOrcSymbolStringPoolEntryRef * Symbols)} */
    public static void LLVMOrcDisposeSymbols(@NativeType("LLVMOrcSymbolStringPoolEntryRef *") PointerBuffer Symbols) {
        nLLVMOrcDisposeSymbols(memAddress(Symbols));
    }

    // --- [ LLVMOrcMaterializationResponsibilityNotifyResolved ] ---

    /** {@code LLVMErrorRef LLVMOrcMaterializationResponsibilityNotifyResolved(LLVMOrcMaterializationResponsibilityRef MR, LLVMOrcCSymbolMapPairs Symbols, size_t NumPairs)} */
    public static long nLLVMOrcMaterializationResponsibilityNotifyResolved(long MR, long Symbols, long NumPairs) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityNotifyResolved;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        return invokePPPP(MR, Symbols, NumPairs, __functionAddress);
    }

    /** {@code LLVMErrorRef LLVMOrcMaterializationResponsibilityNotifyResolved(LLVMOrcMaterializationResponsibilityRef MR, LLVMOrcCSymbolMapPairs Symbols, size_t NumPairs)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcMaterializationResponsibilityNotifyResolved(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR, @NativeType("LLVMOrcCSymbolMapPairs") LLVMOrcCSymbolMapPair.Buffer Symbols) {
        return nLLVMOrcMaterializationResponsibilityNotifyResolved(MR, Symbols.address(), Symbols.remaining());
    }

    // --- [ LLVMOrcMaterializationResponsibilityNotifyEmitted ] ---

    /** {@code LLVMErrorRef LLVMOrcMaterializationResponsibilityNotifyEmitted(LLVMOrcMaterializationResponsibilityRef MR, LLVMOrcCSymbolDependenceGroup * SymbolDepGroups, size_t NumSymbolDepGroups)} */
    public static long nLLVMOrcMaterializationResponsibilityNotifyEmitted(long MR, long SymbolDepGroups, long NumSymbolDepGroups) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityNotifyEmitted;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        return invokePPPP(MR, SymbolDepGroups, NumSymbolDepGroups, __functionAddress);
    }

    /** {@code LLVMErrorRef LLVMOrcMaterializationResponsibilityNotifyEmitted(LLVMOrcMaterializationResponsibilityRef MR, LLVMOrcCSymbolDependenceGroup * SymbolDepGroups, size_t NumSymbolDepGroups)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcMaterializationResponsibilityNotifyEmitted(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR, @NativeType("LLVMOrcCSymbolDependenceGroup *") LLVMOrcCSymbolDependenceGroup.Buffer SymbolDepGroups) {
        return nLLVMOrcMaterializationResponsibilityNotifyEmitted(MR, SymbolDepGroups.address(), SymbolDepGroups.remaining());
    }

    // --- [ LLVMOrcMaterializationResponsibilityDefineMaterializing ] ---

    /** {@code LLVMErrorRef LLVMOrcMaterializationResponsibilityDefineMaterializing(LLVMOrcMaterializationResponsibilityRef MR, LLVMOrcCSymbolFlagsMapPairs Pairs, size_t NumPairs)} */
    public static long nLLVMOrcMaterializationResponsibilityDefineMaterializing(long MR, long Pairs, long NumPairs) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityDefineMaterializing;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        return invokePPPP(MR, Pairs, NumPairs, __functionAddress);
    }

    /** {@code LLVMErrorRef LLVMOrcMaterializationResponsibilityDefineMaterializing(LLVMOrcMaterializationResponsibilityRef MR, LLVMOrcCSymbolFlagsMapPairs Pairs, size_t NumPairs)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcMaterializationResponsibilityDefineMaterializing(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR, @NativeType("LLVMOrcCSymbolFlagsMapPairs") LLVMOrcCSymbolFlagsMapPair.Buffer Pairs) {
        return nLLVMOrcMaterializationResponsibilityDefineMaterializing(MR, Pairs.address(), Pairs.remaining());
    }

    // --- [ LLVMOrcMaterializationResponsibilityFailMaterialization ] ---

    /** {@code void LLVMOrcMaterializationResponsibilityFailMaterialization(LLVMOrcMaterializationResponsibilityRef MR)} */
    public static void LLVMOrcMaterializationResponsibilityFailMaterialization(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityFailMaterialization;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        invokePV(MR, __functionAddress);
    }

    // --- [ LLVMOrcMaterializationResponsibilityReplace ] ---

    /** {@code LLVMErrorRef LLVMOrcMaterializationResponsibilityReplace(LLVMOrcMaterializationResponsibilityRef MR, LLVMOrcMaterializationUnitRef MU)} */
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

    /** {@code LLVMErrorRef LLVMOrcMaterializationResponsibilityDelegate(LLVMOrcMaterializationResponsibilityRef MR, LLVMOrcSymbolStringPoolEntryRef * Symbols, size_t NumSymbols, LLVMOrcMaterializationResponsibilityRef * Result)} */
    public static long nLLVMOrcMaterializationResponsibilityDelegate(long MR, long Symbols, long NumSymbols, long Result) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityDelegate;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        return invokePPPPP(MR, Symbols, NumSymbols, Result, __functionAddress);
    }

    /** {@code LLVMErrorRef LLVMOrcMaterializationResponsibilityDelegate(LLVMOrcMaterializationResponsibilityRef MR, LLVMOrcSymbolStringPoolEntryRef * Symbols, size_t NumSymbols, LLVMOrcMaterializationResponsibilityRef * Result)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcMaterializationResponsibilityDelegate(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR, @NativeType("LLVMOrcSymbolStringPoolEntryRef *") PointerBuffer Symbols, @NativeType("LLVMOrcMaterializationResponsibilityRef *") PointerBuffer Result) {
        if (CHECKS) {
            check(Result, 1);
        }
        return nLLVMOrcMaterializationResponsibilityDelegate(MR, memAddress(Symbols), Symbols.remaining(), memAddress(Result));
    }

    // --- [ LLVMOrcMaterializationResponsibilityAddDependencies ] ---

    /** {@code void LLVMOrcMaterializationResponsibilityAddDependencies(LLVMOrcMaterializationResponsibilityRef MR, LLVMOrcSymbolStringPoolEntryRef Name, LLVMOrcCDependenceMapPairs Dependencies, size_t NumPairs)} */
    public static void nLLVMOrcMaterializationResponsibilityAddDependencies(long MR, long Name, long Dependencies, long NumPairs) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityAddDependencies;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
            check(Name);
        }
        invokePPPPV(MR, Name, Dependencies, NumPairs, __functionAddress);
    }

    /** {@code void LLVMOrcMaterializationResponsibilityAddDependencies(LLVMOrcMaterializationResponsibilityRef MR, LLVMOrcSymbolStringPoolEntryRef Name, LLVMOrcCDependenceMapPairs Dependencies, size_t NumPairs)} */
    public static void LLVMOrcMaterializationResponsibilityAddDependencies(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR, @NativeType("LLVMOrcSymbolStringPoolEntryRef") long Name, @NativeType("LLVMOrcCDependenceMapPairs") LLVMOrcCDependenceMapPair.Buffer Dependencies) {
        nLLVMOrcMaterializationResponsibilityAddDependencies(MR, Name, Dependencies.address(), Dependencies.remaining());
    }

    // --- [ LLVMOrcMaterializationResponsibilityAddDependenciesForAll ] ---

    /** {@code void LLVMOrcMaterializationResponsibilityAddDependenciesForAll(LLVMOrcMaterializationResponsibilityRef MR, LLVMOrcCDependenceMapPairs Dependencies, size_t NumPairs)} */
    public static void nLLVMOrcMaterializationResponsibilityAddDependenciesForAll(long MR, long Dependencies, long NumPairs) {
        long __functionAddress = Functions.OrcMaterializationResponsibilityAddDependenciesForAll;
        if (CHECKS) {
            check(__functionAddress);
            check(MR);
        }
        invokePPPV(MR, Dependencies, NumPairs, __functionAddress);
    }

    /** {@code void LLVMOrcMaterializationResponsibilityAddDependenciesForAll(LLVMOrcMaterializationResponsibilityRef MR, LLVMOrcCDependenceMapPairs Dependencies, size_t NumPairs)} */
    public static void LLVMOrcMaterializationResponsibilityAddDependenciesForAll(@NativeType("LLVMOrcMaterializationResponsibilityRef") long MR, @NativeType("LLVMOrcCDependenceMapPairs") LLVMOrcCDependenceMapPair.Buffer Dependencies) {
        nLLVMOrcMaterializationResponsibilityAddDependenciesForAll(MR, Dependencies.address(), Dependencies.remaining());
    }

    // --- [ LLVMOrcExecutionSessionCreateBareJITDylib ] ---

    /** {@code LLVMOrcJITDylibRef LLVMOrcExecutionSessionCreateBareJITDylib(LLVMOrcExecutionSessionRef ES, char const * Name)} */
    public static long nLLVMOrcExecutionSessionCreateBareJITDylib(long ES, long Name) {
        long __functionAddress = Functions.OrcExecutionSessionCreateBareJITDylib;
        if (CHECKS) {
            check(ES);
        }
        return invokePPP(ES, Name, __functionAddress);
    }

    /** {@code LLVMOrcJITDylibRef LLVMOrcExecutionSessionCreateBareJITDylib(LLVMOrcExecutionSessionRef ES, char const * Name)} */
    @NativeType("LLVMOrcJITDylibRef")
    public static long LLVMOrcExecutionSessionCreateBareJITDylib(@NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMOrcExecutionSessionCreateBareJITDylib(ES, memAddress(Name));
    }

    /** {@code LLVMOrcJITDylibRef LLVMOrcExecutionSessionCreateBareJITDylib(LLVMOrcExecutionSessionRef ES, char const * Name)} */
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

    /** {@code LLVMErrorRef LLVMOrcExecutionSessionCreateJITDylib(LLVMOrcExecutionSessionRef ES, LLVMOrcJITDylibRef * Result, char const * Name)} */
    public static long nLLVMOrcExecutionSessionCreateJITDylib(long ES, long Result, long Name) {
        long __functionAddress = Functions.OrcExecutionSessionCreateJITDylib;
        if (CHECKS) {
            check(ES);
        }
        return invokePPPP(ES, Result, Name, __functionAddress);
    }

    /** {@code LLVMErrorRef LLVMOrcExecutionSessionCreateJITDylib(LLVMOrcExecutionSessionRef ES, LLVMOrcJITDylibRef * Result, char const * Name)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcExecutionSessionCreateJITDylib(@NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("LLVMOrcJITDylibRef *") PointerBuffer Result, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            check(Result, 1);
            checkNT1(Name);
        }
        return nLLVMOrcExecutionSessionCreateJITDylib(ES, memAddress(Result), memAddress(Name));
    }

    /** {@code LLVMErrorRef LLVMOrcExecutionSessionCreateJITDylib(LLVMOrcExecutionSessionRef ES, LLVMOrcJITDylibRef * Result, char const * Name)} */
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

    /** {@code LLVMOrcJITDylibRef LLVMOrcExecutionSessionGetJITDylibByName(LLVMOrcExecutionSessionRef ES, char const * Name)} */
    public static long nLLVMOrcExecutionSessionGetJITDylibByName(long ES, long Name) {
        long __functionAddress = Functions.OrcExecutionSessionGetJITDylibByName;
        if (CHECKS) {
            check(ES);
        }
        return invokePPP(ES, Name, __functionAddress);
    }

    /** {@code LLVMOrcJITDylibRef LLVMOrcExecutionSessionGetJITDylibByName(LLVMOrcExecutionSessionRef ES, char const * Name)} */
    @NativeType("LLVMOrcJITDylibRef")
    public static long LLVMOrcExecutionSessionGetJITDylibByName(@NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMOrcExecutionSessionGetJITDylibByName(ES, memAddress(Name));
    }

    /** {@code LLVMOrcJITDylibRef LLVMOrcExecutionSessionGetJITDylibByName(LLVMOrcExecutionSessionRef ES, char const * Name)} */
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

    /** {@code LLVMOrcResourceTrackerRef LLVMOrcJITDylibCreateResourceTracker(LLVMOrcJITDylibRef JD)} */
    @NativeType("LLVMOrcResourceTrackerRef")
    public static long LLVMOrcJITDylibCreateResourceTracker(@NativeType("LLVMOrcJITDylibRef") long JD) {
        long __functionAddress = Functions.OrcJITDylibCreateResourceTracker;
        if (CHECKS) {
            check(JD);
        }
        return invokePP(JD, __functionAddress);
    }

    // --- [ LLVMOrcJITDylibGetDefaultResourceTracker ] ---

    /** {@code LLVMOrcResourceTrackerRef LLVMOrcJITDylibGetDefaultResourceTracker(LLVMOrcJITDylibRef JD)} */
    @NativeType("LLVMOrcResourceTrackerRef")
    public static long LLVMOrcJITDylibGetDefaultResourceTracker(@NativeType("LLVMOrcJITDylibRef") long JD) {
        long __functionAddress = Functions.OrcJITDylibGetDefaultResourceTracker;
        if (CHECKS) {
            check(JD);
        }
        return invokePP(JD, __functionAddress);
    }

    // --- [ LLVMOrcJITDylibDefine ] ---

    /** {@code LLVMErrorRef LLVMOrcJITDylibDefine(LLVMOrcJITDylibRef JD, LLVMOrcMaterializationUnitRef MU)} */
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

    /** {@code LLVMErrorRef LLVMOrcJITDylibClear(LLVMOrcJITDylibRef JD)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcJITDylibClear(@NativeType("LLVMOrcJITDylibRef") long JD) {
        long __functionAddress = Functions.OrcJITDylibClear;
        if (CHECKS) {
            check(JD);
        }
        return invokePP(JD, __functionAddress);
    }

    // --- [ LLVMOrcJITDylibAddGenerator ] ---

    /** {@code void LLVMOrcJITDylibAddGenerator(LLVMOrcJITDylibRef JD, LLVMOrcDefinitionGeneratorRef DG)} */
    public static void LLVMOrcJITDylibAddGenerator(@NativeType("LLVMOrcJITDylibRef") long JD, @NativeType("LLVMOrcDefinitionGeneratorRef") long DG) {
        long __functionAddress = Functions.OrcJITDylibAddGenerator;
        if (CHECKS) {
            check(JD);
            check(DG);
        }
        invokePPV(JD, DG, __functionAddress);
    }

    // --- [ LLVMOrcCreateCustomCAPIDefinitionGenerator ] ---

    /** {@code LLVMOrcDefinitionGeneratorRef LLVMOrcCreateCustomCAPIDefinitionGenerator(LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction F, void * Ctx, LLVMOrcDisposeCAPIDefinitionGeneratorFunction Dispose)} */
    public static long nLLVMOrcCreateCustomCAPIDefinitionGenerator(long F, long Ctx, long Dispose) {
        long __functionAddress = Functions.OrcCreateCustomCAPIDefinitionGenerator;
        return invokePPPP(F, Ctx, Dispose, __functionAddress);
    }

    /** {@code LLVMOrcDefinitionGeneratorRef LLVMOrcCreateCustomCAPIDefinitionGenerator(LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction F, void * Ctx, LLVMOrcDisposeCAPIDefinitionGeneratorFunction Dispose)} */
    @NativeType("LLVMOrcDefinitionGeneratorRef")
    public static long LLVMOrcCreateCustomCAPIDefinitionGenerator(@NativeType("LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction") LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunctionI F, @NativeType("void *") long Ctx, @NativeType("LLVMOrcDisposeCAPIDefinitionGeneratorFunction") @Nullable LLVMOrcDisposeCAPIDefinitionGeneratorFunctionI Dispose) {
        return nLLVMOrcCreateCustomCAPIDefinitionGenerator(F.address(), Ctx, memAddressSafe(Dispose));
    }

    // --- [ LLVMOrcLookupStateContinueLookup ] ---

    /** {@code void LLVMOrcLookupStateContinueLookup(LLVMOrcLookupStateRef S, LLVMErrorRef Err)} */
    public static void LLVMOrcLookupStateContinueLookup(@NativeType("LLVMOrcLookupStateRef") long S, @NativeType("LLVMErrorRef") long Err) {
        long __functionAddress = Functions.OrcLookupStateContinueLookup;
        if (CHECKS) {
            check(__functionAddress);
            check(S);
            check(Err);
        }
        invokePPV(S, Err, __functionAddress);
    }

    // --- [ LLVMOrcCreateDynamicLibrarySearchGeneratorForProcess ] ---

    /** {@code LLVMErrorRef LLVMOrcCreateDynamicLibrarySearchGeneratorForProcess(LLVMOrcDefinitionGeneratorRef * Result, char GlobalPrefx, LLVMOrcSymbolPredicate Filter, void * FilterCtx)} */
    public static long nLLVMOrcCreateDynamicLibrarySearchGeneratorForProcess(long Result, byte GlobalPrefx, long Filter, long FilterCtx) {
        long __functionAddress = Functions.OrcCreateDynamicLibrarySearchGeneratorForProcess;
        return invokePBPPP(Result, GlobalPrefx, Filter, FilterCtx, __functionAddress);
    }

    /** {@code LLVMErrorRef LLVMOrcCreateDynamicLibrarySearchGeneratorForProcess(LLVMOrcDefinitionGeneratorRef * Result, char GlobalPrefx, LLVMOrcSymbolPredicate Filter, void * FilterCtx)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcCreateDynamicLibrarySearchGeneratorForProcess(@NativeType("LLVMOrcDefinitionGeneratorRef *") PointerBuffer Result, @NativeType("char") byte GlobalPrefx, @NativeType("LLVMOrcSymbolPredicate") @Nullable LLVMOrcSymbolPredicateI Filter, @NativeType("void *") long FilterCtx) {
        if (CHECKS) {
            check(Result, 1);
        }
        return nLLVMOrcCreateDynamicLibrarySearchGeneratorForProcess(memAddress(Result), GlobalPrefx, memAddressSafe(Filter), FilterCtx);
    }

    // --- [ LLVMOrcCreateDynamicLibrarySearchGeneratorForPath ] ---

    /** {@code LLVMErrorRef LLVMOrcCreateDynamicLibrarySearchGeneratorForPath(LLVMOrcDefinitionGeneratorRef * Result, char const * FileName, char GlobalPrefix, LLVMOrcSymbolPredicate Filter, void * FilterCtx)} */
    public static long nLLVMOrcCreateDynamicLibrarySearchGeneratorForPath(long Result, long FileName, byte GlobalPrefix, long Filter, long FilterCtx) {
        long __functionAddress = Functions.OrcCreateDynamicLibrarySearchGeneratorForPath;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePPBPPP(Result, FileName, GlobalPrefix, Filter, FilterCtx, __functionAddress);
    }

    /** {@code LLVMErrorRef LLVMOrcCreateDynamicLibrarySearchGeneratorForPath(LLVMOrcDefinitionGeneratorRef * Result, char const * FileName, char GlobalPrefix, LLVMOrcSymbolPredicate Filter, void * FilterCtx)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcCreateDynamicLibrarySearchGeneratorForPath(@NativeType("LLVMOrcDefinitionGeneratorRef *") PointerBuffer Result, @NativeType("char const *") ByteBuffer FileName, @NativeType("char") byte GlobalPrefix, @NativeType("LLVMOrcSymbolPredicate") @Nullable LLVMOrcSymbolPredicateI Filter, @NativeType("void *") long FilterCtx) {
        if (CHECKS) {
            check(Result, 1);
            checkNT1(FileName);
        }
        return nLLVMOrcCreateDynamicLibrarySearchGeneratorForPath(memAddress(Result), memAddress(FileName), GlobalPrefix, memAddressSafe(Filter), FilterCtx);
    }

    /** {@code LLVMErrorRef LLVMOrcCreateDynamicLibrarySearchGeneratorForPath(LLVMOrcDefinitionGeneratorRef * Result, char const * FileName, char GlobalPrefix, LLVMOrcSymbolPredicate Filter, void * FilterCtx)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcCreateDynamicLibrarySearchGeneratorForPath(@NativeType("LLVMOrcDefinitionGeneratorRef *") PointerBuffer Result, @NativeType("char const *") CharSequence FileName, @NativeType("char") byte GlobalPrefix, @NativeType("LLVMOrcSymbolPredicate") @Nullable LLVMOrcSymbolPredicateI Filter, @NativeType("void *") long FilterCtx) {
        if (CHECKS) {
            check(Result, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(FileName, true);
            long FileNameEncoded = stack.getPointerAddress();
            return nLLVMOrcCreateDynamicLibrarySearchGeneratorForPath(memAddress(Result), FileNameEncoded, GlobalPrefix, memAddressSafe(Filter), FilterCtx);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMOrcCreateStaticLibrarySearchGeneratorForPath ] ---

    /** {@code LLVMErrorRef LLVMOrcCreateStaticLibrarySearchGeneratorForPath(LLVMOrcDefinitionGeneratorRef * Result, LLVMOrcObjectLayerRef ObjLayer, char const * FileName, char const * TargetTriple)} */
    public static long nLLVMOrcCreateStaticLibrarySearchGeneratorForPath(long Result, long ObjLayer, long FileName, long TargetTriple) {
        long __functionAddress = Functions.OrcCreateStaticLibrarySearchGeneratorForPath;
        if (CHECKS) {
            check(__functionAddress);
            check(ObjLayer);
        }
        return invokePPPPP(Result, ObjLayer, FileName, TargetTriple, __functionAddress);
    }

    /** {@code LLVMErrorRef LLVMOrcCreateStaticLibrarySearchGeneratorForPath(LLVMOrcDefinitionGeneratorRef * Result, LLVMOrcObjectLayerRef ObjLayer, char const * FileName, char const * TargetTriple)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcCreateStaticLibrarySearchGeneratorForPath(@NativeType("LLVMOrcDefinitionGeneratorRef *") PointerBuffer Result, @NativeType("LLVMOrcObjectLayerRef") long ObjLayer, @NativeType("char const *") ByteBuffer FileName, @NativeType("char const *") @Nullable ByteBuffer TargetTriple) {
        if (CHECKS) {
            check(Result, 1);
            checkNT1(FileName);
            checkNT1Safe(TargetTriple);
        }
        return nLLVMOrcCreateStaticLibrarySearchGeneratorForPath(memAddress(Result), ObjLayer, memAddress(FileName), memAddressSafe(TargetTriple));
    }

    /** {@code LLVMErrorRef LLVMOrcCreateStaticLibrarySearchGeneratorForPath(LLVMOrcDefinitionGeneratorRef * Result, LLVMOrcObjectLayerRef ObjLayer, char const * FileName, char const * TargetTriple)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcCreateStaticLibrarySearchGeneratorForPath(@NativeType("LLVMOrcDefinitionGeneratorRef *") PointerBuffer Result, @NativeType("LLVMOrcObjectLayerRef") long ObjLayer, @NativeType("char const *") CharSequence FileName, @NativeType("char const *") @Nullable CharSequence TargetTriple) {
        if (CHECKS) {
            check(Result, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(FileName, true);
            long FileNameEncoded = stack.getPointerAddress();
            stack.nUTF8Safe(TargetTriple, true);
            long TargetTripleEncoded = TargetTriple == null ? NULL : stack.getPointerAddress();
            return nLLVMOrcCreateStaticLibrarySearchGeneratorForPath(memAddress(Result), ObjLayer, FileNameEncoded, TargetTripleEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMOrcCreateNewThreadSafeContext ] ---

    /** {@code LLVMOrcThreadSafeContextRef LLVMOrcCreateNewThreadSafeContext(void)} */
    @NativeType("LLVMOrcThreadSafeContextRef")
    public static long LLVMOrcCreateNewThreadSafeContext() {
        long __functionAddress = Functions.OrcCreateNewThreadSafeContext;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMOrcThreadSafeContextGetContext ] ---

    /** {@code LLVMContextRef LLVMOrcThreadSafeContextGetContext(LLVMOrcThreadSafeContextRef TSCtx)} */
    @NativeType("LLVMContextRef")
    public static long LLVMOrcThreadSafeContextGetContext(@NativeType("LLVMOrcThreadSafeContextRef") long TSCtx) {
        long __functionAddress = Functions.OrcThreadSafeContextGetContext;
        if (CHECKS) {
            check(TSCtx);
        }
        return invokePP(TSCtx, __functionAddress);
    }

    // --- [ LLVMOrcDisposeThreadSafeContext ] ---

    /** {@code void LLVMOrcDisposeThreadSafeContext(LLVMOrcThreadSafeContextRef TSCtx)} */
    public static void LLVMOrcDisposeThreadSafeContext(@NativeType("LLVMOrcThreadSafeContextRef") long TSCtx) {
        long __functionAddress = Functions.OrcDisposeThreadSafeContext;
        if (CHECKS) {
            check(TSCtx);
        }
        invokePV(TSCtx, __functionAddress);
    }

    // --- [ LLVMOrcCreateNewThreadSafeModule ] ---

    /** {@code LLVMOrcThreadSafeModuleRef LLVMOrcCreateNewThreadSafeModule(LLVMModuleRef M, LLVMOrcThreadSafeContextRef TSCtx)} */
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

    /** {@code void LLVMOrcDisposeThreadSafeModule(LLVMOrcThreadSafeModuleRef TSM)} */
    public static void LLVMOrcDisposeThreadSafeModule(@NativeType("LLVMOrcThreadSafeModuleRef") long TSM) {
        long __functionAddress = Functions.OrcDisposeThreadSafeModule;
        if (CHECKS) {
            check(TSM);
        }
        invokePV(TSM, __functionAddress);
    }

    // --- [ LLVMOrcThreadSafeModuleWithModuleDo ] ---

    /** {@code LLVMErrorRef LLVMOrcThreadSafeModuleWithModuleDo(LLVMOrcThreadSafeModuleRef TSM, LLVMOrcGenericIRModuleOperationFunction F, void * Ctx)} */
    public static long nLLVMOrcThreadSafeModuleWithModuleDo(long TSM, long F, long Ctx) {
        long __functionAddress = Functions.OrcThreadSafeModuleWithModuleDo;
        if (CHECKS) {
            check(__functionAddress);
            check(TSM);
            check(Ctx);
        }
        return invokePPPP(TSM, F, Ctx, __functionAddress);
    }

    /** {@code LLVMErrorRef LLVMOrcThreadSafeModuleWithModuleDo(LLVMOrcThreadSafeModuleRef TSM, LLVMOrcGenericIRModuleOperationFunction F, void * Ctx)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcThreadSafeModuleWithModuleDo(@NativeType("LLVMOrcThreadSafeModuleRef") long TSM, @NativeType("LLVMOrcGenericIRModuleOperationFunction") LLVMOrcGenericIRModuleOperationFunctionI F, @NativeType("void *") long Ctx) {
        return nLLVMOrcThreadSafeModuleWithModuleDo(TSM, F.address(), Ctx);
    }

    // --- [ LLVMOrcJITTargetMachineBuilderDetectHost ] ---

    /** {@code LLVMErrorRef LLVMOrcJITTargetMachineBuilderDetectHost(LLVMOrcJITTargetMachineBuilderRef * Result)} */
    public static long nLLVMOrcJITTargetMachineBuilderDetectHost(long Result) {
        long __functionAddress = Functions.OrcJITTargetMachineBuilderDetectHost;
        return invokePP(Result, __functionAddress);
    }

    /** {@code LLVMErrorRef LLVMOrcJITTargetMachineBuilderDetectHost(LLVMOrcJITTargetMachineBuilderRef * Result)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcJITTargetMachineBuilderDetectHost(@NativeType("LLVMOrcJITTargetMachineBuilderRef *") PointerBuffer Result) {
        if (CHECKS) {
            check(Result, 1);
        }
        return nLLVMOrcJITTargetMachineBuilderDetectHost(memAddress(Result));
    }

    // --- [ LLVMOrcJITTargetMachineBuilderCreateFromTargetMachine ] ---

    /** {@code LLVMOrcJITTargetMachineBuilderRef LLVMOrcJITTargetMachineBuilderCreateFromTargetMachine(LLVMTargetMachineRef TM)} */
    @NativeType("LLVMOrcJITTargetMachineBuilderRef")
    public static long LLVMOrcJITTargetMachineBuilderCreateFromTargetMachine(@NativeType("LLVMTargetMachineRef") long TM) {
        long __functionAddress = Functions.OrcJITTargetMachineBuilderCreateFromTargetMachine;
        if (CHECKS) {
            check(TM);
        }
        return invokePP(TM, __functionAddress);
    }

    // --- [ LLVMOrcDisposeJITTargetMachineBuilder ] ---

    /** {@code void LLVMOrcDisposeJITTargetMachineBuilder(LLVMOrcJITTargetMachineBuilderRef JTMB)} */
    public static void LLVMOrcDisposeJITTargetMachineBuilder(@NativeType("LLVMOrcJITTargetMachineBuilderRef") long JTMB) {
        long __functionAddress = Functions.OrcDisposeJITTargetMachineBuilder;
        if (CHECKS) {
            check(JTMB);
        }
        invokePV(JTMB, __functionAddress);
    }

    // --- [ LLVMOrcJITTargetMachineBuilderGetTargetTriple ] ---

    /** {@code char * LLVMOrcJITTargetMachineBuilderGetTargetTriple(LLVMOrcJITTargetMachineBuilderRef JTMB)} */
    public static long nLLVMOrcJITTargetMachineBuilderGetTargetTriple(long JTMB) {
        long __functionAddress = Functions.OrcJITTargetMachineBuilderGetTargetTriple;
        if (CHECKS) {
            check(__functionAddress);
            check(JTMB);
        }
        return invokePP(JTMB, __functionAddress);
    }

    /** {@code char * LLVMOrcJITTargetMachineBuilderGetTargetTriple(LLVMOrcJITTargetMachineBuilderRef JTMB)} */
    @NativeType("char *")
    public static @Nullable String LLVMOrcJITTargetMachineBuilderGetTargetTriple(@NativeType("LLVMOrcJITTargetMachineBuilderRef") long JTMB) {
        long __result = nLLVMOrcJITTargetMachineBuilderGetTargetTriple(JTMB);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMOrcJITTargetMachineBuilderSetTargetTriple ] ---

    /** {@code void LLVMOrcJITTargetMachineBuilderSetTargetTriple(LLVMOrcJITTargetMachineBuilderRef JTMB, char const * TargetTriple)} */
    public static void nLLVMOrcJITTargetMachineBuilderSetTargetTriple(long JTMB, long TargetTriple) {
        long __functionAddress = Functions.OrcJITTargetMachineBuilderSetTargetTriple;
        if (CHECKS) {
            check(__functionAddress);
            check(JTMB);
        }
        invokePPV(JTMB, TargetTriple, __functionAddress);
    }

    /** {@code void LLVMOrcJITTargetMachineBuilderSetTargetTriple(LLVMOrcJITTargetMachineBuilderRef JTMB, char const * TargetTriple)} */
    public static void LLVMOrcJITTargetMachineBuilderSetTargetTriple(@NativeType("LLVMOrcJITTargetMachineBuilderRef") long JTMB, @NativeType("char const *") ByteBuffer TargetTriple) {
        if (CHECKS) {
            checkNT1(TargetTriple);
        }
        nLLVMOrcJITTargetMachineBuilderSetTargetTriple(JTMB, memAddress(TargetTriple));
    }

    /** {@code void LLVMOrcJITTargetMachineBuilderSetTargetTriple(LLVMOrcJITTargetMachineBuilderRef JTMB, char const * TargetTriple)} */
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

    /** {@code LLVMErrorRef LLVMOrcObjectLayerAddObjectFile(LLVMOrcObjectLayerRef ObjLayer, LLVMOrcJITDylibRef JD, LLVMMemoryBufferRef ObjBuffer)} */
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

    /** {@code LLVMErrorRef LLVMOrcObjectLayerAddObjectFileWithRT(LLVMOrcObjectLayerRef ObjLayer, LLVMOrcResourceTrackerRef RT, LLVMMemoryBufferRef ObjBuffer)} */
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

    /** {@code void LLVMOrcObjectLayerEmit(LLVMOrcObjectLayerRef ObjLayer, LLVMOrcMaterializationResponsibilityRef R, LLVMMemoryBufferRef ObjBuffer)} */
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

    /** {@code void LLVMOrcDisposeObjectLayer(LLVMOrcObjectLayerRef ObjLayer)} */
    public static void LLVMOrcDisposeObjectLayer(@NativeType("LLVMOrcObjectLayerRef") long ObjLayer) {
        long __functionAddress = Functions.OrcDisposeObjectLayer;
        if (CHECKS) {
            check(ObjLayer);
        }
        invokePV(ObjLayer, __functionAddress);
    }

    // --- [ LLVMOrcIRTransformLayerEmit ] ---

    /** {@code void LLVMOrcIRTransformLayerEmit(LLVMOrcIRTransformLayerRef IRTransformLayer, LLVMOrcMaterializationResponsibilityRef MR, LLVMOrcThreadSafeModuleRef TSM)} */
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

    /** {@code void LLVMOrcIRTransformLayerSetTransform(LLVMOrcIRTransformLayerRef IRTransformLayer, LLVMOrcIRTransformLayerTransformFunction TransformFunction, void * Ctx)} */
    public static void nLLVMOrcIRTransformLayerSetTransform(long IRTransformLayer, long TransformFunction, long Ctx) {
        long __functionAddress = Functions.OrcIRTransformLayerSetTransform;
        if (CHECKS) {
            check(__functionAddress);
            check(IRTransformLayer);
            check(Ctx);
        }
        invokePPPV(IRTransformLayer, TransformFunction, Ctx, __functionAddress);
    }

    /** {@code void LLVMOrcIRTransformLayerSetTransform(LLVMOrcIRTransformLayerRef IRTransformLayer, LLVMOrcIRTransformLayerTransformFunction TransformFunction, void * Ctx)} */
    public static void LLVMOrcIRTransformLayerSetTransform(@NativeType("LLVMOrcIRTransformLayerRef") long IRTransformLayer, @NativeType("LLVMOrcIRTransformLayerTransformFunction") LLVMOrcIRTransformLayerTransformFunctionI TransformFunction, @NativeType("void *") long Ctx) {
        nLLVMOrcIRTransformLayerSetTransform(IRTransformLayer, TransformFunction.address(), Ctx);
    }

    // --- [ LLVMOrcObjectTransformLayerSetTransform ] ---

    /** {@code void LLVMOrcObjectTransformLayerSetTransform(LLVMOrcObjectTransformLayerRef ObjTransformLayer, LLVMOrcObjectTransformLayerTransformFunction TransformFunction, void * Ctx)} */
    public static void nLLVMOrcObjectTransformLayerSetTransform(long ObjTransformLayer, long TransformFunction, long Ctx) {
        long __functionAddress = Functions.OrcObjectTransformLayerSetTransform;
        if (CHECKS) {
            check(__functionAddress);
            check(ObjTransformLayer);
            check(Ctx);
        }
        invokePPPV(ObjTransformLayer, TransformFunction, Ctx, __functionAddress);
    }

    /** {@code void LLVMOrcObjectTransformLayerSetTransform(LLVMOrcObjectTransformLayerRef ObjTransformLayer, LLVMOrcObjectTransformLayerTransformFunction TransformFunction, void * Ctx)} */
    public static void LLVMOrcObjectTransformLayerSetTransform(@NativeType("LLVMOrcObjectTransformLayerRef") long ObjTransformLayer, @NativeType("LLVMOrcObjectTransformLayerTransformFunction") LLVMOrcObjectTransformLayerTransformFunctionI TransformFunction, @NativeType("void *") long Ctx) {
        nLLVMOrcObjectTransformLayerSetTransform(ObjTransformLayer, TransformFunction.address(), Ctx);
    }

    // --- [ LLVMOrcCreateLocalIndirectStubsManager ] ---

    /** {@code LLVMOrcIndirectStubsManagerRef LLVMOrcCreateLocalIndirectStubsManager(char const * TargetTriple)} */
    public static long nLLVMOrcCreateLocalIndirectStubsManager(long TargetTriple) {
        long __functionAddress = Functions.OrcCreateLocalIndirectStubsManager;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePP(TargetTriple, __functionAddress);
    }

    /** {@code LLVMOrcIndirectStubsManagerRef LLVMOrcCreateLocalIndirectStubsManager(char const * TargetTriple)} */
    @NativeType("LLVMOrcIndirectStubsManagerRef")
    public static long LLVMOrcCreateLocalIndirectStubsManager(@NativeType("char const *") ByteBuffer TargetTriple) {
        if (CHECKS) {
            checkNT1(TargetTriple);
        }
        return nLLVMOrcCreateLocalIndirectStubsManager(memAddress(TargetTriple));
    }

    /** {@code LLVMOrcIndirectStubsManagerRef LLVMOrcCreateLocalIndirectStubsManager(char const * TargetTriple)} */
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

    /** {@code void LLVMOrcDisposeIndirectStubsManager(LLVMOrcIndirectStubsManagerRef ISM)} */
    public static void LLVMOrcDisposeIndirectStubsManager(@NativeType("LLVMOrcIndirectStubsManagerRef") long ISM) {
        long __functionAddress = Functions.OrcDisposeIndirectStubsManager;
        if (CHECKS) {
            check(__functionAddress);
            check(ISM);
        }
        invokePV(ISM, __functionAddress);
    }

    // --- [ LLVMOrcCreateLocalLazyCallThroughManager ] ---

    /** {@code LLVMErrorRef LLVMOrcCreateLocalLazyCallThroughManager(char const * TargetTriple, LLVMOrcExecutionSessionRef ES, LLVMOrcJITTargetAddress ErrorHandlerAddr, LLVMOrcLazyCallThroughManagerRef * LCTM)} */
    public static long nLLVMOrcCreateLocalLazyCallThroughManager(long TargetTriple, long ES, long ErrorHandlerAddr, long LCTM) {
        long __functionAddress = Functions.OrcCreateLocalLazyCallThroughManager;
        if (CHECKS) {
            check(__functionAddress);
            check(ES);
        }
        return invokePPJPP(TargetTriple, ES, ErrorHandlerAddr, LCTM, __functionAddress);
    }

    /** {@code LLVMErrorRef LLVMOrcCreateLocalLazyCallThroughManager(char const * TargetTriple, LLVMOrcExecutionSessionRef ES, LLVMOrcJITTargetAddress ErrorHandlerAddr, LLVMOrcLazyCallThroughManagerRef * LCTM)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcCreateLocalLazyCallThroughManager(@NativeType("char const *") ByteBuffer TargetTriple, @NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("LLVMOrcJITTargetAddress") long ErrorHandlerAddr, @NativeType("LLVMOrcLazyCallThroughManagerRef *") PointerBuffer LCTM) {
        if (CHECKS) {
            checkNT1(TargetTriple);
            check(LCTM, 1);
        }
        return nLLVMOrcCreateLocalLazyCallThroughManager(memAddress(TargetTriple), ES, ErrorHandlerAddr, memAddress(LCTM));
    }

    /** {@code LLVMErrorRef LLVMOrcCreateLocalLazyCallThroughManager(char const * TargetTriple, LLVMOrcExecutionSessionRef ES, LLVMOrcJITTargetAddress ErrorHandlerAddr, LLVMOrcLazyCallThroughManagerRef * LCTM)} */
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

    /** {@code void LLVMOrcDisposeLazyCallThroughManager(LLVMOrcLazyCallThroughManagerRef LCTM)} */
    public static void LLVMOrcDisposeLazyCallThroughManager(@NativeType("LLVMOrcLazyCallThroughManagerRef") long LCTM) {
        long __functionAddress = Functions.OrcDisposeLazyCallThroughManager;
        if (CHECKS) {
            check(__functionAddress);
            check(LCTM);
        }
        invokePV(LCTM, __functionAddress);
    }

    // --- [ LLVMOrcCreateDumpObjects ] ---

    /** {@code LLVMOrcDumpObjectsRef LLVMOrcCreateDumpObjects(char const * DumpDir, char const * IdentifierOverride)} */
    public static long nLLVMOrcCreateDumpObjects(long DumpDir, long IdentifierOverride) {
        long __functionAddress = Functions.OrcCreateDumpObjects;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePPP(DumpDir, IdentifierOverride, __functionAddress);
    }

    /** {@code LLVMOrcDumpObjectsRef LLVMOrcCreateDumpObjects(char const * DumpDir, char const * IdentifierOverride)} */
    @NativeType("LLVMOrcDumpObjectsRef")
    public static long LLVMOrcCreateDumpObjects(@NativeType("char const *") ByteBuffer DumpDir, @NativeType("char const *") ByteBuffer IdentifierOverride) {
        if (CHECKS) {
            checkNT1(DumpDir);
            checkNT1(IdentifierOverride);
        }
        return nLLVMOrcCreateDumpObjects(memAddress(DumpDir), memAddress(IdentifierOverride));
    }

    /** {@code LLVMOrcDumpObjectsRef LLVMOrcCreateDumpObjects(char const * DumpDir, char const * IdentifierOverride)} */
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

    /** {@code void LLVMOrcDisposeDumpObjects(LLVMOrcDumpObjectsRef DumpObjects)} */
    public static void LLVMOrcDisposeDumpObjects(@NativeType("LLVMOrcDumpObjectsRef") long DumpObjects) {
        long __functionAddress = Functions.OrcDisposeDumpObjects;
        if (CHECKS) {
            check(__functionAddress);
            check(DumpObjects);
        }
        invokePV(DumpObjects, __functionAddress);
    }

    // --- [ LLVMOrcDumpObjects_CallOperator ] ---

    /** {@code LLVMErrorRef LLVMOrcDumpObjects_CallOperator(LLVMOrcDumpObjectsRef DumpObjects, LLVMMemoryBufferRef * ObjBuffer)} */
    public static long nLLVMOrcDumpObjects_CallOperator(long DumpObjects, long ObjBuffer) {
        long __functionAddress = Functions.OrcDumpObjects_CallOperator;
        if (CHECKS) {
            check(__functionAddress);
            check(DumpObjects);
        }
        return invokePPP(DumpObjects, ObjBuffer, __functionAddress);
    }

    /** {@code LLVMErrorRef LLVMOrcDumpObjects_CallOperator(LLVMOrcDumpObjectsRef DumpObjects, LLVMMemoryBufferRef * ObjBuffer)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcDumpObjects_CallOperator(@NativeType("LLVMOrcDumpObjectsRef") long DumpObjects, @NativeType("LLVMMemoryBufferRef *") PointerBuffer ObjBuffer) {
        if (CHECKS) {
            check(ObjBuffer, 1);
        }
        return nLLVMOrcDumpObjects_CallOperator(DumpObjects, memAddress(ObjBuffer));
    }

}