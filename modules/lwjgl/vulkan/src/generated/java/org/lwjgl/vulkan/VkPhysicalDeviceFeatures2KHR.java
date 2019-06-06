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
 * See {@link VkPhysicalDeviceFeatures2}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFeatures2KHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkPhysicalDeviceFeatures VkPhysicalDeviceFeatures} features;
 * }</code></pre>
 */
public class VkPhysicalDeviceFeatures2KHR extends VkPhysicalDeviceFeatures2 {

    /**
     * Creates a {@code VkPhysicalDeviceFeatures2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFeatures2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceFeatures2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceFeatures2KHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkPhysicalDeviceFeatures} to the {@code features} field. */
    @Override
    public VkPhysicalDeviceFeatures2KHR features(VkPhysicalDeviceFeatures value) { nfeatures(address(), value); return this; }
    /** Passes the {@code features} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkPhysicalDeviceFeatures2KHR features(java.util.function.Consumer<VkPhysicalDeviceFeatures> consumer) { consumer.accept(features()); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceFeatures2KHR set(
        int sType,
        long pNext,
        VkPhysicalDeviceFeatures features
    ) {
        sType(sType);
        pNext(pNext);
        features(features);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFeatures2KHR set(VkPhysicalDeviceFeatures2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFeatures2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFeatures2KHR malloc() {
        return wrap(VkPhysicalDeviceFeatures2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFeatures2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFeatures2KHR calloc() {
        return wrap(VkPhysicalDeviceFeatures2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFeatures2KHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFeatures2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceFeatures2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFeatures2KHR} instance for the specified memory address. */
    public static VkPhysicalDeviceFeatures2KHR create(long address) {
        return wrap(VkPhysicalDeviceFeatures2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFeatures2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceFeatures2KHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceFeatures2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFeatures2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFeatures2KHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceFeatures2KHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceFeatures2KHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceFeatures2KHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFeatures2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFeatures2KHR mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFeatures2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFeatures2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFeatures2KHR callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFeatures2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2KHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2KHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2KHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2KHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFeatures2KHR} structs. */
    public static class Buffer extends VkPhysicalDeviceFeatures2.Buffer {

        private static final VkPhysicalDeviceFeatures2KHR ELEMENT_FACTORY = VkPhysicalDeviceFeatures2KHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFeatures2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFeatures2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceFeatures2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceFeatures2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFeatures2KHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceFeatures2KHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFeatures2KHR.npNext(address(), value); return this; }
        /** Copies the specified {@link VkPhysicalDeviceFeatures} to the {@code features} field. */
        @Override
        public VkPhysicalDeviceFeatures2KHR.Buffer features(VkPhysicalDeviceFeatures value) { VkPhysicalDeviceFeatures2KHR.nfeatures(address(), value); return this; }
        /** Passes the {@code features} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkPhysicalDeviceFeatures2KHR.Buffer features(java.util.function.Consumer<VkPhysicalDeviceFeatures> consumer) { consumer.accept(features()); return this; }

    }

}