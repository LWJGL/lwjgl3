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
 * <pre>{@code
 * struct VkSubpassDescription2 {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSubpassDescriptionFlags flags;
 *     VkPipelineBindPoint pipelineBindPoint;
 *     uint32_t viewMask;
 *     uint32_t inputAttachmentCount;
 *     {@link VkAttachmentReference2 VkAttachmentReference2} const * pInputAttachments;
 *     uint32_t colorAttachmentCount;
 *     {@link VkAttachmentReference2 VkAttachmentReference2} const * pColorAttachments;
 *     {@link VkAttachmentReference2 VkAttachmentReference2} const * pResolveAttachments;
 *     {@link VkAttachmentReference2 VkAttachmentReference2} const * pDepthStencilAttachment;
 *     uint32_t preserveAttachmentCount;
 *     uint32_t const * pPreserveAttachments;
 * }}</pre>
 */
public class VkSubpassDescription2 extends Struct<VkSubpassDescription2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PIPELINEBINDPOINT,
        VIEWMASK,
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
            __member(POINTER_SIZE),
            __member(4),
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

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PIPELINEBINDPOINT = layout.offsetof(3);
        VIEWMASK = layout.offsetof(4);
        INPUTATTACHMENTCOUNT = layout.offsetof(5);
        PINPUTATTACHMENTS = layout.offsetof(6);
        COLORATTACHMENTCOUNT = layout.offsetof(7);
        PCOLORATTACHMENTS = layout.offsetof(8);
        PRESOLVEATTACHMENTS = layout.offsetof(9);
        PDEPTHSTENCILATTACHMENT = layout.offsetof(10);
        PRESERVEATTACHMENTCOUNT = layout.offsetof(11);
        PPRESERVEATTACHMENTS = layout.offsetof(12);
    }

    protected VkSubpassDescription2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubpassDescription2 create(long address, @Nullable ByteBuffer container) {
        return new VkSubpassDescription2(address, container);
    }

    /**
     * Creates a {@code VkSubpassDescription2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassDescription2(ByteBuffer container) {
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
    @NativeType("VkSubpassDescriptionFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code pipelineBindPoint} field. */
    @NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() { return npipelineBindPoint(address()); }
    /** @return the value of the {@code viewMask} field. */
    @NativeType("uint32_t")
    public int viewMask() { return nviewMask(address()); }
    /** @return the value of the {@code inputAttachmentCount} field. */
    @NativeType("uint32_t")
    public int inputAttachmentCount() { return ninputAttachmentCount(address()); }
    /** @return a {@link VkAttachmentReference2.Buffer} view of the struct array pointed to by the {@code pInputAttachments} field. */
    @NativeType("VkAttachmentReference2 const *")
    public VkAttachmentReference2.@Nullable Buffer pInputAttachments() { return npInputAttachments(address()); }
    /** @return the value of the {@code colorAttachmentCount} field. */
    @NativeType("uint32_t")
    public int colorAttachmentCount() { return ncolorAttachmentCount(address()); }
    /** @return a {@link VkAttachmentReference2.Buffer} view of the struct array pointed to by the {@code pColorAttachments} field. */
    @NativeType("VkAttachmentReference2 const *")
    public VkAttachmentReference2.@Nullable Buffer pColorAttachments() { return npColorAttachments(address()); }
    /** @return a {@link VkAttachmentReference2.Buffer} view of the struct array pointed to by the {@code pResolveAttachments} field. */
    @NativeType("VkAttachmentReference2 const *")
    public VkAttachmentReference2.@Nullable Buffer pResolveAttachments() { return npResolveAttachments(address()); }
    /** @return a {@link VkAttachmentReference2} view of the struct pointed to by the {@code pDepthStencilAttachment} field. */
    @NativeType("VkAttachmentReference2 const *")
    public @Nullable VkAttachmentReference2 pDepthStencilAttachment() { return npDepthStencilAttachment(address()); }
    /** @return the value of the {@code preserveAttachmentCount} field. */
    @NativeType("uint32_t")
    public int preserveAttachmentCount() { return npreserveAttachmentCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pPreserveAttachments} field. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pPreserveAttachments() { return npPreserveAttachments(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSubpassDescription2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2 STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2} value to the {@code sType} field. */
    public VkSubpassDescription2 sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSubpassDescription2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkFragmentShadingRateAttachmentInfoKHR} value to the {@code pNext} chain. */
    public VkSubpassDescription2 pNext(VkFragmentShadingRateAttachmentInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMultisampledRenderToSingleSampledInfoEXT} value to the {@code pNext} chain. */
    public VkSubpassDescription2 pNext(VkMultisampledRenderToSingleSampledInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassCreationControlEXT} value to the {@code pNext} chain. */
    public VkSubpassDescription2 pNext(VkRenderPassCreationControlEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassSubpassFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
    public VkSubpassDescription2 pNext(VkRenderPassSubpassFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSubpassDescriptionDepthStencilResolve} value to the {@code pNext} chain. */
    public VkSubpassDescription2 pNext(VkSubpassDescriptionDepthStencilResolve value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSubpassDescriptionDepthStencilResolveKHR} value to the {@code pNext} chain. */
    public VkSubpassDescription2 pNext(VkSubpassDescriptionDepthStencilResolveKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkSubpassDescription2 flags(@NativeType("VkSubpassDescriptionFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineBindPoint} field. */
    public VkSubpassDescription2 pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { npipelineBindPoint(address(), value); return this; }
    /** Sets the specified value to the {@code viewMask} field. */
    public VkSubpassDescription2 viewMask(@NativeType("uint32_t") int value) { nviewMask(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2.Buffer} to the {@code pInputAttachments} field. */
    public VkSubpassDescription2 pInputAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.@Nullable Buffer value) { npInputAttachments(address(), value); return this; }
    /** Sets the specified value to the {@code colorAttachmentCount} field. */
    public VkSubpassDescription2 colorAttachmentCount(@NativeType("uint32_t") int value) { ncolorAttachmentCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2.Buffer} to the {@code pColorAttachments} field. */
    public VkSubpassDescription2 pColorAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.@Nullable Buffer value) { npColorAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2.Buffer} to the {@code pResolveAttachments} field. */
    public VkSubpassDescription2 pResolveAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.@Nullable Buffer value) { npResolveAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2} to the {@code pDepthStencilAttachment} field. */
    public VkSubpassDescription2 pDepthStencilAttachment(@Nullable @NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) { npDepthStencilAttachment(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pPreserveAttachments} field. */
    public VkSubpassDescription2 pPreserveAttachments(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npPreserveAttachments(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassDescription2 set(
        int sType,
        long pNext,
        int flags,
        int pipelineBindPoint,
        int viewMask,
        VkAttachmentReference2.@Nullable Buffer pInputAttachments,
        int colorAttachmentCount,
        VkAttachmentReference2.@Nullable Buffer pColorAttachments,
        VkAttachmentReference2.@Nullable Buffer pResolveAttachments,
        @Nullable VkAttachmentReference2 pDepthStencilAttachment,
        @Nullable IntBuffer pPreserveAttachments
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pipelineBindPoint(pipelineBindPoint);
        viewMask(viewMask);
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
    public VkSubpassDescription2 set(VkSubpassDescription2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassDescription2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassDescription2 malloc() {
        return new VkSubpassDescription2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubpassDescription2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassDescription2 calloc() {
        return new VkSubpassDescription2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubpassDescription2} instance allocated with {@link BufferUtils}. */
    public static VkSubpassDescription2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassDescription2(memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassDescription2} instance for the specified memory address. */
    public static VkSubpassDescription2 create(long address) {
        return new VkSubpassDescription2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSubpassDescription2 createSafe(long address) {
        return address == NULL ? null : new VkSubpassDescription2(address, null);
    }

    /**
     * Returns a new {@link VkSubpassDescription2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubpassDescription2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSubpassDescription2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSubpassDescription2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescription2 malloc(MemoryStack stack) {
        return new VkSubpassDescription2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubpassDescription2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescription2 calloc(MemoryStack stack) {
        return new VkSubpassDescription2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubpassDescription2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSubpassDescription2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubpassDescription2.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkSubpassDescription2.FLAGS); }
    /** Unsafe version of {@link #pipelineBindPoint}. */
    public static int npipelineBindPoint(long struct) { return memGetInt(struct + VkSubpassDescription2.PIPELINEBINDPOINT); }
    /** Unsafe version of {@link #viewMask}. */
    public static int nviewMask(long struct) { return memGetInt(struct + VkSubpassDescription2.VIEWMASK); }
    /** Unsafe version of {@link #inputAttachmentCount}. */
    public static int ninputAttachmentCount(long struct) { return memGetInt(struct + VkSubpassDescription2.INPUTATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pInputAttachments}. */
    public static VkAttachmentReference2.@Nullable Buffer npInputAttachments(long struct) { return VkAttachmentReference2.createSafe(memGetAddress(struct + VkSubpassDescription2.PINPUTATTACHMENTS), ninputAttachmentCount(struct)); }
    /** Unsafe version of {@link #colorAttachmentCount}. */
    public static int ncolorAttachmentCount(long struct) { return memGetInt(struct + VkSubpassDescription2.COLORATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pColorAttachments}. */
    public static VkAttachmentReference2.@Nullable Buffer npColorAttachments(long struct) { return VkAttachmentReference2.createSafe(memGetAddress(struct + VkSubpassDescription2.PCOLORATTACHMENTS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #pResolveAttachments}. */
    public static VkAttachmentReference2.@Nullable Buffer npResolveAttachments(long struct) { return VkAttachmentReference2.createSafe(memGetAddress(struct + VkSubpassDescription2.PRESOLVEATTACHMENTS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #pDepthStencilAttachment}. */
    public static @Nullable VkAttachmentReference2 npDepthStencilAttachment(long struct) { return VkAttachmentReference2.createSafe(memGetAddress(struct + VkSubpassDescription2.PDEPTHSTENCILATTACHMENT)); }
    /** Unsafe version of {@link #preserveAttachmentCount}. */
    public static int npreserveAttachmentCount(long struct) { return memGetInt(struct + VkSubpassDescription2.PRESERVEATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pPreserveAttachments() pPreserveAttachments}. */
    public static @Nullable IntBuffer npPreserveAttachments(long struct) { return memIntBufferSafe(memGetAddress(struct + VkSubpassDescription2.PPRESERVEATTACHMENTS), npreserveAttachmentCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSubpassDescription2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubpassDescription2.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkSubpassDescription2.FLAGS, value); }
    /** Unsafe version of {@link #pipelineBindPoint(int) pipelineBindPoint}. */
    public static void npipelineBindPoint(long struct, int value) { memPutInt(struct + VkSubpassDescription2.PIPELINEBINDPOINT, value); }
    /** Unsafe version of {@link #viewMask(int) viewMask}. */
    public static void nviewMask(long struct, int value) { memPutInt(struct + VkSubpassDescription2.VIEWMASK, value); }
    /** Sets the specified value to the {@code inputAttachmentCount} field of the specified {@code struct}. */
    public static void ninputAttachmentCount(long struct, int value) { memPutInt(struct + VkSubpassDescription2.INPUTATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pInputAttachments(VkAttachmentReference2.Buffer) pInputAttachments}. */
    public static void npInputAttachments(long struct, VkAttachmentReference2.@Nullable Buffer value) { memPutAddress(struct + VkSubpassDescription2.PINPUTATTACHMENTS, memAddressSafe(value)); ninputAttachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code colorAttachmentCount} field of the specified {@code struct}. */
    public static void ncolorAttachmentCount(long struct, int value) { memPutInt(struct + VkSubpassDescription2.COLORATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pColorAttachments(VkAttachmentReference2.Buffer) pColorAttachments}. */
    public static void npColorAttachments(long struct, VkAttachmentReference2.@Nullable Buffer value) { memPutAddress(struct + VkSubpassDescription2.PCOLORATTACHMENTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pResolveAttachments(VkAttachmentReference2.Buffer) pResolveAttachments}. */
    public static void npResolveAttachments(long struct, VkAttachmentReference2.@Nullable Buffer value) { memPutAddress(struct + VkSubpassDescription2.PRESOLVEATTACHMENTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pDepthStencilAttachment(VkAttachmentReference2) pDepthStencilAttachment}. */
    public static void npDepthStencilAttachment(long struct, @Nullable VkAttachmentReference2 value) { memPutAddress(struct + VkSubpassDescription2.PDEPTHSTENCILATTACHMENT, memAddressSafe(value)); }
    /** Sets the specified value to the {@code preserveAttachmentCount} field of the specified {@code struct}. */
    public static void npreserveAttachmentCount(long struct, int value) { memPutInt(struct + VkSubpassDescription2.PRESERVEATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pPreserveAttachments(IntBuffer) pPreserveAttachments}. */
    public static void npPreserveAttachments(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkSubpassDescription2.PPRESERVEATTACHMENTS, memAddressSafe(value)); npreserveAttachmentCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ninputAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkSubpassDescription2.PINPUTATTACHMENTS));
        }
        if (ncolorAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkSubpassDescription2.PCOLORATTACHMENTS));
        }
        if (npreserveAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkSubpassDescription2.PPRESERVEATTACHMENTS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkSubpassDescription2} structs. */
    public static class Buffer extends StructBuffer<VkSubpassDescription2, Buffer> implements NativeResource {

        private static final VkSubpassDescription2 ELEMENT_FACTORY = VkSubpassDescription2.create(-1L);

        /**
         * Creates a new {@code VkSubpassDescription2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassDescription2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubpassDescription2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubpassDescription2.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSubpassDescription2.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkSubpassDescriptionFlags")
        public int flags() { return VkSubpassDescription2.nflags(address()); }
        /** @return the value of the {@code pipelineBindPoint} field. */
        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() { return VkSubpassDescription2.npipelineBindPoint(address()); }
        /** @return the value of the {@code viewMask} field. */
        @NativeType("uint32_t")
        public int viewMask() { return VkSubpassDescription2.nviewMask(address()); }
        /** @return the value of the {@code inputAttachmentCount} field. */
        @NativeType("uint32_t")
        public int inputAttachmentCount() { return VkSubpassDescription2.ninputAttachmentCount(address()); }
        /** @return a {@link VkAttachmentReference2.Buffer} view of the struct array pointed to by the {@code pInputAttachments} field. */
        @NativeType("VkAttachmentReference2 const *")
        public VkAttachmentReference2.@Nullable Buffer pInputAttachments() { return VkSubpassDescription2.npInputAttachments(address()); }
        /** @return the value of the {@code colorAttachmentCount} field. */
        @NativeType("uint32_t")
        public int colorAttachmentCount() { return VkSubpassDescription2.ncolorAttachmentCount(address()); }
        /** @return a {@link VkAttachmentReference2.Buffer} view of the struct array pointed to by the {@code pColorAttachments} field. */
        @NativeType("VkAttachmentReference2 const *")
        public VkAttachmentReference2.@Nullable Buffer pColorAttachments() { return VkSubpassDescription2.npColorAttachments(address()); }
        /** @return a {@link VkAttachmentReference2.Buffer} view of the struct array pointed to by the {@code pResolveAttachments} field. */
        @NativeType("VkAttachmentReference2 const *")
        public VkAttachmentReference2.@Nullable Buffer pResolveAttachments() { return VkSubpassDescription2.npResolveAttachments(address()); }
        /** @return a {@link VkAttachmentReference2} view of the struct pointed to by the {@code pDepthStencilAttachment} field. */
        @NativeType("VkAttachmentReference2 const *")
        public @Nullable VkAttachmentReference2 pDepthStencilAttachment() { return VkSubpassDescription2.npDepthStencilAttachment(address()); }
        /** @return the value of the {@code preserveAttachmentCount} field. */
        @NativeType("uint32_t")
        public int preserveAttachmentCount() { return VkSubpassDescription2.npreserveAttachmentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pPreserveAttachments} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pPreserveAttachments() { return VkSubpassDescription2.npPreserveAttachments(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSubpassDescription2.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassDescription2.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2 STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2} value to the {@code sType} field. */
        public VkSubpassDescription2.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSubpassDescription2.Buffer pNext(@NativeType("void const *") long value) { VkSubpassDescription2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkFragmentShadingRateAttachmentInfoKHR} value to the {@code pNext} chain. */
        public VkSubpassDescription2.Buffer pNext(VkFragmentShadingRateAttachmentInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMultisampledRenderToSingleSampledInfoEXT} value to the {@code pNext} chain. */
        public VkSubpassDescription2.Buffer pNext(VkMultisampledRenderToSingleSampledInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassCreationControlEXT} value to the {@code pNext} chain. */
        public VkSubpassDescription2.Buffer pNext(VkRenderPassCreationControlEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassSubpassFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
        public VkSubpassDescription2.Buffer pNext(VkRenderPassSubpassFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSubpassDescriptionDepthStencilResolve} value to the {@code pNext} chain. */
        public VkSubpassDescription2.Buffer pNext(VkSubpassDescriptionDepthStencilResolve value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSubpassDescriptionDepthStencilResolveKHR} value to the {@code pNext} chain. */
        public VkSubpassDescription2.Buffer pNext(VkSubpassDescriptionDepthStencilResolveKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkSubpassDescription2.Buffer flags(@NativeType("VkSubpassDescriptionFlags") int value) { VkSubpassDescription2.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineBindPoint} field. */
        public VkSubpassDescription2.Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { VkSubpassDescription2.npipelineBindPoint(address(), value); return this; }
        /** Sets the specified value to the {@code viewMask} field. */
        public VkSubpassDescription2.Buffer viewMask(@NativeType("uint32_t") int value) { VkSubpassDescription2.nviewMask(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2.Buffer} to the {@code pInputAttachments} field. */
        public VkSubpassDescription2.Buffer pInputAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.@Nullable Buffer value) { VkSubpassDescription2.npInputAttachments(address(), value); return this; }
        /** Sets the specified value to the {@code colorAttachmentCount} field. */
        public VkSubpassDescription2.Buffer colorAttachmentCount(@NativeType("uint32_t") int value) { VkSubpassDescription2.ncolorAttachmentCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2.Buffer} to the {@code pColorAttachments} field. */
        public VkSubpassDescription2.Buffer pColorAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.@Nullable Buffer value) { VkSubpassDescription2.npColorAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2.Buffer} to the {@code pResolveAttachments} field. */
        public VkSubpassDescription2.Buffer pResolveAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.@Nullable Buffer value) { VkSubpassDescription2.npResolveAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2} to the {@code pDepthStencilAttachment} field. */
        public VkSubpassDescription2.Buffer pDepthStencilAttachment(@Nullable @NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) { VkSubpassDescription2.npDepthStencilAttachment(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pPreserveAttachments} field. */
        public VkSubpassDescription2.Buffer pPreserveAttachments(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkSubpassDescription2.npPreserveAttachments(address(), value); return this; }

    }

}