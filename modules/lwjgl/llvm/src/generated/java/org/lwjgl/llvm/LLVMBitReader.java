/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class LLVMBitReader {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ParseBitcode               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMParseBitcode"),
            ParseBitcode2              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMParseBitcode2"),
            ParseBitcodeInContext      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMParseBitcodeInContext"),
            ParseBitcodeInContext2     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMParseBitcodeInContext2"),
            GetBitcodeModuleInContext  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetBitcodeModuleInContext"),
            GetBitcodeModuleInContext2 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetBitcodeModuleInContext2"),
            GetBitcodeModule           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetBitcodeModule"),
            GetBitcodeModule2          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetBitcodeModule2");

    }

    protected LLVMBitReader() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMParseBitcode ] ---

    /** {@code LLVMBool LLVMParseBitcode(LLVMMemoryBufferRef MemBuf, LLVMModuleRef * OutModule, char ** OutMessage)} */
    public static int nLLVMParseBitcode(long MemBuf, long OutModule, long OutMessage) {
        long __functionAddress = Functions.ParseBitcode;
        if (CHECKS) {
            check(MemBuf);
        }
        return invokePPPI(MemBuf, OutModule, OutMessage, __functionAddress);
    }

    /** {@code LLVMBool LLVMParseBitcode(LLVMMemoryBufferRef MemBuf, LLVMModuleRef * OutModule, char ** OutMessage)} */
    @NativeType("LLVMBool")
    public static boolean LLVMParseBitcode(@NativeType("LLVMMemoryBufferRef") long MemBuf, @NativeType("LLVMModuleRef *") PointerBuffer OutModule, @NativeType("char **") PointerBuffer OutMessage) {
        if (CHECKS) {
            check(OutModule, 1);
            check(OutMessage, 1);
        }
        return nLLVMParseBitcode(MemBuf, memAddress(OutModule), memAddress(OutMessage)) != 0;
    }

    // --- [ LLVMParseBitcode2 ] ---

    /** {@code LLVMBool LLVMParseBitcode2(LLVMMemoryBufferRef MemBuf, LLVMModuleRef * OutModule)} */
    public static int nLLVMParseBitcode2(long MemBuf, long OutModule) {
        long __functionAddress = Functions.ParseBitcode2;
        if (CHECKS) {
            check(MemBuf);
        }
        return invokePPI(MemBuf, OutModule, __functionAddress);
    }

    /** {@code LLVMBool LLVMParseBitcode2(LLVMMemoryBufferRef MemBuf, LLVMModuleRef * OutModule)} */
    @NativeType("LLVMBool")
    public static boolean LLVMParseBitcode2(@NativeType("LLVMMemoryBufferRef") long MemBuf, @NativeType("LLVMModuleRef *") PointerBuffer OutModule) {
        if (CHECKS) {
            check(OutModule, 1);
        }
        return nLLVMParseBitcode2(MemBuf, memAddress(OutModule)) != 0;
    }

    // --- [ LLVMParseBitcodeInContext ] ---

    /** {@code LLVMBool LLVMParseBitcodeInContext(LLVMContextRef ContextRef, LLVMMemoryBufferRef MemBuf, LLVMModuleRef * OutModule, char ** OutMessage)} */
    public static int nLLVMParseBitcodeInContext(long ContextRef, long MemBuf, long OutModule, long OutMessage) {
        long __functionAddress = Functions.ParseBitcodeInContext;
        if (CHECKS) {
            check(ContextRef);
            check(MemBuf);
        }
        return invokePPPPI(ContextRef, MemBuf, OutModule, OutMessage, __functionAddress);
    }

    /** {@code LLVMBool LLVMParseBitcodeInContext(LLVMContextRef ContextRef, LLVMMemoryBufferRef MemBuf, LLVMModuleRef * OutModule, char ** OutMessage)} */
    @NativeType("LLVMBool")
    public static boolean LLVMParseBitcodeInContext(@NativeType("LLVMContextRef") long ContextRef, @NativeType("LLVMMemoryBufferRef") long MemBuf, @NativeType("LLVMModuleRef *") PointerBuffer OutModule, @NativeType("char **") PointerBuffer OutMessage) {
        if (CHECKS) {
            check(OutModule, 1);
            check(OutMessage, 1);
        }
        return nLLVMParseBitcodeInContext(ContextRef, MemBuf, memAddress(OutModule), memAddress(OutMessage)) != 0;
    }

    // --- [ LLVMParseBitcodeInContext2 ] ---

    /** {@code LLVMBool LLVMParseBitcodeInContext2(LLVMContextRef ContextRef, LLVMMemoryBufferRef MemBuf, LLVMModuleRef * OutModule)} */
    public static int nLLVMParseBitcodeInContext2(long ContextRef, long MemBuf, long OutModule) {
        long __functionAddress = Functions.ParseBitcodeInContext2;
        if (CHECKS) {
            check(ContextRef);
            check(MemBuf);
        }
        return invokePPPI(ContextRef, MemBuf, OutModule, __functionAddress);
    }

    /** {@code LLVMBool LLVMParseBitcodeInContext2(LLVMContextRef ContextRef, LLVMMemoryBufferRef MemBuf, LLVMModuleRef * OutModule)} */
    @NativeType("LLVMBool")
    public static boolean LLVMParseBitcodeInContext2(@NativeType("LLVMContextRef") long ContextRef, @NativeType("LLVMMemoryBufferRef") long MemBuf, @NativeType("LLVMModuleRef *") PointerBuffer OutModule) {
        if (CHECKS) {
            check(OutModule, 1);
        }
        return nLLVMParseBitcodeInContext2(ContextRef, MemBuf, memAddress(OutModule)) != 0;
    }

    // --- [ LLVMGetBitcodeModuleInContext ] ---

    /** {@code LLVMBool LLVMGetBitcodeModuleInContext(LLVMContextRef ContextRef, LLVMMemoryBufferRef MemBuf, LLVMModuleRef * OutM, char ** OutMessage)} */
    public static int nLLVMGetBitcodeModuleInContext(long ContextRef, long MemBuf, long OutM, long OutMessage) {
        long __functionAddress = Functions.GetBitcodeModuleInContext;
        if (CHECKS) {
            check(ContextRef);
            check(MemBuf);
        }
        return invokePPPPI(ContextRef, MemBuf, OutM, OutMessage, __functionAddress);
    }

    /** {@code LLVMBool LLVMGetBitcodeModuleInContext(LLVMContextRef ContextRef, LLVMMemoryBufferRef MemBuf, LLVMModuleRef * OutM, char ** OutMessage)} */
    @NativeType("LLVMBool")
    public static boolean LLVMGetBitcodeModuleInContext(@NativeType("LLVMContextRef") long ContextRef, @NativeType("LLVMMemoryBufferRef") long MemBuf, @NativeType("LLVMModuleRef *") PointerBuffer OutM, @NativeType("char **") PointerBuffer OutMessage) {
        if (CHECKS) {
            check(OutM, 1);
            check(OutMessage, 1);
        }
        return nLLVMGetBitcodeModuleInContext(ContextRef, MemBuf, memAddress(OutM), memAddress(OutMessage)) != 0;
    }

    // --- [ LLVMGetBitcodeModuleInContext2 ] ---

    /** {@code LLVMBool LLVMGetBitcodeModuleInContext2(LLVMContextRef ContextRef, LLVMMemoryBufferRef MemBuf, LLVMModuleRef * OutM)} */
    public static int nLLVMGetBitcodeModuleInContext2(long ContextRef, long MemBuf, long OutM) {
        long __functionAddress = Functions.GetBitcodeModuleInContext2;
        if (CHECKS) {
            check(ContextRef);
            check(MemBuf);
        }
        return invokePPPI(ContextRef, MemBuf, OutM, __functionAddress);
    }

    /** {@code LLVMBool LLVMGetBitcodeModuleInContext2(LLVMContextRef ContextRef, LLVMMemoryBufferRef MemBuf, LLVMModuleRef * OutM)} */
    @NativeType("LLVMBool")
    public static boolean LLVMGetBitcodeModuleInContext2(@NativeType("LLVMContextRef") long ContextRef, @NativeType("LLVMMemoryBufferRef") long MemBuf, @NativeType("LLVMModuleRef *") PointerBuffer OutM) {
        if (CHECKS) {
            check(OutM, 1);
        }
        return nLLVMGetBitcodeModuleInContext2(ContextRef, MemBuf, memAddress(OutM)) != 0;
    }

    // --- [ LLVMGetBitcodeModule ] ---

    /** {@code LLVMBool LLVMGetBitcodeModule(LLVMMemoryBufferRef MemBuf, LLVMModuleRef * OutM, char ** OutMessage)} */
    public static int nLLVMGetBitcodeModule(long MemBuf, long OutM, long OutMessage) {
        long __functionAddress = Functions.GetBitcodeModule;
        if (CHECKS) {
            check(MemBuf);
        }
        return invokePPPI(MemBuf, OutM, OutMessage, __functionAddress);
    }

    /** {@code LLVMBool LLVMGetBitcodeModule(LLVMMemoryBufferRef MemBuf, LLVMModuleRef * OutM, char ** OutMessage)} */
    @NativeType("LLVMBool")
    public static boolean LLVMGetBitcodeModule(@NativeType("LLVMMemoryBufferRef") long MemBuf, @NativeType("LLVMModuleRef *") PointerBuffer OutM, @NativeType("char **") PointerBuffer OutMessage) {
        if (CHECKS) {
            check(OutM, 1);
            check(OutMessage, 1);
        }
        return nLLVMGetBitcodeModule(MemBuf, memAddress(OutM), memAddress(OutMessage)) != 0;
    }

    // --- [ LLVMGetBitcodeModule2 ] ---

    /** {@code LLVMBool LLVMGetBitcodeModule2(LLVMMemoryBufferRef MemBuf, LLVMModuleRef * OutM)} */
    public static int nLLVMGetBitcodeModule2(long MemBuf, long OutM) {
        long __functionAddress = Functions.GetBitcodeModule2;
        if (CHECKS) {
            check(MemBuf);
        }
        return invokePPI(MemBuf, OutM, __functionAddress);
    }

    /** {@code LLVMBool LLVMGetBitcodeModule2(LLVMMemoryBufferRef MemBuf, LLVMModuleRef * OutM)} */
    @NativeType("LLVMBool")
    public static boolean LLVMGetBitcodeModule2(@NativeType("LLVMMemoryBufferRef") long MemBuf, @NativeType("LLVMModuleRef *") PointerBuffer OutM) {
        if (CHECKS) {
            check(OutM, 1);
        }
        return nLLVMGetBitcodeModule2(MemBuf, memAddress(OutM)) != 0;
    }

}