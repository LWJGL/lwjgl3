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
 * Structure describing AV1 quantization map properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>The values returned in this structure are only defined if the allowed image usage flags returned in {@link VkVideoFormatPropertiesKHR}{@code ::imageUsageFlags} for this video format include {@link KHRVideoEncodeQuantizationMap#VK_IMAGE_USAGE_VIDEO_ENCODE_QUANTIZATION_DELTA_MAP_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_QUANTIZATION_DELTA_MAP_BIT_KHR} or {@link KHRVideoEncodeQuantizationMap#VK_IMAGE_USAGE_VIDEO_ENCODE_EMPHASIS_MAP_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_EMPHASIS_MAP_BIT_KHR}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeQuantizationMap#VK_STRUCTURE_TYPE_VIDEO_FORMAT_AV1_QUANTIZATION_MAP_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_FORMAT_AV1_QUANTIZATION_MAP_PROPERTIES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoFormatAV1QuantizationMapPropertiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkVideoEncodeAV1SuperblockSizeFlagsKHR {@link #compatibleSuperblockSizes};
 * }</code></pre>
 */
public class VkVideoFormatAV1QuantizationMapPropertiesKHR extends Struct<VkVideoFormatAV1QuantizationMapPropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COMPATIBLESUPERBLOCKSIZES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMPATIBLESUPERBLOCKSIZES = layout.offsetof(2);
    }

    protected VkVideoFormatAV1QuantizationMapPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoFormatAV1QuantizationMapPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoFormatAV1QuantizationMapPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoFormatAV1QuantizationMapPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoFormatAV1QuantizationMapPropertiesKHR(ByteBuffer container) {
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
    /**
     * a bitmask of {@code VkVideoEncodeAV1SuperblockSizeFlagBitsKHR} indicating the AV1 superblock sizes that quantization maps using this video format are compatible with.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The value of {@code compatibleSuperblockSizes} does not limit the use of the specific quantization map format, but does limit the implementation in being able to encode pictures with superblock sizes not included in {@code compatibleSuperblockSizes} but otherwise supported by the used video profile, as indicated by {@link VkVideoEncodeAV1CapabilitiesKHR}{@code ::superblockSizes}. In particular, using smaller <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-quantization-map-texel-size">quantization map texel sizes</a> may prevent implementations from encoding with larger superblock sizes which may have a negative impact on the efficiency of the encoder.</p>
     * </div>
     */
    @NativeType("VkVideoEncodeAV1SuperblockSizeFlagsKHR")
    public int compatibleSuperblockSizes() { return ncompatibleSuperblockSizes(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoFormatAV1QuantizationMapPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQuantizationMap#VK_STRUCTURE_TYPE_VIDEO_FORMAT_AV1_QUANTIZATION_MAP_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_FORMAT_AV1_QUANTIZATION_MAP_PROPERTIES_KHR} value to the {@link #sType} field. */
    public VkVideoFormatAV1QuantizationMapPropertiesKHR sType$Default() { return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_FORMAT_AV1_QUANTIZATION_MAP_PROPERTIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoFormatAV1QuantizationMapPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoFormatAV1QuantizationMapPropertiesKHR set(
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
    public VkVideoFormatAV1QuantizationMapPropertiesKHR set(VkVideoFormatAV1QuantizationMapPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoFormatAV1QuantizationMapPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR malloc() {
        return new VkVideoFormatAV1QuantizationMapPropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoFormatAV1QuantizationMapPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR calloc() {
        return new VkVideoFormatAV1QuantizationMapPropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoFormatAV1QuantizationMapPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoFormatAV1QuantizationMapPropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoFormatAV1QuantizationMapPropertiesKHR} instance for the specified memory address. */
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR create(long address) {
        return new VkVideoFormatAV1QuantizationMapPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoFormatAV1QuantizationMapPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoFormatAV1QuantizationMapPropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoFormatAV1QuantizationMapPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoFormatAV1QuantizationMapPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoFormatAV1QuantizationMapPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoFormatAV1QuantizationMapPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoFormatAV1QuantizationMapPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR malloc(MemoryStack stack) {
        return new VkVideoFormatAV1QuantizationMapPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoFormatAV1QuantizationMapPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR calloc(MemoryStack stack) {
        return new VkVideoFormatAV1QuantizationMapPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoFormatAV1QuantizationMapPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoFormatAV1QuantizationMapPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoFormatAV1QuantizationMapPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoFormatAV1QuantizationMapPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #compatibleSuperblockSizes}. */
    public static int ncompatibleSuperblockSizes(long struct) { return memGetInt(struct + VkVideoFormatAV1QuantizationMapPropertiesKHR.COMPATIBLESUPERBLOCKSIZES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoFormatAV1QuantizationMapPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoFormatAV1QuantizationMapPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoFormatAV1QuantizationMapPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoFormatAV1QuantizationMapPropertiesKHR, Buffer> implements NativeResource {

        private static final VkVideoFormatAV1QuantizationMapPropertiesKHR ELEMENT_FACTORY = VkVideoFormatAV1QuantizationMapPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoFormatAV1QuantizationMapPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoFormatAV1QuantizationMapPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoFormatAV1QuantizationMapPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoFormatAV1QuantizationMapPropertiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoFormatAV1QuantizationMapPropertiesKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoFormatAV1QuantizationMapPropertiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoFormatAV1QuantizationMapPropertiesKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoFormatAV1QuantizationMapPropertiesKHR#compatibleSuperblockSizes} field. */
        @NativeType("VkVideoEncodeAV1SuperblockSizeFlagsKHR")
        public int compatibleSuperblockSizes() { return VkVideoFormatAV1QuantizationMapPropertiesKHR.ncompatibleSuperblockSizes(address()); }

        /** Sets the specified value to the {@link VkVideoFormatAV1QuantizationMapPropertiesKHR#sType} field. */
        public VkVideoFormatAV1QuantizationMapPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoFormatAV1QuantizationMapPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQuantizationMap#VK_STRUCTURE_TYPE_VIDEO_FORMAT_AV1_QUANTIZATION_MAP_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_FORMAT_AV1_QUANTIZATION_MAP_PROPERTIES_KHR} value to the {@link VkVideoFormatAV1QuantizationMapPropertiesKHR#sType} field. */
        public VkVideoFormatAV1QuantizationMapPropertiesKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_FORMAT_AV1_QUANTIZATION_MAP_PROPERTIES_KHR); }
        /** Sets the specified value to the {@link VkVideoFormatAV1QuantizationMapPropertiesKHR#pNext} field. */
        public VkVideoFormatAV1QuantizationMapPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoFormatAV1QuantizationMapPropertiesKHR.npNext(address(), value); return this; }

    }

}