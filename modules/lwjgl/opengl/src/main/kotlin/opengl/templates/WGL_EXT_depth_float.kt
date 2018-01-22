/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val WGL_EXT_depth_float = "WGLEXTDepthFloat".nativeClassWGL("WGL_EXT_depth_float", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        For perspective scenes, the density of objects (vertices) increases as the distance from the eye increases. For a linear depth buffer, this means that
        objects (vertices) are sparse for a large portion of the depth range and are dense for a small portion of the depth buffer.

        This behavior is obvious if you consider standing in a boat looking at the shore. The near objects include only the boat while the far objects include
        the entire shoreline which may include an entire city.

        A non-linear (floating-point) depth buffer helps this problem. If the near clipping plane is set to 1.0, and the far clipping plane is set to 0.0, a
        much greater resolution of objects can occur.
        """

    IntConstant(
        "Accepted by the {@code attribute} parameter of wglGetPixelFormatAttribivEXT, wglGetPixelFormatAttribfvEXT, and wglChoosePixelFormatExEXT.",

        "DEPTH_FLOAT_EXT"..0x2040
    )
}