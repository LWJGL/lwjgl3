/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class CGEventTapCallBack extends Callback implements CGEventTapCallBackI {

    /**
     * Creates a {@code CGEventTapCallBack} instance from the specified function pointer.
     *
     * @return the new {@code CGEventTapCallBack}
     */
    public static CGEventTapCallBack create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CGEventTapCallBack createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code CGEventTapCallBack} instance that delegates to the specified {@code CGEventTapCallBackI} instance. */
    public static CGEventTapCallBack create(CGEventTapCallBackI instance) { return create(instance, instance.address()); }

    private static CGEventTapCallBack create(CGEventTapCallBackI instance, long functionPointer) {
        return instance instanceof CGEventTapCallBack
            ? (CGEventTapCallBack)instance
            : new CGEventTapCallBack(functionPointer) {
                @Override public long invoke(long proxy, int type, long event, long userInfo) {
                    return instance.invoke(proxy, type, event, userInfo);
                }
            };
    }

    protected CGEventTapCallBack() {
        super(DESCRIPTOR);
    }

    CGEventTapCallBack(long functionPointer) {
        super(functionPointer);
    }

}