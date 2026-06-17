/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.mimalloc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke mi_error_fun} */
public abstract class mi_error_fun extends Callback implements mi_error_funI {

    /**
     * Creates a {@code mi_error_fun} instance from the specified function pointer.
     *
     * @return the new {@code mi_error_fun}
     */
    public static mi_error_fun create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable mi_error_fun createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code mi_error_fun} instance that delegates to the specified {@code mi_error_funI} instance. */
    public static mi_error_fun create(mi_error_funI instance) { return create(instance, instance.address()); }

    private static mi_error_fun create(mi_error_funI instance, long functionPointer) {
        return instance instanceof mi_error_fun
            ? (mi_error_fun)instance
            : new mi_error_fun(functionPointer) {
                @Override public void invoke(int err, long arg) {
                    instance.invoke(err, arg);
                }
            };
    }

    protected mi_error_fun() {
        super(DESCRIPTOR);
    }

    mi_error_fun(long functionPointer) {
        super(functionPointer);
    }

}