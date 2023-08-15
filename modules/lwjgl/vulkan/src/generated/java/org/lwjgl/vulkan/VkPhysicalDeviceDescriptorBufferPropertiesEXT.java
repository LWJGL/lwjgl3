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
 * Structure describing descriptor buffer properties supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>A descriptor binding with type {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE} has a descriptor size which is implied by the descriptor types included in the {@link VkMutableDescriptorTypeCreateInfoVALVE}{@code ::pDescriptorTypes} list. The descriptor size is equal to the maximum size of any descriptor type included in the {@code pDescriptorTypes} list.</p>
 * 
 * <p>As there is no way to request robust and non-robust descriptors separately, or specify robust/non-robust descriptors in the set layout, if <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> is enabled then robust descriptors are always used.</p>
 * 
 * <p>If the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDescriptorBufferPropertiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #combinedImageSamplerDescriptorSingleArray};
 *     VkBool32 {@link #bufferlessPushDescriptors};
 *     VkBool32 {@link #allowSamplerImageViewPostSubmitCreation};
 *     VkDeviceSize {@link #descriptorBufferOffsetAlignment};
 *     uint32_t {@link #maxDescriptorBufferBindings};
 *     uint32_t {@link #maxResourceDescriptorBufferBindings};
 *     uint32_t {@link #maxSamplerDescriptorBufferBindings};
 *     uint32_t {@link #maxEmbeddedImmutableSamplerBindings};
 *     uint32_t {@link #maxEmbeddedImmutableSamplers};
 *     size_t {@link #bufferCaptureReplayDescriptorDataSize};
 *     size_t {@link #imageCaptureReplayDescriptorDataSize};
 *     size_t {@link #imageViewCaptureReplayDescriptorDataSize};
 *     size_t {@link #samplerCaptureReplayDescriptorDataSize};
 *     size_t {@link #accelerationStructureCaptureReplayDescriptorDataSize};
 *     size_t {@link #samplerDescriptorSize};
 *     size_t {@link #combinedImageSamplerDescriptorSize};
 *     size_t {@link #sampledImageDescriptorSize};
 *     size_t {@link #storageImageDescriptorSize};
 *     size_t {@link #uniformTexelBufferDescriptorSize};
 *     size_t {@link #robustUniformTexelBufferDescriptorSize};
 *     size_t {@link #storageTexelBufferDescriptorSize};
 *     size_t {@link #robustStorageTexelBufferDescriptorSize};
 *     size_t {@link #uniformBufferDescriptorSize};
 *     size_t {@link #robustUniformBufferDescriptorSize};
 *     size_t {@link #storageBufferDescriptorSize};
 *     size_t {@link #robustStorageBufferDescriptorSize};
 *     size_t {@link #inputAttachmentDescriptorSize};
 *     size_t {@link #accelerationStructureDescriptorSize};
 *     VkDeviceSize {@link #maxSamplerDescriptorBufferRange};
 *     VkDeviceSize {@link #maxResourceDescriptorBufferRange};
 *     VkDeviceSize {@link #samplerDescriptorBufferAddressSpaceSize};
 *     VkDeviceSize {@link #resourceDescriptorBufferAddressSpaceSize};
 *     VkDeviceSize {@link #descriptorBufferAddressSpaceSize};
 * }</code></pre>
 */
public class VkPhysicalDeviceDescriptorBufferPropertiesEXT extends Struct<VkPhysicalDeviceDescriptorBufferPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COMBINEDIMAGESAMPLERDESCRIPTORSINGLEARRAY,
        BUFFERLESSPUSHDESCRIPTORS,
        ALLOWSAMPLERIMAGEVIEWPOSTSUBMITCREATION,
        DESCRIPTORBUFFEROFFSETALIGNMENT,
        MAXDESCRIPTORBUFFERBINDINGS,
        MAXRESOURCEDESCRIPTORBUFFERBINDINGS,
        MAXSAMPLERDESCRIPTORBUFFERBINDINGS,
        MAXEMBEDDEDIMMUTABLESAMPLERBINDINGS,
        MAXEMBEDDEDIMMUTABLESAMPLERS,
        BUFFERCAPTUREREPLAYDESCRIPTORDATASIZE,
        IMAGECAPTUREREPLAYDESCRIPTORDATASIZE,
        IMAGEVIEWCAPTUREREPLAYDESCRIPTORDATASIZE,
        SAMPLERCAPTUREREPLAYDESCRIPTORDATASIZE,
        ACCELERATIONSTRUCTURECAPTUREREPLAYDESCRIPTORDATASIZE,
        SAMPLERDESCRIPTORSIZE,
        COMBINEDIMAGESAMPLERDESCRIPTORSIZE,
        SAMPLEDIMAGEDESCRIPTORSIZE,
        STORAGEIMAGEDESCRIPTORSIZE,
        UNIFORMTEXELBUFFERDESCRIPTORSIZE,
        ROBUSTUNIFORMTEXELBUFFERDESCRIPTORSIZE,
        STORAGETEXELBUFFERDESCRIPTORSIZE,
        ROBUSTSTORAGETEXELBUFFERDESCRIPTORSIZE,
        UNIFORMBUFFERDESCRIPTORSIZE,
        ROBUSTUNIFORMBUFFERDESCRIPTORSIZE,
        STORAGEBUFFERDESCRIPTORSIZE,
        ROBUSTSTORAGEBUFFERDESCRIPTORSIZE,
        INPUTATTACHMENTDESCRIPTORSIZE,
        ACCELERATIONSTRUCTUREDESCRIPTORSIZE,
        MAXSAMPLERDESCRIPTORBUFFERRANGE,
        MAXRESOURCEDESCRIPTORBUFFERRANGE,
        SAMPLERDESCRIPTORBUFFERADDRESSSPACESIZE,
        RESOURCEDESCRIPTORBUFFERADDRESSSPACESIZE,
        DESCRIPTORBUFFERADDRESSSPACESIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMBINEDIMAGESAMPLERDESCRIPTORSINGLEARRAY = layout.offsetof(2);
        BUFFERLESSPUSHDESCRIPTORS = layout.offsetof(3);
        ALLOWSAMPLERIMAGEVIEWPOSTSUBMITCREATION = layout.offsetof(4);
        DESCRIPTORBUFFEROFFSETALIGNMENT = layout.offsetof(5);
        MAXDESCRIPTORBUFFERBINDINGS = layout.offsetof(6);
        MAXRESOURCEDESCRIPTORBUFFERBINDINGS = layout.offsetof(7);
        MAXSAMPLERDESCRIPTORBUFFERBINDINGS = layout.offsetof(8);
        MAXEMBEDDEDIMMUTABLESAMPLERBINDINGS = layout.offsetof(9);
        MAXEMBEDDEDIMMUTABLESAMPLERS = layout.offsetof(10);
        BUFFERCAPTUREREPLAYDESCRIPTORDATASIZE = layout.offsetof(11);
        IMAGECAPTUREREPLAYDESCRIPTORDATASIZE = layout.offsetof(12);
        IMAGEVIEWCAPTUREREPLAYDESCRIPTORDATASIZE = layout.offsetof(13);
        SAMPLERCAPTUREREPLAYDESCRIPTORDATASIZE = layout.offsetof(14);
        ACCELERATIONSTRUCTURECAPTUREREPLAYDESCRIPTORDATASIZE = layout.offsetof(15);
        SAMPLERDESCRIPTORSIZE = layout.offsetof(16);
        COMBINEDIMAGESAMPLERDESCRIPTORSIZE = layout.offsetof(17);
        SAMPLEDIMAGEDESCRIPTORSIZE = layout.offsetof(18);
        STORAGEIMAGEDESCRIPTORSIZE = layout.offsetof(19);
        UNIFORMTEXELBUFFERDESCRIPTORSIZE = layout.offsetof(20);
        ROBUSTUNIFORMTEXELBUFFERDESCRIPTORSIZE = layout.offsetof(21);
        STORAGETEXELBUFFERDESCRIPTORSIZE = layout.offsetof(22);
        ROBUSTSTORAGETEXELBUFFERDESCRIPTORSIZE = layout.offsetof(23);
        UNIFORMBUFFERDESCRIPTORSIZE = layout.offsetof(24);
        ROBUSTUNIFORMBUFFERDESCRIPTORSIZE = layout.offsetof(25);
        STORAGEBUFFERDESCRIPTORSIZE = layout.offsetof(26);
        ROBUSTSTORAGEBUFFERDESCRIPTORSIZE = layout.offsetof(27);
        INPUTATTACHMENTDESCRIPTORSIZE = layout.offsetof(28);
        ACCELERATIONSTRUCTUREDESCRIPTORSIZE = layout.offsetof(29);
        MAXSAMPLERDESCRIPTORBUFFERRANGE = layout.offsetof(30);
        MAXRESOURCEDESCRIPTORBUFFERRANGE = layout.offsetof(31);
        SAMPLERDESCRIPTORBUFFERADDRESSSPACESIZE = layout.offsetof(32);
        RESOURCEDESCRIPTORBUFFERADDRESSSPACESIZE = layout.offsetof(33);
        DESCRIPTORBUFFERADDRESSSPACESIZE = layout.offsetof(34);
    }

    protected VkPhysicalDeviceDescriptorBufferPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDescriptorBufferPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDescriptorBufferPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates that the implementation does not require an array of {@code VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} descriptors to be written into a descriptor buffer as an array of image descriptors, immediately followed by an array of sampler descriptors. */
    @NativeType("VkBool32")
    public boolean combinedImageSamplerDescriptorSingleArray() { return ncombinedImageSamplerDescriptorSingleArray(address()) != 0; }
    /** indicates that the implementation does not require a buffer created with {@code VK_BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT} to be bound when using push descriptors. */
    @NativeType("VkBool32")
    public boolean bufferlessPushDescriptors() { return nbufferlessPushDescriptors(address()) != 0; }
    /** indicates that the implementation does not restrict when the {@code VkSampler} or {@code VkImageView} objects used to retrieve descriptor data <b>can</b> be created in relation to command buffer submission. If this value is {@link VK10#VK_FALSE FALSE}, then the application <b>must</b> create any {@code VkSampler} or {@code VkImageView} objects whose descriptor data is accessed during the execution of a command buffer, before the {@link VK10#vkQueueSubmit QueueSubmit} , or {@link VK13#vkQueueSubmit2 QueueSubmit2}, call that submits that command buffer. */
    @NativeType("VkBool32")
    public boolean allowSamplerImageViewPostSubmitCreation() { return nallowSamplerImageViewPostSubmitCreation(address()) != 0; }
    /** indicates the <b>required</b> alignment in bytes when setting offsets into the descriptor buffer. */
    @NativeType("VkDeviceSize")
    public long descriptorBufferOffsetAlignment() { return ndescriptorBufferOffsetAlignment(address()); }
    /** indicates the maximum sum total number of descriptor buffers and embedded immutable sampler sets that <b>can</b> be bound. */
    @NativeType("uint32_t")
    public int maxDescriptorBufferBindings() { return nmaxDescriptorBufferBindings(address()); }
    /** indicates the maximum number of resource descriptor buffers that <b>can</b> be bound. */
    @NativeType("uint32_t")
    public int maxResourceDescriptorBufferBindings() { return nmaxResourceDescriptorBufferBindings(address()); }
    /** indicates the maximum number of sampler descriptor buffers that <b>can</b> be bound. */
    @NativeType("uint32_t")
    public int maxSamplerDescriptorBufferBindings() { return nmaxSamplerDescriptorBufferBindings(address()); }
    /** indicates the maximum number of embedded immutable sampler sets that <b>can</b> be bound. */
    @NativeType("uint32_t")
    public int maxEmbeddedImmutableSamplerBindings() { return nmaxEmbeddedImmutableSamplerBindings(address()); }
    /** indicates the maximum number of unique immutable samplers in descriptor set layouts created with {@link EXTDescriptorBuffer#VK_DESCRIPTOR_SET_LAYOUT_CREATE_EMBEDDED_IMMUTABLE_SAMPLERS_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_EMBEDDED_IMMUTABLE_SAMPLERS_BIT_EXT}, and pipeline layouts created from them, which <b>can</b> simultaneously exist on a device. */
    @NativeType("uint32_t")
    public int maxEmbeddedImmutableSamplers() { return nmaxEmbeddedImmutableSamplers(address()); }
    /** indicates the maximum size in bytes of the opaque data used for capture and replay with buffers. */
    @NativeType("size_t")
    public long bufferCaptureReplayDescriptorDataSize() { return nbufferCaptureReplayDescriptorDataSize(address()); }
    /** indicates the maximum size in bytes of the opaque data used for capture and replay with images. */
    @NativeType("size_t")
    public long imageCaptureReplayDescriptorDataSize() { return nimageCaptureReplayDescriptorDataSize(address()); }
    /** indicates the maximum size in bytes of the opaque data used for capture and replay with image views. */
    @NativeType("size_t")
    public long imageViewCaptureReplayDescriptorDataSize() { return nimageViewCaptureReplayDescriptorDataSize(address()); }
    /** indicates the maximum size in bytes of the opaque data used for capture and replay with samplers. */
    @NativeType("size_t")
    public long samplerCaptureReplayDescriptorDataSize() { return nsamplerCaptureReplayDescriptorDataSize(address()); }
    /** indicates the maximum size in bytes of the opaque data used for capture and replay with acceleration structures. */
    @NativeType("size_t")
    public long accelerationStructureCaptureReplayDescriptorDataSize() { return naccelerationStructureCaptureReplayDescriptorDataSize(address()); }
    /** indicates the size in bytes of a {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER} descriptor. */
    @NativeType("size_t")
    public long samplerDescriptorSize() { return nsamplerDescriptorSize(address()); }
    /** indicates the size in bytes of a {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} descriptor. */
    @NativeType("size_t")
    public long combinedImageSamplerDescriptorSize() { return ncombinedImageSamplerDescriptorSize(address()); }
    /** indicates the size in bytes of a {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE} descriptor. */
    @NativeType("size_t")
    public long sampledImageDescriptorSize() { return nsampledImageDescriptorSize(address()); }
    /** indicates the size in bytes of a {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE} descriptor. */
    @NativeType("size_t")
    public long storageImageDescriptorSize() { return nstorageImageDescriptorSize(address()); }
    /** indicates the size in bytes of a {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} descriptor if the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled. */
    @NativeType("size_t")
    public long uniformTexelBufferDescriptorSize() { return nuniformTexelBufferDescriptorSize(address()); }
    /** indicates the size in bytes of a {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} descriptor if the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is enabled. */
    @NativeType("size_t")
    public long robustUniformTexelBufferDescriptorSize() { return nrobustUniformTexelBufferDescriptorSize(address()); }
    /** indicates the size in bytes of a {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} descriptor if the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled. */
    @NativeType("size_t")
    public long storageTexelBufferDescriptorSize() { return nstorageTexelBufferDescriptorSize(address()); }
    /** indicates the size in bytes of a {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} descriptor if the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is enabled. */
    @NativeType("size_t")
    public long robustStorageTexelBufferDescriptorSize() { return nrobustStorageTexelBufferDescriptorSize(address()); }
    /** indicates the size in bytes of a {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} descriptor. */
    @NativeType("size_t")
    public long uniformBufferDescriptorSize() { return nuniformBufferDescriptorSize(address()); }
    /** indicates the size in bytes of a {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} descriptor if the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is enabled. */
    @NativeType("size_t")
    public long robustUniformBufferDescriptorSize() { return nrobustUniformBufferDescriptorSize(address()); }
    /** indicates the size in bytes of a {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} descriptor. */
    @NativeType("size_t")
    public long storageBufferDescriptorSize() { return nstorageBufferDescriptorSize(address()); }
    /** indicates the size in bytes of a {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} descriptor if the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is enabled. */
    @NativeType("size_t")
    public long robustStorageBufferDescriptorSize() { return nrobustStorageBufferDescriptorSize(address()); }
    /** indicates the size in bytes of a {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} descriptor. */
    @NativeType("size_t")
    public long inputAttachmentDescriptorSize() { return ninputAttachmentDescriptorSize(address()); }
    /** indicates the size in bytes of a {@link KHRAccelerationStructure#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR} or {@link NVRayTracing#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV} descriptor. */
    @NativeType("size_t")
    public long accelerationStructureDescriptorSize() { return naccelerationStructureDescriptorSize(address()); }
    /** indicates the maximum range in bytes from the address of a sampler descriptor buffer binding that is accessible to a shader. */
    @NativeType("VkDeviceSize")
    public long maxSamplerDescriptorBufferRange() { return nmaxSamplerDescriptorBufferRange(address()); }
    /** indicates the maximum range in bytes from the address of a resource descriptor buffer binding that is accessible to a shader. */
    @NativeType("VkDeviceSize")
    public long maxResourceDescriptorBufferRange() { return nmaxResourceDescriptorBufferRange(address()); }
    /** indicates the total size in bytes of the address space available for descriptor buffers created with {@link EXTDescriptorBuffer#VK_BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT}. */
    @NativeType("VkDeviceSize")
    public long samplerDescriptorBufferAddressSpaceSize() { return nsamplerDescriptorBufferAddressSpaceSize(address()); }
    /** indicates the total size in bytes of the address space available for descriptor buffers created with {@link EXTDescriptorBuffer#VK_BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT}. */
    @NativeType("VkDeviceSize")
    public long resourceDescriptorBufferAddressSpaceSize() { return nresourceDescriptorBufferAddressSpaceSize(address()); }
    /** indicates the total size in bytes of the address space available for descriptor buffers created with both {@link EXTDescriptorBuffer#VK_BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT} and {@link EXTDescriptorBuffer#VK_BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT}. */
    @NativeType("VkDeviceSize")
    public long descriptorBufferAddressSpaceSize() { return ndescriptorBufferAddressSpaceSize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT set(VkPhysicalDeviceDescriptorBufferPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDescriptorBufferPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT malloc() {
        return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorBufferPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT calloc() {
        return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorBufferPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorBufferPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT create(long address) {
        return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDescriptorBufferPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorBufferPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorBufferPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #combinedImageSamplerDescriptorSingleArray}. */
    public static int ncombinedImageSamplerDescriptorSingleArray(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.COMBINEDIMAGESAMPLERDESCRIPTORSINGLEARRAY); }
    /** Unsafe version of {@link #bufferlessPushDescriptors}. */
    public static int nbufferlessPushDescriptors(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.BUFFERLESSPUSHDESCRIPTORS); }
    /** Unsafe version of {@link #allowSamplerImageViewPostSubmitCreation}. */
    public static int nallowSamplerImageViewPostSubmitCreation(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.ALLOWSAMPLERIMAGEVIEWPOSTSUBMITCREATION); }
    /** Unsafe version of {@link #descriptorBufferOffsetAlignment}. */
    public static long ndescriptorBufferOffsetAlignment(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.DESCRIPTORBUFFEROFFSETALIGNMENT); }
    /** Unsafe version of {@link #maxDescriptorBufferBindings}. */
    public static int nmaxDescriptorBufferBindings(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXDESCRIPTORBUFFERBINDINGS); }
    /** Unsafe version of {@link #maxResourceDescriptorBufferBindings}. */
    public static int nmaxResourceDescriptorBufferBindings(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXRESOURCEDESCRIPTORBUFFERBINDINGS); }
    /** Unsafe version of {@link #maxSamplerDescriptorBufferBindings}. */
    public static int nmaxSamplerDescriptorBufferBindings(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXSAMPLERDESCRIPTORBUFFERBINDINGS); }
    /** Unsafe version of {@link #maxEmbeddedImmutableSamplerBindings}. */
    public static int nmaxEmbeddedImmutableSamplerBindings(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXEMBEDDEDIMMUTABLESAMPLERBINDINGS); }
    /** Unsafe version of {@link #maxEmbeddedImmutableSamplers}. */
    public static int nmaxEmbeddedImmutableSamplers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXEMBEDDEDIMMUTABLESAMPLERS); }
    /** Unsafe version of {@link #bufferCaptureReplayDescriptorDataSize}. */
    public static long nbufferCaptureReplayDescriptorDataSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.BUFFERCAPTUREREPLAYDESCRIPTORDATASIZE); }
    /** Unsafe version of {@link #imageCaptureReplayDescriptorDataSize}. */
    public static long nimageCaptureReplayDescriptorDataSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.IMAGECAPTUREREPLAYDESCRIPTORDATASIZE); }
    /** Unsafe version of {@link #imageViewCaptureReplayDescriptorDataSize}. */
    public static long nimageViewCaptureReplayDescriptorDataSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.IMAGEVIEWCAPTUREREPLAYDESCRIPTORDATASIZE); }
    /** Unsafe version of {@link #samplerCaptureReplayDescriptorDataSize}. */
    public static long nsamplerCaptureReplayDescriptorDataSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.SAMPLERCAPTUREREPLAYDESCRIPTORDATASIZE); }
    /** Unsafe version of {@link #accelerationStructureCaptureReplayDescriptorDataSize}. */
    public static long naccelerationStructureCaptureReplayDescriptorDataSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.ACCELERATIONSTRUCTURECAPTUREREPLAYDESCRIPTORDATASIZE); }
    /** Unsafe version of {@link #samplerDescriptorSize}. */
    public static long nsamplerDescriptorSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.SAMPLERDESCRIPTORSIZE); }
    /** Unsafe version of {@link #combinedImageSamplerDescriptorSize}. */
    public static long ncombinedImageSamplerDescriptorSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.COMBINEDIMAGESAMPLERDESCRIPTORSIZE); }
    /** Unsafe version of {@link #sampledImageDescriptorSize}. */
    public static long nsampledImageDescriptorSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.SAMPLEDIMAGEDESCRIPTORSIZE); }
    /** Unsafe version of {@link #storageImageDescriptorSize}. */
    public static long nstorageImageDescriptorSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.STORAGEIMAGEDESCRIPTORSIZE); }
    /** Unsafe version of {@link #uniformTexelBufferDescriptorSize}. */
    public static long nuniformTexelBufferDescriptorSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNIFORMTEXELBUFFERDESCRIPTORSIZE); }
    /** Unsafe version of {@link #robustUniformTexelBufferDescriptorSize}. */
    public static long nrobustUniformTexelBufferDescriptorSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.ROBUSTUNIFORMTEXELBUFFERDESCRIPTORSIZE); }
    /** Unsafe version of {@link #storageTexelBufferDescriptorSize}. */
    public static long nstorageTexelBufferDescriptorSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.STORAGETEXELBUFFERDESCRIPTORSIZE); }
    /** Unsafe version of {@link #robustStorageTexelBufferDescriptorSize}. */
    public static long nrobustStorageTexelBufferDescriptorSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.ROBUSTSTORAGETEXELBUFFERDESCRIPTORSIZE); }
    /** Unsafe version of {@link #uniformBufferDescriptorSize}. */
    public static long nuniformBufferDescriptorSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNIFORMBUFFERDESCRIPTORSIZE); }
    /** Unsafe version of {@link #robustUniformBufferDescriptorSize}. */
    public static long nrobustUniformBufferDescriptorSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.ROBUSTUNIFORMBUFFERDESCRIPTORSIZE); }
    /** Unsafe version of {@link #storageBufferDescriptorSize}. */
    public static long nstorageBufferDescriptorSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.STORAGEBUFFERDESCRIPTORSIZE); }
    /** Unsafe version of {@link #robustStorageBufferDescriptorSize}. */
    public static long nrobustStorageBufferDescriptorSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.ROBUSTSTORAGEBUFFERDESCRIPTORSIZE); }
    /** Unsafe version of {@link #inputAttachmentDescriptorSize}. */
    public static long ninputAttachmentDescriptorSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.INPUTATTACHMENTDESCRIPTORSIZE); }
    /** Unsafe version of {@link #accelerationStructureDescriptorSize}. */
    public static long naccelerationStructureDescriptorSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.ACCELERATIONSTRUCTUREDESCRIPTORSIZE); }
    /** Unsafe version of {@link #maxSamplerDescriptorBufferRange}. */
    public static long nmaxSamplerDescriptorBufferRange(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXSAMPLERDESCRIPTORBUFFERRANGE); }
    /** Unsafe version of {@link #maxResourceDescriptorBufferRange}. */
    public static long nmaxResourceDescriptorBufferRange(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXRESOURCEDESCRIPTORBUFFERRANGE); }
    /** Unsafe version of {@link #samplerDescriptorBufferAddressSpaceSize}. */
    public static long nsamplerDescriptorBufferAddressSpaceSize(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.SAMPLERDESCRIPTORBUFFERADDRESSSPACESIZE); }
    /** Unsafe version of {@link #resourceDescriptorBufferAddressSpaceSize}. */
    public static long nresourceDescriptorBufferAddressSpaceSize(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.RESOURCEDESCRIPTORBUFFERADDRESSSPACESIZE); }
    /** Unsafe version of {@link #descriptorBufferAddressSpaceSize}. */
    public static long ndescriptorBufferAddressSpaceSize(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.DESCRIPTORBUFFERADDRESSSPACESIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorBufferPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDescriptorBufferPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceDescriptorBufferPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDescriptorBufferPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#combinedImageSamplerDescriptorSingleArray} field. */
        @NativeType("VkBool32")
        public boolean combinedImageSamplerDescriptorSingleArray() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.ncombinedImageSamplerDescriptorSingleArray(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#bufferlessPushDescriptors} field. */
        @NativeType("VkBool32")
        public boolean bufferlessPushDescriptors() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nbufferlessPushDescriptors(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#allowSamplerImageViewPostSubmitCreation} field. */
        @NativeType("VkBool32")
        public boolean allowSamplerImageViewPostSubmitCreation() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nallowSamplerImageViewPostSubmitCreation(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#descriptorBufferOffsetAlignment} field. */
        @NativeType("VkDeviceSize")
        public long descriptorBufferOffsetAlignment() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.ndescriptorBufferOffsetAlignment(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#maxDescriptorBufferBindings} field. */
        @NativeType("uint32_t")
        public int maxDescriptorBufferBindings() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxDescriptorBufferBindings(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#maxResourceDescriptorBufferBindings} field. */
        @NativeType("uint32_t")
        public int maxResourceDescriptorBufferBindings() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxResourceDescriptorBufferBindings(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#maxSamplerDescriptorBufferBindings} field. */
        @NativeType("uint32_t")
        public int maxSamplerDescriptorBufferBindings() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxSamplerDescriptorBufferBindings(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#maxEmbeddedImmutableSamplerBindings} field. */
        @NativeType("uint32_t")
        public int maxEmbeddedImmutableSamplerBindings() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxEmbeddedImmutableSamplerBindings(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#maxEmbeddedImmutableSamplers} field. */
        @NativeType("uint32_t")
        public int maxEmbeddedImmutableSamplers() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxEmbeddedImmutableSamplers(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#bufferCaptureReplayDescriptorDataSize} field. */
        @NativeType("size_t")
        public long bufferCaptureReplayDescriptorDataSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nbufferCaptureReplayDescriptorDataSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#imageCaptureReplayDescriptorDataSize} field. */
        @NativeType("size_t")
        public long imageCaptureReplayDescriptorDataSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nimageCaptureReplayDescriptorDataSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#imageViewCaptureReplayDescriptorDataSize} field. */
        @NativeType("size_t")
        public long imageViewCaptureReplayDescriptorDataSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nimageViewCaptureReplayDescriptorDataSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#samplerCaptureReplayDescriptorDataSize} field. */
        @NativeType("size_t")
        public long samplerCaptureReplayDescriptorDataSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsamplerCaptureReplayDescriptorDataSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#accelerationStructureCaptureReplayDescriptorDataSize} field. */
        @NativeType("size_t")
        public long accelerationStructureCaptureReplayDescriptorDataSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.naccelerationStructureCaptureReplayDescriptorDataSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#samplerDescriptorSize} field. */
        @NativeType("size_t")
        public long samplerDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsamplerDescriptorSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#combinedImageSamplerDescriptorSize} field. */
        @NativeType("size_t")
        public long combinedImageSamplerDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.ncombinedImageSamplerDescriptorSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#sampledImageDescriptorSize} field. */
        @NativeType("size_t")
        public long sampledImageDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsampledImageDescriptorSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#storageImageDescriptorSize} field. */
        @NativeType("size_t")
        public long storageImageDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nstorageImageDescriptorSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#uniformTexelBufferDescriptorSize} field. */
        @NativeType("size_t")
        public long uniformTexelBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nuniformTexelBufferDescriptorSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#robustUniformTexelBufferDescriptorSize} field. */
        @NativeType("size_t")
        public long robustUniformTexelBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nrobustUniformTexelBufferDescriptorSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#storageTexelBufferDescriptorSize} field. */
        @NativeType("size_t")
        public long storageTexelBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nstorageTexelBufferDescriptorSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#robustStorageTexelBufferDescriptorSize} field. */
        @NativeType("size_t")
        public long robustStorageTexelBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nrobustStorageTexelBufferDescriptorSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#uniformBufferDescriptorSize} field. */
        @NativeType("size_t")
        public long uniformBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nuniformBufferDescriptorSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#robustUniformBufferDescriptorSize} field. */
        @NativeType("size_t")
        public long robustUniformBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nrobustUniformBufferDescriptorSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#storageBufferDescriptorSize} field. */
        @NativeType("size_t")
        public long storageBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nstorageBufferDescriptorSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#robustStorageBufferDescriptorSize} field. */
        @NativeType("size_t")
        public long robustStorageBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nrobustStorageBufferDescriptorSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#inputAttachmentDescriptorSize} field. */
        @NativeType("size_t")
        public long inputAttachmentDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.ninputAttachmentDescriptorSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#accelerationStructureDescriptorSize} field. */
        @NativeType("size_t")
        public long accelerationStructureDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.naccelerationStructureDescriptorSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#maxSamplerDescriptorBufferRange} field. */
        @NativeType("VkDeviceSize")
        public long maxSamplerDescriptorBufferRange() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxSamplerDescriptorBufferRange(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#maxResourceDescriptorBufferRange} field. */
        @NativeType("VkDeviceSize")
        public long maxResourceDescriptorBufferRange() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxResourceDescriptorBufferRange(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#samplerDescriptorBufferAddressSpaceSize} field. */
        @NativeType("VkDeviceSize")
        public long samplerDescriptorBufferAddressSpaceSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsamplerDescriptorBufferAddressSpaceSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#resourceDescriptorBufferAddressSpaceSize} field. */
        @NativeType("VkDeviceSize")
        public long resourceDescriptorBufferAddressSpaceSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nresourceDescriptorBufferAddressSpaceSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#descriptorBufferAddressSpaceSize} field. */
        @NativeType("VkDeviceSize")
        public long descriptorBufferAddressSpaceSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.ndescriptorBufferAddressSpaceSize(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#sType} field. */
        public VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT} value to the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#sType} field. */
        public VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#pNext} field. */
        public VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.npNext(address(), value); return this; }

    }

}