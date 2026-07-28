/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_OUTPUT_GETDRIVERINFO_CALLBACK} */
public abstract class FMOD_OUTPUT_GETDRIVERINFO_CALLBACK extends Callback implements FMOD_OUTPUT_GETDRIVERINFO_CALLBACKI {

    /**
     * Creates a {@code FMOD_OUTPUT_GETDRIVERINFO_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_OUTPUT_GETDRIVERINFO_CALLBACK}
     */
    public static FMOD_OUTPUT_GETDRIVERINFO_CALLBACK create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_OUTPUT_GETDRIVERINFO_CALLBACK createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FMOD_OUTPUT_GETDRIVERINFO_CALLBACK} instance that delegates to the specified {@code FMOD_OUTPUT_GETDRIVERINFO_CALLBACKI} instance. */
    public static FMOD_OUTPUT_GETDRIVERINFO_CALLBACK create(FMOD_OUTPUT_GETDRIVERINFO_CALLBACKI instance) { return create(instance, instance.address()); }

    private static FMOD_OUTPUT_GETDRIVERINFO_CALLBACK create(FMOD_OUTPUT_GETDRIVERINFO_CALLBACKI instance, long functionPointer) {
        return instance instanceof FMOD_OUTPUT_GETDRIVERINFO_CALLBACK
            ? (FMOD_OUTPUT_GETDRIVERINFO_CALLBACK)instance
            : new FMOD_OUTPUT_GETDRIVERINFO_CALLBACK(functionPointer) {
                @Override public int invoke(long output_state, int id, long name, int namelen, long guid, long systemrate, long speakermode, long speakermodechannels) {
                    return instance.invoke(output_state, id, name, namelen, guid, systemrate, speakermode, speakermodechannels);
                }
            };
    }

    protected FMOD_OUTPUT_GETDRIVERINFO_CALLBACK() {
        super(DESCRIPTOR);
    }

    FMOD_OUTPUT_GETDRIVERINFO_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

}