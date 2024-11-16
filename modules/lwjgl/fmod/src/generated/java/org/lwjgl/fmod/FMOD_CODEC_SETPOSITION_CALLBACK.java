/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * FMOD_RESULT (*{@link #invoke}) (
 *     struct FMOD_CODEC_STATE *codec_state,
 *     int subsound,
 *     unsigned int position,
 *     FMOD_TIMEUNIT postype
 * )</code></pre>
 */
public abstract class FMOD_CODEC_SETPOSITION_CALLBACK extends Callback implements FMOD_CODEC_SETPOSITION_CALLBACKI {

    /**
     * Creates a {@code FMOD_CODEC_SETPOSITION_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_CODEC_SETPOSITION_CALLBACK}
     */
    public static FMOD_CODEC_SETPOSITION_CALLBACK create(long functionPointer) {
        FMOD_CODEC_SETPOSITION_CALLBACKI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_CODEC_SETPOSITION_CALLBACK
            ? (FMOD_CODEC_SETPOSITION_CALLBACK)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_CODEC_SETPOSITION_CALLBACK createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_CODEC_SETPOSITION_CALLBACK} instance that delegates to the specified {@code FMOD_CODEC_SETPOSITION_CALLBACKI} instance. */
    public static FMOD_CODEC_SETPOSITION_CALLBACK create(FMOD_CODEC_SETPOSITION_CALLBACKI instance) {
        return instance instanceof FMOD_CODEC_SETPOSITION_CALLBACK
            ? (FMOD_CODEC_SETPOSITION_CALLBACK)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_CODEC_SETPOSITION_CALLBACK() {
        super(CIF);
    }

    FMOD_CODEC_SETPOSITION_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_CODEC_SETPOSITION_CALLBACK {

        private final FMOD_CODEC_SETPOSITION_CALLBACKI delegate;

        Container(long functionPointer, FMOD_CODEC_SETPOSITION_CALLBACKI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long codec_state, int subsound, int position, int postype) {
            return delegate.invoke(codec_state, subsound, position, postype);
        }

    }

}