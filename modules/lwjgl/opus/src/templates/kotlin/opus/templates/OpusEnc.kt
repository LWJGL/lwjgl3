/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opus.templates

import opus.*
import org.lwjgl.generator.*

val OpusEnc = "OpusEnc".nativeClass(Module.OPUS, prefix = "OPE", prefixMethod = "ope_", binding = OPUS_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.util.opus.Opus.*")
    documentation =
        """
        This is the documentation for the ${url("https://github.com/xiph/libopusenc", "libopusenc")} C API.

        The {@code libopusenc} package provides a convenient high-level API for encoding Ogg Opus files.

        <h3>Organization</h3> 

        The main API is divided into several sections:
        ${ul(
            "encoding",
            "comments",
            "encoder_ctl",
            "callbacks",
            "error_codes"
        )}
        
        <h4>Error Codes</h4>
        
        Many of the functions in this library return a negative error code when a function fails.
        """

    IntConstant(
        "API version for this header. Can be used to check for features at compile time.", 
        
        "API_VERSION".."0"
    )
    
    IntConstant(
        "Error codes.",
        
        "OK".."0",
        "BAD_ARG".."-11",
        "INTERNAL_ERROR".."-13",
        "UNIMPLEMENTED".."-15",
        "ALLOC_FAIL".."-17",
        "CANNOT_OPEN".."-30",
        "TOO_LATE".."-31",
        "INVALID_PICTURE".."-32",
        "INVALID_ICON".."-33",
        "WRITE_FAIL".."-34",
        "CLOSE_FAIL".."-35"
    )

    EnumConstant(
        "\"Raw\" request values -- they should usually not be used.",

        "SET_DECISION_DELAY_REQUEST".enum("", "14000"),
        "GET_DECISION_DELAY_REQUEST".enum,
        "SET_MUXING_DELAY_REQUEST".enum,
        "GET_MUXING_DELAY_REQUEST".enum,
        "SET_COMMENT_PADDING_REQUEST".enum,
        "GET_COMMENT_PADDING_REQUEST".enum,
        "SET_SERIALNO_REQUEST".enum,
        "GET_SERIALNO_REQUEST".enum,
        "SET_PACKET_CALLBACK_REQUEST".enum,
        "SET_HEADER_GAIN_REQUEST".enum("", "14010"),
        "GET_HEADER_GAIN_REQUEST".enum,
        "GET_NB_STREAMS_REQUEST".enum("", "14013"),
        "GET_NB_COUPLED_STREAMS_REQUEST".enum("", "14015")
    )

    OggOpusComments.p(
        "comments_create",
        "Create a new comments object.",

        void(),

        returnDoc = "newly-created comments object"
    )

    OggOpusComments.p(
        "comments_copy",
        "Create a deep copy of a comments object.",

        OggOpusComments.p("comments", "comments object to copy"),

        returnDoc = "deep copy of input"
    )

    void(
        "comments_destroy",
        "Destroys a comments object.",

        OggOpusComments.p("comments", "comments object to destroy")
    )

    int(
        "comments_add",
        "Add a comment.",

        OggOpusComments.p("comments", "where to add the comments"),
        charUTF8.const.p("tag", "tag for the comment (must not contain {@code =} char)"),
        charUTF8.const.p("val", "value for the tag"),

        returnDoc = "error code"
    )

    int(
        "comments_add_string",
        "Add a comment as a single tag=value string.",

        OggOpusComments.p("comments", "where to add the comments"),
        charUTF8.const.p("tag_and_val", "string of the form {@code tag=value} (must contain {@code =} char)"),

        returnDoc = "error code"
    )

    int(
        "comments_add_picture",
        "Add a picture from a file.",

        OggOpusComments.p("comments", "where to add the comments"),
        charUTF8.const.p("filename", "file name for the picture"),
        int("picture_type", "type of picture ({@code -1} for default)"),
        nullable..charUTF8.const.p("description", "description (#NULL means no comment)"),

        returnDoc = "error code"
    )

    int(
        "comments_add_picture_from_memory",
        "Add a picture already in memory.",

        OggOpusComments.p("comments", "where to add the comments"),
        char.const.p("ptr", "pointer to picture in memory"),
        AutoSize("ptr")..size_t("size", "size of picture pointed to by {@code ptr}"),
        int("picture_type", "type of picture ({@code -1} for default)"),
        nullable..charUTF8.const.p("description", "description (#NULL means no comment)"),

        returnDoc = "error code"
    )

    OggOpusEnc.p(
        "encoder_create_file",
        "Create a new OggOpus file.",

        charUTF8.const.p("path", "path where to create the file"),
        OggOpusComments.p("comments", "comments associated with the stream"),
        opus_int32("rate", "input sampling rate (48 kHz is faster)"),
        int("channels", "number of channels"),
        int("family", "mapping family (0 for mono/stereo, 1 for surround)"),
        Check(1)..nullable..int.p("error", "error code (#NULL if no error is to be returned)"),

        returnDoc = "newly-created encoder"
    )

    OggOpusEnc.p(
        "encoder_create_callbacks",
        "Create a new OggOpus stream to be handled using callbacks",

        OpusEncCallbacks.const.p("callbacks", "callback functions"),
        opaque_p("user_data", "pointer to be associated with the stream and passed to the callbacks"),
        OggOpusComments.p("comments", "comments associated with the stream"),
        opus_int32("rate", "input sampling rate (48 kHz is faster)"),
        int("channels", "number of channels"),
        int("family", "mapping family ({@code 0} for mono/stereo, {@code 1} for surround)"),
        Check(1)..nullable..int.p("error", "error code (#NULL if no error is to be returned)"),

        returnDoc = "newly-created encoder"
    )

    OggOpusEnc.p(
        "encoder_create_pull",
        "Create a new OggOpus stream to be used along with #encoder_get_page(). This is mostly useful for muxing with other streams.",

        OggOpusComments.p("comments", "comments associated with the stream"),
        opus_int32("rate", "input sampling rate (48 kHz is faster)"),
        int("channels", "number of channels"),
        int("family", "mapping family (0 for mono/stereo, 1 for surround)"),
        Check(1)..nullable..int.p("error", "error code (#NULL if no error is to be returned)"),

        returnDoc = "newly-created encoder"
    )

    int(
        "encoder_deferred_init_with_mapping",
        """
        Deferred initialization of the encoder to force an explicit channel mapping. This can be used to override the default channel coupling, but using it
        for regular surround will almost certainly lead to worse quality.
        """,

        OggOpusEnc.p("enc", "encoder"),
        int("family", "mapping family ({@code 0} for mono/stereo, {@code 1} for surround)"),
        int("streams", "total number of streams"),
        int("coupled_streams", "number of coupled streams"),
        Unsafe..unsigned_char.const.p("mapping", "channel mapping"),

        returnDoc = "error code"
    )

    int(
        "encoder_write_float",
        "Add/encode any number of float samples to the stream.",

        OggOpusEnc.p("enc", "encoder"),
        Unsafe..float.const.p("pcm", "floating-point PCM values in the {@code +/-1} range (interleaved if multiple channels)"),
        int("samples_per_channel", "number of samples for each channel"),

        returnDoc = "error code"
    )

    int(
        "encoder_write",
        "Add/encode any number of 16-bit linear samples to the stream.",

        OggOpusEnc.p("enc", "encoder"),
        Unsafe..opus_int16.const.p("pcm", "linear 16-bit PCM values in the {@code [-32768,32767]} range (interleaved if multiple channels)"),
        int("samples_per_channel", "number of samples for each channel"),

        returnDoc = "error code"
    )

    intb(
        "encoder_get_page",
        "Get the next page from the stream (only if using #encoder_create_pull()).",

        OggOpusEnc.p("enc", "encoder"),
        Check(1)..unsigned_char.p.p("page", "next available encoded page"),
        Check(1)..opus_int32.p("len", "size (in bytes) of the page returned"),
        intb("flush", "if non-zero, forces a flush of the page (if any data available)"),

        returnDoc = "1 if there is a page available, 0 if not"
    )

    int(
        "encoder_drain",
        "Finalizes the stream, but does not deallocate the object.",

        OggOpusEnc.p("enc", "encoder"),

        returnDoc = "error code"
    )

    void(
        "encoder_destroy",
        "Deallocates the obect. Make sure to #encoder_drain() first.",

        OggOpusEnc.p("enc", "encoder")
    )

    int(
        "encoder_chain_current",
        "Ends the stream and create a new stream within the same file.",

        OggOpusEnc.p("enc", "encoder"),
        OggOpusComments.p("comments", "comments associated with the stream"),

        returnDoc = "error code"
    )

    int(
        "encoder_continue_new_file",
        "Ends the stream and create a new file.",

        OggOpusEnc.p("enc", "encoder"),
        charUTF8.const.p("path", "path where to write the new file"),
        OggOpusComments.p("comments", "comments associated with the stream"),

        returnDoc = "error code"
    )

    int(
        "encoder_continue_new_callbacks",
        "Ends the stream and create a new file (callback-based).",

        OggOpusEnc.p("enc", "encoder"),
        opaque_p("user_data", "pointer to be associated with the new stream and passed to the callbacks"),
        OggOpusComments.p("comments", "comments associated with the stream"),

        returnDoc = "error code"
    )

    int(
        "encoder_flush_header",
        "Write out the header now rather than wait for audio to begin.",

        OggOpusEnc.p("enc", "encoder"),

        returnDoc = "error code"
    )

    private..int(
        "encoder_ctl",
        "Sets encoder options.",

        OggOpusEnc.p("enc", "encoder"),

        returnDoc = "error code"
    )

    charUTF8.const.p(
        "strerror",
        "Converts a libopusenc error code into a human readable string.",

        int("error", "error number"),

        returnDoc = "error string"
    )

    charUTF8.const.p(
        "get_version_string",
        "Returns a string representing the version of libopusenc being used at run time.",

        void(),

        returnDoc = "a string describing the version of this library"
    )

    int(
        "get_abi_version",
        "ABI version for this header. Can be used to check for features at run time.",

        void(),

        returnDoc = "an integer representing the ABI version"
    )

    customMethod("""
    /**
     * Sets encoder options.
     *
     * @param enc     encoder
     * @param request use a request macro
     *
     * @return error code
     */
    public static int ope_encoder_ctl(@NativeType("OggOpusEnc *") long enc, int request) {
        return new CTLRequestV(request).apply(enc, Functions.encoder_ctl);
    }

    /**
     * Sets encoder options.
     *
     * @param enc     encoder
     * @param request use a request macro
     *
     * @return error code
     */
    public static int ope_encoder_ctl(@NativeType("OggOpusEnc *") long enc, CTLRequest request) {
        return request.apply(enc, Functions.encoder_ctl);
    }

    public static CTLRequest OPE_SET_DECISION_DELAY_REQUEST(int value) { return new CTLRequestI(OPE_SET_DECISION_DELAY_REQUEST, value); }
    public static CTLRequest OPE_GET_DECISION_DELAY_REQUEST(IntBuffer __result) { return new CTLRequestP(OPE_GET_DECISION_DELAY_REQUEST, memAddress(__result)); }
    
    public static CTLRequest OPE_SET_MUXING_DELAY_REQUEST(int value) { return new CTLRequestI(OPE_SET_MUXING_DELAY_REQUEST, value); }
    public static CTLRequest OPE_GET_MUXING_DELAY_REQUEST(IntBuffer __result) { return new CTLRequestP(OPE_GET_MUXING_DELAY_REQUEST, memAddress(__result)); }
    
    public static CTLRequest OPE_SET_COMMENT_PADDING_REQUEST(int value) { return new CTLRequestI(OPE_SET_COMMENT_PADDING_REQUEST, value); }
    public static CTLRequest OPE_GET_COMMENT_PADDING_REQUEST(IntBuffer __result) { return new CTLRequestP(OPE_GET_COMMENT_PADDING_REQUEST, memAddress(__result)); }
    
    public static CTLRequest OPE_SET_SERIALNO_REQUEST(int value) { return new CTLRequestI(OPE_SET_SERIALNO_REQUEST, value); }
    public static CTLRequest OPE_GET_SERIALNO_REQUEST(IntBuffer __result) { return new CTLRequestP(OPE_GET_SERIALNO_REQUEST, memAddress(__result)); }
    
    public static CTLRequest OPE_SET_PACKET_CALLBACK_REQUEST(OPEPacketFuncI value) { return new CTLRequestP(OPE_SET_PACKET_CALLBACK_REQUEST, value.address()); }
    
    public static CTLRequest OPE_SET_HEADER_GAIN_REQUEST(int value) { return new CTLRequestI(OPE_SET_HEADER_GAIN_REQUEST, value); }
    public static CTLRequest OPE_GET_HEADER_GAIN_REQUEST(IntBuffer __result) { return new CTLRequestP(OPE_GET_HEADER_GAIN_REQUEST, memAddress(__result)); }
    
    public static CTLRequest OPE_GET_NB_STREAMS_REQUEST(IntBuffer __result) { return new CTLRequestP(OPE_GET_NB_STREAMS_REQUEST, memAddress(__result)); }
    public static CTLRequest OPE_GET_NB_COUPLED_STREAMS_REQUEST(IntBuffer __result) { return new CTLRequestP(OPE_GET_NB_COUPLED_STREAMS_REQUEST, memAddress(__result)); }
    """)
}
