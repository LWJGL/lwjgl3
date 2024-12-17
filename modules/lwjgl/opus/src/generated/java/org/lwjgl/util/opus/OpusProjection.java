/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.util.opus.Opus.*;

public class OpusProjection {

    /** Contains the function pointers loaded from {@code Opus.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            projection_ambisonics_encoder_get_size = apiGetFunctionAddress(Opus.getLibrary(), "opus_projection_ambisonics_encoder_get_size"),
            projection_ambisonics_encoder_create   = apiGetFunctionAddress(Opus.getLibrary(), "opus_projection_ambisonics_encoder_create"),
            projection_ambisonics_encoder_init     = apiGetFunctionAddress(Opus.getLibrary(), "opus_projection_ambisonics_encoder_init"),
            projection_encode                      = apiGetFunctionAddress(Opus.getLibrary(), "opus_projection_encode"),
            projection_encode_float                = apiGetFunctionAddress(Opus.getLibrary(), "opus_projection_encode_float"),
            projection_encoder_ctl                 = apiGetFunctionAddress(Opus.getLibrary(), "opus_projection_encoder_ctl"),
            projection_encoder_destroy             = apiGetFunctionAddress(Opus.getLibrary(), "opus_projection_encoder_destroy"),
            projection_decoder_get_size            = apiGetFunctionAddress(Opus.getLibrary(), "opus_projection_decoder_get_size"),
            projection_decoder_create              = apiGetFunctionAddress(Opus.getLibrary(), "opus_projection_decoder_create"),
            projection_decoder_init                = apiGetFunctionAddress(Opus.getLibrary(), "opus_projection_decoder_init"),
            projection_decode                      = apiGetFunctionAddress(Opus.getLibrary(), "opus_projection_decode"),
            projection_decode_float                = apiGetFunctionAddress(Opus.getLibrary(), "opus_projection_decode_float"),
            projection_decoder_ctl                 = apiGetFunctionAddress(Opus.getLibrary(), "opus_projection_decoder_ctl"),
            projection_decoder_destroy             = apiGetFunctionAddress(Opus.getLibrary(), "opus_projection_decoder_destroy");

    }

    public static final int
        OPUS_PROJECTION_GET_DEMIXING_MATRIX_GAIN_REQUEST = 6001,
        OPUS_PROJECTION_GET_DEMIXING_MATRIX_SIZE_REQUEST = 6003,
        OPUS_PROJECTION_GET_DEMIXING_MATRIX_REQUEST      = 6005;

    protected OpusProjection() {
        throw new UnsupportedOperationException();
    }

    // --- [ opus_projection_ambisonics_encoder_get_size ] ---

    /** {@code opus_int32 opus_projection_ambisonics_encoder_get_size(int channels, int mapping_family)} */
    @NativeType("opus_int32")
    public static int opus_projection_ambisonics_encoder_get_size(int channels, int mapping_family) {
        long __functionAddress = Functions.projection_ambisonics_encoder_get_size;
        return invokeI(channels, mapping_family, __functionAddress);
    }

    // --- [ opus_projection_ambisonics_encoder_create ] ---

    /** {@code OpusProjectionEncoder * opus_projection_ambisonics_encoder_create(opus_int32 Fs, int channels, int mapping_family, int * streams, int * coupled_streams, int application, int * error)} */
    public static long nopus_projection_ambisonics_encoder_create(int Fs, int channels, int mapping_family, long streams, long coupled_streams, int application, long error) {
        long __functionAddress = Functions.projection_ambisonics_encoder_create;
        return invokePPPP(Fs, channels, mapping_family, streams, coupled_streams, application, error, __functionAddress);
    }

    /** {@code OpusProjectionEncoder * opus_projection_ambisonics_encoder_create(opus_int32 Fs, int channels, int mapping_family, int * streams, int * coupled_streams, int application, int * error)} */
    @NativeType("OpusProjectionEncoder *")
    public static long opus_projection_ambisonics_encoder_create(@NativeType("opus_int32") int Fs, int channels, int mapping_family, @NativeType("int *") IntBuffer streams, @NativeType("int *") IntBuffer coupled_streams, int application, @NativeType("int *") @Nullable IntBuffer error) {
        if (CHECKS) {
            check(streams, 1);
            check(coupled_streams, 1);
            checkSafe(error, 1);
        }
        return nopus_projection_ambisonics_encoder_create(Fs, channels, mapping_family, memAddress(streams), memAddress(coupled_streams), application, memAddressSafe(error));
    }

    // --- [ opus_projection_ambisonics_encoder_init ] ---

    /** {@code int opus_projection_ambisonics_encoder_init(OpusProjectionEncoder * st, opus_int32 Fs, int channels, int mapping_family, int * streams, int * coupled_streams, int application)} */
    public static int nopus_projection_ambisonics_encoder_init(long st, int Fs, int channels, int mapping_family, long streams, long coupled_streams, int application) {
        long __functionAddress = Functions.projection_ambisonics_encoder_init;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, Fs, channels, mapping_family, streams, coupled_streams, application, __functionAddress);
    }

    /** {@code int opus_projection_ambisonics_encoder_init(OpusProjectionEncoder * st, opus_int32 Fs, int channels, int mapping_family, int * streams, int * coupled_streams, int application)} */
    public static int opus_projection_ambisonics_encoder_init(@NativeType("OpusProjectionEncoder *") long st, @NativeType("opus_int32") int Fs, int channels, int mapping_family, @NativeType("int *") IntBuffer streams, @NativeType("int *") IntBuffer coupled_streams, int application) {
        if (CHECKS) {
            check(streams, 1);
            check(coupled_streams, 1);
        }
        return nopus_projection_ambisonics_encoder_init(st, Fs, channels, mapping_family, memAddress(streams), memAddress(coupled_streams), application);
    }

    // --- [ opus_projection_encode ] ---

    /** {@code int opus_projection_encode(OpusProjectionEncoder * st, opus_int16 const * pcm, int frame_size, unsigned char * data, opus_int32 max_data_bytes)} */
    public static int nopus_projection_encode(long st, long pcm, int frame_size, long data, int max_data_bytes) {
        long __functionAddress = Functions.projection_encode;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, pcm, frame_size, data, max_data_bytes, __functionAddress);
    }

    /** {@code int opus_projection_encode(OpusProjectionEncoder * st, opus_int16 const * pcm, int frame_size, unsigned char * data, opus_int32 max_data_bytes)} */
    public static int opus_projection_encode(@NativeType("OpusProjectionEncoder *") long st, @NativeType("opus_int16 const *") ShortBuffer pcm, int frame_size, @NativeType("unsigned char *") ByteBuffer data) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 8 + memGetInt(st) + memGetInt(st + 4)));
        }
        return nopus_projection_encode(st, memAddress(pcm), frame_size, memAddress(data), data.remaining());
    }

    // --- [ opus_projection_encode_float ] ---

    /** {@code int opus_projection_encode_float(OpusProjectionEncoder * st, float const * pcm, int frame_size, unsigned char * data, opus_int32 max_data_bytes)} */
    public static int nopus_projection_encode_float(long st, long pcm, int frame_size, long data, int max_data_bytes) {
        long __functionAddress = Functions.projection_encode_float;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, pcm, frame_size, data, max_data_bytes, __functionAddress);
    }

    /** {@code int opus_projection_encode_float(OpusProjectionEncoder * st, float const * pcm, int frame_size, unsigned char * data, opus_int32 max_data_bytes)} */
    public static int opus_projection_encode_float(@NativeType("OpusProjectionEncoder *") long st, @NativeType("float const *") FloatBuffer pcm, int frame_size, @NativeType("unsigned char *") ByteBuffer data) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 8 + memGetInt(st) + memGetInt(st + 4)));
        }
        return nopus_projection_encode_float(st, memAddress(pcm), frame_size, memAddress(data), data.remaining());
    }

    // --- [ opus_projection_encoder_ctl ] ---

    /** {@code int opus_projection_encoder_ctl(OpusProjectionEncoder * st)} */
    private static int opus_projection_encoder_ctl(@NativeType("OpusProjectionEncoder *") long st) {
        long __functionAddress = Functions.projection_encoder_ctl;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, __functionAddress);
    }

    // --- [ opus_projection_encoder_destroy ] ---

    /** {@code int opus_projection_encoder_destroy(OpusProjectionEncoder * st)} */
    public static int opus_projection_encoder_destroy(@NativeType("OpusProjectionEncoder *") long st) {
        long __functionAddress = Functions.projection_encoder_destroy;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, __functionAddress);
    }

    // --- [ opus_projection_decoder_get_size ] ---

    /** {@code opus_int32 opus_projection_decoder_get_size(int channels, int streams, int coupled_streams)} */
    @NativeType("opus_int32")
    public static int opus_projection_decoder_get_size(int channels, int streams, int coupled_streams) {
        long __functionAddress = Functions.projection_decoder_get_size;
        return invokeI(channels, streams, coupled_streams, __functionAddress);
    }

    // --- [ opus_projection_decoder_create ] ---

    /** {@code OpusProjectionDecoder * opus_projection_decoder_create(opus_int32 Fs, int channels, int streams, int coupled_streams, unsigned char * demixing_matrix, opus_int32 demixing_matrix_size, int * error)} */
    public static long nopus_projection_decoder_create(int Fs, int channels, int streams, int coupled_streams, long demixing_matrix, int demixing_matrix_size, long error) {
        long __functionAddress = Functions.projection_decoder_create;
        return invokePPP(Fs, channels, streams, coupled_streams, demixing_matrix, demixing_matrix_size, error, __functionAddress);
    }

    /** {@code OpusProjectionDecoder * opus_projection_decoder_create(opus_int32 Fs, int channels, int streams, int coupled_streams, unsigned char * demixing_matrix, opus_int32 demixing_matrix_size, int * error)} */
    @NativeType("OpusProjectionDecoder *")
    public static long opus_projection_decoder_create(@NativeType("opus_int32") int Fs, int channels, int streams, int coupled_streams, @NativeType("unsigned char *") ByteBuffer demixing_matrix, @NativeType("int *") @Nullable IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        return nopus_projection_decoder_create(Fs, channels, streams, coupled_streams, memAddress(demixing_matrix), demixing_matrix.remaining(), memAddressSafe(error));
    }

    // --- [ opus_projection_decoder_init ] ---

    /** {@code int opus_projection_decoder_init(OpusProjectionDecoder * st, opus_int32 Fs, int channels, int streams, int coupled_streams, unsigned char * demixing_matrix, opus_int32 demixing_matrix_size)} */
    public static int nopus_projection_decoder_init(long st, int Fs, int channels, int streams, int coupled_streams, long demixing_matrix, int demixing_matrix_size) {
        long __functionAddress = Functions.projection_decoder_init;
        if (CHECKS) {
            check(st);
        }
        return invokePPI(st, Fs, channels, streams, coupled_streams, demixing_matrix, demixing_matrix_size, __functionAddress);
    }

    /** {@code int opus_projection_decoder_init(OpusProjectionDecoder * st, opus_int32 Fs, int channels, int streams, int coupled_streams, unsigned char * demixing_matrix, opus_int32 demixing_matrix_size)} */
    public static int opus_projection_decoder_init(@NativeType("OpusProjectionDecoder *") long st, @NativeType("opus_int32") int Fs, int channels, int streams, int coupled_streams, @NativeType("unsigned char *") ByteBuffer demixing_matrix) {
        return nopus_projection_decoder_init(st, Fs, channels, streams, coupled_streams, memAddress(demixing_matrix), demixing_matrix.remaining());
    }

    // --- [ opus_projection_decode ] ---

    /** {@code int opus_projection_decode(OpusProjectionDecoder * st, unsigned char const * data, opus_int32 len, opus_int16 * pcm, int frame_size, int decode_fec)} */
    public static int nopus_projection_decode(long st, long data, int len, long pcm, int frame_size, int decode_fec) {
        long __functionAddress = Functions.projection_decode;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, data, len, pcm, frame_size, decode_fec, __functionAddress);
    }

    /** {@code int opus_projection_decode(OpusProjectionDecoder * st, unsigned char const * data, opus_int32 len, opus_int16 * pcm, int frame_size, int decode_fec)} */
    public static int opus_projection_decode(@NativeType("OpusProjectionDecoder *") long st, @NativeType("unsigned char const *") @Nullable ByteBuffer data, @NativeType("opus_int16 *") ShortBuffer pcm, int frame_size, int decode_fec) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 4 + memGetInt(st)));
        }
        return nopus_projection_decode(st, memAddressSafe(data), remainingSafe(data), memAddress(pcm), frame_size, decode_fec);
    }

    // --- [ opus_projection_decode_float ] ---

    /** {@code int opus_projection_decode_float(OpusMSDecoder * st, unsigned char const * data, opus_int32 len, float * pcm, int frame_size, int decode_fec)} */
    public static int nopus_projection_decode_float(long st, long data, int len, long pcm, int frame_size, int decode_fec) {
        long __functionAddress = Functions.projection_decode_float;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, data, len, pcm, frame_size, decode_fec, __functionAddress);
    }

    /** {@code int opus_projection_decode_float(OpusMSDecoder * st, unsigned char const * data, opus_int32 len, float * pcm, int frame_size, int decode_fec)} */
    public static int opus_projection_decode_float(@NativeType("OpusMSDecoder *") long st, @NativeType("unsigned char const *") @Nullable ByteBuffer data, @NativeType("float *") FloatBuffer pcm, int frame_size, int decode_fec) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 4 + memGetInt(st)));
        }
        return nopus_projection_decode_float(st, memAddressSafe(data), remainingSafe(data), memAddress(pcm), frame_size, decode_fec);
    }

    // --- [ opus_projection_decoder_ctl ] ---

    /** {@code int opus_projection_decoder_ctl(OpusProjectionDecoder * st)} */
    private static int opus_projection_decoder_ctl(@NativeType("OpusProjectionDecoder *") long st) {
        long __functionAddress = Functions.projection_decoder_ctl;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, __functionAddress);
    }

    // --- [ opus_projection_decoder_destroy ] ---

    /** {@code int opus_projection_decoder_destroy(OpusProjectionDecoder * st)} */
    public static int opus_projection_decoder_destroy(@NativeType("OpusProjectionDecoder *") long st) {
        long __functionAddress = Functions.projection_decoder_destroy;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, __functionAddress);
    }

    /**
     * Performs a CTL function on an projection Opus encoder.
     *
     * @param st      projection encoder state
     * @param request CTL request
     */
    public static int opus_projection_encoder_ctl(@NativeType("OpusProjectionEncoder *") long st, int request) {
        return new CTLRequestV(request).apply(st, Functions.projection_encoder_ctl);
    }

    /**
     * Performs a CTL function on an projection Opus encoder.
     *
     * @param st      projection encoder state
     * @param request CTL request
     */
    public static int opus_projection_encoder_ctl(@NativeType("OpusProjectionEncoder *") long st, CTLRequest request) {
        return request.apply(st, Functions.projection_encoder_ctl);
    }

    /**
     * Performs a CTL function on a projection Opus decoder.
     *
     * @param st      projection decoder state
     * @param request CTL request
     */
    public static int opus_projection_decoder_ctl(@NativeType("OpusProjectionDecoder *") long st, int request) {
        return new CTLRequestV(request).apply(st, Functions.projection_decoder_ctl);
    }

    /**
     * Performs a CTL function on a projection Opus decoder.
     *
     * @param st      projection decoder state
     * @param request CTL request
     */
    public static int opus_projection_decoder_ctl(@NativeType("OpusProjectionDecoder *") long st, CTLRequest request) {
        return request.apply(st, Functions.projection_decoder_ctl);
    }

    /**
     * Gets the gain (in dB. S7.8-format) of the demixing matrix from the encoder.
     *
     * @return the gain (in dB. S7.8-format) of the demixing matrix.
     */
    public static CTLRequest OPUS_PROJECTION_GET_DEMIXING_MATRIX_GAIN(IntBuffer value) { return new CTLRequestP(OPUS_PROJECTION_GET_DEMIXING_MATRIX_GAIN_REQUEST, memAddress(value)); }

    /**
     * Gets the size in bytes of the demixing matrix from the encoder.
     *
     * @return the size in bytes of the demixing matrix.
     */
    public static CTLRequest OPUS_PROJECTION_GET_DEMIXING_MATRIX_SIZE(IntBuffer value) { return new CTLRequestP(OPUS_PROJECTION_GET_DEMIXING_MATRIX_SIZE_REQUEST, memAddress(value)); }

    /**
     * Copies the demixing matrix to the supplied pointer location.
     *
     * @param matrix returns the demixing matrix to the supplied pointer location.
     */
    public static CTLRequest OPUS_PROJECTION_GET_DEMIXING_MATRIX(ByteBuffer matrix) {  return new CTLRequestPI(OPUS_PROJECTION_GET_DEMIXING_MATRIX_REQUEST, memAddress(matrix), matrix.remaining()); }

}