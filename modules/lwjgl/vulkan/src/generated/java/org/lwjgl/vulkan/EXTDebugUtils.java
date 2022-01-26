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
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Due to the nature of the Vulkan interface, there is very little error information available to the developer and application. By using the {@code VK_EXT_debug_utils} extension, developers <b>can</b> obtain more information. When combined with validation layers, even more detailed feedback on the application’s use of Vulkan will be provided.
 * 
 * <p>This extension provides the following capabilities:</p>
 * 
 * <ul>
 * <li>The ability to create a debug messenger which will pass along debug messages to an application supplied callback.</li>
 * <li>The ability to identify specific Vulkan objects using a name or tag to improve tracking.</li>
 * <li>The ability to identify specific sections within a {@code VkQueue} or {@code VkCommandBuffer} using labels to aid organization and offline analysis in external tools.</li>
 * </ul>
 * 
 * <p>The main difference between this extension and {@link EXTDebugReport VK_EXT_debug_report} and {@link EXTDebugMarker VK_EXT_debug_marker} is that those extensions use {@code VkDebugReportObjectTypeEXT} to identify objects. This extension uses the core {@code VkObjectType} in place of {@code VkDebugReportObjectTypeEXT}. The primary reason for this move is that no future object type handle enumeration values will be added to {@code VkDebugReportObjectTypeEXT} since the creation of {@code VkObjectType}.</p>
 * 
 * <p>In addition, this extension combines the functionality of both {@link EXTDebugReport VK_EXT_debug_report} and {@link EXTDebugMarker VK_EXT_debug_marker} by allowing object name and debug markers (now called labels) to be returned to the application’s callback function. This should assist in clarifying the details of a debug message including: what objects are involved and potentially which location within a {@code VkQueue} or {@code VkCommandBuffer} the message occurred.</p>
 * 
 * <h5>Examples</h5>
 * 
 * <p><b>Example 1</b></p>
 * 
 * <p>{@code VK_EXT_debug_utils} allows an application to register multiple callbacks with any Vulkan component wishing to report debug information. Some callbacks may log the information to a file, others may cause a debug break point or other application defined behavior. An application <b>can</b> register callbacks even when no validation layers are enabled, but they will only be called for loader and, if implemented, driver events.</p>
 * 
 * <p>To capture events that occur while creating or destroying an instance an application <b>can</b> link a {@link VkDebugUtilsMessengerCreateInfoEXT} structure to the {@code pNext} element of the {@link VkInstanceCreateInfo} structure given to {@link VK10#vkCreateInstance CreateInstance}.</p>
 * 
 * <p>Example uses: Create three callback objects. One will log errors and warnings to the debug console using Windows {@code OutputDebugString}. The second will cause the debugger to break at that callback when an error happens and the third will log warnings to stdout.</p>
 * 
 * <pre><code>
 *     extern VkInstance instance;
 *     VkResult res;
 *     VkDebugUtilsMessengerEXT cb1, cb2, cb3;
 * 
 *     // Must call extension functions through a function pointer:
 *     PFN_vkCreateDebugUtilsMessengerEXT pfnCreateDebugUtilsMessengerEXT = (PFN_vkCreateDebugUtilsMessengerEXT)vkGetInstanceProcAddr(instance, "vkCreateDebugUtilsMessengerEXT");
 *     PFN_vkDestroyDebugUtilsMessengerEXT pfnDestroyDebugUtilsMessengerEXT = (PFN_vkDestroyDebugUtilsMessengerEXT)vkGetInstanceProcAddr(instance, "vkDestroyDebugUtilsMessengerEXT");
 * 
 *     VkDebugUtilsMessengerCreateInfoEXT callback1 = {
 *             VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT,  // sType
 *             NULL,                                                     // pNext
 *             0,                                                        // flags
 *             VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT |           // messageSeverity
 *             VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT,
 *             VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT |             // messageType
 *             VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT,
 *             myOutputDebugString,                                      // pfnUserCallback
 *             NULL                                                      // pUserData
 *     };
 *     res = pfnCreateDebugUtilsMessengerEXT(instance, &amp;callback1, NULL, &amp;cb1);
 *     if (res != VK_SUCCESS) {
 *        // Do error handling for VK_ERROR_OUT_OF_MEMORY
 *     }
 * 
 *     callback1.messageSeverity = VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT;
 *     callback1.pfnUserCallback = myDebugBreak;
 *     callback1.pUserData = NULL;
 *     res = pfnCreateDebugUtilsMessengerEXT(instance, &amp;callback1, NULL, &amp;cb2);
 *     if (res != VK_SUCCESS) {
 *        // Do error handling for VK_ERROR_OUT_OF_MEMORY
 *     }
 * 
 *     VkDebugUtilsMessengerCreateInfoEXT callback3 = {
 *             VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT,  // sType
 *             NULL,                                                     // pNext
 *             0,                                                        // flags
 *             VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT,          // messageSeverity
 *             VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT |             // messageType
 *             VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT,
 *             mystdOutLogger,                                           // pfnUserCallback
 *             NULL                                                      // pUserData
 *     };
 *     res = pfnCreateDebugUtilsMessengerEXT(instance, &amp;callback3, NULL, &amp;cb3);
 *     if (res != VK_SUCCESS) {
 *        // Do error handling for VK_ERROR_OUT_OF_MEMORY
 *     }
 * 
 *     ...
 * 
 *     // Remove callbacks when cleaning up
 *     pfnDestroyDebugUtilsMessengerEXT(instance, cb1, NULL);
 *     pfnDestroyDebugUtilsMessengerEXT(instance, cb2, NULL);
 *     pfnDestroyDebugUtilsMessengerEXT(instance, cb3, NULL);</code></pre>
 * 
 * <p><b>Example 2</b></p>
 * 
 * <p>Associate a name with an image, for easier debugging in external tools or with validation layers that can print a friendly name when referring to objects in error messages.</p>
 * 
 * <pre><code>
 *     extern VkInstance instance;
 *     extern VkDevice device;
 *     extern VkImage image;
 * 
 *     // Must call extension functions through a function pointer:
 *     PFN_vkSetDebugUtilsObjectNameEXT pfnSetDebugUtilsObjectNameEXT = (PFN_vkSetDebugUtilsObjectNameEXT)vkGetInstanceProcAddr(instance, "vkSetDebugUtilsObjectNameEXT");
 * 
 *     // Set a name on the image
 *     const VkDebugUtilsObjectNameInfoEXT imageNameInfo =
 *     {
 *         VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT, // sType
 *         NULL,                                               // pNext
 *         VK_OBJECT_TYPE_IMAGE,                               // objectType
 *         (uint64_t)image,                                    // objectHandle
 *         "Brick Diffuse Texture",                            // pObjectName
 *     };
 * 
 *     pfnSetDebugUtilsObjectNameEXT(device, &amp;imageNameInfo);
 * 
 *     // A subsequent error might print:
 *     //   Image 'Brick Diffuse Texture' (0xc0dec0dedeadbeef) is used in a
 *     //   command buffer with no memory bound to it.</code></pre>
 * 
 * <p><b>Example 3</b></p>
 * 
 * <p>Annotating regions of a workload with naming information so that offline analysis tools can display a more usable visualization of the commands submitted.</p>
 * 
 * <pre><code>
 *     extern VkInstance instance;
 *     extern VkCommandBuffer commandBuffer;
 * 
 *     // Must call extension functions through a function pointer:
 *     PFN_vkQueueBeginDebugUtilsLabelEXT pfnQueueBeginDebugUtilsLabelEXT = (PFN_vkQueueBeginDebugUtilsLabelEXT)vkGetInstanceProcAddr(instance, "vkQueueBeginDebugUtilsLabelEXT");
 *     PFN_vkQueueEndDebugUtilsLabelEXT pfnQueueEndDebugUtilsLabelEXT = (PFN_vkQueueEndDebugUtilsLabelEXT)vkGetInstanceProcAddr(instance, "vkQueueEndDebugUtilsLabelEXT");
 *     PFN_vkCmdBeginDebugUtilsLabelEXT pfnCmdBeginDebugUtilsLabelEXT = (PFN_vkCmdBeginDebugUtilsLabelEXT)vkGetInstanceProcAddr(instance, "vkCmdBeginDebugUtilsLabelEXT");
 *     PFN_vkCmdEndDebugUtilsLabelEXT pfnCmdEndDebugUtilsLabelEXT = (PFN_vkCmdEndDebugUtilsLabelEXT)vkGetInstanceProcAddr(instance, "vkCmdEndDebugUtilsLabelEXT");
 *     PFN_vkCmdInsertDebugUtilsLabelEXT pfnCmdInsertDebugUtilsLabelEXT = (PFN_vkCmdInsertDebugUtilsLabelEXT)vkGetInstanceProcAddr(instance, "vkCmdInsertDebugUtilsLabelEXT");
 * 
 *     // Describe the area being rendered
 *     const VkDebugUtilsLabelEXT houseLabel =
 *     {
 *         VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT, // sType
 *         NULL,                                    // pNext
 *         "Brick House",                           // pLabelName
 *         { 1.0f, 0.0f, 0.0f, 1.0f },              // color
 *     };
 * 
 *     // Start an annotated group of calls under the 'Brick House' name
 *     pfnCmdBeginDebugUtilsLabelEXT(commandBuffer, &amp;houseLabel);
 *     {
 *         // A mutable structure for each part being rendered
 *         VkDebugUtilsLabelEXT housePartLabel =
 *         {
 *             VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT, // sType
 *             NULL,                                    // pNext
 *             NULL,                                    // pLabelName
 *             { 0.0f, 0.0f, 0.0f, 0.0f },              // color
 *         };
 * 
 *         // Set the name and insert the marker
 *         housePartLabel.pLabelName = "Walls";
 *         pfnCmdInsertDebugUtilsLabelEXT(commandBuffer, &amp;housePartLabel);
 * 
 *         // Insert the drawcall for the walls
 *         vkCmdDrawIndexed(commandBuffer, 1000, 1, 0, 0, 0);
 * 
 *         // Insert a recursive region for two sets of windows
 *         housePartLabel.pLabelName = "Windows";
 *         pfnCmdBeginDebugUtilsLabelEXT(commandBuffer, &amp;housePartLabel);
 *         {
 *             vkCmdDrawIndexed(commandBuffer, 75, 6, 1000, 0, 0);
 *             vkCmdDrawIndexed(commandBuffer, 100, 2, 1450, 0, 0);
 *         }
 *         pfnCmdEndDebugUtilsLabelEXT(commandBuffer);
 * 
 *         housePartLabel.pLabelName = "Front Door";
 *         pfnCmdInsertDebugUtilsLabelEXT(commandBuffer, &amp;housePartLabel);
 * 
 *         vkCmdDrawIndexed(commandBuffer, 350, 1, 1650, 0, 0);
 * 
 *         housePartLabel.pLabelName = "Roof";
 *         pfnCmdInsertDebugUtilsLabelEXT(commandBuffer, &amp;housePartLabel);
 * 
 *         vkCmdDrawIndexed(commandBuffer, 500, 1, 2000, 0, 0);
 *     }
 *     // End the house annotation started above
 *     pfnCmdEndDebugUtilsLabelEXT(commandBuffer);
 * 
 *     // Do other work
 * 
 *     vkEndCommandBuffer(commandBuffer);
 * 
 *     // Describe the queue being used
 *     const VkDebugUtilsLabelEXT queueLabel =
 *     {
 *         VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT, // sType
 *         NULL,                                    // pNext
 *         "Main Render Work",                      // pLabelName
 *         { 0.0f, 1.0f, 0.0f, 1.0f },              // color
 *     };
 * 
 *     // Identify the queue label region
 *     pfnQueueBeginDebugUtilsLabelEXT(queue, &amp;queueLabel);
 * 
 *     // Submit the work for the main render thread
 *     const VkCommandBuffer cmd_bufs[] = {commandBuffer};
 *     VkSubmitInfo submit_info = {.sType = VK_STRUCTURE_TYPE_SUBMIT_INFO,
 *                                 .pNext = NULL,
 *                                 .waitSemaphoreCount = 0,
 *                                 .pWaitSemaphores = NULL,
 *                                 .pWaitDstStageMask = NULL,
 *                                 .commandBufferCount = 1,
 *                                 .pCommandBuffers = cmd_bufs,
 *                                 .signalSemaphoreCount = 0,
 *                                 .pSignalSemaphores = NULL};
 *     vkQueueSubmit(queue, 1, &amp;submit_info, fence);
 * 
 *     // End the queue label region
 *     pfnQueueEndDebugUtilsLabelEXT(queue);</code></pre>
 * 
 * <h5>VK_EXT_debug_utils</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_debug_utils}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>129</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Special Use</b></dt>
 * <dd><ul>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#extendingvulkan-compatibility-specialuse">Debugging tools</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Mark Young <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_debug_utils]%20@marky-lunarg%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_debug_utils%20extension%3E%3E">marky-lunarg</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-04-03</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0 of the Vulkan API.</li>
 * <li>Requires {@code VkObjectType}</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Mark Young, LunarG</li>
 * <li>Baldur Karlsson</li>
 * <li>Ian Elliott, Google</li>
 * <li>Courtney Goeltzenleuchter, Google</li>
 * <li>Karl Schultz, LunarG</li>
 * <li>Mark Lobodzinski, LunarG</li>
 * <li>Mike Schuchardt, LunarG</li>
 * <li>Jaakko Konttinen, AMD</li>
 * <li>Dan Ginsburg, Valve Software</li>
 * <li>Rolando Olivares, Epic Games</li>
 * <li>Dan Baker, Oxide Games</li>
 * <li>Kyle Spagnoli, NVIDIA</li>
 * <li>Jon Ashburn, LunarG</li>
 * <li>Piers Daniell, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class EXTDebugUtils {

    /** The extension specification version. */
    public static final int VK_EXT_DEBUG_UTILS_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_EXT_DEBUG_UTILS_EXTENSION_NAME = "VK_EXT_debug_utils";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT        = 1000128000,
        VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT         = 1000128001,
        VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT                   = 1000128002,
        VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT = 1000128003,
        VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT   = 1000128004;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT = 1000128000;

    /**
     * VkDebugUtilsMessageSeverityFlagBitsEXT - Bitmask specifying which severities of events cause a debug messenger callback
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT} specifies the most verbose output indicating all diagnostic messages from the Vulkan loader, layers, and drivers should be captured.</li>
     * <li>{@link #VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT} specifies an informational message such as resource details that may be handy when debugging an application.</li>
     * <li>{@link #VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT} specifies use of Vulkan that <b>may</b> expose an app bug. Such cases may not be immediately harmful, such as a fragment shader outputting to a location with no attachment. Other cases <b>may</b> point to behavior that is almost certainly bad when unintended such as using an image whose memory has not been filled. In general if you see a warning but you know that the behavior is intended/desired, then simply ignore the warning.</li>
     * <li>{@link #VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT} specifies that the application has violated a valid usage condition of the specification.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The values of {@code VkDebugUtilsMessageSeverityFlagBitsEXT} are sorted based on severity. The higher the flag value, the more severe the message. This allows for simple boolean operation comparisons when looking at {@code VkDebugUtilsMessageSeverityFlagBitsEXT} values.</p>
     * 
     * <p>For example:</p>
     * 
     * <pre><code>
     *     if (messageSeverity &gt;= VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT) {
     *         // Do something for warnings and errors
     *     }</code></pre>
     * 
     * <p>In addition, space has been left between the enums to allow for later addition of new severities in between the existing values.</p>
     * </div>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #vkSubmitDebugUtilsMessageEXT SubmitDebugUtilsMessageEXT}</p>
     */
    public static final int
        VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT = 0x1,
        VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT    = 0x10,
        VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT = 0x100,
        VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT   = 0x1000;

    /**
     * VkDebugUtilsMessageTypeFlagBitsEXT - Bitmask specifying which types of events cause a debug messenger callback
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT} specifies that some general event has occurred. This is typically a non-specification, non-performance event.</li>
     * <li>{@link #VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT} specifies that something has occurred during validation against the Vulkan specification that may indicate invalid behavior.</li>
     * <li>{@link #VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT} specifies a potentially non-optimal use of Vulkan, e.g. using {@link VK10#vkCmdClearColorImage CmdClearColorImage} when setting {@link VkAttachmentDescription}{@code ::loadOp} to {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR} would have worked.</li>
     * </ul>
     */
    public static final int
        VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT     = 0x1,
        VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT  = 0x2,
        VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT = 0x4;

    protected EXTDebugUtils() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkSetDebugUtilsObjectNameEXT ] ---

    /** Unsafe version of: {@link #vkSetDebugUtilsObjectNameEXT SetDebugUtilsObjectNameEXT} */
    public static int nvkSetDebugUtilsObjectNameEXT(VkDevice device, long pNameInfo) {
        long __functionAddress = device.getCapabilities().vkSetDebugUtilsObjectNameEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pNameInfo, __functionAddress);
    }

    /**
     * Give a user-friendly name to an object.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * VkResult vkSetDebugUtilsObjectNameEXT(
     *     VkDevice                                    device,
     *     const VkDebugUtilsObjectNameInfoEXT*        pNameInfo);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code pNameInfo→objectType} <b>must</b> not be {@link VK10#VK_OBJECT_TYPE_UNKNOWN OBJECT_TYPE_UNKNOWN}</li>
     * <li>{@code pNameInfo→objectHandle} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pNameInfo} <b>must</b> be a valid pointer to a valid {@link VkDebugUtilsObjectNameInfoEXT} structure</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code pNameInfo→objectHandle} <b>must</b> be externally synchronized</li>
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
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDebugUtilsObjectNameInfoEXT}</p>
     *
     * @param device    the device that created the object.
     * @param pNameInfo a pointer to a {@link VkDebugUtilsObjectNameInfoEXT} structure specifying parameters of the name to set on the object.
     */
    @NativeType("VkResult")
    public static int vkSetDebugUtilsObjectNameEXT(VkDevice device, @NativeType("VkDebugUtilsObjectNameInfoEXT const *") VkDebugUtilsObjectNameInfoEXT pNameInfo) {
        return nvkSetDebugUtilsObjectNameEXT(device, pNameInfo.address());
    }

    // --- [ vkSetDebugUtilsObjectTagEXT ] ---

    /** Unsafe version of: {@link #vkSetDebugUtilsObjectTagEXT SetDebugUtilsObjectTagEXT} */
    public static int nvkSetDebugUtilsObjectTagEXT(VkDevice device, long pTagInfo) {
        long __functionAddress = device.getCapabilities().vkSetDebugUtilsObjectTagEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugUtilsObjectTagInfoEXT.validate(pTagInfo);
        }
        return callPPI(device.address(), pTagInfo, __functionAddress);
    }

    /**
     * Attach arbitrary data to an object.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * VkResult vkSetDebugUtilsObjectTagEXT(
     *     VkDevice                                    device,
     *     const VkDebugUtilsObjectTagInfoEXT*         pTagInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pTagInfo} <b>must</b> be a valid pointer to a valid {@link VkDebugUtilsObjectTagInfoEXT} structure</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code pTagInfo→objectHandle} <b>must</b> be externally synchronized</li>
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
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDebugUtilsObjectTagInfoEXT}</p>
     *
     * @param device   the device that created the object.
     * @param pTagInfo a pointer to a {@link VkDebugUtilsObjectTagInfoEXT} structure specifying parameters of the tag to attach to the object.
     */
    @NativeType("VkResult")
    public static int vkSetDebugUtilsObjectTagEXT(VkDevice device, @NativeType("VkDebugUtilsObjectTagInfoEXT const *") VkDebugUtilsObjectTagInfoEXT pTagInfo) {
        return nvkSetDebugUtilsObjectTagEXT(device, pTagInfo.address());
    }

    // --- [ vkQueueBeginDebugUtilsLabelEXT ] ---

    /** Unsafe version of: {@link #vkQueueBeginDebugUtilsLabelEXT QueueBeginDebugUtilsLabelEXT} */
    public static void nvkQueueBeginDebugUtilsLabelEXT(VkQueue queue, long pLabelInfo) {
        long __functionAddress = queue.getCapabilities().vkQueueBeginDebugUtilsLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugUtilsLabelEXT.validate(pLabelInfo);
        }
        callPPV(queue.address(), pLabelInfo, __functionAddress);
    }

    /**
     * Open a queue debug label region.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>A queue debug label region is opened by calling:</p>
     * 
     * <pre><code>
     * void vkQueueBeginDebugUtilsLabelEXT(
     *     VkQueue                                     queue,
     *     const VkDebugUtilsLabelEXT*                 pLabelInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
     * <li>{@code pLabelInfo} <b>must</b> be a valid pointer to a valid {@link VkDebugUtilsLabelEXT} structure</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>-</td><td>-</td><td>Any</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDebugUtilsLabelEXT}</p>
     *
     * @param queue      the queue in which to start a debug label region.
     * @param pLabelInfo a pointer to a {@link VkDebugUtilsLabelEXT} structure specifying parameters of the label region to open.
     */
    public static void vkQueueBeginDebugUtilsLabelEXT(VkQueue queue, @NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT pLabelInfo) {
        nvkQueueBeginDebugUtilsLabelEXT(queue, pLabelInfo.address());
    }

    // --- [ vkQueueEndDebugUtilsLabelEXT ] ---

    /**
     * Close a queue debug label region.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>A queue debug label region is closed by calling:</p>
     * 
     * <pre><code>
     * void vkQueueEndDebugUtilsLabelEXT(
     *     VkQueue                                     queue);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The calls to {@link #vkQueueBeginDebugUtilsLabelEXT QueueBeginDebugUtilsLabelEXT} and {@link #vkQueueEndDebugUtilsLabelEXT QueueEndDebugUtilsLabelEXT} <b>must</b> be matched and balanced.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>There <b>must</b> be an outstanding {@code vkQueueBeginDebugUtilsLabelEXT} command prior to the {@code vkQueueEndDebugUtilsLabelEXT} on the queue</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>-</td><td>-</td><td>Any</td></tr></tbody>
     * </table>
     *
     * @param queue the queue in which a debug label region should be closed.
     */
    public static void vkQueueEndDebugUtilsLabelEXT(VkQueue queue) {
        long __functionAddress = queue.getCapabilities().vkQueueEndDebugUtilsLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(queue.address(), __functionAddress);
    }

    // --- [ vkQueueInsertDebugUtilsLabelEXT ] ---

    /** Unsafe version of: {@link #vkQueueInsertDebugUtilsLabelEXT QueueInsertDebugUtilsLabelEXT} */
    public static void nvkQueueInsertDebugUtilsLabelEXT(VkQueue queue, long pLabelInfo) {
        long __functionAddress = queue.getCapabilities().vkQueueInsertDebugUtilsLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugUtilsLabelEXT.validate(pLabelInfo);
        }
        callPPV(queue.address(), pLabelInfo, __functionAddress);
    }

    /**
     * Insert a label into a queue.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>A single label can be inserted into a queue by calling:</p>
     * 
     * <pre><code>
     * void vkQueueInsertDebugUtilsLabelEXT(
     *     VkQueue                                     queue,
     *     const VkDebugUtilsLabelEXT*                 pLabelInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
     * <li>{@code pLabelInfo} <b>must</b> be a valid pointer to a valid {@link VkDebugUtilsLabelEXT} structure</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>-</td><td>-</td><td>Any</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDebugUtilsLabelEXT}</p>
     *
     * @param queue      the queue into which a debug label will be inserted.
     * @param pLabelInfo a pointer to a {@link VkDebugUtilsLabelEXT} structure specifying parameters of the label to insert.
     */
    public static void vkQueueInsertDebugUtilsLabelEXT(VkQueue queue, @NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT pLabelInfo) {
        nvkQueueInsertDebugUtilsLabelEXT(queue, pLabelInfo.address());
    }

    // --- [ vkCmdBeginDebugUtilsLabelEXT ] ---

    /** Unsafe version of: {@link #vkCmdBeginDebugUtilsLabelEXT CmdBeginDebugUtilsLabelEXT} */
    public static void nvkCmdBeginDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, long pLabelInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginDebugUtilsLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugUtilsLabelEXT.validate(pLabelInfo);
        }
        callPPV(commandBuffer.address(), pLabelInfo, __functionAddress);
    }

    /**
     * Open a command buffer debug label region.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>A command buffer debug label region can be opened by calling:</p>
     * 
     * <pre><code>
     * void vkCmdBeginDebugUtilsLabelEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkDebugUtilsLabelEXT*                 pLabelInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pLabelInfo} <b>must</b> be a valid pointer to a valid {@link VkDebugUtilsLabelEXT} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDebugUtilsLabelEXT}</p>
     *
     * @param commandBuffer the command buffer into which the command is recorded.
     * @param pLabelInfo    a pointer to a {@link VkDebugUtilsLabelEXT} structure specifying parameters of the label region to open.
     */
    public static void vkCmdBeginDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, @NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT pLabelInfo) {
        nvkCmdBeginDebugUtilsLabelEXT(commandBuffer, pLabelInfo.address());
    }

    // --- [ vkCmdEndDebugUtilsLabelEXT ] ---

    /**
     * Close a command buffer label region.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>A command buffer label region can be closed by calling:</p>
     * 
     * <pre><code>
     * void vkCmdEndDebugUtilsLabelEXT(
     *     VkCommandBuffer                             commandBuffer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>An application <b>may</b> open a debug label region in one command buffer and close it in another, or otherwise split debug label regions across multiple command buffers or multiple queue submissions. When viewed from the linear series of submissions to a single queue, the calls to {@link #vkCmdBeginDebugUtilsLabelEXT CmdBeginDebugUtilsLabelEXT} and {@link #vkCmdEndDebugUtilsLabelEXT CmdEndDebugUtilsLabelEXT} <b>must</b> be matched and balanced.</p>
     * 
     * <p>There <b>can</b> be problems reporting command buffer debug labels during the recording process because command buffers <b>may</b> be recorded out of sequence with the resulting execution order. Since the recording order <b>may</b> be different, a solitary command buffer <b>may</b> have an inconsistent view of the debug label regions by itself. Therefore, if an issue occurs during the recording of a command buffer, and the environment requires returning debug labels, the implementation <b>may</b> return only those labels it is aware of. This is true even if the implementation is aware of only the debug labels within the command buffer being actively recorded.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>There <b>must</b> be an outstanding {@code vkCmdBeginDebugUtilsLabelEXT} command prior to the {@code vkCmdEndDebugUtilsLabelEXT} on the queue that {@code commandBuffer} is submitted to</li>
     * <li>If {@code commandBuffer} is a secondary command buffer, there <b>must</b> be an outstanding {@code vkCmdBeginDebugUtilsLabelEXT} command recorded to {@code commandBuffer} that has not previously been ended by a call to {@code vkCmdEndDebugUtilsLabelEXT}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command is recorded.
     */
    public static void vkCmdEndDebugUtilsLabelEXT(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndDebugUtilsLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), __functionAddress);
    }

    // --- [ vkCmdInsertDebugUtilsLabelEXT ] ---

    /** Unsafe version of: {@link #vkCmdInsertDebugUtilsLabelEXT CmdInsertDebugUtilsLabelEXT} */
    public static void nvkCmdInsertDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, long pLabelInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdInsertDebugUtilsLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugUtilsLabelEXT.validate(pLabelInfo);
        }
        callPPV(commandBuffer.address(), pLabelInfo, __functionAddress);
    }

    /**
     * Insert a label into a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>A single debug label can be inserted into a command buffer by calling:</p>
     * 
     * <pre><code>
     * void vkCmdInsertDebugUtilsLabelEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkDebugUtilsLabelEXT*                 pLabelInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pLabelInfo} <b>must</b> be a valid pointer to a valid {@link VkDebugUtilsLabelEXT} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDebugUtilsLabelEXT}</p>
     *
     * @param commandBuffer the command buffer into which the command is recorded.
     */
    public static void vkCmdInsertDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, @NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT pLabelInfo) {
        nvkCmdInsertDebugUtilsLabelEXT(commandBuffer, pLabelInfo.address());
    }

    // --- [ vkCreateDebugUtilsMessengerEXT ] ---

    /** Unsafe version of: {@link #vkCreateDebugUtilsMessengerEXT CreateDebugUtilsMessengerEXT} */
    public static int nvkCreateDebugUtilsMessengerEXT(VkInstance instance, long pCreateInfo, long pAllocator, long pMessenger) {
        long __functionAddress = instance.getCapabilities().vkCreateDebugUtilsMessengerEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugUtilsMessengerCreateInfoEXT.validate(pCreateInfo);
        }
        return callPPPPI(instance.address(), pCreateInfo, pAllocator, pMessenger, __functionAddress);
    }

    /**
     * Create a debug messenger object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>A debug messenger triggers a debug callback with a debug message when an event of interest occurs. To create a debug messenger which will trigger a debug callback, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateDebugUtilsMessengerEXT(
     *     VkInstance                                  instance,
     *     const VkDebugUtilsMessengerCreateInfoEXT*   pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkDebugUtilsMessengerEXT*                   pMessenger);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkDebugUtilsMessengerCreateInfoEXT} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pMessenger} <b>must</b> be a valid pointer to a {@code VkDebugUtilsMessengerEXT} handle</li>
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
     * <p>The application <b>must</b> ensure that {@link #vkCreateDebugUtilsMessengerEXT CreateDebugUtilsMessengerEXT} is not executed in parallel with any Vulkan command that is also called with {@code instance} or child of {@code instance} as the dispatchable argument.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkDebugUtilsMessengerCreateInfoEXT}</p>
     *
     * @param instance    the instance the messenger will be used with.
     * @param pCreateInfo a pointer to a {@link VkDebugUtilsMessengerCreateInfoEXT} structure containing the callback pointer, as well as defining conditions under which this messenger will trigger the callback.
     * @param pAllocator  controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pMessenger  a pointer to a {@code VkDebugUtilsMessengerEXT} handle in which the created object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateDebugUtilsMessengerEXT(VkInstance instance, @NativeType("VkDebugUtilsMessengerCreateInfoEXT const *") VkDebugUtilsMessengerCreateInfoEXT pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDebugUtilsMessengerEXT *") LongBuffer pMessenger) {
        if (CHECKS) {
            check(pMessenger, 1);
        }
        return nvkCreateDebugUtilsMessengerEXT(instance, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pMessenger));
    }

    // --- [ vkDestroyDebugUtilsMessengerEXT ] ---

    /** Unsafe version of: {@link #vkDestroyDebugUtilsMessengerEXT DestroyDebugUtilsMessengerEXT} */
    public static void nvkDestroyDebugUtilsMessengerEXT(VkInstance instance, long messenger, long pAllocator) {
        long __functionAddress = instance.getCapabilities().vkDestroyDebugUtilsMessengerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(instance.address(), messenger, pAllocator, __functionAddress);
    }

    /**
     * Destroy a debug messenger object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy a {@code VkDebugUtilsMessengerEXT} object, call:</p>
     * 
     * <pre><code>
     * void vkDestroyDebugUtilsMessengerEXT(
     *     VkInstance                                  instance,
     *     VkDebugUtilsMessengerEXT                    messenger,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code messenger} was created, a compatible set of callbacks <b>must</b> be provided here</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code messenger} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
     * <li>If {@code messenger} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code messenger} <b>must</b> be a valid {@code VkDebugUtilsMessengerEXT} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>If {@code messenger} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code instance}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code messenger} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <p>The application <b>must</b> ensure that {@link #vkDestroyDebugUtilsMessengerEXT DestroyDebugUtilsMessengerEXT} is not executed in parallel with any Vulkan command that is also called with {@code instance} or child of {@code instance} as the dispatchable argument.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param instance   the instance where the callback was created.
     * @param messenger  the {@code VkDebugUtilsMessengerEXT} object to destroy. {@code messenger} is an externally synchronized object and <b>must</b> not be used on more than one thread at a time. This means that {@code vkDestroyDebugUtilsMessengerEXT} <b>must</b> not be called when a callback is active.
     * @param pAllocator controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyDebugUtilsMessengerEXT(VkInstance instance, @NativeType("VkDebugUtilsMessengerEXT") long messenger, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyDebugUtilsMessengerEXT(instance, messenger, memAddressSafe(pAllocator));
    }

    // --- [ vkSubmitDebugUtilsMessageEXT ] ---

    /** Unsafe version of: {@link #vkSubmitDebugUtilsMessageEXT SubmitDebugUtilsMessageEXT} */
    public static void nvkSubmitDebugUtilsMessageEXT(VkInstance instance, int messageSeverity, int messageTypes, long pCallbackData) {
        long __functionAddress = instance.getCapabilities().vkSubmitDebugUtilsMessageEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugUtilsMessengerCallbackDataEXT.validate(pCallbackData);
        }
        callPPV(instance.address(), messageSeverity, messageTypes, pCallbackData, __functionAddress);
    }

    /**
     * Inject a message into a debug stream.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>There may be times that a user wishes to intentionally submit a debug message. To do this, call:</p>
     * 
     * <pre><code>
     * void vkSubmitDebugUtilsMessageEXT(
     *     VkInstance                                  instance,
     *     VkDebugUtilsMessageSeverityFlagBitsEXT      messageSeverity,
     *     VkDebugUtilsMessageTypeFlagsEXT             messageTypes,
     *     const VkDebugUtilsMessengerCallbackDataEXT* pCallbackData);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The call will propagate through the layers and generate callback(s) as indicated by the message’s flags. The parameters are passed on to the callback in addition to the {@code pUserData} value that was defined at the time the messenger was registered.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The {@code objectType} member of each element of {@code pCallbackData→pObjects} <b>must</b> not be {@link VK10#VK_OBJECT_TYPE_UNKNOWN OBJECT_TYPE_UNKNOWN}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
     * <li>{@code messageSeverity} <b>must</b> be a valid {@code VkDebugUtilsMessageSeverityFlagBitsEXT} value</li>
     * <li>{@code messageTypes} <b>must</b> be a valid combination of {@code VkDebugUtilsMessageTypeFlagBitsEXT} values</li>
     * <li>{@code messageTypes} <b>must</b> not be 0</li>
     * <li>{@code pCallbackData} <b>must</b> be a valid pointer to a valid {@link VkDebugUtilsMessengerCallbackDataEXT} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDebugUtilsMessengerCallbackDataEXT}</p>
     *
     * @param instance        the debug stream’s {@code VkInstance}.
     * @param messageSeverity a {@code VkDebugUtilsMessageSeverityFlagBitsEXT} value specifying the severity of this event/message.
     * @param messageTypes    a bitmask of {@code VkDebugUtilsMessageTypeFlagBitsEXT} specifying which type of event(s) to identify with this message.
     * @param pCallbackData   contains all the callback related data in the {@link VkDebugUtilsMessengerCallbackDataEXT} structure.
     */
    public static void vkSubmitDebugUtilsMessageEXT(VkInstance instance, @NativeType("VkDebugUtilsMessageSeverityFlagBitsEXT") int messageSeverity, @NativeType("VkDebugUtilsMessageTypeFlagsEXT") int messageTypes, @NativeType("VkDebugUtilsMessengerCallbackDataEXT const *") VkDebugUtilsMessengerCallbackDataEXT pCallbackData) {
        nvkSubmitDebugUtilsMessageEXT(instance, messageSeverity, messageTypes, pCallbackData.address());
    }

    /** Array version of: {@link #vkCreateDebugUtilsMessengerEXT CreateDebugUtilsMessengerEXT} */
    @NativeType("VkResult")
    public static int vkCreateDebugUtilsMessengerEXT(VkInstance instance, @NativeType("VkDebugUtilsMessengerCreateInfoEXT const *") VkDebugUtilsMessengerCreateInfoEXT pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDebugUtilsMessengerEXT *") long[] pMessenger) {
        long __functionAddress = instance.getCapabilities().vkCreateDebugUtilsMessengerEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pMessenger, 1);
            VkDebugUtilsMessengerCreateInfoEXT.validate(pCreateInfo.address());
        }
        return callPPPPI(instance.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pMessenger, __functionAddress);
    }

}