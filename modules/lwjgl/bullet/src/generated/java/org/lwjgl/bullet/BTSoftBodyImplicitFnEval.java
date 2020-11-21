/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * btScalar (*) (
 *     btVector3 const *x
 * )</code></pre>
 */
public abstract class BTSoftBodyImplicitFnEval extends Callback implements BTSoftBodyImplicitFnEvalI {

    /**
     * Creates a {@code BTSoftBodyImplicitFnEval} instance from the specified function pointer.
     *
     * @return the new {@code BTSoftBodyImplicitFnEval}
     */
    public static BTSoftBodyImplicitFnEval create(long functionPointer) {
        BTSoftBodyImplicitFnEvalI instance = Callback.get(functionPointer);
        return instance instanceof BTSoftBodyImplicitFnEval
            ? (BTSoftBodyImplicitFnEval)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTSoftBodyImplicitFnEval createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTSoftBodyImplicitFnEval} instance that delegates to the specified {@code BTSoftBodyImplicitFnEvalI} instance. */
    public static BTSoftBodyImplicitFnEval create(BTSoftBodyImplicitFnEvalI instance) {
        return instance instanceof BTSoftBodyImplicitFnEval
            ? (BTSoftBodyImplicitFnEval)instance
            : new Container(instance.address(), instance);
    }

    protected BTSoftBodyImplicitFnEval() {
        super(SIGNATURE);
    }

    BTSoftBodyImplicitFnEval(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTSoftBodyImplicitFnEval {

        private final BTSoftBodyImplicitFnEvalI delegate;

        Container(long functionPointer, BTSoftBodyImplicitFnEvalI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public float invoke(long x) {
            return delegate.invoke(x);
        }

    }

}