/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.libc.templates

import org.lwjgl.generator.*

val errno = "LibCErrno".nativeClass(Module.CORE_LIBC) {
    nativeImport(
        "<errno.h>"
    )

    EnumConstant(
        "EPERM".enum("1"),
        "ENOENT".enum,
        "ESRCH".enum,
        "EINTR".enum,
        "EIO".enum,
        "ENXIO".enum,
        "E2BIG".enum,
        "ENOEXEC".enum,
        "EBADF".enum,
        "ECHILD".enum,
        "EAGAIN".enum,
        "ENOMEM".enum,
        "EACCES".enum,
        "EFAULT".enum,
        "EBUSY".enum("16"),
        "EEXIST".enum,
        "EXDEV".enum,
        "ENODEV".enum,
        "ENOTDIR".enum,
        "EISDIR".enum,
        "EINVAL".enum,
        "ENFILE".enum,
        "EMFILE".enum,
        "ENOTTY".enum,
        "EFBIG".enum("27"),
        "ENOSPC".enum,
        "ESPIPE".enum,
        "EROFS".enum,
        "EMLINK".enum,
        "EPIPE".enum,
        "EDOM".enum,
        "ERANGE".enum,
        "EDEADLK".enum("36"),
        "EDEADLOCK".enum("36"),
        "ENAMETOOLONG".enum("38"),
        "ENOLCK".enum,
        "ENOSYS".enum,
        "ENOTEMPTY".enum,
        "EILSEQ".enum,
        "STRUNCATE".enum("80")
    )

    macro(variable = true)..int(
        "errno",
        void()
    )
}