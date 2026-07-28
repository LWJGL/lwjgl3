/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_3D_ROLLOFF_CALLBACK} */
public abstract class FMOD_3D_ROLLOFF_CALLBACK extends Callback implements FMOD_3D_ROLLOFF_CALLBACKI {

    /**
     * Creates a {@code FMOD_3D_ROLLOFF_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_3D_ROLLOFF_CALLBACK}
     */
    public static FMOD_3D_ROLLOFF_CALLBACK create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_3D_ROLLOFF_CALLBACK createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FMOD_3D_ROLLOFF_CALLBACK} instance that delegates to the specified {@code FMOD_3D_ROLLOFF_CALLBACKI} instance. */
    public static FMOD_3D_ROLLOFF_CALLBACK create(FMOD_3D_ROLLOFF_CALLBACKI instance) { return create(instance, instance.address()); }

    private static FMOD_3D_ROLLOFF_CALLBACK create(FMOD_3D_ROLLOFF_CALLBACKI instance, long functionPointer) {
        return instance instanceof FMOD_3D_ROLLOFF_CALLBACK
            ? (FMOD_3D_ROLLOFF_CALLBACK)instance
            : new FMOD_3D_ROLLOFF_CALLBACK(functionPointer) {
                @Override public float invoke(long channelcontrol, float distance) {
                    return instance.invoke(channelcontrol, distance);
                }
            };
    }

    protected FMOD_3D_ROLLOFF_CALLBACK() {
        super(DESCRIPTOR);
    }

    FMOD_3D_ROLLOFF_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

}