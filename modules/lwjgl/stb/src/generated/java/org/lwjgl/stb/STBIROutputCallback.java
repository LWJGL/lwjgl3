/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke stbir_output_callback *} */
public abstract class STBIROutputCallback extends Callback implements STBIROutputCallbackI {

    /**
     * Creates a {@code STBIROutputCallback} instance from the specified function pointer.
     *
     * @return the new {@code STBIROutputCallback}
     */
    public static STBIROutputCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable STBIROutputCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code STBIROutputCallback} instance that delegates to the specified {@code STBIROutputCallbackI} instance. */
    public static STBIROutputCallback create(STBIROutputCallbackI instance) { return create(instance, instance.address()); }

    private static STBIROutputCallback create(STBIROutputCallbackI instance, long functionPointer) {
        return instance instanceof STBIROutputCallback
            ? (STBIROutputCallback)instance
            : new STBIROutputCallback(functionPointer) {
                @Override public void invoke(long output_ptr, int num_pixels, int x, int y, long context) {
                    instance.invoke(output_ptr, num_pixels, x, y, context);
                }
            };
    }

    protected STBIROutputCallback() {
        super(DESCRIPTOR);
    }

    STBIROutputCallback(long functionPointer) {
        super(functionPointer);
    }

}