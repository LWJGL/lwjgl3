/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@link CU100#cuLaunchHostFunc LaunchHostFunc} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     void *userData
 * )</code></pre>
 */
public abstract class CUhostFn extends Callback implements CUhostFnI {

    /**
     * Creates a {@code CUhostFn} instance from the specified function pointer.
     *
     * @return the new {@code CUhostFn}
     */
    public static CUhostFn create(long functionPointer) {
        CUhostFnI instance = Callback.get(functionPointer);
        return instance instanceof CUhostFn
            ? (CUhostFn)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static CUhostFn createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code CUhostFn} instance that delegates to the specified {@code CUhostFnI} instance. */
    public static CUhostFn create(CUhostFnI instance) {
        return instance instanceof CUhostFn
            ? (CUhostFn)instance
            : new Container(instance.address(), instance);
    }

    protected CUhostFn() {
        super(CIF);
    }

    CUhostFn(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends CUhostFn {

        private final CUhostFnI delegate;

        Container(long functionPointer, CUhostFnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userData) {
            delegate.invoke(userData);
        }

    }

}