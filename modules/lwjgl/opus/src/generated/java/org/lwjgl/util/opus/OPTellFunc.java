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
 * long long (*{@link #invoke}) (
 *     void *_stream
 * )</code></pre>
 */
public abstract class OPTellFunc extends Callback implements OPTellFuncI {

    /**
     * Creates a {@code OPTellFunc} instance from the specified function pointer.
     *
     * @return the new {@code OPTellFunc}
     */
    public static OPTellFunc create(long functionPointer) {
        OPTellFuncI instance = Callback.get(functionPointer);
        return instance instanceof OPTellFunc
            ? (OPTellFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static OPTellFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code OPTellFunc} instance that delegates to the specified {@code OPTellFuncI} instance. */
    public static OPTellFunc create(OPTellFuncI instance) {
        return instance instanceof OPTellFunc
            ? (OPTellFunc)instance
            : new Container(instance.address(), instance);
    }

    protected OPTellFunc() {
        super(CIF);
    }

    OPTellFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends OPTellFunc {

        private final OPTellFuncI delegate;

        Container(long functionPointer, OPTellFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long _stream) {
            return delegate.invoke(_stream);
        }

    }

}