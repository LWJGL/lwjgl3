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
 * See {@link VkResolveImageInfo2}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkResolveImageInfo2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImage srcImage;
 *     VkImageLayout srcImageLayout;
 *     VkImage dstImage;
 *     VkImageLayout dstImageLayout;
 *     uint32_t regionCount;
 *     {@link VkImageResolve2 VkImageResolve2} const * pRegions;
 * }</code></pre>
 */
public class VkResolveImageInfo2KHR extends VkResolveImageInfo2 {

    /**
     * Creates a {@code VkResolveImageInfo2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkResolveImageInfo2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkResolveImageInfo2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2 STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2} value to the {@code sType} field. */
    @Override
    public VkResolveImageInfo2KHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkResolveImageInfo2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcImage} field. */
    @Override
    public VkResolveImageInfo2KHR srcImage(@NativeType("VkImage") long value) { nsrcImage(address(), value); return this; }
    /** Sets the specified value to the {@code srcImageLayout} field. */
    @Override
    public VkResolveImageInfo2KHR srcImageLayout(@NativeType("VkImageLayout") int value) { nsrcImageLayout(address(), value); return this; }
    /** Sets the specified value to the {@code dstImage} field. */
    @Override
    public VkResolveImageInfo2KHR dstImage(@NativeType("VkImage") long value) { ndstImage(address(), value); return this; }
    /** Sets the specified value to the {@code dstImageLayout} field. */
    @Override
    public VkResolveImageInfo2KHR dstImageLayout(@NativeType("VkImageLayout") int value) { ndstImageLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageResolve2.Buffer} to the {@code pRegions} field. */
    @Override
    public VkResolveImageInfo2KHR pRegions(@NativeType("VkImageResolve2 const *") VkImageResolve2.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkResolveImageInfo2KHR set(
        int sType,
        long pNext,
        long srcImage,
        int srcImageLayout,
        long dstImage,
        int dstImageLayout,
        VkImageResolve2.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        srcImage(srcImage);
        srcImageLayout(srcImageLayout);
        dstImage(dstImage);
        dstImageLayout(dstImageLayout);
        pRegions(pRegions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkResolveImageInfo2KHR set(VkResolveImageInfo2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkResolveImageInfo2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkResolveImageInfo2KHR malloc() {
        return wrap(VkResolveImageInfo2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkResolveImageInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkResolveImageInfo2KHR calloc() {
        return wrap(VkResolveImageInfo2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkResolveImageInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkResolveImageInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkResolveImageInfo2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkResolveImageInfo2KHR} instance for the specified memory address. */
    public static VkResolveImageInfo2KHR create(long address) {
        return wrap(VkResolveImageInfo2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkResolveImageInfo2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkResolveImageInfo2KHR.class, address);
    }

    /**
     * Returns a new {@link VkResolveImageInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkResolveImageInfo2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkResolveImageInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkResolveImageInfo2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkResolveImageInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkResolveImageInfo2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkResolveImageInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkResolveImageInfo2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkResolveImageInfo2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkResolveImageInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkResolveImageInfo2KHR malloc(MemoryStack stack) {
        return wrap(VkResolveImageInfo2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkResolveImageInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkResolveImageInfo2KHR calloc(MemoryStack stack) {
        return wrap(VkResolveImageInfo2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkResolveImageInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkResolveImageInfo2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkResolveImageInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkResolveImageInfo2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkResolveImageInfo2KHR} structs. */
    public static class Buffer extends VkResolveImageInfo2.Buffer {

        private static final VkResolveImageInfo2KHR ELEMENT_FACTORY = VkResolveImageInfo2KHR.create(-1L);

        /**
         * Creates a new {@code VkResolveImageInfo2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkResolveImageInfo2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkResolveImageInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkResolveImageInfo2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkResolveImageInfo2KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2 STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2} value to the {@code sType} field. */
        @Override
        public VkResolveImageInfo2KHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkResolveImageInfo2KHR.Buffer pNext(@NativeType("void const *") long value) { VkResolveImageInfo2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcImage} field. */
        @Override
        public VkResolveImageInfo2KHR.Buffer srcImage(@NativeType("VkImage") long value) { VkResolveImageInfo2KHR.nsrcImage(address(), value); return this; }
        /** Sets the specified value to the {@code srcImageLayout} field. */
        @Override
        public VkResolveImageInfo2KHR.Buffer srcImageLayout(@NativeType("VkImageLayout") int value) { VkResolveImageInfo2KHR.nsrcImageLayout(address(), value); return this; }
        /** Sets the specified value to the {@code dstImage} field. */
        @Override
        public VkResolveImageInfo2KHR.Buffer dstImage(@NativeType("VkImage") long value) { VkResolveImageInfo2KHR.ndstImage(address(), value); return this; }
        /** Sets the specified value to the {@code dstImageLayout} field. */
        @Override
        public VkResolveImageInfo2KHR.Buffer dstImageLayout(@NativeType("VkImageLayout") int value) { VkResolveImageInfo2KHR.ndstImageLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageResolve2.Buffer} to the {@code pRegions} field. */
        @Override
        public VkResolveImageInfo2KHR.Buffer pRegions(@NativeType("VkImageResolve2 const *") VkImageResolve2.Buffer value) { VkResolveImageInfo2KHR.npRegions(address(), value); return this; }

    }

}