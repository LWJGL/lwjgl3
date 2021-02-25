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

public class OpusProjection {

    /**
     * Projection CTLs
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #OPUS_PROJECTION_GET_DEMIXING_MATRIX_GAIN_REQUEST PROJECTION_GET_DEMIXING_MATRIX_GAIN_REQUEST}</li>
     * <li>{@link #OPUS_PROJECTION_GET_DEMIXING_MATRIX_SIZE_REQUEST PROJECTION_GET_DEMIXING_MATRIX_SIZE_REQUEST}</li>
     * <li>{@link #OPUS_PROJECTION_GET_DEMIXING_MATRIX_REQUEST PROJECTION_GET_DEMIXING_MATRIX_REQUEST}</li>
     * </ul>
     */
    public static final int
        OPUS_PROJECTION_GET_DEMIXING_MATRIX_GAIN_REQUEST = 6001,
        OPUS_PROJECTION_GET_DEMIXING_MATRIX_SIZE_REQUEST = 6003,
        OPUS_PROJECTION_GET_DEMIXING_MATRIX_REQUEST      = 6005;

    protected OpusProjection() {
        throw new UnsupportedOperationException();
    }

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

    // --- [ opus_projection_ambisonics_encoder_get_size ] ---

    /**
     * Gets the size of an {@code OpusProjectionEncoder} structure.
     *
     * @param channels       the total number of input channels to encode. This must be no more than 255.
     * @param mapping_family the mapping family to use for selecting the appropriate projection
     *
     * @return the size in bytes on success, or a negative error code
     */
    @NativeType("opus_int32")
    public static int opus_projection_ambisonics_encoder_get_size(int channels, int mapping_family) {
        long __functionAddress = Functions.projection_ambisonics_encoder_get_size;
        return invokeI(channels, mapping_family, __functionAddress);
    }

    // --- [ opus_projection_ambisonics_encoder_create ] ---

    /** Unsafe version of: {@link #opus_projection_ambisonics_encoder_create projection_ambisonics_encoder_create} */
    public static long nopus_projection_ambisonics_encoder_create(int Fs, int channels, int mapping_family, long streams, long coupled_streams, int application, long error) {
        long __functionAddress = Functions.projection_ambisonics_encoder_create;
        return invokePPPP(Fs, channels, mapping_family, streams, coupled_streams, application, error, __functionAddress);
    }

    /**
     * Allocates and initializes a projection encoder state.
     * 
     * <p>Call {@link #opus_projection_encoder_destroy projection_encoder_destroy} to release this object when finished.</p>
     *
     * @param Fs              sampling rate of the input signal (in Hz). One of:<br><table><tr><td>8000</td><td>12000</td><td>16000</td><td>24000</td><td>48000</td></tr></table>
     * @param channels        number of channels in the input signal. This must be at most 255. It may be greater than the number of coded channels ({@code streams +
     *                        coupled_streams}).
     * @param mapping_family  the mapping family to use for selecting the appropriate projection
     * @param streams         the total number of streams that will be encoded from the input
     * @param coupled_streams number of coupled (2 channel) streams to encode that will be encoded from the input
     * @param application     the target encoder application
     * @param error           returns {@link Opus#OPUS_OK OK} on success, or a negative error code on failure
     */
    @NativeType("OpusProjectionEncoder *")
    public static long opus_projection_ambisonics_encoder_create(@NativeType("opus_int32") int Fs, int channels, int mapping_family, @NativeType("int *") IntBuffer streams, @NativeType("int *") IntBuffer coupled_streams, int application, @Nullable @NativeType("int *") IntBuffer error) {
        if (CHECKS) {
            check(streams, 1);
            check(coupled_streams, 1);
            checkSafe(error, 1);
        }
        return nopus_projection_ambisonics_encoder_create(Fs, channels, mapping_family, memAddress(streams), memAddress(coupled_streams), application, memAddressSafe(error));
    }

    // --- [ opus_projection_ambisonics_encoder_init ] ---

    /** Unsafe version of: {@link #opus_projection_ambisonics_encoder_init projection_ambisonics_encoder_init} */
    public static int nopus_projection_ambisonics_encoder_init(long st, int Fs, int channels, int mapping_family, long streams, long coupled_streams, int application) {
        long __functionAddress = Functions.projection_ambisonics_encoder_init;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, Fs, channels, mapping_family, streams, coupled_streams, application, __functionAddress);
    }

    /**
     * Initialize a previously allocated projection encoder state.
     * 
     * <p>The memory pointed to by {@code st} must be at least the size returned by {@link #opus_projection_ambisonics_encoder_get_size projection_ambisonics_encoder_get_size}. This is intended for applications
     * which use their own allocator instead of {@code malloc}.</p>
     * 
     * <p>To reset a previously initialized state, use the {@link Opus#OPUS_RESET_STATE RESET_STATE} CTL.</p>
     *
     * @param st              projection encoder state to initialize
     * @param Fs              sampling rate of the input signal (in Hz). One of:<br><table><tr><td>8000</td><td>12000</td><td>16000</td><td>24000</td><td>48000</td></tr></table>
     * @param channels        number of channels in the input signal. This must be at most 255. It may be greater than the number of coded channels ({@code streams +
     *                        coupled_streams}).
     * @param streams         the total number of streams that will be encoded from the input
     * @param coupled_streams number of coupled (2 channel) streams to encode that will be encoded from the input. Additionally, the total number of encoded channels
     *                        ({@code streams + coupled_streams}) must be no more than the number of input channels.
     * @param application     the target encoder application
     *
     * @return {@link Opus#OPUS_OK OK} on success, or a negative error code on failure
     */
    public static int opus_projection_ambisonics_encoder_init(@NativeType("OpusProjectionEncoder *") long st, @NativeType("opus_int32") int Fs, int channels, int mapping_family, @NativeType("int *") IntBuffer streams, @NativeType("int *") IntBuffer coupled_streams, int application) {
        if (CHECKS) {
            check(streams, 1);
            check(coupled_streams, 1);
        }
        return nopus_projection_ambisonics_encoder_init(st, Fs, channels, mapping_family, memAddress(streams), memAddress(coupled_streams), application);
    }

    // --- [ opus_projection_encode ] ---

    /**
     * Unsafe version of: {@link #opus_projection_encode projection_encode}
     *
     * @param max_data_bytes size of the allocated memory for the output payload. This may be used to impose an upper limit on the instant bitrate, but should not be used as
     *                       the only bitrate control. Use {@link Opus#OPUS_SET_BITRATE_REQUEST SET_BITRATE_REQUEST} to control the bitrate.
     */
    public static int nopus_projection_encode(long st, long pcm, int frame_size, long data, int max_data_bytes) {
        long __functionAddress = Functions.projection_encode;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, pcm, frame_size, data, max_data_bytes, __functionAddress);
    }

    /**
     * Encodes a projection Opus frame.
     *
     * @param st         projection encoder state
     * @param pcm        the input signal as interleaved samples. This must contain {@code frame_size*channels} samples.
     * @param frame_size number of samples per channel in the input signal. This must be an Opus frame size for the encoder's sampling rate. For example, at 48 kHz the
     *                   permitted values are 120, 240, 480, 960, 1920, and 2880. Passing in a duration of less than 10 ms (480 samples at 48 kHz) will prevent the encoder
     *                   from using the LPC or hybrid modes.
     * @param data       output payload. This must contain storage for at {@code max_data_bytes}.
     *
     * @return the length of the encoded packet (in bytes) on success or a negative error code on failure
     */
    public static int opus_projection_encode(@NativeType("OpusProjectionEncoder *") long st, @NativeType("opus_int16 const *") ShortBuffer pcm, int frame_size, @NativeType("unsigned char *") ByteBuffer data) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 8 + memGetInt(st) + memGetInt(st + 4)));
        }
        return nopus_projection_encode(st, memAddress(pcm), frame_size, memAddress(data), data.remaining());
    }

    // --- [ opus_projection_encode_float ] ---

    /**
     * Unsafe version of: {@link #opus_projection_encode_float projection_encode_float}
     *
     * @param max_data_bytes size of the allocated memory for the output payload. This may be used to impose an upper limit on the instant bitrate, but should not be used as
     *                       the only bitrate control. Use {@link Opus#OPUS_SET_BITRATE_REQUEST SET_BITRATE_REQUEST} to control the bitrate.
     */
    public static int nopus_projection_encode_float(long st, long pcm, int frame_size, long data, int max_data_bytes) {
        long __functionAddress = Functions.projection_encode_float;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, pcm, frame_size, data, max_data_bytes, __functionAddress);
    }

    /**
     * Encodes a projection Opus frame from floating point input.
     *
     * @param st         projection encoder state
     * @param pcm        the input signal as interleaved samples with a normal range of {@code +/-1.0}. Samples with a range beyond {@code +/-1.0} are supported but will be
     *                   clipped by decoders using the integer API and should only be used if it is known that the far end supports extended dynamic range. This must
     *                   contain {@code frame_size*channels} samples.
     * @param frame_size number of samples per channel in the input signal. This must be an Opus frame size for the encoder's sampling rate. For example, at 48 kHz the
     *                   permitted values are 120, 240, 480, 960, 1920, and 2880. Passing in a duration of less than 10 ms (480 samples at 48 kHz) will prevent the encoder
     *                   from using the LPC or hybrid modes.
     * @param data       output payload. This must contain storage for at {@code max_data_bytes}.
     *
     * @return the length of the encoded packet (in bytes) on success or a negative error code on failure
     */
    public static int opus_projection_encode_float(@NativeType("OpusProjectionEncoder *") long st, @NativeType("float const *") FloatBuffer pcm, int frame_size, @NativeType("unsigned char *") ByteBuffer data) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 8 + memGetInt(st) + memGetInt(st + 4)));
        }
        return nopus_projection_encode_float(st, memAddress(pcm), frame_size, memAddress(data), data.remaining());
    }

    // --- [ opus_projection_encoder_ctl ] ---

    /**
     * Performs a CTL function on an projection Opus encoder.
     *
     * @param st projection encoder state
     */
    private static int opus_projection_encoder_ctl(@NativeType("OpusProjectionEncoder *") long st) {
        long __functionAddress = Functions.projection_encoder_ctl;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, __functionAddress);
    }

    // --- [ opus_projection_encoder_destroy ] ---

    /**
     * Frees an {@code OpusProjectionEncoder} allocated by {@link #opus_projection_ambisonics_encoder_create projection_ambisonics_encoder_create}.
     *
     * @param st projection encoder state to be freed
     */
    public static int opus_projection_encoder_destroy(@NativeType("OpusProjectionEncoder *") long st) {
        long __functionAddress = Functions.projection_encoder_destroy;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, __functionAddress);
    }

    // --- [ opus_projection_decoder_get_size ] ---

    /**
     * Gets the size of an {@code OpusProjectionDecoder} structure.
     *
     * @param channels        the total number of output channels. This must be no more than 255.
     * @param streams         the total number of streams coded in the input
     * @param coupled_streams number streams to decode as coupled (2 channel) streams. This must be no larger than the total number of streams. Additionally, The total number of
     *                        coded channels ({@code streams + coupled_streams}) must be no more than 255.
     *
     * @return the size in bytes on success, or a negative error code on failure
     */
    @NativeType("opus_int32")
    public static int opus_projection_decoder_get_size(int channels, int streams, int coupled_streams) {
        long __functionAddress = Functions.projection_decoder_get_size;
        return invokeI(channels, streams, coupled_streams, __functionAddress);
    }

    // --- [ opus_projection_decoder_create ] ---

    /**
     * Unsafe version of: {@link #opus_projection_decoder_create projection_decoder_create}
     *
     * @param demixing_matrix_size the size in bytes if the demixing matrix
     */
    public static long nopus_projection_decoder_create(int Fs, int channels, int streams, int coupled_streams, long demixing_matrix, int demixing_matrix_size, long error) {
        long __functionAddress = Functions.projection_decoder_create;
        return invokePPP(Fs, channels, streams, coupled_streams, demixing_matrix, demixing_matrix_size, error, __functionAddress);
    }

    /**
     * Allocates and initializes a projection decoder state.
     * 
     * <p>Call {@link #opus_projection_decoder_destroy projection_decoder_destroy} to release this object when finished.</p>
     *
     * @param Fs              sampling rate of input signal (Hz). One of:<br><table><tr><td>8000</td><td>12000</td><td>16000</td><td>24000</td><td>48000</td></tr></table>
     * @param channels        number of channels to output
     * @param streams         the total number of streams coded in the input. This must be no more than 255.
     * @param coupled_streams number streams to decode as coupled (2 channel) streams. This must be no larger than the total number of streams. Additionally, The total number of
     *                        coded channels ({@code streams + coupled_streams}) must be no more than 255.
     * @param demixing_matrix demixing matrix that maps from coded channels to output channels
     * @param error           returns {@link Opus#OPUS_OK OK} on success, or a negative error code on failure
     */
    @NativeType("OpusProjectionDecoder *")
    public static long opus_projection_decoder_create(@NativeType("opus_int32") int Fs, int channels, int streams, int coupled_streams, @NativeType("unsigned char *") ByteBuffer demixing_matrix, @Nullable @NativeType("int *") IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        return nopus_projection_decoder_create(Fs, channels, streams, coupled_streams, memAddress(demixing_matrix), demixing_matrix.remaining(), memAddressSafe(error));
    }

    // --- [ opus_projection_decoder_init ] ---

    /**
     * Unsafe version of: {@link #opus_projection_decoder_init projection_decoder_init}
     *
     * @param demixing_matrix_size the size in bytes if the demixing matrix
     */
    public static int nopus_projection_decoder_init(long st, int Fs, int channels, int streams, int coupled_streams, long demixing_matrix, int demixing_matrix_size) {
        long __functionAddress = Functions.projection_decoder_init;
        if (CHECKS) {
            check(st);
        }
        return invokePPI(st, Fs, channels, streams, coupled_streams, demixing_matrix, demixing_matrix_size, __functionAddress);
    }

    /**
     * Initialize a previously allocated projection decoder state object.
     * 
     * <p>The memory pointed to by {@code st} must be at least the size returned by {@link #opus_projection_decoder_get_size projection_decoder_get_size}. This is intended for applications which use
     * their own allocator instead of {@code malloc}.</p>
     * 
     * <p>To reset a previously initialized state, use the {@link Opus#OPUS_RESET_STATE RESET_STATE} CTL.</p>
     *
     * @param st              projection decoder state to initialize
     * @param Fs              sampling rate of input signal (Hz). One of:<br><table><tr><td>8000</td><td>12000</td><td>16000</td><td>24000</td><td>48000</td></tr></table>
     * @param channels        number of channels to output. This mustbe at most 255. It may be different from the number of coded channels ({@code stream + coupled_streams}).
     * @param streams         the total number of streams coded in the input. This must be no more than 255.
     * @param coupled_streams number streams to decode as coupled (2 channel) streams. This must be no larger than the total number of streams. Additionally, The total number of
     *                        coded channels ({@code streams + coupled_streams}) must be no more than 255.
     * @param demixing_matrix demixing matrix that maps from coded channels to output channels
     *
     * @return {@link Opus#OPUS_OK OK} on success, or a negative error code on failure
     */
    public static int opus_projection_decoder_init(@NativeType("OpusProjectionDecoder *") long st, @NativeType("opus_int32") int Fs, int channels, int streams, int coupled_streams, @NativeType("unsigned char *") ByteBuffer demixing_matrix) {
        return nopus_projection_decoder_init(st, Fs, channels, streams, coupled_streams, memAddress(demixing_matrix), demixing_matrix.remaining());
    }

    // --- [ opus_projection_decode ] ---

    /**
     * Unsafe version of: {@link #opus_projection_decode projection_decode}
     *
     * @param len number of bytes in payload
     */
    public static int nopus_projection_decode(long st, long data, int len, long pcm, int frame_size, int decode_fec) {
        long __functionAddress = Functions.projection_decode;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, data, len, pcm, frame_size, decode_fec, __functionAddress);
    }

    /**
     * Decode a projection Opus packet.
     *
     * @param st         projection decoder state
     * @param data       input payload (Use a {@code NULL} pointer to indicate packet loss)
     * @param pcm        output signal, with interleaved samples. This must contain room for {@code frame_size*channels} samples.
     * @param frame_size number of samples per channel of available space in {@code pcm}.
     *                   
     *                   <p>If this is less than the maximum packet duration (120ms; 5760 for 48kHz), this function will not be capable of decoding some packets. In the case
     *                   of PLC ({@code data==NULL}) or FEC ({@code decode_fec=1}), then {@code frame_size} needs to be exactly the duration of audio that is missing,
     *                   otherwise the decoder will not be in the optimal state to decode the next incoming packet. For the PLC and FEC cases, {@code frame_size}
     *                   <b>must</b> be a multiple of 2.5 ms.</p>
     * @param decode_fec flag (0 or 1) to request that any in-band forward error correction data be decoded. If no such data is available, the frame is decoded as if it
     *                   were lost.
     *
     * @return number of decoded samples on success or a negative error code on failure
     */
    public static int opus_projection_decode(@NativeType("OpusProjectionDecoder *") long st, @Nullable @NativeType("unsigned char const *") ByteBuffer data, @NativeType("opus_int16 *") ShortBuffer pcm, int frame_size, int decode_fec) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 4 + memGetInt(st)));
        }
        return nopus_projection_decode(st, memAddressSafe(data), remainingSafe(data), memAddress(pcm), frame_size, decode_fec);
    }

    // --- [ opus_projection_decode_float ] ---

    /**
     * Unsafe version of: {@link #opus_projection_decode_float projection_decode_float}
     *
     * @param len number of bytes in payload
     */
    public static int nopus_projection_decode_float(long st, long data, int len, long pcm, int frame_size, int decode_fec) {
        long __functionAddress = Functions.projection_decode_float;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, data, len, pcm, frame_size, decode_fec, __functionAddress);
    }

    /**
     * Decode a projection Opus packet with floating point output.
     *
     * @param st         projection decoder state
     * @param data       input payload. Use a {@code NULL} pointer to indicate packet loss
     * @param pcm        output signal, with interleaved samples. (This must contain room for {@code frame_size*channels} samples.)
     * @param frame_size number of samples per channel of available space in pcm.
     *                   
     *                   <p>If this is less than the maximum packet duration (120ms; 5760 for 48kHz), this function will not be capable of decoding some packets. In the case
     *                   of PLC ({@code data==NULL}) or FEC ({@code decode_fec=1}), then {@code frame_size} needs to be exactly the duration of audio that is missing,
     *                   otherwise the decoder will not be in the optimal state to decode the next incoming packet. For the PLC and FEC cases, {@code frame_size}
     *                   <b>must</b> be a multiple of 2.5 ms.</p>
     * @param decode_fec flag (0 or 1) to request that any in-band forward error correction data be decoded. If no such data is available, the frame is decoded as if it
     *                   were lost.
     *
     * @return number of decoded samples on success or a negative error code on failure
     */
    public static int opus_projection_decode_float(@NativeType("OpusMSDecoder *") long st, @Nullable @NativeType("unsigned char const *") ByteBuffer data, @NativeType("float *") FloatBuffer pcm, int frame_size, int decode_fec) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 4 + memGetInt(st)));
        }
        return nopus_projection_decode_float(st, memAddressSafe(data), remainingSafe(data), memAddress(pcm), frame_size, decode_fec);
    }

    // --- [ opus_projection_decoder_ctl ] ---

    /**
     * Performs a CTL function on an projection Opus decoder.
     *
     * @param st projection decoder state
     */
    private static int opus_projection_decoder_ctl(@NativeType("OpusProjectionDecoder *") long st) {
        long __functionAddress = Functions.projection_decoder_ctl;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, __functionAddress);
    }

    // --- [ opus_projection_decoder_destroy ] ---

    /**
     * Frees an {@code OpusProjectionDecoder} allocated by {@link #opus_projection_decoder_create projection_decoder_create}.
     *
     * @param st projection decoder state to be freed
     */
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