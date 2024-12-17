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

public class LLVMTarget {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetModuleDataLayout        = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetModuleDataLayout"),
            SetModuleDataLayout        = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMSetModuleDataLayout"),
            CreateTargetData           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMCreateTargetData"),
            DisposeTargetData          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDisposeTargetData"),
            AddTargetLibraryInfo       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddTargetLibraryInfo"),
            CopyStringRepOfTargetData  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMCopyStringRepOfTargetData"),
            ByteOrder                  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMByteOrder"),
            PointerSize                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMPointerSize"),
            PointerSizeForAS           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMPointerSizeForAS"),
            IntPtrType                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMIntPtrType"),
            IntPtrTypeForAS            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMIntPtrTypeForAS"),
            IntPtrTypeInContext        = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMIntPtrTypeInContext"),
            IntPtrTypeForASInContext   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMIntPtrTypeForASInContext"),
            SizeOfTypeInBits           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMSizeOfTypeInBits"),
            StoreSizeOfType            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMStoreSizeOfType"),
            ABISizeOfType              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMABISizeOfType"),
            ABIAlignmentOfType         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMABIAlignmentOfType"),
            CallFrameAlignmentOfType   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMCallFrameAlignmentOfType"),
            PreferredAlignmentOfType   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMPreferredAlignmentOfType"),
            PreferredAlignmentOfGlobal = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMPreferredAlignmentOfGlobal"),
            ElementAtOffset            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMElementAtOffset"),
            OffsetOfElement            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOffsetOfElement");

    }

    public static final int
        LLVMBigEndian    = 0,
        LLVMLittleEndian = 1;

    protected LLVMTarget() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMGetModuleDataLayout ] ---

    /** {@code LLVMTargetDataRef LLVMGetModuleDataLayout(LLVMModuleRef M)} */
    @NativeType("LLVMTargetDataRef")
    public static long LLVMGetModuleDataLayout(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetModuleDataLayout;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMSetModuleDataLayout ] ---

    /** {@code void LLVMSetModuleDataLayout(LLVMModuleRef M, LLVMTargetDataRef DL)} */
    public static void LLVMSetModuleDataLayout(@NativeType("LLVMModuleRef") long M, @NativeType("LLVMTargetDataRef") long DL) {
        long __functionAddress = Functions.SetModuleDataLayout;
        if (CHECKS) {
            check(M);
            check(DL);
        }
        invokePPV(M, DL, __functionAddress);
    }

    // --- [ LLVMCreateTargetData ] ---

    /** {@code LLVMTargetDataRef LLVMCreateTargetData(char const * StringRep)} */
    public static long nLLVMCreateTargetData(long StringRep) {
        long __functionAddress = Functions.CreateTargetData;
        return invokePP(StringRep, __functionAddress);
    }

    /** {@code LLVMTargetDataRef LLVMCreateTargetData(char const * StringRep)} */
    @NativeType("LLVMTargetDataRef")
    public static long LLVMCreateTargetData(@NativeType("char const *") ByteBuffer StringRep) {
        if (CHECKS) {
            checkNT1(StringRep);
        }
        return nLLVMCreateTargetData(memAddress(StringRep));
    }

    /** {@code LLVMTargetDataRef LLVMCreateTargetData(char const * StringRep)} */
    @NativeType("LLVMTargetDataRef")
    public static long LLVMCreateTargetData(@NativeType("char const *") CharSequence StringRep) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(StringRep, true);
            long StringRepEncoded = stack.getPointerAddress();
            return nLLVMCreateTargetData(StringRepEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDisposeTargetData ] ---

    /** {@code void LLVMDisposeTargetData(LLVMTargetDataRef TD)} */
    public static void LLVMDisposeTargetData(@NativeType("LLVMTargetDataRef") long TD) {
        long __functionAddress = Functions.DisposeTargetData;
        if (CHECKS) {
            check(TD);
        }
        invokePV(TD, __functionAddress);
    }

    // --- [ LLVMAddTargetLibraryInfo ] ---

    /** {@code void LLVMAddTargetLibraryInfo(LLVMTargetLibraryInfoRef TLI, LLVMPassManagerRef PM)} */
    public static void LLVMAddTargetLibraryInfo(@NativeType("LLVMTargetLibraryInfoRef") long TLI, @NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddTargetLibraryInfo;
        if (CHECKS) {
            check(TLI);
            check(PM);
        }
        invokePPV(TLI, PM, __functionAddress);
    }

    // --- [ LLVMCopyStringRepOfTargetData ] ---

    /** {@code char * LLVMCopyStringRepOfTargetData(LLVMTargetDataRef TD)} */
    public static long nLLVMCopyStringRepOfTargetData(long TD) {
        long __functionAddress = Functions.CopyStringRepOfTargetData;
        if (CHECKS) {
            check(TD);
        }
        return invokePP(TD, __functionAddress);
    }

    /** {@code char * LLVMCopyStringRepOfTargetData(LLVMTargetDataRef TD)} */
    @NativeType("char *")
    public static @Nullable String LLVMCopyStringRepOfTargetData(@NativeType("LLVMTargetDataRef") long TD) {
        long __result = nLLVMCopyStringRepOfTargetData(TD);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMByteOrder ] ---

    /** {@code enum LLVMByteOrdering LLVMByteOrder(LLVMTargetDataRef TD)} */
    @NativeType("enum LLVMByteOrdering")
    public static int LLVMByteOrder(@NativeType("LLVMTargetDataRef") long TD) {
        long __functionAddress = Functions.ByteOrder;
        if (CHECKS) {
            check(TD);
        }
        return invokePI(TD, __functionAddress);
    }

    // --- [ LLVMPointerSize ] ---

    /** {@code unsigned int LLVMPointerSize(LLVMTargetDataRef TD)} */
    @NativeType("unsigned int")
    public static int LLVMPointerSize(@NativeType("LLVMTargetDataRef") long TD) {
        long __functionAddress = Functions.PointerSize;
        if (CHECKS) {
            check(TD);
        }
        return invokePI(TD, __functionAddress);
    }

    // --- [ LLVMPointerSizeForAS ] ---

    /** {@code unsigned int LLVMPointerSizeForAS(LLVMTargetDataRef TD, unsigned int AS)} */
    @NativeType("unsigned int")
    public static int LLVMPointerSizeForAS(@NativeType("LLVMTargetDataRef") long TD, @NativeType("unsigned int") int AS) {
        long __functionAddress = Functions.PointerSizeForAS;
        if (CHECKS) {
            check(TD);
        }
        return invokePI(TD, AS, __functionAddress);
    }

    // --- [ LLVMIntPtrType ] ---

    /** {@code LLVMTypeRef LLVMIntPtrType(LLVMTargetDataRef TD)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMIntPtrType(@NativeType("LLVMTargetDataRef") long TD) {
        long __functionAddress = Functions.IntPtrType;
        if (CHECKS) {
            check(TD);
        }
        return invokePP(TD, __functionAddress);
    }

    // --- [ LLVMIntPtrTypeForAS ] ---

    /** {@code LLVMTypeRef LLVMIntPtrTypeForAS(LLVMTargetDataRef TD, unsigned int AS)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMIntPtrTypeForAS(@NativeType("LLVMTargetDataRef") long TD, @NativeType("unsigned int") int AS) {
        long __functionAddress = Functions.IntPtrTypeForAS;
        if (CHECKS) {
            check(TD);
        }
        return invokePP(TD, AS, __functionAddress);
    }

    // --- [ LLVMIntPtrTypeInContext ] ---

    /** {@code LLVMTypeRef LLVMIntPtrTypeInContext(LLVMContextRef C, LLVMTargetDataRef TD)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMIntPtrTypeInContext(@NativeType("LLVMContextRef") long C, @NativeType("LLVMTargetDataRef") long TD) {
        long __functionAddress = Functions.IntPtrTypeInContext;
        if (CHECKS) {
            check(C);
            check(TD);
        }
        return invokePPP(C, TD, __functionAddress);
    }

    // --- [ LLVMIntPtrTypeForASInContext ] ---

    /** {@code LLVMTypeRef LLVMIntPtrTypeForASInContext(LLVMContextRef C, LLVMTargetDataRef TD, unsigned int AS)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMIntPtrTypeForASInContext(@NativeType("LLVMContextRef") long C, @NativeType("LLVMTargetDataRef") long TD, @NativeType("unsigned int") int AS) {
        long __functionAddress = Functions.IntPtrTypeForASInContext;
        if (CHECKS) {
            check(C);
            check(TD);
        }
        return invokePPP(C, TD, AS, __functionAddress);
    }

    // --- [ LLVMSizeOfTypeInBits ] ---

    /** {@code unsigned long long LLVMSizeOfTypeInBits(LLVMTargetDataRef TD, LLVMTypeRef Ty)} */
    @NativeType("unsigned long long")
    public static long LLVMSizeOfTypeInBits(@NativeType("LLVMTargetDataRef") long TD, @NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.SizeOfTypeInBits;
        if (CHECKS) {
            check(TD);
            check(Ty);
        }
        return invokePPJ(TD, Ty, __functionAddress);
    }

    // --- [ LLVMStoreSizeOfType ] ---

    /** {@code unsigned long long LLVMStoreSizeOfType(LLVMTargetDataRef TD, LLVMTypeRef Ty)} */
    @NativeType("unsigned long long")
    public static long LLVMStoreSizeOfType(@NativeType("LLVMTargetDataRef") long TD, @NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.StoreSizeOfType;
        if (CHECKS) {
            check(TD);
            check(Ty);
        }
        return invokePPJ(TD, Ty, __functionAddress);
    }

    // --- [ LLVMABISizeOfType ] ---

    /** {@code unsigned long long LLVMABISizeOfType(LLVMTargetDataRef TD, LLVMTypeRef Ty)} */
    @NativeType("unsigned long long")
    public static long LLVMABISizeOfType(@NativeType("LLVMTargetDataRef") long TD, @NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.ABISizeOfType;
        if (CHECKS) {
            check(TD);
            check(Ty);
        }
        return invokePPJ(TD, Ty, __functionAddress);
    }

    // --- [ LLVMABIAlignmentOfType ] ---

    /** {@code unsigned int LLVMABIAlignmentOfType(LLVMTargetDataRef TD, LLVMTypeRef Ty)} */
    @NativeType("unsigned int")
    public static int LLVMABIAlignmentOfType(@NativeType("LLVMTargetDataRef") long TD, @NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.ABIAlignmentOfType;
        if (CHECKS) {
            check(TD);
            check(Ty);
        }
        return invokePPI(TD, Ty, __functionAddress);
    }

    // --- [ LLVMCallFrameAlignmentOfType ] ---

    /** {@code unsigned int LLVMCallFrameAlignmentOfType(LLVMTargetDataRef TD, LLVMTypeRef Ty)} */
    @NativeType("unsigned int")
    public static int LLVMCallFrameAlignmentOfType(@NativeType("LLVMTargetDataRef") long TD, @NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.CallFrameAlignmentOfType;
        if (CHECKS) {
            check(TD);
            check(Ty);
        }
        return invokePPI(TD, Ty, __functionAddress);
    }

    // --- [ LLVMPreferredAlignmentOfType ] ---

    /** {@code unsigned int LLVMPreferredAlignmentOfType(LLVMTargetDataRef TD, LLVMTypeRef Ty)} */
    @NativeType("unsigned int")
    public static int LLVMPreferredAlignmentOfType(@NativeType("LLVMTargetDataRef") long TD, @NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.PreferredAlignmentOfType;
        if (CHECKS) {
            check(TD);
            check(Ty);
        }
        return invokePPI(TD, Ty, __functionAddress);
    }

    // --- [ LLVMPreferredAlignmentOfGlobal ] ---

    /** {@code unsigned int LLVMPreferredAlignmentOfGlobal(LLVMTargetDataRef TD, LLVMValueRef GlobalVar)} */
    @NativeType("unsigned int")
    public static int LLVMPreferredAlignmentOfGlobal(@NativeType("LLVMTargetDataRef") long TD, @NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.PreferredAlignmentOfGlobal;
        if (CHECKS) {
            check(TD);
            check(GlobalVar);
        }
        return invokePPI(TD, GlobalVar, __functionAddress);
    }

    // --- [ LLVMElementAtOffset ] ---

    /** {@code unsigned int LLVMElementAtOffset(LLVMTargetDataRef TD, LLVMTypeRef StructTy, unsigned long long Offset)} */
    @NativeType("unsigned int")
    public static int LLVMElementAtOffset(@NativeType("LLVMTargetDataRef") long TD, @NativeType("LLVMTypeRef") long StructTy, @NativeType("unsigned long long") long Offset) {
        long __functionAddress = Functions.ElementAtOffset;
        if (CHECKS) {
            check(TD);
            check(StructTy);
        }
        return invokePPJI(TD, StructTy, Offset, __functionAddress);
    }

    // --- [ LLVMOffsetOfElement ] ---

    /** {@code unsigned long long LLVMOffsetOfElement(LLVMTargetDataRef TD, LLVMTypeRef StructTy, unsigned int Element)} */
    @NativeType("unsigned long long")
    public static long LLVMOffsetOfElement(@NativeType("LLVMTargetDataRef") long TD, @NativeType("LLVMTypeRef") long StructTy, @NativeType("unsigned int") int Element) {
        long __functionAddress = Functions.OffsetOfElement;
        if (CHECKS) {
            check(TD);
            check(StructTy);
        }
        return invokePPJ(TD, StructTy, Element, __functionAddress);
    }

}