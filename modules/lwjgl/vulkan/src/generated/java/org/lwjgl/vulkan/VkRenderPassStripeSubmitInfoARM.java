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
 * struct VkRenderPassStripeSubmitInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t stripeSemaphoreInfoCount;
 *     {@link VkSemaphoreSubmitInfo VkSemaphoreSubmitInfo} const * pStripeSemaphoreInfos;
 * }}</pre>
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code stripeSemaphoreInfoCount} field. */
    @NativeType("uint32_t")
    public int stripeSemaphoreInfoCount() { return nstripeSemaphoreInfoCount(address()); }
    /** @return a {@link VkSemaphoreSubmitInfo.Buffer} view of the struct array pointed to by the {@code pStripeSemaphoreInfos} field. */
    @NativeType("VkSemaphoreSubmitInfo const *")
    public VkSemaphoreSubmitInfo.Buffer pStripeSemaphoreInfos() { return npStripeSemaphoreInfos(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderPassStripeSubmitInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMRenderPassStriped#VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM} value to the {@code sType} field. */
    public VkRenderPassStripeSubmitInfoARM sType$Default() { return sType(ARMRenderPassStriped.VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderPassStripeSubmitInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkSemaphoreSubmitInfo.Buffer} to the {@code pStripeSemaphoreInfos} field. */
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

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassStripeSubmitInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassStripeSubmitInfoARM.npNext(address()); }
        /** @return the value of the {@code stripeSemaphoreInfoCount} field. */
        @NativeType("uint32_t")
        public int stripeSemaphoreInfoCount() { return VkRenderPassStripeSubmitInfoARM.nstripeSemaphoreInfoCount(address()); }
        /** @return a {@link VkSemaphoreSubmitInfo.Buffer} view of the struct array pointed to by the {@code pStripeSemaphoreInfos} field. */
        @NativeType("VkSemaphoreSubmitInfo const *")
        public VkSemaphoreSubmitInfo.Buffer pStripeSemaphoreInfos() { return VkRenderPassStripeSubmitInfoARM.npStripeSemaphoreInfos(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderPassStripeSubmitInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassStripeSubmitInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMRenderPassStriped#VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM} value to the {@code sType} field. */
        public VkRenderPassStripeSubmitInfoARM.Buffer sType$Default() { return sType(ARMRenderPassStriped.VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderPassStripeSubmitInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassStripeSubmitInfoARM.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkSemaphoreSubmitInfo.Buffer} to the {@code pStripeSemaphoreInfos} field. */
        public VkRenderPassStripeSubmitInfoARM.Buffer pStripeSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) { VkRenderPassStripeSubmitInfoARM.npStripeSemaphoreInfos(address(), value); return this; }

    }

}