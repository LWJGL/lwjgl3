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
 * struct VkPerformanceQuerySubmitInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t counterPassIndex;
 * }}</pre>
 */
public class VkPerformanceQuerySubmitInfoKHR extends Struct<VkPerformanceQuerySubmitInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COUNTERPASSINDEX;

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
        COUNTERPASSINDEX = layout.offsetof(2);
    }

    protected VkPerformanceQuerySubmitInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPerformanceQuerySubmitInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPerformanceQuerySubmitInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkPerformanceQuerySubmitInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPerformanceQuerySubmitInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code counterPassIndex} field. */
    @NativeType("uint32_t")
    public int counterPassIndex() { return ncounterPassIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPerformanceQuerySubmitInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR} value to the {@code sType} field. */
    public VkPerformanceQuerySubmitInfoKHR sType$Default() { return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPerformanceQuerySubmitInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code counterPassIndex} field. */
    public VkPerformanceQuerySubmitInfoKHR counterPassIndex(@NativeType("uint32_t") int value) { ncounterPassIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPerformanceQuerySubmitInfoKHR set(
        int sType,
        long pNext,
        int counterPassIndex
    ) {
        sType(sType);
        pNext(pNext);
        counterPassIndex(counterPassIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPerformanceQuerySubmitInfoKHR set(VkPerformanceQuerySubmitInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPerformanceQuerySubmitInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPerformanceQuerySubmitInfoKHR malloc() {
        return new VkPerformanceQuerySubmitInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPerformanceQuerySubmitInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPerformanceQuerySubmitInfoKHR calloc() {
        return new VkPerformanceQuerySubmitInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPerformanceQuerySubmitInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPerformanceQuerySubmitInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPerformanceQuerySubmitInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPerformanceQuerySubmitInfoKHR} instance for the specified memory address. */
    public static VkPerformanceQuerySubmitInfoKHR create(long address) {
        return new VkPerformanceQuerySubmitInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPerformanceQuerySubmitInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkPerformanceQuerySubmitInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkPerformanceQuerySubmitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceQuerySubmitInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceQuerySubmitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceQuerySubmitInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceQuerySubmitInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceQuerySubmitInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPerformanceQuerySubmitInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPerformanceQuerySubmitInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPerformanceQuerySubmitInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPerformanceQuerySubmitInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceQuerySubmitInfoKHR malloc(MemoryStack stack) {
        return new VkPerformanceQuerySubmitInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPerformanceQuerySubmitInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceQuerySubmitInfoKHR calloc(MemoryStack stack) {
        return new VkPerformanceQuerySubmitInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPerformanceQuerySubmitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceQuerySubmitInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceQuerySubmitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceQuerySubmitInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPerformanceQuerySubmitInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPerformanceQuerySubmitInfoKHR.PNEXT); }
    /** Unsafe version of {@link #counterPassIndex}. */
    public static int ncounterPassIndex(long struct) { return memGetInt(struct + VkPerformanceQuerySubmitInfoKHR.COUNTERPASSINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPerformanceQuerySubmitInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPerformanceQuerySubmitInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #counterPassIndex(int) counterPassIndex}. */
    public static void ncounterPassIndex(long struct, int value) { memPutInt(struct + VkPerformanceQuerySubmitInfoKHR.COUNTERPASSINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkPerformanceQuerySubmitInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPerformanceQuerySubmitInfoKHR, Buffer> implements NativeResource {

        private static final VkPerformanceQuerySubmitInfoKHR ELEMENT_FACTORY = VkPerformanceQuerySubmitInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPerformanceQuerySubmitInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPerformanceQuerySubmitInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPerformanceQuerySubmitInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPerformanceQuerySubmitInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPerformanceQuerySubmitInfoKHR.npNext(address()); }
        /** @return the value of the {@code counterPassIndex} field. */
        @NativeType("uint32_t")
        public int counterPassIndex() { return VkPerformanceQuerySubmitInfoKHR.ncounterPassIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPerformanceQuerySubmitInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPerformanceQuerySubmitInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR} value to the {@code sType} field. */
        public VkPerformanceQuerySubmitInfoKHR.Buffer sType$Default() { return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPerformanceQuerySubmitInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPerformanceQuerySubmitInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code counterPassIndex} field. */
        public VkPerformanceQuerySubmitInfoKHR.Buffer counterPassIndex(@NativeType("uint32_t") int value) { VkPerformanceQuerySubmitInfoKHR.ncounterPassIndex(address(), value); return this; }

    }

}