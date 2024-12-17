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
 * struct VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkExtent2D VkExtent2D} quantizationMapTexelSize;
 * }}</pre>
 */
public class VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR extends Struct<VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR> implements NativeResource {

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

    protected VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(ByteBuffer container) {
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
    /** @return a {@link VkExtent2D} view of the {@code quantizationMapTexelSize} field. */
    public VkExtent2D quantizationMapTexelSize() { return nquantizationMapTexelSize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQuantizationMap#VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_SESSION_PARAMETERS_CREATE_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR sType$Default() { return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_SESSION_PARAMETERS_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@code quantizationMapTexelSize} field. */
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR quantizationMapTexelSize(VkExtent2D value) { nquantizationMapTexelSize(address(), value); return this; }
    /** Passes the {@code quantizationMapTexelSize} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR quantizationMapTexelSize(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(quantizationMapTexelSize()); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR set(
        int sType,
        long pNext,
        VkExtent2D quantizationMapTexelSize
    ) {
        sType(sType);
        pNext(pNext);
        quantizationMapTexelSize(quantizationMapTexelSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR set(VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR malloc() {
        return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR calloc() {
        return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR create(long address) {
        return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #quantizationMapTexelSize}. */
    public static VkExtent2D nquantizationMapTexelSize(long struct) { return VkExtent2D.create(struct + VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.QUANTIZATIONMAPTEXELSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #quantizationMapTexelSize(VkExtent2D) quantizationMapTexelSize}. */
    public static void nquantizationMapTexelSize(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.QUANTIZATIONMAPTEXELSIZE, VkExtent2D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR ELEMENT_FACTORY = VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.npNext(address()); }
        /** @return a {@link VkExtent2D} view of the {@code quantizationMapTexelSize} field. */
        public VkExtent2D quantizationMapTexelSize() { return VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.nquantizationMapTexelSize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQuantizationMap#VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_SESSION_PARAMETERS_CREATE_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_SESSION_PARAMETERS_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.npNext(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@code quantizationMapTexelSize} field. */
        public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.Buffer quantizationMapTexelSize(VkExtent2D value) { VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.nquantizationMapTexelSize(address(), value); return this; }
        /** Passes the {@code quantizationMapTexelSize} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.Buffer quantizationMapTexelSize(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(quantizationMapTexelSize()); return this; }

    }

}