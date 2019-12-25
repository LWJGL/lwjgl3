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
 * <li>{@code stencilLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}, {@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}, {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}, {@link KHRSeparateDepthStencilLayouts#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL_KHR IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL_KHR}, {@link KHRSeparateDepthStencilLayouts#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL_KHR IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL_KHR}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}, {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}, or {@link KHRSwapchain#VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSeparateDepthStencilLayouts#VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT_KHR STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT_KHR}</li>
 * <li>{@code stencilLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code stencilLayout} &ndash; a {@code VkImageLayout} value specifying the layout the stencil aspect of the attachment uses during the subpass.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAttachmentReferenceStencilLayoutKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkImageLayout stencilLayout;
 * }</code></pre>
 */
public class VkAttachmentReferenceStencilLayoutKHR extends Struct implements NativeResource {

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
     * Creates a {@code VkAttachmentReferenceStencilLayoutKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAttachmentReferenceStencilLayoutKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code stencilLayout} field. */
    @NativeType("VkImageLayout")
    public int stencilLayout() { return nstencilLayout(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAttachmentReferenceStencilLayoutKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAttachmentReferenceStencilLayoutKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code stencilLayout} field. */
    public VkAttachmentReferenceStencilLayoutKHR stencilLayout(@NativeType("VkImageLayout") int value) { nstencilLayout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAttachmentReferenceStencilLayoutKHR set(
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
    public VkAttachmentReferenceStencilLayoutKHR set(VkAttachmentReferenceStencilLayoutKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAttachmentReferenceStencilLayoutKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAttachmentReferenceStencilLayoutKHR malloc() {
        return wrap(VkAttachmentReferenceStencilLayoutKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAttachmentReferenceStencilLayoutKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAttachmentReferenceStencilLayoutKHR calloc() {
        return wrap(VkAttachmentReferenceStencilLayoutKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAttachmentReferenceStencilLayoutKHR} instance allocated with {@link BufferUtils}. */
    public static VkAttachmentReferenceStencilLayoutKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAttachmentReferenceStencilLayoutKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAttachmentReferenceStencilLayoutKHR} instance for the specified memory address. */
    public static VkAttachmentReferenceStencilLayoutKHR create(long address) {
        return wrap(VkAttachmentReferenceStencilLayoutKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentReferenceStencilLayoutKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkAttachmentReferenceStencilLayoutKHR.class, address);
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayoutKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayoutKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayoutKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAttachmentReferenceStencilLayoutKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkAttachmentReferenceStencilLayoutKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkAttachmentReferenceStencilLayoutKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkAttachmentReferenceStencilLayoutKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkAttachmentReferenceStencilLayoutKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkAttachmentReferenceStencilLayoutKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentReferenceStencilLayoutKHR mallocStack(MemoryStack stack) {
        return wrap(VkAttachmentReferenceStencilLayoutKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAttachmentReferenceStencilLayoutKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentReferenceStencilLayoutKHR callocStack(MemoryStack stack) {
        return wrap(VkAttachmentReferenceStencilLayoutKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayoutKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayoutKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayoutKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayoutKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentReferenceStencilLayoutKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAttachmentReferenceStencilLayoutKHR.PNEXT); }
    /** Unsafe version of {@link #stencilLayout}. */
    public static int nstencilLayout(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentReferenceStencilLayoutKHR.STENCILLAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentReferenceStencilLayoutKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAttachmentReferenceStencilLayoutKHR.PNEXT, value); }
    /** Unsafe version of {@link #stencilLayout(int) stencilLayout}. */
    public static void nstencilLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentReferenceStencilLayoutKHR.STENCILLAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkAttachmentReferenceStencilLayoutKHR} structs. */
    public static class Buffer extends StructBuffer<VkAttachmentReferenceStencilLayoutKHR, Buffer> implements NativeResource {

        private static final VkAttachmentReferenceStencilLayoutKHR ELEMENT_FACTORY = VkAttachmentReferenceStencilLayoutKHR.create(-1L);

        /**
         * Creates a new {@code VkAttachmentReferenceStencilLayoutKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAttachmentReferenceStencilLayoutKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkAttachmentReferenceStencilLayoutKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAttachmentReferenceStencilLayoutKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkAttachmentReferenceStencilLayoutKHR.npNext(address()); }
        /** Returns the value of the {@code stencilLayout} field. */
        @NativeType("VkImageLayout")
        public int stencilLayout() { return VkAttachmentReferenceStencilLayoutKHR.nstencilLayout(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAttachmentReferenceStencilLayoutKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAttachmentReferenceStencilLayoutKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAttachmentReferenceStencilLayoutKHR.Buffer pNext(@NativeType("void *") long value) { VkAttachmentReferenceStencilLayoutKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code stencilLayout} field. */
        public VkAttachmentReferenceStencilLayoutKHR.Buffer stencilLayout(@NativeType("VkImageLayout") int value) { VkAttachmentReferenceStencilLayoutKHR.nstencilLayout(address(), value); return this; }

    }

}