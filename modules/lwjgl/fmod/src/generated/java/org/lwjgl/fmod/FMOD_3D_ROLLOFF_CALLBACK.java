/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_3D_ROLLOFF_CALLBACK} */
public abstract class FMOD_3D_ROLLOFF_CALLBACK extends Callback implements FMOD_3D_ROLLOFF_CALLBACKI {

    /**
     * Creates a {@code FMOD_3D_ROLLOFF_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_3D_ROLLOFF_CALLBACK}
     */
    public static FMOD_3D_ROLLOFF_CALLBACK create(long functionPointer) {
        FMOD_3D_ROLLOFF_CALLBACKI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_3D_ROLLOFF_CALLBACK
            ? (FMOD_3D_ROLLOFF_CALLBACK)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_3D_ROLLOFF_CALLBACK createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_3D_ROLLOFF_CALLBACK} instance that delegates to the specified {@code FMOD_3D_ROLLOFF_CALLBACKI} instance. */
    public static FMOD_3D_ROLLOFF_CALLBACK create(FMOD_3D_ROLLOFF_CALLBACKI instance) {
        return instance instanceof FMOD_3D_ROLLOFF_CALLBACK
            ? (FMOD_3D_ROLLOFF_CALLBACK)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_3D_ROLLOFF_CALLBACK() {
        super(CIF);
    }

    FMOD_3D_ROLLOFF_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_3D_ROLLOFF_CALLBACK {

        private final FMOD_3D_ROLLOFF_CALLBACKI delegate;

        Container(long functionPointer, FMOD_3D_ROLLOFF_CALLBACKI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public float invoke(long channelcontrol, float distance) {
            return delegate.invoke(channelcontrol, distance);
        }

    }

}