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

public class LibCLocale {

    static { Library.initialize(); }

    protected LibCLocale() {
        throw new UnsupportedOperationException();
    }

    // --- [ LC_ALL ] ---

    private static native int LC_ALL();

    /** {@code int LC_ALL(void)} */
    public static final int LC_ALL = LC_ALL();

    // --- [ LC_COLLATE ] ---

    private static native int LC_COLLATE();

    /** {@code int LC_COLLATE(void)} */
    public static final int LC_COLLATE = LC_COLLATE();

    // --- [ LC_CTYPE ] ---

    private static native int LC_CTYPE();

    /** {@code int LC_CTYPE(void)} */
    public static final int LC_CTYPE = LC_CTYPE();

    // --- [ LC_MONETARY ] ---

    private static native int LC_MONETARY();

    /** {@code int LC_MONETARY(void)} */
    public static final int LC_MONETARY = LC_MONETARY();

    // --- [ LC_NUMERIC ] ---

    private static native int LC_NUMERIC();

    /** {@code int LC_NUMERIC(void)} */
    public static final int LC_NUMERIC = LC_NUMERIC();

    // --- [ LC_TIME ] ---

    private static native int LC_TIME();

    /** {@code int LC_TIME(void)} */
    public static final int LC_TIME = LC_TIME();

    // --- [ setlocale ] ---

    /** {@code char * setlocale(int category, char const * locale)} */
    public static native long nsetlocale(int category, long locale);

    /** {@code char * setlocale(int category, char const * locale)} */
    @NativeType("char *")
    public static @Nullable String setlocale(int category, @NativeType("char const *") ByteBuffer locale) {
        if (CHECKS) {
            checkNT1(locale);
        }
        long __result = nsetlocale(category, memAddress(locale));
        return memASCIISafe(__result);
    }

    /** {@code char * setlocale(int category, char const * locale)} */
    @NativeType("char *")
    public static @Nullable String setlocale(int category, @NativeType("char const *") CharSequence locale) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(locale, true);
            long localeEncoded = stack.getPointerAddress();
            long __result = nsetlocale(category, localeEncoded);
            return memASCIISafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}