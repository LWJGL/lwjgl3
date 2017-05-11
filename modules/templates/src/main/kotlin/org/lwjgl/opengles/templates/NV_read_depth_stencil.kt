/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_read_depth = EXT_FLAG.nativeClassGLES("NV_read_depth", postfix = NV) {
    documentation =
        """
        When true, the ${registryLink("NV", "NV_read_depth_stencil")} extension is supported.

        Unextended OpenGL-ES 2.0 only supports using ReadPixels to read from the default color buffer of the currently-bound framebuffer. However, it is useful
        for debugging to be able to read from depth and stencil buffers. This extension re-introduces these features into OpenGL-ES 2.0.

        The NV_read_depth extension allows reading from the depth buffer using ReadPixels.
        """
}

val NV_read_depth_stencil = EXT_FLAG.nativeClassGLES("NV_read_depth_stencil", postfix = NV) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        Unextended OpenGL-ES 2.0 only supports using ReadPixels to read from the default color buffer of the currently-bound framebuffer. However, it is useful
        for debugging to be able to read from depth and stencil buffers. This extension re-introduces these features into OpenGL-ES 2.0.

        The NV_read_depth_stencil extension allows reading from packed depth-stencil buffers using ReadPixels.
        """
}

val NV_read_stencil = EXT_FLAG.nativeClassGLES("NV_read_stencil", postfix = NV) {
    documentation =
        """
        When true, the ${registryLink("NV", "NV_read_depth_stencil")} extension is supported.

        Unextended OpenGL-ES 2.0 only supports using ReadPixels to read from the default color buffer of the currently-bound framebuffer. However, it is useful
        for debugging to be able to read from depth and stencil buffers. This extension re-introduces these features into OpenGL-ES 2.0.

        The NV_read_stencil extension allows reading from the stencil buffer using ReadPixels.
        """
}