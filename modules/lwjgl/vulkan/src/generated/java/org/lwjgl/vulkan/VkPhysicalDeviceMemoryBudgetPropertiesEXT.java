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
 * Structure specifying physical device memory budget and usage.
 * 
 * <h5>Description</h5>
 * 
 * <p>The values returned in this structure are not invariant. The {@code heapBudget} and {@code heapUsage} values <b>must</b> be zero for array elements greater than or equal to {@link VkPhysicalDeviceMemoryProperties}{@code ::memoryHeapCount}. The {@code heapBudget} value <b>must</b> be non-zero for array elements less than {@link VkPhysicalDeviceMemoryProperties}{@code ::memoryHeapCount}. The {@code heapBudget} value <b>must</b> be less than or equal to {@link VkMemoryHeap}{@code ::size} for each heap.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTMemoryBudget#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMemoryBudgetPropertiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkDeviceSize {@link #heapBudget}[VK_MAX_MEMORY_HEAPS];
 *     VkDeviceSize {@link #heapUsage}[VK_MAX_MEMORY_HEAPS];
 * }</code></pre>
 */
public class VkPhysicalDeviceMemoryBudgetPropertiesEXT extends Struct<VkPhysicalDeviceMemoryBudgetPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HEAPBUDGET,
        HEAPUSAGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(8, VK_MAX_MEMORY_HEAPS),
            __array(8, VK_MAX_MEMORY_HEAPS)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HEAPBUDGET = layout.offsetof(2);
        HEAPUSAGE = layout.offsetof(3);
    }

    protected VkPhysicalDeviceMemoryBudgetPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMemoryBudgetPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMemoryBudgetPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** an array of {@link VK10#VK_MAX_MEMORY_HEAPS MAX_MEMORY_HEAPS} {@code VkDeviceSize} values in which memory budgets are returned, with one element for each memory heap. A heap’s budget is a rough estimate of how much memory the process <b>can</b> allocate from that heap before allocations <b>may</b> fail or cause performance degradation. The budget includes any currently allocated device memory. */
    @NativeType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]")
    public LongBuffer heapBudget() { return nheapBudget(address()); }
    /** an array of {@link VK10#VK_MAX_MEMORY_HEAPS MAX_MEMORY_HEAPS} {@code VkDeviceSize} values in which memory budgets are returned, with one element for each memory heap. A heap’s budget is a rough estimate of how much memory the process <b>can</b> allocate from that heap before allocations <b>may</b> fail or cause performance degradation. The budget includes any currently allocated device memory. */
    @NativeType("VkDeviceSize")
    public long heapBudget(int index) { return nheapBudget(address(), index); }
    /** an array of {@link VK10#VK_MAX_MEMORY_HEAPS MAX_MEMORY_HEAPS} {@code VkDeviceSize} values in which memory usages are returned, with one element for each memory heap. A heap’s usage is an estimate of how much memory the process is currently using in that heap. */
    @NativeType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]")
    public LongBuffer heapUsage() { return nheapUsage(address()); }
    /** an array of {@link VK10#VK_MAX_MEMORY_HEAPS MAX_MEMORY_HEAPS} {@code VkDeviceSize} values in which memory usages are returned, with one element for each memory heap. A heap’s usage is an estimate of how much memory the process is currently using in that heap. */
    @NativeType("VkDeviceSize")
    public long heapUsage(int index) { return nheapUsage(address(), index); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMemoryBudget#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT sType$Default() { return sType(EXTMemoryBudget.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT set(VkPhysicalDeviceMemoryBudgetPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMemoryBudgetPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT malloc() {
        return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryBudgetPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT calloc() {
        return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryBudgetPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryBudgetPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT create(long address) {
        return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceMemoryBudgetPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMemoryBudgetPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryBudgetPropertiesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryBudgetPropertiesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryBudgetPropertiesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryBudgetPropertiesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceMemoryBudgetPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMemoryBudgetPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMemoryBudgetPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMemoryBudgetPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #heapBudget}. */
    public static LongBuffer nheapBudget(long struct) { return memLongBuffer(struct + VkPhysicalDeviceMemoryBudgetPropertiesEXT.HEAPBUDGET, VK_MAX_MEMORY_HEAPS); }
    /** Unsafe version of {@link #heapBudget(int) heapBudget}. */
    public static long nheapBudget(long struct, int index) {
        return memGetLong(struct + VkPhysicalDeviceMemoryBudgetPropertiesEXT.HEAPBUDGET + check(index, VK_MAX_MEMORY_HEAPS) * 8);
    }
    /** Unsafe version of {@link #heapUsage}. */
    public static LongBuffer nheapUsage(long struct) { return memLongBuffer(struct + VkPhysicalDeviceMemoryBudgetPropertiesEXT.HEAPUSAGE, VK_MAX_MEMORY_HEAPS); }
    /** Unsafe version of {@link #heapUsage(int) heapUsage}. */
    public static long nheapUsage(long struct, int index) {
        return memGetLong(struct + VkPhysicalDeviceMemoryBudgetPropertiesEXT.HEAPUSAGE + check(index, VK_MAX_MEMORY_HEAPS) * 8);
    }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMemoryBudgetPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMemoryBudgetPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMemoryBudgetPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMemoryBudgetPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceMemoryBudgetPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMemoryBudgetPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.npNext(address()); }
        /** @return a {@link LongBuffer} view of the {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT#heapBudget} field. */
        @NativeType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]")
        public LongBuffer heapBudget() { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.nheapBudget(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT#heapBudget} field. */
        @NativeType("VkDeviceSize")
        public long heapBudget(int index) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.nheapBudget(address(), index); }
        /** @return a {@link LongBuffer} view of the {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT#heapUsage} field. */
        @NativeType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]")
        public LongBuffer heapUsage() { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.nheapUsage(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT#heapUsage} field. */
        @NativeType("VkDeviceSize")
        public long heapUsage(int index) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.nheapUsage(address(), index); }

        /** Sets the specified value to the {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT#sType} field. */
        public VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMemoryBudget#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES_EXT} value to the {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT#sType} field. */
        public VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer sType$Default() { return sType(EXTMemoryBudget.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT#pNext} field. */
        public VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.npNext(address(), value); return this; }

    }

}