/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * FT_Error (*{@link #invoke}) (
 *     FT_GlyphSlot slot,
 *     FT_Bool cache,
 *     FT_Pointer *state
 * )</code></pre>
 */
public abstract class SVG_Lib_Preset_Slot_Func extends Callback implements SVG_Lib_Preset_Slot_FuncI {

    /**
     * Creates a {@code SVG_Lib_Preset_Slot_Func} instance from the specified function pointer.
     *
     * @return the new {@code SVG_Lib_Preset_Slot_Func}
     */
    public static SVG_Lib_Preset_Slot_Func create(long functionPointer) {
        SVG_Lib_Preset_Slot_FuncI instance = Callback.get(functionPointer);
        return instance instanceof SVG_Lib_Preset_Slot_Func
            ? (SVG_Lib_Preset_Slot_Func)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static SVG_Lib_Preset_Slot_Func createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SVG_Lib_Preset_Slot_Func} instance that delegates to the specified {@code SVG_Lib_Preset_Slot_FuncI} instance. */
    public static SVG_Lib_Preset_Slot_Func create(SVG_Lib_Preset_Slot_FuncI instance) {
        return instance instanceof SVG_Lib_Preset_Slot_Func
            ? (SVG_Lib_Preset_Slot_Func)instance
            : new Container(instance.address(), instance);
    }

    protected SVG_Lib_Preset_Slot_Func() {
        super(CIF);
    }

    SVG_Lib_Preset_Slot_Func(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SVG_Lib_Preset_Slot_Func {

        private final SVG_Lib_Preset_Slot_FuncI delegate;

        Container(long functionPointer, SVG_Lib_Preset_Slot_FuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long slot, boolean cache, long state) {
            return delegate.invoke(slot, cache, state);
        }

    }

}