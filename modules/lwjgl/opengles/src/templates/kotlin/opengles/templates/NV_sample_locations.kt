/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_sample_locations = "NVSampleLocations".nativeClassGLES("NV_sample_locations", postfix = NV) {
    IntConstant(
        "SAMPLE_LOCATION_SUBPIXEL_BITS_NV"..0x933D,
        "SAMPLE_LOCATION_PIXEL_GRID_WIDTH_NV"..0x933E,
        "SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_NV"..0x933F,
        "PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_NV"..0x9340
    )

    IntConstant(
        "SAMPLE_LOCATION_NV"..0x8E50,
        "PROGRAMMABLE_SAMPLE_LOCATION_NV"..0x9341
    )

    IntConstant(
        "FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_NV"..0x9342,
        "FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_NV"..0x9343
    )

    void(
        "FramebufferSampleLocationsfvNV",

        GLenum("target"),
        GLuint("start"),
        AutoSize("v")..GLsizei("count"),
        GLfloat.const.p("v")
    )

    void(
        "NamedFramebufferSampleLocationsfvNV",

        GLuint("framebuffer"),
        GLuint("start"),
        AutoSize("v")..GLsizei("count"),
        GLfloat.const.p("v")
    )

    void("ResolveDepthValuesNV")
}