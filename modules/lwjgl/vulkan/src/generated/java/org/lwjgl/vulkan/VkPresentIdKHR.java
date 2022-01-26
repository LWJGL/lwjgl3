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
 * The list of presentation identifiers.
 * 
 * <h5>Description</h5>
 * 
 * <p>For applications to be able to reference specific presentation events queued by a call to {@code vkQueuePresentKHR}, an identifier needs to be associated with them. When the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-presentId">{@code presentId}</a> feature is enabled, applications <b>can</b> include the {@link VkPresentIdKHR} structure in the {@code pNext} chain of the {@link VkPresentInfoKHR} structure to supply identifiers.</p>
 * 
 * <p>Each {@code VkSwapchainKHR} has a presentId associated with it. This value is initially set to zero when the {@code VkSwapchainKHR} is created.</p>
 * 
 * <p>When a {@link VkPresentIdKHR} structure with a non-NULL {@code pPresentIds} is included in the {@code pNext} chain of a {@link VkPresentInfoKHR} structure, each {@code pSwapchains} entry has a presentId associated in the {@code pPresentIds} array at the same index as the swapchain in the {@code pSwapchains} array. If this presentId is non-zero, then the application <b>can</b> later use this value to refer to that image presentation. A value of zero indicates that this presentation has no associated presentId. A non-zero presentId <b>must</b> be greater than any non-zero presentId passed previously by the application for the same swapchain.</p>
 * 
 * <p>There is no requirement for any precise timing relationship between the presentation of the image to the user and the update of the presentId value, but implementations <b>should</b> make this as close as possible to the presentation of the first pixel in the new image to the user.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code swapchainCount} <b>must</b> be the same value as {@link VkPresentInfoKHR}{@code ::swapchainCount}, where this {@link VkPresentIdKHR} is in the {@code pNext} chain of the {@link VkPresentInfoKHR} structure</li>
 * <li>Each {@code presentIds} entry <b>must</b> be greater than any previous {@code presentIds} entry passed for the associated {@code pSwapchains} entry</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPresentId#VK_STRUCTURE_TYPE_PRESENT_ID_KHR STRUCTURE_TYPE_PRESENT_ID_KHR}</li>
 * <li>If {@code pPresentIds} is not {@code NULL}, {@code pPresentIds} <b>must</b> be a valid pointer to an array of {@code swapchainCount} {@code uint64_t} values</li>
 * <li>{@code swapchainCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPresentIdKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #swapchainCount};
 *     uint64_t const * {@link #pPresentIds};
 * }</code></pre>
 */
public class VkPresentIdKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SWAPCHAINCOUNT,
        PPRESENTIDS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAINCOUNT = layout.offsetof(2);
        PPRESENTIDS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPresentIdKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPresentIdKHR(ByteBuffer container) {
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
    /** the number of swapchains being presented to the {@code vkQueuePresentKHR} command. */
    @NativeType("uint32_t")
    public int swapchainCount() { return nswapchainCount(address()); }
    /** {@code NULL} or a pointer to an array of uint64_t with {@code swapchainCount} entries. If not {@code NULL}, each non-zero value in {@code pPresentIds} specifies the present id to be associated with the presentation of the swapchain with the same index in the {@link KHRSwapchain#vkQueuePresentKHR QueuePresentKHR} call. */
    @Nullable
    @NativeType("uint64_t const *")
    public LongBuffer pPresentIds() { return npPresentIds(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPresentIdKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPresentId#VK_STRUCTURE_TYPE_PRESENT_ID_KHR STRUCTURE_TYPE_PRESENT_ID_KHR} value to the {@link #sType} field. */
    public VkPresentIdKHR sType$Default() { return sType(KHRPresentId.VK_STRUCTURE_TYPE_PRESENT_ID_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPresentIdKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #swapchainCount} field. */
    public VkPresentIdKHR swapchainCount(@NativeType("uint32_t") int value) { nswapchainCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pPresentIds} field. */
    public VkPresentIdKHR pPresentIds(@Nullable @NativeType("uint64_t const *") LongBuffer value) { npPresentIds(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPresentIdKHR set(
        int sType,
        long pNext,
        int swapchainCount,
        @Nullable LongBuffer pPresentIds
    ) {
        sType(sType);
        pNext(pNext);
        swapchainCount(swapchainCount);
        pPresentIds(pPresentIds);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPresentIdKHR set(VkPresentIdKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPresentIdKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPresentIdKHR malloc() {
        return wrap(VkPresentIdKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPresentIdKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPresentIdKHR calloc() {
        return wrap(VkPresentIdKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPresentIdKHR} instance allocated with {@link BufferUtils}. */
    public static VkPresentIdKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPresentIdKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPresentIdKHR} instance for the specified memory address. */
    public static VkPresentIdKHR create(long address) {
        return wrap(VkPresentIdKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPresentIdKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPresentIdKHR.class, address);
    }

    /**
     * Returns a new {@link VkPresentIdKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentIdKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPresentIdKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentIdKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentIdKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentIdKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPresentIdKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPresentIdKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPresentIdKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPresentIdKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentIdKHR malloc(MemoryStack stack) {
        return wrap(VkPresentIdKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPresentIdKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentIdKHR calloc(MemoryStack stack) {
        return wrap(VkPresentIdKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPresentIdKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentIdKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentIdKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentIdKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPresentIdKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPresentIdKHR.PNEXT); }
    /** Unsafe version of {@link #swapchainCount}. */
    public static int nswapchainCount(long struct) { return UNSAFE.getInt(null, struct + VkPresentIdKHR.SWAPCHAINCOUNT); }
    /** Unsafe version of {@link #pPresentIds() pPresentIds}. */
    @Nullable public static LongBuffer npPresentIds(long struct) { return memLongBufferSafe(memGetAddress(struct + VkPresentIdKHR.PPRESENTIDS), nswapchainCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPresentIdKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPresentIdKHR.PNEXT, value); }
    /** Sets the specified value to the {@code swapchainCount} field of the specified {@code struct}. */
    public static void nswapchainCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPresentIdKHR.SWAPCHAINCOUNT, value); }
    /** Unsafe version of {@link #pPresentIds(LongBuffer) pPresentIds}. */
    public static void npPresentIds(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkPresentIdKHR.PPRESENTIDS, memAddressSafe(value)); if (value != null) { nswapchainCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPresentIdKHR} structs. */
    public static class Buffer extends StructBuffer<VkPresentIdKHR, Buffer> implements NativeResource {

        private static final VkPresentIdKHR ELEMENT_FACTORY = VkPresentIdKHR.create(-1L);

        /**
         * Creates a new {@code VkPresentIdKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPresentIdKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPresentIdKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPresentIdKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPresentIdKHR.nsType(address()); }
        /** @return the value of the {@link VkPresentIdKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPresentIdKHR.npNext(address()); }
        /** @return the value of the {@link VkPresentIdKHR#swapchainCount} field. */
        @NativeType("uint32_t")
        public int swapchainCount() { return VkPresentIdKHR.nswapchainCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkPresentIdKHR#pPresentIds} field. */
        @Nullable
        @NativeType("uint64_t const *")
        public LongBuffer pPresentIds() { return VkPresentIdKHR.npPresentIds(address()); }

        /** Sets the specified value to the {@link VkPresentIdKHR#sType} field. */
        public VkPresentIdKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPresentIdKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPresentId#VK_STRUCTURE_TYPE_PRESENT_ID_KHR STRUCTURE_TYPE_PRESENT_ID_KHR} value to the {@link VkPresentIdKHR#sType} field. */
        public VkPresentIdKHR.Buffer sType$Default() { return sType(KHRPresentId.VK_STRUCTURE_TYPE_PRESENT_ID_KHR); }
        /** Sets the specified value to the {@link VkPresentIdKHR#pNext} field. */
        public VkPresentIdKHR.Buffer pNext(@NativeType("void const *") long value) { VkPresentIdKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPresentIdKHR#swapchainCount} field. */
        public VkPresentIdKHR.Buffer swapchainCount(@NativeType("uint32_t") int value) { VkPresentIdKHR.nswapchainCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkPresentIdKHR#pPresentIds} field. */
        public VkPresentIdKHR.Buffer pPresentIds(@Nullable @NativeType("uint64_t const *") LongBuffer value) { VkPresentIdKHR.npPresentIds(address(), value); return this; }

    }

}