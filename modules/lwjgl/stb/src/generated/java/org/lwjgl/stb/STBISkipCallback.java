/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class STBISkipCallback extends Callback implements STBISkipCallbackI {

    /**
     * Creates a {@code STBISkipCallback} instance from the specified function pointer.
     *
     * @return the new {@code STBISkipCallback}
     */
    public static STBISkipCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable STBISkipCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code STBISkipCallback} instance that delegates to the specified {@code STBISkipCallbackI} instance. */
    public static STBISkipCallback create(STBISkipCallbackI instance) { return create(instance, instance.address()); }

    private static STBISkipCallback create(STBISkipCallbackI instance, long functionPointer) {
        return instance instanceof STBISkipCallback
            ? (STBISkipCallback)instance
            : new STBISkipCallback(functionPointer) {
                @Override public void invoke(long user, int n) {
                    instance.invoke(user, n);
                }
            };
    }

    protected STBISkipCallback() {
        super(DESCRIPTOR);
    }

    STBISkipCallback(long functionPointer) {
        super(functionPointer);
    }

}