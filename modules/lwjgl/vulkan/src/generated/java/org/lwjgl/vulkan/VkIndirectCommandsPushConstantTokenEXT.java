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
 * struct VkIndirectCommandsPushConstantTokenEXT {
 *     {@link VkPushConstantRange VkPushConstantRange} updateRange;
 * }}</pre>
 */
public class VkIndirectCommandsPushConstantTokenEXT extends Struct<VkIndirectCommandsPushConstantTokenEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        UPDATERANGE;

    static {
        Layout layout = __struct(
            __member(VkPushConstantRange.SIZEOF, VkPushConstantRange.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        UPDATERANGE = layout.offsetof(0);
    }

    protected VkIndirectCommandsPushConstantTokenEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkIndirectCommandsPushConstantTokenEXT create(long address, @Nullable ByteBuffer container) {
        return new VkIndirectCommandsPushConstantTokenEXT(address, container);
    }

    /**
     * Creates a {@code VkIndirectCommandsPushConstantTokenEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectCommandsPushConstantTokenEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link VkPushConstantRange} view of the {@code updateRange} field. */
    public VkPushConstantRange updateRange() { return nupdateRange(address()); }

    /** Copies the specified {@link VkPushConstantRange} to the {@code updateRange} field. */
    public VkIndirectCommandsPushConstantTokenEXT updateRange(VkPushConstantRange value) { nupdateRange(address(), value); return this; }
    /** Passes the {@code updateRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkIndirectCommandsPushConstantTokenEXT updateRange(java.util.function.Consumer<VkPushConstantRange> consumer) { consumer.accept(updateRange()); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectCommandsPushConstantTokenEXT set(VkIndirectCommandsPushConstantTokenEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectCommandsPushConstantTokenEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsPushConstantTokenEXT malloc() {
        return new VkIndirectCommandsPushConstantTokenEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsPushConstantTokenEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsPushConstantTokenEXT calloc() {
        return new VkIndirectCommandsPushConstantTokenEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsPushConstantTokenEXT} instance allocated with {@link BufferUtils}. */
    public static VkIndirectCommandsPushConstantTokenEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsPushConstantTokenEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectCommandsPushConstantTokenEXT} instance for the specified memory address. */
    public static VkIndirectCommandsPushConstantTokenEXT create(long address) {
        return new VkIndirectCommandsPushConstantTokenEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkIndirectCommandsPushConstantTokenEXT createSafe(long address) {
        return address == NULL ? null : new VkIndirectCommandsPushConstantTokenEXT(address, null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsPushConstantTokenEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsPushConstantTokenEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsPushConstantTokenEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsPushConstantTokenEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsPushConstantTokenEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsPushConstantTokenEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkIndirectCommandsPushConstantTokenEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsPushConstantTokenEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkIndirectCommandsPushConstantTokenEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkIndirectCommandsPushConstantTokenEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsPushConstantTokenEXT malloc(MemoryStack stack) {
        return new VkIndirectCommandsPushConstantTokenEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkIndirectCommandsPushConstantTokenEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsPushConstantTokenEXT calloc(MemoryStack stack) {
        return new VkIndirectCommandsPushConstantTokenEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsPushConstantTokenEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsPushConstantTokenEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsPushConstantTokenEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsPushConstantTokenEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #updateRange}. */
    public static VkPushConstantRange nupdateRange(long struct) { return VkPushConstantRange.create(struct + VkIndirectCommandsPushConstantTokenEXT.UPDATERANGE); }

    /** Unsafe version of {@link #updateRange(VkPushConstantRange) updateRange}. */
    public static void nupdateRange(long struct, VkPushConstantRange value) { memCopy(value.address(), struct + VkIndirectCommandsPushConstantTokenEXT.UPDATERANGE, VkPushConstantRange.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkIndirectCommandsPushConstantTokenEXT} structs. */
    public static class Buffer extends StructBuffer<VkIndirectCommandsPushConstantTokenEXT, Buffer> implements NativeResource {

        private static final VkIndirectCommandsPushConstantTokenEXT ELEMENT_FACTORY = VkIndirectCommandsPushConstantTokenEXT.create(-1L);

        /**
         * Creates a new {@code VkIndirectCommandsPushConstantTokenEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectCommandsPushConstantTokenEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkIndirectCommandsPushConstantTokenEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VkPushConstantRange} view of the {@code updateRange} field. */
        public VkPushConstantRange updateRange() { return VkIndirectCommandsPushConstantTokenEXT.nupdateRange(address()); }

        /** Copies the specified {@link VkPushConstantRange} to the {@code updateRange} field. */
        public VkIndirectCommandsPushConstantTokenEXT.Buffer updateRange(VkPushConstantRange value) { VkIndirectCommandsPushConstantTokenEXT.nupdateRange(address(), value); return this; }
        /** Passes the {@code updateRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkIndirectCommandsPushConstantTokenEXT.Buffer updateRange(java.util.function.Consumer<VkPushConstantRange> consumer) { consumer.accept(updateRange()); return this; }

    }

}