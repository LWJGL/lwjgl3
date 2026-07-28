/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_CODEC_FILE_SEEK_FUNC} */
public abstract class FMOD_CODEC_FILE_SEEK_FUNC extends Callback implements FMOD_CODEC_FILE_SEEK_FUNCI {

    /**
     * Creates a {@code FMOD_CODEC_FILE_SEEK_FUNC} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_CODEC_FILE_SEEK_FUNC}
     */
    public static FMOD_CODEC_FILE_SEEK_FUNC create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_CODEC_FILE_SEEK_FUNC createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FMOD_CODEC_FILE_SEEK_FUNC} instance that delegates to the specified {@code FMOD_CODEC_FILE_SEEK_FUNCI} instance. */
    public static FMOD_CODEC_FILE_SEEK_FUNC create(FMOD_CODEC_FILE_SEEK_FUNCI instance) { return create(instance, instance.address()); }

    private static FMOD_CODEC_FILE_SEEK_FUNC create(FMOD_CODEC_FILE_SEEK_FUNCI instance, long functionPointer) {
        return instance instanceof FMOD_CODEC_FILE_SEEK_FUNC
            ? (FMOD_CODEC_FILE_SEEK_FUNC)instance
            : new FMOD_CODEC_FILE_SEEK_FUNC(functionPointer) {
                @Override public int invoke(long codec_state, int pos, int method) {
                    return instance.invoke(codec_state, pos, method);
                }
            };
    }

    protected FMOD_CODEC_FILE_SEEK_FUNC() {
        super(DESCRIPTOR);
    }

    FMOD_CODEC_FILE_SEEK_FUNC(long functionPointer) {
        super(functionPointer);
    }

}