/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_OUTPUT_OPENPORT_CALLBACK} */
public abstract class FMOD_OUTPUT_OPENPORT_CALLBACK extends Callback implements FMOD_OUTPUT_OPENPORT_CALLBACKI {

    /**
     * Creates a {@code FMOD_OUTPUT_OPENPORT_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_OUTPUT_OPENPORT_CALLBACK}
     */
    public static FMOD_OUTPUT_OPENPORT_CALLBACK create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_OUTPUT_OPENPORT_CALLBACK createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FMOD_OUTPUT_OPENPORT_CALLBACK} instance that delegates to the specified {@code FMOD_OUTPUT_OPENPORT_CALLBACKI} instance. */
    public static FMOD_OUTPUT_OPENPORT_CALLBACK create(FMOD_OUTPUT_OPENPORT_CALLBACKI instance) { return create(instance, instance.address()); }

    private static FMOD_OUTPUT_OPENPORT_CALLBACK create(FMOD_OUTPUT_OPENPORT_CALLBACKI instance, long functionPointer) {
        return instance instanceof FMOD_OUTPUT_OPENPORT_CALLBACK
            ? (FMOD_OUTPUT_OPENPORT_CALLBACK)instance
            : new FMOD_OUTPUT_OPENPORT_CALLBACK(functionPointer) {
                @Override public int invoke(long output_state, int portType, long portIndex, long portId, long portRate, long portChannels, long portFormat) {
                    return instance.invoke(output_state, portType, portIndex, portId, portRate, portChannels, portFormat);
                }
            };
    }

    protected FMOD_OUTPUT_OPENPORT_CALLBACK() {
        super(DESCRIPTOR);
    }

    FMOD_OUTPUT_OPENPORT_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

}