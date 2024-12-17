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
 * struct VkRenderPassAttachmentBeginInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t attachmentCount;
 *     VkImageView const * pAttachments;
 * }}</pre>
 */
public class VkRenderPassAttachmentBeginInfo extends Struct<VkRenderPassAttachmentBeginInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ATTACHMENTCOUNT,
        PATTACHMENTS;

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
        ATTACHMENTCOUNT = layout.offsetof(2);
        PATTACHMENTS = layout.offsetof(3);
    }

    protected VkRenderPassAttachmentBeginInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderPassAttachmentBeginInfo create(long address, @Nullable ByteBuffer container) {
        return new VkRenderPassAttachmentBeginInfo(address, container);
    }

    /**
     * Creates a {@code VkRenderPassAttachmentBeginInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassAttachmentBeginInfo(ByteBuffer container) {
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
    /** @return the value of the {@code attachmentCount} field. */
    @NativeType("uint32_t")
    public int attachmentCount() { return nattachmentCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pAttachments} field. */
    @NativeType("VkImageView const *")
    public @Nullable LongBuffer pAttachments() { return npAttachments(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderPassAttachmentBeginInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO} value to the {@code sType} field. */
    public VkRenderPassAttachmentBeginInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderPassAttachmentBeginInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pAttachments} field. */
    public VkRenderPassAttachmentBeginInfo pAttachments(@Nullable @NativeType("VkImageView const *") LongBuffer value) { npAttachments(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassAttachmentBeginInfo set(
        int sType,
        long pNext,
        @Nullable LongBuffer pAttachments
    ) {
        sType(sType);
        pNext(pNext);
        pAttachments(pAttachments);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassAttachmentBeginInfo set(VkRenderPassAttachmentBeginInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassAttachmentBeginInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassAttachmentBeginInfo malloc() {
        return new VkRenderPassAttachmentBeginInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassAttachmentBeginInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassAttachmentBeginInfo calloc() {
        return new VkRenderPassAttachmentBeginInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassAttachmentBeginInfo} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassAttachmentBeginInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassAttachmentBeginInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassAttachmentBeginInfo} instance for the specified memory address. */
    public static VkRenderPassAttachmentBeginInfo create(long address) {
        return new VkRenderPassAttachmentBeginInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderPassAttachmentBeginInfo createSafe(long address) {
        return address == NULL ? null : new VkRenderPassAttachmentBeginInfo(address, null);
    }

    /**
     * Returns a new {@link VkRenderPassAttachmentBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassAttachmentBeginInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassAttachmentBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassAttachmentBeginInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassAttachmentBeginInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassAttachmentBeginInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderPassAttachmentBeginInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassAttachmentBeginInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderPassAttachmentBeginInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderPassAttachmentBeginInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassAttachmentBeginInfo malloc(MemoryStack stack) {
        return new VkRenderPassAttachmentBeginInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderPassAttachmentBeginInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassAttachmentBeginInfo calloc(MemoryStack stack) {
        return new VkRenderPassAttachmentBeginInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderPassAttachmentBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassAttachmentBeginInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassAttachmentBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassAttachmentBeginInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderPassAttachmentBeginInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassAttachmentBeginInfo.PNEXT); }
    /** Unsafe version of {@link #attachmentCount}. */
    public static int nattachmentCount(long struct) { return memGetInt(struct + VkRenderPassAttachmentBeginInfo.ATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pAttachments() pAttachments}. */
    public static @Nullable LongBuffer npAttachments(long struct) { return memLongBufferSafe(memGetAddress(struct + VkRenderPassAttachmentBeginInfo.PATTACHMENTS), nattachmentCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassAttachmentBeginInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassAttachmentBeginInfo.PNEXT, value); }
    /** Sets the specified value to the {@code attachmentCount} field of the specified {@code struct}. */
    public static void nattachmentCount(long struct, int value) { memPutInt(struct + VkRenderPassAttachmentBeginInfo.ATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pAttachments(LongBuffer) pAttachments}. */
    public static void npAttachments(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkRenderPassAttachmentBeginInfo.PATTACHMENTS, memAddressSafe(value)); nattachmentCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nattachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassAttachmentBeginInfo.PATTACHMENTS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkRenderPassAttachmentBeginInfo} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassAttachmentBeginInfo, Buffer> implements NativeResource {

        private static final VkRenderPassAttachmentBeginInfo ELEMENT_FACTORY = VkRenderPassAttachmentBeginInfo.create(-1L);

        /**
         * Creates a new {@code VkRenderPassAttachmentBeginInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassAttachmentBeginInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderPassAttachmentBeginInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassAttachmentBeginInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassAttachmentBeginInfo.npNext(address()); }
        /** @return the value of the {@code attachmentCount} field. */
        @NativeType("uint32_t")
        public int attachmentCount() { return VkRenderPassAttachmentBeginInfo.nattachmentCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pAttachments} field. */
        @NativeType("VkImageView const *")
        public @Nullable LongBuffer pAttachments() { return VkRenderPassAttachmentBeginInfo.npAttachments(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderPassAttachmentBeginInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassAttachmentBeginInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO} value to the {@code sType} field. */
        public VkRenderPassAttachmentBeginInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderPassAttachmentBeginInfo.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassAttachmentBeginInfo.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pAttachments} field. */
        public VkRenderPassAttachmentBeginInfo.Buffer pAttachments(@Nullable @NativeType("VkImageView const *") LongBuffer value) { VkRenderPassAttachmentBeginInfo.npAttachments(address(), value); return this; }

    }

}