/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.libffi.LibFFI.*;

public class Opus {

    private static final SharedLibrary OPUS = Library.loadNative(Opus.class, "org.lwjgl.opus", Configuration.OPUS_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("opus")), true);

    /** Contains the function pointers loaded from the opus {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            encoder_get_size             = apiGetFunctionAddress(OPUS, "opus_encoder_get_size"),
            encoder_create               = apiGetFunctionAddress(OPUS, "opus_encoder_create"),
            encoder_init                 = apiGetFunctionAddress(OPUS, "opus_encoder_init"),
            encode                       = apiGetFunctionAddress(OPUS, "opus_encode"),
            encode24                     = apiGetFunctionAddress(OPUS, "opus_encode24"),
            encode_float                 = apiGetFunctionAddress(OPUS, "opus_encode_float"),
            encoder_destroy              = apiGetFunctionAddress(OPUS, "opus_encoder_destroy"),
            encoder_ctl                  = apiGetFunctionAddress(OPUS, "opus_encoder_ctl"),
            decoder_get_size             = apiGetFunctionAddress(OPUS, "opus_decoder_get_size"),
            decoder_create               = apiGetFunctionAddress(OPUS, "opus_decoder_create"),
            decoder_init                 = apiGetFunctionAddress(OPUS, "opus_decoder_init"),
            decode                       = apiGetFunctionAddress(OPUS, "opus_decode"),
            decode24                     = apiGetFunctionAddress(OPUS, "opus_decode24"),
            decode_float                 = apiGetFunctionAddress(OPUS, "opus_decode_float"),
            decoder_ctl                  = apiGetFunctionAddress(OPUS, "opus_decoder_ctl"),
            decoder_destroy              = apiGetFunctionAddress(OPUS, "opus_decoder_destroy"),
            dred_decoder_get_size        = apiGetFunctionAddress(OPUS, "opus_dred_decoder_get_size"),
            dred_decoder_create          = apiGetFunctionAddress(OPUS, "opus_dred_decoder_create"),
            dred_decoder_init            = apiGetFunctionAddress(OPUS, "opus_dred_decoder_init"),
            dred_decoder_destroy         = apiGetFunctionAddress(OPUS, "opus_dred_decoder_destroy"),
            dred_decoder_ctl             = apiGetFunctionAddress(OPUS, "opus_dred_decoder_ctl"),
            dred_get_size                = apiGetFunctionAddress(OPUS, "opus_dred_get_size"),
            dred_alloc                   = apiGetFunctionAddress(OPUS, "opus_dred_alloc"),
            dred_free                    = apiGetFunctionAddress(OPUS, "opus_dred_free"),
            dred_parse                   = apiGetFunctionAddress(OPUS, "opus_dred_parse"),
            dred_process                 = apiGetFunctionAddress(OPUS, "opus_dred_process"),
            decoder_dred_decode          = apiGetFunctionAddress(OPUS, "opus_decoder_dred_decode"),
            decoder_dred_decode24        = apiGetFunctionAddress(OPUS, "opus_decoder_dred_decode24"),
            decoder_dred_decode_float    = apiGetFunctionAddress(OPUS, "opus_decoder_dred_decode_float"),
            packet_parse                 = apiGetFunctionAddress(OPUS, "opus_packet_parse"),
            packet_get_bandwidth         = apiGetFunctionAddress(OPUS, "opus_packet_get_bandwidth"),
            packet_get_samples_per_frame = apiGetFunctionAddress(OPUS, "opus_packet_get_samples_per_frame"),
            packet_get_nb_channels       = apiGetFunctionAddress(OPUS, "opus_packet_get_nb_channels"),
            packet_get_nb_frames         = apiGetFunctionAddress(OPUS, "opus_packet_get_nb_frames"),
            packet_get_nb_samples        = apiGetFunctionAddress(OPUS, "opus_packet_get_nb_samples"),
            packet_has_lbrr              = apiGetFunctionAddress(OPUS, "opus_packet_has_lbrr"),
            decoder_get_nb_samples       = apiGetFunctionAddress(OPUS, "opus_decoder_get_nb_samples"),
            pcm_soft_clip                = apiGetFunctionAddress(OPUS, "opus_pcm_soft_clip"),
            repacketizer_get_size        = apiGetFunctionAddress(OPUS, "opus_repacketizer_get_size"),
            repacketizer_init            = apiGetFunctionAddress(OPUS, "opus_repacketizer_init"),
            repacketizer_create          = apiGetFunctionAddress(OPUS, "opus_repacketizer_create"),
            repacketizer_destroy         = apiGetFunctionAddress(OPUS, "opus_repacketizer_destroy"),
            repacketizer_cat             = apiGetFunctionAddress(OPUS, "opus_repacketizer_cat"),
            repacketizer_out_range       = apiGetFunctionAddress(OPUS, "opus_repacketizer_out_range"),
            repacketizer_get_nb_frames   = apiGetFunctionAddress(OPUS, "opus_repacketizer_get_nb_frames"),
            repacketizer_out             = apiGetFunctionAddress(OPUS, "opus_repacketizer_out"),
            packet_pad                   = apiGetFunctionAddress(OPUS, "opus_packet_pad"),
            packet_unpad                 = apiGetFunctionAddress(OPUS, "opus_packet_unpad"),
            multistream_packet_pad       = apiGetFunctionAddress(OPUS, "opus_multistream_packet_pad"),
            multistream_packet_unpad     = apiGetFunctionAddress(OPUS, "opus_multistream_packet_unpad"),
            strerror                     = apiGetFunctionAddress(OPUS, "opus_strerror"),
            get_version_string           = apiGetFunctionAddress(OPUS, "opus_get_version_string");

    }

    /** Returns the opus {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return OPUS;
    }

    public static final int
        OPUS_OK               = 0,
        OPUS_BAD_ARG          = -1,
        OPUS_BUFFER_TOO_SMALL = -2,
        OPUS_INTERNAL_ERROR   = -3,
        OPUS_INVALID_PACKET   = -4,
        OPUS_UNIMPLEMENTED    = -5,
        OPUS_INVALID_STATE    = -6,
        OPUS_ALLOC_FAIL       = -7;

    public static final int
        OPUS_SET_APPLICATION_REQUEST              = 4000,
        OPUS_GET_APPLICATION_REQUEST              = 4001,
        OPUS_SET_BITRATE_REQUEST                  = 4002,
        OPUS_GET_BITRATE_REQUEST                  = 4003,
        OPUS_SET_MAX_BANDWIDTH_REQUEST            = 4004,
        OPUS_GET_MAX_BANDWIDTH_REQUEST            = 4005,
        OPUS_SET_VBR_REQUEST                      = 4006,
        OPUS_GET_VBR_REQUEST                      = 4007,
        OPUS_SET_BANDWIDTH_REQUEST                = 4008,
        OPUS_GET_BANDWIDTH_REQUEST                = 4009,
        OPUS_SET_COMPLEXITY_REQUEST               = 4010,
        OPUS_GET_COMPLEXITY_REQUEST               = 4011,
        OPUS_SET_INBAND_FEC_REQUEST               = 4012,
        OPUS_GET_INBAND_FEC_REQUEST               = 4013,
        OPUS_SET_PACKET_LOSS_PERC_REQUEST         = 4014,
        OPUS_GET_PACKET_LOSS_PERC_REQUEST         = 4015,
        OPUS_SET_DTX_REQUEST                      = 4016,
        OPUS_GET_DTX_REQUEST                      = 4017,
        OPUS_SET_VBR_CONSTRAINT_REQUEST           = 4020,
        OPUS_GET_VBR_CONSTRAINT_REQUEST           = 4021,
        OPUS_SET_FORCE_CHANNELS_REQUEST           = 4022,
        OPUS_GET_FORCE_CHANNELS_REQUEST           = 4023,
        OPUS_SET_SIGNAL_REQUEST                   = 4024,
        OPUS_GET_SIGNAL_REQUEST                   = 4025,
        OPUS_GET_LOOKAHEAD_REQUEST                = 4027,
        OPUS_RESET_STATE                          = 4028,
        OPUS_GET_SAMPLE_RATE_REQUEST              = 4029,
        OPUS_GET_FINAL_RANGE_REQUEST              = 4031,
        OPUS_GET_PITCH_REQUEST                    = 4033,
        OPUS_SET_GAIN_REQUEST                     = 4034,
        OPUS_GET_GAIN_REQUEST                     = 4045,
        OPUS_SET_LSB_DEPTH_REQUEST                = 4036,
        OPUS_GET_LSB_DEPTH_REQUEST                = 4037,
        OPUS_GET_LAST_PACKET_DURATION_REQUEST     = 4039,
        OPUS_SET_EXPERT_FRAME_DURATION_REQUEST    = 4040,
        OPUS_GET_EXPERT_FRAME_DURATION_REQUEST    = 4041,
        OPUS_SET_PREDICTION_DISABLED_REQUEST      = 4042,
        OPUS_GET_PREDICTION_DISABLED_REQUEST      = 4043,
        OPUS_SET_PHASE_INVERSION_DISABLED_REQUEST = 4046,
        OPUS_GET_PHASE_INVERSION_DISABLED_REQUEST = 4047,
        OPUS_GET_IN_DTX_REQUEST                   = 4049,
        OPUS_SET_DRED_DURATION_REQUEST            = 4050,
        OPUS_GET_DRED_DURATION_REQUEST            = 4051,
        OPUS_SET_DNN_BLOB_REQUEST                 = 4052,
        OPUS_SET_OSCE_BWE_REQUEST                 = 4054,
        OPUS_GET_OSCE_BWE_REQUEST                 = 4055,
        OPUS_SET_QEXT_REQUEST                     = 4056,
        OPUS_GET_QEXT_REQUEST                     = 4057,
        OPUS_SET_IGNORE_EXTENSIONS_REQUEST        = 4058,
        OPUS_GET_IGNORE_EXTENSIONS_REQUEST        = 4059;

    public static final int
        OPUS_AUTO        = -1000,
        OPUS_BITRATE_MAX = -1;

    public static final int
        OPUS_APPLICATION_VOIP                = 2048,
        OPUS_APPLICATION_AUDIO               = 2049,
        OPUS_APPLICATION_RESTRICTED_LOWDELAY = 2051,
        OPUS_APPLICATION_RESTRICTED_SILK     = 2052,
        OPUS_APPLICATION_RESTRICTED_CELT     = 2053;

    public static final int
        OPUS_SIGNAL_VOICE = 3001,
        OPUS_SIGNAL_MUSIC = 3002;

    public static final int
        OPUS_BANDWIDTH_NARROWBAND    = 1101,
        OPUS_BANDWIDTH_MEDIUMBAND    = 1102,
        OPUS_BANDWIDTH_WIDEBAND      = 1103,
        OPUS_BANDWIDTH_SUPERWIDEBAND = 1104,
        OPUS_BANDWIDTH_FULLBAND      = 1105;

    public static final int
        OPUS_FRAMESIZE_ARG    = 5000,
        OPUS_FRAMESIZE_2_5_MS = 5001,
        OPUS_FRAMESIZE_5_MS   = 5002,
        OPUS_FRAMESIZE_10_MS  = 5003,
        OPUS_FRAMESIZE_20_MS  = 5004,
        OPUS_FRAMESIZE_40_MS  = 5005,
        OPUS_FRAMESIZE_60_MS  = 5006,
        OPUS_FRAMESIZE_80_MS  = 5007,
        OPUS_FRAMESIZE_100_MS = 5008,
        OPUS_FRAMESIZE_120_MS = 5009;

    protected Opus() {
        throw new UnsupportedOperationException();
    }

    // --- [ opus_encoder_get_size ] ---

    /** {@code int opus_encoder_get_size(int channels)} */
    public static int opus_encoder_get_size(int channels) {
        long __functionAddress = Functions.encoder_get_size;
        return invokeI(channels, __functionAddress);
    }

    // --- [ opus_encoder_create ] ---

    /** {@code OpusEncoder * opus_encoder_create(opus_int32 Fs, int channels, int application, int * error)} */
    public static long nopus_encoder_create(int Fs, int channels, int application, long error) {
        long __functionAddress = Functions.encoder_create;
        return invokePP(Fs, channels, application, error, __functionAddress);
    }

    /** {@code OpusEncoder * opus_encoder_create(opus_int32 Fs, int channels, int application, int * error)} */
    @NativeType("OpusEncoder *")
    public static long opus_encoder_create(@NativeType("opus_int32") int Fs, int channels, int application, @NativeType("int *") @Nullable IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        return nopus_encoder_create(Fs, channels, application, memAddressSafe(error));
    }

    // --- [ opus_encoder_init ] ---

    /** {@code int opus_encoder_init(OpusEncoder * st, opus_int32 Fs, int channels, int application)} */
    public static int opus_encoder_init(@NativeType("OpusEncoder *") long st, @NativeType("opus_int32") int Fs, int channels, int application) {
        long __functionAddress = Functions.encoder_init;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, Fs, channels, application, __functionAddress);
    }

    // --- [ opus_encode ] ---

    /** {@code opus_int32 opus_encode(OpusEncoder * st, opus_int16 const * pcm, int frame_size, unsigned char * data, opus_int32 max_data_bytes)} */
    public static int nopus_encode(long st, long pcm, int frame_size, long data, int max_data_bytes) {
        long __functionAddress = Functions.encode;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, pcm, frame_size, data, max_data_bytes, __functionAddress);
    }

    /** {@code opus_int32 opus_encode(OpusEncoder * st, opus_int16 const * pcm, int frame_size, unsigned char * data, opus_int32 max_data_bytes)} */
    @NativeType("opus_int32")
    public static int opus_encode(@NativeType("OpusEncoder *") long st, @NativeType("opus_int16 const *") ShortBuffer pcm, int frame_size, @NativeType("unsigned char *") ByteBuffer data) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 8));
        }
        return nopus_encode(st, memAddress(pcm), frame_size, memAddress(data), data.remaining());
    }

    // --- [ opus_encode24 ] ---

    /** {@code opus_int32 opus_encode24(OpusEncoder * st, opus_int32 const * pcm, int frame_size, unsigned char * data, opus_int32 max_data_bytes)} */
    public static int nopus_encode24(long st, long pcm, int frame_size, long data, int max_data_bytes) {
        long __functionAddress = Functions.encode24;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, pcm, frame_size, data, max_data_bytes, __functionAddress);
    }

    /** {@code opus_int32 opus_encode24(OpusEncoder * st, opus_int32 const * pcm, int frame_size, unsigned char * data, opus_int32 max_data_bytes)} */
    @NativeType("opus_int32")
    public static int opus_encode24(@NativeType("OpusEncoder *") long st, @NativeType("opus_int32 const *") IntBuffer pcm, int frame_size, @NativeType("unsigned char *") ByteBuffer data) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 8));
        }
        return nopus_encode24(st, memAddress(pcm), frame_size, memAddress(data), data.remaining());
    }

    // --- [ opus_encode_float ] ---

    /** {@code opus_int32 opus_encode_float(OpusEncoder * st, float const * pcm, int frame_size, unsigned char * data, opus_int32 max_data_bytes)} */
    public static int nopus_encode_float(long st, long pcm, int frame_size, long data, int max_data_bytes) {
        long __functionAddress = Functions.encode_float;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, pcm, frame_size, data, max_data_bytes, __functionAddress);
    }

    /** {@code opus_int32 opus_encode_float(OpusEncoder * st, float const * pcm, int frame_size, unsigned char * data, opus_int32 max_data_bytes)} */
    @NativeType("opus_int32")
    public static int opus_encode_float(@NativeType("OpusEncoder *") long st, @NativeType("float const *") FloatBuffer pcm, int frame_size, @NativeType("unsigned char *") ByteBuffer data) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 8));
        }
        return nopus_encode_float(st, memAddress(pcm), frame_size, memAddress(data), data.remaining());
    }

    // --- [ opus_encoder_destroy ] ---

    /** {@code void opus_encoder_destroy(OpusEncoder * st)} */
    public static void opus_encoder_destroy(@NativeType("OpusEncoder *") long st) {
        long __functionAddress = Functions.encoder_destroy;
        if (CHECKS) {
            check(st);
        }
        invokePV(st, __functionAddress);
    }

    // --- [ opus_encoder_ctl ] ---

    /** {@code int opus_encoder_ctl(OpusEncoder * st)} */
    private static int opus_encoder_ctl(@NativeType("OpusEncoder *") long st) {
        long __functionAddress = Functions.encoder_ctl;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, __functionAddress);
    }

    // --- [ opus_decoder_get_size ] ---

    /** {@code int opus_decoder_get_size(int channels)} */
    public static int opus_decoder_get_size(int channels) {
        long __functionAddress = Functions.decoder_get_size;
        return invokeI(channels, __functionAddress);
    }

    // --- [ opus_decoder_create ] ---

    /** {@code OpusDecoder * opus_decoder_create(opus_int32 Fs, int channels, int * error)} */
    public static long nopus_decoder_create(int Fs, int channels, long error) {
        long __functionAddress = Functions.decoder_create;
        return invokePP(Fs, channels, error, __functionAddress);
    }

    /** {@code OpusDecoder * opus_decoder_create(opus_int32 Fs, int channels, int * error)} */
    @NativeType("OpusDecoder *")
    public static long opus_decoder_create(@NativeType("opus_int32") int Fs, int channels, @NativeType("int *") @Nullable IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        return nopus_decoder_create(Fs, channels, memAddressSafe(error));
    }

    // --- [ opus_decoder_init ] ---

    /** {@code int opus_decoder_init(OpusDecoder * st, opus_int32 Fs, int channels)} */
    public static int opus_decoder_init(@NativeType("OpusDecoder *") long st, @NativeType("opus_int32") int Fs, int channels) {
        long __functionAddress = Functions.decoder_init;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, Fs, channels, __functionAddress);
    }

    // --- [ opus_decode ] ---

    /** {@code int opus_decode(OpusDecoder * st, unsigned char const * data, opus_int32 len, opus_int16 * pcm, int frame_size, int decode_fec)} */
    public static int nopus_decode(long st, long data, int len, long pcm, int frame_size, int decode_fec) {
        long __functionAddress = Functions.decode;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, data, len, pcm, frame_size, decode_fec, __functionAddress);
    }

    /** {@code int opus_decode(OpusDecoder * st, unsigned char const * data, opus_int32 len, opus_int16 * pcm, int frame_size, int decode_fec)} */
    public static int opus_decode(@NativeType("OpusDecoder *") long st, @NativeType("unsigned char const *") @Nullable ByteBuffer data, @NativeType("opus_int16 *") ShortBuffer pcm, int frame_size, int decode_fec) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 8));
        }
        return nopus_decode(st, memAddressSafe(data), remainingSafe(data), memAddress(pcm), frame_size, decode_fec);
    }

    // --- [ opus_decode24 ] ---

    /** {@code int opus_decode24(OpusDecoder * st, unsigned char const * data, opus_int32 len, opus_int32 * pcm, int frame_size, int decode_fec)} */
    public static int nopus_decode24(long st, long data, int len, long pcm, int frame_size, int decode_fec) {
        long __functionAddress = Functions.decode24;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, data, len, pcm, frame_size, decode_fec, __functionAddress);
    }

    /** {@code int opus_decode24(OpusDecoder * st, unsigned char const * data, opus_int32 len, opus_int32 * pcm, int frame_size, int decode_fec)} */
    public static int opus_decode24(@NativeType("OpusDecoder *") long st, @NativeType("unsigned char const *") @Nullable ByteBuffer data, @NativeType("opus_int32 *") IntBuffer pcm, int frame_size, int decode_fec) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 8));
        }
        return nopus_decode24(st, memAddressSafe(data), remainingSafe(data), memAddress(pcm), frame_size, decode_fec);
    }

    // --- [ opus_decode_float ] ---

    /** {@code int opus_decode_float(OpusDecoder * st, unsigned char const * data, opus_int32 len, float * pcm, int frame_size, int decode_fec)} */
    public static int nopus_decode_float(long st, long data, int len, long pcm, int frame_size, int decode_fec) {
        long __functionAddress = Functions.decode_float;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, data, len, pcm, frame_size, decode_fec, __functionAddress);
    }

    /** {@code int opus_decode_float(OpusDecoder * st, unsigned char const * data, opus_int32 len, float * pcm, int frame_size, int decode_fec)} */
    public static int opus_decode_float(@NativeType("OpusDecoder *") long st, @NativeType("unsigned char const *") @Nullable ByteBuffer data, @NativeType("float *") FloatBuffer pcm, int frame_size, int decode_fec) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 8));
        }
        return nopus_decode_float(st, memAddressSafe(data), remainingSafe(data), memAddress(pcm), frame_size, decode_fec);
    }

    // --- [ opus_decoder_ctl ] ---

    /** {@code int opus_decoder_ctl(OpusDecoder * st)} */
    private static int opus_decoder_ctl(@NativeType("OpusDecoder *") long st) {
        long __functionAddress = Functions.decoder_ctl;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, __functionAddress);
    }

    // --- [ opus_decoder_destroy ] ---

    /** {@code void opus_decoder_destroy(OpusDecoder * st)} */
    public static void opus_decoder_destroy(@NativeType("OpusDecoder *") long st) {
        long __functionAddress = Functions.decoder_destroy;
        if (CHECKS) {
            check(st);
        }
        invokePV(st, __functionAddress);
    }

    // --- [ opus_dred_decoder_get_size ] ---

    /** {@code int opus_dred_decoder_get_size(void)} */
    public static int opus_dred_decoder_get_size() {
        long __functionAddress = Functions.dred_decoder_get_size;
        return invokeI(__functionAddress);
    }

    // --- [ opus_dred_decoder_create ] ---

    /** {@code OpusDREDDecoder * opus_dred_decoder_create(int * error)} */
    public static long nopus_dred_decoder_create(long error) {
        long __functionAddress = Functions.dred_decoder_create;
        return invokePP(error, __functionAddress);
    }

    /** {@code OpusDREDDecoder * opus_dred_decoder_create(int * error)} */
    @NativeType("OpusDREDDecoder *")
    public static long opus_dred_decoder_create(@NativeType("int *") @Nullable IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        return nopus_dred_decoder_create(memAddressSafe(error));
    }

    // --- [ opus_dred_decoder_init ] ---

    /** {@code int opus_dred_decoder_init(OpusDREDDecoder * dec)} */
    public static int opus_dred_decoder_init(@NativeType("OpusDREDDecoder *") long dec) {
        long __functionAddress = Functions.dred_decoder_init;
        if (CHECKS) {
            check(dec);
        }
        return invokePI(dec, __functionAddress);
    }

    // --- [ opus_dred_decoder_destroy ] ---

    /** {@code void opus_dred_decoder_destroy(OpusDREDDecoder * dec)} */
    public static void opus_dred_decoder_destroy(@NativeType("OpusDREDDecoder *") long dec) {
        long __functionAddress = Functions.dred_decoder_destroy;
        if (CHECKS) {
            check(dec);
        }
        invokePV(dec, __functionAddress);
    }

    // --- [ opus_dred_decoder_ctl ] ---

    /** {@code int opus_dred_decoder_ctl(OpusDREDDecoder * dred_dec)} */
    private static int opus_dred_decoder_ctl(@NativeType("OpusDREDDecoder *") long dred_dec) {
        long __functionAddress = Functions.dred_decoder_ctl;
        if (CHECKS) {
            check(dred_dec);
        }
        return invokePI(dred_dec, __functionAddress);
    }

    // --- [ opus_dred_get_size ] ---

    /** {@code int opus_dred_get_size(void)} */
    public static int opus_dred_get_size() {
        long __functionAddress = Functions.dred_get_size;
        return invokeI(__functionAddress);
    }

    // --- [ opus_dred_alloc ] ---

    /** {@code OpusDRED * opus_dred_alloc(int * error)} */
    public static long nopus_dred_alloc(long error) {
        long __functionAddress = Functions.dred_alloc;
        return invokePP(error, __functionAddress);
    }

    /** {@code OpusDRED * opus_dred_alloc(int * error)} */
    @NativeType("OpusDRED *")
    public static long opus_dred_alloc(@NativeType("int *") @Nullable IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        return nopus_dred_alloc(memAddressSafe(error));
    }

    // --- [ opus_dred_free ] ---

    /** {@code void opus_dred_free(OpusDRED * dec)} */
    public static void opus_dred_free(@NativeType("OpusDRED *") long dec) {
        long __functionAddress = Functions.dred_free;
        if (CHECKS) {
            check(dec);
        }
        invokePV(dec, __functionAddress);
    }

    // --- [ opus_dred_parse ] ---

    /** {@code int opus_dred_parse(OpusDREDDecoder * dred_dec, OpusDRED * dred, unsigned char const * data, opus_int32 len, opus_int32 max_dred_samples, opus_int32 sampling_rate, int * dred_end, int defer_processing)} */
    public static int nopus_dred_parse(long dred_dec, long dred, long data, int len, int max_dred_samples, int sampling_rate, long dred_end, int defer_processing) {
        long __functionAddress = Functions.dred_parse;
        if (CHECKS) {
            check(dred_dec);
            check(dred);
        }
        return invokePPPPI(dred_dec, dred, data, len, max_dred_samples, sampling_rate, dred_end, defer_processing, __functionAddress);
    }

    /** {@code int opus_dred_parse(OpusDREDDecoder * dred_dec, OpusDRED * dred, unsigned char const * data, opus_int32 len, opus_int32 max_dred_samples, opus_int32 sampling_rate, int * dred_end, int defer_processing)} */
    public static int opus_dred_parse(@NativeType("OpusDREDDecoder *") long dred_dec, @NativeType("OpusDRED *") long dred, @NativeType("unsigned char const *") ByteBuffer data, @NativeType("opus_int32") int max_dred_samples, @NativeType("opus_int32") int sampling_rate, @NativeType("int *") @Nullable IntBuffer dred_end, @NativeType("int") boolean defer_processing) {
        if (CHECKS) {
            checkSafe(dred_end, 1);
        }
        return nopus_dred_parse(dred_dec, dred, memAddress(data), data.remaining(), max_dred_samples, sampling_rate, memAddressSafe(dred_end), defer_processing ? 1 : 0);
    }

    // --- [ opus_dred_process ] ---

    /** {@code int opus_dred_process(OpusDREDDecoder * dred_dec, OpusDRED const * src, OpusDRED * dst)} */
    public static int opus_dred_process(@NativeType("OpusDREDDecoder *") long dred_dec, @NativeType("OpusDRED const *") long src, @NativeType("OpusDRED *") long dst) {
        long __functionAddress = Functions.dred_process;
        if (CHECKS) {
            check(dred_dec);
            check(src);
            check(dst);
        }
        return invokePPPI(dred_dec, src, dst, __functionAddress);
    }

    // --- [ opus_decoder_dred_decode ] ---

    /** {@code int opus_decoder_dred_decode(OpusDecoder * st, OpusDRED const * dred, opus_int32 dred_offset, opus_int16 * pcm, int frame_size)} */
    public static int nopus_decoder_dred_decode(long st, long dred, int dred_offset, long pcm, int frame_size) {
        long __functionAddress = Functions.decoder_dred_decode;
        if (CHECKS) {
            check(st);
            check(dred);
        }
        return invokePPPI(st, dred, dred_offset, pcm, frame_size, __functionAddress);
    }

    /** {@code int opus_decoder_dred_decode(OpusDecoder * st, OpusDRED const * dred, opus_int32 dred_offset, opus_int16 * pcm, int frame_size)} */
    public static int opus_decoder_dred_decode(@NativeType("OpusDecoder *") long st, @NativeType("OpusDRED const *") long dred, @NativeType("opus_int32") int dred_offset, @NativeType("opus_int16 *") ShortBuffer pcm, int frame_size) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 8));
        }
        return nopus_decoder_dred_decode(st, dred, dred_offset, memAddress(pcm), frame_size);
    }

    // --- [ opus_decoder_dred_decode24 ] ---

    /** {@code int opus_decoder_dred_decode24(OpusDecoder * st, OpusDRED const * dred, opus_int32 dred_offset, opus_int32 * pcm, int frame_size)} */
    public static int nopus_decoder_dred_decode24(long st, long dred, int dred_offset, long pcm, int frame_size) {
        long __functionAddress = Functions.decoder_dred_decode24;
        if (CHECKS) {
            check(st);
            check(dred);
        }
        return invokePPPI(st, dred, dred_offset, pcm, frame_size, __functionAddress);
    }

    /** {@code int opus_decoder_dred_decode24(OpusDecoder * st, OpusDRED const * dred, opus_int32 dred_offset, opus_int32 * pcm, int frame_size)} */
    public static int opus_decoder_dred_decode24(@NativeType("OpusDecoder *") long st, @NativeType("OpusDRED const *") long dred, @NativeType("opus_int32") int dred_offset, @NativeType("opus_int32 *") IntBuffer pcm, int frame_size) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 8));
        }
        return nopus_decoder_dred_decode24(st, dred, dred_offset, memAddress(pcm), frame_size);
    }

    // --- [ opus_decoder_dred_decode_float ] ---

    /** {@code int opus_decoder_dred_decode_float(OpusDecoder * st, OpusDRED const * dred, opus_int32 dred_offset, float * pcm, int frame_size)} */
    public static int nopus_decoder_dred_decode_float(long st, long dred, int dred_offset, long pcm, int frame_size) {
        long __functionAddress = Functions.decoder_dred_decode_float;
        if (CHECKS) {
            check(st);
            check(dred);
        }
        return invokePPPI(st, dred, dred_offset, pcm, frame_size, __functionAddress);
    }

    /** {@code int opus_decoder_dred_decode_float(OpusDecoder * st, OpusDRED const * dred, opus_int32 dred_offset, float * pcm, int frame_size)} */
    public static int opus_decoder_dred_decode_float(@NativeType("OpusDecoder *") long st, @NativeType("OpusDRED const *") long dred, @NativeType("opus_int32") int dred_offset, @NativeType("float *") FloatBuffer pcm, int frame_size) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 8));
        }
        return nopus_decoder_dred_decode_float(st, dred, dred_offset, memAddress(pcm), frame_size);
    }

    // --- [ opus_packet_parse ] ---

    /** {@code int opus_packet_parse(unsigned char const * data, opus_int32 len, unsigned char * out_toc, unsigned char const ** frames, opus_int16 * size, int * payload_offset)} */
    public static int nopus_packet_parse(long data, int len, long out_toc, long frames, long size, long payload_offset) {
        long __functionAddress = Functions.packet_parse;
        return invokePPPPPI(data, len, out_toc, frames, size, payload_offset, __functionAddress);
    }

    /** {@code int opus_packet_parse(unsigned char const * data, opus_int32 len, unsigned char * out_toc, unsigned char const ** frames, opus_int16 * size, int * payload_offset)} */
    public static int opus_packet_parse(@NativeType("unsigned char const *") ByteBuffer data, @NativeType("unsigned char *") @Nullable ByteBuffer out_toc, @NativeType("unsigned char const **") @Nullable PointerBuffer frames, @NativeType("opus_int16 *") ShortBuffer size, @NativeType("int *") @Nullable IntBuffer payload_offset) {
        if (CHECKS) {
            checkSafe(out_toc, 1);
            checkSafe(frames, 48);
            check(size, 48);
            checkSafe(payload_offset, 1);
        }
        return nopus_packet_parse(memAddress(data), data.remaining(), memAddressSafe(out_toc), memAddressSafe(frames), memAddress(size), memAddressSafe(payload_offset));
    }

    // --- [ opus_packet_get_bandwidth ] ---

    /** {@code int opus_packet_get_bandwidth(unsigned char const * data)} */
    public static int nopus_packet_get_bandwidth(long data) {
        long __functionAddress = Functions.packet_get_bandwidth;
        return invokePI(data, __functionAddress);
    }

    /** {@code int opus_packet_get_bandwidth(unsigned char const * data)} */
    public static int opus_packet_get_bandwidth(@NativeType("unsigned char const *") ByteBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        return nopus_packet_get_bandwidth(memAddress(data));
    }

    // --- [ opus_packet_get_samples_per_frame ] ---

    /** {@code int opus_packet_get_samples_per_frame(unsigned char const * data, opus_int32 Fs)} */
    public static int nopus_packet_get_samples_per_frame(long data, int Fs) {
        long __functionAddress = Functions.packet_get_samples_per_frame;
        return invokePI(data, Fs, __functionAddress);
    }

    /** {@code int opus_packet_get_samples_per_frame(unsigned char const * data, opus_int32 Fs)} */
    public static int opus_packet_get_samples_per_frame(@NativeType("unsigned char const *") ByteBuffer data, @NativeType("opus_int32") int Fs) {
        if (CHECKS) {
            check(data, 1);
        }
        return nopus_packet_get_samples_per_frame(memAddress(data), Fs);
    }

    // --- [ opus_packet_get_nb_channels ] ---

    /** {@code int opus_packet_get_nb_channels(unsigned char const * data)} */
    public static int nopus_packet_get_nb_channels(long data) {
        long __functionAddress = Functions.packet_get_nb_channels;
        return invokePI(data, __functionAddress);
    }

    /** {@code int opus_packet_get_nb_channels(unsigned char const * data)} */
    public static int opus_packet_get_nb_channels(@NativeType("unsigned char const *") ByteBuffer data) {
        return nopus_packet_get_nb_channels(memAddress(data));
    }

    // --- [ opus_packet_get_nb_frames ] ---

    /** {@code int opus_packet_get_nb_frames(unsigned char const * packet, opus_int32 len)} */
    public static int nopus_packet_get_nb_frames(long packet, int len) {
        long __functionAddress = Functions.packet_get_nb_frames;
        return invokePI(packet, len, __functionAddress);
    }

    /** {@code int opus_packet_get_nb_frames(unsigned char const * packet, opus_int32 len)} */
    public static int opus_packet_get_nb_frames(@NativeType("unsigned char const *") ByteBuffer packet) {
        return nopus_packet_get_nb_frames(memAddress(packet), packet.remaining());
    }

    // --- [ opus_packet_get_nb_samples ] ---

    /** {@code int opus_packet_get_nb_samples(unsigned char const * packet, opus_int32 len, opus_int32 Fs)} */
    public static int nopus_packet_get_nb_samples(long packet, int len, int Fs) {
        long __functionAddress = Functions.packet_get_nb_samples;
        return invokePI(packet, len, Fs, __functionAddress);
    }

    /** {@code int opus_packet_get_nb_samples(unsigned char const * packet, opus_int32 len, opus_int32 Fs)} */
    public static int opus_packet_get_nb_samples(@NativeType("unsigned char const *") ByteBuffer packet, @NativeType("opus_int32") int Fs) {
        return nopus_packet_get_nb_samples(memAddress(packet), packet.remaining(), Fs);
    }

    // --- [ opus_packet_has_lbrr ] ---

    /** {@code int opus_packet_has_lbrr(unsigned char const * packet, opus_int32 len)} */
    public static int nopus_packet_has_lbrr(long packet, int len) {
        long __functionAddress = Functions.packet_has_lbrr;
        return invokePI(packet, len, __functionAddress);
    }

    /** {@code int opus_packet_has_lbrr(unsigned char const * packet, opus_int32 len)} */
    public static int opus_packet_has_lbrr(@NativeType("unsigned char const *") ByteBuffer packet) {
        return nopus_packet_has_lbrr(memAddress(packet), packet.remaining());
    }

    // --- [ opus_decoder_get_nb_samples ] ---

    /** {@code int opus_decoder_get_nb_samples(OpusDecoder const * dec, unsigned char const * packet, opus_int32 len)} */
    public static int nopus_decoder_get_nb_samples(long dec, long packet, int len) {
        long __functionAddress = Functions.decoder_get_nb_samples;
        if (CHECKS) {
            check(dec);
        }
        return invokePPI(dec, packet, len, __functionAddress);
    }

    /** {@code int opus_decoder_get_nb_samples(OpusDecoder const * dec, unsigned char const * packet, opus_int32 len)} */
    public static int opus_decoder_get_nb_samples(@NativeType("OpusDecoder const *") long dec, @NativeType("unsigned char const *") ByteBuffer packet) {
        return nopus_decoder_get_nb_samples(dec, memAddress(packet), packet.remaining());
    }

    // --- [ opus_pcm_soft_clip ] ---

    /** {@code void opus_pcm_soft_clip(float * pcm, int frame_size, int channels, float * softclip_mem)} */
    public static void nopus_pcm_soft_clip(long pcm, int frame_size, int channels, long softclip_mem) {
        long __functionAddress = Functions.pcm_soft_clip;
        invokePPV(pcm, frame_size, channels, softclip_mem, __functionAddress);
    }

    /** {@code void opus_pcm_soft_clip(float * pcm, int frame_size, int channels, float * softclip_mem)} */
    public static void opus_pcm_soft_clip(@NativeType("float *") FloatBuffer pcm, int frame_size, @NativeType("float *") FloatBuffer softclip_mem) {
        if (CHECKS) {
            check(pcm, frame_size * softclip_mem.remaining());
        }
        nopus_pcm_soft_clip(memAddress(pcm), frame_size, softclip_mem.remaining(), memAddress(softclip_mem));
    }

    // --- [ opus_repacketizer_get_size ] ---

    /** {@code int opus_repacketizer_get_size(void)} */
    public static int opus_repacketizer_get_size() {
        long __functionAddress = Functions.repacketizer_get_size;
        return invokeI(__functionAddress);
    }

    // --- [ opus_repacketizer_init ] ---

    /** {@code OpusRepacketizer * opus_repacketizer_init(OpusRepacketizer * rp)} */
    @NativeType("OpusRepacketizer *")
    public static long opus_repacketizer_init(@NativeType("OpusRepacketizer *") long rp) {
        long __functionAddress = Functions.repacketizer_init;
        if (CHECKS) {
            check(rp);
        }
        return invokePP(rp, __functionAddress);
    }

    // --- [ opus_repacketizer_create ] ---

    /** {@code OpusRepacketizer * opus_repacketizer_create(void)} */
    @NativeType("OpusRepacketizer *")
    public static long opus_repacketizer_create() {
        long __functionAddress = Functions.repacketizer_create;
        return invokeP(__functionAddress);
    }

    // --- [ opus_repacketizer_destroy ] ---

    /** {@code void opus_repacketizer_destroy(OpusRepacketizer * rp)} */
    public static void opus_repacketizer_destroy(@NativeType("OpusRepacketizer *") long rp) {
        long __functionAddress = Functions.repacketizer_destroy;
        if (CHECKS) {
            check(rp);
        }
        invokePV(rp, __functionAddress);
    }

    // --- [ opus_repacketizer_cat ] ---

    /** {@code int opus_repacketizer_cat(OpusRepacketizer * rp, unsigned char const * data, opus_int32 len)} */
    public static int nopus_repacketizer_cat(long rp, long data, int len) {
        long __functionAddress = Functions.repacketizer_cat;
        if (CHECKS) {
            check(rp);
        }
        return invokePPI(rp, data, len, __functionAddress);
    }

    /** {@code int opus_repacketizer_cat(OpusRepacketizer * rp, unsigned char const * data, opus_int32 len)} */
    public static int opus_repacketizer_cat(@NativeType("OpusRepacketizer *") long rp, @NativeType("unsigned char const *") ByteBuffer data) {
        return nopus_repacketizer_cat(rp, memAddress(data), data.remaining());
    }

    // --- [ opus_repacketizer_out_range ] ---

    /** {@code opus_int32 opus_repacketizer_out_range(OpusRepacketizer * rp, int begin, int end, unsigned char const * data, opus_int32 maxlen)} */
    public static int nopus_repacketizer_out_range(long rp, int begin, int end, long data, int maxlen) {
        long __functionAddress = Functions.repacketizer_out_range;
        if (CHECKS) {
            check(rp);
        }
        return invokePPI(rp, begin, end, data, maxlen, __functionAddress);
    }

    /** {@code opus_int32 opus_repacketizer_out_range(OpusRepacketizer * rp, int begin, int end, unsigned char const * data, opus_int32 maxlen)} */
    @NativeType("opus_int32")
    public static int opus_repacketizer_out_range(@NativeType("OpusRepacketizer *") long rp, int begin, int end, @NativeType("unsigned char const *") ByteBuffer data) {
        return nopus_repacketizer_out_range(rp, begin, end, memAddress(data), data.remaining());
    }

    // --- [ opus_repacketizer_get_nb_frames ] ---

    /** {@code int opus_repacketizer_get_nb_frames(OpusRepacketizer * rp)} */
    public static int opus_repacketizer_get_nb_frames(@NativeType("OpusRepacketizer *") long rp) {
        long __functionAddress = Functions.repacketizer_get_nb_frames;
        if (CHECKS) {
            check(rp);
        }
        return invokePI(rp, __functionAddress);
    }

    // --- [ opus_repacketizer_out ] ---

    /** {@code opus_int32 opus_repacketizer_out(OpusRepacketizer * rp, unsigned char const * data, opus_int32 maxlen)} */
    public static int nopus_repacketizer_out(long rp, long data, int maxlen) {
        long __functionAddress = Functions.repacketizer_out;
        if (CHECKS) {
            check(rp);
        }
        return invokePPI(rp, data, maxlen, __functionAddress);
    }

    /** {@code opus_int32 opus_repacketizer_out(OpusRepacketizer * rp, unsigned char const * data, opus_int32 maxlen)} */
    @NativeType("opus_int32")
    public static int opus_repacketizer_out(@NativeType("OpusRepacketizer *") long rp, @NativeType("unsigned char const *") ByteBuffer data) {
        return nopus_repacketizer_out(rp, memAddress(data), data.remaining());
    }

    // --- [ opus_packet_pad ] ---

    /** {@code int opus_packet_pad(unsigned char const * data, opus_int32 len, opus_int32 new_len)} */
    public static int nopus_packet_pad(long data, int len, int new_len) {
        long __functionAddress = Functions.packet_pad;
        return invokePI(data, len, new_len, __functionAddress);
    }

    /** {@code int opus_packet_pad(unsigned char const * data, opus_int32 len, opus_int32 new_len)} */
    public static int opus_packet_pad(@NativeType("unsigned char const *") ByteBuffer data, @NativeType("opus_int32") int len, @NativeType("opus_int32") int new_len) {
        if (CHECKS) {
            check(data, Math.max(len, new_len));
        }
        return nopus_packet_pad(memAddress(data), len, new_len);
    }

    // --- [ opus_packet_unpad ] ---

    /** {@code opus_int32 opus_packet_unpad(unsigned char const * data, opus_int32 len)} */
    public static int nopus_packet_unpad(long data, int len) {
        long __functionAddress = Functions.packet_unpad;
        return invokePI(data, len, __functionAddress);
    }

    /** {@code opus_int32 opus_packet_unpad(unsigned char const * data, opus_int32 len)} */
    @NativeType("opus_int32")
    public static int opus_packet_unpad(@NativeType("unsigned char const *") ByteBuffer data, @NativeType("opus_int32") int len) {
        if (CHECKS) {
            check(data, len);
        }
        return nopus_packet_unpad(memAddress(data), len);
    }

    // --- [ opus_multistream_packet_pad ] ---

    /** {@code int opus_multistream_packet_pad(unsigned char const * data, opus_int32 len, opus_int32 new_len, int nb_streams)} */
    public static int nopus_multistream_packet_pad(long data, int len, int new_len, int nb_streams) {
        long __functionAddress = Functions.multistream_packet_pad;
        return invokePI(data, len, new_len, nb_streams, __functionAddress);
    }

    /** {@code int opus_multistream_packet_pad(unsigned char const * data, opus_int32 len, opus_int32 new_len, int nb_streams)} */
    public static int opus_multistream_packet_pad(@NativeType("unsigned char const *") ByteBuffer data, @NativeType("opus_int32") int len, @NativeType("opus_int32") int new_len, int nb_streams) {
        if (CHECKS) {
            check(data, Math.max(len, new_len));
        }
        return nopus_multistream_packet_pad(memAddress(data), len, new_len, nb_streams);
    }

    // --- [ opus_multistream_packet_unpad ] ---

    /** {@code opus_int32 opus_multistream_packet_unpad(unsigned char const * data, opus_int32 len, int nb_streams)} */
    public static int nopus_multistream_packet_unpad(long data, int len, int nb_streams) {
        long __functionAddress = Functions.multistream_packet_unpad;
        return invokePI(data, len, nb_streams, __functionAddress);
    }

    /** {@code opus_int32 opus_multistream_packet_unpad(unsigned char const * data, opus_int32 len, int nb_streams)} */
    @NativeType("opus_int32")
    public static int opus_multistream_packet_unpad(@NativeType("unsigned char const *") ByteBuffer data, @NativeType("opus_int32") int len, int nb_streams) {
        if (CHECKS) {
            check(data, len);
        }
        return nopus_multistream_packet_unpad(memAddress(data), len, nb_streams);
    }

    // --- [ opus_strerror ] ---

    /** {@code char * opus_strerror(int error)} */
    public static long nopus_strerror(int error) {
        long __functionAddress = Functions.strerror;
        return invokeP(error, __functionAddress);
    }

    /** {@code char * opus_strerror(int error)} */
    @NativeType("char *")
    public static @Nullable String opus_strerror(int error) {
        long __result = nopus_strerror(error);
        return memASCIISafe(__result);
    }

    // --- [ opus_get_version_string ] ---

    /** {@code char * opus_get_version_string(void)} */
    public static long nopus_get_version_string() {
        long __functionAddress = Functions.get_version_string;
        return invokeP(__functionAddress);
    }

    /** {@code char * opus_get_version_string(void)} */
    @NativeType("char *")
    public static @Nullable String opus_get_version_string() {
        long __result = nopus_get_version_string();
        return memASCIISafe(__result);
    }

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

}