/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.mimalloc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke mi_output_fun} */
public abstract class mi_output_fun extends Callback implements mi_output_funI {

    /**
     * Creates a {@code mi_output_fun} instance from the specified function pointer.
     *
     * @return the new {@code mi_output_fun}
     */
    public static mi_output_fun create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable mi_output_fun createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code mi_output_fun} instance that delegates to the specified {@code mi_output_funI} instance. */
    public static mi_output_fun create(mi_output_funI instance) { return create(instance, instance.address()); }

    private static mi_output_fun create(mi_output_funI instance, long functionPointer) {
        return instance instanceof mi_output_fun
            ? (mi_output_fun)instance
            : new mi_output_fun(functionPointer) {
                @Override public void invoke(long msg, long arg) {
                    instance.invoke(msg, arg);
                }
            };
    }

    protected mi_output_fun() {
        super(DESCRIPTOR);
    }

    mi_output_fun(long functionPointer) {
        super(functionPointer);
    }

}