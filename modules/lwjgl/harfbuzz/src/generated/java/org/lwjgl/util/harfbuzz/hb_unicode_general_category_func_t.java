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
 * hb_unicode_general_category_t (*{@link #invoke}) (
 *     hb_unicode_funcs_t *ufuncs,
 *     hb_codepoint_t unicode,
 *     void *user_data
 * )</code></pre>
 */
public abstract class hb_unicode_general_category_func_t extends Callback implements hb_unicode_general_category_func_tI {

    /**
     * Creates a {@code hb_unicode_general_category_func_t} instance from the specified function pointer.
     *
     * @return the new {@code hb_unicode_general_category_func_t}
     */
    public static hb_unicode_general_category_func_t create(long functionPointer) {
        hb_unicode_general_category_func_tI instance = Callback.get(functionPointer);
        return instance instanceof hb_unicode_general_category_func_t
            ? (hb_unicode_general_category_func_t)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable hb_unicode_general_category_func_t createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code hb_unicode_general_category_func_t} instance that delegates to the specified {@code hb_unicode_general_category_func_tI} instance. */
    public static hb_unicode_general_category_func_t create(hb_unicode_general_category_func_tI instance) {
        return instance instanceof hb_unicode_general_category_func_t
            ? (hb_unicode_general_category_func_t)instance
            : new Container(instance.address(), instance);
    }

    protected hb_unicode_general_category_func_t() {
        super(CIF);
    }

    hb_unicode_general_category_func_t(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends hb_unicode_general_category_func_t {

        private final hb_unicode_general_category_func_tI delegate;

        Container(long functionPointer, hb_unicode_general_category_func_tI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long ufuncs, int unicode, long user_data) {
            return delegate.invoke(ufuncs, unicode, user_data);
        }

    }

}