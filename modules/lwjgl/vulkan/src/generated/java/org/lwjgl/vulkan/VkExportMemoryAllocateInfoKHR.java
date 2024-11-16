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
 * See {@link VkExportMemoryAllocateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExportMemoryAllocateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkExternalMemoryHandleTypeFlags handleTypes;
 * }</code></pre>
 */
public class VkExportMemoryAllocateInfoKHR extends VkExportMemoryAllocateInfo {

    protected VkExportMemoryAllocateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExportMemoryAllocateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkExportMemoryAllocateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkExportMemoryAllocateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExportMemoryAllocateInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkExportMemoryAllocateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO} value to the {@code sType} field. */
    @Override
    public VkExportMemoryAllocateInfoKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkExportMemoryAllocateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code handleTypes} field. */
    @Override
    public VkExportMemoryAllocateInfoKHR handleTypes(@NativeType("VkExternalMemoryHandleTypeFlags") int value) { nhandleTypes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkExportMemoryAllocateInfoKHR set(
        int sType,
        long pNext,
        int handleTypes
    ) {
        sType(sType);
        pNext(pNext);
        handleTypes(handleTypes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExportMemoryAllocateInfoKHR set(VkExportMemoryAllocateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExportMemoryAllocateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExportMemoryAllocateInfoKHR malloc() {
        return new VkExportMemoryAllocateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExportMemoryAllocateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExportMemoryAllocateInfoKHR calloc() {
        return new VkExportMemoryAllocateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExportMemoryAllocateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkExportMemoryAllocateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportMemoryAllocateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkExportMemoryAllocateInfoKHR} instance for the specified memory address. */
    public static VkExportMemoryAllocateInfoKHR create(long address) {
        return new VkExportMemoryAllocateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkExportMemoryAllocateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkExportMemoryAllocateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryAllocateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryAllocateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryAllocateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExportMemoryAllocateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryAllocateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkExportMemoryAllocateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkExportMemoryAllocateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMemoryAllocateInfoKHR malloc(MemoryStack stack) {
        return new VkExportMemoryAllocateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExportMemoryAllocateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMemoryAllocateInfoKHR calloc(MemoryStack stack) {
        return new VkExportMemoryAllocateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryAllocateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryAllocateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkExportMemoryAllocateInfoKHR} structs. */
    public static class Buffer extends VkExportMemoryAllocateInfo.Buffer {

        private static final VkExportMemoryAllocateInfoKHR ELEMENT_FACTORY = VkExportMemoryAllocateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkExportMemoryAllocateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExportMemoryAllocateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExportMemoryAllocateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkExportMemoryAllocateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkExportMemoryAllocateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO} value to the {@code sType} field. */
        @Override
        public VkExportMemoryAllocateInfoKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkExportMemoryAllocateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkExportMemoryAllocateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code handleTypes} field. */
        @Override
        public VkExportMemoryAllocateInfoKHR.Buffer handleTypes(@NativeType("VkExternalMemoryHandleTypeFlags") int value) { VkExportMemoryAllocateInfoKHR.nhandleTypes(address(), value); return this; }

    }

}