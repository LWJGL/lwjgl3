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
 * struct VkPresentStageTimeEXT {
 *     VkPresentStageFlagsEXT stage;
 *     uint64_t time;
 * }}</pre>
 */
public class VkPresentStageTimeEXT extends Struct<VkPresentStageTimeEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STAGE,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STAGE = layout.offsetof(0);
        TIME = layout.offsetof(1);
    }

    protected VkPresentStageTimeEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPresentStageTimeEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPresentStageTimeEXT(address, container);
    }

    /**
     * Creates a {@code VkPresentStageTimeEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPresentStageTimeEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code stage} field. */
    @NativeType("VkPresentStageFlagsEXT")
    public int stage() { return nstage(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("uint64_t")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@code stage} field. */
    public VkPresentStageTimeEXT stage(@NativeType("VkPresentStageFlagsEXT") int value) { nstage(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public VkPresentStageTimeEXT time(@NativeType("uint64_t") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPresentStageTimeEXT set(
        int stage,
        long time
    ) {
        stage(stage);
        time(time);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPresentStageTimeEXT set(VkPresentStageTimeEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPresentStageTimeEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPresentStageTimeEXT malloc() {
        return new VkPresentStageTimeEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPresentStageTimeEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPresentStageTimeEXT calloc() {
        return new VkPresentStageTimeEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPresentStageTimeEXT} instance allocated with {@link BufferUtils}. */
    public static VkPresentStageTimeEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentStageTimeEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPresentStageTimeEXT} instance for the specified memory address. */
    public static VkPresentStageTimeEXT create(long address) {
        return new VkPresentStageTimeEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPresentStageTimeEXT createSafe(long address) {
        return address == NULL ? null : new VkPresentStageTimeEXT(address, null);
    }

    /**
     * Returns a new {@link VkPresentStageTimeEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentStageTimeEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPresentStageTimeEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentStageTimeEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentStageTimeEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentStageTimeEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPresentStageTimeEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPresentStageTimeEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPresentStageTimeEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPresentStageTimeEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentStageTimeEXT malloc(MemoryStack stack) {
        return new VkPresentStageTimeEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPresentStageTimeEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentStageTimeEXT calloc(MemoryStack stack) {
        return new VkPresentStageTimeEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPresentStageTimeEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentStageTimeEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentStageTimeEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentStageTimeEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #stage}. */
    public static int nstage(long struct) { return memGetInt(struct + VkPresentStageTimeEXT.STAGE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + VkPresentStageTimeEXT.TIME); }

    /** Unsafe version of {@link #stage(int) stage}. */
    public static void nstage(long struct, int value) { memPutInt(struct + VkPresentStageTimeEXT.STAGE, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + VkPresentStageTimeEXT.TIME, value); }

    // -----------------------------------

    /** An array of {@link VkPresentStageTimeEXT} structs. */
    public static class Buffer extends StructBuffer<VkPresentStageTimeEXT, Buffer> implements NativeResource {

        private static final VkPresentStageTimeEXT ELEMENT_FACTORY = VkPresentStageTimeEXT.create(-1L);

        /**
         * Creates a new {@code VkPresentStageTimeEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPresentStageTimeEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPresentStageTimeEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code stage} field. */
        @NativeType("VkPresentStageFlagsEXT")
        public int stage() { return VkPresentStageTimeEXT.nstage(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("uint64_t")
        public long time() { return VkPresentStageTimeEXT.ntime(address()); }

        /** Sets the specified value to the {@code stage} field. */
        public VkPresentStageTimeEXT.Buffer stage(@NativeType("VkPresentStageFlagsEXT") int value) { VkPresentStageTimeEXT.nstage(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public VkPresentStageTimeEXT.Buffer time(@NativeType("uint64_t") long value) { VkPresentStageTimeEXT.ntime(address(), value); return this; }

    }

}