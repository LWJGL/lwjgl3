/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_ARB_get_proc_address = "GLXARBGetProcAddress".nativeClassGLX("GLX_ARB_get_proc_address", ARB) {
    opaque_p(
        "GetProcAddressARB",

        GLcharASCII.const.p("procName")
    )
}