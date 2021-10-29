/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@link OpusFile#op_set_decode_callback} method.
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
public abstract class OPDecodeCBFunc extends Callback implements OPDecodeCBFuncI {

    /**
     * Creates a {@code OPDecodeCBFunc} instance from the specified function pointer.
     *
     * @return the new {@code OPDecodeCBFunc}
     */
    public static OPDecodeCBFunc create(long functionPointer) {
        OPDecodeCBFuncI instance = Callback.get(functionPointer);
        return instance instanceof OPDecodeCBFunc
            ? (OPDecodeCBFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static OPDecodeCBFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code OPDecodeCBFunc} instance that delegates to the specified {@code OPDecodeCBFuncI} instance. */
    public static OPDecodeCBFunc create(OPDecodeCBFuncI instance) {
        return instance instanceof OPDecodeCBFunc
            ? (OPDecodeCBFunc)instance
            : new Container(instance.address(), instance);
    }

    protected OPDecodeCBFunc() {
        super(CIF);
    }

    OPDecodeCBFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends OPDecodeCBFunc {

        private final OPDecodeCBFuncI delegate;

        Container(long functionPointer, OPDecodeCBFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long _ctx, long _decoder, long _pcm, long _op, int _nsamples, int _nchannels, int _format, int _li) {
            return delegate.invoke(_ctx, _decoder, _pcm, _op, _nsamples, _nchannels, _format, _li);
        }

    }

}