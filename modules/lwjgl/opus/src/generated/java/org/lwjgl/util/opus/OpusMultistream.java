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
 * Opus Multistream API
 * 
 * <p>The multistream API allows individual Opus streams to be combined into a single packet, enabling support for up to 255 channels. Unlike an elementary
 * Opus stream, the encoder and decoder must negotiate the channel configuration before the decoder can successfully interpret the data in the packets
 * produced by the encoder. Some basic information, such as packet duration, can be computed without any special negotiation.</p>
 * 
 * <p>The format for multistream Opus packets is defined in <a href="https://tools.ietf.org/html/rfc7845">RFC 7845</a> and is based on the self-delimited
 * Opus framing described in Appendix B of <a href="https://tools.ietf.org/html/rfc6716">RFC 6716</a>. Normal Opus packets are just a degenerate case of
 * multistream Opus packets, and can be encoded or decoded with the multistream API by setting {@code streams} to {@code 1} when initializing the encoder
 * or decoder.</p>
 * 
 * <p>Multistream Opus streams can contain up to 255 elementary Opus streams. These may be either "uncoupled" or "coupled", indicating that the decoder is
 * configured to decode them to either 1 or 2 channels, respectively. The streams are ordered so that all coupled streams appear at the beginning.</p>
 * 
 * <p>A {@code mapping} table defines which decoded channel {@code i} should be used for each input/output (I/O) channel {@code j}. This table
 * is typically provided as an unsigned char array. Let {@code i = mapping[j]} be the index for I/O channel {@code j}. If {@code i < 2*coupled_streams},
 * then I/O channel {@code j} is encoded as the left channel of stream {@code (i/2)} if {@code i} is even, or as the right channel of stream {@code (i/2)}
 * if {@code i} is odd. Otherwise, I/O channel {@code j} is encoded as mono in stream {@code (i - coupled_streams)}, unless it has the special value 255,
 * in which case it is omitted from the encoding entirely (the decoder will reproduce it as silence). Each value {@code i} must either be the special
 * value 255 or be less than {@code streams + coupled_streams}.</p>
 * 
 * <p>The output channels specified by the encoder should use the <a href="https://www.xiph.org/vorbis/doc/Vorbis_I_spec.html#x1-810004.3.9">Vorbis channel
 * ordering</a>. A decoder may wish to apply an additional permutation to the mapping the encoder used to achieve a different output channel order (e.g.
 * for outputing in WAV order).</p>
 * 
 * <p>Each multistream packet contains an Opus packet for each stream, and all of the Opus packets in a single multistream packet must have the same
 * duration. Therefore the duration of a multistream packet can be extracted from the TOC sequence of the first stream, which is located at the beginning
 * of the packet, just like an elementary Opus stream:</p>
 * 
 * <pre><code>
 * int nb_samples, nb_frames;
 * nb_frames = opus_packet_get_nb_frames(data, len);
 * if (nb_frames &lt; 1)
 *     return nb_frames;
 * nb_samples = opus_packet_get_samples_per_frame(data, 48000) * nb_frames;</code></pre>
 * 
 * <p>The general encoding and decoding process proceeds exactly the same as in the normal encoder and decoder APIs. See their documentation for an overview
 * of how to use the corresponding multistream functions.</p>
 */
public class OpusMultistream {

    /**
     * Multistream CTLs
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #OPUS_MULTISTREAM_GET_ENCODER_STATE_REQUEST MULTISTREAM_GET_ENCODER_STATE_REQUEST}</li>
     * <li>{@link #OPUS_MULTISTREAM_GET_DECODER_STATE_REQUEST MULTISTREAM_GET_DECODER_STATE_REQUEST}</li>
     * </ul>
     */
    public static final int
        OPUS_MULTISTREAM_GET_ENCODER_STATE_REQUEST = 5120,
        OPUS_MULTISTREAM_GET_DECODER_STATE_REQUEST = 5122;

    protected OpusMultistream() {
        throw new UnsupportedOperationException();
    }

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

    // --- [ opus_multistream_encoder_get_size ] ---

    /**
     * Gets the size of an {@code OpusMSEncoder} structure.
     *
     * @param streams         the total number of streams to encode from the input. This must be no more than 255.
     * @param coupled_streams number of coupled (2 channel) streams to encode. This must be no larger than the total number of streams. Additionally, The total number of encoded
     *                        channels ({@code streams + coupled_streams}) must be no more than 255.
     *
     * @return the size in bytes on success, or a negative error code on error
     */
    @NativeType("opus_int32")
    public static int opus_multistream_encoder_get_size(int streams, int coupled_streams) {
        long __functionAddress = Functions.multistream_encoder_get_size;
        return invokeI(streams, coupled_streams, __functionAddress);
    }

    // --- [ opus_multistream_surround_encoder_get_size ] ---

    @NativeType("opus_int32")
    public static int opus_multistream_surround_encoder_get_size(int channels, int mapping_family) {
        long __functionAddress = Functions.multistream_surround_encoder_get_size;
        return invokeI(channels, mapping_family, __functionAddress);
    }

    // --- [ opus_multistream_encoder_create ] ---

    /**
     * Unsafe version of: {@link #opus_multistream_encoder_create multistream_encoder_create}
     *
     * @param channels number of channels in the input signal. This must be at most 255. It may be greater than the number of coded channels ({@code streams +
     *                 coupled_streams}).
     */
    public static long nopus_multistream_encoder_create(int Fs, int channels, int streams, int coupled_streams, long mapping, int application, long error) {
        long __functionAddress = Functions.multistream_encoder_create;
        return invokePPP(Fs, channels, streams, coupled_streams, mapping, application, error, __functionAddress);
    }

    /**
     * Allocates and initializes a multistream encoder state.
     * 
     * <p>Call {@link #opus_multistream_encoder_destroy multistream_encoder_destroy} to release this object when finished.</p>
     *
     * @param Fs              sampling rate of the input signal (in Hz). One of:<br><table><tr><td>8000</td><td>12000</td><td>16000</td><td>24000</td><td>48000</td></tr></table>
     * @param streams         the total number of streams to encode from the input. This must be no more than the number of channels.
     * @param coupled_streams number of coupled (2 channel) streams to encode. This must be no larger than the total number of streams. Additionally, The total number of encoded
     *                        channels ({@code streams + coupled_streams}) must be no more than the number of input channels.
     * @param mapping         Mapping from encoded channels to input channels. As an extra constraint, the multistream encoder does not allow encoding coupled streams for which
     *                        one channel is unused since this is never a good idea.
     * @param application     the target encoder application
     * @param error           returns {@link Opus#OPUS_OK OK} on success, or a negative error code on failure
     */
    @NativeType("OpusMSEncoder *")
    public static long opus_multistream_encoder_create(@NativeType("opus_int32") int Fs, int streams, int coupled_streams, @NativeType("unsigned char const *") ByteBuffer mapping, int application, @Nullable @NativeType("int *") IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        return nopus_multistream_encoder_create(Fs, mapping.remaining(), streams, coupled_streams, memAddress(mapping), application, memAddressSafe(error));
    }

    // --- [ opus_multistream_surround_encoder_create ] ---

    public static long nopus_multistream_surround_encoder_create(int Fs, int channels, int mapping_family, long streams, long coupled_streams, long mapping, int application, long error) {
        long __functionAddress = Functions.multistream_surround_encoder_create;
        return invokePPPPP(Fs, channels, mapping_family, streams, coupled_streams, mapping, application, error, __functionAddress);
    }

    @NativeType("OpusMSEncoder *")
    public static long opus_multistream_surround_encoder_create(@NativeType("opus_int32") int Fs, int mapping_family, @NativeType("int *") IntBuffer streams, @NativeType("int *") IntBuffer coupled_streams, @NativeType("unsigned char *") ByteBuffer mapping, int application, @Nullable @NativeType("int *") IntBuffer error) {
        if (CHECKS) {
            check(streams, 1);
            check(coupled_streams, 1);
            checkSafe(error, 1);
        }
        return nopus_multistream_surround_encoder_create(Fs, mapping.remaining(), mapping_family, memAddress(streams), memAddress(coupled_streams), memAddress(mapping), application, memAddressSafe(error));
    }

    // --- [ opus_multistream_encoder_init ] ---

    /**
     * Unsafe version of: {@link #opus_multistream_encoder_init multistream_encoder_init}
     *
     * @param channels number of channels in the input signal. This must be at most 255. It may be greater than the number of coded channels ({@code streams +
     *                 coupled_streams}).
     */
    public static int nopus_multistream_encoder_init(long st, int Fs, int channels, int streams, int coupled_streams, long mapping, int application) {
        long __functionAddress = Functions.multistream_encoder_init;
        if (CHECKS) {
            check(st);
        }
        return invokePPI(st, Fs, channels, streams, coupled_streams, mapping, application, __functionAddress);
    }

    /**
     * Initialize a previously allocated multistream encoder state.
     * 
     * <p>The memory pointed to by {@code st} must be at least the size returned by {@link #opus_multistream_encoder_get_size multistream_encoder_get_size}. This is intended for applications which use
     * their own allocator instead of {@code malloc}.</p>
     * 
     * <p>To reset a previously initialized state, use the {@link Opus#OPUS_RESET_STATE RESET_STATE} CTL.</p>
     *
     * @param st              multistream encoder state to initialize
     * @param Fs              sampling rate of input signal (Hz). One of:<br><table><tr><td>8000</td><td>12000</td><td>16000</td><td>24000</td><td>48000</td></tr></table>
     * @param streams         the total number of streams to encode from the input. This must be no more than the number of channels.
     * @param coupled_streams number of coupled (2 channel) streams to encode. This must be no larger than the total number of streams. Additionally, The total number of encoded
     *                        channels ({@code streams + coupled_streams}) must be no more than the number of input channels.
     * @param mapping         mapping from encoded channels to input channels. As an extra constraint, the multistream encoder does not allow encoding coupled streams for which
     *                        one channel is unused since this is never a good idea.
     * @param application     the target encoder application
     *
     * @return {@link Opus#OPUS_OK OK} on success, or a negative error code on failure
     */
    public static int opus_multistream_encoder_init(@NativeType("OpusMSEncoder *") long st, @NativeType("opus_int32") int Fs, int streams, int coupled_streams, @NativeType("unsigned char const *") ByteBuffer mapping, int application) {
        return nopus_multistream_encoder_init(st, Fs, mapping.remaining(), streams, coupled_streams, memAddress(mapping), application);
    }

    // --- [ opus_multistream_surround_encoder_init ] ---

    public static int nopus_multistream_surround_encoder_init(long st, int Fs, int channels, long streams, long coupled_streams, long mapping, int application) {
        long __functionAddress = Functions.multistream_surround_encoder_init;
        if (CHECKS) {
            check(st);
        }
        return invokePPPPI(st, Fs, channels, streams, coupled_streams, mapping, application, __functionAddress);
    }

    public static int opus_multistream_surround_encoder_init(@NativeType("OpusMSEncoder *") long st, @NativeType("opus_int32") int Fs, @NativeType("int *") IntBuffer streams, @NativeType("int *") IntBuffer coupled_streams, @NativeType("unsigned char const *") ByteBuffer mapping, int application) {
        if (CHECKS) {
            check(streams, 1);
            check(coupled_streams, 1);
        }
        return nopus_multistream_surround_encoder_init(st, Fs, mapping.remaining(), memAddress(streams), memAddress(coupled_streams), memAddress(mapping), application);
    }

    // --- [ opus_multistream_encode ] ---

    /**
     * Unsafe version of: {@link #opus_multistream_encode multistream_encode}
     *
     * @param max_data_bytes size of the allocated memory for the output payload. This may be used to impose an upper limit on the instant bitrate, but should not be used as
     *                       the only bitrate control. Use {@link Opus#OPUS_SET_BITRATE_REQUEST SET_BITRATE_REQUEST} to control the bitrate.
     */
    public static int nopus_multistream_encode(long st, long pcm, int frame_size, long data, int max_data_bytes) {
        long __functionAddress = Functions.multistream_encode;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, pcm, frame_size, data, max_data_bytes, __functionAddress);
    }

    /**
     * Encodes a multistream Opus frame.
     *
     * @param st         multistream encoder state
     * @param pcm        the input signal as interleaved samples. This must contain {@code frame_size*channels} samples.
     * @param frame_size number of samples per channel in the input signal. This must be an Opus frame size for the encoder's sampling rate. For example, at 48 kHz the
     *                   permitted values are 120, 240, 480, 960, 1920, and 2880. Passing in a duration of less than 10 ms (480 samples at 48 kHz) will prevent the encoder
     *                   from using the LPC or hybrid modes.
     * @param data       output payload. This must contain storage for at {@code max_data_bytes}.
     *
     * @return the length of the encoded packet (in bytes) on success or a negative error code on failure
     */
    public static int opus_multistream_encode(@NativeType("OpusMSEncoder *") long st, @NativeType("opus_int16 const *") ShortBuffer pcm, int frame_size, @NativeType("unsigned char *") ByteBuffer data) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st));
        }
        return nopus_multistream_encode(st, memAddress(pcm), frame_size, memAddress(data), data.remaining());
    }

    // --- [ opus_multistream_encode_float ] ---

    /**
     * Unsafe version of: {@link #opus_multistream_encode_float multistream_encode_float}
     *
     * @param max_data_bytes size of the allocated memory for the output payload. This may be used to impose an upper limit on the instant bitrate, but should not be used as
     *                       the only bitrate control. Use {@link Opus#OPUS_SET_BITRATE_REQUEST SET_BITRATE_REQUEST} to control the bitrate.
     */
    public static int nopus_multistream_encode_float(long st, long pcm, int frame_size, long data, int max_data_bytes) {
        long __functionAddress = Functions.multistream_encode_float;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, pcm, frame_size, data, max_data_bytes, __functionAddress);
    }

    /**
     * Encodes a multistream Opus frame from floating point input.
     *
     * @param st         multistream encoder state
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
    public static int opus_multistream_encode_float(@NativeType("OpusMSEncoder *") long st, @NativeType("float const *") FloatBuffer pcm, int frame_size, @NativeType("unsigned char *") ByteBuffer data) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st));
        }
        return nopus_multistream_encode_float(st, memAddress(pcm), frame_size, memAddress(data), data.remaining());
    }

    // --- [ opus_multistream_encoder_destroy ] ---

    /**
     * Frees an {@code OpusMSEncoder} allocated by {@link #opus_multistream_encoder_create multistream_encoder_create}.
     *
     * @param st multistream encoder state to be freed
     */
    public static void opus_multistream_encoder_destroy(@NativeType("OpusMSEncoder *") long st) {
        long __functionAddress = Functions.multistream_encoder_destroy;
        if (CHECKS) {
            check(st);
        }
        invokePV(st, __functionAddress);
    }

    // --- [ opus_multistream_encoder_ctl ] ---

    /**
     * Performs a CTL function on an multistream Opus encoder.
     *
     * @param st encoder state
     */
    private static int opus_multistream_encoder_ctl(@NativeType("OpusMSEncoder *") long st) {
        long __functionAddress = Functions.multistream_encoder_ctl;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, __functionAddress);
    }

    // --- [ opus_multistream_decoder_get_size ] ---

    /**
     * Gets the size of an {@code OpusMSDecoder} structure.
     *
     * @param streams         the total number of streams coded in the input. This must be no more than 255.
     * @param coupled_streams number streams to decode as coupled (2 channel) streams. This must be no larger than the total number of streams. Additionally, The total number of
     *                        coded channels ({@code streams + coupled_streams}) must be no more than 255.
     *
     * @return the size in bytes on success, or a negative error code on failure
     */
    @NativeType("opus_int32")
    public static int opus_multistream_decoder_get_size(int streams, int coupled_streams) {
        long __functionAddress = Functions.multistream_decoder_get_size;
        return invokeI(streams, coupled_streams, __functionAddress);
    }

    // --- [ opus_multistream_decoder_create ] ---

    /**
     * Unsafe version of: {@link #opus_multistream_decoder_create multistream_decoder_create}
     *
     * @param channels number of channels to decode. One of:<br><table><tr><td>1</td><td>2</td></tr></table>
     */
    public static long nopus_multistream_decoder_create(int Fs, int channels, int streams, int coupled_streams, long mapping, long error) {
        long __functionAddress = Functions.multistream_decoder_create;
        return invokePPP(Fs, channels, streams, coupled_streams, mapping, error, __functionAddress);
    }

    /**
     * Allocates and initializes a multistream decoder state.
     * 
     * <p>Call {@link #opus_multistream_decoder_destroy multistream_decoder_destroy} to release this object when finished.</p>
     *
     * @param Fs              sampling rate of input signal (Hz). One of:<br><table><tr><td>8000</td><td>12000</td><td>16000</td><td>24000</td><td>48000</td></tr></table>
     * @param streams         the total number of streams coded in the input. This must be no more than 255.
     * @param coupled_streams number streams to decode as coupled (2 channel) streams. This must be no larger than the total number of streams. Additionally, The total number of
     *                        coded channels ({@code streams + coupled_streams}) must be no more than 255.
     * @param mapping         mapping from coded channels to output channels
     * @param error           returns {@link Opus#OPUS_OK OK} on success, or a negative error code on failure
     */
    @NativeType("OpusMSDecoder *")
    public static long opus_multistream_decoder_create(@NativeType("opus_int32") int Fs, int streams, int coupled_streams, @NativeType("unsigned char const *") ByteBuffer mapping, @Nullable @NativeType("int *") IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        return nopus_multistream_decoder_create(Fs, mapping.remaining(), streams, coupled_streams, memAddress(mapping), memAddressSafe(error));
    }

    // --- [ opus_multistream_decoder_init ] ---

    /**
     * Unsafe version of: {@link #opus_multistream_decoder_init multistream_decoder_init}
     *
     * @param channels number of channels to decode. One of:<br><table><tr><td>1</td><td>2</td></tr></table>
     */
    public static int nopus_multistream_decoder_init(long st, int Fs, int channels, int streams, int coupled_streams, long mapping) {
        long __functionAddress = Functions.multistream_decoder_init;
        if (CHECKS) {
            check(st);
        }
        return invokePPI(st, Fs, channels, streams, coupled_streams, mapping, __functionAddress);
    }

    /**
     * Intialize a previously allocated decoder state object.
     * 
     * <p>The memory pointed to by {@code st} must be at least the size returned by {@link #opus_multistream_encoder_get_size multistream_encoder_get_size}. This is intended for applications which use
     * their own allocator instead of {@code malloc}.</p>
     * 
     * <p>To reset a previously initialized state, use the {@link Opus#OPUS_RESET_STATE RESET_STATE} CTL.</p>
     *
     * @param st              multistream decoder state to initialize
     * @param Fs              sampling rate of input signal (Hz). One of:<br><table><tr><td>8000</td><td>12000</td><td>16000</td><td>24000</td><td>48000</td></tr></table>
     * @param streams         the total number of streams coded in the input. This must be no more than 255.
     * @param coupled_streams number streams to decode as coupled (2 channel) streams. This must be no larger than the total number of streams. Additionally, The total number of
     *                        coded channels ({@code streams + coupled_streams}) must be no more than 255.
     * @param mapping         mapping from coded channels to output channels
     *
     * @return {@link Opus#OPUS_OK OK} on success, or a negative error code on failure
     */
    public static int opus_multistream_decoder_init(@NativeType("OpusMSDecoder *") long st, @NativeType("opus_int32") int Fs, int streams, int coupled_streams, @NativeType("unsigned char const *") ByteBuffer mapping) {
        return nopus_multistream_decoder_init(st, Fs, mapping.remaining(), streams, coupled_streams, memAddress(mapping));
    }

    // --- [ opus_multistream_decode ] ---

    /**
     * Unsafe version of: {@link #opus_multistream_decode multistream_decode}
     *
     * @param len number of bytes in payload
     */
    public static int nopus_multistream_decode(long st, long data, int len, long pcm, int frame_size, int decode_fec) {
        long __functionAddress = Functions.multistream_decode;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, data, len, pcm, frame_size, decode_fec, __functionAddress);
    }

    /**
     * Decode a multistream Opus packet.
     *
     * @param st         multistream decoder
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
    public static int opus_multistream_decode(@NativeType("OpusMSDecoder *") long st, @Nullable @NativeType("unsigned char const *") ByteBuffer data, @NativeType("opus_int16 *") ShortBuffer pcm, int frame_size, int decode_fec) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st));
        }
        return nopus_multistream_decode(st, memAddressSafe(data), remainingSafe(data), memAddress(pcm), frame_size, decode_fec);
    }

    // --- [ opus_multistream_decode_float ] ---

    /**
     * Unsafe version of: {@link #opus_multistream_decode_float multistream_decode_float}
     *
     * @param len number of bytes in payload
     */
    public static int nopus_multistream_decode_float(long st, long data, int len, long pcm, int frame_size, int decode_fec) {
        long __functionAddress = Functions.multistream_decode_float;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, data, len, pcm, frame_size, decode_fec, __functionAddress);
    }

    /**
     * Decode a multistream Opus packet with floating point output.
     *
     * @param st         multistream decoder
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
    public static int opus_multistream_decode_float(@NativeType("OpusMSDecoder *") long st, @Nullable @NativeType("unsigned char const *") ByteBuffer data, @NativeType("float *") FloatBuffer pcm, int frame_size, int decode_fec) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st));
        }
        return nopus_multistream_decode_float(st, memAddressSafe(data), remainingSafe(data), memAddress(pcm), frame_size, decode_fec);
    }

    // --- [ opus_multistream_decoder_ctl ] ---

    /**
     * Performs a CTL function on a multistream Opus decoder.
     *
     * @param st decoder state
     */
    private static int opus_multistream_decoder_ctl(@NativeType("OpusMSDecoder *") long st) {
        long __functionAddress = Functions.multistream_decoder_ctl;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, __functionAddress);
    }

    // --- [ opus_multistream_decoder_destroy ] ---

    /**
     * Frees an {@code OpusMSDecoder} allocated by {@link #opus_multistream_decoder_create multistream_decoder_create}.
     *
     * @param st multistream decoder state to be freed
     */
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