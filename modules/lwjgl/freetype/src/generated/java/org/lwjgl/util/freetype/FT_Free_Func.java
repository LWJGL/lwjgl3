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
 *     FT_Memory memory,
 *     void *block
 * )</code></pre>
 */
public abstract class FT_Free_Func extends Callback implements FT_Free_FuncI {

    /**
     * Creates a {@code FT_Free_Func} instance from the specified function pointer.
     *
     * @return the new {@code FT_Free_Func}
     */
    public static FT_Free_Func create(long functionPointer) {
        FT_Free_FuncI instance = Callback.get(functionPointer);
        return instance instanceof FT_Free_Func
            ? (FT_Free_Func)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FT_Free_Func createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_Free_Func} instance that delegates to the specified {@code FT_Free_FuncI} instance. */
    public static FT_Free_Func create(FT_Free_FuncI instance) {
        return instance instanceof FT_Free_Func
            ? (FT_Free_Func)instance
            : new Container(instance.address(), instance);
    }

    protected FT_Free_Func() {
        super(CIF);
    }

    FT_Free_Func(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_Free_Func {

        private final FT_Free_FuncI delegate;

        Container(long functionPointer, FT_Free_FuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long memory, long block) {
            delegate.invoke(memory, block);
        }

    }

}