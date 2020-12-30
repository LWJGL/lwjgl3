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
 *     btCollisionWorld *collisionWorld,
 *     btScalar deltaTimeStep
 * )</code></pre>
 */
public abstract class BTActionInterfaceUpdateAction extends Callback implements BTActionInterfaceUpdateActionI {

    /**
     * Creates a {@code BTActionInterfaceUpdateAction} instance from the specified function pointer.
     *
     * @return the new {@code BTActionInterfaceUpdateAction}
     */
    public static BTActionInterfaceUpdateAction create(long functionPointer) {
        BTActionInterfaceUpdateActionI instance = Callback.get(functionPointer);
        return instance instanceof BTActionInterfaceUpdateAction
            ? (BTActionInterfaceUpdateAction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTActionInterfaceUpdateAction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTActionInterfaceUpdateAction} instance that delegates to the specified {@code BTActionInterfaceUpdateActionI} instance. */
    public static BTActionInterfaceUpdateAction create(BTActionInterfaceUpdateActionI instance) {
        return instance instanceof BTActionInterfaceUpdateAction
            ? (BTActionInterfaceUpdateAction)instance
            : new Container(instance.address(), instance);
    }

    protected BTActionInterfaceUpdateAction() {
        super(SIGNATURE);
    }

    BTActionInterfaceUpdateAction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTActionInterfaceUpdateAction {

        private final BTActionInterfaceUpdateActionI delegate;

        Container(long functionPointer, BTActionInterfaceUpdateActionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long collisionWorld, float deltaTimeStep) {
            delegate.invoke(collisionWorld, deltaTimeStep);
        }

    }

}