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
public abstract class BGFXReallocCallback extends Callback implements BGFXReallocCallbackI {

    /**
     * Creates a {@code BGFXReallocCallback} instance from the specified function pointer.
     *
     * @return the new {@code BGFXReallocCallback}
     */
    public static BGFXReallocCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable BGFXReallocCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code BGFXReallocCallback} instance that delegates to the specified {@code BGFXReallocCallbackI} instance. */
    public static BGFXReallocCallback create(BGFXReallocCallbackI instance) { return create(instance, instance.address()); }

    private static BGFXReallocCallback create(BGFXReallocCallbackI instance, long functionPointer) {
        return instance instanceof BGFXReallocCallback
            ? (BGFXReallocCallback)instance
            : new BGFXReallocCallback(functionPointer) {
                @Override public long invoke(long _this, long _ptr, long _size, long _align, long _file, int _line) {
                    return instance.invoke(_this, _ptr, _size, _align, _file, _line);
                }
            };
    }

    protected BGFXReallocCallback() {
        super(DESCRIPTOR);
    }

    BGFXReallocCallback(long functionPointer) {
        super(functionPointer);
    }

}