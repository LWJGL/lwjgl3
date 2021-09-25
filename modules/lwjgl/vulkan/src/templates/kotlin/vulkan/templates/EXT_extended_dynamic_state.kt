/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_extended_dynamic_state = "EXTExtendedDynamicState".nativeClassVK("EXT_extended_dynamic_state", type = "device", postfix = EXT) {
    documentation =
        """
        This extension adds some more dynamic state to support applications that need to reduce the number of pipeline state objects they compile and bind.

        <h5>VK_EXT_extended_dynamic_state</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_extended_dynamic_state}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>268</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_extended_dynamic_state] @pdaniell-nv%0A&lt;&lt;Here describe the issue or question you have about the VK_EXT_extended_dynamic_state extension&gt;&gt;">pdaniell-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-12-09</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Dan Ginsburg, Valve Corporation</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Hans-Kristian Arntzen, Valve Corporation</li>
                <li>Jan-Harald Fredriksen, Arm Limited</li>
                <li>Jason Ekstrand, Intel</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Jesse Hall, Google</li>
                <li>Philip Rebohle, Valve Corporation</li>
                <li>Stuart Smith, Imagination Technologies</li>
                <li>Tobias Hector, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_EXTENDED_DYNAMIC_STATE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_EXTENDED_DYNAMIC_STATE_EXTENSION_NAME".."VK_EXT_extended_dynamic_state"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT".."1000267000"
    )

    EnumConstant(
        "Extends {@code VkDynamicState}.",

        "DYNAMIC_STATE_CULL_MODE_EXT".."1000267000",
        "DYNAMIC_STATE_FRONT_FACE_EXT".."1000267001",
        "DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT".."1000267002",
        "DYNAMIC_STATE_VIEWPORT_WITH_COUNT_EXT".."1000267003",
        "DYNAMIC_STATE_SCISSOR_WITH_COUNT_EXT".."1000267004",
        "DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT".."1000267005",
        "DYNAMIC_STATE_DEPTH_TEST_ENABLE_EXT".."1000267006",
        "DYNAMIC_STATE_DEPTH_WRITE_ENABLE_EXT".."1000267007",
        "DYNAMIC_STATE_DEPTH_COMPARE_OP_EXT".."1000267008",
        "DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE_EXT".."1000267009",
        "DYNAMIC_STATE_STENCIL_TEST_ENABLE_EXT".."1000267010",
        "DYNAMIC_STATE_STENCIL_OP_EXT".."1000267011"
    )

    void(
        "CmdSetCullModeEXT",
        """
        Set the cull mode property.

        <h5>C Specification</h5>
        If the bound graphics pipeline state was created with the #DYNAMIC_STATE_CULL_MODE_EXT dynamic state enabled then the cull mode is set dynamically by calling:

        <pre><code>
￿void vkCmdSetCullModeEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkCullModeFlags                             cullMode);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code cullMode} <b>must</b> be a valid combination of {@code VkCullModeFlagBits} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCullModeFlags("cullMode", "specifies the cull mode property to use for drawing.")
    )

    void(
        "CmdSetFrontFaceEXT",
        """
        Set the front face property.

        <h5>C Specification</h5>
        If the bound graphics pipeline state was created with the #DYNAMIC_STATE_FRONT_FACE_EXT dynamic state enabled then the front face property is set dynamically by calling:

        <pre><code>
￿void vkCmdSetFrontFaceEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkFrontFace                                 frontFace);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code frontFace} <b>must</b> be a valid {@code VkFrontFace} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkFrontFace("frontFace", "specifies the front face property to use for drawing.")
    )

    void(
        "CmdSetPrimitiveTopologyEXT",
        """
        Set the primitive topology state.

        <h5>C Specification</h5>
        The primitive topology is specified by the ##VkPipelineInputAssemblyStateCreateInfo{@code ::topology} property of the currently active pipeline, if the pipeline was not created with #DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT enabled.

        Otherwise, the primitive topology is set by calling:

        <pre><code>
￿void vkCmdSetPrimitiveTopologyEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPrimitiveTopology                         primitiveTopology);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code primitiveTopology} <b>must</b> be a valid {@code VkPrimitiveTopology} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkPrimitiveTopology("primitiveTopology", "")
    )

    void(
        "CmdSetViewportWithCountEXT",
        """
        Set the viewport count and viewports.

        <h5>C Specification</h5>
        If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT_EXT dynamic state enabled then the viewport count and viewport transformation parameters are set dynamically by calling:

        <pre><code>
￿void vkCmdSetViewportWithCountEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    viewportCount,
￿    const VkViewport*                           pViewports);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
            <li>{@code viewportCount} <b>must</b> be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-multiViewport">multiple viewports</a> feature is not enabled, {@code viewportCount} <b>must</b> be 1</li>
            <li>{@code commandBuffer} <b>must</b> not have ##VkCommandBufferInheritanceViewportScissorInfoNV{@code ::viewportScissor2D} enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pViewports} <b>must</b> be a valid pointer to an array of {@code viewportCount} valid ##VkViewport structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>{@code viewportCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkViewport
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        AutoSize("pViewports")..uint32_t("viewportCount", "specifies the viewport count."),
        VkViewport.const.p("pViewports", "specifies the viewports to use for drawing.")
    )

    void(
        "CmdSetScissorWithCountEXT",
        """
        Set the scissor count and scissors.

        <h5>C Specification</h5>
        If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SCISSOR_WITH_COUNT_EXT dynamic state enabled then the scissor count and scissor rectangular bounds are set dynamically by calling:

        <pre><code>
￿void vkCmdSetScissorWithCountEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    scissorCount,
￿    const VkRect2D*                             pScissors);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
            <li>{@code scissorCount} <b>must</b> be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-multiViewport">multiple viewports</a> feature is not enabled, {@code scissorCount} <b>must</b> be 1</li>
            <li>The {@code x} and {@code y} members of {@code offset} member of any element of {@code pScissors} <b>must</b> be greater than or equal to 0</li>
            <li>Evaluation of <code>(offset.x + extent.width)</code> <b>must</b> not cause a signed integer addition overflow for any element of {@code pScissors}</li>
            <li>Evaluation of <code>(offset.y + extent.height)</code> <b>must</b> not cause a signed integer addition overflow for any element of {@code pScissors}</li>
            <li>{@code commandBuffer} <b>must</b> not have ##VkCommandBufferInheritanceViewportScissorInfoNV{@code ::viewportScissor2D} enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pScissors} <b>must</b> be a valid pointer to an array of {@code scissorCount} ##VkRect2D structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>{@code scissorCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkRect2D
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        AutoSize("pScissors")..uint32_t("scissorCount", "specifies the scissor count."),
        VkRect2D.const.p("pScissors", "specifies the scissors to use for drawing.")
    )

    void(
        "CmdBindVertexBuffers2EXT",
        """
        Bind vertex buffers to a command buffer.

        <h5>C Specification</h5>
        Alternatively, to bind vertex buffers, along with their sizes and strides, to a command buffer for use in subsequent drawing commands, call:

        <pre><code>
￿void vkCmdBindVertexBuffers2EXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstBinding,
￿    uint32_t                                    bindingCount,
￿    const VkBuffer*                             pBuffers,
￿    const VkDeviceSize*                         pOffsets,
￿    const VkDeviceSize*                         pSizes,
￿    const VkDeviceSize*                         pStrides);</code></pre>

        <h5>Description</h5>
        The values taken from elements <code>i</code> of {@code pBuffers} and {@code pOffsets} replace the current state for the vertex input binding <code>firstBinding + i</code>, for <code>i</code> in <code>[0, bindingCount)</code>. The vertex input binding is updated to start at the offset indicated by {@code pOffsets}[i] from the start of the buffer {@code pBuffers}[i]. If {@code pSizes} is not {@code NULL} then {@code pSizes}[i] specifies the bound size of the vertex buffer starting from the corresponding elements of {@code pBuffers}[i] plus {@code pOffsets}[i]. All vertex input attributes that use each of these bindings will use these updated addresses in their address calculations for subsequent drawing commands. If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-nullDescriptor">nullDescriptor</a> feature is enabled, elements of {@code pBuffers} <b>can</b> be #NULL_HANDLE, and <b>can</b> be used by the vertex shader. If a vertex input attribute is bound to a vertex input binding that is #NULL_HANDLE, the values taken from memory are considered to be zero, and missing G, B, or A components are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fxvertex-input-extraction">filled with <code>(0,0,1)</code></a>.

        If the bound pipeline state object was created with the #DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT dynamic state enabled then {@code pStrides}[i] specifies the byte stride between consecutive elements within the corresponding buffer. In this case the ##VkVertexInputBindingDescription{@code ::stride} state from the pipeline state object is ignored.

        If the bound pipeline state object was also created with the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled then #CmdSetVertexInputEXT() <b>can</b> be used instead of {@code vkCmdBindVertexBuffers2EXT} to set the stride.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code firstBinding} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindings}</li>
            <li>The sum of {@code firstBinding} and {@code bindingCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindings}</li>
            <li>All elements of {@code pOffsets} <b>must</b> be less than the size of the corresponding element in {@code pBuffers}</li>
            <li>If {@code pSizes} is not {@code NULL}, all elements of {@code pOffsets} plus {@code pSizes} <b>must</b> be less than or equal to the size of the corresponding element in {@code pBuffers}</li>
            <li>All elements of {@code pBuffers} <b>must</b> have been created with the #BUFFER_USAGE_VERTEX_BUFFER_BIT flag</li>
            <li>Each element of {@code pBuffers} that is non-sparse <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-nullDescriptor">nullDescriptor</a> feature is not enabled, all elements of {@code pBuffers} <b>must</b> not be #NULL_HANDLE</li>
            <li>If an element of {@code pBuffers} is #NULL_HANDLE, then the corresponding element of {@code pOffsets} <b>must</b> be zero</li>
            <li>If {@code pStrides} is not {@code NULL} each element of {@code pStrides} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindingStride}</li>
            <li>If {@code pStrides} is not {@code NULL} each element of {@code pStrides} <b>must</b> be either 0 or greater than or equal to the maximum extent of all vertex input attributes fetched from the corresponding binding, where the extent is calculated as the ##VkVertexInputAttributeDescription{@code ::offset} plus ##VkVertexInputAttributeDescription{@code ::format} size</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pBuffers} <b>must</b> be a valid pointer to an array of {@code bindingCount} valid or #NULL_HANDLE {@code VkBuffer} handles</li>
            <li>{@code pOffsets} <b>must</b> be a valid pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
            <li>If {@code pSizes} is not {@code NULL}, {@code pSizes} <b>must</b> be a valid pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
            <li>If {@code pStrides} is not {@code NULL}, {@code pStrides} <b>must</b> be a valid pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>If any of {@code pSizes}, or {@code pStrides} are not {@code NULL}, {@code bindingCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and the elements of {@code pBuffers} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        uint32_t("firstBinding", "the index of the first vertex input binding whose state is updated by the command."),
        AutoSize("pBuffers", "pOffsets", "pSizes", "pStrides")..uint32_t("bindingCount", "the number of vertex input bindings whose state is updated by the command."),
        VkBuffer.const.p("pBuffers", "a pointer to an array of buffer handles."),
        VkDeviceSize.const.p("pOffsets", "a pointer to an array of buffer offsets."),
        nullable..VkDeviceSize.const.p("pSizes", "{@code NULL} or a pointer to an array of the size in bytes of vertex data bound from {@code pBuffers}."),
        nullable..VkDeviceSize.const.p("pStrides", "{@code NULL} or a pointer to an array of buffer strides.")
    )

    void(
        "CmdSetDepthTestEnableEXT",
        """
        Set the depth test enable for a command buffer.

        <h5>C Specification</h5>
        To dynamically enable or disable the depth test, call:

        <pre><code>
￿void vkCmdSetDepthTestEnableEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    depthTestEnable);</code></pre>

        <h5>Description</h5>
        This command sets the state for a given draw when the graphics pipeline is created with #DYNAMIC_STATE_DEPTH_TEST_ENABLE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("depthTestEnable", "specifies if the depth test is enabled.")
    )

    void(
        "CmdSetDepthWriteEnableEXT",
        """
        Set the depth write enable for the command buffer.

        <h5>C Specification</h5>
        To dynamically enable or disable depth writes, call:

        <pre><code>
￿void vkCmdSetDepthWriteEnableEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    depthWriteEnable);</code></pre>

        <h5>Description</h5>
        This command sets the state for a given draw when the graphics pipeline is created with #DYNAMIC_STATE_DEPTH_WRITE_ENABLE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("depthWriteEnable", "specifies if depth writes are enabled.")
    )

    void(
        "CmdSetDepthCompareOpEXT",
        """
        Set the depth comparison operator for the command buffer.

        <h5>C Specification</h5>
        To dynamically set the depth compare operations, call:

        <pre><code>
￿void vkCmdSetDepthCompareOpEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkCompareOp                                 depthCompareOp);</code></pre>

        <h5>Description</h5>
        This command sets the state for a given draw when the graphics pipeline is created with #DYNAMIC_STATE_DEPTH_COMPARE_OP_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code depthCompareOp} <b>must</b> be a valid {@code VkCompareOp} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCompareOp("depthCompareOp", "specifies the depth comparison operator.")
    )

    void(
        "CmdSetDepthBoundsTestEnableEXT",
        """
        Set the depth bounds test enable for a command buffer.

        <h5>C Specification</h5>
        To dynamically enable or disable the depth bounds test:

        <pre><code>
￿void vkCmdSetDepthBoundsTestEnableEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    depthBoundsTestEnable);</code></pre>

        <h5>Description</h5>
        This command sets the state for a given draw when the graphics pipeline is created with #DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("depthBoundsTestEnable", "specifies if the depth bounds test is enabled.")
    )

    void(
        "CmdSetStencilTestEnableEXT",
        """
        Set the stencil test enable for the command buffer.

        <h5>C Specification</h5>
        To dynamically enable or disable the stencil test, call:

        <pre><code>
￿void vkCmdSetStencilTestEnableEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    stencilTestEnable);</code></pre>

        <h5>Description</h5>
        This command sets the state for a given draw when the graphics pipeline is created with #DYNAMIC_STATE_STENCIL_TEST_ENABLE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("stencilTestEnable", "specifies if the stencil test is enabled.")
    )

    void(
        "CmdSetStencilOpEXT",
        """
        Set the stencil operation for the command buffer.

        <h5>C Specification</h5>
        To dynamically set the stencil operations, call:

        <pre><code>
￿void vkCmdSetStencilOpEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkStencilFaceFlags                          faceMask,
￿    VkStencilOp                                 failOp,
￿    VkStencilOp                                 passOp,
￿    VkStencilOp                                 depthFailOp,
￿    VkCompareOp                                 compareOp);</code></pre>

        <h5>Description</h5>
        This command sets the state for a given draw when the graphics pipeline is created with #DYNAMIC_STATE_STENCIL_OP_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-extendedDynamicState">extendedDynamicState</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code faceMask} <b>must</b> be a valid combination of {@code VkStencilFaceFlagBits} values</li>
            <li>{@code faceMask} <b>must</b> not be 0</li>
            <li>{@code failOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
            <li>{@code passOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
            <li>{@code depthFailOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
            <li>{@code compareOp} <b>must</b> be a valid {@code VkCompareOp} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkStencilFaceFlags("faceMask", "a bitmask of {@code VkStencilFaceFlagBits} specifying the set of stencil state for which to update the stencil operation."),
        VkStencilOp("failOp", "a {@code VkStencilOp} value specifying the action performed on samples that fail the stencil test."),
        VkStencilOp("passOp", "a {@code VkStencilOp} value specifying the action performed on samples that pass both the depth and stencil tests."),
        VkStencilOp("depthFailOp", "a {@code VkStencilOp} value specifying the action performed on samples that pass the stencil test and fail the depth test."),
        VkCompareOp("compareOp", "a {@code VkCompareOp} value specifying the comparison operator used in the stencil test.")
    )
}