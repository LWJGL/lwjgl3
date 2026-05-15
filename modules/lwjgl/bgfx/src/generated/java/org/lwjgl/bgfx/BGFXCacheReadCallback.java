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
public abstract class BGFXCacheReadCallback extends Callback implements BGFXCacheReadCallbackI {

    /**
     * Creates a {@code BGFXCacheReadCallback} instance from the specified function pointer.
     *
     * @return the new {@code BGFXCacheReadCallback}
     */
    public static BGFXCacheReadCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable BGFXCacheReadCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code BGFXCacheReadCallback} instance that delegates to the specified {@code BGFXCacheReadCallbackI} instance. */
    public static BGFXCacheReadCallback create(BGFXCacheReadCallbackI instance) { return create(instance, instance.address()); }

    private static BGFXCacheReadCallback create(BGFXCacheReadCallbackI instance, long functionPointer) {
        return instance instanceof BGFXCacheReadCallback
            ? (BGFXCacheReadCallback)instance
            : new BGFXCacheReadCallback(functionPointer) {
                @Override public boolean invoke(long _this, long _id, long _data, int _size) {
                    return instance.invoke(_this, _id, _data, _size);
                }
            };
    }

    protected BGFXCacheReadCallback() {
        super(DESCRIPTOR);
    }

    BGFXCacheReadCallback(long functionPointer) {
        super(functionPointer);
    }

}