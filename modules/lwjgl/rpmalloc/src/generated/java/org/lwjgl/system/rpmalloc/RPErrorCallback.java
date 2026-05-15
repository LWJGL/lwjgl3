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
public abstract class RPErrorCallback extends Callback implements RPErrorCallbackI {

    /**
     * Creates a {@code RPErrorCallback} instance from the specified function pointer.
     *
     * @return the new {@code RPErrorCallback}
     */
    public static RPErrorCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RPErrorCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code RPErrorCallback} instance that delegates to the specified {@code RPErrorCallbackI} instance. */
    public static RPErrorCallback create(RPErrorCallbackI instance) { return create(instance, instance.address()); }

    private static RPErrorCallback create(RPErrorCallbackI instance, long functionPointer) {
        return instance instanceof RPErrorCallback
            ? (RPErrorCallback)instance
            : new RPErrorCallback(functionPointer) {
                @Override public void invoke(long message) {
                    instance.invoke(message);
                }
            };
    }

    protected RPErrorCallback() {
        super(DESCRIPTOR);
    }

    RPErrorCallback(long functionPointer) {
        super(functionPointer);
    }

}