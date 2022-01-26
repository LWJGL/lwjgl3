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
 * <li>If the {@code semaphore} member of any element of {@code pSignalSemaphoreInfos} is a timeline semaphore, the {@code value} member of that element <b>must</b> have a value greater than the current value of the semaphore when the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-semaphores-signaling">semaphore signal operation</a> is executed</li>
 * <li>If the {@code semaphore} member of any element of {@code pSignalSemaphoreInfos} is a timeline semaphore, the {@code value} member of that element <b>must</b> have a value which does not differ from the current value of the semaphore or the value of any outstanding semaphore wait or signal operation on that semaphore by more than <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxTimelineSemaphoreValueDifference">{@code maxTimelineSemaphoreValueDifference}</a></li>
 * <li>If the {@code semaphore} member of any element of {@code pWaitSemaphoreInfos} is a timeline semaphore, the {@code value} member of that element <b>must</b> have a value which does not differ from the current value of the semaphore or the value of any outstanding semaphore wait or signal operation on that semaphore by more than <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxTimelineSemaphoreValueDifference">{@code maxTimelineSemaphoreValueDifference}</a></li>
 * <li>If {@code flags} includes {@link VK13#VK_SUBMIT_PROTECTED_BIT SUBMIT_PROTECTED_BIT}, all elements of {@code pCommandBuffers} <b>must</b> be protected command buffers</li>
 * <li>If {@code flags} does not include {@link VK13#VK_SUBMIT_PROTECTED_BIT SUBMIT_PROTECTED_BIT}, each element of {@code pCommandBuffers} <b>must</b> not be a protected command buffer</li>
 * <li>If any {@code commandBuffer} member of an element of {@code pCommandBufferInfos} contains any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-suspension">resumed render pass instances</a>, they <b>must</b> be suspended by a render pass instance earlier in submission order within {@code pCommandBufferInfos}</li>
 * <li>If any {@code commandBuffer} member of an element of {@code pCommandBufferInfos} contains any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-suspension">suspended render pass instances</a>, they <b>must</b> be resumed by a render pass instance later in submission order within {@code pCommandBufferInfos}</li>
 * <li>If any {@code commandBuffer} member of an element of {@code pCommandBufferInfos} contains any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-suspension">suspended render pass instances</a>, there <b>must</b> be no action or synchronization commands between that render pass instance and the render pass instance that resumes it</li>
 * <li>If any {@code commandBuffer} member of an element of {@code pCommandBufferInfos} contains any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-suspension">suspended render pass instances</a>, there <b>must</b> be no render pass instances between that render pass instance and the render pass instance that resumes it</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-variableSampleLocations">{@code variableSampleLocations}</a> limit is not supported, and any {@code commandBuffer} member of an element of {@code pCommandBufferInfos} contains any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-suspension">suspended render pass instances</a>, where a graphics pipeline has been bound, any pipelines bound in the render pass instance that resumes it, or any subsequent render pass instances that resume from that one and so on, <b>must</b> use the same sample locations</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_SUBMIT_INFO_2 STRUCTURE_TYPE_SUBMIT_INFO_2}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkPerformanceQuerySubmitInfoKHR}, {@link VkWin32KeyedMutexAcquireReleaseInfoKHR}, or {@link VkWin32KeyedMutexAcquireReleaseInfoNV}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkSubmitFlagBits} values</li>
 * <li>If {@code waitSemaphoreInfoCount} is not 0, {@code pWaitSemaphoreInfos} <b>must</b> be a valid pointer to an array of {@code waitSemaphoreInfoCount} valid {@link VkSemaphoreSubmitInfo} structures</li>
 * <li>If {@code commandBufferInfoCount} is not 0, {@code pCommandBufferInfos} <b>must</b> be a valid pointer to an array of {@code commandBufferInfoCount} valid {@link VkCommandBufferSubmitInfo} structures</li>
 * <li>If {@code signalSemaphoreInfoCount} is not 0, {@code pSignalSemaphoreInfos} <b>must</b> be a valid pointer to an array of {@code signalSemaphoreInfoCount} valid {@link VkSemaphoreSubmitInfo} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkCommandBufferSubmitInfo}, {@link VkSemaphoreSubmitInfo}, {@link VK13#vkQueueSubmit2 QueueSubmit2}, {@link KHRSynchronization2#vkQueueSubmit2KHR QueueSubmit2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubmitInfo2 {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSubmitFlags {@link #flags};
 *     uint32_t {@link #waitSemaphoreInfoCount};
 *     {@link VkSemaphoreSubmitInfo VkSemaphoreSubmitInfo} const * {@link #pWaitSemaphoreInfos};
 *     uint32_t {@link #commandBufferInfoCount};
 *     {@link VkCommandBufferSubmitInfo VkCommandBufferSubmitInfo} const * {@link #pCommandBufferInfos};
 *     uint32_t {@link #signalSemaphoreInfoCount};
 *     {@link VkSemaphoreSubmitInfo VkSemaphoreSubmitInfo} const * {@link #pSignalSemaphoreInfos};
 * }</code></pre>
 */
public class VkSubmitInfo2 extends Struct implements NativeResource {

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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkSubmitFlagBits}. */
    @NativeType("VkSubmitFlags")
    public int flags() { return nflags(address()); }
    /** the number of elements in {@code pWaitSemaphoreInfos}. */
    @NativeType("uint32_t")
    public int waitSemaphoreInfoCount() { return nwaitSemaphoreInfoCount(address()); }
    /** a pointer to an array of {@link VkSemaphoreSubmitInfo} structures defining <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-semaphores-waiting">semaphore wait operations</a>. */
    @Nullable
    @NativeType("VkSemaphoreSubmitInfo const *")
    public VkSemaphoreSubmitInfo.Buffer pWaitSemaphoreInfos() { return npWaitSemaphoreInfos(address()); }
    /** the number of elements in {@code pCommandBufferInfos} and the number of command buffers to execute in the batch. */
    @NativeType("uint32_t")
    public int commandBufferInfoCount() { return ncommandBufferInfoCount(address()); }
    /** a pointer to an array of {@link VkCommandBufferSubmitInfo} structures describing command buffers to execute in the batch. */
    @Nullable
    @NativeType("VkCommandBufferSubmitInfo const *")
    public VkCommandBufferSubmitInfo.Buffer pCommandBufferInfos() { return npCommandBufferInfos(address()); }
    /** the number of elements in {@code pSignalSemaphoreInfos}. */
    @NativeType("uint32_t")
    public int signalSemaphoreInfoCount() { return nsignalSemaphoreInfoCount(address()); }
    /** a pointer to an array of {@link VkSemaphoreSubmitInfo} describing <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-semaphores-signaling">semaphore signal operations</a>. */
    @Nullable
    @NativeType("VkSemaphoreSubmitInfo const *")
    public VkSemaphoreSubmitInfo.Buffer pSignalSemaphoreInfos() { return npSignalSemaphoreInfos(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSubmitInfo2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_SUBMIT_INFO_2 STRUCTURE_TYPE_SUBMIT_INFO_2} value to the {@link #sType} field. */
    public VkSubmitInfo2 sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_SUBMIT_INFO_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSubmitInfo2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPerformanceQuerySubmitInfoKHR} value to the {@code pNext} chain. */
    public VkSubmitInfo2 pNext(VkPerformanceQuerySubmitInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkWin32KeyedMutexAcquireReleaseInfoKHR} value to the {@code pNext} chain. */
    public VkSubmitInfo2 pNext(VkWin32KeyedMutexAcquireReleaseInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkWin32KeyedMutexAcquireReleaseInfoNV} value to the {@code pNext} chain. */
    public VkSubmitInfo2 pNext(VkWin32KeyedMutexAcquireReleaseInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkSubmitInfo2 flags(@NativeType("VkSubmitFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkSemaphoreSubmitInfo.Buffer} to the {@link #pWaitSemaphoreInfos} field. */
    public VkSubmitInfo2 pWaitSemaphoreInfos(@Nullable @NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) { npWaitSemaphoreInfos(address(), value); return this; }
    /** Sets the address of the specified {@link VkCommandBufferSubmitInfo.Buffer} to the {@link #pCommandBufferInfos} field. */
    public VkSubmitInfo2 pCommandBufferInfos(@Nullable @NativeType("VkCommandBufferSubmitInfo const *") VkCommandBufferSubmitInfo.Buffer value) { npCommandBufferInfos(address(), value); return this; }
    /** Sets the address of the specified {@link VkSemaphoreSubmitInfo.Buffer} to the {@link #pSignalSemaphoreInfos} field. */
    public VkSubmitInfo2 pSignalSemaphoreInfos(@Nullable @NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) { npSignalSemaphoreInfos(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubmitInfo2 set(
        int sType,
        long pNext,
        int flags,
        @Nullable VkSemaphoreSubmitInfo.Buffer pWaitSemaphoreInfos,
        @Nullable VkCommandBufferSubmitInfo.Buffer pCommandBufferInfos,
        @Nullable VkSemaphoreSubmitInfo.Buffer pSignalSemaphoreInfos
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
        return wrap(VkSubmitInfo2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSubmitInfo2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubmitInfo2 calloc() {
        return wrap(VkSubmitInfo2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSubmitInfo2} instance allocated with {@link BufferUtils}. */
    public static VkSubmitInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSubmitInfo2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSubmitInfo2} instance for the specified memory address. */
    public static VkSubmitInfo2 create(long address) {
        return wrap(VkSubmitInfo2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubmitInfo2 createSafe(long address) {
        return address == NULL ? null : wrap(VkSubmitInfo2.class, address);
    }

    /**
     * Returns a new {@link VkSubmitInfo2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubmitInfo2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubmitInfo2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSubmitInfo2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubmitInfo2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkSubmitInfo2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubmitInfo2 malloc(MemoryStack stack) {
        return wrap(VkSubmitInfo2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSubmitInfo2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubmitInfo2 calloc(MemoryStack stack) {
        return wrap(VkSubmitInfo2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubmitInfo2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubmitInfo2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSubmitInfo2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubmitInfo2.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkSubmitInfo2.FLAGS); }
    /** Unsafe version of {@link #waitSemaphoreInfoCount}. */
    public static int nwaitSemaphoreInfoCount(long struct) { return UNSAFE.getInt(null, struct + VkSubmitInfo2.WAITSEMAPHOREINFOCOUNT); }
    /** Unsafe version of {@link #pWaitSemaphoreInfos}. */
    @Nullable public static VkSemaphoreSubmitInfo.Buffer npWaitSemaphoreInfos(long struct) { return VkSemaphoreSubmitInfo.createSafe(memGetAddress(struct + VkSubmitInfo2.PWAITSEMAPHOREINFOS), nwaitSemaphoreInfoCount(struct)); }
    /** Unsafe version of {@link #commandBufferInfoCount}. */
    public static int ncommandBufferInfoCount(long struct) { return UNSAFE.getInt(null, struct + VkSubmitInfo2.COMMANDBUFFERINFOCOUNT); }
    /** Unsafe version of {@link #pCommandBufferInfos}. */
    @Nullable public static VkCommandBufferSubmitInfo.Buffer npCommandBufferInfos(long struct) { return VkCommandBufferSubmitInfo.createSafe(memGetAddress(struct + VkSubmitInfo2.PCOMMANDBUFFERINFOS), ncommandBufferInfoCount(struct)); }
    /** Unsafe version of {@link #signalSemaphoreInfoCount}. */
    public static int nsignalSemaphoreInfoCount(long struct) { return UNSAFE.getInt(null, struct + VkSubmitInfo2.SIGNALSEMAPHOREINFOCOUNT); }
    /** Unsafe version of {@link #pSignalSemaphoreInfos}. */
    @Nullable public static VkSemaphoreSubmitInfo.Buffer npSignalSemaphoreInfos(long struct) { return VkSemaphoreSubmitInfo.createSafe(memGetAddress(struct + VkSubmitInfo2.PSIGNALSEMAPHOREINFOS), nsignalSemaphoreInfoCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSubmitInfo2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubmitInfo2.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkSubmitInfo2.FLAGS, value); }
    /** Sets the specified value to the {@code waitSemaphoreInfoCount} field of the specified {@code struct}. */
    public static void nwaitSemaphoreInfoCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSubmitInfo2.WAITSEMAPHOREINFOCOUNT, value); }
    /** Unsafe version of {@link #pWaitSemaphoreInfos(VkSemaphoreSubmitInfo.Buffer) pWaitSemaphoreInfos}. */
    public static void npWaitSemaphoreInfos(long struct, @Nullable VkSemaphoreSubmitInfo.Buffer value) { memPutAddress(struct + VkSubmitInfo2.PWAITSEMAPHOREINFOS, memAddressSafe(value)); nwaitSemaphoreInfoCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code commandBufferInfoCount} field of the specified {@code struct}. */
    public static void ncommandBufferInfoCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSubmitInfo2.COMMANDBUFFERINFOCOUNT, value); }
    /** Unsafe version of {@link #pCommandBufferInfos(VkCommandBufferSubmitInfo.Buffer) pCommandBufferInfos}. */
    public static void npCommandBufferInfos(long struct, @Nullable VkCommandBufferSubmitInfo.Buffer value) { memPutAddress(struct + VkSubmitInfo2.PCOMMANDBUFFERINFOS, memAddressSafe(value)); ncommandBufferInfoCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code signalSemaphoreInfoCount} field of the specified {@code struct}. */
    public static void nsignalSemaphoreInfoCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSubmitInfo2.SIGNALSEMAPHOREINFOCOUNT, value); }
    /** Unsafe version of {@link #pSignalSemaphoreInfos(VkSemaphoreSubmitInfo.Buffer) pSignalSemaphoreInfos}. */
    public static void npSignalSemaphoreInfos(long struct, @Nullable VkSemaphoreSubmitInfo.Buffer value) { memPutAddress(struct + VkSubmitInfo2.PSIGNALSEMAPHOREINFOS, memAddressSafe(value)); nsignalSemaphoreInfoCount(struct, value == null ? 0 : value.remaining()); }

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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubmitInfo2#SIZEOF}, and its mark will be undefined.
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
        protected VkSubmitInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSubmitInfo2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubmitInfo2.nsType(address()); }
        /** @return the value of the {@link VkSubmitInfo2#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSubmitInfo2.npNext(address()); }
        /** @return the value of the {@link VkSubmitInfo2#flags} field. */
        @NativeType("VkSubmitFlags")
        public int flags() { return VkSubmitInfo2.nflags(address()); }
        /** @return the value of the {@link VkSubmitInfo2#waitSemaphoreInfoCount} field. */
        @NativeType("uint32_t")
        public int waitSemaphoreInfoCount() { return VkSubmitInfo2.nwaitSemaphoreInfoCount(address()); }
        /** @return a {@link VkSemaphoreSubmitInfo.Buffer} view of the struct array pointed to by the {@link VkSubmitInfo2#pWaitSemaphoreInfos} field. */
        @Nullable
        @NativeType("VkSemaphoreSubmitInfo const *")
        public VkSemaphoreSubmitInfo.Buffer pWaitSemaphoreInfos() { return VkSubmitInfo2.npWaitSemaphoreInfos(address()); }
        /** @return the value of the {@link VkSubmitInfo2#commandBufferInfoCount} field. */
        @NativeType("uint32_t")
        public int commandBufferInfoCount() { return VkSubmitInfo2.ncommandBufferInfoCount(address()); }
        /** @return a {@link VkCommandBufferSubmitInfo.Buffer} view of the struct array pointed to by the {@link VkSubmitInfo2#pCommandBufferInfos} field. */
        @Nullable
        @NativeType("VkCommandBufferSubmitInfo const *")
        public VkCommandBufferSubmitInfo.Buffer pCommandBufferInfos() { return VkSubmitInfo2.npCommandBufferInfos(address()); }
        /** @return the value of the {@link VkSubmitInfo2#signalSemaphoreInfoCount} field. */
        @NativeType("uint32_t")
        public int signalSemaphoreInfoCount() { return VkSubmitInfo2.nsignalSemaphoreInfoCount(address()); }
        /** @return a {@link VkSemaphoreSubmitInfo.Buffer} view of the struct array pointed to by the {@link VkSubmitInfo2#pSignalSemaphoreInfos} field. */
        @Nullable
        @NativeType("VkSemaphoreSubmitInfo const *")
        public VkSemaphoreSubmitInfo.Buffer pSignalSemaphoreInfos() { return VkSubmitInfo2.npSignalSemaphoreInfos(address()); }

        /** Sets the specified value to the {@link VkSubmitInfo2#sType} field. */
        public VkSubmitInfo2.Buffer sType(@NativeType("VkStructureType") int value) { VkSubmitInfo2.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_SUBMIT_INFO_2 STRUCTURE_TYPE_SUBMIT_INFO_2} value to the {@link VkSubmitInfo2#sType} field. */
        public VkSubmitInfo2.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_SUBMIT_INFO_2); }
        /** Sets the specified value to the {@link VkSubmitInfo2#pNext} field. */
        public VkSubmitInfo2.Buffer pNext(@NativeType("void const *") long value) { VkSubmitInfo2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPerformanceQuerySubmitInfoKHR} value to the {@code pNext} chain. */
        public VkSubmitInfo2.Buffer pNext(VkPerformanceQuerySubmitInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkWin32KeyedMutexAcquireReleaseInfoKHR} value to the {@code pNext} chain. */
        public VkSubmitInfo2.Buffer pNext(VkWin32KeyedMutexAcquireReleaseInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkWin32KeyedMutexAcquireReleaseInfoNV} value to the {@code pNext} chain. */
        public VkSubmitInfo2.Buffer pNext(VkWin32KeyedMutexAcquireReleaseInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkSubmitInfo2#flags} field. */
        public VkSubmitInfo2.Buffer flags(@NativeType("VkSubmitFlags") int value) { VkSubmitInfo2.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkSemaphoreSubmitInfo.Buffer} to the {@link VkSubmitInfo2#pWaitSemaphoreInfos} field. */
        public VkSubmitInfo2.Buffer pWaitSemaphoreInfos(@Nullable @NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) { VkSubmitInfo2.npWaitSemaphoreInfos(address(), value); return this; }
        /** Sets the address of the specified {@link VkCommandBufferSubmitInfo.Buffer} to the {@link VkSubmitInfo2#pCommandBufferInfos} field. */
        public VkSubmitInfo2.Buffer pCommandBufferInfos(@Nullable @NativeType("VkCommandBufferSubmitInfo const *") VkCommandBufferSubmitInfo.Buffer value) { VkSubmitInfo2.npCommandBufferInfos(address(), value); return this; }
        /** Sets the address of the specified {@link VkSemaphoreSubmitInfo.Buffer} to the {@link VkSubmitInfo2#pSignalSemaphoreInfos} field. */
        public VkSubmitInfo2.Buffer pSignalSemaphoreInfos(@Nullable @NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) { VkSubmitInfo2.npSignalSemaphoreInfos(address(), value); return this; }

    }

}