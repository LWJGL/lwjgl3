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
public abstract class BGFXFatalCallback extends Callback implements BGFXFatalCallbackI {

    /**
     * Creates a {@code BGFXFatalCallback} instance from the specified function pointer.
     *
     * @return the new {@code BGFXFatalCallback}
     */
    public static BGFXFatalCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable BGFXFatalCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code BGFXFatalCallback} instance that delegates to the specified {@code BGFXFatalCallbackI} instance. */
    public static BGFXFatalCallback create(BGFXFatalCallbackI instance) { return create(instance, instance.address()); }

    private static BGFXFatalCallback create(BGFXFatalCallbackI instance, long functionPointer) {
        return instance instanceof BGFXFatalCallback
            ? (BGFXFatalCallback)instance
            : new BGFXFatalCallback(functionPointer) {
                @Override public void invoke(long _this, long _filePath, short _line, int _code, long _str) {
                    instance.invoke(_this, _filePath, _line, _code, _str);
                }
            };
    }

    protected BGFXFatalCallback() {
        super(DESCRIPTOR);
    }

    BGFXFatalCallback(long functionPointer) {
        super(functionPointer);
    }

}