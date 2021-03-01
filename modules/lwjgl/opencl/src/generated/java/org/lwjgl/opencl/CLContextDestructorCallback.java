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
 * Instances of this class may be passed to the {@link CL30#clSetContextDestructorCallback SetContextDestructorCallback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     cl_context context,
 *     void *user_data
 * )</code></pre>
 */
public abstract class CLContextDestructorCallback extends Callback implements CLContextDestructorCallbackI {

    /**
     * Creates a {@code CLContextDestructorCallback} instance from the specified function pointer.
     *
     * @return the new {@code CLContextDestructorCallback}
     */
    public static CLContextDestructorCallback create(long functionPointer) {
        CLContextDestructorCallbackI instance = Callback.get(functionPointer);
        return instance instanceof CLContextDestructorCallback
            ? (CLContextDestructorCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static CLContextDestructorCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code CLContextDestructorCallback} instance that delegates to the specified {@code CLContextDestructorCallbackI} instance. */
    public static CLContextDestructorCallback create(CLContextDestructorCallbackI instance) {
        return instance instanceof CLContextDestructorCallback
            ? (CLContextDestructorCallback)instance
            : new Container(instance.address(), instance);
    }

    protected CLContextDestructorCallback() {
        super(CIF);
    }

    CLContextDestructorCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends CLContextDestructorCallback {

        private final CLContextDestructorCallbackI delegate;

        Container(long functionPointer, CLContextDestructorCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long context, long user_data) {
            delegate.invoke(context, user_data);
        }

    }

}