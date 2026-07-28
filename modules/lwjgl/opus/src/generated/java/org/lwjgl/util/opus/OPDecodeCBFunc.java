/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke op_decode_cb_func} */
public abstract class OPDecodeCBFunc extends Callback implements OPDecodeCBFuncI {

    /**
     * Creates a {@code OPDecodeCBFunc} instance from the specified function pointer.
     *
     * @return the new {@code OPDecodeCBFunc}
     */
    public static OPDecodeCBFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable OPDecodeCBFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code OPDecodeCBFunc} instance that delegates to the specified {@code OPDecodeCBFuncI} instance. */
    public static OPDecodeCBFunc create(OPDecodeCBFuncI instance) { return create(instance, instance.address()); }

    private static OPDecodeCBFunc create(OPDecodeCBFuncI instance, long functionPointer) {
        return instance instanceof OPDecodeCBFunc
            ? (OPDecodeCBFunc)instance
            : new OPDecodeCBFunc(functionPointer) {
                @Override public int invoke(long _ctx, long _decoder, long _pcm, long _op, int _nsamples, int _nchannels, int _format, int _li) {
                    return instance.invoke(_ctx, _decoder, _pcm, _op, _nsamples, _nchannels, _format, _li);
                }
            };
    }

    protected OPDecodeCBFunc() {
        super(DESCRIPTOR);
    }

    OPDecodeCBFunc(long functionPointer) {
        super(functionPointer);
    }

}