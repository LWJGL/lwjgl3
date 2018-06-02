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
 * Structure specifying an attachment reference.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code layout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} or {@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code layout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSubpassDescription}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code attachment} &ndash; the index of the attachment of the render pass, and corresponds to the index of the corresponding element in the {@code pAttachments} array of the {@link VkRenderPassCreateInfo} structure. If any color or depth/stencil attachments are {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, then no writes occur for those attachments.</li>
 * <li>{@code layout} &ndash; a {@code VkImageLayout} value specifying the layout the attachment uses during the subpass.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAttachmentReference {
 *     uint32_t attachment;
 *     VkImageLayout layout;
 * }</code></pre>
 */
public class VkAttachmentReference extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ATTACHMENT,
        LAYOUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ATTACHMENT = layout.offsetof(0);
        LAYOUT = layout.offsetof(1);
    }

    VkAttachmentReference(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkAttachmentReference} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAttachmentReference(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code attachment} field. */
    @NativeType("uint32_t")
    public int attachment() { return nattachment(address()); }
    /** Returns the value of the {@code layout} field. */
    @NativeType("VkImageLayout")
    public int layout() { return nlayout(address()); }

    /** Sets the specified value to the {@code attachment} field. */
    public VkAttachmentReference attachment(@NativeType("uint32_t") int value) { nattachment(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    public VkAttachmentReference layout(@NativeType("VkImageLayout") int value) { nlayout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAttachmentReference set(
        int attachment,
        int layout
    ) {
        attachment(attachment);
        layout(layout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAttachmentReference set(VkAttachmentReference src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkAttachmentReference} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAttachmentReference malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkAttachmentReference} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAttachmentReference calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkAttachmentReference} instance allocated with {@link BufferUtils}. */
    public static VkAttachmentReference create() {
        return new VkAttachmentReference(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkAttachmentReference} instance for the specified memory address. */
    public static VkAttachmentReference create(long address) {
        return new VkAttachmentReference(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentReference createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkAttachmentReference.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReference.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReference.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkAttachmentReference.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentReference.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkAttachmentReference} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkAttachmentReference mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkAttachmentReference} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkAttachmentReference callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkAttachmentReference} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentReference mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkAttachmentReference} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentReference callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAttachmentReference.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAttachmentReference.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAttachmentReference.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReference.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #attachment}. */
    public static int nattachment(long struct) { return memGetInt(struct + VkAttachmentReference.ATTACHMENT); }
    /** Unsafe version of {@link #layout}. */
    public static int nlayout(long struct) { return memGetInt(struct + VkAttachmentReference.LAYOUT); }

    /** Unsafe version of {@link #attachment(int) attachment}. */
    public static void nattachment(long struct, int value) { memPutInt(struct + VkAttachmentReference.ATTACHMENT, value); }
    /** Unsafe version of {@link #layout(int) layout}. */
    public static void nlayout(long struct, int value) { memPutInt(struct + VkAttachmentReference.LAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkAttachmentReference} structs. */
    public static class Buffer extends StructBuffer<VkAttachmentReference, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkAttachmentReference.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAttachmentReference#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkAttachmentReference newInstance(long address) {
            return new VkAttachmentReference(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code attachment} field. */
        @NativeType("uint32_t")
        public int attachment() { return VkAttachmentReference.nattachment(address()); }
        /** Returns the value of the {@code layout} field. */
        @NativeType("VkImageLayout")
        public int layout() { return VkAttachmentReference.nlayout(address()); }

        /** Sets the specified value to the {@code attachment} field. */
        public VkAttachmentReference.Buffer attachment(@NativeType("uint32_t") int value) { VkAttachmentReference.nattachment(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        public VkAttachmentReference.Buffer layout(@NativeType("VkImageLayout") int value) { VkAttachmentReference.nlayout(address(), value); return this; }

    }

}