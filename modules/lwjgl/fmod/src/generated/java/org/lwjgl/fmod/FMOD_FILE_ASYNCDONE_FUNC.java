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
    public static FMOD_FILE_ASYNCDONE_FUNC create(long functionPointer) {
        FMOD_FILE_ASYNCDONE_FUNCI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_FILE_ASYNCDONE_FUNC
            ? (FMOD_FILE_ASYNCDONE_FUNC)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_FILE_ASYNCDONE_FUNC createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_FILE_ASYNCDONE_FUNC} instance that delegates to the specified {@code FMOD_FILE_ASYNCDONE_FUNCI} instance. */
    public static FMOD_FILE_ASYNCDONE_FUNC create(FMOD_FILE_ASYNCDONE_FUNCI instance) {
        return instance instanceof FMOD_FILE_ASYNCDONE_FUNC
            ? (FMOD_FILE_ASYNCDONE_FUNC)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_FILE_ASYNCDONE_FUNC() {
        super(CIF);
    }

    FMOD_FILE_ASYNCDONE_FUNC(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_FILE_ASYNCDONE_FUNC {

        private final FMOD_FILE_ASYNCDONE_FUNCI delegate;

        Container(long functionPointer, FMOD_FILE_ASYNCDONE_FUNCI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long info, int result) {
            delegate.invoke(info, result);
        }

    }

}