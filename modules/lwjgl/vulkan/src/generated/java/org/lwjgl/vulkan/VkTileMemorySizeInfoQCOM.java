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
 * struct VkTileMemorySizeInfoQCOM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDeviceSize size;
 * }}</pre>
 */
public class VkTileMemorySizeInfoQCOM extends Struct<VkTileMemorySizeInfoQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SIZE;

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
        SIZE = layout.offsetof(2);
    }

    protected VkTileMemorySizeInfoQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkTileMemorySizeInfoQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkTileMemorySizeInfoQCOM(address, container);
    }

    /**
     * Creates a {@code VkTileMemorySizeInfoQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTileMemorySizeInfoQCOM(ByteBuffer container) {
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
    /** @return the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkTileMemorySizeInfoQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMTileMemoryHeap#VK_STRUCTURE_TYPE_TILE_MEMORY_SIZE_INFO_QCOM STRUCTURE_TYPE_TILE_MEMORY_SIZE_INFO_QCOM} value to the {@code sType} field. */
    public VkTileMemorySizeInfoQCOM sType$Default() { return sType(QCOMTileMemoryHeap.VK_STRUCTURE_TYPE_TILE_MEMORY_SIZE_INFO_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkTileMemorySizeInfoQCOM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public VkTileMemorySizeInfoQCOM size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkTileMemorySizeInfoQCOM set(
        int sType,
        long pNext,
        long size
    ) {
        sType(sType);
        pNext(pNext);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkTileMemorySizeInfoQCOM set(VkTileMemorySizeInfoQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTileMemorySizeInfoQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTileMemorySizeInfoQCOM malloc() {
        return new VkTileMemorySizeInfoQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkTileMemorySizeInfoQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTileMemorySizeInfoQCOM calloc() {
        return new VkTileMemorySizeInfoQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkTileMemorySizeInfoQCOM} instance allocated with {@link BufferUtils}. */
    public static VkTileMemorySizeInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTileMemorySizeInfoQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkTileMemorySizeInfoQCOM} instance for the specified memory address. */
    public static VkTileMemorySizeInfoQCOM create(long address) {
        return new VkTileMemorySizeInfoQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkTileMemorySizeInfoQCOM createSafe(long address) {
        return address == NULL ? null : new VkTileMemorySizeInfoQCOM(address, null);
    }

    /**
     * Returns a new {@link VkTileMemorySizeInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTileMemorySizeInfoQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTileMemorySizeInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTileMemorySizeInfoQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTileMemorySizeInfoQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTileMemorySizeInfoQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkTileMemorySizeInfoQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTileMemorySizeInfoQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkTileMemorySizeInfoQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkTileMemorySizeInfoQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTileMemorySizeInfoQCOM malloc(MemoryStack stack) {
        return new VkTileMemorySizeInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkTileMemorySizeInfoQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTileMemorySizeInfoQCOM calloc(MemoryStack stack) {
        return new VkTileMemorySizeInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkTileMemorySizeInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTileMemorySizeInfoQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTileMemorySizeInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTileMemorySizeInfoQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkTileMemorySizeInfoQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTileMemorySizeInfoQCOM.PNEXT); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkTileMemorySizeInfoQCOM.SIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkTileMemorySizeInfoQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkTileMemorySizeInfoQCOM.PNEXT, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + VkTileMemorySizeInfoQCOM.SIZE, value); }

    // -----------------------------------

    /** An array of {@link VkTileMemorySizeInfoQCOM} structs. */
    public static class Buffer extends StructBuffer<VkTileMemorySizeInfoQCOM, Buffer> implements NativeResource {

        private static final VkTileMemorySizeInfoQCOM ELEMENT_FACTORY = VkTileMemorySizeInfoQCOM.create(-1L);

        /**
         * Creates a new {@code VkTileMemorySizeInfoQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTileMemorySizeInfoQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkTileMemorySizeInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkTileMemorySizeInfoQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkTileMemorySizeInfoQCOM.npNext(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkTileMemorySizeInfoQCOM.nsize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkTileMemorySizeInfoQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkTileMemorySizeInfoQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMTileMemoryHeap#VK_STRUCTURE_TYPE_TILE_MEMORY_SIZE_INFO_QCOM STRUCTURE_TYPE_TILE_MEMORY_SIZE_INFO_QCOM} value to the {@code sType} field. */
        public VkTileMemorySizeInfoQCOM.Buffer sType$Default() { return sType(QCOMTileMemoryHeap.VK_STRUCTURE_TYPE_TILE_MEMORY_SIZE_INFO_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkTileMemorySizeInfoQCOM.Buffer pNext(@NativeType("void const *") long value) { VkTileMemorySizeInfoQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkTileMemorySizeInfoQCOM.Buffer size(@NativeType("VkDeviceSize") long value) { VkTileMemorySizeInfoQCOM.nsize(address(), value); return this; }

    }

}