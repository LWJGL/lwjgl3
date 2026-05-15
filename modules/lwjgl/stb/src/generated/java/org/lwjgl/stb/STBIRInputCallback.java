/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke stbir_input_callback *} */
public abstract class STBIRInputCallback extends Callback implements STBIRInputCallbackI {

    /**
     * Creates a {@code STBIRInputCallback} instance from the specified function pointer.
     *
     * @return the new {@code STBIRInputCallback}
     */
    public static STBIRInputCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable STBIRInputCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code STBIRInputCallback} instance that delegates to the specified {@code STBIRInputCallbackI} instance. */
    public static STBIRInputCallback create(STBIRInputCallbackI instance) { return create(instance, instance.address()); }

    private static STBIRInputCallback create(STBIRInputCallbackI instance, long functionPointer) {
        return instance instanceof STBIRInputCallback
            ? (STBIRInputCallback)instance
            : new STBIRInputCallback(functionPointer) {
                @Override public void invoke(long optional_output, long input_ptr, int num_pixels, int x, int y, long context) {
                    instance.invoke(optional_output, input_ptr, num_pixels, x, y, context);
                }
            };
    }

    protected STBIRInputCallback() {
        super(DESCRIPTOR);
    }

    STBIRInputCallback(long functionPointer) {
        super(functionPointer);
    }

}