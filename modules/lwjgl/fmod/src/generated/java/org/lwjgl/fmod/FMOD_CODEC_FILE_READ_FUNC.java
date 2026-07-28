/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_CODEC_FILE_READ_FUNC} */
public abstract class FMOD_CODEC_FILE_READ_FUNC extends Callback implements FMOD_CODEC_FILE_READ_FUNCI {

    /**
     * Creates a {@code FMOD_CODEC_FILE_READ_FUNC} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_CODEC_FILE_READ_FUNC}
     */
    public static FMOD_CODEC_FILE_READ_FUNC create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_CODEC_FILE_READ_FUNC createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FMOD_CODEC_FILE_READ_FUNC} instance that delegates to the specified {@code FMOD_CODEC_FILE_READ_FUNCI} instance. */
    public static FMOD_CODEC_FILE_READ_FUNC create(FMOD_CODEC_FILE_READ_FUNCI instance) { return create(instance, instance.address()); }

    private static FMOD_CODEC_FILE_READ_FUNC create(FMOD_CODEC_FILE_READ_FUNCI instance, long functionPointer) {
        return instance instanceof FMOD_CODEC_FILE_READ_FUNC
            ? (FMOD_CODEC_FILE_READ_FUNC)instance
            : new FMOD_CODEC_FILE_READ_FUNC(functionPointer) {
                @Override public int invoke(long codec_state, long buffer, int sizebytes, long bytesread) {
                    return instance.invoke(codec_state, buffer, sizebytes, bytesread);
                }
            };
    }

    protected FMOD_CODEC_FILE_READ_FUNC() {
        super(DESCRIPTOR);
    }

    FMOD_CODEC_FILE_READ_FUNC(long functionPointer) {
        super(functionPointer);
    }

}