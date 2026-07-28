/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke hb_draw_cubic_to_func_t} */
public abstract class hb_draw_cubic_to_func_t extends Callback implements hb_draw_cubic_to_func_tI {

    /**
     * Creates a {@code hb_draw_cubic_to_func_t} instance from the specified function pointer.
     *
     * @return the new {@code hb_draw_cubic_to_func_t}
     */
    public static hb_draw_cubic_to_func_t create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable hb_draw_cubic_to_func_t createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code hb_draw_cubic_to_func_t} instance that delegates to the specified {@code hb_draw_cubic_to_func_tI} instance. */
    public static hb_draw_cubic_to_func_t create(hb_draw_cubic_to_func_tI instance) { return create(instance, instance.address()); }

    private static hb_draw_cubic_to_func_t create(hb_draw_cubic_to_func_tI instance, long functionPointer) {
        return instance instanceof hb_draw_cubic_to_func_t
            ? (hb_draw_cubic_to_func_t)instance
            : new hb_draw_cubic_to_func_t(functionPointer) {
                @Override public void invoke(long dfuncs, long draw_data, long st, float control1_x, float control1_y, float control2_x, float control2_y, float to_x, float to_y, long user_data) {
                    instance.invoke(dfuncs, draw_data, st, control1_x, control1_y, control2_x, control2_y, to_x, to_y, user_data);
                }
            };
    }

    protected hb_draw_cubic_to_func_t() {
        super(DESCRIPTOR);
    }

    hb_draw_cubic_to_func_t(long functionPointer) {
        super(functionPointer);
    }

}