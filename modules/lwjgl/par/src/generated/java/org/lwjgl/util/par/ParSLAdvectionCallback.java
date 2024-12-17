/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.par;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke parsl_advection_callback} */
public abstract class ParSLAdvectionCallback extends Callback implements ParSLAdvectionCallbackI {

    /**
     * Creates a {@code ParSLAdvectionCallback} instance from the specified function pointer.
     *
     * @return the new {@code ParSLAdvectionCallback}
     */
    public static ParSLAdvectionCallback create(long functionPointer) {
        ParSLAdvectionCallbackI instance = Callback.get(functionPointer);
        return instance instanceof ParSLAdvectionCallback
            ? (ParSLAdvectionCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ParSLAdvectionCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ParSLAdvectionCallback} instance that delegates to the specified {@code ParSLAdvectionCallbackI} instance. */
    public static ParSLAdvectionCallback create(ParSLAdvectionCallbackI instance) {
        return instance instanceof ParSLAdvectionCallback
            ? (ParSLAdvectionCallback)instance
            : new Container(instance.address(), instance);
    }

    protected ParSLAdvectionCallback() {
        super(CIF);
    }

    ParSLAdvectionCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ParSLAdvectionCallback {

        private final ParSLAdvectionCallbackI delegate;

        Container(long functionPointer, ParSLAdvectionCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long point, long userdata) {
            delegate.invoke(point, userdata);
        }

    }

}