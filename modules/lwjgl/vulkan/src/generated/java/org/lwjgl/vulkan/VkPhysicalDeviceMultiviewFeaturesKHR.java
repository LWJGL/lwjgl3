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
 * See {@link VkPhysicalDeviceMultiviewFeatures}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMultiviewFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 multiview;
 *     VkBool32 multiviewGeometryShader;
 *     VkBool32 multiviewTessellationShader;
 * }</code></pre>
 */
public class VkPhysicalDeviceMultiviewFeaturesKHR extends VkPhysicalDeviceMultiviewFeatures {

    protected VkPhysicalDeviceMultiviewFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMultiviewFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMultiviewFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMultiviewFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMultiviewFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceMultiviewFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceMultiviewFeaturesKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceMultiviewFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code multiview} field. */
    @Override
    public VkPhysicalDeviceMultiviewFeaturesKHR multiview(@NativeType("VkBool32") boolean value) { nmultiview(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code multiviewGeometryShader} field. */
    @Override
    public VkPhysicalDeviceMultiviewFeaturesKHR multiviewGeometryShader(@NativeType("VkBool32") boolean value) { nmultiviewGeometryShader(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code multiviewTessellationShader} field. */
    @Override
    public VkPhysicalDeviceMultiviewFeaturesKHR multiviewTessellationShader(@NativeType("VkBool32") boolean value) { nmultiviewTessellationShader(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceMultiviewFeaturesKHR set(
        int sType,
        long pNext,
        boolean multiview,
        boolean multiviewGeometryShader,
        boolean multiviewTessellationShader
    ) {
        sType(sType);
        pNext(pNext);
        multiview(multiview);
        multiviewGeometryShader(multiviewGeometryShader);
        multiviewTessellationShader(multiviewTessellationShader);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMultiviewFeaturesKHR set(VkPhysicalDeviceMultiviewFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMultiviewFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMultiviewFeaturesKHR malloc() {
        return new VkPhysicalDeviceMultiviewFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMultiviewFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMultiviewFeaturesKHR calloc() {
        return new VkPhysicalDeviceMultiviewFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMultiviewFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMultiviewFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMultiviewFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMultiviewFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceMultiviewFeaturesKHR create(long address) {
        return new VkPhysicalDeviceMultiviewFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceMultiviewFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMultiviewFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMultiviewFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceMultiviewFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMultiviewFeaturesKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMultiviewFeaturesKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMultiviewFeaturesKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMultiviewFeaturesKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMultiviewFeaturesKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMultiviewFeaturesKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMultiviewFeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMultiviewFeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceMultiviewFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMultiviewFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultiviewFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMultiviewFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMultiviewFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultiviewFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMultiviewFeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceMultiviewFeatures.Buffer {

        private static final VkPhysicalDeviceMultiviewFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceMultiviewFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMultiviewFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMultiviewFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMultiviewFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceMultiviewFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMultiviewFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceMultiviewFeaturesKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceMultiviewFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMultiviewFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code multiview} field. */
        @Override
        public VkPhysicalDeviceMultiviewFeaturesKHR.Buffer multiview(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMultiviewFeaturesKHR.nmultiview(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code multiviewGeometryShader} field. */
        @Override
        public VkPhysicalDeviceMultiviewFeaturesKHR.Buffer multiviewGeometryShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMultiviewFeaturesKHR.nmultiviewGeometryShader(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code multiviewTessellationShader} field. */
        @Override
        public VkPhysicalDeviceMultiviewFeaturesKHR.Buffer multiviewTessellationShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMultiviewFeaturesKHR.nmultiviewTessellationShader(address(), value ? 1 : 0); return this; }

    }

}