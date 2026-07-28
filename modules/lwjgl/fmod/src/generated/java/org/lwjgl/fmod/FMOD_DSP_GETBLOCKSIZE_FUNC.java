/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_DSP_GETBLOCKSIZE_FUNC} */
public abstract class FMOD_DSP_GETBLOCKSIZE_FUNC extends Callback implements FMOD_DSP_GETBLOCKSIZE_FUNCI {

    /**
     * Creates a {@code FMOD_DSP_GETBLOCKSIZE_FUNC} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_DSP_GETBLOCKSIZE_FUNC}
     */
    public static FMOD_DSP_GETBLOCKSIZE_FUNC create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_DSP_GETBLOCKSIZE_FUNC createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FMOD_DSP_GETBLOCKSIZE_FUNC} instance that delegates to the specified {@code FMOD_DSP_GETBLOCKSIZE_FUNCI} instance. */
    public static FMOD_DSP_GETBLOCKSIZE_FUNC create(FMOD_DSP_GETBLOCKSIZE_FUNCI instance) { return create(instance, instance.address()); }

    private static FMOD_DSP_GETBLOCKSIZE_FUNC create(FMOD_DSP_GETBLOCKSIZE_FUNCI instance, long functionPointer) {
        return instance instanceof FMOD_DSP_GETBLOCKSIZE_FUNC
            ? (FMOD_DSP_GETBLOCKSIZE_FUNC)instance
            : new FMOD_DSP_GETBLOCKSIZE_FUNC(functionPointer) {
                @Override public int invoke(long dsp_state, long blocksize) {
                    return instance.invoke(dsp_state, blocksize);
                }
            };
    }

    protected FMOD_DSP_GETBLOCKSIZE_FUNC() {
        super(DESCRIPTOR);
    }

    FMOD_DSP_GETBLOCKSIZE_FUNC(long functionPointer) {
        super(functionPointer);
    }

}