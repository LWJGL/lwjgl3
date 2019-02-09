/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static java.lang.Float.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * uint64_t (*) (
 *     YGNodeRef node,
 *     float width,
 *     YGMeasureMode widthMode,
 *     float height,
 *     YGMeasureMode heightMode
 * )</code></pre>
 */
public abstract class YGMeasureFunc extends Callback implements YGMeasureFuncI {

    /**
     * Creates a {@code YGMeasureFunc} instance from the specified function pointer.
     *
     * @return the new {@code YGMeasureFunc}
     */
    public static YGMeasureFunc create(long functionPointer) {
        YGMeasureFuncI instance = Callback.get(functionPointer);
        return instance instanceof YGMeasureFunc
            ? (YGMeasureFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static YGMeasureFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code YGMeasureFunc} instance that delegates to the specified {@code YGMeasureFuncI} instance. */
    public static YGMeasureFunc create(YGMeasureFuncI instance) {
        return instance instanceof YGMeasureFunc
            ? (YGMeasureFunc)instance
            : new Container(instance.address(), instance);
    }

    protected YGMeasureFunc() {
        super(SIGNATURE);
    }

    YGMeasureFunc(long functionPointer) {
        super(functionPointer);
    }

    public static long toLong(YGSize size) {
        return floatToRawIntBits(size.width()) | ((long)floatToRawIntBits(size.height()) << 32);
    }

    private static final class Container extends YGMeasureFunc {

        private final YGMeasureFuncI delegate;

        Container(long functionPointer, YGMeasureFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long node, float width, int widthMode, float height, int heightMode) {
            return delegate.invoke(node, width, widthMode, height, heightMode);
        }

    }

}