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
 * See {@link VkFramebufferAttachmentImageInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkFramebufferAttachmentImageInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageCreateFlags flags;
 *     VkImageUsageFlags usage;
 *     uint32_t width;
 *     uint32_t height;
 *     uint32_t layerCount;
 *     uint32_t viewFormatCount;
 *     VkFormat const * pViewFormats;
 * }</code></pre>
 */
public class VkFramebufferAttachmentImageInfoKHR extends VkFramebufferAttachmentImageInfo {

    /**
     * Creates a {@code VkFramebufferAttachmentImageInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFramebufferAttachmentImageInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkFramebufferAttachmentImageInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO} value to the {@code sType} field. */
    @Override
    public VkFramebufferAttachmentImageInfoKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkFramebufferAttachmentImageInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    @Override
    public VkFramebufferAttachmentImageInfoKHR flags(@NativeType("VkImageCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code usage} field. */
    @Override
    public VkFramebufferAttachmentImageInfoKHR usage(@NativeType("VkImageUsageFlags") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    @Override
    public VkFramebufferAttachmentImageInfoKHR width(@NativeType("uint32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    @Override
    public VkFramebufferAttachmentImageInfoKHR height(@NativeType("uint32_t") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code layerCount} field. */
    @Override
    public VkFramebufferAttachmentImageInfoKHR layerCount(@NativeType("uint32_t") int value) { nlayerCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pViewFormats} field. */
    @Override
    public VkFramebufferAttachmentImageInfoKHR pViewFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { npViewFormats(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkFramebufferAttachmentImageInfoKHR set(
        int sType,
        long pNext,
        int flags,
        int usage,
        int width,
        int height,
        int layerCount,
        @Nullable IntBuffer pViewFormats
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        usage(usage);
        width(width);
        height(height);
        layerCount(layerCount);
        pViewFormats(pViewFormats);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkFramebufferAttachmentImageInfoKHR set(VkFramebufferAttachmentImageInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFramebufferAttachmentImageInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFramebufferAttachmentImageInfoKHR malloc() {
        return wrap(VkFramebufferAttachmentImageInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkFramebufferAttachmentImageInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFramebufferAttachmentImageInfoKHR calloc() {
        return wrap(VkFramebufferAttachmentImageInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkFramebufferAttachmentImageInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkFramebufferAttachmentImageInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkFramebufferAttachmentImageInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkFramebufferAttachmentImageInfoKHR} instance for the specified memory address. */
    public static VkFramebufferAttachmentImageInfoKHR create(long address) {
        return wrap(VkFramebufferAttachmentImageInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFramebufferAttachmentImageInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkFramebufferAttachmentImageInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkFramebufferAttachmentImageInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFramebufferAttachmentImageInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkFramebufferAttachmentImageInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkFramebufferAttachmentImageInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkFramebufferAttachmentImageInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkFramebufferAttachmentImageInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFramebufferAttachmentImageInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFramebufferAttachmentImageInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFramebufferAttachmentImageInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFramebufferAttachmentImageInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkFramebufferAttachmentImageInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferAttachmentImageInfoKHR malloc(MemoryStack stack) {
        return wrap(VkFramebufferAttachmentImageInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkFramebufferAttachmentImageInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferAttachmentImageInfoKHR calloc(MemoryStack stack) {
        return wrap(VkFramebufferAttachmentImageInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkFramebufferAttachmentImageInfoKHR} structs. */
    public static class Buffer extends VkFramebufferAttachmentImageInfo.Buffer {

        private static final VkFramebufferAttachmentImageInfoKHR ELEMENT_FACTORY = VkFramebufferAttachmentImageInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkFramebufferAttachmentImageInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFramebufferAttachmentImageInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkFramebufferAttachmentImageInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkFramebufferAttachmentImageInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkFramebufferAttachmentImageInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO} value to the {@code sType} field. */
        @Override
        public VkFramebufferAttachmentImageInfoKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkFramebufferAttachmentImageInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkFramebufferAttachmentImageInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        @Override
        public VkFramebufferAttachmentImageInfoKHR.Buffer flags(@NativeType("VkImageCreateFlags") int value) { VkFramebufferAttachmentImageInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code usage} field. */
        @Override
        public VkFramebufferAttachmentImageInfoKHR.Buffer usage(@NativeType("VkImageUsageFlags") int value) { VkFramebufferAttachmentImageInfoKHR.nusage(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        @Override
        public VkFramebufferAttachmentImageInfoKHR.Buffer width(@NativeType("uint32_t") int value) { VkFramebufferAttachmentImageInfoKHR.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        @Override
        public VkFramebufferAttachmentImageInfoKHR.Buffer height(@NativeType("uint32_t") int value) { VkFramebufferAttachmentImageInfoKHR.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code layerCount} field. */
        @Override
        public VkFramebufferAttachmentImageInfoKHR.Buffer layerCount(@NativeType("uint32_t") int value) { VkFramebufferAttachmentImageInfoKHR.nlayerCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pViewFormats} field. */
        @Override
        public VkFramebufferAttachmentImageInfoKHR.Buffer pViewFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { VkFramebufferAttachmentImageInfoKHR.npViewFormats(address(), value); return this; }

    }

}