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
 * See {@link VkExternalMemoryProperties}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExternalMemoryPropertiesKHR {
 *     VkExternalMemoryFeatureFlags externalMemoryFeatures;
 *     VkExternalMemoryHandleTypeFlags exportFromImportedHandleTypes;
 *     VkExternalMemoryHandleTypeFlags compatibleHandleTypes;
 * }</code></pre>
 */
public class VkExternalMemoryPropertiesKHR extends VkExternalMemoryProperties {

    protected VkExternalMemoryPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExternalMemoryPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkExternalMemoryPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkExternalMemoryPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalMemoryPropertiesKHR(ByteBuffer container) {
        super(container);
    }

    // -----------------------------------

    /** Returns a new {@code VkExternalMemoryPropertiesKHR} instance for the specified memory address. */
    public static VkExternalMemoryPropertiesKHR create(long address) {
        return new VkExternalMemoryPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalMemoryPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkExternalMemoryPropertiesKHR(address, null);
    }

    /**
     * Create a {@link VkExternalMemoryPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalMemoryPropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** An array of {@link VkExternalMemoryPropertiesKHR} structs. */
    public static class Buffer extends VkExternalMemoryProperties.Buffer {

        private static final VkExternalMemoryPropertiesKHR ELEMENT_FACTORY = VkExternalMemoryPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkExternalMemoryPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalMemoryPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExternalMemoryPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

    }

}