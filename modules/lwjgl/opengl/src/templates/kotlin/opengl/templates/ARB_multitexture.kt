/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_multitexture = "ARBMultitexture".nativeClassGL("ARB_multitexture", postfix = ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows application of multiple textures to a fragment in one rendering pass.

        ${GL13.promoted}
        """

    IntConstant(
        "Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.",

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
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

        "ACTIVE_TEXTURE_ARB"..0x84E0,
        "CLIENT_ACTIVE_TEXTURE_ARB"..0x84E1,
        "MAX_TEXTURE_UNITS_ARB"..0x84E2
    )

    void(
        "ActiveTextureARB",
        """
        Selects which texture unit subsequent texture state calls will affect. The number of texture units an implementation supports is implementation
        dependent.
        """,

        GLenum("texture", "which texture unit to make active", "#TEXTURE0_ARB GL_TEXTURE[1-31]")
    )

    void(
        "ClientActiveTextureARB",
        """
        Selects the vertex array client state parameters to be modified by the TexCoordPointer command and the array affected by EnableClientState and
        DisableClientState with parameter TEXTURE_COORD_ARRAY.
        """,

        GLenum("texture", "which texture coordinate array to make active", "#TEXTURE0_ARB GL_TEXTURE[1-31]")
    )

    // MultiTexCoord functions javadoc
    val texCoordTex = "the coordinate set to be modified"
    val texCoordS = "the s component of the current texture coordinates"
    val texCoordT = "the t component of the current texture coordinates"
    val texCoordR = "the r component of the current texture coordinates"
    val texCoordQ = "the q component of the current texture coordinates"
    val texCoordBuffer = "the texture coordinate buffer"

    void(
        "MultiTexCoord1fARB",
        "Sets the current one-dimensional texture coordinate for the specified texture coordinate set. {@code t} and {@code r} are implicitly set to 0 and {@code q} to 1.",

        GLenum("texture", texCoordTex),
        GLfloat("s", texCoordS)
    )

    void("MultiTexCoord1sARB", "Short version of #MultiTexCoord1fARB().", GLenum("texture", texCoordTex), GLshort("s", texCoordS))
    void("MultiTexCoord1iARB", "Integer version of #MultiTexCoord1fARB().", GLenum("texture", texCoordTex), GLint("s", texCoordS))
    void("MultiTexCoord1dARB", "Double version of #MultiTexCoord1fARB().", GLenum("texture", texCoordTex), GLdouble("s", texCoordS))

    void("MultiTexCoord1fvARB", "Pointer version of #MultiTexCoord1fARB().", GLenum("texture", texCoordTex), Check(1)..GLfloat.const.p("v", texCoordBuffer))
    void("MultiTexCoord1svARB", "Pointer version of #MultiTexCoord1sARB().", GLenum("texture", texCoordTex), Check(1)..GLshort.const.p("v", texCoordBuffer))
    void("MultiTexCoord1ivARB", "Pointer version of #MultiTexCoord1iARB().", GLenum("texture", texCoordTex), Check(1)..GLint.const.p("v", texCoordBuffer))
    void("MultiTexCoord1dvARB", "Pointer version of #MultiTexCoord1dARB().", GLenum("texture", texCoordTex), Check(1)..GLdouble.const.p("v", texCoordBuffer))

    void(
        "MultiTexCoord2fARB",
        "Sets the current two-dimensional texture coordinate for the specified texture coordinate set. {@code r} is implicitly set to 0 and {@code q} to 1.",

        GLenum("texture", texCoordTex),
        GLfloat("s", texCoordS),
        GLfloat("t", texCoordT)
    )

    void("MultiTexCoord2sARB", "Short version of #MultiTexCoord2fARB().", GLenum("texture", texCoordTex), GLshort("s", texCoordS), GLshort("t", texCoordT))
    void("MultiTexCoord2iARB", "Integer version of #MultiTexCoord2fARB().", GLenum("texture", texCoordTex), GLint("s", texCoordS), GLint("t", texCoordT))
    void("MultiTexCoord2dARB", "Double version of #MultiTexCoord2fARB().", GLenum("texture", texCoordTex), GLdouble("s", texCoordS), GLdouble("t", texCoordT))

    void("MultiTexCoord2fvARB", "Pointer version of #MultiTexCoord2fARB().", GLenum("texture", texCoordTex), Check(2)..GLfloat.const.p("v", texCoordBuffer))
    void("MultiTexCoord2svARB", "Pointer version of #MultiTexCoord2sARB().", GLenum("texture", texCoordTex), Check(2)..GLshort.const.p("v", texCoordBuffer))
    void("MultiTexCoord2ivARB", "Pointer version of #MultiTexCoord2iARB().", GLenum("texture", texCoordTex), Check(2)..GLint.const.p("v", texCoordBuffer))
    void("MultiTexCoord2dvARB", "Pointer version of #MultiTexCoord2dARB().", GLenum("texture", texCoordTex), Check(2)..GLdouble.const.p("v", texCoordBuffer))

    void(
        "MultiTexCoord3fARB",
        "Sets the current three-dimensional texture coordinate for the specified texture coordinate set. {@code q} is implicitly set to 1.",

        GLenum("texture", texCoordTex),
        GLfloat("s", texCoordS),
        GLfloat("t", texCoordT),
        GLfloat("r", texCoordR)
    )

    void("MultiTexCoord3sARB", "Short version of #MultiTexCoord3fARB().", GLenum("texture", texCoordTex), GLshort("s", texCoordS), GLshort("t", texCoordT), GLshort("r", texCoordR))
    void("MultiTexCoord3iARB", "Integer version of #MultiTexCoord3fARB().", GLenum("texture", texCoordTex), GLint("s", texCoordS), GLint("t", texCoordT), GLint("r", texCoordR))
    void("MultiTexCoord3dARB", "Double version of #MultiTexCoord3fARB().", GLenum("texture", texCoordTex), GLdouble("s", texCoordS), GLdouble("t", texCoordT), GLdouble("r", texCoordR))

    void("MultiTexCoord3fvARB", "Pointer version of #MultiTexCoord3fARB().", GLenum("texture", texCoordTex), Check(3)..GLfloat.const.p("v", texCoordBuffer))
    void("MultiTexCoord3svARB", "Pointer version of #MultiTexCoord3sARB().", GLenum("texture", texCoordTex), Check(3)..GLshort.const.p("v", texCoordBuffer))
    void("MultiTexCoord3ivARB", "Pointer version of #MultiTexCoord3iARB().", GLenum("texture", texCoordTex), Check(3)..GLint.const.p("v", texCoordBuffer))
    void("MultiTexCoord3dvARB", "Pointer version of #MultiTexCoord3dARB().", GLenum("texture", texCoordTex), Check(3)..GLdouble.const.p("v", texCoordBuffer))

    void(
        "MultiTexCoord4fARB",
        "Sets the current four-dimensional texture coordinate for the specified texture coordinate set.",

        GLenum("texture", texCoordTex),
        GLfloat("s", texCoordS),
        GLfloat("t", texCoordT),
        GLfloat("r", texCoordR),
        GLfloat("q", texCoordQ)
    )

    void("MultiTexCoord4sARB", "Short version of #MultiTexCoord4fARB().", GLenum("texture", texCoordTex), GLshort("s", texCoordS), GLshort("t", texCoordT), GLshort("r", texCoordR), GLshort("q", texCoordQ))
    void("MultiTexCoord4iARB", "Integer version of #MultiTexCoord4fARB().", GLenum("texture", texCoordTex), GLint("s", texCoordS), GLint("t", texCoordT), GLint("r", texCoordR), GLint("q", texCoordQ))
    void("MultiTexCoord4dARB", "Double version of #MultiTexCoord4fARB().", GLenum("texture", texCoordTex), GLdouble("s", texCoordS), GLdouble("t", texCoordT), GLdouble("r", texCoordR), GLdouble("q", texCoordQ))

    void("MultiTexCoord4fvARB", "Pointer version of #MultiTexCoord4fARB().", GLenum("texture", texCoordTex), Check(4)..GLfloat.const.p("v", texCoordBuffer))
    void("MultiTexCoord4svARB", "Pointer version of #MultiTexCoord4sARB().", GLenum("texture", texCoordTex), Check(4)..GLshort.const.p("v", texCoordBuffer))
    void("MultiTexCoord4ivARB", "Pointer version of #MultiTexCoord4iARB().", GLenum("texture", texCoordTex), Check(4)..GLint.const.p("v", texCoordBuffer))
    void("MultiTexCoord4dvARB", "Pointer version of #MultiTexCoord4dARB().", GLenum("texture", texCoordTex), Check(4)..GLdouble.const.p("v", texCoordBuffer))
}