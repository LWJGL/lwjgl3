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
    public static STBIRSupportCallback create(long functionPointer) {
        STBIRSupportCallbackI instance = Callback.get(functionPointer);
        return instance instanceof STBIRSupportCallback
            ? (STBIRSupportCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable STBIRSupportCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code STBIRSupportCallback} instance that delegates to the specified {@code STBIRSupportCallbackI} instance. */
    public static STBIRSupportCallback create(STBIRSupportCallbackI instance) {
        return instance instanceof STBIRSupportCallback
            ? (STBIRSupportCallback)instance
            : new Container(instance.address(), instance);
    }

    protected STBIRSupportCallback() {
        super(CIF);
    }

    STBIRSupportCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends STBIRSupportCallback {

        private final STBIRSupportCallbackI delegate;

        Container(long functionPointer, STBIRSupportCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public float invoke(float scale, long user_data) {
            return delegate.invoke(scale, user_data);
        }

    }

}