/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke op_tell_func} */
public abstract class OPTellFunc extends Callback implements OPTellFuncI {

    /**
     * Creates a {@code OPTellFunc} instance from the specified function pointer.
     *
     * @return the new {@code OPTellFunc}
     */
    public static OPTellFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable OPTellFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code OPTellFunc} instance that delegates to the specified {@code OPTellFuncI} instance. */
    public static OPTellFunc create(OPTellFuncI instance) { return create(instance, instance.address()); }

    private static OPTellFunc create(OPTellFuncI instance, long functionPointer) {
        return instance instanceof OPTellFunc
            ? (OPTellFunc)instance
            : new OPTellFunc(functionPointer) {
                @Override public long invoke(long _stream) {
                    return instance.invoke(_stream);
                }
            };
    }

    protected OPTellFunc() {
        super(DESCRIPTOR);
    }

    OPTellFunc(long functionPointer) {
        super(functionPointer);
    }

}