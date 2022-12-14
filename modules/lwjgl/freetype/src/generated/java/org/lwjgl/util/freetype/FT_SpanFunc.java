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
 *     int y,
 *     int count,
 *     FT_Span const *spans,
 *     void *user
 * )</code></pre>
 */
public abstract class FT_SpanFunc extends Callback implements FT_SpanFuncI {

    /**
     * Creates a {@code FT_SpanFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_SpanFunc}
     */
    public static FT_SpanFunc create(long functionPointer) {
        FT_SpanFuncI instance = Callback.get(functionPointer);
        return instance instanceof FT_SpanFunc
            ? (FT_SpanFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FT_SpanFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_SpanFunc} instance that delegates to the specified {@code FT_SpanFuncI} instance. */
    public static FT_SpanFunc create(FT_SpanFuncI instance) {
        return instance instanceof FT_SpanFunc
            ? (FT_SpanFunc)instance
            : new Container(instance.address(), instance);
    }

    protected FT_SpanFunc() {
        super(CIF);
    }

    FT_SpanFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_SpanFunc {

        private final FT_SpanFuncI delegate;

        Container(long functionPointer, FT_SpanFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int y, int count, long spans, long user) {
            delegate.invoke(y, count, spans, user);
        }

    }

}