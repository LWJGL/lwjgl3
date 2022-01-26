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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the parameters of a descriptor set write operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>Only one of {@code pImageInfo}, {@code pBufferInfo}, or {@code pTexelBufferView} members is used according to the descriptor type specified in the {@code descriptorType} member of the containing {@link VkWriteDescriptorSet} structure, or none of them in case {@code descriptorType} is {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK}, in which case the source data for the descriptor writes is taken from the {@link VkWriteDescriptorSetInlineUniformBlock} structure included in the {@code pNext} chain of {@link VkWriteDescriptorSet}, or if {@code descriptorType} is {@link KHRAccelerationStructure#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR}, in which case the source data for the descriptor writes is taken from the {@link VkWriteDescriptorSetAccelerationStructureKHR} structure in the {@code pNext} chain of {@link VkWriteDescriptorSet}, or if {@code descriptorType} is {@link NVRayTracing#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV}, in which case the source data for the descriptor writes is taken from the {@link VkWriteDescriptorSetAccelerationStructureNV} structure in the {@code pNext} chain of {@link VkWriteDescriptorSet}, as specified below.</p>
 * 
 * <p>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">nullDescriptor</a> feature is enabled, the buffer, acceleration structure, imageView, or bufferView <b>can</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}. Loads from a null descriptor return zero values and stores and atomics to a null descriptor are discarded. A null acceleration structure descriptor results in the miss shader being invoked.</p>
 * 
 * <p>If the destination descriptor is a mutable descriptor, the active descriptor type for the destination descriptor becomes {@code descriptorType}.</p>
 * 
 * <p>If the {@code dstBinding} has fewer than {@code descriptorCount} array elements remaining starting from {@code dstArrayElement}, then the remainder will be used to update the subsequent binding - <code>dstBinding+1</code> starting at array element zero. If a binding has a {@code descriptorCount} of zero, it is skipped. This behavior applies recursively, with the update affecting consecutive bindings as needed to update all {@code descriptorCount} descriptors. Consecutive bindings <b>must</b> have identical {@code VkDescriptorType}, {@code VkShaderStageFlags}, {@code VkDescriptorBindingFlagBits}, and immutable samplers references.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The same behavior applies to bindings with a descriptor type of {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} where {@code descriptorCount} specifies the number of bytes to update while {@code dstArrayElement} specifies the starting byte offset, thus in this case if the {@code dstBinding} has a smaller byte size than the sum of {@code dstArrayElement} and {@code descriptorCount}, then the remainder will be used to update the subsequent binding - <code>dstBinding+1</code> starting at offset zero. This falls out as a special case of the above rule.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code dstBinding} <b>must</b> be less than or equal to the maximum value of {@code binding} of all {@link VkDescriptorSetLayoutBinding} structures specified when {@code dstSet}’s descriptor set layout was created</li>
 * <li>{@code dstBinding} <b>must</b> be a binding with a non-zero {@code descriptorCount}</li>
 * <li>All consecutive bindings updated via a single {@link VkWriteDescriptorSet} structure, except those with a {@code descriptorCount} of zero, <b>must</b> have identical {@code descriptorType} and {@code stageFlags}</li>
 * <li>All consecutive bindings updated via a single {@link VkWriteDescriptorSet} structure, except those with a {@code descriptorCount} of zero, <b>must</b> all either use immutable samplers or <b>must</b> all not use immutable samplers</li>
 * <li>{@code descriptorType} <b>must</b> match the type of {@code dstBinding} within {@code dstSet}</li>
 * <li>{@code dstSet} <b>must</b> be a valid {@code VkDescriptorSet} handle</li>
 * <li>The sum of {@code dstArrayElement} and {@code descriptorCount} <b>must</b> be less than or equal to the number of array elements in the descriptor set binding specified by {@code dstBinding}, and all applicable consecutive bindings, as described by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-updates-consecutive">consecutive binding updates</a></li>
 * <li>If {@code descriptorType} is {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK}, {@code dstArrayElement} <b>must</b> be an integer multiple of 4</li>
 * <li>If {@code descriptorType} is {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK}, {@code descriptorCount} <b>must</b> be an integer multiple of 4</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER}, each element of {@code pTexelBufferView} <b>must</b> be either a valid {@code VkBufferView} handle or {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">nullDescriptor</a> feature is not enabled, each element of {@code pTexelBufferView} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER}, {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}, or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}, {@code pBufferInfo} <b>must</b> be a valid pointer to an array of {@code descriptorCount} valid {@link VkDescriptorBufferInfo} structures</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER} or {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, and {@code dstSet} was not allocated with a layout that included immutable samplers for {@code dstBinding} with {@code descriptorType}, the {@code sampler} member of each element of {@code pImageInfo} <b>must</b> be a valid {@code VkSampler} object</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, or {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}, the {@code imageView} member of each element of {@code pImageInfo} <b>must</b> be either a valid {@code VkImageView} handle or {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, or {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">nullDescriptor</a> feature is not enabled, the {@code imageView} member of each element of {@code pImageInfo} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code descriptorType} is {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK}, the {@code pNext} chain <b>must</b> include a {@link VkWriteDescriptorSetInlineUniformBlock} structure whose {@code dataSize} member equals {@code descriptorCount}</li>
 * <li>If {@code descriptorType} is {@link KHRAccelerationStructure#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR}, the {@code pNext} chain <b>must</b> include a {@link VkWriteDescriptorSetAccelerationStructureKHR} structure whose {@code accelerationStructureCount} member equals {@code descriptorCount}</li>
 * <li>If {@code descriptorType} is {@link NVRayTracing#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV}, the {@code pNext} chain <b>must</b> include a {@link VkWriteDescriptorSetAccelerationStructureNV} structure whose {@code accelerationStructureCount} member equals {@code descriptorCount}</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, then the {@code imageView} member of each {@code pImageInfo} element <b>must</b> have been created without a {@link VkSamplerYcbcrConversionInfo} structure in its {@code pNext} chain</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, and if any element of {@code pImageInfo} has a {@code imageView} member that was created with a {@link VkSamplerYcbcrConversionInfo} structure in its {@code pNext} chain, then {@code dstSet} <b>must</b> have been allocated with a layout that included immutable samplers for {@code dstBinding}, and the corresponding immutable sampler <b>must</b> have been created with an <em>identically defined</em> {@link VkSamplerYcbcrConversionInfo} object</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, and {@code dstSet} was allocated with a layout that included immutable samplers for {@code dstBinding}, then the {@code imageView} member of each element of {@code pImageInfo} which corresponds to an immutable sampler that enables <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> <b>must</b> have been created with a {@link VkSamplerYcbcrConversionInfo} structure in its {@code pNext} chain with an <em>identically defined</em> {@link VkSamplerYcbcrConversionInfo} to the corresponding immutable sampler</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}, the {@code offset} member of each element of {@code pBufferInfo} <b>must</b> be a multiple of {@link VkPhysicalDeviceLimits}{@code ::minUniformBufferOffsetAlignment}</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}, the {@code offset} member of each element of {@code pBufferInfo} <b>must</b> be a multiple of {@link VkPhysicalDeviceLimits}{@code ::minStorageBufferOffsetAlignment}</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER}, {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER}, or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}, and the {@code buffer} member of any element of {@code pBufferInfo} is the handle of a non-sparse buffer, then that buffer <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}, the {@code buffer} member of each element of {@code pBufferInfo} <b>must</b> have been created with {@link VK10#VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT BUFFER_USAGE_UNIFORM_BUFFER_BIT} set</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}, the {@code buffer} member of each element of {@code pBufferInfo} <b>must</b> have been created with {@link VK10#VK_BUFFER_USAGE_STORAGE_BUFFER_BIT BUFFER_USAGE_STORAGE_BUFFER_BIT} set</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}, the {@code range} member of each element of {@code pBufferInfo}, or the effective range if {@code range} is {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxUniformBufferRange}</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}, the {@code range} member of each element of {@code pBufferInfo}, or the effective range if {@code range} is {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxStorageBufferRange}</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER}, the {@code VkBuffer} that each element of {@code pTexelBufferView} was created from <b>must</b> have been created with {@link VK10#VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT} set</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER}, the {@code VkBuffer} that each element of {@code pTexelBufferView} was created from <b>must</b> have been created with {@link VK10#VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT} set</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE} or {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}, the {@code imageView} member of each element of {@code pImageInfo} <b>must</b> have been created with the identity swizzle</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE} or {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, the {@code imageView} member of each element of {@code pImageInfo} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT} set</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE} the {@code imageLayout} member of each element of {@code pImageInfo} <b>must</b> be a member of the list given in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-sampledimage">Sampled Image</a></li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} the {@code imageLayout} member of each element of {@code pImageInfo} <b>must</b> be a member of the list given in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-combinedimagesampler">Combined Image Sampler</a></li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} the {@code imageLayout} member of each element of {@code pImageInfo} <b>must</b> be a member of the list given in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-inputattachment">Input Attachment</a></li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE} the {@code imageLayout} member of each element of {@code pImageInfo} <b>must</b> be a member of the list given in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-storageimage">Storage Image</a></li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}, the {@code imageView} member of each element of {@code pImageInfo} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT} set</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, the {@code imageView} member of each element of {@code pImageInfo} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT} set</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER}, then {@code dstSet} <b>must</b> not have been allocated with a layout that included immutable samplers for {@code dstBinding}</li>
 * <li>If the {@link VkDescriptorSetLayoutBinding} for {@code dstSet} at {@code dstBinding} is {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE}, the new active descriptor type {@code descriptorType} <b>must</b> exist in the corresponding {@code pMutableDescriptorTypeLists} list for {@code dstBinding}</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}, the {@code imageView} member of each element of {@code pImageInfo} <b>must</b> have either been created without a {@link VkImageViewMinLodCreateInfoEXT} present in the {@code pNext} chain or with a {@link VkImageViewMinLodCreateInfoEXT}{@code ::minLod} of {@code 0.0}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkWriteDescriptorSetAccelerationStructureKHR}, {@link VkWriteDescriptorSetAccelerationStructureNV}, or {@link VkWriteDescriptorSetInlineUniformBlock}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code descriptorType} <b>must</b> be a valid {@code VkDescriptorType} value</li>
 * <li>{@code descriptorCount} <b>must</b> be greater than 0</li>
 * <li>Both of {@code dstSet}, and the elements of {@code pTexelBufferView} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDescriptorBufferInfo}, {@link VkDescriptorImageInfo}, {@link KHRPushDescriptor#vkCmdPushDescriptorSetKHR CmdPushDescriptorSetKHR}, {@link VK10#vkUpdateDescriptorSets UpdateDescriptorSets}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkWriteDescriptorSet {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDescriptorSet {@link #dstSet};
 *     uint32_t {@link #dstBinding};
 *     uint32_t {@link #dstArrayElement};
 *     uint32_t {@link #descriptorCount};
 *     VkDescriptorType {@link #descriptorType};
 *     {@link VkDescriptorImageInfo VkDescriptorImageInfo} const * {@link #pImageInfo};
 *     {@link VkDescriptorBufferInfo VkDescriptorBufferInfo} const * {@link #pBufferInfo};
 *     VkBufferView const * {@link #pTexelBufferView};
 * }</code></pre>
 */
public class VkWriteDescriptorSet extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DSTSET,
        DSTBINDING,
        DSTARRAYELEMENT,
        DESCRIPTORCOUNT,
        DESCRIPTORTYPE,
        PIMAGEINFO,
        PBUFFERINFO,
        PTEXELBUFFERVIEW;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DSTSET = layout.offsetof(2);
        DSTBINDING = layout.offsetof(3);
        DSTARRAYELEMENT = layout.offsetof(4);
        DESCRIPTORCOUNT = layout.offsetof(5);
        DESCRIPTORTYPE = layout.offsetof(6);
        PIMAGEINFO = layout.offsetof(7);
        PBUFFERINFO = layout.offsetof(8);
        PTEXELBUFFERVIEW = layout.offsetof(9);
    }

    /**
     * Creates a {@code VkWriteDescriptorSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkWriteDescriptorSet(ByteBuffer container) {
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
    /** the destination descriptor set to update. */
    @NativeType("VkDescriptorSet")
    public long dstSet() { return ndstSet(address()); }
    /** the descriptor binding within that set. */
    @NativeType("uint32_t")
    public int dstBinding() { return ndstBinding(address()); }
    /** the starting element in that array. If the descriptor binding identified by {@code dstSet} and {@code dstBinding} has a descriptor type of {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} then {@code dstArrayElement} specifies the starting byte offset within the binding. */
    @NativeType("uint32_t")
    public int dstArrayElement() { return ndstArrayElement(address()); }
    /**
     * the number of descriptors to update. If the descriptor binding identified by {@code dstSet} and {@code dstBinding} has a descriptor type of {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK}, then {@code descriptorCount} specifies the number of bytes to update. Otherwise, {@code descriptorCount} is one of
     * 
     * <ul>
     * <li>the number of elements in {@code pImageInfo}</li>
     * <li>the number of elements in {@code pBufferInfo}</li>
     * <li>the number of elements in {@code pTexelBufferView}</li>
     * <li>a value matching the {@code dataSize} member of a {@link VkWriteDescriptorSetInlineUniformBlock} structure in the {@code pNext} chain</li>
     * <li>a value matching the {@code accelerationStructureCount} of a {@link VkWriteDescriptorSetAccelerationStructureKHR} structure in the {@code pNext} chain</li>
     * </ul>
     */
    @NativeType("uint32_t")
    public int descriptorCount() { return ndescriptorCount(address()); }
    /** a {@code VkDescriptorType} specifying the type of each descriptor in {@code pImageInfo}, {@code pBufferInfo}, or {@code pTexelBufferView}, as described below. If {@link VkDescriptorSetLayoutBinding} for {@code dstSet} at {@code dstBinding} is not equal to {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE}, {@code descriptorType} <b>must</b> be the same type as the {@code descriptorType} specified in {@link VkDescriptorSetLayoutBinding} for {@code dstSet} at {@code dstBinding}. The type of the descriptor also controls which array the descriptors are taken from. */
    @NativeType("VkDescriptorType")
    public int descriptorType() { return ndescriptorType(address()); }
    /** a pointer to an array of {@link VkDescriptorImageInfo} structures or is ignored, as described below. */
    @Nullable
    @NativeType("VkDescriptorImageInfo const *")
    public VkDescriptorImageInfo.Buffer pImageInfo() { return npImageInfo(address()); }
    /** a pointer to an array of {@link VkDescriptorBufferInfo} structures or is ignored, as described below. */
    @Nullable
    @NativeType("VkDescriptorBufferInfo const *")
    public VkDescriptorBufferInfo.Buffer pBufferInfo() { return npBufferInfo(address()); }
    /** a pointer to an array of {@code VkBufferView} handles as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-buffer-views">Buffer Views</a> section or is ignored, as described below. */
    @Nullable
    @NativeType("VkBufferView const *")
    public LongBuffer pTexelBufferView() { return npTexelBufferView(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkWriteDescriptorSet sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET} value to the {@link #sType} field. */
    public VkWriteDescriptorSet sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkWriteDescriptorSet pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkWriteDescriptorSetAccelerationStructureKHR} value to the {@code pNext} chain. */
    public VkWriteDescriptorSet pNext(VkWriteDescriptorSetAccelerationStructureKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkWriteDescriptorSetAccelerationStructureNV} value to the {@code pNext} chain. */
    public VkWriteDescriptorSet pNext(VkWriteDescriptorSetAccelerationStructureNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkWriteDescriptorSetInlineUniformBlock} value to the {@code pNext} chain. */
    public VkWriteDescriptorSet pNext(VkWriteDescriptorSetInlineUniformBlock value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkWriteDescriptorSetInlineUniformBlockEXT} value to the {@code pNext} chain. */
    public VkWriteDescriptorSet pNext(VkWriteDescriptorSetInlineUniformBlockEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #dstSet} field. */
    public VkWriteDescriptorSet dstSet(@NativeType("VkDescriptorSet") long value) { ndstSet(address(), value); return this; }
    /** Sets the specified value to the {@link #dstBinding} field. */
    public VkWriteDescriptorSet dstBinding(@NativeType("uint32_t") int value) { ndstBinding(address(), value); return this; }
    /** Sets the specified value to the {@link #dstArrayElement} field. */
    public VkWriteDescriptorSet dstArrayElement(@NativeType("uint32_t") int value) { ndstArrayElement(address(), value); return this; }
    /** Sets the specified value to the {@link #descriptorCount} field. */
    public VkWriteDescriptorSet descriptorCount(@NativeType("uint32_t") int value) { ndescriptorCount(address(), value); return this; }
    /** Sets the specified value to the {@link #descriptorType} field. */
    public VkWriteDescriptorSet descriptorType(@NativeType("VkDescriptorType") int value) { ndescriptorType(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorImageInfo.Buffer} to the {@link #pImageInfo} field. */
    public VkWriteDescriptorSet pImageInfo(@Nullable @NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo.Buffer value) { npImageInfo(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorBufferInfo.Buffer} to the {@link #pBufferInfo} field. */
    public VkWriteDescriptorSet pBufferInfo(@Nullable @NativeType("VkDescriptorBufferInfo const *") VkDescriptorBufferInfo.Buffer value) { npBufferInfo(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pTexelBufferView} field. */
    public VkWriteDescriptorSet pTexelBufferView(@Nullable @NativeType("VkBufferView const *") LongBuffer value) { npTexelBufferView(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkWriteDescriptorSet set(
        int sType,
        long pNext,
        long dstSet,
        int dstBinding,
        int dstArrayElement,
        int descriptorCount,
        int descriptorType,
        @Nullable VkDescriptorImageInfo.Buffer pImageInfo,
        @Nullable VkDescriptorBufferInfo.Buffer pBufferInfo,
        @Nullable LongBuffer pTexelBufferView
    ) {
        sType(sType);
        pNext(pNext);
        dstSet(dstSet);
        dstBinding(dstBinding);
        dstArrayElement(dstArrayElement);
        descriptorCount(descriptorCount);
        descriptorType(descriptorType);
        pImageInfo(pImageInfo);
        pBufferInfo(pBufferInfo);
        pTexelBufferView(pTexelBufferView);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkWriteDescriptorSet set(VkWriteDescriptorSet src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkWriteDescriptorSet} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkWriteDescriptorSet malloc() {
        return wrap(VkWriteDescriptorSet.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkWriteDescriptorSet} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkWriteDescriptorSet calloc() {
        return wrap(VkWriteDescriptorSet.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkWriteDescriptorSet} instance allocated with {@link BufferUtils}. */
    public static VkWriteDescriptorSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkWriteDescriptorSet.class, memAddress(container), container);
    }

    /** Returns a new {@code VkWriteDescriptorSet} instance for the specified memory address. */
    public static VkWriteDescriptorSet create(long address) {
        return wrap(VkWriteDescriptorSet.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkWriteDescriptorSet createSafe(long address) {
        return address == NULL ? null : wrap(VkWriteDescriptorSet.class, address);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSet.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSet.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSet.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSet.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSet.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSet.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkWriteDescriptorSet.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSet.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkWriteDescriptorSet.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSet mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSet callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSet mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSet callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSet.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSet.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSet.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSet.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkWriteDescriptorSet} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteDescriptorSet malloc(MemoryStack stack) {
        return wrap(VkWriteDescriptorSet.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkWriteDescriptorSet} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteDescriptorSet calloc(MemoryStack stack) {
        return wrap(VkWriteDescriptorSet.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkWriteDescriptorSet.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSet.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSet.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSet.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkWriteDescriptorSet.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkWriteDescriptorSet.PNEXT); }
    /** Unsafe version of {@link #dstSet}. */
    public static long ndstSet(long struct) { return UNSAFE.getLong(null, struct + VkWriteDescriptorSet.DSTSET); }
    /** Unsafe version of {@link #dstBinding}. */
    public static int ndstBinding(long struct) { return UNSAFE.getInt(null, struct + VkWriteDescriptorSet.DSTBINDING); }
    /** Unsafe version of {@link #dstArrayElement}. */
    public static int ndstArrayElement(long struct) { return UNSAFE.getInt(null, struct + VkWriteDescriptorSet.DSTARRAYELEMENT); }
    /** Unsafe version of {@link #descriptorCount}. */
    public static int ndescriptorCount(long struct) { return UNSAFE.getInt(null, struct + VkWriteDescriptorSet.DESCRIPTORCOUNT); }
    /** Unsafe version of {@link #descriptorType}. */
    public static int ndescriptorType(long struct) { return UNSAFE.getInt(null, struct + VkWriteDescriptorSet.DESCRIPTORTYPE); }
    /** Unsafe version of {@link #pImageInfo}. */
    @Nullable public static VkDescriptorImageInfo.Buffer npImageInfo(long struct) { return VkDescriptorImageInfo.createSafe(memGetAddress(struct + VkWriteDescriptorSet.PIMAGEINFO), ndescriptorCount(struct)); }
    /** Unsafe version of {@link #pBufferInfo}. */
    @Nullable public static VkDescriptorBufferInfo.Buffer npBufferInfo(long struct) { return VkDescriptorBufferInfo.createSafe(memGetAddress(struct + VkWriteDescriptorSet.PBUFFERINFO), ndescriptorCount(struct)); }
    /** Unsafe version of {@link #pTexelBufferView() pTexelBufferView}. */
    @Nullable public static LongBuffer npTexelBufferView(long struct) { return memLongBufferSafe(memGetAddress(struct + VkWriteDescriptorSet.PTEXELBUFFERVIEW), ndescriptorCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkWriteDescriptorSet.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkWriteDescriptorSet.PNEXT, value); }
    /** Unsafe version of {@link #dstSet(long) dstSet}. */
    public static void ndstSet(long struct, long value) { UNSAFE.putLong(null, struct + VkWriteDescriptorSet.DSTSET, value); }
    /** Unsafe version of {@link #dstBinding(int) dstBinding}. */
    public static void ndstBinding(long struct, int value) { UNSAFE.putInt(null, struct + VkWriteDescriptorSet.DSTBINDING, value); }
    /** Unsafe version of {@link #dstArrayElement(int) dstArrayElement}. */
    public static void ndstArrayElement(long struct, int value) { UNSAFE.putInt(null, struct + VkWriteDescriptorSet.DSTARRAYELEMENT, value); }
    /** Sets the specified value to the {@code descriptorCount} field of the specified {@code struct}. */
    public static void ndescriptorCount(long struct, int value) { UNSAFE.putInt(null, struct + VkWriteDescriptorSet.DESCRIPTORCOUNT, value); }
    /** Unsafe version of {@link #descriptorType(int) descriptorType}. */
    public static void ndescriptorType(long struct, int value) { UNSAFE.putInt(null, struct + VkWriteDescriptorSet.DESCRIPTORTYPE, value); }
    /** Unsafe version of {@link #pImageInfo(VkDescriptorImageInfo.Buffer) pImageInfo}. */
    public static void npImageInfo(long struct, @Nullable VkDescriptorImageInfo.Buffer value) { memPutAddress(struct + VkWriteDescriptorSet.PIMAGEINFO, memAddressSafe(value)); }
    /** Unsafe version of {@link #pBufferInfo(VkDescriptorBufferInfo.Buffer) pBufferInfo}. */
    public static void npBufferInfo(long struct, @Nullable VkDescriptorBufferInfo.Buffer value) { memPutAddress(struct + VkWriteDescriptorSet.PBUFFERINFO, memAddressSafe(value)); }
    /** Unsafe version of {@link #pTexelBufferView(LongBuffer) pTexelBufferView}. */
    public static void npTexelBufferView(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkWriteDescriptorSet.PTEXELBUFFERVIEW, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkWriteDescriptorSet} structs. */
    public static class Buffer extends StructBuffer<VkWriteDescriptorSet, Buffer> implements NativeResource {

        private static final VkWriteDescriptorSet ELEMENT_FACTORY = VkWriteDescriptorSet.create(-1L);

        /**
         * Creates a new {@code VkWriteDescriptorSet.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkWriteDescriptorSet#SIZEOF}, and its mark will be undefined.
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
        protected VkWriteDescriptorSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkWriteDescriptorSet#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkWriteDescriptorSet.nsType(address()); }
        /** @return the value of the {@link VkWriteDescriptorSet#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkWriteDescriptorSet.npNext(address()); }
        /** @return the value of the {@link VkWriteDescriptorSet#dstSet} field. */
        @NativeType("VkDescriptorSet")
        public long dstSet() { return VkWriteDescriptorSet.ndstSet(address()); }
        /** @return the value of the {@link VkWriteDescriptorSet#dstBinding} field. */
        @NativeType("uint32_t")
        public int dstBinding() { return VkWriteDescriptorSet.ndstBinding(address()); }
        /** @return the value of the {@link VkWriteDescriptorSet#dstArrayElement} field. */
        @NativeType("uint32_t")
        public int dstArrayElement() { return VkWriteDescriptorSet.ndstArrayElement(address()); }
        /** @return the value of the {@link VkWriteDescriptorSet#descriptorCount} field. */
        @NativeType("uint32_t")
        public int descriptorCount() { return VkWriteDescriptorSet.ndescriptorCount(address()); }
        /** @return the value of the {@link VkWriteDescriptorSet#descriptorType} field. */
        @NativeType("VkDescriptorType")
        public int descriptorType() { return VkWriteDescriptorSet.ndescriptorType(address()); }
        /** @return a {@link VkDescriptorImageInfo.Buffer} view of the struct array pointed to by the {@link VkWriteDescriptorSet#pImageInfo} field. */
        @Nullable
        @NativeType("VkDescriptorImageInfo const *")
        public VkDescriptorImageInfo.Buffer pImageInfo() { return VkWriteDescriptorSet.npImageInfo(address()); }
        /** @return a {@link VkDescriptorBufferInfo.Buffer} view of the struct array pointed to by the {@link VkWriteDescriptorSet#pBufferInfo} field. */
        @Nullable
        @NativeType("VkDescriptorBufferInfo const *")
        public VkDescriptorBufferInfo.Buffer pBufferInfo() { return VkWriteDescriptorSet.npBufferInfo(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkWriteDescriptorSet#pTexelBufferView} field. */
        @Nullable
        @NativeType("VkBufferView const *")
        public LongBuffer pTexelBufferView() { return VkWriteDescriptorSet.npTexelBufferView(address()); }

        /** Sets the specified value to the {@link VkWriteDescriptorSet#sType} field. */
        public VkWriteDescriptorSet.Buffer sType(@NativeType("VkStructureType") int value) { VkWriteDescriptorSet.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET} value to the {@link VkWriteDescriptorSet#sType} field. */
        public VkWriteDescriptorSet.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET); }
        /** Sets the specified value to the {@link VkWriteDescriptorSet#pNext} field. */
        public VkWriteDescriptorSet.Buffer pNext(@NativeType("void const *") long value) { VkWriteDescriptorSet.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkWriteDescriptorSetAccelerationStructureKHR} value to the {@code pNext} chain. */
        public VkWriteDescriptorSet.Buffer pNext(VkWriteDescriptorSetAccelerationStructureKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkWriteDescriptorSetAccelerationStructureNV} value to the {@code pNext} chain. */
        public VkWriteDescriptorSet.Buffer pNext(VkWriteDescriptorSetAccelerationStructureNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkWriteDescriptorSetInlineUniformBlock} value to the {@code pNext} chain. */
        public VkWriteDescriptorSet.Buffer pNext(VkWriteDescriptorSetInlineUniformBlock value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkWriteDescriptorSetInlineUniformBlockEXT} value to the {@code pNext} chain. */
        public VkWriteDescriptorSet.Buffer pNext(VkWriteDescriptorSetInlineUniformBlockEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkWriteDescriptorSet#dstSet} field. */
        public VkWriteDescriptorSet.Buffer dstSet(@NativeType("VkDescriptorSet") long value) { VkWriteDescriptorSet.ndstSet(address(), value); return this; }
        /** Sets the specified value to the {@link VkWriteDescriptorSet#dstBinding} field. */
        public VkWriteDescriptorSet.Buffer dstBinding(@NativeType("uint32_t") int value) { VkWriteDescriptorSet.ndstBinding(address(), value); return this; }
        /** Sets the specified value to the {@link VkWriteDescriptorSet#dstArrayElement} field. */
        public VkWriteDescriptorSet.Buffer dstArrayElement(@NativeType("uint32_t") int value) { VkWriteDescriptorSet.ndstArrayElement(address(), value); return this; }
        /** Sets the specified value to the {@link VkWriteDescriptorSet#descriptorCount} field. */
        public VkWriteDescriptorSet.Buffer descriptorCount(@NativeType("uint32_t") int value) { VkWriteDescriptorSet.ndescriptorCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkWriteDescriptorSet#descriptorType} field. */
        public VkWriteDescriptorSet.Buffer descriptorType(@NativeType("VkDescriptorType") int value) { VkWriteDescriptorSet.ndescriptorType(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorImageInfo.Buffer} to the {@link VkWriteDescriptorSet#pImageInfo} field. */
        public VkWriteDescriptorSet.Buffer pImageInfo(@Nullable @NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo.Buffer value) { VkWriteDescriptorSet.npImageInfo(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorBufferInfo.Buffer} to the {@link VkWriteDescriptorSet#pBufferInfo} field. */
        public VkWriteDescriptorSet.Buffer pBufferInfo(@Nullable @NativeType("VkDescriptorBufferInfo const *") VkDescriptorBufferInfo.Buffer value) { VkWriteDescriptorSet.npBufferInfo(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkWriteDescriptorSet#pTexelBufferView} field. */
        public VkWriteDescriptorSet.Buffer pTexelBufferView(@Nullable @NativeType("VkBufferView const *") LongBuffer value) { VkWriteDescriptorSet.npTexelBufferView(address(), value); return this; }

    }

}