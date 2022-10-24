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
 *     struct FMOD_CODEC_STATE *codec_state,
 *     void *buffer,
 *     unsigned int sizebytes,
 *     unsigned int *bytesread
 * )</code></pre>
 */
public abstract class FMOD_CODEC_FILE_READ_FUNC extends Callback implements FMOD_CODEC_FILE_READ_FUNCI {

    /**
     * Creates a {@code FMOD_CODEC_FILE_READ_FUNC} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_CODEC_FILE_READ_FUNC}
     */
    public static FMOD_CODEC_FILE_READ_FUNC create(long functionPointer) {
        FMOD_CODEC_FILE_READ_FUNCI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_CODEC_FILE_READ_FUNC
            ? (FMOD_CODEC_FILE_READ_FUNC)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FMOD_CODEC_FILE_READ_FUNC createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_CODEC_FILE_READ_FUNC} instance that delegates to the specified {@code FMOD_CODEC_FILE_READ_FUNCI} instance. */
    public static FMOD_CODEC_FILE_READ_FUNC create(FMOD_CODEC_FILE_READ_FUNCI instance) {
        return instance instanceof FMOD_CODEC_FILE_READ_FUNC
            ? (FMOD_CODEC_FILE_READ_FUNC)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_CODEC_FILE_READ_FUNC() {
        super(CIF);
    }

    FMOD_CODEC_FILE_READ_FUNC(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_CODEC_FILE_READ_FUNC {

        private final FMOD_CODEC_FILE_READ_FUNCI delegate;

        Container(long functionPointer, FMOD_CODEC_FILE_READ_FUNCI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long codec_state, long buffer, int sizebytes, long bytesread) {
            return delegate.invoke(codec_state, buffer, sizebytes, bytesread);
        }

    }

}