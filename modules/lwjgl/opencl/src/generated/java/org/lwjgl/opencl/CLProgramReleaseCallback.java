/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@link CL22#clSetProgramReleaseCallback SetProgramReleaseCallback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     cl_program program,
 *     void *user_data
 * )</code></pre>
 */
public abstract class CLProgramReleaseCallback extends Callback implements CLProgramReleaseCallbackI {

    /**
     * Creates a {@code CLProgramReleaseCallback} instance from the specified function pointer.
     *
     * @return the new {@code CLProgramReleaseCallback}
     */
    public static CLProgramReleaseCallback create(long functionPointer) {
        CLProgramReleaseCallbackI instance = Callback.get(functionPointer);
        return instance instanceof CLProgramReleaseCallback
            ? (CLProgramReleaseCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static CLProgramReleaseCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code CLProgramReleaseCallback} instance that delegates to the specified {@code CLProgramReleaseCallbackI} instance. */
    public static CLProgramReleaseCallback create(CLProgramReleaseCallbackI instance) {
        return instance instanceof CLProgramReleaseCallback
            ? (CLProgramReleaseCallback)instance
            : new Container(instance.address(), instance);
    }

    protected CLProgramReleaseCallback() {
        super(CIF);
    }

    CLProgramReleaseCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends CLProgramReleaseCallback {

        private final CLProgramReleaseCallbackI delegate;

        Container(long functionPointer, CLProgramReleaseCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long program, long user_data) {
            delegate.invoke(program, user_data);
        }

    }

}