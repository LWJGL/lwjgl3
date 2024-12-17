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
    public static BGFXScreenShotCallback create(long functionPointer) {
        BGFXScreenShotCallbackI instance = Callback.get(functionPointer);
        return instance instanceof BGFXScreenShotCallback
            ? (BGFXScreenShotCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable BGFXScreenShotCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BGFXScreenShotCallback} instance that delegates to the specified {@code BGFXScreenShotCallbackI} instance. */
    public static BGFXScreenShotCallback create(BGFXScreenShotCallbackI instance) {
        return instance instanceof BGFXScreenShotCallback
            ? (BGFXScreenShotCallback)instance
            : new Container(instance.address(), instance);
    }

    protected BGFXScreenShotCallback() {
        super(CIF);
    }

    BGFXScreenShotCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BGFXScreenShotCallback {

        private final BGFXScreenShotCallbackI delegate;

        Container(long functionPointer, BGFXScreenShotCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long _this, long _filePath, int _width, int _height, int _pitch, long _data, int _size, boolean _yflip) {
            delegate.invoke(_this, _filePath, _width, _height, _pitch, _data, _size, _yflip);
        }

    }

}