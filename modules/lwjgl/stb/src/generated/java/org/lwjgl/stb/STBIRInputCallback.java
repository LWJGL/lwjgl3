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
    public static STBIRInputCallback create(long functionPointer) {
        STBIRInputCallbackI instance = Callback.get(functionPointer);
        return instance instanceof STBIRInputCallback
            ? (STBIRInputCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable STBIRInputCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code STBIRInputCallback} instance that delegates to the specified {@code STBIRInputCallbackI} instance. */
    public static STBIRInputCallback create(STBIRInputCallbackI instance) {
        return instance instanceof STBIRInputCallback
            ? (STBIRInputCallback)instance
            : new Container(instance.address(), instance);
    }

    protected STBIRInputCallback() {
        super(CIF);
    }

    STBIRInputCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends STBIRInputCallback {

        private final STBIRInputCallbackI delegate;

        Container(long functionPointer, STBIRInputCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long optional_output, long input_ptr, int num_pixels, int x, int y, long context) {
            delegate.invoke(optional_output, input_ptr, num_pixels, x, y, context);
        }

    }

}