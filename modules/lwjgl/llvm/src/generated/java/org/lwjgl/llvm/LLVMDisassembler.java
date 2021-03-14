/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class LLVMDisassembler {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CreateDisasm            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMCreateDisasm"),
            CreateDisasmCPU         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMCreateDisasmCPU"),
            CreateDisasmCPUFeatures = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMCreateDisasmCPUFeatures"),
            SetDisasmOptions        = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMSetDisasmOptions"),
            DisasmDispose           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDisasmDispose"),
            DisasmInstruction       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDisasmInstruction");

    }

    public static final int
        LLVMDisassembler_VariantKind_None                    = 0,
        LLVMDisassembler_VariantKind_ARM_HI16                = 1,
        LLVMDisassembler_VariantKind_ARM_LO16                = 2,
        LLVMDisassembler_VariantKind_ARM64_PAGE              = 1,
        LLVMDisassembler_VariantKind_ARM64_PAGEOFF           = 2,
        LLVMDisassembler_VariantKind_ARM64_GOTPAGE           = 3,
        LLVMDisassembler_VariantKind_ARM64_GOTPAGEOFF        = 4,
        LLVMDisassembler_VariantKind_ARM64_TLVP              = 5,
        LLVMDisassembler_VariantKind_ARM64_TLVOFF            = 6,
        LLVMDisassembler_ReferenceType_InOut_None            = 0,
        LLVMDisassembler_ReferenceType_In_Branch             = 1,
        LLVMDisassembler_ReferenceType_In_PCrel_Load         = 2,
        LLVMDisassembler_ReferenceType_Out_SymbolStub        = 1,
        LLVMDisassembler_ReferenceType_Out_LitPool_SymAddr   = 2,
        LLVMDisassembler_ReferenceType_Out_LitPool_CstrAddr  = 3,
        LLVMDisassembler_ReferenceType_Out_Objc_CFString_Ref = 4,
        LLVMDisassembler_ReferenceType_Out_Objc_Message      = 5,
        LLVMDisassembler_ReferenceType_Out_Objc_Message_Ref  = 6,
        LLVMDisassembler_ReferenceType_Out_Objc_Selector_Ref = 7,
        LLVMDisassembler_ReferenceType_Out_Objc_Class_Ref    = 8,
        LLVMDisassembler_ReferenceType_DeMangled_Name        = 9;

    public static final long
        LLVMDisassembler_ReferenceType_In_ARM64_ADRP   = 0x100000001L,
        LLVMDisassembler_ReferenceType_In_ARM64_ADDXri = 0x100000002L,
        LLVMDisassembler_ReferenceType_In_ARM64_LDRXui = 0x100000003L,
        LLVMDisassembler_ReferenceType_In_ARM64_LDRXl  = 0x100000004L,
        LLVMDisassembler_ReferenceType_In_ARM64_ADR    = 0x100000005L;

    public static final int
        LLVMDisassembler_Option_UseMarkup         = 1,
        LLVMDisassembler_Option_PrintImmHex       = 2,
        LLVMDisassembler_Option_AsmPrinterVariant = 4,
        LLVMDisassembler_Option_SetInstrComments  = 8,
        LLVMDisassembler_Option_PrintLatency      = 16;

    protected LLVMDisassembler() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMCreateDisasm ] ---

    /** Unsafe version of: {@link #LLVMCreateDisasm CreateDisasm} */
    public static long nLLVMCreateDisasm(long TripleName, long DisInfo, int TagType, long GetOpInfo, long SymbolLookUp) {
        long __functionAddress = Functions.CreateDisasm;
        return invokePPPPP(TripleName, DisInfo, TagType, GetOpInfo, SymbolLookUp, __functionAddress);
    }

    /**
     * Create a disassembler for the {@code TripleName}.
     * 
     * <p>Symbolic disassembly is supported by passing a block of information in the {@code DisInfo} parameter and specifying the {@code TagType} and callback
     * functions as described above. These can all be passed as {@code NULL}. If successful, this returns a disassembler context. If not, it returns {@code NULL}. This
     * function is equivalent to calling {@link #LLVMCreateDisasmCPUFeatures CreateDisasmCPUFeatures} with an empty CPU name and feature set.</p>
     */
    @NativeType("LLVMDisasmContextRef")
    public static long LLVMCreateDisasm(@NativeType("char const *") ByteBuffer TripleName, @NativeType("void *") long DisInfo, int TagType, @Nullable @NativeType("int (*) (void *, uint64_t, uint64_t, uint64_t, int, void *)") LLVMOpInfoCallbackI GetOpInfo, @Nullable @NativeType("char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **)") LLVMSymbolLookupCallbackI SymbolLookUp) {
        if (CHECKS) {
            checkNT1(TripleName);
        }
        return nLLVMCreateDisasm(memAddress(TripleName), DisInfo, TagType, memAddressSafe(GetOpInfo), memAddressSafe(SymbolLookUp));
    }

    /**
     * Create a disassembler for the {@code TripleName}.
     * 
     * <p>Symbolic disassembly is supported by passing a block of information in the {@code DisInfo} parameter and specifying the {@code TagType} and callback
     * functions as described above. These can all be passed as {@code NULL}. If successful, this returns a disassembler context. If not, it returns {@code NULL}. This
     * function is equivalent to calling {@link #LLVMCreateDisasmCPUFeatures CreateDisasmCPUFeatures} with an empty CPU name and feature set.</p>
     */
    @NativeType("LLVMDisasmContextRef")
    public static long LLVMCreateDisasm(@NativeType("char const *") CharSequence TripleName, @NativeType("void *") long DisInfo, int TagType, @Nullable @NativeType("int (*) (void *, uint64_t, uint64_t, uint64_t, int, void *)") LLVMOpInfoCallbackI GetOpInfo, @Nullable @NativeType("char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **)") LLVMSymbolLookupCallbackI SymbolLookUp) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(TripleName, true);
            long TripleNameEncoded = stack.getPointerAddress();
            return nLLVMCreateDisasm(TripleNameEncoded, DisInfo, TagType, memAddressSafe(GetOpInfo), memAddressSafe(SymbolLookUp));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMCreateDisasmCPU ] ---

    /** Unsafe version of: {@link #LLVMCreateDisasmCPU CreateDisasmCPU} */
    public static long nLLVMCreateDisasmCPU(long Triple, long CPU, long DisInfo, int TagType, long GetOpInfo, long SymbolLookUp) {
        long __functionAddress = Functions.CreateDisasmCPU;
        return invokePPPPPP(Triple, CPU, DisInfo, TagType, GetOpInfo, SymbolLookUp, __functionAddress);
    }

    /**
     * Create a disassembler for the {@code TripleName} and a specific CPU.
     * 
     * <p>Symbolic disassembly is supported by passing a block of information in the {@code DisInfo} parameter and specifying the {@code TagType} and callback
     * functions as described above. These can all be passed as {@code NULL}. If successful, this returns a disassembler context. If not, it returns {@code NULL}. This
     * function is equivalent to calling {@link #LLVMCreateDisasmCPUFeatures CreateDisasmCPUFeatures} with an empty feature set.</p>
     */
    @NativeType("LLVMDisasmContextRef")
    public static long LLVMCreateDisasmCPU(@NativeType("char const *") ByteBuffer Triple, @NativeType("char const *") ByteBuffer CPU, @NativeType("void *") long DisInfo, int TagType, @Nullable @NativeType("int (*) (void *, uint64_t, uint64_t, uint64_t, int, void *)") LLVMOpInfoCallbackI GetOpInfo, @Nullable @NativeType("char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **)") LLVMSymbolLookupCallbackI SymbolLookUp) {
        if (CHECKS) {
            checkNT1(Triple);
            checkNT1(CPU);
        }
        return nLLVMCreateDisasmCPU(memAddress(Triple), memAddress(CPU), DisInfo, TagType, memAddressSafe(GetOpInfo), memAddressSafe(SymbolLookUp));
    }

    /**
     * Create a disassembler for the {@code TripleName} and a specific CPU.
     * 
     * <p>Symbolic disassembly is supported by passing a block of information in the {@code DisInfo} parameter and specifying the {@code TagType} and callback
     * functions as described above. These can all be passed as {@code NULL}. If successful, this returns a disassembler context. If not, it returns {@code NULL}. This
     * function is equivalent to calling {@link #LLVMCreateDisasmCPUFeatures CreateDisasmCPUFeatures} with an empty feature set.</p>
     */
    @NativeType("LLVMDisasmContextRef")
    public static long LLVMCreateDisasmCPU(@NativeType("char const *") CharSequence Triple, @NativeType("char const *") CharSequence CPU, @NativeType("void *") long DisInfo, int TagType, @Nullable @NativeType("int (*) (void *, uint64_t, uint64_t, uint64_t, int, void *)") LLVMOpInfoCallbackI GetOpInfo, @Nullable @NativeType("char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **)") LLVMSymbolLookupCallbackI SymbolLookUp) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Triple, true);
            long TripleEncoded = stack.getPointerAddress();
            stack.nUTF8(CPU, true);
            long CPUEncoded = stack.getPointerAddress();
            return nLLVMCreateDisasmCPU(TripleEncoded, CPUEncoded, DisInfo, TagType, memAddressSafe(GetOpInfo), memAddressSafe(SymbolLookUp));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMCreateDisasmCPUFeatures ] ---

    /** Unsafe version of: {@link #LLVMCreateDisasmCPUFeatures CreateDisasmCPUFeatures} */
    public static long nLLVMCreateDisasmCPUFeatures(long Triple, long CPU, long Features, long DisInfo, int TagType, long GetOpInfo, long SymbolLookUp) {
        long __functionAddress = Functions.CreateDisasmCPUFeatures;
        return invokePPPPPPP(Triple, CPU, Features, DisInfo, TagType, GetOpInfo, SymbolLookUp, __functionAddress);
    }

    /**
     * Create a disassembler for the {@code TripleName}, a specific CPU and specific feature string.
     * 
     * <p>Symbolic disassembly is supported by passing a block of information in the {@code DisInfo} parameter and specifying the {@code TagType} and callback
     * functions as described above. These can all be passed as {@code NULL}. If successful, this returns a disassembler context. If not, it returns {@code NULL}.</p>
     */
    @NativeType("LLVMDisasmContextRef")
    public static long LLVMCreateDisasmCPUFeatures(@NativeType("char const *") ByteBuffer Triple, @NativeType("char const *") ByteBuffer CPU, @NativeType("char const *") ByteBuffer Features, @NativeType("void *") long DisInfo, int TagType, @Nullable @NativeType("int (*) (void *, uint64_t, uint64_t, uint64_t, int, void *)") LLVMOpInfoCallbackI GetOpInfo, @Nullable @NativeType("char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **)") LLVMSymbolLookupCallbackI SymbolLookUp) {
        if (CHECKS) {
            checkNT1(Triple);
            checkNT1(CPU);
            checkNT1(Features);
        }
        return nLLVMCreateDisasmCPUFeatures(memAddress(Triple), memAddress(CPU), memAddress(Features), DisInfo, TagType, memAddressSafe(GetOpInfo), memAddressSafe(SymbolLookUp));
    }

    /**
     * Create a disassembler for the {@code TripleName}, a specific CPU and specific feature string.
     * 
     * <p>Symbolic disassembly is supported by passing a block of information in the {@code DisInfo} parameter and specifying the {@code TagType} and callback
     * functions as described above. These can all be passed as {@code NULL}. If successful, this returns a disassembler context. If not, it returns {@code NULL}.</p>
     */
    @NativeType("LLVMDisasmContextRef")
    public static long LLVMCreateDisasmCPUFeatures(@NativeType("char const *") CharSequence Triple, @NativeType("char const *") CharSequence CPU, @NativeType("char const *") CharSequence Features, @NativeType("void *") long DisInfo, int TagType, @Nullable @NativeType("int (*) (void *, uint64_t, uint64_t, uint64_t, int, void *)") LLVMOpInfoCallbackI GetOpInfo, @Nullable @NativeType("char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **)") LLVMSymbolLookupCallbackI SymbolLookUp) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Triple, true);
            long TripleEncoded = stack.getPointerAddress();
            stack.nUTF8(CPU, true);
            long CPUEncoded = stack.getPointerAddress();
            stack.nUTF8(Features, true);
            long FeaturesEncoded = stack.getPointerAddress();
            return nLLVMCreateDisasmCPUFeatures(TripleEncoded, CPUEncoded, FeaturesEncoded, DisInfo, TagType, memAddressSafe(GetOpInfo), memAddressSafe(SymbolLookUp));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMSetDisasmOptions ] ---

    /** Set the disassembler's options.  Returns 1 if it can set the {@code Options} and 0 otherwise. */
    public static int LLVMSetDisasmOptions(@NativeType("LLVMDisasmContextRef") long DC, @NativeType("uint64_t") long Options) {
        long __functionAddress = Functions.SetDisasmOptions;
        if (CHECKS) {
            check(DC);
        }
        return invokePJI(DC, Options, __functionAddress);
    }

    // --- [ LLVMDisasmDispose ] ---

    /** Dispose of a disassembler context. */
    public static void LLVMDisasmDispose(@NativeType("LLVMDisasmContextRef") long DC) {
        long __functionAddress = Functions.DisasmDispose;
        if (CHECKS) {
            check(DC);
        }
        invokePV(DC, __functionAddress);
    }

    // --- [ LLVMDisasmInstruction ] ---

    /** Unsafe version of: {@link #LLVMDisasmInstruction DisasmInstruction} */
    public static long nLLVMDisasmInstruction(long DC, long Bytes, long BytesSize, long PC, long OutString, long OutStringSize) {
        long __functionAddress = Functions.DisasmInstruction;
        if (CHECKS) {
            check(DC);
        }
        return invokePPJJPPP(DC, Bytes, BytesSize, PC, OutString, OutStringSize, __functionAddress);
    }

    /**
     * Disassemble a single instruction using the disassembler context specified in the parameter DC.
     * 
     * <p>The bytes of the instruction are specified in the parameter {@code Bytes}, and contains at least {@code BytesSize} number of bytes. The instruction is
     * at the address specified by the {@code PC} parameter. If a valid instruction can be disassembled, its string is returned indirectly in
     * {@code OutString} whose size is specified in the parameter {@code OutStringSize}. This function returns the number of bytes in the instruction or zero
     * if there was no valid instruction.</p>
     */
    @NativeType("size_t")
    public static long LLVMDisasmInstruction(@NativeType("LLVMDisasmContextRef") long DC, @NativeType("uint8_t *") ByteBuffer Bytes, @NativeType("uint64_t") long PC, @NativeType("char *") ByteBuffer OutString) {
        return nLLVMDisasmInstruction(DC, memAddress(Bytes), Bytes.remaining(), PC, memAddress(OutString), OutString.remaining());
    }

}