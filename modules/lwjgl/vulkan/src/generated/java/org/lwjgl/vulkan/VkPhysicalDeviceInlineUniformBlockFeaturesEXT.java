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
 * See {@link VkPhysicalDeviceInlineUniformBlockFeatures}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceInlineUniformBlockFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 inlineUniformBlock;
 *     VkBool32 descriptorBindingInlineUniformBlockUpdateAfterBind;
 * }</code></pre>
 */
public class VkPhysicalDeviceInlineUniformBlockFeaturesEXT extends VkPhysicalDeviceInlineUniformBlockFeatures {

    /**
     * Creates a {@code VkPhysicalDeviceInlineUniformBlockFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code inlineUniformBlock} field. */
    @Override
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT inlineUniformBlock(@NativeType("VkBool32") boolean value) { ninlineUniformBlock(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingInlineUniformBlockUpdateAfterBind} field. */
    @Override
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT descriptorBindingInlineUniformBlockUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingInlineUniformBlockUpdateAfterBind(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT set(
        int sType,
        long pNext,
        boolean inlineUniformBlock,
        boolean descriptorBindingInlineUniformBlockUpdateAfterBind
    ) {
        sType(sType);
        pNext(pNext);
        inlineUniformBlock(inlineUniformBlock);
        descriptorBindingInlineUniformBlockUpdateAfterBind(descriptorBindingInlineUniformBlockUpdateAfterBind);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT set(VkPhysicalDeviceInlineUniformBlockFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceInlineUniformBlockFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceInlineUniformBlockFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceInlineUniformBlockFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceInlineUniformBlockFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceInlineUniformBlockFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceInlineUniformBlockFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceInlineUniformBlockFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceInlineUniformBlockFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceInlineUniformBlockFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT} structs. */
    public static class Buffer extends VkPhysicalDeviceInlineUniformBlockFeatures.Buffer {

        private static final VkPhysicalDeviceInlineUniformBlockFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceInlineUniformBlockFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceInlineUniformBlockFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceInlineUniformBlockFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceInlineUniformBlockFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code inlineUniformBlock} field. */
        @Override
        public VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer inlineUniformBlock(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceInlineUniformBlockFeaturesEXT.ninlineUniformBlock(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingInlineUniformBlockUpdateAfterBind} field. */
        @Override
        public VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer descriptorBindingInlineUniformBlockUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceInlineUniformBlockFeaturesEXT.ndescriptorBindingInlineUniformBlockUpdateAfterBind(address(), value ? 1 : 0); return this; }

    }

}