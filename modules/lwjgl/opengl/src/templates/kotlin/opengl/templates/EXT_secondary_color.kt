/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_secondary_color = "EXTSecondaryColor".nativeClassGL("EXT_secondary_color", postfix = EXT) {
    IntConstant(
        "COLOR_SUM_EXT"..0x8458
    )

    IntConstant(
        "CURRENT_SECONDARY_COLOR_EXT"..0x8459,
        "SECONDARY_COLOR_ARRAY_SIZE_EXT"..0x845A,
        "SECONDARY_COLOR_ARRAY_TYPE_EXT"..0x845B,
        "SECONDARY_COLOR_ARRAY_STRIDE_EXT"..0x845C
    )

    IntConstant(
        "SECONDARY_COLOR_ARRAY_POINTER_EXT"..0x845D
    )

    IntConstant(
        "SECONDARY_COLOR_ARRAY_EXT"..0x845E
    )

    void(
        "SecondaryColor3bEXT",

        GLbyte("red"),
        GLbyte("green"),
        GLbyte("blue")
    )
    void("SecondaryColor3sEXT", GLshort("red"), GLshort("green"), GLshort("blue"))
    void("SecondaryColor3iEXT", GLint("red"), GLint("green"), GLint("blue"))
    void("SecondaryColor3fEXT", GLfloat("red"), GLfloat("green"), GLfloat("blue"))
    void("SecondaryColor3dEXT", GLdouble("red"), GLdouble("green"), GLdouble("blue"))
    void("SecondaryColor3ubEXT", GLubyte("red"), GLubyte("green"), GLubyte("blue"))
    void("SecondaryColor3usEXT", GLushort("red"), GLushort("green"), GLushort("blue"))
    void("SecondaryColor3uiEXT", GLint("red"), GLint("green"), GLint("blue"))

    void("SecondaryColor3bvEXT", Check(3)..GLbyte.const.p("v"))
    void("SecondaryColor3svEXT", Check(3)..GLshort.const.p("v"))
    void("SecondaryColor3ivEXT", Check(3)..GLint.const.p("v"))
    void("SecondaryColor3fvEXT", Check(3)..GLfloat.const.p("v"))
    void("SecondaryColor3dvEXT", Check(3)..GLdouble.const.p("v"))
    void("SecondaryColor3ubvEXT", Check(3)..GLubyte.const.p("v"))
    void("SecondaryColor3usvEXT", Check(3)..GLushort.const.p("v"))
    void("SecondaryColor3uivEXT", Check(3)..GLuint.const.p("v"))

    void(
        "SecondaryColorPointerEXT",

        GLint("size"),
        GLenum("type"),
        GLsizei("stride"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..void.const.p("pointer")
    )
}