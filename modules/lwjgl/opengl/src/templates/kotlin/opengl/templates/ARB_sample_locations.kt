/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_sample_locations = "ARBSampleLocations".nativeClassGL("ARB_sample_locations") {
    IntConstant(
        "SAMPLE_LOCATION_SUBPIXEL_BITS_ARB"..0x933D,
        "SAMPLE_LOCATION_PIXEL_GRID_WIDTH_ARB"..0x933E,
        "SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_ARB"..0x933F,
        "PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_ARB"..0x9340
    )

    IntConstant(
        "FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_ARB"..0x9342,
        "FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_ARB"..0x9343
    )

    void(
        "FramebufferSampleLocationsfvARB",

        GLenum("target"),
        GLuint("start"),
        AutoSize(2, "v")..GLsizei("count"),
        GLfloat.const.p("v")
    )

    void(
        "NamedFramebufferSampleLocationsfvARB",

        GLuint("framebuffer"),
        this["FramebufferSampleLocationsfvARB"]["start"],
        this["FramebufferSampleLocationsfvARB"]["count"],
        this["FramebufferSampleLocationsfvARB"]["v"]
    )

    void("EvaluateDepthValuesARB")
}