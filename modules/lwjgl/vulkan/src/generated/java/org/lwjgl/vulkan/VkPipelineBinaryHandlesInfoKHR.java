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
 * struct VkPipelineBinaryHandlesInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t pipelineBinaryCount;
 *     VkPipelineBinaryKHR * pPipelineBinaries;
 * }}</pre>
 */
public class VkPipelineBinaryHandlesInfoKHR extends Struct<VkPipelineBinaryHandlesInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINEBINARYCOUNT,
        PPIPELINEBINARIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEBINARYCOUNT = layout.offsetof(2);
        PPIPELINEBINARIES = layout.offsetof(3);
    }

    protected VkPipelineBinaryHandlesInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineBinaryHandlesInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineBinaryHandlesInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkPipelineBinaryHandlesInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineBinaryHandlesInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code pipelineBinaryCount} field. */
    @NativeType("uint32_t")
    public int pipelineBinaryCount() { return npipelineBinaryCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pPipelineBinaries} field. */
    @NativeType("VkPipelineBinaryKHR *")
    public @Nullable LongBuffer pPipelineBinaries() { return npPipelineBinaries(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineBinaryHandlesInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPipelineBinary#VK_STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR} value to the {@code sType} field. */
    public VkPipelineBinaryHandlesInfoKHR sType$Default() { return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineBinaryHandlesInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineBinaryCount} field. */
    public VkPipelineBinaryHandlesInfoKHR pipelineBinaryCount(@NativeType("uint32_t") int value) { npipelineBinaryCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pPipelineBinaries} field. */
    public VkPipelineBinaryHandlesInfoKHR pPipelineBinaries(@Nullable @NativeType("VkPipelineBinaryKHR *") LongBuffer value) { npPipelineBinaries(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineBinaryHandlesInfoKHR set(
        int sType,
        long pNext,
        int pipelineBinaryCount,
        @Nullable LongBuffer pPipelineBinaries
    ) {
        sType(sType);
        pNext(pNext);
        pipelineBinaryCount(pipelineBinaryCount);
        pPipelineBinaries(pPipelineBinaries);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineBinaryHandlesInfoKHR set(VkPipelineBinaryHandlesInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineBinaryHandlesInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineBinaryHandlesInfoKHR malloc() {
        return new VkPipelineBinaryHandlesInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineBinaryHandlesInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineBinaryHandlesInfoKHR calloc() {
        return new VkPipelineBinaryHandlesInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineBinaryHandlesInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineBinaryHandlesInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineBinaryHandlesInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineBinaryHandlesInfoKHR} instance for the specified memory address. */
    public static VkPipelineBinaryHandlesInfoKHR create(long address) {
        return new VkPipelineBinaryHandlesInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineBinaryHandlesInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkPipelineBinaryHandlesInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkPipelineBinaryHandlesInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryHandlesInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineBinaryHandlesInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryHandlesInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineBinaryHandlesInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryHandlesInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineBinaryHandlesInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryHandlesInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineBinaryHandlesInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineBinaryHandlesInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineBinaryHandlesInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineBinaryHandlesInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineBinaryHandlesInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineBinaryHandlesInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineBinaryHandlesInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineBinaryHandlesInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryHandlesInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineBinaryHandlesInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryHandlesInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineBinaryHandlesInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineBinaryHandlesInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pipelineBinaryCount}. */
    public static int npipelineBinaryCount(long struct) { return memGetInt(struct + VkPipelineBinaryHandlesInfoKHR.PIPELINEBINARYCOUNT); }
    /** Unsafe version of {@link #pPipelineBinaries() pPipelineBinaries}. */
    public static @Nullable LongBuffer npPipelineBinaries(long struct) { return memLongBufferSafe(memGetAddress(struct + VkPipelineBinaryHandlesInfoKHR.PPIPELINEBINARIES), npipelineBinaryCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineBinaryHandlesInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineBinaryHandlesInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code pipelineBinaryCount} field of the specified {@code struct}. */
    public static void npipelineBinaryCount(long struct, int value) { memPutInt(struct + VkPipelineBinaryHandlesInfoKHR.PIPELINEBINARYCOUNT, value); }
    /** Unsafe version of {@link #pPipelineBinaries(LongBuffer) pPipelineBinaries}. */
    public static void npPipelineBinaries(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkPipelineBinaryHandlesInfoKHR.PPIPELINEBINARIES, memAddressSafe(value)); if (value != null) { npipelineBinaryCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPipelineBinaryHandlesInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPipelineBinaryHandlesInfoKHR, Buffer> implements NativeResource {

        private static final VkPipelineBinaryHandlesInfoKHR ELEMENT_FACTORY = VkPipelineBinaryHandlesInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineBinaryHandlesInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineBinaryHandlesInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineBinaryHandlesInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineBinaryHandlesInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineBinaryHandlesInfoKHR.npNext(address()); }
        /** @return the value of the {@code pipelineBinaryCount} field. */
        @NativeType("uint32_t")
        public int pipelineBinaryCount() { return VkPipelineBinaryHandlesInfoKHR.npipelineBinaryCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pPipelineBinaries} field. */
        @NativeType("VkPipelineBinaryKHR *")
        public @Nullable LongBuffer pPipelineBinaries() { return VkPipelineBinaryHandlesInfoKHR.npPipelineBinaries(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineBinaryHandlesInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineBinaryHandlesInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPipelineBinary#VK_STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR} value to the {@code sType} field. */
        public VkPipelineBinaryHandlesInfoKHR.Buffer sType$Default() { return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineBinaryHandlesInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPipelineBinaryHandlesInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineBinaryCount} field. */
        public VkPipelineBinaryHandlesInfoKHR.Buffer pipelineBinaryCount(@NativeType("uint32_t") int value) { VkPipelineBinaryHandlesInfoKHR.npipelineBinaryCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pPipelineBinaries} field. */
        public VkPipelineBinaryHandlesInfoKHR.Buffer pPipelineBinaries(@Nullable @NativeType("VkPipelineBinaryKHR *") LongBuffer value) { VkPipelineBinaryHandlesInfoKHR.npPipelineBinaries(address(), value); return this; }

    }

}