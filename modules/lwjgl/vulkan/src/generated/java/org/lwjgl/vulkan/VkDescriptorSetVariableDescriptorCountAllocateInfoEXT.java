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
 * See {@link VkDescriptorSetVariableDescriptorCountAllocateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorSetVariableDescriptorCountAllocateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t descriptorSetCount;
 *     uint32_t const * pDescriptorCounts;
 * }</code></pre>
 */
public class VkDescriptorSetVariableDescriptorCountAllocateInfoEXT extends VkDescriptorSetVariableDescriptorCountAllocateInfo {

    /**
     * Creates a {@code VkDescriptorSetVariableDescriptorCountAllocateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO} value to the {@code sType} field. */
    @Override
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDescriptorCounts} field. */
    @Override
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT pDescriptorCounts(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npDescriptorCounts(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT set(
        int sType,
        long pNext,
        @Nullable IntBuffer pDescriptorCounts
    ) {
        sType(sType);
        pNext(pNext);
        pDescriptorCounts(pDescriptorCounts);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT set(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorSetVariableDescriptorCountAllocateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT malloc() {
        return wrap(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDescriptorSetVariableDescriptorCountAllocateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT calloc() {
        return wrap(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDescriptorSetVariableDescriptorCountAllocateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorSetVariableDescriptorCountAllocateInfoEXT} instance for the specified memory address. */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT create(long address) {
        return wrap(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDescriptorSetVariableDescriptorCountAllocateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDescriptorSetVariableDescriptorCountAllocateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT} structs. */
    public static class Buffer extends VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer {

        private static final VkDescriptorSetVariableDescriptorCountAllocateInfoEXT ELEMENT_FACTORY = VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorSetVariableDescriptorCountAllocateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO} value to the {@code sType} field. */
        @Override
        public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDescriptorCounts} field. */
        @Override
        public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer pDescriptorCounts(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.npDescriptorCounts(address(), value); return this; }

    }

}