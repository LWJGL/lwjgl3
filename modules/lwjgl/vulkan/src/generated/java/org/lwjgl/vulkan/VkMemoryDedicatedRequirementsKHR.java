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
 * See {@link VkMemoryDedicatedRequirements}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMemoryDedicatedRequirementsKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 prefersDedicatedAllocation;
 *     VkBool32 requiresDedicatedAllocation;
 * }</code></pre>
 */
public class VkMemoryDedicatedRequirementsKHR extends VkMemoryDedicatedRequirements {

    /**
     * Creates a {@code VkMemoryDedicatedRequirementsKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryDedicatedRequirementsKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkMemoryDedicatedRequirementsKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS} value to the {@code sType} field. */
    @Override
    public VkMemoryDedicatedRequirementsKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkMemoryDedicatedRequirementsKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkMemoryDedicatedRequirementsKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryDedicatedRequirementsKHR set(VkMemoryDedicatedRequirementsKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryDedicatedRequirementsKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryDedicatedRequirementsKHR malloc() {
        return wrap(VkMemoryDedicatedRequirementsKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMemoryDedicatedRequirementsKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryDedicatedRequirementsKHR calloc() {
        return wrap(VkMemoryDedicatedRequirementsKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMemoryDedicatedRequirementsKHR} instance allocated with {@link BufferUtils}. */
    public static VkMemoryDedicatedRequirementsKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMemoryDedicatedRequirementsKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryDedicatedRequirementsKHR} instance for the specified memory address. */
    public static VkMemoryDedicatedRequirementsKHR create(long address) {
        return wrap(VkMemoryDedicatedRequirementsKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryDedicatedRequirementsKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkMemoryDedicatedRequirementsKHR.class, address);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedRequirementsKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedRequirementsKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedRequirementsKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedRequirementsKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedRequirementsKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedRequirementsKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMemoryDedicatedRequirementsKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedRequirementsKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryDedicatedRequirementsKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedRequirementsKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedRequirementsKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedRequirementsKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedRequirementsKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedRequirementsKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedRequirementsKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedRequirementsKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedRequirementsKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkMemoryDedicatedRequirementsKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryDedicatedRequirementsKHR malloc(MemoryStack stack) {
        return wrap(VkMemoryDedicatedRequirementsKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMemoryDedicatedRequirementsKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryDedicatedRequirementsKHR calloc(MemoryStack stack) {
        return wrap(VkMemoryDedicatedRequirementsKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryDedicatedRequirementsKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedRequirementsKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedRequirementsKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedRequirementsKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkMemoryDedicatedRequirementsKHR} structs. */
    public static class Buffer extends VkMemoryDedicatedRequirements.Buffer {

        private static final VkMemoryDedicatedRequirementsKHR ELEMENT_FACTORY = VkMemoryDedicatedRequirementsKHR.create(-1L);

        /**
         * Creates a new {@code VkMemoryDedicatedRequirementsKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryDedicatedRequirementsKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkMemoryDedicatedRequirementsKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkMemoryDedicatedRequirementsKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryDedicatedRequirementsKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS} value to the {@code sType} field. */
        @Override
        public VkMemoryDedicatedRequirementsKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkMemoryDedicatedRequirementsKHR.Buffer pNext(@NativeType("void *") long value) { VkMemoryDedicatedRequirementsKHR.npNext(address(), value); return this; }

    }

}