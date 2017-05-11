/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_clear_texture = "EXTClearTexture".nativeClassGLES("EXT_clear_texture", postfix = EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT", "EXT_clear_texture")} extension.

        Texture objects are fundamental to the operation of OpenGL. They are used as a source for texture sampling and destination for rendering as well as
        being accessed in shaders for image load/store operations It is also possible to invalidate the contents of a texture. It is currently only possible to
        set texture image data to known values by uploading some or all of a image array from application memory or by attaching it to a framebuffer object and
        using the {@code Clear} or {@code ClearBuffer} commands.

        Both uploading initial texture data and clearing by attaching to a framebuffer have potential disadvantages when one simply wants to initialize texture
        data to a known value. Uploading initial data requires the application to allocate a (potentially large) chunk of memory and transferring that to the
        GL. This can be a costly operation both in terms of memory bandwidth and power usage. Alternatively, attaching a texture level to a framebuffer to
        clear it may not be possible if the texture format isn't supported for rendering, or even if it is, attaching the image to a framebuffer object may
        cause the texture to be allocated in certain types of memory, which it may otherwise not need to be placed in.

        This extension solves these problems by providing a mechanism whereby the contents of a texture image array can be set to known values by using the
        #ClearTexImageEXT() or #ClearTexSubImageEXT() commands. These commands can also be useful for initializing an image that will be used for atomic shader
        operations.

        Requires ${GLES31.core}.
        """

    void(
        "ClearTexImageEXT",
        "",

        GLuint.IN("texture", ""),
        GLint.IN("level", ""),
        GLenum.IN("format", ""),
        GLenum.IN("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..nullable..const..void_p.IN("data", "")
    )

    void(
        "ClearTexSubImageEXT",
        "",

        GLuint.IN("texture", ""),
        GLint.IN("level", ""),
        GLint.IN("xoffset", ""),
        GLint.IN("yoffset", ""),
        GLint.IN("zoffset", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLenum.IN("format", ""),
        GLenum.IN("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..nullable..const..void_p.IN("data", "")
    )
}