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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Specify a memory allocation priority.
 * 
 * <h5>Description</h5>
 * 
 * <p>Memory allocations with higher priority <b>may</b> be more likely to stay in device-local memory when the system is under memory pressure.</p>
 * 
 * <p>If this structure is not included, it is as if the {@code priority} value were {@code 0.5}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code priority} <b>must</b> be between 0 and 1, inclusive</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTMemoryPriority#VK_STRUCTURE_TYPE_MEMORY_PRIORITY_ALLOCATE_INFO_EXT STRUCTURE_TYPE_MEMORY_PRIORITY_ALLOCATE_INFO_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMemoryPriorityAllocateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     float {@link #priority};
 * }</code></pre>
 */
public class VkMemoryPriorityAllocateInfoEXT extends Struct<VkMemoryPriorityAllocateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRIORITY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRIORITY = layout.offsetof(2);
    }

    protected VkMemoryPriorityAllocateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryPriorityAllocateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryPriorityAllocateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkMemoryPriorityAllocateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryPriorityAllocateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a floating-point value between 0 and 1, indicating the priority of the allocation relative to other memory allocations. Larger values are higher priority. The granularity of the priorities is implementation-dependent. */
    public float priority() { return npriority(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMemoryPriorityAllocateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMemoryPriority#VK_STRUCTURE_TYPE_MEMORY_PRIORITY_ALLOCATE_INFO_EXT STRUCTURE_TYPE_MEMORY_PRIORITY_ALLOCATE_INFO_EXT} value to the {@link #sType} field. */
    public VkMemoryPriorityAllocateInfoEXT sType$Default() { return sType(EXTMemoryPriority.VK_STRUCTURE_TYPE_MEMORY_PRIORITY_ALLOCATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMemoryPriorityAllocateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #priority} field. */
    public VkMemoryPriorityAllocateInfoEXT priority(float value) { npriority(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryPriorityAllocateInfoEXT set(
        int sType,
        long pNext,
        float priority
    ) {
        sType(sType);
        pNext(pNext);
        priority(priority);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryPriorityAllocateInfoEXT set(VkMemoryPriorityAllocateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryPriorityAllocateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryPriorityAllocateInfoEXT malloc() {
        return new VkMemoryPriorityAllocateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryPriorityAllocateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryPriorityAllocateInfoEXT calloc() {
        return new VkMemoryPriorityAllocateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryPriorityAllocateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkMemoryPriorityAllocateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryPriorityAllocateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryPriorityAllocateInfoEXT} instance for the specified memory address. */
    public static VkMemoryPriorityAllocateInfoEXT create(long address) {
        return new VkMemoryPriorityAllocateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryPriorityAllocateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkMemoryPriorityAllocateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkMemoryPriorityAllocateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryPriorityAllocateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryPriorityAllocateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryPriorityAllocateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryPriorityAllocateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryPriorityAllocateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryPriorityAllocateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryPriorityAllocateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryPriorityAllocateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryPriorityAllocateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryPriorityAllocateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryPriorityAllocateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryPriorityAllocateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryPriorityAllocateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryPriorityAllocateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryPriorityAllocateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryPriorityAllocateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkMemoryPriorityAllocateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryPriorityAllocateInfoEXT malloc(MemoryStack stack) {
        return new VkMemoryPriorityAllocateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryPriorityAllocateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryPriorityAllocateInfoEXT calloc(MemoryStack stack) {
        return new VkMemoryPriorityAllocateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryPriorityAllocateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryPriorityAllocateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryPriorityAllocateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryPriorityAllocateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryPriorityAllocateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryPriorityAllocateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #priority}. */
    public static float npriority(long struct) { return memGetFloat(struct + VkMemoryPriorityAllocateInfoEXT.PRIORITY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryPriorityAllocateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryPriorityAllocateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #priority(float) priority}. */
    public static void npriority(long struct, float value) { memPutFloat(struct + VkMemoryPriorityAllocateInfoEXT.PRIORITY, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryPriorityAllocateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkMemoryPriorityAllocateInfoEXT, Buffer> implements NativeResource {

        private static final VkMemoryPriorityAllocateInfoEXT ELEMENT_FACTORY = VkMemoryPriorityAllocateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkMemoryPriorityAllocateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryPriorityAllocateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryPriorityAllocateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMemoryPriorityAllocateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryPriorityAllocateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkMemoryPriorityAllocateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryPriorityAllocateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkMemoryPriorityAllocateInfoEXT#priority} field. */
        public float priority() { return VkMemoryPriorityAllocateInfoEXT.npriority(address()); }

        /** Sets the specified value to the {@link VkMemoryPriorityAllocateInfoEXT#sType} field. */
        public VkMemoryPriorityAllocateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryPriorityAllocateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMemoryPriority#VK_STRUCTURE_TYPE_MEMORY_PRIORITY_ALLOCATE_INFO_EXT STRUCTURE_TYPE_MEMORY_PRIORITY_ALLOCATE_INFO_EXT} value to the {@link VkMemoryPriorityAllocateInfoEXT#sType} field. */
        public VkMemoryPriorityAllocateInfoEXT.Buffer sType$Default() { return sType(EXTMemoryPriority.VK_STRUCTURE_TYPE_MEMORY_PRIORITY_ALLOCATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkMemoryPriorityAllocateInfoEXT#pNext} field. */
        public VkMemoryPriorityAllocateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkMemoryPriorityAllocateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryPriorityAllocateInfoEXT#priority} field. */
        public VkMemoryPriorityAllocateInfoEXT.Buffer priority(float value) { VkMemoryPriorityAllocateInfoEXT.npriority(address(), value); return this; }

    }

}