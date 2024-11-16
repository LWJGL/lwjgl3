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
 * See {@link VkDescriptorSetLayoutBindingFlagsCreateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorSetLayoutBindingFlagsCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t bindingCount;
 *     VkDescriptorBindingFlags const * pBindingFlags;
 * }</code></pre>
 */
public class VkDescriptorSetLayoutBindingFlagsCreateInfoEXT extends VkDescriptorSetLayoutBindingFlagsCreateInfo {

    protected VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorSetLayoutBindingFlagsCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkDescriptorSetLayoutBindingFlagsCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO} value to the {@code sType} field. */
    @Override
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code bindingCount} field. */
    @Override
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT bindingCount(@NativeType("uint32_t") int value) { nbindingCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pBindingFlags} field. */
    @Override
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT pBindingFlags(@Nullable @NativeType("VkDescriptorBindingFlags const *") IntBuffer value) { npBindingFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT set(
        int sType,
        long pNext,
        int bindingCount,
        @Nullable IntBuffer pBindingFlags
    ) {
        sType(sType);
        pNext(pNext);
        bindingCount(bindingCount);
        pBindingFlags(pBindingFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT set(VkDescriptorSetLayoutBindingFlagsCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT malloc() {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT calloc() {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfoEXT} instance for the specified memory address. */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT create(long address) {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorSetLayoutBindingFlagsCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT malloc(MemoryStack stack) {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT calloc(MemoryStack stack) {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT} structs. */
    public static class Buffer extends VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer {

        private static final VkDescriptorSetLayoutBindingFlagsCreateInfoEXT ELEMENT_FACTORY = VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorSetLayoutBindingFlagsCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO} value to the {@code sType} field. */
        @Override
        public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code bindingCount} field. */
        @Override
        public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer bindingCount(@NativeType("uint32_t") int value) { VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.nbindingCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pBindingFlags} field. */
        @Override
        public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer pBindingFlags(@Nullable @NativeType("VkDescriptorBindingFlags const *") IntBuffer value) { VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.npBindingFlags(address(), value); return this; }

    }

}