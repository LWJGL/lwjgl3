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
 * See {@link VkImagePlaneMemoryRequirementsInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImagePlaneMemoryRequirementsInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageAspectFlagBits planeAspect;
 * }</code></pre>
 */
public class VkImagePlaneMemoryRequirementsInfoKHR extends VkImagePlaneMemoryRequirementsInfo {

    /**
     * Creates a {@code VkImagePlaneMemoryRequirementsInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImagePlaneMemoryRequirementsInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkImagePlaneMemoryRequirementsInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO} value to the {@code sType} field. */
    @Override
    public VkImagePlaneMemoryRequirementsInfoKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkImagePlaneMemoryRequirementsInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code planeAspect} field. */
    @Override
    public VkImagePlaneMemoryRequirementsInfoKHR planeAspect(@NativeType("VkImageAspectFlagBits") int value) { nplaneAspect(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkImagePlaneMemoryRequirementsInfoKHR set(
        int sType,
        long pNext,
        int planeAspect
    ) {
        sType(sType);
        pNext(pNext);
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
    public VkImagePlaneMemoryRequirementsInfoKHR set(VkImagePlaneMemoryRequirementsInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImagePlaneMemoryRequirementsInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImagePlaneMemoryRequirementsInfoKHR malloc() {
        return wrap(VkImagePlaneMemoryRequirementsInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImagePlaneMemoryRequirementsInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImagePlaneMemoryRequirementsInfoKHR calloc() {
        return wrap(VkImagePlaneMemoryRequirementsInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImagePlaneMemoryRequirementsInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkImagePlaneMemoryRequirementsInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImagePlaneMemoryRequirementsInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImagePlaneMemoryRequirementsInfoKHR} instance for the specified memory address. */
    public static VkImagePlaneMemoryRequirementsInfoKHR create(long address) {
        return wrap(VkImagePlaneMemoryRequirementsInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImagePlaneMemoryRequirementsInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkImagePlaneMemoryRequirementsInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkImagePlaneMemoryRequirementsInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImagePlaneMemoryRequirementsInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImagePlaneMemoryRequirementsInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImagePlaneMemoryRequirementsInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImagePlaneMemoryRequirementsInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImagePlaneMemoryRequirementsInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImagePlaneMemoryRequirementsInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImagePlaneMemoryRequirementsInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImagePlaneMemoryRequirementsInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImagePlaneMemoryRequirementsInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImagePlaneMemoryRequirementsInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImagePlaneMemoryRequirementsInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImagePlaneMemoryRequirementsInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImagePlaneMemoryRequirementsInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImagePlaneMemoryRequirementsInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImagePlaneMemoryRequirementsInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImagePlaneMemoryRequirementsInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImagePlaneMemoryRequirementsInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImagePlaneMemoryRequirementsInfoKHR malloc(MemoryStack stack) {
        return wrap(VkImagePlaneMemoryRequirementsInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImagePlaneMemoryRequirementsInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImagePlaneMemoryRequirementsInfoKHR calloc(MemoryStack stack) {
        return wrap(VkImagePlaneMemoryRequirementsInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImagePlaneMemoryRequirementsInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImagePlaneMemoryRequirementsInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImagePlaneMemoryRequirementsInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImagePlaneMemoryRequirementsInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkImagePlaneMemoryRequirementsInfoKHR} structs. */
    public static class Buffer extends VkImagePlaneMemoryRequirementsInfo.Buffer {

        private static final VkImagePlaneMemoryRequirementsInfoKHR ELEMENT_FACTORY = VkImagePlaneMemoryRequirementsInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkImagePlaneMemoryRequirementsInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImagePlaneMemoryRequirementsInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkImagePlaneMemoryRequirementsInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkImagePlaneMemoryRequirementsInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkImagePlaneMemoryRequirementsInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO} value to the {@code sType} field. */
        @Override
        public VkImagePlaneMemoryRequirementsInfoKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkImagePlaneMemoryRequirementsInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkImagePlaneMemoryRequirementsInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code planeAspect} field. */
        @Override
        public VkImagePlaneMemoryRequirementsInfoKHR.Buffer planeAspect(@NativeType("VkImageAspectFlagBits") int value) { VkImagePlaneMemoryRequirementsInfoKHR.nplaneAspect(address(), value); return this; }

    }

}