/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class DynamicLinkLoader {

    static { Library.initialize(); }

    public static final int
        RTLD_LAZY   = 0x1,
        RTLD_NOW    = 0x2,
        RTLD_LOCAL  = 0x4,
        RTLD_GLOBAL = 0x8;

    public static final long
        RTLD_NEXT      = 0xFFFFFFFFFFFFFFFFL,
        RTLD_DEFAULT   = 0xFFFFFFFFFFFFFFFEL,
        RTLD_SELF      = 0xFFFFFFFFFFFFFFFDL,
        RTLD_MAIN_ONLY = 0xFFFFFFFFFFFFFFFBL;

    protected DynamicLinkLoader() {
        throw new UnsupportedOperationException();
    }

    // --- [ dlopen ] ---

    /** {@code void * dlopen(char const * path, int mode)} */
    public static native long ndlopen(long path, int mode);

    /** {@code void * dlopen(char const * path, int mode)} */
    @NativeType("void *")
    public static long dlopen(@NativeType("char const *") @Nullable ByteBuffer path, int mode) {
        if (CHECKS) {
            checkNT1Safe(path);
        }
        return ndlopen(memAddressSafe(path), mode);
    }

    /** {@code void * dlopen(char const * path, int mode)} */
    @NativeType("void *")
    public static long dlopen(@NativeType("char const *") @Nullable CharSequence path, int mode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(path, true);
            long pathEncoded = path == null ? NULL : stack.getPointerAddress();
            return ndlopen(pathEncoded, mode);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ dlerror ] ---

    /** {@code char const * dlerror(void)} */
    public static native long ndlerror();

    /** {@code char const * dlerror(void)} */
    @NativeType("char const *")
    public static @Nullable String dlerror() {
        long __result = ndlerror();
        return memUTF8Safe(__result);
    }

    // --- [ dlsym ] ---

    /** {@code void * dlsym(void * handle, char const * name)} */
    public static native long ndlsym(long handle, long name);

    /** {@code void * dlsym(void * handle, char const * name)} */
    @NativeType("void *")
    public static long dlsym(@NativeType("void *") long handle, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            check(handle);
            checkNT1(name);
        }
        return ndlsym(handle, memAddress(name));
    }

    /** {@code void * dlsym(void * handle, char const * name)} */
    @NativeType("void *")
    public static long dlsym(@NativeType("void *") long handle, @NativeType("char const *") CharSequence name) {
        if (CHECKS) {
            check(handle);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return ndlsym(handle, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ dlclose ] ---

    /** {@code int dlclose(void * handle)} */
    public static native int ndlclose(long handle);

    /** {@code int dlclose(void * handle)} */
    public static int dlclose(@NativeType("void *") long handle) {
        if (CHECKS) {
            check(handle);
        }
        return ndlclose(handle);
    }

}