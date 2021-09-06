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
 * Structure specifying a queue submit operation.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the same semaphore is used as the {@code semaphore} member of both an element of {@code pSignalSemaphoreInfos} and {@code pWaitSemaphoreInfos}, and that semaphore is a timeline semaphore, the {@code value} member of the {@code pSignalSemaphoreInfos} element <b>must</b> be greater than the {@code value} member of the {@code pWaitSemaphoreInfos} element</li>
 * <li>If the {@code semaphore} member of any element of {@code pSignalSemaphoreInfos} is a timeline semaphore, the {@code value} member of that element <b>must</b> have a value greater than the current value of the semaphore when the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-semaphores-signaling">semaphore signal operation</a> is executed</li>
 * <li>If the {@code semaphore} member of any element of {@code pSignalSemaphoreInfos} is a timeline semaphore, the {@code value} member of that element <b>must</b> have a value which does not differ from the current value of the semaphore or the value of any outstanding semaphore wait or signal operation on that semaphore by more than <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-maxTimelineSemaphoreValueDifference">{@code maxTimelineSemaphoreValueDifference}</a></li>
 * <li>If the {@code semaphore} member of any element of {@code pWaitSemaphoreInfos} is a timeline semaphore, the {@code value} member of that element <b>must</b> have a value which does not differ from the current value of the semaphore or the value of any outstanding semaphore wait or signal operation on that semaphore by more than <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-maxTimelineSemaphoreValueDifference">{@code maxTimelineSemaphoreValueDifference}</a></li>
 * <li>If the protected memory feature is not enabled, {@code flags} <b>must</b> not include {@link KHRSynchronization2#VK_SUBMIT_PROTECTED_BIT_KHR SUBMIT_PROTECTED_BIT_KHR}</li>
 * <li>If {@code flags} includes {@link KHRSynchronization2#VK_SUBMIT_PROTECTED_BIT_KHR SUBMIT_PROTECTED_BIT_KHR}, all elements of {@code pCommandBuffers} <b>must</b> be protected command buffers</li>
 * <li>If {@code flags} does not include {@link KHRSynchronization2#VK_SUBMIT_PROTECTED_BIT_KHR SUBMIT_PROTECTED_BIT_KHR}, each element of {@code pCommandBuffers} <b>must</b> not be a protected command buffer</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSynchronization2#VK_STRUCTURE_TYPE_SUBMIT_INFO_2_KHR STRUCTURE_TYPE_SUBMIT_INFO_2_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkPerformanceQuerySubmitInfoKHR}, {@link VkWin32KeyedMutexAcquireReleaseInfoKHR}, or {@link VkWin32KeyedMutexAcquireReleaseInfoNV}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkSubmitFlagBitsKHR} values</li>
 * <li>If {@code waitSemaphoreInfoCount} is not 0, {@code pWaitSemaphoreInfos} <b>must</b> be a valid pointer to an array of {@code waitSemaphoreInfoCount} valid {@link VkSemaphoreSubmitInfoKHR} structures</li>
 * <li>If {@code commandBufferInfoCount} is not 0, {@code pCommandBufferInfos} <b>must</b> be a valid pointer to an array of {@code commandBufferInfoCount} valid {@link VkCommandBufferSubmitInfoKHR} structures</li>
 * <li>If {@code signalSemaphoreInfoCount} is not 0, {@code pSignalSemaphoreInfos} <b>must</b> be a valid pointer to an array of {@code signalSemaphoreInfoCount} valid {@link VkSemaphoreSubmitInfoKHR} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkCommandBufferSubmitInfoKHR}, {@link VkSemaphoreSubmitInfoKHR}, {@link KHRSynchronization2#vkQueueSubmit2KHR QueueSubmit2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubmitInfo2KHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSubmitFlagsKHR {@link #flags};
 *     uint32_t {@link #waitSemaphoreInfoCount};
 *     {@link VkSemaphoreSubmitInfoKHR VkSemaphoreSubmitInfoKHR} const * {@link #pWaitSemaphoreInfos};
 *     uint32_t {@link #commandBufferInfoCount};
 *     {@link VkCommandBufferSubmitInfoKHR VkCommandBufferSubmitInfoKHR} const * {@link #pCommandBufferInfos};
 *     uint32_t {@link #signalSemaphoreInfoCount};
 *     {@link VkSemaphoreSubmitInfoKHR VkSemaphoreSubmitInfoKHR} const * {@link #pSignalSemaphoreInfos};
 * }</code></pre>
 */
public class VkSubmitInfo2KHR extends Struct implements NativeResource {

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

    /**
     * Creates a {@code VkSubmitInfo2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubmitInfo2KHR(ByteBuffer container) {
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
    /** a bitmask of {@code VkSubmitFlagBitsKHR}. */
    @NativeType("VkSubmitFlagsKHR")
    public int flags() { return nflags(address()); }
    /** the number of elements in {@code pWaitSemaphoreInfos}. */
    @NativeType("uint32_t")
    public int waitSemaphoreInfoCount() { return nwaitSemaphoreInfoCount(address()); }
    /** a pointer to an array of {@link VkSemaphoreSubmitInfoKHR} structures defining <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-semaphores-waiting">semaphore wait operations</a>. */
    @Nullable
    @NativeType("VkSemaphoreSubmitInfoKHR const *")
    public VkSemaphoreSubmitInfoKHR.Buffer pWaitSemaphoreInfos() { return npWaitSemaphoreInfos(address()); }
    /** the number of elements in {@code pCommandBufferInfos} and the number of command buffers to execute in the batch. */
    @NativeType("uint32_t")
    public int commandBufferInfoCount() { return ncommandBufferInfoCount(address()); }
    /** a pointer to an array of {@link VkCommandBufferSubmitInfoKHR} structures describing command buffers to execute in the batch. */
    @Nullable
    @NativeType("VkCommandBufferSubmitInfoKHR const *")
    public VkCommandBufferSubmitInfoKHR.Buffer pCommandBufferInfos() { return npCommandBufferInfos(address()); }
    /** the number of elements in {@code pSignalSemaphoreInfos}. */
    @NativeType("uint32_t")
    public int signalSemaphoreInfoCount() { return nsignalSemaphoreInfoCount(address()); }
    /** a pointer to an array of {@link VkSemaphoreSubmitInfoKHR} describing <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-semaphores-signaling">semaphore signal operations</a>. */
    @Nullable
    @NativeType("VkSemaphoreSubmitInfoKHR const *")
    public VkSemaphoreSubmitInfoKHR.Buffer pSignalSemaphoreInfos() { return npSignalSemaphoreInfos(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSubmitInfo2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSubmitInfo2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkSubmitInfo2KHR flags(@NativeType("VkSubmitFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkSemaphoreSubmitInfoKHR.Buffer} to the {@link #pWaitSemaphoreInfos} field. */
    public VkSubmitInfo2KHR pWaitSemaphoreInfos(@Nullable @NativeType("VkSemaphoreSubmitInfoKHR const *") VkSemaphoreSubmitInfoKHR.Buffer value) { npWaitSemaphoreInfos(address(), value); return this; }
    /** Sets the address of the specified {@link VkCommandBufferSubmitInfoKHR.Buffer} to the {@link #pCommandBufferInfos} field. */
    public VkSubmitInfo2KHR pCommandBufferInfos(@Nullable @NativeType("VkCommandBufferSubmitInfoKHR const *") VkCommandBufferSubmitInfoKHR.Buffer value) { npCommandBufferInfos(address(), value); return this; }
    /** Sets the address of the specified {@link VkSemaphoreSubmitInfoKHR.Buffer} to the {@link #pSignalSemaphoreInfos} field. */
    public VkSubmitInfo2KHR pSignalSemaphoreInfos(@Nullable @NativeType("VkSemaphoreSubmitInfoKHR const *") VkSemaphoreSubmitInfoKHR.Buffer value) { npSignalSemaphoreInfos(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubmitInfo2KHR set(
        int sType,
        long pNext,
        int flags,
        @Nullable VkSemaphoreSubmitInfoKHR.Buffer pWaitSemaphoreInfos,
        @Nullable VkCommandBufferSubmitInfoKHR.Buffer pCommandBufferInfos,
        @Nullable VkSemaphoreSubmitInfoKHR.Buffer pSignalSemaphoreInfos
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
    public VkSubmitInfo2KHR set(VkSubmitInfo2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubmitInfo2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubmitInfo2KHR malloc() {
        return wrap(VkSubmitInfo2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSubmitInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubmitInfo2KHR calloc() {
        return wrap(VkSubmitInfo2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSubmitInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkSubmitInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSubmitInfo2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSubmitInfo2KHR} instance for the specified memory address. */
    public static VkSubmitInfo2KHR create(long address) {
        return wrap(VkSubmitInfo2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubmitInfo2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkSubmitInfo2KHR.class, address);
    }

    /**
     * Returns a new {@link VkSubmitInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubmitInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubmitInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSubmitInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubmitInfo2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code VkSubmitInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubmitInfo2KHR malloc(MemoryStack stack) {
        return wrap(VkSubmitInfo2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSubmitInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubmitInfo2KHR calloc(MemoryStack stack) {
        return wrap(VkSubmitInfo2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubmitInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubmitInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSubmitInfo2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubmitInfo2KHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkSubmitInfo2KHR.FLAGS); }
    /** Unsafe version of {@link #waitSemaphoreInfoCount}. */
    public static int nwaitSemaphoreInfoCount(long struct) { return UNSAFE.getInt(null, struct + VkSubmitInfo2KHR.WAITSEMAPHOREINFOCOUNT); }
    /** Unsafe version of {@link #pWaitSemaphoreInfos}. */
    @Nullable public static VkSemaphoreSubmitInfoKHR.Buffer npWaitSemaphoreInfos(long struct) { return VkSemaphoreSubmitInfoKHR.createSafe(memGetAddress(struct + VkSubmitInfo2KHR.PWAITSEMAPHOREINFOS), nwaitSemaphoreInfoCount(struct)); }
    /** Unsafe version of {@link #commandBufferInfoCount}. */
    public static int ncommandBufferInfoCount(long struct) { return UNSAFE.getInt(null, struct + VkSubmitInfo2KHR.COMMANDBUFFERINFOCOUNT); }
    /** Unsafe version of {@link #pCommandBufferInfos}. */
    @Nullable public static VkCommandBufferSubmitInfoKHR.Buffer npCommandBufferInfos(long struct) { return VkCommandBufferSubmitInfoKHR.createSafe(memGetAddress(struct + VkSubmitInfo2KHR.PCOMMANDBUFFERINFOS), ncommandBufferInfoCount(struct)); }
    /** Unsafe version of {@link #signalSemaphoreInfoCount}. */
    public static int nsignalSemaphoreInfoCount(long struct) { return UNSAFE.getInt(null, struct + VkSubmitInfo2KHR.SIGNALSEMAPHOREINFOCOUNT); }
    /** Unsafe version of {@link #pSignalSemaphoreInfos}. */
    @Nullable public static VkSemaphoreSubmitInfoKHR.Buffer npSignalSemaphoreInfos(long struct) { return VkSemaphoreSubmitInfoKHR.createSafe(memGetAddress(struct + VkSubmitInfo2KHR.PSIGNALSEMAPHOREINFOS), nsignalSemaphoreInfoCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSubmitInfo2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubmitInfo2KHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkSubmitInfo2KHR.FLAGS, value); }
    /** Sets the specified value to the {@code waitSemaphoreInfoCount} field of the specified {@code struct}. */
    public static void nwaitSemaphoreInfoCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSubmitInfo2KHR.WAITSEMAPHOREINFOCOUNT, value); }
    /** Unsafe version of {@link #pWaitSemaphoreInfos(VkSemaphoreSubmitInfoKHR.Buffer) pWaitSemaphoreInfos}. */
    public static void npWaitSemaphoreInfos(long struct, @Nullable VkSemaphoreSubmitInfoKHR.Buffer value) { memPutAddress(struct + VkSubmitInfo2KHR.PWAITSEMAPHOREINFOS, memAddressSafe(value)); nwaitSemaphoreInfoCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code commandBufferInfoCount} field of the specified {@code struct}. */
    public static void ncommandBufferInfoCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSubmitInfo2KHR.COMMANDBUFFERINFOCOUNT, value); }
    /** Unsafe version of {@link #pCommandBufferInfos(VkCommandBufferSubmitInfoKHR.Buffer) pCommandBufferInfos}. */
    public static void npCommandBufferInfos(long struct, @Nullable VkCommandBufferSubmitInfoKHR.Buffer value) { memPutAddress(struct + VkSubmitInfo2KHR.PCOMMANDBUFFERINFOS, memAddressSafe(value)); ncommandBufferInfoCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code signalSemaphoreInfoCount} field of the specified {@code struct}. */
    public static void nsignalSemaphoreInfoCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSubmitInfo2KHR.SIGNALSEMAPHOREINFOCOUNT, value); }
    /** Unsafe version of {@link #pSignalSemaphoreInfos(VkSemaphoreSubmitInfoKHR.Buffer) pSignalSemaphoreInfos}. */
    public static void npSignalSemaphoreInfos(long struct, @Nullable VkSemaphoreSubmitInfoKHR.Buffer value) { memPutAddress(struct + VkSubmitInfo2KHR.PSIGNALSEMAPHOREINFOS, memAddressSafe(value)); nsignalSemaphoreInfoCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nwaitSemaphoreInfoCount(struct) != 0) {
            check(memGetAddress(struct + VkSubmitInfo2KHR.PWAITSEMAPHOREINFOS));
        }
        int commandBufferInfoCount = ncommandBufferInfoCount(struct);
        if (commandBufferInfoCount != 0) {
            long pCommandBufferInfos = memGetAddress(struct + VkSubmitInfo2KHR.PCOMMANDBUFFERINFOS);
            check(pCommandBufferInfos);
            VkCommandBufferSubmitInfoKHR.validate(pCommandBufferInfos, commandBufferInfoCount);
        }
        if (nsignalSemaphoreInfoCount(struct) != 0) {
            check(memGetAddress(struct + VkSubmitInfo2KHR.PSIGNALSEMAPHOREINFOS));
        }
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

    /** An array of {@link VkSubmitInfo2KHR} structs. */
    public static class Buffer extends StructBuffer<VkSubmitInfo2KHR, Buffer> implements NativeResource {

        private static final VkSubmitInfo2KHR ELEMENT_FACTORY = VkSubmitInfo2KHR.create(-1L);

        /**
         * Creates a new {@code VkSubmitInfo2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubmitInfo2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSubmitInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSubmitInfo2KHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubmitInfo2KHR.nsType(address()); }
        /** @return the value of the {@link VkSubmitInfo2KHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSubmitInfo2KHR.npNext(address()); }
        /** @return the value of the {@link VkSubmitInfo2KHR#flags} field. */
        @NativeType("VkSubmitFlagsKHR")
        public int flags() { return VkSubmitInfo2KHR.nflags(address()); }
        /** @return the value of the {@link VkSubmitInfo2KHR#waitSemaphoreInfoCount} field. */
        @NativeType("uint32_t")
        public int waitSemaphoreInfoCount() { return VkSubmitInfo2KHR.nwaitSemaphoreInfoCount(address()); }
        /** @return a {@link VkSemaphoreSubmitInfoKHR.Buffer} view of the struct array pointed to by the {@link VkSubmitInfo2KHR#pWaitSemaphoreInfos} field. */
        @Nullable
        @NativeType("VkSemaphoreSubmitInfoKHR const *")
        public VkSemaphoreSubmitInfoKHR.Buffer pWaitSemaphoreInfos() { return VkSubmitInfo2KHR.npWaitSemaphoreInfos(address()); }
        /** @return the value of the {@link VkSubmitInfo2KHR#commandBufferInfoCount} field. */
        @NativeType("uint32_t")
        public int commandBufferInfoCount() { return VkSubmitInfo2KHR.ncommandBufferInfoCount(address()); }
        /** @return a {@link VkCommandBufferSubmitInfoKHR.Buffer} view of the struct array pointed to by the {@link VkSubmitInfo2KHR#pCommandBufferInfos} field. */
        @Nullable
        @NativeType("VkCommandBufferSubmitInfoKHR const *")
        public VkCommandBufferSubmitInfoKHR.Buffer pCommandBufferInfos() { return VkSubmitInfo2KHR.npCommandBufferInfos(address()); }
        /** @return the value of the {@link VkSubmitInfo2KHR#signalSemaphoreInfoCount} field. */
        @NativeType("uint32_t")
        public int signalSemaphoreInfoCount() { return VkSubmitInfo2KHR.nsignalSemaphoreInfoCount(address()); }
        /** @return a {@link VkSemaphoreSubmitInfoKHR.Buffer} view of the struct array pointed to by the {@link VkSubmitInfo2KHR#pSignalSemaphoreInfos} field. */
        @Nullable
        @NativeType("VkSemaphoreSubmitInfoKHR const *")
        public VkSemaphoreSubmitInfoKHR.Buffer pSignalSemaphoreInfos() { return VkSubmitInfo2KHR.npSignalSemaphoreInfos(address()); }

        /** Sets the specified value to the {@link VkSubmitInfo2KHR#sType} field. */
        public VkSubmitInfo2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSubmitInfo2KHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@link VkSubmitInfo2KHR#pNext} field. */
        public VkSubmitInfo2KHR.Buffer pNext(@NativeType("void const *") long value) { VkSubmitInfo2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkSubmitInfo2KHR#flags} field. */
        public VkSubmitInfo2KHR.Buffer flags(@NativeType("VkSubmitFlagsKHR") int value) { VkSubmitInfo2KHR.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkSemaphoreSubmitInfoKHR.Buffer} to the {@link VkSubmitInfo2KHR#pWaitSemaphoreInfos} field. */
        public VkSubmitInfo2KHR.Buffer pWaitSemaphoreInfos(@Nullable @NativeType("VkSemaphoreSubmitInfoKHR const *") VkSemaphoreSubmitInfoKHR.Buffer value) { VkSubmitInfo2KHR.npWaitSemaphoreInfos(address(), value); return this; }
        /** Sets the address of the specified {@link VkCommandBufferSubmitInfoKHR.Buffer} to the {@link VkSubmitInfo2KHR#pCommandBufferInfos} field. */
        public VkSubmitInfo2KHR.Buffer pCommandBufferInfos(@Nullable @NativeType("VkCommandBufferSubmitInfoKHR const *") VkCommandBufferSubmitInfoKHR.Buffer value) { VkSubmitInfo2KHR.npCommandBufferInfos(address(), value); return this; }
        /** Sets the address of the specified {@link VkSemaphoreSubmitInfoKHR.Buffer} to the {@link VkSubmitInfo2KHR#pSignalSemaphoreInfos} field. */
        public VkSubmitInfo2KHR.Buffer pSignalSemaphoreInfos(@Nullable @NativeType("VkSemaphoreSubmitInfoKHR const *") VkSemaphoreSubmitInfoKHR.Buffer value) { VkSubmitInfo2KHR.npSignalSemaphoreInfos(address(), value); return this; }

    }

}