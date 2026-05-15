/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_MEMORY_FREE_CALLBACK} */
public abstract class FMOD_MEMORY_FREE_CALLBACK extends Callback implements FMOD_MEMORY_FREE_CALLBACKI {

    /**
     * Creates a {@code FMOD_MEMORY_FREE_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_MEMORY_FREE_CALLBACK}
     */
    public static FMOD_MEMORY_FREE_CALLBACK create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_MEMORY_FREE_CALLBACK createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FMOD_MEMORY_FREE_CALLBACK} instance that delegates to the specified {@code FMOD_MEMORY_FREE_CALLBACKI} instance. */
    public static FMOD_MEMORY_FREE_CALLBACK create(FMOD_MEMORY_FREE_CALLBACKI instance) { return create(instance, instance.address()); }

    private static FMOD_MEMORY_FREE_CALLBACK create(FMOD_MEMORY_FREE_CALLBACKI instance, long functionPointer) {
        return instance instanceof FMOD_MEMORY_FREE_CALLBACK
            ? (FMOD_MEMORY_FREE_CALLBACK)instance
            : new FMOD_MEMORY_FREE_CALLBACK(functionPointer) {
                @Override public void invoke(long ptr, int type, long sourcestr) {
                    instance.invoke(ptr, type, sourcestr);
                }
            };
    }

    protected FMOD_MEMORY_FREE_CALLBACK() {
        super(DESCRIPTOR);
    }

    FMOD_MEMORY_FREE_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

}