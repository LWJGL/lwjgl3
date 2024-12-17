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
 * struct VkAttachmentReference2 {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t attachment;
 *     VkImageLayout layout;
 *     VkImageAspectFlags aspectMask;
 * }}</pre>
 */
public class VkAttachmentReference2 extends Struct<VkAttachmentReference2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ATTACHMENT,
        LAYOUT,
        ASPECTMASK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ATTACHMENT = layout.offsetof(2);
        LAYOUT = layout.offsetof(3);
        ASPECTMASK = layout.offsetof(4);
    }

    protected VkAttachmentReference2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAttachmentReference2 create(long address, @Nullable ByteBuffer container) {
        return new VkAttachmentReference2(address, container);
    }

    /**
     * Creates a {@code VkAttachmentReference2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAttachmentReference2(ByteBuffer container) {
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
    /** @return the value of the {@code attachment} field. */
    @NativeType("uint32_t")
    public int attachment() { return nattachment(address()); }
    /** @return the value of the {@code layout} field. */
    @NativeType("VkImageLayout")
    public int layout() { return nlayout(address()); }
    /** @return the value of the {@code aspectMask} field. */
    @NativeType("VkImageAspectFlags")
    public int aspectMask() { return naspectMask(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAttachmentReference2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2 STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2} value to the {@code sType} field. */
    public VkAttachmentReference2 sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAttachmentReference2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkAttachmentReferenceStencilLayout} value to the {@code pNext} chain. */
    public VkAttachmentReference2 pNext(VkAttachmentReferenceStencilLayout value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkAttachmentReferenceStencilLayoutKHR} value to the {@code pNext} chain. */
    public VkAttachmentReference2 pNext(VkAttachmentReferenceStencilLayoutKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code attachment} field. */
    public VkAttachmentReference2 attachment(@NativeType("uint32_t") int value) { nattachment(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    public VkAttachmentReference2 layout(@NativeType("VkImageLayout") int value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code aspectMask} field. */
    public VkAttachmentReference2 aspectMask(@NativeType("VkImageAspectFlags") int value) { naspectMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAttachmentReference2 set(
        int sType,
        long pNext,
        int attachment,
        int layout,
        int aspectMask
    ) {
        sType(sType);
        pNext(pNext);
        attachment(attachment);
        layout(layout);
        aspectMask(aspectMask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAttachmentReference2 set(VkAttachmentReference2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAttachmentReference2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAttachmentReference2 malloc() {
        return new VkAttachmentReference2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAttachmentReference2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAttachmentReference2 calloc() {
        return new VkAttachmentReference2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAttachmentReference2} instance allocated with {@link BufferUtils}. */
    public static VkAttachmentReference2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAttachmentReference2(memAddress(container), container);
    }

    /** Returns a new {@code VkAttachmentReference2} instance for the specified memory address. */
    public static VkAttachmentReference2 create(long address) {
        return new VkAttachmentReference2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAttachmentReference2 createSafe(long address) {
        return address == NULL ? null : new VkAttachmentReference2(address, null);
    }

    /**
     * Returns a new {@link VkAttachmentReference2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReference2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReference2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAttachmentReference2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAttachmentReference2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAttachmentReference2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentReference2 malloc(MemoryStack stack) {
        return new VkAttachmentReference2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAttachmentReference2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentReference2 calloc(MemoryStack stack) {
        return new VkAttachmentReference2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAttachmentReference2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReference2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAttachmentReference2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAttachmentReference2.PNEXT); }
    /** Unsafe version of {@link #attachment}. */
    public static int nattachment(long struct) { return memGetInt(struct + VkAttachmentReference2.ATTACHMENT); }
    /** Unsafe version of {@link #layout}. */
    public static int nlayout(long struct) { return memGetInt(struct + VkAttachmentReference2.LAYOUT); }
    /** Unsafe version of {@link #aspectMask}. */
    public static int naspectMask(long struct) { return memGetInt(struct + VkAttachmentReference2.ASPECTMASK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAttachmentReference2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAttachmentReference2.PNEXT, value); }
    /** Unsafe version of {@link #attachment(int) attachment}. */
    public static void nattachment(long struct, int value) { memPutInt(struct + VkAttachmentReference2.ATTACHMENT, value); }
    /** Unsafe version of {@link #layout(int) layout}. */
    public static void nlayout(long struct, int value) { memPutInt(struct + VkAttachmentReference2.LAYOUT, value); }
    /** Unsafe version of {@link #aspectMask(int) aspectMask}. */
    public static void naspectMask(long struct, int value) { memPutInt(struct + VkAttachmentReference2.ASPECTMASK, value); }

    // -----------------------------------

    /** An array of {@link VkAttachmentReference2} structs. */
    public static class Buffer extends StructBuffer<VkAttachmentReference2, Buffer> implements NativeResource {

        private static final VkAttachmentReference2 ELEMENT_FACTORY = VkAttachmentReference2.create(-1L);

        /**
         * Creates a new {@code VkAttachmentReference2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAttachmentReference2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAttachmentReference2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAttachmentReference2.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAttachmentReference2.npNext(address()); }
        /** @return the value of the {@code attachment} field. */
        @NativeType("uint32_t")
        public int attachment() { return VkAttachmentReference2.nattachment(address()); }
        /** @return the value of the {@code layout} field. */
        @NativeType("VkImageLayout")
        public int layout() { return VkAttachmentReference2.nlayout(address()); }
        /** @return the value of the {@code aspectMask} field. */
        @NativeType("VkImageAspectFlags")
        public int aspectMask() { return VkAttachmentReference2.naspectMask(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAttachmentReference2.Buffer sType(@NativeType("VkStructureType") int value) { VkAttachmentReference2.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2 STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2} value to the {@code sType} field. */
        public VkAttachmentReference2.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAttachmentReference2.Buffer pNext(@NativeType("void const *") long value) { VkAttachmentReference2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkAttachmentReferenceStencilLayout} value to the {@code pNext} chain. */
        public VkAttachmentReference2.Buffer pNext(VkAttachmentReferenceStencilLayout value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkAttachmentReferenceStencilLayoutKHR} value to the {@code pNext} chain. */
        public VkAttachmentReference2.Buffer pNext(VkAttachmentReferenceStencilLayoutKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code attachment} field. */
        public VkAttachmentReference2.Buffer attachment(@NativeType("uint32_t") int value) { VkAttachmentReference2.nattachment(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        public VkAttachmentReference2.Buffer layout(@NativeType("VkImageLayout") int value) { VkAttachmentReference2.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code aspectMask} field. */
        public VkAttachmentReference2.Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) { VkAttachmentReference2.naspectMask(address(), value); return this; }

    }

}