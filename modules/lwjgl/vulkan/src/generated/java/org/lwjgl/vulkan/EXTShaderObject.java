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
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension introduces a new {@code VkShaderEXT} object type which represents a single compiled shader stage. Shader objects provide a more flexible alternative to {@code VkPipeline} objects, which may be helpful in certain use cases.
 * 
 * <h5>Examples</h5>
 * 
 * <p><b>Example 1</b></p>
 * 
 * <p>Create linked pair of vertex and fragment shaders.</p>
 * 
 * <pre><code>
 * // Logical device created with the shaderObject feature enabled
 * VkDevice device;
 * 
 * // SPIR-V shader code for a vertex shader, along with its size in bytes
 * void* pVertexSpirv;
 * size_t vertexSpirvSize;
 * 
 * // SPIR-V shader code for a fragment shader, along with its size in bytes
 * void* pFragmentSpirv;
 * size_t fragmentSpirvSize;
 * 
 * // Descriptor set layout compatible with the shaders
 * VkDescriptorSetLayout descriptorSetLayout;
 * 
 * VkShaderCreateInfoEXT shaderCreateInfos[2] =
 * {
 *     {
 *         .sType = VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT,
 *         .pNext = NULL,
 *         .flags = VK_SHADER_CREATE_LINK_STAGE_BIT_EXT,
 *         .stage = VK_SHADER_STAGE_VERTEX_BIT,
 *         .nextStage = VK_SHADER_STAGE_FRAGMENT_BIT,
 *         .codeType = VK_SHADER_CODE_TYPE_SPIRV_EXT,
 *         .codeSize = vertexSpirvSize,
 *         .pCode = pVertexSpirv,
 *         .pName = "main",
 *         .setLayoutCount = 1,
 *         .pSetLayouts = &amp;descriptorSetLayout;
 *         .pushConstantRangeCount = 0,
 *         .pPushConstantRanges = NULL,
 *         .pSpecializationInfo = NULL
 *     },
 *     {
 *         .sType = VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT,
 *         .pNext = NULL,
 *         .flags = VK_SHADER_CREATE_LINK_STAGE_BIT_EXT,
 *         .stage = VK_SHADER_STAGE_FRAGMENT_BIT,
 *         .nextStage = 0,
 *         .codeType = VK_SHADER_CODE_TYPE_SPIRV_EXT,
 *         .codeSize = fragmentSpirvSize,
 *         .pCode = pFragmentSpirv,
 *         .pName = "main",
 *         .setLayoutCount = 1,
 *         .pSetLayouts = &amp;descriptorSetLayout;
 *         .pushConstantRangeCount = 0,
 *         .pPushConstantRanges = NULL,
 *         .pSpecializationInfo = NULL
 *     }
 * };
 * 
 * VkResult result;
 * VkShaderEXT shaders[2];
 * 
 * result = vkCreateShadersEXT(device, 2, &amp;shaderCreateInfos, NULL, shaders);
 * if (result != VK_SUCCESS)
 * {
 *     // Handle error
 * }</code></pre>
 * 
 * <p>Later, during command buffer recording, bind the linked shaders and draw.</p>
 * 
 * <pre><code>
 * // Command buffer in the recording state
 * VkCommandBuffer commandBuffer;
 * 
 * // Vertex and fragment shader objects created above
 * VkShaderEXT shaders[2];
 * 
 * // Assume vertex buffers, descriptor sets, etc. have been bound, and existing
 * // state setting commands have been called to set all required state
 * 
 * const VkShaderStageFlagBits stages[2] =
 * {
 *     VK_SHADER_STAGE_VERTEX_BIT,
 *     VK_SHADER_STAGE_FRAGMENT_BIT
 * };
 * 
 * // Bind linked shaders
 * vkCmdBindShadersEXT(commandBuffer, 2, stages, shaders);
 * 
 * // Equivalent to the previous line. Linked shaders can be bound one at a time,
 * // in any order:
 * // vkCmdBindShadersEXT(commandBuffer, 1, &amp;stages[1], &amp;shaders[1]);
 * // vkCmdBindShadersEXT(commandBuffer, 1, &amp;stages[0], &amp;shaders[0]);
 * 
 * // The above is sufficient to draw if the device was created with the
 * // tessellationShader and geometryShader features disabled. Otherwise, since
 * // those stages should not execute, vkCmdBindShadersEXT() must be called at
 * // least once with each of their stages in pStages before drawing:
 * 
 * const VkShaderStageFlagBits unusedStages[3] =
 * {
 *     VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT,
 *     VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT,
 *     VK_SHADER_STAGE_GEOMETRY_BIT
 * };
 * 
 * // NULL pShaders is equivalent to an array of stageCount VK_NULL_HANDLE values,
 * // meaning no shaders are bound to those stages, and that any previously bound
 * // shaders are unbound
 * vkCmdBindShadersEXT(commandBuffer, 3, unusedStages, NULL);
 * 
 * // Graphics shader objects may only be used to draw inside dynamic render pass
 * // instances begun with vkCmdBeginRendering(), assume one has already been begun
 * 
 * // Draw a triangle
 * vkCmdDraw(commandBuffer, 3, 1, 0, 0);</code></pre>
 * 
 * <p><b>Example 2</b></p>
 * 
 * <p>Create unlinked vertex, geometry, and fragment shaders.</p>
 * 
 * <pre><code>
 * // Logical device created with the shaderObject feature enabled
 * VkDevice device;
 * 
 * // SPIR-V shader code for vertex shaders, along with their sizes in bytes
 * void* pVertexSpirv[2];
 * size_t vertexSpirvSize[2];
 * 
 * // SPIR-V shader code for a geometry shader, along with its size in bytes
 * void pGeometrySpirv;
 * size_t geometrySpirvSize;
 * 
 * // SPIR-V shader code for fragment shaders, along with their sizes in bytes
 * void* pFragmentSpirv[2];
 * size_t fragmentSpirvSize[2];
 * 
 * // Descriptor set layout compatible with the shaders
 * VkDescriptorSetLayout descriptorSetLayout;
 * 
 * VkShaderCreateInfoEXT shaderCreateInfos[5] =
 * {
 *     // Stage order does not matter
 *     {
 *         .sType = VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT,
 *         .pNext = NULL,
 *         .flags = 0,
 *         .stage = VK_SHADER_STAGE_GEOMETRY_BIT,
 *         .nextStage = VK_SHADER_STAGE_FRAGMENT_BIT,
 *         .codeType = VK_SHADER_CODE_TYPE_SPIRV_EXT,
 *         .codeSize = pGeometrySpirv,
 *         .pCode = geometrySpirvSize,
 *         .pName = "main",
 *         .setLayoutCount = 1,
 *         .pSetLayouts = &amp;descriptorSetLayout;
 *         .pushConstantRangeCount = 0,
 *         .pPushConstantRanges = NULL,
 *         .pSpecializationInfo = NULL
 *     },
 *     {
 *         .sType = VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT,
 *         .pNext = NULL,
 *         .flags = 0,
 *         .stage = VK_SHADER_STAGE_VERTEX_BIT,
 *         .nextStage = VK_SHADER_STAGE_GEOMETRY_BIT,
 *         .codeType = VK_SHADER_CODE_TYPE_SPIRV_EXT,
 *         .codeSize = vertexSpirvSize[0],
 *         .pCode = pVertexSpirv[0],
 *         .pName = "main",
 *         .setLayoutCount = 1,
 *         .pSetLayouts = &amp;descriptorSetLayout;
 *         .pushConstantRangeCount = 0,
 *         .pPushConstantRanges = NULL,
 *         .pSpecializationInfo = NULL
 *     },
 *     {
 *         .sType = VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT,
 *         .pNext = NULL,
 *         .flags = 0,
 *         .stage = VK_SHADER_STAGE_FRAGMENT_BIT,
 *         .nextStage = 0,
 *         .codeType = VK_SHADER_CODE_TYPE_SPIRV_EXT,
 *         .codeSize = fragmentSpirvSize[0],
 *         .pCode = pFragmentSpirv[0],
 *         .pName = "main",
 *         .setLayoutCount = 1,
 *         .pSetLayouts = &amp;descriptorSetLayout;
 *         .pushConstantRangeCount = 0,
 *         .pPushConstantRanges = NULL,
 *         .pSpecializationInfo = NULL
 *     },
 *     {
 *         .sType = VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT,
 *         .pNext = NULL,
 *         .flags = 0,
 *         .stage = VK_SHADER_STAGE_FRAGMENT_BIT,
 *         .nextStage = 0,
 *         .codeType = VK_SHADER_CODE_TYPE_SPIRV_EXT,
 *         .codeSize = fragmentSpirvSize[1],
 *         .pCode = pFragmentSpirv[1],
 *         .pName = "main",
 *         .setLayoutCount = 1,
 *         .pSetLayouts = &amp;descriptorSetLayout;
 *         .pushConstantRangeCount = 0,
 *         .pPushConstantRanges = NULL,
 *         .pSpecializationInfo = NULL
 *     },
 *     {
 *         .sType = VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT,
 *         .pNext = NULL,
 *         .flags = 0,
 *         .stage = VK_SHADER_STAGE_VERTEX_BIT,
 *         // Suppose we want this vertex shader to be able to be followed by
 *         // either a geometry shader or fragment shader:
 *         .nextStage = VK_SHADER_STAGE_GEOMETRY_BIT | VK_SHADER_STAGE_FRAGMENT_BIT,
 *         .codeType = VK_SHADER_CODE_TYPE_SPIRV_EXT,
 *         .codeSize = vertexSpirvSize[1],
 *         .pCode = pVertexSpirv[1],
 *         .pName = "main",
 *         .setLayoutCount = 1,
 *         .pSetLayouts = &amp;descriptorSetLayout;
 *         .pushConstantRangeCount = 0,
 *         .pPushConstantRanges = NULL,
 *         .pSpecializationInfo = NULL
 *     }
 * };
 * 
 * VkResult result;
 * VkShaderEXT shaders[5];
 * 
 * result = vkCreateShadersEXT(device, 5, &amp;shaderCreateInfos, NULL, shaders);
 * if (result != VK_SUCCESS)
 * {
 *     // Handle error
 * }</code></pre>
 * 
 * <p>Later, during command buffer recording, bind the linked shaders in different combinations and draw.</p>
 * 
 * <pre><code>
 * // Command buffer in the recording state
 * VkCommandBuffer commandBuffer;
 * 
 * // Vertex, geometry, and fragment shader objects created above
 * VkShaderEXT shaders[5];
 * 
 * // Assume vertex buffers, descriptor sets, etc. have been bound, and existing
 * // state setting commands have been called to set all required state
 * 
 * const VkShaderStageFlagBits stages[3] =
 * {
 *     // Any order is allowed
 *     VK_SHADER_STAGE_FRAGMENT_BIT,
 *     VK_SHADER_STAGE_VERTEX_BIT,
 *     VK_SHADER_STAGE_GEOMETRY_BIT,
 * };
 * 
 * VkShaderEXT bindShaders[3] =
 * {
 *     shaders[2], // FS
 *     shaders[1], // VS
 *     shaders[0]  // GS
 * };
 * 
 * // Bind unlinked shaders
 * vkCmdBindShadersEXT(commandBuffer, 3, stages, bindShaders);
 * 
 * // Assume the tessellationShader feature is disabled, so vkCmdBindShadersEXT()
 * // need not have been called with either tessellation stage
 * 
 * // Graphics shader objects may only be used to draw inside dynamic render pass
 * // instances begun with vkCmdBeginRendering(), assume one has already been begun
 * 
 * // Draw a triangle
 * vkCmdDraw(commandBuffer, 3, 1, 0, 0);
 * 
 * // Bind a different unlinked fragment shader
 * const VkShaderStageFlagBits fragmentStage = VK_SHADER_STAGE_FRAGMENT_BIT;
 * vkCmdBindShadersEXT(commandBuffer, 1, &amp;fragmentStage, &amp;shaders[3]);
 * 
 * // Draw another triangle
 * vkCmdDraw(commandBuffer, 3, 1, 0, 0);
 * 
 * // Bind a different unlinked vertex shader
 * const VkShaderStageFlagBits vertexStage = VK_SHADER_STAGE_VERTEX_BIT;
 * vkCmdBindShadersEXT(commandBuffer, 1, &amp;vertexStage, &amp;shaders[4]);
 * 
 * // Draw another triangle
 * vkCmdDraw(commandBuffer, 3, 1, 0, 0);</code></pre>
 * 
 * <h5>VK_EXT_shader_object</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_shader_object}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>483</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}      or      <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.1">Version 1.1</a> and      {@link KHRDynamicRendering VK_KHR_dynamic_rendering}      or      <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.3">Version 1.3</a></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Daniel Story <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_shader_object]%20@daniel-story%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_shader_object%20extension*">daniel-story</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_shader_object.adoc">VK_EXT_shader_object</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-03-30</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Interacts with {@link EXTExtendedDynamicState VK_EXT_extended_dynamic_state}</li>
 * <li>Interacts with {@link EXTExtendedDynamicState2 VK_EXT_extended_dynamic_state2}</li>
 * <li>Interacts with {@link EXTExtendedDynamicState3 VK_EXT_extended_dynamic_state3}</li>
 * <li>Interacts with {@link EXTVertexInputDynamicState VK_EXT_vertex_input_dynamic_state}</li>
 * </ul></dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Sandy Jamieson, Nintendo</li>
 * <li>Žiga Markuš, LunarG</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Alex Walters, Imagination</li>
 * <li>Shahbaz Youssefi, Google</li>
 * <li>Ralph Potter, Samsung</li>
 * <li>Jan-Harald Fredriksen, ARM</li>
 * <li>Connor Abott, Valve</li>
 * <li>Arseny Kapoulkine, Roblox</li>
 * <li>Patrick Doane, Activision</li>
 * <li>Jeff Leger, Qualcomm</li>
 * <li>Stu Smith, AMD</li>
 * <li>Chris Glover, Google</li>
 * <li>Ricardo Garcia, Igalia</li>
 * <li>Faith Ekstrand, Collabora</li>
 * <li>Timur Kristóf, Valve</li>
 * <li>Constantine Shablya, Collabora</li>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Alyssa Rosenzweig, Collabora</li>
 * <li>Mike Blumenkrantz, Valve</li>
 * <li>Samuel Pitoiset, Valve</li>
 * <li>Qun Lin, AMD</li>
 * <li>Spencer Fricke, LunarG</li>
 * <li>Soroush Faghihi Kashani, Imagination</li>
 * </ul></dd>
 * </dl>
 */
public class EXTShaderObject {

    /** The extension specification version. */
    public static final int VK_EXT_SHADER_OBJECT_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_SHADER_OBJECT_EXTENSION_NAME = "VK_EXT_shader_object";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SHADER_REQUIRED_SUBGROUP_SIZE_CREATE_INFO_EXT STRUCTURE_TYPE_SHADER_REQUIRED_SUBGROUP_SIZE_CREATE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_FEATURES_EXT    = 1000482000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT  = 1000482001,
        VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT                        = 1000482002,
        VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT        = 1000352001,
        VK_STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT      = 1000352002,
        VK_STRUCTURE_TYPE_SHADER_REQUIRED_SUBGROUP_SIZE_CREATE_INFO_EXT = 1000225001;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_SHADER_EXT = 1000482000;

    /** Extends {@code VkResult}. */
    public static final int VK_ERROR_INCOMPATIBLE_SHADER_BINARY_EXT = 1000482000;

    /**
     * Extends {@code VkShaderCreateFlagBitsEXT}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_SHADER_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT SHADER_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT}</li>
     * <li>{@link #VK_SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        VK_SHADER_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT = 0x2,
        VK_SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT      = 0x4;

    /** Extends {@code VkShaderCreateFlagBitsEXT}. */
    public static final int VK_SHADER_CREATE_NO_TASK_SHADER_BIT_EXT = 0x8;

    /** Extends {@code VkShaderCreateFlagBitsEXT}. */
    public static final int VK_SHADER_CREATE_DISPATCH_BASE_BIT_EXT = 0x10;

    /** Extends {@code VkShaderCreateFlagBitsEXT}. */
    public static final int VK_SHADER_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_EXT = 0x20;

    /** Extends {@code VkShaderCreateFlagBitsEXT}. */
    public static final int VK_SHADER_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT = 0x40;

    /**
     * VkShaderCreateFlagBitsEXT - Bitmask controlling how a shader object is created
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT} specifies that a shader is linked to all other shaders created in the same {@link #vkCreateShadersEXT CreateShadersEXT} call whose {@link VkShaderCreateInfoEXT} structures' {@code flags} include {@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT}.</li>
     * <li>{@link #VK_SHADER_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT SHADER_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT} specifies that the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces-builtin-variables-sgs">{@code SubgroupSize}</a> <b>may</b> vary in a task, mesh, or compute shader.</li>
     * <li>{@link #VK_SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT} specifies that the subgroup sizes <b>must</b> be launched with all invocations active in a task, mesh, or compute shader.</li>
     * <li>{@link #VK_SHADER_CREATE_NO_TASK_SHADER_BIT_EXT SHADER_CREATE_NO_TASK_SHADER_BIT_EXT} specifies that a mesh shader <b>must</b> only be used without a task shader. Otherwise, the mesh shader <b>must</b> only be used with a task shader.</li>
     * <li>{@link #VK_SHADER_CREATE_DISPATCH_BASE_BIT_EXT SHADER_CREATE_DISPATCH_BASE_BIT_EXT} specifies that a compute shader <b>can</b> be used with {@link VK11#vkCmdDispatchBase CmdDispatchBase} with a non-zero base workgroup.</li>
     * <li>{@link #VK_SHADER_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_EXT SHADER_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_EXT} specifies that a fragment shader <b>can</b> be used with a fragment shading rate attachment.</li>
     * <li>{@link #VK_SHADER_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT SHADER_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT} specifies that a fragment shader <b>can</b> be used with a fragment density map attachment.</li>
     * </ul>
     */
    public static final int VK_SHADER_CREATE_LINK_STAGE_BIT_EXT = 0x1;

    /**
     * VkShaderCodeTypeEXT - Indicate a shader code type
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_SHADER_CODE_TYPE_BINARY_EXT SHADER_CODE_TYPE_BINARY_EXT} specifies shader code in an opaque, implementation-defined binary format specific to the physical device.</li>
     * <li>{@link #VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT} specifies shader code in SPIR-V format.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkShaderCreateInfoEXT}</p>
     */
    public static final int
        VK_SHADER_CODE_TYPE_BINARY_EXT = 0,
        VK_SHADER_CODE_TYPE_SPIRV_EXT  = 1;

    protected EXTShaderObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateShadersEXT ] ---

    /**
     * Unsafe version of: {@link #vkCreateShadersEXT CreateShadersEXT}
     *
     * @param createInfoCount the length of the {@code pCreateInfos} and {@code pShaders} arrays.
     */
    public static int nvkCreateShadersEXT(VkDevice device, int createInfoCount, long pCreateInfos, long pAllocator, long pShaders) {
        long __functionAddress = device.getCapabilities().vkCreateShadersEXT;
        if (CHECKS) {
            check(__functionAddress);
            Struct.validate(pCreateInfos, createInfoCount, VkShaderCreateInfoEXT.SIZEOF, VkShaderCreateInfoEXT::validate);
        }
        return callPPPPI(device.address(), createInfoCount, pCreateInfos, pAllocator, pShaders, __functionAddress);
    }

    /**
     * Create one or more new shaders.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create one or more shader objects, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateShadersEXT(
     *     VkDevice                                    device,
     *     uint32_t                                    createInfoCount,
     *     const VkShaderCreateInfoEXT*                pCreateInfos,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkShaderEXT*                                pShaders);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When this function returns, whether or not it succeeds, it is guaranteed that every element of {@code pShaders} will have been overwritten by either {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a valid {@code VkShaderEXT} handle.</p>
     * 
     * <p>This means that whenever shader creation fails, the application <b>can</b> determine which shader the returned error pertains to by locating the first {@link VK10#VK_NULL_HANDLE NULL_HANDLE} element in {@code pShaders}. It also means that an application <b>can</b> reliably clean up from a failed call by iterating over the {@code pShaders} array and destroying every element that is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature <b>must</b> be enabled</li>
     * <li>If {@code createInfoCount} is 1, there <b>must</b> be no element of {@code pCreateInfos} whose {@code flags} member includes {@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT}</li>
     * <li>If the {@code flags} member of any element of {@code pCreateInfos} includes {@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT}, the {@code flags} member of all other elements of {@code pCreateInfos} whose {@code stage} is {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}, {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT}, {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}, or {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} <b>must</b> also include {@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT}</li>
     * <li>If the {@code flags} member of any element of {@code pCreateInfos} includes {@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT}, the {@code flags} member of all other elements of {@code pCreateInfos} whose {@code stage} is {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT} or {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} <b>must</b> also include {@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT}</li>
     * <li>If the {@code flags} member of any element of {@code pCreateInfos} whose {@code stage} is {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT} or {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} includes {@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT}, there <b>must</b> be no member of {@code pCreateInfos} whose {@code stage} is {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} and whose {@code flags} member includes {@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT}</li>
     * <li>If there is any element of {@code pCreateInfos} whose {@code stage} is {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} and whose {@code flags} member includes both {@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT} and {@link #VK_SHADER_CREATE_NO_TASK_SHADER_BIT_EXT SHADER_CREATE_NO_TASK_SHADER_BIT_EXT}, there <b>must</b> be no element of {@code pCreateInfos} whose {@code stage} is {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT} and whose {@code flags} member includes {@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT}</li>
     * <li>For each element of {@code pCreateInfos} whose {@code flags} member includes {@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT}, if there is any other element of {@code pCreateInfos} whose {@code stage} is logically later than the {@code stage} of the former and whose {@code flags} member also includes {@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT}, the {@code nextStage} of the former <b>must</b> be equal to the {@code stage} of the element with the logically earliest {@code stage} following the {@code stage} of the former whose {@code flags} member also includes {@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT}</li>
     * <li>The {@code stage} member of each element of {@code pCreateInfos} whose {@code flags} member includes {@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT} <b>must</b> be unique</li>
     * <li>The {@code codeType} member of all elements of {@code pCreateInfos} whose {@code flags} member includes {@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT} <b>must</b> be the same</li>
     * <li>If {@code pCreateInfos} contains elements with both {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT} and {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, both elements' {@code flags} include {@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT}, both elements' {@code codeType} is {@link #VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and the {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT} stage’s {@code pCode} contains an {@code OpExecutionMode} instruction specifying the type of subdivision, it <b>must</b> match the subdivision type specified in the {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT} stage</li>
     * <li>If {@code pCreateInfos} contains elements with both {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT} and {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, both elements' {@code flags} include {@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT}, both elements' {@code codeType} is {@link #VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and the {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT} stage’s {@code pCode} contains an {@code OpExecutionMode} instruction specifying the orientation of triangles, it <b>must</b> match the triangle orientation specified in the {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT} stage</li>
     * <li>If {@code pCreateInfos} contains elements with both {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT} and {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, both elements' {@code flags} include {@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT}, both elements' {@code codeType} is {@link #VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and the {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT} stage’s {@code pCode} contains an {@code OpExecutionMode} instruction specifying {@code PointMode}, the {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT} stage <b>must</b> also contain an {@code OpExecutionMode} instruction specifying {@code PointMode}</li>
     * <li>If {@code pCreateInfos} contains elements with both {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT} and {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, both elements' {@code flags} include {@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT}, both elements' {@code codeType} is {@link #VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and the {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT} stage’s {@code pCode} contains an {@code OpExecutionMode} instruction specifying the spacing of segments on the edges of tessellated primitives, it <b>must</b> match the segment spacing specified in the {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT} stage</li>
     * <li>If {@code pCreateInfos} contains elements with both {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT} and {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, both elements' {@code flags} include {@link #VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT}, both elements' {@code codeType} is {@link #VK_SHADER_CODE_TYPE_SPIRV_EXT SHADER_CODE_TYPE_SPIRV_EXT}, and the {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT} stage’s {@code pCode} contains an {@code OpExecutionMode} instruction specifying the output patch size, it <b>must</b> match the output patch size specified in the {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT} stage</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfos} <b>must</b> be a valid pointer to an array of {@code createInfoCount} valid {@link VkShaderCreateInfoEXT} structures</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pShaders} <b>must</b> be a valid pointer to an array of {@code createInfoCount} {@code VkShaderEXT} handles</li>
     * <li>{@code createInfoCount} <b>must</b> be greater than 0</li>
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
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link #VK_ERROR_INCOMPATIBLE_SHADER_BINARY_EXT ERROR_INCOMPATIBLE_SHADER_BINARY_EXT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkShaderCreateInfoEXT}</p>
     *
     * @param device       the logical device that creates the shader objects.
     * @param pCreateInfos a pointer to an array of {@link VkShaderCreateInfoEXT} structures.
     * @param pAllocator   controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pShaders     a pointer to an array of {@code VkShaderEXT} handles in which the resulting shader objects are returned.
     */
    @NativeType("VkResult")
    public static int vkCreateShadersEXT(VkDevice device, @NativeType("VkShaderCreateInfoEXT const *") VkShaderCreateInfoEXT.Buffer pCreateInfos, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkShaderEXT *") LongBuffer pShaders) {
        if (CHECKS) {
            check(pShaders, pCreateInfos.remaining());
        }
        return nvkCreateShadersEXT(device, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), memAddress(pShaders));
    }

    // --- [ vkDestroyShaderEXT ] ---

    /** Unsafe version of: {@link #vkDestroyShaderEXT DestroyShaderEXT} */
    public static void nvkDestroyShaderEXT(VkDevice device, long shader, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyShaderEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), shader, pAllocator, __functionAddress);
    }

    /**
     * Destroy a shader object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy a shader object, call:</p>
     * 
     * <pre><code>
     * void vkDestroyShaderEXT(
     *     VkDevice                                    device,
     *     VkShaderEXT                                 shader,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Destroying a shader object used by one or more command buffers in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording or executable state</a> causes those command buffers to move into the <em>invalid state</em>.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature <b>must</b> be enabled</li>
     * <li>All submitted commands that refer to {@code shader} <b>must</b> have completed execution</li>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code shader} was created, a compatible set of callbacks <b>must</b> be provided here</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code shader} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code shader} <b>must</b> be a valid {@code VkShaderEXT} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code shader} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code shader} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device     the logical device that destroys the shader object.
     * @param shader     the handle of the shader object to destroy.
     * @param pAllocator controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyShaderEXT(VkDevice device, @NativeType("VkShaderEXT") long shader, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyShaderEXT(device, shader, memAddressSafe(pAllocator));
    }

    // --- [ vkGetShaderBinaryDataEXT ] ---

    /**
     * Unsafe version of: {@link #vkGetShaderBinaryDataEXT GetShaderBinaryDataEXT}
     *
     * @param pDataSize a pointer to a {@code size_t} value related to the size of the binary shader code, as described below.
     */
    public static int nvkGetShaderBinaryDataEXT(VkDevice device, long shader, long pDataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetShaderBinaryDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), shader, pDataSize, pData, __functionAddress);
    }

    /**
     * Get the binary shader code from a shader object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Binary shader code <b>can</b> be retrieved from a shader object using the command:</p>
     * 
     * <pre><code>
     * VkResult vkGetShaderBinaryDataEXT(
     *     VkDevice                                    device,
     *     VkShaderEXT                                 shader,
     *     size_t*                                     pDataSize,
     *     void*                                       pData);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pData} is {@code NULL}, then the size of the binary shader code of the shader object, in bytes, is returned in {@code pDataSize}. Otherwise, {@code pDataSize} <b>must</b> point to a variable set by the user to the size of the buffer, in bytes, pointed to by {@code pData}, and on return the variable is overwritten with the amount of data actually written to {@code pData}. If {@code pDataSize} is less than the size of the binary shader code, nothing is written to {@code pData}, and {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The behavior of this command when {@code pDataSize} is too small differs from how some other getter-type commands work in Vulkan. Because shader binary data is only usable in its entirety, it would never be useful for the implementation to return partial data. Because of this, nothing is written to {@code pData} unless {@code pDataSize} is large enough to fit the data it its entirety.</p>
     * </div>
     * 
     * <p>Binary shader code retrieved using {@code vkGetShaderBinaryDataEXT} <b>can</b> be passed to a subsequent call to {@link #vkCreateShadersEXT CreateShadersEXT} on a compatible physical device by specifying {@link #VK_SHADER_CODE_TYPE_BINARY_EXT SHADER_CODE_TYPE_BINARY_EXT} in the {@code codeType} member of {@link VkShaderCreateInfoEXT}.</p>
     * 
     * <p>The shader code returned by repeated calls to this function with the same {@code VkShaderEXT} is guaranteed to be invariant for the lifetime of the {@code VkShaderEXT} object.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature <b>must</b> be enabled</li>
     * <li>If {@code pData} is not {@code NULL}, it <b>must</b> be aligned to 16 bytes</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code shader} <b>must</b> be a valid {@code VkShaderEXT} handle</li>
     * <li>{@code pDataSize} <b>must</b> be a valid pointer to a {@code size_t} value</li>
     * <li>If the value referenced by {@code pDataSize} is not 0, and {@code pData} is not {@code NULL}, {@code pData} <b>must</b> be a valid pointer to an array of {@code pDataSize} bytes</li>
     * <li>{@code shader} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_INCOMPLETE INCOMPLETE}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device    the logical device that shader object was created from.
     * @param shader    the shader object to retrieve binary shader code from.
     * @param pDataSize a pointer to a {@code size_t} value related to the size of the binary shader code, as described below.
     * @param pData     either {@code NULL} or a pointer to a buffer.
     */
    @NativeType("VkResult")
    public static int vkGetShaderBinaryDataEXT(VkDevice device, @NativeType("VkShaderEXT") long shader, @NativeType("size_t *") PointerBuffer pDataSize, @Nullable @NativeType("void *") ByteBuffer pData) {
        if (CHECKS) {
            check(pDataSize, 1);
            checkSafe(pData, pDataSize.get(pDataSize.position()));
        }
        return nvkGetShaderBinaryDataEXT(device, shader, memAddress(pDataSize), memAddressSafe(pData));
    }

    // --- [ vkCmdBindShadersEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdBindShadersEXT CmdBindShadersEXT}
     *
     * @param stageCount the length of the {@code pStages} and {@code pShaders} arrays.
     */
    public static void nvkCmdBindShadersEXT(VkCommandBuffer commandBuffer, int stageCount, long pStages, long pShaders) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindShadersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), stageCount, pStages, pShaders, __functionAddress);
    }

    /**
     * Bind shader objects to a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Once shader objects have been created, they <b>can</b> be bound to the command buffer using the command:</p>
     * 
     * <pre><code>
     * void vkCmdBindShadersEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    stageCount,
     *     const VkShaderStageFlagBits*                pStages,
     *     const VkShaderEXT*                          pShaders);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When binding linked shaders, an application <b>may</b> bind them in any combination of one or more calls to {@code vkCmdBindShadersEXT} (i.e., shaders that were created linked together do not need to be bound in the same {@code vkCmdBindShadersEXT} call).</p>
     * 
     * <p>Any shader object bound to a particular stage <b>may</b> be unbound by setting its value in {@code pShaders} to {@link VK10#VK_NULL_HANDLE NULL_HANDLE}. If {@code pShaders} is {@code NULL}, {@code vkCmdBindShadersEXT} behaves as if {@code pShaders} was an array of {@code stageCount} {@link VK10#VK_NULL_HANDLE NULL_HANDLE} values (i.e., any shaders bound to the stages specified in {@code pStages} are unbound).</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature <b>must</b> be enabled</li>
     * <li>Every element of {@code pStages} <b>must</b> be unique</li>
     * <li>{@code pStages} <b>must</b> not contain {@link VK10#VK_SHADER_STAGE_ALL_GRAPHICS SHADER_STAGE_ALL_GRAPHICS} or {@link VK10#VK_SHADER_STAGE_ALL SHADER_STAGE_ALL}</li>
     * <li>{@code pStages} <b>must</b> not contain {@link KHRRayTracingPipeline#VK_SHADER_STAGE_RAYGEN_BIT_KHR SHADER_STAGE_RAYGEN_BIT_KHR}, {@link KHRRayTracingPipeline#VK_SHADER_STAGE_ANY_HIT_BIT_KHR SHADER_STAGE_ANY_HIT_BIT_KHR}, {@link KHRRayTracingPipeline#VK_SHADER_STAGE_CLOSEST_HIT_BIT_KHR SHADER_STAGE_CLOSEST_HIT_BIT_KHR}, {@link KHRRayTracingPipeline#VK_SHADER_STAGE_MISS_BIT_KHR SHADER_STAGE_MISS_BIT_KHR}, {@link KHRRayTracingPipeline#VK_SHADER_STAGE_INTERSECTION_BIT_KHR SHADER_STAGE_INTERSECTION_BIT_KHR}, or {@link KHRRayTracingPipeline#VK_SHADER_STAGE_CALLABLE_BIT_KHR SHADER_STAGE_CALLABLE_BIT_KHR}</li>
     * <li>{@code pStages} <b>must</b> not contain {@link HUAWEISubpassShading#VK_SHADER_STAGE_SUBPASS_SHADING_BIT_HUAWEI SHADER_STAGE_SUBPASS_SHADING_BIT_HUAWEI}</li>
     * <li>{@code pStages} <b>must</b> not contain {@link HUAWEIClusterCullingShader#VK_SHADER_STAGE_CLUSTER_CULLING_BIT_HUAWEI SHADER_STAGE_CLUSTER_CULLING_BIT_HUAWEI}</li>
     * <li>For each element of {@code pStages}, if {@code pShaders} is not {@code NULL}, and the element of the {@code pShaders} array with the same index is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> have been created with a {@code stage} equal to the corresponding element of {@code pStages}</li>
     * <li>If {@code pStages} contains both {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT} and {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}, and {@code pShaders} is not {@code NULL}, and the same index in {@code pShaders} as {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT} in {@code pStages} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the same index in {@code pShaders} as {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} in {@code pStages} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>If {@code pStages} contains both {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} and {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}, and {@code pShaders} is not {@code NULL}, and the same index in {@code pShaders} as {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} in {@code pStages} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the same index in {@code pShaders} as {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} in {@code pStages} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-tessellationShader">{@code tessellationShader}</a> feature is not enabled, and {@code pStages} contains {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT} or {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, and {@code pShaders} is not {@code NULL}, the same index or indices in {@code pShaders} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-geometryShader">{@code geometryShader}</a> feature is not enabled, and {@code pStages} contains {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}, and {@code pShaders} is not {@code NULL}, the same index in {@code pShaders} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-taskShader">{@code taskShader}</a> feature is not enabled, and {@code pStages} contains {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT}, and {@code pShaders} is not {@code NULL}, the same index in {@code pShaders} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-meshShader">{@code meshShader}</a> feature is not enabled, and {@code pStages} contains {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT}, and {@code pShaders} is not {@code NULL}, the same index in {@code pShaders} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>If {@code pStages} contains {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT}, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>If {@code pStages} contains {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}, {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT}, {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}, or {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>If {@code pStages} contains {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} or {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT}, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pStages} <b>must</b> be a valid pointer to an array of {@code stageCount} valid {@code VkShaderStageFlagBits} values</li>
     * <li>If {@code pShaders} is not {@code NULL}, {@code pShaders} <b>must</b> be a valid pointer to an array of {@code stageCount} valid or {@link VK10#VK_NULL_HANDLE NULL_HANDLE} {@code VkShaderEXT} handles</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code stageCount} <b>must</b> be greater than 0</li>
     * <li>Both of {@code commandBuffer}, and the elements of {@code pShaders} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer that the shader object will be bound to.
     * @param pStages       a pointer to an array of {@code VkShaderStageFlagBits} values specifying one stage per array index that is affected by the corresponding value in the {@code pShaders} array.
     * @param pShaders      a pointer to an array of {@code VkShaderEXT} handles and/or {@link VK10#VK_NULL_HANDLE NULL_HANDLE} values describing the shader binding operations to be performed on each stage in {@code pStages}.
     */
    public static void vkCmdBindShadersEXT(VkCommandBuffer commandBuffer, @NativeType("VkShaderStageFlagBits const *") IntBuffer pStages, @NativeType("VkShaderEXT const *") LongBuffer pShaders) {
        if (CHECKS) {
            check(pShaders, pStages.remaining());
        }
        nvkCmdBindShadersEXT(commandBuffer, pStages.remaining(), memAddress(pStages), memAddress(pShaders));
    }

    // --- [ vkCmdSetCullModeEXT ] ---

    /**
     * See {@link VK13#vkCmdSetCullMode CmdSetCullMode}.
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param cullMode      specifies the cull mode property to use for drawing.
     */
    public static void vkCmdSetCullModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkCullModeFlags") int cullMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCullModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), cullMode, __functionAddress);
    }

    // --- [ vkCmdSetFrontFaceEXT ] ---

    /**
     * See {@link VK13#vkCmdSetFrontFace CmdSetFrontFace}.
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param frontFace     a {@code VkFrontFace} value specifying the front-facing triangle orientation to be used for culling.
     */
    public static void vkCmdSetFrontFaceEXT(VkCommandBuffer commandBuffer, @NativeType("VkFrontFace") int frontFace) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetFrontFaceEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), frontFace, __functionAddress);
    }

    // --- [ vkCmdSetPrimitiveTopologyEXT ] ---

    /**
     * See {@link VK13#vkCmdSetPrimitiveTopology CmdSetPrimitiveTopology}.
     *
     * @param commandBuffer     the command buffer into which the command will be recorded.
     * @param primitiveTopology specifies the primitive topology to use for drawing.
     */
    public static void vkCmdSetPrimitiveTopologyEXT(VkCommandBuffer commandBuffer, @NativeType("VkPrimitiveTopology") int primitiveTopology) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPrimitiveTopologyEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), primitiveTopology, __functionAddress);
    }

    // --- [ vkCmdSetViewportWithCountEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetViewportWithCountEXT CmdSetViewportWithCountEXT}
     *
     * @param viewportCount specifies the viewport count.
     */
    public static void nvkCmdSetViewportWithCountEXT(VkCommandBuffer commandBuffer, int viewportCount, long pViewports) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportWithCountEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), viewportCount, pViewports, __functionAddress);
    }

    /**
     * See {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}.
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pViewports    specifies the viewports to use for drawing.
     */
    public static void vkCmdSetViewportWithCountEXT(VkCommandBuffer commandBuffer, @NativeType("VkViewport const *") VkViewport.Buffer pViewports) {
        nvkCmdSetViewportWithCountEXT(commandBuffer, pViewports.remaining(), pViewports.address());
    }

    // --- [ vkCmdSetScissorWithCountEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetScissorWithCountEXT CmdSetScissorWithCountEXT}
     *
     * @param scissorCount specifies the scissor count.
     */
    public static void nvkCmdSetScissorWithCountEXT(VkCommandBuffer commandBuffer, int scissorCount, long pScissors) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetScissorWithCountEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), scissorCount, pScissors, __functionAddress);
    }

    /**
     * See {@link VK13#vkCmdSetScissorWithCount CmdSetScissorWithCount}.
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pScissors     specifies the scissors to use for drawing.
     */
    public static void vkCmdSetScissorWithCountEXT(VkCommandBuffer commandBuffer, @NativeType("VkRect2D const *") VkRect2D.Buffer pScissors) {
        nvkCmdSetScissorWithCountEXT(commandBuffer, pScissors.remaining(), pScissors.address());
    }

    // --- [ vkCmdBindVertexBuffers2EXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdBindVertexBuffers2EXT CmdBindVertexBuffers2EXT}
     *
     * @param bindingCount the number of vertex input bindings whose state is updated by the command.
     */
    public static void nvkCmdBindVertexBuffers2EXT(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, long pBuffers, long pOffsets, long pSizes, long pStrides) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPPV(commandBuffer.address(), firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides, __functionAddress);
    }

    /**
     * See {@link VK13#vkCmdBindVertexBuffers2 CmdBindVertexBuffers2}.
     *
     * @param commandBuffer the command buffer into which the command is recorded.
     * @param firstBinding  the index of the first vertex input binding whose state is updated by the command.
     * @param pBuffers      a pointer to an array of buffer handles.
     * @param pOffsets      a pointer to an array of buffer offsets.
     * @param pSizes        {@code NULL} or a pointer to an array of the size in bytes of vertex data bound from {@code pBuffers}.
     * @param pStrides      {@code NULL} or a pointer to an array of buffer strides.
     */
    public static void vkCmdBindVertexBuffers2EXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") LongBuffer pBuffers, @NativeType("VkDeviceSize const *") LongBuffer pOffsets, @Nullable @NativeType("VkDeviceSize const *") LongBuffer pSizes, @Nullable @NativeType("VkDeviceSize const *") LongBuffer pStrides) {
        if (CHECKS) {
            check(pOffsets, pBuffers.remaining());
            checkSafe(pSizes, pBuffers.remaining());
            checkSafe(pStrides, pBuffers.remaining());
        }
        nvkCmdBindVertexBuffers2EXT(commandBuffer, firstBinding, pBuffers.remaining(), memAddress(pBuffers), memAddress(pOffsets), memAddressSafe(pSizes), memAddressSafe(pStrides));
    }

    // --- [ vkCmdSetDepthTestEnableEXT ] ---

    /**
     * See {@link VK13#vkCmdSetDepthTestEnable CmdSetDepthTestEnable}.
     *
     * @param commandBuffer   the command buffer into which the command will be recorded.
     * @param depthTestEnable specifies if the depth test is enabled.
     */
    public static void vkCmdSetDepthTestEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthTestEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthWriteEnableEXT ] ---

    /**
     * See {@link VK13#vkCmdSetDepthWriteEnable CmdSetDepthWriteEnable}.
     *
     * @param commandBuffer    the command buffer into which the command will be recorded.
     * @param depthWriteEnable specifies if depth writes are enabled.
     */
    public static void vkCmdSetDepthWriteEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthWriteEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthWriteEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthWriteEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthCompareOpEXT ] ---

    /**
     * See {@link VK13#vkCmdSetDepthCompareOp CmdSetDepthCompareOp}.
     *
     * @param commandBuffer  the command buffer into which the command will be recorded.
     * @param depthCompareOp a {@code VkCompareOp} value specifying the comparison operator used for the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-depth-comparison">Depth Comparison</a> step of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-depth">depth test</a>.
     */
    public static void vkCmdSetDepthCompareOpEXT(VkCommandBuffer commandBuffer, @NativeType("VkCompareOp") int depthCompareOp) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthCompareOpEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthCompareOp, __functionAddress);
    }

    // --- [ vkCmdSetDepthBoundsTestEnableEXT ] ---

    /**
     * See {@link VK13#vkCmdSetDepthBoundsTestEnable CmdSetDepthBoundsTestEnable}.
     *
     * @param commandBuffer         the command buffer into which the command will be recorded.
     * @param depthBoundsTestEnable specifies if the depth bounds test is enabled.
     */
    public static void vkCmdSetDepthBoundsTestEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthBoundsTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBoundsTestEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthBoundsTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetStencilTestEnableEXT ] ---

    /**
     * See {@link VK13#vkCmdSetStencilTestEnable CmdSetStencilTestEnable}.
     *
     * @param commandBuffer     the command buffer into which the command will be recorded.
     * @param stencilTestEnable specifies if the stencil test is enabled.
     */
    public static void vkCmdSetStencilTestEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean stencilTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilTestEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), stencilTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetStencilOpEXT ] ---

    /**
     * See {@link VK13#vkCmdSetStencilOp CmdSetStencilOp}.
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param faceMask      a bitmask of {@code VkStencilFaceFlagBits} specifying the set of stencil state for which to update the stencil operation.
     * @param failOp        a {@code VkStencilOp} value specifying the action performed on samples that fail the stencil test.
     * @param passOp        a {@code VkStencilOp} value specifying the action performed on samples that pass both the depth and stencil tests.
     * @param depthFailOp   a {@code VkStencilOp} value specifying the action performed on samples that pass the stencil test and fail the depth test.
     * @param compareOp     a {@code VkCompareOp} value specifying the comparison operator used in the stencil test.
     */
    public static void vkCmdSetStencilOpEXT(VkCommandBuffer commandBuffer, @NativeType("VkStencilFaceFlags") int faceMask, @NativeType("VkStencilOp") int failOp, @NativeType("VkStencilOp") int passOp, @NativeType("VkStencilOp") int depthFailOp, @NativeType("VkCompareOp") int compareOp) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilOpEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), faceMask, failOp, passOp, depthFailOp, compareOp, __functionAddress);
    }

    // --- [ vkCmdSetVertexInputEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetVertexInputEXT CmdSetVertexInputEXT}
     *
     * @param vertexBindingDescriptionCount   the number of vertex binding descriptions provided in {@code pVertexBindingDescriptions}.
     * @param vertexAttributeDescriptionCount the number of vertex attribute descriptions provided in {@code pVertexAttributeDescriptions}.
     */
    public static void nvkCmdSetVertexInputEXT(VkCommandBuffer commandBuffer, int vertexBindingDescriptionCount, long pVertexBindingDescriptions, int vertexAttributeDescriptionCount, long pVertexAttributeDescriptions) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetVertexInputEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), vertexBindingDescriptionCount, pVertexBindingDescriptions, vertexAttributeDescriptionCount, pVertexAttributeDescriptions, __functionAddress);
    }

    /**
     * Set the vertex input state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the vertex input attribute and vertex input binding descriptions, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetVertexInputEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    vertexBindingDescriptionCount,
     *     const VkVertexInputBindingDescription2EXT*  pVertexBindingDescriptions,
     *     uint32_t                                    vertexAttributeDescriptionCount,
     *     const VkVertexInputAttributeDescription2EXT* pVertexAttributeDescriptions);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the vertex input attribute and vertex input binding descriptions state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkGraphicsPipelineCreateInfo}{@code ::pVertexInputState} values used to create the currently active pipeline.</p>
     * 
     * <p>If drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or if the bound pipeline state object was also created with the {@link VK13#VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE} dynamic state enabled, then {@link VK13#vkCmdBindVertexBuffers2 CmdBindVertexBuffers2} can be used instead of {@code vkCmdSetVertexInputEXT} to dynamically set the stride.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-vertexInputDynamicState">{@code vertexInputDynamicState}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>{@code vertexBindingDescriptionCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindings}</li>
     * <li>{@code vertexAttributeDescriptionCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputAttributes}</li>
     * <li>For every {@code binding} specified by each element of {@code pVertexAttributeDescriptions}, a {@link VkVertexInputBindingDescription2EXT} <b>must</b> exist in {@code pVertexBindingDescriptions} with the same value of {@code binding}</li>
     * <li>All elements of {@code pVertexBindingDescriptions} <b>must</b> describe distinct binding numbers</li>
     * <li>All elements of {@code pVertexAttributeDescriptions} <b>must</b> describe distinct attribute locations</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>If {@code vertexBindingDescriptionCount} is not 0, {@code pVertexBindingDescriptions} <b>must</b> be a valid pointer to an array of {@code vertexBindingDescriptionCount} valid {@link VkVertexInputBindingDescription2EXT} structures</li>
     * <li>If {@code vertexAttributeDescriptionCount} is not 0, {@code pVertexAttributeDescriptions} <b>must</b> be a valid pointer to an array of {@code vertexAttributeDescriptionCount} valid {@link VkVertexInputAttributeDescription2EXT} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVertexInputAttributeDescription2EXT}, {@link VkVertexInputBindingDescription2EXT}</p>
     *
     * @param commandBuffer                the command buffer into which the command will be recorded.
     * @param pVertexBindingDescriptions   a pointer to an array of {@link VkVertexInputBindingDescription2EXT} structures.
     * @param pVertexAttributeDescriptions a pointer to an array of {@link VkVertexInputAttributeDescription2EXT} structures.
     */
    public static void vkCmdSetVertexInputEXT(VkCommandBuffer commandBuffer, @Nullable @NativeType("VkVertexInputBindingDescription2EXT const *") VkVertexInputBindingDescription2EXT.Buffer pVertexBindingDescriptions, @Nullable @NativeType("VkVertexInputAttributeDescription2EXT const *") VkVertexInputAttributeDescription2EXT.Buffer pVertexAttributeDescriptions) {
        nvkCmdSetVertexInputEXT(commandBuffer, remainingSafe(pVertexBindingDescriptions), memAddressSafe(pVertexBindingDescriptions), remainingSafe(pVertexAttributeDescriptions), memAddressSafe(pVertexAttributeDescriptions));
    }

    // --- [ vkCmdSetPatchControlPointsEXT ] ---

    /**
     * Specify the number of control points per patch dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the number of control points per patch, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetPatchControlPointsEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    patchControlPoints);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the number of control points per patch for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState2#VK_DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineTessellationStateCreateInfo}{@code ::patchControlPoints} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState2PatchControlPoints">{@code extendedDynamicState2PatchControlPoints}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>{@code patchControlPoints} <b>must</b> be greater than zero and less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxTessellationPatchSize}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer      the command buffer into which the command will be recorded.
     * @param patchControlPoints specifies the number of control points per patch.
     */
    public static void vkCmdSetPatchControlPointsEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int patchControlPoints) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPatchControlPointsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), patchControlPoints, __functionAddress);
    }

    // --- [ vkCmdSetRasterizerDiscardEnableEXT ] ---

    /**
     * See {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable}.
     *
     * @param commandBuffer           the command buffer into which the command will be recorded.
     * @param rasterizerDiscardEnable controls whether primitives are discarded immediately before the rasterization stage.
     */
    public static void vkCmdSetRasterizerDiscardEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean rasterizerDiscardEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRasterizerDiscardEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), rasterizerDiscardEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthBiasEnableEXT ] ---

    /**
     * See {@link VK13#vkCmdSetDepthBiasEnable CmdSetDepthBiasEnable}.
     *
     * @param commandBuffer   the command buffer into which the command will be recorded.
     * @param depthBiasEnable controls whether to bias fragment depth values.
     */
    public static void vkCmdSetDepthBiasEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthBiasEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBiasEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthBiasEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetLogicOpEXT ] ---

    /**
     * Select which logical operation to apply for blend state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the logical operation to apply for blend state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetLogicOpEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkLogicOp                                   logicOp);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the logical operation for blend state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState2#VK_DYNAMIC_STATE_LOGIC_OP_EXT DYNAMIC_STATE_LOGIC_OP_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineColorBlendStateCreateInfo}{@code ::logicOp} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState2LogicOp">{@code extendedDynamicState2LogicOp}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code logicOp} <b>must</b> be a valid {@code VkLogicOp} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param logicOp       specifies the logical operation to apply for blend state.
     */
    public static void vkCmdSetLogicOpEXT(VkCommandBuffer commandBuffer, @NativeType("VkLogicOp") int logicOp) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLogicOpEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), logicOp, __functionAddress);
    }

    // --- [ vkCmdSetPrimitiveRestartEnableEXT ] ---

    /**
     * See {@link VK13#vkCmdSetPrimitiveRestartEnable CmdSetPrimitiveRestartEnable}.
     *
     * @param commandBuffer          the command buffer into which the command will be recorded.
     * @param primitiveRestartEnable controls whether a special vertex index value is treated as restarting the assembly of primitives. It behaves in the same way as {@link VkPipelineInputAssemblyStateCreateInfo}{@code ::primitiveRestartEnable}
     */
    public static void vkCmdSetPrimitiveRestartEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean primitiveRestartEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPrimitiveRestartEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), primitiveRestartEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetTessellationDomainOriginEXT ] ---

    /**
     * Specify the origin of the tessellation domain space dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the origin of the tessellation domain space, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetTessellationDomainOriginEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkTessellationDomainOrigin                  domainOrigin);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the origin of the tessellation domain space for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineTessellationDomainOriginStateCreateInfo}{@code ::domainOrigin} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3TessellationDomainOrigin">{@code extendedDynamicState3TessellationDomainOrigin}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code domainOrigin} <b>must</b> be a valid {@code VkTessellationDomainOrigin} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param domainOrigin  specifies the origin of the tessellation domain space.
     */
    public static void vkCmdSetTessellationDomainOriginEXT(VkCommandBuffer commandBuffer, @NativeType("VkTessellationDomainOrigin") int domainOrigin) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetTessellationDomainOriginEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), domainOrigin, __functionAddress);
    }

    // --- [ vkCmdSetDepthClampEnableEXT ] ---

    /**
     * Specify dynamically whether depth clamping is enabled in the command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> enable or disable depth clamping, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthClampEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    depthClampEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets whether depth clamping is enabled or disabled for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationStateCreateInfo}{@code ::depthClampEnable} value used to create the currently active pipeline.</p>
     * 
     * <p>If the depth clamping state is changed dynamically, and the pipeline was not created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT} enabled, then depth clipping is enabled when depth clamping is disabled and vice versa.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3DepthClampEnable">{@code extendedDynamicState3DepthClampEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-depthClamp">{@code depthClamp}</a> feature is not enabled, {@code depthClampEnable} must be {@link VK10#VK_FALSE FALSE}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer    the command buffer into which the command will be recorded.
     * @param depthClampEnable specifies whether depth clamping is enabled.
     */
    public static void vkCmdSetDepthClampEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthClampEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthClampEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthClampEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetPolygonModeEXT ] ---

    /**
     * Specify polygon mode dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the polygon mode, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetPolygonModeEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkPolygonMode                               polygonMode);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the polygon mode for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_POLYGON_MODE_EXT DYNAMIC_STATE_POLYGON_MODE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationStateCreateInfo}{@code ::polygonMode} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3PolygonMode">{@code extendedDynamicState3PolygonMode}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-fillModeNonSolid">{@code fillModeNonSolid}</a> feature is not enabled, {@code polygonMode} <b>must</b> be {@link VK10#VK_POLYGON_MODE_FILL POLYGON_MODE_FILL} or {@link NVFillRectangle#VK_POLYGON_MODE_FILL_RECTANGLE_NV POLYGON_MODE_FILL_RECTANGLE_NV}</li>
     * <li>If the {@link NVFillRectangle VK_NV_fill_rectangle} extension is not enabled, {@code polygonMode} <b>must</b> not be {@link NVFillRectangle#VK_POLYGON_MODE_FILL_RECTANGLE_NV POLYGON_MODE_FILL_RECTANGLE_NV}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code polygonMode} <b>must</b> be a valid {@code VkPolygonMode} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param polygonMode   specifies polygon mode.
     */
    public static void vkCmdSetPolygonModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkPolygonMode") int polygonMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPolygonModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), polygonMode, __functionAddress);
    }

    // --- [ vkCmdSetRasterizationSamplesEXT ] ---

    /**
     * Specify the rasterization samples dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code rasterizationSamples}, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetRasterizationSamplesEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkSampleCountFlagBits                       rasterizationSamples);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code rasterizationSamples} for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineMultisampleStateCreateInfo}{@code ::rasterizationSamples} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3RasterizationSamples">{@code extendedDynamicState3RasterizationSamples}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code rasterizationSamples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer        the command buffer into which the command will be recorded.
     * @param rasterizationSamples specifies {@code rasterizationSamples}.
     */
    public static void vkCmdSetRasterizationSamplesEXT(VkCommandBuffer commandBuffer, @NativeType("VkSampleCountFlagBits") int rasterizationSamples) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRasterizationSamplesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), rasterizationSamples, __functionAddress);
    }

    // --- [ vkCmdSetSampleMaskEXT ] ---

    /** Unsafe version of: {@link #vkCmdSetSampleMaskEXT CmdSetSampleMaskEXT} */
    public static void nvkCmdSetSampleMaskEXT(VkCommandBuffer commandBuffer, int samples, long pSampleMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetSampleMaskEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), samples, pSampleMask, __functionAddress);
    }

    /**
     * Specify the sample mask dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the sample mask, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetSampleMaskEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkSampleCountFlagBits                       samples,
     *     const VkSampleMask*                         pSampleMask);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the sample mask for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_MASK_EXT DYNAMIC_STATE_SAMPLE_MASK_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineMultisampleStateCreateInfo}{@code ::pSampleMask} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3SampleMask">{@code extendedDynamicState3SampleMask}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
     * <li>{@code pSampleMask} <b>must</b> be a valid pointer to an array of \lceil{\mathit{samples} \over 32}\rceil {@code VkSampleMask} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param samples       specifies the number of sample bits in the {@code pSampleMask}.
     * @param pSampleMask   a pointer to an array of {@code VkSampleMask} values, where the array size is based on the {@code samples} parameter.
     */
    public static void vkCmdSetSampleMaskEXT(VkCommandBuffer commandBuffer, @NativeType("VkSampleCountFlagBits") int samples, @NativeType("VkSampleMask const *") IntBuffer pSampleMask) {
        nvkCmdSetSampleMaskEXT(commandBuffer, samples, memAddress(pSampleMask));
    }

    // --- [ vkCmdSetAlphaToCoverageEnableEXT ] ---

    /**
     * Specify the alpha to coverage enable state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code alphaToCoverageEnable} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetAlphaToCoverageEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    alphaToCoverageEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code alphaToCoverageEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineMultisampleStateCreateInfo}{@code ::alphaToCoverageEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3AlphaToCoverageEnable">{@code extendedDynamicState3AlphaToCoverageEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer         the command buffer into which the command will be recorded.
     * @param alphaToCoverageEnable specifies the {@code alphaToCoverageEnable} state.
     */
    public static void vkCmdSetAlphaToCoverageEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean alphaToCoverageEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetAlphaToCoverageEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), alphaToCoverageEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetAlphaToOneEnableEXT ] ---

    /**
     * Specify the alpha to one enable state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code alphaToOneEnable} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetAlphaToOneEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    alphaToOneEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code alphaToOneEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineMultisampleStateCreateInfo}{@code ::alphaToOneEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3AlphaToOneEnable">{@code extendedDynamicState3AlphaToOneEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-alphaToOne">{@code alphaToOne}</a> feature is not enabled, {@code alphaToOneEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer    the command buffer into which the command will be recorded.
     * @param alphaToOneEnable specifies the {@code alphaToOneEnable} state.
     */
    public static void vkCmdSetAlphaToOneEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean alphaToOneEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetAlphaToOneEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), alphaToOneEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetLogicOpEnableEXT ] ---

    /**
     * Specify dynamically whether logical operations are enabled for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> whether logical operations are enabled, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetLogicOpEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    logicOpEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets whether logical operations are enabled for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineColorBlendStateCreateInfo}{@code ::logicOpEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3LogicOpEnable">{@code extendedDynamicState3LogicOpEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-logicOp">{@code logicOp}</a> feature is not enabled, {@code logicOpEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param logicOpEnable specifies whether logical operations are enabled.
     */
    public static void vkCmdSetLogicOpEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean logicOpEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLogicOpEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), logicOpEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetColorBlendEnableEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT}
     *
     * @param attachmentCount the number of color blending enables in the {@code pColorBlendEnables} array.
     */
    public static void nvkCmdSetColorBlendEnableEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, long pColorBlendEnables) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorBlendEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstAttachment, attachmentCount, pColorBlendEnables, __functionAddress);
    }

    /**
     * Specify the {@code blendEnable} for each attachment dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> {@code blendEnable}, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetColorBlendEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstAttachment,
     *     uint32_t                                    attachmentCount,
     *     const VkBool32*                             pColorBlendEnables);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the color blending enable of the specified color attachments for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineColorBlendAttachmentState}{@code ::blendEnable} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3ColorBlendEnable">{@code extendedDynamicState3ColorBlendEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pColorBlendEnables} <b>must</b> be a valid pointer to an array of {@code attachmentCount} {@code VkBool32} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code attachmentCount} <b>must</b> be greater than 0</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer      the command buffer into which the command will be recorded.
     * @param firstAttachment    the first color attachment the color blending enable applies.
     * @param pColorBlendEnables an array of booleans to indicate whether color blending is enabled for the corresponding attachment.
     */
    public static void vkCmdSetColorBlendEnableEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkBool32 const *") IntBuffer pColorBlendEnables) {
        nvkCmdSetColorBlendEnableEXT(commandBuffer, firstAttachment, pColorBlendEnables.remaining(), memAddress(pColorBlendEnables));
    }

    // --- [ vkCmdSetColorBlendEquationEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetColorBlendEquationEXT CmdSetColorBlendEquationEXT}
     *
     * @param attachmentCount the number of {@link VkColorBlendEquationEXT} elements in the {@code pColorBlendEquations} array.
     */
    public static void nvkCmdSetColorBlendEquationEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, long pColorBlendEquations) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorBlendEquationEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstAttachment, attachmentCount, pColorBlendEquations, __functionAddress);
    }

    /**
     * Specify the blend factors and operations dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> color blend factors and operations, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetColorBlendEquationEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstAttachment,
     *     uint32_t                                    attachmentCount,
     *     const VkColorBlendEquationEXT*              pColorBlendEquations);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the color blending factors and operations of the specified attachments for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineColorBlendAttachmentState}{@code ::srcColorBlendFactor}, {@link VkPipelineColorBlendAttachmentState}{@code ::dstColorBlendFactor}, {@link VkPipelineColorBlendAttachmentState}{@code ::colorBlendOp}, {@link VkPipelineColorBlendAttachmentState}{@code ::srcAlphaBlendFactor}, {@link VkPipelineColorBlendAttachmentState}{@code ::dstAlphaBlendFactor}, and {@link VkPipelineColorBlendAttachmentState}{@code ::alphaBlendOp} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3ColorBlendEquation">{@code extendedDynamicState3ColorBlendEquation}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pColorBlendEquations} <b>must</b> be a valid pointer to an array of {@code attachmentCount} valid {@link VkColorBlendEquationEXT} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code attachmentCount} <b>must</b> be greater than 0</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkColorBlendEquationEXT}</p>
     *
     * @param commandBuffer        the command buffer into which the command will be recorded.
     * @param firstAttachment      the first color attachment the color blend factors and operations apply to.
     * @param pColorBlendEquations an array of {@link VkColorBlendEquationEXT} structs that specify the color blend factors and operations for the corresponding attachments.
     */
    public static void vkCmdSetColorBlendEquationEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkColorBlendEquationEXT const *") VkColorBlendEquationEXT.Buffer pColorBlendEquations) {
        nvkCmdSetColorBlendEquationEXT(commandBuffer, firstAttachment, pColorBlendEquations.remaining(), pColorBlendEquations.address());
    }

    // --- [ vkCmdSetColorWriteMaskEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetColorWriteMaskEXT CmdSetColorWriteMaskEXT}
     *
     * @param attachmentCount the number of {@code VkColorComponentFlags} values in the {@code pColorWriteMasks} array.
     */
    public static void nvkCmdSetColorWriteMaskEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, long pColorWriteMasks) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorWriteMaskEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstAttachment, attachmentCount, pColorWriteMasks, __functionAddress);
    }

    /**
     * Specify the color write masks for each attachment dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the color write masks, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetColorWriteMaskEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstAttachment,
     *     uint32_t                                    attachmentCount,
     *     const VkColorComponentFlags*                pColorWriteMasks);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the color write masks of the specified attachments for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_WRITE_MASK_EXT DYNAMIC_STATE_COLOR_WRITE_MASK_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineColorBlendAttachmentState}{@code ::colorWriteMask} values used to create the currently active pipeline.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Formats with bits that are shared between components specified by {@code VkColorComponentFlagBits}, such as {@link VK10#VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 FORMAT_E5B9G9R9_UFLOAT_PACK32}, cannot have their channels individually masked by this functionality; either all components that share bits have to be enabled, or none of them.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3ColorWriteMask">{@code extendedDynamicState3ColorWriteMask}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pColorWriteMasks} <b>must</b> be a valid pointer to an array of {@code attachmentCount} valid combinations of {@code VkColorComponentFlagBits} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code attachmentCount} <b>must</b> be greater than 0</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer    the command buffer into which the command will be recorded.
     * @param firstAttachment  the first color attachment the color write masks apply to.
     * @param pColorWriteMasks an array of {@code VkColorComponentFlags} values that specify the color write masks of the corresponding attachments.
     */
    public static void vkCmdSetColorWriteMaskEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkColorComponentFlags const *") IntBuffer pColorWriteMasks) {
        nvkCmdSetColorWriteMaskEXT(commandBuffer, firstAttachment, pColorWriteMasks.remaining(), memAddress(pColorWriteMasks));
    }

    // --- [ vkCmdSetRasterizationStreamEXT ] ---

    /**
     * Specify the rasterization stream dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code rasterizationStream} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetRasterizationStreamEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    rasterizationStream);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code rasterizationStream} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_STREAM_EXT DYNAMIC_STATE_RASTERIZATION_STREAM_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationStateStreamCreateInfoEXT}{@code ::rasterizationStream} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3RasterizationStream">{@code extendedDynamicState3RasterizationStream}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-transformFeedback">{@code transformFeedback}</a> feature <b>must</b> be enabled</li>
     * <li>{@code rasterizationStream} <b>must</b> be less than {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackStreams}</li>
     * <li>{@code rasterizationStream} <b>must</b> be zero if {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::transformFeedbackRasterizationStreamSelect} is {@link VK10#VK_FALSE FALSE}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer       the command buffer into which the command will be recorded.
     * @param rasterizationStream specifies the {@code rasterizationStream} state.
     */
    public static void vkCmdSetRasterizationStreamEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int rasterizationStream) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRasterizationStreamEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), rasterizationStream, __functionAddress);
    }

    // --- [ vkCmdSetConservativeRasterizationModeEXT ] ---

    /**
     * Specify the conservative rasterization mode dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code conservativeRasterizationMode}, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetConservativeRasterizationModeEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkConservativeRasterizationModeEXT          conservativeRasterizationMode);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code conservativeRasterizationMode} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationConservativeStateCreateInfoEXT}{@code ::conservativeRasterizationMode} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3ConservativeRasterizationMode">{@code extendedDynamicState3ConservativeRasterizationMode}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code conservativeRasterizationMode} <b>must</b> be a valid {@code VkConservativeRasterizationModeEXT} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer                 the command buffer into which the command will be recorded.
     * @param conservativeRasterizationMode specifies the {@code conservativeRasterizationMode} state.
     */
    public static void vkCmdSetConservativeRasterizationModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkConservativeRasterizationModeEXT") int conservativeRasterizationMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetConservativeRasterizationModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), conservativeRasterizationMode, __functionAddress);
    }

    // --- [ vkCmdSetExtraPrimitiveOverestimationSizeEXT ] ---

    /**
     * Specify the conservative rasterization extra primitive overestimation size dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code extraPrimitiveOverestimationSize}, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetExtraPrimitiveOverestimationSizeEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     float                                       extraPrimitiveOverestimationSize);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code extraPrimitiveOverestimationSize} for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationConservativeStateCreateInfoEXT}{@code ::extraPrimitiveOverestimationSize} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3ExtraPrimitiveOverestimationSize">{@code extendedDynamicState3ExtraPrimitiveOverestimationSize}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>{@code extraPrimitiveOverestimationSize} <b>must</b> be in the range of {@code 0.0} to {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT}{@code ::maxExtraPrimitiveOverestimationSize} inclusive</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer                    the command buffer into which the command will be recorded.
     * @param extraPrimitiveOverestimationSize specifies the {@code extraPrimitiveOverestimationSize}.
     */
    public static void vkCmdSetExtraPrimitiveOverestimationSizeEXT(VkCommandBuffer commandBuffer, float extraPrimitiveOverestimationSize) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetExtraPrimitiveOverestimationSizeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), extraPrimitiveOverestimationSize, __functionAddress);
    }

    // --- [ vkCmdSetDepthClipEnableEXT ] ---

    /**
     * Specify dynamically whether depth clipping is enabled in the command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> enable or disable depth clipping, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthClipEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    depthClipEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets whether depth clipping is enabled or disabled for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT}{@code ::depthClipEnable} value used to create the currently active pipeline, or is set to the inverse of {@link VkPipelineRasterizationStateCreateInfo}{@code ::depthClampEnable} if {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT} is not specified.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3DepthClipEnable">{@code extendedDynamicState3DepthClipEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-depthClipEnable">{@code depthClipEnable}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer   the command buffer into which the command will be recorded.
     * @param depthClipEnable specifies whether depth clipping is enabled.
     */
    public static void vkCmdSetDepthClipEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthClipEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthClipEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthClipEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetSampleLocationsEnableEXT ] ---

    /**
     * Specify the samples locations enable state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code sampleLocationsEnable} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetSampleLocationsEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    sampleLocationsEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code sampleLocationsEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3SampleLocationsEnable">{@code extendedDynamicState3SampleLocationsEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer         the command buffer into which the command will be recorded.
     * @param sampleLocationsEnable specifies the {@code sampleLocationsEnable} state.
     */
    public static void vkCmdSetSampleLocationsEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean sampleLocationsEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetSampleLocationsEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), sampleLocationsEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetColorBlendAdvancedEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetColorBlendAdvancedEXT CmdSetColorBlendAdvancedEXT}
     *
     * @param attachmentCount the number of {@link VkColorBlendAdvancedEXT} elements in the {@code pColorBlendAdvanced} array.
     */
    public static void nvkCmdSetColorBlendAdvancedEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, long pColorBlendAdvanced) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorBlendAdvancedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstAttachment, attachmentCount, pColorBlendAdvanced, __functionAddress);
    }

    /**
     * Specify the advanced color blend state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the advanced blend state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetColorBlendAdvancedEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstAttachment,
     *     uint32_t                                    attachmentCount,
     *     const VkColorBlendAdvancedEXT*              pColorBlendAdvanced);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the advanced blend operation parameters of the specified attachments for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT}{@code ::srcPremultiplied}, {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT}{@code ::dstPremultiplied}, and {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT}{@code ::blendOverlap} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3ColorBlendAdvanced">{@code extendedDynamicState3ColorBlendAdvanced}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pColorBlendAdvanced} <b>must</b> be a valid pointer to an array of {@code attachmentCount} valid {@link VkColorBlendAdvancedEXT} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code attachmentCount} <b>must</b> be greater than 0</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkColorBlendAdvancedEXT}</p>
     *
     * @param commandBuffer       the command buffer into which the command will be recorded.
     * @param firstAttachment     the first color attachment the advanced blend parameters apply to.
     * @param pColorBlendAdvanced an array of {@link VkColorBlendAdvancedEXT} structs that specify the advanced color blend parameters for the corresponding attachments.
     */
    public static void vkCmdSetColorBlendAdvancedEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkColorBlendAdvancedEXT const *") VkColorBlendAdvancedEXT.Buffer pColorBlendAdvanced) {
        nvkCmdSetColorBlendAdvancedEXT(commandBuffer, firstAttachment, pColorBlendAdvanced.remaining(), pColorBlendAdvanced.address());
    }

    // --- [ vkCmdSetProvokingVertexModeEXT ] ---

    /**
     * Specify the provoking vertex mode dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code provokingVertexMode} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetProvokingVertexModeEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkProvokingVertexModeEXT                    provokingVertexMode);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code provokingVertexMode} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT}{@code ::provokingVertexMode} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3ProvokingVertexMode">{@code extendedDynamicState3ProvokingVertexMode}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>If {@code provokingVertexMode} is {@link EXTProvokingVertex#VK_PROVOKING_VERTEX_MODE_LAST_VERTEX_EXT PROVOKING_VERTEX_MODE_LAST_VERTEX_EXT}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-provokingVertexLast">{@code provokingVertexLast}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code provokingVertexMode} <b>must</b> be a valid {@code VkProvokingVertexModeEXT} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer       the command buffer into which the command will be recorded.
     * @param provokingVertexMode specifies the {@code provokingVertexMode} state.
     */
    public static void vkCmdSetProvokingVertexModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkProvokingVertexModeEXT") int provokingVertexMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetProvokingVertexModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), provokingVertexMode, __functionAddress);
    }

    // --- [ vkCmdSetLineRasterizationModeEXT ] ---

    /**
     * Specify the line rasterization mode dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code lineRasterizationMode} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetLineRasterizationModeEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkLineRasterizationModeEXT                  lineRasterizationMode);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code lineRasterizationMode} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationLineStateCreateInfoEXT}{@code ::lineRasterizationMode} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3LineRasterizationMode">{@code extendedDynamicState3LineRasterizationMode}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>If {@code lineRasterizationMode} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_EXT LINE_RASTERIZATION_MODE_RECTANGULAR_EXT}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-rectangularLines">{@code rectangularLines}</a> feature <b>must</b> be enabled</li>
     * <li>If {@code lineRasterizationMode} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_BRESENHAM_EXT LINE_RASTERIZATION_MODE_BRESENHAM_EXT}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bresenhamLines">{@code bresenhamLines}</a> feature <b>must</b> be enabled</li>
     * <li>If {@code lineRasterizationMode} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-smoothLines">{@code smoothLines}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code lineRasterizationMode} <b>must</b> be a valid {@code VkLineRasterizationModeEXT} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer         the command buffer into which the command will be recorded.
     * @param lineRasterizationMode specifies the {@code lineRasterizationMode} state.
     */
    public static void vkCmdSetLineRasterizationModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkLineRasterizationModeEXT") int lineRasterizationMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLineRasterizationModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), lineRasterizationMode, __functionAddress);
    }

    // --- [ vkCmdSetLineStippleEnableEXT ] ---

    /**
     * Specify the line stipple enable dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code stippledLineEnable} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetLineStippleEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    stippledLineEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code stippledLineEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationLineStateCreateInfoEXT}{@code ::stippledLineEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3LineStippleEnable">{@code extendedDynamicState3LineStippleEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer      the command buffer into which the command will be recorded.
     * @param stippledLineEnable specifies the {@code stippledLineEnable} state.
     */
    public static void vkCmdSetLineStippleEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean stippledLineEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLineStippleEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), stippledLineEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthClipNegativeOneToOneEXT ] ---

    /**
     * Specify the negative one to one depth clip mode dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> {@code negativeOneToOne}, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthClipNegativeOneToOneEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    negativeOneToOne);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code negativeOneToOne} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineViewportDepthClipControlCreateInfoEXT}{@code ::negativeOneToOne} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3DepthClipNegativeOneToOne">{@code extendedDynamicState3DepthClipNegativeOneToOne}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-depthClipControl">{@code depthClipControl}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer    the command buffer into which the command will be recorded.
     * @param negativeOneToOne specifies the {@code negativeOneToOne} state.
     */
    public static void vkCmdSetDepthClipNegativeOneToOneEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean negativeOneToOne) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthClipNegativeOneToOneEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), negativeOneToOne ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetViewportWScalingEnableNV ] ---

    /**
     * Specify the viewport W scaling enable state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code viewportWScalingEnable} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetViewportWScalingEnableNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    viewportWScalingEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code viewportWScalingEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineViewportWScalingStateCreateInfoNV}{@code ::viewportWScalingEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3ViewportWScalingEnable">{@code extendedDynamicState3ViewportWScalingEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer          the command buffer into which the command will be recorded.
     * @param viewportWScalingEnable specifies the {@code viewportWScalingEnable} state.
     */
    public static void vkCmdSetViewportWScalingEnableNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean viewportWScalingEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportWScalingEnableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), viewportWScalingEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetViewportSwizzleNV ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetViewportSwizzleNV CmdSetViewportSwizzleNV}
     *
     * @param viewportCount the number of viewports whose parameters are updated by the command.
     */
    public static void nvkCmdSetViewportSwizzleNV(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, long pViewportSwizzles) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportSwizzleNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstViewport, viewportCount, pViewportSwizzles, __functionAddress);
    }

    /**
     * Specify the viewport swizzle state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the viewport swizzle state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetViewportSwizzleNV(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstViewport,
     *     uint32_t                                    viewportCount,
     *     const VkViewportSwizzleNV*                  pViewportSwizzles);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the viewport swizzle state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineViewportSwizzleStateCreateInfoNV}{@code ::viewportCount}, and {@link VkPipelineViewportSwizzleStateCreateInfoNV}{@code ::pViewportSwizzles} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3ViewportSwizzle">{@code extendedDynamicState3ViewportSwizzle}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pViewportSwizzles} <b>must</b> be a valid pointer to an array of {@code viewportCount} valid {@link VkViewportSwizzleNV} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code viewportCount} <b>must</b> be greater than 0</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkViewportSwizzleNV}</p>
     *
     * @param commandBuffer     the command buffer into which the command will be recorded.
     * @param firstViewport     the index of the first viewport whose parameters are updated by the command.
     * @param pViewportSwizzles a pointer to an array of {@link VkViewportSwizzleNV} structures specifying viewport swizzles.
     */
    public static void vkCmdSetViewportSwizzleNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstViewport, @NativeType("VkViewportSwizzleNV const *") VkViewportSwizzleNV.Buffer pViewportSwizzles) {
        nvkCmdSetViewportSwizzleNV(commandBuffer, firstViewport, pViewportSwizzles.remaining(), pViewportSwizzles.address());
    }

    // --- [ vkCmdSetCoverageToColorEnableNV ] ---

    /**
     * Specify the coverage to color enable state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code coverageToColorEnable} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetCoverageToColorEnableNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    coverageToColorEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code coverageToColorEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineCoverageToColorStateCreateInfoNV}{@code ::coverageToColorEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3CoverageToColorEnable">{@code extendedDynamicState3CoverageToColorEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer         the command buffer into which the command will be recorded.
     * @param coverageToColorEnable specifies the {@code coverageToColorEnable} state.
     */
    public static void vkCmdSetCoverageToColorEnableNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean coverageToColorEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageToColorEnableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), coverageToColorEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetCoverageToColorLocationNV ] ---

    /**
     * Specify the coverage to color location dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code coverageToColorLocation} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetCoverageToColorLocationNV(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    coverageToColorLocation);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code coverageToColorLocation} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineCoverageToColorStateCreateInfoNV}{@code ::coverageToColorLocation} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3CoverageToColorLocation">{@code extendedDynamicState3CoverageToColorLocation}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer           the command buffer into which the command will be recorded.
     * @param coverageToColorLocation specifies the {@code coverageToColorLocation} state.
     */
    public static void vkCmdSetCoverageToColorLocationNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int coverageToColorLocation) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageToColorLocationNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), coverageToColorLocation, __functionAddress);
    }

    // --- [ vkCmdSetCoverageModulationModeNV ] ---

    /**
     * Specify the coverage modulation mode dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code coverageModulationMode} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetCoverageModulationModeNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkCoverageModulationModeNV                  coverageModulationMode);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code coverageModulationMode} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineCoverageModulationStateCreateInfoNV}{@code ::coverageModulationMode} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3CoverageModulationMode">{@code extendedDynamicState3CoverageModulationMode}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code coverageModulationMode} <b>must</b> be a valid {@code VkCoverageModulationModeNV} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer          the command buffer into which the command will be recorded.
     * @param coverageModulationMode specifies the {@code coverageModulationMode} state.
     */
    public static void vkCmdSetCoverageModulationModeNV(VkCommandBuffer commandBuffer, @NativeType("VkCoverageModulationModeNV") int coverageModulationMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageModulationModeNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), coverageModulationMode, __functionAddress);
    }

    // --- [ vkCmdSetCoverageModulationTableEnableNV ] ---

    /**
     * Specify the coverage modulation table enable state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code coverageModulationTableEnable} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetCoverageModulationTableEnableNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    coverageModulationTableEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code coverageModulationTableEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineCoverageModulationStateCreateInfoNV}{@code ::coverageModulationTableEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3CoverageModulationTableEnable">{@code extendedDynamicState3CoverageModulationTableEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer                 the command buffer into which the command will be recorded.
     * @param coverageModulationTableEnable specifies the {@code coverageModulationTableEnable} state.
     */
    public static void vkCmdSetCoverageModulationTableEnableNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean coverageModulationTableEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageModulationTableEnableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), coverageModulationTableEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetCoverageModulationTableNV ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetCoverageModulationTableNV CmdSetCoverageModulationTableNV}
     *
     * @param coverageModulationTableCount specifies the number of elements in {@code pCoverageModulationTable}.
     */
    public static void nvkCmdSetCoverageModulationTableNV(VkCommandBuffer commandBuffer, int coverageModulationTableCount, long pCoverageModulationTable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageModulationTableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), coverageModulationTableCount, pCoverageModulationTable, __functionAddress);
    }

    /**
     * Specify the coverage modulation table dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code pCoverageModulationTable} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetCoverageModulationTableNV(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    coverageModulationTableCount,
     *     const float*                                pCoverageModulationTable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the table of modulation factors for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineCoverageModulationStateCreateInfoNV}{@code ::coverageModulationTableCount}, and {@link VkPipelineCoverageModulationStateCreateInfoNV}{@code ::pCoverageModulationTable} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3CoverageModulationTable">{@code extendedDynamicState3CoverageModulationTable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pCoverageModulationTable} <b>must</b> be a valid pointer to an array of {@code coverageModulationTableCount} {@code float} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code coverageModulationTableCount} <b>must</b> be greater than 0</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer            the command buffer into which the command will be recorded.
     * @param pCoverageModulationTable specifies the table of modulation factors containing a value for each number of covered samples.
     */
    public static void vkCmdSetCoverageModulationTableNV(VkCommandBuffer commandBuffer, @NativeType("float const *") FloatBuffer pCoverageModulationTable) {
        nvkCmdSetCoverageModulationTableNV(commandBuffer, pCoverageModulationTable.remaining(), memAddress(pCoverageModulationTable));
    }

    // --- [ vkCmdSetShadingRateImageEnableNV ] ---

    /**
     * Specify the shading rate image enable state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code shadingRateImageEnable} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetShadingRateImageEnableNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    shadingRateImageEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code shadingRateImageEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineViewportShadingRateImageStateCreateInfoNV}{@code ::shadingRateImageEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3ShadingRateImageEnable">{@code extendedDynamicState3ShadingRateImageEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer          the command buffer into which the command will be recorded.
     * @param shadingRateImageEnable specifies the {@code shadingRateImageEnable} state.
     */
    public static void vkCmdSetShadingRateImageEnableNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean shadingRateImageEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetShadingRateImageEnableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), shadingRateImageEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetRepresentativeFragmentTestEnableNV ] ---

    /**
     * Specify the representative fragment test enable dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code representativeFragmentTestEnable} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetRepresentativeFragmentTestEnableNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    representativeFragmentTestEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code representativeFragmentTestEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV}{@code ::representativeFragmentTestEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3RepresentativeFragmentTestEnable">{@code extendedDynamicState3RepresentativeFragmentTestEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer                    the command buffer into which the command will be recorded.
     * @param representativeFragmentTestEnable specifies the {@code representativeFragmentTestEnable} state.
     */
    public static void vkCmdSetRepresentativeFragmentTestEnableNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean representativeFragmentTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRepresentativeFragmentTestEnableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), representativeFragmentTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetCoverageReductionModeNV ] ---

    /**
     * Specify the coverage reduction mode dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code coverageReductionMode} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetCoverageReductionModeNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkCoverageReductionModeNV                   coverageReductionMode);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code coverageReductionMode} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineCoverageReductionStateCreateInfoNV}{@code ::coverageReductionMode} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3CoverageReductionMode">{@code extendedDynamicState3CoverageReductionMode}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code coverageReductionMode} <b>must</b> be a valid {@code VkCoverageReductionModeNV} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer         the command buffer into which the command will be recorded.
     * @param coverageReductionMode specifies the {@code coverageReductionMode} state.
     */
    public static void vkCmdSetCoverageReductionModeNV(VkCommandBuffer commandBuffer, @NativeType("VkCoverageReductionModeNV") int coverageReductionMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageReductionModeNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), coverageReductionMode, __functionAddress);
    }

    /** Array version of: {@link #vkCreateShadersEXT CreateShadersEXT} */
    @NativeType("VkResult")
    public static int vkCreateShadersEXT(VkDevice device, @NativeType("VkShaderCreateInfoEXT const *") VkShaderCreateInfoEXT.Buffer pCreateInfos, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkShaderEXT *") long[] pShaders) {
        long __functionAddress = device.getCapabilities().vkCreateShadersEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pShaders, pCreateInfos.remaining());
            Struct.validate(pCreateInfos.address(), pCreateInfos.remaining(), VkShaderCreateInfoEXT.SIZEOF, VkShaderCreateInfoEXT::validate);
        }
        return callPPPPI(device.address(), pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), pShaders, __functionAddress);
    }

    /** Array version of: {@link #vkCmdBindShadersEXT CmdBindShadersEXT} */
    public static void vkCmdBindShadersEXT(VkCommandBuffer commandBuffer, @NativeType("VkShaderStageFlagBits const *") int[] pStages, @NativeType("VkShaderEXT const *") long[] pShaders) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindShadersEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pShaders, pStages.length);
        }
        callPPPV(commandBuffer.address(), pStages.length, pStages, pShaders, __functionAddress);
    }

    /** Array version of: {@link #vkCmdBindVertexBuffers2EXT CmdBindVertexBuffers2EXT} */
    public static void vkCmdBindVertexBuffers2EXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") long[] pBuffers, @NativeType("VkDeviceSize const *") long[] pOffsets, @Nullable @NativeType("VkDeviceSize const *") long[] pSizes, @Nullable @NativeType("VkDeviceSize const *") long[] pStrides) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers2EXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pOffsets, pBuffers.length);
            checkSafe(pSizes, pBuffers.length);
            checkSafe(pStrides, pBuffers.length);
        }
        callPPPPPV(commandBuffer.address(), firstBinding, pBuffers.length, pBuffers, pOffsets, pSizes, pStrides, __functionAddress);
    }

    /** Array version of: {@link #vkCmdSetSampleMaskEXT CmdSetSampleMaskEXT} */
    public static void vkCmdSetSampleMaskEXT(VkCommandBuffer commandBuffer, @NativeType("VkSampleCountFlagBits") int samples, @NativeType("VkSampleMask const *") int[] pSampleMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetSampleMaskEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), samples, pSampleMask, __functionAddress);
    }

    /** Array version of: {@link #vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} */
    public static void vkCmdSetColorBlendEnableEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkBool32 const *") int[] pColorBlendEnables) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorBlendEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstAttachment, pColorBlendEnables.length, pColorBlendEnables, __functionAddress);
    }

    /** Array version of: {@link #vkCmdSetColorWriteMaskEXT CmdSetColorWriteMaskEXT} */
    public static void vkCmdSetColorWriteMaskEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkColorComponentFlags const *") int[] pColorWriteMasks) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorWriteMaskEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstAttachment, pColorWriteMasks.length, pColorWriteMasks, __functionAddress);
    }

    /** Array version of: {@link #vkCmdSetCoverageModulationTableNV CmdSetCoverageModulationTableNV} */
    public static void vkCmdSetCoverageModulationTableNV(VkCommandBuffer commandBuffer, @NativeType("float const *") float[] pCoverageModulationTable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageModulationTableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pCoverageModulationTable.length, pCoverageModulationTable, __functionAddress);
    }

}