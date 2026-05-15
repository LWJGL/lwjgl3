/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_CODEC_SETPOSITION_CALLBACK} */
public abstract class FMOD_CODEC_SETPOSITION_CALLBACK extends Callback implements FMOD_CODEC_SETPOSITION_CALLBACKI {

    /**
     * Creates a {@code FMOD_CODEC_SETPOSITION_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_CODEC_SETPOSITION_CALLBACK}
     */
    public static FMOD_CODEC_SETPOSITION_CALLBACK create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_CODEC_SETPOSITION_CALLBACK createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FMOD_CODEC_SETPOSITION_CALLBACK} instance that delegates to the specified {@code FMOD_CODEC_SETPOSITION_CALLBACKI} instance. */
    public static FMOD_CODEC_SETPOSITION_CALLBACK create(FMOD_CODEC_SETPOSITION_CALLBACKI instance) { return create(instance, instance.address()); }

    private static FMOD_CODEC_SETPOSITION_CALLBACK create(FMOD_CODEC_SETPOSITION_CALLBACKI instance, long functionPointer) {
        return instance instanceof FMOD_CODEC_SETPOSITION_CALLBACK
            ? (FMOD_CODEC_SETPOSITION_CALLBACK)instance
            : new FMOD_CODEC_SETPOSITION_CALLBACK(functionPointer) {
                @Override public int invoke(long codec_state, int subsound, int position, int postype) {
                    return instance.invoke(codec_state, subsound, position, postype);
                }
            };
    }

    protected FMOD_CODEC_SETPOSITION_CALLBACK() {
        super(DESCRIPTOR);
    }

    FMOD_CODEC_SETPOSITION_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

}