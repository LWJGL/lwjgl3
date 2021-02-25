/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

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
@FunctionalInterface
@NativeType("PFN_vkDebugUtilsMessengerCallbackEXT")
public interface VkDebugUtilsMessengerCallbackEXTI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_uint32,
        ffi_type_uint32, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetInt(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /**
     * Application-defined debug messenger callback function.
     *
     * @param messageSeverity specifies the {@code VkDebugUtilsMessageSeverityFlagBitsEXT} that triggered this callback.
     * @param messageTypes    a bitmask of {@code VkDebugUtilsMessageTypeFlagBitsEXT} specifying which type of event(s) triggered this callback.
     * @param pCallbackData   contains all the callback related data in the {@link VkDebugUtilsMessengerCallbackDataEXT} structure.
     * @param pUserData       the user data provided when the {@code VkDebugUtilsMessengerEXT} was created.
     */
    @NativeType("VkBool32") int invoke(@NativeType("VkDebugUtilsMessageSeverityFlagBitsEXT") int messageSeverity, @NativeType("VkDebugUtilsMessageTypeFlagsEXT") int messageTypes, @NativeType("VkDebugUtilsMessengerCallbackDataEXT const *") long pCallbackData, @NativeType("void *") long pUserData);

}