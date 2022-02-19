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
 * <p>The parameters {@code basePipelineHandle} and {@code basePipelineIndex} are described in more detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-pipeline-derivatives">Pipeline Derivatives</a>.</p>
 * 
 * <p>If any shader stage fails to compile, the compile log will be reported back to the application, and {@link NVGLSLShader#VK_ERROR_INVALID_SHADER_NV ERROR_INVALID_SHADER_NV} will be generated.</p>
 * 
 * <p>The state required for a graphics pipeline is divided into <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-vertex-input">vertex input state</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-output">fragment output state</a>.</p>
 * 
 * <p>Vertex input state is defined by:</p>
 * 
 * <ul>
 * <li>{@link VkPipelineVertexInputStateCreateInfo}</li>
 * <li>{@link VkPipelineInputAssemblyStateCreateInfo}</li>
 * </ul>
 * 
 * <p>Pre-rasterization shader state is defined by:</p>
 * 
 * <ul>
 * <li>{@link VkPipelineShaderStageCreateInfo} entries for:
 * 
 * <ul>
 * <li>Vertex shaders</li>
 * <li>Tessellation control shaders</li>
 * <li>Tessellation evaluation shaders</li>
 * <li>Geometry shaders</li>
 * <li>Task shaders</li>
 * <li>Mesh shaders</li>
 * </ul>
 * </li>
 * <li>Within the {@code VkPipelineLayout}, all bindings that affect the specified shader stages</li>
 * <li>{@link VkPipelineViewportStateCreateInfo}</li>
 * <li>{@link VkPipelineRasterizationStateCreateInfo}</li>
 * <li>{@link VkPipelineTessellationStateCreateInfo} if tessellation stages are included.</li>
 * <li>{@code VkRenderPass} and {@code subpass} parameter</li>
 * <li>{@link VkPipelineDiscardRectangleStateCreateInfoEXT}</li>
 * <li>{@link VkPipelineFragmentShadingRateStateCreateInfoKHR}</li>
 * <li>{@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV}</li>
 * </ul>
 * 
 * <p>Fragment shader state is defined by:</p>
 * 
 * <ul>
 * <li>A {@link VkPipelineShaderStageCreateInfo} entry for the fragment shader</li>
 * <li>Within the {@code VkPipelineLayout}, all bindings that affect the fragment shader</li>
 * <li>{@link VkPipelineMultisampleStateCreateInfo}</li>
 * <li>{@link VkPipelineDepthStencilStateCreateInfo}</li>
 * <li>{@code VkRenderPass} and {@code subpass} parameter</li>
 * <li>{@link VkPipelineFragmentShadingRateStateCreateInfoKHR}</li>
 * <li>{@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV}</li>
 * </ul>
 * 
 * <p>Fragment output state is defined by:</p>
 * 
 * <ul>
 * <li>{@link VkPipelineColorBlendStateCreateInfo}</li>
 * <li>The {@code alphaToCoverageEnable} and {@code alphaToOneEnable} members of {@link VkPipelineMultisampleStateCreateInfo}.</li>
 * <li>{@code VkRenderPass} and {@code subpass} parameter</li>
 * </ul>
 * 
 * <p>A complete graphics pipeline always includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, with other subsets included depending on that state. If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> includes a vertex shader, then <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-vertex-input">vertex input state</a> is included in a complete graphics pipeline. If the value of {@link VkPipelineRasterizationStateCreateInfo}{@code ::rasterizerDiscardEnable} in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> is {@link VK10#VK_FALSE FALSE} or the {@link VK13#VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE} dynamic state is enabled <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-output">fragment output interface state</a> is included in a complete graphics pipeline.</p>
 * 
 * <p>Pipelines <b>must</b> be created with a complete set of pipeline state.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineIndex} is -1, {@code basePipelineHandle} <b>must</b> be a valid handle to a graphics {@code VkPipeline}</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineHandle} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code basePipelineIndex} <b>must</b> be a valid index into the calling command’s {@code pCreateInfos} parameter</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineIndex} is not -1, {@code basePipelineHandle} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineHandle} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code basePipelineIndex} <b>must</b> be -1</li>
 * <li>The {@code stage} member of each element of {@code pStages} <b>must</b> be unique</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> the geometric shader stages provided in {@code pStages} <b>must</b> be either from the mesh shading pipeline ({@code stage} is {@link NVMeshShader#VK_SHADER_STAGE_TASK_BIT_NV SHADER_STAGE_TASK_BIT_NV} or {@link NVMeshShader#VK_SHADER_STAGE_MESH_BIT_NV SHADER_STAGE_MESH_BIT_NV}) or from the primitive shading pipeline ({@code stage} is {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}, {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT}, {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, or {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT})</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> the {@code stage} member of one element of {@code pStages} <b>must</b> be either {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} or {@link NVMeshShader#VK_SHADER_STAGE_MESH_BIT_NV SHADER_STAGE_MESH_BIT_NV}</li>
 * <li>The {@code stage} member of each element of {@code pStages} <b>must</b> not be {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> and {@code pStages} includes a tessellation control shader stage, it <b>must</b> include a tessellation evaluation shader stage</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> and {@code pStages} includes a tessellation evaluation shader stage, it <b>must</b> include a tessellation control shader stage</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> and {@code pStages} includes a tessellation control shader stage and a tessellation evaluation shader stage, {@code pTessellationState} <b>must</b> be a valid pointer to a valid {@link VkPipelineTessellationStateCreateInfo} structure</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> and {@code pStages} includes tessellation shader stages, the shader code of at least one stage <b>must</b> contain an {@code OpExecutionMode} instruction specifying the type of subdivision in the pipeline</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> and {@code pStages} includes tessellation shader stages, and the shader code of both stages contain an {@code OpExecutionMode} instruction specifying the type of subdivision in the pipeline, they <b>must</b> both specify the same subdivision mode</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> and {@code pStages} includes tessellation shader stages, the shader code of at least one stage <b>must</b> contain an {@code OpExecutionMode} instruction specifying the output patch size in the pipeline</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> and {@code pStages} includes tessellation shader stages, and the shader code of both contain an {@code OpExecutionMode} instruction specifying the out patch size in the pipeline, they <b>must</b> both specify the same patch size</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> and {@code pStages} includes tessellation shader stages, the {@code topology} member of {@code pInputAssembly} <b>must</b> be {@link VK10#VK_PRIMITIVE_TOPOLOGY_PATCH_LIST PRIMITIVE_TOPOLOGY_PATCH_LIST}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> and the {@code topology} member of {@code pInputAssembly} is {@link VK10#VK_PRIMITIVE_TOPOLOGY_PATCH_LIST PRIMITIVE_TOPOLOGY_PATCH_LIST}, {@code pStages} <b>must</b> include tessellation shader stages</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> and {@code pStages} includes a geometry shader stage, and does not include any tessellation shader stages, its shader code <b>must</b> contain an {@code OpExecutionMode} instruction specifying an input primitive type that is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-geometry-execution">compatible</a> with the primitive topology specified in {@code pInputAssembly}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> and {@code pStages} includes a geometry shader stage, and also includes tessellation shader stages, its shader code <b>must</b> contain an {@code OpExecutionMode} instruction specifying an input primitive type that is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-geometry-execution">compatible</a> with the primitive topology that is output by the tessellation stages</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, it includes both a fragment shader and a geometry shader, and the fragment shader code reads from an input variable that is decorated with {@code PrimitiveId}, then the geometry shader code <b>must</b> write to a matching output variable, decorated with {@code PrimitiveId}, in all execution paths</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, it includes a mesh shader and the fragment shader code reads from an input variable that is decorated with {@code PrimitiveId}, then the mesh shader code <b>must</b> write to a matching output variable, decorated with {@code PrimitiveId}, in all execution paths</li>
 * <li>If {@code renderPass} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a> the fragment shader <b>must</b> not read from any input attachment that is defined as {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} in {@code subpass}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> and multiple pre-rasterization shader stages are included in {@code pStages}, the shader code for the entry points identified by those {@code pStages} and the rest of the state identified by this structure <b>must</b> adhere to the pipeline linking rules described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces">Shader Interfaces</a> chapter</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, the fragment shader and last <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader stage</a> and any relevant state <b>must</b> adhere to the pipeline linking rules described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces">Shader Interfaces</a> chapter</li>
 * <li>If {@code renderPass} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and {@code subpass} uses a depth/stencil attachment in {@code renderPass} with a read-only layout for the depth aspect in the {@link VkAttachmentReference} defined by {@code subpass}, the {@code depthWriteEnable} member of {@code pDepthStencilState} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@code renderPass} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and {@code subpass} uses a depth/stencil attachment in {@code renderPass} with a read-only layout for the stencil aspect in the {@link VkAttachmentReference} defined by {@code subpass}, the {@code failOp}, {@code passOp} and {@code depthFailOp} members of each of the {@code front} and {@code back} members of {@code pDepthStencilState} <b>must</b> be {@link VK10#VK_STENCIL_OP_KEEP STENCIL_OP_KEEP}</li>
 * <li>If {@code renderPass} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-output">fragment output interface state</a>, then for each color attachment in the subpass, if the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> of the format of the corresponding attachment description do not contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT}, then the {@code blendEnable} member of the corresponding element of the {@code pAttachments} member of {@code pColorBlendState} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@code renderPass} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-output">fragment output interface state</a>, and the subpass uses color attachments, the {@code attachmentCount} member of {@code pColorBlendState} <b>must</b> be equal to the {@code colorAttachmentCount} used to create {@code subpass}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link VK10#VK_DYNAMIC_STATE_VIEWPORT DYNAMIC_STATE_VIEWPORT} or {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT}, the {@code pViewports} member of {@code pViewportState} <b>must</b> be a valid pointer to an array of {@code pViewportState→viewportCount} valid {@link VkViewport} structures</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link VK10#VK_DYNAMIC_STATE_SCISSOR DYNAMIC_STATE_SCISSOR} or {@link VK13#VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT}, the {@code pScissors} member of {@code pViewportState} <b>must</b> be a valid pointer to an array of {@code pViewportState→scissorCount} {@link VkRect2D} structures</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and the wide lines feature is not enabled, and no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link VK10#VK_DYNAMIC_STATE_LINE_WIDTH DYNAMIC_STATE_LINE_WIDTH}, the {@code lineWidth} member of {@code pRasterizationState} <b>must</b> be {@code 1.0}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and the {@code rasterizerDiscardEnable} member of {@code pRasterizationState} is {@link VK10#VK_FALSE FALSE}, {@code pViewportState} <b>must</b> be a valid pointer to a valid {@link VkPipelineViewportStateCreateInfo} structure</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and the graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE} dynamic state enabled, {@code pViewportState} <b>must</b> be a valid pointer to a valid {@link VkPipelineViewportStateCreateInfo} structure</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, {@code pMultisampleState} <b>must</b> be a valid pointer to a valid {@link VkPipelineMultisampleStateCreateInfo} structure</li>
 * <li>If {@code renderPass} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and {@code subpass} uses a depth/stencil attachment, {@code pDepthStencilState} <b>must</b> be a valid pointer to a valid {@link VkPipelineDepthStencilStateCreateInfo} structure</li>
 * <li>If {@code renderPass} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-output">fragment output interface state</a>, and {@code subpass} uses color attachments, {@code pColorBlendState} <b>must</b> be a valid pointer to a valid {@link VkPipelineColorBlendStateCreateInfo} structure</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, the depth bias clamping feature is not enabled, no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link VK10#VK_DYNAMIC_STATE_DEPTH_BIAS DYNAMIC_STATE_DEPTH_BIAS}, and the {@code depthBiasEnable} member of {@code pRasterizationState} is {@link VK10#VK_TRUE TRUE}, the {@code depthBiasClamp} member of {@code pRasterizationState} <b>must</b> be {@code 0.0}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and the {@link EXTDepthRangeUnrestricted VK_EXT_depth_range_unrestricted} extension is not enabled and no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link VK10#VK_DYNAMIC_STATE_DEPTH_BOUNDS DYNAMIC_STATE_DEPTH_BOUNDS}, and the {@code depthBoundsTestEnable} member of {@code pDepthStencilState} is {@link VK10#VK_TRUE TRUE}, the {@code minDepthBounds} and {@code maxDepthBounds} members of {@code pDepthStencilState} <b>must</b> be between {@code 0.0} and {@code 1.0}, inclusive</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT}, and the {@code sampleLocationsEnable} member of a {@link VkPipelineSampleLocationsStateCreateInfoEXT} structure included in the {@code pNext} chain of {@code pMultisampleState} is {@link VK10#VK_TRUE TRUE}, {@code sampleLocationsInfo.sampleLocationGridSize.width} <b>must</b> evenly divide {@link VkMultisamplePropertiesEXT}{@code ::sampleLocationGridSize.width} as returned by {@link EXTSampleLocations#vkGetPhysicalDeviceMultisamplePropertiesEXT GetPhysicalDeviceMultisamplePropertiesEXT} with a {@code samples} parameter equaling {@code rasterizationSamples}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT}, and the {@code sampleLocationsEnable} member of a {@link VkPipelineSampleLocationsStateCreateInfoEXT} structure included in the {@code pNext} chain of {@code pMultisampleState} is {@link VK10#VK_TRUE TRUE}, {@code sampleLocationsInfo.sampleLocationGridSize.height} <b>must</b> evenly divide {@link VkMultisamplePropertiesEXT}{@code ::sampleLocationGridSize.height} as returned by {@link EXTSampleLocations#vkGetPhysicalDeviceMultisamplePropertiesEXT GetPhysicalDeviceMultisamplePropertiesEXT} with a {@code samples} parameter equaling {@code rasterizationSamples}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT}, and the {@code sampleLocationsEnable} member of a {@link VkPipelineSampleLocationsStateCreateInfoEXT} structure included in the {@code pNext} chain of {@code pMultisampleState} is {@link VK10#VK_TRUE TRUE}, {@code sampleLocationsInfo.sampleLocationsPerPixel} <b>must</b> equal {@code rasterizationSamples}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and the {@code sampleLocationsEnable} member of a {@link VkPipelineSampleLocationsStateCreateInfoEXT} structure included in the {@code pNext} chain of {@code pMultisampleState} is {@link VK10#VK_TRUE TRUE}, the fragment shader code <b>must</b> not statically use the extended instruction {@code InterpolateAtSample}</li>
 * <li>{@code layout} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-pipelinelayout-consistency">consistent</a> with all shaders specified in {@code pStages}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and neither the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} nor the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extensions are enabled, and if {@code subpass} uses color and/or depth/stencil attachments, then the {@code rasterizationSamples} member of {@code pMultisampleState} <b>must</b> be the same as the sample count for those subpass attachments</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} extension is enabled, and if {@code subpass} uses color and/or depth/stencil attachments, then the {@code rasterizationSamples} member of {@code pMultisampleState} <b>must</b> equal the maximum of the sample counts of those subpass attachments</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and if {@code subpass} has a depth/stencil attachment and depth test, stencil test, or depth bounds test are enabled, then the {@code rasterizationSamples} member of {@code pMultisampleState} <b>must</b> be the same as the sample count of the depth/stencil attachment</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and if {@code subpass} has any color attachments, then the {@code rasterizationSamples} member of {@code pMultisampleState} <b>must</b> be greater than or equal to the sample count for those subpass attachments</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and the {@link NVCoverageReductionMode VK_NV_coverage_reduction_mode} extension is enabled, the coverage reduction mode specified by {@link VkPipelineCoverageReductionStateCreateInfoNV}{@code ::coverageReductionMode}, the {@code rasterizationSamples} member of {@code pMultisampleState} and the sample counts for the color and depth/stencil attachments (if the subpass has them) <b>must</b> be a valid combination returned by {@code vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a> and {@code subpass} does not use any color and/or depth/stencil attachments, then the {@code rasterizationSamples} member of {@code pMultisampleState} <b>must</b> follow the rules for a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-noattachments">zero-attachment subpass</a></li>
 * <li>If {@code renderPass} is a valid renderPass, {@code subpass} <b>must</b> be a valid subpass within {@code renderPass}</li>
 * <li>If {@code renderPass} is a valid renderPass, the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and the {@code renderPass} has multiview enabled and {@code subpass} has more than one bit set in the view mask and {@code multiviewTessellationShader} is not enabled, then {@code pStages} <b>must</b> not include tessellation shaders</li>
 * <li>If {@code renderPass} is a valid renderPass, the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and the {@code renderPass} has multiview enabled and {@code subpass} has more than one bit set in the view mask and {@code multiviewGeometryShader} is not enabled, then {@code pStages} <b>must</b> not include a geometry shader</li>
 * <li>If {@code renderPass} is a valid renderPass, the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and the {@code renderPass} has multiview enabled and {@code subpass} has more than one bit set in the view mask, shaders in the pipeline <b>must</b> not write to the {@code Layer} built-in output</li>
 * <li>If {@code renderPass} is a valid renderPass and the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and the {@code renderPass} has multiview enabled, then all shaders <b>must</b> not include variables decorated with the {@code Layer} built-in decoration in their interfaces</li>
 * <li>{@code flags} <b>must</b> not contain the {@link VK11#VK_PIPELINE_CREATE_DISPATCH_BASE PIPELINE_CREATE_DISPATCH_BASE} flag</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a> and an input attachment was referenced by an {@code aspectMask} at {@code renderPass} creation time, the fragment shader <b>must</b> only read from the aspects that were specified for that input attachment</li>
 * <li>The number of resources in {@code layout} accessible to each shader stage that is used by the pipeline <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPerStageResources}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link NVClipSpaceWScaling#VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV DYNAMIC_STATE_VIEWPORT_W_SCALING_NV}, and the {@code viewportWScalingEnable} member of a {@link VkPipelineViewportWScalingStateCreateInfoNV} structure, included in the {@code pNext} chain of {@code pViewportState}, is {@link VK10#VK_TRUE TRUE}, the {@code pViewportWScalings} member of the {@link VkPipelineViewportWScalingStateCreateInfoNV} <b>must</b> be a pointer to an array of {@link VkPipelineViewportWScalingStateCreateInfoNV}{@code ::viewportCount} valid {@link VkViewportWScalingNV} structures</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link NVScissorExclusive#VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV}, and if {@code pViewportState→pNext} chain includes a {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV} structure, and if its {@code exclusiveScissorCount} member is not 0, then its {@code pExclusiveScissors} member <b>must</b> be a valid pointer to an array of {@code exclusiveScissorCount} {@link VkRect2D} structures</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link NVShadingRateImage#VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV}, and if {@code pViewportState→pNext} chain includes a {@link VkPipelineViewportShadingRateImageStateCreateInfoNV} structure, then its {@code pShadingRatePalettes} member <b>must</b> be a valid pointer to an array of {@code viewportCount} valid {@link VkShadingRatePaletteNV} structures</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link EXTDiscardRectangles#VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_EXT}, and if {@code pNext} chain includes a {@link VkPipelineDiscardRectangleStateCreateInfoEXT} structure, and if its {@code discardRectangleCount} member is not 0, then its {@code pDiscardRectangles} member <b>must</b> be a valid pointer to an array of {@code discardRectangleCount} {@link VkRect2D} structures</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-vertex-input">vertex input state</a>, {@code pInputAssemblyState} <b>must</b> be a valid pointer to a valid {@link VkPipelineInputAssemblyStateCreateInfo} structure</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, the {@code Xfb} execution mode <b>can</b> be specified by no more than one shader stage in {@code pStages}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and any shader stage in {@code pStages} specifies {@code Xfb} execution mode it <b>must</b> be the last <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader stage</a></li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and a {@link VkPipelineRasterizationStateStreamCreateInfoEXT}{@code ::rasterizationStream} value other than zero is specified, all variables in the output interface of the entry point being compiled decorated with {@code Position}, {@code PointSize}, {@code ClipDistance}, or {@code CullDistance} <b>must</b> be decorated with identical {@code Stream} values that match the {@code rasterizationStream}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and {@link VkPipelineRasterizationStateStreamCreateInfoEXT}{@code ::rasterizationStream} is zero, or not specified, all variables in the output interface of the entry point being compiled decorated with {@code Position}, {@code PointSize}, {@code ClipDistance}, or {@code CullDistance} <b>must</b> be decorated with a {@code Stream} value of zero, or <b>must</b> not specify the {@code Stream} decoration</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and the last <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader stage</a> is a geometry shader, and that geometry shader uses the {@code GeometryStreams} capability, then {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT}{@code ::geometryStreams} feature <b>must</b> be enabled</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and there are any mesh shader stages in the pipeline there <b>must</b> not be any shader stage in the pipeline with a {@code Xfb} execution mode</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> and at least one of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-output">fragment output interface state</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, the {@code lineRasterizationMode} member of a {@link VkPipelineRasterizationLineStateCreateInfoEXT} structure included in the {@code pNext} chain of {@code pRasterizationState} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_BRESENHAM_EXT LINE_RASTERIZATION_MODE_BRESENHAM_EXT} or {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT}, then the {@code alphaToCoverageEnable}, {@code alphaToOneEnable}, and {@code sampleShadingEnable} members of {@code pMultisampleState} <b>must</b> all be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, the {@code stippledLineEnable} member of {@link VkPipelineRasterizationLineStateCreateInfoEXT} is {@link VK10#VK_TRUE TRUE}, and no element of the {@code pDynamicStates} member of {@code pDynamicState} is {@link EXTLineRasterization#VK_DYNAMIC_STATE_LINE_STIPPLE_EXT DYNAMIC_STATE_LINE_STIPPLE_EXT}, then the {@code lineStippleFactor} member of {@link VkPipelineRasterizationLineStateCreateInfoEXT} <b>must</b> be in the range <code>[1,256]</code></li>
 * <li>{@code flags} <b>must</b> not include {@link KHRPipelineLibrary#VK_PIPELINE_CREATE_LIBRARY_BIT_KHR PIPELINE_CREATE_LIBRARY_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link NVRayTracingMotionBlur#VK_PIPELINE_CREATE_RAY_TRACING_ALLOW_MOTION_BIT_NV PIPELINE_CREATE_RAY_TRACING_ALLOW_MOTION_BIT_NV}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} is included in the {@code pDynamicStates} array then {@code viewportCount} <b>must</b> be zero</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and {@link VK13#VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT} is included in the {@code pDynamicStates} array then {@code scissorCount} <b>must</b> be zero</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} is included in the {@code pDynamicStates} array then {@link VK10#VK_DYNAMIC_STATE_VIEWPORT DYNAMIC_STATE_VIEWPORT} <b>must</b> not be present</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and {@link VK13#VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT} is included in the {@code pDynamicStates} array then {@link VK10#VK_DYNAMIC_STATE_SCISSOR DYNAMIC_STATE_SCISSOR} <b>must</b> not be present</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState2LogicOp">extendedDynamicState2LogicOp</a> feature is not enabled, there <b>must</b> be no element of the {@code pDynamicStates} member of {@code pDynamicState} set to {@link EXTExtendedDynamicState2#VK_DYNAMIC_STATE_LOGIC_OP_EXT DYNAMIC_STATE_LOGIC_OP_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState2PatchControlPoints">extendedDynamicState2PatchControlPoints</a> feature is not enabled, there <b>must</b> be no element of the {@code pDynamicStates} member of {@code pDynamicState} set to {@link EXTExtendedDynamicState2#VK_DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT}</li>
 * <li>If {@code flags} includes {@link NVDeviceGeneratedCommands#VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV}, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-deviceGeneratedCommands">{@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV}{@code ::deviceGeneratedCommands}</a> feature <b>must</b> be enabled</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> and {@code flags} includes {@link NVDeviceGeneratedCommands#VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV}, then all stages <b>must</b> not specify {@code Xfb} execution mode</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineCreationCacheControl">{@code pipelineCreationCacheControl}</a> feature is not enabled, {@code flags} <b>must</b> not include {@link VK13#VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT} or {@link VK13#VK_PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a> and {@link KHRFragmentShadingRate#VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR} is not included in {@code pDynamicState→pDynamicStates}, {@link VkPipelineFragmentShadingRateStateCreateInfoKHR}{@code ::fragmentSize.width} <b>must</b> be greater than or equal to 1</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a> and {@link KHRFragmentShadingRate#VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR} is not included in {@code pDynamicState→pDynamicStates}, {@link VkPipelineFragmentShadingRateStateCreateInfoKHR}{@code ::fragmentSize.height} <b>must</b> be greater than or equal to 1</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a> and {@link KHRFragmentShadingRate#VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR} is not included in {@code pDynamicState→pDynamicStates}, {@link VkPipelineFragmentShadingRateStateCreateInfoKHR}{@code ::fragmentSize.width} <b>must</b> be a power-of-two value</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a> and {@link KHRFragmentShadingRate#VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR} is not included in {@code pDynamicState→pDynamicStates}, {@link VkPipelineFragmentShadingRateStateCreateInfoKHR}{@code ::fragmentSize.height} <b>must</b> be a power-of-two value</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a> and {@link KHRFragmentShadingRate#VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR} is not included in {@code pDynamicState→pDynamicStates}, {@link VkPipelineFragmentShadingRateStateCreateInfoKHR}{@code ::fragmentSize.width} <b>must</b> be less than or equal to 4</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a> and {@link KHRFragmentShadingRate#VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR} is not included in {@code pDynamicState→pDynamicStates}, {@link VkPipelineFragmentShadingRateStateCreateInfoKHR}{@code ::fragmentSize.height} <b>must</b> be less than or equal to 4</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a> and {@link KHRFragmentShadingRate#VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR} is not included in {@code pDynamicState→pDynamicStates}, and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineFragmentShadingRate">{@code pipelineFragmentShadingRate} feature</a> is not enabled, {@link VkPipelineFragmentShadingRateStateCreateInfoKHR}{@code ::fragmentSize.width} and {@link VkPipelineFragmentShadingRateStateCreateInfoKHR}{@code ::fragmentSize.height} <b>must</b> both be equal to 1</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a> and {@link KHRFragmentShadingRate#VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR} is not included in {@code pDynamicState→pDynamicStates}, and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-primitiveFragmentShadingRate">{@code primitiveFragmentShadingRate} feature</a> is not enabled, {@link VkPipelineFragmentShadingRateStateCreateInfoKHR}{@code ::combinerOps}[0] <b>must</b> be {@link KHRFragmentShadingRate#VK_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a> and {@link KHRFragmentShadingRate#VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR} is not included in {@code pDynamicState→pDynamicStates}, and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-attachmentFragmentShadingRate">{@code attachmentFragmentShadingRate} feature</a> is not enabled, {@link VkPipelineFragmentShadingRateStateCreateInfoKHR}{@code ::combinerOps}[1] <b>must</b> be {@link KHRFragmentShadingRate#VK_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-primitiveFragmentShadingRateWithMultipleViewports">{@code primitiveFragmentShadingRateWithMultipleViewports}</a> limit is not supported, {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} is not included in {@code pDynamicState→pDynamicStates}, and {@link VkPipelineViewportStateCreateInfo}{@code ::viewportCount} is greater than 1, entry points specified in {@code pStages} <b>must</b> not write to the {@code PrimitiveShadingRateKHR} built-in</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-primitiveFragmentShadingRateWithMultipleViewports">{@code primitiveFragmentShadingRateWithMultipleViewports}</a> limit is not supported, and entry points specified in {@code pStages} write to the {@code ViewportIndex} built-in, they <b>must</b> not also write to the {@code PrimitiveShadingRateKHR} built-in</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-primitiveFragmentShadingRateWithMultipleViewports">{@code primitiveFragmentShadingRateWithMultipleViewports}</a> limit is not supported, and entry points specified in {@code pStages} write to the {@code ViewportMaskNV} built-in, they <b>must</b> not also write to the {@code PrimitiveShadingRateKHR} built-in</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-fragmentShadingRateNonTrivialCombinerOps">{@code fragmentShadingRateNonTrivialCombinerOps}</a> limit is not supported, and {@link KHRFragmentShadingRate#VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR} is not included in {@code pDynamicState→pDynamicStates}, elements of {@link VkPipelineFragmentShadingRateStateCreateInfoKHR}{@code ::combinerOps} <b>must</b> be {@link KHRFragmentShadingRate#VK_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR} or {@link KHRFragmentShadingRate#VK_FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and {@link KHRFragmentShadingRate#VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR} is not included in {@code pDynamicState→pDynamicStates}, and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-fragmentShadingRateEnums">{@code fragmentShadingRateEnums} feature</a> is not enabled, {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV}{@code ::shadingRateType} <b>must</b> be equal to {@link NVFragmentShadingRateEnums#VK_FRAGMENT_SHADING_RATE_TYPE_FRAGMENT_SIZE_NV FRAGMENT_SHADING_RATE_TYPE_FRAGMENT_SIZE_NV}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and {@link KHRFragmentShadingRate#VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR} is not included in {@code pDynamicState→pDynamicStates}, and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineFragmentShadingRate">{@code pipelineFragmentShadingRate} feature</a> is not enabled, {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV}{@code ::shadingRate} <b>must</b> be equal to {@link NVFragmentShadingRateEnums#VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_PIXEL_NV FRAGMENT_SHADING_RATE_1_INVOCATION_PER_PIXEL_NV}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and {@link KHRFragmentShadingRate#VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR} is not included in {@code pDynamicState→pDynamicStates}, and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-primitiveFragmentShadingRate">{@code primitiveFragmentShadingRate} feature</a> is not enabled, {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV}{@code ::combinerOps}[0] <b>must</b> be {@link KHRFragmentShadingRate#VK_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and {@link KHRFragmentShadingRate#VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR} is not included in {@code pDynamicState→pDynamicStates}, and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-attachmentFragmentShadingRate">{@code attachmentFragmentShadingRate} feature</a> is not enabled, {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV}{@code ::combinerOps}[1] <b>must</b> be {@link KHRFragmentShadingRate#VK_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-fragmentShadingRateNonTrivialCombinerOps">{@code fragmentShadingRateNonTrivialCombinerOps}</a> limit is not supported and {@link KHRFragmentShadingRate#VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR} is not included in {@code pDynamicState→pDynamicStates}, elements of {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV}{@code ::combinerOps} <b>must</b> be {@link KHRFragmentShadingRate#VK_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR} or {@link KHRFragmentShadingRate#VK_FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-supersampleFragmentShadingRates">supersampleFragmentShadingRates feature</a> is not enabled, {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV}{@code ::shadingRate} <b>must</b> not be equal to {@link NVFragmentShadingRateEnums#VK_FRAGMENT_SHADING_RATE_2_INVOCATIONS_PER_PIXEL_NV FRAGMENT_SHADING_RATE_2_INVOCATIONS_PER_PIXEL_NV}, {@link NVFragmentShadingRateEnums#VK_FRAGMENT_SHADING_RATE_4_INVOCATIONS_PER_PIXEL_NV FRAGMENT_SHADING_RATE_4_INVOCATIONS_PER_PIXEL_NV}, {@link NVFragmentShadingRateEnums#VK_FRAGMENT_SHADING_RATE_8_INVOCATIONS_PER_PIXEL_NV FRAGMENT_SHADING_RATE_8_INVOCATIONS_PER_PIXEL_NV}, or {@link NVFragmentShadingRateEnums#VK_FRAGMENT_SHADING_RATE_16_INVOCATIONS_PER_PIXEL_NV FRAGMENT_SHADING_RATE_16_INVOCATIONS_PER_PIXEL_NV}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-noInvocationFragmentShadingRates">noInvocationFragmentShadingRates feature</a> is not enabled, {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV}{@code ::shadingRate} <b>must</b> not be equal to {@link NVFragmentShadingRateEnums#VK_FRAGMENT_SHADING_RATE_NO_INVOCATIONS_NV FRAGMENT_SHADING_RATE_NO_INVOCATIONS_NV}</li>
 * <li>All elements of the {@code pDynamicStates} member of {@code pDynamicState} <b>must</b> not be {@link KHRRayTracingPipeline#VK_DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a> and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-vertexInputDynamicState">vertexInputDynamicState</a> feature is not enabled, there <b>must</b> be no element of the {@code pDynamicStates} member of {@code pDynamicState} set to {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT}</li>
 * <li>The pipeline <b>must</b> be created with a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-complete">complete set of state</a></li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-colorWriteEnable">colorWriteEnable</a> feature is not enabled, there <b>must</b> be no element of the {@code pDynamicStates} member of {@code pDynamicState} set to {@link EXTColorWriteEnable#VK_DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT}</li>
 * <li>If the pipeline is being created with fragment shader state, and the {@link QCOMRenderPassShaderResolve VK_QCOM_render_pass_shader_resolve} extension is enabled, and if subpass has any input attachments, and if the subpass description contains {@link QCOMRenderPassShaderResolve#VK_SUBPASS_DESCRIPTION_FRAGMENT_REGION_BIT_QCOM SUBPASS_DESCRIPTION_FRAGMENT_REGION_BIT_QCOM}, then the sample count of the input attachments <b>must</b> equal {@code rasterizationSamples}</li>
 * <li>If the pipeline is being created with fragment shader state, and the {@link QCOMRenderPassShaderResolve VK_QCOM_render_pass_shader_resolve} extension is enabled, and if the subpass description contains {@link QCOMRenderPassShaderResolve#VK_SUBPASS_DESCRIPTION_FRAGMENT_REGION_BIT_QCOM SUBPASS_DESCRIPTION_FRAGMENT_REGION_BIT_QCOM}, then {@code sampleShadingEnable} <b>must</b> be false</li>
 * <li>If {@code flags} includes {@link QCOMRenderPassShaderResolve#VK_SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM}, then the subpass <b>must</b> be the last subpass in a subpass dependency chain</li>
 * <li>If {@code flags} includes {@link QCOMRenderPassShaderResolve#VK_SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM}, and if {@code pResolveAttachments} is not {@code NULL}, then each resolve attachment <b>must</b> be {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRendering">{@code dynamicRendering}</a> feature is not enabled, {@code renderPass} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code renderPass} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a>, and either of {@link VkPipelineRenderingCreateInfo}::depthAttachmentFormat or {@link VkPipelineRenderingCreateInfo}::stencilAttachmentFormat are not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, {@code pDepthStencilState} <b>must</b> be a valid pointer to a valid {@link VkPipelineDepthStencilStateCreateInfo} structure</li>
 * <li>If {@code renderPass} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-output">fragment output interface state</a>, and {@link VkPipelineRenderingCreateInfo}::colorAttachmentCount is not equal to 0, {@code pColorBlendState} <b>must</b> be a valid pointer to a valid {@link VkPipelineColorBlendStateCreateInfo} structure</li>
 * <li>If {@code renderPass} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-output">fragment output interface state</a>, {@code pColorBlendState→attachmentCount} <b>must</b> be equal to {@link VkPipelineRenderingCreateInfo}::colorAttachmentCount</li>
 * <li>If {@code renderPass} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a> the fragment shader <b>must</b> not read from any input attachment</li>
 * <li>If {@code renderPass} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, the {@code viewMask} member of a {@link VkPipelineRenderingCreateInfo} structure included in the {@code pNext} chain is not 0, and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-multiview-tess">{@code multiviewTessellationShader}</a> feature is not enabled, then {@code pStages} <b>must</b> not include tessellation shaders</li>
 * <li>If {@code renderPass} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, the {@code viewMask} member of a {@link VkPipelineRenderingCreateInfo} structure included in the {@code pNext} chain is not 0, and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-multiview-gs">{@code multiviewGeometryShader}</a> feature is not enabled, then {@code pStages} <b>must</b> not include a geometry shader</li>
 * <li>If {@code renderPass} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>, and the {@code viewMask} member of a {@link VkPipelineRenderingCreateInfo} structure included in the {@code pNext} chain is not 0, shaders in {@code pStages} <b>must</b> not include variables decorated with the {@code Layer} built-in decoration in their interfaces</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-output">fragment output interface state</a> and {@code renderPass} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code pColorBlendState→attachmentCount} <b>must</b> be equal to the {@code colorAttachmentCount} member of the {@link VkPipelineRenderingCreateInfo} structure included in the {@code pNext} chain</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-shader">fragment shader state</a> and {@code renderPass} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, fragment shaders in {@code pStages} <b>must</b> not include the {@code InputAttachment} capability</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-output">fragment output interface state</a> and {@code renderPass} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, for each color attachment format defined by the {@code pColorAttachmentFormats} member of {@link VkPipelineRenderingCreateInfo}, if its <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> do not contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT}, then the {@code blendEnable} member of the corresponding element of the {@code pAttachments} member of {@code pColorBlendState} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-output">fragment output interface state</a> and {@code renderPass} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, if the {@code pNext} chain includes {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV}, the {@code colorAttachmentCount} member of that structure <b>must</b> be equal to the value of {@link VkPipelineRenderingCreateInfo}{@code ::colorAttachmentCount}</li>
 * <li>If {@code pStages} includes a fragment shader stage, and the fragment shader code enables <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-fragment-earlytest">early fragment tests</a>, the {@code flags} member of {@link VkPipelineDepthStencilStateCreateInfo} <b>must</b> not include {@link ARMRasterizationOrderAttachmentAccess#VK_PIPELINE_DEPTH_STENCIL_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS_BIT_ARM PIPELINE_DEPTH_STENCIL_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS_BIT_ARM} or {@link ARMRasterizationOrderAttachmentAccess#VK_PIPELINE_DEPTH_STENCIL_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS_BIT_ARM PIPELINE_DEPTH_STENCIL_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS_BIT_ARM}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-output">fragment output interface state</a> and the {@code flags} member of {@link VkPipelineColorBlendStateCreateInfo} includes {@link ARMRasterizationOrderAttachmentAccess#VK_PIPELINE_COLOR_BLEND_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_BIT_ARM PIPELINE_COLOR_BLEND_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_BIT_ARM}, {@code renderpass} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-output">fragment output interface state</a> and the {@code flags} member of {@link VkPipelineDepthStencilStateCreateInfo} includes {@link ARMRasterizationOrderAttachmentAccess#VK_PIPELINE_DEPTH_STENCIL_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS_BIT_ARM PIPELINE_DEPTH_STENCIL_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS_BIT_ARM} or {@link ARMRasterizationOrderAttachmentAccess#VK_PIPELINE_DEPTH_STENCIL_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS_BIT_ARM PIPELINE_DEPTH_STENCIL_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS_BIT_ARM}, {@code renderpass} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-output">fragment output interface state</a> and the {@code flags} member of {@link VkPipelineColorBlendStateCreateInfo} includes {@link ARMRasterizationOrderAttachmentAccess#VK_PIPELINE_COLOR_BLEND_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_BIT_ARM PIPELINE_COLOR_BLEND_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_BIT_ARM} {@code subpass} <b>must</b> have been created with {@link ARMRasterizationOrderAttachmentAccess#VK_SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_COLOR_ACCESS_BIT_ARM SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_COLOR_ACCESS_BIT_ARM}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-output">fragment output interface state</a> and the {@code flags} member of {@link VkPipelineDepthStencilStateCreateInfo} includes {@link ARMRasterizationOrderAttachmentAccess#VK_PIPELINE_DEPTH_STENCIL_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS_BIT_ARM PIPELINE_DEPTH_STENCIL_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS_BIT_ARM}, {@code subpass} <b>must</b> have been created with {@link ARMRasterizationOrderAttachmentAccess#VK_SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS_BIT_ARM SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS_BIT_ARM}</li>
 * <li>If the pipeline is being created with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-fragment-output">fragment output interface state</a> and the {@code flags} member of {@link VkPipelineDepthStencilStateCreateInfo} includes {@link ARMRasterizationOrderAttachmentAccess#VK_PIPELINE_DEPTH_STENCIL_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS_BIT_ARM PIPELINE_DEPTH_STENCIL_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS_BIT_ARM}, {@code subpass} <b>must</b> have been created with {@link ARMRasterizationOrderAttachmentAccess#VK_SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS_BIT_ARM SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS_BIT_ARM}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkAttachmentSampleCountInfoAMD}, {@link VkGraphicsPipelineShaderGroupsCreateInfoNV}, {@link VkMultiviewPerViewAttributesInfoNVX}, {@link VkPipelineCompilerControlCreateInfoAMD}, {@link VkPipelineCreationFeedbackCreateInfo}, {@link VkPipelineDiscardRectangleStateCreateInfoEXT}, {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV}, {@link VkPipelineFragmentShadingRateStateCreateInfoKHR}, {@link VkPipelineRenderingCreateInfo}, or {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkPipelineCreateFlagBits} values</li>
 * <li>{@code pStages} <b>must</b> be a valid pointer to an array of {@code stageCount} valid {@link VkPipelineShaderStageCreateInfo} structures</li>
 * <li>{@code pRasterizationState} <b>must</b> be a valid pointer to a valid {@link VkPipelineRasterizationStateCreateInfo} structure</li>
 * <li>If {@code pDynamicState} is not {@code NULL}, {@code pDynamicState} <b>must</b> be a valid pointer to a valid {@link VkPipelineDynamicStateCreateInfo} structure</li>
 * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>If {@code renderPass} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
 * <li>{@code stageCount} <b>must</b> be greater than 0</li>
 * <li>Each of {@code basePipelineHandle}, {@code layout}, and {@code renderPass} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineColorBlendStateCreateInfo}, {@link VkPipelineDepthStencilStateCreateInfo}, {@link VkPipelineDynamicStateCreateInfo}, {@link VkPipelineInputAssemblyStateCreateInfo}, {@link VkPipelineMultisampleStateCreateInfo}, {@link VkPipelineRasterizationStateCreateInfo}, {@link VkPipelineShaderStageCreateInfo}, {@link VkPipelineTessellationStateCreateInfo}, {@link VkPipelineVertexInputStateCreateInfo}, {@link VkPipelineViewportStateCreateInfo}, {@link VK10#vkCreateGraphicsPipelines CreateGraphicsPipelines}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkGraphicsPipelineCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineCreateFlags {@link #flags};
 *     uint32_t {@link #stageCount};
 *     {@link VkPipelineShaderStageCreateInfo VkPipelineShaderStageCreateInfo} const * {@link #pStages};
 *     {@link VkPipelineVertexInputStateCreateInfo VkPipelineVertexInputStateCreateInfo} const * {@link #pVertexInputState};
 *     {@link VkPipelineInputAssemblyStateCreateInfo VkPipelineInputAssemblyStateCreateInfo} const * {@link #pInputAssemblyState};
 *     {@link VkPipelineTessellationStateCreateInfo VkPipelineTessellationStateCreateInfo} const * {@link #pTessellationState};
 *     {@link VkPipelineViewportStateCreateInfo VkPipelineViewportStateCreateInfo} const * {@link #pViewportState};
 *     {@link VkPipelineRasterizationStateCreateInfo VkPipelineRasterizationStateCreateInfo} const * {@link #pRasterizationState};
 *     {@link VkPipelineMultisampleStateCreateInfo VkPipelineMultisampleStateCreateInfo} const * {@link #pMultisampleState};
 *     {@link VkPipelineDepthStencilStateCreateInfo VkPipelineDepthStencilStateCreateInfo} const * {@link #pDepthStencilState};
 *     {@link VkPipelineColorBlendStateCreateInfo VkPipelineColorBlendStateCreateInfo} const * {@link #pColorBlendState};
 *     {@link VkPipelineDynamicStateCreateInfo VkPipelineDynamicStateCreateInfo} const * {@link #pDynamicState};
 *     VkPipelineLayout {@link #layout};
 *     VkRenderPass {@link #renderPass};
 *     uint32_t {@link #subpass};
 *     VkPipeline {@link #basePipelineHandle};
 *     int32_t {@link #basePipelineIndex};
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

    /** the type of this structure. */
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
    /** a pointer to an array of {@code stageCount} {@link VkPipelineShaderStageCreateInfo} structures describing the set of the shader stages to be included in the graphics pipeline. */
    @NativeType("VkPipelineShaderStageCreateInfo const *")
    public VkPipelineShaderStageCreateInfo.Buffer pStages() { return npStages(address()); }
    /** a pointer to a {@link VkPipelineVertexInputStateCreateInfo} structure. It is ignored if the pipeline includes a mesh shader stage. It is ignored if the pipeline is created with the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state set. */
    @Nullable
    @NativeType("VkPipelineVertexInputStateCreateInfo const *")
    public VkPipelineVertexInputStateCreateInfo pVertexInputState() { return npVertexInputState(address()); }
    /** a pointer to a {@link VkPipelineInputAssemblyStateCreateInfo} structure which determines input assembly behavior, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#drawing">Drawing Commands</a>. It is ignored if the pipeline includes a mesh shader stage. */
    @Nullable
    @NativeType("VkPipelineInputAssemblyStateCreateInfo const *")
    public VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState() { return npInputAssemblyState(address()); }
    /** a pointer to a {@link VkPipelineTessellationStateCreateInfo} structure, and is ignored if the pipeline does not include a tessellation control shader stage and tessellation evaluation shader stage. */
    @Nullable
    @NativeType("VkPipelineTessellationStateCreateInfo const *")
    public VkPipelineTessellationStateCreateInfo pTessellationState() { return npTessellationState(address()); }
    /** a pointer to a {@link VkPipelineViewportStateCreateInfo} structure, and is ignored if the pipeline has rasterization disabled. */
    @Nullable
    @NativeType("VkPipelineViewportStateCreateInfo const *")
    public VkPipelineViewportStateCreateInfo pViewportState() { return npViewportState(address()); }
    /** a pointer to a {@link VkPipelineRasterizationStateCreateInfo} structure. */
    @NativeType("VkPipelineRasterizationStateCreateInfo const *")
    public VkPipelineRasterizationStateCreateInfo pRasterizationState() { return npRasterizationState(address()); }
    /** a pointer to a {@link VkPipelineMultisampleStateCreateInfo} structure, and is ignored if the pipeline has rasterization disabled. */
    @Nullable
    @NativeType("VkPipelineMultisampleStateCreateInfo const *")
    public VkPipelineMultisampleStateCreateInfo pMultisampleState() { return npMultisampleState(address()); }
    /** a pointer to a {@link VkPipelineDepthStencilStateCreateInfo} structure, and is ignored if the pipeline has rasterization disabled or if no depth/stencil attachment is used. */
    @Nullable
    @NativeType("VkPipelineDepthStencilStateCreateInfo const *")
    public VkPipelineDepthStencilStateCreateInfo pDepthStencilState() { return npDepthStencilState(address()); }
    /** a pointer to a {@link VkPipelineColorBlendStateCreateInfo} structure, and is ignored if the pipeline has rasterization disabled or if no color attachments are used. */
    @Nullable
    @NativeType("VkPipelineColorBlendStateCreateInfo const *")
    public VkPipelineColorBlendStateCreateInfo pColorBlendState() { return npColorBlendState(address()); }
    /** a pointer to a {@link VkPipelineDynamicStateCreateInfo} structure, and is used to indicate which properties of the pipeline state object are dynamic and <b>can</b> be changed independently of the pipeline state. This <b>can</b> be {@code NULL}, which means no state in the pipeline is considered dynamic. */
    @Nullable
    @NativeType("VkPipelineDynamicStateCreateInfo const *")
    public VkPipelineDynamicStateCreateInfo pDynamicState() { return npDynamicState(address()); }
    /** the description of binding locations used by both the pipeline and descriptor sets used with the pipeline. */
    @NativeType("VkPipelineLayout")
    public long layout() { return nlayout(address()); }
    /** a handle to a render pass object describing the environment in which the pipeline will be used. The pipeline <b>must</b> only be used with a render pass instance compatible with the one provided. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-compatibility">Render Pass Compatibility</a> for more information. */
    @NativeType("VkRenderPass")
    public long renderPass() { return nrenderPass(address()); }
    /** the index of the subpass in the render pass where this pipeline will be used. */
    @NativeType("uint32_t")
    public int subpass() { return nsubpass(address()); }
    /** a pipeline to derive from. */
    @NativeType("VkPipeline")
    public long basePipelineHandle() { return nbasePipelineHandle(address()); }
    /** an index into the {@code pCreateInfos} parameter to use as a pipeline to derive from. */
    @NativeType("int32_t")
    public int basePipelineIndex() { return nbasePipelineIndex(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkGraphicsPipelineCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO} value to the {@link #sType} field. */
    public VkGraphicsPipelineCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkGraphicsPipelineCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkAttachmentSampleCountInfoAMD} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkAttachmentSampleCountInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkAttachmentSampleCountInfoNV} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkAttachmentSampleCountInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkGraphicsPipelineShaderGroupsCreateInfoNV} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkGraphicsPipelineShaderGroupsCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMultiviewPerViewAttributesInfoNVX} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkMultiviewPerViewAttributesInfoNVX value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCompilerControlCreateInfoAMD} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineCompilerControlCreateInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineDiscardRectangleStateCreateInfoEXT} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineDiscardRectangleStateCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineFragmentShadingRateEnumStateCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineFragmentShadingRateStateCreateInfoKHR} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineFragmentShadingRateStateCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineRenderingCreateInfo} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineRenderingCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineRenderingCreateInfoKHR} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineRenderingCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineRepresentativeFragmentTestStateCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkGraphicsPipelineCreateInfo flags(@NativeType("VkPipelineCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@link #pStages} field. */
    public VkGraphicsPipelineCreateInfo pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) { npStages(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineVertexInputStateCreateInfo} to the {@link #pVertexInputState} field. */
    public VkGraphicsPipelineCreateInfo pVertexInputState(@Nullable @NativeType("VkPipelineVertexInputStateCreateInfo const *") VkPipelineVertexInputStateCreateInfo value) { npVertexInputState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineInputAssemblyStateCreateInfo} to the {@link #pInputAssemblyState} field. */
    public VkGraphicsPipelineCreateInfo pInputAssemblyState(@Nullable @NativeType("VkPipelineInputAssemblyStateCreateInfo const *") VkPipelineInputAssemblyStateCreateInfo value) { npInputAssemblyState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineTessellationStateCreateInfo} to the {@link #pTessellationState} field. */
    public VkGraphicsPipelineCreateInfo pTessellationState(@Nullable @NativeType("VkPipelineTessellationStateCreateInfo const *") VkPipelineTessellationStateCreateInfo value) { npTessellationState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineViewportStateCreateInfo} to the {@link #pViewportState} field. */
    public VkGraphicsPipelineCreateInfo pViewportState(@Nullable @NativeType("VkPipelineViewportStateCreateInfo const *") VkPipelineViewportStateCreateInfo value) { npViewportState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineRasterizationStateCreateInfo} to the {@link #pRasterizationState} field. */
    public VkGraphicsPipelineCreateInfo pRasterizationState(@NativeType("VkPipelineRasterizationStateCreateInfo const *") VkPipelineRasterizationStateCreateInfo value) { npRasterizationState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineMultisampleStateCreateInfo} to the {@link #pMultisampleState} field. */
    public VkGraphicsPipelineCreateInfo pMultisampleState(@Nullable @NativeType("VkPipelineMultisampleStateCreateInfo const *") VkPipelineMultisampleStateCreateInfo value) { npMultisampleState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineDepthStencilStateCreateInfo} to the {@link #pDepthStencilState} field. */
    public VkGraphicsPipelineCreateInfo pDepthStencilState(@Nullable @NativeType("VkPipelineDepthStencilStateCreateInfo const *") VkPipelineDepthStencilStateCreateInfo value) { npDepthStencilState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineColorBlendStateCreateInfo} to the {@link #pColorBlendState} field. */
    public VkGraphicsPipelineCreateInfo pColorBlendState(@Nullable @NativeType("VkPipelineColorBlendStateCreateInfo const *") VkPipelineColorBlendStateCreateInfo value) { npColorBlendState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineDynamicStateCreateInfo} to the {@link #pDynamicState} field. */
    public VkGraphicsPipelineCreateInfo pDynamicState(@Nullable @NativeType("VkPipelineDynamicStateCreateInfo const *") VkPipelineDynamicStateCreateInfo value) { npDynamicState(address(), value); return this; }
    /** Sets the specified value to the {@link #layout} field. */
    public VkGraphicsPipelineCreateInfo layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@link #renderPass} field. */
    public VkGraphicsPipelineCreateInfo renderPass(@NativeType("VkRenderPass") long value) { nrenderPass(address(), value); return this; }
    /** Sets the specified value to the {@link #subpass} field. */
    public VkGraphicsPipelineCreateInfo subpass(@NativeType("uint32_t") int value) { nsubpass(address(), value); return this; }
    /** Sets the specified value to the {@link #basePipelineHandle} field. */
    public VkGraphicsPipelineCreateInfo basePipelineHandle(@NativeType("VkPipeline") long value) { nbasePipelineHandle(address(), value); return this; }
    /** Sets the specified value to the {@link #basePipelineIndex} field. */
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

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkGraphicsPipelineCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkGraphicsPipelineCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkGraphicsPipelineCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkGraphicsPipelineCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGraphicsPipelineCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGraphicsPipelineCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGraphicsPipelineCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGraphicsPipelineCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkGraphicsPipelineCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGraphicsPipelineCreateInfo malloc(MemoryStack stack) {
        return wrap(VkGraphicsPipelineCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkGraphicsPipelineCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGraphicsPipelineCreateInfo calloc(MemoryStack stack) {
        return wrap(VkGraphicsPipelineCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
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
        validate(pStages, stageCount, VkPipelineShaderStageCreateInfo.SIZEOF, VkPipelineShaderStageCreateInfo::validate);
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

        /** @return the value of the {@link VkGraphicsPipelineCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGraphicsPipelineCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkGraphicsPipelineCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGraphicsPipelineCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkGraphicsPipelineCreateInfo#flags} field. */
        @NativeType("VkPipelineCreateFlags")
        public int flags() { return VkGraphicsPipelineCreateInfo.nflags(address()); }
        /** @return the value of the {@link VkGraphicsPipelineCreateInfo#stageCount} field. */
        @NativeType("uint32_t")
        public int stageCount() { return VkGraphicsPipelineCreateInfo.nstageCount(address()); }
        /** @return a {@link VkPipelineShaderStageCreateInfo.Buffer} view of the struct array pointed to by the {@link VkGraphicsPipelineCreateInfo#pStages} field. */
        @NativeType("VkPipelineShaderStageCreateInfo const *")
        public VkPipelineShaderStageCreateInfo.Buffer pStages() { return VkGraphicsPipelineCreateInfo.npStages(address()); }
        /** @return a {@link VkPipelineVertexInputStateCreateInfo} view of the struct pointed to by the {@link VkGraphicsPipelineCreateInfo#pVertexInputState} field. */
        @Nullable
        @NativeType("VkPipelineVertexInputStateCreateInfo const *")
        public VkPipelineVertexInputStateCreateInfo pVertexInputState() { return VkGraphicsPipelineCreateInfo.npVertexInputState(address()); }
        /** @return a {@link VkPipelineInputAssemblyStateCreateInfo} view of the struct pointed to by the {@link VkGraphicsPipelineCreateInfo#pInputAssemblyState} field. */
        @Nullable
        @NativeType("VkPipelineInputAssemblyStateCreateInfo const *")
        public VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState() { return VkGraphicsPipelineCreateInfo.npInputAssemblyState(address()); }
        /** @return a {@link VkPipelineTessellationStateCreateInfo} view of the struct pointed to by the {@link VkGraphicsPipelineCreateInfo#pTessellationState} field. */
        @Nullable
        @NativeType("VkPipelineTessellationStateCreateInfo const *")
        public VkPipelineTessellationStateCreateInfo pTessellationState() { return VkGraphicsPipelineCreateInfo.npTessellationState(address()); }
        /** @return a {@link VkPipelineViewportStateCreateInfo} view of the struct pointed to by the {@link VkGraphicsPipelineCreateInfo#pViewportState} field. */
        @Nullable
        @NativeType("VkPipelineViewportStateCreateInfo const *")
        public VkPipelineViewportStateCreateInfo pViewportState() { return VkGraphicsPipelineCreateInfo.npViewportState(address()); }
        /** @return a {@link VkPipelineRasterizationStateCreateInfo} view of the struct pointed to by the {@link VkGraphicsPipelineCreateInfo#pRasterizationState} field. */
        @NativeType("VkPipelineRasterizationStateCreateInfo const *")
        public VkPipelineRasterizationStateCreateInfo pRasterizationState() { return VkGraphicsPipelineCreateInfo.npRasterizationState(address()); }
        /** @return a {@link VkPipelineMultisampleStateCreateInfo} view of the struct pointed to by the {@link VkGraphicsPipelineCreateInfo#pMultisampleState} field. */
        @Nullable
        @NativeType("VkPipelineMultisampleStateCreateInfo const *")
        public VkPipelineMultisampleStateCreateInfo pMultisampleState() { return VkGraphicsPipelineCreateInfo.npMultisampleState(address()); }
        /** @return a {@link VkPipelineDepthStencilStateCreateInfo} view of the struct pointed to by the {@link VkGraphicsPipelineCreateInfo#pDepthStencilState} field. */
        @Nullable
        @NativeType("VkPipelineDepthStencilStateCreateInfo const *")
        public VkPipelineDepthStencilStateCreateInfo pDepthStencilState() { return VkGraphicsPipelineCreateInfo.npDepthStencilState(address()); }
        /** @return a {@link VkPipelineColorBlendStateCreateInfo} view of the struct pointed to by the {@link VkGraphicsPipelineCreateInfo#pColorBlendState} field. */
        @Nullable
        @NativeType("VkPipelineColorBlendStateCreateInfo const *")
        public VkPipelineColorBlendStateCreateInfo pColorBlendState() { return VkGraphicsPipelineCreateInfo.npColorBlendState(address()); }
        /** @return a {@link VkPipelineDynamicStateCreateInfo} view of the struct pointed to by the {@link VkGraphicsPipelineCreateInfo#pDynamicState} field. */
        @Nullable
        @NativeType("VkPipelineDynamicStateCreateInfo const *")
        public VkPipelineDynamicStateCreateInfo pDynamicState() { return VkGraphicsPipelineCreateInfo.npDynamicState(address()); }
        /** @return the value of the {@link VkGraphicsPipelineCreateInfo#layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkGraphicsPipelineCreateInfo.nlayout(address()); }
        /** @return the value of the {@link VkGraphicsPipelineCreateInfo#renderPass} field. */
        @NativeType("VkRenderPass")
        public long renderPass() { return VkGraphicsPipelineCreateInfo.nrenderPass(address()); }
        /** @return the value of the {@link VkGraphicsPipelineCreateInfo#subpass} field. */
        @NativeType("uint32_t")
        public int subpass() { return VkGraphicsPipelineCreateInfo.nsubpass(address()); }
        /** @return the value of the {@link VkGraphicsPipelineCreateInfo#basePipelineHandle} field. */
        @NativeType("VkPipeline")
        public long basePipelineHandle() { return VkGraphicsPipelineCreateInfo.nbasePipelineHandle(address()); }
        /** @return the value of the {@link VkGraphicsPipelineCreateInfo#basePipelineIndex} field. */
        @NativeType("int32_t")
        public int basePipelineIndex() { return VkGraphicsPipelineCreateInfo.nbasePipelineIndex(address()); }

        /** Sets the specified value to the {@link VkGraphicsPipelineCreateInfo#sType} field. */
        public VkGraphicsPipelineCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkGraphicsPipelineCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO} value to the {@link VkGraphicsPipelineCreateInfo#sType} field. */
        public VkGraphicsPipelineCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO); }
        /** Sets the specified value to the {@link VkGraphicsPipelineCreateInfo#pNext} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkGraphicsPipelineCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkAttachmentSampleCountInfoAMD} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkAttachmentSampleCountInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkAttachmentSampleCountInfoNV} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkAttachmentSampleCountInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkGraphicsPipelineShaderGroupsCreateInfoNV} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkGraphicsPipelineShaderGroupsCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMultiviewPerViewAttributesInfoNVX} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkMultiviewPerViewAttributesInfoNVX value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCompilerControlCreateInfoAMD} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineCompilerControlCreateInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineDiscardRectangleStateCreateInfoEXT} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineDiscardRectangleStateCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineFragmentShadingRateEnumStateCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineFragmentShadingRateStateCreateInfoKHR} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineFragmentShadingRateStateCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineRenderingCreateInfo} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineRenderingCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineRenderingCreateInfoKHR} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineRenderingCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineRepresentativeFragmentTestStateCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkGraphicsPipelineCreateInfo#flags} field. */
        public VkGraphicsPipelineCreateInfo.Buffer flags(@NativeType("VkPipelineCreateFlags") int value) { VkGraphicsPipelineCreateInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@link VkGraphicsPipelineCreateInfo#pStages} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) { VkGraphicsPipelineCreateInfo.npStages(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineVertexInputStateCreateInfo} to the {@link VkGraphicsPipelineCreateInfo#pVertexInputState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pVertexInputState(@Nullable @NativeType("VkPipelineVertexInputStateCreateInfo const *") VkPipelineVertexInputStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npVertexInputState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineInputAssemblyStateCreateInfo} to the {@link VkGraphicsPipelineCreateInfo#pInputAssemblyState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pInputAssemblyState(@Nullable @NativeType("VkPipelineInputAssemblyStateCreateInfo const *") VkPipelineInputAssemblyStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npInputAssemblyState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineTessellationStateCreateInfo} to the {@link VkGraphicsPipelineCreateInfo#pTessellationState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pTessellationState(@Nullable @NativeType("VkPipelineTessellationStateCreateInfo const *") VkPipelineTessellationStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npTessellationState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineViewportStateCreateInfo} to the {@link VkGraphicsPipelineCreateInfo#pViewportState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pViewportState(@Nullable @NativeType("VkPipelineViewportStateCreateInfo const *") VkPipelineViewportStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npViewportState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineRasterizationStateCreateInfo} to the {@link VkGraphicsPipelineCreateInfo#pRasterizationState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pRasterizationState(@NativeType("VkPipelineRasterizationStateCreateInfo const *") VkPipelineRasterizationStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npRasterizationState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineMultisampleStateCreateInfo} to the {@link VkGraphicsPipelineCreateInfo#pMultisampleState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pMultisampleState(@Nullable @NativeType("VkPipelineMultisampleStateCreateInfo const *") VkPipelineMultisampleStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npMultisampleState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineDepthStencilStateCreateInfo} to the {@link VkGraphicsPipelineCreateInfo#pDepthStencilState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pDepthStencilState(@Nullable @NativeType("VkPipelineDepthStencilStateCreateInfo const *") VkPipelineDepthStencilStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npDepthStencilState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineColorBlendStateCreateInfo} to the {@link VkGraphicsPipelineCreateInfo#pColorBlendState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pColorBlendState(@Nullable @NativeType("VkPipelineColorBlendStateCreateInfo const *") VkPipelineColorBlendStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npColorBlendState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineDynamicStateCreateInfo} to the {@link VkGraphicsPipelineCreateInfo#pDynamicState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pDynamicState(@Nullable @NativeType("VkPipelineDynamicStateCreateInfo const *") VkPipelineDynamicStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npDynamicState(address(), value); return this; }
        /** Sets the specified value to the {@link VkGraphicsPipelineCreateInfo#layout} field. */
        public VkGraphicsPipelineCreateInfo.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkGraphicsPipelineCreateInfo.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkGraphicsPipelineCreateInfo#renderPass} field. */
        public VkGraphicsPipelineCreateInfo.Buffer renderPass(@NativeType("VkRenderPass") long value) { VkGraphicsPipelineCreateInfo.nrenderPass(address(), value); return this; }
        /** Sets the specified value to the {@link VkGraphicsPipelineCreateInfo#subpass} field. */
        public VkGraphicsPipelineCreateInfo.Buffer subpass(@NativeType("uint32_t") int value) { VkGraphicsPipelineCreateInfo.nsubpass(address(), value); return this; }
        /** Sets the specified value to the {@link VkGraphicsPipelineCreateInfo#basePipelineHandle} field. */
        public VkGraphicsPipelineCreateInfo.Buffer basePipelineHandle(@NativeType("VkPipeline") long value) { VkGraphicsPipelineCreateInfo.nbasePipelineHandle(address(), value); return this; }
        /** Sets the specified value to the {@link VkGraphicsPipelineCreateInfo#basePipelineIndex} field. */
        public VkGraphicsPipelineCreateInfo.Buffer basePipelineIndex(@NativeType("int32_t") int value) { VkGraphicsPipelineCreateInfo.nbasePipelineIndex(address(), value); return this; }

    }

}