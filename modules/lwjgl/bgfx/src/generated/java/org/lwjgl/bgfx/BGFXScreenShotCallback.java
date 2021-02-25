/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Screenshot captured. Screenshot format is always 4-byte BGRA.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     bgfx_callback_interface_t *_this,
 *     char const *_filePath,
 *     uint32_t _width,
 *     uint32_t _height,
 *     uint32_t _pitch,
 *     void const *_data,
 *     uint32_t _size,
 *     bool _yflip
 * )</code></pre>
 */
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
    @Nullable
    public static BGFXScreenShotCallback createSafe(long functionPointer) {
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