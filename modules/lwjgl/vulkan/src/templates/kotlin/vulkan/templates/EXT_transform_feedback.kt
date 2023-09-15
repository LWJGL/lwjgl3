/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_transform_feedback = "EXTTransformFeedback".nativeClassVK("EXT_transform_feedback", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension adds transform feedback to the Vulkan API by exposing the SPIR-V {@code TransformFeedback} and {@code GeometryStreams} capabilities to capture vertex, tessellation or geometry shader outputs to one or more buffers. It adds API functionality to bind transform feedback buffers to capture the primitives emitted by the graphics pipeline from SPIR-V outputs decorated for transform feedback. The transform feedback capture can be paused and resumed by way of storing and retrieving a byte counter. The captured data can be drawn again where the vertex count is derived from the byte counter without CPU intervention. If the implementation is capable, a vertex stream other than zero can be rasterized.

        All these features are designed to match the full capabilities of OpenGL core transform feedback functionality and beyond. Many of the features are optional to allow base OpenGL ES GPUs to also implement this extension.

        The primary purpose of the functionality exposed by this extension is to support translation layers from other 3D APIs. This functionality is not considered forward looking, and is not expected to be promoted to a KHR extension or to core Vulkan. Unless this is needed for translation, it is recommended that developers use alternative techniques of using the GPU to process and capture vertex data.

        <h5>VK_EXT_transform_feedback</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_transform_feedback}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>29</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>

            <dt><b>Special Uses</b></dt>
            <dd><ul>
                <li><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#extendingvulkan-compatibility-specialuse">OpenGL / ES support</a></li>
                <li><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#extendingvulkan-compatibility-specialuse">D3D support</a></li>
                <li><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#extendingvulkan-compatibility-specialuse">Developer tools</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_transform_feedback]%20@pdaniell-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_transform_feedback%20extension*">pdaniell-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2018-10-09</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Baldur Karlsson, Valve</li>
                <li>Boris Zanin, Mobica</li>
                <li>Daniel Rakos, AMD</li>
                <li>Donald Scorgie, Imagination</li>
                <li>Henri Verbeet, CodeWeavers</li>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Faith Ekstrand, Intel</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Jesse Barker, Unity</li>
                <li>Jesse Hall, Google</li>
                <li>Pierre-Loup Griffais, Valve</li>
                <li>Philip Rebohle, DXVK</li>
                <li>Ruihao Zhang, Qualcomm</li>
                <li>Samuel Pitoiset, Valve</li>
                <li>Slawomir Grajewski, Intel</li>
                <li>Stu Smith, Imagination Technologies</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_TRANSFORM_FEEDBACK_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_TRANSFORM_FEEDBACK_EXTENSION_NAME".."VK_EXT_transform_feedback"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT".."1000028000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT".."1000028001",
        "STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT".."1000028002"
    )

    EnumConstant(
        "Extends {@code VkQueryType}.",

        "QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT".."1000028004"
    )

    EnumConstant(
        "Extends {@code VkBufferUsageFlagBits}.",

        "BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT".enum(0x00000800),
        "BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT".enum(0x00001000)
    )

    EnumConstant(
        "Extends {@code VkAccessFlagBits}.",

        "ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT".enum(0x02000000),
        "ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT".enum(0x04000000),
        "ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT".enum(0x08000000)
    )

    EnumConstant(
        "Extends {@code VkPipelineStageFlagBits}.",

        "PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT".enum(0x01000000)
    )

    void(
        "CmdBindTransformFeedbackBuffersEXT",
        """
        Bind transform feedback buffers to a command buffer.

        <h5>C Specification</h5>
        To bind transform feedback buffers to a command buffer for use in subsequent drawing commands, call:

        <pre><code>
￿void vkCmdBindTransformFeedbackBuffersEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstBinding,
￿    uint32_t                                    bindingCount,
￿    const VkBuffer*                             pBuffers,
￿    const VkDeviceSize*                         pOffsets,
￿    const VkDeviceSize*                         pSizes);</code></pre>

        <h5>Description</h5>
        The values taken from elements <code>i</code> of {@code pBuffers}, {@code pOffsets} and {@code pSizes} replace the current state for the transform feedback binding <code>firstBinding + i</code>, for <code>i</code> in <code>[0, bindingCount)</code>. The transform feedback binding is updated to start at the offset indicated by {@code pOffsets}[i] from the start of the buffer {@code pBuffers}[i].

        <h5>Valid Usage</h5>
        <ul>
            <li>##VkPhysicalDeviceTransformFeedbackFeaturesEXT{@code ::transformFeedback} <b>must</b> be enabled</li>
            <li>{@code firstBinding} <b>must</b> be less than ##VkPhysicalDeviceTransformFeedbackPropertiesEXT{@code ::maxTransformFeedbackBuffers}</li>
            <li>The sum of {@code firstBinding} and {@code bindingCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceTransformFeedbackPropertiesEXT{@code ::maxTransformFeedbackBuffers}</li>
            <li>All elements of {@code pOffsets} <b>must</b> be less than the size of the corresponding element in {@code pBuffers}</li>
            <li>All elements of {@code pOffsets} <b>must</b> be a multiple of 4</li>
            <li>All elements of {@code pBuffers} <b>must</b> have been created with the #BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT flag</li>
            <li>If the optional {@code pSize} array is specified, each element of {@code pSizes} <b>must</b> either be #WHOLE_SIZE, or be less than or equal to ##VkPhysicalDeviceTransformFeedbackPropertiesEXT{@code ::maxTransformFeedbackBufferSize}</li>
            <li>All elements of {@code pSizes} <b>must</b> be either #WHOLE_SIZE, or less than or equal to the size of the corresponding buffer in {@code pBuffers}</li>
            <li>All elements of {@code pOffsets} plus {@code pSizes}, where the {@code pSizes}, element is not #WHOLE_SIZE, <b>must</b> be less than or equal to the size of the corresponding buffer in {@code pBuffers}</li>
            <li>Each element of {@code pBuffers} that is non-sparse <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>Transform feedback <b>must</b> not be active when the {@code vkCmdBindTransformFeedbackBuffersEXT} command is recorded</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pBuffers} <b>must</b> be a valid pointer to an array of {@code bindingCount} valid {@code VkBuffer} handles</li>
            <li>{@code pOffsets} <b>must</b> be a valid pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code bindingCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and the elements of {@code pBuffers} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        uint32_t("firstBinding", "the index of the first transform feedback binding whose state is updated by the command."),
        AutoSize("pBuffers", "pOffsets", "pSizes")..uint32_t("bindingCount", "the number of transform feedback bindings whose state is updated by the command."),
        VkBuffer.const.p("pBuffers", "a pointer to an array of buffer handles."),
        VkDeviceSize.const.p("pOffsets", "a pointer to an array of buffer offsets."),
        nullable..VkDeviceSize.const.p("pSizes", "{@code NULL} or a pointer to an array of {@code VkDeviceSize} buffer sizes, specifying the maximum number of bytes to capture to the corresponding transform feedback buffer. If {@code pSizes} is {@code NULL}, or the value of the {@code pSizes} array element is #WHOLE_SIZE, then the maximum number of bytes captured will be the size of the corresponding buffer minus the buffer offset.")
    )

    void(
        "CmdBeginTransformFeedbackEXT",
        """
        Make transform feedback active in the command buffer.

        <h5>C Specification</h5>
        Transform feedback for specific transform feedback buffers is made active by calling:

        <pre><code>
￿void vkCmdBeginTransformFeedbackEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstCounterBuffer,
￿    uint32_t                                    counterBufferCount,
￿    const VkBuffer*                             pCounterBuffers,
￿    const VkDeviceSize*                         pCounterBufferOffsets);</code></pre>

        <h5>Description</h5>
        The active transform feedback buffers will capture primitives emitted from the corresponding {@code XfbBuffer} in the bound graphics pipeline. Any {@code XfbBuffer} emitted that does not output to an active transform feedback buffer will not be captured.

        <h5>Valid Usage</h5>
        <ul>
            <li>##VkPhysicalDeviceTransformFeedbackFeaturesEXT{@code ::transformFeedback} <b>must</b> be enabled</li>
            <li>Transform feedback <b>must</b> not be active</li>
            <li>{@code firstCounterBuffer} <b>must</b> be less than ##VkPhysicalDeviceTransformFeedbackPropertiesEXT{@code ::maxTransformFeedbackBuffers}</li>
            <li>The sum of {@code firstCounterBuffer} and {@code counterBufferCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceTransformFeedbackPropertiesEXT{@code ::maxTransformFeedbackBuffers}</li>
            <li>If {@code counterBufferCount} is not 0, and {@code pCounterBuffers} is not {@code NULL}, {@code pCounterBuffers} <b>must</b> be a valid pointer to an array of {@code counterBufferCount} {@code VkBuffer} handles that are either valid or #NULL_HANDLE</li>
            <li>For each buffer handle in the array, if it is not #NULL_HANDLE it <b>must</b> reference a buffer large enough to hold 4 bytes at the corresponding offset from the {@code pCounterBufferOffsets} array</li>
            <li>If {@code pCounterBuffer} is {@code NULL}, then {@code pCounterBufferOffsets} <b>must</b> also be {@code NULL}</li>
            <li>For each buffer handle in the {@code pCounterBuffers} array that is not #NULL_HANDLE it <b>must</b> have been created with a {@code usage} value containing #BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT</li>
            <li>A valid graphics pipeline <b>must</b> be bound to #PIPELINE_BIND_POINT_GRAPHICS</li>
            <li>The last <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-graphics-subsets-pre-rasterization">pre-rasterization shader stage</a> of the bound graphics pipeline <b>must</b> have been declared with the {@code Xfb} execution mode</li>
            <li>Transform feedback <b>must</b> not be made active in a render pass instance with multiview enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>If {@code counterBufferCount} is not 0, and {@code pCounterBufferOffsets} is not {@code NULL}, {@code pCounterBufferOffsets} <b>must</b> be a valid pointer to an array of {@code counterBufferCount} {@code VkDeviceSize} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>Both of {@code commandBuffer}, and the elements of {@code pCounterBuffers} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        uint32_t("firstCounterBuffer", "the index of the first transform feedback buffer corresponding to {@code pCounterBuffers}[0] and {@code pCounterBufferOffsets}[0]."),
        AutoSize("pCounterBuffers", "pCounterBufferOffsets")..uint32_t("counterBufferCount", "the size of the {@code pCounterBuffers} and {@code pCounterBufferOffsets} arrays."),
        nullable..VkBuffer.const.p("pCounterBuffers", "{@code NULL} or a pointer to an array of {@code VkBuffer} handles to counter buffers. Each buffer contains a 4 byte integer value representing the byte offset from the start of the corresponding transform feedback buffer from where to start capturing vertex data. If the byte offset stored to the counter buffer location was done using #CmdEndTransformFeedbackEXT() it can be used to resume transform feedback from the previous location. If {@code pCounterBuffers} is {@code NULL}, then transform feedback will start capturing vertex data to byte offset zero in all bound transform feedback buffers. For each element of {@code pCounterBuffers} that is #NULL_HANDLE, transform feedback will start capturing vertex data to byte zero in the corresponding bound transform feedback buffer."),
        nullable..VkDeviceSize.const.p("pCounterBufferOffsets", "{@code NULL} or a pointer to an array of {@code VkDeviceSize} values specifying offsets within each of the {@code pCounterBuffers} where the counter values were previously written. The location in each counter buffer at these offsets <b>must</b> be large enough to contain 4 bytes of data. This data is the number of bytes captured by the previous transform feedback to this buffer. If {@code pCounterBufferOffsets} is {@code NULL}, then it is assumed the offsets are zero.")
    )

    void(
        "CmdEndTransformFeedbackEXT",
        """
        Make transform feedback inactive in the command buffer.

        <h5>C Specification</h5>
        Transform feedback for specific transform feedback buffers is made inactive by calling:

        <pre><code>
￿void vkCmdEndTransformFeedbackEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstCounterBuffer,
￿    uint32_t                                    counterBufferCount,
￿    const VkBuffer*                             pCounterBuffers,
￿    const VkDeviceSize*                         pCounterBufferOffsets);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>##VkPhysicalDeviceTransformFeedbackFeaturesEXT{@code ::transformFeedback} <b>must</b> be enabled</li>
            <li>Transform feedback <b>must</b> be active</li>
            <li>{@code firstCounterBuffer} <b>must</b> be less than ##VkPhysicalDeviceTransformFeedbackPropertiesEXT{@code ::maxTransformFeedbackBuffers}</li>
            <li>The sum of {@code firstCounterBuffer} and {@code counterBufferCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceTransformFeedbackPropertiesEXT{@code ::maxTransformFeedbackBuffers}</li>
            <li>If {@code counterBufferCount} is not 0, and {@code pCounterBuffers} is not {@code NULL}, {@code pCounterBuffers} <b>must</b> be a valid pointer to an array of {@code counterBufferCount} {@code VkBuffer} handles that are either valid or #NULL_HANDLE</li>
            <li>For each buffer handle in the array, if it is not #NULL_HANDLE it <b>must</b> reference a buffer large enough to hold 4 bytes at the corresponding offset from the {@code pCounterBufferOffsets} array</li>
            <li>If {@code pCounterBuffer} is {@code NULL}, then {@code pCounterBufferOffsets} <b>must</b> also be {@code NULL}</li>
            <li>For each buffer handle in the {@code pCounterBuffers} array that is not #NULL_HANDLE it <b>must</b> have been created with a {@code usage} value containing #BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>If {@code counterBufferCount} is not 0, and {@code pCounterBufferOffsets} is not {@code NULL}, {@code pCounterBufferOffsets} <b>must</b> be a valid pointer to an array of {@code counterBufferCount} {@code VkDeviceSize} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>Both of {@code commandBuffer}, and the elements of {@code pCounterBuffers} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        uint32_t("firstCounterBuffer", "the index of the first transform feedback buffer corresponding to {@code pCounterBuffers}[0] and {@code pCounterBufferOffsets}[0]."),
        AutoSize("pCounterBuffers", "pCounterBufferOffsets")..uint32_t("counterBufferCount", "the size of the {@code pCounterBuffers} and {@code pCounterBufferOffsets} arrays."),
        nullable..VkBuffer.const.p("pCounterBuffers", "{@code NULL} or a pointer to an array of {@code VkBuffer} handles to counter buffers. The counter buffers are used to record the current byte positions of each transform feedback buffer where the next vertex output data would be captured. This <b>can</b> be used by a subsequent #CmdBeginTransformFeedbackEXT() call to resume transform feedback capture from this position. It can also be used by #CmdDrawIndirectByteCountEXT() to determine the vertex count of the draw call."),
        nullable..VkDeviceSize.const.p("pCounterBufferOffsets", "{@code NULL} or a pointer to an array of {@code VkDeviceSize} values specifying offsets within each of the {@code pCounterBuffers} where the counter values can be written. The location in each counter buffer at these offsets <b>must</b> be large enough to contain 4 bytes of data. The data stored at this location is the byte offset from the start of the transform feedback buffer binding where the next vertex data would be written. If {@code pCounterBufferOffsets} is {@code NULL}, then it is assumed the offsets are zero.")
    )

    void(
        "CmdBeginQueryIndexedEXT",
        """
        Begin an indexed query.

        <h5>C Specification</h5>
        To begin an indexed query, call:

        <pre><code>
￿void vkCmdBeginQueryIndexedEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    query,
￿    VkQueryControlFlags                         flags,
￿    uint32_t                                    index);</code></pre>

        <h5>Description</h5>
        The {@code vkCmdBeginQueryIndexedEXT} command operates the same as the #CmdBeginQuery() command, except that it also accepts a query type specific {@code index} parameter.

        This command defines an execution dependency between other query commands that reference the same query index.

        The first <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes all commands which reference the queries in {@code queryPool} indicated by {@code query} and {@code index} that occur earlier in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>.

        The second <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes all commands which reference the queries in {@code queryPool} indicated by {@code query} and {@code index} that occur later in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>.

        The operation of this command happens after the first scope and happens before the second scope.

        <h5>Valid Usage</h5>
        <ul>
            <li>All queries used by the command <b>must</b> be <em>unavailable</em></li>
            <li>The {@code queryType} used to create {@code queryPool} <b>must</b> not be #QUERY_TYPE_TIMESTAMP</li>
            <li>The {@code queryType} used to create {@code queryPool} <b>must</b> not be #QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR or #QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR</li>
            <li>The {@code queryType} used to create {@code queryPool} <b>must</b> not be #QUERY_TYPE_ACCELERATION_STRUCTURE_SIZE_KHR or #QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_BOTTOM_LEVEL_POINTERS_KHR</li>
            <li>The {@code queryType} used to create {@code queryPool} <b>must</b> not be #QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-occlusionQueryPrecise">{@code occlusionQueryPrecise}</a> feature is not enabled, or the {@code queryType} used to create {@code queryPool} was not #QUERY_TYPE_OCCLUSION, {@code flags} <b>must</b> not contain #QUERY_CONTROL_PRECISE_BIT</li>
            <li>{@code query} <b>must</b> be less than the number of queries in {@code queryPool}</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_OCCLUSION, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_PIPELINE_STATISTICS and any of the {@code pipelineStatistics} indicate graphics operations, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_PIPELINE_STATISTICS and any of the {@code pipelineStatistics} indicate compute operations, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
            <li>If called within a render pass instance, the sum of {@code query} and the number of bits set in the current subpass’s view mask <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_RESULT_STATUS_ONLY_KHR, then the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> have been created with a queue family index that supports <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#queries-result-status-only">result status queries</a>, as indicated by ##VkQueueFamilyQueryResultStatusPropertiesKHR{@code ::queryResultStatusSupport}</li>
            <li>If there is a bound video session, then there <b>must</b> be no <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#queries-operation-active">active</a> queries</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_RESULT_STATUS_ONLY_KHR and there is a bound video session, then {@code queryPool} <b>must</b> have been created with a ##VkVideoProfileInfoKHR structure included in the {@code pNext} chain of ##VkQueryPoolCreateInfo identical to the one specified in ##VkVideoSessionCreateInfoKHR{@code ::pVideoProfile} the bound video session was created with</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_VIDEO_ENCODE_FEEDBACK_KHR, then the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-encode-operations">video encode operations</a></li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_VIDEO_ENCODE_FEEDBACK_KHR, then there <b>must</b> be a bound video session</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_VIDEO_ENCODE_FEEDBACK_KHR and there is a bound video session, then {@code queryPool} <b>must</b> have been created with a ##VkVideoProfileInfoKHR structure included in the {@code pNext} chain of ##VkQueryPoolCreateInfo identical to the one specified in ##VkVideoSessionCreateInfoKHR{@code ::pVideoProfile} the bound video session was created with</li>
            <li>If the {@code queryType} used to create {@code queryPool} was not #QUERY_TYPE_RESULT_STATUS_ONLY_KHR or #QUERY_TYPE_VIDEO_ENCODE_FEEDBACK_KHR, then there <b>must</b> be no bound video session</li>
            <li>If the {@code queryPool} was created with the same {@code queryType} as that of another <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#queries-operation-active">active</a> query within {@code commandBuffer}, then {@code index} <b>must</b> not match the index used for the active query</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT the {@code index} parameter <b>must</b> be less than ##VkPhysicalDeviceTransformFeedbackPropertiesEXT{@code ::maxTransformFeedbackStreams}</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_PRIMITIVES_GENERATED_EXT the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_PRIMITIVES_GENERATED_EXT the {@code index} parameter <b>must</b> be less than ##VkPhysicalDeviceTransformFeedbackPropertiesEXT{@code ::maxTransformFeedbackStreams}</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_PRIMITIVES_GENERATED_EXT and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-primitivesGeneratedQueryWithNonZeroStreams">{@code primitivesGeneratedQueryWithNonZeroStreams}</a> feature is not enabled, the {@code index} parameter <b>must</b> be zero</li>
            <li>If the {@code queryType} used to create {@code queryPool} was not #QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT and not #QUERY_TYPE_PRIMITIVES_GENERATED_EXT, the {@code index} <b>must</b> be zero</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_PRIMITIVES_GENERATED_EXT then <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-primitivesGeneratedQuery">{@code primitivesGeneratedQuery}</a> <b>must</b> be enabled</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT then ##VkPhysicalDeviceTransformFeedbackPropertiesEXT{@code ::transformFeedbackQueries} <b>must</b> be supported</li>
            <li>The {@code queryType} used to create {@code queryPool} <b>must</b> not be #QUERY_TYPE_MESH_PRIMITIVES_GENERATED_EXT</li>
        </ul>

        <ul>
            <li>If {@code queryPool} was created with a {@code queryType} of #QUERY_TYPE_PERFORMANCE_QUERY_KHR, then the ##VkQueryPoolPerformanceCreateInfoKHR{@code ::queueFamilyIndex} {@code queryPool} was created with <b>must</b> equal the queue family index of the {@code VkCommandPool} that {@code commandBuffer} was allocated from</li>
            <li>If {@code queryPool} was created with a {@code queryType} of #QUERY_TYPE_PERFORMANCE_QUERY_KHR, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#profiling-lock">profiling lock</a> <b>must</b> have been held before #BeginCommandBuffer() was called on {@code commandBuffer}</li>
            <li>If {@code queryPool} was created with a {@code queryType} of #QUERY_TYPE_PERFORMANCE_QUERY_KHR and one of the counters used to create {@code queryPool} was #PERFORMANCE_COUNTER_SCOPE_COMMAND_BUFFER_KHR, the query begin <b>must</b> be the first recorded command in {@code commandBuffer}</li>
            <li>If {@code queryPool} was created with a {@code queryType} of #QUERY_TYPE_PERFORMANCE_QUERY_KHR and one of the counters used to create {@code queryPool} was #PERFORMANCE_COUNTER_SCOPE_RENDER_PASS_KHR, the begin command <b>must</b> not be recorded within a render pass instance</li>
            <li>If {@code queryPool} was created with a {@code queryType} of #QUERY_TYPE_PERFORMANCE_QUERY_KHR and another query pool with a {@code queryType} #QUERY_TYPE_PERFORMANCE_QUERY_KHR has been used within {@code commandBuffer}, its parent primary command buffer or secondary command buffer recorded within the same parent primary command buffer as {@code commandBuffer}, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-performanceCounterMultipleQueryPools">{@code performanceCounterMultipleQueryPools}</a> feature <b>must</b> be enabled</li>
            <li>If {@code queryPool} was created with a {@code queryType} of #QUERY_TYPE_PERFORMANCE_QUERY_KHR, this command <b>must</b> not be recorded in a command buffer that, either directly or through secondary command buffers, also contains a {@code vkCmdResetQueryPool} command affecting the same query</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkQueryControlFlagBits} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, compute, decode, or encode operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>Both of {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute Decode Encode</td><td>Action State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        #CmdBeginQuery(), #CmdEndQuery(), #CmdEndQueryIndexedEXT()
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which this command will be recorded."),
        VkQueryPool("queryPool", "the query pool that will manage the results of the query."),
        uint32_t("query", "the query index within the query pool that will contain the results."),
        VkQueryControlFlags("flags", "a bitmask of {@code VkQueryControlFlagBits} specifying constraints on the types of queries that <b>can</b> be performed."),
        uint32_t("index", "the query type specific index. When the query type is #QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT or #QUERY_TYPE_PRIMITIVES_GENERATED_EXT, the index represents the vertex stream.")
    )

    void(
        "CmdEndQueryIndexedEXT",
        """
        Ends a query.

        <h5>C Specification</h5>
        To end an indexed query after the set of desired drawing or dispatching commands is recorded, call:

        <pre><code>
￿void vkCmdEndQueryIndexedEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    query,
￿    uint32_t                                    index);</code></pre>

        <h5>Description</h5>
        The command completes the query in {@code queryPool} identified by {@code query} and {@code index}, and marks it as available.

        The {@code vkCmdEndQueryIndexedEXT} command operates the same as the #CmdEndQuery() command, except that it also accepts a query type specific {@code index} parameter.

        This command defines an execution dependency between other query commands that reference the same query index.

        The first <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes all commands which reference the queries in {@code queryPool} indicated by {@code query} that occur earlier in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>.

        The second <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes only the operation of this command.

        <h5>Valid Usage</h5>
        <ul>
            <li>All queries used by the command <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#queries-operation-active">active</a></li>
            <li>{@code query} <b>must</b> be less than the number of queries in {@code queryPool}</li>
            <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
            <li>If {@code vkCmdEndQueryIndexedEXT} is called within a render pass instance, the sum of {@code query} and the number of bits set in the current subpass’s view mask <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT or #QUERY_TYPE_PRIMITIVES_GENERATED_EXT, the {@code index} parameter <b>must</b> be less than ##VkPhysicalDeviceTransformFeedbackPropertiesEXT{@code ::maxTransformFeedbackStreams}</li>
            <li>If the {@code queryType} used to create {@code queryPool} was not #QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT and not #QUERY_TYPE_PRIMITIVES_GENERATED_EXT, the {@code index} <b>must</b> be zero</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT or #QUERY_TYPE_PRIMITIVES_GENERATED_EXT, {@code index} <b>must</b> equal the {@code index} used to begin the query</li>
        </ul>

        <ul>
            <li>If called within a subpass of a render pass instance, the corresponding {@code vkCmdBeginQuery}* command <b>must</b> have been called previously within the same subpass</li>
            <li>If called outside of a render pass instance, the corresponding {@code vkCmdBeginQuery}* command <b>must</b> have been called outside of a render pass instance</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, compute, decode, or encode operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>Both of {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute Decode Encode</td><td>Action State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        #CmdBeginQuery(), #CmdBeginQueryIndexedEXT(), #CmdEndQuery()
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which this command will be recorded."),
        VkQueryPool("queryPool", "the query pool that is managing the results of the query."),
        uint32_t("query", "the query index within the query pool where the result is stored."),
        uint32_t("index", "the query type specific index.")
    )

    void(
        "CmdDrawIndirectByteCountEXT",
        """
        Draw primitives with indirect parameters where the vertex count is derived from the counter byte value in the counter buffer.

        <h5>C Specification</h5>
        To record a non-indexed draw call, where the vertex count is based on a byte count read from a buffer and the passed in vertex stride parameter, call:

        <pre><code>
￿void vkCmdDrawIndirectByteCountEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    instanceCount,
￿    uint32_t                                    firstInstance,
￿    VkBuffer                                    counterBuffer,
￿    VkDeviceSize                                counterBufferOffset,
￿    uint32_t                                    counterOffset,
￿    uint32_t                                    vertexStride);</code></pre>

        <h5>Description</h5>
        When the command is executed, primitives are assembled in the same way as done with #CmdDraw() except the {@code vertexCount} is calculated based on the byte count read from {@code counterBuffer} at offset {@code counterBufferOffset}. The assembled primitives execute the bound graphics pipeline.

        The effective {@code vertexCount} is calculated as follows:

        <pre><code>
￿const uint32_t * counterBufferPtr = (const uint8_t *)counterBuffer.address + counterBufferOffset;
￿vertexCount = floor(max(0, (*counterBufferPtr - counterOffset)) / vertexStride);</code></pre>

        The effective {@code firstVertex} is zero.

        <h5>Valid Usage</h5>
        <ul>
            <li>If a {@code VkSampler} created with {@code magFilter} or {@code minFilter} equal to #FILTER_LINEAR and {@code compareEnable} equal to #FALSE is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
            <li>If a {@code VkSampler} created with {@code mipmapMode} equal to #SAMPLER_MIPMAP_MODE_LINEAR and {@code compareEnable} equal to #FALSE is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
            <li>If a {@code VkImageView} is sampled with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#textures-depth-compare-operation">depth comparison</a>, the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT</li>
            <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT</li>
            <li>If a #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER descriptor is accessed using atomic operations as a result of this command, then the storage texel buffer’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-buffer-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT</li>
            <li>If a {@code VkImageView} is sampled with #FILTER_CUBIC_EXT as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT</li>
            <li>If the {@link EXTFilterCubic VK_EXT_filter_cubic} extension is not enabled and any {@code VkImageView} is sampled with #FILTER_CUBIC_EXT as a result of this command, it <b>must</b> not have a {@code VkImageViewType} of #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, or #IMAGE_VIEW_TYPE_CUBE_ARRAY</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubic} returned by #GetPhysicalDeviceImageFormatProperties2()</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT with a reduction mode of either #SAMPLER_REDUCTION_MODE_MIN or #SAMPLER_REDUCTION_MODE_MAX as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubicMinmax} returned by #GetPhysicalDeviceImageFormatProperties2()</li>
            <li>
                If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-filter-cubic-range-clamp">{@code cubicRangeClamp}</a> feature is not enabled, then any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT as a result of this command
                <dl>
            <dt><b>must</b> not have a ##VkSamplerReductionModeCreateInfo</dt>
                    <dd>{@code reductionMode} equal to #SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM</dd>
                </dl>
            </li>
            <li>Any {@code VkImageView} being sampled with a ##VkSamplerReductionModeCreateInfo{@code ::reductionMode} equal to #SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM as a result of this command <b>must</b> sample with #FILTER_CUBIC_EXT</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-filter-cubic-weight-selection">{@code selectableCubicWeights}</a> feature is not enabled, then any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT as a result of this command <b>must</b> have ##VkSamplerCubicWeightsCreateInfoQCOM{@code ::cubicWeights} equal to #CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM</li>
            <li>Any {@code VkImage} created with a ##VkImageCreateInfo{@code ::flags} containing #IMAGE_CREATE_CORNER_SAMPLED_BIT_NV sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of #SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE</li>
            <li>For any {@code VkImageView} being written as a storage image where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT</li>
            <li>For any {@code VkImageView} being read as a storage image where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT</li>
            <li>For any {@code VkBufferView} being written as a storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkFormatProperties3">buffer features</a> <b>must</b> contain #FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT</li>
            <li>Any {@code VkBufferView} being read as a storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown} then the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkFormatProperties3">buffer features</a> <b>must</b> contain #FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT</li>
            <li>For each set <em>n</em> that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a>, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} or {@code VkDescriptorSetLayout} array that was used to create the current {@code VkPipeline} or {@code VkShaderEXT}, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>For each push constant that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a>, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} or {@code VkDescriptorSetLayout} and ##VkPushConstantRange arrays used to create the current {@code VkPipeline} or {@code VkShaderEXT}, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-maintenance4">{@code maintenance4}</a> feature is not enabled, then for each push constant that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a>, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} or {@code VkDescriptorSetLayout} and ##VkPushConstantRange arrays used to create the current {@code VkPipeline} or {@code VkShaderEXT}, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>Descriptors in each bound descriptor set, specified via #CmdBindDescriptorSets(), <b>must</b> be valid if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command and the bound {@code VkPipeline} was not created with #PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT</li>
            <li>If the descriptors used by the {@code VkPipeline} bound to the pipeline bind point were specified via #CmdBindDescriptorSets(), the bound {@code VkPipeline} <b>must</b> have been created without #PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT</li>
            <li>Descriptors in bound descriptor buffers, specified via #CmdSetDescriptorBufferOffsetsEXT(), <b>must</b> be valid if they are dynamically used by the {@code VkPipeline} bound to the pipeline bind point used by this command and the bound {@code VkPipeline} was created with #PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT</li>
            <li>Descriptors in bound descriptor buffers, specified via #CmdSetDescriptorBufferOffsetsEXT(), <b>must</b> be valid if they are dynamically used by any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command</li>
            <li>If the descriptors used by the {@code VkPipeline} bound to the pipeline bind point were specified via #CmdSetDescriptorBufferOffsetsEXT(), the bound {@code VkPipeline} <b>must</b> have been created with #PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT</li>
            <li>If a descriptor is dynamically used with a {@code VkPipeline} created with #PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT, the descriptor memory <b>must</b> be resident</li>
            <li>If a descriptor is dynamically used with a {@code VkShaderEXT} created with a {@code VkDescriptorSetLayout} that was created with #DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT, the descriptor memory <b>must</b> be resident</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature is not enabled, a valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> is enabled, either a valid pipeline <b>must</b> be bound to the pipeline bind point used by this command, or a valid combination of valid and #NULL_HANDLE shader objects <b>must</b> be bound to every supported shader stage corresponding to the pipeline bind point used by this command</li>
            <li>If a pipeline is bound to the pipeline bind point used by this command, there <b>must</b> not have been any calls to dynamic state setting commands for any state not specified as dynamic in the {@code VkPipeline} object bound to the pipeline bind point used by this command, since that pipeline was bound</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
            <li>If any stage of the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, and that stage was created without enabling either #PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT or #PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT for {@code uniformBuffers}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, that stage <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, and any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If any stage of the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, and that stage was created without enabling either #PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT or #PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT for {@code storageBuffers}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, that stage <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, and any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, any resource accessed by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">bound shaders</a> <b>must</b> not be a protected resource</li>
            <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a> accesses a {@code VkSampler} or {@code VkImageView} object that enables <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> only be used with {@code OpImageSample*} or {@code OpImageSparseSample*} instructions</li>
            <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a> accesses a {@code VkSampler} or {@code VkImageView} object that enables <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> not use the {@code ConstOffset} and {@code Offset} operands</li>
            <li>If a {@code VkImageView} is accessed as a result of this command, then the image view’s {@code viewType} <b>must</b> match the {@code Dim} operand of the {@code OpTypeImage} as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#textures-operation-validation">textures-operation-validation</a></li>
            <li>If a {@code VkImageView} is accessed as a result of this command, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#formats-numericformat">numeric type</a> of the image view’s {@code format} and the {@code Sampled} {@code Type} operand of the {@code OpTypeImage} <b>must</b> match</li>
            <li>If a {@code VkImageView} created with a format other than #FORMAT_A8_UNORM_KHR is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the image view’s format</li>
            <li>If a {@code VkImageView} created with the format #FORMAT_A8_UNORM_KHR is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have four components</li>
            <li>If a {@code VkBufferView} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the buffer view’s format</li>
            <li>If a {@code VkImageView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
            <li>If a {@code VkImageView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
            <li>If a {@code VkBufferView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
            <li>If a {@code VkBufferView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkImage} objects created with the #IMAGE_CREATE_SPARSE_RESIDENCY_BIT flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkBuffer} objects created with the #BUFFER_CREATE_SPARSE_RESIDENCY_BIT flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
            <li>If {@code OpImageWeightedSampleQCOM} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_WEIGHT_SAMPLED_IMAGE_BIT_QCOM</li>
            <li>If {@code OpImageWeightedSampleQCOM} uses a {@code VkImageView} as a sample weight image as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_WEIGHT_IMAGE_BIT_QCOM</li>
            <li>If {@code OpImageBoxFilterQCOM} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_BOX_FILTER_SAMPLED_BIT_QCOM</li>
            <li>If {@code OpImageBlockMatchSSDQCOM} is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM</li>
            <li>If {@code OpImageBlockMatchSADQCOM} is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM</li>
            <li>If {@code OpImageBlockMatchSADQCOM} or OpImageBlockMatchSSDQCOM is used to read from a reference image as result of this command, then the specified reference coordinates <b>must</b> not fail <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#textures-integer-coordinate-validation">integer texel coordinate validation</a></li>
            <li>If {@code OpImageWeightedSampleQCOM}, {@code OpImageBoxFilterQCOM}, {@code OpImageBlockMatchWindowSSDQCOM}, {@code OpImageBlockMatchWindowSADQCOM}, {@code OpImageBlockMatchGatherSSDQCOM}, {@code OpImageBlockMatchGatherSADQCOM}, {@code OpImageBlockMatchSSDQCOM}, or {@code OpImageBlockMatchSADQCOM} uses a {@code VkSampler} as a result of this command, then the sampler <b>must</b> have been created with #SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM</li>
            <li>If any command other than {@code OpImageWeightedSampleQCOM}, {@code OpImageBoxFilterQCOM}, {@code OpImageBlockMatchWindowSSDQCOM}, {@code OpImageBlockMatchWindowSADQCOM}, {@code OpImageBlockMatchGatherSSDQCOM}, {@code OpImageBlockMatchGatherSADQCOM}, {@code OpImageBlockMatchSSDQCOM}, or {@code OpImageBlockMatchSADQCOM} uses a {@code VkSampler} as a result of this command, then the sampler <b>must</b> not have been created with #SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM</li>
            <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} instruction is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM</li>
            <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} instruction is used to read from an {@code VkImageView} as a result of this command, then the image view’s format <b>must</b> be a single-component format.</li>
            <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} read from a reference image as result of this command, then the specified reference coordinates <b>must</b> not fail <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#textures-integer-coordinate-validation">integer texel coordinate validation</a></li>
            <li>Any shader invocation executed by this command <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-termination">terminate</a></li>
            <li>The current render pass <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} bound to #PIPELINE_BIND_POINT_GRAPHICS</li>
            <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} bound to #PIPELINE_BIND_POINT_GRAPHICS</li>
            <li>If any shader statically accesses an input attachment, a valid descriptor <b>must</b> be bound to the pipeline via a descriptor set</li>
            <li>If any shader executed by this pipeline accesses an {@code OpTypeImage} variable with a {@code Dim} operand of {@code SubpassData}, it <b>must</b> be decorated with an {@code InputAttachmentIndex} that corresponds to a valid input attachment in the current subpass</li>
            <li>Input attachment views accessed in a subpass <b>must</b> be created with the same {@code VkFormat} as the corresponding subpass definition, and be created with a {@code VkImageView} that is compatible with the attachment referenced by the subpass' {@code pInputAttachments}[{@code InputAttachmentIndex}] in the currently bound {@code VkFramebuffer} as specified by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#compatibility-inputattachment">Fragment Input Attachment Compatibility</a></li>
            <li>Memory backing image subresources used as attachments in the current render pass <b>must</b> not be written in any way other than as an attachment by this command</li>
            <li>
                If a color attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the #IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT image layout, and either:
                <ul>
                    <li>the #PIPELINE_CREATE_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT is set on the currently bound pipeline or</li>
                    <li>
                        the last call to #CmdSetAttachmentFeedbackLoopEnableEXT() included #IMAGE_ASPECT_COLOR_BIT and
                        <ul>
                            <li>there is no currently bound graphics pipeline or</li>
                            <li>the currently bound graphics pipeline was created with #DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT it <b>must</b> not be accessed in any way other than as an attachment by this command</li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li>
                If a depth attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the #IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT image layout, and either:
                <ul>
                    <li>the #PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT is set on the currently bound pipeline or</li>
                    <li>
                        the last call to #CmdSetAttachmentFeedbackLoopEnableEXT() included #IMAGE_ASPECT_DEPTH_BIT and
                        <ul>
                            <li>there is no currently bound graphics pipeline or</li>
                            <li>the currently bound graphics pipeline was created with #DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT it <b>must</b> not be accessed in any way other than as an attachment by this command</li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li>
                If a stencil attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the #IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT image layout, and either:
                <ul>
                    <li>the #PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT is set on the currently bound pipeline or</li>
                    <li>
                        the last call to #CmdSetAttachmentFeedbackLoopEnableEXT() included #IMAGE_ASPECT_STENCIL_BIT and
                        <ul>
                            <li>there is no currently bound graphics pipeline or</li>
                            <li>the currently bound graphics pipeline was created with #DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT it <b>must</b> not be accessed in any way other than as an attachment by this command</li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li>If an attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it <b>must</b> not be accessed in any way other than as an attachment, storage image, or sampled image by this command</li>
            <li>If any previously recorded command in the current subpass accessed an image subresource used as an attachment in this subpass in any way other than as an attachment, this command <b>must</b> not write to that image subresource as an attachment</li>
            <li>If the current render pass instance uses a depth/stencil attachment with a read-only layout for the depth aspect, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fragops-depth-write">depth writes</a> <b>must</b> be disabled</li>
            <li>If the current render pass instance uses a depth/stencil attachment with a read-only layout for the stencil aspect, both front and back {@code writeMask} are not zero, and stencil test is enabled, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fragops-stencil">all stencil ops</a> <b>must</b> be #STENCIL_OP_KEEP</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT dynamic state enabled then #CmdSetViewport() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SCISSOR dynamic state enabled then #CmdSetScissor() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_WIDTH dynamic state enabled then #CmdSetLineWidth() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetPolygonModeEXT() in the current command buffer set {@code polygonMode} to #POLYGON_MODE_LINE, #CmdSetLineWidth() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_VERTEX_BIT stage, and the most recent call to #CmdSetPrimitiveTopology() in the current command buffer set {@code primitiveTopology} to any line topology, #CmdSetLineWidth() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object that outputs line primitives is bound to the #SHADER_STAGE_TESSELLATION_EVALUATION_BIT or #SHADER_STAGE_GEOMETRY_BIT stage, #CmdSetLineWidth() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_BIAS dynamic state enabled then #CmdSetDepthBias() or #CmdSetDepthBias2EXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetDepthBiasEnable() in the current command buffer set {@code depthBiasEnable} to #TRUE, #CmdSetDepthBias() or #CmdSetDepthBias2EXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_BLEND_CONSTANTS dynamic state enabled then #CmdSetBlendConstants() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetColorBlendEnableEXT() in the current command buffer set any element of {@code pColorBlendEnables} to #TRUE, and the most recent call to #CmdSetColorBlendEquationEXT() in the current command buffer set the same element of {@code pColorBlendEquations} to a ##VkColorBlendEquationEXT structure with any {@code VkBlendFactor} member with a value of #BLEND_FACTOR_CONSTANT_COLOR, #BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR, #BLEND_FACTOR_CONSTANT_ALPHA, or #BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA, #CmdSetBlendConstants() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_BOUNDS dynamic state enabled then #CmdSetDepthBounds() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetDepthBoundsTestEnable() in the current command buffer set {@code depthBoundsTestEnable} to #TRUE, then #CmdSetDepthBounds() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_STENCIL_COMPARE_MASK dynamic state enabled then #CmdSetStencilCompareMask() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetStencilTestEnable() in the current command buffer set {@code stencilTestEnable} to #TRUE, #CmdSetStencilCompareMask() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_STENCIL_WRITE_MASK dynamic state enabled then #CmdSetStencilWriteMask() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetStencilTestEnable() in the current command buffer set {@code stencilTestEnable} to #TRUE, #CmdSetStencilWriteMask() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_STENCIL_REFERENCE dynamic state enabled then #CmdSetStencilReference() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetStencilTestEnable() in the current command buffer set {@code stencilTestEnable} to #TRUE, #CmdSetStencilReference() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to ##VkPhysicalDeviceMultiviewProperties{@code ::maxMultiviewInstanceIndex}</li>
            <li>If the bound graphics pipeline was created with ##VkPipelineSampleLocationsStateCreateInfoEXT{@code ::sampleLocationsEnable} set to #TRUE and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the #IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT bit set</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT dynamic state enabled then #CmdSetSampleLocationsEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetSampleLocationsEnableEXT() in the current command buffer set {@code sampleLocationsEnable} to #TRUE, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetSampleLocationsEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state enabled, then the {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} in the last call to #CmdSetSampleLocationsEXT() <b>must</b> equal the {@code rasterizationSamples} member of the ##VkPipelineMultisampleStateCreateInfo structure the bound graphics pipeline has been created with</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_CULL_MODE dynamic state enabled then #CmdSetCullMode() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetCullMode() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_FRONT_FACE dynamic state enabled then #CmdSetFrontFace() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetFrontFace() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_TEST_ENABLE dynamic state enabled then #CmdSetDepthTestEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetDepthTestEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_WRITE_ENABLE dynamic state enabled then #CmdSetDepthWriteEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetDepthWriteEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_COMPARE_OP dynamic state enabled then #CmdSetDepthCompareOp() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetDepthTestEnable() in the current command buffer set {@code depthTestEnable} to #TRUE, then #CmdSetDepthCompareOp() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE dynamic state enabled then #CmdSetDepthBoundsTestEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-depthBounds">{@code depthBounds}</a> feature is enabled, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then the #CmdSetDepthBoundsTestEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_STENCIL_TEST_ENABLE dynamic state enabled then #CmdSetStencilTestEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetStencilTestEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_STENCIL_OP dynamic state enabled then #CmdSetStencilOp() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetStencilTestEnable() in the current command buffer set {@code stencilTestEnable} to #TRUE, then #CmdSetStencilOp() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, but not the #DYNAMIC_STATE_SCISSOR_WITH_COUNT dynamic state enabled, then #CmdSetViewportWithCount() <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the ##VkPipelineViewportStateCreateInfo{@code ::scissorCount} of the pipeline</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SCISSOR_WITH_COUNT dynamic state enabled, but not the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, then #CmdSetScissorWithCount() <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount} <b>must</b> match the ##VkPipelineViewportStateCreateInfo{@code ::viewportCount} of the pipeline</li>
            <li>If the bound graphics pipeline state was created with both the #DYNAMIC_STATE_SCISSOR_WITH_COUNT and #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic states enabled then both #CmdSetViewportWithCount() and #CmdSetScissorWithCount() <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount}</li>
            <li>If a shader object is bound to any graphics stage, then both #CmdSetViewportWithCount() and #CmdSetScissorWithCount() <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, but not the #DYNAMIC_STATE_VIEWPORT_W_SCALING_NV dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with ##VkPipelineViewportWScalingStateCreateInfoNV{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT and #DYNAMIC_STATE_VIEWPORT_W_SCALING_NV dynamic states enabled then the {@code viewportCount} parameter in the last call to #CmdSetViewportWScalingNV() <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If a shader object is bound to any graphics stage, and the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled on the device, then #CmdSetViewportWScalingNV() must have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled on the device, then the {@code viewportCount} parameter in the last call to #CmdSetViewportWScalingNV() <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, but not the #DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with ##VkPipelineViewportShadingRateImageStateCreateInfoNV{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT and #DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV dynamic states enabled then the {@code viewportCount} parameter in the last call to #CmdSetViewportShadingRatePaletteNV() <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set rasterizerDiscardEnable to #FALSE, then #CmdSetCoarseSampleOrderNV() must have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled on the device, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set rasterizerDiscardEnable to #FALSE, and the most recent call to #CmdSetShadingRateImageEnableNV() in the current command buffer set shadingRateImageEnable to #TRUE, then #CmdSetViewportShadingRatePaletteNV() must have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled on the device, then the {@code viewportCount} parameter in the last call to #CmdSetViewportShadingRatePaletteNV() <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled and a ##VkPipelineViewportSwizzleStateCreateInfoNV structure chained from ##VkPipelineViewportStateCreateInfo, then the bound graphics pipeline <b>must</b> have been created with ##VkPipelineViewportSwizzleStateCreateInfoNV{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled and a ##VkPipelineViewportExclusiveScissorStateCreateInfoNV structure chained from ##VkPipelineViewportStateCreateInfo, then the bound graphics pipeline <b>must</b> have been created with ##VkPipelineViewportExclusiveScissorStateCreateInfoNV{@code ::exclusiveScissorCount} greater or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV dynamic state enabled then #CmdSetExclusiveScissorEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV dynamic state enabled then #CmdSetExclusiveScissorNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-exclusiveScissor">{@code exclusiveScissor}</a> feature is enabled, then #CmdSetExclusiveScissorEnableNV() must have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetExclusiveScissorEnableNV() in the current command buffer set any element of {@code pExclusiveScissorEnables} to #TRUE, then #CmdSetExclusiveScissorNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE dynamic state enabled then #CmdSetRasterizerDiscardEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, then #CmdSetRasterizerDiscardEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_BIAS_ENABLE dynamic state enabled then #CmdSetDepthBiasEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetDepthBiasEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LOGIC_OP_EXT dynamic state enabled then #CmdSetLogicOpEXT() <b>must</b> have been called in the current command buffer prior to this drawing command and the {@code logicOp} <b>must</b> be a valid {@code VkLogicOp} value</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-logicOp">{@code logicOp}</a> feature is enabled on the device, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetLogicOpEXT() <b>must</b> have been called in the current command buffer prior to this drawing command and the {@code logicOp} <b>must</b> be a valid {@code VkLogicOp} value</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-primitiveFragmentShadingRateWithMultipleViewports">{@code primitiveFragmentShadingRateWithMultipleViewports}</a> limit is not supported, the bound graphics pipeline was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, and any of the shader stages of the bound graphics pipeline write to the {@code PrimitiveShadingRateKHR} built-in, then #CmdSetViewportWithCount() <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> be 1</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-primitiveFragmentShadingRateWithMultipleViewports">{@code primitiveFragmentShadingRateWithMultipleViewports}</a> limit is not supported, and any shader object bound to a graphics stage writes to the {@code PrimitiveShadingRateKHR} built-in, then #CmdSetViewportWithCount() <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> be 1</li>
            <li>If rasterization is not disabled in the bound graphics pipeline, then for each color attachment in the subpass, if the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> do not contain #FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT, then the {@code blendEnable} member of the corresponding element of the {@code pAttachments} member of {@code pColorBlendState} <b>must</b> be #FALSE</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then for each color attachment in the render pass, if the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> do not contain #FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT, then the corresponding member of {@code pColorBlendEnables} in the most recent call to {@code vkCmdSetColorBlendEnableEXT} in the current command buffer that affected that attachment index <b>must</b> have been #FALSE</li>
            <li>If rasterization is not disabled in the bound graphics pipeline, and none of the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} extension, the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension, or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is enabled, then {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be the same as the current subpass color and/or depth/stencil attachments</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and none of the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} extension, the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension, or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is enabled, then the most recent call to #CmdSetRasterizationSamplesEXT() in the current command buffer <b>must</b> have set {@code rasterizationSamples} to be the same as the number of samples for the current render pass color and/or depth/stencil attachments</li>
            <li>If a shader object is bound to any graphics stage, the current render pass instance <b>must</b> have been begun with #CmdBeginRendering()</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pDepthAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pDepthAttachment} is #IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL, this command <b>must</b> not write any values to the depth attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pStencilAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pStencilAttachment} is #IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL, this command <b>must</b> not write any values to the stencil attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pDepthAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pDepthAttachment} is #IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL, this command <b>must</b> not write any values to the depth attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pStencilAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pStencilAttachment} is #IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL, this command <b>must</b> not write any values to the stencil attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pDepthAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pDepthAttachment} is #IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL, this command <b>must</b> not write any values to the depth attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pStencilAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pStencilAttachment} is #IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL, this command <b>must</b> not write any values to the stencil attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound graphics pipeline <b>must</b> have been created with a ##VkPipelineRenderingCreateInfo{@code ::viewMask} equal to ##VkRenderingInfo{@code ::viewMask}</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound graphics pipeline <b>must</b> have been created with a ##VkPipelineRenderingCreateInfo{@code ::colorAttachmentCount} equal to ##VkRenderingInfo{@code ::colorAttachmentCount}</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and the current render pass instance was begun with #CmdBeginRendering() and ##VkRenderingInfo{@code ::colorAttachmentCount} greater than 0, then each element of the ##VkRenderingInfo{@code ::pColorAttachments} array with a {@code imageView} not equal to #NULL_HANDLE <b>must</b> have been created with a {@code VkFormat} equal to the corresponding element of ##VkPipelineRenderingCreateInfo{@code ::pColorAttachmentFormats} used to create the currently bound graphics pipeline</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is enabled, and the current render pass instance was begun with #CmdBeginRendering() and ##VkRenderingInfo{@code ::colorAttachmentCount} greater than 0, then each element of the ##VkRenderingInfo{@code ::pColorAttachments} array with a {@code imageView} not equal to #NULL_HANDLE <b>must</b> have been created with a {@code VkFormat} equal to the corresponding element of ##VkPipelineRenderingCreateInfo{@code ::pColorAttachmentFormats} used to create the currently bound graphics pipeline, or the corresponding element of ##VkPipelineRenderingCreateInfo{@code ::pColorAttachmentFormats}, if it exists, <b>must</b> be #FORMAT_UNDEFINED</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and the current render pass instance was begun with #CmdBeginRendering() and ##VkRenderingInfo{@code ::colorAttachmentCount} greater than 0, then each element of the ##VkRenderingInfo{@code ::pColorAttachments} array with a {@code imageView} equal to #NULL_HANDLE <b>must</b> have the corresponding element of ##VkPipelineRenderingCreateInfo{@code ::pColorAttachmentFormats} used to create the currently bound pipeline equal to #FORMAT_UNDEFINED</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT dynamic state enabled then #CmdSetColorWriteEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-colorWriteEnable">{@code colorWriteEnable}</a> feature is enabled on the device, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetColorWriteEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT dynamic state enabled then the {@code attachmentCount} parameter of {@code vkCmdSetColorWriteEnableEXT} <b>must</b> be greater than or equal to the ##VkPipelineColorBlendStateCreateInfo{@code ::attachmentCount} of the currently bound graphics pipeline</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-colorWriteEnable">{@code colorWriteEnable}</a> feature is enabled on the device, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then the {@code attachmentCount} parameter of most recent call to {@code vkCmdSetColorWriteEnableEXT} in the current command buffer <b>must</b> be greater than or equal to the number of color attachments in the current render pass instance</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DISCARD_RECTANGLE_EXT dynamic state enabled then #CmdSetDiscardRectangleEXT() <b>must</b> have been called in the current command buffer prior to this drawing command for each discard rectangle in ##VkPipelineDiscardRectangleStateCreateInfoEXT{@code ::discardRectangleCount}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT dynamic state enabled then #CmdSetDiscardRectangleEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetDiscardRectangleEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetDiscardRectangleEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT dynamic state enabled then #CmdSetDiscardRectangleModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetDiscardRectangleEnableEXT() in the current command buffer set {@code discardRectangleEnable} to #TRUE, then #CmdSetDiscardRectangleModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and ##VkRenderingInfo{@code ::pDepthAttachment→imageView} was #NULL_HANDLE, the value of ##VkPipelineRenderingCreateInfo{@code ::depthAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to #FORMAT_UNDEFINED</li>
            <li>If current render pass instance was begun with #CmdBeginRendering(), the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and ##VkRenderingInfo{@code ::pDepthAttachment→imageView} was not #NULL_HANDLE, the value of ##VkPipelineRenderingCreateInfo{@code ::depthAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to the {@code VkFormat} used to create ##VkRenderingInfo{@code ::pDepthAttachment→imageView}</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is enabled, ##VkRenderingInfo{@code ::pDepthAttachment→imageView} was not #NULL_HANDLE, and the value of ##VkPipelineRenderingCreateInfo{@code ::depthAttachmentFormat} used to create the currently bound graphics pipeline was not equal to the {@code VkFormat} used to create ##VkRenderingInfo{@code ::pDepthAttachment→imageView}, the value of the format <b>must</b> be #FORMAT_UNDEFINED</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and ##VkRenderingInfo{@code ::pStencilAttachment→imageView} was #NULL_HANDLE, the value of ##VkPipelineRenderingCreateInfo{@code ::stencilAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to #FORMAT_UNDEFINED</li>
            <li>If current render pass instance was begun with #CmdBeginRendering(), the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and ##VkRenderingInfo{@code ::pStencilAttachment→imageView} was not #NULL_HANDLE, the value of ##VkPipelineRenderingCreateInfo{@code ::stencilAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to the {@code VkFormat} used to create ##VkRenderingInfo{@code ::pStencilAttachment→imageView}</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is enabled, ##VkRenderingInfo{@code ::pStencilAttachment→imageView} was not #NULL_HANDLE, and the value of ##VkPipelineRenderingCreateInfo{@code ::stencilAttachmentFormat} used to create the currently bound graphics pipeline was not equal to the {@code VkFormat} used to create ##VkRenderingInfo{@code ::pStencilAttachment→imageView}, the value of the format <b>must</b> be #FORMAT_UNDEFINED</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering() and ##VkRenderingFragmentShadingRateAttachmentInfoKHR{@code ::imageView} was not #NULL_HANDLE, the currently bound graphics pipeline <b>must</b> have been created with #PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering() and ##VkRenderingFragmentDensityMapAttachmentInfoEXT{@code ::imageView} was not #NULL_HANDLE, the currently bound graphics pipeline <b>must</b> have been created with #PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT</li>
            <li>If the currently bound pipeline was created with a ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV structure, and the current render pass instance was begun with #CmdBeginRendering() with a ##VkRenderingInfo{@code ::colorAttachmentCount} parameter greater than 0, then each element of the ##VkRenderingInfo{@code ::pColorAttachments} array with a {@code imageView} not equal to #NULL_HANDLE <b>must</b> have been created with a sample count equal to the corresponding element of the {@code pColorAttachmentSamples} member of ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV used to create the currently bound graphics pipeline</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound pipeline was created with a ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV structure, and ##VkRenderingInfo{@code ::pDepthAttachment→imageView} was not #NULL_HANDLE, the value of the {@code depthStencilAttachmentSamples} member of ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV used to create the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create ##VkRenderingInfo{@code ::pDepthAttachment→imageView}</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound pipeline was created with a ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV structure, and ##VkRenderingInfo{@code ::pStencilAttachment→imageView} was not #NULL_HANDLE, the value of the {@code depthStencilAttachmentSamples} member of ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV used to create the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create ##VkRenderingInfo{@code ::pStencilAttachment→imageView}</li>
            <li>If the currently bound pipeline was created without a ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV structure, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and the current render pass instance was begun with #CmdBeginRendering() with a ##VkRenderingInfo{@code ::colorAttachmentCount} parameter greater than 0, then each element of the ##VkRenderingInfo{@code ::pColorAttachments} array with a {@code imageView} not equal to #NULL_HANDLE <b>must</b> have been created with a sample count equal to the value of {@code rasterizationSamples} for the currently bound graphics pipeline</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound pipeline was created without a ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV structure, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and ##VkRenderingInfo{@code ::pDepthAttachment→imageView} was not #NULL_HANDLE, the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create ##VkRenderingInfo{@code ::pDepthAttachment→imageView}</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound pipeline was created without a ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV structure, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and ##VkRenderingInfo{@code ::pStencilAttachment→imageView} was not #NULL_HANDLE, the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create ##VkRenderingInfo{@code ::pStencilAttachment→imageView}</li>
            <li>If this command has been called inside a render pass instance started with #CmdBeginRendering(), and the {@code pNext} chain of ##VkRenderingInfo includes a ##VkMultisampledRenderToSingleSampledInfoEXT structure with {@code multisampledRenderToSingleSampledEnable} equal to #TRUE, then the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to ##VkMultisampledRenderToSingleSampledInfoEXT{@code ::rasterizationSamples}</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound pipeline <b>must</b> have been created with a ##VkGraphicsPipelineCreateInfo{@code ::renderPass} equal to #NULL_HANDLE</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), there is a graphics pipeline bound with a fragment shader that statically writes to a color attachment, the color write mask is not zero, color writes are enabled, and the corresponding element of the ##VkRenderingInfo{@code ::pColorAttachments→imageView} was not #NULL_HANDLE, then the corresponding element of ##VkPipelineRenderingCreateInfo{@code ::pColorAttachmentFormats} used to create the pipeline <b>must</b> not be #FORMAT_UNDEFINED</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), there is a graphics pipeline bound, depth test is enabled, depth write is enabled, and the ##VkRenderingInfo{@code ::pDepthAttachment→imageView} was not #NULL_HANDLE, then the ##VkPipelineRenderingCreateInfo{@code ::depthAttachmentFormat} used to create the pipeline <b>must</b> not be #FORMAT_UNDEFINED</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), there is a graphics pipeline bound, stencil test is enabled and the ##VkRenderingInfo{@code ::pStencilAttachment→imageView} was not #NULL_HANDLE, then the ##VkPipelineRenderingCreateInfo{@code ::stencilAttachmentFormat} used to create the pipeline <b>must</b> not be #FORMAT_UNDEFINED</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-primitivesGeneratedQueryWithRasterizerDiscard">{@code primitivesGeneratedQueryWithRasterizerDiscard}</a> feature is not enabled and the #QUERY_TYPE_PRIMITIVES_GENERATED_EXT query is active, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#primsrast-discard">rasterization discard</a> <b>must</b> not be enabled</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-primitivesGeneratedQueryWithNonZeroStreams">{@code primitivesGeneratedQueryWithNonZeroStreams}</a> feature is not enabled and the #QUERY_TYPE_PRIMITIVES_GENERATED_EXT query is active, the bound graphics pipeline <b>must</b> not have been created with a non-zero value in ##VkPipelineRasterizationStateStreamCreateInfoEXT{@code ::rasterizationStream}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT dynamic state enabled then #CmdSetTessellationDomainOriginEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT dynamic state enabled then #CmdSetDepthClampEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_TESSELLATION_EVALUATION_BIT stage, then #CmdSetTessellationDomainOriginEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-depthClamp">{@code depthClamp}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetDepthClampEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_POLYGON_MODE_EXT dynamic state enabled then #CmdSetPolygonModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetPolygonModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT dynamic state enabled then #CmdSetRasterizationSamplesEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetRasterizationSamplesEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_MASK_EXT dynamic state enabled then #CmdSetSampleMaskEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetSampleMaskEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT dynamic state enabled then #CmdSetAlphaToCoverageEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT dynamic state enabled, and {@code alphaToCoverageEnable} was #TRUE in the last call to #CmdSetAlphaToCoverageEnableEXT(), then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#interfaces-fragmentoutput">Fragment Output Interface</a> <b>must</b> contain a variable for the alpha {@code Component} word in {@code Location} 0 at {@code Index} 0</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetAlphaToCoverageEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetAlphaToCoverageEnableEXT() in the current command buffer set {@code alphaToCoverageEnable} to #TRUE, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#interfaces-fragmentoutput">Fragment Output Interface</a> <b>must</b> contain a variable for the alpha {@code Component} word in {@code Location} 0 at {@code Index} 0</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT dynamic state enabled then #CmdSetAlphaToOneEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-alphaToOne">{@code alphaToOne}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetAlphaToOneEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT dynamic state enabled then #CmdSetLogicOpEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-logicOp">{@code logicOp}</a> feature is enabled, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetLogicOpEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT dynamic state enabled then #CmdSetColorBlendEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetColorBlendEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT dynamic state enabled then #CmdSetColorBlendEquationEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetColorBlendEnableEXT() for any attachment set that attachment’s value in {@code pColorBlendEnables} to #TRUE, then #CmdSetColorBlendEquationEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_WRITE_MASK_EXT dynamic state enabled then #CmdSetColorWriteMaskEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetColorWriteMaskEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZATION_STREAM_EXT dynamic state enabled then #CmdSetRasterizationStreamEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-geometryStreams">{@code geometryStreams}</a> feature is enabled, and a shader object is bound to the #SHADER_STAGE_GEOMETRY_BIT stage, then #CmdSetRasterizationStreamEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT dynamic state enabled then #CmdSetConservativeRasterizationModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTConservativeRasterization VK_EXT_conservative_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetConservativeRasterizationModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT dynamic state enabled then #CmdSetExtraPrimitiveOverestimationSizeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTConservativeRasterization VK_EXT_conservative_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetConservativeRasterizationModeEXT() in the current command buffer set {@code conservativeRasterizationMode} to #CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT, then #CmdSetExtraPrimitiveOverestimationSizeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT dynamic state enabled then #CmdSetDepthClipEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-depthClipEnable">{@code depthClipEnable}</a> feature is enabled, and a shader object is bound to any graphics stage, then #CmdSetDepthClipEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT dynamic state enabled then #CmdSetSampleLocationsEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTSampleLocations VK_EXT_sample_locations} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetSampleLocationsEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT dynamic state enabled then #CmdSetColorBlendAdvancedEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT dynamic state enabled then #CmdSetProvokingVertexModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTProvokingVertex VK_EXT_provoking_vertex} extension is enabled, and a shader object is bound to the #SHADER_STAGE_VERTEX_BIT stage, then #CmdSetProvokingVertexModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT dynamic state enabled then #CmdSetLineRasterizationModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetPolygonModeEXT() in the current command buffer set {@code polygonMode} to #POLYGON_MODE_LINE, then #CmdSetLineRasterizationModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to the vertex stage, and the most recent call to #CmdSetPrimitiveTopology() in the current command buffer set {@code primitiveTopology} to any line topology, then #CmdSetLineRasterizationModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object that outputs line primitives is bound to the tessellation evaluation or geometry stage, then #CmdSetLineRasterizationModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT dynamic state enabled then #CmdSetLineStippleEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetPolygonModeEXT() in the current command buffer set {@code polygonMode} to #POLYGON_MODE_LINE, then #CmdSetLineStippleEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to the vertex stage, and the most recent call to #CmdSetPrimitiveTopology() in the current command buffer set {@code primitiveTopology} to any line topology, then #CmdSetLineStippleEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object that outputs line primitives is bound to the tessellation evaluation or geometry stage, then #CmdSetLineStippleEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_EXT dynamic state enabled then #CmdSetLineStippleEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetLineStippleEnableEXT() in the current command buffer set {@code stippledLineEnable} to #TRUE, then #CmdSetLineStippleEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT dynamic state enabled then #CmdSetDepthClipNegativeOneToOneEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-depthClipControl">{@code depthClipControl}</a> feature is enabled, and a shader object is bound to any graphics stage, then #CmdSetDepthClipNegativeOneToOneEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV dynamic state enabled then #CmdSetViewportWScalingEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled, and a shader object is bound to any graphics stage, then #CmdSetViewportWScalingEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV dynamic state enabled then #CmdSetViewportSwizzleNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVViewportSwizzle VK_NV_viewport_swizzle} extension is enabled, and a shader object is bound to any graphics stage, then #CmdSetViewportSwizzleNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV dynamic state enabled then #CmdSetCoverageToColorEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVFragmentCoverageToColor VK_NV_fragment_coverage_to_color} extension is enabled, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetCoverageToColorEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV dynamic state enabled then #CmdSetCoverageToColorLocationNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVFragmentCoverageToColor VK_NV_fragment_coverage_to_color} extension is enabled, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetCoverageToColorEnableNV() in the current command buffer set {@code coverageToColorEnable} to #TRUE, then #CmdSetCoverageToColorLocationNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV dynamic state enabled then #CmdSetCoverageModulationModeNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetCoverageModulationModeNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV dynamic state enabled then #CmdSetCoverageModulationTableEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetCoverageModulationModeNV() in the current command buffer set coverageModulationMode to any value other than #COVERAGE_MODULATION_MODE_NONE_NV, then #CmdSetCoverageModulationTableEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV dynamic state enabled then #CmdSetCoverageModulationTableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetCoverageModulationTableEnableNV() in the current command buffer set {@code coverageModulationTableEnable} to #TRUE, then #CmdSetCoverageModulationTableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV dynamic state enabled then #CmdSetShadingRateImageEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-pipelineFragmentShadingRate">{@code pipelineFragmentShadingRate}</a> feature is enabled, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set rasterizerDiscardEnable to #FALSE, then #CmdSetFragmentShadingRateKHR() must have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetShadingRateImageEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV dynamic state enabled then #CmdSetRepresentativeFragmentTestEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-representativeFragmentTest">{@code representativeFragmentTest}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetRepresentativeFragmentTestEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV dynamic state enabled then #CmdSetCoverageReductionModeNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-coverageReductionMode">{@code coverageReductionMode}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetCoverageReductionModeNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT state enabled and the last call to #CmdSetColorBlendEnableEXT() set {@code pColorBlendEnables} for any attachment to #TRUE, then for those attachments in the subpass the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, and the current subpass does not use any color and/or depth/stencil attachments, then the {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT() <b>must</b> follow the rules for a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass-noattachments">zero-attachment subpass</a></li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_MASK_EXT state enabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state disabled, then the {@code samples} parameter in the last call to #CmdSetSampleMaskEXT() <b>must</b> be greater or equal to the ##VkPipelineMultisampleStateCreateInfo{@code ::rasterizationSamples} parameter used to create the bound graphics pipeline</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_MASK_EXT state and #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT states enabled, then the {@code samples} parameter in the last call to #CmdSetSampleMaskEXT() <b>must</b> be greater or equal to the {@code rasterizationSamples} parameter in the last call to #CmdSetRasterizationSamplesEXT()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, and neither the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} nor the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extensions are enabled, then the {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT() <b>must</b> be the same as the current subpass color and/or depth/stencil attachments</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, or a shader object is bound to any graphics stage, and the current render pass instance includes a ##VkMultisampledRenderToSingleSampledInfoEXT structure with {@code multisampledRenderToSingleSampledEnable} equal to #TRUE, then the {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT() <b>must</b> be the same as the {@code rasterizationSamples} member of that structure</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT dynamic state enabled then #CmdSetColorBlendEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendEnableEXT} calls <b>must</b> specify an enable for all active color attachments in the current subpass</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT dynamic state enabled then #CmdSetColorBlendEquationEXT() <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendEquationEXT} calls <b>must</b> specify the blend equations for all active color attachments in the current subpass where blending is enabled</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_WRITE_MASK_EXT dynamic state enabled then #CmdSetColorWriteMaskEXT() <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorWriteMaskEXT} calls <b>must</b> specify the color write mask for all active color attachments in the current subpass</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT dynamic state enabled then #CmdSetColorBlendAdvancedEXT() <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendAdvancedEXT} calls <b>must</b> specify the advanced blend equations for all active color attachments in the current subpass where blending is enabled</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT and #DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT dynamic states enabled and the last calls to #CmdSetColorBlendEnableEXT() and #CmdSetColorBlendAdvancedEXT() have enabled advanced blending, then the number of active color attachments in the current subpass <b>must</b> not exceed <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-advancedBlendMaxColorAttachments">{@code advancedBlendMaxColorAttachments}</a></li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-primitivesGeneratedQueryWithNonZeroStreams">{@code primitivesGeneratedQueryWithNonZeroStreams}</a> feature is not enabled and the #QUERY_TYPE_PRIMITIVES_GENERATED_EXT query is active, and the bound graphics pipeline was created with #DYNAMIC_STATE_RASTERIZATION_STREAM_EXT state enabled, the last call to #CmdSetRasterizationStreamEXT() <b>must</b> have set the {@code rasterizationStream} to zero</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state enabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state disabled, then the {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} in the last call to #CmdSetSampleLocationsEXT() <b>must</b> equal the {@code rasterizationSamples} member of the ##VkPipelineMultisampleStateCreateInfo structure the bound graphics pipeline has been created with</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state enabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, then the {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} in the last call to #CmdSetSampleLocationsEXT() <b>must</b> equal the {@code rasterizationSamples} parameter of the last call to #CmdSetRasterizationSamplesEXT()</li>
            <li>If the bound graphics pipeline was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, and {@code sampleLocationsEnable} was #TRUE in the last call to #CmdSetSampleLocationsEnableEXT(), and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the #IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT bit set</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state enabled and the #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, and if {@code sampleLocationsEnable} was #TRUE in the last call to #CmdSetSampleLocationsEnableEXT(), then the {@code sampleLocationsInfo.sampleLocationGridSize.width} in the last call to #CmdSetSampleLocationsEXT() <b>must</b> evenly divide ##VkMultisamplePropertiesEXT{@code ::sampleLocationGridSize.width} as returned by #GetPhysicalDeviceMultisamplePropertiesEXT() with a {@code samples} parameter equaling {@code rasterizationSamples}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state enabled and the #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, and if {@code sampleLocationsEnable} was #TRUE in the last call to #CmdSetSampleLocationsEnableEXT(), then the {@code sampleLocationsInfo.sampleLocationGridSize.height} in the last call to #CmdSetSampleLocationsEXT() <b>must</b> evenly divide ##VkMultisamplePropertiesEXT{@code ::sampleLocationGridSize.height} as returned by #GetPhysicalDeviceMultisamplePropertiesEXT() with a {@code samples} parameter equaling {@code rasterizationSamples}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, and if {@code sampleLocationsEnable} was #TRUE in the last call to #CmdSetSampleLocationsEnableEXT(), the fragment shader code <b>must</b> not statically use the extended instruction {@code InterpolateAtSample}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state disabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, the {@code sampleLocationsEnable} member of a ##VkPipelineSampleLocationsStateCreateInfoEXT{@code ::sampleLocationsEnable} in the bound graphics pipeline is #TRUE or #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, then, {@code sampleLocationsInfo.sampleLocationGridSize.width} <b>must</b> evenly divide ##VkMultisamplePropertiesEXT{@code ::sampleLocationGridSize.width} as returned by #GetPhysicalDeviceMultisamplePropertiesEXT() with a {@code samples} parameter equaling the value of {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state disabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, the {@code sampleLocationsEnable} member of a ##VkPipelineSampleLocationsStateCreateInfoEXT{@code ::sampleLocationsEnable} in the bound graphics pipeline is #TRUE or #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, then, {@code sampleLocationsInfo.sampleLocationGridSize.height} <b>must</b> evenly divide ##VkMultisamplePropertiesEXT{@code ::sampleLocationGridSize.height} as returned by #GetPhysicalDeviceMultisamplePropertiesEXT() with a {@code samples} parameter equaling the value of {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state disabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, the {@code sampleLocationsEnable} member of a ##VkPipelineSampleLocationsStateCreateInfoEXT{@code ::sampleLocationsEnable} in the bound graphics pipeline is #TRUE or #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, then, {@code sampleLocationsInfo.sampleLocationsPerPixel} <b>must</b> equal {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV state enabled and the last call to #CmdSetCoverageModulationTableEnableNV() set {@code coverageModulationTableEnable} to #TRUE, then the {@code coverageModulationTableCount} parameter in the last call to #CmdSetCoverageModulationTableNV() <b>must</b> equal the current {@code rasterizationSamples} divided by the number of color samples in the current subpass</li>
            <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and if current subpass has a depth/stencil attachment and depth test, stencil test, or depth bounds test are enabled in the currently bound pipeline state, then the current {@code rasterizationSamples} <b>must</b> be the same as the sample count of the depth/stencil attachment</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV state enabled and the last call to #CmdSetCoverageToColorEnableNV() set the {@code coverageToColorEnable} to #TRUE, then the current subpass <b>must</b> have a color attachment at the location selected by the last call to #CmdSetCoverageToColorLocationNV() {@code coverageToColorLocation}, with a {@code VkFormat} of #FORMAT_R8_UINT, #FORMAT_R8_SINT, #FORMAT_R16_UINT, #FORMAT_R16_SINT, #FORMAT_R32_UINT, or #FORMAT_R32_SINT</li>
            <li>If this {@link NVCoverageReductionMode VK_NV_coverage_reduction_mode} extension is enabled, the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV and #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT states enabled, the current coverage reduction mode {@code coverageReductionMode}, then the current {@code rasterizationSamples}, and the sample counts for the color and depth/stencil attachments (if the subpass has them) <b>must</b> be a valid combination returned by #GetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, but not the #DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with ##VkPipelineViewportSwizzleStateCreateInfoNV{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT and #DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV dynamic states enabled then the {@code viewportCount} parameter in the last call to #CmdSetViewportSwizzleNV() <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and if the current subpass has any color attachments and {@code rasterizationSamples} of the last call to #CmdSetRasterizationSamplesEXT() is greater than the number of color samples, then the pipeline {@code sampleShadingEnable} <b>must</b> be #FALSE</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT or #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT dynamic states enabled, and if the current {@code stippledLineEnable} state is #TRUE and the current {@code lineRasterizationMode} state is #LINE_RASTERIZATION_MODE_RECTANGULAR_EXT, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledRectangularLines">{@code stippledRectangularLines}</a> feature <b>must</b> be enabled</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT or #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT dynamic states enabled, and if the current {@code stippledLineEnable} state is #TRUE and the current {@code lineRasterizationMode} state is #LINE_RASTERIZATION_MODE_BRESENHAM_EXT, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> feature <b>must</b> be enabled</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT or #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT dynamic states enabled, and if the current {@code stippledLineEnable} state is #TRUE and the current {@code lineRasterizationMode} state is #LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledSmoothLines">{@code stippledSmoothLines}</a> feature <b>must</b> be enabled</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT or #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT dynamic states enabled, and if the current {@code stippledLineEnable} state is #TRUE and the current {@code lineRasterizationMode} state is #LINE_RASTERIZATION_MODE_DEFAULT_EXT, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledRectangularLines">{@code stippledRectangularLines}</a> feature <b>must</b> be enabled and ##VkPhysicalDeviceLimits{@code ::strictLines} <b>must</b> be #TRUE</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT dynamic state enabled, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-conservativePointAndLineRasterization">{@code conservativePointAndLineRasterization}</a> is not supported, and the effective primitive topology output by the last pre-rasterization shader stage is a line or point, then the {@code conservativeRasterizationMode} set by the last call to #CmdSetConservativeRasterizationModeEXT() <b>must</b> be #CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT</li>
            <li>If the currently bound pipeline was created with the ##VkPipelineShaderStageCreateInfo{@code ::stage} member of an element of ##VkGraphicsPipelineCreateInfo{@code ::pStages} set to #SHADER_STAGE_VERTEX_BIT, #SHADER_STAGE_TESSELLATION_CONTROL_BIT, #SHADER_STAGE_TESSELLATION_EVALUATION_BIT or #SHADER_STAGE_GEOMETRY_BIT, then <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#queries-mesh-shader">Mesh Shader Queries</a> <b>must</b> not be active</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT dynamic state #CmdSetAttachmentFeedbackLoopEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If dynamic state was inherited from ##VkCommandBufferInheritanceViewportScissorInfoNV, it <b>must</b> be set in the current command buffer prior to this drawing command</li>
            <li>If there is no bound graphics pipeline, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_VERTEX_BIT</li>
            <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-tessellationShader">{@code tessellationShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_TESSELLATION_CONTROL_BIT</li>
            <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-tessellationShader">{@code tessellationShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_TESSELLATION_EVALUATION_BIT</li>
            <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-geometryShader">{@code geometryShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_GEOMETRY_BIT</li>
            <li>If there is no bound graphics pipeline, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_FRAGMENT_BIT</li>
            <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-taskShader">{@code taskShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_TASK_BIT_EXT</li>
            <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-meshShader">{@code meshShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_MESH_BIT_EXT</li>
            <li>If there is no bound graphics pipeline, and at least one of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-taskShader">{@code taskShader}</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-meshShader">{@code meshShader}</a> features is enabled, one of the #SHADER_STAGE_VERTEX_BIT or #SHADER_STAGE_MESH_BIT_EXT stages <b>must</b> have a valid {@code VkShaderEXT} bound, and the other <b>must</b> have no {@code VkShaderEXT} bound</li>
            <li>If there is no bound graphics pipeline, and both the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-taskShader">{@code taskShader}</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-meshShader">{@code meshShader}</a> features are enabled, and a valid {@code VkShaderEXT} is bound the to the #SHADER_STAGE_MESH_BIT_EXT stage, and that {@code VkShaderEXT} was created without the #SHADER_CREATE_NO_TASK_SHADER_BIT_EXT flag, a valid {@code VkShaderEXT} <b>must</b> be bound to the #SHADER_STAGE_TASK_BIT_EXT stage</li>
            <li>If there is no bound graphics pipeline, and both the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-taskShader">{@code taskShader}</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-meshShader">{@code meshShader}</a> features are enabled, and a valid {@code VkShaderEXT} is bound the to the #SHADER_STAGE_MESH_BIT_EXT stage, and that {@code VkShaderEXT} was created with the #SHADER_CREATE_NO_TASK_SHADER_BIT_EXT flag, there <b>must</b> be no {@code VkShaderEXT} bound to the #SHADER_STAGE_TASK_BIT_EXT stage</li>
            <li>If there is no bound graphics pipeline, and a valid {@code VkShaderEXT} is bound to the #SHADER_STAGE_VERTEX_BIT stage, there <b>must</b> be no {@code VkShaderEXT} bound to either the #SHADER_STAGE_TASK_BIT_EXT stage or the #SHADER_STAGE_MESH_BIT_EXT stage</li>
            <li>If any graphics shader is bound which was created with the #SHADER_CREATE_LINK_STAGE_BIT_EXT flag, then all shaders created with the #SHADER_CREATE_LINK_STAGE_BIT_EXT flag in the same #CreateShadersEXT() call <b>must</b> also be bound</li>
            <li>If any graphics shader is bound which was created with the #SHADER_CREATE_LINK_STAGE_BIT_EXT flag, any stages in between stages whose shaders which did not create a shader with the #SHADER_CREATE_LINK_STAGE_BIT_EXT flag as part of the same #CreateShadersEXT() call <b>must</b> not have any {@code VkShaderEXT} bound</li>
            <li>All bound graphics shader objects <b>must</b> have been created with identical or identically defined push constant ranges</li>
            <li>All bound graphics shader objects <b>must</b> have been created with identical or identically defined arrays of descriptor set layouts</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-attachmentFeedbackLoopDynamicState">attachmentFeedbackLoopDynamicState</a> feature is enabled on the device, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE #CmdSetAttachmentFeedbackLoopEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state includes a fragment shader stage, was created with #DYNAMIC_STATE_DEPTH_WRITE_ENABLE set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}, and the fragment shader declares the {@code EarlyFragmentTests} execution mode and uses {@code OpDepthAttachmentReadEXT}, the {@code depthWriteEnable} parameter in the last call to #CmdSetDepthWriteEnable() <b>must</b> be #FALSE</li>
            <li>If the bound graphics pipeline state includes a fragment shader stage, was created with #DYNAMIC_STATE_STENCIL_WRITE_MASK set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}, and the fragment shader declares the {@code EarlyFragmentTests} execution mode and uses {@code OpStencilAttachmentReadEXT}, the {@code writeMask} parameter in the last call to #CmdSetStencilWriteMask() <b>must</b> be 0</li>
            <li>If a shader object is bound to any graphics stage or the currently bound graphics pipeline was created with #DYNAMIC_STATE_COLOR_WRITE_MASK_EXT, and the format of any color attachment is #FORMAT_E5B9G9R9_UFLOAT_PACK32, the corresponding element of the {@code pColorWriteMasks} parameter of #CmdSetColorWriteMaskEXT() <b>must</b> either include all of #COLOR_COMPONENT_R_BIT, #COLOR_COMPONENT_G_BIT, and #COLOR_COMPONENT_B_BIT, or none of them</li>
            <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#framebuffer-blending">blending</a> is enabled for any attachment where either the source or destination blend factors for that attachment <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#framebuffer-dsb">use the secondary color input</a>, the maximum value of {@code Location} for any output attachment <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-staticuse">statically used</a> in the {@code Fragment} {@code Execution} {@code Model} executed by this command <b>must</b> be less than <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-maxFragmentDualSrcAttachments">{@code maxFragmentDualSrcAttachments}</a></li>
        </ul>

        <ul>
            <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point’s interface <b>must</b> have either valid or #NULL_HANDLE buffers bound</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-nullDescriptor">{@code nullDescriptor}</a> feature is not enabled, all vertex input bindings accessed via vertex input variables declared in the vertex shader entry point’s interface <b>must</b> not be #NULL_HANDLE</li>
            <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fxvertex-input">Vertex Input Description</a></li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_PRIMITIVE_TOPOLOGY dynamic state enabled then #CmdSetPrimitiveTopology() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_PRIMITIVE_TOPOLOGY dynamic state enabled and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-dynamicPrimitiveTopologyUnrestricted">{@code dynamicPrimitiveTopologyUnrestricted}</a> is #FALSE, then the {@code primitiveTopology} parameter of {@code vkCmdSetPrimitiveTopology} <b>must</b> be of the same <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#drawing-primitive-topology-class">topology class</a> as the pipeline ##VkPipelineInputAssemblyStateCreateInfo{@code ::topology} state</li>
            <li>If the bound graphics pipeline was created with both the #DYNAMIC_STATE_VERTEX_INPUT_EXT and #DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT dynamic states enabled, then #CmdSetVertexInputEXT() <b>must</b> have been called in the current command buffer prior to this draw command</li>
            <li>If the bound graphics pipeline was created with the #DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT dynamic state enabled, but not the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, then #CmdBindVertexBuffers2EXT() <b>must</b> have been called in the current command buffer prior to this draw command, and the {@code pStrides} parameter of #CmdBindVertexBuffers2EXT() <b>must</b> not be {@code NULL}</li>
            <li>If a shader object is bound to the #SHADER_STAGE_VERTEX_BIT stage, then #CmdSetPrimitiveTopology() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, then #CmdSetVertexInputEXT() <b>must</b> have been called in the current command buffer prior to this draw command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, then all variables with the {@code Input} storage class decorated with {@code Location} in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} <b>must</b> contain a location in ##VkVertexInputAttributeDescription2EXT{@code ::location}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, then the numeric type associated with all {@code Input} variables of the corresponding {@code Location} in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} <b>must</b> be the same as ##VkVertexInputAttributeDescription2EXT{@code ::format}</li>
            <li>If there is a shader object bound to a graphics stage or the currently bound graphics pipeline was created with the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, and ##VkVertexInputAttributeDescription2EXT{@code ::format} has a 64-bit component, then the scalar width associated with all {@code Input} variables of the corresponding {@code Location} in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} <b>must</b> be 64-bit</li>
            <li>If there is a shader object bound to a graphics stage or the currently bound graphics pipeline was created with the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, and the scalar width associated with a {@code Location} decorated {@code Input} variable in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} is 64-bit, then the corresponding ##VkVertexInputAttributeDescription2EXT{@code ::format} <b>must</b> have a 64-bit component</li>
            <li>If there is a shader object bound to a graphics stage or the currently bound graphics pipeline was created with the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, and ##VkVertexInputAttributeDescription2EXT{@code ::format} has a 64-bit component, then all {@code Input} variables at the corresponding {@code Location} in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} <b>must</b> not use components that are not present in the format</li>
            <li>If a shader object is bound to the #SHADER_STAGE_VERTEX_BIT stage, then #CmdSetVertexInputEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT dynamic state enabled then #CmdSetPatchControlPointsEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_TESSELLATION_EVALUATION_BIT stage, then #CmdSetPatchControlPointsEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE dynamic state enabled then #CmdSetPrimitiveRestartEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, #CmdSetPrimitiveRestartEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>The bound graphics pipeline <b>must</b> not have been created with the ##VkPipelineShaderStageCreateInfo{@code ::stage} member of an element of ##VkGraphicsPipelineCreateInfo{@code ::pStages} set to #SHADER_STAGE_TASK_BIT_EXT or #SHADER_STAGE_MESH_BIT_EXT</li>
            <li>There <b>must</b> be no shader object bound to either of the #SHADER_STAGE_TASK_BIT_EXT or #SHADER_STAGE_MESH_BIT_EXT stages</li>
            <li>##VkPhysicalDeviceTransformFeedbackFeaturesEXT{@code ::transformFeedback} <b>must</b> be enabled</li>
            <li>The implementation <b>must</b> support ##VkPhysicalDeviceTransformFeedbackPropertiesEXT{@code ::transformFeedbackDraw}</li>
            <li>{@code vertexStride} <b>must</b> be greater than 0 and less than or equal to ##VkPhysicalDeviceTransformFeedbackPropertiesEXT{@code ::maxTransformFeedbackBufferDataStride}</li>
            <li>If {@code counterBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code counterBuffer} <b>must</b> have been created with the #BUFFER_USAGE_INDIRECT_BUFFER_BIT bit set</li>
            <li>{@code counterBufferOffset} <b>must</b> be a multiple of 4</li>
            <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code counterBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>Both of {@code commandBuffer}, and {@code counterBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Outside</td><td>Graphics</td><td>Action</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        uint32_t("instanceCount", "the number of instances to draw."),
        uint32_t("firstInstance", "the instance ID of the first instance to draw."),
        VkBuffer("counterBuffer", "the buffer handle from where the byte count is read."),
        VkDeviceSize("counterBufferOffset", "the offset into the buffer used to read the byte count, which is used to calculate the vertex count for this draw call."),
        uint32_t("counterOffset", "subtracted from the byte count read from the {@code counterBuffer} at the {@code counterBufferOffset}"),
        uint32_t("vertexStride", "the stride in bytes between each element of the vertex data that is used to calculate the vertex count from the counter value. This value is typically the same value that was used in the graphics pipeline state when the transform feedback was captured as the {@code XfbStride}.")
    )
}