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
 * See {@link VkDescriptorSetVariableDescriptorCountLayoutSupport}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorSetVariableDescriptorCountLayoutSupportEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxVariableDescriptorCount;
 * }</code></pre>
 */
public class VkDescriptorSetVariableDescriptorCountLayoutSupportEXT extends VkDescriptorSetVariableDescriptorCountLayoutSupport {

    /**
     * Creates a {@code VkDescriptorSetVariableDescriptorCountLayoutSupportEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT} value to the {@code sType} field. */
    @Override
    public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT set(
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
    public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT set(VkDescriptorSetVariableDescriptorCountLayoutSupportEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorSetVariableDescriptorCountLayoutSupportEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT malloc() {
        return wrap(VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDescriptorSetVariableDescriptorCountLayoutSupportEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT calloc() {
        return wrap(VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDescriptorSetVariableDescriptorCountLayoutSupportEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorSetVariableDescriptorCountLayoutSupportEXT} instance for the specified memory address. */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT create(long address) {
        return wrap(VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.class, address);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDescriptorSetVariableDescriptorCountLayoutSupportEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT malloc(MemoryStack stack) {
        return wrap(VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDescriptorSetVariableDescriptorCountLayoutSupportEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT calloc(MemoryStack stack) {
        return wrap(VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDescriptorSetVariableDescriptorCountLayoutSupportEXT} structs. */
    public static class Buffer extends VkDescriptorSetVariableDescriptorCountLayoutSupport.Buffer {

        private static final VkDescriptorSetVariableDescriptorCountLayoutSupportEXT ELEMENT_FACTORY = VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetVariableDescriptorCountLayoutSupportEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorSetVariableDescriptorCountLayoutSupportEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT} value to the {@code sType} field. */
        @Override
        public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Buffer pNext(@NativeType("void *") long value) { VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.npNext(address(), value); return this; }

    }

}