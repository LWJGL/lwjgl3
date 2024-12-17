/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opus

import org.lwjgl.generator.*

val OggOpusComments = "OggOpusComments".opaque
val OggOpusEnc = "OggOpusEnc".opaque

val ope_write_func = Module.OPUS.callback {
    intb(
        "OPEWriteFunc",

        opaque_p("user_data"),
        unsigned_char.const.p("ptr"),
        AutoSize("ptr")..opus_int32("len"),

        nativeType = "ope_write_func"
    ) {
    }
}

val ope_close_func = Module.OPUS.callback {
    int(
        "OPECloseFunc",

        opaque_p("user_data"),

        nativeType = "ope_close_func"
    ) {
    }
}

val ope_packet_func = Module.OPUS.callback {
    void(
        "OPEPacketFunc",

        opaque_p("user_data"),
        unsigned_char.const.p("packet_ptr"),
        AutoSize("packet_ptr")..opus_int32("packet_len"),
        opus_uint32("flags"),

        nativeType = "ope_packet_func"
    ) {
    }
}

val OpusEncCallbacks = struct(Module.OPUS, "OpusEncCallbacks") {
    ope_write_func("write")
    ope_close_func("close")
}
