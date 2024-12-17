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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkRenderPassStripeInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkRect2D VkRect2D} stripeArea;
 * }}</pre>
 */
public class VkRenderPassStripeInfoARM extends Struct<VkRenderPassStripeInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STRIPEAREA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkRect2D.SIZEOF, VkRect2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STRIPEAREA = layout.offsetof(2);
    }

    protected VkRenderPassStripeInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderPassStripeInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkRenderPassStripeInfoARM(address, container);
    }

    /**
     * Creates a {@code VkRenderPassStripeInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassStripeInfoARM(ByteBuffer container) {
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
    /** @return a {@link VkRect2D} view of the {@code stripeArea} field. */
    public VkRect2D stripeArea() { return nstripeArea(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderPassStripeInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMRenderPassStriped#VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_INFO_ARM STRUCTURE_TYPE_RENDER_PASS_STRIPE_INFO_ARM} value to the {@code sType} field. */
    public VkRenderPassStripeInfoARM sType$Default() { return sType(ARMRenderPassStriped.VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderPassStripeInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkRect2D} to the {@code stripeArea} field. */
    public VkRenderPassStripeInfoARM stripeArea(VkRect2D value) { nstripeArea(address(), value); return this; }
    /** Passes the {@code stripeArea} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkRenderPassStripeInfoARM stripeArea(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(stripeArea()); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassStripeInfoARM set(
        int sType,
        long pNext,
        VkRect2D stripeArea
    ) {
        sType(sType);
        pNext(pNext);
        stripeArea(stripeArea);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassStripeInfoARM set(VkRenderPassStripeInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassStripeInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassStripeInfoARM malloc() {
        return new VkRenderPassStripeInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassStripeInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassStripeInfoARM calloc() {
        return new VkRenderPassStripeInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassStripeInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassStripeInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassStripeInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassStripeInfoARM} instance for the specified memory address. */
    public static VkRenderPassStripeInfoARM create(long address) {
        return new VkRenderPassStripeInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderPassStripeInfoARM createSafe(long address) {
        return address == NULL ? null : new VkRenderPassStripeInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkRenderPassStripeInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassStripeInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassStripeInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassStripeInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassStripeInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassStripeInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderPassStripeInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassStripeInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderPassStripeInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderPassStripeInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassStripeInfoARM malloc(MemoryStack stack) {
        return new VkRenderPassStripeInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderPassStripeInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassStripeInfoARM calloc(MemoryStack stack) {
        return new VkRenderPassStripeInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderPassStripeInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassStripeInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassStripeInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassStripeInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderPassStripeInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassStripeInfoARM.PNEXT); }
    /** Unsafe version of {@link #stripeArea}. */
    public static VkRect2D nstripeArea(long struct) { return VkRect2D.create(struct + VkRenderPassStripeInfoARM.STRIPEAREA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassStripeInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassStripeInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #stripeArea(VkRect2D) stripeArea}. */
    public static void nstripeArea(long struct, VkRect2D value) { memCopy(value.address(), struct + VkRenderPassStripeInfoARM.STRIPEAREA, VkRect2D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkRenderPassStripeInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassStripeInfoARM, Buffer> implements NativeResource {

        private static final VkRenderPassStripeInfoARM ELEMENT_FACTORY = VkRenderPassStripeInfoARM.create(-1L);

        /**
         * Creates a new {@code VkRenderPassStripeInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassStripeInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderPassStripeInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassStripeInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassStripeInfoARM.npNext(address()); }
        /** @return a {@link VkRect2D} view of the {@code stripeArea} field. */
        public VkRect2D stripeArea() { return VkRenderPassStripeInfoARM.nstripeArea(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderPassStripeInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassStripeInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMRenderPassStriped#VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_INFO_ARM STRUCTURE_TYPE_RENDER_PASS_STRIPE_INFO_ARM} value to the {@code sType} field. */
        public VkRenderPassStripeInfoARM.Buffer sType$Default() { return sType(ARMRenderPassStriped.VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderPassStripeInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassStripeInfoARM.npNext(address(), value); return this; }
        /** Copies the specified {@link VkRect2D} to the {@code stripeArea} field. */
        public VkRenderPassStripeInfoARM.Buffer stripeArea(VkRect2D value) { VkRenderPassStripeInfoARM.nstripeArea(address(), value); return this; }
        /** Passes the {@code stripeArea} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkRenderPassStripeInfoARM.Buffer stripeArea(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(stripeArea()); return this; }

    }

}