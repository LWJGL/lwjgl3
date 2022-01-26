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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkDeviceBufferMemoryRequirements}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceBufferMemoryRequirementsKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkBufferCreateInfo VkBufferCreateInfo} const * pCreateInfo;
 * }</code></pre>
 */
public class VkDeviceBufferMemoryRequirementsKHR extends VkDeviceBufferMemoryRequirements {

    /**
     * Creates a {@code VkDeviceBufferMemoryRequirementsKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceBufferMemoryRequirementsKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkDeviceBufferMemoryRequirementsKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS} value to the {@code sType} field. */
    @Override
    public VkDeviceBufferMemoryRequirementsKHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkDeviceBufferMemoryRequirementsKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkBufferCreateInfo} to the {@code pCreateInfo} field. */
    @Override
    public VkDeviceBufferMemoryRequirementsKHR pCreateInfo(@NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo value) { npCreateInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkDeviceBufferMemoryRequirementsKHR set(
        int sType,
        long pNext,
        VkBufferCreateInfo pCreateInfo
    ) {
        sType(sType);
        pNext(pNext);
        pCreateInfo(pCreateInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceBufferMemoryRequirementsKHR set(VkDeviceBufferMemoryRequirementsKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceBufferMemoryRequirementsKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceBufferMemoryRequirementsKHR malloc() {
        return wrap(VkDeviceBufferMemoryRequirementsKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceBufferMemoryRequirementsKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceBufferMemoryRequirementsKHR calloc() {
        return wrap(VkDeviceBufferMemoryRequirementsKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceBufferMemoryRequirementsKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceBufferMemoryRequirementsKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceBufferMemoryRequirementsKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceBufferMemoryRequirementsKHR} instance for the specified memory address. */
    public static VkDeviceBufferMemoryRequirementsKHR create(long address) {
        return wrap(VkDeviceBufferMemoryRequirementsKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceBufferMemoryRequirementsKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceBufferMemoryRequirementsKHR.class, address);
    }

    /**
     * Returns a new {@link VkDeviceBufferMemoryRequirementsKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceBufferMemoryRequirementsKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceBufferMemoryRequirementsKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceBufferMemoryRequirementsKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceBufferMemoryRequirementsKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceBufferMemoryRequirementsKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceBufferMemoryRequirementsKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceBufferMemoryRequirementsKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceBufferMemoryRequirementsKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceBufferMemoryRequirementsKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceBufferMemoryRequirementsKHR malloc(MemoryStack stack) {
        return wrap(VkDeviceBufferMemoryRequirementsKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceBufferMemoryRequirementsKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceBufferMemoryRequirementsKHR calloc(MemoryStack stack) {
        return wrap(VkDeviceBufferMemoryRequirementsKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceBufferMemoryRequirementsKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceBufferMemoryRequirementsKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceBufferMemoryRequirementsKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceBufferMemoryRequirementsKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDeviceBufferMemoryRequirementsKHR} structs. */
    public static class Buffer extends VkDeviceBufferMemoryRequirements.Buffer {

        private static final VkDeviceBufferMemoryRequirementsKHR ELEMENT_FACTORY = VkDeviceBufferMemoryRequirementsKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceBufferMemoryRequirementsKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceBufferMemoryRequirementsKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceBufferMemoryRequirementsKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkDeviceBufferMemoryRequirementsKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceBufferMemoryRequirementsKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS} value to the {@code sType} field. */
        @Override
        public VkDeviceBufferMemoryRequirementsKHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkDeviceBufferMemoryRequirementsKHR.Buffer pNext(@NativeType("void const *") long value) { VkDeviceBufferMemoryRequirementsKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkBufferCreateInfo} to the {@code pCreateInfo} field. */
        @Override
        public VkDeviceBufferMemoryRequirementsKHR.Buffer pCreateInfo(@NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo value) { VkDeviceBufferMemoryRequirementsKHR.npCreateInfo(address(), value); return this; }

    }

}