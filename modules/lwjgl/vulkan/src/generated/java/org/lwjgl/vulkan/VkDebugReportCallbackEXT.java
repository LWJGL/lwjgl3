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
 * <p>{@code object} <b>must</b> be a Vulkan object or {@link VK10#VK_NULL_HANDLE NULL_HANDLE}. If {@code objectType} is not {@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT} and {@code object} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code object} <b>must</b> be a Vulkan object of the corresponding type associated with {@code objectType} as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#debug-report-object-types">{@code VkDebugReportObjectTypeEXT} and Vulkan Handle Relationship</a>.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDebugReportCallbackCreateInfoEXT}</p>
 */
public abstract class VkDebugReportCallbackEXT extends Callback implements VkDebugReportCallbackEXTI {

    /**
     * Creates a {@code VkDebugReportCallbackEXT} instance from the specified function pointer.
     *
     * @return the new {@code VkDebugReportCallbackEXT}
     */
    public static VkDebugReportCallbackEXT create(long functionPointer) {
        VkDebugReportCallbackEXTI instance = Callback.get(functionPointer);
        return instance instanceof VkDebugReportCallbackEXT
            ? (VkDebugReportCallbackEXT)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static VkDebugReportCallbackEXT createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code VkDebugReportCallbackEXT} instance that delegates to the specified {@code VkDebugReportCallbackEXTI} instance. */
    public static VkDebugReportCallbackEXT create(VkDebugReportCallbackEXTI instance) {
        return instance instanceof VkDebugReportCallbackEXT
            ? (VkDebugReportCallbackEXT)instance
            : new Container(instance.address(), instance);
    }

    protected VkDebugReportCallbackEXT() {
        super(CIF);
    }

    VkDebugReportCallbackEXT(long functionPointer) {
        super(functionPointer);
    }

    /**
     * Converts the specified {@link VkDebugReportCallbackEXT} argument to a String.
     *
     * <p>This method may only be used inside a {@code VkDebugReportCallbackEXT} invocation.</p>
     *
     * @param string the argument to decode
     *
     * @return the message as a String
     */
    public static String getString(long string) {
        return memUTF8(string);
    }

    private static final class Container extends VkDebugReportCallbackEXT {

        private final VkDebugReportCallbackEXTI delegate;

        Container(long functionPointer, VkDebugReportCallbackEXTI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage, long pUserData) {
            return delegate.invoke(flags, objectType, object, location, messageCode, pLayerPrefix, pMessage, pUserData);
        }

    }

}