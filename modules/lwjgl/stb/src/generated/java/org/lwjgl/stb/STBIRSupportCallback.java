/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke stbir__support_callback *} */
public abstract class STBIRSupportCallback extends Callback implements STBIRSupportCallbackI {

    /**
     * Creates a {@code STBIRSupportCallback} instance from the specified function pointer.
     *
     * @return the new {@code STBIRSupportCallback}
     */
    public static STBIRSupportCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable STBIRSupportCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code STBIRSupportCallback} instance that delegates to the specified {@code STBIRSupportCallbackI} instance. */
    public static STBIRSupportCallback create(STBIRSupportCallbackI instance) { return create(instance, instance.address()); }

    private static STBIRSupportCallback create(STBIRSupportCallbackI instance, long functionPointer) {
        return instance instanceof STBIRSupportCallback
            ? (STBIRSupportCallback)instance
            : new STBIRSupportCallback(functionPointer) {
                @Override public float invoke(float scale, long user_data) {
                    return instance.invoke(scale, user_data);
                }
            };
    }

    protected STBIRSupportCallback() {
        super(DESCRIPTOR);
    }

    STBIRSupportCallback(long functionPointer) {
        super(functionPointer);
    }

}