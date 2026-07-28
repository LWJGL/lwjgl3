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
    public static VkDebugUtilsMessengerCallbackEXT create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable VkDebugUtilsMessengerCallbackEXT createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code VkDebugUtilsMessengerCallbackEXT} instance that delegates to the specified {@code VkDebugUtilsMessengerCallbackEXTI} instance. */
    public static VkDebugUtilsMessengerCallbackEXT create(VkDebugUtilsMessengerCallbackEXTI instance) { return create(instance, instance.address()); }

    private static VkDebugUtilsMessengerCallbackEXT create(VkDebugUtilsMessengerCallbackEXTI instance, long functionPointer) {
        return instance instanceof VkDebugUtilsMessengerCallbackEXT
            ? (VkDebugUtilsMessengerCallbackEXT)instance
            : new VkDebugUtilsMessengerCallbackEXT(functionPointer) {
                @Override public int invoke(int messageSeverity, int messageTypes, long pCallbackData, long pUserData) {
                    return instance.invoke(messageSeverity, messageTypes, pCallbackData, pUserData);
                }
            };
    }

    protected VkDebugUtilsMessengerCallbackEXT() {
        super(DESCRIPTOR);
    }

    VkDebugUtilsMessengerCallbackEXT(long functionPointer) {
        super(functionPointer);
    }

}