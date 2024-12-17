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
 * struct VkFramebufferCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkFramebufferCreateFlags flags;
 *     VkRenderPass renderPass;
 *     uint32_t attachmentCount;
 *     VkImageView const * pAttachments;
 *     uint32_t width;
 *     uint32_t height;
 *     uint32_t layers;
 * }}</pre>
 */
public class VkFramebufferCreateInfo extends Struct<VkFramebufferCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        RENDERPASS,
        ATTACHMENTCOUNT,
        PATTACHMENTS,
        WIDTH,
        HEIGHT,
        LAYERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
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
        FLAGS = layout.offsetof(2);
        RENDERPASS = layout.offsetof(3);
        ATTACHMENTCOUNT = layout.offsetof(4);
        PATTACHMENTS = layout.offsetof(5);
        WIDTH = layout.offsetof(6);
        HEIGHT = layout.offsetof(7);
        LAYERS = layout.offsetof(8);
    }

    protected VkFramebufferCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkFramebufferCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkFramebufferCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkFramebufferCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFramebufferCreateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkFramebufferCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code renderPass} field. */
    @NativeType("VkRenderPass")
    public long renderPass() { return nrenderPass(address()); }
    /** @return the value of the {@code attachmentCount} field. */
    @NativeType("uint32_t")
    public int attachmentCount() { return nattachmentCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pAttachments} field. */
    @NativeType("VkImageView const *")
    public @Nullable LongBuffer pAttachments() { return npAttachments(address()); }
    /** @return the value of the {@code width} field. */
    @NativeType("uint32_t")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("uint32_t")
    public int height() { return nheight(address()); }
    /** @return the value of the {@code layers} field. */
    @NativeType("uint32_t")
    public int layers() { return nlayers(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkFramebufferCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO} value to the {@code sType} field. */
    public VkFramebufferCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkFramebufferCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkFramebufferAttachmentsCreateInfo} value to the {@code pNext} chain. */
    public VkFramebufferCreateInfo pNext(VkFramebufferAttachmentsCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkFramebufferAttachmentsCreateInfoKHR} value to the {@code pNext} chain. */
    public VkFramebufferCreateInfo pNext(VkFramebufferAttachmentsCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkFramebufferCreateInfo flags(@NativeType("VkFramebufferCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code renderPass} field. */
    public VkFramebufferCreateInfo renderPass(@NativeType("VkRenderPass") long value) { nrenderPass(address(), value); return this; }
    /** Sets the specified value to the {@code attachmentCount} field. */
    public VkFramebufferCreateInfo attachmentCount(@NativeType("uint32_t") int value) { nattachmentCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pAttachments} field. */
    public VkFramebufferCreateInfo pAttachments(@Nullable @NativeType("VkImageView const *") LongBuffer value) { npAttachments(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public VkFramebufferCreateInfo width(@NativeType("uint32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public VkFramebufferCreateInfo height(@NativeType("uint32_t") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code layers} field. */
    public VkFramebufferCreateInfo layers(@NativeType("uint32_t") int value) { nlayers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkFramebufferCreateInfo set(
        int sType,
        long pNext,
        int flags,
        long renderPass,
        int attachmentCount,
        @Nullable LongBuffer pAttachments,
        int width,
        int height,
        int layers
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        renderPass(renderPass);
        attachmentCount(attachmentCount);
        pAttachments(pAttachments);
        width(width);
        height(height);
        layers(layers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkFramebufferCreateInfo set(VkFramebufferCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFramebufferCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFramebufferCreateInfo malloc() {
        return new VkFramebufferCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkFramebufferCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFramebufferCreateInfo calloc() {
        return new VkFramebufferCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkFramebufferCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkFramebufferCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFramebufferCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkFramebufferCreateInfo} instance for the specified memory address. */
    public static VkFramebufferCreateInfo create(long address) {
        return new VkFramebufferCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkFramebufferCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkFramebufferCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkFramebufferCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFramebufferCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkFramebufferCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkFramebufferCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkFramebufferCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkFramebufferCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkFramebufferCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFramebufferCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFramebufferCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFramebufferCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFramebufferCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkFramebufferCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferCreateInfo malloc(MemoryStack stack) {
        return new VkFramebufferCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkFramebufferCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferCreateInfo calloc(MemoryStack stack) {
        return new VkFramebufferCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkFramebufferCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFramebufferCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkFramebufferCreateInfo.FLAGS); }
    /** Unsafe version of {@link #renderPass}. */
    public static long nrenderPass(long struct) { return memGetLong(struct + VkFramebufferCreateInfo.RENDERPASS); }
    /** Unsafe version of {@link #attachmentCount}. */
    public static int nattachmentCount(long struct) { return memGetInt(struct + VkFramebufferCreateInfo.ATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pAttachments() pAttachments}. */
    public static @Nullable LongBuffer npAttachments(long struct) { return memLongBufferSafe(memGetAddress(struct + VkFramebufferCreateInfo.PATTACHMENTS), nattachmentCount(struct)); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + VkFramebufferCreateInfo.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + VkFramebufferCreateInfo.HEIGHT); }
    /** Unsafe version of {@link #layers}. */
    public static int nlayers(long struct) { return memGetInt(struct + VkFramebufferCreateInfo.LAYERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkFramebufferCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFramebufferCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkFramebufferCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #renderPass(long) renderPass}. */
    public static void nrenderPass(long struct, long value) { memPutLong(struct + VkFramebufferCreateInfo.RENDERPASS, value); }
    /** Sets the specified value to the {@code attachmentCount} field of the specified {@code struct}. */
    public static void nattachmentCount(long struct, int value) { memPutInt(struct + VkFramebufferCreateInfo.ATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pAttachments(LongBuffer) pAttachments}. */
    public static void npAttachments(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkFramebufferCreateInfo.PATTACHMENTS, memAddressSafe(value)); if (value != null) { nattachmentCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + VkFramebufferCreateInfo.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + VkFramebufferCreateInfo.HEIGHT, value); }
    /** Unsafe version of {@link #layers(int) layers}. */
    public static void nlayers(long struct, int value) { memPutInt(struct + VkFramebufferCreateInfo.LAYERS, value); }

    // -----------------------------------

    /** An array of {@link VkFramebufferCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkFramebufferCreateInfo, Buffer> implements NativeResource {

        private static final VkFramebufferCreateInfo ELEMENT_FACTORY = VkFramebufferCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkFramebufferCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFramebufferCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkFramebufferCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFramebufferCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkFramebufferCreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkFramebufferCreateFlags")
        public int flags() { return VkFramebufferCreateInfo.nflags(address()); }
        /** @return the value of the {@code renderPass} field. */
        @NativeType("VkRenderPass")
        public long renderPass() { return VkFramebufferCreateInfo.nrenderPass(address()); }
        /** @return the value of the {@code attachmentCount} field. */
        @NativeType("uint32_t")
        public int attachmentCount() { return VkFramebufferCreateInfo.nattachmentCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pAttachments} field. */
        @NativeType("VkImageView const *")
        public @Nullable LongBuffer pAttachments() { return VkFramebufferCreateInfo.npAttachments(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("uint32_t")
        public int width() { return VkFramebufferCreateInfo.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("uint32_t")
        public int height() { return VkFramebufferCreateInfo.nheight(address()); }
        /** @return the value of the {@code layers} field. */
        @NativeType("uint32_t")
        public int layers() { return VkFramebufferCreateInfo.nlayers(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkFramebufferCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkFramebufferCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO} value to the {@code sType} field. */
        public VkFramebufferCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkFramebufferCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkFramebufferCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkFramebufferAttachmentsCreateInfo} value to the {@code pNext} chain. */
        public VkFramebufferCreateInfo.Buffer pNext(VkFramebufferAttachmentsCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkFramebufferAttachmentsCreateInfoKHR} value to the {@code pNext} chain. */
        public VkFramebufferCreateInfo.Buffer pNext(VkFramebufferAttachmentsCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkFramebufferCreateInfo.Buffer flags(@NativeType("VkFramebufferCreateFlags") int value) { VkFramebufferCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code renderPass} field. */
        public VkFramebufferCreateInfo.Buffer renderPass(@NativeType("VkRenderPass") long value) { VkFramebufferCreateInfo.nrenderPass(address(), value); return this; }
        /** Sets the specified value to the {@code attachmentCount} field. */
        public VkFramebufferCreateInfo.Buffer attachmentCount(@NativeType("uint32_t") int value) { VkFramebufferCreateInfo.nattachmentCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pAttachments} field. */
        public VkFramebufferCreateInfo.Buffer pAttachments(@Nullable @NativeType("VkImageView const *") LongBuffer value) { VkFramebufferCreateInfo.npAttachments(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public VkFramebufferCreateInfo.Buffer width(@NativeType("uint32_t") int value) { VkFramebufferCreateInfo.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public VkFramebufferCreateInfo.Buffer height(@NativeType("uint32_t") int value) { VkFramebufferCreateInfo.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code layers} field. */
        public VkFramebufferCreateInfo.Buffer layers(@NativeType("uint32_t") int value) { VkFramebufferCreateInfo.nlayers(address(), value); return this; }

    }

}