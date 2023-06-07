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
 * See {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 fragmentShaderBarycentric;
 * }</code></pre>
 */
public class VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV extends VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR {

    protected VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRFragmentShaderBarycentric#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV sType$Default() { return sType(KHRFragmentShaderBarycentric.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code fragmentShaderBarycentric} field. */
    @Override
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV fragmentShaderBarycentric(@NativeType("VkBool32") boolean value) { nfragmentShaderBarycentric(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV set(
        int sType,
        long pNext,
        boolean fragmentShaderBarycentric
    ) {
        sType(sType);
        pNext(pNext);
        fragmentShaderBarycentric(fragmentShaderBarycentric);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV set(VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV malloc() {
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV calloc() {
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV create(long address) {
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} structs. */
    public static class Buffer extends VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer {

        private static final VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link KHRFragmentShaderBarycentric#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer sType$Default() { return sType(KHRFragmentShaderBarycentric.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code fragmentShaderBarycentric} field. */
        @Override
        public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer fragmentShaderBarycentric(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.nfragmentShaderBarycentric(address(), value ? 1 : 0); return this; }

    }

}