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
 * struct VkMemoryRequirements {
 *     VkDeviceSize size;
 *     VkDeviceSize alignment;
 *     uint32_t memoryTypeBits;
 * }}</pre>
 */
public class VkMemoryRequirements extends Struct<VkMemoryRequirements> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIZE,
        ALIGNMENT,
        MEMORYTYPEBITS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIZE = layout.offsetof(0);
        ALIGNMENT = layout.offsetof(1);
        MEMORYTYPEBITS = layout.offsetof(2);
    }

    protected VkMemoryRequirements(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryRequirements create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryRequirements(address, container);
    }

    /**
     * Creates a {@code VkMemoryRequirements} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryRequirements(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** @return the value of the {@code alignment} field. */
    @NativeType("VkDeviceSize")
    public long alignment() { return nalignment(address()); }
    /** @return the value of the {@code memoryTypeBits} field. */
    @NativeType("uint32_t")
    public int memoryTypeBits() { return nmemoryTypeBits(address()); }

    /** Sets the specified value to the {@code size} field. */
    public VkMemoryRequirements size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code alignment} field. */
    public VkMemoryRequirements alignment(@NativeType("VkDeviceSize") long value) { nalignment(address(), value); return this; }
    /** Sets the specified value to the {@code memoryTypeBits} field. */
    public VkMemoryRequirements memoryTypeBits(@NativeType("uint32_t") int value) { nmemoryTypeBits(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryRequirements set(
        long size,
        long alignment,
        int memoryTypeBits
    ) {
        size(size);
        alignment(alignment);
        memoryTypeBits(memoryTypeBits);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryRequirements set(VkMemoryRequirements src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryRequirements} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryRequirements malloc() {
        return new VkMemoryRequirements(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryRequirements} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryRequirements calloc() {
        return new VkMemoryRequirements(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryRequirements} instance allocated with {@link BufferUtils}. */
    public static VkMemoryRequirements create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryRequirements(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryRequirements} instance for the specified memory address. */
    public static VkMemoryRequirements create(long address) {
        return new VkMemoryRequirements(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryRequirements createSafe(long address) {
        return address == NULL ? null : new VkMemoryRequirements(address, null);
    }

    /**
     * Returns a new {@link VkMemoryRequirements.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryRequirements.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryRequirements.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryRequirements.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryRequirements.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryRequirements.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryRequirements.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryRequirements.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryRequirements.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryRequirements mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryRequirements callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryRequirements mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryRequirements callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryRequirements.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryRequirements.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryRequirements.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryRequirements.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkMemoryRequirements} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryRequirements malloc(MemoryStack stack) {
        return new VkMemoryRequirements(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryRequirements} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryRequirements calloc(MemoryStack stack) {
        return new VkMemoryRequirements(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryRequirements.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryRequirements.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryRequirements.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryRequirements.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkMemoryRequirements.SIZE); }
    /** Unsafe version of {@link #alignment}. */
    public static long nalignment(long struct) { return memGetLong(struct + VkMemoryRequirements.ALIGNMENT); }
    /** Unsafe version of {@link #memoryTypeBits}. */
    public static int nmemoryTypeBits(long struct) { return memGetInt(struct + VkMemoryRequirements.MEMORYTYPEBITS); }

    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + VkMemoryRequirements.SIZE, value); }
    /** Unsafe version of {@link #alignment(long) alignment}. */
    public static void nalignment(long struct, long value) { memPutLong(struct + VkMemoryRequirements.ALIGNMENT, value); }
    /** Unsafe version of {@link #memoryTypeBits(int) memoryTypeBits}. */
    public static void nmemoryTypeBits(long struct, int value) { memPutInt(struct + VkMemoryRequirements.MEMORYTYPEBITS, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryRequirements} structs. */
    public static class Buffer extends StructBuffer<VkMemoryRequirements, Buffer> implements NativeResource {

        private static final VkMemoryRequirements ELEMENT_FACTORY = VkMemoryRequirements.create(-1L);

        /**
         * Creates a new {@code VkMemoryRequirements.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryRequirements#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryRequirements getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkMemoryRequirements.nsize(address()); }
        /** @return the value of the {@code alignment} field. */
        @NativeType("VkDeviceSize")
        public long alignment() { return VkMemoryRequirements.nalignment(address()); }
        /** @return the value of the {@code memoryTypeBits} field. */
        @NativeType("uint32_t")
        public int memoryTypeBits() { return VkMemoryRequirements.nmemoryTypeBits(address()); }

        /** Sets the specified value to the {@code size} field. */
        public VkMemoryRequirements.Buffer size(@NativeType("VkDeviceSize") long value) { VkMemoryRequirements.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code alignment} field. */
        public VkMemoryRequirements.Buffer alignment(@NativeType("VkDeviceSize") long value) { VkMemoryRequirements.nalignment(address(), value); return this; }
        /** Sets the specified value to the {@code memoryTypeBits} field. */
        public VkMemoryRequirements.Buffer memoryTypeBits(@NativeType("uint32_t") int value) { VkMemoryRequirements.nmemoryTypeBits(address(), value); return this; }

    }

}