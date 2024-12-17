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
 * struct VkGraphicsPipelineCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineCreateFlags flags;
 *     uint32_t stageCount;
 *     {@link VkPipelineShaderStageCreateInfo VkPipelineShaderStageCreateInfo} const * pStages;
 *     {@link VkPipelineVertexInputStateCreateInfo VkPipelineVertexInputStateCreateInfo} const * pVertexInputState;
 *     {@link VkPipelineInputAssemblyStateCreateInfo VkPipelineInputAssemblyStateCreateInfo} const * pInputAssemblyState;
 *     {@link VkPipelineTessellationStateCreateInfo VkPipelineTessellationStateCreateInfo} const * pTessellationState;
 *     {@link VkPipelineViewportStateCreateInfo VkPipelineViewportStateCreateInfo} const * pViewportState;
 *     {@link VkPipelineRasterizationStateCreateInfo VkPipelineRasterizationStateCreateInfo} const * pRasterizationState;
 *     {@link VkPipelineMultisampleStateCreateInfo VkPipelineMultisampleStateCreateInfo} const * pMultisampleState;
 *     {@link VkPipelineDepthStencilStateCreateInfo VkPipelineDepthStencilStateCreateInfo} const * pDepthStencilState;
 *     {@link VkPipelineColorBlendStateCreateInfo VkPipelineColorBlendStateCreateInfo} const * pColorBlendState;
 *     {@link VkPipelineDynamicStateCreateInfo VkPipelineDynamicStateCreateInfo} const * pDynamicState;
 *     VkPipelineLayout layout;
 *     VkRenderPass renderPass;
 *     uint32_t subpass;
 *     VkPipeline basePipelineHandle;
 *     int32_t basePipelineIndex;
 * }}</pre>
 */
public class VkGraphicsPipelineCreateInfo extends Struct<VkGraphicsPipelineCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        STAGECOUNT,
        PSTAGES,
        PVERTEXINPUTSTATE,
        PINPUTASSEMBLYSTATE,
        PTESSELLATIONSTATE,
        PVIEWPORTSTATE,
        PRASTERIZATIONSTATE,
        PMULTISAMPLESTATE,
        PDEPTHSTENCILSTATE,
        PCOLORBLENDSTATE,
        PDYNAMICSTATE,
        LAYOUT,
        RENDERPASS,
        SUBPASS,
        BASEPIPELINEHANDLE,
        BASEPIPELINEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        STAGECOUNT = layout.offsetof(3);
        PSTAGES = layout.offsetof(4);
        PVERTEXINPUTSTATE = layout.offsetof(5);
        PINPUTASSEMBLYSTATE = layout.offsetof(6);
        PTESSELLATIONSTATE = layout.offsetof(7);
        PVIEWPORTSTATE = layout.offsetof(8);
        PRASTERIZATIONSTATE = layout.offsetof(9);
        PMULTISAMPLESTATE = layout.offsetof(10);
        PDEPTHSTENCILSTATE = layout.offsetof(11);
        PCOLORBLENDSTATE = layout.offsetof(12);
        PDYNAMICSTATE = layout.offsetof(13);
        LAYOUT = layout.offsetof(14);
        RENDERPASS = layout.offsetof(15);
        SUBPASS = layout.offsetof(16);
        BASEPIPELINEHANDLE = layout.offsetof(17);
        BASEPIPELINEINDEX = layout.offsetof(18);
    }

    protected VkGraphicsPipelineCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGraphicsPipelineCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkGraphicsPipelineCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkGraphicsPipelineCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGraphicsPipelineCreateInfo(ByteBuffer container) {
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
    @NativeType("VkPipelineCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code stageCount} field. */
    @NativeType("uint32_t")
    public int stageCount() { return nstageCount(address()); }
    /** @return a {@link VkPipelineShaderStageCreateInfo.Buffer} view of the struct array pointed to by the {@code pStages} field. */
    @NativeType("VkPipelineShaderStageCreateInfo const *")
    public VkPipelineShaderStageCreateInfo.@Nullable Buffer pStages() { return npStages(address()); }
    /** @return a {@link VkPipelineVertexInputStateCreateInfo} view of the struct pointed to by the {@code pVertexInputState} field. */
    @NativeType("VkPipelineVertexInputStateCreateInfo const *")
    public @Nullable VkPipelineVertexInputStateCreateInfo pVertexInputState() { return npVertexInputState(address()); }
    /** @return a {@link VkPipelineInputAssemblyStateCreateInfo} view of the struct pointed to by the {@code pInputAssemblyState} field. */
    @NativeType("VkPipelineInputAssemblyStateCreateInfo const *")
    public @Nullable VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState() { return npInputAssemblyState(address()); }
    /** @return a {@link VkPipelineTessellationStateCreateInfo} view of the struct pointed to by the {@code pTessellationState} field. */
    @NativeType("VkPipelineTessellationStateCreateInfo const *")
    public @Nullable VkPipelineTessellationStateCreateInfo pTessellationState() { return npTessellationState(address()); }
    /** @return a {@link VkPipelineViewportStateCreateInfo} view of the struct pointed to by the {@code pViewportState} field. */
    @NativeType("VkPipelineViewportStateCreateInfo const *")
    public @Nullable VkPipelineViewportStateCreateInfo pViewportState() { return npViewportState(address()); }
    /** @return a {@link VkPipelineRasterizationStateCreateInfo} view of the struct pointed to by the {@code pRasterizationState} field. */
    @NativeType("VkPipelineRasterizationStateCreateInfo const *")
    public @Nullable VkPipelineRasterizationStateCreateInfo pRasterizationState() { return npRasterizationState(address()); }
    /** @return a {@link VkPipelineMultisampleStateCreateInfo} view of the struct pointed to by the {@code pMultisampleState} field. */
    @NativeType("VkPipelineMultisampleStateCreateInfo const *")
    public @Nullable VkPipelineMultisampleStateCreateInfo pMultisampleState() { return npMultisampleState(address()); }
    /** @return a {@link VkPipelineDepthStencilStateCreateInfo} view of the struct pointed to by the {@code pDepthStencilState} field. */
    @NativeType("VkPipelineDepthStencilStateCreateInfo const *")
    public @Nullable VkPipelineDepthStencilStateCreateInfo pDepthStencilState() { return npDepthStencilState(address()); }
    /** @return a {@link VkPipelineColorBlendStateCreateInfo} view of the struct pointed to by the {@code pColorBlendState} field. */
    @NativeType("VkPipelineColorBlendStateCreateInfo const *")
    public @Nullable VkPipelineColorBlendStateCreateInfo pColorBlendState() { return npColorBlendState(address()); }
    /** @return a {@link VkPipelineDynamicStateCreateInfo} view of the struct pointed to by the {@code pDynamicState} field. */
    @NativeType("VkPipelineDynamicStateCreateInfo const *")
    public @Nullable VkPipelineDynamicStateCreateInfo pDynamicState() { return npDynamicState(address()); }
    /** @return the value of the {@code layout} field. */
    @NativeType("VkPipelineLayout")
    public long layout() { return nlayout(address()); }
    /** @return the value of the {@code renderPass} field. */
    @NativeType("VkRenderPass")
    public long renderPass() { return nrenderPass(address()); }
    /** @return the value of the {@code subpass} field. */
    @NativeType("uint32_t")
    public int subpass() { return nsubpass(address()); }
    /** @return the value of the {@code basePipelineHandle} field. */
    @NativeType("VkPipeline")
    public long basePipelineHandle() { return nbasePipelineHandle(address()); }
    /** @return the value of the {@code basePipelineIndex} field. */
    @NativeType("int32_t")
    public int basePipelineIndex() { return nbasePipelineIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkGraphicsPipelineCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO} value to the {@code sType} field. */
    public VkGraphicsPipelineCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkGraphicsPipelineCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkAttachmentSampleCountInfoAMD} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkAttachmentSampleCountInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkAttachmentSampleCountInfoNV} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkAttachmentSampleCountInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExternalFormatANDROID} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkExternalFormatANDROID value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkGraphicsPipelineLibraryCreateInfoEXT} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkGraphicsPipelineLibraryCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkGraphicsPipelineShaderGroupsCreateInfoNV} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkGraphicsPipelineShaderGroupsCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMultiviewPerViewAttributesInfoNVX} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkMultiviewPerViewAttributesInfoNVX value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineBinaryInfoKHR} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineBinaryInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCompilerControlCreateInfoAMD} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineCompilerControlCreateInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreateFlags2CreateInfo} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineCreateFlags2CreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreateFlags2CreateInfoKHR} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineCreateFlags2CreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineDiscardRectangleStateCreateInfoEXT} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineDiscardRectangleStateCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineFragmentShadingRateEnumStateCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineFragmentShadingRateStateCreateInfoKHR} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineFragmentShadingRateStateCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineLibraryCreateInfoKHR} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineLibraryCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineRenderingCreateInfo} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineRenderingCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineRenderingCreateInfoKHR} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineRenderingCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineRepresentativeFragmentTestStateCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineRobustnessCreateInfo} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineRobustnessCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineRobustnessCreateInfoEXT} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkPipelineRobustnessCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderingAttachmentLocationInfo} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkRenderingAttachmentLocationInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderingAttachmentLocationInfoKHR} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkRenderingAttachmentLocationInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderingInputAttachmentIndexInfo} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkRenderingInputAttachmentIndexInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderingInputAttachmentIndexInfoKHR} value to the {@code pNext} chain. */
    public VkGraphicsPipelineCreateInfo pNext(VkRenderingInputAttachmentIndexInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkGraphicsPipelineCreateInfo flags(@NativeType("VkPipelineCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code stageCount} field. */
    public VkGraphicsPipelineCreateInfo stageCount(@NativeType("uint32_t") int value) { nstageCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@code pStages} field. */
    public VkGraphicsPipelineCreateInfo pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.@Nullable Buffer value) { npStages(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineVertexInputStateCreateInfo} to the {@code pVertexInputState} field. */
    public VkGraphicsPipelineCreateInfo pVertexInputState(@Nullable @NativeType("VkPipelineVertexInputStateCreateInfo const *") VkPipelineVertexInputStateCreateInfo value) { npVertexInputState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineInputAssemblyStateCreateInfo} to the {@code pInputAssemblyState} field. */
    public VkGraphicsPipelineCreateInfo pInputAssemblyState(@Nullable @NativeType("VkPipelineInputAssemblyStateCreateInfo const *") VkPipelineInputAssemblyStateCreateInfo value) { npInputAssemblyState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineTessellationStateCreateInfo} to the {@code pTessellationState} field. */
    public VkGraphicsPipelineCreateInfo pTessellationState(@Nullable @NativeType("VkPipelineTessellationStateCreateInfo const *") VkPipelineTessellationStateCreateInfo value) { npTessellationState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineViewportStateCreateInfo} to the {@code pViewportState} field. */
    public VkGraphicsPipelineCreateInfo pViewportState(@Nullable @NativeType("VkPipelineViewportStateCreateInfo const *") VkPipelineViewportStateCreateInfo value) { npViewportState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineRasterizationStateCreateInfo} to the {@code pRasterizationState} field. */
    public VkGraphicsPipelineCreateInfo pRasterizationState(@Nullable @NativeType("VkPipelineRasterizationStateCreateInfo const *") VkPipelineRasterizationStateCreateInfo value) { npRasterizationState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineMultisampleStateCreateInfo} to the {@code pMultisampleState} field. */
    public VkGraphicsPipelineCreateInfo pMultisampleState(@Nullable @NativeType("VkPipelineMultisampleStateCreateInfo const *") VkPipelineMultisampleStateCreateInfo value) { npMultisampleState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineDepthStencilStateCreateInfo} to the {@code pDepthStencilState} field. */
    public VkGraphicsPipelineCreateInfo pDepthStencilState(@Nullable @NativeType("VkPipelineDepthStencilStateCreateInfo const *") VkPipelineDepthStencilStateCreateInfo value) { npDepthStencilState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineColorBlendStateCreateInfo} to the {@code pColorBlendState} field. */
    public VkGraphicsPipelineCreateInfo pColorBlendState(@Nullable @NativeType("VkPipelineColorBlendStateCreateInfo const *") VkPipelineColorBlendStateCreateInfo value) { npColorBlendState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineDynamicStateCreateInfo} to the {@code pDynamicState} field. */
    public VkGraphicsPipelineCreateInfo pDynamicState(@Nullable @NativeType("VkPipelineDynamicStateCreateInfo const *") VkPipelineDynamicStateCreateInfo value) { npDynamicState(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    public VkGraphicsPipelineCreateInfo layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code renderPass} field. */
    public VkGraphicsPipelineCreateInfo renderPass(@NativeType("VkRenderPass") long value) { nrenderPass(address(), value); return this; }
    /** Sets the specified value to the {@code subpass} field. */
    public VkGraphicsPipelineCreateInfo subpass(@NativeType("uint32_t") int value) { nsubpass(address(), value); return this; }
    /** Sets the specified value to the {@code basePipelineHandle} field. */
    public VkGraphicsPipelineCreateInfo basePipelineHandle(@NativeType("VkPipeline") long value) { nbasePipelineHandle(address(), value); return this; }
    /** Sets the specified value to the {@code basePipelineIndex} field. */
    public VkGraphicsPipelineCreateInfo basePipelineIndex(@NativeType("int32_t") int value) { nbasePipelineIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGraphicsPipelineCreateInfo set(
        int sType,
        long pNext,
        int flags,
        int stageCount,
        VkPipelineShaderStageCreateInfo.@Nullable Buffer pStages,
        @Nullable VkPipelineVertexInputStateCreateInfo pVertexInputState,
        @Nullable VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState,
        @Nullable VkPipelineTessellationStateCreateInfo pTessellationState,
        @Nullable VkPipelineViewportStateCreateInfo pViewportState,
        @Nullable VkPipelineRasterizationStateCreateInfo pRasterizationState,
        @Nullable VkPipelineMultisampleStateCreateInfo pMultisampleState,
        @Nullable VkPipelineDepthStencilStateCreateInfo pDepthStencilState,
        @Nullable VkPipelineColorBlendStateCreateInfo pColorBlendState,
        @Nullable VkPipelineDynamicStateCreateInfo pDynamicState,
        long layout,
        long renderPass,
        int subpass,
        long basePipelineHandle,
        int basePipelineIndex
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        stageCount(stageCount);
        pStages(pStages);
        pVertexInputState(pVertexInputState);
        pInputAssemblyState(pInputAssemblyState);
        pTessellationState(pTessellationState);
        pViewportState(pViewportState);
        pRasterizationState(pRasterizationState);
        pMultisampleState(pMultisampleState);
        pDepthStencilState(pDepthStencilState);
        pColorBlendState(pColorBlendState);
        pDynamicState(pDynamicState);
        layout(layout);
        renderPass(renderPass);
        subpass(subpass);
        basePipelineHandle(basePipelineHandle);
        basePipelineIndex(basePipelineIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGraphicsPipelineCreateInfo set(VkGraphicsPipelineCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGraphicsPipelineCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGraphicsPipelineCreateInfo malloc() {
        return new VkGraphicsPipelineCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGraphicsPipelineCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGraphicsPipelineCreateInfo calloc() {
        return new VkGraphicsPipelineCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGraphicsPipelineCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkGraphicsPipelineCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGraphicsPipelineCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkGraphicsPipelineCreateInfo} instance for the specified memory address. */
    public static VkGraphicsPipelineCreateInfo create(long address) {
        return new VkGraphicsPipelineCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkGraphicsPipelineCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkGraphicsPipelineCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGraphicsPipelineCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkGraphicsPipelineCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkGraphicsPipelineCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkGraphicsPipelineCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkGraphicsPipelineCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkGraphicsPipelineCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGraphicsPipelineCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGraphicsPipelineCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGraphicsPipelineCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGraphicsPipelineCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkGraphicsPipelineCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGraphicsPipelineCreateInfo malloc(MemoryStack stack) {
        return new VkGraphicsPipelineCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGraphicsPipelineCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGraphicsPipelineCreateInfo calloc(MemoryStack stack) {
        return new VkGraphicsPipelineCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkGraphicsPipelineCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGraphicsPipelineCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkGraphicsPipelineCreateInfo.FLAGS); }
    /** Unsafe version of {@link #stageCount}. */
    public static int nstageCount(long struct) { return memGetInt(struct + VkGraphicsPipelineCreateInfo.STAGECOUNT); }
    /** Unsafe version of {@link #pStages}. */
    public static VkPipelineShaderStageCreateInfo.@Nullable Buffer npStages(long struct) { return VkPipelineShaderStageCreateInfo.createSafe(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PSTAGES), nstageCount(struct)); }
    /** Unsafe version of {@link #pVertexInputState}. */
    public static @Nullable VkPipelineVertexInputStateCreateInfo npVertexInputState(long struct) { return VkPipelineVertexInputStateCreateInfo.createSafe(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PVERTEXINPUTSTATE)); }
    /** Unsafe version of {@link #pInputAssemblyState}. */
    public static @Nullable VkPipelineInputAssemblyStateCreateInfo npInputAssemblyState(long struct) { return VkPipelineInputAssemblyStateCreateInfo.createSafe(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PINPUTASSEMBLYSTATE)); }
    /** Unsafe version of {@link #pTessellationState}. */
    public static @Nullable VkPipelineTessellationStateCreateInfo npTessellationState(long struct) { return VkPipelineTessellationStateCreateInfo.createSafe(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PTESSELLATIONSTATE)); }
    /** Unsafe version of {@link #pViewportState}. */
    public static @Nullable VkPipelineViewportStateCreateInfo npViewportState(long struct) { return VkPipelineViewportStateCreateInfo.createSafe(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PVIEWPORTSTATE)); }
    /** Unsafe version of {@link #pRasterizationState}. */
    public static @Nullable VkPipelineRasterizationStateCreateInfo npRasterizationState(long struct) { return VkPipelineRasterizationStateCreateInfo.createSafe(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PRASTERIZATIONSTATE)); }
    /** Unsafe version of {@link #pMultisampleState}. */
    public static @Nullable VkPipelineMultisampleStateCreateInfo npMultisampleState(long struct) { return VkPipelineMultisampleStateCreateInfo.createSafe(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PMULTISAMPLESTATE)); }
    /** Unsafe version of {@link #pDepthStencilState}. */
    public static @Nullable VkPipelineDepthStencilStateCreateInfo npDepthStencilState(long struct) { return VkPipelineDepthStencilStateCreateInfo.createSafe(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PDEPTHSTENCILSTATE)); }
    /** Unsafe version of {@link #pColorBlendState}. */
    public static @Nullable VkPipelineColorBlendStateCreateInfo npColorBlendState(long struct) { return VkPipelineColorBlendStateCreateInfo.createSafe(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PCOLORBLENDSTATE)); }
    /** Unsafe version of {@link #pDynamicState}. */
    public static @Nullable VkPipelineDynamicStateCreateInfo npDynamicState(long struct) { return VkPipelineDynamicStateCreateInfo.createSafe(memGetAddress(struct + VkGraphicsPipelineCreateInfo.PDYNAMICSTATE)); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return memGetLong(struct + VkGraphicsPipelineCreateInfo.LAYOUT); }
    /** Unsafe version of {@link #renderPass}. */
    public static long nrenderPass(long struct) { return memGetLong(struct + VkGraphicsPipelineCreateInfo.RENDERPASS); }
    /** Unsafe version of {@link #subpass}. */
    public static int nsubpass(long struct) { return memGetInt(struct + VkGraphicsPipelineCreateInfo.SUBPASS); }
    /** Unsafe version of {@link #basePipelineHandle}. */
    public static long nbasePipelineHandle(long struct) { return memGetLong(struct + VkGraphicsPipelineCreateInfo.BASEPIPELINEHANDLE); }
    /** Unsafe version of {@link #basePipelineIndex}. */
    public static int nbasePipelineIndex(long struct) { return memGetInt(struct + VkGraphicsPipelineCreateInfo.BASEPIPELINEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkGraphicsPipelineCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkGraphicsPipelineCreateInfo.FLAGS, value); }
    /** Sets the specified value to the {@code stageCount} field of the specified {@code struct}. */
    public static void nstageCount(long struct, int value) { memPutInt(struct + VkGraphicsPipelineCreateInfo.STAGECOUNT, value); }
    /** Unsafe version of {@link #pStages(VkPipelineShaderStageCreateInfo.Buffer) pStages}. */
    public static void npStages(long struct, VkPipelineShaderStageCreateInfo.@Nullable Buffer value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PSTAGES, memAddressSafe(value)); if (value != null) { nstageCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #pVertexInputState(VkPipelineVertexInputStateCreateInfo) pVertexInputState}. */
    public static void npVertexInputState(long struct, @Nullable VkPipelineVertexInputStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PVERTEXINPUTSTATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pInputAssemblyState(VkPipelineInputAssemblyStateCreateInfo) pInputAssemblyState}. */
    public static void npInputAssemblyState(long struct, @Nullable VkPipelineInputAssemblyStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PINPUTASSEMBLYSTATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pTessellationState(VkPipelineTessellationStateCreateInfo) pTessellationState}. */
    public static void npTessellationState(long struct, @Nullable VkPipelineTessellationStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PTESSELLATIONSTATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pViewportState(VkPipelineViewportStateCreateInfo) pViewportState}. */
    public static void npViewportState(long struct, @Nullable VkPipelineViewportStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PVIEWPORTSTATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pRasterizationState(VkPipelineRasterizationStateCreateInfo) pRasterizationState}. */
    public static void npRasterizationState(long struct, @Nullable VkPipelineRasterizationStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PRASTERIZATIONSTATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pMultisampleState(VkPipelineMultisampleStateCreateInfo) pMultisampleState}. */
    public static void npMultisampleState(long struct, @Nullable VkPipelineMultisampleStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PMULTISAMPLESTATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pDepthStencilState(VkPipelineDepthStencilStateCreateInfo) pDepthStencilState}. */
    public static void npDepthStencilState(long struct, @Nullable VkPipelineDepthStencilStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PDEPTHSTENCILSTATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pColorBlendState(VkPipelineColorBlendStateCreateInfo) pColorBlendState}. */
    public static void npColorBlendState(long struct, @Nullable VkPipelineColorBlendStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PCOLORBLENDSTATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pDynamicState(VkPipelineDynamicStateCreateInfo) pDynamicState}. */
    public static void npDynamicState(long struct, @Nullable VkPipelineDynamicStateCreateInfo value) { memPutAddress(struct + VkGraphicsPipelineCreateInfo.PDYNAMICSTATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { memPutLong(struct + VkGraphicsPipelineCreateInfo.LAYOUT, value); }
    /** Unsafe version of {@link #renderPass(long) renderPass}. */
    public static void nrenderPass(long struct, long value) { memPutLong(struct + VkGraphicsPipelineCreateInfo.RENDERPASS, value); }
    /** Unsafe version of {@link #subpass(int) subpass}. */
    public static void nsubpass(long struct, int value) { memPutInt(struct + VkGraphicsPipelineCreateInfo.SUBPASS, value); }
    /** Unsafe version of {@link #basePipelineHandle(long) basePipelineHandle}. */
    public static void nbasePipelineHandle(long struct, long value) { memPutLong(struct + VkGraphicsPipelineCreateInfo.BASEPIPELINEHANDLE, value); }
    /** Unsafe version of {@link #basePipelineIndex(int) basePipelineIndex}. */
    public static void nbasePipelineIndex(long struct, int value) { memPutInt(struct + VkGraphicsPipelineCreateInfo.BASEPIPELINEINDEX, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pVertexInputState = memGetAddress(struct + VkGraphicsPipelineCreateInfo.PVERTEXINPUTSTATE);
        if (pVertexInputState != NULL) {
            VkPipelineVertexInputStateCreateInfo.validate(pVertexInputState);
        }
        long pDynamicState = memGetAddress(struct + VkGraphicsPipelineCreateInfo.PDYNAMICSTATE);
        if (pDynamicState != NULL) {
            VkPipelineDynamicStateCreateInfo.validate(pDynamicState);
        }
    }

    // -----------------------------------

    /** An array of {@link VkGraphicsPipelineCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkGraphicsPipelineCreateInfo, Buffer> implements NativeResource {

        private static final VkGraphicsPipelineCreateInfo ELEMENT_FACTORY = VkGraphicsPipelineCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkGraphicsPipelineCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGraphicsPipelineCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkGraphicsPipelineCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGraphicsPipelineCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGraphicsPipelineCreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkPipelineCreateFlags")
        public int flags() { return VkGraphicsPipelineCreateInfo.nflags(address()); }
        /** @return the value of the {@code stageCount} field. */
        @NativeType("uint32_t")
        public int stageCount() { return VkGraphicsPipelineCreateInfo.nstageCount(address()); }
        /** @return a {@link VkPipelineShaderStageCreateInfo.Buffer} view of the struct array pointed to by the {@code pStages} field. */
        @NativeType("VkPipelineShaderStageCreateInfo const *")
        public VkPipelineShaderStageCreateInfo.@Nullable Buffer pStages() { return VkGraphicsPipelineCreateInfo.npStages(address()); }
        /** @return a {@link VkPipelineVertexInputStateCreateInfo} view of the struct pointed to by the {@code pVertexInputState} field. */
        @NativeType("VkPipelineVertexInputStateCreateInfo const *")
        public @Nullable VkPipelineVertexInputStateCreateInfo pVertexInputState() { return VkGraphicsPipelineCreateInfo.npVertexInputState(address()); }
        /** @return a {@link VkPipelineInputAssemblyStateCreateInfo} view of the struct pointed to by the {@code pInputAssemblyState} field. */
        @NativeType("VkPipelineInputAssemblyStateCreateInfo const *")
        public @Nullable VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState() { return VkGraphicsPipelineCreateInfo.npInputAssemblyState(address()); }
        /** @return a {@link VkPipelineTessellationStateCreateInfo} view of the struct pointed to by the {@code pTessellationState} field. */
        @NativeType("VkPipelineTessellationStateCreateInfo const *")
        public @Nullable VkPipelineTessellationStateCreateInfo pTessellationState() { return VkGraphicsPipelineCreateInfo.npTessellationState(address()); }
        /** @return a {@link VkPipelineViewportStateCreateInfo} view of the struct pointed to by the {@code pViewportState} field. */
        @NativeType("VkPipelineViewportStateCreateInfo const *")
        public @Nullable VkPipelineViewportStateCreateInfo pViewportState() { return VkGraphicsPipelineCreateInfo.npViewportState(address()); }
        /** @return a {@link VkPipelineRasterizationStateCreateInfo} view of the struct pointed to by the {@code pRasterizationState} field. */
        @NativeType("VkPipelineRasterizationStateCreateInfo const *")
        public @Nullable VkPipelineRasterizationStateCreateInfo pRasterizationState() { return VkGraphicsPipelineCreateInfo.npRasterizationState(address()); }
        /** @return a {@link VkPipelineMultisampleStateCreateInfo} view of the struct pointed to by the {@code pMultisampleState} field. */
        @NativeType("VkPipelineMultisampleStateCreateInfo const *")
        public @Nullable VkPipelineMultisampleStateCreateInfo pMultisampleState() { return VkGraphicsPipelineCreateInfo.npMultisampleState(address()); }
        /** @return a {@link VkPipelineDepthStencilStateCreateInfo} view of the struct pointed to by the {@code pDepthStencilState} field. */
        @NativeType("VkPipelineDepthStencilStateCreateInfo const *")
        public @Nullable VkPipelineDepthStencilStateCreateInfo pDepthStencilState() { return VkGraphicsPipelineCreateInfo.npDepthStencilState(address()); }
        /** @return a {@link VkPipelineColorBlendStateCreateInfo} view of the struct pointed to by the {@code pColorBlendState} field. */
        @NativeType("VkPipelineColorBlendStateCreateInfo const *")
        public @Nullable VkPipelineColorBlendStateCreateInfo pColorBlendState() { return VkGraphicsPipelineCreateInfo.npColorBlendState(address()); }
        /** @return a {@link VkPipelineDynamicStateCreateInfo} view of the struct pointed to by the {@code pDynamicState} field. */
        @NativeType("VkPipelineDynamicStateCreateInfo const *")
        public @Nullable VkPipelineDynamicStateCreateInfo pDynamicState() { return VkGraphicsPipelineCreateInfo.npDynamicState(address()); }
        /** @return the value of the {@code layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkGraphicsPipelineCreateInfo.nlayout(address()); }
        /** @return the value of the {@code renderPass} field. */
        @NativeType("VkRenderPass")
        public long renderPass() { return VkGraphicsPipelineCreateInfo.nrenderPass(address()); }
        /** @return the value of the {@code subpass} field. */
        @NativeType("uint32_t")
        public int subpass() { return VkGraphicsPipelineCreateInfo.nsubpass(address()); }
        /** @return the value of the {@code basePipelineHandle} field. */
        @NativeType("VkPipeline")
        public long basePipelineHandle() { return VkGraphicsPipelineCreateInfo.nbasePipelineHandle(address()); }
        /** @return the value of the {@code basePipelineIndex} field. */
        @NativeType("int32_t")
        public int basePipelineIndex() { return VkGraphicsPipelineCreateInfo.nbasePipelineIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkGraphicsPipelineCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkGraphicsPipelineCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO} value to the {@code sType} field. */
        public VkGraphicsPipelineCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkGraphicsPipelineCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkAttachmentSampleCountInfoAMD} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkAttachmentSampleCountInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkAttachmentSampleCountInfoNV} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkAttachmentSampleCountInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExternalFormatANDROID} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkExternalFormatANDROID value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkGraphicsPipelineLibraryCreateInfoEXT} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkGraphicsPipelineLibraryCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkGraphicsPipelineShaderGroupsCreateInfoNV} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkGraphicsPipelineShaderGroupsCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMultiviewPerViewAttributesInfoNVX} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkMultiviewPerViewAttributesInfoNVX value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineBinaryInfoKHR} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineBinaryInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCompilerControlCreateInfoAMD} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineCompilerControlCreateInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreateFlags2CreateInfo} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineCreateFlags2CreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreateFlags2CreateInfoKHR} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineCreateFlags2CreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineDiscardRectangleStateCreateInfoEXT} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineDiscardRectangleStateCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineFragmentShadingRateEnumStateCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineFragmentShadingRateStateCreateInfoKHR} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineFragmentShadingRateStateCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineLibraryCreateInfoKHR} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineLibraryCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineRenderingCreateInfo} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineRenderingCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineRenderingCreateInfoKHR} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineRenderingCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineRepresentativeFragmentTestStateCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineRobustnessCreateInfo} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineRobustnessCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineRobustnessCreateInfoEXT} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkPipelineRobustnessCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderingAttachmentLocationInfo} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkRenderingAttachmentLocationInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderingAttachmentLocationInfoKHR} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkRenderingAttachmentLocationInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderingInputAttachmentIndexInfo} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkRenderingInputAttachmentIndexInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderingInputAttachmentIndexInfoKHR} value to the {@code pNext} chain. */
        public VkGraphicsPipelineCreateInfo.Buffer pNext(VkRenderingInputAttachmentIndexInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkGraphicsPipelineCreateInfo.Buffer flags(@NativeType("VkPipelineCreateFlags") int value) { VkGraphicsPipelineCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code stageCount} field. */
        public VkGraphicsPipelineCreateInfo.Buffer stageCount(@NativeType("uint32_t") int value) { VkGraphicsPipelineCreateInfo.nstageCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@code pStages} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.@Nullable Buffer value) { VkGraphicsPipelineCreateInfo.npStages(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineVertexInputStateCreateInfo} to the {@code pVertexInputState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pVertexInputState(@Nullable @NativeType("VkPipelineVertexInputStateCreateInfo const *") VkPipelineVertexInputStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npVertexInputState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineInputAssemblyStateCreateInfo} to the {@code pInputAssemblyState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pInputAssemblyState(@Nullable @NativeType("VkPipelineInputAssemblyStateCreateInfo const *") VkPipelineInputAssemblyStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npInputAssemblyState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineTessellationStateCreateInfo} to the {@code pTessellationState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pTessellationState(@Nullable @NativeType("VkPipelineTessellationStateCreateInfo const *") VkPipelineTessellationStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npTessellationState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineViewportStateCreateInfo} to the {@code pViewportState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pViewportState(@Nullable @NativeType("VkPipelineViewportStateCreateInfo const *") VkPipelineViewportStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npViewportState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineRasterizationStateCreateInfo} to the {@code pRasterizationState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pRasterizationState(@Nullable @NativeType("VkPipelineRasterizationStateCreateInfo const *") VkPipelineRasterizationStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npRasterizationState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineMultisampleStateCreateInfo} to the {@code pMultisampleState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pMultisampleState(@Nullable @NativeType("VkPipelineMultisampleStateCreateInfo const *") VkPipelineMultisampleStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npMultisampleState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineDepthStencilStateCreateInfo} to the {@code pDepthStencilState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pDepthStencilState(@Nullable @NativeType("VkPipelineDepthStencilStateCreateInfo const *") VkPipelineDepthStencilStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npDepthStencilState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineColorBlendStateCreateInfo} to the {@code pColorBlendState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pColorBlendState(@Nullable @NativeType("VkPipelineColorBlendStateCreateInfo const *") VkPipelineColorBlendStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npColorBlendState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineDynamicStateCreateInfo} to the {@code pDynamicState} field. */
        public VkGraphicsPipelineCreateInfo.Buffer pDynamicState(@Nullable @NativeType("VkPipelineDynamicStateCreateInfo const *") VkPipelineDynamicStateCreateInfo value) { VkGraphicsPipelineCreateInfo.npDynamicState(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        public VkGraphicsPipelineCreateInfo.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkGraphicsPipelineCreateInfo.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code renderPass} field. */
        public VkGraphicsPipelineCreateInfo.Buffer renderPass(@NativeType("VkRenderPass") long value) { VkGraphicsPipelineCreateInfo.nrenderPass(address(), value); return this; }
        /** Sets the specified value to the {@code subpass} field. */
        public VkGraphicsPipelineCreateInfo.Buffer subpass(@NativeType("uint32_t") int value) { VkGraphicsPipelineCreateInfo.nsubpass(address(), value); return this; }
        /** Sets the specified value to the {@code basePipelineHandle} field. */
        public VkGraphicsPipelineCreateInfo.Buffer basePipelineHandle(@NativeType("VkPipeline") long value) { VkGraphicsPipelineCreateInfo.nbasePipelineHandle(address(), value); return this; }
        /** Sets the specified value to the {@code basePipelineIndex} field. */
        public VkGraphicsPipelineCreateInfo.Buffer basePipelineIndex(@NativeType("int32_t") int value) { VkGraphicsPipelineCreateInfo.nbasePipelineIndex(address(), value); return this; }

    }

}