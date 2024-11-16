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
 * hb_blob_t * (*{@link #invoke}) (
 *     hb_face_t *face,
 *     hb_tag_t tag,
 *     void *user_data
 * )</code></pre>
 */
public abstract class hb_reference_table_func_t extends Callback implements hb_reference_table_func_tI {

    /**
     * Creates a {@code hb_reference_table_func_t} instance from the specified function pointer.
     *
     * @return the new {@code hb_reference_table_func_t}
     */
    public static hb_reference_table_func_t create(long functionPointer) {
        hb_reference_table_func_tI instance = Callback.get(functionPointer);
        return instance instanceof hb_reference_table_func_t
            ? (hb_reference_table_func_t)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable hb_reference_table_func_t createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code hb_reference_table_func_t} instance that delegates to the specified {@code hb_reference_table_func_tI} instance. */
    public static hb_reference_table_func_t create(hb_reference_table_func_tI instance) {
        return instance instanceof hb_reference_table_func_t
            ? (hb_reference_table_func_t)instance
            : new Container(instance.address(), instance);
    }

    protected hb_reference_table_func_t() {
        super(CIF);
    }

    hb_reference_table_func_t(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends hb_reference_table_func_t {

        private final hb_reference_table_func_tI delegate;

        Container(long functionPointer, hb_reference_table_func_tI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long face, int tag, long user_data) {
            return delegate.invoke(face, tag, user_data);
        }

    }

}