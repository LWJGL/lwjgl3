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
 * <pre><code>
 * struct VkPhysicalDeviceFeatures2 {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkPhysicalDeviceFeatures VkPhysicalDeviceFeatures} features;
 * }</code></pre>
 */
public class VkPhysicalDeviceFeatures2 extends Struct<VkPhysicalDeviceFeatures2> implements NativeResource {

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

    protected VkPhysicalDeviceFeatures2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceFeatures2 create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceFeatures2(address, container);
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return a {@link VkPhysicalDeviceFeatures} view of the {@code features} field. */
    public VkPhysicalDeviceFeatures features() { return nfeatures(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceFeatures2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2} value to the {@code sType} field. */
    public VkPhysicalDeviceFeatures2 sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2); }
    /** Sets the specified value to the {@code pNext} field. */
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
    /** Prepends the specified {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceAddressBindingReportFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceAmigoProfilingFeaturesSEC} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceAmigoProfilingFeaturesSEC value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceAntiLagFeaturesAMD} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceAntiLagFeaturesAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
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
    /** Prepends the specified {@link VkPhysicalDeviceClusterAccelerationStructureFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceClusterAccelerationStructureFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCoherentMemoryFeaturesAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceColorWriteEnableFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCommandBufferInheritanceFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCommandBufferInheritanceFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceComputeShaderDerivativesFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceConditionalRenderingFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCooperativeMatrix2FeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCooperativeMatrix2FeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCooperativeMatrixFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCooperativeMatrixFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCooperativeMatrixFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCooperativeVectorFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCooperativeVectorFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCopyMemoryIndirectFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCopyMemoryIndirectFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCornerSampledImageFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCornerSampledImageFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCoverageReductionModeFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCubicClampFeaturesQCOM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCubicClampFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCubicWeightsFeaturesQCOM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCubicWeightsFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCudaKernelLaunchFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCudaKernelLaunchFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCustomBorderColorFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCustomResolveFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceCustomResolveFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDataGraphFeaturesARM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDataGraphFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDataGraphModelFeaturesQCOM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDataGraphModelFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDepthBiasControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDepthClampControlFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDepthClampControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDepthClampZeroOneFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDepthClampZeroOneFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDepthClampZeroOneFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDepthClipControlFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDepthClipControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDepthClipEnableFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDescriptorBufferFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDescriptorBufferTensorFeaturesARM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDescriptorBufferTensorFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDescriptorHeapFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDescriptorHeapFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDescriptorIndexingFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDescriptorIndexingFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDescriptorIndexingFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDeviceMemoryReportFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDeviceMemoryReportFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDiagnosticsConfigFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDisplacementMicromapFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDisplacementMicromapFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDynamicRenderingFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDynamicRenderingFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingLocalReadFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDynamicRenderingLocalReadFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExclusiveScissorFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceExclusiveScissorFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceExtendedDynamicState3FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceExtendedDynamicStateFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExternalFormatResolveFeaturesANDROID} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceExternalFormatResolveFeaturesANDROID value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceExternalMemoryRDMAFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFaultFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFaultFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFloat16Int8FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFloat16Int8FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFormatPackFeaturesARM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFormatPackFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentDensityMap2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentDensityMapFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFragmentShadingRateFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceFrameBoundaryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceGlobalPriorityQueryFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceGlobalPriorityQueryFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceHdrVividFeaturesHUAWEI} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceHdrVividFeaturesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceHostImageCopyFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceHostImageCopyFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceHostImageCopyFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceHostImageCopyFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceHostQueryResetFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceHostQueryResetFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceHostQueryResetFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceHostQueryResetFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImage2DViewOf3DFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageAlignmentControlFeaturesMESA} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageAlignmentControlFeaturesMESA value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageCompressionControlFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageCompressionControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageProcessing2FeaturesQCOM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageProcessing2FeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageProcessingFeaturesQCOM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageProcessingFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageRobustnessFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageRobustnessFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageRobustnessFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageRobustnessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageViewMinLodFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImageViewMinLodFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImagelessFramebufferFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImagelessFramebufferFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImagelessFramebufferFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceImagelessFramebufferFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceIndexTypeUint8Features} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceIndexTypeUint8Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceIndexTypeUint8FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceIndexTypeUint8FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceIndexTypeUint8FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceInheritedViewportScissorFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceInheritedViewportScissorFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceInlineUniformBlockFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceInlineUniformBlockFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceInlineUniformBlockFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceInvocationMaskFeaturesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceLegacyDitheringFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceLineRasterizationFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceLineRasterizationFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceLineRasterizationFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceLineRasterizationFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceLineRasterizationFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceLineRasterizationFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceLinearColorAttachmentFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance10FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance10FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance4Features} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance4Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance4FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance4FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance5Features} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance5Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance5FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance5FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance6Features} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance6Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance6FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance6FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance7FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance7FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance8FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance8FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance9FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMaintenance9FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMapMemoryPlacedFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMapMemoryPlacedFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMemoryDecompressionFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMemoryDecompressionFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMemoryDecompressionFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMemoryPriorityFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMeshShaderFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMeshShaderFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMeshShaderFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMeshShaderFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMultiDrawFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMultiDrawFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMultiviewFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMultiviewFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMultiviewFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMultiviewFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceNestedCommandBufferFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceNestedCommandBufferFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceOpacityMicromapFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceOpticalFlowFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceOpticalFlowFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePerStageDescriptorSetFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePerStageDescriptorSetFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePerformanceCountersByRegionFeaturesARM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePerformanceCountersByRegionFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePerformanceQueryFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePerformanceQueryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineBinaryFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineBinaryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineCreationCacheControlFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineCreationCacheControlFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineOpacityMicromapFeaturesARM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineOpacityMicromapFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelinePropertiesFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineProtectedAccessFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineProtectedAccessFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineProtectedAccessFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineProtectedAccessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineRobustnessFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineRobustnessFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePipelineRobustnessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePortabilitySubsetFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePresentBarrierFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePresentBarrierFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePresentId2FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePresentId2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePresentIdFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePresentIdFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePresentMeteringFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePresentMeteringFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePresentTimingFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePresentTimingFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePresentWait2FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePresentWait2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePresentWaitFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePresentWaitFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePrivateDataFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePrivateDataFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePrivateDataFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePrivateDataFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceProtectedMemoryFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceProtectedMemoryFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceProvokingVertexFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceProvokingVertexFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePushConstantBankFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDevicePushConstantBankFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRawAccessChainsFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRawAccessChainsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayQueryFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayQueryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayTracingMotionBlurFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayTracingPipelineFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayTracingValidationFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRayTracingValidationFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRenderPassStripedFeaturesARM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRenderPassStripedFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRobustness2FeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRobustness2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRobustness2FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceRobustness2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSamplerYcbcrConversionFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceScalarBlockLayoutFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceScalarBlockLayoutFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceScalarBlockLayoutFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceScalarBlockLayoutFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSchedulingControlsFeaturesARM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSchedulingControlsFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShader64BitIndexingFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShader64BitIndexingFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicFloatFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderAtomicFloatFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicInt64Features} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderAtomicInt64Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderAtomicInt64FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderBfloat16FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderBfloat16FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderClockFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderClockFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderDrawParameterFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderDrawParameterFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderDrawParametersFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderDrawParametersFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderEnqueueFeaturesAMDX} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderEnqueueFeaturesAMDX value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderExpectAssumeFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderExpectAssumeFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderExpectAssumeFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderFloat16Int8Features} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderFloat16Int8Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderFloat16Int8FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderFloat16Int8FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderFloat8FeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderFloat8FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderFloatControls2Features} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderFloatControls2Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderFloatControls2FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderFloatControls2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderFmaFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderFmaFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
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
    /** Prepends the specified {@link VkPhysicalDeviceShaderLongVectorFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderLongVectorFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderObjectFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderObjectFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderQuadControlFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderQuadControlFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderSMBuiltinsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupRotateFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderSubgroupRotateFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderTerminateInvocationFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderTerminateInvocationFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderTileImageFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderTileImageFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderUntypedPointersFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShaderUntypedPointersFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShadingRateImageFeaturesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceShadingRateImageFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSubgroupSizeControlFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSubgroupSizeControlFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSubgroupSizeControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSubpassShadingFeaturesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSynchronization2Features} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSynchronization2Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSynchronization2FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceSynchronization2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTensorFeaturesARM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTensorFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTextureCompressionASTCHDRFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTileMemoryHeapFeaturesQCOM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTileMemoryHeapFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTilePropertiesFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTileShadingFeaturesQCOM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTileShadingFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTimelineSemaphoreFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTimelineSemaphoreFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTimelineSemaphoreFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTimelineSemaphoreFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceTransformFeedbackFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
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
    /** Prepends the specified {@link VkPhysicalDeviceVertexAttributeDivisorFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVertexAttributeDivisorFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVideoDecodeVP9FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVideoDecodeVP9FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVideoEncodeAV1FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVideoEncodeAV1FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVideoMaintenance1FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVideoMaintenance1FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVideoMaintenance2FeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVideoMaintenance2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVulkan11Features} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVulkan11Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVulkan12Features} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVulkan12Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVulkan13Features} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVulkan13Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVulkan14Features} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVulkan14Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVulkanMemoryModelFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVulkanMemoryModelFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceVulkanMemoryModelFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceYcbcrDegammaFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceYcbcrImageArraysFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceYcbcrImageArraysFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceFeatures2 pNext(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Copies the specified {@link VkPhysicalDeviceFeatures} to the {@code features} field. */
    public VkPhysicalDeviceFeatures2 features(VkPhysicalDeviceFeatures value) { nfeatures(address(), value); return this; }
    /** Passes the {@code features} field to the specified {@link java.util.function.Consumer Consumer}. */
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
        return new VkPhysicalDeviceFeatures2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFeatures2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFeatures2 calloc() {
        return new VkPhysicalDeviceFeatures2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFeatures2} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFeatures2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFeatures2(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFeatures2} instance for the specified memory address. */
    public static VkPhysicalDeviceFeatures2 create(long address) {
        return new VkPhysicalDeviceFeatures2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceFeatures2 createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceFeatures2(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceFeatures2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceFeatures2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFeatures2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFeatures2 malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFeatures2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFeatures2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFeatures2 calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFeatures2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFeatures2.PNEXT); }
    /** Unsafe version of {@link #features}. */
    public static VkPhysicalDeviceFeatures nfeatures(long struct) { return VkPhysicalDeviceFeatures.create(struct + VkPhysicalDeviceFeatures2.FEATURES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures2.STYPE, value); }
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
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFeatures2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceFeatures2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFeatures2.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFeatures2.npNext(address()); }
        /** @return a {@link VkPhysicalDeviceFeatures} view of the {@code features} field. */
        public VkPhysicalDeviceFeatures features() { return VkPhysicalDeviceFeatures2.nfeatures(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceFeatures2.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFeatures2.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2} value to the {@code sType} field. */
        public VkPhysicalDeviceFeatures2.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2); }
        /** Sets the specified value to the {@code pNext} field. */
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
        /** Prepends the specified {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceAddressBindingReportFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceAmigoProfilingFeaturesSEC} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceAmigoProfilingFeaturesSEC value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceAntiLagFeaturesAMD} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceAntiLagFeaturesAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
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
        /** Prepends the specified {@link VkPhysicalDeviceClusterAccelerationStructureFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceClusterAccelerationStructureFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCoherentMemoryFeaturesAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceColorWriteEnableFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCommandBufferInheritanceFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCommandBufferInheritanceFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceComputeShaderDerivativesFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceConditionalRenderingFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCooperativeMatrix2FeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCooperativeMatrix2FeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCooperativeMatrixFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCooperativeMatrixFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCooperativeMatrixFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCooperativeVectorFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCooperativeVectorFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCopyMemoryIndirectFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCopyMemoryIndirectFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCornerSampledImageFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCornerSampledImageFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCoverageReductionModeFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCubicClampFeaturesQCOM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCubicClampFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCubicWeightsFeaturesQCOM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCubicWeightsFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCudaKernelLaunchFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCudaKernelLaunchFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCustomBorderColorFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCustomResolveFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceCustomResolveFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDataGraphFeaturesARM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDataGraphFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDataGraphModelFeaturesQCOM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDataGraphModelFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDepthBiasControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDepthClampControlFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDepthClampControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDepthClampZeroOneFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDepthClampZeroOneFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDepthClampZeroOneFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDepthClipControlFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDepthClipControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDepthClipEnableFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDescriptorBufferFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDescriptorBufferTensorFeaturesARM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDescriptorBufferTensorFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDescriptorHeapFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDescriptorHeapFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDescriptorIndexingFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDescriptorIndexingFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDescriptorIndexingFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDeviceMemoryReportFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDeviceMemoryReportFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDiagnosticsConfigFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDisplacementMicromapFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDisplacementMicromapFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDynamicRenderingFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDynamicRenderingFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingLocalReadFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDynamicRenderingLocalReadFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExclusiveScissorFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceExclusiveScissorFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceExtendedDynamicState3FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceExtendedDynamicStateFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExternalFormatResolveFeaturesANDROID} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceExternalFormatResolveFeaturesANDROID value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceExternalMemoryRDMAFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFaultFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFaultFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFloat16Int8FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFloat16Int8FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFormatPackFeaturesARM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFormatPackFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFragmentDensityMap2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFragmentDensityMapFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFragmentShadingRateFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceFrameBoundaryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceGlobalPriorityQueryFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceGlobalPriorityQueryFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceHdrVividFeaturesHUAWEI} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceHdrVividFeaturesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceHostImageCopyFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceHostImageCopyFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceHostImageCopyFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceHostImageCopyFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceHostQueryResetFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceHostQueryResetFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceHostQueryResetFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceHostQueryResetFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceImage2DViewOf3DFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageAlignmentControlFeaturesMESA} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceImageAlignmentControlFeaturesMESA value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageCompressionControlFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceImageCompressionControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageProcessing2FeaturesQCOM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceImageProcessing2FeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageProcessingFeaturesQCOM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceImageProcessingFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageRobustnessFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceImageRobustnessFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageRobustnessFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceImageRobustnessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageViewMinLodFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceImageViewMinLodFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImagelessFramebufferFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceImagelessFramebufferFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImagelessFramebufferFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceImagelessFramebufferFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceIndexTypeUint8Features} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceIndexTypeUint8Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceIndexTypeUint8FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceIndexTypeUint8FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceIndexTypeUint8FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceInheritedViewportScissorFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceInheritedViewportScissorFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceInlineUniformBlockFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceInlineUniformBlockFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceInlineUniformBlockFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceInvocationMaskFeaturesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceLegacyDitheringFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceLineRasterizationFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceLineRasterizationFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceLineRasterizationFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceLineRasterizationFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceLineRasterizationFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceLineRasterizationFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceLinearColorAttachmentFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance10FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMaintenance10FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance4Features} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMaintenance4Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance4FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMaintenance4FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance5Features} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMaintenance5Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance5FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMaintenance5FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance6Features} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMaintenance6Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance6FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMaintenance6FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance7FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMaintenance7FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance8FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMaintenance8FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance9FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMaintenance9FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMapMemoryPlacedFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMapMemoryPlacedFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMemoryDecompressionFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMemoryDecompressionFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMemoryDecompressionFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMemoryPriorityFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMeshShaderFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMeshShaderFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMeshShaderFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMeshShaderFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMultiDrawFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMultiDrawFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMultiviewFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMultiviewFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMultiviewFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMultiviewFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceNestedCommandBufferFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceNestedCommandBufferFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceOpacityMicromapFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceOpticalFlowFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceOpticalFlowFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePerStageDescriptorSetFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePerStageDescriptorSetFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePerformanceCountersByRegionFeaturesARM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePerformanceCountersByRegionFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePerformanceQueryFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePerformanceQueryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineBinaryFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePipelineBinaryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineCreationCacheControlFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePipelineCreationCacheControlFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineOpacityMicromapFeaturesARM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePipelineOpacityMicromapFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePipelinePropertiesFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineProtectedAccessFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePipelineProtectedAccessFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineProtectedAccessFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePipelineProtectedAccessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineRobustnessFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePipelineRobustnessFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePipelineRobustnessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePortabilitySubsetFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePresentBarrierFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePresentBarrierFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePresentId2FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePresentId2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePresentIdFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePresentIdFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePresentMeteringFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePresentMeteringFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePresentTimingFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePresentTimingFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePresentWait2FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePresentWait2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePresentWaitFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePresentWaitFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePrivateDataFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePrivateDataFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePrivateDataFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePrivateDataFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceProtectedMemoryFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceProtectedMemoryFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceProvokingVertexFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceProvokingVertexFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePushConstantBankFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDevicePushConstantBankFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRawAccessChainsFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRawAccessChainsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayQueryFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRayQueryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRayTracingMotionBlurFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRayTracingPipelineFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayTracingValidationFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRayTracingValidationFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRenderPassStripedFeaturesARM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRenderPassStripedFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRobustness2FeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRobustness2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRobustness2FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceRobustness2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSamplerYcbcrConversionFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceScalarBlockLayoutFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceScalarBlockLayoutFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceScalarBlockLayoutFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceScalarBlockLayoutFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSchedulingControlsFeaturesARM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSchedulingControlsFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShader64BitIndexingFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShader64BitIndexingFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicFloatFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderAtomicFloatFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicInt64Features} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderAtomicInt64Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderAtomicInt64FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderBfloat16FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderBfloat16FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderClockFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderClockFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderDrawParameterFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderDrawParameterFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderDrawParametersFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderDrawParametersFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderEnqueueFeaturesAMDX} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderEnqueueFeaturesAMDX value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderExpectAssumeFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderExpectAssumeFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderExpectAssumeFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderFloat16Int8Features} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderFloat16Int8Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderFloat16Int8FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderFloat16Int8FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderFloat8FeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderFloat8FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderFloatControls2Features} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderFloatControls2Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderFloatControls2FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderFloatControls2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderFmaFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderFmaFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
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
        /** Prepends the specified {@link VkPhysicalDeviceShaderLongVectorFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderLongVectorFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderObjectFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderObjectFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderQuadControlFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderQuadControlFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderSMBuiltinsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupRotateFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderSubgroupRotateFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderTerminateInvocationFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderTerminateInvocationFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderTileImageFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderTileImageFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderUntypedPointersFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShaderUntypedPointersFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShadingRateImageFeaturesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceShadingRateImageFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSubgroupSizeControlFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSubgroupSizeControlFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSubgroupSizeControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSubpassShadingFeaturesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSynchronization2Features} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSynchronization2Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSynchronization2FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceSynchronization2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTensorFeaturesARM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceTensorFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceTextureCompressionASTCHDRFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTileMemoryHeapFeaturesQCOM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceTileMemoryHeapFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceTilePropertiesFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTileShadingFeaturesQCOM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceTileShadingFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTimelineSemaphoreFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceTimelineSemaphoreFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTimelineSemaphoreFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceTimelineSemaphoreFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceTransformFeedbackFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
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
        /** Prepends the specified {@link VkPhysicalDeviceVertexAttributeDivisorFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVertexAttributeDivisorFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVideoDecodeVP9FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVideoDecodeVP9FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVideoEncodeAV1FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVideoEncodeAV1FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVideoMaintenance1FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVideoMaintenance1FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVideoMaintenance2FeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVideoMaintenance2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVulkan11Features} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVulkan11Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVulkan12Features} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVulkan12Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVulkan13Features} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVulkan13Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVulkan14Features} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVulkan14Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVulkanMemoryModelFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVulkanMemoryModelFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceVulkanMemoryModelFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceYcbcrDegammaFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceYcbcrImageArraysFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceYcbcrImageArraysFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Copies the specified {@link VkPhysicalDeviceFeatures} to the {@code features} field. */
        public VkPhysicalDeviceFeatures2.Buffer features(VkPhysicalDeviceFeatures value) { VkPhysicalDeviceFeatures2.nfeatures(address(), value); return this; }
        /** Passes the {@code features} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkPhysicalDeviceFeatures2.Buffer features(java.util.function.Consumer<VkPhysicalDeviceFeatures> consumer) { consumer.accept(features()); return this; }

    }

}