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
 * Structure specifying descriptor data.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">{@code nullDescriptor}</a> feature is enabled, {@code pSampledImage}, {@code pStorageImage}, {@code pUniformTexelBuffer}, {@code pStorageTexelBuffer}, {@code pUniformBuffer}, and {@code pStorageBuffer} <b>can</b> each be {@code NULL}. Loads from a null descriptor return zero values and stores and atomics to a null descriptor are discarded.</p>
 * 
 * <p>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">{@code nullDescriptor}</a> feature is enabled, {@code accelerationStructure} <b>can</b> be 0. A null acceleration structure descriptor results in the miss shader being invoked.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@link VkDescriptorGetInfoEXT}:{@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER}, and {@code pUniformBuffer→address} is the address of a non-sparse buffer, then that buffer <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>If {@link VkDescriptorGetInfoEXT}:{@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER}, and {@code pStorageBuffer→address} is the address of a non-sparse buffer, then that buffer <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>If {@link VkDescriptorGetInfoEXT}:{@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER}, and {@code pUniformTexelBuffer→address} is the address of a non-sparse buffer, then that buffer <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>If {@link VkDescriptorGetInfoEXT}:{@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER}, and {@code pStorageTexelBuffer→address} is the address of a non-sparse buffer, then that buffer <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>If {@link VkDescriptorGetInfoEXT}:{@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">{@code nullDescriptor}</a> feature is not enabled, {@code pCombinedImageSampler→imageView} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@link VkDescriptorGetInfoEXT}:{@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">{@code nullDescriptor}</a> feature is not enabled, {@code pSampledImage} <b>must</b> not be {@code NULL} and {@code pSampledImage→imageView} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@link VkDescriptorGetInfoEXT}:{@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">{@code nullDescriptor}</a> feature is not enabled, {@code pStorageImage} <b>must</b> not be {@code NULL} and {@code pStorageImage→imageView} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@link VkDescriptorGetInfoEXT}:{@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">{@code nullDescriptor}</a> feature is not enabled, {@code pUniformTexelBuffer} <b>must</b> not be {@code NULL}</li>
 * <li>If {@link VkDescriptorGetInfoEXT}:{@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">{@code nullDescriptor}</a> feature is not enabled, {@code pStorageTexelBuffer} <b>must</b> not be {@code NULL}</li>
 * <li>If {@link VkDescriptorGetInfoEXT}:{@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">{@code nullDescriptor}</a> feature is not enabled, {@code pUniformBuffer} <b>must</b> not be {@code NULL}</li>
 * <li>If {@link VkDescriptorGetInfoEXT}:{@code type} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">{@code nullDescriptor}</a> feature is not enabled, {@code pStorageBuffer} <b>must</b> not be {@code NULL}</li>
 * <li>If {@link VkDescriptorGetInfoEXT}:{@code type} is {@link KHRAccelerationStructure#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">{@code nullDescriptor}</a> feature is not enabled, {@code accelerationStructure} <b>must</b> not be 0</li>
 * <li>If {@link VkDescriptorGetInfoEXT}:{@code type} is {@link NVRayTracing#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">{@code nullDescriptor}</a> feature is not enabled, {@code accelerationStructure} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDescriptorAddressInfoEXT}, {@link VkDescriptorGetInfoEXT}, {@link VkDescriptorImageInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union VkDescriptorDataEXT {
 *     VkSampler const * {@link #pSampler};
 *     {@link VkDescriptorImageInfo VkDescriptorImageInfo} const * {@link #pCombinedImageSampler};
 *     {@link VkDescriptorImageInfo VkDescriptorImageInfo} const * {@link #pInputAttachmentImage};
 *     {@link VkDescriptorImageInfo VkDescriptorImageInfo} const * {@link #pSampledImage};
 *     {@link VkDescriptorImageInfo VkDescriptorImageInfo} const * {@link #pStorageImage};
 *     {@link VkDescriptorAddressInfoEXT VkDescriptorAddressInfoEXT} const * {@link #pUniformTexelBuffer};
 *     {@link VkDescriptorAddressInfoEXT VkDescriptorAddressInfoEXT} const * {@link #pStorageTexelBuffer};
 *     {@link VkDescriptorAddressInfoEXT VkDescriptorAddressInfoEXT} const * {@link #pUniformBuffer};
 *     {@link VkDescriptorAddressInfoEXT VkDescriptorAddressInfoEXT} const * {@link #pStorageBuffer};
 *     VkDeviceAddress {@link #accelerationStructure};
 * }</code></pre>
 */
public class VkDescriptorDataEXT extends Struct<VkDescriptorDataEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PSAMPLER,
        PCOMBINEDIMAGESAMPLER,
        PINPUTATTACHMENTIMAGE,
        PSAMPLEDIMAGE,
        PSTORAGEIMAGE,
        PUNIFORMTEXELBUFFER,
        PSTORAGETEXELBUFFER,
        PUNIFORMBUFFER,
        PSTORAGEBUFFER,
        ACCELERATIONSTRUCTURE;

    static {
        Layout layout = __union(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PSAMPLER = layout.offsetof(0);
        PCOMBINEDIMAGESAMPLER = layout.offsetof(1);
        PINPUTATTACHMENTIMAGE = layout.offsetof(2);
        PSAMPLEDIMAGE = layout.offsetof(3);
        PSTORAGEIMAGE = layout.offsetof(4);
        PUNIFORMTEXELBUFFER = layout.offsetof(5);
        PSTORAGETEXELBUFFER = layout.offsetof(6);
        PUNIFORMBUFFER = layout.offsetof(7);
        PSTORAGEBUFFER = layout.offsetof(8);
        ACCELERATIONSTRUCTURE = layout.offsetof(9);
    }

    protected VkDescriptorDataEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorDataEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorDataEXT(address, container);
    }

    /**
     * Creates a {@code VkDescriptorDataEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorDataEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return a pointer to a {@code VkSampler} handle specifying the parameters of a {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER} descriptor.
     */
    @NativeType("VkSampler const *")
    public LongBuffer pSampler(int capacity) { return npSampler(address(), capacity); }
    /** a pointer to a {@link VkDescriptorImageInfo} structure specifying the parameters of a {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} descriptor. */
    @NativeType("VkDescriptorImageInfo const *")
    public VkDescriptorImageInfo pCombinedImageSampler() { return npCombinedImageSampler(address()); }
    /** a pointer to a {@link VkDescriptorImageInfo} structure specifying the parameters of a {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} descriptor. */
    @NativeType("VkDescriptorImageInfo const *")
    public VkDescriptorImageInfo pInputAttachmentImage() { return npInputAttachmentImage(address()); }
    /** a pointer to a {@link VkDescriptorImageInfo} structure specifying the parameters of a {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE} descriptor. */
    @Nullable
    @NativeType("VkDescriptorImageInfo const *")
    public VkDescriptorImageInfo pSampledImage() { return npSampledImage(address()); }
    /** a pointer to a {@link VkDescriptorImageInfo} structure specifying the parameters of a {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE} descriptor. */
    @Nullable
    @NativeType("VkDescriptorImageInfo const *")
    public VkDescriptorImageInfo pStorageImage() { return npStorageImage(address()); }
    /** a pointer to a {@link VkDescriptorAddressInfoEXT} structure specifying the parameters of a {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} descriptor. */
    @Nullable
    @NativeType("VkDescriptorAddressInfoEXT const *")
    public VkDescriptorAddressInfoEXT pUniformTexelBuffer() { return npUniformTexelBuffer(address()); }
    /** a pointer to a {@link VkDescriptorAddressInfoEXT} structure specifying the parameters of a {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} descriptor. */
    @Nullable
    @NativeType("VkDescriptorAddressInfoEXT const *")
    public VkDescriptorAddressInfoEXT pStorageTexelBuffer() { return npStorageTexelBuffer(address()); }
    /** a pointer to a {@link VkDescriptorAddressInfoEXT} structure specifying the parameters of a {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} descriptor. */
    @Nullable
    @NativeType("VkDescriptorAddressInfoEXT const *")
    public VkDescriptorAddressInfoEXT pUniformBuffer() { return npUniformBuffer(address()); }
    /** a pointer to a {@link VkDescriptorAddressInfoEXT} structure specifying the parameters of a {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} descriptor. */
    @Nullable
    @NativeType("VkDescriptorAddressInfoEXT const *")
    public VkDescriptorAddressInfoEXT pStorageBuffer() { return npStorageBuffer(address()); }
    /** the address of a {@code VkAccelerationStructureKHR} specifying the parameters of a {@link KHRAccelerationStructure#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR} descriptor , or a {@code VkAccelerationStructureNV} handle specifying the parameters of a {@link NVRayTracing#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV} descriptor. */
    @NativeType("VkDeviceAddress")
    public long accelerationStructure() { return naccelerationStructure(address()); }

    /** Sets the address of the specified {@link LongBuffer} to the {@link #pSampler} field. */
    public VkDescriptorDataEXT pSampler(@NativeType("VkSampler const *") LongBuffer value) { npSampler(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorImageInfo} to the {@link #pCombinedImageSampler} field. */
    public VkDescriptorDataEXT pCombinedImageSampler(@NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) { npCombinedImageSampler(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorImageInfo} to the {@link #pInputAttachmentImage} field. */
    public VkDescriptorDataEXT pInputAttachmentImage(@NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) { npInputAttachmentImage(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorImageInfo} to the {@link #pSampledImage} field. */
    public VkDescriptorDataEXT pSampledImage(@Nullable @NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) { npSampledImage(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorImageInfo} to the {@link #pStorageImage} field. */
    public VkDescriptorDataEXT pStorageImage(@Nullable @NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) { npStorageImage(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorAddressInfoEXT} to the {@link #pUniformTexelBuffer} field. */
    public VkDescriptorDataEXT pUniformTexelBuffer(@Nullable @NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) { npUniformTexelBuffer(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorAddressInfoEXT} to the {@link #pStorageTexelBuffer} field. */
    public VkDescriptorDataEXT pStorageTexelBuffer(@Nullable @NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) { npStorageTexelBuffer(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorAddressInfoEXT} to the {@link #pUniformBuffer} field. */
    public VkDescriptorDataEXT pUniformBuffer(@Nullable @NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) { npUniformBuffer(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorAddressInfoEXT} to the {@link #pStorageBuffer} field. */
    public VkDescriptorDataEXT pStorageBuffer(@Nullable @NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) { npStorageBuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #accelerationStructure} field. */
    public VkDescriptorDataEXT accelerationStructure(@NativeType("VkDeviceAddress") long value) { naccelerationStructure(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorDataEXT set(VkDescriptorDataEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorDataEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorDataEXT malloc() {
        return new VkDescriptorDataEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorDataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorDataEXT calloc() {
        return new VkDescriptorDataEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorDataEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorDataEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorDataEXT} instance for the specified memory address. */
    public static VkDescriptorDataEXT create(long address) {
        return new VkDescriptorDataEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorDataEXT createSafe(long address) {
        return address == NULL ? null : new VkDescriptorDataEXT(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorDataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorDataEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorDataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorDataEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorDataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorDataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorDataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorDataEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorDataEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorDataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorDataEXT malloc(MemoryStack stack) {
        return new VkDescriptorDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorDataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorDataEXT calloc(MemoryStack stack) {
        return new VkDescriptorDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorDataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorDataEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorDataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorDataEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pSampler(int) pSampler}. */
    public static LongBuffer npSampler(long struct, int capacity) { return memLongBuffer(memGetAddress(struct + VkDescriptorDataEXT.PSAMPLER), capacity); }
    /** Unsafe version of {@link #pCombinedImageSampler}. */
    public static VkDescriptorImageInfo npCombinedImageSampler(long struct) { return VkDescriptorImageInfo.create(memGetAddress(struct + VkDescriptorDataEXT.PCOMBINEDIMAGESAMPLER)); }
    /** Unsafe version of {@link #pInputAttachmentImage}. */
    public static VkDescriptorImageInfo npInputAttachmentImage(long struct) { return VkDescriptorImageInfo.create(memGetAddress(struct + VkDescriptorDataEXT.PINPUTATTACHMENTIMAGE)); }
    /** Unsafe version of {@link #pSampledImage}. */
    @Nullable public static VkDescriptorImageInfo npSampledImage(long struct) { return VkDescriptorImageInfo.createSafe(memGetAddress(struct + VkDescriptorDataEXT.PSAMPLEDIMAGE)); }
    /** Unsafe version of {@link #pStorageImage}. */
    @Nullable public static VkDescriptorImageInfo npStorageImage(long struct) { return VkDescriptorImageInfo.createSafe(memGetAddress(struct + VkDescriptorDataEXT.PSTORAGEIMAGE)); }
    /** Unsafe version of {@link #pUniformTexelBuffer}. */
    @Nullable public static VkDescriptorAddressInfoEXT npUniformTexelBuffer(long struct) { return VkDescriptorAddressInfoEXT.createSafe(memGetAddress(struct + VkDescriptorDataEXT.PUNIFORMTEXELBUFFER)); }
    /** Unsafe version of {@link #pStorageTexelBuffer}. */
    @Nullable public static VkDescriptorAddressInfoEXT npStorageTexelBuffer(long struct) { return VkDescriptorAddressInfoEXT.createSafe(memGetAddress(struct + VkDescriptorDataEXT.PSTORAGETEXELBUFFER)); }
    /** Unsafe version of {@link #pUniformBuffer}. */
    @Nullable public static VkDescriptorAddressInfoEXT npUniformBuffer(long struct) { return VkDescriptorAddressInfoEXT.createSafe(memGetAddress(struct + VkDescriptorDataEXT.PUNIFORMBUFFER)); }
    /** Unsafe version of {@link #pStorageBuffer}. */
    @Nullable public static VkDescriptorAddressInfoEXT npStorageBuffer(long struct) { return VkDescriptorAddressInfoEXT.createSafe(memGetAddress(struct + VkDescriptorDataEXT.PSTORAGEBUFFER)); }
    /** Unsafe version of {@link #accelerationStructure}. */
    public static long naccelerationStructure(long struct) { return UNSAFE.getLong(null, struct + VkDescriptorDataEXT.ACCELERATIONSTRUCTURE); }

    /** Unsafe version of {@link #pSampler(LongBuffer) pSampler}. */
    public static void npSampler(long struct, LongBuffer value) { memPutAddress(struct + VkDescriptorDataEXT.PSAMPLER, memAddress(value)); }
    /** Unsafe version of {@link #pCombinedImageSampler(VkDescriptorImageInfo) pCombinedImageSampler}. */
    public static void npCombinedImageSampler(long struct, VkDescriptorImageInfo value) { memPutAddress(struct + VkDescriptorDataEXT.PCOMBINEDIMAGESAMPLER, value.address()); }
    /** Unsafe version of {@link #pInputAttachmentImage(VkDescriptorImageInfo) pInputAttachmentImage}. */
    public static void npInputAttachmentImage(long struct, VkDescriptorImageInfo value) { memPutAddress(struct + VkDescriptorDataEXT.PINPUTATTACHMENTIMAGE, value.address()); }
    /** Unsafe version of {@link #pSampledImage(VkDescriptorImageInfo) pSampledImage}. */
    public static void npSampledImage(long struct, @Nullable VkDescriptorImageInfo value) { memPutAddress(struct + VkDescriptorDataEXT.PSAMPLEDIMAGE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pStorageImage(VkDescriptorImageInfo) pStorageImage}. */
    public static void npStorageImage(long struct, @Nullable VkDescriptorImageInfo value) { memPutAddress(struct + VkDescriptorDataEXT.PSTORAGEIMAGE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pUniformTexelBuffer(VkDescriptorAddressInfoEXT) pUniformTexelBuffer}. */
    public static void npUniformTexelBuffer(long struct, @Nullable VkDescriptorAddressInfoEXT value) { memPutAddress(struct + VkDescriptorDataEXT.PUNIFORMTEXELBUFFER, memAddressSafe(value)); }
    /** Unsafe version of {@link #pStorageTexelBuffer(VkDescriptorAddressInfoEXT) pStorageTexelBuffer}. */
    public static void npStorageTexelBuffer(long struct, @Nullable VkDescriptorAddressInfoEXT value) { memPutAddress(struct + VkDescriptorDataEXT.PSTORAGETEXELBUFFER, memAddressSafe(value)); }
    /** Unsafe version of {@link #pUniformBuffer(VkDescriptorAddressInfoEXT) pUniformBuffer}. */
    public static void npUniformBuffer(long struct, @Nullable VkDescriptorAddressInfoEXT value) { memPutAddress(struct + VkDescriptorDataEXT.PUNIFORMBUFFER, memAddressSafe(value)); }
    /** Unsafe version of {@link #pStorageBuffer(VkDescriptorAddressInfoEXT) pStorageBuffer}. */
    public static void npStorageBuffer(long struct, @Nullable VkDescriptorAddressInfoEXT value) { memPutAddress(struct + VkDescriptorDataEXT.PSTORAGEBUFFER, memAddressSafe(value)); }
    /** Unsafe version of {@link #accelerationStructure(long) accelerationStructure}. */
    public static void naccelerationStructure(long struct, long value) { UNSAFE.putLong(null, struct + VkDescriptorDataEXT.ACCELERATIONSTRUCTURE, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorDataEXT} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorDataEXT, Buffer> implements NativeResource {

        private static final VkDescriptorDataEXT ELEMENT_FACTORY = VkDescriptorDataEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorDataEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorDataEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /**
         * @return a {@link LongBuffer} view of the data pointed to by the {@link VkDescriptorDataEXT#pSampler} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("VkSampler const *")
        public LongBuffer pSampler(int capacity) { return VkDescriptorDataEXT.npSampler(address(), capacity); }
        /** @return a {@link VkDescriptorImageInfo} view of the struct pointed to by the {@link VkDescriptorDataEXT#pCombinedImageSampler} field. */
        @NativeType("VkDescriptorImageInfo const *")
        public VkDescriptorImageInfo pCombinedImageSampler() { return VkDescriptorDataEXT.npCombinedImageSampler(address()); }
        /** @return a {@link VkDescriptorImageInfo} view of the struct pointed to by the {@link VkDescriptorDataEXT#pInputAttachmentImage} field. */
        @NativeType("VkDescriptorImageInfo const *")
        public VkDescriptorImageInfo pInputAttachmentImage() { return VkDescriptorDataEXT.npInputAttachmentImage(address()); }
        /** @return a {@link VkDescriptorImageInfo} view of the struct pointed to by the {@link VkDescriptorDataEXT#pSampledImage} field. */
        @Nullable
        @NativeType("VkDescriptorImageInfo const *")
        public VkDescriptorImageInfo pSampledImage() { return VkDescriptorDataEXT.npSampledImage(address()); }
        /** @return a {@link VkDescriptorImageInfo} view of the struct pointed to by the {@link VkDescriptorDataEXT#pStorageImage} field. */
        @Nullable
        @NativeType("VkDescriptorImageInfo const *")
        public VkDescriptorImageInfo pStorageImage() { return VkDescriptorDataEXT.npStorageImage(address()); }
        /** @return a {@link VkDescriptorAddressInfoEXT} view of the struct pointed to by the {@link VkDescriptorDataEXT#pUniformTexelBuffer} field. */
        @Nullable
        @NativeType("VkDescriptorAddressInfoEXT const *")
        public VkDescriptorAddressInfoEXT pUniformTexelBuffer() { return VkDescriptorDataEXT.npUniformTexelBuffer(address()); }
        /** @return a {@link VkDescriptorAddressInfoEXT} view of the struct pointed to by the {@link VkDescriptorDataEXT#pStorageTexelBuffer} field. */
        @Nullable
        @NativeType("VkDescriptorAddressInfoEXT const *")
        public VkDescriptorAddressInfoEXT pStorageTexelBuffer() { return VkDescriptorDataEXT.npStorageTexelBuffer(address()); }
        /** @return a {@link VkDescriptorAddressInfoEXT} view of the struct pointed to by the {@link VkDescriptorDataEXT#pUniformBuffer} field. */
        @Nullable
        @NativeType("VkDescriptorAddressInfoEXT const *")
        public VkDescriptorAddressInfoEXT pUniformBuffer() { return VkDescriptorDataEXT.npUniformBuffer(address()); }
        /** @return a {@link VkDescriptorAddressInfoEXT} view of the struct pointed to by the {@link VkDescriptorDataEXT#pStorageBuffer} field. */
        @Nullable
        @NativeType("VkDescriptorAddressInfoEXT const *")
        public VkDescriptorAddressInfoEXT pStorageBuffer() { return VkDescriptorDataEXT.npStorageBuffer(address()); }
        /** @return the value of the {@link VkDescriptorDataEXT#accelerationStructure} field. */
        @NativeType("VkDeviceAddress")
        public long accelerationStructure() { return VkDescriptorDataEXT.naccelerationStructure(address()); }

        /** Sets the address of the specified {@link LongBuffer} to the {@link VkDescriptorDataEXT#pSampler} field. */
        public VkDescriptorDataEXT.Buffer pSampler(@NativeType("VkSampler const *") LongBuffer value) { VkDescriptorDataEXT.npSampler(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorImageInfo} to the {@link VkDescriptorDataEXT#pCombinedImageSampler} field. */
        public VkDescriptorDataEXT.Buffer pCombinedImageSampler(@NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) { VkDescriptorDataEXT.npCombinedImageSampler(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorImageInfo} to the {@link VkDescriptorDataEXT#pInputAttachmentImage} field. */
        public VkDescriptorDataEXT.Buffer pInputAttachmentImage(@NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) { VkDescriptorDataEXT.npInputAttachmentImage(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorImageInfo} to the {@link VkDescriptorDataEXT#pSampledImage} field. */
        public VkDescriptorDataEXT.Buffer pSampledImage(@Nullable @NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) { VkDescriptorDataEXT.npSampledImage(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorImageInfo} to the {@link VkDescriptorDataEXT#pStorageImage} field. */
        public VkDescriptorDataEXT.Buffer pStorageImage(@Nullable @NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo value) { VkDescriptorDataEXT.npStorageImage(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorAddressInfoEXT} to the {@link VkDescriptorDataEXT#pUniformTexelBuffer} field. */
        public VkDescriptorDataEXT.Buffer pUniformTexelBuffer(@Nullable @NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) { VkDescriptorDataEXT.npUniformTexelBuffer(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorAddressInfoEXT} to the {@link VkDescriptorDataEXT#pStorageTexelBuffer} field. */
        public VkDescriptorDataEXT.Buffer pStorageTexelBuffer(@Nullable @NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) { VkDescriptorDataEXT.npStorageTexelBuffer(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorAddressInfoEXT} to the {@link VkDescriptorDataEXT#pUniformBuffer} field. */
        public VkDescriptorDataEXT.Buffer pUniformBuffer(@Nullable @NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) { VkDescriptorDataEXT.npUniformBuffer(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorAddressInfoEXT} to the {@link VkDescriptorDataEXT#pStorageBuffer} field. */
        public VkDescriptorDataEXT.Buffer pStorageBuffer(@Nullable @NativeType("VkDescriptorAddressInfoEXT const *") VkDescriptorAddressInfoEXT value) { VkDescriptorDataEXT.npStorageBuffer(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorDataEXT#accelerationStructure} field. */
        public VkDescriptorDataEXT.Buffer accelerationStructure(@NativeType("VkDeviceAddress") long value) { VkDescriptorDataEXT.naccelerationStructure(address(), value); return this; }

    }

}