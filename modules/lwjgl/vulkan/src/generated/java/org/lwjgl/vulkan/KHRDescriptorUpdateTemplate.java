/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Applications may wish to update a fixed set of descriptors in a large number of descriptor sets very frequently, i.e. during initialization phase or if it is required to rebuild descriptor sets for each frame. For those cases it is also not unlikely that all information required to update a single descriptor set is stored in a single struct. This extension provides a way to update a fixed set of descriptors in a single {@code VkDescriptorSet} with a pointer to an application-defined data structure describing the new descriptors.
 * 
 * <h5>Promotion to Vulkan 1.1</h5>
 * 
 * <p>{@link #vkCmdPushDescriptorSetWithTemplateKHR CmdPushDescriptorSetWithTemplateKHR} is included as an interaction with {@link KHRPushDescriptor VK_KHR_push_descriptor}. If Vulkan 1.1 and {@code VK_KHR_push_descriptor} are supported, this is included by {@link KHRPushDescriptor VK_KHR_push_descriptor}.</p>
 * 
 * <p>The base functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum, and command names are still available as aliases of the core functionality.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_descriptor_update_template}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>86</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>API Interactions</b></dt>
 * <dd><ul>
 * <li>Interacts with VK_EXT_debug_report</li>
 * <li>Interacts with VK_KHR_push_descriptor</li>
 * </ul></dd>
 * <dt><b>Deprecation State</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#versions-1.1-promotions">Vulkan 1.1</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Markus Tavenrath <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_descriptor_update_template]%20@mtavenrath%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_descriptor_update_template%20extension*">mtavenrath</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-09-05</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Interacts with {@link KHRPushDescriptor VK_KHR_push_descriptor}</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Michael Worcester, Imagination Technologies</li>
 * </ul></dd>
 * </dl>
 */
public class KHRDescriptorUpdateTemplate {

    /** The extension specification version. */
    public static final int VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_EXTENSION_NAME = "VK_KHR_descriptor_update_template";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR = 1000085000;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR = 1000085000;

    /** Extends {@code VkDescriptorUpdateTemplateType}. */
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR = 0;

    /** Extends {@code VkDescriptorUpdateTemplateType}. */
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR = 1;

    /** Extends {@code VkDebugReportObjectTypeEXT}. */
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT = 1000085000;

    protected KHRDescriptorUpdateTemplate() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateDescriptorUpdateTemplateKHR ] ---

    /** Unsafe version of: {@link #vkCreateDescriptorUpdateTemplateKHR CreateDescriptorUpdateTemplateKHR} */
    public static int nvkCreateDescriptorUpdateTemplateKHR(VkDevice device, long pCreateInfo, long pAllocator, long pDescriptorUpdateTemplate) {
        long __functionAddress = device.getCapabilities().vkCreateDescriptorUpdateTemplateKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkDescriptorUpdateTemplateCreateInfo.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pDescriptorUpdateTemplate, __functionAddress);
    }

    /**
     * See {@link VK11#vkCreateDescriptorUpdateTemplate CreateDescriptorUpdateTemplate}.
     *
     * @param device                    the logical device that creates the descriptor update template.
     * @param pCreateInfo               a pointer to a {@link VkDescriptorUpdateTemplateCreateInfo} structure specifying the set of descriptors to update with a single call to {@link VK14#vkCmdPushDescriptorSetWithTemplate CmdPushDescriptorSetWithTemplate} or {@link VK11#vkUpdateDescriptorSetWithTemplate UpdateDescriptorSetWithTemplate}.
     * @param pAllocator                controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pDescriptorUpdateTemplate a pointer to a {@code VkDescriptorUpdateTemplate} handle in which the resulting descriptor update template object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateDescriptorUpdateTemplateKHR(VkDevice device, @NativeType("VkDescriptorUpdateTemplateCreateInfo const *") VkDescriptorUpdateTemplateCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDescriptorUpdateTemplate *") LongBuffer pDescriptorUpdateTemplate) {
        if (CHECKS) {
            check(pDescriptorUpdateTemplate, 1);
        }
        return nvkCreateDescriptorUpdateTemplateKHR(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pDescriptorUpdateTemplate));
    }

    // --- [ vkDestroyDescriptorUpdateTemplateKHR ] ---

    /** Unsafe version of: {@link #vkDestroyDescriptorUpdateTemplateKHR DestroyDescriptorUpdateTemplateKHR} */
    public static void nvkDestroyDescriptorUpdateTemplateKHR(VkDevice device, long descriptorUpdateTemplate, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyDescriptorUpdateTemplateKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), descriptorUpdateTemplate, pAllocator, __functionAddress);
    }

    /**
     * See {@link VK11#vkDestroyDescriptorUpdateTemplate DestroyDescriptorUpdateTemplate}.
     *
     * @param device                   the logical device that has been used to create the descriptor update template
     * @param descriptorUpdateTemplate the descriptor update template to destroy.
     * @param pAllocator               controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyDescriptorUpdateTemplateKHR(VkDevice device, @NativeType("VkDescriptorUpdateTemplate") long descriptorUpdateTemplate, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyDescriptorUpdateTemplateKHR(device, descriptorUpdateTemplate, memAddressSafe(pAllocator));
    }

    // --- [ vkUpdateDescriptorSetWithTemplateKHR ] ---

    /**
     * See {@link VK11#vkUpdateDescriptorSetWithTemplate UpdateDescriptorSetWithTemplate}.
     *
     * @param device                   the logical device that updates the descriptor set.
     * @param descriptorSet            the descriptor set to update
     * @param descriptorUpdateTemplate a {@code VkDescriptorUpdateTemplate} object specifying the update mapping between {@code pData} and the descriptor set to update.
     * @param pData                    a pointer to memory containing one or more {@link VkDescriptorImageInfo}, {@link VkDescriptorBufferInfo}, or {@code VkBufferView} structures or {@code VkAccelerationStructureKHR} or {@code VkAccelerationStructureNV} handles used to write the descriptors.
     */
    public static void vkUpdateDescriptorSetWithTemplateKHR(VkDevice device, @NativeType("VkDescriptorSet") long descriptorSet, @NativeType("VkDescriptorUpdateTemplate") long descriptorUpdateTemplate, @NativeType("void const *") long pData) {
        long __functionAddress = device.getCapabilities().vkUpdateDescriptorSetWithTemplateKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJPV(device.address(), descriptorSet, descriptorUpdateTemplate, pData, __functionAddress);
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

    /** Array version of: {@link #vkCreateDescriptorUpdateTemplateKHR CreateDescriptorUpdateTemplateKHR} */
    @NativeType("VkResult")
    public static int vkCreateDescriptorUpdateTemplateKHR(VkDevice device, @NativeType("VkDescriptorUpdateTemplateCreateInfo const *") VkDescriptorUpdateTemplateCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDescriptorUpdateTemplate *") long[] pDescriptorUpdateTemplate) {
        long __functionAddress = device.getCapabilities().vkCreateDescriptorUpdateTemplateKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pDescriptorUpdateTemplate, 1);
            VkDescriptorUpdateTemplateCreateInfo.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pDescriptorUpdateTemplate, __functionAddress);
    }

}