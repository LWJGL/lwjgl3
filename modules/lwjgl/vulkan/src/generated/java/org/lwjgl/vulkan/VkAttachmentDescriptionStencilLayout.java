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
 * <li>{@code stencilInitialLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}, or {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}</li>
 * <li>{@code stencilFinalLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}, or {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}</li>
 * <li>{@code stencilFinalLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} or {@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT}</li>
 * <li>{@code stencilInitialLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code stencilFinalLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAttachmentDescriptionStencilLayout {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkImageLayout {@link #stencilInitialLayout};
 *     VkImageLayout {@link #stencilFinalLayout};
 * }</code></pre>
 */
public class VkAttachmentDescriptionStencilLayout extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STENCILINITIALLAYOUT,
        STENCILFINALLAYOUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STENCILINITIALLAYOUT = layout.offsetof(2);
        STENCILFINALLAYOUT = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkAttachmentDescriptionStencilLayout} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAttachmentDescriptionStencilLayout(ByteBuffer container) {
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
    /** the layout the stencil aspect of the attachment image subresource will be in when a render pass instance begins. */
    @NativeType("VkImageLayout")
    public int stencilInitialLayout() { return nstencilInitialLayout(address()); }
    /** the layout the stencil aspect of the attachment image subresource will be transitioned to when a render pass instance ends. */
    @NativeType("VkImageLayout")
    public int stencilFinalLayout() { return nstencilFinalLayout(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAttachmentDescriptionStencilLayout sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT} value to the {@link #sType} field. */
    public VkAttachmentDescriptionStencilLayout sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAttachmentDescriptionStencilLayout pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #stencilInitialLayout} field. */
    public VkAttachmentDescriptionStencilLayout stencilInitialLayout(@NativeType("VkImageLayout") int value) { nstencilInitialLayout(address(), value); return this; }
    /** Sets the specified value to the {@link #stencilFinalLayout} field. */
    public VkAttachmentDescriptionStencilLayout stencilFinalLayout(@NativeType("VkImageLayout") int value) { nstencilFinalLayout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAttachmentDescriptionStencilLayout set(
        int sType,
        long pNext,
        int stencilInitialLayout,
        int stencilFinalLayout
    ) {
        sType(sType);
        pNext(pNext);
        stencilInitialLayout(stencilInitialLayout);
        stencilFinalLayout(stencilFinalLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAttachmentDescriptionStencilLayout set(VkAttachmentDescriptionStencilLayout src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAttachmentDescriptionStencilLayout} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAttachmentDescriptionStencilLayout malloc() {
        return wrap(VkAttachmentDescriptionStencilLayout.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAttachmentDescriptionStencilLayout} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAttachmentDescriptionStencilLayout calloc() {
        return wrap(VkAttachmentDescriptionStencilLayout.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAttachmentDescriptionStencilLayout} instance allocated with {@link BufferUtils}. */
    public static VkAttachmentDescriptionStencilLayout create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAttachmentDescriptionStencilLayout.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAttachmentDescriptionStencilLayout} instance for the specified memory address. */
    public static VkAttachmentDescriptionStencilLayout create(long address) {
        return wrap(VkAttachmentDescriptionStencilLayout.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentDescriptionStencilLayout createSafe(long address) {
        return address == NULL ? null : wrap(VkAttachmentDescriptionStencilLayout.class, address);
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayout.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayout.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayout.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayout.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayout.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayout.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAttachmentDescriptionStencilLayout.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayout.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentDescriptionStencilLayout.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkAttachmentDescriptionStencilLayout} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentDescriptionStencilLayout malloc(MemoryStack stack) {
        return wrap(VkAttachmentDescriptionStencilLayout.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAttachmentDescriptionStencilLayout} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentDescriptionStencilLayout calloc(MemoryStack stack) {
        return wrap(VkAttachmentDescriptionStencilLayout.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayout.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayout.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayout.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayout.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentDescriptionStencilLayout.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAttachmentDescriptionStencilLayout.PNEXT); }
    /** Unsafe version of {@link #stencilInitialLayout}. */
    public static int nstencilInitialLayout(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentDescriptionStencilLayout.STENCILINITIALLAYOUT); }
    /** Unsafe version of {@link #stencilFinalLayout}. */
    public static int nstencilFinalLayout(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentDescriptionStencilLayout.STENCILFINALLAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentDescriptionStencilLayout.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAttachmentDescriptionStencilLayout.PNEXT, value); }
    /** Unsafe version of {@link #stencilInitialLayout(int) stencilInitialLayout}. */
    public static void nstencilInitialLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentDescriptionStencilLayout.STENCILINITIALLAYOUT, value); }
    /** Unsafe version of {@link #stencilFinalLayout(int) stencilFinalLayout}. */
    public static void nstencilFinalLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentDescriptionStencilLayout.STENCILFINALLAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkAttachmentDescriptionStencilLayout} structs. */
    public static class Buffer extends StructBuffer<VkAttachmentDescriptionStencilLayout, Buffer> implements NativeResource {

        private static final VkAttachmentDescriptionStencilLayout ELEMENT_FACTORY = VkAttachmentDescriptionStencilLayout.create(-1L);

        /**
         * Creates a new {@code VkAttachmentDescriptionStencilLayout.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAttachmentDescriptionStencilLayout#SIZEOF}, and its mark will be undefined.
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
        protected VkAttachmentDescriptionStencilLayout getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAttachmentDescriptionStencilLayout#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAttachmentDescriptionStencilLayout.nsType(address()); }
        /** @return the value of the {@link VkAttachmentDescriptionStencilLayout#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkAttachmentDescriptionStencilLayout.npNext(address()); }
        /** @return the value of the {@link VkAttachmentDescriptionStencilLayout#stencilInitialLayout} field. */
        @NativeType("VkImageLayout")
        public int stencilInitialLayout() { return VkAttachmentDescriptionStencilLayout.nstencilInitialLayout(address()); }
        /** @return the value of the {@link VkAttachmentDescriptionStencilLayout#stencilFinalLayout} field. */
        @NativeType("VkImageLayout")
        public int stencilFinalLayout() { return VkAttachmentDescriptionStencilLayout.nstencilFinalLayout(address()); }

        /** Sets the specified value to the {@link VkAttachmentDescriptionStencilLayout#sType} field. */
        public VkAttachmentDescriptionStencilLayout.Buffer sType(@NativeType("VkStructureType") int value) { VkAttachmentDescriptionStencilLayout.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT} value to the {@link VkAttachmentDescriptionStencilLayout#sType} field. */
        public VkAttachmentDescriptionStencilLayout.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT); }
        /** Sets the specified value to the {@link VkAttachmentDescriptionStencilLayout#pNext} field. */
        public VkAttachmentDescriptionStencilLayout.Buffer pNext(@NativeType("void *") long value) { VkAttachmentDescriptionStencilLayout.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkAttachmentDescriptionStencilLayout#stencilInitialLayout} field. */
        public VkAttachmentDescriptionStencilLayout.Buffer stencilInitialLayout(@NativeType("VkImageLayout") int value) { VkAttachmentDescriptionStencilLayout.nstencilInitialLayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkAttachmentDescriptionStencilLayout#stencilFinalLayout} field. */
        public VkAttachmentDescriptionStencilLayout.Buffer stencilFinalLayout(@NativeType("VkImageLayout") int value) { VkAttachmentDescriptionStencilLayout.nstencilFinalLayout(address(), value); return this; }

    }

}