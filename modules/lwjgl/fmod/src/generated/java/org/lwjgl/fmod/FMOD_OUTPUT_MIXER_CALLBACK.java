/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_OUTPUT_MIXER_CALLBACK} */
public abstract class FMOD_OUTPUT_MIXER_CALLBACK extends Callback implements FMOD_OUTPUT_MIXER_CALLBACKI {

    /**
     * Creates a {@code FMOD_OUTPUT_MIXER_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_OUTPUT_MIXER_CALLBACK}
     */
    public static FMOD_OUTPUT_MIXER_CALLBACK create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_OUTPUT_MIXER_CALLBACK createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FMOD_OUTPUT_MIXER_CALLBACK} instance that delegates to the specified {@code FMOD_OUTPUT_MIXER_CALLBACKI} instance. */
    public static FMOD_OUTPUT_MIXER_CALLBACK create(FMOD_OUTPUT_MIXER_CALLBACKI instance) { return create(instance, instance.address()); }

    private static FMOD_OUTPUT_MIXER_CALLBACK create(FMOD_OUTPUT_MIXER_CALLBACKI instance, long functionPointer) {
        return instance instanceof FMOD_OUTPUT_MIXER_CALLBACK
            ? (FMOD_OUTPUT_MIXER_CALLBACK)instance
            : new FMOD_OUTPUT_MIXER_CALLBACK(functionPointer) {
                @Override public int invoke(long output_state) {
                    return instance.invoke(output_state);
                }
            };
    }

    protected FMOD_OUTPUT_MIXER_CALLBACK() {
        super(DESCRIPTOR);
    }

    FMOD_OUTPUT_MIXER_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

}