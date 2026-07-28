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
        /*#define OPUS_GET_DNN_BLOB_REQUEST 4053 */
        "SET_OSCE_BWE_REQUEST".enum("4054"),
        "GET_OSCE_BWE_REQUEST".enum,
        "SET_QEXT_REQUEST".enum,
        "GET_QEXT_REQUEST".enum,
        "SET_IGNORE_EXTENSIONS_REQUEST".enum,
        "GET_IGNORE_EXTENSIONS_REQUEST".enum
    )

    IntConstant(
        "AUTO".."-1000",
        "BITRATE_MAX".."-1"
    )

    EnumConstant(
        "APPLICATION_VOIP".enum("2048"),
        "APPLICATION_AUDIO".enum,
        "APPLICATION_RESTRICTED_LOWDELAY".enum("2051"),
        "APPLICATION_RESTRICTED_SILK".enum,
        "APPLICATION_RESTRICTED_CELT".enum
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
        "encode24",

        OpusEncoder.p("st"),
        Check(
            // Reading OpusEncoder internal state here
            "frame_size * memGetInt(st + 8)"
        )..opus_int32.const.p("pcm"),
        int("frame_size") ,
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
        "decode24",

        OpusDecoder.p("st"),
        nullable..unsigned_char.const.p("data"),
        AutoSize("data")..opus_int32("len"),
        Check(
            // Reading OpusDecoder internal state here
            "frame_size * memGetInt(st + 8)"
        )..opus_int32.p("pcm"),
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
        "decoder_dred_decode24",

        OpusDecoder.p("st"),
        OpusDRED.const.p("dred"),
        opus_int32("dred_offset"),
        Check(
            // Reading OpusDecoder internal state here
            "frame_size * memGetInt(st + 8)"
        )..opus_int32.p("pcm"),
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

    public static int opus_encoder_ctl(@NativeType("OpusEncoder *") long st, int request) {
        return new CTLRequestV(request).apply(st, Functions.encoder_ctl);
    }

    public static int opus_encoder_ctl(@NativeType("OpusEncoder *") long st, CTLRequest request) {
        return request.apply(st, Functions.encoder_ctl);
    }

    public static int opus_decoder_ctl(@NativeType("OpusDecoder *") long st, int request) {
        return new CTLRequestV(request).apply(st, Functions.decoder_ctl);
    }

    public static int opus_decoder_ctl(@NativeType("OpusDecoder *") long st, CTLRequest request) {
        return request.apply(st, Functions.decoder_ctl);
    }

    public static int opus_dred_decoder_ctl(@NativeType("OpusDredDecoder *") long dred_dec, int request) {
        return new CTLRequestV(request).apply(dred_dec, Functions.dred_decoder_ctl);
    }

    public static int opus_dred_decoder_ctl(@NativeType("OpusDredDecoder *") long dred_dec, CTLRequest request) {
        return request.apply(dred_dec, Functions.dred_decoder_ctl);
    }

    public static CTLRequest OPUS_SET_COMPLEXITY(int value) { return new CTLRequestI(OPUS_SET_COMPLEXITY_REQUEST, value); }
    public static CTLRequest OPUS_GET_COMPLEXITY(IntBuffer value) { return new CTLRequestP(OPUS_GET_COMPLEXITY_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_SET_BITRATE(int value) { return new CTLRequestI(OPUS_SET_BITRATE_REQUEST, value); }
    public static CTLRequest OPUS_GET_BITRATE(IntBuffer value) { return new CTLRequestP(OPUS_GET_BITRATE_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_SET_VBR(int value) { return new CTLRequestI(OPUS_SET_VBR_REQUEST, value); }
    public static CTLRequest OPUS_GET_VBR(IntBuffer value) { return new CTLRequestP(OPUS_GET_VBR_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_SET_VBR_CONSTRAINT(int value) { return new CTLRequestI(OPUS_SET_VBR_CONSTRAINT_REQUEST, value); }
    public static CTLRequest OPUS_GET_VBR_CONSTRAINT(IntBuffer value) { return new CTLRequestP(OPUS_GET_VBR_CONSTRAINT_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_SET_FORCE_CHANNELS(int value) { return new CTLRequestI(OPUS_SET_FORCE_CHANNELS_REQUEST, value); }
    public static CTLRequest OPUS_GET_FORCE_CHANNELS(IntBuffer value) { return new CTLRequestP(OPUS_GET_FORCE_CHANNELS_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_SET_MAX_BANDWIDTH(int value) { return new CTLRequestI(OPUS_SET_MAX_BANDWIDTH_REQUEST, value); }
    public static CTLRequest OPUS_GET_MAX_BANDWIDTH(IntBuffer value) { return new CTLRequestP(OPUS_GET_MAX_BANDWIDTH_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_SET_BANDWIDTH(int value) { return new CTLRequestI(OPUS_SET_BANDWIDTH_REQUEST, value); }
    public static CTLRequest OPUS_GET_BANDWIDTH(IntBuffer value) { return new CTLRequestP(OPUS_GET_BANDWIDTH_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_SET_SIGNAL(int value) { return new CTLRequestI(OPUS_SET_SIGNAL_REQUEST, value); }
    public static CTLRequest OPUS_GET_SIGNAL(IntBuffer value) { return new CTLRequestP(OPUS_GET_SIGNAL_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_SET_APPLICATION(int value) { return new CTLRequestI(OPUS_SET_APPLICATION_REQUEST, value); }
    public static CTLRequest OPUS_GET_APPLICATION(IntBuffer value) { return new CTLRequestP(OPUS_GET_APPLICATION_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_GET_LOOKAHEAD(IntBuffer value) { return new CTLRequestP(OPUS_GET_LOOKAHEAD_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_SET_INBAND_FEC(int value) { return new CTLRequestI(OPUS_SET_INBAND_FEC_REQUEST, value); }
    public static CTLRequest OPUS_GET_INBAND_FEC(IntBuffer value) { return new CTLRequestP(OPUS_GET_INBAND_FEC_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_SET_PACKET_LOSS_PERC(int value) { return new CTLRequestI(OPUS_SET_PACKET_LOSS_PERC_REQUEST, value); }
    public static CTLRequest OPUS_GET_PACKET_LOSS_PERC(IntBuffer value) { return new CTLRequestP(OPUS_GET_PACKET_LOSS_PERC_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_SET_DTX(int value) { return new CTLRequestI(OPUS_SET_DTX_REQUEST, value); }
    public static CTLRequest OPUS_GET_DTX(IntBuffer value) { return new CTLRequestP(OPUS_GET_DTX_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_SET_LSB_DEPTH(int value) { return new CTLRequestI(OPUS_SET_LSB_DEPTH_REQUEST, value); }
    public static CTLRequest OPUS_GET_LSB_DEPTH(IntBuffer value) { return new CTLRequestP(OPUS_GET_LSB_DEPTH_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_SET_EXPERT_FRAME_DURATION(int value) { return new CTLRequestI(OPUS_SET_EXPERT_FRAME_DURATION_REQUEST, value); }
    public static CTLRequest OPUS_GET_EXPERT_FRAME_DURATION(IntBuffer value) { return new CTLRequestP(OPUS_GET_EXPERT_FRAME_DURATION_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_SET_PREDICTION_DISABLED(int value) { return new CTLRequestI(OPUS_SET_PREDICTION_DISABLED_REQUEST, value); }
    public static CTLRequest OPUS_GET_PREDICTION_DISABLED(IntBuffer value) { return new CTLRequestP(OPUS_GET_PREDICTION_DISABLED_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_SET_DRED_DURATION_REQUEST(int value) { return new CTLRequestI(OPUS_SET_DRED_DURATION_REQUEST, value); }
    public static CTLRequest OPUS_GET_DRED_DURATION_REQUEST(IntBuffer value) { return new CTLRequestP(OPUS_GET_DRED_DURATION_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_SET_DNN_BLOB_REQUEST(ByteBuffer data, int len) { return new CTLRequestPI(OPUS_SET_DNN_BLOB_REQUEST, memAddress(data), len); }

    public static CTLRequest OPUS_SET_QEXT(int value) { return new CTLRequestI(OPUS_SET_QEXT_REQUEST, value); }
    public static CTLRequest OPUS_GET_QEXT(IntBuffer value) { return new CTLRequestP(OPUS_GET_QEXT_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_GET_FINAL_RANGE(IntBuffer value) { return new CTLRequestP(OPUS_GET_FINAL_RANGE_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_GET_SAMPLE_RATE(IntBuffer value) { return new CTLRequestP(OPUS_GET_SAMPLE_RATE_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_SET_PHASE_INVERSION_DISABLED(int value) { return new CTLRequestI(OPUS_SET_PHASE_INVERSION_DISABLED_REQUEST, value); }
    public static CTLRequest OPUS_GET_PHASE_INVERSION_DISABLED(IntBuffer value) { return new CTLRequestP(OPUS_GET_PHASE_INVERSION_DISABLED_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_GET_IN_DTX(IntBuffer value) { return new CTLRequestP(OPUS_GET_IN_DTX_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_SET_GAIN(int value) { return new CTLRequestI(OPUS_SET_GAIN_REQUEST, value); }
    public static CTLRequest OPUS_GET_GAIN(IntBuffer value) { return new CTLRequestP(OPUS_GET_GAIN_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_GET_LAST_PACKET_DURATION(IntBuffer value) { return new CTLRequestP(OPUS_GET_LAST_PACKET_DURATION_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_GET_PITCH(IntBuffer value) { return new CTLRequestP(OPUS_GET_PITCH_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_SET_OSCE_BWE(int value) { return new CTLRequestI(OPUS_SET_OSCE_BWE_REQUEST, value); }
    public static CTLRequest OPUS_GET_OSCE_BWE(IntBuffer value) { return new CTLRequestP(OPUS_GET_OSCE_BWE_REQUEST, memAddress(value)); }

    public static CTLRequest OPUS_SET_IGNORE_EXTENSIONS(int value) { return new CTLRequestI(OPUS_SET_IGNORE_EXTENSIONS_REQUEST, value); }
    public static CTLRequest OPUS_GET_IGNORE_EXTENSIONS(IntBuffer value) { return new CTLRequestP(OPUS_GET_IGNORE_EXTENSIONS_REQUEST, memAddress(value)); }
    """)
}