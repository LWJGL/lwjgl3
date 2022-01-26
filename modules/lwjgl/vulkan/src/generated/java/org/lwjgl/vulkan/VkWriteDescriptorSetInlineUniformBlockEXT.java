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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkWriteDescriptorSetInlineUniformBlock}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkWriteDescriptorSetInlineUniformBlockEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t dataSize;
 *     void const * pData;
 * }</code></pre>
 */
public class VkWriteDescriptorSetInlineUniformBlockEXT extends VkWriteDescriptorSetInlineUniformBlock {

    /**
     * Creates a {@code VkWriteDescriptorSetInlineUniformBlockEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkWriteDescriptorSetInlineUniformBlockEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkWriteDescriptorSetInlineUniformBlockEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK} value to the {@code sType} field. */
    @Override
    public VkWriteDescriptorSetInlineUniformBlockEXT sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkWriteDescriptorSetInlineUniformBlockEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pData} field. */
    @Override
    public VkWriteDescriptorSetInlineUniformBlockEXT pData(@NativeType("void const *") ByteBuffer value) { npData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkWriteDescriptorSetInlineUniformBlockEXT set(
        int sType,
        long pNext,
        ByteBuffer pData
    ) {
        sType(sType);
        pNext(pNext);
        pData(pData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkWriteDescriptorSetInlineUniformBlockEXT set(VkWriteDescriptorSetInlineUniformBlockEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkWriteDescriptorSetInlineUniformBlockEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkWriteDescriptorSetInlineUniformBlockEXT malloc() {
        return wrap(VkWriteDescriptorSetInlineUniformBlockEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkWriteDescriptorSetInlineUniformBlockEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkWriteDescriptorSetInlineUniformBlockEXT calloc() {
        return wrap(VkWriteDescriptorSetInlineUniformBlockEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkWriteDescriptorSetInlineUniformBlockEXT} instance allocated with {@link BufferUtils}. */
    public static VkWriteDescriptorSetInlineUniformBlockEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkWriteDescriptorSetInlineUniformBlockEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkWriteDescriptorSetInlineUniformBlockEXT} instance for the specified memory address. */
    public static VkWriteDescriptorSetInlineUniformBlockEXT create(long address) {
        return wrap(VkWriteDescriptorSetInlineUniformBlockEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkWriteDescriptorSetInlineUniformBlockEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkWriteDescriptorSetInlineUniformBlockEXT.class, address);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetInlineUniformBlockEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetInlineUniformBlockEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetInlineUniformBlockEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetInlineUniformBlockEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetInlineUniformBlockEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetInlineUniformBlockEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkWriteDescriptorSetInlineUniformBlockEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetInlineUniformBlockEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkWriteDescriptorSetInlineUniformBlockEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSetInlineUniformBlockEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSetInlineUniformBlockEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSetInlineUniformBlockEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSetInlineUniformBlockEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSetInlineUniformBlockEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSetInlineUniformBlockEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSetInlineUniformBlockEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSetInlineUniformBlockEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkWriteDescriptorSetInlineUniformBlockEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteDescriptorSetInlineUniformBlockEXT malloc(MemoryStack stack) {
        return wrap(VkWriteDescriptorSetInlineUniformBlockEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkWriteDescriptorSetInlineUniformBlockEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteDescriptorSetInlineUniformBlockEXT calloc(MemoryStack stack) {
        return wrap(VkWriteDescriptorSetInlineUniformBlockEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetInlineUniformBlockEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetInlineUniformBlockEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetInlineUniformBlockEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetInlineUniformBlockEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkWriteDescriptorSetInlineUniformBlockEXT} structs. */
    public static class Buffer extends VkWriteDescriptorSetInlineUniformBlock.Buffer {

        private static final VkWriteDescriptorSetInlineUniformBlockEXT ELEMENT_FACTORY = VkWriteDescriptorSetInlineUniformBlockEXT.create(-1L);

        /**
         * Creates a new {@code VkWriteDescriptorSetInlineUniformBlockEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkWriteDescriptorSetInlineUniformBlockEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkWriteDescriptorSetInlineUniformBlockEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkWriteDescriptorSetInlineUniformBlockEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkWriteDescriptorSetInlineUniformBlockEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK} value to the {@code sType} field. */
        @Override
        public VkWriteDescriptorSetInlineUniformBlockEXT.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkWriteDescriptorSetInlineUniformBlockEXT.Buffer pNext(@NativeType("void const *") long value) { VkWriteDescriptorSetInlineUniformBlockEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pData} field. */
        @Override
        public VkWriteDescriptorSetInlineUniformBlockEXT.Buffer pData(@NativeType("void const *") ByteBuffer value) { VkWriteDescriptorSetInlineUniformBlockEXT.npData(address(), value); return this; }

    }

}