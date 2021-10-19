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
 * See {@link VkPhysicalDeviceImageFormatInfo2}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceImageFormatInfo2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkFormat format;
 *     VkImageType type;
 *     VkImageTiling tiling;
 *     VkImageUsageFlags usage;
 *     VkImageCreateFlags flags;
 * }</code></pre>
 */
public class VkPhysicalDeviceImageFormatInfo2KHR extends VkPhysicalDeviceImageFormatInfo2 {

    /**
     * Creates a {@code VkPhysicalDeviceImageFormatInfo2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImageFormatInfo2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceImageFormatInfo2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceImageFormatInfo2KHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceImageFormatInfo2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    @Override
    public VkPhysicalDeviceImageFormatInfo2KHR format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    @Override
    public VkPhysicalDeviceImageFormatInfo2KHR type(@NativeType("VkImageType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code tiling} field. */
    @Override
    public VkPhysicalDeviceImageFormatInfo2KHR tiling(@NativeType("VkImageTiling") int value) { ntiling(address(), value); return this; }
    /** Sets the specified value to the {@code usage} field. */
    @Override
    public VkPhysicalDeviceImageFormatInfo2KHR usage(@NativeType("VkImageUsageFlags") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    @Override
    public VkPhysicalDeviceImageFormatInfo2KHR flags(@NativeType("VkImageCreateFlags") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceImageFormatInfo2KHR set(
        int sType,
        long pNext,
        int format,
        int type,
        int tiling,
        int usage,
        int flags
    ) {
        sType(sType);
        pNext(pNext);
        format(format);
        type(type);
        tiling(tiling);
        usage(usage);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceImageFormatInfo2KHR set(VkPhysicalDeviceImageFormatInfo2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImageFormatInfo2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageFormatInfo2KHR malloc() {
        return wrap(VkPhysicalDeviceImageFormatInfo2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceImageFormatInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageFormatInfo2KHR calloc() {
        return wrap(VkPhysicalDeviceImageFormatInfo2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceImageFormatInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImageFormatInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceImageFormatInfo2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImageFormatInfo2KHR} instance for the specified memory address. */
    public static VkPhysicalDeviceImageFormatInfo2KHR create(long address) {
        return wrap(VkPhysicalDeviceImageFormatInfo2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImageFormatInfo2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceImageFormatInfo2KHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceImageFormatInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImageFormatInfo2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2KHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2KHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2KHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2KHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2KHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2KHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2KHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2KHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceImageFormatInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageFormatInfo2KHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceImageFormatInfo2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageFormatInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageFormatInfo2KHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceImageFormatInfo2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImageFormatInfo2KHR} structs. */
    public static class Buffer extends VkPhysicalDeviceImageFormatInfo2.Buffer {

        private static final VkPhysicalDeviceImageFormatInfo2KHR ELEMENT_FACTORY = VkPhysicalDeviceImageFormatInfo2KHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImageFormatInfo2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImageFormatInfo2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceImageFormatInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceImageFormatInfo2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImageFormatInfo2KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceImageFormatInfo2KHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceImageFormatInfo2KHR.Buffer pNext(@NativeType("void const *") long value) { VkPhysicalDeviceImageFormatInfo2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        @Override
        public VkPhysicalDeviceImageFormatInfo2KHR.Buffer format(@NativeType("VkFormat") int value) { VkPhysicalDeviceImageFormatInfo2KHR.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        @Override
        public VkPhysicalDeviceImageFormatInfo2KHR.Buffer type(@NativeType("VkImageType") int value) { VkPhysicalDeviceImageFormatInfo2KHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code tiling} field. */
        @Override
        public VkPhysicalDeviceImageFormatInfo2KHR.Buffer tiling(@NativeType("VkImageTiling") int value) { VkPhysicalDeviceImageFormatInfo2KHR.ntiling(address(), value); return this; }
        /** Sets the specified value to the {@code usage} field. */
        @Override
        public VkPhysicalDeviceImageFormatInfo2KHR.Buffer usage(@NativeType("VkImageUsageFlags") int value) { VkPhysicalDeviceImageFormatInfo2KHR.nusage(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        @Override
        public VkPhysicalDeviceImageFormatInfo2KHR.Buffer flags(@NativeType("VkImageCreateFlags") int value) { VkPhysicalDeviceImageFormatInfo2KHR.nflags(address(), value); return this; }

    }

}