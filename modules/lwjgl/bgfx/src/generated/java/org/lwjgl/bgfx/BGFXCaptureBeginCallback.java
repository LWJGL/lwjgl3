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
public abstract class BGFXCaptureBeginCallback extends Callback implements BGFXCaptureBeginCallbackI {

    /**
     * Creates a {@code BGFXCaptureBeginCallback} instance from the specified function pointer.
     *
     * @return the new {@code BGFXCaptureBeginCallback}
     */
    public static BGFXCaptureBeginCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable BGFXCaptureBeginCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code BGFXCaptureBeginCallback} instance that delegates to the specified {@code BGFXCaptureBeginCallbackI} instance. */
    public static BGFXCaptureBeginCallback create(BGFXCaptureBeginCallbackI instance) { return create(instance, instance.address()); }

    private static BGFXCaptureBeginCallback create(BGFXCaptureBeginCallbackI instance, long functionPointer) {
        return instance instanceof BGFXCaptureBeginCallback
            ? (BGFXCaptureBeginCallback)instance
            : new BGFXCaptureBeginCallback(functionPointer) {
                @Override public void invoke(long _this, int _width, int _height, int _pitch, int _format, boolean _yflip) {
                    instance.invoke(_this, _width, _height, _pitch, _format, _yflip);
                }
            };
    }

    protected BGFXCaptureBeginCallback() {
        super(DESCRIPTOR);
    }

    BGFXCaptureBeginCallback(long functionPointer) {
        super(functionPointer);
    }

}