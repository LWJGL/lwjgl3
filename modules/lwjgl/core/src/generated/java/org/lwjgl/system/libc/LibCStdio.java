/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to stdio.h. */
public class LibCStdio {

    static { Library.initialize(); }

    protected LibCStdio() {
        throw new UnsupportedOperationException();
    }

    // --- [ sscanf ] ---

    @NativeType("void *")
    private static native long sscanf();

    /** The address of the {@code sscanf} function. */
    public static final long sscanf = sscanf();

    // --- [ vsscanf ] ---

    /** Unsafe version of: {@link #vsscanf} */
    public static native int nvsscanf(long buffer, long format, long vlist);

    /**
     * Reads data from the null-terminated character string {@code buffer}, interprets it according to {@code format} and stores the results into locations
     * defined by {@code vlist}.
     *
     * @param buffer pointer to a null-terminated character string to read from
     * @param format pointer to a null-terminated character string specifying how to read the input
     * @param vlist  variable argument list containing the receiving arguments
     *
     * @return the number of receiving arguments successfully assigned, or {@code EOF} if read failure occurs before the first receiving argument was assigned
     */
    public static int vsscanf(@NativeType("char const *") ByteBuffer buffer, @NativeType("char const *") ByteBuffer format, @NativeType("va_list") long vlist) {
        if (CHECKS) {
            checkNT1(buffer);
            checkNT1(format);
            check(vlist);
        }
        return nvsscanf(memAddress(buffer), memAddress(format), vlist);
    }

    /**
     * Reads data from the null-terminated character string {@code buffer}, interprets it according to {@code format} and stores the results into locations
     * defined by {@code vlist}.
     *
     * @param buffer pointer to a null-terminated character string to read from
     * @param format pointer to a null-terminated character string specifying how to read the input
     * @param vlist  variable argument list containing the receiving arguments
     *
     * @return the number of receiving arguments successfully assigned, or {@code EOF} if read failure occurs before the first receiving argument was assigned
     */
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

    /** The address of the {@code snprintf} function. */
    public static final long snprintf = snprintf();

    // --- [ vsnprintf ] ---

    /**
     * Unsafe version of: {@link #vsnprintf}
     *
     * @param buf_size up to {@code buf_size - 1} characters may be written, plus the null terminator
     */
    public static native int nvsnprintf(long buffer, long buf_size, long format, long vlist);

    /**
     * Loads the data from the locations, defined by {@code vlist}, converts them to character string equivalents and writes the results to a character string
     * buffer.
     *
     * @param buffer pointer to a character string to write to
     * @param format pointer to a null-terminated character string specifying how to interpret the data
     * @param vlist  variable argument list containing the data to print
     *
     * @return the number of characters written if successful or negative value if an error occurred. If the resulting string gets truncated due to {@code buf_size}
     *         limit, function returns the total number of characters (not including the terminating null-byte) which would have been written, if the limit was not
     *         imposed.
     */
    public static int vsnprintf(@Nullable @NativeType("char *") ByteBuffer buffer, @NativeType("char const *") ByteBuffer format, @NativeType("va_list") long vlist) {
        if (CHECKS) {
            checkNT1(format);
            check(vlist);
        }
        return nvsnprintf(memAddressSafe(buffer), remainingSafe(buffer), memAddress(format), vlist);
    }

    /**
     * Loads the data from the locations, defined by {@code vlist}, converts them to character string equivalents and writes the results to a character string
     * buffer.
     *
     * @param buffer pointer to a character string to write to
     * @param format pointer to a null-terminated character string specifying how to interpret the data
     * @param vlist  variable argument list containing the data to print
     *
     * @return the number of characters written if successful or negative value if an error occurred. If the resulting string gets truncated due to {@code buf_size}
     *         limit, function returns the total number of characters (not including the terminating null-byte) which would have been written, if the limit was not
     *         imposed.
     */
    public static int vsnprintf(@Nullable @NativeType("char *") ByteBuffer buffer, @NativeType("char const *") CharSequence format, @NativeType("va_list") long vlist) {
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