/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * See {@link VkPhysicalDevicePointClippingProperties}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevicePointClippingPropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkPointClippingBehavior pointClippingBehavior;
 * }</code></pre>
 */
public class VkPhysicalDevicePointClippingPropertiesKHR extends VkPhysicalDevicePointClippingProperties {

    /**
     * Creates a {@link VkPhysicalDevicePointClippingPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePointClippingPropertiesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDevicePointClippingPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDevicePointClippingPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDevicePointClippingPropertiesKHR set(
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
    public VkPhysicalDevicePointClippingPropertiesKHR set(VkPhysicalDevicePointClippingPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDevicePointClippingPropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDevicePointClippingPropertiesKHR create(long address) {
        return wrap(VkPhysicalDevicePointClippingPropertiesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePointClippingPropertiesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDevicePointClippingPropertiesKHR.class, address);
    }

    /**
     * Create a {@link VkPhysicalDevicePointClippingPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePointClippingPropertiesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePointClippingPropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePointClippingPropertiesKHR} structs. */
    public static class Buffer extends VkPhysicalDevicePointClippingProperties.Buffer {

        private static final VkPhysicalDevicePointClippingPropertiesKHR ELEMENT_FACTORY = VkPhysicalDevicePointClippingPropertiesKHR.create(-1L);

        /**
         * Creates a new {@link VkPhysicalDevicePointClippingPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePointClippingPropertiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDevicePointClippingPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDevicePointClippingPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePointClippingPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDevicePointClippingPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePointClippingPropertiesKHR.npNext(address(), value); return this; }

    }

}