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
 * Structure specifying command buffer inheritance information.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@code VkCommandBuffer} will not be executed within a render pass instance, or if the render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, {@code renderPass}, {@code subpass}, and {@code framebuffer} are ignored.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-inheritedQueries">inherited queries</a> feature is not enabled, {@code occlusionQueryEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-inheritedQueries">inherited queries</a> feature is enabled, {@code queryFlags} <b>must</b> be a valid combination of {@code VkQueryControlFlagBits} values</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-inheritedQueries">inherited queries</a> feature is not enabled, {@code queryFlags} <b>must</b> be 0</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineStatisticsQuery">pipeline statistics queries</a> feature is enabled, {@code pipelineStatistics} <b>must</b> be a valid combination of {@code VkQueryPipelineStatisticFlagBits} values</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineStatisticsQuery">pipeline statistics queries</a> feature is not enabled, {@code pipelineStatistics} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkAttachmentSampleCountInfoAMD}, {@link VkCommandBufferInheritanceConditionalRenderingInfoEXT}, {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM}, {@link VkCommandBufferInheritanceRenderingInfo}, {@link VkCommandBufferInheritanceViewportScissorInfoNV}, or {@link VkMultiviewPerViewAttributesInfoNVX}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>Both of {@code framebuffer}, and {@code renderPass} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkCommandBufferBeginInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCommandBufferInheritanceInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkRenderPass {@link #renderPass};
 *     uint32_t {@link #subpass};
 *     VkFramebuffer {@link #framebuffer};
 *     VkBool32 {@link #occlusionQueryEnable};
 *     VkQueryControlFlags {@link #queryFlags};
 *     VkQueryPipelineStatisticFlags {@link #pipelineStatistics};
 * }</code></pre>
 */
public class VkCommandBufferInheritanceInfo extends Struct implements NativeResource {

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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkRenderPass} object defining which render passes the {@code VkCommandBuffer} will be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-compatibility">compatible</a> with and <b>can</b> be executed within. */
    @NativeType("VkRenderPass")
    public long renderPass() { return nrenderPass(address()); }
    /** the index of the subpass within the render pass instance that the {@code VkCommandBuffer} will be executed within. */
    @NativeType("uint32_t")
    public int subpass() { return nsubpass(address()); }
    /**
     * <b>can</b> refer to the {@code VkFramebuffer} object that the {@code VkCommandBuffer} will be rendering to if it is executed within a render pass instance. It <b>can</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE} if the framebuffer is not known.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Specifying the exact framebuffer that the secondary command buffer will be executed with <b>may</b> result in better performance at command buffer execution time.</p>
     * </div>
     */
    @NativeType("VkFramebuffer")
    public long framebuffer() { return nframebuffer(address()); }
    /** specifies whether the command buffer <b>can</b> be executed while an occlusion query is active in the primary command buffer. If this is {@link VK10#VK_TRUE TRUE}, then this command buffer <b>can</b> be executed whether the primary command buffer has an occlusion query active or not. If this is {@link VK10#VK_FALSE FALSE}, then the primary command buffer <b>must</b> not have an occlusion query active. */
    @NativeType("VkBool32")
    public boolean occlusionQueryEnable() { return nocclusionQueryEnable(address()) != 0; }
    /** specifies the query flags that <b>can</b> be used by an active occlusion query in the primary command buffer when this secondary command buffer is executed. If this value includes the {@link VK10#VK_QUERY_CONTROL_PRECISE_BIT QUERY_CONTROL_PRECISE_BIT} bit, then the active query <b>can</b> return boolean results or actual sample counts. If this bit is not set, then the active query <b>must</b> not use the {@link VK10#VK_QUERY_CONTROL_PRECISE_BIT QUERY_CONTROL_PRECISE_BIT} bit. */
    @NativeType("VkQueryControlFlags")
    public int queryFlags() { return nqueryFlags(address()); }
    /** a bitmask of {@code VkQueryPipelineStatisticFlagBits} specifying the set of pipeline statistics that <b>can</b> be counted by an active query in the primary command buffer when this secondary command buffer is executed. If this value includes a given bit, then this command buffer <b>can</b> be executed whether the primary command buffer has a pipeline statistics query active that includes this bit or not. If this value excludes a given bit, then the active pipeline statistics query <b>must</b> not be from a query pool that counts that statistic. */
    @NativeType("VkQueryPipelineStatisticFlags")
    public int pipelineStatistics() { return npipelineStatistics(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCommandBufferInheritanceInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO} value to the {@link #sType} field. */
    public VkCommandBufferInheritanceInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
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
    /** Prepends the specified {@link VkMultiviewPerViewAttributesInfoNVX} value to the {@code pNext} chain. */
    public VkCommandBufferInheritanceInfo pNext(VkMultiviewPerViewAttributesInfoNVX value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #renderPass} field. */
    public VkCommandBufferInheritanceInfo renderPass(@NativeType("VkRenderPass") long value) { nrenderPass(address(), value); return this; }
    /** Sets the specified value to the {@link #subpass} field. */
    public VkCommandBufferInheritanceInfo subpass(@NativeType("uint32_t") int value) { nsubpass(address(), value); return this; }
    /** Sets the specified value to the {@link #framebuffer} field. */
    public VkCommandBufferInheritanceInfo framebuffer(@NativeType("VkFramebuffer") long value) { nframebuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #occlusionQueryEnable} field. */
    public VkCommandBufferInheritanceInfo occlusionQueryEnable(@NativeType("VkBool32") boolean value) { nocclusionQueryEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #queryFlags} field. */
    public VkCommandBufferInheritanceInfo queryFlags(@NativeType("VkQueryControlFlags") int value) { nqueryFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #pipelineStatistics} field. */
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
        return wrap(VkCommandBufferInheritanceInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCommandBufferInheritanceInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceInfo calloc() {
        return wrap(VkCommandBufferInheritanceInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCommandBufferInheritanceInfo} instance allocated with {@link BufferUtils}. */
    public static VkCommandBufferInheritanceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCommandBufferInheritanceInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCommandBufferInheritanceInfo} instance for the specified memory address. */
    public static VkCommandBufferInheritanceInfo create(long address) {
        return wrap(VkCommandBufferInheritanceInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferInheritanceInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkCommandBufferInheritanceInfo.class, address);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCommandBufferInheritanceInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferInheritanceInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
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
        return wrap(VkCommandBufferInheritanceInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCommandBufferInheritanceInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceInfo calloc(MemoryStack stack) {
        return wrap(VkCommandBufferInheritanceInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCommandBufferInheritanceInfo.PNEXT); }
    /** Unsafe version of {@link #renderPass}. */
    public static long nrenderPass(long struct) { return UNSAFE.getLong(null, struct + VkCommandBufferInheritanceInfo.RENDERPASS); }
    /** Unsafe version of {@link #subpass}. */
    public static int nsubpass(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceInfo.SUBPASS); }
    /** Unsafe version of {@link #framebuffer}. */
    public static long nframebuffer(long struct) { return UNSAFE.getLong(null, struct + VkCommandBufferInheritanceInfo.FRAMEBUFFER); }
    /** Unsafe version of {@link #occlusionQueryEnable}. */
    public static int nocclusionQueryEnable(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceInfo.OCCLUSIONQUERYENABLE); }
    /** Unsafe version of {@link #queryFlags}. */
    public static int nqueryFlags(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceInfo.QUERYFLAGS); }
    /** Unsafe version of {@link #pipelineStatistics}. */
    public static int npipelineStatistics(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferInheritanceInfo.PIPELINESTATISTICS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandBufferInheritanceInfo.PNEXT, value); }
    /** Unsafe version of {@link #renderPass(long) renderPass}. */
    public static void nrenderPass(long struct, long value) { UNSAFE.putLong(null, struct + VkCommandBufferInheritanceInfo.RENDERPASS, value); }
    /** Unsafe version of {@link #subpass(int) subpass}. */
    public static void nsubpass(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceInfo.SUBPASS, value); }
    /** Unsafe version of {@link #framebuffer(long) framebuffer}. */
    public static void nframebuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkCommandBufferInheritanceInfo.FRAMEBUFFER, value); }
    /** Unsafe version of {@link #occlusionQueryEnable(boolean) occlusionQueryEnable}. */
    public static void nocclusionQueryEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceInfo.OCCLUSIONQUERYENABLE, value); }
    /** Unsafe version of {@link #queryFlags(int) queryFlags}. */
    public static void nqueryFlags(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceInfo.QUERYFLAGS, value); }
    /** Unsafe version of {@link #pipelineStatistics(int) pipelineStatistics}. */
    public static void npipelineStatistics(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferInheritanceInfo.PIPELINESTATISTICS, value); }

    // -----------------------------------

    /** An array of {@link VkCommandBufferInheritanceInfo} structs. */
    public static class Buffer extends StructBuffer<VkCommandBufferInheritanceInfo, Buffer> implements NativeResource {

        private static final VkCommandBufferInheritanceInfo ELEMENT_FACTORY = VkCommandBufferInheritanceInfo.create(-1L);

        /**
         * Creates a new {@code VkCommandBufferInheritanceInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandBufferInheritanceInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkCommandBufferInheritanceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCommandBufferInheritanceInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCommandBufferInheritanceInfo.nsType(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCommandBufferInheritanceInfo.npNext(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceInfo#renderPass} field. */
        @NativeType("VkRenderPass")
        public long renderPass() { return VkCommandBufferInheritanceInfo.nrenderPass(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceInfo#subpass} field. */
        @NativeType("uint32_t")
        public int subpass() { return VkCommandBufferInheritanceInfo.nsubpass(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceInfo#framebuffer} field. */
        @NativeType("VkFramebuffer")
        public long framebuffer() { return VkCommandBufferInheritanceInfo.nframebuffer(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceInfo#occlusionQueryEnable} field. */
        @NativeType("VkBool32")
        public boolean occlusionQueryEnable() { return VkCommandBufferInheritanceInfo.nocclusionQueryEnable(address()) != 0; }
        /** @return the value of the {@link VkCommandBufferInheritanceInfo#queryFlags} field. */
        @NativeType("VkQueryControlFlags")
        public int queryFlags() { return VkCommandBufferInheritanceInfo.nqueryFlags(address()); }
        /** @return the value of the {@link VkCommandBufferInheritanceInfo#pipelineStatistics} field. */
        @NativeType("VkQueryPipelineStatisticFlags")
        public int pipelineStatistics() { return VkCommandBufferInheritanceInfo.npipelineStatistics(address()); }

        /** Sets the specified value to the {@link VkCommandBufferInheritanceInfo#sType} field. */
        public VkCommandBufferInheritanceInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandBufferInheritanceInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO} value to the {@link VkCommandBufferInheritanceInfo#sType} field. */
        public VkCommandBufferInheritanceInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO); }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceInfo#pNext} field. */
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
        /** Prepends the specified {@link VkMultiviewPerViewAttributesInfoNVX} value to the {@code pNext} chain. */
        public VkCommandBufferInheritanceInfo.Buffer pNext(VkMultiviewPerViewAttributesInfoNVX value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceInfo#renderPass} field. */
        public VkCommandBufferInheritanceInfo.Buffer renderPass(@NativeType("VkRenderPass") long value) { VkCommandBufferInheritanceInfo.nrenderPass(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceInfo#subpass} field. */
        public VkCommandBufferInheritanceInfo.Buffer subpass(@NativeType("uint32_t") int value) { VkCommandBufferInheritanceInfo.nsubpass(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceInfo#framebuffer} field. */
        public VkCommandBufferInheritanceInfo.Buffer framebuffer(@NativeType("VkFramebuffer") long value) { VkCommandBufferInheritanceInfo.nframebuffer(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceInfo#occlusionQueryEnable} field. */
        public VkCommandBufferInheritanceInfo.Buffer occlusionQueryEnable(@NativeType("VkBool32") boolean value) { VkCommandBufferInheritanceInfo.nocclusionQueryEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceInfo#queryFlags} field. */
        public VkCommandBufferInheritanceInfo.Buffer queryFlags(@NativeType("VkQueryControlFlags") int value) { VkCommandBufferInheritanceInfo.nqueryFlags(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferInheritanceInfo#pipelineStatistics} field. */
        public VkCommandBufferInheritanceInfo.Buffer pipelineStatistics(@NativeType("VkQueryPipelineStatisticFlags") int value) { VkCommandBufferInheritanceInfo.npipelineStatistics(address(), value); return this; }

    }

}