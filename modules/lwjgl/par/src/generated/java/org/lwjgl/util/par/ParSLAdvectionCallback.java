/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.par;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@link ParStreamlines#parsl_mesh_from_streamlines mesh_from_streamlines} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     parsl_position *point,
 *     void *userdata
 * )</code></pre>
 */
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
    @Nullable
    public static ParSLAdvectionCallback createSafe(long functionPointer) {
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