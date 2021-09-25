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
 * Structure specifying parameters of the acquire.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@link KHRSwapchain#vkAcquireNextImageKHR AcquireNextImageKHR} is used, the device mask is considered to include all physical devices in the logical device.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>{@link KHRSwapchain#vkAcquireNextImage2KHR AcquireNextImage2KHR} signals at most one semaphore, even if the application requests waiting for multiple physical devices to be ready via the {@code deviceMask}. However, only a single physical device <b>can</b> wait on that semaphore, since the semaphore becomes unsignaled when the wait succeeds. For other physical devices to wait for the image to be ready, it is necessary for the application to submit semaphore signal operation(s) to that first physical device to signal additional semaphore(s) after the wait succeeds, which the other physical device(s) <b>can</b> wait upon.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code swapchain} <b>must</b> not be in the retired state</li>
 * <li>If {@code semaphore} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} it <b>must</b> be unsignaled</li>
 * <li>If {@code semaphore} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} it <b>must</b> not have any uncompleted signal or wait operations pending</li>
 * <li>If {@code fence} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} it <b>must</b> be unsignaled and <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
 * <li>{@code semaphore} and {@code fence} <b>must</b> not both be equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>{@code deviceMask} <b>must</b> be a valid device mask</li>
 * <li>{@code deviceMask} <b>must</b> not be zero</li>
 * <li>{@code semaphore} <b>must</b> have a {@code VkSemaphoreType} of {@link VK12#VK_SEMAPHORE_TYPE_BINARY SEMAPHORE_TYPE_BINARY}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSwapchain#VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
 * <li>If {@code semaphore} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
 * <li>If {@code fence} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
 * <li>Each of {@code fence}, {@code semaphore}, and {@code swapchain} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
 * </ul>
 * 
 * <h5>Host Synchronization</h5>
 * 
 * <ul>
 * <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
 * <li>Host access to {@code semaphore} <b>must</b> be externally synchronized</li>
 * <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRSwapchain#vkAcquireNextImage2KHR AcquireNextImage2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAcquireNextImageInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSwapchainKHR {@link #swapchain};
 *     uint64_t {@link #timeout};
 *     VkSemaphore {@link #semaphore};
 *     VkFence {@link #fence};
 *     uint32_t {@link #deviceMask};
 * }</code></pre>
 */
public class VkAcquireNextImageInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SWAPCHAIN,
        TIMEOUT,
        SEMAPHORE,
        FENCE,
        DEVICEMASK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAIN = layout.offsetof(2);
        TIMEOUT = layout.offsetof(3);
        SEMAPHORE = layout.offsetof(4);
        FENCE = layout.offsetof(5);
        DEVICEMASK = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkAcquireNextImageInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAcquireNextImageInfoKHR(ByteBuffer container) {
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
    /** a non-retired swapchain from which an image is acquired. */
    @NativeType("VkSwapchainKHR")
    public long swapchain() { return nswapchain(address()); }
    /** specifies how long the function waits, in nanoseconds, if no image is available. */
    @NativeType("uint64_t")
    public long timeout() { return ntimeout(address()); }
    /** {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a semaphore to signal. */
    @NativeType("VkSemaphore")
    public long semaphore() { return nsemaphore(address()); }
    /** {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a fence to signal. */
    @NativeType("VkFence")
    public long fence() { return nfence(address()); }
    /** a mask of physical devices for which the swapchain image will be ready to use when the semaphore or fence is signaled. */
    @NativeType("uint32_t")
    public int deviceMask() { return ndeviceMask(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAcquireNextImageInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSwapchain#VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR} value to the {@link #sType} field. */
    public VkAcquireNextImageInfoKHR sType$Default() { return sType(KHRSwapchain.VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAcquireNextImageInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #swapchain} field. */
    public VkAcquireNextImageInfoKHR swapchain(@NativeType("VkSwapchainKHR") long value) { nswapchain(address(), value); return this; }
    /** Sets the specified value to the {@link #timeout} field. */
    public VkAcquireNextImageInfoKHR timeout(@NativeType("uint64_t") long value) { ntimeout(address(), value); return this; }
    /** Sets the specified value to the {@link #semaphore} field. */
    public VkAcquireNextImageInfoKHR semaphore(@NativeType("VkSemaphore") long value) { nsemaphore(address(), value); return this; }
    /** Sets the specified value to the {@link #fence} field. */
    public VkAcquireNextImageInfoKHR fence(@NativeType("VkFence") long value) { nfence(address(), value); return this; }
    /** Sets the specified value to the {@link #deviceMask} field. */
    public VkAcquireNextImageInfoKHR deviceMask(@NativeType("uint32_t") int value) { ndeviceMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAcquireNextImageInfoKHR set(
        int sType,
        long pNext,
        long swapchain,
        long timeout,
        long semaphore,
        long fence,
        int deviceMask
    ) {
        sType(sType);
        pNext(pNext);
        swapchain(swapchain);
        timeout(timeout);
        semaphore(semaphore);
        fence(fence);
        deviceMask(deviceMask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAcquireNextImageInfoKHR set(VkAcquireNextImageInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAcquireNextImageInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAcquireNextImageInfoKHR malloc() {
        return wrap(VkAcquireNextImageInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAcquireNextImageInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAcquireNextImageInfoKHR calloc() {
        return wrap(VkAcquireNextImageInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAcquireNextImageInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkAcquireNextImageInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAcquireNextImageInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAcquireNextImageInfoKHR} instance for the specified memory address. */
    public static VkAcquireNextImageInfoKHR create(long address) {
        return wrap(VkAcquireNextImageInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAcquireNextImageInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkAcquireNextImageInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkAcquireNextImageInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAcquireNextImageInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAcquireNextImageInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAcquireNextImageInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAcquireNextImageInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAcquireNextImageInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAcquireNextImageInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAcquireNextImageInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAcquireNextImageInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkAcquireNextImageInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkAcquireNextImageInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkAcquireNextImageInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkAcquireNextImageInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAcquireNextImageInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAcquireNextImageInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAcquireNextImageInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAcquireNextImageInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkAcquireNextImageInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAcquireNextImageInfoKHR malloc(MemoryStack stack) {
        return wrap(VkAcquireNextImageInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAcquireNextImageInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAcquireNextImageInfoKHR calloc(MemoryStack stack) {
        return wrap(VkAcquireNextImageInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAcquireNextImageInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAcquireNextImageInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAcquireNextImageInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAcquireNextImageInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAcquireNextImageInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAcquireNextImageInfoKHR.PNEXT); }
    /** Unsafe version of {@link #swapchain}. */
    public static long nswapchain(long struct) { return UNSAFE.getLong(null, struct + VkAcquireNextImageInfoKHR.SWAPCHAIN); }
    /** Unsafe version of {@link #timeout}. */
    public static long ntimeout(long struct) { return UNSAFE.getLong(null, struct + VkAcquireNextImageInfoKHR.TIMEOUT); }
    /** Unsafe version of {@link #semaphore}. */
    public static long nsemaphore(long struct) { return UNSAFE.getLong(null, struct + VkAcquireNextImageInfoKHR.SEMAPHORE); }
    /** Unsafe version of {@link #fence}. */
    public static long nfence(long struct) { return UNSAFE.getLong(null, struct + VkAcquireNextImageInfoKHR.FENCE); }
    /** Unsafe version of {@link #deviceMask}. */
    public static int ndeviceMask(long struct) { return UNSAFE.getInt(null, struct + VkAcquireNextImageInfoKHR.DEVICEMASK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAcquireNextImageInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAcquireNextImageInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #swapchain(long) swapchain}. */
    public static void nswapchain(long struct, long value) { UNSAFE.putLong(null, struct + VkAcquireNextImageInfoKHR.SWAPCHAIN, value); }
    /** Unsafe version of {@link #timeout(long) timeout}. */
    public static void ntimeout(long struct, long value) { UNSAFE.putLong(null, struct + VkAcquireNextImageInfoKHR.TIMEOUT, value); }
    /** Unsafe version of {@link #semaphore(long) semaphore}. */
    public static void nsemaphore(long struct, long value) { UNSAFE.putLong(null, struct + VkAcquireNextImageInfoKHR.SEMAPHORE, value); }
    /** Unsafe version of {@link #fence(long) fence}. */
    public static void nfence(long struct, long value) { UNSAFE.putLong(null, struct + VkAcquireNextImageInfoKHR.FENCE, value); }
    /** Unsafe version of {@link #deviceMask(int) deviceMask}. */
    public static void ndeviceMask(long struct, int value) { UNSAFE.putInt(null, struct + VkAcquireNextImageInfoKHR.DEVICEMASK, value); }

    // -----------------------------------

    /** An array of {@link VkAcquireNextImageInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkAcquireNextImageInfoKHR, Buffer> implements NativeResource {

        private static final VkAcquireNextImageInfoKHR ELEMENT_FACTORY = VkAcquireNextImageInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkAcquireNextImageInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAcquireNextImageInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkAcquireNextImageInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAcquireNextImageInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAcquireNextImageInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkAcquireNextImageInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAcquireNextImageInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkAcquireNextImageInfoKHR#swapchain} field. */
        @NativeType("VkSwapchainKHR")
        public long swapchain() { return VkAcquireNextImageInfoKHR.nswapchain(address()); }
        /** @return the value of the {@link VkAcquireNextImageInfoKHR#timeout} field. */
        @NativeType("uint64_t")
        public long timeout() { return VkAcquireNextImageInfoKHR.ntimeout(address()); }
        /** @return the value of the {@link VkAcquireNextImageInfoKHR#semaphore} field. */
        @NativeType("VkSemaphore")
        public long semaphore() { return VkAcquireNextImageInfoKHR.nsemaphore(address()); }
        /** @return the value of the {@link VkAcquireNextImageInfoKHR#fence} field. */
        @NativeType("VkFence")
        public long fence() { return VkAcquireNextImageInfoKHR.nfence(address()); }
        /** @return the value of the {@link VkAcquireNextImageInfoKHR#deviceMask} field. */
        @NativeType("uint32_t")
        public int deviceMask() { return VkAcquireNextImageInfoKHR.ndeviceMask(address()); }

        /** Sets the specified value to the {@link VkAcquireNextImageInfoKHR#sType} field. */
        public VkAcquireNextImageInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAcquireNextImageInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRSwapchain#VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR} value to the {@link VkAcquireNextImageInfoKHR#sType} field. */
        public VkAcquireNextImageInfoKHR.Buffer sType$Default() { return sType(KHRSwapchain.VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR); }
        /** Sets the specified value to the {@link VkAcquireNextImageInfoKHR#pNext} field. */
        public VkAcquireNextImageInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkAcquireNextImageInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkAcquireNextImageInfoKHR#swapchain} field. */
        public VkAcquireNextImageInfoKHR.Buffer swapchain(@NativeType("VkSwapchainKHR") long value) { VkAcquireNextImageInfoKHR.nswapchain(address(), value); return this; }
        /** Sets the specified value to the {@link VkAcquireNextImageInfoKHR#timeout} field. */
        public VkAcquireNextImageInfoKHR.Buffer timeout(@NativeType("uint64_t") long value) { VkAcquireNextImageInfoKHR.ntimeout(address(), value); return this; }
        /** Sets the specified value to the {@link VkAcquireNextImageInfoKHR#semaphore} field. */
        public VkAcquireNextImageInfoKHR.Buffer semaphore(@NativeType("VkSemaphore") long value) { VkAcquireNextImageInfoKHR.nsemaphore(address(), value); return this; }
        /** Sets the specified value to the {@link VkAcquireNextImageInfoKHR#fence} field. */
        public VkAcquireNextImageInfoKHR.Buffer fence(@NativeType("VkFence") long value) { VkAcquireNextImageInfoKHR.nfence(address(), value); return this; }
        /** Sets the specified value to the {@link VkAcquireNextImageInfoKHR#deviceMask} field. */
        public VkAcquireNextImageInfoKHR.Buffer deviceMask(@NativeType("uint32_t") int value) { VkAcquireNextImageInfoKHR.ndeviceMask(address(), value); return this; }

    }

}