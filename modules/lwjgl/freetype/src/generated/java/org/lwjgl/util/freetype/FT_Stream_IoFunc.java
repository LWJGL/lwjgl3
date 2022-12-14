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
 * unsigned long (*{@link #invoke}) (
 *     FT_Stream stream,
 *     unsigned long offset,
 *     unsigned char *buffer,
 *     unsigned long count
 * )</code></pre>
 */
public abstract class FT_Stream_IoFunc extends Callback implements FT_Stream_IoFuncI {

    /**
     * Creates a {@code FT_Stream_IoFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Stream_IoFunc}
     */
    public static FT_Stream_IoFunc create(long functionPointer) {
        FT_Stream_IoFuncI instance = Callback.get(functionPointer);
        return instance instanceof FT_Stream_IoFunc
            ? (FT_Stream_IoFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FT_Stream_IoFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_Stream_IoFunc} instance that delegates to the specified {@code FT_Stream_IoFuncI} instance. */
    public static FT_Stream_IoFunc create(FT_Stream_IoFuncI instance) {
        return instance instanceof FT_Stream_IoFunc
            ? (FT_Stream_IoFunc)instance
            : new Container(instance.address(), instance);
    }

    protected FT_Stream_IoFunc() {
        super(CIF);
    }

    FT_Stream_IoFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_Stream_IoFunc {

        private final FT_Stream_IoFuncI delegate;

        Container(long functionPointer, FT_Stream_IoFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long stream, long offset, long buffer, long count) {
            return delegate.invoke(stream, offset, buffer, count);
        }

    }

}