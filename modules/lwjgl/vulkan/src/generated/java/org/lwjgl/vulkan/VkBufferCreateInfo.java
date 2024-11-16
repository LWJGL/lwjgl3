/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the parameters of a newly created buffer object.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@code pNext} chain includes a {@link VkBufferUsageFlags2CreateInfoKHR} structure, {@link VkBufferUsageFlags2CreateInfoKHR}{@code ::usage} from that structure is used instead of {@code usage} from this structure.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the {@code pNext} chain does not include a {@link VkBufferUsageFlags2CreateInfoKHR} structure, {@code usage} <b>must</b> be a valid combination of {@code VkBufferUsageFlagBits} values</li>
 * <li>If the {@code pNext} chain does not include a {@link VkBufferUsageFlags2CreateInfoKHR} structure, {@code usage} <b>must</b> not be 0</li>
 * <li>{@code size} <b>must</b> be greater than 0</li>
 * <li>If {@code sharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, {@code pQueueFamilyIndices} <b>must</b> be a valid pointer to an array of {@code queueFamilyIndexCount} {@code uint32_t} values</li>
 * <li>If {@code sharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, {@code queueFamilyIndexCount} <b>must</b> be greater than 1</li>
 * <li>If {@code sharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, each element of {@code pQueueFamilyIndices} <b>must</b> be unique and <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by either {@link VK11#vkGetPhysicalDeviceQueueFamilyProperties2 GetPhysicalDeviceQueueFamilyProperties2} or {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties} for the {@code physicalDevice} that was used to create {@code device}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseBinding">{@code sparseBinding}</a> feature is not enabled, {@code flags} <b>must</b> not contain {@link VK10#VK_BUFFER_CREATE_SPARSE_BINDING_BIT BUFFER_CREATE_SPARSE_BINDING_BIT}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseResidencyBuffer">{@code sparseResidencyBuffer}</a> feature is not enabled, {@code flags} <b>must</b> not contain {@link VK10#VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseResidencyAliased">{@code sparseResidencyAliased}</a> feature is not enabled, {@code flags} <b>must</b> not contain {@link VK10#VK_BUFFER_CREATE_SPARSE_ALIASED_BIT BUFFER_CREATE_SPARSE_ALIASED_BIT}</li>
 * <li>If {@code flags} contains {@link VK10#VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT} or {@link VK10#VK_BUFFER_CREATE_SPARSE_ALIASED_BIT BUFFER_CREATE_SPARSE_ALIASED_BIT}, it <b>must</b> also contain {@link VK10#VK_BUFFER_CREATE_SPARSE_BINDING_BIT BUFFER_CREATE_SPARSE_BINDING_BIT}</li>
 * <li>If the {@code pNext} chain includes a {@link VkExternalMemoryBufferCreateInfo} structure, its {@code handleTypes} member <b>must</b> only contain bits that are also in {@link VkExternalBufferProperties}{@code ::externalMemoryProperties.compatibleHandleTypes}, as returned by {@link VK11#vkGetPhysicalDeviceExternalBufferProperties GetPhysicalDeviceExternalBufferProperties} with {@code pExternalBufferInfo→handleType} equal to any one of the handle types specified in {@link VkExternalMemoryBufferCreateInfo}{@code ::handleTypes}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-protectedMemory">{@code protectedMemory}</a> feature is not enabled, {@code flags} <b>must</b> not contain {@link VK11#VK_BUFFER_CREATE_PROTECTED_BIT BUFFER_CREATE_PROTECTED_BIT}</li>
 * <li>If any of the bits {@link VK10#VK_BUFFER_CREATE_SPARSE_BINDING_BIT BUFFER_CREATE_SPARSE_BINDING_BIT}, {@link VK10#VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT}, or {@link VK10#VK_BUFFER_CREATE_SPARSE_ALIASED_BIT BUFFER_CREATE_SPARSE_ALIASED_BIT} are set, {@link VK11#VK_BUFFER_CREATE_PROTECTED_BIT BUFFER_CREATE_PROTECTED_BIT} <b>must</b> not also be set</li>
 * <li>If the {@code pNext} chain includes a {@link VkDedicatedAllocationBufferCreateInfoNV} structure, and the {@code dedicatedAllocation} member of the chained structure is {@link VK10#VK_TRUE TRUE}, then {@code flags} <b>must</b> not include {@link VK10#VK_BUFFER_CREATE_SPARSE_BINDING_BIT BUFFER_CREATE_SPARSE_BINDING_BIT}, {@link VK10#VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT}, or {@link VK10#VK_BUFFER_CREATE_SPARSE_ALIASED_BIT BUFFER_CREATE_SPARSE_ALIASED_BIT}</li>
 * <li>If {@link VkBufferDeviceAddressCreateInfoEXT}{@code ::deviceAddress} is not zero, {@code flags} <b>must</b> include {@link VK12#VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT}</li>
 * <li>If {@link VkBufferOpaqueCaptureAddressCreateInfo}{@code ::opaqueCaptureAddress} is not zero, {@code flags} <b>must</b> include {@link VK12#VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT}</li>
 * <li>If {@code flags} includes {@link VK12#VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT}, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddressCaptureReplayEXT">{@code bufferDeviceAddressCaptureReplay}</a> feature <b>must</b> be enabled</li>
 * <li>If {@code usage} includes {@link KHRVideoDecodeQueue#VK_BUFFER_USAGE_VIDEO_DECODE_SRC_BIT_KHR BUFFER_USAGE_VIDEO_DECODE_SRC_BIT_KHR} or {@link KHRVideoDecodeQueue#VK_BUFFER_USAGE_VIDEO_DECODE_DST_BIT_KHR BUFFER_USAGE_VIDEO_DECODE_DST_BIT_KHR}, and {@code flags} does not include {@link KHRVideoMaintenance1#VK_BUFFER_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR BUFFER_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR}, then the {@code pNext} chain <b>must</b> include a {@link VkVideoProfileListInfoKHR} structure with {@code profileCount} greater than 0 and {@code pProfiles} including at least one {@link VkVideoProfileInfoKHR} structure with a {@code videoCodecOperation} member specifying a decode operation</li>
 * <li>If {@code usage} includes {@link KHRVideoEncodeQueue#VK_BUFFER_USAGE_VIDEO_ENCODE_SRC_BIT_KHR BUFFER_USAGE_VIDEO_ENCODE_SRC_BIT_KHR} or {@link KHRVideoEncodeQueue#VK_BUFFER_USAGE_VIDEO_ENCODE_DST_BIT_KHR BUFFER_USAGE_VIDEO_ENCODE_DST_BIT_KHR}, and {@code flags} does not include {@link KHRVideoMaintenance1#VK_BUFFER_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR BUFFER_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR}, then the {@code pNext} chain <b>must</b> include a {@link VkVideoProfileListInfoKHR} structure with {@code profileCount} greater than 0 and {@code pProfiles} including at least one {@link VkVideoProfileInfoKHR} structure with a {@code videoCodecOperation} member specifying an encode operation</li>
 * <li>If {@code flags} includes {@link KHRVideoMaintenance1#VK_BUFFER_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR BUFFER_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR}, then <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-videoMaintenance1">{@code videoMaintenance1}</a> <b>must</b> be enabled</li>
 * <li>{@code size} <b>must</b> be less than or equal to {@link VkPhysicalDeviceMaintenance4Properties}{@code ::maxBufferSize}</li>
 * <li>If {@code usage} includes {@link EXTDescriptorBuffer#VK_BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT}, creating this {@code VkBuffer} <b>must</b> not cause the total required space for all currently valid buffers using this flag on the device to exceed {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::samplerDescriptorBufferAddressSpaceSize} or {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::descriptorBufferAddressSpaceSize}</li>
 * <li>If {@code usage} includes {@link EXTDescriptorBuffer#VK_BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT}, creating this {@code VkBuffer} <b>must</b> not cause the total required space for all currently valid buffers using this flag on the device to exceed {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::resourceDescriptorBufferAddressSpaceSize} or {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::descriptorBufferAddressSpaceSize}</li>
 * <li>If {@code flags} includes {@link EXTDescriptorBuffer#VK_BUFFER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT BUFFER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT}, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-descriptorBufferCaptureReplay">{@code descriptorBufferCaptureReplay}</a> feature <b>must</b> be enabled</li>
 * <li>If the {@code pNext} chain includes a {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} structure, {@code flags} <b>must</b> contain {@link EXTDescriptorBuffer#VK_BUFFER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT BUFFER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT}</li>
 * <li>If {@code usage} includes {@link EXTDescriptorBuffer#VK_BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT}, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-descriptorBufferPushDescriptors">{@code descriptorBufferPushDescriptors}</a> feature <b>must</b> be enabled</li>
 * <li>If {@code usage} includes {@link EXTDescriptorBuffer#VK_BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT} <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-bufferlessPushDescriptors">{@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::bufferlessPushDescriptors}</a> <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@code usage} includes {@link EXTDescriptorBuffer#VK_BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT}, {@code usage} <b>must</b> contain at least one of {@link EXTDescriptorBuffer#VK_BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT} or {@link EXTDescriptorBuffer#VK_BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT}</li>
 * <li>If {@code flags} includes {@link VK11#VK_BUFFER_CREATE_PROTECTED_BIT BUFFER_CREATE_PROTECTED_BIT}, then {@code usage} <b>must</b> not contain any of the following bits
 * 
 * <ul>
 * <li>{@link EXTTransformFeedback#VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT}</li>
 * <li>{@link EXTTransformFeedback#VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT}</li>
 * <li>{@link EXTConditionalRendering#VK_BUFFER_USAGE_CONDITIONAL_RENDERING_BIT_EXT BUFFER_USAGE_CONDITIONAL_RENDERING_BIT_EXT}</li>
 * <li>{@link KHRAccelerationStructure#VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR}</li>
 * <li>{@link KHRAccelerationStructure#VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR BUFFER_USAGE_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR}</li>
 * <li>{@link KHRRayTracingPipeline#VK_BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR}</li>
 * <li>{@link EXTDescriptorBuffer#VK_BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT}</li>
 * <li>{@link EXTDescriptorBuffer#VK_BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
 * <li>{@link EXTDescriptorBuffer#VK_BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT}</li>
 * <li>{@link EXTOpacityMicromap#VK_BUFFER_USAGE_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT BUFFER_USAGE_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT}</li>
 * <li>{@link EXTOpacityMicromap#VK_BUFFER_USAGE_MICROMAP_STORAGE_BIT_EXT BUFFER_USAGE_MICROMAP_STORAGE_BIT_EXT}</li>
 * </ul>
 * </li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO STRUCTURE_TYPE_BUFFER_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkBufferDeviceAddressCreateInfoEXT}, {@link VkBufferOpaqueCaptureAddressCreateInfo}, {@link VkBufferUsageFlags2CreateInfoKHR}, {@link VkDedicatedAllocationBufferCreateInfoNV}, {@link VkExternalMemoryBufferCreateInfo}, {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT}, or {@link VkVideoProfileListInfoKHR}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkBufferCreateFlagBits} values</li>
 * <li>{@code sharingMode} <b>must</b> be a valid {@code VkSharingMode} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDeviceBufferMemoryRequirements}, {@link VK10#vkCreateBuffer CreateBuffer}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBufferCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBufferCreateFlags {@link #flags};
 *     VkDeviceSize {@link #size};
 *     VkBufferUsageFlags {@link #usage};
 *     VkSharingMode {@link #sharingMode};
 *     uint32_t {@link #queueFamilyIndexCount};
 *     uint32_t const * {@link #pQueueFamilyIndices};
 * }</code></pre>
 */
public class VkBufferCreateInfo extends Struct<VkBufferCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        SIZE,
        USAGE,
        SHARINGMODE,
        QUEUEFAMILYINDEXCOUNT,
        PQUEUEFAMILYINDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SIZE = layout.offsetof(3);
        USAGE = layout.offsetof(4);
        SHARINGMODE = layout.offsetof(5);
        QUEUEFAMILYINDEXCOUNT = layout.offsetof(6);
        PQUEUEFAMILYINDICES = layout.offsetof(7);
    }

    protected VkBufferCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBufferCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkBufferCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkBufferCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferCreateInfo(ByteBuffer container) {
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
    /** a bitmask of {@code VkBufferCreateFlagBits} specifying additional parameters of the buffer. */
    @NativeType("VkBufferCreateFlags")
    public int flags() { return nflags(address()); }
    /** the size in bytes of the buffer to be created. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** a bitmask of {@code VkBufferUsageFlagBits} specifying allowed usages of the buffer. */
    @NativeType("VkBufferUsageFlags")
    public int usage() { return nusage(address()); }
    /** a {@code VkSharingMode} value specifying the sharing mode of the buffer when it will be accessed by multiple queue families. */
    @NativeType("VkSharingMode")
    public int sharingMode() { return nsharingMode(address()); }
    /** the number of entries in the {@code pQueueFamilyIndices} array. */
    @NativeType("uint32_t")
    public int queueFamilyIndexCount() { return nqueueFamilyIndexCount(address()); }
    /** a pointer to an array of queue families that will access this buffer. It is ignored if {@code sharingMode} is not {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pQueueFamilyIndices() { return npQueueFamilyIndices(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkBufferCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO STRUCTURE_TYPE_BUFFER_CREATE_INFO} value to the {@link #sType} field. */
    public VkBufferCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkBufferCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkBufferDeviceAddressCreateInfoEXT} value to the {@code pNext} chain. */
    public VkBufferCreateInfo pNext(VkBufferDeviceAddressCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkBufferOpaqueCaptureAddressCreateInfo} value to the {@code pNext} chain. */
    public VkBufferCreateInfo pNext(VkBufferOpaqueCaptureAddressCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkBufferOpaqueCaptureAddressCreateInfoKHR} value to the {@code pNext} chain. */
    public VkBufferCreateInfo pNext(VkBufferOpaqueCaptureAddressCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkBufferUsageFlags2CreateInfoKHR} value to the {@code pNext} chain. */
    public VkBufferCreateInfo pNext(VkBufferUsageFlags2CreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDedicatedAllocationBufferCreateInfoNV} value to the {@code pNext} chain. */
    public VkBufferCreateInfo pNext(VkDedicatedAllocationBufferCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExternalMemoryBufferCreateInfo} value to the {@code pNext} chain. */
    public VkBufferCreateInfo pNext(VkExternalMemoryBufferCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExternalMemoryBufferCreateInfoKHR} value to the {@code pNext} chain. */
    public VkBufferCreateInfo pNext(VkExternalMemoryBufferCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} value to the {@code pNext} chain. */
    public VkBufferCreateInfo pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoProfileListInfoKHR} value to the {@code pNext} chain. */
    public VkBufferCreateInfo pNext(VkVideoProfileListInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkBufferCreateInfo flags(@NativeType("VkBufferCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #size} field. */
    public VkBufferCreateInfo size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@link #usage} field. */
    public VkBufferCreateInfo usage(@NativeType("VkBufferUsageFlags") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@link #sharingMode} field. */
    public VkBufferCreateInfo sharingMode(@NativeType("VkSharingMode") int value) { nsharingMode(address(), value); return this; }
    /** Sets the specified value to the {@link #queueFamilyIndexCount} field. */
    public VkBufferCreateInfo queueFamilyIndexCount(@NativeType("uint32_t") int value) { nqueueFamilyIndexCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pQueueFamilyIndices} field. */
    public VkBufferCreateInfo pQueueFamilyIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npQueueFamilyIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBufferCreateInfo set(
        int sType,
        long pNext,
        int flags,
        long size,
        int usage,
        int sharingMode,
        int queueFamilyIndexCount,
        @Nullable IntBuffer pQueueFamilyIndices
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        size(size);
        usage(usage);
        sharingMode(sharingMode);
        queueFamilyIndexCount(queueFamilyIndexCount);
        pQueueFamilyIndices(pQueueFamilyIndices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBufferCreateInfo set(VkBufferCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferCreateInfo malloc() {
        return new VkBufferCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBufferCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferCreateInfo calloc() {
        return new VkBufferCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBufferCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkBufferCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkBufferCreateInfo} instance for the specified memory address. */
    public static VkBufferCreateInfo create(long address) {
        return new VkBufferCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBufferCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkBufferCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkBufferCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBufferCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBufferCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkBufferCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferCreateInfo malloc(MemoryStack stack) {
        return new VkBufferCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBufferCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferCreateInfo calloc(MemoryStack stack) {
        return new VkBufferCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBufferCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBufferCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBufferCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkBufferCreateInfo.FLAGS); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkBufferCreateInfo.SIZE); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return memGetInt(struct + VkBufferCreateInfo.USAGE); }
    /** Unsafe version of {@link #sharingMode}. */
    public static int nsharingMode(long struct) { return memGetInt(struct + VkBufferCreateInfo.SHARINGMODE); }
    /** Unsafe version of {@link #queueFamilyIndexCount}. */
    public static int nqueueFamilyIndexCount(long struct) { return memGetInt(struct + VkBufferCreateInfo.QUEUEFAMILYINDEXCOUNT); }
    /** Unsafe version of {@link #pQueueFamilyIndices() pQueueFamilyIndices}. */
    public static @Nullable IntBuffer npQueueFamilyIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkBufferCreateInfo.PQUEUEFAMILYINDICES), nqueueFamilyIndexCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBufferCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBufferCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkBufferCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + VkBufferCreateInfo.SIZE, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { memPutInt(struct + VkBufferCreateInfo.USAGE, value); }
    /** Unsafe version of {@link #sharingMode(int) sharingMode}. */
    public static void nsharingMode(long struct, int value) { memPutInt(struct + VkBufferCreateInfo.SHARINGMODE, value); }
    /** Sets the specified value to the {@code queueFamilyIndexCount} field of the specified {@code struct}. */
    public static void nqueueFamilyIndexCount(long struct, int value) { memPutInt(struct + VkBufferCreateInfo.QUEUEFAMILYINDEXCOUNT, value); }
    /** Unsafe version of {@link #pQueueFamilyIndices(IntBuffer) pQueueFamilyIndices}. */
    public static void npQueueFamilyIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkBufferCreateInfo.PQUEUEFAMILYINDICES, memAddressSafe(value)); if (value != null) { nqueueFamilyIndexCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkBufferCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkBufferCreateInfo, Buffer> implements NativeResource {

        private static final VkBufferCreateInfo ELEMENT_FACTORY = VkBufferCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkBufferCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkBufferCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBufferCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBufferCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkBufferCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBufferCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkBufferCreateInfo#flags} field. */
        @NativeType("VkBufferCreateFlags")
        public int flags() { return VkBufferCreateInfo.nflags(address()); }
        /** @return the value of the {@link VkBufferCreateInfo#size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkBufferCreateInfo.nsize(address()); }
        /** @return the value of the {@link VkBufferCreateInfo#usage} field. */
        @NativeType("VkBufferUsageFlags")
        public int usage() { return VkBufferCreateInfo.nusage(address()); }
        /** @return the value of the {@link VkBufferCreateInfo#sharingMode} field. */
        @NativeType("VkSharingMode")
        public int sharingMode() { return VkBufferCreateInfo.nsharingMode(address()); }
        /** @return the value of the {@link VkBufferCreateInfo#queueFamilyIndexCount} field. */
        @NativeType("uint32_t")
        public int queueFamilyIndexCount() { return VkBufferCreateInfo.nqueueFamilyIndexCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkBufferCreateInfo#pQueueFamilyIndices} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pQueueFamilyIndices() { return VkBufferCreateInfo.npQueueFamilyIndices(address()); }

        /** Sets the specified value to the {@link VkBufferCreateInfo#sType} field. */
        public VkBufferCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO STRUCTURE_TYPE_BUFFER_CREATE_INFO} value to the {@link VkBufferCreateInfo#sType} field. */
        public VkBufferCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO); }
        /** Sets the specified value to the {@link VkBufferCreateInfo#pNext} field. */
        public VkBufferCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkBufferCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkBufferDeviceAddressCreateInfoEXT} value to the {@code pNext} chain. */
        public VkBufferCreateInfo.Buffer pNext(VkBufferDeviceAddressCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkBufferOpaqueCaptureAddressCreateInfo} value to the {@code pNext} chain. */
        public VkBufferCreateInfo.Buffer pNext(VkBufferOpaqueCaptureAddressCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkBufferOpaqueCaptureAddressCreateInfoKHR} value to the {@code pNext} chain. */
        public VkBufferCreateInfo.Buffer pNext(VkBufferOpaqueCaptureAddressCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkBufferUsageFlags2CreateInfoKHR} value to the {@code pNext} chain. */
        public VkBufferCreateInfo.Buffer pNext(VkBufferUsageFlags2CreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDedicatedAllocationBufferCreateInfoNV} value to the {@code pNext} chain. */
        public VkBufferCreateInfo.Buffer pNext(VkDedicatedAllocationBufferCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExternalMemoryBufferCreateInfo} value to the {@code pNext} chain. */
        public VkBufferCreateInfo.Buffer pNext(VkExternalMemoryBufferCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExternalMemoryBufferCreateInfoKHR} value to the {@code pNext} chain. */
        public VkBufferCreateInfo.Buffer pNext(VkExternalMemoryBufferCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} value to the {@code pNext} chain. */
        public VkBufferCreateInfo.Buffer pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoProfileListInfoKHR} value to the {@code pNext} chain. */
        public VkBufferCreateInfo.Buffer pNext(VkVideoProfileListInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkBufferCreateInfo#flags} field. */
        public VkBufferCreateInfo.Buffer flags(@NativeType("VkBufferCreateFlags") int value) { VkBufferCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferCreateInfo#size} field. */
        public VkBufferCreateInfo.Buffer size(@NativeType("VkDeviceSize") long value) { VkBufferCreateInfo.nsize(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferCreateInfo#usage} field. */
        public VkBufferCreateInfo.Buffer usage(@NativeType("VkBufferUsageFlags") int value) { VkBufferCreateInfo.nusage(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferCreateInfo#sharingMode} field. */
        public VkBufferCreateInfo.Buffer sharingMode(@NativeType("VkSharingMode") int value) { VkBufferCreateInfo.nsharingMode(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferCreateInfo#queueFamilyIndexCount} field. */
        public VkBufferCreateInfo.Buffer queueFamilyIndexCount(@NativeType("uint32_t") int value) { VkBufferCreateInfo.nqueueFamilyIndexCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkBufferCreateInfo#pQueueFamilyIndices} field. */
        public VkBufferCreateInfo.Buffer pQueueFamilyIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkBufferCreateInfo.npQueueFamilyIndices(address(), value); return this; }

    }

}