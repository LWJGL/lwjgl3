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
 * struct VkDescriptorMappingSourceHeapDataEXT {
 *     uint32_t heapOffset;
 *     uint32_t pushOffset;
 * }}</pre>
 */
public class VkDescriptorMappingSourceHeapDataEXT extends Struct<VkDescriptorMappingSourceHeapDataEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEAPOFFSET,
        PUSHOFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEAPOFFSET = layout.offsetof(0);
        PUSHOFFSET = layout.offsetof(1);
    }

    protected VkDescriptorMappingSourceHeapDataEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorMappingSourceHeapDataEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorMappingSourceHeapDataEXT(address, container);
    }

    /**
     * Creates a {@code VkDescriptorMappingSourceHeapDataEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorMappingSourceHeapDataEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code heapOffset} field. */
    @NativeType("uint32_t")
    public int heapOffset() { return nheapOffset(address()); }
    /** @return the value of the {@code pushOffset} field. */
    @NativeType("uint32_t")
    public int pushOffset() { return npushOffset(address()); }

    /** Sets the specified value to the {@code heapOffset} field. */
    public VkDescriptorMappingSourceHeapDataEXT heapOffset(@NativeType("uint32_t") int value) { nheapOffset(address(), value); return this; }
    /** Sets the specified value to the {@code pushOffset} field. */
    public VkDescriptorMappingSourceHeapDataEXT pushOffset(@NativeType("uint32_t") int value) { npushOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorMappingSourceHeapDataEXT set(
        int heapOffset,
        int pushOffset
    ) {
        heapOffset(heapOffset);
        pushOffset(pushOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorMappingSourceHeapDataEXT set(VkDescriptorMappingSourceHeapDataEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorMappingSourceHeapDataEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorMappingSourceHeapDataEXT malloc() {
        return new VkDescriptorMappingSourceHeapDataEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorMappingSourceHeapDataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorMappingSourceHeapDataEXT calloc() {
        return new VkDescriptorMappingSourceHeapDataEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorMappingSourceHeapDataEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorMappingSourceHeapDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorMappingSourceHeapDataEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorMappingSourceHeapDataEXT} instance for the specified memory address. */
    public static VkDescriptorMappingSourceHeapDataEXT create(long address) {
        return new VkDescriptorMappingSourceHeapDataEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorMappingSourceHeapDataEXT createSafe(long address) {
        return address == NULL ? null : new VkDescriptorMappingSourceHeapDataEXT(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceHeapDataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceHeapDataEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceHeapDataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceHeapDataEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceHeapDataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceHeapDataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorMappingSourceHeapDataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceHeapDataEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorMappingSourceHeapDataEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorMappingSourceHeapDataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorMappingSourceHeapDataEXT malloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceHeapDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorMappingSourceHeapDataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorMappingSourceHeapDataEXT calloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceHeapDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceHeapDataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceHeapDataEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceHeapDataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceHeapDataEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #heapOffset}. */
    public static int nheapOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceHeapDataEXT.HEAPOFFSET); }
    /** Unsafe version of {@link #pushOffset}. */
    public static int npushOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceHeapDataEXT.PUSHOFFSET); }

    /** Unsafe version of {@link #heapOffset(int) heapOffset}. */
    public static void nheapOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceHeapDataEXT.HEAPOFFSET, value); }
    /** Unsafe version of {@link #pushOffset(int) pushOffset}. */
    public static void npushOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceHeapDataEXT.PUSHOFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorMappingSourceHeapDataEXT} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorMappingSourceHeapDataEXT, Buffer> implements NativeResource {

        private static final VkDescriptorMappingSourceHeapDataEXT ELEMENT_FACTORY = VkDescriptorMappingSourceHeapDataEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorMappingSourceHeapDataEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorMappingSourceHeapDataEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorMappingSourceHeapDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code heapOffset} field. */
        @NativeType("uint32_t")
        public int heapOffset() { return VkDescriptorMappingSourceHeapDataEXT.nheapOffset(address()); }
        /** @return the value of the {@code pushOffset} field. */
        @NativeType("uint32_t")
        public int pushOffset() { return VkDescriptorMappingSourceHeapDataEXT.npushOffset(address()); }

        /** Sets the specified value to the {@code heapOffset} field. */
        public VkDescriptorMappingSourceHeapDataEXT.Buffer heapOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceHeapDataEXT.nheapOffset(address(), value); return this; }
        /** Sets the specified value to the {@code pushOffset} field. */
        public VkDescriptorMappingSourceHeapDataEXT.Buffer pushOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceHeapDataEXT.npushOffset(address(), value); return this; }

    }

}