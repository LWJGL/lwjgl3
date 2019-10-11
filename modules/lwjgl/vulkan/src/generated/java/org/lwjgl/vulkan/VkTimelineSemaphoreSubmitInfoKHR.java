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
 * <p>If the semaphore in {@link VkSubmitInfo}{@code ::pWaitSemaphores} or {@link VkSubmitInfo}{@code ::pSignalSemaphores} corresponding to an entry in {@code pWaitSemaphoreValues} or {@code pSignalSemaphoreValues} respectively was not created with a {@code VkSemaphoreTypeKHR} of {@link KHRTimelineSemaphore#VK_SEMAPHORE_TYPE_TIMELINE_KHR SEMAPHORE_TYPE_TIMELINE_KHR}, the implementation <b>must</b> ignore the value in the {@code pWaitSemaphoreValues} or {@code pSignalSemaphoreValues} entry.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRTimelineSemaphore#VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO_KHR STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO_KHR}</li>
 * <li>If {@code waitSemaphoreValueCount} is not 0, and {@code pWaitSemaphoreValues} is not {@code NULL}, {@code pWaitSemaphoreValues} <b>must</b> be a valid pointer to an array of {@code waitSemaphoreValueCount} {@code uint64_t} values</li>
 * <li>If {@code signalSemaphoreValueCount} is not 0, and {@code pSignalSemaphoreValues} is not {@code NULL}, {@code pSignalSemaphoreValues} <b>must</b> be a valid pointer to an array of {@code signalSemaphoreValueCount} {@code uint64_t} values</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code waitSemaphoreValueCount} &ndash; the number of semaphore wait values specified in {@code pWaitSemaphoreValues}.</li>
 * <li>{@code pWaitSemaphoreValues} &ndash; an array of length {@code waitSemaphoreValueCount} containing values for the corresponding semaphores in {@link VkSubmitInfo}{@code ::pWaitSemaphores} to wait for.</li>
 * <li>{@code signalSemaphoreValueCount} &ndash; the number of semaphore signal values specified in {@code pSignalSemaphoreValues}.</li>
 * <li>{@code pSignalSemaphoreValues} &ndash; an array of length {@code signalSemaphoreValueCount} containing values for the corresponding semaphores in {@link VkSubmitInfo}{@code ::pSignalSemaphores} to set when signaled.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkTimelineSemaphoreSubmitInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t waitSemaphoreValueCount;
 *     uint64_t const * pWaitSemaphoreValues;
 *     uint32_t signalSemaphoreValueCount;
 *     uint64_t const * pSignalSemaphoreValues;
 * }</code></pre>
 */
public class VkTimelineSemaphoreSubmitInfoKHR extends Struct implements NativeResource {

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
     * Creates a {@code VkTimelineSemaphoreSubmitInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTimelineSemaphoreSubmitInfoKHR(ByteBuffer container) {
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
    /** Returns the value of the {@code waitSemaphoreValueCount} field. */
    @NativeType("uint32_t")
    public int waitSemaphoreValueCount() { return nwaitSemaphoreValueCount(address()); }
    /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphoreValues} field. */
    @Nullable
    @NativeType("uint64_t const *")
    public LongBuffer pWaitSemaphoreValues() { return npWaitSemaphoreValues(address()); }
    /** Returns the value of the {@code signalSemaphoreValueCount} field. */
    @NativeType("uint32_t")
    public int signalSemaphoreValueCount() { return nsignalSemaphoreValueCount(address()); }
    /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pSignalSemaphoreValues} field. */
    @Nullable
    @NativeType("uint64_t const *")
    public LongBuffer pSignalSemaphoreValues() { return npSignalSemaphoreValues(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkTimelineSemaphoreSubmitInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkTimelineSemaphoreSubmitInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code waitSemaphoreValueCount} field. */
    public VkTimelineSemaphoreSubmitInfoKHR waitSemaphoreValueCount(@NativeType("uint32_t") int value) { nwaitSemaphoreValueCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphoreValues} field. */
    public VkTimelineSemaphoreSubmitInfoKHR pWaitSemaphoreValues(@Nullable @NativeType("uint64_t const *") LongBuffer value) { npWaitSemaphoreValues(address(), value); return this; }
    /** Sets the specified value to the {@code signalSemaphoreValueCount} field. */
    public VkTimelineSemaphoreSubmitInfoKHR signalSemaphoreValueCount(@NativeType("uint32_t") int value) { nsignalSemaphoreValueCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphoreValues} field. */
    public VkTimelineSemaphoreSubmitInfoKHR pSignalSemaphoreValues(@Nullable @NativeType("uint64_t const *") LongBuffer value) { npSignalSemaphoreValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkTimelineSemaphoreSubmitInfoKHR set(
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
    public VkTimelineSemaphoreSubmitInfoKHR set(VkTimelineSemaphoreSubmitInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTimelineSemaphoreSubmitInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTimelineSemaphoreSubmitInfoKHR malloc() {
        return wrap(VkTimelineSemaphoreSubmitInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkTimelineSemaphoreSubmitInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTimelineSemaphoreSubmitInfoKHR calloc() {
        return wrap(VkTimelineSemaphoreSubmitInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkTimelineSemaphoreSubmitInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkTimelineSemaphoreSubmitInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkTimelineSemaphoreSubmitInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkTimelineSemaphoreSubmitInfoKHR} instance for the specified memory address. */
    public static VkTimelineSemaphoreSubmitInfoKHR create(long address) {
        return wrap(VkTimelineSemaphoreSubmitInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkTimelineSemaphoreSubmitInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkTimelineSemaphoreSubmitInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkTimelineSemaphoreSubmitInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkTimelineSemaphoreSubmitInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkTimelineSemaphoreSubmitInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkTimelineSemaphoreSubmitInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkTimelineSemaphoreSubmitInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkTimelineSemaphoreSubmitInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkTimelineSemaphoreSubmitInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTimelineSemaphoreSubmitInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkTimelineSemaphoreSubmitInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkTimelineSemaphoreSubmitInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTimelineSemaphoreSubmitInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkTimelineSemaphoreSubmitInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkTimelineSemaphoreSubmitInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTimelineSemaphoreSubmitInfoKHR.PNEXT); }
    /** Unsafe version of {@link #waitSemaphoreValueCount}. */
    public static int nwaitSemaphoreValueCount(long struct) { return UNSAFE.getInt(null, struct + VkTimelineSemaphoreSubmitInfoKHR.WAITSEMAPHOREVALUECOUNT); }
    /** Unsafe version of {@link #pWaitSemaphoreValues() pWaitSemaphoreValues}. */
    @Nullable public static LongBuffer npWaitSemaphoreValues(long struct) { return memLongBufferSafe(memGetAddress(struct + VkTimelineSemaphoreSubmitInfoKHR.PWAITSEMAPHOREVALUES), nwaitSemaphoreValueCount(struct)); }
    /** Unsafe version of {@link #signalSemaphoreValueCount}. */
    public static int nsignalSemaphoreValueCount(long struct) { return UNSAFE.getInt(null, struct + VkTimelineSemaphoreSubmitInfoKHR.SIGNALSEMAPHOREVALUECOUNT); }
    /** Unsafe version of {@link #pSignalSemaphoreValues() pSignalSemaphoreValues}. */
    @Nullable public static LongBuffer npSignalSemaphoreValues(long struct) { return memLongBufferSafe(memGetAddress(struct + VkTimelineSemaphoreSubmitInfoKHR.PSIGNALSEMAPHOREVALUES), nsignalSemaphoreValueCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkTimelineSemaphoreSubmitInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkTimelineSemaphoreSubmitInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code waitSemaphoreValueCount} field of the specified {@code struct}. */
    public static void nwaitSemaphoreValueCount(long struct, int value) { UNSAFE.putInt(null, struct + VkTimelineSemaphoreSubmitInfoKHR.WAITSEMAPHOREVALUECOUNT, value); }
    /** Unsafe version of {@link #pWaitSemaphoreValues(LongBuffer) pWaitSemaphoreValues}. */
    public static void npWaitSemaphoreValues(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkTimelineSemaphoreSubmitInfoKHR.PWAITSEMAPHOREVALUES, memAddressSafe(value)); if (value != null) { nwaitSemaphoreValueCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code signalSemaphoreValueCount} field of the specified {@code struct}. */
    public static void nsignalSemaphoreValueCount(long struct, int value) { UNSAFE.putInt(null, struct + VkTimelineSemaphoreSubmitInfoKHR.SIGNALSEMAPHOREVALUECOUNT, value); }
    /** Unsafe version of {@link #pSignalSemaphoreValues(LongBuffer) pSignalSemaphoreValues}. */
    public static void npSignalSemaphoreValues(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkTimelineSemaphoreSubmitInfoKHR.PSIGNALSEMAPHOREVALUES, memAddressSafe(value)); if (value != null) { nsignalSemaphoreValueCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkTimelineSemaphoreSubmitInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkTimelineSemaphoreSubmitInfoKHR, Buffer> implements NativeResource {

        private static final VkTimelineSemaphoreSubmitInfoKHR ELEMENT_FACTORY = VkTimelineSemaphoreSubmitInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkTimelineSemaphoreSubmitInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTimelineSemaphoreSubmitInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkTimelineSemaphoreSubmitInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkTimelineSemaphoreSubmitInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkTimelineSemaphoreSubmitInfoKHR.npNext(address()); }
        /** Returns the value of the {@code waitSemaphoreValueCount} field. */
        @NativeType("uint32_t")
        public int waitSemaphoreValueCount() { return VkTimelineSemaphoreSubmitInfoKHR.nwaitSemaphoreValueCount(address()); }
        /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphoreValues} field. */
        @Nullable
        @NativeType("uint64_t const *")
        public LongBuffer pWaitSemaphoreValues() { return VkTimelineSemaphoreSubmitInfoKHR.npWaitSemaphoreValues(address()); }
        /** Returns the value of the {@code signalSemaphoreValueCount} field. */
        @NativeType("uint32_t")
        public int signalSemaphoreValueCount() { return VkTimelineSemaphoreSubmitInfoKHR.nsignalSemaphoreValueCount(address()); }
        /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pSignalSemaphoreValues} field. */
        @Nullable
        @NativeType("uint64_t const *")
        public LongBuffer pSignalSemaphoreValues() { return VkTimelineSemaphoreSubmitInfoKHR.npSignalSemaphoreValues(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkTimelineSemaphoreSubmitInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkTimelineSemaphoreSubmitInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkTimelineSemaphoreSubmitInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkTimelineSemaphoreSubmitInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code waitSemaphoreValueCount} field. */
        public VkTimelineSemaphoreSubmitInfoKHR.Buffer waitSemaphoreValueCount(@NativeType("uint32_t") int value) { VkTimelineSemaphoreSubmitInfoKHR.nwaitSemaphoreValueCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphoreValues} field. */
        public VkTimelineSemaphoreSubmitInfoKHR.Buffer pWaitSemaphoreValues(@Nullable @NativeType("uint64_t const *") LongBuffer value) { VkTimelineSemaphoreSubmitInfoKHR.npWaitSemaphoreValues(address(), value); return this; }
        /** Sets the specified value to the {@code signalSemaphoreValueCount} field. */
        public VkTimelineSemaphoreSubmitInfoKHR.Buffer signalSemaphoreValueCount(@NativeType("uint32_t") int value) { VkTimelineSemaphoreSubmitInfoKHR.nsignalSemaphoreValueCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphoreValues} field. */
        public VkTimelineSemaphoreSubmitInfoKHR.Buffer pSignalSemaphoreValues(@Nullable @NativeType("uint64_t const *") LongBuffer value) { VkTimelineSemaphoreSubmitInfoKHR.npSignalSemaphoreValues(address(), value); return this; }

    }

}