/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ope_write_func} */
public abstract class OPEWriteFunc extends Callback implements OPEWriteFuncI {

    /**
     * Creates a {@code OPEWriteFunc} instance from the specified function pointer.
     *
     * @return the new {@code OPEWriteFunc}
     */
    public static OPEWriteFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable OPEWriteFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code OPEWriteFunc} instance that delegates to the specified {@code OPEWriteFuncI} instance. */
    public static OPEWriteFunc create(OPEWriteFuncI instance) { return create(instance, instance.address()); }

    private static OPEWriteFunc create(OPEWriteFuncI instance, long functionPointer) {
        return instance instanceof OPEWriteFunc
            ? (OPEWriteFunc)instance
            : new OPEWriteFunc(functionPointer) {
                @Override public int invoke(long user_data, long ptr, int len) {
                    return instance.invoke(user_data, ptr, len);
                }
            };
    }

    protected OPEWriteFunc() {
        super(DESCRIPTOR);
    }

    OPEWriteFunc(long functionPointer) {
        super(functionPointer);
    }

}