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
    public static hb_color_line_get_extend_func_t create(long functionPointer) {
        hb_color_line_get_extend_func_tI instance = Callback.get(functionPointer);
        return instance instanceof hb_color_line_get_extend_func_t
            ? (hb_color_line_get_extend_func_t)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable hb_color_line_get_extend_func_t createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code hb_color_line_get_extend_func_t} instance that delegates to the specified {@code hb_color_line_get_extend_func_tI} instance. */
    public static hb_color_line_get_extend_func_t create(hb_color_line_get_extend_func_tI instance) {
        return instance instanceof hb_color_line_get_extend_func_t
            ? (hb_color_line_get_extend_func_t)instance
            : new Container(instance.address(), instance);
    }

    protected hb_color_line_get_extend_func_t() {
        super(CIF);
    }

    hb_color_line_get_extend_func_t(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends hb_color_line_get_extend_func_t {

        private final hb_color_line_get_extend_func_tI delegate;

        Container(long functionPointer, hb_color_line_get_extend_func_tI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long color_line, long color_line_data, long user_data) {
            return delegate.invoke(color_line, color_line_data, user_data);
        }

    }

}