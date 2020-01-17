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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing parameters of a queue presentation.
 * 
 * <h5>Description</h5>
 * 
 * <p>Before an application <b>can</b> present an image, the image's layout <b>must</b> be transitioned to the {@link KHRSwapchain#VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR} layout, or for a shared presentable image the {@link KHRSharedPresentableImage#VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR IMAGE_LAYOUT_SHARED_PRESENT_KHR} layout.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>When transitioning the image to {@link KHRSharedPresentableImage#VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR IMAGE_LAYOUT_SHARED_PRESENT_KHR} or {@link KHRSwapchain#VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR}, there is no need to delay subsequent processing, or perform any visibility operations (as {@link KHRSwapchain#vkQueuePresentKHR QueuePresentKHR} performs automatic visibility operations). To achieve this, the {@code dstAccessMask} member of the {@link VkImageMemoryBarrier} <b>should</b> be set to 0, and the {@code dstStageMask} parameter <b>should</b> be set to {@link VK10#VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT}.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>Each element of {@code pImageIndices} <b>must</b> be the index of a presentable image acquired from the swapchain specified by the corresponding element of the {@code pSwapchains} array, and the presented image subresource <b>must</b> be in the {@link KHRSwapchain#VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR} or {@link KHRSharedPresentableImage#VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR IMAGE_LAYOUT_SHARED_PRESENT_KHR} layout at the time the operation is executed on a {@code VkDevice}</li>
 * <li>All elements of the {@code pWaitSemaphores} <b>must</b> have a {@code VkSemaphoreType} of {@link VK12#VK_SEMAPHORE_TYPE_BINARY SEMAPHORE_TYPE_BINARY}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSwapchain#VK_STRUCTURE_TYPE_PRESENT_INFO_KHR STRUCTURE_TYPE_PRESENT_INFO_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkDeviceGroupPresentInfoKHR}, {@link VkDisplayPresentInfoKHR}, {@link VkPresentRegionsKHR}, or {@link VkPresentTimesInfoGOOGLE}</li>
 * <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>If {@code waitSemaphoreCount} is not 0, {@code pWaitSemaphores} <b>must</b> be a valid pointer to an array of {@code waitSemaphoreCount} valid {@code VkSemaphore} handles</li>
 * <li>{@code pSwapchains} <b>must</b> be a valid pointer to an array of {@code swapchainCount} valid {@code VkSwapchainKHR} handles</li>
 * <li>{@code pImageIndices} <b>must</b> be a valid pointer to an array of {@code swapchainCount} {@code uint32_t} values</li>
 * <li>If {@code pResults} is not {@code NULL}, {@code pResults} <b>must</b> be a valid pointer to an array of {@code swapchainCount} {@code VkResult} values</li>
 * <li>{@code swapchainCount} <b>must</b> be greater than 0</li>
 * <li>Both of the elements of {@code pSwapchains}, and the elements of {@code pWaitSemaphores} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRSwapchain#vkQueuePresentKHR QueuePresentKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code waitSemaphoreCount} &ndash; the number of semaphores to wait for before issuing the present request. The number <b>may</b> be zero.</li>
 * <li>{@code pWaitSemaphores} &ndash; {@code NULL} or a pointer to an array of {@code VkSemaphore} objects with {@code waitSemaphoreCount} entries, and specifies the semaphores to wait for before issuing the present request.</li>
 * <li>{@code swapchainCount} &ndash; the number of swapchains being presented to by this command.</li>
 * <li>{@code pSwapchains} &ndash; a pointer to an array of {@code VkSwapchainKHR} objects with {@code swapchainCount} entries. A given swapchain <b>must</b> not appear in this list more than once.</li>
 * <li>{@code pImageIndices} &ndash; a pointer to an array of indices into the array of each swapchain&#8217;s presentable images, with {@code swapchainCount} entries. Each entry in this array identifies the image to present on the corresponding entry in the {@code pSwapchains} array.</li>
 * <li>{@code pResults} &ndash; a pointer to an array of {@code VkResult} typed elements with {@code swapchainCount} entries. Applications that do not need per-swapchain results <b>can</b> use {@code NULL} for {@code pResults}. If non-{@code NULL}, each entry in {@code pResults} will be set to the {@code VkResult} for presenting the swapchain corresponding to the same index in {@code pSwapchains}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPresentInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t waitSemaphoreCount;
 *     VkSemaphore const * pWaitSemaphores;
 *     uint32_t swapchainCount;
 *     VkSwapchainKHR const * pSwapchains;
 *     uint32_t const * pImageIndices;
 *     VkResult * pResults;
 * }</code></pre>
 */
public class VkPresentInfoKHR extends Struct implements NativeResource {

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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code waitSemaphoreCount} field. */
    @NativeType("uint32_t")
    public int waitSemaphoreCount() { return nwaitSemaphoreCount(address()); }
    /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphores} field. */
    @Nullable
    @NativeType("VkSemaphore const *")
    public LongBuffer pWaitSemaphores() { return npWaitSemaphores(address()); }
    /** Returns the value of the {@code swapchainCount} field. */
    @NativeType("uint32_t")
    public int swapchainCount() { return nswapchainCount(address()); }
    /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pSwapchains} field. */
    @NativeType("VkSwapchainKHR const *")
    public LongBuffer pSwapchains() { return npSwapchains(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pImageIndices} field. */
    @NativeType("uint32_t const *")
    public IntBuffer pImageIndices() { return npImageIndices(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pResults} field. */
    @Nullable
    @NativeType("VkResult *")
    public IntBuffer pResults() { return npResults(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPresentInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPresentInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
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
        return wrap(VkPresentInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPresentInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPresentInfoKHR calloc() {
        return wrap(VkPresentInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPresentInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPresentInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPresentInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPresentInfoKHR} instance for the specified memory address. */
    public static VkPresentInfoKHR create(long address) {
        return wrap(VkPresentInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPresentInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPresentInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkPresentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPresentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPresentInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPresentInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPresentInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPresentInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPresentInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPresentInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPresentInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPresentInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkPresentInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPresentInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkPresentInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPresentInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPresentInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPresentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPresentInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPresentInfoKHR.PNEXT); }
    /** Unsafe version of {@link #waitSemaphoreCount}. */
    public static int nwaitSemaphoreCount(long struct) { return UNSAFE.getInt(null, struct + VkPresentInfoKHR.WAITSEMAPHORECOUNT); }
    /** Unsafe version of {@link #pWaitSemaphores() pWaitSemaphores}. */
    @Nullable public static LongBuffer npWaitSemaphores(long struct) { return memLongBufferSafe(memGetAddress(struct + VkPresentInfoKHR.PWAITSEMAPHORES), nwaitSemaphoreCount(struct)); }
    /** Unsafe version of {@link #swapchainCount}. */
    public static int nswapchainCount(long struct) { return UNSAFE.getInt(null, struct + VkPresentInfoKHR.SWAPCHAINCOUNT); }
    /** Unsafe version of {@link #pSwapchains() pSwapchains}. */
    public static LongBuffer npSwapchains(long struct) { return memLongBuffer(memGetAddress(struct + VkPresentInfoKHR.PSWAPCHAINS), nswapchainCount(struct)); }
    /** Unsafe version of {@link #pImageIndices() pImageIndices}. */
    public static IntBuffer npImageIndices(long struct) { return memIntBuffer(memGetAddress(struct + VkPresentInfoKHR.PIMAGEINDICES), nswapchainCount(struct)); }
    /** Unsafe version of {@link #pResults() pResults}. */
    @Nullable public static IntBuffer npResults(long struct) { return memIntBufferSafe(memGetAddress(struct + VkPresentInfoKHR.PRESULTS), nswapchainCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPresentInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPresentInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code waitSemaphoreCount} field of the specified {@code struct}. */
    public static void nwaitSemaphoreCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPresentInfoKHR.WAITSEMAPHORECOUNT, value); }
    /** Unsafe version of {@link #pWaitSemaphores(LongBuffer) pWaitSemaphores}. */
    public static void npWaitSemaphores(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkPresentInfoKHR.PWAITSEMAPHORES, memAddressSafe(value)); nwaitSemaphoreCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code swapchainCount} field of the specified {@code struct}. */
    public static void nswapchainCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPresentInfoKHR.SWAPCHAINCOUNT, value); }
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

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkPresentInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPresentInfoKHR, Buffer> implements NativeResource {

        private static final VkPresentInfoKHR ELEMENT_FACTORY = VkPresentInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPresentInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPresentInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPresentInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPresentInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPresentInfoKHR.npNext(address()); }
        /** Returns the value of the {@code waitSemaphoreCount} field. */
        @NativeType("uint32_t")
        public int waitSemaphoreCount() { return VkPresentInfoKHR.nwaitSemaphoreCount(address()); }
        /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphores} field. */
        @Nullable
        @NativeType("VkSemaphore const *")
        public LongBuffer pWaitSemaphores() { return VkPresentInfoKHR.npWaitSemaphores(address()); }
        /** Returns the value of the {@code swapchainCount} field. */
        @NativeType("uint32_t")
        public int swapchainCount() { return VkPresentInfoKHR.nswapchainCount(address()); }
        /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pSwapchains} field. */
        @NativeType("VkSwapchainKHR const *")
        public LongBuffer pSwapchains() { return VkPresentInfoKHR.npSwapchains(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pImageIndices} field. */
        @NativeType("uint32_t const *")
        public IntBuffer pImageIndices() { return VkPresentInfoKHR.npImageIndices(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pResults} field. */
        @Nullable
        @NativeType("VkResult *")
        public IntBuffer pResults() { return VkPresentInfoKHR.npResults(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPresentInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPresentInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPresentInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPresentInfoKHR.npNext(address(), value); return this; }
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