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

    /** Unsafe version of: {@link #LLVMParseBitcode ParseBitcode} */
    public static int nLLVMParseBitcode(long MemBuf, long OutModule, long OutMessage) {
        long __functionAddress = Functions.ParseBitcode;
        if (CHECKS) {
            check(MemBuf);
        }
        return invokePPPI(MemBuf, OutModule, OutMessage, __functionAddress);
    }

    /**
     * Builds a module from the bitcode in the specified memory buffer, returning a reference to the module via the {@code OutModule} parameter. Returns 0 on
     * success. Optionally returns a human-readable error message via {@code OutMessage}.
     * 
     * <p>This is deprecated. Use LLVMParseBitcode2.</p>
     */
    @NativeType("LLVMBool")
    public static boolean LLVMParseBitcode(@NativeType("LLVMMemoryBufferRef") long MemBuf, @NativeType("LLVMModuleRef *") PointerBuffer OutModule, @NativeType("char **") PointerBuffer OutMessage) {
        if (CHECKS) {
            check(OutModule, 1);
            check(OutMessage, 1);
        }
        return nLLVMParseBitcode(MemBuf, memAddress(OutModule), memAddress(OutMessage)) != 0;
    }

    // --- [ LLVMParseBitcode2 ] ---

    /** Unsafe version of: {@link #LLVMParseBitcode2 ParseBitcode2} */
    public static int nLLVMParseBitcode2(long MemBuf, long OutModule) {
        long __functionAddress = Functions.ParseBitcode2;
        if (CHECKS) {
            check(MemBuf);
        }
        return invokePPI(MemBuf, OutModule, __functionAddress);
    }

    /**
     * Builds a module from the bitcode in the specified memory buffer, returning a reference to the module via the {@code OutModule} parameter. Returns 0 on
     * success.
     */
    @NativeType("LLVMBool")
    public static boolean LLVMParseBitcode2(@NativeType("LLVMMemoryBufferRef") long MemBuf, @NativeType("LLVMModuleRef *") PointerBuffer OutModule) {
        if (CHECKS) {
            check(OutModule, 1);
        }
        return nLLVMParseBitcode2(MemBuf, memAddress(OutModule)) != 0;
    }

    // --- [ LLVMParseBitcodeInContext ] ---

    /** Unsafe version of: {@link #LLVMParseBitcodeInContext ParseBitcodeInContext} */
    public static int nLLVMParseBitcodeInContext(long ContextRef, long MemBuf, long OutModule, long OutMessage) {
        long __functionAddress = Functions.ParseBitcodeInContext;
        if (CHECKS) {
            check(ContextRef);
            check(MemBuf);
        }
        return invokePPPPI(ContextRef, MemBuf, OutModule, OutMessage, __functionAddress);
    }

    /** This is deprecated. Use {@link #LLVMParseBitcodeInContext2 ParseBitcodeInContext2}. */
    @NativeType("LLVMBool")
    public static boolean LLVMParseBitcodeInContext(@NativeType("LLVMContextRef") long ContextRef, @NativeType("LLVMMemoryBufferRef") long MemBuf, @NativeType("LLVMModuleRef *") PointerBuffer OutModule, @NativeType("char **") PointerBuffer OutMessage) {
        if (CHECKS) {
            check(OutModule, 1);
            check(OutMessage, 1);
        }
        return nLLVMParseBitcodeInContext(ContextRef, MemBuf, memAddress(OutModule), memAddress(OutMessage)) != 0;
    }

    // --- [ LLVMParseBitcodeInContext2 ] ---

    public static int nLLVMParseBitcodeInContext2(long ContextRef, long MemBuf, long OutModule) {
        long __functionAddress = Functions.ParseBitcodeInContext2;
        if (CHECKS) {
            check(ContextRef);
            check(MemBuf);
        }
        return invokePPPI(ContextRef, MemBuf, OutModule, __functionAddress);
    }

    @NativeType("LLVMBool")
    public static boolean LLVMParseBitcodeInContext2(@NativeType("LLVMContextRef") long ContextRef, @NativeType("LLVMMemoryBufferRef") long MemBuf, @NativeType("LLVMModuleRef *") PointerBuffer OutModule) {
        if (CHECKS) {
            check(OutModule, 1);
        }
        return nLLVMParseBitcodeInContext2(ContextRef, MemBuf, memAddress(OutModule)) != 0;
    }

    // --- [ LLVMGetBitcodeModuleInContext ] ---

    /** Unsafe version of: {@link #LLVMGetBitcodeModuleInContext GetBitcodeModuleInContext} */
    public static int nLLVMGetBitcodeModuleInContext(long ContextRef, long MemBuf, long OutM, long OutMessage) {
        long __functionAddress = Functions.GetBitcodeModuleInContext;
        if (CHECKS) {
            check(ContextRef);
            check(MemBuf);
        }
        return invokePPPPI(ContextRef, MemBuf, OutM, OutMessage, __functionAddress);
    }

    /**
     * Reads a module from the specified path, returning via the {@code OutMP} parameter a module provider which performs lazy deserialization. Returns 0 on
     * success. Optionally returns a human-readable error message via {@code OutMessage}. This is deprecated. Use {@link #LLVMGetBitcodeModuleInContext2 GetBitcodeModuleInContext2}.
     */
    @NativeType("LLVMBool")
    public static boolean LLVMGetBitcodeModuleInContext(@NativeType("LLVMContextRef") long ContextRef, @NativeType("LLVMMemoryBufferRef") long MemBuf, @NativeType("LLVMModuleRef *") PointerBuffer OutM, @NativeType("char **") PointerBuffer OutMessage) {
        if (CHECKS) {
            check(OutM, 1);
            check(OutMessage, 1);
        }
        return nLLVMGetBitcodeModuleInContext(ContextRef, MemBuf, memAddress(OutM), memAddress(OutMessage)) != 0;
    }

    // --- [ LLVMGetBitcodeModuleInContext2 ] ---

    /** Unsafe version of: {@link #LLVMGetBitcodeModuleInContext2 GetBitcodeModuleInContext2} */
    public static int nLLVMGetBitcodeModuleInContext2(long ContextRef, long MemBuf, long OutM) {
        long __functionAddress = Functions.GetBitcodeModuleInContext2;
        if (CHECKS) {
            check(ContextRef);
            check(MemBuf);
        }
        return invokePPPI(ContextRef, MemBuf, OutM, __functionAddress);
    }

    /**
     * Reads a module from the specified path, returning via the {@code OutMP} parameter a module provider which performs lazy deserialization. Returns 0 on
     * success.
     */
    @NativeType("LLVMBool")
    public static boolean LLVMGetBitcodeModuleInContext2(@NativeType("LLVMContextRef") long ContextRef, @NativeType("LLVMMemoryBufferRef") long MemBuf, @NativeType("LLVMModuleRef *") PointerBuffer OutM) {
        if (CHECKS) {
            check(OutM, 1);
        }
        return nLLVMGetBitcodeModuleInContext2(ContextRef, MemBuf, memAddress(OutM)) != 0;
    }

    // --- [ LLVMGetBitcodeModule ] ---

    /** Unsafe version of: {@link #LLVMGetBitcodeModule GetBitcodeModule} */
    public static int nLLVMGetBitcodeModule(long MemBuf, long OutM, long OutMessage) {
        long __functionAddress = Functions.GetBitcodeModule;
        if (CHECKS) {
            check(MemBuf);
        }
        return invokePPPI(MemBuf, OutM, OutMessage, __functionAddress);
    }

    /** This is deprecated. Use {@link #LLVMGetBitcodeModule2 GetBitcodeModule2}. */
    @NativeType("LLVMBool")
    public static boolean LLVMGetBitcodeModule(@NativeType("LLVMMemoryBufferRef") long MemBuf, @NativeType("LLVMModuleRef *") PointerBuffer OutM, @NativeType("char **") PointerBuffer OutMessage) {
        if (CHECKS) {
            check(OutM, 1);
            check(OutMessage, 1);
        }
        return nLLVMGetBitcodeModule(MemBuf, memAddress(OutM), memAddress(OutMessage)) != 0;
    }

    // --- [ LLVMGetBitcodeModule2 ] ---

    public static int nLLVMGetBitcodeModule2(long MemBuf, long OutM) {
        long __functionAddress = Functions.GetBitcodeModule2;
        if (CHECKS) {
            check(MemBuf);
        }
        return invokePPI(MemBuf, OutM, __functionAddress);
    }

    @NativeType("LLVMBool")
    public static boolean LLVMGetBitcodeModule2(@NativeType("LLVMMemoryBufferRef") long MemBuf, @NativeType("LLVMModuleRef *") PointerBuffer OutM) {
        if (CHECKS) {
            check(OutM, 1);
        }
        return nLLVMGetBitcodeModule2(MemBuf, memAddress(OutM)) != 0;
    }

}