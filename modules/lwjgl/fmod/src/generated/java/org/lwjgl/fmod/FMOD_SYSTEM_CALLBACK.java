/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_SYSTEM_CALLBACK} */
public abstract class FMOD_SYSTEM_CALLBACK extends Callback implements FMOD_SYSTEM_CALLBACKI {

    /**
     * Creates a {@code FMOD_SYSTEM_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_SYSTEM_CALLBACK}
     */
    public static FMOD_SYSTEM_CALLBACK create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_SYSTEM_CALLBACK createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FMOD_SYSTEM_CALLBACK} instance that delegates to the specified {@code FMOD_SYSTEM_CALLBACKI} instance. */
    public static FMOD_SYSTEM_CALLBACK create(FMOD_SYSTEM_CALLBACKI instance) { return create(instance, instance.address()); }

    private static FMOD_SYSTEM_CALLBACK create(FMOD_SYSTEM_CALLBACKI instance, long functionPointer) {
        return instance instanceof FMOD_SYSTEM_CALLBACK
            ? (FMOD_SYSTEM_CALLBACK)instance
            : new FMOD_SYSTEM_CALLBACK(functionPointer) {
                @Override public int invoke(long system, int type, long commanddata1, long commanddata2, long userdata) {
                    return instance.invoke(system, type, commanddata1, commanddata2, userdata);
                }
            };
    }

    protected FMOD_SYSTEM_CALLBACK() {
        super(DESCRIPTOR);
    }

    FMOD_SYSTEM_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

}