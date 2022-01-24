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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying an attachment description.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code stencilLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}, {@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}, {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}, {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}, or {@link KHRSwapchain#VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT}</li>
 * <li>{@code stencilLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAttachmentReferenceStencilLayout {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkImageLayout {@link #stencilLayout};
 * }</code></pre>
 */
public class VkAttachmentReferenceStencilLayout extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STENCILLAYOUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STENCILLAYOUT = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkAttachmentReferenceStencilLayout} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAttachmentReferenceStencilLayout(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkImageLayout} value specifying the layout the stencil aspect of the attachment uses during the subpass. */
    @NativeType("VkImageLayout")
    public int stencilLayout() { return nstencilLayout(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAttachmentReferenceStencilLayout sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT} value to the {@link #sType} field. */
    public VkAttachmentReferenceStencilLayout sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAttachmentReferenceStencilLayout pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #stencilLayout} field. */
    public VkAttachmentReferenceStencilLayout stencilLayout(@NativeType("VkImageLayout") int value) { nstencilLayout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAttachmentReferenceStencilLayout set(
        int sType,
        long pNext,
        int stencilLayout
    ) {
        sType(sType);
        pNext(pNext);
        stencilLayout(stencilLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAttachmentReferenceStencilLayout set(VkAttachmentReferenceStencilLayout src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAttachmentReferenceStencilLayout} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAttachmentReferenceStencilLayout malloc() {
        return wrap(VkAttachmentReferenceStencilLayout.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAttachmentReferenceStencilLayout} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAttachmentReferenceStencilLayout calloc() {
        return wrap(VkAttachmentReferenceStencilLayout.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAttachmentReferenceStencilLayout} instance allocated with {@link BufferUtils}. */
    public static VkAttachmentReferenceStencilLayout create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAttachmentReferenceStencilLayout.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAttachmentReferenceStencilLayout} instance for the specified memory address. */
    public static VkAttachmentReferenceStencilLayout create(long address) {
        return wrap(VkAttachmentReferenceStencilLayout.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentReferenceStencilLayout createSafe(long address) {
        return address == NULL ? null : wrap(VkAttachmentReferenceStencilLayout.class, address);
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayout.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayout.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayout.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayout.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayout.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayout.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAttachmentReferenceStencilLayout.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayout.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentReferenceStencilLayout.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkAttachmentReferenceStencilLayout} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentReferenceStencilLayout malloc(MemoryStack stack) {
        return wrap(VkAttachmentReferenceStencilLayout.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAttachmentReferenceStencilLayout} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentReferenceStencilLayout calloc(MemoryStack stack) {
        return wrap(VkAttachmentReferenceStencilLayout.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayout.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayout.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayout.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayout.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentReferenceStencilLayout.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAttachmentReferenceStencilLayout.PNEXT); }
    /** Unsafe version of {@link #stencilLayout}. */
    public static int nstencilLayout(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentReferenceStencilLayout.STENCILLAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentReferenceStencilLayout.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAttachmentReferenceStencilLayout.PNEXT, value); }
    /** Unsafe version of {@link #stencilLayout(int) stencilLayout}. */
    public static void nstencilLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentReferenceStencilLayout.STENCILLAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkAttachmentReferenceStencilLayout} structs. */
    public static class Buffer extends StructBuffer<VkAttachmentReferenceStencilLayout, Buffer> implements NativeResource {

        private static final VkAttachmentReferenceStencilLayout ELEMENT_FACTORY = VkAttachmentReferenceStencilLayout.create(-1L);

        /**
         * Creates a new {@code VkAttachmentReferenceStencilLayout.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAttachmentReferenceStencilLayout#SIZEOF}, and its mark will be undefined.
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
        protected VkAttachmentReferenceStencilLayout getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAttachmentReferenceStencilLayout#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAttachmentReferenceStencilLayout.nsType(address()); }
        /** @return the value of the {@link VkAttachmentReferenceStencilLayout#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkAttachmentReferenceStencilLayout.npNext(address()); }
        /** @return the value of the {@link VkAttachmentReferenceStencilLayout#stencilLayout} field. */
        @NativeType("VkImageLayout")
        public int stencilLayout() { return VkAttachmentReferenceStencilLayout.nstencilLayout(address()); }

        /** Sets the specified value to the {@link VkAttachmentReferenceStencilLayout#sType} field. */
        public VkAttachmentReferenceStencilLayout.Buffer sType(@NativeType("VkStructureType") int value) { VkAttachmentReferenceStencilLayout.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT} value to the {@link VkAttachmentReferenceStencilLayout#sType} field. */
        public VkAttachmentReferenceStencilLayout.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT); }
        /** Sets the specified value to the {@link VkAttachmentReferenceStencilLayout#pNext} field. */
        public VkAttachmentReferenceStencilLayout.Buffer pNext(@NativeType("void *") long value) { VkAttachmentReferenceStencilLayout.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkAttachmentReferenceStencilLayout#stencilLayout} field. */
        public VkAttachmentReferenceStencilLayout.Buffer stencilLayout(@NativeType("VkImageLayout") int value) { VkAttachmentReferenceStencilLayout.nstencilLayout(address(), value); return this; }

    }

}