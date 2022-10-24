/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * FMOD_RESULT (*{@link #invoke}) (
 *     struct FMOD_DSP_STATE *dsp_state,
 *     float *inbuffer,
 *     float *outbuffer,
 *     unsigned int length,
 *     int inchannels,
 *     int *outchannels
 * )</code></pre>
 */
public abstract class FMOD_DSP_READ_CALLBACK extends Callback implements FMOD_DSP_READ_CALLBACKI {

    /**
     * Creates a {@code FMOD_DSP_READ_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_DSP_READ_CALLBACK}
     */
    public static FMOD_DSP_READ_CALLBACK create(long functionPointer) {
        FMOD_DSP_READ_CALLBACKI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_DSP_READ_CALLBACK
            ? (FMOD_DSP_READ_CALLBACK)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_READ_CALLBACK createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_DSP_READ_CALLBACK} instance that delegates to the specified {@code FMOD_DSP_READ_CALLBACKI} instance. */
    public static FMOD_DSP_READ_CALLBACK create(FMOD_DSP_READ_CALLBACKI instance) {
        return instance instanceof FMOD_DSP_READ_CALLBACK
            ? (FMOD_DSP_READ_CALLBACK)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_DSP_READ_CALLBACK() {
        super(CIF);
    }

    FMOD_DSP_READ_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_DSP_READ_CALLBACK {

        private final FMOD_DSP_READ_CALLBACKI delegate;

        Container(long functionPointer, FMOD_DSP_READ_CALLBACKI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long dsp_state, long inbuffer, long outbuffer, int length, int inchannels, long outchannels) {
            return delegate.invoke(dsp_state, inbuffer, outbuffer, length, inchannels, outchannels);
        }

    }

}