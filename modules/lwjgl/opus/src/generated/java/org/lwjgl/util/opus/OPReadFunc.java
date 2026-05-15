/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke op_read_func} */
public abstract class OPReadFunc extends Callback implements OPReadFuncI {

    /**
     * Creates a {@code OPReadFunc} instance from the specified function pointer.
     *
     * @return the new {@code OPReadFunc}
     */
    public static OPReadFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable OPReadFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code OPReadFunc} instance that delegates to the specified {@code OPReadFuncI} instance. */
    public static OPReadFunc create(OPReadFuncI instance) { return create(instance, instance.address()); }

    private static OPReadFunc create(OPReadFuncI instance, long functionPointer) {
        return instance instanceof OPReadFunc
            ? (OPReadFunc)instance
            : new OPReadFunc(functionPointer) {
                @Override public int invoke(long _stream, long _ptr, int _nbytes) {
                    return instance.invoke(_stream, _ptr, _nbytes);
                }
            };
    }

    protected OPReadFunc() {
        super(DESCRIPTOR);
    }

    OPReadFunc(long functionPointer) {
        super(functionPointer);
    }

}