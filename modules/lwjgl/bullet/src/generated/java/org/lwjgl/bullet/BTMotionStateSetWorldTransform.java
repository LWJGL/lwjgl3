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
 *     btTransform const *worldTrans
 * )</code></pre>
 */
public abstract class BTMotionStateSetWorldTransform extends Callback implements BTMotionStateSetWorldTransformI {

    /**
     * Creates a {@code BTMotionStateSetWorldTransform} instance from the specified function pointer.
     *
     * @return the new {@code BTMotionStateSetWorldTransform}
     */
    public static BTMotionStateSetWorldTransform create(long functionPointer) {
        BTMotionStateSetWorldTransformI instance = Callback.get(functionPointer);
        return instance instanceof BTMotionStateSetWorldTransform
            ? (BTMotionStateSetWorldTransform)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTMotionStateSetWorldTransform createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTMotionStateSetWorldTransform} instance that delegates to the specified {@code BTMotionStateSetWorldTransformI} instance. */
    public static BTMotionStateSetWorldTransform create(BTMotionStateSetWorldTransformI instance) {
        return instance instanceof BTMotionStateSetWorldTransform
            ? (BTMotionStateSetWorldTransform)instance
            : new Container(instance.address(), instance);
    }

    protected BTMotionStateSetWorldTransform() {
        super(SIGNATURE);
    }

    BTMotionStateSetWorldTransform(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTMotionStateSetWorldTransform {

        private final BTMotionStateSetWorldTransformI delegate;

        Container(long functionPointer, BTMotionStateSetWorldTransformI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long worldTrans) {
            delegate.invoke(worldTrans);
        }

    }

}