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
 * Structure specifying input data for a single state flag command token.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSetStateFlagsIndirectCommandNV {
 *     uint32_t {@link #data};
 * }</code></pre>
 */
public class VkSetStateFlagsIndirectCommandNV extends Struct<VkSetStateFlagsIndirectCommandNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATA;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATA = layout.offsetof(0);
    }

    protected VkSetStateFlagsIndirectCommandNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSetStateFlagsIndirectCommandNV create(long address, @Nullable ByteBuffer container) {
        return new VkSetStateFlagsIndirectCommandNV(address, container);
    }

    /**
     * Creates a {@code VkSetStateFlagsIndirectCommandNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSetStateFlagsIndirectCommandNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * encodes packed state that this command alters.
     * 
     * <ul>
     * <li>Bit 0: If set represents {@link VK10#VK_FRONT_FACE_CLOCKWISE FRONT_FACE_CLOCKWISE}, otherwise {@link VK10#VK_FRONT_FACE_COUNTER_CLOCKWISE FRONT_FACE_COUNTER_CLOCKWISE}</li>
     * </ul>
     */
    @NativeType("uint32_t")
    public int data() { return ndata(address()); }

    /** Sets the specified value to the {@link #data} field. */
    public VkSetStateFlagsIndirectCommandNV data(@NativeType("uint32_t") int value) { ndata(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSetStateFlagsIndirectCommandNV set(VkSetStateFlagsIndirectCommandNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSetStateFlagsIndirectCommandNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSetStateFlagsIndirectCommandNV malloc() {
        return new VkSetStateFlagsIndirectCommandNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSetStateFlagsIndirectCommandNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSetStateFlagsIndirectCommandNV calloc() {
        return new VkSetStateFlagsIndirectCommandNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSetStateFlagsIndirectCommandNV} instance allocated with {@link BufferUtils}. */
    public static VkSetStateFlagsIndirectCommandNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSetStateFlagsIndirectCommandNV(memAddress(container), container);
    }

    /** Returns a new {@code VkSetStateFlagsIndirectCommandNV} instance for the specified memory address. */
    public static VkSetStateFlagsIndirectCommandNV create(long address) {
        return new VkSetStateFlagsIndirectCommandNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSetStateFlagsIndirectCommandNV createSafe(long address) {
        return address == NULL ? null : new VkSetStateFlagsIndirectCommandNV(address, null);
    }

    /**
     * Returns a new {@link VkSetStateFlagsIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSetStateFlagsIndirectCommandNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSetStateFlagsIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSetStateFlagsIndirectCommandNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSetStateFlagsIndirectCommandNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSetStateFlagsIndirectCommandNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSetStateFlagsIndirectCommandNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSetStateFlagsIndirectCommandNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSetStateFlagsIndirectCommandNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSetStateFlagsIndirectCommandNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSetStateFlagsIndirectCommandNV malloc(MemoryStack stack) {
        return new VkSetStateFlagsIndirectCommandNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSetStateFlagsIndirectCommandNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSetStateFlagsIndirectCommandNV calloc(MemoryStack stack) {
        return new VkSetStateFlagsIndirectCommandNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSetStateFlagsIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSetStateFlagsIndirectCommandNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSetStateFlagsIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSetStateFlagsIndirectCommandNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #data}. */
    public static int ndata(long struct) { return memGetInt(struct + VkSetStateFlagsIndirectCommandNV.DATA); }

    /** Unsafe version of {@link #data(int) data}. */
    public static void ndata(long struct, int value) { memPutInt(struct + VkSetStateFlagsIndirectCommandNV.DATA, value); }

    // -----------------------------------

    /** An array of {@link VkSetStateFlagsIndirectCommandNV} structs. */
    public static class Buffer extends StructBuffer<VkSetStateFlagsIndirectCommandNV, Buffer> implements NativeResource {

        private static final VkSetStateFlagsIndirectCommandNV ELEMENT_FACTORY = VkSetStateFlagsIndirectCommandNV.create(-1L);

        /**
         * Creates a new {@code VkSetStateFlagsIndirectCommandNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSetStateFlagsIndirectCommandNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSetStateFlagsIndirectCommandNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSetStateFlagsIndirectCommandNV#data} field. */
        @NativeType("uint32_t")
        public int data() { return VkSetStateFlagsIndirectCommandNV.ndata(address()); }

        /** Sets the specified value to the {@link VkSetStateFlagsIndirectCommandNV#data} field. */
        public VkSetStateFlagsIndirectCommandNV.Buffer data(@NativeType("uint32_t") int value) { VkSetStateFlagsIndirectCommandNV.ndata(address(), value); return this; }

    }

}