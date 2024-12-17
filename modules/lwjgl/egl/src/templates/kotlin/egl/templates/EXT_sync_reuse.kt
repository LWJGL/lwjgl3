/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_sync_reuse = "EXTSyncReuse".nativeClassEGL("EXT_sync_reuse", postfix = EXT) {
    EGLBoolean(
        "UnsignalSyncEXT",

        EGLDisplay("dpy"),
        EGLSync("sync"),
        nullable..noneTerminated..EGLAttrib.const.p("attrib_list")
    )
}