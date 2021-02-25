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
public abstract class YGDirtiedFunc extends Callback implements YGDirtiedFuncI {

    /**
     * Creates a {@code YGDirtiedFunc} instance from the specified function pointer.
     *
     * @return the new {@code YGDirtiedFunc}
     */
    public static YGDirtiedFunc create(long functionPointer) {
        YGDirtiedFuncI instance = Callback.get(functionPointer);
        return instance instanceof YGDirtiedFunc
            ? (YGDirtiedFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static YGDirtiedFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code YGDirtiedFunc} instance that delegates to the specified {@code YGDirtiedFuncI} instance. */
    public static YGDirtiedFunc create(YGDirtiedFuncI instance) {
        return instance instanceof YGDirtiedFunc
            ? (YGDirtiedFunc)instance
            : new Container(instance.address(), instance);
    }

    protected YGDirtiedFunc() {
        super(CIF);
    }

    YGDirtiedFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends YGDirtiedFunc {

        private final YGDirtiedFuncI delegate;

        Container(long functionPointer, YGDirtiedFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long node) {
            delegate.invoke(node);
        }

    }

}