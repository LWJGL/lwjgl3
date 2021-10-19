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
 * See {@link VkPhysicalDeviceExternalBufferInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceExternalBufferInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBufferCreateFlags flags;
 *     VkBufferUsageFlags usage;
 *     VkExternalMemoryHandleTypeFlagBits handleType;
 * }</code></pre>
 */
public class VkPhysicalDeviceExternalBufferInfoKHR extends VkPhysicalDeviceExternalBufferInfo {

    /**
     * Creates a {@code VkPhysicalDeviceExternalBufferInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceExternalBufferInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceExternalBufferInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceExternalBufferInfoKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceExternalBufferInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    @Override
    public VkPhysicalDeviceExternalBufferInfoKHR flags(@NativeType("VkBufferCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code usage} field. */
    @Override
    public VkPhysicalDeviceExternalBufferInfoKHR usage(@NativeType("VkBufferUsageFlags") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@code handleType} field. */
    @Override
    public VkPhysicalDeviceExternalBufferInfoKHR handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceExternalBufferInfoKHR set(
        int sType,
        long pNext,
        int flags,
        int usage,
        int handleType
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        usage(usage);
        handleType(handleType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceExternalBufferInfoKHR set(VkPhysicalDeviceExternalBufferInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceExternalBufferInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExternalBufferInfoKHR malloc() {
        return wrap(VkPhysicalDeviceExternalBufferInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceExternalBufferInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExternalBufferInfoKHR calloc() {
        return wrap(VkPhysicalDeviceExternalBufferInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceExternalBufferInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceExternalBufferInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceExternalBufferInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceExternalBufferInfoKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceExternalBufferInfoKHR create(long address) {
        return wrap(VkPhysicalDeviceExternalBufferInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExternalBufferInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceExternalBufferInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalBufferInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalBufferInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalBufferInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalBufferInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalBufferInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalBufferInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceExternalBufferInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalBufferInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExternalBufferInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalBufferInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalBufferInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalBufferInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalBufferInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalBufferInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalBufferInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalBufferInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalBufferInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceExternalBufferInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExternalBufferInfoKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceExternalBufferInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExternalBufferInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExternalBufferInfoKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceExternalBufferInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalBufferInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalBufferInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalBufferInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalBufferInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceExternalBufferInfoKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceExternalBufferInfo.Buffer {

        private static final VkPhysicalDeviceExternalBufferInfoKHR ELEMENT_FACTORY = VkPhysicalDeviceExternalBufferInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceExternalBufferInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceExternalBufferInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceExternalBufferInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceExternalBufferInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceExternalBufferInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceExternalBufferInfoKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceExternalBufferInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPhysicalDeviceExternalBufferInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        @Override
        public VkPhysicalDeviceExternalBufferInfoKHR.Buffer flags(@NativeType("VkBufferCreateFlags") int value) { VkPhysicalDeviceExternalBufferInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code usage} field. */
        @Override
        public VkPhysicalDeviceExternalBufferInfoKHR.Buffer usage(@NativeType("VkBufferUsageFlags") int value) { VkPhysicalDeviceExternalBufferInfoKHR.nusage(address(), value); return this; }
        /** Sets the specified value to the {@code handleType} field. */
        @Override
        public VkPhysicalDeviceExternalBufferInfoKHR.Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { VkPhysicalDeviceExternalBufferInfoKHR.nhandleType(address(), value); return this; }

    }

}