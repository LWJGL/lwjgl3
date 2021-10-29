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
 * Instances of this class may be set to the {@link OpusEncCallbacks}.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * int (*{@link #invoke}) (
 *     void *user_data
 * )</code></pre>
 */
public abstract class OPECloseFunc extends Callback implements OPECloseFuncI {

    /**
     * Creates a {@code OPECloseFunc} instance from the specified function pointer.
     *
     * @return the new {@code OPECloseFunc}
     */
    public static OPECloseFunc create(long functionPointer) {
        OPECloseFuncI instance = Callback.get(functionPointer);
        return instance instanceof OPECloseFunc
            ? (OPECloseFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static OPECloseFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code OPECloseFunc} instance that delegates to the specified {@code OPECloseFuncI} instance. */
    public static OPECloseFunc create(OPECloseFuncI instance) {
        return instance instanceof OPECloseFunc
            ? (OPECloseFunc)instance
            : new Container(instance.address(), instance);
    }

    protected OPECloseFunc() {
        super(CIF);
    }

    OPECloseFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends OPECloseFunc {

        private final OPECloseFuncI delegate;

        Container(long functionPointer, OPECloseFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long user_data) {
            return delegate.invoke(user_data);
        }

    }

}