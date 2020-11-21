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
 * bool (*) (
 *     btBroadphaseProxy *proxy
 * )</code></pre>
 */
public abstract class BTBroadphaseAabbCallbackProcess extends Callback implements BTBroadphaseAabbCallbackProcessI {

    /**
     * Creates a {@code BTBroadphaseAabbCallbackProcess} instance from the specified function pointer.
     *
     * @return the new {@code BTBroadphaseAabbCallbackProcess}
     */
    public static BTBroadphaseAabbCallbackProcess create(long functionPointer) {
        BTBroadphaseAabbCallbackProcessI instance = Callback.get(functionPointer);
        return instance instanceof BTBroadphaseAabbCallbackProcess
            ? (BTBroadphaseAabbCallbackProcess)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTBroadphaseAabbCallbackProcess createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTBroadphaseAabbCallbackProcess} instance that delegates to the specified {@code BTBroadphaseAabbCallbackProcessI} instance. */
    public static BTBroadphaseAabbCallbackProcess create(BTBroadphaseAabbCallbackProcessI instance) {
        return instance instanceof BTBroadphaseAabbCallbackProcess
            ? (BTBroadphaseAabbCallbackProcess)instance
            : new Container(instance.address(), instance);
    }

    protected BTBroadphaseAabbCallbackProcess() {
        super(SIGNATURE);
    }

    BTBroadphaseAabbCallbackProcess(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTBroadphaseAabbCallbackProcess {

        private final BTBroadphaseAabbCallbackProcessI delegate;

        Container(long functionPointer, BTBroadphaseAabbCallbackProcessI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long proxy) {
            return delegate.invoke(proxy);
        }

    }

}