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
 * See {@link VkMemoryDedicatedAllocateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMemoryDedicatedAllocateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImage image;
 *     VkBuffer buffer;
 * }</code></pre>
 */
public class VkMemoryDedicatedAllocateInfoKHR extends VkMemoryDedicatedAllocateInfo {

    /**
     * Creates a {@code VkMemoryDedicatedAllocateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryDedicatedAllocateInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkMemoryDedicatedAllocateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO} value to the {@code sType} field. */
    @Override
    public VkMemoryDedicatedAllocateInfoKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkMemoryDedicatedAllocateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code image} field. */
    @Override
    public VkMemoryDedicatedAllocateInfoKHR image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Sets the specified value to the {@code buffer} field. */
    @Override
    public VkMemoryDedicatedAllocateInfoKHR buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkMemoryDedicatedAllocateInfoKHR set(
        int sType,
        long pNext,
        long image,
        long buffer
    ) {
        sType(sType);
        pNext(pNext);
        image(image);
        buffer(buffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryDedicatedAllocateInfoKHR set(VkMemoryDedicatedAllocateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryDedicatedAllocateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryDedicatedAllocateInfoKHR malloc() {
        return wrap(VkMemoryDedicatedAllocateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMemoryDedicatedAllocateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryDedicatedAllocateInfoKHR calloc() {
        return wrap(VkMemoryDedicatedAllocateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMemoryDedicatedAllocateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkMemoryDedicatedAllocateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMemoryDedicatedAllocateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryDedicatedAllocateInfoKHR} instance for the specified memory address. */
    public static VkMemoryDedicatedAllocateInfoKHR create(long address) {
        return wrap(VkMemoryDedicatedAllocateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryDedicatedAllocateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkMemoryDedicatedAllocateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedAllocateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedAllocateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedAllocateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedAllocateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedAllocateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedAllocateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMemoryDedicatedAllocateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedAllocateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryDedicatedAllocateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedAllocateInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedAllocateInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedAllocateInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedAllocateInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedAllocateInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedAllocateInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedAllocateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedAllocateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkMemoryDedicatedAllocateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryDedicatedAllocateInfoKHR malloc(MemoryStack stack) {
        return wrap(VkMemoryDedicatedAllocateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMemoryDedicatedAllocateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryDedicatedAllocateInfoKHR calloc(MemoryStack stack) {
        return wrap(VkMemoryDedicatedAllocateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryDedicatedAllocateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedAllocateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedAllocateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedAllocateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkMemoryDedicatedAllocateInfoKHR} structs. */
    public static class Buffer extends VkMemoryDedicatedAllocateInfo.Buffer {

        private static final VkMemoryDedicatedAllocateInfoKHR ELEMENT_FACTORY = VkMemoryDedicatedAllocateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkMemoryDedicatedAllocateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryDedicatedAllocateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkMemoryDedicatedAllocateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkMemoryDedicatedAllocateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryDedicatedAllocateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO} value to the {@code sType} field. */
        @Override
        public VkMemoryDedicatedAllocateInfoKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkMemoryDedicatedAllocateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkMemoryDedicatedAllocateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code image} field. */
        @Override
        public VkMemoryDedicatedAllocateInfoKHR.Buffer image(@NativeType("VkImage") long value) { VkMemoryDedicatedAllocateInfoKHR.nimage(address(), value); return this; }
        /** Sets the specified value to the {@code buffer} field. */
        @Override
        public VkMemoryDedicatedAllocateInfoKHR.Buffer buffer(@NativeType("VkBuffer") long value) { VkMemoryDedicatedAllocateInfoKHR.nbuffer(address(), value); return this; }

    }

}