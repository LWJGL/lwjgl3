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
public abstract class FMOD_MEMORY_ALLOC_CALLBACK extends Callback implements FMOD_MEMORY_ALLOC_CALLBACKI {

    /**
     * Creates a {@code FMOD_MEMORY_ALLOC_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_MEMORY_ALLOC_CALLBACK}
     */
    public static FMOD_MEMORY_ALLOC_CALLBACK create(long functionPointer) {
        FMOD_MEMORY_ALLOC_CALLBACKI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_MEMORY_ALLOC_CALLBACK
            ? (FMOD_MEMORY_ALLOC_CALLBACK)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_MEMORY_ALLOC_CALLBACK createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_MEMORY_ALLOC_CALLBACK} instance that delegates to the specified {@code FMOD_MEMORY_ALLOC_CALLBACKI} instance. */
    public static FMOD_MEMORY_ALLOC_CALLBACK create(FMOD_MEMORY_ALLOC_CALLBACKI instance) {
        return instance instanceof FMOD_MEMORY_ALLOC_CALLBACK
            ? (FMOD_MEMORY_ALLOC_CALLBACK)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_MEMORY_ALLOC_CALLBACK() {
        super(CIF);
    }

    FMOD_MEMORY_ALLOC_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_MEMORY_ALLOC_CALLBACK {

        private final FMOD_MEMORY_ALLOC_CALLBACKI delegate;

        Container(long functionPointer, FMOD_MEMORY_ALLOC_CALLBACKI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(int size, int type, long sourcestr) {
            return delegate.invoke(size, type, sourcestr);
        }

    }

}