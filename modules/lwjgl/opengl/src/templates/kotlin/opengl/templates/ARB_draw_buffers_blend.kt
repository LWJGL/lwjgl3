/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_draw_buffers_blend = "ARBDrawBuffersBlend".nativeClassGL("ARB_draw_buffers_blend", postfix = ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension builds upon the ${ARB_draw_buffers.link} and ${EXT_draw_buffers2.link} extensions. In ARB_draw_buffers (part of OpenGL 2.0), separate
        values could be written to each color buffer. This was further enhanced by EXT_draw_buffers2 by adding in the ability to enable blending and to set
        color write masks independently per color output.

        This extension provides the ability to set individual blend equations and blend functions for each color output.

        Requires ${GL20.core} and ${EXT_draw_buffers2.link}. ${GL40.promoted}
        """

    val blendEquations = "#FUNC_ADD #FUNC_SUBTRACT #FUNC_REVERSE_SUBTRACT #MIN #MAX"

    void(
        "BlendEquationiARB",
        """
        Provides a way to enable blending and set color write masks independently per color output.

        This call modifies the blend equations associated with an individual draw buffer.

        The error $INVALID_ENUM is generated if the {@code buf} parameter is outside the range [0, #MAX_DRAW_BUFFERS &ndash; 1].

        The error $INVALID_ENUM is generated if {@code mode} is not one of #FUNC_ADD, #FUNC_SUBTRACT,
        #FUNC_REVERSE_SUBTRACT, #MAX, or #MIN.

        The error $INVALID_OPERATION is generated if this method is executed between the execution of #Begin() and the corresponding execution
        of #End().
        """,

        GLuint("buf", "an integer that indicates the #DRAW_BUFFER to modify."),
        GLenum("mode", "determines both the RGB and alpha blend equations", blendEquations)
    )

    void(
        "BlendEquationSeparateiARB",
        """
        Provides a way to enable blending and set color write masks independently per color output.

        This call modifies the blend equations associated with an individual draw buffer.

        The error $INVALID_ENUM is generated if the {@code buf} parameter is outside the range [0, #MAX_DRAW_BUFFERS &ndash; 1].

        The error $INVALID_ENUM is generated if either {@code modeRGB} or {@code modeAlpha} are not one of #FUNC_ADD,
        #FUNC_SUBTRACT, #FUNC_REVERSE_SUBTRACT, #MAX, or #MIN.

        The error $INVALID_OPERATION is generated if this method is executed between the execution of #Begin() and the corresponding execution
        of #End().
        """,

        GLuint("buf", "an integer that indicates the #DRAW_BUFFER to modify."),
        GLenum("modeRGB", "the RGB blend equation", blendEquations),
        GLenum("modeAlpha", "the alpha blend equation", blendEquations)
    )

    void(
        "BlendFunciARB",
        """
        Provides a way to enable blending and set color write masks independently per color output.

        This call modifies the blend functions associated with an individual draw buffer.

        The error $INVALID_ENUM is generated if the {@code buf} parameter is outside the range [0, #MAX_DRAW_BUFFERS &ndash; 1].

        The error $INVALID_ENUM is generated if either {@code src}, or {@code dst} is not an accepted value.

        The error $INVALID_OPERATION is generated if this method is executed between the execution of #Begin() and the corresponding execution
        of #End().
        """,

        GLuint("buf", "an integer that indicates the #DRAW_BUFFER to modify."),
        GLenum("src", "determines both RGB and alpha source functions"),
        GLenum("dst", "determines both RGB and alpha destination functions")
    )

    void(
        "BlendFuncSeparateiARB",
        """
        Provides a way to enable blending and set color write masks independently per color output.

        This call modifies the blend functions associated with an individual draw buffer.

        The error $INVALID_ENUM is generated if the {@code buf} parameter is outside the range [0, #MAX_DRAW_BUFFERS &ndash; 1].

        The error $INVALID_ENUM is generated if either {@code srcRGB}, {@code dstRGB}, {@code srcAlpha}, or {@code dstAlpha} is not an accepted value.

        The error $INVALID_OPERATION is generated if this method is executed between the execution of #Begin() and the corresponding execution
        of #End().
        """,

        GLuint("buf", "an integer that indicates the #DRAW_BUFFER to modify."),
        GLenum("srcRGB", "the source RGB blend function"),
        GLenum("dstRGB", "the destination RGB blend function"),
        GLenum("srcAlpha", "the source alpha blend function"),
        GLenum("dstAlpha", "the destination alpha blend function")
    )

}