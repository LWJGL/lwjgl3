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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code heapBudget[VK_MAX_MEMORY_HEAPS]} &ndash; an array of memory budgets, with one element for each memory heap. A heap&#8217;s budget is a rough estimate of how much memory the process <b>can</b> allocate from that heap before allocations <b>may</b> fail or cause performance degradation. The budget includes any currently allocated device memory.</li>
 * <li>{@code heapUsage[VK_MAX_MEMORY_HEAPS]} &ndash; an array of memory usage, with one element for each memory heap. A heap&#8217;s usage is an estimate of how much memory the process is currently using in that heap.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMemoryBudgetPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDeviceSize heapBudget[VK_MAX_MEMORY_HEAPS];
 *     VkDeviceSize heapUsage[VK_MAX_MEMORY_HEAPS];
 * }</code></pre>
 */
public class VkPhysicalDeviceMemoryBudgetPropertiesEXT extends Struct implements NativeResource {

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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns a {@link LongBuffer} view of the {@code heapBudget} field. */
    @NativeType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]")
    public LongBuffer heapBudget() { return nheapBudget(address()); }
    /** Returns the value at the specified index of the {@code heapBudget} field. */
    @NativeType("VkDeviceSize")
    public long heapBudget(int index) { return nheapBudget(address(), index); }
    /** Returns a {@link LongBuffer} view of the {@code heapUsage} field. */
    @NativeType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]")
    public LongBuffer heapUsage() { return nheapUsage(address()); }
    /** Returns the value at the specified index of the {@code heapUsage} field. */
    @NativeType("VkDeviceSize")
    public long heapUsage(int index) { return nheapUsage(address(), index); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
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
        return wrap(VkPhysicalDeviceMemoryBudgetPropertiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryBudgetPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT calloc() {
        return wrap(VkPhysicalDeviceMemoryBudgetPropertiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryBudgetPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceMemoryBudgetPropertiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryBudgetPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT create(long address) {
        return wrap(VkPhysicalDeviceMemoryBudgetPropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceMemoryBudgetPropertiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMemoryBudgetPropertiesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryBudgetPropertiesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMemoryBudgetPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceMemoryBudgetPropertiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMemoryBudgetPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceMemoryBudgetPropertiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMemoryBudgetPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMemoryBudgetPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #heapBudget}. */
    public static LongBuffer nheapBudget(long struct) { return memLongBuffer(struct + VkPhysicalDeviceMemoryBudgetPropertiesEXT.HEAPBUDGET, VK_MAX_MEMORY_HEAPS); }
    /** Unsafe version of {@link #heapBudget(int) heapBudget}. */
    public static long nheapBudget(long struct, int index) {
        return UNSAFE.getLong(null, struct + VkPhysicalDeviceMemoryBudgetPropertiesEXT.HEAPBUDGET + check(index, VK_MAX_MEMORY_HEAPS) * 8);
    }
    /** Unsafe version of {@link #heapUsage}. */
    public static LongBuffer nheapUsage(long struct) { return memLongBuffer(struct + VkPhysicalDeviceMemoryBudgetPropertiesEXT.HEAPUSAGE, VK_MAX_MEMORY_HEAPS); }
    /** Unsafe version of {@link #heapUsage(int) heapUsage}. */
    public static long nheapUsage(long struct, int index) {
        return UNSAFE.getLong(null, struct + VkPhysicalDeviceMemoryBudgetPropertiesEXT.HEAPUSAGE + check(index, VK_MAX_MEMORY_HEAPS) * 8);
    }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMemoryBudgetPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMemoryBudgetPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMemoryBudgetPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMemoryBudgetPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceMemoryBudgetPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceMemoryBudgetPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.npNext(address()); }
        /** Returns a {@link LongBuffer} view of the {@code heapBudget} field. */
        @NativeType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]")
        public LongBuffer heapBudget() { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.nheapBudget(address()); }
        /** Returns the value at the specified index of the {@code heapBudget} field. */
        @NativeType("VkDeviceSize")
        public long heapBudget(int index) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.nheapBudget(address(), index); }
        /** Returns a {@link LongBuffer} view of the {@code heapUsage} field. */
        @NativeType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]")
        public LongBuffer heapUsage() { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.nheapUsage(address()); }
        /** Returns the value at the specified index of the {@code heapUsage} field. */
        @NativeType("VkDeviceSize")
        public long heapUsage(int index) { return VkPhysicalDeviceMemoryBudgetPropertiesEXT.nheapUsage(address(), index); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMemoryBudgetPropertiesEXT.npNext(address(), value); return this; }

    }

}