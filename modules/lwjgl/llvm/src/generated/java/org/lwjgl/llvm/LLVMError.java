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
            CreateStringError    = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMCreateStringError");

    }

    public static final int LLVMErrorSuccess = 0;

    protected LLVMError() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMGetErrorTypeId ] ---

    /** {@code LLVMErrorTypeId LLVMGetErrorTypeId(LLVMErrorRef Err)} */
    @NativeType("LLVMErrorTypeId")
    public static long LLVMGetErrorTypeId(@NativeType("LLVMErrorRef") long Err) {
        long __functionAddress = Functions.GetErrorTypeId;
        if (CHECKS) {
            check(Err);
        }
        return invokePP(Err, __functionAddress);
    }

    // --- [ LLVMConsumeError ] ---

    /** {@code void LLVMConsumeError(LLVMErrorRef Err)} */
    public static void LLVMConsumeError(@NativeType("LLVMErrorRef") long Err) {
        long __functionAddress = Functions.ConsumeError;
        if (CHECKS) {
            check(Err);
        }
        invokePV(Err, __functionAddress);
    }

    // --- [ LLVMGetErrorMessage ] ---

    /** {@code char * LLVMGetErrorMessage(LLVMErrorRef Err)} */
    public static long nLLVMGetErrorMessage(long Err) {
        long __functionAddress = Functions.GetErrorMessage;
        if (CHECKS) {
            check(Err);
        }
        return invokePP(Err, __functionAddress);
    }

    /** {@code char * LLVMGetErrorMessage(LLVMErrorRef Err)} */
    @NativeType("char *")
    public static @Nullable ByteBuffer LLVMGetErrorMessage(@NativeType("LLVMErrorRef") long Err) {
        long __result = nLLVMGetErrorMessage(Err);
        return memByteBufferNT1Safe(__result);
    }

    // --- [ LLVMDisposeErrorMessage ] ---

    /** {@code void LLVMDisposeErrorMessage(char * ErrMsg)} */
    public static void nLLVMDisposeErrorMessage(long ErrMsg) {
        long __functionAddress = Functions.DisposeErrorMessage;
        invokePV(ErrMsg, __functionAddress);
    }

    /** {@code void LLVMDisposeErrorMessage(char * ErrMsg)} */
    public static void LLVMDisposeErrorMessage(@NativeType("char *") ByteBuffer ErrMsg) {
        nLLVMDisposeErrorMessage(memAddress(ErrMsg));
    }

    // --- [ LLVMGetStringErrorTypeId ] ---

    /** {@code LLVMErrorTypeId LLVMGetStringErrorTypeId(void)} */
    @NativeType("LLVMErrorTypeId")
    public static long LLVMGetStringErrorTypeId() {
        long __functionAddress = Functions.GetStringErrorTypeId;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMCreateStringError ] ---

    /** {@code LLVMErrorRef LLVMCreateStringError(char const * ErrMsg)} */
    public static long nLLVMCreateStringError(long ErrMsg) {
        long __functionAddress = Functions.CreateStringError;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePP(ErrMsg, __functionAddress);
    }

    /** {@code LLVMErrorRef LLVMCreateStringError(char const * ErrMsg)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMCreateStringError(@NativeType("char const *") ByteBuffer ErrMsg) {
        if (CHECKS) {
            checkNT1(ErrMsg);
        }
        return nLLVMCreateStringError(memAddress(ErrMsg));
    }

    /** {@code LLVMErrorRef LLVMCreateStringError(char const * ErrMsg)} */
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