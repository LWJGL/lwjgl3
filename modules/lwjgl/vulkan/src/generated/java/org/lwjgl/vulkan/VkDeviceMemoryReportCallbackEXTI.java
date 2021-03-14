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
 * Application-defined device memory report callback function.
 * 
 * <h5>C Specification</h5>
 * 
 * <p>The prototype for the {@link VkDeviceDeviceMemoryReportCreateInfoEXT}{@code ::pfnUserCallback} function implemented by the application is:</p>
 * 
 * <pre><code>
 * typedef void (VKAPI_PTR *PFN_vkDeviceMemoryReportCallbackEXT)(
 *     const VkDeviceMemoryReportCallbackDataEXT*  pCallbackData,
 *     void*                                       pUserData);</code></pre>
 * 
 * <h5>Description</h5>
 * 
 * <p>The callback <b>must</b> not make calls to any Vulkan commands.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDeviceDeviceMemoryReportCreateInfoEXT}</p>
 */
@FunctionalInterface
@NativeType("PFN_vkDeviceMemoryReportCallbackEXT")
public interface VkDeviceMemoryReportCallbackEXTI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
    }

    /**
     * Application-defined device memory report callback function.
     *
     * @param pCallbackData contains all the callback related data in the {@link VkDeviceMemoryReportCallbackDataEXT} structure.
     * @param pUserData     the user data provided when the {@link VkDeviceDeviceMemoryReportCreateInfoEXT} was created.
     */
    void invoke(@NativeType("VkDeviceMemoryReportCallbackDataEXT const *") long pCallbackData, @NativeType("void *") long pUserData);

}