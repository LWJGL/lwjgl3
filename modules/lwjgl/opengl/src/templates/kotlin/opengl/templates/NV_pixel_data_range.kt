/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_pixel_data_range = "NVPixelDataRange".nativeClassGL("NV_pixel_data_range", postfix = NV) {
    IntConstant(
        "WRITE_PIXEL_DATA_RANGE_NV"..0x8878,
        "READ_PIXEL_DATA_RANGE_NV"..0x8879
    )

    IntConstant(
        "WRITE_PIXEL_DATA_RANGE_LENGTH_NV"..0x887A,
        "READ_PIXEL_DATA_RANGE_LENGTH_NV"..0x887B
    )

    IntConstant(
        "WRITE_PIXEL_DATA_RANGE_POINTER_NV"..0x887C,
        "READ_PIXEL_DATA_RANGE_POINTER_NV"..0x887D
    )

    void(
        "PixelDataRangeNV",

        GLenum("target"),
        AutoSize("pointer")..GLsizei("length"),
        void.const.p("pointer")
    )

    void(
        "FlushPixelDataRangeNV",

        GLenum("target")
    )
}