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
 * struct VkBindTensorMemoryInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkTensorARM tensor;
 *     VkDeviceMemory memory;
 *     VkDeviceSize memoryOffset;
 * }}</pre>
 */
public class VkBindTensorMemoryInfoARM extends Struct<VkBindTensorMemoryInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TENSOR,
        MEMORY,
        MEMORYOFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TENSOR = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        MEMORYOFFSET = layout.offsetof(4);
    }

    protected VkBindTensorMemoryInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindTensorMemoryInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkBindTensorMemoryInfoARM(address, container);
    }

    /**
     * Creates a {@code VkBindTensorMemoryInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindTensorMemoryInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code tensor} field. */
    @NativeType("VkTensorARM")
    public long tensor() { return ntensor(address()); }
    /** @return the value of the {@code memory} field. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** @return the value of the {@code memoryOffset} field. */
    @NativeType("VkDeviceSize")
    public long memoryOffset() { return nmemoryOffset(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindTensorMemoryInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_BIND_TENSOR_MEMORY_INFO_ARM STRUCTURE_TYPE_BIND_TENSOR_MEMORY_INFO_ARM} value to the {@code sType} field. */
    public VkBindTensorMemoryInfoARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_BIND_TENSOR_MEMORY_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindTensorMemoryInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code tensor} field. */
    public VkBindTensorMemoryInfoARM tensor(@NativeType("VkTensorARM") long value) { ntensor(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    public VkBindTensorMemoryInfoARM memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@code memoryOffset} field. */
    public VkBindTensorMemoryInfoARM memoryOffset(@NativeType("VkDeviceSize") long value) { nmemoryOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindTensorMemoryInfoARM set(
        int sType,
        long pNext,
        long tensor,
        long memory,
        long memoryOffset
    ) {
        sType(sType);
        pNext(pNext);
        tensor(tensor);
        memory(memory);
        memoryOffset(memoryOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindTensorMemoryInfoARM set(VkBindTensorMemoryInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindTensorMemoryInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindTensorMemoryInfoARM malloc() {
        return new VkBindTensorMemoryInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindTensorMemoryInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindTensorMemoryInfoARM calloc() {
        return new VkBindTensorMemoryInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindTensorMemoryInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkBindTensorMemoryInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindTensorMemoryInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkBindTensorMemoryInfoARM} instance for the specified memory address. */
    public static VkBindTensorMemoryInfoARM create(long address) {
        return new VkBindTensorMemoryInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBindTensorMemoryInfoARM createSafe(long address) {
        return address == NULL ? null : new VkBindTensorMemoryInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkBindTensorMemoryInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindTensorMemoryInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindTensorMemoryInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindTensorMemoryInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindTensorMemoryInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindTensorMemoryInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindTensorMemoryInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindTensorMemoryInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBindTensorMemoryInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBindTensorMemoryInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindTensorMemoryInfoARM malloc(MemoryStack stack) {
        return new VkBindTensorMemoryInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindTensorMemoryInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindTensorMemoryInfoARM calloc(MemoryStack stack) {
        return new VkBindTensorMemoryInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindTensorMemoryInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindTensorMemoryInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindTensorMemoryInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindTensorMemoryInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBindTensorMemoryInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindTensorMemoryInfoARM.PNEXT); }
    /** Unsafe version of {@link #tensor}. */
    public static long ntensor(long struct) { return memGetLong(struct + VkBindTensorMemoryInfoARM.TENSOR); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return memGetLong(struct + VkBindTensorMemoryInfoARM.MEMORY); }
    /** Unsafe version of {@link #memoryOffset}. */
    public static long nmemoryOffset(long struct) { return memGetLong(struct + VkBindTensorMemoryInfoARM.MEMORYOFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBindTensorMemoryInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindTensorMemoryInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #tensor(long) tensor}. */
    public static void ntensor(long struct, long value) { memPutLong(struct + VkBindTensorMemoryInfoARM.TENSOR, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { memPutLong(struct + VkBindTensorMemoryInfoARM.MEMORY, value); }
    /** Unsafe version of {@link #memoryOffset(long) memoryOffset}. */
    public static void nmemoryOffset(long struct, long value) { memPutLong(struct + VkBindTensorMemoryInfoARM.MEMORYOFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkBindTensorMemoryInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkBindTensorMemoryInfoARM, Buffer> implements NativeResource {

        private static final VkBindTensorMemoryInfoARM ELEMENT_FACTORY = VkBindTensorMemoryInfoARM.create(-1L);

        /**
         * Creates a new {@code VkBindTensorMemoryInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindTensorMemoryInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindTensorMemoryInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindTensorMemoryInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindTensorMemoryInfoARM.npNext(address()); }
        /** @return the value of the {@code tensor} field. */
        @NativeType("VkTensorARM")
        public long tensor() { return VkBindTensorMemoryInfoARM.ntensor(address()); }
        /** @return the value of the {@code memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkBindTensorMemoryInfoARM.nmemory(address()); }
        /** @return the value of the {@code memoryOffset} field. */
        @NativeType("VkDeviceSize")
        public long memoryOffset() { return VkBindTensorMemoryInfoARM.nmemoryOffset(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindTensorMemoryInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkBindTensorMemoryInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_BIND_TENSOR_MEMORY_INFO_ARM STRUCTURE_TYPE_BIND_TENSOR_MEMORY_INFO_ARM} value to the {@code sType} field. */
        public VkBindTensorMemoryInfoARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_BIND_TENSOR_MEMORY_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindTensorMemoryInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkBindTensorMemoryInfoARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code tensor} field. */
        public VkBindTensorMemoryInfoARM.Buffer tensor(@NativeType("VkTensorARM") long value) { VkBindTensorMemoryInfoARM.ntensor(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        public VkBindTensorMemoryInfoARM.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkBindTensorMemoryInfoARM.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@code memoryOffset} field. */
        public VkBindTensorMemoryInfoARM.Buffer memoryOffset(@NativeType("VkDeviceSize") long value) { VkBindTensorMemoryInfoARM.nmemoryOffset(address(), value); return this; }

    }

}