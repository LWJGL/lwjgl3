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
    public static FMOD_SYSTEM_CALLBACK create(long functionPointer) {
        FMOD_SYSTEM_CALLBACKI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_SYSTEM_CALLBACK
            ? (FMOD_SYSTEM_CALLBACK)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_SYSTEM_CALLBACK createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_SYSTEM_CALLBACK} instance that delegates to the specified {@code FMOD_SYSTEM_CALLBACKI} instance. */
    public static FMOD_SYSTEM_CALLBACK create(FMOD_SYSTEM_CALLBACKI instance) {
        return instance instanceof FMOD_SYSTEM_CALLBACK
            ? (FMOD_SYSTEM_CALLBACK)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_SYSTEM_CALLBACK() {
        super(CIF);
    }

    FMOD_SYSTEM_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_SYSTEM_CALLBACK {

        private final FMOD_SYSTEM_CALLBACKI delegate;

        Container(long functionPointer, FMOD_SYSTEM_CALLBACKI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long system, int type, long commanddata1, long commanddata2, long userdata) {
            return delegate.invoke(system, type, commanddata1, commanddata2, userdata);
        }

    }

}