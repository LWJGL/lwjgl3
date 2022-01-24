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
 * Structure describing performance query support for an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDevicePerformanceQueryFeaturesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDevicePerformanceQueryFeaturesKHR} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevicePerformanceQueryFeaturesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #performanceCounterQueryPools};
 *     VkBool32 {@link #performanceCounterMultipleQueryPools};
 * }</code></pre>
 */
public class VkPhysicalDevicePerformanceQueryFeaturesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PERFORMANCECOUNTERQUERYPOOLS,
        PERFORMANCECOUNTERMULTIPLEQUERYPOOLS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PERFORMANCECOUNTERQUERYPOOLS = layout.offsetof(2);
        PERFORMANCECOUNTERMULTIPLEQUERYPOOLS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDevicePerformanceQueryFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePerformanceQueryFeaturesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates whether the implementation supports performance counter query pools. */
    @NativeType("VkBool32")
    public boolean performanceCounterQueryPools() { return nperformanceCounterQueryPools(address()) != 0; }
    /** indicates whether the implementation supports using multiple performance query pools in a primary command buffer and secondary command buffers executed within it. */
    @NativeType("VkBool32")
    public boolean performanceCounterMultipleQueryPools() { return nperformanceCounterMultipleQueryPools(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDevicePerformanceQueryFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDevicePerformanceQueryFeaturesKHR sType$Default() { return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDevicePerformanceQueryFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #performanceCounterQueryPools} field. */
    public VkPhysicalDevicePerformanceQueryFeaturesKHR performanceCounterQueryPools(@NativeType("VkBool32") boolean value) { nperformanceCounterQueryPools(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #performanceCounterMultipleQueryPools} field. */
    public VkPhysicalDevicePerformanceQueryFeaturesKHR performanceCounterMultipleQueryPools(@NativeType("VkBool32") boolean value) { nperformanceCounterMultipleQueryPools(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePerformanceQueryFeaturesKHR set(
        int sType,
        long pNext,
        boolean performanceCounterQueryPools,
        boolean performanceCounterMultipleQueryPools
    ) {
        sType(sType);
        pNext(pNext);
        performanceCounterQueryPools(performanceCounterQueryPools);
        performanceCounterMultipleQueryPools(performanceCounterMultipleQueryPools);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePerformanceQueryFeaturesKHR set(VkPhysicalDevicePerformanceQueryFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePerformanceQueryFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR malloc() {
        return wrap(VkPhysicalDevicePerformanceQueryFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevicePerformanceQueryFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR calloc() {
        return wrap(VkPhysicalDevicePerformanceQueryFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevicePerformanceQueryFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDevicePerformanceQueryFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePerformanceQueryFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR create(long address) {
        return wrap(VkPhysicalDevicePerformanceQueryFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDevicePerformanceQueryFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePerformanceQueryFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDevicePerformanceQueryFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDevicePerformanceQueryFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDevicePerformanceQueryFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePerformanceQueryFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePerformanceQueryFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #performanceCounterQueryPools}. */
    public static int nperformanceCounterQueryPools(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePerformanceQueryFeaturesKHR.PERFORMANCECOUNTERQUERYPOOLS); }
    /** Unsafe version of {@link #performanceCounterMultipleQueryPools}. */
    public static int nperformanceCounterMultipleQueryPools(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePerformanceQueryFeaturesKHR.PERFORMANCECOUNTERMULTIPLEQUERYPOOLS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePerformanceQueryFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePerformanceQueryFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #performanceCounterQueryPools(boolean) performanceCounterQueryPools}. */
    public static void nperformanceCounterQueryPools(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePerformanceQueryFeaturesKHR.PERFORMANCECOUNTERQUERYPOOLS, value); }
    /** Unsafe version of {@link #performanceCounterMultipleQueryPools(boolean) performanceCounterMultipleQueryPools}. */
    public static void nperformanceCounterMultipleQueryPools(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePerformanceQueryFeaturesKHR.PERFORMANCECOUNTERMULTIPLEQUERYPOOLS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePerformanceQueryFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePerformanceQueryFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePerformanceQueryFeaturesKHR ELEMENT_FACTORY = VkPhysicalDevicePerformanceQueryFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePerformanceQueryFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDevicePerformanceQueryFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDevicePerformanceQueryFeaturesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePerformanceQueryFeaturesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDevicePerformanceQueryFeaturesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePerformanceQueryFeaturesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDevicePerformanceQueryFeaturesKHR#performanceCounterQueryPools} field. */
        @NativeType("VkBool32")
        public boolean performanceCounterQueryPools() { return VkPhysicalDevicePerformanceQueryFeaturesKHR.nperformanceCounterQueryPools(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDevicePerformanceQueryFeaturesKHR#performanceCounterMultipleQueryPools} field. */
        @NativeType("VkBool32")
        public boolean performanceCounterMultipleQueryPools() { return VkPhysicalDevicePerformanceQueryFeaturesKHR.nperformanceCounterMultipleQueryPools(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDevicePerformanceQueryFeaturesKHR#sType} field. */
        public VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePerformanceQueryFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR} value to the {@link VkPhysicalDevicePerformanceQueryFeaturesKHR#sType} field. */
        public VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer sType$Default() { return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDevicePerformanceQueryFeaturesKHR#pNext} field. */
        public VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePerformanceQueryFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevicePerformanceQueryFeaturesKHR#performanceCounterQueryPools} field. */
        public VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer performanceCounterQueryPools(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePerformanceQueryFeaturesKHR.nperformanceCounterQueryPools(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevicePerformanceQueryFeaturesKHR#performanceCounterMultipleQueryPools} field. */
        public VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer performanceCounterMultipleQueryPools(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePerformanceQueryFeaturesKHR.nperformanceCounterMultipleQueryPools(address(), value ? 1 : 0); return this; }

    }

}