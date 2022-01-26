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
 * Structure describing the Vulkan 1.3 features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceVulkan13Features} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceVulkan13Features} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceVulkan13Features {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #robustImageAccess};
 *     VkBool32 {@link #inlineUniformBlock};
 *     VkBool32 {@link #descriptorBindingInlineUniformBlockUpdateAfterBind};
 *     VkBool32 {@link #pipelineCreationCacheControl};
 *     VkBool32 {@link #privateData};
 *     VkBool32 {@link #shaderDemoteToHelperInvocation};
 *     VkBool32 {@link #shaderTerminateInvocation};
 *     VkBool32 {@link #subgroupSizeControl};
 *     VkBool32 {@link #computeFullSubgroups};
 *     VkBool32 {@link #synchronization2};
 *     VkBool32 {@link #textureCompressionASTC_HDR};
 *     VkBool32 {@link #shaderZeroInitializeWorkgroupMemory};
 *     VkBool32 {@link #dynamicRendering};
 *     VkBool32 {@link #shaderIntegerDotProduct};
 *     VkBool32 {@link #maintenance4};
 * }</code></pre>
 */
public class VkPhysicalDeviceVulkan13Features extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ROBUSTIMAGEACCESS,
        INLINEUNIFORMBLOCK,
        DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND,
        PIPELINECREATIONCACHECONTROL,
        PRIVATEDATA,
        SHADERDEMOTETOHELPERINVOCATION,
        SHADERTERMINATEINVOCATION,
        SUBGROUPSIZECONTROL,
        COMPUTEFULLSUBGROUPS,
        SYNCHRONIZATION2,
        TEXTURECOMPRESSIONASTC_HDR,
        SHADERZEROINITIALIZEWORKGROUPMEMORY,
        DYNAMICRENDERING,
        SHADERINTEGERDOTPRODUCT,
        MAINTENANCE4;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ROBUSTIMAGEACCESS = layout.offsetof(2);
        INLINEUNIFORMBLOCK = layout.offsetof(3);
        DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND = layout.offsetof(4);
        PIPELINECREATIONCACHECONTROL = layout.offsetof(5);
        PRIVATEDATA = layout.offsetof(6);
        SHADERDEMOTETOHELPERINVOCATION = layout.offsetof(7);
        SHADERTERMINATEINVOCATION = layout.offsetof(8);
        SUBGROUPSIZECONTROL = layout.offsetof(9);
        COMPUTEFULLSUBGROUPS = layout.offsetof(10);
        SYNCHRONIZATION2 = layout.offsetof(11);
        TEXTURECOMPRESSIONASTC_HDR = layout.offsetof(12);
        SHADERZEROINITIALIZEWORKGROUPMEMORY = layout.offsetof(13);
        DYNAMICRENDERING = layout.offsetof(14);
        SHADERINTEGERDOTPRODUCT = layout.offsetof(15);
        MAINTENANCE4 = layout.offsetof(16);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVulkan13Features} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVulkan13Features(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates whether image accesses are tightly bounds-checked against the dimensions of the image view. <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-input-validation">Invalid texels</a> resulting from out of bounds image loads will be replaced as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-texel-replacement">Texel Replacement</a>, with either <code>(0,0,1)</code> or <code>(0,0,0)</code> values inserted for missing G, B, or A components based on the format. */
    @NativeType("VkBool32")
    public boolean robustImageAccess() { return nrobustImageAccess(address()) != 0; }
    /** indicates whether the implementation supports inline uniform block descriptors. If this feature is not enabled, {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} <b>must</b> not be used. */
    @NativeType("VkBool32")
    public boolean inlineUniformBlock() { return ninlineUniformBlock(address()) != 0; }
    /** indicates whether the implementation supports updating inline uniform block descriptors after a set is bound. If this feature is not enabled, {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT} <b>must</b> not be used with {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK}. */
    @NativeType("VkBool32")
    public boolean descriptorBindingInlineUniformBlockUpdateAfterBind() { return ndescriptorBindingInlineUniformBlockUpdateAfterBind(address()) != 0; }
    /**
     * indicates that the implementation supports:
     * 
     * <ul>
     * <li>The following <b>can</b> be used in stext:Vk*PipelineCreateInfo{@code ::flags}:
     * 
     * <ul>
     * <li>{@link VK13#VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT}</li>
     * <li>{@link VK13#VK_PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT}</li>
     * </ul>
     * </li>
     * <li>The following <b>can</b> be used in {@link VkPipelineCacheCreateInfo}{@code ::flags}:
     * 
     * <ul>
     * <li>{@link VK13#VK_PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT}</li>
     * </ul>
     * </li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean pipelineCreationCacheControl() { return npipelineCreationCacheControl(address()) != 0; }
    /** indicates whether the implementation supports private data. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#private-data">Private Data</a>. */
    @NativeType("VkBool32")
    public boolean privateData() { return nprivateData(address()) != 0; }
    /** indicates whether the implementation supports the SPIR-V {@code DemoteToHelperInvocationEXT} capability. */
    @NativeType("VkBool32")
    public boolean shaderDemoteToHelperInvocation() { return nshaderDemoteToHelperInvocation(address()) != 0; }
    /** specifies whether the implementation supports SPIR-V modules that use the {@code SPV_KHR_terminate_invocation} extension. */
    @NativeType("VkBool32")
    public boolean shaderTerminateInvocation() { return nshaderTerminateInvocation(address()) != 0; }
    /** indicates whether the implementation supports controlling shader subgroup sizes via the {@link VK13#VK_PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT} flag and the {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} structure. */
    @NativeType("VkBool32")
    public boolean subgroupSizeControl() { return nsubgroupSizeControl(address()) != 0; }
    /** indicates whether the implementation supports requiring full subgroups in compute shaders via the {@link VK13#VK_PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT} flag. */
    @NativeType("VkBool32")
    public boolean computeFullSubgroups() { return ncomputeFullSubgroups(address()) != 0; }
    /** indicates whether the implementation supports the new set of synchronization commands introduced in {@link KHRSynchronization2 VK_KHR_synchronization2}. */
    @NativeType("VkBool32")
    public boolean synchronization2() { return nsynchronization2(address()) != 0; }
    /**
     * indicates whether all of the ASTC HDR compressed texture formats are supported. If this feature is enabled, then the {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}, {@link VK10#VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT} and {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} features <b>must</b> be supported in {@code optimalTilingFeatures} for the following formats:
     * 
     * <ul>
     * <li>{@link VK13#VK_FORMAT_ASTC_4x4_SFLOAT_BLOCK FORMAT_ASTC_4x4_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_5x4_SFLOAT_BLOCK FORMAT_ASTC_5x4_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_5x5_SFLOAT_BLOCK FORMAT_ASTC_5x5_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_6x5_SFLOAT_BLOCK FORMAT_ASTC_6x5_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_6x6_SFLOAT_BLOCK FORMAT_ASTC_6x6_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_8x5_SFLOAT_BLOCK FORMAT_ASTC_8x5_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_8x6_SFLOAT_BLOCK FORMAT_ASTC_8x6_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_8x8_SFLOAT_BLOCK FORMAT_ASTC_8x8_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_10x5_SFLOAT_BLOCK FORMAT_ASTC_10x5_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_10x6_SFLOAT_BLOCK FORMAT_ASTC_10x6_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_10x8_SFLOAT_BLOCK FORMAT_ASTC_10x8_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_10x10_SFLOAT_BLOCK FORMAT_ASTC_10x10_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_12x10_SFLOAT_BLOCK FORMAT_ASTC_12x10_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_12x12_SFLOAT_BLOCK FORMAT_ASTC_12x12_SFLOAT_BLOCK}</li>
     * </ul>
     * 
     * <p>To query for additional properties, or if the feature is not enabled, {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} and {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} <b>can</b> be used to check for supported properties of individual formats as normal.</p>
     */
    @NativeType("VkBool32")
    public boolean textureCompressionASTC_HDR() { return ntextureCompressionASTC_HDR(address()) != 0; }
    /** specifies whether the implementation supports initializing a variable in Workgroup storage class. */
    @NativeType("VkBool32")
    public boolean shaderZeroInitializeWorkgroupMemory() { return nshaderZeroInitializeWorkgroupMemory(address()) != 0; }
    /** specifies that the implementation supports dynamic render pass instances using the {@link VK13#vkCmdBeginRendering CmdBeginRendering} command. */
    @NativeType("VkBool32")
    public boolean dynamicRendering() { return ndynamicRendering(address()) != 0; }
    /** specifies whether shader modules <b>can</b> declare the {@code DotProductInputAllKHR}, {@code DotProductInput4x8BitKHR}, {@code DotProductInput4x8BitPackedKHR} and {@code DotProductKHR} capabilities. */
    @NativeType("VkBool32")
    public boolean shaderIntegerDotProduct() { return nshaderIntegerDotProduct(address()) != 0; }
    /**
     * indicates that the implementation supports the following:
     * 
     * <ul>
     * <li>The application <b>may</b> destroy a {@code VkPipelineLayout} object immediately after using it to create another object.</li>
     * <li>{@code LocalSizeId} <b>can</b> be used as an alternative to {@code LocalSize} to specify the local workgroup size with specialization constants.</li>
     * <li>Images created with identical creation parameters will always have the same alignment requirements.</li>
     * <li>The size memory requirement of a buffer or image is never greater than that of another buffer or image created with a greater or equal size.</li>
     * <li>Push constants do not have to be initialized before they are dynamically accessed.</li>
     * <li>The interface matching rules allow a larger output vector to match with a smaller input vector, with additional values being discarded.</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean maintenance4() { return nmaintenance4(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceVulkan13Features sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceVulkan13Features sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceVulkan13Features pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #robustImageAccess} field. */
    public VkPhysicalDeviceVulkan13Features robustImageAccess(@NativeType("VkBool32") boolean value) { nrobustImageAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #inlineUniformBlock} field. */
    public VkPhysicalDeviceVulkan13Features inlineUniformBlock(@NativeType("VkBool32") boolean value) { ninlineUniformBlock(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingInlineUniformBlockUpdateAfterBind} field. */
    public VkPhysicalDeviceVulkan13Features descriptorBindingInlineUniformBlockUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingInlineUniformBlockUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #pipelineCreationCacheControl} field. */
    public VkPhysicalDeviceVulkan13Features pipelineCreationCacheControl(@NativeType("VkBool32") boolean value) { npipelineCreationCacheControl(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #privateData} field. */
    public VkPhysicalDeviceVulkan13Features privateData(@NativeType("VkBool32") boolean value) { nprivateData(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderDemoteToHelperInvocation} field. */
    public VkPhysicalDeviceVulkan13Features shaderDemoteToHelperInvocation(@NativeType("VkBool32") boolean value) { nshaderDemoteToHelperInvocation(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderTerminateInvocation} field. */
    public VkPhysicalDeviceVulkan13Features shaderTerminateInvocation(@NativeType("VkBool32") boolean value) { nshaderTerminateInvocation(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #subgroupSizeControl} field. */
    public VkPhysicalDeviceVulkan13Features subgroupSizeControl(@NativeType("VkBool32") boolean value) { nsubgroupSizeControl(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #computeFullSubgroups} field. */
    public VkPhysicalDeviceVulkan13Features computeFullSubgroups(@NativeType("VkBool32") boolean value) { ncomputeFullSubgroups(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #synchronization2} field. */
    public VkPhysicalDeviceVulkan13Features synchronization2(@NativeType("VkBool32") boolean value) { nsynchronization2(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #textureCompressionASTC_HDR} field. */
    public VkPhysicalDeviceVulkan13Features textureCompressionASTC_HDR(@NativeType("VkBool32") boolean value) { ntextureCompressionASTC_HDR(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderZeroInitializeWorkgroupMemory} field. */
    public VkPhysicalDeviceVulkan13Features shaderZeroInitializeWorkgroupMemory(@NativeType("VkBool32") boolean value) { nshaderZeroInitializeWorkgroupMemory(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #dynamicRendering} field. */
    public VkPhysicalDeviceVulkan13Features dynamicRendering(@NativeType("VkBool32") boolean value) { ndynamicRendering(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderIntegerDotProduct} field. */
    public VkPhysicalDeviceVulkan13Features shaderIntegerDotProduct(@NativeType("VkBool32") boolean value) { nshaderIntegerDotProduct(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #maintenance4} field. */
    public VkPhysicalDeviceVulkan13Features maintenance4(@NativeType("VkBool32") boolean value) { nmaintenance4(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVulkan13Features set(
        int sType,
        long pNext,
        boolean robustImageAccess,
        boolean inlineUniformBlock,
        boolean descriptorBindingInlineUniformBlockUpdateAfterBind,
        boolean pipelineCreationCacheControl,
        boolean privateData,
        boolean shaderDemoteToHelperInvocation,
        boolean shaderTerminateInvocation,
        boolean subgroupSizeControl,
        boolean computeFullSubgroups,
        boolean synchronization2,
        boolean textureCompressionASTC_HDR,
        boolean shaderZeroInitializeWorkgroupMemory,
        boolean dynamicRendering,
        boolean shaderIntegerDotProduct,
        boolean maintenance4
    ) {
        sType(sType);
        pNext(pNext);
        robustImageAccess(robustImageAccess);
        inlineUniformBlock(inlineUniformBlock);
        descriptorBindingInlineUniformBlockUpdateAfterBind(descriptorBindingInlineUniformBlockUpdateAfterBind);
        pipelineCreationCacheControl(pipelineCreationCacheControl);
        privateData(privateData);
        shaderDemoteToHelperInvocation(shaderDemoteToHelperInvocation);
        shaderTerminateInvocation(shaderTerminateInvocation);
        subgroupSizeControl(subgroupSizeControl);
        computeFullSubgroups(computeFullSubgroups);
        synchronization2(synchronization2);
        textureCompressionASTC_HDR(textureCompressionASTC_HDR);
        shaderZeroInitializeWorkgroupMemory(shaderZeroInitializeWorkgroupMemory);
        dynamicRendering(dynamicRendering);
        shaderIntegerDotProduct(shaderIntegerDotProduct);
        maintenance4(maintenance4);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVulkan13Features set(VkPhysicalDeviceVulkan13Features src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVulkan13Features} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan13Features malloc() {
        return wrap(VkPhysicalDeviceVulkan13Features.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan13Features} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan13Features calloc() {
        return wrap(VkPhysicalDeviceVulkan13Features.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan13Features} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVulkan13Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceVulkan13Features.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan13Features} instance for the specified memory address. */
    public static VkPhysicalDeviceVulkan13Features create(long address) {
        return wrap(VkPhysicalDeviceVulkan13Features.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVulkan13Features createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceVulkan13Features.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan13Features.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Features.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan13Features.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Features.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan13Features.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Features.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceVulkan13Features.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Features.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVulkan13Features.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan13Features} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan13Features malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVulkan13Features.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan13Features} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan13Features calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVulkan13Features.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan13Features.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Features.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan13Features.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Features.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Features.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVulkan13Features.PNEXT); }
    /** Unsafe version of {@link #robustImageAccess}. */
    public static int nrobustImageAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Features.ROBUSTIMAGEACCESS); }
    /** Unsafe version of {@link #inlineUniformBlock}. */
    public static int ninlineUniformBlock(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Features.INLINEUNIFORMBLOCK); }
    /** Unsafe version of {@link #descriptorBindingInlineUniformBlockUpdateAfterBind}. */
    public static int ndescriptorBindingInlineUniformBlockUpdateAfterBind(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Features.DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND); }
    /** Unsafe version of {@link #pipelineCreationCacheControl}. */
    public static int npipelineCreationCacheControl(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Features.PIPELINECREATIONCACHECONTROL); }
    /** Unsafe version of {@link #privateData}. */
    public static int nprivateData(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Features.PRIVATEDATA); }
    /** Unsafe version of {@link #shaderDemoteToHelperInvocation}. */
    public static int nshaderDemoteToHelperInvocation(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Features.SHADERDEMOTETOHELPERINVOCATION); }
    /** Unsafe version of {@link #shaderTerminateInvocation}. */
    public static int nshaderTerminateInvocation(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Features.SHADERTERMINATEINVOCATION); }
    /** Unsafe version of {@link #subgroupSizeControl}. */
    public static int nsubgroupSizeControl(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Features.SUBGROUPSIZECONTROL); }
    /** Unsafe version of {@link #computeFullSubgroups}. */
    public static int ncomputeFullSubgroups(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Features.COMPUTEFULLSUBGROUPS); }
    /** Unsafe version of {@link #synchronization2}. */
    public static int nsynchronization2(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Features.SYNCHRONIZATION2); }
    /** Unsafe version of {@link #textureCompressionASTC_HDR}. */
    public static int ntextureCompressionASTC_HDR(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Features.TEXTURECOMPRESSIONASTC_HDR); }
    /** Unsafe version of {@link #shaderZeroInitializeWorkgroupMemory}. */
    public static int nshaderZeroInitializeWorkgroupMemory(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Features.SHADERZEROINITIALIZEWORKGROUPMEMORY); }
    /** Unsafe version of {@link #dynamicRendering}. */
    public static int ndynamicRendering(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Features.DYNAMICRENDERING); }
    /** Unsafe version of {@link #shaderIntegerDotProduct}. */
    public static int nshaderIntegerDotProduct(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Features.SHADERINTEGERDOTPRODUCT); }
    /** Unsafe version of {@link #maintenance4}. */
    public static int nmaintenance4(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Features.MAINTENANCE4); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan13Features.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVulkan13Features.PNEXT, value); }
    /** Unsafe version of {@link #robustImageAccess(boolean) robustImageAccess}. */
    public static void nrobustImageAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan13Features.ROBUSTIMAGEACCESS, value); }
    /** Unsafe version of {@link #inlineUniformBlock(boolean) inlineUniformBlock}. */
    public static void ninlineUniformBlock(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan13Features.INLINEUNIFORMBLOCK, value); }
    /** Unsafe version of {@link #descriptorBindingInlineUniformBlockUpdateAfterBind(boolean) descriptorBindingInlineUniformBlockUpdateAfterBind}. */
    public static void ndescriptorBindingInlineUniformBlockUpdateAfterBind(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan13Features.DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #pipelineCreationCacheControl(boolean) pipelineCreationCacheControl}. */
    public static void npipelineCreationCacheControl(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan13Features.PIPELINECREATIONCACHECONTROL, value); }
    /** Unsafe version of {@link #privateData(boolean) privateData}. */
    public static void nprivateData(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan13Features.PRIVATEDATA, value); }
    /** Unsafe version of {@link #shaderDemoteToHelperInvocation(boolean) shaderDemoteToHelperInvocation}. */
    public static void nshaderDemoteToHelperInvocation(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan13Features.SHADERDEMOTETOHELPERINVOCATION, value); }
    /** Unsafe version of {@link #shaderTerminateInvocation(boolean) shaderTerminateInvocation}. */
    public static void nshaderTerminateInvocation(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan13Features.SHADERTERMINATEINVOCATION, value); }
    /** Unsafe version of {@link #subgroupSizeControl(boolean) subgroupSizeControl}. */
    public static void nsubgroupSizeControl(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan13Features.SUBGROUPSIZECONTROL, value); }
    /** Unsafe version of {@link #computeFullSubgroups(boolean) computeFullSubgroups}. */
    public static void ncomputeFullSubgroups(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan13Features.COMPUTEFULLSUBGROUPS, value); }
    /** Unsafe version of {@link #synchronization2(boolean) synchronization2}. */
    public static void nsynchronization2(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan13Features.SYNCHRONIZATION2, value); }
    /** Unsafe version of {@link #textureCompressionASTC_HDR(boolean) textureCompressionASTC_HDR}. */
    public static void ntextureCompressionASTC_HDR(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan13Features.TEXTURECOMPRESSIONASTC_HDR, value); }
    /** Unsafe version of {@link #shaderZeroInitializeWorkgroupMemory(boolean) shaderZeroInitializeWorkgroupMemory}. */
    public static void nshaderZeroInitializeWorkgroupMemory(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan13Features.SHADERZEROINITIALIZEWORKGROUPMEMORY, value); }
    /** Unsafe version of {@link #dynamicRendering(boolean) dynamicRendering}. */
    public static void ndynamicRendering(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan13Features.DYNAMICRENDERING, value); }
    /** Unsafe version of {@link #shaderIntegerDotProduct(boolean) shaderIntegerDotProduct}. */
    public static void nshaderIntegerDotProduct(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan13Features.SHADERINTEGERDOTPRODUCT, value); }
    /** Unsafe version of {@link #maintenance4(boolean) maintenance4}. */
    public static void nmaintenance4(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan13Features.MAINTENANCE4, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVulkan13Features} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan13Features, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVulkan13Features ELEMENT_FACTORY = VkPhysicalDeviceVulkan13Features.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVulkan13Features.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVulkan13Features#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceVulkan13Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceVulkan13Features#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVulkan13Features.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Features#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVulkan13Features.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Features#robustImageAccess} field. */
        @NativeType("VkBool32")
        public boolean robustImageAccess() { return VkPhysicalDeviceVulkan13Features.nrobustImageAccess(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Features#inlineUniformBlock} field. */
        @NativeType("VkBool32")
        public boolean inlineUniformBlock() { return VkPhysicalDeviceVulkan13Features.ninlineUniformBlock(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Features#descriptorBindingInlineUniformBlockUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingInlineUniformBlockUpdateAfterBind() { return VkPhysicalDeviceVulkan13Features.ndescriptorBindingInlineUniformBlockUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Features#pipelineCreationCacheControl} field. */
        @NativeType("VkBool32")
        public boolean pipelineCreationCacheControl() { return VkPhysicalDeviceVulkan13Features.npipelineCreationCacheControl(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Features#privateData} field. */
        @NativeType("VkBool32")
        public boolean privateData() { return VkPhysicalDeviceVulkan13Features.nprivateData(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Features#shaderDemoteToHelperInvocation} field. */
        @NativeType("VkBool32")
        public boolean shaderDemoteToHelperInvocation() { return VkPhysicalDeviceVulkan13Features.nshaderDemoteToHelperInvocation(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Features#shaderTerminateInvocation} field. */
        @NativeType("VkBool32")
        public boolean shaderTerminateInvocation() { return VkPhysicalDeviceVulkan13Features.nshaderTerminateInvocation(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Features#subgroupSizeControl} field. */
        @NativeType("VkBool32")
        public boolean subgroupSizeControl() { return VkPhysicalDeviceVulkan13Features.nsubgroupSizeControl(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Features#computeFullSubgroups} field. */
        @NativeType("VkBool32")
        public boolean computeFullSubgroups() { return VkPhysicalDeviceVulkan13Features.ncomputeFullSubgroups(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Features#synchronization2} field. */
        @NativeType("VkBool32")
        public boolean synchronization2() { return VkPhysicalDeviceVulkan13Features.nsynchronization2(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Features#textureCompressionASTC_HDR} field. */
        @NativeType("VkBool32")
        public boolean textureCompressionASTC_HDR() { return VkPhysicalDeviceVulkan13Features.ntextureCompressionASTC_HDR(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Features#shaderZeroInitializeWorkgroupMemory} field. */
        @NativeType("VkBool32")
        public boolean shaderZeroInitializeWorkgroupMemory() { return VkPhysicalDeviceVulkan13Features.nshaderZeroInitializeWorkgroupMemory(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Features#dynamicRendering} field. */
        @NativeType("VkBool32")
        public boolean dynamicRendering() { return VkPhysicalDeviceVulkan13Features.ndynamicRendering(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Features#shaderIntegerDotProduct} field. */
        @NativeType("VkBool32")
        public boolean shaderIntegerDotProduct() { return VkPhysicalDeviceVulkan13Features.nshaderIntegerDotProduct(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Features#maintenance4} field. */
        @NativeType("VkBool32")
        public boolean maintenance4() { return VkPhysicalDeviceVulkan13Features.nmaintenance4(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan13Features#sType} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVulkan13Features.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES} value to the {@link VkPhysicalDeviceVulkan13Features#sType} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan13Features#pNext} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVulkan13Features.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan13Features#robustImageAccess} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer robustImageAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.nrobustImageAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan13Features#inlineUniformBlock} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer inlineUniformBlock(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.ninlineUniformBlock(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan13Features#descriptorBindingInlineUniformBlockUpdateAfterBind} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer descriptorBindingInlineUniformBlockUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.ndescriptorBindingInlineUniformBlockUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan13Features#pipelineCreationCacheControl} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer pipelineCreationCacheControl(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.npipelineCreationCacheControl(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan13Features#privateData} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer privateData(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.nprivateData(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan13Features#shaderDemoteToHelperInvocation} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer shaderDemoteToHelperInvocation(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.nshaderDemoteToHelperInvocation(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan13Features#shaderTerminateInvocation} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer shaderTerminateInvocation(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.nshaderTerminateInvocation(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan13Features#subgroupSizeControl} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer subgroupSizeControl(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.nsubgroupSizeControl(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan13Features#computeFullSubgroups} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer computeFullSubgroups(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.ncomputeFullSubgroups(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan13Features#synchronization2} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer synchronization2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.nsynchronization2(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan13Features#textureCompressionASTC_HDR} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer textureCompressionASTC_HDR(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.ntextureCompressionASTC_HDR(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan13Features#shaderZeroInitializeWorkgroupMemory} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer shaderZeroInitializeWorkgroupMemory(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.nshaderZeroInitializeWorkgroupMemory(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan13Features#dynamicRendering} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer dynamicRendering(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.ndynamicRendering(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan13Features#shaderIntegerDotProduct} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer shaderIntegerDotProduct(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.nshaderIntegerDotProduct(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan13Features#maintenance4} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer maintenance4(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.nmaintenance4(address(), value ? 1 : 0); return this; }

    }

}