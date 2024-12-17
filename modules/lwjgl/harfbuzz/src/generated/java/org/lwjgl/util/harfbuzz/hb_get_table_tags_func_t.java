/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke hb_get_table_tags_func_t} */
public abstract class hb_get_table_tags_func_t extends Callback implements hb_get_table_tags_func_tI {

    /**
     * Creates a {@code hb_get_table_tags_func_t} instance from the specified function pointer.
     *
     * @return the new {@code hb_get_table_tags_func_t}
     */
    public static hb_get_table_tags_func_t create(long functionPointer) {
        hb_get_table_tags_func_tI instance = Callback.get(functionPointer);
        return instance instanceof hb_get_table_tags_func_t
            ? (hb_get_table_tags_func_t)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable hb_get_table_tags_func_t createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code hb_get_table_tags_func_t} instance that delegates to the specified {@code hb_get_table_tags_func_tI} instance. */
    public static hb_get_table_tags_func_t create(hb_get_table_tags_func_tI instance) {
        return instance instanceof hb_get_table_tags_func_t
            ? (hb_get_table_tags_func_t)instance
            : new Container(instance.address(), instance);
    }

    protected hb_get_table_tags_func_t() {
        super(CIF);
    }

    hb_get_table_tags_func_t(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends hb_get_table_tags_func_t {

        private final hb_get_table_tags_func_tI delegate;

        Container(long functionPointer, hb_get_table_tags_func_tI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long face, int start_offset, long table_count, long table_tags, long user_data) {
            return delegate.invoke(face, start_offset, table_count, table_tags, user_data);
        }

    }

}