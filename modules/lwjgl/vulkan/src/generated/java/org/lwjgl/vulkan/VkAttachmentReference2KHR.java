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
 * <h5>Description</h5>
 * 
 * <p>Parameters defined by this structure with the same name as those in {@link VkAttachmentReference} have the identical effect to those parameters.</p>
 * 
 * <p>{@code aspectMask} has the same effect for the described attachment as {@link VkInputAttachmentAspectReference}{@code ::aspectMask} has on each corresponding attachment. It is ignored when this structure is used to describe anything other than an input attachment reference.</p>
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
 * <li>{@code sType} <b>must</b> be {@link KHRCreateRenderpass2#VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2_KHR STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2_KHR}</li>
 * <li>{@code layout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSubpassDescription2KHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code attachment} &ndash; either an integer value identifying an attachment at the corresponding index in {@link VkRenderPassCreateInfo}{@code ::pAttachments}, or {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} to signify that this attachment is not used.</li>
 * <li>{@code layout} &ndash; a {@code VkImageLayout} value specifying the layout the attachment uses during the subpass.</li>
 * <li>{@code aspectMask} &ndash; a mask of which aspect(s) <b>can</b> be accessed within the specified subpass as an input attachment.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAttachmentReference2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t attachment;
 *     VkImageLayout layout;
 *     VkImageAspectFlags aspectMask;
 * }</code></pre>
 */
public class VkAttachmentReference2KHR extends Struct implements NativeResource {

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

    /**
     * Creates a {@link VkAttachmentReference2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAttachmentReference2KHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code attachment} field. */
    @NativeType("uint32_t")
    public int attachment() { return nattachment(address()); }
    /** Returns the value of the {@code layout} field. */
    @NativeType("VkImageLayout")
    public int layout() { return nlayout(address()); }
    /** Returns the value of the {@code aspectMask} field. */
    @NativeType("VkImageAspectFlags")
    public int aspectMask() { return naspectMask(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAttachmentReference2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAttachmentReference2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code attachment} field. */
    public VkAttachmentReference2KHR attachment(@NativeType("uint32_t") int value) { nattachment(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    public VkAttachmentReference2KHR layout(@NativeType("VkImageLayout") int value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code aspectMask} field. */
    public VkAttachmentReference2KHR aspectMask(@NativeType("VkImageAspectFlags") int value) { naspectMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAttachmentReference2KHR set(
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
    public VkAttachmentReference2KHR set(VkAttachmentReference2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkAttachmentReference2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAttachmentReference2KHR malloc() {
        return wrap(VkAttachmentReference2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkAttachmentReference2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAttachmentReference2KHR calloc() {
        return wrap(VkAttachmentReference2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkAttachmentReference2KHR} instance allocated with {@link BufferUtils}. */
    public static VkAttachmentReference2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAttachmentReference2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@link VkAttachmentReference2KHR} instance for the specified memory address. */
    public static VkAttachmentReference2KHR create(long address) {
        return wrap(VkAttachmentReference2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentReference2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkAttachmentReference2KHR.class, address);
    }

    /**
     * Returns a new {@link VkAttachmentReference2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReference2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReference2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAttachmentReference2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentReference2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkAttachmentReference2KHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkAttachmentReference2KHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkAttachmentReference2KHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkAttachmentReference2KHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkAttachmentReference2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentReference2KHR mallocStack(MemoryStack stack) {
        return wrap(VkAttachmentReference2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkAttachmentReference2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentReference2KHR callocStack(MemoryStack stack) {
        return wrap(VkAttachmentReference2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAttachmentReference2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference2KHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAttachmentReference2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference2KHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAttachmentReference2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference2KHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReference2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference2KHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentReference2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAttachmentReference2KHR.PNEXT); }
    /** Unsafe version of {@link #attachment}. */
    public static int nattachment(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentReference2KHR.ATTACHMENT); }
    /** Unsafe version of {@link #layout}. */
    public static int nlayout(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentReference2KHR.LAYOUT); }
    /** Unsafe version of {@link #aspectMask}. */
    public static int naspectMask(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentReference2KHR.ASPECTMASK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentReference2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAttachmentReference2KHR.PNEXT, value); }
    /** Unsafe version of {@link #attachment(int) attachment}. */
    public static void nattachment(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentReference2KHR.ATTACHMENT, value); }
    /** Unsafe version of {@link #layout(int) layout}. */
    public static void nlayout(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentReference2KHR.LAYOUT, value); }
    /** Unsafe version of {@link #aspectMask(int) aspectMask}. */
    public static void naspectMask(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentReference2KHR.ASPECTMASK, value); }

    // -----------------------------------

    /** An array of {@link VkAttachmentReference2KHR} structs. */
    public static class Buffer extends StructBuffer<VkAttachmentReference2KHR, Buffer> implements NativeResource {

        private static final VkAttachmentReference2KHR ELEMENT_FACTORY = VkAttachmentReference2KHR.create(-1L);

        /**
         * Creates a new {@link VkAttachmentReference2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAttachmentReference2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkAttachmentReference2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAttachmentReference2KHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAttachmentReference2KHR.npNext(address()); }
        /** Returns the value of the {@code attachment} field. */
        @NativeType("uint32_t")
        public int attachment() { return VkAttachmentReference2KHR.nattachment(address()); }
        /** Returns the value of the {@code layout} field. */
        @NativeType("VkImageLayout")
        public int layout() { return VkAttachmentReference2KHR.nlayout(address()); }
        /** Returns the value of the {@code aspectMask} field. */
        @NativeType("VkImageAspectFlags")
        public int aspectMask() { return VkAttachmentReference2KHR.naspectMask(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAttachmentReference2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAttachmentReference2KHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAttachmentReference2KHR.Buffer pNext(@NativeType("void const *") long value) { VkAttachmentReference2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code attachment} field. */
        public VkAttachmentReference2KHR.Buffer attachment(@NativeType("uint32_t") int value) { VkAttachmentReference2KHR.nattachment(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        public VkAttachmentReference2KHR.Buffer layout(@NativeType("VkImageLayout") int value) { VkAttachmentReference2KHR.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code aspectMask} field. */
        public VkAttachmentReference2KHR.Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) { VkAttachmentReference2KHR.naspectMask(address(), value); return this; }

    }

}