/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke PFN_vkDebugUtilsMessengerCallbackEXT} */
public abstract class VkDebugUtilsMessengerCallbackEXT extends Callback implements VkDebugUtilsMessengerCallbackEXTI {

    /**
     * Creates a {@code VkDebugUtilsMessengerCallbackEXT} instance from the specified function pointer.
     *
     * @return the new {@code VkDebugUtilsMessengerCallbackEXT}
     */
    public static VkDebugUtilsMessengerCallbackEXT create(long functionPointer) {
        VkDebugUtilsMessengerCallbackEXTI instance = Callback.get(functionPointer);
        return instance instanceof VkDebugUtilsMessengerCallbackEXT
            ? (VkDebugUtilsMessengerCallbackEXT)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable VkDebugUtilsMessengerCallbackEXT createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code VkDebugUtilsMessengerCallbackEXT} instance that delegates to the specified {@code VkDebugUtilsMessengerCallbackEXTI} instance. */
    public static VkDebugUtilsMessengerCallbackEXT create(VkDebugUtilsMessengerCallbackEXTI instance) {
        return instance instanceof VkDebugUtilsMessengerCallbackEXT
            ? (VkDebugUtilsMessengerCallbackEXT)instance
            : new Container(instance.address(), instance);
    }

    protected VkDebugUtilsMessengerCallbackEXT() {
        super(CIF);
    }

    VkDebugUtilsMessengerCallbackEXT(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends VkDebugUtilsMessengerCallbackEXT {

        private final VkDebugUtilsMessengerCallbackEXTI delegate;

        Container(long functionPointer, VkDebugUtilsMessengerCallbackEXTI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(int messageSeverity, int messageTypes, long pCallbackData, long pUserData) {
            return delegate.invoke(messageSeverity, messageTypes, pCallbackData, pUserData);
        }

    }

}