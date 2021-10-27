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

public class LLVMError {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetErrorTypeId       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetErrorTypeId"),
            ConsumeError         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMConsumeError"),
            GetErrorMessage      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetErrorMessage"),
            DisposeErrorMessage  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDisposeErrorMessage"),
            GetStringErrorTypeId = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetStringErrorTypeId"),
            CreateStringError    = LLVMCore.getLibrary().getFunctionAddress("LLVMCreateStringError");

    }

    public static final int LLVMErrorSuccess = 0;

    protected LLVMError() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMGetErrorTypeId ] ---

    /** Returns the type id for the given error instance, which must be a failure value (i.e. non-null). */
    @NativeType("LLVMErrorTypeId")
    public static long LLVMGetErrorTypeId(@NativeType("LLVMErrorRef") long Err) {
        long __functionAddress = Functions.GetErrorTypeId;
        if (CHECKS) {
            check(Err);
        }
        return invokePP(Err, __functionAddress);
    }

    // --- [ LLVMConsumeError ] ---

    /**
     * Dispose of the given error without handling it.
     * 
     * <p>This operation consumes the error, and the given {@code LLVMErrorRef} value is not usable once this call returns. Note: This method <b>only</b> needs
     * to be called if the error is not being passed to some other consuming operation, e.g. {@link #LLVMGetErrorMessage GetErrorMessage}.</p>
     */
    public static void LLVMConsumeError(@NativeType("LLVMErrorRef") long Err) {
        long __functionAddress = Functions.ConsumeError;
        if (CHECKS) {
            check(Err);
        }
        invokePV(Err, __functionAddress);
    }

    // --- [ LLVMGetErrorMessage ] ---

    /** Unsafe version of: {@link #LLVMGetErrorMessage GetErrorMessage} */
    public static long nLLVMGetErrorMessage(long Err) {
        long __functionAddress = Functions.GetErrorMessage;
        if (CHECKS) {
            check(Err);
        }
        return invokePP(Err, __functionAddress);
    }

    /**
     * Returns the given string's error message.
     * 
     * <p>This operation consumes the error, and the given {@code LLVMErrorRef} value is not usable once this call returns. The caller is responsible for
     * disposing of the string by calling {@link #LLVMDisposeErrorMessage DisposeErrorMessage}.</p>
     */
    @Nullable
    @NativeType("char *")
    public static ByteBuffer LLVMGetErrorMessage(@NativeType("LLVMErrorRef") long Err) {
        long __result = nLLVMGetErrorMessage(Err);
        return memByteBufferNT1Safe(__result);
    }

    // --- [ LLVMDisposeErrorMessage ] ---

    /** Unsafe version of: {@link #LLVMDisposeErrorMessage DisposeErrorMessage} */
    public static void nLLVMDisposeErrorMessage(long ErrMsg) {
        long __functionAddress = Functions.DisposeErrorMessage;
        invokePV(ErrMsg, __functionAddress);
    }

    /** Dispose of the given error message. */
    public static void LLVMDisposeErrorMessage(@NativeType("char *") ByteBuffer ErrMsg) {
        nLLVMDisposeErrorMessage(memAddress(ErrMsg));
    }

    // --- [ LLVMGetStringErrorTypeId ] ---

    /** Returns the type id for llvm {@code StringError}. */
    @NativeType("LLVMErrorTypeId")
    public static long LLVMGetStringErrorTypeId() {
        long __functionAddress = Functions.GetStringErrorTypeId;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMCreateStringError ] ---

    /** Unsafe version of: {@link #LLVMCreateStringError CreateStringError} */
    public static long nLLVMCreateStringError(long ErrMsg) {
        long __functionAddress = Functions.CreateStringError;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePP(ErrMsg, __functionAddress);
    }

    /**
     * Create a {@code StringError}.
     *
     * @since 12
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMCreateStringError(@NativeType("char const *") ByteBuffer ErrMsg) {
        if (CHECKS) {
            checkNT1(ErrMsg);
        }
        return nLLVMCreateStringError(memAddress(ErrMsg));
    }

    /**
     * Create a {@code StringError}.
     *
     * @since 12
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMCreateStringError(@NativeType("char const *") CharSequence ErrMsg) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(ErrMsg, true);
            long ErrMsgEncoded = stack.getPointerAddress();
            return nLLVMCreateStringError(ErrMsgEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}