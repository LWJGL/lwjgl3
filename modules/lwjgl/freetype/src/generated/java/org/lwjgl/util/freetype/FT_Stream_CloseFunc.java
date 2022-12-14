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
 *     FT_Stream stream
 * )</code></pre>
 */
public abstract class FT_Stream_CloseFunc extends Callback implements FT_Stream_CloseFuncI {

    /**
     * Creates a {@code FT_Stream_CloseFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Stream_CloseFunc}
     */
    public static FT_Stream_CloseFunc create(long functionPointer) {
        FT_Stream_CloseFuncI instance = Callback.get(functionPointer);
        return instance instanceof FT_Stream_CloseFunc
            ? (FT_Stream_CloseFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FT_Stream_CloseFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_Stream_CloseFunc} instance that delegates to the specified {@code FT_Stream_CloseFuncI} instance. */
    public static FT_Stream_CloseFunc create(FT_Stream_CloseFuncI instance) {
        return instance instanceof FT_Stream_CloseFunc
            ? (FT_Stream_CloseFunc)instance
            : new Container(instance.address(), instance);
    }

    protected FT_Stream_CloseFunc() {
        super(CIF);
    }

    FT_Stream_CloseFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_Stream_CloseFunc {

        private final FT_Stream_CloseFuncI delegate;

        Container(long functionPointer, FT_Stream_CloseFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long stream) {
            delegate.invoke(stream);
        }

    }

}