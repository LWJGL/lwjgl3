/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_client_sync = "EXTClientSync".nativeClassEGL("EXT_client_sync", postfix = EXT) {
    IntConstant(
        "SYNC_CLIENT_EXT"..0x3364
    )

    IntConstant(
        "SYNC_CLIENT_SIGNAL_EXT"..0x3365
    )

    EGLBoolean(
        "ClientSignalSyncEXT",

        EGLDisplay("dpy"),
        EGLSync("sync"),
        nullable..noneTerminated..EGLAttrib.const.p("attrib_list")
    )
}