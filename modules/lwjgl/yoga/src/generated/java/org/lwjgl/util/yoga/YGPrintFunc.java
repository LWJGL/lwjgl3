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
public abstract class YGPrintFunc extends Callback implements YGPrintFuncI {

    /**
     * Creates a {@code YGPrintFunc} instance from the specified function pointer.
     *
     * @return the new {@code YGPrintFunc}
     */
    public static YGPrintFunc create(long functionPointer) {
        YGPrintFuncI instance = Callback.get(functionPointer);
        return instance instanceof YGPrintFunc
            ? (YGPrintFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static YGPrintFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code YGPrintFunc} instance that delegates to the specified {@code YGPrintFuncI} instance. */
    public static YGPrintFunc create(YGPrintFuncI instance) {
        return instance instanceof YGPrintFunc
            ? (YGPrintFunc)instance
            : new Container(instance.address(), instance);
    }

    protected YGPrintFunc() {
        super(CIF);
    }

    YGPrintFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends YGPrintFunc {

        private final YGPrintFuncI delegate;

        Container(long functionPointer, YGPrintFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long node) {
            delegate.invoke(node);
        }

    }

}