/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_STUDIO_SYSTEM_CALLBACK} */
public abstract class FMOD_STUDIO_SYSTEM_CALLBACK extends Callback implements FMOD_STUDIO_SYSTEM_CALLBACKI {

    /**
     * Creates a {@code FMOD_STUDIO_SYSTEM_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_STUDIO_SYSTEM_CALLBACK}
     */
    public static FMOD_STUDIO_SYSTEM_CALLBACK create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_STUDIO_SYSTEM_CALLBACK createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FMOD_STUDIO_SYSTEM_CALLBACK} instance that delegates to the specified {@code FMOD_STUDIO_SYSTEM_CALLBACKI} instance. */
    public static FMOD_STUDIO_SYSTEM_CALLBACK create(FMOD_STUDIO_SYSTEM_CALLBACKI instance) { return create(instance, instance.address()); }

    private static FMOD_STUDIO_SYSTEM_CALLBACK create(FMOD_STUDIO_SYSTEM_CALLBACKI instance, long functionPointer) {
        return instance instanceof FMOD_STUDIO_SYSTEM_CALLBACK
            ? (FMOD_STUDIO_SYSTEM_CALLBACK)instance
            : new FMOD_STUDIO_SYSTEM_CALLBACK(functionPointer) {
                @Override public int invoke(long system, int type, long commanddata, long userdata) {
                    return instance.invoke(system, type, commanddata, userdata);
                }
            };
    }

    protected FMOD_STUDIO_SYSTEM_CALLBACK() {
        super(DESCRIPTOR);
    }

    FMOD_STUDIO_SYSTEM_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

}