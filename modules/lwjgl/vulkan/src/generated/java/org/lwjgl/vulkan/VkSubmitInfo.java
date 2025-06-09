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
 * struct VkSubmitInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t waitSemaphoreCount;
 *     VkSemaphore const * pWaitSemaphores;
 *     VkPipelineStageFlags const * pWaitDstStageMask;
 *     uint32_t commandBufferCount;
 *     VkCommandBuffer const * pCommandBuffers;
 *     uint32_t signalSemaphoreCount;
 *     VkSemaphore const * pSignalSemaphores;
 * }}</pre>
 */
public class VkSubmitInfo extends Struct<VkSubmitInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        WAITSEMAPHORECOUNT,
        PWAITSEMAPHORES,
        PWAITDSTSTAGEMASK,
        COMMANDBUFFERCOUNT,
        PCOMMANDBUFFERS,
        SIGNALSEMAPHORECOUNT,
        PSIGNALSEMAPHORES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
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
        WAITSEMAPHORECOUNT = layout.offsetof(2);
        PWAITSEMAPHORES = layout.offsetof(3);
        PWAITDSTSTAGEMASK = layout.offsetof(4);
        COMMANDBUFFERCOUNT = layout.offsetof(5);
        PCOMMANDBUFFERS = layout.offsetof(6);
        SIGNALSEMAPHORECOUNT = layout.offsetof(7);
        PSIGNALSEMAPHORES = layout.offsetof(8);
    }

    protected VkSubmitInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubmitInfo create(long address, @Nullable ByteBuffer container) {
        return new VkSubmitInfo(address, container);
    }

    /**
     * Creates a {@code VkSubmitInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubmitInfo(ByteBuffer container) {
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
    /** @return the value of the {@code waitSemaphoreCount} field. */
    @NativeType("uint32_t")
    public int waitSemaphoreCount() { return nwaitSemaphoreCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphores} field. */
    @NativeType("VkSemaphore const *")
    public @Nullable LongBuffer pWaitSemaphores() { return npWaitSemaphores(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pWaitDstStageMask} field. */
    @NativeType("VkPipelineStageFlags const *")
    public @Nullable IntBuffer pWaitDstStageMask() { return npWaitDstStageMask(address()); }
    /** @return the value of the {@code commandBufferCount} field. */
    @NativeType("uint32_t")
    public int commandBufferCount() { return ncommandBufferCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code pCommandBuffers} field. */
    @NativeType("VkCommandBuffer const *")
    public @Nullable PointerBuffer pCommandBuffers() { return npCommandBuffers(address()); }
    /** @return the value of the {@code signalSemaphoreCount} field. */
    @NativeType("uint32_t")
    public int signalSemaphoreCount() { return nsignalSemaphoreCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSignalSemaphores} field. */
    @NativeType("VkSemaphore const *")
    public @Nullable LongBuffer pSignalSemaphores() { return npSignalSemaphores(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSubmitInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_SUBMIT_INFO STRUCTURE_TYPE_SUBMIT_INFO} value to the {@code sType} field. */
    public VkSubmitInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_SUBMIT_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSubmitInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkAmigoProfilingSubmitInfoSEC} value to the {@code pNext} chain. */
    public VkSubmitInfo pNext(VkAmigoProfilingSubmitInfoSEC value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkD3D12FenceSubmitInfoKHR} value to the {@code pNext} chain. */
    public VkSubmitInfo pNext(VkD3D12FenceSubmitInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDeviceGroupSubmitInfo} value to the {@code pNext} chain. */
    public VkSubmitInfo pNext(VkDeviceGroupSubmitInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDeviceGroupSubmitInfoKHR} value to the {@code pNext} chain. */
    public VkSubmitInfo pNext(VkDeviceGroupSubmitInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkFrameBoundaryEXT} value to the {@code pNext} chain. */
    public VkSubmitInfo pNext(VkFrameBoundaryEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkFrameBoundaryTensorsARM} value to the {@code pNext} chain. */
    public VkSubmitInfo pNext(VkFrameBoundaryTensorsARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkLatencySubmissionPresentIdNV} value to the {@code pNext} chain. */
    public VkSubmitInfo pNext(VkLatencySubmissionPresentIdNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPerformanceQuerySubmitInfoKHR} value to the {@code pNext} chain. */
    public VkSubmitInfo pNext(VkPerformanceQuerySubmitInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkProtectedSubmitInfo} value to the {@code pNext} chain. */
    public VkSubmitInfo pNext(VkProtectedSubmitInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkTimelineSemaphoreSubmitInfo} value to the {@code pNext} chain. */
    public VkSubmitInfo pNext(VkTimelineSemaphoreSubmitInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkTimelineSemaphoreSubmitInfoKHR} value to the {@code pNext} chain. */
    public VkSubmitInfo pNext(VkTimelineSemaphoreSubmitInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkWin32KeyedMutexAcquireReleaseInfoKHR} value to the {@code pNext} chain. */
    public VkSubmitInfo pNext(VkWin32KeyedMutexAcquireReleaseInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkWin32KeyedMutexAcquireReleaseInfoNV} value to the {@code pNext} chain. */
    public VkSubmitInfo pNext(VkWin32KeyedMutexAcquireReleaseInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code waitSemaphoreCount} field. */
    public VkSubmitInfo waitSemaphoreCount(@NativeType("uint32_t") int value) { nwaitSemaphoreCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphores} field. */
    public VkSubmitInfo pWaitSemaphores(@Nullable @NativeType("VkSemaphore const *") LongBuffer value) { npWaitSemaphores(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pWaitDstStageMask} field. */
    public VkSubmitInfo pWaitDstStageMask(@Nullable @NativeType("VkPipelineStageFlags const *") IntBuffer value) { npWaitDstStageMask(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code pCommandBuffers} field. */
    public VkSubmitInfo pCommandBuffers(@Nullable @NativeType("VkCommandBuffer const *") PointerBuffer value) { npCommandBuffers(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphores} field. */
    public VkSubmitInfo pSignalSemaphores(@Nullable @NativeType("VkSemaphore const *") LongBuffer value) { npSignalSemaphores(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubmitInfo set(
        int sType,
        long pNext,
        int waitSemaphoreCount,
        @Nullable LongBuffer pWaitSemaphores,
        @Nullable IntBuffer pWaitDstStageMask,
        @Nullable PointerBuffer pCommandBuffers,
        @Nullable LongBuffer pSignalSemaphores
    ) {
        sType(sType);
        pNext(pNext);
        waitSemaphoreCount(waitSemaphoreCount);
        pWaitSemaphores(pWaitSemaphores);
        pWaitDstStageMask(pWaitDstStageMask);
        pCommandBuffers(pCommandBuffers);
        pSignalSemaphores(pSignalSemaphores);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubmitInfo set(VkSubmitInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubmitInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubmitInfo malloc() {
        return new VkSubmitInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubmitInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubmitInfo calloc() {
        return new VkSubmitInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubmitInfo} instance allocated with {@link BufferUtils}. */
    public static VkSubmitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubmitInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkSubmitInfo} instance for the specified memory address. */
    public static VkSubmitInfo create(long address) {
        return new VkSubmitInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSubmitInfo createSafe(long address) {
        return address == NULL ? null : new VkSubmitInfo(address, null);
    }

    /**
     * Returns a new {@link VkSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubmitInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubmitInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSubmitInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSubmitInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSubmitInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSubmitInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSubmitInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubmitInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubmitInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubmitInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubmitInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSubmitInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubmitInfo malloc(MemoryStack stack) {
        return new VkSubmitInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubmitInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubmitInfo calloc(MemoryStack stack) {
        return new VkSubmitInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSubmitInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubmitInfo.PNEXT); }
    /** Unsafe version of {@link #waitSemaphoreCount}. */
    public static int nwaitSemaphoreCount(long struct) { return memGetInt(struct + VkSubmitInfo.WAITSEMAPHORECOUNT); }
    /** Unsafe version of {@link #pWaitSemaphores() pWaitSemaphores}. */
    public static @Nullable LongBuffer npWaitSemaphores(long struct) { return memLongBufferSafe(memGetAddress(struct + VkSubmitInfo.PWAITSEMAPHORES), nwaitSemaphoreCount(struct)); }
    /** Unsafe version of {@link #pWaitDstStageMask() pWaitDstStageMask}. */
    public static @Nullable IntBuffer npWaitDstStageMask(long struct) { return memIntBufferSafe(memGetAddress(struct + VkSubmitInfo.PWAITDSTSTAGEMASK), nwaitSemaphoreCount(struct)); }
    /** Unsafe version of {@link #commandBufferCount}. */
    public static int ncommandBufferCount(long struct) { return memGetInt(struct + VkSubmitInfo.COMMANDBUFFERCOUNT); }
    /** Unsafe version of {@link #pCommandBuffers() pCommandBuffers}. */
    public static @Nullable PointerBuffer npCommandBuffers(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkSubmitInfo.PCOMMANDBUFFERS), ncommandBufferCount(struct)); }
    /** Unsafe version of {@link #signalSemaphoreCount}. */
    public static int nsignalSemaphoreCount(long struct) { return memGetInt(struct + VkSubmitInfo.SIGNALSEMAPHORECOUNT); }
    /** Unsafe version of {@link #pSignalSemaphores() pSignalSemaphores}. */
    public static @Nullable LongBuffer npSignalSemaphores(long struct) { return memLongBufferSafe(memGetAddress(struct + VkSubmitInfo.PSIGNALSEMAPHORES), nsignalSemaphoreCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSubmitInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubmitInfo.PNEXT, value); }
    /** Sets the specified value to the {@code waitSemaphoreCount} field of the specified {@code struct}. */
    public static void nwaitSemaphoreCount(long struct, int value) { memPutInt(struct + VkSubmitInfo.WAITSEMAPHORECOUNT, value); }
    /** Unsafe version of {@link #pWaitSemaphores(LongBuffer) pWaitSemaphores}. */
    public static void npWaitSemaphores(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkSubmitInfo.PWAITSEMAPHORES, memAddressSafe(value)); }
    /** Unsafe version of {@link #pWaitDstStageMask(IntBuffer) pWaitDstStageMask}. */
    public static void npWaitDstStageMask(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkSubmitInfo.PWAITDSTSTAGEMASK, memAddressSafe(value)); }
    /** Sets the specified value to the {@code commandBufferCount} field of the specified {@code struct}. */
    public static void ncommandBufferCount(long struct, int value) { memPutInt(struct + VkSubmitInfo.COMMANDBUFFERCOUNT, value); }
    /** Unsafe version of {@link #pCommandBuffers(PointerBuffer) pCommandBuffers}. */
    public static void npCommandBuffers(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkSubmitInfo.PCOMMANDBUFFERS, memAddressSafe(value)); ncommandBufferCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code signalSemaphoreCount} field of the specified {@code struct}. */
    public static void nsignalSemaphoreCount(long struct, int value) { memPutInt(struct + VkSubmitInfo.SIGNALSEMAPHORECOUNT, value); }
    /** Unsafe version of {@link #pSignalSemaphores(LongBuffer) pSignalSemaphores}. */
    public static void npSignalSemaphores(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkSubmitInfo.PSIGNALSEMAPHORES, memAddressSafe(value)); nsignalSemaphoreCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nwaitSemaphoreCount(struct) != 0) {
            check(memGetAddress(struct + VkSubmitInfo.PWAITSEMAPHORES));
        }
        if (ncommandBufferCount(struct) != 0) {
            check(memGetAddress(struct + VkSubmitInfo.PCOMMANDBUFFERS));
        }
        if (nsignalSemaphoreCount(struct) != 0) {
            check(memGetAddress(struct + VkSubmitInfo.PSIGNALSEMAPHORES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkSubmitInfo} structs. */
    public static class Buffer extends StructBuffer<VkSubmitInfo, Buffer> implements NativeResource {

        private static final VkSubmitInfo ELEMENT_FACTORY = VkSubmitInfo.create(-1L);

        /**
         * Creates a new {@code VkSubmitInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubmitInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubmitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubmitInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSubmitInfo.npNext(address()); }
        /** @return the value of the {@code waitSemaphoreCount} field. */
        @NativeType("uint32_t")
        public int waitSemaphoreCount() { return VkSubmitInfo.nwaitSemaphoreCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphores} field. */
        @NativeType("VkSemaphore const *")
        public @Nullable LongBuffer pWaitSemaphores() { return VkSubmitInfo.npWaitSemaphores(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pWaitDstStageMask} field. */
        @NativeType("VkPipelineStageFlags const *")
        public @Nullable IntBuffer pWaitDstStageMask() { return VkSubmitInfo.npWaitDstStageMask(address()); }
        /** @return the value of the {@code commandBufferCount} field. */
        @NativeType("uint32_t")
        public int commandBufferCount() { return VkSubmitInfo.ncommandBufferCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code pCommandBuffers} field. */
        @NativeType("VkCommandBuffer const *")
        public @Nullable PointerBuffer pCommandBuffers() { return VkSubmitInfo.npCommandBuffers(address()); }
        /** @return the value of the {@code signalSemaphoreCount} field. */
        @NativeType("uint32_t")
        public int signalSemaphoreCount() { return VkSubmitInfo.nsignalSemaphoreCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSignalSemaphores} field. */
        @NativeType("VkSemaphore const *")
        public @Nullable LongBuffer pSignalSemaphores() { return VkSubmitInfo.npSignalSemaphores(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSubmitInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSubmitInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_SUBMIT_INFO STRUCTURE_TYPE_SUBMIT_INFO} value to the {@code sType} field. */
        public VkSubmitInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_SUBMIT_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSubmitInfo.Buffer pNext(@NativeType("void const *") long value) { VkSubmitInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkAmigoProfilingSubmitInfoSEC} value to the {@code pNext} chain. */
        public VkSubmitInfo.Buffer pNext(VkAmigoProfilingSubmitInfoSEC value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkD3D12FenceSubmitInfoKHR} value to the {@code pNext} chain. */
        public VkSubmitInfo.Buffer pNext(VkD3D12FenceSubmitInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDeviceGroupSubmitInfo} value to the {@code pNext} chain. */
        public VkSubmitInfo.Buffer pNext(VkDeviceGroupSubmitInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDeviceGroupSubmitInfoKHR} value to the {@code pNext} chain. */
        public VkSubmitInfo.Buffer pNext(VkDeviceGroupSubmitInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkFrameBoundaryEXT} value to the {@code pNext} chain. */
        public VkSubmitInfo.Buffer pNext(VkFrameBoundaryEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkFrameBoundaryTensorsARM} value to the {@code pNext} chain. */
        public VkSubmitInfo.Buffer pNext(VkFrameBoundaryTensorsARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkLatencySubmissionPresentIdNV} value to the {@code pNext} chain. */
        public VkSubmitInfo.Buffer pNext(VkLatencySubmissionPresentIdNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPerformanceQuerySubmitInfoKHR} value to the {@code pNext} chain. */
        public VkSubmitInfo.Buffer pNext(VkPerformanceQuerySubmitInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkProtectedSubmitInfo} value to the {@code pNext} chain. */
        public VkSubmitInfo.Buffer pNext(VkProtectedSubmitInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkTimelineSemaphoreSubmitInfo} value to the {@code pNext} chain. */
        public VkSubmitInfo.Buffer pNext(VkTimelineSemaphoreSubmitInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkTimelineSemaphoreSubmitInfoKHR} value to the {@code pNext} chain. */
        public VkSubmitInfo.Buffer pNext(VkTimelineSemaphoreSubmitInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkWin32KeyedMutexAcquireReleaseInfoKHR} value to the {@code pNext} chain. */
        public VkSubmitInfo.Buffer pNext(VkWin32KeyedMutexAcquireReleaseInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkWin32KeyedMutexAcquireReleaseInfoNV} value to the {@code pNext} chain. */
        public VkSubmitInfo.Buffer pNext(VkWin32KeyedMutexAcquireReleaseInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code waitSemaphoreCount} field. */
        public VkSubmitInfo.Buffer waitSemaphoreCount(@NativeType("uint32_t") int value) { VkSubmitInfo.nwaitSemaphoreCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphores} field. */
        public VkSubmitInfo.Buffer pWaitSemaphores(@Nullable @NativeType("VkSemaphore const *") LongBuffer value) { VkSubmitInfo.npWaitSemaphores(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pWaitDstStageMask} field. */
        public VkSubmitInfo.Buffer pWaitDstStageMask(@Nullable @NativeType("VkPipelineStageFlags const *") IntBuffer value) { VkSubmitInfo.npWaitDstStageMask(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code pCommandBuffers} field. */
        public VkSubmitInfo.Buffer pCommandBuffers(@Nullable @NativeType("VkCommandBuffer const *") PointerBuffer value) { VkSubmitInfo.npCommandBuffers(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphores} field. */
        public VkSubmitInfo.Buffer pSignalSemaphores(@Nullable @NativeType("VkSemaphore const *") LongBuffer value) { VkSubmitInfo.npSignalSemaphores(address(), value); return this; }

    }

}