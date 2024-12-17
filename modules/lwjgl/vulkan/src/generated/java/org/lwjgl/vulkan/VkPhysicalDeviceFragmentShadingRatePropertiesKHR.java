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
 * struct VkPhysicalDeviceFragmentShadingRatePropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkExtent2D VkExtent2D} minFragmentShadingRateAttachmentTexelSize;
 *     {@link VkExtent2D VkExtent2D} maxFragmentShadingRateAttachmentTexelSize;
 *     uint32_t maxFragmentShadingRateAttachmentTexelSizeAspectRatio;
 *     VkBool32 primitiveFragmentShadingRateWithMultipleViewports;
 *     VkBool32 layeredShadingRateAttachments;
 *     VkBool32 fragmentShadingRateNonTrivialCombinerOps;
 *     {@link VkExtent2D VkExtent2D} maxFragmentSize;
 *     uint32_t maxFragmentSizeAspectRatio;
 *     uint32_t maxFragmentShadingRateCoverageSamples;
 *     VkSampleCountFlagBits maxFragmentShadingRateRasterizationSamples;
 *     VkBool32 fragmentShadingRateWithShaderDepthStencilWrites;
 *     VkBool32 fragmentShadingRateWithSampleMask;
 *     VkBool32 fragmentShadingRateWithShaderSampleMask;
 *     VkBool32 fragmentShadingRateWithConservativeRasterization;
 *     VkBool32 fragmentShadingRateWithFragmentShaderInterlock;
 *     VkBool32 fragmentShadingRateWithCustomSampleLocations;
 *     VkBool32 fragmentShadingRateStrictMultiplyCombiner;
 * }}</pre>
 */
public class VkPhysicalDeviceFragmentShadingRatePropertiesKHR extends Struct<VkPhysicalDeviceFragmentShadingRatePropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MINFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE,
        MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE,
        MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZEASPECTRATIO,
        PRIMITIVEFRAGMENTSHADINGRATEWITHMULTIPLEVIEWPORTS,
        LAYEREDSHADINGRATEATTACHMENTS,
        FRAGMENTSHADINGRATENONTRIVIALCOMBINEROPS,
        MAXFRAGMENTSIZE,
        MAXFRAGMENTSIZEASPECTRATIO,
        MAXFRAGMENTSHADINGRATECOVERAGESAMPLES,
        MAXFRAGMENTSHADINGRATERASTERIZATIONSAMPLES,
        FRAGMENTSHADINGRATEWITHSHADERDEPTHSTENCILWRITES,
        FRAGMENTSHADINGRATEWITHSAMPLEMASK,
        FRAGMENTSHADINGRATEWITHSHADERSAMPLEMASK,
        FRAGMENTSHADINGRATEWITHCONSERVATIVERASTERIZATION,
        FRAGMENTSHADINGRATEWITHFRAGMENTSHADERINTERLOCK,
        FRAGMENTSHADINGRATEWITHCUSTOMSAMPLELOCATIONS,
        FRAGMENTSHADINGRATESTRICTMULTIPLYCOMBINER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MINFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE = layout.offsetof(2);
        MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE = layout.offsetof(3);
        MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZEASPECTRATIO = layout.offsetof(4);
        PRIMITIVEFRAGMENTSHADINGRATEWITHMULTIPLEVIEWPORTS = layout.offsetof(5);
        LAYEREDSHADINGRATEATTACHMENTS = layout.offsetof(6);
        FRAGMENTSHADINGRATENONTRIVIALCOMBINEROPS = layout.offsetof(7);
        MAXFRAGMENTSIZE = layout.offsetof(8);
        MAXFRAGMENTSIZEASPECTRATIO = layout.offsetof(9);
        MAXFRAGMENTSHADINGRATECOVERAGESAMPLES = layout.offsetof(10);
        MAXFRAGMENTSHADINGRATERASTERIZATIONSAMPLES = layout.offsetof(11);
        FRAGMENTSHADINGRATEWITHSHADERDEPTHSTENCILWRITES = layout.offsetof(12);
        FRAGMENTSHADINGRATEWITHSAMPLEMASK = layout.offsetof(13);
        FRAGMENTSHADINGRATEWITHSHADERSAMPLEMASK = layout.offsetof(14);
        FRAGMENTSHADINGRATEWITHCONSERVATIVERASTERIZATION = layout.offsetof(15);
        FRAGMENTSHADINGRATEWITHFRAGMENTSHADERINTERLOCK = layout.offsetof(16);
        FRAGMENTSHADINGRATEWITHCUSTOMSAMPLELOCATIONS = layout.offsetof(17);
        FRAGMENTSHADINGRATESTRICTMULTIPLYCOMBINER = layout.offsetof(18);
    }

    protected VkPhysicalDeviceFragmentShadingRatePropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceFragmentShadingRatePropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentShadingRatePropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR(ByteBuffer container) {
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
    /** @return a {@link VkExtent2D} view of the {@code minFragmentShadingRateAttachmentTexelSize} field. */
    public VkExtent2D minFragmentShadingRateAttachmentTexelSize() { return nminFragmentShadingRateAttachmentTexelSize(address()); }
    /** @return a {@link VkExtent2D} view of the {@code maxFragmentShadingRateAttachmentTexelSize} field. */
    public VkExtent2D maxFragmentShadingRateAttachmentTexelSize() { return nmaxFragmentShadingRateAttachmentTexelSize(address()); }
    /** @return the value of the {@code maxFragmentShadingRateAttachmentTexelSizeAspectRatio} field. */
    @NativeType("uint32_t")
    public int maxFragmentShadingRateAttachmentTexelSizeAspectRatio() { return nmaxFragmentShadingRateAttachmentTexelSizeAspectRatio(address()); }
    /** @return the value of the {@code primitiveFragmentShadingRateWithMultipleViewports} field. */
    @NativeType("VkBool32")
    public boolean primitiveFragmentShadingRateWithMultipleViewports() { return nprimitiveFragmentShadingRateWithMultipleViewports(address()) != 0; }
    /** @return the value of the {@code layeredShadingRateAttachments} field. */
    @NativeType("VkBool32")
    public boolean layeredShadingRateAttachments() { return nlayeredShadingRateAttachments(address()) != 0; }
    /** @return the value of the {@code fragmentShadingRateNonTrivialCombinerOps} field. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateNonTrivialCombinerOps() { return nfragmentShadingRateNonTrivialCombinerOps(address()) != 0; }
    /** @return a {@link VkExtent2D} view of the {@code maxFragmentSize} field. */
    public VkExtent2D maxFragmentSize() { return nmaxFragmentSize(address()); }
    /** @return the value of the {@code maxFragmentSizeAspectRatio} field. */
    @NativeType("uint32_t")
    public int maxFragmentSizeAspectRatio() { return nmaxFragmentSizeAspectRatio(address()); }
    /** @return the value of the {@code maxFragmentShadingRateCoverageSamples} field. */
    @NativeType("uint32_t")
    public int maxFragmentShadingRateCoverageSamples() { return nmaxFragmentShadingRateCoverageSamples(address()); }
    /** @return the value of the {@code maxFragmentShadingRateRasterizationSamples} field. */
    @NativeType("VkSampleCountFlagBits")
    public int maxFragmentShadingRateRasterizationSamples() { return nmaxFragmentShadingRateRasterizationSamples(address()); }
    /** @return the value of the {@code fragmentShadingRateWithShaderDepthStencilWrites} field. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateWithShaderDepthStencilWrites() { return nfragmentShadingRateWithShaderDepthStencilWrites(address()) != 0; }
    /** @return the value of the {@code fragmentShadingRateWithSampleMask} field. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateWithSampleMask() { return nfragmentShadingRateWithSampleMask(address()) != 0; }
    /** @return the value of the {@code fragmentShadingRateWithShaderSampleMask} field. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateWithShaderSampleMask() { return nfragmentShadingRateWithShaderSampleMask(address()) != 0; }
    /** @return the value of the {@code fragmentShadingRateWithConservativeRasterization} field. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateWithConservativeRasterization() { return nfragmentShadingRateWithConservativeRasterization(address()) != 0; }
    /** @return the value of the {@code fragmentShadingRateWithFragmentShaderInterlock} field. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateWithFragmentShaderInterlock() { return nfragmentShadingRateWithFragmentShaderInterlock(address()) != 0; }
    /** @return the value of the {@code fragmentShadingRateWithCustomSampleLocations} field. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateWithCustomSampleLocations() { return nfragmentShadingRateWithCustomSampleLocations(address()) != 0; }
    /** @return the value of the {@code fragmentShadingRateStrictMultiplyCombiner} field. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateStrictMultiplyCombiner() { return nfragmentShadingRateStrictMultiplyCombiner(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRFragmentShadingRate#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR sType$Default() { return sType(KHRFragmentShadingRate.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR set(
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
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR set(VkPhysicalDeviceFragmentShadingRatePropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRatePropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR malloc() {
        return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRatePropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR calloc() {
        return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRatePropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRatePropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR create(long address) {
        return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceFragmentShadingRatePropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShadingRatePropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShadingRatePropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #minFragmentShadingRateAttachmentTexelSize}. */
    public static VkExtent2D nminFragmentShadingRateAttachmentTexelSize(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MINFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE); }
    /** Unsafe version of {@link #maxFragmentShadingRateAttachmentTexelSize}. */
    public static VkExtent2D nmaxFragmentShadingRateAttachmentTexelSize(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE); }
    /** Unsafe version of {@link #maxFragmentShadingRateAttachmentTexelSizeAspectRatio}. */
    public static int nmaxFragmentShadingRateAttachmentTexelSizeAspectRatio(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZEASPECTRATIO); }
    /** Unsafe version of {@link #primitiveFragmentShadingRateWithMultipleViewports}. */
    public static int nprimitiveFragmentShadingRateWithMultipleViewports(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.PRIMITIVEFRAGMENTSHADINGRATEWITHMULTIPLEVIEWPORTS); }
    /** Unsafe version of {@link #layeredShadingRateAttachments}. */
    public static int nlayeredShadingRateAttachments(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.LAYEREDSHADINGRATEATTACHMENTS); }
    /** Unsafe version of {@link #fragmentShadingRateNonTrivialCombinerOps}. */
    public static int nfragmentShadingRateNonTrivialCombinerOps(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATENONTRIVIALCOMBINEROPS); }
    /** Unsafe version of {@link #maxFragmentSize}. */
    public static VkExtent2D nmaxFragmentSize(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSIZE); }
    /** Unsafe version of {@link #maxFragmentSizeAspectRatio}. */
    public static int nmaxFragmentSizeAspectRatio(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSIZEASPECTRATIO); }
    /** Unsafe version of {@link #maxFragmentShadingRateCoverageSamples}. */
    public static int nmaxFragmentShadingRateCoverageSamples(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSHADINGRATECOVERAGESAMPLES); }
    /** Unsafe version of {@link #maxFragmentShadingRateRasterizationSamples}. */
    public static int nmaxFragmentShadingRateRasterizationSamples(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSHADINGRATERASTERIZATIONSAMPLES); }
    /** Unsafe version of {@link #fragmentShadingRateWithShaderDepthStencilWrites}. */
    public static int nfragmentShadingRateWithShaderDepthStencilWrites(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHSHADERDEPTHSTENCILWRITES); }
    /** Unsafe version of {@link #fragmentShadingRateWithSampleMask}. */
    public static int nfragmentShadingRateWithSampleMask(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHSAMPLEMASK); }
    /** Unsafe version of {@link #fragmentShadingRateWithShaderSampleMask}. */
    public static int nfragmentShadingRateWithShaderSampleMask(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHSHADERSAMPLEMASK); }
    /** Unsafe version of {@link #fragmentShadingRateWithConservativeRasterization}. */
    public static int nfragmentShadingRateWithConservativeRasterization(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHCONSERVATIVERASTERIZATION); }
    /** Unsafe version of {@link #fragmentShadingRateWithFragmentShaderInterlock}. */
    public static int nfragmentShadingRateWithFragmentShaderInterlock(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHFRAGMENTSHADERINTERLOCK); }
    /** Unsafe version of {@link #fragmentShadingRateWithCustomSampleLocations}. */
    public static int nfragmentShadingRateWithCustomSampleLocations(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHCUSTOMSAMPLELOCATIONS); }
    /** Unsafe version of {@link #fragmentShadingRateStrictMultiplyCombiner}. */
    public static int nfragmentShadingRateStrictMultiplyCombiner(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATESTRICTMULTIPLYCOMBINER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentShadingRatePropertiesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentShadingRatePropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceFragmentShadingRatePropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceFragmentShadingRatePropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.npNext(address()); }
        /** @return a {@link VkExtent2D} view of the {@code minFragmentShadingRateAttachmentTexelSize} field. */
        public VkExtent2D minFragmentShadingRateAttachmentTexelSize() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nminFragmentShadingRateAttachmentTexelSize(address()); }
        /** @return a {@link VkExtent2D} view of the {@code maxFragmentShadingRateAttachmentTexelSize} field. */
        public VkExtent2D maxFragmentShadingRateAttachmentTexelSize() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentShadingRateAttachmentTexelSize(address()); }
        /** @return the value of the {@code maxFragmentShadingRateAttachmentTexelSizeAspectRatio} field. */
        @NativeType("uint32_t")
        public int maxFragmentShadingRateAttachmentTexelSizeAspectRatio() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentShadingRateAttachmentTexelSizeAspectRatio(address()); }
        /** @return the value of the {@code primitiveFragmentShadingRateWithMultipleViewports} field. */
        @NativeType("VkBool32")
        public boolean primitiveFragmentShadingRateWithMultipleViewports() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nprimitiveFragmentShadingRateWithMultipleViewports(address()) != 0; }
        /** @return the value of the {@code layeredShadingRateAttachments} field. */
        @NativeType("VkBool32")
        public boolean layeredShadingRateAttachments() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nlayeredShadingRateAttachments(address()) != 0; }
        /** @return the value of the {@code fragmentShadingRateNonTrivialCombinerOps} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateNonTrivialCombinerOps() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateNonTrivialCombinerOps(address()) != 0; }
        /** @return a {@link VkExtent2D} view of the {@code maxFragmentSize} field. */
        public VkExtent2D maxFragmentSize() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentSize(address()); }
        /** @return the value of the {@code maxFragmentSizeAspectRatio} field. */
        @NativeType("uint32_t")
        public int maxFragmentSizeAspectRatio() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentSizeAspectRatio(address()); }
        /** @return the value of the {@code maxFragmentShadingRateCoverageSamples} field. */
        @NativeType("uint32_t")
        public int maxFragmentShadingRateCoverageSamples() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentShadingRateCoverageSamples(address()); }
        /** @return the value of the {@code maxFragmentShadingRateRasterizationSamples} field. */
        @NativeType("VkSampleCountFlagBits")
        public int maxFragmentShadingRateRasterizationSamples() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentShadingRateRasterizationSamples(address()); }
        /** @return the value of the {@code fragmentShadingRateWithShaderDepthStencilWrites} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateWithShaderDepthStencilWrites() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithShaderDepthStencilWrites(address()) != 0; }
        /** @return the value of the {@code fragmentShadingRateWithSampleMask} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateWithSampleMask() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithSampleMask(address()) != 0; }
        /** @return the value of the {@code fragmentShadingRateWithShaderSampleMask} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateWithShaderSampleMask() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithShaderSampleMask(address()) != 0; }
        /** @return the value of the {@code fragmentShadingRateWithConservativeRasterization} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateWithConservativeRasterization() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithConservativeRasterization(address()) != 0; }
        /** @return the value of the {@code fragmentShadingRateWithFragmentShaderInterlock} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateWithFragmentShaderInterlock() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithFragmentShaderInterlock(address()) != 0; }
        /** @return the value of the {@code fragmentShadingRateWithCustomSampleLocations} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateWithCustomSampleLocations() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithCustomSampleLocations(address()) != 0; }
        /** @return the value of the {@code fragmentShadingRateStrictMultiplyCombiner} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateStrictMultiplyCombiner() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateStrictMultiplyCombiner(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRFragmentShadingRate#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer sType$Default() { return sType(KHRFragmentShadingRate.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.npNext(address(), value); return this; }

    }

}