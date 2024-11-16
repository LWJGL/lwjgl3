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
 * void * (*{@link #invoke}) (
 *     unsigned int size,
 *     FMOD_MEMORY_TYPE type,
 *     char const *sourcestr
 * )</code></pre>
 */
public abstract class FMOD_DSP_ALLOC_FUNC extends Callback implements FMOD_DSP_ALLOC_FUNCI {

    /**
     * Creates a {@code FMOD_DSP_ALLOC_FUNC} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_DSP_ALLOC_FUNC}
     */
    public static FMOD_DSP_ALLOC_FUNC create(long functionPointer) {
        FMOD_DSP_ALLOC_FUNCI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_DSP_ALLOC_FUNC
            ? (FMOD_DSP_ALLOC_FUNC)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_DSP_ALLOC_FUNC createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_DSP_ALLOC_FUNC} instance that delegates to the specified {@code FMOD_DSP_ALLOC_FUNCI} instance. */
    public static FMOD_DSP_ALLOC_FUNC create(FMOD_DSP_ALLOC_FUNCI instance) {
        return instance instanceof FMOD_DSP_ALLOC_FUNC
            ? (FMOD_DSP_ALLOC_FUNC)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_DSP_ALLOC_FUNC() {
        super(CIF);
    }

    FMOD_DSP_ALLOC_FUNC(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_DSP_ALLOC_FUNC {

        private final FMOD_DSP_ALLOC_FUNCI delegate;

        Container(long functionPointer, FMOD_DSP_ALLOC_FUNCI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(int size, int type, long sourcestr) {
            return delegate.invoke(size, type, sourcestr);
        }

    }

}