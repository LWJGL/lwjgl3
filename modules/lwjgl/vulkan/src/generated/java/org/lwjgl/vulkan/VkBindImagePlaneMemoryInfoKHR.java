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
 * See {@link VkBindImagePlaneMemoryInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBindImagePlaneMemoryInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageAspectFlagBits planeAspect;
 * }</code></pre>
 */
public class VkBindImagePlaneMemoryInfoKHR extends VkBindImagePlaneMemoryInfo {

    /**
     * Creates a {@code VkBindImagePlaneMemoryInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindImagePlaneMemoryInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkBindImagePlaneMemoryInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO} value to the {@code sType} field. */
    @Override
    public VkBindImagePlaneMemoryInfoKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkBindImagePlaneMemoryInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code planeAspect} field. */
    @Override
    public VkBindImagePlaneMemoryInfoKHR planeAspect(@NativeType("VkImageAspectFlagBits") int value) { nplaneAspect(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkBindImagePlaneMemoryInfoKHR set(
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
    public VkBindImagePlaneMemoryInfoKHR set(VkBindImagePlaneMemoryInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindImagePlaneMemoryInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindImagePlaneMemoryInfoKHR malloc() {
        return wrap(VkBindImagePlaneMemoryInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBindImagePlaneMemoryInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindImagePlaneMemoryInfoKHR calloc() {
        return wrap(VkBindImagePlaneMemoryInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBindImagePlaneMemoryInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkBindImagePlaneMemoryInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBindImagePlaneMemoryInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBindImagePlaneMemoryInfoKHR} instance for the specified memory address. */
    public static VkBindImagePlaneMemoryInfoKHR create(long address) {
        return wrap(VkBindImagePlaneMemoryInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindImagePlaneMemoryInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkBindImagePlaneMemoryInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkBindImagePlaneMemoryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImagePlaneMemoryInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindImagePlaneMemoryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImagePlaneMemoryInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImagePlaneMemoryInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImagePlaneMemoryInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBindImagePlaneMemoryInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindImagePlaneMemoryInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindImagePlaneMemoryInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBindImagePlaneMemoryInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBindImagePlaneMemoryInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBindImagePlaneMemoryInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBindImagePlaneMemoryInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindImagePlaneMemoryInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindImagePlaneMemoryInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindImagePlaneMemoryInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindImagePlaneMemoryInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkBindImagePlaneMemoryInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindImagePlaneMemoryInfoKHR malloc(MemoryStack stack) {
        return wrap(VkBindImagePlaneMemoryInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBindImagePlaneMemoryInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindImagePlaneMemoryInfoKHR calloc(MemoryStack stack) {
        return wrap(VkBindImagePlaneMemoryInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindImagePlaneMemoryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindImagePlaneMemoryInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImagePlaneMemoryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindImagePlaneMemoryInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkBindImagePlaneMemoryInfoKHR} structs. */
    public static class Buffer extends VkBindImagePlaneMemoryInfo.Buffer {

        private static final VkBindImagePlaneMemoryInfoKHR ELEMENT_FACTORY = VkBindImagePlaneMemoryInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkBindImagePlaneMemoryInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindImagePlaneMemoryInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkBindImagePlaneMemoryInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkBindImagePlaneMemoryInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBindImagePlaneMemoryInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO} value to the {@code sType} field. */
        @Override
        public VkBindImagePlaneMemoryInfoKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkBindImagePlaneMemoryInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkBindImagePlaneMemoryInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code planeAspect} field. */
        @Override
        public VkBindImagePlaneMemoryInfoKHR.Buffer planeAspect(@NativeType("VkImageAspectFlagBits") int value) { VkBindImagePlaneMemoryInfoKHR.nplaneAspect(address(), value); return this; }

    }

}