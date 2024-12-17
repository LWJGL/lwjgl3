/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_OUTPUT_COPYPORT_FUNC} */
public abstract class FMOD_OUTPUT_COPYPORT_FUNC extends Callback implements FMOD_OUTPUT_COPYPORT_FUNCI {

    /**
     * Creates a {@code FMOD_OUTPUT_COPYPORT_FUNC} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_OUTPUT_COPYPORT_FUNC}
     */
    public static FMOD_OUTPUT_COPYPORT_FUNC create(long functionPointer) {
        FMOD_OUTPUT_COPYPORT_FUNCI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_OUTPUT_COPYPORT_FUNC
            ? (FMOD_OUTPUT_COPYPORT_FUNC)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_OUTPUT_COPYPORT_FUNC createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_OUTPUT_COPYPORT_FUNC} instance that delegates to the specified {@code FMOD_OUTPUT_COPYPORT_FUNCI} instance. */
    public static FMOD_OUTPUT_COPYPORT_FUNC create(FMOD_OUTPUT_COPYPORT_FUNCI instance) {
        return instance instanceof FMOD_OUTPUT_COPYPORT_FUNC
            ? (FMOD_OUTPUT_COPYPORT_FUNC)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_OUTPUT_COPYPORT_FUNC() {
        super(CIF);
    }

    FMOD_OUTPUT_COPYPORT_FUNC(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_OUTPUT_COPYPORT_FUNC {

        private final FMOD_OUTPUT_COPYPORT_FUNCI delegate;

        Container(long functionPointer, FMOD_OUTPUT_COPYPORT_FUNCI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long output_state, int portId, long buffer, int length) {
            return delegate.invoke(output_state, portId, buffer, length);
        }

    }

}