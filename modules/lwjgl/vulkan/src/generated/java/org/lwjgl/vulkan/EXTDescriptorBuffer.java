/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension introduces new commands to put shader-accessible descriptors directly in memory, making the management of descriptor data more explicit.
 * 
 * <h5>VK_EXT_descriptor_buffer</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_descriptor_buffer}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>317</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} and {@link KHRBufferDeviceAddress VK_KHR_buffer_device_address} and {@link KHRSynchronization2 VK_KHR_synchronization2} and {@link EXTDescriptorIndexing VK_EXT_descriptor_indexing}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Tobias Hector <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_descriptor_buffer]%20@tobski%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_descriptor_buffer%20extension*">tobski</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_descriptor_buffer.adoc">VK_EXT_descriptor_buffer</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-06-07</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Tobias Hector, AMD</li>
 * <li>Stu Smith, AMD</li>
 * <li>Maciej Jesionowski, AMD</li>
 * <li>Boris Zanin, AMD</li>
 * <li>Hans-Kristian Arntzen, Valve</li>
 * <li>Connor Abbott, Valve</li>
 * <li>Baldur Karlsson, Valve</li>
 * <li>Mike Blumenkrantz, Valve</li>
 * <li>Graeme Leese, Broadcom</li>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>Rodrigo Locatti, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Jeff Leger, QUALCOMM</li>
 * <li>Lionel Landwerlin, Intel</li>
 * <li>Slawomir Grajewski, Intel</li>
 * </ul></dd>
 * </dl>
 */
public class EXTDescriptorBuffer {

    /** The extension specification version. */
    public static final int VK_EXT_DESCRIPTOR_BUFFER_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_DESCRIPTOR_BUFFER_EXTENSION_NAME = "VK_EXT_descriptor_buffer";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_DENSITY_MAP_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_DENSITY_MAP_PROPERTIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT STRUCTURE_TYPE_BUFFER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT STRUCTURE_TYPE_IMAGE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_PUSH_DESCRIPTOR_BUFFER_HANDLE_EXT STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_PUSH_DESCRIPTOR_BUFFER_HANDLE_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT             = 1000316000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_DENSITY_MAP_PROPERTIES_EXT = 1000316001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT               = 1000316002,
        VK_STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT                                  = 1000316003,
        VK_STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT                                      = 1000316004,
        VK_STRUCTURE_TYPE_BUFFER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT                      = 1000316005,
        VK_STRUCTURE_TYPE_IMAGE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT                       = 1000316006,
        VK_STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT                  = 1000316007,
        VK_STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT                     = 1000316008,
        VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT               = 1000316010,
        VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT                           = 1000316011,
        VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_PUSH_DESCRIPTOR_BUFFER_HANDLE_EXT  = 1000316012;

    /**
     * Extends {@code VkDescriptorSetLayoutCreateFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>{@link #VK_DESCRIPTOR_SET_LAYOUT_CREATE_EMBEDDED_IMMUTABLE_SAMPLERS_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_EMBEDDED_IMMUTABLE_SAMPLERS_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT           = 0x10,
        VK_DESCRIPTOR_SET_LAYOUT_CREATE_EMBEDDED_IMMUTABLE_SAMPLERS_BIT_EXT = 0x20;

    /**
     * Extends {@code VkBufferUsageFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>{@link #VK_BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>{@link #VK_BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        VK_BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT          = 0x200000,
        VK_BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT         = 0x400000,
        VK_BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT = 0x4000000;

    /** Extends {@code VkBufferCreateFlagBits}. */
    public static final int VK_BUFFER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 0x20;

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 0x10000;

    /** Extends {@code VkImageViewCreateFlagBits}. */
    public static final int VK_IMAGE_VIEW_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 0x4;

    /** Extends {@code VkSamplerCreateFlagBits}. */
    public static final int VK_SAMPLER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 0x8;

    /** Extends {@code VkAccelerationStructureCreateFlagBitsKHR}. */
    public static final int VK_ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 0x8;

    /** Extends {@code VkAccessFlagBits2}. */
    public static final long VK_ACCESS_2_DESCRIPTOR_BUFFER_READ_BIT_EXT = 0x20000000000L;

    /** Extends {@code VkPipelineCreateFlagBits}. */
    public static final int VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT = 0x20000000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT = 1000316009;

    protected EXTDescriptorBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetDescriptorSetLayoutSizeEXT ] ---

    /** Unsafe version of: {@link #vkGetDescriptorSetLayoutSizeEXT GetDescriptorSetLayoutSizeEXT} */
    public static void nvkGetDescriptorSetLayoutSizeEXT(VkDevice device, long layout, long pLayoutSizeInBytes) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetLayoutSizeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), layout, pLayoutSizeInBytes, __functionAddress);
    }

    /**
     * Get the size of a descriptor set layout in memory.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine the amount of memory needed to store all descriptors with a given layout, call:</p>
     * 
     * <pre><code>
     * void vkGetDescriptorSetLayoutSizeEXT(
     *     VkDevice                                    device,
     *     VkDescriptorSetLayout                       layout,
     *     VkDeviceSize*                               pLayoutSizeInBytes);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The size of a descriptor set layout will be at least as large as the sum total of the size of all descriptors in the layout, and <b>may</b> be larger. This size represents the amount of memory that will be required to store all of the descriptors for this layout in memory, when placed according to the layout’s offsets as obtained by {@link #vkGetDescriptorSetLayoutBindingOffsetEXT GetDescriptorSetLayoutBindingOffsetEXT}.</p>
     * 
     * <p>If any {@code binding} in {@code layout} is {@link VK12#VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT}, the returned size includes space for the maximum {@code descriptorCount} descriptors as declared for that {@code binding}. To compute the required size of a descriptor set with a {@link VK12#VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT}:</p>
     * 
     * <dl>
     * <dd><code>size = offset + descriptorSize × variableDescriptorCount</code></dd>
     * </dl>
     * 
     * <p>where <code>offset</code> is obtained by {@link #vkGetDescriptorSetLayoutBindingOffsetEXT GetDescriptorSetLayoutBindingOffsetEXT} and <code>descriptorSize</code> is the size of the relevant descriptor as obtained from {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}, and <code>variableDescriptorCount</code> is the equivalent of {@link VkDescriptorSetVariableDescriptorCountAllocateInfo}{@code ::pDescriptorCounts}. For {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK}, <code>variableDescriptorCount</code> is the size in bytes for the inline uniform block, and <code>descriptorSize</code> is 1.</p>
     * 
     * <p>If {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::combinedImageSamplerDescriptorSingleArray} is {@link VK10#VK_FALSE FALSE} and the variable descriptor type is {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, <code>variableDescriptorCount</code> is always considered to be the upper bound.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-descriptorBuffer">{@code descriptorBuffer}</a> feature <b>must</b> be enabled</li>
     * <li>{@code layout} <b>must</b> have been created with the {@link #VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT} flag set</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code layout} <b>must</b> be a valid {@code VkDescriptorSetLayout} handle</li>
     * <li>{@code pLayoutSizeInBytes} <b>must</b> be a valid pointer to a {@code VkDeviceSize} value</li>
     * <li>{@code layout} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     *
     * @param device             the logical device that gets the size.
     * @param layout             the descriptor set layout being queried.
     * @param pLayoutSizeInBytes a pointer to {@code VkDeviceSize} where the size in bytes will be written.
     */
    public static void vkGetDescriptorSetLayoutSizeEXT(VkDevice device, @NativeType("VkDescriptorSetLayout") long layout, @NativeType("VkDeviceSize *") LongBuffer pLayoutSizeInBytes) {
        if (CHECKS) {
            check(pLayoutSizeInBytes, 1);
        }
        nvkGetDescriptorSetLayoutSizeEXT(device, layout, memAddress(pLayoutSizeInBytes));
    }

    // --- [ vkGetDescriptorSetLayoutBindingOffsetEXT ] ---

    /** Unsafe version of: {@link #vkGetDescriptorSetLayoutBindingOffsetEXT GetDescriptorSetLayoutBindingOffsetEXT} */
    public static void nvkGetDescriptorSetLayoutBindingOffsetEXT(VkDevice device, long layout, int binding, long pOffset) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetLayoutBindingOffsetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), layout, binding, pOffset, __functionAddress);
    }

    /**
     * Get the offset of a binding within a descriptor set layout.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To get the offset of a binding within a descriptor set layout in memory, call:</p>
     * 
     * <pre><code>
     * void vkGetDescriptorSetLayoutBindingOffsetEXT(
     *     VkDevice                                    device,
     *     VkDescriptorSetLayout                       layout,
     *     uint32_t                                    binding,
     *     VkDeviceSize*                               pOffset);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Each binding in a descriptor set layout is assigned an offset in memory by the implementation. When a shader accesses a resource with that binding, it will access the bound descriptor buffer from that offset to look for its descriptor. This command provides an application with that offset, so that descriptors can be placed in the correct locations. The precise location accessed by a shader for a given descriptor is as follows:</p>
     * 
     * <dl>
     * <dd><code>location = bufferAddress + setOffset + descriptorOffset + (arrayElement × descriptorSize)</code></dd>
     * </dl>
     * 
     * <p>where <code>bufferAddress</code> and <code>setOffset</code> are the base address and offset for the identified descriptor set as specified by {@link #vkCmdBindDescriptorBuffersEXT CmdBindDescriptorBuffersEXT} and {@link #vkCmdSetDescriptorBufferOffsetsEXT CmdSetDescriptorBufferOffsetsEXT}, <code>descriptorOffset</code> is the offset for the binding returned by this command, <code>arrayElement</code> is the index into the array specified in the shader, and <code>descriptorSize</code> is the size of the relevant descriptor as obtained from {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}. Applications are responsible for placing valid descriptors at the expected location in order for a shader to access it. The overall offset added to <code>bufferAddress</code> to calculate <code>location</code> <b>must</b> be less than {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::maxSamplerDescriptorBufferRange} for samplers and {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::maxResourceDescriptorBufferRange} for resources.</p>
     * 
     * <p>If any {@code binding} in {@code layout} is {@link VK12#VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT}, that {@code binding} <b>must</b> have the largest offset of any {@code binding}.</p>
     * 
     * <p>A descriptor {@code binding} with type {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE} <b>can</b> be used. Any potential types in {@link VkMutableDescriptorTypeCreateInfoVALVE}{@code ::pDescriptorTypes} for {@code binding} share the same offset. If the size of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-mutable">mutable descriptor</a> is larger than the size of a concrete descriptor type being accessed, the padding area is ignored by the implementation.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-descriptorBuffer">{@code descriptorBuffer}</a> feature <b>must</b> be enabled</li>
     * <li>{@code layout} <b>must</b> have been created with the {@link #VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT} flag set</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code layout} <b>must</b> be a valid {@code VkDescriptorSetLayout} handle</li>
     * <li>{@code pOffset} <b>must</b> be a valid pointer to a {@code VkDeviceSize} value</li>
     * <li>{@code layout} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     *
     * @param device  the logical device that gets the offset.
     * @param layout  the descriptor set layout being queried.
     * @param binding the binding number being queried.
     * @param pOffset a pointer to {@code VkDeviceSize} where the byte offset of the binding will be written.
     */
    public static void vkGetDescriptorSetLayoutBindingOffsetEXT(VkDevice device, @NativeType("VkDescriptorSetLayout") long layout, @NativeType("uint32_t") int binding, @NativeType("VkDeviceSize *") LongBuffer pOffset) {
        if (CHECKS) {
            check(pOffset, 1);
        }
        nvkGetDescriptorSetLayoutBindingOffsetEXT(device, layout, binding, memAddress(pOffset));
    }

    // --- [ vkGetDescriptorEXT ] ---

    /**
     * Unsafe version of: {@link #vkGetDescriptorEXT GetDescriptorEXT}
     *
     * @param dataSize the amount of the descriptor data to get in bytes.
     */
    public static void nvkGetDescriptorEXT(VkDevice device, long pDescriptorInfo, long dataSize, long pDescriptor) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(device.address(), pDescriptorInfo, dataSize, pDescriptor, __functionAddress);
    }

    /**
     * To get a descriptor to place in a buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To get descriptor data to place in a buffer, call:</p>
     * 
     * <pre><code>
     * void vkGetDescriptorEXT(
     *     VkDevice                                    device,
     *     const VkDescriptorGetInfoEXT*               pDescriptorInfo,
     *     size_t                                      dataSize,
     *     void*                                       pDescriptor);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The size of the data for each descriptor type is determined by the value in {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}. This value also defines the stride in bytes for arrays of that descriptor type.</p>
     * 
     * <p>If the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::combinedImageSamplerDescriptorSingleArray} property is {@link VK10#VK_FALSE FALSE} the implementation requires an array of {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} descriptors to be written into a descriptor buffer as an array of image descriptors, immediately followed by an array of sampler descriptors. Applications <b>must</b> write the first {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::sampledImageDescriptorSize} bytes of the data returned through {@code pDescriptor} to the first array, and the remaining {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::samplerDescriptorSize} bytes of the data to the second array. For variable-sized descriptor bindings of {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} descriptors, the two arrays each have a size equal to the upper bound {@code descriptorCount} of that binding.</p>
     * 
     * <p>A descriptor obtained by this command references the underlying {@code VkImageView} or {@code VkSampler}, and these objects <b>must</b> not be destroyed before the last time a descriptor is dynamically accessed. For descriptor types which consume an address instead of an object, the underlying {@code VkBuffer} is referenced instead.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-descriptorBuffer">{@code descriptorBuffer}</a> feature <b>must</b> be enabled</li>
     * <li>{@code dataSize} <b>must</b> equal the size of a descriptor of type {@link VkDescriptorGetInfoEXT}{@code ::type} determined by the value in {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}, or {@link VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT}{@code ::combinedImageSamplerDensityMapDescriptorSize} if {@code pDescriptorInfo} specifies a {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} whose {@code VkSampler} was created with {@link EXTFragmentDensityMap#VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT SAMPLER_CREATE_SUBSAMPLED_BIT_EXT} set</li>
     * <li>{@code pDescriptor} <b>must</b> be a valid pointer to an array of at least {@code dataSize} bytes</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pDescriptorInfo} <b>must</b> be a valid pointer to a valid {@link VkDescriptorGetInfoEXT} structure</li>
     * <li>{@code pDescriptor} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
     * <li>{@code dataSize} <b>must</b> be greater than 0</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDescriptorGetInfoEXT}</p>
     *
     * @param device          the logical device that gets the descriptor.
     * @param pDescriptorInfo a pointer to a {@link VkDescriptorGetInfoEXT} structure specifying the parameters of the descriptor to get.
     * @param pDescriptor     a pointer to a user-allocated buffer where the descriptor will be written.
     */
    public static void vkGetDescriptorEXT(VkDevice device, @NativeType("VkDescriptorGetInfoEXT const *") VkDescriptorGetInfoEXT pDescriptorInfo, @NativeType("void *") ByteBuffer pDescriptor) {
        nvkGetDescriptorEXT(device, pDescriptorInfo.address(), pDescriptor.remaining(), memAddress(pDescriptor));
    }

    // --- [ vkCmdBindDescriptorBuffersEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdBindDescriptorBuffersEXT CmdBindDescriptorBuffersEXT}
     *
     * @param bufferCount the number of elements in the {@code pBindingInfos} array.
     */
    public static void nvkCmdBindDescriptorBuffersEXT(VkCommandBuffer commandBuffer, int bufferCount, long pBindingInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorBuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), bufferCount, pBindingInfos, __functionAddress);
    }

    /**
     * Binding descriptor buffers to a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To bind descriptor buffers to a command buffer, call:</p>
     * 
     * <pre><code>
     * void vkCmdBindDescriptorBuffersEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    bufferCount,
     *     const VkDescriptorBufferBindingInfoEXT*     pBindingInfos);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkCmdBindDescriptorBuffersEXT} causes any offsets previously set by {@link #vkCmdSetDescriptorBufferOffsetsEXT CmdSetDescriptorBufferOffsetsEXT} that use the bindings numbered [0.. {@code bufferCount}-1] to be no longer valid for subsequent bound pipeline commands. Any previously bound buffers at binding points greater than or equal to {@code bufferCount} are unbound.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-descriptorBuffer">{@code descriptorBuffer}</a> feature <b>must</b> be enabled</li>
     * <li>There <b>must</b> be no more than {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::maxSamplerDescriptorBufferBindings} descriptor buffers containing sampler descriptor data bound</li>
     * <li>There <b>must</b> be no more than {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::maxResourceDescriptorBufferBindings} descriptor buffers containing resource descriptor data bound</li>
     * <li>There <b>must</b> be no more than 1 descriptor buffer bound that was created with the {@link #VK_BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT} bit set</li>
     * <li>{@code bufferCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::maxDescriptorBufferBindings}</li>
     * <li>For any element of {@code pBindingInfos}, if the buffer from which {@code address} was queried is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>For any element of {@code pBindingInfos}, the buffer from which {@code address} was queried <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT} bit set if it contains sampler descriptor data</li>
     * <li>For any element of {@code pBindingInfos}, the buffer from which {@code address} was queried <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT} bit set if it contains resource descriptor data</li>
     * <li>For any element of {@code pBindingInfos}, {@code usage} <b>must</b> match the buffer from which {@code address} was queried</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pBindingInfos} <b>must</b> be a valid pointer to an array of {@code bufferCount} valid {@link VkDescriptorBufferBindingInfoEXT} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code bufferCount} <b>must</b> be greater than 0</li>
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
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDescriptorBufferBindingInfoEXT}</p>
     *
     * @param commandBuffer the command buffer that the descriptor buffers will be bound to.
     * @param pBindingInfos a pointer to an array of {@link VkDescriptorBufferBindingInfoEXT} structures.
     */
    public static void vkCmdBindDescriptorBuffersEXT(VkCommandBuffer commandBuffer, @NativeType("VkDescriptorBufferBindingInfoEXT const *") VkDescriptorBufferBindingInfoEXT.Buffer pBindingInfos) {
        nvkCmdBindDescriptorBuffersEXT(commandBuffer, pBindingInfos.remaining(), pBindingInfos.address());
    }

    // --- [ vkCmdSetDescriptorBufferOffsetsEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetDescriptorBufferOffsetsEXT CmdSetDescriptorBufferOffsetsEXT}
     *
     * @param setCount the number of elements in the {@code pBufferIndices} and {@code pOffsets} arrays.
     */
    public static void nvkCmdSetDescriptorBufferOffsetsEXT(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int firstSet, int setCount, long pBufferIndices, long pOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDescriptorBufferOffsetsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPPV(commandBuffer.address(), pipelineBindPoint, layout, firstSet, setCount, pBufferIndices, pOffsets, __functionAddress);
    }

    /**
     * Setting descriptor buffer offsets in a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To set descriptor buffer offsets in a command buffer, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDescriptorBufferOffsetsEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkPipelineBindPoint                         pipelineBindPoint,
     *     VkPipelineLayout                            layout,
     *     uint32_t                                    firstSet,
     *     uint32_t                                    setCount,
     *     const uint32_t*                             pBufferIndices,
     *     const VkDeviceSize*                         pOffsets);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkCmdSetDescriptorBufferOffsetsEXT} binds {@code setCount} pairs of descriptor buffers, specified by indices into the binding points bound using {@link #vkCmdBindDescriptorBuffersEXT CmdBindDescriptorBuffersEXT}, and buffer offsets to set numbers [{@code firstSet}..{@code firstSet}+{@code descriptorSetCount}-1] for subsequent <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-bindpoint-commands">bound pipeline commands</a> set by {@code pipelineBindPoint}. Set [{@code firstSet} + i] is bound to the descriptor buffer at binding {@code pBufferIndices}[i] at an offset of {@code pOffsets}[i]. Any bindings that were previously applied via these sets, or calls to {@link VK10#vkCmdBindDescriptorSets CmdBindDescriptorSets}, are no longer valid. Other sets will also be invalidated upon calling this command if {@code layout} differs from the pipeline layout used to bind those other sets, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a>.</p>
     * 
     * <p>After binding descriptors, applications <b>can</b> modify descriptor memory either by performing writes on the host or with device commands. When descriptor memory is updated with device commands, visibility for the shader stage accessing a descriptor is ensured with the {@link #VK_ACCESS_2_DESCRIPTOR_BUFFER_READ_BIT_EXT ACCESS_2_DESCRIPTOR_BUFFER_READ_BIT_EXT} access flag. Implementations <b>must</b> not access resources referenced by these descriptors unless they are dynamically accessed by shaders. Descriptors bound with this call <b>can</b> be undefined if they are not dynamically accessed by shaders.</p>
     * 
     * <p>Implementations <b>may</b> read descriptor data for any statically accessed descriptor if the {@code binding} in {@code layout} is not declared with the {@link VK12#VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT} flag. If the {@code binding} in {@code layout} is declared with {@link VK12#VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT}, implementations <b>must</b> not read descriptor data that is not dynamically accessed.</p>
     * 
     * <p>Applications <b>must</b> ensure that any descriptor which the implementation <b>may</b> read <b>must</b> be in-bounds of the underlying descriptor buffer binding.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Applications can freely decide how large a variable descriptor buffer binding is, so it may not be safe to read such descriptor payloads statically. The intention of these rules is to allow implementations to speculatively prefetch descriptor payloads where feasible.</p>
     * </div>
     * 
     * <p>Dynamically accessing a resource through descriptor data from an unbound region of a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#sparsememory-partially-resident-buffers">sparse partially-resident buffer</a> will result in invalid descriptor data being read, and therefore undefined behavior.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>For descriptors written by the host, visibility is implied through the automatic visibility operation on queue submit, and there is no need to consider {@code VK_ACCESS_2_DESCRIPTOR_BUFFER_READ_BIT}. Explicit synchronization for descriptors is only required when descriptors are updated on the device.</p>
     * </div>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The requirements above imply that all descriptor bindings have been defined with the equivalent of {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT}, {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT} and {@link VK12#VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT}, but enabling those features is not required to get this behavior.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-descriptorBuffer">{@code descriptorBuffer}</a> feature <b>must</b> be enabled</li>
     * <li>The offsets in {@code pOffsets} <b>must</b> be aligned to {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::descriptorBufferOffsetAlignment}</li>
     * <li>The offsets in {@code pOffsets} <b>must</b> be small enough such that any descriptor binding referenced by {@code layout} without the {@link VK12#VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT} flag computes a valid address inside the underlying {@code VkBuffer}</li>
     * <li>The offsets in {@code pOffsets} <b>must</b> be small enough such that any location accessed by a shader as a sampler descriptor <b>must</b> be within {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::maxSamplerDescriptorBufferRange} of the sampler descriptor buffer binding</li>
     * <li>The offsets in {@code pOffsets} <b>must</b> be small enough such that any location accessed by a shader as a resource descriptor <b>must</b> be within {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::maxResourceDescriptorBufferRange} of the resource descriptor buffer binding</li>
     * <li>Each element of {@code pBufferIndices} <b>must</b> be less than {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::maxDescriptorBufferBindings}</li>
     * <li>Each element of {@code pBufferIndices} <b>must</b> reference a valid descriptor buffer binding set by a previous call to {@link #vkCmdBindDescriptorBuffersEXT CmdBindDescriptorBuffersEXT} in {@code commandBuffer}</li>
     * <li>The sum of {@code firstSet} and {@code setCount} <b>must</b> be less than or equal to {@link VkPipelineLayoutCreateInfo}{@code ::setLayoutCount} provided when {@code layout} was created</li>
     * <li>{@code pipelineBindPoint} <b>must</b> be supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
     * <li>The {@code VkDescriptorSetLayout} for each set from {@code firstSet} to <code>firstSet + setCount</code> when {@code layout} was created <b>must</b> have been created with the {@link #VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT} bit set</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
     * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
     * <li>{@code pBufferIndices} <b>must</b> be a valid pointer to an array of {@code setCount} {@code uint32_t} values</li>
     * <li>{@code pOffsets} <b>must</b> be a valid pointer to an array of {@code setCount} {@code VkDeviceSize} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code setCount} <b>must</b> be greater than 0</li>
     * <li>Both of {@code commandBuffer}, and {@code layout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * @param commandBuffer     the command buffer in which the descriptor buffer offsets will be set.
     * @param pipelineBindPoint a {@code VkPipelineBindPoint} indicating the type of the pipeline that will use the descriptors.
     * @param layout            a {@code VkPipelineLayout} object used to program the bindings.
     * @param firstSet          the number of the first set to be bound.
     * @param pBufferIndices    a pointer to an array of indices into the descriptor buffer binding points set by {@link #vkCmdBindDescriptorBuffersEXT CmdBindDescriptorBuffersEXT}.
     * @param pOffsets          a pointer to an array of {@code VkDeviceSize} offsets to apply to the bound descriptor buffers.
     */
    public static void vkCmdSetDescriptorBufferOffsetsEXT(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int firstSet, @NativeType("uint32_t const *") IntBuffer pBufferIndices, @NativeType("VkDeviceSize const *") LongBuffer pOffsets) {
        if (CHECKS) {
            check(pOffsets, pBufferIndices.remaining());
        }
        nvkCmdSetDescriptorBufferOffsetsEXT(commandBuffer, pipelineBindPoint, layout, firstSet, pBufferIndices.remaining(), memAddress(pBufferIndices), memAddress(pOffsets));
    }

    // --- [ vkCmdBindDescriptorBufferEmbeddedSamplersEXT ] ---

    /**
     * Setting embedded immutable samplers offsets in a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To bind an embedded immutable sampler set to a command buffer, call:</p>
     * 
     * <pre><code>
     * void vkCmdBindDescriptorBufferEmbeddedSamplersEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkPipelineBindPoint                         pipelineBindPoint,
     *     VkPipelineLayout                            layout,
     *     uint32_t                                    set);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkCmdBindDescriptorBufferEmbeddedSamplersEXT} binds the embedded immutable samplers in {@code set} of {@code layout} to {@code set} for the command buffer for subsequent <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-bindpoint-commands">bound pipeline commands</a> set by {@code pipelineBindPoint}. Any previous binding to this set by {@link #vkCmdSetDescriptorBufferOffsetsEXT CmdSetDescriptorBufferOffsetsEXT} or this command is overwritten. Any sets that were last bound by a call to {@link VK10#vkCmdBindDescriptorSets CmdBindDescriptorSets} are invalidated upon calling this command. Other sets will also be invalidated upon calling this command if {@code layout} differs from the pipeline layout used to bind those other sets, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a>.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-descriptorBuffer">{@code descriptorBuffer}</a> feature <b>must</b> be enabled</li>
     * <li>{@code pipelineBindPoint} <b>must</b> be supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
     * <li>The {@code VkDescriptorSetLayout} at index {@code set} when {@code layout} was created <b>must</b> have been created with the {@link #VK_DESCRIPTOR_SET_LAYOUT_CREATE_EMBEDDED_IMMUTABLE_SAMPLERS_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_EMBEDDED_IMMUTABLE_SAMPLERS_BIT_EXT} bit set</li>
     * <li>{@code set} <b>must</b> be less than or equal to {@link VkPipelineLayoutCreateInfo}{@code ::setLayoutCount} provided when {@code layout} was created</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
     * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>Both of {@code commandBuffer}, and {@code layout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * @param commandBuffer     the command buffer that the embedded immutable samplers will be bound to.
     * @param pipelineBindPoint a {@code VkPipelineBindPoint} indicating the type of the pipeline that will use the embedded immutable samplers.
     * @param layout            a {@code VkPipelineLayout} object used to program the bindings.
     * @param set               the number of the set to be bound.
     */
    public static void vkCmdBindDescriptorBufferEmbeddedSamplersEXT(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int set) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorBufferEmbeddedSamplersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), pipelineBindPoint, layout, set, __functionAddress);
    }

    // --- [ vkGetBufferOpaqueCaptureDescriptorDataEXT ] ---

    /** Unsafe version of: {@link #vkGetBufferOpaqueCaptureDescriptorDataEXT GetBufferOpaqueCaptureDescriptorDataEXT} */
    public static int nvkGetBufferOpaqueCaptureDescriptorDataEXT(VkDevice device, long pInfo, long pData) {
        long __functionAddress = device.getCapabilities().vkGetBufferOpaqueCaptureDescriptorDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pInfo, pData, __functionAddress);
    }

    /**
     * Get buffer opaque capture descriptor data.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To get the opaque descriptor data for a buffer, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetBufferOpaqueCaptureDescriptorDataEXT(
     *     VkDevice                                    device,
     *     const VkBufferCaptureDescriptorDataInfoEXT* pInfo,
     *     void*                                       pData);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-descriptorBuffer">{@code descriptorBufferCaptureReplay}</a> feature <b>must</b> be enabled</li>
     * <li>{@code pData} <b>must</b> point to a buffer that is at least {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::bufferCaptureReplayDescriptorDataSize} bytes in size</li>
     * <li>If {@code device} was created with multiple physical devices, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddressMultiDevice">{@code bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkBufferCaptureDescriptorDataInfoEXT} structure</li>
     * <li>{@code pData} <b>must</b> be a pointer value</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBufferCaptureDescriptorDataInfoEXT}</p>
     *
     * @param device the logical device that gets the data.
     * @param pInfo  a pointer to a {@link VkBufferCaptureDescriptorDataInfoEXT} structure specifying the buffer.
     * @param pData  a pointer to a user-allocated buffer where the data will be written.
     */
    @NativeType("VkResult")
    public static int vkGetBufferOpaqueCaptureDescriptorDataEXT(VkDevice device, @NativeType("VkBufferCaptureDescriptorDataInfoEXT const *") VkBufferCaptureDescriptorDataInfoEXT pInfo, @NativeType("void *") ByteBuffer pData) {
        if (CHECKS) {
            check(pData, 1);
        }
        return nvkGetBufferOpaqueCaptureDescriptorDataEXT(device, pInfo.address(), memAddress(pData));
    }

    // --- [ vkGetImageOpaqueCaptureDescriptorDataEXT ] ---

    /** Unsafe version of: {@link #vkGetImageOpaqueCaptureDescriptorDataEXT GetImageOpaqueCaptureDescriptorDataEXT} */
    public static int nvkGetImageOpaqueCaptureDescriptorDataEXT(VkDevice device, long pInfo, long pData) {
        long __functionAddress = device.getCapabilities().vkGetImageOpaqueCaptureDescriptorDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pInfo, pData, __functionAddress);
    }

    /**
     * Get image opaque capture descriptor data.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To get the opaque capture descriptor data for an image, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetImageOpaqueCaptureDescriptorDataEXT(
     *     VkDevice                                    device,
     *     const VkImageCaptureDescriptorDataInfoEXT*  pInfo,
     *     void*                                       pData);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-descriptorBuffer">{@code descriptorBufferCaptureReplay}</a> feature <b>must</b> be enabled</li>
     * <li>{@code pData} <b>must</b> point to a buffer that is at least {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::imageCaptureReplayDescriptorDataSize} bytes in size</li>
     * <li>If {@code device} was created with multiple physical devices, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddressMultiDevice">{@code bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkImageCaptureDescriptorDataInfoEXT} structure</li>
     * <li>{@code pData} <b>must</b> be a pointer value</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkImageCaptureDescriptorDataInfoEXT}</p>
     *
     * @param device the logical device that gets the data.
     * @param pInfo  a pointer to a {@link VkImageCaptureDescriptorDataInfoEXT} structure specifying the image.
     * @param pData  a pointer to a user-allocated buffer where the data will be written.
     */
    @NativeType("VkResult")
    public static int vkGetImageOpaqueCaptureDescriptorDataEXT(VkDevice device, @NativeType("VkImageCaptureDescriptorDataInfoEXT const *") VkImageCaptureDescriptorDataInfoEXT pInfo, @NativeType("void *") ByteBuffer pData) {
        if (CHECKS) {
            check(pData, 1);
        }
        return nvkGetImageOpaqueCaptureDescriptorDataEXT(device, pInfo.address(), memAddress(pData));
    }

    // --- [ vkGetImageViewOpaqueCaptureDescriptorDataEXT ] ---

    /** Unsafe version of: {@link #vkGetImageViewOpaqueCaptureDescriptorDataEXT GetImageViewOpaqueCaptureDescriptorDataEXT} */
    public static int nvkGetImageViewOpaqueCaptureDescriptorDataEXT(VkDevice device, long pInfo, long pData) {
        long __functionAddress = device.getCapabilities().vkGetImageViewOpaqueCaptureDescriptorDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pInfo, pData, __functionAddress);
    }

    /**
     * Get image view opaque capture descriptor data.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To get the opaque capture descriptor data for an image view, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetImageViewOpaqueCaptureDescriptorDataEXT(
     *     VkDevice                                    device,
     *     const VkImageViewCaptureDescriptorDataInfoEXT* pInfo,
     *     void*                                       pData);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-descriptorBuffer">{@code descriptorBufferCaptureReplay}</a> feature <b>must</b> be enabled</li>
     * <li>{@code pData} <b>must</b> point to a buffer that is at least {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::imageViewCaptureReplayDescriptorDataSize} bytes in size</li>
     * <li>If {@code device} was created with multiple physical devices, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddressMultiDevice">{@code bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkImageViewCaptureDescriptorDataInfoEXT} structure</li>
     * <li>{@code pData} <b>must</b> be a pointer value</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkImageViewCaptureDescriptorDataInfoEXT}</p>
     *
     * @param device the logical device that gets the data.
     * @param pInfo  a pointer to a {@link VkImageViewCaptureDescriptorDataInfoEXT} structure specifying the image view.
     * @param pData  a pointer to a user-allocated buffer where the data will be written.
     */
    @NativeType("VkResult")
    public static int vkGetImageViewOpaqueCaptureDescriptorDataEXT(VkDevice device, @NativeType("VkImageViewCaptureDescriptorDataInfoEXT const *") VkImageViewCaptureDescriptorDataInfoEXT pInfo, @NativeType("void *") ByteBuffer pData) {
        if (CHECKS) {
            check(pData, 1);
        }
        return nvkGetImageViewOpaqueCaptureDescriptorDataEXT(device, pInfo.address(), memAddress(pData));
    }

    // --- [ vkGetSamplerOpaqueCaptureDescriptorDataEXT ] ---

    /** Unsafe version of: {@link #vkGetSamplerOpaqueCaptureDescriptorDataEXT GetSamplerOpaqueCaptureDescriptorDataEXT} */
    public static int nvkGetSamplerOpaqueCaptureDescriptorDataEXT(VkDevice device, long pInfo, long pData) {
        long __functionAddress = device.getCapabilities().vkGetSamplerOpaqueCaptureDescriptorDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pInfo, pData, __functionAddress);
    }

    /**
     * Get sampler opaque capture descriptor data.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To get the opaque capture descriptor data for a sampler, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetSamplerOpaqueCaptureDescriptorDataEXT(
     *     VkDevice                                    device,
     *     const VkSamplerCaptureDescriptorDataInfoEXT* pInfo,
     *     void*                                       pData);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-descriptorBuffer">{@code descriptorBufferCaptureReplay}</a> feature <b>must</b> be enabled</li>
     * <li>{@code pData} <b>must</b> point to a buffer that is at least {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::samplerCaptureReplayDescriptorDataSize} bytes in size</li>
     * <li>If {@code device} was created with multiple physical devices, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddressMultiDevice">{@code bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkSamplerCaptureDescriptorDataInfoEXT} structure</li>
     * <li>{@code pData} <b>must</b> be a pointer value</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSamplerCaptureDescriptorDataInfoEXT}</p>
     *
     * @param device the logical device that gets the data.
     * @param pInfo  a pointer to a {@link VkSamplerCaptureDescriptorDataInfoEXT} structure specifying the sampler.
     * @param pData  a pointer to a user-allocated buffer where the data will be written.
     */
    @NativeType("VkResult")
    public static int vkGetSamplerOpaqueCaptureDescriptorDataEXT(VkDevice device, @NativeType("VkSamplerCaptureDescriptorDataInfoEXT const *") VkSamplerCaptureDescriptorDataInfoEXT pInfo, @NativeType("void *") ByteBuffer pData) {
        if (CHECKS) {
            check(pData, 1);
        }
        return nvkGetSamplerOpaqueCaptureDescriptorDataEXT(device, pInfo.address(), memAddress(pData));
    }

    // --- [ vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT ] ---

    /** Unsafe version of: {@link #vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT GetAccelerationStructureOpaqueCaptureDescriptorDataEXT} */
    public static int nvkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(VkDevice device, long pInfo, long pData) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pInfo, pData, __functionAddress);
    }

    /**
     * Get acceleration structure opaque capture descriptor data.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To get the opaque capture descriptor data for an acceleration structure, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(
     *     VkDevice                                    device,
     *     const VkAccelerationStructureCaptureDescriptorDataInfoEXT* pInfo,
     *     void*                                       pData);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-descriptorBuffer">{@code descriptorBufferCaptureReplay}</a> feature <b>must</b> be enabled</li>
     * <li>{@code pData} <b>must</b> point to a buffer that is at least {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::accelerationStructureCaptureReplayDescriptorDataSize} bytes in size</li>
     * <li>If {@code device} was created with multiple physical devices, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddressMultiDevice">{@code bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkAccelerationStructureCaptureDescriptorDataInfoEXT} structure</li>
     * <li>{@code pData} <b>must</b> be a pointer value</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAccelerationStructureCaptureDescriptorDataInfoEXT}</p>
     *
     * @param device the logical device that gets the data.
     * @param pInfo  a pointer to a {@link VkAccelerationStructureCaptureDescriptorDataInfoEXT} structure specifying the acceleration structure.
     * @param pData  a pointer to a user-allocated buffer where the data will be written.
     */
    @NativeType("VkResult")
    public static int vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(VkDevice device, @NativeType("VkAccelerationStructureCaptureDescriptorDataInfoEXT const *") VkAccelerationStructureCaptureDescriptorDataInfoEXT pInfo, @NativeType("void *") ByteBuffer pData) {
        if (CHECKS) {
            check(pData, 1);
        }
        return nvkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(device, pInfo.address(), memAddress(pData));
    }

    /** Array version of: {@link #vkGetDescriptorSetLayoutSizeEXT GetDescriptorSetLayoutSizeEXT} */
    public static void vkGetDescriptorSetLayoutSizeEXT(VkDevice device, @NativeType("VkDescriptorSetLayout") long layout, @NativeType("VkDeviceSize *") long[] pLayoutSizeInBytes) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetLayoutSizeEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pLayoutSizeInBytes, 1);
        }
        callPJPV(device.address(), layout, pLayoutSizeInBytes, __functionAddress);
    }

    /** Array version of: {@link #vkGetDescriptorSetLayoutBindingOffsetEXT GetDescriptorSetLayoutBindingOffsetEXT} */
    public static void vkGetDescriptorSetLayoutBindingOffsetEXT(VkDevice device, @NativeType("VkDescriptorSetLayout") long layout, @NativeType("uint32_t") int binding, @NativeType("VkDeviceSize *") long[] pOffset) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetLayoutBindingOffsetEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pOffset, 1);
        }
        callPJPV(device.address(), layout, binding, pOffset, __functionAddress);
    }

    /** Array version of: {@link #vkCmdSetDescriptorBufferOffsetsEXT CmdSetDescriptorBufferOffsetsEXT} */
    public static void vkCmdSetDescriptorBufferOffsetsEXT(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int firstSet, @NativeType("uint32_t const *") int[] pBufferIndices, @NativeType("VkDeviceSize const *") long[] pOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDescriptorBufferOffsetsEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pOffsets, pBufferIndices.length);
        }
        callPJPPV(commandBuffer.address(), pipelineBindPoint, layout, firstSet, pBufferIndices.length, pBufferIndices, pOffsets, __functionAddress);
    }

}