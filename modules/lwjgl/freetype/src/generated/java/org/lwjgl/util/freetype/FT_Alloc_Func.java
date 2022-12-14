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
 * void * (*{@link #invoke}) (
 *     FT_Memory memory,
 *     long size
 * )</code></pre>
 */
public abstract class FT_Alloc_Func extends Callback implements FT_Alloc_FuncI {

    /**
     * Creates a {@code FT_Alloc_Func} instance from the specified function pointer.
     *
     * @return the new {@code FT_Alloc_Func}
     */
    public static FT_Alloc_Func create(long functionPointer) {
        FT_Alloc_FuncI instance = Callback.get(functionPointer);
        return instance instanceof FT_Alloc_Func
            ? (FT_Alloc_Func)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FT_Alloc_Func createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_Alloc_Func} instance that delegates to the specified {@code FT_Alloc_FuncI} instance. */
    public static FT_Alloc_Func create(FT_Alloc_FuncI instance) {
        return instance instanceof FT_Alloc_Func
            ? (FT_Alloc_Func)instance
            : new Container(instance.address(), instance);
    }

    protected FT_Alloc_Func() {
        super(CIF);
    }

    FT_Alloc_Func(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_Alloc_Func {

        private final FT_Alloc_FuncI delegate;

        Container(long functionPointer, FT_Alloc_FuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long memory, long size) {
            return delegate.invoke(memory, size);
        }

    }

}