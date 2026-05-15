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
public abstract class BGFXTraceVarArgsCallback extends Callback implements BGFXTraceVarArgsCallbackI {

    /**
     * Creates a {@code BGFXTraceVarArgsCallback} instance from the specified function pointer.
     *
     * @return the new {@code BGFXTraceVarArgsCallback}
     */
    public static BGFXTraceVarArgsCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable BGFXTraceVarArgsCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code BGFXTraceVarArgsCallback} instance that delegates to the specified {@code BGFXTraceVarArgsCallbackI} instance. */
    public static BGFXTraceVarArgsCallback create(BGFXTraceVarArgsCallbackI instance) { return create(instance, instance.address()); }

    private static BGFXTraceVarArgsCallback create(BGFXTraceVarArgsCallbackI instance, long functionPointer) {
        return instance instanceof BGFXTraceVarArgsCallback
            ? (BGFXTraceVarArgsCallback)instance
            : new BGFXTraceVarArgsCallback(functionPointer) {
                @Override public void invoke(long _this, long _filePath, short _line, long _format, long _argList) {
                    instance.invoke(_this, _filePath, _line, _format, _argList);
                }
            };
    }

    protected BGFXTraceVarArgsCallback() {
        super(DESCRIPTOR);
    }

    BGFXTraceVarArgsCallback(long functionPointer) {
        super(functionPointer);
    }

}