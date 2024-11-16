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
 * See {@link VkRenderPassMultiviewCreateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassMultiviewCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t subpassCount;
 *     uint32_t const * pViewMasks;
 *     uint32_t dependencyCount;
 *     int32_t const * pViewOffsets;
 *     uint32_t correlationMaskCount;
 *     uint32_t const * pCorrelationMasks;
 * }</code></pre>
 */
public class VkRenderPassMultiviewCreateInfoKHR extends VkRenderPassMultiviewCreateInfo {

    protected VkRenderPassMultiviewCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderPassMultiviewCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkRenderPassMultiviewCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkRenderPassMultiviewCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassMultiviewCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkRenderPassMultiviewCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO} value to the {@code sType} field. */
    @Override
    public VkRenderPassMultiviewCreateInfoKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkRenderPassMultiviewCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pViewMasks} field. */
    @Override
    public VkRenderPassMultiviewCreateInfoKHR pViewMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npViewMasks(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pViewOffsets} field. */
    @Override
    public VkRenderPassMultiviewCreateInfoKHR pViewOffsets(@Nullable @NativeType("int32_t const *") IntBuffer value) { npViewOffsets(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pCorrelationMasks} field. */
    @Override
    public VkRenderPassMultiviewCreateInfoKHR pCorrelationMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npCorrelationMasks(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkRenderPassMultiviewCreateInfoKHR set(
        int sType,
        long pNext,
        @Nullable IntBuffer pViewMasks,
        @Nullable IntBuffer pViewOffsets,
        @Nullable IntBuffer pCorrelationMasks
    ) {
        sType(sType);
        pNext(pNext);
        pViewMasks(pViewMasks);
        pViewOffsets(pViewOffsets);
        pCorrelationMasks(pCorrelationMasks);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassMultiviewCreateInfoKHR set(VkRenderPassMultiviewCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassMultiviewCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassMultiviewCreateInfoKHR malloc() {
        return new VkRenderPassMultiviewCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassMultiviewCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassMultiviewCreateInfoKHR calloc() {
        return new VkRenderPassMultiviewCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassMultiviewCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassMultiviewCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassMultiviewCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassMultiviewCreateInfoKHR} instance for the specified memory address. */
    public static VkRenderPassMultiviewCreateInfoKHR create(long address) {
        return new VkRenderPassMultiviewCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderPassMultiviewCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkRenderPassMultiviewCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassMultiviewCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassMultiviewCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassMultiviewCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderPassMultiviewCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassMultiviewCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderPassMultiviewCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassMultiviewCreateInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassMultiviewCreateInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassMultiviewCreateInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassMultiviewCreateInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassMultiviewCreateInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassMultiviewCreateInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassMultiviewCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassMultiviewCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkRenderPassMultiviewCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassMultiviewCreateInfoKHR malloc(MemoryStack stack) {
        return new VkRenderPassMultiviewCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderPassMultiviewCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassMultiviewCreateInfoKHR calloc(MemoryStack stack) {
        return new VkRenderPassMultiviewCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassMultiviewCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassMultiviewCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkRenderPassMultiviewCreateInfoKHR} structs. */
    public static class Buffer extends VkRenderPassMultiviewCreateInfo.Buffer {

        private static final VkRenderPassMultiviewCreateInfoKHR ELEMENT_FACTORY = VkRenderPassMultiviewCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkRenderPassMultiviewCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassMultiviewCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderPassMultiviewCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkRenderPassMultiviewCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassMultiviewCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO} value to the {@code sType} field. */
        @Override
        public VkRenderPassMultiviewCreateInfoKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkRenderPassMultiviewCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassMultiviewCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pViewMasks} field. */
        @Override
        public VkRenderPassMultiviewCreateInfoKHR.Buffer pViewMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderPassMultiviewCreateInfoKHR.npViewMasks(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pViewOffsets} field. */
        @Override
        public VkRenderPassMultiviewCreateInfoKHR.Buffer pViewOffsets(@Nullable @NativeType("int32_t const *") IntBuffer value) { VkRenderPassMultiviewCreateInfoKHR.npViewOffsets(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pCorrelationMasks} field. */
        @Override
        public VkRenderPassMultiviewCreateInfoKHR.Buffer pCorrelationMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderPassMultiviewCreateInfoKHR.npCorrelationMasks(address(), value); return this; }

    }

}