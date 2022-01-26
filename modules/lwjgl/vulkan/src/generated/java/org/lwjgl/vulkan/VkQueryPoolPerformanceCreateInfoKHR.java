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
 * Structure specifying parameters of a newly created performance query pool.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code queueFamilyIndex} <b>must</b> be a valid queue family index of the device</li>
 * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-performanceCounterQueryPools">{@code performanceCounterQueryPools}</a> feature <b>must</b> be enabled</li>
 * <li>Each element of {@code pCounterIndices} <b>must</b> be in the range of counters reported by {@code vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR} for the queue family specified in {@code queueFamilyIndex}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR}</li>
 * <li>{@code pCounterIndices} <b>must</b> be a valid pointer to an array of {@code counterIndexCount} {@code uint32_t} values</li>
 * <li>{@code counterIndexCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRPerformanceQuery#vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR GetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkQueryPoolPerformanceCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #queueFamilyIndex};
 *     uint32_t {@link #counterIndexCount};
 *     uint32_t const * {@link #pCounterIndices};
 * }</code></pre>
 */
public class VkQueryPoolPerformanceCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        QUEUEFAMILYINDEX,
        COUNTERINDEXCOUNT,
        PCOUNTERINDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        QUEUEFAMILYINDEX = layout.offsetof(2);
        COUNTERINDEXCOUNT = layout.offsetof(3);
        PCOUNTERINDICES = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkQueryPoolPerformanceCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueryPoolPerformanceCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the queue family index to create this performance query pool for. */
    @NativeType("uint32_t")
    public int queueFamilyIndex() { return nqueueFamilyIndex(address()); }
    /** the length of the {@code pCounterIndices} array. */
    @NativeType("uint32_t")
    public int counterIndexCount() { return ncounterIndexCount(address()); }
    /** a pointer to an array of indices into the {@link KHRPerformanceQuery#vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR EnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR}{@code ::pCounters} to enable in this performance query pool. */
    @NativeType("uint32_t const *")
    public IntBuffer pCounterIndices() { return npCounterIndices(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkQueryPoolPerformanceCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkQueryPoolPerformanceCreateInfoKHR sType$Default() { return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkQueryPoolPerformanceCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #queueFamilyIndex} field. */
    public VkQueryPoolPerformanceCreateInfoKHR queueFamilyIndex(@NativeType("uint32_t") int value) { nqueueFamilyIndex(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pCounterIndices} field. */
    public VkQueryPoolPerformanceCreateInfoKHR pCounterIndices(@NativeType("uint32_t const *") IntBuffer value) { npCounterIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkQueryPoolPerformanceCreateInfoKHR set(
        int sType,
        long pNext,
        int queueFamilyIndex,
        IntBuffer pCounterIndices
    ) {
        sType(sType);
        pNext(pNext);
        queueFamilyIndex(queueFamilyIndex);
        pCounterIndices(pCounterIndices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkQueryPoolPerformanceCreateInfoKHR set(VkQueryPoolPerformanceCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkQueryPoolPerformanceCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueryPoolPerformanceCreateInfoKHR malloc() {
        return wrap(VkQueryPoolPerformanceCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkQueryPoolPerformanceCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueryPoolPerformanceCreateInfoKHR calloc() {
        return wrap(VkQueryPoolPerformanceCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkQueryPoolPerformanceCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkQueryPoolPerformanceCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkQueryPoolPerformanceCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkQueryPoolPerformanceCreateInfoKHR} instance for the specified memory address. */
    public static VkQueryPoolPerformanceCreateInfoKHR create(long address) {
        return wrap(VkQueryPoolPerformanceCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueryPoolPerformanceCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkQueryPoolPerformanceCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkQueryPoolPerformanceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolPerformanceCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueryPoolPerformanceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolPerformanceCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueryPoolPerformanceCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolPerformanceCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkQueryPoolPerformanceCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolPerformanceCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueryPoolPerformanceCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkQueryPoolPerformanceCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueryPoolPerformanceCreateInfoKHR malloc(MemoryStack stack) {
        return wrap(VkQueryPoolPerformanceCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkQueryPoolPerformanceCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueryPoolPerformanceCreateInfoKHR calloc(MemoryStack stack) {
        return wrap(VkQueryPoolPerformanceCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkQueryPoolPerformanceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolPerformanceCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueryPoolPerformanceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolPerformanceCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkQueryPoolPerformanceCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkQueryPoolPerformanceCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #queueFamilyIndex}. */
    public static int nqueueFamilyIndex(long struct) { return UNSAFE.getInt(null, struct + VkQueryPoolPerformanceCreateInfoKHR.QUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #counterIndexCount}. */
    public static int ncounterIndexCount(long struct) { return UNSAFE.getInt(null, struct + VkQueryPoolPerformanceCreateInfoKHR.COUNTERINDEXCOUNT); }
    /** Unsafe version of {@link #pCounterIndices() pCounterIndices}. */
    public static IntBuffer npCounterIndices(long struct) { return memIntBuffer(memGetAddress(struct + VkQueryPoolPerformanceCreateInfoKHR.PCOUNTERINDICES), ncounterIndexCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkQueryPoolPerformanceCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkQueryPoolPerformanceCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #queueFamilyIndex(int) queueFamilyIndex}. */
    public static void nqueueFamilyIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkQueryPoolPerformanceCreateInfoKHR.QUEUEFAMILYINDEX, value); }
    /** Sets the specified value to the {@code counterIndexCount} field of the specified {@code struct}. */
    public static void ncounterIndexCount(long struct, int value) { UNSAFE.putInt(null, struct + VkQueryPoolPerformanceCreateInfoKHR.COUNTERINDEXCOUNT, value); }
    /** Unsafe version of {@link #pCounterIndices(IntBuffer) pCounterIndices}. */
    public static void npCounterIndices(long struct, IntBuffer value) { memPutAddress(struct + VkQueryPoolPerformanceCreateInfoKHR.PCOUNTERINDICES, memAddress(value)); ncounterIndexCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkQueryPoolPerformanceCreateInfoKHR.PCOUNTERINDICES));
    }

    // -----------------------------------

    /** An array of {@link VkQueryPoolPerformanceCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkQueryPoolPerformanceCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkQueryPoolPerformanceCreateInfoKHR ELEMENT_FACTORY = VkQueryPoolPerformanceCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkQueryPoolPerformanceCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueryPoolPerformanceCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkQueryPoolPerformanceCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkQueryPoolPerformanceCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkQueryPoolPerformanceCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkQueryPoolPerformanceCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkQueryPoolPerformanceCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkQueryPoolPerformanceCreateInfoKHR#queueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int queueFamilyIndex() { return VkQueryPoolPerformanceCreateInfoKHR.nqueueFamilyIndex(address()); }
        /** @return the value of the {@link VkQueryPoolPerformanceCreateInfoKHR#counterIndexCount} field. */
        @NativeType("uint32_t")
        public int counterIndexCount() { return VkQueryPoolPerformanceCreateInfoKHR.ncounterIndexCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkQueryPoolPerformanceCreateInfoKHR#pCounterIndices} field. */
        @NativeType("uint32_t const *")
        public IntBuffer pCounterIndices() { return VkQueryPoolPerformanceCreateInfoKHR.npCounterIndices(address()); }

        /** Sets the specified value to the {@link VkQueryPoolPerformanceCreateInfoKHR#sType} field. */
        public VkQueryPoolPerformanceCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkQueryPoolPerformanceCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR} value to the {@link VkQueryPoolPerformanceCreateInfoKHR#sType} field. */
        public VkQueryPoolPerformanceCreateInfoKHR.Buffer sType$Default() { return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkQueryPoolPerformanceCreateInfoKHR#pNext} field. */
        public VkQueryPoolPerformanceCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkQueryPoolPerformanceCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkQueryPoolPerformanceCreateInfoKHR#queueFamilyIndex} field. */
        public VkQueryPoolPerformanceCreateInfoKHR.Buffer queueFamilyIndex(@NativeType("uint32_t") int value) { VkQueryPoolPerformanceCreateInfoKHR.nqueueFamilyIndex(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkQueryPoolPerformanceCreateInfoKHR#pCounterIndices} field. */
        public VkQueryPoolPerformanceCreateInfoKHR.Buffer pCounterIndices(@NativeType("uint32_t const *") IntBuffer value) { VkQueryPoolPerformanceCreateInfoKHR.npCounterIndices(address(), value); return this; }

    }

}