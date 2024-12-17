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
 * struct VkVertexInputAttributeDescription {
 *     uint32_t location;
 *     uint32_t binding;
 *     VkFormat format;
 *     uint32_t offset;
 * }}</pre>
 */
public class VkVertexInputAttributeDescription extends Struct<VkVertexInputAttributeDescription> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LOCATION,
        BINDING,
        FORMAT,
        OFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LOCATION = layout.offsetof(0);
        BINDING = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
        OFFSET = layout.offsetof(3);
    }

    protected VkVertexInputAttributeDescription(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVertexInputAttributeDescription create(long address, @Nullable ByteBuffer container) {
        return new VkVertexInputAttributeDescription(address, container);
    }

    /**
     * Creates a {@code VkVertexInputAttributeDescription} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVertexInputAttributeDescription(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code location} field. */
    @NativeType("uint32_t")
    public int location() { return nlocation(address()); }
    /** @return the value of the {@code binding} field. */
    @NativeType("uint32_t")
    public int binding() { return nbinding(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("uint32_t")
    public int offset() { return noffset(address()); }

    /** Sets the specified value to the {@code location} field. */
    public VkVertexInputAttributeDescription location(@NativeType("uint32_t") int value) { nlocation(address(), value); return this; }
    /** Sets the specified value to the {@code binding} field. */
    public VkVertexInputAttributeDescription binding(@NativeType("uint32_t") int value) { nbinding(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public VkVertexInputAttributeDescription format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public VkVertexInputAttributeDescription offset(@NativeType("uint32_t") int value) { noffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVertexInputAttributeDescription set(
        int location,
        int binding,
        int format,
        int offset
    ) {
        location(location);
        binding(binding);
        format(format);
        offset(offset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVertexInputAttributeDescription set(VkVertexInputAttributeDescription src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVertexInputAttributeDescription} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVertexInputAttributeDescription malloc() {
        return new VkVertexInputAttributeDescription(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVertexInputAttributeDescription} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVertexInputAttributeDescription calloc() {
        return new VkVertexInputAttributeDescription(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVertexInputAttributeDescription} instance allocated with {@link BufferUtils}. */
    public static VkVertexInputAttributeDescription create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVertexInputAttributeDescription(memAddress(container), container);
    }

    /** Returns a new {@code VkVertexInputAttributeDescription} instance for the specified memory address. */
    public static VkVertexInputAttributeDescription create(long address) {
        return new VkVertexInputAttributeDescription(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVertexInputAttributeDescription createSafe(long address) {
        return address == NULL ? null : new VkVertexInputAttributeDescription(address, null);
    }

    /**
     * Returns a new {@link VkVertexInputAttributeDescription.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputAttributeDescription.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputAttributeDescription.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputAttributeDescription.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputAttributeDescription.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputAttributeDescription.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVertexInputAttributeDescription.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVertexInputAttributeDescription.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVertexInputAttributeDescription.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkVertexInputAttributeDescription mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkVertexInputAttributeDescription callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkVertexInputAttributeDescription mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkVertexInputAttributeDescription callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkVertexInputAttributeDescription.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkVertexInputAttributeDescription.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkVertexInputAttributeDescription.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkVertexInputAttributeDescription.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkVertexInputAttributeDescription} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVertexInputAttributeDescription malloc(MemoryStack stack) {
        return new VkVertexInputAttributeDescription(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVertexInputAttributeDescription} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVertexInputAttributeDescription calloc(MemoryStack stack) {
        return new VkVertexInputAttributeDescription(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVertexInputAttributeDescription.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVertexInputAttributeDescription.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputAttributeDescription.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVertexInputAttributeDescription.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #location}. */
    public static int nlocation(long struct) { return memGetInt(struct + VkVertexInputAttributeDescription.LOCATION); }
    /** Unsafe version of {@link #binding}. */
    public static int nbinding(long struct) { return memGetInt(struct + VkVertexInputAttributeDescription.BINDING); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkVertexInputAttributeDescription.FORMAT); }
    /** Unsafe version of {@link #offset}. */
    public static int noffset(long struct) { return memGetInt(struct + VkVertexInputAttributeDescription.OFFSET); }

    /** Unsafe version of {@link #location(int) location}. */
    public static void nlocation(long struct, int value) { memPutInt(struct + VkVertexInputAttributeDescription.LOCATION, value); }
    /** Unsafe version of {@link #binding(int) binding}. */
    public static void nbinding(long struct, int value) { memPutInt(struct + VkVertexInputAttributeDescription.BINDING, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + VkVertexInputAttributeDescription.FORMAT, value); }
    /** Unsafe version of {@link #offset(int) offset}. */
    public static void noffset(long struct, int value) { memPutInt(struct + VkVertexInputAttributeDescription.OFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkVertexInputAttributeDescription} structs. */
    public static class Buffer extends StructBuffer<VkVertexInputAttributeDescription, Buffer> implements NativeResource {

        private static final VkVertexInputAttributeDescription ELEMENT_FACTORY = VkVertexInputAttributeDescription.create(-1L);

        /**
         * Creates a new {@code VkVertexInputAttributeDescription.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVertexInputAttributeDescription#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVertexInputAttributeDescription getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code location} field. */
        @NativeType("uint32_t")
        public int location() { return VkVertexInputAttributeDescription.nlocation(address()); }
        /** @return the value of the {@code binding} field. */
        @NativeType("uint32_t")
        public int binding() { return VkVertexInputAttributeDescription.nbinding(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkVertexInputAttributeDescription.nformat(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("uint32_t")
        public int offset() { return VkVertexInputAttributeDescription.noffset(address()); }

        /** Sets the specified value to the {@code location} field. */
        public VkVertexInputAttributeDescription.Buffer location(@NativeType("uint32_t") int value) { VkVertexInputAttributeDescription.nlocation(address(), value); return this; }
        /** Sets the specified value to the {@code binding} field. */
        public VkVertexInputAttributeDescription.Buffer binding(@NativeType("uint32_t") int value) { VkVertexInputAttributeDescription.nbinding(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public VkVertexInputAttributeDescription.Buffer format(@NativeType("VkFormat") int value) { VkVertexInputAttributeDescription.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public VkVertexInputAttributeDescription.Buffer offset(@NativeType("uint32_t") int value) { VkVertexInputAttributeDescription.noffset(address(), value); return this; }

    }

}