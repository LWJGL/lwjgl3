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
 *     unsigned int *size
 * )</code></pre>
 */
public abstract class FMOD_CODEC_FILE_SIZE_FUNC extends Callback implements FMOD_CODEC_FILE_SIZE_FUNCI {

    /**
     * Creates a {@code FMOD_CODEC_FILE_SIZE_FUNC} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_CODEC_FILE_SIZE_FUNC}
     */
    public static FMOD_CODEC_FILE_SIZE_FUNC create(long functionPointer) {
        FMOD_CODEC_FILE_SIZE_FUNCI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_CODEC_FILE_SIZE_FUNC
            ? (FMOD_CODEC_FILE_SIZE_FUNC)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_CODEC_FILE_SIZE_FUNC createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_CODEC_FILE_SIZE_FUNC} instance that delegates to the specified {@code FMOD_CODEC_FILE_SIZE_FUNCI} instance. */
    public static FMOD_CODEC_FILE_SIZE_FUNC create(FMOD_CODEC_FILE_SIZE_FUNCI instance) {
        return instance instanceof FMOD_CODEC_FILE_SIZE_FUNC
            ? (FMOD_CODEC_FILE_SIZE_FUNC)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_CODEC_FILE_SIZE_FUNC() {
        super(CIF);
    }

    FMOD_CODEC_FILE_SIZE_FUNC(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_CODEC_FILE_SIZE_FUNC {

        private final FMOD_CODEC_FILE_SIZE_FUNCI delegate;

        Container(long functionPointer, FMOD_CODEC_FILE_SIZE_FUNCI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long codec_state, long size) {
            return delegate.invoke(codec_state, size);
        }

    }

}