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
 *     void *arg
 * )</code></pre>
 */
public abstract class FT_DebugHook_Func extends Callback implements FT_DebugHook_FuncI {

    /**
     * Creates a {@code FT_DebugHook_Func} instance from the specified function pointer.
     *
     * @return the new {@code FT_DebugHook_Func}
     */
    public static FT_DebugHook_Func create(long functionPointer) {
        FT_DebugHook_FuncI instance = Callback.get(functionPointer);
        return instance instanceof FT_DebugHook_Func
            ? (FT_DebugHook_Func)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FT_DebugHook_Func createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_DebugHook_Func} instance that delegates to the specified {@code FT_DebugHook_FuncI} instance. */
    public static FT_DebugHook_Func create(FT_DebugHook_FuncI instance) {
        return instance instanceof FT_DebugHook_Func
            ? (FT_DebugHook_Func)instance
            : new Container(instance.address(), instance);
    }

    protected FT_DebugHook_Func() {
        super(CIF);
    }

    FT_DebugHook_Func(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_DebugHook_Func {

        private final FT_DebugHook_FuncI delegate;

        Container(long functionPointer, FT_DebugHook_FuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long arg) {
            return delegate.invoke(arg);
        }

    }

}