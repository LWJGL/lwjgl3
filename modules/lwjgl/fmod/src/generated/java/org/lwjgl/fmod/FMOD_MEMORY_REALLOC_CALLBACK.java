/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_MEMORY_REALLOC_CALLBACK} */
public abstract class FMOD_MEMORY_REALLOC_CALLBACK extends Callback implements FMOD_MEMORY_REALLOC_CALLBACKI {

    /**
     * Creates a {@code FMOD_MEMORY_REALLOC_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_MEMORY_REALLOC_CALLBACK}
     */
    public static FMOD_MEMORY_REALLOC_CALLBACK create(long functionPointer) {
        FMOD_MEMORY_REALLOC_CALLBACKI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_MEMORY_REALLOC_CALLBACK
            ? (FMOD_MEMORY_REALLOC_CALLBACK)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_MEMORY_REALLOC_CALLBACK createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_MEMORY_REALLOC_CALLBACK} instance that delegates to the specified {@code FMOD_MEMORY_REALLOC_CALLBACKI} instance. */
    public static FMOD_MEMORY_REALLOC_CALLBACK create(FMOD_MEMORY_REALLOC_CALLBACKI instance) {
        return instance instanceof FMOD_MEMORY_REALLOC_CALLBACK
            ? (FMOD_MEMORY_REALLOC_CALLBACK)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_MEMORY_REALLOC_CALLBACK() {
        super(CIF);
    }

    FMOD_MEMORY_REALLOC_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_MEMORY_REALLOC_CALLBACK {

        private final FMOD_MEMORY_REALLOC_CALLBACKI delegate;

        Container(long functionPointer, FMOD_MEMORY_REALLOC_CALLBACKI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long ptr, int size, int type, long sourcestr) {
            return delegate.invoke(ptr, size, type, sourcestr);
        }

    }

}