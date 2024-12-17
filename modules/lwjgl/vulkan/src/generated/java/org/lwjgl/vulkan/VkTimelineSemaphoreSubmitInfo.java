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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkTimelineSemaphoreSubmitInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t waitSemaphoreValueCount;
 *     uint64_t const * pWaitSemaphoreValues;
 *     uint32_t signalSemaphoreValueCount;
 *     uint64_t const * pSignalSemaphoreValues;
 * }}</pre>
 */
public class VkTimelineSemaphoreSubmitInfo extends Struct<VkTimelineSemaphoreSubmitInfo> implements NativeResource {

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

    protected VkTimelineSemaphoreSubmitInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkTimelineSemaphoreSubmitInfo create(long address, @Nullable ByteBuffer container) {
        return new VkTimelineSemaphoreSubmitInfo(address, container);
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code waitSemaphoreValueCount} field. */
    @NativeType("uint32_t")
    public int waitSemaphoreValueCount() { return nwaitSemaphoreValueCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphoreValues} field. */
    @NativeType("uint64_t const *")
    public @Nullable LongBuffer pWaitSemaphoreValues() { return npWaitSemaphoreValues(address()); }
    /** @return the value of the {@code signalSemaphoreValueCount} field. */
    @NativeType("uint32_t")
    public int signalSemaphoreValueCount() { return nsignalSemaphoreValueCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSignalSemaphoreValues} field. */
    @NativeType("uint64_t const *")
    public @Nullable LongBuffer pSignalSemaphoreValues() { return npSignalSemaphoreValues(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkTimelineSemaphoreSubmitInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO} value to the {@code sType} field. */
    public VkTimelineSemaphoreSubmitInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkTimelineSemaphoreSubmitInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code waitSemaphoreValueCount} field. */
    public VkTimelineSemaphoreSubmitInfo waitSemaphoreValueCount(@NativeType("uint32_t") int value) { nwaitSemaphoreValueCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphoreValues} field. */
    public VkTimelineSemaphoreSubmitInfo pWaitSemaphoreValues(@Nullable @NativeType("uint64_t const *") LongBuffer value) { npWaitSemaphoreValues(address(), value); return this; }
    /** Sets the specified value to the {@code signalSemaphoreValueCount} field. */
    public VkTimelineSemaphoreSubmitInfo signalSemaphoreValueCount(@NativeType("uint32_t") int value) { nsignalSemaphoreValueCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphoreValues} field. */
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
        return new VkTimelineSemaphoreSubmitInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkTimelineSemaphoreSubmitInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTimelineSemaphoreSubmitInfo calloc() {
        return new VkTimelineSemaphoreSubmitInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkTimelineSemaphoreSubmitInfo} instance allocated with {@link BufferUtils}. */
    public static VkTimelineSemaphoreSubmitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTimelineSemaphoreSubmitInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkTimelineSemaphoreSubmitInfo} instance for the specified memory address. */
    public static VkTimelineSemaphoreSubmitInfo create(long address) {
        return new VkTimelineSemaphoreSubmitInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkTimelineSemaphoreSubmitInfo createSafe(long address) {
        return address == NULL ? null : new VkTimelineSemaphoreSubmitInfo(address, null);
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkTimelineSemaphoreSubmitInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkTimelineSemaphoreSubmitInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkTimelineSemaphoreSubmitInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTimelineSemaphoreSubmitInfo malloc(MemoryStack stack) {
        return new VkTimelineSemaphoreSubmitInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkTimelineSemaphoreSubmitInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTimelineSemaphoreSubmitInfo calloc(MemoryStack stack) {
        return new VkTimelineSemaphoreSubmitInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkTimelineSemaphoreSubmitInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTimelineSemaphoreSubmitInfo.PNEXT); }
    /** Unsafe version of {@link #waitSemaphoreValueCount}. */
    public static int nwaitSemaphoreValueCount(long struct) { return memGetInt(struct + VkTimelineSemaphoreSubmitInfo.WAITSEMAPHOREVALUECOUNT); }
    /** Unsafe version of {@link #pWaitSemaphoreValues() pWaitSemaphoreValues}. */
    public static @Nullable LongBuffer npWaitSemaphoreValues(long struct) { return memLongBufferSafe(memGetAddress(struct + VkTimelineSemaphoreSubmitInfo.PWAITSEMAPHOREVALUES), nwaitSemaphoreValueCount(struct)); }
    /** Unsafe version of {@link #signalSemaphoreValueCount}. */
    public static int nsignalSemaphoreValueCount(long struct) { return memGetInt(struct + VkTimelineSemaphoreSubmitInfo.SIGNALSEMAPHOREVALUECOUNT); }
    /** Unsafe version of {@link #pSignalSemaphoreValues() pSignalSemaphoreValues}. */
    public static @Nullable LongBuffer npSignalSemaphoreValues(long struct) { return memLongBufferSafe(memGetAddress(struct + VkTimelineSemaphoreSubmitInfo.PSIGNALSEMAPHOREVALUES), nsignalSemaphoreValueCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkTimelineSemaphoreSubmitInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkTimelineSemaphoreSubmitInfo.PNEXT, value); }
    /** Sets the specified value to the {@code waitSemaphoreValueCount} field of the specified {@code struct}. */
    public static void nwaitSemaphoreValueCount(long struct, int value) { memPutInt(struct + VkTimelineSemaphoreSubmitInfo.WAITSEMAPHOREVALUECOUNT, value); }
    /** Unsafe version of {@link #pWaitSemaphoreValues(LongBuffer) pWaitSemaphoreValues}. */
    public static void npWaitSemaphoreValues(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkTimelineSemaphoreSubmitInfo.PWAITSEMAPHOREVALUES, memAddressSafe(value)); if (value != null) { nwaitSemaphoreValueCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code signalSemaphoreValueCount} field of the specified {@code struct}. */
    public static void nsignalSemaphoreValueCount(long struct, int value) { memPutInt(struct + VkTimelineSemaphoreSubmitInfo.SIGNALSEMAPHOREVALUECOUNT, value); }
    /** Unsafe version of {@link #pSignalSemaphoreValues(LongBuffer) pSignalSemaphoreValues}. */
    public static void npSignalSemaphoreValues(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkTimelineSemaphoreSubmitInfo.PSIGNALSEMAPHOREVALUES, memAddressSafe(value)); if (value != null) { nsignalSemaphoreValueCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkTimelineSemaphoreSubmitInfo} structs. */
    public static class Buffer extends StructBuffer<VkTimelineSemaphoreSubmitInfo, Buffer> implements NativeResource {

        private static final VkTimelineSemaphoreSubmitInfo ELEMENT_FACTORY = VkTimelineSemaphoreSubmitInfo.create(-1L);

        /**
         * Creates a new {@code VkTimelineSemaphoreSubmitInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTimelineSemaphoreSubmitInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkTimelineSemaphoreSubmitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkTimelineSemaphoreSubmitInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkTimelineSemaphoreSubmitInfo.npNext(address()); }
        /** @return the value of the {@code waitSemaphoreValueCount} field. */
        @NativeType("uint32_t")
        public int waitSemaphoreValueCount() { return VkTimelineSemaphoreSubmitInfo.nwaitSemaphoreValueCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphoreValues} field. */
        @NativeType("uint64_t const *")
        public @Nullable LongBuffer pWaitSemaphoreValues() { return VkTimelineSemaphoreSubmitInfo.npWaitSemaphoreValues(address()); }
        /** @return the value of the {@code signalSemaphoreValueCount} field. */
        @NativeType("uint32_t")
        public int signalSemaphoreValueCount() { return VkTimelineSemaphoreSubmitInfo.nsignalSemaphoreValueCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSignalSemaphoreValues} field. */
        @NativeType("uint64_t const *")
        public @Nullable LongBuffer pSignalSemaphoreValues() { return VkTimelineSemaphoreSubmitInfo.npSignalSemaphoreValues(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkTimelineSemaphoreSubmitInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkTimelineSemaphoreSubmitInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO} value to the {@code sType} field. */
        public VkTimelineSemaphoreSubmitInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkTimelineSemaphoreSubmitInfo.Buffer pNext(@NativeType("void const *") long value) { VkTimelineSemaphoreSubmitInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code waitSemaphoreValueCount} field. */
        public VkTimelineSemaphoreSubmitInfo.Buffer waitSemaphoreValueCount(@NativeType("uint32_t") int value) { VkTimelineSemaphoreSubmitInfo.nwaitSemaphoreValueCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphoreValues} field. */
        public VkTimelineSemaphoreSubmitInfo.Buffer pWaitSemaphoreValues(@Nullable @NativeType("uint64_t const *") LongBuffer value) { VkTimelineSemaphoreSubmitInfo.npWaitSemaphoreValues(address(), value); return this; }
        /** Sets the specified value to the {@code signalSemaphoreValueCount} field. */
        public VkTimelineSemaphoreSubmitInfo.Buffer signalSemaphoreValueCount(@NativeType("uint32_t") int value) { VkTimelineSemaphoreSubmitInfo.nsignalSemaphoreValueCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphoreValues} field. */
        public VkTimelineSemaphoreSubmitInfo.Buffer pSignalSemaphoreValues(@Nullable @NativeType("uint64_t const *") LongBuffer value) { VkTimelineSemaphoreSubmitInfo.npSignalSemaphoreValues(address(), value); return this; }

    }

}