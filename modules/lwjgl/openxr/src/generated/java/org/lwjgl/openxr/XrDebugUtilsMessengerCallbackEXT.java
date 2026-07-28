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
    public static XrDebugUtilsMessengerCallbackEXT create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable XrDebugUtilsMessengerCallbackEXT createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code XrDebugUtilsMessengerCallbackEXT} instance that delegates to the specified {@code XrDebugUtilsMessengerCallbackEXTI} instance. */
    public static XrDebugUtilsMessengerCallbackEXT create(XrDebugUtilsMessengerCallbackEXTI instance) { return create(instance, instance.address()); }

    private static XrDebugUtilsMessengerCallbackEXT create(XrDebugUtilsMessengerCallbackEXTI instance, long functionPointer) {
        return instance instanceof XrDebugUtilsMessengerCallbackEXT
            ? (XrDebugUtilsMessengerCallbackEXT)instance
            : new XrDebugUtilsMessengerCallbackEXT(functionPointer) {
                @Override public int invoke(long messageSeverity, long messageTypes, long callbackData, long userData) {
                    return instance.invoke(messageSeverity, messageTypes, callbackData, userData);
                }
            };
    }

    protected XrDebugUtilsMessengerCallbackEXT() {
        super(DESCRIPTOR);
    }

    XrDebugUtilsMessengerCallbackEXT(long functionPointer) {
        super(functionPointer);
    }

}