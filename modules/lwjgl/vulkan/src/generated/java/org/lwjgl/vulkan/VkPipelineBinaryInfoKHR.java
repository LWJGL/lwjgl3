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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPipelineBinaryInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t binaryCount;
 *     VkPipelineBinaryKHR const * pPipelineBinaries;
 * }}</pre>
 */
public class VkPipelineBinaryInfoKHR extends Struct<VkPipelineBinaryInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BINARYCOUNT,
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
        BINARYCOUNT = layout.offsetof(2);
        PPIPELINEBINARIES = layout.offsetof(3);
    }

    protected VkPipelineBinaryInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineBinaryInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineBinaryInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkPipelineBinaryInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineBinaryInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code binaryCount} field. */
    @NativeType("uint32_t")
    public int binaryCount() { return nbinaryCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pPipelineBinaries} field. */
    @NativeType("VkPipelineBinaryKHR const *")
    public @Nullable LongBuffer pPipelineBinaries() { return npPipelineBinaries(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineBinaryInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPipelineBinary#VK_STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR} value to the {@code sType} field. */
    public VkPipelineBinaryInfoKHR sType$Default() { return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineBinaryInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pPipelineBinaries} field. */
    public VkPipelineBinaryInfoKHR pPipelineBinaries(@Nullable @NativeType("VkPipelineBinaryKHR const *") LongBuffer value) { npPipelineBinaries(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineBinaryInfoKHR set(
        int sType,
        long pNext,
        @Nullable LongBuffer pPipelineBinaries
    ) {
        sType(sType);
        pNext(pNext);
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
    public VkPipelineBinaryInfoKHR set(VkPipelineBinaryInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineBinaryInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineBinaryInfoKHR malloc() {
        return new VkPipelineBinaryInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineBinaryInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineBinaryInfoKHR calloc() {
        return new VkPipelineBinaryInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineBinaryInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineBinaryInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineBinaryInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineBinaryInfoKHR} instance for the specified memory address. */
    public static VkPipelineBinaryInfoKHR create(long address) {
        return new VkPipelineBinaryInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineBinaryInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkPipelineBinaryInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkPipelineBinaryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineBinaryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineBinaryInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineBinaryInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineBinaryInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineBinaryInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineBinaryInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineBinaryInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineBinaryInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineBinaryInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineBinaryInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineBinaryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineBinaryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineBinaryInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineBinaryInfoKHR.PNEXT); }
    /** Unsafe version of {@link #binaryCount}. */
    public static int nbinaryCount(long struct) { return memGetInt(struct + VkPipelineBinaryInfoKHR.BINARYCOUNT); }
    /** Unsafe version of {@link #pPipelineBinaries() pPipelineBinaries}. */
    public static @Nullable LongBuffer npPipelineBinaries(long struct) { return memLongBufferSafe(memGetAddress(struct + VkPipelineBinaryInfoKHR.PPIPELINEBINARIES), nbinaryCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineBinaryInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineBinaryInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code binaryCount} field of the specified {@code struct}. */
    public static void nbinaryCount(long struct, int value) { memPutInt(struct + VkPipelineBinaryInfoKHR.BINARYCOUNT, value); }
    /** Unsafe version of {@link #pPipelineBinaries(LongBuffer) pPipelineBinaries}. */
    public static void npPipelineBinaries(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkPipelineBinaryInfoKHR.PPIPELINEBINARIES, memAddressSafe(value)); nbinaryCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nbinaryCount(struct) != 0) {
            check(memGetAddress(struct + VkPipelineBinaryInfoKHR.PPIPELINEBINARIES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkPipelineBinaryInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPipelineBinaryInfoKHR, Buffer> implements NativeResource {

        private static final VkPipelineBinaryInfoKHR ELEMENT_FACTORY = VkPipelineBinaryInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineBinaryInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineBinaryInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineBinaryInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineBinaryInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineBinaryInfoKHR.npNext(address()); }
        /** @return the value of the {@code binaryCount} field. */
        @NativeType("uint32_t")
        public int binaryCount() { return VkPipelineBinaryInfoKHR.nbinaryCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pPipelineBinaries} field. */
        @NativeType("VkPipelineBinaryKHR const *")
        public @Nullable LongBuffer pPipelineBinaries() { return VkPipelineBinaryInfoKHR.npPipelineBinaries(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineBinaryInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineBinaryInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPipelineBinary#VK_STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR} value to the {@code sType} field. */
        public VkPipelineBinaryInfoKHR.Buffer sType$Default() { return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineBinaryInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPipelineBinaryInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pPipelineBinaries} field. */
        public VkPipelineBinaryInfoKHR.Buffer pPipelineBinaries(@Nullable @NativeType("VkPipelineBinaryKHR const *") LongBuffer value) { VkPipelineBinaryInfoKHR.npPipelineBinaries(address(), value); return this; }

    }

}