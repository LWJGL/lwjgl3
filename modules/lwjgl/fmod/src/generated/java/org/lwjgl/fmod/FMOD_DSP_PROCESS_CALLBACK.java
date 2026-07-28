/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_DSP_PROCESS_CALLBACK} */
public abstract class FMOD_DSP_PROCESS_CALLBACK extends Callback implements FMOD_DSP_PROCESS_CALLBACKI {

    /**
     * Creates a {@code FMOD_DSP_PROCESS_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_DSP_PROCESS_CALLBACK}
     */
    public static FMOD_DSP_PROCESS_CALLBACK create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_DSP_PROCESS_CALLBACK createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FMOD_DSP_PROCESS_CALLBACK} instance that delegates to the specified {@code FMOD_DSP_PROCESS_CALLBACKI} instance. */
    public static FMOD_DSP_PROCESS_CALLBACK create(FMOD_DSP_PROCESS_CALLBACKI instance) { return create(instance, instance.address()); }

    private static FMOD_DSP_PROCESS_CALLBACK create(FMOD_DSP_PROCESS_CALLBACKI instance, long functionPointer) {
        return instance instanceof FMOD_DSP_PROCESS_CALLBACK
            ? (FMOD_DSP_PROCESS_CALLBACK)instance
            : new FMOD_DSP_PROCESS_CALLBACK(functionPointer) {
                @Override public int invoke(long dsp_state, int length, long inbufferarray, long outbufferarray, int inputsidle, int op) {
                    return instance.invoke(dsp_state, length, inbufferarray, outbufferarray, inputsidle, op);
                }
            };
    }

    protected FMOD_DSP_PROCESS_CALLBACK() {
        super(DESCRIPTOR);
    }

    FMOD_DSP_PROCESS_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

}