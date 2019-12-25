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
 * <li>{@code stencilInitialLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}, {@link KHRSeparateDepthStencilLayouts#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL_KHR IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL_KHR}, {@link KHRSeparateDepthStencilLayouts#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL_KHR IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL_KHR}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}, or {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}</li>
 * <li>{@code stencilFinalLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}, {@link KHRSeparateDepthStencilLayouts#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL_KHR IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL_KHR}, {@link KHRSeparateDepthStencilLayouts#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL_KHR IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL_KHR}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}, or {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}</li>
 * <li>{@code stencilFinalLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} or {@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSeparateDepthStencilLayouts#VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT_KHR STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT_KHR}</li>
 * <li>{@code stencilInitialLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code stencilFinalLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code stencilInitialLayout} &ndash; the layout the stencil aspect of the attachment image subresource will be in when a render pass instance begins.</li>
 * <li>{@code stencilFinalLayout} &ndash; the layout the stencil aspect of the attachment image subresource will be transitioned to when a render pass instance ends.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAttachmentDescriptionStencilLayoutKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkImageLayout stencilInitialLayout;
 *     VkImageLayout stencilFinalLayout;
 * }</code></pre>
 */
public class VkAttachmentDescriptionStencilLayoutKHR extends Struct implements NativeResource {

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
     * Creates a {@code VkAttachmentDescriptionStencilLayoutKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAttachmentDescriptionStencilLayoutKHR(ByteBuffer container) {
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
    /** Returns the value of the {@code stencilInitialLayout} field. */
    @NativeType("VkImageLayout")
    public int stencilInitialLayout() { return nstencilInitialLayout(address()); }
    /** Returns the value of the {@code stencilFinalLayout} field. */
    @NativeType("VkImageLayout")
    public int stencilFinalLayout() { return nstencilFinalLayout(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAttachmentDescriptionStencilLayoutKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAttachmentDescriptionStencilLayoutKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code stencilInitialLayout} field. */
    public VkAttachmentDescriptionStencilLayoutKHR stencilInitialLayout(@NativeType("VkImageLayout") int value) { nstencilInitialLayout(address(), value); return this; }
    /** Sets the specified value to the {@code stencilFinalLayout} field. */
    public VkAttachmentDescriptionStencilLayoutKHR stencilFinalLayout(@NativeType("VkImageLayout") int value) { nstencilFinalLayout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAttachmentDescriptionStencilLayoutKHR set(
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
    public VkAttachmentDescriptionStencilLayoutKHR set(VkAttachmentDescriptionStencilLayoutKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAttachmentDescriptionStencilLayoutKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAttachmentDescriptionStencilLayoutKHR malloc() {
        return wrap(VkAttachmentDescriptionStencilLayoutKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAttachmentDescriptionStencilLayoutKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAttachmentDescriptionStencilLayoutKHR calloc() {
        return wrap(VkAttachmentDescriptionStencilLayoutKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAttachmentDescriptionStencilLayoutKHR} instance allocated with {@link BufferUtils}. */
    public static VkAttachmentDescriptionStencilLayoutKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAttachmentDescriptionStencilLayoutKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAttachmentDescriptionStencilLayoutKHR} instance for the specified memory address. */
    public static VkAttachmentDescriptionStencilLayoutKHR create(long address) {
        return wrap(VkAttachmentDescriptionStencilLayoutKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentDescriptionStencilLayoutKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkAttachmentDescriptionStencilLayoutKHR.class, address);
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayoutKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayoutKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayoutKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayoutKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayoutKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayoutKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAttachmentDescriptionStencilLayoutKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayoutKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentDescriptionStencilLayoutKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkAttachmentDescriptionStencilLayoutKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkAttachmentDescriptionStencilLayoutKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkAttachmentDescriptionStencilLayoutKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkAttachmentDescriptionStencilLayoutKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkAttachmentDescriptionStencilLayoutKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentDescriptionStencilLayoutKHR mallocStack(MemoryStack stack) {
        return wrap(VkAttachmentDescriptionStencilLayoutKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAttachmentDescriptionStencilLayoutKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentDescriptionStencilLayoutKHR callocStack(MemoryStack stack) {
        return wrap(VkAttachmentDescriptionStencilLayoutKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayoutKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayoutKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayoutKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayoutKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayoutKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayoutKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayoutKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayoutKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentDescriptionStencilLayoutKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAttachmentDescriptionStencilLayoutKHR.PNEXT); }
    /** Unsafe version of {@link #stencilInitialLayout}. */
    public static int nstencilInitialLayout(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentDescriptionStencilLayoutKHR.STENCILINITIALLAYOUT); }
    /** Unsafe version of {@link #stencilFinalLayout}. */
    public static int nstencilFinalLayout(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentDescriptionStencilLayoutKHR.STENCILFINALLAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentDescriptionStencilLayoutKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAttachmentDescriptionStencilLayoutKHR.PNEXT, value); }
    /** Unsafe version of {@link #stencilInitialLayout(int) stencilInitialLayout}. */
    public static void nstencilInitialLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentDescriptionStencilLayoutKHR.STENCILINITIALLAYOUT, value); }
    /** Unsafe version of {@link #stencilFinalLayout(int) stencilFinalLayout}. */
    public static void nstencilFinalLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentDescriptionStencilLayoutKHR.STENCILFINALLAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkAttachmentDescriptionStencilLayoutKHR} structs. */
    public static class Buffer extends StructBuffer<VkAttachmentDescriptionStencilLayoutKHR, Buffer> implements NativeResource {

        private static final VkAttachmentDescriptionStencilLayoutKHR ELEMENT_FACTORY = VkAttachmentDescriptionStencilLayoutKHR.create(-1L);

        /**
         * Creates a new {@code VkAttachmentDescriptionStencilLayoutKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAttachmentDescriptionStencilLayoutKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkAttachmentDescriptionStencilLayoutKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAttachmentDescriptionStencilLayoutKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkAttachmentDescriptionStencilLayoutKHR.npNext(address()); }
        /** Returns the value of the {@code stencilInitialLayout} field. */
        @NativeType("VkImageLayout")
        public int stencilInitialLayout() { return VkAttachmentDescriptionStencilLayoutKHR.nstencilInitialLayout(address()); }
        /** Returns the value of the {@code stencilFinalLayout} field. */
        @NativeType("VkImageLayout")
        public int stencilFinalLayout() { return VkAttachmentDescriptionStencilLayoutKHR.nstencilFinalLayout(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAttachmentDescriptionStencilLayoutKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAttachmentDescriptionStencilLayoutKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAttachmentDescriptionStencilLayoutKHR.Buffer pNext(@NativeType("void *") long value) { VkAttachmentDescriptionStencilLayoutKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code stencilInitialLayout} field. */
        public VkAttachmentDescriptionStencilLayoutKHR.Buffer stencilInitialLayout(@NativeType("VkImageLayout") int value) { VkAttachmentDescriptionStencilLayoutKHR.nstencilInitialLayout(address(), value); return this; }
        /** Sets the specified value to the {@code stencilFinalLayout} field. */
        public VkAttachmentDescriptionStencilLayoutKHR.Buffer stencilFinalLayout(@NativeType("VkImageLayout") int value) { VkAttachmentDescriptionStencilLayoutKHR.nstencilFinalLayout(address(), value); return this; }

    }

}