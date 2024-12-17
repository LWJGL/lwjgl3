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
 * struct VkSubresourceHostMemcpySize {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDeviceSize size;
 * }}</pre>
 */
public class VkSubresourceHostMemcpySize extends Struct<VkSubresourceHostMemcpySize> implements NativeResource {

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

    protected VkSubresourceHostMemcpySize(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubresourceHostMemcpySize create(long address, @Nullable ByteBuffer container) {
        return new VkSubresourceHostMemcpySize(address, container);
    }

    /**
     * Creates a {@code VkSubresourceHostMemcpySize} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubresourceHostMemcpySize(ByteBuffer container) {
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
    /** @return the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSubresourceHostMemcpySize sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE} value to the {@code sType} field. */
    public VkSubresourceHostMemcpySize sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSubresourceHostMemcpySize pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubresourceHostMemcpySize set(
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
    public VkSubresourceHostMemcpySize set(VkSubresourceHostMemcpySize src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubresourceHostMemcpySize} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubresourceHostMemcpySize malloc() {
        return new VkSubresourceHostMemcpySize(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubresourceHostMemcpySize} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubresourceHostMemcpySize calloc() {
        return new VkSubresourceHostMemcpySize(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubresourceHostMemcpySize} instance allocated with {@link BufferUtils}. */
    public static VkSubresourceHostMemcpySize create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubresourceHostMemcpySize(memAddress(container), container);
    }

    /** Returns a new {@code VkSubresourceHostMemcpySize} instance for the specified memory address. */
    public static VkSubresourceHostMemcpySize create(long address) {
        return new VkSubresourceHostMemcpySize(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSubresourceHostMemcpySize createSafe(long address) {
        return address == NULL ? null : new VkSubresourceHostMemcpySize(address, null);
    }

    /**
     * Returns a new {@link VkSubresourceHostMemcpySize.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceHostMemcpySize.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceHostMemcpySize.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceHostMemcpySize.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceHostMemcpySize.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceHostMemcpySize.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubresourceHostMemcpySize.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubresourceHostMemcpySize.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSubresourceHostMemcpySize.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSubresourceHostMemcpySize} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubresourceHostMemcpySize malloc(MemoryStack stack) {
        return new VkSubresourceHostMemcpySize(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubresourceHostMemcpySize} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubresourceHostMemcpySize calloc(MemoryStack stack) {
        return new VkSubresourceHostMemcpySize(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubresourceHostMemcpySize.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubresourceHostMemcpySize.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceHostMemcpySize.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubresourceHostMemcpySize.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSubresourceHostMemcpySize.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubresourceHostMemcpySize.PNEXT); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkSubresourceHostMemcpySize.SIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSubresourceHostMemcpySize.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubresourceHostMemcpySize.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkSubresourceHostMemcpySize} structs. */
    public static class Buffer extends StructBuffer<VkSubresourceHostMemcpySize, Buffer> implements NativeResource {

        private static final VkSubresourceHostMemcpySize ELEMENT_FACTORY = VkSubresourceHostMemcpySize.create(-1L);

        /**
         * Creates a new {@code VkSubresourceHostMemcpySize.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubresourceHostMemcpySize#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubresourceHostMemcpySize getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubresourceHostMemcpySize.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSubresourceHostMemcpySize.npNext(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkSubresourceHostMemcpySize.nsize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSubresourceHostMemcpySize.Buffer sType(@NativeType("VkStructureType") int value) { VkSubresourceHostMemcpySize.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE} value to the {@code sType} field. */
        public VkSubresourceHostMemcpySize.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSubresourceHostMemcpySize.Buffer pNext(@NativeType("void *") long value) { VkSubresourceHostMemcpySize.npNext(address(), value); return this; }

    }

}