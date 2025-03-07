/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class CLProgramCallback extends Callback implements CLProgramCallbackI {

    /**
     * Creates a {@code CLProgramCallback} instance from the specified function pointer.
     *
     * @return the new {@code CLProgramCallback}
     */
    public static CLProgramCallback create(long functionPointer) {
        CLProgramCallbackI instance = Callback.get(functionPointer);
        return instance instanceof CLProgramCallback
            ? (CLProgramCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CLProgramCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code CLProgramCallback} instance that delegates to the specified {@code CLProgramCallbackI} instance. */
    public static CLProgramCallback create(CLProgramCallbackI instance) {
        return instance instanceof CLProgramCallback
            ? (CLProgramCallback)instance
            : new Container(instance.address(), instance);
    }

    protected CLProgramCallback() {
        super(CIF);
    }

    CLProgramCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends CLProgramCallback {

        private final CLProgramCallbackI delegate;

        Container(long functionPointer, CLProgramCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long program, long user_data) {
            delegate.invoke(program, user_data);
        }

    }

}