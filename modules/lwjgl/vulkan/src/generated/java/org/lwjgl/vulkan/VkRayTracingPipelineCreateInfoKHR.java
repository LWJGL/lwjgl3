/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created ray tracing pipeline.
 * 
 * <h5>Description</h5>
 * 
 * <p>The parameters {@code basePipelineHandle} and {@code basePipelineIndex} are described in more detail in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-pipeline-derivatives">Pipeline Derivatives</a>.</p>
 * 
 * <p>When {@link KHRPipelineLibrary#VK_PIPELINE_CREATE_LIBRARY_BIT_KHR PIPELINE_CREATE_LIBRARY_BIT_KHR} is specified, this pipeline defines a <em>pipeline library</em> which <b>cannot</b> be bound as a ray tracing pipeline directly. Instead, pipeline libraries define common shaders and shader groups which <b>can</b> be included in future pipeline creation.</p>
 * 
 * <p>If pipeline libraries are included in {@code pLibraryInfo}, shaders defined in those libraries are treated as if they were defined as additional entries in {@code pStages}, appended in the order they appear in the {@code pLibraries} array and in the {@code pStages} array when those libraries were defined.</p>
 * 
 * <p>When referencing shader groups in order to obtain a shader group handle, groups defined in those libraries are treated as if they were defined as additional entries in {@code pGroups}, appended in the order they appear in the {@code pLibraries} array and in the {@code pGroups} array when those libraries were defined. The shaders these groups reference are set when the pipeline library is created, referencing those specified in the pipeline library, not in the pipeline that includes it.</p>
 * 
 * <p>The default stack size for a pipeline if {@link KHRRayTracingPipeline#VK_DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR} is not provided is computed as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#ray-tracing-pipeline-stack">Ray Tracing Pipeline Stack</a>.</p>
 * 
 * <p>If the {@code pNext} chain includes a {@link VkPipelineCreateFlags2CreateInfoKHR} structure, {@link VkPipelineCreateFlags2CreateInfoKHR}{@code ::flags} from that structure is used instead of {@code flags} from this structure.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the {@code pNext} chain does not include a {@link VkPipelineCreateFlags2CreateInfoKHR} structure, {@code flags} <b>must</b> be a valid combination of {@code VkPipelineCreateFlagBits} values</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineIndex} is -1, {@code basePipelineHandle} <b>must</b> be a valid ray tracing {@code VkPipeline} handle</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineHandle} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code basePipelineIndex} <b>must</b> be a valid index into the calling command’s {@code pCreateInfos} parameter</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, {@code basePipelineIndex} <b>must</b> be -1 or {@code basePipelineHandle} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If a push constant block is declared in a shader, a push constant range in {@code layout} <b>must</b> match the shader stage</li>
 * <li>If a push constant block is declared in a shader, the block must be contained inside the push constant range in {@code layout} that matches the stage</li>
 * <li>If a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces-resources">resource variables</a> is declared in a shader, a descriptor slot in {@code layout} <b>must</b> match the shader stage</li>
 * <li>If a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces-resources">resource variables</a> is declared in a shader, and the descriptor type is not {@link EXTMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_EXT DESCRIPTOR_TYPE_MUTABLE_EXT}, a descriptor slot in {@code layout} <b>must</b> match the descriptor type</li>
 * <li>If a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces-resources">resource variables</a> is declared in a shader as an array, a descriptor slot in {@code layout} <b>must</b> match the descriptor count</li>
 * </ul>
 * 
 * <ul>
 * <li>The shader code for the entry points identified by {@code pStages}, and the rest of the state identified by this structure <b>must</b> adhere to the pipeline linking rules described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces">Shader Interfaces</a> chapter</li>
 * <li>The number of resources in {@code layout} accessible to each shader stage that is used by the pipeline <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPerStageResources}</li>
 * <li>{@code flags} <b>must</b> not include {@link NVDeviceGeneratedCommands#VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV}</li>
 * <li>{@code flags} <b>must</b> not include {@link EXTDeviceGeneratedCommands#VK_PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_EXT PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_EXT}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineCreationCacheControl">{@code pipelineCreationCacheControl}</a> feature is not enabled, {@code flags} <b>must</b> not include {@link VK13#VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT} or {@link VK13#VK_PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT}</li>
 * <li>If {@code flags} does not include {@link KHRPipelineLibrary#VK_PIPELINE_CREATE_LIBRARY_BIT_KHR PIPELINE_CREATE_LIBRARY_BIT_KHR}, the {@code stage} member of at least one element of {@code pStages}, including those implicitly added by {@code pLibraryInfo}, <b>must</b> be {@link KHRRayTracingPipeline#VK_SHADER_STAGE_RAYGEN_BIT_KHR SHADER_STAGE_RAYGEN_BIT_KHR}</li>
 * <li>{@code maxPipelineRayRecursionDepth} <b>must</b> be less than or equal to {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::maxRayRecursionDepth}</li>
 * <li>If {@code flags} includes {@link KHRPipelineLibrary#VK_PIPELINE_CREATE_LIBRARY_BIT_KHR PIPELINE_CREATE_LIBRARY_BIT_KHR}, {@code pLibraryInterface} <b>must</b> not be {@code NULL}</li>
 * <li>If {@code pLibraryInfo} is not {@code NULL} and its {@code libraryCount} member is greater than 0, {@code pLibraryInterface} <b>must</b> not be {@code NULL}</li>
 * <li>Each element of {@code pLibraryInfo→pLibraries} <b>must</b> have been created with the value of {@code maxPipelineRayRecursionDepth} equal to that in this pipeline</li>
 * <li>If {@code pLibraryInfo} is not {@code NULL}, each element of its {@code pLibraries} member <b>must</b> have been created with a {@code layout} that is compatible with the {@code layout} in this pipeline</li>
 * <li>If {@code pLibraryInfo} is not {@code NULL}, each element of its {@code pLibraries} member <b>must</b> have been created with values of the {@code maxPipelineRayPayloadSize} and {@code maxPipelineRayHitAttributeSize} members of {@code pLibraryInterface} equal to those in this pipeline</li>
 * <li>If {@code flags} includes {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR}, each element of {@code pLibraryInfo→pLibraries} <b>must</b> have been created with the {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR} bit set</li>
 * <li>If {@code flags} includes {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR}, each element of {@code pLibraryInfo→pLibraries} <b>must</b> have been created with the {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR} bit set</li>
 * <li>If {@code flags} includes {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR}, each element of {@code pLibraryInfo→pLibraries} <b>must</b> have been created with the {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR} bit set</li>
 * <li>If {@code flags} includes {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR}, each element of {@code pLibraryInfo→pLibraries} <b>must</b> have been created with the {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR} bit set</li>
 * <li>If {@code flags} includes {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR}, each element of {@code pLibraryInfo→pLibraries} <b>must</b> have been created with the {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR} bit set</li>
 * <li>If {@code flags} includes {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR}, each element of {@code pLibraryInfo→pLibraries} <b>must</b> have been created with the {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR} bit set</li>
 * <li>If {@code flags} includes {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR}, each element of {@code pLibraryInfo→pLibraries} <b>must</b> have been created with the {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR} bit set</li>
 * <li>If the {@link KHRPipelineLibrary VK_KHR_pipeline_library} extension is not enabled, {@code pLibraryInfo} and {@code pLibraryInterface} <b>must</b> be {@code NULL}</li>
 * <li>If {@code flags} includes {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR}, for any element of {@code pGroups} with a {@code type} of {@link KHRRayTracingPipeline#VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR} or {@link KHRRayTracingPipeline#VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR}, the {@code anyHitShader} of that element <b>must</b> not be {@link KHRRayTracingPipeline#VK_SHADER_UNUSED_KHR SHADER_UNUSED_KHR}</li>
 * <li>If {@code flags} includes {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR}, for any element of {@code pGroups} with a {@code type} of {@link KHRRayTracingPipeline#VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR} or {@link KHRRayTracingPipeline#VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR}, the {@code closestHitShader} of that element <b>must</b> not be {@link KHRRayTracingPipeline#VK_SHADER_UNUSED_KHR SHADER_UNUSED_KHR}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-rayTraversalPrimitiveCulling">{@code rayTraversalPrimitiveCulling}</a> feature is not enabled, {@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-rayTraversalPrimitiveCulling">{@code rayTraversalPrimitiveCulling}</a> feature is not enabled, {@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include both {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR} and {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR}</li>
 * <li>If {@code flags} includes {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR}, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-rayTracingPipelineShaderGroupHandleCaptureReplay">{@code rayTracingPipelineShaderGroupHandleCaptureReplay}</a> <b>must</b> be enabled</li>
 * <li>If {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR}{@code ::rayTracingPipelineShaderGroupHandleCaptureReplay} is {@link VK10#VK_TRUE TRUE} and the {@code pShaderGroupCaptureReplayHandle} member of any element of {@code pGroups} is not {@code NULL}, {@code flags} <b>must</b> include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR}</li>
 * <li>If {@code pLibraryInfo} is {@code NULL} or its {@code libraryCount} is 0, {@code stageCount} <b>must</b> not be 0</li>
 * <li>If {@code flags} does not include {@link KHRPipelineLibrary#VK_PIPELINE_CREATE_LIBRARY_BIT_KHR PIPELINE_CREATE_LIBRARY_BIT_KHR} and either {@code pLibraryInfo} is {@code NULL} or its {@code libraryCount} is 0, {@code groupCount} <b>must</b> not be 0</li>
 * <li>Any element of the {@code pDynamicStates} member of {@code pDynamicState} <b>must</b> be {@link KHRRayTracingPipeline#VK_DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR}</li>
 * <li>If {@link VkPipelineCreationFeedbackCreateInfo}{@code ::pipelineStageCreationFeedbackCount} is not 0, it <b>must</b> be equal to {@code stageCount}</li>
 * <li>The {@code stage} value in all {@code pStages} elements <b>must</b> be one of {@link KHRRayTracingPipeline#VK_SHADER_STAGE_RAYGEN_BIT_KHR SHADER_STAGE_RAYGEN_BIT_KHR}, {@link KHRRayTracingPipeline#VK_SHADER_STAGE_ANY_HIT_BIT_KHR SHADER_STAGE_ANY_HIT_BIT_KHR}, {@link KHRRayTracingPipeline#VK_SHADER_STAGE_CLOSEST_HIT_BIT_KHR SHADER_STAGE_CLOSEST_HIT_BIT_KHR}, {@link KHRRayTracingPipeline#VK_SHADER_STAGE_MISS_BIT_KHR SHADER_STAGE_MISS_BIT_KHR}, {@link KHRRayTracingPipeline#VK_SHADER_STAGE_INTERSECTION_BIT_KHR SHADER_STAGE_INTERSECTION_BIT_KHR}, or {@link KHRRayTracingPipeline#VK_SHADER_STAGE_CALLABLE_BIT_KHR SHADER_STAGE_CALLABLE_BIT_KHR}</li>
 * <li>If {@code flags} includes {@link EXTOpacityMicromap#VK_PIPELINE_CREATE_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT PIPELINE_CREATE_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT}, each element of {@code pLibraryInfo→pLibraries} <b>must</b> have been created with the {@link EXTOpacityMicromap#VK_PIPELINE_CREATE_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT PIPELINE_CREATE_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT} bit set</li>
 * <li>If {@code flags} includes {@link NVDisplacementMicromap#VK_PIPELINE_CREATE_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV PIPELINE_CREATE_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV}, each element of {@code pLibraryInfo→pLibraries} <b>must</b> have been created with the {@link NVDisplacementMicromap#VK_PIPELINE_CREATE_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV PIPELINE_CREATE_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV} bit set</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkPipelineBinaryInfoKHR}, {@link VkPipelineCreateFlags2CreateInfoKHR}, {@link VkPipelineCreationFeedbackCreateInfo}, or {@link VkPipelineRobustnessCreateInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>If {@code stageCount} is not 0, {@code pStages} <b>must</b> be a valid pointer to an array of {@code stageCount} valid {@link VkPipelineShaderStageCreateInfo} structures</li>
 * <li>If {@code groupCount} is not 0, {@code pGroups} <b>must</b> be a valid pointer to an array of {@code groupCount} valid {@link VkRayTracingShaderGroupCreateInfoKHR} structures</li>
 * <li>If {@code pLibraryInfo} is not {@code NULL}, {@code pLibraryInfo} <b>must</b> be a valid pointer to a valid {@link VkPipelineLibraryCreateInfoKHR} structure</li>
 * <li>If {@code pLibraryInterface} is not {@code NULL}, {@code pLibraryInterface} <b>must</b> be a valid pointer to a valid {@link VkRayTracingPipelineInterfaceCreateInfoKHR} structure</li>
 * <li>If {@code pDynamicState} is not {@code NULL}, {@code pDynamicState} <b>must</b> be a valid pointer to a valid {@link VkPipelineDynamicStateCreateInfo} structure</li>
 * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>Both of {@code basePipelineHandle}, and {@code layout} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineDynamicStateCreateInfo}, {@link VkPipelineLibraryCreateInfoKHR}, {@link VkPipelineShaderStageCreateInfo}, {@link VkRayTracingPipelineInterfaceCreateInfoKHR}, {@link VkRayTracingShaderGroupCreateInfoKHR}, {@link KHRRayTracingPipeline#vkCreateRayTracingPipelinesKHR CreateRayTracingPipelinesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRayTracingPipelineCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineCreateFlags {@link #flags};
 *     uint32_t {@link #stageCount};
 *     {@link VkPipelineShaderStageCreateInfo VkPipelineShaderStageCreateInfo} const * {@link #pStages};
 *     uint32_t {@link #groupCount};
 *     {@link VkRayTracingShaderGroupCreateInfoKHR VkRayTracingShaderGroupCreateInfoKHR} const * {@link #pGroups};
 *     uint32_t {@link #maxPipelineRayRecursionDepth};
 *     {@link VkPipelineLibraryCreateInfoKHR VkPipelineLibraryCreateInfoKHR} const * {@link #pLibraryInfo};
 *     {@link VkRayTracingPipelineInterfaceCreateInfoKHR VkRayTracingPipelineInterfaceCreateInfoKHR} const * {@link #pLibraryInterface};
 *     {@link VkPipelineDynamicStateCreateInfo VkPipelineDynamicStateCreateInfo} const * {@link #pDynamicState};
 *     VkPipelineLayout {@link #layout};
 *     VkPipeline {@link #basePipelineHandle};
 *     int32_t {@link #basePipelineIndex};
 * }</code></pre>
 */
public class VkRayTracingPipelineCreateInfoKHR extends Struct<VkRayTracingPipelineCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        STAGECOUNT,
        PSTAGES,
        GROUPCOUNT,
        PGROUPS,
        MAXPIPELINERAYRECURSIONDEPTH,
        PLIBRARYINFO,
        PLIBRARYINTERFACE,
        PDYNAMICSTATE,
        LAYOUT,
        BASEPIPELINEHANDLE,
        BASEPIPELINEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        STAGECOUNT = layout.offsetof(3);
        PSTAGES = layout.offsetof(4);
        GROUPCOUNT = layout.offsetof(5);
        PGROUPS = layout.offsetof(6);
        MAXPIPELINERAYRECURSIONDEPTH = layout.offsetof(7);
        PLIBRARYINFO = layout.offsetof(8);
        PLIBRARYINTERFACE = layout.offsetof(9);
        PDYNAMICSTATE = layout.offsetof(10);
        LAYOUT = layout.offsetof(11);
        BASEPIPELINEHANDLE = layout.offsetof(12);
        BASEPIPELINEINDEX = layout.offsetof(13);
    }

    protected VkRayTracingPipelineCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRayTracingPipelineCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkRayTracingPipelineCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkRayTracingPipelineCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRayTracingPipelineCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkPipelineCreateFlagBits} specifying how the pipeline will be generated. */
    @NativeType("VkPipelineCreateFlags")
    public int flags() { return nflags(address()); }
    /** the number of entries in the {@code pStages} array. */
    @NativeType("uint32_t")
    public int stageCount() { return nstageCount(address()); }
    /** a pointer to an array of {@code stageCount} {@link VkPipelineShaderStageCreateInfo} structures describing the set of the shader stages to be included in the ray tracing pipeline. */
    @NativeType("VkPipelineShaderStageCreateInfo const *")
    public VkPipelineShaderStageCreateInfo.@Nullable Buffer pStages() { return npStages(address()); }
    /** the number of entries in the {@code pGroups} array. */
    @NativeType("uint32_t")
    public int groupCount() { return ngroupCount(address()); }
    /** a pointer to an array of {@code groupCount} {@link VkRayTracingShaderGroupCreateInfoKHR} structures describing the set of the shader stages to be included in each shader group in the ray tracing pipeline. */
    @NativeType("VkRayTracingShaderGroupCreateInfoKHR const *")
    public VkRayTracingShaderGroupCreateInfoKHR.@Nullable Buffer pGroups() { return npGroups(address()); }
    /** the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#ray-tracing-recursion-depth">maximum recursion depth</a> of shaders executed by this pipeline. */
    @NativeType("uint32_t")
    public int maxPipelineRayRecursionDepth() { return nmaxPipelineRayRecursionDepth(address()); }
    /** a pointer to a {@link VkPipelineLibraryCreateInfoKHR} structure defining pipeline libraries to include. */
    @NativeType("VkPipelineLibraryCreateInfoKHR const *")
    public @Nullable VkPipelineLibraryCreateInfoKHR pLibraryInfo() { return npLibraryInfo(address()); }
    /** a pointer to a {@link VkRayTracingPipelineInterfaceCreateInfoKHR} structure defining additional information when using pipeline libraries. */
    @NativeType("VkRayTracingPipelineInterfaceCreateInfoKHR const *")
    public @Nullable VkRayTracingPipelineInterfaceCreateInfoKHR pLibraryInterface() { return npLibraryInterface(address()); }
    /** a pointer to a {@link VkPipelineDynamicStateCreateInfo} structure, and is used to indicate which properties of the pipeline state object are dynamic and <b>can</b> be changed independently of the pipeline state. This <b>can</b> be {@code NULL}, which means no state in the pipeline is considered dynamic. */
    @NativeType("VkPipelineDynamicStateCreateInfo const *")
    public @Nullable VkPipelineDynamicStateCreateInfo pDynamicState() { return npDynamicState(address()); }
    /** the description of binding locations used by both the pipeline and descriptor sets used with the pipeline. */
    @NativeType("VkPipelineLayout")
    public long layout() { return nlayout(address()); }
    /** a pipeline to derive from. */
    @NativeType("VkPipeline")
    public long basePipelineHandle() { return nbasePipelineHandle(address()); }
    /** an index into the {@code pCreateInfos} parameter to use as a pipeline to derive from. */
    @NativeType("int32_t")
    public int basePipelineIndex() { return nbasePipelineIndex(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkRayTracingPipelineCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkRayTracingPipelineCreateInfoKHR sType$Default() { return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkRayTracingPipelineCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineBinaryInfoKHR} value to the {@code pNext} chain. */
    public VkRayTracingPipelineCreateInfoKHR pNext(VkPipelineBinaryInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreateFlags2CreateInfoKHR} value to the {@code pNext} chain. */
    public VkRayTracingPipelineCreateInfoKHR pNext(VkPipelineCreateFlags2CreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
    public VkRayTracingPipelineCreateInfoKHR pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
    public VkRayTracingPipelineCreateInfoKHR pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineRobustnessCreateInfoEXT} value to the {@code pNext} chain. */
    public VkRayTracingPipelineCreateInfoKHR pNext(VkPipelineRobustnessCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkRayTracingPipelineCreateInfoKHR flags(@NativeType("VkPipelineCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@link #pStages} field. */
    public VkRayTracingPipelineCreateInfoKHR pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.@Nullable Buffer value) { npStages(address(), value); return this; }
    /** Sets the address of the specified {@link VkRayTracingShaderGroupCreateInfoKHR.Buffer} to the {@link #pGroups} field. */
    public VkRayTracingPipelineCreateInfoKHR pGroups(@NativeType("VkRayTracingShaderGroupCreateInfoKHR const *") VkRayTracingShaderGroupCreateInfoKHR.@Nullable Buffer value) { npGroups(address(), value); return this; }
    /** Sets the specified value to the {@link #maxPipelineRayRecursionDepth} field. */
    public VkRayTracingPipelineCreateInfoKHR maxPipelineRayRecursionDepth(@NativeType("uint32_t") int value) { nmaxPipelineRayRecursionDepth(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineLibraryCreateInfoKHR} to the {@link #pLibraryInfo} field. */
    public VkRayTracingPipelineCreateInfoKHR pLibraryInfo(@Nullable @NativeType("VkPipelineLibraryCreateInfoKHR const *") VkPipelineLibraryCreateInfoKHR value) { npLibraryInfo(address(), value); return this; }
    /** Sets the address of the specified {@link VkRayTracingPipelineInterfaceCreateInfoKHR} to the {@link #pLibraryInterface} field. */
    public VkRayTracingPipelineCreateInfoKHR pLibraryInterface(@Nullable @NativeType("VkRayTracingPipelineInterfaceCreateInfoKHR const *") VkRayTracingPipelineInterfaceCreateInfoKHR value) { npLibraryInterface(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineDynamicStateCreateInfo} to the {@link #pDynamicState} field. */
    public VkRayTracingPipelineCreateInfoKHR pDynamicState(@Nullable @NativeType("VkPipelineDynamicStateCreateInfo const *") VkPipelineDynamicStateCreateInfo value) { npDynamicState(address(), value); return this; }
    /** Sets the specified value to the {@link #layout} field. */
    public VkRayTracingPipelineCreateInfoKHR layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@link #basePipelineHandle} field. */
    public VkRayTracingPipelineCreateInfoKHR basePipelineHandle(@NativeType("VkPipeline") long value) { nbasePipelineHandle(address(), value); return this; }
    /** Sets the specified value to the {@link #basePipelineIndex} field. */
    public VkRayTracingPipelineCreateInfoKHR basePipelineIndex(@NativeType("int32_t") int value) { nbasePipelineIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRayTracingPipelineCreateInfoKHR set(
        int sType,
        long pNext,
        int flags,
        VkPipelineShaderStageCreateInfo.@Nullable Buffer pStages,
        VkRayTracingShaderGroupCreateInfoKHR.@Nullable Buffer pGroups,
        int maxPipelineRayRecursionDepth,
        @Nullable VkPipelineLibraryCreateInfoKHR pLibraryInfo,
        @Nullable VkRayTracingPipelineInterfaceCreateInfoKHR pLibraryInterface,
        @Nullable VkPipelineDynamicStateCreateInfo pDynamicState,
        long layout,
        long basePipelineHandle,
        int basePipelineIndex
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pStages(pStages);
        pGroups(pGroups);
        maxPipelineRayRecursionDepth(maxPipelineRayRecursionDepth);
        pLibraryInfo(pLibraryInfo);
        pLibraryInterface(pLibraryInterface);
        pDynamicState(pDynamicState);
        layout(layout);
        basePipelineHandle(basePipelineHandle);
        basePipelineIndex(basePipelineIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRayTracingPipelineCreateInfoKHR set(VkRayTracingPipelineCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRayTracingPipelineCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRayTracingPipelineCreateInfoKHR malloc() {
        return new VkRayTracingPipelineCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRayTracingPipelineCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRayTracingPipelineCreateInfoKHR calloc() {
        return new VkRayTracingPipelineCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRayTracingPipelineCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkRayTracingPipelineCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRayTracingPipelineCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkRayTracingPipelineCreateInfoKHR} instance for the specified memory address. */
    public static VkRayTracingPipelineCreateInfoKHR create(long address) {
        return new VkRayTracingPipelineCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRayTracingPipelineCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkRayTracingPipelineCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRayTracingPipelineCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRayTracingPipelineCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRayTracingPipelineCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRayTracingPipelineCreateInfoKHR malloc(MemoryStack stack) {
        return new VkRayTracingPipelineCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRayTracingPipelineCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRayTracingPipelineCreateInfoKHR calloc(MemoryStack stack) {
        return new VkRayTracingPipelineCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRayTracingPipelineCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRayTracingPipelineCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkRayTracingPipelineCreateInfoKHR.FLAGS); }
    /** Unsafe version of {@link #stageCount}. */
    public static int nstageCount(long struct) { return memGetInt(struct + VkRayTracingPipelineCreateInfoKHR.STAGECOUNT); }
    /** Unsafe version of {@link #pStages}. */
    public static VkPipelineShaderStageCreateInfo.@Nullable Buffer npStages(long struct) { return VkPipelineShaderStageCreateInfo.createSafe(memGetAddress(struct + VkRayTracingPipelineCreateInfoKHR.PSTAGES), nstageCount(struct)); }
    /** Unsafe version of {@link #groupCount}. */
    public static int ngroupCount(long struct) { return memGetInt(struct + VkRayTracingPipelineCreateInfoKHR.GROUPCOUNT); }
    /** Unsafe version of {@link #pGroups}. */
    public static VkRayTracingShaderGroupCreateInfoKHR.@Nullable Buffer npGroups(long struct) { return VkRayTracingShaderGroupCreateInfoKHR.createSafe(memGetAddress(struct + VkRayTracingPipelineCreateInfoKHR.PGROUPS), ngroupCount(struct)); }
    /** Unsafe version of {@link #maxPipelineRayRecursionDepth}. */
    public static int nmaxPipelineRayRecursionDepth(long struct) { return memGetInt(struct + VkRayTracingPipelineCreateInfoKHR.MAXPIPELINERAYRECURSIONDEPTH); }
    /** Unsafe version of {@link #pLibraryInfo}. */
    public static @Nullable VkPipelineLibraryCreateInfoKHR npLibraryInfo(long struct) { return VkPipelineLibraryCreateInfoKHR.createSafe(memGetAddress(struct + VkRayTracingPipelineCreateInfoKHR.PLIBRARYINFO)); }
    /** Unsafe version of {@link #pLibraryInterface}. */
    public static @Nullable VkRayTracingPipelineInterfaceCreateInfoKHR npLibraryInterface(long struct) { return VkRayTracingPipelineInterfaceCreateInfoKHR.createSafe(memGetAddress(struct + VkRayTracingPipelineCreateInfoKHR.PLIBRARYINTERFACE)); }
    /** Unsafe version of {@link #pDynamicState}. */
    public static @Nullable VkPipelineDynamicStateCreateInfo npDynamicState(long struct) { return VkPipelineDynamicStateCreateInfo.createSafe(memGetAddress(struct + VkRayTracingPipelineCreateInfoKHR.PDYNAMICSTATE)); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return memGetLong(struct + VkRayTracingPipelineCreateInfoKHR.LAYOUT); }
    /** Unsafe version of {@link #basePipelineHandle}. */
    public static long nbasePipelineHandle(long struct) { return memGetLong(struct + VkRayTracingPipelineCreateInfoKHR.BASEPIPELINEHANDLE); }
    /** Unsafe version of {@link #basePipelineIndex}. */
    public static int nbasePipelineIndex(long struct) { return memGetInt(struct + VkRayTracingPipelineCreateInfoKHR.BASEPIPELINEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRayTracingPipelineCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRayTracingPipelineCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkRayTracingPipelineCreateInfoKHR.FLAGS, value); }
    /** Sets the specified value to the {@code stageCount} field of the specified {@code struct}. */
    public static void nstageCount(long struct, int value) { memPutInt(struct + VkRayTracingPipelineCreateInfoKHR.STAGECOUNT, value); }
    /** Unsafe version of {@link #pStages(VkPipelineShaderStageCreateInfo.Buffer) pStages}. */
    public static void npStages(long struct, VkPipelineShaderStageCreateInfo.@Nullable Buffer value) { memPutAddress(struct + VkRayTracingPipelineCreateInfoKHR.PSTAGES, memAddressSafe(value)); nstageCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code groupCount} field of the specified {@code struct}. */
    public static void ngroupCount(long struct, int value) { memPutInt(struct + VkRayTracingPipelineCreateInfoKHR.GROUPCOUNT, value); }
    /** Unsafe version of {@link #pGroups(VkRayTracingShaderGroupCreateInfoKHR.Buffer) pGroups}. */
    public static void npGroups(long struct, VkRayTracingShaderGroupCreateInfoKHR.@Nullable Buffer value) { memPutAddress(struct + VkRayTracingPipelineCreateInfoKHR.PGROUPS, memAddressSafe(value)); ngroupCount(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #maxPipelineRayRecursionDepth(int) maxPipelineRayRecursionDepth}. */
    public static void nmaxPipelineRayRecursionDepth(long struct, int value) { memPutInt(struct + VkRayTracingPipelineCreateInfoKHR.MAXPIPELINERAYRECURSIONDEPTH, value); }
    /** Unsafe version of {@link #pLibraryInfo(VkPipelineLibraryCreateInfoKHR) pLibraryInfo}. */
    public static void npLibraryInfo(long struct, @Nullable VkPipelineLibraryCreateInfoKHR value) { memPutAddress(struct + VkRayTracingPipelineCreateInfoKHR.PLIBRARYINFO, memAddressSafe(value)); }
    /** Unsafe version of {@link #pLibraryInterface(VkRayTracingPipelineInterfaceCreateInfoKHR) pLibraryInterface}. */
    public static void npLibraryInterface(long struct, @Nullable VkRayTracingPipelineInterfaceCreateInfoKHR value) { memPutAddress(struct + VkRayTracingPipelineCreateInfoKHR.PLIBRARYINTERFACE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pDynamicState(VkPipelineDynamicStateCreateInfo) pDynamicState}. */
    public static void npDynamicState(long struct, @Nullable VkPipelineDynamicStateCreateInfo value) { memPutAddress(struct + VkRayTracingPipelineCreateInfoKHR.PDYNAMICSTATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { memPutLong(struct + VkRayTracingPipelineCreateInfoKHR.LAYOUT, value); }
    /** Unsafe version of {@link #basePipelineHandle(long) basePipelineHandle}. */
    public static void nbasePipelineHandle(long struct, long value) { memPutLong(struct + VkRayTracingPipelineCreateInfoKHR.BASEPIPELINEHANDLE, value); }
    /** Unsafe version of {@link #basePipelineIndex(int) basePipelineIndex}. */
    public static void nbasePipelineIndex(long struct, int value) { memPutInt(struct + VkRayTracingPipelineCreateInfoKHR.BASEPIPELINEINDEX, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int stageCount = nstageCount(struct);
        if (stageCount != 0) {
            long pStages = memGetAddress(struct + VkRayTracingPipelineCreateInfoKHR.PSTAGES);
            check(pStages);
            validate(pStages, stageCount, VkPipelineShaderStageCreateInfo.SIZEOF, VkPipelineShaderStageCreateInfo::validate);
        }
        if (ngroupCount(struct) != 0) {
            check(memGetAddress(struct + VkRayTracingPipelineCreateInfoKHR.PGROUPS));
        }
        long pLibraryInfo = memGetAddress(struct + VkRayTracingPipelineCreateInfoKHR.PLIBRARYINFO);
        if (pLibraryInfo != NULL) {
            VkPipelineLibraryCreateInfoKHR.validate(pLibraryInfo);
        }
        long pDynamicState = memGetAddress(struct + VkRayTracingPipelineCreateInfoKHR.PDYNAMICSTATE);
        if (pDynamicState != NULL) {
            VkPipelineDynamicStateCreateInfo.validate(pDynamicState);
        }
    }

    // -----------------------------------

    /** An array of {@link VkRayTracingPipelineCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkRayTracingPipelineCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkRayTracingPipelineCreateInfoKHR ELEMENT_FACTORY = VkRayTracingPipelineCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkRayTracingPipelineCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRayTracingPipelineCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkRayTracingPipelineCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRayTracingPipelineCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRayTracingPipelineCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkRayTracingPipelineCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRayTracingPipelineCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkRayTracingPipelineCreateInfoKHR#flags} field. */
        @NativeType("VkPipelineCreateFlags")
        public int flags() { return VkRayTracingPipelineCreateInfoKHR.nflags(address()); }
        /** @return the value of the {@link VkRayTracingPipelineCreateInfoKHR#stageCount} field. */
        @NativeType("uint32_t")
        public int stageCount() { return VkRayTracingPipelineCreateInfoKHR.nstageCount(address()); }
        /** @return a {@link VkPipelineShaderStageCreateInfo.Buffer} view of the struct array pointed to by the {@link VkRayTracingPipelineCreateInfoKHR#pStages} field. */
        @NativeType("VkPipelineShaderStageCreateInfo const *")
        public VkPipelineShaderStageCreateInfo.@Nullable Buffer pStages() { return VkRayTracingPipelineCreateInfoKHR.npStages(address()); }
        /** @return the value of the {@link VkRayTracingPipelineCreateInfoKHR#groupCount} field. */
        @NativeType("uint32_t")
        public int groupCount() { return VkRayTracingPipelineCreateInfoKHR.ngroupCount(address()); }
        /** @return a {@link VkRayTracingShaderGroupCreateInfoKHR.Buffer} view of the struct array pointed to by the {@link VkRayTracingPipelineCreateInfoKHR#pGroups} field. */
        @NativeType("VkRayTracingShaderGroupCreateInfoKHR const *")
        public VkRayTracingShaderGroupCreateInfoKHR.@Nullable Buffer pGroups() { return VkRayTracingPipelineCreateInfoKHR.npGroups(address()); }
        /** @return the value of the {@link VkRayTracingPipelineCreateInfoKHR#maxPipelineRayRecursionDepth} field. */
        @NativeType("uint32_t")
        public int maxPipelineRayRecursionDepth() { return VkRayTracingPipelineCreateInfoKHR.nmaxPipelineRayRecursionDepth(address()); }
        /** @return a {@link VkPipelineLibraryCreateInfoKHR} view of the struct pointed to by the {@link VkRayTracingPipelineCreateInfoKHR#pLibraryInfo} field. */
        @NativeType("VkPipelineLibraryCreateInfoKHR const *")
        public @Nullable VkPipelineLibraryCreateInfoKHR pLibraryInfo() { return VkRayTracingPipelineCreateInfoKHR.npLibraryInfo(address()); }
        /** @return a {@link VkRayTracingPipelineInterfaceCreateInfoKHR} view of the struct pointed to by the {@link VkRayTracingPipelineCreateInfoKHR#pLibraryInterface} field. */
        @NativeType("VkRayTracingPipelineInterfaceCreateInfoKHR const *")
        public @Nullable VkRayTracingPipelineInterfaceCreateInfoKHR pLibraryInterface() { return VkRayTracingPipelineCreateInfoKHR.npLibraryInterface(address()); }
        /** @return a {@link VkPipelineDynamicStateCreateInfo} view of the struct pointed to by the {@link VkRayTracingPipelineCreateInfoKHR#pDynamicState} field. */
        @NativeType("VkPipelineDynamicStateCreateInfo const *")
        public @Nullable VkPipelineDynamicStateCreateInfo pDynamicState() { return VkRayTracingPipelineCreateInfoKHR.npDynamicState(address()); }
        /** @return the value of the {@link VkRayTracingPipelineCreateInfoKHR#layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkRayTracingPipelineCreateInfoKHR.nlayout(address()); }
        /** @return the value of the {@link VkRayTracingPipelineCreateInfoKHR#basePipelineHandle} field. */
        @NativeType("VkPipeline")
        public long basePipelineHandle() { return VkRayTracingPipelineCreateInfoKHR.nbasePipelineHandle(address()); }
        /** @return the value of the {@link VkRayTracingPipelineCreateInfoKHR#basePipelineIndex} field. */
        @NativeType("int32_t")
        public int basePipelineIndex() { return VkRayTracingPipelineCreateInfoKHR.nbasePipelineIndex(address()); }

        /** Sets the specified value to the {@link VkRayTracingPipelineCreateInfoKHR#sType} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRayTracingPipelineCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR} value to the {@link VkRayTracingPipelineCreateInfoKHR#sType} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer sType$Default() { return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkRayTracingPipelineCreateInfoKHR#pNext} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkRayTracingPipelineCreateInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineBinaryInfoKHR} value to the {@code pNext} chain. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pNext(VkPipelineBinaryInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreateFlags2CreateInfoKHR} value to the {@code pNext} chain. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pNext(VkPipelineCreateFlags2CreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineRobustnessCreateInfoEXT} value to the {@code pNext} chain. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pNext(VkPipelineRobustnessCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkRayTracingPipelineCreateInfoKHR#flags} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer flags(@NativeType("VkPipelineCreateFlags") int value) { VkRayTracingPipelineCreateInfoKHR.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@link VkRayTracingPipelineCreateInfoKHR#pStages} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.@Nullable Buffer value) { VkRayTracingPipelineCreateInfoKHR.npStages(address(), value); return this; }
        /** Sets the address of the specified {@link VkRayTracingShaderGroupCreateInfoKHR.Buffer} to the {@link VkRayTracingPipelineCreateInfoKHR#pGroups} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pGroups(@NativeType("VkRayTracingShaderGroupCreateInfoKHR const *") VkRayTracingShaderGroupCreateInfoKHR.@Nullable Buffer value) { VkRayTracingPipelineCreateInfoKHR.npGroups(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingPipelineCreateInfoKHR#maxPipelineRayRecursionDepth} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer maxPipelineRayRecursionDepth(@NativeType("uint32_t") int value) { VkRayTracingPipelineCreateInfoKHR.nmaxPipelineRayRecursionDepth(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineLibraryCreateInfoKHR} to the {@link VkRayTracingPipelineCreateInfoKHR#pLibraryInfo} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pLibraryInfo(@Nullable @NativeType("VkPipelineLibraryCreateInfoKHR const *") VkPipelineLibraryCreateInfoKHR value) { VkRayTracingPipelineCreateInfoKHR.npLibraryInfo(address(), value); return this; }
        /** Sets the address of the specified {@link VkRayTracingPipelineInterfaceCreateInfoKHR} to the {@link VkRayTracingPipelineCreateInfoKHR#pLibraryInterface} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pLibraryInterface(@Nullable @NativeType("VkRayTracingPipelineInterfaceCreateInfoKHR const *") VkRayTracingPipelineInterfaceCreateInfoKHR value) { VkRayTracingPipelineCreateInfoKHR.npLibraryInterface(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineDynamicStateCreateInfo} to the {@link VkRayTracingPipelineCreateInfoKHR#pDynamicState} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pDynamicState(@Nullable @NativeType("VkPipelineDynamicStateCreateInfo const *") VkPipelineDynamicStateCreateInfo value) { VkRayTracingPipelineCreateInfoKHR.npDynamicState(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingPipelineCreateInfoKHR#layout} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkRayTracingPipelineCreateInfoKHR.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingPipelineCreateInfoKHR#basePipelineHandle} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer basePipelineHandle(@NativeType("VkPipeline") long value) { VkRayTracingPipelineCreateInfoKHR.nbasePipelineHandle(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingPipelineCreateInfoKHR#basePipelineIndex} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer basePipelineIndex(@NativeType("int32_t") int value) { VkRayTracingPipelineCreateInfoKHR.nbasePipelineIndex(address(), value); return this; }

    }

}