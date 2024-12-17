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
 * struct VkVertexInputBindingDescription {
 *     uint32_t binding;
 *     uint32_t stride;
 *     VkVertexInputRate inputRate;
 * }}</pre>
 */
public class VkVertexInputBindingDescription extends Struct<VkVertexInputBindingDescription> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BINDING,
        STRIDE,
        INPUTRATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BINDING = layout.offsetof(0);
        STRIDE = layout.offsetof(1);
        INPUTRATE = layout.offsetof(2);
    }

    protected VkVertexInputBindingDescription(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVertexInputBindingDescription create(long address, @Nullable ByteBuffer container) {
        return new VkVertexInputBindingDescription(address, container);
    }

    /**
     * Creates a {@code VkVertexInputBindingDescription} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVertexInputBindingDescription(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code binding} field. */
    @NativeType("uint32_t")
    public int binding() { return nbinding(address()); }
    /** @return the value of the {@code stride} field. */
    @NativeType("uint32_t")
    public int stride() { return nstride(address()); }
    /** @return the value of the {@code inputRate} field. */
    @NativeType("VkVertexInputRate")
    public int inputRate() { return ninputRate(address()); }

    /** Sets the specified value to the {@code binding} field. */
    public VkVertexInputBindingDescription binding(@NativeType("uint32_t") int value) { nbinding(address(), value); return this; }
    /** Sets the specified value to the {@code stride} field. */
    public VkVertexInputBindingDescription stride(@NativeType("uint32_t") int value) { nstride(address(), value); return this; }
    /** Sets the specified value to the {@code inputRate} field. */
    public VkVertexInputBindingDescription inputRate(@NativeType("VkVertexInputRate") int value) { ninputRate(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVertexInputBindingDescription set(
        int binding,
        int stride,
        int inputRate
    ) {
        binding(binding);
        stride(stride);
        inputRate(inputRate);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVertexInputBindingDescription set(VkVertexInputBindingDescription src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVertexInputBindingDescription} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVertexInputBindingDescription malloc() {
        return new VkVertexInputBindingDescription(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVertexInputBindingDescription} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVertexInputBindingDescription calloc() {
        return new VkVertexInputBindingDescription(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVertexInputBindingDescription} instance allocated with {@link BufferUtils}. */
    public static VkVertexInputBindingDescription create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVertexInputBindingDescription(memAddress(container), container);
    }

    /** Returns a new {@code VkVertexInputBindingDescription} instance for the specified memory address. */
    public static VkVertexInputBindingDescription create(long address) {
        return new VkVertexInputBindingDescription(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVertexInputBindingDescription createSafe(long address) {
        return address == NULL ? null : new VkVertexInputBindingDescription(address, null);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDescription.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDescription.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDescription.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVertexInputBindingDescription.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVertexInputBindingDescription.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDescription mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDescription callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDescription mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDescription callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDescription.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDescription.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDescription.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDescription.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkVertexInputBindingDescription} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVertexInputBindingDescription malloc(MemoryStack stack) {
        return new VkVertexInputBindingDescription(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVertexInputBindingDescription} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVertexInputBindingDescription calloc(MemoryStack stack) {
        return new VkVertexInputBindingDescription(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDescription.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDescription.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #binding}. */
    public static int nbinding(long struct) { return memGetInt(struct + VkVertexInputBindingDescription.BINDING); }
    /** Unsafe version of {@link #stride}. */
    public static int nstride(long struct) { return memGetInt(struct + VkVertexInputBindingDescription.STRIDE); }
    /** Unsafe version of {@link #inputRate}. */
    public static int ninputRate(long struct) { return memGetInt(struct + VkVertexInputBindingDescription.INPUTRATE); }

    /** Unsafe version of {@link #binding(int) binding}. */
    public static void nbinding(long struct, int value) { memPutInt(struct + VkVertexInputBindingDescription.BINDING, value); }
    /** Unsafe version of {@link #stride(int) stride}. */
    public static void nstride(long struct, int value) { memPutInt(struct + VkVertexInputBindingDescription.STRIDE, value); }
    /** Unsafe version of {@link #inputRate(int) inputRate}. */
    public static void ninputRate(long struct, int value) { memPutInt(struct + VkVertexInputBindingDescription.INPUTRATE, value); }

    // -----------------------------------

    /** An array of {@link VkVertexInputBindingDescription} structs. */
    public static class Buffer extends StructBuffer<VkVertexInputBindingDescription, Buffer> implements NativeResource {

        private static final VkVertexInputBindingDescription ELEMENT_FACTORY = VkVertexInputBindingDescription.create(-1L);

        /**
         * Creates a new {@code VkVertexInputBindingDescription.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVertexInputBindingDescription#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVertexInputBindingDescription getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code binding} field. */
        @NativeType("uint32_t")
        public int binding() { return VkVertexInputBindingDescription.nbinding(address()); }
        /** @return the value of the {@code stride} field. */
        @NativeType("uint32_t")
        public int stride() { return VkVertexInputBindingDescription.nstride(address()); }
        /** @return the value of the {@code inputRate} field. */
        @NativeType("VkVertexInputRate")
        public int inputRate() { return VkVertexInputBindingDescription.ninputRate(address()); }

        /** Sets the specified value to the {@code binding} field. */
        public VkVertexInputBindingDescription.Buffer binding(@NativeType("uint32_t") int value) { VkVertexInputBindingDescription.nbinding(address(), value); return this; }
        /** Sets the specified value to the {@code stride} field. */
        public VkVertexInputBindingDescription.Buffer stride(@NativeType("uint32_t") int value) { VkVertexInputBindingDescription.nstride(address(), value); return this; }
        /** Sets the specified value to the {@code inputRate} field. */
        public VkVertexInputBindingDescription.Buffer inputRate(@NativeType("VkVertexInputRate") int value) { VkVertexInputBindingDescription.ninputRate(address(), value); return this; }

    }

}