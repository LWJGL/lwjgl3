/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * hb_bool_t (*{@link #invoke}) (
 *     hb_paint_funcs_t *funcs,
 *     void *paint_data,
 *     hb_blob_t *image,
 *     unsigned int width,
 *     unsigned int height,
 *     hb_tag_t format,
 *     float slant,
 *     hb_glyph_extents_t *extents,
 *     void *user_data
 * )</code></pre>
 */
public abstract class hb_paint_image_func_t extends Callback implements hb_paint_image_func_tI {

    /**
     * Creates a {@code hb_paint_image_func_t} instance from the specified function pointer.
     *
     * @return the new {@code hb_paint_image_func_t}
     */
    public static hb_paint_image_func_t create(long functionPointer) {
        hb_paint_image_func_tI instance = Callback.get(functionPointer);
        return instance instanceof hb_paint_image_func_t
            ? (hb_paint_image_func_t)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static hb_paint_image_func_t createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code hb_paint_image_func_t} instance that delegates to the specified {@code hb_paint_image_func_tI} instance. */
    public static hb_paint_image_func_t create(hb_paint_image_func_tI instance) {
        return instance instanceof hb_paint_image_func_t
            ? (hb_paint_image_func_t)instance
            : new Container(instance.address(), instance);
    }

    protected hb_paint_image_func_t() {
        super(CIF);
    }

    hb_paint_image_func_t(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends hb_paint_image_func_t {

        private final hb_paint_image_func_tI delegate;

        Container(long functionPointer, hb_paint_image_func_tI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long funcs, long paint_data, long image, int width, int height, int format, float slant, long extents, long user_data) {
            return delegate.invoke(funcs, paint_data, image, width, height, format, slant, extents, user_data);
        }

    }

}