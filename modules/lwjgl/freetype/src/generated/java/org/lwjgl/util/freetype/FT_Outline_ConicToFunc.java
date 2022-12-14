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
 *     FT_Vector const *control,
 *     FT_Vector const *to,
 *     void *user
 * )</code></pre>
 */
public abstract class FT_Outline_ConicToFunc extends Callback implements FT_Outline_ConicToFuncI {

    /**
     * Creates a {@code FT_Outline_ConicToFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Outline_ConicToFunc}
     */
    public static FT_Outline_ConicToFunc create(long functionPointer) {
        FT_Outline_ConicToFuncI instance = Callback.get(functionPointer);
        return instance instanceof FT_Outline_ConicToFunc
            ? (FT_Outline_ConicToFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FT_Outline_ConicToFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_Outline_ConicToFunc} instance that delegates to the specified {@code FT_Outline_ConicToFuncI} instance. */
    public static FT_Outline_ConicToFunc create(FT_Outline_ConicToFuncI instance) {
        return instance instanceof FT_Outline_ConicToFunc
            ? (FT_Outline_ConicToFunc)instance
            : new Container(instance.address(), instance);
    }

    protected FT_Outline_ConicToFunc() {
        super(CIF);
    }

    FT_Outline_ConicToFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_Outline_ConicToFunc {

        private final FT_Outline_ConicToFuncI delegate;

        Container(long functionPointer, FT_Outline_ConicToFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long control, long to, long user) {
            return delegate.invoke(control, to, user);
        }

    }

}