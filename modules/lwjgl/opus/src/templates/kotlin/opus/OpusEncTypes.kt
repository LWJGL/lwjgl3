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
        "Called for writing a page.",

        opaque_p("user_data", "user-defined data passed to the callback"),
        unsigned_char.const.p("ptr", "buffer to be written"),
        AutoSize("ptr")..opus_int32("len", "number of bytes to be written"),

        nativeType = "ope_write_func",

        returnDoc = "error code; {@code 0: success}, {@code 1: failure}"
    ) {
        documentation = "Instances of this interface may be set to the ##OpusEncCallbacks."
    }
}

val ope_close_func = Module.OPUS.callback {
    int(
        "OPECloseFunc",
        "Called for closing a stream.",

        opaque_p("user_data", "user-defined data passed to the callback"),

        nativeType = "ope_close_func",

        returnDoc = "error code; {@code 0: success}, {@code 1: failure}"
    ) {
        documentation = "Instances of this interface may be set to the ##OpusEncCallbacks."
    }
}

val ope_packet_func = Module.OPUS.callback {
    void(
        "OPEPacketFunc",
        "Called on every packet encoded (including header).",

        opaque_p("user_data", "user-defined data passed to the callback"),
        unsigned_char.const.p("packet_ptr", "packet data"),
        AutoSize("packet_ptr")..opus_int32("packet_len", "number of bytes in the packet"),
        opus_uint32("flags", "optional flags (none defined for now so zero)"),

        nativeType = "ope_packet_func"
    ) {
        documentation = "Instances of this interface may be set with #SET_PACKET_CALLBACK_REQUEST."
    }
}

val OpusEncCallbacks = struct(Module.OPUS, "OpusEncCallbacks") {
    documentation = "Callback functions for accessing the stream."

    ope_write_func("write", "callback for writing to the stream")
    ope_close_func("close", "callback for closing the stream")
}
