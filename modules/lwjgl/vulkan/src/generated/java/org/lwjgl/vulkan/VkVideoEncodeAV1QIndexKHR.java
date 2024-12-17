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
 * struct VkVideoEncodeAV1QIndexKHR {
 *     uint32_t intraQIndex;
 *     uint32_t predictiveQIndex;
 *     uint32_t bipredictiveQIndex;
 * }}</pre>
 */
public class VkVideoEncodeAV1QIndexKHR extends Struct<VkVideoEncodeAV1QIndexKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INTRAQINDEX,
        PREDICTIVEQINDEX,
        BIPREDICTIVEQINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INTRAQINDEX = layout.offsetof(0);
        PREDICTIVEQINDEX = layout.offsetof(1);
        BIPREDICTIVEQINDEX = layout.offsetof(2);
    }

    protected VkVideoEncodeAV1QIndexKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeAV1QIndexKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeAV1QIndexKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeAV1QIndexKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeAV1QIndexKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code intraQIndex} field. */
    @NativeType("uint32_t")
    public int intraQIndex() { return nintraQIndex(address()); }
    /** @return the value of the {@code predictiveQIndex} field. */
    @NativeType("uint32_t")
    public int predictiveQIndex() { return npredictiveQIndex(address()); }
    /** @return the value of the {@code bipredictiveQIndex} field. */
    @NativeType("uint32_t")
    public int bipredictiveQIndex() { return nbipredictiveQIndex(address()); }

    /** Sets the specified value to the {@code intraQIndex} field. */
    public VkVideoEncodeAV1QIndexKHR intraQIndex(@NativeType("uint32_t") int value) { nintraQIndex(address(), value); return this; }
    /** Sets the specified value to the {@code predictiveQIndex} field. */
    public VkVideoEncodeAV1QIndexKHR predictiveQIndex(@NativeType("uint32_t") int value) { npredictiveQIndex(address(), value); return this; }
    /** Sets the specified value to the {@code bipredictiveQIndex} field. */
    public VkVideoEncodeAV1QIndexKHR bipredictiveQIndex(@NativeType("uint32_t") int value) { nbipredictiveQIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeAV1QIndexKHR set(
        int intraQIndex,
        int predictiveQIndex,
        int bipredictiveQIndex
    ) {
        intraQIndex(intraQIndex);
        predictiveQIndex(predictiveQIndex);
        bipredictiveQIndex(bipredictiveQIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeAV1QIndexKHR set(VkVideoEncodeAV1QIndexKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeAV1QIndexKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1QIndexKHR malloc() {
        return new VkVideoEncodeAV1QIndexKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1QIndexKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1QIndexKHR calloc() {
        return new VkVideoEncodeAV1QIndexKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1QIndexKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeAV1QIndexKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1QIndexKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeAV1QIndexKHR} instance for the specified memory address. */
    public static VkVideoEncodeAV1QIndexKHR create(long address) {
        return new VkVideoEncodeAV1QIndexKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeAV1QIndexKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeAV1QIndexKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1QIndexKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1QIndexKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1QIndexKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1QIndexKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1QIndexKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1QIndexKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeAV1QIndexKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1QIndexKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeAV1QIndexKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1QIndexKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1QIndexKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1QIndexKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1QIndexKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1QIndexKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1QIndexKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1QIndexKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1QIndexKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1QIndexKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1QIndexKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #intraQIndex}. */
    public static int nintraQIndex(long struct) { return memGetInt(struct + VkVideoEncodeAV1QIndexKHR.INTRAQINDEX); }
    /** Unsafe version of {@link #predictiveQIndex}. */
    public static int npredictiveQIndex(long struct) { return memGetInt(struct + VkVideoEncodeAV1QIndexKHR.PREDICTIVEQINDEX); }
    /** Unsafe version of {@link #bipredictiveQIndex}. */
    public static int nbipredictiveQIndex(long struct) { return memGetInt(struct + VkVideoEncodeAV1QIndexKHR.BIPREDICTIVEQINDEX); }

    /** Unsafe version of {@link #intraQIndex(int) intraQIndex}. */
    public static void nintraQIndex(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1QIndexKHR.INTRAQINDEX, value); }
    /** Unsafe version of {@link #predictiveQIndex(int) predictiveQIndex}. */
    public static void npredictiveQIndex(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1QIndexKHR.PREDICTIVEQINDEX, value); }
    /** Unsafe version of {@link #bipredictiveQIndex(int) bipredictiveQIndex}. */
    public static void nbipredictiveQIndex(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1QIndexKHR.BIPREDICTIVEQINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeAV1QIndexKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1QIndexKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeAV1QIndexKHR ELEMENT_FACTORY = VkVideoEncodeAV1QIndexKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeAV1QIndexKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeAV1QIndexKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeAV1QIndexKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code intraQIndex} field. */
        @NativeType("uint32_t")
        public int intraQIndex() { return VkVideoEncodeAV1QIndexKHR.nintraQIndex(address()); }
        /** @return the value of the {@code predictiveQIndex} field. */
        @NativeType("uint32_t")
        public int predictiveQIndex() { return VkVideoEncodeAV1QIndexKHR.npredictiveQIndex(address()); }
        /** @return the value of the {@code bipredictiveQIndex} field. */
        @NativeType("uint32_t")
        public int bipredictiveQIndex() { return VkVideoEncodeAV1QIndexKHR.nbipredictiveQIndex(address()); }

        /** Sets the specified value to the {@code intraQIndex} field. */
        public VkVideoEncodeAV1QIndexKHR.Buffer intraQIndex(@NativeType("uint32_t") int value) { VkVideoEncodeAV1QIndexKHR.nintraQIndex(address(), value); return this; }
        /** Sets the specified value to the {@code predictiveQIndex} field. */
        public VkVideoEncodeAV1QIndexKHR.Buffer predictiveQIndex(@NativeType("uint32_t") int value) { VkVideoEncodeAV1QIndexKHR.npredictiveQIndex(address(), value); return this; }
        /** Sets the specified value to the {@code bipredictiveQIndex} field. */
        public VkVideoEncodeAV1QIndexKHR.Buffer bipredictiveQIndex(@NativeType("uint32_t") int value) { VkVideoEncodeAV1QIndexKHR.nbipredictiveQIndex(address(), value); return this; }

    }

}