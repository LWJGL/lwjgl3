/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_copy_image = "EXTCopyImage".nativeClassGLES("EXT_copy_image", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension enables efficient image data transfer between image objects (i.e. textures and renderbuffers) without the need to bind the objects or
        otherwise configure the rendering pipeline.

        This is accomplised by adding a new entry-point CopyImageSubData, which takes a named source and destination.

        CopyImageSubData does not perform general-purpose conversions such as scaling, resizing, blending, color-space, or format conversions. It should be
        considered to operate in a manner similar to a CPU memcpy, but using the GPU for the copy.

        CopyImageSubData supports copies between images with different internal formats, if the formats are compatible as described in this extension.

        CopyImageSubData also supports copying between compressed and uncompressed images if the compressed block / uncompressed texel sizes are the same.

        Requires ${GLES30.core}.
        """

    void(
        "CopyImageSubDataEXT",
        "",

        GLuint("srcName", ""),
        GLenum("srcTarget", ""),
        GLint("srcLevel", ""),
        GLint("srcX", ""),
        GLint("srcY", ""),
        GLint("srcZ", ""),
        GLuint("dstName", ""),
        GLenum("dstTarget", ""),
        GLint("dstLevel", ""),
        GLint("dstX", ""),
        GLint("dstY", ""),
        GLint("dstZ", ""),
        GLsizei("srcWidth", ""),
        GLsizei("srcHeight", ""),
        GLsizei("srcDepth", "")
    )
}