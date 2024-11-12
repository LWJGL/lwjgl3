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

/** Native bindings to &lt;sys/uio.h&gt;. */
public class UIO {

    static { Library.initialize(); }

    public static final int UIO_FASTIOV = 8;

    public static final int UIO_MAXIOV = 1024;

    /**
     * Flags for {@code preadv2}/{@code pwritev2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #RWF_HIPRI RWF_HIPRI} - High priority request.</li>
     * <li>{@link #RWF_DSYNC RWF_DSYNC} - per-IO {@link FCNTL#O_DSYNC}</li>
     * <li>{@link #RWF_SYNC RWF_SYNC} - per-IO {@link FCNTL#O_SYNC}</li>
     * <li>{@link #RWF_NOWAIT RWF_NOWAIT} - per-IO nonblocking mode</li>
     * <li>{@link #RWF_APPEND RWF_APPEND} - per-IO {@link FCNTL#O_APPEND}</li>
     * </ul>
     */
    public static final int
        RWF_HIPRI  = 0x1,
        RWF_DSYNC  = 0x2,
        RWF_SYNC   = 0x4,
        RWF_NOWAIT = 0x8,
        RWF_APPEND = 0x10;

    protected UIO() {
        throw new UnsupportedOperationException();
    }

    // --- [ readv ] ---

    /** Unsafe version of: {@link #readv} */
    public static native long nreadv(long _errno, int __fd, long __iovec, int __count);

    /** @param _errno optionally returns the {@code errno} value after this function is called */
    @NativeType("ssize_t")
    public static long readv(@NativeType("int *") @Nullable IntBuffer _errno, int __fd, @NativeType("struct iovec const *") IOVec __iovec, int __count) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nreadv(memAddressSafe(_errno), __fd, __iovec.address(), __count);
    }

    // --- [ writev ] ---

    /** Unsafe version of: {@link #writev} */
    public static native long nwritev(long _errno, int __fd, long __iovec, int __count);

    /** @param _errno optionally returns the {@code errno} value after this function is called */
    @NativeType("ssize_t")
    public static long writev(@NativeType("int *") @Nullable IntBuffer _errno, int __fd, @NativeType("struct iovec const *") IOVec __iovec, int __count) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nwritev(memAddressSafe(_errno), __fd, __iovec.address(), __count);
    }

    // --- [ preadv ] ---

    /** Unsafe version of: {@link #preadv} */
    public static native long npreadv(long _errno, int __fd, long __iovec, int __count, long __offset);

    /** @param _errno optionally returns the {@code errno} value after this function is called */
    @NativeType("ssize_t")
    public static long preadv(@NativeType("int *") @Nullable IntBuffer _errno, int __fd, @NativeType("struct iovec const *") IOVec __iovec, int __count, @NativeType("off_t") long __offset) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return npreadv(memAddressSafe(_errno), __fd, __iovec.address(), __count, __offset);
    }

    // --- [ pwritev ] ---

    /** Unsafe version of: {@link #pwritev} */
    public static native long npwritev(long _errno, int __fd, long __iovec, int __count, long __offset);

    /** @param _errno optionally returns the {@code errno} value after this function is called */
    @NativeType("ssize_t")
    public static long pwritev(@NativeType("int *") @Nullable IntBuffer _errno, int __fd, @NativeType("struct iovec const *") IOVec __iovec, int __count, @NativeType("off_t") long __offset) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return npwritev(memAddressSafe(_errno), __fd, __iovec.address(), __count, __offset);
    }

    // --- [ process_vm_readv ] ---

    /** Unsafe version of: {@link #process_vm_readv} */
    public static native long nprocess_vm_readv(long _errno, int __pid, long __lvec, long __liovcnt, long __rvec, long __riovcnt, long __flags);

    /**
     * Read from another process' address space.
     *
     * @param _errno optionally returns the {@code errno} value after this function is called
     */
    @NativeType("ssize_t")
    public static long process_vm_readv(@NativeType("int *") @Nullable IntBuffer _errno, @NativeType("pid_t") int __pid, @NativeType("struct iovec const *") IOVec __lvec, @NativeType("unsigned long int") long __liovcnt, @NativeType("struct iovec const *") IOVec __rvec, @NativeType("unsigned long int") long __riovcnt, @NativeType("unsigned long int") long __flags) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nprocess_vm_readv(memAddressSafe(_errno), __pid, __lvec.address(), __liovcnt, __rvec.address(), __riovcnt, __flags);
    }

    // --- [ process_vm_writev ] ---

    /** Unsafe version of: {@link #process_vm_writev} */
    public static native long nprocess_vm_writev(long _errno, int __pid, long __lvec, long __liovcnt, long __rvec, long __riovcnt, long __flags);

    /**
     * Write to another process' address space.
     *
     * @param _errno optionally returns the {@code errno} value after this function is called
     */
    @NativeType("ssize_t")
    public static long process_vm_writev(@NativeType("int *") @Nullable IntBuffer _errno, @NativeType("pid_t") int __pid, @NativeType("struct iovec const *") IOVec __lvec, @NativeType("unsigned long int") long __liovcnt, @NativeType("struct iovec const *") IOVec __rvec, @NativeType("unsigned long int") long __riovcnt, @NativeType("unsigned long int") long __flags) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nprocess_vm_writev(memAddressSafe(_errno), __pid, __lvec.address(), __liovcnt, __rvec.address(), __riovcnt, __flags);
    }

}