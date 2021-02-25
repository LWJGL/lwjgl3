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
 * Instances of this class may be passed to the {@link CL11#clSetMemObjectDestructorCallback SetMemObjectDestructorCallback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     cl_mem memobj,
 *     void *user_data
 * )</code></pre>
 */
public abstract class CLMemObjectDestructorCallback extends Callback implements CLMemObjectDestructorCallbackI {

    /**
     * Creates a {@code CLMemObjectDestructorCallback} instance from the specified function pointer.
     *
     * @return the new {@code CLMemObjectDestructorCallback}
     */
    public static CLMemObjectDestructorCallback create(long functionPointer) {
        CLMemObjectDestructorCallbackI instance = Callback.get(functionPointer);
        return instance instanceof CLMemObjectDestructorCallback
            ? (CLMemObjectDestructorCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static CLMemObjectDestructorCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code CLMemObjectDestructorCallback} instance that delegates to the specified {@code CLMemObjectDestructorCallbackI} instance. */
    public static CLMemObjectDestructorCallback create(CLMemObjectDestructorCallbackI instance) {
        return instance instanceof CLMemObjectDestructorCallback
            ? (CLMemObjectDestructorCallback)instance
            : new Container(instance.address(), instance);
    }

    protected CLMemObjectDestructorCallback() {
        super(CIF);
    }

    CLMemObjectDestructorCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends CLMemObjectDestructorCallback {

        private final CLMemObjectDestructorCallbackI delegate;

        Container(long functionPointer, CLMemObjectDestructorCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long memobj, long user_data) {
            delegate.invoke(memobj, user_data);
        }

    }

}