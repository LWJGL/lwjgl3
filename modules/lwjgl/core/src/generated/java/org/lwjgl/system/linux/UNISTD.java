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
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to &lt;unistd.h&gt;. */
public class UNISTD {

    static { Library.initialize(); }

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #_SC_OPEN_MAX _SC_OPEN_MAX}</li>
     * <li>{@link #_SC_PAGE_SIZE _SC_PAGE_SIZE}</li>
     * <li>{@link #_SC_IOV_MAX _SC_IOV_MAX}</li>
     * </ul>
     */
    public static final int
        _SC_OPEN_MAX  = 4,
        _SC_PAGE_SIZE = 30,
        _SC_IOV_MAX   = 60;

    protected UNISTD() {
        throw new UnsupportedOperationException();
    }

    // --- [ close ] ---

    /** Unsafe version of: {@link #close} */
    public static native int nclose(long _errno, int fd);

    /** @param _errno optionally returns the {@code errno} value after this function is called */
    public static int close(@NativeType("int *") @Nullable IntBuffer _errno, int fd) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nclose(memAddressSafe(_errno), fd);
    }

    // --- [ sysconf ] ---

    /** Unsafe version of: {@link #sysconf} */
    public static native long nsysconf(long _errno, int name);

    /** @param _errno optionally returns the {@code errno} value after this function is called */
    public static long sysconf(@NativeType("int *") @Nullable IntBuffer _errno, int name) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nsysconf(memAddressSafe(_errno), name);
    }

    // --- [ read ] ---

    /** Unsafe version of: {@link #read} */
    public static native long nread(long _errno, int fd, long buf, long count);

    /** @param _errno optionally returns the {@code errno} value after this function is called */
    @NativeType("ssize_t")
    public static long read(@NativeType("int *") @Nullable IntBuffer _errno, int fd, @NativeType("void *") ByteBuffer buf) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nread(memAddressSafe(_errno), fd, memAddress(buf), buf.remaining());
    }

    // --- [ getpid ] ---

    @NativeType("pid_t")
    public static native int getpid();

    // --- [ getppid ] ---

    @NativeType("pid_t")
    public static native int getppid();

    // --- [ gettid ] ---

    @NativeType("pid_t")
    public static native int gettid();

}