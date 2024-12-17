/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_draw_texture = "NVDrawTexture".nativeClassGL("NV_draw_texture", postfix = NV) {
    void(
        "DrawTextureNV",

        GLuint("texture"),
        GLuint("sampler"),
        GLfloat("x0"),
        GLfloat("y0"),
        GLfloat("x1"),
        GLfloat("y1"),
        GLfloat("z"),
        GLfloat("s0"),
        GLfloat("t0"),
        GLfloat("s1"),
        GLfloat("t1")
    )
}
