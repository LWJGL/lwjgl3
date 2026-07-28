/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke hb_destroy_func_t} */
public abstract class hb_destroy_func_t extends Callback implements hb_destroy_func_tI {

    /**
     * Creates a {@code hb_destroy_func_t} instance from the specified function pointer.
     *
     * @return the new {@code hb_destroy_func_t}
     */
    public static hb_destroy_func_t create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable hb_destroy_func_t createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code hb_destroy_func_t} instance that delegates to the specified {@code hb_destroy_func_tI} instance. */
    public static hb_destroy_func_t create(hb_destroy_func_tI instance) { return create(instance, instance.address()); }

    private static hb_destroy_func_t create(hb_destroy_func_tI instance, long functionPointer) {
        return instance instanceof hb_destroy_func_t
            ? (hb_destroy_func_t)instance
            : new hb_destroy_func_t(functionPointer) {
                @Override public void invoke(long user_data) {
                    instance.invoke(user_data);
                }
            };
    }

    protected hb_destroy_func_t() {
        super(DESCRIPTOR);
    }

    hb_destroy_func_t(long functionPointer) {
        super(functionPointer);
    }

}