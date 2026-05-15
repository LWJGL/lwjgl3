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
public abstract class BGFXScreenShotCallback extends Callback implements BGFXScreenShotCallbackI {

    /**
     * Creates a {@code BGFXScreenShotCallback} instance from the specified function pointer.
     *
     * @return the new {@code BGFXScreenShotCallback}
     */
    public static BGFXScreenShotCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable BGFXScreenShotCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code BGFXScreenShotCallback} instance that delegates to the specified {@code BGFXScreenShotCallbackI} instance. */
    public static BGFXScreenShotCallback create(BGFXScreenShotCallbackI instance) { return create(instance, instance.address()); }

    private static BGFXScreenShotCallback create(BGFXScreenShotCallbackI instance, long functionPointer) {
        return instance instanceof BGFXScreenShotCallback
            ? (BGFXScreenShotCallback)instance
            : new BGFXScreenShotCallback(functionPointer) {
                @Override public void invoke(long _this, long _filePath, int _width, int _height, int _pitch, int _format, long _data, int _size, boolean _yflip) {
                    instance.invoke(_this, _filePath, _width, _height, _pitch, _format, _data, _size, _yflip);
                }
            };
    }

    protected BGFXScreenShotCallback() {
        super(DESCRIPTOR);
    }

    BGFXScreenShotCallback(long functionPointer) {
        super(functionPointer);
    }

}