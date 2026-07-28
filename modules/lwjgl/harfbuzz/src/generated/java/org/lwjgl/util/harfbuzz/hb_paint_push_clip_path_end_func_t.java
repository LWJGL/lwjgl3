/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke hb_paint_push_clip_path_end_func_t} */
public abstract class hb_paint_push_clip_path_end_func_t extends Callback implements hb_paint_push_clip_path_end_func_tI {

    /**
     * Creates a {@code hb_paint_push_clip_path_end_func_t} instance from the specified function pointer.
     *
     * @return the new {@code hb_paint_push_clip_path_end_func_t}
     */
    public static hb_paint_push_clip_path_end_func_t create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable hb_paint_push_clip_path_end_func_t createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code hb_paint_push_clip_path_end_func_t} instance that delegates to the specified {@code hb_paint_push_clip_path_end_func_tI} instance. */
    public static hb_paint_push_clip_path_end_func_t create(hb_paint_push_clip_path_end_func_tI instance) { return create(instance, instance.address()); }

    private static hb_paint_push_clip_path_end_func_t create(hb_paint_push_clip_path_end_func_tI instance, long functionPointer) {
        return instance instanceof hb_paint_push_clip_path_end_func_t
            ? (hb_paint_push_clip_path_end_func_t)instance
            : new hb_paint_push_clip_path_end_func_t(functionPointer) {
                @Override public void invoke(long funcs, long paint_data, long user_data) {
                    instance.invoke(funcs, paint_data, user_data);
                }
            };
    }

    protected hb_paint_push_clip_path_end_func_t() {
        super(DESCRIPTOR);
    }

    hb_paint_push_clip_path_end_func_t(long functionPointer) {
        super(functionPointer);
    }

}