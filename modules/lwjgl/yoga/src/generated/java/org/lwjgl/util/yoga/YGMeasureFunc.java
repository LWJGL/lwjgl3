/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke YGMeasureFunc} */
public abstract class YGMeasureFunc extends Callback implements YGMeasureFuncI {

    /**
     * Creates a {@code YGMeasureFunc} instance from the specified function pointer.
     *
     * @return the new {@code YGMeasureFunc}
     */
    public static YGMeasureFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable YGMeasureFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code YGMeasureFunc} instance that delegates to the specified {@code YGMeasureFuncI} instance. */
    public static YGMeasureFunc create(YGMeasureFuncI instance) { return create(instance, instance.address()); }

    private static YGMeasureFunc create(YGMeasureFuncI instance, long functionPointer) {
        return instance instanceof YGMeasureFunc
            ? (YGMeasureFunc)instance
            : new YGMeasureFunc(functionPointer) {
                @Override public void invoke(long node, float width, int widthMode, float height, int heightMode, YGSize __result) {
                    instance.invoke(node, width, widthMode, height, heightMode, __result);
                }
            };
    }

    protected YGMeasureFunc() {
        super(DESCRIPTOR);
    }

    YGMeasureFunc(long functionPointer) {
        super(functionPointer);
    }

}