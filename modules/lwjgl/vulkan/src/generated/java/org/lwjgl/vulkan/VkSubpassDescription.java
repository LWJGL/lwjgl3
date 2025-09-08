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
 * <pre><code>
 * struct VkSubpassDescription {
 *     VkSubpassDescriptionFlags flags;
 *     VkPipelineBindPoint pipelineBindPoint;
 *     uint32_t inputAttachmentCount;
 *     {@link VkAttachmentReference VkAttachmentReference} const * pInputAttachments;
 *     uint32_t colorAttachmentCount;
 *     {@link VkAttachmentReference VkAttachmentReference} const * pColorAttachments;
 *     {@link VkAttachmentReference VkAttachmentReference} const * pResolveAttachments;
 *     {@link VkAttachmentReference VkAttachmentReference} const * pDepthStencilAttachment;
 *     uint32_t preserveAttachmentCount;
 *     uint32_t const * pPreserveAttachments;
 * }</code></pre>
 */
public class VkSubpassDescription extends Struct<VkSubpassDescription> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        PIPELINEBINDPOINT,
        INPUTATTACHMENTCOUNT,
        PINPUTATTACHMENTS,
        COLORATTACHMENTCOUNT,
        PCOLORATTACHMENTS,
        PRESOLVEATTACHMENTS,
        PDEPTHSTENCILATTACHMENT,
        PRESERVEATTACHMENTCOUNT,
        PPRESERVEATTACHMENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        PIPELINEBINDPOINT = layout.offsetof(1);
        INPUTATTACHMENTCOUNT = layout.offsetof(2);
        PINPUTATTACHMENTS = layout.offsetof(3);
        COLORATTACHMENTCOUNT = layout.offsetof(4);
        PCOLORATTACHMENTS = layout.offsetof(5);
        PRESOLVEATTACHMENTS = layout.offsetof(6);
        PDEPTHSTENCILATTACHMENT = layout.offsetof(7);
        PRESERVEATTACHMENTCOUNT = layout.offsetof(8);
        PPRESERVEATTACHMENTS = layout.offsetof(9);
    }

    protected VkSubpassDescription(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubpassDescription create(long address, @Nullable ByteBuffer container) {
        return new VkSubpassDescription(address, container);
    }

    /**
     * Creates a {@code VkSubpassDescription} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassDescription(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code flags} field. */
    @NativeType("VkSubpassDescriptionFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code pipelineBindPoint} field. */
    @NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() { return npipelineBindPoint(address()); }
    /** @return the value of the {@code inputAttachmentCount} field. */
    @NativeType("uint32_t")
    public int inputAttachmentCount() { return ninputAttachmentCount(address()); }
    /** @return a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@code pInputAttachments} field. */
    @NativeType("VkAttachmentReference const *")
    public VkAttachmentReference.@Nullable Buffer pInputAttachments() { return npInputAttachments(address()); }
    /** @return the value of the {@code colorAttachmentCount} field. */
    @NativeType("uint32_t")
    public int colorAttachmentCount() { return ncolorAttachmentCount(address()); }
    /** @return a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@code pColorAttachments} field. */
    @NativeType("VkAttachmentReference const *")
    public VkAttachmentReference.@Nullable Buffer pColorAttachments() { return npColorAttachments(address()); }
    /** @return a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@code pResolveAttachments} field. */
    @NativeType("VkAttachmentReference const *")
    public VkAttachmentReference.@Nullable Buffer pResolveAttachments() { return npResolveAttachments(address()); }
    /** @return a {@link VkAttachmentReference} view of the struct pointed to by the {@code pDepthStencilAttachment} field. */
    @NativeType("VkAttachmentReference const *")
    public @Nullable VkAttachmentReference pDepthStencilAttachment() { return npDepthStencilAttachment(address()); }
    /** @return the value of the {@code preserveAttachmentCount} field. */
    @NativeType("uint32_t")
    public int preserveAttachmentCount() { return npreserveAttachmentCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pPreserveAttachments} field. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pPreserveAttachments() { return npPreserveAttachments(address()); }

    /** Sets the specified value to the {@code flags} field. */
    public VkSubpassDescription flags(@NativeType("VkSubpassDescriptionFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineBindPoint} field. */
    public VkSubpassDescription pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { npipelineBindPoint(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@code pInputAttachments} field. */
    public VkSubpassDescription pInputAttachments(@NativeType("VkAttachmentReference const *") VkAttachmentReference.@Nullable Buffer value) { npInputAttachments(address(), value); return this; }
    /** Sets the specified value to the {@code colorAttachmentCount} field. */
    public VkSubpassDescription colorAttachmentCount(@NativeType("uint32_t") int value) { ncolorAttachmentCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@code pColorAttachments} field. */
    public VkSubpassDescription pColorAttachments(@NativeType("VkAttachmentReference const *") VkAttachmentReference.@Nullable Buffer value) { npColorAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@code pResolveAttachments} field. */
    public VkSubpassDescription pResolveAttachments(@NativeType("VkAttachmentReference const *") VkAttachmentReference.@Nullable Buffer value) { npResolveAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference} to the {@code pDepthStencilAttachment} field. */
    public VkSubpassDescription pDepthStencilAttachment(@Nullable @NativeType("VkAttachmentReference const *") VkAttachmentReference value) { npDepthStencilAttachment(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pPreserveAttachments} field. */
    public VkSubpassDescription pPreserveAttachments(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npPreserveAttachments(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassDescription set(
        int flags,
        int pipelineBindPoint,
        VkAttachmentReference.@Nullable Buffer pInputAttachments,
        int colorAttachmentCount,
        VkAttachmentReference.@Nullable Buffer pColorAttachments,
        VkAttachmentReference.@Nullable Buffer pResolveAttachments,
        @Nullable VkAttachmentReference pDepthStencilAttachment,
        @Nullable IntBuffer pPreserveAttachments
    ) {
        flags(flags);
        pipelineBindPoint(pipelineBindPoint);
        pInputAttachments(pInputAttachments);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachments(pColorAttachments);
        pResolveAttachments(pResolveAttachments);
        pDepthStencilAttachment(pDepthStencilAttachment);
        pPreserveAttachments(pPreserveAttachments);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassDescription set(VkSubpassDescription src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassDescription} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassDescription malloc() {
        return new VkSubpassDescription(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubpassDescription} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassDescription calloc() {
        return new VkSubpassDescription(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubpassDescription} instance allocated with {@link BufferUtils}. */
    public static VkSubpassDescription create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassDescription(memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassDescription} instance for the specified memory address. */
    public static VkSubpassDescription create(long address) {
        return new VkSubpassDescription(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSubpassDescription createSafe(long address) {
        return address == NULL ? null : new VkSubpassDescription(address, null);
    }

    /**
     * Returns a new {@link VkSubpassDescription.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubpassDescription.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSubpassDescription.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSubpassDescription} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescription malloc(MemoryStack stack) {
        return new VkSubpassDescription(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubpassDescription} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescription calloc(MemoryStack stack) {
        return new VkSubpassDescription(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubpassDescription.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkSubpassDescription.FLAGS); }
    /** Unsafe version of {@link #pipelineBindPoint}. */
    public static int npipelineBindPoint(long struct) { return memGetInt(struct + VkSubpassDescription.PIPELINEBINDPOINT); }
    /** Unsafe version of {@link #inputAttachmentCount}. */
    public static int ninputAttachmentCount(long struct) { return memGetInt(struct + VkSubpassDescription.INPUTATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pInputAttachments}. */
    public static VkAttachmentReference.@Nullable Buffer npInputAttachments(long struct) { return VkAttachmentReference.createSafe(memGetAddress(struct + VkSubpassDescription.PINPUTATTACHMENTS), ninputAttachmentCount(struct)); }
    /** Unsafe version of {@link #colorAttachmentCount}. */
    public static int ncolorAttachmentCount(long struct) { return memGetInt(struct + VkSubpassDescription.COLORATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pColorAttachments}. */
    public static VkAttachmentReference.@Nullable Buffer npColorAttachments(long struct) { return VkAttachmentReference.createSafe(memGetAddress(struct + VkSubpassDescription.PCOLORATTACHMENTS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #pResolveAttachments}. */
    public static VkAttachmentReference.@Nullable Buffer npResolveAttachments(long struct) { return VkAttachmentReference.createSafe(memGetAddress(struct + VkSubpassDescription.PRESOLVEATTACHMENTS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #pDepthStencilAttachment}. */
    public static @Nullable VkAttachmentReference npDepthStencilAttachment(long struct) { return VkAttachmentReference.createSafe(memGetAddress(struct + VkSubpassDescription.PDEPTHSTENCILATTACHMENT)); }
    /** Unsafe version of {@link #preserveAttachmentCount}. */
    public static int npreserveAttachmentCount(long struct) { return memGetInt(struct + VkSubpassDescription.PRESERVEATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pPreserveAttachments() pPreserveAttachments}. */
    public static @Nullable IntBuffer npPreserveAttachments(long struct) { return memIntBufferSafe(memGetAddress(struct + VkSubpassDescription.PPRESERVEATTACHMENTS), npreserveAttachmentCount(struct)); }

    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkSubpassDescription.FLAGS, value); }
    /** Unsafe version of {@link #pipelineBindPoint(int) pipelineBindPoint}. */
    public static void npipelineBindPoint(long struct, int value) { memPutInt(struct + VkSubpassDescription.PIPELINEBINDPOINT, value); }
    /** Sets the specified value to the {@code inputAttachmentCount} field of the specified {@code struct}. */
    public static void ninputAttachmentCount(long struct, int value) { memPutInt(struct + VkSubpassDescription.INPUTATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pInputAttachments(VkAttachmentReference.Buffer) pInputAttachments}. */
    public static void npInputAttachments(long struct, VkAttachmentReference.@Nullable Buffer value) { memPutAddress(struct + VkSubpassDescription.PINPUTATTACHMENTS, memAddressSafe(value)); ninputAttachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code colorAttachmentCount} field of the specified {@code struct}. */
    public static void ncolorAttachmentCount(long struct, int value) { memPutInt(struct + VkSubpassDescription.COLORATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pColorAttachments(VkAttachmentReference.Buffer) pColorAttachments}. */
    public static void npColorAttachments(long struct, VkAttachmentReference.@Nullable Buffer value) { memPutAddress(struct + VkSubpassDescription.PCOLORATTACHMENTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pResolveAttachments(VkAttachmentReference.Buffer) pResolveAttachments}. */
    public static void npResolveAttachments(long struct, VkAttachmentReference.@Nullable Buffer value) { memPutAddress(struct + VkSubpassDescription.PRESOLVEATTACHMENTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pDepthStencilAttachment(VkAttachmentReference) pDepthStencilAttachment}. */
    public static void npDepthStencilAttachment(long struct, @Nullable VkAttachmentReference value) { memPutAddress(struct + VkSubpassDescription.PDEPTHSTENCILATTACHMENT, memAddressSafe(value)); }
    /** Sets the specified value to the {@code preserveAttachmentCount} field of the specified {@code struct}. */
    public static void npreserveAttachmentCount(long struct, int value) { memPutInt(struct + VkSubpassDescription.PRESERVEATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pPreserveAttachments(IntBuffer) pPreserveAttachments}. */
    public static void npPreserveAttachments(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkSubpassDescription.PPRESERVEATTACHMENTS, memAddressSafe(value)); npreserveAttachmentCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ninputAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkSubpassDescription.PINPUTATTACHMENTS));
        }
        if (ncolorAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkSubpassDescription.PCOLORATTACHMENTS));
        }
        if (npreserveAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkSubpassDescription.PPRESERVEATTACHMENTS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkSubpassDescription} structs. */
    public static class Buffer extends StructBuffer<VkSubpassDescription, Buffer> implements NativeResource {

        private static final VkSubpassDescription ELEMENT_FACTORY = VkSubpassDescription.create(-1L);

        /**
         * Creates a new {@code VkSubpassDescription.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassDescription#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubpassDescription getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code flags} field. */
        @NativeType("VkSubpassDescriptionFlags")
        public int flags() { return VkSubpassDescription.nflags(address()); }
        /** @return the value of the {@code pipelineBindPoint} field. */
        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() { return VkSubpassDescription.npipelineBindPoint(address()); }
        /** @return the value of the {@code inputAttachmentCount} field. */
        @NativeType("uint32_t")
        public int inputAttachmentCount() { return VkSubpassDescription.ninputAttachmentCount(address()); }
        /** @return a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@code pInputAttachments} field. */
        @NativeType("VkAttachmentReference const *")
        public VkAttachmentReference.@Nullable Buffer pInputAttachments() { return VkSubpassDescription.npInputAttachments(address()); }
        /** @return the value of the {@code colorAttachmentCount} field. */
        @NativeType("uint32_t")
        public int colorAttachmentCount() { return VkSubpassDescription.ncolorAttachmentCount(address()); }
        /** @return a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@code pColorAttachments} field. */
        @NativeType("VkAttachmentReference const *")
        public VkAttachmentReference.@Nullable Buffer pColorAttachments() { return VkSubpassDescription.npColorAttachments(address()); }
        /** @return a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@code pResolveAttachments} field. */
        @NativeType("VkAttachmentReference const *")
        public VkAttachmentReference.@Nullable Buffer pResolveAttachments() { return VkSubpassDescription.npResolveAttachments(address()); }
        /** @return a {@link VkAttachmentReference} view of the struct pointed to by the {@code pDepthStencilAttachment} field. */
        @NativeType("VkAttachmentReference const *")
        public @Nullable VkAttachmentReference pDepthStencilAttachment() { return VkSubpassDescription.npDepthStencilAttachment(address()); }
        /** @return the value of the {@code preserveAttachmentCount} field. */
        @NativeType("uint32_t")
        public int preserveAttachmentCount() { return VkSubpassDescription.npreserveAttachmentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pPreserveAttachments} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pPreserveAttachments() { return VkSubpassDescription.npPreserveAttachments(address()); }

        /** Sets the specified value to the {@code flags} field. */
        public VkSubpassDescription.Buffer flags(@NativeType("VkSubpassDescriptionFlags") int value) { VkSubpassDescription.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineBindPoint} field. */
        public VkSubpassDescription.Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { VkSubpassDescription.npipelineBindPoint(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@code pInputAttachments} field. */
        public VkSubpassDescription.Buffer pInputAttachments(@NativeType("VkAttachmentReference const *") VkAttachmentReference.@Nullable Buffer value) { VkSubpassDescription.npInputAttachments(address(), value); return this; }
        /** Sets the specified value to the {@code colorAttachmentCount} field. */
        public VkSubpassDescription.Buffer colorAttachmentCount(@NativeType("uint32_t") int value) { VkSubpassDescription.ncolorAttachmentCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@code pColorAttachments} field. */
        public VkSubpassDescription.Buffer pColorAttachments(@NativeType("VkAttachmentReference const *") VkAttachmentReference.@Nullable Buffer value) { VkSubpassDescription.npColorAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@code pResolveAttachments} field. */
        public VkSubpassDescription.Buffer pResolveAttachments(@NativeType("VkAttachmentReference const *") VkAttachmentReference.@Nullable Buffer value) { VkSubpassDescription.npResolveAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference} to the {@code pDepthStencilAttachment} field. */
        public VkSubpassDescription.Buffer pDepthStencilAttachment(@Nullable @NativeType("VkAttachmentReference const *") VkAttachmentReference value) { VkSubpassDescription.npDepthStencilAttachment(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pPreserveAttachments} field. */
        public VkSubpassDescription.Buffer pPreserveAttachments(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkSubpassDescription.npPreserveAttachments(address(), value); return this; }

    }

}