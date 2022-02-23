/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

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
        RTLD_LAZY   = 0x1,
        RTLD_NOW    = 0x2,
        RTLD_LOCAL  = 0x4,
        RTLD_GLOBAL = 0x8;

    /** Special-handle values for {@link #dlsym}. */
    public static final long
        RTLD_NEXT      = 0xFFFFFFFFFFFFFFFFL,
        RTLD_DEFAULT   = 0xFFFFFFFFFFFFFFFEL,
        RTLD_SELF      = 0xFFFFFFFFFFFFFFFDL,
        RTLD_MAIN_ONLY = 0xFFFFFFFFFFFFFFFBL;

    protected DynamicLinkLoader() {
        throw new UnsupportedOperationException();
    }

    // --- [ dlopen ] ---

    /** Unsafe version of: {@link #dlopen} */
    public static native long ndlopen(long path, int mode);

    /**
     * Loads and links a dynamic library or bundle.
     * 
     * <p>This function examines the Mach-O file specified by path. If the image is compatible with the current process and has not already been loaded into the
     * process, the image is loaded and linked. If the image contains initializer functions, they are executed before this function returns.</p>
     * 
     * <p>Subsequent calls to {@code dlopen} to load the same image return the same handle, but the internal reference count for the handle is incremented.
     * Therefore, all {@code dlopen} calls must be balanced with {@link #dlclose} calls.</p>
     * 
     * <p>For efficiency, the {@link #RTLD_LAZY} binding mode is preferred over {@link #RTLD_NOW}. However, using {@link #RTLD_NOW} ensures that any undefined
     * symbols are discovered during the call to {@code dlopen}.</p>
     * 
     * <p>The dynamic loader looks in the paths specified by a set of environment variables, and in the process's current directory, when it searches for a
     * library. These paths are called dynamic loader search paths. The environment variables are {@code LD_LIBRARY_PATH}, {@code DYLD_LIBRARY_PATH}, and
     * {@code DYLD_FALLBACK_LIBRARY_PATH}. The default value of {@code DYLD_FALLBACK_LIBRARY_PATH} (used when this variable is not set), is
     * {@code $HOME/lib;/usr/local/lib;/usr/lib}.</p>
     * 
     * <p>The order in which the search paths are searched depends on whether path is a filename (it does not contain a slash) or a pathname (it contains at least
     * one slash).</p>
     * 
     * <p>When path is a filename, the dynamic loader searches for the library in the search paths in the following order:</p>
     * 
     * <ul>
     * <li>$LD_LIBRARY_PATH</li>
     * <li>$DYLD_LIBRARY_PATH</li>
     * <li>The process's working directory</li>
     * <li>$DYLD_FALLBACK_LIBRARY_PATH</li>
     * </ul>
     * 
     * <p>When path is a pathname, the dynamic loader searches for the library in the search paths in the following order:</p>
     * 
     * <ul>
     * <li>$DYLD_LIBRARY_PATH</li>
     * <li>The given pathname</li>
     * <li>$DYLD_FALLBACK_LIBRARY_PATH using the filename</li>
     * </ul>
     *
     * @param path path to the image to open
     * @param mode specifies when the loaded image's external symbols are bound to their definitions in dependent libraries (lazy or at load time) and the visibility
     *             of the image's exported symbols (global or local). The value of this parameter is made up by ORing one binding behavior value with one visibility
     *             specification value.
     *             
     *             <p>The following values specify the binding behavior:</p>
     *             
     *             <ul>
     *             <li>{@link #RTLD_LAZY} (default): Each external symbol reference is bound the first time it's used.</li>
     *             <li>{@link #RTLD_NOW}: All external symbol references are bound immediately.</li>
     *             </ul>
     *             
     *             <p>The following values specify external symbol visibility:</p>
     *             
     *             <ul>
     *             <li>{@link #RTLD_GLOBAL} (default): The loaded image's exported symbols are available to any images that use a flat namespace or to calls to
     *             dlsym when using a special handle (see {@link #dlsym} for details).</li>
     *             <li>{@link #RTLD_LOCAL}: The loaded image's exported symbols are generally hidden. They are available only to {@link #dlsym} invocations that
     *             use the handle returned by this function.</li>
     *             </ul>
     */
    @NativeType("void *")
    public static long dlopen(@Nullable @NativeType("char const *") ByteBuffer path, int mode) {
        if (CHECKS) {
            checkNT1Safe(path);
        }
        return ndlopen(memAddressSafe(path), mode);
    }

    /**
     * Loads and links a dynamic library or bundle.
     * 
     * <p>This function examines the Mach-O file specified by path. If the image is compatible with the current process and has not already been loaded into the
     * process, the image is loaded and linked. If the image contains initializer functions, they are executed before this function returns.</p>
     * 
     * <p>Subsequent calls to {@code dlopen} to load the same image return the same handle, but the internal reference count for the handle is incremented.
     * Therefore, all {@code dlopen} calls must be balanced with {@link #dlclose} calls.</p>
     * 
     * <p>For efficiency, the {@link #RTLD_LAZY} binding mode is preferred over {@link #RTLD_NOW}. However, using {@link #RTLD_NOW} ensures that any undefined
     * symbols are discovered during the call to {@code dlopen}.</p>
     * 
     * <p>The dynamic loader looks in the paths specified by a set of environment variables, and in the process's current directory, when it searches for a
     * library. These paths are called dynamic loader search paths. The environment variables are {@code LD_LIBRARY_PATH}, {@code DYLD_LIBRARY_PATH}, and
     * {@code DYLD_FALLBACK_LIBRARY_PATH}. The default value of {@code DYLD_FALLBACK_LIBRARY_PATH} (used when this variable is not set), is
     * {@code $HOME/lib;/usr/local/lib;/usr/lib}.</p>
     * 
     * <p>The order in which the search paths are searched depends on whether path is a filename (it does not contain a slash) or a pathname (it contains at least
     * one slash).</p>
     * 
     * <p>When path is a filename, the dynamic loader searches for the library in the search paths in the following order:</p>
     * 
     * <ul>
     * <li>$LD_LIBRARY_PATH</li>
     * <li>$DYLD_LIBRARY_PATH</li>
     * <li>The process's working directory</li>
     * <li>$DYLD_FALLBACK_LIBRARY_PATH</li>
     * </ul>
     * 
     * <p>When path is a pathname, the dynamic loader searches for the library in the search paths in the following order:</p>
     * 
     * <ul>
     * <li>$DYLD_LIBRARY_PATH</li>
     * <li>The given pathname</li>
     * <li>$DYLD_FALLBACK_LIBRARY_PATH using the filename</li>
     * </ul>
     *
     * @param path path to the image to open
     * @param mode specifies when the loaded image's external symbols are bound to their definitions in dependent libraries (lazy or at load time) and the visibility
     *             of the image's exported symbols (global or local). The value of this parameter is made up by ORing one binding behavior value with one visibility
     *             specification value.
     *             
     *             <p>The following values specify the binding behavior:</p>
     *             
     *             <ul>
     *             <li>{@link #RTLD_LAZY} (default): Each external symbol reference is bound the first time it's used.</li>
     *             <li>{@link #RTLD_NOW}: All external symbol references are bound immediately.</li>
     *             </ul>
     *             
     *             <p>The following values specify external symbol visibility:</p>
     *             
     *             <ul>
     *             <li>{@link #RTLD_GLOBAL} (default): The loaded image's exported symbols are available to any images that use a flat namespace or to calls to
     *             dlsym when using a special handle (see {@link #dlsym} for details).</li>
     *             <li>{@link #RTLD_LOCAL}: The loaded image's exported symbols are generally hidden. They are available only to {@link #dlsym} invocations that
     *             use the handle returned by this function.</li>
     *             </ul>
     */
    @NativeType("void *")
    public static long dlopen(@Nullable @NativeType("char const *") CharSequence path, int mode) {
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

    /** Unsafe version of: {@link #dlerror} */
    public static native long ndlerror();

    /**
     * Provides diagnostic information corresponding to problems with calls to {@link #dlopen}, {@link #dlsym}, and {@link #dlclose} in the same thread.
     * 
     * <p>When there's a problem to report, this function returns a pointer to a null-terminated string describing the problem. Otherwise, this function returns
     * {@code NULL}.</p>
     * 
     * <p>Each call to {@code dlerror} resets its diagnostic buffer. If a program needs to keep a record of past error messages, it must store them itself.
     * Subsequent calls to {@code dlerror} in the same thread with no calls to {@link #dlopen}, {@link #dlsym}, or {@link #dlclose}, return {@code NULL}.</p>
     */
    @Nullable
    @NativeType("char const *")
    public static String dlerror() {
        long __result = ndlerror();
        return memUTF8Safe(__result);
    }

    // --- [ dlsym ] ---

    /** Unsafe version of: {@link #dlsym} */
    public static native long ndlsym(long handle, long name);

    /**
     * Returns the address of a symbol.
     * 
     * <p>The value of handle specifies what images this function searches for to locate the symbol specified by the symbol parameter. The following table
     * describes the possible values for the handle parameter:</p>
     * 
     * <table class=striped>
     * <tr><th>Handle value</th><th>Search scope</th></tr>
     * <tr><td>{@code dlopen} handle</td><td>Image associated with the {@link #dlopen} handle.</td></tr>
     * <tr><td>{@link #RTLD_DEFAULT}</td><td>Every dependent library or {@link #RTLD_GLOBAL}–opened library in the current process, in the order they were loaded.</td></tr>
     * <tr><td>{@link #RTLD_NEXT}</td><td>Dependent libraries that were loaded after the one calling this function. Libraries opened with {@link #dlopen} are not searched.</td></tr>
     * </table>
     * 
     * <p>Unlike in the NS... functions, the symbol parameter doesn't require a leading underscore to be part of the symbol name.</p>
     *
     * @param handle a handle obtained by a call to {@link #dlopen}, or a special handle. If the handle was obtained by a call to {@link #dlopen}, it must not have been
     *               closed with a call to {@link #dlclose}. These are the possible special-handle values: {@link #RTLD_DEFAULT}, and {@link #RTLD_NEXT}.
     * @param name   the null-terminated character string containing the C name of the symbol being sought
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
     * Returns the address of a symbol.
     * 
     * <p>The value of handle specifies what images this function searches for to locate the symbol specified by the symbol parameter. The following table
     * describes the possible values for the handle parameter:</p>
     * 
     * <table class=striped>
     * <tr><th>Handle value</th><th>Search scope</th></tr>
     * <tr><td>{@code dlopen} handle</td><td>Image associated with the {@link #dlopen} handle.</td></tr>
     * <tr><td>{@link #RTLD_DEFAULT}</td><td>Every dependent library or {@link #RTLD_GLOBAL}–opened library in the current process, in the order they were loaded.</td></tr>
     * <tr><td>{@link #RTLD_NEXT}</td><td>Dependent libraries that were loaded after the one calling this function. Libraries opened with {@link #dlopen} are not searched.</td></tr>
     * </table>
     * 
     * <p>Unlike in the NS... functions, the symbol parameter doesn't require a leading underscore to be part of the symbol name.</p>
     *
     * @param handle a handle obtained by a call to {@link #dlopen}, or a special handle. If the handle was obtained by a call to {@link #dlopen}, it must not have been
     *               closed with a call to {@link #dlclose}. These are the possible special-handle values: {@link #RTLD_DEFAULT}, and {@link #RTLD_NEXT}.
     * @param name   the null-terminated character string containing the C name of the symbol being sought
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
     * Closes a dynamic library or bundle.
     * 
     * <p>This function decreases the reference count of the image referenced by handle. When the reference count for handle becomes 0, the termination routines
     * in the image are called, and the image is removed from the address space of the current process. After that point, handle is rendered invalid.</p>
     *
     * @param handle a handle obtained through a call to {@link #dlopen}.
     */
    public static int dlclose(@NativeType("void *") long handle) {
        if (CHECKS) {
            check(handle);
        }
        return ndlclose(handle);
    }

}