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
public abstract class RPMapFailCallback extends Callback implements RPMapFailCallbackI {

    /**
     * Creates a {@code RPMapFailCallback} instance from the specified function pointer.
     *
     * @return the new {@code RPMapFailCallback}
     */
    public static RPMapFailCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RPMapFailCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code RPMapFailCallback} instance that delegates to the specified {@code RPMapFailCallbackI} instance. */
    public static RPMapFailCallback create(RPMapFailCallbackI instance) { return create(instance, instance.address()); }

    private static RPMapFailCallback create(RPMapFailCallbackI instance, long functionPointer) {
        return instance instanceof RPMapFailCallback
            ? (RPMapFailCallback)instance
            : new RPMapFailCallback(functionPointer) {
                @Override public int invoke(long size) {
                    return instance.invoke(size);
                }
            };
    }

    protected RPMapFailCallback() {
        super(DESCRIPTOR);
    }

    RPMapFailCallback(long functionPointer) {
        super(functionPointer);
    }

}