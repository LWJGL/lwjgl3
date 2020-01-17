/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created graphics pipeline.
 * 
 * <h5>Description</h5>
 * 
 * <p>The parameters {@code basePipelineHandle} and {@code basePipelineIndex} are described in more detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#pipelines-pipeline-derivatives">Pipeline Derivatives</a>.</p>
 * 
 * <p>If any shader stage fails to compile, the compile log will be reported back to the application, and {@link NVGLSLShader#VK_ERROR_INVALID_SHADER_NV ERROR_INVALID_SHADER_NV} will be generated.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineIndex} is -1, {@code basePipelineHandle} <b>must</b> be a valid handle to a graphics {@code VkPipeline}</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineHandle} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code basePipelineIndex} <b>must</b> be a valid index into the calling command&#8217;s {@code pCreateInfos} parameter</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineIndex} is not -1, {@code basePipelineHandle} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineHandle} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code basePipelineIndex} <b>must</b> be -1</li>
 * <li>The {@code stage} member of each element of {@code pStages} <b>must</b> be unique</li>
 * <li>The geometric shader stages provided in {@code pStages} <b>must</b> be either from the mesh shading pipeline ({@code stage} is {@link NVMeshShader#VK_SHADER_STAGE_TASK_BIT_NV SHADER_STAGE_TASK_BIT_NV} or {@link NVMeshShader#VK_SHADER_STAGE_MESH_BIT_NV SHADER_STAGE_MESH_BIT_NV}) or from the primitive shading pipeline ({@code stage} is {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}, {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT}, {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, or {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}).</li>
 * <li>The {@code stage} member of one element of {@code pStages} <b>must</b> be either {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} or {@link NVMeshShader#VK_SHADER_STAGE_MESH_BIT_NV SHADER_STAGE_MESH_BIT_NV}.</li>
 * <li>The {@code stage} member of each element of {@code pStages} <b>must</b> not be {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT}</li>
 * <li>If {@code pStages} includes a tessellation control shader stage, it <b>must</b> include a tessellation evaluation shader stage</li>
 * <li>If {@code pStages} includes a tessellation evaluation shader stage, it <b>must</b> include a tessellation control shader stage</li>
 * <li>If {@code pStages} includes a tessellation control shader stage and a tessellation evaluation shader stage, {@code pTessellationState} <b>must</b> be a valid pointer to a valid {@link VkPipelineTessellationStateCreateInfo} structure</li>
 * <li>If {@code pStages} includes tessellation shader stages, the shader code of at least one stage <b>must</b> contain an {@code OpExecutionMode} instruction that specifies the type of subdivision in the pipeline</li>
 * <li>If {@code pStages} includes tessellation shader stages, and the shader code of both stages contain an {@code OpExecutionMode} instruction that specifies the type of subdivision in the pipeline, they <b>must</b> both specify the same subdivision mode</li>
 * <li>If {@code pStages} includes tessellation shader stages, the shader code of at least one stage <b>must</b> contain an {@code OpExecutionMode} instruction that specifies the output patch size in the pipeline</li>
 * <li>If {@code pStages} includes tessellation shader stages, and the shader code of both contain an {@code OpExecutionMode} instruction that specifies the out patch size in the pipeline, they <b>must</b> both specify the same patch size</li>
 * <li>If {@code pStages} includes tessellation shader stages, the {@code topology} member of {@code pInputAssembly} <b>must</b> be {@link VK10#VK_PRIMITIVE_TOPOLOGY_PATCH_LIST PRIMITIVE_TOPOLOGY_PATCH_LIST}</li>
 * <li>If the {@code topology} member of {@code pInputAssembly} is {@link VK10#VK_PRIMITIVE_TOPOLOGY_PATCH_LIST PRIMITIVE_TOPOLOGY_PATCH_LIST}, {@code pStages} <b>must</b> include tessellation shader stages</li>
 * <li>If {@code pStages} includes a geometry shader stage, and does not include any tessellation shader stages, its shader code <b>must</b> contain an {@code OpExecutionMode} instruction that specifies an input primitive type that is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#shaders-geometry-execution">compatible</a> with the primitive topology specified in {@code pInputAssembly}</li>
 * <li>If {@code pStages} includes a geometry shader stage, and also includes tessellation shader stages, its shader code <b>must</b> contain an {@code OpExecutionMode} instruction that specifies an input primitive type that is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#shaders-geometry-execution">compatible</a> with the primitive topology that is output by the tessellation stages</li>
 * <li>If {@code pStages} includes a fragment shader stage and a geometry shader stage, and the fragment shader code reads from an input variable that is decorated with {@code PrimitiveID}, then the geometry shader code <b>must</b> write to a matching output variable, decorated with {@code PrimitiveID}, in all execution paths</li>
 * <li>If {@code pStages} includes a fragment shader stage, its shader code <b>must</b> not read from any input attachment that is defined as {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} in {@code subpass}</li>
 * <li>The shader code for the entry points identified by {@code pStages}, and the rest of the state identified by this structure <b>must</b> adhere to the pipeline linking rules described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#interfaces">Shader Interfaces</a> chapter</li>
 * <li>If rasterization is not disabled and {@code subpass} uses a depth/stencil attachment in {@code renderPass} that has a layout of {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL} or {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL} in the {@link VkAttachmentReference} defined by {@code subpass}, the {@code depthWriteEnable} member of {@code pDepthStencilState} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If rasterization is not disabled and {@code subpass} uses a depth/stencil attachment in {@code renderPass} that has a layout of {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL} or {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL} in the {@link VkAttachmentReference} defined by {@code subpass}, the {@code failOp}, {@code passOp} and {@code depthFailOp} members of each of the {@code front} and {@code back} members of {@code pDepthStencilState} <b>must</b> be {@link VK10#VK_STENCIL_OP_KEEP STENCIL_OP_KEEP}</li>
 * <li>If rasterization is not disabled and the subpass uses color attachments, then for each color attachment in the subpass the {@code blendEnable} member of the corresponding element of the {@code pAttachment} member of {@code pColorBlendState} <b>must</b> be {@link VK10#VK_FALSE FALSE} if the attached image&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-format-features">format features</a> does not contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT}.</li>
 * <li>If rasterization is not disabled and the subpass uses color attachments, the {@code attachmentCount} member of {@code pColorBlendState} <b>must</b> be equal to the {@code colorAttachmentCount} used to create {@code subpass}</li>
 * <li>If no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link VK10#VK_DYNAMIC_STATE_VIEWPORT DYNAMIC_STATE_VIEWPORT}, the {@code pViewports} member of {@code pViewportState} <b>must</b> be a valid pointer to an array of {@code pViewportState}-&gt;viewportCount valid {@link VkViewport} structures</li>
 * <li>If no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link VK10#VK_DYNAMIC_STATE_SCISSOR DYNAMIC_STATE_SCISSOR}, the {@code pScissors} member of {@code pViewportState} <b>must</b> be a valid pointer to an array of {@code pViewportState}-&gt;scissorCount {@link VkRect2D} structures</li>
 * <li>If the wide lines feature is not enabled, and no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link VK10#VK_DYNAMIC_STATE_LINE_WIDTH DYNAMIC_STATE_LINE_WIDTH}, the {@code lineWidth} member of {@code pRasterizationState} <b>must</b> be {@code 1.0}</li>
 * <li>If the {@code rasterizerDiscardEnable} member of {@code pRasterizationState} is {@link VK10#VK_FALSE FALSE}, {@code pViewportState} <b>must</b> be a valid pointer to a valid {@link VkPipelineViewportStateCreateInfo} structure</li>
 * <li>If the {@code rasterizerDiscardEnable} member of {@code pRasterizationState} is {@link VK10#VK_FALSE FALSE}, {@code pMultisampleState} <b>must</b> be a valid pointer to a valid {@link VkPipelineMultisampleStateCreateInfo} structure</li>
 * <li>If the {@code rasterizerDiscardEnable} member of {@code pRasterizationState} is {@link VK10#VK_FALSE FALSE}, and {@code subpass} uses a depth/stencil attachment, {@code pDepthStencilState} <b>must</b> be a valid pointer to a valid {@link VkPipelineDepthStencilStateCreateInfo} structure</li>
 * <li>If the {@code rasterizerDiscardEnable} member of {@code pRasterizationState} is {@link VK10#VK_FALSE FALSE}, and {@code subpass} uses color attachments, {@code pColorBlendState} <b>must</b> be a valid pointer to a valid {@link VkPipelineColorBlendStateCreateInfo} structure</li>
 * <li>If the depth bias clamping feature is not enabled, no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link VK10#VK_DYNAMIC_STATE_DEPTH_BIAS DYNAMIC_STATE_DEPTH_BIAS}, and the {@code depthBiasEnable} member of {@code pRasterizationState} is {@link VK10#VK_TRUE TRUE}, the {@code depthBiasClamp} member of {@code pRasterizationState} <b>must</b> be {@code 0.0}</li>
 * <li>If the {@link EXTDepthRangeUnrestricted VK_EXT_depth_range_unrestricted} extension is not enabled and no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link VK10#VK_DYNAMIC_STATE_DEPTH_BOUNDS DYNAMIC_STATE_DEPTH_BOUNDS}, and the {@code depthBoundsTestEnable} member of {@code pDepthStencilState} is {@link VK10#VK_TRUE TRUE}, the {@code minDepthBounds} and {@code maxDepthBounds} members of {@code pDepthStencilState} <b>must</b> be between {@code 0.0} and {@code 1.0}, inclusive</li>
 * <li>If no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT}, and the {@code sampleLocationsEnable} member of a {@link VkPipelineSampleLocationsStateCreateInfoEXT} structure included in the {@code pNext} chain of {@code pMultisampleState} is {@link VK10#VK_TRUE TRUE}, {@code sampleLocationsInfo.sampleLocationGridSize.width} <b>must</b> evenly divide {@link VkMultisamplePropertiesEXT}{@code ::sampleLocationGridSize}.width as returned by {@link EXTSampleLocations#vkGetPhysicalDeviceMultisamplePropertiesEXT GetPhysicalDeviceMultisamplePropertiesEXT} with a {@code samples} parameter equaling {@code rasterizationSamples}</li>
 * <li>If no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT}, and the {@code sampleLocationsEnable} member of a {@link VkPipelineSampleLocationsStateCreateInfoEXT} structure included in the {@code pNext} chain of {@code pMultisampleState} is {@link VK10#VK_TRUE TRUE}, {@code sampleLocationsInfo.sampleLocationGridSize.height} <b>must</b> evenly divide {@link VkMultisamplePropertiesEXT}{@code ::sampleLocationGridSize}.height as returned by {@link EXTSampleLocations#vkGetPhysicalDeviceMultisamplePropertiesEXT GetPhysicalDeviceMultisamplePropertiesEXT} with a {@code samples} parameter equaling {@code rasterizationSamples}</li>
 * <li>If no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT}, and the {@code sampleLocationsEnable} member of a {@link VkPipelineSampleLocationsStateCreateInfoEXT} structure included in the {@code pNext} chain of {@code pMultisampleState} is {@link VK10#VK_TRUE TRUE}, {@code sampleLocationsInfo.sampleLocationsPerPixel} <b>must</b> equal {@code rasterizationSamples}</li>
 * <li>If the {@code sampleLocationsEnable} member of a {@link VkPipelineSampleLocationsStateCreateInfoEXT} structure included in the {@code pNext} chain of {@code pMultisampleState} is {@link VK10#VK_TRUE TRUE}, the fragment shader code <b>must</b> not statically use the extended instruction {@code InterpolateAtSample}</li>
 * <li>{@code layout} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-pipelinelayout-consistency">consistent</a> with all shaders specified in {@code pStages}</li>
 * <li>If neither the {@code VK_AMD_mixed_attachment_samples} nor the {@code VK_NV_framebuffer_mixed_samples} extensions are enabled, and if {@code subpass} uses color and/or depth/stencil attachments, then the {@code rasterizationSamples} member of {@code pMultisampleState} <b>must</b> be the same as the sample count for those subpass attachments</li>
 * <li>If the {@code VK_AMD_mixed_attachment_samples} extension is enabled, and if {@code subpass} uses color and/or depth/stencil attachments, then the {@code rasterizationSamples} member of {@code pMultisampleState} <b>must</b> equal the maximum of the sample counts of those subpass attachments</li>
 * <li>If the {@code VK_NV_framebuffer_mixed_samples} extension is enabled, and if {@code subpass} has a depth/stencil attachment and depth test, stencil test, or depth bounds test are enabled, then the {@code rasterizationSamples} member of {@code pMultisampleState} <b>must</b> be the same as the sample count of the depth/stencil attachment</li>
 * <li>If the {@code VK_NV_framebuffer_mixed_samples} extension is enabled, and if {@code subpass} has any color attachments, then the {@code rasterizationSamples} member of {@code pMultisampleState} <b>must</b> be greater than or equal to the sample count for those subpass attachments</li>
 * <li>If the {@code VK_NV_coverage_reduction_mode} extension is enabled, the coverage reduction mode specified by {@link VkPipelineCoverageReductionStateCreateInfoNV}{@code ::coverageReductionMode}, the {@code rasterizationSamples} member of {@code pMultisampleState} and the sample counts for the color and depth/stencil attachments (if the subpass has them) <b>must</b> be a valid combination returned by {@code vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV}</li>
 * <li>If {@code subpass} does not use any color and/or depth/stencil attachments, then the {@code rasterizationSamples} member of {@code pMultisampleState} <b>must</b> follow the rules for a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass-noattachments">zero-attachment subpass</a></li>
 * <li>{@code subpass} <b>must</b> be a valid subpass within {@code renderPass}</li>
 * <li>If the {@code renderPass} has multiview enabled and {@code subpass} has more than one bit set in the view mask and {@code multiviewTessellationShader} is not enabled, then {@code pStages} <b>must</b> not include tessellation shaders.</li>
 * <li>If the {@code renderPass} has multiview enabled and {@code subpass} has more than one bit set in the view mask and {@code multiviewGeometryShader} is not enabled, then {@code pStages} <b>must</b> not include a geometry shader.</li>
 * <li>If the {@code renderPass} has multiview enabled and {@code subpass} has more than one bit set in the view mask, shaders in the pipeline <b>must</b> not write to the {@code Layer} built-in output</li>
 * <li>If the {@code renderPass} has multiview enabled, then all shaders <b>must</b> not include variables decorated with the {@code Layer} built-in decoration in their interfaces.</li>
 * <li>{@code flags} <b>must</b> not contain the {@link VK11#VK_PIPELINE_CREATE_DISPATCH_BASE PIPELINE_CREATE_DISPATCH_BASE} flag.</li>
 * <li>If {@code pStages} includes a fragment shader stage and an input attachment was referenced by the {@link VkRenderPassInputAttachmentAspectCreateInfo} at {@code renderPass} create time, its shader code <b>must</b> not read from any aspect that was not specified in the {@code aspectMask} of the corresponding {@link VkInputAttachmentAspectReference} structure.</li>
 * <li>The number of resources in {@code layout} accessible to each shader stage that is used by the pipeline <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPerStageResources}</li>
 * <li>If no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link NVClipSpaceWScaling#VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV DYNAMIC_STATE_VIEWPORT_W_SCALING_NV}, and the {@code viewportWScalingEnable} member of a {@link VkPipelineViewportWScalingStateCreateInfoNV} structure, included in the {@code pNext} chain of {@code pViewportState}, is {@link VK10#VK_TRUE TRUE}, the {@code pViewportWScalings} member of the {@link VkPipelineViewportWScalingStateCreateInfoNV} <b>must</b> be a pointer to an array of {@link VkPipelineViewportWScalingStateCreateInfoNV}{@code ::viewportCount} valid {@link VkViewportWScalingNV} structures</li>
 * <li>If {@code pStages} includes a vertex shader stage, {@code pVertexInputState} <b>must</b> be a valid pointer to a valid {@link VkPipelineVertexInputStateCreateInfo} structure</li>
 * <li>If {@code pStages} includes a vertex shader stage, {@code pInputAssemblyState} <b>must</b> be a valid pointer to a valid {@link VkPipelineInputAssemblyStateCreateInfo} structure</li>
 * <li>The {@code Xfb} execution mode <b>can</b> be specified by only one shader stage in {@code pStages}</li>
 * <li>If any shader stage in {@code pStages} specifies {@code Xfb} execution mode it <b>must</b> be the last vertex processing stage</li>
 * <li>If a {@link VkPipelineRasterizationStateStreamCreateInfoEXT}{@code ::rasterizationStream} value other than zero is specified, all variables in the output interface of the entry point being compiled decorated with {@code Position}, {@code PointSize}, {@code ClipDistance}, or {@code CullDistance} <b>must</b> all be decorated with identical {@code Stream} values that match the {@code rasterizationStream}</li>
 * <li>If {@link VkPipelineRasterizationStateStreamCreateInfoEXT}{@code ::rasterizationStream} is zero, or not specified, all variables in the output interface of the entry point being compiled decorated with {@code Position}, {@code PointSize}, {@code ClipDistance}, or {@code CullDistance} <b>must</b> all be decorated with a {@code Stream} value of zero, or <b>must</b> not specify the {@code Stream} decoration</li>
 * <li>If the last vertex processing stage is a geometry shader, and that geometry shader uses the {@code GeometryStreams} capability, then {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT}{@code ::geometryStreams} feature <b>must</b> be enabled</li>
 * <li>If there are any mesh shader stages in the pipeline there <b>must</b> not be any shader stage in the pipeline with a {@code Xfb} execution mode.</li>
 * <li>If the {@code lineRasterizationMode} member of a {@link VkPipelineRasterizationLineStateCreateInfoEXT} structure included in the {@code pNext} chain of {@code pRasterizationState} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_BRESENHAM_EXT LINE_RASTERIZATION_MODE_BRESENHAM_EXT} or {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT} and if rasterization is enabled, then the {@code alphaToCoverageEnable}, {@code alphaToOneEnable}, and {@code sampleShadingEnable} members of {@code pMultisampleState} <b>must</b> all be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If the {@code stippledLineEnable} member of {@link VkPipelineRasterizationLineStateCreateInfoEXT} is {@link VK10#VK_TRUE TRUE} and no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link EXTLineRasterization#VK_DYNAMIC_STATE_LINE_STIPPLE_EXT DYNAMIC_STATE_LINE_STIPPLE_EXT}, then the {@code lineStippleFactor} member of {@link VkPipelineRasterizationLineStateCreateInfoEXT} <b>must</b> be in the range <code>[1,256]</code></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkPipelineCompilerControlCreateInfoAMD}, {@link VkPipelineCreationFeedbackCreateInfoEXT}, {@link VkPipelineDiscardRectangleStateCreateInfoEXT}, or {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV}</li>
 * <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkPipelineCreateFlagBits} values</li>
 * <li>{@code pStages} <b>must</b> be a valid pointer to an array of {@code stageCount} valid {@link VkPipelineShaderStageCreateInfo} structures</li>
 * <li>{@code pRasterizationState} <b>must</b> be a valid pointer to a valid {@link VkPipelineRasterizationStateCreateInfo} structure</li>
 * <li>If {@code pDynamicState} is not {@code NULL}, {@code pDynamicState} <b>must</b> be a valid pointer to a valid {@link VkPipelineDynamicStateCreateInfo} structure</li>
 * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>{@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
 * <li>{@code stageCount} <b>must</b> be greater than 0</li>
 * <li>Each of {@code basePipelineHandle}, {@code layout}, and {@code renderPass} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineColorBlendStateCreateInfo}, {@link VkPipelineDepthStencilStateCreateInfo}, {@link VkPipelineDynamicStateCreateInfo}, {@link VkPipelineInputAssemblyStateCreateInfo}, {@link VkPipelineMultisampleStateCreateInfo}, {@link VkPipelineRasterizationStateCreateInfo}, {@link VkPipelineShaderStageCreateInfo}, {@link VkPipelineTessellationStateCreateInfo}, {@link VkPipelineVertexInputStateCreateInfo}, {@link VkPipelineViewportStateCreateInfo}, {@link VK10#vkCreateGraphicsPipelines CreateGraphicsPipelines}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; a bitmask of {@code VkPipelineCreateFlagBits} specifying how the pipeline will be generated.</li>
 * <li>{@code stageCount} &ndash; the number of entries in the {@code pStages} array.</li>
 * <li>{@code pStages} &ndash; a pointer to an array of {@code stageCount} {@link VkPipelineShaderStageCreateInfo} structures describing the set of the shader stages to be included in the graphics pipeline.</li>
 * <li>{@code pVertexInputState} &ndash; a pointer to a {@link VkPipelineVertexInputStateCreateInfo} structure. It is ignored if the pipeline includes a mesh shader stage.</li>
 * <li>{@code pInputAssemblyState} &ndash; a pointer to a {@link VkPipelineInputAssemblyStateCreateInfo} structure which determines input assembly behavior, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#drawing">Drawing Commands</a>. It is ignored if the pipeline includes a mesh shader stage.</li>
 * <li>{@code pTessellationState} &ndash; a pointer to a {@link VkPipelineTessellationStateCreateInfo} structure, and is ignored if the pipeline does not include a tessellation control shader stage and tessellation evaluation shader stage.</li>
 * <li>{@code pViewportState} &ndash; a pointer to a {@link VkPipelineViewportStateCreateInfo} structure, and is ignored if the pipeline has rasterization disabled.</li>
 * <li>{@code pRasterizationState} &ndash; a pointer to a {@link VkPipelineRasterizationStateCreateInfo} structure.</li>
 * <li>{@code pMultisampleState} &ndash; a pointer to a {@link VkPipelineMultisampleStateCreateInfo} structure, and is ignored if the pipeline has rasterization disabled.</li>
 * <li>{@code pDepthStencilState} &ndash; a pointer to a {@link VkPipelineDepthStencilStateCreateInfo} structure, and is ignored if the pipeline has rasterization disabled or if the subpass of the render pass the pipeline is created against does not use a depth/stencil attachment.</li>
 * <li>{@code pColorBlendState} &ndash; a pointer to a {@link VkPipelineColorBlendStateCreateInfo} structure, and is ignored if the pipeline has rasterization disabled or if the subpass of the render pass the pipeline is created against does not use any color attachments.</li>
 * <li>{@code pDynamicState} &ndash; a pointer to a {@link VkPipelineDynamicStateCreateInfo} structure, and is used to indicate which properties of the pipeline state object are dynamic and <b>can</b> be changed independently of the pipeline state. This <b>can</b> be {@code NULL}, which means no state in the pipeline is considered dynamic.</li>
 * <li>{@code layout} &ndash; the description of binding locations used by both the pipeline and descriptor sets used with the pipeline.</li>
 * <li>{@code renderPass} &ndash; a handle to a render pass object describing the environment in which the pipeline will be used; the pipeline <b>must</b> only be used with an instance of any render pass compatible with the one provided. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass-compatibility">Render Pass Compatibility</a> for more information.</li>
 * <li>{@code subpass} &ndash; the index of the subpass in the render pass where this pipeline will be used.</li>
 * <li>{@code basePipelineHandle} &ndash; a pipeline to derive from.</li>
 * <li>{@code basePipelineIndex} &ndash; an index into the {@code pCreateInfos} parameter to use as a pipeline to derive from.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkGraphicsPipelineCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineCreateFlags flags;
 *     uint32_t stageCount;
 *     {@link VkPipelineShaderStageCreateInfo VkPipelineShaderStageCreateInfo} const * pStages;
 *     {@link VkPipelineVertexInputStateCreateInfo VkPipelineVertexInputStateCreateInfo} const * pVertexInputState;
 *     {@link VkPipelineInputAssemblyStateCreateInfo VkPipelineInputAssemblyStateCreateInfo} const * pInputAssemblyState;
 *     {@link VkPipelineTessellationStateCreateInfo VkPipelineTessellationStateCreateInfo} const * pTessellationState;
 *     {@link VkPipelineViewportStateCreateInfo VkPipelineViewportStateCreateInfo} const * pViewportState;
 *     {@link VkPipelineRasterizationStateCreateInfo VkPipelineRasterizationStateCreateInfo} const * pRasterizationState;
 *     {@link VkPipelineMultisampleStateCreateInfo VkPipelineMultisampleStateCreateInfo} const * pMultisampleState;
 *     {@link VkPipelineDepthStencilStateCreateInfo VkPipelineDepthStencilStateCreateInfo} const * pDepthStencilState;
 *     {@link VkPipelineColorBlendStateCreateInfo VkPipelineColorBlendStateCreateInfo} const * pColorBlendState;
 *     {@link VkPipelineDynamicStateCreateInfo VkPipelineDynamicStateCreateInfo} const * pDynamicState;
 *     VkPipelineLayout layout;
 *     VkRenderPass renderPass;
 *     uint32_t subpass;
 *     VkPipeline basePipelineHandle;
 *     int32_t basePipelineIndex;
 * }</code></pre>
 */
public class VkGraphicsPipelineCreateInfo extends Struct implements NativeResource {

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
        PVERTEXINPUTSTATE,
        PINPUTASSEMBLYSTATE,
        PTESSELLATIONSTATE,
        PVIEWPORTSTATE,
        PRASTERIZATIONSTATE,
        PMULTISAMPLESTATE,
        PDEPTHSTENCILSTATE,
        PCOLORBLENDSTATE,
        PDYNAMICSTATE,
        LAYOUT,
        RENDERPASS,
        SUBPASS,
        BASEPIPELINEHANDLE,
        BASEPIPELINEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4),
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
        PVERTEXINPUTSTATE = layout.offsetof(5);
        PINPUTASSEMBLYSTATE = layout.offsetof(6);
        PTESSELLATIONSTATE = layout.offsetof(7);
        PVIEWPORTSTATE = layout.offsetof(8);
        PRASTERIZATIONSTATE = layout.offsetof(9);
        PMULTISAMPLESTATE = layout.offsetof(10);
        PDEPTHSTENCILSTATE = layout.offsetof(11);
        PCOLORBLENDSTATE = layout.offsetof(12);
        PDYNAMICSTATE = layout.offsetof(13);
        LAYOUT = layout.offsetof(14);
        RENDERPASS = layout.offsetof(15);
        SUBPASS = layout.offsetof(16);
        BASEPIPELINEHANDLE = layout.offsetof(17);
        BASEPIPELINEINDEX = layout.offsetof(18);
    }

    /**
     * Creates a {@code VkGraphicsPipelineCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGraphicsPipelineCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkPipelineCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code stageCount} field. */
    @NativeType("uint32_t")
    public int stageCount() { return nstageCount(address()); }
    /** Returns a {@link VkPipelineShaderStageCreateInfo.Buffer} view of the struct array pointed to by the {@code pStages} field. */
    @NativeType("VkPipelineShaderStageCreateInfo const *")
    public VkPipelineShaderStageCreateInfo.Buffer pStages() { return npStages(address()); }
    /** Returns a {@link VkPipelineVertexInputStateCreateInfo} view of the struct pointed to by the {@code pVertexInputState} field. */
    @Nullable
    @NativeType("VkPipelineVertexInputStateCreateInfo const *")
    public VkPipelineVertexInputStateCreateInfo pVertexInputState() { return npVertexInputState(address()); }
    /** Returns a {@link VkPipelineInputAssemblyStateCreateInfo} view of the struct pointed to by the {@code pInputAssemblyState} field. */
    @Nullable
    @NativeType("VkPipelineInputAssemblyStateCreateInfo const *")
    public VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState() { return npInputAssemblyState(address()); }
    /** Returns a {@link VkPipelineTessellationStateCreateInfo} view of the struct pointed to by the {@code pTessellationState} field. */
    @Nullable
    @NativeType("VkPipelineTessellationStateCreateInfo const *")
    public VkPipelineTessellationStateCreateInfo pTessellationState() { return npTessellationState(address()); }
    /** Returns a {@link VkPipelineViewportStateCreateInfo} view of the struct pointed to by the {@code pViewportState} field. */
    @Nullable
    @NativeType("VkPipelineViewportStateCreateInfo const *")
    public VkPipelineViewportStateCreateInfo pViewportState() { return npViewportState(address()); }
    /** Returns a {@link VkPipelineRasterizationStateCreateInfo} view of the struct pointed to by the {@code pRasterizationState} field. */
    @NativeType("VkPipelineRasterizationStateCreateInfo const *")
    public VkPipelineRasterizationStateCreateInfo pRasterizationState() { return npRasterizationState(address()); }
    /** Returns a {@link VkPipelineMultisampleStateCreateInfo} view of the struct pointed to by the {@code pMultisampleState} field. */
    @Nullable
    @NativeType("VkPipelineMultisampleStateCreateInfo const *")
    public VkPipelineMultisampleStateCreateInfo pMultisampleState() { return npMultisampleState(address()); }
    /** Returns a {@link VkPipelineDepthStencilStateCreateInfo} view of the struct pointed to by the {@code pDepthStencilState} field. */
    @Nullable
    @NativeType("VkPipelineDepthStencilStateCreateInfo const *")
    public VkPipelineDepthStencilStateCreateInfo pDepthStencilState() { return npDepthStencilState(address()); }
    /** Returns a {@link VkPipelineColorBlendStateCreateInfo} view of the struct pointed to by the {@code pColorBlendState} field. */
    @Nullable
    @NativeType("VkPipelineColorBlendStateCreateInfo const *")
    public VkPipelineColorBlendStateCreateInfo pColorBlendState() { return npColorBlendState(address()); }
    /** Returns a {@link VkPipelineDynamicStateCreateInfo} view of the struct pointed to by the {@code pDynamicState} field. */
    @Nullable
    @NativeType("VkPipelineDynamicStateCreateInfo const *")
    public VkPipelineDynamicStateCreateInfo pDynamicState() { return npDynamicState(address()); }
    /** Returns the value of the {@code layout} field. */
    @NativeType("VkPipelineLayout")
    public long layout() { return nlayout(address()); }
    /** Returns the value of the {@code renderPass} field. */
    @NativeType("VkRenderPass")
    public long renderPass() { return nrenderPass(address()); }
    /** Returns the value of the {@code subpass} field. */
    @NativeType("uint32_t")
    public int subpass() { return nsubpass(address()); }
    /** Returns the value of the {@code basePipelineHandle} field. */
    @NativeType("VkPipeline")
    public long basePipelineHandle() { return nbasePipelineHandle(address()); }
    /** Returns the value of the {@code basePipelineIndex} field. */
    @NativeType("int32_t")
    public int basePipelineIndex() { return nbasePipelineIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkGraphicsPipelineCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkGraphicsPipelineCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkGraphicsPipelineCreateInfo flags(@NativeType("VkPipelineCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@code pStages} field. */
    public VkGraphicsPipelineCreateInfo pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) { npStages(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineVertexInputStateCreateInfo} to the {@code pVertexInputState} field. */
    public VkGraphicsPipelineCreateInfo pVertexInputState(@Nullable @NativeType("VkPipelineVertexInputStateCreateInfo const *") VkPipelineVertexInputStateCreateInfo value) { npVertexInputState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineInputAssemblyStateCreateInfo} to the {@code pInputAssemblyState} field. */
    public VkGraphicsPipelineCreateInfo pInputAssemblyState(@Nullable @NativeType("VkPipelineInputAssemblyStateCreateInfo const *") VkPipelineInputAssemblyStateCreateInfo value) { npInputAssemblyState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineTessellationStateCreateInfo} to the {@code pTessellationState} field. */
    public VkGraphicsPipelineCreateInfo pTessellationState(@Nullable @NativeType("VkPipelineTessellationStateCreateInfo const *") VkPipelineTessellationStateCreateInfo value) { npTessellationState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineViewportStateCreateInfo} to the {@code pViewportState} field. */
    public VkGraphicsPipelineCreateInfo pViewportState(@Nullable @NativeType("VkPipelineViewportStateCreateInfo const *") VkPipelineViewportStateCreateInfo value) { npViewportState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineRasterizationStateCreateInfo} to the {@code pRasterizationState} field. */
    public VkGraphicsPipelineCreateInfo pRasterizationState(@NativeType("VkPipelineRasterizationStateCreateInfo const *") VkPipelineRasterizationStateCreateInfo value) { npRasterizationState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineMultisampleStateCreateInfo} to the {@code pMultisampleState} field. */
    public VkGraphicsPipelineCreateInfo pMultisampleState(@Nullable @NativeType("VkPipelineMultisampleStateCreateInfo const *") VkPipelineMultisampleStateCreateInfo value) { npMultisampleState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineDepthStencilStateCreateInfo} to the {@code pDepthStencilState} field. */
    public VkGraphicsPipelineCreateInfo pDepthStencilState(@Nullable @NativeType("VkPipelineDepthStencilStateCreateInfo const *") VkPipelineDepthStencilStateCreateInfo value) { npDepthStencilState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineColorBlendStateCreateInfo} to the {@code pColorBlendState} field. */
    public VkGraphicsPipelineCreateInfo pColorBlendState(@Nullable @NativeType("VkPipelineColorBlendStateCreateInfo const *") VkPipelineColorBlendStateCreateInfo value) { npColorBlendState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineDynamicStateCreateInfo} to the {@code pDynamicState} field. */
    public VkGraphicsPipelineCreateInfo pDynamicState(@Nullable @NativeType("VkPipelineDynamicStateCreateInfo const *") VkPipelineDynamicStateCreateInfo value) { npDynamicState(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    public VkGraphicsPipelineCreateInfo layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code renderPass} field. */
    public VkGraphicsPipelineCreateInfo renderPass(@NativeType("VkRenderPass") long value) { nrenderPass(address(), value); return this; }
    /** Sets the specified value to the {@code subpass} field. */
    public VkGraphicsPipelineCreateInfo subpass(@NativeType("uint32_t") int value) { nsubpass(address(), value); return this; }
    /** Sets the specified value to the {@code basePipelineHandle} field. */
    public VkGraphicsPipelineCreateInfo basePipelineHandle(@NativeType("VkPipeline") long value) { nbasePipelineHandle(address(), value); return this; }
    /** Sets the specified value to the {@code basePipelineIndex} field. */
    public VkGraphicsPipelineCreateInfo basePipelineIndex(@NativeType("int32_t") int value) { nbasePipelineIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGraphicsPipelineCreateInfo set(
        int sType,
        long pNext,
        int flags,
        VkPipelineShaderStageCreateInfo.Buffer pStages,
        @Nullable VkPipelineVertexInputStateCreateInfo pVertexInputState,
        @Nullable VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState,
        @Nullable VkPipelineTessellationStateCreateInfo pTessellationState,
        @Nullable VkPipelineViewportStateCreateInfo pViewportState,
        VkPipelineRasterizationStateCreateInfo pRasterizationState,
        @Nullable VkPipelineMultisampleStateCreateInfo pMultisampleState,
        @Nullable VkPipelineDepthStencilStateCreateInfo pDepthStencilState,
        @Nullable VkPipelineColorBlendStateCreateInfo pColorBlendState,
        @Nullable VkPipelineDynamicStateCreateInfo pDynamicState,
        long layout,
        long renderPass,
        int subpass,
        long basePipelineHandle,
        int basePipelineIndex
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pStages(pStages);
        pVertexInputState(pVertexInputState);
        pInputAssemblyState(pInputAssemblyState);
        pTessellationState(pTessellationState);
        pViewportState(pViewportState);
        pRasterizationState(pRasterizationState);
        pMultisampleState(pMultisampleState);
        pDepthStencilState(pDepthStencilState);
        pColorBlendState(pColorBlendState);
        pDynamicState(pDynamicState);
        layout(layout);
        renderPass(renderPass);
        subpass(subpass);
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
    public VkGraphicsPipelineCreateInfo set(VkGraphicsPipelineCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGraphicsPipelineCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGraphicsPipelineCreateInfo malloc() {
        return wrap(VkGraphicsPipelineCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkGraphicsPipelineCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGraphicsPipelineCreateInfo calloc() {
        return wrap(VkGraphicsPipelineCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkGraphicsPipelineCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkGraphicsPipelineCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkGraphicsPipelineCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkGraphicsPipelineCreateInfo} instance for the specified memory address. */
    public static VkGraphicsPipelineCreateInfo create(long address) {
        return wrap(VkGraphicsPipelineCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGraphicsPipelineCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkGraphicsPipelineCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkGraphicsPipelineCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGraphicsPipelineCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkGraphicsPipelineCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkGraphicsPipelineCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkGraphicsPipelineCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkGraphicsPipelineCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkGraphicsPipelineCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGraphicsPipelineCreateInfo mallocStack(MemoryStack stack) {
        return wrap(VkGraphicsPipelineCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkGraphicsPipelineCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGraphicsPipelineCreateInfo callocStack(MemoryStack stack) {
        return wrap(VkGraphicsPipelineCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkGraphicsPipelineCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGraphicsPipelineCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkGraphicsPipelineCreateInfo.FLAGS); }
    /** Unsafe version of {@link #stageCount}. */
    public static int nstageCount(long struct) { return UNSAFE.getInt(null, struct + VkGraphicsPipelineCreateInfo.STAGECOUNT); }
    /** Unsafe version of {@link #pStages}. */
    public static VkPipelineShaderStageCreateInfo.Buffer npStages(long struct) { return VkPipelineShaderStageCreateInfo.create(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PSTAGES), nstageCount(struct)); }
    /** Unsafe version of {@link #pVertexInputState}. */
    @Nullable public static VkPipelineVertexInputStateCreateInfo npVertexInputState(long struct) { return VkPipelineVertexInputStateCreateInfo.createSafe(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PVERTEXINPUTSTATE)); }
    /** Unsafe version of {@link #pInputAssemblyState}. */
    @Nullable public static VkPipelineInputAssemblyStateCreateInfo npInputAssemblyState(long struct) { return VkPipelineInputAssemblyStateCreateInfo.createSafe(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PINPUTASSEMBLYSTATE)); }
    /** Unsafe version of {@link #pTessellationState}. */
    @Nullable public static VkPipelineTessellationStateCreateInfo npTessellationState(long struct) { return VkPipelineTessellationStateCreateInfo.createSafe(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PTESSELLATIONSTATE)); }
    /** Unsafe version of {@link #pViewportState}. */
    @Nullable public static VkPipelineViewportStateCreateInfo npViewportState(long struct) { return VkPipelineViewportStateCreateInfo.createSafe(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PVIEWPORTSTATE)); }
    /** Unsafe version of {@link #pRasterizationState}. */
    public static VkPipelineRasterizationStateCreateInfo npRasterizationState(long struct) { return VkPipelineRasterizationStateCreateInfo.create(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PRASTERIZATIONSTATE)); }
    /** Unsafe version of {@link #pMultisampleState}. */
    @Nullable public static VkPipelineMultisampleStateCreateInfo npMultisampleState(long struct) { return VkPipelineMultisampleStateCreateInfo.createSafe(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PMULTISAMPLESTATE)); }
    /** Unsafe version of {@link #pDepthStencilState}. */
    @Nullable public static VkPipelineDepthStencilStateCreateInfo npDepthStencilState(long struct) { return VkPipelineDepthStencilStateCreateInfo.createSafe(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PDEPTHSTENCILSTATE)); }
    /** Unsafe version of {@link #pColorBlendState}. */
    @Nullable public static VkPipelineColorBlendStateCreateInfo npColorBlendState(long struct) { return VkPipelineColorBlendStateCreateInfo.createSafe(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PCOLORBLENDSTATE)); }
    /** Unsafe version of {@link #pDynamicState}. */
    @Nullable public static VkPipelineDynamicStateCreateInfo npDynamicState(long struct) { return VkPipelineDynamicStateCreateInfo.createSafe(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PDYNAMICSTATE)); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return UNSAFE.getLong(null, struct + VkGraphicsPipelineCreateInfo.LAYOUT); }
    /** Unsafe version of {@link #renderPass}. */
    public static long nrenderPass(long struct) { return UNSAFE.getLong(null, struct + VkGraphicsPipelineCreateInfo.RENDERPASS); }
    /** Unsafe version of {@link #subpass}. */
    public static int nsubpass(long struct) { return UNSAFE.getInt(null, struct + VkGraphicsPipelineCreateInfo.SUBPASS); }
    /** Unsafe version of {@link #basePipelineHandle}. */
    public static long nbasePipelineHandle(long struct) { return UNSAFE.getLong(null, struct + VkGraphicsPipelineCreateInfo.BASEPIPELINEHANDLE); }
    /** Unsafe version of {@link #basePipelineIndex}. */
    public static int nbasePipelineIndex(long struct) { return UNSAFE.getInt(null, struct + VkGraphicsPipelineCreateInfo.BASEPIPELINEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkGraphicsPipelineCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkGraphicsPipelineCreateInfo.FLAGS, value); }
    /** Sets the specified value to the {@code stageCount} field of the specified {@code struct}. */
    public static void nstageCount(long struct, int value) { UNSAFE.putInt(null, struct + VkGraphicsPipelineCreateInfo.STAGECOUNT, value); }
    /** Unsafe version of {@link #pStages(VkPipelineShaderStageCreateInfo.Buffer) pStages}. */
    public static void npStages(long struct, VkPipelineShaderStageCreateInfo.Buffer value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PSTAGES, value.address()); nstageCount(struct, value.remaining()); }
    /** Unsafe version of {@link #pVertexInputState(VkPipelineVertexInputStateCreateInfo) pVertexInputState}. */
    public static void npVertexInputState(long struct, @Nullable VkPipelineVertexInputStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PVERTEXINPUTSTATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pInputAssemblyState(VkPipelineInputAssemblyStateCreateInfo) pInputAssemblyState}. */
    public static void npInputAssemblyState(long struct, @Nullable VkPipelineInputAssemblyStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PINPUTASSEMBLYSTATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pTessellationState(VkPipelineTessellationStateCreateInfo) pTessellationState}. */
    public static void npTessellationState(long struct, @Nullable VkPipelineTessellationStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PTESSELLATIONSTATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pViewportState(VkPipelineViewportStateCreateInfo) pViewportState}. */
    public static void npViewportState(long struct, @Nullable VkPipelineViewportStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PVIEWPORTSTATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pRasterizationState(VkPipelineRasterizationStateCreateInfo) pRasterizationState}. */
    public static void npRasterizationState(long struct, VkPipelineRasterizationStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PRASTERIZATIONSTATE, value.address()); }
    /** Unsafe version of {@link #pMultisampleState(VkPipelineMultisampleStateCreateInfo) pMultisampleState}. */
    public static void npMultisampleState(long struct, @Nullable VkPipelineMultisampleStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PMULTISAMPLESTATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pDepthStencilState(VkPipelineDepthStencilStateCreateInfo) pDepthStencilState}. */
    public static void npDepthStencilState(long struct, @Nullable VkPipelineDepthStencilStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PDEPTHSTENCILSTATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pColorBlendState(VkPipelineColorBlendStateCreateInfo) pColorBlendState}. */
    public static void npColorBlendState(long struct, @Nullable VkPipelineColorBlendStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PCOLORBLENDSTATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pDynamicState(VkPipelineDynamicStateCreateInfo) pDynamicState}. */
    public static void npDynamicState(long struct, @Nullable VkPipelineDynamicStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PDYNAMICSTATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { UNSAFE.putLong(null, struct + VkGraphicsPipelineCreateInfo.LAYOUT, value); }
    /** Unsafe version of {@link #renderPass(long) renderPass}. */
    public static void nrenderPass(long struct, long value) { UNSAFE.putLong(null, struct + VkGraphicsPipelineCreateInfo.RENDERPASS, value); }
    /** Unsafe version of {@link #subpass(int) subpass}. */
    public static void nsubpass(long struct, int value) { UNSAFE.putInt(null, struct + VkGraphicsPipelineCreateInfo.SUBPASS, value); }
    /** Unsafe version of {@link #basePipelineHandle(long) basePipelineHandle}. */
    public static void nbasePipelineHandle(long struct, long value) { UNSAFE.putLong(null, struct + VkGraphicsPipelineCreateInfo.BASEPIPELINEHANDLE, value); }
    /** Unsafe version of {@link #basePipelineIndex(int) basePipelineIndex}. */
    public static void nbasePipelineIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkGraphicsPipelineCreateInfo.BASEPIPELINEINDEX, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int stageCount = nstageCount(struct);
        long pStages = memGetAddress(struct + VkGraphicsPipelineCreateInfo.PSTAGES);
        check(pStages);
        VkPipelineShaderStageCreateInfo.validate(pStages, stageCount);
        long pVertexInputState = memGetAddress(struct + VkGraphicsPipelineCreateInfo.PVERTEXINPUTSTATE);
        if (pVertexInputState != NULL) {
            VkPipelineVertexInputStateCreateInfo.validate(pVertexInputState);
        }
        check(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PRASTERIZATIONSTATE));
        long pColorBlendState = memGetAddress(struct + VkGraphicsPipelineCreateInfo.PCOLORBLENDSTATE);
        if (pColorBlendState != NULL) {
            VkPipelineColorBlendStateCreateInfo.validate(pColorBlendState);
        }
        long pDynamicState = memGetAddress(struct + VkGraphicsPipelineCreateInfo.PDYNAMICSTATE);
        if (pDynamicState != NULL) {
            VkPipelineDynamicStateCreateInfo.validate(pDynamicState);
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkGraphicsPipelineCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkGraphicsPipelineCreateInfo, Buffer> implements NativeResource {

        private static final VkGraphicsPipelineCreateInfo ELEMENT_FACTORY = VkGraphicsPipelineCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkGraphicsPipelineCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGraphicsPipelineCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkGraphicsPipelineCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGraphicsPipelineCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGraphicsPipelineCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkPipelineCreateFlags")
        public int flags() { return VkGraphicsPipelineCreateInfo.nflags(address()); }
        /** Returns the value of the {@code stageCount} field. */
        @NativeType("uint32_t")
        public int stageCount() { return VkGraphicsPipelineCreateInfo.nstageCount(address()); }
        /** Returns a {@link VkPipelineShaderStageCreateInfo.Buffer} view of the struct array pointed to by the {@code pStages} field. */
        @NativeType("VkPipelineShaderStageCreateInfo const *")
        public VkPipelineShaderStageCreateInfo.Buffer pStages() { return VkGraphicsPipelineCreateInfo.npStages(address()); }
        /** Returns a {@link VkPipelineVertexInputStateCreateInfo} view of the struct pointed to by the {@code pVertexInputState} field. */
        @Nullable
        @NativeType("VkPipelineVertexInputStateCreateInfo const *")
        public VkPipelineVertexInputStateCreateInfo pVertexInputState() { return VkGraphicsPipelineCreateInfo.npVertexInputState(address()); }
        /** Returns a {@link VkPipelineInputAssemblyStateCreateInfo} view of the struct pointed to by the {@code pInputAssemblyState} field. */
        @Nullable
        @NativeType("VkPipelineInputAssemblyStateCreateInfo const *")
        public VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState() { return VkGraphicsPipelineCreateInfo.npInputAssemblyState(address()); }
        /** Returns a {@link VkPipelineTessellationStateCreateInfo} view of the struct pointed to by the {@code pTessellationState} field. */
        @Nullable
        @NativeType("VkPipelineTessellationStateCreateInfo const *")
        public VkPipelineTessellationStateCreateInfo pTessellationState() { return VkGraphicsPipelineCreateInfo.npTessellationState(address()); }
        /** Returns a {@link VkPipelineViewportStateCreateInfo} view of the struct pointed to by the {@code pViewportState} field. */
        @Nullable
        @NativeType("VkPipelineViewportStateCreateInfo const *")
        public VkPipelineViewportStateCreateInfo pViewportState() { return VkGraphicsPipelineCreateInfo.npViewportState(address()); }
        /** Returns a {@link VkPipelineRasterizationStateCreateInfo} view of the struct pointed to by the {@code pRasterizationState} field. */
        @NativeType("VkPipelineRasterizationStateCreateInfo const *")
        public VkPipelineRasterizationStateCreateInfo pRasterizationState() { return VkGraphicsPipelineCreateInfo.npRasterizationState(address()); }
        /** Returns a {@link VkPipelineMultisampleStateCreateInfo} view of the struct pointed to by the {@code pMultisampleState} field. */
        @Nullable
        @NativeType("VkPipelineMultisampleStateCreateInfo const *")
        public VkPipelineMultisampleStateCreateInfo pMultisampleState() { return VkGraphicsPipelineCreateInfo.npMultisampleState(address()); }
        /** Returns a {@link VkPipelineDepthStencilStateCreateInfo} view of the struct pointed to by the {@code pDepthStencilState} field. */
        @Nullable
        @NativeType("VkPipelineDepthStencilStateCreateInfo const *")
        public VkPipelineDepthStencilStateCreateInfo pDepthStencilState() { return VkGraphicsPipelineCreateInfo.npDepthStencilState(address()); }
        /** Returns a {@link VkPipelineColorBlendStateCreateInfo} view of the struct pointed to by the {@code pColorBlendState} field. */
        @Nullable
        @NativeType("VkPipelineColorBlendStateCreateInfo const *")
        public VkPipelineColorBlendStateCreateInfo pColorBlendState() { return VkGraphicsPipelineCreateInfo.npColorBlendState(address()); }
        /** Returns a {@link VkPipelineDynamicStateCreateInfo} view of the struct pointed to by the {@code pDynamicState} field. */
        @Nullable
        @NativeType("VkPipelineDynamicStateCreateInfo const *")
        public VkPipelineDynamicStateCreateInfo pDynamicState() { return VkGraphicsPipelineCreateInfo.npDynamicState(address()); }
        /** Returns the value of the {@code layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkGraphicsPipelineCreateInfo.nlayout(address()); }
        /** Returns the value of the {@code renderPass} field. */
        @NativeType("VkRenderPass")
        public long renderPass() { return VkGraphicsPipelineCreateInfo.nrenderPass(address()); }
        /** Returns the value of the {@code subpass} field. */
        @NativeType("uint32_t")
        public int subpass() { return VkGraphicsPipelineCreateInfo.nsubpass(address()); }
        /** Returns the value of the {@code basePipelineHandle} field. */
        @NativeType("VkPipeline")
        public long basePipelineHandle() { return VkGraphicsPipelineCreateInfo.nbasePipelineHandle(address()); }
        /** Returns the value of the {@code basePipelineIndex} field. */
        @NativeType("int32_t")
        public int basePipelineIndex() { return VkGraphicsPipelineCreateInfo.nbasePipelineIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkGraphicsPipelineCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkGraphicsPipelineCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkGraphicsPipelineCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkGraphicsPipelineCreateInfo.Buffer flags(@NativeType("VkPipelineCreateFlags") int value) { VkGraphicsPipelineCreateInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@code pStages} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) { VkGraphicsPipelineCreateInfo.npStages(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineVertexInputStateCreateInfo} to the {@code pVertexInputState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pVertexInputState(@Nullable @NativeType("VkPipelineVertexInputStateCreateInfo const *") VkPipelineVertexInputStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npVertexInputState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineInputAssemblyStateCreateInfo} to the {@code pInputAssemblyState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pInputAssemblyState(@Nullable @NativeType("VkPipelineInputAssemblyStateCreateInfo const *") VkPipelineInputAssemblyStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npInputAssemblyState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineTessellationStateCreateInfo} to the {@code pTessellationState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pTessellationState(@Nullable @NativeType("VkPipelineTessellationStateCreateInfo const *") VkPipelineTessellationStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npTessellationState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineViewportStateCreateInfo} to the {@code pViewportState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pViewportState(@Nullable @NativeType("VkPipelineViewportStateCreateInfo const *") VkPipelineViewportStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npViewportState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineRasterizationStateCreateInfo} to the {@code pRasterizationState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pRasterizationState(@NativeType("VkPipelineRasterizationStateCreateInfo const *") VkPipelineRasterizationStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npRasterizationState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineMultisampleStateCreateInfo} to the {@code pMultisampleState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pMultisampleState(@Nullable @NativeType("VkPipelineMultisampleStateCreateInfo const *") VkPipelineMultisampleStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npMultisampleState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineDepthStencilStateCreateInfo} to the {@code pDepthStencilState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pDepthStencilState(@Nullable @NativeType("VkPipelineDepthStencilStateCreateInfo const *") VkPipelineDepthStencilStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npDepthStencilState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineColorBlendStateCreateInfo} to the {@code pColorBlendState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pColorBlendState(@Nullable @NativeType("VkPipelineColorBlendStateCreateInfo const *") VkPipelineColorBlendStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npColorBlendState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineDynamicStateCreateInfo} to the {@code pDynamicState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pDynamicState(@Nullable @NativeType("VkPipelineDynamicStateCreateInfo const *") VkPipelineDynamicStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npDynamicState(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        public VkGraphicsPipelineCreateInfo.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkGraphicsPipelineCreateInfo.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code renderPass} field. */
        public VkGraphicsPipelineCreateInfo.Buffer renderPass(@NativeType("VkRenderPass") long value) { VkGraphicsPipelineCreateInfo.nrenderPass(address(), value); return this; }
        /** Sets the specified value to the {@code subpass} field. */
        public VkGraphicsPipelineCreateInfo.Buffer subpass(@NativeType("uint32_t") int value) { VkGraphicsPipelineCreateInfo.nsubpass(address(), value); return this; }
        /** Sets the specified value to the {@code basePipelineHandle} field. */
        public VkGraphicsPipelineCreateInfo.Buffer basePipelineHandle(@NativeType("VkPipeline") long value) { VkGraphicsPipelineCreateInfo.nbasePipelineHandle(address(), value); return this; }
        /** Sets the specified value to the {@code basePipelineIndex} field. */
        public VkGraphicsPipelineCreateInfo.Buffer basePipelineIndex(@NativeType("int32_t") int value) { VkGraphicsPipelineCreateInfo.nbasePipelineIndex(address(), value); return this; }

    }

}