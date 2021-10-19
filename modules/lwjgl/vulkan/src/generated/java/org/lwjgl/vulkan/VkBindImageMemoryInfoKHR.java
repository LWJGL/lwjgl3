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
 * See {@link VkBindImageMemoryInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBindImageMemoryInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImage image;
 *     VkDeviceMemory memory;
 *     VkDeviceSize memoryOffset;
 * }</code></pre>
 */
public class VkBindImageMemoryInfoKHR extends VkBindImageMemoryInfo {

    /**
     * Creates a {@code VkBindImageMemoryInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindImageMemoryInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkBindImageMemoryInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO} value to the {@code sType} field. */
    @Override
    public VkBindImageMemoryInfoKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkBindImageMemoryInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code image} field. */
    @Override
    public VkBindImageMemoryInfoKHR image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    @Override
    public VkBindImageMemoryInfoKHR memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@code memoryOffset} field. */
    @Override
    public VkBindImageMemoryInfoKHR memoryOffset(@NativeType("VkDeviceSize") long value) { nmemoryOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkBindImageMemoryInfoKHR set(
        int sType,
        long pNext,
        long image,
        long memory,
        long memoryOffset
    ) {
        sType(sType);
        pNext(pNext);
        image(image);
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
    public VkBindImageMemoryInfoKHR set(VkBindImageMemoryInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindImageMemoryInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindImageMemoryInfoKHR malloc() {
        return wrap(VkBindImageMemoryInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBindImageMemoryInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindImageMemoryInfoKHR calloc() {
        return wrap(VkBindImageMemoryInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBindImageMemoryInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkBindImageMemoryInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBindImageMemoryInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBindImageMemoryInfoKHR} instance for the specified memory address. */
    public static VkBindImageMemoryInfoKHR create(long address) {
        return wrap(VkBindImageMemoryInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindImageMemoryInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkBindImageMemoryInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkBindImageMemoryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBindImageMemoryInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindImageMemoryInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkBindImageMemoryInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindImageMemoryInfoKHR malloc(MemoryStack stack) {
        return wrap(VkBindImageMemoryInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBindImageMemoryInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindImageMemoryInfoKHR calloc(MemoryStack stack) {
        return wrap(VkBindImageMemoryInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindImageMemoryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkBindImageMemoryInfoKHR} structs. */
    public static class Buffer extends VkBindImageMemoryInfo.Buffer {

        private static final VkBindImageMemoryInfoKHR ELEMENT_FACTORY = VkBindImageMemoryInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkBindImageMemoryInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindImageMemoryInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkBindImageMemoryInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkBindImageMemoryInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBindImageMemoryInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO} value to the {@code sType} field. */
        @Override
        public VkBindImageMemoryInfoKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkBindImageMemoryInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkBindImageMemoryInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code image} field. */
        @Override
        public VkBindImageMemoryInfoKHR.Buffer image(@NativeType("VkImage") long value) { VkBindImageMemoryInfoKHR.nimage(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        @Override
        public VkBindImageMemoryInfoKHR.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkBindImageMemoryInfoKHR.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@code memoryOffset} field. */
        @Override
        public VkBindImageMemoryInfoKHR.Buffer memoryOffset(@NativeType("VkDeviceSize") long value) { VkBindImageMemoryInfoKHR.nmemoryOffset(address(), value); return this; }

    }

}