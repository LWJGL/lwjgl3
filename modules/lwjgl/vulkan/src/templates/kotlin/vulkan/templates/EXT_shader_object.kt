/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_shader_object = "EXTShaderObject".nativeClassVK("EXT_shader_object", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension introduces a new {@code VkShaderEXT} object type which represents a single compiled shader stage. Shader objects provide a more flexible alternative to {@code VkPipeline} objects, which may be helpful in certain use cases.

        <h5>Examples</h5>
        <b>Example 1</b>

        Create linked pair of vertex and fragment shaders.

        <pre><code>
￿// Logical device created with the shaderObject feature enabled
￿VkDevice device;
￿
￿// SPIR-V shader code for a vertex shader, along with its size in bytes
￿void* pVertexSpirv;
￿size_t vertexSpirvSize;
￿
￿// SPIR-V shader code for a fragment shader, along with its size in bytes
￿void* pFragmentSpirv;
￿size_t fragmentSpirvSize;
￿
￿// Descriptor set layout compatible with the shaders
￿VkDescriptorSetLayout descriptorSetLayout;
￿
￿VkShaderCreateInfoEXT shaderCreateInfos[2] =
￿{
￿    {
￿        .sType = VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT,
￿        .pNext = NULL,
￿        .flags = VK_SHADER_CREATE_LINK_STAGE_BIT_EXT,
￿        .stage = VK_SHADER_STAGE_VERTEX_BIT,
￿        .nextStage = VK_SHADER_STAGE_FRAGMENT_BIT,
￿        .codeType = VK_SHADER_CODE_TYPE_SPIRV_EXT,
￿        .codeSize = vertexSpirvSize,
￿        .pCode = pVertexSpirv,
￿        .pName = "main",
￿        .setLayoutCount = 1,
￿        .pSetLayouts = &amp;descriptorSetLayout;
￿        .pushConstantRangeCount = 0,
￿        .pPushConstantRanges = NULL,
￿        .pSpecializationInfo = NULL
￿    },
￿    {
￿        .sType = VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT,
￿        .pNext = NULL,
￿        .flags = VK_SHADER_CREATE_LINK_STAGE_BIT_EXT,
￿        .stage = VK_SHADER_STAGE_FRAGMENT_BIT,
￿        .nextStage = 0,
￿        .codeType = VK_SHADER_CODE_TYPE_SPIRV_EXT,
￿        .codeSize = fragmentSpirvSize,
￿        .pCode = pFragmentSpirv,
￿        .pName = "main",
￿        .setLayoutCount = 1,
￿        .pSetLayouts = &amp;descriptorSetLayout;
￿        .pushConstantRangeCount = 0,
￿        .pPushConstantRanges = NULL,
￿        .pSpecializationInfo = NULL
￿    }
￿};
￿
￿VkResult result;
￿VkShaderEXT shaders[2];
￿
￿result = vkCreateShadersEXT(device, 2, &amp;shaderCreateInfos, NULL, shaders);
￿if (result != VK_SUCCESS)
￿{
￿    // Handle error
￿}</code></pre>

        Later, during command buffer recording, bind the linked shaders and draw.

        <pre><code>
￿// Command buffer in the recording state
￿VkCommandBuffer commandBuffer;
￿
￿// Vertex and fragment shader objects created above
￿VkShaderEXT shaders[2];
￿
￿// Assume vertex buffers, descriptor sets, etc. have been bound, and existing
￿// state setting commands have been called to set all required state
￿
￿const VkShaderStageFlagBits stages[2] =
￿{
￿    VK_SHADER_STAGE_VERTEX_BIT,
￿    VK_SHADER_STAGE_FRAGMENT_BIT
￿};
￿
￿// Bind linked shaders
￿vkCmdBindShadersEXT(commandBuffer, 2, stages, shaders);
￿
￿// Equivalent to the previous line. Linked shaders can be bound one at a time,
￿// in any order:
￿// vkCmdBindShadersEXT(commandBuffer, 1, &amp;stages[1], &amp;shaders[1]);
￿// vkCmdBindShadersEXT(commandBuffer, 1, &amp;stages[0], &amp;shaders[0]);
￿
￿// The above is sufficient to draw if the device was created with the
￿// tessellationShader and geometryShader features disabled. Otherwise, since
￿// those stages should not execute, vkCmdBindShadersEXT() must be called at
￿// least once with each of their stages in pStages before drawing:
￿
￿const VkShaderStageFlagBits unusedStages[3] =
￿{
￿    VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT,
￿    VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT,
￿    VK_SHADER_STAGE_GEOMETRY_BIT
￿};
￿
￿// NULL pShaders is equivalent to an array of stageCount VK_NULL_HANDLE values,
￿// meaning no shaders are bound to those stages, and that any previously bound
￿// shaders are unbound
￿vkCmdBindShadersEXT(commandBuffer, 3, unusedStages, NULL);
￿
￿// Graphics shader objects may only be used to draw inside dynamic render pass
￿// instances begun with vkCmdBeginRendering(), assume one has already been begun
￿
￿// Draw a triangle
￿vkCmdDraw(commandBuffer, 3, 1, 0, 0);</code></pre>

        <b>Example 2</b>

        Create unlinked vertex, geometry, and fragment shaders.

        <pre><code>
￿// Logical device created with the shaderObject feature enabled
￿VkDevice device;
￿
￿// SPIR-V shader code for vertex shaders, along with their sizes in bytes
￿void* pVertexSpirv[2];
￿size_t vertexSpirvSize[2];
￿
￿// SPIR-V shader code for a geometry shader, along with its size in bytes
￿void pGeometrySpirv;
￿size_t geometrySpirvSize;
￿
￿// SPIR-V shader code for fragment shaders, along with their sizes in bytes
￿void* pFragmentSpirv[2];
￿size_t fragmentSpirvSize[2];
￿
￿// Descriptor set layout compatible with the shaders
￿VkDescriptorSetLayout descriptorSetLayout;
￿
￿VkShaderCreateInfoEXT shaderCreateInfos[5] =
￿{
￿    // Stage order does not matter
￿    {
￿        .sType = VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT,
￿        .pNext = NULL,
￿        .flags = 0,
￿        .stage = VK_SHADER_STAGE_GEOMETRY_BIT,
￿        .nextStage = VK_SHADER_STAGE_FRAGMENT_BIT,
￿        .codeType = VK_SHADER_CODE_TYPE_SPIRV_EXT,
￿        .codeSize = pGeometrySpirv,
￿        .pCode = geometrySpirvSize,
￿        .pName = "main",
￿        .setLayoutCount = 1,
￿        .pSetLayouts = &amp;descriptorSetLayout;
￿        .pushConstantRangeCount = 0,
￿        .pPushConstantRanges = NULL,
￿        .pSpecializationInfo = NULL
￿    },
￿    {
￿        .sType = VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT,
￿        .pNext = NULL,
￿        .flags = 0,
￿        .stage = VK_SHADER_STAGE_VERTEX_BIT,
￿        .nextStage = VK_SHADER_STAGE_GEOMETRY_BIT,
￿        .codeType = VK_SHADER_CODE_TYPE_SPIRV_EXT,
￿        .codeSize = vertexSpirvSize[0],
￿        .pCode = pVertexSpirv[0],
￿        .pName = "main",
￿        .setLayoutCount = 1,
￿        .pSetLayouts = &amp;descriptorSetLayout;
￿        .pushConstantRangeCount = 0,
￿        .pPushConstantRanges = NULL,
￿        .pSpecializationInfo = NULL
￿    },
￿    {
￿        .sType = VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT,
￿        .pNext = NULL,
￿        .flags = 0,
￿        .stage = VK_SHADER_STAGE_FRAGMENT_BIT,
￿        .nextStage = 0,
￿        .codeType = VK_SHADER_CODE_TYPE_SPIRV_EXT,
￿        .codeSize = fragmentSpirvSize[0],
￿        .pCode = pFragmentSpirv[0],
￿        .pName = "main",
￿        .setLayoutCount = 1,
￿        .pSetLayouts = &amp;descriptorSetLayout;
￿        .pushConstantRangeCount = 0,
￿        .pPushConstantRanges = NULL,
￿        .pSpecializationInfo = NULL
￿    },
￿    {
￿        .sType = VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT,
￿        .pNext = NULL,
￿        .flags = 0,
￿        .stage = VK_SHADER_STAGE_FRAGMENT_BIT,
￿        .nextStage = 0,
￿        .codeType = VK_SHADER_CODE_TYPE_SPIRV_EXT,
￿        .codeSize = fragmentSpirvSize[1],
￿        .pCode = pFragmentSpirv[1],
￿        .pName = "main",
￿        .setLayoutCount = 1,
￿        .pSetLayouts = &amp;descriptorSetLayout;
￿        .pushConstantRangeCount = 0,
￿        .pPushConstantRanges = NULL,
￿        .pSpecializationInfo = NULL
￿    },
￿    {
￿        .sType = VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT,
￿        .pNext = NULL,
￿        .flags = 0,
￿        .stage = VK_SHADER_STAGE_VERTEX_BIT,
￿        // Suppose we want this vertex shader to be able to be followed by
￿        // either a geometry shader or fragment shader:
￿        .nextStage = VK_SHADER_STAGE_GEOMETRY_BIT | VK_SHADER_STAGE_FRAGMENT_BIT,
￿        .codeType = VK_SHADER_CODE_TYPE_SPIRV_EXT,
￿        .codeSize = vertexSpirvSize[1],
￿        .pCode = pVertexSpirv[1],
￿        .pName = "main",
￿        .setLayoutCount = 1,
￿        .pSetLayouts = &amp;descriptorSetLayout;
￿        .pushConstantRangeCount = 0,
￿        .pPushConstantRanges = NULL,
￿        .pSpecializationInfo = NULL
￿    }
￿};
￿
￿VkResult result;
￿VkShaderEXT shaders[5];
￿
￿result = vkCreateShadersEXT(device, 5, &amp;shaderCreateInfos, NULL, shaders);
￿if (result != VK_SUCCESS)
￿{
￿    // Handle error
￿}</code></pre>

        Later, during command buffer recording, bind the linked shaders in different combinations and draw.

        <pre><code>
￿// Command buffer in the recording state
￿VkCommandBuffer commandBuffer;
￿
￿// Vertex, geometry, and fragment shader objects created above
￿VkShaderEXT shaders[5];
￿
￿// Assume vertex buffers, descriptor sets, etc. have been bound, and existing
￿// state setting commands have been called to set all required state
￿
￿const VkShaderStageFlagBits stages[3] =
￿{
￿    // Any order is allowed
￿    VK_SHADER_STAGE_FRAGMENT_BIT,
￿    VK_SHADER_STAGE_VERTEX_BIT,
￿    VK_SHADER_STAGE_GEOMETRY_BIT,
￿};
￿
￿VkShaderEXT bindShaders[3] =
￿{
￿    shaders[2], // FS
￿    shaders[1], // VS
￿    shaders[0]  // GS
￿};
￿
￿// Bind unlinked shaders
￿vkCmdBindShadersEXT(commandBuffer, 3, stages, bindShaders);
￿
￿// Assume the tessellationShader feature is disabled, so vkCmdBindShadersEXT()
￿// need not have been called with either tessellation stage
￿
￿// Graphics shader objects may only be used to draw inside dynamic render pass
￿// instances begun with vkCmdBeginRendering(), assume one has already been begun
￿
￿// Draw a triangle
￿vkCmdDraw(commandBuffer, 3, 1, 0, 0);
￿
￿// Bind a different unlinked fragment shader
￿const VkShaderStageFlagBits fragmentStage = VK_SHADER_STAGE_FRAGMENT_BIT;
￿vkCmdBindShadersEXT(commandBuffer, 1, &amp;fragmentStage, &amp;shaders[3]);
￿
￿// Draw another triangle
￿vkCmdDraw(commandBuffer, 3, 1, 0, 0);
￿
￿// Bind a different unlinked vertex shader
￿const VkShaderStageFlagBits vertexStage = VK_SHADER_STAGE_VERTEX_BIT;
￿vkCmdBindShadersEXT(commandBuffer, 1, &amp;vertexStage, &amp;shaders[4]);
￿
￿// Draw another triangle
￿vkCmdDraw(commandBuffer, 3, 1, 0, 0);</code></pre>

        <h5>VK_EXT_shader_object</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_shader_object}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>483</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>     {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}      or      <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1">Version 1.1</a> and      {@link KHRDynamicRendering VK_KHR_dynamic_rendering}      or      <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.3">Version 1.3</a></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Story <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_shader_object]%20@daniel-story%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_shader_object%20extension*">daniel-story</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_shader_object.adoc">VK_EXT_shader_object</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-03-30</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Interacts with {@link EXTExtendedDynamicState VK_EXT_extended_dynamic_state}</li>
                <li>Interacts with {@link EXTExtendedDynamicState2 VK_EXT_extended_dynamic_state2}</li>
                <li>Interacts with {@link EXTExtendedDynamicState3 VK_EXT_extended_dynamic_state3}</li>
                <li>Interacts with {@link EXTVertexInputDynamicState VK_EXT_vertex_input_dynamic_state}</li>
            </ul></dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Piers Daniell, NVIDIA</li>
                <li>Sandy Jamieson, Nintendo</li>
                <li>Žiga Markuš, LunarG</li>
                <li>Tobias Hector, AMD</li>
                <li>Alex Walters, Imagination</li>
                <li>Shahbaz Youssefi, Google</li>
                <li>Ralph Potter, Samsung</li>
                <li>Jan-Harald Fredriksen, ARM</li>
                <li>Connor Abott, Valve</li>
                <li>Arseny Kapoulkine, Roblox</li>
                <li>Patrick Doane, Activision</li>
                <li>Jeff Leger, Qualcomm</li>
                <li>Stu Smith, AMD</li>
                <li>Chris Glover, Google</li>
                <li>Ricardo Garcia, Igalia</li>
                <li>Faith Ekstrand, Collabora</li>
                <li>Timur Kristóf, Valve</li>
                <li>Constantine Shablya, Collabora</li>
                <li>Daniel Koch, NVIDIA</li>
                <li>Alyssa Rosenzweig, Collabora</li>
                <li>Mike Blumenkrantz, Valve</li>
                <li>Samuel Pitoiset, Valve</li>
                <li>Qun Lin, AMD</li>
                <li>Spencer Fricke, LunarG</li>
                <li>Soroush Faghihi Kashani, Imagination</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_SHADER_OBJECT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_SHADER_OBJECT_EXTENSION_NAME".."VK_EXT_shader_object"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_FEATURES_EXT".."1000482000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT".."1000482001",
        "STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT".."1000482002",
        "STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT".."1000352001",
        "STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT".."1000352002",
        "STRUCTURE_TYPE_SHADER_REQUIRED_SUBGROUP_SIZE_CREATE_INFO_EXT".."1000225001"
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_SHADER_EXT".."1000482000"
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "ERROR_INCOMPATIBLE_SHADER_BINARY_EXT".."1000482000"
    )

    EnumConstant(
        "Extends {@code VkShaderCreateFlagBitsEXT}.",

        "SHADER_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT".enum(0x00000002),
        "SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT".enum(0x00000004)
    )

    EnumConstant(
        "Extends {@code VkShaderCreateFlagBitsEXT}.",

        "SHADER_CREATE_NO_TASK_SHADER_BIT_EXT".enum(0x00000008)
    )

    EnumConstant(
        "Extends {@code VkShaderCreateFlagBitsEXT}.",

        "SHADER_CREATE_DISPATCH_BASE_BIT_EXT".enum(0x00000010)
    )

    EnumConstant(
        "Extends {@code VkShaderCreateFlagBitsEXT}.",

        "SHADER_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_EXT".enum(0x00000020)
    )

    EnumConstant(
        "Extends {@code VkShaderCreateFlagBitsEXT}.",

        "SHADER_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT".enum(0x00000040)
    )

    EnumConstant(
        """
        VkShaderCreateFlagBitsEXT - Bitmask controlling how a shader object is created

        <h5>Description</h5>
        <ul>
            <li>#SHADER_CREATE_LINK_STAGE_BIT_EXT specifies that a shader is linked to all other shaders created in the same #CreateShadersEXT() call whose ##VkShaderCreateInfoEXT structures' {@code flags} include #SHADER_CREATE_LINK_STAGE_BIT_EXT.</li>
            <li>#SHADER_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT specifies that the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#interfaces-builtin-variables-sgs">{@code SubgroupSize}</a> <b>may</b> vary in a task, mesh, or compute shader.</li>
            <li>#SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT specifies that the subgroup sizes <b>must</b> be launched with all invocations active in a task, mesh, or compute shader.</li>
            <li>#SHADER_CREATE_NO_TASK_SHADER_BIT_EXT specifies that a mesh shader <b>must</b> only be used without a task shader. Otherwise, the mesh shader <b>must</b> only be used with a task shader.</li>
            <li>#SHADER_CREATE_DISPATCH_BASE_BIT_EXT specifies that a compute shader <b>can</b> be used with #CmdDispatchBase() with a non-zero base workgroup.</li>
            <li>#SHADER_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_EXT specifies that a fragment shader <b>can</b> be used with a fragment shading rate attachment.</li>
            <li>#SHADER_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT specifies that a fragment shader <b>can</b> be used with a fragment density map attachment.</li>
        </ul>
        """,

        "SHADER_CREATE_LINK_STAGE_BIT_EXT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkShaderCodeTypeEXT - Indicate a shader code type

        <h5>Description</h5>
        <ul>
            <li>#SHADER_CODE_TYPE_BINARY_EXT specifies shader code in an opaque, implementation-defined binary format specific to the physical device.</li>
            <li>#SHADER_CODE_TYPE_SPIRV_EXT specifies shader code in SPIR-V format.</li>
        </ul>

        <h5>See Also</h5>
        ##VkShaderCreateInfoEXT
        """,

        "SHADER_CODE_TYPE_BINARY_EXT".."0",
        "SHADER_CODE_TYPE_SPIRV_EXT".."1"
    )

    VkResult(
        "CreateShadersEXT",
        """
        Create one or more new shaders.

        <h5>C Specification</h5>
        To create one or more shader objects, call:

        <pre><code>
￿VkResult vkCreateShadersEXT(
￿    VkDevice                                    device,
￿    uint32_t                                    createInfoCount,
￿    const VkShaderCreateInfoEXT*                pCreateInfos,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkShaderEXT*                                pShaders);</code></pre>

        <h5>Description</h5>
        When this function returns, whether or not it succeeds, it is guaranteed that every element of {@code pShaders} will have been overwritten by either #NULL_HANDLE or a valid {@code VkShaderEXT} handle.

        This means that whenever shader creation fails, the application <b>can</b> determine which shader the returned error pertains to by locating the first #NULL_HANDLE element in {@code pShaders}. It also means that an application <b>can</b> reliably clean up from a failed call by iterating over the {@code pShaders} array and destroying every element that is not #NULL_HANDLE.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature <b>must</b> be enabled</li>
            <li>If {@code createInfoCount} is 1, there <b>must</b> be no element of {@code pCreateInfos} whose {@code flags} member includes #SHADER_CREATE_LINK_STAGE_BIT_EXT</li>
            <li>If the {@code flags} member of any element of {@code pCreateInfos} includes #SHADER_CREATE_LINK_STAGE_BIT_EXT, the {@code flags} member of all other elements of {@code pCreateInfos} whose {@code stage} is #SHADER_STAGE_VERTEX_BIT, #SHADER_STAGE_TESSELLATION_CONTROL_BIT, #SHADER_STAGE_TESSELLATION_EVALUATION_BIT, #SHADER_STAGE_GEOMETRY_BIT, or #SHADER_STAGE_FRAGMENT_BIT <b>must</b> also include #SHADER_CREATE_LINK_STAGE_BIT_EXT</li>
            <li>If the {@code flags} member of any element of {@code pCreateInfos} includes #SHADER_CREATE_LINK_STAGE_BIT_EXT, the {@code flags} member of all other elements of {@code pCreateInfos} whose {@code stage} is #SHADER_STAGE_TASK_BIT_EXT or #SHADER_STAGE_MESH_BIT_EXT <b>must</b> also include #SHADER_CREATE_LINK_STAGE_BIT_EXT</li>
            <li>If the {@code flags} member of any element of {@code pCreateInfos} whose {@code stage} is #SHADER_STAGE_TASK_BIT_EXT or #SHADER_STAGE_MESH_BIT_EXT includes #SHADER_CREATE_LINK_STAGE_BIT_EXT, there <b>must</b> be no member of {@code pCreateInfos} whose {@code stage} is #SHADER_STAGE_VERTEX_BIT and whose {@code flags} member includes #SHADER_CREATE_LINK_STAGE_BIT_EXT</li>
            <li>If there is any element of {@code pCreateInfos} whose {@code stage} is #SHADER_STAGE_MESH_BIT_EXT and whose {@code flags} member includes both #SHADER_CREATE_LINK_STAGE_BIT_EXT and #SHADER_CREATE_NO_TASK_SHADER_BIT_EXT, there <b>must</b> be no element of {@code pCreateInfos} whose {@code stage} is #SHADER_STAGE_TASK_BIT_EXT and whose {@code flags} member includes #SHADER_CREATE_LINK_STAGE_BIT_EXT</li>
            <li>For each element of {@code pCreateInfos} whose {@code flags} member includes #SHADER_CREATE_LINK_STAGE_BIT_EXT, if there is any other element of {@code pCreateInfos} whose {@code stage} is logically later than the {@code stage} of the former and whose {@code flags} member also includes #SHADER_CREATE_LINK_STAGE_BIT_EXT, the {@code nextStage} of the former <b>must</b> be equal to the {@code stage} of the element with the logically earliest {@code stage} following the {@code stage} of the former whose {@code flags} member also includes #SHADER_CREATE_LINK_STAGE_BIT_EXT</li>
            <li>The {@code stage} member of each element of {@code pCreateInfos} whose {@code flags} member includes #SHADER_CREATE_LINK_STAGE_BIT_EXT <b>must</b> be unique</li>
            <li>The {@code codeType} member of all elements of {@code pCreateInfos} whose {@code flags} member includes #SHADER_CREATE_LINK_STAGE_BIT_EXT <b>must</b> be the same</li>
            <li>If {@code pCreateInfos} contains elements with both #SHADER_STAGE_TESSELLATION_CONTROL_BIT and #SHADER_STAGE_TESSELLATION_EVALUATION_BIT, both elements' {@code flags} include #SHADER_CREATE_LINK_STAGE_BIT_EXT, both elements' {@code codeType} is #SHADER_CODE_TYPE_SPIRV_EXT, and the #SHADER_STAGE_TESSELLATION_CONTROL_BIT stage’s {@code pCode} contains an {@code OpExecutionMode} instruction specifying the type of subdivision, it <b>must</b> match the subdivision type specified in the #SHADER_STAGE_TESSELLATION_EVALUATION_BIT stage</li>
            <li>If {@code pCreateInfos} contains elements with both #SHADER_STAGE_TESSELLATION_CONTROL_BIT and #SHADER_STAGE_TESSELLATION_EVALUATION_BIT, both elements' {@code flags} include #SHADER_CREATE_LINK_STAGE_BIT_EXT, both elements' {@code codeType} is #SHADER_CODE_TYPE_SPIRV_EXT, and the #SHADER_STAGE_TESSELLATION_CONTROL_BIT stage’s {@code pCode} contains an {@code OpExecutionMode} instruction specifying the orientation of triangles, it <b>must</b> match the triangle orientation specified in the #SHADER_STAGE_TESSELLATION_EVALUATION_BIT stage</li>
            <li>If {@code pCreateInfos} contains elements with both #SHADER_STAGE_TESSELLATION_CONTROL_BIT and #SHADER_STAGE_TESSELLATION_EVALUATION_BIT, both elements' {@code flags} include #SHADER_CREATE_LINK_STAGE_BIT_EXT, both elements' {@code codeType} is #SHADER_CODE_TYPE_SPIRV_EXT, and the #SHADER_STAGE_TESSELLATION_CONTROL_BIT stage’s {@code pCode} contains an {@code OpExecutionMode} instruction specifying {@code PointMode}, the #SHADER_STAGE_TESSELLATION_EVALUATION_BIT stage <b>must</b> also contain an {@code OpExecutionMode} instruction specifying {@code PointMode}</li>
            <li>If {@code pCreateInfos} contains elements with both #SHADER_STAGE_TESSELLATION_CONTROL_BIT and #SHADER_STAGE_TESSELLATION_EVALUATION_BIT, both elements' {@code flags} include #SHADER_CREATE_LINK_STAGE_BIT_EXT, both elements' {@code codeType} is #SHADER_CODE_TYPE_SPIRV_EXT, and the #SHADER_STAGE_TESSELLATION_CONTROL_BIT stage’s {@code pCode} contains an {@code OpExecutionMode} instruction specifying the spacing of segments on the edges of tessellated primitives, it <b>must</b> match the segment spacing specified in the #SHADER_STAGE_TESSELLATION_EVALUATION_BIT stage</li>
            <li>If {@code pCreateInfos} contains elements with both #SHADER_STAGE_TESSELLATION_CONTROL_BIT and #SHADER_STAGE_TESSELLATION_EVALUATION_BIT, both elements' {@code flags} include #SHADER_CREATE_LINK_STAGE_BIT_EXT, both elements' {@code codeType} is #SHADER_CODE_TYPE_SPIRV_EXT, and the #SHADER_STAGE_TESSELLATION_CONTROL_BIT stage’s {@code pCode} contains an {@code OpExecutionMode} instruction specifying the output patch size, it <b>must</b> match the output patch size specified in the #SHADER_STAGE_TESSELLATION_EVALUATION_BIT stage</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfos} <b>must</b> be a valid pointer to an array of {@code createInfoCount} valid ##VkShaderCreateInfoEXT structures</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pShaders} <b>must</b> be a valid pointer to an array of {@code createInfoCount} {@code VkShaderEXT} handles</li>
            <li>{@code createInfoCount} <b>must</b> be greater than 0</li>
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
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_INCOMPATIBLE_SHADER_BINARY_EXT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkShaderCreateInfoEXT
        """,

        VkDevice("device", "the logical device that creates the shader objects."),
        AutoSize("pCreateInfos", "pShaders")..uint32_t("createInfoCount", "the length of the {@code pCreateInfos} and {@code pShaders} arrays."),
        VkShaderCreateInfoEXT.const.p("pCreateInfos", "a pointer to an array of ##VkShaderCreateInfoEXT structures."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        VkShaderEXT.p("pShaders", "a pointer to an array of {@code VkShaderEXT} handles in which the resulting shader objects are returned.")
    )

    void(
        "DestroyShaderEXT",
        """
        Destroy a shader object.

        <h5>C Specification</h5>
        To destroy a shader object, call:

        <pre><code>
￿void vkDestroyShaderEXT(
￿    VkDevice                                    device,
￿    VkShaderEXT                                 shader,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Description</h5>
        Destroying a shader object used by one or more command buffers in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording or executable state</a> causes those command buffers to move into the <em>invalid state</em>.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature <b>must</b> be enabled</li>
            <li>All submitted commands that refer to {@code shader} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code shader} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code shader} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code shader} <b>must</b> be a valid {@code VkShaderEXT} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code shader} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code shader} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the shader object."),
        VkShaderEXT("shader", "the handle of the shader object to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "GetShaderBinaryDataEXT",
        """
        Get the binary shader code from a shader object.

        <h5>C Specification</h5>
        Binary shader code <b>can</b> be retrieved from a shader object using the command:

        <pre><code>
￿VkResult vkGetShaderBinaryDataEXT(
￿    VkDevice                                    device,
￿    VkShaderEXT                                 shader,
￿    size_t*                                     pDataSize,
￿    void*                                       pData);</code></pre>

        <h5>Description</h5>
        If {@code pData} is {@code NULL}, then the size of the binary shader code of the shader object, in bytes, is returned in {@code pDataSize}. Otherwise, {@code pDataSize} <b>must</b> point to a variable set by the user to the size of the buffer, in bytes, pointed to by {@code pData}, and on return the variable is overwritten with the amount of data actually written to {@code pData}. If {@code pDataSize} is less than the size of the binary shader code, nothing is written to {@code pData}, and #INCOMPLETE will be returned instead of #SUCCESS.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The behavior of this command when {@code pDataSize} is too small differs from how some other getter-type commands work in Vulkan. Because shader binary data is only usable in its entirety, it would never be useful for the implementation to return partial data. Because of this, nothing is written to {@code pData} unless {@code pDataSize} is large enough to fit the data it its entirety.
        </div>

        Binary shader code retrieved using {@code vkGetShaderBinaryDataEXT} <b>can</b> be passed to a subsequent call to #CreateShadersEXT() on a compatible physical device by specifying #SHADER_CODE_TYPE_BINARY_EXT in the {@code codeType} member of ##VkShaderCreateInfoEXT.

        The shader code returned by repeated calls to this function with the same {@code VkShaderEXT} is guaranteed to be invariant for the lifetime of the {@code VkShaderEXT} object.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature <b>must</b> be enabled</li>
            <li>If {@code pData} is not {@code NULL}, it <b>must</b> be aligned to 16 bytes</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code shader} <b>must</b> be a valid {@code VkShaderEXT} handle</li>
            <li>{@code pDataSize} <b>must</b> be a valid pointer to a {@code size_t} value</li>
            <li>If the value referenced by {@code pDataSize} is not 0, and {@code pData} is not {@code NULL}, {@code pData} <b>must</b> be a valid pointer to an array of {@code pDataSize} bytes</li>
            <li>{@code shader} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device that shader object was created from."),
        VkShaderEXT("shader", "the shader object to retrieve binary shader code from."),
        AutoSize("pData")..Check(1)..size_t.p("pDataSize", "a pointer to a {@code size_t} value related to the size of the binary shader code, as described below."),
        nullable..void.p("pData", "either {@code NULL} or a pointer to a buffer.")
    )

    void(
        "CmdBindShadersEXT",
        """
        Bind shader objects to a command buffer.

        <h5>C Specification</h5>
        Once shader objects have been created, they <b>can</b> be bound to the command buffer using the command:

        <pre><code>
￿void vkCmdBindShadersEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    stageCount,
￿    const VkShaderStageFlagBits*                pStages,
￿    const VkShaderEXT*                          pShaders);</code></pre>

        <h5>Description</h5>
        When binding linked shaders, an application <b>may</b> bind them in any combination of one or more calls to {@code vkCmdBindShadersEXT} (i.e., shaders that were created linked together do not need to be bound in the same {@code vkCmdBindShadersEXT} call).

        Any shader object bound to a particular stage <b>may</b> be unbound by setting its value in {@code pShaders} to #NULL_HANDLE. If {@code pShaders} is {@code NULL}, {@code vkCmdBindShadersEXT} behaves as if {@code pShaders} was an array of {@code stageCount} #NULL_HANDLE values (i.e., any shaders bound to the stages specified in {@code pStages} are unbound).

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature <b>must</b> be enabled</li>
            <li>Every element of {@code pStages} <b>must</b> be unique</li>
            <li>{@code pStages} <b>must</b> not contain #SHADER_STAGE_ALL_GRAPHICS or #SHADER_STAGE_ALL</li>
            <li>{@code pStages} <b>must</b> not contain #SHADER_STAGE_RAYGEN_BIT_KHR, #SHADER_STAGE_ANY_HIT_BIT_KHR, #SHADER_STAGE_CLOSEST_HIT_BIT_KHR, #SHADER_STAGE_MISS_BIT_KHR, #SHADER_STAGE_INTERSECTION_BIT_KHR, or #SHADER_STAGE_CALLABLE_BIT_KHR</li>
            <li>{@code pStages} <b>must</b> not contain #SHADER_STAGE_SUBPASS_SHADING_BIT_HUAWEI</li>
            <li>{@code pStages} <b>must</b> not contain #SHADER_STAGE_CLUSTER_CULLING_BIT_HUAWEI</li>
            <li>For each element of {@code pStages}, if {@code pShaders} is not {@code NULL}, and the element of the {@code pShaders} array with the same index is not #NULL_HANDLE, it <b>must</b> have been created with a {@code stage} equal to the corresponding element of {@code pStages}</li>
            <li>If {@code pStages} contains both #SHADER_STAGE_TASK_BIT_EXT and #SHADER_STAGE_VERTEX_BIT, and {@code pShaders} is not {@code NULL}, and the same index in {@code pShaders} as #SHADER_STAGE_TASK_BIT_EXT in {@code pStages} is not #NULL_HANDLE, the same index in {@code pShaders} as #SHADER_STAGE_VERTEX_BIT in {@code pStages} <b>must</b> be #NULL_HANDLE</li>
            <li>If {@code pStages} contains both #SHADER_STAGE_MESH_BIT_EXT and #SHADER_STAGE_VERTEX_BIT, and {@code pShaders} is not {@code NULL}, and the same index in {@code pShaders} as #SHADER_STAGE_MESH_BIT_EXT in {@code pStages} is not #NULL_HANDLE, the same index in {@code pShaders} as #SHADER_STAGE_VERTEX_BIT in {@code pStages} <b>must</b> be #NULL_HANDLE</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-tessellationShader">{@code tessellationShader}</a> feature is not enabled, and {@code pStages} contains #SHADER_STAGE_TESSELLATION_CONTROL_BIT or #SHADER_STAGE_TESSELLATION_EVALUATION_BIT, and {@code pShaders} is not {@code NULL}, the same index or indices in {@code pShaders} <b>must</b> be #NULL_HANDLE</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-geometryShader">{@code geometryShader}</a> feature is not enabled, and {@code pStages} contains #SHADER_STAGE_GEOMETRY_BIT, and {@code pShaders} is not {@code NULL}, the same index in {@code pShaders} <b>must</b> be #NULL_HANDLE</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-taskShader">{@code taskShader}</a> feature is not enabled, and {@code pStages} contains #SHADER_STAGE_TASK_BIT_EXT, and {@code pShaders} is not {@code NULL}, the same index in {@code pShaders} <b>must</b> be #NULL_HANDLE</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-meshShader">{@code meshShader}</a> feature is not enabled, and {@code pStages} contains #SHADER_STAGE_MESH_BIT_EXT, and {@code pShaders} is not {@code NULL}, the same index in {@code pShaders} <b>must</b> be #NULL_HANDLE</li>
            <li>If {@code pStages} contains #SHADER_STAGE_COMPUTE_BIT, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>If {@code pStages} contains #SHADER_STAGE_VERTEX_BIT, #SHADER_STAGE_TESSELLATION_CONTROL_BIT, #SHADER_STAGE_TESSELLATION_EVALUATION_BIT, #SHADER_STAGE_GEOMETRY_BIT, or #SHADER_STAGE_FRAGMENT_BIT, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>If {@code pStages} contains #SHADER_STAGE_MESH_BIT_EXT or #SHADER_STAGE_TASK_BIT_EXT, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pStages} <b>must</b> be a valid pointer to an array of {@code stageCount} valid {@code VkShaderStageFlagBits} values</li>
            <li>If {@code pShaders} is not {@code NULL}, {@code pShaders} <b>must</b> be a valid pointer to an array of {@code stageCount} valid or #NULL_HANDLE {@code VkShaderEXT} handles</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code stageCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and the elements of {@code pShaders} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer that the shader object will be bound to."),
        AutoSize("pStages", "pShaders")..uint32_t("stageCount", "the length of the {@code pStages} and {@code pShaders} arrays."),
        VkShaderStageFlagBits.const.p("pStages", "a pointer to an array of {@code VkShaderStageFlagBits} values specifying one stage per array index that is affected by the corresponding value in the {@code pShaders} array."),
        VkShaderEXT.const.p("pShaders", "a pointer to an array of {@code VkShaderEXT} handles and/or #NULL_HANDLE values describing the shader binding operations to be performed on each stage in {@code pStages}.")
    )

    void(
        "CmdSetCullModeEXT",
        "See #CmdSetCullMode().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCullModeFlags("cullMode", "specifies the cull mode property to use for drawing.")
    )

    void(
        "CmdSetFrontFaceEXT",
        "See #CmdSetFrontFace().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkFrontFace("frontFace", "a {@code VkFrontFace} value specifying the front-facing triangle orientation to be used for culling.")
    )

    void(
        "CmdSetPrimitiveTopologyEXT",
        "See #CmdSetPrimitiveTopology().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkPrimitiveTopology("primitiveTopology", "specifies the primitive topology to use for drawing.")
    )

    void(
        "CmdSetViewportWithCountEXT",
        "See #CmdSetViewportWithCount().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        AutoSize("pViewports")..uint32_t("viewportCount", "specifies the viewport count."),
        VkViewport.const.p("pViewports", "specifies the viewports to use for drawing.")
    )

    void(
        "CmdSetScissorWithCountEXT",
        "See #CmdSetScissorWithCount().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        AutoSize("pScissors")..uint32_t("scissorCount", "specifies the scissor count."),
        VkRect2D.const.p("pScissors", "specifies the scissors to use for drawing.")
    )

    void(
        "CmdBindVertexBuffers2EXT",
        "See #CmdBindVertexBuffers2().",

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
        "See #CmdSetDepthTestEnable().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("depthTestEnable", "specifies if the depth test is enabled.")
    )

    void(
        "CmdSetDepthWriteEnableEXT",
        "See #CmdSetDepthWriteEnable().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("depthWriteEnable", "specifies if depth writes are enabled.")
    )

    void(
        "CmdSetDepthCompareOpEXT",
        "See #CmdSetDepthCompareOp().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCompareOp("depthCompareOp", "a {@code VkCompareOp} value specifying the comparison operator used for the <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#fragops-depth-comparison\">Depth Comparison</a> step of the <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#fragops-depth\">depth test</a>.")
    )

    void(
        "CmdSetDepthBoundsTestEnableEXT",
        "See #CmdSetDepthBoundsTestEnable().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("depthBoundsTestEnable", "specifies if the depth bounds test is enabled.")
    )

    void(
        "CmdSetStencilTestEnableEXT",
        "See #CmdSetStencilTestEnable().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("stencilTestEnable", "specifies if the stencil test is enabled.")
    )

    void(
        "CmdSetStencilOpEXT",
        "See #CmdSetStencilOp().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkStencilFaceFlags("faceMask", "a bitmask of {@code VkStencilFaceFlagBits} specifying the set of stencil state for which to update the stencil operation."),
        VkStencilOp("failOp", "a {@code VkStencilOp} value specifying the action performed on samples that fail the stencil test."),
        VkStencilOp("passOp", "a {@code VkStencilOp} value specifying the action performed on samples that pass both the depth and stencil tests."),
        VkStencilOp("depthFailOp", "a {@code VkStencilOp} value specifying the action performed on samples that pass the stencil test and fail the depth test."),
        VkCompareOp("compareOp", "a {@code VkCompareOp} value specifying the comparison operator used in the stencil test.")
    )

    void(
        "CmdSetVertexInputEXT",
        """
        Set the vertex input state dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the vertex input attribute and vertex input binding descriptions, call:

        <pre><code>
￿void vkCmdSetVertexInputEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    vertexBindingDescriptionCount,
￿    const VkVertexInputBindingDescription2EXT*  pVertexBindingDescriptions,
￿    uint32_t                                    vertexAttributeDescriptionCount,
￿    const VkVertexInputAttributeDescription2EXT* pVertexAttributeDescriptions);</code></pre>

        <h5>Description</h5>
        This command sets the vertex input attribute and vertex input binding descriptions state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_VERTEX_INPUT_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkGraphicsPipelineCreateInfo{@code ::pVertexInputState} values used to create the currently active pipeline.

        If drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or if the bound pipeline state object was also created with the #DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE dynamic state enabled, then #CmdBindVertexBuffers2() can be used instead of {@code vkCmdSetVertexInputEXT} to dynamically set the stride.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-vertexInputDynamicState">{@code vertexInputDynamicState}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
            <li>{@code vertexBindingDescriptionCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindings}</li>
            <li>{@code vertexAttributeDescriptionCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxVertexInputAttributes}</li>
            <li>For every {@code binding} specified by each element of {@code pVertexAttributeDescriptions}, a ##VkVertexInputBindingDescription2EXT <b>must</b> exist in {@code pVertexBindingDescriptions} with the same value of {@code binding}</li>
            <li>All elements of {@code pVertexBindingDescriptions} <b>must</b> describe distinct binding numbers</li>
            <li>All elements of {@code pVertexAttributeDescriptions} <b>must</b> describe distinct attribute locations</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>If {@code vertexBindingDescriptionCount} is not 0, {@code pVertexBindingDescriptions} <b>must</b> be a valid pointer to an array of {@code vertexBindingDescriptionCount} valid ##VkVertexInputBindingDescription2EXT structures</li>
            <li>If {@code vertexAttributeDescriptionCount} is not 0, {@code pVertexAttributeDescriptions} <b>must</b> be a valid pointer to an array of {@code vertexAttributeDescriptionCount} valid ##VkVertexInputAttributeDescription2EXT structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        <h5>See Also</h5>
        ##VkVertexInputAttributeDescription2EXT, ##VkVertexInputBindingDescription2EXT
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        AutoSize("pVertexBindingDescriptions")..uint32_t("vertexBindingDescriptionCount", "the number of vertex binding descriptions provided in {@code pVertexBindingDescriptions}."),
        nullable..VkVertexInputBindingDescription2EXT.const.p("pVertexBindingDescriptions", "a pointer to an array of ##VkVertexInputBindingDescription2EXT structures."),
        AutoSize("pVertexAttributeDescriptions")..uint32_t("vertexAttributeDescriptionCount", "the number of vertex attribute descriptions provided in {@code pVertexAttributeDescriptions}."),
        nullable..VkVertexInputAttributeDescription2EXT.const.p("pVertexAttributeDescriptions", "a pointer to an array of ##VkVertexInputAttributeDescription2EXT structures.")
    )

    void(
        "CmdSetPatchControlPointsEXT",
        """
        Specify the number of control points per patch dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the number of control points per patch, call:

        <pre><code>
￿void vkCmdSetPatchControlPointsEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    patchControlPoints);</code></pre>

        <h5>Description</h5>
        This command sets the number of control points per patch for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineTessellationStateCreateInfo{@code ::patchControlPoints} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState2PatchControlPoints">{@code extendedDynamicState2PatchControlPoints}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
            <li>{@code patchControlPoints} <b>must</b> be greater than zero and less than or equal to ##VkPhysicalDeviceLimits{@code ::maxTessellationPatchSize}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("patchControlPoints", "specifies the number of control points per patch.")
    )

    void(
        "CmdSetRasterizerDiscardEnableEXT",
        "See #CmdSetRasterizerDiscardEnable().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("rasterizerDiscardEnable", "controls whether primitives are discarded immediately before the rasterization stage.")
    )

    void(
        "CmdSetDepthBiasEnableEXT",
        "See #CmdSetDepthBiasEnable().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("depthBiasEnable", "controls whether to bias fragment depth values.")
    )

    void(
        "CmdSetLogicOpEXT",
        """
        Select which logical operation to apply for blend state dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the logical operation to apply for blend state, call:

        <pre><code>
￿void vkCmdSetLogicOpEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkLogicOp                                   logicOp);</code></pre>

        <h5>Description</h5>
        This command sets the logical operation for blend state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_LOGIC_OP_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineColorBlendStateCreateInfo{@code ::logicOp} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState2LogicOp">{@code extendedDynamicState2LogicOp}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code logicOp} <b>must</b> be a valid {@code VkLogicOp} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkLogicOp("logicOp", "specifies the logical operation to apply for blend state.")
    )

    void(
        "CmdSetPrimitiveRestartEnableEXT",
        "See #CmdSetPrimitiveRestartEnable().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("primitiveRestartEnable", "controls whether a special vertex index value is treated as restarting the assembly of primitives. It behaves in the same way as ##VkPipelineInputAssemblyStateCreateInfo{@code ::primitiveRestartEnable}")
    )

    void(
        "CmdSetTessellationDomainOriginEXT",
        """
        Specify the origin of the tessellation domain space dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the origin of the tessellation domain space, call:

        <pre><code>
￿void vkCmdSetTessellationDomainOriginEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkTessellationDomainOrigin                  domainOrigin);</code></pre>

        <h5>Description</h5>
        This command sets the origin of the tessellation domain space for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineTessellationDomainOriginStateCreateInfo{@code ::domainOrigin} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3TessellationDomainOrigin">{@code extendedDynamicState3TessellationDomainOrigin}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code domainOrigin} <b>must</b> be a valid {@code VkTessellationDomainOrigin} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkTessellationDomainOrigin("domainOrigin", "specifies the origin of the tessellation domain space.")
    )

    void(
        "CmdSetDepthClampEnableEXT",
        """
        Specify dynamically whether depth clamping is enabled in the command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> enable or disable depth clamping, call:

        <pre><code>
￿void vkCmdSetDepthClampEnableEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    depthClampEnable);</code></pre>

        <h5>Description</h5>
        This command sets whether depth clamping is enabled or disabled for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineRasterizationStateCreateInfo{@code ::depthClampEnable} value used to create the currently active pipeline.

        If the depth clamping state is changed dynamically, and the pipeline was not created with #DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT enabled, then depth clipping is enabled when depth clamping is disabled and vice versa.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3DepthClampEnable">{@code extendedDynamicState3DepthClampEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-depthClamp">{@code depthClamp}</a> feature is not enabled, {@code depthClampEnable} must be #FALSE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("depthClampEnable", "specifies whether depth clamping is enabled.")
    )

    void(
        "CmdSetPolygonModeEXT",
        """
        Specify polygon mode dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the polygon mode, call:

        <pre><code>
￿void vkCmdSetPolygonModeEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPolygonMode                               polygonMode);</code></pre>

        <h5>Description</h5>
        This command sets the polygon mode for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_POLYGON_MODE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineRasterizationStateCreateInfo{@code ::polygonMode} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3PolygonMode">{@code extendedDynamicState3PolygonMode}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-fillModeNonSolid">{@code fillModeNonSolid}</a> feature is not enabled, {@code polygonMode} <b>must</b> be #POLYGON_MODE_FILL or #POLYGON_MODE_FILL_RECTANGLE_NV</li>
            <li>If the {@link NVFillRectangle VK_NV_fill_rectangle} extension is not enabled, {@code polygonMode} <b>must</b> not be #POLYGON_MODE_FILL_RECTANGLE_NV</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code polygonMode} <b>must</b> be a valid {@code VkPolygonMode} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkPolygonMode("polygonMode", "specifies polygon mode.")
    )

    void(
        "CmdSetRasterizationSamplesEXT",
        """
        Specify the rasterization samples dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the {@code rasterizationSamples}, call:

        <pre><code>
￿void vkCmdSetRasterizationSamplesEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkSampleCountFlagBits                       rasterizationSamples);</code></pre>

        <h5>Description</h5>
        This command sets the {@code rasterizationSamples} for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineMultisampleStateCreateInfo{@code ::rasterizationSamples} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3RasterizationSamples">{@code extendedDynamicState3RasterizationSamples}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code rasterizationSamples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkSampleCountFlagBits("rasterizationSamples", "specifies {@code rasterizationSamples}.")
    )

    void(
        "CmdSetSampleMaskEXT",
        """
        Specify the sample mask dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the sample mask, call:

        <pre><code>
￿void vkCmdSetSampleMaskEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkSampleCountFlagBits                       samples,
￿    const VkSampleMask*                         pSampleMask);</code></pre>

        <h5>Description</h5>
        This command sets the sample mask for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_SAMPLE_MASK_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineMultisampleStateCreateInfo{@code ::pSampleMask} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3SampleMask">{@code extendedDynamicState3SampleMask}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
            <li>{@code pSampleMask} <b>must</b> be a valid pointer to an array of \lceil{\mathit{samples} \over 32}\rceil {@code VkSampleMask} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkSampleCountFlagBits("samples", "specifies the number of sample bits in the {@code pSampleMask}."),
        Unsafe..VkSampleMask.const.p("pSampleMask", "a pointer to an array of {@code VkSampleMask} values, where the array size is based on the {@code samples} parameter.")
    )

    void(
        "CmdSetAlphaToCoverageEnableEXT",
        """
        Specify the alpha to coverage enable state dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the {@code alphaToCoverageEnable} state, call:

        <pre><code>
￿void vkCmdSetAlphaToCoverageEnableEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    alphaToCoverageEnable);</code></pre>

        <h5>Description</h5>
        This command sets the {@code alphaToCoverageEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineMultisampleStateCreateInfo{@code ::alphaToCoverageEnable} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3AlphaToCoverageEnable">{@code extendedDynamicState3AlphaToCoverageEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("alphaToCoverageEnable", "specifies the {@code alphaToCoverageEnable} state.")
    )

    void(
        "CmdSetAlphaToOneEnableEXT",
        """
        Specify the alpha to one enable state dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the {@code alphaToOneEnable} state, call:

        <pre><code>
￿void vkCmdSetAlphaToOneEnableEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    alphaToOneEnable);</code></pre>

        <h5>Description</h5>
        This command sets the {@code alphaToOneEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineMultisampleStateCreateInfo{@code ::alphaToOneEnable} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3AlphaToOneEnable">{@code extendedDynamicState3AlphaToOneEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-alphaToOne">{@code alphaToOne}</a> feature is not enabled, {@code alphaToOneEnable} <b>must</b> be #FALSE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("alphaToOneEnable", "specifies the {@code alphaToOneEnable} state.")
    )

    void(
        "CmdSetLogicOpEnableEXT",
        """
        Specify dynamically whether logical operations are enabled for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> whether logical operations are enabled, call:

        <pre><code>
￿void vkCmdSetLogicOpEnableEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    logicOpEnable);</code></pre>

        <h5>Description</h5>
        This command sets whether logical operations are enabled for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineColorBlendStateCreateInfo{@code ::logicOpEnable} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3LogicOpEnable">{@code extendedDynamicState3LogicOpEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-logicOp">{@code logicOp}</a> feature is not enabled, {@code logicOpEnable} <b>must</b> be #FALSE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("logicOpEnable", "specifies whether logical operations are enabled.")
    )

    void(
        "CmdSetColorBlendEnableEXT",
        """
        Specify the {@code blendEnable} for each attachment dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> {@code blendEnable}, call:

        <pre><code>
￿void vkCmdSetColorBlendEnableEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstAttachment,
￿    uint32_t                                    attachmentCount,
￿    const VkBool32*                             pColorBlendEnables);</code></pre>

        <h5>Description</h5>
        This command sets the color blending enable of the specified color attachments for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineColorBlendAttachmentState{@code ::blendEnable} values used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3ColorBlendEnable">{@code extendedDynamicState3ColorBlendEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pColorBlendEnables} <b>must</b> be a valid pointer to an array of {@code attachmentCount} {@code VkBool32} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code attachmentCount} <b>must</b> be greater than 0</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("firstAttachment", "the first color attachment the color blending enable applies."),
        AutoSize("pColorBlendEnables")..uint32_t("attachmentCount", "the number of color blending enables in the {@code pColorBlendEnables} array."),
        VkBool32.const.p("pColorBlendEnables", "an array of booleans to indicate whether color blending is enabled for the corresponding attachment.")
    )

    void(
        "CmdSetColorBlendEquationEXT",
        """
        Specify the blend factors and operations dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> color blend factors and operations, call:

        <pre><code>
￿void vkCmdSetColorBlendEquationEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstAttachment,
￿    uint32_t                                    attachmentCount,
￿    const VkColorBlendEquationEXT*              pColorBlendEquations);</code></pre>

        <h5>Description</h5>
        This command sets the color blending factors and operations of the specified attachments for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineColorBlendAttachmentState{@code ::srcColorBlendFactor}, ##VkPipelineColorBlendAttachmentState{@code ::dstColorBlendFactor}, ##VkPipelineColorBlendAttachmentState{@code ::colorBlendOp}, ##VkPipelineColorBlendAttachmentState{@code ::srcAlphaBlendFactor}, ##VkPipelineColorBlendAttachmentState{@code ::dstAlphaBlendFactor}, and ##VkPipelineColorBlendAttachmentState{@code ::alphaBlendOp} values used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3ColorBlendEquation">{@code extendedDynamicState3ColorBlendEquation}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pColorBlendEquations} <b>must</b> be a valid pointer to an array of {@code attachmentCount} valid ##VkColorBlendEquationEXT structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code attachmentCount} <b>must</b> be greater than 0</li>
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

        <h5>See Also</h5>
        ##VkColorBlendEquationEXT
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("firstAttachment", "the first color attachment the color blend factors and operations apply to."),
        AutoSize("pColorBlendEquations")..uint32_t("attachmentCount", "the number of ##VkColorBlendEquationEXT elements in the {@code pColorBlendEquations} array."),
        VkColorBlendEquationEXT.const.p("pColorBlendEquations", "an array of ##VkColorBlendEquationEXT structs that specify the color blend factors and operations for the corresponding attachments.")
    )

    void(
        "CmdSetColorWriteMaskEXT",
        """
        Specify the color write masks for each attachment dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the color write masks, call:

        <pre><code>
￿void vkCmdSetColorWriteMaskEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstAttachment,
￿    uint32_t                                    attachmentCount,
￿    const VkColorComponentFlags*                pColorWriteMasks);</code></pre>

        <h5>Description</h5>
        This command sets the color write masks of the specified attachments for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_COLOR_WRITE_MASK_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineColorBlendAttachmentState{@code ::colorWriteMask} values used to create the currently active pipeline.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Formats with bits that are shared between components specified by {@code VkColorComponentFlagBits}, such as #FORMAT_E5B9G9R9_UFLOAT_PACK32, cannot have their channels individually masked by this functionality; either all components that share bits have to be enabled, or none of them.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3ColorWriteMask">{@code extendedDynamicState3ColorWriteMask}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pColorWriteMasks} <b>must</b> be a valid pointer to an array of {@code attachmentCount} valid combinations of {@code VkColorComponentFlagBits} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code attachmentCount} <b>must</b> be greater than 0</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("firstAttachment", "the first color attachment the color write masks apply to."),
        AutoSize("pColorWriteMasks")..uint32_t("attachmentCount", "the number of {@code VkColorComponentFlags} values in the {@code pColorWriteMasks} array."),
        VkColorComponentFlags.const.p("pColorWriteMasks", "an array of {@code VkColorComponentFlags} values that specify the color write masks of the corresponding attachments.")
    )

    void(
        "CmdSetRasterizationStreamEXT",
        """
        Specify the rasterization stream dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the {@code rasterizationStream} state, call:

        <pre><code>
￿void vkCmdSetRasterizationStreamEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    rasterizationStream);</code></pre>

        <h5>Description</h5>
        This command sets the {@code rasterizationStream} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_RASTERIZATION_STREAM_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineRasterizationStateStreamCreateInfoEXT{@code ::rasterizationStream} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3RasterizationStream">{@code extendedDynamicState3RasterizationStream}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-transformFeedback">{@code transformFeedback}</a> feature <b>must</b> be enabled</li>
            <li>{@code rasterizationStream} <b>must</b> be less than ##VkPhysicalDeviceTransformFeedbackPropertiesEXT{@code ::maxTransformFeedbackStreams}</li>
            <li>{@code rasterizationStream} <b>must</b> be zero if ##VkPhysicalDeviceTransformFeedbackPropertiesEXT{@code ::transformFeedbackRasterizationStreamSelect} is #FALSE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("rasterizationStream", "specifies the {@code rasterizationStream} state.")
    )

    void(
        "CmdSetConservativeRasterizationModeEXT",
        """
        Specify the conservative rasterization mode dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the {@code conservativeRasterizationMode}, call:

        <pre><code>
￿void vkCmdSetConservativeRasterizationModeEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkConservativeRasterizationModeEXT          conservativeRasterizationMode);</code></pre>

        <h5>Description</h5>
        This command sets the {@code conservativeRasterizationMode} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineRasterizationConservativeStateCreateInfoEXT{@code ::conservativeRasterizationMode} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3ConservativeRasterizationMode">{@code extendedDynamicState3ConservativeRasterizationMode}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code conservativeRasterizationMode} <b>must</b> be a valid {@code VkConservativeRasterizationModeEXT} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkConservativeRasterizationModeEXT("conservativeRasterizationMode", "specifies the {@code conservativeRasterizationMode} state.")
    )

    void(
        "CmdSetExtraPrimitiveOverestimationSizeEXT",
        """
        Specify the conservative rasterization extra primitive overestimation size dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the {@code extraPrimitiveOverestimationSize}, call:

        <pre><code>
￿void vkCmdSetExtraPrimitiveOverestimationSizeEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    float                                       extraPrimitiveOverestimationSize);</code></pre>

        <h5>Description</h5>
        This command sets the {@code extraPrimitiveOverestimationSize} for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineRasterizationConservativeStateCreateInfoEXT{@code ::extraPrimitiveOverestimationSize} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3ExtraPrimitiveOverestimationSize">{@code extendedDynamicState3ExtraPrimitiveOverestimationSize}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
            <li>{@code extraPrimitiveOverestimationSize} <b>must</b> be in the range of {@code 0.0} to ##VkPhysicalDeviceConservativeRasterizationPropertiesEXT{@code ::maxExtraPrimitiveOverestimationSize} inclusive</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        float("extraPrimitiveOverestimationSize", "specifies the {@code extraPrimitiveOverestimationSize}.")
    )

    void(
        "CmdSetDepthClipEnableEXT",
        """
        Specify dynamically whether depth clipping is enabled in the command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> enable or disable depth clipping, call:

        <pre><code>
￿void vkCmdSetDepthClipEnableEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    depthClipEnable);</code></pre>

        <h5>Description</h5>
        This command sets whether depth clipping is enabled or disabled for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineRasterizationDepthClipStateCreateInfoEXT{@code ::depthClipEnable} value used to create the currently active pipeline, or is set to the inverse of ##VkPipelineRasterizationStateCreateInfo{@code ::depthClampEnable} if ##VkPipelineRasterizationDepthClipStateCreateInfoEXT is not specified.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3DepthClipEnable">{@code extendedDynamicState3DepthClipEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-depthClipEnable">{@code depthClipEnable}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("depthClipEnable", "specifies whether depth clipping is enabled.")
    )

    void(
        "CmdSetSampleLocationsEnableEXT",
        """
        Specify the samples locations enable state dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the {@code sampleLocationsEnable} state, call:

        <pre><code>
￿void vkCmdSetSampleLocationsEnableEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    sampleLocationsEnable);</code></pre>

        <h5>Description</h5>
        This command sets the {@code sampleLocationsEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineSampleLocationsStateCreateInfoEXT{@code ::sampleLocationsEnable} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3SampleLocationsEnable">{@code extendedDynamicState3SampleLocationsEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("sampleLocationsEnable", "specifies the {@code sampleLocationsEnable} state.")
    )

    void(
        "CmdSetColorBlendAdvancedEXT",
        """
        Specify the advanced color blend state dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the advanced blend state, call:

        <pre><code>
￿void vkCmdSetColorBlendAdvancedEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstAttachment,
￿    uint32_t                                    attachmentCount,
￿    const VkColorBlendAdvancedEXT*              pColorBlendAdvanced);</code></pre>

        <h5>Description</h5>
        This command sets the advanced blend operation parameters of the specified attachments for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineColorBlendAdvancedStateCreateInfoEXT{@code ::srcPremultiplied}, ##VkPipelineColorBlendAdvancedStateCreateInfoEXT{@code ::dstPremultiplied}, and ##VkPipelineColorBlendAdvancedStateCreateInfoEXT{@code ::blendOverlap} values used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3ColorBlendAdvanced">{@code extendedDynamicState3ColorBlendAdvanced}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pColorBlendAdvanced} <b>must</b> be a valid pointer to an array of {@code attachmentCount} valid ##VkColorBlendAdvancedEXT structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code attachmentCount} <b>must</b> be greater than 0</li>
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

        <h5>See Also</h5>
        ##VkColorBlendAdvancedEXT
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("firstAttachment", "the first color attachment the advanced blend parameters apply to."),
        AutoSize("pColorBlendAdvanced")..uint32_t("attachmentCount", "the number of ##VkColorBlendAdvancedEXT elements in the {@code pColorBlendAdvanced} array."),
        VkColorBlendAdvancedEXT.const.p("pColorBlendAdvanced", "an array of ##VkColorBlendAdvancedEXT structs that specify the advanced color blend parameters for the corresponding attachments.")
    )

    void(
        "CmdSetProvokingVertexModeEXT",
        """
        Specify the provoking vertex mode dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the {@code provokingVertexMode} state, call:

        <pre><code>
￿void vkCmdSetProvokingVertexModeEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkProvokingVertexModeEXT                    provokingVertexMode);</code></pre>

        <h5>Description</h5>
        This command sets the {@code provokingVertexMode} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineRasterizationProvokingVertexStateCreateInfoEXT{@code ::provokingVertexMode} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3ProvokingVertexMode">{@code extendedDynamicState3ProvokingVertexMode}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
            <li>If {@code provokingVertexMode} is #PROVOKING_VERTEX_MODE_LAST_VERTEX_EXT, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-provokingVertexLast">{@code provokingVertexLast}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code provokingVertexMode} <b>must</b> be a valid {@code VkProvokingVertexModeEXT} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkProvokingVertexModeEXT("provokingVertexMode", "specifies the {@code provokingVertexMode} state.")
    )

    void(
        "CmdSetLineRasterizationModeEXT",
        """
        Specify the line rasterization mode dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the {@code lineRasterizationMode} state, call:

        <pre><code>
￿void vkCmdSetLineRasterizationModeEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkLineRasterizationModeEXT                  lineRasterizationMode);</code></pre>

        <h5>Description</h5>
        This command sets the {@code lineRasterizationMode} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineRasterizationLineStateCreateInfoEXT{@code ::lineRasterizationMode} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3LineRasterizationMode">{@code extendedDynamicState3LineRasterizationMode}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
            <li>If {@code lineRasterizationMode} is #LINE_RASTERIZATION_MODE_RECTANGULAR_EXT, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-rectangularLines">{@code rectangularLines}</a> feature <b>must</b> be enabled</li>
            <li>If {@code lineRasterizationMode} is #LINE_RASTERIZATION_MODE_BRESENHAM_EXT, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-bresenhamLines">{@code bresenhamLines}</a> feature <b>must</b> be enabled</li>
            <li>If {@code lineRasterizationMode} is #LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-smoothLines">{@code smoothLines}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code lineRasterizationMode} <b>must</b> be a valid {@code VkLineRasterizationModeEXT} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkLineRasterizationModeEXT("lineRasterizationMode", "specifies the {@code lineRasterizationMode} state.")
    )

    void(
        "CmdSetLineStippleEnableEXT",
        """
        Specify the line stipple enable dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the {@code stippledLineEnable} state, call:

        <pre><code>
￿void vkCmdSetLineStippleEnableEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    stippledLineEnable);</code></pre>

        <h5>Description</h5>
        This command sets the {@code stippledLineEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineRasterizationLineStateCreateInfoEXT{@code ::stippledLineEnable} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3LineStippleEnable">{@code extendedDynamicState3LineStippleEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("stippledLineEnable", "specifies the {@code stippledLineEnable} state.")
    )

    void(
        "CmdSetDepthClipNegativeOneToOneEXT",
        """
        Specify the negative one to one depth clip mode dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> {@code negativeOneToOne}, call:

        <pre><code>
￿void vkCmdSetDepthClipNegativeOneToOneEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    negativeOneToOne);</code></pre>

        <h5>Description</h5>
        This command sets the {@code negativeOneToOne} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineViewportDepthClipControlCreateInfoEXT{@code ::negativeOneToOne} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3DepthClipNegativeOneToOne">{@code extendedDynamicState3DepthClipNegativeOneToOne}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-depthClipControl">{@code depthClipControl}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("negativeOneToOne", "specifies the {@code negativeOneToOne} state.")
    )

    DependsOn("VK_NV_clip_space_w_scaling")..void(
        "CmdSetViewportWScalingEnableNV",
        """
        Specify the viewport W scaling enable state dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the {@code viewportWScalingEnable} state, call:

        <pre><code>
￿void vkCmdSetViewportWScalingEnableNV(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    viewportWScalingEnable);</code></pre>

        <h5>Description</h5>
        This command sets the {@code viewportWScalingEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineViewportWScalingStateCreateInfoNV{@code ::viewportWScalingEnable} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3ViewportWScalingEnable">{@code extendedDynamicState3ViewportWScalingEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("viewportWScalingEnable", "specifies the {@code viewportWScalingEnable} state.")
    )

    DependsOn("VK_NV_viewport_swizzle")..void(
        "CmdSetViewportSwizzleNV",
        """
        Specify the viewport swizzle state dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the viewport swizzle state, call:

        <pre><code>
￿void vkCmdSetViewportSwizzleNV(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstViewport,
￿    uint32_t                                    viewportCount,
￿    const VkViewportSwizzleNV*                  pViewportSwizzles);</code></pre>

        <h5>Description</h5>
        This command sets the viewport swizzle state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineViewportSwizzleStateCreateInfoNV{@code ::viewportCount}, and ##VkPipelineViewportSwizzleStateCreateInfoNV{@code ::pViewportSwizzles} values used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3ViewportSwizzle">{@code extendedDynamicState3ViewportSwizzle}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pViewportSwizzles} <b>must</b> be a valid pointer to an array of {@code viewportCount} valid ##VkViewportSwizzleNV structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code viewportCount} <b>must</b> be greater than 0</li>
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

        <h5>See Also</h5>
        ##VkViewportSwizzleNV
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("firstViewport", "the index of the first viewport whose parameters are updated by the command."),
        AutoSize("pViewportSwizzles")..uint32_t("viewportCount", "the number of viewports whose parameters are updated by the command."),
        VkViewportSwizzleNV.const.p("pViewportSwizzles", "a pointer to an array of ##VkViewportSwizzleNV structures specifying viewport swizzles.")
    )

    DependsOn("VK_NV_fragment_coverage_to_color")..void(
        "CmdSetCoverageToColorEnableNV",
        """
        Specify the coverage to color enable state dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the {@code coverageToColorEnable} state, call:

        <pre><code>
￿void vkCmdSetCoverageToColorEnableNV(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    coverageToColorEnable);</code></pre>

        <h5>Description</h5>
        This command sets the {@code coverageToColorEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineCoverageToColorStateCreateInfoNV{@code ::coverageToColorEnable} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3CoverageToColorEnable">{@code extendedDynamicState3CoverageToColorEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("coverageToColorEnable", "specifies the {@code coverageToColorEnable} state.")
    )

    DependsOn("VK_NV_fragment_coverage_to_color")..void(
        "CmdSetCoverageToColorLocationNV",
        """
        Specify the coverage to color location dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the {@code coverageToColorLocation} state, call:

        <pre><code>
￿void vkCmdSetCoverageToColorLocationNV(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    coverageToColorLocation);</code></pre>

        <h5>Description</h5>
        This command sets the {@code coverageToColorLocation} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineCoverageToColorStateCreateInfoNV{@code ::coverageToColorLocation} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3CoverageToColorLocation">{@code extendedDynamicState3CoverageToColorLocation}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("coverageToColorLocation", "specifies the {@code coverageToColorLocation} state.")
    )

    DependsOn("VK_NV_framebuffer_mixed_samples")..void(
        "CmdSetCoverageModulationModeNV",
        """
        Specify the coverage modulation mode dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the {@code coverageModulationMode} state, call:

        <pre><code>
￿void vkCmdSetCoverageModulationModeNV(
￿    VkCommandBuffer                             commandBuffer,
￿    VkCoverageModulationModeNV                  coverageModulationMode);</code></pre>

        <h5>Description</h5>
        This command sets the {@code coverageModulationMode} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or the graphics pipeline is created with #DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineCoverageModulationStateCreateInfoNV{@code ::coverageModulationMode} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3CoverageModulationMode">{@code extendedDynamicState3CoverageModulationMode}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code coverageModulationMode} <b>must</b> be a valid {@code VkCoverageModulationModeNV} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCoverageModulationModeNV("coverageModulationMode", "specifies the {@code coverageModulationMode} state.")
    )

    DependsOn("VK_NV_framebuffer_mixed_samples")..void(
        "CmdSetCoverageModulationTableEnableNV",
        """
        Specify the coverage modulation table enable state dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the {@code coverageModulationTableEnable} state, call:

        <pre><code>
￿void vkCmdSetCoverageModulationTableEnableNV(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    coverageModulationTableEnable);</code></pre>

        <h5>Description</h5>
        This command sets the {@code coverageModulationTableEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineCoverageModulationStateCreateInfoNV{@code ::coverageModulationTableEnable} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3CoverageModulationTableEnable">{@code extendedDynamicState3CoverageModulationTableEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("coverageModulationTableEnable", "specifies the {@code coverageModulationTableEnable} state.")
    )

    DependsOn("VK_NV_framebuffer_mixed_samples")..void(
        "CmdSetCoverageModulationTableNV",
        """
        Specify the coverage modulation table dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the {@code pCoverageModulationTable} state, call:

        <pre><code>
￿void vkCmdSetCoverageModulationTableNV(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    coverageModulationTableCount,
￿    const float*                                pCoverageModulationTable);</code></pre>

        <h5>Description</h5>
        This command sets the table of modulation factors for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineCoverageModulationStateCreateInfoNV{@code ::coverageModulationTableCount}, and ##VkPipelineCoverageModulationStateCreateInfoNV{@code ::pCoverageModulationTable} values used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3CoverageModulationTable">{@code extendedDynamicState3CoverageModulationTable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pCoverageModulationTable} <b>must</b> be a valid pointer to an array of {@code coverageModulationTableCount} {@code float} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code coverageModulationTableCount} <b>must</b> be greater than 0</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        AutoSize("pCoverageModulationTable")..uint32_t("coverageModulationTableCount", "specifies the number of elements in {@code pCoverageModulationTable}."),
        float.const.p("pCoverageModulationTable", "specifies the table of modulation factors containing a value for each number of covered samples.")
    )

    DependsOn("VK_NV_shading_rate_image")..void(
        "CmdSetShadingRateImageEnableNV",
        """
        Specify the shading rate image enable state dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the {@code shadingRateImageEnable} state, call:

        <pre><code>
￿void vkCmdSetShadingRateImageEnableNV(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    shadingRateImageEnable);</code></pre>

        <h5>Description</h5>
        This command sets the {@code shadingRateImageEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineViewportShadingRateImageStateCreateInfoNV{@code ::shadingRateImageEnable} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3ShadingRateImageEnable">{@code extendedDynamicState3ShadingRateImageEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("shadingRateImageEnable", "specifies the {@code shadingRateImageEnable} state.")
    )

    DependsOn("VK_NV_representative_fragment_test")..void(
        "CmdSetRepresentativeFragmentTestEnableNV",
        """
        Specify the representative fragment test enable dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the {@code representativeFragmentTestEnable} state, call:

        <pre><code>
￿void vkCmdSetRepresentativeFragmentTestEnableNV(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    representativeFragmentTestEnable);</code></pre>

        <h5>Description</h5>
        This command sets the {@code representativeFragmentTestEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineRepresentativeFragmentTestStateCreateInfoNV{@code ::representativeFragmentTestEnable} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3RepresentativeFragmentTestEnable">{@code extendedDynamicState3RepresentativeFragmentTestEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("representativeFragmentTestEnable", "specifies the {@code representativeFragmentTestEnable} state.")
    )

    DependsOn("VK_NV_coverage_reduction_mode")..void(
        "CmdSetCoverageReductionModeNV",
        """
        Specify the coverage reduction mode dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the {@code coverageReductionMode} state, call:

        <pre><code>
￿void vkCmdSetCoverageReductionModeNV(
￿    VkCommandBuffer                             commandBuffer,
￿    VkCoverageReductionModeNV                   coverageReductionMode);</code></pre>

        <h5>Description</h5>
        This command sets the {@code coverageReductionMode} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineCoverageReductionStateCreateInfoNV{@code ::coverageReductionMode} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState3CoverageReductionMode">{@code extendedDynamicState3CoverageReductionMode}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code coverageReductionMode} <b>must</b> be a valid {@code VkCoverageReductionModeNV} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCoverageReductionModeNV("coverageReductionMode", "specifies the {@code coverageReductionMode} state.")
    )
}