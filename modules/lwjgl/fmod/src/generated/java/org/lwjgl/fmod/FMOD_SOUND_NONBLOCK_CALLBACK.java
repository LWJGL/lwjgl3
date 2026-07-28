/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_SOUND_NONBLOCK_CALLBACK} */
public abstract class FMOD_SOUND_NONBLOCK_CALLBACK extends Callback implements FMOD_SOUND_NONBLOCK_CALLBACKI {

    /**
     * Creates a {@code FMOD_SOUND_NONBLOCK_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_SOUND_NONBLOCK_CALLBACK}
     */
    public static FMOD_SOUND_NONBLOCK_CALLBACK create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_SOUND_NONBLOCK_CALLBACK createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FMOD_SOUND_NONBLOCK_CALLBACK} instance that delegates to the specified {@code FMOD_SOUND_NONBLOCK_CALLBACKI} instance. */
    public static FMOD_SOUND_NONBLOCK_CALLBACK create(FMOD_SOUND_NONBLOCK_CALLBACKI instance) { return create(instance, instance.address()); }

    private static FMOD_SOUND_NONBLOCK_CALLBACK create(FMOD_SOUND_NONBLOCK_CALLBACKI instance, long functionPointer) {
        return instance instanceof FMOD_SOUND_NONBLOCK_CALLBACK
            ? (FMOD_SOUND_NONBLOCK_CALLBACK)instance
            : new FMOD_SOUND_NONBLOCK_CALLBACK(functionPointer) {
                @Override public int invoke(long sound, int result) {
                    return instance.invoke(sound, result);
                }
            };
    }

    protected FMOD_SOUND_NONBLOCK_CALLBACK() {
        super(DESCRIPTOR);
    }

    FMOD_SOUND_NONBLOCK_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

}