/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_descriptor_indexing = "EXTDescriptorIndexing".nativeClassVK("EXT_descriptor_indexing", type = "device", postfix = EXT) {
    documentation =
        """
        This extension adds several small features which together enable applications to create large descriptor sets containing substantially all of their resources, and selecting amongst those resources with dynamic (non-uniform) indexes in the shader. There are feature enables and SPIR-V capabilities for non-uniform descriptor indexing in the shader, and non-uniform indexing in the shader requires use of a new {@code NonUniformEXT} decoration defined in the {@code SPV_EXT_descriptor_indexing} SPIR-V extension. There are descriptor set layout binding creation flags enabling several features:

        <ul>
            <li>Descriptors can be updated after they are bound to a command buffer, such that the execution of the command buffer reflects the most recent update to the descriptors.</li>
            <li>Descriptors that are not used by any pending command buffers can be updated, which enables writing new descriptors for frame N+1 while frame N is executing.</li>
            <li>Relax the requirement that all descriptors in a binding that is “statically used” must be valid, such that descriptors that are not accessed by a submission need not be valid and can be updated while that submission is executing.</li>
            <li>The final binding in a descriptor set layout can have a variable size (and unsized arrays of resources are allowed in the GL_EXT_nonuniform_qualifier and SPV_EXT_descriptor_indexing extensions).</li>
        </ul>

        Note that it is valid for multiple descriptor arrays in a shader to use the same set and binding number, as long as they are all compatible with the descriptor type in the pipeline layout. This means a single array binding in the descriptor set can serve multiple texture dimensionalities, or an array of buffer descriptors can be used with multiple different block layouts.

        There are new descriptor set layout and descriptor pool creation flags that are required to opt in to the update-after-bind functionality, and there are separate {@code maxPerStage}* and {@code maxDescriptorSet}* limits that apply to these descriptor set layouts which <b>may</b> be much higher than the pre-existing limits. The old limits only count descriptors in non-updateAfterBind descriptor set layouts, and the new limits count descriptors in all descriptor set layouts in the pipeline layout.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_descriptor_indexing}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>162</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
                <li>Requires {@link KHRMaintenance3 VK_KHR_maintenance3}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_descriptor_indexing:%20&amp;body=@jeffbolznv%20">jeffbolznv</a></li>
            </ul></dd>

            <dt><b>Status</b></dt>
            <dd>Complete</dd>

            <dt><b>Last Modified Data</b></dt>
            <dd>2017-10-02</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Daniel Rakos, AMD</li>
                <li>Slawomir Grajewski, Intel</li>
                <li>Tobias Hector, Imagination Technologies</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_DESCRIPTOR_INDEXING_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EXT_DESCRIPTOR_INDEXING_EXTENSION_NAME".."VK_EXT_descriptor_indexing"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO_EXT".."1000161000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES_EXT".."1000161001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES_EXT".."1000161002",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO_EXT".."1000161003",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT_EXT".."1000161004"
    )

    EnumConstant(
        "Extends {@code VkDescriptorPoolCreateFlagBits}.",

        "DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT_EXT".enum(0x00000002)
    )

    EnumConstant(
        "Extends {@code VkDescriptorSetLayoutCreateFlagBits}.",

        "DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT".enum(0x00000002)
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "ERROR_FRAGMENTATION_EXT".."-1000161000"
    )

    EnumConstant(
        """
        VkDescriptorBindingFlagBitsEXT - Bitmask specifying descriptor set layout binding properties

        <h5>Description</h5>
        <ul>
            <li>#DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT indicates that if descriptors in this binding are updated between when the descriptor set is bound in a command buffer and when that command buffer is submitted to a queue, then the submission will use the most recently set descriptors for this binding and the updates do not invalidate the command buffer. Descriptor bindings created with this flag are also partially exempt from the external synchronization requirement in #UpdateDescriptorSetWithTemplateKHR() and #UpdateDescriptorSets(). They <b>can</b> be updated concurrently with the set being bound to a command buffer in another thread, but not concurrently with the set being reset or freed.</li>
            <li>#DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT indicates that descriptors in this binding that are not <em>dynamically used</em> need not contain valid descriptors at the time the descriptors are consumed. A descriptor is dynamically used if any shader invocation executes an instruction that performs any memory access using the descriptor.</li>
            <li>#DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT indicates that descriptors in this binding <b>can</b> be updated after a command buffer has bound this descriptor set, or while a command buffer that uses this descriptor set is pending execution, as long as the descriptors that are updated are not used by those command buffers. If #DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT is also set, then descriptors <b>can</b> be updated as long as they are not dynamically used by any shader invocations. If #DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT is not set, then descriptors <b>can</b> be updated as long as they are not statically used by any shader invocations.</li>
            <li>#DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT indicates that this descriptor binding has a variable size that will be specified when a descriptor set is allocated using this layout. The value of {@code descriptorCount} is treated as an upper bound on the size of the binding. This <b>must</b> only be used for the last binding in the descriptor set layout (i.e. the binding with the largest value of {@code binding}). For the purposes of counting against limits such as {@code maxDescriptorSet}* and {@code maxPerStageDescriptor}*, the full value of {@code descriptorCount} is counted , except for descriptor bindings with a descriptor type of #DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT where {@code descriptorCount} specifies the upper bound on the byte size of the binding, thus it counts against the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#features-limits-maxInlineUniformBlockSize">{@code maxInlineUniformBlockSize}</a> limit instead. .</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Note that while #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT and #DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT both involve updates to descriptor sets after they are bound, #DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT is a weaker requirement since it is only about descriptors that are not used, whereas #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT requires the implementation to observe updates to descriptors that are used.
        </div>

        <h5>See Also</h5>
        {@code VkDescriptorBindingFlagsEXT}
        """,

        "DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT".enum(0x00000001),
        "DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT".enum(0x00000002),
        "DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT".enum(0x00000004),
        "DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT".enum(0x00000008)
    )
}