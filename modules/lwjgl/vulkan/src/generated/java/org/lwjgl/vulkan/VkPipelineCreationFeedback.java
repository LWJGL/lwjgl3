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
 * struct VkPipelineCreationFeedback {
 *     VkPipelineCreationFeedbackFlags flags;
 *     uint64_t duration;
 * }}</pre>
 */
public class VkPipelineCreationFeedback extends Struct<VkPipelineCreationFeedback> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        DURATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        DURATION = layout.offsetof(1);
    }

    protected VkPipelineCreationFeedback(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineCreationFeedback create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineCreationFeedback(address, container);
    }

    /**
     * Creates a {@code VkPipelineCreationFeedback} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineCreationFeedback(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code flags} field. */
    @NativeType("VkPipelineCreationFeedbackFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code duration} field. */
    @NativeType("uint64_t")
    public long duration() { return nduration(address()); }

    // -----------------------------------

    /** Returns a new {@code VkPipelineCreationFeedback} instance for the specified memory address. */
    public static VkPipelineCreationFeedback create(long address) {
        return new VkPipelineCreationFeedback(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineCreationFeedback createSafe(long address) {
        return address == NULL ? null : new VkPipelineCreationFeedback(address, null);
    }

    /**
     * Create a {@link VkPipelineCreationFeedback.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedback.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineCreationFeedback.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkPipelineCreationFeedback.FLAGS); }
    /** Unsafe version of {@link #duration}. */
    public static long nduration(long struct) { return memGetLong(struct + VkPipelineCreationFeedback.DURATION); }

    // -----------------------------------

    /** An array of {@link VkPipelineCreationFeedback} structs. */
    public static class Buffer extends StructBuffer<VkPipelineCreationFeedback, Buffer> {

        private static final VkPipelineCreationFeedback ELEMENT_FACTORY = VkPipelineCreationFeedback.create(-1L);

        /**
         * Creates a new {@code VkPipelineCreationFeedback.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineCreationFeedback#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineCreationFeedback getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code flags} field. */
        @NativeType("VkPipelineCreationFeedbackFlags")
        public int flags() { return VkPipelineCreationFeedback.nflags(address()); }
        /** @return the value of the {@code duration} field. */
        @NativeType("uint64_t")
        public long duration() { return VkPipelineCreationFeedback.nduration(address()); }

    }

}