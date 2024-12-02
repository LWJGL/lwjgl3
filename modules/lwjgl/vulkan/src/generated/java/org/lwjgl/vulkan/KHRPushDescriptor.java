/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * This extension allows descriptors to be written into the command buffer, while the implementation is responsible for managing their memory. Push descriptors may enable easier porting from older APIs and in some cases can be more efficient than writing descriptors into descriptor sets.
 * 
 * <h5>Promotion to Vulkan 1.4</h5>
 * 
 * <p>Functionality in this extension is included in core Vulkan 1.4 with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_push_descriptor}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>81</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#versions-1.1">Version 1.1</a></dd>
 * <dt><b>API Interactions</b></dt>
 * <dd><ul>
 * <li>Interacts with VK_VERSION_1_1</li>
 * <li>Interacts with VK_KHR_descriptor_update_template</li>
 * </ul></dd>
 * <dt><b>Deprecation State</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to Vulkan 1.4</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_push_descriptor]%20@jeffbolznv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_push_descriptor%20extension*">jeffbolznv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-09-12</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Michael Worcester, Imagination Technologies</li>
 * </ul></dd>
 * </dl>
 */
public class KHRPushDescriptor {

    /** The extension specification version. */
    public static final int VK_KHR_PUSH_DESCRIPTOR_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_KHR_PUSH_DESCRIPTOR_EXTENSION_NAME = "VK_KHR_push_descriptor";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR = 1000080000;

    /** Extends {@code VkDescriptorSetLayoutCreateFlagBits}. */
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR = 0x1;

    /** Extends {@code VkDescriptorUpdateTemplateType}. */
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR = 1;

    protected KHRPushDescriptor() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdPushDescriptorSetKHR ] ---

    /**
     * Unsafe version of: {@link #vkCmdPushDescriptorSetKHR CmdPushDescriptorSetKHR}
     *
     * @param descriptorWriteCount the number of elements in the {@code pDescriptorWrites} array.
     */
    public static void nvkCmdPushDescriptorSetKHR(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int set, int descriptorWriteCount, long pDescriptorWrites) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSetKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(commandBuffer.address(), pipelineBindPoint, layout, set, descriptorWriteCount, pDescriptorWrites, __functionAddress);
    }

    /**
     * See {@link VK14#vkCmdPushDescriptorSet CmdPushDescriptorSet}.
     *
     * @param commandBuffer     the command buffer that the descriptors will be recorded in.
     * @param pipelineBindPoint a {@code VkPipelineBindPoint} indicating the type of the pipeline that will use the descriptors. There is a separate set of push descriptor bindings for each pipeline type, so binding one does not disturb the others.
     * @param layout            a {@code VkPipelineLayout} object used to program the bindings.
     * @param set               the set number of the descriptor set in the pipeline layout that will be updated.
     * @param pDescriptorWrites a pointer to an array of {@link VkWriteDescriptorSet} structures describing the descriptors to be updated.
     */
    public static void vkCmdPushDescriptorSetKHR(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int set, @NativeType("VkWriteDescriptorSet const *") VkWriteDescriptorSet.Buffer pDescriptorWrites) {
        nvkCmdPushDescriptorSetKHR(commandBuffer, pipelineBindPoint, layout, set, pDescriptorWrites.remaining(), pDescriptorWrites.address());
    }

    // --- [ vkCmdPushDescriptorSetWithTemplateKHR ] ---

    /**
     * See {@link VK14#vkCmdPushDescriptorSetWithTemplate CmdPushDescriptorSetWithTemplate}.
     *
     * @param commandBuffer            the command buffer that the descriptors will be recorded in.
     * @param descriptorUpdateTemplate a descriptor update template defining how to interpret the descriptor information in {@code pData}.
     * @param layout                   a {@code VkPipelineLayout} object used to program the bindings. It <b>must</b> be compatible with the layout used to create the {@code descriptorUpdateTemplate} handle.
     * @param set                      the set number of the descriptor set in the pipeline layout that will be updated. This <b>must</b> be the same number used to create the {@code descriptorUpdateTemplate} handle.
     * @param pData                    a pointer to memory containing descriptors for the templated update.
     */
    public static void vkCmdPushDescriptorSetWithTemplateKHR(VkCommandBuffer commandBuffer, @NativeType("VkDescriptorUpdateTemplate") long descriptorUpdateTemplate, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int set, @NativeType("void const *") long pData) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSetWithTemplateKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJPV(commandBuffer.address(), descriptorUpdateTemplate, layout, set, pData, __functionAddress);
    }

}