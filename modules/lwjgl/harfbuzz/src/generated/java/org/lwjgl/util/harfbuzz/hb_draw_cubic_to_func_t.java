/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     hb_draw_funcs_t *dfuncs,
 *     void *draw_data,
 *     hb_draw_state_t *st,
 *     float control1_x,
 *     float control1_y,
 *     float control2_x,
 *     float control2_y,
 *     float to_x,
 *     float to_y,
 *     void *user_data
 * )</code></pre>
 */
public abstract class hb_draw_cubic_to_func_t extends Callback implements hb_draw_cubic_to_func_tI {

    /**
     * Creates a {@code hb_draw_cubic_to_func_t} instance from the specified function pointer.
     *
     * @return the new {@code hb_draw_cubic_to_func_t}
     */
    public static hb_draw_cubic_to_func_t create(long functionPointer) {
        hb_draw_cubic_to_func_tI instance = Callback.get(functionPointer);
        return instance instanceof hb_draw_cubic_to_func_t
            ? (hb_draw_cubic_to_func_t)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable hb_draw_cubic_to_func_t createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code hb_draw_cubic_to_func_t} instance that delegates to the specified {@code hb_draw_cubic_to_func_tI} instance. */
    public static hb_draw_cubic_to_func_t create(hb_draw_cubic_to_func_tI instance) {
        return instance instanceof hb_draw_cubic_to_func_t
            ? (hb_draw_cubic_to_func_t)instance
            : new Container(instance.address(), instance);
    }

    protected hb_draw_cubic_to_func_t() {
        super(CIF);
    }

    hb_draw_cubic_to_func_t(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends hb_draw_cubic_to_func_t {

        private final hb_draw_cubic_to_func_tI delegate;

        Container(long functionPointer, hb_draw_cubic_to_func_tI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long dfuncs, long draw_data, long st, float control1_x, float control1_y, float control2_x, float control2_y, float to_x, float to_y, long user_data) {
            delegate.invoke(dfuncs, draw_data, st, control1_x, control1_y, control2_x, control2_y, to_x, to_y, user_data);
        }

    }

}