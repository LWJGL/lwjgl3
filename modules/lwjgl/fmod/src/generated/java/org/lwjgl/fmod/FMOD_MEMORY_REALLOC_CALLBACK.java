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
    public static FMOD_MEMORY_REALLOC_CALLBACK create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_MEMORY_REALLOC_CALLBACK createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FMOD_MEMORY_REALLOC_CALLBACK} instance that delegates to the specified {@code FMOD_MEMORY_REALLOC_CALLBACKI} instance. */
    public static FMOD_MEMORY_REALLOC_CALLBACK create(FMOD_MEMORY_REALLOC_CALLBACKI instance) { return create(instance, instance.address()); }

    private static FMOD_MEMORY_REALLOC_CALLBACK create(FMOD_MEMORY_REALLOC_CALLBACKI instance, long functionPointer) {
        return instance instanceof FMOD_MEMORY_REALLOC_CALLBACK
            ? (FMOD_MEMORY_REALLOC_CALLBACK)instance
            : new FMOD_MEMORY_REALLOC_CALLBACK(functionPointer) {
                @Override public long invoke(long ptr, int size, int type, long sourcestr) {
                    return instance.invoke(ptr, size, type, sourcestr);
                }
            };
    }

    protected FMOD_MEMORY_REALLOC_CALLBACK() {
        super(DESCRIPTOR);
    }

    FMOD_MEMORY_REALLOC_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

}