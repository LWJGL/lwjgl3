/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class BGFXCacheReadSizeCallback extends Callback implements BGFXCacheReadSizeCallbackI {

    /**
     * Creates a {@code BGFXCacheReadSizeCallback} instance from the specified function pointer.
     *
     * @return the new {@code BGFXCacheReadSizeCallback}
     */
    public static BGFXCacheReadSizeCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable BGFXCacheReadSizeCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code BGFXCacheReadSizeCallback} instance that delegates to the specified {@code BGFXCacheReadSizeCallbackI} instance. */
    public static BGFXCacheReadSizeCallback create(BGFXCacheReadSizeCallbackI instance) { return create(instance, instance.address()); }

    private static BGFXCacheReadSizeCallback create(BGFXCacheReadSizeCallbackI instance, long functionPointer) {
        return instance instanceof BGFXCacheReadSizeCallback
            ? (BGFXCacheReadSizeCallback)instance
            : new BGFXCacheReadSizeCallback(functionPointer) {
                @Override public int invoke(long _this, long _id) {
                    return instance.invoke(_this, _id);
                }
            };
    }

    protected BGFXCacheReadSizeCallback() {
        super(DESCRIPTOR);
    }

    BGFXCacheReadSizeCallback(long functionPointer) {
        super(functionPointer);
    }

}