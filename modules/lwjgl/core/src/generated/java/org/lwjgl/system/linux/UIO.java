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

public class UIO {

    static { Library.initialize(); }

    public static final int UIO_FASTIOV = 8;

    public static final int UIO_MAXIOV = 1024;

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

    /** {@code ssize_t readv(int __fd, struct iovec const * __iovec, int __count)} */
    public static native long nreadv(long _errno, int __fd, long __iovec, int __count);

    /** {@code ssize_t readv(int __fd, struct iovec const * __iovec, int __count)} */
    @NativeType("ssize_t")
    public static long readv(@NativeType("int *") @Nullable IntBuffer _errno, int __fd, @NativeType("struct iovec const *") IOVec __iovec, int __count) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nreadv(memAddressSafe(_errno), __fd, __iovec.address(), __count);
    }

    // --- [ writev ] ---

    /** {@code ssize_t writev(int __fd, struct iovec const * __iovec, int __count)} */
    public static native long nwritev(long _errno, int __fd, long __iovec, int __count);

    /** {@code ssize_t writev(int __fd, struct iovec const * __iovec, int __count)} */
    @NativeType("ssize_t")
    public static long writev(@NativeType("int *") @Nullable IntBuffer _errno, int __fd, @NativeType("struct iovec const *") IOVec __iovec, int __count) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nwritev(memAddressSafe(_errno), __fd, __iovec.address(), __count);
    }

    // --- [ preadv ] ---

    /** {@code ssize_t preadv(int __fd, struct iovec const * __iovec, int __count, off_t __offset)} */
    public static native long npreadv(long _errno, int __fd, long __iovec, int __count, long __offset);

    /** {@code ssize_t preadv(int __fd, struct iovec const * __iovec, int __count, off_t __offset)} */
    @NativeType("ssize_t")
    public static long preadv(@NativeType("int *") @Nullable IntBuffer _errno, int __fd, @NativeType("struct iovec const *") IOVec __iovec, int __count, @NativeType("off_t") long __offset) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return npreadv(memAddressSafe(_errno), __fd, __iovec.address(), __count, __offset);
    }

    // --- [ pwritev ] ---

    /** {@code ssize_t pwritev(int __fd, struct iovec const * __iovec, int __count, off_t __offset)} */
    public static native long npwritev(long _errno, int __fd, long __iovec, int __count, long __offset);

    /** {@code ssize_t pwritev(int __fd, struct iovec const * __iovec, int __count, off_t __offset)} */
    @NativeType("ssize_t")
    public static long pwritev(@NativeType("int *") @Nullable IntBuffer _errno, int __fd, @NativeType("struct iovec const *") IOVec __iovec, int __count, @NativeType("off_t") long __offset) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return npwritev(memAddressSafe(_errno), __fd, __iovec.address(), __count, __offset);
    }

    // --- [ process_vm_readv ] ---

    /** {@code ssize_t process_vm_readv(pid_t __pid, struct iovec const * __lvec, unsigned long int __liovcnt, struct iovec const * __rvec, unsigned long int __riovcnt, unsigned long int __flags)} */
    public static native long nprocess_vm_readv(long _errno, int __pid, long __lvec, long __liovcnt, long __rvec, long __riovcnt, long __flags);

    /** {@code ssize_t process_vm_readv(pid_t __pid, struct iovec const * __lvec, unsigned long int __liovcnt, struct iovec const * __rvec, unsigned long int __riovcnt, unsigned long int __flags)} */
    @NativeType("ssize_t")
    public static long process_vm_readv(@NativeType("int *") @Nullable IntBuffer _errno, @NativeType("pid_t") int __pid, @NativeType("struct iovec const *") IOVec __lvec, @NativeType("unsigned long int") long __liovcnt, @NativeType("struct iovec const *") IOVec __rvec, @NativeType("unsigned long int") long __riovcnt, @NativeType("unsigned long int") long __flags) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nprocess_vm_readv(memAddressSafe(_errno), __pid, __lvec.address(), __liovcnt, __rvec.address(), __riovcnt, __flags);
    }

    // --- [ process_vm_writev ] ---

    /** {@code ssize_t process_vm_writev(pid_t __pid, struct iovec const * __lvec, unsigned long int __liovcnt, struct iovec const * __rvec, unsigned long int __riovcnt, unsigned long int __flags)} */
    public static native long nprocess_vm_writev(long _errno, int __pid, long __lvec, long __liovcnt, long __rvec, long __riovcnt, long __flags);

    /** {@code ssize_t process_vm_writev(pid_t __pid, struct iovec const * __lvec, unsigned long int __liovcnt, struct iovec const * __rvec, unsigned long int __riovcnt, unsigned long int __flags)} */
    @NativeType("ssize_t")
    public static long process_vm_writev(@NativeType("int *") @Nullable IntBuffer _errno, @NativeType("pid_t") int __pid, @NativeType("struct iovec const *") IOVec __lvec, @NativeType("unsigned long int") long __liovcnt, @NativeType("struct iovec const *") IOVec __rvec, @NativeType("unsigned long int") long __riovcnt, @NativeType("unsigned long int") long __flags) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nprocess_vm_writev(memAddressSafe(_errno), __pid, __lvec.address(), __liovcnt, __rvec.address(), __riovcnt, __flags);
    }

}