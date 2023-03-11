/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import java.nio.*;

import org.lwjgl.system.*;

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

    /**  */
    public static native int close(int fd);

    // --- [ sysconf ] ---

    /**  */
    public static native long sysconf(int name);

    // --- [ read ] ---

    public static native long nread(int fd, long buf, long count);

    @NativeType("ssize_t")
    public static long read(int fd, @NativeType("void *") ByteBuffer buf) {
        return nread(fd, memAddress(buf), buf.remaining());
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