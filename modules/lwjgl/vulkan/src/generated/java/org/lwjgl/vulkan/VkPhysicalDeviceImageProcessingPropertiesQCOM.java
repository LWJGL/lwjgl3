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
 * Structure containing image processing properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceImageProcessingPropertiesQCOM} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>These are properties of the image processing information of a physical device.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link QCOMImageProcessing#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_PROPERTIES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_PROPERTIES_QCOM}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceImageProcessingPropertiesQCOM {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #maxWeightFilterPhases};
 *     {@link VkExtent2D VkExtent2D} {@link #maxWeightFilterDimension};
 *     {@link VkExtent2D VkExtent2D} {@link #maxBlockMatchRegion};
 *     {@link VkExtent2D VkExtent2D} {@link #maxBoxFilterBlockSize};
 * }</code></pre>
 */
public class VkPhysicalDeviceImageProcessingPropertiesQCOM extends Struct<VkPhysicalDeviceImageProcessingPropertiesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXWEIGHTFILTERPHASES,
        MAXWEIGHTFILTERDIMENSION,
        MAXBLOCKMATCHREGION,
        MAXBOXFILTERBLOCKSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXWEIGHTFILTERPHASES = layout.offsetof(2);
        MAXWEIGHTFILTERDIMENSION = layout.offsetof(3);
        MAXBLOCKMATCHREGION = layout.offsetof(4);
        MAXBOXFILTERBLOCKSIZE = layout.offsetof(5);
    }

    protected VkPhysicalDeviceImageProcessingPropertiesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceImageProcessingPropertiesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceImageProcessingPropertiesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImageProcessingPropertiesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImageProcessingPropertiesQCOM(ByteBuffer container) {
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
    /** the maximum value that <b>can</b> be specified for {@link VkImageViewSampleWeightCreateInfoQCOM}{@code ::numPhases}. in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-weightimage-filterphases">weight image sampling</a> operations. */
    @NativeType("uint32_t")
    public int maxWeightFilterPhases() { return nmaxWeightFilterPhases(address()); }
    /** a {@link VkExtent2D} describing the largest dimensions ({@code width} and {@code height}) that <b>can</b> be specified for {@link VkImageViewSampleWeightCreateInfoQCOM}{@code ::filterSize}. */
    public VkExtent2D maxWeightFilterDimension() { return nmaxWeightFilterDimension(address()); }
    /** a {@link VkExtent2D} describing the largest dimensions ({@code width} and {@code height}) that <b>can</b> be specified for {@code blockSize} in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-blockmatch">block matching</a> operations. */
    public VkExtent2D maxBlockMatchRegion() { return nmaxBlockMatchRegion(address()); }
    /** a {@link VkExtent2D} describing the maximum dimensions ({@code width} and {@code height}) that <b>can</b> be specified for {@code blocksize} in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-boxfilter">box filter sampling</a> operations. */
    public VkExtent2D maxBoxFilterBlockSize() { return nmaxBoxFilterBlockSize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceImageProcessingPropertiesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMImageProcessing#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_PROPERTIES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_PROPERTIES_QCOM} value to the {@link #sType} field. */
    public VkPhysicalDeviceImageProcessingPropertiesQCOM sType$Default() { return sType(QCOMImageProcessing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_PROPERTIES_QCOM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceImageProcessingPropertiesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImageProcessingPropertiesQCOM set(
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
    public VkPhysicalDeviceImageProcessingPropertiesQCOM set(VkPhysicalDeviceImageProcessingPropertiesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImageProcessingPropertiesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM malloc() {
        return new VkPhysicalDeviceImageProcessingPropertiesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageProcessingPropertiesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM calloc() {
        return new VkPhysicalDeviceImageProcessingPropertiesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageProcessingPropertiesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageProcessingPropertiesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImageProcessingPropertiesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM create(long address) {
        return new VkPhysicalDeviceImageProcessingPropertiesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceImageProcessingPropertiesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessingPropertiesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessingPropertiesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessingPropertiesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceImageProcessingPropertiesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageProcessingPropertiesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageProcessingPropertiesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageProcessingPropertiesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageProcessingPropertiesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessingPropertiesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessingPropertiesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageProcessingPropertiesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImageProcessingPropertiesQCOM.PNEXT); }
    /** Unsafe version of {@link #maxWeightFilterPhases}. */
    public static int nmaxWeightFilterPhases(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageProcessingPropertiesQCOM.MAXWEIGHTFILTERPHASES); }
    /** Unsafe version of {@link #maxWeightFilterDimension}. */
    public static VkExtent2D nmaxWeightFilterDimension(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceImageProcessingPropertiesQCOM.MAXWEIGHTFILTERDIMENSION); }
    /** Unsafe version of {@link #maxBlockMatchRegion}. */
    public static VkExtent2D nmaxBlockMatchRegion(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceImageProcessingPropertiesQCOM.MAXBLOCKMATCHREGION); }
    /** Unsafe version of {@link #maxBoxFilterBlockSize}. */
    public static VkExtent2D nmaxBoxFilterBlockSize(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceImageProcessingPropertiesQCOM.MAXBOXFILTERBLOCKSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImageProcessingPropertiesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImageProcessingPropertiesQCOM.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImageProcessingPropertiesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageProcessingPropertiesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImageProcessingPropertiesQCOM ELEMENT_FACTORY = VkPhysicalDeviceImageProcessingPropertiesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImageProcessingPropertiesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImageProcessingPropertiesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceImageProcessingPropertiesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceImageProcessingPropertiesQCOM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImageProcessingPropertiesQCOM.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImageProcessingPropertiesQCOM#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceImageProcessingPropertiesQCOM.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImageProcessingPropertiesQCOM#maxWeightFilterPhases} field. */
        @NativeType("uint32_t")
        public int maxWeightFilterPhases() { return VkPhysicalDeviceImageProcessingPropertiesQCOM.nmaxWeightFilterPhases(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkPhysicalDeviceImageProcessingPropertiesQCOM#maxWeightFilterDimension} field. */
        public VkExtent2D maxWeightFilterDimension() { return VkPhysicalDeviceImageProcessingPropertiesQCOM.nmaxWeightFilterDimension(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkPhysicalDeviceImageProcessingPropertiesQCOM#maxBlockMatchRegion} field. */
        public VkExtent2D maxBlockMatchRegion() { return VkPhysicalDeviceImageProcessingPropertiesQCOM.nmaxBlockMatchRegion(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkPhysicalDeviceImageProcessingPropertiesQCOM#maxBoxFilterBlockSize} field. */
        public VkExtent2D maxBoxFilterBlockSize() { return VkPhysicalDeviceImageProcessingPropertiesQCOM.nmaxBoxFilterBlockSize(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceImageProcessingPropertiesQCOM#sType} field. */
        public VkPhysicalDeviceImageProcessingPropertiesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImageProcessingPropertiesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMImageProcessing#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_PROPERTIES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_PROPERTIES_QCOM} value to the {@link VkPhysicalDeviceImageProcessingPropertiesQCOM#sType} field. */
        public VkPhysicalDeviceImageProcessingPropertiesQCOM.Buffer sType$Default() { return sType(QCOMImageProcessing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_PROPERTIES_QCOM); }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageProcessingPropertiesQCOM#pNext} field. */
        public VkPhysicalDeviceImageProcessingPropertiesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceImageProcessingPropertiesQCOM.npNext(address(), value); return this; }

    }

}