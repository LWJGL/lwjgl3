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
            encode_float                 = apiGetFunctionAddress(OPUS, "opus_encode_float"),
            encoder_destroy              = apiGetFunctionAddress(OPUS, "opus_encoder_destroy"),
            encoder_ctl                  = apiGetFunctionAddress(OPUS, "opus_encoder_ctl"),
            decoder_get_size             = apiGetFunctionAddress(OPUS, "opus_decoder_get_size"),
            decoder_create               = apiGetFunctionAddress(OPUS, "opus_decoder_create"),
            decoder_init                 = apiGetFunctionAddress(OPUS, "opus_decoder_init"),
            decode                       = apiGetFunctionAddress(OPUS, "opus_decode"),
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
        OPUS_SET_DNN_BLOB_REQUEST                 = 4052;

    public static final int
        OPUS_AUTO        = -1000,
        OPUS_BITRATE_MAX = -1;

    public static final int
        OPUS_APPLICATION_VOIP                = 2048,
        OPUS_APPLICATION_AUDIO               = 2049,
        OPUS_APPLICATION_RESTRICTED_LOWDELAY = 2051;

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

}