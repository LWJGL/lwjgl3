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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkSubmitInfo2 {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSubmitFlags flags;
 *     uint32_t waitSemaphoreInfoCount;
 *     {@link VkSemaphoreSubmitInfo VkSemaphoreSubmitInfo} const * pWaitSemaphoreInfos;
 *     uint32_t commandBufferInfoCount;
 *     {@link VkCommandBufferSubmitInfo VkCommandBufferSubmitInfo} const * pCommandBufferInfos;
 *     uint32_t signalSemaphoreInfoCount;
 *     {@link VkSemaphoreSubmitInfo VkSemaphoreSubmitInfo} const * pSignalSemaphoreInfos;
 * }}</pre>
 */
public class VkSubmitInfo2 extends Struct<VkSubmitInfo2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        WAITSEMAPHOREINFOCOUNT,
        PWAITSEMAPHOREINFOS,
        COMMANDBUFFERINFOCOUNT,
        PCOMMANDBUFFERINFOS,
        SIGNALSEMAPHOREINFOCOUNT,
        PSIGNALSEMAPHOREINFOS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
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
        FLAGS = layout.offsetof(2);
        WAITSEMAPHOREINFOCOUNT = layout.offsetof(3);
        PWAITSEMAPHOREINFOS = layout.offsetof(4);
        COMMANDBUFFERINFOCOUNT = layout.offsetof(5);
        PCOMMANDBUFFERINFOS = layout.offsetof(6);
        SIGNALSEMAPHOREINFOCOUNT = layout.offsetof(7);
        PSIGNALSEMAPHOREINFOS = layout.offsetof(8);
    }

    protected VkSubmitInfo2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubmitInfo2 create(long address, @Nullable ByteBuffer container) {
        return new VkSubmitInfo2(address, container);
    }

    /**
     * Creates a {@code VkSubmitInfo2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubmitInfo2(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkSubmitFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code waitSemaphoreInfoCount} field. */
    @NativeType("uint32_t")
    public int waitSemaphoreInfoCount() { return nwaitSemaphoreInfoCount(address()); }
    /** @return a {@link VkSemaphoreSubmitInfo.Buffer} view of the struct array pointed to by the {@code pWaitSemaphoreInfos} field. */
    @NativeType("VkSemaphoreSubmitInfo const *")
    public VkSemaphoreSubmitInfo.@Nullable Buffer pWaitSemaphoreInfos() { return npWaitSemaphoreInfos(address()); }
    /** @return the value of the {@code commandBufferInfoCount} field. */
    @NativeType("uint32_t")
    public int commandBufferInfoCount() { return ncommandBufferInfoCount(address()); }
    /** @return a {@link VkCommandBufferSubmitInfo.Buffer} view of the struct array pointed to by the {@code pCommandBufferInfos} field. */
    @NativeType("VkCommandBufferSubmitInfo const *")
    public VkCommandBufferSubmitInfo.@Nullable Buffer pCommandBufferInfos() { return npCommandBufferInfos(address()); }
    /** @return the value of the {@code signalSemaphoreInfoCount} field. */
    @NativeType("uint32_t")
    public int signalSemaphoreInfoCount() { return nsignalSemaphoreInfoCount(address()); }
    /** @return a {@link VkSemaphoreSubmitInfo.Buffer} view of the struct array pointed to by the {@code pSignalSemaphoreInfos} field. */
    @NativeType("VkSemaphoreSubmitInfo const *")
    public VkSemaphoreSubmitInfo.@Nullable Buffer pSignalSemaphoreInfos() { return npSignalSemaphoreInfos(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSubmitInfo2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_SUBMIT_INFO_2 STRUCTURE_TYPE_SUBMIT_INFO_2} value to the {@code sType} field. */
    public VkSubmitInfo2 sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_SUBMIT_INFO_2); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSubmitInfo2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkFrameBoundaryEXT} value to the {@code pNext} chain. */
    public VkSubmitInfo2 pNext(VkFrameBoundaryEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkLatencySubmissionPresentIdNV} value to the {@code pNext} chain. */
    public VkSubmitInfo2 pNext(VkLatencySubmissionPresentIdNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPerformanceQuerySubmitInfoKHR} value to the {@code pNext} chain. */
    public VkSubmitInfo2 pNext(VkPerformanceQuerySubmitInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkWin32KeyedMutexAcquireReleaseInfoKHR} value to the {@code pNext} chain. */
    public VkSubmitInfo2 pNext(VkWin32KeyedMutexAcquireReleaseInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkWin32KeyedMutexAcquireReleaseInfoNV} value to the {@code pNext} chain. */
    public VkSubmitInfo2 pNext(VkWin32KeyedMutexAcquireReleaseInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkSubmitInfo2 flags(@NativeType("VkSubmitFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkSemaphoreSubmitInfo.Buffer} to the {@code pWaitSemaphoreInfos} field. */
    public VkSubmitInfo2 pWaitSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.@Nullable Buffer value) { npWaitSemaphoreInfos(address(), value); return this; }
    /** Sets the address of the specified {@link VkCommandBufferSubmitInfo.Buffer} to the {@code pCommandBufferInfos} field. */
    public VkSubmitInfo2 pCommandBufferInfos(@NativeType("VkCommandBufferSubmitInfo const *") VkCommandBufferSubmitInfo.@Nullable Buffer value) { npCommandBufferInfos(address(), value); return this; }
    /** Sets the address of the specified {@link VkSemaphoreSubmitInfo.Buffer} to the {@code pSignalSemaphoreInfos} field. */
    public VkSubmitInfo2 pSignalSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.@Nullable Buffer value) { npSignalSemaphoreInfos(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubmitInfo2 set(
        int sType,
        long pNext,
        int flags,
        VkSemaphoreSubmitInfo.@Nullable Buffer pWaitSemaphoreInfos,
        VkCommandBufferSubmitInfo.@Nullable Buffer pCommandBufferInfos,
        VkSemaphoreSubmitInfo.@Nullable Buffer pSignalSemaphoreInfos
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pWaitSemaphoreInfos(pWaitSemaphoreInfos);
        pCommandBufferInfos(pCommandBufferInfos);
        pSignalSemaphoreInfos(pSignalSemaphoreInfos);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubmitInfo2 set(VkSubmitInfo2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubmitInfo2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubmitInfo2 malloc() {
        return new VkSubmitInfo2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubmitInfo2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubmitInfo2 calloc() {
        return new VkSubmitInfo2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubmitInfo2} instance allocated with {@link BufferUtils}. */
    public static VkSubmitInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubmitInfo2(memAddress(container), container);
    }

    /** Returns a new {@code VkSubmitInfo2} instance for the specified memory address. */
    public static VkSubmitInfo2 create(long address) {
        return new VkSubmitInfo2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSubmitInfo2 createSafe(long address) {
        return address == NULL ? null : new VkSubmitInfo2(address, null);
    }

    /**
     * Returns a new {@link VkSubmitInfo2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubmitInfo2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubmitInfo2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubmitInfo2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSubmitInfo2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSubmitInfo2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubmitInfo2 malloc(MemoryStack stack) {
        return new VkSubmitInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubmitInfo2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubmitInfo2 calloc(MemoryStack stack) {
        return new VkSubmitInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubmitInfo2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubmitInfo2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSubmitInfo2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubmitInfo2.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkSubmitInfo2.FLAGS); }
    /** Unsafe version of {@link #waitSemaphoreInfoCount}. */
    public static int nwaitSemaphoreInfoCount(long struct) { return memGetInt(struct + VkSubmitInfo2.WAITSEMAPHOREINFOCOUNT); }
    /** Unsafe version of {@link #pWaitSemaphoreInfos}. */
    public static VkSemaphoreSubmitInfo.@Nullable Buffer npWaitSemaphoreInfos(long struct) { return VkSemaphoreSubmitInfo.createSafe(memGetAddress(struct + VkSubmitInfo2.PWAITSEMAPHOREINFOS), nwaitSemaphoreInfoCount(struct)); }
    /** Unsafe version of {@link #commandBufferInfoCount}. */
    public static int ncommandBufferInfoCount(long struct) { return memGetInt(struct + VkSubmitInfo2.COMMANDBUFFERINFOCOUNT); }
    /** Unsafe version of {@link #pCommandBufferInfos}. */
    public static VkCommandBufferSubmitInfo.@Nullable Buffer npCommandBufferInfos(long struct) { return VkCommandBufferSubmitInfo.createSafe(memGetAddress(struct + VkSubmitInfo2.PCOMMANDBUFFERINFOS), ncommandBufferInfoCount(struct)); }
    /** Unsafe version of {@link #signalSemaphoreInfoCount}. */
    public static int nsignalSemaphoreInfoCount(long struct) { return memGetInt(struct + VkSubmitInfo2.SIGNALSEMAPHOREINFOCOUNT); }
    /** Unsafe version of {@link #pSignalSemaphoreInfos}. */
    public static VkSemaphoreSubmitInfo.@Nullable Buffer npSignalSemaphoreInfos(long struct) { return VkSemaphoreSubmitInfo.createSafe(memGetAddress(struct + VkSubmitInfo2.PSIGNALSEMAPHOREINFOS), nsignalSemaphoreInfoCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSubmitInfo2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubmitInfo2.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkSubmitInfo2.FLAGS, value); }
    /** Sets the specified value to the {@code waitSemaphoreInfoCount} field of the specified {@code struct}. */
    public static void nwaitSemaphoreInfoCount(long struct, int value) { memPutInt(struct + VkSubmitInfo2.WAITSEMAPHOREINFOCOUNT, value); }
    /** Unsafe version of {@link #pWaitSemaphoreInfos(VkSemaphoreSubmitInfo.Buffer) pWaitSemaphoreInfos}. */
    public static void npWaitSemaphoreInfos(long struct, VkSemaphoreSubmitInfo.@Nullable Buffer value) { memPutAddress(struct + VkSubmitInfo2.PWAITSEMAPHOREINFOS, memAddressSafe(value)); nwaitSemaphoreInfoCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code commandBufferInfoCount} field of the specified {@code struct}. */
    public static void ncommandBufferInfoCount(long struct, int value) { memPutInt(struct + VkSubmitInfo2.COMMANDBUFFERINFOCOUNT, value); }
    /** Unsafe version of {@link #pCommandBufferInfos(VkCommandBufferSubmitInfo.Buffer) pCommandBufferInfos}. */
    public static void npCommandBufferInfos(long struct, VkCommandBufferSubmitInfo.@Nullable Buffer value) { memPutAddress(struct + VkSubmitInfo2.PCOMMANDBUFFERINFOS, memAddressSafe(value)); ncommandBufferInfoCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code signalSemaphoreInfoCount} field of the specified {@code struct}. */
    public static void nsignalSemaphoreInfoCount(long struct, int value) { memPutInt(struct + VkSubmitInfo2.SIGNALSEMAPHOREINFOCOUNT, value); }
    /** Unsafe version of {@link #pSignalSemaphoreInfos(VkSemaphoreSubmitInfo.Buffer) pSignalSemaphoreInfos}. */
    public static void npSignalSemaphoreInfos(long struct, VkSemaphoreSubmitInfo.@Nullable Buffer value) { memPutAddress(struct + VkSubmitInfo2.PSIGNALSEMAPHOREINFOS, memAddressSafe(value)); nsignalSemaphoreInfoCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nwaitSemaphoreInfoCount(struct) != 0) {
            check(memGetAddress(struct + VkSubmitInfo2.PWAITSEMAPHOREINFOS));
        }
        int commandBufferInfoCount = ncommandBufferInfoCount(struct);
        if (commandBufferInfoCount != 0) {
            long pCommandBufferInfos = memGetAddress(struct + VkSubmitInfo2.PCOMMANDBUFFERINFOS);
            check(pCommandBufferInfos);
            validate(pCommandBufferInfos, commandBufferInfoCount, VkCommandBufferSubmitInfo.SIZEOF, VkCommandBufferSubmitInfo::validate);
        }
        if (nsignalSemaphoreInfoCount(struct) != 0) {
            check(memGetAddress(struct + VkSubmitInfo2.PSIGNALSEMAPHOREINFOS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkSubmitInfo2} structs. */
    public static class Buffer extends StructBuffer<VkSubmitInfo2, Buffer> implements NativeResource {

        private static final VkSubmitInfo2 ELEMENT_FACTORY = VkSubmitInfo2.create(-1L);

        /**
         * Creates a new {@code VkSubmitInfo2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubmitInfo2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubmitInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubmitInfo2.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSubmitInfo2.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkSubmitFlags")
        public int flags() { return VkSubmitInfo2.nflags(address()); }
        /** @return the value of the {@code waitSemaphoreInfoCount} field. */
        @NativeType("uint32_t")
        public int waitSemaphoreInfoCount() { return VkSubmitInfo2.nwaitSemaphoreInfoCount(address()); }
        /** @return a {@link VkSemaphoreSubmitInfo.Buffer} view of the struct array pointed to by the {@code pWaitSemaphoreInfos} field. */
        @NativeType("VkSemaphoreSubmitInfo const *")
        public VkSemaphoreSubmitInfo.@Nullable Buffer pWaitSemaphoreInfos() { return VkSubmitInfo2.npWaitSemaphoreInfos(address()); }
        /** @return the value of the {@code commandBufferInfoCount} field. */
        @NativeType("uint32_t")
        public int commandBufferInfoCount() { return VkSubmitInfo2.ncommandBufferInfoCount(address()); }
        /** @return a {@link VkCommandBufferSubmitInfo.Buffer} view of the struct array pointed to by the {@code pCommandBufferInfos} field. */
        @NativeType("VkCommandBufferSubmitInfo const *")
        public VkCommandBufferSubmitInfo.@Nullable Buffer pCommandBufferInfos() { return VkSubmitInfo2.npCommandBufferInfos(address()); }
        /** @return the value of the {@code signalSemaphoreInfoCount} field. */
        @NativeType("uint32_t")
        public int signalSemaphoreInfoCount() { return VkSubmitInfo2.nsignalSemaphoreInfoCount(address()); }
        /** @return a {@link VkSemaphoreSubmitInfo.Buffer} view of the struct array pointed to by the {@code pSignalSemaphoreInfos} field. */
        @NativeType("VkSemaphoreSubmitInfo const *")
        public VkSemaphoreSubmitInfo.@Nullable Buffer pSignalSemaphoreInfos() { return VkSubmitInfo2.npSignalSemaphoreInfos(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSubmitInfo2.Buffer sType(@NativeType("VkStructureType") int value) { VkSubmitInfo2.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_SUBMIT_INFO_2 STRUCTURE_TYPE_SUBMIT_INFO_2} value to the {@code sType} field. */
        public VkSubmitInfo2.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_SUBMIT_INFO_2); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSubmitInfo2.Buffer pNext(@NativeType("void const *") long value) { VkSubmitInfo2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkFrameBoundaryEXT} value to the {@code pNext} chain. */
        public VkSubmitInfo2.Buffer pNext(VkFrameBoundaryEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkLatencySubmissionPresentIdNV} value to the {@code pNext} chain. */
        public VkSubmitInfo2.Buffer pNext(VkLatencySubmissionPresentIdNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPerformanceQuerySubmitInfoKHR} value to the {@code pNext} chain. */
        public VkSubmitInfo2.Buffer pNext(VkPerformanceQuerySubmitInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkWin32KeyedMutexAcquireReleaseInfoKHR} value to the {@code pNext} chain. */
        public VkSubmitInfo2.Buffer pNext(VkWin32KeyedMutexAcquireReleaseInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkWin32KeyedMutexAcquireReleaseInfoNV} value to the {@code pNext} chain. */
        public VkSubmitInfo2.Buffer pNext(VkWin32KeyedMutexAcquireReleaseInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkSubmitInfo2.Buffer flags(@NativeType("VkSubmitFlags") int value) { VkSubmitInfo2.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkSemaphoreSubmitInfo.Buffer} to the {@code pWaitSemaphoreInfos} field. */
        public VkSubmitInfo2.Buffer pWaitSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.@Nullable Buffer value) { VkSubmitInfo2.npWaitSemaphoreInfos(address(), value); return this; }
        /** Sets the address of the specified {@link VkCommandBufferSubmitInfo.Buffer} to the {@code pCommandBufferInfos} field. */
        public VkSubmitInfo2.Buffer pCommandBufferInfos(@NativeType("VkCommandBufferSubmitInfo const *") VkCommandBufferSubmitInfo.@Nullable Buffer value) { VkSubmitInfo2.npCommandBufferInfos(address(), value); return this; }
        /** Sets the address of the specified {@link VkSemaphoreSubmitInfo.Buffer} to the {@code pSignalSemaphoreInfos} field. */
        public VkSubmitInfo2.Buffer pSignalSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.@Nullable Buffer value) { VkSubmitInfo2.npSignalSemaphoreInfos(address(), value); return this; }

    }

}