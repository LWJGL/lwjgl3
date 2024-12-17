/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_DEBUG_CALLBACK} */
public abstract class FMOD_DEBUG_CALLBACK extends Callback implements FMOD_DEBUG_CALLBACKI {

    /**
     * Creates a {@code FMOD_DEBUG_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_DEBUG_CALLBACK}
     */
    public static FMOD_DEBUG_CALLBACK create(long functionPointer) {
        FMOD_DEBUG_CALLBACKI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_DEBUG_CALLBACK
            ? (FMOD_DEBUG_CALLBACK)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_DEBUG_CALLBACK createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_DEBUG_CALLBACK} instance that delegates to the specified {@code FMOD_DEBUG_CALLBACKI} instance. */
    public static FMOD_DEBUG_CALLBACK create(FMOD_DEBUG_CALLBACKI instance) {
        return instance instanceof FMOD_DEBUG_CALLBACK
            ? (FMOD_DEBUG_CALLBACK)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_DEBUG_CALLBACK() {
        super(CIF);
    }

    FMOD_DEBUG_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_DEBUG_CALLBACK {

        private final FMOD_DEBUG_CALLBACKI delegate;

        Container(long functionPointer, FMOD_DEBUG_CALLBACKI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(int flags, long file, int line, long func, long message) {
            return delegate.invoke(flags, file, line, func, message);
        }

    }

}