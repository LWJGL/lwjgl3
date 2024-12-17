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
 * struct VkVideoEncodeQuantizationMapInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageView quantizationMap;
 *     {@link VkExtent2D VkExtent2D} quantizationMapExtent;
 * }}</pre>
 */
public class VkVideoEncodeQuantizationMapInfoKHR extends Struct<VkVideoEncodeQuantizationMapInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        QUANTIZATIONMAP,
        QUANTIZATIONMAPEXTENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        QUANTIZATIONMAP = layout.offsetof(2);
        QUANTIZATIONMAPEXTENT = layout.offsetof(3);
    }

    protected VkVideoEncodeQuantizationMapInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeQuantizationMapInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeQuantizationMapInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeQuantizationMapInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeQuantizationMapInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code quantizationMap} field. */
    @NativeType("VkImageView")
    public long quantizationMap() { return nquantizationMap(address()); }
    /** @return a {@link VkExtent2D} view of the {@code quantizationMapExtent} field. */
    public VkExtent2D quantizationMapExtent() { return nquantizationMapExtent(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeQuantizationMapInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQuantizationMap#VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeQuantizationMapInfoKHR sType$Default() { return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeQuantizationMapInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code quantizationMap} field. */
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMap(@NativeType("VkImageView") long value) { nquantizationMap(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@code quantizationMapExtent} field. */
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMapExtent(VkExtent2D value) { nquantizationMapExtent(address(), value); return this; }
    /** Passes the {@code quantizationMapExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMapExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(quantizationMapExtent()); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeQuantizationMapInfoKHR set(
        int sType,
        long pNext,
        long quantizationMap,
        VkExtent2D quantizationMapExtent
    ) {
        sType(sType);
        pNext(pNext);
        quantizationMap(quantizationMap);
        quantizationMapExtent(quantizationMapExtent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeQuantizationMapInfoKHR set(VkVideoEncodeQuantizationMapInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeQuantizationMapInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeQuantizationMapInfoKHR malloc() {
        return new VkVideoEncodeQuantizationMapInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeQuantizationMapInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeQuantizationMapInfoKHR calloc() {
        return new VkVideoEncodeQuantizationMapInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeQuantizationMapInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeQuantizationMapInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeQuantizationMapInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeQuantizationMapInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeQuantizationMapInfoKHR create(long address) {
        return new VkVideoEncodeQuantizationMapInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeQuantizationMapInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeQuantizationMapInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeQuantizationMapInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQuantizationMapInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeQuantizationMapInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQuantizationMapInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeQuantizationMapInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQuantizationMapInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeQuantizationMapInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQuantizationMapInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeQuantizationMapInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeQuantizationMapInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeQuantizationMapInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeQuantizationMapInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeQuantizationMapInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeQuantizationMapInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeQuantizationMapInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeQuantizationMapInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQuantizationMapInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeQuantizationMapInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQuantizationMapInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeQuantizationMapInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeQuantizationMapInfoKHR.PNEXT); }
    /** Unsafe version of {@link #quantizationMap}. */
    public static long nquantizationMap(long struct) { return memGetLong(struct + VkVideoEncodeQuantizationMapInfoKHR.QUANTIZATIONMAP); }
    /** Unsafe version of {@link #quantizationMapExtent}. */
    public static VkExtent2D nquantizationMapExtent(long struct) { return VkExtent2D.create(struct + VkVideoEncodeQuantizationMapInfoKHR.QUANTIZATIONMAPEXTENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeQuantizationMapInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeQuantizationMapInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #quantizationMap(long) quantizationMap}. */
    public static void nquantizationMap(long struct, long value) { memPutLong(struct + VkVideoEncodeQuantizationMapInfoKHR.QUANTIZATIONMAP, value); }
    /** Unsafe version of {@link #quantizationMapExtent(VkExtent2D) quantizationMapExtent}. */
    public static void nquantizationMapExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkVideoEncodeQuantizationMapInfoKHR.QUANTIZATIONMAPEXTENT, VkExtent2D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeQuantizationMapInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeQuantizationMapInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeQuantizationMapInfoKHR ELEMENT_FACTORY = VkVideoEncodeQuantizationMapInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeQuantizationMapInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeQuantizationMapInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeQuantizationMapInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeQuantizationMapInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeQuantizationMapInfoKHR.npNext(address()); }
        /** @return the value of the {@code quantizationMap} field. */
        @NativeType("VkImageView")
        public long quantizationMap() { return VkVideoEncodeQuantizationMapInfoKHR.nquantizationMap(address()); }
        /** @return a {@link VkExtent2D} view of the {@code quantizationMapExtent} field. */
        public VkExtent2D quantizationMapExtent() { return VkVideoEncodeQuantizationMapInfoKHR.nquantizationMapExtent(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeQuantizationMapInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeQuantizationMapInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQuantizationMap#VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeQuantizationMapInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeQuantizationMapInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeQuantizationMapInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code quantizationMap} field. */
        public VkVideoEncodeQuantizationMapInfoKHR.Buffer quantizationMap(@NativeType("VkImageView") long value) { VkVideoEncodeQuantizationMapInfoKHR.nquantizationMap(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@code quantizationMapExtent} field. */
        public VkVideoEncodeQuantizationMapInfoKHR.Buffer quantizationMapExtent(VkExtent2D value) { VkVideoEncodeQuantizationMapInfoKHR.nquantizationMapExtent(address(), value); return this; }
        /** Passes the {@code quantizationMapExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeQuantizationMapInfoKHR.Buffer quantizationMapExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(quantizationMapExtent()); return this; }

    }

}