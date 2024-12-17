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

public class FCNTL {

    static { Library.initialize(); }

    public static final int
        O_ACCMODE   = 00000003,
        O_RDONLY    = 00000000,
        O_WRONLY    = 00000001,
        O_RDWR      = 00000002,
        O_APPEND    = 00002000,
        O_ASYNC     = 020000,
        O_CLOEXEC   = 02000000,
        O_CREAT     = 00000100,
        O_DIRECT    = 040000,
        O_DIRECTORY = 0200000,
        O_DSYNC     = 00010000,
        O_EXCL      = 00000200,
        O_LARGEFILE = 00100000,
        O_NOATIME   = 01000000,
        O_NOCTTY    = 00000400,
        O_NOFOLLOW  = 00400000,
        O_NONBLOCK  = 00004000,
        O_NDELAY    = O_NONBLOCK,
        O_PATH      = 010000000,
        O_SYNC      = 04010000,
        O_TMPFILE   = 020000000 | O_DIRECTORY,
        O_TRUNC     = 00001000;

    public static final int
        S_IFMT   = 00170000,
        S_IFBLK  = 0060000,
        S_IFCHR  = 0020000,
        S_IFIFO  = 0010000,
        S_IFREG  = 0100000,
        S_IFDIR  = 0040000,
        S_IFLNK  = 0120000,
        S_IFSOCK = 0140000;

    public static final int
        S_IRWXU = 0700,
        S_IRUSR = 0400,
        S_IWUSR = 0200,
        S_IXUSR = 0100,
        S_IRWXG = 070,
        S_IRGRP = 040,
        S_IWGRP = 020,
        S_IXGRP = 010,
        S_IRWXO = 07,
        S_IROTH = 04,
        S_IWOTH = 02,
        S_IXOTH = 01,
        S_ISUID = 04000,
        S_ISGID = 02000,
        S_ISVTX = 01000;

    public static final int
        F_DUPFD            = 0,
        F_GETFD            = 1,
        F_SETFD            = 2,
        F_GETFL            = 3,
        F_SETFL            = 4,
        F_GETLK            = 5,
        F_SETLK            = 8,
        F_SETLKW           = 7,
        F_SETOWN           = 8,
        F_GETOWN           = 9,
        F_SETSIG           = 10,
        F_GETSIG           = 11,
        F_SETOWN_EX        = 15,
        F_GETOWN_EX        = 16,
        F_OFD_GETLK        = 36,
        F_OFD_SETLK        = 37,
        F_OFD_SETLKW       = 38,
        F_SETLEASE         = 1024,
        F_GETLEASE         = 1025,
        F_NOTIFY           = 1026,
        F_SETPIPE_SZ       = 1031,
        F_GETPIPE_SZ       = 1032,
        F_ADD_SEALS        = 1033,
        F_GET_SEALS        = 1034,
        F_GET_RW_HINT      = 1035,
        F_SET_RW_HINT      = 1036,
        F_GET_FILE_RW_HINT = 1037,
        F_SET_FILE_RW_HINT = 1038,
        F_DUPFD_CLOEXEC    = 1030;

    public static final int FD_CLOEXEC = 1;

    public static final int
        F_RDLCK = 0,
        F_WRLCK = 1,
        F_UNLCK = 2,
        F_EXLCK = 4,
        F_SHLCK = 8;

    public static final int
        F_OWNER_TID  = 0,
        F_OWNER_PID  = 1,
        F_OWNER_PGRP = 2;

    public static final int
        LOCK_SH    = 1,
        LOCK_EX    = 2,
        LOCK_NB    = 4,
        LOCK_UN    = 8,
        LOCK_MAND  = 32,
        LOCK_READ  = 64,
        LOCK_WRITE = 128,
        LOCK_RW    = 192;

    public static final int
        DN_ACCESS    = 0x1,
        DN_MODIFY    = 0x2,
        DN_CREATE    = 0x4,
        DN_DELETE    = 0x8,
        DN_RENAME    = 0x10,
        DN_ATTRIB    = 0x20,
        DN_MULTISHOT = 0x80000000;

    public static final int
        F_SEAL_SEAL         = 0x0001,
        F_SEAL_SHRINK       = 0x0002,
        F_SEAL_GROW         = 0x0004,
        F_SEAL_WRITE        = 0x0008,
        F_SEAL_FUTURE_WRITE = 0x0010;

    public static final int
        RWH_WRITE_LIFE_NOT_SET = 0,
        RWH_WRITE_LIFE_NONE    = 1,
        RWH_WRITE_LIFE_SHORT   = 2,
        RWH_WRITE_LIFE_MEDIUM  = 3,
        RWH_WRITE_LIFE_LONG    = 4,
        RWH_WRITE_LIFE_EXTREME = 5;

    protected FCNTL() {
        throw new UnsupportedOperationException();
    }

    // --- [ open ] ---

    /** {@code int open(char const * pathname, int flags, mode_t mode)} */
    public static native int nopen(long _errno, long pathname, int flags, int mode);

    /** {@code int open(char const * pathname, int flags, mode_t mode)} */
    public static int open(@NativeType("int *") @Nullable IntBuffer _errno, @NativeType("char const *") ByteBuffer pathname, int flags, @NativeType("mode_t") int mode) {
        if (CHECKS) {
            checkSafe(_errno, 1);
            checkNT1(pathname);
        }
        return nopen(memAddressSafe(_errno), memAddress(pathname), flags, mode);
    }

    /** {@code int open(char const * pathname, int flags, mode_t mode)} */
    public static int open(@NativeType("int *") @Nullable IntBuffer _errno, @NativeType("char const *") CharSequence pathname, int flags, @NativeType("mode_t") int mode) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pathname, true);
            long pathnameEncoded = stack.getPointerAddress();
            return nopen(memAddressSafe(_errno), pathnameEncoded, flags, mode);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ openat ] ---

    /** {@code int openat(int dirfd, char const * pathname, int flags, mode_t mode)} */
    public static native int nopenat(long _errno, int dirfd, long pathname, int flags, int mode);

    /** {@code int openat(int dirfd, char const * pathname, int flags, mode_t mode)} */
    public static int openat(@NativeType("int *") @Nullable IntBuffer _errno, int dirfd, @NativeType("char const *") ByteBuffer pathname, int flags, @NativeType("mode_t") int mode) {
        if (CHECKS) {
            checkSafe(_errno, 1);
            checkNT1(pathname);
        }
        return nopenat(memAddressSafe(_errno), dirfd, memAddress(pathname), flags, mode);
    }

    /** {@code int openat(int dirfd, char const * pathname, int flags, mode_t mode)} */
    public static int openat(@NativeType("int *") @Nullable IntBuffer _errno, int dirfd, @NativeType("char const *") CharSequence pathname, int flags, @NativeType("mode_t") int mode) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pathname, true);
            long pathnameEncoded = stack.getPointerAddress();
            return nopenat(memAddressSafe(_errno), dirfd, pathnameEncoded, flags, mode);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ creat ] ---

    /** {@code int creat(char const * pathname, mode_t mode)} */
    public static native int ncreat(long _errno, long pathname, int mode);

    /** {@code int creat(char const * pathname, mode_t mode)} */
    public static int creat(@NativeType("int *") @Nullable IntBuffer _errno, @NativeType("char const *") ByteBuffer pathname, @NativeType("mode_t") int mode) {
        if (CHECKS) {
            checkSafe(_errno, 1);
            checkNT1(pathname);
        }
        return ncreat(memAddressSafe(_errno), memAddress(pathname), mode);
    }

    /** {@code int creat(char const * pathname, mode_t mode)} */
    public static int creat(@NativeType("int *") @Nullable IntBuffer _errno, @NativeType("char const *") CharSequence pathname, @NativeType("mode_t") int mode) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pathname, true);
            long pathnameEncoded = stack.getPointerAddress();
            return ncreat(memAddressSafe(_errno), pathnameEncoded, mode);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ fcntl ] ---

    /** {@code int fcntl(int fd, int cmd)} */
    public static native int nfcntl(long _errno, int fd, int cmd);

    /** {@code int fcntl(int fd, int cmd)} */
    public static int fcntl(@NativeType("int *") @Nullable IntBuffer _errno, int fd, int cmd) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nfcntl(memAddressSafe(_errno), fd, cmd);
    }

    // --- [ fcntli ] ---

    /** {@code int fcntli(int fd, int cmd, int arg)} */
    public static native int nfcntli(long _errno, int fd, int cmd, int arg);

    /** {@code int fcntli(int fd, int cmd, int arg)} */
    public static int fcntli(@NativeType("int *") @Nullable IntBuffer _errno, int fd, int cmd, int arg) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nfcntli(memAddressSafe(_errno), fd, cmd, arg);
    }

    // --- [ fcntlp ] ---

    /** {@code int fcntlp(int fd, int cmd, void * arg)} */
    public static native int nfcntlp(long _errno, int fd, int cmd, long arg);

    /** {@code int fcntlp(int fd, int cmd, void * arg)} */
    public static int fcntlp(@NativeType("int *") @Nullable IntBuffer _errno, int fd, int cmd, @NativeType("void *") long arg) {
        if (CHECKS) {
            checkSafe(_errno, 1);
            check(arg);
        }
        return nfcntlp(memAddressSafe(_errno), fd, cmd, arg);
    }

}