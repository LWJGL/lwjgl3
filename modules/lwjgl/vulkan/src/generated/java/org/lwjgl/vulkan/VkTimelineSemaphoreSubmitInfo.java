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
 * Structure specifying signal and wait values for timeline semaphores.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the semaphore in {@link VkSubmitInfo}{@code ::pWaitSemaphores} or {@link VkSubmitInfo}{@code ::pSignalSemaphores} corresponding to an entry in {@code pWaitSemaphoreValues} or {@code pSignalSemaphoreValues} respectively was not created with a {@code VkSemaphoreType} of {@link VK12#VK_SEMAPHORE_TYPE_TIMELINE SEMAPHORE_TYPE_TIMELINE}, the implementation <b>must</b> ignore the value in the {@code pWaitSemaphoreValues} or {@code pSignalSemaphoreValues} entry.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO}</li>
 * <li>If {@code waitSemaphoreValueCount} is not 0, and {@code pWaitSemaphoreValues} is not {@code NULL}, {@code pWaitSemaphoreValues} <b>must</b> be a valid pointer to an array of {@code waitSemaphoreValueCount} {@code uint64_t} values</li>
 * <li>If {@code signalSemaphoreValueCount} is not 0, and {@code pSignalSemaphoreValues} is not {@code NULL}, {@code pSignalSemaphoreValues} <b>must</b> be a valid pointer to an array of {@code signalSemaphoreValueCount} {@code uint64_t} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkTimelineSemaphoreSubmitInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #waitSemaphoreValueCount};
 *     uint64_t const * {@link #pWaitSemaphoreValues};
 *     uint32_t {@link #signalSemaphoreValueCount};
 *     uint64_t const * {@link #pSignalSemaphoreValues};
 * }</code></pre>
 */
public class VkTimelineSemaphoreSubmitInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        WAITSEMAPHOREVALUECOUNT,
        PWAITSEMAPHOREVALUES,
        SIGNALSEMAPHOREVALUECOUNT,
        PSIGNALSEMAPHOREVALUES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WAITSEMAPHOREVALUECOUNT = layout.offsetof(2);
        PWAITSEMAPHOREVALUES = layout.offsetof(3);
        SIGNALSEMAPHOREVALUECOUNT = layout.offsetof(4);
        PSIGNALSEMAPHOREVALUES = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkTimelineSemaphoreSubmitInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTimelineSemaphoreSubmitInfo(ByteBuffer container) {
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
    /** the number of semaphore wait values specified in {@code pWaitSemaphoreValues}. */
    @NativeType("uint32_t")
    public int waitSemaphoreValueCount() { return nwaitSemaphoreValueCount(address()); }
    /** a pointer to an array of {@code waitSemaphoreValueCount} values for the corresponding semaphores in {@link VkSubmitInfo}{@code ::pWaitSemaphores} to wait for. */
    @Nullable
    @NativeType("uint64_t const *")
    public LongBuffer pWaitSemaphoreValues() { return npWaitSemaphoreValues(address()); }
    /** the number of semaphore signal values specified in {@code pSignalSemaphoreValues}. */
    @NativeType("uint32_t")
    public int signalSemaphoreValueCount() { return nsignalSemaphoreValueCount(address()); }
    /** a pointer to an array {@code signalSemaphoreValueCount} values for the corresponding semaphores in {@link VkSubmitInfo}{@code ::pSignalSemaphores} to set when signaled. */
    @Nullable
    @NativeType("uint64_t const *")
    public LongBuffer pSignalSemaphoreValues() { return npSignalSemaphoreValues(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkTimelineSemaphoreSubmitInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO} value to the {@link #sType} field. */
    public VkTimelineSemaphoreSubmitInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkTimelineSemaphoreSubmitInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #waitSemaphoreValueCount} field. */
    public VkTimelineSemaphoreSubmitInfo waitSemaphoreValueCount(@NativeType("uint32_t") int value) { nwaitSemaphoreValueCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pWaitSemaphoreValues} field. */
    public VkTimelineSemaphoreSubmitInfo pWaitSemaphoreValues(@Nullable @NativeType("uint64_t const *") LongBuffer value) { npWaitSemaphoreValues(address(), value); return this; }
    /** Sets the specified value to the {@link #signalSemaphoreValueCount} field. */
    public VkTimelineSemaphoreSubmitInfo signalSemaphoreValueCount(@NativeType("uint32_t") int value) { nsignalSemaphoreValueCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pSignalSemaphoreValues} field. */
    public VkTimelineSemaphoreSubmitInfo pSignalSemaphoreValues(@Nullable @NativeType("uint64_t const *") LongBuffer value) { npSignalSemaphoreValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkTimelineSemaphoreSubmitInfo set(
        int sType,
        long pNext,
        int waitSemaphoreValueCount,
        @Nullable LongBuffer pWaitSemaphoreValues,
        int signalSemaphoreValueCount,
        @Nullable LongBuffer pSignalSemaphoreValues
    ) {
        sType(sType);
        pNext(pNext);
        waitSemaphoreValueCount(waitSemaphoreValueCount);
        pWaitSemaphoreValues(pWaitSemaphoreValues);
        signalSemaphoreValueCount(signalSemaphoreValueCount);
        pSignalSemaphoreValues(pSignalSemaphoreValues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkTimelineSemaphoreSubmitInfo set(VkTimelineSemaphoreSubmitInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTimelineSemaphoreSubmitInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTimelineSemaphoreSubmitInfo malloc() {
        return wrap(VkTimelineSemaphoreSubmitInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkTimelineSemaphoreSubmitInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTimelineSemaphoreSubmitInfo calloc() {
        return wrap(VkTimelineSemaphoreSubmitInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkTimelineSemaphoreSubmitInfo} instance allocated with {@link BufferUtils}. */
    public static VkTimelineSemaphoreSubmitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkTimelineSemaphoreSubmitInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkTimelineSemaphoreSubmitInfo} instance for the specified memory address. */
    public static VkTimelineSemaphoreSubmitInfo create(long address) {
        return wrap(VkTimelineSemaphoreSubmitInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkTimelineSemaphoreSubmitInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkTimelineSemaphoreSubmitInfo.class, address);
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkTimelineSemaphoreSubmitInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkTimelineSemaphoreSubmitInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkTimelineSemaphoreSubmitInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTimelineSemaphoreSubmitInfo malloc(MemoryStack stack) {
        return wrap(VkTimelineSemaphoreSubmitInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkTimelineSemaphoreSubmitInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTimelineSemaphoreSubmitInfo calloc(MemoryStack stack) {
        return wrap(VkTimelineSemaphoreSubmitInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkTimelineSemaphoreSubmitInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTimelineSemaphoreSubmitInfo.PNEXT); }
    /** Unsafe version of {@link #waitSemaphoreValueCount}. */
    public static int nwaitSemaphoreValueCount(long struct) { return UNSAFE.getInt(null, struct + VkTimelineSemaphoreSubmitInfo.WAITSEMAPHOREVALUECOUNT); }
    /** Unsafe version of {@link #pWaitSemaphoreValues() pWaitSemaphoreValues}. */
    @Nullable public static LongBuffer npWaitSemaphoreValues(long struct) { return memLongBufferSafe(memGetAddress(struct + VkTimelineSemaphoreSubmitInfo.PWAITSEMAPHOREVALUES), nwaitSemaphoreValueCount(struct)); }
    /** Unsafe version of {@link #signalSemaphoreValueCount}. */
    public static int nsignalSemaphoreValueCount(long struct) { return UNSAFE.getInt(null, struct + VkTimelineSemaphoreSubmitInfo.SIGNALSEMAPHOREVALUECOUNT); }
    /** Unsafe version of {@link #pSignalSemaphoreValues() pSignalSemaphoreValues}. */
    @Nullable public static LongBuffer npSignalSemaphoreValues(long struct) { return memLongBufferSafe(memGetAddress(struct + VkTimelineSemaphoreSubmitInfo.PSIGNALSEMAPHOREVALUES), nsignalSemaphoreValueCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkTimelineSemaphoreSubmitInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkTimelineSemaphoreSubmitInfo.PNEXT, value); }
    /** Sets the specified value to the {@code waitSemaphoreValueCount} field of the specified {@code struct}. */
    public static void nwaitSemaphoreValueCount(long struct, int value) { UNSAFE.putInt(null, struct + VkTimelineSemaphoreSubmitInfo.WAITSEMAPHOREVALUECOUNT, value); }
    /** Unsafe version of {@link #pWaitSemaphoreValues(LongBuffer) pWaitSemaphoreValues}. */
    public static void npWaitSemaphoreValues(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkTimelineSemaphoreSubmitInfo.PWAITSEMAPHOREVALUES, memAddressSafe(value)); if (value != null) { nwaitSemaphoreValueCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code signalSemaphoreValueCount} field of the specified {@code struct}. */
    public static void nsignalSemaphoreValueCount(long struct, int value) { UNSAFE.putInt(null, struct + VkTimelineSemaphoreSubmitInfo.SIGNALSEMAPHOREVALUECOUNT, value); }
    /** Unsafe version of {@link #pSignalSemaphoreValues(LongBuffer) pSignalSemaphoreValues}. */
    public static void npSignalSemaphoreValues(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkTimelineSemaphoreSubmitInfo.PSIGNALSEMAPHOREVALUES, memAddressSafe(value)); if (value != null) { nsignalSemaphoreValueCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkTimelineSemaphoreSubmitInfo} structs. */
    public static class Buffer extends StructBuffer<VkTimelineSemaphoreSubmitInfo, Buffer> implements NativeResource {

        private static final VkTimelineSemaphoreSubmitInfo ELEMENT_FACTORY = VkTimelineSemaphoreSubmitInfo.create(-1L);

        /**
         * Creates a new {@code VkTimelineSemaphoreSubmitInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTimelineSemaphoreSubmitInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkTimelineSemaphoreSubmitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkTimelineSemaphoreSubmitInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkTimelineSemaphoreSubmitInfo.nsType(address()); }
        /** @return the value of the {@link VkTimelineSemaphoreSubmitInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkTimelineSemaphoreSubmitInfo.npNext(address()); }
        /** @return the value of the {@link VkTimelineSemaphoreSubmitInfo#waitSemaphoreValueCount} field. */
        @NativeType("uint32_t")
        public int waitSemaphoreValueCount() { return VkTimelineSemaphoreSubmitInfo.nwaitSemaphoreValueCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkTimelineSemaphoreSubmitInfo#pWaitSemaphoreValues} field. */
        @Nullable
        @NativeType("uint64_t const *")
        public LongBuffer pWaitSemaphoreValues() { return VkTimelineSemaphoreSubmitInfo.npWaitSemaphoreValues(address()); }
        /** @return the value of the {@link VkTimelineSemaphoreSubmitInfo#signalSemaphoreValueCount} field. */
        @NativeType("uint32_t")
        public int signalSemaphoreValueCount() { return VkTimelineSemaphoreSubmitInfo.nsignalSemaphoreValueCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkTimelineSemaphoreSubmitInfo#pSignalSemaphoreValues} field. */
        @Nullable
        @NativeType("uint64_t const *")
        public LongBuffer pSignalSemaphoreValues() { return VkTimelineSemaphoreSubmitInfo.npSignalSemaphoreValues(address()); }

        /** Sets the specified value to the {@link VkTimelineSemaphoreSubmitInfo#sType} field. */
        public VkTimelineSemaphoreSubmitInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkTimelineSemaphoreSubmitInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO} value to the {@link VkTimelineSemaphoreSubmitInfo#sType} field. */
        public VkTimelineSemaphoreSubmitInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO); }
        /** Sets the specified value to the {@link VkTimelineSemaphoreSubmitInfo#pNext} field. */
        public VkTimelineSemaphoreSubmitInfo.Buffer pNext(@NativeType("void const *") long value) { VkTimelineSemaphoreSubmitInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkTimelineSemaphoreSubmitInfo#waitSemaphoreValueCount} field. */
        public VkTimelineSemaphoreSubmitInfo.Buffer waitSemaphoreValueCount(@NativeType("uint32_t") int value) { VkTimelineSemaphoreSubmitInfo.nwaitSemaphoreValueCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkTimelineSemaphoreSubmitInfo#pWaitSemaphoreValues} field. */
        public VkTimelineSemaphoreSubmitInfo.Buffer pWaitSemaphoreValues(@Nullable @NativeType("uint64_t const *") LongBuffer value) { VkTimelineSemaphoreSubmitInfo.npWaitSemaphoreValues(address(), value); return this; }
        /** Sets the specified value to the {@link VkTimelineSemaphoreSubmitInfo#signalSemaphoreValueCount} field. */
        public VkTimelineSemaphoreSubmitInfo.Buffer signalSemaphoreValueCount(@NativeType("uint32_t") int value) { VkTimelineSemaphoreSubmitInfo.nsignalSemaphoreValueCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkTimelineSemaphoreSubmitInfo#pSignalSemaphoreValues} field. */
        public VkTimelineSemaphoreSubmitInfo.Buffer pSignalSemaphoreValues(@Nullable @NativeType("uint64_t const *") LongBuffer value) { VkTimelineSemaphoreSubmitInfo.npSignalSemaphoreValues(address(), value); return this; }

    }

}