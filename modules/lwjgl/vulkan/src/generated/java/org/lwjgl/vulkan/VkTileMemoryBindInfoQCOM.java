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
 * struct VkTileMemoryBindInfoQCOM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDeviceMemory memory;
 * }}</pre>
 */
public class VkTileMemoryBindInfoQCOM extends Struct<VkTileMemoryBindInfoQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORY = layout.offsetof(2);
    }

    protected VkTileMemoryBindInfoQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkTileMemoryBindInfoQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkTileMemoryBindInfoQCOM(address, container);
    }

    /**
     * Creates a {@code VkTileMemoryBindInfoQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTileMemoryBindInfoQCOM(ByteBuffer container) {
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
    /** @return the value of the {@code memory} field. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkTileMemoryBindInfoQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMTileMemoryHeap#VK_STRUCTURE_TYPE_TILE_MEMORY_BIND_INFO_QCOM STRUCTURE_TYPE_TILE_MEMORY_BIND_INFO_QCOM} value to the {@code sType} field. */
    public VkTileMemoryBindInfoQCOM sType$Default() { return sType(QCOMTileMemoryHeap.VK_STRUCTURE_TYPE_TILE_MEMORY_BIND_INFO_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkTileMemoryBindInfoQCOM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    public VkTileMemoryBindInfoQCOM memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkTileMemoryBindInfoQCOM set(
        int sType,
        long pNext,
        long memory
    ) {
        sType(sType);
        pNext(pNext);
        memory(memory);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkTileMemoryBindInfoQCOM set(VkTileMemoryBindInfoQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTileMemoryBindInfoQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTileMemoryBindInfoQCOM malloc() {
        return new VkTileMemoryBindInfoQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkTileMemoryBindInfoQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTileMemoryBindInfoQCOM calloc() {
        return new VkTileMemoryBindInfoQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkTileMemoryBindInfoQCOM} instance allocated with {@link BufferUtils}. */
    public static VkTileMemoryBindInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTileMemoryBindInfoQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkTileMemoryBindInfoQCOM} instance for the specified memory address. */
    public static VkTileMemoryBindInfoQCOM create(long address) {
        return new VkTileMemoryBindInfoQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkTileMemoryBindInfoQCOM createSafe(long address) {
        return address == NULL ? null : new VkTileMemoryBindInfoQCOM(address, null);
    }

    /**
     * Returns a new {@link VkTileMemoryBindInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTileMemoryBindInfoQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTileMemoryBindInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTileMemoryBindInfoQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTileMemoryBindInfoQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTileMemoryBindInfoQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkTileMemoryBindInfoQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTileMemoryBindInfoQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkTileMemoryBindInfoQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkTileMemoryBindInfoQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTileMemoryBindInfoQCOM malloc(MemoryStack stack) {
        return new VkTileMemoryBindInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkTileMemoryBindInfoQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTileMemoryBindInfoQCOM calloc(MemoryStack stack) {
        return new VkTileMemoryBindInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkTileMemoryBindInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTileMemoryBindInfoQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTileMemoryBindInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTileMemoryBindInfoQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkTileMemoryBindInfoQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTileMemoryBindInfoQCOM.PNEXT); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return memGetLong(struct + VkTileMemoryBindInfoQCOM.MEMORY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkTileMemoryBindInfoQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkTileMemoryBindInfoQCOM.PNEXT, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { memPutLong(struct + VkTileMemoryBindInfoQCOM.MEMORY, value); }

    // -----------------------------------

    /** An array of {@link VkTileMemoryBindInfoQCOM} structs. */
    public static class Buffer extends StructBuffer<VkTileMemoryBindInfoQCOM, Buffer> implements NativeResource {

        private static final VkTileMemoryBindInfoQCOM ELEMENT_FACTORY = VkTileMemoryBindInfoQCOM.create(-1L);

        /**
         * Creates a new {@code VkTileMemoryBindInfoQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTileMemoryBindInfoQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkTileMemoryBindInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkTileMemoryBindInfoQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkTileMemoryBindInfoQCOM.npNext(address()); }
        /** @return the value of the {@code memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkTileMemoryBindInfoQCOM.nmemory(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkTileMemoryBindInfoQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkTileMemoryBindInfoQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMTileMemoryHeap#VK_STRUCTURE_TYPE_TILE_MEMORY_BIND_INFO_QCOM STRUCTURE_TYPE_TILE_MEMORY_BIND_INFO_QCOM} value to the {@code sType} field. */
        public VkTileMemoryBindInfoQCOM.Buffer sType$Default() { return sType(QCOMTileMemoryHeap.VK_STRUCTURE_TYPE_TILE_MEMORY_BIND_INFO_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkTileMemoryBindInfoQCOM.Buffer pNext(@NativeType("void const *") long value) { VkTileMemoryBindInfoQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        public VkTileMemoryBindInfoQCOM.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkTileMemoryBindInfoQCOM.nmemory(address(), value); return this; }

    }

}