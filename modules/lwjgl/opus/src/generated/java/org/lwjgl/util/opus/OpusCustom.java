/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.util.opus.Opus.*;

/**
 * Opus Custom is an optional part of the Opus specification and reference implementation which uses a distinct API from the regular API and supports
 * frame sizes that are not normally supported. Use of Opus Custom is discouraged for all but very special applications for which a frame size different
 * from 2.5, 5, 10, or 20 ms is needed (for either complexity or latency reasons) and where interoperability is less important.
 * 
 * <p>In addition to the interoperability limitations the use of Opus custom disables a substantial chunk of the codec and generally lowers the quality
 * available at a given bitrate. Normally when an application needs a different frame size from the codec it should buffer to match the sizes but this
 * adds a small amount of delay which may be important in some very low latency applications. Some transports (especially constant rate RF transports) may
 * also work best with frames of particular durations.</p>
 * 
 * <p>Libopus only supports custom modes if they are enabled at compile time.</p>
 * 
 * <p>The Opus Custom API is similar to the regular API but the {@link #opus_custom_encoder_create custom_encoder_create} and {@link #opus_custom_decoder_create custom_decoder_create} calls take an additional mode parameter
 * which is a structure produced by a call to {@link #opus_custom_mode_create custom_mode_create}. Both the encoder and decoder must create a mode using the same sample rate (fs) and
 * frame size (frame size) so these parameters must either be signaled out of band or fixed in a particular implementation.</p>
 * 
 * <p>Similar to regular Opus the custom modes support on the fly frame size switching, but the sizes available depend on the particular frame size in use.
 * For some initial frame sizes on a single on the fly size is available.</p>
 */
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

    /** Unsafe version of: {@link #opus_custom_mode_create custom_mode_create} */
    public static long nopus_custom_mode_create(int Fs, int frame_size, long error) {
        long __functionAddress = Functions.custom_mode_create;
        return invokePP(Fs, frame_size, error, __functionAddress);
    }

    /**
     * Creates a new mode struct. This will be passed to an encoder or decoder. The mode MUST NOT BE DESTROYED until the encoders and decoders that use it are
     * destroyed as well.
     *
     * @param Fs         sampling rate (8000 to 96000 Hz)
     * @param frame_size number of samples (per channel) to encode in each packet (64 - 1024, prime factorization must contain zero or more 2s, 3s, or 5s and no other primes
     * @param error      returned error code (if {@code NULL}, no error will be returned)
     */
    @NativeType("OpusCustomMode *")
    public static long opus_custom_mode_create(@NativeType("opus_int32") int Fs, int frame_size, @Nullable @NativeType("int *") IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        return nopus_custom_mode_create(Fs, frame_size, memAddressSafe(error));
    }

    // --- [ opus_custom_mode_destroy ] ---

    /**
     * Destroys a mode struct. Only call this after all encoders and decoders using this mode are destroyed as well.
     *
     * @param mode mode to be freed
     */
    public static void opus_custom_mode_destroy(@NativeType("OpusCustomMode *") long mode) {
        long __functionAddress = Functions.custom_mode_destroy;
        if (CHECKS) {
            check(mode);
        }
        invokePV(mode, __functionAddress);
    }

    // --- [ opus_custom_encoder_get_size ] ---

    /**
     * Gets the size of an {@code OpusCustomEncoder} structure.
     *
     * @param mode     mode configuration
     * @param channels number of channels
     *
     * @return size
     */
    public static int opus_custom_encoder_get_size(@NativeType("OpusCustomMode const *") long mode, int channels) {
        long __functionAddress = Functions.custom_encoder_get_size;
        if (CHECKS) {
            check(mode);
        }
        return invokePI(mode, channels, __functionAddress);
    }

    // --- [ opus_custom_encoder_init ] ---

    /**
     * Initializes a previously allocated encoder state.
     * 
     * <p>The memory pointed to by {@code st} must be the size returned by {@link #opus_custom_encoder_get_size custom_encoder_get_size}. This is intended for applications which use their own
     * allocator instead of {@code malloc}.</p>
     * 
     * <p>To reset a previously initialized state use the {@link Opus#OPUS_RESET_STATE RESET_STATE} CTL.</p>
     *
     * @param st       encoder state
     * @param mode     contains all the information about the characteristics of the stream (must be the same characteristics as used for the decoder)
     * @param channels number of channels
     *
     * @return {@link Opus#OPUS_OK OK} Success or a negative error code
     */
    public static int opus_custom_encoder_init(@NativeType("OpusCustomEncoder *") long st, @NativeType("OpusCustomMode const *") long mode, int channels) {
        long __functionAddress = Functions.custom_encoder_init;
        if (CHECKS) {
            check(st);
            check(mode);
        }
        return invokePPI(st, mode, channels, __functionAddress);
    }

    // --- [ opus_custom_encoder_create ] ---

    /** Unsafe version of: {@link #opus_custom_encoder_create custom_encoder_create} */
    public static long nopus_custom_encoder_create(long mode, int channels, long error) {
        long __functionAddress = Functions.custom_encoder_create;
        if (CHECKS) {
            check(mode);
        }
        return invokePPP(mode, channels, error, __functionAddress);
    }

    /**
     * Creates a new encoder state.
     * 
     * <p>Each stream needs its own encoder state (can't be shared across simultaneous streams).</p>
     *
     * @param mode     contains all the information about the characteristics of the stream (must be the same characteristics as used for the decoder)
     * @param channels number of channels
     * @param error    returns an error code
     *
     * @return newly created encoder state
     */
    @NativeType("OpusCustomEncoder *")
    public static long opus_custom_encoder_create(@NativeType("OpusCustomMode const *") long mode, int channels, @Nullable @NativeType("int *") IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        return nopus_custom_encoder_create(mode, channels, memAddressSafe(error));
    }

    // --- [ opus_custom_encoder_destroy ] ---

    /**
     * Destroys an encoder state.
     *
     * @param st state to be freed
     */
    public static void opus_custom_encoder_destroy(@NativeType("OpusCustomEncoder *") long st) {
        long __functionAddress = Functions.custom_encoder_destroy;
        if (CHECKS) {
            check(st);
        }
        invokePV(st, __functionAddress);
    }

    // --- [ opus_custom_encode_float ] ---

    /**
     * Unsafe version of: {@link #opus_custom_encode_float custom_encode_float}
     *
     * @param maxCompressedBytes maximum number of bytes to use for compressing the frame (can change from one frame to another)
     */
    public static int nopus_custom_encode_float(long st, long pcm, int frame_size, long compressed, int maxCompressedBytes) {
        long __functionAddress = Functions.custom_encode_float;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, pcm, frame_size, compressed, maxCompressedBytes, __functionAddress);
    }

    /**
     * Encodes a frame of audio.
     *
     * @param st         encoder state
     * @param pcm        PCM audio in float format, with a normal range of {@code +/-1.0}. Samples with a range beyond {@code +/-1.0} are supported but will be clipped by
     *                   decoders using the integer API and should only be used if it is known that the far end supports extended dynamic range. There must be exactly
     *                   {@code frame_size} samples per channel.
     * @param frame_size number of samples per frame of input signal
     * @param compressed the compressed data is written here. This may not alias {@code pcm} and must be at least {@code maxCompressedBytes} long.
     *
     * @return the number of bytes written to {@code compress} on success, or a negative error code
     */
    public static int opus_custom_encode_float(@NativeType("OpusCustomEncoder *") long st, @NativeType("float const *") FloatBuffer pcm, int frame_size, @NativeType("unsigned char *") ByteBuffer compressed) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + Pointer.POINTER_SIZE));
        }
        return nopus_custom_encode_float(st, memAddress(pcm), frame_size, memAddress(compressed), compressed.remaining());
    }

    // --- [ opus_custom_encode ] ---

    /**
     * Unsafe version of: {@link #opus_custom_encode custom_encode}
     *
     * @param maxCompressedBytes maximum number of bytes to use for compressing the frame (can change from one frame to another)
     */
    public static int nopus_custom_encode(long st, long pcm, int frame_size, long compressed, int maxCompressedBytes) {
        long __functionAddress = Functions.custom_encode;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, pcm, frame_size, compressed, maxCompressedBytes, __functionAddress);
    }

    /**
     * Encodes a frame of audio.
     *
     * @param st         encoder state
     * @param pcm        PCM audio in signed 16-bit format (native endian). (There must be exactly {@code frame_size} samples per channel.)
     * @param frame_size number of samples per frame of input signal
     * @param compressed the compressed data is written here. This may not alias {@code pcm} and must be at least {@code maxCompressedBytes} long.
     *
     * @return the number of bytes written to {@code compress} on success, or a negative error code
     */
    public static int opus_custom_encode(@NativeType("OpusCustomEncoder *") long st, @NativeType("opus_int16 const *") ShortBuffer pcm, int frame_size, @NativeType("unsigned char *") ByteBuffer compressed) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + Pointer.POINTER_SIZE));
        }
        return nopus_custom_encode(st, memAddress(pcm), frame_size, memAddress(compressed), compressed.remaining());
    }

    // --- [ opus_custom_encoder_ctl ] ---

    /**
     * Performs a CTL function on an Opus custom encoder.
     *
     * @param st encoder state
     */
    private static int opus_custom_encoder_ctl(@NativeType("OpusCustomEncoder *") long st) {
        long __functionAddress = Functions.custom_encoder_ctl;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, __functionAddress);
    }

    // --- [ opus_custom_decoder_get_size ] ---

    /**
     * Gets the size of an {@code OpusCustomDecoder} structure.
     *
     * @param mode     mode configuration
     * @param channels number of channels
     *
     * @return size
     */
    public static int opus_custom_decoder_get_size(@NativeType("OpusCustomMode const *") long mode, int channels) {
        long __functionAddress = Functions.custom_decoder_get_size;
        if (CHECKS) {
            check(mode);
        }
        return invokePI(mode, channels, __functionAddress);
    }

    // --- [ opus_custom_decoder_init ] ---

    /**
     * Initializes a previously allocated decoder state.
     * 
     * <p>The memory pointed to by {@code st} must be the size returned by {@link #opus_custom_decoder_get_size custom_decoder_get_size}. This is intended for applications which use their own
     * allocator instead of {@code malloc}.</p>
     * 
     * <p>To reset a previously initialized state use the {@link Opus#OPUS_RESET_STATE RESET_STATE} CTL.</p>
     *
     * @param st       decoder state
     * @param mode     contains all the information about the characteristics of the stream (must be the same characteristics as used for the encoder)
     * @param channels number of channels
     *
     * @return {@link Opus#OPUS_OK OK} Success or a negative error code
     */
    public static int opus_custom_decoder_init(@NativeType("OpusCustomDecoder *") long st, @NativeType("OpusCustomMode const *") long mode, int channels) {
        long __functionAddress = Functions.custom_decoder_init;
        if (CHECKS) {
            check(st);
            check(mode);
        }
        return invokePPI(st, mode, channels, __functionAddress);
    }

    // --- [ opus_custom_decoder_create ] ---

    /** Unsafe version of: {@link #opus_custom_decoder_create custom_decoder_create} */
    public static long nopus_custom_decoder_create(long mode, int channels, long error) {
        long __functionAddress = Functions.custom_decoder_create;
        if (CHECKS) {
            check(mode);
        }
        return invokePPP(mode, channels, error, __functionAddress);
    }

    /**
     * Creates a new decoder state.
     * 
     * <p>Each stream needs its own decoder state (can't be shared across simultaneous streams).</p>
     *
     * @param mode     contains all the information about the characteristics of the stream (must be the same characteristics as used for the encoder)
     * @param channels number of channels
     * @param error    returns an error code
     *
     * @return newly created decoder state
     */
    @NativeType("OpusCustomDecoder *")
    public static long opus_custom_decoder_create(@NativeType("OpusCustomMode const *") long mode, int channels, @Nullable @NativeType("int *") IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        return nopus_custom_decoder_create(mode, channels, memAddressSafe(error));
    }

    // --- [ opus_custom_decoder_destroy ] ---

    /**
     * Destroys a decoder state.
     *
     * @param st state to be freed
     */
    public static void opus_custom_decoder_destroy(@NativeType("OpusCustomDecoder *") long st) {
        long __functionAddress = Functions.custom_decoder_destroy;
        if (CHECKS) {
            check(st);
        }
        invokePV(st, __functionAddress);
    }

    // --- [ opus_custom_decode_float ] ---

    /**
     * Unsafe version of: {@link #opus_custom_decode_float custom_decode_float}
     *
     * @param len number of bytes in payload
     */
    public static int nopus_custom_decode_float(long st, long data, int len, long pcm, int frame_size) {
        long __functionAddress = Functions.custom_decode_float;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, data, len, pcm, frame_size, __functionAddress);
    }

    /**
     * Decode an opus custom frame with floating point output.
     *
     * @param st         decoder state
     * @param data       input payload. Use a {@code NULL} pointer to indicate packet loss.
     * @param pcm        output signal (interleaved if 2 channels) (length is {@code frame_size*channels*sizeof(float)}
     * @param frame_size number of samples per channel of available space in {@code pcm}
     *
     * @return number of decoded samples, or a negative error code
     */
    public static int opus_custom_decode_float(@NativeType("OpusCustomDecoder *") long st, @Nullable @NativeType("unsigned char const *") ByteBuffer data, @NativeType("float *") FloatBuffer pcm, int frame_size) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + (Pointer.POINTER_SIZE + 4)));
        }
        return nopus_custom_decode_float(st, memAddressSafe(data), remainingSafe(data), memAddress(pcm), frame_size);
    }

    // --- [ opus_custom_decode ] ---

    /**
     * Unsafe version of: {@link #opus_custom_decode custom_decode}
     *
     * @param len number of bytes in payload
     */
    public static int nopus_custom_decode(long st, long data, int len, long pcm, int frame_size) {
        long __functionAddress = Functions.custom_decode;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, data, len, pcm, frame_size, __functionAddress);
    }

    /**
     * Decode an opus custom frame.
     *
     * @param st         decoder state
     * @param data       input payload. Use a {@code NULL} pointer to indicate packet loss.
     * @param pcm        output signal (interleaved if 2 channels) (length is {@code frame_size*channels*sizeof(opus_int16)}
     * @param frame_size number of samples per channel of available space in {@code pcm}
     *
     * @return number of decoded samples, or a negative error code
     */
    public static int opus_custom_decode(@NativeType("OpusCustomDecoder *") long st, @Nullable @NativeType("unsigned char const *") ByteBuffer data, @NativeType("opus_int16 *") ShortBuffer pcm, int frame_size) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + (Pointer.POINTER_SIZE + 4)));
        }
        return nopus_custom_decode(st, memAddressSafe(data), remainingSafe(data), memAddress(pcm), frame_size);
    }

    // --- [ opus_custom_decoder_ctl ] ---

    /**
     * Performs a CTL function on an Opus custom decoder.
     *
     * @param st decoder state
     */
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