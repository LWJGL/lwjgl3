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
 * struct VkFragmentShadingRateAttachmentInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkAttachmentReference2 VkAttachmentReference2} const * pFragmentShadingRateAttachment;
 *     {@link VkExtent2D VkExtent2D} shadingRateAttachmentTexelSize;
 * }}</pre>
 */
public class VkFragmentShadingRateAttachmentInfoKHR extends Struct<VkFragmentShadingRateAttachmentInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PFRAGMENTSHADINGRATEATTACHMENT,
        SHADINGRATEATTACHMENTTEXELSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PFRAGMENTSHADINGRATEATTACHMENT = layout.offsetof(2);
        SHADINGRATEATTACHMENTTEXELSIZE = layout.offsetof(3);
    }

    protected VkFragmentShadingRateAttachmentInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkFragmentShadingRateAttachmentInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkFragmentShadingRateAttachmentInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkFragmentShadingRateAttachmentInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFragmentShadingRateAttachmentInfoKHR(ByteBuffer container) {
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
    /** @return a {@link VkAttachmentReference2} view of the struct pointed to by the {@code pFragmentShadingRateAttachment} field. */
    @NativeType("VkAttachmentReference2 const *")
    public @Nullable VkAttachmentReference2 pFragmentShadingRateAttachment() { return npFragmentShadingRateAttachment(address()); }
    /** @return a {@link VkExtent2D} view of the {@code shadingRateAttachmentTexelSize} field. */
    public VkExtent2D shadingRateAttachmentTexelSize() { return nshadingRateAttachmentTexelSize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkFragmentShadingRateAttachmentInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRFragmentShadingRate#VK_STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR} value to the {@code sType} field. */
    public VkFragmentShadingRateAttachmentInfoKHR sType$Default() { return sType(KHRFragmentShadingRate.VK_STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkFragmentShadingRateAttachmentInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2} to the {@code pFragmentShadingRateAttachment} field. */
    public VkFragmentShadingRateAttachmentInfoKHR pFragmentShadingRateAttachment(@Nullable @NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) { npFragmentShadingRateAttachment(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@code shadingRateAttachmentTexelSize} field. */
    public VkFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize(VkExtent2D value) { nshadingRateAttachmentTexelSize(address(), value); return this; }
    /** Passes the {@code shadingRateAttachmentTexelSize} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(shadingRateAttachmentTexelSize()); return this; }

    /** Initializes this struct with the specified values. */
    public VkFragmentShadingRateAttachmentInfoKHR set(
        int sType,
        long pNext,
        @Nullable VkAttachmentReference2 pFragmentShadingRateAttachment,
        VkExtent2D shadingRateAttachmentTexelSize
    ) {
        sType(sType);
        pNext(pNext);
        pFragmentShadingRateAttachment(pFragmentShadingRateAttachment);
        shadingRateAttachmentTexelSize(shadingRateAttachmentTexelSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkFragmentShadingRateAttachmentInfoKHR set(VkFragmentShadingRateAttachmentInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFragmentShadingRateAttachmentInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFragmentShadingRateAttachmentInfoKHR malloc() {
        return new VkFragmentShadingRateAttachmentInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkFragmentShadingRateAttachmentInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFragmentShadingRateAttachmentInfoKHR calloc() {
        return new VkFragmentShadingRateAttachmentInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkFragmentShadingRateAttachmentInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkFragmentShadingRateAttachmentInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFragmentShadingRateAttachmentInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkFragmentShadingRateAttachmentInfoKHR} instance for the specified memory address. */
    public static VkFragmentShadingRateAttachmentInfoKHR create(long address) {
        return new VkFragmentShadingRateAttachmentInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkFragmentShadingRateAttachmentInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkFragmentShadingRateAttachmentInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkFragmentShadingRateAttachmentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFragmentShadingRateAttachmentInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFragmentShadingRateAttachmentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFragmentShadingRateAttachmentInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFragmentShadingRateAttachmentInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFragmentShadingRateAttachmentInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkFragmentShadingRateAttachmentInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFragmentShadingRateAttachmentInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkFragmentShadingRateAttachmentInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkFragmentShadingRateAttachmentInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFragmentShadingRateAttachmentInfoKHR malloc(MemoryStack stack) {
        return new VkFragmentShadingRateAttachmentInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkFragmentShadingRateAttachmentInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFragmentShadingRateAttachmentInfoKHR calloc(MemoryStack stack) {
        return new VkFragmentShadingRateAttachmentInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkFragmentShadingRateAttachmentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFragmentShadingRateAttachmentInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFragmentShadingRateAttachmentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFragmentShadingRateAttachmentInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkFragmentShadingRateAttachmentInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFragmentShadingRateAttachmentInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pFragmentShadingRateAttachment}. */
    public static @Nullable VkAttachmentReference2 npFragmentShadingRateAttachment(long struct) { return VkAttachmentReference2.createSafe(memGetAddress(struct + VkFragmentShadingRateAttachmentInfoKHR.PFRAGMENTSHADINGRATEATTACHMENT)); }
    /** Unsafe version of {@link #shadingRateAttachmentTexelSize}. */
    public static VkExtent2D nshadingRateAttachmentTexelSize(long struct) { return VkExtent2D.create(struct + VkFragmentShadingRateAttachmentInfoKHR.SHADINGRATEATTACHMENTTEXELSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkFragmentShadingRateAttachmentInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFragmentShadingRateAttachmentInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pFragmentShadingRateAttachment(VkAttachmentReference2) pFragmentShadingRateAttachment}. */
    public static void npFragmentShadingRateAttachment(long struct, @Nullable VkAttachmentReference2 value) { memPutAddress(struct + VkFragmentShadingRateAttachmentInfoKHR.PFRAGMENTSHADINGRATEATTACHMENT, memAddressSafe(value)); }
    /** Unsafe version of {@link #shadingRateAttachmentTexelSize(VkExtent2D) shadingRateAttachmentTexelSize}. */
    public static void nshadingRateAttachmentTexelSize(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkFragmentShadingRateAttachmentInfoKHR.SHADINGRATEATTACHMENTTEXELSIZE, VkExtent2D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkFragmentShadingRateAttachmentInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkFragmentShadingRateAttachmentInfoKHR, Buffer> implements NativeResource {

        private static final VkFragmentShadingRateAttachmentInfoKHR ELEMENT_FACTORY = VkFragmentShadingRateAttachmentInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkFragmentShadingRateAttachmentInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFragmentShadingRateAttachmentInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkFragmentShadingRateAttachmentInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFragmentShadingRateAttachmentInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkFragmentShadingRateAttachmentInfoKHR.npNext(address()); }
        /** @return a {@link VkAttachmentReference2} view of the struct pointed to by the {@code pFragmentShadingRateAttachment} field. */
        @NativeType("VkAttachmentReference2 const *")
        public @Nullable VkAttachmentReference2 pFragmentShadingRateAttachment() { return VkFragmentShadingRateAttachmentInfoKHR.npFragmentShadingRateAttachment(address()); }
        /** @return a {@link VkExtent2D} view of the {@code shadingRateAttachmentTexelSize} field. */
        public VkExtent2D shadingRateAttachmentTexelSize() { return VkFragmentShadingRateAttachmentInfoKHR.nshadingRateAttachmentTexelSize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkFragmentShadingRateAttachmentInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkFragmentShadingRateAttachmentInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRFragmentShadingRate#VK_STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR} value to the {@code sType} field. */
        public VkFragmentShadingRateAttachmentInfoKHR.Buffer sType$Default() { return sType(KHRFragmentShadingRate.VK_STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkFragmentShadingRateAttachmentInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkFragmentShadingRateAttachmentInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2} to the {@code pFragmentShadingRateAttachment} field. */
        public VkFragmentShadingRateAttachmentInfoKHR.Buffer pFragmentShadingRateAttachment(@Nullable @NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) { VkFragmentShadingRateAttachmentInfoKHR.npFragmentShadingRateAttachment(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@code shadingRateAttachmentTexelSize} field. */
        public VkFragmentShadingRateAttachmentInfoKHR.Buffer shadingRateAttachmentTexelSize(VkExtent2D value) { VkFragmentShadingRateAttachmentInfoKHR.nshadingRateAttachmentTexelSize(address(), value); return this; }
        /** Passes the {@code shadingRateAttachmentTexelSize} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkFragmentShadingRateAttachmentInfoKHR.Buffer shadingRateAttachmentTexelSize(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(shadingRateAttachmentTexelSize()); return this; }

    }

}