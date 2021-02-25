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
 * float (*) (
 *     YGNodeRef node,
 *     float width,
 *     float height
 * )</code></pre>
 */
public abstract class YGBaselineFunc extends Callback implements YGBaselineFuncI {

    /**
     * Creates a {@code YGBaselineFunc} instance from the specified function pointer.
     *
     * @return the new {@code YGBaselineFunc}
     */
    public static YGBaselineFunc create(long functionPointer) {
        YGBaselineFuncI instance = Callback.get(functionPointer);
        return instance instanceof YGBaselineFunc
            ? (YGBaselineFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static YGBaselineFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code YGBaselineFunc} instance that delegates to the specified {@code YGBaselineFuncI} instance. */
    public static YGBaselineFunc create(YGBaselineFuncI instance) {
        return instance instanceof YGBaselineFunc
            ? (YGBaselineFunc)instance
            : new Container(instance.address(), instance);
    }

    protected YGBaselineFunc() {
        super(CIF);
    }

    YGBaselineFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends YGBaselineFunc {

        private final YGBaselineFuncI delegate;

        Container(long functionPointer, YGBaselineFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public float invoke(long node, float width, float height) {
            return delegate.invoke(node, width, height);
        }

    }

}