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
 * struct VkMicromapUsageKHR {
 *     uint32_t count;
 *     uint32_t subdivisionLevel;
 *     VkOpacityMicromapFormatKHR format;
 * }}</pre>
 */
public class VkMicromapUsageKHR extends Struct<VkMicromapUsageKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COUNT,
        SUBDIVISIONLEVEL,
        FORMAT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COUNT = layout.offsetof(0);
        SUBDIVISIONLEVEL = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
    }

    protected VkMicromapUsageKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMicromapUsageKHR create(long address, @Nullable ByteBuffer container) {
        return new VkMicromapUsageKHR(address, container);
    }

    /**
     * Creates a {@code VkMicromapUsageKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMicromapUsageKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code count} field. */
    @NativeType("uint32_t")
    public int count() { return ncount(address()); }
    /** @return the value of the {@code subdivisionLevel} field. */
    @NativeType("uint32_t")
    public int subdivisionLevel() { return nsubdivisionLevel(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("VkOpacityMicromapFormatKHR")
    public int format() { return nformat(address()); }

    /** Sets the specified value to the {@code count} field. */
    public VkMicromapUsageKHR count(@NativeType("uint32_t") int value) { ncount(address(), value); return this; }
    /** Sets the specified value to the {@code subdivisionLevel} field. */
    public VkMicromapUsageKHR subdivisionLevel(@NativeType("uint32_t") int value) { nsubdivisionLevel(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public VkMicromapUsageKHR format(@NativeType("VkOpacityMicromapFormatKHR") int value) { nformat(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMicromapUsageKHR set(
        int count,
        int subdivisionLevel,
        int format
    ) {
        count(count);
        subdivisionLevel(subdivisionLevel);
        format(format);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMicromapUsageKHR set(VkMicromapUsageKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMicromapUsageKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMicromapUsageKHR malloc() {
        return new VkMicromapUsageKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMicromapUsageKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMicromapUsageKHR calloc() {
        return new VkMicromapUsageKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMicromapUsageKHR} instance allocated with {@link BufferUtils}. */
    public static VkMicromapUsageKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMicromapUsageKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkMicromapUsageKHR} instance for the specified memory address. */
    public static VkMicromapUsageKHR create(long address) {
        return new VkMicromapUsageKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMicromapUsageKHR createSafe(long address) {
        return address == NULL ? null : new VkMicromapUsageKHR(address, null);
    }

    /**
     * Returns a new {@link VkMicromapUsageKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapUsageKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMicromapUsageKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapUsageKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMicromapUsageKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapUsageKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMicromapUsageKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMicromapUsageKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMicromapUsageKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMicromapUsageKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMicromapUsageKHR malloc(MemoryStack stack) {
        return new VkMicromapUsageKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMicromapUsageKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMicromapUsageKHR calloc(MemoryStack stack) {
        return new VkMicromapUsageKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMicromapUsageKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMicromapUsageKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMicromapUsageKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMicromapUsageKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #count}. */
    public static int ncount(long struct) { return memGetInt(struct + VkMicromapUsageKHR.COUNT); }
    /** Unsafe version of {@link #subdivisionLevel}. */
    public static int nsubdivisionLevel(long struct) { return memGetInt(struct + VkMicromapUsageKHR.SUBDIVISIONLEVEL); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkMicromapUsageKHR.FORMAT); }

    /** Unsafe version of {@link #count(int) count}. */
    public static void ncount(long struct, int value) { memPutInt(struct + VkMicromapUsageKHR.COUNT, value); }
    /** Unsafe version of {@link #subdivisionLevel(int) subdivisionLevel}. */
    public static void nsubdivisionLevel(long struct, int value) { memPutInt(struct + VkMicromapUsageKHR.SUBDIVISIONLEVEL, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + VkMicromapUsageKHR.FORMAT, value); }

    // -----------------------------------

    /** An array of {@link VkMicromapUsageKHR} structs. */
    public static class Buffer extends StructBuffer<VkMicromapUsageKHR, Buffer> implements NativeResource {

        private static final VkMicromapUsageKHR ELEMENT_FACTORY = VkMicromapUsageKHR.create(-1L);

        /**
         * Creates a new {@code VkMicromapUsageKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMicromapUsageKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMicromapUsageKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code count} field. */
        @NativeType("uint32_t")
        public int count() { return VkMicromapUsageKHR.ncount(address()); }
        /** @return the value of the {@code subdivisionLevel} field. */
        @NativeType("uint32_t")
        public int subdivisionLevel() { return VkMicromapUsageKHR.nsubdivisionLevel(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("VkOpacityMicromapFormatKHR")
        public int format() { return VkMicromapUsageKHR.nformat(address()); }

        /** Sets the specified value to the {@code count} field. */
        public VkMicromapUsageKHR.Buffer count(@NativeType("uint32_t") int value) { VkMicromapUsageKHR.ncount(address(), value); return this; }
        /** Sets the specified value to the {@code subdivisionLevel} field. */
        public VkMicromapUsageKHR.Buffer subdivisionLevel(@NativeType("uint32_t") int value) { VkMicromapUsageKHR.nsubdivisionLevel(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public VkMicromapUsageKHR.Buffer format(@NativeType("VkOpacityMicromapFormatKHR") int value) { VkMicromapUsageKHR.nformat(address(), value); return this; }

    }

}