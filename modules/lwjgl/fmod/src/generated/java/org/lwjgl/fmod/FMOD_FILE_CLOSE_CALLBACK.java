/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * FMOD_RESULT (*{@link #invoke}) (
 *     void *handle,
 *     void *userdata
 * )</code></pre>
 */
public abstract class FMOD_FILE_CLOSE_CALLBACK extends Callback implements FMOD_FILE_CLOSE_CALLBACKI {

    /**
     * Creates a {@code FMOD_FILE_CLOSE_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_FILE_CLOSE_CALLBACK}
     */
    public static FMOD_FILE_CLOSE_CALLBACK create(long functionPointer) {
        FMOD_FILE_CLOSE_CALLBACKI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_FILE_CLOSE_CALLBACK
            ? (FMOD_FILE_CLOSE_CALLBACK)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_FILE_CLOSE_CALLBACK createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_FILE_CLOSE_CALLBACK} instance that delegates to the specified {@code FMOD_FILE_CLOSE_CALLBACKI} instance. */
    public static FMOD_FILE_CLOSE_CALLBACK create(FMOD_FILE_CLOSE_CALLBACKI instance) {
        return instance instanceof FMOD_FILE_CLOSE_CALLBACK
            ? (FMOD_FILE_CLOSE_CALLBACK)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_FILE_CLOSE_CALLBACK() {
        super(CIF);
    }

    FMOD_FILE_CLOSE_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_FILE_CLOSE_CALLBACK {

        private final FMOD_FILE_CLOSE_CALLBACKI delegate;

        Container(long functionPointer, FMOD_FILE_CLOSE_CALLBACKI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long handle, long userdata) {
            return delegate.invoke(handle, userdata);
        }

    }

}