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
 * Presentation modes for a vkQueuePresentKHR operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@code pNext} chain of {@link VkPresentInfoKHR} includes a {@link VkSwapchainPresentModeInfoEXT} structure, then that structure defines the presentation modes used for the current and subsequent presentation operations.</p>
 * 
 * <p>When the application changes present modes with {@link VkSwapchainPresentModeInfoEXT}, images that have already been queued for presentation will continue to be presented according to the previous present mode. The current image being queued for presentation and subsequent images will be presented according to the new present mode. The behavior during the transition between the two modes is defined as follows.</p>
 * 
 * <ul>
 * <li>Transition from {@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR} to {@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR}: the presentation engine updates the shared presentable image according to the behavior of {@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR}.</li>
 * <li>Transition from {@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR} to {@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR}: the presentation engine <b>may</b> update the shared presentable image or defer that to its regular refresh cycle, according to the behavior of {@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR}.</li>
 * <li>Transition between {@link KHRSurface#VK_PRESENT_MODE_FIFO_KHR PRESENT_MODE_FIFO_KHR} and {@link KHRSurface#VK_PRESENT_MODE_FIFO_RELAXED_KHR PRESENT_MODE_FIFO_RELAXED_KHR}: Images continue to be appended to the same FIFO queue, and the behavior with respect to waiting for vertical blanking period will follow the new mode for current and subsequent images.</li>
 * <li>Transition from {@link KHRSurface#VK_PRESENT_MODE_IMMEDIATE_KHR PRESENT_MODE_IMMEDIATE_KHR} to {@link KHRSurface#VK_PRESENT_MODE_FIFO_KHR PRESENT_MODE_FIFO_KHR} or {@link KHRSurface#VK_PRESENT_MODE_FIFO_RELAXED_KHR PRESENT_MODE_FIFO_RELAXED_KHR}: As all prior present requests in the {@link KHRSurface#VK_PRESENT_MODE_IMMEDIATE_KHR PRESENT_MODE_IMMEDIATE_KHR} mode are applied immediately, there are no outstanding present operations in this mode, and current and subsequent images are appended to the FIFO queue and presented according to the new mode.</li>
 * <li>Transition from {@link KHRSurface#VK_PRESENT_MODE_MAILBOX_KHR PRESENT_MODE_MAILBOX_KHR} to {@link KHRSurface#VK_PRESENT_MODE_FIFO_KHR PRESENT_MODE_FIFO_KHR} or {@link KHRSurface#VK_PRESENT_MODE_FIFO_RELAXED_KHR PRESENT_MODE_FIFO_RELAXED_KHR}: Presentation in both modes require waiting for the next vertical blanking period, with {@link KHRSurface#VK_PRESENT_MODE_MAILBOX_KHR PRESENT_MODE_MAILBOX_KHR} allowing the pending present operation to be replaced by a new one. In this case, the current present operation will replace the pending present operation and is applied according to the new mode.</li>
 * <li>Transition from {@link KHRSurface#VK_PRESENT_MODE_FIFO_KHR PRESENT_MODE_FIFO_KHR} or {@link KHRSurface#VK_PRESENT_MODE_FIFO_RELAXED_KHR PRESENT_MODE_FIFO_RELAXED_KHR} to {@link KHRSurface#VK_PRESENT_MODE_IMMEDIATE_KHR PRESENT_MODE_IMMEDIATE_KHR} or {@link KHRSurface#VK_PRESENT_MODE_MAILBOX_KHR PRESENT_MODE_MAILBOX_KHR}: If the FIFO queue is empty, presentation is done according to the behavior of the new mode. If there are present operations in the FIFO queue, once the last present operation is performed based on the respective vertical blanking period, the current and subsequent updates are applied according to the new mode.</li>
 * <li>The behavior during transition between any other present modes, if possible, is implementation defined.</li>
 * </ul>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code swapchainCount} <b>must</b> be equal to {@link VkPresentInfoKHR}{@code ::swapchainCount}</li>
 * <li>Each entry in {@code pPresentModes} must be a presentation mode specified in {@link VkSwapchainPresentModesCreateInfoEXT}{@code ::pPresentModes} when creating the entry’s corresponding swapchain</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSwapchainMaintenance1#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_EXT}</li>
 * <li>{@code pPresentModes} <b>must</b> be a valid pointer to an array of {@code swapchainCount} valid {@code VkPresentModeKHR} values</li>
 * <li>{@code swapchainCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSwapchainPresentModeInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #swapchainCount};
 *     VkPresentModeKHR const * {@link #pPresentModes};
 * }</code></pre>
 */
public class VkSwapchainPresentModeInfoEXT extends Struct<VkSwapchainPresentModeInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SWAPCHAINCOUNT,
        PPRESENTMODES;

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
        PPRESENTMODES = layout.offsetof(3);
    }

    protected VkSwapchainPresentModeInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSwapchainPresentModeInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSwapchainPresentModeInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkSwapchainPresentModeInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSwapchainPresentModeInfoEXT(ByteBuffer container) {
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
    /** a list of presentation modes with {@code swapchainCount} entries. */
    @NativeType("VkPresentModeKHR const *")
    public IntBuffer pPresentModes() { return npPresentModes(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSwapchainPresentModeInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSwapchainMaintenance1#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_EXT} value to the {@link #sType} field. */
    public VkSwapchainPresentModeInfoEXT sType$Default() { return sType(EXTSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSwapchainPresentModeInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pPresentModes} field. */
    public VkSwapchainPresentModeInfoEXT pPresentModes(@NativeType("VkPresentModeKHR const *") IntBuffer value) { npPresentModes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSwapchainPresentModeInfoEXT set(
        int sType,
        long pNext,
        IntBuffer pPresentModes
    ) {
        sType(sType);
        pNext(pNext);
        pPresentModes(pPresentModes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSwapchainPresentModeInfoEXT set(VkSwapchainPresentModeInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSwapchainPresentModeInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSwapchainPresentModeInfoEXT malloc() {
        return new VkSwapchainPresentModeInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainPresentModeInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSwapchainPresentModeInfoEXT calloc() {
        return new VkSwapchainPresentModeInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainPresentModeInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkSwapchainPresentModeInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainPresentModeInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSwapchainPresentModeInfoEXT} instance for the specified memory address. */
    public static VkSwapchainPresentModeInfoEXT create(long address) {
        return new VkSwapchainPresentModeInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSwapchainPresentModeInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkSwapchainPresentModeInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkSwapchainPresentModeInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentModeInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentModeInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentModeInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentModeInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentModeInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSwapchainPresentModeInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentModeInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSwapchainPresentModeInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSwapchainPresentModeInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainPresentModeInfoEXT malloc(MemoryStack stack) {
        return new VkSwapchainPresentModeInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSwapchainPresentModeInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainPresentModeInfoEXT calloc(MemoryStack stack) {
        return new VkSwapchainPresentModeInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSwapchainPresentModeInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentModeInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentModeInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentModeInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainPresentModeInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSwapchainPresentModeInfoEXT.PNEXT); }
    /** Unsafe version of {@link #swapchainCount}. */
    public static int nswapchainCount(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainPresentModeInfoEXT.SWAPCHAINCOUNT); }
    /** Unsafe version of {@link #pPresentModes() pPresentModes}. */
    public static IntBuffer npPresentModes(long struct) { return memIntBuffer(memGetAddress(struct + VkSwapchainPresentModeInfoEXT.PPRESENTMODES), nswapchainCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainPresentModeInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSwapchainPresentModeInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code swapchainCount} field of the specified {@code struct}. */
    public static void nswapchainCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainPresentModeInfoEXT.SWAPCHAINCOUNT, value); }
    /** Unsafe version of {@link #pPresentModes(IntBuffer) pPresentModes}. */
    public static void npPresentModes(long struct, IntBuffer value) { memPutAddress(struct + VkSwapchainPresentModeInfoEXT.PPRESENTMODES, memAddress(value)); nswapchainCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkSwapchainPresentModeInfoEXT.PPRESENTMODES));
    }

    // -----------------------------------

    /** An array of {@link VkSwapchainPresentModeInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkSwapchainPresentModeInfoEXT, Buffer> implements NativeResource {

        private static final VkSwapchainPresentModeInfoEXT ELEMENT_FACTORY = VkSwapchainPresentModeInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkSwapchainPresentModeInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSwapchainPresentModeInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSwapchainPresentModeInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSwapchainPresentModeInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSwapchainPresentModeInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkSwapchainPresentModeInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSwapchainPresentModeInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkSwapchainPresentModeInfoEXT#swapchainCount} field. */
        @NativeType("uint32_t")
        public int swapchainCount() { return VkSwapchainPresentModeInfoEXT.nswapchainCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkSwapchainPresentModeInfoEXT#pPresentModes} field. */
        @NativeType("VkPresentModeKHR const *")
        public IntBuffer pPresentModes() { return VkSwapchainPresentModeInfoEXT.npPresentModes(address()); }

        /** Sets the specified value to the {@link VkSwapchainPresentModeInfoEXT#sType} field. */
        public VkSwapchainPresentModeInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSwapchainPresentModeInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSwapchainMaintenance1#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_EXT} value to the {@link VkSwapchainPresentModeInfoEXT#sType} field. */
        public VkSwapchainPresentModeInfoEXT.Buffer sType$Default() { return sType(EXTSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_EXT); }
        /** Sets the specified value to the {@link VkSwapchainPresentModeInfoEXT#pNext} field. */
        public VkSwapchainPresentModeInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkSwapchainPresentModeInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkSwapchainPresentModeInfoEXT#pPresentModes} field. */
        public VkSwapchainPresentModeInfoEXT.Buffer pPresentModes(@NativeType("VkPresentModeKHR const *") IntBuffer value) { VkSwapchainPresentModeInfoEXT.npPresentModes(address(), value); return this; }

    }

}