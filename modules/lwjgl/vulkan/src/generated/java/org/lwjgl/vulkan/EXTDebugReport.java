/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Due to the nature of the Vulkan interface, there is very little error information available to the developer and application. By enabling optional validation layers and using the {@code VK_EXT_debug_report} extension, developers <b>can</b> obtain much more detailed feedback on the application’s use of Vulkan. This extension defines a way for layers and the implementation to call back to the application for events of interest to the application.
 * 
 * <h5>Examples</h5>
 * 
 * <p>{@code VK_EXT_debug_report} allows an application to register multiple callbacks with the validation layers. Some callbacks may log the information to a file, others may cause a debug break point or other application defined behavior. An application <b>can</b> register callbacks even when no validation layers are enabled, but they will only be called for loader and, if implemented, driver events.</p>
 * 
 * <p>To capture events that occur while creating or destroying an instance an application <b>can</b> link a {@link VkDebugReportCallbackCreateInfoEXT} structure to the {@code pNext} element of the {@link VkInstanceCreateInfo} structure given to {@link VK10#vkCreateInstance CreateInstance}.</p>
 * 
 * <p>Example uses: Create three callback objects. One will log errors and warnings to the debug console using Windows {@code OutputDebugString}. The second will cause the debugger to break at that callback when an error happens and the third will log warnings to stdout.</p>
 * 
 * <pre><code>
 *     VkResult res;
 *     VkDebugReportCallbackEXT cb1, cb2, cb3;
 * 
 *     VkDebugReportCallbackCreateInfoEXT callback1 = {
 *             VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT,    // sType
 *             NULL,                                                       // pNext
 *             VK_DEBUG_REPORT_ERROR_BIT_EXT |                             // flags
 *             VK_DEBUG_REPORT_WARNING_BIT_EXT,
 *             myOutputDebugString,                                        // pfnCallback
 *             NULL                                                        // pUserData
 *     };
 *     res = vkCreateDebugReportCallbackEXT(instance, &amp;callback1, &amp;cb1);
 *     if (res != VK_SUCCESS)
 *        // Do error handling for VK_ERROR_OUT_OF_MEMORY 
 * 
 *     callback.flags = VK_DEBUG_REPORT_ERROR_BIT_EXT;
 *     callback.pfnCallback = myDebugBreak;
 *     callback.pUserData = NULL;
 *     res = vkCreateDebugReportCallbackEXT(instance, &amp;callback, &amp;cb2);
 *     if (res != VK_SUCCESS)
 *        // Do error handling for VK_ERROR_OUT_OF_MEMORY 
 * 
 *     VkDebugReportCallbackCreateInfoEXT callback3 = {
 *             VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT,    // sType
 *             NULL,                                                       // pNext
 *             VK_DEBUG_REPORT_WARNING_BIT_EXT,                            // flags
 *             mystdOutLogger,                                             // pfnCallback
 *             NULL                                                        // pUserData
 *     };
 *     res = vkCreateDebugReportCallbackEXT(instance, &amp;callback3, &amp;cb3);
 *     if (res != VK_SUCCESS)
 *        // Do error handling for VK_ERROR_OUT_OF_MEMORY 
 * 
 *     ...
 * 
 *     // remove callbacks when cleaning up 
 *     vkDestroyDebugReportCallbackEXT(instance, cb1);
 *     vkDestroyDebugReportCallbackEXT(instance, cb2);
 *     vkDestroyDebugReportCallbackEXT(instance, cb3);</code></pre>
 * 
 * <h5>VK_EXT_debug_report</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_debug_report}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>12</dd>
 * <dt><b>Revision</b></dt>
 * <dd>10</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Deprecated</em> by {@link EXTDebugUtils VK_EXT_debug_utils} extension</li>
 * </ul></dd>
 * <dt><b>Special Use</b></dt>
 * <dd><ul>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#extendingvulkan-compatibility-specialuse">Debugging tools</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Courtney Goeltzenleuchter <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_debug_report]%20@courtney-g%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_debug_report%20extension%3E%3E">courtney-g</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-12-14</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Courtney Goeltzenleuchter, LunarG</li>
 * <li>Dan Ginsburg, Valve</li>
 * <li>Jon Ashburn, LunarG</li>
 * <li>Mark Lobodzinski, LunarG</li>
 * </ul></dd>
 * </dl>
 */
public class EXTDebugReport {

    /** The extension specification version. */
    public static final int VK_EXT_DEBUG_REPORT_SPEC_VERSION = 10;

    /** The extension name. */
    public static final String VK_EXT_DEBUG_REPORT_EXTENSION_NAME = "VK_EXT_debug_report";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT = 1000011000,
        VK_STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT          = 1000011000;

    /** Extends {@code VkResult}. */
    public static final int VK_ERROR_VALIDATION_FAILED_EXT = -1000011001;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT = 1000011000;

    /**
     * Extends {@code VkDebugReportObjectTypeEXT}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT}</li>
     * </ul>
     */
    public static final int
        VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT   = 1000156000,
        VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT = 1000085000;

    /**
     * VkDebugReportFlagBitsEXT - Bitmask specifying events which cause a debug report callback
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_DEBUG_REPORT_ERROR_BIT_EXT DEBUG_REPORT_ERROR_BIT_EXT} specifies that the application has violated a valid usage condition of the specification.</li>
     * <li>{@link #VK_DEBUG_REPORT_WARNING_BIT_EXT DEBUG_REPORT_WARNING_BIT_EXT} specifies use of Vulkan that <b>may</b> expose an app bug. Such cases may not be immediately harmful, such as a fragment shader outputting to a location with no attachment. Other cases <b>may</b> point to behavior that is almost certainly bad when unintended such as using an image whose memory has not been filled. In general if you see a warning but you know that the behavior is intended/desired, then simply ignore the warning.</li>
     * <li>{@link #VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT} specifies a potentially non-optimal use of Vulkan, e.g. using {@link VK10#vkCmdClearColorImage CmdClearColorImage} when setting {@link VkAttachmentDescription}{@code ::loadOp} to {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR} would have worked.</li>
     * <li>{@link #VK_DEBUG_REPORT_INFORMATION_BIT_EXT DEBUG_REPORT_INFORMATION_BIT_EXT} specifies an informational message such as resource details that may be handy when debugging an application.</li>
     * <li>{@link #VK_DEBUG_REPORT_DEBUG_BIT_EXT DEBUG_REPORT_DEBUG_BIT_EXT} specifies diagnostic information from the implementation and layers.</li>
     * </ul>
     */
    public static final int
        VK_DEBUG_REPORT_INFORMATION_BIT_EXT         = 0x1,
        VK_DEBUG_REPORT_WARNING_BIT_EXT             = 0x2,
        VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT = 0x4,
        VK_DEBUG_REPORT_ERROR_BIT_EXT               = 0x8,
        VK_DEBUG_REPORT_DEBUG_BIT_EXT               = 0x10;

    /**
     * VkDebugReportObjectTypeEXT - Specify the type of an object handle
     * 
     * <h5>Description</h5>
     * 
     * <h6>{@code VkDebugReportObjectTypeEXT} and Vulkan Handle Relationship</h6>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>{@code VkDebugReportObjectTypeEXT}</th><th>Vulkan Handle Type</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT}</td><td>Unknown/Undefined Handle</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT}</td><td>{@code VkInstance}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT}</td><td>{@code VkPhysicalDevice}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT}</td><td>{@code VkDevice}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT}</td><td>{@code VkQueue}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT}</td><td>{@code VkSemaphore}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT}</td><td>{@code VkCommandBuffer}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT}</td><td>{@code VkFence}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT}</td><td>{@code VkDeviceMemory}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT}</td><td>{@code VkBuffer}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT}</td><td>{@code VkImage}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT}</td><td>{@code VkEvent}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT}</td><td>{@code VkQueryPool}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT}</td><td>{@code VkBufferView}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT}</td><td>{@code VkImageView}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT}</td><td>{@code VkShaderModule}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT}</td><td>{@code VkPipelineCache}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT}</td><td>{@code VkPipelineLayout}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT}</td><td>{@code VkRenderPass}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT}</td><td>{@code VkPipeline}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT}</td><td>{@code VkDescriptorSetLayout}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT}</td><td>{@code VkSampler}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT}</td><td>{@code VkDescriptorPool}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT}</td><td>{@code VkDescriptorSet}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT}</td><td>{@code VkFramebuffer}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT}</td><td>{@code VkCommandPool}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT}</td><td>{@code VkSurfaceKHR}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT}</td><td>{@code VkSwapchainKHR}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT}</td><td>{@code VkDebugReportCallbackEXT}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT}</td><td>{@code VkDisplayKHR}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT}</td><td>{@code VkDisplayModeKHR}</td></tr>
     * <tr><td>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT}</td><td>{@code VkDescriptorUpdateTemplate}</td></tr>
     * </tbody>
     * </table>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The primary expected use of {@link #VK_ERROR_VALIDATION_FAILED_EXT ERROR_VALIDATION_FAILED_EXT} is for validation layer testing. It is not expected that an application would see this error code during normal use of the validation layers.</p>
     * </div>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDebugMarkerObjectNameInfoEXT}, {@link VkDebugMarkerObjectTagInfoEXT}, {@link #vkDebugReportMessageEXT DebugReportMessageEXT}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT}</li>
     * </ul>
     */
    public static final int
        VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT                   = 0,
        VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT                  = 1,
        VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT           = 2,
        VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT                    = 3,
        VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT                     = 4,
        VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT                 = 5,
        VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT            = 6,
        VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT                     = 7,
        VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT             = 8,
        VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT                    = 9,
        VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT                     = 10,
        VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT                     = 11,
        VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT                = 12,
        VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT               = 13,
        VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT                = 14,
        VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT             = 15,
        VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT            = 16,
        VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT           = 17,
        VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT               = 18,
        VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT                  = 19,
        VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT     = 20,
        VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT                   = 21,
        VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT           = 22,
        VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT            = 23,
        VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT               = 24,
        VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT              = 25,
        VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT               = 26,
        VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT             = 27,
        VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT = 28,
        VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT              = 28,
        VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT               = 29,
        VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT          = 30,
        VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT      = 33,
        VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT          = 33;

    protected EXTDebugReport() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateDebugReportCallbackEXT ] ---

    /** Unsafe version of: {@link #vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT} */
    public static int nvkCreateDebugReportCallbackEXT(VkInstance instance, long pCreateInfo, long pAllocator, long pCallback) {
        long __functionAddress = instance.getCapabilities().vkCreateDebugReportCallbackEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugReportCallbackCreateInfoEXT.validate(pCreateInfo);
        }
        return callPPPPI(instance.address(), pCreateInfo, pAllocator, pCallback, __functionAddress);
    }

    /**
     * Create a debug report callback object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Debug report callbacks give more detailed feedback on the application’s use of Vulkan when events of interest occur.</p>
     * 
     * <p>To register a debug report callback, an application uses {@link #vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT}.</p>
     * 
     * <pre><code>
     * VkResult vkCreateDebugReportCallbackEXT(
     *     VkInstance                                  instance,
     *     const VkDebugReportCallbackCreateInfoEXT*   pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkDebugReportCallbackEXT*                   pCallback);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkDebugReportCallbackCreateInfoEXT} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pCallback} <b>must</b> be a valid pointer to a {@code VkDebugReportCallbackEXT} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkDebugReportCallbackCreateInfoEXT}</p>
     *
     * @param instance    the instance the callback will be logged on.
     * @param pCreateInfo a pointer to a {@link VkDebugReportCallbackCreateInfoEXT} structure defining the conditions under which this callback will be called.
     * @param pAllocator  controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pCallback   a pointer to a {@code VkDebugReportCallbackEXT} handle in which the created object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateDebugReportCallbackEXT(VkInstance instance, @NativeType("VkDebugReportCallbackCreateInfoEXT const *") VkDebugReportCallbackCreateInfoEXT pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDebugReportCallbackEXT *") LongBuffer pCallback) {
        if (CHECKS) {
            check(pCallback, 1);
        }
        return nvkCreateDebugReportCallbackEXT(instance, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pCallback));
    }

    // --- [ vkDestroyDebugReportCallbackEXT ] ---

    /** Unsafe version of: {@link #vkDestroyDebugReportCallbackEXT DestroyDebugReportCallbackEXT} */
    public static void nvkDestroyDebugReportCallbackEXT(VkInstance instance, long callback, long pAllocator) {
        long __functionAddress = instance.getCapabilities().vkDestroyDebugReportCallbackEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(instance.address(), callback, pAllocator, __functionAddress);
    }

    /**
     * Destroy a debug report callback object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy a {@code VkDebugReportCallbackEXT} object, call:</p>
     * 
     * <pre><code>
     * void vkDestroyDebugReportCallbackEXT(
     *     VkInstance                                  instance,
     *     VkDebugReportCallbackEXT                    callback,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code callback} was created, a compatible set of callbacks <b>must</b> be provided here</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code callback} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
     * <li>If {@code callback} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code callback} <b>must</b> be a valid {@code VkDebugReportCallbackEXT} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>If {@code callback} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code instance}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code callback} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param instance   the instance where the callback was created.
     * @param callback   the {@code VkDebugReportCallbackEXT} object to destroy. {@code callback} is an externally synchronized object and <b>must</b> not be used on more than one thread at a time. This means that {@code vkDestroyDebugReportCallbackEXT} <b>must</b> not be called when a callback is active.
     * @param pAllocator controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyDebugReportCallbackEXT(VkInstance instance, @NativeType("VkDebugReportCallbackEXT") long callback, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyDebugReportCallbackEXT(instance, callback, memAddressSafe(pAllocator));
    }

    // --- [ vkDebugReportMessageEXT ] ---

    /** Unsafe version of: {@link #vkDebugReportMessageEXT DebugReportMessageEXT} */
    public static void nvkDebugReportMessageEXT(VkInstance instance, int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage) {
        long __functionAddress = instance.getCapabilities().vkDebugReportMessageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPPPV(instance.address(), flags, objectType, object, location, messageCode, pLayerPrefix, pMessage, __functionAddress);
    }

    /**
     * Inject a message into a debug stream.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To inject its own messages into the debug stream, call:</p>
     * 
     * <pre><code>
     * void vkDebugReportMessageEXT(
     *     VkInstance                                  instance,
     *     VkDebugReportFlagsEXT                       flags,
     *     VkDebugReportObjectTypeEXT                  objectType,
     *     uint64_t                                    object,
     *     size_t                                      location,
     *     int32_t                                     messageCode,
     *     const char*                                 pLayerPrefix,
     *     const char*                                 pMessage);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The call will propagate through the layers and generate callback(s) as indicated by the message’s flags. The parameters are passed on to the callback in addition to the {@code pUserData} value that was defined at the time the callback was registered.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code object} <b>must</b> be a Vulkan object or {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>If {@code objectType} is not {@link #VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT} and {@code object} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code object} <b>must</b> be a Vulkan object of the corresponding type associated with {@code objectType} as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#debug-report-object-types">{@code VkDebugReportObjectTypeEXT} and Vulkan Handle Relationship</a></li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
     * <li>{@code flags} <b>must</b> be a valid combination of {@code VkDebugReportFlagBitsEXT} values</li>
     * <li>{@code flags} <b>must</b> not be 0</li>
     * <li>{@code objectType} <b>must</b> be a valid {@code VkDebugReportObjectTypeEXT} value</li>
     * <li>{@code pLayerPrefix} <b>must</b> be a null-terminated UTF-8 string</li>
     * <li>{@code pMessage} <b>must</b> be a null-terminated UTF-8 string</li>
     * </ul>
     *
     * @param instance     the debug stream’s {@code VkInstance}.
     * @param flags        specifies the {@code VkDebugReportFlagBitsEXT} classification of this event/message.
     * @param objectType   a {@code VkDebugReportObjectTypeEXT} specifying the type of object being used or created at the time the event was triggered.
     * @param object       the object where the issue was detected. {@code object} <b>can</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE} if there is no object associated with the event.
     * @param location     an application defined value.
     * @param messageCode  an application defined value.
     * @param pLayerPrefix the abbreviation of the component making this event/message.
     * @param pMessage     a null-terminated string detailing the trigger conditions.
     */
    public static void vkDebugReportMessageEXT(VkInstance instance, @NativeType("VkDebugReportFlagsEXT") int flags, @NativeType("VkDebugReportObjectTypeEXT") int objectType, @NativeType("uint64_t") long object, @NativeType("size_t") long location, @NativeType("int32_t") int messageCode, @NativeType("char const *") ByteBuffer pLayerPrefix, @NativeType("char const *") ByteBuffer pMessage) {
        if (CHECKS) {
            checkNT1(pLayerPrefix);
            checkNT1(pMessage);
        }
        nvkDebugReportMessageEXT(instance, flags, objectType, object, location, messageCode, memAddress(pLayerPrefix), memAddress(pMessage));
    }

    /**
     * Inject a message into a debug stream.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To inject its own messages into the debug stream, call:</p>
     * 
     * <pre><code>
     * void vkDebugReportMessageEXT(
     *     VkInstance                                  instance,
     *     VkDebugReportFlagsEXT                       flags,
     *     VkDebugReportObjectTypeEXT                  objectType,
     *     uint64_t                                    object,
     *     size_t                                      location,
     *     int32_t                                     messageCode,
     *     const char*                                 pLayerPrefix,
     *     const char*                                 pMessage);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The call will propagate through the layers and generate callback(s) as indicated by the message’s flags. The parameters are passed on to the callback in addition to the {@code pUserData} value that was defined at the time the callback was registered.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code object} <b>must</b> be a Vulkan object or {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>If {@code objectType} is not {@link #VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT} and {@code object} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code object} <b>must</b> be a Vulkan object of the corresponding type associated with {@code objectType} as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#debug-report-object-types">{@code VkDebugReportObjectTypeEXT} and Vulkan Handle Relationship</a></li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
     * <li>{@code flags} <b>must</b> be a valid combination of {@code VkDebugReportFlagBitsEXT} values</li>
     * <li>{@code flags} <b>must</b> not be 0</li>
     * <li>{@code objectType} <b>must</b> be a valid {@code VkDebugReportObjectTypeEXT} value</li>
     * <li>{@code pLayerPrefix} <b>must</b> be a null-terminated UTF-8 string</li>
     * <li>{@code pMessage} <b>must</b> be a null-terminated UTF-8 string</li>
     * </ul>
     *
     * @param instance     the debug stream’s {@code VkInstance}.
     * @param flags        specifies the {@code VkDebugReportFlagBitsEXT} classification of this event/message.
     * @param objectType   a {@code VkDebugReportObjectTypeEXT} specifying the type of object being used or created at the time the event was triggered.
     * @param object       the object where the issue was detected. {@code object} <b>can</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE} if there is no object associated with the event.
     * @param location     an application defined value.
     * @param messageCode  an application defined value.
     * @param pLayerPrefix the abbreviation of the component making this event/message.
     * @param pMessage     a null-terminated string detailing the trigger conditions.
     */
    public static void vkDebugReportMessageEXT(VkInstance instance, @NativeType("VkDebugReportFlagsEXT") int flags, @NativeType("VkDebugReportObjectTypeEXT") int objectType, @NativeType("uint64_t") long object, @NativeType("size_t") long location, @NativeType("int32_t") int messageCode, @NativeType("char const *") CharSequence pLayerPrefix, @NativeType("char const *") CharSequence pMessage) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pLayerPrefix, true);
            long pLayerPrefixEncoded = stack.getPointerAddress();
            stack.nUTF8(pMessage, true);
            long pMessageEncoded = stack.getPointerAddress();
            nvkDebugReportMessageEXT(instance, flags, objectType, object, location, messageCode, pLayerPrefixEncoded, pMessageEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT} */
    @NativeType("VkResult")
    public static int vkCreateDebugReportCallbackEXT(VkInstance instance, @NativeType("VkDebugReportCallbackCreateInfoEXT const *") VkDebugReportCallbackCreateInfoEXT pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDebugReportCallbackEXT *") long[] pCallback) {
        long __functionAddress = instance.getCapabilities().vkCreateDebugReportCallbackEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pCallback, 1);
            VkDebugReportCallbackCreateInfoEXT.validate(pCreateInfo.address());
        }
        return callPPPPI(instance.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pCallback, __functionAddress);
    }

}