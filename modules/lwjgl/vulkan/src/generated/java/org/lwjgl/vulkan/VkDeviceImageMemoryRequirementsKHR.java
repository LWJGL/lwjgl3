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
 * See {@link VkDeviceImageMemoryRequirements}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceImageMemoryRequirementsKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkImageCreateInfo VkImageCreateInfo} const * pCreateInfo;
 *     VkImageAspectFlagBits planeAspect;
 * }</code></pre>
 */
public class VkDeviceImageMemoryRequirementsKHR extends VkDeviceImageMemoryRequirements {

    /**
     * Creates a {@code VkDeviceImageMemoryRequirementsKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceImageMemoryRequirementsKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkDeviceImageMemoryRequirementsKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS} value to the {@code sType} field. */
    @Override
    public VkDeviceImageMemoryRequirementsKHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkDeviceImageMemoryRequirementsKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageCreateInfo} to the {@code pCreateInfo} field. */
    @Override
    public VkDeviceImageMemoryRequirementsKHR pCreateInfo(@NativeType("VkImageCreateInfo const *") VkImageCreateInfo value) { npCreateInfo(address(), value); return this; }
    /** Sets the specified value to the {@code planeAspect} field. */
    @Override
    public VkDeviceImageMemoryRequirementsKHR planeAspect(@NativeType("VkImageAspectFlagBits") int value) { nplaneAspect(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkDeviceImageMemoryRequirementsKHR set(
        int sType,
        long pNext,
        VkImageCreateInfo pCreateInfo,
        int planeAspect
    ) {
        sType(sType);
        pNext(pNext);
        pCreateInfo(pCreateInfo);
        planeAspect(planeAspect);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceImageMemoryRequirementsKHR set(VkDeviceImageMemoryRequirementsKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceImageMemoryRequirementsKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceImageMemoryRequirementsKHR malloc() {
        return wrap(VkDeviceImageMemoryRequirementsKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceImageMemoryRequirementsKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceImageMemoryRequirementsKHR calloc() {
        return wrap(VkDeviceImageMemoryRequirementsKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceImageMemoryRequirementsKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceImageMemoryRequirementsKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceImageMemoryRequirementsKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceImageMemoryRequirementsKHR} instance for the specified memory address. */
    public static VkDeviceImageMemoryRequirementsKHR create(long address) {
        return wrap(VkDeviceImageMemoryRequirementsKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceImageMemoryRequirementsKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceImageMemoryRequirementsKHR.class, address);
    }

    /**
     * Returns a new {@link VkDeviceImageMemoryRequirementsKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageMemoryRequirementsKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceImageMemoryRequirementsKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageMemoryRequirementsKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceImageMemoryRequirementsKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageMemoryRequirementsKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceImageMemoryRequirementsKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageMemoryRequirementsKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceImageMemoryRequirementsKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceImageMemoryRequirementsKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceImageMemoryRequirementsKHR malloc(MemoryStack stack) {
        return wrap(VkDeviceImageMemoryRequirementsKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceImageMemoryRequirementsKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceImageMemoryRequirementsKHR calloc(MemoryStack stack) {
        return wrap(VkDeviceImageMemoryRequirementsKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceImageMemoryRequirementsKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageMemoryRequirementsKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceImageMemoryRequirementsKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageMemoryRequirementsKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDeviceImageMemoryRequirementsKHR} structs. */
    public static class Buffer extends VkDeviceImageMemoryRequirements.Buffer {

        private static final VkDeviceImageMemoryRequirementsKHR ELEMENT_FACTORY = VkDeviceImageMemoryRequirementsKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceImageMemoryRequirementsKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceImageMemoryRequirementsKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceImageMemoryRequirementsKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkDeviceImageMemoryRequirementsKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceImageMemoryRequirementsKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS} value to the {@code sType} field. */
        @Override
        public VkDeviceImageMemoryRequirementsKHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkDeviceImageMemoryRequirementsKHR.Buffer pNext(@NativeType("void const *") long value) { VkDeviceImageMemoryRequirementsKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageCreateInfo} to the {@code pCreateInfo} field. */
        @Override
        public VkDeviceImageMemoryRequirementsKHR.Buffer pCreateInfo(@NativeType("VkImageCreateInfo const *") VkImageCreateInfo value) { VkDeviceImageMemoryRequirementsKHR.npCreateInfo(address(), value); return this; }
        /** Sets the specified value to the {@code planeAspect} field. */
        @Override
        public VkDeviceImageMemoryRequirementsKHR.Buffer planeAspect(@NativeType("VkImageAspectFlagBits") int value) { VkDeviceImageMemoryRequirementsKHR.nplaneAspect(address(), value); return this; }

    }

}