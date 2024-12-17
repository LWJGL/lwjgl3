/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK} */
public abstract class FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK extends Callback implements FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACKI {

    /**
     * Creates a {@code FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK}
     */
    public static FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK create(long functionPointer) {
        FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACKI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK
            ? (FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK} instance that delegates to the specified {@code FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACKI} instance. */
    public static FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK create(FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACKI instance) {
        return instance instanceof FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK
            ? (FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK() {
        super(CIF);
    }

    FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK {

        private final FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACKI delegate;

        Container(long functionPointer, FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACKI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long output_state, long maxhardwareobjects) {
            return delegate.invoke(output_state, maxhardwareobjects);
        }

    }

}