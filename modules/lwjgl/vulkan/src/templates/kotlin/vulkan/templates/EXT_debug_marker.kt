/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_debug_marker = "EXTDebugMarker".nativeClassVK("EXT_debug_marker", type = "device", postfix = "EXT") {
    documentation =
        """
        The {@code VK_EXT_debug_marker} extension is a device extension. It introduces concepts of object naming and tagging, for better tracking of Vulkan objects, as well as additional commands for recording annotations of named sections of a workload to aid organization and offline analysis in external tools.

        <h5>Examples</h5>
        <b>Example 1</b>

        Associate a name with an image, for easier debugging in external tools or with validation layers that can print a friendly name when referring to objects in error messages.

        <pre><code>
￿    extern VkDevice device;
￿    extern VkImage image;
￿
￿    // Must call extension functions through a function pointer:
￿    PFN_vkDebugMarkerSetObjectNameEXT pfnDebugMarkerSetObjectNameEXT = (PFN_vkDebugMarkerSetObjectNameEXT)vkGetDeviceProcAddr(device, "vkDebugMarkerSetObjectNameEXT");
￿
￿    // Set a name on the image
￿    const VkDebugMarkerObjectNameInfoEXT imageNameInfo =
￿    {
￿        VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT, // sType
￿        NULL,                                           // pNext
￿        VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT,          // objectType
￿        (uint64_t)image,                                // object
￿        "Brick Diffuse Texture",                        // pObjectName
￿    };
￿
￿    pfnDebugMarkerSetObjectNameEXT(device, &amp;imageNameInfo);
￿
￿    // A subsequent error might print:
￿    //   Image 'Brick Diffuse Texture' (0xc0dec0dedeadbeef) is used in a
￿    //   command buffer with no memory bound to it.</code></pre>

        <b>Example 2</b>

        Annotating regions of a workload with naming information so that offline analysis tools can display a more usable visualisation of the commands submitted.

        <pre><code>
￿    extern VkDevice device;
￿    extern VkCommandBuffer commandBuffer;
￿
￿    // Must call extension functions through a function pointer:
￿    PFN_vkCmdDebugMarkerBeginEXT pfnCmdDebugMarkerBeginEXT = (PFN_vkCmdDebugMarkerBeginEXT)vkGetDeviceProcAddr(device, "vkCmdDebugMarkerBeginEXT");
￿    PFN_vkCmdDebugMarkerEndEXT pfnCmdDebugMarkerEndEXT = (PFN_vkCmdDebugMarkerEndEXT)vkGetDeviceProcAddr(device, "vkCmdDebugMarkerEndEXT");
￿    PFN_vkCmdDebugMarkerInsertEXT pfnCmdDebugMarkerInsertEXT = (PFN_vkCmdDebugMarkerInsertEXT)vkGetDeviceProcAddr(device, "vkCmdDebugMarkerInsertEXT");
￿
￿    // Describe the area being rendered
￿    const VkDebugMarkerMarkerInfoEXT houseMarker =
￿    {
￿        VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT, // sType
￿        NULL,                                           // pNext
￿        "Brick House",                                  // pMarkerName
￿        { 1.0f, 0.0f, 0.0f, 1.0f },                     // color
￿    };
￿
￿    // Start an annotated group of calls under the 'Brick House' name
￿    pfnCmdDebugMarkerBeginEXT(commandBuffer, &amp;houseMarker);
￿    {
￿        // A mutable structure for each part being rendered
￿        VkDebugMarkerMarkerInfoEXT housePartMarker =
￿        {
￿            VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT, // sType
￿            NULL,                                           // pNext
￿            NULL,                                           // pMarkerName
￿            { 0.0f, 0.0f, 0.0f, 0.0f },                     // color
￿        };
￿
￿        // Set the name and insert the marker
￿        housePartMarker.pMarkerName = "Walls";
￿        pfnCmdDebugMarkerInsertEXT(commandBuffer, &amp;housePartMarker);
￿
￿        // Insert the drawcall for the walls
￿        vkCmdDrawIndexed(commandBuffer, 1000, 1, 0, 0, 0);
￿
￿        // Insert a recursive region for two sets of windows
￿        housePartMarker.pMarkerName = "Windows";
￿        pfnCmdDebugMarkerBeginEXT(commandBuffer, &amp;housePartMarker);
￿        {
￿            vkCmdDrawIndexed(commandBuffer, 75, 6, 1000, 0, 0);
￿            vkCmdDrawIndexed(commandBuffer, 100, 2, 1450, 0, 0);
￿        }
￿        pfnCmdDebugMarkerEndEXT(commandBuffer);
￿
￿        housePartMarker.pMarkerName = "Front Door";
￿        pfnCmdDebugMarkerInsertEXT(commandBuffer, &amp;housePartMarker);
￿
￿        vkCmdDrawIndexed(commandBuffer, 350, 1, 1650, 0, 0);
￿
￿        housePartMarker.pMarkerName = "Roof";
￿        pfnCmdDebugMarkerInsertEXT(commandBuffer, &amp;housePartMarker);
￿
￿        vkCmdDrawIndexed(commandBuffer, 500, 1, 2000, 0, 0);
￿    }
￿    // End the house annotation started above
￿    pfnCmdDebugMarkerEndEXT(commandBuffer);</code></pre>

        <h5>VK_EXT_debug_marker</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_debug_marker}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>23</dd>

            <dt><b>Revision</b></dt>
            <dd>4</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link EXTDebugReport VK_EXT_debug_report}</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to {@link EXTDebugUtils VK_EXT_debug_utils} extension</li>
            </ul></dd>

            <dt><b>Special Use</b></dt>
            <dd><ul>
                <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#extendingvulkan-compatibility-specialuse">Debugging tools</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Baldur Karlsson <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_debug_marker]%20@baldurk%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_debug_marker%20extension%3E%3E">baldurk</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-01-31</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Baldur Karlsson</li>
                <li>Dan Ginsburg, Valve</li>
                <li>Jon Ashburn, LunarG</li>
                <li>Kyle Spagnoli, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_DEBUG_MARKER_SPEC_VERSION".."4"
    )

    StringConstant(
        "The extension name.",

        "EXT_DEBUG_MARKER_EXTENSION_NAME".."VK_EXT_debug_marker"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT".."1000022000",
        "STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT".."1000022001",
        "STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT".."1000022002"
    )

    VkResult(
        "DebugMarkerSetObjectTagEXT",
        """
        Attach arbitrary data to an object.

        <h5>C Specification</h5>
        In addition to setting a name for an object, debugging and validation layers may have uses for additional binary data on a per-object basis that has no other place in the Vulkan API. For example, a {@code VkShaderModule} could have additional debugging data attached to it to aid in offline shader tracing. To attach data to an object, call:

        <pre><code>
￿VkResult vkDebugMarkerSetObjectTagEXT(
￿    VkDevice                                    device,
￿    const VkDebugMarkerObjectTagInfoEXT*        pTagInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pTagInfo} <b>must</b> be a valid pointer to a valid ##VkDebugMarkerObjectTagInfoEXT structure</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code pTagInfo→object} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkDebugMarkerObjectTagInfoEXT
        """,

        VkDevice("device", "the device that created the object."),
        VkDebugMarkerObjectTagInfoEXT.const.p("pTagInfo", "a pointer to a ##VkDebugMarkerObjectTagInfoEXT structure specifying the parameters of the tag to attach to the object.")
    )

    VkResult(
        "DebugMarkerSetObjectNameEXT",
        """
        Give a user-friendly name to an object.

        <h5>C Specification</h5>
        An object can be given a user-friendly name by calling:

        <pre><code>
￿VkResult vkDebugMarkerSetObjectNameEXT(
￿    VkDevice                                    device,
￿    const VkDebugMarkerObjectNameInfoEXT*       pNameInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pNameInfo} <b>must</b> be a valid pointer to a valid ##VkDebugMarkerObjectNameInfoEXT structure</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code pNameInfo→object} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkDebugMarkerObjectNameInfoEXT
        """,

        VkDevice("device", "the device that created the object."),
        VkDebugMarkerObjectNameInfoEXT.const.p("pNameInfo", "a pointer to a ##VkDebugMarkerObjectNameInfoEXT structure specifying the parameters of the name to set on the object.")
    )

    void(
        "CmdDebugMarkerBeginEXT",
        """
        Open a command buffer marker region.

        <h5>C Specification</h5>
        A marker region can be opened by calling:

        <pre><code>
￿void vkCmdDebugMarkerBeginEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkDebugMarkerMarkerInfoEXT*           pMarkerInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pMarkerInfo} <b>must</b> be a valid pointer to a valid ##VkDebugMarkerMarkerInfoEXT structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkDebugMarkerMarkerInfoEXT
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkDebugMarkerMarkerInfoEXT.const.p("pMarkerInfo", "a pointer to a ##VkDebugMarkerMarkerInfoEXT structure specifying the parameters of the marker region to open.")
    )

    void(
        "CmdDebugMarkerEndEXT",
        """
        Close a command buffer marker region.

        <h5>C Specification</h5>
        A marker region can be closed by calling:

        <pre><code>
￿void vkCmdDebugMarkerEndEXT(
￿    VkCommandBuffer                             commandBuffer);</code></pre>

        <h5>Description</h5>
        An application <b>may</b> open a marker region in one command buffer and close it in another, or otherwise split marker regions across multiple command buffers or multiple queue submissions. When viewed from the linear series of submissions to a single queue, the calls to {@code vkCmdDebugMarkerBeginEXT} and {@code vkCmdDebugMarkerEndEXT} <b>must</b> be matched and balanced.

        <h5>Valid Usage</h5>
        <ul>
            <li>There <b>must</b> be an outstanding #CmdDebugMarkerBeginEXT() command prior to the {@code vkCmdDebugMarkerEndEXT} on the queue that {@code commandBuffer} is submitted to</li>
            <li>If {@code commandBuffer} is a secondary command buffer, there <b>must</b> be an outstanding #CmdDebugMarkerBeginEXT() command recorded to {@code commandBuffer} that has not previously been ended by a call to #CmdDebugMarkerEndEXT()</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded.")
    )

    void(
        "CmdDebugMarkerInsertEXT",
        """
        Insert a marker label into a command buffer.

        <h5>C Specification</h5>
        A single marker label can be inserted into a command buffer by calling:

        <pre><code>
￿void vkCmdDebugMarkerInsertEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkDebugMarkerMarkerInfoEXT*           pMarkerInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pMarkerInfo} <b>must</b> be a valid pointer to a valid ##VkDebugMarkerMarkerInfoEXT structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkDebugMarkerMarkerInfoEXT
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkDebugMarkerMarkerInfoEXT.const.p("pMarkerInfo", "a pointer to a ##VkDebugMarkerMarkerInfoEXT structure specifying the parameters of the marker to insert.")
    )
}