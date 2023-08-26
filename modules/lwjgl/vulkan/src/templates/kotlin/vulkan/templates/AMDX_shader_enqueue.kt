/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMDX_shader_enqueue = "AMDXShaderEnqueue".nativeClassVK("AMDX_shader_enqueue", type = "device", postfix = "AMDX") {
    documentation =
        """
        This extension adds the ability for developers to enqueue compute shader workgroups from other compute shaders.

        <h5>VK_AMDX_shader_enqueue</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_AMDX_shader_enqueue}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>135</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} and {@link KHRSynchronization2 VK_KHR_synchronization2} and {@link KHRPipelineLibrary VK_KHR_pipeline_library} and {@link KHRSpirv14 VK_KHR_spirv_1_4}

            <ul>
                <li>This is a <em>provisional</em> extension and <b>must</b> be used with caution. See the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#boilerplate-provisional-header">description</a> of provisional header files for enablement and stability details.</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tobias Hector <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_AMDX_shader_enqueue]%20@tobski%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_AMDX_shader_enqueue%20extension*">tobski</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_AMDX_shader_enqueue.adoc">VK_AMDX_shader_enqueue</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-07-22</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/AMD/SPV_AMDX_shader_enqueue.html">{@code SPV_AMDX_shader_enqueue}</a>.</li>
            </ul></dd>

            <dt><b>Provisional</b></dt>
            <dd><b>This extension is <em>provisional</em> and <b>should</b> not be used in production applications. The functionality <b>may</b> change in ways that break backwards compatibility between revisions, and before final release.</b></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Tobias Hector, AMD</li>
                <li>Matthaeus Chajdas, AMD</li>
                <li>Maciej Jesionowski, AMD</li>
                <li>Robert Martin, AMD</li>
                <li>Qun Lin, AMD</li>
                <li>Rex Xu, AMD</li>
                <li>Dominik Witczak, AMD</li>
                <li>Karthik Srinivasan, AMD</li>
                <li>Nicolai Haehnle, AMD</li>
                <li>Stuart Smith, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "AMDX_SHADER_ENQUEUE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "AMDX_SHADER_ENQUEUE_EXTENSION_NAME".."VK_AMDX_shader_enqueue"
    )

    EnumConstant(
        "VK_SHADER_INDEX_UNUSED_AMDX",

        "SHADER_INDEX_UNUSED_AMDX".."(~0)"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_FEATURES_AMDX".."1000134000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX".."1000134001",
        "STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX".."1000134002",
        "STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX".."1000134003",
        "STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_NODE_CREATE_INFO_AMDX".."1000134004"
    )

    EnumConstant(
        "Extends {@code VkBufferUsageFlagBits}.",

        "BUFFER_USAGE_EXECUTION_GRAPH_SCRATCH_BIT_AMDX".enum(0x02000000)
    )

    EnumConstant(
        "Extends {@code VkPipelineBindPoint}.",

        "PIPELINE_BIND_POINT_EXECUTION_GRAPH_AMDX".."1000134000"
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2KHR}.",

        "BUFFER_USAGE_2_EXECUTION_GRAPH_SCRATCH_BIT_AMDX".enum(0x02000000L)
    )

    VkResult(
        "CreateExecutionGraphPipelinesAMDX",
        """
        Creates a new execution graph pipeline object.

        <h5>C Specification</h5>
        To create execution graph pipelines, call:

        <pre><code>
￿VkResult vkCreateExecutionGraphPipelinesAMDX(
￿    VkDevice                                    device,
￿    VkPipelineCache                             pipelineCache,
￿    uint32_t                                    createInfoCount,
￿    const VkExecutionGraphPipelineCreateInfoAMDX* pCreateInfos,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkPipeline*                                 pPipelines);</code></pre>

        <h5>Description</h5>
        The implementation will create a pipeline in each element of {@code pPipelines} from the corresponding element of {@code pCreateInfos}. If creation of any pipeline fails, that pipeline will be set to #NULL_HANDLE.

        If creation fails for a pipeline create info with a ##VkExecutionGraphPipelineCreateInfoAMDX{@code ::flags} value that included #PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT, all pipelines at a greater index all automatically fail.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderEnqueue">{@code shaderEnqueue} feature</a> <b>must</b> be enabled</li>
            <li>If the {@code flags} member of any element of {@code pCreateInfos} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and the {@code basePipelineIndex} member of that same element is not {@code -1}, {@code basePipelineIndex} <b>must</b> be less than the index into {@code pCreateInfos} that corresponds to that element</li>
            <li>If the {@code flags} member of any element of {@code pCreateInfos} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, the base pipeline <b>must</b> have been created with the #PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT flag set</li>
            <li>If {@code pipelineCache} was created with #PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT, host access to {@code pipelineCache} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-threadingbehavior">externally synchronized</a></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code pipelineCache} is not #NULL_HANDLE, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
            <li>{@code pCreateInfos} <b>must</b> be a valid pointer to an array of {@code createInfoCount} valid ##VkExecutionGraphPipelineCreateInfoAMDX structures</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pPipelines} <b>must</b> be a valid pointer to an array of {@code createInfoCount} {@code VkPipeline} handles</li>
            <li>{@code createInfoCount} <b>must</b> be greater than 0</li>
            <li>If {@code pipelineCache} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#PIPELINE_COMPILE_REQUIRED_EXT</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkExecutionGraphPipelineCreateInfoAMDX
        """,

        VkDevice("device", "the logical device that creates the execution graph pipelines."),
        VkPipelineCache("pipelineCache", "either #NULL_HANDLE, indicating that pipeline caching is disabled; or the handle of a valid <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#pipelines-cache\">pipeline cache</a> object, in which case use of that cache is enabled for the duration of the command."),
        AutoSize("pCreateInfos", "pPipelines")..uint32_t("createInfoCount", "the length of the {@code pCreateInfos} and {@code pPipelines} arrays."),
        VkExecutionGraphPipelineCreateInfoAMDX.const.p("pCreateInfos", "a pointer to an array of ##VkExecutionGraphPipelineCreateInfoAMDX structures."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        VkPipeline.p("pPipelines", "a pointer to an array of {@code VkPipeline} handles in which the resulting execution graph pipeline objects are returned.")
    )

    VkResult(
        "GetExecutionGraphPipelineScratchSizeAMDX",
        """
        Query scratch space required to dispatch an execution graph.

        <h5>C Specification</h5>
        To query the scratch space required to dispatch an execution graph, call:

        <pre><code>
￿VkResult vkGetExecutionGraphPipelineScratchSizeAMDX(
￿    VkDevice                                    device,
￿    VkPipeline                                  executionGraph,
￿    VkExecutionGraphPipelineScratchSizeAMDX*    pSizeInfo);</code></pre>

        <h5>Description</h5>
        After this function returns, information about the scratch space required will be returned in {@code pSizeInfo}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code executionGraph} <b>must</b> be a valid {@code VkPipeline} handle</li>
            <li>{@code pSizeInfo} <b>must</b> be a valid pointer to a ##VkExecutionGraphPipelineScratchSizeAMDX structure</li>
            <li>{@code executionGraph} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkExecutionGraphPipelineScratchSizeAMDX
        """,

        VkDevice("device", "the that {@code executionGraph} was created on."),
        VkPipeline("executionGraph", "the execution graph pipeline to query the scratch space for."),
        VkExecutionGraphPipelineScratchSizeAMDX.p("pSizeInfo", "a pointer to a ##VkExecutionGraphPipelineScratchSizeAMDX structure that will contain the required scratch size.")
    )

    VkResult(
        "GetExecutionGraphPipelineNodeIndexAMDX",
        """
        Query internal id of a node in an execution graph.

        <h5>C Specification</h5>
        To query the internal node index for a particular node in an execution graph, call:

        <pre><code>
￿VkResult vkGetExecutionGraphPipelineNodeIndexAMDX(
￿    VkDevice                                    device,
￿    VkPipeline                                  executionGraph,
￿    const VkPipelineShaderStageNodeCreateInfoAMDX* pNodeInfo,
￿    uint32_t*                                   pNodeIndex);</code></pre>

        <h5>Description</h5>
        Once this function returns, the contents of {@code pNodeIndex} contain the internal node index of the identified node.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pNodeInfo→pName} <b>must</b> not be {@code NULL}</li>
            <li>{@code pNodeInfo→index} <b>must</b> not be #SHADER_INDEX_UNUSED_AMDX</li>
            <li>There <b>must</b> be a node in {@code executionGraph} with a shader name and index equal to {@code pNodeInfo→pName} and {@code pNodeInfo→index}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code executionGraph} <b>must</b> be a valid {@code VkPipeline} handle</li>
            <li>{@code pNodeInfo} <b>must</b> be a valid pointer to a valid ##VkPipelineShaderStageNodeCreateInfoAMDX structure</li>
            <li>{@code pNodeIndex} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>{@code executionGraph} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkPipelineShaderStageNodeCreateInfoAMDX
        """,

        VkDevice("device", "the that {@code executionGraph} was created on."),
        VkPipeline("executionGraph", "the execution graph pipeline to query the internal node index for."),
        VkPipelineShaderStageNodeCreateInfoAMDX.const.p("pNodeInfo", "a pointer to a ##VkPipelineShaderStageNodeCreateInfoAMDX structure identifying the name and index of the node to query."),
        Check(1)..uint32_t.p("pNodeIndex", "the returned internal node index of the identified node.")
    )

    void(
        "CmdInitializeGraphScratchMemoryAMDX",
        """
        Initialize scratch memory for an execution graph.

        <h5>C Specification</h5>
        To initialize scratch memory for a particular execution graph, call:

        <pre><code>
￿void vkCmdInitializeGraphScratchMemoryAMDX(
￿    VkCommandBuffer                             commandBuffer,
￿    VkDeviceAddress                             scratch);</code></pre>

        <h5>Description</h5>
        This command <b>must</b> be called before using {@code scratch} to dispatch the currently bound execution graph pipeline.

        Execution of this command <b>may</b> modify any memory locations in the range [{@code scratch},{@code scratch} + {@code size}), where {@code size} is the value returned in ##VkExecutionGraphPipelineScratchSizeAMDX{@code ::size} by ##VkExecutionGraphPipelineScratchSizeAMDX for the currently bound execution graph pipeline. Accesses to this memory range are performed in the #PIPELINE_STAGE_2_COMPUTE_SHADER_BIT pipeline stage with the #ACCESS_2_SHADER_STORAGE_READ_BIT and #ACCESS_2_SHADER_STORAGE_WRITE_BIT access flags.

        If any portion of {@code scratch} is modified by any command other than #CmdDispatchGraphAMDX(), #CmdDispatchGraphIndirectAMDX(), #CmdDispatchGraphIndirectCountAMDX(), or {@code vkCmdInitializeGraphScratchMemoryAMDX} with the same execution graph, it <b>must</b> be reinitialized for the execution graph again before dispatching against it.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code scratch} <b>must</b> be the device address of an allocated memory range at least as large as the value of ##VkExecutionGraphPipelineScratchSizeAMDX{@code ::size} returned by ##VkExecutionGraphPipelineScratchSizeAMDX for the currently bound execution graph pipeline.</li>
            <li>{@code scratch} <b>must</b> be a multiple of 64</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Outside</td><td>Outside</td><td>Graphics Compute</td><td>Action</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkDeviceAddress("scratch", "a pointer to the scratch memory to be initialized.")
    )

    void(
        "CmdDispatchGraphAMDX",
        """
        Dispatch an execution graph.

        <h5>C Specification</h5>
        To record an execution graph dispatch, call:

        <pre><code>
￿void vkCmdDispatchGraphAMDX(
￿    VkCommandBuffer                             commandBuffer,
￿    VkDeviceAddress                             scratch,
￿    const VkDispatchGraphCountInfoAMDX*         pCountInfo);</code></pre>

        <h5>Description</h5>
        When this command is executed, the nodes specified in {@code pCountInfo} are executed. Nodes executed as part of this command are not implicitly synchronized in any way against each other once they are dispatched.

        For this command, all device/host pointers in substructures are treated as host pointers and read only during host execution of this command. Once this command returns, no reference to the original pointers is retained.

        Execution of this command <b>may</b> modify any memory locations in the range [{@code scratch},{@code scratch} + {@code size}), where {@code size} is the value returned in ##VkExecutionGraphPipelineScratchSizeAMDX{@code ::size} by ##VkExecutionGraphPipelineScratchSizeAMDX for the currently bound execution graph pipeline Accesses to this memory range are performed in the #PIPELINE_STAGE_2_COMPUTE_SHADER_BIT pipeline stage with the #ACCESS_2_SHADER_STORAGE_READ_BIT and #ACCESS_2_SHADER_STORAGE_WRITE_BIT access flags.

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
            <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
            <li>{@code commandBuffer} <b>must</b> be a primary command buffer</li>
            <li>{@code scratch} <b>must</b> be the device address of an allocated memory range at least as large as the value of ##VkExecutionGraphPipelineScratchSizeAMDX{@code ::size} returned by ##VkExecutionGraphPipelineScratchSizeAMDX for the currently bound execution graph pipeline</li>
            <li>{@code scratch} <b>must</b> be a device address within a {@code VkBuffer} created with the #BUFFER_USAGE_EXECUTION_GRAPH_SCRATCH_BIT_AMDX or #BUFFER_USAGE_2_EXECUTION_GRAPH_SCRATCH_BIT_AMDX flag</li>
            <li>Device memory in the range [{@code scratch},{@code scratch} ##VkExecutionGraphPipelineScratchSizeAMDX{@code ::size}) <b>must</b> have been initialized with #CmdInitializeGraphScratchMemoryAMDX() using the currently bound execution graph pipeline, and not modified after that by anything other than another execution graph dispatch command</li>
            <li>Execution of this command <b>must</b> not cause a node to be dispatched with a larger number of workgroups than that specified by either a {@code MaxNumWorkgroupsAMDX} decoration in the dispatched node or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-maxComputeWorkGroupCount">{@code maxComputeWorkGroupCount}</a></li>
            <li>Execution of this command <b>must</b> not cause any shader to initialize more than <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-maxExecutionGraphShaderPayloadCount">{@code maxExecutionGraphShaderPayloadCount}</a> output payloads</li>
            <li>Execution of this command <b>must</b> not cause any shader that declares {@code NodeMaxPayloadsAMDX} to initialize more output payloads than specified by the max number of payloads for that decoration. This requirement applies to each {@code NodeMaxPayloadsAMDX} decoration separately</li>
            <li>{@code pCountInfo→infos} <b>must</b> be a host pointer to a memory allocation at least as large as the product of {@code count} and {@code stride}</li>
            <li>Host memory locations at indexes in the range [{@code infos}, {@code infos} + ({@code count}*{@code stride})), at a granularity of {@code stride} <b>must</b> contain valid ##VkDispatchGraphInfoAMDX structures in the first 24 bytes</li>
            <li>For each ##VkDispatchGraphInfoAMDX structure in {@code pCountInfo→infos}, {@code payloads} <b>must</b> be a host pointer to a memory allocation at least as large as the product of {@code payloadCount} and {@code payloadStride}</li>
            <li>For each ##VkDispatchGraphInfoAMDX structure in {@code pCountInfo→infos}, {@code nodeIndex} <b>must</b> be a valid node index in the currently bound execution graph pipeline, as returned by #GetExecutionGraphPipelineNodeIndexAMDX()</li>
            <li>For each ##VkDispatchGraphInfoAMDX structure in {@code pCountInfo→infos}, host memory locations at indexes in the range [{@code payloads}, {@code payloads} + ({@code payloadCount} * {@code payloadStride})), at a granularity of {@code payloadStride} <b>must</b> contain a payload matching the size of the input payload expected by the node in {@code nodeIndex} in the first bytes</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pCountInfo} <b>must</b> be a valid pointer to a valid ##VkDispatchGraphCountInfoAMDX structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Outside</td><td>Outside</td><td>Graphics Compute</td><td>Action</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkDispatchGraphCountInfoAMDX
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkDeviceAddress("scratch", "a pointer to the scratch memory to be used."),
        VkDispatchGraphCountInfoAMDX.const.p("pCountInfo", "a host pointer to a ##VkDispatchGraphCountInfoAMDX structure defining the nodes which will be initially executed.")
    )

    void(
        "CmdDispatchGraphIndirectAMDX",
        """
        Dispatch an execution graph with node and payload parameters read on the device.

        <h5>C Specification</h5>
        To record an execution graph dispatch with node and payload parameters read on device, call:

        <pre><code>
￿void vkCmdDispatchGraphIndirectAMDX(
￿    VkCommandBuffer                             commandBuffer,
￿    VkDeviceAddress                             scratch,
￿    const VkDispatchGraphCountInfoAMDX*         pCountInfo);</code></pre>

        <h5>Description</h5>
        When this command is executed, the nodes specified in {@code pCountInfo} are executed. Nodes executed as part of this command are not implicitly synchronized in any way against each other once they are dispatched.

        For this command, all device/host pointers in substructures are treated as device pointers and read during device execution of this command. The allocation and contents of these pointers only needs to be valid during device execution. All of these addresses will be read in the #PIPELINE_STAGE_2_COMPUTE_SHADER_BIT pipeline stage with the #ACCESS_2_SHADER_STORAGE_READ_BIT access flag.

        Execution of this command <b>may</b> modify any memory locations in the range [{@code scratch},{@code scratch} + {@code size}), where {@code size} is the value returned in ##VkExecutionGraphPipelineScratchSizeAMDX{@code ::size} by ##VkExecutionGraphPipelineScratchSizeAMDX for the currently bound execution graph pipeline. Accesses to this memory range are performed in the #PIPELINE_STAGE_2_COMPUTE_SHADER_BIT pipeline stage with the #ACCESS_2_SHADER_STORAGE_READ_BIT and #ACCESS_2_SHADER_STORAGE_WRITE_BIT access flags.

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
            <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
            <li>{@code commandBuffer} <b>must</b> be a primary command buffer</li>
            <li>{@code scratch} <b>must</b> be the device address of an allocated memory range at least as large as the value of ##VkExecutionGraphPipelineScratchSizeAMDX{@code ::size} returned by ##VkExecutionGraphPipelineScratchSizeAMDX for the currently bound execution graph pipeline</li>
            <li>{@code scratch} <b>must</b> be a device address within a {@code VkBuffer} created with the #BUFFER_USAGE_EXECUTION_GRAPH_SCRATCH_BIT_AMDX or #BUFFER_USAGE_2_EXECUTION_GRAPH_SCRATCH_BIT_AMDX flag</li>
            <li>Device memory in the range [{@code scratch},{@code scratch} ##VkExecutionGraphPipelineScratchSizeAMDX{@code ::size}) <b>must</b> have been initialized with #CmdInitializeGraphScratchMemoryAMDX() using the currently bound execution graph pipeline, and not modified after that by anything other than another execution graph dispatch command</li>
            <li>Execution of this command <b>must</b> not cause a node to be dispatched with a larger number of workgroups than that specified by either a {@code MaxNumWorkgroupsAMDX} decoration in the dispatched node or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-maxComputeWorkGroupCount">{@code maxComputeWorkGroupCount}</a></li>
            <li>Execution of this command <b>must</b> not cause any shader to initialize more than <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-maxExecutionGraphShaderPayloadCount">{@code maxExecutionGraphShaderPayloadCount}</a> output payloads</li>
            <li>Execution of this command <b>must</b> not cause any shader that declares {@code NodeMaxPayloadsAMDX} to initialize more output payloads than specified by the max number of payloads for that decoration. This requirement applies to each {@code NodeMaxPayloadsAMDX} decoration separately</li>
            <li>{@code pCountInfo→infos} <b>must</b> be a device pointer to a memory allocation at least as large as the product of {@code count} and {@code stride} when this command is executed on the device</li>
            <li>{@code pCountInfo→infos} <b>must</b> be a device address within a {@code VkBuffer} created with the #BUFFER_USAGE_INDIRECT_BUFFER_BIT flag</li>
            <li>{@code pCountInfo→infos} <b>must</b> be a multiple of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-executionGraphDispatchAddressAlignment">{@code executionGraphDispatchAddressAlignment}</a></li>
            <li>Device memory locations at indexes in the range [{@code infos}, {@code infos} + ({@code count}*{@code stride})), at a granularity of {@code stride} <b>must</b> contain valid ##VkDispatchGraphInfoAMDX structures in the first 24 bytes when this command is executed on the device</li>
            <li>For each ##VkDispatchGraphInfoAMDX structure in {@code pCountInfo→infos}, {@code payloads} <b>must</b> be a device pointer to a memory allocation at least as large as the product of {@code payloadCount} and {@code payloadStride} when this command is executed on the device</li>
            <li>For each ##VkDispatchGraphInfoAMDX structure in {@code pCountInfo→infos}, {@code payloads} <b>must</b> be a device address within a {@code VkBuffer} created with the #BUFFER_USAGE_INDIRECT_BUFFER_BIT flag</li>
            <li>For each ##VkDispatchGraphInfoAMDX structure in {@code pCountInfo→infos}, {@code payloads} <b>must</b> be a multiple of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-executionGraphDispatchAddressAlignment">{@code executionGraphDispatchAddressAlignment}</a></li>
            <li>For each ##VkDispatchGraphInfoAMDX structure in {@code pCountInfo→infos}, {@code nodeIndex} <b>must</b> be a valid node index in the currently bound execution graph pipeline, as returned by #GetExecutionGraphPipelineNodeIndexAMDX() when this command is executed on the device</li>
            <li>For each ##VkDispatchGraphInfoAMDX structure in {@code pCountInfo→infos}, device memory locations at indexes in the range [{@code payloads}, {@code payloads} + ({@code payloadCount} * {@code payloadStride})), at a granularity of {@code payloadStride} <b>must</b> contain a payload matching the size of the input payload expected by the node in {@code nodeIndex} in the first bytes when this command is executed on the device</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pCountInfo} <b>must</b> be a valid pointer to a valid ##VkDispatchGraphCountInfoAMDX structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Outside</td><td>Outside</td><td>Graphics Compute</td><td>Action</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkDispatchGraphCountInfoAMDX
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkDeviceAddress("scratch", "a pointer to the scratch memory to be used."),
        VkDispatchGraphCountInfoAMDX.const.p("pCountInfo", "a host pointer to a ##VkDispatchGraphCountInfoAMDX structure defining the nodes which will be initially executed.")
    )

    void(
        "CmdDispatchGraphIndirectCountAMDX",
        """
        Dispatch an execution graph with all parameters read on the device.

        <h5>C Specification</h5>
        To record an execution graph dispatch with all parameters read on device, call:

        <pre><code>
￿void vkCmdDispatchGraphIndirectCountAMDX(
￿    VkCommandBuffer                             commandBuffer,
￿    VkDeviceAddress                             scratch,
￿    VkDeviceAddress                             countInfo);</code></pre>

        <h5>Description</h5>
        When this command is executed, the nodes specified in {@code countInfo} are executed. Nodes executed as part of this command are not implicitly synchronized in any way against each other once they are dispatched.

        For this command, all pointers in substructures are treated as device pointers and read during device execution of this command. The allocation and contents of these pointers only needs to be valid during device execution. All of these addresses will be read in the #PIPELINE_STAGE_2_COMPUTE_SHADER_BIT pipeline stage with the #ACCESS_2_SHADER_STORAGE_READ_BIT access flag.

        Execution of this command <b>may</b> modify any memory locations in the range [{@code scratch},{@code scratch} + {@code size}), where {@code size} is the value returned in ##VkExecutionGraphPipelineScratchSizeAMDX{@code ::size} by ##VkExecutionGraphPipelineScratchSizeAMDX for the currently bound execution graph pipeline. Accesses to this memory range are performed in the #PIPELINE_STAGE_2_COMPUTE_SHADER_BIT pipeline stage with the #ACCESS_2_SHADER_STORAGE_READ_BIT and #ACCESS_2_SHADER_STORAGE_WRITE_BIT access flags.

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
            <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
            <li>{@code commandBuffer} <b>must</b> be a primary command buffer</li>
            <li>{@code scratch} <b>must</b> be the device address of an allocated memory range at least as large as the value of ##VkExecutionGraphPipelineScratchSizeAMDX{@code ::size} returned by ##VkExecutionGraphPipelineScratchSizeAMDX for the currently bound execution graph pipeline</li>
            <li>{@code scratch} <b>must</b> be a device address within a {@code VkBuffer} created with the #BUFFER_USAGE_EXECUTION_GRAPH_SCRATCH_BIT_AMDX or #BUFFER_USAGE_2_EXECUTION_GRAPH_SCRATCH_BIT_AMDX flag</li>
            <li>Device memory in the range [{@code scratch},{@code scratch} ##VkExecutionGraphPipelineScratchSizeAMDX{@code ::size}) <b>must</b> have been initialized with #CmdInitializeGraphScratchMemoryAMDX() using the currently bound execution graph pipeline, and not modified after that by anything other than another execution graph dispatch command</li>
            <li>Execution of this command <b>must</b> not cause a node to be dispatched with a larger number of workgroups than that specified by either a {@code MaxNumWorkgroupsAMDX} decoration in the dispatched node or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-maxComputeWorkGroupCount">{@code maxComputeWorkGroupCount}</a></li>
            <li>Execution of this command <b>must</b> not cause any shader to initialize more than <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-maxExecutionGraphShaderPayloadCount">{@code maxExecutionGraphShaderPayloadCount}</a> output payloads</li>
            <li>Execution of this command <b>must</b> not cause any shader that declares {@code NodeMaxPayloadsAMDX} to initialize more output payloads than specified by the max number of payloads for that decoration. This requirement applies to each {@code NodeMaxPayloadsAMDX} decoration separately</li>
            <li>{@code countInfo} <b>must</b> be a device pointer to a memory allocation containing a valid ##VkDispatchGraphCountInfoAMDX structure when this command is executed on the device</li>
            <li>{@code countInfo} <b>must</b> be a device address within a {@code VkBuffer} created with the #BUFFER_USAGE_INDIRECT_BUFFER_BIT flag</li>
            <li>{@code countInfo} <b>must</b> be a multiple of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-executionGraphDispatchAddressAlignment">{@code executionGraphDispatchAddressAlignment}</a></li>
            <li>{@code countInfo→infos} <b>must</b> be a device pointer to a memory allocation at least as large as the product of {@code count} and {@code stride} when this command is executed on the device</li>
            <li>{@code countInfo→infos} <b>must</b> be a device address within a {@code VkBuffer} created with the #BUFFER_USAGE_INDIRECT_BUFFER_BIT flag</li>
            <li>{@code countInfo→infos} <b>must</b> be a multiple of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-executionGraphDispatchAddressAlignment">{@code executionGraphDispatchAddressAlignment}</a></li>
            <li>Device memory locations at indexes in the range [{@code infos}, {@code infos} + ({@code count}*{@code stride})), at a granularity of {@code stride} <b>must</b> contain valid ##VkDispatchGraphInfoAMDX structures in the first 24 bytes when this command is executed on the device</li>
            <li>For each ##VkDispatchGraphInfoAMDX structure in {@code countInfo→infos}, {@code payloads} <b>must</b> be a device pointer to a memory allocation at least as large as the product of {@code payloadCount} and {@code payloadStride} when this command is executed on the device</li>
            <li>For each ##VkDispatchGraphInfoAMDX structure in {@code countInfo→infos}, {@code payloads} <b>must</b> be a device address within a {@code VkBuffer} created with the #BUFFER_USAGE_INDIRECT_BUFFER_BIT flag</li>
            <li>For each ##VkDispatchGraphInfoAMDX structure in {@code countInfo→infos}, {@code payloads} <b>must</b> be a multiple of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-executionGraphDispatchAddressAlignment">{@code executionGraphDispatchAddressAlignment}</a></li>
            <li>For each ##VkDispatchGraphInfoAMDX structure in {@code countInfo→infos}, {@code nodeIndex} <b>must</b> be a valid node index in the currently bound execution graph pipeline, as returned by #GetExecutionGraphPipelineNodeIndexAMDX() when this command is executed on the device</li>
            <li>For each ##VkDispatchGraphInfoAMDX structure in {@code countInfo→infos}, device memory locations at indexes in the range [{@code payloads}, {@code payloads} + ({@code payloadCount} * {@code payloadStride})), at a granularity of {@code payloadStride} <b>must</b> contain a payload matching the size of the input payload expected by the node in {@code nodeIndex} in the first bytes when this command is executed on the device</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Outside</td><td>Outside</td><td>Graphics Compute</td><td>Action</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkDeviceAddress("scratch", "a pointer to the scratch memory to be used."),
        VkDeviceAddress("countInfo", "a device address of a ##VkDispatchGraphCountInfoAMDX structure defining the nodes which will be initially executed.")
    )
}