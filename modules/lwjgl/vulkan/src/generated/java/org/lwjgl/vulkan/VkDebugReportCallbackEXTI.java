/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Application-defined debug report callback function.
 * 
 * <h5>C Specification</h5>
 * 
 * <p>The prototype for the {@link VkDebugReportCallbackCreateInfoEXT}{@code ::pfnCallback} function implemented by the application is:</p>
 * 
 * <pre><code>
 * typedef VkBool32 (VKAPI_PTR *PFN_vkDebugReportCallbackEXT)(
 *     VkDebugReportFlagsEXT                       flags,
 *     VkDebugReportObjectTypeEXT                  objectType,
 *     uint64_t                                    object,
 *     size_t                                      location,
 *     int32_t                                     messageCode,
 *     const char*                                 pLayerPrefix,
 *     const char*                                 pMessage,
 *     void*                                       pUserData);</code></pre>
 * 
 * <h5>Description</h5>
 * 
 * <p>The callback <b>must</b> not call {@code vkDestroyDebugReportCallbackEXT}.</p>
 * 
 * <p>The callback returns a {@code VkBool32}, which is interpreted in a layer-specified manner. The application <b>should</b> always return {@link VK10#VK_FALSE FALSE}. The {@link VK10#VK_TRUE TRUE} value is reserved for use in layer development.</p>
 * 
 * <p>{@code object} <b>must</b> be a Vulkan object or {@link VK10#VK_NULL_HANDLE NULL_HANDLE}. If {@code objectType} is not {@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT} and {@code object} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code object} <b>must</b> be a Vulkan object of the corresponding type associated with {@code objectType} as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#debug-report-object-types">{@code VkDebugReportObjectTypeEXT} and Vulkan Handle Relationship</a>.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDebugReportCallbackCreateInfoEXT}</p>
 */
@FunctionalInterface
@NativeType("PFN_vkDebugReportCallbackEXT")
public interface VkDebugReportCallbackEXTI extends CallbackI.I {

    String SIGNATURE = Callback.__stdcall("(iilpippp)i");

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default int callback(long args) {
        return invoke(
            dcbArgInt(args),
            dcbArgInt(args),
            dcbArgLongLong(args),
            dcbArgPointer(args),
            dcbArgInt(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    /**
     * Application-defined debug report callback function.
     *
     * @param flags        specifies the {@code VkDebugReportFlagBitsEXT} that triggered this callback.
     * @param objectType   a {@code VkDebugReportObjectTypeEXT} value specifying the type of object being used or created at the time the event was triggered.
     * @param object       the object where the issue was detected. If {@code objectType} is {@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT}, {@code object} is undefined.
     * @param location     a component (layer, driver, loader) defined value specifying the <em>location</em> of the trigger. This is an optional: value.
     * @param messageCode  a layer-defined value indicating what test triggered this callback.
     * @param pLayerPrefix a null-terminated string that is an abbreviation of the name of the component making the callback. {@code pLayerPrefix} is only valid for the duration of the callback.
     * @param pMessage     a null-terminated string detailing the trigger conditions. {@code pMessage} is only valid for the duration of the callback.
     * @param pUserData    the user data given when the {@code VkDebugReportCallbackEXT} was created.
     */
    @NativeType("VkBool32") int invoke(@NativeType("VkDebugReportFlagsEXT") int flags, @NativeType("VkDebugReportObjectTypeEXT") int objectType, @NativeType("uint64_t") long object, @NativeType("size_t") long location, @NativeType("int32_t") int messageCode, @NativeType("char const *") long pLayerPrefix, @NativeType("char const *") long pMessage, @NativeType("void *") long pUserData);

}