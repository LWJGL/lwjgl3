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
 * Structure specifying striped rendering submit information.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure can be included in the {@code pNext} chain of {@link VkCommandBufferSubmitInfo} to provide a set of semaphores to be signaled for each striped render pass instance.</p>
 * 
 * <p>The elements of {@code pStripeSemaphoreInfos} are mapped to render pass instances in {@link VkCommandBufferSubmitInfo}{@code ::commandBuffer} in submission order and in stripe order within each render pass instance. Each semaphore in {@code pStripeSemaphoreInfos} is signaled when the implementation has completed execution of the associated stripe. In a render pass instance that has multiview enabled, the stripe includes all views in the view mask. In a render pass instance with {@code layerCount} greater than 1, the stripe includes all layers.</p>
 * 
 * <p>Render pass instances that specify the {@link VK13#VK_RENDERING_RESUMING_BIT RENDERING_RESUMING_BIT} will not have any elements of {@code pStripeSemaphoreInfos} mapped to them. Instead, for suspending and resuming render pass instances, this mapping is done for the first suspending render pass instance, and the per-stripe semaphores are only signaled for the last resuming render pass instance.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code semaphore} member of each element of {@code pStripeSemaphoreInfos} <b>must</b> have been created with a {@code VkSemaphoreType} of {@link VK12#VK_SEMAPHORE_TYPE_BINARY SEMAPHORE_TYPE_BINARY}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link ARMRenderPassStriped#VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM}</li>
 * <li>{@code pStripeSemaphoreInfos} <b>must</b> be a valid pointer to an array of {@code stripeSemaphoreInfoCount} valid {@link VkSemaphoreSubmitInfo} structures</li>
 * <li>{@code stripeSemaphoreInfoCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSemaphoreSubmitInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassStripeSubmitInfoARM {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #stripeSemaphoreInfoCount};
 *     {@link VkSemaphoreSubmitInfo VkSemaphoreSubmitInfo} const * {@link #pStripeSemaphoreInfos};
 * }</code></pre>
 */
public class VkRenderPassStripeSubmitInfoARM extends Struct<VkRenderPassStripeSubmitInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STRIPESEMAPHOREINFOCOUNT,
        PSTRIPESEMAPHOREINFOS;

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
        STRIPESEMAPHOREINFOCOUNT = layout.offsetof(2);
        PSTRIPESEMAPHOREINFOS = layout.offsetof(3);
    }

    protected VkRenderPassStripeSubmitInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderPassStripeSubmitInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkRenderPassStripeSubmitInfoARM(address, container);
    }

    /**
     * Creates a {@code VkRenderPassStripeSubmitInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassStripeSubmitInfoARM(ByteBuffer container) {
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
    /** the number of semaphores used to signal stripe completion in the render pass instances in the submitted command buffer. */
    @NativeType("uint32_t")
    public int stripeSemaphoreInfoCount() { return nstripeSemaphoreInfoCount(address()); }
    /** a pointer to an array of {@code stripeSemaphoreInfoCount} {@link VkSemaphoreSubmitInfo} structures describing the semaphores used to signal stripe completion. */
    @NativeType("VkSemaphoreSubmitInfo const *")
    public VkSemaphoreSubmitInfo.Buffer pStripeSemaphoreInfos() { return npStripeSemaphoreInfos(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkRenderPassStripeSubmitInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMRenderPassStriped#VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM} value to the {@link #sType} field. */
    public VkRenderPassStripeSubmitInfoARM sType$Default() { return sType(ARMRenderPassStriped.VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkRenderPassStripeSubmitInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkSemaphoreSubmitInfo.Buffer} to the {@link #pStripeSemaphoreInfos} field. */
    public VkRenderPassStripeSubmitInfoARM pStripeSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) { npStripeSemaphoreInfos(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassStripeSubmitInfoARM set(
        int sType,
        long pNext,
        VkSemaphoreSubmitInfo.Buffer pStripeSemaphoreInfos
    ) {
        sType(sType);
        pNext(pNext);
        pStripeSemaphoreInfos(pStripeSemaphoreInfos);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassStripeSubmitInfoARM set(VkRenderPassStripeSubmitInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassStripeSubmitInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassStripeSubmitInfoARM malloc() {
        return new VkRenderPassStripeSubmitInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassStripeSubmitInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassStripeSubmitInfoARM calloc() {
        return new VkRenderPassStripeSubmitInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassStripeSubmitInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassStripeSubmitInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassStripeSubmitInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassStripeSubmitInfoARM} instance for the specified memory address. */
    public static VkRenderPassStripeSubmitInfoARM create(long address) {
        return new VkRenderPassStripeSubmitInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderPassStripeSubmitInfoARM createSafe(long address) {
        return address == NULL ? null : new VkRenderPassStripeSubmitInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkRenderPassStripeSubmitInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassStripeSubmitInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassStripeSubmitInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassStripeSubmitInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassStripeSubmitInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassStripeSubmitInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderPassStripeSubmitInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassStripeSubmitInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderPassStripeSubmitInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderPassStripeSubmitInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassStripeSubmitInfoARM malloc(MemoryStack stack) {
        return new VkRenderPassStripeSubmitInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderPassStripeSubmitInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassStripeSubmitInfoARM calloc(MemoryStack stack) {
        return new VkRenderPassStripeSubmitInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderPassStripeSubmitInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassStripeSubmitInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassStripeSubmitInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassStripeSubmitInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderPassStripeSubmitInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassStripeSubmitInfoARM.PNEXT); }
    /** Unsafe version of {@link #stripeSemaphoreInfoCount}. */
    public static int nstripeSemaphoreInfoCount(long struct) { return memGetInt(struct + VkRenderPassStripeSubmitInfoARM.STRIPESEMAPHOREINFOCOUNT); }
    /** Unsafe version of {@link #pStripeSemaphoreInfos}. */
    public static VkSemaphoreSubmitInfo.Buffer npStripeSemaphoreInfos(long struct) { return VkSemaphoreSubmitInfo.create(memGetAddress(struct + VkRenderPassStripeSubmitInfoARM.PSTRIPESEMAPHOREINFOS), nstripeSemaphoreInfoCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassStripeSubmitInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassStripeSubmitInfoARM.PNEXT, value); }
    /** Sets the specified value to the {@code stripeSemaphoreInfoCount} field of the specified {@code struct}. */
    public static void nstripeSemaphoreInfoCount(long struct, int value) { memPutInt(struct + VkRenderPassStripeSubmitInfoARM.STRIPESEMAPHOREINFOCOUNT, value); }
    /** Unsafe version of {@link #pStripeSemaphoreInfos(VkSemaphoreSubmitInfo.Buffer) pStripeSemaphoreInfos}. */
    public static void npStripeSemaphoreInfos(long struct, VkSemaphoreSubmitInfo.Buffer value) { memPutAddress(struct + VkRenderPassStripeSubmitInfoARM.PSTRIPESEMAPHOREINFOS, value.address()); nstripeSemaphoreInfoCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkRenderPassStripeSubmitInfoARM.PSTRIPESEMAPHOREINFOS));
    }

    // -----------------------------------

    /** An array of {@link VkRenderPassStripeSubmitInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassStripeSubmitInfoARM, Buffer> implements NativeResource {

        private static final VkRenderPassStripeSubmitInfoARM ELEMENT_FACTORY = VkRenderPassStripeSubmitInfoARM.create(-1L);

        /**
         * Creates a new {@code VkRenderPassStripeSubmitInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassStripeSubmitInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderPassStripeSubmitInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRenderPassStripeSubmitInfoARM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassStripeSubmitInfoARM.nsType(address()); }
        /** @return the value of the {@link VkRenderPassStripeSubmitInfoARM#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassStripeSubmitInfoARM.npNext(address()); }
        /** @return the value of the {@link VkRenderPassStripeSubmitInfoARM#stripeSemaphoreInfoCount} field. */
        @NativeType("uint32_t")
        public int stripeSemaphoreInfoCount() { return VkRenderPassStripeSubmitInfoARM.nstripeSemaphoreInfoCount(address()); }
        /** @return a {@link VkSemaphoreSubmitInfo.Buffer} view of the struct array pointed to by the {@link VkRenderPassStripeSubmitInfoARM#pStripeSemaphoreInfos} field. */
        @NativeType("VkSemaphoreSubmitInfo const *")
        public VkSemaphoreSubmitInfo.Buffer pStripeSemaphoreInfos() { return VkRenderPassStripeSubmitInfoARM.npStripeSemaphoreInfos(address()); }

        /** Sets the specified value to the {@link VkRenderPassStripeSubmitInfoARM#sType} field. */
        public VkRenderPassStripeSubmitInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassStripeSubmitInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMRenderPassStriped#VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM} value to the {@link VkRenderPassStripeSubmitInfoARM#sType} field. */
        public VkRenderPassStripeSubmitInfoARM.Buffer sType$Default() { return sType(ARMRenderPassStriped.VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM); }
        /** Sets the specified value to the {@link VkRenderPassStripeSubmitInfoARM#pNext} field. */
        public VkRenderPassStripeSubmitInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassStripeSubmitInfoARM.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkSemaphoreSubmitInfo.Buffer} to the {@link VkRenderPassStripeSubmitInfoARM#pStripeSemaphoreInfos} field. */
        public VkRenderPassStripeSubmitInfoARM.Buffer pStripeSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) { VkRenderPassStripeSubmitInfoARM.npStripeSemaphoreInfos(address(), value); return this; }

    }

}