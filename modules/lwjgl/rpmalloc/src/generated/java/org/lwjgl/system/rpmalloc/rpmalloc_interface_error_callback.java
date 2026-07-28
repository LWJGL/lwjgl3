/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class rpmalloc_interface_error_callback extends Callback implements rpmalloc_interface_error_callbackI {

    /**
     * Creates a {@code rpmalloc_interface_error_callback} instance from the specified function pointer.
     *
     * @return the new {@code rpmalloc_interface_error_callback}
     */
    public static rpmalloc_interface_error_callback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable rpmalloc_interface_error_callback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code rpmalloc_interface_error_callback} instance that delegates to the specified {@code rpmalloc_interface_error_callbackI} instance. */
    public static rpmalloc_interface_error_callback create(rpmalloc_interface_error_callbackI instance) { return create(instance, instance.address()); }

    private static rpmalloc_interface_error_callback create(rpmalloc_interface_error_callbackI instance, long functionPointer) {
        return instance instanceof rpmalloc_interface_error_callback
            ? (rpmalloc_interface_error_callback)instance
            : new rpmalloc_interface_error_callback(functionPointer) {
                @Override public void invoke(long message) {
                    instance.invoke(message);
                }
            };
    }

    protected rpmalloc_interface_error_callback() {
        super(DESCRIPTOR);
    }

    rpmalloc_interface_error_callback(long functionPointer) {
        super(functionPointer);
    }

}