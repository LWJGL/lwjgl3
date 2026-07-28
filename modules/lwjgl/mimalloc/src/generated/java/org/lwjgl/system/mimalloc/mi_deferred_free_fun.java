/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.mimalloc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke mi_deferred_free_fun} */
public abstract class mi_deferred_free_fun extends Callback implements mi_deferred_free_funI {

    /**
     * Creates a {@code mi_deferred_free_fun} instance from the specified function pointer.
     *
     * @return the new {@code mi_deferred_free_fun}
     */
    public static mi_deferred_free_fun create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable mi_deferred_free_fun createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code mi_deferred_free_fun} instance that delegates to the specified {@code mi_deferred_free_funI} instance. */
    public static mi_deferred_free_fun create(mi_deferred_free_funI instance) { return create(instance, instance.address()); }

    private static mi_deferred_free_fun create(mi_deferred_free_funI instance, long functionPointer) {
        return instance instanceof mi_deferred_free_fun
            ? (mi_deferred_free_fun)instance
            : new mi_deferred_free_fun(functionPointer) {
                @Override public void invoke(boolean force, long heartbeat, long arg) {
                    instance.invoke(force, heartbeat, arg);
                }
            };
    }

    protected mi_deferred_free_fun() {
        super(DESCRIPTOR);
    }

    mi_deferred_free_fun(long functionPointer) {
        super(functionPointer);
    }

}