/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_secondary_color = "EXTSecondaryColor".nativeClassGL("EXT_secondary_color", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows specifying the RGB components of the secondary color used in the Color Sum stage, instead of using the default (0,0,0,0) color.
        It applies only in RGBA mode and when LIGHTING is disabled.
        """

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev.
        """,

        "COLOR_SUM_EXT"..0x8458
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "CURRENT_SECONDARY_COLOR_EXT"..0x8459,
        "SECONDARY_COLOR_ARRAY_SIZE_EXT"..0x845A,
        "SECONDARY_COLOR_ARRAY_TYPE_EXT"..0x845B,
        "SECONDARY_COLOR_ARRAY_STRIDE_EXT"..0x845C
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetPointerv.",

        "SECONDARY_COLOR_ARRAY_POINTER_EXT"..0x845D
    )

    IntConstant(
        "Accepted by the {@code array} parameter of EnableClientState and DisableClientState.",

        "SECONDARY_COLOR_ARRAY_EXT"..0x845E
    )

    val colorRed = "the red component of the current secondary color"
    val colorGreen = "the green component of the current secondary color"
    val colorBlue = "the blue component of the current secondary color"
    val colorBuffer = "the secondary color buffer"

    void(
        "SecondaryColor3bEXT",
        "Sets the R, G, and B components of the current secondary color.",

        GLbyte.IN("red", colorRed),
        GLbyte.IN("green", colorGreen),
        GLbyte.IN("blue", colorBlue)
    )
    void("SecondaryColor3sEXT", "Short version of #SecondaryColor3bEXT()", GLshort.IN("red", colorRed), GLshort.IN("green", colorGreen), GLshort.IN("blue", colorBlue))
    void("SecondaryColor3iEXT", "Integer version of #SecondaryColor3bEXT()", GLint.IN("red", colorRed), GLint.IN("green", colorGreen), GLint.IN("blue", colorBlue))
    void("SecondaryColor3fEXT", "Float version of #SecondaryColor3bEXT()", GLfloat.IN("red", colorRed), GLfloat.IN("green", colorGreen), GLfloat.IN("blue", colorBlue))
    void("SecondaryColor3dEXT", "Double version of #SecondaryColor3bEXT()", GLdouble.IN("red", colorRed), GLdouble.IN("green", colorGreen), GLdouble.IN("blue", colorBlue))
    void("SecondaryColor3ubEXT", "Unsigned version of #SecondaryColor3bEXT()", GLubyte.IN("red", colorRed), GLubyte.IN("green", colorGreen), GLubyte.IN("blue", colorBlue))
    void("SecondaryColor3usEXT", "Unsigned short version of #SecondaryColor3bEXT()", GLushort.IN("red", colorRed), GLushort.IN("green", colorGreen), GLushort.IN("blue", colorBlue))
    void("SecondaryColor3uiEXT", "Unsigned int version of #SecondaryColor3bEXT()", GLint.IN("red", colorRed), GLint.IN("green", colorGreen), GLint.IN("blue", colorBlue))

    void("SecondaryColor3bvEXT", "Pointer version of #SecondaryColor3bEXT().", Check(3)..const..GLbyte_p.IN("v", colorBuffer))
    void("SecondaryColor3svEXT", "Pointer version of #SecondaryColor3sEXT().", Check(3)..const..GLshort_p.IN("v", colorBuffer))
    void("SecondaryColor3ivEXT", "Pointer version of #SecondaryColor3iEXT().", Check(3)..const..GLint_p.IN("v", colorBuffer))
    void("SecondaryColor3fvEXT", "Pointer version of #SecondaryColor3fEXT().", Check(3)..const..GLfloat_p.IN("v", colorBuffer))
    void("SecondaryColor3dvEXT", "Pointer version of #SecondaryColor3dEXT().", Check(3)..const..GLdouble_p.IN("v", colorBuffer))
    void("SecondaryColor3ubvEXT", "Pointer version of #SecondaryColor3ubEXT().", Check(3)..const..GLubyte_p.IN("v", colorBuffer))
    void("SecondaryColor3usvEXT", "Pointer version of #SecondaryColor3usEXT().", Check(3)..const..GLushort_p.IN("v", colorBuffer))
    void("SecondaryColor3uivEXT", "Pointer version of #SecondaryColor3uiEXT().", Check(3)..const..GLuint_p.IN("v", colorBuffer))

    void(
        "SecondaryColorPointerEXT",
        "Specifies the location and organization of a secondary color array.",

        GLint.IN("size", "the number of values per vertex that are stored in the array, as well as their component ordering", "3"),
        GLenum.IN(
            "type",
            "the data type of the values stored in the array",
            "#BYTE #UNSIGNED_BYTE #SHORT #UNSIGNED_SHORT #INT #UNSIGNED_INT #HALF_FLOAT #FLOAT #DOUBLE #UNSIGNED_INT_2_10_10_10_REV #INT_2_10_10_10_REV"
        ),
        GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..ARRAY_BUFFER..const..void_p.IN("pointer", "the secondary color array data")
    )
}