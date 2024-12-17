/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_copy_image = "EXTCopyImage".nativeClassGLES("EXT_copy_image", postfix = EXT) {
    void(
        "CopyImageSubDataEXT",

        GLuint("srcName"),
        GLenum("srcTarget"),
        GLint("srcLevel"),
        GLint("srcX"),
        GLint("srcY"),
        GLint("srcZ"),
        GLuint("dstName"),
        GLenum("dstTarget"),
        GLint("dstLevel"),
        GLint("dstX"),
        GLint("dstY"),
        GLint("dstZ"),
        GLsizei("srcWidth"),
        GLsizei("srcHeight"),
        GLsizei("srcDepth")
    )
}