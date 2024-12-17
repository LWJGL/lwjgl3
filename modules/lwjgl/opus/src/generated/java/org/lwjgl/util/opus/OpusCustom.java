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

public class OpusCustom {

    /** Contains the function pointers loaded from {@code Opus.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            custom_mode_create      = apiGetFunctionAddress(Opus.getLibrary(), "opus_custom_mode_create"),
            custom_mode_destroy     = apiGetFunctionAddress(Opus.getLibrary(), "opus_custom_mode_destroy"),
            custom_encoder_get_size = apiGetFunctionAddress(Opus.getLibrary(), "opus_custom_encoder_get_size"),
            custom_encoder_init     = apiGetFunctionAddress(Opus.getLibrary(), "opus_custom_encoder_init"),
            custom_encoder_create   = apiGetFunctionAddress(Opus.getLibrary(), "opus_custom_encoder_create"),
            custom_encoder_destroy  = apiGetFunctionAddress(Opus.getLibrary(), "opus_custom_encoder_destroy"),
            custom_encode_float     = apiGetFunctionAddress(Opus.getLibrary(), "opus_custom_encode_float"),
            custom_encode           = apiGetFunctionAddress(Opus.getLibrary(), "opus_custom_encode"),
            custom_encoder_ctl      = apiGetFunctionAddress(Opus.getLibrary(), "opus_custom_encoder_ctl"),
            custom_decoder_get_size = apiGetFunctionAddress(Opus.getLibrary(), "opus_custom_decoder_get_size"),
            custom_decoder_init     = apiGetFunctionAddress(Opus.getLibrary(), "opus_custom_decoder_init"),
            custom_decoder_create   = apiGetFunctionAddress(Opus.getLibrary(), "opus_custom_decoder_create"),
            custom_decoder_destroy  = apiGetFunctionAddress(Opus.getLibrary(), "opus_custom_decoder_destroy"),
            custom_decode_float     = apiGetFunctionAddress(Opus.getLibrary(), "opus_custom_decode_float"),
            custom_decode           = apiGetFunctionAddress(Opus.getLibrary(), "opus_custom_decode"),
            custom_decoder_ctl      = apiGetFunctionAddress(Opus.getLibrary(), "opus_custom_decoder_ctl");

    }

    protected OpusCustom() {
        throw new UnsupportedOperationException();
    }

    // --- [ opus_custom_mode_create ] ---

    /** {@code OpusCustomMode * opus_custom_mode_create(opus_int32 Fs, int frame_size, int * error)} */
    public static long nopus_custom_mode_create(int Fs, int frame_size, long error) {
        long __functionAddress = Functions.custom_mode_create;
        return invokePP(Fs, frame_size, error, __functionAddress);
    }

    /** {@code OpusCustomMode * opus_custom_mode_create(opus_int32 Fs, int frame_size, int * error)} */
    @NativeType("OpusCustomMode *")
    public static long opus_custom_mode_create(@NativeType("opus_int32") int Fs, int frame_size, @NativeType("int *") @Nullable IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        return nopus_custom_mode_create(Fs, frame_size, memAddressSafe(error));
    }

    // --- [ opus_custom_mode_destroy ] ---

    /** {@code void opus_custom_mode_destroy(OpusCustomMode * mode)} */
    public static void opus_custom_mode_destroy(@NativeType("OpusCustomMode *") long mode) {
        long __functionAddress = Functions.custom_mode_destroy;
        if (CHECKS) {
            check(mode);
        }
        invokePV(mode, __functionAddress);
    }

    // --- [ opus_custom_encoder_get_size ] ---

    /** {@code int opus_custom_encoder_get_size(OpusCustomMode const * mode, int channels)} */
    public static int opus_custom_encoder_get_size(@NativeType("OpusCustomMode const *") long mode, int channels) {
        long __functionAddress = Functions.custom_encoder_get_size;
        if (CHECKS) {
            check(mode);
        }
        return invokePI(mode, channels, __functionAddress);
    }

    // --- [ opus_custom_encoder_init ] ---

    /** {@code int opus_custom_encoder_init(OpusCustomEncoder * st, OpusCustomMode const * mode, int channels)} */
    public static int opus_custom_encoder_init(@NativeType("OpusCustomEncoder *") long st, @NativeType("OpusCustomMode const *") long mode, int channels) {
        long __functionAddress = Functions.custom_encoder_init;
        if (CHECKS) {
            check(st);
            check(mode);
        }
        return invokePPI(st, mode, channels, __functionAddress);
    }

    // --- [ opus_custom_encoder_create ] ---

    /** {@code OpusCustomEncoder * opus_custom_encoder_create(OpusCustomMode const * mode, int channels, int * error)} */
    public static long nopus_custom_encoder_create(long mode, int channels, long error) {
        long __functionAddress = Functions.custom_encoder_create;
        if (CHECKS) {
            check(mode);
        }
        return invokePPP(mode, channels, error, __functionAddress);
    }

    /** {@code OpusCustomEncoder * opus_custom_encoder_create(OpusCustomMode const * mode, int channels, int * error)} */
    @NativeType("OpusCustomEncoder *")
    public static long opus_custom_encoder_create(@NativeType("OpusCustomMode const *") long mode, int channels, @NativeType("int *") @Nullable IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        return nopus_custom_encoder_create(mode, channels, memAddressSafe(error));
    }

    // --- [ opus_custom_encoder_destroy ] ---

    /** {@code void opus_custom_encoder_destroy(OpusCustomEncoder * st)} */
    public static void opus_custom_encoder_destroy(@NativeType("OpusCustomEncoder *") long st) {
        long __functionAddress = Functions.custom_encoder_destroy;
        if (CHECKS) {
            check(st);
        }
        invokePV(st, __functionAddress);
    }

    // --- [ opus_custom_encode_float ] ---

    /** {@code int opus_custom_encode_float(OpusCustomEncoder * st, float const * pcm, int frame_size, unsigned char * compressed, int maxCompressedBytes)} */
    public static int nopus_custom_encode_float(long st, long pcm, int frame_size, long compressed, int maxCompressedBytes) {
        long __functionAddress = Functions.custom_encode_float;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, pcm, frame_size, compressed, maxCompressedBytes, __functionAddress);
    }

    /** {@code int opus_custom_encode_float(OpusCustomEncoder * st, float const * pcm, int frame_size, unsigned char * compressed, int maxCompressedBytes)} */
    public static int opus_custom_encode_float(@NativeType("OpusCustomEncoder *") long st, @NativeType("float const *") FloatBuffer pcm, int frame_size, @NativeType("unsigned char *") ByteBuffer compressed) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + Pointer.POINTER_SIZE));
        }
        return nopus_custom_encode_float(st, memAddress(pcm), frame_size, memAddress(compressed), compressed.remaining());
    }

    // --- [ opus_custom_encode ] ---

    /** {@code int opus_custom_encode(OpusCustomEncoder * st, opus_int16 const * pcm, int frame_size, unsigned char * compressed, int maxCompressedBytes)} */
    public static int nopus_custom_encode(long st, long pcm, int frame_size, long compressed, int maxCompressedBytes) {
        long __functionAddress = Functions.custom_encode;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, pcm, frame_size, compressed, maxCompressedBytes, __functionAddress);
    }

    /** {@code int opus_custom_encode(OpusCustomEncoder * st, opus_int16 const * pcm, int frame_size, unsigned char * compressed, int maxCompressedBytes)} */
    public static int opus_custom_encode(@NativeType("OpusCustomEncoder *") long st, @NativeType("opus_int16 const *") ShortBuffer pcm, int frame_size, @NativeType("unsigned char *") ByteBuffer compressed) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + Pointer.POINTER_SIZE));
        }
        return nopus_custom_encode(st, memAddress(pcm), frame_size, memAddress(compressed), compressed.remaining());
    }

    // --- [ opus_custom_encoder_ctl ] ---

    /** {@code int opus_custom_encoder_ctl(OpusCustomEncoder * st)} */
    private static int opus_custom_encoder_ctl(@NativeType("OpusCustomEncoder *") long st) {
        long __functionAddress = Functions.custom_encoder_ctl;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, __functionAddress);
    }

    // --- [ opus_custom_decoder_get_size ] ---

    /** {@code int opus_custom_decoder_get_size(OpusCustomMode const * mode, int channels)} */
    public static int opus_custom_decoder_get_size(@NativeType("OpusCustomMode const *") long mode, int channels) {
        long __functionAddress = Functions.custom_decoder_get_size;
        if (CHECKS) {
            check(mode);
        }
        return invokePI(mode, channels, __functionAddress);
    }

    // --- [ opus_custom_decoder_init ] ---

    /** {@code int opus_custom_decoder_init(OpusCustomDecoder * st, OpusCustomMode const * mode, int channels)} */
    public static int opus_custom_decoder_init(@NativeType("OpusCustomDecoder *") long st, @NativeType("OpusCustomMode const *") long mode, int channels) {
        long __functionAddress = Functions.custom_decoder_init;
        if (CHECKS) {
            check(st);
            check(mode);
        }
        return invokePPI(st, mode, channels, __functionAddress);
    }

    // --- [ opus_custom_decoder_create ] ---

    /** {@code OpusCustomDecoder * opus_custom_decoder_create(OpusCustomMode const * mode, int channels, int * error)} */
    public static long nopus_custom_decoder_create(long mode, int channels, long error) {
        long __functionAddress = Functions.custom_decoder_create;
        if (CHECKS) {
            check(mode);
        }
        return invokePPP(mode, channels, error, __functionAddress);
    }

    /** {@code OpusCustomDecoder * opus_custom_decoder_create(OpusCustomMode const * mode, int channels, int * error)} */
    @NativeType("OpusCustomDecoder *")
    public static long opus_custom_decoder_create(@NativeType("OpusCustomMode const *") long mode, int channels, @NativeType("int *") @Nullable IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        return nopus_custom_decoder_create(mode, channels, memAddressSafe(error));
    }

    // --- [ opus_custom_decoder_destroy ] ---

    /** {@code void opus_custom_decoder_destroy(OpusCustomDecoder * st)} */
    public static void opus_custom_decoder_destroy(@NativeType("OpusCustomDecoder *") long st) {
        long __functionAddress = Functions.custom_decoder_destroy;
        if (CHECKS) {
            check(st);
        }
        invokePV(st, __functionAddress);
    }

    // --- [ opus_custom_decode_float ] ---

    /** {@code int opus_custom_decode_float(OpusCustomDecoder * st, unsigned char const * data, int len, float * pcm, int frame_size)} */
    public static int nopus_custom_decode_float(long st, long data, int len, long pcm, int frame_size) {
        long __functionAddress = Functions.custom_decode_float;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, data, len, pcm, frame_size, __functionAddress);
    }

    /** {@code int opus_custom_decode_float(OpusCustomDecoder * st, unsigned char const * data, int len, float * pcm, int frame_size)} */
    public static int opus_custom_decode_float(@NativeType("OpusCustomDecoder *") long st, @NativeType("unsigned char const *") @Nullable ByteBuffer data, @NativeType("float *") FloatBuffer pcm, int frame_size) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + (Pointer.POINTER_SIZE + 4)));
        }
        return nopus_custom_decode_float(st, memAddressSafe(data), remainingSafe(data), memAddress(pcm), frame_size);
    }

    // --- [ opus_custom_decode ] ---

    /** {@code int opus_custom_decode(OpusCustomDecoder * st, unsigned char const * data, int len, opus_int16 * pcm, int frame_size)} */
    public static int nopus_custom_decode(long st, long data, int len, long pcm, int frame_size) {
        long __functionAddress = Functions.custom_decode;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, data, len, pcm, frame_size, __functionAddress);
    }

    /** {@code int opus_custom_decode(OpusCustomDecoder * st, unsigned char const * data, int len, opus_int16 * pcm, int frame_size)} */
    public static int opus_custom_decode(@NativeType("OpusCustomDecoder *") long st, @NativeType("unsigned char const *") @Nullable ByteBuffer data, @NativeType("opus_int16 *") ShortBuffer pcm, int frame_size) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + (Pointer.POINTER_SIZE + 4)));
        }
        return nopus_custom_decode(st, memAddressSafe(data), remainingSafe(data), memAddress(pcm), frame_size);
    }

    // --- [ opus_custom_decoder_ctl ] ---

    /** {@code int opus_custom_decoder_ctl(OpusCustomDecoder * st)} */
    private static int opus_custom_decoder_ctl(@NativeType("OpusCustomDecoder *") long st) {
        long __functionAddress = Functions.custom_decoder_ctl;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, __functionAddress);
    }

    /**
     * Performs a CTL function on an Opus custom encoder.
     *
     * @param st      encoder state
     * @param request CTL request
     */
    public static int opus_custom_encoder_ctl(@NativeType("OpusCustomEncoder *") long st, int request) {
        return new CTLRequestV(request).apply(st, Functions.custom_encoder_ctl);
    }

    /**
     * Performs a CTL function on an Opus custom encoder.
     *
     * @param st      encoder state
     * @param request CTL request
     */
    public static int opus_custom_encoder_ctl(@NativeType("OpusCustomEncoder *") long st, CTLRequest request) {
        return request.apply(st, Functions.custom_encoder_ctl);
    }

    /**
     * Performs a CTL function on an Opus custom decoder.
     *
     * @param st      decoder state
     * @param request CTL request
     */
    public static int opus_custom_decoder_ctl(@NativeType("OpusCustomDecoder *") long st, int request) {
        return new CTLRequestV(request).apply(st, Functions.custom_decoder_ctl);
    }

    /**
     * Performs a CTL function on an Opus custom decoder.
     *
     * @param st      decoder state
     * @param request CTL request
     */
    public static int opus_custom_decoder_ctl(@NativeType("OpusCustomDecoder *") long st, CTLRequest request) {
        return request.apply(st, Functions.custom_decoder_ctl);
    }

}