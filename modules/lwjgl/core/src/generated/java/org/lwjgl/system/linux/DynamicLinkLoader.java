/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class DynamicLinkLoader {

    static { Library.initialize(); }

    public static final int
        RTLD_LAZY         = 0x1,
        RTLD_NOW          = 0x2,
        RTLD_BINDING_MASK = 0x3,
        RTLD_NOLOAD       = 0x4,
        RTLD_DEEPBIND     = 0x8;

    public static final int
        RTLD_GLOBAL   = 0x100,
        RTLD_LOCAL    = 0,
        RTLD_NODELETE = 0x1000;

    protected DynamicLinkLoader() {
        throw new UnsupportedOperationException();
    }

    // --- [ dlopen ] ---

    /** {@code void * dlopen(char const * filename, int mode)} */
    public static native long ndlopen(long filename, int mode);

    /** {@code void * dlopen(char const * filename, int mode)} */
    @NativeType("void *")
    public static long dlopen(@NativeType("char const *") @Nullable ByteBuffer filename, int mode) {
        if (CHECKS) {
            checkNT1Safe(filename);
        }
        return ndlopen(memAddressSafe(filename), mode);
    }

    /** {@code void * dlopen(char const * filename, int mode)} */
    @NativeType("void *")
    public static long dlopen(@NativeType("char const *") @Nullable CharSequence filename, int mode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(filename, true);
            long filenameEncoded = filename == null ? NULL : stack.getPointerAddress();
            return ndlopen(filenameEncoded, mode);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ dlerror ] ---

    /** {@code char * dlerror(void)} */
    public static native long ndlerror();

    /** {@code char * dlerror(void)} */
    @NativeType("char *")
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