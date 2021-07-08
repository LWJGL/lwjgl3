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

    /**
     * {@code enum LLVMByteOrdering}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMBigEndian BigEndian}</li>
     * <li>{@link #LLVMLittleEndian LittleEndian}</li>
     * </ul>
     */
    public static final int
        LLVMBigEndian    = 0,
        LLVMLittleEndian = 1;

    protected LLVMTarget() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMGetModuleDataLayout ] ---

    /** Obtain the data layout for a module. */
    @NativeType("LLVMTargetDataRef")
    public static long LLVMGetModuleDataLayout(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetModuleDataLayout;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMSetModuleDataLayout ] ---

    /** Set the data layout for a module. */
    public static void LLVMSetModuleDataLayout(@NativeType("LLVMModuleRef") long M, @NativeType("LLVMTargetDataRef") long DL) {
        long __functionAddress = Functions.SetModuleDataLayout;
        if (CHECKS) {
            check(M);
            check(DL);
        }
        invokePPV(M, DL, __functionAddress);
    }

    // --- [ LLVMCreateTargetData ] ---

    /** Unsafe version of: {@link #LLVMCreateTargetData CreateTargetData} */
    public static long nLLVMCreateTargetData(long StringRep) {
        long __functionAddress = Functions.CreateTargetData;
        return invokePP(StringRep, __functionAddress);
    }

    /** Creates target data from a target layout string. See the constructor {@code llvm::DataLayout::DataLayout}. */
    @NativeType("LLVMTargetDataRef")
    public static long LLVMCreateTargetData(@NativeType("char const *") ByteBuffer StringRep) {
        if (CHECKS) {
            checkNT1(StringRep);
        }
        return nLLVMCreateTargetData(memAddress(StringRep));
    }

    /** Creates target data from a target layout string. See the constructor {@code llvm::DataLayout::DataLayout}. */
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

    /** Deallocates a {@code TargetData}. See the destructor {@code llvm::DataLayout::~DataLayout}. */
    public static void LLVMDisposeTargetData(@NativeType("LLVMTargetDataRef") long TD) {
        long __functionAddress = Functions.DisposeTargetData;
        if (CHECKS) {
            check(TD);
        }
        invokePV(TD, __functionAddress);
    }

    // --- [ LLVMAddTargetLibraryInfo ] ---

    /**
     * Adds target library information to a pass manager. This does not take ownership of the target library info. See the method
     * {@code llvm::PassManagerBase::add}.
     */
    public static void LLVMAddTargetLibraryInfo(@NativeType("LLVMTargetLibraryInfoRef") long TLI, @NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddTargetLibraryInfo;
        if (CHECKS) {
            check(TLI);
            check(PM);
        }
        invokePPV(TLI, PM, __functionAddress);
    }

    // --- [ LLVMCopyStringRepOfTargetData ] ---

    /** Unsafe version of: {@link #LLVMCopyStringRepOfTargetData CopyStringRepOfTargetData} */
    public static long nLLVMCopyStringRepOfTargetData(long TD) {
        long __functionAddress = Functions.CopyStringRepOfTargetData;
        if (CHECKS) {
            check(TD);
        }
        return invokePP(TD, __functionAddress);
    }

    /**
     * Converts target data to a target layout string. The string must be disposed with {@link LLVMCore#LLVMDisposeMessage DisposeMessage}. See the constructor
     * {@code llvm::DataLayout::DataLayout}.
     */
    @Nullable
    @NativeType("char *")
    public static String LLVMCopyStringRepOfTargetData(@NativeType("LLVMTargetDataRef") long TD) {
        long __result = nLLVMCopyStringRepOfTargetData(TD);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMByteOrder ] ---

    /** Returns the byte order of a target, either {@link #LLVMBigEndian BigEndian} or {@link #LLVMLittleEndian LittleEndian}. See the method {@code llvm::DataLayout::isLittleEndian}. */
    @NativeType("enum LLVMByteOrdering")
    public static int LLVMByteOrder(@NativeType("LLVMTargetDataRef") long TD) {
        long __functionAddress = Functions.ByteOrder;
        if (CHECKS) {
            check(TD);
        }
        return invokePI(TD, __functionAddress);
    }

    // --- [ LLVMPointerSize ] ---

    /** Returns the pointer size in bytes for a target. See the method {@code llvm::DataLayout::getPointerSize}. */
    @NativeType("unsigned int")
    public static int LLVMPointerSize(@NativeType("LLVMTargetDataRef") long TD) {
        long __functionAddress = Functions.PointerSize;
        if (CHECKS) {
            check(TD);
        }
        return invokePI(TD, __functionAddress);
    }

    // --- [ LLVMPointerSizeForAS ] ---

    /** Returns the pointer size in bytes for a target for a specified address space. See the method {@code llvm::DataLayout::getPointerSize}. */
    @NativeType("unsigned int")
    public static int LLVMPointerSizeForAS(@NativeType("LLVMTargetDataRef") long TD, @NativeType("unsigned int") int AS) {
        long __functionAddress = Functions.PointerSizeForAS;
        if (CHECKS) {
            check(TD);
        }
        return invokePI(TD, AS, __functionAddress);
    }

    // --- [ LLVMIntPtrType ] ---

    /** Returns the integer type that is the same size as a pointer on a target. See the method {@code llvm::DataLayout::getIntPtrType}. */
    @NativeType("LLVMTypeRef")
    public static long LLVMIntPtrType(@NativeType("LLVMTargetDataRef") long TD) {
        long __functionAddress = Functions.IntPtrType;
        if (CHECKS) {
            check(TD);
        }
        return invokePP(TD, __functionAddress);
    }

    // --- [ LLVMIntPtrTypeForAS ] ---

    /**
     * Returns the integer type that is the same size as a pointer on a target. This version allows the address space to be specified. See the method
     * {@code llvm::DataLayout::getIntPtrType}.
     */
    @NativeType("LLVMTypeRef")
    public static long LLVMIntPtrTypeForAS(@NativeType("LLVMTargetDataRef") long TD, @NativeType("unsigned int") int AS) {
        long __functionAddress = Functions.IntPtrTypeForAS;
        if (CHECKS) {
            check(TD);
        }
        return invokePP(TD, AS, __functionAddress);
    }

    // --- [ LLVMIntPtrTypeInContext ] ---

    /** Returns the integer type that is the same size as a pointer on a target. See the method {@code llvm::DataLayout::getIntPtrType}. */
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

    /**
     * Returns the integer type that is the same size as a pointer on a target. This version allows the address space to be specified. See the method
     * {@code llvm::DataLayout::getIntPtrType}.
     */
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

    /** Computes the size of a type in bytes for a target. See the method {@code llvm::DataLayout::getTypeSizeInBits}. */
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

    /** Computes the storage size of a type in bytes for a target. See the method {@code llvm::DataLayout::getTypeStoreSize}. */
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

    /** Computes the ABI size of a type in bytes for a target. See the method {@code llvm::DataLayout::getTypeAllocSize}. */
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

    /** Computes the ABI alignment of a type in bytes for a target. See the method {@code llvm::DataLayout::getTypeABISize}. */
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

    /** Computes the call frame alignment of a type in bytes for a target. See the method {@code llvm::DataLayout::getTypeABISize}. */
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

    /** Computes the preferred alignment of a type in bytes for a target. See the method {@code llvm::DataLayout::getTypeABISize}. */
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

    /** Computes the preferred alignment of a global variable in bytes for a target. See the method {@code llvm::DataLayout::getPreferredAlignment}. */
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

    /** Computes the structure element that contains the byte offset for a target. See the method {@code llvm::StructLayout::getElementContainingOffset}. */
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

    /** Computes the byte offset of the indexed struct element for a target. See the method {@code llvm::StructLayout::getElementContainingOffset}. */
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