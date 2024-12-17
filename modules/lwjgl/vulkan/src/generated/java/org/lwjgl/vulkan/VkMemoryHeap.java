/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct VkMemoryHeap {
 *     VkDeviceSize size;
 *     VkMemoryHeapFlags flags;
 * }}</pre>
 */
public class VkMemoryHeap extends Struct<VkMemoryHeap> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIZE,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIZE = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
    }

    protected VkMemoryHeap(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryHeap create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryHeap(address, container);
    }

    /**
     * Creates a {@code VkMemoryHeap} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryHeap(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkMemoryHeapFlags")
    public int flags() { return nflags(address()); }

    // -----------------------------------

    /** Returns a new {@code VkMemoryHeap} instance for the specified memory address. */
    public static VkMemoryHeap create(long address) {
        return new VkMemoryHeap(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryHeap createSafe(long address) {
        return address == NULL ? null : new VkMemoryHeap(address, null);
    }

    /**
     * Create a {@link VkMemoryHeap.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryHeap.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryHeap.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkMemoryHeap.SIZE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkMemoryHeap.FLAGS); }

    // -----------------------------------

    /** An array of {@link VkMemoryHeap} structs. */
    public static class Buffer extends StructBuffer<VkMemoryHeap, Buffer> {

        private static final VkMemoryHeap ELEMENT_FACTORY = VkMemoryHeap.create(-1L);

        /**
         * Creates a new {@code VkMemoryHeap.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryHeap#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryHeap getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkMemoryHeap.nsize(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkMemoryHeapFlags")
        public int flags() { return VkMemoryHeap.nflags(address()); }

    }

}