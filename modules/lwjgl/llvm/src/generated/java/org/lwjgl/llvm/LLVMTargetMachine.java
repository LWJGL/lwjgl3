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

public class LLVMTargetMachine {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetFirstTarget                         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetFirstTarget"),
            GetNextTarget                          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetNextTarget"),
            GetTargetFromName                      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetTargetFromName"),
            GetTargetFromTriple                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetTargetFromTriple"),
            GetTargetName                          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetTargetName"),
            GetTargetDescription                   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetTargetDescription"),
            TargetHasJIT                           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMTargetHasJIT"),
            TargetHasTargetMachine                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMTargetHasTargetMachine"),
            TargetHasAsmBackend                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMTargetHasAsmBackend"),
            CreateTargetMachineOptions             = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMCreateTargetMachineOptions"),
            DisposeTargetMachineOptions            = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDisposeTargetMachineOptions"),
            TargetMachineOptionsSetCPU             = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMTargetMachineOptionsSetCPU"),
            TargetMachineOptionsSetFeatures        = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMTargetMachineOptionsSetFeatures"),
            TargetMachineOptionsSetABI             = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMTargetMachineOptionsSetABI"),
            TargetMachineOptionsSetCodeGenOptLevel = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMTargetMachineOptionsSetCodeGenOptLevel"),
            TargetMachineOptionsSetRelocMode       = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMTargetMachineOptionsSetRelocMode"),
            TargetMachineOptionsSetCodeModel       = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMTargetMachineOptionsSetCodeModel"),
            CreateTargetMachineWithOptions         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMCreateTargetMachineWithOptions"),
            CreateTargetMachine                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMCreateTargetMachine"),
            DisposeTargetMachine                   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDisposeTargetMachine"),
            GetTargetMachineTarget                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetTargetMachineTarget"),
            GetTargetMachineTriple                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetTargetMachineTriple"),
            GetTargetMachineCPU                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetTargetMachineCPU"),
            GetTargetMachineFeatureString          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetTargetMachineFeatureString"),
            CreateTargetDataLayout                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMCreateTargetDataLayout"),
            SetTargetMachineAsmVerbosity           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMSetTargetMachineAsmVerbosity"),
            SetTargetMachineFastISel               = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMSetTargetMachineFastISel"),
            SetTargetMachineGlobalISel             = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMSetTargetMachineGlobalISel"),
            SetTargetMachineGlobalISelAbort        = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMSetTargetMachineGlobalISelAbort"),
            SetTargetMachineMachineOutliner        = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMSetTargetMachineMachineOutliner"),
            TargetMachineEmitToFile                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMTargetMachineEmitToFile"),
            TargetMachineEmitToMemoryBuffer        = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMTargetMachineEmitToMemoryBuffer"),
            GetDefaultTargetTriple                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetDefaultTargetTriple"),
            NormalizeTargetTriple                  = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMNormalizeTargetTriple"),
            GetHostCPUName                         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMGetHostCPUName"),
            GetHostCPUFeatures                     = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMGetHostCPUFeatures"),
            AddAnalysisPasses                      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddAnalysisPasses");

    }

    /**
     * {@code LLVMCodeGenOptLevel}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMCodeGenLevelNone CodeGenLevelNone}</li>
     * <li>{@link #LLVMCodeGenLevelLess CodeGenLevelLess}</li>
     * <li>{@link #LLVMCodeGenLevelDefault CodeGenLevelDefault}</li>
     * <li>{@link #LLVMCodeGenLevelAggressive CodeGenLevelAggressive}</li>
     * </ul>
     */
    public static final int
        LLVMCodeGenLevelNone       = 0,
        LLVMCodeGenLevelLess       = 1,
        LLVMCodeGenLevelDefault    = 2,
        LLVMCodeGenLevelAggressive = 3;

    /**
     * {@code LLVMRelocMode}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMRelocDefault RelocDefault}</li>
     * <li>{@link #LLVMRelocStatic RelocStatic}</li>
     * <li>{@link #LLVMRelocPIC RelocPIC}</li>
     * <li>{@link #LLVMRelocDynamicNoPic RelocDynamicNoPic}</li>
     * <li>{@link #LLVMRelocROPI RelocROPI}</li>
     * <li>{@link #LLVMRelocRWPI RelocRWPI}</li>
     * <li>{@link #LLVMRelocROPI_RWPI RelocROPI_RWPI}</li>
     * </ul>
     */
    public static final int
        LLVMRelocDefault      = 0,
        LLVMRelocStatic       = 1,
        LLVMRelocPIC          = 2,
        LLVMRelocDynamicNoPic = 3,
        LLVMRelocROPI         = 4,
        LLVMRelocRWPI         = 5,
        LLVMRelocROPI_RWPI    = 6;

    /**
     * {@code LLVMCodeModel}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMCodeModelDefault CodeModelDefault}</li>
     * <li>{@link #LLVMCodeModelJITDefault CodeModelJITDefault}</li>
     * <li>{@link #LLVMCodeModelTiny CodeModelTiny}</li>
     * <li>{@link #LLVMCodeModelSmall CodeModelSmall}</li>
     * <li>{@link #LLVMCodeModelKernel CodeModelKernel}</li>
     * <li>{@link #LLVMCodeModelMedium CodeModelMedium}</li>
     * <li>{@link #LLVMCodeModelLarge CodeModelLarge}</li>
     * </ul>
     */
    public static final int
        LLVMCodeModelDefault    = 0,
        LLVMCodeModelJITDefault = 1,
        LLVMCodeModelTiny       = 2,
        LLVMCodeModelSmall      = 3,
        LLVMCodeModelKernel     = 4,
        LLVMCodeModelMedium     = 5,
        LLVMCodeModelLarge      = 6;

    /**
     * {@code LLVMCodeGenFileType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMAssemblyFile AssemblyFile}</li>
     * <li>{@link #LLVMObjectFile ObjectFile}</li>
     * </ul>
     */
    public static final int
        LLVMAssemblyFile = 0,
        LLVMObjectFile   = 1;

    /**
     * {@code LLVMGlobalISelAbortMode}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMGlobalISelAbortEnable GlobalISelAbortEnable}</li>
     * <li>{@link #LLVMGlobalISelAbortDisable GlobalISelAbortDisable}</li>
     * <li>{@link #LLVMGlobalISelAbortDisableWithDiag GlobalISelAbortDisableWithDiag}</li>
     * </ul>
     */
    public static final int
        LLVMGlobalISelAbortEnable          = 0,
        LLVMGlobalISelAbortDisable         = 1,
        LLVMGlobalISelAbortDisableWithDiag = 2;

    protected LLVMTargetMachine() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMGetFirstTarget ] ---

    /** Returns the first {@code llvm::Target} in the registered targets list. */
    @NativeType("LLVMTargetRef")
    public static long LLVMGetFirstTarget() {
        long __functionAddress = Functions.GetFirstTarget;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMGetNextTarget ] ---

    /** Returns the next {@code llvm::Target} given a previous one (or null if there's none) */
    @NativeType("LLVMTargetRef")
    public static long LLVMGetNextTarget(@NativeType("LLVMTargetRef") long T) {
        long __functionAddress = Functions.GetNextTarget;
        if (CHECKS) {
            check(T);
        }
        return invokePP(T, __functionAddress);
    }

    // --- [ LLVMGetTargetFromName ] ---

    /** Unsafe version of: {@link #LLVMGetTargetFromName GetTargetFromName} */
    public static long nLLVMGetTargetFromName(long Name) {
        long __functionAddress = Functions.GetTargetFromName;
        return invokePP(Name, __functionAddress);
    }

    /** Finds the target corresponding to the given name and stores it in {@code T}. Returns 0 on success. */
    @NativeType("LLVMTargetRef")
    public static long LLVMGetTargetFromName(@NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMGetTargetFromName(memAddress(Name));
    }

    /** Finds the target corresponding to the given name and stores it in {@code T}. Returns 0 on success. */
    @NativeType("LLVMTargetRef")
    public static long LLVMGetTargetFromName(@NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMGetTargetFromName(NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetTargetFromTriple ] ---

    /** Unsafe version of: {@link #LLVMGetTargetFromTriple GetTargetFromTriple} */
    public static int nLLVMGetTargetFromTriple(long Triple, long T, long ErrorMessage) {
        long __functionAddress = Functions.GetTargetFromTriple;
        return invokePPPI(Triple, T, ErrorMessage, __functionAddress);
    }

    /**
     * Finds the target corresponding to the given triple and stores it in {@code T}. Returns 0 on success. Optionally returns any error in
     * {@code ErrorMessage}. Use {@link LLVMCore#LLVMDisposeMessage DisposeMessage} to dispose the message.
     */
    @NativeType("LLVMBool")
    public static boolean LLVMGetTargetFromTriple(@NativeType("char const *") ByteBuffer Triple, @NativeType("LLVMTargetRef *") PointerBuffer T, @NativeType("char **") PointerBuffer ErrorMessage) {
        if (CHECKS) {
            checkNT1(Triple);
            check(T, 1);
            check(ErrorMessage, 1);
        }
        return nLLVMGetTargetFromTriple(memAddress(Triple), memAddress(T), memAddress(ErrorMessage)) != 0;
    }

    /**
     * Finds the target corresponding to the given triple and stores it in {@code T}. Returns 0 on success. Optionally returns any error in
     * {@code ErrorMessage}. Use {@link LLVMCore#LLVMDisposeMessage DisposeMessage} to dispose the message.
     */
    @NativeType("LLVMBool")
    public static boolean LLVMGetTargetFromTriple(@NativeType("char const *") CharSequence Triple, @NativeType("LLVMTargetRef *") PointerBuffer T, @NativeType("char **") PointerBuffer ErrorMessage) {
        if (CHECKS) {
            check(T, 1);
            check(ErrorMessage, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Triple, true);
            long TripleEncoded = stack.getPointerAddress();
            return nLLVMGetTargetFromTriple(TripleEncoded, memAddress(T), memAddress(ErrorMessage)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetTargetName ] ---

    /** Unsafe version of: {@link #LLVMGetTargetName GetTargetName} */
    public static long nLLVMGetTargetName(long T) {
        long __functionAddress = Functions.GetTargetName;
        if (CHECKS) {
            check(T);
        }
        return invokePP(T, __functionAddress);
    }

    /** Returns the name of a target. See {@code llvm::Target::getName} */
    @Nullable
    @NativeType("char const *")
    public static String LLVMGetTargetName(@NativeType("LLVMTargetRef") long T) {
        long __result = nLLVMGetTargetName(T);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMGetTargetDescription ] ---

    /** Unsafe version of: {@link #LLVMGetTargetDescription GetTargetDescription} */
    public static long nLLVMGetTargetDescription(long T) {
        long __functionAddress = Functions.GetTargetDescription;
        if (CHECKS) {
            check(T);
        }
        return invokePP(T, __functionAddress);
    }

    /** Returns the description  of a target. See {@code llvm::Target::getDescription} */
    @Nullable
    @NativeType("char const *")
    public static String LLVMGetTargetDescription(@NativeType("LLVMTargetRef") long T) {
        long __result = nLLVMGetTargetDescription(T);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMTargetHasJIT ] ---

    /** Returns if the target has a JIT */
    @NativeType("LLVMBool")
    public static boolean LLVMTargetHasJIT(@NativeType("LLVMTargetRef") long T) {
        long __functionAddress = Functions.TargetHasJIT;
        if (CHECKS) {
            check(T);
        }
        return invokePI(T, __functionAddress) != 0;
    }

    // --- [ LLVMTargetHasTargetMachine ] ---

    /** Returns if the target has a {@code TargetMachine} associated */
    @NativeType("LLVMBool")
    public static boolean LLVMTargetHasTargetMachine(@NativeType("LLVMTargetRef") long T) {
        long __functionAddress = Functions.TargetHasTargetMachine;
        if (CHECKS) {
            check(T);
        }
        return invokePI(T, __functionAddress) != 0;
    }

    // --- [ LLVMTargetHasAsmBackend ] ---

    /** Returns if the target as an ASM backend (required for emitting output) */
    @NativeType("LLVMBool")
    public static boolean LLVMTargetHasAsmBackend(@NativeType("LLVMTargetRef") long T) {
        long __functionAddress = Functions.TargetHasAsmBackend;
        if (CHECKS) {
            check(T);
        }
        return invokePI(T, __functionAddress) != 0;
    }

    // --- [ LLVMCreateTargetMachineOptions ] ---

    /**
     * Create a new set of options for an {@code llvm::TargetMachine}.
     * 
     * <p>The returned option structure must be released with {@link #LLVMDisposeTargetMachineOptions DisposeTargetMachineOptions} after the call to {@code LLVMCreateTargetMachineWithOptions()}.</p>
     *
     * @since 18
     */
    @NativeType("LLVMTargetMachineOptionsRef")
    public static long LLVMCreateTargetMachineOptions() {
        long __functionAddress = Functions.CreateTargetMachineOptions;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    // --- [ LLVMDisposeTargetMachineOptions ] ---

    /**
     * Dispose of an {@code LLVMTargetMachineOptionsRef} instance.
     *
     * @since 18
     */
    public static void LLVMDisposeTargetMachineOptions(@NativeType("LLVMTargetMachineOptionsRef") long Options) {
        long __functionAddress = Functions.DisposeTargetMachineOptions;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, __functionAddress);
    }

    // --- [ LLVMTargetMachineOptionsSetCPU ] ---

    /** Unsafe version of: {@link #LLVMTargetMachineOptionsSetCPU TargetMachineOptionsSetCPU} */
    public static void nLLVMTargetMachineOptionsSetCPU(long Options, long CPU) {
        long __functionAddress = Functions.TargetMachineOptionsSetCPU;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePPV(Options, CPU, __functionAddress);
    }

    /** @since 18 */
    public static void LLVMTargetMachineOptionsSetCPU(@NativeType("LLVMTargetMachineOptionsRef") long Options, @NativeType("char const *") ByteBuffer CPU) {
        if (CHECKS) {
            checkNT1(CPU);
        }
        nLLVMTargetMachineOptionsSetCPU(Options, memAddress(CPU));
    }

    /** @since 18 */
    public static void LLVMTargetMachineOptionsSetCPU(@NativeType("LLVMTargetMachineOptionsRef") long Options, @NativeType("char const *") CharSequence CPU) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(CPU, true);
            long CPUEncoded = stack.getPointerAddress();
            nLLVMTargetMachineOptionsSetCPU(Options, CPUEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMTargetMachineOptionsSetFeatures ] ---

    /** Unsafe version of: {@link #LLVMTargetMachineOptionsSetFeatures TargetMachineOptionsSetFeatures} */
    public static void nLLVMTargetMachineOptionsSetFeatures(long Options, long Features) {
        long __functionAddress = Functions.TargetMachineOptionsSetFeatures;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePPV(Options, Features, __functionAddress);
    }

    /**
     * Set the list of features for the target machine.
     *
     * @param Features a comma-separated list of features
     *
     * @since 18
     */
    public static void LLVMTargetMachineOptionsSetFeatures(@NativeType("LLVMTargetMachineOptionsRef") long Options, @NativeType("char const *") ByteBuffer Features) {
        if (CHECKS) {
            checkNT1(Features);
        }
        nLLVMTargetMachineOptionsSetFeatures(Options, memAddress(Features));
    }

    /**
     * Set the list of features for the target machine.
     *
     * @param Features a comma-separated list of features
     *
     * @since 18
     */
    public static void LLVMTargetMachineOptionsSetFeatures(@NativeType("LLVMTargetMachineOptionsRef") long Options, @NativeType("char const *") CharSequence Features) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Features, true);
            long FeaturesEncoded = stack.getPointerAddress();
            nLLVMTargetMachineOptionsSetFeatures(Options, FeaturesEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMTargetMachineOptionsSetABI ] ---

    /** Unsafe version of: {@link #LLVMTargetMachineOptionsSetABI TargetMachineOptionsSetABI} */
    public static void nLLVMTargetMachineOptionsSetABI(long Options, long ABI) {
        long __functionAddress = Functions.TargetMachineOptionsSetABI;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePPV(Options, ABI, __functionAddress);
    }

    /** @since 18 */
    public static void LLVMTargetMachineOptionsSetABI(@NativeType("LLVMTargetMachineOptionsRef") long Options, @NativeType("char const *") ByteBuffer ABI) {
        if (CHECKS) {
            checkNT1(ABI);
        }
        nLLVMTargetMachineOptionsSetABI(Options, memAddress(ABI));
    }

    /** @since 18 */
    public static void LLVMTargetMachineOptionsSetABI(@NativeType("LLVMTargetMachineOptionsRef") long Options, @NativeType("char const *") CharSequence ABI) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(ABI, true);
            long ABIEncoded = stack.getPointerAddress();
            nLLVMTargetMachineOptionsSetABI(Options, ABIEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMTargetMachineOptionsSetCodeGenOptLevel ] ---

    /** @since 18 */
    public static void LLVMTargetMachineOptionsSetCodeGenOptLevel(@NativeType("LLVMTargetMachineOptionsRef") long Options, @NativeType("LLVMCodeGenOptLevel") int Level) {
        long __functionAddress = Functions.TargetMachineOptionsSetCodeGenOptLevel;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, Level, __functionAddress);
    }

    // --- [ LLVMTargetMachineOptionsSetRelocMode ] ---

    /** @since 18 */
    public static void LLVMTargetMachineOptionsSetRelocMode(@NativeType("LLVMTargetMachineOptionsRef") long Options, @NativeType("LLVMRelocMode") int Reloc) {
        long __functionAddress = Functions.TargetMachineOptionsSetRelocMode;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, Reloc, __functionAddress);
    }

    // --- [ LLVMTargetMachineOptionsSetCodeModel ] ---

    /** @since 18 */
    public static void LLVMTargetMachineOptionsSetCodeModel(@NativeType("LLVMTargetMachineOptionsRef") long Options, @NativeType("LLVMCodeModel") int CodeModel) {
        long __functionAddress = Functions.TargetMachineOptionsSetCodeModel;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, CodeModel, __functionAddress);
    }

    // --- [ LLVMCreateTargetMachineWithOptions ] ---

    /** Unsafe version of: {@link #LLVMCreateTargetMachineWithOptions CreateTargetMachineWithOptions} */
    public static long nLLVMCreateTargetMachineWithOptions(long T, long Triple, long Options) {
        long __functionAddress = Functions.CreateTargetMachineWithOptions;
        if (CHECKS) {
            check(__functionAddress);
            check(T);
            check(Options);
        }
        return invokePPPP(T, Triple, Options, __functionAddress);
    }

    /**
     * Create a new {@code llvm::TargetMachine}.
     *
     * @param T       the target to create a machine for
     * @param Triple  a triple describing the target machine
     * @param Options additional configuration
     *
     * @since 18
     */
    @NativeType("LLVMTargetMachineRef")
    public static long LLVMCreateTargetMachineWithOptions(@NativeType("LLVMTargetRef") long T, @NativeType("char const *") ByteBuffer Triple, @NativeType("LLVMTargetMachineOptionsRef") long Options) {
        if (CHECKS) {
            checkNT1(Triple);
        }
        return nLLVMCreateTargetMachineWithOptions(T, memAddress(Triple), Options);
    }

    /**
     * Create a new {@code llvm::TargetMachine}.
     *
     * @param T       the target to create a machine for
     * @param Triple  a triple describing the target machine
     * @param Options additional configuration
     *
     * @since 18
     */
    @NativeType("LLVMTargetMachineRef")
    public static long LLVMCreateTargetMachineWithOptions(@NativeType("LLVMTargetRef") long T, @NativeType("char const *") CharSequence Triple, @NativeType("LLVMTargetMachineOptionsRef") long Options) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Triple, true);
            long TripleEncoded = stack.getPointerAddress();
            return nLLVMCreateTargetMachineWithOptions(T, TripleEncoded, Options);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMCreateTargetMachine ] ---

    /** Unsafe version of: {@link #LLVMCreateTargetMachine CreateTargetMachine} */
    public static long nLLVMCreateTargetMachine(long T, long Triple, long CPU, long Features, int Level, int Reloc, int CodeModel) {
        long __functionAddress = Functions.CreateTargetMachine;
        if (CHECKS) {
            check(T);
        }
        return invokePPPPP(T, Triple, CPU, Features, Level, Reloc, CodeModel, __functionAddress);
    }

    /** Creates a new {@code llvm::TargetMachine}. See {@code llvm::Target::createTargetMachine} */
    @NativeType("LLVMTargetMachineRef")
    public static long LLVMCreateTargetMachine(@NativeType("LLVMTargetRef") long T, @NativeType("char const *") ByteBuffer Triple, @NativeType("char const *") ByteBuffer CPU, @NativeType("char const *") ByteBuffer Features, @NativeType("LLVMCodeGenOptLevel") int Level, @NativeType("LLVMRelocMode") int Reloc, @NativeType("LLVMCodeModel") int CodeModel) {
        if (CHECKS) {
            checkNT1(Triple);
            checkNT1(CPU);
            checkNT1(Features);
        }
        return nLLVMCreateTargetMachine(T, memAddress(Triple), memAddress(CPU), memAddress(Features), Level, Reloc, CodeModel);
    }

    /** Creates a new {@code llvm::TargetMachine}. See {@code llvm::Target::createTargetMachine} */
    @NativeType("LLVMTargetMachineRef")
    public static long LLVMCreateTargetMachine(@NativeType("LLVMTargetRef") long T, @NativeType("char const *") CharSequence Triple, @NativeType("char const *") CharSequence CPU, @NativeType("char const *") CharSequence Features, @NativeType("LLVMCodeGenOptLevel") int Level, @NativeType("LLVMRelocMode") int Reloc, @NativeType("LLVMCodeModel") int CodeModel) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Triple, true);
            long TripleEncoded = stack.getPointerAddress();
            stack.nUTF8(CPU, true);
            long CPUEncoded = stack.getPointerAddress();
            stack.nUTF8(Features, true);
            long FeaturesEncoded = stack.getPointerAddress();
            return nLLVMCreateTargetMachine(T, TripleEncoded, CPUEncoded, FeaturesEncoded, Level, Reloc, CodeModel);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDisposeTargetMachine ] ---

    /** Dispose the {@code LLVMTargetMachineRef} instance generated by {@link #LLVMCreateTargetMachine CreateTargetMachine}. */
    public static void LLVMDisposeTargetMachine(@NativeType("LLVMTargetMachineRef") long T) {
        long __functionAddress = Functions.DisposeTargetMachine;
        if (CHECKS) {
            check(T);
        }
        invokePV(T, __functionAddress);
    }

    // --- [ LLVMGetTargetMachineTarget ] ---

    /** Returns the {@code Target} used in a {@code TargetMachine} */
    @NativeType("LLVMTargetRef")
    public static long LLVMGetTargetMachineTarget(@NativeType("LLVMTargetMachineRef") long T) {
        long __functionAddress = Functions.GetTargetMachineTarget;
        if (CHECKS) {
            check(T);
        }
        return invokePP(T, __functionAddress);
    }

    // --- [ LLVMGetTargetMachineTriple ] ---

    /** Unsafe version of: {@link #LLVMGetTargetMachineTriple GetTargetMachineTriple} */
    public static long nLLVMGetTargetMachineTriple(long T) {
        long __functionAddress = Functions.GetTargetMachineTriple;
        if (CHECKS) {
            check(T);
        }
        return invokePP(T, __functionAddress);
    }

    /**
     * Returns the triple used creating this target machine. See {@code llvm::TargetMachine::getTriple}. The result needs to be disposed with
     * {@link LLVMCore#LLVMDisposeMessage DisposeMessage}.
     */
    @Nullable
    @NativeType("char *")
    public static String LLVMGetTargetMachineTriple(@NativeType("LLVMTargetMachineRef") long T) {
        long __result = nLLVMGetTargetMachineTriple(T);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMGetTargetMachineCPU ] ---

    /** Unsafe version of: {@link #LLVMGetTargetMachineCPU GetTargetMachineCPU} */
    public static long nLLVMGetTargetMachineCPU(long T) {
        long __functionAddress = Functions.GetTargetMachineCPU;
        if (CHECKS) {
            check(T);
        }
        return invokePP(T, __functionAddress);
    }

    /** Returns the cpu used creating this target machine. See {@code llvm::TargetMachine::getCPU}. The result needs to be disposed with {@link LLVMCore#LLVMDisposeMessage DisposeMessage}. */
    @Nullable
    @NativeType("char *")
    public static String LLVMGetTargetMachineCPU(@NativeType("LLVMTargetMachineRef") long T) {
        long __result = nLLVMGetTargetMachineCPU(T);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMGetTargetMachineFeatureString ] ---

    /** Unsafe version of: {@link #LLVMGetTargetMachineFeatureString GetTargetMachineFeatureString} */
    public static long nLLVMGetTargetMachineFeatureString(long T) {
        long __functionAddress = Functions.GetTargetMachineFeatureString;
        if (CHECKS) {
            check(T);
        }
        return invokePP(T, __functionAddress);
    }

    /**
     * Returns the feature string used creating this target machine. See {@code llvm::TargetMachine::getFeatureString}. The result needs to be disposed with
     * {@link LLVMCore#LLVMDisposeMessage DisposeMessage}.
     */
    @Nullable
    @NativeType("char *")
    public static String LLVMGetTargetMachineFeatureString(@NativeType("LLVMTargetMachineRef") long T) {
        long __result = nLLVMGetTargetMachineFeatureString(T);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMCreateTargetDataLayout ] ---

    /** Create a {@code DataLayout} based on the target machine. */
    @NativeType("LLVMTargetDataRef")
    public static long LLVMCreateTargetDataLayout(@NativeType("LLVMTargetMachineRef") long T) {
        long __functionAddress = Functions.CreateTargetDataLayout;
        if (CHECKS) {
            check(T);
        }
        return invokePP(T, __functionAddress);
    }

    // --- [ LLVMSetTargetMachineAsmVerbosity ] ---

    /** Set the target machine's ASM verbosity. */
    public static void LLVMSetTargetMachineAsmVerbosity(@NativeType("LLVMTargetMachineRef") long T, @NativeType("LLVMBool") boolean VerboseAsm) {
        long __functionAddress = Functions.SetTargetMachineAsmVerbosity;
        if (CHECKS) {
            check(T);
        }
        invokePV(T, VerboseAsm ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMSetTargetMachineFastISel ] ---

    /**
     * Enable fast-path instruction selection.
     *
     * @since 18
     */
    public static void LLVMSetTargetMachineFastISel(@NativeType("LLVMTargetMachineRef") long T, @NativeType("LLVMBool") boolean Enable) {
        long __functionAddress = Functions.SetTargetMachineFastISel;
        if (CHECKS) {
            check(__functionAddress);
            check(T);
        }
        invokePV(T, Enable ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMSetTargetMachineGlobalISel ] ---

    /**
     * Enable global instruction selection.
     *
     * @since 18
     */
    public static void LLVMSetTargetMachineGlobalISel(@NativeType("LLVMTargetMachineRef") long T, @NativeType("LLVMBool") boolean Enable) {
        long __functionAddress = Functions.SetTargetMachineGlobalISel;
        if (CHECKS) {
            check(__functionAddress);
            check(T);
        }
        invokePV(T, Enable ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMSetTargetMachineGlobalISelAbort ] ---

    /**
     * Set abort behaviour when global instruction selection fails to lower/select an instruction.
     *
     * @since 18
     */
    public static void LLVMSetTargetMachineGlobalISelAbort(@NativeType("LLVMTargetMachineRef") long T, @NativeType("LLVMGlobalISelAbortMode") int Mode) {
        long __functionAddress = Functions.SetTargetMachineGlobalISelAbort;
        if (CHECKS) {
            check(__functionAddress);
            check(T);
        }
        invokePV(T, Mode, __functionAddress);
    }

    // --- [ LLVMSetTargetMachineMachineOutliner ] ---

    /**
     * Enable the {@code MachineOutliner} pass.
     *
     * @since 18
     */
    public static void LLVMSetTargetMachineMachineOutliner(@NativeType("LLVMTargetMachineRef") long T, @NativeType("LLVMBool") boolean Enable) {
        long __functionAddress = Functions.SetTargetMachineMachineOutliner;
        if (CHECKS) {
            check(__functionAddress);
            check(T);
        }
        invokePV(T, Enable ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMTargetMachineEmitToFile ] ---

    /** Unsafe version of: {@link #LLVMTargetMachineEmitToFile TargetMachineEmitToFile} */
    public static int nLLVMTargetMachineEmitToFile(long T, long M, long Filename, int codegen, long ErrorMessage) {
        long __functionAddress = Functions.TargetMachineEmitToFile;
        if (CHECKS) {
            check(T);
            check(M);
        }
        return invokePPPPI(T, M, Filename, codegen, ErrorMessage, __functionAddress);
    }

    /**
     * Emits an asm or object file for the given module to the filename. This wraps several c++ only classes (among them a file stream). Returns any error in
     * {@code ErrorMessage}. Use {@link LLVMCore#LLVMDisposeMessage DisposeMessage} to dispose the message.
     */
    @NativeType("LLVMBool")
    public static boolean LLVMTargetMachineEmitToFile(@NativeType("LLVMTargetMachineRef") long T, @NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Filename, @NativeType("LLVMCodeGenFileType") int codegen, @NativeType("char **") PointerBuffer ErrorMessage) {
        if (CHECKS) {
            checkNT1(Filename);
            check(ErrorMessage, 1);
        }
        return nLLVMTargetMachineEmitToFile(T, M, memAddress(Filename), codegen, memAddress(ErrorMessage)) != 0;
    }

    /**
     * Emits an asm or object file for the given module to the filename. This wraps several c++ only classes (among them a file stream). Returns any error in
     * {@code ErrorMessage}. Use {@link LLVMCore#LLVMDisposeMessage DisposeMessage} to dispose the message.
     */
    @NativeType("LLVMBool")
    public static boolean LLVMTargetMachineEmitToFile(@NativeType("LLVMTargetMachineRef") long T, @NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Filename, @NativeType("LLVMCodeGenFileType") int codegen, @NativeType("char **") PointerBuffer ErrorMessage) {
        if (CHECKS) {
            check(ErrorMessage, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Filename, true);
            long FilenameEncoded = stack.getPointerAddress();
            return nLLVMTargetMachineEmitToFile(T, M, FilenameEncoded, codegen, memAddress(ErrorMessage)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMTargetMachineEmitToMemoryBuffer ] ---

    /** Unsafe version of: {@link #LLVMTargetMachineEmitToMemoryBuffer TargetMachineEmitToMemoryBuffer} */
    public static int nLLVMTargetMachineEmitToMemoryBuffer(long T, long M, int codegen, long ErrorMessage, long OutMemBuf) {
        long __functionAddress = Functions.TargetMachineEmitToMemoryBuffer;
        if (CHECKS) {
            check(T);
            check(M);
        }
        return invokePPPPI(T, M, codegen, ErrorMessage, OutMemBuf, __functionAddress);
    }

    /** Compile the LLVM IR stored in {@code M} and store the result in {@code OutMemBuf}. */
    @NativeType("LLVMBool")
    public static boolean LLVMTargetMachineEmitToMemoryBuffer(@NativeType("LLVMTargetMachineRef") long T, @NativeType("LLVMModuleRef") long M, @NativeType("LLVMCodeGenFileType") int codegen, @NativeType("char **") PointerBuffer ErrorMessage, @NativeType("LLVMMemoryBufferRef *") PointerBuffer OutMemBuf) {
        if (CHECKS) {
            check(ErrorMessage, 1);
            check(OutMemBuf, 1);
        }
        return nLLVMTargetMachineEmitToMemoryBuffer(T, M, codegen, memAddress(ErrorMessage), memAddress(OutMemBuf)) != 0;
    }

    // --- [ LLVMGetDefaultTargetTriple ] ---

    /** Unsafe version of: {@link #LLVMGetDefaultTargetTriple GetDefaultTargetTriple} */
    public static long nLLVMGetDefaultTargetTriple() {
        long __functionAddress = Functions.GetDefaultTargetTriple;
        return invokeP(__functionAddress);
    }

    /** Get a triple for the host machine as a string. The result needs to be disposed with {@link LLVMCore#LLVMDisposeMessage DisposeMessage}. */
    @Nullable
    @NativeType("char *")
    public static String LLVMGetDefaultTargetTriple() {
        long __result = nLLVMGetDefaultTargetTriple();
        return memUTF8Safe(__result);
    }

    // --- [ LLVMNormalizeTargetTriple ] ---

    /** Unsafe version of: {@link #LLVMNormalizeTargetTriple NormalizeTargetTriple} */
    public static long nLLVMNormalizeTargetTriple(long triple) {
        long __functionAddress = Functions.NormalizeTargetTriple;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePP(triple, __functionAddress);
    }

    /** Normalize a target triple. The result needs to be disposed with {@link LLVMCore#LLVMDisposeMessage DisposeMessage}. */
    @Nullable
    @NativeType("char *")
    public static String LLVMNormalizeTargetTriple(@NativeType("char const *") ByteBuffer triple) {
        if (CHECKS) {
            checkNT1(triple);
        }
        long __result = nLLVMNormalizeTargetTriple(memAddress(triple));
        return memUTF8Safe(__result);
    }

    /** Normalize a target triple. The result needs to be disposed with {@link LLVMCore#LLVMDisposeMessage DisposeMessage}. */
    @Nullable
    @NativeType("char *")
    public static String LLVMNormalizeTargetTriple(@NativeType("char const *") CharSequence triple) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(triple, true);
            long tripleEncoded = stack.getPointerAddress();
            long __result = nLLVMNormalizeTargetTriple(tripleEncoded);
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetHostCPUName ] ---

    /** Unsafe version of: {@link #LLVMGetHostCPUName GetHostCPUName} */
    public static long nLLVMGetHostCPUName() {
        long __functionAddress = Functions.GetHostCPUName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    /** Get the host CPU as a string. The result needs to be disposed with {@link LLVMCore#LLVMDisposeMessage DisposeMessage}. */
    @Nullable
    @NativeType("char *")
    public static String LLVMGetHostCPUName() {
        long __result = nLLVMGetHostCPUName();
        return memUTF8Safe(__result);
    }

    // --- [ LLVMGetHostCPUFeatures ] ---

    /** Unsafe version of: {@link #LLVMGetHostCPUFeatures GetHostCPUFeatures} */
    public static long nLLVMGetHostCPUFeatures() {
        long __functionAddress = Functions.GetHostCPUFeatures;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    /** Get the host CPU's features as a string. The result needs to be disposed with {@link LLVMCore#LLVMDisposeMessage DisposeMessage}. */
    @Nullable
    @NativeType("char *")
    public static String LLVMGetHostCPUFeatures() {
        long __result = nLLVMGetHostCPUFeatures();
        return memUTF8Safe(__result);
    }

    // --- [ LLVMAddAnalysisPasses ] ---

    /** Adds the target-specific analysis passes to the pass manager. */
    public static void LLVMAddAnalysisPasses(@NativeType("LLVMTargetMachineRef") long T, @NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddAnalysisPasses;
        if (CHECKS) {
            check(T);
            check(PM);
        }
        invokePPV(T, PM, __functionAddress);
    }

}