/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be set to {@link OpusFileCallbacks}.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * int (*{@link #invoke}) (
 *     void *_stream
 * )</code></pre>
 */
public abstract class OPCloseFunc extends Callback implements OPCloseFuncI {

    /**
     * Creates a {@code OPCloseFunc} instance from the specified function pointer.
     *
     * @return the new {@code OPCloseFunc}
     */
    public static OPCloseFunc create(long functionPointer) {
        OPCloseFuncI instance = Callback.get(functionPointer);
        return instance instanceof OPCloseFunc
            ? (OPCloseFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static OPCloseFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code OPCloseFunc} instance that delegates to the specified {@code OPCloseFuncI} instance. */
    public static OPCloseFunc create(OPCloseFuncI instance) {
        return instance instanceof OPCloseFunc
            ? (OPCloseFunc)instance
            : new Container(instance.address(), instance);
    }

    protected OPCloseFunc() {
        super(CIF);
    }

    OPCloseFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends OPCloseFunc {

        private final OPCloseFuncI delegate;

        Container(long functionPointer, OPCloseFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long _stream) {
            return delegate.invoke(_stream);
        }

    }

}