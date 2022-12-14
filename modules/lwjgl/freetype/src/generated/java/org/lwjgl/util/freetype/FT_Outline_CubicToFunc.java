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
 *     FT_Vector const *control1,
 *     FT_Vector const *control2,
 *     FT_Vector const *to,
 *     void *user
 * )</code></pre>
 */
public abstract class FT_Outline_CubicToFunc extends Callback implements FT_Outline_CubicToFuncI {

    /**
     * Creates a {@code FT_Outline_CubicToFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Outline_CubicToFunc}
     */
    public static FT_Outline_CubicToFunc create(long functionPointer) {
        FT_Outline_CubicToFuncI instance = Callback.get(functionPointer);
        return instance instanceof FT_Outline_CubicToFunc
            ? (FT_Outline_CubicToFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FT_Outline_CubicToFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_Outline_CubicToFunc} instance that delegates to the specified {@code FT_Outline_CubicToFuncI} instance. */
    public static FT_Outline_CubicToFunc create(FT_Outline_CubicToFuncI instance) {
        return instance instanceof FT_Outline_CubicToFunc
            ? (FT_Outline_CubicToFunc)instance
            : new Container(instance.address(), instance);
    }

    protected FT_Outline_CubicToFunc() {
        super(CIF);
    }

    FT_Outline_CubicToFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_Outline_CubicToFunc {

        private final FT_Outline_CubicToFuncI delegate;

        Container(long functionPointer, FT_Outline_CubicToFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long control1, long control2, long to, long user) {
            return delegate.invoke(control1, control2, to, user);
        }

    }

}