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

public class OpusMultistream {

    /** Contains the function pointers loaded from {@code Opus.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            multistream_encoder_get_size          = apiGetFunctionAddress(Opus.getLibrary(), "opus_multistream_encoder_get_size"),
            multistream_surround_encoder_get_size = apiGetFunctionAddress(Opus.getLibrary(), "opus_multistream_surround_encoder_get_size"),
            multistream_encoder_create            = apiGetFunctionAddress(Opus.getLibrary(), "opus_multistream_encoder_create"),
            multistream_surround_encoder_create   = apiGetFunctionAddress(Opus.getLibrary(), "opus_multistream_surround_encoder_create"),
            multistream_encoder_init              = apiGetFunctionAddress(Opus.getLibrary(), "opus_multistream_encoder_init"),
            multistream_surround_encoder_init     = apiGetFunctionAddress(Opus.getLibrary(), "opus_multistream_surround_encoder_init"),
            multistream_encode                    = apiGetFunctionAddress(Opus.getLibrary(), "opus_multistream_encode"),
            multistream_encode_float              = apiGetFunctionAddress(Opus.getLibrary(), "opus_multistream_encode_float"),
            multistream_encoder_destroy           = apiGetFunctionAddress(Opus.getLibrary(), "opus_multistream_encoder_destroy"),
            multistream_encoder_ctl               = apiGetFunctionAddress(Opus.getLibrary(), "opus_multistream_encoder_ctl"),
            multistream_decoder_get_size          = apiGetFunctionAddress(Opus.getLibrary(), "opus_multistream_decoder_get_size"),
            multistream_decoder_create            = apiGetFunctionAddress(Opus.getLibrary(), "opus_multistream_decoder_create"),
            multistream_decoder_init              = apiGetFunctionAddress(Opus.getLibrary(), "opus_multistream_decoder_init"),
            multistream_decode                    = apiGetFunctionAddress(Opus.getLibrary(), "opus_multistream_decode"),
            multistream_decode_float              = apiGetFunctionAddress(Opus.getLibrary(), "opus_multistream_decode_float"),
            multistream_decoder_ctl               = apiGetFunctionAddress(Opus.getLibrary(), "opus_multistream_decoder_ctl"),
            multistream_decoder_destroy           = apiGetFunctionAddress(Opus.getLibrary(), "opus_multistream_decoder_destroy");

    }

    public static final int
        OPUS_MULTISTREAM_GET_ENCODER_STATE_REQUEST = 5120,
        OPUS_MULTISTREAM_GET_DECODER_STATE_REQUEST = 5122;

    protected OpusMultistream() {
        throw new UnsupportedOperationException();
    }

    // --- [ opus_multistream_encoder_get_size ] ---

    /** {@code opus_int32 opus_multistream_encoder_get_size(int streams, int coupled_streams)} */
    @NativeType("opus_int32")
    public static int opus_multistream_encoder_get_size(int streams, int coupled_streams) {
        long __functionAddress = Functions.multistream_encoder_get_size;
        return invokeI(streams, coupled_streams, __functionAddress);
    }

    // --- [ opus_multistream_surround_encoder_get_size ] ---

    /** {@code opus_int32 opus_multistream_surround_encoder_get_size(int channels, int mapping_family)} */
    @NativeType("opus_int32")
    public static int opus_multistream_surround_encoder_get_size(int channels, int mapping_family) {
        long __functionAddress = Functions.multistream_surround_encoder_get_size;
        return invokeI(channels, mapping_family, __functionAddress);
    }

    // --- [ opus_multistream_encoder_create ] ---

    /** {@code OpusMSEncoder * opus_multistream_encoder_create(opus_int32 Fs, int channels, int streams, int coupled_streams, unsigned char const * mapping, int application, int * error)} */
    public static long nopus_multistream_encoder_create(int Fs, int channels, int streams, int coupled_streams, long mapping, int application, long error) {
        long __functionAddress = Functions.multistream_encoder_create;
        return invokePPP(Fs, channels, streams, coupled_streams, mapping, application, error, __functionAddress);
    }

    /** {@code OpusMSEncoder * opus_multistream_encoder_create(opus_int32 Fs, int channels, int streams, int coupled_streams, unsigned char const * mapping, int application, int * error)} */
    @NativeType("OpusMSEncoder *")
    public static long opus_multistream_encoder_create(@NativeType("opus_int32") int Fs, int streams, int coupled_streams, @NativeType("unsigned char const *") ByteBuffer mapping, int application, @NativeType("int *") @Nullable IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        return nopus_multistream_encoder_create(Fs, mapping.remaining(), streams, coupled_streams, memAddress(mapping), application, memAddressSafe(error));
    }

    // --- [ opus_multistream_surround_encoder_create ] ---

    /** {@code OpusMSEncoder * opus_multistream_surround_encoder_create(opus_int32 Fs, int channels, int mapping_family, int * streams, int * coupled_streams, unsigned char * mapping, int application, int * error)} */
    public static long nopus_multistream_surround_encoder_create(int Fs, int channels, int mapping_family, long streams, long coupled_streams, long mapping, int application, long error) {
        long __functionAddress = Functions.multistream_surround_encoder_create;
        return invokePPPPP(Fs, channels, mapping_family, streams, coupled_streams, mapping, application, error, __functionAddress);
    }

    /** {@code OpusMSEncoder * opus_multistream_surround_encoder_create(opus_int32 Fs, int channels, int mapping_family, int * streams, int * coupled_streams, unsigned char * mapping, int application, int * error)} */
    @NativeType("OpusMSEncoder *")
    public static long opus_multistream_surround_encoder_create(@NativeType("opus_int32") int Fs, int mapping_family, @NativeType("int *") IntBuffer streams, @NativeType("int *") IntBuffer coupled_streams, @NativeType("unsigned char *") ByteBuffer mapping, int application, @NativeType("int *") @Nullable IntBuffer error) {
        if (CHECKS) {
            check(streams, 1);
            check(coupled_streams, 1);
            checkSafe(error, 1);
        }
        return nopus_multistream_surround_encoder_create(Fs, mapping.remaining(), mapping_family, memAddress(streams), memAddress(coupled_streams), memAddress(mapping), application, memAddressSafe(error));
    }

    // --- [ opus_multistream_encoder_init ] ---

    /** {@code int opus_multistream_encoder_init(OpusMSEncoder * st, opus_int32 Fs, int channels, int streams, int coupled_streams, unsigned char const * mapping, int application)} */
    public static int nopus_multistream_encoder_init(long st, int Fs, int channels, int streams, int coupled_streams, long mapping, int application) {
        long __functionAddress = Functions.multistream_encoder_init;
        if (CHECKS) {
            check(st);
        }
        return invokePPI(st, Fs, channels, streams, coupled_streams, mapping, application, __functionAddress);
    }

    /** {@code int opus_multistream_encoder_init(OpusMSEncoder * st, opus_int32 Fs, int channels, int streams, int coupled_streams, unsigned char const * mapping, int application)} */
    public static int opus_multistream_encoder_init(@NativeType("OpusMSEncoder *") long st, @NativeType("opus_int32") int Fs, int streams, int coupled_streams, @NativeType("unsigned char const *") ByteBuffer mapping, int application) {
        return nopus_multistream_encoder_init(st, Fs, mapping.remaining(), streams, coupled_streams, memAddress(mapping), application);
    }

    // --- [ opus_multistream_surround_encoder_init ] ---

    /** {@code int opus_multistream_surround_encoder_init(OpusMSEncoder * st, opus_int32 Fs, int channels, int * streams, int * coupled_streams, unsigned char const * mapping, int application)} */
    public static int nopus_multistream_surround_encoder_init(long st, int Fs, int channels, long streams, long coupled_streams, long mapping, int application) {
        long __functionAddress = Functions.multistream_surround_encoder_init;
        if (CHECKS) {
            check(st);
        }
        return invokePPPPI(st, Fs, channels, streams, coupled_streams, mapping, application, __functionAddress);
    }

    /** {@code int opus_multistream_surround_encoder_init(OpusMSEncoder * st, opus_int32 Fs, int channels, int * streams, int * coupled_streams, unsigned char const * mapping, int application)} */
    public static int opus_multistream_surround_encoder_init(@NativeType("OpusMSEncoder *") long st, @NativeType("opus_int32") int Fs, @NativeType("int *") IntBuffer streams, @NativeType("int *") IntBuffer coupled_streams, @NativeType("unsigned char const *") ByteBuffer mapping, int application) {
        if (CHECKS) {
            check(streams, 1);
            check(coupled_streams, 1);
        }
        return nopus_multistream_surround_encoder_init(st, Fs, mapping.remaining(), memAddress(streams), memAddress(coupled_streams), memAddress(mapping), application);
    }

    // --- [ opus_multistream_encode ] ---

    /** {@code int opus_multistream_encode(OpusMSEncoder * st, opus_int16 const * pcm, int frame_size, unsigned char * data, opus_int32 max_data_bytes)} */
    public static int nopus_multistream_encode(long st, long pcm, int frame_size, long data, int max_data_bytes) {
        long __functionAddress = Functions.multistream_encode;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, pcm, frame_size, data, max_data_bytes, __functionAddress);
    }

    /** {@code int opus_multistream_encode(OpusMSEncoder * st, opus_int16 const * pcm, int frame_size, unsigned char * data, opus_int32 max_data_bytes)} */
    public static int opus_multistream_encode(@NativeType("OpusMSEncoder *") long st, @NativeType("opus_int16 const *") ShortBuffer pcm, int frame_size, @NativeType("unsigned char *") ByteBuffer data) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st));
        }
        return nopus_multistream_encode(st, memAddress(pcm), frame_size, memAddress(data), data.remaining());
    }

    // --- [ opus_multistream_encode_float ] ---

    /** {@code int opus_multistream_encode_float(OpusMSEncoder * st, float const * pcm, int frame_size, unsigned char * data, opus_int32 max_data_bytes)} */
    public static int nopus_multistream_encode_float(long st, long pcm, int frame_size, long data, int max_data_bytes) {
        long __functionAddress = Functions.multistream_encode_float;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, pcm, frame_size, data, max_data_bytes, __functionAddress);
    }

    /** {@code int opus_multistream_encode_float(OpusMSEncoder * st, float const * pcm, int frame_size, unsigned char * data, opus_int32 max_data_bytes)} */
    public static int opus_multistream_encode_float(@NativeType("OpusMSEncoder *") long st, @NativeType("float const *") FloatBuffer pcm, int frame_size, @NativeType("unsigned char *") ByteBuffer data) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st));
        }
        return nopus_multistream_encode_float(st, memAddress(pcm), frame_size, memAddress(data), data.remaining());
    }

    // --- [ opus_multistream_encoder_destroy ] ---

    /** {@code void opus_multistream_encoder_destroy(OpusMSEncoder * st)} */
    public static void opus_multistream_encoder_destroy(@NativeType("OpusMSEncoder *") long st) {
        long __functionAddress = Functions.multistream_encoder_destroy;
        if (CHECKS) {
            check(st);
        }
        invokePV(st, __functionAddress);
    }

    // --- [ opus_multistream_encoder_ctl ] ---

    /** {@code int opus_multistream_encoder_ctl(OpusMSEncoder * st)} */
    private static int opus_multistream_encoder_ctl(@NativeType("OpusMSEncoder *") long st) {
        long __functionAddress = Functions.multistream_encoder_ctl;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, __functionAddress);
    }

    // --- [ opus_multistream_decoder_get_size ] ---

    /** {@code opus_int32 opus_multistream_decoder_get_size(int streams, int coupled_streams)} */
    @NativeType("opus_int32")
    public static int opus_multistream_decoder_get_size(int streams, int coupled_streams) {
        long __functionAddress = Functions.multistream_decoder_get_size;
        return invokeI(streams, coupled_streams, __functionAddress);
    }

    // --- [ opus_multistream_decoder_create ] ---

    /** {@code OpusMSDecoder * opus_multistream_decoder_create(opus_int32 Fs, int channels, int streams, int coupled_streams, unsigned char const * mapping, int * error)} */
    public static long nopus_multistream_decoder_create(int Fs, int channels, int streams, int coupled_streams, long mapping, long error) {
        long __functionAddress = Functions.multistream_decoder_create;
        return invokePPP(Fs, channels, streams, coupled_streams, mapping, error, __functionAddress);
    }

    /** {@code OpusMSDecoder * opus_multistream_decoder_create(opus_int32 Fs, int channels, int streams, int coupled_streams, unsigned char const * mapping, int * error)} */
    @NativeType("OpusMSDecoder *")
    public static long opus_multistream_decoder_create(@NativeType("opus_int32") int Fs, int streams, int coupled_streams, @NativeType("unsigned char const *") ByteBuffer mapping, @NativeType("int *") @Nullable IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        return nopus_multistream_decoder_create(Fs, mapping.remaining(), streams, coupled_streams, memAddress(mapping), memAddressSafe(error));
    }

    // --- [ opus_multistream_decoder_init ] ---

    /** {@code int opus_multistream_decoder_init(OpusMSDecoder * st, opus_int32 Fs, int channels, int streams, int coupled_streams, unsigned char const * mapping)} */
    public static int nopus_multistream_decoder_init(long st, int Fs, int channels, int streams, int coupled_streams, long mapping) {
        long __functionAddress = Functions.multistream_decoder_init;
        if (CHECKS) {
            check(st);
        }
        return invokePPI(st, Fs, channels, streams, coupled_streams, mapping, __functionAddress);
    }

    /** {@code int opus_multistream_decoder_init(OpusMSDecoder * st, opus_int32 Fs, int channels, int streams, int coupled_streams, unsigned char const * mapping)} */
    public static int opus_multistream_decoder_init(@NativeType("OpusMSDecoder *") long st, @NativeType("opus_int32") int Fs, int streams, int coupled_streams, @NativeType("unsigned char const *") ByteBuffer mapping) {
        return nopus_multistream_decoder_init(st, Fs, mapping.remaining(), streams, coupled_streams, memAddress(mapping));
    }

    // --- [ opus_multistream_decode ] ---

    /** {@code int opus_multistream_decode(OpusMSDecoder * st, unsigned char const * data, opus_int32 len, opus_int16 * pcm, int frame_size, int decode_fec)} */
    public static int nopus_multistream_decode(long st, long data, int len, long pcm, int frame_size, int decode_fec) {
        long __functionAddress = Functions.multistream_decode;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, data, len, pcm, frame_size, decode_fec, __functionAddress);
    }

    /** {@code int opus_multistream_decode(OpusMSDecoder * st, unsigned char const * data, opus_int32 len, opus_int16 * pcm, int frame_size, int decode_fec)} */
    public static int opus_multistream_decode(@NativeType("OpusMSDecoder *") long st, @NativeType("unsigned char const *") @Nullable ByteBuffer data, @NativeType("opus_int16 *") ShortBuffer pcm, int frame_size, int decode_fec) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st));
        }
        return nopus_multistream_decode(st, memAddressSafe(data), remainingSafe(data), memAddress(pcm), frame_size, decode_fec);
    }

    // --- [ opus_multistream_decode_float ] ---

    /** {@code int opus_multistream_decode_float(OpusMSDecoder * st, unsigned char const * data, opus_int32 len, float * pcm, int frame_size, int decode_fec)} */
    public static int nopus_multistream_decode_float(long st, long data, int len, long pcm, int frame_size, int decode_fec) {
        long __functionAddress = Functions.multistream_decode_float;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, data, len, pcm, frame_size, decode_fec, __functionAddress);
    }

    /** {@code int opus_multistream_decode_float(OpusMSDecoder * st, unsigned char const * data, opus_int32 len, float * pcm, int frame_size, int decode_fec)} */
    public static int opus_multistream_decode_float(@NativeType("OpusMSDecoder *") long st, @NativeType("unsigned char const *") @Nullable ByteBuffer data, @NativeType("float *") FloatBuffer pcm, int frame_size, int decode_fec) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st));
        }
        return nopus_multistream_decode_float(st, memAddressSafe(data), remainingSafe(data), memAddress(pcm), frame_size, decode_fec);
    }

    // --- [ opus_multistream_decoder_ctl ] ---

    /** {@code int opus_multistream_decoder_ctl(OpusMSDecoder * st)} */
    private static int opus_multistream_decoder_ctl(@NativeType("OpusMSDecoder *") long st) {
        long __functionAddress = Functions.multistream_decoder_ctl;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, __functionAddress);
    }

    // --- [ opus_multistream_decoder_destroy ] ---

    /** {@code void opus_multistream_decoder_destroy(OpusMSDecoder * st)} */
    public static void opus_multistream_decoder_destroy(@NativeType("OpusMSDecoder *") long st) {
        long __functionAddress = Functions.multistream_decoder_destroy;
        if (CHECKS) {
            check(st);
        }
        invokePV(st, __functionAddress);
    }

    /**
     * Performs a CTL function on an multistream Opus encoder.
     *
     * @param st      encoder state
     * @param request CTL request
     */
    public static int opus_multistream_encoder_ctl(@NativeType("OpusMSEncoder *") long st, int request) {
        return new CTLRequestV(request).apply(st, Functions.multistream_encoder_ctl);
    }

    /**
     * Performs a CTL function on an multistream Opus encoder.
     *
     * @param st      encoder state
     * @param request CTL request
     */
    public static int opus_multistream_encoder_ctl(@NativeType("OpusMSEncoder *") long st, CTLRequest request) {
        return request.apply(st, Functions.multistream_encoder_ctl);
    }

    /**
     * Performs a CTL function on a multistream Opus decoder.
     *
     * @param st      decoder state
     * @param request CTL request
     */
    public static int opus_multistream_decoder_ctl(@NativeType("OpusMSDecoder *") long st, int request) {
        return new CTLRequestV(request).apply(st, Functions.multistream_decoder_ctl);
    }

    /**
     * Performs a CTL function on a multistream Opus decoder.
     *
     * @param st      decoder state
     * @param request CTL request
     */
    public static int opus_multistream_decoder_ctl(@NativeType("OpusMSDecoder *") long st, CTLRequest request) {
        return request.apply(st, Functions.multistream_decoder_ctl);
    }

}