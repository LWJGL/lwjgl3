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
 * struct VkIndirectCommandsIndexBufferTokenEXT {
 *     VkIndirectCommandsInputModeFlagBitsEXT mode;
 * }}</pre>
 */
public class VkIndirectCommandsIndexBufferTokenEXT extends Struct<VkIndirectCommandsIndexBufferTokenEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MODE;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MODE = layout.offsetof(0);
    }

    protected VkIndirectCommandsIndexBufferTokenEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkIndirectCommandsIndexBufferTokenEXT create(long address, @Nullable ByteBuffer container) {
        return new VkIndirectCommandsIndexBufferTokenEXT(address, container);
    }

    /**
     * Creates a {@code VkIndirectCommandsIndexBufferTokenEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectCommandsIndexBufferTokenEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code mode} field. */
    @NativeType("VkIndirectCommandsInputModeFlagBitsEXT")
    public int mode() { return nmode(address()); }

    /** Sets the specified value to the {@code mode} field. */
    public VkIndirectCommandsIndexBufferTokenEXT mode(@NativeType("VkIndirectCommandsInputModeFlagBitsEXT") int value) { nmode(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectCommandsIndexBufferTokenEXT set(VkIndirectCommandsIndexBufferTokenEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectCommandsIndexBufferTokenEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsIndexBufferTokenEXT malloc() {
        return new VkIndirectCommandsIndexBufferTokenEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsIndexBufferTokenEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsIndexBufferTokenEXT calloc() {
        return new VkIndirectCommandsIndexBufferTokenEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsIndexBufferTokenEXT} instance allocated with {@link BufferUtils}. */
    public static VkIndirectCommandsIndexBufferTokenEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsIndexBufferTokenEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectCommandsIndexBufferTokenEXT} instance for the specified memory address. */
    public static VkIndirectCommandsIndexBufferTokenEXT create(long address) {
        return new VkIndirectCommandsIndexBufferTokenEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkIndirectCommandsIndexBufferTokenEXT createSafe(long address) {
        return address == NULL ? null : new VkIndirectCommandsIndexBufferTokenEXT(address, null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsIndexBufferTokenEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsIndexBufferTokenEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsIndexBufferTokenEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsIndexBufferTokenEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsIndexBufferTokenEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsIndexBufferTokenEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkIndirectCommandsIndexBufferTokenEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsIndexBufferTokenEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkIndirectCommandsIndexBufferTokenEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkIndirectCommandsIndexBufferTokenEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsIndexBufferTokenEXT malloc(MemoryStack stack) {
        return new VkIndirectCommandsIndexBufferTokenEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkIndirectCommandsIndexBufferTokenEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsIndexBufferTokenEXT calloc(MemoryStack stack) {
        return new VkIndirectCommandsIndexBufferTokenEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsIndexBufferTokenEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsIndexBufferTokenEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsIndexBufferTokenEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsIndexBufferTokenEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return memGetInt(struct + VkIndirectCommandsIndexBufferTokenEXT.MODE); }

    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { memPutInt(struct + VkIndirectCommandsIndexBufferTokenEXT.MODE, value); }

    // -----------------------------------

    /** An array of {@link VkIndirectCommandsIndexBufferTokenEXT} structs. */
    public static class Buffer extends StructBuffer<VkIndirectCommandsIndexBufferTokenEXT, Buffer> implements NativeResource {

        private static final VkIndirectCommandsIndexBufferTokenEXT ELEMENT_FACTORY = VkIndirectCommandsIndexBufferTokenEXT.create(-1L);

        /**
         * Creates a new {@code VkIndirectCommandsIndexBufferTokenEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectCommandsIndexBufferTokenEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkIndirectCommandsIndexBufferTokenEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code mode} field. */
        @NativeType("VkIndirectCommandsInputModeFlagBitsEXT")
        public int mode() { return VkIndirectCommandsIndexBufferTokenEXT.nmode(address()); }

        /** Sets the specified value to the {@code mode} field. */
        public VkIndirectCommandsIndexBufferTokenEXT.Buffer mode(@NativeType("VkIndirectCommandsInputModeFlagBitsEXT") int value) { VkIndirectCommandsIndexBufferTokenEXT.nmode(address(), value); return this; }

    }

}