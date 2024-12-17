/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class LibCStdio {

    static { Library.initialize(); }

    protected LibCStdio() {
        throw new UnsupportedOperationException();
    }

    // --- [ sscanf ] ---

    @NativeType("void *")
    private static native long sscanf();

    /** {@code void * sscanf(void)} */
    public static final long sscanf = sscanf();

    // --- [ vsscanf ] ---

    /** {@code int vsscanf(char const * buffer, char const * format, va_list vlist)} */
    public static native int nvsscanf(long buffer, long format, long vlist);

    /** {@code int vsscanf(char const * buffer, char const * format, va_list vlist)} */
    public static int vsscanf(@NativeType("char const *") ByteBuffer buffer, @NativeType("char const *") ByteBuffer format, @NativeType("va_list") long vlist) {
        if (CHECKS) {
            checkNT1(buffer);
            checkNT1(format);
            check(vlist);
        }
        return nvsscanf(memAddress(buffer), memAddress(format), vlist);
    }

    /** {@code int vsscanf(char const * buffer, char const * format, va_list vlist)} */
    public static int vsscanf(@NativeType("char const *") CharSequence buffer, @NativeType("char const *") CharSequence format, @NativeType("va_list") long vlist) {
        if (CHECKS) {
            check(vlist);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(buffer, true);
            long bufferEncoded = stack.getPointerAddress();
            stack.nASCII(format, true);
            long formatEncoded = stack.getPointerAddress();
            return nvsscanf(bufferEncoded, formatEncoded, vlist);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ snprintf ] ---

    @NativeType("void *")
    private static native long snprintf();

    /** {@code void * snprintf(void)} */
    public static final long snprintf = snprintf();

    // --- [ vsnprintf ] ---

    /** {@code int vsnprintf(char * buffer, size_t buf_size, char const * format, va_list vlist)} */
    public static native int nvsnprintf(long buffer, long buf_size, long format, long vlist);

    /** {@code int vsnprintf(char * buffer, size_t buf_size, char const * format, va_list vlist)} */
    public static int vsnprintf(@NativeType("char *") @Nullable ByteBuffer buffer, @NativeType("char const *") ByteBuffer format, @NativeType("va_list") long vlist) {
        if (CHECKS) {
            checkNT1(format);
            check(vlist);
        }
        return nvsnprintf(memAddressSafe(buffer), remainingSafe(buffer), memAddress(format), vlist);
    }

    /** {@code int vsnprintf(char * buffer, size_t buf_size, char const * format, va_list vlist)} */
    public static int vsnprintf(@NativeType("char *") @Nullable ByteBuffer buffer, @NativeType("char const *") CharSequence format, @NativeType("va_list") long vlist) {
        if (CHECKS) {
            check(vlist);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(format, true);
            long formatEncoded = stack.getPointerAddress();
            return nvsnprintf(memAddressSafe(buffer), remainingSafe(buffer), formatEncoded, vlist);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}