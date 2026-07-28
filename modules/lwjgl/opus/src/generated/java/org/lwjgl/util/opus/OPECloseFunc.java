/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ope_close_func} */
public abstract class OPECloseFunc extends Callback implements OPECloseFuncI {

    /**
     * Creates a {@code OPECloseFunc} instance from the specified function pointer.
     *
     * @return the new {@code OPECloseFunc}
     */
    public static OPECloseFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable OPECloseFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code OPECloseFunc} instance that delegates to the specified {@code OPECloseFuncI} instance. */
    public static OPECloseFunc create(OPECloseFuncI instance) { return create(instance, instance.address()); }

    private static OPECloseFunc create(OPECloseFuncI instance, long functionPointer) {
        return instance instanceof OPECloseFunc
            ? (OPECloseFunc)instance
            : new OPECloseFunc(functionPointer) {
                @Override public int invoke(long user_data) {
                    return instance.invoke(user_data);
                }
            };
    }

    protected OPECloseFunc() {
        super(DESCRIPTOR);
    }

    OPECloseFunc(long functionPointer) {
        super(functionPointer);
    }

}