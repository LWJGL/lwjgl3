/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libc;

import org.lwjgl.system.*;

/** Native bindings to errno.h. */
public class LibCErrno {

    static { Library.initialize(); }

    /**
     * Standard error codes.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #EPERM EPERM} - Operation not permitted</li>
     * <li>{@link #ENOENT ENOENT} - No such file or directory</li>
     * <li>{@link #ESRCH ESRCH} - No such process</li>
     * <li>{@link #EINTR EINTR} - Interrupted function</li>
     * <li>{@link #EIO EIO} - I/O error</li>
     * <li>{@link #ENXIO ENXIO} - No such device or address</li>
     * <li>{@link #E2BIG E2BIG} - Argument list too long</li>
     * <li>{@link #ENOEXEC ENOEXEC} - Exec format error</li>
     * <li>{@link #EBADF EBADF} - Bad file number</li>
     * <li>{@link #ECHILD ECHILD} - No spawned processes</li>
     * <li>{@link #EAGAIN EAGAIN} - No more processes or not enough memory or maximum nesting level reached</li>
     * <li>{@link #ENOMEM ENOMEM} - Not enough memory</li>
     * <li>{@link #EACCES EACCES} - Permission denied</li>
     * <li>{@link #EFAULT EFAULT} - Bad address</li>
     * <li>{@link #EBUSY EBUSY} - Device or resource busy</li>
     * <li>{@link #EEXIST EEXIST} - File exists</li>
     * <li>{@link #EXDEV EXDEV} - Cross-device link</li>
     * <li>{@link #ENODEV ENODEV} - No such device</li>
     * <li>{@link #ENOTDIR ENOTDIR} - Not a directory</li>
     * <li>{@link #EISDIR EISDIR} - Is a directory</li>
     * <li>{@link #EINVAL EINVAL} - Invalid argument</li>
     * <li>{@link #ENFILE ENFILE} - Too many files open in system</li>
     * <li>{@link #EMFILE EMFILE} - Too many open files</li>
     * <li>{@link #ENOTTY ENOTTY} - Inappropriate I/O control operation</li>
     * <li>{@link #EFBIG EFBIG} - File too large</li>
     * <li>{@link #ENOSPC ENOSPC} - No space left on device</li>
     * <li>{@link #ESPIPE ESPIPE} - Invalid seek</li>
     * <li>{@link #EROFS EROFS} - Read-only file system</li>
     * <li>{@link #EMLINK EMLINK} - Too many links</li>
     * <li>{@link #EPIPE EPIPE} - Broken pipe</li>
     * <li>{@link #EDOM EDOM} - Math argument</li>
     * <li>{@link #ERANGE ERANGE} - Result too large</li>
     * <li>{@link #EDEADLK EDEADLK} - Resource deadlock would occur</li>
     * <li>{@link #EDEADLOCK EDEADLOCK} - Same as EDEADLK for compatibility with older Microsoft C versions</li>
     * <li>{@link #ENAMETOOLONG ENAMETOOLONG} - Filename too long</li>
     * <li>{@link #ENOLCK ENOLCK} - No locks available</li>
     * <li>{@link #ENOSYS ENOSYS} - Function not supported</li>
     * <li>{@link #ENOTEMPTY ENOTEMPTY} - Directory not empty</li>
     * <li>{@link #EILSEQ EILSEQ} - Illegal byte sequence</li>
     * <li>{@link #STRUNCATE STRUNCATE} - String was truncated</li>
     * </ul>
     */
    public static final int
        EPERM        = 0x1,
        ENOENT       = 0x2,
        ESRCH        = 0x3,
        EINTR        = 0x4,
        EIO          = 0x5,
        ENXIO        = 0x6,
        E2BIG        = 0x7,
        ENOEXEC      = 0x8,
        EBADF        = 0x9,
        ECHILD       = 0xA,
        EAGAIN       = 0xB,
        ENOMEM       = 0xC,
        EACCES       = 0xD,
        EFAULT       = 0xE,
        EBUSY        = 0x10,
        EEXIST       = 0x11,
        EXDEV        = 0x12,
        ENODEV       = 0x13,
        ENOTDIR      = 0x14,
        EISDIR       = 0x15,
        EINVAL       = 0x16,
        ENFILE       = 0x17,
        EMFILE       = 0x18,
        ENOTTY       = 0x19,
        EFBIG        = 0x1B,
        ENOSPC       = 0x1C,
        ESPIPE       = 0x1D,
        EROFS        = 0x1E,
        EMLINK       = 0x1F,
        EPIPE        = 0x20,
        EDOM         = 0x21,
        ERANGE       = 0x22,
        EDEADLK      = 0x24,
        EDEADLOCK    = 0x24,
        ENAMETOOLONG = 0x26,
        ENOLCK       = 0x27,
        ENOSYS       = 0x28,
        ENOTEMPTY    = 0x29,
        EILSEQ       = 0x2A,
        STRUNCATE    = 0x50;

    protected LibCErrno() {
        throw new UnsupportedOperationException();
    }

    // --- [ errno ] ---

    /**
     * Returns the integer variable {@code errno}, which is set by system calls and some library functions in the event of an error to indicate what went
     * wrong. Its value is significant only when the return value of the call indicated an error (i.e., -1 from most system calls; -1 or {@code NULL} from most
     * library functions); a function that succeeds is allowed to change errno.
     * 
     * <p><b>LWJGL note</b>: This function cannot be used after another JNI call to a function, because the last error resets before that call returns. For this
     * reason, LWJGL stores the last error in thread-local storage, you can use {@link #getErrno} to access it.</p>
     */
    public static native int errno();

    // --- [ getErrno ] ---

    /**
     * Returns the integer variable {@code errno}, which is set by system calls and some library functions in the event of an error to indicate what went
     * wrong. Its value is significant only when the return value of the call indicated an error (i.e., -1 from most system calls; -1 or {@code NULL} from most
     * library functions); a function that succeeds is allowed to change errno.
     * 
     * <p><b>LWJGL note</b>: This method has a meaningful value only after another LWJGL JNI call. It does not return {@code errno} from errno.h, but the
     * thread-local error code stored by a previous JNI call.</p>
     */
    public static native int getErrno();

}