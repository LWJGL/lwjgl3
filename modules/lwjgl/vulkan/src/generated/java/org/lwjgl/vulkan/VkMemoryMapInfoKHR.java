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
 * struct VkMemoryMapInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkMemoryMapFlags flags;
 *     VkDeviceMemory memory;
 *     VkDeviceSize offset;
 *     VkDeviceSize size;
 * }}</pre>
 */
public class VkMemoryMapInfoKHR extends VkMemoryMapInfo {

    protected VkMemoryMapInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryMapInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryMapInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkMemoryMapInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryMapInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkMemoryMapInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_MEMORY_MAP_INFO STRUCTURE_TYPE_MEMORY_MAP_INFO} value to the {@code sType} field. */
    @Override
    public VkMemoryMapInfoKHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_MEMORY_MAP_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkMemoryMapInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    @Override
    public VkMemoryMapInfoKHR flags(@NativeType("VkMemoryMapFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    @Override
    public VkMemoryMapInfoKHR memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    @Override
    public VkMemoryMapInfoKHR offset(@NativeType("VkDeviceSize") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    @Override
    public VkMemoryMapInfoKHR size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkMemoryMapInfoKHR set(
        int sType,
        long pNext,
        int flags,
        long memory,
        long offset,
        long size
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        memory(memory);
        offset(offset);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryMapInfoKHR set(VkMemoryMapInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryMapInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryMapInfoKHR malloc() {
        return new VkMemoryMapInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryMapInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryMapInfoKHR calloc() {
        return new VkMemoryMapInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryMapInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkMemoryMapInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryMapInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryMapInfoKHR} instance for the specified memory address. */
    public static VkMemoryMapInfoKHR create(long address) {
        return new VkMemoryMapInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryMapInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkMemoryMapInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkMemoryMapInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryMapInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryMapInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryMapInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryMapInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryMapInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryMapInfoKHR malloc(MemoryStack stack) {
        return new VkMemoryMapInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryMapInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryMapInfoKHR calloc(MemoryStack stack) {
        return new VkMemoryMapInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryMapInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryMapInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkMemoryMapInfoKHR} structs. */
    public static class Buffer extends VkMemoryMapInfo.Buffer {

        private static final VkMemoryMapInfoKHR ELEMENT_FACTORY = VkMemoryMapInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkMemoryMapInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryMapInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryMapInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkMemoryMapInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryMapInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_MEMORY_MAP_INFO STRUCTURE_TYPE_MEMORY_MAP_INFO} value to the {@code sType} field. */
        @Override
        public VkMemoryMapInfoKHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_MEMORY_MAP_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkMemoryMapInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkMemoryMapInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        @Override
        public VkMemoryMapInfoKHR.Buffer flags(@NativeType("VkMemoryMapFlags") int value) { VkMemoryMapInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        @Override
        public VkMemoryMapInfoKHR.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkMemoryMapInfoKHR.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        @Override
        public VkMemoryMapInfoKHR.Buffer offset(@NativeType("VkDeviceSize") long value) { VkMemoryMapInfoKHR.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        @Override
        public VkMemoryMapInfoKHR.Buffer size(@NativeType("VkDeviceSize") long value) { VkMemoryMapInfoKHR.nsize(address(), value); return this; }

    }

}