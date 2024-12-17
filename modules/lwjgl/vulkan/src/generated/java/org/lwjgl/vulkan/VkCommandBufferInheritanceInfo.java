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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkCommandBufferInheritanceInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkRenderPass renderPass;
 *     uint32_t subpass;
 *     VkFramebuffer framebuffer;
 *     VkBool32 occlusionQueryEnable;
 *     VkQueryControlFlags queryFlags;
 *     VkQueryPipelineStatisticFlags pipelineStatistics;
 * }}</pre>
 */
public class VkCommandBufferInheritanceInfo extends Struct<VkCommandBufferInheritanceInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RENDERPASS,
        SUBPASS,
        FRAMEBUFFER,
        OCCLUSIONQUERYENABLE,
        QUERYFLAGS,
        PIPELINESTATISTICS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RENDERPASS = layout.offsetof(2);
        SUBPASS = layout.offsetof(3);
        FRAMEBUFFER = layout.offsetof(4);
        OCCLUSIONQUERYENABLE = layout.offsetof(5);
        QUERYFLAGS = layout.offsetof(6);
        PIPELINESTATISTICS = layout.offsetof(7);
    }

    protected VkCommandBufferInheritanceInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCommandBufferInheritanceInfo create(long address, @Nullable ByteBuffer container) {
        return new VkCommandBufferInheritanceInfo(address, container);
    }

    /**
     * Creates a {@code VkCommandBufferInheritanceInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCommandBufferInheritanceInfo(ByteBuffer container) {
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
    /** @return the value of the {@code renderPass} field. */
    @NativeType("VkRenderPass")
    public long renderPass() { return nrenderPass(address()); }
    /** @return the value of the {@code subpass} field. */
    @NativeType("uint32_t")
    public int subpass() { return nsubpass(address()); }
    /** @return the value of the {@code framebuffer} field. */
    @NativeType("VkFramebuffer")
    public long framebuffer() { return nframebuffer(address()); }
    /** @return the value of the {@code occlusionQueryEnable} field. */
    @NativeType("VkBool32")
    public boolean occlusionQueryEnable() { return nocclusionQueryEnable(address()) != 0; }
    /** @return the value of the {@code queryFlags} field. */
    @NativeType("VkQueryControlFlags")
    public int queryFlags() { return nqueryFlags(address()); }
    /** @return the value of the {@code pipelineStatistics} field. */
    @NativeType("VkQueryPipelineStatisticFlags")
    public int pipelineStatistics() { return npipelineStatistics(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCommandBufferInheritanceInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO} value to the {@code sType} field. */
    public VkCommandBufferInheritanceInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCommandBufferInheritanceInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkAttachmentSampleCountInfoAMD} value to the {@code pNext} chain. */
    public VkCommandBufferInheritanceInfo pNext(VkAttachmentSampleCountInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkAttachmentSampleCountInfoNV} value to the {@code pNext} chain. */
    public VkCommandBufferInheritanceInfo pNext(VkAttachmentSampleCountInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT} value to the {@code pNext} chain. */
    public VkCommandBufferInheritanceInfo pNext(VkCommandBufferInheritanceConditionalRenderingInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM} value to the {@code pNext} chain. */
    public VkCommandBufferInheritanceInfo pNext(VkCommandBufferInheritanceRenderPassTransformInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkCommandBufferInheritanceRenderingInfo} value to the {@code pNext} chain. */
    public VkCommandBufferInheritanceInfo pNext(VkCommandBufferInheritanceRenderingInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkCommandBufferInheritanceRenderingInfoKHR} value to the {@code pNext} chain. */
    public VkCommandBufferInheritanceInfo pNext(VkCommandBufferInheritanceRenderingInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkCommandBufferInheritanceViewportScissorInfoNV} value to the {@code pNext} chain. */
    public VkCommandBufferInheritanceInfo pNext(VkCommandBufferInheritanceViewportScissorInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExternalFormatANDROID} value to the {@code pNext} chain. */
    public VkCommandBufferInheritanceInfo pNext(VkExternalFormatANDROID value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMultiviewPerViewAttributesInfoNVX} value to the {@code pNext} chain. */
    public VkCommandBufferInheritanceInfo pNext(VkMultiviewPerViewAttributesInfoNVX value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderingAttachmentLocationInfo} value to the {@code pNext} chain. */
    public VkCommandBufferInheritanceInfo pNext(VkRenderingAttachmentLocationInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderingAttachmentLocationInfoKHR} value to the {@code pNext} chain. */
    public VkCommandBufferInheritanceInfo pNext(VkRenderingAttachmentLocationInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderingInputAttachmentIndexInfo} value to the {@code pNext} chain. */
    public VkCommandBufferInheritanceInfo pNext(VkRenderingInputAttachmentIndexInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderingInputAttachmentIndexInfoKHR} value to the {@code pNext} chain. */
    public VkCommandBufferInheritanceInfo pNext(VkRenderingInputAttachmentIndexInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code renderPass} field. */
    public VkCommandBufferInheritanceInfo renderPass(@NativeType("VkRenderPass") long value) { nrenderPass(address(), value); return this; }
    /** Sets the specified value to the {@code subpass} field. */
    public VkCommandBufferInheritanceInfo subpass(@NativeType("uint32_t") int value) { nsubpass(address(), value); return this; }
    /** Sets the specified value to the {@code framebuffer} field. */
    public VkCommandBufferInheritanceInfo framebuffer(@NativeType("VkFramebuffer") long value) { nframebuffer(address(), value); return this; }
    /** Sets the specified value to the {@code occlusionQueryEnable} field. */
    public VkCommandBufferInheritanceInfo occlusionQueryEnable(@NativeType("VkBool32") boolean value) { nocclusionQueryEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code queryFlags} field. */
    public VkCommandBufferInheritanceInfo queryFlags(@NativeType("VkQueryControlFlags") int value) { nqueryFlags(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineStatistics} field. */
    public VkCommandBufferInheritanceInfo pipelineStatistics(@NativeType("VkQueryPipelineStatisticFlags") int value) { npipelineStatistics(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCommandBufferInheritanceInfo set(
        int sType,
        long pNext,
        long renderPass,
        int subpass,
        long framebuffer,
        boolean occlusionQueryEnable,
        int queryFlags,
        int pipelineStatistics
    ) {
        sType(sType);
        pNext(pNext);
        renderPass(renderPass);
        subpass(subpass);
        framebuffer(framebuffer);
        occlusionQueryEnable(occlusionQueryEnable);
        queryFlags(queryFlags);
        pipelineStatistics(pipelineStatistics);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCommandBufferInheritanceInfo set(VkCommandBufferInheritanceInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandBufferInheritanceInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceInfo malloc() {
        return new VkCommandBufferInheritanceInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCommandBufferInheritanceInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceInfo calloc() {
        return new VkCommandBufferInheritanceInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCommandBufferInheritanceInfo} instance allocated with {@link BufferUtils}. */
    public static VkCommandBufferInheritanceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandBufferInheritanceInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkCommandBufferInheritanceInfo} instance for the specified memory address. */
    public static VkCommandBufferInheritanceInfo create(long address) {
        return new VkCommandBufferInheritanceInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCommandBufferInheritanceInfo createSafe(long address) {
        return address == NULL ? null : new VkCommandBufferInheritanceInfo(address, null);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCommandBufferInheritanceInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCommandBufferInheritanceInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferInheritanceInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferInheritanceInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferInheritanceInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferInheritanceInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferInheritanceInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferInheritanceInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferInheritanceInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferInheritanceInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkCommandBufferInheritanceInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceInfo malloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCommandBufferInheritanceInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceInfo calloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCommandBufferInheritanceInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCommandBufferInheritanceInfo.PNEXT); }
    /** Unsafe version of {@link #renderPass}. */
    public static long nrenderPass(long struct) { return memGetLong(struct + VkCommandBufferInheritanceInfo.RENDERPASS); }
    /** Unsafe version of {@link #subpass}. */
    public static int nsubpass(long struct) { return memGetInt(struct + VkCommandBufferInheritanceInfo.SUBPASS); }
    /** Unsafe version of {@link #framebuffer}. */
    public static long nframebuffer(long struct) { return memGetLong(struct + VkCommandBufferInheritanceInfo.FRAMEBUFFER); }
    /** Unsafe version of {@link #occlusionQueryEnable}. */
    public static int nocclusionQueryEnable(long struct) { return memGetInt(struct + VkCommandBufferInheritanceInfo.OCCLUSIONQUERYENABLE); }
    /** Unsafe version of {@link #queryFlags}. */
    public static int nqueryFlags(long struct) { return memGetInt(struct + VkCommandBufferInheritanceInfo.QUERYFLAGS); }
    /** Unsafe version of {@link #pipelineStatistics}. */
    public static int npipelineStatistics(long struct) { return memGetInt(struct + VkCommandBufferInheritanceInfo.PIPELINESTATISTICS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandBufferInheritanceInfo.PNEXT, value); }
    /** Unsafe version of {@link #renderPass(long) renderPass}. */
    public static void nrenderPass(long struct, long value) { memPutLong(struct + VkCommandBufferInheritanceInfo.RENDERPASS, value); }
    /** Unsafe version of {@link #subpass(int) subpass}. */
    public static void nsubpass(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceInfo.SUBPASS, value); }
    /** Unsafe version of {@link #framebuffer(long) framebuffer}. */
    public static void nframebuffer(long struct, long value) { memPutLong(struct + VkCommandBufferInheritanceInfo.FRAMEBUFFER, value); }
    /** Unsafe version of {@link #occlusionQueryEnable(boolean) occlusionQueryEnable}. */
    public static void nocclusionQueryEnable(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceInfo.OCCLUSIONQUERYENABLE, value); }
    /** Unsafe version of {@link #queryFlags(int) queryFlags}. */
    public static void nqueryFlags(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceInfo.QUERYFLAGS, value); }
    /** Unsafe version of {@link #pipelineStatistics(int) pipelineStatistics}. */
    public static void npipelineStatistics(long struct, int value) { memPutInt(struct + VkCommandBufferInheritanceInfo.PIPELINESTATISTICS, value); }

    // -----------------------------------

    /** An array of {@link VkCommandBufferInheritanceInfo} structs. */
    public static class Buffer extends StructBuffer<VkCommandBufferInheritanceInfo, Buffer> implements NativeResource {

        private static final VkCommandBufferInheritanceInfo ELEMENT_FACTORY = VkCommandBufferInheritanceInfo.create(-1L);

        /**
         * Creates a new {@code VkCommandBufferInheritanceInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandBufferInheritanceInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCommandBufferInheritanceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCommandBufferInheritanceInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCommandBufferInheritanceInfo.npNext(address()); }
        /** @return the value of the {@code renderPass} field. */
        @NativeType("VkRenderPass")
        public long renderPass() { return VkCommandBufferInheritanceInfo.nrenderPass(address()); }
        /** @return the value of the {@code subpass} field. */
        @NativeType("uint32_t")
        public int subpass() { return VkCommandBufferInheritanceInfo.nsubpass(address()); }
        /** @return the value of the {@code framebuffer} field. */
        @NativeType("VkFramebuffer")
        public long framebuffer() { return VkCommandBufferInheritanceInfo.nframebuffer(address()); }
        /** @return the value of the {@code occlusionQueryEnable} field. */
        @NativeType("VkBool32")
        public boolean occlusionQueryEnable() { return VkCommandBufferInheritanceInfo.nocclusionQueryEnable(address()) != 0; }
        /** @return the value of the {@code queryFlags} field. */
        @NativeType("VkQueryControlFlags")
        public int queryFlags() { return VkCommandBufferInheritanceInfo.nqueryFlags(address()); }
        /** @return the value of the {@code pipelineStatistics} field. */
        @NativeType("VkQueryPipelineStatisticFlags")
        public int pipelineStatistics() { return VkCommandBufferInheritanceInfo.npipelineStatistics(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCommandBufferInheritanceInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandBufferInheritanceInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO} value to the {@code sType} field. */
        public VkCommandBufferInheritanceInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCommandBufferInheritanceInfo.Buffer pNext(@NativeType("void const *") long value) { VkCommandBufferInheritanceInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkAttachmentSampleCountInfoAMD} value to the {@code pNext} chain. */
        public VkCommandBufferInheritanceInfo.Buffer pNext(VkAttachmentSampleCountInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkAttachmentSampleCountInfoNV} value to the {@code pNext} chain. */
        public VkCommandBufferInheritanceInfo.Buffer pNext(VkAttachmentSampleCountInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT} value to the {@code pNext} chain. */
        public VkCommandBufferInheritanceInfo.Buffer pNext(VkCommandBufferInheritanceConditionalRenderingInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM} value to the {@code pNext} chain. */
        public VkCommandBufferInheritanceInfo.Buffer pNext(VkCommandBufferInheritanceRenderPassTransformInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkCommandBufferInheritanceRenderingInfo} value to the {@code pNext} chain. */
        public VkCommandBufferInheritanceInfo.Buffer pNext(VkCommandBufferInheritanceRenderingInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkCommandBufferInheritanceRenderingInfoKHR} value to the {@code pNext} chain. */
        public VkCommandBufferInheritanceInfo.Buffer pNext(VkCommandBufferInheritanceRenderingInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkCommandBufferInheritanceViewportScissorInfoNV} value to the {@code pNext} chain. */
        public VkCommandBufferInheritanceInfo.Buffer pNext(VkCommandBufferInheritanceViewportScissorInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExternalFormatANDROID} value to the {@code pNext} chain. */
        public VkCommandBufferInheritanceInfo.Buffer pNext(VkExternalFormatANDROID value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMultiviewPerViewAttributesInfoNVX} value to the {@code pNext} chain. */
        public VkCommandBufferInheritanceInfo.Buffer pNext(VkMultiviewPerViewAttributesInfoNVX value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderingAttachmentLocationInfo} value to the {@code pNext} chain. */
        public VkCommandBufferInheritanceInfo.Buffer pNext(VkRenderingAttachmentLocationInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderingAttachmentLocationInfoKHR} value to the {@code pNext} chain. */
        public VkCommandBufferInheritanceInfo.Buffer pNext(VkRenderingAttachmentLocationInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderingInputAttachmentIndexInfo} value to the {@code pNext} chain. */
        public VkCommandBufferInheritanceInfo.Buffer pNext(VkRenderingInputAttachmentIndexInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderingInputAttachmentIndexInfoKHR} value to the {@code pNext} chain. */
        public VkCommandBufferInheritanceInfo.Buffer pNext(VkRenderingInputAttachmentIndexInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code renderPass} field. */
        public VkCommandBufferInheritanceInfo.Buffer renderPass(@NativeType("VkRenderPass") long value) { VkCommandBufferInheritanceInfo.nrenderPass(address(), value); return this; }
        /** Sets the specified value to the {@code subpass} field. */
        public VkCommandBufferInheritanceInfo.Buffer subpass(@NativeType("uint32_t") int value) { VkCommandBufferInheritanceInfo.nsubpass(address(), value); return this; }
        /** Sets the specified value to the {@code framebuffer} field. */
        public VkCommandBufferInheritanceInfo.Buffer framebuffer(@NativeType("VkFramebuffer") long value) { VkCommandBufferInheritanceInfo.nframebuffer(address(), value); return this; }
        /** Sets the specified value to the {@code occlusionQueryEnable} field. */
        public VkCommandBufferInheritanceInfo.Buffer occlusionQueryEnable(@NativeType("VkBool32") boolean value) { VkCommandBufferInheritanceInfo.nocclusionQueryEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code queryFlags} field. */
        public VkCommandBufferInheritanceInfo.Buffer queryFlags(@NativeType("VkQueryControlFlags") int value) { VkCommandBufferInheritanceInfo.nqueryFlags(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineStatistics} field. */
        public VkCommandBufferInheritanceInfo.Buffer pipelineStatistics(@NativeType("VkQueryPipelineStatisticFlags") int value) { VkCommandBufferInheritanceInfo.npipelineStatistics(address(), value); return this; }

    }

}