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
 * See {@link VkDescriptorPoolInlineUniformBlockCreateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorPoolInlineUniformBlockCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t maxInlineUniformBlockBindings;
 * }</code></pre>
 */
public class VkDescriptorPoolInlineUniformBlockCreateInfoEXT extends VkDescriptorPoolInlineUniformBlockCreateInfo {

    /**
     * Creates a {@code VkDescriptorPoolInlineUniformBlockCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO} value to the {@code sType} field. */
    @Override
    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code maxInlineUniformBlockBindings} field. */
    @Override
    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT maxInlineUniformBlockBindings(@NativeType("uint32_t") int value) { nmaxInlineUniformBlockBindings(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT set(
        int sType,
        long pNext,
        int maxInlineUniformBlockBindings
    ) {
        sType(sType);
        pNext(pNext);
        maxInlineUniformBlockBindings(maxInlineUniformBlockBindings);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT set(VkDescriptorPoolInlineUniformBlockCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT malloc() {
        return wrap(VkDescriptorPoolInlineUniformBlockCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT calloc() {
        return wrap(VkDescriptorPoolInlineUniformBlockCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDescriptorPoolInlineUniformBlockCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfoEXT} instance for the specified memory address. */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT create(long address) {
        return wrap(VkDescriptorPoolInlineUniformBlockCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDescriptorPoolInlineUniformBlockCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkDescriptorPoolInlineUniformBlockCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkDescriptorPoolInlineUniformBlockCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT} structs. */
    public static class Buffer extends VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer {

        private static final VkDescriptorPoolInlineUniformBlockCreateInfoEXT ELEMENT_FACTORY = VkDescriptorPoolInlineUniformBlockCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorPoolInlineUniformBlockCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorPoolInlineUniformBlockCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO} value to the {@code sType} field. */
        @Override
        public VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorPoolInlineUniformBlockCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code maxInlineUniformBlockBindings} field. */
        @Override
        public VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer maxInlineUniformBlockBindings(@NativeType("uint32_t") int value) { VkDescriptorPoolInlineUniformBlockCreateInfoEXT.nmaxInlineUniformBlockBindings(address(), value); return this; }

    }

}