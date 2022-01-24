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
 * Structure specifying parameters to create a pool of performance queries.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link INTELPerformanceQuery#VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL}</li>
 * <li>{@code performanceCountersSampling} <b>must</b> be a valid {@code VkQueryPoolSamplingModeINTEL} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkQueryPoolPerformanceQueryCreateInfoINTEL {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkQueryPoolSamplingModeINTEL {@link #performanceCountersSampling};
 * }</code></pre>
 */
public class VkQueryPoolPerformanceQueryCreateInfoINTEL extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PERFORMANCECOUNTERSSAMPLING;

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
        PERFORMANCECOUNTERSSAMPLING = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkQueryPoolPerformanceQueryCreateInfoINTEL} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueryPoolPerformanceQueryCreateInfoINTEL(ByteBuffer container) {
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
    /** describe how performance queries should be captured. */
    @NativeType("VkQueryPoolSamplingModeINTEL")
    public int performanceCountersSampling() { return nperformanceCountersSampling(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkQueryPoolPerformanceQueryCreateInfoINTEL sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link INTELPerformanceQuery#VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL} value to the {@link #sType} field. */
    public VkQueryPoolPerformanceQueryCreateInfoINTEL sType$Default() { return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkQueryPoolPerformanceQueryCreateInfoINTEL pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #performanceCountersSampling} field. */
    public VkQueryPoolPerformanceQueryCreateInfoINTEL performanceCountersSampling(@NativeType("VkQueryPoolSamplingModeINTEL") int value) { nperformanceCountersSampling(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkQueryPoolPerformanceQueryCreateInfoINTEL set(
        int sType,
        long pNext,
        int performanceCountersSampling
    ) {
        sType(sType);
        pNext(pNext);
        performanceCountersSampling(performanceCountersSampling);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkQueryPoolPerformanceQueryCreateInfoINTEL set(VkQueryPoolPerformanceQueryCreateInfoINTEL src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkQueryPoolPerformanceQueryCreateInfoINTEL} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL malloc() {
        return wrap(VkQueryPoolPerformanceQueryCreateInfoINTEL.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkQueryPoolPerformanceQueryCreateInfoINTEL} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL calloc() {
        return wrap(VkQueryPoolPerformanceQueryCreateInfoINTEL.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkQueryPoolPerformanceQueryCreateInfoINTEL} instance allocated with {@link BufferUtils}. */
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkQueryPoolPerformanceQueryCreateInfoINTEL.class, memAddress(container), container);
    }

    /** Returns a new {@code VkQueryPoolPerformanceQueryCreateInfoINTEL} instance for the specified memory address. */
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL create(long address) {
        return wrap(VkQueryPoolPerformanceQueryCreateInfoINTEL.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL createSafe(long address) {
        return address == NULL ? null : wrap(VkQueryPoolPerformanceQueryCreateInfoINTEL.class, address);
    }

    /**
     * Returns a new {@link VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkQueryPoolPerformanceQueryCreateInfoINTEL} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL malloc(MemoryStack stack) {
        return wrap(VkQueryPoolPerformanceQueryCreateInfoINTEL.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkQueryPoolPerformanceQueryCreateInfoINTEL} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL calloc(MemoryStack stack) {
        return wrap(VkQueryPoolPerformanceQueryCreateInfoINTEL.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkQueryPoolPerformanceQueryCreateInfoINTEL.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkQueryPoolPerformanceQueryCreateInfoINTEL.PNEXT); }
    /** Unsafe version of {@link #performanceCountersSampling}. */
    public static int nperformanceCountersSampling(long struct) { return UNSAFE.getInt(null, struct + VkQueryPoolPerformanceQueryCreateInfoINTEL.PERFORMANCECOUNTERSSAMPLING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkQueryPoolPerformanceQueryCreateInfoINTEL.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkQueryPoolPerformanceQueryCreateInfoINTEL.PNEXT, value); }
    /** Unsafe version of {@link #performanceCountersSampling(int) performanceCountersSampling}. */
    public static void nperformanceCountersSampling(long struct, int value) { UNSAFE.putInt(null, struct + VkQueryPoolPerformanceQueryCreateInfoINTEL.PERFORMANCECOUNTERSSAMPLING, value); }

    // -----------------------------------

    /** An array of {@link VkQueryPoolPerformanceQueryCreateInfoINTEL} structs. */
    public static class Buffer extends StructBuffer<VkQueryPoolPerformanceQueryCreateInfoINTEL, Buffer> implements NativeResource {

        private static final VkQueryPoolPerformanceQueryCreateInfoINTEL ELEMENT_FACTORY = VkQueryPoolPerformanceQueryCreateInfoINTEL.create(-1L);

        /**
         * Creates a new {@code VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueryPoolPerformanceQueryCreateInfoINTEL#SIZEOF}, and its mark will be undefined.
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
        protected VkQueryPoolPerformanceQueryCreateInfoINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkQueryPoolPerformanceQueryCreateInfoINTEL#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkQueryPoolPerformanceQueryCreateInfoINTEL.nsType(address()); }
        /** @return the value of the {@link VkQueryPoolPerformanceQueryCreateInfoINTEL#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkQueryPoolPerformanceQueryCreateInfoINTEL.npNext(address()); }
        /** @return the value of the {@link VkQueryPoolPerformanceQueryCreateInfoINTEL#performanceCountersSampling} field. */
        @NativeType("VkQueryPoolSamplingModeINTEL")
        public int performanceCountersSampling() { return VkQueryPoolPerformanceQueryCreateInfoINTEL.nperformanceCountersSampling(address()); }

        /** Sets the specified value to the {@link VkQueryPoolPerformanceQueryCreateInfoINTEL#sType} field. */
        public VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer sType(@NativeType("VkStructureType") int value) { VkQueryPoolPerformanceQueryCreateInfoINTEL.nsType(address(), value); return this; }
        /** Sets the {@link INTELPerformanceQuery#VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL} value to the {@link VkQueryPoolPerformanceQueryCreateInfoINTEL#sType} field. */
        public VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer sType$Default() { return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL); }
        /** Sets the specified value to the {@link VkQueryPoolPerformanceQueryCreateInfoINTEL#pNext} field. */
        public VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer pNext(@NativeType("void const *") long value) { VkQueryPoolPerformanceQueryCreateInfoINTEL.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkQueryPoolPerformanceQueryCreateInfoINTEL#performanceCountersSampling} field. */
        public VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer performanceCountersSampling(@NativeType("VkQueryPoolSamplingModeINTEL") int value) { VkQueryPoolPerformanceQueryCreateInfoINTEL.nperformanceCountersSampling(address(), value); return this; }

    }

}