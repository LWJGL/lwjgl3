/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_buffer_sub_data = "SOFTBufferSubData".nativeClassAL("SOFT_buffer_sub_data", postfix = SOFT) {
    IntConstant(
        "BYTE_RW_OFFSETS_SOFT"..0x1031,
        "SAMPLE_RW_OFFSETS_SOFT"..0x1032
    )

    void(
        "BufferSubDataSOFT",

        ALuint("buffer"),
        ALenum("format"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..ALvoid.const.p("data"),
        ALsizei("offset"),
        AutoSize("data")..ALsizei("length")
    ).directContext()
}