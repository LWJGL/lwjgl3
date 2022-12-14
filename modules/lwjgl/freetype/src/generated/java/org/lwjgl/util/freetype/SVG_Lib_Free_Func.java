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
 * void (*{@link #invoke}) (
 *     FT_Pointer *data_pointer
 * )</code></pre>
 */
public abstract class SVG_Lib_Free_Func extends Callback implements SVG_Lib_Free_FuncI {

    /**
     * Creates a {@code SVG_Lib_Free_Func} instance from the specified function pointer.
     *
     * @return the new {@code SVG_Lib_Free_Func}
     */
    public static SVG_Lib_Free_Func create(long functionPointer) {
        SVG_Lib_Free_FuncI instance = Callback.get(functionPointer);
        return instance instanceof SVG_Lib_Free_Func
            ? (SVG_Lib_Free_Func)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static SVG_Lib_Free_Func createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SVG_Lib_Free_Func} instance that delegates to the specified {@code SVG_Lib_Free_FuncI} instance. */
    public static SVG_Lib_Free_Func create(SVG_Lib_Free_FuncI instance) {
        return instance instanceof SVG_Lib_Free_Func
            ? (SVG_Lib_Free_Func)instance
            : new Container(instance.address(), instance);
    }

    protected SVG_Lib_Free_Func() {
        super(CIF);
    }

    SVG_Lib_Free_Func(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SVG_Lib_Free_Func {

        private final SVG_Lib_Free_FuncI delegate;

        Container(long functionPointer, SVG_Lib_Free_FuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long data_pointer) {
            delegate.invoke(data_pointer);
        }

    }

}