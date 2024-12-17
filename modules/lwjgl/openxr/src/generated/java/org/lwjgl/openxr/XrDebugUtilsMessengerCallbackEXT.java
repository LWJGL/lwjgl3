/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke PFN_xrDebugUtilsMessengerCallbackEXT} */
public abstract class XrDebugUtilsMessengerCallbackEXT extends Callback implements XrDebugUtilsMessengerCallbackEXTI {

    /**
     * Creates a {@code XrDebugUtilsMessengerCallbackEXT} instance from the specified function pointer.
     *
     * @return the new {@code XrDebugUtilsMessengerCallbackEXT}
     */
    public static XrDebugUtilsMessengerCallbackEXT create(long functionPointer) {
        XrDebugUtilsMessengerCallbackEXTI instance = Callback.get(functionPointer);
        return instance instanceof XrDebugUtilsMessengerCallbackEXT
            ? (XrDebugUtilsMessengerCallbackEXT)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable XrDebugUtilsMessengerCallbackEXT createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code XrDebugUtilsMessengerCallbackEXT} instance that delegates to the specified {@code XrDebugUtilsMessengerCallbackEXTI} instance. */
    public static XrDebugUtilsMessengerCallbackEXT create(XrDebugUtilsMessengerCallbackEXTI instance) {
        return instance instanceof XrDebugUtilsMessengerCallbackEXT
            ? (XrDebugUtilsMessengerCallbackEXT)instance
            : new Container(instance.address(), instance);
    }

    protected XrDebugUtilsMessengerCallbackEXT() {
        super(CIF);
    }

    XrDebugUtilsMessengerCallbackEXT(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends XrDebugUtilsMessengerCallbackEXT {

        private final XrDebugUtilsMessengerCallbackEXTI delegate;

        Container(long functionPointer, XrDebugUtilsMessengerCallbackEXTI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long messageSeverity, long messageTypes, long callbackData, long userData) {
            return delegate.invoke(messageSeverity, messageTypes, callbackData, userData);
        }

    }

}