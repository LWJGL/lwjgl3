/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     YGNodeRef node
 * )</code></pre>
 */
public abstract class YGNodeCleanupFunc extends Callback implements YGNodeCleanupFuncI {

    /**
     * Creates a {@code YGNodeCleanupFunc} instance from the specified function pointer.
     *
     * @return the new {@code YGNodeCleanupFunc}
     */
    public static YGNodeCleanupFunc create(long functionPointer) {
        YGNodeCleanupFuncI instance = Callback.get(functionPointer);
        return instance instanceof YGNodeCleanupFunc
            ? (YGNodeCleanupFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static YGNodeCleanupFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code YGNodeCleanupFunc} instance that delegates to the specified {@code YGNodeCleanupFuncI} instance. */
    public static YGNodeCleanupFunc create(YGNodeCleanupFuncI instance) {
        return instance instanceof YGNodeCleanupFunc
            ? (YGNodeCleanupFunc)instance
            : new Container(instance.address(), instance);
    }

    protected YGNodeCleanupFunc() {
        super(CIF);
    }

    YGNodeCleanupFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends YGNodeCleanupFunc {

        private final YGNodeCleanupFuncI delegate;

        Container(long functionPointer, YGNodeCleanupFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long node) {
            delegate.invoke(node);
        }

    }

}