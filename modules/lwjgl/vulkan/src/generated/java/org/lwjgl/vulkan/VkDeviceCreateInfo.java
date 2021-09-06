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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created device.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code queueFamilyIndex} member of each element of {@code pQueueCreateInfos} <b>must</b> be unique within {@code pQueueCreateInfos}, except that two members can share the same {@code queueFamilyIndex} if one is a protected-capable queue and one is not a protected-capable queue</li>
 * <li>If the {@code pNext} chain includes a {@link VkPhysicalDeviceFeatures2} structure, then {@code pEnabledFeatures} <b>must</b> be {@code NULL}</li>
 * <li>{@code ppEnabledExtensionNames} <b>must</b> not contain {@link AMDNegativeViewportHeight VK_AMD_negative_viewport_height}</li>
 * <li>{@code ppEnabledExtensionNames} <b>must</b> not contain both {@link KHRBufferDeviceAddress VK_KHR_buffer_device_address} and {@link EXTBufferDeviceAddress VK_EXT_buffer_device_address}</li>
 * <li>if the {@code pNext} chain includes a {@link VkPhysicalDeviceVulkan12Features} structure and {@link VkPhysicalDeviceVulkan12Features}{@code ::bufferDeviceAddress} is VK_TRUE, {@code ppEnabledExtensionNames} <b>must</b> not contain {@link EXTBufferDeviceAddress VK_EXT_buffer_device_address}</li>
 * <li>If the {@code pNext} chain includes a {@link VkPhysicalDeviceVulkan11Features} structure, then it <b>must</b> not include a {@link VkPhysicalDevice16BitStorageFeatures}, {@link VkPhysicalDeviceMultiviewFeatures}, {@link VkPhysicalDeviceVariablePointersFeatures}, {@link VkPhysicalDeviceProtectedMemoryFeatures}, {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures}, or {@link VkPhysicalDeviceShaderDrawParametersFeatures} structure</li>
 * <li>If the {@code pNext} chain includes a {@link VkPhysicalDeviceVulkan12Features} structure, then it <b>must</b> not include a {@link VkPhysicalDevice8BitStorageFeatures}, {@link VkPhysicalDeviceShaderAtomicInt64Features}, {@link VkPhysicalDeviceShaderFloat16Int8Features}, {@link VkPhysicalDeviceDescriptorIndexingFeatures}, {@link VkPhysicalDeviceScalarBlockLayoutFeatures}, {@link VkPhysicalDeviceImagelessFramebufferFeatures}, {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures}, {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures}, {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures}, {@link VkPhysicalDeviceHostQueryResetFeatures}, {@link VkPhysicalDeviceTimelineSemaphoreFeatures}, {@link VkPhysicalDeviceBufferDeviceAddressFeatures}, or {@link VkPhysicalDeviceVulkanMemoryModelFeatures} structure</li>
 * <li>If {@code ppEnabledExtensions} contains {@code "VK_KHR_shader_draw_parameters"} and the {@code pNext} chain includes a {@link VkPhysicalDeviceVulkan11Features} structure, then {@link VkPhysicalDeviceVulkan11Features}{@code ::shaderDrawParameters} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
 * <li>If {@code ppEnabledExtensions} contains {@code "VK_KHR_draw_indirect_count"} and the {@code pNext} chain includes a {@link VkPhysicalDeviceVulkan12Features} structure, then {@link VkPhysicalDeviceVulkan12Features}{@code ::drawIndirectCount} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
 * <li>If {@code ppEnabledExtensions} contains {@code "VK_KHR_sampler_mirror_clamp_to_edge"} and the {@code pNext} chain includes a {@link VkPhysicalDeviceVulkan12Features} structure, then {@link VkPhysicalDeviceVulkan12Features}{@code ::samplerMirrorClampToEdge} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
 * <li>If {@code ppEnabledExtensions} contains {@code "VK_EXT_descriptor_indexing"} and the {@code pNext} chain includes a {@link VkPhysicalDeviceVulkan12Features} structure, then {@link VkPhysicalDeviceVulkan12Features}{@code ::descriptorIndexing} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
 * <li>If {@code ppEnabledExtensions} contains {@code "VK_EXT_sampler_filter_minmax"} and the {@code pNext} chain includes a {@link VkPhysicalDeviceVulkan12Features} structure, then {@link VkPhysicalDeviceVulkan12Features}{@code ::samplerFilterMinmax} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
 * <li>If {@code ppEnabledExtensions} contains {@code "VK_EXT_shader_viewport_index_layer"} and the {@code pNext} chain includes a {@link VkPhysicalDeviceVulkan12Features} structure, then {@link VkPhysicalDeviceVulkan12Features}{@code ::shaderOutputViewportIndex} and {@link VkPhysicalDeviceVulkan12Features}{@code ::shaderOutputLayer} <b>must</b> both be {@link VK10#VK_TRUE TRUE}</li>
 * <li>If the {@link KHRPortabilitySubset VK_KHR_portability_subset} extension is included in {@code pProperties} of {@link VK10#vkEnumerateDeviceExtensionProperties EnumerateDeviceExtensionProperties}, {@code ppEnabledExtensions} <b>must</b> include "VK_KHR_portability_subset"</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-shadingRateImage">{@code shadingRateImage}</a> is enabled, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-pipelineFragmentShadingRate">{@code pipelineFragmentShadingRate}</a> <b>must</b> not be enabled</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-shadingRateImage">{@code shadingRateImage}</a> is enabled, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-primitiveFragmentShadingRate">{@code primitiveFragmentShadingRate}</a> <b>must</b> not be enabled</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-shadingRateImage">{@code shadingRateImage}</a> is enabled, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-attachmentFragmentShadingRate">{@code attachmentFragmentShadingRate}</a> <b>must</b> not be enabled</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-fragmentDensityMap">{@code fragmentDensityMap}</a> is enabled, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-pipelineFragmentShadingRate">{@code pipelineFragmentShadingRate}</a> <b>must</b> not be enabled</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-fragmentDensityMap">{@code fragmentDensityMap}</a> is enabled, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-primitiveFragmentShadingRate">{@code primitiveFragmentShadingRate}</a> <b>must</b> not be enabled</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-fragmentDensityMap">{@code fragmentDensityMap}</a> is enabled, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-attachmentFragmentShadingRate">{@code attachmentFragmentShadingRate}</a> <b>must</b> not be enabled</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> is enabled, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-shaderImageInt64Atomics">{@code shaderImageInt64Atomics}</a> <b>must</b> be enabled</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-sparseImageFloat32Atomics">{@code sparseImageFloat32Atomics}</a> is enabled, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-shaderImageFloat32Atomics">{@code shaderImageFloat32Atomics}</a> <b>must</b> be enabled</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-sparseImageFloat32AtomicAdd">{@code sparseImageFloat32AtomicAdd}</a> is enabled, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-shaderImageFloat32AtomicAdd">{@code shaderImageFloat32AtomicAdd}</a> <b>must</b> be enabled</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-sparseImageFloat32AtomicMinMax">{@code sparseImageFloat32AtomicMinMax}</a> is enabled, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-shaderImageFloat32AtomicMinMax">{@code shaderImageFloat32AtomicMinMax}</a> <b>must</b> be enabled</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO STRUCTURE_TYPE_DEVICE_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkDeviceDeviceMemoryReportCreateInfoEXT}, {@link VkDeviceDiagnosticsConfigCreateInfoNV}, {@link VkDeviceGroupDeviceCreateInfo}, {@link VkDeviceMemoryOverallocationCreateInfoAMD}, {@link VkDevicePrivateDataCreateInfoEXT}, {@link VkPhysicalDevice16BitStorageFeatures}, {@link VkPhysicalDevice4444FormatsFeaturesEXT}, {@link VkPhysicalDevice8BitStorageFeatures}, {@link VkPhysicalDeviceASTCDecodeFeaturesEXT}, {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR}, {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT}, {@link VkPhysicalDeviceBufferDeviceAddressFeatures}, {@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT}, {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD}, {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT}, {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV}, {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT}, {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV}, {@link VkPhysicalDeviceCornerSampledImageFeaturesNV}, {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV}, {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT}, {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV}, {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT}, {@link VkPhysicalDeviceDescriptorIndexingFeatures}, {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV}, {@link VkPhysicalDeviceDeviceMemoryReportFeaturesEXT}, {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV}, {@link VkPhysicalDeviceExclusiveScissorFeaturesNV}, {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT}, {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT}, {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV}, {@link VkPhysicalDeviceFeatures2}, {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT}, {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT}, {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV}, {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT}, {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV}, {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR}, {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT}, {@link VkPhysicalDeviceHostQueryResetFeatures}, {@link VkPhysicalDeviceImageRobustnessFeaturesEXT}, {@link VkPhysicalDeviceImagelessFramebufferFeatures}, {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT}, {@link VkPhysicalDeviceInheritedViewportScissorFeaturesNV}, {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT}, {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI}, {@link VkPhysicalDeviceLineRasterizationFeaturesEXT}, {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT}, {@link VkPhysicalDeviceMeshShaderFeaturesNV}, {@link VkPhysicalDeviceMultiDrawFeaturesEXT}, {@link VkPhysicalDeviceMultiviewFeatures}, {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE}, {@link VkPhysicalDevicePerformanceQueryFeaturesKHR}, {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT}, {@link VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR}, {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR}, {@link VkPhysicalDevicePresentIdFeaturesKHR}, {@link VkPhysicalDevicePresentWaitFeaturesKHR}, {@link VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT}, {@link VkPhysicalDevicePrivateDataFeaturesEXT}, {@link VkPhysicalDeviceProtectedMemoryFeatures}, {@link VkPhysicalDeviceProvokingVertexFeaturesEXT}, {@link VkPhysicalDeviceRayQueryFeaturesKHR}, {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV}, {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR}, {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV}, {@link VkPhysicalDeviceRobustness2FeaturesEXT}, {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures}, {@link VkPhysicalDeviceScalarBlockLayoutFeatures}, {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures}, {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT}, {@link VkPhysicalDeviceShaderAtomicFloatFeaturesEXT}, {@link VkPhysicalDeviceShaderAtomicInt64Features}, {@link VkPhysicalDeviceShaderClockFeaturesKHR}, {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT}, {@link VkPhysicalDeviceShaderDrawParametersFeatures}, {@link VkPhysicalDeviceShaderFloat16Int8Features}, {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT}, {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV}, {@link VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR}, {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL}, {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV}, {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures}, {@link VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR}, {@link VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR}, {@link VkPhysicalDeviceShadingRateImageFeaturesNV}, {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT}, {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI}, {@link VkPhysicalDeviceSynchronization2FeaturesKHR}, {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT}, {@link VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT}, {@link VkPhysicalDeviceTimelineSemaphoreFeatures}, {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT}, {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures}, {@link VkPhysicalDeviceVariablePointersFeatures}, {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT}, {@link VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT}, {@link VkPhysicalDeviceVulkan11Features}, {@link VkPhysicalDeviceVulkan12Features}, {@link VkPhysicalDeviceVulkanMemoryModelFeatures}, {@link VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR}, {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT}, {@link VkPhysicalDeviceYcbcrImageArraysFeaturesEXT}, or {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique, with the exception of structures of type {@link VkDeviceDeviceMemoryReportCreateInfoEXT} or {@link VkDevicePrivateDataCreateInfoEXT}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code pQueueCreateInfos} <b>must</b> be a valid pointer to an array of {@code queueCreateInfoCount} valid {@link VkDeviceQueueCreateInfo} structures</li>
 * <li>If {@code enabledLayerCount} is not 0, {@code ppEnabledLayerNames} <b>must</b> be a valid pointer to an array of {@code enabledLayerCount} null-terminated UTF-8 strings</li>
 * <li>If {@code enabledExtensionCount} is not 0, {@code ppEnabledExtensionNames} <b>must</b> be a valid pointer to an array of {@code enabledExtensionCount} null-terminated UTF-8 strings</li>
 * <li>If {@code pEnabledFeatures} is not {@code NULL}, {@code pEnabledFeatures} <b>must</b> be a valid pointer to a valid {@link VkPhysicalDeviceFeatures} structure</li>
 * <li>{@code queueCreateInfoCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDeviceQueueCreateInfo}, {@link VkPhysicalDeviceFeatures}, {@link VK10#vkCreateDevice CreateDevice}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDeviceCreateFlags {@link #flags};
 *     uint32_t {@link #queueCreateInfoCount};
 *     {@link VkDeviceQueueCreateInfo VkDeviceQueueCreateInfo} const * {@link #pQueueCreateInfos};
 *     uint32_t {@link #enabledLayerCount};
 *     char const * const * {@link #ppEnabledLayerNames};
 *     uint32_t {@link #enabledExtensionCount};
 *     char const * const * {@link #ppEnabledExtensionNames};
 *     {@link VkPhysicalDeviceFeatures VkPhysicalDeviceFeatures} const * {@link #pEnabledFeatures};
 * }</code></pre>
 */
public class VkDeviceCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        QUEUECREATEINFOCOUNT,
        PQUEUECREATEINFOS,
        ENABLEDLAYERCOUNT,
        PPENABLEDLAYERNAMES,
        ENABLEDEXTENSIONCOUNT,
        PPENABLEDEXTENSIONNAMES,
        PENABLEDFEATURES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        QUEUECREATEINFOCOUNT = layout.offsetof(3);
        PQUEUECREATEINFOS = layout.offsetof(4);
        ENABLEDLAYERCOUNT = layout.offsetof(5);
        PPENABLEDLAYERNAMES = layout.offsetof(6);
        ENABLEDEXTENSIONCOUNT = layout.offsetof(7);
        PPENABLEDEXTENSIONNAMES = layout.offsetof(8);
        PENABLEDFEATURES = layout.offsetof(9);
    }

    /**
     * Creates a {@code VkDeviceCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceCreateInfo(ByteBuffer container) {
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
    /** reserved for future use. */
    @NativeType("VkDeviceCreateFlags")
    public int flags() { return nflags(address()); }
    /** the unsigned integer size of the {@code pQueueCreateInfos} array. Refer to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-queue-creation">Queue Creation</a> section below for further details. */
    @NativeType("uint32_t")
    public int queueCreateInfoCount() { return nqueueCreateInfoCount(address()); }
    /** a pointer to an array of {@link VkDeviceQueueCreateInfo} structures describing the queues that are requested to be created along with the logical device. Refer to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-queue-creation">Queue Creation</a> section below for further details. */
    @NativeType("VkDeviceQueueCreateInfo const *")
    public VkDeviceQueueCreateInfo.Buffer pQueueCreateInfos() { return npQueueCreateInfos(address()); }
    /** deprecated and ignored. */
    @NativeType("uint32_t")
    public int enabledLayerCount() { return nenabledLayerCount(address()); }
    /** deprecated and ignored. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#extendingvulkan-layers-devicelayerdeprecation">Device Layer Deprecation</a>. */
    @Nullable
    @NativeType("char const * const *")
    public PointerBuffer ppEnabledLayerNames() { return nppEnabledLayerNames(address()); }
    /** the number of device extensions to enable. */
    @NativeType("uint32_t")
    public int enabledExtensionCount() { return nenabledExtensionCount(address()); }
    /** a pointer to an array of {@code enabledExtensionCount} null-terminated UTF-8 strings containing the names of extensions to enable for the created device. See the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#extendingvulkan-extensions">Extensions</a> section for further details. */
    @Nullable
    @NativeType("char const * const *")
    public PointerBuffer ppEnabledExtensionNames() { return nppEnabledExtensionNames(address()); }
    /** {@code NULL} or a pointer to a {@link VkPhysicalDeviceFeatures} structure containing boolean indicators of all the features to be enabled. Refer to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features">Features</a> section for further details. */
    @Nullable
    @NativeType("VkPhysicalDeviceFeatures const *")
    public VkPhysicalDeviceFeatures pEnabledFeatures() { return npEnabledFeatures(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDeviceCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDeviceCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkDeviceCreateInfo flags(@NativeType("VkDeviceCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkDeviceQueueCreateInfo.Buffer} to the {@link #pQueueCreateInfos} field. */
    public VkDeviceCreateInfo pQueueCreateInfos(@NativeType("VkDeviceQueueCreateInfo const *") VkDeviceQueueCreateInfo.Buffer value) { npQueueCreateInfos(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #ppEnabledLayerNames} field. */
    public VkDeviceCreateInfo ppEnabledLayerNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { nppEnabledLayerNames(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #ppEnabledExtensionNames} field. */
    public VkDeviceCreateInfo ppEnabledExtensionNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { nppEnabledExtensionNames(address(), value); return this; }
    /** Sets the address of the specified {@link VkPhysicalDeviceFeatures} to the {@link #pEnabledFeatures} field. */
    public VkDeviceCreateInfo pEnabledFeatures(@Nullable @NativeType("VkPhysicalDeviceFeatures const *") VkPhysicalDeviceFeatures value) { npEnabledFeatures(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceCreateInfo set(
        int sType,
        long pNext,
        int flags,
        VkDeviceQueueCreateInfo.Buffer pQueueCreateInfos,
        @Nullable PointerBuffer ppEnabledLayerNames,
        @Nullable PointerBuffer ppEnabledExtensionNames,
        @Nullable VkPhysicalDeviceFeatures pEnabledFeatures
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pQueueCreateInfos(pQueueCreateInfos);
        ppEnabledLayerNames(ppEnabledLayerNames);
        ppEnabledExtensionNames(ppEnabledExtensionNames);
        pEnabledFeatures(pEnabledFeatures);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceCreateInfo set(VkDeviceCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceCreateInfo malloc() {
        return wrap(VkDeviceCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceCreateInfo calloc() {
        return wrap(VkDeviceCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkDeviceCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceCreateInfo} instance for the specified memory address. */
    public static VkDeviceCreateInfo create(long address) {
        return wrap(VkDeviceCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkDeviceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDeviceCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceCreateInfo malloc(MemoryStack stack) {
        return wrap(VkDeviceCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceCreateInfo calloc(MemoryStack stack) {
        return wrap(VkDeviceCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkDeviceCreateInfo.FLAGS); }
    /** Unsafe version of {@link #queueCreateInfoCount}. */
    public static int nqueueCreateInfoCount(long struct) { return UNSAFE.getInt(null, struct + VkDeviceCreateInfo.QUEUECREATEINFOCOUNT); }
    /** Unsafe version of {@link #pQueueCreateInfos}. */
    public static VkDeviceQueueCreateInfo.Buffer npQueueCreateInfos(long struct) { return VkDeviceQueueCreateInfo.create(memGetAddress(struct + VkDeviceCreateInfo.PQUEUECREATEINFOS), nqueueCreateInfoCount(struct)); }
    /** Unsafe version of {@link #enabledLayerCount}. */
    public static int nenabledLayerCount(long struct) { return UNSAFE.getInt(null, struct + VkDeviceCreateInfo.ENABLEDLAYERCOUNT); }
    /** Unsafe version of {@link #ppEnabledLayerNames() ppEnabledLayerNames}. */
    @Nullable public static PointerBuffer nppEnabledLayerNames(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkDeviceCreateInfo.PPENABLEDLAYERNAMES), nenabledLayerCount(struct)); }
    /** Unsafe version of {@link #enabledExtensionCount}. */
    public static int nenabledExtensionCount(long struct) { return UNSAFE.getInt(null, struct + VkDeviceCreateInfo.ENABLEDEXTENSIONCOUNT); }
    /** Unsafe version of {@link #ppEnabledExtensionNames() ppEnabledExtensionNames}. */
    @Nullable public static PointerBuffer nppEnabledExtensionNames(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkDeviceCreateInfo.PPENABLEDEXTENSIONNAMES), nenabledExtensionCount(struct)); }
    /** Unsafe version of {@link #pEnabledFeatures}. */
    @Nullable public static VkPhysicalDeviceFeatures npEnabledFeatures(long struct) { return VkPhysicalDeviceFeatures.createSafe(memGetAddress(struct + VkDeviceCreateInfo.PENABLEDFEATURES)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceCreateInfo.FLAGS, value); }
    /** Sets the specified value to the {@code queueCreateInfoCount} field of the specified {@code struct}. */
    public static void nqueueCreateInfoCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceCreateInfo.QUEUECREATEINFOCOUNT, value); }
    /** Unsafe version of {@link #pQueueCreateInfos(VkDeviceQueueCreateInfo.Buffer) pQueueCreateInfos}. */
    public static void npQueueCreateInfos(long struct, VkDeviceQueueCreateInfo.Buffer value) { memPutAddress(struct + VkDeviceCreateInfo.PQUEUECREATEINFOS, value.address()); nqueueCreateInfoCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code enabledLayerCount} field of the specified {@code struct}. */
    public static void nenabledLayerCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceCreateInfo.ENABLEDLAYERCOUNT, value); }
    /** Unsafe version of {@link #ppEnabledLayerNames(PointerBuffer) ppEnabledLayerNames}. */
    public static void nppEnabledLayerNames(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkDeviceCreateInfo.PPENABLEDLAYERNAMES, memAddressSafe(value)); nenabledLayerCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code enabledExtensionCount} field of the specified {@code struct}. */
    public static void nenabledExtensionCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceCreateInfo.ENABLEDEXTENSIONCOUNT, value); }
    /** Unsafe version of {@link #ppEnabledExtensionNames(PointerBuffer) ppEnabledExtensionNames}. */
    public static void nppEnabledExtensionNames(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkDeviceCreateInfo.PPENABLEDEXTENSIONNAMES, memAddressSafe(value)); nenabledExtensionCount(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #pEnabledFeatures(VkPhysicalDeviceFeatures) pEnabledFeatures}. */
    public static void npEnabledFeatures(long struct, @Nullable VkPhysicalDeviceFeatures value) { memPutAddress(struct + VkDeviceCreateInfo.PENABLEDFEATURES, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int queueCreateInfoCount = nqueueCreateInfoCount(struct);
        long pQueueCreateInfos = memGetAddress(struct + VkDeviceCreateInfo.PQUEUECREATEINFOS);
        check(pQueueCreateInfos);
        VkDeviceQueueCreateInfo.validate(pQueueCreateInfos, queueCreateInfoCount);
        if (nenabledLayerCount(struct) != 0) {
            check(memGetAddress(struct + VkDeviceCreateInfo.PPENABLEDLAYERNAMES));
        }
        if (nenabledExtensionCount(struct) != 0) {
            check(memGetAddress(struct + VkDeviceCreateInfo.PPENABLEDEXTENSIONNAMES));
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkDeviceCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkDeviceCreateInfo, Buffer> implements NativeResource {

        private static final VkDeviceCreateInfo ELEMENT_FACTORY = VkDeviceCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkDeviceCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkDeviceCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkDeviceCreateInfo#flags} field. */
        @NativeType("VkDeviceCreateFlags")
        public int flags() { return VkDeviceCreateInfo.nflags(address()); }
        /** @return the value of the {@link VkDeviceCreateInfo#queueCreateInfoCount} field. */
        @NativeType("uint32_t")
        public int queueCreateInfoCount() { return VkDeviceCreateInfo.nqueueCreateInfoCount(address()); }
        /** @return a {@link VkDeviceQueueCreateInfo.Buffer} view of the struct array pointed to by the {@link VkDeviceCreateInfo#pQueueCreateInfos} field. */
        @NativeType("VkDeviceQueueCreateInfo const *")
        public VkDeviceQueueCreateInfo.Buffer pQueueCreateInfos() { return VkDeviceCreateInfo.npQueueCreateInfos(address()); }
        /** @return the value of the {@link VkDeviceCreateInfo#enabledLayerCount} field. */
        @NativeType("uint32_t")
        public int enabledLayerCount() { return VkDeviceCreateInfo.nenabledLayerCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link VkDeviceCreateInfo#ppEnabledLayerNames} field. */
        @Nullable
        @NativeType("char const * const *")
        public PointerBuffer ppEnabledLayerNames() { return VkDeviceCreateInfo.nppEnabledLayerNames(address()); }
        /** @return the value of the {@link VkDeviceCreateInfo#enabledExtensionCount} field. */
        @NativeType("uint32_t")
        public int enabledExtensionCount() { return VkDeviceCreateInfo.nenabledExtensionCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link VkDeviceCreateInfo#ppEnabledExtensionNames} field. */
        @Nullable
        @NativeType("char const * const *")
        public PointerBuffer ppEnabledExtensionNames() { return VkDeviceCreateInfo.nppEnabledExtensionNames(address()); }
        /** @return a {@link VkPhysicalDeviceFeatures} view of the struct pointed to by the {@link VkDeviceCreateInfo#pEnabledFeatures} field. */
        @Nullable
        @NativeType("VkPhysicalDeviceFeatures const *")
        public VkPhysicalDeviceFeatures pEnabledFeatures() { return VkDeviceCreateInfo.npEnabledFeatures(address()); }

        /** Sets the specified value to the {@link VkDeviceCreateInfo#sType} field. */
        public VkDeviceCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceCreateInfo#pNext} field. */
        public VkDeviceCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkDeviceCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceCreateInfo#flags} field. */
        public VkDeviceCreateInfo.Buffer flags(@NativeType("VkDeviceCreateFlags") int value) { VkDeviceCreateInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkDeviceQueueCreateInfo.Buffer} to the {@link VkDeviceCreateInfo#pQueueCreateInfos} field. */
        public VkDeviceCreateInfo.Buffer pQueueCreateInfos(@NativeType("VkDeviceQueueCreateInfo const *") VkDeviceQueueCreateInfo.Buffer value) { VkDeviceCreateInfo.npQueueCreateInfos(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link VkDeviceCreateInfo#ppEnabledLayerNames} field. */
        public VkDeviceCreateInfo.Buffer ppEnabledLayerNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { VkDeviceCreateInfo.nppEnabledLayerNames(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link VkDeviceCreateInfo#ppEnabledExtensionNames} field. */
        public VkDeviceCreateInfo.Buffer ppEnabledExtensionNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { VkDeviceCreateInfo.nppEnabledExtensionNames(address(), value); return this; }
        /** Sets the address of the specified {@link VkPhysicalDeviceFeatures} to the {@link VkDeviceCreateInfo#pEnabledFeatures} field. */
        public VkDeviceCreateInfo.Buffer pEnabledFeatures(@Nullable @NativeType("VkPhysicalDeviceFeatures const *") VkPhysicalDeviceFeatures value) { VkDeviceCreateInfo.npEnabledFeatures(address(), value); return this; }

    }

}