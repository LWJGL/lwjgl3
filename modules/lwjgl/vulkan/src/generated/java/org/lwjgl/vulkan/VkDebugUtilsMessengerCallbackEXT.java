/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Application-defined debug messenger callback function.
 * 
 * <h5>C Specification</h5>
 * 
 * <p>The prototype for the {@link VkDebugUtilsMessengerCreateInfoEXT}{@code ::pfnUserCallback} function implemented by the application is:</p>
 * 
 * <pre><code>
 * typedef VkBool32 (VKAPI_PTR *PFN_vkDebugUtilsMessengerCallbackEXT)(
 *     VkDebugUtilsMessageSeverityFlagBitsEXT           messageSeverity,
 *     VkDebugUtilsMessageTypeFlagsEXT                  messageTypes,
 *     const VkDebugUtilsMessengerCallbackDataEXT*      pCallbackData,
 *     void*                                            pUserData);</code></pre>
 * 
 * <h5>Description</h5>
 * 
 * <p>The callback <b>must</b> not call {@link EXTDebugUtils#vkDestroyDebugUtilsMessengerEXT DestroyDebugUtilsMessengerEXT}.</p>
 * 
 * <p>The callback returns a {@code VkBool32}, which is interpreted in a layer-specified manner. The application <b>should</b> always return {@link VK10#VK_FALSE FALSE}. The {@link VK10#VK_TRUE TRUE} value is reserved for use in layer development.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDebugUtilsMessengerCreateInfoEXT}</p>
 */
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
    @Nullable
    public static VkDebugUtilsMessengerCallbackEXT createSafe(long functionPointer) {
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