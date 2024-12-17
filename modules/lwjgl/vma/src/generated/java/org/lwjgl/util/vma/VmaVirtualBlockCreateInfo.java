/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.*;

/**
 * <pre>{@code
 * struct VmaVirtualBlockCreateInfo {
 *     VkDeviceSize size;
 *     VmaVirtualBlockCreateFlagBits flags;
 *     {@link VkAllocationCallbacks VkAllocationCallbacks} const * pAllocationCallbacks;
 * }}</pre>
 */
public class VmaVirtualBlockCreateInfo extends Struct<VmaVirtualBlockCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIZE,
        FLAGS,
        PALLOCATIONCALLBACKS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIZE = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        PALLOCATIONCALLBACKS = layout.offsetof(2);
    }

    protected VmaVirtualBlockCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VmaVirtualBlockCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VmaVirtualBlockCreateInfo(address, container);
    }

    /**
     * Creates a {@code VmaVirtualBlockCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaVirtualBlockCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VmaVirtualBlockCreateFlagBits")
    public int flags() { return nflags(address()); }
    /** @return a {@link VkAllocationCallbacks} view of the struct pointed to by the {@code pAllocationCallbacks} field. */
    @NativeType("VkAllocationCallbacks const *")
    public @Nullable VkAllocationCallbacks pAllocationCallbacks() { return npAllocationCallbacks(address()); }

    /** Sets the specified value to the {@code size} field. */
    public VmaVirtualBlockCreateInfo size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VmaVirtualBlockCreateInfo flags(@NativeType("VmaVirtualBlockCreateFlagBits") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkAllocationCallbacks} to the {@code pAllocationCallbacks} field. */
    public VmaVirtualBlockCreateInfo pAllocationCallbacks(@Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks value) { npAllocationCallbacks(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VmaVirtualBlockCreateInfo set(
        long size,
        int flags,
        @Nullable VkAllocationCallbacks pAllocationCallbacks
    ) {
        size(size);
        flags(flags);
        pAllocationCallbacks(pAllocationCallbacks);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VmaVirtualBlockCreateInfo set(VmaVirtualBlockCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VmaVirtualBlockCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaVirtualBlockCreateInfo malloc() {
        return new VmaVirtualBlockCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VmaVirtualBlockCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaVirtualBlockCreateInfo calloc() {
        return new VmaVirtualBlockCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VmaVirtualBlockCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VmaVirtualBlockCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaVirtualBlockCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VmaVirtualBlockCreateInfo} instance for the specified memory address. */
    public static VmaVirtualBlockCreateInfo create(long address) {
        return new VmaVirtualBlockCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VmaVirtualBlockCreateInfo createSafe(long address) {
        return address == NULL ? null : new VmaVirtualBlockCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VmaVirtualBlockCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaVirtualBlockCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaVirtualBlockCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaVirtualBlockCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaVirtualBlockCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaVirtualBlockCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VmaVirtualBlockCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaVirtualBlockCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VmaVirtualBlockCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VmaVirtualBlockCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaVirtualBlockCreateInfo malloc(MemoryStack stack) {
        return new VmaVirtualBlockCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VmaVirtualBlockCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaVirtualBlockCreateInfo calloc(MemoryStack stack) {
        return new VmaVirtualBlockCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VmaVirtualBlockCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaVirtualBlockCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaVirtualBlockCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaVirtualBlockCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VmaVirtualBlockCreateInfo.SIZE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VmaVirtualBlockCreateInfo.FLAGS); }
    /** Unsafe version of {@link #pAllocationCallbacks}. */
    public static @Nullable VkAllocationCallbacks npAllocationCallbacks(long struct) { return VkAllocationCallbacks.createSafe(memGetAddress(struct + VmaVirtualBlockCreateInfo.PALLOCATIONCALLBACKS)); }

    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + VmaVirtualBlockCreateInfo.SIZE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VmaVirtualBlockCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #pAllocationCallbacks(VkAllocationCallbacks) pAllocationCallbacks}. */
    public static void npAllocationCallbacks(long struct, @Nullable VkAllocationCallbacks value) { memPutAddress(struct + VmaVirtualBlockCreateInfo.PALLOCATIONCALLBACKS, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VmaVirtualBlockCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VmaVirtualBlockCreateInfo, Buffer> implements NativeResource {

        private static final VmaVirtualBlockCreateInfo ELEMENT_FACTORY = VmaVirtualBlockCreateInfo.create(-1L);

        /**
         * Creates a new {@code VmaVirtualBlockCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaVirtualBlockCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VmaVirtualBlockCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VmaVirtualBlockCreateInfo.nsize(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VmaVirtualBlockCreateFlagBits")
        public int flags() { return VmaVirtualBlockCreateInfo.nflags(address()); }
        /** @return a {@link VkAllocationCallbacks} view of the struct pointed to by the {@code pAllocationCallbacks} field. */
        @NativeType("VkAllocationCallbacks const *")
        public @Nullable VkAllocationCallbacks pAllocationCallbacks() { return VmaVirtualBlockCreateInfo.npAllocationCallbacks(address()); }

        /** Sets the specified value to the {@code size} field. */
        public VmaVirtualBlockCreateInfo.Buffer size(@NativeType("VkDeviceSize") long value) { VmaVirtualBlockCreateInfo.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VmaVirtualBlockCreateInfo.Buffer flags(@NativeType("VmaVirtualBlockCreateFlagBits") int value) { VmaVirtualBlockCreateInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkAllocationCallbacks} to the {@code pAllocationCallbacks} field. */
        public VmaVirtualBlockCreateInfo.Buffer pAllocationCallbacks(@Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks value) { VmaVirtualBlockCreateInfo.npAllocationCallbacks(address(), value); return this; }

    }

}