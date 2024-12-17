/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux.templates

import core.linux.*
import org.lwjgl.generator.*

val uio = "UIO".nativeClass(Module.CORE_LINUX, nativeSubPath = "linux") {
    nativeImport(
        "<sys/uio.h>",
        "<errno.h>"
    )
    // TODO:

    IntConstant("UIO_FASTIOV".."8")
    IntConstant("UIO_MAXIOV".."1024")

    EnumConstant(
        "RWF_HIPRI".enum(0x00000001),
        "RWF_DSYNC".enum(0x00000002),
        "RWF_SYNC".enum(0x00000004),
        "RWF_NOWAIT".enum(0x00000008),
        "RWF_APPEND".enum(0x00000010),
    )

    ssize_t(
        "readv",

        CaptureCallState.errno.param,
        int("__fd"),
        iovec.const.p("__iovec"),
        int("__count")
    )

    ssize_t(
        "writev",

        CaptureCallState.errno.param,
        int("__fd"),
        iovec.const.p("__iovec"),
        int("__count")
    )

    ssize_t(
        "preadv",

        CaptureCallState.errno.param,
        int("__fd"),
        iovec.const.p("__iovec"),
        int("__count"),
        off_t("__offset")
    )

    ssize_t(
        "pwritev",

        CaptureCallState.errno.param,
        int("__fd"),
        iovec.const.p("__iovec"),
        int("__count"),
        off_t("__offset")
    )

    /*ssize_t(
        "preadv2",

        CaptureCallState.errno.param,
        int("__fd"),
        iovec.const.p("__iovec"),
        int("__count"),
        off_t("__offset"),
        int("__flags")
    )*/

    /*ssize_t(
        "pwritev2",

        CaptureCallState.errno.param,
        int("__fd"),
        iovec.const.p("__iovec"),
        int("__count"),
        off_t("__offset"),
        int("__flags")
    )*/

    ssize_t(
        "process_vm_readv",

        CaptureCallState.errno.param,
        pid_t("__pid"),
        iovec.const.p("__lvec"),
        unsigned_long_int("__liovcnt"),
        iovec.const.p("__rvec"),
        unsigned_long_int("__riovcnt"),
        unsigned_long_int("__flags")
    )

    ssize_t(
        "process_vm_writev",

        CaptureCallState.errno.param,
        pid_t("__pid"),
        iovec.const.p("__lvec"),
        unsigned_long_int("__liovcnt"),
        iovec.const.p("__rvec"),
        unsigned_long_int("__riovcnt"),
        unsigned_long_int("__flags")
    )
}