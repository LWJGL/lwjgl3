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
 * Structure describing quantization map properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>The values returned in this structure are only defined if the allowed image usage flags returned in {@link VkVideoFormatPropertiesKHR}{@code ::imageUsageFlags} for this video format include {@link KHRVideoEncodeQuantizationMap#VK_IMAGE_USAGE_VIDEO_ENCODE_QUANTIZATION_DELTA_MAP_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_QUANTIZATION_DELTA_MAP_BIT_KHR} or {@link KHRVideoEncodeQuantizationMap#VK_IMAGE_USAGE_VIDEO_ENCODE_EMPHASIS_MAP_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_EMPHASIS_MAP_BIT_KHR}.</p>
 * 
 * <p>Implementations <b>may</b> support multiple quantization map texel sizes for a particular video format which is indicated by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoFormatPropertiesKHR GetPhysicalDeviceVideoFormatPropertiesKHR} returning multiple entries with different {@code quantizationMapTexelSize} values.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeQuantizationMap#VK_STRUCTURE_TYPE_VIDEO_FORMAT_QUANTIZATION_MAP_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_FORMAT_QUANTIZATION_MAP_PROPERTIES_KHR}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoFormatQuantizationMapPropertiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkExtent2D VkExtent2D} {@link #quantizationMapTexelSize};
 * }</code></pre>
 */
public class VkVideoFormatQuantizationMapPropertiesKHR extends Struct<VkVideoFormatQuantizationMapPropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        QUANTIZATIONMAPTEXELSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        QUANTIZATIONMAPTEXELSIZE = layout.offsetof(2);
    }

    protected VkVideoFormatQuantizationMapPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoFormatQuantizationMapPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoFormatQuantizationMapPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoFormatQuantizationMapPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoFormatQuantizationMapPropertiesKHR(ByteBuffer container) {
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
    /** indicates the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-quantization-map-texel-size">quantization map texel size</a> of the video format, i.e. the number of pixels corresponding to each quantization map texel. */
    public VkExtent2D quantizationMapTexelSize() { return nquantizationMapTexelSize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoFormatQuantizationMapPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQuantizationMap#VK_STRUCTURE_TYPE_VIDEO_FORMAT_QUANTIZATION_MAP_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_FORMAT_QUANTIZATION_MAP_PROPERTIES_KHR} value to the {@link #sType} field. */
    public VkVideoFormatQuantizationMapPropertiesKHR sType$Default() { return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_FORMAT_QUANTIZATION_MAP_PROPERTIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoFormatQuantizationMapPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoFormatQuantizationMapPropertiesKHR set(
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
    public VkVideoFormatQuantizationMapPropertiesKHR set(VkVideoFormatQuantizationMapPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoFormatQuantizationMapPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoFormatQuantizationMapPropertiesKHR malloc() {
        return new VkVideoFormatQuantizationMapPropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoFormatQuantizationMapPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoFormatQuantizationMapPropertiesKHR calloc() {
        return new VkVideoFormatQuantizationMapPropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoFormatQuantizationMapPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoFormatQuantizationMapPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoFormatQuantizationMapPropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoFormatQuantizationMapPropertiesKHR} instance for the specified memory address. */
    public static VkVideoFormatQuantizationMapPropertiesKHR create(long address) {
        return new VkVideoFormatQuantizationMapPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoFormatQuantizationMapPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoFormatQuantizationMapPropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoFormatQuantizationMapPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatQuantizationMapPropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoFormatQuantizationMapPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatQuantizationMapPropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoFormatQuantizationMapPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatQuantizationMapPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoFormatQuantizationMapPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatQuantizationMapPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoFormatQuantizationMapPropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoFormatQuantizationMapPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoFormatQuantizationMapPropertiesKHR malloc(MemoryStack stack) {
        return new VkVideoFormatQuantizationMapPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoFormatQuantizationMapPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoFormatQuantizationMapPropertiesKHR calloc(MemoryStack stack) {
        return new VkVideoFormatQuantizationMapPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoFormatQuantizationMapPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatQuantizationMapPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoFormatQuantizationMapPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatQuantizationMapPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoFormatQuantizationMapPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoFormatQuantizationMapPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #quantizationMapTexelSize}. */
    public static VkExtent2D nquantizationMapTexelSize(long struct) { return VkExtent2D.create(struct + VkVideoFormatQuantizationMapPropertiesKHR.QUANTIZATIONMAPTEXELSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoFormatQuantizationMapPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoFormatQuantizationMapPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoFormatQuantizationMapPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoFormatQuantizationMapPropertiesKHR, Buffer> implements NativeResource {

        private static final VkVideoFormatQuantizationMapPropertiesKHR ELEMENT_FACTORY = VkVideoFormatQuantizationMapPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoFormatQuantizationMapPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoFormatQuantizationMapPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoFormatQuantizationMapPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoFormatQuantizationMapPropertiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoFormatQuantizationMapPropertiesKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoFormatQuantizationMapPropertiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoFormatQuantizationMapPropertiesKHR.npNext(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoFormatQuantizationMapPropertiesKHR#quantizationMapTexelSize} field. */
        public VkExtent2D quantizationMapTexelSize() { return VkVideoFormatQuantizationMapPropertiesKHR.nquantizationMapTexelSize(address()); }

        /** Sets the specified value to the {@link VkVideoFormatQuantizationMapPropertiesKHR#sType} field. */
        public VkVideoFormatQuantizationMapPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoFormatQuantizationMapPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQuantizationMap#VK_STRUCTURE_TYPE_VIDEO_FORMAT_QUANTIZATION_MAP_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_FORMAT_QUANTIZATION_MAP_PROPERTIES_KHR} value to the {@link VkVideoFormatQuantizationMapPropertiesKHR#sType} field. */
        public VkVideoFormatQuantizationMapPropertiesKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_FORMAT_QUANTIZATION_MAP_PROPERTIES_KHR); }
        /** Sets the specified value to the {@link VkVideoFormatQuantizationMapPropertiesKHR#pNext} field. */
        public VkVideoFormatQuantizationMapPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoFormatQuantizationMapPropertiesKHR.npNext(address(), value); return this; }

    }

}