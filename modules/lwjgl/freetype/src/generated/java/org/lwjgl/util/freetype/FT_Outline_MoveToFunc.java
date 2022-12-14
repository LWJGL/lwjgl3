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
 * int (*{@link #invoke}) (
 *     FT_Vector const *to,
 *     void *user
 * )</code></pre>
 */
public abstract class FT_Outline_MoveToFunc extends Callback implements FT_Outline_MoveToFuncI {

    /**
     * Creates a {@code FT_Outline_MoveToFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Outline_MoveToFunc}
     */
    public static FT_Outline_MoveToFunc create(long functionPointer) {
        FT_Outline_MoveToFuncI instance = Callback.get(functionPointer);
        return instance instanceof FT_Outline_MoveToFunc
            ? (FT_Outline_MoveToFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FT_Outline_MoveToFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_Outline_MoveToFunc} instance that delegates to the specified {@code FT_Outline_MoveToFuncI} instance. */
    public static FT_Outline_MoveToFunc create(FT_Outline_MoveToFuncI instance) {
        return instance instanceof FT_Outline_MoveToFunc
            ? (FT_Outline_MoveToFunc)instance
            : new Container(instance.address(), instance);
    }

    protected FT_Outline_MoveToFunc() {
        super(CIF);
    }

    FT_Outline_MoveToFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_Outline_MoveToFunc {

        private final FT_Outline_MoveToFuncI delegate;

        Container(long functionPointer, FT_Outline_MoveToFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long to, long user) {
            return delegate.invoke(to, user);
        }

    }

}