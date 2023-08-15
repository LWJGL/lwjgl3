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
 * Fences associated with a vkQueuePresentKHR operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>The set of <em>queue operations</em> defined by queuing an image for presentation, as well as operations performed by the presentation engine access the payloads of objects associated with the presentation operation. The associated objects include:</p>
 * 
 * <ul>
 * <li>The swapchain image, its implicitly bound memory, and any other resources bound to that memory.</li>
 * <li>The wait semaphores specified when queuing the image for presentation.</li>
 * </ul>
 * 
 * <p>The application <b>can</b> provide a fence that the implementation will signal when all such queue operations have completed and the presentation engine has taken a reference to the payload of any objects it accesses as part of the present operation. For all binary wait semaphores imported by the presentation engine using the equivalent of reference transference, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-semaphores-importing">Importing Semaphore Payloads</a>, this fence <b>must</b> not signal until all such semaphore payloads have been reset by the presentation engine.</p>
 * 
 * <p>The application <b>can</b> destroy the wait semaphores associated with a given presentation operation when at least one of the associated fences is signaled, and <b>can</b> destroy the swapchain when the fences associated with all past presentation requests referring to that swapchain have signaled.</p>
 * 
 * <p>Fences associated with presentations to the same swapchain on the same {@code VkQueue} <b>must</b> be signaled in the same order as the present operations.</p>
 * 
 * <p>To specify a fence for each swapchain in a present operation, include the {@link VkSwapchainPresentFenceInfoEXT} structure in the {@code pNext} chain of the {@link VkPresentInfoKHR} structure.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code swapchainCount} <b>must</b> be equal to {@link VkPresentInfoKHR}{@code ::swapchainCount}</li>
 * <li>Each element of {@code pFences} <b>must</b> be unsignaled</li>
 * <li>Each element of {@code pFences} <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSwapchainMaintenance1#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT}</li>
 * <li>{@code pFences} <b>must</b> be a valid pointer to an array of {@code swapchainCount} valid {@code VkFence} handles</li>
 * <li>{@code swapchainCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSwapchainPresentFenceInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #swapchainCount};
 *     VkFence const * {@link #pFences};
 * }</code></pre>
 */
public class VkSwapchainPresentFenceInfoEXT extends Struct<VkSwapchainPresentFenceInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SWAPCHAINCOUNT,
        PFENCES;

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
        PFENCES = layout.offsetof(3);
    }

    protected VkSwapchainPresentFenceInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSwapchainPresentFenceInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSwapchainPresentFenceInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkSwapchainPresentFenceInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSwapchainPresentFenceInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the number of swapchains being presented to by this command. */
    @NativeType("uint32_t")
    public int swapchainCount() { return nswapchainCount(address()); }
    /** a list of fences with {@code swapchainCount} entries. Each entry <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or the handle of a fence to signal when the relevant operations on the associated swapchain have completed. */
    @NativeType("VkFence const *")
    public LongBuffer pFences() { return npFences(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSwapchainPresentFenceInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSwapchainMaintenance1#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT} value to the {@link #sType} field. */
    public VkSwapchainPresentFenceInfoEXT sType$Default() { return sType(EXTSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSwapchainPresentFenceInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pFences} field. */
    public VkSwapchainPresentFenceInfoEXT pFences(@NativeType("VkFence const *") LongBuffer value) { npFences(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSwapchainPresentFenceInfoEXT set(
        int sType,
        long pNext,
        LongBuffer pFences
    ) {
        sType(sType);
        pNext(pNext);
        pFences(pFences);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSwapchainPresentFenceInfoEXT set(VkSwapchainPresentFenceInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSwapchainPresentFenceInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSwapchainPresentFenceInfoEXT malloc() {
        return new VkSwapchainPresentFenceInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainPresentFenceInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSwapchainPresentFenceInfoEXT calloc() {
        return new VkSwapchainPresentFenceInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainPresentFenceInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkSwapchainPresentFenceInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainPresentFenceInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSwapchainPresentFenceInfoEXT} instance for the specified memory address. */
    public static VkSwapchainPresentFenceInfoEXT create(long address) {
        return new VkSwapchainPresentFenceInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSwapchainPresentFenceInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkSwapchainPresentFenceInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkSwapchainPresentFenceInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentFenceInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentFenceInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentFenceInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentFenceInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentFenceInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSwapchainPresentFenceInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentFenceInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSwapchainPresentFenceInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSwapchainPresentFenceInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainPresentFenceInfoEXT malloc(MemoryStack stack) {
        return new VkSwapchainPresentFenceInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSwapchainPresentFenceInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainPresentFenceInfoEXT calloc(MemoryStack stack) {
        return new VkSwapchainPresentFenceInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSwapchainPresentFenceInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentFenceInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentFenceInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentFenceInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainPresentFenceInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSwapchainPresentFenceInfoEXT.PNEXT); }
    /** Unsafe version of {@link #swapchainCount}. */
    public static int nswapchainCount(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainPresentFenceInfoEXT.SWAPCHAINCOUNT); }
    /** Unsafe version of {@link #pFences() pFences}. */
    public static LongBuffer npFences(long struct) { return memLongBuffer(memGetAddress(struct + VkSwapchainPresentFenceInfoEXT.PFENCES), nswapchainCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainPresentFenceInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSwapchainPresentFenceInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code swapchainCount} field of the specified {@code struct}. */
    public static void nswapchainCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainPresentFenceInfoEXT.SWAPCHAINCOUNT, value); }
    /** Unsafe version of {@link #pFences(LongBuffer) pFences}. */
    public static void npFences(long struct, LongBuffer value) { memPutAddress(struct + VkSwapchainPresentFenceInfoEXT.PFENCES, memAddress(value)); nswapchainCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkSwapchainPresentFenceInfoEXT.PFENCES));
    }

    // -----------------------------------

    /** An array of {@link VkSwapchainPresentFenceInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkSwapchainPresentFenceInfoEXT, Buffer> implements NativeResource {

        private static final VkSwapchainPresentFenceInfoEXT ELEMENT_FACTORY = VkSwapchainPresentFenceInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkSwapchainPresentFenceInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSwapchainPresentFenceInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSwapchainPresentFenceInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSwapchainPresentFenceInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSwapchainPresentFenceInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkSwapchainPresentFenceInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSwapchainPresentFenceInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkSwapchainPresentFenceInfoEXT#swapchainCount} field. */
        @NativeType("uint32_t")
        public int swapchainCount() { return VkSwapchainPresentFenceInfoEXT.nswapchainCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkSwapchainPresentFenceInfoEXT#pFences} field. */
        @NativeType("VkFence const *")
        public LongBuffer pFences() { return VkSwapchainPresentFenceInfoEXT.npFences(address()); }

        /** Sets the specified value to the {@link VkSwapchainPresentFenceInfoEXT#sType} field. */
        public VkSwapchainPresentFenceInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSwapchainPresentFenceInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSwapchainMaintenance1#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT} value to the {@link VkSwapchainPresentFenceInfoEXT#sType} field. */
        public VkSwapchainPresentFenceInfoEXT.Buffer sType$Default() { return sType(EXTSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT); }
        /** Sets the specified value to the {@link VkSwapchainPresentFenceInfoEXT#pNext} field. */
        public VkSwapchainPresentFenceInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkSwapchainPresentFenceInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkSwapchainPresentFenceInfoEXT#pFences} field. */
        public VkSwapchainPresentFenceInfoEXT.Buffer pFences(@NativeType("VkFence const *") LongBuffer value) { VkSwapchainPresentFenceInfoEXT.npFences(address(), value); return this; }

    }

}