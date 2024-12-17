/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux.templates

import core.linux.*
import org.lwjgl.generator.*

val unistd = "UNISTD".nativeClass(Module.CORE_LINUX, nativeSubPath = "linux") {
    nativeImport(
        "<unistd.h>",
        "<errno.h>"
    )
    nativeDirective("""
#include <sys/syscall.h>

#ifndef SYS_gettid
#error "SYS_gettid unavailable on this system"
#endif

#define gettid() ((pid_t)syscall(SYS_gettid))""")

    EnumConstant(
        "_SC_OPEN_MAX".enum("4"),
        "_SC_PAGE_SIZE".enum("30"),
        "_SC_IOV_MAX".enum("60")
    )

    int(
        "close",

        CaptureCallState.errno.param,
        int("fd")
    )

    long(
        "sysconf",

        CaptureCallState.errno.param,
        int("name")
    )

    ssize_t(
        "read",

        CaptureCallState.errno.param,
        int("fd"),
        void.p("buf"),
        AutoSize("buf")..size_t("count")
    )

    pid_t(
        "getpid",
        void()
    )

    pid_t(
        "getppid",
        void()
    )

    pid_t(
        "gettid",
        void()
    )
}