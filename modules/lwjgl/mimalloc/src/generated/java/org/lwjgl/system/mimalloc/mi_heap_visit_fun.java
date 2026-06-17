/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.mimalloc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke mi_heap_visit_fun} */
public abstract class mi_heap_visit_fun extends Callback implements mi_heap_visit_funI {

    /**
     * Creates a {@code mi_heap_visit_fun} instance from the specified function pointer.
     *
     * @return the new {@code mi_heap_visit_fun}
     */
    public static mi_heap_visit_fun create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable mi_heap_visit_fun createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code mi_heap_visit_fun} instance that delegates to the specified {@code mi_heap_visit_funI} instance. */
    public static mi_heap_visit_fun create(mi_heap_visit_funI instance) { return create(instance, instance.address()); }

    private static mi_heap_visit_fun create(mi_heap_visit_funI instance, long functionPointer) {
        return instance instanceof mi_heap_visit_fun
            ? (mi_heap_visit_fun)instance
            : new mi_heap_visit_fun(functionPointer) {
                @Override public boolean invoke(long heap, long arg) {
                    return instance.invoke(heap, arg);
                }
            };
    }

    protected mi_heap_visit_fun() {
        super(DESCRIPTOR);
    }

    mi_heap_visit_fun(long functionPointer) {
        super(functionPointer);
    }

}