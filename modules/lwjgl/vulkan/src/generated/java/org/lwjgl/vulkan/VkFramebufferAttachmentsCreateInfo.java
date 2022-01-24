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
 * Structure specifying parameters of images that will be used with a framebuffer.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO}</li>
 * <li>If {@code attachmentImageInfoCount} is not 0, {@code pAttachmentImageInfos} <b>must</b> be a valid pointer to an array of {@code attachmentImageInfoCount} valid {@link VkFramebufferAttachmentImageInfo} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkFramebufferAttachmentImageInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkFramebufferAttachmentsCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #attachmentImageInfoCount};
 *     {@link VkFramebufferAttachmentImageInfo VkFramebufferAttachmentImageInfo} const * {@link #pAttachmentImageInfos};
 * }</code></pre>
 */
public class VkFramebufferAttachmentsCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ATTACHMENTIMAGEINFOCOUNT,
        PATTACHMENTIMAGEINFOS;

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
        ATTACHMENTIMAGEINFOCOUNT = layout.offsetof(2);
        PATTACHMENTIMAGEINFOS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkFramebufferAttachmentsCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFramebufferAttachmentsCreateInfo(ByteBuffer container) {
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
    /** the number of attachments being described. */
    @NativeType("uint32_t")
    public int attachmentImageInfoCount() { return nattachmentImageInfoCount(address()); }
    /** a pointer to an array of {@link VkFramebufferAttachmentImageInfo} structures, each structure describing a number of parameters of the corresponding attachment in a render pass instance. */
    @Nullable
    @NativeType("VkFramebufferAttachmentImageInfo const *")
    public VkFramebufferAttachmentImageInfo.Buffer pAttachmentImageInfos() { return npAttachmentImageInfos(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkFramebufferAttachmentsCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO} value to the {@link #sType} field. */
    public VkFramebufferAttachmentsCreateInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkFramebufferAttachmentsCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkFramebufferAttachmentImageInfo.Buffer} to the {@link #pAttachmentImageInfos} field. */
    public VkFramebufferAttachmentsCreateInfo pAttachmentImageInfos(@Nullable @NativeType("VkFramebufferAttachmentImageInfo const *") VkFramebufferAttachmentImageInfo.Buffer value) { npAttachmentImageInfos(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkFramebufferAttachmentsCreateInfo set(
        int sType,
        long pNext,
        @Nullable VkFramebufferAttachmentImageInfo.Buffer pAttachmentImageInfos
    ) {
        sType(sType);
        pNext(pNext);
        pAttachmentImageInfos(pAttachmentImageInfos);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkFramebufferAttachmentsCreateInfo set(VkFramebufferAttachmentsCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFramebufferAttachmentsCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFramebufferAttachmentsCreateInfo malloc() {
        return wrap(VkFramebufferAttachmentsCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkFramebufferAttachmentsCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFramebufferAttachmentsCreateInfo calloc() {
        return wrap(VkFramebufferAttachmentsCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkFramebufferAttachmentsCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkFramebufferAttachmentsCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkFramebufferAttachmentsCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkFramebufferAttachmentsCreateInfo} instance for the specified memory address. */
    public static VkFramebufferAttachmentsCreateInfo create(long address) {
        return wrap(VkFramebufferAttachmentsCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFramebufferAttachmentsCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkFramebufferAttachmentsCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentsCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentsCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentsCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentsCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentsCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentsCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkFramebufferAttachmentsCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentsCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFramebufferAttachmentsCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkFramebufferAttachmentsCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferAttachmentsCreateInfo malloc(MemoryStack stack) {
        return wrap(VkFramebufferAttachmentsCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkFramebufferAttachmentsCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferAttachmentsCreateInfo calloc(MemoryStack stack) {
        return wrap(VkFramebufferAttachmentsCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentsCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentsCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentsCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentsCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferAttachmentsCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFramebufferAttachmentsCreateInfo.PNEXT); }
    /** Unsafe version of {@link #attachmentImageInfoCount}. */
    public static int nattachmentImageInfoCount(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferAttachmentsCreateInfo.ATTACHMENTIMAGEINFOCOUNT); }
    /** Unsafe version of {@link #pAttachmentImageInfos}. */
    @Nullable public static VkFramebufferAttachmentImageInfo.Buffer npAttachmentImageInfos(long struct) { return VkFramebufferAttachmentImageInfo.createSafe(memGetAddress(struct + VkFramebufferAttachmentsCreateInfo.PATTACHMENTIMAGEINFOS), nattachmentImageInfoCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferAttachmentsCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFramebufferAttachmentsCreateInfo.PNEXT, value); }
    /** Sets the specified value to the {@code attachmentImageInfoCount} field of the specified {@code struct}. */
    public static void nattachmentImageInfoCount(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferAttachmentsCreateInfo.ATTACHMENTIMAGEINFOCOUNT, value); }
    /** Unsafe version of {@link #pAttachmentImageInfos(VkFramebufferAttachmentImageInfo.Buffer) pAttachmentImageInfos}. */
    public static void npAttachmentImageInfos(long struct, @Nullable VkFramebufferAttachmentImageInfo.Buffer value) { memPutAddress(struct + VkFramebufferAttachmentsCreateInfo.PATTACHMENTIMAGEINFOS, memAddressSafe(value)); nattachmentImageInfoCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int attachmentImageInfoCount = nattachmentImageInfoCount(struct);
        if (attachmentImageInfoCount != 0) {
            long pAttachmentImageInfos = memGetAddress(struct + VkFramebufferAttachmentsCreateInfo.PATTACHMENTIMAGEINFOS);
            check(pAttachmentImageInfos);
            validate(pAttachmentImageInfos, attachmentImageInfoCount, VkFramebufferAttachmentImageInfo.SIZEOF, VkFramebufferAttachmentImageInfo::validate);
        }
    }

    // -----------------------------------

    /** An array of {@link VkFramebufferAttachmentsCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkFramebufferAttachmentsCreateInfo, Buffer> implements NativeResource {

        private static final VkFramebufferAttachmentsCreateInfo ELEMENT_FACTORY = VkFramebufferAttachmentsCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkFramebufferAttachmentsCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFramebufferAttachmentsCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkFramebufferAttachmentsCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkFramebufferAttachmentsCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFramebufferAttachmentsCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkFramebufferAttachmentsCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkFramebufferAttachmentsCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkFramebufferAttachmentsCreateInfo#attachmentImageInfoCount} field. */
        @NativeType("uint32_t")
        public int attachmentImageInfoCount() { return VkFramebufferAttachmentsCreateInfo.nattachmentImageInfoCount(address()); }
        /** @return a {@link VkFramebufferAttachmentImageInfo.Buffer} view of the struct array pointed to by the {@link VkFramebufferAttachmentsCreateInfo#pAttachmentImageInfos} field. */
        @Nullable
        @NativeType("VkFramebufferAttachmentImageInfo const *")
        public VkFramebufferAttachmentImageInfo.Buffer pAttachmentImageInfos() { return VkFramebufferAttachmentsCreateInfo.npAttachmentImageInfos(address()); }

        /** Sets the specified value to the {@link VkFramebufferAttachmentsCreateInfo#sType} field. */
        public VkFramebufferAttachmentsCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkFramebufferAttachmentsCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO} value to the {@link VkFramebufferAttachmentsCreateInfo#sType} field. */
        public VkFramebufferAttachmentsCreateInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO); }
        /** Sets the specified value to the {@link VkFramebufferAttachmentsCreateInfo#pNext} field. */
        public VkFramebufferAttachmentsCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkFramebufferAttachmentsCreateInfo.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkFramebufferAttachmentImageInfo.Buffer} to the {@link VkFramebufferAttachmentsCreateInfo#pAttachmentImageInfos} field. */
        public VkFramebufferAttachmentsCreateInfo.Buffer pAttachmentImageInfos(@Nullable @NativeType("VkFramebufferAttachmentImageInfo const *") VkFramebufferAttachmentImageInfo.Buffer value) { VkFramebufferAttachmentsCreateInfo.npAttachmentImageInfos(address(), value); return this; }

    }

}