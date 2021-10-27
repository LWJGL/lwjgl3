/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class LLVMExecutionEngine {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            LinkInMCJIT                     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMLinkInMCJIT"),
            LinkInInterpreter               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMLinkInInterpreter"),
            CreateGenericValueOfInt         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMCreateGenericValueOfInt"),
            CreateGenericValueOfPointer     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMCreateGenericValueOfPointer"),
            CreateGenericValueOfFloat       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMCreateGenericValueOfFloat"),
            GenericValueIntWidth            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGenericValueIntWidth"),
            GenericValueToInt               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGenericValueToInt"),
            GenericValueToPointer           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGenericValueToPointer"),
            GenericValueToFloat             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGenericValueToFloat"),
            DisposeGenericValue             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDisposeGenericValue"),
            CreateExecutionEngineForModule  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMCreateExecutionEngineForModule"),
            CreateInterpreterForModule      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMCreateInterpreterForModule"),
            CreateJITCompilerForModule      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMCreateJITCompilerForModule"),
            InitializeMCJITCompilerOptions  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeMCJITCompilerOptions"),
            CreateMCJITCompilerForModule    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMCreateMCJITCompilerForModule"),
            DisposeExecutionEngine          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDisposeExecutionEngine"),
            RunStaticConstructors           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRunStaticConstructors"),
            RunStaticDestructors            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRunStaticDestructors"),
            RunFunctionAsMain               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRunFunctionAsMain"),
            RunFunction                     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRunFunction"),
            FreeMachineCodeForFunction      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMFreeMachineCodeForFunction"),
            AddModule                       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddModule"),
            RemoveModule                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemoveModule"),
            FindFunction                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMFindFunction"),
            RecompileAndRelinkFunction      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRecompileAndRelinkFunction"),
            GetExecutionEngineTargetData    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetExecutionEngineTargetData"),
            GetExecutionEngineTargetMachine = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetExecutionEngineTargetMachine"),
            AddGlobalMapping                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddGlobalMapping"),
            GetPointerToGlobal              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetPointerToGlobal"),
            GetGlobalValueAddress           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetGlobalValueAddress"),
            GetFunctionAddress              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetFunctionAddress"),
            ExecutionEngineGetErrMsg        = LLVMCore.getLibrary().getFunctionAddress("LLVMExecutionEngineGetErrMsg"),
            CreateSimpleMCJITMemoryManager  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMCreateSimpleMCJITMemoryManager"),
            DisposeMCJITMemoryManager       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDisposeMCJITMemoryManager"),
            CreateGDBRegistrationListener   = LLVMCore.getLibrary().getFunctionAddress("LLVMCreateGDBRegistrationListener"),
            CreateIntelJITEventListener     = LLVMCore.getLibrary().getFunctionAddress("LLVMCreateIntelJITEventListener"),
            CreateOProfileJITEventListener  = LLVMCore.getLibrary().getFunctionAddress("LLVMCreateOProfileJITEventListener"),
            CreatePerfJITEventListener      = LLVMCore.getLibrary().getFunctionAddress("LLVMCreatePerfJITEventListener");

    }

    protected LLVMExecutionEngine() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMLinkInMCJIT ] ---

    public static void LLVMLinkInMCJIT() {
        long __functionAddress = Functions.LinkInMCJIT;
        invokeV(__functionAddress);
    }

    // --- [ LLVMLinkInInterpreter ] ---

    public static void LLVMLinkInInterpreter() {
        long __functionAddress = Functions.LinkInInterpreter;
        invokeV(__functionAddress);
    }

    // --- [ LLVMCreateGenericValueOfInt ] ---

    @NativeType("LLVMGenericValueRef")
    public static long LLVMCreateGenericValueOfInt(@NativeType("LLVMTypeRef") long Ty, @NativeType("unsigned long long") long N, @NativeType("LLVMBool") boolean IsSigned) {
        long __functionAddress = Functions.CreateGenericValueOfInt;
        if (CHECKS) {
            check(Ty);
        }
        return invokePJP(Ty, N, IsSigned ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMCreateGenericValueOfPointer ] ---

    @NativeType("LLVMGenericValueRef")
    public static long LLVMCreateGenericValueOfPointer(@NativeType("void *") long P) {
        long __functionAddress = Functions.CreateGenericValueOfPointer;
        if (CHECKS) {
            check(P);
        }
        return invokePP(P, __functionAddress);
    }

    // --- [ LLVMCreateGenericValueOfFloat ] ---

    @NativeType("LLVMGenericValueRef")
    public static long LLVMCreateGenericValueOfFloat(@NativeType("LLVMTypeRef") long Ty, double N) {
        long __functionAddress = Functions.CreateGenericValueOfFloat;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(Ty, N, __functionAddress);
    }

    // --- [ LLVMGenericValueIntWidth ] ---

    @NativeType("unsigned int")
    public static int LLVMGenericValueIntWidth(@NativeType("LLVMGenericValueRef") long GenValRef) {
        long __functionAddress = Functions.GenericValueIntWidth;
        if (CHECKS) {
            check(GenValRef);
        }
        return invokePI(GenValRef, __functionAddress);
    }

    // --- [ LLVMGenericValueToInt ] ---

    @NativeType("unsigned long long")
    public static long LLVMGenericValueToInt(@NativeType("LLVMGenericValueRef") long GenVal, @NativeType("LLVMBool") boolean IsSigned) {
        long __functionAddress = Functions.GenericValueToInt;
        if (CHECKS) {
            check(GenVal);
        }
        return invokePJ(GenVal, IsSigned ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMGenericValueToPointer ] ---

    @NativeType("void *")
    public static long LLVMGenericValueToPointer(@NativeType("LLVMGenericValueRef") long GenVal) {
        long __functionAddress = Functions.GenericValueToPointer;
        if (CHECKS) {
            check(GenVal);
        }
        return invokePP(GenVal, __functionAddress);
    }

    // --- [ LLVMGenericValueToFloat ] ---

    public static double LLVMGenericValueToFloat(@NativeType("LLVMTypeRef") long TyRef, @NativeType("LLVMGenericValueRef") long GenVal) {
        long __functionAddress = Functions.GenericValueToFloat;
        if (CHECKS) {
            check(TyRef);
            check(GenVal);
        }
        return invokePPD(TyRef, GenVal, __functionAddress);
    }

    // --- [ LLVMDisposeGenericValue ] ---

    public static void LLVMDisposeGenericValue(@NativeType("LLVMGenericValueRef") long GenVal) {
        long __functionAddress = Functions.DisposeGenericValue;
        if (CHECKS) {
            check(GenVal);
        }
        invokePV(GenVal, __functionAddress);
    }

    // --- [ LLVMCreateExecutionEngineForModule ] ---

    public static int nLLVMCreateExecutionEngineForModule(long OutEE, long M, long OutError) {
        long __functionAddress = Functions.CreateExecutionEngineForModule;
        if (CHECKS) {
            check(M);
        }
        return invokePPPI(OutEE, M, OutError, __functionAddress);
    }

    @NativeType("LLVMBool")
    public static boolean LLVMCreateExecutionEngineForModule(@NativeType("LLVMExecutionEngineRef *") PointerBuffer OutEE, @NativeType("LLVMModuleRef") long M, @NativeType("char **") PointerBuffer OutError) {
        if (CHECKS) {
            check(OutEE, 1);
            check(OutError, 1);
        }
        return nLLVMCreateExecutionEngineForModule(memAddress(OutEE), M, memAddress(OutError)) != 0;
    }

    // --- [ LLVMCreateInterpreterForModule ] ---

    public static int nLLVMCreateInterpreterForModule(long OutInterp, long M, long OutError) {
        long __functionAddress = Functions.CreateInterpreterForModule;
        if (CHECKS) {
            check(M);
        }
        return invokePPPI(OutInterp, M, OutError, __functionAddress);
    }

    @NativeType("LLVMBool")
    public static boolean LLVMCreateInterpreterForModule(@NativeType("LLVMExecutionEngineRef *") PointerBuffer OutInterp, @NativeType("LLVMModuleRef") long M, @NativeType("char **") PointerBuffer OutError) {
        if (CHECKS) {
            check(OutInterp, 1);
            check(OutError, 1);
        }
        return nLLVMCreateInterpreterForModule(memAddress(OutInterp), M, memAddress(OutError)) != 0;
    }

    // --- [ LLVMCreateJITCompilerForModule ] ---

    public static int nLLVMCreateJITCompilerForModule(long OutJIT, long M, int OptLevel, long OutError) {
        long __functionAddress = Functions.CreateJITCompilerForModule;
        if (CHECKS) {
            check(M);
        }
        return invokePPPI(OutJIT, M, OptLevel, OutError, __functionAddress);
    }

    @NativeType("LLVMBool")
    public static boolean LLVMCreateJITCompilerForModule(@NativeType("LLVMExecutionEngineRef *") PointerBuffer OutJIT, @NativeType("LLVMModuleRef") long M, @NativeType("unsigned int") int OptLevel, @NativeType("char **") PointerBuffer OutError) {
        if (CHECKS) {
            check(OutJIT, 1);
            check(OutError, 1);
        }
        return nLLVMCreateJITCompilerForModule(memAddress(OutJIT), M, OptLevel, memAddress(OutError)) != 0;
    }

    // --- [ LLVMInitializeMCJITCompilerOptions ] ---

    public static void nLLVMInitializeMCJITCompilerOptions(long Options, long SizeOfOptions) {
        long __functionAddress = Functions.InitializeMCJITCompilerOptions;
        invokePPV(Options, SizeOfOptions, __functionAddress);
    }

    public static void LLVMInitializeMCJITCompilerOptions(@NativeType("struct LLVMMCJITCompilerOptions *") LLVMMCJITCompilerOptions.Buffer Options) {
        nLLVMInitializeMCJITCompilerOptions(Options.address(), Options.remaining());
    }

    // --- [ LLVMCreateMCJITCompilerForModule ] ---

    /** Unsafe version of: {@link #LLVMCreateMCJITCompilerForModule CreateMCJITCompilerForModule} */
    public static int nLLVMCreateMCJITCompilerForModule(long OutJIT, long M, long Options, long SizeOfOptions, long OutError) {
        long __functionAddress = Functions.CreateMCJITCompilerForModule;
        if (CHECKS) {
            check(M);
        }
        return invokePPPPPI(OutJIT, M, Options, SizeOfOptions, OutError, __functionAddress);
    }

    /**
     * Create an MCJIT execution engine for a module, with the given options. It is the responsibility of the caller to ensure that all fields in
     * {@code Options} up to the given {@code SizeOfOptions} are initialized. It is correct to pass a smaller value of {@code SizeOfOptions} that omits some
     * fields. The canonical way of using this is:
     * 
     * <pre><code>
     * LLVMMCJITCompilerOptions options;
     * LLVMInitializeMCJITCompilerOptions(&amp;options, sizeof(options));
     * ... fill in those options you care about
     * LLVMCreateMCJITCompilerForModule(&amp;jit, mod, &amp;options, sizeof(options),
     *                                  &amp;error);</code></pre>
     * 
     * <p>Note that this is also correct, though possibly suboptimal:</p>
     * 
     * <pre><code>
     * LLVMCreateMCJITCompilerForModule(&amp;jit, mod, 0, 0, &amp;error);</code></pre>
     */
    @NativeType("LLVMBool")
    public static boolean LLVMCreateMCJITCompilerForModule(@NativeType("LLVMExecutionEngineRef *") PointerBuffer OutJIT, @NativeType("LLVMModuleRef") long M, @NativeType("struct LLVMMCJITCompilerOptions *") LLVMMCJITCompilerOptions.Buffer Options, @NativeType("char **") PointerBuffer OutError) {
        if (CHECKS) {
            check(OutJIT, 1);
            check(OutError, 1);
        }
        return nLLVMCreateMCJITCompilerForModule(memAddress(OutJIT), M, Options.address(), Options.remaining(), memAddress(OutError)) != 0;
    }

    // --- [ LLVMDisposeExecutionEngine ] ---

    public static void LLVMDisposeExecutionEngine(@NativeType("LLVMExecutionEngineRef") long EE) {
        long __functionAddress = Functions.DisposeExecutionEngine;
        if (CHECKS) {
            check(EE);
        }
        invokePV(EE, __functionAddress);
    }

    // --- [ LLVMRunStaticConstructors ] ---

    public static void LLVMRunStaticConstructors(@NativeType("LLVMExecutionEngineRef") long EE) {
        long __functionAddress = Functions.RunStaticConstructors;
        if (CHECKS) {
            check(EE);
        }
        invokePV(EE, __functionAddress);
    }

    // --- [ LLVMRunStaticDestructors ] ---

    public static void LLVMRunStaticDestructors(@NativeType("LLVMExecutionEngineRef") long EE) {
        long __functionAddress = Functions.RunStaticDestructors;
        if (CHECKS) {
            check(EE);
        }
        invokePV(EE, __functionAddress);
    }

    // --- [ LLVMRunFunctionAsMain ] ---

    public static int nLLVMRunFunctionAsMain(long EE, long F, int ArgC, long ArgV, long EnvP) {
        long __functionAddress = Functions.RunFunctionAsMain;
        if (CHECKS) {
            check(EE);
            check(F);
        }
        return invokePPPPI(EE, F, ArgC, ArgV, EnvP, __functionAddress);
    }

    public static int LLVMRunFunctionAsMain(@NativeType("LLVMExecutionEngineRef") long EE, @NativeType("LLVMValueRef") long F, @NativeType("char const * const *") PointerBuffer ArgV, @NativeType("char const * const *") PointerBuffer EnvP) {
        if (CHECKS) {
            checkNT(EnvP);
        }
        return nLLVMRunFunctionAsMain(EE, F, ArgV.remaining(), memAddress(ArgV), memAddress(EnvP));
    }

    // --- [ LLVMRunFunction ] ---

    public static long nLLVMRunFunction(long EE, long F, int NumArgs, long Args) {
        long __functionAddress = Functions.RunFunction;
        if (CHECKS) {
            check(EE);
            check(F);
        }
        return invokePPPP(EE, F, NumArgs, Args, __functionAddress);
    }

    @NativeType("LLVMGenericValueRef")
    public static long LLVMRunFunction(@NativeType("LLVMExecutionEngineRef") long EE, @NativeType("LLVMValueRef") long F, @NativeType("LLVMGenericValueRef *") PointerBuffer Args) {
        return nLLVMRunFunction(EE, F, Args.remaining(), memAddress(Args));
    }

    // --- [ LLVMFreeMachineCodeForFunction ] ---

    public static void LLVMFreeMachineCodeForFunction(@NativeType("LLVMExecutionEngineRef") long EE, @NativeType("LLVMValueRef") long F) {
        long __functionAddress = Functions.FreeMachineCodeForFunction;
        if (CHECKS) {
            check(EE);
            check(F);
        }
        invokePPV(EE, F, __functionAddress);
    }

    // --- [ LLVMAddModule ] ---

    public static void LLVMAddModule(@NativeType("LLVMExecutionEngineRef") long EE, @NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.AddModule;
        if (CHECKS) {
            check(EE);
            check(M);
        }
        invokePPV(EE, M, __functionAddress);
    }

    // --- [ LLVMRemoveModule ] ---

    public static int nLLVMRemoveModule(long EE, long M, long OutMod, long OutError) {
        long __functionAddress = Functions.RemoveModule;
        if (CHECKS) {
            check(EE);
            check(M);
        }
        return invokePPPPI(EE, M, OutMod, OutError, __functionAddress);
    }

    @NativeType("LLVMBool")
    public static boolean LLVMRemoveModule(@NativeType("LLVMExecutionEngineRef") long EE, @NativeType("LLVMModuleRef") long M, @NativeType("LLVMModuleRef *") PointerBuffer OutMod, @NativeType("char **") PointerBuffer OutError) {
        if (CHECKS) {
            check(OutMod, 1);
            check(OutError, 1);
        }
        return nLLVMRemoveModule(EE, M, memAddress(OutMod), memAddress(OutError)) != 0;
    }

    // --- [ LLVMFindFunction ] ---

    public static int nLLVMFindFunction(long EE, long Name, long OutFn) {
        long __functionAddress = Functions.FindFunction;
        if (CHECKS) {
            check(EE);
        }
        return invokePPPI(EE, Name, OutFn, __functionAddress);
    }

    @NativeType("LLVMBool")
    public static boolean LLVMFindFunction(@NativeType("LLVMExecutionEngineRef") long EE, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMValueRef *") PointerBuffer OutFn) {
        if (CHECKS) {
            check(Name, 1);
            check(OutFn, 1);
        }
        return nLLVMFindFunction(EE, memAddress(Name), memAddress(OutFn)) != 0;
    }

    @NativeType("LLVMBool")
    public static boolean LLVMFindFunction(@NativeType("LLVMExecutionEngineRef") long EE, @NativeType("char const *") CharSequence Name, @NativeType("LLVMValueRef *") PointerBuffer OutFn) {
        if (CHECKS) {
            check(Name, 1);
            check(OutFn, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMFindFunction(EE, NameEncoded, memAddress(OutFn)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMRecompileAndRelinkFunction ] ---

    @NativeType("void *")
    public static long LLVMRecompileAndRelinkFunction(@NativeType("LLVMExecutionEngineRef") long EE, @NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.RecompileAndRelinkFunction;
        if (CHECKS) {
            check(EE);
            check(Fn);
        }
        return invokePPP(EE, Fn, __functionAddress);
    }

    // --- [ LLVMGetExecutionEngineTargetData ] ---

    @NativeType("LLVMTargetDataRef")
    public static long LLVMGetExecutionEngineTargetData(@NativeType("LLVMExecutionEngineRef") long EE) {
        long __functionAddress = Functions.GetExecutionEngineTargetData;
        if (CHECKS) {
            check(EE);
        }
        return invokePP(EE, __functionAddress);
    }

    // --- [ LLVMGetExecutionEngineTargetMachine ] ---

    @NativeType("LLVMTargetMachineRef")
    public static long LLVMGetExecutionEngineTargetMachine(@NativeType("LLVMExecutionEngineRef") long EE) {
        long __functionAddress = Functions.GetExecutionEngineTargetMachine;
        if (CHECKS) {
            check(EE);
        }
        return invokePP(EE, __functionAddress);
    }

    // --- [ LLVMAddGlobalMapping ] ---

    public static void LLVMAddGlobalMapping(@NativeType("LLVMExecutionEngineRef") long EE, @NativeType("LLVMValueRef") long Global, @NativeType("void *") long Addr) {
        long __functionAddress = Functions.AddGlobalMapping;
        if (CHECKS) {
            check(EE);
            check(Global);
            check(Addr);
        }
        invokePPPV(EE, Global, Addr, __functionAddress);
    }

    // --- [ LLVMGetPointerToGlobal ] ---

    @NativeType("void *")
    public static long LLVMGetPointerToGlobal(@NativeType("LLVMExecutionEngineRef") long EE, @NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.GetPointerToGlobal;
        if (CHECKS) {
            check(EE);
            check(Global);
        }
        return invokePPP(EE, Global, __functionAddress);
    }

    // --- [ LLVMGetGlobalValueAddress ] ---

    public static long nLLVMGetGlobalValueAddress(long EE, long Name) {
        long __functionAddress = Functions.GetGlobalValueAddress;
        if (CHECKS) {
            check(EE);
        }
        return invokePPJ(EE, Name, __functionAddress);
    }

    @NativeType("uint64_t")
    public static long LLVMGetGlobalValueAddress(@NativeType("LLVMExecutionEngineRef") long EE, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMGetGlobalValueAddress(EE, memAddress(Name));
    }

    @NativeType("uint64_t")
    public static long LLVMGetGlobalValueAddress(@NativeType("LLVMExecutionEngineRef") long EE, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMGetGlobalValueAddress(EE, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetFunctionAddress ] ---

    public static long nLLVMGetFunctionAddress(long EE, long Name) {
        long __functionAddress = Functions.GetFunctionAddress;
        if (CHECKS) {
            check(EE);
        }
        return invokePPJ(EE, Name, __functionAddress);
    }

    @NativeType("uint64_t")
    public static long LLVMGetFunctionAddress(@NativeType("LLVMExecutionEngineRef") long EE, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMGetFunctionAddress(EE, memAddress(Name));
    }

    @NativeType("uint64_t")
    public static long LLVMGetFunctionAddress(@NativeType("LLVMExecutionEngineRef") long EE, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMGetFunctionAddress(EE, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMExecutionEngineGetErrMsg ] ---

    /** Unsafe version of: {@link #LLVMExecutionEngineGetErrMsg ExecutionEngineGetErrMsg} */
    public static int nLLVMExecutionEngineGetErrMsg(long EE, long OutError) {
        long __functionAddress = Functions.ExecutionEngineGetErrMsg;
        if (CHECKS) {
            check(__functionAddress);
            check(EE);
        }
        return invokePPI(EE, OutError, __functionAddress);
    }

    /**
     * Returns true on error, false on success. If true is returned then the error message is copied to {@code OutStr} and cleared in the
     * {@code ExecutionEngine} instance.
     *
     * @since 11
     */
    @NativeType("LLVMBool")
    public static boolean LLVMExecutionEngineGetErrMsg(@NativeType("LLVMExecutionEngineRef") long EE, @NativeType("char **") PointerBuffer OutError) {
        if (CHECKS) {
            check(OutError, 1);
        }
        return nLLVMExecutionEngineGetErrMsg(EE, memAddress(OutError)) != 0;
    }

    // --- [ LLVMCreateSimpleMCJITMemoryManager ] ---

    /** Unsafe version of: {@link #LLVMCreateSimpleMCJITMemoryManager CreateSimpleMCJITMemoryManager} */
    public static long nLLVMCreateSimpleMCJITMemoryManager(long Opaque, long AllocateCodeSection, long AllocateDataSection, long FinalizeMemory, long Destroy) {
        long __functionAddress = Functions.CreateSimpleMCJITMemoryManager;
        if (CHECKS) {
            check(Opaque);
        }
        return invokePPPPPP(Opaque, AllocateCodeSection, AllocateDataSection, FinalizeMemory, Destroy, __functionAddress);
    }

    /**
     * Create a simple custom MCJIT memory manager. This memory manager can intercept allocations in a module-oblivious way. This will return {@code NULL} if any of
     * the passed functions are {@code NULL}.
     *
     * @param Opaque              an opaque client object to pass back to the callbacks
     * @param AllocateCodeSection allocate a block of memory for executable code
     * @param AllocateDataSection allocate a block of memory for data
     * @param FinalizeMemory      set page permissions and flush cache. Return 0 on success, 1 on error.
     */
    @NativeType("LLVMMCJITMemoryManagerRef")
    public static long LLVMCreateSimpleMCJITMemoryManager(@NativeType("void *") long Opaque, @NativeType("uint8_t * (*) (void *, uintptr_t, unsigned int, unsigned int, char const *)") LLVMMemoryManagerAllocateCodeSectionCallbackI AllocateCodeSection, @NativeType("uint8_t * (*) (void *, uintptr_t, unsigned int, unsigned int, char const *, LLVMBool)") LLVMMemoryManagerAllocateDataSectionCallbackI AllocateDataSection, @NativeType("LLVMBool (*) (void *, char **)") LLVMMemoryManagerFinalizeMemoryCallbackI FinalizeMemory, @NativeType("void (*) (void *)") LLVMMemoryManagerDestroyCallbackI Destroy) {
        return nLLVMCreateSimpleMCJITMemoryManager(Opaque, AllocateCodeSection.address(), AllocateDataSection.address(), FinalizeMemory.address(), Destroy.address());
    }

    // --- [ LLVMDisposeMCJITMemoryManager ] ---

    public static void LLVMDisposeMCJITMemoryManager(@NativeType("LLVMMCJITMemoryManagerRef") long MM) {
        long __functionAddress = Functions.DisposeMCJITMemoryManager;
        if (CHECKS) {
            check(MM);
        }
        invokePV(MM, __functionAddress);
    }

    // --- [ LLVMCreateGDBRegistrationListener ] ---

    @NativeType("LLVMJITEventListenerRef")
    public static long LLVMCreateGDBRegistrationListener() {
        long __functionAddress = Functions.CreateGDBRegistrationListener;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    // --- [ LLVMCreateIntelJITEventListener ] ---

    @NativeType("LLVMJITEventListenerRef")
    public static long LLVMCreateIntelJITEventListener() {
        long __functionAddress = Functions.CreateIntelJITEventListener;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    // --- [ LLVMCreateOProfileJITEventListener ] ---

    @NativeType("LLVMJITEventListenerRef")
    public static long LLVMCreateOProfileJITEventListener() {
        long __functionAddress = Functions.CreateOProfileJITEventListener;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    // --- [ LLVMCreatePerfJITEventListener ] ---

    @NativeType("LLVMJITEventListenerRef")
    public static long LLVMCreatePerfJITEventListener() {
        long __functionAddress = Functions.CreatePerfJITEventListener;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

}