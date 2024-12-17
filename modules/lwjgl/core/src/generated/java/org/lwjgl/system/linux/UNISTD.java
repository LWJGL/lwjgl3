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

public class UNISTD {

    static { Library.initialize(); }

    public static final int
        _SC_OPEN_MAX  = 4,
        _SC_PAGE_SIZE = 30,
        _SC_IOV_MAX   = 60;

    protected UNISTD() {
        throw new UnsupportedOperationException();
    }

    // --- [ close ] ---

    /** {@code int close(int fd)} */
    public static native int nclose(long _errno, int fd);

    /** {@code int close(int fd)} */
    public static int close(@NativeType("int *") @Nullable IntBuffer _errno, int fd) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nclose(memAddressSafe(_errno), fd);
    }

    // --- [ sysconf ] ---

    /** {@code long sysconf(int name)} */
    public static native long nsysconf(long _errno, int name);

    /** {@code long sysconf(int name)} */
    public static long sysconf(@NativeType("int *") @Nullable IntBuffer _errno, int name) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nsysconf(memAddressSafe(_errno), name);
    }

    // --- [ read ] ---

    /** {@code ssize_t read(int fd, void * buf, size_t count)} */
    public static native long nread(long _errno, int fd, long buf, long count);

    /** {@code ssize_t read(int fd, void * buf, size_t count)} */
    @NativeType("ssize_t")
    public static long read(@NativeType("int *") @Nullable IntBuffer _errno, int fd, @NativeType("void *") ByteBuffer buf) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nread(memAddressSafe(_errno), fd, memAddress(buf), buf.remaining());
    }

    // --- [ getpid ] ---

    /** {@code pid_t getpid(void)} */
    @NativeType("pid_t")
    public static native int getpid();

    // --- [ getppid ] ---

    /** {@code pid_t getppid(void)} */
    @NativeType("pid_t")
    public static native int getppid();

    // --- [ gettid ] ---

    /** {@code pid_t gettid(void)} */
    @NativeType("pid_t")
    public static native int gettid();

}