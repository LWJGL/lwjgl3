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
 * struct VkVideoFormatH265QuantizationMapPropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkVideoEncodeH265CtbSizeFlagsKHR compatibleCtbSizes;
 * }}</pre>
 */
public class VkVideoFormatH265QuantizationMapPropertiesKHR extends Struct<VkVideoFormatH265QuantizationMapPropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COMPATIBLECTBSIZES;

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
        COMPATIBLECTBSIZES = layout.offsetof(2);
    }

    protected VkVideoFormatH265QuantizationMapPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoFormatH265QuantizationMapPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoFormatH265QuantizationMapPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoFormatH265QuantizationMapPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoFormatH265QuantizationMapPropertiesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code compatibleCtbSizes} field. */
    @NativeType("VkVideoEncodeH265CtbSizeFlagsKHR")
    public int compatibleCtbSizes() { return ncompatibleCtbSizes(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoFormatH265QuantizationMapPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQuantizationMap#VK_STRUCTURE_TYPE_VIDEO_FORMAT_H265_QUANTIZATION_MAP_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_FORMAT_H265_QUANTIZATION_MAP_PROPERTIES_KHR} value to the {@code sType} field. */
    public VkVideoFormatH265QuantizationMapPropertiesKHR sType$Default() { return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_FORMAT_H265_QUANTIZATION_MAP_PROPERTIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoFormatH265QuantizationMapPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoFormatH265QuantizationMapPropertiesKHR set(
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
    public VkVideoFormatH265QuantizationMapPropertiesKHR set(VkVideoFormatH265QuantizationMapPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoFormatH265QuantizationMapPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoFormatH265QuantizationMapPropertiesKHR malloc() {
        return new VkVideoFormatH265QuantizationMapPropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoFormatH265QuantizationMapPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoFormatH265QuantizationMapPropertiesKHR calloc() {
        return new VkVideoFormatH265QuantizationMapPropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoFormatH265QuantizationMapPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoFormatH265QuantizationMapPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoFormatH265QuantizationMapPropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoFormatH265QuantizationMapPropertiesKHR} instance for the specified memory address. */
    public static VkVideoFormatH265QuantizationMapPropertiesKHR create(long address) {
        return new VkVideoFormatH265QuantizationMapPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoFormatH265QuantizationMapPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoFormatH265QuantizationMapPropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoFormatH265QuantizationMapPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatH265QuantizationMapPropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoFormatH265QuantizationMapPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatH265QuantizationMapPropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoFormatH265QuantizationMapPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatH265QuantizationMapPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoFormatH265QuantizationMapPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatH265QuantizationMapPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoFormatH265QuantizationMapPropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoFormatH265QuantizationMapPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoFormatH265QuantizationMapPropertiesKHR malloc(MemoryStack stack) {
        return new VkVideoFormatH265QuantizationMapPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoFormatH265QuantizationMapPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoFormatH265QuantizationMapPropertiesKHR calloc(MemoryStack stack) {
        return new VkVideoFormatH265QuantizationMapPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoFormatH265QuantizationMapPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatH265QuantizationMapPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoFormatH265QuantizationMapPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoFormatH265QuantizationMapPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoFormatH265QuantizationMapPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoFormatH265QuantizationMapPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #compatibleCtbSizes}. */
    public static int ncompatibleCtbSizes(long struct) { return memGetInt(struct + VkVideoFormatH265QuantizationMapPropertiesKHR.COMPATIBLECTBSIZES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoFormatH265QuantizationMapPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoFormatH265QuantizationMapPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoFormatH265QuantizationMapPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoFormatH265QuantizationMapPropertiesKHR, Buffer> implements NativeResource {

        private static final VkVideoFormatH265QuantizationMapPropertiesKHR ELEMENT_FACTORY = VkVideoFormatH265QuantizationMapPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoFormatH265QuantizationMapPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoFormatH265QuantizationMapPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoFormatH265QuantizationMapPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoFormatH265QuantizationMapPropertiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoFormatH265QuantizationMapPropertiesKHR.npNext(address()); }
        /** @return the value of the {@code compatibleCtbSizes} field. */
        @NativeType("VkVideoEncodeH265CtbSizeFlagsKHR")
        public int compatibleCtbSizes() { return VkVideoFormatH265QuantizationMapPropertiesKHR.ncompatibleCtbSizes(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoFormatH265QuantizationMapPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoFormatH265QuantizationMapPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQuantizationMap#VK_STRUCTURE_TYPE_VIDEO_FORMAT_H265_QUANTIZATION_MAP_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_FORMAT_H265_QUANTIZATION_MAP_PROPERTIES_KHR} value to the {@code sType} field. */
        public VkVideoFormatH265QuantizationMapPropertiesKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_FORMAT_H265_QUANTIZATION_MAP_PROPERTIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoFormatH265QuantizationMapPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoFormatH265QuantizationMapPropertiesKHR.npNext(address(), value); return this; }

    }

}