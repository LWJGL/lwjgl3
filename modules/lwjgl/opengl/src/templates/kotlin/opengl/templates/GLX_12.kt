/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import opengl.*
import core.linux.*
import org.lwjgl.generator.*

val GLX12 = "GLX12".nativeClassGLX("GLX12") {
    extends = GLX11
    Display.p(
        "GetCurrentDisplay",
        void()
    )
}