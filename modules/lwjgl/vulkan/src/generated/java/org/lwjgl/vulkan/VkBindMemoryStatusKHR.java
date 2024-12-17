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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkBindMemoryStatusKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkResult * pResult;
 * }}</pre>
 */
public class VkBindMemoryStatusKHR extends VkBindMemoryStatus {

    protected VkBindMemoryStatusKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindMemoryStatusKHR create(long address, @Nullable ByteBuffer container) {
        return new VkBindMemoryStatusKHR(address, container);
    }

    /**
     * Creates a {@code VkBindMemoryStatusKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindMemoryStatusKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkBindMemoryStatusKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS STRUCTURE_TYPE_BIND_MEMORY_STATUS} value to the {@code sType} field. */
    @Override
    public VkBindMemoryStatusKHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkBindMemoryStatusKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pResult} field. */
    @Override
    public VkBindMemoryStatusKHR pResult(@NativeType("VkResult *") IntBuffer value) { npResult(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkBindMemoryStatusKHR set(
        int sType,
        long pNext,
        IntBuffer pResult
    ) {
        sType(sType);
        pNext(pNext);
        pResult(pResult);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindMemoryStatusKHR set(VkBindMemoryStatusKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindMemoryStatusKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindMemoryStatusKHR malloc() {
        return new VkBindMemoryStatusKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindMemoryStatusKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindMemoryStatusKHR calloc() {
        return new VkBindMemoryStatusKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindMemoryStatusKHR} instance allocated with {@link BufferUtils}. */
    public static VkBindMemoryStatusKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindMemoryStatusKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkBindMemoryStatusKHR} instance for the specified memory address. */
    public static VkBindMemoryStatusKHR create(long address) {
        return new VkBindMemoryStatusKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBindMemoryStatusKHR createSafe(long address) {
        return address == NULL ? null : new VkBindMemoryStatusKHR(address, null);
    }

    /**
     * Returns a new {@link VkBindMemoryStatusKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindMemoryStatusKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindMemoryStatusKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindMemoryStatusKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindMemoryStatusKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindMemoryStatusKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindMemoryStatusKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindMemoryStatusKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBindMemoryStatusKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBindMemoryStatusKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindMemoryStatusKHR malloc(MemoryStack stack) {
        return new VkBindMemoryStatusKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindMemoryStatusKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindMemoryStatusKHR calloc(MemoryStack stack) {
        return new VkBindMemoryStatusKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindMemoryStatusKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindMemoryStatusKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindMemoryStatusKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindMemoryStatusKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkBindMemoryStatusKHR} structs. */
    public static class Buffer extends VkBindMemoryStatus.Buffer {

        private static final VkBindMemoryStatusKHR ELEMENT_FACTORY = VkBindMemoryStatusKHR.create(-1L);

        /**
         * Creates a new {@code VkBindMemoryStatusKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindMemoryStatusKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindMemoryStatusKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkBindMemoryStatusKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBindMemoryStatusKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS STRUCTURE_TYPE_BIND_MEMORY_STATUS} value to the {@code sType} field. */
        @Override
        public VkBindMemoryStatusKHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkBindMemoryStatusKHR.Buffer pNext(@NativeType("void const *") long value) { VkBindMemoryStatusKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pResult} field. */
        @Override
        public VkBindMemoryStatusKHR.Buffer pResult(@NativeType("VkResult *") IntBuffer value) { VkBindMemoryStatusKHR.npResult(address(), value); return this; }

    }

}