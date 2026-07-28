/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke hb_color_line_get_extend_func_t} */
public abstract class hb_color_line_get_extend_func_t extends Callback implements hb_color_line_get_extend_func_tI {

    /**
     * Creates a {@code hb_color_line_get_extend_func_t} instance from the specified function pointer.
     *
     * @return the new {@code hb_color_line_get_extend_func_t}
     */
    public static hb_color_line_get_extend_func_t create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable hb_color_line_get_extend_func_t createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code hb_color_line_get_extend_func_t} instance that delegates to the specified {@code hb_color_line_get_extend_func_tI} instance. */
    public static hb_color_line_get_extend_func_t create(hb_color_line_get_extend_func_tI instance) { return create(instance, instance.address()); }

    private static hb_color_line_get_extend_func_t create(hb_color_line_get_extend_func_tI instance, long functionPointer) {
        return instance instanceof hb_color_line_get_extend_func_t
            ? (hb_color_line_get_extend_func_t)instance
            : new hb_color_line_get_extend_func_t(functionPointer) {
                @Override public int invoke(long color_line, long color_line_data, long user_data) {
                    return instance.invoke(color_line, color_line_data, user_data);
                }
            };
    }

    protected hb_color_line_get_extend_func_t() {
        super(DESCRIPTOR);
    }

    hb_color_line_get_extend_func_t(long functionPointer) {
        super(functionPointer);
    }

}