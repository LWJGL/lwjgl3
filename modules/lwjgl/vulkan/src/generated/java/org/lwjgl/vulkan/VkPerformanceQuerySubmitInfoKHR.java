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
 * Structure indicating which counter pass index is active for performance queries.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkSubmitInfo}{@code ::pNext} chain does not include this structure, the batch defaults to use counter pass index 0.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code counterPassIndex} <b>must</b> be less than the number of counter passes required by any queries within the batch. The required number of counter passes for a performance query is obtained by calling {@link KHRPerformanceQuery#vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR GetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPerformanceQuerySubmitInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #counterPassIndex};
 * }</code></pre>
 */
public class VkPerformanceQuerySubmitInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COUNTERPASSINDEX;

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
        COUNTERPASSINDEX = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPerformanceQuerySubmitInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPerformanceQuerySubmitInfoKHR(ByteBuffer container) {
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
    /** specifies which counter pass index is active. */
    @NativeType("uint32_t")
    public int counterPassIndex() { return ncounterPassIndex(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPerformanceQuerySubmitInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR} value to the {@link #sType} field. */
    public VkPerformanceQuerySubmitInfoKHR sType$Default() { return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPerformanceQuerySubmitInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #counterPassIndex} field. */
    public VkPerformanceQuerySubmitInfoKHR counterPassIndex(@NativeType("uint32_t") int value) { ncounterPassIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPerformanceQuerySubmitInfoKHR set(
        int sType,
        long pNext,
        int counterPassIndex
    ) {
        sType(sType);
        pNext(pNext);
        counterPassIndex(counterPassIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPerformanceQuerySubmitInfoKHR set(VkPerformanceQuerySubmitInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPerformanceQuerySubmitInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPerformanceQuerySubmitInfoKHR malloc() {
        return wrap(VkPerformanceQuerySubmitInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPerformanceQuerySubmitInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPerformanceQuerySubmitInfoKHR calloc() {
        return wrap(VkPerformanceQuerySubmitInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPerformanceQuerySubmitInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPerformanceQuerySubmitInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPerformanceQuerySubmitInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPerformanceQuerySubmitInfoKHR} instance for the specified memory address. */
    public static VkPerformanceQuerySubmitInfoKHR create(long address) {
        return wrap(VkPerformanceQuerySubmitInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPerformanceQuerySubmitInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPerformanceQuerySubmitInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkPerformanceQuerySubmitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceQuerySubmitInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceQuerySubmitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceQuerySubmitInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceQuerySubmitInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceQuerySubmitInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPerformanceQuerySubmitInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPerformanceQuerySubmitInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPerformanceQuerySubmitInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPerformanceQuerySubmitInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceQuerySubmitInfoKHR malloc(MemoryStack stack) {
        return wrap(VkPerformanceQuerySubmitInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPerformanceQuerySubmitInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceQuerySubmitInfoKHR calloc(MemoryStack stack) {
        return wrap(VkPerformanceQuerySubmitInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPerformanceQuerySubmitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceQuerySubmitInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceQuerySubmitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceQuerySubmitInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPerformanceQuerySubmitInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPerformanceQuerySubmitInfoKHR.PNEXT); }
    /** Unsafe version of {@link #counterPassIndex}. */
    public static int ncounterPassIndex(long struct) { return UNSAFE.getInt(null, struct + VkPerformanceQuerySubmitInfoKHR.COUNTERPASSINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPerformanceQuerySubmitInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPerformanceQuerySubmitInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #counterPassIndex(int) counterPassIndex}. */
    public static void ncounterPassIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkPerformanceQuerySubmitInfoKHR.COUNTERPASSINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkPerformanceQuerySubmitInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPerformanceQuerySubmitInfoKHR, Buffer> implements NativeResource {

        private static final VkPerformanceQuerySubmitInfoKHR ELEMENT_FACTORY = VkPerformanceQuerySubmitInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPerformanceQuerySubmitInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPerformanceQuerySubmitInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPerformanceQuerySubmitInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPerformanceQuerySubmitInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPerformanceQuerySubmitInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkPerformanceQuerySubmitInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPerformanceQuerySubmitInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkPerformanceQuerySubmitInfoKHR#counterPassIndex} field. */
        @NativeType("uint32_t")
        public int counterPassIndex() { return VkPerformanceQuerySubmitInfoKHR.ncounterPassIndex(address()); }

        /** Sets the specified value to the {@link VkPerformanceQuerySubmitInfoKHR#sType} field. */
        public VkPerformanceQuerySubmitInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPerformanceQuerySubmitInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR} value to the {@link VkPerformanceQuerySubmitInfoKHR#sType} field. */
        public VkPerformanceQuerySubmitInfoKHR.Buffer sType$Default() { return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR); }
        /** Sets the specified value to the {@link VkPerformanceQuerySubmitInfoKHR#pNext} field. */
        public VkPerformanceQuerySubmitInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPerformanceQuerySubmitInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPerformanceQuerySubmitInfoKHR#counterPassIndex} field. */
        public VkPerformanceQuerySubmitInfoKHR.Buffer counterPassIndex(@NativeType("uint32_t") int value) { VkPerformanceQuerySubmitInfoKHR.ncounterPassIndex(address(), value); return this; }

    }

}