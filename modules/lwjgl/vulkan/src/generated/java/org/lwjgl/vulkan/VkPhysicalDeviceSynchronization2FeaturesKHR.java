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
 * See {@link VkPhysicalDeviceSynchronization2Features}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSynchronization2FeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 synchronization2;
 * }</code></pre>
 */
public class VkPhysicalDeviceSynchronization2FeaturesKHR extends VkPhysicalDeviceSynchronization2Features {

    protected VkPhysicalDeviceSynchronization2FeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceSynchronization2FeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceSynchronization2FeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSynchronization2FeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSynchronization2FeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceSynchronization2FeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceSynchronization2FeaturesKHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceSynchronization2FeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code synchronization2} field. */
    @Override
    public VkPhysicalDeviceSynchronization2FeaturesKHR synchronization2(@NativeType("VkBool32") boolean value) { nsynchronization2(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceSynchronization2FeaturesKHR set(
        int sType,
        long pNext,
        boolean synchronization2
    ) {
        sType(sType);
        pNext(pNext);
        synchronization2(synchronization2);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSynchronization2FeaturesKHR set(VkPhysicalDeviceSynchronization2FeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSynchronization2FeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSynchronization2FeaturesKHR malloc() {
        return new VkPhysicalDeviceSynchronization2FeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSynchronization2FeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSynchronization2FeaturesKHR calloc() {
        return new VkPhysicalDeviceSynchronization2FeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSynchronization2FeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSynchronization2FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSynchronization2FeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSynchronization2FeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceSynchronization2FeaturesKHR create(long address) {
        return new VkPhysicalDeviceSynchronization2FeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceSynchronization2FeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceSynchronization2FeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSynchronization2FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSynchronization2FeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSynchronization2FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSynchronization2FeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSynchronization2FeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSynchronization2FeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceSynchronization2FeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSynchronization2FeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceSynchronization2FeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSynchronization2FeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSynchronization2FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSynchronization2FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSynchronization2FeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSynchronization2FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSynchronization2FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSynchronization2FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSynchronization2FeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSynchronization2FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSynchronization2FeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSynchronization2FeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceSynchronization2Features.Buffer {

        private static final VkPhysicalDeviceSynchronization2FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceSynchronization2FeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSynchronization2FeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSynchronization2FeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceSynchronization2FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceSynchronization2FeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSynchronization2FeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceSynchronization2FeaturesKHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceSynchronization2FeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSynchronization2FeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code synchronization2} field. */
        @Override
        public VkPhysicalDeviceSynchronization2FeaturesKHR.Buffer synchronization2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceSynchronization2FeaturesKHR.nsynchronization2(address(), value ? 1 : 0); return this; }

    }

}