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
 *     void *_stream,
 *     long long _offset,
 *     int _whence
 * )</code></pre>
 */
public abstract class OPSeekFunc extends Callback implements OPSeekFuncI {

    /**
     * Creates a {@code OPSeekFunc} instance from the specified function pointer.
     *
     * @return the new {@code OPSeekFunc}
     */
    public static OPSeekFunc create(long functionPointer) {
        OPSeekFuncI instance = Callback.get(functionPointer);
        return instance instanceof OPSeekFunc
            ? (OPSeekFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static OPSeekFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code OPSeekFunc} instance that delegates to the specified {@code OPSeekFuncI} instance. */
    public static OPSeekFunc create(OPSeekFuncI instance) {
        return instance instanceof OPSeekFunc
            ? (OPSeekFunc)instance
            : new Container(instance.address(), instance);
    }

    protected OPSeekFunc() {
        super(CIF);
    }

    OPSeekFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends OPSeekFunc {

        private final OPSeekFuncI delegate;

        Container(long functionPointer, OPSeekFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long _stream, long _offset, int _whence) {
            return delegate.invoke(_stream, _offset, _whence);
        }

    }

}