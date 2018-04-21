/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure containing the RC duration of a display.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code refreshDuration} &ndash; the number of nanoseconds from the start of one refresh cycle to the next.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkRefreshCycleDurationGOOGLE {
 *     uint64_t refreshDuration;
 * }</pre></code>
 */
public class VkRefreshCycleDurationGOOGLE extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        REFRESHDURATION;

    static {
        Layout layout = __struct(
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        REFRESHDURATION = layout.offsetof(0);
    }

    VkRefreshCycleDurationGOOGLE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkRefreshCycleDurationGOOGLE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRefreshCycleDurationGOOGLE(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code refreshDuration} field. */
    @NativeType("uint64_t")
    public long refreshDuration() { return nrefreshDuration(address()); }

    /** Sets the specified value to the {@code refreshDuration} field. */
    public VkRefreshCycleDurationGOOGLE refreshDuration(@NativeType("uint64_t") long value) { nrefreshDuration(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRefreshCycleDurationGOOGLE set(VkRefreshCycleDurationGOOGLE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkRefreshCycleDurationGOOGLE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRefreshCycleDurationGOOGLE malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkRefreshCycleDurationGOOGLE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRefreshCycleDurationGOOGLE calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkRefreshCycleDurationGOOGLE} instance allocated with {@link BufferUtils}. */
    public static VkRefreshCycleDurationGOOGLE create() {
        return new VkRefreshCycleDurationGOOGLE(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkRefreshCycleDurationGOOGLE} instance for the specified memory address. */
    public static VkRefreshCycleDurationGOOGLE create(long address) {
        return new VkRefreshCycleDurationGOOGLE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRefreshCycleDurationGOOGLE createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkRefreshCycleDurationGOOGLE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRefreshCycleDurationGOOGLE.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRefreshCycleDurationGOOGLE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRefreshCycleDurationGOOGLE.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRefreshCycleDurationGOOGLE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRefreshCycleDurationGOOGLE.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkRefreshCycleDurationGOOGLE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRefreshCycleDurationGOOGLE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRefreshCycleDurationGOOGLE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkRefreshCycleDurationGOOGLE} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkRefreshCycleDurationGOOGLE mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkRefreshCycleDurationGOOGLE} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkRefreshCycleDurationGOOGLE callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkRefreshCycleDurationGOOGLE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRefreshCycleDurationGOOGLE mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkRefreshCycleDurationGOOGLE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRefreshCycleDurationGOOGLE callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRefreshCycleDurationGOOGLE.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRefreshCycleDurationGOOGLE.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRefreshCycleDurationGOOGLE.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkRefreshCycleDurationGOOGLE.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRefreshCycleDurationGOOGLE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRefreshCycleDurationGOOGLE.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRefreshCycleDurationGOOGLE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRefreshCycleDurationGOOGLE.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #refreshDuration}. */
    public static long nrefreshDuration(long struct) { return memGetLong(struct + VkRefreshCycleDurationGOOGLE.REFRESHDURATION); }

    /** Unsafe version of {@link #refreshDuration(long) refreshDuration}. */
    public static void nrefreshDuration(long struct, long value) { memPutLong(struct + VkRefreshCycleDurationGOOGLE.REFRESHDURATION, value); }

    // -----------------------------------

    /** An array of {@link VkRefreshCycleDurationGOOGLE} structs. */
    public static class Buffer extends StructBuffer<VkRefreshCycleDurationGOOGLE, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkRefreshCycleDurationGOOGLE.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRefreshCycleDurationGOOGLE#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkRefreshCycleDurationGOOGLE newInstance(long address) {
            return new VkRefreshCycleDurationGOOGLE(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code refreshDuration} field. */
        @NativeType("uint64_t")
        public long refreshDuration() { return VkRefreshCycleDurationGOOGLE.nrefreshDuration(address()); }

        /** Sets the specified value to the {@code refreshDuration} field. */
        public VkRefreshCycleDurationGOOGLE.Buffer refreshDuration(@NativeType("uint64_t") long value) { VkRefreshCycleDurationGOOGLE.nrefreshDuration(address(), value); return this; }

    }

}