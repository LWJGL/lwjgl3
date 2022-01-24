/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Information about existing {@code VmaAllocator} object.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaAllocatorInfo {
 *     VkInstance {@link #instance};
 *     VkPhysicalDevice {@link #physicalDevice};
 *     VkDevice {@link #device};
 * }</code></pre>
 */
public class VmaAllocatorInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INSTANCE,
        PHYSICALDEVICE,
        DEVICE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INSTANCE = layout.offsetof(0);
        PHYSICALDEVICE = layout.offsetof(1);
        DEVICE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VmaAllocatorInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaAllocatorInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * Handle to Vulkan instance object.
     * 
     * <p>This is the same value as has been passed through {@link VmaAllocatorCreateInfo}{@code ::instance}.</p>
     */
    @NativeType("VkInstance")
    public long instance() { return ninstance(address()); }
    /**
     * Handle to Vulkan physical device object.
     * 
     * <p>This is the same value as has been passed through {@link VmaAllocatorCreateInfo}{@code ::physicalDevice}.</p>
     */
    @NativeType("VkPhysicalDevice")
    public long physicalDevice() { return nphysicalDevice(address()); }
    /**
     * Handle to Vulkan device object.
     * 
     * <p>This is the same value as has been passed through {@link VmaAllocatorCreateInfo}{@code ::device}.</p>
     */
    @NativeType("VkDevice")
    public long device() { return ndevice(address()); }

    // -----------------------------------

    /** Returns a new {@code VmaAllocatorInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaAllocatorInfo malloc() {
        return wrap(VmaAllocatorInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VmaAllocatorInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaAllocatorInfo calloc() {
        return wrap(VmaAllocatorInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VmaAllocatorInfo} instance allocated with {@link BufferUtils}. */
    public static VmaAllocatorInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VmaAllocatorInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VmaAllocatorInfo} instance for the specified memory address. */
    public static VmaAllocatorInfo create(long address) {
        return wrap(VmaAllocatorInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaAllocatorInfo createSafe(long address) {
        return address == NULL ? null : wrap(VmaAllocatorInfo.class, address);
    }

    /**
     * Returns a new {@link VmaAllocatorInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocatorInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaAllocatorInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocatorInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaAllocatorInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocatorInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VmaAllocatorInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaAllocatorInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaAllocatorInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VmaAllocatorInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaAllocatorInfo malloc(MemoryStack stack) {
        return wrap(VmaAllocatorInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VmaAllocatorInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaAllocatorInfo calloc(MemoryStack stack) {
        return wrap(VmaAllocatorInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaAllocatorInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaAllocatorInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaAllocatorInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaAllocatorInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #instance}. */
    public static long ninstance(long struct) { return memGetAddress(struct + VmaAllocatorInfo.INSTANCE); }
    /** Unsafe version of {@link #physicalDevice}. */
    public static long nphysicalDevice(long struct) { return memGetAddress(struct + VmaAllocatorInfo.PHYSICALDEVICE); }
    /** Unsafe version of {@link #device}. */
    public static long ndevice(long struct) { return memGetAddress(struct + VmaAllocatorInfo.DEVICE); }

    // -----------------------------------

    /** An array of {@link VmaAllocatorInfo} structs. */
    public static class Buffer extends StructBuffer<VmaAllocatorInfo, Buffer> implements NativeResource {

        private static final VmaAllocatorInfo ELEMENT_FACTORY = VmaAllocatorInfo.create(-1L);

        /**
         * Creates a new {@code VmaAllocatorInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaAllocatorInfo#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
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
        protected VmaAllocatorInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VmaAllocatorInfo#instance} field. */
        @NativeType("VkInstance")
        public long instance() { return VmaAllocatorInfo.ninstance(address()); }
        /** @return the value of the {@link VmaAllocatorInfo#physicalDevice} field. */
        @NativeType("VkPhysicalDevice")
        public long physicalDevice() { return VmaAllocatorInfo.nphysicalDevice(address()); }
        /** @return the value of the {@link VmaAllocatorInfo#device} field. */
        @NativeType("VkDevice")
        public long device() { return VmaAllocatorInfo.ndevice(address()); }

    }

}