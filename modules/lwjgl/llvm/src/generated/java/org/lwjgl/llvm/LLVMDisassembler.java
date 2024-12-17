/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

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

    /** {@code LLVMDisasmContextRef LLVMCreateDisasm(char const * TripleName, void * DisInfo, int TagType, int (*) (void *, uint64_t, uint64_t, uint64_t, uint64_t, int, void *) GetOpInfo, char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **) SymbolLookUp)} */
    public static long nLLVMCreateDisasm(long TripleName, long DisInfo, int TagType, long GetOpInfo, long SymbolLookUp) {
        long __functionAddress = Functions.CreateDisasm;
        return invokePPPPP(TripleName, DisInfo, TagType, GetOpInfo, SymbolLookUp, __functionAddress);
    }

    /** {@code LLVMDisasmContextRef LLVMCreateDisasm(char const * TripleName, void * DisInfo, int TagType, int (*) (void *, uint64_t, uint64_t, uint64_t, uint64_t, int, void *) GetOpInfo, char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **) SymbolLookUp)} */
    @NativeType("LLVMDisasmContextRef")
    public static long LLVMCreateDisasm(@NativeType("char const *") ByteBuffer TripleName, @NativeType("void *") long DisInfo, int TagType, @NativeType("int (*) (void *, uint64_t, uint64_t, uint64_t, uint64_t, int, void *)") @Nullable LLVMOpInfoCallbackI GetOpInfo, @NativeType("char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **)") @Nullable LLVMSymbolLookupCallbackI SymbolLookUp) {
        if (CHECKS) {
            checkNT1(TripleName);
        }
        return nLLVMCreateDisasm(memAddress(TripleName), DisInfo, TagType, memAddressSafe(GetOpInfo), memAddressSafe(SymbolLookUp));
    }

    /** {@code LLVMDisasmContextRef LLVMCreateDisasm(char const * TripleName, void * DisInfo, int TagType, int (*) (void *, uint64_t, uint64_t, uint64_t, uint64_t, int, void *) GetOpInfo, char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **) SymbolLookUp)} */
    @NativeType("LLVMDisasmContextRef")
    public static long LLVMCreateDisasm(@NativeType("char const *") CharSequence TripleName, @NativeType("void *") long DisInfo, int TagType, @NativeType("int (*) (void *, uint64_t, uint64_t, uint64_t, uint64_t, int, void *)") @Nullable LLVMOpInfoCallbackI GetOpInfo, @NativeType("char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **)") @Nullable LLVMSymbolLookupCallbackI SymbolLookUp) {
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

    /** {@code LLVMDisasmContextRef LLVMCreateDisasmCPU(char const * Triple, char const * CPU, void * DisInfo, int TagType, int (*) (void *, uint64_t, uint64_t, uint64_t, uint64_t, int, void *) GetOpInfo, char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **) SymbolLookUp)} */
    public static long nLLVMCreateDisasmCPU(long Triple, long CPU, long DisInfo, int TagType, long GetOpInfo, long SymbolLookUp) {
        long __functionAddress = Functions.CreateDisasmCPU;
        return invokePPPPPP(Triple, CPU, DisInfo, TagType, GetOpInfo, SymbolLookUp, __functionAddress);
    }

    /** {@code LLVMDisasmContextRef LLVMCreateDisasmCPU(char const * Triple, char const * CPU, void * DisInfo, int TagType, int (*) (void *, uint64_t, uint64_t, uint64_t, uint64_t, int, void *) GetOpInfo, char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **) SymbolLookUp)} */
    @NativeType("LLVMDisasmContextRef")
    public static long LLVMCreateDisasmCPU(@NativeType("char const *") ByteBuffer Triple, @NativeType("char const *") ByteBuffer CPU, @NativeType("void *") long DisInfo, int TagType, @NativeType("int (*) (void *, uint64_t, uint64_t, uint64_t, uint64_t, int, void *)") @Nullable LLVMOpInfoCallbackI GetOpInfo, @NativeType("char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **)") @Nullable LLVMSymbolLookupCallbackI SymbolLookUp) {
        if (CHECKS) {
            checkNT1(Triple);
            checkNT1(CPU);
        }
        return nLLVMCreateDisasmCPU(memAddress(Triple), memAddress(CPU), DisInfo, TagType, memAddressSafe(GetOpInfo), memAddressSafe(SymbolLookUp));
    }

    /** {@code LLVMDisasmContextRef LLVMCreateDisasmCPU(char const * Triple, char const * CPU, void * DisInfo, int TagType, int (*) (void *, uint64_t, uint64_t, uint64_t, uint64_t, int, void *) GetOpInfo, char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **) SymbolLookUp)} */
    @NativeType("LLVMDisasmContextRef")
    public static long LLVMCreateDisasmCPU(@NativeType("char const *") CharSequence Triple, @NativeType("char const *") CharSequence CPU, @NativeType("void *") long DisInfo, int TagType, @NativeType("int (*) (void *, uint64_t, uint64_t, uint64_t, uint64_t, int, void *)") @Nullable LLVMOpInfoCallbackI GetOpInfo, @NativeType("char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **)") @Nullable LLVMSymbolLookupCallbackI SymbolLookUp) {
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

    /** {@code LLVMDisasmContextRef LLVMCreateDisasmCPUFeatures(char const * Triple, char const * CPU, char const * Features, void * DisInfo, int TagType, int (*) (void *, uint64_t, uint64_t, uint64_t, uint64_t, int, void *) GetOpInfo, char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **) SymbolLookUp)} */
    public static long nLLVMCreateDisasmCPUFeatures(long Triple, long CPU, long Features, long DisInfo, int TagType, long GetOpInfo, long SymbolLookUp) {
        long __functionAddress = Functions.CreateDisasmCPUFeatures;
        return invokePPPPPPP(Triple, CPU, Features, DisInfo, TagType, GetOpInfo, SymbolLookUp, __functionAddress);
    }

    /** {@code LLVMDisasmContextRef LLVMCreateDisasmCPUFeatures(char const * Triple, char const * CPU, char const * Features, void * DisInfo, int TagType, int (*) (void *, uint64_t, uint64_t, uint64_t, uint64_t, int, void *) GetOpInfo, char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **) SymbolLookUp)} */
    @NativeType("LLVMDisasmContextRef")
    public static long LLVMCreateDisasmCPUFeatures(@NativeType("char const *") ByteBuffer Triple, @NativeType("char const *") ByteBuffer CPU, @NativeType("char const *") ByteBuffer Features, @NativeType("void *") long DisInfo, int TagType, @NativeType("int (*) (void *, uint64_t, uint64_t, uint64_t, uint64_t, int, void *)") @Nullable LLVMOpInfoCallbackI GetOpInfo, @NativeType("char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **)") @Nullable LLVMSymbolLookupCallbackI SymbolLookUp) {
        if (CHECKS) {
            checkNT1(Triple);
            checkNT1(CPU);
            checkNT1(Features);
        }
        return nLLVMCreateDisasmCPUFeatures(memAddress(Triple), memAddress(CPU), memAddress(Features), DisInfo, TagType, memAddressSafe(GetOpInfo), memAddressSafe(SymbolLookUp));
    }

    /** {@code LLVMDisasmContextRef LLVMCreateDisasmCPUFeatures(char const * Triple, char const * CPU, char const * Features, void * DisInfo, int TagType, int (*) (void *, uint64_t, uint64_t, uint64_t, uint64_t, int, void *) GetOpInfo, char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **) SymbolLookUp)} */
    @NativeType("LLVMDisasmContextRef")
    public static long LLVMCreateDisasmCPUFeatures(@NativeType("char const *") CharSequence Triple, @NativeType("char const *") CharSequence CPU, @NativeType("char const *") CharSequence Features, @NativeType("void *") long DisInfo, int TagType, @NativeType("int (*) (void *, uint64_t, uint64_t, uint64_t, uint64_t, int, void *)") @Nullable LLVMOpInfoCallbackI GetOpInfo, @NativeType("char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **)") @Nullable LLVMSymbolLookupCallbackI SymbolLookUp) {
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

    /** {@code int LLVMSetDisasmOptions(LLVMDisasmContextRef DC, uint64_t Options)} */
    public static int LLVMSetDisasmOptions(@NativeType("LLVMDisasmContextRef") long DC, @NativeType("uint64_t") long Options) {
        long __functionAddress = Functions.SetDisasmOptions;
        if (CHECKS) {
            check(DC);
        }
        return invokePJI(DC, Options, __functionAddress);
    }

    // --- [ LLVMDisasmDispose ] ---

    /** {@code void LLVMDisasmDispose(LLVMDisasmContextRef DC)} */
    public static void LLVMDisasmDispose(@NativeType("LLVMDisasmContextRef") long DC) {
        long __functionAddress = Functions.DisasmDispose;
        if (CHECKS) {
            check(DC);
        }
        invokePV(DC, __functionAddress);
    }

    // --- [ LLVMDisasmInstruction ] ---

    /** {@code size_t LLVMDisasmInstruction(LLVMDisasmContextRef DC, uint8_t * Bytes, uint64_t BytesSize, uint64_t PC, char * OutString, size_t OutStringSize)} */
    public static long nLLVMDisasmInstruction(long DC, long Bytes, long BytesSize, long PC, long OutString, long OutStringSize) {
        long __functionAddress = Functions.DisasmInstruction;
        if (CHECKS) {
            check(DC);
        }
        return invokePPJJPPP(DC, Bytes, BytesSize, PC, OutString, OutStringSize, __functionAddress);
    }

    /** {@code size_t LLVMDisasmInstruction(LLVMDisasmContextRef DC, uint8_t * Bytes, uint64_t BytesSize, uint64_t PC, char * OutString, size_t OutStringSize)} */
    @NativeType("size_t")
    public static long LLVMDisasmInstruction(@NativeType("LLVMDisasmContextRef") long DC, @NativeType("uint8_t *") ByteBuffer Bytes, @NativeType("uint64_t") long PC, @NativeType("char *") ByteBuffer OutString) {
        return nLLVMDisasmInstruction(DC, memAddress(Bytes), Bytes.remaining(), PC, memAddress(OutString), OutString.remaining());
    }

}