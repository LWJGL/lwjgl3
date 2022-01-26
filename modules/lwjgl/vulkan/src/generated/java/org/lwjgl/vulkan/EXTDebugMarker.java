/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * The {@code VK_EXT_debug_marker} extension is a device extension. It introduces concepts of object naming and tagging, for better tracking of Vulkan objects, as well as additional commands for recording annotations of named sections of a workload to aid organization and offline analysis in external tools.
 * 
 * <h5>Examples</h5>
 * 
 * <p><b>Example 1</b></p>
 * 
 * <p>Associate a name with an image, for easier debugging in external tools or with validation layers that can print a friendly name when referring to objects in error messages.</p>
 * 
 * <pre><code>
 *     extern VkDevice device;
 *     extern VkImage image;
 * 
 *     // Must call extension functions through a function pointer:
 *     PFN_vkDebugMarkerSetObjectNameEXT pfnDebugMarkerSetObjectNameEXT = (PFN_vkDebugMarkerSetObjectNameEXT)vkGetDeviceProcAddr(device, "vkDebugMarkerSetObjectNameEXT");
 * 
 *     // Set a name on the image
 *     const VkDebugMarkerObjectNameInfoEXT imageNameInfo =
 *     {
 *         VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT, // sType
 *         NULL,                                           // pNext
 *         VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT,          // objectType
 *         (uint64_t)image,                                // object
 *         "Brick Diffuse Texture",                        // pObjectName
 *     };
 * 
 *     pfnDebugMarkerSetObjectNameEXT(device, &amp;imageNameInfo);
 * 
 *     // A subsequent error might print:
 *     //   Image 'Brick Diffuse Texture' (0xc0dec0dedeadbeef) is used in a
 *     //   command buffer with no memory bound to it.</code></pre>
 * 
 * <p><b>Example 2</b></p>
 * 
 * <p>Annotating regions of a workload with naming information so that offline analysis tools can display a more usable visualisation of the commands submitted.</p>
 * 
 * <pre><code>
 *     extern VkDevice device;
 *     extern VkCommandBuffer commandBuffer;
 * 
 *     // Must call extension functions through a function pointer:
 *     PFN_vkCmdDebugMarkerBeginEXT pfnCmdDebugMarkerBeginEXT = (PFN_vkCmdDebugMarkerBeginEXT)vkGetDeviceProcAddr(device, "vkCmdDebugMarkerBeginEXT");
 *     PFN_vkCmdDebugMarkerEndEXT pfnCmdDebugMarkerEndEXT = (PFN_vkCmdDebugMarkerEndEXT)vkGetDeviceProcAddr(device, "vkCmdDebugMarkerEndEXT");
 *     PFN_vkCmdDebugMarkerInsertEXT pfnCmdDebugMarkerInsertEXT = (PFN_vkCmdDebugMarkerInsertEXT)vkGetDeviceProcAddr(device, "vkCmdDebugMarkerInsertEXT");
 * 
 *     // Describe the area being rendered
 *     const VkDebugMarkerMarkerInfoEXT houseMarker =
 *     {
 *         VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT, // sType
 *         NULL,                                           // pNext
 *         "Brick House",                                  // pMarkerName
 *         { 1.0f, 0.0f, 0.0f, 1.0f },                     // color
 *     };
 * 
 *     // Start an annotated group of calls under the 'Brick House' name
 *     pfnCmdDebugMarkerBeginEXT(commandBuffer, &amp;houseMarker);
 *     {
 *         // A mutable structure for each part being rendered
 *         VkDebugMarkerMarkerInfoEXT housePartMarker =
 *         {
 *             VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT, // sType
 *             NULL,                                           // pNext
 *             NULL,                                           // pMarkerName
 *             { 0.0f, 0.0f, 0.0f, 0.0f },                     // color
 *         };
 * 
 *         // Set the name and insert the marker
 *         housePartMarker.pMarkerName = "Walls";
 *         pfnCmdDebugMarkerInsertEXT(commandBuffer, &amp;housePartMarker);
 * 
 *         // Insert the drawcall for the walls
 *         vkCmdDrawIndexed(commandBuffer, 1000, 1, 0, 0, 0);
 * 
 *         // Insert a recursive region for two sets of windows
 *         housePartMarker.pMarkerName = "Windows";
 *         pfnCmdDebugMarkerBeginEXT(commandBuffer, &amp;housePartMarker);
 *         {
 *             vkCmdDrawIndexed(commandBuffer, 75, 6, 1000, 0, 0);
 *             vkCmdDrawIndexed(commandBuffer, 100, 2, 1450, 0, 0);
 *         }
 *         pfnCmdDebugMarkerEndEXT(commandBuffer);
 * 
 *         housePartMarker.pMarkerName = "Front Door";
 *         pfnCmdDebugMarkerInsertEXT(commandBuffer, &amp;housePartMarker);
 * 
 *         vkCmdDrawIndexed(commandBuffer, 350, 1, 1650, 0, 0);
 * 
 *         housePartMarker.pMarkerName = "Roof";
 *         pfnCmdDebugMarkerInsertEXT(commandBuffer, &amp;housePartMarker);
 * 
 *         vkCmdDrawIndexed(commandBuffer, 500, 1, 2000, 0, 0);
 *     }
 *     // End the house annotation started above
 *     pfnCmdDebugMarkerEndEXT(commandBuffer);</code></pre>
 * 
 * <h5>VK_EXT_debug_marker</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_debug_marker}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>23</dd>
 * <dt><b>Revision</b></dt>
 * <dd>4</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link EXTDebugReport VK_EXT_debug_report}</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to {@link EXTDebugUtils VK_EXT_debug_utils} extension</li>
 * </ul></dd>
 * <dt><b>Special Use</b></dt>
 * <dd><ul>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#extendingvulkan-compatibility-specialuse">Debugging tools</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Baldur Karlsson <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_debug_marker]%20@baldurk%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_debug_marker%20extension%3E%3E">baldurk</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-01-31</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Baldur Karlsson</li>
 * <li>Dan Ginsburg, Valve</li>
 * <li>Jon Ashburn, LunarG</li>
 * <li>Kyle Spagnoli, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class EXTDebugMarker {

    /** The extension specification version. */
    public static final int VK_EXT_DEBUG_MARKER_SPEC_VERSION = 4;

    /** The extension name. */
    public static final String VK_EXT_DEBUG_MARKER_EXTENSION_NAME = "VK_EXT_debug_marker";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT = 1000022000,
        VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT  = 1000022001,
        VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT      = 1000022002;

    protected EXTDebugMarker() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkDebugMarkerSetObjectTagEXT ] ---

    /** Unsafe version of: {@link #vkDebugMarkerSetObjectTagEXT DebugMarkerSetObjectTagEXT} */
    public static int nvkDebugMarkerSetObjectTagEXT(VkDevice device, long pTagInfo) {
        long __functionAddress = device.getCapabilities().vkDebugMarkerSetObjectTagEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugMarkerObjectTagInfoEXT.validate(pTagInfo);
        }
        return callPPI(device.address(), pTagInfo, __functionAddress);
    }

    /**
     * Attach arbitrary data to an object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>In addition to setting a name for an object, debugging and validation layers may have uses for additional binary data on a per-object basis that has no other place in the Vulkan API. For example, a {@code VkShaderModule} could have additional debugging data attached to it to aid in offline shader tracing. To attach data to an object, call:</p>
     * 
     * <pre><code>
     * VkResult vkDebugMarkerSetObjectTagEXT(
     *     VkDevice                                    device,
     *     const VkDebugMarkerObjectTagInfoEXT*        pTagInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pTagInfo} <b>must</b> be a valid pointer to a valid {@link VkDebugMarkerObjectTagInfoEXT} structure</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code pTagInfo→object} <b>must</b> be externally synchronized</li>
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
     * <p>{@link VkDebugMarkerObjectTagInfoEXT}</p>
     *
     * @param device   the device that created the object.
     * @param pTagInfo a pointer to a {@link VkDebugMarkerObjectTagInfoEXT} structure specifying the parameters of the tag to attach to the object.
     */
    @NativeType("VkResult")
    public static int vkDebugMarkerSetObjectTagEXT(VkDevice device, @NativeType("VkDebugMarkerObjectTagInfoEXT const *") VkDebugMarkerObjectTagInfoEXT pTagInfo) {
        return nvkDebugMarkerSetObjectTagEXT(device, pTagInfo.address());
    }

    // --- [ vkDebugMarkerSetObjectNameEXT ] ---

    /** Unsafe version of: {@link #vkDebugMarkerSetObjectNameEXT DebugMarkerSetObjectNameEXT} */
    public static int nvkDebugMarkerSetObjectNameEXT(VkDevice device, long pNameInfo) {
        long __functionAddress = device.getCapabilities().vkDebugMarkerSetObjectNameEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugMarkerObjectNameInfoEXT.validate(pNameInfo);
        }
        return callPPI(device.address(), pNameInfo, __functionAddress);
    }

    /**
     * Give a user-friendly name to an object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>An object can be given a user-friendly name by calling:</p>
     * 
     * <pre><code>
     * VkResult vkDebugMarkerSetObjectNameEXT(
     *     VkDevice                                    device,
     *     const VkDebugMarkerObjectNameInfoEXT*       pNameInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pNameInfo} <b>must</b> be a valid pointer to a valid {@link VkDebugMarkerObjectNameInfoEXT} structure</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code pNameInfo→object} <b>must</b> be externally synchronized</li>
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
     * <p>{@link VkDebugMarkerObjectNameInfoEXT}</p>
     *
     * @param device    the device that created the object.
     * @param pNameInfo a pointer to a {@link VkDebugMarkerObjectNameInfoEXT} structure specifying the parameters of the name to set on the object.
     */
    @NativeType("VkResult")
    public static int vkDebugMarkerSetObjectNameEXT(VkDevice device, @NativeType("VkDebugMarkerObjectNameInfoEXT const *") VkDebugMarkerObjectNameInfoEXT pNameInfo) {
        return nvkDebugMarkerSetObjectNameEXT(device, pNameInfo.address());
    }

    // --- [ vkCmdDebugMarkerBeginEXT ] ---

    /** Unsafe version of: {@link #vkCmdDebugMarkerBeginEXT CmdDebugMarkerBeginEXT} */
    public static void nvkCmdDebugMarkerBeginEXT(VkCommandBuffer commandBuffer, long pMarkerInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDebugMarkerBeginEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugMarkerMarkerInfoEXT.validate(pMarkerInfo);
        }
        callPPV(commandBuffer.address(), pMarkerInfo, __functionAddress);
    }

    /**
     * Open a command buffer marker region.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>A marker region can be opened by calling:</p>
     * 
     * <pre><code>
     * void vkCmdDebugMarkerBeginEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkDebugMarkerMarkerInfoEXT*           pMarkerInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pMarkerInfo} <b>must</b> be a valid pointer to a valid {@link VkDebugMarkerMarkerInfoEXT} structure</li>
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
     * <p>{@link VkDebugMarkerMarkerInfoEXT}</p>
     *
     * @param commandBuffer the command buffer into which the command is recorded.
     * @param pMarkerInfo   a pointer to a {@link VkDebugMarkerMarkerInfoEXT} structure specifying the parameters of the marker region to open.
     */
    public static void vkCmdDebugMarkerBeginEXT(VkCommandBuffer commandBuffer, @NativeType("VkDebugMarkerMarkerInfoEXT const *") VkDebugMarkerMarkerInfoEXT pMarkerInfo) {
        nvkCmdDebugMarkerBeginEXT(commandBuffer, pMarkerInfo.address());
    }

    // --- [ vkCmdDebugMarkerEndEXT ] ---

    /**
     * Close a command buffer marker region.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>A marker region can be closed by calling:</p>
     * 
     * <pre><code>
     * void vkCmdDebugMarkerEndEXT(
     *     VkCommandBuffer                             commandBuffer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>An application <b>may</b> open a marker region in one command buffer and close it in another, or otherwise split marker regions across multiple command buffers or multiple queue submissions. When viewed from the linear series of submissions to a single queue, the calls to {@code vkCmdDebugMarkerBeginEXT} and {@code vkCmdDebugMarkerEndEXT} <b>must</b> be matched and balanced.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>There <b>must</b> be an outstanding {@link #vkCmdDebugMarkerBeginEXT CmdDebugMarkerBeginEXT} command prior to the {@code vkCmdDebugMarkerEndEXT} on the queue that {@code commandBuffer} is submitted to</li>
     * <li>If {@code commandBuffer} is a secondary command buffer, there <b>must</b> be an outstanding {@link #vkCmdDebugMarkerBeginEXT CmdDebugMarkerBeginEXT} command recorded to {@code commandBuffer} that has not previously been ended by a call to {@link #vkCmdDebugMarkerEndEXT CmdDebugMarkerEndEXT}</li>
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
    public static void vkCmdDebugMarkerEndEXT(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDebugMarkerEndEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), __functionAddress);
    }

    // --- [ vkCmdDebugMarkerInsertEXT ] ---

    /** Unsafe version of: {@link #vkCmdDebugMarkerInsertEXT CmdDebugMarkerInsertEXT} */
    public static void nvkCmdDebugMarkerInsertEXT(VkCommandBuffer commandBuffer, long pMarkerInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDebugMarkerInsertEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkDebugMarkerMarkerInfoEXT.validate(pMarkerInfo);
        }
        callPPV(commandBuffer.address(), pMarkerInfo, __functionAddress);
    }

    /**
     * Insert a marker label into a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>A single marker label can be inserted into a command buffer by calling:</p>
     * 
     * <pre><code>
     * void vkCmdDebugMarkerInsertEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkDebugMarkerMarkerInfoEXT*           pMarkerInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pMarkerInfo} <b>must</b> be a valid pointer to a valid {@link VkDebugMarkerMarkerInfoEXT} structure</li>
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
     * <p>{@link VkDebugMarkerMarkerInfoEXT}</p>
     *
     * @param commandBuffer the command buffer into which the command is recorded.
     * @param pMarkerInfo   a pointer to a {@link VkDebugMarkerMarkerInfoEXT} structure specifying the parameters of the marker to insert.
     */
    public static void vkCmdDebugMarkerInsertEXT(VkCommandBuffer commandBuffer, @NativeType("VkDebugMarkerMarkerInfoEXT const *") VkDebugMarkerMarkerInfoEXT pMarkerInfo) {
        nvkCmdDebugMarkerInsertEXT(commandBuffer, pMarkerInfo.address());
    }

}