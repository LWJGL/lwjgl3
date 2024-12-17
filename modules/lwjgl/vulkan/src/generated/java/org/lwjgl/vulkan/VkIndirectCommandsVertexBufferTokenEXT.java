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
 * struct VkIndirectCommandsVertexBufferTokenEXT {
 *     uint32_t vertexBindingUnit;
 * }}</pre>
 */
public class VkIndirectCommandsVertexBufferTokenEXT extends Struct<VkIndirectCommandsVertexBufferTokenEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERTEXBINDINGUNIT;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERTEXBINDINGUNIT = layout.offsetof(0);
    }

    protected VkIndirectCommandsVertexBufferTokenEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkIndirectCommandsVertexBufferTokenEXT create(long address, @Nullable ByteBuffer container) {
        return new VkIndirectCommandsVertexBufferTokenEXT(address, container);
    }

    /**
     * Creates a {@code VkIndirectCommandsVertexBufferTokenEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectCommandsVertexBufferTokenEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code vertexBindingUnit} field. */
    @NativeType("uint32_t")
    public int vertexBindingUnit() { return nvertexBindingUnit(address()); }

    /** Sets the specified value to the {@code vertexBindingUnit} field. */
    public VkIndirectCommandsVertexBufferTokenEXT vertexBindingUnit(@NativeType("uint32_t") int value) { nvertexBindingUnit(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectCommandsVertexBufferTokenEXT set(VkIndirectCommandsVertexBufferTokenEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectCommandsVertexBufferTokenEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsVertexBufferTokenEXT malloc() {
        return new VkIndirectCommandsVertexBufferTokenEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsVertexBufferTokenEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsVertexBufferTokenEXT calloc() {
        return new VkIndirectCommandsVertexBufferTokenEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsVertexBufferTokenEXT} instance allocated with {@link BufferUtils}. */
    public static VkIndirectCommandsVertexBufferTokenEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsVertexBufferTokenEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectCommandsVertexBufferTokenEXT} instance for the specified memory address. */
    public static VkIndirectCommandsVertexBufferTokenEXT create(long address) {
        return new VkIndirectCommandsVertexBufferTokenEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkIndirectCommandsVertexBufferTokenEXT createSafe(long address) {
        return address == NULL ? null : new VkIndirectCommandsVertexBufferTokenEXT(address, null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsVertexBufferTokenEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsVertexBufferTokenEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsVertexBufferTokenEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsVertexBufferTokenEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsVertexBufferTokenEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsVertexBufferTokenEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkIndirectCommandsVertexBufferTokenEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsVertexBufferTokenEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkIndirectCommandsVertexBufferTokenEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkIndirectCommandsVertexBufferTokenEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsVertexBufferTokenEXT malloc(MemoryStack stack) {
        return new VkIndirectCommandsVertexBufferTokenEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkIndirectCommandsVertexBufferTokenEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsVertexBufferTokenEXT calloc(MemoryStack stack) {
        return new VkIndirectCommandsVertexBufferTokenEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsVertexBufferTokenEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsVertexBufferTokenEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsVertexBufferTokenEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsVertexBufferTokenEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vertexBindingUnit}. */
    public static int nvertexBindingUnit(long struct) { return memGetInt(struct + VkIndirectCommandsVertexBufferTokenEXT.VERTEXBINDINGUNIT); }

    /** Unsafe version of {@link #vertexBindingUnit(int) vertexBindingUnit}. */
    public static void nvertexBindingUnit(long struct, int value) { memPutInt(struct + VkIndirectCommandsVertexBufferTokenEXT.VERTEXBINDINGUNIT, value); }

    // -----------------------------------

    /** An array of {@link VkIndirectCommandsVertexBufferTokenEXT} structs. */
    public static class Buffer extends StructBuffer<VkIndirectCommandsVertexBufferTokenEXT, Buffer> implements NativeResource {

        private static final VkIndirectCommandsVertexBufferTokenEXT ELEMENT_FACTORY = VkIndirectCommandsVertexBufferTokenEXT.create(-1L);

        /**
         * Creates a new {@code VkIndirectCommandsVertexBufferTokenEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectCommandsVertexBufferTokenEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkIndirectCommandsVertexBufferTokenEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code vertexBindingUnit} field. */
        @NativeType("uint32_t")
        public int vertexBindingUnit() { return VkIndirectCommandsVertexBufferTokenEXT.nvertexBindingUnit(address()); }

        /** Sets the specified value to the {@code vertexBindingUnit} field. */
        public VkIndirectCommandsVertexBufferTokenEXT.Buffer vertexBindingUnit(@NativeType("uint32_t") int value) { VkIndirectCommandsVertexBufferTokenEXT.nvertexBindingUnit(address(), value); return this; }

    }

}