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
 * Structure specifying parameters of a newly created shader.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, {@code codeSize} <b>must</b> be a multiple of 4</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, {@code pCode} <b>must</b> point to valid SPIR-V code, formatted and packed as described by the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#spirv-spec">Khronos SPIR-V Specification</a></li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, {@code pCode} <b>must</b> adhere to the validation rules described by the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#spirvenv-module-validation">Validation Rules within a Module</a> section of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#spirvenv-capabilities">SPIR-V Environment</a> appendix</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, {@code pCode} <b>must</b> declare the {@code Shader} capability for SPIR-V code</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, {@code pCode} <b>must</b> not declare any capability that is not supported by the API, as described by the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#spirvenv-module-validation">Capabilities</a> section of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#spirvenv-capabilities">SPIR-V Environment</a> appendix</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and {@code pCode} declares any of the capabilities listed in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#spirvenv-capabilities-table">SPIR-V Environment</a> appendix, one of the corresponding requirements <b>must</b> be satisfied</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, {@code pCode} <b>must</b> not declare any SPIR-V extension that is not supported by the API, as described by the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#spirvenv-extensions">Extension</a> section of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#spirvenv-capabilities">SPIR-V Environment</a> appendix</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and {@code pCode} declares any of the SPIR-V extensions listed in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#spirvenv-extensions-table">SPIR-V Environment</a> appendix, one of the corresponding requirements <b>must</b> be satisfied</li>
 * <li>If {@code stage} is not {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT}, {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT}, {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}, {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT}, {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}, or {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}, {@code flags} <b>must</b> not include {@link EXTShaderObject#VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT}</li>
 * <li>If {@code stage} is not {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}, {@code flags} <b>must</b> not include {@link EXTShaderObject#VK_SHADER_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_EXT SHADER_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_EXT}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-attachmentFragmentShadingRate">{@code attachmentFragmentShadingRate}</a> feature is not enabled, {@code flags} <b>must</b> not include {@link EXTShaderObject#VK_SHADER_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_EXT SHADER_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_EXT}</li>
 * <li>If {@code stage} is not {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}, {@code flags} <b>must</b> not include {@link EXTShaderObject#VK_SHADER_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT SHADER_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-fragmentDensityMap">{@code fragmentDensityMap}</a> feature is not enabled, {@code flags} <b>must</b> not include {@link EXTShaderObject#VK_SHADER_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT SHADER_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT}</li>
 * <li>If {@code flags} includes {@link EXTShaderObject#VK_SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT}, {@code stage} <b>must</b> be one of {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT}, {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT}, or {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT}</li>
 * <li>If {@code stage} is not {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT}, {@code flags} <b>must</b> not include {@link EXTShaderObject#VK_SHADER_CREATE_DISPATCH_BASE_BIT_EXT SHADER_CREATE_DISPATCH_BASE_BIT_EXT}</li>
 * <li>If {@code stage} is not {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT}, {@code flags} <b>must</b> not include {@link EXTShaderObject#VK_SHADER_CREATE_NO_TASK_SHADER_BIT_EXT SHADER_CREATE_NO_TASK_SHADER_BIT_EXT}</li>
 * <li>If {@code flags} includes both {@link EXTShaderObject#VK_SHADER_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT SHADER_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT} and {@link EXTShaderObject#VK_SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT}, the local workgroup size in the X dimension of the shader <b>must</b> be a multiple of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxSubgroupSize">{@code maxSubgroupSize}</a></li>
 * <li>If {@code flags} includes {@link EXTShaderObject#VK_SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT} but not {@link EXTShaderObject#VK_SHADER_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT SHADER_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT} and no {@link VkShaderRequiredSubgroupSizeCreateInfoEXT} structure is included in the {@code pNext} chain, the local workgroup size in the X dimension of the shader <b>must</b> be a multiple of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-subgroup-size">{@code subgroupSize}</a></li>
 * <li>{@code stage} <b>must</b> not be {@link VK10#VK_SHADER_STAGE_ALL_GRAPHICS SHADER_STAGE_ALL_GRAPHICS} or {@link VK10#VK_SHADER_STAGE_ALL SHADER_STAGE_ALL}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-tessellationShader">{@code tessellationShader}</a> feature is not enabled, {@code stage} <b>must</b> not be {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT} or {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-geometryShader">{@code geometryShader}</a> feature is not enabled, {@code stage} <b>must</b> not be {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-taskShader">{@code taskShader}</a> feature is not enabled, {@code stage} <b>must</b> not be {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-meshShader">{@code meshShader}</a> feature is not enabled, {@code stage} <b>must</b> not be {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT}</li>
 * <li>{@code stage} <b>must</b> not be {@link HUAWEISubpassShading#VK_SHADER_STAGE_SUBPASS_SHADING_BIT_HUAWEI SHADER_STAGE_SUBPASS_SHADING_BIT_HUAWEI}</li>
 * <li>{@code stage} <b>must</b> not be {@link HUAWEIClusterCullingShader#VK_SHADER_STAGE_CLUSTER_CULLING_BIT_HUAWEI SHADER_STAGE_CLUSTER_CULLING_BIT_HUAWEI}</li>
 * <li>If {@code stage} is {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}, {@code nextStage} <b>must</b> not include any bits other than {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT}, {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}, and {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-tessellationShader">{@code tessellationShader}</a> feature is not enabled, {@code nextStage} <b>must</b> not include {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT} or {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-geometryShader">{@code geometryShader}</a> feature is not enabled, {@code nextStage} <b>must</b> not include {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}</li>
 * <li>If {@code stage} is {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT}, {@code nextStage} <b>must</b> not include any bits other than {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}</li>
 * <li>If {@code stage} is {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, {@code nextStage} <b>must</b> not include any bits other than {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT} and {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}</li>
 * <li>If {@code stage} is {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}, {@code nextStage} <b>must</b> not include any bits other than {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}</li>
 * <li>If {@code stage} is {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} or {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT}, {@code nextStage} <b>must</b> be 0</li>
 * <li>If {@code stage} is {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT}, {@code nextStage} <b>must</b> not include any bits other than {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT}</li>
 * <li>If {@code stage} is {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT}, {@code nextStage} <b>must</b> not include any bits other than {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, {@code pName} <b>must</b> be the name of an {@code OpEntryPoint} in {@code pCode} with an execution model that matches {@code stage}</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_BINARY_EXT SHADER_CODE_TYPE_BINARY_EXT}, {@code pCode} <b>must</b> be aligned to 16 bytes</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, {@code pCode} <b>must</b> be aligned to 4 bytes</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and the identified entry point includes any variable in its interface that is declared with the {@code ClipDistance} {@code BuiltIn} decoration, that variable <b>must</b> not have an array size greater than {@link VkPhysicalDeviceLimits}{@code ::maxClipDistances}</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and the identified entry point includes any variable in its interface that is declared with the {@code CullDistance} {@code BuiltIn} decoration, that variable <b>must</b> not have an array size greater than {@link VkPhysicalDeviceLimits}{@code ::maxCullDistances}</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and the identified entry point includes any variables in its interface that are declared with the {@code ClipDistance} or {@code CullDistance} {@code BuiltIn} decoration, those variables <b>must</b> not have array sizes which sum to more than {@link VkPhysicalDeviceLimits}{@code ::maxCombinedClipAndCullDistances}</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and the identified entry point includes any variable in its interface that is declared with the {@code SampleMask} {@code BuiltIn} decoration, that variable <b>must</b> not have an array size greater than {@link VkPhysicalDeviceLimits}{@code ::maxSampleMaskWords}</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and {@code stage} is {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}, the identified entry point <b>must</b> not include any input variable in its interface that is decorated with {@code CullDistance}</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and {@code stage} is {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT} or {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, and the identified entry point has an {@code OpExecutionMode} instruction specifying a patch size with {@code OutputVertices}, the patch size <b>must</b> be greater than 0 and less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxTessellationPatchSize}</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and {@code stage} is {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}, the identified entry point <b>must</b> have an {@code OpExecutionMode} instruction specifying a maximum output vertex count that is greater than 0 and less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxGeometryOutputVertices}</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and {@code stage} is {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}, the identified entry point <b>must</b> have an {@code OpExecutionMode} instruction specifying an invocation count that is greater than 0 and less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxGeometryShaderInvocations}</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and {@code stage} is a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-graphics-subsets-pre-rasterization">pre-rasterization shader stage</a>, and the identified entry point writes to {@code Layer} for any primitive, it <b>must</b> write the same value to {@code Layer} for all vertices of a given primitive</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and {@code stage} is a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-graphics-subsets-pre-rasterization">pre-rasterization shader stage</a>, and the identified entry point writes to {@code ViewportIndex} for any primitive, it <b>must</b> write the same value to {@code ViewportIndex} for all vertices of a given primitive</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and {@code stage} is {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}, the identified entry point <b>must</b> not include any output variables in its interface decorated with {@code CullDistance}</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and {@code stage} is {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}, and the identified entry point writes to {@code FragDepth} in any execution path, all execution paths that are not exclusive to helper invocations <b>must</b> either discard the fragment, or write or initialize the value of {@code FragDepth}</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, the shader code in {@code pCode} <b>must</b> be valid as described by the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#spirv-spec">Khronos SPIR-V Specification</a> after applying the specializations provided in {@code pSpecializationInfo}, if any, and then converting all specialization constants into fixed constants</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and {@code stage} is {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, {@code pCode} <b>must</b> contain an {@code OpExecutionMode} instruction specifying the type of subdivision</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and {@code stage} is {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, {@code pCode} <b>must</b> contain an {@code OpExecutionMode} instruction specifying the orientation of triangles generated by the tessellator</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and {@code stage} is {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, {@code pCode} <b>must</b> contain an {@code OpExecutionMode} instruction specifying the spacing of segments on the edges of tessellated primitives</li>
 * <li>If {@code codeType} is {@link EXTShaderObject#VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and {@code stage} is {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, {@code pCode} <b>must</b> contain an {@code OpExecutionMode} instruction specifying the output patch size</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTShaderObject#VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkShaderCreateFlagBitsEXT} values</li>
 * <li>{@code stage} <b>must</b> be a valid {@code VkShaderStageFlagBits} value</li>
 * <li>{@code nextStage} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
 * <li>{@code codeType} <b>must</b> be a valid {@code VkShaderCodeTypeEXT} value</li>
 * <li>{@code pCode} <b>must</b> be a valid pointer to an array of {@code codeSize} bytes</li>
 * <li>If {@code pName} is not {@code NULL}, {@code pName} <b>must</b> be a null-terminated UTF-8 string</li>
 * <li>If {@code setLayoutCount} is not 0, and {@code pSetLayouts} is not {@code NULL}, {@code pSetLayouts} <b>must</b> be a valid pointer to an array of {@code setLayoutCount} valid {@code VkDescriptorSetLayout} handles</li>
 * <li>If {@code pushConstantRangeCount} is not 0, and {@code pPushConstantRanges} is not {@code NULL}, {@code pPushConstantRanges} <b>must</b> be a valid pointer to an array of {@code pushConstantRangeCount} valid {@link VkPushConstantRange} structures</li>
 * <li>If {@code pSpecializationInfo} is not {@code NULL}, {@code pSpecializationInfo} <b>must</b> be a valid pointer to a valid {@link VkSpecializationInfo} structure</li>
 * <li>{@code codeSize} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPushConstantRange}, {@link VkSpecializationInfo}, {@link EXTShaderObject#vkCreateShadersEXT CreateShadersEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkShaderCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkShaderCreateFlagsEXT {@link #flags};
 *     VkShaderStageFlagBits {@link #stage};
 *     VkShaderStageFlags {@link #nextStage};
 *     VkShaderCodeTypeEXT {@link #codeType};
 *     size_t {@link #codeSize};
 *     void const * {@link #pCode};
 *     char const * {@link #pName};
 *     uint32_t {@link #setLayoutCount};
 *     VkDescriptorSetLayout const * {@link #pSetLayouts};
 *     uint32_t {@link #pushConstantRangeCount};
 *     {@link VkPushConstantRange VkPushConstantRange} const * {@link #pPushConstantRanges};
 *     {@link VkSpecializationInfo VkSpecializationInfo} const * {@link #pSpecializationInfo};
 * }</code></pre>
 */
public class VkShaderCreateInfoEXT extends Struct<VkShaderCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        STAGE,
        NEXTSTAGE,
        CODETYPE,
        CODESIZE,
        PCODE,
        PNAME,
        SETLAYOUTCOUNT,
        PSETLAYOUTS,
        PUSHCONSTANTRANGECOUNT,
        PPUSHCONSTANTRANGES,
        PSPECIALIZATIONINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        STAGE = layout.offsetof(3);
        NEXTSTAGE = layout.offsetof(4);
        CODETYPE = layout.offsetof(5);
        CODESIZE = layout.offsetof(6);
        PCODE = layout.offsetof(7);
        PNAME = layout.offsetof(8);
        SETLAYOUTCOUNT = layout.offsetof(9);
        PSETLAYOUTS = layout.offsetof(10);
        PUSHCONSTANTRANGECOUNT = layout.offsetof(11);
        PPUSHCONSTANTRANGES = layout.offsetof(12);
        PSPECIALIZATIONINFO = layout.offsetof(13);
    }

    protected VkShaderCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkShaderCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkShaderCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkShaderCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkShaderCreateInfoEXT(ByteBuffer container) {
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
    /** a bitmask of {@code VkShaderCreateFlagBitsEXT} describing additional parameters of the shader. */
    @NativeType("VkShaderCreateFlagsEXT")
    public int flags() { return nflags(address()); }
    /** a {@code VkShaderStageFlagBits} value specifying a single shader stage. */
    @NativeType("VkShaderStageFlagBits")
    public int stage() { return nstage(address()); }
    /** a bitmask of {@code VkShaderStageFlagBits} specifying zero or stages which <b>may</b> be used as a logically next bound stage when drawing with the shader bound. */
    @NativeType("VkShaderStageFlags")
    public int nextStage() { return nnextStage(address()); }
    /** a {@code VkShaderCodeTypeEXT} value specifying the type of the shader code pointed to be {@code pCode}. */
    @NativeType("VkShaderCodeTypeEXT")
    public int codeType() { return ncodeType(address()); }
    /** the size in bytes of the shader code pointed to be {@code pCode}. */
    @NativeType("size_t")
    public long codeSize() { return ncodeSize(address()); }
    /** a pointer to the shader code to use to create the shader. */
    @NativeType("void const *")
    public ByteBuffer pCode() { return npCode(address()); }
    /** a pointer to a null-terminated UTF-8 string specifying the entry point name of the shader for this stage. */
    @Nullable
    @NativeType("char const *")
    public ByteBuffer pName() { return npName(address()); }
    /** a pointer to a null-terminated UTF-8 string specifying the entry point name of the shader for this stage. */
    @Nullable
    @NativeType("char const *")
    public String pNameString() { return npNameString(address()); }
    /** the number of descriptor set layouts pointed to by {@code pSetLayouts}. */
    @NativeType("uint32_t")
    public int setLayoutCount() { return nsetLayoutCount(address()); }
    /** a pointer to an array of {@code VkDescriptorSetLayout} objects used by the shader stage. */
    @Nullable
    @NativeType("VkDescriptorSetLayout const *")
    public LongBuffer pSetLayouts() { return npSetLayouts(address()); }
    /** the number of push constant ranges pointed to by {@code pPushConstantRanges}. */
    @NativeType("uint32_t")
    public int pushConstantRangeCount() { return npushConstantRangeCount(address()); }
    /** a pointer to an array of {@link VkPushConstantRange} structures used by the shader stage. */
    @Nullable
    @NativeType("VkPushConstantRange const *")
    public VkPushConstantRange.Buffer pPushConstantRanges() { return npPushConstantRanges(address()); }
    /** a pointer to a {@link VkSpecializationInfo} structure, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-specialization-constants">Specialization Constants</a>, or {@code NULL}. */
    @Nullable
    @NativeType("VkSpecializationInfo const *")
    public VkSpecializationInfo pSpecializationInfo() { return npSpecializationInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkShaderCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTShaderObject#VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkShaderCreateInfoEXT sType$Default() { return sType(EXTShaderObject.VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkShaderCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} value to the {@code pNext} chain. */
    public VkShaderCreateInfoEXT pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} value to the {@code pNext} chain. */
    public VkShaderCreateInfoEXT pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkShaderRequiredSubgroupSizeCreateInfoEXT} value to the {@code pNext} chain. */
    public VkShaderCreateInfoEXT pNext(VkShaderRequiredSubgroupSizeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkShaderCreateInfoEXT flags(@NativeType("VkShaderCreateFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #stage} field. */
    public VkShaderCreateInfoEXT stage(@NativeType("VkShaderStageFlagBits") int value) { nstage(address(), value); return this; }
    /** Sets the specified value to the {@link #nextStage} field. */
    public VkShaderCreateInfoEXT nextStage(@NativeType("VkShaderStageFlags") int value) { nnextStage(address(), value); return this; }
    /** Sets the specified value to the {@link #codeType} field. */
    public VkShaderCreateInfoEXT codeType(@NativeType("VkShaderCodeTypeEXT") int value) { ncodeType(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #pCode} field. */
    public VkShaderCreateInfoEXT pCode(@NativeType("void const *") ByteBuffer value) { npCode(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #pName} field. */
    public VkShaderCreateInfoEXT pName(@Nullable @NativeType("char const *") ByteBuffer value) { npName(address(), value); return this; }
    /** Sets the specified value to the {@link #setLayoutCount} field. */
    public VkShaderCreateInfoEXT setLayoutCount(@NativeType("uint32_t") int value) { nsetLayoutCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pSetLayouts} field. */
    public VkShaderCreateInfoEXT pSetLayouts(@Nullable @NativeType("VkDescriptorSetLayout const *") LongBuffer value) { npSetLayouts(address(), value); return this; }
    /** Sets the specified value to the {@link #pushConstantRangeCount} field. */
    public VkShaderCreateInfoEXT pushConstantRangeCount(@NativeType("uint32_t") int value) { npushConstantRangeCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkPushConstantRange.Buffer} to the {@link #pPushConstantRanges} field. */
    public VkShaderCreateInfoEXT pPushConstantRanges(@Nullable @NativeType("VkPushConstantRange const *") VkPushConstantRange.Buffer value) { npPushConstantRanges(address(), value); return this; }
    /** Sets the address of the specified {@link VkSpecializationInfo} to the {@link #pSpecializationInfo} field. */
    public VkShaderCreateInfoEXT pSpecializationInfo(@Nullable @NativeType("VkSpecializationInfo const *") VkSpecializationInfo value) { npSpecializationInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkShaderCreateInfoEXT set(
        int sType,
        long pNext,
        int flags,
        int stage,
        int nextStage,
        int codeType,
        ByteBuffer pCode,
        @Nullable ByteBuffer pName,
        int setLayoutCount,
        @Nullable LongBuffer pSetLayouts,
        int pushConstantRangeCount,
        @Nullable VkPushConstantRange.Buffer pPushConstantRanges,
        @Nullable VkSpecializationInfo pSpecializationInfo
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        stage(stage);
        nextStage(nextStage);
        codeType(codeType);
        pCode(pCode);
        pName(pName);
        setLayoutCount(setLayoutCount);
        pSetLayouts(pSetLayouts);
        pushConstantRangeCount(pushConstantRangeCount);
        pPushConstantRanges(pPushConstantRanges);
        pSpecializationInfo(pSpecializationInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkShaderCreateInfoEXT set(VkShaderCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkShaderCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkShaderCreateInfoEXT malloc() {
        return new VkShaderCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkShaderCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkShaderCreateInfoEXT calloc() {
        return new VkShaderCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkShaderCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkShaderCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkShaderCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkShaderCreateInfoEXT} instance for the specified memory address. */
    public static VkShaderCreateInfoEXT create(long address) {
        return new VkShaderCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkShaderCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkShaderCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkShaderCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkShaderCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkShaderCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkShaderCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkShaderCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkShaderCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderCreateInfoEXT malloc(MemoryStack stack) {
        return new VkShaderCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkShaderCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderCreateInfoEXT calloc(MemoryStack stack) {
        return new VkShaderCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkShaderCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkShaderCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkShaderCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkShaderCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #stage}. */
    public static int nstage(long struct) { return UNSAFE.getInt(null, struct + VkShaderCreateInfoEXT.STAGE); }
    /** Unsafe version of {@link #nextStage}. */
    public static int nnextStage(long struct) { return UNSAFE.getInt(null, struct + VkShaderCreateInfoEXT.NEXTSTAGE); }
    /** Unsafe version of {@link #codeType}. */
    public static int ncodeType(long struct) { return UNSAFE.getInt(null, struct + VkShaderCreateInfoEXT.CODETYPE); }
    /** Unsafe version of {@link #codeSize}. */
    public static long ncodeSize(long struct) { return memGetAddress(struct + VkShaderCreateInfoEXT.CODESIZE); }
    /** Unsafe version of {@link #pCode() pCode}. */
    public static ByteBuffer npCode(long struct) { return memByteBuffer(memGetAddress(struct + VkShaderCreateInfoEXT.PCODE), (int)ncodeSize(struct)); }
    /** Unsafe version of {@link #pName}. */
    @Nullable public static ByteBuffer npName(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + VkShaderCreateInfoEXT.PNAME)); }
    /** Unsafe version of {@link #pNameString}. */
    @Nullable public static String npNameString(long struct) { return memUTF8Safe(memGetAddress(struct + VkShaderCreateInfoEXT.PNAME)); }
    /** Unsafe version of {@link #setLayoutCount}. */
    public static int nsetLayoutCount(long struct) { return UNSAFE.getInt(null, struct + VkShaderCreateInfoEXT.SETLAYOUTCOUNT); }
    /** Unsafe version of {@link #pSetLayouts() pSetLayouts}. */
    @Nullable public static LongBuffer npSetLayouts(long struct) { return memLongBufferSafe(memGetAddress(struct + VkShaderCreateInfoEXT.PSETLAYOUTS), nsetLayoutCount(struct)); }
    /** Unsafe version of {@link #pushConstantRangeCount}. */
    public static int npushConstantRangeCount(long struct) { return UNSAFE.getInt(null, struct + VkShaderCreateInfoEXT.PUSHCONSTANTRANGECOUNT); }
    /** Unsafe version of {@link #pPushConstantRanges}. */
    @Nullable public static VkPushConstantRange.Buffer npPushConstantRanges(long struct) { return VkPushConstantRange.createSafe(memGetAddress(struct + VkShaderCreateInfoEXT.PPUSHCONSTANTRANGES), npushConstantRangeCount(struct)); }
    /** Unsafe version of {@link #pSpecializationInfo}. */
    @Nullable public static VkSpecializationInfo npSpecializationInfo(long struct) { return VkSpecializationInfo.createSafe(memGetAddress(struct + VkShaderCreateInfoEXT.PSPECIALIZATIONINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkShaderCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkShaderCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkShaderCreateInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #stage(int) stage}. */
    public static void nstage(long struct, int value) { UNSAFE.putInt(null, struct + VkShaderCreateInfoEXT.STAGE, value); }
    /** Unsafe version of {@link #nextStage(int) nextStage}. */
    public static void nnextStage(long struct, int value) { UNSAFE.putInt(null, struct + VkShaderCreateInfoEXT.NEXTSTAGE, value); }
    /** Unsafe version of {@link #codeType(int) codeType}. */
    public static void ncodeType(long struct, int value) { UNSAFE.putInt(null, struct + VkShaderCreateInfoEXT.CODETYPE, value); }
    /** Sets the specified value to the {@code codeSize} field of the specified {@code struct}. */
    public static void ncodeSize(long struct, long value) { memPutAddress(struct + VkShaderCreateInfoEXT.CODESIZE, value); }
    /** Unsafe version of {@link #pCode(ByteBuffer) pCode}. */
    public static void npCode(long struct, ByteBuffer value) { memPutAddress(struct + VkShaderCreateInfoEXT.PCODE, memAddress(value)); ncodeSize(struct, value.remaining()); }
    /** Unsafe version of {@link #pName(ByteBuffer) pName}. */
    public static void npName(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + VkShaderCreateInfoEXT.PNAME, memAddressSafe(value));
    }
    /** Sets the specified value to the {@code setLayoutCount} field of the specified {@code struct}. */
    public static void nsetLayoutCount(long struct, int value) { UNSAFE.putInt(null, struct + VkShaderCreateInfoEXT.SETLAYOUTCOUNT, value); }
    /** Unsafe version of {@link #pSetLayouts(LongBuffer) pSetLayouts}. */
    public static void npSetLayouts(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkShaderCreateInfoEXT.PSETLAYOUTS, memAddressSafe(value)); if (value != null) { nsetLayoutCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code pushConstantRangeCount} field of the specified {@code struct}. */
    public static void npushConstantRangeCount(long struct, int value) { UNSAFE.putInt(null, struct + VkShaderCreateInfoEXT.PUSHCONSTANTRANGECOUNT, value); }
    /** Unsafe version of {@link #pPushConstantRanges(VkPushConstantRange.Buffer) pPushConstantRanges}. */
    public static void npPushConstantRanges(long struct, @Nullable VkPushConstantRange.Buffer value) { memPutAddress(struct + VkShaderCreateInfoEXT.PPUSHCONSTANTRANGES, memAddressSafe(value)); if (value != null) { npushConstantRangeCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #pSpecializationInfo(VkSpecializationInfo) pSpecializationInfo}. */
    public static void npSpecializationInfo(long struct, @Nullable VkSpecializationInfo value) { memPutAddress(struct + VkShaderCreateInfoEXT.PSPECIALIZATIONINFO, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkShaderCreateInfoEXT.PCODE));
        long pSpecializationInfo = memGetAddress(struct + VkShaderCreateInfoEXT.PSPECIALIZATIONINFO);
        if (pSpecializationInfo != NULL) {
            VkSpecializationInfo.validate(pSpecializationInfo);
        }
    }

    // -----------------------------------

    /** An array of {@link VkShaderCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkShaderCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkShaderCreateInfoEXT ELEMENT_FACTORY = VkShaderCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkShaderCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkShaderCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkShaderCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkShaderCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkShaderCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkShaderCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkShaderCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkShaderCreateInfoEXT#flags} field. */
        @NativeType("VkShaderCreateFlagsEXT")
        public int flags() { return VkShaderCreateInfoEXT.nflags(address()); }
        /** @return the value of the {@link VkShaderCreateInfoEXT#stage} field. */
        @NativeType("VkShaderStageFlagBits")
        public int stage() { return VkShaderCreateInfoEXT.nstage(address()); }
        /** @return the value of the {@link VkShaderCreateInfoEXT#nextStage} field. */
        @NativeType("VkShaderStageFlags")
        public int nextStage() { return VkShaderCreateInfoEXT.nnextStage(address()); }
        /** @return the value of the {@link VkShaderCreateInfoEXT#codeType} field. */
        @NativeType("VkShaderCodeTypeEXT")
        public int codeType() { return VkShaderCreateInfoEXT.ncodeType(address()); }
        /** @return the value of the {@link VkShaderCreateInfoEXT#codeSize} field. */
        @NativeType("size_t")
        public long codeSize() { return VkShaderCreateInfoEXT.ncodeSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link VkShaderCreateInfoEXT#pCode} field. */
        @NativeType("void const *")
        public ByteBuffer pCode() { return VkShaderCreateInfoEXT.npCode(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link VkShaderCreateInfoEXT#pName} field. */
        @Nullable
        @NativeType("char const *")
        public ByteBuffer pName() { return VkShaderCreateInfoEXT.npName(address()); }
        /** @return the null-terminated string pointed to by the {@link VkShaderCreateInfoEXT#pName} field. */
        @Nullable
        @NativeType("char const *")
        public String pNameString() { return VkShaderCreateInfoEXT.npNameString(address()); }
        /** @return the value of the {@link VkShaderCreateInfoEXT#setLayoutCount} field. */
        @NativeType("uint32_t")
        public int setLayoutCount() { return VkShaderCreateInfoEXT.nsetLayoutCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkShaderCreateInfoEXT#pSetLayouts} field. */
        @Nullable
        @NativeType("VkDescriptorSetLayout const *")
        public LongBuffer pSetLayouts() { return VkShaderCreateInfoEXT.npSetLayouts(address()); }
        /** @return the value of the {@link VkShaderCreateInfoEXT#pushConstantRangeCount} field. */
        @NativeType("uint32_t")
        public int pushConstantRangeCount() { return VkShaderCreateInfoEXT.npushConstantRangeCount(address()); }
        /** @return a {@link VkPushConstantRange.Buffer} view of the struct array pointed to by the {@link VkShaderCreateInfoEXT#pPushConstantRanges} field. */
        @Nullable
        @NativeType("VkPushConstantRange const *")
        public VkPushConstantRange.Buffer pPushConstantRanges() { return VkShaderCreateInfoEXT.npPushConstantRanges(address()); }
        /** @return a {@link VkSpecializationInfo} view of the struct pointed to by the {@link VkShaderCreateInfoEXT#pSpecializationInfo} field. */
        @Nullable
        @NativeType("VkSpecializationInfo const *")
        public VkSpecializationInfo pSpecializationInfo() { return VkShaderCreateInfoEXT.npSpecializationInfo(address()); }

        /** Sets the specified value to the {@link VkShaderCreateInfoEXT#sType} field. */
        public VkShaderCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkShaderCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTShaderObject#VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT} value to the {@link VkShaderCreateInfoEXT#sType} field. */
        public VkShaderCreateInfoEXT.Buffer sType$Default() { return sType(EXTShaderObject.VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkShaderCreateInfoEXT#pNext} field. */
        public VkShaderCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkShaderCreateInfoEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} value to the {@code pNext} chain. */
        public VkShaderCreateInfoEXT.Buffer pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} value to the {@code pNext} chain. */
        public VkShaderCreateInfoEXT.Buffer pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkShaderRequiredSubgroupSizeCreateInfoEXT} value to the {@code pNext} chain. */
        public VkShaderCreateInfoEXT.Buffer pNext(VkShaderRequiredSubgroupSizeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkShaderCreateInfoEXT#flags} field. */
        public VkShaderCreateInfoEXT.Buffer flags(@NativeType("VkShaderCreateFlagsEXT") int value) { VkShaderCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkShaderCreateInfoEXT#stage} field. */
        public VkShaderCreateInfoEXT.Buffer stage(@NativeType("VkShaderStageFlagBits") int value) { VkShaderCreateInfoEXT.nstage(address(), value); return this; }
        /** Sets the specified value to the {@link VkShaderCreateInfoEXT#nextStage} field. */
        public VkShaderCreateInfoEXT.Buffer nextStage(@NativeType("VkShaderStageFlags") int value) { VkShaderCreateInfoEXT.nnextStage(address(), value); return this; }
        /** Sets the specified value to the {@link VkShaderCreateInfoEXT#codeType} field. */
        public VkShaderCreateInfoEXT.Buffer codeType(@NativeType("VkShaderCodeTypeEXT") int value) { VkShaderCreateInfoEXT.ncodeType(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link VkShaderCreateInfoEXT#pCode} field. */
        public VkShaderCreateInfoEXT.Buffer pCode(@NativeType("void const *") ByteBuffer value) { VkShaderCreateInfoEXT.npCode(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link VkShaderCreateInfoEXT#pName} field. */
        public VkShaderCreateInfoEXT.Buffer pName(@Nullable @NativeType("char const *") ByteBuffer value) { VkShaderCreateInfoEXT.npName(address(), value); return this; }
        /** Sets the specified value to the {@link VkShaderCreateInfoEXT#setLayoutCount} field. */
        public VkShaderCreateInfoEXT.Buffer setLayoutCount(@NativeType("uint32_t") int value) { VkShaderCreateInfoEXT.nsetLayoutCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkShaderCreateInfoEXT#pSetLayouts} field. */
        public VkShaderCreateInfoEXT.Buffer pSetLayouts(@Nullable @NativeType("VkDescriptorSetLayout const *") LongBuffer value) { VkShaderCreateInfoEXT.npSetLayouts(address(), value); return this; }
        /** Sets the specified value to the {@link VkShaderCreateInfoEXT#pushConstantRangeCount} field. */
        public VkShaderCreateInfoEXT.Buffer pushConstantRangeCount(@NativeType("uint32_t") int value) { VkShaderCreateInfoEXT.npushConstantRangeCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkPushConstantRange.Buffer} to the {@link VkShaderCreateInfoEXT#pPushConstantRanges} field. */
        public VkShaderCreateInfoEXT.Buffer pPushConstantRanges(@Nullable @NativeType("VkPushConstantRange const *") VkPushConstantRange.Buffer value) { VkShaderCreateInfoEXT.npPushConstantRanges(address(), value); return this; }
        /** Sets the address of the specified {@link VkSpecializationInfo} to the {@link VkShaderCreateInfoEXT#pSpecializationInfo} field. */
        public VkShaderCreateInfoEXT.Buffer pSpecializationInfo(@Nullable @NativeType("VkSpecializationInfo const *") VkSpecializationInfo value) { VkShaderCreateInfoEXT.npSpecializationInfo(address(), value); return this; }

    }

}