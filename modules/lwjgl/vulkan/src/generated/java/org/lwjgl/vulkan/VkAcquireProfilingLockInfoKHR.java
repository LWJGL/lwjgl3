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
 * Structure specifying parameters to acquire the profiling lock.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * </ul>
 * 
 * <p>If {@code timeout} is 0, {@code vkAcquireProfilingLockKHR} will not block while attempting to acquire the profling lock. If {@code timeout} is {@code UINT64_MAX}, the function will not return until the profiling lock was acquired.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRPerformanceQuery#vkAcquireProfilingLockKHR AcquireProfilingLockKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAcquireProfilingLockInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkAcquireProfilingLockFlagsKHR {@link #flags};
 *     uint64_t {@link #timeout};
 * }</code></pre>
 */
public class VkAcquireProfilingLockInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        TIMEOUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        TIMEOUT = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkAcquireProfilingLockInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAcquireProfilingLockInfoKHR(ByteBuffer container) {
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
    /** reserved for future use. */
    @NativeType("VkAcquireProfilingLockFlagsKHR")
    public int flags() { return nflags(address()); }
    /** indicates how long the function waits, in nanoseconds, if the profiling lock is not available. */
    @NativeType("uint64_t")
    public long timeout() { return ntimeout(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAcquireProfilingLockInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR} value to the {@link #sType} field. */
    public VkAcquireProfilingLockInfoKHR sType$Default() { return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAcquireProfilingLockInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkAcquireProfilingLockInfoKHR flags(@NativeType("VkAcquireProfilingLockFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #timeout} field. */
    public VkAcquireProfilingLockInfoKHR timeout(@NativeType("uint64_t") long value) { ntimeout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAcquireProfilingLockInfoKHR set(
        int sType,
        long pNext,
        int flags,
        long timeout
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        timeout(timeout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAcquireProfilingLockInfoKHR set(VkAcquireProfilingLockInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAcquireProfilingLockInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAcquireProfilingLockInfoKHR malloc() {
        return wrap(VkAcquireProfilingLockInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAcquireProfilingLockInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAcquireProfilingLockInfoKHR calloc() {
        return wrap(VkAcquireProfilingLockInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAcquireProfilingLockInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkAcquireProfilingLockInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAcquireProfilingLockInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAcquireProfilingLockInfoKHR} instance for the specified memory address. */
    public static VkAcquireProfilingLockInfoKHR create(long address) {
        return wrap(VkAcquireProfilingLockInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAcquireProfilingLockInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkAcquireProfilingLockInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkAcquireProfilingLockInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAcquireProfilingLockInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAcquireProfilingLockInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAcquireProfilingLockInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAcquireProfilingLockInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAcquireProfilingLockInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAcquireProfilingLockInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAcquireProfilingLockInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAcquireProfilingLockInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkAcquireProfilingLockInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAcquireProfilingLockInfoKHR malloc(MemoryStack stack) {
        return wrap(VkAcquireProfilingLockInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAcquireProfilingLockInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAcquireProfilingLockInfoKHR calloc(MemoryStack stack) {
        return wrap(VkAcquireProfilingLockInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAcquireProfilingLockInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAcquireProfilingLockInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAcquireProfilingLockInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAcquireProfilingLockInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAcquireProfilingLockInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAcquireProfilingLockInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkAcquireProfilingLockInfoKHR.FLAGS); }
    /** Unsafe version of {@link #timeout}. */
    public static long ntimeout(long struct) { return UNSAFE.getLong(null, struct + VkAcquireProfilingLockInfoKHR.TIMEOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAcquireProfilingLockInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAcquireProfilingLockInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkAcquireProfilingLockInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #timeout(long) timeout}. */
    public static void ntimeout(long struct, long value) { UNSAFE.putLong(null, struct + VkAcquireProfilingLockInfoKHR.TIMEOUT, value); }

    // -----------------------------------

    /** An array of {@link VkAcquireProfilingLockInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkAcquireProfilingLockInfoKHR, Buffer> implements NativeResource {

        private static final VkAcquireProfilingLockInfoKHR ELEMENT_FACTORY = VkAcquireProfilingLockInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkAcquireProfilingLockInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAcquireProfilingLockInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkAcquireProfilingLockInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAcquireProfilingLockInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAcquireProfilingLockInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkAcquireProfilingLockInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAcquireProfilingLockInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkAcquireProfilingLockInfoKHR#flags} field. */
        @NativeType("VkAcquireProfilingLockFlagsKHR")
        public int flags() { return VkAcquireProfilingLockInfoKHR.nflags(address()); }
        /** @return the value of the {@link VkAcquireProfilingLockInfoKHR#timeout} field. */
        @NativeType("uint64_t")
        public long timeout() { return VkAcquireProfilingLockInfoKHR.ntimeout(address()); }

        /** Sets the specified value to the {@link VkAcquireProfilingLockInfoKHR#sType} field. */
        public VkAcquireProfilingLockInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAcquireProfilingLockInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR} value to the {@link VkAcquireProfilingLockInfoKHR#sType} field. */
        public VkAcquireProfilingLockInfoKHR.Buffer sType$Default() { return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR); }
        /** Sets the specified value to the {@link VkAcquireProfilingLockInfoKHR#pNext} field. */
        public VkAcquireProfilingLockInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkAcquireProfilingLockInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkAcquireProfilingLockInfoKHR#flags} field. */
        public VkAcquireProfilingLockInfoKHR.Buffer flags(@NativeType("VkAcquireProfilingLockFlagsKHR") int value) { VkAcquireProfilingLockInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkAcquireProfilingLockInfoKHR#timeout} field. */
        public VkAcquireProfilingLockInfoKHR.Buffer timeout(@NativeType("uint64_t") long value) { VkAcquireProfilingLockInfoKHR.ntimeout(address(), value); return this; }

    }

}