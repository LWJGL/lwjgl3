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
 * struct VkPastPresentationTimingGOOGLE {
 *     uint32_t presentID;
 *     uint64_t desiredPresentTime;
 *     uint64_t actualPresentTime;
 *     uint64_t earliestPresentTime;
 *     uint64_t presentMargin;
 * }}</pre>
 */
public class VkPastPresentationTimingGOOGLE extends Struct<VkPastPresentationTimingGOOGLE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PRESENTID,
        DESIREDPRESENTTIME,
        ACTUALPRESENTTIME,
        EARLIESTPRESENTTIME,
        PRESENTMARGIN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PRESENTID = layout.offsetof(0);
        DESIREDPRESENTTIME = layout.offsetof(1);
        ACTUALPRESENTTIME = layout.offsetof(2);
        EARLIESTPRESENTTIME = layout.offsetof(3);
        PRESENTMARGIN = layout.offsetof(4);
    }

    protected VkPastPresentationTimingGOOGLE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPastPresentationTimingGOOGLE create(long address, @Nullable ByteBuffer container) {
        return new VkPastPresentationTimingGOOGLE(address, container);
    }

    /**
     * Creates a {@code VkPastPresentationTimingGOOGLE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPastPresentationTimingGOOGLE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code presentID} field. */
    @NativeType("uint32_t")
    public int presentID() { return npresentID(address()); }
    /** @return the value of the {@code desiredPresentTime} field. */
    @NativeType("uint64_t")
    public long desiredPresentTime() { return ndesiredPresentTime(address()); }
    /** @return the value of the {@code actualPresentTime} field. */
    @NativeType("uint64_t")
    public long actualPresentTime() { return nactualPresentTime(address()); }
    /** @return the value of the {@code earliestPresentTime} field. */
    @NativeType("uint64_t")
    public long earliestPresentTime() { return nearliestPresentTime(address()); }
    /** @return the value of the {@code presentMargin} field. */
    @NativeType("uint64_t")
    public long presentMargin() { return npresentMargin(address()); }

    // -----------------------------------

    /** Returns a new {@code VkPastPresentationTimingGOOGLE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPastPresentationTimingGOOGLE malloc() {
        return new VkPastPresentationTimingGOOGLE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPastPresentationTimingGOOGLE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPastPresentationTimingGOOGLE calloc() {
        return new VkPastPresentationTimingGOOGLE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPastPresentationTimingGOOGLE} instance allocated with {@link BufferUtils}. */
    public static VkPastPresentationTimingGOOGLE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPastPresentationTimingGOOGLE(memAddress(container), container);
    }

    /** Returns a new {@code VkPastPresentationTimingGOOGLE} instance for the specified memory address. */
    public static VkPastPresentationTimingGOOGLE create(long address) {
        return new VkPastPresentationTimingGOOGLE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPastPresentationTimingGOOGLE createSafe(long address) {
        return address == NULL ? null : new VkPastPresentationTimingGOOGLE(address, null);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingGOOGLE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingGOOGLE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingGOOGLE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPastPresentationTimingGOOGLE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingGOOGLE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPastPresentationTimingGOOGLE.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPastPresentationTimingGOOGLE mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPastPresentationTimingGOOGLE callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPastPresentationTimingGOOGLE mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPastPresentationTimingGOOGLE callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPastPresentationTimingGOOGLE.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPastPresentationTimingGOOGLE.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPastPresentationTimingGOOGLE.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPastPresentationTimingGOOGLE.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPastPresentationTimingGOOGLE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPastPresentationTimingGOOGLE malloc(MemoryStack stack) {
        return new VkPastPresentationTimingGOOGLE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPastPresentationTimingGOOGLE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPastPresentationTimingGOOGLE calloc(MemoryStack stack) {
        return new VkPastPresentationTimingGOOGLE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingGOOGLE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingGOOGLE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #presentID}. */
    public static int npresentID(long struct) { return memGetInt(struct + VkPastPresentationTimingGOOGLE.PRESENTID); }
    /** Unsafe version of {@link #desiredPresentTime}. */
    public static long ndesiredPresentTime(long struct) { return memGetLong(struct + VkPastPresentationTimingGOOGLE.DESIREDPRESENTTIME); }
    /** Unsafe version of {@link #actualPresentTime}. */
    public static long nactualPresentTime(long struct) { return memGetLong(struct + VkPastPresentationTimingGOOGLE.ACTUALPRESENTTIME); }
    /** Unsafe version of {@link #earliestPresentTime}. */
    public static long nearliestPresentTime(long struct) { return memGetLong(struct + VkPastPresentationTimingGOOGLE.EARLIESTPRESENTTIME); }
    /** Unsafe version of {@link #presentMargin}. */
    public static long npresentMargin(long struct) { return memGetLong(struct + VkPastPresentationTimingGOOGLE.PRESENTMARGIN); }

    // -----------------------------------

    /** An array of {@link VkPastPresentationTimingGOOGLE} structs. */
    public static class Buffer extends StructBuffer<VkPastPresentationTimingGOOGLE, Buffer> implements NativeResource {

        private static final VkPastPresentationTimingGOOGLE ELEMENT_FACTORY = VkPastPresentationTimingGOOGLE.create(-1L);

        /**
         * Creates a new {@code VkPastPresentationTimingGOOGLE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPastPresentationTimingGOOGLE#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPastPresentationTimingGOOGLE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code presentID} field. */
        @NativeType("uint32_t")
        public int presentID() { return VkPastPresentationTimingGOOGLE.npresentID(address()); }
        /** @return the value of the {@code desiredPresentTime} field. */
        @NativeType("uint64_t")
        public long desiredPresentTime() { return VkPastPresentationTimingGOOGLE.ndesiredPresentTime(address()); }
        /** @return the value of the {@code actualPresentTime} field. */
        @NativeType("uint64_t")
        public long actualPresentTime() { return VkPastPresentationTimingGOOGLE.nactualPresentTime(address()); }
        /** @return the value of the {@code earliestPresentTime} field. */
        @NativeType("uint64_t")
        public long earliestPresentTime() { return VkPastPresentationTimingGOOGLE.nearliestPresentTime(address()); }
        /** @return the value of the {@code presentMargin} field. */
        @NativeType("uint64_t")
        public long presentMargin() { return VkPastPresentationTimingGOOGLE.npresentMargin(address()); }

    }

}