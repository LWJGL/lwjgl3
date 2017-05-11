/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.libc.templates

import org.lwjgl.generator.*
import org.lwjgl.system.libc.*

val errno = "LibCErrno".nativeClass(packageName = LIBC_PACKAGE) {
    nativeImport(
        "<errno.h>"
    )

    documentation = "Native bindings to errno.h."

    EnumConstant(
        "Standard error codes.",
        "EPERM".enum("Operation not permitted", 1),
        "ENOENT" enum "No such file or directory",
        "ESRCH" enum "No such process",
        "EINTR" enum "Interrupted function",
        "EIO" enum "I/O error",
        "ENXIO" enum "No such device or address",
        "E2BIG" enum "Argument list too long",
        "ENOEXEC" enum "Exec format error",
        "EBADF" enum "Bad file number",
        "ECHILD" enum "No spawned processes",
        "EAGAIN" enum "No more processes or not enough memory or maximum nesting level reached",
        "ENOMEM" enum "Not enough memory",
        "EACCES" enum "Permission denied",
        "EFAULT" enum "Bad address",
        "EBUSY".enum("Device or resource busy", 16),
        "EEXIST" enum "File exists",
        "EXDEV" enum "Cross-device link",
        "ENODEV" enum "No such device",
        "ENOTDIR" enum "Not a directory",
        "EISDIR" enum "Is a directory",
        "EINVAL" enum "Invalid argument",
        "ENFILE" enum "Too many files open in system",
        "EMFILE" enum "Too many open files",
        "ENOTTY" enum "Inappropriate I/O control operation",
        "EFBIG".enum("File too large", 27),
        "ENOSPC" enum "No space left on device",
        "ESPIPE" enum "Invalid seek",
        "EROFS" enum "Read-only file system",
        "EMLINK" enum "Too many links",
        "EPIPE" enum "Broken pipe",
        "EDOM" enum "Math argument",
        "ERANGE" enum "Result too large",
        "EDEADLK".enum("Resource deadlock would occur", 36),
        "EDEADLOCK".enum("Same as EDEADLK for compatibility with older Microsoft C versions", 36),
        "ENAMETOOLONG".enum("Filename too long", 38),
        "ENOLCK" enum "No locks available",
        "ENOSYS" enum "Function not supported",
        "ENOTEMPTY" enum "Directory not empty",
        "EILSEQ" enum "Illegal byte sequence",
        "STRUNCATE".enum("String was truncated", 80)
    )

    macro(variable = true)..int(
        "errno",
        """
        Returns the integer variable {@code errno}, which is set by system calls and some library functions in the event of an error to indicate what went
        wrong. Its value is significant only when the return value of the call indicated an error (i.e., -1 from most system calls; -1 or #NULL from most
        library functions); a function that succeeds is allowed to change errno.

        <b>LWJGL note</b>: This function cannot be used after another JNI call to a function, because the last error resets before that call returns. For this
        reason, LWJGL stores the last error in thread-local storage, you can use #getErrno() to access it.
        """
    )

    int(
        "getErrno",
        """
        Returns the integer variable {@code errno}, which is set by system calls and some library functions in the event of an error to indicate what went
        wrong. Its value is significant only when the return value of the call indicated an error (i.e., -1 from most system calls; -1 or #NULL from most
        library functions); a function that succeeds is allowed to change errno.

        <b>LWJGL note</b>: This method has a meaningful value only after another LWJGL JNI call. It does not return {@code errno} from errno.h, but the
        thread-local error code stored by a previous JNI call.
        """
    )

}