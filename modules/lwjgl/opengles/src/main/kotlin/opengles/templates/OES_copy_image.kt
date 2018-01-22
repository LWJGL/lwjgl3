/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OES_copy_image = "OESCopyImage".nativeClassGLES("OES_copy_image", postfix = OES) {
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
        "CopyImageSubDataOES",
        "",

        GLuint.IN("srcName", ""),
        GLenum.IN("srcTarget", ""),
        GLint.IN("srcLevel", ""),
        GLint.IN("srcX", ""),
        GLint.IN("srcY", ""),
        GLint.IN("srcZ", ""),
        GLuint.IN("dstName", ""),
        GLenum.IN("dstTarget", ""),
        GLint.IN("dstLevel", ""),
        GLint.IN("dstX", ""),
        GLint.IN("dstY", ""),
        GLint.IN("dstZ", ""),
        GLsizei.IN("srcWidth", ""),
        GLsizei.IN("srcHeight", ""),
        GLsizei.IN("srcDepth", "")
    )
}