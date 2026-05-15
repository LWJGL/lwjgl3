/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke YGBaselineFunc} */
public abstract class YGBaselineFunc extends Callback implements YGBaselineFuncI {

    /**
     * Creates a {@code YGBaselineFunc} instance from the specified function pointer.
     *
     * @return the new {@code YGBaselineFunc}
     */
    public static YGBaselineFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable YGBaselineFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code YGBaselineFunc} instance that delegates to the specified {@code YGBaselineFuncI} instance. */
    public static YGBaselineFunc create(YGBaselineFuncI instance) { return create(instance, instance.address()); }

    private static YGBaselineFunc create(YGBaselineFuncI instance, long functionPointer) {
        return instance instanceof YGBaselineFunc
            ? (YGBaselineFunc)instance
            : new YGBaselineFunc(functionPointer) {
                @Override public float invoke(long node, float width, float height) {
                    return instance.invoke(node, width, height);
                }
            };
    }

    protected YGBaselineFunc() {
        super(DESCRIPTOR);
    }

    YGBaselineFunc(long functionPointer) {
        super(functionPointer);
    }

}