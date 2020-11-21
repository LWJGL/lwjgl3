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
 * void (*) (
 *     btTransform *worldTrans
 * )</code></pre>
 */
public abstract class BTMotionStateGetWorldTransform extends Callback implements BTMotionStateGetWorldTransformI {

    /**
     * Creates a {@code BTMotionStateGetWorldTransform} instance from the specified function pointer.
     *
     * @return the new {@code BTMotionStateGetWorldTransform}
     */
    public static BTMotionStateGetWorldTransform create(long functionPointer) {
        BTMotionStateGetWorldTransformI instance = Callback.get(functionPointer);
        return instance instanceof BTMotionStateGetWorldTransform
            ? (BTMotionStateGetWorldTransform)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTMotionStateGetWorldTransform createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTMotionStateGetWorldTransform} instance that delegates to the specified {@code BTMotionStateGetWorldTransformI} instance. */
    public static BTMotionStateGetWorldTransform create(BTMotionStateGetWorldTransformI instance) {
        return instance instanceof BTMotionStateGetWorldTransform
            ? (BTMotionStateGetWorldTransform)instance
            : new Container(instance.address(), instance);
    }

    protected BTMotionStateGetWorldTransform() {
        super(SIGNATURE);
    }

    BTMotionStateGetWorldTransform(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTMotionStateGetWorldTransform {

        private final BTMotionStateGetWorldTransformI delegate;

        Container(long functionPointer, BTMotionStateGetWorldTransformI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long worldTrans) {
            delegate.invoke(worldTrans);
        }

    }

}