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
 * struct VkRenderingInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkRenderingFlags flags;
 *     {@link VkRect2D VkRect2D} renderArea;
 *     uint32_t layerCount;
 *     uint32_t viewMask;
 *     uint32_t colorAttachmentCount;
 *     {@link VkRenderingAttachmentInfo VkRenderingAttachmentInfo} const * pColorAttachments;
 *     {@link VkRenderingAttachmentInfo VkRenderingAttachmentInfo} const * pDepthAttachment;
 *     {@link VkRenderingAttachmentInfo VkRenderingAttachmentInfo} const * pStencilAttachment;
 * }}</pre>
 */
public class VkRenderingInfo extends Struct<VkRenderingInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        RENDERAREA,
        LAYERCOUNT,
        VIEWMASK,
        COLORATTACHMENTCOUNT,
        PCOLORATTACHMENTS,
        PDEPTHATTACHMENT,
        PSTENCILATTACHMENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkRect2D.SIZEOF, VkRect2D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RENDERAREA = layout.offsetof(3);
        LAYERCOUNT = layout.offsetof(4);
        VIEWMASK = layout.offsetof(5);
        COLORATTACHMENTCOUNT = layout.offsetof(6);
        PCOLORATTACHMENTS = layout.offsetof(7);
        PDEPTHATTACHMENT = layout.offsetof(8);
        PSTENCILATTACHMENT = layout.offsetof(9);
    }

    protected VkRenderingInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderingInfo create(long address, @Nullable ByteBuffer container) {
        return new VkRenderingInfo(address, container);
    }

    /**
     * Creates a {@code VkRenderingInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderingInfo(ByteBuffer container) {
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
    @NativeType("VkRenderingFlags")
    public int flags() { return nflags(address()); }
    /** @return a {@link VkRect2D} view of the {@code renderArea} field. */
    public VkRect2D renderArea() { return nrenderArea(address()); }
    /** @return the value of the {@code layerCount} field. */
    @NativeType("uint32_t")
    public int layerCount() { return nlayerCount(address()); }
    /** @return the value of the {@code viewMask} field. */
    @NativeType("uint32_t")
    public int viewMask() { return nviewMask(address()); }
    /** @return the value of the {@code colorAttachmentCount} field. */
    @NativeType("uint32_t")
    public int colorAttachmentCount() { return ncolorAttachmentCount(address()); }
    /** @return a {@link VkRenderingAttachmentInfo.Buffer} view of the struct array pointed to by the {@code pColorAttachments} field. */
    @NativeType("VkRenderingAttachmentInfo const *")
    public VkRenderingAttachmentInfo.@Nullable Buffer pColorAttachments() { return npColorAttachments(address()); }
    /** @return a {@link VkRenderingAttachmentInfo} view of the struct pointed to by the {@code pDepthAttachment} field. */
    @NativeType("VkRenderingAttachmentInfo const *")
    public @Nullable VkRenderingAttachmentInfo pDepthAttachment() { return npDepthAttachment(address()); }
    /** @return a {@link VkRenderingAttachmentInfo} view of the struct pointed to by the {@code pStencilAttachment} field. */
    @NativeType("VkRenderingAttachmentInfo const *")
    public @Nullable VkRenderingAttachmentInfo pStencilAttachment() { return npStencilAttachment(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderingInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_RENDERING_INFO STRUCTURE_TYPE_RENDERING_INFO} value to the {@code sType} field. */
    public VkRenderingInfo sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_RENDERING_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderingInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDeviceGroupRenderPassBeginInfo} value to the {@code pNext} chain. */
    public VkRenderingInfo pNext(VkDeviceGroupRenderPassBeginInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDeviceGroupRenderPassBeginInfoKHR} value to the {@code pNext} chain. */
    public VkRenderingInfo pNext(VkDeviceGroupRenderPassBeginInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMultisampledRenderToSingleSampledInfoEXT} value to the {@code pNext} chain. */
    public VkRenderingInfo pNext(VkMultisampledRenderToSingleSampledInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMultiviewPerViewAttributesInfoNVX} value to the {@code pNext} chain. */
    public VkRenderingInfo pNext(VkMultiviewPerViewAttributesInfoNVX value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM} value to the {@code pNext} chain. */
    public VkRenderingInfo pNext(VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassStripeBeginInfoARM} value to the {@code pNext} chain. */
    public VkRenderingInfo pNext(VkRenderPassStripeBeginInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderingFragmentDensityMapAttachmentInfoEXT} value to the {@code pNext} chain. */
    public VkRenderingInfo pNext(VkRenderingFragmentDensityMapAttachmentInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderingFragmentShadingRateAttachmentInfoKHR} value to the {@code pNext} chain. */
    public VkRenderingInfo pNext(VkRenderingFragmentShadingRateAttachmentInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkRenderingInfo flags(@NativeType("VkRenderingFlags") int value) { nflags(address(), value); return this; }
    /** Copies the specified {@link VkRect2D} to the {@code renderArea} field. */
    public VkRenderingInfo renderArea(VkRect2D value) { nrenderArea(address(), value); return this; }
    /** Passes the {@code renderArea} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkRenderingInfo renderArea(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(renderArea()); return this; }
    /** Sets the specified value to the {@code layerCount} field. */
    public VkRenderingInfo layerCount(@NativeType("uint32_t") int value) { nlayerCount(address(), value); return this; }
    /** Sets the specified value to the {@code viewMask} field. */
    public VkRenderingInfo viewMask(@NativeType("uint32_t") int value) { nviewMask(address(), value); return this; }
    /** Sets the address of the specified {@link VkRenderingAttachmentInfo.Buffer} to the {@code pColorAttachments} field. */
    public VkRenderingInfo pColorAttachments(@NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo.@Nullable Buffer value) { npColorAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkRenderingAttachmentInfo} to the {@code pDepthAttachment} field. */
    public VkRenderingInfo pDepthAttachment(@Nullable @NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo value) { npDepthAttachment(address(), value); return this; }
    /** Sets the address of the specified {@link VkRenderingAttachmentInfo} to the {@code pStencilAttachment} field. */
    public VkRenderingInfo pStencilAttachment(@Nullable @NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo value) { npStencilAttachment(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderingInfo set(
        int sType,
        long pNext,
        int flags,
        VkRect2D renderArea,
        int layerCount,
        int viewMask,
        VkRenderingAttachmentInfo.@Nullable Buffer pColorAttachments,
        @Nullable VkRenderingAttachmentInfo pDepthAttachment,
        @Nullable VkRenderingAttachmentInfo pStencilAttachment
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        renderArea(renderArea);
        layerCount(layerCount);
        viewMask(viewMask);
        pColorAttachments(pColorAttachments);
        pDepthAttachment(pDepthAttachment);
        pStencilAttachment(pStencilAttachment);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderingInfo set(VkRenderingInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderingInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderingInfo malloc() {
        return new VkRenderingInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderingInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderingInfo calloc() {
        return new VkRenderingInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderingInfo} instance allocated with {@link BufferUtils}. */
    public static VkRenderingInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderingInfo} instance for the specified memory address. */
    public static VkRenderingInfo create(long address) {
        return new VkRenderingInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderingInfo createSafe(long address) {
        return address == NULL ? null : new VkRenderingInfo(address, null);
    }

    /**
     * Returns a new {@link VkRenderingInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderingInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderingInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderingInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderingInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderingInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingInfo malloc(MemoryStack stack) {
        return new VkRenderingInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderingInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingInfo calloc(MemoryStack stack) {
        return new VkRenderingInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderingInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderingInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderingInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkRenderingInfo.FLAGS); }
    /** Unsafe version of {@link #renderArea}. */
    public static VkRect2D nrenderArea(long struct) { return VkRect2D.create(struct + VkRenderingInfo.RENDERAREA); }
    /** Unsafe version of {@link #layerCount}. */
    public static int nlayerCount(long struct) { return memGetInt(struct + VkRenderingInfo.LAYERCOUNT); }
    /** Unsafe version of {@link #viewMask}. */
    public static int nviewMask(long struct) { return memGetInt(struct + VkRenderingInfo.VIEWMASK); }
    /** Unsafe version of {@link #colorAttachmentCount}. */
    public static int ncolorAttachmentCount(long struct) { return memGetInt(struct + VkRenderingInfo.COLORATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pColorAttachments}. */
    public static VkRenderingAttachmentInfo.@Nullable Buffer npColorAttachments(long struct) { return VkRenderingAttachmentInfo.createSafe(memGetAddress(struct + VkRenderingInfo.PCOLORATTACHMENTS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #pDepthAttachment}. */
    public static @Nullable VkRenderingAttachmentInfo npDepthAttachment(long struct) { return VkRenderingAttachmentInfo.createSafe(memGetAddress(struct + VkRenderingInfo.PDEPTHATTACHMENT)); }
    /** Unsafe version of {@link #pStencilAttachment}. */
    public static @Nullable VkRenderingAttachmentInfo npStencilAttachment(long struct) { return VkRenderingAttachmentInfo.createSafe(memGetAddress(struct + VkRenderingInfo.PSTENCILATTACHMENT)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderingInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderingInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkRenderingInfo.FLAGS, value); }
    /** Unsafe version of {@link #renderArea(VkRect2D) renderArea}. */
    public static void nrenderArea(long struct, VkRect2D value) { memCopy(value.address(), struct + VkRenderingInfo.RENDERAREA, VkRect2D.SIZEOF); }
    /** Unsafe version of {@link #layerCount(int) layerCount}. */
    public static void nlayerCount(long struct, int value) { memPutInt(struct + VkRenderingInfo.LAYERCOUNT, value); }
    /** Unsafe version of {@link #viewMask(int) viewMask}. */
    public static void nviewMask(long struct, int value) { memPutInt(struct + VkRenderingInfo.VIEWMASK, value); }
    /** Sets the specified value to the {@code colorAttachmentCount} field of the specified {@code struct}. */
    public static void ncolorAttachmentCount(long struct, int value) { memPutInt(struct + VkRenderingInfo.COLORATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pColorAttachments(VkRenderingAttachmentInfo.Buffer) pColorAttachments}. */
    public static void npColorAttachments(long struct, VkRenderingAttachmentInfo.@Nullable Buffer value) { memPutAddress(struct + VkRenderingInfo.PCOLORATTACHMENTS, memAddressSafe(value)); ncolorAttachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #pDepthAttachment(VkRenderingAttachmentInfo) pDepthAttachment}. */
    public static void npDepthAttachment(long struct, @Nullable VkRenderingAttachmentInfo value) { memPutAddress(struct + VkRenderingInfo.PDEPTHATTACHMENT, memAddressSafe(value)); }
    /** Unsafe version of {@link #pStencilAttachment(VkRenderingAttachmentInfo) pStencilAttachment}. */
    public static void npStencilAttachment(long struct, @Nullable VkRenderingAttachmentInfo value) { memPutAddress(struct + VkRenderingInfo.PSTENCILATTACHMENT, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ncolorAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderingInfo.PCOLORATTACHMENTS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkRenderingInfo} structs. */
    public static class Buffer extends StructBuffer<VkRenderingInfo, Buffer> implements NativeResource {

        private static final VkRenderingInfo ELEMENT_FACTORY = VkRenderingInfo.create(-1L);

        /**
         * Creates a new {@code VkRenderingInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderingInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderingInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderingInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderingInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkRenderingFlags")
        public int flags() { return VkRenderingInfo.nflags(address()); }
        /** @return a {@link VkRect2D} view of the {@code renderArea} field. */
        public VkRect2D renderArea() { return VkRenderingInfo.nrenderArea(address()); }
        /** @return the value of the {@code layerCount} field. */
        @NativeType("uint32_t")
        public int layerCount() { return VkRenderingInfo.nlayerCount(address()); }
        /** @return the value of the {@code viewMask} field. */
        @NativeType("uint32_t")
        public int viewMask() { return VkRenderingInfo.nviewMask(address()); }
        /** @return the value of the {@code colorAttachmentCount} field. */
        @NativeType("uint32_t")
        public int colorAttachmentCount() { return VkRenderingInfo.ncolorAttachmentCount(address()); }
        /** @return a {@link VkRenderingAttachmentInfo.Buffer} view of the struct array pointed to by the {@code pColorAttachments} field. */
        @NativeType("VkRenderingAttachmentInfo const *")
        public VkRenderingAttachmentInfo.@Nullable Buffer pColorAttachments() { return VkRenderingInfo.npColorAttachments(address()); }
        /** @return a {@link VkRenderingAttachmentInfo} view of the struct pointed to by the {@code pDepthAttachment} field. */
        @NativeType("VkRenderingAttachmentInfo const *")
        public @Nullable VkRenderingAttachmentInfo pDepthAttachment() { return VkRenderingInfo.npDepthAttachment(address()); }
        /** @return a {@link VkRenderingAttachmentInfo} view of the struct pointed to by the {@code pStencilAttachment} field. */
        @NativeType("VkRenderingAttachmentInfo const *")
        public @Nullable VkRenderingAttachmentInfo pStencilAttachment() { return VkRenderingInfo.npStencilAttachment(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderingInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderingInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_RENDERING_INFO STRUCTURE_TYPE_RENDERING_INFO} value to the {@code sType} field. */
        public VkRenderingInfo.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_RENDERING_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderingInfo.Buffer pNext(@NativeType("void const *") long value) { VkRenderingInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDeviceGroupRenderPassBeginInfo} value to the {@code pNext} chain. */
        public VkRenderingInfo.Buffer pNext(VkDeviceGroupRenderPassBeginInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDeviceGroupRenderPassBeginInfoKHR} value to the {@code pNext} chain. */
        public VkRenderingInfo.Buffer pNext(VkDeviceGroupRenderPassBeginInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMultisampledRenderToSingleSampledInfoEXT} value to the {@code pNext} chain. */
        public VkRenderingInfo.Buffer pNext(VkMultisampledRenderToSingleSampledInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMultiviewPerViewAttributesInfoNVX} value to the {@code pNext} chain. */
        public VkRenderingInfo.Buffer pNext(VkMultiviewPerViewAttributesInfoNVX value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM} value to the {@code pNext} chain. */
        public VkRenderingInfo.Buffer pNext(VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassStripeBeginInfoARM} value to the {@code pNext} chain. */
        public VkRenderingInfo.Buffer pNext(VkRenderPassStripeBeginInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderingFragmentDensityMapAttachmentInfoEXT} value to the {@code pNext} chain. */
        public VkRenderingInfo.Buffer pNext(VkRenderingFragmentDensityMapAttachmentInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderingFragmentShadingRateAttachmentInfoKHR} value to the {@code pNext} chain. */
        public VkRenderingInfo.Buffer pNext(VkRenderingFragmentShadingRateAttachmentInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkRenderingInfo.Buffer flags(@NativeType("VkRenderingFlags") int value) { VkRenderingInfo.nflags(address(), value); return this; }
        /** Copies the specified {@link VkRect2D} to the {@code renderArea} field. */
        public VkRenderingInfo.Buffer renderArea(VkRect2D value) { VkRenderingInfo.nrenderArea(address(), value); return this; }
        /** Passes the {@code renderArea} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkRenderingInfo.Buffer renderArea(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(renderArea()); return this; }
        /** Sets the specified value to the {@code layerCount} field. */
        public VkRenderingInfo.Buffer layerCount(@NativeType("uint32_t") int value) { VkRenderingInfo.nlayerCount(address(), value); return this; }
        /** Sets the specified value to the {@code viewMask} field. */
        public VkRenderingInfo.Buffer viewMask(@NativeType("uint32_t") int value) { VkRenderingInfo.nviewMask(address(), value); return this; }
        /** Sets the address of the specified {@link VkRenderingAttachmentInfo.Buffer} to the {@code pColorAttachments} field. */
        public VkRenderingInfo.Buffer pColorAttachments(@NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo.@Nullable Buffer value) { VkRenderingInfo.npColorAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkRenderingAttachmentInfo} to the {@code pDepthAttachment} field. */
        public VkRenderingInfo.Buffer pDepthAttachment(@Nullable @NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo value) { VkRenderingInfo.npDepthAttachment(address(), value); return this; }
        /** Sets the address of the specified {@link VkRenderingAttachmentInfo} to the {@code pStencilAttachment} field. */
        public VkRenderingInfo.Buffer pStencilAttachment(@Nullable @NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo value) { VkRenderingInfo.npStencilAttachment(address(), value); return this; }

    }

}