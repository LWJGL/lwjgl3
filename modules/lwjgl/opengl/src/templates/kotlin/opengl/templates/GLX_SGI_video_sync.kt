/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_SGI_video_sync = "GLXSGIVideoSync".nativeClassGLX("GLX_SGI_video_sync", SGI) {
    GLint(
        "GetVideoSyncSGI",

        Check(1)..unsigned_int.p("count")
    )

    GLint(
        "WaitVideoSyncSGI",

        int("divisor"),
        int("remainder"),
        Check(1)..unsigned_int.p("count")
    )

}