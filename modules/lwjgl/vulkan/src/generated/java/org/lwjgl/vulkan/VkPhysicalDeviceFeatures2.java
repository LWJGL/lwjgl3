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
 * Structure describing the fine-grained features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@code pNext} chain of this structure is used to extend the structure with features defined by extensions. This structure <b>can</b> be used in {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2} or <b>can</b> be included in the {@code pNext} chain of a {@link VkDeviceCreateInfo} structure, in which case it controls which features are enabled in the device in lieu of {@code pEnabledFeatures}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPhysicalDeviceFeatures}, {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceFeatures2KHR GetPhysicalDeviceFeatures2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFeatures2 {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkPhysicalDeviceFeatures VkPhysicalDeviceFeatures} {@link #features};
 * }</code></pre>
 */
public class VkPhysicalDeviceFeatures2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FEATURES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkPhysicalDeviceFeatures.SIZEOF, VkPhysicalDeviceFeatures.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FEATURES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFeatures2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFeatures2(ByteBuffer container) {
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
    /** a {@link VkPhysicalDeviceFeatures} structure describing the fine-grained features of the Vulkan 1.0 API. */
    public VkPhysicalDeviceFeatures features() { return nfeatures(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceFeatures2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2} value to the {@link #sType} field. */
    public VkPhysicalDeviceFeatures2 sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceFeatures2 pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPhysicalDevice16BitStorageFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevice16BitStorageFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevice16BitStorageFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevice16BitStorageFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevice4444FormatsFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevice4444FormatsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevice8BitStorageFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevice8BitStorageFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevice8BitStorageFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevice8BitStorageFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceASTCDecodeFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceASTCDecodeFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceAccelerationStructureFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceBorderColorSwizzleFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceBufferAddressFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceBufferAddressFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceBufferDeviceAddressFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceBufferDeviceAddressFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceBufferDeviceAddressFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceBufferDeviceAddressFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceBufferDeviceAddressFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCoherentMemoryFeaturesAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceColorWriteEnableFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceComputeShaderDerivativesFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceConditionalRenderingFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCooperativeMatrixFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCornerSampledImageFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCornerSampledImageFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCoverageReductionModeFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCustomBorderColorFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDepthClipControlFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDepthClipControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDepthClipEnableFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDescriptorIndexingFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDescriptorIndexingFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDescriptorIndexingFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDeviceMemoryReportFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDeviceMemoryReportFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDiagnosticsConfigFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDynamicRenderingFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDynamicRenderingFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExclusiveScissorFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceExclusiveScissorFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceExtendedDynamicStateFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceExternalMemoryRDMAFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFloat16Int8FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFloat16Int8FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentDensityMap2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentDensityMapFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentShadingRateFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceHostQueryResetFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceHostQueryResetFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceHostQueryResetFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceHostQueryResetFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageRobustnessFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageRobustnessFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageRobustnessFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageRobustnessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageViewMinLodFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageViewMinLodFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImagelessFramebufferFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImagelessFramebufferFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImagelessFramebufferFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImagelessFramebufferFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceIndexTypeUint8FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceInheritedViewportScissorFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceInheritedViewportScissorFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceInlineUniformBlockFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceInlineUniformBlockFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceInlineUniformBlockFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceInvocationMaskFeaturesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceLineRasterizationFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceLineRasterizationFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceLinearColorAttachmentFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance4Features} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance4Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance4FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance4FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMemoryPriorityFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMeshShaderFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMeshShaderFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMultiDrawFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMultiDrawFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMultiviewFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMultiviewFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMultiviewFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMultiviewFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePerformanceQueryFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePerformanceQueryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineCreationCacheControlFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineCreationCacheControlFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePortabilitySubsetFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePresentIdFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePresentIdFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePresentWaitFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePresentWaitFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePrivateDataFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePrivateDataFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePrivateDataFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePrivateDataFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceProtectedMemoryFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceProtectedMemoryFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceProvokingVertexFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceProvokingVertexFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayQueryFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayQueryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayTracingMotionBlurFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayTracingPipelineFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRobustness2FeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRobustness2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSamplerYcbcrConversionFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceScalarBlockLayoutFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceScalarBlockLayoutFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceScalarBlockLayoutFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceScalarBlockLayoutFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicFloatFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderAtomicFloatFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicInt64Features} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderAtomicInt64Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderAtomicInt64FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderClockFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderClockFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderDrawParameterFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderDrawParameterFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderDrawParametersFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderDrawParametersFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderFloat16Int8Features} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderFloat16Int8Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderFloat16Int8FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderFloat16Int8FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderImageFootprintFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderIntegerDotProductFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderIntegerDotProductFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderSMBuiltinsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderTerminateInvocationFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderTerminateInvocationFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShadingRateImageFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShadingRateImageFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSubgroupSizeControlFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSubgroupSizeControlFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSubgroupSizeControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSubpassShadingFeaturesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSynchronization2Features} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSynchronization2Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSynchronization2FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSynchronization2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTextureCompressionASTCHDRFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTimelineSemaphoreFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTimelineSemaphoreFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTimelineSemaphoreFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTimelineSemaphoreFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTransformFeedbackFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceUniformBufferStandardLayoutFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVariablePointerFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVariablePointerFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVariablePointerFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVariablePointerFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVariablePointersFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVariablePointersFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVariablePointersFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVariablePointersFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVulkan11Features} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVulkan11Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVulkan12Features} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVulkan12Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVulkan13Features} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVulkan13Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVulkanMemoryModelFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVulkanMemoryModelFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVulkanMemoryModelFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceYcbcrImageArraysFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceYcbcrImageArraysFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Copies the specified {@link VkPhysicalDeviceFeatures} to the {@link #features} field. */
    public VkPhysicalDeviceFeatures2 features(VkPhysicalDeviceFeatures value) { nfeatures(address(), value); return this; }
    /** Passes the {@link #features} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkPhysicalDeviceFeatures2 features(java.util.function.Consumer<VkPhysicalDeviceFeatures> consumer) { consumer.accept(features()); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFeatures2 set(
        int sType,
        long pNext,
        VkPhysicalDeviceFeatures features
    ) {
        sType(sType);
        pNext(pNext);
        features(features);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFeatures2 set(VkPhysicalDeviceFeatures2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFeatures2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFeatures2 malloc() {
        return wrap(VkPhysicalDeviceFeatures2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFeatures2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFeatures2 calloc() {
        return wrap(VkPhysicalDeviceFeatures2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFeatures2} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFeatures2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceFeatures2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFeatures2} instance for the specified memory address. */
    public static VkPhysicalDeviceFeatures2 create(long address) {
        return wrap(VkPhysicalDeviceFeatures2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFeatures2 createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceFeatures2.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceFeatures2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFeatures2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures2 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures2 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures2 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures2 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures2.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures2.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures2.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures2.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceFeatures2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFeatures2 malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFeatures2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFeatures2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFeatures2 calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFeatures2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFeatures2.PNEXT); }
    /** Unsafe version of {@link #features}. */
    public static VkPhysicalDeviceFeatures nfeatures(long struct) { return VkPhysicalDeviceFeatures.create(struct + VkPhysicalDeviceFeatures2.FEATURES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFeatures2.PNEXT, value); }
    /** Unsafe version of {@link #features(VkPhysicalDeviceFeatures) features}. */
    public static void nfeatures(long struct, VkPhysicalDeviceFeatures value) { memCopy(value.address(), struct + VkPhysicalDeviceFeatures2.FEATURES, VkPhysicalDeviceFeatures.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFeatures2} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFeatures2, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFeatures2 ELEMENT_FACTORY = VkPhysicalDeviceFeatures2.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFeatures2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFeatures2#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceFeatures2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceFeatures2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFeatures2.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFeatures2#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFeatures2.npNext(address()); }
        /** @return a {@link VkPhysicalDeviceFeatures} view of the {@link VkPhysicalDeviceFeatures2#features} field. */
        public VkPhysicalDeviceFeatures features() { return VkPhysicalDeviceFeatures2.nfeatures(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures2#sType} field. */
        public VkPhysicalDeviceFeatures2.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFeatures2.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2} value to the {@link VkPhysicalDeviceFeatures2#sType} field. */
        public VkPhysicalDeviceFeatures2.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2); }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures2#pNext} field. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFeatures2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPhysicalDevice16BitStorageFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevice16BitStorageFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevice16BitStorageFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevice16BitStorageFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevice4444FormatsFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevice4444FormatsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevice8BitStorageFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevice8BitStorageFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevice8BitStorageFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevice8BitStorageFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceASTCDecodeFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceASTCDecodeFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceAccelerationStructureFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceBorderColorSwizzleFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceBufferAddressFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceBufferAddressFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceBufferDeviceAddressFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceBufferDeviceAddressFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceBufferDeviceAddressFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceBufferDeviceAddressFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceBufferDeviceAddressFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCoherentMemoryFeaturesAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceColorWriteEnableFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceComputeShaderDerivativesFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceConditionalRenderingFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCooperativeMatrixFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCornerSampledImageFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCornerSampledImageFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCoverageReductionModeFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCustomBorderColorFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDepthClipControlFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDepthClipControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDepthClipEnableFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDescriptorIndexingFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDescriptorIndexingFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDescriptorIndexingFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDeviceMemoryReportFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDeviceMemoryReportFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDiagnosticsConfigFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDynamicRenderingFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDynamicRenderingFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExclusiveScissorFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceExclusiveScissorFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceExtendedDynamicStateFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceExternalMemoryRDMAFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFloat16Int8FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFloat16Int8FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFragmentDensityMap2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFragmentDensityMapFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFragmentShadingRateFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceHostQueryResetFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceHostQueryResetFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceHostQueryResetFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceHostQueryResetFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageRobustnessFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceImageRobustnessFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageRobustnessFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceImageRobustnessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageViewMinLodFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceImageViewMinLodFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImagelessFramebufferFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceImagelessFramebufferFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImagelessFramebufferFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceImagelessFramebufferFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceIndexTypeUint8FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceInheritedViewportScissorFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceInheritedViewportScissorFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceInlineUniformBlockFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceInlineUniformBlockFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceInlineUniformBlockFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceInvocationMaskFeaturesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceLineRasterizationFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceLineRasterizationFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceLinearColorAttachmentFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance4Features} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMaintenance4Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance4FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMaintenance4FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMemoryPriorityFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMeshShaderFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMeshShaderFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMultiDrawFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMultiDrawFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMultiviewFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMultiviewFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMultiviewFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMultiviewFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePerformanceQueryFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePerformanceQueryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineCreationCacheControlFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePipelineCreationCacheControlFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePortabilitySubsetFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePresentIdFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePresentIdFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePresentWaitFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePresentWaitFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePrivateDataFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePrivateDataFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePrivateDataFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePrivateDataFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceProtectedMemoryFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceProtectedMemoryFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceProvokingVertexFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceProvokingVertexFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayQueryFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRayQueryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRayTracingMotionBlurFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRayTracingPipelineFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRobustness2FeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRobustness2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSamplerYcbcrConversionFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceScalarBlockLayoutFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceScalarBlockLayoutFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceScalarBlockLayoutFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceScalarBlockLayoutFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicFloatFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderAtomicFloatFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicInt64Features} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderAtomicInt64Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderAtomicInt64FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderClockFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderClockFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderDrawParameterFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderDrawParameterFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderDrawParametersFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderDrawParametersFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderFloat16Int8Features} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderFloat16Int8Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderFloat16Int8FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderFloat16Int8FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderImageFootprintFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderIntegerDotProductFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderIntegerDotProductFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderSMBuiltinsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderTerminateInvocationFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderTerminateInvocationFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShadingRateImageFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShadingRateImageFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSubgroupSizeControlFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSubgroupSizeControlFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSubgroupSizeControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSubpassShadingFeaturesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSynchronization2Features} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSynchronization2Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSynchronization2FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSynchronization2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceTextureCompressionASTCHDRFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTimelineSemaphoreFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceTimelineSemaphoreFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTimelineSemaphoreFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceTimelineSemaphoreFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceTransformFeedbackFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceUniformBufferStandardLayoutFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVariablePointerFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVariablePointerFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVariablePointerFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVariablePointerFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVariablePointersFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVariablePointersFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVariablePointersFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVariablePointersFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVulkan11Features} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVulkan11Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVulkan12Features} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVulkan12Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVulkan13Features} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVulkan13Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVulkanMemoryModelFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVulkanMemoryModelFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVulkanMemoryModelFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceYcbcrImageArraysFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceYcbcrImageArraysFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Copies the specified {@link VkPhysicalDeviceFeatures} to the {@link VkPhysicalDeviceFeatures2#features} field. */
        public VkPhysicalDeviceFeatures2.Buffer features(VkPhysicalDeviceFeatures value) { VkPhysicalDeviceFeatures2.nfeatures(address(), value); return this; }
        /** Passes the {@link VkPhysicalDeviceFeatures2#features} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkPhysicalDeviceFeatures2.Buffer features(java.util.function.Consumer<VkPhysicalDeviceFeatures> consumer) { consumer.accept(features()); return this; }

    }

}