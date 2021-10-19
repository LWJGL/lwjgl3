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
 * See {@link VkBindBufferMemoryInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBindBufferMemoryInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBuffer buffer;
 *     VkDeviceMemory memory;
 *     VkDeviceSize memoryOffset;
 * }</code></pre>
 */
public class VkBindBufferMemoryInfoKHR extends VkBindBufferMemoryInfo {

    /**
     * Creates a {@code VkBindBufferMemoryInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindBufferMemoryInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkBindBufferMemoryInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO} value to the {@code sType} field. */
    @Override
    public VkBindBufferMemoryInfoKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkBindBufferMemoryInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code buffer} field. */
    @Override
    public VkBindBufferMemoryInfoKHR buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    @Override
    public VkBindBufferMemoryInfoKHR memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@code memoryOffset} field. */
    @Override
    public VkBindBufferMemoryInfoKHR memoryOffset(@NativeType("VkDeviceSize") long value) { nmemoryOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkBindBufferMemoryInfoKHR set(
        int sType,
        long pNext,
        long buffer,
        long memory,
        long memoryOffset
    ) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);
        memory(memory);
        memoryOffset(memoryOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindBufferMemoryInfoKHR set(VkBindBufferMemoryInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindBufferMemoryInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindBufferMemoryInfoKHR malloc() {
        return wrap(VkBindBufferMemoryInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBindBufferMemoryInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindBufferMemoryInfoKHR calloc() {
        return wrap(VkBindBufferMemoryInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBindBufferMemoryInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkBindBufferMemoryInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBindBufferMemoryInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBindBufferMemoryInfoKHR} instance for the specified memory address. */
    public static VkBindBufferMemoryInfoKHR create(long address) {
        return wrap(VkBindBufferMemoryInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindBufferMemoryInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkBindBufferMemoryInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBindBufferMemoryInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindBufferMemoryInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkBindBufferMemoryInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindBufferMemoryInfoKHR malloc(MemoryStack stack) {
        return wrap(VkBindBufferMemoryInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBindBufferMemoryInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindBufferMemoryInfoKHR calloc(MemoryStack stack) {
        return wrap(VkBindBufferMemoryInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindBufferMemoryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkBindBufferMemoryInfoKHR} structs. */
    public static class Buffer extends VkBindBufferMemoryInfo.Buffer {

        private static final VkBindBufferMemoryInfoKHR ELEMENT_FACTORY = VkBindBufferMemoryInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkBindBufferMemoryInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindBufferMemoryInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkBindBufferMemoryInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkBindBufferMemoryInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBindBufferMemoryInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO} value to the {@code sType} field. */
        @Override
        public VkBindBufferMemoryInfoKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkBindBufferMemoryInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkBindBufferMemoryInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code buffer} field. */
        @Override
        public VkBindBufferMemoryInfoKHR.Buffer buffer(@NativeType("VkBuffer") long value) { VkBindBufferMemoryInfoKHR.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        @Override
        public VkBindBufferMemoryInfoKHR.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkBindBufferMemoryInfoKHR.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@code memoryOffset} field. */
        @Override
        public VkBindBufferMemoryInfoKHR.Buffer memoryOffset(@NativeType("VkDeviceSize") long value) { VkBindBufferMemoryInfoKHR.nmemoryOffset(address(), value); return this; }

    }

}