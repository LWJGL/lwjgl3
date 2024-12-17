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

public class MMAN {

    static { Library.initialize(); }

    public static final long MAP_FAILED = -1L;

    public static final int
        PROT_EXEC      = 0x4,
        PROT_READ      = 0x1,
        PROT_WRITE     = 0x2,
        PROT_NONE      = 0x0,
        PROT_GROWSDOWN = 0x01000000,
        PROT_GROWSUP   = 0x02000000;

    public static final int
        MAP_SHARED          = 0x01,
        MAP_SHARED_VALIDATE = 0x03,
        MAP_PRIVATE         = 0x02;

    public static final int MAP_HUGE_SHIFT = 26;

    public static final int MAP_HUGE_MASK = 0x3f;

    public static final int
        MAP_32BIT           = 0x40,
        MAP_ANONYMOUS       = 0x20,
        MAP_ANON            = MAP_ANONYMOUS,
        MAP_DENYWRITE       = 0x00800,
        MAP_EXECUTABLE      = 0x01000,
        MAP_FILE            = 0,
        MAP_FIXED           = 0x10,
        MAP_FIXED_NOREPLACE = 0x100000,
        MAP_GROWSDOWN       = 0x00100,
        MAP_HUGETLB         = 0x40000,
        MAP_HUGE_2MB        = 21 << MAP_HUGE_SHIFT,
        MAP_HUGE_1GB        = 30 << MAP_HUGE_SHIFT,
        MAP_LOCKED          = 0x02000,
        MAP_NONBLOCK        = 0x10000,
        MAP_NORESERVE       = 0x04000,
        MAP_POPULATE        = 0x08000,
        MAP_STACK           = 0x20000,
        MAP_SYNC            = 0x80000,
        MAP_UNINITIALIZED   = 0x4000000;

    protected MMAN() {
        throw new UnsupportedOperationException();
    }

    // --- [ mmap ] ---

    /** {@code void * mmap(void * addr, size_t length, int prot, int flags, int fd, off_t offset)} */
    public static native long nmmap(long _errno, long addr, long length, int prot, int flags, int fd, long offset);

    /** {@code void * mmap(void * addr, size_t length, int prot, int flags, int fd, off_t offset)} */
    @NativeType("void *")
    public static long mmap(@NativeType("int *") @Nullable IntBuffer _errno, @NativeType("void *") long addr, @NativeType("size_t") long length, int prot, int flags, int fd, @NativeType("off_t") long offset) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nmmap(memAddressSafe(_errno), addr, length, prot, flags, fd, offset);
    }

    // --- [ munmap ] ---

    /** {@code int munmap(void * addr, size_t length)} */
    public static native int nmunmap(long _errno, long addr, long length);

    /** {@code int munmap(void * addr, size_t length)} */
    public static int munmap(@NativeType("int *") @Nullable IntBuffer _errno, @NativeType("void *") ByteBuffer addr) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nmunmap(memAddressSafe(_errno), memAddress(addr), addr.remaining());
    }

}