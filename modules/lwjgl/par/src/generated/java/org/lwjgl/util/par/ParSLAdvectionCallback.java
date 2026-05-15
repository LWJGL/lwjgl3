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
    public static ParSLAdvectionCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ParSLAdvectionCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ParSLAdvectionCallback} instance that delegates to the specified {@code ParSLAdvectionCallbackI} instance. */
    public static ParSLAdvectionCallback create(ParSLAdvectionCallbackI instance) { return create(instance, instance.address()); }

    private static ParSLAdvectionCallback create(ParSLAdvectionCallbackI instance, long functionPointer) {
        return instance instanceof ParSLAdvectionCallback
            ? (ParSLAdvectionCallback)instance
            : new ParSLAdvectionCallback(functionPointer) {
                @Override public void invoke(long point, long userdata) {
                    instance.invoke(point, userdata);
                }
            };
    }

    protected ParSLAdvectionCallback() {
        super(DESCRIPTOR);
    }

    ParSLAdvectionCallback(long functionPointer) {
        super(functionPointer);
    }

}