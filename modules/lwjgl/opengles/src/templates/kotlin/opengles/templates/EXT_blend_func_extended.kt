/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_blend_func_extended = "EXTBlendFuncExtended".nativeClassGLES("EXT_blend_func_extended", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides an ES version of the ARB_blend_func_extended functionality.

        Traditional OpenGL includes fixed-function blending that combines source colors with the existing content of a render buffer in a variety of ways. A
        number of extensions have enhanced this functionality by adding further sources of blending weights and methods to combine them. However, the inputs to
        the fixed-function blending units are constrained to a source color (as output from fragment shading), destination color (as the current content of the
        frame buffer) or constants that may be used in their place.

        This extension adds new blending functions whereby a fragment shader may output two colors, one of which is treated as the source color, and the other
        used as a blending factor for either source or destination colors. Furthermore, this extension increases orthogonality by allowing the
        SRC_ALPHA_SATURATE function to be used as the destination weight.

        Because of the limitations of the OpenGL ES 2.0 shading language, new built-in variables (gl_SecondaryFragColorEXT, gl_SecondaryFragDataEXT) are added
        to the ES 1.00 shading language rather than introduce more complex features for user-defined fragment outputs. Because such built-in variable are
        deprecated in ES 3.0, these variables are NOT available in the OpenGL ES 3.xx shading language verisons.
        """

    IntConstant(
        """
        Accepted by the {@code src} and {@code dst} parameters of BlendFunc and BlendFunciEXT, and by the {@code srcRGB}, {@code dstRGB}, {@code srcAlpha} and
        {@code dstAlpha} parameters of BlendFuncSeparate and BlendFuncSeparateiEXT.
        """,

        "SRC1_COLOR_EXT"..0x88F9,
        "SRC1_ALPHA_EXT"..0x8589,
        "ONE_MINUS_SRC1_COLOR_EXT"..0x88FA,
        "ONE_MINUS_SRC1_ALPHA_EXT"..0x88FB,
        "SRC_ALPHA_SATURATE_EXT"..0x0308
    )

    IntConstant(
        "Accepted in the {@code props} array of GetProgramResourceiv.",

        "LOCATION_INDEX_EXT"..0x930F
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv.",

        "MAX_DUAL_SOURCE_DRAW_BUFFERS_EXT"..0x88FC
    )

    DependsOn("GLES30")..void(
        "BindFragDataLocationIndexedEXT",
        "",

        GLuint("program", ""),
        GLuint("colorNumber", ""),
        GLuint("index", ""),
        GLcharASCII.const.p("name", "")
    )

    DependsOn("GLES30")..GLint(
        "GetFragDataIndexEXT",
        "",

        GLuint("program", ""),
        GLcharASCII.const.p("name", "")
    )

    DependsOn("GLES30")..void(
        "BindFragDataLocationEXT",
        "",

        GLuint("program", ""),
        GLuint("colorNumber", ""),
        GLcharASCII.const.p("name", "")
    )

    // Missing on Windows with OpenGL ES 3.2 NVIDIA 452.06
    IgnoreMissing..DependsOn("GLES31")..GLint(
        "GetProgramResourceLocationIndexEXT",
        "",

        GLuint("program", ""),
        GLenum("programInterface", ""),
        GLcharASCII.const.p("name", "")
    )
}