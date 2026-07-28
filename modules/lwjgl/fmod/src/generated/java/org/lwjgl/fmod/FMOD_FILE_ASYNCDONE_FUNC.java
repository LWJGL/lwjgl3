/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_FILE_ASYNCDONE_FUNC} */
public abstract class FMOD_FILE_ASYNCDONE_FUNC extends Callback implements FMOD_FILE_ASYNCDONE_FUNCI {

    /**
     * Creates a {@code FMOD_FILE_ASYNCDONE_FUNC} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_FILE_ASYNCDONE_FUNC}
     */
    public static FMOD_FILE_ASYNCDONE_FUNC create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_FILE_ASYNCDONE_FUNC createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FMOD_FILE_ASYNCDONE_FUNC} instance that delegates to the specified {@code FMOD_FILE_ASYNCDONE_FUNCI} instance. */
    public static FMOD_FILE_ASYNCDONE_FUNC create(FMOD_FILE_ASYNCDONE_FUNCI instance) { return create(instance, instance.address()); }

    private static FMOD_FILE_ASYNCDONE_FUNC create(FMOD_FILE_ASYNCDONE_FUNCI instance, long functionPointer) {
        return instance instanceof FMOD_FILE_ASYNCDONE_FUNC
            ? (FMOD_FILE_ASYNCDONE_FUNC)instance
            : new FMOD_FILE_ASYNCDONE_FUNC(functionPointer) {
                @Override public void invoke(long info, int result) {
                    instance.invoke(info, result);
                }
            };
    }

    protected FMOD_FILE_ASYNCDONE_FUNC() {
        super(DESCRIPTOR);
    }

    FMOD_FILE_ASYNCDONE_FUNC(long functionPointer) {
        super(functionPointer);
    }

}