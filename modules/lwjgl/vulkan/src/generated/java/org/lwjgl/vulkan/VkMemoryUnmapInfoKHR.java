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
 * struct VkMemoryUnmapInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkMemoryUnmapFlags flags;
 *     VkDeviceMemory memory;
 * }}</pre>
 */
public class VkMemoryUnmapInfoKHR extends VkMemoryUnmapInfo {

    protected VkMemoryUnmapInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryUnmapInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryUnmapInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkMemoryUnmapInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryUnmapInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkMemoryUnmapInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO STRUCTURE_TYPE_MEMORY_UNMAP_INFO} value to the {@code sType} field. */
    @Override
    public VkMemoryUnmapInfoKHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkMemoryUnmapInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    @Override
    public VkMemoryUnmapInfoKHR flags(@NativeType("VkMemoryUnmapFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    @Override
    public VkMemoryUnmapInfoKHR memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkMemoryUnmapInfoKHR set(
        int sType,
        long pNext,
        int flags,
        long memory
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        memory(memory);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryUnmapInfoKHR set(VkMemoryUnmapInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryUnmapInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryUnmapInfoKHR malloc() {
        return new VkMemoryUnmapInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryUnmapInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryUnmapInfoKHR calloc() {
        return new VkMemoryUnmapInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryUnmapInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkMemoryUnmapInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryUnmapInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryUnmapInfoKHR} instance for the specified memory address. */
    public static VkMemoryUnmapInfoKHR create(long address) {
        return new VkMemoryUnmapInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryUnmapInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkMemoryUnmapInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkMemoryUnmapInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryUnmapInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryUnmapInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryUnmapInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryUnmapInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryUnmapInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryUnmapInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryUnmapInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryUnmapInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryUnmapInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryUnmapInfoKHR malloc(MemoryStack stack) {
        return new VkMemoryUnmapInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryUnmapInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryUnmapInfoKHR calloc(MemoryStack stack) {
        return new VkMemoryUnmapInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryUnmapInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryUnmapInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryUnmapInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryUnmapInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkMemoryUnmapInfoKHR} structs. */
    public static class Buffer extends VkMemoryUnmapInfo.Buffer {

        private static final VkMemoryUnmapInfoKHR ELEMENT_FACTORY = VkMemoryUnmapInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkMemoryUnmapInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryUnmapInfoKHR#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
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
        protected VkMemoryUnmapInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkMemoryUnmapInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryUnmapInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO STRUCTURE_TYPE_MEMORY_UNMAP_INFO} value to the {@code sType} field. */
        @Override
        public VkMemoryUnmapInfoKHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkMemoryUnmapInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkMemoryUnmapInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        @Override
        public VkMemoryUnmapInfoKHR.Buffer flags(@NativeType("VkMemoryUnmapFlags") int value) { VkMemoryUnmapInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        @Override
        public VkMemoryUnmapInfoKHR.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkMemoryUnmapInfoKHR.nmemory(address(), value); return this; }

    }

}