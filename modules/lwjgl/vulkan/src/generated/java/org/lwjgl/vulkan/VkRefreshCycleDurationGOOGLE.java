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
 * <pre><code>
 * struct VkRefreshCycleDurationGOOGLE {
 *     uint64_t refreshDuration;
 * }</code></pre>
 */
public class VkRefreshCycleDurationGOOGLE extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
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

    /**
     * Creates a {@code VkRefreshCycleDurationGOOGLE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRefreshCycleDurationGOOGLE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code refreshDuration} field. */
    @NativeType("uint64_t")
    public long refreshDuration() { return nrefreshDuration(address()); }

    // -----------------------------------

    /** Returns a new {@code VkRefreshCycleDurationGOOGLE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRefreshCycleDurationGOOGLE malloc() {
        return wrap(VkRefreshCycleDurationGOOGLE.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkRefreshCycleDurationGOOGLE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRefreshCycleDurationGOOGLE calloc() {
        return wrap(VkRefreshCycleDurationGOOGLE.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkRefreshCycleDurationGOOGLE} instance allocated with {@link BufferUtils}. */
    public static VkRefreshCycleDurationGOOGLE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkRefreshCycleDurationGOOGLE.class, memAddress(container), container);
    }

    /** Returns a new {@code VkRefreshCycleDurationGOOGLE} instance for the specified memory address. */
    public static VkRefreshCycleDurationGOOGLE create(long address) {
        return wrap(VkRefreshCycleDurationGOOGLE.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRefreshCycleDurationGOOGLE createSafe(long address) {
        return address == NULL ? null : wrap(VkRefreshCycleDurationGOOGLE.class, address);
    }

    /**
     * Returns a new {@link VkRefreshCycleDurationGOOGLE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRefreshCycleDurationGOOGLE.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRefreshCycleDurationGOOGLE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRefreshCycleDurationGOOGLE.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRefreshCycleDurationGOOGLE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRefreshCycleDurationGOOGLE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkRefreshCycleDurationGOOGLE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRefreshCycleDurationGOOGLE.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRefreshCycleDurationGOOGLE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkRefreshCycleDurationGOOGLE} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkRefreshCycleDurationGOOGLE mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkRefreshCycleDurationGOOGLE} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkRefreshCycleDurationGOOGLE callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkRefreshCycleDurationGOOGLE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRefreshCycleDurationGOOGLE mallocStack(MemoryStack stack) {
        return wrap(VkRefreshCycleDurationGOOGLE.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkRefreshCycleDurationGOOGLE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRefreshCycleDurationGOOGLE callocStack(MemoryStack stack) {
        return wrap(VkRefreshCycleDurationGOOGLE.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
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
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRefreshCycleDurationGOOGLE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRefreshCycleDurationGOOGLE.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #refreshDuration}. */
    public static long nrefreshDuration(long struct) { return UNSAFE.getLong(null, struct + VkRefreshCycleDurationGOOGLE.REFRESHDURATION); }

    // -----------------------------------

    /** An array of {@link VkRefreshCycleDurationGOOGLE} structs. */
    public static class Buffer extends StructBuffer<VkRefreshCycleDurationGOOGLE, Buffer> implements NativeResource {

        private static final VkRefreshCycleDurationGOOGLE ELEMENT_FACTORY = VkRefreshCycleDurationGOOGLE.create(-1L);

        /**
         * Creates a new {@code VkRefreshCycleDurationGOOGLE.Buffer} instance backed by the specified container.
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
        protected VkRefreshCycleDurationGOOGLE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code refreshDuration} field. */
        @NativeType("uint64_t")
        public long refreshDuration() { return VkRefreshCycleDurationGOOGLE.nrefreshDuration(address()); }

    }

}