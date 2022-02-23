/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to &lt;dlfcn.h&gt;. */
public class DynamicLinkLoader {

    static { Library.initialize(); }

    /** The {@code mode} argument to {@link #dlopen} contains one of the following. */
    public static final int
        RTLD_LAZY         = 0x1,
        RTLD_NOW          = 0x2,
        RTLD_BINDING_MASK = 0x3,
        RTLD_NOLOAD       = 0x4,
        RTLD_DEEPBIND     = 0x8;

    /**
     * If the following bit is set in the {@code mode} argument to {@link #dlopen}, the symbols of the loaded object and its dependencies are made visible as
     * if the object were linked directly into the program.
     */
    public static final int RTLD_GLOBAL = 0x100;

    /**
     * Unix98 demands the following flag which is the inverse to {@link #RTLD_GLOBAL}. The implementation does this by default and so we can define the value
     * to zero.
     */
    public static final int RTLD_LOCAL = 0;

    /** Do not delete object when closed. */
    public static final int RTLD_NODELETE = 0x1000;

    protected DynamicLinkLoader() {
        throw new UnsupportedOperationException();
    }

    // --- [ dlopen ] ---

    /** Unsafe version of: {@link #dlopen} */
    public static native long ndlopen(long filename, int mode);

    /**
     * Loads the dynamic library file named by the null-terminated string {@code filename} and returns an opaque "handle" for the dynamic library. If
     * {@code filename} is {@code NULL}, then the returned handle is for the main program.
     *
     * @param filename the name of the dynamic library to open, or {@code NULL}
     * @param mode     a bitfield. One or more of:<br><table><tr><td>{@link #RTLD_LAZY}</td><td>{@link #RTLD_NOW}</td><td>{@link #RTLD_BINDING_MASK}</td><td>{@link #RTLD_NOLOAD}</td><td>{@link #RTLD_DEEPBIND}</td><td>{@link #RTLD_GLOBAL}</td></tr><tr><td>{@link #RTLD_LOCAL}</td><td>{@link #RTLD_NODELETE}</td></tr></table>
     */
    @NativeType("void *")
    public static long dlopen(@Nullable @NativeType("char const *") ByteBuffer filename, int mode) {
        if (CHECKS) {
            checkNT1Safe(filename);
        }
        return ndlopen(memAddressSafe(filename), mode);
    }

    /**
     * Loads the dynamic library file named by the null-terminated string {@code filename} and returns an opaque "handle" for the dynamic library. If
     * {@code filename} is {@code NULL}, then the returned handle is for the main program.
     *
     * @param filename the name of the dynamic library to open, or {@code NULL}
     * @param mode     a bitfield. One or more of:<br><table><tr><td>{@link #RTLD_LAZY}</td><td>{@link #RTLD_NOW}</td><td>{@link #RTLD_BINDING_MASK}</td><td>{@link #RTLD_NOLOAD}</td><td>{@link #RTLD_DEEPBIND}</td><td>{@link #RTLD_GLOBAL}</td></tr><tr><td>{@link #RTLD_LOCAL}</td><td>{@link #RTLD_NODELETE}</td></tr></table>
     */
    @NativeType("void *")
    public static long dlopen(@Nullable @NativeType("char const *") CharSequence filename, int mode) {
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

    /** Unsafe version of: {@link #dlerror} */
    public static native long ndlerror();

    /**
     * Returns a human readable string describing the most recent error that occurred from {@link #dlopen}, {@link #dlsym} or {@link #dlclose} since
     * the last call to {@code dlerror()}. It returns {@code NULL} if no errors have occurred since initialization or since it was last called.
     */
    @Nullable
    @NativeType("char *")
    public static String dlerror() {
        long __result = ndlerror();
        return memUTF8Safe(__result);
    }

    // --- [ dlsym ] ---

    /** Unsafe version of: {@link #dlsym} */
    public static native long ndlsym(long handle, long name);

    /**
     * Takes a "handle" of a dynamic library returned by {@link #dlopen} and the null-terminated symbol name, returning the address where that symbol is loaded
     * into memory. If the symbol is not found, in the specified library or any of the libraries that were automatically loaded by {@link #dlopen} when that
     * library was loaded, {@code dlsym()} returns {@code NULL}.
     *
     * @param handle the dynamic library handle
     * @param name   the symbol name
     */
    @NativeType("void *")
    public static long dlsym(@NativeType("void *") long handle, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            check(handle);
            checkNT1(name);
        }
        return ndlsym(handle, memAddress(name));
    }

    /**
     * Takes a "handle" of a dynamic library returned by {@link #dlopen} and the null-terminated symbol name, returning the address where that symbol is loaded
     * into memory. If the symbol is not found, in the specified library or any of the libraries that were automatically loaded by {@link #dlopen} when that
     * library was loaded, {@code dlsym()} returns {@code NULL}.
     *
     * @param handle the dynamic library handle
     * @param name   the symbol name
     */
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

    /** Unsafe version of: {@link #dlclose} */
    public static native int ndlclose(long handle);

    /**
     * Decrements the reference count on the dynamic library handle handle. If the reference count drops to zero and no other loaded libraries use symbols in
     * it, then the dynamic library is unloaded.
     *
     * @param handle the dynamic library to close
     */
    public static int dlclose(@NativeType("void *") long handle) {
        if (CHECKS) {
            check(handle);
        }
        return ndlclose(handle);
    }

}