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
 * <pre>{@code
 * struct VkPhysicalDeviceDescriptorBufferPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 combinedImageSamplerDescriptorSingleArray;
 *     VkBool32 bufferlessPushDescriptors;
 *     VkBool32 allowSamplerImageViewPostSubmitCreation;
 *     VkDeviceSize descriptorBufferOffsetAlignment;
 *     uint32_t maxDescriptorBufferBindings;
 *     uint32_t maxResourceDescriptorBufferBindings;
 *     uint32_t maxSamplerDescriptorBufferBindings;
 *     uint32_t maxEmbeddedImmutableSamplerBindings;
 *     uint32_t maxEmbeddedImmutableSamplers;
 *     size_t bufferCaptureReplayDescriptorDataSize;
 *     size_t imageCaptureReplayDescriptorDataSize;
 *     size_t imageViewCaptureReplayDescriptorDataSize;
 *     size_t samplerCaptureReplayDescriptorDataSize;
 *     size_t accelerationStructureCaptureReplayDescriptorDataSize;
 *     size_t samplerDescriptorSize;
 *     size_t combinedImageSamplerDescriptorSize;
 *     size_t sampledImageDescriptorSize;
 *     size_t storageImageDescriptorSize;
 *     size_t uniformTexelBufferDescriptorSize;
 *     size_t robustUniformTexelBufferDescriptorSize;
 *     size_t storageTexelBufferDescriptorSize;
 *     size_t robustStorageTexelBufferDescriptorSize;
 *     size_t uniformBufferDescriptorSize;
 *     size_t robustUniformBufferDescriptorSize;
 *     size_t storageBufferDescriptorSize;
 *     size_t robustStorageBufferDescriptorSize;
 *     size_t inputAttachmentDescriptorSize;
 *     size_t accelerationStructureDescriptorSize;
 *     VkDeviceSize maxSamplerDescriptorBufferRange;
 *     VkDeviceSize maxResourceDescriptorBufferRange;
 *     VkDeviceSize samplerDescriptorBufferAddressSpaceSize;
 *     VkDeviceSize resourceDescriptorBufferAddressSpaceSize;
 *     VkDeviceSize descriptorBufferAddressSpaceSize;
 * }}</pre>
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code combinedImageSamplerDescriptorSingleArray} field. */
    @NativeType("VkBool32")
    public boolean combinedImageSamplerDescriptorSingleArray() { return ncombinedImageSamplerDescriptorSingleArray(address()) != 0; }
    /** @return the value of the {@code bufferlessPushDescriptors} field. */
    @NativeType("VkBool32")
    public boolean bufferlessPushDescriptors() { return nbufferlessPushDescriptors(address()) != 0; }
    /** @return the value of the {@code allowSamplerImageViewPostSubmitCreation} field. */
    @NativeType("VkBool32")
    public boolean allowSamplerImageViewPostSubmitCreation() { return nallowSamplerImageViewPostSubmitCreation(address()) != 0; }
    /** @return the value of the {@code descriptorBufferOffsetAlignment} field. */
    @NativeType("VkDeviceSize")
    public long descriptorBufferOffsetAlignment() { return ndescriptorBufferOffsetAlignment(address()); }
    /** @return the value of the {@code maxDescriptorBufferBindings} field. */
    @NativeType("uint32_t")
    public int maxDescriptorBufferBindings() { return nmaxDescriptorBufferBindings(address()); }
    /** @return the value of the {@code maxResourceDescriptorBufferBindings} field. */
    @NativeType("uint32_t")
    public int maxResourceDescriptorBufferBindings() { return nmaxResourceDescriptorBufferBindings(address()); }
    /** @return the value of the {@code maxSamplerDescriptorBufferBindings} field. */
    @NativeType("uint32_t")
    public int maxSamplerDescriptorBufferBindings() { return nmaxSamplerDescriptorBufferBindings(address()); }
    /** @return the value of the {@code maxEmbeddedImmutableSamplerBindings} field. */
    @NativeType("uint32_t")
    public int maxEmbeddedImmutableSamplerBindings() { return nmaxEmbeddedImmutableSamplerBindings(address()); }
    /** @return the value of the {@code maxEmbeddedImmutableSamplers} field. */
    @NativeType("uint32_t")
    public int maxEmbeddedImmutableSamplers() { return nmaxEmbeddedImmutableSamplers(address()); }
    /** @return the value of the {@code bufferCaptureReplayDescriptorDataSize} field. */
    @NativeType("size_t")
    public long bufferCaptureReplayDescriptorDataSize() { return nbufferCaptureReplayDescriptorDataSize(address()); }
    /** @return the value of the {@code imageCaptureReplayDescriptorDataSize} field. */
    @NativeType("size_t")
    public long imageCaptureReplayDescriptorDataSize() { return nimageCaptureReplayDescriptorDataSize(address()); }
    /** @return the value of the {@code imageViewCaptureReplayDescriptorDataSize} field. */
    @NativeType("size_t")
    public long imageViewCaptureReplayDescriptorDataSize() { return nimageViewCaptureReplayDescriptorDataSize(address()); }
    /** @return the value of the {@code samplerCaptureReplayDescriptorDataSize} field. */
    @NativeType("size_t")
    public long samplerCaptureReplayDescriptorDataSize() { return nsamplerCaptureReplayDescriptorDataSize(address()); }
    /** @return the value of the {@code accelerationStructureCaptureReplayDescriptorDataSize} field. */
    @NativeType("size_t")
    public long accelerationStructureCaptureReplayDescriptorDataSize() { return naccelerationStructureCaptureReplayDescriptorDataSize(address()); }
    /** @return the value of the {@code samplerDescriptorSize} field. */
    @NativeType("size_t")
    public long samplerDescriptorSize() { return nsamplerDescriptorSize(address()); }
    /** @return the value of the {@code combinedImageSamplerDescriptorSize} field. */
    @NativeType("size_t")
    public long combinedImageSamplerDescriptorSize() { return ncombinedImageSamplerDescriptorSize(address()); }
    /** @return the value of the {@code sampledImageDescriptorSize} field. */
    @NativeType("size_t")
    public long sampledImageDescriptorSize() { return nsampledImageDescriptorSize(address()); }
    /** @return the value of the {@code storageImageDescriptorSize} field. */
    @NativeType("size_t")
    public long storageImageDescriptorSize() { return nstorageImageDescriptorSize(address()); }
    /** @return the value of the {@code uniformTexelBufferDescriptorSize} field. */
    @NativeType("size_t")
    public long uniformTexelBufferDescriptorSize() { return nuniformTexelBufferDescriptorSize(address()); }
    /** @return the value of the {@code robustUniformTexelBufferDescriptorSize} field. */
    @NativeType("size_t")
    public long robustUniformTexelBufferDescriptorSize() { return nrobustUniformTexelBufferDescriptorSize(address()); }
    /** @return the value of the {@code storageTexelBufferDescriptorSize} field. */
    @NativeType("size_t")
    public long storageTexelBufferDescriptorSize() { return nstorageTexelBufferDescriptorSize(address()); }
    /** @return the value of the {@code robustStorageTexelBufferDescriptorSize} field. */
    @NativeType("size_t")
    public long robustStorageTexelBufferDescriptorSize() { return nrobustStorageTexelBufferDescriptorSize(address()); }
    /** @return the value of the {@code uniformBufferDescriptorSize} field. */
    @NativeType("size_t")
    public long uniformBufferDescriptorSize() { return nuniformBufferDescriptorSize(address()); }
    /** @return the value of the {@code robustUniformBufferDescriptorSize} field. */
    @NativeType("size_t")
    public long robustUniformBufferDescriptorSize() { return nrobustUniformBufferDescriptorSize(address()); }
    /** @return the value of the {@code storageBufferDescriptorSize} field. */
    @NativeType("size_t")
    public long storageBufferDescriptorSize() { return nstorageBufferDescriptorSize(address()); }
    /** @return the value of the {@code robustStorageBufferDescriptorSize} field. */
    @NativeType("size_t")
    public long robustStorageBufferDescriptorSize() { return nrobustStorageBufferDescriptorSize(address()); }
    /** @return the value of the {@code inputAttachmentDescriptorSize} field. */
    @NativeType("size_t")
    public long inputAttachmentDescriptorSize() { return ninputAttachmentDescriptorSize(address()); }
    /** @return the value of the {@code accelerationStructureDescriptorSize} field. */
    @NativeType("size_t")
    public long accelerationStructureDescriptorSize() { return naccelerationStructureDescriptorSize(address()); }
    /** @return the value of the {@code maxSamplerDescriptorBufferRange} field. */
    @NativeType("VkDeviceSize")
    public long maxSamplerDescriptorBufferRange() { return nmaxSamplerDescriptorBufferRange(address()); }
    /** @return the value of the {@code maxResourceDescriptorBufferRange} field. */
    @NativeType("VkDeviceSize")
    public long maxResourceDescriptorBufferRange() { return nmaxResourceDescriptorBufferRange(address()); }
    /** @return the value of the {@code samplerDescriptorBufferAddressSpaceSize} field. */
    @NativeType("VkDeviceSize")
    public long samplerDescriptorBufferAddressSpaceSize() { return nsamplerDescriptorBufferAddressSpaceSize(address()); }
    /** @return the value of the {@code resourceDescriptorBufferAddressSpaceSize} field. */
    @NativeType("VkDeviceSize")
    public long resourceDescriptorBufferAddressSpaceSize() { return nresourceDescriptorBufferAddressSpaceSize(address()); }
    /** @return the value of the {@code descriptorBufferAddressSpaceSize} field. */
    @NativeType("VkDeviceSize")
    public long descriptorBufferAddressSpaceSize() { return ndescriptorBufferAddressSpaceSize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
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
    public static @Nullable VkPhysicalDeviceDescriptorBufferPropertiesEXT createSafe(long address) {
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
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
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
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #combinedImageSamplerDescriptorSingleArray}. */
    public static int ncombinedImageSamplerDescriptorSingleArray(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.COMBINEDIMAGESAMPLERDESCRIPTORSINGLEARRAY); }
    /** Unsafe version of {@link #bufferlessPushDescriptors}. */
    public static int nbufferlessPushDescriptors(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.BUFFERLESSPUSHDESCRIPTORS); }
    /** Unsafe version of {@link #allowSamplerImageViewPostSubmitCreation}. */
    public static int nallowSamplerImageViewPostSubmitCreation(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.ALLOWSAMPLERIMAGEVIEWPOSTSUBMITCREATION); }
    /** Unsafe version of {@link #descriptorBufferOffsetAlignment}. */
    public static long ndescriptorBufferOffsetAlignment(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.DESCRIPTORBUFFEROFFSETALIGNMENT); }
    /** Unsafe version of {@link #maxDescriptorBufferBindings}. */
    public static int nmaxDescriptorBufferBindings(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXDESCRIPTORBUFFERBINDINGS); }
    /** Unsafe version of {@link #maxResourceDescriptorBufferBindings}. */
    public static int nmaxResourceDescriptorBufferBindings(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXRESOURCEDESCRIPTORBUFFERBINDINGS); }
    /** Unsafe version of {@link #maxSamplerDescriptorBufferBindings}. */
    public static int nmaxSamplerDescriptorBufferBindings(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXSAMPLERDESCRIPTORBUFFERBINDINGS); }
    /** Unsafe version of {@link #maxEmbeddedImmutableSamplerBindings}. */
    public static int nmaxEmbeddedImmutableSamplerBindings(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXEMBEDDEDIMMUTABLESAMPLERBINDINGS); }
    /** Unsafe version of {@link #maxEmbeddedImmutableSamplers}. */
    public static int nmaxEmbeddedImmutableSamplers(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXEMBEDDEDIMMUTABLESAMPLERS); }
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
    public static long nmaxSamplerDescriptorBufferRange(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXSAMPLERDESCRIPTORBUFFERRANGE); }
    /** Unsafe version of {@link #maxResourceDescriptorBufferRange}. */
    public static long nmaxResourceDescriptorBufferRange(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXRESOURCEDESCRIPTORBUFFERRANGE); }
    /** Unsafe version of {@link #samplerDescriptorBufferAddressSpaceSize}. */
    public static long nsamplerDescriptorBufferAddressSpaceSize(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.SAMPLERDESCRIPTORBUFFERADDRESSSPACESIZE); }
    /** Unsafe version of {@link #resourceDescriptorBufferAddressSpaceSize}. */
    public static long nresourceDescriptorBufferAddressSpaceSize(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.RESOURCEDESCRIPTORBUFFERADDRESSSPACESIZE); }
    /** Unsafe version of {@link #descriptorBufferAddressSpaceSize}. */
    public static long ndescriptorBufferAddressSpaceSize(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.DESCRIPTORBUFFERADDRESSSPACESIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorBufferPropertiesEXT.STYPE, value); }
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPhysicalDeviceDescriptorBufferPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.npNext(address()); }
        /** @return the value of the {@code combinedImageSamplerDescriptorSingleArray} field. */
        @NativeType("VkBool32")
        public boolean combinedImageSamplerDescriptorSingleArray() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.ncombinedImageSamplerDescriptorSingleArray(address()) != 0; }
        /** @return the value of the {@code bufferlessPushDescriptors} field. */
        @NativeType("VkBool32")
        public boolean bufferlessPushDescriptors() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nbufferlessPushDescriptors(address()) != 0; }
        /** @return the value of the {@code allowSamplerImageViewPostSubmitCreation} field. */
        @NativeType("VkBool32")
        public boolean allowSamplerImageViewPostSubmitCreation() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nallowSamplerImageViewPostSubmitCreation(address()) != 0; }
        /** @return the value of the {@code descriptorBufferOffsetAlignment} field. */
        @NativeType("VkDeviceSize")
        public long descriptorBufferOffsetAlignment() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.ndescriptorBufferOffsetAlignment(address()); }
        /** @return the value of the {@code maxDescriptorBufferBindings} field. */
        @NativeType("uint32_t")
        public int maxDescriptorBufferBindings() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxDescriptorBufferBindings(address()); }
        /** @return the value of the {@code maxResourceDescriptorBufferBindings} field. */
        @NativeType("uint32_t")
        public int maxResourceDescriptorBufferBindings() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxResourceDescriptorBufferBindings(address()); }
        /** @return the value of the {@code maxSamplerDescriptorBufferBindings} field. */
        @NativeType("uint32_t")
        public int maxSamplerDescriptorBufferBindings() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxSamplerDescriptorBufferBindings(address()); }
        /** @return the value of the {@code maxEmbeddedImmutableSamplerBindings} field. */
        @NativeType("uint32_t")
        public int maxEmbeddedImmutableSamplerBindings() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxEmbeddedImmutableSamplerBindings(address()); }
        /** @return the value of the {@code maxEmbeddedImmutableSamplers} field. */
        @NativeType("uint32_t")
        public int maxEmbeddedImmutableSamplers() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxEmbeddedImmutableSamplers(address()); }
        /** @return the value of the {@code bufferCaptureReplayDescriptorDataSize} field. */
        @NativeType("size_t")
        public long bufferCaptureReplayDescriptorDataSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nbufferCaptureReplayDescriptorDataSize(address()); }
        /** @return the value of the {@code imageCaptureReplayDescriptorDataSize} field. */
        @NativeType("size_t")
        public long imageCaptureReplayDescriptorDataSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nimageCaptureReplayDescriptorDataSize(address()); }
        /** @return the value of the {@code imageViewCaptureReplayDescriptorDataSize} field. */
        @NativeType("size_t")
        public long imageViewCaptureReplayDescriptorDataSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nimageViewCaptureReplayDescriptorDataSize(address()); }
        /** @return the value of the {@code samplerCaptureReplayDescriptorDataSize} field. */
        @NativeType("size_t")
        public long samplerCaptureReplayDescriptorDataSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsamplerCaptureReplayDescriptorDataSize(address()); }
        /** @return the value of the {@code accelerationStructureCaptureReplayDescriptorDataSize} field. */
        @NativeType("size_t")
        public long accelerationStructureCaptureReplayDescriptorDataSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.naccelerationStructureCaptureReplayDescriptorDataSize(address()); }
        /** @return the value of the {@code samplerDescriptorSize} field. */
        @NativeType("size_t")
        public long samplerDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsamplerDescriptorSize(address()); }
        /** @return the value of the {@code combinedImageSamplerDescriptorSize} field. */
        @NativeType("size_t")
        public long combinedImageSamplerDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.ncombinedImageSamplerDescriptorSize(address()); }
        /** @return the value of the {@code sampledImageDescriptorSize} field. */
        @NativeType("size_t")
        public long sampledImageDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsampledImageDescriptorSize(address()); }
        /** @return the value of the {@code storageImageDescriptorSize} field. */
        @NativeType("size_t")
        public long storageImageDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nstorageImageDescriptorSize(address()); }
        /** @return the value of the {@code uniformTexelBufferDescriptorSize} field. */
        @NativeType("size_t")
        public long uniformTexelBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nuniformTexelBufferDescriptorSize(address()); }
        /** @return the value of the {@code robustUniformTexelBufferDescriptorSize} field. */
        @NativeType("size_t")
        public long robustUniformTexelBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nrobustUniformTexelBufferDescriptorSize(address()); }
        /** @return the value of the {@code storageTexelBufferDescriptorSize} field. */
        @NativeType("size_t")
        public long storageTexelBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nstorageTexelBufferDescriptorSize(address()); }
        /** @return the value of the {@code robustStorageTexelBufferDescriptorSize} field. */
        @NativeType("size_t")
        public long robustStorageTexelBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nrobustStorageTexelBufferDescriptorSize(address()); }
        /** @return the value of the {@code uniformBufferDescriptorSize} field. */
        @NativeType("size_t")
        public long uniformBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nuniformBufferDescriptorSize(address()); }
        /** @return the value of the {@code robustUniformBufferDescriptorSize} field. */
        @NativeType("size_t")
        public long robustUniformBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nrobustUniformBufferDescriptorSize(address()); }
        /** @return the value of the {@code storageBufferDescriptorSize} field. */
        @NativeType("size_t")
        public long storageBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nstorageBufferDescriptorSize(address()); }
        /** @return the value of the {@code robustStorageBufferDescriptorSize} field. */
        @NativeType("size_t")
        public long robustStorageBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nrobustStorageBufferDescriptorSize(address()); }
        /** @return the value of the {@code inputAttachmentDescriptorSize} field. */
        @NativeType("size_t")
        public long inputAttachmentDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.ninputAttachmentDescriptorSize(address()); }
        /** @return the value of the {@code accelerationStructureDescriptorSize} field. */
        @NativeType("size_t")
        public long accelerationStructureDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.naccelerationStructureDescriptorSize(address()); }
        /** @return the value of the {@code maxSamplerDescriptorBufferRange} field. */
        @NativeType("VkDeviceSize")
        public long maxSamplerDescriptorBufferRange() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxSamplerDescriptorBufferRange(address()); }
        /** @return the value of the {@code maxResourceDescriptorBufferRange} field. */
        @NativeType("VkDeviceSize")
        public long maxResourceDescriptorBufferRange() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxResourceDescriptorBufferRange(address()); }
        /** @return the value of the {@code samplerDescriptorBufferAddressSpaceSize} field. */
        @NativeType("VkDeviceSize")
        public long samplerDescriptorBufferAddressSpaceSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsamplerDescriptorBufferAddressSpaceSize(address()); }
        /** @return the value of the {@code resourceDescriptorBufferAddressSpaceSize} field. */
        @NativeType("VkDeviceSize")
        public long resourceDescriptorBufferAddressSpaceSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.nresourceDescriptorBufferAddressSpaceSize(address()); }
        /** @return the value of the {@code descriptorBufferAddressSpaceSize} field. */
        @NativeType("VkDeviceSize")
        public long descriptorBufferAddressSpaceSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.ndescriptorBufferAddressSpaceSize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.npNext(address(), value); return this; }

    }

}