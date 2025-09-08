/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.VK10.*;

/**
 * <pre><code>
 * struct VkPhysicalDeviceMemoryProperties {
 *     uint32_t memoryTypeCount;
 *     {@link VkMemoryType VkMemoryType} memoryTypes[VK_MAX_MEMORY_TYPES];
 *     uint32_t memoryHeapCount;
 *     {@link VkMemoryHeap VkMemoryHeap} memoryHeaps[VK_MAX_MEMORY_HEAPS];
 * }</code></pre>
 */
public class VkPhysicalDeviceMemoryProperties extends Struct<VkPhysicalDeviceMemoryProperties> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MEMORYTYPECOUNT,
        MEMORYTYPES,
        MEMORYHEAPCOUNT,
        MEMORYHEAPS;

    static {
        Layout layout = __struct(
            __member(4),
            __array(VkMemoryType.SIZEOF, VkMemoryType.ALIGNOF, VK_MAX_MEMORY_TYPES),
            __member(4),
            __array(VkMemoryHeap.SIZEOF, VkMemoryHeap.ALIGNOF, VK_MAX_MEMORY_HEAPS)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MEMORYTYPECOUNT = layout.offsetof(0);
        MEMORYTYPES = layout.offsetof(1);
        MEMORYHEAPCOUNT = layout.offsetof(2);
        MEMORYHEAPS = layout.offsetof(3);
    }

    protected VkPhysicalDeviceMemoryProperties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMemoryProperties create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMemoryProperties(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMemoryProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMemoryProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code memoryTypeCount} field. */
    @NativeType("uint32_t")
    public int memoryTypeCount() { return nmemoryTypeCount(address()); }
    /** @return a {@link VkMemoryType}.Buffer view of the {@code memoryTypes} field. */
    @NativeType("VkMemoryType[VK_MAX_MEMORY_TYPES]")
    public VkMemoryType.Buffer memoryTypes() { return nmemoryTypes(address()); }
    /** @return a {@link VkMemoryType} view of the struct at the specified index of the {@code memoryTypes} field. */
    public VkMemoryType memoryTypes(int index) { return nmemoryTypes(address(), index); }
    /** @return the value of the {@code memoryHeapCount} field. */
    @NativeType("uint32_t")
    public int memoryHeapCount() { return nmemoryHeapCount(address()); }
    /** @return a {@link VkMemoryHeap}.Buffer view of the {@code memoryHeaps} field. */
    @NativeType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]")
    public VkMemoryHeap.Buffer memoryHeaps() { return nmemoryHeaps(address()); }
    /** @return a {@link VkMemoryHeap} view of the struct at the specified index of the {@code memoryHeaps} field. */
    public VkMemoryHeap memoryHeaps(int index) { return nmemoryHeaps(address(), index); }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMemoryProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMemoryProperties malloc() {
        return new VkPhysicalDeviceMemoryProperties(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMemoryProperties calloc() {
        return new VkPhysicalDeviceMemoryProperties(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMemoryProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMemoryProperties(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceMemoryProperties create(long address) {
        return new VkPhysicalDeviceMemoryProperties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceMemoryProperties createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMemoryProperties(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryProperties.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryProperties.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMemoryProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryProperties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceMemoryProperties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryProperties mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryProperties callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryProperties mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryProperties callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryProperties.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryProperties.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryProperties.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryProperties.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceMemoryProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMemoryProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMemoryProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMemoryProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #memoryTypeCount}. */
    public static int nmemoryTypeCount(long struct) { return memGetInt(struct + VkPhysicalDeviceMemoryProperties.MEMORYTYPECOUNT); }
    /** Unsafe version of {@link #memoryTypes}. */
    public static VkMemoryType.Buffer nmemoryTypes(long struct) { return VkMemoryType.create(struct + VkPhysicalDeviceMemoryProperties.MEMORYTYPES, nmemoryTypeCount(struct)); }
    /** Unsafe version of {@link #memoryTypes(int) memoryTypes}. */
    public static VkMemoryType nmemoryTypes(long struct, int index) {
        return VkMemoryType.create(struct + VkPhysicalDeviceMemoryProperties.MEMORYTYPES + check(index, nmemoryTypeCount(struct)) * VkMemoryType.SIZEOF);
    }
    /** Unsafe version of {@link #memoryHeapCount}. */
    public static int nmemoryHeapCount(long struct) { return memGetInt(struct + VkPhysicalDeviceMemoryProperties.MEMORYHEAPCOUNT); }
    /** Unsafe version of {@link #memoryHeaps}. */
    public static VkMemoryHeap.Buffer nmemoryHeaps(long struct) { return VkMemoryHeap.create(struct + VkPhysicalDeviceMemoryProperties.MEMORYHEAPS, nmemoryHeapCount(struct)); }
    /** Unsafe version of {@link #memoryHeaps(int) memoryHeaps}. */
    public static VkMemoryHeap nmemoryHeaps(long struct, int index) {
        return VkMemoryHeap.create(struct + VkPhysicalDeviceMemoryProperties.MEMORYHEAPS + check(index, nmemoryHeapCount(struct)) * VkMemoryHeap.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMemoryProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMemoryProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMemoryProperties ELEMENT_FACTORY = VkPhysicalDeviceMemoryProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMemoryProperties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMemoryProperties#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPhysicalDeviceMemoryProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code memoryTypeCount} field. */
        @NativeType("uint32_t")
        public int memoryTypeCount() { return VkPhysicalDeviceMemoryProperties.nmemoryTypeCount(address()); }
        /** @return a {@link VkMemoryType}.Buffer view of the {@code memoryTypes} field. */
        @NativeType("VkMemoryType[VK_MAX_MEMORY_TYPES]")
        public VkMemoryType.Buffer memoryTypes() { return VkPhysicalDeviceMemoryProperties.nmemoryTypes(address()); }
        /** @return a {@link VkMemoryType} view of the struct at the specified index of the {@code memoryTypes} field. */
        public VkMemoryType memoryTypes(int index) { return VkPhysicalDeviceMemoryProperties.nmemoryTypes(address(), index); }
        /** @return the value of the {@code memoryHeapCount} field. */
        @NativeType("uint32_t")
        public int memoryHeapCount() { return VkPhysicalDeviceMemoryProperties.nmemoryHeapCount(address()); }
        /** @return a {@link VkMemoryHeap}.Buffer view of the {@code memoryHeaps} field. */
        @NativeType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]")
        public VkMemoryHeap.Buffer memoryHeaps() { return VkPhysicalDeviceMemoryProperties.nmemoryHeaps(address()); }
        /** @return a {@link VkMemoryHeap} view of the struct at the specified index of the {@code memoryHeaps} field. */
        public VkMemoryHeap memoryHeaps(int index) { return VkPhysicalDeviceMemoryProperties.nmemoryHeaps(address(), index); }

    }

}