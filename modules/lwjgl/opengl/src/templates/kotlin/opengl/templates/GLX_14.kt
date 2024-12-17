/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX14 = "GLX14".nativeClassGLX("GLX14") {
    extends = GLX13
    IntConstant(
        "SAMPLE_BUFFERS"..0x186a0,
        "SAMPLES"..0x186a1
    )

    opaque_p(
        "GetProcAddress",

        GLcharASCII.const.p("procName")
    )

}