/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_stream_socket = "NVStreamSocket".nativeClassEGL("NV_stream_socket", postfix = NV) {
    IntConstant(
        "STREAM_PROTOCOL_SOCKET_NV"..0x324B
    )

    IntConstant(
        "SOCKET_HANDLE_NV"..0x324C,
        "SOCKET_TYPE_NV"..0x324D
    )
}

val NV_stream_socket_unix = "NVStreamSocketUnix".nativeClassEGL("NV_stream_socket_unix", postfix = NV) {
    IntConstant(
        "SOCKET_TYPE_UNIX_NV"..0x324E
    )
}

val NV_stream_socket_inet = "NVStreamSocketINet".nativeClassEGL("NV_stream_socket_inet", postfix = NV) {
    IntConstant(
        "SOCKET_TYPE_INET_NV"..0x324F
    )
}