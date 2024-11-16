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
 * See {@link VkPhysicalDeviceShaderFloat16Int8Features}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFloat16Int8FeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderFloat16;
 *     VkBool32 shaderInt8;
 * }</code></pre>
 */
public class VkPhysicalDeviceFloat16Int8FeaturesKHR extends VkPhysicalDeviceShaderFloat16Int8Features {

    protected VkPhysicalDeviceFloat16Int8FeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceFloat16Int8FeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceFloat16Int8FeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFloat16Int8FeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFloat16Int8FeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceFloat16Int8FeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceFloat16Int8FeaturesKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceFloat16Int8FeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderFloat16} field. */
    @Override
    public VkPhysicalDeviceFloat16Int8FeaturesKHR shaderFloat16(@NativeType("VkBool32") boolean value) { nshaderFloat16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderInt8} field. */
    @Override
    public VkPhysicalDeviceFloat16Int8FeaturesKHR shaderInt8(@NativeType("VkBool32") boolean value) { nshaderInt8(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceFloat16Int8FeaturesKHR set(
        int sType,
        long pNext,
        boolean shaderFloat16,
        boolean shaderInt8
    ) {
        sType(sType);
        pNext(pNext);
        shaderFloat16(shaderFloat16);
        shaderInt8(shaderInt8);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFloat16Int8FeaturesKHR set(VkPhysicalDeviceFloat16Int8FeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFloat16Int8FeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFloat16Int8FeaturesKHR malloc() {
        return new VkPhysicalDeviceFloat16Int8FeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFloat16Int8FeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFloat16Int8FeaturesKHR calloc() {
        return new VkPhysicalDeviceFloat16Int8FeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFloat16Int8FeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFloat16Int8FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFloat16Int8FeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFloat16Int8FeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceFloat16Int8FeaturesKHR create(long address) {
        return new VkPhysicalDeviceFloat16Int8FeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceFloat16Int8FeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceFloat16Int8FeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceFloat16Int8FeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFloat16Int8FeaturesKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFloat16Int8FeaturesKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFloat16Int8FeaturesKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFloat16Int8FeaturesKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceFloat16Int8FeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFloat16Int8FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFloat16Int8FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFloat16Int8FeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFloat16Int8FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFloat16Int8FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFloat16Int8FeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceShaderFloat16Int8Features.Buffer {

        private static final VkPhysicalDeviceFloat16Int8FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceFloat16Int8FeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFloat16Int8FeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceFloat16Int8FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFloat16Int8FeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFloat16Int8FeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderFloat16} field. */
        @Override
        public VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer shaderFloat16(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFloat16Int8FeaturesKHR.nshaderFloat16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderInt8} field. */
        @Override
        public VkPhysicalDeviceFloat16Int8FeaturesKHR.Buffer shaderInt8(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFloat16Int8FeaturesKHR.nshaderInt8(address(), value ? 1 : 0); return this; }

    }

}