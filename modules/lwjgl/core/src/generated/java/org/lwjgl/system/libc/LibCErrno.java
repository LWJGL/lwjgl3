/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libc;

import org.lwjgl.system.*;

public class LibCErrno {

    static { Library.initialize(); }

    public static final int
        EPERM        = 1,
        ENOENT       = 2,
        ESRCH        = 3,
        EINTR        = 4,
        EIO          = 5,
        ENXIO        = 6,
        E2BIG        = 7,
        ENOEXEC      = 8,
        EBADF        = 9,
        ECHILD       = 10,
        EAGAIN       = 11,
        ENOMEM       = 12,
        EACCES       = 13,
        EFAULT       = 14,
        EBUSY        = 16,
        EEXIST       = 17,
        EXDEV        = 18,
        ENODEV       = 19,
        ENOTDIR      = 20,
        EISDIR       = 21,
        EINVAL       = 22,
        ENFILE       = 23,
        EMFILE       = 24,
        ENOTTY       = 25,
        EFBIG        = 27,
        ENOSPC       = 28,
        ESPIPE       = 29,
        EROFS        = 30,
        EMLINK       = 31,
        EPIPE        = 32,
        EDOM         = 33,
        ERANGE       = 34,
        EDEADLK      = 36,
        EDEADLOCK    = 36,
        ENAMETOOLONG = 38,
        ENOLCK       = 39,
        ENOSYS       = 40,
        ENOTEMPTY    = 41,
        EILSEQ       = 42,
        STRUNCATE    = 80;

    protected LibCErrno() {
        throw new UnsupportedOperationException();
    }

    // --- [ errno ] ---

    /** {@code int errno(void)} */
    public static native int errno();

}