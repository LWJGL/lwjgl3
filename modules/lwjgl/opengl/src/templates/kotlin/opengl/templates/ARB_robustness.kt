/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_robustness = "ARBRobustness".nativeClassGL("ARB_robustness", postfix = ARB) {
    IntConstant(
        "GUILTY_CONTEXT_RESET_ARB"..0x8253,
        "INNOCENT_CONTEXT_RESET_ARB"..0x8254,
        "UNKNOWN_CONTEXT_RESET_ARB"..0x8255
    )

    IntConstant(
        "RESET_NOTIFICATION_STRATEGY_ARB"..0x8256
    )

    IntConstant(
        "LOSE_CONTEXT_ON_RESET_ARB"..0x8252,
        "NO_RESET_NOTIFICATION_ARB"..0x8261
    )

    IntConstant(
        "CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB"..0x00000004
    )

    GLenum(
        "GetGraphicsResetStatusARB",
        void()
    )

    var src = GL11["GetMapdv"]
    DependsOn("provider.getFunctionAddress(\"glGetMapdv\") != NULL")..void(
        "GetnMapdvARB",

        src["target"],
        src["query"],
        AutoSize("data")..GLsizei("bufSize"),
        ReturnParam..GLdouble.p("data")
    )

    src = GL11["GetMapfv"]
    DependsOn("provider.getFunctionAddress(\"glGetMapfv\") != NULL")..void(
        "GetnMapfvARB",

        src["target"],
        src["query"],
        AutoSize("data")..GLsizei("bufSize"),
        ReturnParam..GLfloat.p("data")
    )

    src = GL11["GetMapiv"]
    DependsOn("provider.getFunctionAddress(\"glGetMapiv\") != NULL")..void(
        "GetnMapivARB",

        src["target"],
        src["query"],
        AutoSize("data")..GLsizei("bufSize"),
        ReturnParam..GLint.p("data")
    )

    src = GL11["GetPixelMapfv"]
    DependsOn("provider.getFunctionAddress(\"glGetPixelMapfv\") != NULL")..void(
        "GetnPixelMapfvARB",

        src["map"],
        AutoSize("data")..GLsizei("bufSize"),
        GLfloat.p("data")
    )

    src = GL11["GetPixelMapuiv"]
    DependsOn("provider.getFunctionAddress(\"glGetPixelMapuiv\") != NULL")..void(
        "GetnPixelMapuivARB",

        src["map"],
        AutoSize("data")..GLsizei("bufSize"),
        GLuint.p("data")
    )

    src = GL11["GetPixelMapusv"]
    DependsOn("provider.getFunctionAddress(\"glGetPixelMapusv\") != NULL")..void(
        "GetnPixelMapusvARB",

        src["map"],
        AutoSize("data")..GLsizei("bufSize"),
        GLushort.p("data")
    )

    src = GL11["GetPolygonStipple"]
    DependsOn("provider.getFunctionAddress(\"glGetPolygonStipple\") != NULL")..void(
        "GetnPolygonStippleARB",

        AutoSize("pattern")..GLsizei("bufSize"),
        RawPointer..GLubyte.p("pattern")
    )

    src = GL11C["GetTexImage"]
    void(
        "GetnTexImageARB",

        src["tex"],
        src["level"],
        src["format"],
        src["type"],
        AutoSize("img")..GLsizei("bufSize"),
        MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE)..RawPointer..void.p("img")
    )

    src = GL11C["ReadPixels"]
    void(
        "ReadnPixelsARB",

        src["x"],
        src["y"],
        src["width"],
        src["height"],
        src["format"],
        src["type"],
        AutoSize("data")..GLsizei("bufSize"),
        MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT)..RawPointer..void.p("data")
    )

    src = ARB_imaging["GetColorTable"]
    DependsOn("ext.contains(\"GL_ARB_imaging\") && provider.getFunctionAddress(\"glGetColorTable\") != NULL")..void(
        "GetnColorTableARB",

        src["target"],
        src["format"],
        src["type"],
        AutoSize("table")..GLsizei("bufSize"),
        MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT)..RawPointer..void.p("table")
    )

    src = ARB_imaging["GetConvolutionFilter"]
    DependsOn("ext.contains(\"GL_ARB_imaging\") && provider.getFunctionAddress(\"glGetConvolutionFilter\") != NULL")..void(
        "GetnConvolutionFilterARB",

        src["target"],
        src["format"],
        src["type"],
        AutoSize("image")..GLsizei("bufSize"),
        RawPointer..void.p("image")
    )

    src = ARB_imaging["GetSeparableFilter"]
    DependsOn("ext.contains(\"GL_ARB_imaging\") && provider.getFunctionAddress(\"glGetSeparableFilter\") != NULL")..void(
        "GetnSeparableFilterARB",

        src["target"],
        src["format"],
        src["type"],
        AutoSize("row")..GLsizei("rowBufSize"),
        RawPointer..void.p("row"),
        AutoSize("column")..GLsizei("columnBufSize"),
        RawPointer..void.p("column"),
        Unsafe..nullable..void.p("span")
    )

    src = ARB_imaging["GetHistogram"]
    DependsOn("ext.contains(\"GL_ARB_imaging\") && provider.getFunctionAddress(\"glGetHistogram\") != NULL")..void(
        "GetnHistogramARB",

        src["target"],
        src["reset"],
        src["format"],
        src["type"],
        AutoSize("values")..GLsizei("bufSize"),
        RawPointer..void.p("values")
    )

    src = ARB_imaging["GetMinmax"]
    DependsOn("ext.contains(\"GL_ARB_imaging\") && provider.getFunctionAddress(\"glGetMinmax\") != NULL")..void(
        "GetnMinmaxARB",

        src["target"],
        src["reset"],
        src["format"],
        src["type"],
        AutoSize("values")..GLsizei("bufSize"),
        RawPointer..void.p("values")
    )

    src = GL13C["GetCompressedTexImage"]
    DependsOn("OpenGL13")..void(
        "GetnCompressedTexImageARB",

        src["target"],
        src["level"],
        AutoSize("img")..GLsizei("bufSize"),
        Check(
            expression = "GL11.glGetTexLevelParameteri(target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE)", debug = true
        )..RawPointer..void.p("img")
    )

    src = GL20["GetUniformfv"]
    DependsOn("OpenGL20")..void(
        "GetnUniformfvARB",

        src["program"],
        src["location"],
        AutoSize("params")..GLsizei("bufSize"),
        ReturnParam..GLfloat.p("params")
    )

    src = GL20["GetUniformiv"]
    DependsOn("OpenGL20")..void(
        "GetnUniformivARB",

        src["program"],
        src["location"],
        AutoSize("params")..GLsizei("bufSize"),
        ReturnParam..GLint.p("params")
    )

    src = GL30["GetUniformuiv"]
    DependsOn("OpenGL30")..void(
        "GetnUniformuivARB",

        src["program"],
        src["location"],
        AutoSize("params")..GLsizei("bufSize"),
        ReturnParam..GLuint.p("params")
    )

    src = GL40["GetUniformdv"]
    DependsOn("OpenGL40")..void(
        "GetnUniformdvARB",

        src["program"],
        src["location"],
        AutoSize("params")..GLsizei("bufSize"),
        ReturnParam..GLdouble.p("params")
    )
}