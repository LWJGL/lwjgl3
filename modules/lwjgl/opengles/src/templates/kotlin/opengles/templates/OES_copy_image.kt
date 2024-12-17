/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_copy_image = "OESCopyImage".nativeClassGLES("OES_copy_image", postfix = OES) {
    void(
        "CopyImageSubDataOES",

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