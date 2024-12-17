/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opus.templates

import opus.*
import org.lwjgl.generator.*

val Opus = "Opus".nativeClass(Module.OPUS, prefix = "OPUS", prefixMethod = "opus_", binding = OPUS_BINDING) {
    EnumConstant(
        "OK".enum("0"),
        "BAD_ARG".enum("-1"),
        "BUFFER_TOO_SMALL".enum("-2"),
        "INTERNAL_ERROR".enum("-3"),
        "INVALID_PACKET".enum("-4"),
        "UNIMPLEMENTED".enum("-5"),
        "INVALID_STATE".enum("-6"),
        "ALLOC_FAIL".enum("-7")
    )

    EnumConstant(
        "SET_APPLICATION_REQUEST".enum("4000"),
        "GET_APPLICATION_REQUEST".enum,
        "SET_BITRATE_REQUEST".enum,
        "GET_BITRATE_REQUEST".enum,
        "SET_MAX_BANDWIDTH_REQUEST".enum,
        "GET_MAX_BANDWIDTH_REQUEST".enum,
        "SET_VBR_REQUEST".enum,
        "GET_VBR_REQUEST".enum,
        "SET_BANDWIDTH_REQUEST".enum,
        "GET_BANDWIDTH_REQUEST".enum,
        "SET_COMPLEXITY_REQUEST".enum,
        "GET_COMPLEXITY_REQUEST".enum,
        "SET_INBAND_FEC_REQUEST".enum,
        "GET_INBAND_FEC_REQUEST".enum,
        "SET_PACKET_LOSS_PERC_REQUEST".enum,
        "GET_PACKET_LOSS_PERC_REQUEST".enum,
        "SET_DTX_REQUEST".enum,
        "GET_DTX_REQUEST".enum,
        "SET_VBR_CONSTRAINT_REQUEST".enum("4020"),
        "GET_VBR_CONSTRAINT_REQUEST".enum,
        "SET_FORCE_CHANNELS_REQUEST".enum,
        "GET_FORCE_CHANNELS_REQUEST".enum,
        "SET_SIGNAL_REQUEST".enum,
        "GET_SIGNAL_REQUEST".enum,
        "GET_LOOKAHEAD_REQUEST".enum("4027"),
        "RESET_STATE".enum,
        "GET_SAMPLE_RATE_REQUEST".enum,
        "GET_FINAL_RANGE_REQUEST".enum("4031"),
        "GET_PITCH_REQUEST".enum("4033"),
        "SET_GAIN_REQUEST".enum,
        "GET_GAIN_REQUEST".enum("4045"), /* Should have been 4035 */
        "SET_LSB_DEPTH_REQUEST".enum("4036"),
        "GET_LSB_DEPTH_REQUEST".enum,
        "GET_LAST_PACKET_DURATION_REQUEST".enum("4039"),
        "SET_EXPERT_FRAME_DURATION_REQUEST".enum,
        "GET_EXPERT_FRAME_DURATION_REQUEST".enum,
        "SET_PREDICTION_DISABLED_REQUEST".enum,
        "GET_PREDICTION_DISABLED_REQUEST".enum,
        /* Don't use 4045, it's already taken by OPUS_GET_GAIN_REQUEST */
        "SET_PHASE_INVERSION_DISABLED_REQUEST".enum("4046"),
        "GET_PHASE_INVERSION_DISABLED_REQUEST".enum,
        "GET_IN_DTX_REQUEST".enum("4049"),
        "SET_DRED_DURATION_REQUEST".enum("4050"),
        "GET_DRED_DURATION_REQUEST".enum,
        "SET_DNN_BLOB_REQUEST".enum,
    )

    IntConstant(
        "AUTO".."-1000",
        "BITRATE_MAX".."-1"
    )

    EnumConstant(
        "APPLICATION_VOIP".enum("2048"),
        "APPLICATION_AUDIO".enum,
        "APPLICATION_RESTRICTED_LOWDELAY".enum("2051")
    )

    EnumConstant(
        "SIGNAL_VOICE".enum("3001"),
        "SIGNAL_MUSIC".enum
    )

    EnumConstant(
        "BANDWIDTH_NARROWBAND".enum("1101"),
        "BANDWIDTH_MEDIUMBAND".enum,
        "BANDWIDTH_WIDEBAND".enum,
        "BANDWIDTH_SUPERWIDEBAND".enum,
        "BANDWIDTH_FULLBAND".enum
    )

    EnumConstant(
        "FRAMESIZE_ARG".enum("5000"),
        "FRAMESIZE_2_5_MS".enum,
        "FRAMESIZE_5_MS".enum,
        "FRAMESIZE_10_MS".enum,
        "FRAMESIZE_20_MS".enum,
        "FRAMESIZE_40_MS".enum,
        "FRAMESIZE_60_MS".enum,
        "FRAMESIZE_80_MS".enum,
        "FRAMESIZE_100_MS".enum,
        "FRAMESIZE_120_MS".enum
    )

    int(
        "encoder_get_size",

        int("channels")
    )

    OpusEncoder.p(
        "encoder_create",

        opus_int32("Fs"),
        int("channels"),
        int("application"),
        Check(1)..nullable..int.p("error")
    )

    int(
        "encoder_init",

        OpusEncoder.p("st"),
        opus_int32("Fs"),
        int("channels"),
        int("application")
    )

    opus_int32(
        "encode",

        OpusEncoder.p("st"),
        Check(
            // Reading OpusEncoder internal state here
            "frame_size * memGetInt(st + 8)"
        )..opus_int16.const.p("pcm"),
        int("frame_size"),
        unsigned_char.p("data"),
        AutoSize("data")..opus_int32("max_data_bytes")
    )

    opus_int32(
        "encode_float",

        OpusEncoder.p("st"),
        Check(
            // Reading OpusEncoder internal state here
            "frame_size * memGetInt(st + 8)"
        )..float.const.p("pcm"),
        int("frame_size"),
        unsigned_char.p("data"),
        AutoSize("data")..opus_int32("max_data_bytes")
    )

    void(
        "encoder_destroy",

        OpusEncoder.p("st")
    )

    private..int(
        "encoder_ctl",

        OpusEncoder.p("st")
    )

    int(
        "decoder_get_size",

        int("channels")
    )

    OpusDecoder.p(
        "decoder_create",

        opus_int32("Fs"),
        int("channels"),
        Check(1)..nullable..int.p("error")
    )

    int(
        "decoder_init",

        OpusDecoder.p("st"),
        opus_int32("Fs"),
        int("channels")
    )

    int(
        "decode",

        OpusDecoder.p("st"),
        nullable..unsigned_char.const.p("data"),
        AutoSize("data")..opus_int32("len"),
        Check(
            // Reading OpusDecoder internal state here
            "frame_size * memGetInt(st + 8)"
        )..opus_int16.p("pcm"),
        int("frame_size"),
        int("decode_fec")
    )

    int(
        "decode_float",

        OpusDecoder.p("st"),
        nullable..unsigned_char.const.p("data"),
        AutoSize("data")..opus_int32("len"),
        Check(
            // Reading OpusDecoder internal state here
            "frame_size * memGetInt(st + 8)"
        )..float.p("pcm"),
        int("frame_size"),
        int("decode_fec")
    )

    private..int(
        "decoder_ctl",

        OpusDecoder.p("st")
    )

    void(
        "decoder_destroy",

        OpusDecoder.p("st")
    )

    int(
        "dred_decoder_get_size",

        void()
    )

    OpusDREDDecoder.p(
        "dred_decoder_create",

        Check(1)..nullable..int.p("error")
    )

    int(
        "dred_decoder_init",

        OpusDREDDecoder.p("dec"),
    )

    void(
        "dred_decoder_destroy",

        OpusDREDDecoder.p("dec")
    )

    private..int(
        "dred_decoder_ctl",

        OpusDREDDecoder.p("dred_dec")
    )

    int(
        "dred_get_size",

        void()
    )

    OpusDRED.p(
        "dred_alloc",

        Check(1)..nullable..int.p("error")
    )

    void(
        "dred_free",

        OpusDRED.p("dec")
    )

    int(
        "dred_parse",

        OpusDREDDecoder.p("dred_dec"),
        OpusDRED.p("dred"),
        unsigned_char.const.p("data"),
        AutoSize("data")..opus_int32("len"),
        opus_int32("max_dred_samples"),
        opus_int32("sampling_rate"),
        Check(1)..nullable..int.p("dred_end"),
        intb("defer_processing")
    )

    int(
        "dred_process",

        OpusDREDDecoder.p("dred_dec"),
        OpusDRED.const.p("src"),
        OpusDRED.p("dst"),
    )

    int(
        "decoder_dred_decode",

        OpusDecoder.p("st"),
        OpusDRED.const.p("dred"),
        opus_int32("dred_offset"),
        Check(
            // Reading OpusDecoder internal state here
            "frame_size * memGetInt(st + 8)"
        )..opus_int16.p("pcm"),
        int("frame_size")
    )

    int(
        "decoder_dred_decode_float",

        OpusDecoder.p("st"),
        OpusDRED.const.p("dred"),
        opus_int32("dred_offset"),
        Check(
            // Reading OpusDecoder internal state here
            "frame_size * memGetInt(st + 8)"
        )..float.p("pcm"),
        int("frame_size")
    )

    int(
        "packet_parse",

        unsigned_char.const.p("data"),
        AutoSize("data")..opus_int32("len"),
        Check(1)..nullable..unsigned_char.p("out_toc"),
        Check(48)..nullable..unsigned_char.const.p.p("frames"),
        Check(48)..opus_int16.p("size"),
        Check(1)..nullable..int.p("payload_offset")
    )

    int(
        "packet_get_bandwidth",

        Check(1)..unsigned_char.const.p("data")
    )

    int(
        "packet_get_samples_per_frame",

        Check(1)..unsigned_char.const.p("data"),
        opus_int32("Fs")
    )

    int(
        "packet_get_nb_channels",

        Unsafe..unsigned_char.const.p("data")
    )

    int(
        "packet_get_nb_frames",

        unsigned_char.const.p("packet"),
        AutoSize("packet")..opus_int32("len")
    )

    int(
        "packet_get_nb_samples",

        unsigned_char.const.p("packet"),
        AutoSize("packet")..opus_int32("len"),
        opus_int32("Fs")
    )

    int(
        "packet_has_lbrr",

        unsigned_char.const.p("packet"),
        AutoSize("packet")..opus_int32("len")
    )

    int(
        "decoder_get_nb_samples",

        OpusDecoder.const.p("dec"),
        unsigned_char.const.p("packet"),
        AutoSize("packet")..opus_int32("len")
    )

    void(
        "pcm_soft_clip",

        Check("frame_size * softclip_mem.remaining()")..float.p("pcm"),
        int("frame_size"),
        AutoSize("softclip_mem")..int("channels"),
        float.p("softclip_mem")
    )

    int(
        "repacketizer_get_size",
        void()
    )

    OpusRepacketizer.p(
        "repacketizer_init",

        OpusRepacketizer.p("rp")
    )

    OpusRepacketizer.p(
        "repacketizer_create",
        void()
    )

    void(
        "repacketizer_destroy",

        OpusRepacketizer.p("rp")
    )

    int(
        "repacketizer_cat",

        OpusRepacketizer.p("rp"),
        unsigned_char.const.p("data"),
        AutoSize("data")..opus_int32("len")
    )

    opus_int32(
        "repacketizer_out_range",

        OpusRepacketizer.p("rp"),
        int("begin"),
        int("end"),
        unsigned_char.const.p("data"),
        AutoSize("data")..opus_int32("maxlen")
    )

    int(
        "repacketizer_get_nb_frames",

        OpusRepacketizer.p("rp")
    )

    opus_int32(
        "repacketizer_out",

        OpusRepacketizer.p("rp"),
        unsigned_char.const.p("data"),
        AutoSize("data")..opus_int32("maxlen")
    )

    int(
        "packet_pad",

        Check("Math.max(len, new_len)")..unsigned_char.const.p("data"),
        opus_int32("len"),
        opus_int32("new_len")
    )

    opus_int32(
        "packet_unpad",

        Check("len")..unsigned_char.const.p("data"),
        opus_int32("len")
    )

    int(
        "multistream_packet_pad",

        Check("Math.max(len, new_len)")..unsigned_char.const.p("data"),
        opus_int32("len"),
        opus_int32("new_len"),
        int("nb_streams")
    )

    opus_int32(
        "multistream_packet_unpad",

        Check("len")..unsigned_char.const.p("data"),
        opus_int32("len"),
        int("nb_streams")
    )

    charASCII.p(
        "strerror",

        int("error")
    )

    charASCII.p(
        "get_version_string",
        void()
    )

    javaImport(
        "org.lwjgl.system.libffi.*",
        "static org.lwjgl.system.MemoryStack.*",
        "static org.lwjgl.system.libffi.LibFFI.*"
    )

    customMethod("""
    public abstract static class CTLRequest {
        protected final FFICIF cif;
        protected final int    request;

        CTLRequest(FFICIF cif, int request) {
            this.cif = cif;
            this.request = request;
        }

        abstract int apply(long st, long __functionAddress);
    }

    public static class CTLRequestV extends CTLRequest {
        private static final FFICIF CIF = apiCreateCIFVar(
            FFI_DEFAULT_ABI, 2, ffi_type_sint,
            ffi_type_pointer, ffi_type_sint
        );

        CTLRequestV(int request) {
            super(CIF, request);
        }

        @Override
        int apply(long st, long __functionAddress) {
            try (MemoryStack stack = stackPush()) {
                ByteBuffer arguments = stack.malloc(POINTER_SIZE + Integer.BYTES);
                PointerBuffer.put(arguments, 0, st);
                arguments.putInt(POINTER_SIZE, request);

                ByteBuffer rvalue = stack.calloc(POINTER_SIZE, POINTER_SIZE);

                long avalues = memAddress(arguments);

                ffi_call(
                    cif, __functionAddress, rvalue,
                    stack.mallocPointer(2)
                        .put(0, avalues)
                        .put(1, avalues + POINTER_SIZE)
                );
                return rvalue.getInt(0);
            }
        }
    }

    public static class CTLRequestI extends CTLRequest {
        private static final FFICIF CIF = apiCreateCIFVar(
            FFI_DEFAULT_ABI, 2, ffi_type_sint,
            ffi_type_pointer, ffi_type_sint, ffi_type_sint32
        );

        private int value;

        CTLRequestI(int request, int value) {
            super(CIF, request);
            this.value = value;
        }

        @Override
        int apply(long st, long __functionAddress) {
            try (MemoryStack stack = stackPush()) {
                ByteBuffer arguments = stack.malloc(POINTER_SIZE + 2 * Integer.BYTES);
                PointerBuffer.put(arguments, 0, st);
                arguments.putInt(POINTER_SIZE, request);
                arguments.putInt(POINTER_SIZE + Integer.BYTES, value);

                ByteBuffer rvalue = stack.calloc(POINTER_SIZE, POINTER_SIZE);

                long avalues = memAddress(arguments);

                ffi_call(
                    cif, __functionAddress, rvalue,
                    stack.mallocPointer(3)
                        .put(0, avalues)
                        .put(1, avalues + POINTER_SIZE)
                        .put(2, avalues + POINTER_SIZE + Integer.BYTES)
                );
                return rvalue.getInt(0);
            }
        }
    }

    public static class CTLRequestP extends CTLRequest {
        private static final FFICIF CIF = apiCreateCIFVar(
            FFI_DEFAULT_ABI, 2, ffi_type_sint,
            ffi_type_pointer, ffi_type_sint, ffi_type_pointer
        );

        private long address;

        CTLRequestP(int request, long address) {
            super(CIF, request);
            this.address = address;
        }

        @Override
        int apply(long st, long __functionAddress) {
            try (MemoryStack stack = stackPush()) {
                ByteBuffer arguments = stack.malloc(POINTER_SIZE * 2 + Integer.BYTES);
                PointerBuffer.put(arguments, 0, st);
                PointerBuffer.put(arguments, POINTER_SIZE, address);
                arguments.putInt(POINTER_SIZE * 2, request);

                ByteBuffer rvalue = stack.calloc(POINTER_SIZE, POINTER_SIZE);

                long avalues = memAddress(arguments);

                ffi_call(
                    cif, __functionAddress, rvalue,
                    stack.mallocPointer(3)
                        .put(0, avalues)
                        .put(1, avalues + POINTER_SIZE * 2)
                        .put(2, avalues + POINTER_SIZE)
                );
                return rvalue.getInt(0);
            }
        }
    }

    public static class CTLRequestPI extends CTLRequest {
        private static final FFICIF CIF = apiCreateCIFVar(
            FFI_DEFAULT_ABI, 2, ffi_type_sint,
            ffi_type_pointer, ffi_type_sint, ffi_type_pointer, ffi_type_sint32
        );

        private long address;
        private int value;

        CTLRequestPI(int request, long address, int value) {
            super(CIF, request);

            this.address = address;
            this.value = value;
        }

        @Override
        int apply(long st, long __functionAddress) {
            try (MemoryStack stack = stackPush()) {
                ByteBuffer arguments = stack.malloc(POINTER_SIZE * 2 + Integer.BYTES * 2);
                PointerBuffer.put(arguments, 0, st);
                PointerBuffer.put(arguments, POINTER_SIZE, address);
                arguments.putInt(POINTER_SIZE * 2, request);
                arguments.putInt(POINTER_SIZE * 2 + Integer.BYTES, value);

                ByteBuffer rvalue = stack.calloc(POINTER_SIZE, POINTER_SIZE);

                long avalues = memAddress(arguments);

                ffi_call(
                    cif, __functionAddress, rvalue,
                    stack.mallocPointer(4)
                        .put(0, avalues)
                        .put(1, avalues + POINTER_SIZE * 2)
                        .put(2, avalues + POINTER_SIZE)
                        .put(3, avalues + POINTER_SIZE * 2 + Integer.BYTES)
                );
                return rvalue.getInt(0);
            }
        }
    }

    /**
     * Performs a CTL function on an Opus encoder.
     *
     * @param st      encoder state
     * @param request CTL request
     */
    public static int opus_encoder_ctl(@NativeType("OpusEncoder *") long st, int request) {
        return new CTLRequestV(request).apply(st, Functions.encoder_ctl);
    }

    /**
     * Performs a CTL function on an Opus encoder.
     *
     * @param st      encoder state
     * @param request CTL request
     */
    public static int opus_encoder_ctl(@NativeType("OpusEncoder *") long st, CTLRequest request) {
        return request.apply(st, Functions.encoder_ctl);
    }

    /**
     * Performs a CTL function on an Opus decoder.
     *
     * @param st      decoder state
     * @param request CTL request
     */
    public static int opus_decoder_ctl(@NativeType("OpusDecoder *") long st, int request) {
        return new CTLRequestV(request).apply(st, Functions.decoder_ctl);
    }

    /**
     * Performs a CTL function on an Opus decoder.
     *
     * @param st      decoder state
     * @param request CTL request
     */
    public static int opus_decoder_ctl(@NativeType("OpusDecoder *") long st, CTLRequest request) {
        return request.apply(st, Functions.decoder_ctl);
    }

    /**
     * Performs a CTL function on an Opus DRED decoder.
     *
     * @param dred_dec decoder state
     * @param request  CTL request
     */
    public static int opus_dred_decoder_ctl(@NativeType("OpusDredDecoder *") long dred_dec, int request) {
        return new CTLRequestV(request).apply(dred_dec, Functions.dred_decoder_ctl);
    }

    /**
     * Performs a CTL function on an Opus DRED decoder.
     *
     * @param dred_dec decoder state
     * @param request  CTL request
     */
    public static int opus_dred_decoder_ctl(@NativeType("OpusDredDecoder *") long dred_dec, CTLRequest request) {
        return request.apply(dred_dec, Functions.dred_decoder_ctl);
    }

    /**
     * Configures the encoder's computational complexity.
     *
     * <p>The supported range is 0-10 inclusive with 10 representing the highest complexity.</p>
     *
     * @param value 0-10, inclusive
     */
    public static CTLRequest OPUS_SET_COMPLEXITY(int value) { return new CTLRequestI(OPUS_SET_COMPLEXITY_REQUEST, value); }

    /**
     * Gets the encoder's complexity configuration.
     *
     * @return a value in the range 0-10, inclusive
     */
    public static CTLRequest OPUS_GET_COMPLEXITY(IntBuffer value) { return new CTLRequestP(OPUS_GET_COMPLEXITY_REQUEST, memAddress(value)); }

    /**
     * Configures the bitrate in the encoder.
     *
     * <p>Rates from 500 to 512000 bits per second are meaningful, as well as the special values {@link #OPUS_AUTO} and {@link #OPUS_BITRATE_MAX}. The value
     * {@link #OPUS_BITRATE_MAX} can be used to cause the codec to use as much rate as it can, which is useful for controlling the rate by adjusting the output
     * buffer size.</p>
     *
     * @param value bitrate in bits per second. The default is determined based on the number of channels and the input sampling rate.
     */
    public static CTLRequest OPUS_SET_BITRATE(int value) { return new CTLRequestI(OPUS_SET_BITRATE_REQUEST, value); }

    /**
     * Gets the encoder's bitrate configuration.
     *
     * @return the bitrate in bits per second. The default is determined based on the number of channels and the input sampling rate.
     */
    public static CTLRequest OPUS_GET_BITRATE(IntBuffer value) { return new CTLRequestP(OPUS_GET_BITRATE_REQUEST, memAddress(value)); }

    /**
     * Enables or disables variable bitrate (VBR) in the encoder.
     *
     * <p>The configured bitrate may not be met exactly because frames must be an integer number of bytes in length.</p>
     *
     * @param value allowed values:
     * <dl>
     * <dt>0</dt><dd>Hard CBR. For LPC/hybrid modes at very low bit-rate, this can cause noticeable quality degradation.</dd>
     * <dt>1</dt><dd>VBR (default). The exact type of VBR is controlled by #OPUS_SET_VBR_CONSTRAINT.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_VBR(int value) { return new CTLRequestI(OPUS_SET_VBR_REQUEST, value); }

    /**
     * Determines if variable bitrate (VBR) is enabled in the encoder.
     *
     * @return one of the following values:
     * <dl>
     * <dt>0</dt><dd>Hard CBR.</dd>
     * <dt>1</dt><dd>VBR (default). The exact type of VBR may be retrieved via {@link #OPUS_GET_VBR_CONSTRAINT}.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_VBR(IntBuffer value) { return new CTLRequestP(OPUS_GET_VBR_REQUEST, memAddress(value)); }

    /**
     * Enables or disables constrained VBR in the encoder.
     *
     * <p>This setting is ignored when the encoder is in CBR mode. Warning: Only the MDCT mode of Opus currently heeds the constraint. Speech mode ignores it
     * completely, hybrid mode may fail to obey it if the LPC layer uses more bitrate than the constraint would have permitted.</p>
     *
     * @param value allowed values:
     * <dl>
     * <dt>0</dt><dd>Unconstrained VBR.</dd>
     * <dt>1</dt><dd>Constrained VBR (default). This creates a maximum of one frame of buffering delay assuming a transport with a serialization speed of the nominal bitrate.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_VBR_CONSTRAINT(int value) { return new CTLRequestI(OPUS_SET_VBR_CONSTRAINT_REQUEST, value); }

    /**
     * Determines if constrained VBR is enabled in the encoder.
     *
     * @return one of the following values:
     * <dl>
     * <dt>0</dt><dd>Unconstrained VBR.</dd>
     * <dt>1</dt><dd>Constrained VBR (default).</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_VBR_CONSTRAINT(IntBuffer value) { return new CTLRequestP(OPUS_GET_VBR_CONSTRAINT_REQUEST, memAddress(value)); }

    /**
     * Configures mono/stereo forcing in the encoder.
     *
     * <p>This can force the encoder to produce packets encoded as either mono or stereo, regardless of the format of the input audio. This is useful when the
     * caller knows that the input signal is currently a mono source embedded in a stereo stream.</p>
     *
     * @param value allowed values:
     * <dl>
     * <dt>{@link #OPUS_AUTO}</dt><dd>Not forced (default)</dd>
     * <dt>1</dt>         <dd>Forced mono</dd>
     * <dt>2</dt>         <dd>Forced stereo</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_FORCE_CHANNELS(int value) { return new CTLRequestI(OPUS_SET_FORCE_CHANNELS_REQUEST, value); }

    /**
     * Gets the encoder's forced channel configuration.
     *
     * @return one of the following values:
     * <dl>
     * <dt>{@link #OPUS_AUTO}</dt><dd>Not forced (default)</dd>
     * <dt>1</dt>         <dd>Forced mono</dd>
     * <dt>2</dt>         <dd>Forced stereo</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_FORCE_CHANNELS(IntBuffer value) { return new CTLRequestP(OPUS_GET_FORCE_CHANNELS_REQUEST, memAddress(value)); }

    /**
     * Configures the maximum bandpass that the encoder will select automatically.
     *
     * <p>Applications should normally use this instead of {@link #OPUS_SET_BANDWIDTH} (leaving that set to the default, {@link #OPUS_AUTO}). This allows the
     * application to set an upper bound based on the type of input it is providing, but still gives the encoder the freedom to reduce the bandpass when the
     * bitrate becomes too low, for better overall quality.</p>
     *
     * @param value allowed values:
     * <dl>
     * <dt>{@link #OPUS_BANDWIDTH_NARROWBAND}</dt>    <dd>4 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_MEDIUMBAND}</dt>    <dd>6 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_WIDEBAND}</dt>      <dd>8 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_SUPERWIDEBAND}</dt><dd>12 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_FULLBAND}</dt>     <dd>20 kHz passband (default)</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_MAX_BANDWIDTH(int value) { return new CTLRequestI(OPUS_SET_MAX_BANDWIDTH_REQUEST, value); }

    /**
     * Gets the encoder's configured maximum allowed bandpass.
     *
     * @return one of the following values:
     * <dl>
     * <dt>{@link #OPUS_BANDWIDTH_NARROWBAND}</dt>    <dd>4 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_MEDIUMBAND}</dt>    <dd>6 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_WIDEBAND}</dt>      <dd>8 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_SUPERWIDEBAND}</dt><dd>12 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_FULLBAND}</dt>     <dd>20 kHz passband (default)</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_MAX_BANDWIDTH(IntBuffer value) { return new CTLRequestP(OPUS_GET_MAX_BANDWIDTH_REQUEST, memAddress(value)); }

    /**
     * Sets the encoder's bandpass to a specific value.
     *
     * <p>This prevents the encoder from automatically selecting the bandpass based on the available bitrate. If an application knows the bandpass of the input
     * audio it is providing, it should normally use {@link #OPUS_SET_MAX_BANDWIDTH} instead, which still gives the encoder the freedom to reduce the bandpass
     * when the bitrate becomes too low, for better overall quality.</p>
     *
     * @param value allowed values:
     * <dl>
     * <dt>{@link #OPUS_AUTO}</dt>                    <dd>(default)</dd>
     * <dt>{@link #OPUS_BANDWIDTH_NARROWBAND}</dt>    <dd>4 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_MEDIUMBAND}</dt>    <dd>6 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_WIDEBAND}</dt>      <dd>8 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_SUPERWIDEBAND}</dt><dd>12 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_FULLBAND}</dt>     <dd>20 kHz passband (default)</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_BANDWIDTH(int value) { return new CTLRequestI(OPUS_SET_BANDWIDTH_REQUEST, value); }

    /**
     * Gets the encoder's configured bandpass or the decoder's last bandpass.
     *
     * @return one of the following values:
     * <dl>
     * <dt>{@link #OPUS_AUTO}</dt>                    <dd>(default)</dd>
     * <dt>{@link #OPUS_BANDWIDTH_NARROWBAND}</dt>    <dd>4 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_MEDIUMBAND}</dt>    <dd>6 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_WIDEBAND}</dt>      <dd>8 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_SUPERWIDEBAND}</dt><dd>12 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_FULLBAND}</dt>     <dd>20 kHz passband (default)</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_BANDWIDTH(IntBuffer value) { return new CTLRequestP(OPUS_GET_BANDWIDTH_REQUEST, memAddress(value)); }

    /**
     * Configures the type of signal being encoded.
     *
     * <p>This is a hint which helps the encoder's mode selection.</p>
     *
     * @param value allowed values:
     * <dl>
     * <dt>{@link #OPUS_AUTO}</dt>        <dd>(default)</dd>
     * <dt>{@link #OPUS_SIGNAL_VOICE}</dt><dd>Bias thresholds towards choosing LPC or Hybrid modes.</dd>
     * <dt>{@link #OPUS_SIGNAL_MUSIC}</dt><dd>Bias thresholds towards choosing MDCT modes.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_SIGNAL(int value) { return new CTLRequestI(OPUS_SET_SIGNAL_REQUEST, value); }

    /**
     * Gets the encoder's configured signal type.
     *
     * @return one of the following values:
     * <dl>
     * <dt>{@link #OPUS_AUTO}</dt>        <dd>(default)</dd>
     * <dt>{@link #OPUS_SIGNAL_VOICE}</dt><dd>Bias thresholds towards choosing LPC or Hybrid modes.</dd>
     * <dt>{@link #OPUS_SIGNAL_MUSIC}</dt><dd>Bias thresholds towards choosing MDCT modes.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_SIGNAL(IntBuffer value) { return new CTLRequestP(OPUS_GET_SIGNAL_REQUEST, memAddress(value)); }

    /**
     * Configures the encoder's intended application.
     *
     * <p>The initial value is a mandatory argument to the encoder_create function.</p>
     *
     * @param value allowed values:
     * <dl>
     * <dt>{@link #OPUS_APPLICATION_VOIP}</dt><dd>Process signal for improved speech intelligibility.</dd>
     * <dt>{@link #OPUS_APPLICATION_AUDIO}</dt><dd>Favor faithfulness to the original input.</dd>
     * <dt>{@link #OPUS_APPLICATION_RESTRICTED_LOWDELAY}</dt><dd>Configure the minimum possible coding delay by disabling certain modes of operation.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_APPLICATION(int value) { return new CTLRequestI(OPUS_SET_APPLICATION_REQUEST, value); }

    /**
     * Gets the encoder's configured application.
     *
     * @return one of the following values:
     * <dl>
     * <dt>{@link #OPUS_APPLICATION_VOIP}</dt><dd>Process signal for improved speech intelligibility.</dd>
     * <dt>{@link #OPUS_APPLICATION_AUDIO}</dt><dd>Favor faithfulness to the original input.</dd>
     * <dt>{@link #OPUS_APPLICATION_RESTRICTED_LOWDELAY}</dt><dd>Configure the minimum possible coding delay by disabling certain modes of operation.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_APPLICATION(IntBuffer value) { return new CTLRequestP(OPUS_GET_APPLICATION_REQUEST, memAddress(value)); }

    /**
     * Gets the total samples of delay added by the entire codec.
     *
     * <p>This can be queried by the encoder and then the provided number of samples can be skipped on from the start of the decoder's output to provide time
     * aligned input and output. From the perspective of a decoding application the real data begins this many samples late.</p>
     *
     * <p>The decoder contribution to this delay is identical for all decoders, but the encoder portion of the delay may vary from implementation to
     * implementation, version to version, or even depend on the encoder's initial configuration. Applications needing delay compensation should call this CTL
     * rather than hard-coding a value.</p>
     *
     * @return number of lookahead samples
     */
    public static CTLRequest OPUS_GET_LOOKAHEAD(IntBuffer value) { return new CTLRequestP(OPUS_GET_LOOKAHEAD_REQUEST, memAddress(value)); }

    /**
     * Configures the encoder's use of inband forward error correction (FEC).
     *
     * <p>Note: This is only applicable to the LPC layer</p>
     *
     * @param value allowed values:
     * <dl>
     * <dt>0</dt><dd>Disable inband FEC (default).</dd>
     * <dt>1</dt><dd>Inband FEC enabled. If the packet loss rate is sufficiently high, Opus will automatically switch to SILK even at high rates to enable use
     * of that FEC.</dd>
     * <dt>2</dt><dd>Inband FEC enabled, but does not necessarily switch to SILK if we have music.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_INBAND_FEC(int value) { return new CTLRequestI(OPUS_SET_INBAND_FEC_REQUEST, value); }

    /**
     * Gets encoder's configured use of inband forward error correction.
     *
     * @return one of the following values:
     * <dl>
     * <dt>0</dt><dd>Inband FEC disabled (default).</dd>
     * <dt>1</dt><dd>Inband FEC enabled. If the packet loss rate is sufficiently high, Opus will automatically switch to SILK even at high rates to enable use
     * of that FEC.</dd>
     * <dt>2</dt><dd>Inband FEC enabled, but does not necessarily switch to SILK if we have music.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_INBAND_FEC(IntBuffer value) { return new CTLRequestP(OPUS_GET_INBAND_FEC_REQUEST, memAddress(value)); }

    /**
     * Configures the encoder's expected packet loss percentage.
     *
     * <p>Higher values trigger progressively more loss resistant behavior in the encoder at the expense of quality at a given bitrate in the absence of packet
     * loss, but greater quality under loss.</p>
     *
     * @param value loss percentage in the range 0-100, inclusive (default: 0)
     */
    public static CTLRequest OPUS_SET_PACKET_LOSS_PERC(int value) { return new CTLRequestI(OPUS_SET_PACKET_LOSS_PERC_REQUEST, value); }

    /**
     * Gets the encoder's configured packet loss percentage.
     *
     * @return the configured loss percentage in the range 0-100, inclusive (default: 0)
     */
    public static CTLRequest OPUS_GET_PACKET_LOSS_PERC(IntBuffer value) { return new CTLRequestP(OPUS_GET_PACKET_LOSS_PERC_REQUEST, memAddress(value)); }

    /**
     * Configures the encoder's use of discontinuous transmission (DTX).
     *
     * <p>Note: This is only applicable to the LPC layer</p>
     *
     * @param value allowed valued:
     * <dl>
     * <dt>0</dt><dd>Disable DTX (default).</dd>
     * <dt>1</dt><dd>Enabled DTX.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_DTX(int value) { return new CTLRequestI(OPUS_SET_DTX_REQUEST, value); }

    /**
     * Gets encoder's configured use of discontinuous transmission.
     *
     * @return one of the following values:
     * <dl>
     * <dt>0</dt><dd>DTX disabled (default).</dd>
     * <dt>1</dt><dd>DTX enabled.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_DTX(IntBuffer value) { return new CTLRequestP(OPUS_GET_DTX_REQUEST, memAddress(value)); }

    /**
     * Configures the depth of signal being encoded.
     *
     * <p>This is a hint which helps the encoder identify silence and near-silence. It represents the number of significant bits of linear intensity below
     * which the signal contains ignorable quantization or other noise.</p>
     *
     * <p>For example, {@code OPUS_SET_LSB_DEPTH(14)} would be an appropriate setting for G.711 u-law input. {@code OPUS_SET_LSB_DEPTH(16)} would be
     * appropriate for 16-bit linear pcm input with opus_encode_float().</p>
     *
     * <p>When using {@link #opus_encode} instead of {@link #opus_encode_float}, or when libopus is compiled for fixed-point, the encoder uses the minimum of
     * the value set here and the value 16.</p>
     *
     * @param value input precision in bits, between 8 and 24 (default: 24).
     */
    public static CTLRequest OPUS_SET_LSB_DEPTH(int value) { return new CTLRequestI(OPUS_SET_LSB_DEPTH_REQUEST, value); }

    /**
     * Gets the encoder's configured signal depth.
     *
     * @return input precision in bits, between 8 and 24 (default: 24).
     */
    public static CTLRequest OPUS_GET_LSB_DEPTH(IntBuffer value) { return new CTLRequestP(OPUS_GET_LSB_DEPTH_REQUEST, memAddress(value)); }

    /**
     * Configures the encoder's use of variable duration frames.
     *
     * <p>When variable duration is enabled, the encoder is free to use a shorter frame size than the one requested in the {@code opus_encode*()} call. It is
     * then the user's responsibility to verify how much audio was encoded by checking the ToC byte of the encoded packet. The part of the audio that was not
     * encoded needs to be resent to the encoder for the next call. Do not use this option unless you <b>really</b> know what you are doing.</p>
     *
     * @param value allowed valued:
     * <dl>
     * <dt>{@link #OPUS_FRAMESIZE_ARG}</dt><dd>Select frame size from the argument (default).</dd>
     * <dt>{@link #OPUS_FRAMESIZE_2_5_MS}</dt><dd>Use 2.5 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_5_MS}</dt><dd>Use 5 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_10_MS}</dt><dd>Use 10 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_20_MS}</dt><dd>Use 20 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_40_MS}</dt><dd>Use 40 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_60_MS}</dt><dd>Use 60 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_80_MS}</dt><dd>Use 80 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_100_MS}</dt><dd>Use 100 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_120_MS}</dt><dd>Use 120 ms frames.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_EXPERT_FRAME_DURATION(int value) { return new CTLRequestI(OPUS_SET_EXPERT_FRAME_DURATION_REQUEST, value); }

    /**
     * Gets the encoder's configured use of variable duration frames.
     *
     * @return one of the following values:
     * <dl>
     * <dt>{@link #OPUS_FRAMESIZE_ARG}</dt><dd>Select frame size from the argument (default).</dd>
     * <dt>{@link #OPUS_FRAMESIZE_2_5_MS}</dt><dd>Use 2.5 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_5_MS}</dt><dd>Use 5 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_10_MS}</dt><dd>Use 10 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_20_MS}</dt><dd>Use 20 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_40_MS}</dt><dd>Use 40 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_60_MS}</dt><dd>Use 60 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_80_MS}</dt><dd>Use 80 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_100_MS}</dt><dd>Use 100 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_120_MS}</dt><dd>Use 120 ms frames.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_EXPERT_FRAME_DURATION(IntBuffer value) { return new CTLRequestP(OPUS_GET_EXPERT_FRAME_DURATION_REQUEST, memAddress(value)); }

    /**
     * If set to 1, disables almost all use of prediction, making frames almost completely independent. This reduces quality.
     *
     * @param value allowed valued:
     * <dl>
     * <dt>0</dt><dd>Enable prediction (default).</dd>
     * <dt>1</dt><dd>Disable prediction.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_PREDICTION_DISABLED(int value) { return new CTLRequestI(OPUS_SET_PREDICTION_DISABLED_REQUEST, value); }

    /**
     * Gets the encoder's configured prediction status.
     *
     * @return one of the following values:
     * <dl>
     * <dt>0</dt><dd>Prediction enabled (default).</dd>
     * <dt>1</dt><dd>Prediction disabled.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_PREDICTION_DISABLED(IntBuffer value) { return new CTLRequestP(OPUS_GET_PREDICTION_DISABLED_REQUEST, memAddress(value)); }

    /** If non-zero, enables Deep Redundancy (DRED) and use the specified maximum number of 10-ms redundant frames. */
    public static CTLRequest OPUS_SET_DRED_DURATION_REQUEST(int value) { return new CTLRequestI(OPUS_SET_DRED_DURATION_REQUEST, value); }

    /** Gets the encoder's configured Deep Redundancy (DRED) maximum number of frames. */
    public static CTLRequest OPUS_GET_DRED_DURATION_REQUEST(IntBuffer value) { return new CTLRequestP(OPUS_GET_DRED_DURATION_REQUEST, memAddress(value)); }

    /** Provide external DNN weights from binary object (only when explicitly built without the weights). */
    public static CTLRequest OPUS_SET_DNN_BLOB_REQUEST(ByteBuffer data, int len) { return new CTLRequestPI(OPUS_SET_DNN_BLOB_REQUEST, memAddress(data), len); }

    /**
     * Gets the final state of the codec's entropy coder.
     *
     * <p>This is used for testing purposes. The encoder and decoder state should be identical after coding a payload (assuming no data corruption or software
     * bugs).</p>
     *
     * @return entropy coder state
     */
    public static CTLRequest OPUS_GET_FINAL_RANGE(IntBuffer value) { return new CTLRequestP(OPUS_GET_FINAL_RANGE_REQUEST, memAddress(value)); }

    /**
     * Gets the sampling rate the encoder or decoder was initialized with.
     *
     * <p>This simply returns the {@code Fs} value passed to {@link #opus_encoder_init} or {@link #opus_decoder_init}.</p>
     *
     * @return sampling rate of encoder or decoder.
     */
    public static CTLRequest OPUS_GET_SAMPLE_RATE(IntBuffer value) { return new CTLRequestP(OPUS_GET_SAMPLE_RATE_REQUEST, memAddress(value)); }

    /**
     * If set to 1, disables the use of phase inversion for intensity stereo, improving the quality of mono downmixes, but slightly reducing normal stereo
     * quality.
     *
     * <p>Disabling phase inversion in the decoder does not comply with RFC 6716, although it does not cause any interoperability issue and is expected to
     * become part of the Opus standard once RFC 6716 is updated by draft-ietf-codec-opus-update.</p>
     *
     * @param value allowed valued:
     * <dl>
     * <dt>0</dt><dd>Enable phase inversion (default).</dd>
     * <dt>1</dt><dd>Disable phase inversion.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_PHASE_INVERSION_DISABLED(int value) { return new CTLRequestI(OPUS_SET_PHASE_INVERSION_DISABLED_REQUEST, value); }

    /**
     * Gets the encoder's configured phase inversion status.
     *
     * @return one of the following values:
     * <dl>
     * <dt>0</dt><dd>Stereo phase inversion enabled (default).</dd>
     * <dt>1</dt><dd>Stereo phase inversion disabled.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_PHASE_INVERSION_DISABLED(IntBuffer value) { return new CTLRequestP(OPUS_GET_PHASE_INVERSION_DISABLED_REQUEST, memAddress(value)); }

    /**
     * Gets the DTX state of the encoder.
     *
     * <p>Returns whether the last encoded frame was either a comfort noise update during DTX or not encoded because of DTX.</p>
     *
     * @return one of the following values:
     * <dl>
     * <dt>0</dt><dd>The encoder is not in DTX.</dd>
     * <dt>1</dt><dd>The encoder is in DTX.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_IN_DTX(IntBuffer value) { return new CTLRequestP(OPUS_GET_IN_DTX_REQUEST, memAddress(value)); }

    /**
     * Configures decoder gain adjustment.
     *
     * <p>Scales the decoded output by a factor specified in Q8 dB units. This has a maximum range of -32768 to 32767 inclusive, and returns
     * {@link #OPUS_BAD_ARG} otherwise. The default is zero indicating no adjustment. This setting survives decoder reset.</p>
     *
     * <p>{@code gain = pow(10, x/(20.0*256))}</p>
     *
     * @param value amount to scale PCM signal by in Q8 dB units.
     */
    public static CTLRequest OPUS_SET_GAIN(int value) { return new CTLRequestI(OPUS_SET_GAIN_REQUEST, value); }

    /**
     * Gets the decoder's configured gain adjustment.
     *
     * @return amount to scale PCM signal by in Q8 dB units.
     */
    public static CTLRequest OPUS_GET_GAIN(IntBuffer value) { return new CTLRequestP(OPUS_GET_GAIN_REQUEST, memAddress(value)); }

    /**
     * Gets the duration (in samples) of the last packet successfully decoded or concealed.
     *
     * @return number of samples (at current sampling rate).
     */
    public static CTLRequest OPUS_GET_LAST_PACKET_DURATION(IntBuffer value) { return new CTLRequestP(OPUS_GET_LAST_PACKET_DURATION_REQUEST, memAddress(value)); }

    /**
     * Gets the pitch of the last decoded frame, if available.
     *
     * <p>This can be used for any post-processing algorithm requiring the use of pitch, e.g. time stretching/shortening. If the last frame was not voiced, or
     * if the pitch was not coded in the frame, then zero is returned.</p>
     *
     * <p>This CTL is only implemented for decoder instances.</p>
     *
     * @return pitch period at 48 kHz (or 0 if not available)
     */
    public static CTLRequest OPUS_GET_PITCH(IntBuffer value) { return new CTLRequestP(OPUS_GET_PITCH_REQUEST, memAddress(value)); }
    """)
}