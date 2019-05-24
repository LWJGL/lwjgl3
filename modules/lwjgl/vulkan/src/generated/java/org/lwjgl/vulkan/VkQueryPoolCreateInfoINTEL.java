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
 * <li>{@code sType} <b>must</b> be {@link INTELPerformanceQuery#VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO_INTEL STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO_INTEL}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code performanceCountersSampling} <b>must</b> be a valid {@code VkQueryPoolSamplingModeINTEL} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code performanceCountersSampling} &ndash; describe how performance queries should be captured.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkQueryPoolCreateInfoINTEL {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkQueryPoolSamplingModeINTEL performanceCountersSampling;
 * }</code></pre>
 */
public class VkQueryPoolCreateInfoINTEL extends Struct implements NativeResource {

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
     * Creates a {@code VkQueryPoolCreateInfoINTEL} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueryPoolCreateInfoINTEL(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code performanceCountersSampling} field. */
    @NativeType("VkQueryPoolSamplingModeINTEL")
    public int performanceCountersSampling() { return nperformanceCountersSampling(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkQueryPoolCreateInfoINTEL sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkQueryPoolCreateInfoINTEL pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code performanceCountersSampling} field. */
    public VkQueryPoolCreateInfoINTEL performanceCountersSampling(@NativeType("VkQueryPoolSamplingModeINTEL") int value) { nperformanceCountersSampling(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkQueryPoolCreateInfoINTEL set(
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
    public VkQueryPoolCreateInfoINTEL set(VkQueryPoolCreateInfoINTEL src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkQueryPoolCreateInfoINTEL} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueryPoolCreateInfoINTEL malloc() {
        return wrap(VkQueryPoolCreateInfoINTEL.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkQueryPoolCreateInfoINTEL} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueryPoolCreateInfoINTEL calloc() {
        return wrap(VkQueryPoolCreateInfoINTEL.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkQueryPoolCreateInfoINTEL} instance allocated with {@link BufferUtils}. */
    public static VkQueryPoolCreateInfoINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkQueryPoolCreateInfoINTEL.class, memAddress(container), container);
    }

    /** Returns a new {@code VkQueryPoolCreateInfoINTEL} instance for the specified memory address. */
    public static VkQueryPoolCreateInfoINTEL create(long address) {
        return wrap(VkQueryPoolCreateInfoINTEL.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueryPoolCreateInfoINTEL createSafe(long address) {
        return address == NULL ? null : wrap(VkQueryPoolCreateInfoINTEL.class, address);
    }

    /**
     * Returns a new {@link VkQueryPoolCreateInfoINTEL.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolCreateInfoINTEL.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueryPoolCreateInfoINTEL.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolCreateInfoINTEL.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueryPoolCreateInfoINTEL.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolCreateInfoINTEL.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkQueryPoolCreateInfoINTEL.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolCreateInfoINTEL.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueryPoolCreateInfoINTEL.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkQueryPoolCreateInfoINTEL} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkQueryPoolCreateInfoINTEL mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkQueryPoolCreateInfoINTEL} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkQueryPoolCreateInfoINTEL callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkQueryPoolCreateInfoINTEL} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueryPoolCreateInfoINTEL mallocStack(MemoryStack stack) {
        return wrap(VkQueryPoolCreateInfoINTEL.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkQueryPoolCreateInfoINTEL} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueryPoolCreateInfoINTEL callocStack(MemoryStack stack) {
        return wrap(VkQueryPoolCreateInfoINTEL.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkQueryPoolCreateInfoINTEL.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolCreateInfoINTEL.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkQueryPoolCreateInfoINTEL.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolCreateInfoINTEL.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkQueryPoolCreateInfoINTEL.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolCreateInfoINTEL.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueryPoolCreateInfoINTEL.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolCreateInfoINTEL.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkQueryPoolCreateInfoINTEL.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkQueryPoolCreateInfoINTEL.PNEXT); }
    /** Unsafe version of {@link #performanceCountersSampling}. */
    public static int nperformanceCountersSampling(long struct) { return UNSAFE.getInt(null, struct + VkQueryPoolCreateInfoINTEL.PERFORMANCECOUNTERSSAMPLING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkQueryPoolCreateInfoINTEL.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkQueryPoolCreateInfoINTEL.PNEXT, value); }
    /** Unsafe version of {@link #performanceCountersSampling(int) performanceCountersSampling}. */
    public static void nperformanceCountersSampling(long struct, int value) { UNSAFE.putInt(null, struct + VkQueryPoolCreateInfoINTEL.PERFORMANCECOUNTERSSAMPLING, value); }

    // -----------------------------------

    /** An array of {@link VkQueryPoolCreateInfoINTEL} structs. */
    public static class Buffer extends StructBuffer<VkQueryPoolCreateInfoINTEL, Buffer> implements NativeResource {

        private static final VkQueryPoolCreateInfoINTEL ELEMENT_FACTORY = VkQueryPoolCreateInfoINTEL.create(-1L);

        /**
         * Creates a new {@code VkQueryPoolCreateInfoINTEL.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueryPoolCreateInfoINTEL#SIZEOF}, and its mark will be undefined.
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
        protected VkQueryPoolCreateInfoINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkQueryPoolCreateInfoINTEL.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkQueryPoolCreateInfoINTEL.npNext(address()); }
        /** Returns the value of the {@code performanceCountersSampling} field. */
        @NativeType("VkQueryPoolSamplingModeINTEL")
        public int performanceCountersSampling() { return VkQueryPoolCreateInfoINTEL.nperformanceCountersSampling(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkQueryPoolCreateInfoINTEL.Buffer sType(@NativeType("VkStructureType") int value) { VkQueryPoolCreateInfoINTEL.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkQueryPoolCreateInfoINTEL.Buffer pNext(@NativeType("void const *") long value) { VkQueryPoolCreateInfoINTEL.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code performanceCountersSampling} field. */
        public VkQueryPoolCreateInfoINTEL.Buffer performanceCountersSampling(@NativeType("VkQueryPoolSamplingModeINTEL") int value) { VkQueryPoolCreateInfoINTEL.nperformanceCountersSampling(address(), value); return this; }

    }

}