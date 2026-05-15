/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke YGDirtiedFunc} */
public abstract class YGDirtiedFunc extends Callback implements YGDirtiedFuncI {

    /**
     * Creates a {@code YGDirtiedFunc} instance from the specified function pointer.
     *
     * @return the new {@code YGDirtiedFunc}
     */
    public static YGDirtiedFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable YGDirtiedFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code YGDirtiedFunc} instance that delegates to the specified {@code YGDirtiedFuncI} instance. */
    public static YGDirtiedFunc create(YGDirtiedFuncI instance) { return create(instance, instance.address()); }

    private static YGDirtiedFunc create(YGDirtiedFuncI instance, long functionPointer) {
        return instance instanceof YGDirtiedFunc
            ? (YGDirtiedFunc)instance
            : new YGDirtiedFunc(functionPointer) {
                @Override public void invoke(long node) {
                    instance.invoke(node);
                }
            };
    }

    protected YGDirtiedFunc() {
        super(DESCRIPTOR);
    }

    YGDirtiedFunc(long functionPointer) {
        super(functionPointer);
    }

}