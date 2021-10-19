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
 * See {@link VkPhysicalDeviceShaderFloat16Int8Features}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderFloat16Int8FeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderFloat16;
 *     VkBool32 shaderInt8;
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderFloat16Int8FeaturesKHR extends VkPhysicalDeviceShaderFloat16Int8Features {

    /**
     * Creates a {@code VkPhysicalDeviceShaderFloat16Int8FeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderFloat16} field. */
    @Override
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR shaderFloat16(@NativeType("VkBool32") boolean value) { nshaderFloat16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderInt8} field. */
    @Override
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR shaderInt8(@NativeType("VkBool32") boolean value) { nshaderInt8(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR set(
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
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR set(VkPhysicalDeviceShaderFloat16Int8FeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderFloat16Int8FeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderFloat16Int8FeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderFloat16Int8FeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderFloat16Int8FeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderFloat16Int8FeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderFloat16Int8FeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderFloat16Int8FeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceShaderFloat16Int8Features.Buffer {

        private static final VkPhysicalDeviceShaderFloat16Int8FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderFloat16Int8FeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceShaderFloat16Int8FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderFloat16} field. */
        @Override
        public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer shaderFloat16(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.nshaderFloat16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderInt8} field. */
        @Override
        public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.Buffer shaderInt8(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderFloat16Int8FeaturesKHR.nshaderInt8(address(), value ? 1 : 0); return this; }

    }

}