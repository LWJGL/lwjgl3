/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux.templates

import core.linux.*
import org.lwjgl.generator.*

val socket = "Socket".nativeClass(Module.CORE_LINUX, nativeSubPath = "linux") {
    nativeImport(
        "<sys/socket.h>",
        "<errno.h>"
    )
    // TODO:

    EnumConstant(
        "SHUT_RD".enum("0"),
        "SHUT_WR".enum,
        "SHUT_RDWR".enum
    )

    int(
        "socket",

        CaptureCallState.errno.param,
        int("__domain"),
        int("__type"),
        int("__protocol")
    )
}