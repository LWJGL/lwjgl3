/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_draw_texture = "NVDrawTexture".nativeClassGL("NV_draw_texture", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a new function, DrawTextureNV(), allowing
    applications to draw an screen-aligned rectangle displaying some or all of
    the contents of a two-dimensional or rectangle texture.  Callers specify a
    texture object, an optional sampler object, window coordinates of the
    rectangle to draw, and texture coordinates corresponding to the corners of
    the rectangle.  For each fragment produced by the rectangle, DrawTextureNV
    interpolates the texture coordinates, performs a texture lookup, and uses
    the texture result as the fragment color.
        """

    void(
        "DrawTextureNV",
        "",

        GLuint("texture", ""),
        GLuint("sampler", ""),
        GLfloat("x0", ""),
        GLfloat("y0", ""),
        GLfloat("x1", ""),
        GLfloat("y1", ""),
        GLfloat("z", ""),
        GLfloat("s0", ""),
        GLfloat("t0", ""),
        GLfloat("s1", ""),
        GLfloat("t1", "")
    )
}
