/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Instances of this interface may be passed to the {@link OpusFile#op_set_decode_callback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * int (*{@link #invoke}) (
 *     void *_ctx,
 *     OpusMSDecoder *_decoder,
 *     void *_pcm,
 *     ogg_packet const *_op,
 *     int _nsamples,
 *     int _nchannels,
 *     int _format,
 *     int _li
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("op_decode_cb_func")
public interface OPDecodeCBFuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_sint32,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_sint32, ffi_type_sint32, ffi_type_sint32, ffi_type_sint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 6 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 7 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /**
     * Called to decode an Opus packet.
     * 
     * <p>This should invoke the functional equivalent of {@link OpusMultistream#opus_multistream_decode multistream_decode} or {@link OpusMultistream#opus_multistream_decode_float multistream_decode_float}, except that it returns {@code 0} on success
     * instead of the number of decoded samples (which is known a priori).</p>
     *
     * @param _ctx       the application-provided callback context
     * @param _decoder   the decoder to use to decode the packet
     * @param _pcm       the buffer to decode into.
     *                   
     *                   <p>This will always have enough room for {@code _nchannels} of {@code _nsamples} samples, which should be placed into this buffer interleaved.</p>
     * @param _op        the packet to decode. This will always have its granule position set to a valid value.
     * @param _nsamples  the number of samples expected from the packet
     * @param _nchannels the number of channels expected from the packet
     * @param _format    the desired sample output format. This is either {@link OpusFile#OP_DEC_FORMAT_SHORT DEC_FORMAT_SHORT} or {@link OpusFile#OP_DEC_FORMAT_FLOAT DEC_FORMAT_FLOAT}.
     * @param _li        the index of the link from which this packet was decoded
     *
     * @return a non-negative value on success, or a negative value on error.
     *         
     *         <p>Any error codes should be the same as those returned by {@link OpusMultistream#opus_multistream_decode multistream_decode} or {@link OpusMultistream#opus_multistream_decode_float multistream_decode_float}. Success codes are as follows:</p>
     *         
     *         <ul>
     *         <li>{@code 0}: Decoding was successful. The application has filled the buffer with exactly {@code _nsamples* _nchannels} samples in the requested
     *         format.</li>
     *         <li>{@link OpusFile#OP_DEC_USE_DEFAULT DEC_USE_DEFAULT}: No decoding was done. libopusfile should do the decoding by itself instead.</li>
     *         </ul>
     */
    int invoke(@NativeType("void *") long _ctx, @NativeType("OpusMSDecoder *") long _decoder, @NativeType("void *") long _pcm, @NativeType("ogg_packet const *") long _op, int _nsamples, int _nchannels, int _format, int _li);

}