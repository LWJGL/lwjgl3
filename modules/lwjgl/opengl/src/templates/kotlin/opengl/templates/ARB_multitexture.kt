/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_multitexture = "ARBMultitexture".nativeClassGL("ARB_multitexture", postfix = ARB) {
    IntConstant(
        "TEXTURE0_ARB"..0x84C0,
        "TEXTURE1_ARB"..0x84C1,
        "TEXTURE2_ARB"..0x84C2,
        "TEXTURE3_ARB"..0x84C3,
        "TEXTURE4_ARB"..0x84C4,
        "TEXTURE5_ARB"..0x84C5,
        "TEXTURE6_ARB"..0x84C6,
        "TEXTURE7_ARB"..0x84C7,
        "TEXTURE8_ARB"..0x84C8,
        "TEXTURE9_ARB"..0x84C9,
        "TEXTURE10_ARB"..0x84CA,
        "TEXTURE11_ARB"..0x84CB,
        "TEXTURE12_ARB"..0x84CC,
        "TEXTURE13_ARB"..0x84CD,
        "TEXTURE14_ARB"..0x84CE,
        "TEXTURE15_ARB"..0x84CF,
        "TEXTURE16_ARB"..0x84D0,
        "TEXTURE17_ARB"..0x84D1,
        "TEXTURE18_ARB"..0x84D2,
        "TEXTURE19_ARB"..0x84D3,
        "TEXTURE20_ARB"..0x84D4,
        "TEXTURE21_ARB"..0x84D5,
        "TEXTURE22_ARB"..0x84D6,
        "TEXTURE23_ARB"..0x84D7,
        "TEXTURE24_ARB"..0x84D8,
        "TEXTURE25_ARB"..0x84D9,
        "TEXTURE26_ARB"..0x84DA,
        "TEXTURE27_ARB"..0x84DB,
        "TEXTURE28_ARB"..0x84DC,
        "TEXTURE29_ARB"..0x84DD,
        "TEXTURE30_ARB"..0x84DE,
        "TEXTURE31_ARB"..0x84DF
    )

    IntConstant(
        "ACTIVE_TEXTURE_ARB"..0x84E0,
        "CLIENT_ACTIVE_TEXTURE_ARB"..0x84E1,
        "MAX_TEXTURE_UNITS_ARB"..0x84E2
    )

    void(
        "ActiveTextureARB",

        GLenum("texture")
    )

    void(
        "ClientActiveTextureARB",

        GLenum("texture")
    )

    void(
        "MultiTexCoord1fARB",

        GLenum("texture"),
        GLfloat("s")
    )

    void("MultiTexCoord1sARB", GLenum("texture"), GLshort("s"))
    void("MultiTexCoord1iARB", GLenum("texture"), GLint("s"))
    void("MultiTexCoord1dARB", GLenum("texture"), GLdouble("s"))

    void("MultiTexCoord1fvARB", GLenum("texture"), Check(1)..GLfloat.const.p("v"))
    void("MultiTexCoord1svARB", GLenum("texture"), Check(1)..GLshort.const.p("v"))
    void("MultiTexCoord1ivARB", GLenum("texture"), Check(1)..GLint.const.p("v"))
    void("MultiTexCoord1dvARB", GLenum("texture"), Check(1)..GLdouble.const.p("v"))

    void(
        "MultiTexCoord2fARB",

        GLenum("texture"),
        GLfloat("s"),
        GLfloat("t")
    )

    void("MultiTexCoord2sARB", GLenum("texture"), GLshort("s"), GLshort("t"))
    void("MultiTexCoord2iARB", GLenum("texture"), GLint("s"), GLint("t"))
    void("MultiTexCoord2dARB", GLenum("texture"), GLdouble("s"), GLdouble("t"))

    void("MultiTexCoord2fvARB", GLenum("texture"), Check(2)..GLfloat.const.p("v"))
    void("MultiTexCoord2svARB", GLenum("texture"), Check(2)..GLshort.const.p("v"))
    void("MultiTexCoord2ivARB", GLenum("texture"), Check(2)..GLint.const.p("v"))
    void("MultiTexCoord2dvARB", GLenum("texture"), Check(2)..GLdouble.const.p("v"))

    void(
        "MultiTexCoord3fARB",

        GLenum("texture"),
        GLfloat("s"),
        GLfloat("t"),
        GLfloat("r")
    )

    void("MultiTexCoord3sARB", GLenum("texture"), GLshort("s"), GLshort("t"), GLshort("r"))
    void("MultiTexCoord3iARB", GLenum("texture"), GLint("s"), GLint("t"), GLint("r"))
    void("MultiTexCoord3dARB", GLenum("texture"), GLdouble("s"), GLdouble("t"), GLdouble("r"))

    void("MultiTexCoord3fvARB", GLenum("texture"), Check(3)..GLfloat.const.p("v"))
    void("MultiTexCoord3svARB", GLenum("texture"), Check(3)..GLshort.const.p("v"))
    void("MultiTexCoord3ivARB", GLenum("texture"), Check(3)..GLint.const.p("v"))
    void("MultiTexCoord3dvARB", GLenum("texture"), Check(3)..GLdouble.const.p("v"))

    void(
        "MultiTexCoord4fARB",

        GLenum("texture"),
        GLfloat("s"),
        GLfloat("t"),
        GLfloat("r"),
        GLfloat("q")
    )

    void("MultiTexCoord4sARB", GLenum("texture"), GLshort("s"), GLshort("t"), GLshort("r"), GLshort("q"))
    void("MultiTexCoord4iARB", GLenum("texture"), GLint("s"), GLint("t"), GLint("r"), GLint("q"))
    void("MultiTexCoord4dARB", GLenum("texture"), GLdouble("s"), GLdouble("t"), GLdouble("r"), GLdouble("q"))

    void("MultiTexCoord4fvARB", GLenum("texture"), Check(4)..GLfloat.const.p("v"))
    void("MultiTexCoord4svARB", GLenum("texture"), Check(4)..GLshort.const.p("v"))
    void("MultiTexCoord4ivARB", GLenum("texture"), Check(4)..GLint.const.p("v"))
    void("MultiTexCoord4dvARB", GLenum("texture"), Check(4)..GLdouble.const.p("v"))
}