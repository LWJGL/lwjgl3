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
 * Structure specifying a subpass/input attachment pair and an aspect mask that <b>can</b> be read.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure specifies an aspect mask for a specific input attachment of a specific subpass in the render pass.</p>
 * 
 * <p>{@code subpass} and {@code inputAttachmentIndex} index into the render pass as:</p>
 * 
 * <pre><code>
 * pCreateInfo-&gt;pSubpasses[subpass].pInputAttachments[inputAttachmentIndex]</code></pre>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code aspectMask} <b>must</b> not include {@link VK10#VK_IMAGE_ASPECT_METADATA_BIT IMAGE_ASPECT_METADATA_BIT}</li>
 * <li>{@code aspectMask} <b>must</b> not include <code>VK_IMAGE_ASPECT_MEMORY_PLANE<em>_i_</em>BIT_EXT</code> for any index <em>i</em></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code aspectMask} <b>must</b> be a valid combination of {@code VkImageAspectFlagBits} values</li>
 * <li>{@code aspectMask} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRenderPassInputAttachmentAspectCreateInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkInputAttachmentAspectReference {
 *     uint32_t {@link #subpass};
 *     uint32_t {@link #inputAttachmentIndex};
 *     VkImageAspectFlags {@link #aspectMask};
 * }</code></pre>
 */
public class VkInputAttachmentAspectReference extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SUBPASS,
        INPUTATTACHMENTINDEX,
        ASPECTMASK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SUBPASS = layout.offsetof(0);
        INPUTATTACHMENTINDEX = layout.offsetof(1);
        ASPECTMASK = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkInputAttachmentAspectReference} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkInputAttachmentAspectReference(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** an index into the {@code pSubpasses} array of the parent {@link VkRenderPassCreateInfo} structure. */
    @NativeType("uint32_t")
    public int subpass() { return nsubpass(address()); }
    /** an index into the {@code pInputAttachments} of the specified subpass. */
    @NativeType("uint32_t")
    public int inputAttachmentIndex() { return ninputAttachmentIndex(address()); }
    /** a mask of which aspect(s) <b>can</b> be accessed within the specified subpass. */
    @NativeType("VkImageAspectFlags")
    public int aspectMask() { return naspectMask(address()); }

    /** Sets the specified value to the {@link #subpass} field. */
    public VkInputAttachmentAspectReference subpass(@NativeType("uint32_t") int value) { nsubpass(address(), value); return this; }
    /** Sets the specified value to the {@link #inputAttachmentIndex} field. */
    public VkInputAttachmentAspectReference inputAttachmentIndex(@NativeType("uint32_t") int value) { ninputAttachmentIndex(address(), value); return this; }
    /** Sets the specified value to the {@link #aspectMask} field. */
    public VkInputAttachmentAspectReference aspectMask(@NativeType("VkImageAspectFlags") int value) { naspectMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkInputAttachmentAspectReference set(
        int subpass,
        int inputAttachmentIndex,
        int aspectMask
    ) {
        subpass(subpass);
        inputAttachmentIndex(inputAttachmentIndex);
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
    public VkInputAttachmentAspectReference set(VkInputAttachmentAspectReference src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkInputAttachmentAspectReference} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkInputAttachmentAspectReference malloc() {
        return wrap(VkInputAttachmentAspectReference.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkInputAttachmentAspectReference} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkInputAttachmentAspectReference calloc() {
        return wrap(VkInputAttachmentAspectReference.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkInputAttachmentAspectReference} instance allocated with {@link BufferUtils}. */
    public static VkInputAttachmentAspectReference create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkInputAttachmentAspectReference.class, memAddress(container), container);
    }

    /** Returns a new {@code VkInputAttachmentAspectReference} instance for the specified memory address. */
    public static VkInputAttachmentAspectReference create(long address) {
        return wrap(VkInputAttachmentAspectReference.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkInputAttachmentAspectReference createSafe(long address) {
        return address == NULL ? null : wrap(VkInputAttachmentAspectReference.class, address);
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReference.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReference.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReference.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReference.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReference.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReference.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkInputAttachmentAspectReference.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReference.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkInputAttachmentAspectReference.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkInputAttachmentAspectReference mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkInputAttachmentAspectReference callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkInputAttachmentAspectReference mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkInputAttachmentAspectReference callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkInputAttachmentAspectReference.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkInputAttachmentAspectReference.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkInputAttachmentAspectReference.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkInputAttachmentAspectReference.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkInputAttachmentAspectReference} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkInputAttachmentAspectReference malloc(MemoryStack stack) {
        return wrap(VkInputAttachmentAspectReference.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkInputAttachmentAspectReference} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkInputAttachmentAspectReference calloc(MemoryStack stack) {
        return wrap(VkInputAttachmentAspectReference.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReference.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReference.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkInputAttachmentAspectReference.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkInputAttachmentAspectReference.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #subpass}. */
    public static int nsubpass(long struct) { return UNSAFE.getInt(null, struct + VkInputAttachmentAspectReference.SUBPASS); }
    /** Unsafe version of {@link #inputAttachmentIndex}. */
    public static int ninputAttachmentIndex(long struct) { return UNSAFE.getInt(null, struct + VkInputAttachmentAspectReference.INPUTATTACHMENTINDEX); }
    /** Unsafe version of {@link #aspectMask}. */
    public static int naspectMask(long struct) { return UNSAFE.getInt(null, struct + VkInputAttachmentAspectReference.ASPECTMASK); }

    /** Unsafe version of {@link #subpass(int) subpass}. */
    public static void nsubpass(long struct, int value) { UNSAFE.putInt(null, struct + VkInputAttachmentAspectReference.SUBPASS, value); }
    /** Unsafe version of {@link #inputAttachmentIndex(int) inputAttachmentIndex}. */
    public static void ninputAttachmentIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkInputAttachmentAspectReference.INPUTATTACHMENTINDEX, value); }
    /** Unsafe version of {@link #aspectMask(int) aspectMask}. */
    public static void naspectMask(long struct, int value) { UNSAFE.putInt(null, struct + VkInputAttachmentAspectReference.ASPECTMASK, value); }

    // -----------------------------------

    /** An array of {@link VkInputAttachmentAspectReference} structs. */
    public static class Buffer extends StructBuffer<VkInputAttachmentAspectReference, Buffer> implements NativeResource {

        private static final VkInputAttachmentAspectReference ELEMENT_FACTORY = VkInputAttachmentAspectReference.create(-1L);

        /**
         * Creates a new {@code VkInputAttachmentAspectReference.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkInputAttachmentAspectReference#SIZEOF}, and its mark will be undefined.
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
        protected VkInputAttachmentAspectReference getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkInputAttachmentAspectReference#subpass} field. */
        @NativeType("uint32_t")
        public int subpass() { return VkInputAttachmentAspectReference.nsubpass(address()); }
        /** @return the value of the {@link VkInputAttachmentAspectReference#inputAttachmentIndex} field. */
        @NativeType("uint32_t")
        public int inputAttachmentIndex() { return VkInputAttachmentAspectReference.ninputAttachmentIndex(address()); }
        /** @return the value of the {@link VkInputAttachmentAspectReference#aspectMask} field. */
        @NativeType("VkImageAspectFlags")
        public int aspectMask() { return VkInputAttachmentAspectReference.naspectMask(address()); }

        /** Sets the specified value to the {@link VkInputAttachmentAspectReference#subpass} field. */
        public VkInputAttachmentAspectReference.Buffer subpass(@NativeType("uint32_t") int value) { VkInputAttachmentAspectReference.nsubpass(address(), value); return this; }
        /** Sets the specified value to the {@link VkInputAttachmentAspectReference#inputAttachmentIndex} field. */
        public VkInputAttachmentAspectReference.Buffer inputAttachmentIndex(@NativeType("uint32_t") int value) { VkInputAttachmentAspectReference.ninputAttachmentIndex(address(), value); return this; }
        /** Sets the specified value to the {@link VkInputAttachmentAspectReference#aspectMask} field. */
        public VkInputAttachmentAspectReference.Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) { VkInputAttachmentAspectReference.naspectMask(address(), value); return this; }

    }

}