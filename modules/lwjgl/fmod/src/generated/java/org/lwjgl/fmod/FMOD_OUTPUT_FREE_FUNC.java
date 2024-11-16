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
 * void (*{@link #invoke}) (
 *     void *ptr,
 *     char const *file,
 *     int line
 * )</code></pre>
 */
public abstract class FMOD_OUTPUT_FREE_FUNC extends Callback implements FMOD_OUTPUT_FREE_FUNCI {

    /**
     * Creates a {@code FMOD_OUTPUT_FREE_FUNC} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_OUTPUT_FREE_FUNC}
     */
    public static FMOD_OUTPUT_FREE_FUNC create(long functionPointer) {
        FMOD_OUTPUT_FREE_FUNCI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_OUTPUT_FREE_FUNC
            ? (FMOD_OUTPUT_FREE_FUNC)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_OUTPUT_FREE_FUNC createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_OUTPUT_FREE_FUNC} instance that delegates to the specified {@code FMOD_OUTPUT_FREE_FUNCI} instance. */
    public static FMOD_OUTPUT_FREE_FUNC create(FMOD_OUTPUT_FREE_FUNCI instance) {
        return instance instanceof FMOD_OUTPUT_FREE_FUNC
            ? (FMOD_OUTPUT_FREE_FUNC)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_OUTPUT_FREE_FUNC() {
        super(CIF);
    }

    FMOD_OUTPUT_FREE_FUNC(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_OUTPUT_FREE_FUNC {

        private final FMOD_OUTPUT_FREE_FUNCI delegate;

        Container(long functionPointer, FMOD_OUTPUT_FREE_FUNCI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long ptr, long file, int line) {
            delegate.invoke(ptr, file, line);
        }

    }

}