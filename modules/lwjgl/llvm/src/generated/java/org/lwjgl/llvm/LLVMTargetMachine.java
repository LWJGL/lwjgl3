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

    public static final int
        LLVMCodeGenLevelNone       = 0,
        LLVMCodeGenLevelLess       = 1,
        LLVMCodeGenLevelDefault    = 2,
        LLVMCodeGenLevelAggressive = 3;

    public static final int
        LLVMRelocDefault      = 0,
        LLVMRelocStatic       = 1,
        LLVMRelocPIC          = 2,
        LLVMRelocDynamicNoPic = 3,
        LLVMRelocROPI         = 4,
        LLVMRelocRWPI         = 5,
        LLVMRelocROPI_RWPI    = 6;

    public static final int
        LLVMCodeModelDefault    = 0,
        LLVMCodeModelJITDefault = 1,
        LLVMCodeModelTiny       = 2,
        LLVMCodeModelSmall      = 3,
        LLVMCodeModelKernel     = 4,
        LLVMCodeModelMedium     = 5,
        LLVMCodeModelLarge      = 6;

    public static final int
        LLVMAssemblyFile = 0,
        LLVMObjectFile   = 1;

    public static final int
        LLVMGlobalISelAbortEnable          = 0,
        LLVMGlobalISelAbortDisable         = 1,
        LLVMGlobalISelAbortDisableWithDiag = 2;

    protected LLVMTargetMachine() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMGetFirstTarget ] ---

    /** {@code LLVMTargetRef LLVMGetFirstTarget(void)} */
    @NativeType("LLVMTargetRef")
    public static long LLVMGetFirstTarget() {
        long __functionAddress = Functions.GetFirstTarget;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMGetNextTarget ] ---

    /** {@code LLVMTargetRef LLVMGetNextTarget(LLVMTargetRef T)} */
    @NativeType("LLVMTargetRef")
    public static long LLVMGetNextTarget(@NativeType("LLVMTargetRef") long T) {
        long __functionAddress = Functions.GetNextTarget;
        if (CHECKS) {
            check(T);
        }
        return invokePP(T, __functionAddress);
    }

    // --- [ LLVMGetTargetFromName ] ---

    /** {@code LLVMTargetRef LLVMGetTargetFromName(char const * Name)} */
    public static long nLLVMGetTargetFromName(long Name) {
        long __functionAddress = Functions.GetTargetFromName;
        return invokePP(Name, __functionAddress);
    }

    /** {@code LLVMTargetRef LLVMGetTargetFromName(char const * Name)} */
    @NativeType("LLVMTargetRef")
    public static long LLVMGetTargetFromName(@NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMGetTargetFromName(memAddress(Name));
    }

    /** {@code LLVMTargetRef LLVMGetTargetFromName(char const * Name)} */
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

    /** {@code LLVMBool LLVMGetTargetFromTriple(char const * Triple, LLVMTargetRef * T, char ** ErrorMessage)} */
    public static int nLLVMGetTargetFromTriple(long Triple, long T, long ErrorMessage) {
        long __functionAddress = Functions.GetTargetFromTriple;
        return invokePPPI(Triple, T, ErrorMessage, __functionAddress);
    }

    /** {@code LLVMBool LLVMGetTargetFromTriple(char const * Triple, LLVMTargetRef * T, char ** ErrorMessage)} */
    @NativeType("LLVMBool")
    public static boolean LLVMGetTargetFromTriple(@NativeType("char const *") ByteBuffer Triple, @NativeType("LLVMTargetRef *") PointerBuffer T, @NativeType("char **") PointerBuffer ErrorMessage) {
        if (CHECKS) {
            checkNT1(Triple);
            check(T, 1);
            check(ErrorMessage, 1);
        }
        return nLLVMGetTargetFromTriple(memAddress(Triple), memAddress(T), memAddress(ErrorMessage)) != 0;
    }

    /** {@code LLVMBool LLVMGetTargetFromTriple(char const * Triple, LLVMTargetRef * T, char ** ErrorMessage)} */
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

    /** {@code char const * LLVMGetTargetName(LLVMTargetRef T)} */
    public static long nLLVMGetTargetName(long T) {
        long __functionAddress = Functions.GetTargetName;
        if (CHECKS) {
            check(T);
        }
        return invokePP(T, __functionAddress);
    }

    /** {@code char const * LLVMGetTargetName(LLVMTargetRef T)} */
    @NativeType("char const *")
    public static @Nullable String LLVMGetTargetName(@NativeType("LLVMTargetRef") long T) {
        long __result = nLLVMGetTargetName(T);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMGetTargetDescription ] ---

    /** {@code char const * LLVMGetTargetDescription(LLVMTargetRef T)} */
    public static long nLLVMGetTargetDescription(long T) {
        long __functionAddress = Functions.GetTargetDescription;
        if (CHECKS) {
            check(T);
        }
        return invokePP(T, __functionAddress);
    }

    /** {@code char const * LLVMGetTargetDescription(LLVMTargetRef T)} */
    @NativeType("char const *")
    public static @Nullable String LLVMGetTargetDescription(@NativeType("LLVMTargetRef") long T) {
        long __result = nLLVMGetTargetDescription(T);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMTargetHasJIT ] ---

    /** {@code LLVMBool LLVMTargetHasJIT(LLVMTargetRef T)} */
    @NativeType("LLVMBool")
    public static boolean LLVMTargetHasJIT(@NativeType("LLVMTargetRef") long T) {
        long __functionAddress = Functions.TargetHasJIT;
        if (CHECKS) {
            check(T);
        }
        return invokePI(T, __functionAddress) != 0;
    }

    // --- [ LLVMTargetHasTargetMachine ] ---

    /** {@code LLVMBool LLVMTargetHasTargetMachine(LLVMTargetRef T)} */
    @NativeType("LLVMBool")
    public static boolean LLVMTargetHasTargetMachine(@NativeType("LLVMTargetRef") long T) {
        long __functionAddress = Functions.TargetHasTargetMachine;
        if (CHECKS) {
            check(T);
        }
        return invokePI(T, __functionAddress) != 0;
    }

    // --- [ LLVMTargetHasAsmBackend ] ---

    /** {@code LLVMBool LLVMTargetHasAsmBackend(LLVMTargetRef T)} */
    @NativeType("LLVMBool")
    public static boolean LLVMTargetHasAsmBackend(@NativeType("LLVMTargetRef") long T) {
        long __functionAddress = Functions.TargetHasAsmBackend;
        if (CHECKS) {
            check(T);
        }
        return invokePI(T, __functionAddress) != 0;
    }

    // --- [ LLVMCreateTargetMachineOptions ] ---

    /** {@code LLVMTargetMachineOptionsRef LLVMCreateTargetMachineOptions(void)} */
    @NativeType("LLVMTargetMachineOptionsRef")
    public static long LLVMCreateTargetMachineOptions() {
        long __functionAddress = Functions.CreateTargetMachineOptions;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    // --- [ LLVMDisposeTargetMachineOptions ] ---

    /** {@code void LLVMDisposeTargetMachineOptions(LLVMTargetMachineOptionsRef Options)} */
    public static void LLVMDisposeTargetMachineOptions(@NativeType("LLVMTargetMachineOptionsRef") long Options) {
        long __functionAddress = Functions.DisposeTargetMachineOptions;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, __functionAddress);
    }

    // --- [ LLVMTargetMachineOptionsSetCPU ] ---

    /** {@code void LLVMTargetMachineOptionsSetCPU(LLVMTargetMachineOptionsRef Options, char const * CPU)} */
    public static void nLLVMTargetMachineOptionsSetCPU(long Options, long CPU) {
        long __functionAddress = Functions.TargetMachineOptionsSetCPU;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePPV(Options, CPU, __functionAddress);
    }

    /** {@code void LLVMTargetMachineOptionsSetCPU(LLVMTargetMachineOptionsRef Options, char const * CPU)} */
    public static void LLVMTargetMachineOptionsSetCPU(@NativeType("LLVMTargetMachineOptionsRef") long Options, @NativeType("char const *") ByteBuffer CPU) {
        if (CHECKS) {
            checkNT1(CPU);
        }
        nLLVMTargetMachineOptionsSetCPU(Options, memAddress(CPU));
    }

    /** {@code void LLVMTargetMachineOptionsSetCPU(LLVMTargetMachineOptionsRef Options, char const * CPU)} */
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

    /** {@code void LLVMTargetMachineOptionsSetFeatures(LLVMTargetMachineOptionsRef Options, char const * Features)} */
    public static void nLLVMTargetMachineOptionsSetFeatures(long Options, long Features) {
        long __functionAddress = Functions.TargetMachineOptionsSetFeatures;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePPV(Options, Features, __functionAddress);
    }

    /** {@code void LLVMTargetMachineOptionsSetFeatures(LLVMTargetMachineOptionsRef Options, char const * Features)} */
    public static void LLVMTargetMachineOptionsSetFeatures(@NativeType("LLVMTargetMachineOptionsRef") long Options, @NativeType("char const *") ByteBuffer Features) {
        if (CHECKS) {
            checkNT1(Features);
        }
        nLLVMTargetMachineOptionsSetFeatures(Options, memAddress(Features));
    }

    /** {@code void LLVMTargetMachineOptionsSetFeatures(LLVMTargetMachineOptionsRef Options, char const * Features)} */
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

    /** {@code void LLVMTargetMachineOptionsSetABI(LLVMTargetMachineOptionsRef Options, char const * ABI)} */
    public static void nLLVMTargetMachineOptionsSetABI(long Options, long ABI) {
        long __functionAddress = Functions.TargetMachineOptionsSetABI;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePPV(Options, ABI, __functionAddress);
    }

    /** {@code void LLVMTargetMachineOptionsSetABI(LLVMTargetMachineOptionsRef Options, char const * ABI)} */
    public static void LLVMTargetMachineOptionsSetABI(@NativeType("LLVMTargetMachineOptionsRef") long Options, @NativeType("char const *") ByteBuffer ABI) {
        if (CHECKS) {
            checkNT1(ABI);
        }
        nLLVMTargetMachineOptionsSetABI(Options, memAddress(ABI));
    }

    /** {@code void LLVMTargetMachineOptionsSetABI(LLVMTargetMachineOptionsRef Options, char const * ABI)} */
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

    /** {@code void LLVMTargetMachineOptionsSetCodeGenOptLevel(LLVMTargetMachineOptionsRef Options, LLVMCodeGenOptLevel Level)} */
    public static void LLVMTargetMachineOptionsSetCodeGenOptLevel(@NativeType("LLVMTargetMachineOptionsRef") long Options, @NativeType("LLVMCodeGenOptLevel") int Level) {
        long __functionAddress = Functions.TargetMachineOptionsSetCodeGenOptLevel;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, Level, __functionAddress);
    }

    // --- [ LLVMTargetMachineOptionsSetRelocMode ] ---

    /** {@code void LLVMTargetMachineOptionsSetRelocMode(LLVMTargetMachineOptionsRef Options, LLVMRelocMode Reloc)} */
    public static void LLVMTargetMachineOptionsSetRelocMode(@NativeType("LLVMTargetMachineOptionsRef") long Options, @NativeType("LLVMRelocMode") int Reloc) {
        long __functionAddress = Functions.TargetMachineOptionsSetRelocMode;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, Reloc, __functionAddress);
    }

    // --- [ LLVMTargetMachineOptionsSetCodeModel ] ---

    /** {@code void LLVMTargetMachineOptionsSetCodeModel(LLVMTargetMachineOptionsRef Options, LLVMCodeModel CodeModel)} */
    public static void LLVMTargetMachineOptionsSetCodeModel(@NativeType("LLVMTargetMachineOptionsRef") long Options, @NativeType("LLVMCodeModel") int CodeModel) {
        long __functionAddress = Functions.TargetMachineOptionsSetCodeModel;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, CodeModel, __functionAddress);
    }

    // --- [ LLVMCreateTargetMachineWithOptions ] ---

    /** {@code LLVMTargetMachineRef LLVMCreateTargetMachineWithOptions(LLVMTargetRef T, char const * Triple, LLVMTargetMachineOptionsRef Options)} */
    public static long nLLVMCreateTargetMachineWithOptions(long T, long Triple, long Options) {
        long __functionAddress = Functions.CreateTargetMachineWithOptions;
        if (CHECKS) {
            check(__functionAddress);
            check(T);
            check(Options);
        }
        return invokePPPP(T, Triple, Options, __functionAddress);
    }

    /** {@code LLVMTargetMachineRef LLVMCreateTargetMachineWithOptions(LLVMTargetRef T, char const * Triple, LLVMTargetMachineOptionsRef Options)} */
    @NativeType("LLVMTargetMachineRef")
    public static long LLVMCreateTargetMachineWithOptions(@NativeType("LLVMTargetRef") long T, @NativeType("char const *") ByteBuffer Triple, @NativeType("LLVMTargetMachineOptionsRef") long Options) {
        if (CHECKS) {
            checkNT1(Triple);
        }
        return nLLVMCreateTargetMachineWithOptions(T, memAddress(Triple), Options);
    }

    /** {@code LLVMTargetMachineRef LLVMCreateTargetMachineWithOptions(LLVMTargetRef T, char const * Triple, LLVMTargetMachineOptionsRef Options)} */
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

    /** {@code LLVMTargetMachineRef LLVMCreateTargetMachine(LLVMTargetRef T, char const * Triple, char const * CPU, char const * Features, LLVMCodeGenOptLevel Level, LLVMRelocMode Reloc, LLVMCodeModel CodeModel)} */
    public static long nLLVMCreateTargetMachine(long T, long Triple, long CPU, long Features, int Level, int Reloc, int CodeModel) {
        long __functionAddress = Functions.CreateTargetMachine;
        if (CHECKS) {
            check(T);
        }
        return invokePPPPP(T, Triple, CPU, Features, Level, Reloc, CodeModel, __functionAddress);
    }

    /** {@code LLVMTargetMachineRef LLVMCreateTargetMachine(LLVMTargetRef T, char const * Triple, char const * CPU, char const * Features, LLVMCodeGenOptLevel Level, LLVMRelocMode Reloc, LLVMCodeModel CodeModel)} */
    @NativeType("LLVMTargetMachineRef")
    public static long LLVMCreateTargetMachine(@NativeType("LLVMTargetRef") long T, @NativeType("char const *") ByteBuffer Triple, @NativeType("char const *") ByteBuffer CPU, @NativeType("char const *") ByteBuffer Features, @NativeType("LLVMCodeGenOptLevel") int Level, @NativeType("LLVMRelocMode") int Reloc, @NativeType("LLVMCodeModel") int CodeModel) {
        if (CHECKS) {
            checkNT1(Triple);
            checkNT1(CPU);
            checkNT1(Features);
        }
        return nLLVMCreateTargetMachine(T, memAddress(Triple), memAddress(CPU), memAddress(Features), Level, Reloc, CodeModel);
    }

    /** {@code LLVMTargetMachineRef LLVMCreateTargetMachine(LLVMTargetRef T, char const * Triple, char const * CPU, char const * Features, LLVMCodeGenOptLevel Level, LLVMRelocMode Reloc, LLVMCodeModel CodeModel)} */
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

    /** {@code void LLVMDisposeTargetMachine(LLVMTargetMachineRef T)} */
    public static void LLVMDisposeTargetMachine(@NativeType("LLVMTargetMachineRef") long T) {
        long __functionAddress = Functions.DisposeTargetMachine;
        if (CHECKS) {
            check(T);
        }
        invokePV(T, __functionAddress);
    }

    // --- [ LLVMGetTargetMachineTarget ] ---

    /** {@code LLVMTargetRef LLVMGetTargetMachineTarget(LLVMTargetMachineRef T)} */
    @NativeType("LLVMTargetRef")
    public static long LLVMGetTargetMachineTarget(@NativeType("LLVMTargetMachineRef") long T) {
        long __functionAddress = Functions.GetTargetMachineTarget;
        if (CHECKS) {
            check(T);
        }
        return invokePP(T, __functionAddress);
    }

    // --- [ LLVMGetTargetMachineTriple ] ---

    /** {@code char * LLVMGetTargetMachineTriple(LLVMTargetMachineRef T)} */
    public static long nLLVMGetTargetMachineTriple(long T) {
        long __functionAddress = Functions.GetTargetMachineTriple;
        if (CHECKS) {
            check(T);
        }
        return invokePP(T, __functionAddress);
    }

    /** {@code char * LLVMGetTargetMachineTriple(LLVMTargetMachineRef T)} */
    @NativeType("char *")
    public static @Nullable String LLVMGetTargetMachineTriple(@NativeType("LLVMTargetMachineRef") long T) {
        long __result = nLLVMGetTargetMachineTriple(T);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMGetTargetMachineCPU ] ---

    /** {@code char * LLVMGetTargetMachineCPU(LLVMTargetMachineRef T)} */
    public static long nLLVMGetTargetMachineCPU(long T) {
        long __functionAddress = Functions.GetTargetMachineCPU;
        if (CHECKS) {
            check(T);
        }
        return invokePP(T, __functionAddress);
    }

    /** {@code char * LLVMGetTargetMachineCPU(LLVMTargetMachineRef T)} */
    @NativeType("char *")
    public static @Nullable String LLVMGetTargetMachineCPU(@NativeType("LLVMTargetMachineRef") long T) {
        long __result = nLLVMGetTargetMachineCPU(T);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMGetTargetMachineFeatureString ] ---

    /** {@code char * LLVMGetTargetMachineFeatureString(LLVMTargetMachineRef T)} */
    public static long nLLVMGetTargetMachineFeatureString(long T) {
        long __functionAddress = Functions.GetTargetMachineFeatureString;
        if (CHECKS) {
            check(T);
        }
        return invokePP(T, __functionAddress);
    }

    /** {@code char * LLVMGetTargetMachineFeatureString(LLVMTargetMachineRef T)} */
    @NativeType("char *")
    public static @Nullable String LLVMGetTargetMachineFeatureString(@NativeType("LLVMTargetMachineRef") long T) {
        long __result = nLLVMGetTargetMachineFeatureString(T);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMCreateTargetDataLayout ] ---

    /** {@code LLVMTargetDataRef LLVMCreateTargetDataLayout(LLVMTargetMachineRef T)} */
    @NativeType("LLVMTargetDataRef")
    public static long LLVMCreateTargetDataLayout(@NativeType("LLVMTargetMachineRef") long T) {
        long __functionAddress = Functions.CreateTargetDataLayout;
        if (CHECKS) {
            check(T);
        }
        return invokePP(T, __functionAddress);
    }

    // --- [ LLVMSetTargetMachineAsmVerbosity ] ---

    /** {@code void LLVMSetTargetMachineAsmVerbosity(LLVMTargetMachineRef T, LLVMBool VerboseAsm)} */
    public static void LLVMSetTargetMachineAsmVerbosity(@NativeType("LLVMTargetMachineRef") long T, @NativeType("LLVMBool") boolean VerboseAsm) {
        long __functionAddress = Functions.SetTargetMachineAsmVerbosity;
        if (CHECKS) {
            check(T);
        }
        invokePV(T, VerboseAsm ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMSetTargetMachineFastISel ] ---

    /** {@code void LLVMSetTargetMachineFastISel(LLVMTargetMachineRef T, LLVMBool Enable)} */
    public static void LLVMSetTargetMachineFastISel(@NativeType("LLVMTargetMachineRef") long T, @NativeType("LLVMBool") boolean Enable) {
        long __functionAddress = Functions.SetTargetMachineFastISel;
        if (CHECKS) {
            check(__functionAddress);
            check(T);
        }
        invokePV(T, Enable ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMSetTargetMachineGlobalISel ] ---

    /** {@code void LLVMSetTargetMachineGlobalISel(LLVMTargetMachineRef T, LLVMBool Enable)} */
    public static void LLVMSetTargetMachineGlobalISel(@NativeType("LLVMTargetMachineRef") long T, @NativeType("LLVMBool") boolean Enable) {
        long __functionAddress = Functions.SetTargetMachineGlobalISel;
        if (CHECKS) {
            check(__functionAddress);
            check(T);
        }
        invokePV(T, Enable ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMSetTargetMachineGlobalISelAbort ] ---

    /** {@code void LLVMSetTargetMachineGlobalISelAbort(LLVMTargetMachineRef T, LLVMGlobalISelAbortMode Mode)} */
    public static void LLVMSetTargetMachineGlobalISelAbort(@NativeType("LLVMTargetMachineRef") long T, @NativeType("LLVMGlobalISelAbortMode") int Mode) {
        long __functionAddress = Functions.SetTargetMachineGlobalISelAbort;
        if (CHECKS) {
            check(__functionAddress);
            check(T);
        }
        invokePV(T, Mode, __functionAddress);
    }

    // --- [ LLVMSetTargetMachineMachineOutliner ] ---

    /** {@code void LLVMSetTargetMachineMachineOutliner(LLVMTargetMachineRef T, LLVMBool Enable)} */
    public static void LLVMSetTargetMachineMachineOutliner(@NativeType("LLVMTargetMachineRef") long T, @NativeType("LLVMBool") boolean Enable) {
        long __functionAddress = Functions.SetTargetMachineMachineOutliner;
        if (CHECKS) {
            check(__functionAddress);
            check(T);
        }
        invokePV(T, Enable ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMTargetMachineEmitToFile ] ---

    /** {@code LLVMBool LLVMTargetMachineEmitToFile(LLVMTargetMachineRef T, LLVMModuleRef M, char const * Filename, LLVMCodeGenFileType codegen, char ** ErrorMessage)} */
    public static int nLLVMTargetMachineEmitToFile(long T, long M, long Filename, int codegen, long ErrorMessage) {
        long __functionAddress = Functions.TargetMachineEmitToFile;
        if (CHECKS) {
            check(T);
            check(M);
        }
        return invokePPPPI(T, M, Filename, codegen, ErrorMessage, __functionAddress);
    }

    /** {@code LLVMBool LLVMTargetMachineEmitToFile(LLVMTargetMachineRef T, LLVMModuleRef M, char const * Filename, LLVMCodeGenFileType codegen, char ** ErrorMessage)} */
    @NativeType("LLVMBool")
    public static boolean LLVMTargetMachineEmitToFile(@NativeType("LLVMTargetMachineRef") long T, @NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Filename, @NativeType("LLVMCodeGenFileType") int codegen, @NativeType("char **") PointerBuffer ErrorMessage) {
        if (CHECKS) {
            checkNT1(Filename);
            check(ErrorMessage, 1);
        }
        return nLLVMTargetMachineEmitToFile(T, M, memAddress(Filename), codegen, memAddress(ErrorMessage)) != 0;
    }

    /** {@code LLVMBool LLVMTargetMachineEmitToFile(LLVMTargetMachineRef T, LLVMModuleRef M, char const * Filename, LLVMCodeGenFileType codegen, char ** ErrorMessage)} */
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

    /** {@code LLVMBool LLVMTargetMachineEmitToMemoryBuffer(LLVMTargetMachineRef T, LLVMModuleRef M, LLVMCodeGenFileType codegen, char ** ErrorMessage, LLVMMemoryBufferRef * OutMemBuf)} */
    public static int nLLVMTargetMachineEmitToMemoryBuffer(long T, long M, int codegen, long ErrorMessage, long OutMemBuf) {
        long __functionAddress = Functions.TargetMachineEmitToMemoryBuffer;
        if (CHECKS) {
            check(T);
            check(M);
        }
        return invokePPPPI(T, M, codegen, ErrorMessage, OutMemBuf, __functionAddress);
    }

    /** {@code LLVMBool LLVMTargetMachineEmitToMemoryBuffer(LLVMTargetMachineRef T, LLVMModuleRef M, LLVMCodeGenFileType codegen, char ** ErrorMessage, LLVMMemoryBufferRef * OutMemBuf)} */
    @NativeType("LLVMBool")
    public static boolean LLVMTargetMachineEmitToMemoryBuffer(@NativeType("LLVMTargetMachineRef") long T, @NativeType("LLVMModuleRef") long M, @NativeType("LLVMCodeGenFileType") int codegen, @NativeType("char **") PointerBuffer ErrorMessage, @NativeType("LLVMMemoryBufferRef *") PointerBuffer OutMemBuf) {
        if (CHECKS) {
            check(ErrorMessage, 1);
            check(OutMemBuf, 1);
        }
        return nLLVMTargetMachineEmitToMemoryBuffer(T, M, codegen, memAddress(ErrorMessage), memAddress(OutMemBuf)) != 0;
    }

    // --- [ LLVMGetDefaultTargetTriple ] ---

    /** {@code char * LLVMGetDefaultTargetTriple(void)} */
    public static long nLLVMGetDefaultTargetTriple() {
        long __functionAddress = Functions.GetDefaultTargetTriple;
        return invokeP(__functionAddress);
    }

    /** {@code char * LLVMGetDefaultTargetTriple(void)} */
    @NativeType("char *")
    public static @Nullable String LLVMGetDefaultTargetTriple() {
        long __result = nLLVMGetDefaultTargetTriple();
        return memUTF8Safe(__result);
    }

    // --- [ LLVMNormalizeTargetTriple ] ---

    /** {@code char * LLVMNormalizeTargetTriple(char const * triple)} */
    public static long nLLVMNormalizeTargetTriple(long triple) {
        long __functionAddress = Functions.NormalizeTargetTriple;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePP(triple, __functionAddress);
    }

    /** {@code char * LLVMNormalizeTargetTriple(char const * triple)} */
    @NativeType("char *")
    public static @Nullable String LLVMNormalizeTargetTriple(@NativeType("char const *") ByteBuffer triple) {
        if (CHECKS) {
            checkNT1(triple);
        }
        long __result = nLLVMNormalizeTargetTriple(memAddress(triple));
        return memUTF8Safe(__result);
    }

    /** {@code char * LLVMNormalizeTargetTriple(char const * triple)} */
    @NativeType("char *")
    public static @Nullable String LLVMNormalizeTargetTriple(@NativeType("char const *") CharSequence triple) {
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

    /** {@code char * LLVMGetHostCPUName(void)} */
    public static long nLLVMGetHostCPUName() {
        long __functionAddress = Functions.GetHostCPUName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    /** {@code char * LLVMGetHostCPUName(void)} */
    @NativeType("char *")
    public static @Nullable String LLVMGetHostCPUName() {
        long __result = nLLVMGetHostCPUName();
        return memUTF8Safe(__result);
    }

    // --- [ LLVMGetHostCPUFeatures ] ---

    /** {@code char * LLVMGetHostCPUFeatures(void)} */
    public static long nLLVMGetHostCPUFeatures() {
        long __functionAddress = Functions.GetHostCPUFeatures;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    /** {@code char * LLVMGetHostCPUFeatures(void)} */
    @NativeType("char *")
    public static @Nullable String LLVMGetHostCPUFeatures() {
        long __result = nLLVMGetHostCPUFeatures();
        return memUTF8Safe(__result);
    }

    // --- [ LLVMAddAnalysisPasses ] ---

    /** {@code void LLVMAddAnalysisPasses(LLVMTargetMachineRef T, LLVMPassManagerRef PM)} */
    public static void LLVMAddAnalysisPasses(@NativeType("LLVMTargetMachineRef") long T, @NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddAnalysisPasses;
        if (CHECKS) {
            check(T);
            check(PM);
        }
        invokePPV(T, PM, __functionAddress);
    }

}