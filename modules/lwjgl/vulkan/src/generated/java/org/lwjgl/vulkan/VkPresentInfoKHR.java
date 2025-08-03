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
 * struct VkPresentInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t waitSemaphoreCount;
 *     VkSemaphore const * pWaitSemaphores;
 *     uint32_t swapchainCount;
 *     VkSwapchainKHR const * pSwapchains;
 *     uint32_t const * pImageIndices;
 *     VkResult * pResults;
 * }}</pre>
 */
public class VkPresentInfoKHR extends Struct<VkPresentInfoKHR> implements NativeResource {

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
        SWAPCHAINCOUNT,
        PSWAPCHAINS,
        PIMAGEINDICES,
        PRESULTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WAITSEMAPHORECOUNT = layout.offsetof(2);
        PWAITSEMAPHORES = layout.offsetof(3);
        SWAPCHAINCOUNT = layout.offsetof(4);
        PSWAPCHAINS = layout.offsetof(5);
        PIMAGEINDICES = layout.offsetof(6);
        PRESULTS = layout.offsetof(7);
    }

    protected VkPresentInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPresentInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPresentInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkPresentInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPresentInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code swapchainCount} field. */
    @NativeType("uint32_t")
    public int swapchainCount() { return nswapchainCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSwapchains} field. */
    @NativeType("VkSwapchainKHR const *")
    public LongBuffer pSwapchains() { return npSwapchains(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pImageIndices} field. */
    @NativeType("uint32_t const *")
    public IntBuffer pImageIndices() { return npImageIndices(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pResults} field. */
    @NativeType("VkResult *")
    public @Nullable IntBuffer pResults() { return npResults(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPresentInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSwapchain#VK_STRUCTURE_TYPE_PRESENT_INFO_KHR STRUCTURE_TYPE_PRESENT_INFO_KHR} value to the {@code sType} field. */
    public VkPresentInfoKHR sType$Default() { return sType(KHRSwapchain.VK_STRUCTURE_TYPE_PRESENT_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPresentInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDeviceGroupPresentInfoKHR} value to the {@code pNext} chain. */
    public VkPresentInfoKHR pNext(VkDeviceGroupPresentInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDisplayPresentInfoKHR} value to the {@code pNext} chain. */
    public VkPresentInfoKHR pNext(VkDisplayPresentInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkFrameBoundaryEXT} value to the {@code pNext} chain. */
    public VkPresentInfoKHR pNext(VkFrameBoundaryEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkFrameBoundaryTensorsARM} value to the {@code pNext} chain. */
    public VkPresentInfoKHR pNext(VkFrameBoundaryTensorsARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPresentId2KHR} value to the {@code pNext} chain. */
    public VkPresentInfoKHR pNext(VkPresentId2KHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPresentIdKHR} value to the {@code pNext} chain. */
    public VkPresentInfoKHR pNext(VkPresentIdKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPresentRegionsKHR} value to the {@code pNext} chain. */
    public VkPresentInfoKHR pNext(VkPresentRegionsKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPresentTimesInfoGOOGLE} value to the {@code pNext} chain. */
    public VkPresentInfoKHR pNext(VkPresentTimesInfoGOOGLE value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSetPresentConfigNV} value to the {@code pNext} chain. */
    public VkPresentInfoKHR pNext(VkSetPresentConfigNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSwapchainPresentFenceInfoEXT} value to the {@code pNext} chain. */
    public VkPresentInfoKHR pNext(VkSwapchainPresentFenceInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSwapchainPresentFenceInfoKHR} value to the {@code pNext} chain. */
    public VkPresentInfoKHR pNext(VkSwapchainPresentFenceInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSwapchainPresentModeInfoEXT} value to the {@code pNext} chain. */
    public VkPresentInfoKHR pNext(VkSwapchainPresentModeInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSwapchainPresentModeInfoKHR} value to the {@code pNext} chain. */
    public VkPresentInfoKHR pNext(VkSwapchainPresentModeInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphores} field. */
    public VkPresentInfoKHR pWaitSemaphores(@Nullable @NativeType("VkSemaphore const *") LongBuffer value) { npWaitSemaphores(address(), value); return this; }
    /** Sets the specified value to the {@code swapchainCount} field. */
    public VkPresentInfoKHR swapchainCount(@NativeType("uint32_t") int value) { nswapchainCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pSwapchains} field. */
    public VkPresentInfoKHR pSwapchains(@NativeType("VkSwapchainKHR const *") LongBuffer value) { npSwapchains(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pImageIndices} field. */
    public VkPresentInfoKHR pImageIndices(@NativeType("uint32_t const *") IntBuffer value) { npImageIndices(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pResults} field. */
    public VkPresentInfoKHR pResults(@Nullable @NativeType("VkResult *") IntBuffer value) { npResults(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPresentInfoKHR set(
        int sType,
        long pNext,
        @Nullable LongBuffer pWaitSemaphores,
        int swapchainCount,
        LongBuffer pSwapchains,
        IntBuffer pImageIndices,
        @Nullable IntBuffer pResults
    ) {
        sType(sType);
        pNext(pNext);
        pWaitSemaphores(pWaitSemaphores);
        swapchainCount(swapchainCount);
        pSwapchains(pSwapchains);
        pImageIndices(pImageIndices);
        pResults(pResults);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPresentInfoKHR set(VkPresentInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPresentInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPresentInfoKHR malloc() {
        return new VkPresentInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPresentInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPresentInfoKHR calloc() {
        return new VkPresentInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPresentInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPresentInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPresentInfoKHR} instance for the specified memory address. */
    public static VkPresentInfoKHR create(long address) {
        return new VkPresentInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPresentInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkPresentInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkPresentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPresentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPresentInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPresentInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPresentInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPresentInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentInfoKHR malloc(MemoryStack stack) {
        return new VkPresentInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPresentInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentInfoKHR calloc(MemoryStack stack) {
        return new VkPresentInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPresentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPresentInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPresentInfoKHR.PNEXT); }
    /** Unsafe version of {@link #waitSemaphoreCount}. */
    public static int nwaitSemaphoreCount(long struct) { return memGetInt(struct + VkPresentInfoKHR.WAITSEMAPHORECOUNT); }
    /** Unsafe version of {@link #pWaitSemaphores() pWaitSemaphores}. */
    public static @Nullable LongBuffer npWaitSemaphores(long struct) { return memLongBufferSafe(memGetAddress(struct + VkPresentInfoKHR.PWAITSEMAPHORES), nwaitSemaphoreCount(struct)); }
    /** Unsafe version of {@link #swapchainCount}. */
    public static int nswapchainCount(long struct) { return memGetInt(struct + VkPresentInfoKHR.SWAPCHAINCOUNT); }
    /** Unsafe version of {@link #pSwapchains() pSwapchains}. */
    public static LongBuffer npSwapchains(long struct) { return memLongBuffer(memGetAddress(struct + VkPresentInfoKHR.PSWAPCHAINS), nswapchainCount(struct)); }
    /** Unsafe version of {@link #pImageIndices() pImageIndices}. */
    public static IntBuffer npImageIndices(long struct) { return memIntBuffer(memGetAddress(struct + VkPresentInfoKHR.PIMAGEINDICES), nswapchainCount(struct)); }
    /** Unsafe version of {@link #pResults() pResults}. */
    public static @Nullable IntBuffer npResults(long struct) { return memIntBufferSafe(memGetAddress(struct + VkPresentInfoKHR.PRESULTS), nswapchainCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPresentInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPresentInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code waitSemaphoreCount} field of the specified {@code struct}. */
    public static void nwaitSemaphoreCount(long struct, int value) { memPutInt(struct + VkPresentInfoKHR.WAITSEMAPHORECOUNT, value); }
    /** Unsafe version of {@link #pWaitSemaphores(LongBuffer) pWaitSemaphores}. */
    public static void npWaitSemaphores(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkPresentInfoKHR.PWAITSEMAPHORES, memAddressSafe(value)); nwaitSemaphoreCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code swapchainCount} field of the specified {@code struct}. */
    public static void nswapchainCount(long struct, int value) { memPutInt(struct + VkPresentInfoKHR.SWAPCHAINCOUNT, value); }
    /** Unsafe version of {@link #pSwapchains(LongBuffer) pSwapchains}. */
    public static void npSwapchains(long struct, LongBuffer value) { memPutAddress(struct + VkPresentInfoKHR.PSWAPCHAINS, memAddress(value)); }
    /** Unsafe version of {@link #pImageIndices(IntBuffer) pImageIndices}. */
    public static void npImageIndices(long struct, IntBuffer value) { memPutAddress(struct + VkPresentInfoKHR.PIMAGEINDICES, memAddress(value)); }
    /** Unsafe version of {@link #pResults(IntBuffer) pResults}. */
    public static void npResults(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkPresentInfoKHR.PRESULTS, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nwaitSemaphoreCount(struct) != 0) {
            check(memGetAddress(struct + VkPresentInfoKHR.PWAITSEMAPHORES));
        }
        check(memGetAddress(struct + VkPresentInfoKHR.PSWAPCHAINS));
        check(memGetAddress(struct + VkPresentInfoKHR.PIMAGEINDICES));
    }

    // -----------------------------------

    /** An array of {@link VkPresentInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPresentInfoKHR, Buffer> implements NativeResource {

        private static final VkPresentInfoKHR ELEMENT_FACTORY = VkPresentInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPresentInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPresentInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPresentInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPresentInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPresentInfoKHR.npNext(address()); }
        /** @return the value of the {@code waitSemaphoreCount} field. */
        @NativeType("uint32_t")
        public int waitSemaphoreCount() { return VkPresentInfoKHR.nwaitSemaphoreCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphores} field. */
        @NativeType("VkSemaphore const *")
        public @Nullable LongBuffer pWaitSemaphores() { return VkPresentInfoKHR.npWaitSemaphores(address()); }
        /** @return the value of the {@code swapchainCount} field. */
        @NativeType("uint32_t")
        public int swapchainCount() { return VkPresentInfoKHR.nswapchainCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSwapchains} field. */
        @NativeType("VkSwapchainKHR const *")
        public LongBuffer pSwapchains() { return VkPresentInfoKHR.npSwapchains(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pImageIndices} field. */
        @NativeType("uint32_t const *")
        public IntBuffer pImageIndices() { return VkPresentInfoKHR.npImageIndices(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pResults} field. */
        @NativeType("VkResult *")
        public @Nullable IntBuffer pResults() { return VkPresentInfoKHR.npResults(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPresentInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPresentInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRSwapchain#VK_STRUCTURE_TYPE_PRESENT_INFO_KHR STRUCTURE_TYPE_PRESENT_INFO_KHR} value to the {@code sType} field. */
        public VkPresentInfoKHR.Buffer sType$Default() { return sType(KHRSwapchain.VK_STRUCTURE_TYPE_PRESENT_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPresentInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPresentInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDeviceGroupPresentInfoKHR} value to the {@code pNext} chain. */
        public VkPresentInfoKHR.Buffer pNext(VkDeviceGroupPresentInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDisplayPresentInfoKHR} value to the {@code pNext} chain. */
        public VkPresentInfoKHR.Buffer pNext(VkDisplayPresentInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkFrameBoundaryEXT} value to the {@code pNext} chain. */
        public VkPresentInfoKHR.Buffer pNext(VkFrameBoundaryEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkFrameBoundaryTensorsARM} value to the {@code pNext} chain. */
        public VkPresentInfoKHR.Buffer pNext(VkFrameBoundaryTensorsARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPresentId2KHR} value to the {@code pNext} chain. */
        public VkPresentInfoKHR.Buffer pNext(VkPresentId2KHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPresentIdKHR} value to the {@code pNext} chain. */
        public VkPresentInfoKHR.Buffer pNext(VkPresentIdKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPresentRegionsKHR} value to the {@code pNext} chain. */
        public VkPresentInfoKHR.Buffer pNext(VkPresentRegionsKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPresentTimesInfoGOOGLE} value to the {@code pNext} chain. */
        public VkPresentInfoKHR.Buffer pNext(VkPresentTimesInfoGOOGLE value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSetPresentConfigNV} value to the {@code pNext} chain. */
        public VkPresentInfoKHR.Buffer pNext(VkSetPresentConfigNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSwapchainPresentFenceInfoEXT} value to the {@code pNext} chain. */
        public VkPresentInfoKHR.Buffer pNext(VkSwapchainPresentFenceInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSwapchainPresentFenceInfoKHR} value to the {@code pNext} chain. */
        public VkPresentInfoKHR.Buffer pNext(VkSwapchainPresentFenceInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSwapchainPresentModeInfoEXT} value to the {@code pNext} chain. */
        public VkPresentInfoKHR.Buffer pNext(VkSwapchainPresentModeInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSwapchainPresentModeInfoKHR} value to the {@code pNext} chain. */
        public VkPresentInfoKHR.Buffer pNext(VkSwapchainPresentModeInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphores} field. */
        public VkPresentInfoKHR.Buffer pWaitSemaphores(@Nullable @NativeType("VkSemaphore const *") LongBuffer value) { VkPresentInfoKHR.npWaitSemaphores(address(), value); return this; }
        /** Sets the specified value to the {@code swapchainCount} field. */
        public VkPresentInfoKHR.Buffer swapchainCount(@NativeType("uint32_t") int value) { VkPresentInfoKHR.nswapchainCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pSwapchains} field. */
        public VkPresentInfoKHR.Buffer pSwapchains(@NativeType("VkSwapchainKHR const *") LongBuffer value) { VkPresentInfoKHR.npSwapchains(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pImageIndices} field. */
        public VkPresentInfoKHR.Buffer pImageIndices(@NativeType("uint32_t const *") IntBuffer value) { VkPresentInfoKHR.npImageIndices(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pResults} field. */
        public VkPresentInfoKHR.Buffer pResults(@Nullable @NativeType("VkResult *") IntBuffer value) { VkPresentInfoKHR.npResults(address(), value); return this; }

    }

}