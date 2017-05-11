/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_window_rectangles = "EXTWindowRectangles".nativeClassGLES("EXT_window_rectangles", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides additional orthogonally aligned "window rectangles" specified in window-space coordinates that restrict rasterization of all
        primitive types (geometry, images, paths) and framebuffer clears.

        When rendering to the framebuffer of an on-screen window, these window rectangles are ignored so these window rectangles apply to rendering to non-zero
        framebuffer objects only.

        From zero to an implementation-dependent limit (specified by #MAX_WINDOW_RECTANGLES_EXT) number of window rectangles can be operational at once. When
        one or more window rectangles are active, rasterized fragments can either survive if the fragment is within any of the operational window rectangles
        (#INCLUSIVE_EXT mode) or be rejected if the fragment is within any of the operational window rectangles (#EXCLUSIVE_EXT mode).

        These window rectangles operate orthogonally to the existing scissor test functionality.

        This extension has specification language for both OpenGL and ES so {@code EXT_window_rectangles} can be implemented and advertised for either or both
        API contexts.

        Requires ${GLES30.link} or ${EXT_multiview_draw_buffers.link}.
        """

    val Modes = IntConstant(
        "Accepted by the {@code mode} parameter of #WindowRectanglesEXT().",

        "INCLUSIVE_EXT"..0x8F10,
        "EXCLUSIVE_EXT"..0x8F11
    ).javaDocLinks

    IntConstant(
        """
        Accepted by the {@code pname} parameter of GetIntegeri_v, GetInteger64i_v, GetBooleani_v, GetFloati_v, GetDoublei_v, GetIntegerIndexedvEXT,
        GetFloatIndexedvEXT, GetDoubleIndexedvEXT, GetBooleanIndexedvEXT, and GetIntegeri_vEXT.
        """,

        "WINDOW_RECTANGLE_EXT"..0x8F12
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

        "WINDOW_RECTANGLE_MODE_EXT"..0x8F13,
        "MAX_WINDOW_RECTANGLES_EXT"..0x8F14,
        "NUM_WINDOW_RECTANGLES_EXT"..0x8F15
    )

    void(
        "WindowRectanglesEXT",
        """
        Sets the active window rectangles.

        When the {@code WindowRectanglesEXT} command is processed without error, the i<sup>th</sup> window rectangle box is set to the corresponding four
        parameters for values of {@code i} less then {@code n}. For values of {@code i} greater than {@code n}, each window rectangle box is set to (0,0,0,0).

        Each four elements corresponds to the i<sup>th</sup> window rectangle indicating a box of pixels specified with window-space coordinates. Each window
        rectangle box {@code i} has a lower-left origin at {@code (x_i,y_i)} and upper-right corner at {@code (x_i+w_i,y_i+h_i)}.

        The #INVALID_VALUE error is generated if any element {@code w_i} or {@code h_i}, corresponding to each box's respective width and height, is negative.

        Each rasterized or cleared fragment with a window-space position {@code (xw,yw)} is within the i<sup>th</sup> window rectangle box when both of these
        equations are satisfied for all {@code i} less than {@code n}:
${codeBlock("""
x_i <= xw < x_i+w_i
y_i <= yw < y_i+h_i""")}
        When the window rectangles mode is #INCLUSIVE_EXT mode and the bound framebuffer object is non-zero, a fragment passes the window rectangles test if
        the fragment's window-space position is within at least one of the current {@code n} active window rectangles; otherwise the window rectangles test
        fails and the fragment is discarded.

        When the window rectangles mode is #EXCLUSIVE_EXT mode and the bound framebuffer object is non-zero, a fragment fails the window rectangles test and is
        discarded if the fragment's window-space position is within at least one of the current {@code n} active window rectangles; otherwise the window
        rectangles test passes and the fragment passes the window rectangles test.

        When the bound framebuffer object is zero, the window rectangles test always passes.
        """,

        GLenum.IN("mode", "the rectangle mode", Modes),
        AutoSize(4, "box")..GLsizei.IN("count", "the number of active window rectangles. Must be between zero and the value of #MAX_WINDOW_RECTANGLES_EXT."),
        nullable..const..GLint_p.IN("box", "an array of {@code 4*count} window rectangle coordinates")
    )
}