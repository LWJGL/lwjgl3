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
 *     btIDebugDraw *debugDrawer
 * )</code></pre>
 */
public abstract class BTActionInterfaceDebugDraw extends Callback implements BTActionInterfaceDebugDrawI {

    /**
     * Creates a {@code BTActionInterfaceDebugDraw} instance from the specified function pointer.
     *
     * @return the new {@code BTActionInterfaceDebugDraw}
     */
    public static BTActionInterfaceDebugDraw create(long functionPointer) {
        BTActionInterfaceDebugDrawI instance = Callback.get(functionPointer);
        return instance instanceof BTActionInterfaceDebugDraw
            ? (BTActionInterfaceDebugDraw)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTActionInterfaceDebugDraw createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTActionInterfaceDebugDraw} instance that delegates to the specified {@code BTActionInterfaceDebugDrawI} instance. */
    public static BTActionInterfaceDebugDraw create(BTActionInterfaceDebugDrawI instance) {
        return instance instanceof BTActionInterfaceDebugDraw
            ? (BTActionInterfaceDebugDraw)instance
            : new Container(instance.address(), instance);
    }

    protected BTActionInterfaceDebugDraw() {
        super(SIGNATURE);
    }

    BTActionInterfaceDebugDraw(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTActionInterfaceDebugDraw {

        private final BTActionInterfaceDebugDrawI delegate;

        Container(long functionPointer, BTActionInterfaceDebugDrawI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long debugDrawer) {
            delegate.invoke(debugDrawer);
        }

    }

}