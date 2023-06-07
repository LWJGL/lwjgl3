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
 * See {@link VkPhysicalDeviceShaderIntegerDotProductProperties}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 integerDotProduct8BitUnsignedAccelerated;
 *     VkBool32 integerDotProduct8BitSignedAccelerated;
 *     VkBool32 integerDotProduct8BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProduct4x8BitPackedUnsignedAccelerated;
 *     VkBool32 integerDotProduct4x8BitPackedSignedAccelerated;
 *     VkBool32 integerDotProduct4x8BitPackedMixedSignednessAccelerated;
 *     VkBool32 integerDotProduct16BitUnsignedAccelerated;
 *     VkBool32 integerDotProduct16BitSignedAccelerated;
 *     VkBool32 integerDotProduct16BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProduct32BitUnsignedAccelerated;
 *     VkBool32 integerDotProduct32BitSignedAccelerated;
 *     VkBool32 integerDotProduct32BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProduct64BitUnsignedAccelerated;
 *     VkBool32 integerDotProduct64BitSignedAccelerated;
 *     VkBool32 integerDotProduct64BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating8BitUnsignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating8BitSignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating16BitUnsignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating16BitSignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating32BitUnsignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating32BitSignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating64BitUnsignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating64BitSignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated;
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR extends VkPhysicalDeviceShaderIntegerDotProductProperties {

    protected VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR set(
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
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR set(VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR malloc() {
        return new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR calloc() {
        return new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR create(long address) {
        return new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer {

        private static final VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.npNext(address(), value); return this; }

    }

}